package org.luckypray.dexkit;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nDexKitBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitBridge.kt\norg/luckypray/dexkit/DexKitBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,765:1\n1#2:766\n1000#3,2:767\n1000#3,2:769\n1000#3,2:771\n1000#3,2:773\n1000#3,2:775\n11328#4:777\n11663#4,3:778\n*S KotlinDebug\n*F\n+ 1 DexKitBridge.kt\norg/luckypray/dexkit/DexKitBridge\n*L\n390#1:767,2\n410#1:769,2\n426#1:771,2\n440#1:773,2\n454#1:775,2\n526#1:777\n526#1:778,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u008f\u00012\u00020\u0001:\u0002\u008f\u0001B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0012\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\tB\u0019\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000eJ)\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J)\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010H\u0000¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0004¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020%¢\u0006\u0004\b)\u0010'J\u0015\u0010,\u001a\u00020%2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020%2\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b/\u0010-J\r\u00100\u001a\u00020*¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020%2\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u0010\u0005J!\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u00105\u001a\u000204¢\u0006\u0004\b\u0018\u00106J!\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00162\u0006\u00105\u001a\u000207¢\u0006\u0004\b\u001b\u00108J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u000209¢\u0006\u0004\b\u001c\u0010:J\u0015\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020;¢\u0006\u0004\b\u001e\u0010<J\u0015\u0010!\u001a\u00020 2\u0006\u0010!\u001a\u00020=¢\u0006\u0004\b!\u0010>J\u001b\u0010B\u001a\u0004\u0018\u00010A2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030?¢\u0006\u0004\bB\u0010CJ\u0017\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010D\u001a\u00020\u0002¢\u0006\u0004\bB\u0010EJ\u0017\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bI\u0010JJ\u001b\u0010I\u001a\u0004\u0018\u00010H2\n\u0010L\u001a\u0006\u0012\u0002\b\u00030K¢\u0006\u0004\bI\u0010MJ\u0017\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010N\u001a\u00020\u0002¢\u0006\u0004\bI\u0010OJ\u0017\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bS\u0010TJ\u0017\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010N\u001a\u00020\u0002¢\u0006\u0004\bS\u0010UJ2\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u00162\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020%0\u0010¢\u0006\u0002\bV¢\u0006\u0004\b\u0018\u0010XJ2\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00162\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020%0\u0010¢\u0006\u0002\bV¢\u0006\u0004\b\u001b\u0010XJ&\u0010\u001c\u001a\u00020\u00172\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020%0\u0010¢\u0006\u0002\bV¢\u0006\u0004\b\u001c\u0010YJ&\u0010\u001e\u001a\u00020\u001a2\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020%0\u0010¢\u0006\u0002\bV¢\u0006\u0004\b\u001e\u0010ZJ&\u0010!\u001a\u00020 2\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020%0\u0010¢\u0006\u0002\bV¢\u0006\u0004\b!\u0010[J\u0017\u0010`\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\\H\u0000¢\u0006\u0004\b^\u0010_J\u0017\u0010c\u001a\u00020\u001a2\u0006\u0010]\u001a\u00020\\H\u0000¢\u0006\u0004\ba\u0010bJ\u0017\u0010f\u001a\u00020 2\u0006\u0010]\u001a\u00020\\H\u0000¢\u0006\u0004\bd\u0010eJ\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010g\u001a\u00020\u0011H\u0000¢\u0006\u0004\bj\u0010kJ\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010m\u001a\u00020\u0011H\u0000¢\u0006\u0004\bn\u0010kJ\u001d\u0010r\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010p\u001a\u00020\u0011H\u0000¢\u0006\u0004\bq\u0010kJ!\u0010u\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010h2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0004\bt\u0010kJ#\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0h0h2\u0006\u0010p\u001a\u00020\u0011H\u0000¢\u0006\u0004\bv\u0010kJ\u0017\u0010z\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0004\bx\u0010yJ\u0017\u0010|\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0004\b{\u0010yJ\u001d\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00020h2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0004\b}\u0010kJ\u001f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0h2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0080\u0001\u0010kJ\u0019\u0010\u0083\u0001\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0082\u0001\u0010yJ\u0019\u0010\u0085\u0001\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0084\u0001\u0010yJ\u001f\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020*0h2\u0006\u0010s\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0086\u0001\u0010kR\u0019\u0010\u0088\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0014\u0010\u008d\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0090\u0001"}, d2 = {"Lorg/luckypray/dexkit/DexKitBridge;", "Ljava/io/Closeable;", "", "apkPath", "<init>", "(Ljava/lang/String;)V", "", "", "dexBytesArray", "([[B)V", "Ljava/lang/ClassLoader;", "classLoader", "", "useMemoryDexFile", "(Ljava/lang/ClassLoader;Z)V", "T", "Lkotlin/Function1;", "", "block", "withNativeWriteToken", "(LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "encodeBytes", "", "Lorg/luckypray/dexkit/result/ClassDataList;", "batchFindClassUsingStrings", "([B)Ljava/util/Map;", "Lorg/luckypray/dexkit/result/MethodDataList;", "batchFindMethodUsingStrings", "findClass", "([B)Lorg/luckypray/dexkit/result/ClassDataList;", "findMethod", "([B)Lorg/luckypray/dexkit/result/MethodDataList;", "Lorg/luckypray/dexkit/result/FieldDataList;", "findField", "([B)Lorg/luckypray/dexkit/result/FieldDataList;", "withNativeReadToken$dexkit_android_release", "withNativeReadToken", "LYue/ۥۣۢ۠ۤ;", "close", "()V", "finalize", "initFullCache", "", "num", "setThreadNum", "(I)V", "maxConcurrentQueries", "setMaxConcurrentQueries", "getDexNum", "()I", "outPath", "exportDexFile", "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;", "batchFind", "(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;", "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;", "(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;", "Lorg/luckypray/dexkit/query/FindClass;", "(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;", "Lorg/luckypray/dexkit/query/FindMethod;", "(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;", "Lorg/luckypray/dexkit/query/FindField;", "(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;", "Ljava/lang/Class;", "clazz", "Lorg/luckypray/dexkit/result/ClassData;", "getClassData", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/result/ClassData;", "identifier", "(Ljava/lang/String;)Lorg/luckypray/dexkit/result/ClassData;", "Ljava/lang/reflect/Method;", "method", "Lorg/luckypray/dexkit/result/MethodData;", "getMethodData", "(Ljava/lang/reflect/Method;)Lorg/luckypray/dexkit/result/MethodData;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)Lorg/luckypray/dexkit/result/MethodData;", "descriptor", "(Ljava/lang/String;)Lorg/luckypray/dexkit/result/MethodData;", "Ljava/lang/reflect/Field;", "field", "Lorg/luckypray/dexkit/result/FieldData;", "getFieldData", "(Ljava/lang/reflect/Field;)Lorg/luckypray/dexkit/result/FieldData;", "(Ljava/lang/String;)Lorg/luckypray/dexkit/result/FieldData;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Ljava/util/Map;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/ClassDataList;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/MethodDataList;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/FieldDataList;", "", "encodeIdArray", "getTypeByIds$dexkit_android_release", "([J)Lorg/luckypray/dexkit/result/ClassDataList;", "getTypeByIds", "getMethodByIds$dexkit_android_release", "([J)Lorg/luckypray/dexkit/result/MethodDataList;", "getMethodByIds", "getFieldByIds$dexkit_android_release", "([J)Lorg/luckypray/dexkit/result/FieldDataList;", "getFieldByIds", "classId", "", "Lorg/luckypray/dexkit/result/AnnotationData;", "getClassAnnotations$dexkit_android_release", "(J)Ljava/util/List;", "getClassAnnotations", "fieldId", "getFieldAnnotations$dexkit_android_release", "getFieldAnnotations", "methodId", "getMethodAnnotations$dexkit_android_release", "getMethodAnnotations", "encodeId", "getParameterNames$dexkit_android_release", "getParameterNames", "getParameterAnnotations$dexkit_android_release", "getParameterAnnotations", "getCallMethods$dexkit_android_release", "(J)Lorg/luckypray/dexkit/result/MethodDataList;", "getCallMethods", "getInvokeMethods$dexkit_android_release", "getInvokeMethods", "getMethodUsingStrings$dexkit_android_release", "getMethodUsingStrings", "Lorg/luckypray/dexkit/result/UsingFieldData;", "getMethodUsingFields$dexkit_android_release", "getMethodUsingFields", "readFieldMethods$dexkit_android_release", "readFieldMethods", "writeFieldMethods$dexkit_android_release", "writeFieldMethods", "getMethodOpCodes$dexkit_android_release", "getMethodOpCodes", "token", "J", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lifecycleLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "isValid", "()Z", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class DexKitBridge implements java.io.Closeable {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.DexKitBridge.Companion Companion = null;

    @Yue.InterfaceC4418
    private final java.util.concurrent.locks.ReentrantReadWriteLock lifecycleLock;
    private volatile long token;

    @kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0083 ¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0083 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0010H\u0083 ¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\u001b\u0010\u0018J \u0010\u001d\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0083 ¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0083 ¢\u0006\u0004\b#\u0010\"J \u0010$\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0083 ¢\u0006\u0004\b$\u0010\"J \u0010%\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0083 ¢\u0006\u0004\b%\u0010\"J \u0010&\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0083 ¢\u0006\u0004\b&\u0010\"J\"\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b(\u0010)J\"\u0010*\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b*\u0010)J\"\u0010+\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b+\u0010)J \u0010.\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0083 ¢\u0006\u0004\b.\u0010/J \u00100\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0083 ¢\u0006\u0004\b0\u0010/J \u00101\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0083 ¢\u0006\u0004\b1\u0010/J \u00103\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b3\u00104J \u00106\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b6\u00104J \u00108\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b8\u00104J \u00109\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b9\u00104J \u0010;\u001a\u00020:2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b;\u0010<J \u0010>\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b>\u00104J \u0010?\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b?\u00104J \u0010@\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b@\u00104J \u0010A\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\bA\u00104J \u0010B\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\bB\u00104J\u0017\u0010D\u001a\u00020C2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bD\u0010EJ\u001d\u0010D\u001a\u00020C2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001f0FH\u0007¢\u0006\u0004\bD\u0010HJ\u001f\u0010D\u001a\u00020C2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\bD\u0010IJ&\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040F2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\bJ\u0010KJ*\u0010L\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010F2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\bL\u0010KJ\u001e\u0010M\u001a\u00020\u00062\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001f0FH\u0083 ¢\u0006\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lorg/luckypray/dexkit/DexKitBridge$Companion;", "", "<init>", "()V", "", "apkPath", "", "nativeInitDexKit", "(Ljava/lang/String;)J", "Ljava/lang/ClassLoader;", "loader", "", "useMemoryDexFile", "nativeInitDexKitByClassLoader", "(Ljava/lang/ClassLoader;Z)J", "nativePtr", "", "threadNum", "LYue/ۥۣۢ۠ۤ;", "nativeSetThreadNum", "(JI)V", "maxConcurrentQueries", "nativeSetMaxConcurrentQueries", "nativeInitFullCache", "(J)V", "nativeGetDexNum", "(J)I", "nativeRelease", "outDir", "nativeExportDexFile", "(JLjava/lang/String;)V", "", "bytes", "nativeBatchFindClassUsingStrings", "(J[B)[B", "nativeBatchFindMethodUsingStrings", "nativeFindClass", "nativeFindMethod", "nativeFindField", "dexDescriptor", "nativeGetClassData", "(JLjava/lang/String;)[B", "nativeGetMethodData", "nativeGetFieldData", "", "ids", "nativeGetClassByIds", "(J[J)[B", "nativeGetMethodByIds", "nativeGetFieldByIds", "classId", "nativeGetClassAnnotations", "(JJ)[B", "fieldId", "nativeGetFieldAnnotations", "methodId", "nativeGetMethodAnnotations", "nativeGetParameterAnnotations", "", "nativeGetMethodOpCodes", "(JJ)[I", "encodeId", "nativeGetCallMethods", "nativeGetInvokeMethods", "nativeGetMethodUsingFields", "nativeFieldGetMethods", "nativeFieldPutMethods", "Lorg/luckypray/dexkit/DexKitBridge;", "create", "(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;", "", "dexBytesArray", "([[B)Lorg/luckypray/dexkit/DexKitBridge;", "(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;", "nativeGetMethodUsingStrings", "(JJ)Lkotlin/Array;", "nativeGetParameterNames", "nativeInitDexKitByBytesArray", "(Lkotlin/Array;)J", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ byte[] access$nativeBatchFindClassUsingStrings(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, byte[] r3) {
                byte[] r0 = r0.nativeBatchFindClassUsingStrings(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeBatchFindMethodUsingStrings(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, byte[] r3) {
                byte[] r0 = r0.nativeBatchFindMethodUsingStrings(r1, r3)
                return r0
        }

        public static final /* synthetic */ void access$nativeExportDexFile(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, java.lang.String r3) {
                r0.nativeExportDexFile(r1, r3)
                return
        }

        public static final /* synthetic */ byte[] access$nativeFieldGetMethods(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeFieldGetMethods(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFieldPutMethods(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeFieldPutMethods(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFindClass(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, byte[] r3) {
                byte[] r0 = r0.nativeFindClass(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFindField(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, byte[] r3) {
                byte[] r0 = r0.nativeFindField(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFindMethod(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, byte[] r3) {
                byte[] r0 = r0.nativeFindMethod(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetCallMethods(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetCallMethods(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetClassAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetClassAnnotations(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetClassByIds(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long[] r3) {
                byte[] r0 = r0.nativeGetClassByIds(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetClassData(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, java.lang.String r3) {
                byte[] r0 = r0.nativeGetClassData(r1, r3)
                return r0
        }

        public static final /* synthetic */ int access$nativeGetDexNum(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1) {
                int r0 = r0.nativeGetDexNum(r1)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetFieldAnnotations(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldByIds(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long[] r3) {
                byte[] r0 = r0.nativeGetFieldByIds(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldData(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, java.lang.String r3) {
                byte[] r0 = r0.nativeGetFieldData(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetInvokeMethods(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetInvokeMethods(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetMethodAnnotations(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodByIds(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long[] r3) {
                byte[] r0 = r0.nativeGetMethodByIds(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodData(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, java.lang.String r3) {
                byte[] r0 = r0.nativeGetMethodData(r1, r3)
                return r0
        }

        public static final /* synthetic */ int[] access$nativeGetMethodOpCodes(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                int[] r0 = r0.nativeGetMethodOpCodes(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodUsingFields(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetMethodUsingFields(r1, r3)
                return r0
        }

        public static final /* synthetic */ java.lang.String[] access$nativeGetMethodUsingStrings(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                java.lang.String[] r0 = r0.nativeGetMethodUsingStrings(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetParameterAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetParameterAnnotations(r1, r3)
                return r0
        }

        public static final /* synthetic */ java.lang.String[] access$nativeGetParameterNames(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                java.lang.String[] r0 = r0.nativeGetParameterNames(r1, r3)
                return r0
        }

        public static final /* synthetic */ long access$nativeInitDexKit(org.luckypray.dexkit.DexKitBridge.Companion r0, java.lang.String r1) {
                long r0 = r0.nativeInitDexKit(r1)
                return r0
        }

        public static final /* synthetic */ long access$nativeInitDexKitByBytesArray(org.luckypray.dexkit.DexKitBridge.Companion r0, byte[][] r1) {
                long r0 = r0.nativeInitDexKitByBytesArray(r1)
                return r0
        }

        public static final /* synthetic */ long access$nativeInitDexKitByClassLoader(org.luckypray.dexkit.DexKitBridge.Companion r0, java.lang.ClassLoader r1, boolean r2) {
                long r0 = r0.nativeInitDexKitByClassLoader(r1, r2)
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

        public static final /* synthetic */ void access$nativeSetMaxConcurrentQueries(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, int r3) {
                r0.nativeSetMaxConcurrentQueries(r1, r3)
                return
        }

        public static final /* synthetic */ void access$nativeSetThreadNum(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, int r3) {
                r0.nativeSetThreadNum(r1, r3)
                return
        }

        @Yue.InterfaceC3427
        private final byte[] nativeBatchFindClassUsingStrings(long r1, byte[] r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeBatchFindClassUsingStrings(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeBatchFindMethodUsingStrings(long r1, byte[] r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeBatchFindMethodUsingStrings(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final void nativeExportDexFile(long r1, java.lang.String r3) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeExportDexFile(r1, r3)
                return
        }

        @Yue.InterfaceC3427
        private final byte[] nativeFieldGetMethods(long r1, long r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeFieldGetMethods(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeFieldPutMethods(long r1, long r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeFieldPutMethods(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeFindClass(long r1, byte[] r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeFindClass(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeFindField(long r1, byte[] r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeFindField(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeFindMethod(long r1, byte[] r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeFindMethod(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetCallMethods(long r1, long r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetCallMethods(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetClassAnnotations(long r1, long r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetClassAnnotations(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetClassByIds(long r1, long[] r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetClassByIds(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetClassData(long r1, java.lang.String r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetClassData(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final int nativeGetDexNum(long r1) {
                r0 = this;
                int r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetDexNum(r1)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetFieldAnnotations(long r1, long r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetFieldAnnotations(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetFieldByIds(long r1, long[] r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetFieldByIds(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetFieldData(long r1, java.lang.String r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetFieldData(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetInvokeMethods(long r1, long r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetInvokeMethods(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetMethodAnnotations(long r1, long r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodAnnotations(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetMethodByIds(long r1, long[] r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodByIds(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetMethodData(long r1, java.lang.String r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodData(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final int[] nativeGetMethodOpCodes(long r1, long r3) {
                r0 = this;
                int[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodOpCodes(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetMethodUsingFields(long r1, long r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodUsingFields(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final java.lang.String[] nativeGetMethodUsingStrings(long r1, long r3) {
                r0 = this;
                java.lang.String[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodUsingStrings(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final byte[] nativeGetParameterAnnotations(long r1, long r3) {
                r0 = this;
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetParameterAnnotations(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final java.lang.String[] nativeGetParameterNames(long r1, long r3) {
                r0 = this;
                java.lang.String[] r1 = org.luckypray.dexkit.DexKitBridge.access$nativeGetParameterNames(r1, r3)
                return r1
        }

        @Yue.InterfaceC3427
        private final long nativeInitDexKit(java.lang.String r3) {
                r2 = this;
                long r0 = org.luckypray.dexkit.DexKitBridge.access$nativeInitDexKit(r3)
                return r0
        }

        @Yue.InterfaceC3427
        private final long nativeInitDexKitByBytesArray(byte[][] r3) {
                r2 = this;
                long r0 = org.luckypray.dexkit.DexKitBridge.access$nativeInitDexKitByBytesArray(r3)
                return r0
        }

        @Yue.InterfaceC3427
        private final long nativeInitDexKitByClassLoader(java.lang.ClassLoader r1, boolean r2) {
                r0 = this;
                long r1 = org.luckypray.dexkit.DexKitBridge.access$nativeInitDexKitByClassLoader(r1, r2)
                return r1
        }

        @Yue.InterfaceC3427
        private final void nativeInitFullCache(long r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeInitFullCache(r1)
                return
        }

        @Yue.InterfaceC3427
        private final void nativeRelease(long r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeRelease(r1)
                return
        }

        @Yue.InterfaceC3427
        private final void nativeSetMaxConcurrentQueries(long r1, int r3) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeSetMaxConcurrentQueries(r1, r3)
                return
        }

        @Yue.InterfaceC3427
        private final void nativeSetThreadNum(long r1, int r3) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeSetThreadNum(r1, r3)
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.DexKitBridge create(@Yue.InterfaceC4418 java.lang.ClassLoader r3, boolean r4) {
                r2 = this;
                java.lang.String r0 = "loader"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "dalvik.system.BaseDexClassLoader"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L24
                boolean r0 = r0.isInstance(r3)
                if (r0 == 0) goto L18
                org.luckypray.dexkit.DexKitBridge r0 = new org.luckypray.dexkit.DexKitBridge
                r1 = 0
                r0.<init>(r3, r4, r1)
                return r0
            L18:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)"
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L24:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "This method requires Android runtime"
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.DexKitBridge create(@Yue.InterfaceC4418 java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "apkPath"
                Yue.C3329.m13906(r3, r0)
                org.luckypray.dexkit.DexKitBridge r0 = new org.luckypray.dexkit.DexKitBridge
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.DexKitBridge create(@Yue.InterfaceC4418 byte[][] r3) {
                r2 = this;
                java.lang.String r0 = "dexBytesArray"
                Yue.C3329.m13906(r3, r0)
                org.luckypray.dexkit.DexKitBridge r0 = new org.luckypray.dexkit.DexKitBridge
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$exportDexFile$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LYue/ۥۣۢ۠ۤ;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Long, Yue.C6593> {
        final /* synthetic */ java.lang.String $outPath;

        public AnonymousClass1(java.lang.String r1) {
                r0 = this;
                r0.$outPath = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Long r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                r2.invoke(r0)
                Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
                return r3
        }

        public final void invoke(long r3) {
                r2 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                java.lang.String r1 = r2.$outPath
                org.luckypray.dexkit.DexKitBridge.Companion.access$nativeExportDexFile(r0, r3, r1)
                return
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getClassData$1, reason: invalid class name and case insensitive filesystem */
    @Yue.InterfaceC4201(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class C79021 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Long, byte[]> {
        final /* synthetic */ java.lang.String $descriptor;

        public C79021(java.lang.String r1) {
                r0 = this;
                r0.$descriptor = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ byte[] invoke(java.lang.Long r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                byte[] r3 = r2.invoke(r0)
                return r3
        }

        @Yue.InterfaceC4543
        public final byte[] invoke(long r3) {
                r2 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                java.lang.String r1 = r2.$descriptor
                byte[] r3 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetClassData(r0, r3, r1)
                return r3
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getDexNum$1, reason: invalid class name and case insensitive filesystem */
    @Yue.InterfaceC4201(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(J)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class C79031 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Long, java.lang.Integer> {
        public static final org.luckypray.dexkit.DexKitBridge.C79031 INSTANCE = null;

        static {
                org.luckypray.dexkit.DexKitBridge$getDexNum$1 r0 = new org.luckypray.dexkit.DexKitBridge$getDexNum$1
                r0.<init>()
                org.luckypray.dexkit.DexKitBridge.C79031.INSTANCE = r0
                return
        }

        public C79031() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Yue.InterfaceC4418
        public final java.lang.Integer invoke(long r2) {
                r1 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                int r2 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetDexNum(r0, r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Long r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                java.lang.Integer r3 = r2.invoke(r0)
                return r3
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getFieldData$1, reason: invalid class name and case insensitive filesystem */
    @Yue.InterfaceC4201(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class C79041 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Long, byte[]> {
        final /* synthetic */ java.lang.String $descriptor;

        public C79041(java.lang.String r1) {
                r0 = this;
                r0.$descriptor = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ byte[] invoke(java.lang.Long r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                byte[] r3 = r2.invoke(r0)
                return r3
        }

        @Yue.InterfaceC4543
        public final byte[] invoke(long r3) {
                r2 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                java.lang.String r1 = r2.$descriptor
                byte[] r3 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetFieldData(r0, r3, r1)
                return r3
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getMethodData$1, reason: invalid class name and case insensitive filesystem */
    @Yue.InterfaceC4201(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class C79051 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Long, byte[]> {
        final /* synthetic */ java.lang.String $descriptor;

        public C79051(java.lang.String r1) {
                r0 = this;
                r0.$descriptor = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ byte[] invoke(java.lang.Long r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                byte[] r3 = r2.invoke(r0)
                return r3
        }

        @Yue.InterfaceC4543
        public final byte[] invoke(long r3) {
                r2 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                java.lang.String r1 = r2.$descriptor
                byte[] r3 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetMethodData(r0, r3, r1)
                return r3
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$initFullCache$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LYue/ۥۣۢ۠ۤ;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C79061 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Long, Yue.C6593> {
        public static final org.luckypray.dexkit.DexKitBridge.C79061 INSTANCE = null;

        static {
                org.luckypray.dexkit.DexKitBridge$initFullCache$1 r0 = new org.luckypray.dexkit.DexKitBridge$initFullCache$1
                r0.<init>()
                org.luckypray.dexkit.DexKitBridge.C79061.INSTANCE = r0
                return
        }

        public C79061() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Long r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                r2.invoke(r0)
                Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
                return r3
        }

        public final void invoke(long r2) {
                r1 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitFullCache(r0, r2)
                return
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$setMaxConcurrentQueries$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LYue/ۥۣۢ۠ۤ;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass2 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Long, Yue.C6593> {
        final /* synthetic */ int $maxConcurrentQueries;

        public AnonymousClass2(int r1) {
                r0 = this;
                r0.$maxConcurrentQueries = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Long r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                r2.invoke(r0)
                Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
                return r3
        }

        public final void invoke(long r3) {
                r2 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                int r1 = r2.$maxConcurrentQueries
                org.luckypray.dexkit.DexKitBridge.Companion.access$nativeSetMaxConcurrentQueries(r0, r3, r1)
                return
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$setThreadNum$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LYue/ۥۣۢ۠ۤ;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C79072 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Long, Yue.C6593> {
        final /* synthetic */ int $num;

        public C79072(int r1) {
                r0 = this;
                r0.$num = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Long r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                r2.invoke(r0)
                Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
                return r3
        }

        public final void invoke(long r3) {
                r2 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                int r1 = r2.$num
                org.luckypray.dexkit.DexKitBridge.Companion.access$nativeSetThreadNum(r0, r3, r1)
                return
        }
    }

    static {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = new org.luckypray.dexkit.DexKitBridge$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.DexKitBridge.Companion = r0
            return
    }

    private DexKitBridge(java.lang.ClassLoader r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.lifecycleLock = r0
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r2 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitDexKitByClassLoader(r0, r2, r3)
            r1.token = r2
            return
    }

    public /* synthetic */ DexKitBridge(java.lang.ClassLoader r1, boolean r2, Yue.C1769 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private DexKitBridge(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r2.lifecycleLock = r0
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitDexKit(r0, r3)
            r2.token = r0
            return
    }

    public /* synthetic */ DexKitBridge(java.lang.String r1, Yue.C1769 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private DexKitBridge(byte[][] r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r2.lifecycleLock = r0
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitDexKitByBytesArray(r0, r3)
            r2.token = r0
            return
    }

    public /* synthetic */ DexKitBridge(byte[][] r1, Yue.C1769 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ byte[] access$nativeBatchFindClassUsingStrings(long r0, byte[] r2) {
            byte[] r0 = nativeBatchFindClassUsingStrings(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeBatchFindMethodUsingStrings(long r0, byte[] r2) {
            byte[] r0 = nativeBatchFindMethodUsingStrings(r0, r2)
            return r0
    }

    public static final /* synthetic */ void access$nativeExportDexFile(long r0, java.lang.String r2) {
            nativeExportDexFile(r0, r2)
            return
    }

    public static final /* synthetic */ byte[] access$nativeFieldGetMethods(long r0, long r2) {
            byte[] r0 = nativeFieldGetMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFieldPutMethods(long r0, long r2) {
            byte[] r0 = nativeFieldPutMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFindClass(long r0, byte[] r2) {
            byte[] r0 = nativeFindClass(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFindField(long r0, byte[] r2) {
            byte[] r0 = nativeFindField(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFindMethod(long r0, byte[] r2) {
            byte[] r0 = nativeFindMethod(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetCallMethods(long r0, long r2) {
            byte[] r0 = nativeGetCallMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetClassAnnotations(long r0, long r2) {
            byte[] r0 = nativeGetClassAnnotations(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetClassByIds(long r0, long[] r2) {
            byte[] r0 = nativeGetClassByIds(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetClassData(long r0, java.lang.String r2) {
            byte[] r0 = nativeGetClassData(r0, r2)
            return r0
    }

    public static final /* synthetic */ int access$nativeGetDexNum(long r0) {
            int r0 = nativeGetDexNum(r0)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldAnnotations(long r0, long r2) {
            byte[] r0 = nativeGetFieldAnnotations(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldByIds(long r0, long[] r2) {
            byte[] r0 = nativeGetFieldByIds(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldData(long r0, java.lang.String r2) {
            byte[] r0 = nativeGetFieldData(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetInvokeMethods(long r0, long r2) {
            byte[] r0 = nativeGetInvokeMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodAnnotations(long r0, long r2) {
            byte[] r0 = nativeGetMethodAnnotations(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodByIds(long r0, long[] r2) {
            byte[] r0 = nativeGetMethodByIds(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodData(long r0, java.lang.String r2) {
            byte[] r0 = nativeGetMethodData(r0, r2)
            return r0
    }

    public static final /* synthetic */ int[] access$nativeGetMethodOpCodes(long r0, long r2) {
            int[] r0 = nativeGetMethodOpCodes(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodUsingFields(long r0, long r2) {
            byte[] r0 = nativeGetMethodUsingFields(r0, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.String[] access$nativeGetMethodUsingStrings(long r0, long r2) {
            java.lang.String[] r0 = nativeGetMethodUsingStrings(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetParameterAnnotations(long r0, long r2) {
            byte[] r0 = nativeGetParameterAnnotations(r0, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.String[] access$nativeGetParameterNames(long r0, long r2) {
            java.lang.String[] r0 = nativeGetParameterNames(r0, r2)
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

    public static final /* synthetic */ long access$nativeInitDexKitByClassLoader(java.lang.ClassLoader r0, boolean r1) {
            long r0 = nativeInitDexKitByClassLoader(r0, r1)
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

    public static final /* synthetic */ void access$nativeSetMaxConcurrentQueries(long r0, int r2) {
            nativeSetMaxConcurrentQueries(r0, r2)
            return
    }

    public static final /* synthetic */ void access$nativeSetThreadNum(long r0, int r2) {
            nativeSetThreadNum(r0, r2)
            return
    }

    private final java.util.Map<java.lang.String, org.luckypray.dexkit.result.ClassDataList> batchFindClassUsingStrings(byte[] r12) {
            r11 = this;
            org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$res$1
            r0.<init>(r12)
            java.lang.Object r12 = r11.withNativeReadToken$dexkit_android_release(r0)
            byte[] r12 = (byte[]) r12
            org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.BatchClassMetaArrayHolder.Companion
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.wrap(r12)
            java.lang.String r1 = "wrap(res)"
            Yue.C3329.m13905(r12, r1)
            org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder r12 = r0.getRootAsBatchClassMetaArrayHolder(r12)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r12.getItemsLength()
            r2 = 0
            r3 = r2
        L25:
            if (r3 >= r1) goto L69
            org.luckypray.dexkit.schema.-BatchClassMeta r4 = r12.items(r3)
            Yue.C3329.m13903(r4)
            java.lang.String r5 = r4.getUnionKey()
            Yue.C3329.m13903(r5)
            org.luckypray.dexkit.result.ClassDataList r6 = new org.luckypray.dexkit.result.ClassDataList
            r6.<init>()
            int r7 = r4.getClassesLength()
            r8 = r2
        L3f:
            if (r8 >= r7) goto L54
            org.luckypray.dexkit.result.ClassData$-Companion r9 = org.luckypray.dexkit.result.ClassData.f30805Companion
            org.luckypray.dexkit.schema.-ClassMeta r10 = r4.classes(r8)
            Yue.C3329.m13903(r10)
            org.luckypray.dexkit.result.ClassData r9 = r9.from(r11, r10)
            r6.add(r9)
            int r8 = r8 + 1
            goto L3f
        L54:
            int r4 = r6.size()
            r7 = 1
            if (r4 <= r7) goto L63
            org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1 r4 = new org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1
            r4.<init>()
            Yue.C1215.m6245(r6, r4)
        L63:
            r0.put(r5, r6)
            int r3 = r3 + 1
            goto L25
        L69:
            return r0
    }

    private final java.util.Map<java.lang.String, org.luckypray.dexkit.result.MethodDataList> batchFindMethodUsingStrings(byte[] r12) {
            r11 = this;
            org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$res$1
            r0.<init>(r12)
            java.lang.Object r12 = r11.withNativeReadToken$dexkit_android_release(r0)
            byte[] r12 = (byte[]) r12
            org.luckypray.dexkit.schema.-BatchMethodMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.BatchMethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.wrap(r12)
            java.lang.String r1 = "wrap(res)"
            Yue.C3329.m13905(r12, r1)
            org.luckypray.dexkit.schema.-BatchMethodMetaArrayHolder r12 = r0.getRootAsBatchMethodMetaArrayHolder(r12)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r12.getItemsLength()
            r2 = 0
            r3 = r2
        L25:
            if (r3 >= r1) goto L69
            org.luckypray.dexkit.schema.-BatchMethodMeta r4 = r12.items(r3)
            Yue.C3329.m13903(r4)
            java.lang.String r5 = r4.getUnionKey()
            Yue.C3329.m13903(r5)
            org.luckypray.dexkit.result.MethodDataList r6 = new org.luckypray.dexkit.result.MethodDataList
            r6.<init>()
            int r7 = r4.getMethodsLength()
            r8 = r2
        L3f:
            if (r8 >= r7) goto L54
            org.luckypray.dexkit.result.MethodData$-Companion r9 = org.luckypray.dexkit.result.MethodData.f30807Companion
            org.luckypray.dexkit.schema.-MethodMeta r10 = r4.methods(r8)
            Yue.C3329.m13903(r10)
            org.luckypray.dexkit.result.MethodData r9 = r9.from(r11, r10)
            r6.add(r9)
            int r8 = r8 + 1
            goto L3f
        L54:
            int r4 = r6.size()
            r7 = 1
            if (r4 <= r7) goto L63
            org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1 r4 = new org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1
            r4.<init>()
            Yue.C1215.m6245(r6, r4)
        L63:
            r0.put(r5, r6)
            int r3 = r3 + 1
            goto L25
        L69:
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.DexKitBridge create(@Yue.InterfaceC4418 java.lang.ClassLoader r1, boolean r2) {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r1 = r0.create(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.DexKitBridge create(@Yue.InterfaceC4418 java.lang.String r1) {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r1 = r0.create(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.DexKitBridge create(@Yue.InterfaceC4418 byte[][] r1) {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r1 = r0.create(r1)
            return r1
    }

    private final org.luckypray.dexkit.result.ClassDataList findClass(byte[] r6) {
            r5 = this;
            org.luckypray.dexkit.DexKitBridge$findClass$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$findClass$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.ClassMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r1 = "wrap(res)"
            Yue.C3329.m13905(r6, r1)
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder r6 = r0.getRootAsClassMetaArrayHolder(r6)
            org.luckypray.dexkit.result.ClassDataList r0 = new org.luckypray.dexkit.result.ClassDataList
            r0.<init>()
            int r1 = r6.getClassesLength()
            r2 = 0
        L24:
            if (r2 >= r1) goto L39
            org.luckypray.dexkit.result.ClassData$-Companion r3 = org.luckypray.dexkit.result.ClassData.f30805Companion
            org.luckypray.dexkit.schema.-ClassMeta r4 = r6.classes(r2)
            Yue.C3329.m13903(r4)
            org.luckypray.dexkit.result.ClassData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L24
        L39:
            int r6 = r0.size()
            r1 = 1
            if (r6 <= r1) goto L48
            org.luckypray.dexkit.DexKitBridge$findClass$$inlined$sortBy$1 r6 = new org.luckypray.dexkit.DexKitBridge$findClass$$inlined$sortBy$1
            r6.<init>()
            Yue.C1215.m6245(r0, r6)
        L48:
            return r0
    }

    private final org.luckypray.dexkit.result.FieldDataList findField(byte[] r6) {
            r5 = this;
            org.luckypray.dexkit.DexKitBridge$findField$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$findField$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.FieldMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r1 = "wrap(res)"
            Yue.C3329.m13905(r6, r1)
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder r6 = r0.getRootAsFieldMetaArrayHolder(r6)
            org.luckypray.dexkit.result.FieldDataList r0 = new org.luckypray.dexkit.result.FieldDataList
            r0.<init>()
            int r1 = r6.getFieldsLength()
            r2 = 0
        L24:
            if (r2 >= r1) goto L39
            org.luckypray.dexkit.result.FieldData$-Companion r3 = org.luckypray.dexkit.result.FieldData.f30806Companion
            org.luckypray.dexkit.schema.-FieldMeta r4 = r6.fields(r2)
            Yue.C3329.m13903(r4)
            org.luckypray.dexkit.result.FieldData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L24
        L39:
            int r6 = r0.size()
            r1 = 1
            if (r6 <= r1) goto L48
            org.luckypray.dexkit.DexKitBridge$findField$$inlined$sortBy$1 r6 = new org.luckypray.dexkit.DexKitBridge$findField$$inlined$sortBy$1
            r6.<init>()
            Yue.C1215.m6245(r0, r6)
        L48:
            return r0
    }

    private final org.luckypray.dexkit.result.MethodDataList findMethod(byte[] r6) {
            r5 = this;
            org.luckypray.dexkit.DexKitBridge$findMethod$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$findMethod$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r1 = "wrap(res)"
            Yue.C3329.m13905(r6, r1)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r6 = r0.getRootAsMethodMetaArrayHolder(r6)
            org.luckypray.dexkit.result.MethodDataList r0 = new org.luckypray.dexkit.result.MethodDataList
            r0.<init>()
            int r1 = r6.getMethodsLength()
            r2 = 0
        L24:
            if (r2 >= r1) goto L39
            org.luckypray.dexkit.result.MethodData$-Companion r3 = org.luckypray.dexkit.result.MethodData.f30807Companion
            org.luckypray.dexkit.schema.-MethodMeta r4 = r6.methods(r2)
            Yue.C3329.m13903(r4)
            org.luckypray.dexkit.result.MethodData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L24
        L39:
            int r6 = r0.size()
            r1 = 1
            if (r6 <= r1) goto L48
            org.luckypray.dexkit.DexKitBridge$findMethod$$inlined$sortBy$1 r6 = new org.luckypray.dexkit.DexKitBridge$findMethod$$inlined$sortBy$1
            r6.<init>()
            Yue.C1215.m6245(r0, r6)
        L48:
            return r0
    }

    @Yue.InterfaceC3427
    private static final native byte[] nativeBatchFindClassUsingStrings(long r0, byte[] r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeBatchFindMethodUsingStrings(long r0, byte[] r2);

    @Yue.InterfaceC3427
    private static final native void nativeExportDexFile(long r0, java.lang.String r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeFieldGetMethods(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeFieldPutMethods(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeFindClass(long r0, byte[] r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeFindField(long r0, byte[] r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeFindMethod(long r0, byte[] r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetCallMethods(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetClassAnnotations(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetClassByIds(long r0, long[] r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetClassData(long r0, java.lang.String r2);

    @Yue.InterfaceC3427
    private static final native int nativeGetDexNum(long r0);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetFieldAnnotations(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetFieldByIds(long r0, long[] r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetFieldData(long r0, java.lang.String r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetInvokeMethods(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetMethodAnnotations(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetMethodByIds(long r0, long[] r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetMethodData(long r0, java.lang.String r2);

    @Yue.InterfaceC3427
    private static final native int[] nativeGetMethodOpCodes(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetMethodUsingFields(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native java.lang.String[] nativeGetMethodUsingStrings(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native byte[] nativeGetParameterAnnotations(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native java.lang.String[] nativeGetParameterNames(long r0, long r2);

    @Yue.InterfaceC3427
    private static final native long nativeInitDexKit(java.lang.String r0);

    @Yue.InterfaceC3427
    private static final native long nativeInitDexKitByBytesArray(byte[][] r0);

    @Yue.InterfaceC3427
    private static final native long nativeInitDexKitByClassLoader(java.lang.ClassLoader r0, boolean r1);

    @Yue.InterfaceC3427
    private static final native void nativeInitFullCache(long r0);

    @Yue.InterfaceC3427
    private static final native void nativeRelease(long r0);

    @Yue.InterfaceC3427
    private static final native void nativeSetMaxConcurrentQueries(long r0, int r2);

    @Yue.InterfaceC3427
    private static final native void nativeSetThreadNum(long r0, int r2);

    private final <T> T withNativeWriteToken(Yue.InterfaceC2825<? super java.lang.Long, ? extends T> r9) {
            r8 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r8.lifecycleLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            r1.unlock()
            int r4 = r4 + 1
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            long r4 = r8.token     // Catch: java.lang.Throwable -> L3f
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L41
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r9 = r9.invoke(r4)     // Catch: java.lang.Throwable -> L3f
        L33:
            if (r3 >= r2) goto L3b
            r1.lock()
            int r3 = r3 + 1
            goto L33
        L3b:
            r0.unlock()
            return r9
        L3f:
            r9 = move-exception
            goto L4d
        L41:
            java.lang.String r9 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L3f
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L3f
            throw r4     // Catch: java.lang.Throwable -> L3f
        L4d:
            if (r3 >= r2) goto L55
            r1.lock()
            int r3 = r3 + 1
            goto L4d
        L55:
            r0.unlock()
            throw r9
    }

    public final /* synthetic */ java.util.Map batchFindClassUsingStrings(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindClassUsingStrings
            r0.<init>()
            r2.invoke(r0)
            java.util.Map r2 = r1.batchFindClassUsingStrings(r0)
            return r2
    }

    @Yue.InterfaceC4418
    public final java.util.Map<java.lang.String, org.luckypray.dexkit.result.ClassDataList> batchFindClassUsingStrings(@Yue.InterfaceC4418 org.luckypray.dexkit.query.BatchFindClassUsingStrings r2) {
            r1 = this;
            java.lang.String r0 = "batchFind"
            Yue.C3329.m13906(r2, r0)
            byte[] r2 = r2.serializedBytes$dexkit_android_release()
            java.util.Map r2 = r1.batchFindClassUsingStrings(r2)
            return r2
    }

    public final /* synthetic */ java.util.Map batchFindMethodUsingStrings(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindMethodUsingStrings
            r0.<init>()
            r2.invoke(r0)
            java.util.Map r2 = r1.batchFindMethodUsingStrings(r0)
            return r2
    }

    @Yue.InterfaceC4418
    public final java.util.Map<java.lang.String, org.luckypray.dexkit.result.MethodDataList> batchFindMethodUsingStrings(@Yue.InterfaceC4418 org.luckypray.dexkit.query.BatchFindMethodUsingStrings r2) {
            r1 = this;
            java.lang.String r0 = "batchFind"
            Yue.C3329.m13906(r2, r0)
            byte[] r2 = r2.serializedBytes$dexkit_android_release()
            java.util.Map r2 = r1.batchFindMethodUsingStrings(r2)
            return r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r9 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r9.lifecycleLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            r1.unlock()
            int r4 = r4 + 1
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            long r4 = r9.token     // Catch: java.lang.Throwable -> L4c
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L37
        L2b:
            if (r3 >= r2) goto L33
            r1.lock()
            int r3 = r3 + 1
            goto L2b
        L33:
            r0.unlock()
            return
        L37:
            r9.token = r6     // Catch: java.lang.Throwable -> L4c
            org.luckypray.dexkit.DexKitBridge$Companion r6 = org.luckypray.dexkit.DexKitBridge.Companion     // Catch: java.lang.Throwable -> L4c
            org.luckypray.dexkit.DexKitBridge.Companion.access$nativeRelease(r6, r4)     // Catch: java.lang.Throwable -> L4c
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L4c
        L40:
            if (r3 >= r2) goto L48
            r1.lock()
            int r3 = r3 + 1
            goto L40
        L48:
            r0.unlock()
            return
        L4c:
            r4 = move-exception
        L4d:
            if (r3 >= r2) goto L55
            r1.lock()
            int r3 = r3 + 1
            goto L4d
        L55:
            r0.unlock()
            throw r4
    }

    public final void exportDexFile(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "outPath"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.DexKitBridge$exportDexFile$1 r0 = new org.luckypray.dexkit.DexKitBridge$exportDexFile$1
            r0.<init>(r2)
            r1.withNativeReadToken$dexkit_android_release(r0)
            return
    }

    public final void finalize() {
            r0 = this;
            r0.close()
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.result.ClassDataList findClass(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
            r0.<init>()
            r2.invoke(r0)
            org.luckypray.dexkit.result.ClassDataList r2 = r1.findClass(r0)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.ClassDataList findClass(@Yue.InterfaceC4418 org.luckypray.dexkit.query.FindClass r2) {
            r1 = this;
            java.lang.String r0 = "findClass"
            Yue.C3329.m13906(r2, r0)
            byte[] r2 = r2.serializedBytes$dexkit_android_release()
            org.luckypray.dexkit.result.ClassDataList r2 = r1.findClass(r2)
            return r2
    }

    public final /* synthetic */ org.luckypray.dexkit.result.FieldDataList findField(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
            r0.<init>()
            r2.invoke(r0)
            org.luckypray.dexkit.result.FieldDataList r2 = r1.findField(r0)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.FieldDataList findField(@Yue.InterfaceC4418 org.luckypray.dexkit.query.FindField r2) {
            r1 = this;
            java.lang.String r0 = "findField"
            Yue.C3329.m13906(r2, r0)
            byte[] r2 = r2.serializedBytes$dexkit_android_release()
            org.luckypray.dexkit.result.FieldDataList r2 = r1.findField(r2)
            return r2
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList findMethod(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
            r0.<init>()
            r2.invoke(r0)
            org.luckypray.dexkit.result.MethodDataList r2 = r1.findMethod(r0)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.MethodDataList findMethod(@Yue.InterfaceC4418 org.luckypray.dexkit.query.FindMethod r2) {
            r1 = this;
            java.lang.String r0 = "findMethod"
            Yue.C3329.m13906(r2, r0)
            byte[] r2 = r2.serializedBytes$dexkit_android_release()
            org.luckypray.dexkit.result.MethodDataList r2 = r1.findMethod(r2)
            return r2
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList getCallMethods$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getCallMethods$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getCallMethods$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            java.lang.String r0 = "wrap(res)"
            Yue.C3329.m13905(r5, r0)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r5 = r6.getRootAsMethodMetaArrayHolder(r5)
            org.luckypray.dexkit.result.MethodDataList r6 = new org.luckypray.dexkit.result.MethodDataList
            r6.<init>()
            int r0 = r5.getMethodsLength()
            r1 = 0
        L24:
            if (r1 >= r0) goto L39
            org.luckypray.dexkit.result.MethodData$-Companion r2 = org.luckypray.dexkit.result.MethodData.f30807Companion
            org.luckypray.dexkit.schema.-MethodMeta r3 = r5.methods(r1)
            Yue.C3329.m13903(r3)
            org.luckypray.dexkit.result.MethodData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L24
        L39:
            return r6
    }

    public final /* synthetic */ java.util.List getClassAnnotations$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getClassAnnotations$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getClassAnnotations$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.AnnotationMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            java.lang.String r0 = "wrap(res)"
            Yue.C3329.m13905(r5, r0)
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r5 = r6.getRootAsAnnotationMetaArrayHolder(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r5.getAnnotationsLength()
            r1 = 0
        L24:
            if (r1 >= r0) goto L39
            org.luckypray.dexkit.result.AnnotationData$-Companion r2 = org.luckypray.dexkit.result.AnnotationData.f30801Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r3 = r5.annotations(r1)
            Yue.C3329.m13903(r3)
            org.luckypray.dexkit.result.AnnotationData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L24
        L39:
            return r6
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.result.ClassData getClassData(@Yue.InterfaceC4418 java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            org.luckypray.dexkit.result.ClassData r2 = r1.getClassData(r2)
            return r2
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.result.ClassData getClassData(@Yue.InterfaceC4418 java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = "identifier"
            Yue.C3329.m13906(r9, r0)
            char r0 = Yue.C5996.m22553(r9)
            r1 = 76
            if (r0 != r1) goto L16
            char r0 = Yue.C5996.m22578(r9)
            r1 = 59
            if (r0 != r1) goto L16
            goto L38
        L16:
            r6 = 4
            r7 = 0
            r3 = 46
            r4 = 47
            r5 = 0
            r2 = r9
            java.lang.String r9 = Yue.C5988.m22304(r2, r3, r4, r5, r6, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "L"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = ";"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
        L38:
            org.luckypray.dexkit.wrap.DexClass r0 = new org.luckypray.dexkit.wrap.DexClass
            r0.<init>(r9)
            org.luckypray.dexkit.DexKitBridge$getClassData$1 r0 = new org.luckypray.dexkit.DexKitBridge$getClassData$1
            r0.<init>(r9)
            java.lang.Object r9 = r8.withNativeReadToken$dexkit_android_release(r0)
            byte[] r9 = (byte[]) r9
            if (r9 == 0) goto L60
            org.luckypray.dexkit.result.ClassData$-Companion r0 = org.luckypray.dexkit.result.ClassData.f30805Companion
            org.luckypray.dexkit.schema.-ClassMeta$Companion r1 = org.luckypray.dexkit.schema.ClassMeta.Companion
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            java.lang.String r2 = "wrap(it)"
            Yue.C3329.m13905(r9, r2)
            org.luckypray.dexkit.schema.-ClassMeta r9 = r1.getRootAsClassMeta(r9)
            org.luckypray.dexkit.result.ClassData r9 = r0.from(r8, r9)
            goto L61
        L60:
            r9 = 0
        L61:
            return r9
    }

    public final int getDexNum() {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge$getDexNum$1 r0 = org.luckypray.dexkit.DexKitBridge.C79031.INSTANCE
            java.lang.Object r0 = r1.withNativeReadToken$dexkit_android_release(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    public final /* synthetic */ java.util.List getFieldAnnotations$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getFieldAnnotations$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getFieldAnnotations$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.AnnotationMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            java.lang.String r0 = "wrap(res)"
            Yue.C3329.m13905(r5, r0)
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r5 = r6.getRootAsAnnotationMetaArrayHolder(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r5.getAnnotationsLength()
            r1 = 0
        L24:
            if (r1 >= r0) goto L39
            org.luckypray.dexkit.result.AnnotationData$-Companion r2 = org.luckypray.dexkit.result.AnnotationData.f30801Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r3 = r5.annotations(r1)
            Yue.C3329.m13903(r3)
            org.luckypray.dexkit.result.AnnotationData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L24
        L39:
            return r6
    }

    public final /* synthetic */ org.luckypray.dexkit.result.FieldDataList getFieldByIds$dexkit_android_release(long[] r6) {
            r5 = this;
            java.lang.String r0 = "encodeIdArray"
            Yue.C3329.m13906(r6, r0)
            org.luckypray.dexkit.DexKitBridge$getFieldByIds$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getFieldByIds$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.FieldMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r1 = "wrap(res)"
            Yue.C3329.m13905(r6, r1)
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder r6 = r0.getRootAsFieldMetaArrayHolder(r6)
            org.luckypray.dexkit.result.FieldDataList r0 = new org.luckypray.dexkit.result.FieldDataList
            r0.<init>()
            int r1 = r6.getFieldsLength()
            r2 = 0
        L29:
            if (r2 >= r1) goto L3e
            org.luckypray.dexkit.result.FieldData$-Companion r3 = org.luckypray.dexkit.result.FieldData.f30806Companion
            org.luckypray.dexkit.schema.-FieldMeta r4 = r6.fields(r2)
            Yue.C3329.m13903(r4)
            org.luckypray.dexkit.result.FieldData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L29
        L3e:
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.result.FieldData getFieldData(@Yue.InterfaceC4418 java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "descriptor"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.wrap.DexField r0 = new org.luckypray.dexkit.wrap.DexField
            r0.<init>(r4)
            org.luckypray.dexkit.DexKitBridge$getFieldData$1 r0 = new org.luckypray.dexkit.DexKitBridge$getFieldData$1
            r0.<init>(r4)
            java.lang.Object r4 = r3.withNativeReadToken$dexkit_android_release(r0)
            byte[] r4 = (byte[]) r4
            if (r4 == 0) goto L2d
            org.luckypray.dexkit.result.FieldData$-Companion r0 = org.luckypray.dexkit.result.FieldData.f30806Companion
            org.luckypray.dexkit.schema.-FieldMeta$Companion r1 = org.luckypray.dexkit.schema.FieldMeta.Companion
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            java.lang.String r2 = "wrap(it)"
            Yue.C3329.m13905(r4, r2)
            org.luckypray.dexkit.schema.-FieldMeta r4 = r1.getRootAsFieldMeta(r4)
            org.luckypray.dexkit.result.FieldData r4 = r0.from(r3, r4)
            goto L2e
        L2d:
            r4 = 0
        L2e:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.result.FieldData getFieldData(@Yue.InterfaceC4418 java.lang.reflect.Field r2) {
            r1 = this;
            java.lang.String r0 = "field"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            org.luckypray.dexkit.result.FieldData r2 = r1.getFieldData(r2)
            return r2
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList getInvokeMethods$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getInvokeMethods$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getInvokeMethods$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            java.lang.String r0 = "wrap(res)"
            Yue.C3329.m13905(r5, r0)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r5 = r6.getRootAsMethodMetaArrayHolder(r5)
            org.luckypray.dexkit.result.MethodDataList r6 = new org.luckypray.dexkit.result.MethodDataList
            r6.<init>()
            int r0 = r5.getMethodsLength()
            r1 = 0
        L24:
            if (r1 >= r0) goto L39
            org.luckypray.dexkit.result.MethodData$-Companion r2 = org.luckypray.dexkit.result.MethodData.f30807Companion
            org.luckypray.dexkit.schema.-MethodMeta r3 = r5.methods(r1)
            Yue.C3329.m13903(r3)
            org.luckypray.dexkit.result.MethodData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L24
        L39:
            return r6
    }

    public final /* synthetic */ java.util.List getMethodAnnotations$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getMethodAnnotations$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodAnnotations$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.AnnotationMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            java.lang.String r0 = "wrap(res)"
            Yue.C3329.m13905(r5, r0)
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r5 = r6.getRootAsAnnotationMetaArrayHolder(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r5.getAnnotationsLength()
            r1 = 0
        L24:
            if (r1 >= r0) goto L39
            org.luckypray.dexkit.result.AnnotationData$-Companion r2 = org.luckypray.dexkit.result.AnnotationData.f30801Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r3 = r5.annotations(r1)
            Yue.C3329.m13903(r3)
            org.luckypray.dexkit.result.AnnotationData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L24
        L39:
            return r6
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList getMethodByIds$dexkit_android_release(long[] r6) {
            r5 = this;
            java.lang.String r0 = "encodeIdArray"
            Yue.C3329.m13906(r6, r0)
            org.luckypray.dexkit.DexKitBridge$getMethodByIds$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodByIds$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r1 = "wrap(res)"
            Yue.C3329.m13905(r6, r1)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r6 = r0.getRootAsMethodMetaArrayHolder(r6)
            org.luckypray.dexkit.result.MethodDataList r0 = new org.luckypray.dexkit.result.MethodDataList
            r0.<init>()
            int r1 = r6.getMethodsLength()
            r2 = 0
        L29:
            if (r2 >= r1) goto L3e
            org.luckypray.dexkit.result.MethodData$-Companion r3 = org.luckypray.dexkit.result.MethodData.f30807Companion
            org.luckypray.dexkit.schema.-MethodMeta r4 = r6.methods(r2)
            Yue.C3329.m13903(r4)
            org.luckypray.dexkit.result.MethodData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L29
        L3e:
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.result.MethodData getMethodData(@Yue.InterfaceC4418 java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "descriptor"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.wrap.DexMethod r0 = new org.luckypray.dexkit.wrap.DexMethod
            r0.<init>(r4)
            org.luckypray.dexkit.DexKitBridge$getMethodData$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodData$1
            r0.<init>(r4)
            java.lang.Object r4 = r3.withNativeReadToken$dexkit_android_release(r0)
            byte[] r4 = (byte[]) r4
            if (r4 == 0) goto L2d
            org.luckypray.dexkit.result.MethodData$-Companion r0 = org.luckypray.dexkit.result.MethodData.f30807Companion
            org.luckypray.dexkit.schema.-MethodMeta$Companion r1 = org.luckypray.dexkit.schema.MethodMeta.Companion
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            java.lang.String r2 = "wrap(it)"
            Yue.C3329.m13905(r4, r2)
            org.luckypray.dexkit.schema.-MethodMeta r4 = r1.getRootAsMethodMeta(r4)
            org.luckypray.dexkit.result.MethodData r4 = r0.from(r3, r4)
            goto L2e
        L2d:
            r4 = 0
        L2e:
            return r4
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.result.MethodData getMethodData(@Yue.InterfaceC4418 java.lang.reflect.Constructor<?> r2) {
            r1 = this;
            java.lang.String r0 = "constructor"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            org.luckypray.dexkit.result.MethodData r2 = r1.getMethodData(r2)
            return r2
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.result.MethodData getMethodData(@Yue.InterfaceC4418 java.lang.reflect.Method r2) {
            r1 = this;
            java.lang.String r0 = "method"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            org.luckypray.dexkit.result.MethodData r2 = r1.getMethodData(r2)
            return r2
    }

    public final /* synthetic */ java.util.List getMethodOpCodes$dexkit_android_release(long r2) {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge$getMethodOpCodes$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodOpCodes$1
            r0.<init>(r2)
            java.lang.Object r2 = r1.withNativeReadToken$dexkit_android_release(r0)
            int[] r2 = (int[]) r2
            java.util.List r2 = Yue.C0595.m3980(r2)
            return r2
    }

    public final /* synthetic */ java.util.List getMethodUsingFields$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getMethodUsingFields$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodUsingFields$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-UsingFieldMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.UsingFieldMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            java.lang.String r0 = "wrap(res)"
            Yue.C3329.m13905(r5, r0)
            org.luckypray.dexkit.schema.-UsingFieldMetaArrayHolder r5 = r6.getRootAsUsingFieldMetaArrayHolder(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r5.getItemsLength()
            r1 = 0
        L24:
            if (r1 >= r0) goto L39
            org.luckypray.dexkit.result.UsingFieldData$-Companion r2 = org.luckypray.dexkit.result.UsingFieldData.f30808Companion
            org.luckypray.dexkit.schema.-UsingFieldMeta r3 = r5.items(r1)
            Yue.C3329.m13903(r3)
            org.luckypray.dexkit.result.UsingFieldData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L24
        L39:
            return r6
    }

    public final /* synthetic */ java.util.List getMethodUsingStrings$dexkit_android_release(long r2) {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge$getMethodUsingStrings$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodUsingStrings$1
            r0.<init>(r2)
            java.lang.Object r2 = r1.withNativeReadToken$dexkit_android_release(r0)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.List r2 = Yue.C0595.m3982(r2)
            return r2
    }

    public final /* synthetic */ java.util.List getParameterAnnotations$dexkit_android_release(long r10) {
            r9 = this;
            org.luckypray.dexkit.DexKitBridge$getParameterAnnotations$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getParameterAnnotations$res$1
            r0.<init>(r10)
            java.lang.Object r10 = r9.withNativeReadToken$dexkit_android_release(r0)
            byte[] r10 = (byte[]) r10
            org.luckypray.dexkit.schema.-ParametersAnnotationMetaArrayHoler$Companion r11 = org.luckypray.dexkit.schema.ParametersAnnotationMetaArrayHoler.Companion
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r10)
            java.lang.String r0 = "wrap(res)"
            Yue.C3329.m13905(r10, r0)
            org.luckypray.dexkit.schema.-ParametersAnnotationMetaArrayHoler r10 = r11.getRootAsParametersAnnotationMetaArrayHoler(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r0 = r10.getAnnotationsArrayLength()
            r1 = 0
            r2 = r1
        L25:
            if (r2 >= r0) goto L53
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r3 = r10.annotationsArray(r2)
            Yue.C3329.m13903(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r3.getAnnotationsLength()
            r6 = r1
        L38:
            if (r6 >= r5) goto L4d
            org.luckypray.dexkit.result.AnnotationData$-Companion r7 = org.luckypray.dexkit.result.AnnotationData.f30801Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r8 = r3.annotations(r6)
            Yue.C3329.m13903(r8)
            org.luckypray.dexkit.result.AnnotationData r7 = r7.from(r9, r8)
            r4.add(r7)
            int r6 = r6 + 1
            goto L38
        L4d:
            r11.add(r4)
            int r2 = r2 + 1
            goto L25
        L53:
            return r11
    }

    public final /* synthetic */ java.util.List getParameterNames$dexkit_android_release(long r4) {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge$getParameterNames$1 r0 = new org.luckypray.dexkit.DexKitBridge$getParameterNames$1
            r0.<init>(r4)
            java.lang.Object r4 = r3.withNativeReadToken$dexkit_android_release(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            if (r4 == 0) goto L1f
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r4.length
            r5.<init>(r0)
            int r0 = r4.length
            r1 = 0
        L15:
            if (r1 >= r0) goto L20
            r2 = r4[r1]
            r5.add(r2)
            int r1 = r1 + 1
            goto L15
        L1f:
            r5 = 0
        L20:
            return r5
    }

    public final /* synthetic */ org.luckypray.dexkit.result.ClassDataList getTypeByIds$dexkit_android_release(long[] r6) {
            r5 = this;
            java.lang.String r0 = "encodeIdArray"
            Yue.C3329.m13906(r6, r0)
            org.luckypray.dexkit.DexKitBridge$getTypeByIds$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getTypeByIds$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.ClassMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r1 = "wrap(res)"
            Yue.C3329.m13905(r6, r1)
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder r6 = r0.getRootAsClassMetaArrayHolder(r6)
            org.luckypray.dexkit.result.ClassDataList r0 = new org.luckypray.dexkit.result.ClassDataList
            r0.<init>()
            int r1 = r6.getClassesLength()
            r2 = 0
        L29:
            if (r2 >= r1) goto L3e
            org.luckypray.dexkit.result.ClassData$-Companion r3 = org.luckypray.dexkit.result.ClassData.f30805Companion
            org.luckypray.dexkit.schema.-ClassMeta r4 = r6.classes(r2)
            Yue.C3329.m13903(r4)
            org.luckypray.dexkit.result.ClassData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L29
        L3e:
            return r0
    }

    public final void initFullCache() {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge$initFullCache$1 r0 = org.luckypray.dexkit.DexKitBridge.C79061.INSTANCE
            r1.withNativeReadToken$dexkit_android_release(r0)
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

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList readFieldMethods$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$readFieldMethods$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$readFieldMethods$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            java.lang.String r0 = "wrap(res)"
            Yue.C3329.m13905(r5, r0)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r5 = r6.getRootAsMethodMetaArrayHolder(r5)
            org.luckypray.dexkit.result.MethodDataList r6 = new org.luckypray.dexkit.result.MethodDataList
            r6.<init>()
            int r0 = r5.getMethodsLength()
            r1 = 0
        L24:
            if (r1 >= r0) goto L39
            org.luckypray.dexkit.result.MethodData$-Companion r2 = org.luckypray.dexkit.result.MethodData.f30807Companion
            org.luckypray.dexkit.schema.-MethodMeta r3 = r5.methods(r1)
            Yue.C3329.m13903(r3)
            org.luckypray.dexkit.result.MethodData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L24
        L39:
            return r6
    }

    public final void setMaxConcurrentQueries(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            org.luckypray.dexkit.DexKitBridge$setMaxConcurrentQueries$2 r0 = new org.luckypray.dexkit.DexKitBridge$setMaxConcurrentQueries$2
            r0.<init>(r2)
            r1.withNativeWriteToken(r0)
            return
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxConcurrentQueries must be >= 0"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    public final void setThreadNum(int r2) {
            r1 = this;
            if (r2 <= 0) goto Lb
            org.luckypray.dexkit.DexKitBridge$setThreadNum$2 r0 = new org.luckypray.dexkit.DexKitBridge$setThreadNum$2
            r0.<init>(r2)
            r1.withNativeWriteToken(r0)
            return
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "threadNum must be > 0"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    public final /* synthetic */ java.lang.Object withNativeReadToken$dexkit_android_release(Yue.InterfaceC2825 r6) {
            r5 = this;
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r6, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.lifecycleLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            long r1 = r5.token     // Catch: java.lang.Throwable -> L22
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L24
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r6 = r6.invoke(r1)     // Catch: java.lang.Throwable -> L22
            r0.unlock()
            return r6
        L22:
            r6 = move-exception
            goto L30
        L24:
            java.lang.String r6 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L22
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L22
        L30:
            r0.unlock()
            throw r6
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList writeFieldMethods$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$writeFieldMethods$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$writeFieldMethods$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            java.lang.String r0 = "wrap(res)"
            Yue.C3329.m13905(r5, r0)
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r5 = r6.getRootAsMethodMetaArrayHolder(r5)
            org.luckypray.dexkit.result.MethodDataList r6 = new org.luckypray.dexkit.result.MethodDataList
            r6.<init>()
            int r0 = r5.getMethodsLength()
            r1 = 0
        L24:
            if (r1 >= r0) goto L39
            org.luckypray.dexkit.result.MethodData$-Companion r2 = org.luckypray.dexkit.result.MethodData.f30807Companion
            org.luckypray.dexkit.schema.-MethodMeta r3 = r5.methods(r1)
            Yue.C3329.m13903(r3)
            org.luckypray.dexkit.result.MethodData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L24
        L39:
            return r6
    }
}
