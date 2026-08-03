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
    public static final Companion Companion = null;
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

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final MethodMatcher create(Method r2) {
            AbstractC0307g.m703e(r2, "method");
            return new MethodMatcher(r2);
        }

        public final MethodMatcher create(Constructor<?> r2) {
            AbstractC0307g.m703e(r2, "constructor");
            return new MethodMatcher(r2);
        }

        public final MethodMatcher create(String r2) {
            AbstractC0307g.m703e(r2, "descriptor");
            return new MethodMatcher(r2);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public MethodMatcher() {
    }

    public static /* synthetic */ MethodMatcher addParamType$default(MethodMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.addParamType(r1, r2, r3);
    }

    public static /* synthetic */ MethodMatcher addUsingField$default(MethodMatcher r02, FieldMatcher r1, UsingType r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = UsingType.Any;
    L6:
        return r02.addUsingField(r1, r2);
    }

    public static /* synthetic */ MethodMatcher addUsingString$default(MethodMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.addUsingString(r1, r2, r3);
    }

    public static /* synthetic */ MethodMatcher annotationCount$default(MethodMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.annotationCount(r1, r2);
    }

    public static final MethodMatcher create() {
        return Companion.create();
    }

    public static /* synthetic */ MethodMatcher declaredClass$default(MethodMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.declaredClass(r1, r2, r3);
    }

    public static /* synthetic */ MethodMatcher modifiers$default(MethodMatcher r02, int r1, MatchType r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = MatchType.Contains;
    L6:
        return r02.modifiers(r1, r2);
    }

    public static /* synthetic */ MethodMatcher name$default(MethodMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.name(r1, r2, r3);
    }

    public static /* synthetic */ MethodMatcher opCodes$default(MethodMatcher r02, Collection r1, OpCodeMatchType r2, IntRange r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = OpCodeMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = null;
    L9:
        return r02.opCodes(r1, r2, r3);
    }

    public static /* synthetic */ MethodMatcher opNames$default(MethodMatcher r02, Collection r1, OpCodeMatchType r2, IntRange r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = OpCodeMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = null;
    L9:
        return r02.opNames(r1, r2, r3);
    }

    public static /* synthetic */ MethodMatcher paramCount$default(MethodMatcher r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Integer.MAX_VALUE;
    L9:
        return r02.paramCount(r1, r2);
    }

    public static /* synthetic */ MethodMatcher returnType$default(MethodMatcher r02, String r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Equals;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.returnType(r1, r2, r3);
    }

    public static /* synthetic */ MethodMatcher usingStrings$default(MethodMatcher r02, Collection r1, StringMatchType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringMatchType.Contains;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return r02.usingStrings(r1, r2, r3);
    }

    public final MethodMatcher addAnnotation(AnnotationMatcher r2) {
        AbstractC0307g.m703e(r2, "annotation");
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final MethodMatcher addCall(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "callMethod");
        MethodsMatcher r02 = this.callerMethodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.callerMethodsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final MethodMatcher addCaller(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "callerMethod");
        MethodsMatcher r02 = this.callerMethodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.callerMethodsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final MethodMatcher addEqString(String r5) {
        AbstractC0307g.m703e(r5, "usingString");
        List<StringMatcher> r02 = this.usingStringsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingStringsMatcher = r02;
        r02.add(new StringMatcher(r5, StringMatchType.Equals, false));
        return this;
    }

    public final MethodMatcher addInvoke(MethodMatcher r2) {
        AbstractC0307g.m703e(r2, "invokeMethod");
        MethodsMatcher r02 = this.invokeMethodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.invokeMethodsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final MethodMatcher addParamType(String r7) {
        return addParamType$default(this, r7, null, false, 6, null);
    }

    public final MethodMatcher addUsingField(String r3) {
        AbstractC0307g.m703e(r3, "fieldDescriptor");
        return addUsingField$default(this, r3, null, 2, null);
    }

    public final MethodMatcher addUsingNumber(Number r3) {
        AbstractC0307g.m703e(r3, "usingNumber");
        List<NumberEncodeValueMatcher> r02 = this.usingNumbersMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingNumbersMatcher = r02;
        r02.add(new NumberEncodeValueMatcher().value(r3));
        return this;
    }

    public final MethodMatcher addUsingString(String r8) {
        AbstractC0307g.m703e(r8, "usingString");
        return addUsingString$default(this, r8, null, false, 6, null);
    }

    public final MethodMatcher annotationCount(int r2) {
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final MethodMatcher annotations(AnnotationsMatcher r2) {
        AbstractC0307g.m703e(r2, "annotations");
        this.annotationsMatcher = r2;
        return this;
    }

    public final MethodMatcher callMethods(MethodsMatcher r2) {
        AbstractC0307g.m703e(r2, "callMethods");
        this.callerMethodsMatcher = r2;
        return this;
    }

    public final MethodMatcher callerMethods(MethodsMatcher r2) {
        AbstractC0307g.m703e(r2, "callerMethods");
        this.callerMethodsMatcher = r2;
        return this;
    }

    public final MethodMatcher declaredClass(String r8) {
        AbstractC0307g.m703e(r8, "className");
        return declaredClass$default(this, r8, null, false, 6, null);
    }

    public final MethodMatcher descriptor(String r14) {
        AbstractC0307g.m703e(r14, "descriptor");
        DexMethod r02 = new DexMethod(r14);
        name$default(this, r02.getName(), null, false, 6, null);
        declaredClass$default(this, r02.getClassName(), null, false, 6, null);
        returnType$default(this, r02.getReturnTypeName(), null, false, 6, null);
        paramTypes(r02.getParamTypeNames());
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
    public int innerBuild(C0733b r21) {
        AbstractC0307g.m703e(r21, "fbb");
        MethodMatcher.Companion r1 = org.luckypray.dexkit.schema.MethodMatcher.Companion;
        StringMatcher r2 = this.nameMatcher;
        if (r2 == null) goto L5;
        int r4 = BaseQuery.access$innerBuild(r2, r21);
    L6:
        AccessFlagsMatcher r22 = this.modifiersMatcher;
        if (r22 == null) goto L9;
        int r5 = BaseQuery.access$innerBuild(r22, r21);
    L10:
        ClassMatcher r23 = this.classMatcher;
        if (r23 == null) goto L13;
        int r6 = BaseQuery.access$innerBuild(r23, r21);
    L14:
        ClassMatcher r24 = this.returnTypeMatcher;
        if (r24 == null) goto L17;
        int r7 = BaseQuery.access$innerBuild(r24, r21);
    L18:
        ParametersMatcher r25 = this.paramsMatcher;
        if (r25 == null) goto L21;
        int r8 = BaseQuery.access$innerBuild(r25, r21);
    L22:
        AnnotationsMatcher r26 = this.annotationsMatcher;
        if (r26 == null) goto L25;
        int r9 = BaseQuery.access$innerBuild(r26, r21);
    L26:
        OpCodesMatcher r27 = this.opCodesMatcher;
        if (r27 == null) goto L29;
        int r10 = BaseQuery.access$innerBuild(r27, r21);
    L30:
        List<StringMatcher> r28 = this.usingStringsMatcher;
        if (r28 == null) goto L37;
        ArrayList r12 = new ArrayList(AbstractC0183n.m559k0(r28, 10));
        Iterator<T> r29 = r28.iterator();
    L34:
        if (r29.hasNext() == false) goto L36;
        r12.add(Integer.valueOf(BaseQuery.access$innerBuild((StringMatcher) r29.next(), r21)));
        goto L34
    L36:
        int r122 = r21.m1928k(AbstractC0181l.m552x0(r12));
    L38:
        List<UsingFieldMatcher> r210 = this.usingFieldsMatcher;
        if (r210 == null) goto L45;
        ArrayList r13 = new ArrayList(AbstractC0183n.m559k0(r210, 10));
        Iterator<T> r211 = r210.iterator();
    L42:
        if (r211.hasNext() == false) goto L44;
        r13.add(Integer.valueOf(BaseQuery.access$innerBuild((UsingFieldMatcher) r211.next(), r21)));
        goto L42
    L44:
        int r132 = r21.m1928k(AbstractC0181l.m552x0(r13));
    L46:
        List<NumberEncodeValueMatcher> r212 = this.usingNumbersMatcher;
        if (r212 == null) goto L53;
        ArrayList r14 = new ArrayList(AbstractC0183n.m559k0(r212, 10));
        Iterator<T> r213 = r212.iterator();
    L50:
        if (r213.hasNext() == false) goto L52;
        NumberEncodeValueType r3 = ((NumberEncodeValueMatcher) r213.next()).getType();
        AbstractC0307g.m700b(r3);
        r14.add(new C0144j(r3.m2672getValuew2LRezQ()));
        goto L50
    L52:
        byte[] r214 = AbstractC0040p.m99c0(r14);
        int r142 = org.luckypray.dexkit.schema.MethodMatcher.Companion.m2726createUsingNumbersTypeVectorVUfvBY(r21, r214);
    L54:
        List<NumberEncodeValueMatcher> r215 = this.usingNumbersMatcher;
        if (r215 == null) goto L61;
        ArrayList r32 = new ArrayList(AbstractC0183n.m559k0(r215, 10));
        Iterator r216 = r215.iterator();
    L58:
        if (r216.hasNext() == false) goto L60;
        Object r11 = ((NumberEncodeValueMatcher) r216.next()).getValue();
        Iterator r17 = r216;
        AbstractC0307g.m701c(r11, "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseQuery");
        r32.add(Integer.valueOf(BaseQuery.access$innerBuild((BaseQuery) r11, r21)));
        r216 = r17;
        goto L58
    L60:
        int[] r217 = AbstractC0181l.m552x0(r32);
        int r172 = org.luckypray.dexkit.schema.MethodMatcher.Companion.createUsingNumbersVector(r21, r217);
    L62:
        MethodsMatcher r218 = this.invokeMethodsMatcher;
        if (r218 == null) goto L65;
        int r18 = BaseQuery.access$innerBuild(r218, r21);
    L66:
        MethodsMatcher r219 = this.callerMethodsMatcher;
        if (r219 == null) goto L69;
        int r19 = BaseQuery.access$innerBuild(r219, r21);
    L70:
        String r220 = this.protoShortyMatcher;
        if (r220 == null) goto L73;
        int r16 = r21.m1927j(r220);
    L74:
        int r15 = r1.createMethodMatcher(r21, r4, r5, r6, r7, r8, r9, r10, r122, r132, r142, r172, r18, r19, r16);
        r21.m1931n(r15);
        return r15;
    L73:
        r16 = 0;
        goto L74
    L69:
        r19 = 0;
        goto L70
    L65:
        r18 = 0;
        goto L66
    L61:
        r172 = 0;
        goto L62
    L53:
        r142 = 0;
        goto L54
    L45:
        r132 = 0;
        goto L46
    L37:
        r122 = 0;
        goto L38
    L29:
        r10 = 0;
        goto L30
    L25:
        r9 = 0;
        goto L26
    L21:
        r8 = 0;
        goto L22
    L17:
        r7 = 0;
        goto L18
    L13:
        r6 = 0;
        goto L14
    L9:
        r5 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
    }

    public final MethodMatcher invokeMethods(MethodsMatcher r2) {
        AbstractC0307g.m703e(r2, "invokeMethods");
        this.invokeMethodsMatcher = r2;
        return this;
    }

    public final MethodMatcher modifiers(int r3) {
        return modifiers$default(this, r3, null, 2, null);
    }

    public final MethodMatcher name(String r8) {
        AbstractC0307g.m703e(r8, "name");
        return name$default(this, r8, null, false, 6, null);
    }

    public final MethodMatcher opCodes(Collection<Integer> r8) {
        AbstractC0307g.m703e(r8, "opCodes");
        return opCodes$default(this, r8, null, null, 6, null);
    }

    public final MethodMatcher opNames(Collection<String> r8) {
        AbstractC0307g.m703e(r8, "opNames");
        return opNames$default(this, r8, null, null, 6, null);
    }

    public final MethodMatcher paramCount(int r2) {
        if (this.paramsMatcher != null) goto L5;
        this.paramsMatcher = new ParametersMatcher();
    L5:
        ParametersMatcher r02 = this.paramsMatcher;
        AbstractC0307g.m700b(r02);
        r02.count(r2);
        return this;
    }

    public final MethodMatcher paramTypes(Collection<String> r9) {
        AbstractC0307g.m703e(r9, "paramTypes");
        ParametersMatcher r02 = new ParametersMatcher();
        r02.params(C0190u.f401a);
        Iterator<T> r92 = r9.iterator();
    L4:
        if (r92.hasNext() == false) goto L10;
        String r3 = (String) r92.next();
        if (r3 == null) goto L8;
        ParameterMatcher r1 = ParameterMatcher.type$default(new ParameterMatcher(), r3, null, false, 6, null);
    L9:
        r02.add(r1);
        goto L4
    L8:
        r1 = null;
        goto L9
    L10:
        this.paramsMatcher = r02;
        return this;
    }

    public final MethodMatcher params(ParametersMatcher r2) {
        AbstractC0307g.m703e(r2, "params");
        this.paramsMatcher = r2;
        return this;
    }

    public final MethodMatcher protoShorty(String r2) {
        AbstractC0307g.m703e(r2, "shorty");
        this.protoShortyMatcher = r2;
        return this;
    }

    public final MethodMatcher returnType(String r8) {
        AbstractC0307g.m703e(r8, "typeName");
        return returnType$default(this, r8, null, false, 6, null);
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

    public final void setOpCodes(Collection<Integer> r8) {
        AbstractC0307g.m703e(r8, "value");
        opCodes$default(this, r8, null, null, 6, null);
    }

    public final void setOpNames(Collection<String> r8) {
        AbstractC0307g.m703e(r8, "value");
        opNames$default(this, r8, null, null, 6, null);
    }

    public final /* synthetic */ void setParamCount(int r1) {
        paramCount(r1);
    }

    public final /* synthetic */ void setParamTypes(Collection r2) {
        AbstractC0307g.m703e(r2, "value");
        paramTypes(r2);
    }

    public final /* synthetic */ void setProtoShorty(String r2) {
        AbstractC0307g.m703e(r2, "value");
        protoShorty(r2);
    }

    public final /* synthetic */ void setReturnType(String r8) {
        AbstractC0307g.m703e(r8, "value");
        returnType$default(this, r8, null, false, 6, null);
    }

    public final void setUsingNumbers(Collection<? extends Number> r2) {
        AbstractC0307g.m703e(r2, "value");
        usingNumbers(r2);
    }

    public final /* synthetic */ void setUsingStrings(Collection r8) {
        AbstractC0307g.m703e(r8, "value");
        usingStrings$default(this, r8, null, false, 6, null);
    }

    public final MethodMatcher usingEqStrings(Collection<String> r6) {
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

    public final MethodMatcher usingFields(Collection<UsingFieldMatcher> r2) {
        AbstractC0307g.m703e(r2, "usingFields");
        this.usingFieldsMatcher = AbstractC0181l.m541A0(r2);
        return this;
    }

    public final MethodMatcher usingNumbers(NumberEncodeValueMatcherList r2) {
        AbstractC0307g.m703e(r2, "usingNumbers");
        this.usingNumbersMatcher = r2;
        return this;
    }

    public final MethodMatcher usingStrings(Collection<String> r8) {
        AbstractC0307g.m703e(r8, "usingStrings");
        return usingStrings$default(this, r8, null, false, 6, null);
    }

    public MethodMatcher(Method r2) {
        AbstractC0307g.m703e(r2, "method");
        descriptor(DexSignUtil.getDescriptor(r2));
    }

    public static /* synthetic */ MethodMatcher addUsingField$default(MethodMatcher r02, String r1, UsingType r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = UsingType.Any;
    L6:
        return r02.addUsingField(r1, r2);
    }

    private final MethodMatcher annotations(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationsMatcher r02 = new AnnotationsMatcher();
        r2.invoke(r02);
        annotations(r02);
        return this;
    }

    private final MethodMatcher callMethods(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodsMatcher r02 = new MethodsMatcher();
        r2.invoke(r02);
        callMethods(r02);
        return this;
    }

    private final MethodMatcher callerMethods(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodsMatcher r02 = new MethodsMatcher();
        r2.invoke(r02);
        callerMethods(r02);
        return this;
    }

    public static final MethodMatcher create(String r1) {
        return Companion.create(r1);
    }

    private final MethodMatcher invokeMethods(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodsMatcher r02 = new MethodsMatcher();
        r2.invoke(r02);
        invokeMethods(r02);
        return this;
    }

    private final MethodMatcher params(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ParametersMatcher r02 = new ParametersMatcher();
        r2.invoke(r02);
        params(r02);
        return this;
    }

    private final MethodMatcher usingFields(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        UsingFieldMatcherList r02 = new UsingFieldMatcherList();
        r2.invoke(r02);
        usingFields(r02);
        return this;
    }

    private final MethodMatcher usingNumbers(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        NumberEncodeValueMatcherList r02 = new NumberEncodeValueMatcherList();
        r2.invoke(r02);
        usingNumbers(r02);
        return this;
    }

    public final MethodMatcher addParamType(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r9, "matchType");
        return addParamType$default(this, r8, r9, false, 4, null);
    }

    public final MethodMatcher addUsingField(FieldMatcher r3) {
        AbstractC0307g.m703e(r3, "usingField");
        return addUsingField$default(this, r3, null, 2, null);
    }

    public final MethodMatcher addUsingString(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "usingString");
        AbstractC0307g.m703e(r9, "matchType");
        return addUsingString$default(this, r8, r9, false, 4, null);
    }

    public final MethodMatcher declaredClass(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "className");
        AbstractC0307g.m703e(r9, "matchType");
        return declaredClass$default(this, r8, r9, false, 4, null);
    }

    public final MethodMatcher modifiers(AccessFlagsMatcher r2) {
        AbstractC0307g.m703e(r2, "modifiers");
        this.modifiersMatcher = r2;
        return this;
    }

    public final MethodMatcher name(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "name");
        AbstractC0307g.m703e(r9, "matchType");
        return name$default(this, r8, r9, false, 4, null);
    }

    public final MethodMatcher opCodes(Collection<Integer> r8, OpCodeMatchType r9) {
        AbstractC0307g.m703e(r8, "opCodes");
        AbstractC0307g.m703e(r9, "matchType");
        return opCodes$default(this, r8, r9, null, 4, null);
    }

    public final MethodMatcher opNames(Collection<String> r8, OpCodeMatchType r9) {
        AbstractC0307g.m703e(r8, "opNames");
        AbstractC0307g.m703e(r9, "matchType");
        return opNames$default(this, r8, r9, null, 4, null);
    }

    public final MethodMatcher returnType(String r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "typeName");
        AbstractC0307g.m703e(r9, "matchType");
        return returnType$default(this, r8, r9, false, 4, null);
    }

    public final MethodMatcher usingStrings(Collection<String> r8, StringMatchType r9) {
        AbstractC0307g.m703e(r8, "usingStrings");
        AbstractC0307g.m703e(r9, "matchType");
        return usingStrings$default(this, r8, r9, false, 4, null);
    }

    private final MethodMatcher addAnnotation(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        AnnotationMatcher r02 = new AnnotationMatcher();
        r2.invoke(r02);
        addAnnotation(r02);
        return this;
    }

    public static final MethodMatcher create(Constructor<?> r1) {
        return Companion.create(r1);
    }

    public final MethodMatcher addCall(String r3) {
        AbstractC0307g.m703e(r3, "methodDescriptor");
        MethodsMatcher r02 = this.callerMethodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.callerMethodsMatcher = r02;
        r02.add(new MethodMatcher(r3));
        return this;
    }

    public final MethodMatcher addCaller(String r3) {
        AbstractC0307g.m703e(r3, "methodDescriptor");
        MethodsMatcher r02 = this.callerMethodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.callerMethodsMatcher = r02;
        r02.add(new MethodMatcher(r3));
        return this;
    }

    public final MethodMatcher addInvoke(String r3) {
        AbstractC0307g.m703e(r3, "methodDescriptor");
        MethodsMatcher r02 = this.invokeMethodsMatcher;
        if (r02 != null) goto L5;
        r02 = new MethodsMatcher();
    L5:
        this.invokeMethodsMatcher = r02;
        r02.add(new MethodMatcher(r3));
        return this;
    }

    public final MethodMatcher addParamType(String r3, StringMatchType r4, boolean r5) {
        AbstractC0307g.m703e(r4, "matchType");
        ParametersMatcher r02 = this.paramsMatcher;
        if (r02 != null) goto L5;
        r02 = new ParametersMatcher();
    L5:
        this.paramsMatcher = r02;
        if (r3 == null) goto L8;
        ParameterMatcher r32 = new ParameterMatcher().type(r3, r4, r5);
    L9:
        r02.add(r32);
        return this;
    L8:
        r32 = null;
        goto L9
    }

    public final MethodMatcher addUsingField(UsingFieldMatcher r2) {
        AbstractC0307g.m703e(r2, "usingField");
        List<UsingFieldMatcher> r02 = this.usingFieldsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingFieldsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final MethodMatcher addUsingString(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "usingString");
        List<StringMatcher> r02 = this.usingStringsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingStringsMatcher = r02;
        r02.add(r2);
        return this;
    }

    public final MethodMatcher annotationCount(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final MethodMatcher declaredClass(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "declaredClass");
        this.classMatcher = r2;
        return this;
    }

    public final MethodMatcher modifiers(int r2, MatchType r3) {
        AbstractC0307g.m703e(r3, "matchType");
        this.modifiersMatcher = new AccessFlagsMatcher(r2, r3);
        return this;
    }

    public final MethodMatcher name(StringMatcher r2) {
        AbstractC0307g.m703e(r2, "name");
        this.nameMatcher = r2;
        return this;
    }

    public final MethodMatcher opCodes(OpCodesMatcher r2) {
        AbstractC0307g.m703e(r2, "opCodes");
        this.opCodesMatcher = r2;
        return this;
    }

    public final MethodMatcher opNames(Collection<String> r2, OpCodeMatchType r3, IntRange r4) {
        AbstractC0307g.m703e(r2, "opNames");
        AbstractC0307g.m703e(r3, "matchType");
        this.opCodesMatcher = OpCodesMatcher.Companion.createForOpNames(r2, r3, r4);
        return this;
    }

    public final MethodMatcher paramCount(IntRange r2) {
        AbstractC0307g.m703e(r2, "range");
        if (this.paramsMatcher != null) goto L5;
        this.paramsMatcher = new ParametersMatcher();
    L5:
        ParametersMatcher r02 = this.paramsMatcher;
        AbstractC0307g.m700b(r02);
        r02.count(r2);
        return this;
    }

    public final MethodMatcher returnType(ClassMatcher r2) {
        AbstractC0307g.m703e(r2, "type");
        this.returnTypeMatcher = r2;
        return this;
    }

    public final MethodMatcher usingNumbers(Collection<? extends Number> r4) {
        AbstractC0307g.m703e(r4, "usingNumbers");
        ArrayList r02 = new ArrayList(AbstractC0183n.m559k0(r4, 10));
        Iterator<T> r42 = r4.iterator();
    L4:
        if (r42.hasNext() == false) goto L6;
        Number r1 = (Number) r42.next();
        r02.add(new NumberEncodeValueMatcher().value(r1));
        goto L4
    L6:
        this.usingNumbersMatcher = AbstractC0181l.m541A0(r02);
        return this;
    }

    public final MethodMatcher usingStrings(StringMatcherList r2) {
        AbstractC0307g.m703e(r2, "usingStrings");
        this.usingStringsMatcher = r2;
        return this;
    }

    public MethodMatcher(Constructor<?> r2) {
        AbstractC0307g.m703e(r2, "constructor");
        descriptor(DexSignUtil.getDescriptor(r2));
    }

    public static final MethodMatcher create(Method r1) {
        return Companion.create(r1);
    }

    private final MethodMatcher usingStrings(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        StringMatcherList r02 = new StringMatcherList();
        r2.invoke(r02);
        usingStrings(r02);
        return this;
    }

    public final MethodMatcher declaredClass(Class<?> r8) {
        AbstractC0307g.m703e(r8, "clazz");
        this.classMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(r8), null, false, 6, null);
        return this;
    }

    public final MethodMatcher name(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "name");
        AbstractC0307g.m703e(r3, "matchType");
        this.nameMatcher = new StringMatcher(r2, r3, r4);
        return this;
    }

    public final MethodMatcher opCodes(Collection<Integer> r2, OpCodeMatchType r3, IntRange r4) {
        AbstractC0307g.m703e(r2, "opCodes");
        AbstractC0307g.m703e(r3, "matchType");
        this.opCodesMatcher = new OpCodesMatcher(r2, r3, r4);
        return this;
    }

    public final MethodMatcher returnType(Class<?> r8) {
        AbstractC0307g.m703e(r8, "clazz");
        this.returnTypeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(r8), null, false, 6, null);
        return this;
    }

    private final MethodMatcher addCall(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        addCall(r02);
        return this;
    }

    private final MethodMatcher addCaller(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        addCaller(r02);
        return this;
    }

    private final MethodMatcher addInvoke(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        MethodMatcher r02 = new MethodMatcher();
        r2.invoke(r02);
        addInvoke(r02);
        return this;
    }

    public final MethodMatcher addParamType(Class<?> r3) {
        ParametersMatcher r02 = this.paramsMatcher;
        if (r02 != null) goto L5;
        r02 = new ParametersMatcher();
    L5:
        this.paramsMatcher = r02;
        if (r3 == null) goto L8;
        ParameterMatcher r32 = new ParameterMatcher().type(r3);
    L9:
        r02.add(r32);
        return this;
    L8:
        r32 = null;
        goto L9
    }

    public final MethodMatcher addUsingField(FieldMatcher r3, UsingType r4) {
        AbstractC0307g.m703e(r3, "usingField");
        AbstractC0307g.m703e(r4, "usingType");
        List<UsingFieldMatcher> r02 = this.usingFieldsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingFieldsMatcher = r02;
        UsingFieldMatcher r1 = new UsingFieldMatcher();
        r1.field(r3);
        r1.usingType(r4);
        r02.add(r1);
        return this;
    }

    public final MethodMatcher addUsingString(String r3, StringMatchType r4, boolean r5) {
        AbstractC0307g.m703e(r3, "usingString");
        AbstractC0307g.m703e(r4, "matchType");
        List<StringMatcher> r02 = this.usingStringsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingStringsMatcher = r02;
        r02.add(new StringMatcher(r3, r4, r5));
        return this;
    }

    public final MethodMatcher annotationCount(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2);
        return this;
    }

    public final MethodMatcher declaredClass(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "className");
        AbstractC0307g.m703e(r3, "matchType");
        this.classMatcher = new ClassMatcher().className(r2, r3, r4);
        return this;
    }

    public final MethodMatcher paramCount(C0340c r2) {
        AbstractC0307g.m703e(r2, "range");
        if (this.paramsMatcher != null) goto L5;
        this.paramsMatcher = new ParametersMatcher();
    L5:
        ParametersMatcher r02 = this.paramsMatcher;
        AbstractC0307g.m700b(r02);
        r02.count(r2);
        return this;
    }

    public final MethodMatcher returnType(String r2, StringMatchType r3, boolean r4) {
        AbstractC0307g.m703e(r2, "typeName");
        AbstractC0307g.m703e(r3, "matchType");
        this.returnTypeMatcher = new ClassMatcher().className(r2, r3, r4);
        return this;
    }

    public final MethodMatcher usingStrings(Collection<String> r4, StringMatchType r5, boolean r6) {
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

    public MethodMatcher(String r2) {
        AbstractC0307g.m703e(r2, "descriptor");
        descriptor(r2);
    }

    private final MethodMatcher declaredClass(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        declaredClass(r02);
        return this;
    }

    private final MethodMatcher returnType(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        returnType(r02);
        return this;
    }

    public final MethodMatcher paramTypes() {
        ParametersMatcher r02 = new ParametersMatcher();
        r02.params(C0190u.f401a);
        this.paramsMatcher = r02;
        return this;
    }

    public final MethodMatcher addParamType(ClassMatcher r3) {
        ParametersMatcher r02 = this.paramsMatcher;
        if (r02 != null) goto L5;
        r02 = new ParametersMatcher();
    L5:
        this.paramsMatcher = r02;
        if (r3 == null) goto L8;
        ParameterMatcher r32 = new ParameterMatcher().type(r3);
    L9:
        r02.add(r32);
        return this;
    L8:
        r32 = null;
        goto L9
    }

    public final MethodMatcher annotationCount(int r2, int r3) {
        AnnotationsMatcher r02 = this.annotationsMatcher;
        if (r02 != null) goto L5;
        r02 = new AnnotationsMatcher();
    L5:
        this.annotationsMatcher = r02;
        r02.count(r2, r3);
        return this;
    }

    public final MethodMatcher paramCount(int r2, int r3) {
        if (this.paramsMatcher != null) goto L5;
        this.paramsMatcher = new ParametersMatcher();
    L5:
        ParametersMatcher r02 = this.paramsMatcher;
        AbstractC0307g.m700b(r02);
        r02.count(r2, r3);
        return this;
    }

    public final MethodMatcher usingEqStrings(String... r8) {
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

    private final MethodMatcher addParamType(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        ClassMatcher r02 = new ClassMatcher();
        r2.invoke(r02);
        addParamType(r02);
        return this;
    }

    public final MethodMatcher paramTypes(String... r10) {
        AbstractC0307g.m703e(r10, "paramTypes");
        ParametersMatcher r02 = new ParametersMatcher();
        r02.params(C0190u.f401a);
        int r1 = r10.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        String r4 = r10[r2];
        if (r4 == null) goto L7;
        ParameterMatcher r3 = ParameterMatcher.type$default(new ParameterMatcher(), r4, null, false, 6, null);
    L8:
        r02.add(r3);
        r2 = r2 + 1;
        goto L3
    L7:
        r3 = null;
        goto L8
    L9:
        this.paramsMatcher = r02;
        return this;
    }

    public final MethodMatcher usingNumbers(Number... r6) {
        AbstractC0307g.m703e(r6, "usingNumbers");
        ArrayList r02 = new ArrayList(r6.length);
        int r1 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Number r3 = r6[r2];
        r02.add(new NumberEncodeValueMatcher().value(r3));
        r2 = r2 + 1;
        goto L3
    L5:
        this.usingNumbersMatcher = AbstractC0181l.m541A0(r02);
        return this;
    }

    public final MethodMatcher addUsingField(String r4, UsingType r5) {
        AbstractC0307g.m703e(r4, "fieldDescriptor");
        AbstractC0307g.m703e(r5, "usingType");
        List<UsingFieldMatcher> r02 = this.usingFieldsMatcher;
        if (r02 != null) goto L5;
        r02 = new ArrayList();
    L5:
        this.usingFieldsMatcher = r02;
        UsingFieldMatcher r1 = new UsingFieldMatcher();
        r1.field(new FieldMatcher(r4));
        r1.usingType(r5);
        r02.add(r1);
        return this;
    }

    public final MethodMatcher usingStrings(String... r11) {
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

    public final MethodMatcher paramTypes(Class<?>... r6) {
        AbstractC0307g.m703e(r6, "paramTypes");
        ParametersMatcher r02 = new ParametersMatcher();
        r02.params(C0190u.f401a);
        int r1 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        Class<?> r3 = r6[r2];
        if (r3 == null) goto L7;
        ParameterMatcher r32 = new ParameterMatcher().type(r3);
    L8:
        r02.add(r32);
        r2 = r2 + 1;
        goto L3
    L7:
        r32 = null;
        goto L8
    L9:
        this.paramsMatcher = r02;
        return this;
    }

    private final MethodMatcher addUsingField(InterfaceC0286l r2) {
        AbstractC0307g.m703e(r2, "init");
        UsingFieldMatcher r02 = new UsingFieldMatcher();
        r2.invoke(r02);
        addUsingField(r02);
        return this;
    }
}
