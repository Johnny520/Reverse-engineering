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
import androidx.window.area.AbstractC2567;
import p052.InterfaceC6558;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0866 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f2425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f2426;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f2427;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0863 f2429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6558 f2430;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C7328 f2431;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C7328 f2432;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f2436;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f2437;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C2033 f2438;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC2022 f2439;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f2440;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2013 f2441;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f2428 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final CursorAnchorInfo.Builder f2434 = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float[] f2435 = C1587.m2907();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Matrix f2433 = new Matrix();

    public C0866(InterfaceC6558 interfaceC6558, InterfaceC0863 interfaceC0863) {
        this.f2430 = interfaceC6558;
        this.f2429 = interfaceC0863;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1693() {
        CursorAnchorInfo.Builder builder;
        boolean z;
        boolean z2;
        C0867 c0867 = (C0867) this.f2429;
        if (!c0867.m1694().isActive(c0867.f2443) || this.f2441 == null || this.f2439 == null || this.f2438 == null || this.f2432 == null || this.f2431 == null) {
            return;
        }
        float[] fArr = this.f2435;
        C1587.m2904(fArr);
        this.f2430.invoke(new C1587(fArr));
        C7328 c7328 = this.f2431;
        c7328.getClass();
        float f = -c7328.f19540;
        C7328 c73282 = this.f2431;
        c73282.getClass();
        C1587.m2902(fArr, f, -c73282.f19539);
        Matrix matrix = this.f2433;
        AbstractC1581.m2885(matrix, fArr);
        C2013 c2013 = this.f2441;
        c2013.getClass();
        long j = c2013.f5946;
        InterfaceC2022 interfaceC2022 = this.f2439;
        interfaceC2022.getClass();
        C2033 c2033 = this.f2438;
        c2033.getClass();
        C2062 c2062 = c2033.f5990;
        C7328 c73283 = this.f2432;
        c73283.getClass();
        float f2 = c73283.f19537;
        float f3 = c73283.f19539;
        C7328 c73284 = this.f2431;
        c73284.getClass();
        boolean z3 = this.f2425;
        boolean z4 = this.f2437;
        boolean z5 = this.f2436;
        boolean z6 = this.f2440;
        CursorAnchorInfo.Builder builder2 = this.f2434;
        builder2.reset();
        builder2.setMatrix(matrix);
        C2035 c2035 = c2013.f5945;
        int iM3757 = C2035.m3757(j);
        builder2.setSelectionRange(iM3757, C2035.m3750(j));
        if (!z3 || iM3757 < 0) {
            builder = builder2;
            z = z4;
            z2 = z5;
        } else {
            interfaceC2022.mo1882(iM3757);
            C7328 c7328M3743 = c2033.m3743(iM3757);
            z = z4;
            z2 = z5;
            float fM5071 = AbstractC2567.m5071(c7328M3743.f19540, 0.0f, (int) (c2033.f5989 >> 32));
            boolean zM1667 = AbstractC0857.m1667(c73283, fM5071, c7328M3743.f19539);
            boolean zM16672 = AbstractC0857.m1667(c73283, fM5071, c7328M3743.f19537);
            boolean z7 = c2033.m3745(iM3757) == ResolvedTextDirection.Rtl;
            int i = (zM1667 || zM16672) ? 1 : 0;
            if (!zM1667 || !zM16672) {
                i |= 2;
            }
            if (z7) {
                i |= 4;
            }
            int i2 = i;
            float f4 = c7328M3743.f19539;
            float f5 = c7328M3743.f19537;
            builder2.setInsertionMarkerLocation(fM5071, f4, f5, f5, i2);
            builder = builder2;
        }
        if (z) {
            int iM37572 = c2035 != null ? C2035.m3757(c2035.f6004) : -1;
            int iM3750 = c2035 != null ? C2035.m3750(c2035.f6004) : -1;
            if (iM37572 >= 0 && iM37572 < iM3750) {
                builder.setComposingText(iM37572, c2013.f5947.f6129.subSequence(iM37572, iM3750));
                interfaceC2022.mo1882(iM37572);
                interfaceC2022.mo1882(iM3750);
                float[] fArr2 = new float[(iM3750 - iM37572) * 4];
                c2062.m3791(AbstractC2048.m3770(iM37572, iM3750), fArr2);
                int i3 = iM37572;
                while (i3 < iM3750) {
                    interfaceC2022.mo1882(i3);
                    int i4 = (i3 - iM37572) * 4;
                    float f6 = fArr2[i4];
                    float f7 = fArr2[i4 + 1];
                    float[] fArr3 = fArr2;
                    float f8 = fArr3[i4 + 2];
                    float f9 = fArr3[i4 + 3];
                    CursorAnchorInfo.Builder builder3 = builder;
                    int i5 = (c73283.f19540 < f8 ? 1 : 0) & (f6 < c73283.f19538 ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                    if (!AbstractC0857.m1667(c73283, f6, f7) || !AbstractC0857.m1667(c73283, f8, f9)) {
                        i5 |= 2;
                    }
                    int i6 = i3;
                    if (c2033.m3745(i3) == ResolvedTextDirection.Rtl) {
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
            builder.setEditorBoundsInfo(AbstractC0040.m98().setEditorBounds(AbstractC1581.m2875(c73284)).setHandwritingBounds(AbstractC1581.m2875(c73284)).build());
        }
        if (i7 >= 34 && z6 && !c73283.m12516()) {
            int i8 = c2062.f6100 - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iM5090 = AbstractC2567.m5090(c2062.m3787(f3), 0, i8);
            int iM50902 = AbstractC2567.m5090(c2062.m3787(f2), 0, i8);
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
        c0867.m1694().updateCursorAnchorInfo(c0867.f2443, builder.build());
        this.f2426 = false;
    }
}
