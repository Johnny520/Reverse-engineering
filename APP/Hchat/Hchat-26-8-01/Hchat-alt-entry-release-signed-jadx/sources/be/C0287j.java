package be;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import md.EnumC2824a;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p233pd.C3403n;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.C3497a;
import p246qd.C3503g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;

/* JADX INFO: renamed from: be.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0287j implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0285i f832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4322r f833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4322r f834c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC3506j f835d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3130c f836e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0287j(C0291l c0291l, C0285i c0285i, C4322r c4322r, C4322r c4322r2, AbstractC3506j abstractC3506j, C3130c c3130c) {
        this.f832a = c0285i;
        this.f833b = c4322r;
        this.f834c = c4322r2;
        this.f835d = abstractC3506j;
        this.f836e = c3130c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        C3131d c3131dM6657b;
        C4320p c4320p = (C4320p) obj;
        if (c4320p.f14396k != EnumC3400k.f10961M || !this.f832a.test(c4320p)) {
            return null;
        }
        C4322r c4322r = this.f833b;
        C4322r c4322r2 = this.f834c;
        if (c4322r == null) {
            C4325u c4325u = c4322r2.f14411l.f14371k;
            AbstractC3506j abstractC3506j = this.f835d;
            C3128a c3128aM6637e = C3128a.m6637e(c4325u, abstractC3506j);
            List list = Collections.EMPTY_LIST;
            C3503g c3503g = AbstractC3506j.f11385b;
            c3131dM6657b = C3131d.m6657b(c4325u, c3128aM6637e, "values", list, new C3497a(abstractC3506j));
        } else {
            c3131dM6657b = c4322r.f14410k;
        }
        C3403n c3403n = new C3403n(c3131dM6657b, 1, 0);
        c3403n.m8688d0(c4320p.f14397l);
        if (c4322r == null) {
            c3403n.m6231w(EnumC2824a.f9172y);
        }
        c4322r2.m6380I("Replace access to removed values field (" + this.f836e.f10147h + ") with 'values()' method");
        return c3403n;
    }
}
