.class public final Lorg/luckypray/dexkit/result/MethodData$-Companion;
.super Ljava/lang/Object;
.source "MethodData.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/MethodData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\n\u0010\t\u001a\u00060\nj\u0002`\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/MethodData$-Companion;",
        "",
        "()V",
        "ACC_DECLARED_SYNCHRONIZED",
        "",
        "from",
        "Lorg/luckypray/dexkit/result/MethodData;",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "methodMeta",
        "Lorg/luckypray/dexkit/schema/-MethodMeta;",
        "Lorg/luckypray/dexkit/InnerMethodMeta;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 12
    .param p1, "bridge"    # Lorg/luckypray/dexkit/DexKitBridge;
    .param p2, "methodMeta"    # Lorg/luckypray/dexkit/schema/-MethodMeta;

    const-string v0, "bridge"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methodMeta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getAccessFlags-pVg5ArA()I

    move-result v0

    .line 56
    .local v0, "modifiers":I
    const/high16 v1, 0x20000

    and-int v2, v0, v1

    if-lez v2, :cond_0

    .line 57
    xor-int/2addr v1, v0

    or-int/lit8 v0, v1, 0x20

    .line 59
    :cond_0
    nop

    .line 60
    nop

    .line 61
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getId-pVg5ArA()I

    move-result v3

    .line 62
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getDexId-pVg5ArA()I

    move-result v4

    .line 63
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getClassId-pVg5ArA()I

    move-result v5

    .line 64
    nop

    .line 65
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getDexDescriptor()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
    move-object v7, v1

    .line 66
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getReturnType-pVg5ArA()I

    move-result v8

    .line 67
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v9, v1

    check-cast v9, Ljava/util/List;

    move-object v1, v9

    .local v1, "$this$from_u24lambda_u240":Ljava/util/List;
    const/4 v2, 0x0

    .line 68
    .local v2, "$i$a$-apply-MethodData$-Companion$from$1":I
    const/4 v6, 0x0

    .local v6, "i":I
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getParameterTypesLength()I

    move-result v10

    :goto_0
    if-ge v6, v10, :cond_2

    .line 69
    invoke-virtual {p2, v6}, Lorg/luckypray/dexkit/schema/-MethodMeta;->parameterTypes(I)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v1, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 71
    .end local v6    # "i":I
    :cond_2
    nop

    .end local v1    # "$this$from_u24lambda_u240":Ljava/util/List;
    .end local v2    # "$i$a$-apply-MethodData$-Companion$from$1":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 67
    nop

    .line 59
    new-instance v11, Lorg/luckypray/dexkit/result/MethodData;

    const/4 v10, 0x0

    move-object v1, v11

    move-object v2, p1

    move v6, v0

    invoke-direct/range {v1 .. v10}, Lorg/luckypray/dexkit/result/MethodData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11
.end method
