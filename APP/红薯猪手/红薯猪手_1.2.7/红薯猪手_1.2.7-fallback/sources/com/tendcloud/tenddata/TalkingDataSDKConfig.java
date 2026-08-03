package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataSDKConfig {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;

    public TalkingDataSDKConfig() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.a = r0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            return
    }

    public int getRules() {
            r6 = this;
            boolean r0 = r6.a
            boolean r1 = r6.b
            r2 = 0
            if (r1 == 0) goto L9
            r1 = 2
            goto La
        L9:
            r1 = r2
        La:
            boolean r3 = r6.c
            if (r3 == 0) goto L10
            r3 = 4
            goto L11
        L10:
            r3 = r2
        L11:
            boolean r4 = r6.d
            if (r4 == 0) goto L18
            r4 = 8
            goto L19
        L18:
            r4 = r2
        L19:
            boolean r5 = r6.e
            if (r5 == 0) goto L1f
            r2 = 16
        L1f:
            r2 = r2 | r4
            r2 = r2 | r3
            r1 = r1 | r2
            r0 = r0 | r1
            return r0
    }

    public boolean isAppListEnabled() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    public boolean isIMEIAndMEIDEnabled() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public boolean isLocationEnabled() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public boolean isMACEnabled() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public boolean isWiFiEnable() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public com.tendcloud.tenddata.TalkingDataSDKConfig setAppListEnabled(boolean r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public com.tendcloud.tenddata.TalkingDataSDKConfig setIMEIAndMEIDEnabled(boolean r1) {
            r0 = this;
            r0.b = r1
            return r0
    }

    public com.tendcloud.tenddata.TalkingDataSDKConfig setLocationEnabled(boolean r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    public com.tendcloud.tenddata.TalkingDataSDKConfig setMACEnabled(boolean r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public com.tendcloud.tenddata.TalkingDataSDKConfig setWifiEnabled(boolean r1) {
            r0 = this;
            r0.e = r1
            return r0
    }
}
