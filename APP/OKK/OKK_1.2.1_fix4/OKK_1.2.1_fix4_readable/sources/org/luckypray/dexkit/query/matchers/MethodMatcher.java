package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.query.NumberEncodeValueMatcherList;
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.UsingFieldMatcherList;
import org.luckypray.dexkit.query.base.BaseQuery;
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
import p001A0.AbstractC0040p;
import p007D0.C0138d;
import p007D0.C0144j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p009E0.C0190u;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p036T0.C0340c;

/* JADX INFO: loaded from: classes.dex */
public final class MethodMatcher extends BaseQuery implements IAnnotationEncodeValue {
    public static final Companion Companion = new Companion(null);
    private AnnotationsMatcher annotationsMatcher;
    private MethodsMatcher callerMethodsMatcher;
    private ClassMatcher classMatcher;
    private MethodsMatcher invokeMethodsMatcher;
    private AccessFlagsMatcher modifiersMatcher;
    private StringMatcher nameMatcher;
    private OpCodesMatcher opCodesMatcher;
    private ParametersMatcher paramsMatcher;
    private String protoShortyMatcher;
    private ClassMatcher returnTypeMatcher;
    private List<UsingFieldMatcher> usingFieldsMatcher;
    private List<NumberEncodeValueMatcher> usingNumbersMatcher;
    private List<StringMatcher> usingStringsMatcher;

    public static final class Companion {
        private Companion() {
        }

        public final MethodMatcher create() {
            return new MethodMatcher();
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final MethodMatcher create(Method method) {
            AbstractC0307g.m703e(method, "method");
            return new MethodMatcher(method);
        }

        public final MethodMatcher create(Constructor<?> constructor) {
            AbstractC0307g.m703e(constructor, "constructor");
            return new MethodMatcher(constructor);
        }

        public final MethodMatcher create(String str) {
            AbstractC0307g.m703e(str, "descriptor");
            return new MethodMatcher(str);
        }
    }

    public MethodMatcher() {
    }

    public static /* synthetic */ MethodMatcher addParamType$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return methodMatcher.addParamType(str, stringMatchType, z2);
    }

