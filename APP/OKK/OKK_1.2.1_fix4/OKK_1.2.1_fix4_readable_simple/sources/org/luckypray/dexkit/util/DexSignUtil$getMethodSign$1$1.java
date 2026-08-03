package org.luckypray.dexkit.util;

import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class DexSignUtil$getMethodSign$1$1 extends AbstractC0308h implements InterfaceC0286l {
    public static final DexSignUtil$getMethodSign$1$1 INSTANCE = null;

    static {
        INSTANCE = new DexSignUtil$getMethodSign$1$1();
    }

    public DexSignUtil$getMethodSign$1$1() {
        super(1);
    }

    public final CharSequence invoke(Class<?> r2) {
        AbstractC0307g.m702d(r2, "it");
        return DexSignUtil.getTypeSign(r2);
    }

    @Override // p029P0.InterfaceC0286l
    public /* bridge */ /* synthetic */ Object invoke(Object r1) {
        return invoke((Class) r1);
    }
}
