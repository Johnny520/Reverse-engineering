.class final Lorg/luckypray/dexkit/result/MethodData$returnType$2;
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

.field final synthetic this$0:Lorg/luckypray/dexkit/result/MethodData;


# direct methods
.method constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;I)V
    .locals 1

    iput-object p1, p0, Lorg/luckypray/dexkit/result/MethodData$returnType$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, Lorg/luckypray/dexkit/result/MethodData$returnType$2;->this$0:Lorg/luckypray/dexkit/result/MethodData;

    iput p3, p0, Lorg/luckypray/dexkit/result/MethodData$returnType$2;->$dexId:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 169
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData$returnType$2;->invoke()Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/ClassData;
    .locals 7

    .line 170
    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData$returnType$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/MethodData$returnType$2;->this$0:Lorg/luckypray/dexkit/result/MethodData;

    iget v2, p0, Lorg/luckypray/dexkit/result/MethodData$returnType$2;->$dexId:I

    iget-object v3, p0, Lorg/luckypray/dexkit/result/MethodData$returnType$2;->this$0:Lorg/luckypray/dexkit/result/MethodData;

    invoke-static {v3}, Lorg/luckypray/dexkit/result/MethodData;->access$getReturnTypeId$p(Lorg/luckypray/dexkit/result/MethodData;)I

    move-result v3

    invoke-static {v1, v2, v3}, Lorg/luckypray/dexkit/result/MethodData;->access$getEncodeId(Lorg/luckypray/dexkit/result/MethodData;II)J

    move-result-wide v1

    const/4 v3, 0x1

    new-array v3, v3, [J

    const/4 v4, 0x0

    aput-wide v1, v3, v4

    sget-object v1, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v5

    invoke-static {v1, v5, v6, v3}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeGetClassByIds(Lorg/luckypray/dexkit/DexKitBridge$Companion;J[J)[B

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

    :goto_0
    if-ge v4, v3, :cond_0

    sget-object v5, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, v0, v6}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/ClassDataList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lorg/luckypray/dexkit/result/ClassDataList;->firstOrNull()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    return-object v0
.end method
