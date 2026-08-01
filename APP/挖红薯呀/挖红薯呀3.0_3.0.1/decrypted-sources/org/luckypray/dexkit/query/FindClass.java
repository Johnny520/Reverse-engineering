package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.BaseFinder;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.schema.FindClass;
import p000.AbstractC0201f9;
import p000.AbstractC0619pl;
import p000.AbstractC0960ye;
import p000.AbstractC1001ze;
import p000.C0938xt;
import p000.InterfaceC0742sw;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
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
        this.excludePackages = AbstractC0201f9.m1069o0(strArr);
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
    public int innerBuild(C0938xt c0938xt) {
        int iM5162k;
        int iM5162k2;
        int iCreateInClassesVector;
        c0938xt.getClass();
        FindClass.Companion companion = org.luckypray.dexkit.schema.FindClass.Companion;
        Collection<String> collection = this.searchPackages;
        if (collection != null) {
            Collection<String> collection2 = collection;
            ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(collection2));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c0938xt.m5161j((String) it.next())));
            }
            iM5162k = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList));
        } else {
            iM5162k = 0;
        }
        Collection<String> collection3 = this.excludePackages;
        if (collection3 != null) {
            Collection<String> collection4 = collection3;
            ArrayList arrayList2 = new ArrayList(AbstractC1001ze.m5585E(collection4));
            Iterator<T> it2 = collection4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(c0938xt.m5161j((String) it2.next())));
            }
            iM5162k2 = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList2));
        } else {
            iM5162k2 = 0;
        }
        boolean z = this.ignorePackagesCase;
        Collection<ClassData> collection5 = this.searchClasses;
        if (collection5 != null) {
            Collection<ClassData> collection6 = collection5;
            ArrayList arrayList3 = new ArrayList(AbstractC1001ze.m5585E(collection6));
            Iterator<T> it3 = collection6.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(((ClassData) it3.next()).getEncodeId()));
            }
            iCreateInClassesVector = org.luckypray.dexkit.schema.FindClass.Companion.createInClassesVector(c0938xt, AbstractC0960ye.m5254X(arrayList3));
        } else {
            iCreateInClassesVector = 0;
        }
        boolean z2 = this.findFirst;
        ClassMatcher classMatcher = this.matcher;
        int iCreateFindClass = companion.createFindClass(c0938xt, iM5162k, iM5162k2, z, iCreateInClassesVector, z2, classMatcher != null ? classMatcher.build$dexkit_android_release(c0938xt) : 0);
        c0938xt.m5165n(iCreateFindClass);
        return iCreateFindClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ FindClass matcher(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
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
        this.searchPackages = AbstractC0201f9.m1069o0(strArr);
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

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.FindClass.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
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
