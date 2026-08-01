package org.luckypray.dexkit.query.matchers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.ParametersMatcher;
import p000.AbstractC0025b8;
import p000.AbstractC0241h2;
import p000.AbstractC0276j2;
import p000.AbstractC0431r2;
import p000.C0038c5;
import p000.C0042c9;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ParametersMatcher extends BaseMatcher {
    public static final Companion Companion = new Companion(null);
    private List<ParameterMatcher> paramsMatcher;
    private IntRange rangeMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ParametersMatcher add$default(ParametersMatcher parametersMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return parametersMatcher.add(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ParametersMatcher count$default(ParametersMatcher parametersMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return parametersMatcher.count(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ParametersMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParametersMatcher add(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        add(new ParameterMatcher().type(str, stringMatchType, z));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParametersMatcher count(AbstractC0025b8 abstractC0025b8) {
        abstractC0025b8.getClass();
        this.rangeMatcher = new IntRange(abstractC0025b8);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParametersMatcher countMax(int i) {
        this.rangeMatcher = new IntRange(0, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParametersMatcher countMin(int i) {
        this.rangeMatcher = new IntRange(i, Integer.MAX_VALUE);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ int getCount() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<ParameterMatcher> getParamsMatcher() {
        return this.paramsMatcher;
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
        ParametersMatcher.Companion companion = org.luckypray.dexkit.schema.ParametersMatcher.Companion;
        List<ParameterMatcher> list = this.paramsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(list));
            for (ParameterMatcher parameterMatcher : list) {
                if (parameterMatcher == null) {
                    parameterMatcher = new ParameterMatcher();
                }
                arrayList.add(Integer.valueOf(parameterMatcher.build$dexkit_android_release(c0038c5)));
            }
            iM105k = c0038c5.m105k(AbstractC0241h2.m469l2(arrayList));
        } else {
            iM105k = 0;
        }
        IntRange intRange = this.rangeMatcher;
        int iCreateParametersMatcher = companion.createParametersMatcher(c0038c5, iM105k, intRange != null ? intRange.build$dexkit_android_release(c0038c5) : 0);
        c0038c5.m108n(iCreateParametersMatcher);
        return iCreateParametersMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParametersMatcher params(Collection<ParameterMatcher> collection) {
        collection.getClass();
        this.paramsMatcher = new ArrayList(collection);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.ParametersMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ParametersMatcher create() {
            return new ParametersMatcher();
        }

        private Companion() {
        }
    }

    public final ParametersMatcher count(IntRange intRange) {
        intRange.getClass();
        this.rangeMatcher = intRange;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCount(I)V */
    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final ParametersMatcher setCount(int i) {
        this.rangeMatcher = new IntRange(i);
        return this;
    }

    public final ParametersMatcher count(int i, int i2) {
        this.rangeMatcher = new IntRange(i, i2);
        return this;
    }

    public final ParametersMatcher add(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    public final ParametersMatcher add(ParameterMatcher parameterMatcher) {
        List<ParameterMatcher> arrayList = this.paramsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.paramsMatcher = arrayList;
        arrayList.add(parameterMatcher);
        return this;
    }

    public final ParametersMatcher add(String str) {
        str.getClass();
        return add$default(this, str, null, false, 6, null);
    }

    public final ParametersMatcher add(Class<?> cls) {
        cls.getClass();
        add(new ParameterMatcher().type(cls));
        return this;
    }

    public final /* synthetic */ ParametersMatcher add(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        ParameterMatcher parameterMatcher = new ParameterMatcher();
        interfaceC0482u5.invoke(parameterMatcher);
        add(parameterMatcher);
        return this;
    }
}
