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

    public BaseData(DexKitBridge r2, int r3, int r4) {
        AbstractC0307g.m703e(r2, "bridge");
        this.bridge = r2;
        this.f3860id = r3;
        this.dexId = r4;
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

    public final long getEncodeId(int r3, int r4) {
        long r02 = ((long) r3) << 32;
        return ((long) r4) | r02;
    }

    public final int getId() {
        return this.f3860id;
    }

    public final long getEncodeId() {
        int r02 = this.f3860id;
        if (r02 < 0) goto L7;
        return getEncodeId(this.dexId, r02);
    L7:
        throw new IllegalStateException("not has id".toString());
    }

    public /* synthetic */ BaseData(DexKitBridge r2, int r3, int r4, int r5, AbstractC0304d r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = -1;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r4 = -1;
    L8:
        this(r2, r3, r4);
    }
}
