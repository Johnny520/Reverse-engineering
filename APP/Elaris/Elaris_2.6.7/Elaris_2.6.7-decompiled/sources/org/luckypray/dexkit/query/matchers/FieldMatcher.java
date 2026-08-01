package org.luckypray.dexkit.query.matchers;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.FieldMatcherList;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.FieldMatcher;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexField;
import p000.AbstractC0025b8;
import p000.AbstractC0241h2;
import p000.AbstractC0276j2;
import p000.AbstractC0431r2;
import p000.C0038c5;
import p000.C0042c9;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMatcher extends BaseMatcher implements IAnnotationEncodeValue {
    public static final Companion Companion = new Companion(null);
    private List<FieldMatcher> allOfMatchers;
    private AnnotationsMatcher annotationsMatcher;
    private List<FieldMatcher> anyOfMatchers;
    private ClassMatcher classMatcher;
    private MethodsMatcher getMethodsMatcher;
    private AccessFlagsMatcher modifiersMatcher;
    private StringMatcher nameMatcher;
    private List<FieldMatcher> noneOfMatchers;
    private MethodsMatcher putMethodsMatcher;
    private ClassMatcher typeMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldMatcher(Field field) {
        field.getClass();
        descriptor(DexSignUtil.getFieldDescriptor(field));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ FieldMatcher annotationCount$default(FieldMatcher fieldMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return fieldMatcher.annotationCount(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FieldMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ FieldMatcher declaredClass$default(FieldMatcher fieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcher.declaredClass(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ FieldMatcher modifiers$default(FieldMatcher fieldMatcher, int i, MatchType matchType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return fieldMatcher.modifiers(i, matchType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ FieldMatcher name$default(FieldMatcher fieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcher.name(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ FieldMatcher type$default(FieldMatcher fieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcher.type(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher addAllOf(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        List<FieldMatcher> arrayList = this.allOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.allOfMatchers = arrayList;
        arrayList.add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
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
    public final FieldMatcher addAnyOf(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        List<FieldMatcher> arrayList = this.anyOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.anyOfMatchers = arrayList;
        arrayList.add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher addNoneOf(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        List<FieldMatcher> arrayList = this.noneOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.noneOfMatchers = arrayList;
        arrayList.add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher addReadMethod(String str) {
        str.getClass();
        MethodsMatcher methodsMatcher = this.getMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.getMethodsMatcher = methodsMatcher;
        methodsMatcher.add(new MethodMatcher(str));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher addWriteMethod(String str) {
        str.getClass();
        MethodsMatcher methodsMatcher = this.putMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.putMethodsMatcher = methodsMatcher;
        methodsMatcher.add(new MethodMatcher(str));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher allOf(Collection<FieldMatcher> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            collection = null;
        }
        this.allOfMatchers = collection != null ? new ArrayList(collection) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher annotationCount(IntRange intRange) {
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
    public final /* synthetic */ FieldMatcher annotations(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        interfaceC0482u5.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher anyOf(Collection<FieldMatcher> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            collection = null;
        }
        this.anyOfMatchers = collection != null ? new ArrayList(collection) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher declaredClass(Class<?> cls) {
        cls.getClass();
        this.classMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(cls), null, false, 6, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher descriptor(String str) {
        str.getClass();
        DexField dexField = new DexField(str);
        name$default(this, dexField.getName(), null, false, 6, null);
        declaredClass$default(this, dexField.getClassName(), null, false, 6, null);
        type$default(this, dexField.getTypeName(), null, false, 6, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<FieldMatcher> getAllOfMatchers() {
        return this.allOfMatchers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<FieldMatcher> getAnyOfMatchers() {
        return this.anyOfMatchers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getClassMatcher() {
        return this.classMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ String getDeclaredClass() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ String getDescriptor() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher getGetMethodsMatcher() {
        return this.getMethodsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ int getModifiers() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AccessFlagsMatcher getModifiersMatcher() {
        return this.modifiersMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ String getName() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher getNameMatcher() {
        return this.nameMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<FieldMatcher> getNoneOfMatchers() {
        return this.noneOfMatchers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher getPutMethodsMatcher() {
        return this.putMethodsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ String getType() {
        throw new C0042c9();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getTypeMatcher() {
        return this.typeMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) {
        int iM105k;
        int iM105k2;
        c0038c5.getClass();
        FieldMatcher.Companion companion = org.luckypray.dexkit.schema.FieldMatcher.Companion;
        StringMatcher stringMatcher = this.nameMatcher;
        int iM105k3 = 0;
        int iBuild$dexkit_android_release = stringMatcher != null ? stringMatcher.build$dexkit_android_release(c0038c5) : 0;
        AccessFlagsMatcher accessFlagsMatcher = this.modifiersMatcher;
        int iBuild$dexkit_android_release2 = accessFlagsMatcher != null ? accessFlagsMatcher.build$dexkit_android_release(c0038c5) : 0;
        ClassMatcher classMatcher = this.classMatcher;
        int iBuild$dexkit_android_release3 = classMatcher != null ? classMatcher.build$dexkit_android_release(c0038c5) : 0;
        ClassMatcher classMatcher2 = this.typeMatcher;
        int iBuild$dexkit_android_release4 = classMatcher2 != null ? classMatcher2.build$dexkit_android_release(c0038c5) : 0;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iBuild$dexkit_android_release5 = annotationsMatcher != null ? annotationsMatcher.build$dexkit_android_release(c0038c5) : 0;
        MethodsMatcher methodsMatcher = this.getMethodsMatcher;
        int iBuild$dexkit_android_release6 = methodsMatcher != null ? methodsMatcher.build$dexkit_android_release(c0038c5) : 0;
        MethodsMatcher methodsMatcher2 = this.putMethodsMatcher;
        int iBuild$dexkit_android_release7 = methodsMatcher2 != null ? methodsMatcher2.build$dexkit_android_release(c0038c5) : 0;
        List<FieldMatcher> list = this.allOfMatchers;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0276j2.m703i2(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((FieldMatcher) it.next()).build$dexkit_android_release(c0038c5)));
            }
            iM105k = c0038c5.m105k(AbstractC0241h2.m469l2(arrayList));
        } else {
            iM105k = 0;
        }
        List<FieldMatcher> list2 = this.anyOfMatchers;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0276j2.m703i2(list2));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((FieldMatcher) it2.next()).build$dexkit_android_release(c0038c5)));
            }
            iM105k2 = c0038c5.m105k(AbstractC0241h2.m469l2(arrayList2));
        } else {
            iM105k2 = 0;
        }
        List<FieldMatcher> list3 = this.noneOfMatchers;
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC0276j2.m703i2(list3));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(((FieldMatcher) it3.next()).build$dexkit_android_release(c0038c5)));
            }
            iM105k3 = c0038c5.m105k(AbstractC0241h2.m469l2(arrayList3));
        }
        int iCreateFieldMatcher = companion.createFieldMatcher(c0038c5, iBuild$dexkit_android_release, iBuild$dexkit_android_release2, iBuild$dexkit_android_release3, iBuild$dexkit_android_release4, iBuild$dexkit_android_release5, iBuild$dexkit_android_release6, iBuild$dexkit_android_release7, iM105k, iM105k2, iM105k3);
        c0038c5.m108n(iCreateFieldMatcher);
        return iCreateFieldMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher modifiers(int i, MatchType matchType) {
        matchType.getClass();
        this.modifiersMatcher = new AccessFlagsMatcher(i, matchType);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher name(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher noneOf(Collection<FieldMatcher> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            collection = null;
        }
        this.noneOfMatchers = collection != null ? new ArrayList(collection) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ FieldMatcher not(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0482u5.invoke(fieldMatcher);
        not(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ FieldMatcher readMethods(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0482u5.invoke(methodsMatcher);
        readMethods(methodsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setDeclaredClass(String str) {
        str.getClass();
        declaredClass$default(this, str, null, false, 6, null);
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
    public final /* synthetic */ void setName(String str) {
        str.getClass();
        name$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setType(String str) {
        str.getClass();
        type$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher type(Class<?> cls) {
        cls.getClass();
        this.typeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(cls), null, false, 6, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ FieldMatcher writeMethods(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0482u5.invoke(methodsMatcher);
        writeMethods(methodsMatcher);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.FieldMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FieldMatcher create(Field field) {
            field.getClass();
            return new FieldMatcher(field);
        }

        private Companion() {
        }

        public final FieldMatcher create() {
            return new FieldMatcher();
        }

        public final FieldMatcher create(String str) {
            str.getClass();
            return new FieldMatcher(str);
        }
    }

    public static final FieldMatcher create(String str) {
        return Companion.create(str);
    }

    public static final FieldMatcher create(Field field) {
        return Companion.create(field);
    }

    public final FieldMatcher modifiers(AccessFlagsMatcher accessFlagsMatcher) {
        accessFlagsMatcher.getClass();
        this.modifiersMatcher = accessFlagsMatcher;
        return this;
    }

    public final FieldMatcher modifiers(int i) {
        return modifiers$default(this, i, null, 2, null);
    }

    public FieldMatcher() {
    }

    public FieldMatcher(String str) {
        str.getClass();
        descriptor(str);
    }

    public final FieldMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        annotationsMatcher.getClass();
        this.annotationsMatcher = annotationsMatcher;
        return this;
    }

    public final FieldMatcher not(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        addNoneOf(fieldMatcher);
        return this;
    }

    public final FieldMatcher readMethods(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        this.getMethodsMatcher = methodsMatcher;
        return this;
    }

    public final FieldMatcher writeMethods(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        this.putMethodsMatcher = methodsMatcher;
        return this;
    }

    public final FieldMatcher name(String str) {
        str.getClass();
        return name$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ FieldMatcher addAllOf(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0482u5.invoke(fieldMatcher);
        addAllOf(fieldMatcher);
        return this;
    }

    public final /* synthetic */ FieldMatcher addAnnotation(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0482u5.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public final /* synthetic */ FieldMatcher addAnyOf(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0482u5.invoke(fieldMatcher);
        addAnyOf(fieldMatcher);
        return this;
    }

    public final /* synthetic */ FieldMatcher addNoneOf(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcher fieldMatcher = new FieldMatcher();
        interfaceC0482u5.invoke(fieldMatcher);
        addNoneOf(fieldMatcher);
        return this;
    }

    public final FieldMatcher annotationCount(int i) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.setCount(i);
        return this;
    }

    public final FieldMatcher name(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        this.nameMatcher = stringMatcher;
        return this;
    }

    public final FieldMatcher name(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.nameMatcher = new StringMatcher(str, stringMatchType, z);
        return this;
    }

    public final FieldMatcher annotationCount(AbstractC0025b8 abstractC0025b8) {
        abstractC0025b8.getClass();
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(abstractC0025b8);
        return this;
    }

    public final FieldMatcher allOf(FieldMatcher... fieldMatcherArr) {
        fieldMatcherArr.getClass();
        List listAsList = Arrays.asList(fieldMatcherArr);
        listAsList.getClass();
        allOf(listAsList);
        return this;
    }

    public final FieldMatcher annotationCount(int i, int i2) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(i, i2);
        return this;
    }

    public final FieldMatcher anyOf(FieldMatcher... fieldMatcherArr) {
        fieldMatcherArr.getClass();
        List listAsList = Arrays.asList(fieldMatcherArr);
        listAsList.getClass();
        anyOf(listAsList);
        return this;
    }

    public final FieldMatcher noneOf(FieldMatcher... fieldMatcherArr) {
        fieldMatcherArr.getClass();
        List listAsList = Arrays.asList(fieldMatcherArr);
        listAsList.getClass();
        noneOf(listAsList);
        return this;
    }

    public final FieldMatcher addReadMethod(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        MethodsMatcher methodsMatcher = this.getMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.getMethodsMatcher = methodsMatcher;
        methodsMatcher.add(methodMatcher);
        return this;
    }

    public final FieldMatcher addWriteMethod(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        MethodsMatcher methodsMatcher = this.putMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.putMethodsMatcher = methodsMatcher;
        methodsMatcher.add(methodMatcher);
        return this;
    }

    public final FieldMatcher declaredClass(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return declaredClass$default(this, str, stringMatchType, false, 4, null);
    }

    public final FieldMatcher type(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    public final FieldMatcher declaredClass(ClassMatcher classMatcher) {
        classMatcher.getClass();
        this.classMatcher = classMatcher;
        return this;
    }

    public final FieldMatcher type(ClassMatcher classMatcher) {
        classMatcher.getClass();
        this.typeMatcher = classMatcher;
        return this;
    }

    public final /* synthetic */ FieldMatcher addReadMethod(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0482u5.invoke(methodMatcher);
        addReadMethod(methodMatcher);
        return this;
    }

    public final /* synthetic */ FieldMatcher addWriteMethod(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0482u5.invoke(methodMatcher);
        addWriteMethod(methodMatcher);
        return this;
    }

    public final /* synthetic */ FieldMatcher allOf(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcherList fieldMatcherList = new FieldMatcherList();
        interfaceC0482u5.invoke(fieldMatcherList);
        allOf(fieldMatcherList);
        return this;
    }

    public final /* synthetic */ FieldMatcher anyOf(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcherList fieldMatcherList = new FieldMatcherList();
        interfaceC0482u5.invoke(fieldMatcherList);
        anyOf(fieldMatcherList);
        return this;
    }

    public final FieldMatcher declaredClass(String str) {
        str.getClass();
        return declaredClass$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ FieldMatcher noneOf(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FieldMatcherList fieldMatcherList = new FieldMatcherList();
        interfaceC0482u5.invoke(fieldMatcherList);
        noneOf(fieldMatcherList);
        return this;
    }

    public final FieldMatcher type(String str) {
        str.getClass();
        return type$default(this, str, null, false, 6, null);
    }

    public final FieldMatcher declaredClass(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.classMatcher = new ClassMatcher().className(str, stringMatchType, z);
        return this;
    }

    public final FieldMatcher type(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.typeMatcher = new ClassMatcher().className(str, stringMatchType, z);
        return this;
    }

    public final /* synthetic */ FieldMatcher declaredClass(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0482u5.invoke(classMatcher);
        declaredClass(classMatcher);
        return this;
    }

    public final /* synthetic */ FieldMatcher type(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0482u5.invoke(classMatcher);
        type(classMatcher);
        return this;
    }
}
