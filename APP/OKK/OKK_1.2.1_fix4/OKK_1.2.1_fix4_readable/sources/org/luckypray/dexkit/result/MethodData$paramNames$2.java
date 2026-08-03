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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodData$paramNames$2(DexKitBridge dexKitBridge, MethodData methodData, int i2, int i3) {
        super(0);
        this.$bridge = dexKitBridge;
        this.this$0 = methodData;
        this.$dexId = i2;
        this.$id = i3;
    }

    @Override // p029P0.InterfaceC0275a
    public final List<String> invoke() {
        String[] strArrNativeGetParameterNames = DexKitBridge.Companion.nativeGetParameterNames(this.$bridge.getSafeToken(), this.this$0.getEncodeId(this.$dexId, this.$id));
        if (strArrNativeGetParameterNames == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArrNativeGetParameterNames.length);
        for (String str : strArrNativeGetParameterNames) {
            arrayList.add(str);
        }
        return arrayList;
    }
}
