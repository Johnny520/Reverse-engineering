package p126;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.AbstractC1238;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import java.util.ArrayList;
import kotlin.collections.AbstractC4347;
import p070.AbstractC6900;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7446 extends AbstractC6900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7446 f20157 = new C7446(1, 0, 2);

    @Override // p070.AbstractC6900
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12182(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7430 interfaceC7430) {
        int[] iArr;
        C1230 c1230;
        int iM2116;
        int iM1824 = c0920.m1824(0);
        if (c1235.f3576 != 0) {
            AbstractC1374.m2507("Cannot move a group while inserting");
        }
        if (iM1824 < 0) {
            AbstractC1374.m2507("Parameter offset is out of bounds");
        }
        if (iM1824 == 0) {
            return;
        }
        int i = c1235.f3570;
        int i2 = c1235.f3575;
        int i3 = c1235.f3574;
        int i4 = i;
        while (true) {
            iArr = c1235.f3568;
            if (iM1824 <= 0) {
                break;
            }
            i4 += iArr[(c1235.m2128(i4) * 5) + 3];
            if (i4 > i3) {
                AbstractC1374.m2507("Parameter offset is out of bounds");
            }
            iM1824--;
        }
        int i5 = iArr[(c1235.m2128(i4) * 5) + 3];
        int iM2132 = c1235.m2132(c1235.f3568, c1235.m2128(c1235.f3570));
        int iM21322 = c1235.m2132(c1235.f3568, c1235.m2128(i4));
        int i6 = i4 + i5;
        int iM21323 = c1235.m2132(c1235.f3568, c1235.m2128(i6));
        int i7 = iM21323 - iM21322;
        c1235.m2122(i7, Math.max(c1235.f3570 - 1, 0));
        c1235.m2121(i5);
        int[] iArr2 = c1235.f3568;
        int iM2128 = c1235.m2128(i6) * 5;
        AbstractC4347.m8836(c1235.m2128(i) * 5, iM2128, (i5 * 5) + iM2128, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = c1235.f3567;
            int iM2131 = c1235.m2131(iM21322 + i7);
            System.arraycopy(objArr, iM2131, objArr, iM2132, c1235.m2131(iM21323 + i7) - iM2131);
        }
        int i8 = iM21322 + i7;
        int i9 = i8 - iM2132;
        int i10 = c1235.f3584;
        int i11 = c1235.f3585;
        int length = c1235.f3567.length;
        int i12 = c1235.f3577;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iM21282 = c1235.m2128(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iM21282 * 5) + 4] = C1235.m2090(C1235.m2090(c1235.m2132(iArr2, iM21282) - i15, i12 < iM21282 ? 0 : i10, i11, length), c1235.f3584, c1235.f3585, c1235.f3567.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iM2130 = c1235.m2130();
        int iM2141 = AbstractC1238.m2141(c1235.f3566, i6, iM2130);
        ArrayList arrayList = new ArrayList();
        if (iM2141 >= 0) {
            while (iM2141 < c1235.f3566.size() && (iM2116 = c1235.m2116((c1230 = (C1230) c1235.f3566.get(iM2141)))) >= i6 && iM2116 < i16) {
                arrayList.add(c1230);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            C1230 c12302 = (C1230) arrayList.get(i18);
            int iM21162 = c1235.m2116(c12302) + i17;
            if (iM21162 >= c1235.f3583) {
                c12302.f3534 = -(iM2130 - iM21162);
            } else {
                c12302.f3534 = iM21162;
            }
            c1235.f3566.add(AbstractC1238.m2141(c1235.f3566, iM21162, iM2130), c12302);
        }
        if (c1235.m2108(i6, i5)) {
            AbstractC1374.m2507("Unexpectedly removed anchors");
        }
        c1235.m2126(i2, c1235.f3574, i);
        if (i7 > 0) {
            c1235.m2107(i8, i7, i6 - 1);
        }
    }
}
