package org.luckypray.dexkit.wrap;

import org.luckypray.dexkit.util.DexSignUtil;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class DexMethod$getSign$1$1 extends AbstractC0308h implements InterfaceC0286l {
    public static final DexMethod$getSign$1$1 INSTANCE = new DexMethod$getSign$1$1();

    public DexMethod$getSign$1$1() {
        super(1);
    }

    @Override // p029P0.InterfaceC0286l
    public final CharSequence invoke(String str) {
        AbstractC0307g.m703e(str, "it");
        return DexSignUtil.getTypeSign(str);
    }
}
