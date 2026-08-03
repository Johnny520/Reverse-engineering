package fun.box001.internal.dexformat;

import fun.box001.internal.collections.C0016a;
import fun.box001.internal.dexbridge.C0000a;
import fun.box001.internal.dexformat.io.C0198a;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.C0165p;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0186p;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: e.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0047x {

    /* JADX INFO: renamed from: a */
    private final C0016a f271a;

    /* JADX INFO: renamed from: b */
    private final int f272b;

    /* JADX INFO: renamed from: c */
    private ArrayList f273c;

    /* JADX INFO: renamed from: f */
    private int f276f;

    /* JADX INFO: renamed from: g */
    private final int f277g;

    /* JADX INFO: renamed from: e */
    private int f275e = -1;

    /* JADX INFO: renamed from: d */
    private boolean f274d = false;

    public C0047x(C0016a c0016a, int i2, int i3, int i4) {
        this.f271a = c0016a;
        this.f272b = i3;
        this.f273c = new ArrayList(i2);
        this.f277g = i4;
    }

    /* JADX INFO: renamed from: b */
    private void m200b() {
        int size = this.f273c.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0033j abstractC0033j = (AbstractC0033j) this.f273c.get(i2);
            if (!(abstractC0033j instanceof C0029f)) {
                this.f273c.set(i2, abstractC0033j.mo92v(1));
            }
        }
        this.f275e++;
    }

    /* JADX INFO: renamed from: d */
    private C0035l m201d(AbstractC0033j abstractC0033j) {
        C0035l c0035lM202e = m202e(abstractC0033j.m136i(), abstractC0033j.m138k());
        if (c0035lM202e != null) {
            return c0035lM202e;
        }
        throw new C0000a("No expanded opcode for " + abstractC0033j);
    }

    /* JADX INFO: renamed from: e */
    private C0035l m202e(AbstractC0033j abstractC0033j, C0035l c0035l) {
        while (true) {
            if (c0035l == null) {
                break;
            }
            if (c0035l.m152b().mo180i(abstractC0033j)) {
                this.f271a.getClass();
                break;
            }
            c0035l = AbstractC0036m.m158a(c0035l);
        }
        return c0035l;
    }

    /* JADX INFO: renamed from: k */
    private boolean m203k(C0035l[] c0035lArr) {
        int i2 = this.f275e;
        if (i2 < 0) {
            i2 = 0;
        }
        boolean z = false;
        while (true) {
            int size = this.f273c.size();
            int i3 = this.f275e;
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC0033j abstractC0033j = (AbstractC0033j) this.f273c.get(i4);
                C0035l c0035l = c0035lArr[i4];
                C0035l c0035lM202e = m202e(abstractC0033j, c0035l);
                if (c0035lM202e == null) {
                    int iM137j = abstractC0033j.m137j(m201d(abstractC0033j).m152b().mo177f(abstractC0033j));
                    if (iM137j > i3) {
                        i3 = iM137j;
                    }
                } else {
                    if (c0035l == c0035lM202e) {
                    }
                }
                c0035lArr[i4] = c0035lM202e;
            }
            if (i2 >= i3) {
                this.f275e = i2;
                return z;
            }
            int i5 = i3 - i2;
            int size2 = this.f273c.size();
            for (int i6 = 0; i6 < size2; i6++) {
                AbstractC0033j abstractC0033j2 = (AbstractC0033j) this.f273c.get(i6);
                if (!(abstractC0033j2 instanceof C0029f)) {
                    this.f273c.set(i6, abstractC0033j2.mo92v(i5));
                }
            }
            z = true;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m204a(AbstractC0033j abstractC0033j) {
        this.f273c.add(abstractC0033j);
        if (!this.f274d) {
            abstractC0033j.m139l().getClass();
        }
        if (!(abstractC0033j instanceof AbstractC0044u)) {
            if ((abstractC0033j instanceof AbstractC0045v) && ((AbstractC0045v) abstractC0033j).m194y() != null) {
                throw null;
            }
            return;
        }
        C0165p c0165pM193y = ((AbstractC0044u) abstractC0033j).m193y();
        int iM410p = c0165pM193y.m410p();
        for (int i2 = 0; i2 < iM410p; i2++) {
            if (c0165pM193y.m405k(i2) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m205c(InterfaceC0031h interfaceC0031h) {
        int iMo119a;
        for (AbstractC0033j abstractC0033j : this.f273c) {
            if (abstractC0033j instanceof C0030g) {
                C0030g c0030g = (C0030g) abstractC0033j;
                AbstractC0171a abstractC0171aM117y = c0030g.m117y();
                int iMo119a2 = interfaceC0031h.mo119a(abstractC0171aM117y);
                if (iMo119a2 >= 0) {
                    c0030g.m114B(iMo119a2);
                }
                if ((abstractC0171aM117y instanceof AbstractC0186p) && (iMo119a = interfaceC0031h.mo119a(((AbstractC0186p) abstractC0171aM117y).m440g())) >= 0) {
                    c0030g.m113A(iMo119a);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0034k m206f() {
        int i2;
        C0021E c0021eM133f;
        C0038o c0038o;
        boolean z;
        if (this.f275e >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = this.f273c.size();
        C0035l[] c0035lArr = new C0035l[size];
        for (int i3 = 0; i3 < size; i3++) {
            c0035lArr[i3] = ((AbstractC0033j) this.f273c.get(i3)).m138k();
        }
        m203k(c0035lArr);
        this.f271a.getClass();
        do {
            int i4 = this.f275e;
            i2 = this.f272b;
            int i5 = i4 + i2 + this.f276f;
            int i6 = this.f277g;
            int i7 = i5 - i6;
            Iterator it = this.f273c.iterator();
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                C0164o c0164oM140m = ((AbstractC0033j) it.next()).m140m();
                for (int i12 = 0; i12 < c0164oM140m.m504B(); i12++) {
                    C0162m c0162mP = c0164oM140m.m513p(i12);
                    if (c0162mP.m385k()) {
                        boolean z2 = c0162mP.m384i() >= i7;
                        if (c0162mP.m386l()) {
                            if (z2) {
                                i9++;
                            } else {
                                i11++;
                            }
                        } else if (z2) {
                            i8++;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            if (i8 > i9 && i10 > i11) {
                m200b();
            } else if (i8 <= i9) {
                if (i10 <= i11) {
                    break;
                }
                m200b();
                if (i6 != 0 && i9 > i8) {
                    int size2 = this.f273c.size();
                    int i13 = this.f275e + i2 + this.f276f;
                    int i14 = i13 - i6;
                    C0198a c0198a = new C0198a(i13);
                    for (int i15 = 0; i15 < i13; i15++) {
                        if (i15 >= i14) {
                            c0198a.m475a(i15, i15 + 1);
                        } else {
                            c0198a.m475a(i15, i15);
                        }
                    }
                    for (int i16 = 0; i16 < size2; i16++) {
                        AbstractC0033j abstractC0033j = (AbstractC0033j) this.f273c.get(i16);
                        if (!(abstractC0033j instanceof C0029f)) {
                            this.f273c.set(i16, abstractC0033j.m145t(c0198a));
                        }
                    }
                    this.f276f++;
                }
            }
        } while (m203k(c0035lArr));
        if (this.f275e == 0) {
            int size3 = this.f273c.size();
            for (int i17 = 0; i17 < size3; i17++) {
                AbstractC0033j abstractC0033j2 = (AbstractC0033j) this.f273c.get(i17);
                C0035l c0035lM138k = abstractC0033j2.m138k();
                C0035l c0035l = c0035lArr[i17];
                if (c0035lM138k != c0035l) {
                    this.f273c.set(i17, abstractC0033j2.mo85u(c0035l));
                }
            }
        } else {
            int size4 = this.f273c.size();
            ArrayList arrayList = new ArrayList(size4 * 2);
            ArrayList arrayList2 = new ArrayList();
            for (int i18 = 0; i18 < size4; i18++) {
                AbstractC0033j abstractC0033jM134g = (AbstractC0033j) this.f273c.get(i18);
                C0035l c0035lM138k2 = abstractC0033jM134g.m138k();
                C0035l c0035lM201d = c0035lArr[i18];
                if (c0035lM201d != null) {
                    c0038o = null;
                    c0021eM133f = null;
                } else {
                    c0035lM201d = m201d(abstractC0033jM134g);
                    BitSet bitSetMo177f = c0035lM201d.m152b().mo177f(abstractC0033jM134g);
                    C0038o c0038oM132e = abstractC0033jM134g.m132e(bitSetMo177f);
                    c0021eM133f = abstractC0033jM134g.m133f(bitSetMo177f);
                    abstractC0033jM134g = abstractC0033jM134g.m134g(bitSetMo177f);
                    c0038o = c0038oM132e;
                }
                if (abstractC0033jM134g instanceof C0029f) {
                    ((C0029f) abstractC0033jM134g).getClass();
                }
                if (c0038o != null) {
                    arrayList.add(c0038o);
                }
                if (!(abstractC0033jM134g instanceof AbstractC0023G) && arrayList2.size() > 0) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((C0029f) it2.next());
                    }
                    arrayList2.clear();
                }
                if (c0035lM201d != c0035lM138k2) {
                    abstractC0033jM134g = abstractC0033jM134g.mo85u(c0035lM201d);
                }
                arrayList.add(abstractC0033jM134g);
                if (c0021eM133f != null) {
                    arrayList.add(c0021eM133f);
                }
            }
            this.f273c = arrayList;
        }
        do {
            int size5 = this.f273c.size();
            int iMo91b = 0;
            for (int i19 = 0; i19 < size5; i19++) {
                AbstractC0033j abstractC0033j3 = (AbstractC0033j) this.f273c.get(i19);
                abstractC0033j3.m144s(iMo91b);
                iMo91b += abstractC0033j3.mo91b();
            }
            int size6 = this.f273c.size();
            int i20 = 0;
            z = false;
            while (i20 < size6) {
                AbstractC0033j abstractC0033j4 = (AbstractC0033j) this.f273c.get(i20);
                if (abstractC0033j4 instanceof C0022F) {
                    C0035l c0035lM138k3 = abstractC0033j4.m138k();
                    C0022F c0022f = (C0022F) abstractC0033j4;
                    if (c0035lM138k3.m152b().mo175b(c0022f)) {
                        continue;
                    } else {
                        if (c0035lM138k3.m151a() == 40) {
                            C0035l c0035lM202e = m202e(abstractC0033j4, c0035lM138k3);
                            if (c0035lM202e == null) {
                                throw new UnsupportedOperationException("method too long");
                            }
                            this.f273c.set(i20, abstractC0033j4.mo85u(c0035lM202e));
                        } else {
                            try {
                                int i21 = i20 + 1;
                                C0029f c0029f = (C0029f) this.f273c.get(i21);
                                this.f273c.set(i20, new C0022F(AbstractC0036m.f137I, c0022f.m139l(), C0164o.f512c, c0022f.m89y()));
                                this.f273c.add(i20, new C0022F(c0022f.m138k().m156f(), c0022f.m139l(), c0022f.m140m(), c0029f));
                                size6++;
                                i20 = i21;
                            } catch (ClassCastException unused) {
                                throw new IllegalStateException("unpaired TargetInsn");
                            } catch (IndexOutOfBoundsException unused2) {
                                throw new IllegalStateException("unpaired TargetInsn (dangling)");
                            }
                        }
                        z = true;
                    }
                }
                i20++;
            }
        } while (z);
        return C0034k.m146I(this.f275e + i2 + this.f276f, this.f273c);
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0033j m207g(int i2) {
        return (AbstractC0033j) this.f273c.get(i2);
    }

    /* JADX INFO: renamed from: h */
    public final HashSet m208h() {
        HashSet hashSet = new HashSet(20);
        for (AbstractC0033j abstractC0033j : this.f273c) {
            if (abstractC0033j instanceof C0030g) {
                hashSet.add(((C0030g) abstractC0033j).m117y());
            } else if (abstractC0033j instanceof AbstractC0044u) {
                C0165p c0165pM193y = ((AbstractC0044u) abstractC0033j).m193y();
                int iM410p = c0165pM193y.m410p();
                for (int i2 = 0; i2 < iM410p; i2++) {
                    if (c0165pM193y.m405k(i2) != null) {
                        throw null;
                    }
                }
            } else if ((abstractC0033j instanceof AbstractC0045v) && ((AbstractC0045v) abstractC0033j).m194y() != null) {
                throw null;
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m209i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m210j() {
        return this.f274d;
    }

    /* JADX INFO: renamed from: l */
    public final void m211l(C0029f c0029f) {
        int size = (this.f273c.size() - 1) - 1;
        try {
            C0022F c0022f = (C0022F) this.f273c.get(size);
            this.f273c.set(size, new C0022F(c0022f.m138k().m156f(), c0022f.m139l(), c0022f.m140m(), c0029f));
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("non-reversible instruction");
        } catch (IndexOutOfBoundsException unused2) {
            throw new IllegalArgumentException("too few instructions");
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m212m() {
        return this.f273c.size();
    }
}
