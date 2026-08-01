package org.luckypray.dexkit.query.matchers;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import com.google.flatbuffers.C4051;
import java.util.ArrayList;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import org.luckypray.dexkit.query.enums.StringMatchType;
import p378.C9755;
import p378.C9758;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6539 extends AbstractC1298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6547 f15992;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6547 f15993;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6539 f15994;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C9758 f15995;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C9755 f15996;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ArrayList f15997;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C6547 f15998;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m11680(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.f15996 = new C9755(str, stringMatchType, z);
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) {
        int iM7860;
        C9755 c9755 = this.f15996;
        int iMo1741 = c9755 != null ? c9755.mo1741(c4051) : 0;
        C9758 c9758 = this.f15995;
        int iMo17412 = c9758 != null ? c9758.mo1741(c4051) : 0;
        C6539 c6539 = this.f15994;
        int iMo17413 = c6539 != null ? c6539.mo1741(c4051) : 0;
        C6547 c6547 = this.f15993;
        int iMo17414 = c6547 != null ? c6547.mo1741(c4051) : 0;
        C6547 c65472 = this.f15992;
        int iMo17415 = c65472 != null ? c65472.mo1741(c4051) : 0;
        C6547 c65473 = this.f15998;
        int iMo17416 = c65473 != null ? c65473.mo1741(c4051) : 0;
        ArrayList<C9755> arrayList = this.f15997;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
            for (C9755 c97552 : arrayList) {
                c97552.getClass();
                arrayList2.add(Integer.valueOf(c97552.mo1741(c4051)));
            }
            iM7860 = c4051.m7860(AbstractC5176.m9357(arrayList2));
        } else {
            iM7860 = 0;
        }
        c4051.m7858(12);
        c4051.m7851(11, 0);
        c4051.m7851(10, 0);
        c4051.m7851(9, 0);
        c4051.m7851(8, iM7860);
        c4051.m7851(7, iMo17416);
        c4051.m7851(6, iMo17415);
        c4051.m7851(5, 0);
        c4051.m7851(4, iMo17414);
        c4051.m7851(3, iMo17413);
        c4051.m7851(2, iMo17412);
        c4051.m7851(1, iMo1741);
        c4051.m7851(0, 0);
        int iM7864 = c4051.m7864();
        c4051.m7862(iM7864);
        return iM7864;
    }
}
