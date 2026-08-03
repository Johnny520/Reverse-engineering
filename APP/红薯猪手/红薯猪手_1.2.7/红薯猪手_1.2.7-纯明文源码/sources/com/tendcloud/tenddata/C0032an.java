package com.tendcloud.tenddata;

import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: com.tendcloud.tenddata.an */
/* JADX INFO: loaded from: classes.dex */
public final class C0032an {

    /* JADX INFO: renamed from: a */
    private final a f194a;

    /* JADX INFO: renamed from: b */
    private final byte[] f195b;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.an$a */
    public enum a {
        UNIVERSAL_STREAM("application/octet-stream"),
        JSON("application/json"),
        FORM("application/x-www-form-urlencoded"),
        EMPTY("");

        private String name;

        a(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public C0032an(a aVar, byte[] bArr) {
        this.f194a = aVar;
        this.f195b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public void m138a(HttpURLConnection httpURLConnection) {
        OutputStream outputStream;
        httpURLConnection.setFixedLengthStreamingMode(this.f195b.length);
        httpURLConnection.setRequestProperty("Content-Type", this.f194a.getName());
        try {
            outputStream = httpURLConnection.getOutputStream();
        } catch (Throwable unused) {
            outputStream = null;
        }
        try {
            outputStream.write(this.f195b);
        } catch (Throwable unused2) {
            if (outputStream == null) {
                return;
            }
        }
        try {
            outputStream.close();
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m139a() {
        return this.f195b;
    }

    /* JADX INFO: renamed from: b */
    public a m140b() {
        return this.f194a;
    }
}
