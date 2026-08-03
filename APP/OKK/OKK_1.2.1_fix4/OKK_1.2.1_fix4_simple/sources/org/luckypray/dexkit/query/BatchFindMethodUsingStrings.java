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
    public static final Companion Companion = null;
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

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BatchFindMethodUsingStrings() {
    }

    public static /* synthetic */ BatchFindMethodUsingStrings addSearchGroup$default(BatchFindMethodUsingStrings r02, String r1, Collection r2, StringMatchType r3, boolean r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = StringMatchType.Contains;
    L6:
        if ((r5 & 8) == 0) goto L9;
        r4 = false;
    L9:
        return r02.addSearchGroup(r1, r2, r3, r4);
    }

    public static final BatchFindMethodUsingStrings create() {
        return Companion.create();
    }

    public static /* synthetic */ BatchFindMethodUsingStrings groups$default(BatchFindMethodUsingStrings r02, Map r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.groups(r1, r2, r3);
    }

    public final BatchFindMethodUsingStrings addSearchGroup(String r9, Collection<String> r10) {
        AbstractC0307g.m703e(r9, "groupName");
        AbstractC0307g.m703e(r10, "usingStrings");
        return addSearchGroup$default(this, r9, r10, null, false, 12, null);
    }

    public final BatchFindMethodUsingStrings excludePackages(String... r2) {
        AbstractC0307g.m703e(r2, "excludePackages");
        this.excludePackages = AbstractC0179j.m540q0(r2);
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

    public final BatchFindMethodUsingStrings groups(Map<String, ? extends Collection<String>> r8) {
        AbstractC0307g.m703e(r8, "keywordsMap");
        return groups$default(this, r8, null, false, 6, null);
    }

    public final BatchFindMethodUsingStrings ignorePackagesCase(boolean r1) {
        this.ignorePackagesCase = r1;
        return this;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r12) {
        AbstractC0307g.m703e(r12, "fbb");
        List<StringMatchersGroup> r02 = this.searchGroups;
        if (r02 == null) goto L51;
        ArrayList r1 = new ArrayList(AbstractC0183n.m559k0(r02, 10));
        Iterator<T> r03 = r02.iterator();
    L6:
        if (r03.hasNext() == false) goto L8;
        r1.add(((StringMatchersGroup) r03.next()).getGroupName());
        goto L6
    L8:
        int r04 = AbstractC0181l.m542B0(r1).size();
        List<StringMatchersGroup> r13 = this.searchGroups;
        AbstractC0307g.m700b(r13);
        if (r04 < r13.size()) goto L49;
        BatchFindMethodUsingStrings.Companion r3 = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion;
        Collection<String> r05 = this.searchPackages;
        if (r05 == null) goto L17;
        ArrayList r4 = new ArrayList(AbstractC0183n.m559k0(r05, 10));
        Iterator<T> r06 = r05.iterator();
    L14:
        if (r06.hasNext() == false) goto L16;
        r4.add(Integer.valueOf(r12.m1927j((String) r06.next())));
        goto L14
    L16:
        int r5 = r12.m1928k(AbstractC0181l.m552x0(r4));
    L18:
        Collection<String> r07 = this.excludePackages;
        if (r07 == null) goto L25;
        ArrayList r42 = new ArrayList(AbstractC0183n.m559k0(r07, 10));
        Iterator<T> r08 = r07.iterator();
    L22:
        if (r08.hasNext() == false) goto L24;
        r42.add(Integer.valueOf(r12.m1927j((String) r08.next())));
        goto L22
    L24:
        int r6 = r12.m1928k(AbstractC0181l.m552x0(r42));
    L26:
        boolean r7 = this.ignorePackagesCase;
        Collection<ClassData> r09 = this.searchClasses;
        if (r09 == null) goto L33;
        ArrayList r43 = new ArrayList(AbstractC0183n.m559k0(r09, 10));
        Iterator<T> r010 = r09.iterator();
    L30:
        if (r010.hasNext() == false) goto L32;
        r43.add(Long.valueOf(((ClassData) r010.next()).getEncodeId()));
        goto L30
    L32:
        int r8 = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion.createInClassesVector(r12, AbstractC0181l.m554z0(r43));
    L34:
        Collection<MethodData> r011 = this.searchMethods;
        if (r011 == null) goto L41;
        ArrayList r14 = new ArrayList(AbstractC0183n.m559k0(r011, 10));
        Iterator<T> r012 = r011.iterator();
    L38:
        if (r012.hasNext() == false) goto L40;
        r14.add(Long.valueOf(((MethodData) r012.next()).getEncodeId()));
        goto L38
    L40:
        int r9 = org.luckypray.dexkit.schema.BatchFindMethodUsingStrings.Companion.createInMethodsVector(r12, AbstractC0181l.m554z0(r14));
    L42:
        List<StringMatchersGroup> r013 = this.searchGroups;
        AbstractC0307g.m700b(r013);
        ArrayList r15 = new ArrayList(AbstractC0183n.m559k0(r013, 10));
        Iterator<T> r014 = r013.iterator();
    L44:
        if (r014.hasNext() == false) goto L46;
        r15.add(Integer.valueOf(BaseQuery.access$innerBuild((StringMatchersGroup) r014.next(), r12)));
        goto L44
    L46:
        int r015 = r3.createBatchFindMethodUsingStrings(r12, r5, r6, r7, r8, r9, r12.m1928k(AbstractC0181l.m552x0(r15)));
        r12.m1931n(r015);
        return r015;
    L41:
        r9 = 0;
        goto L42
    L33:
        r8 = 0;
        goto L34
    L25:
        r6 = 0;
        goto L26
    L17:
        r5 = 0;
        goto L18
    L49:
        throw new IllegalAccessException("groupName must be unique");
    L51:
        throw new IllegalAccessException("searchGroups not be empty");
    }

    public final BatchFindMethodUsingStrings searchInClasses(Collection<ClassData> r2) {
        AbstractC0307g.m703e(r2, "classes");
        this.searchClasses = r2;
        return this;
    }

    public final BatchFindMethodUsingStrings searchInMethods(Collection<MethodData> r2) {
        AbstractC0307g.m703e(r2, "methods");
        this.searchMethods = r2;
        return this;
    }

    public final BatchFindMethodUsingStrings searchPackages(String... r2) {
        AbstractC0307g.m703e(r2, "searchPackages");
        this.searchPackages = AbstractC0179j.m540q0(r2);
        return this;
    }

    public final /* synthetic */ void setExcludePackages(Collection r1) {
        this.excludePackages = r1;
    }

    public final /* synthetic */ void setIgnorePackagesCase(boolean r1) {
        this.ignorePackagesCase = r1;
    }

    public final /* synthetic */ void setSearchClasses(Collection r1) {
        this.searchClasses = r1;
    }

    public final /* synthetic */ void setSearchMethods(Collection r1) {
        this.searchMethods = r1;
    }

    public final /* synthetic */ void setSearchPackages(Collection r1) {
        this.searchPackages = r1;
    }

    public final BatchFindMethodUsingStrings addSearchGroup(String r9, Collection<String> r10, StringMatchType r11) {
        AbstractC0307g.m703e(r9, "groupName");
        AbstractC0307g.m703e(r10, "usingStrings");
        AbstractC0307g.m703e(r11, "matchType");
        return addSearchGroup$default(this, r9, r10, r11, false, 8, null);
    }

    public final BatchFindMethodUsingStrings excludePackages(Collection<String> r2) {
        AbstractC0307g.m703e(r2, "excludePackages");
        this.excludePackages = r2;
        return this;
    }

    public final BatchFindMethodUsingStrings groups(Map<String, ? extends Collection<String>> r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "keywordsMap");
        AbstractC0307g.m703e(r9, "matchType");
        return groups$default(this, r8, r9, false, 4, null);
    }

    public final BatchFindMethodUsingStrings searchPackages(Collection<String> r2) {
        AbstractC0307g.m703e(r2, "searchPackages");
        this.searchPackages = r2;
        return this;
    }

    public final BatchFindMethodUsingStrings addSearchGroup(StringMatchersGroup r2) {
        AbstractC0307g.m703e(r2, "matcher");
        List<StringMatchersGroup> r02 = this.searchGroups;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.searchGroups = r02;
        r02.add(r2);
        return this;
    }

    public final BatchFindMethodUsingStrings groups(Collection<StringMatchersGroup> r2) {
        AbstractC0307g.m703e(r2, "groups");
        this.searchGroups = AbstractC0181l.m541A0(r2);
        return this;
    }

    private final BatchFindMethodUsingStrings groups(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        StringMatchersGroupList r02 = new StringMatchersGroupList();
        r2.invoke(r02);
        groups(r02);
        return this;
    }

    private final BatchFindMethodUsingStrings addSearchGroup(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        StringMatchersGroup r02 = new StringMatchersGroup();
        r2.invoke(r02);
        addSearchGroup(r02);
        return this;
    }

    public final BatchFindMethodUsingStrings groups(Map<String, ? extends Collection<String>> r7, StringMatchType r8, boolean r9) {
        AbstractC0307g.m703e(r7, "keywordsMap");
        AbstractC0307g.m703e(r8, "matchType");
        ArrayList r02 = new ArrayList(r7.size());
        Iterator<Map.Entry<String, ? extends Collection<String>>> r72 = r7.entrySet().iterator();
    L4:
        if (r72.hasNext() == false) goto L10;
        Map.Entry<String, ? extends Collection<String>> r1 = r72.next();
        String r2 = r1.getKey();
        Collection<String> r12 = r1.getValue();
        ArrayList r3 = new ArrayList(AbstractC0183n.m559k0(r12, 10));
        Iterator<T> r13 = r12.iterator();
    L7:
        if (r13.hasNext() == false) goto L9;
        r3.add(new StringMatcher((String) r13.next(), r8, r9));
        goto L7
    L9:
        r02.add(new StringMatchersGroup(r2, r3));
        goto L4
    L10:
        this.searchGroups = AbstractC0181l.m541A0(r02);
        return this;
    }

    private final BatchFindMethodUsingStrings addSearchGroup(String r3, InterfaceC0286l r4) {
        AbstractC0307g.m703e(r3, "groupName");
        AbstractC0307g.m703e(r4, "init");
        StringMatcherList r1 = new StringMatcherList();
        r4.invoke(r1);
        addSearchGroup(new StringMatchersGroup(r3, r1));
        return this;
    }

    public final BatchFindMethodUsingStrings addSearchGroup(String r4, Collection<String> r5, StringMatchType r6, boolean r7) {
        AbstractC0307g.m703e(r4, "groupName");
        AbstractC0307g.m703e(r5, "usingStrings");
        AbstractC0307g.m703e(r6, "matchType");
        ArrayList r02 = new ArrayList(AbstractC0183n.m559k0(r5, 10));
        Iterator<T> r52 = r5.iterator();
    L4:
        if (r52.hasNext() == false) goto L6;
        r02.add(new StringMatcher((String) r52.next(), r6, r7));
        goto L4
    L6:
        addSearchGroup(new StringMatchersGroup(r4, r02));
        return this;
    }
}
