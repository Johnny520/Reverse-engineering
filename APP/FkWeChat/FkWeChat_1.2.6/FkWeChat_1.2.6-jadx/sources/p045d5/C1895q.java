package p045d5;

import java.util.ArrayList;
import p020b5.C0996b;
import p239q5.C6267r;
import p269s5.C7188c;
import p269s5.InterfaceC7189d;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: d5.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1895q extends AbstractC1894p {

    /* JADX INFO: renamed from: r */
    public final C1898t f5278r;

    /* JADX INFO: renamed from: s */
    public final ArrayList f5279s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1895q(C1895q c1895q) {
        super(c1895q.m6822F() > 0);
        this.f5278r = c1895q.f5278r.mo6819x();
        this.f5279s = new ArrayList(c1895q.f5279s.size());
        int size = c1895q.f5279s.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1894p abstractC1894p = (AbstractC1894p) c1895q.f5279s.get(i10);
            ArrayList arrayList = this.f5279s;
            if (abstractC1894p == null) {
                arrayList.add(null);
            } else {
                arrayList.add(abstractC1894p.mo6819x());
            }
        }
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: A */
    public void mo6813A(C7188c c7188c) {
        if (this.f5278r.m6836G() == 0) {
            return;
        }
        m33929u();
        this.f5278r.mo6813A(c7188c);
        for (AbstractC1894p abstractC1894p : this.f5279s) {
            if (abstractC1894p != null) {
                abstractC1894p.mo6813A(c7188c);
            }
        }
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: C */
    public C1895q mo6815C(AbstractC1894p abstractC1894p, int i10) {
        AbstractC1894p abstractC1894pM6823G = m6823G(i10);
        C1898t c1898tM6839J = this.f5278r.m6839J(abstractC1894p.mo6821z());
        if (abstractC1894pM6823G == abstractC1894p) {
            abstractC1894p = abstractC1894pM6823G;
        } else if (abstractC1894pM6823G != null) {
            abstractC1894p = abstractC1894pM6823G.mo6814B(abstractC1894p);
        }
        if (abstractC1894p == abstractC1894pM6823G && c1898tM6839J == this.f5278r) {
            return this;
        }
        int size = this.f5279s.size();
        int iMax = Math.max(i10 + 1, size);
        ArrayList arrayList = new ArrayList(iMax);
        int i11 = 0;
        C1898t c1898tMo6821z = null;
        while (i11 < iMax) {
            AbstractC1894p abstractC1894p2 = i11 == i10 ? abstractC1894p : i11 < size ? (AbstractC1894p) this.f5279s.get(i11) : null;
            if (abstractC1894p2 != null) {
                c1898tMo6821z = c1898tMo6821z == null ? abstractC1894p2.mo6821z() : c1898tMo6821z.m6839J(abstractC1894p2.mo6821z());
            }
            arrayList.add(abstractC1894p2);
            i11++;
        }
        C1895q c1895q = new C1895q(c1898tMo6821z, arrayList);
        c1895q.mo6829t();
        return c1895q;
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: D */
    public void mo6816D(int i10, InterfaceC7189d interfaceC7189d) {
        m33929u();
        this.f5278r.mo6816D(i10, interfaceC7189d);
        for (AbstractC1894p abstractC1894p : this.f5279s) {
            if (abstractC1894p != null) {
                abstractC1894p.mo6816D(i10, interfaceC7189d);
            }
        }
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: E */
    public void mo6817E(C6267r c6267r) {
        mo6816D(c6267r.m24754t(), c6267r);
    }

    /* JADX INFO: renamed from: F */
    public int m6822F() {
        return this.f5278r.m6836G();
    }

    /* JADX INFO: renamed from: G */
    public final AbstractC1894p m6823G(int i10) {
        if (i10 >= this.f5279s.size()) {
            return null;
        }
        return (AbstractC1894p) this.f5279s.get(i10);
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C1895q mo6814B(AbstractC1894p abstractC1894p) {
        try {
            C1895q c1895qM6826J = abstractC1894p instanceof C1895q ? m6826J((C1895q) abstractC1894p) : m6825I((C1898t) abstractC1894p);
            c1895qM6826J.mo6829t();
            return c1895qM6826J;
        } catch (C1902x e10) {
            e10.m3685a("underlay locals:");
            mo6818w(e10);
            e10.m3685a("overlay locals:");
            abstractC1894p.mo6818w(e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: I */
    public final C1895q m6825I(C1898t c1898t) {
        AbstractC1894p abstractC1894pMo6814B;
        C1898t c1898tM6839J = this.f5278r.m6839J(c1898t.mo6821z());
        ArrayList arrayList = new ArrayList(this.f5279s.size());
        int size = this.f5279s.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1894p abstractC1894p = (AbstractC1894p) this.f5279s.get(i10);
            if (abstractC1894p != null) {
                try {
                    abstractC1894pMo6814B = abstractC1894p.mo6814B(c1898t);
                } catch (C1902x e10) {
                    e10.m3685a("Merging one locals against caller block " + AbstractC8826h.m33898g(i10));
                    abstractC1894pMo6814B = null;
                }
            } else {
                abstractC1894pMo6814B = null;
            }
            z10 = z10 || abstractC1894p != abstractC1894pMo6814B;
            arrayList.add(abstractC1894pMo6814B);
        }
        return (this.f5278r != c1898tM6839J || z10) ? new C1895q(c1898tM6839J, arrayList) : this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p045d5.C1895q m6826J(p045d5.C1895q r14) {
        /*
            r13 = this;
            d5.t r0 = r13.f5278r
            d5.t r1 = r14.mo6821z()
            d5.t r0 = r0.m6839J(r1)
            java.util.ArrayList r1 = r13.f5279s
            int r1 = r1.size()
            java.util.ArrayList r2 = r14.f5279s
            int r2 = r2.size()
            int r3 = java.lang.Math.max(r1, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r5 = 0
            r6 = r5
            r7 = r6
        L22:
            if (r6 >= r3) goto L71
            r8 = 0
            if (r6 >= r1) goto L30
            java.util.ArrayList r9 = r13.f5279s
            java.lang.Object r9 = r9.get(r6)
            d5.p r9 = (p045d5.AbstractC1894p) r9
            goto L31
        L30:
            r9 = r8
        L31:
            if (r6 >= r2) goto L3c
            java.util.ArrayList r10 = r14.f5279s
            java.lang.Object r10 = r10.get(r6)
            d5.p r10 = (p045d5.AbstractC1894p) r10
            goto L3d
        L3c:
            r10 = r8
        L3d:
            if (r9 != r10) goto L40
            goto L46
        L40:
            if (r9 != 0) goto L44
            r8 = r10
            goto L63
        L44:
            if (r10 != 0) goto L48
        L46:
            r8 = r9
            goto L63
        L48:
            d5.p r8 = r9.mo6814B(r10)     // Catch: p045d5.C1902x -> L4d
            goto L63
        L4d:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Merging locals set for caller block "
            r11.<init>(r12)
            java.lang.String r12 = p309v5.AbstractC8826h.m33898g(r6)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.m3685a(r11)
        L63:
            if (r7 != 0) goto L6a
            if (r9 == r8) goto L68
            goto L6a
        L68:
            r7 = r5
            goto L6b
        L6a:
            r7 = 1
        L6b:
            r4.add(r8)
            int r6 = r6 + 1
            goto L22
        L71:
            d5.t r14 = r13.f5278r
            if (r14 != r0) goto L78
            if (r7 != 0) goto L78
            return r13
        L78:
            d5.q r14 = new d5.q
            r14.<init>(r0, r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p045d5.C1895q.m6826J(d5.q):d5.q");
    }

    /* JADX INFO: renamed from: K */
    public AbstractC1894p m6827K(int i10) {
        return m6823G(i10);
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        StringBuilder sb2 = new StringBuilder("(locals array set; primary)\n");
        sb2.append(mo6821z().mo6828g());
        sb2.append('\n');
        int size = this.f5279s.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1894p abstractC1894p = (AbstractC1894p) this.f5279s.get(i10);
            if (abstractC1894p != null) {
                sb2.append("(locals array set: primary for caller " + AbstractC8826h.m33898g(i10) + ")\n");
                sb2.append(abstractC1894p.mo6821z().mo6828g());
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }

    @Override // p309v5.AbstractC8834p
    /* JADX INFO: renamed from: t */
    public void mo6829t() {
        this.f5278r.mo6829t();
        for (AbstractC1894p abstractC1894p : this.f5279s) {
            if (abstractC1894p != null) {
                abstractC1894p.mo6829t();
            }
        }
        super.mo6829t();
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: w */
    public void mo6818w(C0996b c0996b) {
        c0996b.m3685a("(locals array set; primary)");
        this.f5278r.mo6818w(c0996b);
        int size = this.f5279s.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1894p abstractC1894p = (AbstractC1894p) this.f5279s.get(i10);
            if (abstractC1894p != null) {
                c0996b.m3685a("(locals array set: primary for caller " + AbstractC8826h.m33898g(i10) + ')');
                abstractC1894p.mo6821z().mo6818w(c0996b);
            }
        }
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: x */
    public AbstractC1894p mo6819x() {
        return new C1895q(this);
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: y */
    public InterfaceC7189d mo6820y(int i10) {
        return this.f5278r.mo6820y(i10);
    }

    @Override // p045d5.AbstractC1894p
    /* JADX INFO: renamed from: z */
    public C1898t mo6821z() {
        return this.f5278r;
    }

    public C1895q(C1898t c1898t, ArrayList arrayList) {
        super(c1898t.m6836G() > 0);
        this.f5278r = c1898t;
        this.f5279s = arrayList;
    }

    public C1895q(int i10) {
        super(i10 != 0);
        this.f5278r = new C1898t(i10);
        this.f5279s = new ArrayList();
    }
}
