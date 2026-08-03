package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataSDKConfig {

    /* JADX INFO: renamed from: a */
    private boolean f57a = true;

    /* JADX INFO: renamed from: b */
    private boolean f58b = true;

    /* JADX INFO: renamed from: c */
    private boolean f59c = true;

    /* JADX INFO: renamed from: d */
    private boolean f60d = true;

    /* JADX INFO: renamed from: e */
    private boolean f61e = true;

    public int getRules() {
        boolean z = this.f57a;
        int i = this.f58b ? 2 : 0;
        int i2 = this.f59c ? 4 : 0;
        int i3 = this.f60d ? 8 : 0;
        return (z ? 1 : 0) | i | (this.f61e ? 16 : 0) | i3 | i2;
    }

    public boolean isAppListEnabled() {
        return this.f59c;
    }

    public boolean isIMEIAndMEIDEnabled() {
        return this.f58b;
    }

    public boolean isLocationEnabled() {
        return this.f60d;
    }

    public boolean isMACEnabled() {
        return this.f57a;
    }

    public boolean isWiFiEnable() {
        return this.f61e;
    }

    public TalkingDataSDKConfig setAppListEnabled(boolean z) {
        this.f59c = z;
        return this;
    }

    public TalkingDataSDKConfig setIMEIAndMEIDEnabled(boolean z) {
        this.f58b = z;
        return this;
    }

    public TalkingDataSDKConfig setLocationEnabled(boolean z) {
        this.f60d = z;
        return this;
    }

    public TalkingDataSDKConfig setMACEnabled(boolean z) {
        this.f57a = z;
        return this;
    }

    public TalkingDataSDKConfig setWifiEnabled(boolean z) {
        this.f61e = z;
        return this;
    }
}
