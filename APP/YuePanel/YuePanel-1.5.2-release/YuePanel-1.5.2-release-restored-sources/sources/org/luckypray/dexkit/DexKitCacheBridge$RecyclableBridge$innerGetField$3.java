package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.wrap.DexField;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m2699d2 = {"<anonymous>", "Lorg/luckypray/dexkit/wrap/DexField;", "it", "Lorg/luckypray/dexkit/result/FieldData;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class DexKitCacheBridge$RecyclableBridge$innerGetField$3 extends AbstractC5673 implements InterfaceC5124<FieldData, DexField> {
    public static final DexKitCacheBridge$RecyclableBridge$innerGetField$3 INSTANCE = new DexKitCacheBridge$RecyclableBridge$innerGetField$3();

    public DexKitCacheBridge$RecyclableBridge$innerGetField$3() {
        super(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // Yue.InterfaceC5124
    @InterfaceC6399
    public final DexField invoke(@InterfaceC6399 FieldData fieldData) {
        C5499.m17103(fieldData, "it");
        return fieldData.toDexField();
    }
}
