.class public abstract Lf0/a;
.super Le/i;
.source "SourceFile"


# virtual methods
.method public final onBackPressed()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/activity/g;->onBackPressed()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1d

    .line 7
    .line 8
    if-lt v0, v1, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/activity/g;->i:Landroidx/activity/i;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/activity/i;->b:Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->descendingIterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroidx/fragment/app/u;

    .line 29
    .line 30
    iget-boolean v1, v1, Landroidx/fragment/app/u;->a:Z

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAfterTransition()V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
.end method
