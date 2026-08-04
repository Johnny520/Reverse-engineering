.class public final Lyyds/ᛲᲇᲁᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public ᛲᲈᲁ:Landroid/app/Activity;

.field public ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲇᲁᛲ;->ᛲᲈᲁ:Landroid/app/Activity;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lyyds/ᛲᲇᲁᛲ;->ᛲᲈᲁ:Landroid/app/Activity;

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛲᲇᲁᛲ;->ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lyyds/ᛴᛸᛵᲈ;

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :cond_2
    invoke-virtual {v0}, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lyyds/ᛲᲇᲁᛲ;->ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲇᲁᛲ;->ᛲᲈᲁ:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne v0, p1, :cond_4

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, Lyyds/ᛲᲇᲁᛲ;->ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lyyds/ᛴᛸᛵᲈ;

    .line 22
    .line 23
    if-nez p0, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    iget-boolean p1, p0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ:Z

    .line 27
    .line 28
    if-nez p1, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    invoke-virtual {p0}, Lyyds/ᛴᛸᛵᲈ;->ᛲᲈᲁ()V

    .line 32
    .line 33
    .line 34
    :cond_4
    :goto_0
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method
