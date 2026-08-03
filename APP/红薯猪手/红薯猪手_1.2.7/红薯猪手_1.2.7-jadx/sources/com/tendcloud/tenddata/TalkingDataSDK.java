package com.tendcloud.tenddata;

import android.app.Activity;
import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class TalkingDataSDK {
    public static final int ANALYTICS_INTELLIGENT_DISABLE = 2;
    public static final int ANTI_CHEATING_DISABLE = 8;
    public static final int DEVICE_IDENTIFICATION_DISABLE = 4;
    public static final int PRECISE_AREA_DISABLE = 1;

    /* JADX INFO: renamed from: a */
    private static long f53a;

    /* JADX INFO: renamed from: b */
    private static String f54b;

    /* JADX INFO: renamed from: c */
    private static String f55c;

    /* JADX INFO: renamed from: d */
    private static String f56d;

    public static synchronized String getDeviceId(Context context) {
        return C0021ac.m91d(context, AbstractC0018a.UNIVERSAL);
    }

    public static int getNFCStatus(Context context) {
        return C0021ac.m74b(context);
    }

    public static synchronized String getOAID(Context context) {
        return C0021ac.m94e(context, AbstractC0018a.UNIVERSAL);
    }

    public static synchronized void getShortUrl(Map<String, Object> map, TDGenerateUrl tDGenerateUrl) {
        C0021ac.m71a(map, tDGenerateUrl, AbstractC0018a.UNIVERSAL);
    }

    public static void initSDK(Context context, String str, String str2, String str3) {
        f53a = System.currentTimeMillis();
        f54b = str;
        f55c = str2;
        f56d = str3;
        C0131y.m767b(str);
    }

    public static void onCreateCard(String str, String str2, String str3) {
        C0021ac.m69a(str, str2, str3, AbstractC0018a.UNIVERSAL);
    }

    public static void onError(Context context, Throwable th) {
        C0021ac.m43a(context, th, AbstractC0018a.UNIVERSAL);
    }

    @Deprecated
    public static void onEvent(Context context, String str, double d, Map<String, Object> map) {
        onEvent(context, str, map);
    }

    public static void onEvent(Context context, String str, Map<String, Object> map) {
        C0021ac.m41a(context, str, map, AbstractC0018a.UNIVERSAL);
    }

    public static void onEvent(Context context, String str, Map<String, Object> map, Map<String, Object> map2) {
        C0021ac.m42a(context, str, map, map2, AbstractC0018a.UNIVERSAL);
    }

    public static void onFavorite(String str, String str2) {
        C0021ac.m84b(str, str2, AbstractC0018a.UNIVERSAL);
    }

    public static void onFavorite(String str, String str2, Map<String, Object> map) {
        C0021ac.m70a(str, str2, map, AbstractC0018a.UNIVERSAL);
    }

    public static void onLogin(String str, TalkingDataProfile talkingDataProfile) {
        C0021ac.m55a(str, talkingDataProfile, AbstractC0018a.UNIVERSAL);
    }

    public static void onLogin(String str, TalkingDataProfile talkingDataProfile, Map<String, Object> map) {
        C0021ac.m58a(str, talkingDataProfile, map, AbstractC0018a.UNIVERSAL);
    }

    public static void onPageBegin(Context context, String str) {
        C0021ac.m35a(context, str, AbstractC0018a.UNIVERSAL);
    }

    public static void onPageEnd(Context context, String str) {
        C0021ac.m78b(context, str, AbstractC0018a.UNIVERSAL);
    }

    @Deprecated
    public static void onPause(Activity activity) {
        C0021ac.m77b(activity, AbstractC0018a.UNIVERSAL);
    }

    public static void onProfileUpdate(TalkingDataProfile talkingDataProfile) {
        C0021ac.m48a(talkingDataProfile, AbstractC0018a.UNIVERSAL);
    }

    public static void onPunch(String str, String str2) {
        C0021ac.m93d(str, str2, AbstractC0018a.UNIVERSAL);
    }

    public static void onReceiveDeepLink(String str) {
        C0021ac.m92d(str, AbstractC0018a.UNIVERSAL);
    }

    public static void onRegister(String str, TalkingDataProfile talkingDataProfile, String str2) {
        C0021ac.m56a(str, talkingDataProfile, str2, AbstractC0018a.UNIVERSAL);
    }

    public static void onRegister(String str, TalkingDataProfile talkingDataProfile, String str2, Map<String, Object> map) {
        C0021ac.m57a(str, talkingDataProfile, str2, map, AbstractC0018a.UNIVERSAL);
    }

    @Deprecated
    public static void onResume(Activity activity) {
        C0021ac.m31a(activity, AbstractC0018a.UNIVERSAL);
    }

    public static void onSearch(TalkingDataSearch talkingDataSearch) {
        C0021ac.m49a(talkingDataSearch, AbstractC0018a.UNIVERSAL);
    }

    public static void onShare(String str, String str2) {
        C0021ac.m90c(str, str2, AbstractC0018a.UNIVERSAL);
    }

    public static void onShare(String str, String str2, Map<String, Object> map) {
        C0021ac.m85b(str, str2, map, AbstractC0018a.UNIVERSAL);
    }

    public static void removeGlobalKV(String str) {
        C0021ac.m59a(str, AbstractC0018a.UNIVERSAL);
    }

    public static void setConfig(TalkingDataSDKConfig talkingDataSDKConfig) {
        C0021ac.setConfig(talkingDataSDKConfig);
    }

    public static synchronized void setConfigurationDisable(int i) {
        C0021ac.setConfigurationDisable(i);
    }

    public static synchronized void setCustomDataSwitch(TalkingDataSharingFilter talkingDataSharingFilter) {
        C0021ac.m50a(talkingDataSharingFilter, AbstractC0018a.UNIVERSAL);
    }

    public static void setGlobalKV(String str, Object obj) {
        C0021ac.m61a(str, obj, AbstractC0018a.UNIVERSAL);
    }

    public static void setReportUncaughtExceptions(boolean z) {
        C0021ac.m72a(z, AbstractC0018a.UNIVERSAL);
    }

    public static void setVerboseLogDisable() {
        C0021ac.m87c();
    }

    public static void startA(Context context) {
        if (f53a < 1) {
            return;
        }
        C0021ac.m37a(context, f54b, f55c, f56d, AbstractC0018a.UNIVERSAL);
    }

    public static void startA(Context context, String str, String str2, String str3, Map<String, Object> map) {
        C0021ac.m37a(context, str, str2, str3, AbstractC0018a.UNIVERSAL);
    }
}
