package p121i4;

import java.util.ArrayList;
import p000a.AbstractC0000a;
import p295u4.C4265o;
import p326w4.C4683c;
import p326w4.InterfaceC4684d;

/* JADX INFO: renamed from: i4.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1979t extends AbstractC1978s {

    /* JADX INFO: renamed from: h */
    public final C1980u f6706h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f6707i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C1979t(C1979t c1979t) {
        InterfaceC4684d[] interfaceC4684dArr = c1979t.f6706h.f6708h;
        super(interfaceC4684dArr.length > 0);
        C1980u c1980u = new C1980u(interfaceC4684dArr.length);
        System.arraycopy(interfaceC4684dArr, 0, c1980u.f6708h, 0, interfaceC4684dArr.length);
        this.f6706h = c1980u;
        this.f6707i = new ArrayList(c1979t.f6707i.size());
        int size = c1979t.f6707i.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC1978s abstractC1978s = (AbstractC1978s) c1979t.f6707i.get(i9);
            ArrayList arrayList = this.f6707i;
            if (abstractC1978s == null) {
                arrayList.add(null);
            } else {
                arrayList.add(abstractC1978s.mo4893m());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        StringBuilder sb2 = new StringBuilder("(locals array set; primary)\n");
        sb2.append(this.f6706h.mo4901a());
        sb2.append('\n');
        ArrayList arrayList = this.f6707i;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC1978s abstractC1978s = (AbstractC1978s) arrayList.get(i9);
            if (abstractC1978s != null) {
                sb2.append("(locals array set: primary for caller " + AbstractC0000a.m46X0(i9) + ")\n");
                sb2.append(abstractC1978s.mo4895o().mo4901a());
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.AbstractC6096j
    /* JADX INFO: renamed from: i */
    public final void mo4882i() {
        this.f6706h.f24613g = false;
        for (AbstractC1978s abstractC1978s : this.f6707i) {
            if (abstractC1978s != null) {
                abstractC1978s.mo4882i();
            }
        }
        this.f24613g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: l */
    public final void mo4892l(C1960b0 c1960b0) {
        c1960b0.m2687a("(locals array set; primary)");
        this.f6706h.mo4892l(c1960b0);
        ArrayList arrayList = this.f6707i;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC1978s abstractC1978s = (AbstractC1978s) arrayList.get(i9);
            if (abstractC1978s != null) {
                c1960b0.m2687a("(locals array set: primary for caller " + AbstractC0000a.m46X0(i9) + ')');
                abstractC1978s.mo4895o().mo4892l(c1960b0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: m */
    public final AbstractC1978s mo4893m() {
        return new C1979t(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: n */
    public final InterfaceC4684d mo4894n(int i9) {
        return this.f6706h.mo4894n(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: o */
    public final C1980u mo4895o() {
        return this.f6706h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: p */
    public final void mo4896p(C4683c c4683c) {
        C1980u c1980u = this.f6706h;
        if (c1980u.f6708h.length == 0) {
            return;
        }
        m10855j();
        c1980u.mo4896p(c4683c);
        for (AbstractC1978s abstractC1978s : this.f6707i) {
            if (abstractC1978s != null) {
                abstractC1978s.mo4896p(c4683c);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: q */
    public final AbstractC1978s mo4897q(AbstractC1978s abstractC1978s) {
        try {
            C1979t c1979tM4903v = abstractC1978s instanceof C1979t ? m4903v((C1979t) abstractC1978s) : m4902u((C1980u) abstractC1978s);
            c1979tM4903v.mo4882i();
            return c1979tM4903v;
        } catch (C1960b0 e6) {
            e6.m2687a("underlay locals:");
            mo4892l(e6);
            e6.m2687a("overlay locals:");
            abstractC1978s.mo4892l(e6);
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: r */
    public final C1979t mo4898r(AbstractC1978s abstractC1978s, int i9) {
        ArrayList arrayList = this.f6707i;
        AbstractC1978s abstractC1978s2 = i9 >= arrayList.size() ? null : (AbstractC1978s) arrayList.get(i9);
        C1980u c1980uMo4895o = abstractC1978s.mo4895o();
        C1980u c1980u = this.f6706h;
        C1980u c1980uM4904u = c1980u.m4904u(c1980uMo4895o);
        if (abstractC1978s2 == abstractC1978s) {
            abstractC1978s = abstractC1978s2;
        } else if (abstractC1978s2 != null) {
            abstractC1978s = abstractC1978s2.mo4897q(abstractC1978s);
        }
        if (abstractC1978s == abstractC1978s2 && c1980uM4904u == c1980u) {
            return this;
        }
        int size = arrayList.size();
        int iMax = Math.max(i9 + 1, size);
        ArrayList arrayList2 = new ArrayList(iMax);
        int i10 = 0;
        C1980u c1980uMo4895o2 = null;
        while (i10 < iMax) {
            AbstractC1978s abstractC1978s3 = i10 == i9 ? abstractC1978s : i10 < size ? (AbstractC1978s) arrayList.get(i10) : null;
            if (abstractC1978s3 != null) {
                c1980uMo4895o2 = c1980uMo4895o2 == null ? abstractC1978s3.mo4895o() : c1980uMo4895o2.m4904u(abstractC1978s3.mo4895o());
            }
            arrayList2.add(abstractC1978s3);
            i10++;
        }
        C1979t c1979t = new C1979t(c1980uMo4895o2, arrayList2);
        c1979t.mo4882i();
        return c1979t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: s */
    public final void mo4899s(int i9, InterfaceC4684d interfaceC4684d) {
        m10855j();
        this.f6706h.mo4899s(i9, interfaceC4684d);
        for (AbstractC1978s abstractC1978s : this.f6707i) {
            if (abstractC1978s != null) {
                abstractC1978s.mo4899s(i9, interfaceC4684d);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: t */
    public final void mo4900t(C4265o c4265o) {
        mo4899s(c4265o.f13965g, c4265o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final C1979t m4902u(C1980u c1980u) {
        AbstractC1978s abstractC1978sMo4897q;
        c1980u.getClass();
        C1980u c1980u2 = this.f6706h;
        C1980u c1980uM4904u = c1980u2.m4904u(c1980u);
        ArrayList arrayList = this.f6707i;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC1978s abstractC1978s = (AbstractC1978s) arrayList.get(i9);
            if (abstractC1978s != null) {
                try {
                    abstractC1978sMo4897q = abstractC1978s.mo4897q(c1980u);
                } catch (C1960b0 e6) {
                    e6.m2687a("Merging one locals against caller block ".concat(AbstractC0000a.m46X0(i9)));
                    abstractC1978sMo4897q = null;
                }
            } else {
                abstractC1978sMo4897q = null;
            }
            z9 = z9 || abstractC1978s != abstractC1978sMo4897q;
            arrayList2.add(abstractC1978sMo4897q);
        }
        return (c1980u2 != c1980uM4904u || z9) ? new C1979t(c1980uM4904u, arrayList2) : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1979t m4903v(C1979t c1979t) {
        C1980u c1980u = c1979t.f6706h;
        C1980u c1980u2 = this.f6706h;
        C1980u c1980uM4904u = c1980u2.m4904u(c1980u);
        ArrayList arrayList = this.f6707i;
        int size = arrayList.size();
        ArrayList arrayList2 = c1979t.f6707i;
        int size2 = arrayList2.size();
        int iMax = Math.max(size, size2);
        ArrayList arrayList3 = new ArrayList(iMax);
        int i9 = 0;
        boolean z9 = false;
        while (i9 < iMax) {
            AbstractC1978s abstractC1978sMo4897q = null;
            AbstractC1978s abstractC1978s = i9 < size ? (AbstractC1978s) arrayList.get(i9) : null;
            AbstractC1978s abstractC1978s2 = i9 < size2 ? (AbstractC1978s) arrayList2.get(i9) : null;
            if (abstractC1978s != abstractC1978s2) {
                if (abstractC1978s == null) {
                    abstractC1978sMo4897q = abstractC1978s2;
                } else if (abstractC1978s2 == null) {
                    abstractC1978sMo4897q = abstractC1978s;
                } else {
                    try {
                        abstractC1978sMo4897q = abstractC1978s.mo4897q(abstractC1978s2);
                    } catch (C1960b0 e6) {
                        e6.m2687a("Merging locals set for caller block ".concat(AbstractC0000a.m46X0(i9)));
                    }
                }
            }
            z9 = z9 || abstractC1978s != abstractC1978sMo4897q;
            arrayList3.add(abstractC1978sMo4897q);
            i9++;
        }
        return (c1980u2 != c1980uM4904u || z9) ? new C1979t(c1980uM4904u, arrayList3) : this;
    }

    public C1979t(C1980u c1980u, ArrayList arrayList) {
        super(c1980u.f6708h.length > 0);
        this.f6706h = c1980u;
        this.f6707i = arrayList;
    }

    public C1979t(int i9) {
        super(i9 != 0);
        this.f6706h = new C1980u(i9);
        this.f6707i = new ArrayList();
    }
}
