package p089g1;

import p069f.AbstractC0944l;
import p069f.C0965w;

/* JADX INFO: renamed from: g1.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1280i {

    /* JADX INFO: renamed from: a */
    public static final C0965w f4268a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1289r c1289r = C1276e.f4240e;
        int i9 = c1289r.f4233c;
        C1277f c1277f = new C1277f(c1289r, c1289r, 1);
        int i10 = c1289r.f4233c;
        C1284m c1284m = C1276e.f4259x;
        int i11 = (c1284m.f4233c << 6) | i10;
        C1279h c1279h = new C1279h(c1289r, c1284m, 0);
        int i12 = (i10 << 6) | c1284m.f4233c;
        C1279h c1279h2 = new C1279h(c1284m, c1289r, 0);
        C0965w c0965w = AbstractC0944l.f2974a;
        C0965w c0965w2 = new C0965w();
        c0965w2.m2379h(i9 | (i9 << 6), c1277f);
        c0965w2.m2379h(i11, c1279h);
        c0965w2.m2379h(i12, c1279h2);
        f4268a = c0965w2;
    }
}
