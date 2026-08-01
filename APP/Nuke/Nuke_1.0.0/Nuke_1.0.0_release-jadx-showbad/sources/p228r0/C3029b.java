package p228r0;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1925g;
import java.util.Locale;
import p007B0.C0172E;
import p007B0.C0212z;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p186k.AbstractC2416M;
import p186k.C2409F;
import p204n0.C2683b;
import p204n0.C2684c;
import p204n0.C2686e;
import p211o0.AbstractC2767z;
import p211o0.C2731F;
import p211o0.C2732G;
import p211o0.C2733H;
import p211o0.C2748g;
import p211o0.C2750i;
import p222q0.AbstractC2902c;
import p222q0.C2901b;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: r0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3029b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3031d f9607a;

    /* JADX INFO: renamed from: f */
    public Outline f9612f;

    /* JADX INFO: renamed from: j */
    public float f9616j;

    /* JADX INFO: renamed from: k */
    public AbstractC2767z f9617k;

    /* JADX INFO: renamed from: l */
    public C2750i f9618l;

    /* JADX INFO: renamed from: m */
    public C2750i f9619m;

    /* JADX INFO: renamed from: n */
    public boolean f9620n;

    /* JADX INFO: renamed from: o */
    public C2901b f9621o;

    /* JADX INFO: renamed from: p */
    public C2748g f9622p;

    /* JADX INFO: renamed from: q */
    public int f9623q;

    /* JADX INFO: renamed from: s */
    public boolean f9625s;

    /* JADX INFO: renamed from: t */
    public long f9626t;

    /* JADX INFO: renamed from: u */
    public long f9627u;

    /* JADX INFO: renamed from: v */
    public long f9628v;

    /* JADX INFO: renamed from: w */
    public boolean f9629w;

    /* JADX INFO: renamed from: x */
    public RectF f9630x;

    /* JADX INFO: renamed from: b */
    public InterfaceC2007c f9608b = AbstractC2902c.f9188a;

    /* JADX INFO: renamed from: c */
    public EnumC2017m f9609c = EnumC2017m.f6742d;

    /* JADX INFO: renamed from: d */
    public AbstractC1666k f9610d = C3028a.f9604f;

    /* JADX INFO: renamed from: e */
    public final C0172E f9611e = new C0172E(25, this);

    /* JADX INFO: renamed from: g */
    public boolean f9613g = true;

    /* JADX INFO: renamed from: h */
    public long f9614h = 0;

    /* JADX INFO: renamed from: i */
    public long f9615i = 9205357640488583168L;

    /* JADX INFO: renamed from: r */
    public final C0212z f9624r = new C0212z();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC1665j.m2984d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3029b(InterfaceC3031d interfaceC3031d) {
        this.f9607a = interfaceC3031d;
        interfaceC3031d.mo5265t(false);
        this.f9626t = 0L;
        this.f9627u = 0L;
        this.f9628v = 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5225a() {
        Outline outline;
        if (this.f9613g) {
            boolean z5 = this.f9629w;
            Outline outline2 = null;
            InterfaceC3031d interfaceC3031d = this.f9607a;
            if (z5 || interfaceC3031d.mo5237G() > 0.0f) {
                C2750i c2750i = this.f9618l;
                if (c2750i != null) {
                    RectF rectF = this.f9630x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f9630x = rectF;
                    }
                    boolean z6 = c2750i instanceof C2750i;
                    if (!z6) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    c2750i.f8742a.computeBounds(rectF, false);
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 > 28 || c2750i.f8742a.isConvex()) {
                        outline = this.f9612f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f9612f = outline;
                        }
                        if (i5 >= 30) {
                            if (!z6) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(c2750i.f8742a);
                        } else {
                            if (!z6) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(c2750i.f8742a);
                        }
                        this.f9620n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f9612f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f9620n = true;
                        outline = null;
                    }
                    this.f9618l = c2750i;
                    if (outline != null) {
                        outline.setAlpha(interfaceC3031d.mo5246a());
                        outline2 = outline;
                    }
                    interfaceC3031d.mo5257l(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f9620n && this.f9629w) {
                        interfaceC3031d.mo5265t(false);
                        interfaceC3031d.mo5262q();
                    } else {
                        interfaceC3031d.mo5265t(this.f9629w);
                    }
                } else {
                    interfaceC3031d.mo5265t(this.f9629w);
                    Outline outline4 = this.f9612f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f9612f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM3523F = AbstractC1925g.m3523F(this.f9627u);
                    long j5 = this.f9614h;
                    long j6 = this.f9615i;
                    if (j6 != 9205357640488583168L) {
                        jM3523F = j6;
                    }
                    int i6 = (int) (j5 >> 32);
                    int i7 = (int) (j5 & 4294967295L);
                    int i8 = (int) (jM3523F >> 32);
                    int i9 = (int) (jM3523F & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i6)), Math.round(Float.intBitsToFloat(i7)), Math.round(Float.intBitsToFloat(i8) + Float.intBitsToFloat(i6)), Math.round(Float.intBitsToFloat(i9) + Float.intBitsToFloat(i7)), this.f9616j);
                    outline5.setAlpha(interfaceC3031d.mo5246a());
                    interfaceC3031d.mo5257l(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i9)))) | (((long) Math.round(Float.intBitsToFloat(i8))) << 32));
                }
            } else {
                interfaceC3031d.mo5265t(false);
                interfaceC3031d.mo5257l(null, 0L);
            }
        }
        this.f9613g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5226b() {
        if (this.f9625s && this.f9623q == 0) {
            C0212z c0212z = this.f9624r;
            C3029b c3029b = (C3029b) c0212z.f741b;
            if (c3029b != null) {
                c3029b.m5229e();
                c0212z.f741b = null;
            }
            C2409F c2409f = (C2409F) c0212z.f743d;
            if (c2409f != null) {
                Object[] objArr = c2409f.f7794b;
                long[] jArr = c2409f.f7793a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j5 = jArr[i5];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j5) < 128) {
                                    ((C3029b) objArr[(i5 << 3) + i7]).m5229e();
                                }
                                j5 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                c2409f.m4280b();
            }
            this.f9607a.mo5262q();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Type inference failed for: r1v5, types: [W2.c, X2.k] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5227c(InterfaceC2903d interfaceC2903d) {
        C0212z c0212z = this.f9624r;
        c0212z.f742c = (C3029b) c0212z.f741b;
        C2409F c2409f = (C2409F) c0212z.f743d;
        if (c2409f != null && c2409f.m4286h()) {
            C2409F c2409f2 = (C2409F) c0212z.f744e;
            if (c2409f2 == null) {
                C2409F c2409f3 = AbstractC2416M.f7817a;
                c2409f2 = new C2409F();
                c0212z.f744e = c2409f2;
            }
            c2409f2.m4289k(c2409f);
            c2409f.m4280b();
        }
        c0212z.f740a = true;
        this.f9610d.mo1h(interfaceC2903d);
        c0212z.f740a = false;
        C3029b c3029b = (C3029b) c0212z.f742c;
        if (c3029b != null) {
            c3029b.m5229e();
        }
        C2409F c2409f4 = (C2409F) c0212z.f744e;
        if (c2409f4 == null || !c2409f4.m4286h()) {
            return;
        }
        Object[] objArr = c2409f4.f7794b;
        long[] jArr = c2409f4.f7793a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            ((C3029b) objArr[(i5 << 3) + i7]).m5229e();
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        c2409f4.m4280b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC2767z m5228d() {
        AbstractC2767z c2732g;
        AbstractC2767z abstractC2767z = this.f9617k;
        C2750i c2750i = this.f9618l;
        if (abstractC2767z != null) {
            return abstractC2767z;
        }
        if (c2750i != null) {
            C2731F c2731f = new C2731F(c2750i);
            this.f9617k = c2731f;
            return c2731f;
        }
        long jM3523F = AbstractC1925g.m3523F(this.f9627u);
        long j5 = this.f9614h;
        long j6 = this.f9615i;
        if (j6 != 9205357640488583168L) {
            jM3523F = j6;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM3523F >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM3523F & 4294967295L)) + fIntBitsToFloat2;
        float f2 = this.f9616j;
        if (f2 > 0.0f) {
            c2732g = new C2733H(AbstractC1923e.m3465c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2)))));
        } else {
            c2732g = new C2732G(new C2684c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f9617k = c2732g;
        return c2732g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5229e() {
        this.f9623q--;
        m5226b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5230f(long j5, long j6, float f2) {
        if (C2683b.m4644b(this.f9614h, j5) && C2686e.m4661a(this.f9615i, j6) && this.f9616j == f2 && this.f9618l == null) {
            return;
        }
        this.f9617k = null;
        this.f9618l = null;
        this.f9613g = true;
        this.f9620n = false;
        this.f9614h = j5;
        this.f9615i = j6;
        this.f9616j = f2;
        m5225a();
    }
}
