package org.luckypray.dexkit.result;

import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p009E0.AbstractC0179j;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class MethodData$opCodes$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ MethodData this$0;

    public MethodData$opCodes$2(DexKitBridge r1, MethodData r2, int r3, int r4) {
        this.$bridge = r1;
        this.this$0 = r2;
        this.$dexId = r3;
        this.$id = r4;
        super(0);
    }

    @Override // p029P0.InterfaceC0275a
    public /* bridge */ /* synthetic */ Object invoke() {
        return invoke();
    }

    @Override // p029P0.InterfaceC0275a
    public final List<Integer> invoke() {
        DexKitBridge r02 = this.$bridge;
        long r1 = MethodData.access$getEncodeId(this.this$0, this.$dexId, this.$id);
        return AbstractC0179j.m539p0(DexKitBridge.Companion.access$nativeGetMethodOpCodes(DexKitBridge.Companion, DexKitBridge.access$getSafeToken(r02), r1));
    }
}
