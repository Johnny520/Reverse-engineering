package org.luckypray.dexkit;

import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.query.BatchFindClassUsingStrings;
import org.luckypray.dexkit.result.ClassData;
import p000.InterfaceC0904ww;
import p000.c50;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$2 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0573xd5638d93 extends c50 implements InterfaceC0904ww {
    public static final C0573xd5638d93 INSTANCE = new C0573xd5638d93();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0573xd5638d93() {
        super(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p000.InterfaceC0904ww
    public final Map<String, List<ClassData>> invoke(DexKitBridge dexKitBridge, BatchFindClassUsingStrings batchFindClassUsingStrings) {
        dexKitBridge.getClass();
        batchFindClassUsingStrings.getClass();
        return dexKitBridge.batchFindClassUsingStrings(batchFindClassUsingStrings);
    }
}
