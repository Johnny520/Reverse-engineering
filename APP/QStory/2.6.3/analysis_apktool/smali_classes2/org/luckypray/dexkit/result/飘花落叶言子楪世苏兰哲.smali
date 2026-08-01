.class public final Lorg/luckypray/dexkit/result/飘花落叶言子楪世苏兰哲;
.super L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世哲兰;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, v0, v0}, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世苏哲兰;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lorg/luckypray/dexkit/result/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lorg/luckypray/dexkit/result/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/result/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " = "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lorg/luckypray/dexkit/result/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
