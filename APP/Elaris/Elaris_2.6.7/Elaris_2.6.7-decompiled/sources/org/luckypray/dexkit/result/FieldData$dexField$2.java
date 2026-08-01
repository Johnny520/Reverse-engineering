package org.luckypray.dexkit.result;

import org.luckypray.dexkit.wrap.DexField;
import p000.AbstractC0184d9;
import p000.InterfaceC0279j5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldData$dexField$2 extends AbstractC0184d9 implements InterfaceC0279j5 {
    final /* synthetic */ FieldData this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldData$dexField$2(FieldData fieldData) {
        super(0);
        this.this$0 = fieldData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0279j5
    public final DexField invoke() {
        return new DexField(this.this$0.getDescriptor());
    }
}
