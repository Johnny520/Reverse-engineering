package org.luckypray.dexkit.util;

import Yue.AbstractC5673;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, m2699d2 = {"<anonymous>", "", "", "", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
@InterfaceC7507({"SMAP\nOpCodeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpCodeUtil.kt\norg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,320:1\n13601#2,3:321\n*S KotlinDebug\n*F\n+ 1 OpCodeUtil.kt\norg/luckypray/dexkit/util/OpCodeUtil$opFormatMap$2\n*L\n288#1:321,3\n*E\n"})
public final class OpCodeUtil$opFormatMap$2 extends AbstractC5673 implements InterfaceC5122<Map<String, Integer>> {
    public static final OpCodeUtil$opFormatMap$2 INSTANCE = new OpCodeUtil$opFormatMap$2();

    public OpCodeUtil$opFormatMap$2() {
        super(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // Yue.InterfaceC5122
    @InterfaceC6399
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
