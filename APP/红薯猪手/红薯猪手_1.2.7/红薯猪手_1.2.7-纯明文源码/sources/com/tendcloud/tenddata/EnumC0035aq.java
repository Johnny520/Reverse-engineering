package com.tendcloud.tenddata;

import java.net.HttpURLConnection;

/* JADX INFO: renamed from: com.tendcloud.tenddata.aq */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0035aq {
    GET(false),
    POST(true);


    /* JADX INFO: renamed from: c */
    private final boolean f200c;

    EnumC0035aq(boolean z) {
        this.f200c = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m205a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.setRequestMethod(name());
            httpURLConnection.setDoOutput(this.f200c);
            httpURLConnection.setDoInput(true);
        } catch (Throwable unused) {
        }
    }
}
