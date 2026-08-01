package org.luckypray.dexkit;

import java.util.List;
import org.luckypray.dexkit.query.FindField;
import org.luckypray.dexkit.result.FieldData;
import p000.InterfaceC0904ww;
import p000.c50;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$innerGetField$2 extends c50 implements InterfaceC0904ww {
    public static final DexKitCacheBridge$RecyclableBridge$innerGetField$2 INSTANCE = new DexKitCacheBridge$RecyclableBridge$innerGetField$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexKitCacheBridge$RecyclableBridge$innerGetField$2() {
        super(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p000.InterfaceC0904ww
    public final List<FieldData> invoke(DexKitBridge dexKitBridge, FindField findField) {
        dexKitBridge.getClass();
        findField.getClass();
        return dexKitBridge.findField(findField);
    }
}
