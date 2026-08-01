package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.activity.AbstractC0028;
import androidx.appcompat.app.C0108;
import androidx.appcompat.app.C0113;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.InterfaceC0664;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.C1595;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.graphics.layer.C1516;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.node.InterfaceC1781;
import androidx.compose.ui.unit.LayoutDirection;
import p053.AbstractC6560;
import p112.C7325;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1018 extends AbstractC1788 implements InterfaceC1781 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public Object f2977;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1034 f2978;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C1052 f2979;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f2980 = 1;

    public C1018(C1627 c1627, C1052 c1052, C1034 c1034, InterfaceC0664 interfaceC0664) {
        this.f2979 = c1052;
        this.f2978 = c1034;
        this.f2977 = interfaceC0664;
        m3354(c1627);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public static boolean m1913(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static boolean m1914(float f, EdgeEffect edgeEffect, Canvas canvas) {
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
    public RenderNode m1915() {
        RenderNode renderNode = (RenderNode) this.f2977;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM42 = AbstractC0028.m42();
        this.f2977 = renderNodeM42;
        return renderNodeM42;
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1127(InterfaceC1506 interfaceC1506) throws Throwable {
        boolean zM1913;
        long j;
        char c;
        boolean zM1914;
        InterfaceC1601 interfaceC1601;
        int i = this.f2980;
        C1052 c1052 = this.f2979;
        C1034 c1034 = this.f2978;
        switch (i) {
            case 0:
                InterfaceC0664 interfaceC0664 = (InterfaceC0664) this.f2977;
                C1758 c1758 = (C1758) interfaceC1506;
                C1507 c1507 = c1758.f5175;
                c1052.m1952(c1507.mo2695());
                if (C7325.m12486(c1507.mo2695())) {
                    c1758.m3301();
                    return;
                }
                c1758.m3301();
                ((AbstractC1347) c1052.f3103).getValue();
                Canvas canvasM2905 = AbstractC1594.m2905(c1507.f4283.m385());
                if (C1034.m1927(c1034.f3029)) {
                    zM1913 = m1913(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1507.mo2695() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(c1758.mo1334(interfaceC0664.mo1453(c1758.getLayoutDirection())))) & 4294967295L), c1034.m1931(), canvasM2905);
                } else {
                    zM1913 = false;
                }
                if (C1034.m1927(c1034.f3031)) {
                    zM1913 = m1913(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c1758.mo1334(interfaceC0664.mo1451()))) & 4294967295L), c1034.m1929(), canvasM2905) || zM1913;
                }
                if (C1034.m1927(c1034.f3036)) {
                    zM1913 = m1913(90.0f, (((long) Float.floatToRawIntBits(c1758.mo1334(interfaceC0664.mo1452(c1758.getLayoutDirection())) + (-((float) AbstractC6560.m12006(Float.intBitsToFloat((int) (c1507.mo2695() >> 32))))))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), c1034.m1930(), canvasM2905) || zM1913;
                }
                if (C1034.m1927(c1034.f3030)) {
                    EdgeEffect edgeEffectM1932 = c1034.m1932();
                    zM1913 = m1913(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1507.mo2695() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c1507.mo2695() & 4294967295L))) + c1758.mo1334(interfaceC0664.mo1454()))) & 4294967295L), edgeEffectM1932, canvasM2905) || zM1913;
                }
                if (zM1913) {
                    c1052.m1950();
                    return;
                }
                return;
            default:
                C1758 c17582 = (C1758) interfaceC1506;
                C1507 c15072 = c17582.f5175;
                c1052.m1952(c15072.mo2695());
                Canvas canvasM29052 = AbstractC1594.m2905(c15072.f4283.m385());
                ((AbstractC1347) c1052.f3103).getValue();
                if (C7325.m12486(c15072.mo2695())) {
                    c17582.m3301();
                    return;
                }
                if (!canvasM29052.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = c1034.f3031;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = c1034.f3030;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = c1034.f3029;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = c1034.f3036;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = c1034.f3035;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = c1034.f3038;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = c1034.f3039;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = c1034.f3037;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    c17582.m3301();
                    return;
                }
                float fMo1334 = c17582.mo1334(30.0f);
                boolean z = C1034.m1927(c1034.f3031) || C1034.m1928(c1034.f3035) || C1034.m1927(c1034.f3030) || C1034.m1928(c1034.f3038);
                boolean z2 = C1034.m1927(c1034.f3029) || C1034.m1928(c1034.f3039) || C1034.m1927(c1034.f3036) || C1034.m1928(c1034.f3037);
                if (z && z2) {
                    c = ' ';
                    j = 4294967295L;
                    m1915().setPosition(0, 0, canvasM29052.getWidth(), canvasM29052.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z) {
                        m1915().setPosition(0, 0, (AbstractC6560.m12006(fMo1334) * 2) + canvasM29052.getWidth(), canvasM29052.getHeight());
                    } else {
                        if (!z2) {
                            c17582.m3301();
                            return;
                        }
                        m1915().setPosition(0, 0, canvasM29052.getWidth(), (AbstractC6560.m12006(fMo1334) * 2) + canvasM29052.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = m1915().beginRecording();
                if (C1034.m1928(c1034.f3039)) {
                    EdgeEffect edgeEffectM1933 = c1034.f3039;
                    if (edgeEffectM1933 == null) {
                        edgeEffectM1933 = c1034.m1933(Orientation.Horizontal);
                        c1034.f3039 = edgeEffectM1933;
                    }
                    m1914(90.0f, edgeEffectM1933, recordingCanvasBeginRecording);
                    edgeEffectM1933.finish();
                }
                if (C1034.m1927(c1034.f3029)) {
                    EdgeEffect edgeEffectM1931 = c1034.m1931();
                    zM1914 = m1914(270.0f, edgeEffectM1931, recordingCanvasBeginRecording);
                    if (C1034.m1928(c1034.f3029)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1052.m1943() & j));
                        EdgeEffect edgeEffectM19332 = c1034.f3039;
                        if (edgeEffectM19332 == null) {
                            edgeEffectM19332 = c1034.m1933(Orientation.Horizontal);
                            c1034.f3039 = edgeEffectM19332;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fM1967 = i2 >= 31 ? AbstractC1069.m1967(edgeEffectM1931) : 0.0f;
                        float f = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            AbstractC1069.m1966(edgeEffectM19332, fM1967, f);
                        } else {
                            edgeEffectM19332.onPull(fM1967, f);
                        }
                    }
                } else {
                    zM1914 = false;
                }
                if (C1034.m1928(c1034.f3035)) {
                    EdgeEffect edgeEffectM19333 = c1034.f3035;
                    if (edgeEffectM19333 == null) {
                        edgeEffectM19333 = c1034.m1933(Orientation.Vertical);
                        c1034.f3035 = edgeEffectM19333;
                    }
                    m1914(180.0f, edgeEffectM19333, recordingCanvasBeginRecording);
                    edgeEffectM19333.finish();
                }
                if (C1034.m1927(c1034.f3031)) {
                    EdgeEffect edgeEffectM1929 = c1034.m1929();
                    zM1914 = m1914(0.0f, edgeEffectM1929, recordingCanvasBeginRecording) || zM1914;
                    if (C1034.m1928(c1034.f3031)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1052.m1943() >> c));
                        EdgeEffect edgeEffectM19334 = c1034.f3035;
                        if (edgeEffectM19334 == null) {
                            edgeEffectM19334 = c1034.m1933(Orientation.Vertical);
                            c1034.f3035 = edgeEffectM19334;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fM19672 = i3 >= 31 ? AbstractC1069.m1967(edgeEffectM1929) : 0.0f;
                        if (i3 >= 31) {
                            AbstractC1069.m1966(edgeEffectM19334, fM19672, fIntBitsToFloat2);
                        } else {
                            edgeEffectM19334.onPull(fM19672, fIntBitsToFloat2);
                        }
                    }
                }
                if (C1034.m1928(c1034.f3037)) {
                    EdgeEffect edgeEffectM19335 = c1034.f3037;
                    if (edgeEffectM19335 == null) {
                        edgeEffectM19335 = c1034.m1933(Orientation.Horizontal);
                        c1034.f3037 = edgeEffectM19335;
                    }
                    m1914(270.0f, edgeEffectM19335, recordingCanvasBeginRecording);
                    edgeEffectM19335.finish();
                }
                if (C1034.m1927(c1034.f3036)) {
                    EdgeEffect edgeEffectM1930 = c1034.m1930();
                    zM1914 = m1914(90.0f, edgeEffectM1930, recordingCanvasBeginRecording) || zM1914;
                    if (C1034.m1928(c1034.f3036)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c1052.m1943() & j));
                        EdgeEffect edgeEffectM19336 = c1034.f3037;
                        if (edgeEffectM19336 == null) {
                            edgeEffectM19336 = c1034.m1933(Orientation.Horizontal);
                            c1034.f3037 = edgeEffectM19336;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fM19673 = i4 >= 31 ? AbstractC1069.m1967(edgeEffectM1930) : 0.0f;
                        if (i4 >= 31) {
                            AbstractC1069.m1966(edgeEffectM19336, fM19673, fIntBitsToFloat3);
                        } else {
                            edgeEffectM19336.onPull(fM19673, fIntBitsToFloat3);
                        }
                    }
                }
                if (C1034.m1928(c1034.f3038)) {
                    EdgeEffect edgeEffectM19337 = c1034.f3038;
                    if (edgeEffectM19337 == null) {
                        edgeEffectM19337 = c1034.m1933(Orientation.Vertical);
                        c1034.f3038 = edgeEffectM19337;
                    }
                    m1914(0.0f, edgeEffectM19337, recordingCanvasBeginRecording);
                    edgeEffectM19337.finish();
                }
                if (C1034.m1927(c1034.f3030)) {
                    EdgeEffect edgeEffectM19322 = c1034.m1932();
                    boolean z3 = m1914(180.0f, edgeEffectM19322, recordingCanvasBeginRecording) || zM1914;
                    if (C1034.m1928(c1034.f3030)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c1052.m1943() >> c));
                        EdgeEffect edgeEffectM19338 = c1034.f3038;
                        if (edgeEffectM19338 == null) {
                            edgeEffectM19338 = c1034.m1933(Orientation.Vertical);
                            c1034.f3038 = edgeEffectM19338;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fM19674 = i5 >= 31 ? AbstractC1069.m1967(edgeEffectM19322) : 0.0f;
                        float f2 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            AbstractC1069.m1966(edgeEffectM19338, fM19674, f2);
                        } else {
                            edgeEffectM19338.onPull(fM19674, f2);
                        }
                    }
                    zM1914 = z3;
                }
                if (zM1914) {
                    c1052.m1950();
                }
                float f3 = z2 ? 0.0f : fMo1334;
                if (z) {
                    fMo1334 = 0.0f;
                }
                LayoutDirection layoutDirection = c17582.getLayoutDirection();
                C1595 c1595 = new C1595();
                c1595.f4689 = recordingCanvasBeginRecording;
                long jMo2695 = c15072.mo2695();
                InterfaceC7895 interfaceC7895M388 = c15072.f4283.m388();
                LayoutDirection layoutDirectionM369 = c15072.f4283.m369();
                InterfaceC1601 interfaceC1601M385 = c15072.f4283.m385();
                long jM367 = c15072.f4283.m367();
                C0108 c0108 = c15072.f4283;
                C1516 c1516 = (C1516) c0108.f320;
                c0108.m363(interfaceC1506);
                c0108.m359(layoutDirection);
                c0108.m364(c1595);
                c0108.m360(jMo2695);
                c0108.f320 = null;
                c1595.mo2667();
                try {
                    ((C0113) ((C1758) interfaceC1506).f5175.f4283.f319).m430(f3, fMo1334);
                    try {
                        c17582.m3301();
                        float f4 = -f3;
                        float f5 = -fMo1334;
                        ((C0113) ((C1758) interfaceC1506).f5175.f4283.f319).m430(f4, f5);
                        c1595.mo2679();
                        C0108 c01082 = c15072.f4283;
                        c01082.m363(interfaceC7895M388);
                        c01082.m359(layoutDirectionM369);
                        c01082.m364(interfaceC1601M385);
                        c01082.m360(jM367);
                        c01082.f320 = c1516;
                        m1915().endRecording();
                        int iSave = canvasM29052.save();
                        canvasM29052.translate(f4, f5);
                        canvasM29052.drawRenderNode(m1915());
                        canvasM29052.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        interfaceC1601 = interfaceC1601M385;
                        try {
                            ((C0113) ((C1758) interfaceC1506).f5175.f4283.f319).m430(-f3, -fMo1334);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            c1595.mo2679();
                            C0108 c01083 = c15072.f4283;
                            c01083.m363(interfaceC7895M388);
                            c01083.m359(layoutDirectionM369);
                            c01083.m364(interfaceC1601);
                            c01083.m360(jM367);
                            c01083.f320 = c1516;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC1601 = interfaceC1601M385;
                }
                break;
        }
    }

    public C1018(C1627 c1627, C1052 c1052, C1034 c1034) {
        this.f2979 = c1052;
        this.f2978 = c1034;
        m3354(c1627);
    }
}
