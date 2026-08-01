package org.luckypray.dexkit;

/* JADX INFO: compiled from: DexKitBridge.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 o2\u00020\u0001:\u0001oB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\b\u0012\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bB\u0017\b\u0012\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0081\b¢\u0006\u0002\b\u001aJ\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001b\u001a\u00020\u001cJ1\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00162\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000J\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0081\b¢\u0006\u0002\b#J\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0\u00162\u0006\u0010\u001b\u001a\u00020$J1\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0\u00162\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000J\b\u0010%\u001a\u00020\u001fH\u0016J\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0003J\b\u0010(\u001a\u00020\u001fH\u0004J\u0016\u0010)\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0081\b¢\u0006\u0002\b*J\u000e\u0010)\u001a\u00020\u00172\u0006\u0010)\u001a\u00020+J%\u0010)\u001a\u00020\u00172\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000J\u0016\u0010,\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020\u0019H\u0081\b¢\u0006\u0002\b.J\u000e\u0010,\u001a\u00020-2\u0006\u0010,\u001a\u00020/J%\u0010,\u001a\u00020-2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000J\u0016\u00100\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0019H\u0081\b¢\u0006\u0002\b1J\u000e\u00100\u001a\u00020\"2\u0006\u00100\u001a\u000202J%\u00100\u001a\u00020\"2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000J\u0016\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\b5J\u001c\u00106\u001a\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\b:J\u0014\u0010;\u001a\u0004\u0018\u00010<2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030>J\u0010\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020\u0003J\u0006\u0010@\u001a\u00020AJ\u001c\u0010B\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010C\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\bDJ\u0016\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020GH\u0081\b¢\u0006\u0002\bHJ\u0010\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020LJ\u0010\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010M\u001a\u00020\u0003J\u0016\u0010N\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\bOJ\u001c\u0010P\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010Q\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\bRJ\u0016\u0010S\u001a\u00020\"2\u0006\u0010F\u001a\u00020GH\u0081\b¢\u0006\u0002\bTJ\u0014\u0010U\u001a\u0004\u0018\u00010V2\n\u0010W\u001a\u0006\u0012\u0002\b\u00030XJ\u0010\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010Y\u001a\u00020ZJ\u0010\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010M\u001a\u00020\u0003J\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00020A072\u0006\u00104\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\b\\J\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020^072\u0006\u00104\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\b_J\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00104\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\baJ\"\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020807072\u0006\u0010Q\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\bcJ \u0010d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001072\u0006\u00104\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\beJ\u0016\u0010f\u001a\u00020\u00172\u0006\u0010F\u001a\u00020GH\u0081\b¢\u0006\u0002\bgJ\u0006\u0010h\u001a\u00020\u001fJ\u0016\u0010i\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\bjJ\u000e\u0010k\u001a\u00020\u001f2\u0006\u0010l\u001a\u00020AJ\u0016\u0010m\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0011H\u0081\b¢\u0006\u0002\bnR\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006p"}, m115d2 = {"Lorg/luckypray/dexkit/DexKitBridge;", "Ljava/io/Closeable;", "apkPath", "", "(Ljava/lang/String;)V", "dexBytesArray", "", "", "([[B)V", "classLoader", "Ljava/lang/ClassLoader;", "useMemoryDexFile", "", "(Ljava/lang/ClassLoader;Z)V", "isValid", "()Z", "safeToken", "", "getSafeToken", "()J", "token", "batchFindClassUsingStrings", "", "Lorg/luckypray/dexkit/result/ClassDataList;", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "batchFindClassUsingStrings$dexkit_android_release", "batchFind", "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "batchFindMethodUsingStrings", "Lorg/luckypray/dexkit/result/MethodDataList;", "batchFindMethodUsingStrings$dexkit_android_release", "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "close", "exportDexFile", "outPath", "finalize", "findClass", "findClass$dexkit_android_release", "Lorg/luckypray/dexkit/query/FindClass;", "findField", "Lorg/luckypray/dexkit/result/FieldDataList;", "findField$dexkit_android_release", "Lorg/luckypray/dexkit/query/FindField;", "findMethod", "findMethod$dexkit_android_release", "Lorg/luckypray/dexkit/query/FindMethod;", "getCallMethods", "encodeId", "getCallMethods$dexkit_android_release", "getClassAnnotations", "", "Lorg/luckypray/dexkit/result/AnnotationData;", "classId", "getClassAnnotations$dexkit_android_release", "getClassData", "Lorg/luckypray/dexkit/result/ClassData;", "clazz", "Ljava/lang/Class;", "identifier", "getDexNum", "", "getFieldAnnotations", "fieldId", "getFieldAnnotations$dexkit_android_release", "getFieldByIds", "encodeIdArray", "", "getFieldByIds$dexkit_android_release", "getFieldData", "Lorg/luckypray/dexkit/result/FieldData;", "field", "Ljava/lang/reflect/Field;", "descriptor", "getInvokeMethods", "getInvokeMethods$dexkit_android_release", "getMethodAnnotations", "methodId", "getMethodAnnotations$dexkit_android_release", "getMethodByIds", "getMethodByIds$dexkit_android_release", "getMethodData", "Lorg/luckypray/dexkit/result/MethodData;", "constructor", "Ljava/lang/reflect/Constructor;", "method", "Ljava/lang/reflect/Method;", "getMethodOpCodes", "getMethodOpCodes$dexkit_android_release", "getMethodUsingFields", "Lorg/luckypray/dexkit/result/UsingFieldData;", "getMethodUsingFields$dexkit_android_release", "getMethodUsingStrings", "getMethodUsingStrings$dexkit_android_release", "getParameterAnnotations", "getParameterAnnotations$dexkit_android_release", "getParameterNames", "getParameterNames$dexkit_android_release", "getTypeByIds", "getTypeByIds$dexkit_android_release", "initFullCache", "readFieldMethods", "readFieldMethods$dexkit_android_release", "setThreadNum", "num", "writeFieldMethods", "writeFieldMethods$dexkit_android_release", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class DexKitBridge implements java.io.Closeable {
    public static final org.luckypray.dexkit.DexKitBridge.Companion Companion = null;
    private long token;

    /* JADX INFO: compiled from: DexKitBridge.kt */
    @kotlin.Metadata(m114d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001b\u0010\u0003\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0019\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0083 J\u0019\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0083 J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000eH\u0083 J\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0083 J\u0019\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0083 J\u0019\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0083 J\u0019\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0083 J\u0019\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0083 J\u0019\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0083 J\u0019\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0083 J\u0019\u0010 \u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0083 J\u001b\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u000eH\u0083 J\u0011\u0010%\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u0011H\u0083 J\u0019\u0010'\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0083 J\u0019\u0010)\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0083 J\u001b\u0010*\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u000eH\u0083 J\u0019\u0010+\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0083 J\u0019\u0010,\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0011H\u0083 J\u0019\u0010.\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0083 J\u001b\u0010/\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u000eH\u0083 J\u0019\u00100\u001a\u0002012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0011H\u0083 J\u0019\u00102\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0083 J\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0083 J\u0019\u00104\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0011H\u0083 J#\u00105\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0011H\u0083 J\u0011\u00106\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0083 J\u0017\u00107\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0083 J\u0019\u00108\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0083 J\u0011\u00109\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0083 J\u0011\u0010:\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0083 J\u0019\u0010;\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010<\u001a\u00020&H\u0083 ¨\u0006="}, m115d2 = {"Lorg/luckypray/dexkit/DexKitBridge$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/DexKitBridge;", "loader", "Ljava/lang/ClassLoader;", "useMemoryDexFile", "", "dexBytesArray", "", "", "([[B)Lorg/luckypray/dexkit/DexKitBridge;", "apkPath", "", "nativeBatchFindClassUsingStrings", "nativePtr", "", "bytes", "nativeBatchFindMethodUsingStrings", "nativeExportDexFile", "", "outDir", "nativeFieldGetMethods", "encodeId", "nativeFieldPutMethods", "nativeFindClass", "nativeFindField", "nativeFindMethod", "nativeGetCallMethods", "nativeGetClassAnnotations", "classId", "nativeGetClassByIds", "ids", "", "nativeGetClassData", "dexDescriptor", "nativeGetDexNum", "", "nativeGetFieldAnnotations", "fieldId", "nativeGetFieldByIds", "nativeGetFieldData", "nativeGetInvokeMethods", "nativeGetMethodAnnotations", "methodId", "nativeGetMethodByIds", "nativeGetMethodData", "nativeGetMethodOpCodes", "", "nativeGetMethodUsingFields", "nativeGetMethodUsingStrings", "nativeGetParameterAnnotations", "nativeGetParameterNames", "nativeInitDexKit", "nativeInitDexKitByBytesArray", "nativeInitDexKitByClassLoader", "nativeInitFullCache", "nativeRelease", "nativeSetThreadNum", "threadNum", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        public static final /* synthetic */ byte[] access$nativeBatchFindClassUsingStrings(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, byte[] r4) {
                byte[] r0 = r1.nativeBatchFindClassUsingStrings(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeBatchFindMethodUsingStrings(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, byte[] r4) {
                byte[] r0 = r1.nativeBatchFindMethodUsingStrings(r2, r4)
                return r0
        }

        public static final /* synthetic */ void access$nativeExportDexFile(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, java.lang.String r3) {
                r0.nativeExportDexFile(r1, r3)
                return
        }

        public static final /* synthetic */ byte[] access$nativeFieldGetMethods(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                byte[] r0 = r1.nativeFieldGetMethods(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFieldPutMethods(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                byte[] r0 = r1.nativeFieldPutMethods(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFindClass(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, byte[] r4) {
                byte[] r0 = r1.nativeFindClass(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFindField(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, byte[] r4) {
                byte[] r0 = r1.nativeFindField(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFindMethod(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, byte[] r4) {
                byte[] r0 = r1.nativeFindMethod(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetCallMethods(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                byte[] r0 = r1.nativeGetCallMethods(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetClassAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                byte[] r0 = r1.nativeGetClassAnnotations(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetClassByIds(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long[] r4) {
                byte[] r0 = r1.nativeGetClassByIds(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetClassData(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, java.lang.String r4) {
                byte[] r0 = r1.nativeGetClassData(r2, r4)
                return r0
        }

        public static final /* synthetic */ int access$nativeGetDexNum(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2) {
                int r0 = r1.nativeGetDexNum(r2)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                byte[] r0 = r1.nativeGetFieldAnnotations(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldByIds(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long[] r4) {
                byte[] r0 = r1.nativeGetFieldByIds(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldData(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, java.lang.String r4) {
                byte[] r0 = r1.nativeGetFieldData(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetInvokeMethods(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                byte[] r0 = r1.nativeGetInvokeMethods(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                byte[] r0 = r1.nativeGetMethodAnnotations(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodByIds(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long[] r4) {
                byte[] r0 = r1.nativeGetMethodByIds(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodData(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, java.lang.String r4) {
                byte[] r0 = r1.nativeGetMethodData(r2, r4)
                return r0
        }

        public static final /* synthetic */ int[] access$nativeGetMethodOpCodes(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                int[] r0 = r1.nativeGetMethodOpCodes(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodUsingFields(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                byte[] r0 = r1.nativeGetMethodUsingFields(r2, r4)
                return r0
        }

        public static final /* synthetic */ java.lang.String[] access$nativeGetMethodUsingStrings(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                java.lang.String[] r0 = r1.nativeGetMethodUsingStrings(r2, r4)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetParameterAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                byte[] r0 = r1.nativeGetParameterAnnotations(r2, r4)
                return r0
        }

        public static final /* synthetic */ java.lang.String[] access$nativeGetParameterNames(org.luckypray.dexkit.DexKitBridge.Companion r1, long r2, long r4) {
                java.lang.String[] r0 = r1.nativeGetParameterNames(r2, r4)
                return r0
        }

        public static final /* synthetic */ long access$nativeInitDexKit(org.luckypray.dexkit.DexKitBridge.Companion r2, java.lang.String r3) {
                long r0 = r2.nativeInitDexKit(r3)
                return r0
        }

        public static final /* synthetic */ long access$nativeInitDexKitByBytesArray(org.luckypray.dexkit.DexKitBridge.Companion r2, byte[][] r3) {
                long r0 = r2.nativeInitDexKitByBytesArray(r3)
                return r0
        }

        public static final /* synthetic */ long access$nativeInitDexKitByClassLoader(org.luckypray.dexkit.DexKitBridge.Companion r2, java.lang.ClassLoader r3, boolean r4) {
                long r0 = r2.nativeInitDexKitByClassLoader(r3, r4)
                return r0
        }

        public static final /* synthetic */ void access$nativeInitFullCache(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1) {
                r0.nativeInitFullCache(r1)
                return
        }

        public static final /* synthetic */ void access$nativeRelease(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1) {
                r0.nativeRelease(r1)
                return
        }

        public static final /* synthetic */ void access$nativeSetThreadNum(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, int r3) {
                r0.nativeSetThreadNum(r1, r3)
                return
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeBatchFindClassUsingStrings(long r2, byte[] r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeBatchFindClassUsingStrings(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeBatchFindMethodUsingStrings(long r2, byte[] r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeBatchFindMethodUsingStrings(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final void nativeExportDexFile(long r1, java.lang.String r3) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeExportDexFile(r1, r3)
                return
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeFieldGetMethods(long r2, long r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFieldGetMethods(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeFieldPutMethods(long r2, long r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFieldPutMethods(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeFindClass(long r2, byte[] r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFindClass(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeFindField(long r2, byte[] r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFindField(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeFindMethod(long r2, byte[] r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFindMethod(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetCallMethods(long r2, long r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetCallMethods(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetClassAnnotations(long r2, long r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetClassAnnotations(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetClassByIds(long r2, long[] r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetClassByIds(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetClassData(long r2, java.lang.String r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetClassData(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final int nativeGetDexNum(long r2) {
                r1 = this;
                int r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetDexNum(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetFieldAnnotations(long r2, long r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetFieldAnnotations(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetFieldByIds(long r2, long[] r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetFieldByIds(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetFieldData(long r2, java.lang.String r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetFieldData(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetInvokeMethods(long r2, long r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetInvokeMethods(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetMethodAnnotations(long r2, long r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodAnnotations(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetMethodByIds(long r2, long[] r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodByIds(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetMethodData(long r2, java.lang.String r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodData(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final int[] nativeGetMethodOpCodes(long r2, long r4) {
                r1 = this;
                int[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodOpCodes(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetMethodUsingFields(long r2, long r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodUsingFields(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final java.lang.String[] nativeGetMethodUsingStrings(long r2, long r4) {
                r1 = this;
                java.lang.String[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodUsingStrings(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final byte[] nativeGetParameterAnnotations(long r2, long r4) {
                r1 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetParameterAnnotations(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final java.lang.String[] nativeGetParameterNames(long r2, long r4) {
                r1 = this;
                java.lang.String[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetParameterNames(r2, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final long nativeInitDexKit(java.lang.String r3) {
                r2 = this;
                long r0 = org.luckypray.dexkit.DexKitBridge.access$nativeInitDexKit(r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final long nativeInitDexKitByBytesArray(byte[][] r3) {
                r2 = this;
                long r0 = org.luckypray.dexkit.DexKitBridge.access$nativeInitDexKitByBytesArray(r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final long nativeInitDexKitByClassLoader(java.lang.ClassLoader r3, boolean r4) {
                r2 = this;
                long r0 = org.luckypray.dexkit.DexKitBridge.access$nativeInitDexKitByClassLoader(r3, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        private final void nativeInitFullCache(long r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeInitFullCache(r1)
                return
        }

        @kotlin.jvm.JvmStatic
        private final void nativeRelease(long r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeRelease(r1)
                return
        }

        @kotlin.jvm.JvmStatic
        private final void nativeSetThreadNum(long r1, int r3) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeSetThreadNum(r1, r3)
                return
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.DexKitBridge create(java.lang.ClassLoader r3, boolean r4) {
                r2 = this;
                java.lang.String r0 = "loader"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                org.luckypray.dexkit.DexKitBridge r0 = new org.luckypray.dexkit.DexKitBridge
                r1 = 0
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.DexKitBridge create(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "apkPath"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                org.luckypray.dexkit.DexKitBridge r0 = new org.luckypray.dexkit.DexKitBridge
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.DexKitBridge create(byte[][] r3) {
                r2 = this;
                java.lang.String r0 = "dexBytesArray"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                org.luckypray.dexkit.DexKitBridge r0 = new org.luckypray.dexkit.DexKitBridge
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = new org.luckypray.dexkit.DexKitBridge$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.DexKitBridge.Companion = r0
            return
    }

    private DexKitBridge(java.lang.ClassLoader r3, boolean r4) {
            r2 = this;
            r2.<init>()
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitDexKitByClassLoader(r0, r3, r4)
            r2.token = r0
            return
    }

    public /* synthetic */ DexKitBridge(java.lang.ClassLoader r1, boolean r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private DexKitBridge(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitDexKit(r0, r3)
            r2.token = r0
            return
    }

    public /* synthetic */ DexKitBridge(java.lang.String r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private DexKitBridge(byte[][] r3) {
            r2 = this;
            r2.<init>()
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitDexKitByBytesArray(r0, r3)
            r2.token = r0
            return
    }

    public /* synthetic */ DexKitBridge(byte[][] r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ long access$getSafeToken(org.luckypray.dexkit.DexKitBridge r2) {
            long r0 = r2.getSafeToken()
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeBatchFindClassUsingStrings(long r1, byte[] r3) {
            byte[] r0 = nativeBatchFindClassUsingStrings(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeBatchFindMethodUsingStrings(long r1, byte[] r3) {
            byte[] r0 = nativeBatchFindMethodUsingStrings(r1, r3)
            return r0
    }

    public static final /* synthetic */ void access$nativeExportDexFile(long r0, java.lang.String r2) {
            nativeExportDexFile(r0, r2)
            return
    }

    public static final /* synthetic */ byte[] access$nativeFieldGetMethods(long r1, long r3) {
            byte[] r0 = nativeFieldGetMethods(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFieldPutMethods(long r1, long r3) {
            byte[] r0 = nativeFieldPutMethods(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFindClass(long r1, byte[] r3) {
            byte[] r0 = nativeFindClass(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFindField(long r1, byte[] r3) {
            byte[] r0 = nativeFindField(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFindMethod(long r1, byte[] r3) {
            byte[] r0 = nativeFindMethod(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetCallMethods(long r1, long r3) {
            byte[] r0 = nativeGetCallMethods(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetClassAnnotations(long r1, long r3) {
            byte[] r0 = nativeGetClassAnnotations(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetClassByIds(long r1, long[] r3) {
            byte[] r0 = nativeGetClassByIds(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetClassData(long r1, java.lang.String r3) {
            byte[] r0 = nativeGetClassData(r1, r3)
            return r0
    }

    public static final /* synthetic */ int access$nativeGetDexNum(long r1) {
            int r0 = nativeGetDexNum(r1)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldAnnotations(long r1, long r3) {
            byte[] r0 = nativeGetFieldAnnotations(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldByIds(long r1, long[] r3) {
            byte[] r0 = nativeGetFieldByIds(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldData(long r1, java.lang.String r3) {
            byte[] r0 = nativeGetFieldData(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetInvokeMethods(long r1, long r3) {
            byte[] r0 = nativeGetInvokeMethods(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodAnnotations(long r1, long r3) {
            byte[] r0 = nativeGetMethodAnnotations(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodByIds(long r1, long[] r3) {
            byte[] r0 = nativeGetMethodByIds(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodData(long r1, java.lang.String r3) {
            byte[] r0 = nativeGetMethodData(r1, r3)
            return r0
    }

    public static final /* synthetic */ int[] access$nativeGetMethodOpCodes(long r1, long r3) {
            int[] r0 = nativeGetMethodOpCodes(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodUsingFields(long r1, long r3) {
            byte[] r0 = nativeGetMethodUsingFields(r1, r3)
            return r0
    }

    public static final /* synthetic */ java.lang.String[] access$nativeGetMethodUsingStrings(long r1, long r3) {
            java.lang.String[] r0 = nativeGetMethodUsingStrings(r1, r3)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetParameterAnnotations(long r1, long r3) {
            byte[] r0 = nativeGetParameterAnnotations(r1, r3)
            return r0
    }

    public static final /* synthetic */ java.lang.String[] access$nativeGetParameterNames(long r1, long r3) {
            java.lang.String[] r0 = nativeGetParameterNames(r1, r3)
            return r0
    }

    public static final /* synthetic */ long access$nativeInitDexKit(java.lang.String r2) {
            long r0 = nativeInitDexKit(r2)
            return r0
    }

    public static final /* synthetic */ long access$nativeInitDexKitByBytesArray(byte[][] r2) {
            long r0 = nativeInitDexKitByBytesArray(r2)
            return r0
    }

    public static final /* synthetic */ long access$nativeInitDexKitByClassLoader(java.lang.ClassLoader r2, boolean r3) {
            long r0 = nativeInitDexKitByClassLoader(r2, r3)
            return r0
    }

    public static final /* synthetic */ void access$nativeInitFullCache(long r0) {
            nativeInitFullCache(r0)
            return
    }

    public static final /* synthetic */ void access$nativeRelease(long r0) {
            nativeRelease(r0)
            return
    }

    public static final /* synthetic */ void access$nativeSetThreadNum(long r0, int r2) {
            nativeSetThreadNum(r0, r2)
            return
    }

    private final java.util.Map<java.lang.String, org.luckypray.dexkit.result.ClassDataList> batchFindClassUsingStrings(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.BatchFindClassUsingStrings, kotlin.Unit> r2) {
            r1 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindClassUsingStrings
            r0.<init>()
            r2.invoke(r0)
            java.util.Map r0 = r1.batchFindClassUsingStrings(r0)
            return r0
    }

    private final java.util.Map<java.lang.String, org.luckypray.dexkit.result.ClassDataList> batchFindClassUsingStrings$dexkit_android_release(com.google.flatbuffers.FlatBufferBuilder r13) {
            r12 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r12)
            byte[] r3 = r13.sizedByteArray()
            java.lang.String r4 = "fbb.sizedByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeBatchFindClassUsingStrings(r0, r1, r3)
            org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.BatchClassMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder r1 = r1.getRootAsBatchClassMetaArrayHolder(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            int r4 = r1.getItemsLength()
        L31:
            if (r3 >= r4) goto L7f
            org.luckypray.dexkit.schema.-BatchClassMeta r5 = r1.items(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.lang.String r6 = r5.getUnionKey()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.ClassDataList r7 = new org.luckypray.dexkit.result.ClassDataList
            r7.<init>()
            r8 = 0
            int r9 = r5.getClassesLength()
        L4b:
            if (r8 >= r9) goto L60
            org.luckypray.dexkit.result.ClassData$-Companion r10 = org.luckypray.dexkit.result.ClassData.f429Companion
            org.luckypray.dexkit.schema.-ClassMeta r11 = r5.classes(r8)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            org.luckypray.dexkit.result.ClassData r10 = r10.from(r12, r11)
            r7.add(r10)
            int r8 = r8 + 1
            goto L4b
        L60:
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            r9 = 0
            int r10 = r8.size()
            r11 = 1
            if (r10 <= r11) goto L75
            org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1 r10 = new org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1
            r10.<init>()
            java.util.Comparator r10 = (java.util.Comparator) r10
            kotlin.collections.CollectionsKt.sortWith(r8, r10)
        L75:
            r8 = r2
            java.util.Map r8 = (java.util.Map) r8
            r8.put(r6, r7)
            int r3 = r3 + 1
            goto L31
        L7f:
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            return r3
    }

    private final java.util.Map<java.lang.String, org.luckypray.dexkit.result.MethodDataList> batchFindMethodUsingStrings(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.BatchFindMethodUsingStrings, kotlin.Unit> r2) {
            r1 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindMethodUsingStrings
            r0.<init>()
            r2.invoke(r0)
            java.util.Map r0 = r1.batchFindMethodUsingStrings(r0)
            return r0
    }

    private final java.util.Map<java.lang.String, org.luckypray.dexkit.result.MethodDataList> batchFindMethodUsingStrings$dexkit_android_release(com.google.flatbuffers.FlatBufferBuilder r13) {
            r12 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r12)
            byte[] r3 = r13.sizedByteArray()
            java.lang.String r4 = "fbb.sizedByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeBatchFindMethodUsingStrings(r0, r1, r3)
            org.luckypray.dexkit.schema.-BatchMethodMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.BatchMethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-BatchMethodMetaArrayHolder r1 = r1.getRootAsBatchMethodMetaArrayHolder(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            int r4 = r1.getItemsLength()
        L31:
            if (r3 >= r4) goto L7f
            org.luckypray.dexkit.schema.-BatchMethodMeta r5 = r1.items(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.lang.String r6 = r5.getUnionKey()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.MethodDataList r7 = new org.luckypray.dexkit.result.MethodDataList
            r7.<init>()
            r8 = 0
            int r9 = r5.getMethodsLength()
        L4b:
            if (r8 >= r9) goto L60
            org.luckypray.dexkit.result.MethodData$-Companion r10 = org.luckypray.dexkit.result.MethodData.f431Companion
            org.luckypray.dexkit.schema.-MethodMeta r11 = r5.methods(r8)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            org.luckypray.dexkit.result.MethodData r10 = r10.from(r12, r11)
            r7.add(r10)
            int r8 = r8 + 1
            goto L4b
        L60:
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            r9 = 0
            int r10 = r8.size()
            r11 = 1
            if (r10 <= r11) goto L75
            org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1 r10 = new org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1
            r10.<init>()
            java.util.Comparator r10 = (java.util.Comparator) r10
            kotlin.collections.CollectionsKt.sortWith(r8, r10)
        L75:
            r8 = r2
            java.util.Map r8 = (java.util.Map) r8
            r8.put(r6, r7)
            int r3 = r3 + 1
            goto L31
        L7f:
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            return r3
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.DexKitBridge create(java.lang.ClassLoader r1, boolean r2) {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r0 = r0.create(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.DexKitBridge create(java.lang.String r1) {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r0 = r0.create(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.DexKitBridge create(byte[][] r1) {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r0 = r0.create(r1)
            return r0
    }

    private final org.luckypray.dexkit.result.ClassDataList findClass(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.FindClass, kotlin.Unit> r2) {
            r1 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
            r0.<init>()
            r2.invoke(r0)
            org.luckypray.dexkit.result.ClassDataList r0 = r1.findClass(r0)
            return r0
    }

    private final org.luckypray.dexkit.result.ClassDataList findClass$dexkit_android_release(com.google.flatbuffers.FlatBufferBuilder r8) {
            r7 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r3 = r8.sizedByteArray()
            java.lang.String r4 = "fbb.sizedByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeFindClass(r0, r1, r3)
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.ClassMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder r1 = r1.getRootAsClassMetaArrayHolder(r2)
            org.luckypray.dexkit.result.ClassDataList r2 = new org.luckypray.dexkit.result.ClassDataList
            r2.<init>()
            r3 = 0
            int r4 = r1.getClassesLength()
        L31:
            if (r3 >= r4) goto L46
            org.luckypray.dexkit.result.ClassData$-Companion r5 = org.luckypray.dexkit.result.ClassData.f429Companion
            org.luckypray.dexkit.schema.-ClassMeta r6 = r1.classes(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.ClassData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L31
        L46:
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r5 = r3.size()
            r6 = 1
            if (r5 <= r6) goto L5b
            org.luckypray.dexkit.DexKitBridge$findClass$$inlined$sortBy$1 r5 = new org.luckypray.dexkit.DexKitBridge$findClass$$inlined$sortBy$1
            r5.<init>()
            java.util.Comparator r5 = (java.util.Comparator) r5
            kotlin.collections.CollectionsKt.sortWith(r3, r5)
        L5b:
            return r2
    }

    private final org.luckypray.dexkit.result.FieldDataList findField(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.FindField, kotlin.Unit> r2) {
            r1 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
            r0.<init>()
            r2.invoke(r0)
            org.luckypray.dexkit.result.FieldDataList r0 = r1.findField(r0)
            return r0
    }

    private final org.luckypray.dexkit.result.FieldDataList findField$dexkit_android_release(com.google.flatbuffers.FlatBufferBuilder r8) {
            r7 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r3 = r8.sizedByteArray()
            java.lang.String r4 = "fbb.sizedByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeFindField(r0, r1, r3)
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.FieldMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder r1 = r1.getRootAsFieldMetaArrayHolder(r2)
            org.luckypray.dexkit.result.FieldDataList r2 = new org.luckypray.dexkit.result.FieldDataList
            r2.<init>()
            r3 = 0
            int r4 = r1.getFieldsLength()
        L31:
            if (r3 >= r4) goto L46
            org.luckypray.dexkit.result.FieldData$-Companion r5 = org.luckypray.dexkit.result.FieldData.f430Companion
            org.luckypray.dexkit.schema.-FieldMeta r6 = r1.fields(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.FieldData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L31
        L46:
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r5 = r3.size()
            r6 = 1
            if (r5 <= r6) goto L5b
            org.luckypray.dexkit.DexKitBridge$findField$$inlined$sortBy$1 r5 = new org.luckypray.dexkit.DexKitBridge$findField$$inlined$sortBy$1
            r5.<init>()
            java.util.Comparator r5 = (java.util.Comparator) r5
            kotlin.collections.CollectionsKt.sortWith(r3, r5)
        L5b:
            return r2
    }

    private final org.luckypray.dexkit.result.MethodDataList findMethod(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.FindMethod, kotlin.Unit> r2) {
            r1 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
            r0.<init>()
            r2.invoke(r0)
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)
            return r0
    }

    private final org.luckypray.dexkit.result.MethodDataList findMethod$dexkit_android_release(com.google.flatbuffers.FlatBufferBuilder r8) {
            r7 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r3 = r8.sizedByteArray()
            java.lang.String r4 = "fbb.sizedByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeFindMethod(r0, r1, r3)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r1 = r1.getRootAsMethodMetaArrayHolder(r2)
            org.luckypray.dexkit.result.MethodDataList r2 = new org.luckypray.dexkit.result.MethodDataList
            r2.<init>()
            r3 = 0
            int r4 = r1.getMethodsLength()
        L31:
            if (r3 >= r4) goto L46
            org.luckypray.dexkit.result.MethodData$-Companion r5 = org.luckypray.dexkit.result.MethodData.f431Companion
            org.luckypray.dexkit.schema.-MethodMeta r6 = r1.methods(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.MethodData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L31
        L46:
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r5 = r3.size()
            r6 = 1
            if (r5 <= r6) goto L5b
            org.luckypray.dexkit.DexKitBridge$findMethod$$inlined$sortBy$1 r5 = new org.luckypray.dexkit.DexKitBridge$findMethod$$inlined$sortBy$1
            r5.<init>()
            java.util.Comparator r5 = (java.util.Comparator) r5
            kotlin.collections.CollectionsKt.sortWith(r3, r5)
        L5b:
            return r2
    }

    private final org.luckypray.dexkit.result.MethodDataList getCallMethods$dexkit_android_release(long r8) {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetCallMethods(r0, r1, r8)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r1 = r1.getRootAsMethodMetaArrayHolder(r2)
            org.luckypray.dexkit.result.MethodDataList r2 = new org.luckypray.dexkit.result.MethodDataList
            r2.<init>()
            r3 = 0
            int r4 = r1.getMethodsLength()
        L23:
            if (r3 >= r4) goto L38
            org.luckypray.dexkit.result.MethodData$-Companion r5 = org.luckypray.dexkit.result.MethodData.f431Companion
            org.luckypray.dexkit.schema.-MethodMeta r6 = r1.methods(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.MethodData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L23
        L38:
            return r2
    }

    private final java.util.List<org.luckypray.dexkit.result.AnnotationData> getClassAnnotations$dexkit_android_release(long r8) {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetClassAnnotations(r0, r1, r8)
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.AnnotationMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r1 = r1.getRootAsAnnotationMetaArrayHolder(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            int r4 = r1.getAnnotationsLength()
        L25:
            if (r3 >= r4) goto L3a
            org.luckypray.dexkit.result.AnnotationData$-Companion r5 = org.luckypray.dexkit.result.AnnotationData.f425Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r6 = r1.annotations(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.AnnotationData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L25
        L3a:
            return r2
    }

    private final java.util.List<org.luckypray.dexkit.result.AnnotationData> getFieldAnnotations$dexkit_android_release(long r8) {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetFieldAnnotations(r0, r1, r8)
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.AnnotationMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r1 = r1.getRootAsAnnotationMetaArrayHolder(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            int r4 = r1.getAnnotationsLength()
        L25:
            if (r3 >= r4) goto L3a
            org.luckypray.dexkit.result.AnnotationData$-Companion r5 = org.luckypray.dexkit.result.AnnotationData.f425Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r6 = r1.annotations(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.AnnotationData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L25
        L3a:
            return r2
    }

    private final org.luckypray.dexkit.result.FieldDataList getFieldByIds$dexkit_android_release(long[] r8) {
            r7 = this;
            java.lang.String r0 = "encodeIdArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetFieldByIds(r0, r1, r8)
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.FieldMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder r1 = r1.getRootAsFieldMetaArrayHolder(r2)
            org.luckypray.dexkit.result.FieldDataList r2 = new org.luckypray.dexkit.result.FieldDataList
            r2.<init>()
            r3 = 0
            int r4 = r1.getFieldsLength()
        L28:
            if (r3 >= r4) goto L3d
            org.luckypray.dexkit.result.FieldData$-Companion r5 = org.luckypray.dexkit.result.FieldData.f430Companion
            org.luckypray.dexkit.schema.-FieldMeta r6 = r1.fields(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.FieldData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L28
        L3d:
            return r2
    }

    private final org.luckypray.dexkit.result.MethodDataList getInvokeMethods$dexkit_android_release(long r8) {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetInvokeMethods(r0, r1, r8)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r1 = r1.getRootAsMethodMetaArrayHolder(r2)
            org.luckypray.dexkit.result.MethodDataList r2 = new org.luckypray.dexkit.result.MethodDataList
            r2.<init>()
            r3 = 0
            int r4 = r1.getMethodsLength()
        L23:
            if (r3 >= r4) goto L38
            org.luckypray.dexkit.result.MethodData$-Companion r5 = org.luckypray.dexkit.result.MethodData.f431Companion
            org.luckypray.dexkit.schema.-MethodMeta r6 = r1.methods(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.MethodData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L23
        L38:
            return r2
    }

    private final java.util.List<org.luckypray.dexkit.result.AnnotationData> getMethodAnnotations$dexkit_android_release(long r8) {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetMethodAnnotations(r0, r1, r8)
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.AnnotationMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r1 = r1.getRootAsAnnotationMetaArrayHolder(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            int r4 = r1.getAnnotationsLength()
        L25:
            if (r3 >= r4) goto L3a
            org.luckypray.dexkit.result.AnnotationData$-Companion r5 = org.luckypray.dexkit.result.AnnotationData.f425Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r6 = r1.annotations(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.AnnotationData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L25
        L3a:
            return r2
    }

    private final org.luckypray.dexkit.result.MethodDataList getMethodByIds$dexkit_android_release(long[] r8) {
            r7 = this;
            java.lang.String r0 = "encodeIdArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetMethodByIds(r0, r1, r8)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r1 = r1.getRootAsMethodMetaArrayHolder(r2)
            org.luckypray.dexkit.result.MethodDataList r2 = new org.luckypray.dexkit.result.MethodDataList
            r2.<init>()
            r3 = 0
            int r4 = r1.getMethodsLength()
        L28:
            if (r3 >= r4) goto L3d
            org.luckypray.dexkit.result.MethodData$-Companion r5 = org.luckypray.dexkit.result.MethodData.f431Companion
            org.luckypray.dexkit.schema.-MethodMeta r6 = r1.methods(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.MethodData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L28
        L3d:
            return r2
    }

    private final java.util.List<java.lang.Integer> getMethodOpCodes$dexkit_android_release(long r4) {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            int[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetMethodOpCodes(r0, r1, r4)
            java.util.List r0 = kotlin.collections.ArraysKt.toList(r0)
            return r0
    }

    private final java.util.List<org.luckypray.dexkit.result.UsingFieldData> getMethodUsingFields$dexkit_android_release(long r8) {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetMethodUsingFields(r0, r1, r8)
            org.luckypray.dexkit.schema.-UsingFieldMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.UsingFieldMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-UsingFieldMetaArrayHolder r1 = r1.getRootAsUsingFieldMetaArrayHolder(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            int r4 = r1.getItemsLength()
        L25:
            if (r3 >= r4) goto L3a
            org.luckypray.dexkit.result.UsingFieldData$-Companion r5 = org.luckypray.dexkit.result.UsingFieldData.f432Companion
            org.luckypray.dexkit.schema.-UsingFieldMeta r6 = r1.items(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.UsingFieldData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L25
        L3a:
            return r2
    }

    private final java.util.List<java.lang.String> getMethodUsingStrings$dexkit_android_release(long r4) {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            java.lang.String[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetMethodUsingStrings(r0, r1, r4)
            java.util.List r0 = kotlin.collections.ArraysKt.toList(r0)
            return r0
    }

    private final java.util.List<java.util.List<org.luckypray.dexkit.result.AnnotationData>> getParameterAnnotations$dexkit_android_release(long r12) {
            r11 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r11)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetParameterAnnotations(r0, r1, r12)
            org.luckypray.dexkit.schema.-ParametersAnnotationMetaArrayHoler$Companion r1 = org.luckypray.dexkit.schema.ParametersAnnotationMetaArrayHoler.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-ParametersAnnotationMetaArrayHoler r1 = r1.getRootAsParametersAnnotationMetaArrayHoler(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            int r4 = r1.getAnnotationsArrayLength()
        L25:
            if (r3 >= r4) goto L55
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r5 = r1.annotationsArray(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            r7 = 0
            int r8 = r5.getAnnotationsLength()
        L3a:
            if (r7 >= r8) goto L4f
            org.luckypray.dexkit.result.AnnotationData$-Companion r9 = org.luckypray.dexkit.result.AnnotationData.f425Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r10 = r5.annotations(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            org.luckypray.dexkit.result.AnnotationData r9 = r9.from(r11, r10)
            r6.add(r9)
            int r7 = r7 + 1
            goto L3a
        L4f:
            r2.add(r6)
            int r3 = r3 + 1
            goto L25
        L55:
            return r2
    }

    private final java.util.List<java.lang.String> getParameterNames$dexkit_android_release(long r11) {
            r10 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r10)
            java.lang.String[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetParameterNames(r0, r1, r11)
            if (r0 == 0) goto L2c
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.length
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            int r5 = r3.length
            r6 = 0
        L19:
            if (r6 >= r5) goto L27
            r7 = r3[r6]
            r8 = r7
            r9 = 0
            r2.add(r8)
            int r6 = r6 + 1
            goto L19
        L27:
            java.util.List r2 = (java.util.List) r2
            goto L2d
        L2c:
            r2 = 0
        L2d:
            return r2
    }

    private final long getSafeToken() {
            r4 = this;
            long r0 = r4.token
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            long r0 = r4.token
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DexKitBridge is not valid"
            r0.<init>(r1)
            throw r0
    }

    private final org.luckypray.dexkit.result.ClassDataList getTypeByIds$dexkit_android_release(long[] r8) {
            r7 = this;
            java.lang.String r0 = "encodeIdArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetClassByIds(r0, r1, r8)
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.ClassMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder r1 = r1.getRootAsClassMetaArrayHolder(r2)
            org.luckypray.dexkit.result.ClassDataList r2 = new org.luckypray.dexkit.result.ClassDataList
            r2.<init>()
            r3 = 0
            int r4 = r1.getClassesLength()
        L28:
            if (r3 >= r4) goto L3d
            org.luckypray.dexkit.result.ClassData$-Companion r5 = org.luckypray.dexkit.result.ClassData.f429Companion
            org.luckypray.dexkit.schema.-ClassMeta r6 = r1.classes(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.ClassData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L28
        L3d:
            return r2
    }

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeBatchFindClassUsingStrings(long r0, byte[] r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeBatchFindMethodUsingStrings(long r0, byte[] r2);

    @kotlin.jvm.JvmStatic
    private static final native void nativeExportDexFile(long r0, java.lang.String r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeFieldGetMethods(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeFieldPutMethods(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeFindClass(long r0, byte[] r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeFindField(long r0, byte[] r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeFindMethod(long r0, byte[] r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetCallMethods(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetClassAnnotations(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetClassByIds(long r0, long[] r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetClassData(long r0, java.lang.String r2);

    @kotlin.jvm.JvmStatic
    private static final native int nativeGetDexNum(long r0);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetFieldAnnotations(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetFieldByIds(long r0, long[] r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetFieldData(long r0, java.lang.String r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetInvokeMethods(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetMethodAnnotations(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetMethodByIds(long r0, long[] r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetMethodData(long r0, java.lang.String r2);

    @kotlin.jvm.JvmStatic
    private static final native int[] nativeGetMethodOpCodes(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetMethodUsingFields(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native java.lang.String[] nativeGetMethodUsingStrings(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native byte[] nativeGetParameterAnnotations(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native java.lang.String[] nativeGetParameterNames(long r0, long r2);

    @kotlin.jvm.JvmStatic
    private static final native long nativeInitDexKit(java.lang.String r0);

    @kotlin.jvm.JvmStatic
    private static final native long nativeInitDexKitByBytesArray(byte[][] r0);

    @kotlin.jvm.JvmStatic
    private static final native long nativeInitDexKitByClassLoader(java.lang.ClassLoader r0, boolean r1);

    @kotlin.jvm.JvmStatic
    private static final native void nativeInitFullCache(long r0);

    @kotlin.jvm.JvmStatic
    private static final native void nativeRelease(long r0);

    @kotlin.jvm.JvmStatic
    private static final native void nativeSetThreadNum(long r0, int r2);

    private final org.luckypray.dexkit.result.MethodDataList readFieldMethods$dexkit_android_release(long r8) {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeFieldGetMethods(r0, r1, r8)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r1 = r1.getRootAsMethodMetaArrayHolder(r2)
            org.luckypray.dexkit.result.MethodDataList r2 = new org.luckypray.dexkit.result.MethodDataList
            r2.<init>()
            r3 = 0
            int r4 = r1.getMethodsLength()
        L23:
            if (r3 >= r4) goto L38
            org.luckypray.dexkit.result.MethodData$-Companion r5 = org.luckypray.dexkit.result.MethodData.f431Companion
            org.luckypray.dexkit.schema.-MethodMeta r6 = r1.methods(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.MethodData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L23
        L38:
            return r2
    }

    private final org.luckypray.dexkit.result.MethodDataList writeFieldMethods$dexkit_android_release(long r8) {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r7)
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeFieldPutMethods(r0, r1, r8)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r1 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r1 = r1.getRootAsMethodMetaArrayHolder(r2)
            org.luckypray.dexkit.result.MethodDataList r2 = new org.luckypray.dexkit.result.MethodDataList
            r2.<init>()
            r3 = 0
            int r4 = r1.getMethodsLength()
        L23:
            if (r3 >= r4) goto L38
            org.luckypray.dexkit.result.MethodData$-Companion r5 = org.luckypray.dexkit.result.MethodData.f431Companion
            org.luckypray.dexkit.schema.-MethodMeta r6 = r1.methods(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.MethodData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r3 = r3 + 1
            goto L23
        L38:
            return r2
    }

    public final java.util.Map<java.lang.String, org.luckypray.dexkit.result.ClassDataList> batchFindClassUsingStrings(org.luckypray.dexkit.query.BatchFindClassUsingStrings r14) {
            r13 = this;
            java.lang.String r0 = "batchFind"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            com.google.flatbuffers.FlatBufferBuilder r0 = new com.google.flatbuffers.FlatBufferBuilder
            r0.<init>()
            r1 = r14
            org.luckypray.dexkit.query.base.BaseQuery r1 = (org.luckypray.dexkit.query.base.BaseQuery) r1
            org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r1, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r1 = org.luckypray.dexkit.DexKitBridge.Companion
            long r2 = access$getSafeToken(r13)
            byte[] r4 = r0.sizedByteArray()
            java.lang.String r5 = "fbb.sizedByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            byte[] r1 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeBatchFindClassUsingStrings(r1, r2, r4)
            org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder$Companion r2 = org.luckypray.dexkit.schema.BatchClassMetaArrayHolder.Companion
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder r1 = r2.getRootAsBatchClassMetaArrayHolder(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r3 = r1.getItemsLength()
            r4 = 0
            r5 = r4
        L3d:
            if (r5 >= r3) goto L89
            org.luckypray.dexkit.schema.-BatchClassMeta r6 = r1.items(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.String r7 = r6.getUnionKey()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            org.luckypray.dexkit.result.ClassDataList r8 = new org.luckypray.dexkit.result.ClassDataList
            r8.<init>()
            int r9 = r6.getClassesLength()
            r10 = r4
        L57:
            if (r10 >= r9) goto L6c
            org.luckypray.dexkit.result.ClassData$-Companion r11 = org.luckypray.dexkit.result.ClassData.f429Companion
            org.luckypray.dexkit.schema.-ClassMeta r12 = r6.classes(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
            org.luckypray.dexkit.result.ClassData r11 = r11.from(r13, r12)
            r8.add(r11)
            int r10 = r10 + 1
            goto L57
        L6c:
            r6 = r8
            java.util.List r6 = (java.util.List) r6
            int r9 = r6.size()
            r10 = 1
            if (r9 <= r10) goto L80
            org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1 r9 = new org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1
            r9.<init>()
            java.util.Comparator r9 = (java.util.Comparator) r9
            kotlin.collections.CollectionsKt.sortWith(r6, r9)
        L80:
            r6 = r2
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r7, r8)
            int r5 = r5 + 1
            goto L3d
        L89:
            java.util.Map r2 = (java.util.Map) r2
            return r2
    }

    public final java.util.Map<java.lang.String, org.luckypray.dexkit.result.MethodDataList> batchFindMethodUsingStrings(org.luckypray.dexkit.query.BatchFindMethodUsingStrings r14) {
            r13 = this;
            java.lang.String r0 = "batchFind"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            com.google.flatbuffers.FlatBufferBuilder r0 = new com.google.flatbuffers.FlatBufferBuilder
            r0.<init>()
            r1 = r14
            org.luckypray.dexkit.query.base.BaseQuery r1 = (org.luckypray.dexkit.query.base.BaseQuery) r1
            org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r1, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r1 = org.luckypray.dexkit.DexKitBridge.Companion
            long r2 = access$getSafeToken(r13)
            byte[] r4 = r0.sizedByteArray()
            java.lang.String r5 = "fbb.sizedByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            byte[] r1 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeBatchFindMethodUsingStrings(r1, r2, r4)
            org.luckypray.dexkit.schema.-BatchMethodMetaArrayHolder$Companion r2 = org.luckypray.dexkit.schema.BatchMethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            org.luckypray.dexkit.schema.-BatchMethodMetaArrayHolder r1 = r2.getRootAsBatchMethodMetaArrayHolder(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r3 = r1.getItemsLength()
            r4 = 0
            r5 = r4
        L3d:
            if (r5 >= r3) goto L89
            org.luckypray.dexkit.schema.-BatchMethodMeta r6 = r1.items(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.String r7 = r6.getUnionKey()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            org.luckypray.dexkit.result.MethodDataList r8 = new org.luckypray.dexkit.result.MethodDataList
            r8.<init>()
            int r9 = r6.getMethodsLength()
            r10 = r4
        L57:
            if (r10 >= r9) goto L6c
            org.luckypray.dexkit.result.MethodData$-Companion r11 = org.luckypray.dexkit.result.MethodData.f431Companion
            org.luckypray.dexkit.schema.-MethodMeta r12 = r6.methods(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
            org.luckypray.dexkit.result.MethodData r11 = r11.from(r13, r12)
            r8.add(r11)
            int r10 = r10 + 1
            goto L57
        L6c:
            r6 = r8
            java.util.List r6 = (java.util.List) r6
            int r9 = r6.size()
            r10 = 1
            if (r9 <= r10) goto L80
            org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1 r9 = new org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1
            r9.<init>()
            java.util.Comparator r9 = (java.util.Comparator) r9
            kotlin.collections.CollectionsKt.sortWith(r6, r9)
        L80:
            r6 = r2
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r7, r8)
            int r5 = r5 + 1
            goto L3d
        L89:
            java.util.Map r2 = (java.util.Map) r2
            return r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L12
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion     // Catch: java.lang.Throwable -> L14
            long r1 = r3.token     // Catch: java.lang.Throwable -> L14
            org.luckypray.dexkit.DexKitBridge.Companion.access$nativeRelease(r0, r1)     // Catch: java.lang.Throwable -> L14
            r0 = 0
            r3.token = r0     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r3)
            return
        L14:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    public final void exportDexFile(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "outPath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.getSafeToken()
            org.luckypray.dexkit.DexKitBridge.Companion.access$nativeExportDexFile(r0, r1, r4)
            return
    }

    protected final void finalize() {
            r0 = this;
            r0.close()
            return
    }

    public final org.luckypray.dexkit.result.ClassDataList findClass(org.luckypray.dexkit.query.FindClass r8) {
            r7 = this;
            java.lang.String r0 = "findClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.google.flatbuffers.FlatBufferBuilder r0 = new com.google.flatbuffers.FlatBufferBuilder
            r0.<init>()
            r1 = r8
            org.luckypray.dexkit.query.base.BaseQuery r1 = (org.luckypray.dexkit.query.base.BaseQuery) r1
            org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r1, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r1 = org.luckypray.dexkit.DexKitBridge.Companion
            long r2 = access$getSafeToken(r7)
            byte[] r4 = r0.sizedByteArray()
            java.lang.String r5 = "fbb.sizedByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            byte[] r1 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeFindClass(r1, r2, r4)
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder$Companion r2 = org.luckypray.dexkit.schema.ClassMetaArrayHolder.Companion
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder r1 = r2.getRootAsClassMetaArrayHolder(r1)
            org.luckypray.dexkit.result.ClassDataList r2 = new org.luckypray.dexkit.result.ClassDataList
            r2.<init>()
            int r3 = r1.getClassesLength()
            r4 = 0
        L3c:
            if (r4 >= r3) goto L51
            org.luckypray.dexkit.result.ClassData$-Companion r5 = org.luckypray.dexkit.result.ClassData.f429Companion
            org.luckypray.dexkit.schema.-ClassMeta r6 = r1.classes(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.ClassData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r4 = r4 + 1
            goto L3c
        L51:
            r1 = r2
            java.util.List r1 = (java.util.List) r1
            int r3 = r1.size()
            r4 = 1
            if (r3 <= r4) goto L65
            org.luckypray.dexkit.DexKitBridge$findClass$$inlined$sortBy$1 r3 = new org.luckypray.dexkit.DexKitBridge$findClass$$inlined$sortBy$1
            r3.<init>()
            java.util.Comparator r3 = (java.util.Comparator) r3
            kotlin.collections.CollectionsKt.sortWith(r1, r3)
        L65:
            return r2
    }

    public final org.luckypray.dexkit.result.FieldDataList findField(org.luckypray.dexkit.query.FindField r8) {
            r7 = this;
            java.lang.String r0 = "findField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.google.flatbuffers.FlatBufferBuilder r0 = new com.google.flatbuffers.FlatBufferBuilder
            r0.<init>()
            r1 = r8
            org.luckypray.dexkit.query.base.BaseQuery r1 = (org.luckypray.dexkit.query.base.BaseQuery) r1
            org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r1, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r1 = org.luckypray.dexkit.DexKitBridge.Companion
            long r2 = access$getSafeToken(r7)
            byte[] r4 = r0.sizedByteArray()
            java.lang.String r5 = "fbb.sizedByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            byte[] r1 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeFindField(r1, r2, r4)
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder$Companion r2 = org.luckypray.dexkit.schema.FieldMetaArrayHolder.Companion
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder r1 = r2.getRootAsFieldMetaArrayHolder(r1)
            org.luckypray.dexkit.result.FieldDataList r2 = new org.luckypray.dexkit.result.FieldDataList
            r2.<init>()
            int r3 = r1.getFieldsLength()
            r4 = 0
        L3c:
            if (r4 >= r3) goto L51
            org.luckypray.dexkit.result.FieldData$-Companion r5 = org.luckypray.dexkit.result.FieldData.f430Companion
            org.luckypray.dexkit.schema.-FieldMeta r6 = r1.fields(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.FieldData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r4 = r4 + 1
            goto L3c
        L51:
            r1 = r2
            java.util.List r1 = (java.util.List) r1
            int r3 = r1.size()
            r4 = 1
            if (r3 <= r4) goto L65
            org.luckypray.dexkit.DexKitBridge$findField$$inlined$sortBy$1 r3 = new org.luckypray.dexkit.DexKitBridge$findField$$inlined$sortBy$1
            r3.<init>()
            java.util.Comparator r3 = (java.util.Comparator) r3
            kotlin.collections.CollectionsKt.sortWith(r1, r3)
        L65:
            return r2
    }

    public final org.luckypray.dexkit.result.MethodDataList findMethod(org.luckypray.dexkit.query.FindMethod r8) {
            r7 = this;
            java.lang.String r0 = "findMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.google.flatbuffers.FlatBufferBuilder r0 = new com.google.flatbuffers.FlatBufferBuilder
            r0.<init>()
            r1 = r8
            org.luckypray.dexkit.query.base.BaseQuery r1 = (org.luckypray.dexkit.query.base.BaseQuery) r1
            org.luckypray.dexkit.query.base.BaseQuery.access$innerBuild(r1, r0)
            org.luckypray.dexkit.DexKitBridge$Companion r1 = org.luckypray.dexkit.DexKitBridge.Companion
            long r2 = access$getSafeToken(r7)
            byte[] r4 = r0.sizedByteArray()
            java.lang.String r5 = "fbb.sizedByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            byte[] r1 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeFindMethod(r1, r2, r4)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r2 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r3 = "wrap(res)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r1 = r2.getRootAsMethodMetaArrayHolder(r1)
            org.luckypray.dexkit.result.MethodDataList r2 = new org.luckypray.dexkit.result.MethodDataList
            r2.<init>()
            int r3 = r1.getMethodsLength()
            r4 = 0
        L3c:
            if (r4 >= r3) goto L51
            org.luckypray.dexkit.result.MethodData$-Companion r5 = org.luckypray.dexkit.result.MethodData.f431Companion
            org.luckypray.dexkit.schema.-MethodMeta r6 = r1.methods(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            org.luckypray.dexkit.result.MethodData r5 = r5.from(r7, r6)
            r2.add(r5)
            int r4 = r4 + 1
            goto L3c
        L51:
            r1 = r2
            java.util.List r1 = (java.util.List) r1
            int r3 = r1.size()
            r4 = 1
            if (r3 <= r4) goto L65
            org.luckypray.dexkit.DexKitBridge$findMethod$$inlined$sortBy$1 r3 = new org.luckypray.dexkit.DexKitBridge$findMethod$$inlined$sortBy$1
            r3.<init>()
            java.util.Comparator r3 = (java.util.Comparator) r3
            kotlin.collections.CollectionsKt.sortWith(r1, r3)
        L65:
            return r2
    }

    public final org.luckypray.dexkit.result.ClassData getClassData(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            org.luckypray.dexkit.result.ClassData r0 = r1.getClassData(r0)
            return r0
    }

    public final org.luckypray.dexkit.result.ClassData getClassData(java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            char r0 = kotlin.text.StringsKt.first(r0)
            r1 = 76
            if (r0 != r1) goto L1d
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            char r0 = kotlin.text.StringsKt.last(r0)
            r1 = 59
            if (r0 != r1) goto L1d
            r0 = r9
            goto L42
        L1d:
            r6 = 4
            r7 = 0
            r3 = 46
            r4 = 47
            r5 = 0
            r2 = r9
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r2, r3, r4, r5, r6, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "L"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ";"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L42:
            org.luckypray.dexkit.wrap.DexClass r1 = new org.luckypray.dexkit.wrap.DexClass
            r1.<init>(r0)
            org.luckypray.dexkit.DexKitBridge$Companion r1 = org.luckypray.dexkit.DexKitBridge.Companion
            long r2 = r8.getSafeToken()
            byte[] r1 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetClassData(r1, r2, r0)
            if (r1 == 0) goto L6b
            r2 = 0
            org.luckypray.dexkit.result.ClassData$-Companion r3 = org.luckypray.dexkit.result.ClassData.f429Companion
            org.luckypray.dexkit.schema.-ClassMeta$Companion r4 = org.luckypray.dexkit.schema.ClassMeta.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r6 = "wrap(it)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            org.luckypray.dexkit.schema.-ClassMeta r4 = r4.getRootAsClassMeta(r5)
            org.luckypray.dexkit.result.ClassData r1 = r3.from(r8, r4)
            goto L6c
        L6b:
            r1 = 0
        L6c:
            return r1
    }

    public final int getDexNum() {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.getSafeToken()
            int r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetDexNum(r0, r1)
            return r0
    }

    public final org.luckypray.dexkit.result.FieldData getFieldData(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            org.luckypray.dexkit.wrap.DexField r0 = new org.luckypray.dexkit.wrap.DexField
            r0.<init>(r7)
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r6.getSafeToken()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetFieldData(r0, r1, r7)
            if (r0 == 0) goto L2d
            r1 = 0
            org.luckypray.dexkit.result.FieldData$-Companion r2 = org.luckypray.dexkit.result.FieldData.f430Companion
            org.luckypray.dexkit.schema.-FieldMeta$Companion r3 = org.luckypray.dexkit.schema.FieldMeta.Companion
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r5 = "wrap(it)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            org.luckypray.dexkit.schema.-FieldMeta r3 = r3.getRootAsFieldMeta(r4)
            org.luckypray.dexkit.result.FieldData r0 = r2.from(r6, r3)
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }

    public final org.luckypray.dexkit.result.FieldData getFieldData(java.lang.reflect.Field r2) {
            r1 = this;
            java.lang.String r0 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            org.luckypray.dexkit.result.FieldData r0 = r1.getFieldData(r0)
            return r0
    }

    public final org.luckypray.dexkit.result.MethodData getMethodData(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            org.luckypray.dexkit.wrap.DexMethod r0 = new org.luckypray.dexkit.wrap.DexMethod
            r0.<init>(r7)
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r6.getSafeToken()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetMethodData(r0, r1, r7)
            if (r0 == 0) goto L2d
            r1 = 0
            org.luckypray.dexkit.result.MethodData$-Companion r2 = org.luckypray.dexkit.result.MethodData.f431Companion
            org.luckypray.dexkit.schema.-MethodMeta$Companion r3 = org.luckypray.dexkit.schema.MethodMeta.Companion
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r5 = "wrap(it)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            org.luckypray.dexkit.schema.-MethodMeta r3 = r3.getRootAsMethodMeta(r4)
            org.luckypray.dexkit.result.MethodData r0 = r2.from(r6, r3)
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }

    public final org.luckypray.dexkit.result.MethodData getMethodData(java.lang.reflect.Constructor<?> r2) {
            r1 = this;
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            org.luckypray.dexkit.result.MethodData r0 = r1.getMethodData(r0)
            return r0
    }

    public final org.luckypray.dexkit.result.MethodData getMethodData(java.lang.reflect.Method r2) {
            r1 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            org.luckypray.dexkit.result.MethodData r0 = r1.getMethodData(r0)
            return r0
    }

    public final void initFullCache() {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.getSafeToken()
            org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitFullCache(r0, r1)
            return
    }

    public final boolean isValid() {
            r4 = this;
            long r0 = r4.token
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final void setThreadNum(int r4) {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.getSafeToken()
            org.luckypray.dexkit.DexKitBridge.Companion.access$nativeSetThreadNum(r0, r1, r4)
            return
    }
}
