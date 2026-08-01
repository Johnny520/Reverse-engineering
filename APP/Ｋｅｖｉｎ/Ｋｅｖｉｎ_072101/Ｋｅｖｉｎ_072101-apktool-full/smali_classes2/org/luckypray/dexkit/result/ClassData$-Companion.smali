.class public final Lorg/luckypray/dexkit/result/ClassData$-Companion;
.super Ljava/lang/Object;
.source "ClassData.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/ClassData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClassData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$-Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,286:1\n1#2:287\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 16
    .param p1, "bridge"    # Lorg/luckypray/dexkit/DexKitBridge;
    .param p2, "classMeta"    # Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-object/from16 v0, p2

    const-string v1, "bridge"

    move-object/from16 v14, p1

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "classMeta"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    nop

    .line 50
    nop

    .line 51
    invoke-virtual/range {p2 .. p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getId-pVg5ArA()I

    move-result v4

    .line 52
    invoke-virtual/range {p2 .. p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getDexId-pVg5ArA()I

    move-result v5

    .line 53
    invoke-virtual/range {p2 .. p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getSourceFile()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object v6, v1

    .line 54
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getAccessFlags-pVg5ArA()I

    move-result v7

    .line 55
    invoke-virtual/range {p2 .. p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getDexDescriptor()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object v8, v1

    .line 56
    :goto_1
    invoke-virtual/range {p2 .. p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getSuperClass-pVg5ArA()I

    move-result v1

    .line 287
    nop

    .local v1, "it":I
    const/4 v2, 0x0

    .line 56
    .local v2, "$i$a$-let-ClassData$-Companion$from$1":I
    const/4 v3, -0x1

    if-ne v1, v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_2
    move-object v9, v3

    .line 57
    .end local v1    # "it":I
    .end local v2    # "$i$a$-let-ClassData$-Companion$from$1":I
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v10, v1

    check-cast v10, Ljava/util/List;

    move-object v1, v10

    .local v1, "$this$from_u24lambda_u241":Ljava/util/List;
    const/4 v2, 0x0

    .line 58
    .local v2, "$i$a$-apply-ClassData$-Companion$from$2":I
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual/range {p2 .. p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getInterfacesLength()I

    move-result v11

    :goto_3
    if-ge v3, v11, :cond_3

    .line 59
    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/schema/-ClassMeta;->interfaces(I)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v1, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 61
    .end local v3    # "i":I
    :cond_3
    nop

    .end local v1    # "$this$from_u24lambda_u241":Ljava/util/List;
    .end local v2    # "$i$a$-apply-ClassData$-Companion$from$2":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 57
    nop

    .line 62
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v11, v1

    check-cast v11, Ljava/util/List;

    move-object v1, v11

    .local v1, "$this$from_u24lambda_u242":Ljava/util/List;
    const/4 v2, 0x0

    .line 63
    .local v2, "$i$a$-apply-ClassData$-Companion$from$3":I
    const/4 v3, 0x0

    .restart local v3    # "i":I
    invoke-virtual/range {p2 .. p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getMethodsLength()I

    move-result v12

    :goto_4
    if-ge v3, v12, :cond_4

    .line 64
    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/schema/-ClassMeta;->methods(I)I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v1, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 66
    .end local v3    # "i":I
    :cond_4
    nop

    .end local v1    # "$this$from_u24lambda_u242":Ljava/util/List;
    .end local v2    # "$i$a$-apply-ClassData$-Companion$from$3":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 62
    nop

    .line 67
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v12, v1

    check-cast v12, Ljava/util/List;

    move-object v1, v12

    .local v1, "$this$from_u24lambda_u243":Ljava/util/List;
    const/4 v2, 0x0

    .line 68
    .local v2, "$i$a$-apply-ClassData$-Companion$from$4":I
    const/4 v3, 0x0

    .restart local v3    # "i":I
    invoke-virtual/range {p2 .. p2}, Lorg/luckypray/dexkit/schema/-ClassMeta;->getFieldsLength()I

    move-result v13

    :goto_5
    if-ge v3, v13, :cond_5

    .line 69
    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/schema/-ClassMeta;->fields(I)I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v1, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 71
    .end local v3    # "i":I
    :cond_5
    nop

    .end local v1    # "$this$from_u24lambda_u243":Ljava/util/List;
    .end local v2    # "$i$a$-apply-ClassData$-Companion$from$4":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 67
    nop

    .line 49
    new-instance v1, Lorg/luckypray/dexkit/result/ClassData;

    const/4 v13, 0x0

    move-object v2, v1

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v13}, Lorg/luckypray/dexkit/result/ClassData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 72
    return-object v1
.end method
