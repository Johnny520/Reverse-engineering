package org.luckypray.dexkit.query.matchers;

import com.bumptech.glide.AbstractC3055;
import com.google.flatbuffers.C3218;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import org.luckypray.dexkit.query.enums.MatchType;
import p366.C8947;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5716 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f15677;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public List f15678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15679;

    public C5716() {
        this.f15679 = 2;
        this.f15677 = MatchType.Contains;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public void m11066(C5713 c5713) {
        List arrayList = this.f15678;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f15678 = arrayList;
        arrayList.add(c5713);
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo6650(C3218 c3218) {
        int iM7314;
        int iM73142;
        int iM73143;
        int iM73144;
        switch (this.f15679) {
            case 0:
                List<C5715> list = this.f15678;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
                    for (C5715 c5715 : list) {
                        c5715.getClass();
                        arrayList.add(Integer.valueOf(c5715.mo6650(c3218)));
                    }
                    iM7314 = c3218.m7314(AbstractC4343.m8807(arrayList));
                } else {
                    iM7314 = 0;
                }
                byte value = ((MatchType) this.f15677).getValue();
                c3218.m7312(3);
                c3218.m7305(2, 0);
                c3218.m7305(0, iM7314);
                c3218.m7308(value, 1);
                int iM7318 = c3218.m7318();
                c3218.m7316(iM7318);
                return iM7318;
            case 1:
                List<C5708> list2 = this.f15678;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(list2, 10));
                    for (C5708 c5708 : list2) {
                        c5708.getClass();
                        arrayList2.add(Integer.valueOf(c5708.mo6650(c3218)));
                    }
                    iM73142 = c3218.m7314(AbstractC4343.m8807(arrayList2));
                } else {
                    iM73142 = 0;
                }
                byte value2 = ((MatchType) this.f15677).getValue();
                c3218.m7312(3);
                c3218.m7305(2, 0);
                c3218.m7305(0, iM73142);
                c3218.m7308(value2, 1);
                int iM73182 = c3218.m7318();
                c3218.m7316(iM73182);
                return iM73182;
            case 2:
                List<C5713> list3 = this.f15678;
                if (list3 != null) {
                    ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(list3, 10));
                    for (C5713 c5713 : list3) {
                        c5713.getClass();
                        arrayList3.add(Integer.valueOf(c5713.mo6650(c3218)));
                    }
                    iM73143 = c3218.m7314(AbstractC4343.m8807(arrayList3));
                } else {
                    iM73143 = 0;
                }
                byte value3 = ((MatchType) this.f15677).getValue();
                c3218.m7312(3);
                c3218.m7305(2, 0);
                c3218.m7305(0, iM73143);
                c3218.m7308(value3, 1);
                int iM73183 = c3218.m7318();
                c3218.m7316(iM73183);
                return iM73183;
            default:
                List<C5714> list4 = this.f15678;
                if (list4 != null) {
                    ArrayList arrayList4 = new ArrayList(AbstractC4344.m8832(list4, 10));
                    for (C5714 c5714 : list4) {
                        if (c5714 == null) {
                            c5714 = new C5714();
                        }
                        arrayList4.add(Integer.valueOf(c5714.mo6650(c3218)));
                    }
                    iM73144 = c3218.m7314(AbstractC4343.m8807(arrayList4));
                } else {
                    iM73144 = 0;
                }
                C8947 c8947 = (C8947) this.f15677;
                int iMo6650 = c8947 != null ? c8947.mo6650(c3218) : 0;
                c3218.m7312(2);
                c3218.m7305(1, iMo6650);
                c3218.m7305(0, iM73144);
                int iM73184 = c3218.m7318();
                c3218.m7316(iM73184);
                return iM73184;
        }
    }

    public /* synthetic */ C5716(int i) {
        this.f15679 = i;
    }
}
