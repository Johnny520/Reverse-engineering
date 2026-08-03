.class public final Landroidx/recyclerview/widget/j;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:Lwv;

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/j;->h:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/j;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/j;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/j;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/j;->d:Ljava/util/List;

    const/4 p1, 0x2

    iput p1, p0, Landroidx/recyclerview/widget/j;->e:I

    iput p1, p0, Landroidx/recyclerview/widget/j;->f:I

    return-void
.end method

.method public static e(Landroid/view/ViewGroup;Z)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, v1}, Landroidx/recyclerview/widget/j;->e(Landroid/view/ViewGroup;Z)V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/o;Z)V
    .locals 4

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->clearNestedRecyclerViewIfNotNested(Landroidx/recyclerview/widget/o;)V

    iget-object v0, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    iget-object v1, p0, Landroidx/recyclerview/widget/j;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->mAccessibilityDelegate:LEv;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v2, LEv;->e:LDv;

    if-eqz v2, :cond_0

    iget-object v2, v2, LDv;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LP;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-static {v0, v2}, LlE;->l(Landroid/view/View;LP;)V

    :cond_1
    if-eqz p2, :cond_5

    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->mRecyclerListeners:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-gtz p2, :cond_4

    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    if-eqz p2, :cond_2

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/g;->onViewRecycled(Landroidx/recyclerview/widget/o;)V

    :cond_2
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    if-eqz p2, :cond_3

    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->mViewInfoStore:LsE;

    invoke-virtual {p2, p1}, LsE;->d(Landroidx/recyclerview/widget/o;)V

    :cond_3
    sget-boolean p2, Landroidx/recyclerview/widget/RecyclerView;->sVerboseLoggingEnabled:Z

    if-eqz p2, :cond_5

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_1

    :cond_4
    iget-object p1, v1, Landroidx/recyclerview/widget/RecyclerView;->mRecyclerListeners:Ljava/util/List;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_5
    :goto_1
    iput-object v3, p1, Landroidx/recyclerview/widget/o;->mBindingAdapter:Landroidx/recyclerview/widget/g;

    iput-object v3, p1, Landroidx/recyclerview/widget/o;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->c()Lwv;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->getItemViewType()I

    move-result v0

    invoke-virtual {p2, v0}, Lwv;->a(I)Lvv;

    move-result-object v1

    iget-object v1, v1, Lvv;->a:Ljava/util/ArrayList;

    iget-object p2, p2, Lwv;->a:Landroid/util/SparseArray;

    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lvv;

    iget p2, p2, Lvv;->b:I

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p2, v0, :cond_6

    iget-object p1, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-static {p1}, LPj;->c(Landroid/view/View;)V

    return-void

    :cond_6
    sget-boolean p2, Landroidx/recyclerview/widget/RecyclerView;->sDebugAssertionsEnabled:Z

    if-eqz p2, :cond_8

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "this scrap item already exists"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->resetInternal()V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(I)I
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->h:Landroidx/recyclerview/widget/RecyclerView;

    if-ltz p1, :cond_1

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    invoke-virtual {v1}, LAv;->b()I

    move-result v1

    if-ge p1, v1, :cond_1

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-boolean v1, v1, LAv;->g:Z

    if-nez v1, :cond_0

    return p1

    :cond_0
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mAdapterHelper:Landroidx/recyclerview/widget/a;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/a;->f(II)I

    move-result p1

    return p1

    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "invalid position "

    const-string v3, ". State item count is "

    invoke-static {p1, v2, v3}, Lph;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    invoke-virtual {v2}, LAv;->b()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->exceptionLabel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c()Lwv;
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->g:Lwv;

    if-nez v0, :cond_0

    new-instance v0, Lwv;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, v0, Lwv;->a:Landroid/util/SparseArray;

    const/4 v1, 0x0

    iput v1, v0, Lwv;->b:I

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lwv;->c:Ljava/util/Set;

    iput-object v0, p0, Landroidx/recyclerview/widget/j;->g:Lwv;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->f()V

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/j;->g:Lwv;

    return-object v0
.end method

