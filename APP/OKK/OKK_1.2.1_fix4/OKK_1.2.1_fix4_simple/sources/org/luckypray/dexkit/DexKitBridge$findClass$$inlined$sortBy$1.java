package org.luckypray.dexkit;

import java.util.Comparator;
import org.luckypray.dexkit.result.ClassData;
import p001A0.AbstractC0040p;

/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge$findClass$$inlined$sortBy$1<T> implements Comparator<T> {
    public DexKitBridge$findClass$$inlined$sortBy$1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T r1, T r2) {
        return AbstractC0040p.m112q(((ClassData) r1).getDescriptor(), ((ClassData) r2).getDescriptor());
    }
}
