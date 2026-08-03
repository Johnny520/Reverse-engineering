package p000;

/* JADX INFO: renamed from: zm */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2809zm {

    /* JADX INFO: renamed from: a */
    public static final C0029Am f9524a = null;

    static {
        C2199lm r0 = AbstractC2242mm.f7921d;
        C2379pm r1 = r0.f7922a;
        boolean r5 = r1.f8373c;
        String r6 = r1.f8374d;
        String r8 = r1.f8376f;
        int r10 = r1.f8378h;
        boolean r9 = r1.f8377g;
        C1517hw r02 = r0.f7923b;
        if (AbstractC0585Nj.m1134a(r6, "    ") == false) goto L7;
        C0029Am r12 = new C0029Am(new C2379pm(true, true, r5, r6, true, r8, r9, r10), r02);
        AbstractC0585Nj.m1134a(r02, AbstractC0671Pj.f2142e);
        f9524a = r12;
        return;
    L7:
        throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
    }
}
