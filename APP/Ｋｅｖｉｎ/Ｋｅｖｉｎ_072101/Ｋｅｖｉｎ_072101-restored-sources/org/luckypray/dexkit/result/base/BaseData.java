package org.luckypray.dexkit.result.base;

/* JADX INFO: compiled from: BaseData.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0000\b&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0010"}, m115d2 = {"Lorg/luckypray/dexkit/result/base/BaseData;", "", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "id", "", "dexId", "(Lorg/luckypray/dexkit/DexKitBridge;II)V", "getBridge", "()Lorg/luckypray/dexkit/DexKitBridge;", "getDexId", "()I", "getId", "getBridge$dexkit_android_release", "getEncodeId", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public abstract class BaseData {
    private final org.luckypray.dexkit.DexKitBridge bridge;
    private final int dexId;

    /* JADX INFO: renamed from: id */
    private final int f87id;

    public BaseData(org.luckypray.dexkit.DexKitBridge r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "bridge"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.bridge = r2
            r1.f87id = r3
            r1.dexId = r4
            return
    }

    public /* synthetic */ BaseData(org.luckypray.dexkit.DexKitBridge r2, int r3, int r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
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

    protected final org.luckypray.dexkit.DexKitBridge getBridge() {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r1.bridge
            return r0
    }

    public final org.luckypray.dexkit.DexKitBridge getBridge$dexkit_android_release() {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r1.bridge
            return r0
    }

    protected final int getDexId() {
            r1 = this;
            int r0 = r1.dexId
            return r0
    }

    public final long getEncodeId() {
            r2 = this;
            int r0 = r2.f87id
            if (r0 < 0) goto Ld
            int r0 = r2.dexId
            int r1 = r2.f87id
            long r0 = r2.getEncodeId(r0, r1)
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "not has id"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    protected final long getEncodeId(int r5, int r6) {
            r4 = this;
            long r0 = (long) r5
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r6
            long r0 = r0 | r2
            return r0
    }

    protected final int getId() {
            r1 = this;
            int r0 = r1.f87id
            return r0
    }
}
