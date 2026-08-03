package com.google.android.material.color.utilities;

import Yue.InterfaceC7144;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class QuantizerCelebi {
    private QuantizerCelebi() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int i) {
        Set<Integer> setKeySet = new QuantizerWu().quantize(iArr, i).colorToCount.keySet();
        int[] iArr2 = new int[setKeySet.size()];
        Iterator<Integer> it = setKeySet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr2[i2] = it.next().intValue();
            i2++;
        }
        return QuantizerWsmeans.quantize(iArr, iArr2, i);
    }
}
