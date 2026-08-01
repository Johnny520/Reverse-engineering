package org.luckypray.dexkit.wrap;

import org.luckypray.dexkit.util.DexSignUtil;
import p000.InterfaceC0742sw;
import p000.c50;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DexMethod$getSign$1$1 extends c50 implements InterfaceC0742sw {
    public static final DexMethod$getSign$1$1 INSTANCE = new DexMethod$getSign$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexMethod$getSign$1$1() {
        super(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p000.InterfaceC0742sw
    public final CharSequence invoke(String str) {
        str.getClass();
        return DexSignUtil.getTypeSign(str);
    }
}
