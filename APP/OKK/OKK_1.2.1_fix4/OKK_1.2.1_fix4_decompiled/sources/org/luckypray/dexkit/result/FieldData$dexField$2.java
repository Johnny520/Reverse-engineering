package org.luckypray.dexkit.result;

import org.luckypray.dexkit.wrap.DexField;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class FieldData$dexField$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ FieldData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldData$dexField$2(FieldData fieldData) {
        super(0);
        this.this$0 = fieldData;
    }

    @Override // p029P0.InterfaceC0275a
    public final DexField invoke() {
        return new DexField(this.this$0.getDescriptor());
    }
}
