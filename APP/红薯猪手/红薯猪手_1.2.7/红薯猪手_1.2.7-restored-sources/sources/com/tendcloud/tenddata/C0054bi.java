package com.tendcloud.tenddata;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bi */
/* JADX INFO: loaded from: classes.dex */
public final class C0054bi {

    /* JADX INFO: renamed from: a */
    public static CountDownLatch f290a = new CountDownLatch(1);

    /* JADX INFO: renamed from: com.tendcloud.tenddata.bi$a */
    public static class a {
        private static C0054bi instance = new C0054bi();

        private a() {
        }
    }

    private C0054bi() {
        m321a(C0020ab.f132g);
    }

    /* JADX INFO: renamed from: a */
    public static C0054bi m320a() {
        return a.instance;
    }

    /* JADX INFO: renamed from: a */
    private void m321a(final Context context) {
        if (context == null) {
            return;
        }
        try {
            C0129w.f620a.execute(new Runnable() { // from class: com.tendcloud.tenddata.bi.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C0078cf.m407a()) {
                            C0078cf.reflectMSA(context);
                            try {
                                C0054bi.f290a.await(2L, TimeUnit.SECONDS);
                                if (!C0131y.m767b(C0105df.m491a().m492c())) {
                                    return;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        if (C0085cm.m425a()) {
                            C0085cm.reflectMiUi(context);
                            return;
                        }
                        if (C0074cb.m400a(context)) {
                            C0074cb.bindHonorServiceGetOAID(context);
                            return;
                        }
                        if (C0073ca.m394a(context)) {
                            C0073ca.bindHWServiceGetOAID(context);
                            return;
                        }
                        if (C0083ck.m420a(context)) {
                            C0083ck.bindSECServiceGetOAID(context);
                            return;
                        }
                        if (C0082cj.m417a(context)) {
                            C0082cj.bindOPPOServiceGetOAID(context);
                            return;
                        }
                        if (C0081ci.m413a(context)) {
                            C0081ci.bindONEPLUSServiceGetOAID(context);
                            return;
                        }
                        if (C0084cl.m424a()) {
                            C0084cl.reflectVIVO(context);
                            return;
                        }
                        if (C0071bz.m386a(context)) {
                            C0071bz.bindASUSServiceGetOAID(context);
                            return;
                        }
                        if (C0077ce.m406a(context)) {
                            C0077ce.reflectMEiZU(context);
                            return;
                        }
                        if (C0086cn.m428a(context)) {
                            C0086cn.bindZTEServiceGetOAID(context);
                        } else if (C0076cd.m404a(context)) {
                            C0076cd.bindLENOVOServiceGetOAID(context);
                        } else if (C0079cg.m408a(context)) {
                            C0079cg.reflectNUBIA(context);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
