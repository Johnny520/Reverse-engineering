package com.bumptech.glide.signature;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class ApplicationVersionSignature {
    private static final ConcurrentMap<String, Key> PACKAGE_NAME_TO_KEY = new ConcurrentHashMap();
    private static final String TAG = "AppVersionSignature";

    private ApplicationVersionSignature() {
    }

    @InterfaceC6490
    private static PackageInfo getPackageInfo(@InterfaceC6391 Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    @InterfaceC6391
    private static String getVersionCode(@InterfaceC6490 PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @InterfaceC6391
    public static Key obtain(@InterfaceC6391 Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, Key> concurrentMap = PACKAGE_NAME_TO_KEY;
        Key key = concurrentMap.get(packageName);
        if (key != null) {
            return key;
        }
        Key keyObtainVersionSignature = obtainVersionSignature(context);
        Key keyPutIfAbsent = concurrentMap.putIfAbsent(packageName, keyObtainVersionSignature);
        return keyPutIfAbsent == null ? keyObtainVersionSignature : keyPutIfAbsent;
    }

    @InterfaceC6391
    private static Key obtainVersionSignature(@InterfaceC6391 Context context) {
        return new ObjectKey(getVersionCode(getPackageInfo(context)));
    }

    @InterfaceC8392
    public static void reset() {
        PACKAGE_NAME_TO_KEY.clear();
    }
}
