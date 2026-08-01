package org.luckypray.dexkit.result.base;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseData {
    private final org.luckypray.dexkit.DexKitBridge bridge;
    private final int dexId;

    /* JADX INFO: renamed from: id */
    private final int f8191id;

    public BaseData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.bridge = r1
            r0.f8191id = r2
            r0.dexId = r3
            return
    }

    public /* synthetic */ BaseData(org.luckypray.dexkit.DexKitBridge r2, int r3, int r4, int r5, p000.AbstractC1067zq r6) {
            r1 = this;
            r6 = r5 & 2
            r0 = -1
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            r1.<init>(r2, r3, r4)
            return
    }

    public final org.luckypray.dexkit.DexKitBridge getBridge() {
            r0 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r0.bridge
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge getBridge$dexkit_android_release() {
            r0 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r0.bridge
            return r0
    }

    public final int getDexId() {
            r0 = this;
            int r0 = r0.dexId
            return r0
    }

    public final long getEncodeId() {
            r2 = this;
            int r0 = r2.f8191id
            if (r0 < 0) goto Lb
            int r1 = r2.dexId
            long r0 = r2.getEncodeId(r1, r0)
            return r0
        Lb:
            java.lang.String r2 = "not has id"
            p000.C1080.m7279(r2)
            r0 = 0
            return r0
    }

    public final long getEncodeId(int r3, int r4) {
            r2 = this;
            long r2 = (long) r3
            r0 = 32
            long r2 = r2 << r0
            long r0 = (long) r4
            long r2 = r2 | r0
            return r2
    }

    public final int getId() {
            r0 = this;
            int r0 = r0.f8191id
            return r0
    }
}
