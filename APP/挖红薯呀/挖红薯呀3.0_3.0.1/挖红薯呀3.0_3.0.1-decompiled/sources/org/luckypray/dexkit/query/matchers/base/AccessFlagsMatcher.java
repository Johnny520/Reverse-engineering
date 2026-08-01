package org.luckypray.dexkit.query.matchers.base;

import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.MatchType;
import p000.AbstractC0619pl;
import p000.C0921xc;
import p000.C0938xt;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class AccessFlagsMatcher extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private MatchType matchType;
    private int modifiers;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AccessFlagsMatcher(int i, MatchType matchType) {
        matchType.getClass();
        MatchType matchType2 = MatchType.Contains;
        this.modifiers = i;
        this.matchType = matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MatchType getMatchType() {
        return this.matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getModifiers() {
        return this.modifiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) {
        c0938xt.getClass();
        int i = this.modifiers;
        if (i == 0) {
            C0921xc.m5131l("modifiers must not be 0");
            return 0;
        }
        int iM5668createAccessFlagsMatcherOsBMiQA = org.luckypray.dexkit.schema.AccessFlagsMatcher.Companion.m5668createAccessFlagsMatcherOsBMiQA(c0938xt, i, this.matchType.getValue());
        c0938xt.m5165n(iM5668createAccessFlagsMatcherOsBMiQA);
        return iM5668createAccessFlagsMatcherOsBMiQA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setMatchType(MatchType matchType) {
        matchType.getClass();
        this.matchType = matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setModifiers(int i) {
        this.modifiers = i;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ AccessFlagsMatcher create$default(Companion companion, int i, MatchType matchType, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                matchType = MatchType.Contains;
            }
            return companion.create(i, matchType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AccessFlagsMatcher create(int i, MatchType matchType) {
            matchType.getClass();
            return new AccessFlagsMatcher(i, matchType);
        }

        private Companion() {
        }

        public final AccessFlagsMatcher create(int i) {
            return create$default(this, i, null, 2, null);
        }
    }

    public AccessFlagsMatcher() {
        this.matchType = MatchType.Contains;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 int)
  (wrap:org.luckypray.dexkit.query.enums.MatchType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:org.luckypray.dexkit.query.enums.MatchType:0x0004: SGET  A[WRAPPED] (LINE:16) org.luckypray.dexkit.query.enums.MatchType.Contains org.luckypray.dexkit.query.enums.MatchType) : (r2v0 org.luckypray.dexkit.query.enums.MatchType))
 A[MD:(int, org.luckypray.dexkit.query.enums.MatchType):void (m)] (LINE:17) call: org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher.<init>(int, org.luckypray.dexkit.query.enums.MatchType):void type: THIS */
    public /* synthetic */ AccessFlagsMatcher(int i, MatchType matchType, int i2, AbstractC0619pl abstractC0619pl) {
        this(i, (i2 & 2) != 0 ? MatchType.Contains : matchType);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public AccessFlagsMatcher(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }
}
