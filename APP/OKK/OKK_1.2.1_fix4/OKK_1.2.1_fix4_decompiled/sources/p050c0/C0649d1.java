package p050c0;

import de.robv.android.xposed.AbstractC0762d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0040p;
import p007D0.C0140f;

/* JADX INFO: renamed from: c0.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0649d1 {

    /* JADX INFO: renamed from: a */
    public static final C0649d1 f2016a = new C0649d1();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2017b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicInteger f2018c = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public static boolean m1630a() {
        Object objM116u;
        try {
            C0661h1 c0661h1 = C0661h1.f2048a;
            objM116u = Boolean.valueOf(C0661h1.m1661c("remove_moments_ads", false));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static void m1631b(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-MomentsAd] " + str);
        } catch (Throwable unused) {
        }
    }
}
