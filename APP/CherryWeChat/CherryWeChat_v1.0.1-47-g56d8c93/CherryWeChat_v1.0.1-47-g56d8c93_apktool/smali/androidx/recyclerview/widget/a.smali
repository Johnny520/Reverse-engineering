.class public final Landroidx/recyclerview/widget/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:LYt;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Landroidx/recyclerview/widget/f;

.field public final e:LXm;

.field public f:I


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYt;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, LYt;-><init>(I)V

    iput-object v0, p0, Landroidx/recyclerview/widget/a;->a:LYt;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/a;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/a;->c:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/a;->f:I

    iput-object p1, p0, Landroidx/recyclerview/widget/a;->d:Landroidx/recyclerview/widget/f;

    new-instance p1, LXm;

    const/16 v0, 0xa

    invoke-direct {p1, v0, p0}, LXm;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Landroidx/recyclerview/widget/a;->e:LXm;

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 8

    iget-object v0, p0, Landroidx/recyclerview/widget/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le1;

    iget v5, v4, Le1;->a:I

    const/16 v6, 0x8

    const/4 v7, 0x1

    if-ne v5, v6, :cond_0

    iget v4, v4, Le1;->d:I

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {p0, v4, v5}, Landroidx/recyclerview/widget/a;->f(II)I

    move-result v4

    if-ne v4, p1, :cond_2

    goto :goto_2

    :cond_0
    if-ne v5, v7, :cond_2

    iget v5, v4, Le1;->b:I

    iget v4, v4, Le1;->d:I

    add-int/2addr v4, v5

    :goto_1
    if-ge v5, v4, :cond_2

    add-int/lit8 v6, v3, 0x1

    invoke-virtual {p0, v5, v6}, Landroidx/recyclerview/widget/a;->f(II)I

    move-result v6

    if-ne v6, p1, :cond_1

    :goto_2
    return v7

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v2
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le1;

    iget-object v5, p0, Landroidx/recyclerview/widget/a;->d:Landroidx/recyclerview/widget/f;

    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/f;->a(Le1;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/a;->k(Ljava/util/ArrayList;)V

    iput v2, p0, Landroidx/recyclerview/widget/a;->f:I

    return-void
.end method

.method public final c()V
    .locals 9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/a;->b()V

    iget-object v0, p0, Landroidx/recyclerview/widget/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_4

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le1;

    iget v5, v4, Le1;->a:I

    const/4 v6, 0x1

    iget-object v7, p0, Landroidx/recyclerview/widget/a;->d:Landroidx/recyclerview/widget/f;

    if-eq v5, v6, :cond_3

    const/4 v8, 0x2

    if-eq v5, v8, :cond_2

    const/4 v8, 0x4

    if-eq v5, v8, :cond_1

    const/16 v8, 0x8

    if-eq v5, v8, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v7, v4}, Landroidx/recyclerview/widget/f;->a(Le1;)V

    iget v5, v4, Le1;->b:I

    iget v4, v4, Le1;->d:I

    iget-object v7, v7, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v7, v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForMove(II)V

    iput-boolean v6, v7, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    goto :goto_1

    :cond_1
    invoke-virtual {v7, v4}, Landroidx/recyclerview/widget/f;->a(Le1;)V

    iget v5, v4, Le1;->b:I

    iget v8, v4, Le1;->d:I

    iget-object v4, v4, Le1;->c:Ljava/lang/Object;

    iget-object v7, v7, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v7, v5, v8, v4}, Landroidx/recyclerview/widget/RecyclerView;->viewRangeUpdate(IILjava/lang/Object;)V

    iput-boolean v6, v7, Landroidx/recyclerview/widget/RecyclerView;->mItemsChanged:Z

    goto :goto_1

    :cond_2
    invoke-virtual {v7, v4}, Landroidx/recyclerview/widget/f;->a(Le1;)V

    iget v5, v4, Le1;->b:I

    iget v4, v4, Le1;->d:I

    iget-object v7, v7, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v7, v5, v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForRemove(IIZ)V

    iput-boolean v6, v7, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    iget-object v5, v7, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget v6, v5, LAv;->c:I

    add-int/2addr v6, v4

    iput v6, v5, LAv;->c:I

    goto :goto_1

    :cond_3
    invoke-virtual {v7, v4}, Landroidx/recyclerview/widget/f;->a(Le1;)V

    iget v5, v4, Le1;->b:I

    iget v4, v4, Le1;->d:I

    iget-object v7, v7, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v7, v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForInsert(II)V

    iput-boolean v6, v7, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/a;->k(Ljava/util/ArrayList;)V

    iput v2, p0, Landroidx/recyclerview/widget/a;->f:I

    return-void
