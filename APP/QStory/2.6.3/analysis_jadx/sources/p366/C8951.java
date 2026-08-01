package p366;

import com.google.flatbuffers.C3219;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import org.luckypray.dexkit.query.matchers.C5709;
import org.luckypray.dexkit.result.C5724;
import org.luckypray.dexkit.result.ClassDataList;
import p367.AbstractC8955;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪世哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8951 extends AbstractC8955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C5709 f25152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ClassDataList f25153;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f25154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public List f25155;

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1181(C3219 c3219) {
        int iM7301;
        int iM73012;
        int iM7306;
        List list = this.f25155;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c3219.m7302((String) it.next())));
            }
            iM7301 = c3219.m7301(AbstractC4344.m8798(arrayList));
        } else {
            iM7301 = 0;
        }
        List list2 = this.f25154;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(c3219.m7302((String) it2.next())));
            }
            iM73012 = c3219.m7301(AbstractC4344.m8798(arrayList2));
        } else {
            iM73012 = 0;
        }
        ClassDataList classDataList = this.f25153;
        if (classDataList != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(classDataList, 10));
            Iterator<C5724> it3 = classDataList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(it3.next().m14558()));
            }
            long[] jArrM8785 = AbstractC4344.m8785(arrayList3);
            c3219.m7300(8, jArrM8785.length, 8);
            for (int length = jArrM8785.length - 1; -1 < length; length--) {
                c3219.m7294(jArrM8785[length]);
            }
            iM7306 = c3219.m7306();
        } else {
            iM7306 = 0;
        }
        C5709 c5709 = this.f25152;
        int iMo1181 = c5709 != null ? c5709.mo1181(c3219) : 0;
        c3219.m7299(6);
        c3219.m7292(5, iMo1181);
        c3219.m7292(3, iM7306);
        c3219.m7292(1, iM73012);
        c3219.m7292(0, iM7301);
        int iM7305 = c3219.m7305();
        c3219.m7303(iM7305);
        return iM7305;
    }
}
