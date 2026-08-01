package org.luckypray.dexkit.util;

import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC0184d9;
import p000.InterfaceC0279j5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class OpCodeUtil$opFormatMap$2 extends AbstractC0184d9 implements InterfaceC0279j5 {
    public static final OpCodeUtil$opFormatMap$2 INSTANCE = new OpCodeUtil$opFormatMap$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OpCodeUtil$opFormatMap$2() {
        super(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0279j5
    public final Map<String, Integer> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArr = OpCodeUtil.opFormat;
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            linkedHashMap.put(strArr[i], Integer.valueOf(i2));
            i++;
            i2++;
        }
        return linkedHashMap;
    }
}
