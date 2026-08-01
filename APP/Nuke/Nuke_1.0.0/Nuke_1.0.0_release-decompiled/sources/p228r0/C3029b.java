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

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC1665j.m2984d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public C3029b(InterfaceC3031d interfaceC3031d) {
        this.f9607a = interfaceC3031d;
        interfaceC3031d.mo5265t(false);
        this.f9626t = 0L;
        this.f9627u = 0L;
        this.f9628v = 9205357640488583168L;
    }

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

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5226b() {
        /*
            r15 = this;
            boolean r0 = r15.f9625s
            if (r0 == 0) goto L69
            int r0 = r15.f9623q
            if (r0 != 0) goto L69
            B0.z r0 = r15.f9624r
            java.lang.Object r1 = r0.f741b
            r0.b r1 = (p228r0.C3029b) r1
            if (r1 == 0) goto L16
            r1.m5229e()
            r1 = 0
            r0.f741b = r1
        L16:
            java.lang.Object r0 = r0.f743d
            k.F r0 = (p186k.C2409F) r0
            if (r0 == 0) goto L64
            java.lang.Object[] r1 = r0.f7794b
            long[] r2 = r0.f7793a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L61
            r4 = 0
            r5 = r4
        L27:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5c
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L41:
            if (r10 >= r8) goto L5a
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L56
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            r0.b r11 = (p228r0.C3029b) r11
            r11.m5229e()
        L56:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L41
        L5a:
            if (r8 != r9) goto L61
        L5c:
            if (r5 == r3) goto L61
            int r5 = r5 + 1
            goto L27
        L61:
            r0.m4280b()
        L64:
            r0.d r0 = r15.f9607a
            r0.mo5262q()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p228r0.C3029b.m5226b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Type inference failed for: r1v5, types: [W2.c, X2.k] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5227c(p222q0.InterfaceC2903d r15) {
        /*
            r14 = this;
            B0.z r0 = r14.f9624r
            java.lang.Object r1 = r0.f741b
            r0.b r1 = (p228r0.C3029b) r1
            r0.f742c = r1
            java.lang.Object r1 = r0.f743d
            k.F r1 = (p186k.C2409F) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.m4286h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.f744e
            k.F r2 = (p186k.C2409F) r2
            if (r2 != 0) goto L23
            k.F r2 = p186k.AbstractC2416M.f7817a
            k.F r2 = new k.F
            r2.<init>()
            r0.f744e = r2
        L23:
            r2.m4289k(r1)
            r1.m4280b()
        L29:
            r1 = 1
            r0.f740a = r1
            X2.k r1 = r14.f9610d
            r1.mo1h(r15)
            r15 = 0
            r0.f740a = r15
            java.lang.Object r1 = r0.f742c
            r0.b r1 = (p228r0.C3029b) r1
            if (r1 == 0) goto L3d
            r1.m5229e()
        L3d:
            java.lang.Object r0 = r0.f744e
            k.F r0 = (p186k.C2409F) r0
            if (r0 == 0) goto L90
            boolean r1 = r0.m4286h()
            if (r1 == 0) goto L90
            java.lang.Object[] r1 = r0.f7794b
            long[] r2 = r0.f7793a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8d
            r4 = r15
        L53:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L88
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6d:
            if (r9 >= r7) goto L86
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L82
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            r0.b r10 = (p228r0.C3029b) r10
            r10.m5229e()
        L82:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6d
        L86:
            if (r7 != r8) goto L8d
        L88:
            if (r4 == r3) goto L8d
            int r4 = r4 + 1
            goto L53
        L8d:
            r0.m4280b()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p228r0.C3029b.m5227c(q0.d):void");
    }

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

    /* JADX INFO: renamed from: e */
    public final void m5229e() {
        this.f9623q--;
        m5226b();
    }

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
