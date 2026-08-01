.class public final Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Landroid/widget/EdgeEffect;

.field public 飘花落叶言子楪世兰苏哲:Landroid/widget/EdgeEffect;

.field public 飘花落叶言子楪世哲兰苏:Landroid/widget/EdgeEffect;

.field public 飘花落叶言子楪世哲苏兰:J

.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Landroid/content/Context;

.field public 飘花落叶言子楪苏世兰哲:Landroid/widget/EdgeEffect;

.field public 飘花落叶言子楪苏世哲兰:Landroid/widget/EdgeEffect;

.field public 飘花落叶言子楪苏兰世哲:Landroid/widget/EdgeEffect;

.field public 飘花落叶言子楪苏哲世兰:Landroid/widget/EdgeEffect;

.field public 飘花落叶言子楪苏哲兰世:Landroid/widget/EdgeEffect;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Landroid/content/Context;

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 7
    .line 8
    const-wide/16 p1, 0x0

    .line 9
    .line 10
    iput-wide p1, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:J

    .line 11
    .line 12
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x1f

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-lt v1, v2, :cond_1

    .line 11
    .line 12
    invoke-static {p0}, Landroidx/compose/foundation/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Landroid/widget/EdgeEffect;)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move p0, v3

    .line 18
    :goto_0
    cmpg-float p0, p0, v3

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    move v0, v1

    .line 24
    :cond_2
    xor-int/lit8 p0, v0, 0x1

    .line 25
    .line 26
    return p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲()Landroid/widget/EdgeEffect;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Landroid/widget/EdgeEffect;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Landroid/widget/EdgeEffect;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Landroid/widget/EdgeEffect;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Landroid/content/Context;

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {v2}, Landroidx/compose/foundation/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;)Landroid/widget/EdgeEffect;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Landroidx/compose/foundation/飘花落叶言子世哲兰苏楪;

    .line 15
    .line 16
    invoke-direct {v0, v2}, Landroidx/compose/foundation/飘花落叶言子世哲兰苏楪;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget v1, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/EdgeEffect;->setColor(I)V

    .line 22
    .line 23
    .line 24
    iget-wide v1, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:J

    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    invoke-static {v1, v2, v3, v4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 35
    .line 36
    iget-wide v2, p0, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:J

    .line 37
    .line 38
    const-wide v4, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    const/16 p0, 0x20

    .line 44
    .line 45
    if-ne p1, v1, :cond_1

    .line 46
    .line 47
    shr-long p0, v2, p0

    .line 48
    .line 49
    long-to-int p0, p0

    .line 50
    and-long v1, v2, v4

    .line 51
    .line 52
    long-to-int p1, v1

    .line 53
    invoke-virtual {v0, p0, p1}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_1
    and-long/2addr v4, v2

    .line 58
    long-to-int p1, v4

    .line 59
    shr-long v1, v2, p0

    .line 60
    .line 61
    long-to-int p0, v1

    .line 62
    invoke-virtual {v0, p1, p0}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-object v0
.end method
