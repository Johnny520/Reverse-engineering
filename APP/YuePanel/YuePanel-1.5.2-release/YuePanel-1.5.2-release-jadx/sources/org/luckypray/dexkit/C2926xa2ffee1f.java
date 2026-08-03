package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.C5499;
import Yue.InterfaceC5138;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.query.BatchFindMethodUsingStrings;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$2 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, m2699d2 = {"<anonymous>", "", "", "", "Lorg/luckypray/dexkit/result/MethodData;", "b", "Lorg/luckypray/dexkit/DexKitBridge;", "q", "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class C2926xa2ffee1f extends AbstractC5673 implements InterfaceC5138<DexKitBridge, BatchFindMethodUsingStrings, Map<String, ? extends List<? extends MethodData>>> {
    public static final C2926xa2ffee1f INSTANCE = new C2926xa2ffee1f();

    public C2926xa2ffee1f() {
        super(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // Yue.InterfaceC5138
    @InterfaceC6399
    public final Map<String, List<MethodData>> invoke(@InterfaceC6399 DexKitBridge dexKitBridge, @InterfaceC6399 BatchFindMethodUsingStrings batchFindMethodUsingStrings) {
        C5499.m17103(dexKitBridge, "b");
        C5499.m17103(batchFindMethodUsingStrings, "q");
        return dexKitBridge.batchFindMethodUsingStrings(batchFindMethodUsingStrings);
    }
}
