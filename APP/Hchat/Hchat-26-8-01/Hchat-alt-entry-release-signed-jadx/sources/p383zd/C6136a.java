package p383zd;

import md.EnumC2824a;
import p000a.AbstractC0000a;
import p092g4.AbstractC1341a;
import p199nd.C2988t;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p302ud.C4320p;

/* JADX INFO: renamed from: zd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6136a extends AbstractC1341a {

    /* JADX INFO: renamed from: a */
    public final C4320p f24720a;

    /* JADX INFO: renamed from: b */
    public final C4320p f24721b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6136a(AbstractC3508l abstractC3508l, C3514r c3514r) {
        EnumC3400k enumC3400k = EnumC3400k.f10973Y;
        C4320p c4320p = new C4320p(enumC3400k, 0);
        this.f24720a = c4320p;
        EnumC2824a enumC2824a = EnumC2824a.f9164q;
        c4320p.m6231w(enumC2824a);
        c4320p.m8688d0(c3514r.mo7374H());
        C4320p c4320p2 = new C4320p(enumC3400k, 1);
        this.f24721b = c4320p2;
        c4320p2.m6231w(enumC2824a);
        c4320p2.mo7178I(abstractC3508l.mo7374H());
        c4320p.f14397l.f11440m.m7398b().f11416f = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m10906P(C6138c c6138c) {
        C2988t c2988t = c6138c.f24724m;
        AbstractC0000a.m26N0(c2988t.f9755a.f14352m, c2988t.f9756b).f14351l.add(this.f24721b);
        c6138c.f24726o.f14351l.add(0, this.f24720a);
    }
}
