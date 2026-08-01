.class public final Lorg/luckypray/dexkit/DexKitBridge;
.super Ljava/lang/Object;
.source "DexKitBridge.kt"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/DexKitBridge$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDexKitBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitBridge.kt\norg/luckypray/dexkit/DexKitBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,735:1\n1000#2,2:736\n1000#2,2:738\n1000#2,2:740\n1000#2,2:742\n1000#2,2:744\n11328#3:746\n11663#3,3:747\n*S KotlinDebug\n*F\n+ 1 DexKitBridge.kt\norg/luckypray/dexkit/DexKitBridge\n*L\n368#1:736,2\n389#1:738,2\n406#1:740,2\n421#1:742,2\n436#1:744,2\n508#1:746\n508#1:747,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0016\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0018\u0000 o2\u00020\u0001:\u0001oB\u000f\u0008\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0015\u0008\u0012\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\u0008B\u0017\u0008\u0012\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0081\u0008\u00a2\u0006\u0002\u0008\u001aJ\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001b\u001a\u00020\u001cJ1\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00162\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0002\u0008 H\u0087\u0008\u00f8\u0001\u0000J\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0081\u0008\u00a2\u0006\u0002\u0008#J\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0\u00162\u0006\u0010\u001b\u001a\u00020$J1\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0\u00162\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0002\u0008 H\u0087\u0008\u00f8\u0001\u0000J\u0008\u0010%\u001a\u00020\u001fH\u0016J\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020\u0003J\u0008\u0010(\u001a\u00020\u001fH\u0004J\u0016\u0010)\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0081\u0008\u00a2\u0006\u0002\u0008*J\u000e\u0010)\u001a\u00020\u00172\u0006\u0010)\u001a\u00020+J%\u0010)\u001a\u00020\u00172\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0002\u0008 H\u0087\u0008\u00f8\u0001\u0000J\u0016\u0010,\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020\u0019H\u0081\u0008\u00a2\u0006\u0002\u0008.J\u000e\u0010,\u001a\u00020-2\u0006\u0010,\u001a\u00020/J%\u0010,\u001a\u00020-2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0002\u0008 H\u0087\u0008\u00f8\u0001\u0000J\u0016\u00100\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0019H\u0081\u0008\u00a2\u0006\u0002\u00081J\u000e\u00100\u001a\u00020\"2\u0006\u00100\u001a\u000202J%\u00100\u001a\u00020\"2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0002\u0008 H\u0087\u0008\u00f8\u0001\u0000J\u0016\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u00085J\u001c\u00106\u001a\u0008\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u0008:J\u0014\u0010;\u001a\u0004\u0018\u00010<2\n\u0010=\u001a\u0006\u0012\u0002\u0008\u00030>J\u0010\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020\u0003J\u0006\u0010@\u001a\u00020AJ\u001c\u0010B\u001a\u0008\u0012\u0004\u0012\u000208072\u0006\u0010C\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u0008DJ\u0016\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020GH\u0081\u0008\u00a2\u0006\u0002\u0008HJ\u0010\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020LJ\u0010\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010M\u001a\u00020\u0003J\u0016\u0010N\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u0008OJ\u001c\u0010P\u001a\u0008\u0012\u0004\u0012\u000208072\u0006\u0010Q\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u0008RJ\u0016\u0010S\u001a\u00020\"2\u0006\u0010F\u001a\u00020GH\u0081\u0008\u00a2\u0006\u0002\u0008TJ\u0014\u0010U\u001a\u0004\u0018\u00010V2\n\u0010W\u001a\u0006\u0012\u0002\u0008\u00030XJ\u0010\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010Y\u001a\u00020ZJ\u0010\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010M\u001a\u00020\u0003J\u001c\u0010[\u001a\u0008\u0012\u0004\u0012\u00020A072\u0006\u00104\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u0008\\J\u001c\u0010]\u001a\u0008\u0012\u0004\u0012\u00020^072\u0006\u00104\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u0008_J\u001c\u0010`\u001a\u0008\u0012\u0004\u0012\u00020\u0003072\u0006\u00104\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u0008aJ\"\u0010b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020807072\u0006\u0010Q\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u0008cJ \u0010d\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001072\u0006\u00104\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u0008eJ\u0016\u0010f\u001a\u00020\u00172\u0006\u0010F\u001a\u00020GH\u0081\u0008\u00a2\u0006\u0002\u0008gJ\u0006\u0010h\u001a\u00020\u001fJ\u0016\u0010i\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u0008jJ\u000e\u0010k\u001a\u00020\u001f2\u0006\u0010l\u001a\u00020AJ\u0016\u0010m\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0011H\u0081\u0008\u00a2\u0006\u0002\u0008nR\u0011\u0010\u000e\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006p"
    }
    d2 = {
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "Ljava/io/Closeable;",
        "apkPath",
        "",
        "(Ljava/lang/String;)V",
        "dexBytesArray",
        "",
        "",
        "([[B)V",
        "classLoader",
        "Ljava/lang/ClassLoader;",
        "useMemoryDexFile",
        "",
        "(Ljava/lang/ClassLoader;Z)V",
        "isValid",
        "()Z",
        "safeToken",
        "",
        "getSafeToken",
        "()J",
        "token",
        "batchFindClassUsingStrings",
        "",
        "Lorg/luckypray/dexkit/result/ClassDataList;",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "batchFindClassUsingStrings$dexkit_android_release",
        "batchFind",
        "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "batchFindMethodUsingStrings",
        "Lorg/luckypray/dexkit/result/MethodDataList;",
        "batchFindMethodUsingStrings$dexkit_android_release",
        "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;",
        "close",
        "exportDexFile",
        "outPath",
        "finalize",
        "findClass",
        "findClass$dexkit_android_release",
        "Lorg/luckypray/dexkit/query/FindClass;",
        "findField",
        "Lorg/luckypray/dexkit/result/FieldDataList;",
        "findField$dexkit_android_release",
        "Lorg/luckypray/dexkit/query/FindField;",
        "findMethod",
        "findMethod$dexkit_android_release",
        "Lorg/luckypray/dexkit/query/FindMethod;",
        "getCallMethods",
        "encodeId",
        "getCallMethods$dexkit_android_release",
        "getClassAnnotations",
        "",
        "Lorg/luckypray/dexkit/result/AnnotationData;",
        "classId",
        "getClassAnnotations$dexkit_android_release",
        "getClassData",
        "Lorg/luckypray/dexkit/result/ClassData;",
        "clazz",
        "Ljava/lang/Class;",
        "identifier",
        "getDexNum",
        "",
        "getFieldAnnotations",
        "fieldId",
        "getFieldAnnotations$dexkit_android_release",
        "getFieldByIds",
        "encodeIdArray",
        "",
        "getFieldByIds$dexkit_android_release",
        "getFieldData",
        "Lorg/luckypray/dexkit/result/FieldData;",
        "field",
        "Ljava/lang/reflect/Field;",
        "descriptor",
        "getInvokeMethods",
        "getInvokeMethods$dexkit_android_release",
        "getMethodAnnotations",
        "methodId",
        "getMethodAnnotations$dexkit_android_release",
        "getMethodByIds",
        "getMethodByIds$dexkit_android_release",
        "getMethodData",
        "Lorg/luckypray/dexkit/result/MethodData;",
        "constructor",
        "Ljava/lang/reflect/Constructor;",
        "method",
        "Ljava/lang/reflect/Method;",
        "getMethodOpCodes",
        "getMethodOpCodes$dexkit_android_release",
        "getMethodUsingFields",
        "Lorg/luckypray/dexkit/result/UsingFieldData;",
        "getMethodUsingFields$dexkit_android_release",
        "getMethodUsingStrings",
        "getMethodUsingStrings$dexkit_android_release",
        "getParameterAnnotations",
        "getParameterAnnotations$dexkit_android_release",
        "getParameterNames",
        "getParameterNames$dexkit_android_release",
        "getTypeByIds",
        "getTypeByIds$dexkit_android_release",
        "initFullCache",
        "readFieldMethods",
        "readFieldMethods$dexkit_android_release",
        "setThreadNum",
        "num",
        "writeFieldMethods",
        "writeFieldMethods$dexkit_android_release",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;


# instance fields
.field private token:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/ClassLoader;Z)V
    .locals 2
    .param p1, "classLoader"    # Ljava/lang/ClassLoader;
    .param p2, "useMemoryDexFile"    # Z

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitDexKitByClassLoader(Lorg/luckypray/dexkit/DexKitBridge$Companion;Ljava/lang/ClassLoader;Z)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 79
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ClassLoader;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/ClassLoader;Z)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1, "apkPath"    # Ljava/lang/String;

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitDexKit(Lorg/luckypray/dexkit/DexKitBridge$Companion;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 71
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>([[B)V
    .locals 2
    .param p1, "dexBytesArray"    # [[B

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitDexKitByBytesArray(Lorg/luckypray/dexkit/DexKitBridge$Companion;[[B)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 75
    return-void
.end method

.method public synthetic constructor <init>([[BLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>([[B)V

    return-void
.end method

.method public static final synthetic access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J
    .locals 2
    .param p0, "$this"    # Lorg/luckypray/dexkit/DexKitBridge;

    .line 50
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$nativeBatchFindClassUsingStrings(J[B)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "bytes"    # [B

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeBatchFindClassUsingStrings(J[B)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeBatchFindMethodUsingStrings(J[B)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "bytes"    # [B

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeBatchFindMethodUsingStrings(J[B)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeExportDexFile(JLjava/lang/String;)V
    .locals 0
    .param p0, "nativePtr"    # J
    .param p2, "outDir"    # Ljava/lang/String;

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeExportDexFile(JLjava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$nativeFieldGetMethods(JJ)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "encodeId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFieldGetMethods(JJ)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeFieldPutMethods(JJ)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "encodeId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFieldPutMethods(JJ)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeFindClass(J[B)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "bytes"    # [B

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindClass(J[B)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeFindField(J[B)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "bytes"    # [B

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindField(J[B)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeFindMethod(J[B)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "bytes"    # [B

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindMethod(J[B)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetCallMethods(JJ)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "encodeId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetCallMethods(JJ)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetClassAnnotations(JJ)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "classId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassAnnotations(JJ)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetClassByIds(J[J)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "ids"    # [J

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassByIds(J[J)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetClassData(JLjava/lang/String;)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "dexDescriptor"    # Ljava/lang/String;

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassData(JLjava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetDexNum(J)I
    .locals 1
    .param p0, "nativePtr"    # J

    .line 50
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetDexNum(J)I

    move-result v0

    return v0
.end method

.method public static final synthetic access$nativeGetFieldAnnotations(JJ)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "fieldId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldAnnotations(JJ)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetFieldByIds(J[J)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "ids"    # [J

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldByIds(J[J)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetFieldData(JLjava/lang/String;)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "dexDescriptor"    # Ljava/lang/String;

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldData(JLjava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetInvokeMethods(JJ)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "encodeId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetInvokeMethods(JJ)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetMethodAnnotations(JJ)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "methodId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodAnnotations(JJ)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetMethodByIds(J[J)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "ids"    # [J

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodByIds(J[J)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetMethodData(JLjava/lang/String;)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "dexDescriptor"    # Ljava/lang/String;

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodData(JLjava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetMethodOpCodes(JJ)[I
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "methodId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodOpCodes(JJ)[I

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetMethodUsingFields(JJ)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "encodeId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodUsingFields(JJ)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "encodeId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetParameterAnnotations(JJ)[B
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "methodId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetParameterAnnotations(JJ)[B

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeGetParameterNames(JJ)[Ljava/lang/String;
    .locals 1
    .param p0, "nativePtr"    # J
    .param p2, "methodId"    # J

    .line 50
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetParameterNames(JJ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$nativeInitDexKit(Ljava/lang/String;)J
    .locals 2
    .param p0, "apkPath"    # Ljava/lang/String;

    .line 50
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKit(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$nativeInitDexKitByBytesArray([[B)J
    .locals 2
    .param p0, "dexBytesArray"    # [[B

    .line 50
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKitByBytesArray([[B)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J
    .locals 2
    .param p0, "loader"    # Ljava/lang/ClassLoader;
    .param p1, "useMemoryDexFile"    # Z

    .line 50
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$nativeInitFullCache(J)V
    .locals 0
    .param p0, "nativePtr"    # J

    .line 50
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitFullCache(J)V

    return-void
.end method

.method public static final synthetic access$nativeRelease(J)V
    .locals 0
    .param p0, "nativePtr"    # J

    .line 50
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeRelease(J)V

    return-void
.end method

.method public static final synthetic access$nativeSetThreadNum(JI)V
    .locals 0
    .param p0, "nativePtr"    # J
    .param p2, "threadNum"    # I

    .line 50
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeSetThreadNum(JI)V

    return-void
.end method

.method private final batchFindClassUsingStrings(Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
    .locals 1
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/ClassDataList;",
            ">;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->batchFindClassUsingStrings(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private final batchFindClassUsingStrings$dexkit_android_release(Lcom/google/flatbuffers/FlatBufferBuilder;)Ljava/util/Map;
    .locals 12
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/flatbuffers/FlatBufferBuilder;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/ClassDataList;",
            ">;"
        }
    .end annotation

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    move-result-object v3

    const-string v4, "fbb.sizedByteArray()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeBatchFindClassUsingStrings(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object v0

    .line 359
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder$Companion;->getRootAsBatchClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;

    move-result-object v1

    .line 360
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 361
    .local v2, "map":Ljava/util/HashMap;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->getItemsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_2

    .line 362
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-BatchClassMeta;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 363
    .local v5, "items":Lorg/luckypray/dexkit/schema/-BatchClassMeta;
    invoke-virtual {v5}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->getUnionKey()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 364
    .local v6, "key":Ljava/lang/String;
    new-instance v7, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v7}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    .line 365
    .local v7, "batchFindMeta":Lorg/luckypray/dexkit/result/ClassDataList;
    const/4 v8, 0x0

    .local v8, "j":I
    invoke-virtual {v5}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->getClassesLength()I

    move-result v9

    :goto_1
    if-ge v8, v9, :cond_0

    .line 366
    sget-object v10, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {v5, v8}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v10, p0, v11}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v10

    invoke-virtual {v7, v10}, Lorg/luckypray/dexkit/result/ClassDataList;->add(Ljava/lang/Object;)Z

    .line 365
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 368
    .end local v8    # "j":I
    :cond_0
    move-object v8, v7

    check-cast v8, Ljava/util/List;

    .local v8, "$this$sortBy$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 736
    .local v9, "$i$f$sortBy":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x1

    if-le v10, v11, :cond_1

    new-instance v10, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1;

    invoke-direct {v10}, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1;-><init>()V

    check-cast v10, Ljava/util/Comparator;

    invoke-static {v8, v10}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 737
    :cond_1
    nop

    .line 369
    .end local v8    # "$this$sortBy$iv":Ljava/util/List;
    .end local v9    # "$i$f$sortBy":I
    move-object v8, v2

    check-cast v8, Ljava/util/Map;

    invoke-interface {v8, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .end local v5    # "items":Lorg/luckypray/dexkit/schema/-BatchClassMeta;
    .end local v6    # "key":Ljava/lang/String;
    .end local v7    # "batchFindMeta":Lorg/luckypray/dexkit/result/ClassDataList;
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 371
    .end local v3    # "i":I
    :cond_2
    move-object v3, v2

    check-cast v3, Ljava/util/Map;

    return-object v3
.end method

.method private final batchFindMethodUsingStrings(Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
    .locals 1
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/MethodDataList;",
            ">;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->batchFindMethodUsingStrings(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private final batchFindMethodUsingStrings$dexkit_android_release(Lcom/google/flatbuffers/FlatBufferBuilder;)Ljava/util/Map;
    .locals 12
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/flatbuffers/FlatBufferBuilder;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/MethodDataList;",
            ">;"
        }
    .end annotation

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    move-result-object v3

    const-string v4, "fbb.sizedByteArray()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeBatchFindMethodUsingStrings(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object v0

    .line 380
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder$Companion;->getRootAsBatchMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;

    move-result-object v1

    .line 381
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 382
    .local v2, "map":Ljava/util/HashMap;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->getItemsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_2

    .line 383
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-BatchMethodMeta;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 384
    .local v5, "items":Lorg/luckypray/dexkit/schema/-BatchMethodMeta;
    invoke-virtual {v5}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->getUnionKey()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 385
    .local v6, "key":Ljava/lang/String;
    new-instance v7, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v7}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 386
    .local v7, "batchFindMeta":Lorg/luckypray/dexkit/result/MethodDataList;
    const/4 v8, 0x0

    .local v8, "j":I
    invoke-virtual {v5}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->getMethodsLength()I

    move-result v9

    :goto_1
    if-ge v8, v9, :cond_0

    .line 387
    sget-object v10, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v5, v8}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v10, p0, v11}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v10

    invoke-virtual {v7, v10}, Lorg/luckypray/dexkit/result/MethodDataList;->add(Ljava/lang/Object;)Z

    .line 386
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 389
    .end local v8    # "j":I
    :cond_0
    move-object v8, v7

    check-cast v8, Ljava/util/List;

    .local v8, "$this$sortBy$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 738
    .local v9, "$i$f$sortBy":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x1

    if-le v10, v11, :cond_1

    new-instance v10, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1;

    invoke-direct {v10}, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1;-><init>()V

    check-cast v10, Ljava/util/Comparator;

    invoke-static {v8, v10}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 739
    :cond_1
    nop

    .line 390
    .end local v8    # "$this$sortBy$iv":Ljava/util/List;
    .end local v9    # "$i$f$sortBy":I
    move-object v8, v2

    check-cast v8, Ljava/util/Map;

    invoke-interface {v8, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .end local v5    # "items":Lorg/luckypray/dexkit/schema/-BatchMethodMeta;
    .end local v6    # "key":Ljava/lang/String;
    .end local v7    # "batchFindMeta":Lorg/luckypray/dexkit/result/MethodDataList;
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 392
    .end local v3    # "i":I
    :cond_2
    move-object v3, v2

    check-cast v3, Ljava/util/Map;

    return-object v3
.end method

.method public static final create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    return-object v0
.end method

.method public static final create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    return-object v0
.end method

.method public static final create([[B)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create([[B)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    return-object v0
.end method

.method private final findClass(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 1
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/FindClass;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/result/ClassDataList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    return-object v0
.end method

.method private final findClass$dexkit_android_release(Lcom/google/flatbuffers/FlatBufferBuilder;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 7
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 400
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    move-result-object v3

    const-string v4, "fbb.sizedByteArray()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindClass(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object v0

    .line 401
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;->getRootAsClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;

    move-result-object v1

    .line 402
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;
    new-instance v2, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    .line 403
    .local v2, "list":Lorg/luckypray/dexkit/result/ClassDataList;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->getClassesLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 404
    sget-object v5, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/ClassDataList;->add(Ljava/lang/Object;)Z

    .line 403
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 406
    .end local v3    # "i":I
    :cond_0
    move-object v3, v2

    check-cast v3, Ljava/util/List;

    .local v3, "$this$sortBy$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 740
    .local v4, "$i$f$sortBy":I
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    if-le v5, v6, :cond_1

    new-instance v5, Lorg/luckypray/dexkit/DexKitBridge$findClass$$inlined$sortBy$1;

    invoke-direct {v5}, Lorg/luckypray/dexkit/DexKitBridge$findClass$$inlined$sortBy$1;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 741
    :cond_1
    nop

    .line 407
    .end local v3    # "$this$sortBy$iv":Ljava/util/List;
    .end local v4    # "$i$f$sortBy":I
    return-object v2
.end method

.method private final findField(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/FindField;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/result/FieldDataList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    return-object v0
.end method

.method private final findField$dexkit_android_release(Lcom/google/flatbuffers/FlatBufferBuilder;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 7
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 430
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    move-result-object v3

    const-string v4, "fbb.sizedByteArray()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindField(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object v0

    .line 431
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;->getRootAsFieldMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;

    move-result-object v1

    .line 432
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;
    new-instance v2, Lorg/luckypray/dexkit/result/FieldDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    .line 433
    .local v2, "list":Lorg/luckypray/dexkit/result/FieldDataList;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->getFieldsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 434
    sget-object v5, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->fields(I)Lorg/luckypray/dexkit/schema/-FieldMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/FieldDataList;->add(Ljava/lang/Object;)Z

    .line 433
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 436
    .end local v3    # "i":I
    :cond_0
    move-object v3, v2

    check-cast v3, Ljava/util/List;

    .local v3, "$this$sortBy$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 744
    .local v4, "$i$f$sortBy":I
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    if-le v5, v6, :cond_1

    new-instance v5, Lorg/luckypray/dexkit/DexKitBridge$findField$$inlined$sortBy$1;

    invoke-direct {v5}, Lorg/luckypray/dexkit/DexKitBridge$findField$$inlined$sortBy$1;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 745
    :cond_1
    nop

    .line 437
    .end local v3    # "$this$sortBy$iv":Ljava/util/List;
    .end local v4    # "$i$f$sortBy":I
    return-object v2
.end method

.method private final findMethod(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/FindMethod;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/result/MethodDataList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    return-object v0
.end method

.method private final findMethod$dexkit_android_release(Lcom/google/flatbuffers/FlatBufferBuilder;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 7
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 415
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    move-result-object v3

    const-string v4, "fbb.sizedByteArray()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindMethod(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object v0

    .line 416
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object v1

    .line 417
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;
    new-instance v2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 418
    .local v2, "list":Lorg/luckypray/dexkit/result/MethodDataList;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 419
    sget-object v5, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/MethodDataList;->add(Ljava/lang/Object;)Z

    .line 418
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 421
    .end local v3    # "i":I
    :cond_0
    move-object v3, v2

    check-cast v3, Ljava/util/List;

    .local v3, "$this$sortBy$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 742
    .local v4, "$i$f$sortBy":I
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    if-le v5, v6, :cond_1

    new-instance v5, Lorg/luckypray/dexkit/DexKitBridge$findMethod$$inlined$sortBy$1;

    invoke-direct {v5}, Lorg/luckypray/dexkit/DexKitBridge$findMethod$$inlined$sortBy$1;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 743
    :cond_1
    nop

    .line 422
    .end local v3    # "$this$sortBy$iv":Ljava/util/List;
    .end local v4    # "$i$f$sortBy":I
    return-object v2
.end method

.method private final getCallMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 7
    .param p1, "encodeId"    # J

    .line 529
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetCallMethods(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object v0

    .line 530
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object v1

    .line 531
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;
    new-instance v2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 532
    .local v2, "list":Lorg/luckypray/dexkit/result/MethodDataList;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 533
    sget-object v5, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/MethodDataList;->add(Ljava/lang/Object;)Z

    .line 532
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 535
    .end local v3    # "i":I
    :cond_0
    return-object v2
.end method

.method private final getClassAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 7
    .param p1, "classId"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    .line 475
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassAnnotations(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object v0

    .line 476
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;->getRootAsAnnotationMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    move-result-object v1

    .line 477
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 478
    .local v2, "list":Ljava/util/List;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 479
    sget-object v5, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 478
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 481
    .end local v3    # "i":I
    :cond_0
    return-object v2
.end method

.method private final getFieldAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 7
    .param p1, "fieldId"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    .line 486
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetFieldAnnotations(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object v0

    .line 487
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;->getRootAsAnnotationMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    move-result-object v1

    .line 488
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 489
    .local v2, "list":Ljava/util/List;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 490
    sget-object v5, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 489
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 492
    .end local v3    # "i":I
    :cond_0
    return-object v2
.end method

.method private final getFieldByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 7
    .param p1, "encodeIdArray"    # [J

    const-string v0, "encodeIdArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 464
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetFieldByIds(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[J)[B

    move-result-object v0

    .line 465
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;->getRootAsFieldMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;

    move-result-object v1

    .line 466
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;
    new-instance v2, Lorg/luckypray/dexkit/result/FieldDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    .line 467
    .local v2, "list":Lorg/luckypray/dexkit/result/FieldDataList;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->getFieldsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 468
    sget-object v5, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->fields(I)Lorg/luckypray/dexkit/schema/-FieldMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/FieldDataList;->add(Ljava/lang/Object;)Z

    .line 467
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 470
    .end local v3    # "i":I
    :cond_0
    return-object v2
.end method

.method private final getInvokeMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 7
    .param p1, "encodeId"    # J

    .line 540
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetInvokeMethods(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object v0

    .line 541
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object v1

    .line 542
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;
    new-instance v2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 543
    .local v2, "list":Lorg/luckypray/dexkit/result/MethodDataList;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 544
    sget-object v5, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/MethodDataList;->add(Ljava/lang/Object;)Z

    .line 543
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 546
    .end local v3    # "i":I
    :cond_0
    return-object v2
.end method

.method private final getMethodAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 7
    .param p1, "methodId"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    .line 497
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodAnnotations(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object v0

    .line 498
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder$Companion;->getRootAsAnnotationMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    move-result-object v1

    .line 499
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 500
    .local v2, "list":Ljava/util/List;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 501
    sget-object v5, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 500
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 503
    .end local v3    # "i":I
    :cond_0
    return-object v2
.end method

.method private final getMethodByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 7
    .param p1, "encodeIdArray"    # [J

    const-string v0, "encodeIdArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 453
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodByIds(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[J)[B

    move-result-object v0

    .line 454
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object v1

    .line 455
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;
    new-instance v2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 456
    .local v2, "list":Lorg/luckypray/dexkit/result/MethodDataList;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 457
    sget-object v5, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/MethodDataList;->add(Ljava/lang/Object;)Z

    .line 456
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 459
    .end local v3    # "i":I
    :cond_0
    return-object v2
.end method

.method private final getMethodOpCodes$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .param p1, "encodeId"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 589
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodOpCodes(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[I

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toList([I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final getMethodUsingFields$dexkit_android_release(J)Ljava/util/List;
    .locals 7
    .param p1, "encodeId"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/UsingFieldData;",
            ">;"
        }
    .end annotation

    .line 556
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodUsingFields(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object v0

    .line 557
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder$Companion;->getRootAsUsingFieldMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;

    move-result-object v1

    .line 558
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 559
    .local v2, "list":Ljava/util/List;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;->getItemsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 560
    sget-object v5, Lorg/luckypray/dexkit/result/UsingFieldData;->-Companion:Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-UsingFieldMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-UsingFieldMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-UsingFieldMeta;)Lorg/luckypray/dexkit/result/UsingFieldData;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 559
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 562
    .end local v3    # "i":I
    :cond_0
    return-object v2
.end method

.method private final getMethodUsingStrings$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .param p1, "encodeId"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 551
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodUsingStrings(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final getParameterAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 11
    .param p1, "methodId"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;>;"
        }
    .end annotation

    .line 513
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetParameterAnnotations(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object v0

    .line 514
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->Companion:Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler$Companion;->getRootAsParametersAnnotationMetaArrayHoler(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;

    move-result-object v1

    .line 515
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 516
    .local v2, "list":Ljava/util/List;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->getAnnotationsArrayLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_1

    .line 517
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-ParametersAnnotationMetaArrayHoler;->annotationsArray(I)Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 518
    .local v5, "item":Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/List;

    .line 519
    .local v6, "annotations":Ljava/util/List;
    const/4 v7, 0x0

    .local v7, "j":I
    invoke-virtual {v5}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->getAnnotationsLength()I

    move-result v8

    :goto_1
    if-ge v7, v8, :cond_0

    .line 520
    sget-object v9, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    invoke-virtual {v5, v7}, Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;->annotations(I)Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v9, p0, v10}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 519
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 522
    .end local v7    # "j":I
    :cond_0
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 516
    .end local v5    # "item":Lorg/luckypray/dexkit/schema/-AnnotationMetaArrayHolder;
    .end local v6    # "annotations":Ljava/util/List;
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 524
    .end local v3    # "i":I
    :cond_1
    return-object v2
.end method

.method private final getParameterNames$dexkit_android_release(J)Ljava/util/List;
    .locals 10
    .param p1, "encodeId"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 508
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetParameterNames(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .local v0, "$this$map$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 746
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 747
    .local v4, "$i$f$mapTo":I
    array-length v5, v3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v3, v6

    .line 748
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 508
    .local v9, "$i$a$-map-DexKitBridge$getParameterNames$1":I
    nop

    .line 748
    .end local v8    # "it":Ljava/lang/String;
    .end local v9    # "$i$a$-map-DexKitBridge$getParameterNames$1":I
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 747
    nop

    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 749
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 746
    nop

    .end local v0    # "$this$map$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$map":I
    goto :goto_1

    .line 508
    :cond_1
    const/4 v2, 0x0

    :goto_1
    return-object v2
.end method

.method private final getSafeToken()J
    .locals 4

    .line 56
    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 59
    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    return-wide v0

    .line 57
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DexKitBridge is not valid"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final getTypeByIds$dexkit_android_release([J)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 7
    .param p1, "encodeIdArray"    # [J

    const-string v0, "encodeIdArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassByIds(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[J)[B

    move-result-object v0

    .line 443
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;->getRootAsClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;

    move-result-object v1

    .line 444
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;
    new-instance v2, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    .line 445
    .local v2, "list":Lorg/luckypray/dexkit/result/ClassDataList;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->getClassesLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 446
    sget-object v5, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/ClassDataList;->add(Ljava/lang/Object;)Z

    .line 445
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 448
    .end local v3    # "i":I
    :cond_0
    return-object v2
.end method

.method private static final native nativeBatchFindClassUsingStrings(J[B)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeBatchFindMethodUsingStrings(J[B)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeExportDexFile(JLjava/lang/String;)V
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeFieldGetMethods(JJ)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeFieldPutMethods(JJ)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeFindClass(J[B)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeFindField(J[B)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeFindMethod(J[B)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetCallMethods(JJ)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetClassAnnotations(JJ)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetClassByIds(J[J)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetClassData(JLjava/lang/String;)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetDexNum(J)I
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetFieldAnnotations(JJ)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetFieldByIds(J[J)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetFieldData(JLjava/lang/String;)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetInvokeMethods(JJ)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetMethodAnnotations(JJ)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetMethodByIds(J[J)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetMethodData(JLjava/lang/String;)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetMethodOpCodes(JJ)[I
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetMethodUsingFields(JJ)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetParameterAnnotations(JJ)[B
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeGetParameterNames(JJ)[Ljava/lang/String;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeInitDexKit(Ljava/lang/String;)J
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeInitDexKitByBytesArray([[B)J
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeInitFullCache(J)V
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeRelease(J)V
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private static final native nativeSetThreadNum(JI)V
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private final readFieldMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 7
    .param p1, "encodeId"    # J

    .line 567
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFieldGetMethods(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object v0

    .line 568
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object v1

    .line 569
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;
    new-instance v2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 570
    .local v2, "list":Lorg/luckypray/dexkit/result/MethodDataList;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 571
    sget-object v5, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/MethodDataList;->add(Ljava/lang/Object;)Z

    .line 570
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 573
    .end local v3    # "i":I
    :cond_0
    return-object v2
.end method

.method private final writeFieldMethods$dexkit_android_release(J)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 7
    .param p1, "encodeId"    # J

    .line 578
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFieldPutMethods(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object v0

    .line 579
    .local v0, "res":[B
    sget-object v1, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v3, "wrap(res)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object v1

    .line 580
    .local v1, "holder":Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;
    new-instance v2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    .line 581
    .local v2, "list":Lorg/luckypray/dexkit/result/MethodDataList;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 582
    sget-object v5, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/MethodDataList;->add(Ljava/lang/Object;)Z

    .line 581
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 584
    .end local v3    # "i":I
    :cond_0
    return-object v2
.end method


# virtual methods
.method public final batchFindClassUsingStrings(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;)Ljava/util/Map;
    .locals 13
    .param p1, "batchFind"    # Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/ClassDataList;",
            ">;"
        }
    .end annotation

    const-string v0, "batchFind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    new-instance v0, Lcom/google/flatbuffers/FlatBufferBuilder;

    invoke-direct {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>()V

    .line 151
    .local v0, "fbb":Lcom/google/flatbuffers/FlatBufferBuilder;
    move-object v1, p1

    check-cast v1, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v1, v0}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    .line 152
    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    move-result-object v4

    const-string v5, "fbb.sizedByteArray()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v4}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeBatchFindClassUsingStrings(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object v1

    sget-object v2, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder$Companion;

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v3, "wrap(res)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder$Companion;->getRootAsBatchClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->getItemsLength()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-virtual {v1, v5}, Lorg/luckypray/dexkit/schema/-BatchClassMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-BatchClassMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->getUnionKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v8, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v8}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    invoke-virtual {v6}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->getClassesLength()I

    move-result v9

    move v10, v4

    :goto_1
    if-ge v10, v9, :cond_0

    sget-object v11, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {v6, v10}, Lorg/luckypray/dexkit/schema/-BatchClassMeta;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v11, p0, v12}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v11

    invoke-virtual {v8, v11}, Lorg/luckypray/dexkit/result/ClassDataList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_0
    move-object v6, v8

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x1

    if-le v9, v10, :cond_1

    new-instance v9, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1;

    invoke-direct {v9}, Lorg/luckypray/dexkit/DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1;-><init>()V

    check-cast v9, Ljava/util/Comparator;

    invoke-static {v6, v9}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    move-object v6, v2

    check-cast v6, Ljava/util/Map;

    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    check-cast v2, Ljava/util/Map;

    return-object v2
.end method

.method public final batchFindMethodUsingStrings(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;
    .locals 13
    .param p1, "batchFind"    # Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/result/MethodDataList;",
            ">;"
        }
    .end annotation

    const-string v0, "batchFind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    new-instance v0, Lcom/google/flatbuffers/FlatBufferBuilder;

    invoke-direct {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>()V

    .line 165
    .local v0, "fbb":Lcom/google/flatbuffers/FlatBufferBuilder;
    move-object v1, p1

    check-cast v1, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v1, v0}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    .line 166
    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    move-result-object v4

    const-string v5, "fbb.sizedByteArray()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v4}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeBatchFindMethodUsingStrings(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object v1

    sget-object v2, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder$Companion;

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v3, "wrap(res)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder$Companion;->getRootAsBatchMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->getItemsLength()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-virtual {v1, v5}, Lorg/luckypray/dexkit/schema/-BatchMethodMetaArrayHolder;->items(I)Lorg/luckypray/dexkit/schema/-BatchMethodMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->getUnionKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v8, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v8}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {v6}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->getMethodsLength()I

    move-result v9

    move v10, v4

    :goto_1
    if-ge v10, v9, :cond_0

    sget-object v11, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v6, v10}, Lorg/luckypray/dexkit/schema/-BatchMethodMeta;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v11, p0, v12}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v11

    invoke-virtual {v8, v11}, Lorg/luckypray/dexkit/result/MethodDataList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_0
    move-object v6, v8

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x1

    if-le v9, v10, :cond_1

    new-instance v9, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1;

    invoke-direct {v9}, Lorg/luckypray/dexkit/DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1;-><init>()V

    check-cast v9, Ljava/util/Comparator;

    invoke-static {v6, v9}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    move-object v6, v2

    check-cast v6, Ljava/util/Map;

    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    check-cast v2, Ljava/util/Map;

    return-object v2
.end method

.method public declared-synchronized close()V
    .locals 3

    monitor-enter p0

    .line 88
    :try_start_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    iget-wide v1, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    invoke-static {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeRelease(Lorg/luckypray/dexkit/DexKitBridge$Companion;J)V

    .line 90
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .end local p0    # "this":Lorg/luckypray/dexkit/DexKitBridge;
    :cond_0
    monitor-exit p0

    return-void

    .line 87
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final exportDexFile(Ljava/lang/String;)V
    .locals 3
    .param p1, "outPath"    # Ljava/lang/String;

    const-string v0, "outPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeExportDexFile(Lorg/luckypray/dexkit/DexKitBridge$Companion;JLjava/lang/String;)V

    .line 139
    return-void
.end method

.method protected final finalize()V
    .locals 0

    .line 95
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 96
    return-void
.end method

.method public final findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 7
    .param p1, "findClass"    # Lorg/luckypray/dexkit/query/FindClass;

    const-string v0, "findClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    new-instance v0, Lcom/google/flatbuffers/FlatBufferBuilder;

    invoke-direct {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>()V

    .line 179
    .local v0, "fbb":Lcom/google/flatbuffers/FlatBufferBuilder;
    move-object v1, p1

    check-cast v1, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v1, v0}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    .line 180
    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    move-result-object v4

    const-string v5, "fbb.sizedByteArray()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v4}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindClass(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object v1

    sget-object v2, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v3, "wrap(res)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;->getRootAsClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;

    move-result-object v1

    new-instance v2, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->getClassesLength()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    sget-object v5, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/ClassDataList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    move-object v1, v2

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_1

    new-instance v3, Lorg/luckypray/dexkit/DexKitBridge$findClass$$inlined$sortBy$1;

    invoke-direct {v3}, Lorg/luckypray/dexkit/DexKitBridge$findClass$$inlined$sortBy$1;-><init>()V

    check-cast v3, Ljava/util/Comparator;

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    return-object v2
.end method

.method public final findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 7
    .param p1, "findField"    # Lorg/luckypray/dexkit/query/FindField;

    const-string v0, "findField"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    new-instance v0, Lcom/google/flatbuffers/FlatBufferBuilder;

    invoke-direct {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>()V

    .line 207
    .local v0, "fbb":Lcom/google/flatbuffers/FlatBufferBuilder;
    move-object v1, p1

    check-cast v1, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v1, v0}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    .line 208
    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    move-result-object v4

    const-string v5, "fbb.sizedByteArray()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v4}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindField(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object v1

    sget-object v2, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v3, "wrap(res)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder$Companion;->getRootAsFieldMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;

    move-result-object v1

    new-instance v2, Lorg/luckypray/dexkit/result/FieldDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->getFieldsLength()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    sget-object v5, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->fields(I)Lorg/luckypray/dexkit/schema/-FieldMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/FieldDataList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    move-object v1, v2

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_1

    new-instance v3, Lorg/luckypray/dexkit/DexKitBridge$findField$$inlined$sortBy$1;

    invoke-direct {v3}, Lorg/luckypray/dexkit/DexKitBridge$findField$$inlined$sortBy$1;-><init>()V

    check-cast v3, Ljava/util/Comparator;

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    return-object v2
.end method

.method public final findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 7
    .param p1, "findMethod"    # Lorg/luckypray/dexkit/query/FindMethod;

    const-string v0, "findMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    new-instance v0, Lcom/google/flatbuffers/FlatBufferBuilder;

    invoke-direct {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>()V

    .line 193
    .local v0, "fbb":Lcom/google/flatbuffers/FlatBufferBuilder;
    move-object v1, p1

    check-cast v1, Lorg/luckypray/dexkit/query/base/BaseQuery;

    invoke-static {v1, v0}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    .line 194
    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    move-result-object v4

    const-string v5, "fbb.sizedByteArray()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v4}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFindMethod(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[B)[B

    move-result-object v1

    sget-object v2, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v3, "wrap(res)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object v1

    new-instance v2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    sget-object v5, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, v6}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/MethodDataList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    move-object v1, v2

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_1

    new-instance v3, Lorg/luckypray/dexkit/DexKitBridge$findMethod$$inlined$sortBy$1;

    invoke-direct {v3}, Lorg/luckypray/dexkit/DexKitBridge$findMethod$$inlined$sortBy$1;-><init>()V

    check-cast v3, Ljava/util/Comparator;

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    return-object v2
.end method

.method public final getClassData(Ljava/lang/Class;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 1
    .param p1, "clazz"    # Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/luckypray/dexkit/result/ClassData;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->getClassData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v0

    return-object v0
.end method

.method public final getClassData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 8
    .param p1, "identifier"    # Ljava/lang/String;

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->first(Ljava/lang/CharSequence;)C

    move-result v0

    const/16 v1, 0x4c

    if-ne v0, v1, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->last(Ljava/lang/CharSequence;)C

    move-result v0

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_0

    .line 233
    move-object v0, p1

    goto :goto_0

    .line 235
    :cond_0
    const/4 v6, 0x4

    const/4 v7, 0x0

    const/16 v3, 0x2e

    const/16 v4, 0x2f

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "L"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 232
    :goto_0
    nop

    .line 237
    .local v0, "descriptor":Ljava/lang/String;
    new-instance v1, Lorg/luckypray/dexkit/wrap/DexClass;

    invoke-direct {v1, v0}, Lorg/luckypray/dexkit/wrap/DexClass;-><init>(Ljava/lang/String;)V

    .line 238
    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v2

    invoke-static {v1, v2, v3, v0}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassData(Lorg/luckypray/dexkit/DexKitBridge$Companion;JLjava/lang/String;)[B

    move-result-object v1

    if-eqz v1, :cond_1

    .local v1, "it":[B
    const/4 v2, 0x0

    .line 239
    .local v2, "$i$a$-let-DexKitBridge$getClassData$1":I
    sget-object v3, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    sget-object v4, Lorg/luckypray/dexkit/schema/-ClassMeta;->Companion:Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v5

    const-string v6, "wrap(it)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lorg/luckypray/dexkit/schema/-ClassMeta$Companion;->getRootAsClassMeta(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v4

    invoke-virtual {v3, p0, v4}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v1

    .line 238
    .end local v1    # "it":[B
    .end local v2    # "$i$a$-let-DexKitBridge$getClassData$1":I
    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return-object v1
.end method

.method public final getDexNum()I
    .locals 3

    .line 125
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetDexNum(Lorg/luckypray/dexkit/DexKitBridge$Companion;J)I

    move-result v0

    return v0
.end method

.method public final getFieldData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/FieldData;
    .locals 6
    .param p1, "descriptor"    # Ljava/lang/String;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexField;-><init>(Ljava/lang/String;)V

    .line 304
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetFieldData(Lorg/luckypray/dexkit/DexKitBridge$Companion;JLjava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_0

    .local v0, "it":[B
    const/4 v1, 0x0

    .line 305
    .local v1, "$i$a$-let-DexKitBridge$getFieldData$1":I
    sget-object v2, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    sget-object v3, Lorg/luckypray/dexkit/schema/-FieldMeta;->Companion:Lorg/luckypray/dexkit/schema/-FieldMeta$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v4

    const-string v5, "wrap(it)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lorg/luckypray/dexkit/schema/-FieldMeta$Companion;->getRootAsFieldMeta(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-FieldMeta;

    move-result-object v3

    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v0

    .line 304
    .end local v0    # "it":[B
    .end local v1    # "$i$a$-let-DexKitBridge$getFieldData$1":I
    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getFieldData(Ljava/lang/reflect/Field;)Lorg/luckypray/dexkit/result/FieldData;
    .locals 1
    .param p1, "field"    # Ljava/lang/reflect/Field;

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->getFieldData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v0

    return-object v0
.end method

.method public final getMethodData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 6
    .param p1, "descriptor"    # Ljava/lang/String;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/wrap/DexMethod;-><init>(Ljava/lang/String;)V

    .line 277
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetMethodData(Lorg/luckypray/dexkit/DexKitBridge$Companion;JLjava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_0

    .local v0, "it":[B
    const/4 v1, 0x0

    .line 278
    .local v1, "$i$a$-let-DexKitBridge$getMethodData$1":I
    sget-object v2, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    sget-object v3, Lorg/luckypray/dexkit/schema/-MethodMeta;->Companion:Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v4

    const-string v5, "wrap(it)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lorg/luckypray/dexkit/schema/-MethodMeta$Companion;->getRootAsMethodMeta(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v3

    invoke-virtual {v2, p0, v3}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v0

    .line 277
    .end local v0    # "it":[B
    .end local v1    # "$i$a$-let-DexKitBridge$getMethodData$1":I
    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getMethodData(Ljava/lang/reflect/Constructor;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 1
    .param p1, "constructor"    # Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lorg/luckypray/dexkit/result/MethodData;"
        }
    .end annotation

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->getMethodData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v0

    return-object v0
.end method

.method public final getMethodData(Ljava/lang/reflect/Method;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 1
    .param p1, "method"    # Ljava/lang/reflect/Method;

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->getMethodData(Ljava/lang/String;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v0

    return-object v0
.end method

.method public final initFullCache()V
    .locals 3

    .line 105
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeInitFullCache(Lorg/luckypray/dexkit/DexKitBridge$Companion;J)V

    .line 106
    return-void
.end method

.method public final isValid()Z
    .locals 4

    .line 67
    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final setThreadNum(I)V
    .locals 3
    .param p1, "num"    # I

    .line 116
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeSetThreadNum(Lorg/luckypray/dexkit/DexKitBridge$Companion;JI)V

    .line 117
    return-void
.end method
