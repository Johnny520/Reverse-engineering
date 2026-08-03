package p144k;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import bsh.org.objectweb.asm.Opcodes;
import ca.C0532s;
import p015b0.C0151q;
import p028c1.AbstractC0378h;
import p036c9.C0423c0;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p071f1.C1003g;
import p071f1.C1006h0;
import p071f1.C1017n;
import p071f1.InterfaceC1026r0;
import p072f2.AbstractC1052o;
import p072f2.C1046i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p129ig.AbstractC2043a;
import p146k1.AbstractC2233b;
import p146k1.C2232a;
import p174m.C2638p;
import p174m.EnumC2640p1;
import p174m.InterfaceC2613i2;
import p176m1.AbstractC2722b;
import p176m1.C2724c;
import p176m1.C2729e0;
import p176m1.C2730f;
import p176m1.C2739j0;
import p187n.C2857k;
import p201o.AbstractC3026b;
import p222p.AbstractC3208d;
import p236q1.AbstractC3421a;
import p236q1.AbstractC3424d;
import p266s0.C3878h;
import p293u2.C4231a;
import p293u2.InterfaceC4233c;
import p307v0.AbstractC4371k;
import p308v1.C4390g;
import p308v1.C4427s0;
import p308v1.InterfaceC4412n0;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5600e2;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5845g;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.AbstractC5891i0;

