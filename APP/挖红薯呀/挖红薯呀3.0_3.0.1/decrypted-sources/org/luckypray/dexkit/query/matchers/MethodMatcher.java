package org.luckypray.dexkit.query.matchers;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.MethodMatcherList;
import org.luckypray.dexkit.query.NumberEncodeValueMatcherList;
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.UsingFieldMatcherList;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.enums.OpCodeMatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.enums.UsingType;
import org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher;
import org.luckypray.dexkit.query.matchers.base.OpCodesMatcher;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.MethodMatcher;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexMethod;
import p000.AbstractC0619pl;
import p000.AbstractC0960ye;
import p000.AbstractC1001ze;
import p000.C0096cl;
import p000.C0294hs;
import p000.C0938xt;
import p000.InterfaceC0061bn;
import p000.InterfaceC0742sw;
import p000.ia1;
import p000.v50;
import p000.z20;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodMatcher extends BaseMatcher implements IAnnotationEncodeValue {
    public static final Companion Companion = new Companion(null);
    private List<MethodMatcher> allOfMatchers;
    private AnnotationsMatcher annotationsMatcher;
    private List<MethodMatcher> anyOfMatchers;
    private MethodsMatcher callerMethodsMatcher;
    private ClassMatcher classMatcher;
    private MethodsMatcher invokeMethodsMatcher;
    private AccessFlagsMatcher modifiersMatcher;
    private StringMatcher nameMatcher;
    private List<MethodMatcher> noneOfMatchers;
    private OpCodesMatcher opCodesMatcher;
    private ParametersMatcher paramsMatcher;
    private String protoShortyMatcher;
    private ClassMatcher returnTypeMatcher;
    private List<UsingFieldMatcher> usingFieldsMatcher;
    private List<NumberEncodeValueMatcher> usingNumbersMatcher;
    private List<StringMatcher> usingStringsMatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MethodMatcher(Method method) {
        method.getClass();
        descriptor(DexSignUtil.getDescriptor(method));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher addParamType$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.addParamType(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher addUsingField$default(MethodMatcher methodMatcher, FieldMatcher fieldMatcher, UsingType usingType, int i, Object obj) {
        if ((i & 2) != 0) {
            usingType = UsingType.Any;
        }
        return methodMatcher.addUsingField(fieldMatcher, usingType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher addUsingString$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.addUsingString(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher annotationCount$default(MethodMatcher methodMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return methodMatcher.annotationCount(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final MethodMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher declaredClass$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.declaredClass(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher modifiers$default(MethodMatcher methodMatcher, int i, MatchType matchType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return methodMatcher.modifiers(i, matchType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher name$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.name(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher opCodes$default(MethodMatcher methodMatcher, Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, Object obj) {
        if ((i & 2) != 0) {
            opCodeMatchType = OpCodeMatchType.Contains;
        }
        if ((i & 4) != 0) {
            intRange = null;
        }
        return methodMatcher.opCodes(collection, opCodeMatchType, intRange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher opNames$default(MethodMatcher methodMatcher, Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, Object obj) {
        if ((i & 2) != 0) {
            opCodeMatchType = OpCodeMatchType.Contains;
        }
        if ((i & 4) != 0) {
            intRange = null;
        }
        return methodMatcher.opNames(collection, opCodeMatchType, intRange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher paramCount$default(MethodMatcher methodMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return methodMatcher.paramCount(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher returnType$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.returnType(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher usingStrings$default(MethodMatcher methodMatcher, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.usingStrings(collection, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher addAllOf(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        List<MethodMatcher> arrayList = this.allOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.allOfMatchers = arrayList;
        arrayList.add(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
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
    public final MethodMatcher addAnyOf(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        List<MethodMatcher> arrayList = this.anyOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.anyOfMatchers = arrayList;
        arrayList.add(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher addCaller(String str) {
        str.getClass();
        MethodsMatcher methodsMatcher = this.callerMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.callerMethodsMatcher = methodsMatcher;
        methodsMatcher.add(new MethodMatcher(str));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher addEqString(String str) {
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
    public final MethodMatcher addInvoke(String str) {
        str.getClass();
        MethodsMatcher methodsMatcher = this.invokeMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.invokeMethodsMatcher = methodsMatcher;
        methodsMatcher.add(new MethodMatcher(str));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher addNoneOf(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        List<MethodMatcher> arrayList = this.noneOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.noneOfMatchers = arrayList;
        arrayList.add(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher addParamType(String str, StringMatchType stringMatchType, boolean z) {
        stringMatchType.getClass();
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        if (parametersMatcher == null) {
            parametersMatcher = new ParametersMatcher();
        }
        this.paramsMatcher = parametersMatcher;
        parametersMatcher.add(str != null ? new ParameterMatcher().type(str, stringMatchType, z) : null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher addUsingField(String str, UsingType usingType) {
        str.getClass();
        usingType.getClass();
        List<UsingFieldMatcher> arrayList = this.usingFieldsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingFieldsMatcher = arrayList;
        UsingFieldMatcher usingFieldMatcher = new UsingFieldMatcher();
        usingFieldMatcher.field(new FieldMatcher(str));
        usingFieldMatcher.usingType(usingType);
        arrayList.add(usingFieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher addUsingNumber(Number number) {
        number.getClass();
        List<NumberEncodeValueMatcher> arrayList = this.usingNumbersMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingNumbersMatcher = arrayList;
        arrayList.add(new NumberEncodeValueMatcher().value(number));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher addUsingString(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(new StringMatcher(str, stringMatchType, z));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher allOf(Collection<MethodMatcher> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            collection = null;
        }
        this.allOfMatchers = collection != null ? new ArrayList(collection) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher annotationCount(IntRange intRange) {
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
    public final /* synthetic */ MethodMatcher annotations(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        interfaceC0742sw.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher anyOf(Collection<MethodMatcher> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            collection = null;
        }
        this.anyOfMatchers = collection != null ? new ArrayList(collection) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ MethodMatcher callerMethods(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0742sw.invoke(methodsMatcher);
        callerMethods(methodsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher declaredClass(Class<?> cls) {
        cls.getClass();
        this.classMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(cls), null, false, 6, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher descriptor(String str) {
        str.getClass();
        DexMethod dexMethod = new DexMethod(str);
        name$default(this, dexMethod.getName(), null, false, 6, null);
        declaredClass$default(this, dexMethod.getClassName(), null, false, 6, null);
        returnType$default(this, dexMethod.getReturnTypeName(), null, false, 6, null);
        paramTypes(dexMethod.getParamTypeNames());
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<MethodMatcher> getAllOfMatchers() {
        return this.allOfMatchers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<MethodMatcher> getAnyOfMatchers() {
        return this.anyOfMatchers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher getCallerMethodsMatcher() {
        return this.callerMethodsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getClassMatcher() {
        return this.classMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ String getDeclaredClass() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ String getDescriptor() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher getInvokeMethodsMatcher() {
        return this.invokeMethodsMatcher;
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
    @InterfaceC0061bn
    public final /* synthetic */ String getName() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher getNameMatcher() {
        return this.nameMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<MethodMatcher> getNoneOfMatchers() {
        return this.noneOfMatchers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ Collection getOpCodes() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpCodesMatcher getOpCodesMatcher() {
        return this.opCodesMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ Collection getOpNames() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ int getParamCount() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ Collection getParamTypes() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParametersMatcher getParamsMatcher() {
        return this.paramsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ String getProtoShorty() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getProtoShortyMatcher() {
        return this.protoShortyMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ String getReturnType() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getReturnTypeMatcher() {
        return this.returnTypeMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<UsingFieldMatcher> getUsingFieldsMatcher() {
        return this.usingFieldsMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC0061bn
    public final /* synthetic */ Collection getUsingNumbers() {
        throw new C0096cl(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<NumberEncodeValueMatcher> getUsingNumbersMatcher() {
        return this.usingNumbersMatcher;
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
        int iM5718createUsingNumbersTypeVectorVUfvBY;
        int iCreateUsingNumbersVector;
        int i;
        int iM5162k3;
        int i2;
        int iM5162k4;
        int i3;
        int i4;
        MethodMatcher.Companion companion;
        int i5;
        int iM5162k5;
        c0938xt.getClass();
        MethodMatcher.Companion companion2 = org.luckypray.dexkit.schema.MethodMatcher.Companion;
        StringMatcher stringMatcher = this.nameMatcher;
        int iBuild$dexkit_android_release = stringMatcher != null ? stringMatcher.build$dexkit_android_release(c0938xt) : 0;
        AccessFlagsMatcher accessFlagsMatcher = this.modifiersMatcher;
        int iBuild$dexkit_android_release2 = accessFlagsMatcher != null ? accessFlagsMatcher.build$dexkit_android_release(c0938xt) : 0;
        ClassMatcher classMatcher = this.classMatcher;
        int iBuild$dexkit_android_release3 = classMatcher != null ? classMatcher.build$dexkit_android_release(c0938xt) : 0;
        ClassMatcher classMatcher2 = this.returnTypeMatcher;
        int iBuild$dexkit_android_release4 = classMatcher2 != null ? classMatcher2.build$dexkit_android_release(c0938xt) : 0;
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        int iBuild$dexkit_android_release5 = parametersMatcher != null ? parametersMatcher.build$dexkit_android_release(c0938xt) : 0;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iBuild$dexkit_android_release6 = annotationsMatcher != null ? annotationsMatcher.build$dexkit_android_release(c0938xt) : 0;
        OpCodesMatcher opCodesMatcher = this.opCodesMatcher;
        int iBuild$dexkit_android_release7 = opCodesMatcher != null ? opCodesMatcher.build$dexkit_android_release(c0938xt) : 0;
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
        List<UsingFieldMatcher> list2 = this.usingFieldsMatcher;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC1001ze.m5585E(list2));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((UsingFieldMatcher) it2.next()).build$dexkit_android_release(c0938xt)));
            }
            iM5162k2 = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList2));
        } else {
            iM5162k2 = 0;
        }
        List<NumberEncodeValueMatcher> list3 = this.usingNumbersMatcher;
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC1001ze.m5585E(list3));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                NumberEncodeValueType type = ((NumberEncodeValueMatcher) it3.next()).getType();
                type.getClass();
                arrayList3.add(new ia1(type.m5664getValuew2LRezQ()));
            }
            iM5718createUsingNumbersTypeVectorVUfvBY = org.luckypray.dexkit.schema.MethodMatcher.Companion.m5718createUsingNumbersTypeVectorVUfvBY(c0938xt, v50.m4415u(arrayList3));
        } else {
            iM5718createUsingNumbersTypeVectorVUfvBY = 0;
        }
        List<NumberEncodeValueMatcher> list4 = this.usingNumbersMatcher;
        if (list4 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC1001ze.m5585E(list4));
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                Object value = ((NumberEncodeValueMatcher) it4.next()).getValue();
                value.getClass();
                arrayList4.add(Integer.valueOf(((BaseMatcher) value).build$dexkit_android_release(c0938xt)));
            }
            iCreateUsingNumbersVector = org.luckypray.dexkit.schema.MethodMatcher.Companion.createUsingNumbersVector(c0938xt, AbstractC0960ye.m5252V(arrayList4));
        } else {
            iCreateUsingNumbersVector = 0;
        }
        MethodsMatcher methodsMatcher = this.invokeMethodsMatcher;
        int iBuild$dexkit_android_release8 = methodsMatcher != null ? methodsMatcher.build$dexkit_android_release(c0938xt) : 0;
        MethodsMatcher methodsMatcher2 = this.callerMethodsMatcher;
        int iBuild$dexkit_android_release9 = methodsMatcher2 != null ? methodsMatcher2.build$dexkit_android_release(c0938xt) : 0;
        String str = this.protoShortyMatcher;
        int iM5161j = str != null ? c0938xt.m5161j(str) : 0;
        List<MethodMatcher> list5 = this.allOfMatchers;
        if (list5 != null) {
            i = iBuild$dexkit_android_release;
            ArrayList arrayList5 = new ArrayList(AbstractC1001ze.m5585E(list5));
            for (Iterator it5 = list5.iterator(); it5.hasNext(); it5 = it5) {
                arrayList5.add(Integer.valueOf(((MethodMatcher) it5.next()).build$dexkit_android_release(c0938xt)));
            }
            iM5162k3 = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList5));
        } else {
            i = iBuild$dexkit_android_release;
            iM5162k3 = 0;
        }
        List<MethodMatcher> list6 = this.anyOfMatchers;
        if (list6 != null) {
            i2 = iM5162k3;
            ArrayList arrayList6 = new ArrayList(AbstractC1001ze.m5585E(list6));
            for (Iterator it6 = list6.iterator(); it6.hasNext(); it6 = it6) {
                arrayList6.add(Integer.valueOf(((MethodMatcher) it6.next()).build$dexkit_android_release(c0938xt)));
            }
            iM5162k4 = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList6));
        } else {
            i2 = iM5162k3;
            iM5162k4 = 0;
        }
        List<MethodMatcher> list7 = this.noneOfMatchers;
        if (list7 != null) {
            ArrayList arrayList7 = new ArrayList(AbstractC1001ze.m5585E(list7));
            for (Iterator it7 = list7.iterator(); it7.hasNext(); it7 = it7) {
                arrayList7.add(Integer.valueOf(((MethodMatcher) it7.next()).build$dexkit_android_release(c0938xt)));
            }
            i3 = iM5161j;
            i4 = iM5162k4;
            companion = companion2;
            i5 = i2;
            iM5162k5 = c0938xt.m5162k(AbstractC0960ye.m5252V(arrayList7));
        } else {
            i3 = iM5161j;
            i4 = iM5162k4;
            companion = companion2;
            i5 = i2;
            iM5162k5 = 0;
        }
        int iCreateMethodMatcher = companion.createMethodMatcher(c0938xt, i, iBuild$dexkit_android_release2, iBuild$dexkit_android_release3, iBuild$dexkit_android_release4, iBuild$dexkit_android_release5, iBuild$dexkit_android_release6, iBuild$dexkit_android_release7, iM5162k, iM5162k2, iM5718createUsingNumbersTypeVectorVUfvBY, iCreateUsingNumbersVector, iBuild$dexkit_android_release8, iBuild$dexkit_android_release9, i3, i5, i4, iM5162k5);
        c0938xt.m5165n(iCreateMethodMatcher);
        return iCreateMethodMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ MethodMatcher invokeMethods(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0742sw.invoke(methodsMatcher);
        invokeMethods(methodsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher modifiers(int i, MatchType matchType) {
        matchType.getClass();
        this.modifiersMatcher = new AccessFlagsMatcher(i, matchType);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher name(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher noneOf(Collection<MethodMatcher> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            collection = null;
        }
        this.noneOfMatchers = collection != null ? new ArrayList(collection) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ MethodMatcher not(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0742sw.invoke(methodMatcher);
        not(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher opCodes(Collection<Integer> collection, OpCodeMatchType opCodeMatchType) {
        collection.getClass();
        opCodeMatchType.getClass();
        return opCodes$default(this, collection, opCodeMatchType, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher opNames(Collection<String> collection, OpCodeMatchType opCodeMatchType) {
        collection.getClass();
        opCodeMatchType.getClass();
        return opNames$default(this, collection, opCodeMatchType, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher paramCount(IntRange intRange) {
        intRange.getClass();
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        parametersMatcher.getClass();
        parametersMatcher.count(intRange);
        return this;
    }

    /* JADX DEBUG: Class process forced to load method for inline: org.luckypray.dexkit.query.matchers.ParameterMatcher.type$default(org.luckypray.dexkit.query.matchers.ParameterMatcher, java.lang.String, org.luckypray.dexkit.query.enums.StringMatchType, boolean, int, java.lang.Object):org.luckypray.dexkit.query.matchers.ParameterMatcher */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher paramTypes(Collection<String> collection) {
        collection.getClass();
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C0294hs.f2354d);
        for (String str : collection) {
            parametersMatcher.add(str != null ? ParameterMatcher.type$default(new ParameterMatcher(), str, null, false, 6, null) : null);
        }
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ MethodMatcher params(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        interfaceC0742sw.invoke(parametersMatcher);
        params(parametersMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher protoShorty(String str) {
        str.getClass();
        this.protoShortyMatcher = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher returnType(Class<?> cls) {
        cls.getClass();
        this.returnTypeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(cls), null, false, 6, null);
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
    public final void setOpCodes(Collection<Integer> collection) {
        collection.getClass();
        opCodes$default(this, collection, null, null, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOpNames(Collection<String> collection) {
        collection.getClass();
        opNames$default(this, collection, null, null, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setParamTypes(Collection collection) {
        collection.getClass();
        paramTypes((Collection<String>) collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setProtoShorty(String str) {
        str.getClass();
        protoShorty(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setReturnType(String str) {
        str.getClass();
        returnType$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUsingNumbers(Collection<? extends Number> collection) {
        collection.getClass();
        usingNumbers(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void setUsingStrings(Collection collection) {
        collection.getClass();
        usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher usingEqStrings(Collection<String> collection) {
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
    public final /* synthetic */ MethodMatcher usingFields(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        UsingFieldMatcherList usingFieldMatcherList = new UsingFieldMatcherList();
        interfaceC0742sw.invoke(usingFieldMatcherList);
        usingFields(usingFieldMatcherList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher usingNumbers(Collection<? extends Number> collection) {
        collection.getClass();
        Collection<? extends Number> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(collection2));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new NumberEncodeValueMatcher().value((Number) it.next()));
        }
        this.usingNumbersMatcher = new ArrayList(arrayList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType, boolean z) {
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.MethodMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final MethodMatcher create(Method method) {
            method.getClass();
            return new MethodMatcher(method);
        }

        private Companion() {
        }

        public final MethodMatcher create() {
            return new MethodMatcher();
        }

        public final MethodMatcher create(Constructor<?> constructor) {
            constructor.getClass();
            return new MethodMatcher(constructor);
        }

        public final MethodMatcher create(String str) {
            str.getClass();
            return new MethodMatcher(str);
        }
    }

    public static final MethodMatcher create(String str) {
        return Companion.create(str);
    }

    public static final MethodMatcher create(Constructor<?> constructor) {
        return Companion.create(constructor);
    }

    public static final MethodMatcher create(Method method) {
        return Companion.create(method);
    }

    public static /* synthetic */ MethodMatcher addUsingField$default(MethodMatcher methodMatcher, String str, UsingType usingType, int i, Object obj) {
        if ((i & 2) != 0) {
            usingType = UsingType.Any;
        }
        return methodMatcher.addUsingField(str, usingType);
    }

    public final MethodMatcher modifiers(AccessFlagsMatcher accessFlagsMatcher) {
        accessFlagsMatcher.getClass();
        this.modifiersMatcher = accessFlagsMatcher;
        return this;
    }

    public final MethodMatcher modifiers(int i) {
        return modifiers$default(this, i, null, 2, null);
    }

    public MethodMatcher() {
    }

    public MethodMatcher(Constructor<?> constructor) {
        constructor.getClass();
        descriptor(DexSignUtil.getDescriptor(constructor));
    }

    public final MethodMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        annotationsMatcher.getClass();
        this.annotationsMatcher = annotationsMatcher;
        return this;
    }

    public final MethodMatcher callerMethods(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        this.callerMethodsMatcher = methodsMatcher;
        return this;
    }

    public final MethodMatcher invokeMethods(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        this.invokeMethodsMatcher = methodsMatcher;
        return this;
    }

    public final MethodMatcher not(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        addNoneOf(methodMatcher);
        return this;
    }

    public final MethodMatcher params(ParametersMatcher parametersMatcher) {
        parametersMatcher.getClass();
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    public final MethodMatcher usingFields(Collection<UsingFieldMatcher> collection) {
        collection.getClass();
        this.usingFieldsMatcher = new ArrayList(collection);
        return this;
    }

    public MethodMatcher(String str) {
        str.getClass();
        descriptor(str);
    }

    public final MethodMatcher name(String str) {
        str.getClass();
        return name$default(this, str, null, false, 6, null);
    }

    public final MethodMatcher opCodes(Collection<Integer> collection) {
        collection.getClass();
        return opCodes$default(this, collection, null, null, 6, null);
    }

    public final MethodMatcher opNames(Collection<String> collection) {
        collection.getClass();
        return opNames$default(this, collection, null, null, 6, null);
    }

    public final /* synthetic */ MethodMatcher addAllOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0742sw.invoke(methodMatcher);
        addAllOf(methodMatcher);
        return this;
    }

    public final /* synthetic */ MethodMatcher addAnnotation(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0742sw.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public final /* synthetic */ MethodMatcher addAnyOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0742sw.invoke(methodMatcher);
        addAnyOf(methodMatcher);
        return this;
    }

    public final /* synthetic */ MethodMatcher addNoneOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0742sw.invoke(methodMatcher);
        addNoneOf(methodMatcher);
        return this;
    }

    public final MethodMatcher annotationCount(int i) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.setCount(i);
        return this;
    }

    public final MethodMatcher name(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        this.nameMatcher = stringMatcher;
        return this;
    }

    public final MethodMatcher opCodes(OpCodesMatcher opCodesMatcher) {
        opCodesMatcher.getClass();
        this.opCodesMatcher = opCodesMatcher;
        return this;
    }

    public final MethodMatcher opNames(Collection<String> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        collection.getClass();
        opCodeMatchType.getClass();
        this.opCodesMatcher = OpCodesMatcher.Companion.createForOpNames(collection, opCodeMatchType, intRange);
        return this;
    }

    public final MethodMatcher name(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.nameMatcher = new StringMatcher(str, stringMatchType, z);
        return this;
    }

    public final MethodMatcher opCodes(Collection<Integer> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        collection.getClass();
        opCodeMatchType.getClass();
        this.opCodesMatcher = new OpCodesMatcher(collection, opCodeMatchType, intRange);
        return this;
    }

    public final MethodMatcher annotationCount(z20 z20Var) {
        z20Var.getClass();
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(z20Var);
        return this;
    }

    public final MethodMatcher allOf(MethodMatcher... methodMatcherArr) {
        methodMatcherArr.getClass();
        List listAsList = Arrays.asList(methodMatcherArr);
        listAsList.getClass();
        allOf(listAsList);
        return this;
    }

    public final MethodMatcher annotationCount(int i, int i2) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(i, i2);
        return this;
    }

    public final MethodMatcher anyOf(MethodMatcher... methodMatcherArr) {
        methodMatcherArr.getClass();
        List listAsList = Arrays.asList(methodMatcherArr);
        listAsList.getClass();
        anyOf(listAsList);
        return this;
    }

    public final MethodMatcher noneOf(MethodMatcher... methodMatcherArr) {
        methodMatcherArr.getClass();
        List listAsList = Arrays.asList(methodMatcherArr);
        listAsList.getClass();
        noneOf(listAsList);
        return this;
    }

    public final MethodMatcher addCaller(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        MethodsMatcher methodsMatcher = this.callerMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.callerMethodsMatcher = methodsMatcher;
        methodsMatcher.add(methodMatcher);
        return this;
    }

    public final MethodMatcher addInvoke(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        MethodsMatcher methodsMatcher = this.invokeMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.invokeMethodsMatcher = methodsMatcher;
        methodsMatcher.add(methodMatcher);
        return this;
    }

    public final MethodMatcher declaredClass(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return declaredClass$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Method merged with bridge method: setParamCount(I)V */
    /* JADX INFO: renamed from: paramCount, reason: merged with bridge method [inline-methods] */
    public final MethodMatcher setParamCount(int i) {
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        parametersMatcher.getClass();
        parametersMatcher.setCount(i);
        return this;
    }

    public final MethodMatcher returnType(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return returnType$default(this, str, stringMatchType, false, 4, null);
    }

    public final MethodMatcher declaredClass(ClassMatcher classMatcher) {
        classMatcher.getClass();
        this.classMatcher = classMatcher;
        return this;
    }

    public final MethodMatcher returnType(ClassMatcher classMatcher) {
        classMatcher.getClass();
        this.returnTypeMatcher = classMatcher;
        return this;
    }

    public final /* synthetic */ MethodMatcher addCaller(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0742sw.invoke(methodMatcher);
        addCaller(methodMatcher);
        return this;
    }

    public final /* synthetic */ MethodMatcher addInvoke(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0742sw.invoke(methodMatcher);
        addInvoke(methodMatcher);
        return this;
    }

    public final /* synthetic */ MethodMatcher allOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodMatcherList methodMatcherList = new MethodMatcherList();
        interfaceC0742sw.invoke(methodMatcherList);
        allOf(methodMatcherList);
        return this;
    }

    public final /* synthetic */ MethodMatcher anyOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodMatcherList methodMatcherList = new MethodMatcherList();
        interfaceC0742sw.invoke(methodMatcherList);
        anyOf(methodMatcherList);
        return this;
    }

    public final MethodMatcher declaredClass(String str) {
        str.getClass();
        return declaredClass$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ MethodMatcher noneOf(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        MethodMatcherList methodMatcherList = new MethodMatcherList();
        interfaceC0742sw.invoke(methodMatcherList);
        noneOf(methodMatcherList);
        return this;
    }

    public final MethodMatcher paramCount(z20 z20Var) {
        z20Var.getClass();
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        parametersMatcher.getClass();
        parametersMatcher.count(z20Var);
        return this;
    }

    public final MethodMatcher returnType(String str) {
        str.getClass();
        return returnType$default(this, str, null, false, 6, null);
    }

    public final MethodMatcher addUsingString(String str, StringMatchType stringMatchType) {
        str.getClass();
        stringMatchType.getClass();
        return addUsingString$default(this, str, stringMatchType, false, 4, null);
    }

    public final MethodMatcher declaredClass(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.classMatcher = new ClassMatcher().className(str, stringMatchType, z);
        return this;
    }

    public final MethodMatcher returnType(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        this.returnTypeMatcher = new ClassMatcher().className(str, stringMatchType, z);
        return this;
    }

    public final MethodMatcher addUsingString(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(stringMatcher);
        return this;
    }

    public final /* synthetic */ MethodMatcher declaredClass(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        declaredClass(classMatcher);
        return this;
    }

    public final MethodMatcher paramCount(int i, int i2) {
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        parametersMatcher.getClass();
        parametersMatcher.count(i, i2);
        return this;
    }

    public final /* synthetic */ MethodMatcher returnType(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        returnType(classMatcher);
        return this;
    }

    public final MethodMatcher addUsingString(String str) {
        str.getClass();
        return addUsingString$default(this, str, null, false, 6, null);
    }

    public final MethodMatcher addParamType(String str, StringMatchType stringMatchType) {
        stringMatchType.getClass();
        return addParamType$default(this, str, stringMatchType, false, 4, null);
    }

    public final MethodMatcher addParamType(String str) {
        return addParamType$default(this, str, null, false, 6, null);
    }

    public final MethodMatcher addParamType(Class<?> cls) {
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        if (parametersMatcher == null) {
            parametersMatcher = new ParametersMatcher();
        }
        this.paramsMatcher = parametersMatcher;
        parametersMatcher.add(cls != null ? new ParameterMatcher().type(cls) : null);
        return this;
    }

    public final MethodMatcher addParamType(ClassMatcher classMatcher) {
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        if (parametersMatcher == null) {
            parametersMatcher = new ParametersMatcher();
        }
        this.paramsMatcher = parametersMatcher;
        parametersMatcher.add(classMatcher != null ? new ParameterMatcher().type(classMatcher) : null);
        return this;
    }

    public final /* synthetic */ MethodMatcher addParamType(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0742sw.invoke(classMatcher);
        addParamType(classMatcher);
        return this;
    }

    public final MethodMatcher addUsingField(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        return addUsingField$default(this, fieldMatcher, (UsingType) null, 2, (Object) null);
    }

    public final MethodMatcher addUsingField(UsingFieldMatcher usingFieldMatcher) {
        usingFieldMatcher.getClass();
        List<UsingFieldMatcher> arrayList = this.usingFieldsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingFieldsMatcher = arrayList;
        arrayList.add(usingFieldMatcher);
        return this;
    }

    public final MethodMatcher addUsingField(FieldMatcher fieldMatcher, UsingType usingType) {
        fieldMatcher.getClass();
        usingType.getClass();
        List<UsingFieldMatcher> arrayList = this.usingFieldsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingFieldsMatcher = arrayList;
        UsingFieldMatcher usingFieldMatcher = new UsingFieldMatcher();
        usingFieldMatcher.field(fieldMatcher);
        usingFieldMatcher.usingType(usingType);
        arrayList.add(usingFieldMatcher);
        return this;
    }

    public final MethodMatcher addUsingField(String str) {
        str.getClass();
        return addUsingField$default(this, str, (UsingType) null, 2, (Object) null);
    }

    public final /* synthetic */ MethodMatcher addUsingField(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        UsingFieldMatcher usingFieldMatcher = new UsingFieldMatcher();
        interfaceC0742sw.invoke(usingFieldMatcher);
        addUsingField(usingFieldMatcher);
        return this;
    }

    public final MethodMatcher usingEqStrings(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = new ArrayList(arrayList);
        return this;
    }

    public final MethodMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType) {
        collection.getClass();
        stringMatchType.getClass();
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    public final MethodMatcher usingNumbers(NumberEncodeValueMatcherList numberEncodeValueMatcherList) {
        numberEncodeValueMatcherList.getClass();
        this.usingNumbersMatcher = numberEncodeValueMatcherList;
        return this;
    }

    public final MethodMatcher usingStrings(StringMatcherList stringMatcherList) {
        stringMatcherList.getClass();
        this.usingStringsMatcher = stringMatcherList;
        return this;
    }

    public final /* synthetic */ MethodMatcher usingNumbers(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        NumberEncodeValueMatcherList numberEncodeValueMatcherList = new NumberEncodeValueMatcherList();
        interfaceC0742sw.invoke(numberEncodeValueMatcherList);
        usingNumbers(numberEncodeValueMatcherList);
        return this;
    }

    public final MethodMatcher usingStrings(Collection<String> collection) {
        collection.getClass();
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    public final MethodMatcher usingNumbers(Number... numberArr) {
        numberArr.getClass();
        ArrayList arrayList = new ArrayList(numberArr.length);
        for (Number number : numberArr) {
            arrayList.add(new NumberEncodeValueMatcher().value(number));
        }
        this.usingNumbersMatcher = new ArrayList(arrayList);
        return this;
    }

    public final /* synthetic */ MethodMatcher usingStrings(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        StringMatcherList stringMatcherList = new StringMatcherList();
        interfaceC0742sw.invoke(stringMatcherList);
        usingStrings(stringMatcherList);
        return this;
    }

    public final MethodMatcher usingStrings(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.usingStringsMatcher = new ArrayList(arrayList);
        return this;
    }

    public final MethodMatcher paramTypes() {
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C0294hs.f2354d);
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    public final MethodMatcher paramTypes(String... strArr) {
        strArr.getClass();
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C0294hs.f2354d);
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            parametersMatcher.add(str != null ? ParameterMatcher.type$default(new ParameterMatcher(), str, null, false, 6, null) : null);
        }
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    public final MethodMatcher paramTypes(Class<?>... clsArr) {
        clsArr.getClass();
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C0294hs.f2354d);
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls = clsArr[i];
            parametersMatcher.add(cls != null ? new ParameterMatcher().type(cls) : null);
        }
        this.paramsMatcher = parametersMatcher;
        return this;
    }
}
