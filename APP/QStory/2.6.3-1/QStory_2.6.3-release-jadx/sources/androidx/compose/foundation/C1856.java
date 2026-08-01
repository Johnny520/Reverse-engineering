package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.activity.AbstractC0875;
import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0960;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.InterfaceC1505;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.C2430;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.graphics.layer.C2351;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.node.InterfaceC2616;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import p069.AbstractC7390;
import p128.C8155;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1856 extends AbstractC2623 implements InterfaceC2616 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public Object f3323;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1872 f3324;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C1890 f3325;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f3326 = 1;

    public C1856(C2462 c2462, C1890 c1890, C1872 c1872, InterfaceC1505 interfaceC1505) {
        this.f3325 = c1890;
        this.f3324 = c1872;
        this.f3323 = interfaceC1505;
        m3924(c2462);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public static boolean m2483(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static boolean m2484(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public RenderNode m2485() {
        RenderNode renderNode = (RenderNode) this.f3323;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM602 = AbstractC0875.m602();
        this.f3323 = renderNodeM602;
        return renderNodeM602;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1688(InterfaceC2341 interfaceC2341) throws Throwable {
        boolean zM2483;
        long j;
        char c;
        boolean zM2484;
        InterfaceC2436 interfaceC2436;
        int i = this.f3326;
        C1890 c1890 = this.f3325;
        C1872 c1872 = this.f3324;
        switch (i) {
            case 0:
                InterfaceC1505 interfaceC1505 = (InterfaceC1505) this.f3323;
                C2593 c2593 = (C2593) interfaceC2341;
                C2342 c2342 = c2593.f5521;
                c1890.m2522(c2342.mo3265());
                if (C8155.m13072(c2342.mo3265())) {
                    c2593.m3871();
                    return;
                }
                c2593.m3871();
                ((AbstractC2182) c1890.f3449).getValue();
                Canvas canvasM3475 = AbstractC2429.m3475(c2342.f4629.m946());
                if (C1872.m2497(c1872.f3375)) {
                    zM2483 = m2483(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c2342.mo3265() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(c2593.mo1904(interfaceC1505.mo2023(c2593.getLayoutDirection())))) & 4294967295L), c1872.m2501(), canvasM3475);
                } else {
                    zM2483 = false;
                }
                if (C1872.m2497(c1872.f3377)) {
                    zM2483 = m2483(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c2593.mo1904(interfaceC1505.mo2021()))) & 4294967295L), c1872.m2499(), canvasM3475) || zM2483;
                }
                if (C1872.m2497(c1872.f3382)) {
                    zM2483 = m2483(90.0f, (((long) Float.floatToRawIntBits(c2593.mo1904(interfaceC1505.mo2022(c2593.getLayoutDirection())) + (-((float) AbstractC7390.m12617(Float.intBitsToFloat((int) (c2342.mo3265() >> 32))))))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), c1872.m2500(), canvasM3475) || zM2483;
                }
                if (C1872.m2497(c1872.f3376)) {
                    EdgeEffect edgeEffectM2502 = c1872.m2502();
                    zM2483 = m2483(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c2342.mo3265() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c2342.mo3265() & 4294967295L))) + c2593.mo1904(interfaceC1505.mo2024()))) & 4294967295L), edgeEffectM2502, canvasM3475) || zM2483;
                }
                if (zM2483) {
                    c1890.m2520();
                    return;
                }
                return;
            default:
                C2593 c25932 = (C2593) interfaceC2341;
                C2342 c23422 = c25932.f5521;
                c1890.m2522(c23422.mo3265());
                Canvas canvasM34752 = AbstractC2429.m3475(c23422.f4629.m946());
                ((AbstractC2182) c1890.f3449).getValue();
                if (C8155.m13072(c23422.mo3265())) {
                    c25932.m3871();
                    return;
                }
                if (!canvasM34752.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = c1872.f3377;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = c1872.f3376;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = c1872.f3375;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = c1872.f3382;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = c1872.f3381;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = c1872.f3384;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = c1872.f3385;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = c1872.f3383;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    c25932.m3871();
                    return;
                }
                float fMo1904 = c25932.mo1904(30.0f);
                boolean z = C1872.m2497(c1872.f3377) || C1872.m2498(c1872.f3381) || C1872.m2497(c1872.f3376) || C1872.m2498(c1872.f3384);
                boolean z2 = C1872.m2497(c1872.f3375) || C1872.m2498(c1872.f3385) || C1872.m2497(c1872.f3382) || C1872.m2498(c1872.f3383);
                if (z && z2) {
                    c = ' ';
                    j = 4294967295L;
                    m2485().setPosition(0, 0, canvasM34752.getWidth(), canvasM34752.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z) {
                        m2485().setPosition(0, 0, (AbstractC7390.m12617(fMo1904) * 2) + canvasM34752.getWidth(), canvasM34752.getHeight());
                    } else {
                        if (!z2) {
                            c25932.m3871();
                            return;
                        }
                        m2485().setPosition(0, 0, canvasM34752.getWidth(), (AbstractC7390.m12617(fMo1904) * 2) + canvasM34752.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = m2485().beginRecording();
                if (C1872.m2498(c1872.f3385)) {
                    EdgeEffect edgeEffectM2503 = c1872.f3385;
                    if (edgeEffectM2503 == null) {
                        edgeEffectM2503 = c1872.m2503(Orientation.Horizontal);
                        c1872.f3385 = edgeEffectM2503;
                    }
                    m2484(90.0f, edgeEffectM2503, recordingCanvasBeginRecording);
                    edgeEffectM2503.finish();
                }
                if (C1872.m2497(c1872.f3375)) {
                    EdgeEffect edgeEffectM2501 = c1872.m2501();
                    zM2484 = m2484(270.0f, edgeEffectM2501, recordingCanvasBeginRecording);
                    if (C1872.m2498(c1872.f3375)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1890.m2513() & j));
                        EdgeEffect edgeEffectM25032 = c1872.f3385;
                        if (edgeEffectM25032 == null) {
                            edgeEffectM25032 = c1872.m2503(Orientation.Horizontal);
                            c1872.f3385 = edgeEffectM25032;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fM2537 = i2 >= 31 ? AbstractC1907.m2537(edgeEffectM2501) : 0.0f;
                        float f = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            AbstractC1907.m2536(edgeEffectM25032, fM2537, f);
                        } else {
                            edgeEffectM25032.onPull(fM2537, f);
                        }
                    }
                } else {
                    zM2484 = false;
                }
                if (C1872.m2498(c1872.f3381)) {
                    EdgeEffect edgeEffectM25033 = c1872.f3381;
                    if (edgeEffectM25033 == null) {
                        edgeEffectM25033 = c1872.m2503(Orientation.Vertical);
                        c1872.f3381 = edgeEffectM25033;
                    }
                    m2484(180.0f, edgeEffectM25033, recordingCanvasBeginRecording);
                    edgeEffectM25033.finish();
                }
                if (C1872.m2497(c1872.f3377)) {
                    EdgeEffect edgeEffectM2499 = c1872.m2499();
                    zM2484 = m2484(0.0f, edgeEffectM2499, recordingCanvasBeginRecording) || zM2484;
                    if (C1872.m2498(c1872.f3377)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1890.m2513() >> c));
                        EdgeEffect edgeEffectM25034 = c1872.f3381;
                        if (edgeEffectM25034 == null) {
                            edgeEffectM25034 = c1872.m2503(Orientation.Vertical);
                            c1872.f3381 = edgeEffectM25034;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fM25372 = i3 >= 31 ? AbstractC1907.m2537(edgeEffectM2499) : 0.0f;
                        if (i3 >= 31) {
                            AbstractC1907.m2536(edgeEffectM25034, fM25372, fIntBitsToFloat2);
                        } else {
                            edgeEffectM25034.onPull(fM25372, fIntBitsToFloat2);
                        }
                    }
                }
                if (C1872.m2498(c1872.f3383)) {
                    EdgeEffect edgeEffectM25035 = c1872.f3383;
                    if (edgeEffectM25035 == null) {
                        edgeEffectM25035 = c1872.m2503(Orientation.Horizontal);
                        c1872.f3383 = edgeEffectM25035;
                    }
                    m2484(270.0f, edgeEffectM25035, recordingCanvasBeginRecording);
                    edgeEffectM25035.finish();
                }
                if (C1872.m2497(c1872.f3382)) {
                    EdgeEffect edgeEffectM2500 = c1872.m2500();
                    zM2484 = m2484(90.0f, edgeEffectM2500, recordingCanvasBeginRecording) || zM2484;
                    if (C1872.m2498(c1872.f3382)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c1890.m2513() & j));
                        EdgeEffect edgeEffectM25036 = c1872.f3383;
                        if (edgeEffectM25036 == null) {
                            edgeEffectM25036 = c1872.m2503(Orientation.Horizontal);
                            c1872.f3383 = edgeEffectM25036;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fM25373 = i4 >= 31 ? AbstractC1907.m2537(edgeEffectM2500) : 0.0f;
                        if (i4 >= 31) {
                            AbstractC1907.m2536(edgeEffectM25036, fM25373, fIntBitsToFloat3);
                        } else {
                            edgeEffectM25036.onPull(fM25373, fIntBitsToFloat3);
                        }
                    }
                }
                if (C1872.m2498(c1872.f3384)) {
                    EdgeEffect edgeEffectM25037 = c1872.f3384;
                    if (edgeEffectM25037 == null) {
                        edgeEffectM25037 = c1872.m2503(Orientation.Vertical);
                        c1872.f3384 = edgeEffectM25037;
                    }
                    m2484(0.0f, edgeEffectM25037, recordingCanvasBeginRecording);
                    edgeEffectM25037.finish();
                }
                if (C1872.m2497(c1872.f3376)) {
                    EdgeEffect edgeEffectM25022 = c1872.m2502();
                    boolean z3 = m2484(180.0f, edgeEffectM25022, recordingCanvasBeginRecording) || zM2484;
                    if (C1872.m2498(c1872.f3376)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c1890.m2513() >> c));
                        EdgeEffect edgeEffectM25038 = c1872.f3384;
                        if (edgeEffectM25038 == null) {
                            edgeEffectM25038 = c1872.m2503(Orientation.Vertical);
                            c1872.f3384 = edgeEffectM25038;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fM25374 = i5 >= 31 ? AbstractC1907.m2537(edgeEffectM25022) : 0.0f;
                        float f2 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            AbstractC1907.m2536(edgeEffectM25038, fM25374, f2);
                        } else {
                            edgeEffectM25038.onPull(fM25374, f2);
                        }
                    }
                    zM2484 = z3;
                }
                if (zM2484) {
                    c1890.m2520();
                }
                float f3 = z2 ? 0.0f : fMo1904;
                if (z) {
                    fMo1904 = 0.0f;
                }
                LayoutDirection layoutDirection = c25932.getLayoutDirection();
                C2430 c2430 = new C2430();
                c2430.f5035 = recordingCanvasBeginRecording;
                long jMo3265 = c23422.mo3265();
                InterfaceC8725 interfaceC8725M949 = c23422.f4629.m949();
                LayoutDirection layoutDirectionM930 = c23422.f4629.m930();
                InterfaceC2436 interfaceC2436M946 = c23422.f4629.m946();
                long jM928 = c23422.f4629.m928();
                C0955 c0955 = c23422.f4629;
                C2351 c2351 = (C2351) c0955.f665;
                c0955.m924(interfaceC2341);
                c0955.m920(layoutDirection);
                c0955.m925(c2430);
                c0955.m921(jMo3265);
                c0955.f665 = null;
                c2430.mo3237();
                try {
                    ((C0960) ((C2593) interfaceC2341).f5521.f4629.f664).m991(f3, fMo1904);
                    try {
                        c25932.m3871();
                        float f4 = -f3;
                        float f5 = -fMo1904;
                        ((C0960) ((C2593) interfaceC2341).f5521.f4629.f664).m991(f4, f5);
                        c2430.mo3249();
                        C0955 c09552 = c23422.f4629;
                        c09552.m924(interfaceC8725M949);
                        c09552.m920(layoutDirectionM930);
                        c09552.m925(interfaceC2436M946);
                        c09552.m921(jM928);
                        c09552.f665 = c2351;
                        m2485().endRecording();
                        int iSave = canvasM34752.save();
                        canvasM34752.translate(f4, f5);
                        canvasM34752.drawRenderNode(m2485());
                        canvasM34752.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        interfaceC2436 = interfaceC2436M946;
                        try {
                            ((C0960) ((C2593) interfaceC2341).f5521.f4629.f664).m991(-f3, -fMo1904);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            c2430.mo3249();
                            C0955 c09553 = c23422.f4629;
                            c09553.m924(interfaceC8725M949);
                            c09553.m920(layoutDirectionM930);
                            c09553.m925(interfaceC2436);
                            c09553.m921(jM928);
                            c09553.f665 = c2351;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC2436 = interfaceC2436M946;
                }
                break;
        }
    }

    public C1856(C2462 c2462, C1890 c1890, C1872 c1872) {
        this.f3325 = c1890;
        this.f3324 = c1872;
        m3924(c2462);
    }
}
