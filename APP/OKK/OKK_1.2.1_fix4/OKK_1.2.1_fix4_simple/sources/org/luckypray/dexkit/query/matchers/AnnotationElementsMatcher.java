package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.AnnotationElementsMatcher;
import p007D0.C0138d;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p009E0.C0177h;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementsMatcher extends BaseQuery {
    public static final Companion Companion = null;
    private List<AnnotationElementMatcher> elementsMatcher;
    private MatchType matchType;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final AnnotationElementsMatcher create() {
            return new AnnotationElementsMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AnnotationElementsMatcher() {
        this.matchType = MatchType.Contains;
    }

    public static /* synthetic */ AnnotationElementsMatcher add$default(AnnotationElementsMatcher r02, String r1, AnnotationEncodeValueMatcher r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = null;
    L6:
        return r02.add(r1, r2);
    }

    public static /* synthetic */ AnnotationElementsMatcher count$default(AnnotationElementsMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.count(r1, r2);
    }

    public static final AnnotationElementsMatcher create() {
        return Companion.create();
    }

    public final AnnotationElementsMatcher add(String r3) {
        AbstractC0307g.m703e(r3, "name");
        return add$default(this, r3, null, 2, null);
    }

    public final AnnotationElementsMatcher count(int r2) {
        this.rangeMatcher = new IntRange(r2);
        return this;
    }

    public final AnnotationElementsMatcher countMax(int r3) {
        this.rangeMatcher = new IntRange(0, r3);
        return this;
    }

    public final AnnotationElementsMatcher countMin(int r3) {
        this.rangeMatcher = new IntRange(r3, Integer.MAX_VALUE);
        return this;
    }

    public final AnnotationElementsMatcher elements(Collection<AnnotationElementMatcher> r2) {
        AbstractC0307g.m703e(r2, "elements");
        this.elementsMatcher = AbstractC0181l.m541A0(r2);
        return this;
    }

    public final /* synthetic */ int getCount() {
        throw new C0138d();
    }

    public final List<AnnotationElementMatcher> getElementsMatcher() {
        return this.elementsMatcher;
    }

    public final MatchType getMatchType() {
        return this.matchType;
    }

    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r6) {
        AbstractC0307g.m703e(r6, "fbb");
        AnnotationElementsMatcher.Companion r02 = org.luckypray.dexkit.schema.AnnotationElementsMatcher.Companion;
        List<AnnotationElementMatcher> r1 = this.elementsMatcher;
        int r2 = 0;
        if (r1 == null) goto L9;
        ArrayList r3 = new ArrayList(AbstractC0183n.m559k0(r1, 10));
        Iterator<T> r12 = r1.iterator();
    L6:
        if (r12.hasNext() == false) goto L8;
        r3.add(Integer.valueOf(BaseQuery.access$innerBuild((AnnotationElementMatcher) r12.next(), r6)));
        goto L6
    L8:
        int r13 = r6.m1928k(AbstractC0181l.m552x0(r3));
    L10:
        byte r32 = this.matchType.getValue();
        IntRange r4 = this.rangeMatcher;
        if (r4 == null) goto L13;
        r2 = BaseQuery.access$innerBuild(r4, r6);
    L13:
        int r03 = r02.createAnnotationElementsMatcher(r6, r13, r32, r2);
        r6.m1931n(r03);
        return r03;
    L9:
        r13 = 0;
        goto L10
    }

    public final AnnotationElementsMatcher matchType(MatchType r2) {
        AbstractC0307g.m703e(r2, "matchType");
        this.matchType = r2;
        return this;
    }

    public final /* synthetic */ void setCount(int r1) {
        count(r1);
    }

    public final /* synthetic */ void setMatchType(MatchType r2) {
        AbstractC0307g.m703e(r2, "<set-?>");
        this.matchType = r2;
    }

    public final AnnotationElementsMatcher add(AnnotationElementMatcher r2) {
        AbstractC0307g.m703e(r2, "element");
        List<AnnotationElementMatcher> r02 = this.elementsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.elementsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final AnnotationElementsMatcher count(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        this.rangeMatcher = r2;
        return this;
    }

    public final AnnotationElementsMatcher elements(AnnotationElementMatcher... r4) {
        AbstractC0307g.m703e(r4, "elements");
        this.elementsMatcher = new ArrayList(new C0177h(r4, false));
        return this;
    }

    public final AnnotationElementsMatcher count(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        this.rangeMatcher = new IntRange(r2);
        return this;
    }

    public final AnnotationElementsMatcher add(String r8, AnnotationEncodeValueMatcher r9) {
        AbstractC0307g.m703e(r8, "name");
        AnnotationElementMatcher r02 = new AnnotationElementMatcher();
        AnnotationElementMatcher.name$default(r02, r8, null, false, 6, null);
        if (r9 == null) goto L5;
        r02.value(r9);
    L5:
        add(r02);
        return this;
    }

    public final AnnotationElementsMatcher count(int r2, int r3) {
        this.rangeMatcher = new IntRange(r2, r3);
        return this;
    }

    private final AnnotationElementsMatcher add(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationElementMatcher r02 = new AnnotationElementMatcher();
        r2.invoke(r02);
        add(r02);
        return this;
    }
}
