package org.luckypray.dexkit;

import java.util.Comparator;
import org.luckypray.dexkit.result.FieldData;
import p001A0.AbstractC0040p;

/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge$findField$$inlined$sortBy$1<T> implements Comparator<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t2, T t3) {
        return AbstractC0040p.m112q(((FieldData) t2).getDescriptor(), ((FieldData) t3).getDescriptor());
    }
}
