.class public final Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲世苏兰;
.super Landroid/graphics/Picture;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/graphics/Picture;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final beginRecording(II)Landroid/graphics/Canvas;
    .locals 0

    .line 1
    new-instance p0, Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/graphics/Canvas;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/graphics/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Canvas;

    .line 2
    .line 3
    new-instance v0, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Canvas;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iget-object p0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final endRecording()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getHeight()I
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-wide v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:J

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v2

    .line 11
    long-to-int p0, v0

    .line 12
    return p0
.end method

.method public final getWidth()I
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-wide v0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:J

    .line 4
    .line 5
    const/16 p0, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, p0

    .line 8
    long-to-int p0, v0

    .line 9
    return p0
.end method

.method public final requiresHardwareAcceleration()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
