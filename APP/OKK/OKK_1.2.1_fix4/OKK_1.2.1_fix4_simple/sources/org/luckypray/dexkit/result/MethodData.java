package org.luckypray.dexkit.result;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.MethodMeta;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.util.OpCodeUtil;
import org.luckypray.dexkit.wrap.DexMethod;
import p001A0.AbstractC0040p;
import p007D0.C0142h;
import p007D0.InterfaceC0136b;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class MethodData extends BaseData {

    /* JADX INFO: renamed from: -Companion */
    public static final Companion f4421Companion = null;
    public static final int ACC_DECLARED_SYNCHRONIZED = 131072;
    private final InterfaceC0136b annotations$delegate;
    private final InterfaceC0136b callers$delegate;
    private final int classId;
    private final InterfaceC0136b declaredClass$delegate;
    private final String descriptor;
    private final InterfaceC0136b dexMethod$delegate;
    private final InterfaceC0136b invokes$delegate;
    private final int modifiers;
    private final InterfaceC0136b opCodes$delegate;
    private final InterfaceC0136b paramAnnotations$delegate;
    private final InterfaceC0136b paramNames$delegate;
    private final List<Integer> paramTypeIds;
    private final InterfaceC0136b paramTypes$delegate;
    private final InterfaceC0136b returnType$delegate;
    private final int returnTypeId;
    private final InterfaceC0136b usingFields$delegate;
    private final InterfaceC0136b usingStrings$delegate;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.MethodData$-Companion */
    public static final class Companion {
        private Companion() {
        }

        public final MethodData from(DexKitBridge r12, MethodMeta r13) {
            AbstractC0307g.m703e(r12, "bridge");
            AbstractC0307g.m703e(r13, "methodMeta");
            int r02 = r13.m2727getAccessFlagspVg5ArA();
            if ((r02 & MethodData.ACC_DECLARED_SYNCHRONIZED) <= 0) goto L5;
            r02 = (r02 ^ MethodData.ACC_DECLARED_SYNCHRONIZED) | 32;
        L5:
            int r6 = r02;
            int r3 = r13.m2730getIdpVg5ArA();
            int r4 = r13.m2729getDexIdpVg5ArA();
            int r5 = r13.m2728getClassIdpVg5ArA();
            String r03 = r13.getDexDescriptor();
            if (r03 != null) goto L8;
            r03 = "";
        L8:
            String r7 = r03;
            int r8 = r13.m2731getReturnTypepVg5ArA();
            ArrayList r9 = new ArrayList();
            int r04 = r13.getParameterTypesLength();
            int r1 = 0;
        L9:
            if (r1 >= r04) goto L12;
            r9.add(Integer.valueOf(r13.parameterTypes(r1)));
            r1 = r1 + 1;
            goto L9
        L12:
            return new MethodData(r12, r3, r4, r5, r6, r7, r8, r9, null);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        f4421Companion = new Companion(null);
    }

    public /* synthetic */ MethodData(DexKitBridge r1, int r2, int r3, int r4, int r5, String r6, int r7, List r8, AbstractC0304d r9) {
        this(r1, r2, r3, r4, r5, r6, r7, r8);
    }

    public static final /* synthetic */ int access$getClassId$p(MethodData r02) {
        return r02.classId;
    }

    public static final /* synthetic */ long access$getEncodeId(MethodData r02, int r1, int r2) {
        return r02.getEncodeId(r1, r2);
    }

    public static final /* synthetic */ List access$getParamTypeIds$p(MethodData r02) {
        return r02.paramTypeIds;
    }

    public static final /* synthetic */ int access$getReturnTypeId$p(MethodData r02) {
        return r02.returnTypeId;
    }

    private final DexMethod getDexMethod() {
        return (DexMethod) ((C0142h) this.dexMethod$delegate).m466a();
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof MethodData) == true) goto L8;
    L10:
        return false;
    L8:
        if (AbstractC0307g.m699a(((MethodData) r3).descriptor, this.descriptor) == false) goto L10;
        return true;
    }

    public final List<AnnotationData> getAnnotations() {
        return (List) ((C0142h) this.annotations$delegate).m466a();
    }

    public final MethodDataList getCallers() {
        return (MethodDataList) ((C0142h) this.callers$delegate).m466a();
    }

    public final Class<?> getClassInstance(ClassLoader r3) throws ClassNotFoundException {
        AbstractC0307g.m703e(r3, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(r3, getClassName());
    }

    public final String getClassName() {
        return getDexMethod().getClassName();
    }

    public final Constructor<?> getConstructorInstance(ClassLoader r2) throws NoSuchMethodException {
        AbstractC0307g.m703e(r2, "classLoader");
        return getDexMethod().getConstructorInstance(r2);
    }

    public final ClassData getDeclaredClass() {
        return (ClassData) ((C0142h) this.declaredClass$delegate).m466a();
    }

    public final String getDeclaredClassName() {
        return getClassName();
    }

    public final String getDescriptor() {
        return this.descriptor;
    }

    public final MethodDataList getInvokes() {
        return (MethodDataList) ((C0142h) this.invokes$delegate).m466a();
    }

    public final Method getMethodInstance(ClassLoader r2) throws NoSuchMethodException {
        AbstractC0307g.m703e(r2, "classLoader");
        return getDexMethod().getMethodInstance(r2);
    }

    public final String getMethodName() {
        return getDexMethod().getName();
    }

    public final String getMethodSign() {
        return getDexMethod().getMethodSign();
    }

    public final int getModifiers() {
        return this.modifiers;
    }

    public final String getName() {
        return getDexMethod().getName();
    }

    public final List<Integer> getOpCodes() {
        return (List) ((C0142h) this.opCodes$delegate).m466a();
    }

    public final List<String> getOpNames() {
        List<Integer> r02 = getOpCodes();
        ArrayList r1 = new ArrayList(AbstractC0183n.m559k0(r02, 10));
        Iterator<T> r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        r1.add(OpCodeUtil.getOpFormat(((Number) r03.next()).intValue()));
        goto L4
    L6:
        return r1;
    }

    public final List<List<AnnotationData>> getParamAnnotations() {
        return (List) ((C0142h) this.paramAnnotations$delegate).m466a();
    }

    public final int getParamCount() {
        return this.paramTypeIds.size();
    }

    public final List<String> getParamNames() {
        return (List) ((C0142h) this.paramNames$delegate).m466a();
    }

    public final List<String> getParamTypeNames() {
        return getDexMethod().getParamTypeNames();
    }

    public final ClassDataList getParamTypes() {
        return (ClassDataList) ((C0142h) this.paramTypes$delegate).m466a();
    }

    public final ClassData getReturnType() {
        return (ClassData) ((C0142h) this.returnType$delegate).m466a();
    }

    public final Class<?> getReturnTypeInstance(ClassLoader r3) throws ClassNotFoundException {
        AbstractC0307g.m703e(r3, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(r3, getReturnTypeName());
    }

    public final String getReturnTypeName() {
        return getDexMethod().getReturnTypeName();
    }

    public final List<UsingFieldData> getUsingFields() {
        return (List) ((C0142h) this.usingFields$delegate).m466a();
    }

    public final List<String> getUsingStrings() {
        return (List) ((C0142h) this.usingStrings$delegate).m466a();
    }

    public int hashCode() {
        return this.descriptor.hashCode();
    }

    public final boolean isConstructor() {
        return getDexMethod().isConstructor();
    }

    public final boolean isMethod() {
        return getDexMethod().isMethod();
    }

    public final boolean isStaticInitializer() {
        return getDexMethod().isStaticInitializer();
    }

    public final DexMethod toDexMethod() {
        return getDexMethod();
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        int r1 = this.modifiers;
        if (r1 == 0) goto L5;
        r02.append(Modifier.toString(r1) + " ");
    L5:
        r02.append(getReturnTypeName());
        r02.append(" ");
        r02.append(getClassName());
        r02.append(".");
        r02.append(getName());
        r02.append("(");
        r02.append(AbstractC0181l.m546r0(getParamTypeNames(), ", ", null, null, null, 62));
        r02.append(")");
        String r03 = r02.toString();
        AbstractC0307g.m702d(r03, "StringBuilder().apply(builderAction).toString()");
        return r03;
    }

    private MethodData(DexKitBridge r1, int r2, int r3, int r4, int r5, String r6, int r7, List<Integer> r8) {
        super(r1, r2, r3);
        this.classId = r4;
        this.modifiers = r5;
        this.descriptor = r6;
        this.returnTypeId = r7;
        this.paramTypeIds = r8;
        this.dexMethod$delegate = AbstractC0040p.m81E(new MethodData$dexMethod$2(this));
        this.declaredClass$delegate = AbstractC0040p.m81E(new MethodData$declaredClass$2(r1, this, r3));
        this.returnType$delegate = AbstractC0040p.m81E(new MethodData$returnType$2(r1, this, r3));
        this.paramTypes$delegate = AbstractC0040p.m81E(new MethodData$paramTypes$2(r1, this, r3));
        this.paramNames$delegate = AbstractC0040p.m81E(new MethodData$paramNames$2(r1, this, r3, r2));
        this.annotations$delegate = AbstractC0040p.m81E(new MethodData$annotations$2(r1, this, r3, r2));
        this.paramAnnotations$delegate = AbstractC0040p.m81E(new MethodData$paramAnnotations$2(r1, this, r3, r2));
        this.opCodes$delegate = AbstractC0040p.m81E(new MethodData$opCodes$2(r1, this, r3, r2));
        this.callers$delegate = AbstractC0040p.m81E(new MethodData$callers$2(r1, this, r3, r2));
        this.invokes$delegate = AbstractC0040p.m81E(new MethodData$invokes$2(r1, this, r3, r2));
        this.usingStrings$delegate = AbstractC0040p.m81E(new MethodData$usingStrings$2(r1, this, r3, r2));
        this.usingFields$delegate = AbstractC0040p.m81E(new MethodData$usingFields$2(r1, this, r3, r2));
    }
}
