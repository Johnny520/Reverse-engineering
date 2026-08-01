.class public Ltop/suzhelan/qstory/ui/views/FollowRecycleViewLinearLayout;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Z

.field public 飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Ltop/suzhelan/qstory/ui/views/FollowRecycleViewLinearLayout;->飘花落叶言子楪哲兰世苏:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public getScrollDistance()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Ltop/suzhelan/qstory/ui/views/FollowRecycleViewLinearLayout;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    iget-object p0, p0, Ltop/suzhelan/qstory/ui/views/FollowRecycleViewLinearLayout;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;->getScrollDistance()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ltop/suzhelan/qstory/ui/views/FollowRecycleViewLinearLayout;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;->onTouchEvent(Landroid/view/MotionEvent;)Z

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

.method public setDisableScroll(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ltop/suzhelan/qstory/ui/views/FollowRecycleViewLinearLayout;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    return-void
.end method

.method public setFollowRecycleView(Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/ui/views/FollowRecycleViewLinearLayout;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ltop/suzhelan/qstory/ui/views/FollowRecycleViewLinearLayout;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object p0, p0, Ltop/suzhelan/qstory/ui/views/FollowRecycleViewLinearLayout;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;->飘花落叶言子楪世哲苏兰()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/ui/views/FollowRecycleViewLinearLayout;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;->飘花落叶言子兰楪哲苏世:Z

    .line 6
    .line 7
    :cond_0
    return-void
.end method
