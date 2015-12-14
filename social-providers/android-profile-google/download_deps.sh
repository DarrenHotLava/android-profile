#!/bin/sh
set -e
DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )
cd $DIR

if [ ! -d libs ];
then
    mkdir libs
fi

if [ ! -d libs/google-play-services_lib ];
then
    curl -L -o libs/google-play-services_lib.zip http://library.soom.la/fetch/android-profile-google-play-services/5.0.89?cf=dl_deps
    unzip libs/google-play-services_lib.zip -d libs/
    rm libs/google-play-services_lib.zip
fi