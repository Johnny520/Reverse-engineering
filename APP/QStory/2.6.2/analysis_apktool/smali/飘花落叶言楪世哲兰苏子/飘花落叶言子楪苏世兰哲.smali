.class public abstract L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final synthetic 飘花落叶言子楪世苏兰哲:I

.field public static final 飘花落叶言子楪世苏哲兰:D


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 2
    .line 3
    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 10
    .line 11
    div-double/2addr v2, v0

    .line 12
    sput-wide v2, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:D

    .line 13
    .line 14
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(J)D
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr v0, p0

    .line 6
    long-to-double p0, v0

    .line 7
    sget-wide v0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:D

    .line 8
    .line 9
    mul-double/2addr p0, v0

    .line 10
    return-wide p0
.end method
