package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.query.base.BaseFinder;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.StringMatchersGroup;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.schema.BatchFindMethodUsingStrings;
import p000.AbstractC0002a1;
import p000.AbstractC0241h2;
import p000.AbstractC0276j2;
import p000.AbstractC0431r2;
import p000.C0038c5;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class BatchFindMethodUsingStrings extends BaseFinder {
    public static final Companion Companion = new Companion(null);
    private Collection<String> excludePackages;
    private boolean ignorePackagesCase;
    private Collection<ClassData> searchClasses;
    private List<StringMatchersGroup> searchGroups;
    private Collection<MethodData> searchMethods;
    private Collection<String> searchPackages;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ BatchFindMethodUsingStrings addSearchGroup$default(BatchFindMethodUsingStrings batchFindMethodUsingStrings, String str, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return batchFindMethodUsingStrings.addSearchGroup(str, collection, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BatchFindMethodUsingStrings create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ BatchFindMethodUsingStrings groups$default(BatchFindMethodUsingStrings batchFindMethodUsingStrings, Map map, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return batchFindMethodUsingStrings.groups(map, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindMethodUsingStrings addSearchGroup(String str, Collection<String> collection, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        collection.getClass();
        stringMatchType.getClass();
        ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(collection));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), stringMatchType, z));
        }
        addSearchGroup(new StringMatchersGroup(str, arrayList));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindMethodUsingStrings excludePackages(String... strArr) {
        strArr.getClass();
        this.excludePackages = AbstractC0002a1.m7k2(strArr);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Collection<String> getExcludePackages() {
        return this.excludePackages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getIgnorePackagesCase() {
        return this.ignorePackagesCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Collection<ClassData> getSearchClasses() {
        return this.searchClasses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<StringMatchersGroup> getSearchGroups() {
        return this.searchGroups;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Collection<MethodData> getSearchMethods() {
        return this.searchMethods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Collection<String> getSearchPackages() {
        return this.searchPackages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindMethodUsingStrings groups(Map<String, ? extends Collection<String>> map, StringMatchType stringMatchType, boolean z) {
        map.getClass();
        stringMatchType.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends Collection<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Collection<String> value = entry.getValue();
            ArrayList arrayList2 = new ArrayList(AbstractC0276j2.m703i2(value));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList2.add(new StringMatcher((String) it.next(), stringMatchType, z));
            }
            arrayList.add(new StringMatchersGroup(key, arrayList2));
        }
        this.searchGroups = new ArrayList(arrayList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindMethodUsingStrings ignorePackagesCase(boolean z) {
        this.ignorePackagesCase = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) throws IllegalAccessException {
        int iM105k;
        int iM105k2;
        int iCreateInClassesVector;
        c0038c5.getClass();
        List<StringMatchersGroup> list = this.searchGroups;
        if (list == null) {
            throw new IllegalAccessException("searchGroups not be empty");
        }
        ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((StringMatchersGroup) it.next()).getGroupName());
        }
        int size = AbstractC0241h2.m471n2(arrayList).size();
        List<StringMatchersGroup> list2 = this.searchGroups;
        list2.getClass();
        if (size < list2.size()) {
            throw new IllegalAccessException("groupName must be unique");
        }
        BatchFindMethodUsingStrings.Companion companion = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion;
        Collection<String> collection = this.searchPackages;
        int iCreateInMethodsVector = 0;
        if (collection != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0276j2.m703i2(collection));
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(c0038c5.m104j((String) it2.next())));
            }
            iM105k = c0038c5.m105k(AbstractC0241h2.m469l2(arrayList2));
        } else {
            iM105k = 0;
        }
        Collection<String> collection2 = this.excludePackages;
        if (collection2 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC0276j2.m703i2(collection2));
            Iterator<T> it3 = collection2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(c0038c5.m104j((String) it3.next())));
            }
            iM105k2 = c0038c5.m105k(AbstractC0241h2.m469l2(arrayList3));
        } else {
            iM105k2 = 0;
        }
        boolean z = this.ignorePackagesCase;
        Collection<ClassData> collection3 = this.searchClasses;
        if (collection3 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC0276j2.m703i2(collection3));
            Iterator<T> it4 = collection3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Long.valueOf(((ClassData) it4.next()).getEncodeId()));
            }
            iCreateInClassesVector = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion.createInClassesVector(c0038c5, AbstractC0241h2.m470m2(arrayList4));
        } else {
            iCreateInClassesVector = 0;
        }
        Collection<MethodData> collection4 = this.searchMethods;
        if (collection4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC0276j2.m703i2(collection4));
            Iterator<T> it5 = collection4.iterator();
            while (it5.hasNext()) {
                arrayList5.add(Long.valueOf(((MethodData) it5.next()).getEncodeId()));
            }
            iCreateInMethodsVector = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion.createInMethodsVector(c0038c5, AbstractC0241h2.m470m2(arrayList5));
        }
        int i = iCreateInMethodsVector;
        List<StringMatchersGroup> list3 = this.searchGroups;
        list3.getClass();
        ArrayList arrayList6 = new ArrayList(AbstractC0276j2.m703i2(list3));
        Iterator<T> it6 = list3.iterator();
        while (it6.hasNext()) {
            arrayList6.add(Integer.valueOf(((StringMatchersGroup) it6.next()).build$dexkit_android_release(c0038c5)));
        }
        int iCreateBatchFindMethodUsingStrings = companion.createBatchFindMethodUsingStrings(c0038c5, iM105k, iM105k2, z, iCreateInClassesVector, i, c0038c5.m105k(AbstractC0241h2.m469l2(arrayList6)));
        c0038c5.m108n(iCreateBatchFindMethodUsingStrings);
        return iCreateBatchFindMethodUsingStrings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindMethodUsingStrings searchInClasses(Collection<ClassData> collection) {
        collection.getClass();
        this.searchClasses = collection;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindMethodUsingStrings searchInMethods(Collection<MethodData> collection) {
        collection.getClass();
        this.searchMethods = collection;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindMethodUsingStrings searchPackages(String... strArr) {
        strArr.getClass();
        this.searchPackages = AbstractC0002a1.m7k2(strArr);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setExcludePackages(Collection collection) {
        this.excludePackages = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setIgnorePackagesCase(boolean z) {
        this.ignorePackagesCase = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setSearchClasses(Collection collection) {
        this.searchClasses = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setSearchMethods(Collection collection) {
        this.searchMethods = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setSearchPackages(Collection collection) {
        this.searchPackages = collection;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.BatchFindMethodUsingStrings.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final BatchFindMethodUsingStrings create() {
            return new BatchFindMethodUsingStrings();
        }

        private Companion() {
        }
    }

    public final BatchFindMethodUsingStrings excludePackages(Collection<String> collection) {
        collection.getClass();
        this.excludePackages = collection;
        return this;
    }

    public final BatchFindMethodUsingStrings searchPackages(Collection<String> collection) {
        collection.getClass();
        this.searchPackages = collection;
        return this;
    }

    public final BatchFindMethodUsingStrings addSearchGroup(String str, Collection<String> collection, StringMatchType stringMatchType) {
        str.getClass();
        collection.getClass();
        stringMatchType.getClass();
        return addSearchGroup$default(this, str, collection, stringMatchType, false, 8, null);
    }

    public final BatchFindMethodUsingStrings addSearchGroup(StringMatchersGroup stringMatchersGroup) {
        stringMatchersGroup.getClass();
        List<StringMatchersGroup> arrayList = this.searchGroups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.searchGroups = arrayList;
        arrayList.add(stringMatchersGroup);
        return this;
    }

    public final /* synthetic */ BatchFindMethodUsingStrings addSearchGroup(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        StringMatchersGroup stringMatchersGroup = new StringMatchersGroup();
        interfaceC0482u5.invoke(stringMatchersGroup);
        addSearchGroup(stringMatchersGroup);
        return this;
    }

    public final /* synthetic */ BatchFindMethodUsingStrings addSearchGroup(String str, InterfaceC0482u5 interfaceC0482u5) {
        str.getClass();
        interfaceC0482u5.getClass();
        StringMatcherList stringMatcherList = new StringMatcherList();
        interfaceC0482u5.invoke(stringMatcherList);
        addSearchGroup(new StringMatchersGroup(str, stringMatcherList));
        return this;
    }

    public final BatchFindMethodUsingStrings addSearchGroup(String str, Collection<String> collection) {
        str.getClass();
        collection.getClass();
        return addSearchGroup$default(this, str, collection, null, false, 12, null);
    }

    public final BatchFindMethodUsingStrings groups(Map<String, ? extends Collection<String>> map, StringMatchType stringMatchType) {
        map.getClass();
        stringMatchType.getClass();
        return groups$default(this, map, stringMatchType, false, 4, null);
    }

    public final /* synthetic */ BatchFindMethodUsingStrings groups(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        StringMatchersGroupList stringMatchersGroupList = new StringMatchersGroupList();
        interfaceC0482u5.invoke(stringMatchersGroupList);
        groups(stringMatchersGroupList);
        return this;
    }

    public final BatchFindMethodUsingStrings groups(Map<String, ? extends Collection<String>> map) {
        map.getClass();
        return groups$default(this, map, null, false, 6, null);
    }

    public final BatchFindMethodUsingStrings groups(Collection<StringMatchersGroup> collection) {
        collection.getClass();
        this.searchGroups = new ArrayList(collection);
        return this;
    }
}
