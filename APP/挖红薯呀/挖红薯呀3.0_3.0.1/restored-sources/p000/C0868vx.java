package p000;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: vx */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0868vx {

    /* JADX INFO: renamed from: a */
    public final C1020zx f6837a;

    /* JADX INFO: renamed from: f */
    public Outline f6842f;

    /* JADX INFO: renamed from: j */
    public float f6846j;

    /* JADX INFO: renamed from: k */
    public v50 f6847k;

    /* JADX INFO: renamed from: l */
    public C0118d6 f6848l;

    /* JADX INFO: renamed from: m */
    public C0118d6 f6849m;

    /* JADX INFO: renamed from: n */
    public boolean f6850n;

    /* JADX INFO: renamed from: o */
    public C0125dd f6851o;

    /* JADX INFO: renamed from: p */
    public C0877w5 f6852p;

    /* JADX INFO: renamed from: q */
    public int f6853q;

    /* JADX INFO: renamed from: s */
    public boolean f6855s;

    /* JADX INFO: renamed from: t */
    public long f6856t;

    /* JADX INFO: renamed from: u */
    public long f6857u;

    /* JADX INFO: renamed from: v */
    public long f6858v;

    /* JADX INFO: renamed from: w */
    public boolean f6859w;

    /* JADX INFO: renamed from: x */
    public RectF f6860x;

    /* JADX INFO: renamed from: b */
    public InterfaceC0968ym f6838b = p30.f4737d;

    /* JADX INFO: renamed from: c */
    public k50 f6839c = k50.f3015d;

    /* JADX INFO: renamed from: d */
    public InterfaceC0742sw f6840d = C0601p3.f4724r;

    /* JADX INFO: renamed from: e */
    public final C0711s2 f6841e = new C0711s2(12, this);

    /* JADX INFO: renamed from: g */
    public boolean f6843g = true;

    /* JADX INFO: renamed from: h */
    public long f6844h = 0;

    /* JADX INFO: renamed from: i */
    public long f6845i = 9205357640488583168L;

    /* JADX INFO: renamed from: r */
    public final C0206fe f6854r = new C0206fe();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0868vx(C1020zx c1020zx) {
        this.f6837a = c1020zx;
        c1020zx.f8025p = false;
        c1020zx.m5616a();
        this.f6856t = 0L;
        this.f6857u = 0L;
        this.f6858v = 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4794a() {
        C1020zx c1020zx = this.f6837a;
        RenderNode renderNode = c1020zx.f8012c;
        if (this.f6843g) {
            boolean z = this.f6859w;
            if (z || c1020zx.f8021l > 0.0f) {
                C0118d6 c0118d6 = this.f6848l;
                if (c0118d6 != null) {
                    RectF rectF = this.f6860x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f6860x = rectF;
                    }
                    boolean z2 = c0118d6 instanceof C0118d6;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = c0118d6.f973a;
                    path.computeBounds(rectF, false);
                    Outline outline = this.f6842f;
                    if (outline == null) {
                        outline = new Outline();
                        this.f6842f = outline;
                    }
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    outline.setPath(path);
                    this.f6850n = !outline.canClip();
                    this.f6848l = c0118d6;
                    outline.setAlpha(c1020zx.f8017h);
                    Math.round(rectF.width());
                    Math.round(rectF.height());
                    renderNode.setOutline(outline);
                    c1020zx.f8016g = true;
                    c1020zx.m5616a();
                    if (this.f6850n && this.f6859w) {
                        c1020zx.f8025p = false;
                        c1020zx.m5616a();
                        renderNode.discardDisplayList();
                    } else {
                        c1020zx.f8025p = this.f6859w;
                        c1020zx.m5616a();
                    }
                } else {
                    c1020zx.f8025p = z;
                    c1020zx.m5616a();
                    Outline outline2 = this.f6842f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f6842f = outline2;
                    }
                    Outline outline3 = outline2;
                    long jM2759C = o30.m2759C(this.f6857u);
                    long j = this.f6844h;
                    long j2 = this.f6845i;
                    if (j2 != 9205357640488583168L) {
                        jM2759C = j2;
                    }
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    int i3 = (int) (jM2759C >> 32);
                    int i4 = (int) (jM2759C & 4294967295L);
                    outline3.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), this.f6846j);
                    outline3.setAlpha(c1020zx.f8017h);
                    Math.round(Float.intBitsToFloat(i3));
                    Math.round(Float.intBitsToFloat(i4));
                    renderNode.setOutline(outline3);
                    c1020zx.f8016g = true;
                    c1020zx.m5616a();
                }
            } else {
                c1020zx.f8025p = false;
                c1020zx.m5616a();
                renderNode.setOutline(null);
                c1020zx.f8016g = false;
                c1020zx.m5616a();
            }
        }
        this.f6843g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4795b() {
        if (this.f6855s && this.f6853q == 0) {
            C0206fe c0206fe = this.f6854r;
            C0868vx c0868vx = (C0868vx) c0206fe.f1697b;
            if (c0868vx != null) {
                c0868vx.m4798e();
                c0206fe.f1697b = null;
            }
            kh0 kh0Var = (kh0) c0206fe.f1699d;
            if (kh0Var != null) {
                Object[] objArr = kh0Var.f3151b;
                long[] jArr = kh0Var.f3150a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((C0868vx) objArr[(i << 3) + i3]).m4798e();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                kh0Var.m1891b();
            }
            this.f6837a.f8012c.discardDisplayList();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4796c(InterfaceC0812uq interfaceC0812uq) {
        C0206fe c0206fe = this.f6854r;
        c0206fe.f1698c = (C0868vx) c0206fe.f1697b;
        kh0 kh0Var = (kh0) c0206fe.f1699d;
        if (kh0Var != null && kh0Var.m1897h()) {
            kh0 kh0Var2 = (kh0) c0206fe.f1700e;
            if (kh0Var2 == null) {
                kh0 kh0Var3 = ey0.f1546a;
                kh0Var2 = new kh0();
                c0206fe.f1700e = kh0Var2;
            }
            kh0Var2.m1899j(kh0Var);
            kh0Var.m1891b();
        }
        c0206fe.f1696a = true;
        this.f6840d.invoke(interfaceC0812uq);
        c0206fe.f1696a = false;
        C0868vx c0868vx = (C0868vx) c0206fe.f1698c;
        if (c0868vx != null) {
            c0868vx.m4798e();
        }
        kh0 kh0Var4 = (kh0) c0206fe.f1700e;
        if (kh0Var4 == null || !kh0Var4.m1897h()) {
            return;
        }
        Object[] objArr = kh0Var4.f3151b;
        long[] jArr = kh0Var4.f3150a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((C0868vx) objArr[(i << 3) + i3]).m4798e();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        kh0Var4.m1891b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final v50 m4797d() {
        v50 xm0Var;
        v50 v50Var = this.f6847k;
        C0118d6 c0118d6 = this.f6848l;
        if (v50Var != null) {
            return v50Var;
        }
        if (c0118d6 != null) {
            wm0 wm0Var = new wm0(c0118d6);
            this.f6847k = wm0Var;
            return wm0Var;
        }
        long jM2759C = o30.m2759C(this.f6857u);
        long j = this.f6844h;
        long j2 = this.f6845i;
        if (j2 != 9205357640488583168L) {
            jM2759C = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM2759C >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM2759C & 4294967295L)) + fIntBitsToFloat2;
        float f = this.f6846j;
        if (f > 0.0f) {
            xm0Var = new ym0(j50.m1652b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            xm0Var = new xm0(new st0(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f6847k = xm0Var;
        return xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4798e() {
        this.f6853q--;
        m4795b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4799f() {
        InterfaceC0968ym interfaceC0968ym = this.f6838b;
        k50 k50Var = this.f6839c;
        C0711s2 c0711s2 = this.f6841e;
        C1020zx c1020zx = this.f6837a;
        C0125dd c0125dd = c1020zx.f8011b;
        RenderNode renderNode = c1020zx.f8012c;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        try {
            C0910x1 c0910x1 = c1020zx.f8010a;
            C0041b3 c0041b3 = (C0041b3) c0910x1.f7232e;
            Canvas canvas = c0041b3.f362a;
            c0041b3.f362a = recordingCanvasBeginRecording;
            C0541o8 c0541o8 = c0125dd.f1053e;
            c0541o8.m2810o(interfaceC0968ym);
            c0541o8.m2811p(k50Var);
            c0541o8.f4481b = this;
            c0541o8.m2812q(c1020zx.f8013d);
            c0541o8.m2809n(c0041b3);
            c0711s2.invoke(c0125dd);
            ((C0041b3) c0910x1.f7232e).f362a = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4800g(long j) {
        if (ok0.m2931b(this.f6858v, j)) {
            return;
        }
        this.f6858v = j;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.f6837a.f8012c;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            renderNode.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4801h(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        C1020zx c1020zx = this.f6837a;
        c1020zx.f8012c.setPosition(i, i2, ((int) (j2 >> 32)) + i, ((int) (4294967295L & j2)) + i2);
        c1020zx.f8013d = o30.m2759C(j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4802i(long j, long j2, float f) {
        if (ok0.m2931b(this.f6844h, j) && q11.m3185a(this.f6845i, j2) && this.f6846j == f && this.f6848l == null) {
            return;
        }
        this.f6847k = null;
        this.f6848l = null;
        this.f6843g = true;
        this.f6850n = false;
        this.f6844h = j;
        this.f6845i = j2;
        this.f6846j = f;
        m4794a();
    }
}
