.class final Lorg/luckypray/dexkit/result/ClassData$superClass$2;
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
        "Lorg/luckypray/dexkit/result/ClassData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lorg/luckypray/dexkit/result/ClassData;",
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
.method constructor <init>(Lorg/luckypray/dexkit/result/ClassData;Lorg/luckypray/dexkit/DexKitBridge;I)V
    .locals 1

    iput-object p1, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    iput-object p2, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iput p3, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$dexId:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 104
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->invoke()Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/ClassData;
    .locals 9

    .line 105
    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    invoke-static {v0}, Lorg/luckypray/dexkit/result/ClassData;->access$getSuperClassId$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iget-object v2, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/ClassData;

    iget v3, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$dexId:I

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .local v0, "it":I
    const/4 v4, 0x0

    .line 106
    .local v4, "$i$a$-let-ClassData$superClass$2$1":I
    invoke-static {v2, v3, v0}, Lorg/luckypray/dexkit/result/ClassData;->access$getEncodeId(Lorg/luckypray/dexkit/result/ClassData;II)J

    move-result-wide v2

    const/4 v5, 0x1

    new-array v5, v5, [J

    const/4 v6, 0x0

    aput-wide v2, v5, v6

    sget-object v2, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v7

    invoke-static {v2, v7, v8, v5}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassByIds(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[J)[B

    move-result-object v2

    sget-object v3, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-string v5, "wrap(res)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;->getRootAsClassMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;

    move-result-object v2

    new-instance v3, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {v3}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->getClassesLength()I

    move-result v5

    :goto_0
    if-ge v6, v5, :cond_0

    sget-object v7, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {v2, v6}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v7, v1, v8}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v7

    invoke-virtual {v3, v7}, Lorg/luckypray/dexkit/result/ClassDataList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/ClassDataList;->firstOrNull()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/luckypray/dexkit/result/ClassData;

    .line 105
    .end local v0    # "it":I
    .end local v4    # "$i$a$-let-ClassData$superClass$2$1":I
    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return-object v1
.end method
