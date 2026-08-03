package org.luckypray.dexkit.query;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.schema.FindClass;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class FindClass extends BaseQuery {
    public static final Companion Companion = null;
    private Collection<String> excludePackages;
    private boolean findFirst;
    private boolean ignorePackagesCase;
    private ClassMatcher matcher;
    private Collection<ClassData> searchClasses;
    private Collection<String> searchPackages;

    public static final class Companion {
        private Companion() {
        }

        public final FindClass create() {
            return new FindClass();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public FindClass() {
    }

    public static final FindClass create() {
        return Companion.create();
    }

    public final FindClass excludePackages(String... r2) {
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

    public final ClassMatcher getMatcher() {
        return this.matcher;
    }

    public final Collection<ClassData> getSearchClasses() {
        return this.searchClasses;
    }

    public final Collection<String> getSearchPackages() {
        return this.searchPackages;
    }

    public final FindClass ignorePackagesCase(boolean r1) {
        this.ignorePackagesCase = r1;
        return this;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r11) {
        AbstractC0307g.m703e(r11, "fbb");
        FindClass.Companion r1 = org.luckypray.dexkit.schema.FindClass.Companion;
        Collection<String> r02 = this.searchPackages;
        if (r02 == null) goto L9;
        ArrayList r4 = new ArrayList(AbstractC0183n.m559k0(r02, 10));
        Iterator<T> r03 = r02.iterator();
    L6:
        if (r03.hasNext() == false) goto L8;
        r4.add(Integer.valueOf(r11.m1927j((String) r03.next())));
        goto L6
    L8:
        int r04 = r11.m1928k(AbstractC0181l.m552x0(r4));
    L10:
        Collection<String> r42 = this.excludePackages;
        if (r42 == null) goto L17;
        ArrayList r5 = new ArrayList(AbstractC0183n.m559k0(r42, 10));
        Iterator<T> r43 = r42.iterator();
    L14:
        if (r43.hasNext() == false) goto L16;
        r5.add(Integer.valueOf(r11.m1927j((String) r43.next())));
        goto L14
    L16:
        int r44 = r11.m1928k(AbstractC0181l.m552x0(r5));
    L18:
        boolean r52 = this.ignorePackagesCase;
        Collection<ClassData> r6 = this.searchClasses;
        if (r6 == null) goto L25;
        ArrayList r7 = new ArrayList(AbstractC0183n.m559k0(r6, 10));
        Iterator<T> r2 = r6.iterator();
    L22:
        if (r2.hasNext() == false) goto L24;
        r7.add(Long.valueOf(((ClassData) r2.next()).getEncodeId()));
        goto L22
    L24:
        int r62 = org.luckypray.dexkit.schema.FindClass.Companion.createInClassesVector(r11, AbstractC0181l.m554z0(r7));
    L26:
        boolean r72 = this.findFirst;
        ClassMatcher r22 = this.matcher;
        if (r22 == null) goto L29;
        int r8 = BaseQuery.access$innerBuild(r22, r11);
    L30:
        int r05 = r1.createFindClass(r11, r04, r44, r52, r62, r72, r8);
        r11.m1931n(r05);
        return r05;
    L29:
        r8 = 0;
        goto L30
    L25:
        r62 = 0;
        goto L26
    L17:
        r44 = 0;
        goto L18
    L9:
        r04 = 0;
        goto L10
    }

    public final FindClass matcher(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "matcher");
        this.matcher = r2;
        return this;
    }

    public final FindClass searchIn(Collection<ClassData> r2) {
        AbstractC0307g.m703e(r2, "classes");
        this.searchClasses = r2;
        return this;
    }

    public final FindClass searchPackages(String... r2) {
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

    public final /* synthetic */ void setSearchPackages(Collection r1) {
        this.searchPackages = r1;
    }

    private final FindClass matcher(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        matcher(r02);
        return this;
    }

    public final FindClass excludePackages(Collection<String> r2) {
        AbstractC0307g.m703e(r2, "excludePackages");
        this.excludePackages = r2;
        return this;
    }

    public final FindClass searchPackages(Collection<String> r2) {
        AbstractC0307g.m703e(r2, "searchPackages");
        this.searchPackages = r2;
        return this;
    }
}
