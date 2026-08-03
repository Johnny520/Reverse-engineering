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
    public static final Companion Companion = new Companion(null);
    private List<AnnotationElementMatcher> elementsMatcher;
    private MatchType matchType = MatchType.Contains;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final AnnotationElementsMatcher create() {
            return new AnnotationElementsMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public static /* synthetic */ AnnotationElementsMatcher add$default(AnnotationElementsMatcher annotationElementsMatcher, String str, AnnotationEncodeValueMatcher annotationEncodeValueMatcher, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            annotationEncodeValueMatcher = null;
        }
        return annotationElementsMatcher.add(str, annotationEncodeValueMatcher);
    }

    public static /* synthetic */ AnnotationElementsMatcher count$default(AnnotationElementsMatcher annotationElementsMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return annotationElementsMatcher.count(i2, i3);
    }

    public static final AnnotationElementsMatcher create() {
        return Companion.create();
    }

    public final AnnotationElementsMatcher add(String str) {
        AbstractC0307g.m703e(str, "name");
        return add$default(this, str, null, 2, null);
    }

    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final AnnotationElementsMatcher setCount(int i2) {
        this.rangeMatcher = new IntRange(i2);
        return this;
    }

    public final AnnotationElementsMatcher countMax(int i2) {
        this.rangeMatcher = new IntRange(0, i2);
        return this;
    }

    public final AnnotationElementsMatcher countMin(int i2) {
        this.rangeMatcher = new IntRange(i2, Integer.MAX_VALUE);
        return this;
    }

    public final AnnotationElementsMatcher elements(Collection<AnnotationElementMatcher> collection) {
        AbstractC0307g.m703e(collection, "elements");
        this.elementsMatcher = AbstractC0181l.m541A0(collection);
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
    public int innerBuild(C0733b c0733b) {
        int iM1928k;
        AbstractC0307g.m703e(c0733b, "fbb");
        AnnotationElementsMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationElementsMatcher.Companion;
        List<AnnotationElementMatcher> list = this.elementsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AnnotationElementMatcher) it.next()).innerBuild(c0733b)));
            }
            iM1928k = c0733b.m1928k(AbstractC0181l.m552x0(arrayList));
        } else {
            iM1928k = 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateAnnotationElementsMatcher = companion.createAnnotationElementsMatcher(c0733b, iM1928k, value, intRange != null ? intRange.innerBuild(c0733b) : 0);
        c0733b.m1931n(iCreateAnnotationElementsMatcher);
        return iCreateAnnotationElementsMatcher;
    }

    public final AnnotationElementsMatcher matchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "<set-?>");
        this.matchType = matchType;
    }

    public final AnnotationElementsMatcher add(AnnotationElementMatcher annotationElementMatcher) {
        AbstractC0307g.m703e(annotationElementMatcher, "element");
        List<AnnotationElementMatcher> arrayList = this.elementsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.elementsMatcher = arrayList;
        arrayList.add(annotationElementMatcher);
        return this;
    }

    public final AnnotationElementsMatcher count(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        this.rangeMatcher = intRange;
        return this;
    }

    public final AnnotationElementsMatcher elements(AnnotationElementMatcher... annotationElementMatcherArr) {
        AbstractC0307g.m703e(annotationElementMatcherArr, "elements");
        this.elementsMatcher = new ArrayList(new C0177h(annotationElementMatcherArr, false));
        return this;
    }

    public final AnnotationElementsMatcher count(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        this.rangeMatcher = new IntRange(c0340c);
        return this;
    }

    public final AnnotationElementsMatcher add(String str, AnnotationEncodeValueMatcher annotationEncodeValueMatcher) {
        AbstractC0307g.m703e(str, "name");
        AnnotationElementMatcher annotationElementMatcher = new AnnotationElementMatcher();
        AnnotationElementMatcher.name$default(annotationElementMatcher, str, null, false, 6, null);
        if (annotationEncodeValueMatcher != null) {
            annotationElementMatcher.value(annotationEncodeValueMatcher);
        }
        add(annotationElementMatcher);
        return this;
    }

    public final AnnotationElementsMatcher count(int i2, int i3) {
        this.rangeMatcher = new IntRange(i2, i3);
        return this;
    }

    private final AnnotationElementsMatcher add(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationElementMatcher annotationElementMatcher = new AnnotationElementMatcher();
        interfaceC0286l.invoke(annotationElementMatcher);
        add(annotationElementMatcher);
        return this;
    }
}
