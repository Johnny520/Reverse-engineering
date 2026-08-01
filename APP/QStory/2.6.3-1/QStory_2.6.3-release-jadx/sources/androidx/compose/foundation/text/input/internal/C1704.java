package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.activity.AbstractC0887;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2422;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import androidx.compose.p001ui.text.style.ResolvedTextDirection;
import androidx.window.area.AbstractC3400;
import p068.InterfaceC7387;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1704 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f2770;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f2771;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f2772;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1701 f2774;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f2775;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C8157 f2776;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C8157 f2777;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f2781;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f2782;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C2867 f2783;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC2856 f2784;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f2785;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2847 f2786;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f2773 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final CursorAnchorInfo.Builder f2779 = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float[] f2780 = C2422.m3467();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Matrix f2778 = new Matrix();

    public C1704(InterfaceC7387 interfaceC7387, InterfaceC1701 interfaceC1701) {
        this.f2775 = interfaceC7387;
        this.f2774 = interfaceC1701;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2253() {
        CursorAnchorInfo.Builder builder;
        boolean z;
        boolean z2;
        C1705 c1705 = (C1705) this.f2774;
        if (!c1705.m2254().isActive(c1705.f2788) || this.f2786 == null || this.f2784 == null || this.f2783 == null || this.f2777 == null || this.f2776 == null) {
            return;
        }
        float[] fArr = this.f2780;
        C2422.m3464(fArr);
        this.f2775.invoke(new C2422(fArr));
        C8157 c8157 = this.f2776;
        c8157.getClass();
        float f = -c8157.f19885;
        C8157 c81572 = this.f2776;
        c81572.getClass();
        C2422.m3462(fArr, f, -c81572.f19884);
        Matrix matrix = this.f2778;
        AbstractC2416.m3445(matrix, fArr);
        C2847 c2847 = this.f2786;
        c2847.getClass();
        long j = c2847.f6291;
        InterfaceC2856 interfaceC2856 = this.f2784;
        interfaceC2856.getClass();
        C2867 c2867 = this.f2783;
        c2867.getClass();
        C2896 c2896 = c2867.f6335;
        C8157 c81573 = this.f2777;
        c81573.getClass();
        float f2 = c81573.f19882;
        float f3 = c81573.f19884;
        C8157 c81574 = this.f2776;
        c81574.getClass();
        boolean z3 = this.f2770;
        boolean z4 = this.f2782;
        boolean z5 = this.f2781;
        boolean z6 = this.f2785;
        CursorAnchorInfo.Builder builder2 = this.f2779;
        builder2.reset();
        builder2.setMatrix(matrix);
        C2869 c2869 = c2847.f6290;
        int iM4317 = C2869.m4317(j);
        builder2.setSelectionRange(iM4317, C2869.m4310(j));
        if (!z3 || iM4317 < 0) {
            builder = builder2;
            z = z4;
            z2 = z5;
        } else {
            interfaceC2856.mo2442(iM4317);
            C8157 c8157M4303 = c2867.m4303(iM4317);
            z = z4;
            z2 = z5;
            float fM5631 = AbstractC3400.m5631(c8157M4303.f19885, 0.0f, (int) (c2867.f6334 >> 32));
            boolean zM2227 = AbstractC1695.m2227(c81573, fM5631, c8157M4303.f19884);
            boolean zM22272 = AbstractC1695.m2227(c81573, fM5631, c8157M4303.f19882);
            boolean z7 = c2867.m4305(iM4317) == ResolvedTextDirection.Rtl;
            int i = (zM2227 || zM22272) ? 1 : 0;
            if (!zM2227 || !zM22272) {
                i |= 2;
            }
            if (z7) {
                i |= 4;
            }
            int i2 = i;
            float f4 = c8157M4303.f19884;
            float f5 = c8157M4303.f19882;
            builder2.setInsertionMarkerLocation(fM5631, f4, f5, f5, i2);
            builder = builder2;
        }
        if (z) {
            int iM43172 = c2869 != null ? C2869.m4317(c2869.f6349) : -1;
            int iM4310 = c2869 != null ? C2869.m4310(c2869.f6349) : -1;
            if (iM43172 >= 0 && iM43172 < iM4310) {
                builder.setComposingText(iM43172, c2847.f6292.f6474.subSequence(iM43172, iM4310));
                interfaceC2856.mo2442(iM43172);
                interfaceC2856.mo2442(iM4310);
                float[] fArr2 = new float[(iM4310 - iM43172) * 4];
                c2896.m4351(AbstractC2882.m4330(iM43172, iM4310), fArr2);
                int i3 = iM43172;
                while (i3 < iM4310) {
                    interfaceC2856.mo2442(i3);
                    int i4 = (i3 - iM43172) * 4;
                    float f6 = fArr2[i4];
                    float f7 = fArr2[i4 + 1];
                    float[] fArr3 = fArr2;
                    float f8 = fArr3[i4 + 2];
                    float f9 = fArr3[i4 + 3];
                    CursorAnchorInfo.Builder builder3 = builder;
                    int i5 = (c81573.f19885 < f8 ? 1 : 0) & (f6 < c81573.f19883 ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                    if (!AbstractC1695.m2227(c81573, f6, f7) || !AbstractC1695.m2227(c81573, f8, f9)) {
                        i5 |= 2;
                    }
                    int i6 = i3;
                    if (c2867.m4305(i3) == ResolvedTextDirection.Rtl) {
                        i5 |= 4;
                    }
                    builder3.addCharacterBounds(i6, f6, f7, f8, f9, i5);
                    builder = builder3;
                    i3 = i6 + 1;
                    fArr2 = fArr3;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z2) {
            builder.setEditorBoundsInfo(AbstractC0887.m658().setEditorBounds(AbstractC2416.m3435(c81574)).setHandwritingBounds(AbstractC2416.m3435(c81574)).build());
        }
        if (i7 >= 34 && z6 && !c81573.m13075()) {
            int i8 = c2896.f6445 - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iM5650 = AbstractC3400.m5650(c2896.m4347(f3), 0, i8);
            int iM56502 = AbstractC3400.m5650(c2896.m4347(f2), 0, i8);
            if (iM5650 <= iM56502) {
                while (true) {
                    builder.addVisibleLineBounds(c2867.m4301(iM5650), c2896.m4346(iM5650), c2867.m4300(iM5650), c2896.m4350(iM5650));
                    if (iM5650 == iM56502) {
                        break;
                    } else {
                        iM5650++;
                    }
                }
            }
        }
        c1705.m2254().updateCursorAnchorInfo(c1705.f2788, builder.build());
        this.f2771 = false;
    }
}
