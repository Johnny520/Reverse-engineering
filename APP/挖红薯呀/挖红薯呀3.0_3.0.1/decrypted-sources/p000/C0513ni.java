package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: ni */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0513ni extends AbstractC0727si {

    /* JADX INFO: renamed from: a */
    public final long f4274a;

    /* JADX INFO: renamed from: b */
    public final boolean f4275b;

    /* JADX INFO: renamed from: c */
    public final boolean f4276c;

    /* JADX INFO: renamed from: d */
    public HashSet f4277d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f4278e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final gp0 f4279f = new gp0(fq0.f1796g, C0496n2.f4138R);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0616pi f4280g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0513ni(C0616pi c0616pi, long j, boolean z, boolean z2, C0910x1 c0910x1) {
        this.f4280g = c0616pi;
        this.f4274a = j;
        this.f4275b = z;
        this.f4276c = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: a */
    public final void mo2708a(C0964yi c0964yi, InterfaceC0904ww interfaceC0904ww) {
        this.f4280g.f4881b.mo2708a(c0964yi, interfaceC0904ww);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: b */
    public final kh0 mo2709b(C0964yi c0964yi, j11 j11Var, InterfaceC0904ww interfaceC0904ww) {
        return this.f4280g.f4881b.mo2709b(c0964yi, j11Var, interfaceC0904ww);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: c */
    public final void mo2710c() {
        C0616pi c0616pi = this.f4280g;
        c0616pi.f4859A--;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: d */
    public final boolean mo2711d() {
        return this.f4280g.f4881b.mo2711d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: e */
    public final boolean mo2712e() {
        return this.f4275b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: f */
    public final boolean mo2713f() {
        return this.f4276c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: g */
    public final long mo2714g() {
        return this.f4274a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: h */
    public final InterfaceC0690ri mo2715h() {
        return this.f4280g.f4887h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: i */
    public final fq0 mo2716i() {
        return (fq0) this.f4279f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: j */
    public final InterfaceC0618pk mo2717j() {
        return this.f4280g.f4881b.mo2717j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: k */
    public final boolean mo2718k() {
        return this.f4280g.f4881b.mo2718k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: l */
    public final void mo2719l(C0964yi c0964yi) {
        C0616pi c0616pi = this.f4280g;
        c0616pi.f4881b.mo2719l(c0616pi.f4887h);
        c0616pi.f4881b.mo2719l(c0964yi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: m */
    public final lg0 mo2720m(mg0 mg0Var) {
        return this.f4280g.f4881b.mo2720m(mg0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: n */
    public final kh0 mo2721n(C0964yi c0964yi, j11 j11Var, kh0 kh0Var) {
        return this.f4280g.f4881b.mo2721n(c0964yi, j11Var, kh0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: o */
    public final void mo2722o(Set set) {
        HashSet hashSet = this.f4277d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f4277d = hashSet;
        }
        hashSet.add(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: p */
    public final void mo2723p(C0616pi c0616pi) {
        this.f4278e.add(c0616pi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: q */
    public final void mo2724q(ht0 ht0Var) {
        this.f4280g.f4881b.mo2724q(ht0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: r */
    public final void mo2725r(C0964yi c0964yi) {
        this.f4280g.f4881b.mo2725r(c0964yi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: s */
    public final InterfaceC0958yc mo2726s(C0310i7 c0310i7) {
        return this.f4280g.f4881b.mo2726s(c0310i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: t */
    public final void mo2727t() {
        this.f4280g.f4859A++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: u */
    public final void mo2728u(InterfaceC0356ji interfaceC0356ji) {
        HashSet<Set> hashSet = this.f4277d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                interfaceC0356ji.getClass();
                set.remove(((C0616pi) interfaceC0356ji).m3126w());
            }
        }
        LinkedHashSet linkedHashSet = this.f4278e;
        if ((linkedHashSet instanceof p40) && !(linkedHashSet instanceof q40)) {
            s91.m4030Q(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
        linkedHashSet.remove(interfaceC0356ji);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0727si
    /* JADX INFO: renamed from: v */
    public final void mo2729v(C0964yi c0964yi) {
        this.f4280g.f4881b.mo2729v(c0964yi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m2730w() {
        LinkedHashSet<C0616pi> linkedHashSet = this.f4278e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f4277d;
        if (hashSet != null) {
            for (C0616pi c0616pi : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0616pi.m3126w());
                }
            }
        }
        linkedHashSet.clear();
    }
}
