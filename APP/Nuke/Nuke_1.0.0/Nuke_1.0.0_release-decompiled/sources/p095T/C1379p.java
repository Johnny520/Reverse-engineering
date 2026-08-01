package p095T;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p000A.C0066i0;
import p001A0.C0102b;
import p029F0.C0363A;
import p074O2.InterfaceC1051i;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p122Y2.InterfaceC1766a;
import p122Y2.InterfaceC1767b;
import p136b0.C1847i;
import p186k.C2409F;

/* JADX INFO: renamed from: T.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1379p extends AbstractC1391v {

    /* JADX INFO: renamed from: a */
    public final long f4852a;

    /* JADX INFO: renamed from: b */
    public final boolean f4853b;

    /* JADX INFO: renamed from: c */
    public final boolean f4854c;

    /* JADX INFO: renamed from: d */
    public HashSet f4855d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f4856e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final C1366i0 f4857f = new C1366i0(C1847i.f6255g, C1357e.f4796h);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1383r f4858g;

    public C1379p(C1383r c1383r, long j5, boolean z5, boolean z6, C0066i0 c0066i0) {
        this.f4858g = c1383r;
        this.f4852a = j5;
        this.f4853b = z5;
        this.f4854c = z6;
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: a */
    public final void mo2519a(C1397y c1397y, InterfaceC1603e interfaceC1603e) {
        this.f4858g.f4885b.mo2519a(c1397y, interfaceC1603e);
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: b */
    public final C2409F mo2520b(C1397y c1397y, C0363A c0363a, InterfaceC1603e interfaceC1603e) {
        return this.f4858g.f4885b.mo2520b(c1397y, c0363a, interfaceC1603e);
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: c */
    public final void mo2521c() {
        C1383r c1383r = this.f4858g;
        c1383r.f4863A--;
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: d */
    public final boolean mo2522d() {
        return this.f4858g.f4885b.mo2522d();
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: e */
    public final boolean mo2523e() {
        return this.f4853b;
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: f */
    public final boolean mo2524f() {
        return this.f4854c;
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: g */
    public final long mo2525g() {
        return this.f4852a;
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: h */
    public final InterfaceC1389u mo2526h() {
        return this.f4858g.f4891h;
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: i */
    public final InterfaceC1378o0 mo2527i() {
        return (InterfaceC1378o0) this.f4857f.getValue();
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: j */
    public final InterfaceC1051i mo2528j() {
        return this.f4858g.f4885b.mo2528j();
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: k */
    public final boolean mo2529k() {
        return this.f4858g.f4885b.mo2529k();
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: l */
    public final void mo2530l(C1397y c1397y) {
        C1383r c1383r = this.f4858g;
        c1383r.f4885b.mo2530l(c1383r.f4891h);
        c1383r.f4885b.mo2530l(c1397y);
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: m */
    public final AbstractC1344W mo2531m(AbstractC1346X abstractC1346X) {
        return this.f4858g.f4885b.mo2531m(abstractC1346X);
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: n */
    public final C2409F mo2532n(C1397y c1397y, C0363A c0363a, C2409F c2409f) {
        return this.f4858g.f4885b.mo2532n(c1397y, c0363a, c2409f);
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: o */
    public final void mo2533o(Set set) {
        HashSet hashSet = this.f4855d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f4855d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: p */
    public final void mo2534p(C1383r c1383r) {
        this.f4856e.add(c1383r);
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: q */
    public final void mo2535q(C1388t0 c1388t0) {
        this.f4858g.f4885b.mo2535q(c1388t0);
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: r */
    public final void mo2536r(C1397y c1397y) {
        this.f4858g.f4885b.mo2536r(c1397y);
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: s */
    public final InterfaceC1359f mo2537s(C0102b c0102b) {
        return this.f4858g.f4885b.mo2537s(c0102b);
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: t */
    public final void mo2538t() {
        this.f4858g.f4863A++;
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: u */
    public final void mo2539u(InterfaceC1373m interfaceC1373m) {
        HashSet<Set> hashSet = this.f4855d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                AbstractC1665j.m2983c(interfaceC1373m, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(((C1383r) interfaceC1373m).m2604w());
            }
        }
        LinkedHashSet linkedHashSet = this.f4856e;
        if ((linkedHashSet instanceof InterfaceC1766a) && !(linkedHashSet instanceof InterfaceC1767b)) {
            AbstractC1678w.m3000d(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
        linkedHashSet.remove(interfaceC1373m);
    }

    @Override // p095T.AbstractC1391v
    /* JADX INFO: renamed from: v */
    public final void mo2540v(C1397y c1397y) {
        this.f4858g.f4885b.mo2540v(c1397y);
    }

    /* JADX INFO: renamed from: w */
    public final void m2541w() {
        LinkedHashSet<C1383r> linkedHashSet = this.f4856e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f4855d;
        if (hashSet != null) {
            for (C1383r c1383r : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c1383r.m2604w());
                }
            }
        }
        linkedHashSet.clear();
    }
}
