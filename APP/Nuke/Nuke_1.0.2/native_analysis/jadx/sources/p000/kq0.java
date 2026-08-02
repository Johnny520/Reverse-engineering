package p000;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kq0 extends u60 implements mc0 {

    /* JADX INFO: renamed from: A */
    public Object f5708A;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f5709x = 1;

    /* JADX INFO: renamed from: y */
    public final C0685s8 f5710y;

    /* JADX INFO: renamed from: z */
    public final jd0 f5711z;

    public kq0(zw2 zw2Var, C0685s8 c0685s8, jd0 jd0Var, jw1 jw1Var) {
        this.f5710y = c0685s8;
        this.f5711z = jd0Var;
        this.f5708A = jw1Var;
        m5468M0(zw2Var);
    }

    /* JADX INFO: renamed from: P0 */
    public static boolean m2731P0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: Q0 */
    public static boolean m2732Q0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: P */
    public final void mo1851P(t61 t61Var) {
        boolean zM2732Q0;
        long j;
        char c;
        boolean z;
        boolean zM2731P0;
        float f;
        float f2;
        int i = this.f5709x;
        C0685s8 c0685s8 = this.f5710y;
        jd0 jd0Var = this.f5711z;
        switch (i) {
            case 0:
                jw1 jw1Var = (jw1) this.f5708A;
                C0702sp c0702sp = t61Var.f10581h;
                c0685s8.m4759i(c0702sp.mo3280d());
                if (gr2.m2021c(c0702sp.mo3280d())) {
                    t61Var.m5125a();
                    return;
                }
                t61Var.m5125a();
                c0685s8.f9965d.getValue();
                Canvas canvasM1806a = AbstractC0229g6.m1806a(c0702sp.f10257i.m430q());
                boolean zM2482f = jd0.m2482f(jd0Var.f4974f);
                d61 d61Var = d61.f1885h;
                if (zM2482f) {
                    EdgeEffect edgeEffectM2486c = jd0Var.m2486c();
                    float f3 = -Float.intBitsToFloat((int) (c0702sp.mo3280d() & 4294967295L));
                    zM2732Q0 = m2732Q0(270.0f, (((long) Float.floatToRawIntBits(t61Var.mo689A(t61Var.getLayoutDirection() == d61Var ? jw1Var.f5244a : jw1Var.f5246c))) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), edgeEffectM2486c, canvasM1806a);
                } else {
                    zM2732Q0 = false;
                }
                if (jd0.m2482f(jd0Var.f4972d)) {
                    EdgeEffect edgeEffectM2488e = jd0Var.m2488e();
                    zM2732Q0 = m2732Q0(0.0f, (((long) Float.floatToRawIntBits(t61Var.mo689A(jw1Var.f5245b))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), edgeEffectM2488e, canvasM1806a) || zM2732Q0;
                }
                if (jd0.m2482f(jd0Var.f4975g)) {
                    EdgeEffect edgeEffectM2487d = jd0Var.m2487d();
                    zM2732Q0 = m2732Q0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(t61Var.mo689A(t61Var.getLayoutDirection() == d61Var ? jw1Var.f5246c : jw1Var.f5244a) + (-((float) gf1.m1869Q(Float.intBitsToFloat((int) (c0702sp.mo3280d() >> 32))))))) & 4294967295L), edgeEffectM2487d, canvasM1806a) || zM2732Q0;
                }
                if (jd0.m2482f(jd0Var.f4973e)) {
                    EdgeEffect edgeEffectM2485b = jd0Var.m2485b();
                    float fMo689A = t61Var.mo689A(jw1Var.f5247d);
                    zM2732Q0 = m2732Q0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c0702sp.mo3280d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c0702sp.mo3280d() & 4294967295L))) + fMo689A)) & 4294967295L), edgeEffectM2485b, canvasM1806a) || zM2732Q0;
                }
                if (zM2732Q0) {
                    c0685s8.m4754d();
                    return;
                }
                return;
            default:
                C0702sp c0702sp2 = t61Var.f10581h;
                c0685s8.m4759i(c0702sp2.mo3280d());
                Canvas canvasM1806a2 = AbstractC0229g6.m1806a(c0702sp2.f10257i.m430q());
                c0685s8.f9965d.getValue();
                if (gr2.m2021c(c0702sp2.mo3280d())) {
                    t61Var.m5125a();
                    return;
                }
                if (!canvasM1806a2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = jd0Var.f4972d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = jd0Var.f4973e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = jd0Var.f4974f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = jd0Var.f4975g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = jd0Var.f4976h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = jd0Var.f4977i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = jd0Var.f4978j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = jd0Var.f4979k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    t61Var.m5125a();
                    return;
                }
                float fMo689A2 = t61Var.mo689A(30.0f);
                boolean z2 = jd0.m2482f(jd0Var.f4972d) || jd0.m2483g(jd0Var.f4976h) || jd0.m2482f(jd0Var.f4973e) || jd0.m2483g(jd0Var.f4977i);
                boolean z3 = jd0.m2482f(jd0Var.f4974f) || jd0.m2483g(jd0Var.f4978j) || jd0.m2482f(jd0Var.f4975g) || jd0.m2483g(jd0Var.f4979k);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    m2733R0().setPosition(0, 0, canvasM1806a2.getWidth(), canvasM1806a2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        m2733R0().setPosition(0, 0, (gf1.m1869Q(fMo689A2) * 2) + canvasM1806a2.getWidth(), canvasM1806a2.getHeight());
                    } else {
                        if (!z3) {
                            t61Var.m5125a();
                            return;
                        }
                        m2733R0().setPosition(0, 0, canvasM1806a2.getWidth(), (gf1.m1869Q(fMo689A2) * 2) + canvasM1806a2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = m2733R0().beginRecording();
                boolean zM2483g = jd0.m2483g(jd0Var.f4978j);
                qv1 qv1Var = qv1.f9206i;
                if (zM2483g) {
                    EdgeEffect edgeEffectM2484a = jd0Var.f4978j;
                    if (edgeEffectM2484a == null) {
                        edgeEffectM2484a = jd0Var.m2484a(qv1Var);
                        jd0Var.f4978j = edgeEffectM2484a;
                    }
                    m2731P0(90.0f, edgeEffectM2484a, recordingCanvasBeginRecording);
                    edgeEffectM2484a.finish();
                }
                if (jd0.m2482f(jd0Var.f4974f)) {
                    EdgeEffect edgeEffectM2486c2 = jd0Var.m2486c();
                    zM2731P0 = m2731P0(270.0f, edgeEffectM2486c2, recordingCanvasBeginRecording);
                    if (jd0.m2483g(jd0Var.f4974f)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0685s8.m4753c() & j));
                        EdgeEffect edgeEffectM2484a2 = jd0Var.f4978j;
                        if (edgeEffectM2484a2 == null) {
                            edgeEffectM2484a2 = jd0Var.m2484a(qv1Var);
                            jd0Var.f4978j = edgeEffectM2484a2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fM3288c = i2 >= 31 ? AbstractC0495ne.m3288c(edgeEffectM2486c2) : 0.0f;
                        float f4 = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            AbstractC0495ne.m3289d(edgeEffectM2484a2, fM3288c, f4);
                        } else {
                            edgeEffectM2484a2.onPull(fM3288c, f4);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zM2731P0 = false;
                }
                boolean zM2483g2 = jd0.m2483g(jd0Var.f4976h);
                qv1 qv1Var2 = qv1.f9205h;
                if (zM2483g2) {
                    EdgeEffect edgeEffectM2484a3 = jd0Var.f4976h;
                    if (edgeEffectM2484a3 == null) {
                        edgeEffectM2484a3 = jd0Var.m2484a(qv1Var2);
                        jd0Var.f4976h = edgeEffectM2484a3;
                    }
                    m2731P0(180.0f, edgeEffectM2484a3, recordingCanvasBeginRecording);
                    edgeEffectM2484a3.finish();
                }
                if (jd0.m2482f(jd0Var.f4972d)) {
                    EdgeEffect edgeEffectM2488e2 = jd0Var.m2488e();
                    zM2731P0 = m2731P0(0.0f, edgeEffectM2488e2, recordingCanvasBeginRecording) || zM2731P0;
                    if (jd0.m2483g(jd0Var.f4972d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0685s8.m4753c() >> c));
                        EdgeEffect edgeEffectM2484a4 = jd0Var.f4976h;
                        if (edgeEffectM2484a4 == null) {
                            edgeEffectM2484a4 = jd0Var.m2484a(qv1Var2);
                            jd0Var.f4976h = edgeEffectM2484a4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fM3288c2 = i3 >= 31 ? AbstractC0495ne.m3288c(edgeEffectM2488e2) : 0.0f;
                        if (i3 >= 31) {
                            AbstractC0495ne.m3289d(edgeEffectM2484a4, fM3288c2, fIntBitsToFloat2);
                        } else {
                            edgeEffectM2484a4.onPull(fM3288c2, fIntBitsToFloat2);
                        }
                    }
                }
                if (jd0.m2483g(jd0Var.f4979k)) {
                    EdgeEffect edgeEffectM2484a5 = jd0Var.f4979k;
                    if (edgeEffectM2484a5 == null) {
                        edgeEffectM2484a5 = jd0Var.m2484a(qv1Var);
                        jd0Var.f4979k = edgeEffectM2484a5;
                    }
                    m2731P0(270.0f, edgeEffectM2484a5, recordingCanvasBeginRecording);
                    edgeEffectM2484a5.finish();
                }
                if (jd0.m2482f(jd0Var.f4975g)) {
                    EdgeEffect edgeEffectM2487d2 = jd0Var.m2487d();
                    zM2731P0 = m2731P0(90.0f, edgeEffectM2487d2, recordingCanvasBeginRecording) || zM2731P0;
                    if (jd0.m2483g(jd0Var.f4975g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c0685s8.m4753c() & j));
                        EdgeEffect edgeEffectM2484a6 = jd0Var.f4979k;
                        if (edgeEffectM2484a6 == null) {
                            edgeEffectM2484a6 = jd0Var.m2484a(qv1Var);
                            jd0Var.f4979k = edgeEffectM2484a6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fM3288c3 = i4 >= 31 ? AbstractC0495ne.m3288c(edgeEffectM2487d2) : 0.0f;
                        if (i4 >= 31) {
                            AbstractC0495ne.m3289d(edgeEffectM2484a6, fM3288c3, fIntBitsToFloat3);
                        } else {
                            edgeEffectM2484a6.onPull(fM3288c3, fIntBitsToFloat3);
                        }
                    }
                }
                if (jd0.m2483g(jd0Var.f4977i)) {
                    EdgeEffect edgeEffectM2484a7 = jd0Var.f4977i;
                    if (edgeEffectM2484a7 == null) {
                        edgeEffectM2484a7 = jd0Var.m2484a(qv1Var2);
                        jd0Var.f4977i = edgeEffectM2484a7;
                    }
                    m2731P0(0.0f, edgeEffectM2484a7, recordingCanvasBeginRecording);
                    edgeEffectM2484a7.finish();
                }
                if (jd0.m2482f(jd0Var.f4973e)) {
                    EdgeEffect edgeEffectM2485b2 = jd0Var.m2485b();
                    boolean z4 = m2731P0(180.0f, edgeEffectM2485b2, recordingCanvasBeginRecording) || zM2731P0;
                    if (jd0.m2483g(jd0Var.f4973e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c0685s8.m4753c() >> c));
                        EdgeEffect edgeEffectM2484a8 = jd0Var.f4977i;
                        if (edgeEffectM2484a8 == null) {
                            edgeEffectM2484a8 = jd0Var.m2484a(qv1Var2);
                            jd0Var.f4977i = edgeEffectM2484a8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fM3288c4 = i5 >= 31 ? AbstractC0495ne.m3288c(edgeEffectM2485b2) : 0.0f;
                        float f5 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            AbstractC0495ne.m3289d(edgeEffectM2484a8, fM3288c4, f5);
                        } else {
                            edgeEffectM2484a8.onPull(fM3288c4, f5);
                        }
                    }
                    zM2731P0 = z4;
                }
                if (zM2731P0) {
                    c0685s8.m4754d();
                }
                float f6 = z ? 0.0f : fMo689A2;
                float f7 = z2 ? 0.0f : fMo689A2;
                d61 layoutDirection = t61Var.getLayoutDirection();
                C0192f6 c0192f6 = new C0192f6();
                c0192f6.f2807a = recordingCanvasBeginRecording;
                long jMo3280d = c0702sp2.mo3280d();
                C0043b5 c0043b5 = c0702sp2.f10257i;
                C0664rp c0664rp = ((C0702sp) c0043b5.f564k).f10256h;
                e70 e70Var = c0664rp.f9665a;
                d61 d61Var2 = c0664rp.f9666b;
                InterfaceC0627qp interfaceC0627qpM430q = c0043b5.m430q();
                long jM434u = c0702sp2.f10257i.m434u();
                C0043b5 c0043b52 = c0702sp2.f10257i;
                pq0 pq0Var = (pq0) c0043b52.f563j;
                c0043b52.m412C(t61Var);
                c0043b52.m413D(layoutDirection);
                c0043b52.m411B(c0192f6);
                c0043b52.m414E(jMo3280d);
                c0043b52.f563j = null;
                c0192f6.mo1522l();
                try {
                    ((C0485n4) c0702sp2.f10257i.f562i).m3235C(f6, f7);
                    try {
                        t61Var.m5125a();
                        c0192f6.mo1520i();
                        C0043b5 c0043b53 = c0702sp2.f10257i;
                        c0043b53.m412C(e70Var);
                        c0043b53.m413D(d61Var2);
                        c0043b53.m411B(interfaceC0627qpM430q);
                        c0043b53.m414E(jM434u);
                        c0043b53.f563j = pq0Var;
                        m2733R0().endRecording();
                        int iSave = canvasM1806a2.save();
                        canvasM1806a2.translate(f, f2);
                        canvasM1806a2.drawRenderNode(m2733R0());
                        canvasM1806a2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((C0485n4) c0702sp2.f10257i.f562i).m3235C(-f6, -f7);
                    }
                } catch (Throwable th) {
                    c0192f6.mo1520i();
                    C0043b5 c0043b54 = c0702sp2.f10257i;
                    c0043b54.m412C(e70Var);
                    c0043b54.m413D(d61Var2);
                    c0043b54.m411B(interfaceC0627qpM430q);
                    c0043b54.m414E(jM434u);
                    c0043b54.f563j = pq0Var;
                    throw th;
                }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public RenderNode m2733R0() {
        RenderNode renderNode = (RenderNode) this.f5708A;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM5963f = wq0.m5963f();
        this.f5708A = renderNodeM5963f;
        return renderNodeM5963f;
    }

    public kq0(zw2 zw2Var, C0685s8 c0685s8, jd0 jd0Var) {
        this.f5710y = c0685s8;
        this.f5711z = jd0Var;
        m5468M0(zw2Var);
    }
}
