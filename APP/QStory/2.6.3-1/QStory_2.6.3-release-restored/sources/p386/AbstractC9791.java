package p386;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.C6573;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9791 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f25523 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f25522 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ReferenceQueue f25521 = new ReferenceQueue();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m15136(String str, C6573 c6573) {
        str.getClass();
        c6573.getClass();
        while (true) {
            ReferenceQueue referenceQueue = f25521;
            Reference referencePoll = referenceQueue.poll();
            ConcurrentHashMap concurrentHashMap = f25522;
            if (referencePoll == null) {
                concurrentHashMap.put(str, new C9792(str, c6573, referenceQueue));
                return;
            } else {
                C9792 c9792 = referencePoll instanceof C9792 ? (C9792) referencePoll : null;
                if (c9792 != null) {
                    concurrentHashMap.remove(c9792.f25524, c9792);
                }
            }
        }
    }
}
