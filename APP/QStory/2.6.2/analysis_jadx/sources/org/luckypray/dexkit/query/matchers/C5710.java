package org.luckypray.dexkit.query.matchers;

import com.bumptech.glide.AbstractC3055;
import com.google.flatbuffers.C3218;
import java.util.ArrayList;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import p366.C8945;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5710 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f15656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15657;

    public C5710(String str, ArrayList arrayList) {
        this.f15656 = new ArrayList();
        this.f15657 = str;
        this.f15656 = new ArrayList(arrayList);
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo6650(C3218 c3218) throws IllegalAccessException {
        ArrayList<C8945> arrayList = this.f15656;
        String str = this.f15657;
        if (str == null) {
            throw new IllegalAccessException("groupName not be null");
        }
        if (arrayList.isEmpty()) {
            throw new IllegalAccessException("matchers not be empty");
        }
        int iM7315 = c3218.m7315(str);
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        for (C8945 c8945 : arrayList) {
            c8945.getClass();
            arrayList2.add(Integer.valueOf(c8945.mo6650(c3218)));
        }
        int iM7314 = c3218.m7314(AbstractC4343.m8807(arrayList2));
        c3218.m7312(2);
        c3218.m7305(1, iM7314);
        c3218.m7305(0, iM7315);
        int iM7318 = c3218.m7318();
        c3218.m7316(iM7318);
        return iM7318;
    }
}
