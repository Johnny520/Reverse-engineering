package org.luckypray.dexkit.result.base;

import org.luckypray.dexkit.DexKitBridge;
import p000.AbstractC0431r2;
import p000.C0479u2;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseData {
    private final DexKitBridge bridge;
    private final int dexId;

    /* JADX INFO: renamed from: id */
    private final int f666id;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 org.luckypray.dexkit.DexKitBridge)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (-1 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (-1 int) : (r4v0 int))
 A[MD:(org.luckypray.dexkit.DexKitBridge, int, int):void (m)] (LINE:12) call: org.luckypray.dexkit.result.base.BaseData.<init>(org.luckypray.dexkit.DexKitBridge, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ BaseData(DexKitBridge dexKitBridge, int i, int i2, int i3, AbstractC0431r2 abstractC0431r2) {
        this(dexKitBridge, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final DexKitBridge getBridge() {
        return this.bridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ DexKitBridge getBridge$dexkit_android_release() {
        return this.bridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getDexId() {
        return this.dexId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getEncodeId() {
        int i = this.f666id;
        if (i >= 0) {
            return getEncodeId(this.dexId, i);
        }
        C0479u2.m1037b("not has id");
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getId() {
        return this.f666id;
    }

    public BaseData(DexKitBridge dexKitBridge, int i, int i2) {
        dexKitBridge.getClass();
        this.bridge = dexKitBridge;
        this.f666id = i;
        this.dexId = i2;
    }

    public final long getEncodeId(int i, int i2) {
        return (((long) i) << 32) | ((long) i2);
    }
}
