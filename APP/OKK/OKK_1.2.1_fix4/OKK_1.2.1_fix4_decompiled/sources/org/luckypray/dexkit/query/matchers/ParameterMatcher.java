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
    public static final Companion Companion = new Companion(null);
    private AnnotationsMatcher annotationsMatcher;
    private ClassMatcher typeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final ParameterMatcher create() {
            return new ParameterMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public static final ParameterMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ ParameterMatcher type$default(ParameterMatcher parameterMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return parameterMatcher.type(str, stringMatchType, z2);
    }

    public final ParameterMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
        AbstractC0307g.m703e(annotationMatcher, "annotation");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.add(annotationMatcher);
        return this;
    }

    public final ParameterMatcher annotationCount(int i2) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.setCount(i2);
        return this;
    }

    public final ParameterMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        AbstractC0307g.m703e(annotationsMatcher, "annotations");
        this.annotationsMatcher = annotationsMatcher;
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
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        ParameterMatcher.Companion companion = org.luckypray.dexkit.schema.ParameterMatcher.Companion;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iInnerBuild = annotationsMatcher != null ? annotationsMatcher.innerBuild(c0733b) : 0;
        ClassMatcher classMatcher = this.typeMatcher;
        int iCreateParameterMatcher = companion.createParameterMatcher(c0733b, iInnerBuild, classMatcher != null ? classMatcher.innerBuild(c0733b) : 0);
        c0733b.m1931n(iCreateParameterMatcher);
        return iCreateParameterMatcher;
    }

    public final /* synthetic */ void setType(String str) {
        AbstractC0307g.m703e(str, "value");
        type$default(this, str, null, false, 6, null);
    }

    public final ParameterMatcher type(String str) {
        AbstractC0307g.m703e(str, "typeName");
        return type$default(this, str, null, false, 6, null);
    }

    private final ParameterMatcher annotations(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        interfaceC0286l.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    public final ParameterMatcher type(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    private final ParameterMatcher addAnnotation(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0286l.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public final ParameterMatcher type(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "type");
        this.typeMatcher = classMatcher;
        return this;
    }

    public final ParameterMatcher type(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        this.typeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(cls), null, false, 6, null);
        return this;
    }

    public final ParameterMatcher type(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.typeMatcher = new ClassMatcher().className(str, stringMatchType, z2);
        return this;
    }

    private final ParameterMatcher type(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        type(classMatcher);
        return this;
    }
}
