package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class TalkingDataSDK {
    public static final int ANALYTICS_INTELLIGENT_DISABLE = 2;
    public static final int ANTI_CHEATING_DISABLE = 8;
    public static final int DEVICE_IDENTIFICATION_DISABLE = 4;
    public static final int PRECISE_AREA_DISABLE = 1;
    private static long a;
    private static java.lang.String b;
    private static java.lang.String c;
    private static java.lang.String d;

    public TalkingDataSDK() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized java.lang.String getDeviceId(android.content.Context r2) {
            java.lang.Class<com.tendcloud.tenddata.TalkingDataSDK> r0 = com.tendcloud.tenddata.TalkingDataSDK.class
            monitor-enter(r0)
            com.tendcloud.tenddata.a r1 = com.tendcloud.tenddata.a.UNIVERSAL     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = com.tendcloud.tenddata.ac.d(r2, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static int getNFCStatus(android.content.Context r0) {
            int r0 = com.tendcloud.tenddata.ac.b(r0)
            return r0
    }

    public static synchronized java.lang.String getOAID(android.content.Context r2) {
            java.lang.Class<com.tendcloud.tenddata.TalkingDataSDK> r0 = com.tendcloud.tenddata.TalkingDataSDK.class
            monitor-enter(r0)
            com.tendcloud.tenddata.a r1 = com.tendcloud.tenddata.a.UNIVERSAL     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = com.tendcloud.tenddata.ac.e(r2, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static synchronized void getShortUrl(java.util.Map<java.lang.String, java.lang.Object> r2, com.tendcloud.tenddata.TDGenerateUrl r3) {
            java.lang.Class<com.tendcloud.tenddata.TalkingDataSDK> r0 = com.tendcloud.tenddata.TalkingDataSDK.class
            monitor-enter(r0)
            com.tendcloud.tenddata.a r1 = com.tendcloud.tenddata.a.UNIVERSAL     // Catch: java.lang.Throwable -> La
            com.tendcloud.tenddata.ac.a(r2, r3, r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static void initSDK(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            long r0 = java.lang.System.currentTimeMillis()
            com.tendcloud.tenddata.TalkingDataSDK.a = r0
            com.tendcloud.tenddata.TalkingDataSDK.b = r3
            com.tendcloud.tenddata.TalkingDataSDK.c = r4
            com.tendcloud.tenddata.TalkingDataSDK.d = r5
            com.tendcloud.tenddata.y.b(r3)
            return
    }

    public static void onCreateCard(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r2, r3, r0)
            return
    }

    public static void onError(android.content.Context r1, java.lang.Throwable r2) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r2, r0)
            return
    }

    @java.lang.Deprecated
    public static void onEvent(android.content.Context r0, java.lang.String r1, double r2, java.util.Map<java.lang.String, java.lang.Object> r4) {
            onEvent(r0, r1, r4)
            return
    }

    public static void onEvent(android.content.Context r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r2, r3, r0)
            return
    }

    public static void onEvent(android.content.Context r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.Object> r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r2, r3, r4, r0)
            return
    }

    public static void onFavorite(java.lang.String r1, java.lang.String r2) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.b(r1, r2, r0)
            return
    }

    public static void onFavorite(java.lang.String r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r2, r3, r0)
            return
    }

    public static void onLogin(java.lang.String r1, com.tendcloud.tenddata.TalkingDataProfile r2) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r2, r0)
            return
    }

    public static void onLogin(java.lang.String r1, com.tendcloud.tenddata.TalkingDataProfile r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r2, r3, r0)
            return
    }

    public static void onPageBegin(android.content.Context r1, java.lang.String r2) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r2, r0)
            return
    }

    public static void onPageEnd(android.content.Context r1, java.lang.String r2) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.b(r1, r2, r0)
            return
    }

    @java.lang.Deprecated
    public static void onPause(android.app.Activity r1) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.b(r1, r0)
            return
    }

    public static void onProfileUpdate(com.tendcloud.tenddata.TalkingDataProfile r1) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r0)
            return
    }

    public static void onPunch(java.lang.String r1, java.lang.String r2) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.d(r1, r2, r0)
            return
    }

    public static void onReceiveDeepLink(java.lang.String r1) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.d(r1, r0)
            return
    }

    public static void onRegister(java.lang.String r1, com.tendcloud.tenddata.TalkingDataProfile r2, java.lang.String r3) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r2, r3, r0)
            return
    }

    public static void onRegister(java.lang.String r1, com.tendcloud.tenddata.TalkingDataProfile r2, java.lang.String r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r2, r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public static void onResume(android.app.Activity r1) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r0)
            return
    }

    public static void onSearch(com.tendcloud.tenddata.TalkingDataSearch r1) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r0)
            return
    }

    public static void onShare(java.lang.String r1, java.lang.String r2) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.c(r1, r2, r0)
            return
    }

    public static void onShare(java.lang.String r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.b(r1, r2, r3, r0)
            return
    }

    public static void removeGlobalKV(java.lang.String r1) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r0)
            return
    }

    public static void setConfig(com.tendcloud.tenddata.TalkingDataSDKConfig r0) {
            com.tendcloud.tenddata.ac.setConfig(r0)
            return
    }

    public static synchronized void setConfigurationDisable(int r1) {
            java.lang.Class<com.tendcloud.tenddata.TalkingDataSDK> r0 = com.tendcloud.tenddata.TalkingDataSDK.class
            monitor-enter(r0)
            com.tendcloud.tenddata.ac.setConfigurationDisable(r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static synchronized void setCustomDataSwitch(com.tendcloud.tenddata.TalkingDataSharingFilter r2) {
            java.lang.Class<com.tendcloud.tenddata.TalkingDataSDK> r0 = com.tendcloud.tenddata.TalkingDataSDK.class
            monitor-enter(r0)
            com.tendcloud.tenddata.a r1 = com.tendcloud.tenddata.a.UNIVERSAL     // Catch: java.lang.Throwable -> La
            com.tendcloud.tenddata.ac.a(r2, r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static void setGlobalKV(java.lang.String r1, java.lang.Object r2) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r2, r0)
            return
    }

    public static void setReportUncaughtExceptions(boolean r1) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r1, r0)
            return
    }

    public static void setVerboseLogDisable() {
            com.tendcloud.tenddata.ac.c()
            return
    }

    public static void startA(android.content.Context r4) {
            long r0 = com.tendcloud.tenddata.TalkingDataSDK.a
            r2 = 1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L9
            return
        L9:
            java.lang.String r0 = com.tendcloud.tenddata.TalkingDataSDK.b
            java.lang.String r1 = com.tendcloud.tenddata.TalkingDataSDK.c
            java.lang.String r2 = com.tendcloud.tenddata.TalkingDataSDK.d
            com.tendcloud.tenddata.a r3 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r4, r0, r1, r2, r3)
            return
    }

    public static void startA(android.content.Context r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            com.tendcloud.tenddata.a r4 = com.tendcloud.tenddata.a.UNIVERSAL
            com.tendcloud.tenddata.ac.a(r0, r1, r2, r3, r4)
            return
    }
}
