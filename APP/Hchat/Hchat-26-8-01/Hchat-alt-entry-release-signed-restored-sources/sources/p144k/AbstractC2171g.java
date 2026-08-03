package p144k;

import android.view.KeyEvent;
import gg.AbstractC1416l;
import gg.C1421q;
import mg.InterfaceC2842d;
import p027c0.C0361f;
import p027c0.C0364i;
import p027c0.C0368m;
import p036c9.C0446i;
import p069f.AbstractC0948n;
import p069f.C0968z;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1060w;
import p072f2.C1038a;
import p072f2.C1046i;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1220a;
import p116i.C1802x0;
import p187n.C2854h;
import p187n.C2855i;
import p187n.C2857k;
import p187n.C2858l;
import p187n.C2859m;
import p224p1.C3287b;
import p224p1.InterfaceC3288c;
import p236q1.AbstractC3424d;
import p236q1.InterfaceC3425e;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.C3593q;
import p249qg.InterfaceC3596r0;
import p267s1.C3903k;
import p267s1.C3906l0;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5600e2;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5612i;
import p339x1.InterfaceC5626m1;
import p339x1.InterfaceC5656w1;
import p339x1.InterfaceC5665z1;
import p357y1.AbstractC5888h1;
import p357y1.InterfaceC5905l2;
import vg.C4554c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: k.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2171g extends AbstractC5615j implements InterfaceC5656w1, InterfaceC3425e, InterfaceC5665z1, InterfaceC5600e2, InterfaceC5609h, InterfaceC5626m1, InterfaceC3288c, InterfaceC2184k0 {

    /* JADX INFO: renamed from: Q */
    public static final C2156b f7188Q = new C2156b();

    /* JADX INFO: renamed from: A */
    public C1046i f7189A;

    /* JADX INFO: renamed from: B */
    public boolean f7190B;

    /* JADX INFO: renamed from: C */
    public InterfaceC1220a f7191C;

    /* JADX INFO: renamed from: D */
    public final C2178i0 f7192D;

    /* JADX INFO: renamed from: E */
    public InterfaceC2226y0 f7193E;

    /* JADX INFO: renamed from: F */
    public C3906l0 f7194F;

    /* JADX INFO: renamed from: G */
    public C2187l0 f7195G;

    /* JADX INFO: renamed from: H */
    public InterfaceC5612i f7196H;

    /* JADX INFO: renamed from: I */
    public C2859m f7197I;

    /* JADX INFO: renamed from: J */
    public C2854h f7198J;

    /* JADX INFO: renamed from: K */
    public final C0968z f7199K;

    /* JADX INFO: renamed from: L */
    public C2859m f7200L;

    /* JADX INFO: renamed from: M */
    public C2857k f7201M;

    /* JADX INFO: renamed from: N */
    public boolean f7202N;

    /* JADX INFO: renamed from: O */
    public C3560e1 f7203O;

    /* JADX INFO: renamed from: P */
    public final C2156b f7204P;

    /* JADX INFO: renamed from: w */
    public C2857k f7205w;

    /* JADX INFO: renamed from: x */
    public InterfaceC2226y0 f7206x;

    /* JADX INFO: renamed from: y */
    public boolean f7207y;

    /* JADX INFO: renamed from: z */
    public String f7208z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2171g(C2857k c2857k, InterfaceC2226y0 interfaceC2226y0, boolean z9, boolean z10, String str, C1046i c1046i, InterfaceC1220a interfaceC1220a) {
        this.f7205w = c2857k;
        this.f7206x = interfaceC2226y0;
        this.f7207y = z9;
        this.f7208z = str;
        this.f7189A = c1046i;
        this.f7190B = z10;
        this.f7191C = interfaceC1220a;
        this.f7192D = new C2178i0(c2857k, 0, new C0361f(1, this, AbstractC2171g.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 26));
        int i9 = AbstractC0948n.f2993a;
        this.f7199K = new C0968z(6);
        C2857k c2857k2 = this.f7205w;
        this.f7201M = c2857k2;
        this.f7202N = c2857k2 == null;
        this.f7204P = f7188Q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p236q1.InterfaceC3425e
    /* JADX INFO: renamed from: C */
    public final boolean mo5389C(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5626m1
    /* JADX INFO: renamed from: C0 */
    public final void mo1327C0() {
        if (this.f7207y) {
            AbstractC5618k.m10162r(this, new C2153a(this, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5600e2
    /* JADX INFO: renamed from: F */
    public final Object mo742F() {
        return this.f7204P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public void mo1608P(C3903k c3903k, EnumC3905l enumC3905l, long j3) {
        C3906l0 c3906l0Mo5379o1;
        long j4 = ((j3 >> 33) << 32) | (((j3 << 32) >> 33) & 4294967295L);
        Float.floatToRawIntBits((int) (j4 >> 32));
        Float.floatToRawIntBits((int) (j4 & 4294967295L));
        m5397v1();
        if (this.f7190B) {
            if (this.f7195G == null) {
                C2187l0 c2187l0 = new C2187l0(this);
                m10122k1(c2187l0);
                this.f7195G = c2187l0;
            }
            if (enumC3905l == EnumC3905l.f12813h) {
                int i9 = c3903k.f12805f;
                InterfaceC5557c interfaceC5557c = null;
                if (i9 == 4) {
                    AbstractC3603v.m7563q(m10550Y0(), null, new C2168f(this, interfaceC5557c, 0), 3);
                } else if (i9 == 5) {
                    AbstractC3603v.m7563q(m10550Y0(), null, new C2168f(this, interfaceC5557c, 1), 3);
                }
            }
        }
        if (this.f7194F == null && (c3906l0Mo5379o1 = mo5379o1()) != null) {
            m10122k1(c3906l0Mo5379o1);
            this.f7194F = c3906l0Mo5379o1;
        }
        C3906l0 c3906l0 = this.f7194F;
        if (c3906l0 != null) {
            c3906l0.mo1608P(c3903k, enumC3905l, j3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: S0 */
    public final boolean mo1609S0() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p236q1.InterfaceC3425e
    /* JADX INFO: renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo5390W(KeyEvent keyEvent) {
        boolean z9;
        m5397v1();
        long jM7198b = AbstractC3424d.m7198b(keyEvent);
        boolean z10 = this.f7190B;
        InterfaceC5557c interfaceC5557c = null;
        C0968z c0968z = this.f7199K;
        if (!z10 || AbstractC3424d.m7199c(keyEvent) != 2 || !AbstractC2192n.m5438o(keyEvent)) {
            if (this.f7190B && AbstractC3424d.m7199c(keyEvent) == 1 && AbstractC2192n.m5438o(keyEvent)) {
                C2859m c2859m = (C2859m) c0968z.m2392f(jM7198b);
                if (c2859m != null) {
                    if (this.f7205w != null) {
                        AbstractC3603v.m7563q(m10550Y0(), null, new C2165e(this, c2859m, interfaceC5557c, 3), 3);
                    }
                    mo5383y1(keyEvent);
                }
                if (c2859m != null) {
                    return true;
                }
            }
            return false;
        }
        if (c0968z.m2388b(jM7198b)) {
            z9 = false;
        } else {
            C2859m c2859m2 = new C2859m();
            c0968z.m2393g(c2859m2, jM7198b);
            if (this.f7205w != null) {
                AbstractC3603v.m7563q(m10550Y0(), null, new C2165e(this, c2859m2, interfaceC5557c, 2), 3);
            }
            z9 = true;
        }
        if (!mo5381x1(keyEvent) && !z9) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        C1046i c1046i = this.f7189A;
        if (c1046i != null) {
            AbstractC1060w.m2680c(interfaceC1062y, c1046i.f3287a);
        }
        String str = this.f7208z;
        C2153a c2153a = new C2153a(this, 1);
        InterfaceC2842d[] interfaceC2842dArr = AbstractC1060w.f3404a;
        interfaceC1062y.mo2644a(AbstractC1049l.f3316b, new C1038a(str, c2153a));
        if (this.f7190B) {
            this.f7192D.mo1610X0(interfaceC1062y);
        } else {
            interfaceC1062y.mo2644a(AbstractC1058u.f3385j, C3967n.f12976a);
        }
        mo5378n1(interfaceC1062y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public void mo1611b0() {
        C2854h c2854h;
        C2857k c2857k = this.f7205w;
        if (c2857k != null && (c2854h = this.f7198J) != null) {
            c2857k.m6282b(new C2855i(c2854h));
        }
        this.f7198J = null;
        C3906l0 c3906l0 = this.f7194F;
        if (c3906l0 != null) {
            c3906l0.mo1611b0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        mo1327C0();
        if (!this.f7202N) {
            m5397v1();
        }
        if (this.f7190B) {
            m10122k1(this.f7192D);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        m5391p1();
        if (this.f7201M == null) {
            this.f7205w = null;
        }
        InterfaceC5612i interfaceC5612i = this.f7196H;
        if (interfaceC5612i != null) {
            m10123l1(interfaceC5612i);
        }
        this.f7196H = null;
        C2187l0 c2187l0 = this.f7195G;
        if (c2187l0 != null) {
            m10123l1(c2187l0);
        }
        this.f7195G = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public C3906l0 mo5379o1() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX INFO: renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5391p1() {
        C2857k c2857k = this.f7205w;
        C0968z c0968z = this.f7199K;
        if (c2857k != null) {
            C2859m c2859m = this.f7197I;
            if (c2859m != null) {
                c2857k.m6282b(new C2858l(c2859m));
            }
            C2859m c2859m2 = this.f7200L;
            if (c2859m2 != null) {
                c2857k.m6282b(new C2858l(c2859m2));
            }
            C2854h c2854h = this.f7198J;
            if (c2854h != null) {
                c2857k.m6282b(new C2855i(c2854h));
            }
            Object[] objArr = c0968z.f3047c;
            long[] jArr = c0968z.f3045a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j3 = jArr[i9];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j3) < 128) {
                                c2857k.m6282b(new C2858l((C2859m) objArr[(i9 << 3) + i11]));
                            }
                            j3 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i9 == length) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
            }
        }
        this.f7197I = null;
        this.f7200L = null;
        this.f7198J = null;
        c0968z.m2387a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q1 */
    public final long m5392q1(long j3) {
        long jMo1593L0 = AbstractC5618k.m10167w(this).f22771E.mo1593L0(((InterfaceC5905l2) AbstractC5618k.m10152h(this, AbstractC5888h1.f23938t)).mo10227d());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo1593L0 >> 32)) - ((int) (j3 >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1593L0 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r1 */
    public final void m5393r1(boolean z9) {
        C2857k c2857k = this.f7205w;
        if (c2857k != null) {
            C3560e1 c3560e1 = this.f7203O;
            InterfaceC5557c interfaceC5557c = null;
            if (c3560e1 == null || !c3560e1.mo7486b()) {
                C2859m c2859m = z9 ? this.f7200L : this.f7197I;
                if (c2859m != null) {
                    C2858l c2858l = new C2858l(c2859m);
                    InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) ((C4554c) m10550Y0()).f15022g.mo2062s(C3593q.f11607h);
                    AbstractC3603v.m7563q(m10550Y0(), null, new C0368m(c2857k, c2858l, interfaceC3596r0 != null ? interfaceC3596r0.mo7491o(new C0446i(c2857k, 24, c2858l)) : null, interfaceC5557c, 7), 3);
                }
            } else {
                C3560e1 c3560e12 = this.f7203O;
                if (c3560e12 != null) {
                    c3560e12.mo7485a(null);
                }
            }
            if (z9) {
                this.f7200L = null;
            } else {
                this.f7197I = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s1 */
    public final void m5394s1(long j3, boolean z9) {
        C2857k c2857k = this.f7205w;
        if (c2857k != null) {
            C3560e1 c3560e1 = this.f7203O;
            if (c3560e1 == null || !c3560e1.mo7486b()) {
                C2859m c2859m = z9 ? this.f7200L : this.f7197I;
                if (c2859m != null) {
                    AbstractC3603v.m7563q(m10550Y0(), null, new C2159c(c2859m, c2857k, null), 3);
                }
            } else {
                c3560e1.mo7485a(null);
                AbstractC3603v.m7563q(m10550Y0(), null, new C0364i(c3560e1, j3, c2857k, (InterfaceC5557c) null, 3), 3);
            }
            if (z9) {
                this.f7200L = null;
            } else {
                this.f7197I = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t1 */
    public final void m5395t1(C3287b c3287b) {
        C2857k c2857k = this.f7205w;
        if (c2857k != null) {
            C2859m c2859m = new C2859m();
            C1421q c1421q = new C1421q();
            AbstractC5618k.m10170z(this, C2187l0.f7262v, new C1802x0(new C0446i(c3287b, 27, c1421q), 1));
            InterfaceC5557c interfaceC5557c = null;
            if (c1421q.f4734g || AbstractC2222x.m5463a(this)) {
                this.f7203O = AbstractC3603v.m7563q(m10550Y0(), null, new C2162d(c2857k, c2859m, this, interfaceC5557c, 0), 3);
            } else {
                this.f7200L = c2859m;
                AbstractC3603v.m7563q(m10550Y0(), null, new C2159c(c2857k, c2859m, interfaceC5557c, 1), 3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u1 */
    public final void m5396u1(C3914t c3914t) {
        boolean z9;
        C2857k c2857k = this.f7205w;
        if (c2857k != null) {
            C2859m c2859m = new C2859m();
            if (c3914t == null) {
                z9 = AbstractC2192n.m5436m(this) != null;
            } else {
                C1421q c1421q = new C1421q();
                AbstractC5618k.m10170z(this, C2187l0.f7262v, new C1802x0(new C0446i(c3914t, 28, c1421q), 1));
                z9 = c1421q.f4734g;
            }
            InterfaceC5557c interfaceC5557c = null;
            if (z9 || AbstractC2222x.m5463a(this)) {
                this.f7203O = AbstractC3603v.m7563q(m10550Y0(), null, new C2162d(c2857k, c2859m, this, interfaceC5557c, 1), 3);
            } else {
                this.f7197I = c2859m;
                AbstractC3603v.m7563q(m10550Y0(), null, new C2159c(c2857k, c2859m, interfaceC5557c, 2), 3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v1 */
    public final void m5397v1() {
        if (this.f7196H != null) {
            return;
        }
        InterfaceC2226y0 interfaceC2226y0 = this.f7207y ? this.f7193E : this.f7206x;
        if (interfaceC2226y0 != null) {
            if (this.f7205w == null) {
                this.f7205w = new C2857k();
            }
            this.f7192D.m5417o1(this.f7205w);
            C2857k c2857k = this.f7205w;
            c2857k.getClass();
            InterfaceC5612i interfaceC5612iMo1606a = interfaceC2226y0.mo1606a(c2857k);
            m10122k1(interfaceC5612iMo1606a);
            this.f7196H = interfaceC5612iMo1606a;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo5381x1(KeyEvent keyEvent);

    /* JADX INFO: renamed from: y1 */
    public abstract void mo5383y1(KeyEvent keyEvent);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX INFO: renamed from: z1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5398z1(C2857k c2857k, InterfaceC2226y0 interfaceC2226y0, boolean z9, boolean z10, String str, C1046i c1046i, InterfaceC1220a interfaceC1220a) {
        boolean z11;
        InterfaceC5612i interfaceC5612i;
        boolean z12 = true;
        if (AbstractC1416l.m3825a(this.f7201M, c2857k)) {
            z11 = false;
        } else {
            m5391p1();
            this.f7201M = c2857k;
            this.f7205w = c2857k;
            z11 = true;
        }
        if (!AbstractC1416l.m3825a(this.f7206x, interfaceC2226y0)) {
            this.f7206x = interfaceC2226y0;
            z11 = true;
        }
        if (this.f7207y != z9) {
            this.f7207y = z9;
            if (z9) {
                mo1327C0();
            }
            z11 = true;
        }
        boolean z13 = this.f7190B;
        C2178i0 c2178i0 = this.f7192D;
        if (z13 != z10) {
            if (z10) {
                m10122k1(c2178i0);
            } else {
                m10123l1(c2178i0);
                m5391p1();
            }
            AbstractC5618k.m10158n(this);
            this.f7190B = z10;
        }
        if (!AbstractC1416l.m3825a(this.f7208z, str)) {
            this.f7208z = str;
            AbstractC5618k.m10158n(this);
        }
        if (!AbstractC1416l.m3825a(this.f7189A, c1046i)) {
            this.f7189A = c1046i;
            AbstractC5618k.m10158n(this);
        }
        this.f7191C = interfaceC1220a;
        boolean z14 = this.f7202N;
        C2857k c2857k2 = this.f7201M;
        if (z14 == (c2857k2 == null)) {
            z12 = z11;
        } else {
            boolean z15 = c2857k2 == null;
            this.f7202N = z15;
            if (z15 || this.f7196H != null) {
            }
        }
        if (z12 && ((interfaceC5612i = this.f7196H) != null || !this.f7202N)) {
            if (interfaceC5612i != null) {
                m10123l1(interfaceC5612i);
            }
            this.f7196H = null;
            m5397v1();
        }
        c2178i0.m5417o1(this.f7205w);
    }

    /* JADX INFO: renamed from: w1 */
    public void mo5380w1() {
    }

    /* JADX INFO: renamed from: n1 */
    public void mo5378n1(InterfaceC1062y interfaceC1062y) {
    }
}
