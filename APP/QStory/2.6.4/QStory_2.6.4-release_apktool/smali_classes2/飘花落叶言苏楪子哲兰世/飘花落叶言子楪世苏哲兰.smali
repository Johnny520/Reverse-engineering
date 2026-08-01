.class public abstract L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Lorg/luckypray/dexkit/DexKitBridge;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;II)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lorg/luckypray/dexkit/DexKitBridge;

    .line 8
    .line 9
    iput p2, p0, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    iput p3, p0, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 12
    .line 13
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(II)J
    .locals 2

    .line 1
    int-to-long v0, p0

    .line 2
    const/16 p0, 0x20

    .line 3
    .line 4
    shl-long/2addr v0, p0

    .line 5
    int-to-long p0, p1

    .line 6
    or-long/2addr p0, v0

    .line 7
    return-wide p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()J
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 6
    .line 7
    invoke-static {p0, v0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    const-string p0, "not has id"

    .line 13
    .line 14
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method
