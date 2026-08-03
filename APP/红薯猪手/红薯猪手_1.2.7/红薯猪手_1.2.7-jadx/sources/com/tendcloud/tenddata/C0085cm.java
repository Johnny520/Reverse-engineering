package com.tendcloud.tenddata;

import android.content.Context;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cm */
/* JADX INFO: loaded from: classes.dex */
public final class C0085cm {
    /* JADX INFO: renamed from: a */
    public static boolean m425a() {
        try {
            if (!C0069bx.m373a()) {
                return false;
            }
            Class.forName("com.android.id.impl.IdProviderImpl");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void reflectMiUi(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            Object objNewInstance = cls.newInstance();
            try {
                C0105df.m491a().setUDID((String) cls.getMethod("getUDID", Context.class).invoke(objNewInstance, context));
            } catch (Throwable unused) {
            }
            try {
                C0105df.m491a().setOAID((String) cls.getMethod("getOAID", Context.class).invoke(objNewInstance, context));
            } catch (Throwable unused2) {
            }
            try {
                C0105df.m491a().setVAID((String) cls.getMethod("getVAID", Context.class).invoke(objNewInstance, context));
            } catch (Throwable unused3) {
            }
            C0105df.m491a().setAAID((String) cls.getMethod("getAAID", Context.class).invoke(objNewInstance, context));
        } catch (Throwable unused4) {
        }
    }
}
