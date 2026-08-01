.class public final Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lcom/lxj/xpopup/widget/SmartDragLayout;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lcom/lxj/xpopup/widget/SmartDragLayout;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    rsub-int/lit8 v0, v0, 0x0

    .line 19
    .line 20
    new-instance v2, Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰苏哲;

    .line 21
    .line 22
    invoke-direct {v2, p0, v0, v1}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰苏哲;-><init>(Lcom/lxj/xpopup/widget/SmartDragLayout;IZ)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    sget-object v0, Lcom/lxj/xpopup/enums/LayoutStatus;->Closing:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    iget v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰哲世苏:I

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    sub-int/2addr v0, v1

    .line 40
    new-instance v1, Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰苏哲;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {v1, p0, v0, v2}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰苏哲;-><init>(Lcom/lxj/xpopup/widget/SmartDragLayout;IZ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    sget-object v0, Lcom/lxj/xpopup/enums/LayoutStatus;->Opening:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 50
    .line 51
    iput-object v0, p0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏世哲:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
