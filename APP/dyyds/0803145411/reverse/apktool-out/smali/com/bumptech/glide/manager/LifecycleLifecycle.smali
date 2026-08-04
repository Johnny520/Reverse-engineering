.class final Lcom/bumptech/glide/manager/LifecycleLifecycle;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᲇᛵ;
.implements Lyyds/ᛳᛶᲁᛴ;


# virtual methods
.method public onDestroy(Lyyds/ᲁᲇᛴᲀ;)V
    .locals 2
    .annotation runtime Lyyds/ᛷᲀᛳᲀ;
        value = .enum Lyyds/ᛳᛷᛵᛷ;->ON_DESTROY:Lyyds/ᛳᛷᛵᛷ;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lyyds/ᛱᛷᲈᛲ;->ᛱᲈᲁ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lyyds/ᛵᛱᛸᲁ;

    .line 21
    .line 22
    invoke-interface {v1}, Lyyds/ᛵᛱᛸᲁ;->ᛷᛲᲈᛱ()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {p1}, Lyyds/ᲁᲇᛴᲀ;->ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, p0}, Landroidx/lifecycle/ᛲᲈᲁ;->ᲇᲇᲇᛱ(Lyyds/ᛳᛶᲁᛴ;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onStart(Lyyds/ᲁᲇᛴᲀ;)V
    .locals 0
    .annotation runtime Lyyds/ᛷᲀᛳᲀ;
        value = .enum Lyyds/ᛳᛷᛵᛷ;->ON_START:Lyyds/ᛳᛷᛵᛷ;
    .end annotation

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0}, Lyyds/ᛱᛷᲈᛲ;->ᛱᲈᲁ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lyyds/ᛵᛱᛸᲁ;

    .line 21
    .line 22
    invoke-interface {p1}, Lyyds/ᛵᛱᛸᲁ;->ᛷᲈᲈᲁ()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public onStop(Lyyds/ᲁᲇᛴᲀ;)V
    .locals 0
    .annotation runtime Lyyds/ᛷᲀᛳᲀ;
        value = .enum Lyyds/ᛳᛷᛵᛷ;->ON_STOP:Lyyds/ᛳᛷᛵᛷ;
    .end annotation

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0}, Lyyds/ᛱᛷᲈᛲ;->ᛱᲈᲁ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lyyds/ᛵᛱᛸᲁ;

    .line 21
    .line 22
    invoke-interface {p1}, Lyyds/ᛵᛱᛸᲁ;->ᲀᛲᛳᲀ()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛵᛱᛸᲁ;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᛵᛱᛸᲁ;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method
