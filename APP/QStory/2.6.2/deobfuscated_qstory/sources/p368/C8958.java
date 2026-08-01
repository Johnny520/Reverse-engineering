package p368;

import com.google.flatbuffers.C3218;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import org.luckypray.dexkit.query.matchers.C5708;
import org.luckypray.dexkit.result.C5723;
import org.luckypray.dexkit.result.ClassDataList;
import p364.AbstractC8943;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8958 extends AbstractC8943 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C5708 f25186;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ClassDataList f25187;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public List f25188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public List f25189;

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo6650(C3218 c3218) {
        int iM7314;
        int iM73142;
        int iM7319;
        List list = this.f25189;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c3218.m7315((String) it.next())));
            }
            iM7314 = c3218.m7314(AbstractC4343.m8807(arrayList));
        } else {
            iM7314 = 0;
        }
        List list2 = this.f25188;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(c3218.m7315((String) it2.next())));
            }
            iM73142 = c3218.m7314(AbstractC4343.m8807(arrayList2));
        } else {
            iM73142 = 0;
        }
        ClassDataList classDataList = this.f25187;
        if (classDataList != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(classDataList, 10));
            Iterator<C5723> it3 = classDataList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(it3.next().m14539()));
            }
            long[] jArrM8805 = AbstractC4343.m8805(arrayList3);
            c3218.m7313(8, jArrM8805.length, 8);
            for (int length = jArrM8805.length - 1; -1 < length; length--) {
                c3218.m7307(jArrM8805[length]);
            }
            iM7319 = c3218.m7319();
        } else {
            iM7319 = 0;
        }
        C5708 c5708 = this.f25186;
        int iMo6650 = c5708 != null ? c5708.mo6650(c3218) : 0;
        c3218.m7312(6);
        c3218.m7305(5, iMo6650);
        c3218.m7305(3, iM7319);
        c3218.m7305(1, iM73142);
        c3218.m7305(0, iM7314);
        int iM7318 = c3218.m7318();
        c3218.m7316(iM7318);
        return iM7318;
    }
}
