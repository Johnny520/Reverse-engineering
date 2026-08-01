package org.luckypray.dexkit;

import java.util.List;
import org.luckypray.dexkit.query.FindField;
import org.luckypray.dexkit.result.FieldData;
import p000.AbstractC0184d9;
import p000.InterfaceC0546y5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$innerGetField$2 extends AbstractC0184d9 implements InterfaceC0546y5 {
    public static final DexKitCacheBridge$RecyclableBridge$innerGetField$2 INSTANCE = new DexKitCacheBridge$RecyclableBridge$innerGetField$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexKitCacheBridge$RecyclableBridge$innerGetField$2() {
        super(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p000.InterfaceC0546y5
    public final List<FieldData> invoke(DexKitBridge dexKitBridge, FindField findField) {
        dexKitBridge.getClass();
        findField.getClass();
        return dexKitBridge.findField(findField);
    }
}
