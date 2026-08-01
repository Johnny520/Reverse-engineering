package p126;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.AbstractC1238;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import java.util.ArrayList;
import kotlin.collections.AbstractC4346;
import p070.AbstractC6899;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7445 extends AbstractC6899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7445 f20162 = new C7445(1, 0, 2);

    @Override // p070.AbstractC6899
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12154(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7429 interfaceC7429) {
        int[] iArr;
        C1230 c1230;
        int iM2106;
        int iM1814 = c0920.m1814(0);
        if (c1235.f3575 != 0) {
            AbstractC1374.m2497("Cannot move a group while inserting");
        }
        if (iM1814 < 0) {
            AbstractC1374.m2497("Parameter offset is out of bounds");
        }
        if (iM1814 == 0) {
            return;
        }
        int i = c1235.f3569;
        int i2 = c1235.f3574;
        int i3 = c1235.f3573;
        int i4 = i;
        while (true) {
            iArr = c1235.f3567;
            if (iM1814 <= 0) {
                break;
            }
            i4 += iArr[(c1235.m2118(i4) * 5) + 3];
            if (i4 > i3) {
                AbstractC1374.m2497("Parameter offset is out of bounds");
            }
            iM1814--;
        }
        int i5 = iArr[(c1235.m2118(i4) * 5) + 3];
        int iM2122 = c1235.m2122(c1235.f3567, c1235.m2118(c1235.f3569));
        int iM21222 = c1235.m2122(c1235.f3567, c1235.m2118(i4));
        int i6 = i4 + i5;
        int iM21223 = c1235.m2122(c1235.f3567, c1235.m2118(i6));
        int i7 = iM21223 - iM21222;
        c1235.m2112(i7, Math.max(c1235.f3569 - 1, 0));
        c1235.m2111(i5);
        int[] iArr2 = c1235.f3567;
        int iM2118 = c1235.m2118(i6) * 5;
        AbstractC4346.m8842(c1235.m2118(i) * 5, iM2118, (i5 * 5) + iM2118, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = c1235.f3566;
            int iM2121 = c1235.m2121(iM21222 + i7);
            System.arraycopy(objArr, iM2121, objArr, iM2122, c1235.m2121(iM21223 + i7) - iM2121);
        }
        int i8 = iM21222 + i7;
        int i9 = i8 - iM2122;
        int i10 = c1235.f3583;
        int i11 = c1235.f3584;
        int length = c1235.f3566.length;
        int i12 = c1235.f3576;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iM21182 = c1235.m2118(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iM21182 * 5) + 4] = C1235.m2080(C1235.m2080(c1235.m2122(iArr2, iM21182) - i15, i12 < iM21182 ? 0 : i10, i11, length), c1235.f3583, c1235.f3584, c1235.f3566.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iM2120 = c1235.m2120();
        int iM2131 = AbstractC1238.m2131(c1235.f3565, i6, iM2120);
        ArrayList arrayList = new ArrayList();
        if (iM2131 >= 0) {
            while (iM2131 < c1235.f3565.size() && (iM2106 = c1235.m2106((c1230 = (C1230) c1235.f3565.get(iM2131)))) >= i6 && iM2106 < i16) {
                arrayList.add(c1230);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            C1230 c12302 = (C1230) arrayList.get(i18);
            int iM21062 = c1235.m2106(c12302) + i17;
            if (iM21062 >= c1235.f3582) {
                c12302.f3533 = -(iM2120 - iM21062);
            } else {
                c12302.f3533 = iM21062;
            }
            c1235.f3565.add(AbstractC1238.m2131(c1235.f3565, iM21062, iM2120), c12302);
        }
        if (c1235.m2098(i6, i5)) {
            AbstractC1374.m2497("Unexpectedly removed anchors");
        }
        c1235.m2116(i2, c1235.f3573, i);
        if (i7 > 0) {
            c1235.m2097(i8, i7, i6 - 1);
        }
    }
}
