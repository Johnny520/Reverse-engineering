package p216p;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import p000A.C0072l0;
import p007B0.C0186T;
import p041H0.AbstractC0599j;
import p041H0.C0566K;
import p041H0.InterfaceC0605m;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p204n0.C2686e;
import p211o0.AbstractC2744c;
import p211o0.AbstractC2754m;
import p211o0.C2743b;
import p211o0.InterfaceC2760s;
import p222q0.C2900a;
import p222q0.C2901b;
import p227r.EnumC2983d0;
import p228r0.C3029b;
import p244u.C3251U;

/* JADX INFO: renamed from: p.G */
/* JADX INFO: loaded from: classes.dex */
public final class C2814G extends AbstractC0599j implements InterfaceC0605m {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f8862t = 1;

    /* JADX INFO: renamed from: u */
    public final C2847h f8863u;

    /* JADX INFO: renamed from: v */
    public final C2809B f8864v;

    /* JADX INFO: renamed from: w */
    public Object f8865w;

    public C2814G(C0186T c0186t, C2847h c2847h, C2809B c2809b) {
        this.f8863u = c2847h;
        this.f8864v = c2809b;
        m1021J0(c0186t);
    }

    /* JADX INFO: renamed from: M0 */
    public static boolean m5017M0(float f2, EdgeEffect edgeEffect, Canvas canvas) {
        if (f2 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f2);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: N0 */
    public static boolean m5018N0(float f2, long j5, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f2);
        canvas.translate(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: O0 */
    public RenderNode m5019O0() {
        RenderNode renderNode = (RenderNode) this.f8865w;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM4893c = AbstractC2754m.m4893c();
        this.f8865w = renderNodeM4893c;
        return renderNodeM4893c;
    }

    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: R */
    public final void mo940R(C0566K c0566k) {
        long j5;
        char c5;
        boolean zM5018N0;
        float f2;
        boolean z5;
        boolean zM5017M0;
        C2847h c2847h;
        RecordingCanvas recordingCanvas;
        char c6;
        float f5;
        float f6;
        float f7;
        float fM5045b;
        switch (this.f8862t) {
            case 0:
                C3251U c3251u = (C3251U) this.f8865w;
                C2901b c2901b = c0566k.f1742d;
                long jMo859c = c2901b.mo859c();
                C2847h c2847h2 = this.f8863u;
                c2847h2.m5040i(jMo859c);
                if (C2686e.m4663c(c2901b.mo859c())) {
                    c0566k.m857a();
                    return;
                }
                c0566k.m857a();
                c2847h2.f8945d.getValue();
                Canvas canvasM4858a = AbstractC2744c.m4858a(c2901b.f9185e.m106j());
                C2809B c2809b = this.f8864v;
                boolean zM5007f = C2809B.m5007f(c2809b.f8846f);
                EnumC2017m enumC2017m = EnumC2017m.f6742d;
                if (zM5007f) {
                    j5 = 4294967295L;
                    c5 = ' ';
                    zM5018N0 = m5018N0(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c2901b.mo859c() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(c0566k.mo268G(c0566k.getLayoutDirection() == enumC2017m ? c3251u.f10063a : c3251u.f10065c))) & 4294967295L), c2809b.m5011c(), canvasM4858a);
                } else {
                    j5 = 4294967295L;
                    c5 = ' ';
                    zM5018N0 = false;
                }
                if (C2809B.m5007f(c2809b.f8844d)) {
                    zM5018N0 = m5018N0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << c5) | (((long) Float.floatToRawIntBits(c0566k.mo268G(c3251u.f10064b))) & j5), c2809b.m5013e(), canvasM4858a) || zM5018N0;
                }
                if (C2809B.m5007f(c2809b.f8847g)) {
                    EdgeEffect edgeEffectM5012d = c2809b.m5012d();
                    zM5018N0 = m5018N0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << c5) | (((long) Float.floatToRawIntBits(c0566k.mo268G(c0566k.getLayoutDirection() == enumC2017m ? c3251u.f10065c : c3251u.f10063a) + (-((float) AbstractC1784a.m3200N(Float.intBitsToFloat((int) (c2901b.mo859c() >> c5))))))) & j5), edgeEffectM5012d, canvasM4858a) || zM5018N0;
                }
                if (C2809B.m5007f(c2809b.f8845e)) {
                    EdgeEffect edgeEffectM5010b = c2809b.m5010b();
                    zM5018N0 = m5018N0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c2901b.mo859c() & j5))) + c0566k.mo268G(c3251u.f10066d))) & j5) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c2901b.mo859c() >> c5)))) << c5), edgeEffectM5010b, canvasM4858a) || zM5018N0;
                }
                if (zM5018N0) {
                    c2847h2.m5035d();
                    return;
                }
                return;
            default:
                C2901b c2901b2 = c0566k.f1742d;
                long jMo859c2 = c2901b2.mo859c();
                C2847h c2847h3 = this.f8863u;
                c2847h3.m5040i(jMo859c2);
                Canvas canvasM4858a2 = AbstractC2744c.m4858a(c2901b2.f9185e.m106j());
                c2847h3.f8945d.getValue();
                if (C2686e.m4663c(c2901b2.mo859c())) {
                    c0566k.m857a();
                    return;
                }
                boolean zIsHardwareAccelerated = canvasM4858a2.isHardwareAccelerated();
                C2809B c2809b2 = this.f8864v;
                if (!zIsHardwareAccelerated) {
                    EdgeEffect edgeEffect = c2809b2.f8844d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = c2809b2.f8845e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = c2809b2.f8846f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = c2809b2.f8847g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = c2809b2.f8848h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = c2809b2.f8849i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = c2809b2.f8850j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = c2809b2.f8851k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    c0566k.m857a();
                    return;
                }
                float fMo268G = c0566k.mo268G(AbstractC2867x.f9055a);
                boolean z6 = C2809B.m5007f(c2809b2.f8844d) || C2809B.m5008g(c2809b2.f8848h) || C2809B.m5007f(c2809b2.f8845e) || C2809B.m5008g(c2809b2.f8849i);
                boolean z7 = C2809B.m5007f(c2809b2.f8846f) || C2809B.m5008g(c2809b2.f8850j) || C2809B.m5007f(c2809b2.f8847g) || C2809B.m5008g(c2809b2.f8851k);
                if (z6 && z7) {
                    m5019O0().setPosition(0, 0, canvasM4858a2.getWidth(), canvasM4858a2.getHeight());
                } else if (z6) {
                    m5019O0().setPosition(0, 0, (AbstractC1784a.m3200N(fMo268G) * 2) + canvasM4858a2.getWidth(), canvasM4858a2.getHeight());
                } else {
                    if (!z7) {
                        c0566k.m857a();
                        return;
                    }
                    m5019O0().setPosition(0, 0, canvasM4858a2.getWidth(), (AbstractC1784a.m3200N(fMo268G) * 2) + canvasM4858a2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = m5019O0().beginRecording();
                boolean zM5008g = C2809B.m5008g(c2809b2.f8850j);
                EnumC2983d0 enumC2983d0 = EnumC2983d0.f9448e;
                if (zM5008g) {
                    EdgeEffect edgeEffectM5009a = c2809b2.f8850j;
                    if (edgeEffectM5009a == null) {
                        edgeEffectM5009a = c2809b2.m5009a(enumC2983d0);
                        c2809b2.f8850j = edgeEffectM5009a;
                    }
                    m5017M0(90.0f, edgeEffectM5009a, recordingCanvasBeginRecording);
                    edgeEffectM5009a.finish();
                }
                if (C2809B.m5007f(c2809b2.f8846f)) {
                    EdgeEffect edgeEffectM5011c = c2809b2.m5011c();
                    zM5017M0 = m5017M0(270.0f, edgeEffectM5011c, recordingCanvasBeginRecording);
                    if (C2809B.m5008g(c2809b2.f8846f)) {
                        z5 = z7;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c2847h3.m5034c() & 4294967295L));
                        EdgeEffect edgeEffectM5009a2 = c2809b2.f8850j;
                        if (edgeEffectM5009a2 == null) {
                            edgeEffectM5009a2 = c2809b2.m5009a(enumC2983d0);
                            c2809b2.f8850j = edgeEffectM5009a2;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fM5045b2 = i5 >= 31 ? AbstractC2853k.m5045b(edgeEffectM5011c) : 0.0f;
                        f2 = fMo268G;
                        float f8 = 1 - fIntBitsToFloat;
                        if (i5 >= 31) {
                            AbstractC2853k.m5046c(edgeEffectM5009a2, fM5045b2, f8);
                        } else {
                            edgeEffectM5009a2.onPull(fM5045b2, f8);
                        }
                    } else {
                        f2 = fMo268G;
                        z5 = z7;
                    }
                } else {
                    f2 = fMo268G;
                    z5 = z7;
                    zM5017M0 = false;
                }
                boolean zM5008g2 = C2809B.m5008g(c2809b2.f8848h);
                EnumC2983d0 enumC2983d02 = EnumC2983d0.f9447d;
                if (zM5008g2) {
                    EdgeEffect edgeEffectM5009a3 = c2809b2.f8848h;
                    if (edgeEffectM5009a3 == null) {
                        edgeEffectM5009a3 = c2809b2.m5009a(enumC2983d02);
                        c2809b2.f8848h = edgeEffectM5009a3;
                    }
                    m5017M0(180.0f, edgeEffectM5009a3, recordingCanvasBeginRecording);
                    edgeEffectM5009a3.finish();
                }
                if (C2809B.m5007f(c2809b2.f8844d)) {
                    EdgeEffect edgeEffectM5013e = c2809b2.m5013e();
                    boolean z8 = m5017M0(0.0f, edgeEffectM5013e, recordingCanvasBeginRecording) || zM5017M0;
                    if (C2809B.m5008g(c2809b2.f8844d)) {
                        recordingCanvas = recordingCanvasBeginRecording;
                        c6 = ' ';
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2847h3.m5034c() >> 32));
                        EdgeEffect edgeEffectM5009a4 = c2809b2.f8848h;
                        if (edgeEffectM5009a4 == null) {
                            edgeEffectM5009a4 = c2809b2.m5009a(enumC2983d02);
                            c2809b2.f8848h = edgeEffectM5009a4;
                        }
                        int i6 = Build.VERSION.SDK_INT;
                        if (i6 >= 31) {
                            c2847h = c2847h3;
                            fM5045b = AbstractC2853k.m5045b(edgeEffectM5013e);
                        } else {
                            c2847h = c2847h3;
                            fM5045b = 0.0f;
                        }
                        if (i6 >= 31) {
                            AbstractC2853k.m5046c(edgeEffectM5009a4, fM5045b, fIntBitsToFloat2);
                        } else {
                            edgeEffectM5009a4.onPull(fM5045b, fIntBitsToFloat2);
                        }
                    } else {
                        c2847h = c2847h3;
                        recordingCanvas = recordingCanvasBeginRecording;
                        c6 = ' ';
                    }
                    zM5017M0 = z8;
                } else {
                    c2847h = c2847h3;
                    recordingCanvas = recordingCanvasBeginRecording;
                    c6 = ' ';
                }
                if (C2809B.m5008g(c2809b2.f8851k)) {
                    EdgeEffect edgeEffectM5009a5 = c2809b2.f8851k;
                    if (edgeEffectM5009a5 == null) {
                        edgeEffectM5009a5 = c2809b2.m5009a(enumC2983d0);
                        c2809b2.f8851k = edgeEffectM5009a5;
                    }
                    m5017M0(270.0f, edgeEffectM5009a5, recordingCanvas);
                    edgeEffectM5009a5.finish();
                }
                if (C2809B.m5007f(c2809b2.f8847g)) {
                    EdgeEffect edgeEffectM5012d2 = c2809b2.m5012d();
                    boolean z9 = m5017M0(90.0f, edgeEffectM5012d2, recordingCanvas) || zM5017M0;
                    if (C2809B.m5008g(c2809b2.f8847g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c2847h.m5034c() & 4294967295L));
                        EdgeEffect edgeEffectM5009a6 = c2809b2.f8851k;
                        if (edgeEffectM5009a6 == null) {
                            edgeEffectM5009a6 = c2809b2.m5009a(enumC2983d0);
                            c2809b2.f8851k = edgeEffectM5009a6;
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        float fM5045b3 = i7 >= 31 ? AbstractC2853k.m5045b(edgeEffectM5012d2) : 0.0f;
                        if (i7 >= 31) {
                            AbstractC2853k.m5046c(edgeEffectM5009a6, fM5045b3, fIntBitsToFloat3);
                        } else {
                            edgeEffectM5009a6.onPull(fM5045b3, fIntBitsToFloat3);
                        }
                    }
                    zM5017M0 = z9;
                }
                if (C2809B.m5008g(c2809b2.f8849i)) {
                    EdgeEffect edgeEffectM5009a7 = c2809b2.f8849i;
                    if (edgeEffectM5009a7 == null) {
                        edgeEffectM5009a7 = c2809b2.m5009a(enumC2983d02);
                        c2809b2.f8849i = edgeEffectM5009a7;
                    }
                    f5 = 0.0f;
                    m5017M0(0.0f, edgeEffectM5009a7, recordingCanvas);
                    edgeEffectM5009a7.finish();
                } else {
                    f5 = 0.0f;
                }
                if (C2809B.m5007f(c2809b2.f8845e)) {
                    EdgeEffect edgeEffectM5010b2 = c2809b2.m5010b();
                    boolean z10 = m5017M0(180.0f, edgeEffectM5010b2, recordingCanvas) || zM5017M0;
                    if (C2809B.m5008g(c2809b2.f8845e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c2847h.m5034c() >> c6));
                        EdgeEffect edgeEffectM5009a8 = c2809b2.f8849i;
                        if (edgeEffectM5009a8 == null) {
                            edgeEffectM5009a8 = c2809b2.m5009a(enumC2983d02);
                            c2809b2.f8849i = edgeEffectM5009a8;
                        }
                        int i8 = Build.VERSION.SDK_INT;
                        float fM5045b4 = i8 >= 31 ? AbstractC2853k.m5045b(edgeEffectM5010b2) : f5;
                        float f9 = 1 - fIntBitsToFloat4;
                        if (i8 >= 31) {
                            AbstractC2853k.m5046c(edgeEffectM5009a8, fM5045b4, f9);
                        } else {
                            edgeEffectM5009a8.onPull(fM5045b4, f9);
                        }
                    }
                    zM5017M0 = z10;
                }
                if (zM5017M0) {
                    c2847h.m5035d();
                }
                float f10 = z5 ? f5 : f2;
                if (!z6) {
                    f5 = f2;
                }
                EnumC2017m layoutDirection = c0566k.getLayoutDirection();
                C2743b c2743b = new C2743b();
                c2743b.f8723a = recordingCanvas;
                long jMo859c3 = c2901b2.mo859c();
                C0072l0 c0072l0 = c2901b2.f9185e;
                C2900a c2900a = ((C2901b) c0072l0.f309g).f9184d;
                InterfaceC2007c interfaceC2007c = c2900a.f9180a;
                EnumC2017m enumC2017m2 = c2900a.f9181b;
                InterfaceC2760s interfaceC2760sM106j = c0072l0.m106j();
                long jM110n = c2901b2.f9185e.m110n();
                C0072l0 c0072l02 = c2901b2.f9185e;
                C3029b c3029b = (C3029b) c0072l02.f308f;
                c0072l02.m117w(c0566k);
                c0072l02.m118x(layoutDirection);
                c0072l02.m116v(c2743b);
                c0072l02.m119y(jMo859c3);
                c0072l02.f308f = null;
                c2743b.mo4852n();
                try {
                    ((C1753n) c2901b2.f9185e.f307e).m3115L(f10, f5);
                    try {
                        c0566k.m857a();
                        c2743b.mo4851l();
                        C0072l0 c0072l03 = c2901b2.f9185e;
                        c0072l03.m117w(interfaceC2007c);
                        c0072l03.m118x(enumC2017m2);
                        c0072l03.m116v(interfaceC2760sM106j);
                        c0072l03.m119y(jM110n);
                        c0072l03.f308f = c3029b;
                        m5019O0().endRecording();
                        int iSave = canvasM4858a2.save();
                        canvasM4858a2.translate(f6, f7);
                        canvasM4858a2.drawRenderNode(m5019O0());
                        canvasM4858a2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((C1753n) c2901b2.f9185e.f307e).m3115L(-f10, -f5);
                    }
                } catch (Throwable th) {
                    c2743b.mo4851l();
                    C0072l0 c0072l04 = c2901b2.f9185e;
                    c0072l04.m117w(interfaceC2007c);
                    c0072l04.m118x(enumC2017m2);
                    c0072l04.m116v(interfaceC2760sM106j);
                    c0072l04.m119y(jM110n);
                    c0072l04.f308f = c3029b;
                    throw th;
                }
        }
    }

    public C2814G(C0186T c0186t, C2847h c2847h, C2809B c2809b, C3251U c3251u) {
        this.f8863u = c2847h;
        this.f8864v = c2809b;
        this.f8865w = c3251u;
        m1021J0(c0186t);
    }
}
