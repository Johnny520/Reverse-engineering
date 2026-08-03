package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.BatchUsingStringsMatcher;
import p007D0.C0138d;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class StringMatchersGroup extends BaseQuery {
    public static final Companion Companion = null;
    private String groupName;
    private List<StringMatcher> stringMatchers;

    public static final class Companion {
        private Companion() {
        }

        public final StringMatchersGroup create() {
            return new StringMatchersGroup();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public StringMatchersGroup() {
        this.stringMatchers = new ArrayList();
    }

    public static /* synthetic */ StringMatchersGroup add$default(StringMatchersGroup r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.add(r1, r2, r3);
    }

    public static final StringMatchersGroup create() {
        return Companion.create();
    }

    public static /* synthetic */ StringMatchersGroup usingStrings$default(StringMatchersGroup r02, Collection r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.usingStrings(r1, r2, r3);
    }

    public final StringMatchersGroup add(String r8) {
        AbstractC0307g.m703e(r8, "usingString");
        return add$default(this, r8, null, false, 6, null);
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final List<StringMatcher> getStringMatchers() {
        return this.stringMatchers;
    }

    public final /* synthetic */ Collection getUsingStrings() {
        throw new C0138d();
    }

    public final StringMatchersGroup groupName(String r2) {
        AbstractC0307g.m703e(r2, "groupName");
        this.groupName = r2;
        return this;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r6) {
        AbstractC0307g.m703e(r6, "fbb");
        if (this.groupName == null) goto L15;
        if (this.stringMatchers.isEmpty() == true) goto L13;
        BatchUsingStringsMatcher.Companion r02 = BatchUsingStringsMatcher.Companion;
        int r1 = r6.m1927j(this.groupName);
        List<StringMatcher> r2 = this.stringMatchers;
        ArrayList r3 = new ArrayList(AbstractC0183n.m559k0(r2, 10));
        Iterator<T> r22 = r2.iterator();
    L8:
        if (r22.hasNext() == false) goto L10;
        r3.add(Integer.valueOf(BaseQuery.access$innerBuild((StringMatcher) r22.next(), r6)));
        goto L8
    L10:
        int r03 = r02.createBatchUsingStringsMatcher(r6, r1, r6.m1928k(AbstractC0181l.m552x0(r3)));
        r6.m1931n(r03);
        return r03;
    L13:
        throw new IllegalAccessException("matchers not be empty");
    L15:
        throw new IllegalAccessException("groupName not be null");
    }

    public final /* synthetic */ void setGroupName(String r1) {
        this.groupName = r1;
    }

    public final /* synthetic */ void setUsingStrings(Collection r8) {
        AbstractC0307g.m703e(r8, "value");
        usingStrings$default(this, r8, null, false, 6, null);
    }

    public final StringMatchersGroup usingStrings(Collection<String> r8) {
        AbstractC0307g.m703e(r8, "usingStrings");
        return usingStrings$default(this, r8, null, false, 6, null);
    }

    public final StringMatchersGroup add(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "usingString");
        AbstractC0307g.m703e(r9, "matchType");
        return add$default(this, r8, r9, false, 4, null);
    }

    public final StringMatchersGroup usingStrings(Collection<String> r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "usingStrings");
        AbstractC0307g.m703e(r9, "matchType");
        return usingStrings$default(this, r8, r9, false, 4, null);
    }

    public StringMatchersGroup(String r2, Collection<StringMatcher> r3) {
        AbstractC0307g.m703e(r2, "groupName");
        AbstractC0307g.m703e(r3, "stringMatchers");
        this.stringMatchers = new ArrayList();
        this.groupName = r2;
        this.stringMatchers = AbstractC0181l.m541A0(r3);
    }

    public final StringMatchersGroup add(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "matcher");
        this.stringMatchers.add(r2);
        return this;
    }

    public final StringMatchersGroup usingStrings(StringMatcherList r2) {
        AbstractC0307g.m703e(r2, "usingStrings");
        this.stringMatchers = r2;
        return this;
    }

    private final StringMatchersGroup usingStrings(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        StringMatcherList r02 = new StringMatcherList();
        r2.invoke(r02);
        usingStrings(r02);
        return this;
    }

    public final StringMatchersGroup add(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "usingString");
        AbstractC0307g.m703e(r3, "matchType");
        add(new StringMatcher(r2, r3, r4));
        return this;
    }

    public final StringMatchersGroup usingStrings(Collection<String> r4, StringMatchType r5, boolean r6) {
        AbstractC0307g.m703e(r4, "usingStrings");
        AbstractC0307g.m703e(r5, "matchType");
        ArrayList r02 = new ArrayList(AbstractC0183n.m559k0(r4, 10));
        Iterator<T> r42 = r4.iterator();
    L4:
        if (r42.hasNext() == false) goto L6;
        r02.add(new StringMatcher((String) r42.next(), r5, r6));
        goto L4
    L6:
        this.stringMatchers = AbstractC0181l.m541A0(r02);
        return this;
    }

    public final StringMatchersGroup usingStrings(String... r11) {
        AbstractC0307g.m703e(r11, "usingStrings");
        ArrayList r02 = new ArrayList(r11.length);
        int r1 = r11.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02.add(new StringMatcher(r11[r2], null, false, 6, null));
        r2 = r2 + 1;
        goto L3
    L5:
        this.stringMatchers = AbstractC0181l.m541A0(r02);
        return this;
    }
}
