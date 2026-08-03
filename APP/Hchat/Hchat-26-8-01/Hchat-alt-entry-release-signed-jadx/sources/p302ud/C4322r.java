package p302ud;

import ac.C0058k;
import af.C0079b;
import af.C0080c;
import be.C0271b;
import be.C0305w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import md.C2825b;
import md.EnumC2824a;
import me.C2833a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p000a.AbstractC0000a;
import p005a5.C0016a;
import p012ah.C0086a;
import p020b5.C0192k;
import p025bc.AbstractC0255e;
import p025bc.C0264n;
import p068eh.AbstractC0921a;
import p083fe.C1214a;
import p084ff.C1219e;
import p141jf.C2129e;
import p141jf.C2130f;
import p171lf.C2559a;
import p171lf.C2560b;
import p199nd.AbstractC2963b0;
import p199nd.C2988t;
import p199nd.C2992x;
import p199nd.C2994z;
import p214oc.C3126c;
import p215od.C3131d;
import p222p.AbstractC3199a;
import p227p4.C3315t;
import p232pc.C3383e;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p246qd.C3515s;
import p350xd.C5775b;
import p351xe.AbstractC5798s;
import p351xe.C5787h;

/* JADX INFO: renamed from: ud.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4322r extends AbstractC2963b0 implements InterfaceC4317m, Comparable {

    /* JADX INFO: renamed from: J */
    public static final C4320p[] f14400J;

    /* JADX INFO: renamed from: A */
    public int f14401A;

    /* JADX INFO: renamed from: B */
    public C4305a f14402B;

    /* JADX INFO: renamed from: C */
    public C4305a f14403C;

    /* JADX INFO: renamed from: D */
    public List f14404D;

    /* JADX INFO: renamed from: E */
    public List f14405E;

    /* JADX INFO: renamed from: F */
    public List f14406F;

    /* JADX INFO: renamed from: G */
    public C5775b f14407G;

    /* JADX INFO: renamed from: H */
    public List f14408H;

    /* JADX INFO: renamed from: I */
    public C0264n f14409I;

    /* JADX INFO: renamed from: k */
    public final C3131d f14410k;

    /* JADX INFO: renamed from: l */
    public final C4309e f14411l;

    /* JADX INFO: renamed from: m */
    public C0192k f14412m;

    /* JADX INFO: renamed from: n */
    public final C0016a f14413n;

    /* JADX INFO: renamed from: o */
    public final int f14414o;

    /* JADX INFO: renamed from: p */
    public boolean f14415p;

    /* JADX INFO: renamed from: q */
    public int f14416q;

    /* JADX INFO: renamed from: r */
    public int f14417r;

    /* JADX INFO: renamed from: s */
    public boolean f14418s;

    /* JADX INFO: renamed from: t */
    public AbstractC3506j f14419t;

    /* JADX INFO: renamed from: u */
    public List f14420u;

    /* JADX INFO: renamed from: v */
    public List f14421v;

    /* JADX INFO: renamed from: w */
    public C3514r f14422w;

    /* JADX INFO: renamed from: x */
    public List f14423x;

    /* JADX INFO: renamed from: y */
    public C4320p[] f14424y;

    /* JADX INFO: renamed from: z */
    public List f14425z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C4322r.class);
        f14400J = new C4320p[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4322r(C4309e c4309e, C2130f c2130f) {
        List list = Collections.EMPTY_LIST;
        this.f14408H = list;
        C3131d c3131dM6659d = C3131d.m6659d(c4309e.f14371k, c2130f.f7107b);
        this.f14410k = c3131dM6659d;
        this.f14411l = c4309e;
        this.f14412m = new C0192k(c2130f.f7108c, 3, 3);
        C0016a c0016a = c2130f.f7111f;
        boolean z9 = c0016a == null;
        this.f14415p = z9;
        if (z9) {
            this.f14413n = null;
            this.f14414o = 0;
        } else {
            C0016a c0016a2 = new C0016a(((C0058k) c0016a.f56i).m356g());
            c0016a2.f55h = c0016a.f55h;
            this.f14413n = c0016a2;
            this.f14414o = c0016a.m202f();
        }
        this.f14419t = c3131dM6659d.f10151h;
        this.f14420u = c3131dM6659d.f10152i;
        this.f14421v = list;
        m8706e0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p199nd.AbstractC2963b0
    /* JADX INFO: renamed from: O */
    public final C0192k mo6386O() {
        return this.f14412m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p199nd.AbstractC2963b0
    /* JADX INFO: renamed from: P */
    public final C4309e mo6387P() {
        return this.f14411l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p199nd.AbstractC2963b0
    /* JADX INFO: renamed from: Q */
    public final void mo6388Q(C0192k c0192k) {
        this.f14412m = c0192k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final List m8693R(C4305a c4305a) {
        if (this.f14406F.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.f14406F.size());
        for (C2988t c2988t : this.f14406F) {
            if (c2988t.f9757c.contains(c4305a)) {
                arrayList.add(c2988t);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final List m8694S() {
        List list = this.f14423x;
        if (list != null) {
            return list;
        }
        C0086a.m452k(AbstractC0255e.m1021j("Method arg registers not loaded: ", String.valueOf(this), ", class status: ", AbstractC3199a.m6827A(this.f14411l.m8656a0().f14385y)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final C3315t m8695T() {
        List listM344J;
        C0058k c0058k;
        int iM343I;
        if (!this.f14415p) {
            C0016a c0016a = this.f14413n;
            C0058k c0058k2 = (C0058k) c0016a.f56i;
            c0058k2.m336B(8);
            ByteBuffer byteBuffer = (ByteBuffer) c0058k2.f177i;
            int i9 = byteBuffer.getInt();
            if (i9 != 0) {
                if (i9 < 0 || i9 > byteBuffer.capacity()) {
                    throw new C0080c("Invalid debug info offset");
                }
                C0058k c0058k3 = (C0058k) c0016a.f56i;
                c0058k3.m336B(0);
                int iM346L = c0058k3.m346L();
                C2559a c2559a = new C2559a(c0058k2, iM346L, c0016a.m202f());
                int i10 = c0016a.f55h;
                C2129e c2129e = ((C1219e) c0058k2.f178j).f4087d;
                c0058k2.m351a((i10 * 8) + c2129e.f7103g + 2);
                c0058k2.m351a((c0058k2.m346L() * 12) + c2129e.f7102f + 8);
                int i11 = byteBuffer.getInt();
                if (i11 == 0) {
                    listM344J = Collections.EMPTY_LIST;
                } else {
                    c0058k2.m351a(i11);
                    listM344J = c0058k2.m344J();
                }
                if (listM344J.isEmpty()) {
                    c2559a.f8301g = Collections.EMPTY_LIST;
                } else {
                    int[] iArr = new int[listM344J.size()];
                    for (int i12 = r3 - 1; i12 >= 0; i12--) {
                        char cCharAt = ((String) listM344J.get(i12)).charAt(0);
                        iM346L -= (cCharAt == 'D' || cCharAt == 'J') ? 2 : 1;
                        iArr[i12] = iM346L;
                    }
                    c2559a.f8302h = iArr;
                    c2559a.f8301g = listM344J;
                }
                C0058k c0058k4 = c2559a.f8295a;
                c0058k4.m351a(i9);
                c2559a.f8299e = new ArrayList();
                c2559a.f8300f = new HashMap();
                int iM14H0 = AbstractC0000a.m14H0(c0058k4);
                int iM14H02 = AbstractC0000a.m14H0(c0058k4);
                int size = c2559a.f8301g.size();
                int i13 = 0;
                boolean z9 = false;
                while (true) {
                    c0058k = c2559a.f8296b;
                    if (i13 >= iM14H02) {
                        break;
                    }
                    String strM371v = c0058k.m371v(AbstractC0000a.m14H0(c0058k4) - 1);
                    if (strM371v != null && i13 < size) {
                        C2560b c2560b = new C2560b(c2559a.f8302h[i13], strM371v, (String) c2559a.f8301g.get(i13), null);
                        c2559a.m6017b(c2560b, 0);
                        c2560b.f8308f = -1;
                        z9 = true;
                    }
                    i13++;
                }
                int iMin = 0;
                while (true) {
                    int iM345K = c0058k4.m345K();
                    int i14 = c2559a.f8298d;
                    C2560b[] c2560bArr = c2559a.f8297c;
                    if (iM345K == 0) {
                        if (z9) {
                            for (C2560b c2560b2 : c2560bArr) {
                                if (c2560b2 != null && !c2560b2.f8307e) {
                                    c2559a.m6016a(c2560b2, i14 - 1);
                                }
                            }
                        }
                        return new C3315t(c2559a.f8300f, 2, c2559a.f8299e);
                    }
                    switch (iM345K) {
                        case 1:
                            iMin = Math.min(AbstractC0000a.m14H0(c0058k4) + iMin, i14 - 1);
                            break;
                        case 2:
                            iM343I = c0058k4.m343I() + iM14H0;
                            iM14H0 = iM343I;
                            break;
                        case 3:
                            c2559a.m6017b(new C2560b(c2559a.f8296b, AbstractC0000a.m14H0(c0058k4), AbstractC0000a.m14H0(c0058k4) - 1, AbstractC0000a.m14H0(c0058k4) - 1, -1), iMin);
                            z9 = true;
                            break;
                        case 4:
                            c2559a.m6017b(new C2560b(c2559a.f8296b, AbstractC0000a.m14H0(c0058k4), AbstractC0000a.m14H0(c0058k4) - 1, AbstractC0000a.m14H0(c0058k4) - 1, AbstractC0000a.m14H0(c0058k4) - 1), iMin);
                            z9 = true;
                            break;
                        case 5:
                            C2560b c2560b3 = c2560bArr[AbstractC0000a.m14H0(c0058k4)];
                            if (c2560b3 != null) {
                                c2559a.m6016a(c2560b3, iMin);
                            }
                            z9 = true;
                            break;
                        case 6:
                            int iM14H03 = AbstractC0000a.m14H0(c0058k4);
                            C2560b c2560b4 = c2560bArr[iM14H03];
                            if (c2560b4 != null) {
                                c2559a.m6016a(c2560b4, iMin);
                                c2559a.m6017b(new C2560b(iM14H03, c2560b4.f8304b, c2560b4.f8305c, c2560b4.f8306d), iMin);
                            }
                            z9 = true;
                            break;
                        case 7:
                        case 8:
                            break;
                        case 9:
                            c0058k.m371v(AbstractC0000a.m14H0(c0058k4) - 1);
                            break;
                        default:
                            iMin = Math.min(((iM345K - 10) / 15) + iMin, i14 - 1);
                            iM343I = ((r5 % 15) - 4) + iM14H0;
                            c2559a.f8300f.put(Integer.valueOf(iMin), Integer.valueOf(iM343I));
                            iM14H0 = iM343I;
                            break;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final C2988t m8696U(C4305a c4305a) {
        if (this.f14406F.isEmpty()) {
            return null;
        }
        for (C2988t c2988t : this.f14406F) {
            if (c2988t.f9757c.contains(c4305a)) {
                return c2988t;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final void m8697V(List list) {
        int iM7366p;
        if (this.f14415p) {
            iM7366p = 0;
        } else {
            iM7366p = this.f14417r;
            if (iM7366p == -1) {
                iM7366p = this.f14416q;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iM7366p -= ((AbstractC3506j) it.next()).m7366p();
                }
                if (!this.f14412m.m856h()) {
                    iM7366p--;
                }
            }
        }
        C4309e c4309e = this.f14411l;
        C1214a c1214a = c4309e.f14371k.f14443i;
        boolean zM856h = this.f14412m.m856h();
        EnumC2824a enumC2824a = EnumC2824a.f9128N;
        if (zM856h) {
            this.f14422w = null;
        } else {
            AbstractC3506j abstractC3506jM8657b0 = c4309e.m8657b0();
            c1214a.getClass();
            C1214a.m3335c(this, abstractC3506jM8657b0);
            InterfaceC2844b interfaceC2844b = AbstractC3508l.f11418k;
            C3514r c3514r = new C3514r(iM7366p, abstractC3506jM8657b0);
            c3514r.m6231w(EnumC2824a.f9124J);
            c3514r.m6231w(enumC2824a);
            this.f14422w = c3514r;
            iM7366p++;
        }
        if (list.isEmpty()) {
            this.f14423x = Collections.EMPTY_LIST;
            return;
        }
        this.f14423x = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC3506j abstractC3506j = (AbstractC3506j) it2.next();
            c1214a.getClass();
            C1214a.m3335c(this, abstractC3506j);
            InterfaceC2844b interfaceC2844b2 = AbstractC3508l.f11418k;
            C3514r c3514r2 = new C3514r(iM7366p, abstractC3506j);
            c3514r2.m6231w(EnumC2824a.f9127M);
            c3514r2.m6231w(enumC2824a);
            this.f14423x.add(c3514r2);
            iM7366p += abstractC3506j.m7366p();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final boolean m8698W() {
        return this.f14412m.m849a() && this.f14410k.m6663f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8699X() {
        int i9;
        if (!m8698W()) {
            return false;
        }
        C4309e c4309e = this.f14411l;
        if (!c4309e.f14373m.m6650o() || c4309e.f14375o.m856h()) {
            i9 = 0;
        } else {
            C4309e c4309e2 = c4309e.f14384x;
            List list = this.f14423x;
            if (list != null && !list.isEmpty() && ((C3514r) this.f14423x.get(0)).f11419i.equals(c4309e2.f14373m.f10138g)) {
                i9 = 1;
            }
        }
        List list2 = this.f14423x;
        return list2 == null || list2.size() == i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final boolean m8700Y(C4305a c4305a) {
        List list = c4305a.f14353n;
        return list.size() == 1 ? ((C4305a) list.get(0)).equals(this.f14403C) : this.f14403C.f14352m.contains(c4305a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final boolean m8701Z() {
        return this.f14410k.f10151h.equals(AbstractC3506j.f11393j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final void m8702a0() {
        C0016a c0016a = this.f14413n;
        if (this.f14418s) {
            return;
        }
        try {
            this.f14418s = true;
            if (this.f14415p) {
                this.f14416q = 0;
                m8697V(this.f14420u);
                return;
            }
            C0058k c0058k = (C0058k) c0016a.f56i;
            c0058k.m336B(0);
            this.f14416q = c0058k.m346L();
            this.f14417r = -1;
            m8697V(this.f14420u);
            if (this.f9217g.mo6236b(C2825b.f9188c)) {
                this.f14424y = f14400J;
                return;
            }
            C3315t c3315t = new C3315t(this);
            C4320p[] c4320pArr = new C4320p[c0016a.m202f()];
            c0016a.m214r(new C0305w(c3315t, 12, c4320pArr));
            this.f14424y = c4320pArr;
        } catch (Exception e6) {
            if (!this.f14415p) {
                m8706e0();
                this.f14415p = true;
                m8702a0();
                this.f14415p = false;
            }
            throw new C0079b(C5787h.m10469b(this, "Load method exception: " + e6.getClass().getSimpleName() + ": " + e6.getMessage()), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final C3515s m8703b0(C3514r c3514r) {
        int i9 = c3514r.f11439l;
        int iMax = -1;
        for (C3515s c3515s : this.f14404D) {
            if (c3515s.f11442g == i9) {
                iMax = Math.max(iMax, c3515s.f11443h);
            }
        }
        C3515s c3515s2 = new C3515s(i9, iMax + 1, c3514r);
        if (this.f14404D.isEmpty()) {
            this.f14404D = new ArrayList();
        }
        this.f14404D.add(c3515s2);
        return c3515s2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: c */
    public final List mo2218c() {
        List list = this.f14420u;
        if (list != null) {
            return list;
        }
        C0086a.m452k("Method generic types not initialized: ".concat(String.valueOf(this)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final C3514r m8704c0(AbstractC3506j abstractC3506j) {
        InterfaceC2844b interfaceC2844b = AbstractC3508l.f11418k;
        C3514r c3514r = new C3514r(0, abstractC3506j);
        c3514r.m6231w(EnumC2824a.f9159m);
        C3515s c3515sM8703b0 = m8703b0(c3514r);
        C0271b.m1072H(c3515sM8703b0);
        c3515sM8703b0.m7409n(abstractC3506j);
        return c3514r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14410k.compareTo(((C4322r) obj).f14410k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m, p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: d */
    public final String mo2219d() {
        return super.mo2219d().concat(" (m)");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final void m8705d0(String str) {
        C2992x c2992x = (C2992x) this.f9217g.mo6237c(C2825b.f9203r);
        if (c2992x == null) {
            this.f14410k.f10157n = str;
            return;
        }
        Iterator it = c2992x.f9766h.iterator();
        while (it.hasNext()) {
            ((C4322r) it.next()).f14410k.f10157n = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: e */
    public final AbstractC3506j mo2220e() {
        return this.f14419t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final void m8706e0() {
        this.f14418s = false;
        this.f14422w = null;
        this.f14423x = null;
        List list = Collections.EMPTY_LIST;
        this.f14404D = list;
        this.f14424y = null;
        this.f14425z = null;
        this.f14402B = null;
        this.f14403C = null;
        this.f14407G = null;
        this.f14405E = list;
        this.f14406F = list;
        m6229F();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4322r.class != obj.getClass()) {
            return false;
        }
        return this.f14410k.equals(((C4322r) obj).f14410k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public final void m8707f0() {
        List list = this.f14425z;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((C4305a) list.get(i9)).f14349j = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    public final List getTypeParameters() {
        return this.f14421v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14410k.f10156m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p110hc.InterfaceC1704a
    /* JADX INFO: renamed from: j */
    public final int mo4336j() {
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    /* JADX INFO: renamed from: m */
    public final String mo8666m() {
        return this.f14411l.f14379s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    /* JADX INFO: renamed from: n */
    public final C4325u mo8668n() {
        return this.f14411l.f14371k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: o */
    public final int mo2221o() {
        return this.f14412m.f488b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: q */
    public final C3131d mo2222q() {
        return this.f14410k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: s */
    public final List mo2223s() {
        C2994z c2994z = (C2994z) this.f9217g.mo6237c(C2825b.f9207v);
        if (c2994z != null) {
            return AbstractC5798s.m10509c(c2994z.f9769g, new C2833a(14));
        }
        C3383e c3383e = (C3383e) this.f9217g.mo6237c(C3126c.f10136i);
        return c3383e != null ? AbstractC5798s.m10509c(c3383e.f10917g, new C2833a(14)) : Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strValueOf = String.valueOf(this.f14411l);
        String str = this.f14410k.f10150g;
        String strM10516j = AbstractC5798s.m10516j(this.f14420u, ", ");
        String strValueOf2 = String.valueOf(this.f14419t);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strValueOf);
        sb2.append(".");
        sb2.append(str);
        sb2.append("(");
        sb2.append(strM10516j);
        return AbstractC0921a.m2255r(sb2, "):", strValueOf2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    public final String typeName() {
        return "method";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4317m
    /* JADX INFO: renamed from: v */
    public final boolean mo2224v() {
        return (this.f14412m.f488b & 128) != 0;
    }
}
