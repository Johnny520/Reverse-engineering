package p118i1;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import be.AbstractC0283h;
import gg.AbstractC1416l;
import java.util.Locale;
import p014b.C0127f;
import p016b1.C0166f;
import p057e1.C0807b;
import p057e1.C0808c;
import p057e1.C0810e;
import p069f.AbstractC0959s0;
import p069f.C0945l0;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1018n0;
import p071f1.C1005h;
import p071f1.C1009j;
import p071f1.C1010j0;
import p071f1.C1012k0;
import p071f1.C1014l0;
import p085fg.InterfaceC1231l;
import p101h1.AbstractC1566c;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p136j8.C2104o;
import p259r9.AbstractC3754e0;
import p293u2.C4240j;
import p293u2.C4242l;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: i1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1902b {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f6339y = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC1904d f6340a;

    /* JADX INFO: renamed from: f */
    public Outline f6345f;

    /* JADX INFO: renamed from: j */
    public float f6349j;

    /* JADX INFO: renamed from: k */
    public AbstractC0996c0 f6350k;

    /* JADX INFO: renamed from: l */
    public C1009j f6351l;

    /* JADX INFO: renamed from: m */
    public C1009j f6352m;

    /* JADX INFO: renamed from: n */
    public boolean f6353n;

    /* JADX INFO: renamed from: o */
    public C1565b f6354o;

    /* JADX INFO: renamed from: p */
    public C1005h f6355p;

    /* JADX INFO: renamed from: q */
    public int f6356q;

    /* JADX INFO: renamed from: s */
    public boolean f6358s;

    /* JADX INFO: renamed from: t */
    public long f6359t;

    /* JADX INFO: renamed from: u */
    public long f6360u;

    /* JADX INFO: renamed from: v */
    public long f6361v;

    /* JADX INFO: renamed from: w */
    public boolean f6362w;

    /* JADX INFO: renamed from: x */
    public RectF f6363x;

    /* JADX INFO: renamed from: b */
    public InterfaceC4233c f6341b = AbstractC1566c.f5223a;

    /* JADX INFO: renamed from: c */
    public EnumC4243m f6342c = EnumC4243m.f13919g;

    /* JADX INFO: renamed from: d */
    public InterfaceC1231l f6343d = C1901a.f6336h;

    /* JADX INFO: renamed from: e */
    public final C0166f f6344e = new C0166f(this, 13);

    /* JADX INFO: renamed from: g */
    public boolean f6346g = true;

    /* JADX INFO: renamed from: h */
    public long f6347h = 0;

    /* JADX INFO: renamed from: i */
    public long f6348i = 9205357640488583168L;

    /* JADX INFO: renamed from: r */
    public final C0127f f6357r = new C0127f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1902b(InterfaceC1904d interfaceC1904d) {
        this.f6340a = interfaceC1904d;
        interfaceC1904d.mo4714r(false);
        this.f6359t = 0L;
        this.f6360u = 0L;
        this.f6361v = 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4673a() {
        Outline outline;
        if (this.f6346g) {
            boolean z9 = this.f6362w;
            Outline outline2 = null;
            InterfaceC1904d interfaceC1904d = this.f6340a;
            if (z9 || interfaceC1904d.mo4694M() > 0.0f) {
                C1009j c1009j = this.f6351l;
                if (c1009j != null) {
                    RectF rectF = this.f6363x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f6363x = rectF;
                    }
                    boolean z10 = c1009j instanceof C1009j;
                    if (!z10) {
                        C2104o.m5297w("Unable to obtain android.graphics.Path");
                        return;
                    }
                    c1009j.f3191a.computeBounds(rectF, false);
                    int i9 = Build.VERSION.SDK_INT;
                    if (i9 > 28 || c1009j.f3191a.isConvex()) {
                        outline = this.f6345f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f6345f = outline;
                        }
                        if (i9 >= 30) {
                            if (!z10) {
                                C2104o.m5297w("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(c1009j.f3191a);
                        } else {
                            if (!z10) {
                                C2104o.m5297w("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(c1009j.f3191a);
                        }
                        this.f6353n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f6345f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f6353n = true;
                        outline = null;
                    }
                    this.f6351l = c1009j;
                    if (outline != null) {
                        outline.setAlpha(interfaceC1904d.mo4697a());
                        outline2 = outline;
                    }
                    interfaceC1904d.mo4701e(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f6353n && this.f6362w) {
                        interfaceC1904d.mo4714r(false);
                        interfaceC1904d.mo4706j();
                    } else {
                        interfaceC1904d.mo4714r(this.f6362w);
                    }
                } else {
                    interfaceC1904d.mo4714r(this.f6362w);
                    Outline outline4 = this.f6345f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f6345f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM7908q0 = AbstractC3754e0.m7908q0(this.f6360u);
                    long j3 = this.f6347h;
                    long j4 = this.f6348i;
                    if (j4 != 9205357640488583168L) {
                        jM7908q0 = j4;
                    }
                    int i10 = (int) (j3 >> 32);
                    int i11 = (int) (j3 & 4294967295L);
                    int i12 = (int) (jM7908q0 >> 32);
                    int i13 = (int) (jM7908q0 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12) + Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i13) + Float.intBitsToFloat(i11)), this.f6349j);
                    outline5.setAlpha(interfaceC1904d.mo4697a());
                    interfaceC1904d.mo4701e(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i13)))) | (((long) Math.round(Float.intBitsToFloat(i12))) << 32));
                }
            } else {
                interfaceC1904d.mo4714r(false);
                interfaceC1904d.mo4701e(null, 0L);
            }
        }
        this.f6346g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4674b() {
        if (this.f6358s && this.f6356q == 0) {
            C0127f c0127f = this.f6357r;
            C1902b c1902b = (C1902b) c0127f.f335b;
            if (c1902b != null) {
                c1902b.f6356q--;
                c1902b.m4674b();
                c0127f.f335b = null;
            }
            C0945l0 c0945l0 = (C0945l0) c0127f.f337d;
            if (c0945l0 != null) {
                Object[] objArr = c0945l0.f2976b;
                long[] jArr = c0945l0.f2975a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j3 = jArr[i9];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j3) < 128) {
                                    r11.f6356q--;
                                    ((C1902b) objArr[(i9 << 3) + i11]).m4674b();
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
                c0945l0.m2329b();
            }
            this.f6340a.mo4706j();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4675c(InterfaceC1567d interfaceC1567d) {
        C0127f c0127f = this.f6357r;
        c0127f.f336c = (C1902b) c0127f.f335b;
        C0945l0 c0945l0 = (C0945l0) c0127f.f337d;
        if (c0945l0 != null && c0945l0.m2335h()) {
            C0945l0 c0945l02 = (C0945l0) c0127f.f338e;
            if (c0945l02 == null) {
                C0945l0 c0945l03 = AbstractC0959s0.f3019a;
                c0945l02 = new C0945l0();
                c0127f.f338e = c0945l02;
            }
            c0945l02.m2337j(c0945l0);
            c0945l0.m2329b();
        }
        c0127f.f334a = true;
        this.f6343d.invoke(interfaceC1567d);
        c0127f.f334a = false;
        C1902b c1902b = (C1902b) c0127f.f336c;
        if (c1902b != null) {
            c1902b.f6356q--;
            c1902b.m4674b();
        }
        C0945l0 c0945l04 = (C0945l0) c0127f.f338e;
        if (c0945l04 == null || !c0945l04.m2335h()) {
            return;
        }
        Object[] objArr = c0945l04.f2976b;
        long[] jArr = c0945l04.f2975a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128) {
                            r10.f6356q--;
                            ((C1902b) objArr[(i9 << 3) + i11]).m4674b();
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
        c0945l04.m2329b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC0996c0 m4676d() {
        AbstractC0996c0 c1012k0;
        AbstractC0996c0 abstractC0996c0 = this.f6350k;
        C1009j c1009j = this.f6351l;
        if (abstractC0996c0 != null) {
            return abstractC0996c0;
        }
        if (c1009j != null) {
            C1010j0 c1010j0 = new C1010j0(c1009j);
            this.f6350k = c1010j0;
            return c1010j0;
        }
        long jM7908q0 = AbstractC3754e0.m7908q0(this.f6360u);
        long j3 = this.f6347h;
        long j4 = this.f6348i;
        if (j4 != 9205357640488583168L) {
            jM7908q0 = j4;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM7908q0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM7908q0 & 4294967295L)) + fIntBitsToFloat2;
        float f3 = this.f6349j;
        if (f3 > 0.0f) {
            c1012k0 = new C1014l0(AbstractC0283h.m1149b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f3)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f3)))));
        } else {
            c1012k0 = new C1012k0(new C0808c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f6350k = c1012k0;
        return c1012k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4677e(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m, long j3, InterfaceC1231l interfaceC1231l) {
        boolean zM8534a = C4242l.m8534a(this.f6360u, j3);
        InterfaceC1904d interfaceC1904d = this.f6340a;
        if (!zM8534a) {
            this.f6360u = j3;
            long j4 = this.f6359t;
            interfaceC1904d.mo4721y((int) (j4 >> 32), (int) (j4 & 4294967295L), j3);
            if (this.f6348i == 9205357640488583168L) {
                this.f6346g = true;
                m4673a();
            }
        }
        this.f6341b = interfaceC4233c;
        this.f6342c = enumC4243m;
        this.f6343d = interfaceC1231l;
        interfaceC1904d.mo4709m(interfaceC4233c, enumC4243m, this, this.f6344e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4678f(float f3) {
        InterfaceC1904d interfaceC1904d = this.f6340a;
        if (interfaceC1904d.mo4697a() == f3) {
            return;
        }
        interfaceC1904d.mo4710n(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4679g(AbstractC1018n0 abstractC1018n0) {
        InterfaceC1904d interfaceC1904d = this.f6340a;
        if (AbstractC1416l.m3825a(interfaceC1904d.mo4700d(), abstractC1018n0)) {
            return;
        }
        interfaceC1904d.mo4693L(abstractC1018n0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4680h(float f3, long j3, long j4) {
        if (C0807b.m2039b(this.f6347h, j3) && C0810e.m2054a(this.f6348i, j4) && this.f6349j == f3 && this.f6351l == null) {
            return;
        }
        this.f6350k = null;
        this.f6351l = null;
        this.f6346g = true;
        this.f6353n = false;
        this.f6347h = j3;
        this.f6348i = j4;
        this.f6349j = f3;
        m4673a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4681i(long j3) {
        if (C4240j.m8528b(this.f6359t, j3)) {
            return;
        }
        this.f6359t = j3;
        long j4 = this.f6360u;
        this.f6340a.mo4721y((int) (j3 >> 32), (int) (j3 & 4294967295L), j4);
    }
}