/* JADX INFO: renamed from: k.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2192n {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m5424a(InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-932836462);
        int i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9 | (c1836h0.m4538h(interfaceC1231l) ? 32 : 16);
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            AbstractC3208d.m6873c(c1836h0, AbstractC0378h.m1339d(interfaceC5853o, interfaceC1231l));
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0151q(interfaceC5853o, interfaceC1231l, i9, 8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m5425b(AbstractC2233b abstractC2233b, String str, InterfaceC5853o interfaceC5853o, C4427s0 c4427s0, C1017n c1017n, C1836h0 c1836h0, int i9) {
        int i10;
        C5845g c5845g = C5840b.f23765k;
        c1836h0.m4527b0(1142754848);
        if ((i9 & 6) == 0) {
            i10 = ((i9 & 8) == 0 ? c1836h0.m4534f(abstractC2233b) : c1836h0.m4538h(abstractC2233b) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4534f(str) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4534f(interfaceC5853o) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= c1836h0.m4534f(c5845g) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= c1836h0.m4534f(c4427s0) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i10 |= c1836h0.m4528c(1.0f) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i9) == 0) {
            i10 |= c1836h0.m4534f(c1017n) ? 1048576 : 524288;
        }
        if (c1836h0.m4516S(i10 & 1, (599187 & i10) != 599186)) {
            InterfaceC5853o interfaceC5853oM2648a = C5850l.f23787a;
            C1823e c1823e = C1851l.f6155a;
            if (str != null) {
                c1836h0.m4525a0(1899222916);
                boolean z9 = (i10 & 112) == 32;
                Object objM4514P = c1836h0.m4514P();
                if (z9 || objM4514P == c1823e) {
                    objM4514P = new C0532s(str, 9);
                    c1836h0.m4545k0(objM4514P);
                }
                interfaceC5853oM2648a = AbstractC1052o.m2648a(interfaceC5853oM2648a, (InterfaceC1231l) objM4514P);
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(1899381698);
                c1836h0.m4553p(false);
            }
            InterfaceC5853o interfaceC5853oM1342g = AbstractC0378h.m1342g(AbstractC0378h.m1338c(interfaceC5853o.mo10549d(interfaceC5853oM2648a)), abstractC2233b, c4427s0, c1017n, 2);
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                objM4514P2 = C2214u0.f7338a;
                c1836h0.m4545k0(objM4514P2);
            }
            InterfaceC4412n0 interfaceC4412n0 = (InterfaceC4412n0) objM4514P2;
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM1342g);
            C3878h c3878hM4546l = c1836h0.m4546l();
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
            c1836h0.m4553p(true);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0423c0(abstractC2233b, str, interfaceC5853o, c4427s0, c1017n, i9, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m5426c(C2730f c2730f, String str, InterfaceC5853o interfaceC5853o, C1017n c1017n, C1836h0 c1836h0, int i9) {
        InterfaceC4233c interfaceC4233c = (InterfaceC4233c) c1836h0.m4542j(AbstractC5888h1.f23926h);
        boolean zM4532e = c1836h0.m4532e((((long) Float.floatToRawIntBits(interfaceC4233c.mo1333d())) & 4294967295L) | (((long) Float.floatToRawIntBits(c2730f.f8873j)) << 32));
        Object objM4514P = c1836h0.m4514P();
        if (zM4532e || objM4514P == C1851l.f6155a) {
            C2724c c2724c = new C2724c();
            AbstractC2722b.m6137a(c2724c, c2730f.f8869f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(interfaceC4233c.mo1601x0(c2730f.f8865b))) << 32) | (((long) Float.floatToRawIntBits(interfaceC4233c.mo1601x0(c2730f.f8866c))) & 4294967295L);
            float fIntBitsToFloat = c2730f.f8867d;
            float fIntBitsToFloat2 = c2730f.f8868e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            C2739j0 c2739j0 = new C2739j0(c2724c);
            String str2 = c2730f.f8864a;
            long j3 = c2730f.f8870g;
            C1017n c1017n2 = j3 != 16 ? new C1017n(j3, c2730f.f8871h) : null;
            boolean z9 = c2730f.f8872i;
            c2739j0.f8918e.setValue(new C0810e(jFloatToRawIntBits));
            c2739j0.f8919f.setValue(Boolean.valueOf(z9));
            C2729e0 c2729e0 = c2739j0.f8920g;
            c2729e0.f8855g.setValue(c1017n2);
            c2729e0.f8857i.setValue(new C0810e(jFloatToRawIntBits2));
            c2729e0.f8851c = str2;
            c1836h0.m4545k0(c2739j0);
            objM4514P = c2739j0;
        }
        m5425b((C2739j0) objM4514P, str, interfaceC5853o, C4390g.f14628b, c1017n, c1836h0, (i9 & 112) | 8 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (i9 & 3670016));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5427d(C1003g c1003g, String str, InterfaceC5853o interfaceC5853o, C4427s0 c4427s0, C1836h0 c1836h0, int i9, int i10) {
        Object obj;
        if ((i10 & 16) != 0) {
            c4427s0 = C4390g.f14628b;
        }
        C4427s0 c4427s02 = c4427s0;
        boolean zM4534f = c1836h0.m4534f(c1003g);
        Object objM4514P = c1836h0.m4514P();
        if (!zM4534f) {
            obj = objM4514P;
            if (objM4514P == C1851l.f6155a) {
                Bitmap bitmap = c1003g.f3179a;
                C2232a c2232a = new C2232a(c1003g, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
                c2232a.f7396g = 1;
                c1836h0.m4545k0(c2232a);
                obj = c2232a;
            }
        }
        m5425b((C2232a) obj, str, interfaceC5853o, c4427s02, null, c1836h0, (i9 & 112) | 8 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static float m5428e(EdgeEffect edgeEffect, float f3, float f10, InterfaceC4233c interfaceC4233c) {
        float f11 = AbstractC2169f0.f7183a;
        double dMo1333d = interfaceC4233c.mo1333d() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f3) * 0.35f;
        double d10 = ((double) AbstractC2169f0.f7183a) * dMo1333d;
        float fExp = (float) (Math.exp((AbstractC2169f0.f7184b / AbstractC2169f0.f7185c) * Math.log(dAbs / d10)) * d10);
        int i9 = Build.VERSION.SDK_INT;
        if (fExp > (i9 >= 31 ? AbstractC2186l.m5421b(edgeEffect) : 0.0f) * f10) {
            return 0.0f;
        }
        int iM5018X = AbstractC2043a.m5018X(f3);
        if (i9 >= 31) {
            edgeEffect.onAbsorb(iM5018X);
            return f3;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM5018X);
        }
        return f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static InterfaceC5853o m5429f(C1006h0 c1006h0) {
        return new C2189m(0L, c1006h0, AbstractC0996c0.f3162b, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC5853o m5430g(InterfaceC5853o interfaceC5853o, long j3, InterfaceC1026r0 interfaceC1026r0) {
        return interfaceC5853o.mo10549d(new C2189m(j3, null, interfaceC1026r0, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m5431h(long j3, EnumC2640p1 enumC2640p1) {
        if (enumC2640p1 == EnumC2640p1.f8622g) {
            if (C4231a.m8503g(j3) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC3026b.m6430c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C4231a.m8504h(j3) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC3026b.m6430c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static InterfaceC5853o m5432i(InterfaceC5853o interfaceC5853o, C2857k c2857k, InterfaceC2226y0 interfaceC2226y0, boolean z9, C1046i c1046i, InterfaceC1220a interfaceC1220a, int i9) {
        InterfaceC5853o interfaceC5853oMo10549d;
        if ((i9 & 4) != 0) {
            z9 = true;
        }
        boolean z10 = z9;
        if ((i9 & 16) != 0) {
            c1046i = null;
        }
        C1046i c1046i2 = c1046i;
        if (interfaceC2226y0 != null) {
            interfaceC5853oMo10549d = new C2213u(c2857k, interfaceC2226y0, false, z10, null, c1046i2, interfaceC1220a);
        } else if (interfaceC2226y0 == null) {
            interfaceC5853oMo10549d = new C2213u(c2857k, null, false, z10, null, c1046i2, interfaceC1220a);
        } else {
            C5850l c5850l = C5850l.f23787a;
            interfaceC5853oMo10549d = c2857k != null ? AbstractC2217v0.m5456a(c5850l, c2857k, interfaceC2226y0).mo10549d(new C2213u(c2857k, null, false, z10, null, c1046i2, interfaceC1220a)) : AbstractC5839a.m10541a(c5850l, new C2216v(interfaceC2226y0, z10, c1046i2, interfaceC1220a));
        }
        return interfaceC5853o.mo10549d(interfaceC5853oMo10549d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static InterfaceC5853o m5433j(InterfaceC5853o interfaceC5853o, boolean z9, String str, C2857k c2857k, InterfaceC1220a interfaceC1220a, int i9) {
        if ((i9 & 1) != 0) {
            z9 = true;
        }
        return interfaceC5853o.mo10549d(new C2213u((i9 & 8) != 0 ? null : c2857k, null, true, z9, (i9 & 2) != 0 ? null : str, null, interfaceC1220a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static InterfaceC5853o m5434k(InterfaceC5853o interfaceC5853o, C2857k c2857k, InterfaceC1220a interfaceC1220a) {
        return interfaceC5853o.mo10549d(new C2228z(interfaceC1220a, c2857k));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC5853o m5435l(InterfaceC5853o interfaceC5853o, boolean z9) {
        return interfaceC5853o.mo10549d(z9 ? new C2175h0() : C5850l.f23787a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [k.k0, x1.j] */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC2184k0 m5436m(AbstractC5615j abstractC5615j) {
        InterfaceC5600e2 interfaceC5600e2M10154j = AbstractC5618k.m10154j(abstractC5615j, C2187l0.f7262v);
        C2187l0 c2187l0 = interfaceC5600e2M10154j instanceof C2187l0 ? (C2187l0) interfaceC5600e2M10154j : null;
        if (c2187l0 != null) {
            return c2187l0.f7263u;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC5853o m5437n(InterfaceC5853o interfaceC5853o, C2857k c2857k, boolean z9) {
        return interfaceC5853o.mo10549d(z9 ? new C2199p0(c2857k) : C5850l.f23787a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final boolean m5438o(KeyEvent keyEvent) {
        long jM7198b = AbstractC3424d.m7198b(keyEvent);
        int i9 = AbstractC3421a.f11064O;
        return AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11072h) || AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11082r) || AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11054E) || AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11081q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m5439p(C1836h0 c1836h0) {
        return (((Configuration) c1836h0.m4542j(AbstractC5891i0.f23945a)).uiMode & 48) == 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final C2221w1 m5440q(C1836h0 c1836h0) {
        Object[] objArr = new Object[0];
        boolean zM4530d = c1836h0.m4530d(0);
        Object objM4514P = c1836h0.m4514P();
        if (zM4530d || objM4514P == C1851l.f6155a) {
            objM4514P = new C2209s1(0);
            c1836h0.m4545k0(objM4514P);
        }
        return (C2221w1) AbstractC4371k.m8807e(objArr, C2221w1.f7352j, (InterfaceC1220a) objM4514P, c1836h0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC5853o m5441r(InterfaceC5853o interfaceC5853o, C2221w1 c2221w1, boolean z9, boolean z10) {
        C2221w1 c2221w12;
        InterfaceC5853o interfaceC5853oM5442s;
        EnumC2640p1 enumC2640p1 = EnumC2640p1.f8622g;
        EnumC2640p1 enumC2640p12 = z9 ? enumC2640p1 : EnumC2640p1.f8623h;
        if (z10) {
            EnumC2640p1 enumC2640p13 = enumC2640p12;
            C2857k c2857k = c2221w1.f7356d;
            float f3 = AbstractC2225y.f7371a;
            C5850l c5850l = C5850l.f23787a;
            c2221w12 = c2221w1;
            interfaceC5853oM5442s = interfaceC5853o.mo10549d(enumC2640p13 == enumC2640p1 ? AbstractC0378h.m1337b(c5850l, C2196o0.f7285c) : AbstractC0378h.m1337b(c5850l, C2196o0.f7284b)).mo10549d(new C2224x1(null, null, enumC2640p13, c2221w1, c2857k, true, true));
        } else {
            c2221w12 = c2221w1;
            interfaceC5853oM5442s = m5442s(interfaceC5853o, c2221w12, enumC2640p12, null, true, null, c2221w12.f7356d);
        }
        return interfaceC5853oM5442s.mo10549d(new C2230z1(c2221w12, z9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static InterfaceC5853o m5442s(InterfaceC5853o interfaceC5853o, InterfaceC2613i2 interfaceC2613i2, EnumC2640p1 enumC2640p1, InterfaceC2185k1 interfaceC2185k1, boolean z9, C2638p c2638p, C2857k c2857k) {
        float f3 = AbstractC2225y.f7371a;
        EnumC2640p1 enumC2640p12 = EnumC2640p1.f8622g;
        C5850l c5850l = C5850l.f23787a;
        return interfaceC5853o.mo10549d(enumC2640p1 == enumC2640p12 ? AbstractC0378h.m1337b(c5850l, C2196o0.f7285c) : AbstractC0378h.m1337b(c5850l, C2196o0.f7284b)).mo10549d(new C2224x1(interfaceC2185k1, c2638p, enumC2640p1, interfaceC2613i2, c2857k, z9, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final long m5443t(long j3, float f3) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j3 >> 32)) - f3);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j3 & 4294967295L)) - f3);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }
}
