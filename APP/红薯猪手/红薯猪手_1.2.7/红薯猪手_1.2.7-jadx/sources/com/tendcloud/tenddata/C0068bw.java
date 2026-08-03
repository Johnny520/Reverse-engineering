package com.tendcloud.tenddata;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bw */
/* JADX INFO: loaded from: classes.dex */
public class C0068bw implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            try {
                C0105df.m491a().setOAID((String) objArr[1].getClass().getMethod("getOAID", new Class[0]).invoke(objArr[1], new Object[0]));
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            C0105df.m491a().setOAID((String) objArr[0].getClass().getMethod("getOAID", new Class[0]).invoke(objArr[0], new Object[0]));
        }
        try {
            try {
                String str = (String) objArr[1].getClass().getMethod("getVAID", new Class[0]).invoke(objArr[1], new Object[0]);
                C0105df c0105dfM491a = C0105df.m491a();
                if (C0131y.m767b(str)) {
                    str = null;
                }
                c0105dfM491a.setVAID(str);
            } catch (Throwable unused3) {
                String str2 = (String) objArr[0].getClass().getMethod("getVAID", new Class[0]).invoke(objArr[0], new Object[0]);
                C0105df c0105dfM491a2 = C0105df.m491a();
                if (C0131y.m767b(str2)) {
                    str2 = null;
                }
                c0105dfM491a2.setVAID(str2);
            }
        } catch (Throwable unused4) {
        }
        try {
            try {
                String str3 = (String) objArr[1].getClass().getMethod("getAAID", new Class[0]).invoke(objArr[1], new Object[0]);
                C0105df c0105dfM491a3 = C0105df.m491a();
                if (C0131y.m767b(str3)) {
                    str3 = null;
                }
                c0105dfM491a3.setAAID(str3);
            } catch (Throwable unused5) {
                String str4 = (String) objArr[0].getClass().getMethod("getAAID", new Class[0]).invoke(objArr[0], new Object[0]);
                C0105df c0105dfM491a4 = C0105df.m491a();
                if (C0131y.m767b(str4)) {
                    str4 = null;
                }
                c0105dfM491a4.setAAID(str4);
            }
        } catch (Throwable unused6) {
        }
        C0054bi.f290a.countDown();
        return null;
    }
}
