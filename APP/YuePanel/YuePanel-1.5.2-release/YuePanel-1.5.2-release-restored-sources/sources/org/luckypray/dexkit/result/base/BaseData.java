package org.luckypray.dexkit.result.base;

import Yue.C4335;
import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import org.luckypray.dexkit.DexKitBridge;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0000\b&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0010"}, m2699d2 = {"Lorg/luckypray/dexkit/result/base/BaseData;", "", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", Name.MARK, "", "dexId", "(Lorg/luckypray/dexkit/DexKitBridge;II)V", "getBridge", "()Lorg/luckypray/dexkit/DexKitBridge;", "getDexId", "()I", "getId", "getBridge$dexkit_android_release", "getEncodeId", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public abstract class BaseData {

    @InterfaceC6399
    private final DexKitBridge bridge;
    private final int dexId;

    /* JADX INFO: renamed from: id */
    private final int f4235id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BaseData(@InterfaceC6399 DexKitBridge dexKitBridge, int i, int i2) {
        C5499.m17103(dexKitBridge, "bridge");
        this.bridge = dexKitBridge;
        this.f4235id = i;
        this.dexId = i2;
    }

    @InterfaceC6399
    public final DexKitBridge getBridge() {
        return this.bridge;
    }

    public final /* synthetic */ DexKitBridge getBridge$dexkit_android_release() {
        return this.bridge;
    }

    public final int getDexId() {
        return this.dexId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getEncodeId(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    public final int getId() {
        return this.f4235id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final long getEncodeId() {
        int i = this.f4235id;
        if (i >= 0) {
            return getEncodeId(this.dexId, i);
        }
        throw new IllegalStateException("not has id".toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 org.luckypray.dexkit.DexKitBridge)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
 A[MD:(org.luckypray.dexkit.DexKitBridge, int, int):void (m)] (LINE:5) call: org.luckypray.dexkit.result.base.BaseData.<init>(org.luckypray.dexkit.DexKitBridge, int, int):void type: THIS */
    public /* synthetic */ BaseData(DexKitBridge dexKitBridge, int i, int i2, int i3, C4335 c4335) {
        this(dexKitBridge, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2);
    }
}
