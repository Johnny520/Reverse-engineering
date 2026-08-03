package org.luckypray.dexkit;

import java.util.Comparator;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;

/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1<T> implements Comparator<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t2, T t3) {
        return AbstractC0040p.m112q(((MethodData) t2).getDescriptor(), ((MethodData) t3).getDescriptor());
    }
}
