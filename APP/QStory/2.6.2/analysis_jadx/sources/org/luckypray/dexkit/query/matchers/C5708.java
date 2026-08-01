package org.luckypray.dexkit.query.matchers;

import com.bumptech.glide.AbstractC3055;
import com.google.flatbuffers.C3218;
import java.util.ArrayList;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import org.luckypray.dexkit.query.enums.StringMatchType;
import p366.C8945;
import p366.C8948;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5708 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C5716 f15647;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C5716 f15648;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C5716 f15649;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C5708 f15650;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8948 f15651;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8945 f15652;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ArrayList f15653;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m11064(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.f15652 = new C8945(str, stringMatchType, z);
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo6650(C3218 c3218) {
        int iM7314;
        C8945 c8945 = this.f15652;
        int iMo6650 = c8945 != null ? c8945.mo6650(c3218) : 0;
        C8948 c8948 = this.f15651;
        int iMo66502 = c8948 != null ? c8948.mo6650(c3218) : 0;
        C5708 c5708 = this.f15650;
        int iMo66503 = c5708 != null ? c5708.mo6650(c3218) : 0;
        C5716 c5716 = this.f15649;
        int iMo66504 = c5716 != null ? c5716.mo6650(c3218) : 0;
        C5716 c57162 = this.f15648;
        int iMo66505 = c57162 != null ? c57162.mo6650(c3218) : 0;
        C5716 c57163 = this.f15647;
        int iMo66506 = c57163 != null ? c57163.mo6650(c3218) : 0;
        ArrayList<C8945> arrayList = this.f15653;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
            for (C8945 c89452 : arrayList) {
                c89452.getClass();
                arrayList2.add(Integer.valueOf(c89452.mo6650(c3218)));
            }
            iM7314 = c3218.m7314(AbstractC4343.m8807(arrayList2));
        } else {
            iM7314 = 0;
        }
        c3218.m7312(12);
        c3218.m7305(11, 0);
        c3218.m7305(10, 0);
        c3218.m7305(9, 0);
        c3218.m7305(8, iM7314);
        c3218.m7305(7, iMo66506);
        c3218.m7305(6, iMo66505);
        c3218.m7305(5, 0);
        c3218.m7305(4, iMo66504);
        c3218.m7305(3, iMo66503);
        c3218.m7305(2, iMo66502);
        c3218.m7305(1, iMo6650);
        c3218.m7305(0, 0);
        int iM7318 = c3218.m7318();
        c3218.m7316(iM7318);
        return iM7318;
    }
}
