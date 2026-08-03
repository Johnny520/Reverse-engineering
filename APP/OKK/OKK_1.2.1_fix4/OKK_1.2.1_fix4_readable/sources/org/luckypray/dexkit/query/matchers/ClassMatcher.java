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
    public static final Companion Companion = new Companion(null);
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

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final ClassMatcher create(Class<?> cls) {
            AbstractC0307g.m703e(cls, "clazz");
            return new ClassMatcher(cls);
        }

        public final ClassMatcher create(String str) {
            AbstractC0307g.m703e(str, "descriptor");
            return new ClassMatcher(str);
        }
    }

    public ClassMatcher() {
    }

    public static /* synthetic */ ClassMatcher addFieldForName$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return classMatcher.addFieldForName(str, stringMatchType, z2);
    }

    public static /* synthetic */ ClassMatcher addFieldForType$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return classMatcher.addFieldForType(str, stringMatchType, z2);
    }

    public static /* synthetic */ ClassMatcher addInterface$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return classMatcher.addInterface(str, stringMatchType, z2);
    }

    public static /* synthetic */ ClassMatcher addUsingString$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return classMatcher.addUsingString(str, stringMatchType, z2);
    }

    public static /* synthetic */ ClassMatcher annotationCount$default(ClassMatcher classMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return classMatcher.annotationCount(i2, i3);
    }

    public static /* synthetic */ ClassMatcher className$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return classMatcher.className(str, stringMatchType, z2);
    }

    public static final ClassMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ ClassMatcher fieldCount$default(ClassMatcher classMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return classMatcher.fieldCount(i2, i3);
    }

    public static /* synthetic */ ClassMatcher interfaceCount$default(ClassMatcher classMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return classMatcher.interfaceCount(i2, i3);
    }

    public static /* synthetic */ ClassMatcher methodCount$default(ClassMatcher classMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return classMatcher.methodCount(i2, i3);
    }

    public static /* synthetic */ ClassMatcher modifiers$default(ClassMatcher classMatcher, int i2, MatchType matchType, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return classMatcher.modifiers(i2, matchType);
    }

    public static /* synthetic */ ClassMatcher source$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return classMatcher.source(str, stringMatchType, z2);
    }

    public static /* synthetic */ ClassMatcher superClass$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return classMatcher.superClass(str, stringMatchType, z2);
    }

    public static /* synthetic */ ClassMatcher usingStrings$default(ClassMatcher classMatcher, Collection collection, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return classMatcher.usingStrings(collection, stringMatchType, z2);
    }

    public final ClassMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
        AbstractC0307g.m703e(annotationMatcher, "annotationMatcher");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.add(annotationMatcher);
        return this;
    }

    public final ClassMatcher addEqString(String str) {
        AbstractC0307g.m703e(str, "usingString");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        return this;
    }

    public final ClassMatcher addField(FieldMatcher fieldMatcher) {
        AbstractC0307g.m703e(fieldMatcher, "fieldMatcher");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.add(fieldMatcher);
        return this;
    }

    public final ClassMatcher addFieldForName(String str) {
        AbstractC0307g.m703e(str, "fieldName");
        return addFieldForName$default(this, str, null, false, 6, null);
    }

    public final ClassMatcher addFieldForType(String str) {
        AbstractC0307g.m703e(str, "typeName");
        return addFieldForType$default(this, str, null, false, 6, null);
    }

    public final ClassMatcher addInterface(String str) {
        AbstractC0307g.m703e(str, "className");
        return addInterface$default(this, str, null, false, 6, null);
    }

    public final ClassMatcher addMethod(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "methodMatcher");
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        methodsMatcher.add(methodMatcher);
        return this;
    }

    public final ClassMatcher addUsingString(String str) {
        AbstractC0307g.m703e(str, "usingString");
        return addUsingString$default(this, str, null, false, 6, null);
    }

    public final ClassMatcher annotationCount(int i2) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.setCount(i2);
        return this;
    }

    public final ClassMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        AbstractC0307g.m703e(annotationsMatcher, "annotations");
        this.annotationsMatcher = annotationsMatcher;
        return this;
    }

    public final ClassMatcher className(String str) {
        AbstractC0307g.m703e(str, "className");
        return className$default(this, str, null, false, 6, null);
    }

    public final ClassMatcher descriptor(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        className$default(this, new DexClass(str).getTypeName(), null, false, 6, null);
        return this;
    }

    public final ClassMatcher fieldCount(int i2) {
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.setCount(i2);
        return this;
    }

    public final ClassMatcher fields(FieldsMatcher fieldsMatcher) {
        AbstractC0307g.m703e(fieldsMatcher, "fields");
        this.fieldsMatcher = fieldsMatcher;
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
    public int innerBuild(C0733b c0733b) {
        int iM1928k;
        AbstractC0307g.m703e(c0733b, "fbb");
        ClassMatcher.Companion companion = org.luckypray.dexkit.schema.ClassMatcher.Companion;
        StringMatcher stringMatcher = this.sourceMatcher;
        int iInnerBuild = stringMatcher != null ? stringMatcher.innerBuild(c0733b) : 0;
        StringMatcher stringMatcher2 = this.classNameMatcher;
        int iInnerBuild2 = stringMatcher2 != null ? stringMatcher2.innerBuild(c0733b) : 0;
        AccessFlagsMatcher accessFlagsMatcher = this.modifiersMatcher;
        int iInnerBuild3 = accessFlagsMatcher != null ? accessFlagsMatcher.innerBuild(c0733b) : 0;
        ClassMatcher classMatcher = this.superClassMatcher;
        int iInnerBuild4 = classMatcher != null ? classMatcher.innerBuild(c0733b) : 0;
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        int iInnerBuild5 = interfacesMatcher != null ? interfacesMatcher.innerBuild(c0733b) : 0;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iInnerBuild6 = annotationsMatcher != null ? annotationsMatcher.innerBuild(c0733b) : 0;
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        int iInnerBuild7 = fieldsMatcher != null ? fieldsMatcher.innerBuild(c0733b) : 0;
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        int iInnerBuild8 = methodsMatcher != null ? methodsMatcher.innerBuild(c0733b) : 0;
        List<StringMatcher> list = this.usingStringsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((StringMatcher) it.next()).innerBuild(c0733b)));
            }
            iM1928k = c0733b.m1928k(AbstractC0181l.m552x0(arrayList));
        } else {
            iM1928k = 0;
        }
        int iCreateClassMatcher = companion.createClassMatcher(c0733b, iInnerBuild, iInnerBuild2, iInnerBuild3, iInnerBuild4, iInnerBuild5, iInnerBuild6, iInnerBuild7, iInnerBuild8, iM1928k);
        c0733b.m1931n(iCreateClassMatcher);
        return iCreateClassMatcher;
    }

    public final ClassMatcher interfaceCount(int i2) {
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.setCount(i2);
        return this;
    }

    public final ClassMatcher interfaces(InterfacesMatcher interfacesMatcher) {
        AbstractC0307g.m703e(interfacesMatcher, "interfaces");
        this.interfacesMatcher = interfacesMatcher;
        return this;
    }

    public final ClassMatcher methodCount(int i2) {
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        methodsMatcher.setCount(i2);
        return this;
    }

    public final ClassMatcher methods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "methods");
        this.methodsMatcher = methodsMatcher;
        return this;
    }

    public final ClassMatcher modifiers(int i2) {
        return modifiers$default(this, i2, null, 2, null);
    }

    public final /* synthetic */ void setClassName(String str) {
        AbstractC0307g.m703e(str, "value");
        className$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setDescriptor(String str) {
        AbstractC0307g.m703e(str, "value");
        descriptor(str);
    }

    public final /* synthetic */ void setModifiers(int i2) {
        modifiers$default(this, i2, null, 2, null);
    }

    public final /* synthetic */ void setSource(String str) {
        AbstractC0307g.m703e(str, "value");
        source$default(this, str, null, false, 6, null);
    }

    public final void setSuperClass(String str) {
        AbstractC0307g.m703e(str, "value");
        superClass$default(this, str, null, false, 6, null);
    }

    public final void setUsingStrings(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "value");
        usingStrings$default(this, collection, null, false, 6, null);
    }

    public final ClassMatcher source(String str) {
        AbstractC0307g.m703e(str, "source");
        return source$default(this, str, null, false, 6, null);
    }

    public final ClassMatcher superClass(String str) {
        AbstractC0307g.m703e(str, "className");
        return superClass$default(this, str, null, false, 6, null);
    }

    public final ClassMatcher usingEqStrings(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "usingStrings");
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    public final ClassMatcher usingStrings(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "usingStrings");
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    public ClassMatcher(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        className$default(this, DexSignUtil.getClassDescriptor(cls), null, false, 6, null);
    }

    private final ClassMatcher annotations(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        interfaceC0286l.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    public static final ClassMatcher create(Class<?> cls) {
        return Companion.create(cls);
    }

    private final ClassMatcher fields(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FieldsMatcher fieldsMatcher = new FieldsMatcher();
        interfaceC0286l.invoke(fieldsMatcher);
        fields(fieldsMatcher);
        return this;
    }

    private final ClassMatcher interfaces(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        InterfacesMatcher interfacesMatcher = new InterfacesMatcher();
        interfaceC0286l.invoke(interfacesMatcher);
        interfaces(interfacesMatcher);
        return this;
    }

    private final ClassMatcher methods(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0286l.invoke(methodsMatcher);
        methods(methodsMatcher);
        return this;
    }

    public final ClassMatcher addFieldForName(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "fieldName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addFieldForName$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher addFieldForType(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addFieldForType$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher addInterface(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addInterface$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher addUsingString(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "usingString");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addUsingString$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher className(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return className$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher modifiers(AccessFlagsMatcher accessFlagsMatcher) {
        AbstractC0307g.m703e(accessFlagsMatcher, "matcher");
        this.modifiersMatcher = accessFlagsMatcher;
        return this;
    }

    public final ClassMatcher source(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "source");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return source$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher superClass(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return superClass$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(collection, "usingStrings");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    private final ClassMatcher addAnnotation(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0286l.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    private final ClassMatcher addField(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0286l.invoke(fieldMatcher);
        addField(fieldMatcher);
        return this;
    }

    private final ClassMatcher addMethod(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        addMethod(methodMatcher);
        return this;
    }

    public static final ClassMatcher create(String str) {
        return Companion.create(str);
    }

    public final ClassMatcher addFieldForName(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "fieldName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.add(new FieldMatcher().name(str, stringMatchType, z2));
        return this;
    }

    public final ClassMatcher addFieldForType(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.add(new FieldMatcher().type(str, stringMatchType, z2));
        return this;
    }

    public final ClassMatcher addInterface(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "interfaceMatcher");
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.add(classMatcher);
        return this;
    }

    public final ClassMatcher addUsingString(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "usingString");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(stringMatcher);
        return this;
    }

    public final ClassMatcher annotationCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(intRange);
        return this;
    }

    public final ClassMatcher className(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "matcher");
        this.classNameMatcher = stringMatcher;
        return this;
    }

    public final ClassMatcher fieldCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.count(intRange);
        return this;
    }

    public final ClassMatcher interfaceCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.count(intRange);
        return this;
    }

    public final ClassMatcher methodCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        methodsMatcher.count(intRange);
        return this;
    }

    public final ClassMatcher modifiers(int i2, MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        this.modifiersMatcher = new AccessFlagsMatcher(i2, matchType);
        return this;
    }

    public final ClassMatcher source(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "matcher");
        this.sourceMatcher = stringMatcher;
        return this;
    }

    public final ClassMatcher superClass(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "superClass");
        this.superClassMatcher = classMatcher;
        return this;
    }

    public final ClassMatcher usingStrings(StringMatcherList stringMatcherList) {
        AbstractC0307g.m703e(stringMatcherList, "usingStrings");
        this.usingStringsMatcher = stringMatcherList;
        return this;
    }

    public ClassMatcher(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        descriptor(str);
    }

    private final ClassMatcher usingStrings(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        StringMatcherList stringMatcherList = new StringMatcherList();
        interfaceC0286l.invoke(stringMatcherList);
        usingStrings(stringMatcherList);
        return this;
    }

    public final ClassMatcher className(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.classNameMatcher = new StringMatcher(str, stringMatchType, z2);
        return this;
    }

    public final ClassMatcher source(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "source");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.sourceMatcher = new StringMatcher(str, stringMatchType, z2);
        return this;
    }

    public final ClassMatcher superClass(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.superClassMatcher = new ClassMatcher().className(new StringMatcher(str, stringMatchType, z2));
        return this;
    }

    private final ClassMatcher superClass(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        superClass(classMatcher);
        return this;
    }

    public final ClassMatcher addFieldForType(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.add(new FieldMatcher().type(cls));
        return this;
    }

    public final ClassMatcher addInterface(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.add(new ClassMatcher().className(str, stringMatchType, z2));
        return this;
    }

    public final ClassMatcher addUsingString(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "usingString");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        addUsingString(new StringMatcher(str, stringMatchType, z2));
        return this;
    }

    public final ClassMatcher annotationCount(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(c0340c);
        return this;
    }

    public final ClassMatcher fieldCount(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.count(c0340c);
        return this;
    }

    public final ClassMatcher interfaceCount(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.count(c0340c);
        return this;
    }

    public final ClassMatcher methodCount(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        methodsMatcher.count(c0340c);
        return this;
    }

    public final ClassMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(collection, "usingStrings");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), stringMatchType, z2));
        }
        this.usingStringsMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    private final ClassMatcher addInterface(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        addInterface(classMatcher);
        return this;
    }

    public final ClassMatcher annotationCount(int i2, int i3) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(i2, i3);
        return this;
    }

    public final ClassMatcher fieldCount(int i2, int i3) {
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.count(i2, i3);
        return this;
    }

    public final ClassMatcher interfaceCount(int i2, int i3) {
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.count(i2, i3);
        return this;
    }

    public final ClassMatcher methodCount(int i2, int i3) {
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        methodsMatcher.count(i2, i3);
        return this;
    }

    public final ClassMatcher usingEqStrings(String... strArr) {
        AbstractC0307g.m703e(strArr, "usingStrings");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    public final ClassMatcher usingStrings(String... strArr) {
        AbstractC0307g.m703e(strArr, "usingStrings");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.usingStringsMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }
}
