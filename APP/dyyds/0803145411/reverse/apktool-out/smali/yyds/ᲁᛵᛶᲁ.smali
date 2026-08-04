.class public abstract Lyyds/ᲁᛵᛶᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# direct methods
.method public static ᛲᲈᲁ(Landroid/app/Activity;Lyyds/ᛳᛷᛵᛷ;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lyyds/ᲁᲇᛴᲀ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lyyds/ᲁᲇᛴᲀ;

    .line 6
    .line 7
    invoke-interface {p0}, Lyyds/ᲁᲇᛴᲀ;->ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/lifecycle/ᛲᲈᲁ;->ᲇᲈᛵᛷ(Lyyds/ᛳᛷᛵᛷ;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Landroid/app/Activity;)V
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᲀᛱᛴᲁ$ᛲᲈᲁ;->Companion:Lyyds/ᛲᛴᛸᛷ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lyyds/ᲀᛱᛴᲁ$ᛲᲈᲁ;

    .line 7
    .line 8
    invoke-direct {v0}, Lyyds/ᲀᛱᛴᲁ$ᛲᲈᲁ;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/app/Activity;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, Lyyds/ᲀᛱᛴᲁ;

    .line 31
    .line 32
    invoke-direct {v2}, Landroid/app/Fragment;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method
