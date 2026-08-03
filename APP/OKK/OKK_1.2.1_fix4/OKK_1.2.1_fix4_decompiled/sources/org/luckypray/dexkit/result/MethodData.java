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

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f4421Companion = new Companion(null);
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

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.MethodData$-Companion, reason: invalid class name */
    public static final class Companion {
        private Companion() {
        }

        public final MethodData from(DexKitBridge dexKitBridge, MethodMeta methodMeta) {
            AbstractC0307g.m703e(dexKitBridge, "bridge");
            AbstractC0307g.m703e(methodMeta, "methodMeta");
            int iM2727getAccessFlagspVg5ArA = methodMeta.m2727getAccessFlagspVg5ArA();
            if ((iM2727getAccessFlagspVg5ArA & MethodData.ACC_DECLARED_SYNCHRONIZED) > 0) {
                iM2727getAccessFlagspVg5ArA = (iM2727getAccessFlagspVg5ArA ^ MethodData.ACC_DECLARED_SYNCHRONIZED) | 32;
            }
            int i2 = iM2727getAccessFlagspVg5ArA;
            int iM2730getIdpVg5ArA = methodMeta.m2730getIdpVg5ArA();
            int iM2729getDexIdpVg5ArA = methodMeta.m2729getDexIdpVg5ArA();
            int iM2728getClassIdpVg5ArA = methodMeta.m2728getClassIdpVg5ArA();
            String dexDescriptor = methodMeta.getDexDescriptor();
            if (dexDescriptor == null) {
                dexDescriptor = "";
            }
            String str = dexDescriptor;
            int iM2731getReturnTypepVg5ArA = methodMeta.m2731getReturnTypepVg5ArA();
            ArrayList arrayList = new ArrayList();
            int parameterTypesLength = methodMeta.getParameterTypesLength();
            for (int i3 = 0; i3 < parameterTypesLength; i3++) {
                arrayList.add(Integer.valueOf(methodMeta.parameterTypes(i3)));
            }
            return new MethodData(dexKitBridge, iM2730getIdpVg5ArA, iM2729getDexIdpVg5ArA, iM2728getClassIdpVg5ArA, i2, str, iM2731getReturnTypepVg5ArA, arrayList, null);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public /* synthetic */ MethodData(DexKitBridge dexKitBridge, int i2, int i3, int i4, int i5, String str, int i6, List list, AbstractC0304d abstractC0304d) {
        this(dexKitBridge, i2, i3, i4, i5, str, i6, list);
    }

    private final DexMethod getDexMethod() {
        return (DexMethod) ((C0142h) this.dexMethod$delegate).m466a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MethodData) && AbstractC0307g.m699a(((MethodData) obj).descriptor, this.descriptor);
    }

    public final List<AnnotationData> getAnnotations() {
        return (List) ((C0142h) this.annotations$delegate).m466a();
    }

    public final MethodDataList getCallers() {
        return (MethodDataList) ((C0142h) this.callers$delegate).m466a();
    }

    public final Class<?> getClassInstance(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getClassName());
    }

    public final String getClassName() {
        return getDexMethod().getClassName();
    }

    public final Constructor<?> getConstructorInstance(ClassLoader classLoader) throws NoSuchMethodException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return getDexMethod().getConstructorInstance(classLoader);
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

    public final Method getMethodInstance(ClassLoader classLoader) throws NoSuchMethodException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return getDexMethod().getMethodInstance(classLoader);
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
        List<Integer> opCodes = getOpCodes();
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(opCodes, 10));
        Iterator<T> it = opCodes.iterator();
        while (it.hasNext()) {
            arrayList.add(OpCodeUtil.getOpFormat(((Number) it.next()).intValue()));
        }
        return arrayList;
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

    public final Class<?> getReturnTypeInstance(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getReturnTypeName());
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
        StringBuilder sb = new StringBuilder();
        int i2 = this.modifiers;
        if (i2 != 0) {
            sb.append(Modifier.toString(i2) + " ");
        }
        sb.append(getReturnTypeName());
        sb.append(" ");
        sb.append(getClassName());
        sb.append(".");
        sb.append(getName());
        sb.append("(");
        sb.append(AbstractC0181l.m546r0(getParamTypeNames(), ", ", null, null, null, 62));
        sb.append(")");
        String string = sb.toString();
        AbstractC0307g.m702d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private MethodData(DexKitBridge dexKitBridge, int i2, int i3, int i4, int i5, String str, int i6, List<Integer> list) {
        super(dexKitBridge, i2, i3);
        this.classId = i4;
        this.modifiers = i5;
        this.descriptor = str;
        this.returnTypeId = i6;
        this.paramTypeIds = list;
        this.dexMethod$delegate = AbstractC0040p.m81E(new MethodData$dexMethod$2(this));
        this.declaredClass$delegate = AbstractC0040p.m81E(new MethodData$declaredClass$2(dexKitBridge, this, i3));
        this.returnType$delegate = AbstractC0040p.m81E(new MethodData$returnType$2(dexKitBridge, this, i3));
        this.paramTypes$delegate = AbstractC0040p.m81E(new MethodData$paramTypes$2(dexKitBridge, this, i3));
        this.paramNames$delegate = AbstractC0040p.m81E(new MethodData$paramNames$2(dexKitBridge, this, i3, i2));
        this.annotations$delegate = AbstractC0040p.m81E(new MethodData$annotations$2(dexKitBridge, this, i3, i2));
        this.paramAnnotations$delegate = AbstractC0040p.m81E(new MethodData$paramAnnotations$2(dexKitBridge, this, i3, i2));
        this.opCodes$delegate = AbstractC0040p.m81E(new MethodData$opCodes$2(dexKitBridge, this, i3, i2));
        this.callers$delegate = AbstractC0040p.m81E(new MethodData$callers$2(dexKitBridge, this, i3, i2));
        this.invokes$delegate = AbstractC0040p.m81E(new MethodData$invokes$2(dexKitBridge, this, i3, i2));
        this.usingStrings$delegate = AbstractC0040p.m81E(new MethodData$usingStrings$2(dexKitBridge, this, i3, i2));
        this.usingFields$delegate = AbstractC0040p.m81E(new MethodData$usingFields$2(dexKitBridge, this, i3, i2));
    }
}
