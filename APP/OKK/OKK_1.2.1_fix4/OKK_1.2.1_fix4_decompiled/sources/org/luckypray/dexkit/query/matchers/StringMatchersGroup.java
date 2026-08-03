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
    public static final Companion Companion = new Companion(null);
    private String groupName;
    private List<StringMatcher> stringMatchers;

    public static final class Companion {
        private Companion() {
        }

        public final StringMatchersGroup create() {
            return new StringMatchersGroup();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public StringMatchersGroup() {
        this.stringMatchers = new ArrayList();
    }

    public static /* synthetic */ StringMatchersGroup add$default(StringMatchersGroup stringMatchersGroup, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return stringMatchersGroup.add(str, stringMatchType, z2);
    }

    public static final StringMatchersGroup create() {
        return Companion.create();
    }

    public static /* synthetic */ StringMatchersGroup usingStrings$default(StringMatchersGroup stringMatchersGroup, Collection collection, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return stringMatchersGroup.usingStrings(collection, stringMatchType, z2);
    }

    public final StringMatchersGroup add(String str) {
        AbstractC0307g.m703e(str, "usingString");
        return add$default(this, str, null, false, 6, null);
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

    public final StringMatchersGroup groupName(String str) {
        AbstractC0307g.m703e(str, "groupName");
        this.groupName = str;
        return this;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) throws IllegalAccessException {
        AbstractC0307g.m703e(c0733b, "fbb");
        if (this.groupName == null) {
            throw new IllegalAccessException("groupName not be null");
        }
        if (this.stringMatchers.isEmpty()) {
            throw new IllegalAccessException("matchers not be empty");
        }
        BatchUsingStringsMatcher.Companion companion = BatchUsingStringsMatcher.Companion;
        int iM1927j = c0733b.m1927j(this.groupName);
        List<StringMatcher> list = this.stringMatchers;
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((StringMatcher) it.next()).innerBuild(c0733b)));
        }
        int iCreateBatchUsingStringsMatcher = companion.createBatchUsingStringsMatcher(c0733b, iM1927j, c0733b.m1928k(AbstractC0181l.m552x0(arrayList)));
        c0733b.m1931n(iCreateBatchUsingStringsMatcher);
        return iCreateBatchUsingStringsMatcher;
    }

    public final /* synthetic */ void setGroupName(String str) {
        this.groupName = str;
    }

    public final /* synthetic */ void setUsingStrings(Collection collection) {
        AbstractC0307g.m703e(collection, "value");
        usingStrings$default(this, collection, null, false, 6, null);
    }

    public final StringMatchersGroup usingStrings(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "usingStrings");
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    public final StringMatchersGroup add(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "usingString");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return add$default(this, str, stringMatchType, false, 4, null);
    }

    public final StringMatchersGroup usingStrings(Collection<String> collection, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(collection, "usingStrings");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    public StringMatchersGroup(String str, Collection<StringMatcher> collection) {
        AbstractC0307g.m703e(str, "groupName");
        AbstractC0307g.m703e(collection, "stringMatchers");
        this.stringMatchers = new ArrayList();
        this.groupName = str;
        this.stringMatchers = AbstractC0181l.m541A0(collection);
    }

    public final StringMatchersGroup add(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "matcher");
        this.stringMatchers.add(stringMatcher);
        return this;
    }

    public final StringMatchersGroup usingStrings(StringMatcherList stringMatcherList) {
        AbstractC0307g.m703e(stringMatcherList, "usingStrings");
        this.stringMatchers = stringMatcherList;
        return this;
    }

    private final StringMatchersGroup usingStrings(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        StringMatcherList stringMatcherList = new StringMatcherList();
        interfaceC0286l.invoke(stringMatcherList);
        usingStrings(stringMatcherList);
        return this;
    }

    public final StringMatchersGroup add(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "usingString");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        add(new StringMatcher(str, stringMatchType, z2));
        return this;
    }

    public final StringMatchersGroup usingStrings(Collection<String> collection, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(collection, "usingStrings");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), stringMatchType, z2));
        }
        this.stringMatchers = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    public final StringMatchersGroup usingStrings(String... strArr) {
        AbstractC0307g.m703e(strArr, "usingStrings");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.stringMatchers = AbstractC0181l.m541A0(arrayList);
        return this;
    }
}
