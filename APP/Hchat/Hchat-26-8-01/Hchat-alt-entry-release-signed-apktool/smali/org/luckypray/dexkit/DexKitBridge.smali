.class public final Lorg/luckypray/dexkit/DexKitBridge;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final Companion:Lbh/a;


# instance fields
.field private token:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbh/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(Ljava/lang/ClassLoader;Z)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-static {p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J

    move-result-wide p1

    .line 28
    iput-wide p1, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ClassLoader;ZLgg/g;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/ClassLoader;Z)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeInitDexKit(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lgg/g;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>([[B)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-static {p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeInitDexKitByBytesArray([[B)J

    move-result-wide v0

    .line 23
    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    return-void
.end method

.method public synthetic constructor <init>([[BLgg/g;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>([[B)V

    return-void
.end method

.method public static final synthetic access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic access$nativeBatchFindClassUsingStrings(J[B)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeBatchFindClassUsingStrings(J[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeBatchFindMethodUsingStrings(J[B)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeBatchFindMethodUsingStrings(J[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeExportDexFile(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeExportDexFile(JLjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$nativeFieldGetMethods(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFieldGetMethods(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeFieldPutMethods(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFieldPutMethods(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeFindClass(J[B)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindClass(J[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeFindField(J[B)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindField(J[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeFindMethod(J[B)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindMethod(J[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetCallMethods(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetCallMethods(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetClassAnnotations(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassAnnotations(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetClassByIds(J[J)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassByIds(J[J)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetClassData(JLjava/lang/String;)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassData(JLjava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetDexNum(J)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetDexNum(J)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$nativeGetFieldAnnotations(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldAnnotations(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetFieldByIds(J[J)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldByIds(J[J)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetFieldData(JLjava/lang/String;)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldData(JLjava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetInvokeMethods(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetInvokeMethods(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodAnnotations(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodAnnotations(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodByIds(J[J)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodByIds(J[J)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodData(JLjava/lang/String;)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodData(JLjava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodOpCodes(JJ)[I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodOpCodes(JJ)[I

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodUsingFields(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodUsingFields(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetParameterAnnotations(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetParameterAnnotations(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeGetParameterNames(JJ)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetParameterNames(JJ)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nativeInitDexKit(Ljava/lang/String;)J
    .locals 2

    .line 1
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKit(Ljava/lang/String;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic access$nativeInitDexKitByBytesArray([[B)J
    .locals 2

    .line 1
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKitByBytesArray([[B)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic access$nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic access$nativeInitFullCache(J)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitFullCache(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$nativeRelease(J)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeRelease(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$nativeSetThreadNum(JI)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeSetThreadNum(JI)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final batchFindClassUsingStrings(Lfg/l;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhh/j;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    new-instance v0, Lch/a;

    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->batchFindClassUsingStrings(Lch/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final batchFindClassUsingStrings$dexkit_android_release(Lg6/b;)Ljava/util/Map;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg6/b;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhh/j;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 5
    .line 6
    invoke-static/range {p0 .. p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-virtual/range {p1 .. p1}, Lg6/b;->l()[B

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeBatchFindClassUsingStrings(J[B)[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lg6/a;->a()Lg6/a;

    .line 29
    .line 30
    .line 31
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/2addr v2, v1

    .line 42
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    sub-int v1, v2, v1

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    new-instance v4, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x4

    .line 58
    if-ge v6, v3, :cond_0

    .line 59
    .line 60
    add-int/lit8 v7, v1, 0x4

    .line 61
    .line 62
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const/4 v7, 0x0

    .line 68
    :goto_0
    if-eqz v7, :cond_1

    .line 69
    .line 70
    add-int/2addr v7, v2

    .line 71
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    add-int/2addr v8, v7

    .line 76
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    const/4 v7, 0x0

    .line 82
    :goto_1
    const/4 v8, 0x0

    .line 83
    :goto_2
    if-ge v8, v7, :cond_9

    .line 84
    .line 85
    new-instance v9, Ljh/a;

    .line 86
    .line 87
    invoke-direct {v9}, Lg6/c;-><init>()V

    .line 88
    .line 89
    .line 90
    if-ge v6, v3, :cond_2

    .line 91
    .line 92
    add-int/lit8 v10, v1, 0x4

    .line 93
    .line 94
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    goto :goto_3

    .line 99
    :cond_2
    const/4 v10, 0x0

    .line 100
    :goto_3
    if-eqz v10, :cond_3

    .line 101
    .line 102
    add-int/2addr v10, v2

    .line 103
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    add-int/2addr v12, v10

    .line 108
    add-int/2addr v12, v6

    .line 109
    mul-int/lit8 v10, v8, 0x4

    .line 110
    .line 111
    add-int/2addr v10, v12

    .line 112
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    add-int/2addr v12, v10

    .line 117
    invoke-virtual {v9, v12, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_3
    const/4 v9, 0x0

    .line 122
    :goto_4
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v9, v6}, Lg6/c;->b(I)I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-eqz v10, :cond_4

    .line 130
    .line 131
    iget v12, v9, Lg6/c;->a:I

    .line 132
    .line 133
    add-int/2addr v10, v12

    .line 134
    invoke-virtual {v9, v10}, Lg6/c;->d(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    goto :goto_5

    .line 139
    :cond_4
    const/4 v10, 0x0

    .line 140
    :goto_5
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    new-instance v12, Lhh/j;

    .line 144
    .line 145
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    const/4 v13, 0x6

    .line 149
    invoke-virtual {v9, v13}, Lg6/c;->b(I)I

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    if-eqz v14, :cond_5

    .line 154
    .line 155
    invoke-virtual {v9, v14}, Lg6/c;->f(I)I

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    goto :goto_6

    .line 160
    :cond_5
    const/4 v14, 0x0

    .line 161
    :goto_6
    const/4 v15, 0x0

    .line 162
    :goto_7
    if-ge v15, v14, :cond_7

    .line 163
    .line 164
    new-instance v5, Ljh/d;

    .line 165
    .line 166
    invoke-direct {v5}, Lg6/c;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v13}, Lg6/c;->b(I)I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_6

    .line 174
    .line 175
    invoke-virtual {v9, v6}, Lg6/c;->e(I)I

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    mul-int/lit8 v16, v15, 0x4

    .line 180
    .line 181
    add-int v6, v16, v6

    .line 182
    .line 183
    invoke-virtual {v9, v6}, Lg6/c;->a(I)I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    iget-object v11, v9, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 188
    .line 189
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, v6, v11}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 193
    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_6
    const/4 v5, 0x0

    .line 197
    :goto_8
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-object/from16 v6, p0

    .line 201
    .line 202
    invoke-static {v6, v5}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-virtual {v12, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    add-int/lit8 v15, v15, 0x1

    .line 210
    .line 211
    const/4 v6, 0x4

    .line 212
    goto :goto_7

    .line 213
    :cond_7
    move-object/from16 v6, p0

    .line 214
    .line 215
    invoke-virtual {v12}, Ljava/util/AbstractCollection;->size()I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    const/4 v9, 0x1

    .line 220
    if-le v5, v9, :cond_8

    .line 221
    .line 222
    new-instance v5, La9/h;

    .line 223
    .line 224
    const/4 v9, 0x1

    .line 225
    invoke-direct {v5, v9}, La9/h;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-static {v12, v5}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 229
    .line 230
    .line 231
    :cond_8
    invoke-virtual {v4, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    add-int/lit8 v8, v8, 0x1

    .line 235
    .line 236
    const/4 v6, 0x4

    .line 237
    goto/16 :goto_2

    .line 238
    .line 239
    :cond_9
    move-object/from16 v6, p0

    .line 240
    .line 241
    return-object v4
.end method

.method private final batchFindMethodUsingStrings(Lfg/l;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhh/p;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    new-instance v0, Lch/b;

    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->batchFindMethodUsingStrings(Lch/b;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final batchFindMethodUsingStrings$dexkit_android_release(Lg6/b;)Ljava/util/Map;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg6/b;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhh/p;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 5
    .line 6
    invoke-static/range {p0 .. p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-virtual/range {p1 .. p1}, Lg6/b;->l()[B

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeBatchFindMethodUsingStrings(J[B)[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lg6/a;->a()Lg6/a;

    .line 29
    .line 30
    .line 31
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/2addr v2, v1

    .line 42
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    sub-int v1, v2, v1

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    new-instance v4, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x4

    .line 58
    if-ge v6, v3, :cond_0

    .line 59
    .line 60
    add-int/lit8 v7, v1, 0x4

    .line 61
    .line 62
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const/4 v7, 0x0

    .line 68
    :goto_0
    if-eqz v7, :cond_1

    .line 69
    .line 70
    add-int/2addr v7, v2

    .line 71
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    add-int/2addr v8, v7

    .line 76
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    const/4 v7, 0x0

    .line 82
    :goto_1
    const/4 v8, 0x0

    .line 83
    :goto_2
    if-ge v8, v7, :cond_9

    .line 84
    .line 85
    new-instance v9, Ljh/a;

    .line 86
    .line 87
    invoke-direct {v9}, Lg6/c;-><init>()V

    .line 88
    .line 89
    .line 90
    if-ge v6, v3, :cond_2

    .line 91
    .line 92
    add-int/lit8 v10, v1, 0x4

    .line 93
    .line 94
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    goto :goto_3

    .line 99
    :cond_2
    const/4 v10, 0x0

    .line 100
    :goto_3
    if-eqz v10, :cond_3

    .line 101
    .line 102
    add-int/2addr v10, v2

    .line 103
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    add-int/2addr v12, v10

    .line 108
    add-int/2addr v12, v6

    .line 109
    mul-int/lit8 v10, v8, 0x4

    .line 110
    .line 111
    add-int/2addr v10, v12

    .line 112
    invoke-virtual {v0, v10}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    add-int/2addr v12, v10

    .line 117
    invoke-virtual {v9, v12, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_3
    const/4 v9, 0x0

    .line 122
    :goto_4
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v9, v6}, Lg6/c;->b(I)I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-eqz v10, :cond_4

    .line 130
    .line 131
    iget v12, v9, Lg6/c;->a:I

    .line 132
    .line 133
    add-int/2addr v10, v12

    .line 134
    invoke-virtual {v9, v10}, Lg6/c;->d(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    goto :goto_5

    .line 139
    :cond_4
    const/4 v10, 0x0

    .line 140
    :goto_5
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    new-instance v12, Lhh/p;

    .line 144
    .line 145
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    const/4 v13, 0x6

    .line 149
    invoke-virtual {v9, v13}, Lg6/c;->b(I)I

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    if-eqz v14, :cond_5

    .line 154
    .line 155
    invoke-virtual {v9, v14}, Lg6/c;->f(I)I

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    goto :goto_6

    .line 160
    :cond_5
    const/4 v14, 0x0

    .line 161
    :goto_6
    const/4 v15, 0x0

    .line 162
    :goto_7
    if-ge v15, v14, :cond_7

    .line 163
    .line 164
    new-instance v5, Ljh/p;

    .line 165
    .line 166
    invoke-direct {v5}, Lg6/c;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v13}, Lg6/c;->b(I)I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_6

    .line 174
    .line 175
    invoke-virtual {v9, v6}, Lg6/c;->e(I)I

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    mul-int/lit8 v16, v15, 0x4

    .line 180
    .line 181
    add-int v6, v16, v6

    .line 182
    .line 183
    invoke-virtual {v9, v6}, Lg6/c;->a(I)I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    iget-object v11, v9, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 188
    .line 189
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, v6, v11}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 193
    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_6
    const/4 v5, 0x0

    .line 197
    :goto_8
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-object/from16 v6, p0

    .line 201
    .line 202
    invoke-static {v6, v5}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-virtual {v12, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    add-int/lit8 v15, v15, 0x1

    .line 210
    .line 211
    const/4 v6, 0x4

    .line 212
    goto :goto_7

    .line 213
    :cond_7
    move-object/from16 v6, p0

    .line 214
    .line 215
    invoke-virtual {v12}, Ljava/util/AbstractCollection;->size()I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    const/4 v9, 0x1

    .line 220
    if-le v5, v9, :cond_8

    .line 221
    .line 222
    new-instance v5, La9/h;

    .line 223
    .line 224
    const/4 v9, 0x2

    .line 225
    invoke-direct {v5, v9}, La9/h;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-static {v12, v5}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 229
    .line 230
    .line 231
    :cond_8
    invoke-virtual {v4, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    add-int/lit8 v8, v8, 0x1

    .line 235
    .line 236
    const/4 v6, 0x4

    .line 237
    goto/16 :goto_2

    .line 238
    .line 239
    :cond_9
    move-object/from16 v6, p0

    .line 240
    .line 241
    return-object v4
.end method

.method public static final create(Ljava/lang/ClassLoader;Z)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 2

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/ClassLoader;ZLgg/g;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static final create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 2

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;Lgg/g;)V

    return-object v0
.end method

.method public static final create([[B)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 2

    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    new-instance v0, Lorg/luckypray/dexkit/DexKitBridge;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>([[BLgg/g;)V

    return-object v0
.end method

.method private final findClass(Lfg/l;)Lhh/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")",
            "Lhh/j;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    new-instance v0, Lch/c;

    .line 102
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 103
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    move-result-object p1

    return-object p1
.end method

.method private final findClass$dexkit_android_release(Lg6/b;)Lhh/j;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 5
    .line 6
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-virtual {p1}, Lg6/b;->l()[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeFindClass(J[B)[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljh/a;

    .line 29
    .line 30
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 34
    .line 35
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    add-int/2addr v2, v1

    .line 44
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 45
    .line 46
    .line 47
    new-instance p1, Lhh/j;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljh/a;->l()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const/4 v2, 0x0

    .line 57
    :goto_0
    if-ge v2, v1, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljh/a;->i(I)Ljh/d;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {p0, v3}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/4 v1, 0x1

    .line 81
    if-le v0, v1, :cond_1

    .line 82
    .line 83
    new-instance v0, La9/h;

    .line 84
    .line 85
    const/4 v1, 0x3

    .line 86
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    return-object p1
.end method

.method private final findField(Lfg/l;)Lhh/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")",
            "Lhh/m;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    new-instance v0, Lch/d;

    .line 111
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 112
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findField(Lch/d;)Lhh/m;

    move-result-object p1

    return-object p1
.end method

.method private final findField$dexkit_android_release(Lg6/b;)Lhh/m;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 5
    .line 6
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-virtual {p1}, Lg6/b;->l()[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeFindField(J[B)[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljh/a;

    .line 29
    .line 30
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 34
    .line 35
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    add-int/2addr v2, v1

    .line 44
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 45
    .line 46
    .line 47
    new-instance p1, Lhh/m;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x4

    .line 53
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    const/4 v2, 0x0

    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lg6/c;->f(I)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move v1, v2

    .line 66
    :goto_0
    if-ge v2, v1, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljh/a;->j(I)Ljh/o;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v3}, Lfb/v0;->r(Lorg/luckypray/dexkit/DexKitBridge;Ljh/o;)Lhh/l;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    const/4 v1, 0x1

    .line 90
    if-le v0, v1, :cond_2

    .line 91
    .line 92
    new-instance v0, La9/h;

    .line 93
    .line 94
    const/4 v1, 0x4

    .line 95
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-object p1
.end method

.method private final findMethod(Lfg/l;)Lhh/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")",
            "Lhh/p;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    new-instance v0, Lch/e;

    .line 102
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 103
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    move-result-object p1

    return-object p1
.end method

.method private final findMethod$dexkit_android_release(Lg6/b;)Lhh/p;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 5
    .line 6
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-virtual {p1}, Lg6/b;->l()[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeFindMethod(J[B)[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljh/a;

    .line 29
    .line 30
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 34
    .line 35
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    add-int/2addr v2, v1

    .line 44
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 45
    .line 46
    .line 47
    new-instance p1, Lhh/p;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljh/a;->m()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const/4 v2, 0x0

    .line 57
    :goto_0
    if-ge v2, v1, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljh/a;->o(I)Ljh/p;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {p0, v3}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/4 v1, 0x1

    .line 81
    if-le v0, v1, :cond_1

    .line 82
    .line 83
    new-instance v0, La9/h;

    .line 84
    .line 85
    const/4 v1, 0x5

    .line 86
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    return-object p1
.end method

.method private final getCallMethods$dexkit_android_release(J)Lhh/p;
    .locals 3

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetCallMethods(JJ)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p2, Ljh/a;

    .line 22
    .line 23
    invoke-direct {p2}, Lg6/c;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v0

    .line 37
    invoke-virtual {p2, v1, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lhh/p;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljh/a;->m()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    :goto_0
    if-ge v1, v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Ljh/a;->o(I)Ljh/p;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object p1
.end method

.method private final getClassAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lhh/a;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetClassAnnotations(JJ)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p2, Ljh/a;

    .line 22
    .line 23
    invoke-direct {p2}, Lg6/c;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v0

    .line 37
    invoke-virtual {p2, v1, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljh/a;->k()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    :goto_0
    if-ge v1, v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Ljh/a;->g(I)Ljh/c;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2}, Lac/p;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljh/c;)Lhh/a;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object p1
.end method

.method private final getFieldAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lhh/a;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetFieldAnnotations(JJ)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p2, Ljh/a;

    .line 22
    .line 23
    invoke-direct {p2}, Lg6/c;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v0

    .line 37
    invoke-virtual {p2, v1, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljh/a;->k()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    :goto_0
    if-ge v1, v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Ljh/a;->g(I)Ljh/c;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2}, Lac/p;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljh/c;)Lhh/a;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object p1
.end method

.method private final getFieldByIds$dexkit_android_release([J)Lhh/m;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 5
    .line 6
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetFieldByIds(J[J)[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljh/a;

    .line 25
    .line 26
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 30
    .line 31
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v2, v1

    .line 40
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lhh/m;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    const/4 v1, 0x4

    .line 49
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v2, 0x0

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lg6/c;->f(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v1, v2

    .line 62
    :goto_0
    if-ge v2, v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljh/a;->j(I)Ljh/o;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v3}, Lfb/v0;->r(Lorg/luckypray/dexkit/DexKitBridge;Ljh/o;)Lhh/l;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    return-object p1
.end method

.method private final getInvokeMethods$dexkit_android_release(J)Lhh/p;
    .locals 3

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetInvokeMethods(JJ)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p2, Ljh/a;

    .line 22
    .line 23
    invoke-direct {p2}, Lg6/c;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v0

    .line 37
    invoke-virtual {p2, v1, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lhh/p;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljh/a;->m()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    :goto_0
    if-ge v1, v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Ljh/a;->o(I)Ljh/p;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object p1
.end method

.method private final getMethodAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lhh/a;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetMethodAnnotations(JJ)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p2, Ljh/a;

    .line 22
    .line 23
    invoke-direct {p2}, Lg6/c;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v0

    .line 37
    invoke-virtual {p2, v1, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljh/a;->k()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    :goto_0
    if-ge v1, v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Ljh/a;->g(I)Ljh/c;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2}, Lac/p;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljh/c;)Lhh/a;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object p1
.end method

.method private final getMethodByIds$dexkit_android_release([J)Lhh/p;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 5
    .line 6
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetMethodByIds(J[J)[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljh/a;

    .line 25
    .line 26
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 30
    .line 31
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v2, v1

    .line 40
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lhh/p;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljh/a;->m()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const/4 v2, 0x0

    .line 53
    :goto_0
    if-ge v2, v1, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljh/a;->o(I)Ljh/p;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v3}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    return-object p1
.end method

.method private final getMethodOpCodes$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetMethodOpCodes(JJ)[I

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ltf/l;->K0([I)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method private final getMethodUsingFields$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lhh/q;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetMethodUsingFields(JJ)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p2, Ljh/a;

    .line 22
    .line 23
    invoke-direct {p2}, Lg6/c;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v0

    .line 37
    invoke-virtual {p2, v1, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x4

    .line 46
    invoke-virtual {p2, v0}, Lg6/c;->b(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v1, 0x0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Lg6/c;->f(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v0, v1

    .line 59
    :goto_0
    if-ge v1, v0, :cond_1

    .line 60
    .line 61
    invoke-virtual {p2, v1}, Ljh/a;->n(I)Ljh/a;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v2}, Lig/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/a;)Lhh/q;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    return-object p1
.end method

.method private final getMethodUsingStrings$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method private final getParameterAnnotations$dexkit_android_release(J)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lhh/a;",
            ">;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetParameterAnnotations(JJ)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p2, Ljh/a;

    .line 22
    .line 23
    invoke-direct {p2}, Lg6/c;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v0

    .line 37
    invoke-virtual {p2, v1, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x4

    .line 46
    invoke-virtual {p2, v0}, Lg6/c;->b(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v1, 0x0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Lg6/c;->f(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v0, v1

    .line 59
    :goto_0
    move v2, v1

    .line 60
    :goto_1
    if-ge v2, v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p2, v2}, Ljh/a;->h(I)Ljh/a;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v4, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljh/a;->k()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    move v6, v1

    .line 79
    :goto_2
    if-ge v6, v5, :cond_1

    .line 80
    .line 81
    invoke-virtual {v3, v6}, Ljh/a;->g(I)Ljh/c;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v7}, Lac/p;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljh/c;)Lhh/a;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    add-int/lit8 v6, v6, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_1
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    return-object p1
.end method

.method private final getParameterNames$dexkit_android_release(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetParameterNames(JJ)[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance p2, Ljava/util/ArrayList;

    .line 17
    .line 18
    array-length v0, p1

    .line 19
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    array-length v0, p1

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-ge v1, v0, :cond_0

    .line 25
    .line 26
    aget-object v2, p1, v1

    .line 27
    .line 28
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-object p2

    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    return-object p1
.end method

.method private final getSafeToken()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-string v0, "DexKitBridge is not valid"

    .line 11
    .line 12
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    return-wide v0
.end method

.method private final getTypeByIds$dexkit_android_release([J)Lhh/j;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 5
    .line 6
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-static {v0, v1, v2, p1}, Lbh/a;->a(Lbh/a;J[J)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljh/a;

    .line 22
    .line 23
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v1

    .line 37
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lhh/j;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljh/a;->l()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x0

    .line 50
    :goto_0
    if-ge v2, v1, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljh/a;->i(I)Ljh/d;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v3}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object p1
.end method

.method private static final native nativeBatchFindClassUsingStrings(J[B)[B
.end method

.method private static final native nativeBatchFindMethodUsingStrings(J[B)[B
.end method

.method private static final native nativeExportDexFile(JLjava/lang/String;)V
.end method

.method private static final native nativeFieldGetMethods(JJ)[B
.end method

.method private static final native nativeFieldPutMethods(JJ)[B
.end method

.method private static final native nativeFindClass(J[B)[B
.end method

.method private static final native nativeFindField(J[B)[B
.end method

.method private static final native nativeFindMethod(J[B)[B
.end method

.method private static final native nativeGetCallMethods(JJ)[B
.end method

.method private static final native nativeGetClassAnnotations(JJ)[B
.end method

.method private static final native nativeGetClassByIds(J[J)[B
.end method

.method private static final native nativeGetClassData(JLjava/lang/String;)[B
.end method

.method private static final native nativeGetDexNum(J)I
.end method

.method private static final native nativeGetFieldAnnotations(JJ)[B
.end method

.method private static final native nativeGetFieldByIds(J[J)[B
.end method

.method private static final native nativeGetFieldData(JLjava/lang/String;)[B
.end method

.method private static final native nativeGetInvokeMethods(JJ)[B
.end method

.method private static final native nativeGetMethodAnnotations(JJ)[B
.end method

.method private static final native nativeGetMethodByIds(J[J)[B
.end method

.method private static final native nativeGetMethodData(JLjava/lang/String;)[B
.end method

.method private static final native nativeGetMethodOpCodes(JJ)[I
.end method

.method private static final native nativeGetMethodUsingFields(JJ)[B
.end method

.method private static final native nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;
.end method

.method private static final native nativeGetParameterAnnotations(JJ)[B
.end method

.method private static final native nativeGetParameterNames(JJ)[Ljava/lang/String;
.end method

.method private static final native nativeInitDexKit(Ljava/lang/String;)J
.end method

.method private static final native nativeInitDexKitByBytesArray([[B)J
.end method

.method private static final native nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J
.end method

.method private static final native nativeInitFullCache(J)V
.end method

.method private static final native nativeRelease(J)V
.end method

.method private static final native nativeSetThreadNum(JI)V
.end method

.method private final readFieldMethods$dexkit_android_release(J)Lhh/p;
    .locals 3

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeFieldGetMethods(JJ)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p2, Ljh/a;

    .line 22
    .line 23
    invoke-direct {p2}, Lg6/c;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v0

    .line 37
    invoke-virtual {p2, v1, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lhh/p;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljh/a;->m()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    :goto_0
    if-ge v1, v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Ljh/a;->o(I)Ljh/p;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object p1
.end method

.method private final writeFieldMethods$dexkit_android_release(J)Lhh/p;
    .locals 3

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeFieldPutMethods(JJ)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p2, Ljh/a;

    .line 22
    .line 23
    invoke-direct {p2}, Lg6/c;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v0

    .line 37
    invoke-virtual {p2, v1, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lhh/p;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljh/a;->m()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    :goto_0
    if-ge v1, v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Ljh/a;->o(I)Ljh/p;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object p1
.end method


# virtual methods
.method public final batchFindClassUsingStrings(Lch/a;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch/a;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhh/j;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lg6/a;->a()Lg6/a;

    .line 5
    .line 6
    .line 7
    const/16 p1, 0x400

    .line 8
    .line 9
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/lang/IllegalAccessException;

    .line 23
    .line 24
    const-string v0, "searchGroups not be empty"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public final batchFindMethodUsingStrings(Lch/b;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch/b;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhh/p;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lg6/a;->a()Lg6/a;

    .line 5
    .line 6
    .line 7
    const/16 p1, 0x400

    .line 8
    .line 9
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/lang/IllegalAccessException;

    .line 23
    .line 24
    const-string v0, "searchGroups not be empty"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->isValid()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 9
    .line 10
    iget-wide v1, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeRelease(J)V

    .line 16
    .line 17
    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public final exportDexFile(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 5
    .line 6
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeExportDexFile(JLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final findClass(Lch/c;)Lhh/j;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg6/b;

    .line 5
    .line 6
    invoke-direct {v0}, Lg6/b;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lch/c;->G(Lg6/b;)I

    .line 10
    .line 11
    .line 12
    sget-object p1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 13
    .line 14
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0}, Lg6/b;->l()[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeFindClass(J[B)[B

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, Ljh/a;

    .line 37
    .line 38
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 42
    .line 43
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/2addr v2, v1

    .line 52
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lhh/j;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljh/a;->l()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const/4 v2, 0x0

    .line 65
    :goto_0
    if-ge v2, v1, :cond_0

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljh/a;->i(I)Ljh/d;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {p0, v3}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    const/4 v1, 0x1

    .line 89
    if-le v0, v1, :cond_1

    .line 90
    .line 91
    new-instance v0, La9/h;

    .line 92
    .line 93
    const/4 v1, 0x3

    .line 94
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    return-object p1
.end method

.method public final findField(Lch/d;)Lhh/m;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg6/b;

    .line 5
    .line 6
    invoke-direct {v0}, Lg6/b;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lch/d;->G(Lg6/b;)I

    .line 10
    .line 11
    .line 12
    sget-object p1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 13
    .line 14
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0}, Lg6/b;->l()[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeFindField(J[B)[B

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, Ljh/a;

    .line 37
    .line 38
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 42
    .line 43
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/2addr v2, v1

    .line 52
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lhh/m;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x4

    .line 61
    invoke-virtual {v0, v1}, Lg6/c;->b(I)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lg6/c;->f(I)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move v1, v2

    .line 74
    :goto_0
    if-ge v2, v1, :cond_1

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljh/a;->j(I)Ljh/o;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v3}, Lfb/v0;->r(Lorg/luckypray/dexkit/DexKitBridge;Ljh/o;)Lhh/l;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const/4 v1, 0x1

    .line 98
    if-le v0, v1, :cond_2

    .line 99
    .line 100
    new-instance v0, La9/h;

    .line 101
    .line 102
    const/4 v1, 0x4

    .line 103
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-static {p1, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    return-object p1
.end method

.method public final findMethod(Lch/e;)Lhh/p;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg6/b;

    .line 5
    .line 6
    invoke-direct {v0}, Lg6/b;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lch/e;->G(Lg6/b;)I

    .line 10
    .line 11
    .line 12
    sget-object p1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 13
    .line 14
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0}, Lg6/b;->l()[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeFindMethod(J[B)[B

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, Ljh/a;

    .line 37
    .line 38
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 42
    .line 43
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/2addr v2, v1

    .line 52
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lhh/p;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljh/a;->m()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const/4 v2, 0x0

    .line 65
    :goto_0
    if-ge v2, v1, :cond_0

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljh/a;->o(I)Ljh/p;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {p0, v3}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    const/4 v1, 0x1

    .line 89
    if-le v0, v1, :cond_1

    .line 90
    .line 91
    new-instance v0, La9/h;

    .line 92
    .line 93
    const/4 v1, 0x5

    .line 94
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    return-object p1
.end method

.method public final getClassData(Ljava/lang/Class;)Lhh/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lhh/i;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    invoke-static {p1}, Lkh/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    .line 117
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getClassData(Ljava/lang/String;)Lhh/i;

    move-result-object p1

    return-object p1
.end method

.method public final getClassData(Ljava/lang/String;)Lhh/i;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x4c

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Log/m;->u0(Ljava/lang/CharSequence;)C

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x3b

    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/16 v0, 0x2e

    .line 29
    .line 30
    const/16 v1, 0x2f

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v1, "L"

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, ";"

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :goto_0
    invoke-static {p1}, Lkh/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 62
    .line 63
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    .line 64
    .line 65
    .line 66
    move-result-wide v1

    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetClassData(JLjava/lang/String;)[B

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v0, Ljh/d;

    .line 84
    .line 85
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 86
    .line 87
    .line 88
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 89
    .line 90
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    add-int/2addr v2, v1

    .line 99
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0, v0}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    :cond_1
    const/4 p1, 0x0

    .line 108
    return-object p1

    .line 109
    :cond_2
    const-string p1, "Char sequence is empty."

    .line 110
    .line 111
    invoke-static {p1}, Lj8/o;->l(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const/4 p1, 0x0

    .line 115
    return-object p1
.end method

.method public final getDexNum()I
    .locals 3

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetDexNum(J)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final getFieldData(Ljava/lang/String;)Lhh/l;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    new-instance v0, Llh/b;

    invoke-direct {v0, p1}, Llh/b;-><init>(Ljava/lang/String;)V

    .line 66
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    move-result-wide v1

    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetFieldData(JLjava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_0

    .line 69
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    new-instance v0, Ljh/o;

    .line 71
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 72
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 73
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    move-result v1

    .line 74
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v2, v1

    .line 75
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 76
    invoke-static {p0, v0}, Lfb/v0;->r(Lorg/luckypray/dexkit/DexKitBridge;Ljh/o;)Lhh/l;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getFieldData(Ljava/lang/reflect/Field;)Lhh/l;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkh/b;->a:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lkh/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "->"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ":"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkh/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getFieldData(Ljava/lang/String;)Lhh/l;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
.end method

.method public final getMethodData(Ljava/lang/String;)Lhh/o;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Llh/d;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Llh/d;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 10
    .line 11
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeGetMethodData(JLjava/lang/String;)[B

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljh/p;

    .line 32
    .line 33
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 34
    .line 35
    .line 36
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 37
    .line 38
    invoke-static {p1, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v1

    .line 47
    invoke-virtual {v0, v2, p1}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v0}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :cond_0
    const/4 p1, 0x0

    .line 56
    return-object p1
.end method

.method public final getMethodData(Ljava/lang/reflect/Constructor;)Lhh/o;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lhh/o;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    sget-object v0, Lkh/b;->a:Ljava/util/LinkedHashMap;

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lkh/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    const-string v1, "-><init>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-static {p1}, Lkh/b;->a(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 63
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getMethodData(Ljava/lang/String;)Lhh/o;

    move-result-object p1

    return-object p1
.end method

.method public final getMethodData(Ljava/lang/reflect/Method;)Lhh/o;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    invoke-static {p1}, Lkh/b;->b(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->getMethodData(Ljava/lang/String;)Lhh/o;

    move-result-object p1

    return-object p1
.end method

.method public final initFullCache()V
    .locals 3

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeInitFullCache(J)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final isValid()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final setThreadNum(I)V
    .locals 3

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitBridge;->getSafeToken()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->access$nativeSetThreadNum(JI)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
