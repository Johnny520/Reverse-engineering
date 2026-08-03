package p000;

/* JADX INFO: renamed from: mm */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2242mm {

    /* JADX INFO: renamed from: d */
    public static final C2199lm f7921d = new C2199lm(new C2379pm(false, false, true, "    ", false, "type", true, 3), AbstractC0671Pj.f2142e);

    /* JADX INFO: renamed from: a */
    public final C2379pm f7922a;

    /* JADX INFO: renamed from: b */
    public final C1517hw f7923b;

    /* JADX INFO: renamed from: c */
    public final C0132D2 f7924c = new C0132D2(16);

    public AbstractC2242mm(C2379pm c2379pm, C1517hw c1517hw) {
        this.f7922a = c2379pm;
        this.f7923b = c1517hw;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4550a(InterfaceC0717Qm interfaceC0717Qm, String str) {
        C2341oz c2341oz = new C2341oz(str);
        Object objMo845h = new C2169kz(this, 1, c2341oz, interfaceC0717Qm.getDescriptor()).mo845h(interfaceC0717Qm);
        if (c2341oz.m4755e() == 10) {
            return objMo845h;
        }
        C2341oz.m4750m(c2341oz, "Expected EOF after parsing, but had " + str.charAt(c2341oz.f8216a - 1) + " instead", 0, 6);
        throw null;
    }
}
