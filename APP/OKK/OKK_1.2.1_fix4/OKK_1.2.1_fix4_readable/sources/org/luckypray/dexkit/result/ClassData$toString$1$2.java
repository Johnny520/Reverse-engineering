package org.luckypray.dexkit.result;

import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class ClassData$toString$1$2 extends AbstractC0308h implements InterfaceC0286l {
    public static final ClassData$toString$1$2 INSTANCE = new ClassData$toString$1$2();

    public ClassData$toString$1$2() {
        super(1);
    }

    @Override // p029P0.InterfaceC0286l
    public final CharSequence invoke(ClassData classData) {
        AbstractC0307g.m703e(classData, "it");
        return classData.getName();
    }
}
