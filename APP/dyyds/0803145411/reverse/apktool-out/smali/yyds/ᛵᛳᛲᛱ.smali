.class public final Lyyds/ᛵᛳᛲᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public ᛲᲈᲁ:Landroid/app/Activity;

.field public ᛵᛸᛸᛷ:Landroid/app/Application;

.field public ᲀᛲᛳᲀ:Lyyds/ᛴᛸᲀᛵ;


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛳᛲᛱ;->ᛲᲈᲁ:Landroid/app/Activity;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Lyyds/ᛵᛳᛲᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᲀᛵ;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Lyyds/ᛴᛸᲀᛵ;->ᛲᲈᲁ()V

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛵᛳᛲᛱ;->ᛲᲈᲁ()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lyyds/ᛵᛳᛲᛱ;->ᛲᲈᲁ:Landroid/app/Activity;

    .line 18
    .line 19
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛳᛲᛱ;->ᛲᲈᲁ:Landroid/app/Activity;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p0, p0, Lyyds/ᛵᛳᛲᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᲀᛵ;

    .line 7
    .line 8
    if-nez p0, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛴᛸᲀᛵ;->ᛲᲈᲁ()V

    .line 12
    .line 13
    .line 14
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

.method public final ᛲᲈᲁ()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lyyds/ᛵᛳᛲᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᲀᛵ;

    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᛵᛳᛲᛱ;->ᛲᲈᲁ:Landroid/app/Activity;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0, p0}, Landroid/app/Activity;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
