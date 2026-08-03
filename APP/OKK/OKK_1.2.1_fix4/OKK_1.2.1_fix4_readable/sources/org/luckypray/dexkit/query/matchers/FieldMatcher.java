package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.lang.reflect.Field;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.FieldMatcher;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexField;
import p007D0.C0138d;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class FieldMatcher extends BaseQuery implements IAnnotationEncodeValue {
    public static final Companion Companion = new Companion(null);
    private AnnotationsMatcher annotationsMatcher;
    private ClassMatcher classMatcher;
    private MethodsMatcher getMethodsMatcher;
    private AccessFlagsMatcher modifiersMatcher;
    private StringMatcher nameMatcher;
    private MethodsMatcher putMethodsMatcher;
    private ClassMatcher typeMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final FieldMatcher create() {
            return new FieldMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final FieldMatcher create(Field field) {
            AbstractC0307g.m703e(field, "field");
            return new FieldMatcher(field);
        }

        public final FieldMatcher create(String str) {
            AbstractC0307g.m703e(str, "descriptor");
            return new FieldMatcher(str);
        }
    }

    public FieldMatcher() {
    }

    public static /* synthetic */ FieldMatcher annotationCount$default(FieldMatcher fieldMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return fieldMatcher.annotationCount(i2, i3);
    }

    public static final FieldMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ FieldMatcher declaredClass$default(FieldMatcher fieldMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return fieldMatcher.declaredClass(str, stringMatchType, z2);
    }

    public static /* synthetic */ FieldMatcher modifiers$default(FieldMatcher fieldMatcher, int i2, MatchType matchType, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return fieldMatcher.modifiers(i2, matchType);
    }

    public static /* synthetic */ FieldMatcher name$default(FieldMatcher fieldMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return fieldMatcher.name(str, stringMatchType, z2);
    }

    public static /* synthetic */ FieldMatcher type$default(FieldMatcher fieldMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return fieldMatcher.type(str, stringMatchType, z2);
    }

    public final FieldMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
        AbstractC0307g.m703e(annotationMatcher, "annotation");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.add(annotationMatcher);
        return this;
    }

    public final FieldMatcher addReadMethod(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "readMethod");
        MethodsMatcher methodsMatcher = this.getMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.getMethodsMatcher = methodsMatcher;
        methodsMatcher.add(methodMatcher);
        return this;
    }

    public final FieldMatcher addWriteMethod(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "writeMethod");
        MethodsMatcher methodsMatcher = this.putMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.putMethodsMatcher = methodsMatcher;
        methodsMatcher.add(methodMatcher);
        return this;
    }

    public final FieldMatcher annotationCount(int i2) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.setCount(i2);
        return this;
    }

    public final FieldMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        AbstractC0307g.m703e(annotationsMatcher, "annotations");
        this.annotationsMatcher = annotationsMatcher;
        return this;
    }

    public final FieldMatcher declaredClass(String str) {
        AbstractC0307g.m703e(str, "className");
        return declaredClass$default(this, str, null, false, 6, null);
    }

    public final FieldMatcher descriptor(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        DexField dexField = new DexField(str);
        name$default(this, dexField.getName(), null, false, 6, null);
        declaredClass$default(this, dexField.getClassName(), null, false, 6, null);
        type$default(this, dexField.getTypeName(), null, false, 6, null);
        return this;
    }

    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    public final ClassMatcher getClassMatcher() {
        return this.classMatcher;
    }

    public final /* synthetic */ String getDeclaredClass() {
        throw new C0138d();
    }

    public final /* synthetic */ String getDescriptor() {
        throw new C0138d();
    }

    public final MethodsMatcher getGetMethodsMatcher() {
        return this.getMethodsMatcher;
    }

    public final /* synthetic */ int getModifiers() {
        throw new C0138d();
    }

    public final AccessFlagsMatcher getModifiersMatcher() {
        return this.modifiersMatcher;
    }

    public final /* synthetic */ String getName() {
        throw new C0138d();
    }

    public final StringMatcher getNameMatcher() {
        return this.nameMatcher;
    }

    public final MethodsMatcher getPutMethodsMatcher() {
        return this.putMethodsMatcher;
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
        FieldMatcher.Companion companion = org.luckypray.dexkit.schema.FieldMatcher.Companion;
        StringMatcher stringMatcher = this.nameMatcher;
        int iInnerBuild = stringMatcher != null ? stringMatcher.innerBuild(c0733b) : 0;
        AccessFlagsMatcher accessFlagsMatcher = this.modifiersMatcher;
        int iInnerBuild2 = accessFlagsMatcher != null ? accessFlagsMatcher.innerBuild(c0733b) : 0;
        ClassMatcher classMatcher = this.classMatcher;
        int iInnerBuild3 = classMatcher != null ? classMatcher.innerBuild(c0733b) : 0;
        ClassMatcher classMatcher2 = this.typeMatcher;
        int iInnerBuild4 = classMatcher2 != null ? classMatcher2.innerBuild(c0733b) : 0;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iInnerBuild5 = annotationsMatcher != null ? annotationsMatcher.innerBuild(c0733b) : 0;
        MethodsMatcher methodsMatcher = this.getMethodsMatcher;
        int iInnerBuild6 = methodsMatcher != null ? methodsMatcher.innerBuild(c0733b) : 0;
        MethodsMatcher methodsMatcher2 = this.putMethodsMatcher;
        int iCreateFieldMatcher = companion.createFieldMatcher(c0733b, iInnerBuild, iInnerBuild2, iInnerBuild3, iInnerBuild4, iInnerBuild5, iInnerBuild6, methodsMatcher2 != null ? methodsMatcher2.innerBuild(c0733b) : 0);
        c0733b.m1931n(iCreateFieldMatcher);
        return iCreateFieldMatcher;
    }

    public final FieldMatcher modifiers(int i2) {
        return modifiers$default(this, i2, null, 2, null);
    }

    public final FieldMatcher name(String str) {
        AbstractC0307g.m703e(str, "name");
        return name$default(this, str, null, false, 6, null);
    }

    public final FieldMatcher readMethods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "readMethods");
        this.getMethodsMatcher = methodsMatcher;
        return this;
    }

    public final /* synthetic */ void setDeclaredClass(String str) {
        AbstractC0307g.m703e(str, "value");
        declaredClass$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setDescriptor(String str) {
        AbstractC0307g.m703e(str, "value");
        descriptor(str);
    }

    public final /* synthetic */ void setModifiers(int i2) {
        modifiers$default(this, i2, null, 2, null);
    }

    public final /* synthetic */ void setName(String str) {
        AbstractC0307g.m703e(str, "value");
        name$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setType(String str) {
        AbstractC0307g.m703e(str, "value");
        type$default(this, str, null, false, 6, null);
    }

    public final FieldMatcher type(String str) {
        AbstractC0307g.m703e(str, "typeName");
        return type$default(this, str, null, false, 6, null);
    }

    public final FieldMatcher writeMethods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "writeMethods");
        this.putMethodsMatcher = methodsMatcher;
        return this;
    }

    public FieldMatcher(Field field) {
        AbstractC0307g.m703e(field, "field");
        descriptor(DexSignUtil.getFieldDescriptor(field));
    }

    private final FieldMatcher annotations(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        interfaceC0286l.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    public static final FieldMatcher create(String str) {
        return Companion.create(str);
    }

    private final FieldMatcher readMethods(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0286l.invoke(methodsMatcher);
        readMethods(methodsMatcher);
        return this;
    }

    private final FieldMatcher writeMethods(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0286l.invoke(methodsMatcher);
        writeMethods(methodsMatcher);
        return this;
    }

    public final FieldMatcher declaredClass(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return declaredClass$default(this, str, stringMatchType, false, 4, null);
    }

    public final FieldMatcher modifiers(AccessFlagsMatcher accessFlagsMatcher) {
        AbstractC0307g.m703e(accessFlagsMatcher, "modifiers");
        this.modifiersMatcher = accessFlagsMatcher;
        return this;
    }

    public final FieldMatcher name(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "name");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    public final FieldMatcher type(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    private final FieldMatcher addAnnotation(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0286l.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public static final FieldMatcher create(Field field) {
        return Companion.create(field);
    }

    public final FieldMatcher addReadMethod(String str) {
        AbstractC0307g.m703e(str, "methodDescriptor");
        MethodsMatcher methodsMatcher = this.getMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.getMethodsMatcher = methodsMatcher;
        methodsMatcher.add(new MethodMatcher(str));
        return this;
    }

    public final FieldMatcher addWriteMethod(String str) {
        AbstractC0307g.m703e(str, "methodDescriptor");
        MethodsMatcher methodsMatcher = this.putMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.putMethodsMatcher = methodsMatcher;
        methodsMatcher.add(new MethodMatcher(str));
        return this;
    }

    public final FieldMatcher annotationCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(intRange);
        return this;
    }

    public final FieldMatcher declaredClass(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "declaredClass");
        this.classMatcher = classMatcher;
        return this;
    }

    public final FieldMatcher modifiers(int i2, MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        this.modifiersMatcher = new AccessFlagsMatcher(i2, matchType);
        return this;
    }

    public final FieldMatcher name(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "name");
        this.nameMatcher = stringMatcher;
        return this;
    }

    public final FieldMatcher type(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "type");
        this.typeMatcher = classMatcher;
        return this;
    }

    public FieldMatcher(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        descriptor(str);
    }

    public final FieldMatcher declaredClass(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        this.classMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(cls), null, false, 6, null);
        return this;
    }

    public final FieldMatcher name(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "name");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.nameMatcher = new StringMatcher(str, stringMatchType, z2);
        return this;
    }

    public final FieldMatcher type(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        this.typeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(cls), null, false, 6, null);
        return this;
    }

    private final FieldMatcher addReadMethod(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        addReadMethod(methodMatcher);
        return this;
    }

    private final FieldMatcher addWriteMethod(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        addWriteMethod(methodMatcher);
        return this;
    }

    public final FieldMatcher annotationCount(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(c0340c);
        return this;
    }

    public final FieldMatcher declaredClass(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.classMatcher = new ClassMatcher().className(str, stringMatchType, z2);
        return this;
    }

    public final FieldMatcher type(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.typeMatcher = new ClassMatcher().className(str, stringMatchType, z2);
        return this;
    }

    private final FieldMatcher declaredClass(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        declaredClass(classMatcher);
        return this;
    }

    private final FieldMatcher type(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        type(classMatcher);
        return this;
    }

    public final FieldMatcher annotationCount(int i2, int i3) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(i2, i3);
        return this;
    }
}
