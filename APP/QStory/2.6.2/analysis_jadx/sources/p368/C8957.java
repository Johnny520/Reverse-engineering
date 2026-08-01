package p368;

import com.google.flatbuffers.C3218;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import org.luckypray.dexkit.result.C5723;
import org.luckypray.dexkit.result.C5726;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.result.FieldDataList;
import p364.AbstractC8943;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪哲世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8957 extends AbstractC8943 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public FieldDataList f25184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ClassDataList f25185;

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo6650(C3218 c3218) {
        int iM7319;
        int iM73192;
        ClassDataList classDataList = this.f25185;
        if (classDataList != null) {
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(classDataList, 10));
            Iterator<C5723> it = classDataList.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().m14539()));
            }
            long[] jArrM8805 = AbstractC4343.m8805(arrayList);
            c3218.m7313(8, jArrM8805.length, 8);
            for (int length = jArrM8805.length - 1; -1 < length; length--) {
                c3218.m7307(jArrM8805[length]);
            }
            iM7319 = c3218.m7319();
        } else {
            iM7319 = 0;
        }
        FieldDataList fieldDataList = this.f25184;
        if (fieldDataList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(fieldDataList, 10));
            Iterator<C5726> it2 = fieldDataList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(it2.next().m14539()));
            }
            long[] jArrM88052 = AbstractC4343.m8805(arrayList2);
            c3218.m7313(8, jArrM88052.length, 8);
            for (int length2 = jArrM88052.length - 1; -1 < length2; length2--) {
                c3218.m7307(jArrM88052[length2]);
            }
            iM73192 = c3218.m7319();
        } else {
            iM73192 = 0;
        }
        c3218.m7312(7);
        c3218.m7305(6, 0);
        c3218.m7305(4, iM73192);
        c3218.m7305(3, iM7319);
        c3218.m7305(1, 0);
        c3218.m7305(0, 0);
        int iM7318 = c3218.m7318();
        c3218.m7316(iM7318);
        return iM7318;
    }
}
