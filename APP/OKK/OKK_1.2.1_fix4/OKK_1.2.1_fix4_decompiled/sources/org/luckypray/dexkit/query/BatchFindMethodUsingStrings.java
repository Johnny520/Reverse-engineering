package org.luckypray.dexkit.query;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.StringMatchersGroup;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.schema.BatchFindMethodUsingStrings;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class BatchFindMethodUsingStrings extends BaseQuery {
    public static final Companion Companion = new Companion(null);
    private Collection<String> excludePackages;
    private boolean ignorePackagesCase;
    private Collection<ClassData> searchClasses;
    private List<StringMatchersGroup> searchGroups;
    private Collection<MethodData> searchMethods;
    private Collection<String> searchPackages;

    public static final class Companion {
        private Companion() {
        }

        public final BatchFindMethodUsingStrings create() {
            return new BatchFindMethodUsingStrings();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public static /* synthetic */ BatchFindMethodUsingStrings addSearchGroup$default(BatchFindMethodUsingStrings batchFindMethodUsingStrings, String str, Collection collection, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return batchFindMethodUsingStrings.addSearchGroup(str, collection, stringMatchType, z2);
    }

    public static final BatchFindMethodUsingStrings create() {
        return Companion.create();
    }

    public static /* synthetic */ BatchFindMethodUsingStrings groups$default(BatchFindMethodUsingStrings batchFindMethodUsingStrings, Map map, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return batchFindMethodUsingStrings.groups(map, stringMatchType, z2);
    }

    public final BatchFindMethodUsingStrings addSearchGroup(String str, Collection<String> collection) {
        AbstractC0307g.m703e(str, "groupName");
        AbstractC0307g.m703e(collection, "usingStrings");
        return addSearchGroup$default(this, str, collection, null, false, 12, null);
    }

    public final BatchFindMethodUsingStrings excludePackages(String... strArr) {
        AbstractC0307g.m703e(strArr, "excludePackages");
        this.excludePackages = AbstractC0179j.m540q0(strArr);
        return this;
    }

    public final Collection<String> getExcludePackages() {
        return this.excludePackages;
    }

    public final boolean getIgnorePackagesCase() {
        return this.ignorePackagesCase;
    }

    public final Collection<ClassData> getSearchClasses() {
        return this.searchClasses;
    }

    public final List<StringMatchersGroup> getSearchGroups() {
        return this.searchGroups;
    }

    public final Collection<MethodData> getSearchMethods() {
        return this.searchMethods;
    }

    public final Collection<String> getSearchPackages() {
        return this.searchPackages;
    }

    public final BatchFindMethodUsingStrings groups(Map<String, ? extends Collection<String>> map) {
        AbstractC0307g.m703e(map, "keywordsMap");
        return groups$default(this, map, null, false, 6, null);
    }

    public final BatchFindMethodUsingStrings ignorePackagesCase(boolean z2) {
        this.ignorePackagesCase = z2;
        return this;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) throws IllegalAccessException {
        int iM1928k;
        int iM1928k2;
        int iCreateInClassesVector;
        int iCreateInMethodsVector;
        AbstractC0307g.m703e(c0733b, "fbb");
        List<StringMatchersGroup> list = this.searchGroups;
        if (list == null) {
            throw new IllegalAccessException("searchGroups not be empty");
        }
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((StringMatchersGroup) it.next()).getGroupName());
        }
        int size = AbstractC0181l.m542B0(arrayList).size();
        List<StringMatchersGroup> list2 = this.searchGroups;
        AbstractC0307g.m700b(list2);
        if (size < list2.size()) {
            throw new IllegalAccessException("groupName must be unique");
        }
        BatchFindMethodUsingStrings.Companion companion = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion;
        Collection<String> collection = this.searchPackages;
        if (collection != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0183n.m559k0(collection, 10));
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(c0733b.m1927j((String) it2.next())));
            }
            iM1928k = c0733b.m1928k(AbstractC0181l.m552x0(arrayList2));
        } else {
            iM1928k = 0;
        }
        Collection<String> collection2 = this.excludePackages;
        if (collection2 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC0183n.m559k0(collection2, 10));
            Iterator<T> it3 = collection2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(c0733b.m1927j((String) it3.next())));
            }
            iM1928k2 = c0733b.m1928k(AbstractC0181l.m552x0(arrayList3));
        } else {
            iM1928k2 = 0;
        }
        boolean z2 = this.ignorePackagesCase;
        Collection<ClassData> collection3 = this.searchClasses;
        if (collection3 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC0183n.m559k0(collection3, 10));
            Iterator<T> it4 = collection3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Long.valueOf(((ClassData) it4.next()).getEncodeId()));
            }
            iCreateInClassesVector = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion.createInClassesVector(c0733b, AbstractC0181l.m554z0(arrayList4));
        } else {
            iCreateInClassesVector = 0;
        }
        Collection<MethodData> collection4 = this.searchMethods;
        if (collection4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC0183n.m559k0(collection4, 10));
            Iterator<T> it5 = collection4.iterator();
            while (it5.hasNext()) {
                arrayList5.add(Long.valueOf(((MethodData) it5.next()).getEncodeId()));
            }
            iCreateInMethodsVector = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion.createInMethodsVector(c0733b, AbstractC0181l.m554z0(arrayList5));
        } else {
            iCreateInMethodsVector = 0;
        }
        List<StringMatchersGroup> list3 = this.searchGroups;
        AbstractC0307g.m700b(list3);
        ArrayList arrayList6 = new ArrayList(AbstractC0183n.m559k0(list3, 10));
        Iterator<T> it6 = list3.iterator();
        while (it6.hasNext()) {
            arrayList6.add(Integer.valueOf(((StringMatchersGroup) it6.next()).innerBuild(c0733b)));
        }
        int iCreateBatchFindMethodUsingStrings = companion.createBatchFindMethodUsingStrings(c0733b, iM1928k, iM1928k2, z2, iCreateInClassesVector, iCreateInMethodsVector, c0733b.m1928k(AbstractC0181l.m552x0(arrayList6)));
        c0733b.m1931n(iCreateBatchFindMethodUsingStrings);
        return iCreateBatchFindMethodUsingStrings;
    }

    public final BatchFindMethodUsingStrings searchInClasses(Collection<ClassData> collection) {
        AbstractC0307g.m703e(collection, "classes");
        this.searchClasses = collection;
        return this;
    }

    public final BatchFindMethodUsingStrings searchInMethods(Collection<MethodData> collection) {
        AbstractC0307g.m703e(collection, "methods");
        this.searchMethods = collection;
        return this;
    }

    public final BatchFindMethodUsingStrings searchPackages(String... strArr) {
        AbstractC0307g.m703e(strArr, "searchPackages");
        this.searchPackages = AbstractC0179j.m540q0(strArr);
        return this;
    }

    public final /* synthetic */ void setExcludePackages(Collection collection) {
        this.excludePackages = collection;
    }

    public final /* synthetic */ void setIgnorePackagesCase(boolean z2) {
        this.ignorePackagesCase = z2;
    }

    public final /* synthetic */ void setSearchClasses(Collection collection) {
        this.searchClasses = collection;
    }

    public final /* synthetic */ void setSearchMethods(Collection collection) {
        this.searchMethods = collection;
    }

    public final /* synthetic */ void setSearchPackages(Collection collection) {
        this.searchPackages = collection;
    }

    public final BatchFindMethodUsingStrings addSearchGroup(String str, Collection<String> collection, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "groupName");
        AbstractC0307g.m703e(collection, "usingStrings");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addSearchGroup$default(this, str, collection, stringMatchType, false, 8, null);
    }

    public final BatchFindMethodUsingStrings excludePackages(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "excludePackages");
        this.excludePackages = collection;
        return this;
    }

    public final BatchFindMethodUsingStrings groups(Map<String, ? extends Collection<String>> map, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(map, "keywordsMap");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return groups$default(this, map, stringMatchType, false, 4, null);
    }

    public final BatchFindMethodUsingStrings searchPackages(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "searchPackages");
        this.searchPackages = collection;
        return this;
    }

    public final BatchFindMethodUsingStrings addSearchGroup(StringMatchersGroup stringMatchersGroup) {
        AbstractC0307g.m703e(stringMatchersGroup, "matcher");
        List<StringMatchersGroup> arrayList = this.searchGroups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.searchGroups = arrayList;
        arrayList.add(stringMatchersGroup);
        return this;
    }

    public final BatchFindMethodUsingStrings groups(Collection<StringMatchersGroup> collection) {
        AbstractC0307g.m703e(collection, "groups");
        this.searchGroups = AbstractC0181l.m541A0(collection);
        return this;
    }

    private final BatchFindMethodUsingStrings groups(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        StringMatchersGroupList stringMatchersGroupList = new StringMatchersGroupList();
        interfaceC0286l.invoke(stringMatchersGroupList);
        groups(stringMatchersGroupList);
        return this;
    }

    private final BatchFindMethodUsingStrings addSearchGroup(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        StringMatchersGroup stringMatchersGroup = new StringMatchersGroup();
        interfaceC0286l.invoke(stringMatchersGroup);
        addSearchGroup(stringMatchersGroup);
        return this;
    }

    public final BatchFindMethodUsingStrings groups(Map<String, ? extends Collection<String>> map, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(map, "keywordsMap");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends Collection<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Collection<String> value = entry.getValue();
            ArrayList arrayList2 = new ArrayList(AbstractC0183n.m559k0(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList2.add(new StringMatcher((String) it.next(), stringMatchType, z2));
            }
            arrayList.add(new StringMatchersGroup(key, arrayList2));
        }
        this.searchGroups = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    private final BatchFindMethodUsingStrings addSearchGroup(String str, InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(str, "groupName");
        AbstractC0307g.m703e(interfaceC0286l, "init");
        StringMatcherList stringMatcherList = new StringMatcherList();
        interfaceC0286l.invoke(stringMatcherList);
        addSearchGroup(new StringMatchersGroup(str, stringMatcherList));
        return this;
    }

    public final BatchFindMethodUsingStrings addSearchGroup(String str, Collection<String> collection, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "groupName");
        AbstractC0307g.m703e(collection, "usingStrings");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), stringMatchType, z2));
        }
        addSearchGroup(new StringMatchersGroup(str, arrayList));
        return this;
    }
}
