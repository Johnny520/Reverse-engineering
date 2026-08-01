.class public Ltop/suzhelan/sticker/sdk/widget/FollowLinearLayout;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;


# instance fields
.field public 飘花落叶言子楪哲苏兰世:Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getScrollDistance()I
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/sticker/sdk/widget/FollowLinearLayout;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;->getScrollDistance()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ltop/suzhelan/sticker/sdk/widget/FollowLinearLayout;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public setFollowRecycleView(Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/suzhelan/sticker/sdk/widget/FollowLinearLayout;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/sticker/sdk/widget/FollowLinearLayout;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;->飘花落叶言子楪世哲苏兰()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/sticker/sdk/widget/FollowLinearLayout;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Ltop/suzhelan/sticker/sdk/widget/CustomRecycleView;->飘花落叶言子兰楪哲苏世:Z

    .line 6
    .line 7
    :cond_0
    return-void
.end method
