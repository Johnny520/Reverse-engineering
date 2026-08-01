package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.activity.AbstractC0040;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1587;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2062;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.InterfaceC2022;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import p000.AbstractC6087;
import p052.InterfaceC6557;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0866 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f2424;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f2425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f2426;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0863 f2428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6557 f2429;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C7327 f2430;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C7327 f2431;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f2435;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f2436;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C2033 f2437;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC2022 f2438;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f2439;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2013 f2440;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f2427 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final CursorAnchorInfo.Builder f2433 = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float[] f2434 = C1587.m2897();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Matrix f2432 = new Matrix();

    public C0866(InterfaceC6557 interfaceC6557, InterfaceC0863 interfaceC0863) {
        this.f2429 = interfaceC6557;
        this.f2428 = interfaceC0863;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1683() {
        CursorAnchorInfo.Builder builder;
        boolean z;
        boolean z2;
        C0867 c0867 = (C0867) this.f2428;
        if (!c0867.m1684().isActive(c0867.f2442) || this.f2440 == null || this.f2438 == null || this.f2437 == null || this.f2431 == null || this.f2430 == null) {
            return;
        }
        float[] fArr = this.f2434;
        C1587.m2894(fArr);
        this.f2429.invoke(new C1587(fArr));
        C7327 c7327 = this.f2430;
        c7327.getClass();
        float f = -c7327.f19545;
        C7327 c73272 = this.f2430;
        c73272.getClass();
        C1587.m2892(fArr, f, -c73272.f19544);
        Matrix matrix = this.f2432;
        AbstractC1581.m2875(matrix, fArr);
        C2013 c2013 = this.f2440;
        c2013.getClass();
        long j = c2013.f5945;
        InterfaceC2022 interfaceC2022 = this.f2438;
        interfaceC2022.getClass();
        C2033 c2033 = this.f2437;
        c2033.getClass();
        C2062 c2062 = c2033.f5989;
        C7327 c73273 = this.f2431;
        c73273.getClass();
        float f2 = c73273.f19542;
        float f3 = c73273.f19544;
        C7327 c73274 = this.f2430;
        c73274.getClass();
        boolean z3 = this.f2424;
        boolean z4 = this.f2436;
        boolean z5 = this.f2435;
        boolean z6 = this.f2439;
        CursorAnchorInfo.Builder builder2 = this.f2433;
        builder2.reset();
        builder2.setMatrix(matrix);
        C2035 c2035 = c2013.f5944;
        int iM3747 = C2035.m3747(j);
        builder2.setSelectionRange(iM3747, C2035.m3740(j));
        if (!z3 || iM3747 < 0) {
            builder = builder2;
            z = z4;
            z2 = z5;
        } else {
            interfaceC2022.mo1872(iM3747);
            C7327 c7327M3733 = c2033.m3733(iM3747);
            z = z4;
            z2 = z5;
            float fM11419 = AbstractC6087.m11419(c7327M3733.f19545, 0.0f, (int) (c2033.f5988 >> 32));
            boolean zM1657 = AbstractC0857.m1657(c73273, fM11419, c7327M3733.f19544);
            boolean zM16572 = AbstractC0857.m1657(c73273, fM11419, c7327M3733.f19542);
            boolean z7 = c2033.m3735(iM3747) == ResolvedTextDirection.Rtl;
            int i = (zM1657 || zM16572) ? 1 : 0;
            if (!zM1657 || !zM16572) {
                i |= 2;
            }
            if (z7) {
                i |= 4;
            }
            int i2 = i;
            float f4 = c7327M3733.f19544;
            float f5 = c7327M3733.f19542;
            builder2.setInsertionMarkerLocation(fM11419, f4, f5, f5, i2);
            builder = builder2;
        }
        if (z) {
            int iM37472 = c2035 != null ? C2035.m3747(c2035.f6003) : -1;
            int iM3740 = c2035 != null ? C2035.m3740(c2035.f6003) : -1;
            if (iM37472 >= 0 && iM37472 < iM3740) {
                builder.setComposingText(iM37472, c2013.f5946.f6128.subSequence(iM37472, iM3740));
                interfaceC2022.mo1872(iM37472);
                interfaceC2022.mo1872(iM3740);
                float[] fArr2 = new float[(iM3740 - iM37472) * 4];
                c2062.m3781(AbstractC2048.m3760(iM37472, iM3740), fArr2);
                int i3 = iM37472;
                while (i3 < iM3740) {
                    interfaceC2022.mo1872(i3);
                    int i4 = (i3 - iM37472) * 4;
                    float f6 = fArr2[i4];
                    float f7 = fArr2[i4 + 1];
                    float[] fArr3 = fArr2;
                    float f8 = fArr3[i4 + 2];
                    float f9 = fArr3[i4 + 3];
                    CursorAnchorInfo.Builder builder3 = builder;
                    int i5 = (c73273.f19545 < f8 ? 1 : 0) & (f6 < c73273.f19543 ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                    if (!AbstractC0857.m1657(c73273, f6, f7) || !AbstractC0857.m1657(c73273, f8, f9)) {
                        i5 |= 2;
                    }
                    int i6 = i3;
                    if (c2033.m3735(i3) == ResolvedTextDirection.Rtl) {
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
            builder.setEditorBoundsInfo(AbstractC0040.m98().setEditorBounds(AbstractC1581.m2865(c73274)).setHandwritingBounds(AbstractC1581.m2865(c73274)).build());
        }
        if (i7 >= 34 && z6 && !c73273.m12489()) {
            int i8 = c2062.f6099 - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iM11420 = AbstractC6087.m11420(c2062.m3777(f3), 0, i8);
            int iM114202 = AbstractC6087.m11420(c2062.m3777(f2), 0, i8);
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
        c0867.m1684().updateCursorAnchorInfo(c0867.f2442, builder.build());
        this.f2425 = false;
    }
}