.method public final d(I)Landroid/view/View;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/j;->m(IJ)Landroidx/recyclerview/widget/o;

    move-result-object p1

    iget-object p1, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    return-object p1
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->g:Lwv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/j;->g:Lwv;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    iget-object v1, v1, Lwv;->c:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final g(Landroidx/recyclerview/widget/g;Z)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->g:Lwv;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lwv;->a:Landroid/util/SparseArray;

    iget-object v0, v0, Lwv;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result p1

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    const/4 p1, 0x0

    move p2, p1

    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvv;

    iget-object v0, v0, Lvv;->a:Ljava/util/ArrayList;

    move v2, p1

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/o;

    iget-object v3, v3, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-static {v3}, LPj;->c(Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/j;->i(I)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->ALLOW_THREAD_GAP_WORK:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mPrefetchRegistry:Landroidx/recyclerview/widget/c;

    iget-object v1, v0, Landroidx/recyclerview/widget/c;->c:[I

    if-eqz v1, :cond_1

    const/4 v2, -0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    :cond_1
    const/4 v1, 0x0

    iput v1, v0, Landroidx/recyclerview/widget/c;->d:I

    :cond_2
    return-void
.end method

.method public final i(I)V
    .locals 3

    sget v0, Landroidx/recyclerview/widget/RecyclerView;->HORIZONTAL:I

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/o;

    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->sVerboseLoggingEnabled:Z

    if-eqz v2, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Landroidx/recyclerview/widget/j;->a(Landroidx/recyclerview/widget/o;Z)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final j(Landroid/view/View;)V
    .locals 3

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o;->isTmpDetached()Z

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/j;->h:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/o;->isScrap()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o;->unScrap()V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/o;->wasReturnedFromScrap()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o;->clearReturnedFromScrapFlag()V

    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/j;->k(Landroidx/recyclerview/widget/o;)V

    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->mItemAnimator:Landroidx/recyclerview/widget/h;

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o;->isRecyclable()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->mItemAnimator:Landroidx/recyclerview/widget/h;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/h;->d(Landroidx/recyclerview/widget/o;)V

    :cond_3
    return-void
.end method

.method public final k(Landroidx/recyclerview/widget/o;)V
    .locals 11

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->isScrap()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Landroidx/recyclerview/widget/j;->h:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_12

    iget-object v0, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    goto/16 :goto_a

    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->isTmpDetached()Z

    move-result v0

    if-nez v0, :cond_11

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->shouldIgnore()Z

    move-result v0

    if-nez v0, :cond_10

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->doesTransientStatePreventRecycling()Z

    move-result v0

    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    if-eqz v4, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v4, p1}, Landroidx/recyclerview/widget/g;->onFailedToRecycleView(Landroidx/recyclerview/widget/o;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    sget-boolean v5, Landroidx/recyclerview/widget/RecyclerView;->sDebugAssertionsEnabled:Z

    iget-object v6, p0, Landroidx/recyclerview/widget/j;->c:Ljava/util/ArrayList;

    if-eqz v5, :cond_3

    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cached view received recycle internal? "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v3, v1}, LEy;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    if-nez v4, :cond_6

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->isRecyclable()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->sVerboseLoggingEnabled:Z

    if-eqz v2, :cond_5

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->exceptionLabel()Ljava/lang/String;

    :cond_5
    move v2, v1

    goto/16 :goto_9

    :cond_6
    :goto_2
    iget v4, p0, Landroidx/recyclerview/widget/j;->f:I

    if-lez v4, :cond_d

    const/16 v4, 0x20e

    invoke-virtual {p1, v4}, Landroidx/recyclerview/widget/o;->hasAnyOfTheFlags(I)Z

    move-result v4

    if-nez v4, :cond_d

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    iget v5, p0, Landroidx/recyclerview/widget/j;->f:I

    if-lt v4, v5, :cond_7

    if-lez v4, :cond_7

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/j;->i(I)V

    add-int/lit8 v4, v4, -0x1

    :cond_7
    sget-boolean v5, Landroidx/recyclerview/widget/RecyclerView;->ALLOW_THREAD_GAP_WORK:Z

    if-eqz v5, :cond_c

    if-lez v4, :cond_c

    iget-object v5, v3, Landroidx/recyclerview/widget/RecyclerView;->mPrefetchRegistry:Landroidx/recyclerview/widget/c;

    iget v7, p1, Landroidx/recyclerview/widget/o;->mPosition:I

    iget-object v8, v5, Landroidx/recyclerview/widget/c;->c:[I

    if-eqz v8, :cond_9

    iget v8, v5, Landroidx/recyclerview/widget/c;->d:I

    mul-int/lit8 v8, v8, 0x2

    move v9, v1

    :goto_3
    if-ge v9, v8, :cond_9

    iget-object v10, v5, Landroidx/recyclerview/widget/c;->c:[I

    aget v10, v10, v9

    if-ne v10, v7, :cond_8

    goto :goto_6

    :cond_8
    add-int/lit8 v9, v9, 0x2

    goto :goto_3

    :cond_9
    add-int/lit8 v4, v4, -0x1

    :goto_4
    if-ltz v4, :cond_b

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/o;

    iget v5, v5, Landroidx/recyclerview/widget/o;->mPosition:I

    iget-object v7, v3, Landroidx/recyclerview/widget/RecyclerView;->mPrefetchRegistry:Landroidx/recyclerview/widget/c;

    iget-object v8, v7, Landroidx/recyclerview/widget/c;->c:[I

    if-eqz v8, :cond_b

    iget v8, v7, Landroidx/recyclerview/widget/c;->d:I

    mul-int/lit8 v8, v8, 0x2

    move v9, v1

    :goto_5
    if-ge v9, v8, :cond_b

    iget-object v10, v7, Landroidx/recyclerview/widget/c;->c:[I

    aget v10, v10, v9

    if-ne v10, v5, :cond_a

    add-int/lit8 v4, v4, -0x1

    goto :goto_4

    :cond_a
    add-int/lit8 v9, v9, 0x2

    goto :goto_5

    :cond_b
    add-int/2addr v4, v2

    :cond_c
    :goto_6
    invoke-virtual {v6, v4, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    move v4, v2

    goto :goto_7

    :cond_d
    move v4, v1

    :goto_7
    if-nez v4, :cond_e

    invoke-virtual {p0, p1, v2}, Landroidx/recyclerview/widget/j;->a(Landroidx/recyclerview/widget/o;Z)V

    :goto_8
    move v1, v4

    goto :goto_9

    :cond_e
    move v2, v1

    goto :goto_8

    :goto_9
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->mViewInfoStore:LsE;

    invoke-virtual {v3, p1}, LsE;->d(Landroidx/recyclerview/widget/o;)V

    if-nez v1, :cond_f

    if-nez v2, :cond_f

    if-eqz v0, :cond_f

    iget-object v0, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-static {v0}, LPj;->c(Landroid/view/View;)V

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/recyclerview/widget/o;->mBindingAdapter:Landroidx/recyclerview/widget/g;

    iput-object v0, p1, Landroidx/recyclerview/widget/o;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    :cond_f
    return-void

    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v0}, LEy;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v3, v1}, LEy;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    :goto_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Scrapped or attached views may not be recycled. isScrap:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->isScrap()Z

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " isAttached:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_13

    move v1, v2

    :cond_13
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->exceptionLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l(Landroid/view/View;)V
    .locals 3

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    move-result-object p1

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/o;->hasAnyOfTheFlags(I)Z

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/j;->h:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->isUpdated()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->canReuseUpdatedViewHolder(Landroidx/recyclerview/widget/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/j;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/j;->b:Ljava/util/ArrayList;

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/o;->setScrapContainer(Landroidx/recyclerview/widget/j;Z)V

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->isInvalid()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->isRemoved()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/g;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v0}, LEy;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/o;->setScrapContainer(Landroidx/recyclerview/widget/j;Z)V

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final m(IJ)Landroidx/recyclerview/widget/o;
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget-object v2, v0, Landroidx/recyclerview/widget/j;->h:Landroidx/recyclerview/widget/RecyclerView;

    if-ltz v1, :cond_47

    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    invoke-virtual {v3}, LAv;->b()I

    move-result v3

    if-ge v1, v3, :cond_47

    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-boolean v3, v3, LAv;->g:Z

    const/16 v4, 0x20

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_5

    iget-object v3, v0, Landroidx/recyclerview/widget/j;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    move v8, v7

    :goto_0
    if-ge v8, v3, :cond_2

    iget-object v9, v0, Landroidx/recyclerview/widget/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/recyclerview/widget/o;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->wasReturnedFromScrap()Z

    move-result v10

    if-nez v10, :cond_1

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->getLayoutPosition()I

    move-result v10

    if-ne v10, v1, :cond_1

    invoke-virtual {v9, v4}, Landroidx/recyclerview/widget/o;->addFlags(I)V

    goto :goto_3

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    iget-object v8, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v8}, Landroidx/recyclerview/widget/g;->hasStableIds()Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object v8, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapterHelper:Landroidx/recyclerview/widget/a;

    invoke-virtual {v8, v1, v7}, Landroidx/recyclerview/widget/a;->f(II)I

    move-result v8

    if-lez v8, :cond_4

    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/g;->getItemCount()I

    move-result v9

    if-ge v8, v9, :cond_4

    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v9, v8}, Landroidx/recyclerview/widget/g;->getItemId(I)J

    move-result-wide v8

    move v10, v7

    :goto_1
    if-ge v10, v3, :cond_4

    iget-object v11, v0, Landroidx/recyclerview/widget/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/recyclerview/widget/o;

    invoke-virtual {v11}, Landroidx/recyclerview/widget/o;->wasReturnedFromScrap()Z

    move-result v12

    if-nez v12, :cond_3

    invoke-virtual {v11}, Landroidx/recyclerview/widget/o;->getItemId()J

    move-result-wide v12

    cmp-long v12, v12, v8

    if-nez v12, :cond_3

    invoke-virtual {v11, v4}, Landroidx/recyclerview/widget/o;->addFlags(I)V

    move-object v9, v11

    goto :goto_3

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    move-object v9, v5

    :goto_3
    if-eqz v9, :cond_6

    move v3, v6

    goto :goto_4

    :cond_5
    move-object v9, v5

    :cond_6
    move v3, v7

    :goto_4
    iget-object v8, v0, Landroidx/recyclerview/widget/j;->a:Ljava/util/ArrayList;

    iget-object v10, v0, Landroidx/recyclerview/widget/j;->c:Ljava/util/ArrayList;

    if-nez v9, :cond_1d

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    move v11, v7

    :goto_5
    if-ge v11, v9, :cond_a

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/recyclerview/widget/o;

    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->wasReturnedFromScrap()Z

    move-result v13

    if-nez v13, :cond_9

    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->getLayoutPosition()I

    move-result v13

    if-ne v13, v1, :cond_9

    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->isInvalid()Z

    move-result v13

    if-nez v13, :cond_9

    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-boolean v13, v13, LAv;->g:Z

    if-nez v13, :cond_7

    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->isRemoved()Z

    move-result v13

    if-nez v13, :cond_9

    :cond_7
    invoke-virtual {v12, v4}, Landroidx/recyclerview/widget/o;->addFlags(I)V

    :cond_8
    :goto_6
    move-object v9, v12

    goto/16 :goto_a

    :cond_9
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_a
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/b;

    iget-object v9, v9, Landroidx/recyclerview/widget/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v11

    move v12, v7

    :goto_7
    if-ge v12, v11, :cond_c

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/view/View;

    invoke-static {v13}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    move-result-object v14

    invoke-virtual {v14}, Landroidx/recyclerview/widget/o;->getLayoutPosition()I

    move-result v15

    if-ne v15, v1, :cond_b

    invoke-virtual {v14}, Landroidx/recyclerview/widget/o;->isInvalid()Z

    move-result v15

    if-nez v15, :cond_b

    invoke-virtual {v14}, Landroidx/recyclerview/widget/o;->isRemoved()Z

    move-result v14

    if-nez v14, :cond_b

    goto :goto_8

    :cond_b
    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :cond_c
    move-object v13, v5

    :goto_8
    if-eqz v13, :cond_10

    invoke-static {v13}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    move-result-object v9

    iget-object v11, v2, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/b;

    iget-object v12, v11, Landroidx/recyclerview/widget/b;->b:Lj9;

    iget-object v14, v11, Landroidx/recyclerview/widget/b;->a:Lev;

    iget-object v14, v14, Lev;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v14, v13}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v14

    if-ltz v14, :cond_f

    invoke-virtual {v12, v14}, Lj9;->d(I)Z

    move-result v15

    if-eqz v15, :cond_e

    invoke-virtual {v12, v14}, Lj9;->a(I)V

    invoke-virtual {v11, v13}, Landroidx/recyclerview/widget/b;->k(Landroid/view/View;)V

    iget-object v11, v2, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/b;

    invoke-virtual {v11, v13}, Landroidx/recyclerview/widget/b;->j(Landroid/view/View;)I

    move-result v11

    const/4 v12, -0x1

    if-eq v11, v12, :cond_d

    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/b;

    invoke-virtual {v12, v11}, Landroidx/recyclerview/widget/b;->c(I)V

    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/j;->l(Landroid/view/View;)V

    const/16 v11, 0x2020

    invoke-virtual {v9, v11}, Landroidx/recyclerview/widget/o;->addFlags(I)V

    goto :goto_a

    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "layout index should not be -1 after unhiding a view:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2, v3}, LEy;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "trying to unhide a view that was not hidden"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "view is not a child, cannot hide "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v9

    move v11, v7

    :goto_9
    if-ge v11, v9, :cond_12

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/recyclerview/widget/o;

    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->isInvalid()Z

    move-result v13

    if-nez v13, :cond_11

    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->getLayoutPosition()I

    move-result v13

    if-ne v13, v1, :cond_11

    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->isAttachedToTransitionOverlay()Z

    move-result v13

    if-nez v13, :cond_11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    sget-boolean v9, Landroidx/recyclerview/widget/RecyclerView;->sVerboseLoggingEnabled:Z

    if-eqz v9, :cond_8

    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->toString()Ljava/lang/String;

    goto/16 :goto_6

    :cond_11
    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_12
    move-object v9, v5

    :goto_a
    if-eqz v9, :cond_1d

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->isRemoved()Z

    move-result v11

    if-eqz v11, :cond_15

    sget-boolean v11, Landroidx/recyclerview/widget/RecyclerView;->sDebugAssertionsEnabled:Z

    if-eqz v11, :cond_14

    iget-object v11, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-boolean v11, v11, LAv;->g:Z

    if-eqz v11, :cond_13

    goto :goto_b

    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "should not receive a removed view unless it is pre layout"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3}, LEy;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_14
    :goto_b
    iget-object v11, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-boolean v11, v11, LAv;->g:Z

    goto :goto_c

    :cond_15
    iget v11, v9, Landroidx/recyclerview/widget/o;->mPosition:I

    if-ltz v11, :cond_1c

    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v12}, Landroidx/recyclerview/widget/g;->getItemCount()I

    move-result v12

    if-ge v11, v12, :cond_1c

    iget-object v11, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-boolean v11, v11, LAv;->g:Z

    if-nez v11, :cond_17

    iget-object v11, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    iget v12, v9, Landroidx/recyclerview/widget/o;->mPosition:I

    invoke-virtual {v11, v12}, Landroidx/recyclerview/widget/g;->getItemViewType(I)I

    move-result v11

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->getItemViewType()I

    move-result v12

    if-eq v11, v12, :cond_17

    :cond_16
    move v11, v7

    goto :goto_c

    :cond_17
    iget-object v11, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v11}, Landroidx/recyclerview/widget/g;->hasStableIds()Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->getItemId()J

    move-result-wide v11

    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    iget v14, v9, Landroidx/recyclerview/widget/o;->mPosition:I

    invoke-virtual {v13, v14}, Landroidx/recyclerview/widget/g;->getItemId(I)J

    move-result-wide v13

    cmp-long v11, v11, v13

    if-nez v11, :cond_16

    :cond_18
    move v11, v6

    :goto_c
    if-nez v11, :cond_1b

    const/4 v11, 0x4

    invoke-virtual {v9, v11}, Landroidx/recyclerview/widget/o;->addFlags(I)V

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->isScrap()Z

    move-result v11

    if-eqz v11, :cond_19

    iget-object v11, v9, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v2, v11, v7}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->unScrap()V

    goto :goto_d

    :cond_19
    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->wasReturnedFromScrap()Z

    move-result v11

    if-eqz v11, :cond_1a

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->clearReturnedFromScrapFlag()V

    :cond_1a
    :goto_d
    invoke-virtual {v0, v9}, Landroidx/recyclerview/widget/j;->k(Landroidx/recyclerview/widget/o;)V

    move-object v9, v5

    goto :goto_e

    :cond_1b
    move v3, v6

    goto :goto_e

    :cond_1c
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Inconsistency detected. Invalid view holder adapter position"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2, v3}, LEy;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1d
    :goto_e
    const-wide v17, 0x7fffffffffffffffL

    if-nez v9, :cond_31

    const-wide/16 v19, 0x3

    iget-object v11, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapterHelper:Landroidx/recyclerview/widget/a;

    invoke-virtual {v11, v1, v7}, Landroidx/recyclerview/widget/a;->f(II)I

    move-result v11

    if-ltz v11, :cond_30

    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v12}, Landroidx/recyclerview/widget/g;->getItemCount()I

    move-result v12

    if-ge v11, v12, :cond_30

    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v12, v11}, Landroidx/recyclerview/widget/g;->getItemViewType(I)I

    move-result v12

    const-wide/16 v21, 0x4

    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v13}, Landroidx/recyclerview/widget/g;->hasStableIds()Z

    move-result v13

    if-eqz v13, :cond_25

    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v9, v11}, Landroidx/recyclerview/widget/g;->getItemId(I)J

    move-result-wide v13

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int/2addr v9, v6

    :goto_f
    if-ltz v9, :cond_21

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    const-wide/16 v24, 0x0

    move-object/from16 v15, v23

    check-cast v15, Landroidx/recyclerview/widget/o;

    invoke-virtual {v15}, Landroidx/recyclerview/widget/o;->getItemId()J

    move-result-wide v26

    cmp-long v16, v26, v13

    if-nez v16, :cond_20

    invoke-virtual {v15}, Landroidx/recyclerview/widget/o;->wasReturnedFromScrap()Z

    move-result v16

    if-nez v16, :cond_20

    move/from16 v16, v6

    invoke-virtual {v15}, Landroidx/recyclerview/widget/o;->getItemViewType()I

    move-result v6

    if-ne v12, v6, :cond_1f

    invoke-virtual {v15, v4}, Landroidx/recyclerview/widget/o;->addFlags(I)V

    invoke-virtual {v15}, Landroidx/recyclerview/widget/o;->isRemoved()Z

    move-result v4

    if-eqz v4, :cond_1e

    iget-object v4, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-boolean v4, v4, LAv;->g:Z

    if-nez v4, :cond_1e

    const/4 v4, 0x2

    const/16 v6, 0xe

    invoke-virtual {v15, v4, v6}, Landroidx/recyclerview/widget/o;->setFlags(II)V

    :cond_1e
    move-object v9, v15

    goto :goto_12

    :cond_1f
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object v6, v15, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v2, v6, v7}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    iget-object v6, v15, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    move-result-object v6

    iput-object v5, v6, Landroidx/recyclerview/widget/o;->mScrapContainer:Landroidx/recyclerview/widget/j;

    iput-boolean v7, v6, Landroidx/recyclerview/widget/o;->mInChangeScrap:Z

    invoke-virtual {v6}, Landroidx/recyclerview/widget/o;->clearReturnedFromScrapFlag()V

    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/j;->k(Landroidx/recyclerview/widget/o;)V

    goto :goto_10

    :cond_20
    move/from16 v16, v6

    :goto_10
    add-int/lit8 v9, v9, -0x1

    move/from16 v6, v16

    goto :goto_f

    :cond_21
    move/from16 v16, v6

    const-wide/16 v24, 0x0

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    :goto_11
    if-ltz v4, :cond_23

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/o;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/o;->getItemId()J

    move-result-wide v8

    cmp-long v8, v8, v13

    if-nez v8, :cond_24

    invoke-virtual {v6}, Landroidx/recyclerview/widget/o;->isAttachedToTransitionOverlay()Z

    move-result v8

    if-nez v8, :cond_24

    invoke-virtual {v6}, Landroidx/recyclerview/widget/o;->getItemViewType()I

    move-result v8

    if-ne v12, v8, :cond_22

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-object v9, v6

    goto :goto_12

    :cond_22
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/j;->i(I)V

    :cond_23
    move-object v9, v5

    goto :goto_12

    :cond_24
    add-int/lit8 v4, v4, -0x1

    goto :goto_11

    :goto_12
    if-eqz v9, :cond_26

    iput v11, v9, Landroidx/recyclerview/widget/o;->mPosition:I

    move/from16 v3, v16

    goto :goto_13

    :cond_25
    move/from16 v16, v6

    const-wide/16 v24, 0x0

    :cond_26
    :goto_13
    if-nez v9, :cond_2a

    sget v4, Landroidx/recyclerview/widget/RecyclerView;->HORIZONTAL:I

    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->c()Lwv;

    move-result-object v4

    iget-object v4, v4, Lwv;->a:Landroid/util/SparseArray;

    invoke-virtual {v4, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvv;

    if-eqz v4, :cond_28

    iget-object v4, v4, Lvv;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_28

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    :goto_14
    if-ltz v6, :cond_28

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/recyclerview/widget/o;

    invoke-virtual {v8}, Landroidx/recyclerview/widget/o;->isAttachedToTransitionOverlay()Z

    move-result v8

    if-nez v8, :cond_27

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/o;

    goto :goto_15

    :cond_27
    add-int/lit8 v6, v6, -0x1

    goto :goto_14

    :cond_28
    move-object v4, v5

    :goto_15
    if-eqz v4, :cond_29

    invoke-virtual {v4}, Landroidx/recyclerview/widget/o;->resetInternal()V

    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->FORCE_INVALIDATE_DISPLAY_LIST:Z

    if-eqz v6, :cond_29

    iget-object v6, v4, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    instance-of v8, v6, Landroid/view/ViewGroup;

    if-eqz v8, :cond_29

    check-cast v6, Landroid/view/ViewGroup;

    invoke-static {v6, v7}, Landroidx/recyclerview/widget/j;->e(Landroid/view/ViewGroup;Z)V

    :cond_29
    move-object v9, v4

    :cond_2a
    if-nez v9, :cond_32

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v8

    cmp-long v4, p2, v17

    if-eqz v4, :cond_2d

    iget-object v4, v0, Landroidx/recyclerview/widget/j;->g:Lwv;

    invoke-virtual {v4, v12}, Lwv;->a(I)Lvv;

    move-result-object v4

    iget-wide v10, v4, Lvv;->c:J

    cmp-long v4, v10, v24

    if-eqz v4, :cond_2c

    add-long/2addr v10, v8

    cmp-long v4, v10, p2

    if-gez v4, :cond_2b

    goto :goto_16

    :cond_2b
    move v4, v7

    goto :goto_17

    :cond_2c
    :goto_16
    move/from16 v4, v16

    :goto_17
    if-nez v4, :cond_2d

    return-object v5

    :cond_2d
    iget-object v4, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v4, v2, v12}, Landroidx/recyclerview/widget/g;->createViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o;

    move-result-object v4

    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->ALLOW_THREAD_GAP_WORK:Z

    if-eqz v6, :cond_2e

    iget-object v6, v4, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->findNestedRecyclerView(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v6

    if-eqz v6, :cond_2e

    new-instance v10, Ljava/lang/ref/WeakReference;

    invoke-direct {v10, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v10, v4, Landroidx/recyclerview/widget/o;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    :cond_2e
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v10

    iget-object v6, v0, Landroidx/recyclerview/widget/j;->g:Lwv;

    sub-long/2addr v10, v8

    invoke-virtual {v6, v12}, Lwv;->a(I)Lvv;

    move-result-object v6

    iget-wide v8, v6, Lvv;->c:J

    cmp-long v12, v8, v24

    if-nez v12, :cond_2f

    goto :goto_18

    :cond_2f
    div-long v8, v8, v21

    mul-long v8, v8, v19

    div-long v10, v10, v21

    add-long/2addr v10, v8

    :goto_18
    iput-wide v10, v6, Lvv;->c:J

    move-object v9, v4

    goto :goto_19

    :cond_30
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Inconsistency detected. Invalid item position "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "(offset:"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ").state:"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    invoke-virtual {v1}, LAv;->b()I

    move-result v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->exceptionLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_31
    move/from16 v16, v6

    const-wide/16 v19, 0x3

    const-wide/16 v21, 0x4

    const-wide/16 v24, 0x0

    :cond_32
    :goto_19
    if-eqz v3, :cond_33

    iget-object v4, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-boolean v4, v4, LAv;->g:Z

    if-nez v4, :cond_33

    const/16 v4, 0x2000

    invoke-virtual {v9, v4}, Landroidx/recyclerview/widget/o;->hasAnyOfTheFlags(I)Z

    move-result v6

    if-eqz v6, :cond_33

    invoke-virtual {v9, v7, v4}, Landroidx/recyclerview/widget/o;->setFlags(II)V

    iget-object v4, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-boolean v4, v4, LAv;->j:Z

    if-eqz v4, :cond_33

    invoke-static {v9}, Landroidx/recyclerview/widget/h;->b(Landroidx/recyclerview/widget/o;)V

    iget-object v4, v2, Landroidx/recyclerview/widget/RecyclerView;->mItemAnimator:Landroidx/recyclerview/widget/h;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->getUnmodifiedPayloads()Ljava/util/List;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Llv;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, v9}, Llv;->a(Landroidx/recyclerview/widget/o;)V

    invoke-virtual {v2, v9, v4}, Landroidx/recyclerview/widget/RecyclerView;->recordAnimationInfoIfBouncedHiddenView(Landroidx/recyclerview/widget/o;Llv;)V

    :cond_33
    iget-object v4, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-boolean v4, v4, LAv;->g:Z

    if-eqz v4, :cond_34

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->isBound()Z

    move-result v4

    if-eqz v4, :cond_34

    iput v1, v9, Landroidx/recyclerview/widget/o;->mPreLayoutPosition:I

    goto :goto_1a

    :cond_34
    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->isBound()Z

    move-result v4

    if-eqz v4, :cond_36

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->needsUpdate()Z

    move-result v4

    if-nez v4, :cond_36

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->isInvalid()Z

    move-result v4

    if-eqz v4, :cond_35

    goto :goto_1b

    :cond_35
    :goto_1a
    move v1, v7

    move/from16 v6, v16

    goto/16 :goto_22

    :cond_36
    :goto_1b
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->sDebugAssertionsEnabled:Z

    if-eqz v4, :cond_38

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->isRemoved()Z

    move-result v4

    if-nez v4, :cond_37

    goto :goto_1c

    :cond_37
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Removed holder should be bound and it should come here only in pre-layout. Holder: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2, v3}, LEy;->d(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_38
    :goto_1c
    iget-object v4, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapterHelper:Landroidx/recyclerview/widget/a;

    invoke-virtual {v4, v1, v7}, Landroidx/recyclerview/widget/a;->f(II)I

    move-result v4

    iput-object v5, v9, Landroidx/recyclerview/widget/o;->mBindingAdapter:Landroidx/recyclerview/widget/g;

    iput-object v2, v9, Landroidx/recyclerview/widget/o;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->getItemViewType()I

    move-result v6

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v10

    cmp-long v8, p2, v17

    if-eqz v8, :cond_39

    iget-object v8, v0, Landroidx/recyclerview/widget/j;->g:Lwv;

    invoke-virtual {v8, v6}, Lwv;->a(I)Lvv;

    move-result-object v6

    iget-wide v12, v6, Lvv;->d:J

    cmp-long v6, v12, v24

    if-eqz v6, :cond_39

    add-long/2addr v12, v10

    cmp-long v6, v12, p2

    if-gez v6, :cond_35

    :cond_39
    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->isTmpDetached()Z

    move-result v6

    if-eqz v6, :cond_3a

    iget-object v6, v9, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    iget-object v12, v9, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    invoke-static {v2, v6, v8, v12}, Landroidx/recyclerview/widget/RecyclerView;->access$300(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    move/from16 v6, v16

    goto :goto_1d

    :cond_3a
    move v6, v7

    :goto_1d
    iget-object v8, v2, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/g;

    invoke-virtual {v8, v9, v4}, Landroidx/recyclerview/widget/g;->bindViewHolder(Landroidx/recyclerview/widget/o;I)V

    if-eqz v6, :cond_3b

    iget-object v4, v9, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-static {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->access$400(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V

    :cond_3b
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v12

    iget-object v4, v0, Landroidx/recyclerview/widget/j;->g:Lwv;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/o;->getItemViewType()I

    move-result v6

    sub-long/2addr v12, v10

    invoke-virtual {v4, v6}, Lwv;->a(I)Lvv;

    move-result-object v4

    iget-wide v10, v4, Lvv;->d:J

    cmp-long v6, v10, v24

    if-nez v6, :cond_3c

    goto :goto_1e

    :cond_3c
    div-long v10, v10, v21

    mul-long v10, v10, v19

    div-long v12, v12, v21

    add-long/2addr v12, v10

    :goto_1e
    iput-wide v12, v4, Lvv;->d:J

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->isAccessibilityEnabled()Z

    move-result v4

    if-eqz v4, :cond_42

    iget-object v4, v9, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    sget-object v6, LlE;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v4}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v6

    if-nez v6, :cond_3d

    move/from16 v6, v16

    invoke-virtual {v4, v6}, Landroid/view/View;->setImportantForAccessibility(I)V

    goto :goto_1f

    :cond_3d
    move/from16 v6, v16

    :goto_1f
    iget-object v8, v2, Landroidx/recyclerview/widget/RecyclerView;->mAccessibilityDelegate:LEv;

    if-nez v8, :cond_3e

    goto :goto_21

    :cond_3e
    iget-object v8, v8, LEv;->e:LDv;

    if-eqz v8, :cond_41

    invoke-static {v4}, LlE;->c(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object v10

    if-nez v10, :cond_3f

    goto :goto_20

    :cond_3f
    instance-of v5, v10, LO;

    if-eqz v5, :cond_40

    check-cast v10, LO;

    iget-object v5, v10, LO;->a:LP;

    goto :goto_20

    :cond_40
    new-instance v5, LP;

    invoke-direct {v5, v10}, LP;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    :goto_20
    if-eqz v5, :cond_41

    if-eq v5, v8, :cond_41

    iget-object v10, v8, LDv;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v10, v4, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_41
    invoke-static {v4, v8}, LlE;->l(Landroid/view/View;LP;)V

    goto :goto_21

    :cond_42
    move/from16 v6, v16

    :goto_21
    iget-object v4, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    iget-boolean v4, v4, LAv;->g:Z

    if-eqz v4, :cond_43

    iput v1, v9, Landroidx/recyclerview/widget/o;->mPreLayoutPosition:I

    :cond_43
    move v1, v6

    :goto_22
    iget-object v4, v9, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    if-nez v4, :cond_44

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Lqv;

    iget-object v4, v9, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_23

    :cond_44
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v5

    if-nez v5, :cond_45

    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Lqv;

    iget-object v4, v9, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_23

    :cond_45
    move-object v2, v4

    check-cast v2, Lqv;

    :goto_23
    iput-object v9, v2, Lqv;->a:Landroidx/recyclerview/widget/o;

    if-eqz v3, :cond_46

    if-eqz v1, :cond_46

    goto :goto_24

    :cond_46
    move v6, v7

    :goto_24
    iput-boolean v6, v2, Lqv;->d:Z

    return-object v9

    :cond_47
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Invalid item position "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "). Item count:"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v2, Landroidx/recyclerview/widget/RecyclerView;->mState:LAv;

    invoke-virtual {v1}, LAv;->b()I

    move-result v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->exceptionLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method public final n(Landroidx/recyclerview/widget/o;)V
    .locals 1

    iget-boolean v0, p1, Landroidx/recyclerview/widget/o;->mInChangeScrap:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/recyclerview/widget/o;->mScrapContainer:Landroidx/recyclerview/widget/j;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/recyclerview/widget/o;->mInChangeScrap:Z

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->clearReturnedFromScrapFlag()V

    return-void
.end method

.method public final o()V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/i;

    if-eqz v0, :cond_0

    iget v0, v0, Landroidx/recyclerview/widget/i;->mPrefetchMaxCountObserved:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/j;->e:I

    add-int/2addr v1, v0

    iput v1, p0, Landroidx/recyclerview/widget/j;->f:I

    iget-object v0, p0, Landroidx/recyclerview/widget/j;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_1
    if-ltz v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, p0, Landroidx/recyclerview/widget/j;->f:I

    if-le v2, v3, :cond_1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/j;->i(I)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_1
    return-void
.end method
