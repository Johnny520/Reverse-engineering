package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.schema.ParameterMatcher;
import org.luckypray.dexkit.util.DexSignUtil;
import p007D0.C0138d;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class ParameterMatcher extends BaseQuery {
    public static final Companion Companion = null;
    private AnnotationsMatcher annotationsMatcher;
    private ClassMatcher typeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final ParameterMatcher create() {
            return new ParameterMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ParameterMatcher() {
    }

    public static final ParameterMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ ParameterMatcher type$default(ParameterMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.type(r1, r2, r3);
    }

    public final ParameterMatcher addAnnotation(AnnotationMatcher r2) {
        AbstractC0307g.m703e(r2, "annotation");
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final ParameterMatcher annotationCount(int r2) {
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ParameterMatcher annotations(AnnotationsMatcher r2) {
        AbstractC0307g.m703e(r2, "annotations");
        this.annotationsMatcher = r2;
        return this;
    }

    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    public final /* synthetic */ String getType() {
        throw new C0138d();
    }

    public final ClassMatcher getTypeMatcher() {
        return this.typeMatcher;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r5) {
        AbstractC0307g.m703e(r5, "fbb");
        ParameterMatcher.Companion r02 = org.luckypray.dexkit.schema.ParameterMatcher.Companion;
        AnnotationsMatcher r1 = this.annotationsMatcher;
        int r2 = 0;
        if (r1 == null) goto L5;
        int r12 = BaseQuery.access$innerBuild(r1, r5);
    L6:
        ClassMatcher r3 = this.typeMatcher;
        if (r3 == null) goto L9;
        r2 = BaseQuery.access$innerBuild(r3, r5);
    L9:
        int r03 = r02.createParameterMatcher(r5, r12, r2);
        r5.m1931n(r03);
        return r03;
    L5:
        r12 = 0;
        goto L6
    }

    public final /* synthetic */ void setType(String r8) {
        AbstractC0307g.m703e(r8, "value");
        type$default(this, r8, null, false, 6, null);
    }

    public final ParameterMatcher type(String r8) {
        AbstractC0307g.m703e(r8, "typeName");
        return type$default(this, r8, null, false, 6, null);
    }

    private final ParameterMatcher annotations(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationsMatcher r02 = new AnnotationsMatcher();
        r2.invoke(r02);
        annotations(r02);
        return this;
    }

    public final ParameterMatcher type(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "typeName");
        AbstractC0307g.m703e(r9, "matchType");
        return type$default(this, r8, r9, false, 4, null);
    }

    private final ParameterMatcher addAnnotation(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationMatcher r02 = new AnnotationMatcher();
        r2.invoke(r02);
        addAnnotation(r02);
        return this;
    }

    public final ParameterMatcher type(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "type");
        this.typeMatcher = r2;
        return this;
    }

    public final ParameterMatcher type(Class<?> r8) {
        AbstractC0307g.m703e(r8, "clazz");
        this.typeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(r8), null, false, 6, null);
        return this;
    }

    public final ParameterMatcher type(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "typeName");
        AbstractC0307g.m703e(r3, "matchType");
        this.typeMatcher = new ClassMatcher().className(r2, r3, r4);
        return this;
    }

    private final ParameterMatcher type(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        type(r02);
        return this;
    }
}
