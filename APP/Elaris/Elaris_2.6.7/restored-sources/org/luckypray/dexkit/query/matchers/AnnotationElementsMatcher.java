package org.luckypray.dexkit.query.matchers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.AnnotationElementsMatcher;
import p000.AbstractC0025b8;
import p000.AbstractC0241h2;
import p000.AbstractC0276j2;
import p000.AbstractC0431r2;
import p000.C0038c5;
import p000.C0042c9;
import p000.C0541y0;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementsMatcher extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private List<AnnotationElementMatcher> elementsMatcher;
    private MatchType matchType = MatchType.Contains;
    private IntRange rangeMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationElementsMatcher add$default(AnnotationElementsMatcher annotationElementsMatcher, String str, AnnotationEncodeValueMatcher annotationEncodeValueMatcher, int i, Object obj) {
        if ((i & 2) != 0) {
            annotationEncodeValueMatcher = null;
        }
        return annotationElementsMatcher.add(str, annotationEncodeValueMatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AnnotationElementsMatcher count$default(AnnotationElementsMatcher annotationElementsMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return annotationElementsMatcher.count(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AnnotationElementsMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementsMatcher add(String str, AnnotationEncodeValueMatcher annotationEncodeValueMatcher) {
        str.getClass();
        AnnotationElementMatcher annotationElementMatcher = new AnnotationElementMatcher();
        AnnotationElementMatcher.name$default(annotationElementMatcher, str, null, false, 6, null);
        if (annotationEncodeValueMatcher != null) {
            annotationElementMatcher.value(annotationEncodeValueMatcher);
        }
        add(annotationElementMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementsMatcher count(AbstractC0025b8 abstractC0025b8) {
        abstractC0025b8.getClass();
        this.rangeMatcher = new IntRange(abstractC0025b8);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementsMatcher countMax(int i) {
        this.rangeMatcher = new IntRange(0, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementsMatcher countMin(int i) {
        this.rangeMatcher = new IntRange(i, Integer.MAX_VALUE);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementsMatcher elements(AnnotationElementMatcher... annotationElementMatcherArr) {
        annotationElementMatcherArr.getClass();
        this.elementsMatcher = new ArrayList(new C0541y0(annotationElementMatcherArr));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ int getCount() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<AnnotationElementMatcher> getElementsMatcher() {
        return this.elementsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MatchType getMatchType() {
        return this.matchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) {
        int iM105k;
        c0038c5.getClass();
        AnnotationElementsMatcher.Companion companion = org.luckypray.dexkit.schema.AnnotationElementsMatcher.Companion;
        List<AnnotationElementMatcher> list = this.elementsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AnnotationElementMatcher) it.next()).build$dexkit_android_release(c0038c5)));
            }
            iM105k = c0038c5.m105k(AbstractC0241h2.m469l2(arrayList));
        } else {
            iM105k = 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateAnnotationElementsMatcher = companion.createAnnotationElementsMatcher(c0038c5, iM105k, value, intRange != null ? intRange.build$dexkit_android_release(c0038c5) : 0);
        c0038c5.m108n(iCreateAnnotationElementsMatcher);
        return iCreateAnnotationElementsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementsMatcher matchType(MatchType matchType) {
        matchType.getClass();
        this.matchType = matchType;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setMatchType(MatchType matchType) {
        matchType.getClass();
        this.matchType = matchType;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.AnnotationElementsMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationElementsMatcher create() {
            return new AnnotationElementsMatcher();
        }

        private Companion() {
        }
    }

    public final AnnotationElementsMatcher count(IntRange intRange) {
        intRange.getClass();
        this.rangeMatcher = intRange;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCount(I)V */
    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final AnnotationElementsMatcher setCount(int i) {
        this.rangeMatcher = new IntRange(i);
        return this;
    }

    public final AnnotationElementsMatcher count(int i, int i2) {
        this.rangeMatcher = new IntRange(i, i2);
        return this;
    }

    public final AnnotationElementsMatcher elements(Collection<AnnotationElementMatcher> collection) {
        collection.getClass();
        this.elementsMatcher = new ArrayList(collection);
        return this;
    }

    public final AnnotationElementsMatcher add(AnnotationElementMatcher annotationElementMatcher) {
        annotationElementMatcher.getClass();
        List<AnnotationElementMatcher> arrayList = this.elementsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.elementsMatcher = arrayList;
        arrayList.add(annotationElementMatcher);
        return this;
    }

    public final AnnotationElementsMatcher add(String str) {
        str.getClass();
        return add$default(this, str, null, 2, null);
    }

    public final /* synthetic */ AnnotationElementsMatcher add(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationElementMatcher annotationElementMatcher = new AnnotationElementMatcher();
        interfaceC0482u5.invoke(annotationElementMatcher);
        add(annotationElementMatcher);
        return this;
    }
}