.end method

.method public final d(Le1;)V
    .locals 13

    iget v0, p1, Le1;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_8

    const/16 v2, 0x8

    if-eq v0, v2, :cond_8

    iget v2, p1, Le1;->b:I

    invoke-virtual {p0, v2, v0}, Landroidx/recyclerview/widget/a;->l(II)I

    move-result v0

    iget v2, p1, Le1;->b:I

    iget v3, p1, Le1;->a:I

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-eq v3, v4, :cond_1

    if-ne v3, v5, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "op should be remove or update."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    move v6, v1

    move v7, v6

    :goto_1
    iget v8, p1, Le1;->d:I

    iget-object v9, p0, Landroidx/recyclerview/widget/a;->a:LYt;

    const/4 v10, 0x0

    if-ge v6, v8, :cond_6

    iget v8, p1, Le1;->b:I

    mul-int v11, v3, v6

    add-int/2addr v11, v8

    iget v8, p1, Le1;->a:I

    invoke-virtual {p0, v11, v8}, Landroidx/recyclerview/widget/a;->l(II)I

    move-result v8

    iget v11, p1, Le1;->a:I

    if-eq v11, v4, :cond_3

    if-eq v11, v5, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v12, v0, 0x1

    if-ne v8, v12, :cond_4

    goto :goto_2

    :cond_3
    if-ne v8, v0, :cond_4

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_4
    :goto_3
    iget-object v12, p1, Le1;->c:Ljava/lang/Object;

    invoke-virtual {p0, v12, v11, v0, v7}, Landroidx/recyclerview/widget/a;->h(Ljava/lang/Object;III)Le1;

    move-result-object v0

    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/a;->e(Le1;I)V

    iput-object v10, v0, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v9, v0}, LYt;->a(Ljava/lang/Object;)Z

    iget v0, p1, Le1;->a:I

    if-ne v0, v5, :cond_5

    add-int/2addr v2, v7

    :cond_5
    move v7, v1

    move v0, v8

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_6
    iget-object v1, p1, Le1;->c:Ljava/lang/Object;

    iput-object v10, p1, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v9, p1}, LYt;->a(Ljava/lang/Object;)Z

    if-lez v7, :cond_7

    iget p1, p1, Le1;->a:I

    invoke-virtual {p0, v1, p1, v0, v7}, Landroidx/recyclerview/widget/a;->h(Ljava/lang/Object;III)Le1;

    move-result-object p1

    invoke-virtual {p0, p1, v2}, Landroidx/recyclerview/widget/a;->e(Le1;I)V

    iput-object v10, p1, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v9, p1}, LYt;->a(Ljava/lang/Object;)Z

    :cond_7
    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "should not dispatch add or move for pre layout"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Le1;I)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/a;->d:Landroidx/recyclerview/widget/f;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/f;->a(Le1;)V

    iget-object v0, v0, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    iget v1, p1, Le1;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    iget v1, p1, Le1;->d:I

    iget-object p1, p1, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v0, p2, v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->viewRangeUpdate(IILjava/lang/Object;)V

    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->mItemsChanged:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "only remove and update ops can be dispatched in first pass"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget p1, p1, Le1;->d:I

    invoke-virtual {v0, p2, p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForRemove(IIZ)V

    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget v0, p2, LAv;->c:I

    add-int/2addr v0, p1

    iput v0, p2, LAv;->c:I

    return-void
.end method

.method public final f(II)I
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge p2, v1, :cond_6

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le1;

    iget v3, v2, Le1;->a:I

    const/16 v4, 0x8

    if-ne v3, v4, :cond_2

    iget v3, v2, Le1;->b:I

    if-ne v3, p1, :cond_0

    iget p1, v2, Le1;->d:I

    goto :goto_1

    :cond_0
    if-ge v3, p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    :cond_1
    iget v2, v2, Le1;->d:I

    if-gt v2, p1, :cond_5

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    iget v4, v2, Le1;->b:I

    if-gt v4, p1, :cond_5

    const/4 v5, 0x2

    if-ne v3, v5, :cond_4

    iget v2, v2, Le1;->d:I

    add-int/2addr v4, v2

    if-ge p1, v4, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    sub-int/2addr p1, v2

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    if-ne v3, v4, :cond_5

    iget v2, v2, Le1;->d:I

    add-int/2addr p1, v2

    :cond_5
    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_6
    return p1
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h(Ljava/lang/Object;III)Le1;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/a;->a:LYt;

    invoke-virtual {v0}, LYt;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le1;

    if-nez v0, :cond_0

    new-instance v0, Le1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput p2, v0, Le1;->a:I

    iput p3, v0, Le1;->b:I

    iput p4, v0, Le1;->d:I

    iput-object p1, v0, Le1;->c:Ljava/lang/Object;

    return-object v0

    :cond_0
    iput p2, v0, Le1;->a:I

    iput p3, v0, Le1;->b:I

    iput p4, v0, Le1;->d:I

    iput-object p1, v0, Le1;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final i(Le1;)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, p1, Le1;->a:I

    iget-object v1, p0, Landroidx/recyclerview/widget/a;->d:Landroidx/recyclerview/widget/f;

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x4

    if-eq v0, v3, :cond_1

    const/16 v3, 0x8

    if-ne v0, v3, :cond_0

    iget v0, p1, Le1;->b:I

    iget p1, p1, Le1;->d:I

    iget-object v1, v1, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForMove(II)V

    iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown update op type for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p1, Le1;->b:I

    iget v3, p1, Le1;->d:I

    iget-object p1, p1, Le1;->c:Ljava/lang/Object;

    iget-object v1, v1, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0, v3, p1}, Landroidx/recyclerview/widget/RecyclerView;->viewRangeUpdate(IILjava/lang/Object;)V

    iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView;->mItemsChanged:Z

    return-void

    :cond_2
    iget v0, p1, Le1;->b:I

    iget p1, p1, Le1;->d:I

    iget-object v1, v1, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForRemove(IIZ)V

    iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    return-void

    :cond_3
    iget v0, p1, Le1;->b:I

    iget p1, p1, Le1;->d:I

    iget-object v1, v1, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForInsert(II)V

    iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    return-void
