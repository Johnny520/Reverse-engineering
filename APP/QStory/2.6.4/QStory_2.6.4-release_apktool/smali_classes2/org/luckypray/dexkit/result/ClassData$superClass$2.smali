.class final Lorg/luckypray/dexkit/result/ClassData$superClass$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
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

.field final synthetic this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;Lorg/luckypray/dexkit/DexKitBridge;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    iput p3, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$dexId:I

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

    .line 38
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->invoke()Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iget-object v0, v0, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 8
    .line 9
    iget p0, p0, Lorg/luckypray/dexkit/result/ClassData$superClass$2;->$dexId:I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p0, v0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    const/4 p0, 0x1

    .line 20
    new-array p0, p0, [J

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    aput-wide v2, p0, v0

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子兰世哲楪苏([J)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->firstOrNull()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method
