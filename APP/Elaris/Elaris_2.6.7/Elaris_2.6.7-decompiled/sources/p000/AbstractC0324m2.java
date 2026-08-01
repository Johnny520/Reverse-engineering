package p000;

import java.util.Collections;
import java.util.Comparator;
import org.luckypray.dexkit.result.BaseDataList;

/* JADX INFO: renamed from: m2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0324m2 extends AbstractC0308l2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j2 */
    public static void m758j2(BaseDataList baseDataList, Comparator comparator) {
        if (baseDataList.size() > 1) {
            Collections.sort(baseDataList, comparator);
        }
    }
}
