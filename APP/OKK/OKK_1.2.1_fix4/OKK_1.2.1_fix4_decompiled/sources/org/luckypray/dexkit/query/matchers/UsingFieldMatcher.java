package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.lang.reflect.Field;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.enums.UsingType;
import org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.UsingFieldMatcher;
import org.luckypray.dexkit.wrap.DexField;
import p007D0.C0138d;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class UsingFieldMatcher extends BaseQuery {
    public static final Companion Companion = new Companion(null);
    private FieldMatcher matcher;
    private UsingType usingType;

    public static final class Companion {
        private Companion() {
        }

        public final UsingFieldMatcher create() {
            return new UsingFieldMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public UsingFieldMatcher() {
        this.usingType = UsingType.Any;
    }

    public static /* synthetic */ UsingFieldMatcher annotationCount$default(UsingFieldMatcher usingFieldMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return usingFieldMatcher.annotationCount(i2, i3);
    }

    public static final UsingFieldMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ UsingFieldMatcher declaredClass$default(UsingFieldMatcher usingFieldMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return usingFieldMatcher.declaredClass(str, stringMatchType, z2);
    }

    public static /* synthetic */ UsingFieldMatcher modifiers$default(UsingFieldMatcher usingFieldMatcher, int i2, MatchType matchType, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return usingFieldMatcher.modifiers(i2, matchType);
    }

    public static /* synthetic */ UsingFieldMatcher name$default(UsingFieldMatcher usingFieldMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return usingFieldMatcher.name(str, stringMatchType, z2);
    }

    public static /* synthetic */ UsingFieldMatcher type$default(UsingFieldMatcher usingFieldMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return usingFieldMatcher.type(str, stringMatchType, z2);
    }

    public final UsingFieldMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
        AbstractC0307g.m703e(annotationMatcher, "annotation");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.addAnnotation(annotationMatcher);
        return this;
    }

    public final UsingFieldMatcher addReadMethods(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "readMethod");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.addReadMethod(methodMatcher);
        return this;
    }

    public final UsingFieldMatcher addWriteMethod(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "putMethod");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.addWriteMethod(methodMatcher);
        return this;
    }

    public final UsingFieldMatcher annotationCount(int i2) {
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.annotationCount(i2);
        return this;
    }

    public final UsingFieldMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        AbstractC0307g.m703e(annotationsMatcher, "annotations");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.annotations(annotationsMatcher);
        return this;
    }

    public final UsingFieldMatcher declaredClass(String str) {
        AbstractC0307g.m703e(str, "className");
        return declaredClass$default(this, str, null, false, 6, null);
    }

    public final UsingFieldMatcher descriptor(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        DexField dexField = new DexField(str);
        name$default(this, dexField.getName(), null, false, 6, null);
        declaredClass$default(this, dexField.getClassName(), null, false, 6, null);
        type$default(this, dexField.getTypeName(), null, false, 6, null);
        return this;
    }

    public final UsingFieldMatcher field(FieldMatcher fieldMatcher) {
        AbstractC0307g.m703e(fieldMatcher, "matcher");
        this.matcher = fieldMatcher;
        return this;
    }

    public final /* synthetic */ String getDeclaredClass() {
        throw new C0138d();
    }

    public final /* synthetic */ String getDescriptor() {
        throw new C0138d();
    }

    public final FieldMatcher getMatcher() {
        return this.matcher;
    }

    public final /* synthetic */ int getModifiers() {
        throw new C0138d();
    }

    public final /* synthetic */ String getName() {
        throw new C0138d();
    }

    public final /* synthetic */ String getType() {
        throw new C0138d();
    }

    public final UsingType getUsingType() {
        return this.usingType;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            throw new IllegalArgumentException("UsingFieldMatcher matcher not set");
        }
        UsingFieldMatcher.Companion companion = org.luckypray.dexkit.schema.UsingFieldMatcher.Companion;
        AbstractC0307g.m700b(fieldMatcher);
        int iCreateUsingFieldMatcher = companion.createUsingFieldMatcher(c0733b, fieldMatcher.innerBuild(c0733b), this.usingType.getValue());
        c0733b.m1931n(iCreateUsingFieldMatcher);
        return iCreateUsingFieldMatcher;
    }

    public final UsingFieldMatcher modifiers(int i2) {
        return modifiers$default(this, i2, null, 2, null);
    }

    public final UsingFieldMatcher name(String str) {
        AbstractC0307g.m703e(str, "name");
        return name$default(this, str, null, false, 6, null);
    }

    public final UsingFieldMatcher readMethods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "readMethods");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.readMethods(methodsMatcher);
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

    public final /* synthetic */ void setUsingType(UsingType usingType) {
        AbstractC0307g.m703e(usingType, "<set-?>");
        this.usingType = usingType;
    }

    public final UsingFieldMatcher type(String str) {
        AbstractC0307g.m703e(str, "typeName");
        return type$default(this, str, null, false, 6, null);
    }

    public final UsingFieldMatcher usingType(UsingType usingType) {
        AbstractC0307g.m703e(usingType, "usingType");
        this.usingType = usingType;
        return this;
    }

    public final UsingFieldMatcher writeMethods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "putMethods");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.writeMethods(methodsMatcher);
        return this;
    }

    private final UsingFieldMatcher field(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0286l.invoke(fieldMatcher);
        field(fieldMatcher);
        return this;
    }

    public final UsingFieldMatcher declaredClass(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return declaredClass$default(this, str, stringMatchType, false, 4, null);
    }

    public final UsingFieldMatcher modifiers(AccessFlagsMatcher accessFlagsMatcher) {
        AbstractC0307g.m703e(accessFlagsMatcher, "modifiers");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.modifiers(accessFlagsMatcher);
        return this;
    }

    public final UsingFieldMatcher name(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "name");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    public final UsingFieldMatcher type(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    public UsingFieldMatcher(Field field, UsingType usingType) {
        AbstractC0307g.m703e(field, "field");
        AbstractC0307g.m703e(usingType, "usingType");
        this.usingType = UsingType.Any;
        this.matcher = new FieldMatcher(field);
        this.usingType = usingType;
    }

    private final UsingFieldMatcher addAnnotation(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0286l.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    private final UsingFieldMatcher annotations(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        interfaceC0286l.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    private final UsingFieldMatcher readMethods(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0286l.invoke(methodsMatcher);
        readMethods(methodsMatcher);
        return this;
    }

    private final UsingFieldMatcher writeMethods(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0286l.invoke(methodsMatcher);
        writeMethods(methodsMatcher);
        return this;
    }

    public final UsingFieldMatcher addReadMethods(String str) {
        AbstractC0307g.m703e(str, "methodDescriptor");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.addReadMethod(new MethodMatcher(str));
        return this;
    }

    public final UsingFieldMatcher addWriteMethod(String str) {
        AbstractC0307g.m703e(str, "methodDescriptor");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.addWriteMethod(new MethodMatcher(str));
        return this;
    }

    public final UsingFieldMatcher annotationCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.annotationCount(intRange);
        return this;
    }

    public final UsingFieldMatcher declaredClass(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "declaredClass");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.declaredClass(classMatcher);
        return this;
    }

    public final UsingFieldMatcher name(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "name");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.name(stringMatcher);
        return this;
    }

    public final UsingFieldMatcher type(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "type");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.type(classMatcher);
        return this;
    }

    public final UsingFieldMatcher modifiers(int i2, MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.modifiers(i2, matchType);
        return this;
    }

    private final UsingFieldMatcher addReadMethods(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        addReadMethods(methodMatcher);
        return this;
    }

    private final UsingFieldMatcher addWriteMethod(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        addWriteMethod(methodMatcher);
        return this;
    }

    public final UsingFieldMatcher annotationCount(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.annotationCount(c0340c);
        return this;
    }

    public final UsingFieldMatcher declaredClass(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.declaredClass(cls);
        return this;
    }

    public final UsingFieldMatcher name(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "name");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.name(str, stringMatchType, z2);
        return this;
    }

    public final UsingFieldMatcher type(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.type(cls);
        return this;
    }

    public /* synthetic */ UsingFieldMatcher(Field field, UsingType usingType, int i2, AbstractC0304d abstractC0304d) {
        this(field, (i2 & 2) != 0 ? UsingType.Any : usingType);
    }

    public final UsingFieldMatcher annotationCount(int i2, int i3) {
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.annotationCount(i2, i3);
        return this;
    }

    public final UsingFieldMatcher declaredClass(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.declaredClass(str, stringMatchType, z2);
        return this;
    }

    public final UsingFieldMatcher type(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        FieldMatcher fieldMatcher = this.matcher;
        if (fieldMatcher == null) {
            fieldMatcher = new FieldMatcher();
        }
        this.matcher = fieldMatcher;
        fieldMatcher.type(str, stringMatchType, z2);
        return this;
    }

    public UsingFieldMatcher(String str, UsingType usingType) {
        AbstractC0307g.m703e(str, "fieldDescriptor");
        AbstractC0307g.m703e(usingType, "usingType");
        this.usingType = UsingType.Any;
        this.matcher = new FieldMatcher(str);
        this.usingType = usingType;
    }

    private final UsingFieldMatcher declaredClass(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        declaredClass(classMatcher);
        return this;
    }

    private final UsingFieldMatcher type(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        type(classMatcher);
        return this;
    }

    public /* synthetic */ UsingFieldMatcher(String str, UsingType usingType, int i2, AbstractC0304d abstractC0304d) {
        this(str, (i2 & 2) != 0 ? UsingType.Any : usingType);
    }
}
