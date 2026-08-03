.class public final Lorg/luckypray/dexkit/result/MethodData$-Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
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

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;
    .locals 11
    .param p1    # Lorg/luckypray/dexkit/DexKitBridge;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/schema/-MethodMeta;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "bridge"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methodMeta"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getAccessFlags-pVg5ArA()I

    move-result v0

    const/high16 v1, 0x20000

    and-int v2, v0, v1

    if-lez v2, :cond_0

    xor-int/2addr v0, v1

    or-int/lit8 v0, v0, 0x20

    :cond_0
    move v6, v0

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getId-pVg5ArA()I

    move-result v3

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getDexId-pVg5ArA()I

    move-result v4

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getClassId-pVg5ArA()I

    move-result v5

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getDexDescriptor()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    move-object v7, v0

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getReturnType-pVg5ArA()I

    move-result v8

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-MethodMeta;->getParameterTypesLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-MethodMeta;->parameterTypes(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    new-instance p2, Lorg/luckypray/dexkit/result/MethodData;

    const/4 v10, 0x0

    move-object v1, p2

    move-object v2, p1

    invoke-direct/range {v1 .. v10}, Lorg/luckypray/dexkit/result/MethodData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;LYue/ۥ۟ۨۥۢ;)V

    return-object p2
.end method
