.class public final Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Z

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lcom/lxj/xpopup/widget/SmartDragLayout;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Lcom/lxj/xpopup/widget/SmartDragLayout;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 5
    .line 6
    iput p2, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lcom/lxj/xpopup/widget/SmartDragLayout;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    iget v4, v0, Lcom/lxj/xpopup/widget/SmartDragLayout;->飘花落叶言子楪兰苏哲世:I

    .line 14
    .line 15
    iget-boolean v5, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Z

    .line 16
    .line 17
    int-to-float v4, v4

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const v5, 0x3f4ccccd    # 0.8f

    .line 22
    .line 23
    .line 24
    mul-float/2addr v4, v5

    .line 25
    :goto_0
    float-to-int v6, v4

    .line 26
    const/4 v4, 0x0

    .line 27
    iget v5, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 28
    .line 29
    invoke-virtual/range {v1 .. v6}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 35
    .line 36
    .line 37
    return-void
.end method
