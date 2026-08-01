.class final Lorg/luckypray/dexkit/result/ClassData$fields$2;
.super Lkotlin/jvm/internal/Lambda;
.source "ClassData.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/result/ClassData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lorg/luckypray/dexkit/result/FieldDataList;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClassData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$fields$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n1547#2:287\n1618#2,3:288\n*S KotlinDebug\n*F\n+ 1 ClassData.kt\norg/luckypray/dexkit/result/ClassData$fields$2\n*L\n148#1:287\n148#1:288,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lorg/luckypray/dexkit/result/FieldDataList;",
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

.field final synthetic this$0:Lorg/luckypray/dexkit/result/ClassData;


# direct methods
.method constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;I)V
    .locals 1

    iput-object p1, p0, Lorg/luckypray/dexkit/result/ClassData$fields$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, Lorg/luckypray/dexkit/result/ClassData$fields$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    iput p3, p0, Lorg/luckypray/dexkit/result/ClassData$fields$2;->$dexId:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 147
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData$fields$2;->invoke()Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 12

    .line 148
    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData$fields$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/ClassData$fields$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v1}, Lorg/luckypray/dexkit/result/ClassData;->access$getFieldIds$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    iget-object v2, p0, Lorg/luckypray/dexkit/result/ClassData$fields$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    iget v3, p0, Lorg/luckypray/dexkit/result/ClassData$fields$2;->$dexId:I

    const/4 v4, 0x0

    .line 287
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

    .line 288
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 289
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    .local v10, "it":I
    const/4 v11, 0x0

    .line 148
    .local v11, "$i$a$-map-ClassData$fields$2$1":I
    invoke-static {v2, v3, v10}, Lorg/luckypray/dexkit/result/ClassData;->access$getEncodeId(Lorg/luckypray/dexkit/result/ClassData;II)J

    move-result-wide v10

    .end local v10    # "it":I
    .end local v11    # "$i$a$-map-ClassData$fields$2$1":I
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    .line 289
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 288
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 290
    :cond_0
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .line 287
    nop

    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    check-cast v2, Ljava/util/Collection;

    .line 148
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toLongArray(Ljava/util/Collection;)[J

    move-result-object v1

    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v3

    invoke-static {v2, v3, v4, v1}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetFieldByIds(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[J)[B

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

    :goto_1
    if-ge v4, v3, :cond_1

    sget-object v5, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/schema/-FieldMetaArrayHolder;->fields(I)Lorg/luckypray/dexkit/schema/-FieldMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, v0, v6}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/FieldDataList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method
