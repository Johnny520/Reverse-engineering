package p382;

import com.google.flatbuffers.C4051;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import org.luckypray.dexkit.query.matchers.C6539;
import org.luckypray.dexkit.result.C6554;
import org.luckypray.dexkit.result.ClassDataList;
import p383.AbstractC9784;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪世哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9780 extends AbstractC9784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6539 f25497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ClassDataList f25498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f25499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public List f25500;

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) {
        int iM7860;
        int iM78602;
        int iM7865;
        List list = this.f25500;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c4051.m7861((String) it.next())));
            }
            iM7860 = c4051.m7860(AbstractC5176.m9357(arrayList));
        } else {
            iM7860 = 0;
        }
        List list2 = this.f25499;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(c4051.m7861((String) it2.next())));
            }
            iM78602 = c4051.m7860(AbstractC5176.m9357(arrayList2));
        } else {
            iM78602 = 0;
        }
        ClassDataList classDataList = this.f25498;
        if (classDataList != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(classDataList, 10));
            Iterator<C6554> it3 = classDataList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(it3.next().m15117()));
            }
            long[] jArrM9344 = AbstractC5176.m9344(arrayList3);
            c4051.m7859(8, jArrM9344.length, 8);
            for (int length = jArrM9344.length - 1; -1 < length; length--) {
                c4051.m7853(jArrM9344[length]);
            }
            iM7865 = c4051.m7865();
        } else {
            iM7865 = 0;
        }
        C6539 c6539 = this.f25497;
        int iMo1741 = c6539 != null ? c6539.mo1741(c4051) : 0;
        c4051.m7858(6);
        c4051.m7851(5, iMo1741);
        c4051.m7851(3, iM7865);
        c4051.m7851(1, iM78602);
        c4051.m7851(0, iM7860);
        int iM7864 = c4051.m7864();
        c4051.m7862(iM7864);
        return iM7864;
    }
}
