package org.luckypray.dexkit.wrap;

import Yue.AbstractC5673;
import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import org.luckypray.dexkit.util.DexSignUtil;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m2699d2 = {"<anonymous>", "", "it", "", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class DexMethod$getSign$1$1 extends AbstractC5673 implements InterfaceC5124<String, CharSequence> {
    public static final DexMethod$getSign$1$1 INSTANCE = new DexMethod$getSign$1$1();

    public DexMethod$getSign$1$1() {
        super(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // Yue.InterfaceC5124
    @InterfaceC6399
    public final CharSequence invoke(@InterfaceC6399 String str) {
        C5499.m17103(str, "it");
        return DexSignUtil.getTypeSign(str);
    }
}
