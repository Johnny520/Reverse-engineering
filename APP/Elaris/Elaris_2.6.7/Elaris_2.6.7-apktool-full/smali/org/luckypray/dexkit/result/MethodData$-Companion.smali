.class public final Lorg/luckypray/dexkit/result/MethodData$-Companion;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/MethodData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData$-Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getAccessFlags-pVg5ArA()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/high16 v0, 0x20000

    .line 12
    .line 13
    and-int v1, p0, v0

    .line 14
    .line 15
    if-lez v1, :cond_0

    .line 16
    .line 17
    xor-int/2addr p0, v0

    .line 18
    or-int/lit8 p0, p0, 0x20

    .line 19
    .line 20
    :cond_0
    move v5, p0

    .line 21
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getId-pVg5ArA()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getDexId-pVg5ArA()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getClassId-pVg5ArA()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getDexDescriptor()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    const-string p0, ""

    .line 40
    .line 41
    :cond_1
    move-object v6, p0

    .line 42
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getReturnType-pVg5ArA()I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    new-instance v8, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getParameterTypesLength()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    const/4 v0, 0x0

    .line 56
    :goto_0
    if-ge v0, p0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Lorg/luckypray/dexkit/schema/-MethodMeta;->parameterTypes(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    new-instance v0, Lorg/luckypray/dexkit/result/MethodData;

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    move-object v1, p1

    .line 76
    invoke-direct/range {v0 .. v9}, Lorg/luckypray/dexkit/result/MethodData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;Lr2;)V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method
