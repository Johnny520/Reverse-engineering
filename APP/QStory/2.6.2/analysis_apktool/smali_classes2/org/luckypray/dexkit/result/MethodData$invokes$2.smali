.class final Lorg/luckypray/dexkit/result/MethodData$invokes$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
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

.field final synthetic this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/result/MethodData$invokes$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/result/MethodData$invokes$2;->this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    iput p3, p0, Lorg/luckypray/dexkit/result/MethodData$invokes$2;->$dexId:I

    .line 6
    .line 7
    iput p4, p0, Lorg/luckypray/dexkit/result/MethodData$invokes$2;->$id:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData$invokes$2;->invoke()Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData$invokes$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/result/MethodData$invokes$2;->this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    iget v2, p0, Lorg/luckypray/dexkit/result/MethodData$invokes$2;->$dexId:I

    .line 6
    .line 7
    iget p0, p0, Lorg/luckypray/dexkit/result/MethodData$invokes$2;->$id:I

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v2, p0}, L飘花落叶言苏子兰哲世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-virtual {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子苏哲兰楪世(J)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
