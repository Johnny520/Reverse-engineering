package com.tendcloud.tenddata;

import android.util.EventLogTags;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: renamed from: com.tendcloud.tenddata.as */
/* JADX INFO: loaded from: classes.dex */
public final class C0037as {

    /* JADX INFO: renamed from: a */
    private static byte[] f205a = new byte[0];

    /* JADX INFO: renamed from: b */
    private static volatile int f206b;

    /* JADX INFO: renamed from: c */
    private static volatile IvParameterSpec f207c;

    /* JADX INFO: renamed from: d */
    private static volatile byte[] f208d;

    /* JADX INFO: renamed from: e */
    private static volatile SecretKey f209e;

    static {
        synchronized (EventLogTags.class) {
            try {
                if (f206b == 0) {
                    f206b = C0041aw.m239a();
                }
                if (f207c == null) {
                    f207c = C0039au.m223a();
                }
                if (f208d == null) {
                    f208d = C0039au.m226b();
                }
                if (f209e == null) {
                    f209e = C0039au.m222a(String.valueOf(f206b).toCharArray(), f208d);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private C0037as() {
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m215a(byte[] bArr) {
        try {
            return C0039au.m225a(bArr, f209e, f207c);
        } catch (Throwable unused) {
            return f205a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m216b(byte[] bArr) {
        try {
            return C0039au.m227b(bArr, f209e, f207c);
        } catch (Throwable unused) {
            return f205a;
        }
    }
}
