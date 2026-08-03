package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.base.BaseQuery;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.ClassMatcher;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexClass;
import p007D0.C0138d;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class ClassMatcher extends BaseQuery implements IAnnotationEncodeValue {
    public static final Companion Companion = null;
    private AnnotationsMatcher annotationsMatcher;
    private StringMatcher classNameMatcher;
    private FieldsMatcher fieldsMatcher;
    private InterfacesMatcher interfacesMatcher;
    private MethodsMatcher methodsMatcher;
    private AccessFlagsMatcher modifiersMatcher;
    private StringMatcher sourceMatcher;
    private ClassMatcher superClassMatcher;
    private List<StringMatcher> usingStringsMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final ClassMatcher create() {
            return new ClassMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final ClassMatcher create(Class<?> r2) {
            AbstractC0307g.m703e(r2, "clazz");
            return new ClassMatcher(r2);
        }

        public final ClassMatcher create(String r2) {
            AbstractC0307g.m703e(r2, "descriptor");
            return new ClassMatcher(r2);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ClassMatcher() {
    }

    public static /* synthetic */ ClassMatcher addFieldForName$default(ClassMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.addFieldForName(r1, r2, r3);
    }

    public static /* synthetic */ ClassMatcher addFieldForType$default(ClassMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.addFieldForType(r1, r2, r3);
    }

    public static /* synthetic */ ClassMatcher addInterface$default(ClassMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.addInterface(r1, r2, r3);
    }

    public static /* synthetic */ ClassMatcher addUsingString$default(ClassMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.addUsingString(r1, r2, r3);
    }

    public static /* synthetic */ ClassMatcher annotationCount$default(ClassMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.annotationCount(r1, r2);
    }

    public static /* synthetic */ ClassMatcher className$default(ClassMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.className(r1, r2, r3);
    }

    public static final ClassMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ ClassMatcher fieldCount$default(ClassMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.fieldCount(r1, r2);
    }

    public static /* synthetic */ ClassMatcher interfaceCount$default(ClassMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.interfaceCount(r1, r2);
    }

    public static /* synthetic */ ClassMatcher methodCount$default(ClassMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.methodCount(r1, r2);
    }

    public static /* synthetic */ ClassMatcher modifiers$default(ClassMatcher r02, int r1, MatchType r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = MatchType.Contains;
    L6:
        return r02.modifiers(r1, r2);
    }

    public static /* synthetic */ ClassMatcher source$default(ClassMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.source(r1, r2, r3);
    }

    public static /* synthetic */ ClassMatcher superClass$default(ClassMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.superClass(r1, r2, r3);
    }

    public static /* synthetic */ ClassMatcher usingStrings$default(ClassMatcher r02, Collection r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.usingStrings(r1, r2, r3);
    }

    public final ClassMatcher addAnnotation(AnnotationMatcher r2) {
        AbstractC0307g.m703e(r2, "annotationMatcher");
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final ClassMatcher addEqString(String r5) {
        AbstractC0307g.m703e(r5, "usingString");
        List<StringMatcher> r02 = this.usingStringsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingStringsMatcher = r02;
        r02.add(new StringMatcher(r5, StringMatchType.Equals, false));
        return this;
    }

    public final ClassMatcher addField(FieldMatcher r2) {
        AbstractC0307g.m703e(r2, "fieldMatcher");
        FieldsMatcher r02 = this.fieldsMatcher;
        if (r02 != null) goto L5;
        r02 = new FieldsMatcher();
    L5:
        this.fieldsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final ClassMatcher addFieldForName(String r8) {
        AbstractC0307g.m703e(r8, "fieldName");
        return addFieldForName$default(this, r8, null, false, 6, null);
    }

    public final ClassMatcher addFieldForType(String r8) {
        AbstractC0307g.m703e(r8, "typeName");
        return addFieldForType$default(this, r8, null, false, 6, null);
    }

    public final ClassMatcher addInterface(String r8) {
        AbstractC0307g.m703e(r8, "className");
        return addInterface$default(this, r8, null, false, 6, null);
    }

    public final ClassMatcher addMethod(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "methodMatcher");
        MethodsMatcher r02 = this.methodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.methodsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final ClassMatcher addUsingString(String r8) {
        AbstractC0307g.m703e(r8, "usingString");
        return addUsingString$default(this, r8, null, false, 6, null);
    }

    public final ClassMatcher annotationCount(int r2) {
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher annotations(AnnotationsMatcher r2) {
        AbstractC0307g.m703e(r2, "annotations");
        this.annotationsMatcher = r2;
        return this;
    }

    public final ClassMatcher className(String r8) {
        AbstractC0307g.m703e(r8, "className");
        return className$default(this, r8, null, false, 6, null);
    }

    public final ClassMatcher descriptor(String r8) {
        AbstractC0307g.m703e(r8, "descriptor");
        className$default(this, new DexClass(r8).getTypeName(), null, false, 6, null);
        return this;
    }

    public final ClassMatcher fieldCount(int r2) {
        FieldsMatcher r02 = this.fieldsMatcher;
        if (r02 != null) goto L5;
        r02 = new FieldsMatcher();
    L5:
        this.fieldsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher fields(FieldsMatcher r2) {
        AbstractC0307g.m703e(r2, "fields");
        this.fieldsMatcher = r2;
        return this;
    }

    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    public final /* synthetic */ String getClassName() {
        throw new C0138d();
    }

    public final StringMatcher getClassNameMatcher() {
        return this.classNameMatcher;
    }

    public final /* synthetic */ String getDescriptor() {
        throw new C0138d();
    }

    public final FieldsMatcher getFieldsMatcher() {
        return this.fieldsMatcher;
    }

    public final InterfacesMatcher getInterfacesMatcher() {
        return this.interfacesMatcher;
    }

    public final MethodsMatcher getMethodsMatcher() {
        return this.methodsMatcher;
    }

    public final /* synthetic */ int getModifiers() {
        throw new C0138d();
    }

    public final AccessFlagsMatcher getModifiersMatcher() {
        return this.modifiersMatcher;
    }

    public final /* synthetic */ String getSource() {
        throw new C0138d();
    }

    public final StringMatcher getSourceMatcher() {
        return this.sourceMatcher;
    }

    public final /* synthetic */ String getSuperClass() {
        throw new C0138d();
    }

    public final ClassMatcher getSuperClassMatcher() {
        return this.superClassMatcher;
    }

    public final /* synthetic */ Collection getUsingStrings() {
        throw new C0138d();
    }

    public final List<StringMatcher> getUsingStringsMatcher() {
        return this.usingStringsMatcher;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r13) {
        AbstractC0307g.m703e(r13, "fbb");
        ClassMatcher.Companion r1 = org.luckypray.dexkit.schema.ClassMatcher.Companion;
        StringMatcher r02 = this.sourceMatcher;
        if (r02 == null) goto L5;
        int r3 = BaseQuery.access$innerBuild(r02, r13);
    L6:
        StringMatcher r03 = this.classNameMatcher;
        if (r03 == null) goto L9;
        int r4 = BaseQuery.access$innerBuild(r03, r13);
    L10:
        AccessFlagsMatcher r04 = this.modifiersMatcher;
        if (r04 == null) goto L13;
        int r5 = BaseQuery.access$innerBuild(r04, r13);
    L14:
        ClassMatcher r05 = this.superClassMatcher;
        if (r05 == null) goto L17;
        int r6 = BaseQuery.access$innerBuild(r05, r13);
    L18:
        InterfacesMatcher r06 = this.interfacesMatcher;
        if (r06 == null) goto L21;
        int r7 = BaseQuery.access$innerBuild(r06, r13);
    L22:
        AnnotationsMatcher r07 = this.annotationsMatcher;
        if (r07 == null) goto L25;
        int r8 = BaseQuery.access$innerBuild(r07, r13);
    L26:
        FieldsMatcher r08 = this.fieldsMatcher;
        if (r08 == null) goto L29;
        int r9 = BaseQuery.access$innerBuild(r08, r13);
    L30:
        MethodsMatcher r09 = this.methodsMatcher;
        if (r09 == null) goto L33;
        int r10 = BaseQuery.access$innerBuild(r09, r13);
    L34:
        List<StringMatcher> r010 = this.usingStringsMatcher;
        if (r010 == null) goto L41;
        ArrayList r2 = new ArrayList(AbstractC0183n.m559k0(r010, 10));
        Iterator<T> r011 = r010.iterator();
    L38:
        if (r011.hasNext() == false) goto L40;
        r2.add(Integer.valueOf(BaseQuery.access$innerBuild((StringMatcher) r011.next(), r13)));
        goto L38
    L40:
        int r11 = r13.m1928k(AbstractC0181l.m552x0(r2));
    L42:
        int r012 = r1.createClassMatcher(r13, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        r13.m1931n(r012);
        return r012;
    L41:
        r11 = 0;
        goto L42
    L33:
        r10 = 0;
        goto L34
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

    public final ClassMatcher interfaceCount(int r2) {
        InterfacesMatcher r02 = this.interfacesMatcher;
        if (r02 != null) goto L5;
        r02 = new InterfacesMatcher();
    L5:
        this.interfacesMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher interfaces(InterfacesMatcher r2) {
        AbstractC0307g.m703e(r2, "interfaces");
        this.interfacesMatcher = r2;
        return this;
    }

    public final ClassMatcher methodCount(int r2) {
        MethodsMatcher r02 = this.methodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.methodsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher methods(MethodsMatcher r2) {
        AbstractC0307g.m703e(r2, "methods");
        this.methodsMatcher = r2;
        return this;
    }

    public final ClassMatcher modifiers(int r3) {
        return modifiers$default(this, r3, null, 2, null);
    }

    public final /* synthetic */ void setClassName(String r8) {
        AbstractC0307g.m703e(r8, "value");
        className$default(this, r8, null, false, 6, null);
    }

    public final /* synthetic */ void setDescriptor(String r2) {
        AbstractC0307g.m703e(r2, "value");
        descriptor(r2);
    }

    public final /* synthetic */ void setModifiers(int r3) {
        modifiers$default(this, r3, null, 2, null);
    }

    public final /* synthetic */ void setSource(String r8) {
        AbstractC0307g.m703e(r8, "value");
        source$default(this, r8, null, false, 6, null);
    }

    public final void setSuperClass(String r8) {
        AbstractC0307g.m703e(r8, "value");
        superClass$default(this, r8, null, false, 6, null);
    }

    public final void setUsingStrings(Collection<String> r8) {
        AbstractC0307g.m703e(r8, "value");
        usingStrings$default(this, r8, null, false, 6, null);
    }

    public final ClassMatcher source(String r8) {
        AbstractC0307g.m703e(r8, "source");
        return source$default(this, r8, null, false, 6, null);
    }

    public final ClassMatcher superClass(String r8) {
        AbstractC0307g.m703e(r8, "className");
        return superClass$default(this, r8, null, false, 6, null);
    }

    public final ClassMatcher usingEqStrings(Collection<String> r6) {
        AbstractC0307g.m703e(r6, "usingStrings");
        ArrayList r02 = new ArrayList(AbstractC0183n.m559k0(r6, 10));
        Iterator<T> r62 = r6.iterator();
    L4:
        if (r62.hasNext() == false) goto L6;
        r02.add(new StringMatcher((String) r62.next(), StringMatchType.Equals, false));
        goto L4
    L6:
        this.usingStringsMatcher = AbstractC0181l.m541A0(r02);
        return this;
    }

    public final ClassMatcher usingStrings(Collection<String> r8) {
        AbstractC0307g.m703e(r8, "usingStrings");
        return usingStrings$default(this, r8, null, false, 6, null);
    }

    public ClassMatcher(Class<?> r8) {
        AbstractC0307g.m703e(r8, "clazz");
        className$default(this, DexSignUtil.getClassDescriptor(r8), null, false, 6, null);
    }

    private final ClassMatcher annotations(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationsMatcher r02 = new AnnotationsMatcher();
        r2.invoke(r02);
        annotations(r02);
        return this;
    }

    public static final ClassMatcher create(Class<?> r1) {
        return Companion.create(r1);
    }

    private final ClassMatcher fields(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FieldsMatcher r02 = new FieldsMatcher();
        r2.invoke(r02);
        fields(r02);
        return this;
    }

    private final ClassMatcher interfaces(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        InterfacesMatcher r02 = new InterfacesMatcher();
        r2.invoke(r02);
        interfaces(r02);
        return this;
    }

    private final ClassMatcher methods(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodsMatcher r02 = new MethodsMatcher();
        r2.invoke(r02);
        methods(r02);
        return this;
    }

    public final ClassMatcher addFieldForName(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "fieldName");
        AbstractC0307g.m703e(r9, "matchType");
        return addFieldForName$default(this, r8, r9, false, 4, null);
    }

    public final ClassMatcher addFieldForType(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "typeName");
        AbstractC0307g.m703e(r9, "matchType");
        return addFieldForType$default(this, r8, r9, false, 4, null);
    }

    public final ClassMatcher addInterface(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "className");
        AbstractC0307g.m703e(r9, "matchType");
        return addInterface$default(this, r8, r9, false, 4, null);
    }

    public final ClassMatcher addUsingString(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "usingString");
        AbstractC0307g.m703e(r9, "matchType");
        return addUsingString$default(this, r8, r9, false, 4, null);
    }

    public final ClassMatcher className(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "className");
        AbstractC0307g.m703e(r9, "matchType");
        return className$default(this, r8, r9, false, 4, null);
    }

    public final ClassMatcher modifiers(AccessFlagsMatcher r2) {
        AbstractC0307g.m703e(r2, "matcher");
        this.modifiersMatcher = r2;
        return this;
    }

    public final ClassMatcher source(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "source");
        AbstractC0307g.m703e(r9, "matchType");
        return source$default(this, r8, r9, false, 4, null);
    }

    public final ClassMatcher superClass(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "className");
        AbstractC0307g.m703e(r9, "matchType");
        return superClass$default(this, r8, r9, false, 4, null);
    }

    public final ClassMatcher usingStrings(Collection<String> r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "usingStrings");
        AbstractC0307g.m703e(r9, "matchType");
        return usingStrings$default(this, r8, r9, false, 4, null);
    }

    private final ClassMatcher addAnnotation(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationMatcher r02 = new AnnotationMatcher();
        r2.invoke(r02);
        addAnnotation(r02);
        return this;
    }

    private final ClassMatcher addField(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        FieldMatcher r02 = new FieldMatcher();
        r2.invoke(r02);
        addField(r02);
        return this;
    }

    private final ClassMatcher addMethod(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        addMethod(r02);
        return this;
    }

    public static final ClassMatcher create(String r1) {
        return Companion.create(r1);
    }

    public final ClassMatcher addFieldForName(String r3, StringMatchType r4, boolean r5) {
        AbstractC0307g.m703e(r3, "fieldName");
        AbstractC0307g.m703e(r4, "matchType");
        FieldsMatcher r02 = this.fieldsMatcher;
        if (r02 != null) goto L5;
        r02 = new FieldsMatcher();
    L5:
        this.fieldsMatcher = r02;
        r02.add(new FieldMatcher().name(r3, r4, r5));
        return this;
    }

    public final ClassMatcher addFieldForType(String r3, StringMatchType r4, boolean r5) {
        AbstractC0307g.m703e(r3, "typeName");
        AbstractC0307g.m703e(r4, "matchType");
        FieldsMatcher r02 = this.fieldsMatcher;
        if (r02 != null) goto L5;
        r02 = new FieldsMatcher();
    L5:
        this.fieldsMatcher = r02;
        r02.add(new FieldMatcher().type(r3, r4, r5));
        return this;
    }

    public final ClassMatcher addInterface(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "interfaceMatcher");
        InterfacesMatcher r02 = this.interfacesMatcher;
        if (r02 != null) goto L5;
        r02 = new InterfacesMatcher();
    L5:
        this.interfacesMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final ClassMatcher addUsingString(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "usingString");
        List<StringMatcher> r02 = this.usingStringsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingStringsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final ClassMatcher annotationCount(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher className(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "matcher");
        this.classNameMatcher = r2;
        return this;
    }

    public final ClassMatcher fieldCount(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        FieldsMatcher r02 = this.fieldsMatcher;
        if (r02 != null) goto L5;
        r02 = new FieldsMatcher();
    L5:
        this.fieldsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher interfaceCount(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        InterfacesMatcher r02 = this.interfacesMatcher;
        if (r02 != null) goto L5;
        r02 = new InterfacesMatcher();
    L5:
        this.interfacesMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher methodCount(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        MethodsMatcher r02 = this.methodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.methodsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher modifiers(int r2, MatchType r3) {
        AbstractC0307g.m703e(r3, "matchType");
        this.modifiersMatcher = new AccessFlagsMatcher(r2, r3);
        return this;
    }

    public final ClassMatcher source(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "matcher");
        this.sourceMatcher = r2;
        return this;
    }

    public final ClassMatcher superClass(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "superClass");
        this.superClassMatcher = r2;
        return this;
    }

    public final ClassMatcher usingStrings(StringMatcherList r2) {
        AbstractC0307g.m703e(r2, "usingStrings");
        this.usingStringsMatcher = r2;
        return this;
    }

    public ClassMatcher(String r2) {
        AbstractC0307g.m703e(r2, "descriptor");
        descriptor(r2);
    }

    private final ClassMatcher usingStrings(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        StringMatcherList r02 = new StringMatcherList();
        r2.invoke(r02);
        usingStrings(r02);
        return this;
    }

    public final ClassMatcher className(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "className");
        AbstractC0307g.m703e(r3, "matchType");
        this.classNameMatcher = new StringMatcher(r2, r3, r4);
        return this;
    }

    public final ClassMatcher source(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "source");
        AbstractC0307g.m703e(r3, "matchType");
        this.sourceMatcher = new StringMatcher(r2, r3, r4);
        return this;
    }

    public final ClassMatcher superClass(String r3, StringMatchType r4, boolean r5) {
        AbstractC0307g.m703e(r3, "className");
        AbstractC0307g.m703e(r4, "matchType");
        this.superClassMatcher = new ClassMatcher().className(new StringMatcher(r3, r4, r5));
        return this;
    }

    private final ClassMatcher superClass(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        superClass(r02);
        return this;
    }

    public final ClassMatcher addFieldForType(Class<?> r3) {
        AbstractC0307g.m703e(r3, "clazz");
        FieldsMatcher r02 = this.fieldsMatcher;
        if (r02 != null) goto L5;
        r02 = new FieldsMatcher();
    L5:
        this.fieldsMatcher = r02;
        r02.add(new FieldMatcher().type(r3));
        return this;
    }

    public final ClassMatcher addInterface(String r3, StringMatchType r4, boolean r5) {
        AbstractC0307g.m703e(r3, "className");
        AbstractC0307g.m703e(r4, "matchType");
        InterfacesMatcher r02 = this.interfacesMatcher;
        if (r02 != null) goto L5;
        r02 = new InterfacesMatcher();
    L5:
        this.interfacesMatcher = r02;
        r02.add(new ClassMatcher().className(r3, r4, r5));
        return this;
    }

    public final ClassMatcher addUsingString(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "usingString");
        AbstractC0307g.m703e(r3, "matchType");
        addUsingString(new StringMatcher(r2, r3, r4));
        return this;
    }

    public final ClassMatcher annotationCount(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher fieldCount(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        FieldsMatcher r02 = this.fieldsMatcher;
        if (r02 != null) goto L5;
        r02 = new FieldsMatcher();
    L5:
        this.fieldsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher interfaceCount(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        InterfacesMatcher r02 = this.interfacesMatcher;
        if (r02 != null) goto L5;
        r02 = new InterfacesMatcher();
    L5:
        this.interfacesMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher methodCount(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        MethodsMatcher r02 = this.methodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.methodsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final ClassMatcher usingStrings(Collection<String> r4, StringMatchType r5, boolean r6) {
        AbstractC0307g.m703e(r4, "usingStrings");
        AbstractC0307g.m703e(r5, "matchType");
        ArrayList r02 = new ArrayList(AbstractC0183n.m559k0(r4, 10));
        Iterator<T> r42 = r4.iterator();
    L4:
        if (r42.hasNext() == false) goto L6;
        r02.add(new StringMatcher((String) r42.next(), r5, r6));
        goto L4
    L6:
        this.usingStringsMatcher = AbstractC0181l.m541A0(r02);
        return this;
    }

    private final ClassMatcher addInterface(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        addInterface(r02);
        return this;
    }

    public final ClassMatcher annotationCount(int r2, int r3) {
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2, r3);
        return this;
    }

    public final ClassMatcher fieldCount(int r2, int r3) {
        FieldsMatcher r02 = this.fieldsMatcher;
        if (r02 != null) goto L5;
        r02 = new FieldsMatcher();
    L5:
        this.fieldsMatcher = r02;
        r02.count(r2, r3);
        return this;
    }

    public final ClassMatcher interfaceCount(int r2, int r3) {
        InterfacesMatcher r02 = this.interfacesMatcher;
        if (r02 != null) goto L5;
        r02 = new InterfacesMatcher();
    L5:
        this.interfacesMatcher = r02;
        r02.count(r2, r3);
        return this;
    }

    public final ClassMatcher methodCount(int r2, int r3) {
        MethodsMatcher r02 = this.methodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.methodsMatcher = r02;
        r02.count(r2, r3);
        return this;
    }

    public final ClassMatcher usingEqStrings(String... r8) {
        AbstractC0307g.m703e(r8, "usingStrings");
        ArrayList r02 = new ArrayList(r8.length);
        int r1 = r8.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r02.add(new StringMatcher(r8[r3], StringMatchType.Equals, false));
        r3 = r3 + 1;
        goto L3
    L5:
        this.usingStringsMatcher = AbstractC0181l.m541A0(r02);
        return this;
    }

    public final ClassMatcher usingStrings(String... r11) {
        AbstractC0307g.m703e(r11, "usingStrings");
        ArrayList r02 = new ArrayList(r11.length);
        int r1 = r11.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02.add(new StringMatcher(r11[r2], null, false, 6, null));
        r2 = r2 + 1;
        goto L3
    L5:
        this.usingStringsMatcher = AbstractC0181l.m541A0(r02);
        return this;
    }
}
