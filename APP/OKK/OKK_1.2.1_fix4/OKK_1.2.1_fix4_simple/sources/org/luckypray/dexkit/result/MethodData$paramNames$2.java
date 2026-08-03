package org.luckypray.dexkit.result;

import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class MethodData$paramNames$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexKitBridge $bridge;
    final /* synthetic */ int $dexId;
    final /* synthetic */ int $id;
    final /* synthetic */ MethodData this$0;

    public MethodData$paramNames$2(DexKitBridge r1, MethodData r2, int r3, int r4) {
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
    public final List<String> invoke() {
        DexKitBridge r02 = this.$bridge;
        long r1 = MethodData.access$getEncodeId(this.this$0, this.$dexId, this.$id);
        String[] r03 = DexKitBridge.Companion.access$nativeGetParameterNames(DexKitBridge.Companion, DexKitBridge.access$getSafeToken(r02), r1);
        if (r03 == null) goto L7;
        ArrayList r12 = new ArrayList(r03.length);
        int r2 = r03.length;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L10;
        r12.add(r03[r3]);
        r3 = r3 + 1;
        goto L5
    L10:
        return r12;
    L7:
        return null;
    }
}
