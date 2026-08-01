package p000;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: tx */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0782tx extends AbstractC0731sm implements InterfaceC0775tq {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f6062t = 1;

    /* JADX INFO: renamed from: u */
    public final C0343j5 f6063u;

    /* JADX INFO: renamed from: v */
    public final C0182er f6064v;

    /* JADX INFO: renamed from: w */
    public Object f6065w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0782tx(s51 s51Var, C0343j5 c0343j5, C0182er c0182er, jn0 jn0Var) {
        this.f6063u = c0343j5;
        this.f6064v = c0182er;
        this.f6065w = jn0Var;
        m4086w0(s51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static boolean m4236A0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public static boolean m4237z0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ef A[PHI: r22
  0x01ef: PHI (r22v2 boolean) = (r22v1 boolean), (r22v11 boolean) binds: [B:94:0x01a7, B:102:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.InterfaceC0775tq
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1679B(d60 d60Var) {
        boolean zM4236A0;
        char c;
        boolean zM4237z0;
        boolean z;
        um0 um0Var;
        float f;
        float f2;
        int i = this.f6062t;
        C0343j5 c0343j5 = this.f6063u;
        C0182er c0182er = this.f6064v;
        switch (i) {
            case 0:
                jn0 jn0Var = (jn0) this.f6065w;
                C0125dd c0125dd = d60Var.f976d;
                c0343j5.m1648i(c0125dd.mo649c());
                if (q11.m3187c(c0125dd.mo649c())) {
                    d60Var.m648a();
                    return;
                }
                d60Var.m648a();
                c0343j5.f2724d.getValue();
                Canvas canvasM439a = AbstractC0077c3.m439a(c0125dd.f1053e.m2802f());
                if (C0182er.m959f(c0182er.f1515f)) {
                    zM4236A0 = m4236A0(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c0125dd.mo649c() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(d60Var.mo654p(jn0Var.mo224a(d60Var.getLayoutDirection())))) & 4294967295L), c0182er.m963c(), canvasM439a);
                } else {
                    zM4236A0 = false;
                }
                if (C0182er.m959f(c0182er.f1513d)) {
                    EdgeEffect edgeEffectM965e = c0182er.m965e();
                    zM4236A0 = m4236A0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(d60Var.mo654p(jn0Var.mo227d()))) & 4294967295L), edgeEffectM965e, canvasM439a) || zM4236A0;
                }
                if (C0182er.m959f(c0182er.f1516g)) {
                    EdgeEffect edgeEffectM964d = c0182er.m964d();
                    zM4236A0 = m4236A0(90.0f, (((long) Float.floatToRawIntBits(d60Var.mo654p(jn0Var.mo225b(d60Var.getLayoutDirection())) + (-((float) rd0.m3458Q(Float.intBitsToFloat((int) (c0125dd.mo649c() >> 32))))))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), edgeEffectM964d, canvasM439a) || zM4236A0;
                }
                if (C0182er.m959f(c0182er.f1514e)) {
                    EdgeEffect edgeEffectM962b = c0182er.m962b();
                    float fMo654p = d60Var.mo654p(jn0Var.mo226c());
                    zM4236A0 = m4236A0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c0125dd.mo649c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c0125dd.mo649c() & 4294967295L))) + fMo654p)) & 4294967295L), edgeEffectM962b, canvasM439a) || zM4236A0;
                }
                if (zM4236A0) {
                    c0343j5.m1643d();
                    return;
                }
                return;
            default:
                C0125dd c0125dd2 = d60Var.f976d;
                c0343j5.m1648i(c0125dd2.mo649c());
                Canvas canvasM439a2 = AbstractC0077c3.m439a(c0125dd2.f1053e.m2802f());
                c0343j5.f2724d.getValue();
                if (q11.m3187c(c0125dd2.mo649c())) {
                    d60Var.m648a();
                    return;
                }
                if (!canvasM439a2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = c0182er.f1513d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = c0182er.f1514e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = c0182er.f1515f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = c0182er.f1516g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = c0182er.f1517h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = c0182er.f1518i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = c0182er.f1519j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = c0182er.f1520k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    d60Var.m648a();
                    return;
                }
                float fMo654p2 = d60Var.mo654p(30.0f);
                boolean z2 = C0182er.m959f(c0182er.f1513d) || C0182er.m960g(c0182er.f1517h) || C0182er.m959f(c0182er.f1514e) || C0182er.m960g(c0182er.f1518i);
                boolean z3 = C0182er.m959f(c0182er.f1515f) || C0182er.m960g(c0182er.f1519j) || C0182er.m959f(c0182er.f1516g) || C0182er.m960g(c0182er.f1520k);
                if (z2 && z3) {
                    c = ' ';
                    m4238B0().setPosition(0, 0, canvasM439a2.getWidth(), canvasM439a2.getHeight());
                } else {
                    c = ' ';
                    if (z2) {
                        m4238B0().setPosition(0, 0, (rd0.m3458Q(fMo654p2) * 2) + canvasM439a2.getWidth(), canvasM439a2.getHeight());
                    } else {
                        if (!z3) {
                            d60Var.m648a();
                            return;
                        }
                        m4238B0().setPosition(0, 0, canvasM439a2.getWidth(), (rd0.m3458Q(fMo654p2) * 2) + canvasM439a2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = m4238B0().beginRecording();
                boolean zM960g = C0182er.m960g(c0182er.f1519j);
                um0 um0Var2 = um0.f6265e;
                if (zM960g) {
                    EdgeEffect edgeEffectM961a = c0182er.f1519j;
                    if (edgeEffectM961a == null) {
                        edgeEffectM961a = c0182er.m961a(um0Var2);
                        c0182er.f1519j = edgeEffectM961a;
                    }
                    m4237z0(90.0f, edgeEffectM961a, recordingCanvasBeginRecording);
                    edgeEffectM961a.finish();
                }
                if (C0182er.m959f(c0182er.f1515f)) {
                    EdgeEffect edgeEffectM963c = c0182er.m963c();
                    zM4237z0 = m4237z0(270.0f, edgeEffectM963c, recordingCanvasBeginRecording);
                    if (C0182er.m960g(c0182er.f1515f)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0343j5.m1642c() & 4294967295L));
                        EdgeEffect edgeEffectM961a2 = c0182er.f1519j;
                        if (edgeEffectM961a2 == null) {
                            edgeEffectM961a2 = c0182er.m961a(um0Var2);
                            c0182er.f1519j = edgeEffectM961a2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fM2446c = i2 >= 31 ? AbstractC0463m8.m2446c(edgeEffectM963c) : 0.0f;
                        float f3 = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            AbstractC0463m8.m2447d(edgeEffectM961a2, fM2446c, f3);
                        } else {
                            edgeEffectM961a2.onPull(fM2446c, f3);
                        }
                    }
                } else {
                    zM4237z0 = false;
                }
                boolean zM960g2 = C0182er.m960g(c0182er.f1517h);
                um0 um0Var3 = um0.f6264d;
                if (zM960g2) {
                    EdgeEffect edgeEffectM961a3 = c0182er.f1517h;
                    if (edgeEffectM961a3 == null) {
                        edgeEffectM961a3 = c0182er.m961a(um0Var3);
                        c0182er.f1517h = edgeEffectM961a3;
                    }
                    m4237z0(180.0f, edgeEffectM961a3, recordingCanvasBeginRecording);
                    edgeEffectM961a3.finish();
                }
                if (C0182er.m959f(c0182er.f1513d)) {
                    EdgeEffect edgeEffectM965e2 = c0182er.m965e();
                    zM4237z0 = m4237z0(0.0f, edgeEffectM965e2, recordingCanvasBeginRecording) || zM4237z0;
                    if (C0182er.m960g(c0182er.f1513d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0343j5.m1642c() >> c));
                        EdgeEffect edgeEffectM961a4 = c0182er.f1517h;
                        if (edgeEffectM961a4 == null) {
                            edgeEffectM961a4 = c0182er.m961a(um0Var3);
                            c0182er.f1517h = edgeEffectM961a4;
                        }
                        z = z2;
                        int i3 = Build.VERSION.SDK_INT;
                        float fM2446c2 = i3 >= 31 ? AbstractC0463m8.m2446c(edgeEffectM965e2) : 0.0f;
                        if (i3 >= 31) {
                            AbstractC0463m8.m2447d(edgeEffectM961a4, fM2446c2, fIntBitsToFloat2);
                        } else {
                            edgeEffectM961a4.onPull(fM2446c2, fIntBitsToFloat2);
                        }
                    } else {
                        z = z2;
                    }
                }
                if (C0182er.m960g(c0182er.f1520k)) {
                    EdgeEffect edgeEffectM961a5 = c0182er.f1520k;
                    if (edgeEffectM961a5 == null) {
                        edgeEffectM961a5 = c0182er.m961a(um0Var2);
                        c0182er.f1520k = edgeEffectM961a5;
                    }
                    um0Var = um0Var3;
                    m4237z0(270.0f, edgeEffectM961a5, recordingCanvasBeginRecording);
                    edgeEffectM961a5.finish();
                } else {
                    um0Var = um0Var3;
                }
                if (C0182er.m959f(c0182er.f1516g)) {
                    EdgeEffect edgeEffectM964d2 = c0182er.m964d();
                    zM4237z0 = m4237z0(90.0f, edgeEffectM964d2, recordingCanvasBeginRecording) || zM4237z0;
                    if (C0182er.m960g(c0182er.f1516g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c0343j5.m1642c() & 4294967295L));
                        EdgeEffect edgeEffectM961a6 = c0182er.f1520k;
                        if (edgeEffectM961a6 == null) {
                            edgeEffectM961a6 = c0182er.m961a(um0Var2);
                            c0182er.f1520k = edgeEffectM961a6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fM2446c3 = i4 >= 31 ? AbstractC0463m8.m2446c(edgeEffectM964d2) : 0.0f;
                        if (i4 >= 31) {
                            AbstractC0463m8.m2447d(edgeEffectM961a6, fM2446c3, fIntBitsToFloat3);
                        } else {
                            edgeEffectM961a6.onPull(fM2446c3, fIntBitsToFloat3);
                        }
                    }
                }
                if (C0182er.m960g(c0182er.f1518i)) {
                    EdgeEffect edgeEffectM961a7 = c0182er.f1518i;
                    if (edgeEffectM961a7 == null) {
                        edgeEffectM961a7 = c0182er.m961a(um0Var);
                        c0182er.f1518i = edgeEffectM961a7;
                    }
                    m4237z0(0.0f, edgeEffectM961a7, recordingCanvasBeginRecording);
                    edgeEffectM961a7.finish();
                }
                if (C0182er.m959f(c0182er.f1514e)) {
                    EdgeEffect edgeEffectM962b2 = c0182er.m962b();
                    boolean z4 = m4237z0(180.0f, edgeEffectM962b2, recordingCanvasBeginRecording) || zM4237z0;
                    if (C0182er.m960g(c0182er.f1514e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c0343j5.m1642c() >> c));
                        EdgeEffect edgeEffectM961a8 = c0182er.f1518i;
                        if (edgeEffectM961a8 == null) {
                            edgeEffectM961a8 = c0182er.m961a(um0Var);
                            c0182er.f1518i = edgeEffectM961a8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fM2446c4 = i5 >= 31 ? AbstractC0463m8.m2446c(edgeEffectM962b2) : 0.0f;
                        float f4 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            AbstractC0463m8.m2447d(edgeEffectM961a8, fM2446c4, f4);
                        } else {
                            edgeEffectM961a8.onPull(fM2446c4, f4);
                        }
                    }
                    zM4237z0 = z4;
                }
                if (zM4237z0) {
                    c0343j5.m1643d();
                }
                float f5 = z3 ? 0.0f : fMo654p2;
                if (z) {
                    fMo654p2 = 0.0f;
                }
                k50 layoutDirection = d60Var.getLayoutDirection();
                C0041b3 c0041b3 = new C0041b3();
                c0041b3.f362a = recordingCanvasBeginRecording;
                long jMo649c = c0125dd2.mo649c();
                C0541o8 c0541o8 = c0125dd2.f1053e;
                C0087cd c0087cd = ((C0125dd) c0541o8.f4482c).f1052d;
                InterfaceC0968ym interfaceC0968ym = c0087cd.f787a;
                k50 k50Var = c0087cd.f788b;
                InterfaceC0051bd interfaceC0051bdM2802f = c0541o8.m2802f();
                long jM2803h = c0125dd2.f1053e.m2803h();
                C0541o8 c0541o82 = c0125dd2.f1053e;
                C0868vx c0868vx = (C0868vx) c0541o82.f4481b;
                c0541o82.m2810o(d60Var);
                c0541o82.m2811p(layoutDirection);
                c0541o82.m2809n(c0041b3);
                c0541o82.m2812q(jMo649c);
                c0541o82.f4481b = null;
                c0041b3.mo243i();
                try {
                    ((C0910x1) c0125dd2.f1053e.f4480a).m5080u(f5, fMo654p2);
                    try {
                        d60Var.m648a();
                        c0041b3.mo241g();
                        C0541o8 c0541o83 = c0125dd2.f1053e;
                        c0541o83.m2810o(interfaceC0968ym);
                        c0541o83.m2811p(k50Var);
                        c0541o83.m2809n(interfaceC0051bdM2802f);
                        c0541o83.m2812q(jM2803h);
                        c0541o83.f4481b = c0868vx;
                        m4238B0().endRecording();
                        int iSave = canvasM439a2.save();
                        canvasM439a2.translate(f, f2);
                        canvasM439a2.drawRenderNode(m4238B0());
                        canvasM439a2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((C0910x1) c0125dd2.f1053e.f4480a).m5080u(-f5, -fMo654p2);
                    }
                } catch (Throwable th) {
                    c0041b3.mo241g();
                    C0541o8 c0541o84 = c0125dd2.f1053e;
                    c0541o84.m2810o(interfaceC0968ym);
                    c0541o84.m2811p(k50Var);
                    c0541o84.m2809n(interfaceC0051bdM2802f);
                    c0541o84.m2812q(jM2803h);
                    c0541o84.f4481b = c0868vx;
                    throw th;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public RenderNode m4238B0() {
        RenderNode renderNode = (RenderNode) this.f6065w;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.f6065w = renderNode2;
        return renderNode2;
    }

    public C0782tx(s51 s51Var, C0343j5 c0343j5, C0182er c0182er) {
        this.f6063u = c0343j5;
        this.f6064v = c0182er;
        m4086w0(s51Var);
    }
}
