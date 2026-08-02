package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kq0 extends u60 implements mc0 {
    public Object A;
    public final /* synthetic */ int x = 1;
    public final s8 y;
    public final jd0 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kq0(zw2 zw2Var, s8 s8Var, jd0 jd0Var, jw1 jw1Var) {
        this.y = s8Var;
        this.z = jd0Var;
        this.A = jw1Var;
        M0(zw2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean P0(float f, EdgeEffect edgeEffect, Canvas canvas) {
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
    public static boolean Q0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mc0
    public final void P(t61 t61Var) {
        boolean zQ0;
        long j;
        char c;
        boolean z;
        boolean zP0;
        float f;
        float f2;
        int i = this.x;
        s8 s8Var = this.y;
        jd0 jd0Var = this.z;
        switch (i) {
            case 0:
                jw1 jw1Var = (jw1) this.A;
                sp spVar = t61Var.h;
                s8Var.i(spVar.d());
                if (gr2.c(spVar.d())) {
                    t61Var.a();
                    return;
                }
                t61Var.a();
                s8Var.d.getValue();
                Canvas canvasA = g6.a(spVar.i.q());
                boolean zF = jd0.f(jd0Var.f);
                d61 d61Var = d61.h;
                if (zF) {
                    EdgeEffect edgeEffectC = jd0Var.c();
                    float f3 = -Float.intBitsToFloat((int) (spVar.d() & 4294967295L));
                    zQ0 = Q0(270.0f, (((long) Float.floatToRawIntBits(t61Var.A(t61Var.getLayoutDirection() == d61Var ? jw1Var.a : jw1Var.c))) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), edgeEffectC, canvasA);
                } else {
                    zQ0 = false;
                }
                if (jd0.f(jd0Var.d)) {
                    EdgeEffect edgeEffectE = jd0Var.e();
                    zQ0 = Q0(0.0f, (((long) Float.floatToRawIntBits(t61Var.A(jw1Var.b))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), edgeEffectE, canvasA) || zQ0;
                }
                if (jd0.f(jd0Var.g)) {
                    EdgeEffect edgeEffectD = jd0Var.d();
                    zQ0 = Q0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(t61Var.A(t61Var.getLayoutDirection() == d61Var ? jw1Var.c : jw1Var.a) + (-((float) gf1.Q(Float.intBitsToFloat((int) (spVar.d() >> 32))))))) & 4294967295L), edgeEffectD, canvasA) || zQ0;
                }
                if (jd0.f(jd0Var.e)) {
                    EdgeEffect edgeEffectB = jd0Var.b();
                    float fA = t61Var.A(jw1Var.d);
                    zQ0 = Q0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (spVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (spVar.d() & 4294967295L))) + fA)) & 4294967295L), edgeEffectB, canvasA) || zQ0;
                }
                if (zQ0) {
                    s8Var.d();
                    return;
                }
                return;
            default:
                sp spVar2 = t61Var.h;
                s8Var.i(spVar2.d());
                Canvas canvasA2 = g6.a(spVar2.i.q());
                s8Var.d.getValue();
                if (gr2.c(spVar2.d())) {
                    t61Var.a();
                    return;
                }
                if (!canvasA2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = jd0Var.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = jd0Var.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = jd0Var.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = jd0Var.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = jd0Var.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = jd0Var.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = jd0Var.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = jd0Var.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    t61Var.a();
                    return;
                }
                float fA2 = t61Var.A(30.0f);
                boolean z2 = jd0.f(jd0Var.d) || jd0.g(jd0Var.h) || jd0.f(jd0Var.e) || jd0.g(jd0Var.i);
                boolean z3 = jd0.f(jd0Var.f) || jd0.g(jd0Var.j) || jd0.f(jd0Var.g) || jd0.g(jd0Var.k);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    R0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        R0().setPosition(0, 0, (gf1.Q(fA2) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                    } else {
                        if (!z3) {
                            t61Var.a();
                            return;
                        }
                        R0().setPosition(0, 0, canvasA2.getWidth(), (gf1.Q(fA2) * 2) + canvasA2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = R0().beginRecording();
                boolean zG = jd0.g(jd0Var.j);
                qv1 qv1Var = qv1.i;
                if (zG) {
                    EdgeEffect edgeEffectA = jd0Var.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = jd0Var.a(qv1Var);
                        jd0Var.j = edgeEffectA;
                    }
                    P0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (jd0.f(jd0Var.f)) {
                    EdgeEffect edgeEffectC2 = jd0Var.c();
                    zP0 = P0(270.0f, edgeEffectC2, recordingCanvasBeginRecording);
                    if (jd0.g(jd0Var.f)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (s8Var.c() & j));
                        EdgeEffect edgeEffectA2 = jd0Var.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = jd0Var.a(qv1Var);
                            jd0Var.j = edgeEffectA2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fC = i2 >= 31 ? ne.c(edgeEffectC2) : 0.0f;
                        float f4 = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            ne.d(edgeEffectA2, fC, f4);
                        } else {
                            edgeEffectA2.onPull(fC, f4);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zP0 = false;
                }
                boolean zG2 = jd0.g(jd0Var.h);
                qv1 qv1Var2 = qv1.h;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = jd0Var.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = jd0Var.a(qv1Var2);
                        jd0Var.h = edgeEffectA3;
                    }
                    P0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (jd0.f(jd0Var.d)) {
                    EdgeEffect edgeEffectE2 = jd0Var.e();
                    zP0 = P0(0.0f, edgeEffectE2, recordingCanvasBeginRecording) || zP0;
                    if (jd0.g(jd0Var.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (s8Var.c() >> c));
                        EdgeEffect edgeEffectA4 = jd0Var.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = jd0Var.a(qv1Var2);
                            jd0Var.h = edgeEffectA4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fC2 = i3 >= 31 ? ne.c(edgeEffectE2) : 0.0f;
                        if (i3 >= 31) {
                            ne.d(edgeEffectA4, fC2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fC2, fIntBitsToFloat2);
                        }
                    }
                }
                if (jd0.g(jd0Var.k)) {
                    EdgeEffect edgeEffectA5 = jd0Var.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = jd0Var.a(qv1Var);
                        jd0Var.k = edgeEffectA5;
                    }
                    P0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (jd0.f(jd0Var.g)) {
                    EdgeEffect edgeEffectD2 = jd0Var.d();
                    zP0 = P0(90.0f, edgeEffectD2, recordingCanvasBeginRecording) || zP0;
                    if (jd0.g(jd0Var.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (s8Var.c() & j));
                        EdgeEffect edgeEffectA6 = jd0Var.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = jd0Var.a(qv1Var);
                            jd0Var.k = edgeEffectA6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fC3 = i4 >= 31 ? ne.c(edgeEffectD2) : 0.0f;
                        if (i4 >= 31) {
                            ne.d(edgeEffectA6, fC3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fC3, fIntBitsToFloat3);
                        }
                    }
                }
                if (jd0.g(jd0Var.i)) {
                    EdgeEffect edgeEffectA7 = jd0Var.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = jd0Var.a(qv1Var2);
                        jd0Var.i = edgeEffectA7;
                    }
                    P0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (jd0.f(jd0Var.e)) {
                    EdgeEffect edgeEffectB2 = jd0Var.b();
                    boolean z4 = P0(180.0f, edgeEffectB2, recordingCanvasBeginRecording) || zP0;
                    if (jd0.g(jd0Var.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (s8Var.c() >> c));
                        EdgeEffect edgeEffectA8 = jd0Var.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = jd0Var.a(qv1Var2);
                            jd0Var.i = edgeEffectA8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fC4 = i5 >= 31 ? ne.c(edgeEffectB2) : 0.0f;
                        float f5 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            ne.d(edgeEffectA8, fC4, f5);
                        } else {
                            edgeEffectA8.onPull(fC4, f5);
                        }
                    }
                    zP0 = z4;
                }
                if (zP0) {
                    s8Var.d();
                }
                float f6 = z ? 0.0f : fA2;
                float f7 = z2 ? 0.0f : fA2;
                d61 layoutDirection = t61Var.getLayoutDirection();
                f6 f6Var = new f6();
                f6Var.a = recordingCanvasBeginRecording;
                long jD = spVar2.d();
                b5 b5Var = spVar2.i;
                rp rpVar = ((sp) b5Var.k).h;
                e70 e70Var = rpVar.a;
                d61 d61Var2 = rpVar.b;
                qp qpVarQ = b5Var.q();
                long jU = spVar2.i.u();
                b5 b5Var2 = spVar2.i;
                pq0 pq0Var = (pq0) b5Var2.j;
                b5Var2.C(t61Var);
                b5Var2.D(layoutDirection);
                b5Var2.B(f6Var);
                b5Var2.E(jD);
                b5Var2.j = null;
                f6Var.l();
                try {
                    ((n4) spVar2.i.i).C(f6, f7);
                    try {
                        t61Var.a();
                        f6Var.i();
                        b5 b5Var3 = spVar2.i;
                        b5Var3.C(e70Var);
                        b5Var3.D(d61Var2);
                        b5Var3.B(qpVarQ);
                        b5Var3.E(jU);
                        b5Var3.j = pq0Var;
                        R0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f, f2);
                        canvasA2.drawRenderNode(R0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((n4) spVar2.i.i).C(-f6, -f7);
                    }
                } catch (Throwable th) {
                    f6Var.i();
                    b5 b5Var4 = spVar2.i;
                    b5Var4.C(e70Var);
                    b5Var4.D(d61Var2);
                    b5Var4.B(qpVarQ);
                    b5Var4.E(jU);
                    b5Var4.j = pq0Var;
                    throw th;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RenderNode R0() {
        RenderNode renderNode = (RenderNode) this.A;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeF = wq0.f();
        this.A = renderNodeF;
        return renderNodeF;
    }

    public kq0(zw2 zw2Var, s8 s8Var, jd0 jd0Var) {
        this.y = s8Var;
        this.z = jd0Var;
        M0(zw2Var);
    }
}
