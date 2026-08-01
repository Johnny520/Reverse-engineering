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
import com.bumptech.glide.AbstractC3056;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import p000.AbstractC6087;
import p052.InterfaceC6557;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2009 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f5914;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5915;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5916;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2026 f5918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5919;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C7327 f5920;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C7327 f5924;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f5926;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f5927;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C2033 f5928;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC2022 f5929;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f5930;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2013 f5931;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f5917 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public InterfaceC6557 f5921 = new InterfaceC6557() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        @Override // p052.InterfaceC6557
        public /* synthetic */ Object invoke(Object obj) {
            m3696invoke58bKbWc(((C1587) obj).f4673);
            return C5175.f14739;
        }

        /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m3696invoke58bKbWc(float[] fArr) {
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final CursorAnchorInfo.Builder f5925 = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float[] f5922 = C1587.m2897();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Matrix f5923 = new Matrix();

    public C2009(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, C2026 c2026) {
        this.f5919 = viewTreeObserverOnGlobalLayoutListenerC1884;
        this.f5918 = c2026;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3701() {
        View view;
        CursorAnchorInfo.Builder builder;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        C2026 c2026 = this.f5918;
        InterfaceC5183 interfaceC5183 = c2026.f5975;
        InputMethodManager inputMethodManager = (InputMethodManager) interfaceC5183.getValue();
        View view2 = c2026.f5976;
        if (inputMethodManager.isActive(view2)) {
            InterfaceC6557 interfaceC6557 = this.f5921;
            float[] fArr = this.f5922;
            interfaceC6557.invoke(new C1587(fArr));
            this.f5919.m3529(fArr);
            Matrix matrix = this.f5923;
            AbstractC1581.m2875(matrix, fArr);
            C2013 c2013 = this.f5931;
            c2013.getClass();
            long j = c2013.f5945;
            InterfaceC2022 interfaceC2022 = this.f5929;
            interfaceC2022.getClass();
            C2033 c2033 = this.f5928;
            c2033.getClass();
            C2062 c2062 = c2033.f5989;
            C7327 c7327 = this.f5920;
            c7327.getClass();
            float f5 = c7327.f19542;
            float f6 = c7327.f19544;
            C7327 c73272 = this.f5924;
            c73272.getClass();
            boolean z = this.f5914;
            boolean z2 = this.f5927;
            boolean z3 = this.f5926;
            boolean z4 = this.f5930;
            CursorAnchorInfo.Builder builder2 = this.f5925;
            builder2.reset();
            builder2.setMatrix(matrix);
            C2035 c2035 = c2013.f5944;
            int iM3747 = C2035.m3747(j);
            builder2.setSelectionRange(iM3747, C2035.m3740(j));
            if (!z || iM3747 < 0) {
                view = view2;
                builder = builder2;
            } else {
                interfaceC2022.mo1872(iM3747);
                C7327 c7327M3733 = c2033.m3733(iM3747);
                view = view2;
                float fM11419 = AbstractC6087.m11419(c7327M3733.f19545, 0.0f, (int) (c2033.f5988 >> 32));
                boolean zM6695 = AbstractC3056.m6695(c7327, fM11419, c7327M3733.f19544);
                boolean zM66952 = AbstractC3056.m6695(c7327, fM11419, c7327M3733.f19542);
                boolean z5 = c2033.m3735(iM3747) == ResolvedTextDirection.Rtl;
                int i3 = (zM6695 || zM66952) ? 1 : 0;
                if (!zM6695 || !zM66952) {
                    i3 |= 2;
                }
                if (z5) {
                    i3 |= 4;
                }
                float f7 = c7327M3733.f19544;
                float f8 = c7327M3733.f19542;
                builder2.setInsertionMarkerLocation(fM11419, f7, f8, f8, i3);
                builder = builder2;
            }
            if (z2) {
                int iM37472 = c2035 != null ? C2035.m3747(c2035.f6003) : -1;
                int iM3740 = c2035 != null ? C2035.m3740(c2035.f6003) : -1;
                if (iM37472 >= 0 && iM37472 < iM3740) {
                    builder.setComposingText(iM37472, c2013.f5946.f6128.subSequence(iM37472, iM3740));
                    interfaceC2022.mo1872(iM37472);
                    interfaceC2022.mo1872(iM3740);
                    float[] fArr2 = new float[(iM3740 - iM37472) * 4];
                    c2062.m3781(AbstractC2048.m3760(iM37472, iM3740), fArr2);
                    int i4 = iM37472;
                    while (i4 < iM3740) {
                        interfaceC2022.mo1872(i4);
                        int i5 = (i4 - iM37472) * 4;
                        float f9 = fArr2[i5];
                        float f10 = fArr2[i5 + 1];
                        float f11 = fArr2[i5 + 2];
                        float f12 = fArr2[i5 + 3];
                        CursorAnchorInfo.Builder builder3 = builder;
                        int i6 = (c7327.f19545 < f11 ? 1 : 0) & (f9 < c7327.f19543 ? 1 : 0) & (f6 < f12 ? 1 : 0) & (f10 < f5 ? 1 : 0);
                        if (!AbstractC3056.m6695(c7327, f9, f10) || !AbstractC3056.m6695(c7327, f11, f12)) {
                            i6 |= 2;
                        }
                        int i7 = i6;
                        int i8 = iM3740;
                        if (c2033.m3735(i4) == ResolvedTextDirection.Rtl) {
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
                        iM3740 = i8;
                    }
                }
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33 && z3) {
                builder.setEditorBoundsInfo(AbstractC0040.m98().setEditorBounds(AbstractC1581.m2865(c73272)).setHandwritingBounds(AbstractC1581.m2865(c73272)).build());
            }
            if (i9 >= 34 && z4 && !c7327.m12489()) {
                int i10 = c2062.f6099 - 1;
                if (i10 < 0) {
                    i10 = 0;
                }
                int iM11420 = AbstractC6087.m11420(c2062.m3777(f6), 0, i10);
                int iM114202 = AbstractC6087.m11420(c2062.m3777(f5), 0, i10);
                if (iM11420 <= iM114202) {
                    while (true) {
                        builder.addVisibleLineBounds(c2033.m3731(iM11420), c2062.m3776(iM11420), c2033.m3730(iM11420), c2062.m3780(iM11420));
                        if (iM11420 == iM114202) {
                            break;
                        } else {
                            iM11420++;
                        }
                    }
                }
            }
            ((InputMethodManager) interfaceC5183.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f5915 = false;
        }
    }
}
