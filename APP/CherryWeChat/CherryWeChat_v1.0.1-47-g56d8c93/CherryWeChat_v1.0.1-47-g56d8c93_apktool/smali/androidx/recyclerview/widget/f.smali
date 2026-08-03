.class public final Landroidx/recyclerview/widget/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public final a(Le1;)V
    .locals 4

    iget v0, p1, Le1;->a:I

    iget-object v1, p0, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x4

    if-eq v0, v3, :cond_1

    const/16 v3, 0x8

    if-eq v0, v3, :cond_0

    return-void

    :cond_0
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/i;

    iget v3, p1, Le1;->b:I

    iget p1, p1, Le1;->d:I

    invoke-virtual {v0, v1, v3, p1, v2}, Landroidx/recyclerview/widget/i;->onItemsMoved(Landroidx/recyclerview/widget/RecyclerView;III)V

    return-void

    :cond_1
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/i;

    iget v2, p1, Le1;->b:I

    iget v3, p1, Le1;->d:I

    iget-object p1, p1, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, p1}, Landroidx/recyclerview/widget/i;->onItemsUpdated(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V

    return-void

    :cond_2
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/i;

    iget v2, p1, Le1;->b:I

    iget p1, p1, Le1;->d:I

    invoke-virtual {v0, v1, v2, p1}, Landroidx/recyclerview/widget/i;->onItemsRemoved(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void

    :cond_3
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/i;

    iget v2, p1, Le1;->b:I

    iget p1, p1, Le1;->d:I

    invoke-virtual {v0, v1, v2, p1}, Landroidx/recyclerview/widget/i;->onItemsAdded(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method
