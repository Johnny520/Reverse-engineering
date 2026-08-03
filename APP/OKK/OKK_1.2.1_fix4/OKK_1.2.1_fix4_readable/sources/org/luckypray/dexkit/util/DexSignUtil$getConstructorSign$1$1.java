package org.luckypray.dexkit.util;

import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class DexSignUtil$getConstructorSign$1$1 extends AbstractC0308h implements InterfaceC0286l {
    public static final DexSignUtil$getConstructorSign$1$1 INSTANCE = new DexSignUtil$getConstructorSign$1$1();

    public DexSignUtil$getConstructorSign$1$1() {
        super(1);
    }

    @Override // p029P0.InterfaceC0286l
    public final CharSequence invoke(Class<?> cls) {
        AbstractC0307g.m702d(cls, "it");
        return DexSignUtil.getTypeSign(cls);
    }
}
