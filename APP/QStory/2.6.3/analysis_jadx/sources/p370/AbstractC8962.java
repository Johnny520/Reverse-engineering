package p370;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.C5743;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f25178 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f25177 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ReferenceQueue f25176 = new ReferenceQueue();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14577(String str, C5743 c5743) {
        str.getClass();
        c5743.getClass();
        while (true) {
            ReferenceQueue referenceQueue = f25176;
            Reference referencePoll = referenceQueue.poll();
            ConcurrentHashMap concurrentHashMap = f25177;
            if (referencePoll == null) {
                concurrentHashMap.put(str, new C8963(str, c5743, referenceQueue));
                return;
            } else {
                C8963 c8963 = referencePoll instanceof C8963 ? (C8963) referencePoll : null;
                if (c8963 != null) {
                    concurrentHashMap.remove(c8963.f25179, c8963);
                }
            }
        }
    }
}
