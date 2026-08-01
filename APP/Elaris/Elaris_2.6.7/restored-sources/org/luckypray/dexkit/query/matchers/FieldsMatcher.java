package org.luckypray.dexkit.query.matchers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.FieldsMatcher;
import p000.AbstractC0025b8;
import p000.AbstractC0241h2;
import p000.AbstractC0276j2;
import p000.AbstractC0431r2;
import p000.C0038c5;
import p000.C0042c9;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldsMatcher extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private List<FieldMatcher> fieldsMatcher;
    private MatchType matchType = MatchType.Contains;
    private IntRange rangeMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ FieldsMatcher addForType$default(FieldsMatcher fieldsMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldsMatcher.addForType(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ FieldsMatcher count$default(FieldsMatcher fieldsMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return fieldsMatcher.count(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FieldsMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldsMatcher add(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        List<FieldMatcher> arrayList = this.fieldsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.fieldsMatcher = arrayList;
        arrayList.add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldsMatcher addForName(String str) {
        str.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        FieldMatcher.name$default(fieldMatcher, str, null, false, 6, null);
        add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldsMatcher addForType(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.type(str, stringMatchType, z);
        add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldsMatcher count(AbstractC0025b8 abstractC0025b8) {
        abstractC0025b8.getClass();
        this.rangeMatcher = new IntRange(abstractC0025b8);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldsMatcher countMax(int i) {
        this.rangeMatcher = new IntRange(0, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldsMatcher countMin(int i) {
        this.rangeMatcher = new IntRange(i, Integer.MAX_VALUE);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldsMatcher fields(Collection<FieldMatcher> collection) {
        collection.getClass();
        this.fieldsMatcher = new ArrayList(collection);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ int getCount() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<FieldMatcher> getFieldsMatcher() {
        return this.fieldsMatcher;
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
        FieldsMatcher.Companion companion = org.luckypray.dexkit.schema.FieldsMatcher.Companion;
        List<FieldMatcher> list = this.fieldsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((FieldMatcher) it.next()).build$dexkit_android_release(c0038c5)));
            }
            iM105k = c0038c5.m105k(AbstractC0241h2.m469l2(arrayList));
        } else {
            iM105k = 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateFieldsMatcher = companion.createFieldsMatcher(c0038c5, iM105k, value, intRange != null ? intRange.build$dexkit_android_release(c0038c5) : 0);
        c0038c5.m108n(iCreateFieldsMatcher);
        return iCreateFieldsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldsMatcher matchType(MatchType matchType) {
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.FieldsMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FieldsMatcher create() {
            return new FieldsMatcher();
        }

        private Companion() {
        }
    }

    public final FieldsMatcher count(IntRange intRange) {
        intRange.getClass();
        this.rangeMatcher = intRange;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCount(I)V */
    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final FieldsMatcher setCount(int i) {
        this.rangeMatcher = new IntRange(i);
        return this;
    }

    public final FieldsMatcher count(int i, int i2) {
        this.rangeMatcher = new IntRange(i, i2);
        return this;
    }

    public final /* synthetic */ FieldsMatcher add(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0482u5.invoke(fieldMatcher);
        add(fieldMatcher);
        return this;
    }

    public final FieldsMatcher addForType(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addForType$default(this, str, stringMatchType, false, 4, null);
    }

    public final FieldsMatcher addForType(String str) {
        str.getClass();
        return addForType$default(this, str, null, false, 6, null);
    }

    public final FieldsMatcher addForType(Class<?> cls) {
        cls.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        fieldMatcher.type(cls);
        add(fieldMatcher);
        return this;
    }
}
