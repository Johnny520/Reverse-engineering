package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.MethodsMatcher;
import p007D0.C0138d;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class MethodsMatcher extends BaseQuery {
    public static final Companion Companion = null;
    private MatchType matchType;
    private List<MethodMatcher> methodsMatcher;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final MethodsMatcher create() {
            return new MethodsMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public MethodsMatcher() {
        this.matchType = MatchType.Contains;
    }

    public static /* synthetic */ MethodsMatcher count$default(MethodsMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.count(r1, r2);
    }

    public static final MethodsMatcher create() {
        return Companion.create();
    }

    public final MethodsMatcher add(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "method");
        List<MethodMatcher> r02 = this.methodsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.methodsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final MethodsMatcher count(int r2) {
        this.rangeMatcher = new IntRange(r2);
        return this;
    }

    public final MethodsMatcher countMax(int r3) {
        this.rangeMatcher = new IntRange(0, r3);
        return this;
    }

    public final MethodsMatcher countMin(int r3) {
        this.rangeMatcher = new IntRange(r3, Integer.MAX_VALUE);
        return this;
    }

    public final /* synthetic */ int getCount() {
        throw new C0138d();
    }

    public final MatchType getMatchType() {
        return this.matchType;
    }

    public final List<MethodMatcher> getMethodsMatcher() {
        return this.methodsMatcher;
    }

    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r6) {
        AbstractC0307g.m703e(r6, "fbb");
        MethodsMatcher.Companion r02 = org.luckypray.dexkit.schema.MethodsMatcher.Companion;
        List<MethodMatcher> r1 = this.methodsMatcher;
        int r2 = 0;
        if (r1 == null) goto L9;
        ArrayList r3 = new ArrayList(AbstractC0183n.m559k0(r1, 10));
        Iterator<T> r12 = r1.iterator();
    L6:
        if (r12.hasNext() == false) goto L8;
        r3.add(Integer.valueOf(BaseQuery.access$innerBuild((MethodMatcher) r12.next(), r6)));
        goto L6
    L8:
        int r13 = r6.m1928k(AbstractC0181l.m552x0(r3));
    L10:
        byte r32 = this.matchType.getValue();
        IntRange r4 = this.rangeMatcher;
        if (r4 == null) goto L13;
        r2 = BaseQuery.access$innerBuild(r4, r6);
    L13:
        int r03 = r02.createMethodsMatcher(r6, r13, r32, r2);
        r6.m1931n(r03);
        return r03;
    L9:
        r13 = 0;
        goto L10
    }

    public final MethodsMatcher matchType(MatchType r2) {
        AbstractC0307g.m703e(r2, "matchType");
        this.matchType = r2;
        return this;
    }

    public final MethodsMatcher methods(Collection<MethodMatcher> r2) {
        AbstractC0307g.m703e(r2, "methods");
        this.methodsMatcher = AbstractC0181l.m541A0(r2);
        return this;
    }

    public final /* synthetic */ void setCount(int r1) {
        count(r1);
    }

    public final /* synthetic */ void setMatchType(MatchType r2) {
        AbstractC0307g.m703e(r2, "<set-?>");
        this.matchType = r2;
    }

    public final MethodsMatcher count(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        this.rangeMatcher = r2;
        return this;
    }

    private final MethodsMatcher add(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        add(r02);
        return this;
    }

    public final MethodsMatcher count(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        this.rangeMatcher = new IntRange(r2);
        return this;
    }

    public final MethodsMatcher count(int r2, int r3) {
        this.rangeMatcher = new IntRange(r2, r3);
        return this;
    }
}
