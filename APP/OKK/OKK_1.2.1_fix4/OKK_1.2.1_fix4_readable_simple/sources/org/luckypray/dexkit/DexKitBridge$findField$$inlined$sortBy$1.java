package org.luckypray.dexkit;

import java.util.Comparator;
import org.luckypray.dexkit.result.FieldData;
import p001A0.AbstractC0040p;

/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge$findField$$inlined$sortBy$1<T> implements Comparator<T> {
    public DexKitBridge$findField$$inlined$sortBy$1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T r1, T r2) {
        return AbstractC0040p.m112q(((FieldData) r1).getDescriptor(), ((FieldData) r2).getDescriptor());
    }
}
