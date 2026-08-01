.class public final Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲苏兰世;
.super Landroid/view/ViewOutlineProvider;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 2

    .line 1
    iget p0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p2, v1, v1, p0, p1}, Landroid/graphics/Outline;->setOval(IIII)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p2, v1, v1, p0, p1}, Landroid/graphics/Outline;->setRect(IIII)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, v0}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p2, v1, v1, p0, p1}, Landroid/graphics/Outline;->setRect(IIII)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v0}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance p0, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :pswitch_3
    instance-of p0, p1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲兰世苏;

    .line 60
    .line 61
    if-eqz p0, :cond_0

    .line 62
    .line 63
    check-cast p1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲兰世苏;

    .line 64
    .line 65
    iget-object p0, p1, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世哲苏:Landroid/graphics/Outline;

    .line 66
    .line 67
    if-eqz p0, :cond_0

    .line 68
    .line 69
    invoke-virtual {p2, p0}, Landroid/graphics/Outline;->set(Landroid/graphics/Outline;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
