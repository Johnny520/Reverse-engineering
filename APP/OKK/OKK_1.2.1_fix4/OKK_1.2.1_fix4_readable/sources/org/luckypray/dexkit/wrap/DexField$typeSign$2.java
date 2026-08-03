package org.luckypray.dexkit.wrap;

import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class DexField$typeSign$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ DexField this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexField$typeSign$2(DexField dexField) {
        super(0);
        this.this$0 = dexField;
    }

    @Override // p029P0.InterfaceC0275a
    public final String invoke() {
        return this.this$0.getSign();
    }
}
