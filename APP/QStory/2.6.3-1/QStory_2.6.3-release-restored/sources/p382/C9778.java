package p382;

import com.google.flatbuffers.C4051;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import org.luckypray.dexkit.query.matchers.C6544;
import org.luckypray.dexkit.result.C6554;
import org.luckypray.dexkit.result.C6558;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.result.MethodDataList;
import p383.AbstractC9784;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪世哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9778 extends AbstractC9784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6544 f25490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public MethodDataList f25491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ClassDataList f25492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f25493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public List f25494;

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) {
        int iM7860;
        int iM78602;
        int iM7865;
        int iM78652;
        List list = this.f25494;
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
        List list2 = this.f25493;
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
        ClassDataList classDataList = this.f25492;
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
        MethodDataList methodDataList = this.f25491;
        if (methodDataList != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(methodDataList, 10));
            Iterator<C6558> it4 = methodDataList.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Long.valueOf(it4.next().m15117()));
            }
            long[] jArrM93442 = AbstractC5176.m9344(arrayList4);
            c4051.m7859(8, jArrM93442.length, 8);
            for (int length2 = jArrM93442.length - 1; -1 < length2; length2--) {
                c4051.m7853(jArrM93442[length2]);
            }
            iM78652 = c4051.m7865();
        } else {
            iM78652 = 0;
        }
        C6544 c6544 = this.f25490;
        int iMo1741 = c6544 != null ? c6544.mo1741(c4051) : 0;
        c4051.m7858(7);
        c4051.m7851(6, iMo1741);
        c4051.m7851(4, iM78652);
        c4051.m7851(3, iM7865);
        c4051.m7851(1, iM78602);
        c4051.m7851(0, iM7860);
        int iM7864 = c4051.m7864();
        c4051.m7862(iM7864);
        return iM7864;
    }
}
