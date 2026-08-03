package p163l4;

import p104h4.C1607u;
import p311v4.C4453d0;
import p311v4.C4477z;
import p326w4.C4681a;
import p326w4.C4683c;

/* JADX INFO: renamed from: l4.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2477f extends AbstractC2476e implements InterfaceC2473b {

    /* JADX INFO: renamed from: e */
    public final C4681a f8111e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2477f(C4453d0 c4453d0, int i9, C4477z c4477z, C1607u c1607u) {
        super(c4453d0, i9, c4477z, c1607u);
        String str = c4477z.f14828h.f14760g;
        C4683c c4683c = c4453d0.f14784g;
        boolean z9 = (i9 & 8) != 0;
        boolean zEquals = c4477z.f14827g.f14760g.equals("<init>");
        C4681a c4681aM9174d = C4681a.m9174d(str);
        if (!z9) {
            c4681aM9174d = c4681aM9174d.m9177e(zEquals ? c4683c.m9186d(Integer.MAX_VALUE) : c4683c);
        }
        this.f8111e = c4681aM9174d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2473b
    /* JADX INFO: renamed from: a */
    public final C4681a mo4875a() {
        return this.f8111e;
    }
}
