package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.ParametersMatcher;
import p007D0.C0138d;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class ParametersMatcher extends BaseQuery {
    public static final Companion Companion = new Companion(null);
    private List<ParameterMatcher> paramsMatcher;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final ParametersMatcher create() {
            return new ParametersMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public static /* synthetic */ ParametersMatcher add$default(ParametersMatcher parametersMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return parametersMatcher.add(str, stringMatchType, z2);
    }

    public static /* synthetic */ ParametersMatcher count$default(ParametersMatcher parametersMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return parametersMatcher.count(i2, i3);
    }

    public static final ParametersMatcher create() {
        return Companion.create();
    }

    public final ParametersMatcher add(String str) {
        AbstractC0307g.m703e(str, "typeName");
        return add$default(this, str, null, false, 6, null);
    }

    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final ParametersMatcher setCount(int i2) {
        this.rangeMatcher = new IntRange(i2);
        return this;
    }

    public final ParametersMatcher countMax(int i2) {
        this.rangeMatcher = new IntRange(0, i2);
        return this;
    }

    public final ParametersMatcher countMin(int i2) {
        this.rangeMatcher = new IntRange(i2, Integer.MAX_VALUE);
        return this;
    }

    public final /* synthetic */ int getCount() {
        throw new C0138d();
    }

    public final List<ParameterMatcher> getParamsMatcher() {
        return this.paramsMatcher;
    }

    public final IntRange getRangeMatcher() {
        return this.rangeMatcher;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        int iM1928k;
        AbstractC0307g.m703e(c0733b, "fbb");
        ParametersMatcher.Companion companion = org.luckypray.dexkit.schema.ParametersMatcher.Companion;
        List<ParameterMatcher> list = this.paramsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
            for (ParameterMatcher parameterMatcher : list) {
                if (parameterMatcher == null) {
                    parameterMatcher = new ParameterMatcher();
                }
                arrayList.add(Integer.valueOf(parameterMatcher.innerBuild(c0733b)));
            }
            iM1928k = c0733b.m1928k(AbstractC0181l.m552x0(arrayList));
        } else {
            iM1928k = 0;
        }
        IntRange intRange = this.rangeMatcher;
        int iCreateParametersMatcher = companion.createParametersMatcher(c0733b, iM1928k, intRange != null ? intRange.innerBuild(c0733b) : 0);
        c0733b.m1931n(iCreateParametersMatcher);
        return iCreateParametersMatcher;
    }

    public final ParametersMatcher params(Collection<ParameterMatcher> collection) {
        AbstractC0307g.m703e(collection, "params");
        this.paramsMatcher = AbstractC0181l.m541A0(collection);
        return this;
    }

    public final ParametersMatcher add(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    public final ParametersMatcher count(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        this.rangeMatcher = intRange;
        return this;
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

    public final ParametersMatcher count(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        this.rangeMatcher = new IntRange(c0340c);
        return this;
    }

    public final ParametersMatcher count(int i2, int i3) {
        this.rangeMatcher = new IntRange(i2, i3);
        return this;
    }

    public final ParametersMatcher add(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        add(new ParameterMatcher().type(str, stringMatchType, z2));
        return this;
    }

    public final ParametersMatcher add(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        add(new ParameterMatcher().type(cls));
        return this;
    }

    private final ParametersMatcher add(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ParameterMatcher parameterMatcher = new ParameterMatcher();
        interfaceC0286l.invoke(parameterMatcher);
        add(parameterMatcher);
        return this;
    }
}
