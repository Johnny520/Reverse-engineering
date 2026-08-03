package org.luckypray.dexkit.query.matchers.base;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.MatchType;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class AccessFlagsMatcher extends BaseQuery {
    public static final Companion Companion = new Companion(null);
    private MatchType matchType;
    private int modifiers;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ AccessFlagsMatcher create$default(Companion companion, int i2, MatchType matchType, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                matchType = MatchType.Contains;
            }
            return companion.create(i2, matchType);
        }

        public final AccessFlagsMatcher create(int i2) {
            return create$default(this, i2, null, 2, null);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final AccessFlagsMatcher create(int i2, MatchType matchType) {
            AbstractC0307g.m703e(matchType, "matchType");
            return new AccessFlagsMatcher(i2, matchType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccessFlagsMatcher(int i2) {
        this(i2, null, 2, 0 == true ? 1 : 0);
    }

    public final MatchType getMatchType() {
        return this.matchType;
    }

    public final int getModifiers() {
        return this.modifiers;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        int i2 = this.modifiers;
        if (i2 == 0) {
            throw new IllegalArgumentException("modifiers must not be 0");
        }
        int iM2676createAccessFlagsMatcherOsBMiQA = org.luckypray.dexkit.schema.AccessFlagsMatcher.Companion.m2676createAccessFlagsMatcherOsBMiQA(c0733b, i2, this.matchType.getValue());
        c0733b.m1931n(iM2676createAccessFlagsMatcherOsBMiQA);
        return iM2676createAccessFlagsMatcherOsBMiQA;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "<set-?>");
        this.matchType = matchType;
    }

    public final /* synthetic */ void setModifiers(int i2) {
        this.modifiers = i2;
    }

    public AccessFlagsMatcher() {
        this.matchType = MatchType.Contains;
    }

    public /* synthetic */ AccessFlagsMatcher(int i2, MatchType matchType, int i3, AbstractC0304d abstractC0304d) {
        this(i2, (i3 & 2) != 0 ? MatchType.Contains : matchType);
    }

    public AccessFlagsMatcher(int i2, MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        MatchType matchType2 = MatchType.Contains;
        this.modifiers = i2;
        this.matchType = matchType;
    }
}
