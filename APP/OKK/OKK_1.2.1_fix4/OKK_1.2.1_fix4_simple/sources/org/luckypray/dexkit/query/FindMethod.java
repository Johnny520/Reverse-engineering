package org.luckypray.dexkit.query;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.schema.FindMethod;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class FindMethod extends BaseQuery {
    public static final Companion Companion = null;
    private Collection<String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;
    private MethodMatcher matcher;
    private Collection<ClassData> searchClasses;
    private Collection<MethodData> searchMethods;
    private Collection<String> searchPackages;

    public static final class Companion {
        private Companion() {
        }

        public final FindMethod create() {
            return new FindMethod();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public FindMethod() {
    }

    public static final FindMethod create() {
        return Companion.create();
    }

    public final FindMethod excludePackages(String... r2) {
        AbstractC0307g.m703e(r2, "excludePackages");
        this.excludePackages = AbstractC0179j.m540q0(r2);
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

    public final MethodMatcher getMatcher() {
        return this.matcher;
    }

    public final Collection<ClassData> getSearchClasses() {
        return this.searchClasses;
    }

    public final Collection<MethodData> getSearchMethods() {
        return this.searchMethods;
    }

    public final Collection<String> getSearchPackages() {
        return this.searchPackages;
    }

    public final FindMethod ignorePackagesCase(boolean r1) {
        this.ignorePackagesCase = r1;
        return this;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r12) {
        AbstractC0307g.m703e(r12, "fbb");
        FindMethod.Companion r1 = org.luckypray.dexkit.schema.FindMethod.Companion;
        Collection<String> r02 = this.searchPackages;
        if (r02 == null) goto L9;
        ArrayList r4 = new ArrayList(AbstractC0183n.m559k0(r02, 10));
        Iterator<T> r03 = r02.iterator();
    L6:
        if (r03.hasNext() == false) goto L8;
        r4.add(Integer.valueOf(r12.m1927j((String) r03.next())));
        goto L6
    L8:
        int r04 = r12.m1928k(AbstractC0181l.m552x0(r4));
    L10:
        Collection<String> r42 = this.excludePackages;
        if (r42 == null) goto L17;
        ArrayList r5 = new ArrayList(AbstractC0183n.m559k0(r42, 10));
        Iterator<T> r43 = r42.iterator();
    L14:
        if (r43.hasNext() == false) goto L16;
        r5.add(Integer.valueOf(r12.m1927j((String) r43.next())));
        goto L14
    L16:
        int r44 = r12.m1928k(AbstractC0181l.m552x0(r5));
    L18:
        boolean r52 = this.ignorePackagesCase;
        Collection<ClassData> r6 = this.searchClasses;
        if (r6 == null) goto L25;
        ArrayList r7 = new ArrayList(AbstractC0183n.m559k0(r6, 10));
        Iterator<T> r62 = r6.iterator();
    L22:
        if (r62.hasNext() == false) goto L24;
        r7.add(Long.valueOf(((ClassData) r62.next()).getEncodeId()));
        goto L22
    L24:
        int r63 = org.luckypray.dexkit.schema.FindMethod.Companion.createInClassesVector(r12, AbstractC0181l.m554z0(r7));
    L26:
        Collection<MethodData> r72 = this.searchMethods;
        if (r72 == null) goto L33;
        ArrayList r8 = new ArrayList(AbstractC0183n.m559k0(r72, 10));
        Iterator<T> r2 = r72.iterator();
    L30:
        if (r2.hasNext() == false) goto L32;
        r8.add(Long.valueOf(((MethodData) r2.next()).getEncodeId()));
        goto L30
    L32:
        int r73 = org.luckypray.dexkit.schema.FindMethod.Companion.createInMethodsVector(r12, AbstractC0181l.m554z0(r8));
    L34:
        boolean r82 = this.findFirst;
        MethodMatcher r22 = this.matcher;
        if (r22 == null) goto L37;
        int r9 = BaseQuery.access$innerBuild(r22, r12);
    L38:
        int r05 = r1.createFindMethod(r12, r04, r44, r52, r63, r73, r82, r9);
        r12.m1931n(r05);
        return r05;
    L37:
        r9 = 0;
        goto L38
    L33:
        r73 = 0;
        goto L34
    L25:
        r63 = 0;
        goto L26
    L17:
        r44 = 0;
        goto L18
    L9:
        r04 = 0;
        goto L10
    }

    public final FindMethod matcher(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "matcher");
        this.matcher = r2;
        return this;
    }

    public final FindMethod searchInClass(Collection<ClassData> r2) {
        AbstractC0307g.m703e(r2, "classes");
        this.searchClasses = r2;
        return this;
    }

    public final FindMethod searchInMethod(Collection<MethodData> r2) {
        AbstractC0307g.m703e(r2, "methods");
        this.searchMethods = r2;
        return this;
    }

    public final FindMethod searchPackages(String... r2) {
        AbstractC0307g.m703e(r2, "searchPackages");
        this.searchPackages = AbstractC0179j.m540q0(r2);
        return this;
    }

    public final /* synthetic */ void setExcludePackages(Collection r1) {
        this.excludePackages = r1;
    }

    public final /* synthetic */ void setFindFirst(boolean r1) {
        this.findFirst = r1;
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

    private final FindMethod matcher(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        matcher(r02);
        return this;
    }

    public final FindMethod excludePackages(Collection<String> r2) {
        AbstractC0307g.m703e(r2, "excludePackages");
        this.excludePackages = r2;
        return this;
    }

    public final FindMethod searchPackages(Collection<String> r2) {
        AbstractC0307g.m703e(r2, "searchPackages");
        this.searchPackages = r2;
        return this;
    }
}
