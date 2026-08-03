package p100h0;

import android.content.ClipDescription;
import gg.AbstractC1416l;
import java.util.ArrayList;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p014b.C0126e;
import p020b5.C0192k;
import p027c0.C0368m;
import p027c0.C0369n;
import p027c0.EnumC0370o;
import p040d0.AbstractC0649f;
import p040d0.InterfaceC0648e;
import p041d1.C0676v;
import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p089g1.C1275d;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p119i2.AbstractC1923e0;
import p119i2.C1914a;
import p119i2.C1926g;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p119i2.C1942o;
import p119i2.C1947r;
import p133j2.C2061k;
import p136j8.C2104o;
import p189n1.C2863b;
import p189n1.C2864c;
import p189n1.InterfaceC2862a;
import p190n2.C2884s;
import p201o.AbstractC3026b;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.InterfaceC3599t;
import p259r9.AbstractC3754e0;
import p259r9.C3766p;
import p276sf.C3958e;
import p276sf.C3967n;
import p321w.AbstractC4634s;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.C4630q1;
import p321w.EnumC4602h0;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4666q;
import p339x1.AbstractC5618k;
import p343x6.AbstractC5700d;
import p352xf.EnumC5799a;
import p357y1.C5886h;
import p357y1.InterfaceC5955y0;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h0.d1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1511d1 {

    /* JADX INFO: renamed from: A */
    public boolean f5028A;

    /* JADX INFO: renamed from: a */
    public final C4630q1 f5029a;

    /* JADX INFO: renamed from: d */
    public C4629q0 f5032d;

    /* JADX INFO: renamed from: f */
    public InterfaceC1220a f5034f;

    /* JADX INFO: renamed from: g */
    public InterfaceC5955y0 f5035g;

    /* JADX INFO: renamed from: h */
    public InterfaceC3599t f5036h;

    /* JADX INFO: renamed from: i */
    public C1542p f5037i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2862a f5038j;

    /* JADX INFO: renamed from: k */
    public C0676v f5039k;

    /* JADX INFO: renamed from: l */
    public final C1845j1 f5040l;

    /* JADX INFO: renamed from: m */
    public final C1845j1 f5041m;

    /* JADX INFO: renamed from: n */
    public long f5042n;

    /* JADX INFO: renamed from: o */
    public C1939m0 f5043o;

    /* JADX INFO: renamed from: p */
    public long f5044p;

    /* JADX INFO: renamed from: q */
    public final C1845j1 f5045q;

    /* JADX INFO: renamed from: r */
    public final C1845j1 f5046r;

    /* JADX INFO: renamed from: s */
    public int f5047s;

    /* JADX INFO: renamed from: t */
    public C2884s f5048t;

    /* JADX INFO: renamed from: u */
    public C1545q0 f5049u;

    /* JADX INFO: renamed from: v */
    public C1939m0 f5050v;

    /* JADX INFO: renamed from: w */
    public final C1845j1 f5051w;

    /* JADX INFO: renamed from: x */
    public final C0126e f5052x;

    /* JADX INFO: renamed from: y */
    public final C1505b1 f5053y;

    /* JADX INFO: renamed from: z */
    public final C1545q0 f5054z;

    /* JADX INFO: renamed from: b */
    public C0192k f5030b = AbstractC4634s.f15372f;

    /* JADX INFO: renamed from: c */
    public InterfaceC1231l f5031c = new C3766p(19);

    /* JADX INFO: renamed from: e */
    public final C1845j1 f5033e = AbstractC1874r.m4639u(new C2884s(7, (String) null, 0));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1511d1(C4630q1 c4630q1) {
        this.f5029a = c4630q1;
        Boolean bool = Boolean.TRUE;
        this.f5040l = AbstractC1874r.m4639u(bool);
        this.f5041m = AbstractC1874r.m4639u(bool);
        this.f5042n = 0L;
        this.f5044p = 0L;
        this.f5045q = AbstractC1874r.m4639u(null);
        this.f5046r = AbstractC1874r.m4639u(null);
        this.f5047s = -1;
        this.f5048t = new C2884s(7, (String) null, 0L);
        this.f5051w = AbstractC1874r.m4639u(Boolean.FALSE);
        C0126e c0126e = new C0126e(3, false);
        c0126e.f333i = EnumC0370o.f1041g;
        this.f5052x = c0126e;
        this.f5053y = new C1505b1(this);
        this.f5054z = new C1545q0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C3958e m4015a(C1511d1 c1511d1) {
        String str;
        C1939m0 c1939m0;
        C1926g c1926gM4027m = c1511d1.m4027m();
        if (c1926gM4027m == null || (str = c1926gM4027m.f6529h) == null || (c1939m0 = c1511d1.f5050v) == null) {
            return null;
        }
        long j3 = c1939m0.f6575a;
        int i9 = (int) (j3 >> 32);
        c1511d1.f5030b.m859l(i9);
        int i10 = (int) (j3 & 4294967295L);
        c1511d1.f5030b.m859l(i10);
        return new C3958e(str, new C1939m0(AbstractC1923e0.m4784b(i9, i10)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4016b(C1511d1 c1511d1, C1939m0 c1939m0) {
        C1926g c1926gM4027m;
        String str;
        InterfaceC3599t interfaceC3599t;
        if (c1939m0 == null) {
            return;
        }
        long j3 = c1939m0.f6575a;
        C1542p c1542p = c1511d1.f5037i;
        if (c1542p == null || (c1926gM4027m = c1511d1.m4027m()) == null || (str = c1926gM4027m.f6529h) == null) {
            return;
        }
        C0192k c0192k = c1511d1.f5030b;
        int i9 = (int) (j3 >> 32);
        c0192k.m859l(i9);
        int i10 = (int) (j3 & 4294967295L);
        c0192k.m859l(i10);
        long jM4784b = AbstractC1923e0.m4784b(i9, i10);
        if (str.length() <= 0 || C1939m0.m4813c(jM4784b) || (interfaceC3599t = c1511d1.f5036h) == null) {
            return;
        }
        AbstractC3603v.m7563q(interfaceC3599t, null, new C1502a1(c1542p, str, jM4784b, c1939m0, c1511d1, c0192k, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m4017c(C1511d1 c1511d1, C2884s c2884s, long j3, boolean z9, boolean z10, C1275d c1275d, boolean z11, C2863b c2863b) {
        C4618m1 c4618m1M9051d;
        long j4;
        int i9;
        long j5;
        C1554v c1554v;
        long j10;
        C1926g c1926g;
        C1554v c1554v2;
        boolean z12;
        InterfaceC2862a interfaceC2862a;
        C1552u c1552uM10284k;
        C1552u c1552u;
        C1552u c1552u2;
        C4629q0 c4629q0 = c1511d1.f5032d;
        if (c4629q0 == null || (c4618m1M9051d = c4629q0.m9051d()) == null) {
            return C1939m0.f6573b;
        }
        C0192k c0192k = c1511d1.f5030b;
        long j11 = c2884s.f9317b;
        C1926g c1926g2 = c2884s.f9316a;
        int i10 = C1939m0.f6574c;
        int i11 = (int) (j11 >> 32);
        c0192k.m859l(i11);
        int i12 = (int) (j11 & 4294967295L);
        c1511d1.f5030b.m859l(i12);
        long jM4784b = AbstractC1923e0.m4784b(i11, i12);
        int iM9037b = c4618m1M9051d.m9037b(j3, false);
        int i13 = (z10 || z9) ? iM9037b : (int) (jM4784b >> 32);
        if (!z10 || z9) {
            j4 = 4294967295L;
            i9 = iM9037b;
        } else {
            j4 = 4294967295L;
            i9 = (int) (jM4784b & 4294967295L);
        }
        C1545q0 c1545q0 = c1511d1.f5049u;
        int i14 = -1;
        if (z9 || c1545q0 == null) {
            j5 = j4;
        } else {
            j5 = j4;
            int i15 = c1511d1.f5047s;
            if (i15 != -1) {
                i14 = i15;
            }
        }
        C1935k0 c1935k0 = c4618m1M9051d.f15293a;
        if (z9) {
            c1926g = c1926g2;
            j10 = j11;
            c1554v = null;
        } else {
            j10 = j11;
            int i16 = (int) (jM4784b >> 32);
            c1926g = c1926g2;
            int i17 = (int) (jM4784b & j5);
            c1554v = new C1554v(new C1552u(AbstractC0018a.m261y(c1935k0, i16), i16, 1L), new C1552u(AbstractC0018a.m261y(c1935k0, i17), i17, 1L), C1939m0.m4817g(jM4784b));
        }
        C1545q0 c1545q02 = new C1545q0(z10, c1554v, new C1548s(i13, i9, i14, c1935k0));
        if (c1554v != null && c1545q0 != null && z10 == c1545q0.f5152b) {
            C1548s c1548s = (C1548s) c1545q0.f5154d;
            if (i13 == c1548s.f5161b && i9 == c1548s.f5162c) {
                return j10;
            }
        }
        c1511d1.f5049u = c1545q02;
        c1511d1.f5047s = iM9037b;
        int i18 = c1275d.f4235g;
        EnumC1521h enumC1521h = EnumC1521h.f5080g;
        Object obj = c1545q02.f5154d;
        switch (i18) {
            case 8:
                C1548s c1548s2 = (C1548s) obj;
                c1554v2 = new C1554v(c1548s2.m4046a(c1548s2.f5161b), c1548s2.m4046a(c1548s2.f5162c), c1545q02.m4043d() == enumC1521h);
                break;
            case 9:
                c1554v2 = AbstractC5700d.m10280i(c1545q02, C1556w.f5190c);
                break;
            case 10:
                c1554v2 = AbstractC5700d.m10280i(c1545q02, C1556w.f5189b);
                break;
            default:
                c1554v2 = (C1554v) c1545q02.f5153c;
                C1548s c1548s3 = (C1548s) obj;
                if (c1554v2 == null) {
                    c1554v2 = AbstractC5700d.m10280i(c1545q02, C1556w.f5190c);
                    break;
                } else {
                    C1552u c1552u3 = c1554v2.f5185b;
                    C1552u c1552u4 = c1554v2.f5184a;
                    if (c1545q02.f5152b) {
                        c1552uM10284k = AbstractC5700d.m10284k(c1545q02, c1548s3, c1552u4);
                        c1552u2 = c1552u3;
                        c1552u3 = c1552u4;
                        c1552u = c1552uM10284k;
                    } else {
                        c1552uM10284k = AbstractC5700d.m10284k(c1545q02, c1548s3, c1552u3);
                        c1552u = c1552u4;
                        c1552u2 = c1552uM10284k;
                    }
                    if (!AbstractC1416l.m3825a(c1552uM10284k, c1552u3)) {
                        C1554v c1554v3 = new C1554v(c1552u, c1552u2, c1545q02.m4043d() == enumC1521h || (c1545q02.m4043d() == EnumC1521h.f5082i && c1552u.f5179b > c1552u2.f5179b));
                        C1548s c1548s4 = (C1548s) obj;
                        C1552u c1552u5 = c1554v3.f5184a;
                        long j12 = c1552u5.f5180c;
                        C1552u c1552u6 = c1554v3.f5185b;
                        if (j12 != c1552u6.f5180c) {
                            boolean z13 = c1554v3.f5186c;
                            if ((z13 ? c1552u5 : c1552u6).f5179b == 0) {
                                if (((C1935k0) c1548s4.f5164e).f6561a.f6549a.f6529h.length() != (z13 ? c1552u6 : c1552u5).f5179b) {
                                }
                            }
                            c1554v2 = c1554v3;
                            break;
                        } else if (c1552u5.f5179b == c1552u6.f5179b) {
                            C1554v c1554v4 = (C1554v) c1545q02.f5153c;
                            String str = ((C1935k0) c1548s4.f5164e).f6561a.f6549a.f6529h;
                            if (c1554v4 == null || str.length() == 0) {
                                c1554v2 = c1554v3;
                            } else {
                                boolean z14 = c1545q02.f5152b;
                                String str2 = ((C1935k0) c1548s4.f5164e).f6561a.f6549a.f6529h;
                                int i19 = c1548s4.f5161b;
                                int length = str2.length();
                                if (i19 == 0) {
                                    int iM9074q = AbstractC4634s.m9074q(0, str2);
                                    c1554v2 = !z14 ? C1554v.m4068a(c1554v3, null, AbstractC5700d.m10288o(c1552u6, c1548s4, iM9074q), false, 1) : C1554v.m4068a(c1554v3, AbstractC5700d.m10288o(c1552u5, c1548s4, iM9074q), null, true, 2);
                                } else if (i19 != length) {
                                    boolean z15 = c1554v4.f5186c;
                                    int iM9077t = z14 ^ z15 ? AbstractC4634s.m9077t(i19, str2) : AbstractC4634s.m9074q(i19, str2);
                                    c1554v2 = !z14 ? C1554v.m4068a(c1554v3, null, AbstractC5700d.m10288o(c1552u6, c1548s4, iM9077t), z15, 1) : C1554v.m4068a(c1554v3, AbstractC5700d.m10288o(c1552u5, c1548s4, iM9077t), null, z15, 2);
                                } else {
                                    int iM9077t2 = AbstractC4634s.m9077t(length, str2);
                                    c1554v2 = !z14 ? C1554v.m4068a(c1554v3, null, AbstractC5700d.m10288o(c1552u6, c1548s4, iM9077t2), true, 1) : C1554v.m4068a(c1554v3, AbstractC5700d.m10288o(c1552u5, c1548s4, iM9077t2), null, false, 2);
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
        C0192k c0192k2 = c1511d1.f5030b;
        int i20 = c1554v2.f5184a.f5179b;
        c0192k2.m861n(i20);
        C0192k c0192k3 = c1511d1.f5030b;
        int i21 = c1554v2.f5185b.f5179b;
        c0192k3.m861n(i21);
        long jM4784b2 = AbstractC1923e0.m4784b(i20, i21);
        long j13 = j10;
        if (C1939m0.m4812b(jM4784b2, j13)) {
            return j13;
        }
        boolean z16 = C1939m0.m4817g(jM4784b2) != C1939m0.m4817g(j13) && C1939m0.m4812b(AbstractC1923e0.m4784b((int) (jM4784b2 & j5), (int) (jM4784b2 >> 32)), j13);
        boolean z17 = C1939m0.m4813c(jM4784b2) && C1939m0.m4813c(j13);
        if (z11 && c1926g.f6529h.length() > 0 && !z16 && !z17 && c2863b != null && (interfaceC2862a = c1511d1.f5038j) != null) {
            ((C2864c) interfaceC2862a).m6283a(c2863b.f9257a);
        }
        c1511d1.f5031c.invoke(m4018e(c1926g, jM4784b2));
        c1511d1.f5050v = new C1939m0(jM4784b2);
        if (!z11) {
            c1511d1.m4034t(!C1939m0.m4813c(jM4784b2));
        }
        C4629q0 c4629q02 = c1511d1.f5032d;
        if (c4629q02 != null) {
            c4629q02.f15342q.setValue(Boolean.valueOf(z11));
        }
        C4629q0 c4629q03 = c1511d1.f5032d;
        if (c4629q03 != null) {
            c4629q03.f15338m.setValue(Boolean.valueOf(!C1939m0.m4813c(jM4784b2) && AbstractC1184v0.m3216z(c1511d1, true)));
        }
        C4629q0 c4629q04 = c1511d1.f5032d;
        if (c4629q04 != null) {
            z12 = false;
            c4629q04.f15339n.setValue(Boolean.valueOf(!C1939m0.m4813c(jM4784b2) && AbstractC1184v0.m3216z(c1511d1, false)));
        } else {
            z12 = false;
        }
        C4629q0 c4629q05 = c1511d1.f5032d;
        if (c4629q05 != null) {
            c4629q05.f15340o.setValue(Boolean.valueOf((C1939m0.m4813c(jM4784b2) && AbstractC1184v0.m3216z(c1511d1, true)) ? true : z12));
        }
        return jM4784b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C2884s m4018e(C1926g c1926g, long j3) {
        return new C2884s(c1926g, j3, (C1939m0) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C3560e1 m4019d(boolean z9) {
        InterfaceC3599t interfaceC3599t = this.f5036h;
        if (interfaceC3599t != null) {
            return AbstractC3603v.m7563q(interfaceC3599t, null, new C1559x0(this, z9, (InterfaceC5557c) null), 1);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4020f() {
        InterfaceC3599t interfaceC3599t = this.f5036h;
        if (interfaceC3599t != null) {
            AbstractC3603v.m7563q(interfaceC3599t, null, new C1553u0(this, null, 1), 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4021g(C0807b c0807b) {
        int iM4815e;
        if (!C1939m0.m4813c(m4028n().f9317b)) {
            C4629q0 c4629q0 = this.f5032d;
            C4618m1 c4618m1M9051d = c4629q0 != null ? c4629q0.m9051d() : null;
            if (c0807b == null || c4618m1M9051d == null) {
                iM4815e = C1939m0.m4815e(m4028n().f9317b);
            } else {
                C0192k c0192k = this.f5030b;
                iM4815e = c4618m1M9051d.m9037b(c0807b.f2414a, true);
                c0192k.m861n(iM4815e);
            }
            C2884s c2884sM6290a = C2884s.m6290a(m4028n(), null, AbstractC1923e0.m4784b(iM4815e, iM4815e), 5);
            this.f5031c.invoke(c2884sM6290a);
            this.f5050v = new C1939m0(c2884sM6290a.f9317b);
        }
        m4031q((c0807b == null || m4028n().f9316a.f6529h.length() <= 0) ? EnumC4602h0.f15180g : EnumC4602h0.f15182i);
        m4034t(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4022h(boolean z9) {
        C0676v c0676v;
        C4629q0 c4629q0 = this.f5032d;
        if (c4629q0 != null && !c4629q0.m9049b() && (c0676v = this.f5039k) != null) {
            C0676v.m1859a(c0676v);
        }
        this.f5048t = m4028n();
        m4034t(z9);
        m4031q(EnumC4602h0.f15181h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final C0807b m4023i() {
        return (C0807b) this.f5046r.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m4024j() {
        return ((Boolean) this.f5040l.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m4025k() {
        return ((Boolean) this.f5041m.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final long m4026l(boolean z9) {
        C4618m1 c4618m1M9051d;
        long j3;
        C4629q0 c4629q0 = this.f5032d;
        if (c4629q0 == null || (c4618m1M9051d = c4629q0.m9051d()) == null) {
            return 9205357640488583168L;
        }
        C1935k0 c1935k0 = c4618m1M9051d.f15293a;
        C1942o c1942o = c1935k0.f6562b;
        C1926g c1926gM4027m = m4027m();
        if (c1926gM4027m == null) {
            return 9205357640488583168L;
        }
        if (!AbstractC1416l.m3825a(c1926gM4027m.f6529h, c1935k0.f6561a.f6549a.f6529h)) {
            return 9205357640488583168L;
        }
        C2884s c2884sM4028n = m4028n();
        if (z9) {
            long j4 = c2884sM4028n.f9317b;
            int i9 = C1939m0.f6574c;
            j3 = j4 >> 32;
        } else {
            long j5 = c2884sM4028n.f9317b;
            int i10 = C1939m0.f6574c;
            j3 = j5 & 4294967295L;
        }
        int i11 = (int) j3;
        this.f5030b.m859l(i11);
        boolean zM4817g = C1939m0.m4817g(m4028n().f9317b);
        long j10 = c1935k0.f6563c;
        int iM4827d = c1942o.m4827d(i11);
        if (iM4827d >= c1942o.f6588f) {
            return 9205357640488583168L;
        }
        boolean z10 = c1935k0.m4801a(((!z9 || zM4817g) && (z9 || !zM4817g)) ? Math.max(i11 + (-1), 0) : i11) == c1935k0.m4808h(i11);
        c1942o.m4833l(i11);
        int length = ((C1926g) c1942o.f6583a.f839b).f6529h.length();
        ArrayList arrayList = c1942o.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(i11 == length ? AbstractC0000a.m54b0(arrayList) : AbstractC1923e0.m4786d(i11, arrayList));
        C1914a c1914a = c1947r.f6596a;
        int iM4838d = c1947r.m4838d(i11);
        C2061k c2061k = c1914a.f6459d;
        return (((long) Float.floatToRawIntBits(AbstractC3754e0.m7907q(c1942o.m4825b(iM4827d), 0.0f, (int) (j10 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC3754e0.m7907q(z10 ? c2061k.m5116h(iM4838d, false) : c2061k.m5117i(iM4838d, false), 0.0f, (int) (j10 >> 32)))) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final C1926g m4027m() {
        C4629q0 c4629q0 = this.f5032d;
        if (c4629q0 != null) {
            return c4629q0.f15326a.f15436a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final C2884s m4028n() {
        return (C2884s) this.f5033e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m4029o() {
        C3560e1 c3560e1;
        C0369n c0369n = (C0369n) this.f5052x.f332h;
        if (c0369n == null || (c3560e1 = c0369n.f1034A) == null) {
            return;
        }
        c3560e1.mo7485a(null);
        c0369n.f1034A = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m4030p() {
        InterfaceC3599t interfaceC3599t = this.f5036h;
        if (interfaceC3599t != null) {
            AbstractC3603v.m7563q(interfaceC3599t, null, new C1553u0(this, null, 2), 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m4031q(EnumC4602h0 enumC4602h0) {
        C4629q0 c4629q0 = this.f5032d;
        if (c4629q0 != null) {
            if (c4629q0.m9048a() == enumC4602h0) {
                c4629q0 = null;
            }
            if (c4629q0 != null) {
                c4629q0.f15336k.setValue(enumC4602h0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.f15342q.getValue()).booleanValue() == false) goto L34;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4032r() {
        InterfaceC0648e interfaceC0648e;
        AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
        InterfaceC5557c interfaceC5557c = null;
        InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
        AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
        try {
            if (m4025k()) {
                C4629q0 c4629q0 = this.f5032d;
                if (c4629q0 != null) {
                }
                AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
                C0126e c0126e = this.f5052x;
                if (((EnumC0370o) c0126e.f333i) == EnumC0370o.f1041g) {
                    AbstractC3026b.m6430c("ToolbarRequester is not initialized.");
                }
                C0369n c0369n = (C0369n) c0126e.f332h;
                if (c0369n == null || !c0369n.f23801t) {
                    return;
                }
                C3560e1 c3560e1 = c0369n.f1034A;
                if ((c3560e1 == null || !c3560e1.mo7486b()) && (interfaceC0648e = (InterfaceC0648e) AbstractC5618k.m10152h(c0369n, AbstractC0649f.f2015b)) != null) {
                    c0369n.f1034A = AbstractC3603v.m7563q(c0369n.m10550Y0(), null, new C0368m(c0369n, interfaceC0648e, interfaceC5557c, 0), 1);
                }
            }
        } finally {
            AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4033s(AbstractC6038c abstractC6038c) {
        C1508c1 c1508c1;
        C1511d1 c1511d1;
        if (abstractC6038c instanceof C1508c1) {
            c1508c1 = (C1508c1) abstractC6038c;
            int i9 = c1508c1.f5020j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1508c1.f5020j = i9 - Integer.MIN_VALUE;
            } else {
                c1508c1 = new C1508c1(this, abstractC6038c);
            }
        }
        Object objValueOf = c1508c1.f5018h;
        int i10 = c1508c1.f5020j;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objValueOf);
            InterfaceC5955y0 interfaceC5955y0 = this.f5035g;
            if (interfaceC5955y0 != null) {
                c1508c1.f5017g = this;
                c1508c1.f5020j = 1;
                ClipDescription primaryClipDescription = ((C5886h) interfaceC5955y0).f23887a.m10610a().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                Object obj = EnumC5799a.f23547g;
                if (objValueOf == obj) {
                    return obj;
                }
                c1511d1 = this;
            }
            return C3967n.f12976a;
        }
        if (i10 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c1511d1 = c1508c1.f5017g;
        AbstractC1089i.m2732I0(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        c1511d1.f5051w.setValue(bool);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m4034t(boolean z9) {
        C4629q0 c4629q0 = this.f5032d;
        if (c4629q0 != null) {
            c4629q0.f15337l.setValue(Boolean.valueOf(z9));
        }
        if (z9) {
            m4032r();
        } else {
            m4029o();
        }
    }
}
