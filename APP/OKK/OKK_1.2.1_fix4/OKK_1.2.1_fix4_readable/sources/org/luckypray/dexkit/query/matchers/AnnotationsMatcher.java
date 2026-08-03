package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.AnnotationsMatcher;
import p007D0.C0138d;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationsMatcher extends BaseQuery {
    public static final Companion Companion = new Companion(null);
    private List<AnnotationMatcher> annotationsMatcher;
    private MatchType matchType = MatchType.Contains;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final AnnotationsMatcher create() {
            return new AnnotationsMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public static /* synthetic */ AnnotationsMatcher count$default(AnnotationsMatcher annotationsMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return annotationsMatcher.count(i2, i3);
    }

    public static final AnnotationsMatcher create() {
        return Companion.create();
    }

    public final AnnotationsMatcher add(AnnotationMatcher annotationMatcher) {
        AbstractC0307g.m703e(annotationMatcher, "annotation");
        List<AnnotationMatcher> arrayList = this.annotationsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.annotationsMatcher = arrayList;
        arrayList.add(annotationMatcher);
        return this;
    }

    public final AnnotationsMatcher annotations(Collection<AnnotationMatcher> collection) {
        AbstractC0307g.m703e(collection, "annotations");
        this.annotationsMatcher = AbstractC0181l.m541A0(collection);
        return this;
    }

    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final AnnotationsMatcher setCount(int i2) {
        this.rangeMatcher = new IntRange(i2);
        return this;
    }

    public final AnnotationsMatcher countMax(int i2) {
        this.rangeMatcher = new IntRange(0, i2);
        return this;
    }

    public final AnnotationsMatcher countMin(int i2) {
        this.rangeMatcher = new IntRange(i2, Integer.MAX_VALUE);
        return this;
    }

    public final List<AnnotationMatcher> getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    public final /* synthetic */ int getCount() {
        throw new C0138d();
    }

    public final MatchType getMatchType() {
        return this.matchType;
    }

    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        int iM1928k;
        AbstractC0307g.m703e(c0733b, "fbb");
        AnnotationsMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationsMatcher.Companion;
        List<AnnotationMatcher> list = this.annotationsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AnnotationMatcher) it.next()).innerBuild(c0733b)));
            }
            iM1928k = c0733b.m1928k(AbstractC0181l.m552x0(arrayList));
        } else {
            iM1928k = 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateAnnotationsMatcher = companion.createAnnotationsMatcher(c0733b, iM1928k, value, intRange != null ? intRange.innerBuild(c0733b) : 0);
        c0733b.m1931n(iCreateAnnotationsMatcher);
        return iCreateAnnotationsMatcher;
    }

    public final AnnotationsMatcher matchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "<set-?>");
        this.matchType = matchType;
    }

    public final AnnotationsMatcher count(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        this.rangeMatcher = intRange;
        return this;
    }

    private final AnnotationsMatcher add(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0286l.invoke(annotationMatcher);
        add(annotationMatcher);
        return this;
    }

    public final AnnotationsMatcher count(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        this.rangeMatcher = new IntRange(c0340c);
        return this;
    }

    public final AnnotationsMatcher count(int i2, int i3) {
        this.rangeMatcher = new IntRange(i2, i3);
        return this;
    }
}
