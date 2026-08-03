package org.luckypray.dexkit.result;

import org.luckypray.dexkit.wrap.DexMethod;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class MethodData$dexMethod$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ MethodData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$dexMethod$2(MethodData methodData) {
        super(0);
        this.this$0 = methodData;
    }

    @Override // p029P0.InterfaceC0275a
    public final DexMethod invoke() {
        return new DexMethod(this.this$0.getDescriptor());
    }
}
