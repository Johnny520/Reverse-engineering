package org.luckypray.dexkit.query.matchers.base;

import Yue.C4335;
import Yue.C5458;
import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import com.google.flatbuffers.FlatBufferBuilder;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.base.BaseMatcher;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R*\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0005¨\u0006\u0018"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "", "value", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V", "min", "max", "(II)V", "LYue/ۥ۠ۥۣۨ;", "range", "(LYue/ۥ۠ۥۣۨ;)V", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "I", "getMin", "()I", "setMin", "getMax", "setMax", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class IntRange extends BaseMatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);
    private int max;
    private int min;

    @InterfaceC6211(m2698d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¨\u0006\t"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "value", "", "min", "max", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.IntRange.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public static /* synthetic */ IntRange create$default(Companion companion, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = Integer.MAX_VALUE;
            }
            return companion.create(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final IntRange create(int i) {
            return new IntRange(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        public final IntRange create(int i, int i2) {
            return new IntRange(i, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public IntRange(int i) {
        this.min = i;
        this.max = i;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        C5499.m17103(fbb, "fbb");
        int iCreateIntRange = org.luckypray.dexkit.schema.IntRange.INSTANCE.createIntRange(fbb, this.min, this.max);
        fbb.finish(iCreateIntRange);
        return iCreateIntRange;
    }

    public final /* synthetic */ void setMax(int i) {
        this.max = i;
    }

    public final /* synthetic */ void setMin(int i) {
        this.min = i;
    }

    public IntRange(int i, int i2) {
        this.min = i;
        this.max = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (Integer.MAX_VALUE int) : (r2v0 int))
 A[MD:(int, int):void (m)] (LINE:7) call: org.luckypray.dexkit.query.matchers.base.IntRange.<init>(int, int):void type: THIS */
    public /* synthetic */ IntRange(int i, int i2, int i3, C4335 c4335) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2);
    }

    public IntRange(@InterfaceC6399 C5458 c5458) {
        C5499.m17103(c5458, "range");
        this.max = Integer.MAX_VALUE;
        this.min = c5458.m16964();
        this.max = c5458.m16965();
    }
}
