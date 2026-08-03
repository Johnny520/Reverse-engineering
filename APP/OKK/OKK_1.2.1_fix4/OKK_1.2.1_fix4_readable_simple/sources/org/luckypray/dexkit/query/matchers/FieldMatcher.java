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
    public static final Companion Companion = null;
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

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final FieldMatcher create(Field r2) {
            AbstractC0307g.m703e(r2, "field");
            return new FieldMatcher(r2);
        }

        public final FieldMatcher create(String r2) {
            AbstractC0307g.m703e(r2, "descriptor");
            return new FieldMatcher(r2);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public FieldMatcher() {
    }

    public static /* synthetic */ FieldMatcher annotationCount$default(FieldMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.annotationCount(r1, r2);
    }

    public static final FieldMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ FieldMatcher declaredClass$default(FieldMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.declaredClass(r1, r2, r3);
    }

    public static /* synthetic */ FieldMatcher modifiers$default(FieldMatcher r02, int r1, MatchType r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = MatchType.Contains;
    L6:
        return r02.modifiers(r1, r2);
    }

    public static /* synthetic */ FieldMatcher name$default(FieldMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.name(r1, r2, r3);
    }

    public static /* synthetic */ FieldMatcher type$default(FieldMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.type(r1, r2, r3);
    }

    public final FieldMatcher addAnnotation(AnnotationMatcher r2) {
        AbstractC0307g.m703e(r2, "annotation");
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final FieldMatcher addReadMethod(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "readMethod");
        MethodsMatcher r02 = this.getMethodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.getMethodsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final FieldMatcher addWriteMethod(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "writeMethod");
        MethodsMatcher r02 = this.putMethodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.putMethodsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final FieldMatcher annotationCount(int r2) {
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final FieldMatcher annotations(AnnotationsMatcher r2) {
        AbstractC0307g.m703e(r2, "annotations");
        this.annotationsMatcher = r2;
        return this;
    }

    public final FieldMatcher declaredClass(String r8) {
        AbstractC0307g.m703e(r8, "className");
        return declaredClass$default(this, r8, null, false, 6, null);
    }

    public final FieldMatcher descriptor(String r14) {
        AbstractC0307g.m703e(r14, "descriptor");
        DexField r02 = new DexField(r14);
        name$default(this, r02.getName(), null, false, 6, null);
        declaredClass$default(this, r02.getClassName(), null, false, 6, null);
        type$default(this, r02.getTypeName(), null, false, 6, null);
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
    public int innerBuild(C0733b r11) {
        AbstractC0307g.m703e(r11, "fbb");
        FieldMatcher.Companion r1 = org.luckypray.dexkit.schema.FieldMatcher.Companion;
        StringMatcher r02 = this.nameMatcher;
        if (r02 == null) goto L5;
        int r3 = BaseQuery.access$innerBuild(r02, r11);
    L6:
        AccessFlagsMatcher r03 = this.modifiersMatcher;
        if (r03 == null) goto L9;
        int r4 = BaseQuery.access$innerBuild(r03, r11);
    L10:
        ClassMatcher r04 = this.classMatcher;
        if (r04 == null) goto L13;
        int r5 = BaseQuery.access$innerBuild(r04, r11);
    L14:
        ClassMatcher r05 = this.typeMatcher;
        if (r05 == null) goto L17;
        int r6 = BaseQuery.access$innerBuild(r05, r11);
    L18:
        AnnotationsMatcher r06 = this.annotationsMatcher;
        if (r06 == null) goto L21;
        int r7 = BaseQuery.access$innerBuild(r06, r11);
    L22:
        MethodsMatcher r07 = this.getMethodsMatcher;
        if (r07 == null) goto L25;
        int r8 = BaseQuery.access$innerBuild(r07, r11);
    L26:
        MethodsMatcher r08 = this.putMethodsMatcher;
        if (r08 == null) goto L29;
        int r9 = BaseQuery.access$innerBuild(r08, r11);
    L30:
        int r09 = r1.createFieldMatcher(r11, r3, r4, r5, r6, r7, r8, r9);
        r11.m1931n(r09);
        return r09;
    L29:
        r9 = 0;
        goto L30
    L25:
        r8 = 0;
        goto L26
    L21:
        r7 = 0;
        goto L22
    L17:
        r6 = 0;
        goto L18
    L13:
        r5 = 0;
        goto L14
    L9:
        r4 = 0;
        goto L10
    L5:
        r3 = 0;
        goto L6
    }

    public final FieldMatcher modifiers(int r3) {
        return modifiers$default(this, r3, null, 2, null);
    }

    public final FieldMatcher name(String r8) {
        AbstractC0307g.m703e(r8, "name");
        return name$default(this, r8, null, false, 6, null);
    }

    public final FieldMatcher readMethods(MethodsMatcher r2) {
        AbstractC0307g.m703e(r2, "readMethods");
        this.getMethodsMatcher = r2;
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

    public final FieldMatcher type(String r8) {
        AbstractC0307g.m703e(r8, "typeName");
        return type$default(this, r8, null, false, 6, null);
    }

    public final FieldMatcher writeMethods(MethodsMatcher r2) {
        AbstractC0307g.m703e(r2, "writeMethods");
        this.putMethodsMatcher = r2;
        return this;
    }

    public FieldMatcher(Field r2) {
        AbstractC0307g.m703e(r2, "field");
        descriptor(DexSignUtil.getFieldDescriptor(r2));
    }

    private final FieldMatcher annotations(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationsMatcher r02 = new AnnotationsMatcher();
        r2.invoke(r02);
        annotations(r02);
        return this;
    }

    public static final FieldMatcher create(String r1) {
        return Companion.create(r1);
    }

    private final FieldMatcher readMethods(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodsMatcher r02 = new MethodsMatcher();
        r2.invoke(r02);
        readMethods(r02);
        return this;
    }

    private final FieldMatcher writeMethods(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodsMatcher r02 = new MethodsMatcher();
        r2.invoke(r02);
        writeMethods(r02);
        return this;
    }

    public final FieldMatcher declaredClass(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "className");
        AbstractC0307g.m703e(r9, "matchType");
        return declaredClass$default(this, r8, r9, false, 4, null);
    }

    public final FieldMatcher modifiers(AccessFlagsMatcher r2) {
        AbstractC0307g.m703e(r2, "modifiers");
        this.modifiersMatcher = r2;
        return this;
    }

    public final FieldMatcher name(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "name");
        AbstractC0307g.m703e(r9, "matchType");
        return name$default(this, r8, r9, false, 4, null);
    }

    public final FieldMatcher type(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "typeName");
        AbstractC0307g.m703e(r9, "matchType");
        return type$default(this, r8, r9, false, 4, null);
    }

    private final FieldMatcher addAnnotation(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationMatcher r02 = new AnnotationMatcher();
        r2.invoke(r02);
        addAnnotation(r02);
        return this;
    }

    public static final FieldMatcher create(Field r1) {
        return Companion.create(r1);
    }

    public final FieldMatcher addReadMethod(String r3) {
        AbstractC0307g.m703e(r3, "methodDescriptor");
        MethodsMatcher r02 = this.getMethodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.getMethodsMatcher = r02;
        r02.add(new MethodMatcher(r3));
        return this;
    }

    public final FieldMatcher addWriteMethod(String r3) {
        AbstractC0307g.m703e(r3, "methodDescriptor");
        MethodsMatcher r02 = this.putMethodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.putMethodsMatcher = r02;
        r02.add(new MethodMatcher(r3));
        return this;
    }

    public final FieldMatcher annotationCount(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final FieldMatcher declaredClass(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "declaredClass");
        this.classMatcher = r2;
        return this;
    }

    public final FieldMatcher modifiers(int r2, MatchType r3) {
        AbstractC0307g.m703e(r3, "matchType");
        this.modifiersMatcher = new AccessFlagsMatcher(r2, r3);
        return this;
    }

    public final FieldMatcher name(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "name");
        this.nameMatcher = r2;
        return this;
    }

    public final FieldMatcher type(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "type");
        this.typeMatcher = r2;
        return this;
    }

    public FieldMatcher(String r2) {
        AbstractC0307g.m703e(r2, "descriptor");
        descriptor(r2);
    }

    public final FieldMatcher declaredClass(Class<?> r8) {
        AbstractC0307g.m703e(r8, "clazz");
        this.classMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(r8), null, false, 6, null);
        return this;
    }

    public final FieldMatcher name(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "name");
        AbstractC0307g.m703e(r3, "matchType");
        this.nameMatcher = new StringMatcher(r2, r3, r4);
        return this;
    }

    public final FieldMatcher type(Class<?> r8) {
        AbstractC0307g.m703e(r8, "clazz");
        this.typeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(r8), null, false, 6, null);
        return this;
    }

    private final FieldMatcher addReadMethod(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        addReadMethod(r02);
        return this;
    }

    private final FieldMatcher addWriteMethod(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        addWriteMethod(r02);
        return this;
    }

    public final FieldMatcher annotationCount(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final FieldMatcher declaredClass(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "className");
        AbstractC0307g.m703e(r3, "matchType");
        this.classMatcher = new ClassMatcher().className(r2, r3, r4);
        return this;
    }

    public final FieldMatcher type(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "typeName");
        AbstractC0307g.m703e(r3, "matchType");
        this.typeMatcher = new ClassMatcher().className(r2, r3, r4);
        return this;
    }

    private final FieldMatcher declaredClass(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        declaredClass(r02);
        return this;
    }

    private final FieldMatcher type(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        type(r02);
        return this;
    }

    public final FieldMatcher annotationCount(int r2, int r3) {
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2, r3);
        return this;
    }
}
