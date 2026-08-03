package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.C5499;
import Yue.InterfaceC5138;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import java.util.List;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m2699d2 = {"<anonymous>", "", "Lorg/luckypray/dexkit/result/MethodData;", "b", "Lorg/luckypray/dexkit/DexKitBridge;", "q", "Lorg/luckypray/dexkit/query/FindMethod;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class DexKitCacheBridge$RecyclableBridge$innerGetMethods$1 extends AbstractC5673 implements InterfaceC5138<DexKitBridge, FindMethod, List<? extends MethodData>> {
    public static final DexKitCacheBridge$RecyclableBridge$innerGetMethods$1 INSTANCE = new DexKitCacheBridge$RecyclableBridge$innerGetMethods$1();

    public DexKitCacheBridge$RecyclableBridge$innerGetMethods$1() {
        super(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // Yue.InterfaceC5138
    @InterfaceC6399
    public final List<MethodData> invoke(@InterfaceC6399 DexKitBridge dexKitBridge, @InterfaceC6399 FindMethod findMethod) {
        C5499.m17103(dexKitBridge, "b");
        C5499.m17103(findMethod, "q");
        return dexKitBridge.findMethod(findMethod);
    }
}
