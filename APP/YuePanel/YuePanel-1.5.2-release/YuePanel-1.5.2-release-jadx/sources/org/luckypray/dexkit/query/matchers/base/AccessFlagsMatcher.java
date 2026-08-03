package org.luckypray.dexkit.query.matchers.base;

import Yue.C4335;
import Yue.C5499;
import Yue.C8057;
import Yue.InterfaceC5573;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import com.google.flatbuffers.FlatBufferBuilder;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.MatchType;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "()V", "modifiers", "", "matchType", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(ILorg/luckypray/dexkit/query/enums/MatchType;)V", "<set-?>", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/MatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/MatchType;)V", "getModifiers", "()I", "setModifiers", "(I)V", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class AccessFlagsMatcher extends BaseMatcher {

    @InterfaceC6399
    public static final Companion Companion = new Companion(null);

    @InterfaceC6399
    private MatchType matchType;
    private int modifiers;

    @InterfaceC6211(m2698d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiers", "", "matchType", "Lorg/luckypray/dexkit/query/enums/MatchType;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        public static /* synthetic */ AccessFlagsMatcher create$default(Companion companion, int i, MatchType matchType, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                matchType = MatchType.Contains;
            }
            return companion.create(i, matchType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5573
        public final AccessFlagsMatcher create(int i) {
            return create$default(this, i, null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5573
        public final AccessFlagsMatcher create(int i, @InterfaceC6399 MatchType matchType) {
            C5499.m17103(matchType, "matchType");
            return new AccessFlagsMatcher(i, matchType);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5573
    public AccessFlagsMatcher(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    @InterfaceC6399
    public final MatchType getMatchType() {
        return this.matchType;
    }

    public final int getModifiers() {
        return this.modifiers;
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder flatBufferBuilder) {
        C5499.m17103(flatBufferBuilder, "fbb");
        int i = this.modifiers;
        if (i == 0) {
            throw new IllegalArgumentException("modifiers must not be 0");
        }
        int iM31156createAccessFlagsMatcherOsBMiQA = org.luckypray.dexkit.schema.AccessFlagsMatcher.INSTANCE.m31156createAccessFlagsMatcherOsBMiQA(flatBufferBuilder, C8057.m26318(i), this.matchType.getValue());
        flatBufferBuilder.finish(iM31156createAccessFlagsMatcherOsBMiQA);
        return iM31156createAccessFlagsMatcherOsBMiQA;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        C5499.m17103(matchType, "<set-?>");
        this.matchType = matchType;
    }

    public final /* synthetic */ void setModifiers(int i) {
        this.modifiers = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AccessFlagsMatcher() {
        this.matchType = MatchType.Contains;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 int)
  (wrap:org.luckypray.dexkit.query.enums.MatchType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.MatchType:0x0004: SGET  A[WRAPPED] (LINE:4) org.luckypray.dexkit.query.enums.MatchType.Contains org.luckypray.dexkit.query.enums.MatchType) : (r2v0 org.luckypray.dexkit.query.enums.MatchType))
 A[MD:(int, org.luckypray.dexkit.query.enums.MatchType):void (m)] (LINE:5) call: org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher.<init>(int, org.luckypray.dexkit.query.enums.MatchType):void type: THIS */
    public /* synthetic */ AccessFlagsMatcher(int i, MatchType matchType, int i2, C4335 c4335) {
        this(i, (i2 & 2) != 0 ? MatchType.Contains : matchType);
    }

    @InterfaceC5573
    public AccessFlagsMatcher(int i, @InterfaceC6399 MatchType matchType) {
        C5499.m17103(matchType, "matchType");
        MatchType matchType2 = MatchType.Contains;
        this.modifiers = i;
        this.matchType = matchType;
    }
}
