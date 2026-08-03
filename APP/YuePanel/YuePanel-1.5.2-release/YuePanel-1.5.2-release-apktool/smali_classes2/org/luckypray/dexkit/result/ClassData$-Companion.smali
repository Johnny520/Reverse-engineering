.class public final Lorg/luckypray/dexkit/result/ClassData$-Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0008j\u0002`\t\u00a8\u0006\n"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/ClassData$-Companion;",
        "",
        "()V",
        "from",
        "Lorg/luckypray/dexkit/result/ClassData;",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "classMeta",
        "Lorg/luckypray/dexkit/schema/-ClassMeta;",
        "Lorg/luckypray/dexkit/InnerClassMeta;",
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

.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nClassData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$-Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n1#2:295\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/ClassData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClassData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$-Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n1#2:295\n*E\n"
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 13
    .param p1    # Lorg/luckypray/dexkit/DexKitBridge;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/schema/-ClassMeta;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "bridge"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classMeta"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getId-pVg5ArA()I

    move-result v3

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getDexId-pVg5ArA()I

    move-result v4

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getSourceFile()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, v0

    :goto_0
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getAccessFlags-pVg5ArA()I

    move-result v6

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getDexDescriptor()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, v0

    :goto_1
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getSuperClass-pVg5ArA()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    :goto_2
    move-object v8, v0

    goto :goto_3

    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :goto_3
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getInterfacesLength()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_4
    if-ge v2, v0, :cond_3

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->interfaces(I)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_3
    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getMethodsLength()I

    move-result v0

    move v2, v1

    :goto_5
    if-ge v2, v0, :cond_4

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->methods(I)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_4
    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getFieldsLength()I

    move-result v0

    :goto_6
    if-ge v1, v0, :cond_5

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;->fields(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v11, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_5
    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    new-instance p2, Lorg/luckypray/dexkit/result/ClassData;

    const/4 v12, 0x0

    move-object v1, p2

    move-object v2, p1

    invoke-direct/range {v1 .. v12}, Lorg/luckypray/dexkit/result/ClassData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;LYue/ۥ۟ۨۥۢ;)V

    return-object p2
.end method
