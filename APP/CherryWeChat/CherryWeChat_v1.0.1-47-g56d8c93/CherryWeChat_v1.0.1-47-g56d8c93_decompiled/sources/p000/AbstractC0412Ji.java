package p000;

/* JADX INFO: renamed from: Ji */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0412Ji {

    /* JADX INFO: renamed from: a */
    public static final C0369Ii f1381a = C0369Ii.f1284a;

    /* JADX INFO: renamed from: a */
    public static C0369Ii m854a(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        while (abstractComponentCallbacksC1503hi != null) {
            if (abstractComponentCallbacksC1503hi.m2875i()) {
                abstractComponentCallbacksC1503hi.m2872f();
            }
            abstractComponentCallbacksC1503hi = abstractComponentCallbacksC1503hi.f5330u;
        }
        return f1381a;
    }

    /* JADX INFO: renamed from: b */
    public static void m855b(C0240Fi c0240Fi) {
        if (AbstractC2805zi.m5374G(3)) {
            c0240Fi.f795a.getClass();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m856c(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, String str) {
        m855b(new C0240Fi(abstractComponentCallbacksC1503hi, "Attempting to reuse fragment " + abstractComponentCallbacksC1503hi + " with previous ID " + str));
        m854a(abstractComponentCallbacksC1503hi).getClass();
    }
}
