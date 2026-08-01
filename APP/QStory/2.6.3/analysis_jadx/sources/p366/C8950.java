package p366;

import com.google.flatbuffers.C3219;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import org.luckypray.dexkit.result.C5724;
import org.luckypray.dexkit.result.C5727;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.result.FieldDataList;
import p367.AbstractC8955;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8950 extends AbstractC8955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public FieldDataList f25150;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ClassDataList f25151;

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1181(C3219 c3219) {
        int iM7306;
        int iM73062;
        ClassDataList classDataList = this.f25151;
        if (classDataList != null) {
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(classDataList, 10));
            Iterator<C5724> it = classDataList.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().m14558()));
            }
            long[] jArrM8785 = AbstractC4344.m8785(arrayList);
            c3219.m7300(8, jArrM8785.length, 8);
            for (int length = jArrM8785.length - 1; -1 < length; length--) {
                c3219.m7294(jArrM8785[length]);
            }
            iM7306 = c3219.m7306();
        } else {
            iM7306 = 0;
        }
        FieldDataList fieldDataList = this.f25150;
        if (fieldDataList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(fieldDataList, 10));
            Iterator<C5727> it2 = fieldDataList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(it2.next().m14558()));
            }
            long[] jArrM87852 = AbstractC4344.m8785(arrayList2);
            c3219.m7300(8, jArrM87852.length, 8);
            for (int length2 = jArrM87852.length - 1; -1 < length2; length2--) {
                c3219.m7294(jArrM87852[length2]);
            }
            iM73062 = c3219.m7306();
        } else {
            iM73062 = 0;
        }
        c3219.m7299(7);
        c3219.m7292(6, 0);
        c3219.m7292(4, iM73062);
        c3219.m7292(3, iM7306);
        c3219.m7292(1, 0);
        c3219.m7292(0, 0);
        int iM7305 = c3219.m7305();
        c3219.m7303(iM7305);
        return iM7305;
    }
}
