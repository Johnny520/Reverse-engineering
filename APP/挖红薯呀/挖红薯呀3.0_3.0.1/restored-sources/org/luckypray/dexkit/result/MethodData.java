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
import p000.AbstractC0619pl;
import p000.AbstractC0960ye;
import p000.AbstractC1001ze;
import p000.p30;
import p000.u60;
import p000.x51;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f8070Companion = new Companion(null);
    public static final int ACC_DECLARED_SYNCHRONIZED = 131072;
    private final u60 annotations$delegate;
    private final u60 callers$delegate;
    private final int classId;
    private final u60 declaredClass$delegate;
    private final String descriptor;
    private final u60 dexMethod$delegate;
    private final u60 invokes$delegate;
    private final int modifiers;
    private final u60 opCodes$delegate;
    private final u60 paramAnnotations$delegate;
    private final u60 paramNames$delegate;
    private final List<Integer> paramTypeIds;
    private final u60 paramTypes$delegate;
    private final u60 returnType$delegate;
    private final int returnTypeId;
    private final u60 usingFields$delegate;
    private final u60 usingStrings$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private MethodData(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, List<Integer> list) {
        super(dexKitBridge, i, i2);
        this.classId = i3;
        this.modifiers = i4;
        this.descriptor = str;
        this.returnTypeId = i5;
        this.paramTypeIds = list;
        this.dexMethod$delegate = new x51(new MethodData$dexMethod$2(this));
        this.declaredClass$delegate = new x51(new MethodData$declaredClass$2(dexKitBridge, this, i2));
        this.returnType$delegate = new x51(new MethodData$returnType$2(dexKitBridge, this, i2));
        this.paramTypes$delegate = new x51(new MethodData$paramTypes$2(dexKitBridge, this, i2));
        this.paramNames$delegate = new x51(new MethodData$paramNames$2(dexKitBridge, this, i2, i));
        this.annotations$delegate = new x51(new MethodData$annotations$2(dexKitBridge, this, i2, i));
        this.paramAnnotations$delegate = new x51(new MethodData$paramAnnotations$2(dexKitBridge, this, i2, i));
        this.opCodes$delegate = new x51(new MethodData$opCodes$2(dexKitBridge, this, i2, i));
        this.callers$delegate = new x51(new MethodData$callers$2(dexKitBridge, this, i2, i));
        this.invokes$delegate = new x51(new MethodData$invokes$2(dexKitBridge, this, i2, i));
        this.usingStrings$delegate = new x51(new MethodData$usingStrings$2(dexKitBridge, this, i2, i));
        this.usingFields$delegate = new x51(new MethodData$usingFields$2(dexKitBridge, this, i2, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final DexMethod getDexMethod() {
        return (DexMethod) this.dexMethod$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MethodData) && p30.m3002l(((MethodData) obj).descriptor, this.descriptor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<AnnotationData> getAnnotations() {
        return (List) this.annotations$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodDataList getCallers() {
        return (MethodDataList) this.callers$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<?> getClassInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getClassName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getClassName() {
        return getDexMethod().getClassName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Constructor<?> getConstructorInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return getDexMethod().getConstructorInstance(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassData getDeclaredClass() {
        return (ClassData) this.declaredClass$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDeclaredClassName() {
        return getClassName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDescriptor() {
        return this.descriptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodDataList getInvokes() {
        return (MethodDataList) this.invokes$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Method getMethodInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return getDexMethod().getMethodInstance(classLoader, Boolean.valueOf(Modifier.isStatic(this.modifiers)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMethodName() {
        return getDexMethod().getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMethodSign() {
        return getDexMethod().getMethodSign();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getModifiers() {
        return this.modifiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return getDexMethod().getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Integer> getOpCodes() {
        return (List) this.opCodes$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getOpNames() {
        List<Integer> opCodes = getOpCodes();
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(opCodes));
        Iterator<T> it = opCodes.iterator();
        while (it.hasNext()) {
            arrayList.add(OpCodeUtil.getOpFormat(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<List<AnnotationData>> getParamAnnotations() {
        return (List) this.paramAnnotations$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getParamCount() {
        return this.paramTypeIds.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getParamNames() {
        return (List) this.paramNames$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getParamTypeNames() {
        return getDexMethod().getParamTypeNames();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassDataList getParamTypes() {
        return (ClassDataList) this.paramTypes$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassData getReturnType() {
        return (ClassData) this.returnType$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<?> getReturnTypeInstance(ClassLoader classLoader) {
        classLoader.getClass();
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getReturnTypeName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getReturnTypeName() {
        return getDexMethod().getReturnTypeName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<UsingFieldData> getUsingFields() {
        return (List) this.usingFields$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getUsingStrings() {
        return (List) this.usingStrings$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.descriptor.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isConstructor() {
        return getDexMethod().isConstructor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isMethod() {
        return getDexMethod().isMethod();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isStaticInitializer() {
        return getDexMethod().isStaticInitializer();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final DexMethod toDexMethod() {
        return getDexMethod();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.modifiers;
        if (i != 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(getReturnTypeName());
        sb.append(" ");
        sb.append(getClassName());
        sb.append(".");
        sb.append(getName());
        sb.append("(");
        sb.append(AbstractC0960ye.m5245O(getParamTypeNames(), ", ", null, null, null, 62));
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.MethodData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.MethodData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final MethodData from(DexKitBridge dexKitBridge, MethodMeta methodMeta) {
            dexKitBridge.getClass();
            methodMeta.getClass();
            int iM5719getAccessFlagspVg5ArA = methodMeta.m5719getAccessFlagspVg5ArA();
            if ((iM5719getAccessFlagspVg5ArA & MethodData.ACC_DECLARED_SYNCHRONIZED) > 0) {
                iM5719getAccessFlagspVg5ArA = (iM5719getAccessFlagspVg5ArA ^ MethodData.ACC_DECLARED_SYNCHRONIZED) | 32;
            }
            int i = iM5719getAccessFlagspVg5ArA;
            int iM5722getIdpVg5ArA = methodMeta.m5722getIdpVg5ArA();
            int iM5721getDexIdpVg5ArA = methodMeta.m5721getDexIdpVg5ArA();
            int iM5720getClassIdpVg5ArA = methodMeta.m5720getClassIdpVg5ArA();
            String dexDescriptor = methodMeta.getDexDescriptor();
            if (dexDescriptor == null) {
                dexDescriptor = "";
            }
            String str = dexDescriptor;
            int iM5723getReturnTypepVg5ArA = methodMeta.m5723getReturnTypepVg5ArA();
            ArrayList arrayList = new ArrayList();
            int parameterTypesLength = methodMeta.getParameterTypesLength();
            for (int i2 = 0; i2 < parameterTypesLength; i2++) {
                arrayList.add(Integer.valueOf(methodMeta.parameterTypes(i2)));
            }
            return new MethodData(dexKitBridge, iM5722getIdpVg5ArA, iM5721getDexIdpVg5ArA, iM5720getClassIdpVg5ArA, i, str, iM5723getReturnTypepVg5ArA, arrayList, null);
        }

        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 org.luckypray.dexkit.DexKitBridge)
  (r2v0 int)
  (r3v0 int)
  (r4v0 int)
  (r5v0 int)
  (r6v0 java.lang.String)
  (r7v0 int)
  (r8v0 java.util.List)
 A[MD:(org.luckypray.dexkit.DexKitBridge, int, int, int, int, java.lang.String, int, java.util.List<java.lang.Integer>):void (m)] (LINE:159) call: org.luckypray.dexkit.result.MethodData.<init>(org.luckypray.dexkit.DexKitBridge, int, int, int, int, java.lang.String, int, java.util.List):void type: THIS */
    public /* synthetic */ MethodData(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, List list, AbstractC0619pl abstractC0619pl) {
        this(dexKitBridge, i, i2, i3, i4, str, i5, list);
    }
}
