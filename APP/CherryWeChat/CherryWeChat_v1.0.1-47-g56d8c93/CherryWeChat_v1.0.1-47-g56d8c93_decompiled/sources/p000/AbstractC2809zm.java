package p000;

/* JADX INFO: renamed from: zm */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2809zm {

    /* JADX INFO: renamed from: a */
    public static final C0029Am f9524a;

    static {
        C2199lm c2199lm = AbstractC2242mm.f7921d;
        C2379pm c2379pm = c2199lm.f7922a;
        boolean z = c2379pm.f8373c;
        String str = c2379pm.f8374d;
        String str2 = c2379pm.f8376f;
        int i = c2379pm.f8378h;
        boolean z2 = c2379pm.f8377g;
        C1517hw c1517hw = c2199lm.f7923b;
        if (!AbstractC0585Nj.m1134a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        C0029Am c0029Am = new C0029Am(new C2379pm(true, true, z, str, true, str2, z2, i), c1517hw);
        AbstractC0585Nj.m1134a(c1517hw, AbstractC0671Pj.f2142e);
        f9524a = c0029Am;
    }
}
