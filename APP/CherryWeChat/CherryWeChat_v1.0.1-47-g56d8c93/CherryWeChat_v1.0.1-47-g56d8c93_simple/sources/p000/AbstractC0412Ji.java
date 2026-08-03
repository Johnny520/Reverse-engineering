package p000;

/* JADX INFO: renamed from: Ji */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0412Ji {

    /* JADX INFO: renamed from: a */
    public static final C0369Ii f1381a = null;

    static {
        f1381a = C0369Ii.f1284a;
    }

    /* JADX INFO: renamed from: a */
    public static C0369Ii m854a(AbstractComponentCallbacksC1503hi r1) {
    L2:
        if (r1 == null) goto L8;
        if (r1.m2875i() == false) goto L6;
        r1.m2872f();
    L6:
        r1 = r1.f5330u;
        goto L2
    L8:
        return f1381a;
    }

    /* JADX INFO: renamed from: b */
    public static void m855b(C0240Fi r1) {
        if (AbstractC2805zi.m5374G(3) == false) goto L6;
        r1.f795a.getClass();
        return;
    }

    /* JADX INFO: renamed from: c */
    public static final void m856c(AbstractComponentCallbacksC1503hi r3, String r4) {
        m855b(new C0240Fi(r3, "Attempting to reuse fragment " + r3 + " with previous ID " + r4));
        m854a(r3).getClass();
    }
}
