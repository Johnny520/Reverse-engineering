package p144k;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.lifecycle.C0119x;
import p020b5.C0184c;
import p057e1.C0810e;
import p071f1.AbstractC0995c;
import p071f1.C0993b;
import p071f1.InterfaceC1031u;
import p101h1.C1565b;
import p118i1.C1902b;
import p129ig.AbstractC2043a;
import p133j2.AbstractC2052b;
import p174m.EnumC2640p1;
import p222p.InterfaceC3268x0;
import p267s1.C3906l0;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p339x1.AbstractC5615j;
import p339x1.C5610h0;
import p339x1.InterfaceC5624m;

/* JADX INFO: renamed from: k.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2193n0 extends AbstractC5615j implements InterfaceC5624m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7271w = 1;

    /* JADX INFO: renamed from: x */
    public final C2177i f7272x;

    /* JADX INFO: renamed from: y */
    public final C2172g0 f7273y;

    /* JADX INFO: renamed from: z */
    public Object f7274z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2193n0(C3906l0 c3906l0, C2177i c2177i, C2172g0 c2172g0, InterfaceC3268x0 interfaceC3268x0) {
        this.f7272x = c2177i;
        this.f7273y = c2172g0;
        this.f7274z = interfaceC3268x0;
        m10122k1(c3906l0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public static boolean m5444n1(float f3, EdgeEffect edgeEffect, Canvas canvas) {
        if (f3 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f3);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public static boolean m5445o1(float f3, long j3, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f3);
        canvas.translate(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    public final void mo1326B(C5610h0 c5610h0) {
        boolean zM5445o1;
        char c10;
        long j3;
        float f3;
        boolean z9;
        boolean zM5444n1;
        C2177i c2177i;
        RecordingCanvas recordingCanvas;
        char c11;
        float f10;
        float f11;
        float f12;
        float fM5421b;
        switch (this.f7271w) {
            case 0:
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) this.f7274z;
                C1565b c1565b = c5610h0.f22833g;
                long jMo4091a = c1565b.mo4091a();
                C2177i c2177i2 = this.f7272x;
                c2177i2.m5415l(jMo4091a);
                if (C0810e.m2056c(c1565b.mo4091a())) {
                    c5610h0.m10064e();
                    return;
                }
                c5610h0.m10064e();
                c2177i2.f7240d.getValue();
                Canvas canvasM2502a = AbstractC0995c.m2502a(c1565b.f5220h.m819p());
                C2172g0 c2172g0 = this.f7273y;
                if (C2172g0.m5399f(c2172g0.f7214f)) {
                    zM5445o1 = m5445o1(270.0f, (((long) Float.floatToRawIntBits(c5610h0.mo1601x0(interfaceC3268x0.mo6925d(c5610h0.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1565b.mo4091a() & 4294967295L)))) << 32), c2172g0.m5403c(), canvasM2502a);
                } else {
                    zM5445o1 = false;
                }
                if (C2172g0.m5399f(c2172g0.f7212d)) {
                    c10 = ' ';
                    j3 = 4294967295L;
                    zM5445o1 = m5445o1(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c5610h0.mo1601x0(interfaceC3268x0.mo6924c()))) & 4294967295L), c2172g0.m5405e(), canvasM2502a) || zM5445o1;
                } else {
                    c10 = ' ';
                    j3 = 4294967295L;
                }
                if (C2172g0.m5399f(c2172g0.f7215g)) {
                    zM5445o1 = m5445o1(90.0f, (((long) Float.floatToRawIntBits(c5610h0.mo1601x0(interfaceC3268x0.mo6923b(c5610h0.getLayoutDirection())) + (-((float) AbstractC2043a.m5018X(Float.intBitsToFloat((int) (c1565b.mo4091a() >> c10))))))) & j3) | (((long) Float.floatToRawIntBits(0.0f)) << c10), c2172g0.m5404d(), canvasM2502a) || zM5445o1;
                }
                if (C2172g0.m5399f(c2172g0.f7213e)) {
                    zM5445o1 = m5445o1(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c1565b.mo4091a() & j3))) + c5610h0.mo1601x0(interfaceC3268x0.mo6922a()))) & j3) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1565b.mo4091a() >> c10)))) << c10), c2172g0.m5402b(), canvasM2502a) || zM5445o1;
                }
                if (zM5445o1) {
                    c2177i2.m5410g();
                    return;
                }
                return;
            default:
                C1565b c1565b2 = c5610h0.f22833g;
                long jMo4091a2 = c1565b2.mo4091a();
                C2177i c2177i3 = this.f7272x;
                c2177i3.m5415l(jMo4091a2);
                Canvas canvasM2502a2 = AbstractC0995c.m2502a(c1565b2.f5220h.m819p());
                c2177i3.f7240d.getValue();
                if (C0810e.m2056c(c1565b2.mo4091a())) {
                    c5610h0.m10064e();
                    return;
                }
                boolean zIsHardwareAccelerated = canvasM2502a2.isHardwareAccelerated();
                C2172g0 c2172g02 = this.f7273y;
                if (!zIsHardwareAccelerated) {
                    EdgeEffect edgeEffect = c2172g02.f7212d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = c2172g02.f7213e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = c2172g02.f7214f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = c2172g02.f7215g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = c2172g02.f7216h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = c2172g02.f7217i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = c2172g02.f7218j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = c2172g02.f7219k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    c5610h0.m10064e();
                    return;
                }
                float fMo1601x0 = c5610h0.mo1601x0(AbstractC2225y.f7371a);
                boolean z10 = C2172g0.m5399f(c2172g02.f7212d) || C2172g0.m5400g(c2172g02.f7216h) || C2172g0.m5399f(c2172g02.f7213e) || C2172g0.m5400g(c2172g02.f7217i);
                boolean z11 = C2172g0.m5399f(c2172g02.f7214f) || C2172g0.m5400g(c2172g02.f7218j) || C2172g0.m5399f(c2172g02.f7215g) || C2172g0.m5400g(c2172g02.f7219k);
                if (z10 && z11) {
                    m5446p1().setPosition(0, 0, canvasM2502a2.getWidth(), canvasM2502a2.getHeight());
                } else if (z10) {
                    m5446p1().setPosition(0, 0, (AbstractC2043a.m5018X(fMo1601x0) * 2) + canvasM2502a2.getWidth(), canvasM2502a2.getHeight());
                } else {
                    if (!z11) {
                        c5610h0.m10064e();
                        return;
                    }
                    m5446p1().setPosition(0, 0, canvasM2502a2.getWidth(), (AbstractC2043a.m5018X(fMo1601x0) * 2) + canvasM2502a2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = m5446p1().beginRecording();
                boolean zM5400g = C2172g0.m5400g(c2172g02.f7218j);
                EnumC2640p1 enumC2640p1 = EnumC2640p1.f8623h;
                if (zM5400g) {
                    EdgeEffect edgeEffectM5401a = c2172g02.f7218j;
                    if (edgeEffectM5401a == null) {
                        edgeEffectM5401a = c2172g02.m5401a(enumC2640p1);
                        c2172g02.f7218j = edgeEffectM5401a;
                    }
                    m5444n1(90.0f, edgeEffectM5401a, recordingCanvasBeginRecording);
                    edgeEffectM5401a.finish();
                }
                if (C2172g0.m5399f(c2172g02.f7214f)) {
                    EdgeEffect edgeEffectM5403c = c2172g02.m5403c();
                    zM5444n1 = m5444n1(270.0f, edgeEffectM5403c, recordingCanvasBeginRecording);
                    if (C2172g0.m5400g(c2172g02.f7214f)) {
                        z9 = z11;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c2177i3.m5409f() & 4294967295L));
                        EdgeEffect edgeEffectM5401a2 = c2172g02.f7218j;
                        if (edgeEffectM5401a2 == null) {
                            edgeEffectM5401a2 = c2172g02.m5401a(enumC2640p1);
                            c2172g02.f7218j = edgeEffectM5401a2;
                        }
                        int i9 = Build.VERSION.SDK_INT;
                        float fM5421b2 = i9 >= 31 ? AbstractC2186l.m5421b(edgeEffectM5403c) : 0.0f;
                        f3 = fMo1601x0;
                        float f13 = 1 - fIntBitsToFloat;
                        if (i9 >= 31) {
                            AbstractC2186l.m5422c(edgeEffectM5401a2, fM5421b2, f13);
                        } else {
                            edgeEffectM5401a2.onPull(fM5421b2, f13);
                        }
                    } else {
                        f3 = fMo1601x0;
                        z9 = z11;
                    }
                } else {
                    f3 = fMo1601x0;
                    z9 = z11;
                    zM5444n1 = false;
                }
                boolean zM5400g2 = C2172g0.m5400g(c2172g02.f7216h);
                EnumC2640p1 enumC2640p12 = EnumC2640p1.f8622g;
                if (zM5400g2) {
                    EdgeEffect edgeEffectM5401a3 = c2172g02.f7216h;
                    if (edgeEffectM5401a3 == null) {
                        edgeEffectM5401a3 = c2172g02.m5401a(enumC2640p12);
                        c2172g02.f7216h = edgeEffectM5401a3;
                    }
                    m5444n1(180.0f, edgeEffectM5401a3, recordingCanvasBeginRecording);
                    edgeEffectM5401a3.finish();
                }
                if (C2172g0.m5399f(c2172g02.f7212d)) {
                    EdgeEffect edgeEffectM5405e = c2172g02.m5405e();
                    boolean z12 = m5444n1(0.0f, edgeEffectM5405e, recordingCanvasBeginRecording) || zM5444n1;
                    if (C2172g0.m5400g(c2172g02.f7212d)) {
                        recordingCanvas = recordingCanvasBeginRecording;
                        c11 = ' ';
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2177i3.m5409f() >> 32));
                        EdgeEffect edgeEffectM5401a4 = c2172g02.f7216h;
                        if (edgeEffectM5401a4 == null) {
                            edgeEffectM5401a4 = c2172g02.m5401a(enumC2640p12);
                            c2172g02.f7216h = edgeEffectM5401a4;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            c2177i = c2177i3;
                            fM5421b = AbstractC2186l.m5421b(edgeEffectM5405e);
                        } else {
                            c2177i = c2177i3;
                            fM5421b = 0.0f;
                        }
                        if (i10 >= 31) {
                            AbstractC2186l.m5422c(edgeEffectM5401a4, fM5421b, fIntBitsToFloat2);
                        } else {
                            edgeEffectM5401a4.onPull(fM5421b, fIntBitsToFloat2);
                        }
                    } else {
                        c2177i = c2177i3;
                        recordingCanvas = recordingCanvasBeginRecording;
                        c11 = ' ';
                    }
                    zM5444n1 = z12;
                } else {
                    c2177i = c2177i3;
                    recordingCanvas = recordingCanvasBeginRecording;
                    c11 = ' ';
                }
                if (C2172g0.m5400g(c2172g02.f7219k)) {
                    EdgeEffect edgeEffectM5401a5 = c2172g02.f7219k;
                    if (edgeEffectM5401a5 == null) {
                        edgeEffectM5401a5 = c2172g02.m5401a(enumC2640p1);
                        c2172g02.f7219k = edgeEffectM5401a5;
                    }
                    m5444n1(270.0f, edgeEffectM5401a5, recordingCanvas);
                    edgeEffectM5401a5.finish();
                }
                if (C2172g0.m5399f(c2172g02.f7215g)) {
                    EdgeEffect edgeEffectM5404d = c2172g02.m5404d();
                    boolean z13 = m5444n1(90.0f, edgeEffectM5404d, recordingCanvas) || zM5444n1;
                    if (C2172g0.m5400g(c2172g02.f7215g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c2177i.m5409f() & 4294967295L));
                        EdgeEffect edgeEffectM5401a6 = c2172g02.f7219k;
                        if (edgeEffectM5401a6 == null) {
                            edgeEffectM5401a6 = c2172g02.m5401a(enumC2640p1);
                            c2172g02.f7219k = edgeEffectM5401a6;
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        float fM5421b3 = i11 >= 31 ? AbstractC2186l.m5421b(edgeEffectM5404d) : 0.0f;
                        if (i11 >= 31) {
                            AbstractC2186l.m5422c(edgeEffectM5401a6, fM5421b3, fIntBitsToFloat3);
                        } else {
                            edgeEffectM5401a6.onPull(fM5421b3, fIntBitsToFloat3);
                        }
                    }
                    zM5444n1 = z13;
                }
                if (C2172g0.m5400g(c2172g02.f7217i)) {
                    EdgeEffect edgeEffectM5401a7 = c2172g02.f7217i;
                    if (edgeEffectM5401a7 == null) {
                        edgeEffectM5401a7 = c2172g02.m5401a(enumC2640p12);
                        c2172g02.f7217i = edgeEffectM5401a7;
                    }
                    f10 = 0.0f;
                    m5444n1(0.0f, edgeEffectM5401a7, recordingCanvas);
                    edgeEffectM5401a7.finish();
                } else {
                    f10 = 0.0f;
                }
                if (C2172g0.m5399f(c2172g02.f7213e)) {
                    EdgeEffect edgeEffectM5402b = c2172g02.m5402b();
                    boolean z14 = m5444n1(180.0f, edgeEffectM5402b, recordingCanvas) || zM5444n1;
                    if (C2172g0.m5400g(c2172g02.f7213e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c2177i.m5409f() >> c11));
                        EdgeEffect edgeEffectM5401a8 = c2172g02.f7217i;
                        if (edgeEffectM5401a8 == null) {
                            edgeEffectM5401a8 = c2172g02.m5401a(enumC2640p12);
                            c2172g02.f7217i = edgeEffectM5401a8;
                        }
                        int i12 = Build.VERSION.SDK_INT;
                        float fM5421b4 = i12 >= 31 ? AbstractC2186l.m5421b(edgeEffectM5402b) : f10;
                        float f14 = 1 - fIntBitsToFloat4;
                        if (i12 >= 31) {
                            AbstractC2186l.m5422c(edgeEffectM5401a8, fM5421b4, f14);
                        } else {
                            edgeEffectM5401a8.onPull(fM5421b4, f14);
                        }
                    }
                    zM5444n1 = z14;
                }
                if (zM5444n1) {
                    c2177i.m5410g();
                }
                float f15 = z9 ? f10 : f3;
                if (!z10) {
                    f10 = f3;
                }
                EnumC4243m layoutDirection = c5610h0.getLayoutDirection();
                C0993b c0993b = new C0993b();
                c0993b.f3149a = recordingCanvas;
                long jMo4091a3 = c1565b2.mo4091a();
                InterfaceC4233c interfaceC4233cM822s = c1565b2.f5220h.m822s();
                EnumC4243m enumC4243mM824u = c1565b2.f5220h.m824u();
                InterfaceC1031u interfaceC1031uM819p = c1565b2.f5220h.m819p();
                long jM825v = c1565b2.f5220h.m825v();
                C0184c c0184c = c1565b2.f5220h;
                C1902b c1902b = (C1902b) c0184c.f470b;
                c0184c.m800R(c5610h0);
                c0184c.m801S(layoutDirection);
                c0184c.m798P(c0993b);
                c0184c.m803U(jMo4091a3);
                c0184c.f470b = null;
                c0993b.mo2487e();
                try {
                    ((C0119x) c1565b2.f5220h.f469a).m598c0(f15, f10);
                    try {
                        c5610h0.m10064e();
                        c0993b.mo2497p();
                        C0184c c0184c2 = c1565b2.f5220h;
                        c0184c2.m800R(interfaceC4233cM822s);
                        c0184c2.m801S(enumC4243mM824u);
                        c0184c2.m798P(interfaceC1031uM819p);
                        c0184c2.m803U(jM825v);
                        c0184c2.f470b = c1902b;
                        m5446p1().endRecording();
                        int iSave = canvasM2502a2.save();
                        canvasM2502a2.translate(f11, f12);
                        canvasM2502a2.drawRenderNode(m5446p1());
                        canvasM2502a2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((C0119x) c1565b2.f5220h.f469a).m598c0(-f15, -f10);
                    }
                } catch (Throwable th2) {
                    c0993b.mo2497p();
                    C0184c c0184c3 = c1565b2.f5220h;
                    c0184c3.m800R(interfaceC4233cM822s);
                    c0184c3.m801S(enumC4243mM824u);
                    c0184c3.m798P(interfaceC1031uM819p);
                    c0184c3.m803U(jM825v);
                    c0184c3.f470b = c1902b;
                    throw th2;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p1 */
    public RenderNode m5446p1() {
        RenderNode renderNode = (RenderNode) this.f7274z;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM5080f = AbstractC2052b.m5080f();
        this.f7274z = renderNodeM5080f;
        return renderNodeM5080f;
    }

    public C2193n0(C3906l0 c3906l0, C2177i c2177i, C2172g0 c2172g0) {
        this.f7272x = c2177i;
        this.f7273y = c2172g0;
        m10122k1(c3906l0);
    }
}
