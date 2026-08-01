package p142;

import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.composer.gapbuffer.AbstractC2073;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2086;
import java.util.ArrayList;
import kotlin.collections.AbstractC5179;
import p086.AbstractC7729;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8275 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8275 f20502 = new C8275(1, 0, 2);

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        int[] iArr;
        C2065 c2065;
        int iM2676;
        int iM2384 = c1758.m2384(0);
        if (c2070.f3921 != 0) {
            AbstractC2209.m3067("Cannot move a group while inserting");
        }
        if (iM2384 < 0) {
            AbstractC2209.m3067("Parameter offset is out of bounds");
        }
        if (iM2384 == 0) {
            return;
        }
        int i = c2070.f3915;
        int i2 = c2070.f3920;
        int i3 = c2070.f3919;
        int i4 = i;
        while (true) {
            iArr = c2070.f3913;
            if (iM2384 <= 0) {
                break;
            }
            i4 += iArr[(c2070.m2688(i4) * 5) + 3];
            if (i4 > i3) {
                AbstractC2209.m3067("Parameter offset is out of bounds");
            }
            iM2384--;
        }
        int i5 = iArr[(c2070.m2688(i4) * 5) + 3];
        int iM2692 = c2070.m2692(c2070.f3913, c2070.m2688(c2070.f3915));
        int iM26922 = c2070.m2692(c2070.f3913, c2070.m2688(i4));
        int i6 = i4 + i5;
        int iM26923 = c2070.m2692(c2070.f3913, c2070.m2688(i6));
        int i7 = iM26923 - iM26922;
        c2070.m2682(i7, Math.max(c2070.f3915 - 1, 0));
        c2070.m2681(i5);
        int[] iArr2 = c2070.f3913;
        int iM2688 = c2070.m2688(i6) * 5;
        AbstractC5179.m9395(c2070.m2688(i) * 5, iM2688, (i5 * 5) + iM2688, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = c2070.f3912;
            int iM2691 = c2070.m2691(iM26922 + i7);
            System.arraycopy(objArr, iM2691, objArr, iM2692, c2070.m2691(iM26923 + i7) - iM2691);
        }
        int i8 = iM26922 + i7;
        int i9 = i8 - iM2692;
        int i10 = c2070.f3929;
        int i11 = c2070.f3930;
        int length = c2070.f3912.length;
        int i12 = c2070.f3922;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iM26882 = c2070.m2688(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iM26882 * 5) + 4] = C2070.m2650(C2070.m2650(c2070.m2692(iArr2, iM26882) - i15, i12 < iM26882 ? 0 : i10, i11, length), c2070.f3929, c2070.f3930, c2070.f3912.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iM2690 = c2070.m2690();
        int iM2701 = AbstractC2073.m2701(c2070.f3911, i6, iM2690);
        ArrayList arrayList = new ArrayList();
        if (iM2701 >= 0) {
            while (iM2701 < c2070.f3911.size() && (iM2676 = c2070.m2676((c2065 = (C2065) c2070.f3911.get(iM2701)))) >= i6 && iM2676 < i16) {
                arrayList.add(c2065);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            C2065 c20652 = (C2065) arrayList.get(i18);
            int iM26762 = c2070.m2676(c20652) + i17;
            if (iM26762 >= c2070.f3928) {
                c20652.f3879 = -(iM2690 - iM26762);
            } else {
                c20652.f3879 = iM26762;
            }
            c2070.f3911.add(AbstractC2073.m2701(c2070.f3911, iM26762, iM2690), c20652);
        }
        if (c2070.m2668(i6, i5)) {
            AbstractC2209.m3067("Unexpectedly removed anchors");
        }
        c2070.m2686(i2, c2070.f3919, i);
        if (i7 > 0) {
            c2070.m2667(i8, i7, i6 - 1);
        }
    }
}
