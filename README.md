[![MIT License](http://img.shields.io/badge/license-MIT-blue.svg?style=flat)](LICENSE)

# cordova-plugin-osbuildinfo

This plugin defines a global OSBuildInfo object.

```js

window.cordova.OSBuildInfo.getInfo(callback);

function callback(result) {
	console.log(result);
}
```

## Installation

```sh
cordova plugin add https://github.com/PetruMagdeleine/cordova-plugin-osbuildinfo.git
```

## Supported Platforms

* Android [ONLY]

## Properties

Check Android official specs here : https://developer.android.com/reference/android/os/Build.html

- `OSBuildInfo.board`
- `OSBuildInfo.bootloader`
- `OSBuildInfo.brand`
- `OSBuildInfo.device`
- `OSBuildInfo.display`
- `OSBuildInfo.fingerprint`
- `OSBuildInfo.hardware`
- `OSBuildInfo.host`
- `OSBuildInfo.id`
- `OSBuildInfo.manufacturer`
- `OSBuildInfo.model`
- `OSBuildInfo.product`
- `OSBuildInfo.serial`
