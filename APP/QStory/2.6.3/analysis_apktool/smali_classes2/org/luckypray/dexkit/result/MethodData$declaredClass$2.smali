.class final Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "invoke",
        "()Lorg/luckypray/dexkit/result/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $bridge:Lorg/luckypray/dexkit/DexKitBridge;

.field final synthetic $dexId:I

.field final synthetic this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;->this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    iput p3, p0, Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;->$dexId:I

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 30
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;->invoke()Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;->this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    iget p0, p0, Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;->$dexId:I

    .line 6
    .line 7
    iget v1, v1, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:I

    .line 8
    .line 9
    invoke-static {p0, v1}, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const/4 p0, 0x1

    .line 14
    new-array p0, p0, [J

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput-wide v1, p0, v3

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子哲楪世苏兰([J)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->firstOrNull()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    .line 28
    .line 29
    return-object p0
.end method
