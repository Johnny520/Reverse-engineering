package org.luckypray.dexkit.result;

import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5499;
import Yue.C5689;
import Yue.C8107;
import Yue.InterfaceC5684;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.base.BaseData;
import org.luckypray.dexkit.schema.MethodMeta;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.util.OpCodeUtil;
import org.luckypray.dexkit.wrap.DexMethod;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMethodData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodData.kt\norg/luckypray/dexkit/result/MethodData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n1547#2:349\n1618#2,3:350\n*S KotlinDebug\n*F\n+ 1 MethodData.kt\norg/luckypray/dexkit/result/MethodData\n*L\n223#1:349\n223#1:350,3\n*E\n"})
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 q2\u00020\u0001:\u0001qBO\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010 R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u001b\u00100\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001eR\u001d\u00105\u001a\u0004\u0018\u0001018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00104R\u001d\u00108\u001a\u0004\u0018\u0001018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u00104R\u001b\u0010=\u001a\u0002098FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b;\u0010<R%\u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\b?\u0010@R!\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bC\u0010.\u001a\u0004\bD\u0010@R'\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\f0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bG\u0010@R!\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010.\u001a\u0004\bJ\u0010@R\u001b\u0010P\u001a\u00020L8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010.\u001a\u0004\bN\u0010OR\u001b\u0010S\u001a\u00020L8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010.\u001a\u0004\bR\u0010OR!\u0010V\u001a\b\u0012\u0004\u0012\u00020\t0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u0010.\u001a\u0004\bU\u0010@R!\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bX\u0010.\u001a\u0004\bY\u0010@R\u0011\u0010\\\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b[\u0010 R\u0011\u0010^\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b]\u0010 R\u0011\u0010`\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b_\u0010 R\u0011\u0010b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\ba\u0010 R\u0011\u0010d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bc\u0010 R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\t0\f8F¢\u0006\u0006\u001a\u0004\be\u0010@R\u0011\u0010h\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bg\u0010'R\u0011\u0010j\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bi\u0010 R\u0011\u0010k\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0011\u0010m\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bm\u0010lR\u0011\u0010n\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bn\u0010lR\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020\t0\f8F¢\u0006\u0006\u001a\u0004\bo\u0010@¨\u0006r"}, d2 = {"Lorg/luckypray/dexkit/result/MethodData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "Lorg/luckypray/dexkit/DexKitBridge;", "bridge", "", Name.MARK, "dexId", "classId", "modifiers", "", "descriptor", "returnTypeId", "", "paramTypeIds", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;)V", "Ljava/lang/ClassLoader;", "classLoader", "Ljava/lang/Class;", "getClassInstance", "(Ljava/lang/ClassLoader;)Ljava/lang/Class;", "getReturnTypeInstance", "Ljava/lang/reflect/Constructor;", "getConstructorInstance", "(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;", "Ljava/lang/reflect/Method;", "getMethodInstance", "(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;", "Lorg/luckypray/dexkit/wrap/DexMethod;", "toDexMethod", "()Lorg/luckypray/dexkit/wrap/DexMethod;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getModifiers", "Ljava/lang/String;", "getDescriptor", "Ljava/util/List;", "dexMethod$delegate", "LYue/ۥ۠ۦۨۨ;", "getDexMethod", "dexMethod", "Lorg/luckypray/dexkit/result/ClassData;", "declaredClass$delegate", "getDeclaredClass", "()Lorg/luckypray/dexkit/result/ClassData;", "declaredClass", "returnType$delegate", "getReturnType", "returnType", "Lorg/luckypray/dexkit/result/ClassDataList;", "paramTypes$delegate", "getParamTypes", "()Lorg/luckypray/dexkit/result/ClassDataList;", "paramTypes", "paramNames$delegate", "getParamNames", "()Ljava/util/List;", "paramNames", "Lorg/luckypray/dexkit/result/AnnotationData;", "annotations$delegate", "getAnnotations", "annotations", "paramAnnotations$delegate", "getParamAnnotations", "paramAnnotations", "opCodes$delegate", "getOpCodes", "opCodes", "Lorg/luckypray/dexkit/result/MethodDataList;", "callers$delegate", "getCallers", "()Lorg/luckypray/dexkit/result/MethodDataList;", "callers", "invokes$delegate", "getInvokes", "invokes", "usingStrings$delegate", "getUsingStrings", "usingStrings", "Lorg/luckypray/dexkit/result/UsingFieldData;", "usingFields$delegate", "getUsingFields", "usingFields", "getMethodSign", "methodSign", "getClassName", "className", "getDeclaredClassName", "declaredClassName", "getMethodName", "methodName", "getName", "name", "getParamTypeNames", "paramTypeNames", "getParamCount", "paramCount", "getReturnTypeName", "returnTypeName", "isConstructor", "()Z", "isStaticInitializer", "isMethod", "getOpNames", "opNames", "-Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class MethodData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name and from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);
    public static final int ACC_DECLARED_SYNCHRONIZED = 131072;

    /* JADX INFO: renamed from: annotations$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 annotations;

    /* JADX INFO: renamed from: callers$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 callers;
    private final int classId;

    /* JADX INFO: renamed from: declaredClass$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 declaredClass;

    @InterfaceC6399
    private final String descriptor;

    /* JADX INFO: renamed from: dexMethod$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 dexMethod;

    /* JADX INFO: renamed from: invokes$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 invokes;
    private final int modifiers;

    /* JADX INFO: renamed from: opCodes$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 opCodes;

    /* JADX INFO: renamed from: paramAnnotations$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 paramAnnotations;

    /* JADX INFO: renamed from: paramNames$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 paramNames;

    @InterfaceC6399
    private final List<Integer> paramTypeIds;

    /* JADX INFO: renamed from: paramTypes$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 paramTypes;

    /* JADX INFO: renamed from: returnType$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 returnType;
    private final int returnTypeId;

    /* JADX INFO: renamed from: usingFields$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 usingFields;

    /* JADX INFO: renamed from: usingStrings$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private final InterfaceC5684 usingStrings;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.MethodData$-Companion, reason: invalid class name and from kotlin metadata */
    @InterfaceC6211(m2698d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m2699d2 = {"Lorg/luckypray/dexkit/result/MethodData$-Companion;", "", "()V", "ACC_DECLARED_SYNCHRONIZED", "", "from", "Lorg/luckypray/dexkit/result/MethodData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "methodMeta", "Lorg/luckypray/dexkit/schema/-MethodMeta;", "Lorg/luckypray/dexkit/InnerMethodMeta;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.MethodData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        public final MethodData from(@InterfaceC6399 DexKitBridge dexKitBridge, @InterfaceC6399 MethodMeta methodMeta) {
            C5499.m17103(dexKitBridge, "bridge");
            C5499.m17103(methodMeta, "methodMeta");
            int iM31207getAccessFlagspVg5ArA = methodMeta.m31207getAccessFlagspVg5ArA();
            if ((iM31207getAccessFlagspVg5ArA & 131072) > 0) {
                iM31207getAccessFlagspVg5ArA = (iM31207getAccessFlagspVg5ArA ^ 131072) | 32;
            }
            int i = iM31207getAccessFlagspVg5ArA;
            int iM31210getIdpVg5ArA = methodMeta.m31210getIdpVg5ArA();
            int iM31209getDexIdpVg5ArA = methodMeta.m31209getDexIdpVg5ArA();
            int iM31208getClassIdpVg5ArA = methodMeta.m31208getClassIdpVg5ArA();
            String dexDescriptor = methodMeta.getDexDescriptor();
            if (dexDescriptor == null) {
                dexDescriptor = "";
            }
            String str = dexDescriptor;
            int iM31211getReturnTypepVg5ArA = methodMeta.m31211getReturnTypepVg5ArA();
            ArrayList arrayList = new ArrayList();
            int parameterTypesLength = methodMeta.getParameterTypesLength();
            for (int i2 = 0; i2 < parameterTypesLength; i2++) {
                arrayList.add(Integer.valueOf(methodMeta.parameterTypes(i2)));
            }
            C8107 c8107 = C8107.f3222;
            return new MethodData(dexKitBridge, iM31210getIdpVg5ArA, iM31209getDexIdpVg5ArA, iM31208getClassIdpVg5ArA, i, str, iM31211getReturnTypepVg5ArA, arrayList, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
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
 A[MD:(org.luckypray.dexkit.DexKitBridge, int, int, int, int, java.lang.String, int, java.util.List<java.lang.Integer>):void (m)] (LINE:1) call: org.luckypray.dexkit.result.MethodData.<init>(org.luckypray.dexkit.DexKitBridge, int, int, int, int, java.lang.String, int, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ MethodData(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, List list, C4335 c4335) {
        this(dexKitBridge, i, i2, i3, i4, str, i5, list);
    }

    private final DexMethod getDexMethod() {
        return (DexMethod) this.dexMethod.getValue();
    }

    public boolean equals(@InterfaceC6489 Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MethodData) && C5499.m17094(((MethodData) other).descriptor, this.descriptor);
    }

    @InterfaceC6399
    public final List<AnnotationData> getAnnotations() {
        return (List) this.annotations.getValue();
    }

    @InterfaceC6399
    public final MethodDataList getCallers() {
        return (MethodDataList) this.callers.getValue();
    }

    @InterfaceC6399
    public final Class<?> getClassInstance(@InterfaceC6399 ClassLoader classLoader) throws ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getClassName());
    }

    @InterfaceC6399
    public final String getClassName() {
        return getDexMethod().getClassName();
    }

    @InterfaceC6399
    public final Constructor<?> getConstructorInstance(@InterfaceC6399 ClassLoader classLoader) throws NoSuchMethodException {
        C5499.m17103(classLoader, "classLoader");
        return getDexMethod().getConstructorInstance(classLoader);
    }

    @InterfaceC6489
    public final ClassData getDeclaredClass() {
        return (ClassData) this.declaredClass.getValue();
    }

    @InterfaceC6399
    public final String getDeclaredClassName() {
        return getClassName();
    }

    @InterfaceC6399
    public final String getDescriptor() {
        return this.descriptor;
    }

    @InterfaceC6399
    public final MethodDataList getInvokes() {
        return (MethodDataList) this.invokes.getValue();
    }

    @InterfaceC6399
    public final Method getMethodInstance(@InterfaceC6399 ClassLoader classLoader) throws NoSuchMethodException {
        C5499.m17103(classLoader, "classLoader");
        return getDexMethod().getMethodInstance(classLoader, Boolean.valueOf(Modifier.isStatic(this.modifiers)));
    }

    @InterfaceC6399
    public final String getMethodName() {
        return getDexMethod().getName();
    }

    @InterfaceC6399
    public final String getMethodSign() {
        return getDexMethod().getMethodSign();
    }

    public final int getModifiers() {
        return this.modifiers;
    }

    @InterfaceC6399
    public final String getName() {
        return getDexMethod().getName();
    }

    @InterfaceC6399
    public final List<Integer> getOpCodes() {
        return (List) this.opCodes.getValue();
    }

    @InterfaceC6399
    public final List<String> getOpNames() {
        List<Integer> opCodes = getOpCodes();
        ArrayList arrayList = new ArrayList(C3881.m10756(opCodes, 10));
        Iterator<T> it = opCodes.iterator();
        while (it.hasNext()) {
            arrayList.add(OpCodeUtil.getOpFormat(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @InterfaceC6399
    public final List<List<AnnotationData>> getParamAnnotations() {
        return (List) this.paramAnnotations.getValue();
    }

    public final int getParamCount() {
        return this.paramTypeIds.size();
    }

    @InterfaceC6489
    public final List<String> getParamNames() {
        return (List) this.paramNames.getValue();
    }

    @InterfaceC6399
    public final List<String> getParamTypeNames() {
        return getDexMethod().getParamTypeNames();
    }

    @InterfaceC6399
    public final ClassDataList getParamTypes() {
        return (ClassDataList) this.paramTypes.getValue();
    }

    @InterfaceC6489
    public final ClassData getReturnType() {
        return (ClassData) this.returnType.getValue();
    }

    @InterfaceC6399
    public final Class<?> getReturnTypeInstance(@InterfaceC6399 ClassLoader classLoader) throws ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, getReturnTypeName());
    }

    @InterfaceC6399
    public final String getReturnTypeName() {
        return getDexMethod().getReturnTypeName();
    }

    @InterfaceC6399
    public final List<UsingFieldData> getUsingFields() {
        return (List) this.usingFields.getValue();
    }

    @InterfaceC6399
    public final List<String> getUsingStrings() {
        return (List) this.usingStrings.getValue();
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

    @InterfaceC6399
    public final DexMethod toDexMethod() {
        return getDexMethod();
    }

    @InterfaceC6399
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
        sb.append(C3888.m10923(getParamTypeNames(), ", ", null, null, 0, null, null, 62, null));
        sb.append(")");
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private MethodData(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, List<Integer> list) {
        super(dexKitBridge, i, i2);
        this.classId = i3;
        this.modifiers = i4;
        this.descriptor = str;
        this.returnTypeId = i5;
        this.paramTypeIds = list;
        this.dexMethod = C5689.m2370(new MethodData$dexMethod$2(this));
        this.declaredClass = C5689.m2370(new MethodData$declaredClass$2(dexKitBridge, this, i2));
        this.returnType = C5689.m2370(new MethodData$returnType$2(dexKitBridge, this, i2));
        this.paramTypes = C5689.m2370(new MethodData$paramTypes$2(dexKitBridge, this, i2));
        this.paramNames = C5689.m2370(new MethodData$paramNames$2(dexKitBridge, this, i2, i));
        this.annotations = C5689.m2370(new MethodData$annotations$2(dexKitBridge, this, i2, i));
        this.paramAnnotations = C5689.m2370(new MethodData$paramAnnotations$2(dexKitBridge, this, i2, i));
        this.opCodes = C5689.m2370(new MethodData$opCodes$2(dexKitBridge, this, i2, i));
        this.callers = C5689.m2370(new MethodData$callers$2(dexKitBridge, this, i2, i));
        this.invokes = C5689.m2370(new MethodData$invokes$2(dexKitBridge, this, i2, i));
        this.usingStrings = C5689.m2370(new MethodData$usingStrings$2(dexKitBridge, this, i2, i));
        this.usingFields = C5689.m2370(new MethodData$usingFields$2(dexKitBridge, this, i2, i));
    }
}
