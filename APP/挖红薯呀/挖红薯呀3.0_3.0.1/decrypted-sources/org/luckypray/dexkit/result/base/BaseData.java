package org.luckypray.dexkit.result.base;

import org.luckypray.dexkit.DexKitBridge;
import p000.AbstractC0619pl;
import p000.C0921xc;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseData {
    private final DexKitBridge bridge;
    private final int dexId;

    /* JADX INFO: renamed from: id */
    private final int f4615id;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 org.luckypray.dexkit.DexKitBridge)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (-1 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (-1 int) : (r4v0 int))
 A[MD:(org.luckypray.dexkit.DexKitBridge, int, int):void (m)] (LINE:12) call: org.luckypray.dexkit.result.base.BaseData.<init>(org.luckypray.dexkit.DexKitBridge, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ BaseData(DexKitBridge dexKitBridge, int i, int i2, int i3, AbstractC0619pl abstractC0619pl) {
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
        int i = this.f4615id;
        if (i >= 0) {
            return getEncodeId(this.dexId, i);
        }
        C0921xc.m5134o("not has id");
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getId() {
        return this.f4615id;
    }

    public BaseData(DexKitBridge dexKitBridge, int i, int i2) {
        dexKitBridge.getClass();
        this.bridge = dexKitBridge;
        this.f4615id = i;
        this.dexId = i2;
    }

    public final long getEncodeId(int i, int i2) {
        return (((long) i) << 32) | ((long) i2);
    }
}
