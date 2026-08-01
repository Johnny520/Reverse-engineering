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
import p053.AbstractC6561;
import p112.C7326;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1018 extends AbstractC1788 implements InterfaceC1781 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public Object f2978;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1034 f2979;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C1052 f2980;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f2981 = 1;

    public C1018(C1627 c1627, C1052 c1052, C1034 c1034, InterfaceC0664 interfaceC0664) {
        this.f2980 = c1052;
        this.f2979 = c1034;
        this.f2978 = interfaceC0664;
        m3364(c1627);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public static boolean m1923(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static boolean m1924(float f, EdgeEffect edgeEffect, Canvas canvas) {
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
    public RenderNode m1925() {
        RenderNode renderNode = (RenderNode) this.f2978;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM42 = AbstractC0028.m42();
        this.f2978 = renderNodeM42;
        return renderNodeM42;
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1128(InterfaceC1506 interfaceC1506) throws Throwable {
        boolean zM1923;
        long j;
        char c;
        boolean zM1924;
        InterfaceC1601 interfaceC1601;
        int i = this.f2981;
        C1052 c1052 = this.f2980;
        C1034 c1034 = this.f2979;
        switch (i) {
            case 0:
                InterfaceC0664 interfaceC0664 = (InterfaceC0664) this.f2978;
                C1758 c1758 = (C1758) interfaceC1506;
                C1507 c1507 = c1758.f5176;
                c1052.m1962(c1507.mo2705());
                if (C7326.m12513(c1507.mo2705())) {
                    c1758.m3311();
                    return;
                }
                c1758.m3311();
                ((AbstractC1347) c1052.f3104).getValue();
                Canvas canvasM2915 = AbstractC1594.m2915(c1507.f4284.m386());
                if (C1034.m1937(c1034.f3030)) {
                    zM1923 = m1923(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1507.mo2705() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(c1758.mo1344(interfaceC0664.mo1463(c1758.getLayoutDirection())))) & 4294967295L), c1034.m1941(), canvasM2915);
                } else {
                    zM1923 = false;
                }
                if (C1034.m1937(c1034.f3032)) {
                    zM1923 = m1923(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c1758.mo1344(interfaceC0664.mo1461()))) & 4294967295L), c1034.m1939(), canvasM2915) || zM1923;
                }
                if (C1034.m1937(c1034.f3037)) {
                    zM1923 = m1923(90.0f, (((long) Float.floatToRawIntBits(c1758.mo1344(interfaceC0664.mo1462(c1758.getLayoutDirection())) + (-((float) AbstractC6561.m12058(Float.intBitsToFloat((int) (c1507.mo2705() >> 32))))))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), c1034.m1940(), canvasM2915) || zM1923;
                }
                if (C1034.m1937(c1034.f3031)) {
                    EdgeEffect edgeEffectM1942 = c1034.m1942();
                    zM1923 = m1923(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1507.mo2705() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c1507.mo2705() & 4294967295L))) + c1758.mo1344(interfaceC0664.mo1464()))) & 4294967295L), edgeEffectM1942, canvasM2915) || zM1923;
                }
                if (zM1923) {
                    c1052.m1960();
                    return;
                }
                return;
            default:
                C1758 c17582 = (C1758) interfaceC1506;
                C1507 c15072 = c17582.f5176;
                c1052.m1962(c15072.mo2705());
                Canvas canvasM29152 = AbstractC1594.m2915(c15072.f4284.m386());
                ((AbstractC1347) c1052.f3104).getValue();
                if (C7326.m12513(c15072.mo2705())) {
                    c17582.m3311();
                    return;
                }
                if (!canvasM29152.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = c1034.f3032;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = c1034.f3031;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = c1034.f3030;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = c1034.f3037;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = c1034.f3036;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = c1034.f3039;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = c1034.f3040;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = c1034.f3038;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    c17582.m3311();
                    return;
                }
                float fMo1344 = c17582.mo1344(30.0f);
                boolean z = C1034.m1937(c1034.f3032) || C1034.m1938(c1034.f3036) || C1034.m1937(c1034.f3031) || C1034.m1938(c1034.f3039);
                boolean z2 = C1034.m1937(c1034.f3030) || C1034.m1938(c1034.f3040) || C1034.m1937(c1034.f3037) || C1034.m1938(c1034.f3038);
                if (z && z2) {
                    c = ' ';
                    j = 4294967295L;
                    m1925().setPosition(0, 0, canvasM29152.getWidth(), canvasM29152.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z) {
                        m1925().setPosition(0, 0, (AbstractC6561.m12058(fMo1344) * 2) + canvasM29152.getWidth(), canvasM29152.getHeight());
                    } else {
                        if (!z2) {
                            c17582.m3311();
                            return;
                        }
                        m1925().setPosition(0, 0, canvasM29152.getWidth(), (AbstractC6561.m12058(fMo1344) * 2) + canvasM29152.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = m1925().beginRecording();
                if (C1034.m1938(c1034.f3040)) {
                    EdgeEffect edgeEffectM1943 = c1034.f3040;
                    if (edgeEffectM1943 == null) {
                        edgeEffectM1943 = c1034.m1943(Orientation.Horizontal);
                        c1034.f3040 = edgeEffectM1943;
                    }
                    m1924(90.0f, edgeEffectM1943, recordingCanvasBeginRecording);
                    edgeEffectM1943.finish();
                }
                if (C1034.m1937(c1034.f3030)) {
                    EdgeEffect edgeEffectM1941 = c1034.m1941();
                    zM1924 = m1924(270.0f, edgeEffectM1941, recordingCanvasBeginRecording);
                    if (C1034.m1938(c1034.f3030)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1052.m1953() & j));
                        EdgeEffect edgeEffectM19432 = c1034.f3040;
                        if (edgeEffectM19432 == null) {
                            edgeEffectM19432 = c1034.m1943(Orientation.Horizontal);
                            c1034.f3040 = edgeEffectM19432;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fM1977 = i2 >= 31 ? AbstractC1069.m1977(edgeEffectM1941) : 0.0f;
                        float f = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            AbstractC1069.m1976(edgeEffectM19432, fM1977, f);
                        } else {
                            edgeEffectM19432.onPull(fM1977, f);
                        }
                    }
                } else {
                    zM1924 = false;
                }
                if (C1034.m1938(c1034.f3036)) {
                    EdgeEffect edgeEffectM19433 = c1034.f3036;
                    if (edgeEffectM19433 == null) {
                        edgeEffectM19433 = c1034.m1943(Orientation.Vertical);
                        c1034.f3036 = edgeEffectM19433;
                    }
                    m1924(180.0f, edgeEffectM19433, recordingCanvasBeginRecording);
                    edgeEffectM19433.finish();
                }
                if (C1034.m1937(c1034.f3032)) {
                    EdgeEffect edgeEffectM1939 = c1034.m1939();
                    zM1924 = m1924(0.0f, edgeEffectM1939, recordingCanvasBeginRecording) || zM1924;
                    if (C1034.m1938(c1034.f3032)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1052.m1953() >> c));
                        EdgeEffect edgeEffectM19434 = c1034.f3036;
                        if (edgeEffectM19434 == null) {
                            edgeEffectM19434 = c1034.m1943(Orientation.Vertical);
                            c1034.f3036 = edgeEffectM19434;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fM19772 = i3 >= 31 ? AbstractC1069.m1977(edgeEffectM1939) : 0.0f;
                        if (i3 >= 31) {
                            AbstractC1069.m1976(edgeEffectM19434, fM19772, fIntBitsToFloat2);
                        } else {
                            edgeEffectM19434.onPull(fM19772, fIntBitsToFloat2);
                        }
                    }
                }
                if (C1034.m1938(c1034.f3038)) {
                    EdgeEffect edgeEffectM19435 = c1034.f3038;
                    if (edgeEffectM19435 == null) {
                        edgeEffectM19435 = c1034.m1943(Orientation.Horizontal);
                        c1034.f3038 = edgeEffectM19435;
                    }
                    m1924(270.0f, edgeEffectM19435, recordingCanvasBeginRecording);
                    edgeEffectM19435.finish();
                }
                if (C1034.m1937(c1034.f3037)) {
                    EdgeEffect edgeEffectM1940 = c1034.m1940();
                    zM1924 = m1924(90.0f, edgeEffectM1940, recordingCanvasBeginRecording) || zM1924;
                    if (C1034.m1938(c1034.f3037)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c1052.m1953() & j));
                        EdgeEffect edgeEffectM19436 = c1034.f3038;
                        if (edgeEffectM19436 == null) {
                            edgeEffectM19436 = c1034.m1943(Orientation.Horizontal);
                            c1034.f3038 = edgeEffectM19436;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fM19773 = i4 >= 31 ? AbstractC1069.m1977(edgeEffectM1940) : 0.0f;
                        if (i4 >= 31) {
                            AbstractC1069.m1976(edgeEffectM19436, fM19773, fIntBitsToFloat3);
                        } else {
                            edgeEffectM19436.onPull(fM19773, fIntBitsToFloat3);
                        }
                    }
                }
                if (C1034.m1938(c1034.f3039)) {
                    EdgeEffect edgeEffectM19437 = c1034.f3039;
                    if (edgeEffectM19437 == null) {
                        edgeEffectM19437 = c1034.m1943(Orientation.Vertical);
                        c1034.f3039 = edgeEffectM19437;
                    }
                    m1924(0.0f, edgeEffectM19437, recordingCanvasBeginRecording);
                    edgeEffectM19437.finish();
                }
                if (C1034.m1937(c1034.f3031)) {
                    EdgeEffect edgeEffectM19422 = c1034.m1942();
                    boolean z3 = m1924(180.0f, edgeEffectM19422, recordingCanvasBeginRecording) || zM1924;
                    if (C1034.m1938(c1034.f3031)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c1052.m1953() >> c));
                        EdgeEffect edgeEffectM19438 = c1034.f3039;
                        if (edgeEffectM19438 == null) {
                            edgeEffectM19438 = c1034.m1943(Orientation.Vertical);
                            c1034.f3039 = edgeEffectM19438;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fM19774 = i5 >= 31 ? AbstractC1069.m1977(edgeEffectM19422) : 0.0f;
                        float f2 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            AbstractC1069.m1976(edgeEffectM19438, fM19774, f2);
                        } else {
                            edgeEffectM19438.onPull(fM19774, f2);
                        }
                    }
                    zM1924 = z3;
                }
                if (zM1924) {
                    c1052.m1960();
                }
                float f3 = z2 ? 0.0f : fMo1344;
                if (z) {
                    fMo1344 = 0.0f;
                }
                LayoutDirection layoutDirection = c17582.getLayoutDirection();
                C1595 c1595 = new C1595();
                c1595.f4690 = recordingCanvasBeginRecording;
                long jMo2705 = c15072.mo2705();
                InterfaceC7896 interfaceC7896M389 = c15072.f4284.m389();
                LayoutDirection layoutDirectionM370 = c15072.f4284.m370();
                InterfaceC1601 interfaceC1601M386 = c15072.f4284.m386();
                long jM368 = c15072.f4284.m368();
                C0108 c0108 = c15072.f4284;
                C1516 c1516 = (C1516) c0108.f320;
                c0108.m364(interfaceC1506);
                c0108.m360(layoutDirection);
                c0108.m365(c1595);
                c0108.m361(jMo2705);
                c0108.f320 = null;
                c1595.mo2677();
                try {
                    ((C0113) ((C1758) interfaceC1506).f5176.f4284.f319).m431(f3, fMo1344);
                    try {
                        c17582.m3311();
                        float f4 = -f3;
                        float f5 = -fMo1344;
                        ((C0113) ((C1758) interfaceC1506).f5176.f4284.f319).m431(f4, f5);
                        c1595.mo2689();
                        C0108 c01082 = c15072.f4284;
                        c01082.m364(interfaceC7896M389);
                        c01082.m360(layoutDirectionM370);
                        c01082.m365(interfaceC1601M386);
                        c01082.m361(jM368);
                        c01082.f320 = c1516;
                        m1925().endRecording();
                        int iSave = canvasM29152.save();
                        canvasM29152.translate(f4, f5);
                        canvasM29152.drawRenderNode(m1925());
                        canvasM29152.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        interfaceC1601 = interfaceC1601M386;
                        try {
                            ((C0113) ((C1758) interfaceC1506).f5176.f4284.f319).m431(-f3, -fMo1344);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            c1595.mo2689();
                            C0108 c01083 = c15072.f4284;
                            c01083.m364(interfaceC7896M389);
                            c01083.m360(layoutDirectionM370);
                            c01083.m365(interfaceC1601);
                            c01083.m361(jM368);
                            c01083.f320 = c1516;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC1601 = interfaceC1601M386;
                }
                break;
        }
    }

    public C1018(C1627 c1627, C1052 c1052, C1034 c1034) {
        this.f2980 = c1052;
        this.f2979 = c1034;
        m3364(c1627);
    }
}
