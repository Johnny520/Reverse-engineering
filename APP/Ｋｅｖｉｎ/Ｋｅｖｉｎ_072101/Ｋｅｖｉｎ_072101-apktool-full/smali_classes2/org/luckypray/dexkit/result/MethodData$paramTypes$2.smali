.class final Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;
.super Lkotlin/jvm/internal/Lambda;
.source "MethodData.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/result/MethodData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lorg/luckypray/dexkit/result/ClassDataList;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMethodData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodData.kt\norg/luckypray/dexkit/result/MethodData$paramTypes$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,344:1\n1547#2:345\n1618#2,3:346\n*S KotlinDebug\n*F\n+ 1 MethodData.kt\norg/luckypray/dexkit/result/MethodData$paramTypes$2\n*L\n179#1:345\n179#1:346,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lorg/luckypray/dexkit/result/ClassDataList;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $bridge:Lorg/luckypray/dexkit/DexKitBridge;

.field final synthetic $dexId:I

.field final synthetic this$0:Lorg/luckypray/dexkit/result/MethodData;


# direct methods
.method constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;I)V
    .locals 1

    iput-object p1, p0, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;->this$0:Lorg/luckypray/dexkit/result/MethodData;

    iput p3, p0, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;->$dexId:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 178
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;->invoke()Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 12

    .line 179
    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;->this$0:Lorg/luckypray/dexkit/result/MethodData;

    invoke-static {v1}, Lorg/luckypray/dexkit/result/MethodData;->access$getParamTypeIds$p(Lorg/luckypray/dexkit/result/MethodData;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    iget-object v2, p0, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;->this$0:Lorg/luckypray/dexkit/result/MethodData;

    iget v3, p0, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;->$dexId:I

    const/4 v4, 0x0

    .line 345
    .local v4, "$i$f$map":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v1

    .local v6, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 346
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 347
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    .local v10, "it":I
    const/4 v11, 0x0

    .line 179
    .local v11, "$i$a$-map-MethodData$paramTypes$2$1":I
    invoke-static {v2, v3, v10}, Lorg/luckypray/dexkit/result/MethodData;->access$getEncodeId(Lorg/luckypray/dexkit/result/MethodData;II)J

    move-result-wide v10

    .end local v10    # "it":I
    .end local v11    # "$i$a$-map-MethodData$paramTypes$2$1":I
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    .line 347
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 346
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 348
    :cond_0
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .line 345
    nop

    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    check-cast v2, Ljava/util/Collection;

    .line 179
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toLongArray(Ljava/util/Collection;)[J

    move-result-object v1

    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v3

    invoke-static {v2, v3, v4, v1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassByIds(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[J)[B

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

    :goto_1
    if-ge v4, v3, :cond_1

    sget-object v5, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, v0, v6}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/ClassDataList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method
