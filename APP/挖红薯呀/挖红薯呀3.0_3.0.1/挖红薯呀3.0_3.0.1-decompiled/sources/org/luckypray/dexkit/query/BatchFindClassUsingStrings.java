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
import org.luckypray.dexkit.schema.BatchFindClassUsingStrings;
import p000.AbstractC0201f9;
import p000.AbstractC0619pl;
import p000.AbstractC0960ye;
import p000.AbstractC1001ze;
import p000.C0938xt;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class BatchFindClassUsingStrings extends BaseFinder {
    public static final Companion Companion = new Companion(null);
    private Collection<String> excludePackages;
    private boolean ignorePackagesCase;
    private Collection<ClassData> searchClasses;
    private List<StringMatchersGroup> searchGroups;
    private Collection<String> searchPackages;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ BatchFindClassUsingStrings addSearchGroup$default(BatchFindClassUsingStrings batchFindClassUsingStrings, String str, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return batchFindClassUsingStrings.addSearchGroup(str, collection, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BatchFindClassUsingStrings create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ BatchFindClassUsingStrings groups$default(BatchFindClassUsingStrings batchFindClassUsingStrings, Map map, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return batchFindClassUsingStrings.groups(map, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindClassUsingStrings addSearchGroup(String str, Collection<String> collection, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        collection.getClass();
        stringMatchType.getClass();
        Collection<String> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(collection2));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), stringMatchType, z));
        }
        addSearchGroup(new StringMatchersGroup(str, arrayList));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindClassUsingStrings excludePackages(String... strArr) {
        strArr.getClass();
        this.excludePackages = AbstractC0201f9.m1069o0(strArr);
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
    public final Collection<String> getSearchPackages() {
        return this.searchPackages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindClassUsingStrings groups(Map<String, ? extends Collection<String>> map, StringMatchType stringMatchType, boolean z) {
        map.getClass();
        stringMatchType.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends Collection<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Collection<String> value = entry.getValue();
            ArrayList arrayList2 = new ArrayList(AbstractC1001ze.m5585E(value));
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
    public final BatchFindClassUsingStrings ignorePackagesCase(boolean z) {
        this.ignorePackagesCase = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) throws IllegalAccessException {
        int iM5162k;
        int iM5162k2;
        c0938xt.getClass();
        List<StringMatchersGroup> list = this.searchGroups;
        if (list == null) {
            throw new IllegalAccessException("searchGroups not be empty");
        }
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((StringMatchersGroup) it.next()).getGroupName());
        }
        int size = AbstractC0960ye.m5255Y(arrayList).size();
        List<StringMatchersGroup> list2 = this.searchGroups;
        list2.getClass();
        if (size < list2.size()) {
            throw new IllegalAccessException("groupName must be unique");
        }
        BatchFindClassUsingStrings.Companion companion = org.luckypray.dexkit.schema.BatchFindClassUsingStrings.Companion;
        Collection<String> collection = this.searchPackages;
        int iCreateInClassesVector = 0;
        if (collection != null) {
            Collection<String> collection2 = collection;
            ArrayList arrayList2 = new ArrayList(AbstractC1001ze.m5585E(collection2));
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(c0938xt.m5161j((String) it2.next())));
            }
            iM5162k = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList2));
        } else {
            iM5162k = 0;
        }
        Collection<String> collection3 = this.excludePackages;
        if (collection3 != null) {
            Collection<String> collection4 = collection3;
            ArrayList arrayList3 = new ArrayList(AbstractC1001ze.m5585E(collection4));
            Iterator<T> it3 = collection4.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(c0938xt.m5161j((String) it3.next())));
            }
            iM5162k2 = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList3));
        } else {
            iM5162k2 = 0;
        }
        boolean z = this.ignorePackagesCase;
        Collection<ClassData> collection5 = this.searchClasses;
        if (collection5 != null) {
            Collection<ClassData> collection6 = collection5;
            ArrayList arrayList4 = new ArrayList(AbstractC1001ze.m5585E(collection6));
            Iterator<T> it4 = collection6.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Long.valueOf(((ClassData) it4.next()).getEncodeId()));
            }
            iCreateInClassesVector = org.luckypray.dexkit.schema.BatchFindClassUsingStrings.Companion.createInClassesVector(c0938xt, AbstractC0960ye.m5254X(arrayList4));
        }
        int i = iCreateInClassesVector;
        List<StringMatchersGroup> list3 = this.searchGroups;
        list3.getClass();
        ArrayList arrayList5 = new ArrayList(AbstractC1001ze.m5585E(list3));
        Iterator<T> it5 = list3.iterator();
        while (it5.hasNext()) {
            arrayList5.add(Integer.valueOf(((StringMatchersGroup) it5.next()).build$dexkit_android_release(c0938xt)));
        }
        int iCreateBatchFindClassUsingStrings = companion.createBatchFindClassUsingStrings(c0938xt, iM5162k, iM5162k2, z, i, c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList5)));
        c0938xt.m5165n(iCreateBatchFindClassUsingStrings);
        return iCreateBatchFindClassUsingStrings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindClassUsingStrings searchIn(Collection<ClassData> collection) {
        collection.getClass();
        this.searchClasses = collection;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindClassUsingStrings searchPackages(String... strArr) {
        strArr.getClass();
        this.searchPackages = AbstractC0201f9.m1069o0(strArr);
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
    public final /* synthetic */ void setSearchPackages(Collection collection) {
        this.searchPackages = collection;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.BatchFindClassUsingStrings.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final BatchFindClassUsingStrings create() {
            return new BatchFindClassUsingStrings();
        }

        private Companion() {
        }
    }

    public final BatchFindClassUsingStrings excludePackages(Collection<String> collection) {
        collection.getClass();
        this.excludePackages = collection;
        return this;
    }

    public final BatchFindClassUsingStrings searchPackages(Collection<String> collection) {
        collection.getClass();
        this.searchPackages = collection;
        return this;
    }

    public final BatchFindClassUsingStrings addSearchGroup(String str, Collection<String> collection, StringMatchType stringMatchType) {
        str.getClass();
        collection.getClass();
        stringMatchType.getClass();
        return addSearchGroup$default(this, str, collection, stringMatchType, false, 8, null);
    }

    public final BatchFindClassUsingStrings addSearchGroup(StringMatchersGroup stringMatchersGroup) {
        stringMatchersGroup.getClass();
        List<StringMatchersGroup> arrayList = this.searchGroups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.searchGroups = arrayList;
        arrayList.add(stringMatchersGroup);
        return this;
    }

    public final BatchFindClassUsingStrings addSearchGroup(String str, Collection<String> collection) {
        str.getClass();
        collection.getClass();
        return addSearchGroup$default(this, str, collection, null, false, 12, null);
    }

    public final /* synthetic */ BatchFindClassUsingStrings addSearchGroup(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        StringMatchersGroup stringMatchersGroup = new StringMatchersGroup();
        interfaceC0742sw.invoke(stringMatchersGroup);
        addSearchGroup(stringMatchersGroup);
        return this;
    }

    public final /* synthetic */ BatchFindClassUsingStrings addSearchGroup(String str, InterfaceC0742sw interfaceC0742sw) {
        str.getClass();
        interfaceC0742sw.getClass();
        StringMatcherList stringMatcherList = new StringMatcherList();
        interfaceC0742sw.invoke(stringMatcherList);
        addSearchGroup(new StringMatchersGroup(str, stringMatcherList));
        return this;
    }

    public final BatchFindClassUsingStrings groups(Map<String, ? extends Collection<String>> map, StringMatchType stringMatchType) {
        map.getClass();
        stringMatchType.getClass();
        return groups$default(this, map, stringMatchType, false, 4, null);
    }

    public final /* synthetic */ BatchFindClassUsingStrings groups(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        StringMatchersGroupList stringMatchersGroupList = new StringMatchersGroupList();
        interfaceC0742sw.invoke(stringMatchersGroupList);
        groups(stringMatchersGroupList);
        return this;
    }

    public final BatchFindClassUsingStrings groups(Map<String, ? extends Collection<String>> map) {
        map.getClass();
        return groups$default(this, map, null, false, 6, null);
    }

    public final BatchFindClassUsingStrings groups(Collection<StringMatchersGroup> collection) {
        collection.getClass();
        this.searchGroups = new ArrayList(collection);
        return this;
    }
}
