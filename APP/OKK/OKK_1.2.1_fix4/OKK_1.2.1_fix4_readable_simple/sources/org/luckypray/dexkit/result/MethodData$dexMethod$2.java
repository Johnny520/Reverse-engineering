package org.luckypray.dexkit.result;

import org.luckypray.dexkit.wrap.DexMethod;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class MethodData$dexMethod$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ MethodData this$0;

    public MethodData$dexMethod$2(MethodData r1) {
        this.this$0 = r1;
        super(0);
    }

    @Override // p029P0.InterfaceC0275a
    public /* bridge */ /* synthetic */ Object invoke() {
        return invoke();
    }

    @Override // p029P0.InterfaceC0275a
    public final DexMethod invoke() {
        return new DexMethod(this.this$0.getDescriptor());
    }
}
