package org.luckypray.dexkit.result;

import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p009E0.AbstractC0179j;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class MethodData$usingStrings$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ MethodData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$usingStrings$2(DexKitBridge dexKitBridge, MethodData methodData, int i2, int i3) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = methodData;
        this.$dexId = i2;
        this.$id = i3;
    }

    @Override // p029P0.InterfaceC0275a
    public final List<String> invoke() {
        DexKitBridge dexKitBridge = this.$bridge;
        return AbstractC0179j.m540q0(DexKitBridge.Companion.nativeGetMethodUsingStrings(dexKitBridge.getSafeToken(), this.this$0.getEncodeId(this.$dexId, this.$id)));
    }
}
