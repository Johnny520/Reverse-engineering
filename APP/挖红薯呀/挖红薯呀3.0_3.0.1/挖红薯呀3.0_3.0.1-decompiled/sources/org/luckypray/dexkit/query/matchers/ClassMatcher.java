package org.luckypray.dexkit.query.matchers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.ClassMatcherList;
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.ClassMatcher;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexClass;
import p000.AbstractC0619pl;
import p000.AbstractC0960ye;
import p000.AbstractC1001ze;
import p000.C0096cl;
import p000.C0938xt;
import p000.InterfaceC0061bn;
import p000.InterfaceC0742sw;
import p000.z20;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassMatcher extends BaseMatcher implements IAnnotationEncodeValue {
    public static final Companion Companion = new Companion(null);
    private List<ClassMatcher> allOfMatchers;
    private AnnotationsMatcher annotationsMatcher;
    private List<ClassMatcher> anyOfMatchers;
    private StringMatcher classNameMatcher;
    private FieldsMatcher fieldsMatcher;
    private InterfacesMatcher interfacesMatcher;
    private MethodsMatcher methodsMatcher;
    private AccessFlagsMatcher modifiersMatcher;
    private List<ClassMatcher> noneOfMatchers;
    private StringMatcher sourceMatcher;
    private ClassMatcher superClassMatcher;
    private List<StringMatcher> usingStringsMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassMatcher(Class<?> cls) {
        cls.getClass();
        className$default(this, DexSignUtil.getClassDescriptor(cls), null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher addFieldForName$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.addFieldForName(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher addFieldForType$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.addFieldForType(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher addInterface$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.addInterface(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher addUsingString$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.addUsingString(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher annotationCount$default(ClassMatcher classMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return classMatcher.annotationCount(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher className$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.className(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ClassMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher fieldCount$default(ClassMatcher classMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return classMatcher.fieldCount(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher interfaceCount$default(ClassMatcher classMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return classMatcher.interfaceCount(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher methodCount$default(ClassMatcher classMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return classMatcher.methodCount(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher modifiers$default(ClassMatcher classMatcher, int i, MatchType matchType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return classMatcher.modifiers(i, matchType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher source$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.source(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher superClass$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.superClass(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ClassMatcher usingStrings$default(ClassMatcher classMatcher, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.usingStrings(collection, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher addAllOf(ClassMatcher classMatcher) {
        classMatcher.getClass();
        List<ClassMatcher> arrayList = this.allOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.allOfMatchers = arrayList;
        arrayList.add(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
        annotationMatcher.getClass();
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.add(annotationMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher addAnyOf(ClassMatcher classMatcher) {
        classMatcher.getClass();
        List<ClassMatcher> arrayList = this.anyOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.anyOfMatchers = arrayList;
        arrayList.add(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher addEqString(String str) {
        str.getClass();
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher addField(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher addFieldForName(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.add(new FieldMatcher().name(str, stringMatchType, z));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher addFieldForType(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.add(new FieldMatcher().type(str, stringMatchType, z));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher addInterface(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.add(new ClassMatcher().className(str, stringMatchType, z));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher addMethod(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        methodsMatcher.add(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher addNoneOf(ClassMatcher classMatcher) {
        classMatcher.getClass();
        List<ClassMatcher> arrayList = this.noneOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.noneOfMatchers = arrayList;
        arrayList.add(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher addUsingString(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(stringMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher allOf(Collection<ClassMatcher> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            collection = null;
        }
        this.allOfMatchers = collection != null ? new ArrayList(collection) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher annotationCount(IntRange intRange) {
        intRange.getClass();
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(intRange);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ ClassMatcher annotations(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        interfaceC0742sw.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher anyOf(Collection<ClassMatcher> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            collection = null;
        }
        this.anyOfMatchers = collection != null ? new ArrayList(collection) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher className(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return className$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher descriptor(String str) {
        str.getClass();
        className$default(this, new DexClass(str).getTypeName(), null, false, 6, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher fieldCount(IntRange intRange) {
        intRange.getClass();
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.count(intRange);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ ClassMatcher fields(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FieldsMatcher fieldsMatcher = new FieldsMatcher();
        interfaceC0742sw.invoke(fieldsMatcher);
        fields(fieldsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<ClassMatcher> getAllOfMatchers() {
        return this.allOfMatchers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<ClassMatcher> getAnyOfMatchers() {
        return this.anyOfMatchers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ String getClassName() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher getClassNameMatcher() {
        return this.classNameMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ String getDescriptor() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldsMatcher getFieldsMatcher() {
        return this.fieldsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfacesMatcher getInterfacesMatcher() {
        return this.interfacesMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher getMethodsMatcher() {
        return this.methodsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ int getModifiers() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AccessFlagsMatcher getModifiersMatcher() {
        return this.modifiersMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<ClassMatcher> getNoneOfMatchers() {
        return this.noneOfMatchers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ String getSource() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher getSourceMatcher() {
        return this.sourceMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ String getSuperClass() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getSuperClassMatcher() {
        return this.superClassMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ Collection getUsingStrings() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<StringMatcher> getUsingStringsMatcher() {
        return this.usingStringsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) {
        int iM5162k;
        int iM5162k2;
        int iM5162k3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ClassMatcher.Companion companion;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iM5162k4;
        c0938xt.getClass();
        ClassMatcher.Companion companion2 = org.luckypray.dexkit.schema.ClassMatcher.Companion;
        StringMatcher stringMatcher = this.sourceMatcher;
        int iBuild$dexkit_android_release = stringMatcher != null ? stringMatcher.build$dexkit_android_release(c0938xt) : 0;
        StringMatcher stringMatcher2 = this.classNameMatcher;
        int iBuild$dexkit_android_release2 = stringMatcher2 != null ? stringMatcher2.build$dexkit_android_release(c0938xt) : 0;
        AccessFlagsMatcher accessFlagsMatcher = this.modifiersMatcher;
        int iBuild$dexkit_android_release3 = accessFlagsMatcher != null ? accessFlagsMatcher.build$dexkit_android_release(c0938xt) : 0;
        ClassMatcher classMatcher = this.superClassMatcher;
        int iBuild$dexkit_android_release4 = classMatcher != null ? classMatcher.build$dexkit_android_release(c0938xt) : 0;
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        int iBuild$dexkit_android_release5 = interfacesMatcher != null ? interfacesMatcher.build$dexkit_android_release(c0938xt) : 0;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iBuild$dexkit_android_release6 = annotationsMatcher != null ? annotationsMatcher.build$dexkit_android_release(c0938xt) : 0;
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        int iBuild$dexkit_android_release7 = fieldsMatcher != null ? fieldsMatcher.build$dexkit_android_release(c0938xt) : 0;
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        int iBuild$dexkit_android_release8 = methodsMatcher != null ? methodsMatcher.build$dexkit_android_release(c0938xt) : 0;
        List<StringMatcher> list = this.usingStringsMatcher;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((StringMatcher) it.next()).build$dexkit_android_release(c0938xt)));
            }
            iM5162k = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList));
        } else {
            iM5162k = 0;
        }
        List<ClassMatcher> list2 = this.allOfMatchers;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC1001ze.m5585E(list2));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((ClassMatcher) it2.next()).build$dexkit_android_release(c0938xt)));
            }
            iM5162k2 = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList2));
        } else {
            iM5162k2 = 0;
        }
        List<ClassMatcher> list3 = this.anyOfMatchers;
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC1001ze.m5585E(list3));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(((ClassMatcher) it3.next()).build$dexkit_android_release(c0938xt)));
            }
            iM5162k3 = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList3));
        } else {
            iM5162k3 = 0;
        }
        List<ClassMatcher> list4 = this.noneOfMatchers;
        if (list4 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC1001ze.m5585E(list4));
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Integer.valueOf(((ClassMatcher) it4.next()).build$dexkit_android_release(c0938xt)));
            }
            int i12 = iM5162k2;
            iM5162k4 = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList4));
            companion = companion2;
            i6 = iBuild$dexkit_android_release;
            i7 = iBuild$dexkit_android_release2;
            i8 = iBuild$dexkit_android_release4;
            i9 = iBuild$dexkit_android_release6;
            i10 = iBuild$dexkit_android_release8;
            i11 = i12;
            int i13 = iM5162k;
            i = iM5162k3;
            i2 = iBuild$dexkit_android_release3;
            i3 = iBuild$dexkit_android_release5;
            i4 = iBuild$dexkit_android_release7;
            i5 = i13;
        } else {
            int i14 = iM5162k;
            i = iM5162k3;
            i2 = iBuild$dexkit_android_release3;
            i3 = iBuild$dexkit_android_release5;
            i4 = iBuild$dexkit_android_release7;
            i5 = i14;
            companion = companion2;
            i6 = iBuild$dexkit_android_release;
            i7 = iBuild$dexkit_android_release2;
            i8 = iBuild$dexkit_android_release4;
            i9 = iBuild$dexkit_android_release6;
            i10 = iBuild$dexkit_android_release8;
            i11 = iM5162k2;
            iM5162k4 = 0;
        }
        int iCreateClassMatcher = companion.createClassMatcher(c0938xt, i6, i7, i2, i8, i3, i9, i4, i10, i5, i11, i, iM5162k4);
        c0938xt.m5165n(iCreateClassMatcher);
        return iCreateClassMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher interfaceCount(IntRange intRange) {
        intRange.getClass();
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.count(intRange);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ ClassMatcher interfaces(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        InterfacesMatcher interfacesMatcher = new InterfacesMatcher();
        interfaceC0742sw.invoke(interfacesMatcher);
        interfaces(interfacesMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher methodCount(IntRange intRange) {
        intRange.getClass();
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        methodsMatcher.count(intRange);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ ClassMatcher methods(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0742sw.invoke(methodsMatcher);
        methods(methodsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher modifiers(int i, MatchType matchType) {
        matchType.getClass();
        this.modifiersMatcher = new AccessFlagsMatcher(i, matchType);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher noneOf(Collection<ClassMatcher> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            collection = null;
        }
        this.noneOfMatchers = collection != null ? new ArrayList(collection) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ ClassMatcher not(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        not(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setClassName(String str) {
        str.getClass();
        className$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setDescriptor(String str) {
        str.getClass();
        descriptor(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setModifiers(int i) {
        modifiers$default(this, i, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setSource(String str) {
        str.getClass();
        source$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSuperClass(String str) {
        str.getClass();
        superClass$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUsingStrings(Collection<String> collection) {
        collection.getClass();
        usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher source(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return source$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher superClass(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.superClassMatcher = new ClassMatcher().className(new StringMatcher(str, stringMatchType, z));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher usingEqStrings(Collection<String> collection) {
        collection.getClass();
        Collection<String> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(collection2));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = new ArrayList(arrayList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType, boolean z) {
        collection.getClass();
        stringMatchType.getClass();
        Collection<String> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(collection2));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), stringMatchType, z));
        }
        this.usingStringsMatcher = new ArrayList(arrayList);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.ClassMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ClassMatcher create(Class<?> cls) {
            cls.getClass();
            return new ClassMatcher(cls);
        }

        private Companion() {
        }

        public final ClassMatcher create() {
            return new ClassMatcher();
        }

        public final ClassMatcher create(String str) {
            str.getClass();
            return new ClassMatcher(str);
        }
    }

    public static final ClassMatcher create(Class<?> cls) {
        return Companion.create(cls);
    }

    public static final ClassMatcher create(String str) {
        return Companion.create(str);
    }

    public final ClassMatcher modifiers(AccessFlagsMatcher accessFlagsMatcher) {
        accessFlagsMatcher.getClass();
        this.modifiersMatcher = accessFlagsMatcher;
        return this;
    }

    public final ClassMatcher modifiers(int i) {
        return modifiers$default(this, i, null, 2, null);
    }

    public final ClassMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        annotationsMatcher.getClass();
        this.annotationsMatcher = annotationsMatcher;
        return this;
    }

    public final ClassMatcher fields(FieldsMatcher fieldsMatcher) {
        fieldsMatcher.getClass();
        this.fieldsMatcher = fieldsMatcher;
        return this;
    }

    public final ClassMatcher interfaces(InterfacesMatcher interfacesMatcher) {
        interfacesMatcher.getClass();
        this.interfacesMatcher = interfacesMatcher;
        return this;
    }

    public final ClassMatcher methods(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        this.methodsMatcher = methodsMatcher;
        return this;
    }

    public final ClassMatcher not(ClassMatcher classMatcher) {
        classMatcher.getClass();
        addNoneOf(classMatcher);
        return this;
    }

    public final ClassMatcher className(String str) {
        str.getClass();
        return className$default(this, str, null, false, 6, null);
    }

    public final ClassMatcher source(String str) {
        str.getClass();
        return source$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ ClassMatcher addAllOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        addAllOf(classMatcher);
        return this;
    }

    public final /* synthetic */ ClassMatcher addAnnotation(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0742sw.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public final /* synthetic */ ClassMatcher addAnyOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        addAnyOf(classMatcher);
        return this;
    }

    public final /* synthetic */ ClassMatcher addField(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0742sw.invoke(fieldMatcher);
        addField(fieldMatcher);
        return this;
    }

    public final /* synthetic */ ClassMatcher addMethod(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0742sw.invoke(methodMatcher);
        addMethod(methodMatcher);
        return this;
    }

    public final /* synthetic */ ClassMatcher addNoneOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        addNoneOf(classMatcher);
        return this;
    }

    public final ClassMatcher addUsingString(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addUsingString$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher annotationCount(int i) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.setCount(i);
        return this;
    }

    public final ClassMatcher className(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        this.classNameMatcher = stringMatcher;
        return this;
    }

    public final ClassMatcher fieldCount(int i) {
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.setCount(i);
        return this;
    }

    public final ClassMatcher interfaceCount(int i) {
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.setCount(i);
        return this;
    }

    public final ClassMatcher methodCount(int i) {
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        methodsMatcher.setCount(i);
        return this;
    }

    public final ClassMatcher source(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        this.sourceMatcher = stringMatcher;
        return this;
    }

    public ClassMatcher() {
    }

    public final ClassMatcher addUsingString(String str) {
        str.getClass();
        return addUsingString$default(this, str, null, false, 6, null);
    }

    public final ClassMatcher className(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.classNameMatcher = new StringMatcher(str, stringMatchType, z);
        return this;
    }

    public final ClassMatcher source(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.sourceMatcher = new StringMatcher(str, stringMatchType, z);
        return this;
    }

    public ClassMatcher(String str) {
        str.getClass();
        descriptor(str);
    }

    public final ClassMatcher addUsingString(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        addUsingString(new StringMatcher(str, stringMatchType, z));
        return this;
    }

    public final ClassMatcher annotationCount(z20 z20Var) {
        z20Var.getClass();
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(z20Var);
        return this;
    }

    public final ClassMatcher fieldCount(z20 z20Var) {
        z20Var.getClass();
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.count(z20Var);
        return this;
    }

    public final ClassMatcher interfaceCount(z20 z20Var) {
        z20Var.getClass();
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.count(z20Var);
        return this;
    }

    public final ClassMatcher methodCount(z20 z20Var) {
        z20Var.getClass();
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        methodsMatcher.count(z20Var);
        return this;
    }

    public final ClassMatcher allOf(ClassMatcher... classMatcherArr) {
        classMatcherArr.getClass();
        List listAsList = Arrays.asList(classMatcherArr);
        listAsList.getClass();
        allOf(listAsList);
        return this;
    }

    public final ClassMatcher annotationCount(int i, int i2) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(i, i2);
        return this;
    }

    public final ClassMatcher anyOf(ClassMatcher... classMatcherArr) {
        classMatcherArr.getClass();
        List listAsList = Arrays.asList(classMatcherArr);
        listAsList.getClass();
        anyOf(listAsList);
        return this;
    }

    public final ClassMatcher fieldCount(int i, int i2) {
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.count(i, i2);
        return this;
    }

    public final ClassMatcher interfaceCount(int i, int i2) {
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.count(i, i2);
        return this;
    }

    public final ClassMatcher methodCount(int i, int i2) {
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        methodsMatcher.count(i, i2);
        return this;
    }

    public final ClassMatcher noneOf(ClassMatcher... classMatcherArr) {
        classMatcherArr.getClass();
        List listAsList = Arrays.asList(classMatcherArr);
        listAsList.getClass();
        noneOf(listAsList);
        return this;
    }

    public final ClassMatcher superClass(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return superClass$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher superClass(ClassMatcher classMatcher) {
        classMatcher.getClass();
        this.superClassMatcher = classMatcher;
        return this;
    }

    public final /* synthetic */ ClassMatcher allOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcherList classMatcherList = new ClassMatcherList();
        interfaceC0742sw.invoke(classMatcherList);
        allOf(classMatcherList);
        return this;
    }

    public final /* synthetic */ ClassMatcher anyOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcherList classMatcherList = new ClassMatcherList();
        interfaceC0742sw.invoke(classMatcherList);
        anyOf(classMatcherList);
        return this;
    }

    public final /* synthetic */ ClassMatcher noneOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcherList classMatcherList = new ClassMatcherList();
        interfaceC0742sw.invoke(classMatcherList);
        noneOf(classMatcherList);
        return this;
    }

    public final ClassMatcher superClass(String str) {
        str.getClass();
        return superClass$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ ClassMatcher superClass(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        superClass(classMatcher);
        return this;
    }

    public final ClassMatcher addFieldForName(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addFieldForName$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher addFieldForType(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addFieldForType$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher addInterface(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addInterface$default(this, str, stringMatchType, false, 4, null);
    }

    public final ClassMatcher addFieldForName(String str) {
        str.getClass();
        return addFieldForName$default(this, str, null, false, 6, null);
    }

    public final ClassMatcher addFieldForType(String str) {
        str.getClass();
        return addFieldForType$default(this, str, null, false, 6, null);
    }

    public final ClassMatcher addInterface(ClassMatcher classMatcher) {
        classMatcher.getClass();
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        interfacesMatcher.add(classMatcher);
        return this;
    }

    public final ClassMatcher addFieldForType(Class<?> cls) {
        cls.getClass();
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        fieldsMatcher.add(new FieldMatcher().type(cls));
        return this;
    }

    public final ClassMatcher addInterface(String str) {
        str.getClass();
        return addInterface$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ ClassMatcher addInterface(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        addInterface(classMatcher);
        return this;
    }

    public final ClassMatcher usingEqStrings(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = new ArrayList(arrayList);
        return this;
    }

    public final ClassMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType) {
        collection.getClass();
        stringMatchType.getClass();
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    public final ClassMatcher usingStrings(StringMatcherList stringMatcherList) {
        stringMatcherList.getClass();
        this.usingStringsMatcher = stringMatcherList;
        return this;
    }

    public final ClassMatcher usingStrings(Collection<String> collection) {
        collection.getClass();
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    public final /* synthetic */ ClassMatcher usingStrings(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        StringMatcherList stringMatcherList = new StringMatcherList();
        interfaceC0742sw.invoke(stringMatcherList);
        usingStrings(stringMatcherList);
        return this;
    }

    public final ClassMatcher usingStrings(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.usingStringsMatcher = new ArrayList(arrayList);
        return this;
    }
}
