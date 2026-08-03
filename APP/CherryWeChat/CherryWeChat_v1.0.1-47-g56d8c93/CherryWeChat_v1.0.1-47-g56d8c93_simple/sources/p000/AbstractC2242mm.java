package p000;

/* JADX INFO: renamed from: mm */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2242mm {

    /* JADX INFO: renamed from: d */
    public static final C2199lm f7921d = null;

    /* JADX INFO: renamed from: a */
    public final C2379pm f7922a;

    /* JADX INFO: renamed from: b */
    public final C1517hw f7923b;

    /* JADX INFO: renamed from: c */
    public final C0132D2 f7924c;

    static {
        f7921d = new C2199lm(new C2379pm(false, false, true, "    ", false, "type", true, 3), AbstractC0671Pj.f2142e);
    }

    public AbstractC2242mm(C2379pm r1, C1517hw r2) {
        this.f7922a = r1;
        this.f7923b = r2;
        this.f7924c = new C0132D2(16);
    }

    /* JADX INFO: renamed from: a */
    public final Object m4550a(InterfaceC0717Qm r5, String r6) {
        C2341oz r0 = new C2341oz(r6);
        Object r52 = new C2169kz(this, 1, r0, r5.getDescriptor()).mo845h(r5);
        if (r0.m4755e() != 10) goto L5;
        return r52;
    L5:
        C2341oz.m4750m(r0, "Expected EOF after parsing, but had " + r6.charAt(r0.f8216a - 1) + " instead", 0, 6);
        throw null;
    }
}
