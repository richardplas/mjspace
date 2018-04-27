#!/usr/bin/env bash

if [ -f codesigning.asc.enc ] && [ "${TRAVIS_PULL_REQUEST}" == 'false' ]; then
    openssl aes-256-cbc -K $encrypted_f1fe46eea14b_key -iv $encrypted_f1fe46eea14b_iv -in codesigning.asc.enc -out codesigning.asc -d
    gpg --fast-import codesigning.asc
    if [ -n "${GPG_KEYID}" ]; then gpg --keyring secring.gpg --export-secret-key ${GPG_KEYID} > secring.gpg; fi
fi

export BUILD_SITE_PATH_PREFIX="SPEC/strategy-factor-calculate"






### OSS CI CALL REMOTE CI SCRIPT BEGIN
if [ -z "${LIB_CI_SCRIPT}" ]; then LIB_CI_SCRIPT="http://gitlab.td.internal/home1-oss/oss-build/raw/develop/src/main/ci-script/lib_ci.sh"; fi
echo "eval \$(curl -s -L ${LIB_CI_SCRIPT})"
eval "$(curl -s -L ${LIB_CI_SCRIPT})"
### OSS CI CALL REMOTE CI SCRIPT END
