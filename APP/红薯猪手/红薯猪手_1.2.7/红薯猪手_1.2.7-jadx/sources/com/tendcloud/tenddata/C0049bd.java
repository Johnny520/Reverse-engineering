package com.tendcloud.tenddata;

import java.util.Map;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bd */
/* JADX INFO: loaded from: classes.dex */
public class C0049bd {

    /* JADX INFO: renamed from: a */
    private static volatile C0049bd f257a;

    static {
        try {
            C0132z.m785a().register(m282a());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0049bd m282a() {
        if (f257a == null) {
            synchronized (C0049bd.class) {
                if (f257a == null) {
                    f257a = new C0049bd();
                }
            }
        }
        return f257a;
    }

    /* JADX INFO: renamed from: b */
    public void m283b() {
        try {
            C0129w.f620a.execute(new Runnable() { // from class: com.tendcloud.tenddata.bd.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Map<String, Object> mapM664C = C0122o.m664C(C0020ab.f132g);
                        if (mapM664C != null) {
                            C0067bv c0067bv = new C0067bv();
                            c0067bv.f353b = "env";
                            c0067bv.f354c = "arp";
                            c0067bv.f355d = mapM664C;
                            c0067bv.f352a = AbstractC0018a.ENV;
                            C0132z.m785a().post(c0067bv);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventCommonEnvironment(C0065bt c0065bt) {
        try {
            if (c0065bt.f346a != 3) {
                return;
            }
            m283b();
        } catch (Throwable unused) {
        }
    }
}
