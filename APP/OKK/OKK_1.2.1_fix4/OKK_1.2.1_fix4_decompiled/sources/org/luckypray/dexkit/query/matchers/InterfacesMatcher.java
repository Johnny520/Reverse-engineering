package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.schema.InterfacesMatcher;
import p007D0.C0138d;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class InterfacesMatcher extends BaseQuery {
    public static final Companion Companion = new Companion(null);
    private List<ClassMatcher> interfacesMatcher;
    private MatchType matchType = MatchType.Contains;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final InterfacesMatcher create() {
            return new InterfacesMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public static /* synthetic */ InterfacesMatcher add$default(InterfacesMatcher interfacesMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return interfacesMatcher.add(str, stringMatchType, z2);
    }

    public static /* synthetic */ InterfacesMatcher count$default(InterfacesMatcher interfacesMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return interfacesMatcher.count(i2, i3);
    }

    public static final InterfacesMatcher create() {
        return Companion.create();
    }

    public final InterfacesMatcher add(String str) {
        AbstractC0307g.m703e(str, "className");
        return add$default(this, str, null, false, 6, null);
    }

    /* JADX INFO: renamed from: count, reason: merged with bridge method [inline-methods] */
    public final InterfacesMatcher setCount(int i2) {
        this.rangeMatcher = new IntRange(i2);
        return this;
    }

    public final InterfacesMatcher countMax(int i2) {
        this.rangeMatcher = new IntRange(0, i2);
        return this;
    }

    public final InterfacesMatcher countMin(int i2) {
        this.rangeMatcher = new IntRange(i2, Integer.MAX_VALUE);
        return this;
    }

    public final /* synthetic */ int getCount() {
        throw new C0138d();
    }

    public final List<ClassMatcher> getInterfacesMatcher() {
        return this.interfacesMatcher;
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
        InterfacesMatcher.Companion companion = org.luckypray.dexkit.schema.InterfacesMatcher.Companion;
        List<ClassMatcher> list = this.interfacesMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((ClassMatcher) it.next()).innerBuild(c0733b)));
            }
            iM1928k = c0733b.m1928k(AbstractC0181l.m552x0(arrayList));
        } else {
            iM1928k = 0;
        }
        byte value = this.matchType.getValue();
        IntRange intRange = this.rangeMatcher;
        int iCreateInterfacesMatcher = companion.createInterfacesMatcher(c0733b, iM1928k, value, intRange != null ? intRange.innerBuild(c0733b) : 0);
        c0733b.m1931n(iCreateInterfacesMatcher);
        return iCreateInterfacesMatcher;
    }

    public final InterfacesMatcher interfaces(Collection<ClassMatcher> collection) {
        AbstractC0307g.m703e(collection, "interfaces");
        this.interfacesMatcher = AbstractC0181l.m541A0(collection);
        return this;
    }

    public final InterfacesMatcher matchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public final /* synthetic */ void setMatchType(MatchType matchType) {
        AbstractC0307g.m703e(matchType, "<set-?>");
        this.matchType = matchType;
    }

    public final InterfacesMatcher add(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    public final InterfacesMatcher count(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        this.rangeMatcher = intRange;
        return this;
    }

    public final InterfacesMatcher add(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "interfaceMatcher");
        List<ClassMatcher> arrayList = this.interfacesMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.interfacesMatcher = arrayList;
        arrayList.add(classMatcher);
        return this;
    }

    public final InterfacesMatcher count(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        this.rangeMatcher = new IntRange(c0340c);
        return this;
    }

    public final InterfacesMatcher count(int i2, int i3) {
        this.rangeMatcher = new IntRange(i2, i3);
        return this;
    }

    public final InterfacesMatcher add(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        ClassMatcher classMatcher = new ClassMatcher();
        classMatcher.className(str, stringMatchType, z2);
        add(classMatcher);
        return this;
    }

    private final InterfacesMatcher add(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        add(classMatcher);
        return this;
    }
}
