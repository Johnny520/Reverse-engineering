package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.BaseFinder;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.schema.FindClass;
import p000.AbstractC0002a1;
import p000.AbstractC0241h2;
import p000.AbstractC0276j2;
import p000.AbstractC0431r2;
import p000.C0038c5;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class FindClass extends BaseFinder {
    public static final Companion Companion = new Companion(null);
    private Collection<String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;
    private ClassMatcher matcher;
    private Collection<ClassData> searchClasses;
    private Collection<String> searchPackages;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FindClass create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FindClass excludePackages(String... strArr) {
        strArr.getClass();
        this.excludePackages = AbstractC0002a1.m7k2(strArr);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Collection<String> getExcludePackages() {
        return this.excludePackages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getFindFirst() {
        return this.findFirst;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getIgnorePackagesCase() {
        return this.ignorePackagesCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getMatcher() {
        return this.matcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Collection<ClassData> getSearchClasses() {
        return this.searchClasses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Collection<String> getSearchPackages() {
        return this.searchPackages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FindClass ignorePackagesCase(boolean z) {
        this.ignorePackagesCase = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) {
        int iM105k;
        int iM105k2;
        int iCreateInClassesVector;
        c0038c5.getClass();
        FindClass.Companion companion = org.luckypray.dexkit.schema.FindClass.Companion;
        Collection<String> collection = this.searchPackages;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(collection));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c0038c5.m104j((String) it.next())));
            }
            iM105k = c0038c5.m105k(AbstractC0241h2.m469l2(arrayList));
        } else {
            iM105k = 0;
        }
        Collection<String> collection2 = this.excludePackages;
        if (collection2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0276j2.m703i2(collection2));
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(c0038c5.m104j((String) it2.next())));
            }
            iM105k2 = c0038c5.m105k(AbstractC0241h2.m469l2(arrayList2));
        } else {
            iM105k2 = 0;
        }
        boolean z = this.ignorePackagesCase;
        Collection<ClassData> collection3 = this.searchClasses;
        if (collection3 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC0276j2.m703i2(collection3));
            Iterator<T> it3 = collection3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(((ClassData) it3.next()).getEncodeId()));
            }
            iCreateInClassesVector = org.luckypray.dexkit.schema.FindClass.Companion.createInClassesVector(c0038c5, AbstractC0241h2.m470m2(arrayList3));
        } else {
            iCreateInClassesVector = 0;
        }
        boolean z2 = this.findFirst;
        ClassMatcher classMatcher = this.matcher;
        int iCreateFindClass = companion.createFindClass(c0038c5, iM105k, iM105k2, z, iCreateInClassesVector, z2, classMatcher != null ? classMatcher.build$dexkit_android_release(c0038c5) : 0);
        c0038c5.m108n(iCreateFindClass);
        return iCreateFindClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ FindClass matcher(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0482u5.invoke(classMatcher);
        matcher(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FindClass searchIn(Collection<ClassData> collection) {
        collection.getClass();
        this.searchClasses = collection;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FindClass searchPackages(String... strArr) {
        strArr.getClass();
        this.searchPackages = AbstractC0002a1.m7k2(strArr);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setExcludePackages(Collection collection) {
        this.excludePackages = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setFindFirst(boolean z) {
        this.findFirst = z;
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

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.FindClass.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FindClass create() {
            return new FindClass();
        }

        private Companion() {
        }
    }

    public final FindClass excludePackages(Collection<String> collection) {
        collection.getClass();
        this.excludePackages = collection;
        return this;
    }

    public final FindClass searchPackages(Collection<String> collection) {
        collection.getClass();
        this.searchPackages = collection;
        return this;
    }

    public final FindClass matcher(ClassMatcher classMatcher) {
        classMatcher.getClass();
        this.matcher = classMatcher;
        return this;
    }
}
