package com.example.cordova.info;

import org.apache.cordova.CordovaWebView;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;

public class OSBuildInfo extends CordovaPlugin {

  public static String board        = android.os.Build.BOARD;
  public static String bootloader   = android.os.Build.BOOTLOADER;
  public static String brand        = android.os.Build.BRAND;
  public static String device       = android.os.Build.DEVICE;
  public static String display      = android.os.Build.DISPLAY;
  public static String fingerprint  = android.os.Build.FINGERPRINT;
  public static String hardware     = android.os.Build.HARDWARE;
  public static String host         = android.os.Build.HOST;
  public static String id           = android.os.Build.ID;
  public static String manufacturer = android.os.Build.MANUFACTURER;
  public static String model        = android.os.Build.MODEL;
  public static String product      = android.os.Build.PRODUCT;
  public static String serial       = android.os.Build.SERIAL;

  public JSONObject OSBuildInfo;

  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

    OSBuildInfo = new JSONObject();

    OSBuildInfo.put("board", board);
    OSBuildInfo.put("bootloader", bootloader);
    OSBuildInfo.put("brand", brand);
    OSBuildInfo.put("device", device);
    OSBuildInfo.put("display", display);
    OSBuildInfo.put("fingerprint", fingerprint);
    OSBuildInfo.put("hardware", hardware);
    OSBuildInfo.put("host", host);
    OSBuildInfo.put("id", id);
    OSBuildInfo.put("manufacturer", manufacturer);
    OSBuildInfo.put("model", model);
    OSBuildInfo.put("product", product);
    OSBuildInfo.put("serial", serial);

    callbackContext.success(OSBuildInfo);
    return true;
  }
}
