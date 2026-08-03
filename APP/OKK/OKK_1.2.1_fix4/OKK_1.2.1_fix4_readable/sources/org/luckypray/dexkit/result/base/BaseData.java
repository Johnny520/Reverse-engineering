package org.luckypray.dexkit.result.base;

import org.luckypray.dexkit.DexKitBridge;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseData {
    private final DexKitBridge bridge;
    private final int dexId;

    /* JADX INFO: renamed from: id */
    private final int f3860id;

    public BaseData(DexKitBridge dexKitBridge, int i2, int i3) {
        AbstractC0307g.m703e(dexKitBridge, "bridge");
        this.bridge = dexKitBridge;
        this.f3860id = i2;
        this.dexId = i3;
    }

    public final DexKitBridge getBridge() {
        return this.bridge;
    }

    public final DexKitBridge getBridge$dexkit_android_release() {
        return this.bridge;
    }

    public final int getDexId() {
        return this.dexId;
    }

    public final long getEncodeId(int i2, int i3) {
        return ((long) i3) | (((long) i2) << 32);
    }

    public final int getId() {
        return this.f3860id;
    }

    public final long getEncodeId() {
        int i2 = this.f3860id;
        if (i2 >= 0) {
            return getEncodeId(this.dexId, i2);
        }
        throw new IllegalStateException("not has id".toString());
    }

    public /* synthetic */ BaseData(DexKitBridge dexKitBridge, int i2, int i3, int i4, AbstractC0304d abstractC0304d) {
        this(dexKitBridge, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