.end method

.method public final j()V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/recyclerview/widget/a;->e:LXm;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    :goto_0
    iget-object v2, v0, Landroidx/recyclerview/widget/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    const/4 v6, 0x0

    :goto_1
    const/16 v7, 0x8

    const/4 v8, -0x1

    if-ltz v3, :cond_3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Le1;

    iget v9, v9, Le1;->a:I

    if-ne v9, v7, :cond_1

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_1
    move v6, v4

    :cond_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_3
    move v3, v8

    :goto_2
    const/4 v6, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x4

    if-eq v3, v8, :cond_22

    add-int/lit8 v7, v3, 0x1

    iget-object v11, v1, LXm;->b:Ljava/lang/Object;

    check-cast v11, Landroidx/recyclerview/widget/a;

    iget-object v12, v11, Landroidx/recyclerview/widget/a;->a:LYt;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Le1;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Le1;

    iget v15, v14, Le1;->a:I

    if-eq v15, v4, :cond_1d

    if-eq v15, v9, :cond_b

    if-eq v15, v10, :cond_4

    goto :goto_0

    :cond_4
    iget v5, v13, Le1;->d:I

    iget v8, v14, Le1;->b:I

    if-ge v5, v8, :cond_5

    add-int/lit8 v8, v8, -0x1

    iput v8, v14, Le1;->b:I

    goto :goto_3

    :cond_5
    iget v9, v14, Le1;->d:I

    add-int/2addr v8, v9

    if-ge v5, v8, :cond_6

    add-int/lit8 v9, v9, -0x1

    iput v9, v14, Le1;->d:I

    iget v5, v13, Le1;->b:I

    iget-object v8, v14, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v11, v8, v10, v5, v4}, Landroidx/recyclerview/widget/a;->h(Ljava/lang/Object;III)Le1;

    move-result-object v4

    goto :goto_4

    :cond_6
    :goto_3
    move-object v4, v6

    :goto_4
    iget v5, v13, Le1;->b:I

    iget v8, v14, Le1;->b:I

    if-gt v5, v8, :cond_7

    add-int/lit8 v8, v8, 0x1

    iput v8, v14, Le1;->b:I

    goto :goto_5

    :cond_7
    iget v9, v14, Le1;->d:I

    add-int/2addr v8, v9

    if-ge v5, v8, :cond_8

    sub-int/2addr v8, v5

    add-int/lit8 v5, v5, 0x1

    iget-object v9, v14, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v11, v9, v10, v5, v8}, Landroidx/recyclerview/widget/a;->h(Ljava/lang/Object;III)Le1;

    move-result-object v5

    iget v9, v14, Le1;->d:I

    sub-int/2addr v9, v8

    iput v9, v14, Le1;->d:I

    goto :goto_6

    :cond_8
    :goto_5
    move-object v5, v6

    :goto_6
    invoke-virtual {v2, v7, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget v7, v14, Le1;->d:I

    if-lez v7, :cond_9

    invoke-virtual {v2, v3, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_9
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iput-object v6, v14, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v12, v14}, LYt;->a(Ljava/lang/Object;)Z

    :goto_7
    if-eqz v4, :cond_a

    invoke-virtual {v2, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_a
    if-eqz v5, :cond_0

    invoke-virtual {v2, v3, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    :cond_b
    iget v8, v13, Le1;->b:I

    iget v10, v13, Le1;->d:I

    if-ge v8, v10, :cond_d

    iget v15, v14, Le1;->b:I

    if-ne v15, v8, :cond_c

    iget v15, v14, Le1;->d:I

    sub-int v8, v10, v8

    if-ne v15, v8, :cond_c

    move v5, v4

    :goto_8
    const/4 v8, 0x0

    goto :goto_9

    :cond_c
    const/4 v5, 0x0

    goto :goto_8

    :cond_d
    iget v15, v14, Le1;->b:I

    add-int/lit8 v5, v10, 0x1

    if-ne v15, v5, :cond_e

    iget v5, v14, Le1;->d:I

    sub-int/2addr v8, v10

    if-ne v5, v8, :cond_e

    move v5, v4

    move v8, v5

    goto :goto_9

    :cond_e
    move v8, v4

    const/4 v5, 0x0

    :goto_9
    iget v15, v14, Le1;->b:I

    if-ge v10, v15, :cond_f

    add-int/lit8 v15, v15, -0x1

    iput v15, v14, Le1;->b:I

    goto :goto_a

    :cond_f
    iget v6, v14, Le1;->d:I

    add-int/2addr v15, v6

    if-ge v10, v15, :cond_10

    add-int/lit8 v6, v6, -0x1

    iput v6, v14, Le1;->d:I

    iput v9, v13, Le1;->a:I

    iput v4, v13, Le1;->d:I

    iget v3, v14, Le1;->d:I

    if-nez v3, :cond_0

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v14, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v12, v14}, LYt;->a(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_10
    :goto_a
    iget v4, v13, Le1;->b:I

    iget v6, v14, Le1;->b:I

    if-gt v4, v6, :cond_12

    add-int/lit8 v6, v6, 0x1

    iput v6, v14, Le1;->b:I

    :cond_11
    const/4 v10, 0x0

    goto :goto_b

    :cond_12
    iget v10, v14, Le1;->d:I

    add-int/2addr v6, v10

    if-ge v4, v6, :cond_11

    sub-int/2addr v6, v4

    add-int/lit8 v4, v4, 0x1

    const/4 v10, 0x0

    invoke-virtual {v11, v10, v9, v4, v6}, Landroidx/recyclerview/widget/a;->h(Ljava/lang/Object;III)Le1;

    move-result-object v17

    iget v4, v13, Le1;->b:I

    iget v6, v14, Le1;->b:I

    sub-int/2addr v4, v6

    iput v4, v14, Le1;->d:I

    move-object/from16 v4, v17

    goto :goto_c

    :goto_b
    move-object v4, v10

    :goto_c
    if-eqz v5, :cond_13

    invoke-virtual {v2, v3, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iput-object v10, v13, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v12, v13}, LYt;->a(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_13
    if-eqz v8, :cond_17

    if-eqz v4, :cond_15

    iget v5, v13, Le1;->b:I

    iget v6, v4, Le1;->b:I

    if-le v5, v6, :cond_14

    iget v6, v4, Le1;->d:I

    sub-int/2addr v5, v6

    iput v5, v13, Le1;->b:I

    :cond_14
    iget v5, v13, Le1;->d:I

    iget v6, v4, Le1;->b:I

    if-le v5, v6, :cond_15

    iget v6, v4, Le1;->d:I

    sub-int/2addr v5, v6

    iput v5, v13, Le1;->d:I

    :cond_15
    iget v5, v13, Le1;->b:I

    iget v6, v14, Le1;->b:I

    if-le v5, v6, :cond_16

    iget v6, v14, Le1;->d:I

    sub-int/2addr v5, v6

    iput v5, v13, Le1;->b:I

    :cond_16
    iget v5, v13, Le1;->d:I

    iget v6, v14, Le1;->b:I

    if-le v5, v6, :cond_1b

    iget v6, v14, Le1;->d:I

    sub-int/2addr v5, v6

    iput v5, v13, Le1;->d:I

    goto :goto_d

    :cond_17
    if-eqz v4, :cond_19

    iget v5, v13, Le1;->b:I

    iget v6, v4, Le1;->b:I

    if-lt v5, v6, :cond_18

    iget v6, v4, Le1;->d:I

    sub-int/2addr v5, v6

    iput v5, v13, Le1;->b:I

    :cond_18
    iget v5, v13, Le1;->d:I

    iget v6, v4, Le1;->b:I

    if-lt v5, v6, :cond_19

    iget v6, v4, Le1;->d:I

    sub-int/2addr v5, v6

    iput v5, v13, Le1;->d:I

    :cond_19
    iget v5, v13, Le1;->b:I

    iget v6, v14, Le1;->b:I

    if-lt v5, v6, :cond_1a

    iget v6, v14, Le1;->d:I

    sub-int/2addr v5, v6

    iput v5, v13, Le1;->b:I

    :cond_1a
    iget v5, v13, Le1;->d:I

    iget v6, v14, Le1;->b:I

    if-lt v5, v6, :cond_1b

    iget v6, v14, Le1;->d:I

    sub-int/2addr v5, v6

    iput v5, v13, Le1;->d:I

    :cond_1b
    :goto_d
    invoke-virtual {v2, v3, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget v5, v13, Le1;->b:I

    iget v6, v13, Le1;->d:I

    if-eq v5, v6, :cond_1c

    invoke-virtual {v2, v7, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_1c
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :goto_e
    if-eqz v4, :cond_0

    invoke-virtual {v2, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    :cond_1d
    iget v4, v13, Le1;->d:I

    iget v5, v14, Le1;->b:I

    if-ge v4, v5, :cond_1e

    move/from16 v16, v8

    goto :goto_f

    :cond_1e
    const/16 v16, 0x0

    :goto_f
    iget v6, v13, Le1;->b:I

    if-ge v6, v5, :cond_1f

    add-int/lit8 v16, v16, 0x1

    :cond_1f
    if-gt v5, v6, :cond_20

    iget v5, v14, Le1;->d:I

    add-int/2addr v6, v5

    iput v6, v13, Le1;->b:I

    :cond_20
    iget v5, v14, Le1;->b:I

    if-gt v5, v4, :cond_21

    iget v6, v14, Le1;->d:I

    add-int/2addr v4, v6

    iput v4, v13, Le1;->d:I

    :cond_21
    add-int v5, v5, v16

    iput v5, v14, Le1;->b:I

    invoke-virtual {v2, v3, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v7, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_22
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_10
    if-ge v3, v1, :cond_3a

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le1;

    iget v6, v5, Le1;->a:I

    if-eq v6, v4, :cond_39

    iget-object v11, v0, Landroidx/recyclerview/widget/a;->a:LYt;

    iget-object v12, v0, Landroidx/recyclerview/widget/a;->d:Landroidx/recyclerview/widget/f;

    if-eq v6, v9, :cond_2e

    if-eq v6, v10, :cond_24

    if-eq v6, v7, :cond_23

    :goto_11
    move v14, v9

    const/4 v8, 0x0

    goto/16 :goto_23

    :cond_23
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/a;->i(Le1;)V

    goto :goto_11

    :cond_24
    iget v6, v5, Le1;->b:I

    iget v13, v5, Le1;->d:I

    add-int/2addr v13, v6

    move v14, v6

    move v7, v8

    const/4 v15, 0x0

    :goto_12
    if-ge v6, v13, :cond_2b

    iget-object v8, v12, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v8, v6, v4}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForPosition(IZ)Landroidx/recyclerview/widget/o;

    move-result-object v9

    if-nez v9, :cond_25

    :goto_13
    const/4 v9, 0x0

    goto :goto_14

    :cond_25
    iget-object v8, v8, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/b;

    iget-object v10, v9, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    iget-object v8, v8, Landroidx/recyclerview/widget/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_26

    sget v8, Landroidx/recyclerview/widget/RecyclerView;->HORIZONTAL:I

    goto :goto_13

    :cond_26
    :goto_14
    if-nez v9, :cond_27

    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/a;->a(I)Z

    move-result v8

    if-eqz v8, :cond_28

    :cond_27
    const/4 v8, 0x4

    goto :goto_16

    :cond_28
    if-ne v7, v4, :cond_29

    iget-object v7, v5, Le1;->c:Ljava/lang/Object;

    const/4 v8, 0x4

    invoke-virtual {v0, v7, v8, v14, v15}, Landroidx/recyclerview/widget/a;->h(Ljava/lang/Object;III)Le1;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/a;->i(Le1;)V

    move v14, v6

    const/4 v15, 0x0

    goto :goto_15

    :cond_29
    const/4 v8, 0x4

    :goto_15
    const/4 v7, 0x0

    goto :goto_17

    :goto_16
    if-nez v7, :cond_2a

    iget-object v7, v5, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v0, v7, v8, v14, v15}, Landroidx/recyclerview/widget/a;->h(Ljava/lang/Object;III)Le1;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/a;->d(Le1;)V

    move v14, v6

    const/4 v15, 0x0

    :cond_2a
    move v7, v4

    :goto_17
    add-int/2addr v15, v4

    add-int/lit8 v6, v6, 0x1

    const/4 v8, -0x1

    const/4 v9, 0x2

    const/4 v10, 0x4

    goto :goto_12

    :cond_2b
    iget v6, v5, Le1;->d:I

    if-eq v15, v6, :cond_2c

    iget-object v6, v5, Le1;->c:Ljava/lang/Object;

    const/4 v10, 0x0

    iput-object v10, v5, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v11, v5}, LYt;->a(Ljava/lang/Object;)Z

    const/4 v8, 0x4

    invoke-virtual {v0, v6, v8, v14, v15}, Landroidx/recyclerview/widget/a;->h(Ljava/lang/Object;III)Le1;

    move-result-object v5

    goto :goto_18

    :cond_2c
    const/4 v8, 0x4

    :goto_18
    if-nez v7, :cond_2d

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/a;->d(Le1;)V

    goto :goto_19

    :cond_2d
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/a;->i(Le1;)V

    :goto_19
    const/4 v8, 0x0

    const/4 v14, 0x2

    goto/16 :goto_23

    :cond_2e
    move v8, v10

    iget v6, v5, Le1;->b:I

    iget v7, v5, Le1;->d:I

    add-int/2addr v7, v6

    move v9, v6

    const/4 v10, 0x0

    const/4 v13, -0x1

    :goto_1a
    if-ge v9, v7, :cond_36

    iget-object v14, v12, Landroidx/recyclerview/widget/f;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v14, v9, v4}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForPosition(IZ)Landroidx/recyclerview/widget/o;

    move-result-object v15

    if-nez v15, :cond_2f

    :goto_1b
    const/4 v15, 0x0

    goto :goto_1c

    :cond_2f
    iget-object v14, v14, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/b;

    iget-object v8, v15, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    iget-object v14, v14, Landroidx/recyclerview/widget/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_30

    sget v8, Landroidx/recyclerview/widget/RecyclerView;->HORIZONTAL:I

    goto :goto_1b

    :cond_30
    :goto_1c
    if-nez v15, :cond_31

    invoke-virtual {v0, v9}, Landroidx/recyclerview/widget/a;->a(I)Z

    move-result v8

    if-eqz v8, :cond_32

    :cond_31
    const/4 v8, 0x0

    const/4 v14, 0x2

    goto :goto_1e

    :cond_32
    const/4 v8, 0x0

    const/4 v14, 0x2

    if-ne v13, v4, :cond_33

    invoke-virtual {v0, v8, v14, v6, v10}, Landroidx/recyclerview/widget/a;->h(Ljava/lang/Object;III)Le1;

    move-result-object v13

    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/a;->i(Le1;)V

    move v13, v4

    goto :goto_1d

    :cond_33
    const/4 v13, 0x0

    :goto_1d
    const/4 v8, 0x0

    goto :goto_20

    :goto_1e
    if-nez v13, :cond_34

    invoke-virtual {v0, v8, v14, v6, v10}, Landroidx/recyclerview/widget/a;->h(Ljava/lang/Object;III)Le1;

    move-result-object v13

    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/a;->d(Le1;)V

    move v13, v4

    goto :goto_1f

    :cond_34
    const/4 v13, 0x0

    :goto_1f
    move v8, v4

    :goto_20
    if-eqz v13, :cond_35

    sub-int/2addr v9, v10

    sub-int/2addr v7, v10

    move v10, v4

    goto :goto_21

    :cond_35
    add-int/lit8 v10, v10, 0x1

    :goto_21
    add-int/2addr v9, v4

    move v13, v8

    const/4 v8, 0x4

    goto :goto_1a

    :cond_36
    iget v7, v5, Le1;->d:I

    const/4 v8, 0x0

    if-eq v10, v7, :cond_37

    iput-object v8, v5, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v11, v5}, LYt;->a(Ljava/lang/Object;)Z

    const/4 v14, 0x2

    invoke-virtual {v0, v8, v14, v6, v10}, Landroidx/recyclerview/widget/a;->h(Ljava/lang/Object;III)Le1;

    move-result-object v5

    goto :goto_22

    :cond_37
    const/4 v14, 0x2

    :goto_22
    if-nez v13, :cond_38

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/a;->d(Le1;)V

    goto :goto_23

    :cond_38
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/a;->i(Le1;)V

    goto :goto_23

    :cond_39
    move v14, v9

    const/4 v8, 0x0

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/a;->i(Le1;)V

    :goto_23
    add-int/lit8 v3, v3, 0x1

    move v9, v14

    const/16 v7, 0x8

    const/4 v8, -0x1

    const/4 v10, 0x4

    goto/16 :goto_10

    :cond_3a
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final k(Ljava/util/ArrayList;)V
    .locals 4

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le1;

    const/4 v3, 0x0

    iput-object v3, v2, Le1;->c:Ljava/lang/Object;

    iget-object v3, p0, Landroidx/recyclerview/widget/a;->a:LYt;

    invoke-virtual {v3, v2}, LYt;->a(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final l(II)I
    .locals 9

    iget-object v0, p0, Landroidx/recyclerview/widget/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    const/16 v3, 0x8

    if-ltz v1, :cond_d

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le1;

    iget v5, v4, Le1;->a:I

    const/4 v6, 0x2

    if-ne v5, v3, :cond_8

    iget v3, v4, Le1;->b:I

    iget v5, v4, Le1;->d:I

    if-ge v3, v5, :cond_0

    move v7, v3

    move v8, v5

    goto :goto_1

    :cond_0
    move v8, v3

    move v7, v5

    :goto_1
    if-lt p1, v7, :cond_6

    if-gt p1, v8, :cond_6

    if-ne v7, v3, :cond_3

    if-ne p2, v2, :cond_1

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, Le1;->d:I

    goto :goto_2

    :cond_1
    if-ne p2, v6, :cond_2

    add-int/lit8 v5, v5, -0x1

    iput v5, v4, Le1;->d:I

    :cond_2
    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_3
    if-ne p2, v2, :cond_4

    add-int/lit8 v3, v3, 0x1

    iput v3, v4, Le1;->b:I

    goto :goto_3

    :cond_4
    if-ne p2, v6, :cond_5

    add-int/lit8 v3, v3, -0x1

    iput v3, v4, Le1;->b:I

    :cond_5
    :goto_3
    add-int/lit8 p1, p1, -0x1

    goto :goto_4

    :cond_6
    if-ge p1, v3, :cond_c

    if-ne p2, v2, :cond_7

    add-int/lit8 v3, v3, 0x1

    iput v3, v4, Le1;->b:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, Le1;->d:I

    goto :goto_4

    :cond_7
    if-ne p2, v6, :cond_c

    add-int/lit8 v3, v3, -0x1

    iput v3, v4, Le1;->b:I

    add-int/lit8 v5, v5, -0x1

    iput v5, v4, Le1;->d:I

    goto :goto_4

    :cond_8
    iget v3, v4, Le1;->b:I

    if-gt v3, p1, :cond_a

    if-ne v5, v2, :cond_9

    iget v3, v4, Le1;->d:I

    sub-int/2addr p1, v3

    goto :goto_4

    :cond_9
    if-ne v5, v6, :cond_c

    iget v3, v4, Le1;->d:I

    add-int/2addr p1, v3

    goto :goto_4

    :cond_a
    if-ne p2, v2, :cond_b

    add-int/lit8 v3, v3, 0x1

    iput v3, v4, Le1;->b:I

    goto :goto_4

    :cond_b
    if-ne p2, v6, :cond_c

    add-int/lit8 v3, v3, -0x1

    iput v3, v4, Le1;->b:I

    :cond_c
    :goto_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    sub-int/2addr p2, v2

    :goto_5
    if-ltz p2, :cond_11

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le1;

    iget v2, v1, Le1;->a:I

    iget-object v4, p0, Landroidx/recyclerview/widget/a;->a:LYt;

    const/4 v5, 0x0

    if-ne v2, v3, :cond_f

    iget v2, v1, Le1;->d:I

    iget v6, v1, Le1;->b:I

    if-eq v2, v6, :cond_e

    if-gez v2, :cond_10

    :cond_e
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iput-object v5, v1, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v4, v1}, LYt;->a(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_f
    iget v2, v1, Le1;->d:I

    if-gtz v2, :cond_10

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iput-object v5, v1, Le1;->c:Ljava/lang/Object;

    invoke-virtual {v4, v1}, LYt;->a(Ljava/lang/Object;)Z

    :cond_10
    :goto_6
    add-int/lit8 p2, p2, -0x1

    goto :goto_5

    :cond_11
    return p1
.end method
