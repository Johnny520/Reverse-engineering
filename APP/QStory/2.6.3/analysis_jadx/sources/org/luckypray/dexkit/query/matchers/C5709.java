package org.luckypray.dexkit.query.matchers;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.google.flatbuffers.C3219;
import java.util.ArrayList;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import org.luckypray.dexkit.query.enums.StringMatchType;
import p362.C8926;
import p362.C8929;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5709 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C5717 f15647;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C5717 f15648;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C5709 f15649;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8929 f15650;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8926 f15651;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ArrayList f15652;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C5717 f15653;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m11121(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.f15651 = new C8926(str, stringMatchType, z);
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1181(C3219 c3219) {
        int iM7301;
        C8926 c8926 = this.f15651;
        int iMo1181 = c8926 != null ? c8926.mo1181(c3219) : 0;
        C8929 c8929 = this.f15650;
        int iMo11812 = c8929 != null ? c8929.mo1181(c3219) : 0;
        C5709 c5709 = this.f15649;
        int iMo11813 = c5709 != null ? c5709.mo1181(c3219) : 0;
        C5717 c5717 = this.f15648;
        int iMo11814 = c5717 != null ? c5717.mo1181(c3219) : 0;
        C5717 c57172 = this.f15647;
        int iMo11815 = c57172 != null ? c57172.mo1181(c3219) : 0;
        C5717 c57173 = this.f15653;
        int iMo11816 = c57173 != null ? c57173.mo1181(c3219) : 0;
        ArrayList<C8926> arrayList = this.f15652;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
            for (C8926 c89262 : arrayList) {
                c89262.getClass();
                arrayList2.add(Integer.valueOf(c89262.mo1181(c3219)));
            }
            iM7301 = c3219.m7301(AbstractC4344.m8798(arrayList2));
        } else {
            iM7301 = 0;
        }
        c3219.m7299(12);
        c3219.m7292(11, 0);
        c3219.m7292(10, 0);
        c3219.m7292(9, 0);
        c3219.m7292(8, iM7301);
        c3219.m7292(7, iMo11816);
        c3219.m7292(6, iMo11815);
        c3219.m7292(5, 0);
        c3219.m7292(4, iMo11814);
        c3219.m7292(3, iMo11813);
        c3219.m7292(2, iMo11812);
        c3219.m7292(1, iMo1181);
        c3219.m7292(0, 0);
        int iM7305 = c3219.m7305();
        c3219.m7303(iM7305);
        return iM7305;
    }
}
