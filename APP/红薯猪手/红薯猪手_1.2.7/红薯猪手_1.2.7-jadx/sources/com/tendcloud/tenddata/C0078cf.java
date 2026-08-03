package com.tendcloud.tenddata;

import android.content.Context;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cf */
/* JADX INFO: loaded from: classes.dex */
public final class C0078cf {
    /* JADX INFO: renamed from: a */
    public static boolean m407a() {
        try {
            Class.forName("com.bun.miitmdid.core.MdidSdkHelper");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void reflectMSA(Context context) {
        Class<?> cls;
        try {
            Class<?> cls2 = Class.forName("com.bun.miitmdid.core.MdidSdkHelper");
            try {
                cls = Class.forName("com.bun.miitmdid.interfaces.IIdentifierListener");
            } catch (Throwable unused) {
                cls = Class.forName("com.bun.supplier.IIdentifierListener");
            }
            cls2.getMethod("InitSdk", Context.class, Boolean.TYPE, cls).invoke(null, context, Boolean.TRUE, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0068bw()));
        } catch (Throwable unused2) {
            C0054bi.f290a.countDown();
        }
    }
}
