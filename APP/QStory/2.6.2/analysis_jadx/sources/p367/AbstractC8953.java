package p367;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.C5742;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪世哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8953 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f25177 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f25176 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ReferenceQueue f25175 = new ReferenceQueue();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14545(String str, C5742 c5742) {
        str.getClass();
        c5742.getClass();
        while (true) {
            ReferenceQueue referenceQueue = f25175;
            Reference referencePoll = referenceQueue.poll();
            ConcurrentHashMap concurrentHashMap = f25176;
            if (referencePoll == null) {
                concurrentHashMap.put(str, new C8954(str, c5742, referenceQueue));
                return;
            } else {
                C8954 c8954 = referencePoll instanceof C8954 ? (C8954) referencePoll : null;
                if (c8954 != null) {
                    concurrentHashMap.remove(c8954.f25178, c8954);
                }
            }
        }
    }
}
