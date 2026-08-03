package org.luckypray.dexkit.query.matchers.base;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.MatchType;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class AccessFlagsMatcher extends BaseQuery {
    public static final Companion Companion = null;
    private MatchType matchType;
    private int modifiers;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ AccessFlagsMatcher create$default(Companion r02, int r1, MatchType r2, int r3, Object r4) {
            if ((r3 & 2) == 0) goto L6;
            r2 = MatchType.Contains;
        L6:
            return r02.create(r1, r2);
        }

        public final AccessFlagsMatcher create(int r3) {
            return create$default(this, r3, null, 2, null);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final AccessFlagsMatcher create(int r2, MatchType r3) {
            AbstractC0307g.m703e(r3, "matchType");
            return new AccessFlagsMatcher(r2, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccessFlagsMatcher(int r3) {
        this(r3, null, 2, 0 == true ? 1 : 0);
    }

    public final MatchType getMatchType() {
        return this.matchType;
    }

    public final int getModifiers() {
        return this.modifiers;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r4) {
        AbstractC0307g.m703e(r4, "fbb");
        int r02 = this.modifiers;
        if (r02 == 0) goto L7;
        int r03 = org.luckypray.dexkit.schema.AccessFlagsMatcher.Companion.m2676createAccessFlagsMatcherOsBMiQA(r4, r02, this.matchType.getValue());
        r4.m1931n(r03);
        return r03;
    L7:
        throw new IllegalArgumentException("modifiers must not be 0");
    }

    public final /* synthetic */ void setMatchType(MatchType r2) {
        AbstractC0307g.m703e(r2, "<set-?>");
        this.matchType = r2;
    }

    public final /* synthetic */ void setModifiers(int r1) {
        this.modifiers = r1;
    }

    public AccessFlagsMatcher() {
        this.matchType = MatchType.Contains;
    }

    public /* synthetic */ AccessFlagsMatcher(int r1, MatchType r2, int r3, AbstractC0304d r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = MatchType.Contains;
    L5:
        this(r1, r2);
    }

    public AccessFlagsMatcher(int r2, MatchType r3) {
        AbstractC0307g.m703e(r3, "matchType");
        MatchType r02 = MatchType.Contains;
        this.modifiers = r2;
        this.matchType = r3;
    }
}
