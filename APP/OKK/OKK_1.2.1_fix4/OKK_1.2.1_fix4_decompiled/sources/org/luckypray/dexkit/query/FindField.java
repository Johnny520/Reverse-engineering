package org.luckypray.dexkit.query;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.matchers.FieldMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.schema.FindField;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class FindField extends BaseQuery {
    public static final Companion Companion = new Companion(null);
    private Collection<String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;
    private FieldMatcher matcher;
    private Collection<ClassData> searchClasses;
    private Collection<FieldData> searchFields;
    private Collection<String> searchPackages;

    public static final class Companion {
        private Companion() {
        }

        public final FindField create() {
            return new FindField();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public static final FindField create() {
        return Companion.create();
    }

    public final FindField excludePackages(String... strArr) {
        AbstractC0307g.m703e(strArr, "excludePackages");
        this.excludePackages = AbstractC0179j.m540q0(strArr);
        return this;
    }

    public final Collection<String> getExcludePackages() {
        return this.excludePackages;
    }

    public final boolean getFindFirst() {
        return this.findFirst;
    }

    public final boolean getIgnorePackagesCase() {
        return this.ignorePackagesCase;
    }

    public final FieldMatcher getMatcher() {
        return this.matcher;
    }

    public final Collection<ClassData> getSearchClasses() {
        return this.searchClasses;
    }

    public final Collection<FieldData> getSearchFields() {
        return this.searchFields;
    }

    public final Collection<String> getSearchPackages() {
        return this.searchPackages;
    }

    public final FindField ignorePackagesCase(boolean z2) {
        this.ignorePackagesCase = z2;
        return this;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        int iM1928k;
        int iM1928k2;
        int iCreateInClassesVector;
        int iCreateInFieldsVector;
        AbstractC0307g.m703e(c0733b, "fbb");
        FindField.Companion companion = org.luckypray.dexkit.schema.FindField.Companion;
        Collection<String> collection = this.searchPackages;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c0733b.m1927j((String) it.next())));
            }
            iM1928k = c0733b.m1928k(AbstractC0181l.m552x0(arrayList));
        } else {
            iM1928k = 0;
        }
        Collection<String> collection2 = this.excludePackages;
        if (collection2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0183n.m559k0(collection2, 10));
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(c0733b.m1927j((String) it2.next())));
            }
            iM1928k2 = c0733b.m1928k(AbstractC0181l.m552x0(arrayList2));
        } else {
            iM1928k2 = 0;
        }
        boolean z2 = this.ignorePackagesCase;
        Collection<ClassData> collection3 = this.searchClasses;
        if (collection3 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC0183n.m559k0(collection3, 10));
            Iterator<T> it3 = collection3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(((ClassData) it3.next()).getEncodeId()));
            }
            iCreateInClassesVector = org.luckypray.dexkit.schema.FindField.Companion.createInClassesVector(c0733b, AbstractC0181l.m554z0(arrayList3));
        } else {
            iCreateInClassesVector = 0;
        }
        Collection<FieldData> collection4 = this.searchFields;
        if (collection4 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC0183n.m559k0(collection4, 10));
            Iterator<T> it4 = collection4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Long.valueOf(((FieldData) it4.next()).getEncodeId()));
            }
            iCreateInFieldsVector = org.luckypray.dexkit.schema.FindField.Companion.createInFieldsVector(c0733b, AbstractC0181l.m554z0(arrayList4));
        } else {
            iCreateInFieldsVector = 0;
        }
        boolean z3 = this.findFirst;
        FieldMatcher fieldMatcher = this.matcher;
        int iCreateFindField = companion.createFindField(c0733b, iM1928k, iM1928k2, z2, iCreateInClassesVector, iCreateInFieldsVector, z3, fieldMatcher != null ? fieldMatcher.innerBuild(c0733b) : 0);
        c0733b.m1931n(iCreateFindField);
        return iCreateFindField;
    }

    public final FindField matcher(FieldMatcher fieldMatcher) {
        AbstractC0307g.m703e(fieldMatcher, "matcher");
        this.matcher = fieldMatcher;
        return this;
    }

    public final FindField searchInClass(Collection<ClassData> collection) {
        AbstractC0307g.m703e(collection, "classes");
        this.searchClasses = collection;
        return this;
    }

    public final FindField searchInField(Collection<FieldData> collection) {
        AbstractC0307g.m703e(collection, "fields");
        this.searchFields = collection;
        return this;
    }

    public final FindField searchPackages(String... strArr) {
        AbstractC0307g.m703e(strArr, "searchPackages");
        this.searchPackages = AbstractC0179j.m540q0(strArr);
        return this;
    }

    public final /* synthetic */ void setExcludePackages(Collection collection) {
        this.excludePackages = collection;
    }

    public final /* synthetic */ void setFindFirst(boolean z2) {
        this.findFirst = z2;
    }

    public final /* synthetic */ void setIgnorePackagesCase(boolean z2) {
        this.ignorePackagesCase = z2;
    }

    public final /* synthetic */ void setSearchClasses(Collection collection) {
        this.searchClasses = collection;
    }

    public final /* synthetic */ void setSearchFields(Collection collection) {
        this.searchFields = collection;
    }

    public final /* synthetic */ void setSearchPackages(Collection collection) {
        this.searchPackages = collection;
    }

    private final FindField matcher(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0286l.invoke(fieldMatcher);
        matcher(fieldMatcher);
        return this;
    }

    public final FindField excludePackages(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "excludePackages");
        this.excludePackages = collection;
        return this;
    }

    public final FindField searchPackages(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "searchPackages");
        this.searchPackages = collection;
        return this;
    }
}
