package org.luckypray.dexkit.util;

import java.util.LinkedHashMap;
import java.util.Map;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0308h;

/* JADX INFO: loaded from: classes.dex */
public final class OpCodeUtil$opFormatMap$2 extends AbstractC0308h implements InterfaceC0275a {
    public static final OpCodeUtil$opFormatMap$2 INSTANCE = null;

    static {
        INSTANCE = new OpCodeUtil$opFormatMap$2();
    }

    public OpCodeUtil$opFormatMap$2() {
        super(0);
    }

    @Override // p029P0.InterfaceC0275a
    public /* bridge */ /* synthetic */ Object invoke() {
        return invoke();
    }

    @Override // p029P0.InterfaceC0275a
    public final Map<String, Integer> invoke() {
        LinkedHashMap r02 = new LinkedHashMap();
        String[] r1 = OpCodeUtil.access$getOpFormat$p();
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L5;
        r02.put(r1[r3], Integer.valueOf(r4));
        r3 = r3 + 1;
        r4 = r4 + 1;
        goto L3
    L5:
        return r02;
    }
}
