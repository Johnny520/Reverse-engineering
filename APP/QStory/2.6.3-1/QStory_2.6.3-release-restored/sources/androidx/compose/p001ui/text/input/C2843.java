package androidx.compose.p001ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.AbstractC0887;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2422;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.style.ResolvedTextDirection;
import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.AbstractC3738;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import p068.InterfaceC7387;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2843 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f6260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f6261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f6262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2860 f6264;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f6265;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C8157 f6266;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C8157 f6270;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f6272;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f6273;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C2867 f6274;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC2856 f6275;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f6276;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2847 f6277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f6263 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public InterfaceC7387 f6267 = new InterfaceC7387() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        @Override // p068.InterfaceC7387
        public /* synthetic */ Object invoke(Object obj) {
            m4266invoke58bKbWc(((C2422) obj).f5019);
            return C6008.f15084;
        }

        /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m4266invoke58bKbWc(float[] fArr) {
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final CursorAnchorInfo.Builder f6271 = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float[] f6268 = C2422.m3467();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Matrix f6269 = new Matrix();

    public C2843(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, C2860 c2860) {
        this.f6265 = viewTreeObserverOnGlobalLayoutListenerC2719;
        this.f6264 = c2860;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4271() {
        View view;
        CursorAnchorInfo.Builder builder;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        C2860 c2860 = this.f6264;
        InterfaceC6016 interfaceC6016 = c2860.f6321;
        InputMethodManager inputMethodManager = (InputMethodManager) interfaceC6016.getValue();
        View view2 = c2860.f6322;
        if (inputMethodManager.isActive(view2)) {
            InterfaceC7387 interfaceC7387 = this.f6267;
            float[] fArr = this.f6268;
            interfaceC7387.invoke(new C2422(fArr));
            this.f6265.m4099(fArr);
            Matrix matrix = this.f6269;
            AbstractC2416.m3445(matrix, fArr);
            C2847 c2847 = this.f6277;
            c2847.getClass();
            long j = c2847.f6291;
            InterfaceC2856 interfaceC2856 = this.f6275;
            interfaceC2856.getClass();
            C2867 c2867 = this.f6274;
            c2867.getClass();
            C2896 c2896 = c2867.f6335;
            C8157 c8157 = this.f6266;
            c8157.getClass();
            float f5 = c8157.f19882;
            float f6 = c8157.f19884;
            C8157 c81572 = this.f6270;
            c81572.getClass();
            boolean z = this.f6260;
            boolean z2 = this.f6273;
            boolean z3 = this.f6272;
            boolean z4 = this.f6276;
            CursorAnchorInfo.Builder builder2 = this.f6271;
            builder2.reset();
            builder2.setMatrix(matrix);
            C2869 c2869 = c2847.f6290;
            int iM4317 = C2869.m4317(j);
            builder2.setSelectionRange(iM4317, C2869.m4310(j));
            if (!z || iM4317 < 0) {
                view = view2;
                builder = builder2;
            } else {
                interfaceC2856.mo2442(iM4317);
                C8157 c8157M4303 = c2867.m4303(iM4317);
                view = view2;
                float fM5631 = AbstractC3400.m5631(c8157M4303.f19885, 0.0f, (int) (c2867.f6334 >> 32));
                boolean zM6889 = AbstractC3738.m6889(c8157, fM5631, c8157M4303.f19884);
                boolean zM68892 = AbstractC3738.m6889(c8157, fM5631, c8157M4303.f19882);
                boolean z5 = c2867.m4305(iM4317) == ResolvedTextDirection.Rtl;
                int i3 = (zM6889 || zM68892) ? 1 : 0;
                if (!zM6889 || !zM68892) {
                    i3 |= 2;
                }
                if (z5) {
                    i3 |= 4;
                }
                float f7 = c8157M4303.f19884;
                float f8 = c8157M4303.f19882;
                builder2.setInsertionMarkerLocation(fM5631, f7, f8, f8, i3);
                builder = builder2;
            }
            if (z2) {
                int iM43172 = c2869 != null ? C2869.m4317(c2869.f6349) : -1;
                int iM4310 = c2869 != null ? C2869.m4310(c2869.f6349) : -1;
                if (iM43172 >= 0 && iM43172 < iM4310) {
                    builder.setComposingText(iM43172, c2847.f6292.f6474.subSequence(iM43172, iM4310));
                    interfaceC2856.mo2442(iM43172);
                    interfaceC2856.mo2442(iM4310);
                    float[] fArr2 = new float[(iM4310 - iM43172) * 4];
                    c2896.m4351(AbstractC2882.m4330(iM43172, iM4310), fArr2);
                    int i4 = iM43172;
                    while (i4 < iM4310) {
                        interfaceC2856.mo2442(i4);
                        int i5 = (i4 - iM43172) * 4;
                        float f9 = fArr2[i5];
                        float f10 = fArr2[i5 + 1];
                        float f11 = fArr2[i5 + 2];
                        float f12 = fArr2[i5 + 3];
                        CursorAnchorInfo.Builder builder3 = builder;
                        int i6 = (c8157.f19885 < f11 ? 1 : 0) & (f9 < c8157.f19883 ? 1 : 0) & (f6 < f12 ? 1 : 0) & (f10 < f5 ? 1 : 0);
                        if (!AbstractC3738.m6889(c8157, f9, f10) || !AbstractC3738.m6889(c8157, f11, f12)) {
                            i6 |= 2;
                        }
                        int i7 = i6;
                        int i8 = iM4310;
                        if (c2867.m4305(i4) == ResolvedTextDirection.Rtl) {
                            i = i7 | 4;
                            i2 = i4;
                            f = f12;
                            f2 = f9;
                            f3 = f10;
                            f4 = f11;
                        } else {
                            i = i7;
                            f = f12;
                            f2 = f9;
                            f3 = f10;
                            f4 = f11;
                            i2 = i4;
                        }
                        builder3.addCharacterBounds(i2, f2, f3, f4, f, i);
                        builder = builder3;
                        i4 = i2 + 1;
                        iM4310 = i8;
                    }
                }
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33 && z3) {
                builder.setEditorBoundsInfo(AbstractC0887.m658().setEditorBounds(AbstractC2416.m3435(c81572)).setHandwritingBounds(AbstractC2416.m3435(c81572)).build());
            }
            if (i9 >= 34 && z4 && !c8157.m13075()) {
                int i10 = c2896.f6445 - 1;
                if (i10 < 0) {
                    i10 = 0;
                }
                int iM5650 = AbstractC3400.m5650(c2896.m4347(f6), 0, i10);
                int iM56502 = AbstractC3400.m5650(c2896.m4347(f5), 0, i10);
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
            ((InputMethodManager) interfaceC6016.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f6261 = false;
        }
    }
}
