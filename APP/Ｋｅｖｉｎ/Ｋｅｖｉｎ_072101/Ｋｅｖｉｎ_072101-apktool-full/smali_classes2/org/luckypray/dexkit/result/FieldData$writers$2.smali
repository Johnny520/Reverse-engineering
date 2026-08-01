.class final Lorg/luckypray/dexkit/result/FieldData$writers$2;
.super Lkotlin/jvm/internal/Lambda;
.source "FieldData.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/result/FieldData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lorg/luckypray/dexkit/result/MethodDataList;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lorg/luckypray/dexkit/result/MethodDataList;",
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

.field final synthetic $id:I

.field final synthetic this$0:Lorg/luckypray/dexkit/result/FieldData;


# direct methods
.method constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;II)V
    .locals 1

    iput-object p1, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    iput p3, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$dexId:I

    iput p4, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$id:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 141
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData$writers$2;->invoke()Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 7

    .line 142
    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->this$0:Lorg/luckypray/dexkit/result/FieldData;

    iget v2, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$dexId:I

    iget v3, p0, Lorg/luckypray/dexkit/result/FieldData$writers$2;->$id:I

    invoke-static {v1, v2, v3}, Lorg/luckypray/dexkit/result/FieldData;->access$getEncodeId(Lorg/luckypray/dexkit/result/FieldData;II)J

    move-result-wide v1

    sget-object v3, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    invoke-static {v0}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v4

    invoke-static {v3, v4, v5, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->access$nativeFieldPutMethods(Lorg/luckypray/dexkit/DexKitBridge$Companion;JJ)[B

    move-result-object v1

    sget-object v2, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v3, "wrap(res)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder$Companion;->getRootAsMethodMetaArrayHolder(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;

    move-result-object v1

    new-instance v2, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v2}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->getMethodsLength()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    sget-object v5, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/schema/-MethodMetaArrayHolder;->methods(I)Lorg/luckypray/dexkit/schema/-MethodMeta;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, v0, v6}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/result/MethodDataList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method
