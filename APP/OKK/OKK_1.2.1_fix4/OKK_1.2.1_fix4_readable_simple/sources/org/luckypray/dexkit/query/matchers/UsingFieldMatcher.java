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
    public static final Companion Companion = null;
    private FieldMatcher matcher;
    private UsingType usingType;

    public static final class Companion {
        private Companion() {
        }

        public final UsingFieldMatcher create() {
            return new UsingFieldMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public UsingFieldMatcher() {
        this.usingType = UsingType.Any;
    }

    public static /* synthetic */ UsingFieldMatcher annotationCount$default(UsingFieldMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.annotationCount(r1, r2);
    }

    public static final UsingFieldMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ UsingFieldMatcher declaredClass$default(UsingFieldMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.declaredClass(r1, r2, r3);
    }

    public static /* synthetic */ UsingFieldMatcher modifiers$default(UsingFieldMatcher r02, int r1, MatchType r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = MatchType.Contains;
    L6:
        return r02.modifiers(r1, r2);
    }

    public static /* synthetic */ UsingFieldMatcher name$default(UsingFieldMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.name(r1, r2, r3);
    }

    public static /* synthetic */ UsingFieldMatcher type$default(UsingFieldMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.type(r1, r2, r3);
    }

    public final UsingFieldMatcher addAnnotation(AnnotationMatcher r2) {
        AbstractC0307g.m703e(r2, "annotation");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.addAnnotation(r2);
        return this;
    }

    public final UsingFieldMatcher addReadMethods(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "readMethod");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.addReadMethod(r2);
        return this;
    }

    public final UsingFieldMatcher addWriteMethod(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "putMethod");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.addWriteMethod(r2);
        return this;
    }

    public final UsingFieldMatcher annotationCount(int r2) {
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.annotationCount(r2);
        return this;
    }

    public final UsingFieldMatcher annotations(AnnotationsMatcher r2) {
        AbstractC0307g.m703e(r2, "annotations");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.annotations(r2);
        return this;
    }

    public final UsingFieldMatcher declaredClass(String r8) {
        AbstractC0307g.m703e(r8, "className");
        return declaredClass$default(this, r8, null, false, 6, null);
    }

    public final UsingFieldMatcher descriptor(String r14) {
        AbstractC0307g.m703e(r14, "descriptor");
        DexField r02 = new DexField(r14);
        name$default(this, r02.getName(), null, false, 6, null);
        declaredClass$default(this, r02.getClassName(), null, false, 6, null);
        type$default(this, r02.getTypeName(), null, false, 6, null);
        return this;
    }

    public final UsingFieldMatcher field(FieldMatcher r2) {
        AbstractC0307g.m703e(r2, "matcher");
        this.matcher = r2;
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
    public int innerBuild(C0733b r4) {
        AbstractC0307g.m703e(r4, "fbb");
        FieldMatcher r02 = this.matcher;
        if (r02 == null) goto L7;
        UsingFieldMatcher.Companion r1 = org.luckypray.dexkit.schema.UsingFieldMatcher.Companion;
        AbstractC0307g.m700b(r02);
        int r03 = r1.createUsingFieldMatcher(r4, BaseQuery.access$innerBuild(r02, r4), this.usingType.getValue());
        r4.m1931n(r03);
        return r03;
    L7:
        throw new IllegalArgumentException("UsingFieldMatcher matcher not set");
    }

    public final UsingFieldMatcher modifiers(int r3) {
        return modifiers$default(this, r3, null, 2, null);
    }

    public final UsingFieldMatcher name(String r8) {
        AbstractC0307g.m703e(r8, "name");
        return name$default(this, r8, null, false, 6, null);
    }

    public final UsingFieldMatcher readMethods(MethodsMatcher r2) {
        AbstractC0307g.m703e(r2, "readMethods");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.readMethods(r2);
        return this;
    }

    public final /* synthetic */ void setDeclaredClass(String r8) {
        AbstractC0307g.m703e(r8, "value");
        declaredClass$default(this, r8, null, false, 6, null);
    }

    public final /* synthetic */ void setDescriptor(String r2) {
        AbstractC0307g.m703e(r2, "value");
        descriptor(r2);
    }

    public final /* synthetic */ void setModifiers(int r3) {
        modifiers$default(this, r3, null, 2, null);
    }

    public final /* synthetic */ void setName(String r8) {
        AbstractC0307g.m703e(r8, "value");
        name$default(this, r8, null, false, 6, null);
    }

    public final /* synthetic */ void setType(String r8) {
        AbstractC0307g.m703e(r8, "value");
        type$default(this, r8, null, false, 6, null);
    }

    public final /* synthetic */ void setUsingType(UsingType r2) {
        AbstractC0307g.m703e(r2, "<set-?>");
        this.usingType = r2;
    }

    public final UsingFieldMatcher type(String r8) {
        AbstractC0307g.m703e(r8, "typeName");
        return type$default(this, r8, null, false, 6, null);
    }

    public final UsingFieldMatcher usingType(UsingType r2) {
        AbstractC0307g.m703e(r2, "usingType");
        this.usingType = r2;
        return this;
    }

    public final UsingFieldMatcher writeMethods(MethodsMatcher r2) {
        AbstractC0307g.m703e(r2, "putMethods");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.writeMethods(r2);
        return this;
    }

    private final UsingFieldMatcher field(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FieldMatcher r02 = new FieldMatcher();
        r2.invoke(r02);
        field(r02);
        return this;
    }

    public final UsingFieldMatcher declaredClass(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "className");
        AbstractC0307g.m703e(r9, "matchType");
        return declaredClass$default(this, r8, r9, false, 4, null);
    }

    public final UsingFieldMatcher modifiers(AccessFlagsMatcher r2) {
        AbstractC0307g.m703e(r2, "modifiers");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.modifiers(r2);
        return this;
    }

    public final UsingFieldMatcher name(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "name");
        AbstractC0307g.m703e(r9, "matchType");
        return name$default(this, r8, r9, false, 4, null);
    }

    public final UsingFieldMatcher type(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "typeName");
        AbstractC0307g.m703e(r9, "matchType");
        return type$default(this, r8, r9, false, 4, null);
    }

    public UsingFieldMatcher(Field r2, UsingType r3) {
        AbstractC0307g.m703e(r2, "field");
        AbstractC0307g.m703e(r3, "usingType");
        this.usingType = UsingType.Any;
        this.matcher = new FieldMatcher(r2);
        this.usingType = r3;
    }

    private final UsingFieldMatcher addAnnotation(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationMatcher r02 = new AnnotationMatcher();
        r2.invoke(r02);
        addAnnotation(r02);
        return this;
    }

    private final UsingFieldMatcher annotations(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationsMatcher r02 = new AnnotationsMatcher();
        r2.invoke(r02);
        annotations(r02);
        return this;
    }

    private final UsingFieldMatcher readMethods(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodsMatcher r02 = new MethodsMatcher();
        r2.invoke(r02);
        readMethods(r02);
        return this;
    }

    private final UsingFieldMatcher writeMethods(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodsMatcher r02 = new MethodsMatcher();
        r2.invoke(r02);
        writeMethods(r02);
        return this;
    }

    public final UsingFieldMatcher addReadMethods(String r3) {
        AbstractC0307g.m703e(r3, "methodDescriptor");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.addReadMethod(new MethodMatcher(r3));
        return this;
    }

    public final UsingFieldMatcher addWriteMethod(String r3) {
        AbstractC0307g.m703e(r3, "methodDescriptor");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.addWriteMethod(new MethodMatcher(r3));
        return this;
    }

    public final UsingFieldMatcher annotationCount(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.annotationCount(r2);
        return this;
    }

    public final UsingFieldMatcher declaredClass(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "declaredClass");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.declaredClass(r2);
        return this;
    }

    public final UsingFieldMatcher name(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "name");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.name(r2);
        return this;
    }

    public final UsingFieldMatcher type(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "type");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.type(r2);
        return this;
    }

    public final UsingFieldMatcher modifiers(int r2, MatchType r3) {
        AbstractC0307g.m703e(r3, "matchType");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.modifiers(r2, r3);
        return this;
    }

    private final UsingFieldMatcher addReadMethods(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        addReadMethods(r02);
        return this;
    }

    private final UsingFieldMatcher addWriteMethod(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        addWriteMethod(r02);
        return this;
    }

    public final UsingFieldMatcher annotationCount(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.annotationCount(r2);
        return this;
    }

    public final UsingFieldMatcher declaredClass(Class<?> r2) {
        AbstractC0307g.m703e(r2, "clazz");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.declaredClass(r2);
        return this;
    }

    public final UsingFieldMatcher name(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "name");
        AbstractC0307g.m703e(r3, "matchType");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.name(r2, r3, r4);
        return this;
    }

    public final UsingFieldMatcher type(Class<?> r2) {
        AbstractC0307g.m703e(r2, "clazz");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.type(r2);
        return this;
    }

    public /* synthetic */ UsingFieldMatcher(Field r1, UsingType r2, int r3, AbstractC0304d r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = UsingType.Any;
    L5:
        this(r1, r2);
    }

    public final UsingFieldMatcher annotationCount(int r2, int r3) {
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.annotationCount(r2, r3);
        return this;
    }

    public final UsingFieldMatcher declaredClass(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "className");
        AbstractC0307g.m703e(r3, "matchType");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.declaredClass(r2, r3, r4);
        return this;
    }

    public final UsingFieldMatcher type(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "typeName");
        AbstractC0307g.m703e(r3, "matchType");
        FieldMatcher r02 = this.matcher;
        if (r02 != null) goto L5;
        r02 = new FieldMatcher();
    L5:
        this.matcher = r02;
        r02.type(r2, r3, r4);
        return this;
    }

    public UsingFieldMatcher(String r2, UsingType r3) {
        AbstractC0307g.m703e(r2, "fieldDescriptor");
        AbstractC0307g.m703e(r3, "usingType");
        this.usingType = UsingType.Any;
        this.matcher = new FieldMatcher(r2);
        this.usingType = r3;
    }

    private final UsingFieldMatcher declaredClass(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        declaredClass(r02);
        return this;
    }

    private final UsingFieldMatcher type(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        type(r02);
        return this;
    }

    public /* synthetic */ UsingFieldMatcher(String r1, UsingType r2, int r3, AbstractC0304d r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = UsingType.Any;
    L5:
        this(r1, r2);
    }
}
