package org.luckypray.dexkit.result;

import org.luckypray.dexkit.wrap.DexMethod;
import p000.InterfaceC0298hw;
import p000.c50;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodData$dexMethod$2 extends c50 implements InterfaceC0298hw {
    final /* synthetic */ MethodData this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$dexMethod$2(MethodData methodData) {
        super(0);
        this.this$0 = methodData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0298hw
    public final DexMethod invoke() {
        return new DexMethod(this.this$0.getDescriptor());
    }
}