    public static /* synthetic */ MethodMatcher addUsingField$default(MethodMatcher methodMatcher, FieldMatcher fieldMatcher, UsingType usingType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            usingType = UsingType.Any;
        }
        return methodMatcher.addUsingField(fieldMatcher, usingType);
    }

    public static /* synthetic */ MethodMatcher addUsingString$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return methodMatcher.addUsingString(str, stringMatchType, z2);
    }

    public static /* synthetic */ MethodMatcher annotationCount$default(MethodMatcher methodMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return methodMatcher.annotationCount(i2, i3);
    }

    public static final MethodMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ MethodMatcher declaredClass$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return methodMatcher.declaredClass(str, stringMatchType, z2);
    }

    public static /* synthetic */ MethodMatcher modifiers$default(MethodMatcher methodMatcher, int i2, MatchType matchType, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return methodMatcher.modifiers(i2, matchType);
    }

    public static /* synthetic */ MethodMatcher name$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return methodMatcher.name(str, stringMatchType, z2);
    }

    public static /* synthetic */ MethodMatcher opCodes$default(MethodMatcher methodMatcher, Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            opCodeMatchType = OpCodeMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            intRange = null;
        }
        return methodMatcher.opCodes(collection, opCodeMatchType, intRange);
    }

    public static /* synthetic */ MethodMatcher opNames$default(MethodMatcher methodMatcher, Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            opCodeMatchType = OpCodeMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            intRange = null;
        }
        return methodMatcher.opNames(collection, opCodeMatchType, intRange);
    }

    public static /* synthetic */ MethodMatcher paramCount$default(MethodMatcher methodMatcher, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return methodMatcher.paramCount(i2, i3);
    }

    public static /* synthetic */ MethodMatcher returnType$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return methodMatcher.returnType(str, stringMatchType, z2);
    }

    public static /* synthetic */ MethodMatcher usingStrings$default(MethodMatcher methodMatcher, Collection collection, StringMatchType stringMatchType, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return methodMatcher.usingStrings(collection, stringMatchType, z2);
    }

    public final MethodMatcher addAnnotation(AnnotationMatcher annotationMatcher) {
        AbstractC0307g.m703e(annotationMatcher, "annotation");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.add(annotationMatcher);
        return this;
    }

    public final MethodMatcher addCall(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "callMethod");
        MethodsMatcher methodsMatcher = this.callerMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.callerMethodsMatcher = methodsMatcher;
        methodsMatcher.add(methodMatcher);
        return this;
    }

    public final MethodMatcher addCaller(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "callerMethod");
        MethodsMatcher methodsMatcher = this.callerMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.callerMethodsMatcher = methodsMatcher;
        methodsMatcher.add(methodMatcher);
        return this;
    }

    public final MethodMatcher addEqString(String str) {
        AbstractC0307g.m703e(str, "usingString");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        return this;
    }

    public final MethodMatcher addInvoke(MethodMatcher methodMatcher) {
        AbstractC0307g.m703e(methodMatcher, "invokeMethod");
        MethodsMatcher methodsMatcher = this.invokeMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.invokeMethodsMatcher = methodsMatcher;
        methodsMatcher.add(methodMatcher);
        return this;
    }

    public final MethodMatcher addParamType(String str) {
        return addParamType$default(this, str, null, false, 6, null);
    }

    public final MethodMatcher addUsingField(String str) {
        AbstractC0307g.m703e(str, "fieldDescriptor");
        return addUsingField$default(this, str, (UsingType) null, 2, (Object) null);
    }

    public final MethodMatcher addUsingNumber(Number number) {
        AbstractC0307g.m703e(number, "usingNumber");
        List<NumberEncodeValueMatcher> arrayList = this.usingNumbersMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingNumbersMatcher = arrayList;
        arrayList.add(new NumberEncodeValueMatcher().value(number));
        return this;
    }

    public final MethodMatcher addUsingString(String str) {
        AbstractC0307g.m703e(str, "usingString");
        return addUsingString$default(this, str, null, false, 6, null);
    }

    public final MethodMatcher annotationCount(int i2) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.setCount(i2);
        return this;
    }

    public final MethodMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        AbstractC0307g.m703e(annotationsMatcher, "annotations");
        this.annotationsMatcher = annotationsMatcher;
        return this;
    }

    public final MethodMatcher callMethods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "callMethods");
        this.callerMethodsMatcher = methodsMatcher;
        return this;
    }

    public final MethodMatcher callerMethods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "callerMethods");
        this.callerMethodsMatcher = methodsMatcher;
        return this;
    }

    public final MethodMatcher declaredClass(String str) {
        AbstractC0307g.m703e(str, "className");
        return declaredClass$default(this, str, null, false, 6, null);
    }

    public final MethodMatcher descriptor(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        DexMethod dexMethod = new DexMethod(str);
        name$default(this, dexMethod.getName(), null, false, 6, null);
        declaredClass$default(this, dexMethod.getClassName(), null, false, 6, null);
        returnType$default(this, dexMethod.getReturnTypeName(), null, false, 6, null);
        paramTypes(dexMethod.getParamTypeNames());
        return this;
    }

    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    public final MethodsMatcher getCallerMethodsMatcher() {
        return this.callerMethodsMatcher;
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

    public final MethodsMatcher getInvokeMethodsMatcher() {
        return this.invokeMethodsMatcher;
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

    public final /* synthetic */ Collection getOpCodes() {
        throw new C0138d();
    }

    public final OpCodesMatcher getOpCodesMatcher() {
        return this.opCodesMatcher;
    }

    public final /* synthetic */ Collection getOpNames() {
        throw new C0138d();
    }

    public final /* synthetic */ int getParamCount() {
        throw new C0138d();
    }

    public final /* synthetic */ Collection getParamTypes() {
        throw new C0138d();
    }

    public final ParametersMatcher getParamsMatcher() {
        return this.paramsMatcher;
    }

    public final /* synthetic */ String getProtoShorty() {
        throw new C0138d();
    }

    public final String getProtoShortyMatcher() {
        return this.protoShortyMatcher;
    }

    public final /* synthetic */ String getReturnType() {
        throw new C0138d();
    }

    public final ClassMatcher getReturnTypeMatcher() {
        return this.returnTypeMatcher;
    }

    public final List<UsingFieldMatcher> getUsingFieldsMatcher() {
        return this.usingFieldsMatcher;
    }

    public final /* synthetic */ Collection getUsingNumbers() {
        throw new C0138d();
    }

    public final List<NumberEncodeValueMatcher> getUsingNumbersMatcher() {
        return this.usingNumbersMatcher;
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
        int iM1928k2;
        int iM2726createUsingNumbersTypeVectorVUfvBY;
        int iCreateUsingNumbersVector;
        AbstractC0307g.m703e(c0733b, "fbb");
        MethodMatcher.Companion companion = org.luckypray.dexkit.schema.MethodMatcher.Companion;
        StringMatcher stringMatcher = this.nameMatcher;
        int iInnerBuild = stringMatcher != null ? stringMatcher.innerBuild(c0733b) : 0;
        AccessFlagsMatcher accessFlagsMatcher = this.modifiersMatcher;
        int iInnerBuild2 = accessFlagsMatcher != null ? accessFlagsMatcher.innerBuild(c0733b) : 0;
        ClassMatcher classMatcher = this.classMatcher;
        int iInnerBuild3 = classMatcher != null ? classMatcher.innerBuild(c0733b) : 0;
        ClassMatcher classMatcher2 = this.returnTypeMatcher;
        int iInnerBuild4 = classMatcher2 != null ? classMatcher2.innerBuild(c0733b) : 0;
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        int iInnerBuild5 = parametersMatcher != null ? parametersMatcher.innerBuild(c0733b) : 0;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iInnerBuild6 = annotationsMatcher != null ? annotationsMatcher.innerBuild(c0733b) : 0;
        OpCodesMatcher opCodesMatcher = this.opCodesMatcher;
        int iInnerBuild7 = opCodesMatcher != null ? opCodesMatcher.innerBuild(c0733b) : 0;
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
        List<UsingFieldMatcher> list2 = this.usingFieldsMatcher;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0183n.m559k0(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((UsingFieldMatcher) it2.next()).innerBuild(c0733b)));
            }
            iM1928k2 = c0733b.m1928k(AbstractC0181l.m552x0(arrayList2));
        } else {
            iM1928k2 = 0;
        }
        List<NumberEncodeValueMatcher> list3 = this.usingNumbersMatcher;
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC0183n.m559k0(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                NumberEncodeValueType type = ((NumberEncodeValueMatcher) it3.next()).getType();
                AbstractC0307g.m700b(type);
                arrayList3.add(new C0144j(type.m2672getValuew2LRezQ()));
            }
            iM2726createUsingNumbersTypeVectorVUfvBY = org.luckypray.dexkit.schema.MethodMatcher.Companion.m2726createUsingNumbersTypeVectorVUfvBY(c0733b, AbstractC0040p.m99c0(arrayList3));
        } else {
            iM2726createUsingNumbersTypeVectorVUfvBY = 0;
        }
        List<NumberEncodeValueMatcher> list4 = this.usingNumbersMatcher;
        if (list4 != null) {
            ArrayList arrayList4 = new ArrayList(AbstractC0183n.m559k0(list4, 10));
            for (Iterator it4 = list4.iterator(); it4.hasNext(); it4 = it4) {
                Object value = ((NumberEncodeValueMatcher) it4.next()).getValue();
                AbstractC0307g.m701c(value, "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseQuery");
                arrayList4.add(Integer.valueOf(((BaseQuery) value).innerBuild(c0733b)));
            }
            iCreateUsingNumbersVector = org.luckypray.dexkit.schema.MethodMatcher.Companion.createUsingNumbersVector(c0733b, AbstractC0181l.m552x0(arrayList4));
        } else {
            iCreateUsingNumbersVector = 0;
        }
        MethodsMatcher methodsMatcher = this.invokeMethodsMatcher;
        int iInnerBuild8 = methodsMatcher != null ? methodsMatcher.innerBuild(c0733b) : 0;
        MethodsMatcher methodsMatcher2 = this.callerMethodsMatcher;
        int iInnerBuild9 = methodsMatcher2 != null ? methodsMatcher2.innerBuild(c0733b) : 0;
        String str = this.protoShortyMatcher;
        int iCreateMethodMatcher = companion.createMethodMatcher(c0733b, iInnerBuild, iInnerBuild2, iInnerBuild3, iInnerBuild4, iInnerBuild5, iInnerBuild6, iInnerBuild7, iM1928k, iM1928k2, iM2726createUsingNumbersTypeVectorVUfvBY, iCreateUsingNumbersVector, iInnerBuild8, iInnerBuild9, str != null ? c0733b.m1927j(str) : 0);
        c0733b.m1931n(iCreateMethodMatcher);
        return iCreateMethodMatcher;
    }

    public final MethodMatcher invokeMethods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "invokeMethods");
        this.invokeMethodsMatcher = methodsMatcher;
        return this;
    }

    public final MethodMatcher modifiers(int i2) {
        return modifiers$default(this, i2, null, 2, null);
    }

    public final MethodMatcher name(String str) {
        AbstractC0307g.m703e(str, "name");
        return name$default(this, str, null, false, 6, null);
    }

    public final MethodMatcher opCodes(Collection<Integer> collection) {
        AbstractC0307g.m703e(collection, "opCodes");
        return opCodes$default(this, collection, null, null, 6, null);
    }

    public final MethodMatcher opNames(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "opNames");
        return opNames$default(this, collection, null, null, 6, null);
    }

    /* JADX INFO: renamed from: paramCount, reason: merged with bridge method [inline-methods] */
    public final MethodMatcher setParamCount(int i2) {
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        AbstractC0307g.m700b(parametersMatcher);
        parametersMatcher.setCount(i2);
        return this;
    }

    public final MethodMatcher paramTypes(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "paramTypes");
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C0190u.f401a);
        for (String str : collection) {
            parametersMatcher.add(str != null ? ParameterMatcher.type$default(new ParameterMatcher(), str, null, false, 6, null) : null);
        }
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    public final MethodMatcher params(ParametersMatcher parametersMatcher) {
        AbstractC0307g.m703e(parametersMatcher, "params");
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    public final MethodMatcher protoShorty(String str) {
        AbstractC0307g.m703e(str, "shorty");
        this.protoShortyMatcher = str;
        return this;
    }

    public final MethodMatcher returnType(String str) {
        AbstractC0307g.m703e(str, "typeName");
        return returnType$default(this, str, null, false, 6, null);
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

    public final void setOpCodes(Collection<Integer> collection) {
        AbstractC0307g.m703e(collection, "value");
        opCodes$default(this, collection, null, null, 6, null);
    }

    public final void setOpNames(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "value");
        opNames$default(this, collection, null, null, 6, null);
    }

    public final /* synthetic */ void setParamTypes(Collection collection) {
        AbstractC0307g.m703e(collection, "value");
        paramTypes((Collection<String>) collection);
    }

    public final /* synthetic */ void setProtoShorty(String str) {
        AbstractC0307g.m703e(str, "value");
        protoShorty(str);
    }

    public final /* synthetic */ void setReturnType(String str) {
        AbstractC0307g.m703e(str, "value");
        returnType$default(this, str, null, false, 6, null);
    }

    public final void setUsingNumbers(Collection<? extends Number> collection) {
        AbstractC0307g.m703e(collection, "value");
        usingNumbers(collection);
    }

    public final /* synthetic */ void setUsingStrings(Collection collection) {
        AbstractC0307g.m703e(collection, "value");
        usingStrings$default(this, collection, null, false, 6, null);
    }

    public final MethodMatcher usingEqStrings(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "usingStrings");
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    public final MethodMatcher usingFields(Collection<UsingFieldMatcher> collection) {
        AbstractC0307g.m703e(collection, "usingFields");
        this.usingFieldsMatcher = AbstractC0181l.m541A0(collection);
        return this;
    }

    public final MethodMatcher usingNumbers(NumberEncodeValueMatcherList numberEncodeValueMatcherList) {
        AbstractC0307g.m703e(numberEncodeValueMatcherList, "usingNumbers");
        this.usingNumbersMatcher = numberEncodeValueMatcherList;
        return this;
    }

    public final MethodMatcher usingStrings(Collection<String> collection) {
        AbstractC0307g.m703e(collection, "usingStrings");
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    public MethodMatcher(Method method) {
        AbstractC0307g.m703e(method, "method");
        descriptor(DexSignUtil.getDescriptor(method));
    }

    public static /* synthetic */ MethodMatcher addUsingField$default(MethodMatcher methodMatcher, String str, UsingType usingType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            usingType = UsingType.Any;
        }
        return methodMatcher.addUsingField(str, usingType);
    }

    private final MethodMatcher annotations(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        interfaceC0286l.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    private final MethodMatcher callMethods(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0286l.invoke(methodsMatcher);
        callMethods(methodsMatcher);
        return this;
    }

    private final MethodMatcher callerMethods(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0286l.invoke(methodsMatcher);
        callerMethods(methodsMatcher);
        return this;
    }

    public static final MethodMatcher create(String str) {
        return Companion.create(str);
    }

    private final MethodMatcher invokeMethods(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        interfaceC0286l.invoke(methodsMatcher);
        invokeMethods(methodsMatcher);
        return this;
    }

    private final MethodMatcher params(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        interfaceC0286l.invoke(parametersMatcher);
        params(parametersMatcher);
        return this;
    }

    private final MethodMatcher usingFields(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        UsingFieldMatcherList usingFieldMatcherList = new UsingFieldMatcherList();
        interfaceC0286l.invoke(usingFieldMatcherList);
        usingFields(usingFieldMatcherList);
        return this;
    }

    private final MethodMatcher usingNumbers(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        NumberEncodeValueMatcherList numberEncodeValueMatcherList = new NumberEncodeValueMatcherList();
        interfaceC0286l.invoke(numberEncodeValueMatcherList);
        usingNumbers(numberEncodeValueMatcherList);
        return this;
    }

    public final MethodMatcher addParamType(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addParamType$default(this, str, stringMatchType, false, 4, null);
    }

    public final MethodMatcher addUsingField(FieldMatcher fieldMatcher) {
        AbstractC0307g.m703e(fieldMatcher, "usingField");
        return addUsingField$default(this, fieldMatcher, (UsingType) null, 2, (Object) null);
    }

    public final MethodMatcher addUsingString(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "usingString");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return addUsingString$default(this, str, stringMatchType, false, 4, null);
    }

    public final MethodMatcher declaredClass(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return declaredClass$default(this, str, stringMatchType, false, 4, null);
    }

    public final MethodMatcher modifiers(AccessFlagsMatcher accessFlagsMatcher) {
        AbstractC0307g.m703e(accessFlagsMatcher, "modifiers");
        this.modifiersMatcher = accessFlagsMatcher;
        return this;
    }

    public final MethodMatcher name(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "name");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    public final MethodMatcher opCodes(Collection<Integer> collection, OpCodeMatchType opCodeMatchType) {
        AbstractC0307g.m703e(collection, "opCodes");
        AbstractC0307g.m703e(opCodeMatchType, "matchType");
        return opCodes$default(this, collection, opCodeMatchType, null, 4, null);
    }

    public final MethodMatcher opNames(Collection<String> collection, OpCodeMatchType opCodeMatchType) {
        AbstractC0307g.m703e(collection, "opNames");
        AbstractC0307g.m703e(opCodeMatchType, "matchType");
        return opNames$default(this, collection, opCodeMatchType, null, 4, null);
    }

    public final MethodMatcher returnType(String str, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return returnType$default(this, str, stringMatchType, false, 4, null);
    }

    public final MethodMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType) {
        AbstractC0307g.m703e(collection, "usingStrings");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    private final MethodMatcher addAnnotation(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        interfaceC0286l.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public static final MethodMatcher create(Constructor<?> constructor) {
        return Companion.create(constructor);
    }

    public final MethodMatcher addCall(String str) {
        AbstractC0307g.m703e(str, "methodDescriptor");
        MethodsMatcher methodsMatcher = this.callerMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.callerMethodsMatcher = methodsMatcher;
        methodsMatcher.add(new MethodMatcher(str));
        return this;
    }

    public final MethodMatcher addCaller(String str) {
        AbstractC0307g.m703e(str, "methodDescriptor");
        MethodsMatcher methodsMatcher = this.callerMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.callerMethodsMatcher = methodsMatcher;
        methodsMatcher.add(new MethodMatcher(str));
        return this;
    }

    public final MethodMatcher addInvoke(String str) {
        AbstractC0307g.m703e(str, "methodDescriptor");
        MethodsMatcher methodsMatcher = this.invokeMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.invokeMethodsMatcher = methodsMatcher;
        methodsMatcher.add(new MethodMatcher(str));
        return this;
    }

    public final MethodMatcher addParamType(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(stringMatchType, "matchType");
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        if (parametersMatcher == null) {
            parametersMatcher = new ParametersMatcher();
        }
        this.paramsMatcher = parametersMatcher;
        parametersMatcher.add(str != null ? new ParameterMatcher().type(str, stringMatchType, z2) : null);
        return this;
    }

    public final MethodMatcher addUsingField(UsingFieldMatcher usingFieldMatcher) {
        AbstractC0307g.m703e(usingFieldMatcher, "usingField");
        List<UsingFieldMatcher> arrayList = this.usingFieldsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingFieldsMatcher = arrayList;
        arrayList.add(usingFieldMatcher);
        return this;
    }

    public final MethodMatcher addUsingString(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "usingString");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(stringMatcher);
        return this;
    }

    public final MethodMatcher annotationCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(intRange);
        return this;
    }

    public final MethodMatcher declaredClass(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "declaredClass");
        this.classMatcher = classMatcher;
        return this;
    }

    public final MethodMatcher modifiers(int i2, MatchType matchType) {
        AbstractC0307g.m703e(matchType, "matchType");
        this.modifiersMatcher = new AccessFlagsMatcher(i2, matchType);
        return this;
    }

    public final MethodMatcher name(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "name");
        this.nameMatcher = stringMatcher;
        return this;
    }

    public final MethodMatcher opCodes(OpCodesMatcher opCodesMatcher) {
        AbstractC0307g.m703e(opCodesMatcher, "opCodes");
        this.opCodesMatcher = opCodesMatcher;
        return this;
    }

    public final MethodMatcher opNames(Collection<String> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        AbstractC0307g.m703e(collection, "opNames");
        AbstractC0307g.m703e(opCodeMatchType, "matchType");
        this.opCodesMatcher = OpCodesMatcher.Companion.createForOpNames(collection, opCodeMatchType, intRange);
        return this;
    }

    public final MethodMatcher paramCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "range");
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        AbstractC0307g.m700b(parametersMatcher);
        parametersMatcher.count(intRange);
        return this;
    }

    public final MethodMatcher returnType(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "type");
        this.returnTypeMatcher = classMatcher;
        return this;
    }

    public final MethodMatcher usingNumbers(Collection<? extends Number> collection) {
        AbstractC0307g.m703e(collection, "usingNumbers");
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new NumberEncodeValueMatcher().value((Number) it.next()));
        }
        this.usingNumbersMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    public final MethodMatcher usingStrings(StringMatcherList stringMatcherList) {
        AbstractC0307g.m703e(stringMatcherList, "usingStrings");
        this.usingStringsMatcher = stringMatcherList;
        return this;
    }

    public MethodMatcher(Constructor<?> constructor) {
        AbstractC0307g.m703e(constructor, "constructor");
        descriptor(DexSignUtil.getDescriptor(constructor));
    }

    public static final MethodMatcher create(Method method) {
        return Companion.create(method);
    }

    private final MethodMatcher usingStrings(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        StringMatcherList stringMatcherList = new StringMatcherList();
        interfaceC0286l.invoke(stringMatcherList);
        usingStrings(stringMatcherList);
        return this;
    }

    public final MethodMatcher declaredClass(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        this.classMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(cls), null, false, 6, null);
        return this;
    }

    public final MethodMatcher name(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "name");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.nameMatcher = new StringMatcher(str, stringMatchType, z2);
        return this;
    }

    public final MethodMatcher opCodes(Collection<Integer> collection, OpCodeMatchType opCodeMatchType, IntRange intRange) {
        AbstractC0307g.m703e(collection, "opCodes");
        AbstractC0307g.m703e(opCodeMatchType, "matchType");
        this.opCodesMatcher = new OpCodesMatcher(collection, opCodeMatchType, intRange);
        return this;
    }

    public final MethodMatcher returnType(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        this.returnTypeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(cls), null, false, 6, null);
        return this;
    }

    private final MethodMatcher addCall(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        addCall(methodMatcher);
        return this;
    }

    private final MethodMatcher addCaller(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        addCaller(methodMatcher);
        return this;
    }

    private final MethodMatcher addInvoke(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        interfaceC0286l.invoke(methodMatcher);
        addInvoke(methodMatcher);
        return this;
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

    public final MethodMatcher addUsingField(FieldMatcher fieldMatcher, UsingType usingType) {
        AbstractC0307g.m703e(fieldMatcher, "usingField");
        AbstractC0307g.m703e(usingType, "usingType");
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

    public final MethodMatcher addUsingString(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "usingString");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        arrayList.add(new StringMatcher(str, stringMatchType, z2));
        return this;
    }

    public final MethodMatcher annotationCount(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(c0340c);
        return this;
    }

    public final MethodMatcher declaredClass(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "className");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.classMatcher = new ClassMatcher().className(str, stringMatchType, z2);
        return this;
    }

    public final MethodMatcher paramCount(C0340c c0340c) {
        AbstractC0307g.m703e(c0340c, "range");
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        AbstractC0307g.m700b(parametersMatcher);
        parametersMatcher.count(c0340c);
        return this;
    }

    public final MethodMatcher returnType(String str, StringMatchType stringMatchType, boolean z2) {
        AbstractC0307g.m703e(str, "typeName");
        AbstractC0307g.m703e(stringMatchType, "matchType");
        this.returnTypeMatcher = new ClassMatcher().className(str, stringMatchType, z2);
        return this;
    }

    public final MethodMatcher usingStrings(Collection<String> collection, StringMatchType stringMatchType, boolean z2) {
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

    public MethodMatcher(String str) {
        AbstractC0307g.m703e(str, "descriptor");
        descriptor(str);
    }

    private final MethodMatcher declaredClass(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        declaredClass(classMatcher);
        return this;
    }

    private final MethodMatcher returnType(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        returnType(classMatcher);
        return this;
    }

    public final MethodMatcher paramTypes() {
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C0190u.f401a);
        this.paramsMatcher = parametersMatcher;
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

    public final MethodMatcher annotationCount(int i2, int i3) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        annotationsMatcher.count(i2, i3);
        return this;
    }

    public final MethodMatcher paramCount(int i2, int i3) {
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        AbstractC0307g.m700b(parametersMatcher);
        parametersMatcher.count(i2, i3);
        return this;
    }

    public final MethodMatcher usingEqStrings(String... strArr) {
        AbstractC0307g.m703e(strArr, "usingStrings");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    private final MethodMatcher addParamType(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        interfaceC0286l.invoke(classMatcher);
        addParamType(classMatcher);
        return this;
    }

    public final MethodMatcher paramTypes(String... strArr) {
        AbstractC0307g.m703e(strArr, "paramTypes");
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C0190u.f401a);
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            parametersMatcher.add(str != null ? ParameterMatcher.type$default(new ParameterMatcher(), str, null, false, 6, null) : null);
        }
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    public final MethodMatcher usingNumbers(Number... numberArr) {
        AbstractC0307g.m703e(numberArr, "usingNumbers");
        ArrayList arrayList = new ArrayList(numberArr.length);
        for (Number number : numberArr) {
            arrayList.add(new NumberEncodeValueMatcher().value(number));
        }
        this.usingNumbersMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    public final MethodMatcher addUsingField(String str, UsingType usingType) {
        AbstractC0307g.m703e(str, "fieldDescriptor");
        AbstractC0307g.m703e(usingType, "usingType");
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

    public final MethodMatcher usingStrings(String... strArr) {
        AbstractC0307g.m703e(strArr, "usingStrings");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.usingStringsMatcher = AbstractC0181l.m541A0(arrayList);
        return this;
    }

    public final MethodMatcher paramTypes(Class<?>... clsArr) {
        AbstractC0307g.m703e(clsArr, "paramTypes");
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C0190u.f401a);
        int length = clsArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Class<?> cls = clsArr[i2];
            parametersMatcher.add(cls != null ? new ParameterMatcher().type(cls) : null);
        }
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    private final MethodMatcher addUsingField(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "init");
        UsingFieldMatcher usingFieldMatcher = new UsingFieldMatcher();
        interfaceC0286l.invoke(usingFieldMatcher);
        addUsingField(usingFieldMatcher);
        return this;
    }
}
