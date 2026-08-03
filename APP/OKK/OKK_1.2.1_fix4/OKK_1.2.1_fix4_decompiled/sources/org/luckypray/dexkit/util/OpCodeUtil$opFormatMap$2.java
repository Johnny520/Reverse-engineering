package org.luckypray.dexkit.util;

import java.util.LinkedHashMap;
import java.util.Map;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class OpCodeUtil$opFormatMap$2 extends AbstractC0308h implements InterfaceC0275a {
    public static final OpCodeUtil$opFormatMap$2 INSTANCE = new OpCodeUtil$opFormatMap$2();

    public OpCodeUtil$opFormatMap$2() {
        super(0);
    }

    @Override // p029P0.InterfaceC0275a
    public final Map<String, Integer> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArr = OpCodeUtil.opFormat;
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            linkedHashMap.put(strArr[i2], Integer.valueOf(i3));
            i2++;
            i3++;
        }
        return linkedHashMap;
    }
}
