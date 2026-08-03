.class public final LJq;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source ""


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LMq;


# direct methods
.method public constructor <init>(LMq;II)V
    .locals 0

    iput-object p1, p0, LJq;->b:LMq;

    iput p3, p0, LJq;->a:I

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final calculateExtraLayoutSpace(LAv;[I)V
    .locals 3

    iget p1, p0, LJq;->a:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, LJq;->b:LMq;

    if-nez p1, :cond_0

    iget-object p1, v2, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    aput p1, p2, v1

    iget-object p1, v2, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    aput p1, p2, v0

    return-void

    :cond_0
    iget-object p1, v2, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    aput p1, p2, v1

    iget-object p1, v2, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    aput p1, p2, v0

    return-void
.end method

.method public final smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;LAv;I)V
    .locals 0

    new-instance p2, LU6;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, LU6;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/m;->setTargetPosition(I)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/i;->startSmoothScroll(Landroidx/recyclerview/widget/m;)V

    return-void
.end method
