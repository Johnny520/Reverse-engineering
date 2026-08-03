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
    public static final Companion Companion = new Companion(null);
    private MatchType matchType = MatchType.Contains;
    private List<MethodMatcher> methodsMatcher;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final MethodsMatcher create() {
            return new MethodsMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public static /* synthetic */ MethodsMatcher count$default(MethodsMatcher methodsMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return methodsMatcher.count(i2, i3);
    }

    public static final MethodsMatcher create() {
        return Companion.create();
    }

    public final MethodsMatcher add(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "method");
        List<MethodMatcher> arrayList = this.methodsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.methodsMatcher = arrayList;
        arrayList.add(methodMatcher);
        return this;
    }

    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final MethodsMatcher setCount(int i2) {
        this.rangeMatcher = new IntRange(i2);
        return this;
    }

    public final MethodsMatcher countMax(int i2) {
        this.rangeMatcher = new IntRange(0, i2);
        return this;
    }

    public final MethodsMatcher countMin(int i2) {
        this.rangeMatcher = new IntRange(i2, Integer.MAX_VALUE);
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
    public int innerBuild(C0733b c0733b) {
        int iM1928k;
        AbstractC0307g.m703e(c0733b, "fbb");
        MethodsMatcher.Companion companion = org.luckypray.dexkit.schema.MethodsMatcher.Companion;
        List<MethodMatcher> list = this.methodsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((MethodMatcher) it.next()).innerBuild(c0733b)));
            }
            iM1928k = c0733b.m1928k(AbstractC0181l.m552x0(arrayList));
        } else {
            iM1928k = 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateMethodsMatcher = companion.createMethodsMatcher(c0733b, iM1928k, value, intRange != null ? intRange.innerBuild(c0733b) : 0);
        c0733b.m1931n(iCreateMethodsMatcher);
        return iCreateMethodsMatcher;
    }

    public final MethodsMatcher matchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public final MethodsMatcher methods(Collection<MethodMatcher> collection) {
        AbstractC0307g.m703e(collection, "methods");
        this.methodsMatcher = AbstractC0181l.m541A0(collection);
        return this;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "<set-?>");
        this.matchType = matchType;
    }

    public final MethodsMatcher count(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        this.rangeMatcher = intRange;
        return this;
    }

    private final MethodsMatcher add(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        add(methodMatcher);
        return this;
    }

    public final MethodsMatcher count(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        this.rangeMatcher = new IntRange(c0340c);
        return this;
    }

    public final MethodsMatcher count(int i2, int i3) {
        this.rangeMatcher = new IntRange(i2, i3);
        return this;
    }
}
