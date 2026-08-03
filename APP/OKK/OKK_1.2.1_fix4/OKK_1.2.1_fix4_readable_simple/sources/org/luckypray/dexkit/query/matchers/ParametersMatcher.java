package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
    public static final Companion Companion = null;
    private List<ParameterMatcher> paramsMatcher;
    private IntRange rangeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final ParametersMatcher create() {
            return new ParametersMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ParametersMatcher() {
    }

    public static /* synthetic */ ParametersMatcher add$default(ParametersMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.add(r1, r2, r3);
    }

    public static /* synthetic */ ParametersMatcher count$default(ParametersMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.count(r1, r2);
    }

    public static final ParametersMatcher create() {
        return Companion.create();
    }

    public final ParametersMatcher add(String r8) {
        AbstractC0307g.m703e(r8, "typeName");
        return add$default(this, r8, null, false, 6, null);
    }

    public final ParametersMatcher count(int r2) {
        this.rangeMatcher = new IntRange(r2);
        return this;
    }

    public final ParametersMatcher countMax(int r3) {
        this.rangeMatcher = new IntRange(0, r3);
        return this;
    }

    public final ParametersMatcher countMin(int r3) {
        this.rangeMatcher = new IntRange(r3, Integer.MAX_VALUE);
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
    public int innerBuild(C0733b r6) {
        AbstractC0307g.m703e(r6, "fbb");
        ParametersMatcher.Companion r02 = org.luckypray.dexkit.schema.ParametersMatcher.Companion;
        List<ParameterMatcher> r1 = this.paramsMatcher;
        int r2 = 0;
        if (r1 == null) goto L13;
        ArrayList r3 = new ArrayList(AbstractC0183n.m559k0(r1, 10));
        Iterator<T> r12 = r1.iterator();
    L6:
        if (r12.hasNext() == false) goto L12;
        ParameterMatcher r4 = (ParameterMatcher) r12.next();
        if (r4 != null) goto L11;
        r4 = new ParameterMatcher();
    L11:
        r3.add(Integer.valueOf(BaseQuery.access$innerBuild(r4, r6)));
        goto L6
    L12:
        int r13 = r6.m1928k(AbstractC0181l.m552x0(r3));
    L14:
        IntRange r32 = this.rangeMatcher;
        if (r32 == null) goto L17;
        r2 = BaseQuery.access$innerBuild(r32, r6);
    L17:
        int r03 = r02.createParametersMatcher(r6, r13, r2);
        r6.m1931n(r03);
        return r03;
    L13:
        r13 = 0;
        goto L14
    }

    public final ParametersMatcher params(Collection<ParameterMatcher> r2) {
        AbstractC0307g.m703e(r2, "params");
        this.paramsMatcher = AbstractC0181l.m541A0(r2);
        return this;
    }

    public final /* synthetic */ void setCount(int r1) {
        count(r1);
    }

    public final ParametersMatcher add(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "typeName");
        AbstractC0307g.m703e(r9, "matchType");
        return add$default(this, r8, r9, false, 4, null);
    }

    public final ParametersMatcher count(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        this.rangeMatcher = r2;
        return this;
    }

    public final ParametersMatcher add(ParameterMatcher r2) {
        List<ParameterMatcher> r02 = this.paramsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.paramsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final ParametersMatcher count(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        this.rangeMatcher = new IntRange(r2);
        return this;
    }

    public final ParametersMatcher count(int r2, int r3) {
        this.rangeMatcher = new IntRange(r2, r3);
        return this;
    }

    public final ParametersMatcher add(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "typeName");
        AbstractC0307g.m703e(r3, "matchType");
        add(new ParameterMatcher().type(r2, r3, r4));
        return this;
    }

    public final ParametersMatcher add(Class<?> r2) {
        AbstractC0307g.m703e(r2, "clazz");
        add(new ParameterMatcher().type(r2));
        return this;
    }

    private final ParametersMatcher add(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ParameterMatcher r02 = new ParameterMatcher();
        r2.invoke(r02);
        add(r02);
        return this;
    }
}
