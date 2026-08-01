package org.luckypray.dexkit.util;

import java.util.LinkedHashMap;
import java.util.Map;
import p000.InterfaceC0298hw;
import p000.c50;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class OpCodeUtil$opFormatMap$2 extends c50 implements InterfaceC0298hw {
    public static final OpCodeUtil$opFormatMap$2 INSTANCE = new OpCodeUtil$opFormatMap$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OpCodeUtil$opFormatMap$2() {
        super(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0298hw
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
