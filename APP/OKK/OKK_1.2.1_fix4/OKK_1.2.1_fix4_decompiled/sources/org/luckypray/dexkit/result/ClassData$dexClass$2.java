package org.luckypray.dexkit.result;

import org.luckypray.dexkit.wrap.DexClass;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class ClassData$dexClass$2 extends AbstractC0308h implements InterfaceC0275a {
    final /* synthetic */ ClassData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassData$dexClass$2(ClassData classData) {
        super(0);
        this.this$0 = classData;
    }

    @Override // p029P0.InterfaceC0275a
    public final DexClass invoke() {
        return new DexClass(this.this$0.getDescriptor());
    }
}
