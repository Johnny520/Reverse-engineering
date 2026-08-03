package org.luckypray.dexkit;

import java.util.Comparator;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;

/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge$findMethod$$inlined$sortBy$1<T> implements Comparator<T> {
    public DexKitBridge$findMethod$$inlined$sortBy$1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T r1, T r2) {
        return AbstractC0040p.m112q(((MethodData) r1).getDescriptor(), ((MethodData) r2).getDescriptor());
    }
}
