.class final Lorg/luckypray/dexkit/result/FieldData$annotations$2;
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
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "",
        "Lorg/luckypray/dexkit/result/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "invoke",
        "()Ljava/util/List;",
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

.field final synthetic $id:I

.field final synthetic this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/result/FieldData$annotations$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/result/FieldData$annotations$2;->this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    iput p3, p0, Lorg/luckypray/dexkit/result/FieldData$annotations$2;->$dexId:I

    .line 6
    .line 7
    iput p4, p0, Lorg/luckypray/dexkit/result/FieldData$annotations$2;->$id:I

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
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData$annotations$2;->invoke()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData$annotations$2;->$bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/result/FieldData$annotations$2;->this$0:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    iget v2, p0, Lorg/luckypray/dexkit/result/FieldData$annotations$2;->$dexId:I

    .line 6
    .line 7
    iget p0, p0, Lorg/luckypray/dexkit/result/FieldData$annotations$2;->$id:I

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v2, p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-virtual {v0, v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子兰楪世苏哲(J)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
