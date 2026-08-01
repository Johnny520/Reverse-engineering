package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.AbstractC0040;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1587;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2062;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.window.area.AbstractC2567;
import com.alibaba.fastjson2.AbstractC2905;
import kotlin.C5176;
import kotlin.InterfaceC5184;
import p052.InterfaceC6558;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2009 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f5915;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5916;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2026 f5919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5920;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C7328 f5921;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C7328 f5925;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f5927;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f5928;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C2033 f5929;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC2022 f5930;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f5931;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2013 f5932;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f5918 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public InterfaceC6558 f5922 = new InterfaceC6558() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        @Override // p052.InterfaceC6558
        public /* synthetic */ Object invoke(Object obj) {
            m3706invoke58bKbWc(((C1587) obj).f4674);
            return C5176.f14739;
        }

        /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m3706invoke58bKbWc(float[] fArr) {
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final CursorAnchorInfo.Builder f5926 = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float[] f5923 = C1587.m2907();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Matrix f5924 = new Matrix();

    public C2009(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, C2026 c2026) {
        this.f5920 = viewTreeObserverOnGlobalLayoutListenerC1884;
        this.f5919 = c2026;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3711() {
        View view;
        CursorAnchorInfo.Builder builder;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        C2026 c2026 = this.f5919;
        InterfaceC5184 interfaceC5184 = c2026.f5976;
        InputMethodManager inputMethodManager = (InputMethodManager) interfaceC5184.getValue();
        View view2 = c2026.f5977;
        if (inputMethodManager.isActive(view2)) {
            InterfaceC6558 interfaceC6558 = this.f5922;
            float[] fArr = this.f5923;
            interfaceC6558.invoke(new C1587(fArr));
            this.f5920.m3539(fArr);
            Matrix matrix = this.f5924;
            AbstractC1581.m2885(matrix, fArr);
            C2013 c2013 = this.f5932;
            c2013.getClass();
            long j = c2013.f5946;
            InterfaceC2022 interfaceC2022 = this.f5930;
            interfaceC2022.getClass();
            C2033 c2033 = this.f5929;
            c2033.getClass();
            C2062 c2062 = c2033.f5990;
            C7328 c7328 = this.f5921;
            c7328.getClass();
            float f5 = c7328.f19537;
            float f6 = c7328.f19539;
            C7328 c73282 = this.f5925;
            c73282.getClass();
            boolean z = this.f5915;
            boolean z2 = this.f5928;
            boolean z3 = this.f5927;
            boolean z4 = this.f5931;
            CursorAnchorInfo.Builder builder2 = this.f5926;
            builder2.reset();
            builder2.setMatrix(matrix);
            C2035 c2035 = c2013.f5945;
            int iM3757 = C2035.m3757(j);
            builder2.setSelectionRange(iM3757, C2035.m3750(j));
            if (!z || iM3757 < 0) {
                view = view2;
                builder = builder2;
            } else {
                interfaceC2022.mo1882(iM3757);
                C7328 c7328M3743 = c2033.m3743(iM3757);
                view = view2;
                float fM5071 = AbstractC2567.m5071(c7328M3743.f19540, 0.0f, (int) (c2033.f5989 >> 32));
                boolean zM6329 = AbstractC2905.m6329(c7328, fM5071, c7328M3743.f19539);
                boolean zM63292 = AbstractC2905.m6329(c7328, fM5071, c7328M3743.f19537);
                boolean z5 = c2033.m3745(iM3757) == ResolvedTextDirection.Rtl;
                int i3 = (zM6329 || zM63292) ? 1 : 0;
                if (!zM6329 || !zM63292) {
                    i3 |= 2;
                }
                if (z5) {
                    i3 |= 4;
                }
                float f7 = c7328M3743.f19539;
                float f8 = c7328M3743.f19537;
                builder2.setInsertionMarkerLocation(fM5071, f7, f8, f8, i3);
                builder = builder2;
            }
            if (z2) {
                int iM37572 = c2035 != null ? C2035.m3757(c2035.f6004) : -1;
                int iM3750 = c2035 != null ? C2035.m3750(c2035.f6004) : -1;
                if (iM37572 >= 0 && iM37572 < iM3750) {
                    builder.setComposingText(iM37572, c2013.f5947.f6129.subSequence(iM37572, iM3750));
                    interfaceC2022.mo1882(iM37572);
                    interfaceC2022.mo1882(iM3750);
                    float[] fArr2 = new float[(iM3750 - iM37572) * 4];
                    c2062.m3791(AbstractC2048.m3770(iM37572, iM3750), fArr2);
                    int i4 = iM37572;
                    while (i4 < iM3750) {
                        interfaceC2022.mo1882(i4);
                        int i5 = (i4 - iM37572) * 4;
                        float f9 = fArr2[i5];
                        float f10 = fArr2[i5 + 1];
                        float f11 = fArr2[i5 + 2];
                        float f12 = fArr2[i5 + 3];
                        CursorAnchorInfo.Builder builder3 = builder;
                        int i6 = (c7328.f19540 < f11 ? 1 : 0) & (f9 < c7328.f19538 ? 1 : 0) & (f6 < f12 ? 1 : 0) & (f10 < f5 ? 1 : 0);
                        if (!AbstractC2905.m6329(c7328, f9, f10) || !AbstractC2905.m6329(c7328, f11, f12)) {
                            i6 |= 2;
                        }
                        int i7 = i6;
                        int i8 = iM3750;
                        if (c2033.m3745(i4) == ResolvedTextDirection.Rtl) {
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
                        iM3750 = i8;
                    }
                }
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33 && z3) {
                builder.setEditorBoundsInfo(AbstractC0040.m98().setEditorBounds(AbstractC1581.m2875(c73282)).setHandwritingBounds(AbstractC1581.m2875(c73282)).build());
            }
            if (i9 >= 34 && z4 && !c7328.m12516()) {
                int i10 = c2062.f6100 - 1;
                if (i10 < 0) {
                    i10 = 0;
                }
                int iM5090 = AbstractC2567.m5090(c2062.m3787(f6), 0, i10);
                int iM50902 = AbstractC2567.m5090(c2062.m3787(f5), 0, i10);
                if (iM5090 <= iM50902) {
                    while (true) {
                        builder.addVisibleLineBounds(c2033.m3741(iM5090), c2062.m3786(iM5090), c2033.m3740(iM5090), c2062.m3790(iM5090));
                        if (iM5090 == iM50902) {
                            break;
                        } else {
                            iM5090++;
                        }
                    }
                }
            }
            ((InputMethodManager) interfaceC5184.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f5916 = false;
        }
    }
}
