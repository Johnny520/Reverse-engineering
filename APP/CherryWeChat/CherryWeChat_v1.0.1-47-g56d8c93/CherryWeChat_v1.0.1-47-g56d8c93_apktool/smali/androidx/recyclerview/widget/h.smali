.class public abstract Landroidx/recyclerview/widget/h;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lkv;

.field public b:Ljava/util/ArrayList;

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public static b(Landroidx/recyclerview/widget/o;)V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/o;->mFlags:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o;->isInvalid()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o;->getOldPosition()I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o;->getAbsoluteAdapterPosition()I

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public abstract a(Landroidx/recyclerview/widget/o;Landroidx/recyclerview/widget/o;Llv;Llv;)Z
.end method

.method public final c(Landroidx/recyclerview/widget/o;)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/h;->a:Lkv;

    if-eqz v0, :cond_1

    check-cast v0, Lev;

    iget-object v0, v0, Lev;->a:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/o;->setIsRecyclable(Z)V

    iget-object v1, p1, Landroidx/recyclerview/widget/o;->mShadowedHolder:Landroidx/recyclerview/widget/o;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p1, Landroidx/recyclerview/widget/o;->mShadowingHolder:Landroidx/recyclerview/widget/o;

    if-nez v1, :cond_0

    iput-object v2, p1, Landroidx/recyclerview/widget/o;->mShadowedHolder:Landroidx/recyclerview/widget/o;

    :cond_0
    iput-object v2, p1, Landroidx/recyclerview/widget/o;->mShadowingHolder:Landroidx/recyclerview/widget/o;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->shouldBeKeptAsChild()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeAnimatingView(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->isTmpDetached()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_1
    return-void
.end method

.method public abstract d(Landroidx/recyclerview/widget/o;)V
.end method

.method public abstract e()V
.end method

.method public abstract f()Z
.end method
