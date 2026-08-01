package org.luckypray.dexkit;

import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.query.BatchFindClassUsingStrings;
import org.luckypray.dexkit.result.ClassData;
import p000.AbstractC0184d9;
import p000.InterfaceC0546y5;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0380xd5638d93 extends AbstractC0184d9 implements InterfaceC0546y5 {
    public static final C0380xd5638d93 INSTANCE = new C0380xd5638d93();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0380xd5638d93() {
        super(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p000.InterfaceC0546y5
    public final Map<String, List<ClassData>> invoke(DexKitBridge dexKitBridge, BatchFindClassUsingStrings batchFindClassUsingStrings) {
        dexKitBridge.getClass();
        batchFindClassUsingStrings.getClass();
        return dexKitBridge.batchFindClassUsingStrings(batchFindClassUsingStrings);
    }
}
