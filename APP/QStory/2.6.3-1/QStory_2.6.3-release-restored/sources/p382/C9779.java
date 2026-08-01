package p382;

import com.google.flatbuffers.C4051;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import org.luckypray.dexkit.result.C6554;
import org.luckypray.dexkit.result.C6557;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.result.FieldDataList;
import p383.AbstractC9784;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9779 extends AbstractC9784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public FieldDataList f25495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ClassDataList f25496;

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) {
        int iM7865;
        int iM78652;
        ClassDataList classDataList = this.f25496;
        if (classDataList != null) {
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(classDataList, 10));
            Iterator<C6554> it = classDataList.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().m15117()));
            }
            long[] jArrM9344 = AbstractC5176.m9344(arrayList);
            c4051.m7859(8, jArrM9344.length, 8);
            for (int length = jArrM9344.length - 1; -1 < length; length--) {
                c4051.m7853(jArrM9344[length]);
            }
            iM7865 = c4051.m7865();
        } else {
            iM7865 = 0;
        }
        FieldDataList fieldDataList = this.f25495;
        if (fieldDataList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(fieldDataList, 10));
            Iterator<C6557> it2 = fieldDataList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(it2.next().m15117()));
            }
            long[] jArrM93442 = AbstractC5176.m9344(arrayList2);
            c4051.m7859(8, jArrM93442.length, 8);
            for (int length2 = jArrM93442.length - 1; -1 < length2; length2--) {
                c4051.m7853(jArrM93442[length2]);
            }
            iM78652 = c4051.m7865();
        } else {
            iM78652 = 0;
        }
        c4051.m7858(7);
        c4051.m7851(6, 0);
        c4051.m7851(4, iM78652);
        c4051.m7851(3, iM7865);
        c4051.m7851(1, 0);
        c4051.m7851(0, 0);
        int iM7864 = c4051.m7864();
        c4051.m7862(iM7864);
        return iM7864;
    }
}
