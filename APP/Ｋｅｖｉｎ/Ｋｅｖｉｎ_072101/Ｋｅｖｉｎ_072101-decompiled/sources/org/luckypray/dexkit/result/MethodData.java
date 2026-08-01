package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: MethodData.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 i2\u00020\u0001:\u0001iBM\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\u0010\u000eJ\u0013\u0010Z\u001a\u00020.2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0096\u0002J\u0012\u0010]\u001a\u0006\u0012\u0002\b\u00030^2\u0006\u0010_\u001a\u00020`J\u0012\u0010a\u001a\u0006\u0012\u0002\b\u00030b2\u0006\u0010_\u001a\u00020`J\u000e\u0010c\u001a\u00020d2\u0006\u0010_\u001a\u00020`J\u0012\u0010e\u001a\u0006\u0012\u0002\b\u00030^2\u0006\u0010_\u001a\u00020`J\b\u0010f\u001a\u00020\u0005H\u0016J\u0006\u0010g\u001a\u00020&J\b\u0010h\u001a\u00020\nH\u0016R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0014\u001a\u0004\b+\u0010\u0018R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b-\u0010/R\u0011\u00100\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b0\u0010/R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u00102\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001cR\u0011\u00104\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u00108\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001cR!\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0014\u001a\u0004\b;\u0010\u0012R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b>\u0010\u0012R'\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0014\u001a\u0004\b@\u0010\u0012R\u0011\u0010B\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bC\u00107R%\u0010D\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u0014\u001a\u0004\bE\u0010\u0012R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\bH\u0010\u0012R\u001b\u0010I\u001a\u00020J8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\u0014\u001a\u0004\bK\u0010LR\u001d\u0010N\u001a\u0004\u0018\u00010\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\u0014\u001a\u0004\bO\u0010 R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010Q\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bR\u0010\u001cR!\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010\u0014\u001a\u0004\bU\u0010\u0012R!\u0010W\u001a\b\u0012\u0004\u0012\u00020\n0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bY\u0010\u0014\u001a\u0004\bX\u0010\u0012¨\u0006j"}, m115d2 = {"Lorg/luckypray/dexkit/result/MethodData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "id", "", "dexId", "classId", "modifiers", "descriptor", "", "returnTypeId", "paramTypeIds", "", "(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;)V", "annotations", "Lorg/luckypray/dexkit/result/AnnotationData;", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "Lkotlin/Lazy;", "callers", "Lorg/luckypray/dexkit/result/MethodDataList;", "getCallers", "()Lorg/luckypray/dexkit/result/MethodDataList;", "callers$delegate", "className", "getClassName", "()Ljava/lang/String;", "declaredClass", "Lorg/luckypray/dexkit/result/ClassData;", "getDeclaredClass", "()Lorg/luckypray/dexkit/result/ClassData;", "declaredClass$delegate", "declaredClassName", "getDeclaredClassName", "getDescriptor", "dexMethod", "Lorg/luckypray/dexkit/wrap/DexMethod;", "getDexMethod", "()Lorg/luckypray/dexkit/wrap/DexMethod;", "dexMethod$delegate", "invokes", "getInvokes", "invokes$delegate", "isConstructor", "", "()Z", "isMethod", "isStaticInitializer", "methodName", "getMethodName", "methodSign", "getMethodSign", "getModifiers", "()I", "name", "getName", "opCodes", "getOpCodes", "opCodes$delegate", "opNames", "getOpNames", "paramAnnotations", "getParamAnnotations", "paramAnnotations$delegate", "paramCount", "getParamCount", "paramNames", "getParamNames", "paramNames$delegate", "paramTypeNames", "getParamTypeNames", "paramTypes", "Lorg/luckypray/dexkit/result/ClassDataList;", "getParamTypes", "()Lorg/luckypray/dexkit/result/ClassDataList;", "paramTypes$delegate", "returnType", "getReturnType", "returnType$delegate", "returnTypeName", "getReturnTypeName", "usingFields", "Lorg/luckypray/dexkit/result/UsingFieldData;", "getUsingFields", "usingFields$delegate", "usingStrings", "getUsingStrings", "usingStrings$delegate", "equals", "other", "", "getClassInstance", "Ljava/lang/Class;", "classLoader", "Ljava/lang/ClassLoader;", "getConstructorInstance", "Ljava/lang/reflect/Constructor;", "getMethodInstance", "Ljava/lang/reflect/Method;", "getReturnTypeInstance", "hashCode", "toDexMethod", "toString", "-Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class MethodData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.MethodData.Companion f431Companion = null;
    public static final int ACC_DECLARED_SYNCHRONIZED = 131072;
    private final kotlin.Lazy annotations$delegate;
    private final kotlin.Lazy callers$delegate;
    private final int classId;
    private final kotlin.Lazy declaredClass$delegate;
    private final java.lang.String descriptor;
    private final kotlin.Lazy dexMethod$delegate;
    private final kotlin.Lazy invokes$delegate;
    private final int modifiers;
    private final kotlin.Lazy opCodes$delegate;
    private final kotlin.Lazy paramAnnotations$delegate;
    private final kotlin.Lazy paramNames$delegate;
    private final java.util.List<java.lang.Integer> paramTypeIds;
    private final kotlin.Lazy paramTypes$delegate;
    private final kotlin.Lazy returnType$delegate;
    private final int returnTypeId;
    private final kotlin.Lazy usingFields$delegate;
    private final kotlin.Lazy usingStrings$delegate;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.MethodData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: MethodData.kt */
    @kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m115d2 = {"Lorg/luckypray/dexkit/result/MethodData$-Companion;", "", "()V", "ACC_DECLARED_SYNCHRONIZED", "", "from", "Lorg/luckypray/dexkit/result/MethodData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "methodMeta", "Lorg/luckypray/dexkit/schema/-MethodMeta;", "Lorg/luckypray/dexkit/InnerMethodMeta;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final org.luckypray.dexkit.result.MethodData from(org.luckypray.dexkit.DexKitBridge r13, org.luckypray.dexkit.schema.MethodMeta r14) {
                r12 = this;
                java.lang.String r0 = "bridge"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                java.lang.String r0 = "methodMeta"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                int r0 = r14.m10447getAccessFlagspVg5ArA()
                r1 = 131072(0x20000, float:1.83671E-40)
                r2 = r0 & r1
                if (r2 <= 0) goto L17
                r1 = r1 ^ r0
                r0 = r1 | 32
            L17:
                int r3 = r14.m10450getIdpVg5ArA()
                int r4 = r14.m10449getDexIdpVg5ArA()
                int r5 = r14.m10448getClassIdpVg5ArA()
                java.lang.String r1 = r14.getDexDescriptor()
                if (r1 != 0) goto L2e
                java.lang.String r1 = ""
            L2e:
                r7 = r1
                int r8 = r14.m10451getReturnTypepVg5ArA()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r9 = r1
                java.util.List r9 = (java.util.List) r9
                r1 = r9
                r2 = 0
                r6 = 0
                int r10 = r14.getParameterTypesLength()
            L42:
                if (r6 >= r10) goto L52
                int r11 = r14.parameterTypes(r6)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r1.add(r11)
                int r6 = r6 + 1
                goto L42
            L52:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                org.luckypray.dexkit.result.MethodData r11 = new org.luckypray.dexkit.result.MethodData
                r10 = 0
                r1 = r11
                r2 = r13
                r6 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r11
        }
    }

    static {
            org.luckypray.dexkit.result.MethodData$-Companion r0 = new org.luckypray.dexkit.result.MethodData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.MethodData.f431Companion = r0
            return
    }

    private MethodData(org.luckypray.dexkit.DexKitBridge r2, int r3, int r4, int r5, int r6, java.lang.String r7, int r8, java.util.List<java.lang.Integer> r9) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r1.classId = r5
            r1.modifiers = r6
            r1.descriptor = r7
            r1.returnTypeId = r8
            r1.paramTypeIds = r9
            org.luckypray.dexkit.result.MethodData$dexMethod$2 r0 = new org.luckypray.dexkit.result.MethodData$dexMethod$2
            r0.<init>(r1)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.dexMethod$delegate = r0
            org.luckypray.dexkit.result.MethodData$declaredClass$2 r0 = new org.luckypray.dexkit.result.MethodData$declaredClass$2
            r0.<init>(r2, r1, r4)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.declaredClass$delegate = r0
            org.luckypray.dexkit.result.MethodData$returnType$2 r0 = new org.luckypray.dexkit.result.MethodData$returnType$2
            r0.<init>(r2, r1, r4)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.returnType$delegate = r0
            org.luckypray.dexkit.result.MethodData$paramTypes$2 r0 = new org.luckypray.dexkit.result.MethodData$paramTypes$2
            r0.<init>(r2, r1, r4)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.paramTypes$delegate = r0
            org.luckypray.dexkit.result.MethodData$paramNames$2 r0 = new org.luckypray.dexkit.result.MethodData$paramNames$2
            r0.<init>(r2, r1, r4, r3)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.paramNames$delegate = r0
            org.luckypray.dexkit.result.MethodData$annotations$2 r0 = new org.luckypray.dexkit.result.MethodData$annotations$2
            r0.<init>(r2, r1, r4, r3)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.annotations$delegate = r0
            org.luckypray.dexkit.result.MethodData$paramAnnotations$2 r0 = new org.luckypray.dexkit.result.MethodData$paramAnnotations$2
            r0.<init>(r2, r1, r4, r3)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.paramAnnotations$delegate = r0
            org.luckypray.dexkit.result.MethodData$opCodes$2 r0 = new org.luckypray.dexkit.result.MethodData$opCodes$2
            r0.<init>(r2, r1, r4, r3)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.opCodes$delegate = r0
            org.luckypray.dexkit.result.MethodData$callers$2 r0 = new org.luckypray.dexkit.result.MethodData$callers$2
            r0.<init>(r2, r1, r4, r3)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.callers$delegate = r0
            org.luckypray.dexkit.result.MethodData$invokes$2 r0 = new org.luckypray.dexkit.result.MethodData$invokes$2
            r0.<init>(r2, r1, r4, r3)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.invokes$delegate = r0
            org.luckypray.dexkit.result.MethodData$usingStrings$2 r0 = new org.luckypray.dexkit.result.MethodData$usingStrings$2
            r0.<init>(r2, r1, r4, r3)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.usingStrings$delegate = r0
            org.luckypray.dexkit.result.MethodData$usingFields$2 r0 = new org.luckypray.dexkit.result.MethodData$usingFields$2
            r0.<init>(r2, r1, r4, r3)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.usingFields$delegate = r0
            return
    }

    public /* synthetic */ MethodData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, int r4, int r5, java.lang.String r6, int r7, java.util.List r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static final /* synthetic */ int access$getClassId$p(org.luckypray.dexkit.result.MethodData r1) {
            int r0 = r1.classId
            return r0
    }

    public static final /* synthetic */ long access$getEncodeId(org.luckypray.dexkit.result.MethodData r2, int r3, int r4) {
            long r0 = r2.getEncodeId(r3, r4)
            return r0
    }

    public static final /* synthetic */ java.util.List access$getParamTypeIds$p(org.luckypray.dexkit.result.MethodData r1) {
            java.util.List<java.lang.Integer> r0 = r1.paramTypeIds
            return r0
    }

    public static final /* synthetic */ int access$getReturnTypeId$p(org.luckypray.dexkit.result.MethodData r1) {
            int r0 = r1.returnTypeId
            return r0
    }

    private final org.luckypray.dexkit.wrap.DexMethod getDexMethod() {
            r1 = this;
            kotlin.Lazy r0 = r1.dexMethod$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.wrap.DexMethod r0 = (org.luckypray.dexkit.wrap.DexMethod) r0
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof org.luckypray.dexkit.result.MethodData
            if (r1 == 0) goto L16
            r1 = r4
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1
            java.lang.String r1 = r1.descriptor
            java.lang.String r2 = r3.descriptor
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.result.AnnotationData> getAnnotations() {
            r1 = this;
            kotlin.Lazy r0 = r1.annotations$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final org.luckypray.dexkit.result.MethodDataList getCallers() {
            r1 = this;
            kotlin.Lazy r0 = r1.callers$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.MethodDataList r0 = (org.luckypray.dexkit.result.MethodDataList) r0
            return r0
    }

    public final java.lang.Class<?> getClassInstance(java.lang.ClassLoader r3) throws java.lang.ClassNotFoundException {
            r2 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.String r1 = r2.getClassName()
            java.lang.Class r0 = r0.getClassInstance(r3, r1)
            return r0
    }

    public final java.lang.String getClassName() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            java.lang.String r0 = r0.getClassName()
            return r0
    }

    public final java.lang.reflect.Constructor<?> getConstructorInstance(java.lang.ClassLoader r2) throws java.lang.NoSuchMethodException {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            java.lang.reflect.Constructor r0 = r0.getConstructorInstance(r2)
            return r0
    }

    public final org.luckypray.dexkit.result.ClassData getDeclaredClass() {
            r1 = this;
            kotlin.Lazy r0 = r1.declaredClass$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            return r0
    }

    public final java.lang.String getDeclaredClassName() {
            r1 = this;
            java.lang.String r0 = r1.getClassName()
            return r0
    }

    public final java.lang.String getDescriptor() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            return r0
    }

    public final org.luckypray.dexkit.result.MethodDataList getInvokes() {
            r1 = this;
            kotlin.Lazy r0 = r1.invokes$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.MethodDataList r0 = (org.luckypray.dexkit.result.MethodDataList) r0
            return r0
    }

    public final java.lang.reflect.Method getMethodInstance(java.lang.ClassLoader r2) throws java.lang.NoSuchMethodException {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            java.lang.reflect.Method r0 = r0.getMethodInstance(r2)
            return r0
    }

    public final java.lang.String getMethodName() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            java.lang.String r0 = r0.getName()
            return r0
    }

    public final java.lang.String getMethodSign() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            java.lang.String r0 = r0.getMethodSign()
            return r0
    }

    public final int getModifiers() {
            r1 = this;
            int r0 = r1.modifiers
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            java.lang.String r0 = r0.getName()
            return r0
    }

    public final java.util.List<java.lang.Integer> getOpCodes() {
            r1 = this;
            kotlin.Lazy r0 = r1.opCodes$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final java.util.List<java.lang.String> getOpNames() {
            r9 = this;
            java.util.List r0 = r9.getOpCodes()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L1a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L34
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8 = 0
            java.lang.String r7 = org.luckypray.dexkit.util.OpCodeUtil.getOpFormat(r7)
            r2.add(r7)
            goto L1a
        L34:
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public final java.util.List<java.util.List<org.luckypray.dexkit.result.AnnotationData>> getParamAnnotations() {
            r1 = this;
            kotlin.Lazy r0 = r1.paramAnnotations$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final int getParamCount() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.paramTypeIds
            int r0 = r0.size()
            return r0
    }

    public final java.util.List<java.lang.String> getParamNames() {
            r1 = this;
            kotlin.Lazy r0 = r1.paramNames$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final java.util.List<java.lang.String> getParamTypeNames() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            java.util.List r0 = r0.getParamTypeNames()
            return r0
    }

    public final org.luckypray.dexkit.result.ClassDataList getParamTypes() {
            r1 = this;
            kotlin.Lazy r0 = r1.paramTypes$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.ClassDataList r0 = (org.luckypray.dexkit.result.ClassDataList) r0
            return r0
    }

    public final org.luckypray.dexkit.result.ClassData getReturnType() {
            r1 = this;
            kotlin.Lazy r0 = r1.returnType$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            return r0
    }

    public final java.lang.Class<?> getReturnTypeInstance(java.lang.ClassLoader r3) throws java.lang.ClassNotFoundException {
            r2 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.String r1 = r2.getReturnTypeName()
            java.lang.Class r0 = r0.getClassInstance(r3, r1)
            return r0
    }

    public final java.lang.String getReturnTypeName() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            java.lang.String r0 = r0.getReturnTypeName()
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.result.UsingFieldData> getUsingFields() {
            r1 = this;
            kotlin.Lazy r0 = r1.usingFields$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final java.util.List<java.lang.String> getUsingStrings() {
            r1 = this;
            kotlin.Lazy r0 = r1.usingStrings$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isConstructor() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            boolean r0 = r0.isConstructor()
            return r0
    }

    public final boolean isMethod() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            boolean r0 = r0.isMethod()
            return r0
    }

    public final boolean isStaticInitializer() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            boolean r0 = r0.isStaticInitializer()
            return r0
    }

    public final org.luckypray.dexkit.wrap.DexMethod toDexMethod() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            return r0
    }

    public java.lang.String toString() {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            int r3 = r13.modifiers
            java.lang.String r4 = " "
            if (r3 == 0) goto L27
            int r3 = r13.modifiers
            java.lang.String r3 = java.lang.reflect.Modifier.toString(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
        L27:
            java.lang.String r3 = r13.getReturnTypeName()
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r13.getClassName()
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = r13.getName()
            r1.append(r3)
            java.lang.String r3 = "("
            r1.append(r3)
            java.util.List r3 = r13.getParamTypeNames()
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r3 = ", "
            r5 = r3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r3 = kotlin.collections.CollectionsKt.joinToString$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
