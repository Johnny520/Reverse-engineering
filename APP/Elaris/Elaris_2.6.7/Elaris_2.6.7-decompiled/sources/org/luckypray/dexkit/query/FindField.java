package org.luckypray.dexkit.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.BaseFinder;
import org.luckypray.dexkit.query.matchers.FieldMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.schema.FindField;
import p000.AbstractC0002a1;
import p000.AbstractC0241h2;
import p000.AbstractC0276j2;
import p000.AbstractC0431r2;
import p000.C0038c5;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class FindField extends BaseFinder {
    public static final Companion Companion = new Companion(null);
    private Collection<String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;
    private FieldMatcher matcher;
    private Collection<ClassData> searchClasses;
    private Collection<FieldData> searchFields;
    private Collection<String> searchPackages;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FindField create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FindField excludePackages(String... strArr) {
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
    public final FieldMatcher getMatcher() {
        return this.matcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Collection<ClassData> getSearchClasses() {
        return this.searchClasses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Collection<FieldData> getSearchFields() {
        return this.searchFields;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Collection<String> getSearchPackages() {
        return this.searchPackages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FindField ignorePackagesCase(boolean z) {
        this.ignorePackagesCase = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) {
        int iM105k;
        int iM105k2;
        int iCreateInClassesVector;
        int iCreateInFieldsVector;
        c0038c5.getClass();
        FindField.Companion companion = org.luckypray.dexkit.schema.FindField.Companion;
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
            iCreateInClassesVector = org.luckypray.dexkit.schema.FindField.Companion.createInClassesVector(c0038c5, AbstractC0241h2.m470m2(arrayList3));
        } else {
            iCreateInClassesVector = 0;
        }
        Collection<FieldData> collection4 = this.searchFields;
        if (collection4 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC0276j2.m703i2(collection4));
            Iterator<T> it4 = collection4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Long.valueOf(((FieldData) it4.next()).getEncodeId()));
            }
            iCreateInFieldsVector = org.luckypray.dexkit.schema.FindField.Companion.createInFieldsVector(c0038c5, AbstractC0241h2.m470m2(arrayList4));
        } else {
            iCreateInFieldsVector = 0;
        }
        boolean z2 = this.findFirst;
        FieldMatcher fieldMatcher = this.matcher;
        int iCreateFindField = companion.createFindField(c0038c5, iM105k, iM105k2, z, iCreateInClassesVector, iCreateInFieldsVector, z2, fieldMatcher != null ? fieldMatcher.build$dexkit_android_release(c0038c5) : 0);
        c0038c5.m108n(iCreateFindField);
        return iCreateFindField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ FindField matcher(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0482u5.invoke(fieldMatcher);
        matcher(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FindField searchInClass(Collection<ClassData> collection) {
        collection.getClass();
        this.searchClasses = collection;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FindField searchInField(Collection<FieldData> collection) {
        collection.getClass();
        this.searchFields = collection;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FindField searchPackages(String... strArr) {
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
    public final /* synthetic */ void setSearchFields(Collection collection) {
        this.searchFields = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setSearchPackages(Collection collection) {
        this.searchPackages = collection;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.FindField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FindField create() {
            return new FindField();
        }

        private Companion() {
        }
    }

    public final FindField excludePackages(Collection<String> collection) {
        collection.getClass();
        this.excludePackages = collection;
        return this;
    }

    public final FindField searchPackages(Collection<String> collection) {
        collection.getClass();
        this.searchPackages = collection;
        return this;
    }

    public final FindField matcher(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        this.matcher = fieldMatcher;
        return this;
    }
}
