.class public final Landroidx/activity/ᛲᲈᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:Landroid/window/OnBackInvokedDispatcher;

.field public final ᛲᲈᲁ:Lyyds/ᛲᛳᛵᛱ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛱᲁᛳᛵ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᲁᛵᲀᛵ;

.field public ᲇᲇᲇᛱ:Z

.field public final ᲇᲈᛵᛷ:Landroid/window/OnBackInvokedCallback;


# direct methods
.method public constructor <init>(Lyyds/ᛲᛳᛵᛱ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/ᛲᲈᲁ;->ᛲᲈᲁ:Lyyds/ᛲᛳᛵᛱ;

    .line 5
    .line 6
    new-instance p1, Lyyds/ᛱᲁᛳᛵ;

    .line 7
    .line 8
    invoke-direct {p1}, Lyyds/ᛱᲁᛳᛵ;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/activity/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛱᲁᛳᛵ;

    .line 12
    .line 13
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v0, 0x21

    .line 16
    .line 17
    if-lt p1, v0, :cond_0

    .line 18
    .line 19
    new-instance p1, Lyyds/ᲁᛵᲀᛵ;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p1, v0, p0}, Lyyds/ᲁᛵᲀᛵ;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/activity/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛵᲀᛵ;

    .line 26
    .line 27
    new-instance p1, Lyyds/ᲁᛵᲀᛵ;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-direct {p1, v0, p0}, Lyyds/ᲁᛵᲀᛵ;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lyyds/ᛵᲁᲁᛷ;->ᛲᲈᲁ:Lyyds/ᛵᲁᲁᛷ;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lyyds/ᛵᲁᲁᛷ;->ᛲᲈᲁ(Lyyds/ᲁᛶᲁᲀ;)Landroid/window/OnBackInvokedCallback;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Landroidx/activity/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Landroid/window/OnBackInvokedCallback;

    .line 40
    .line 41
    :cond_0
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᲈᛵᲇᛴ;Lyyds/ᲈᲀᲀᛶ;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lyyds/ᲁᲇᛴᲀ;->ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Landroidx/lifecycle/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲈᛷᛸ;

    .line 6
    .line 7
    sget-object v1, Lyyds/ᛶᲈᛷᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲈᛷᛸ;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1, p2}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;-><init>(Landroidx/activity/ᛲᲈᲁ;Landroidx/lifecycle/ᛲᲈᲁ;Lyyds/ᲈᲀᲀᛶ;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p2, Lyyds/ᛷᛴᛶᲀ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v0, 0x21

    .line 25
    .line 26
    if-lt p1, v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/activity/ᛲᲈᲁ;->ᲀᛲᛳᲀ()V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Landroidx/activity/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛵᲀᛵ;

    .line 32
    .line 33
    iput-object p0, p2, Lyyds/ᛷᛴᛶᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛵᲀᛵ;

    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/activity/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛱᲁᛳᛵ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᛱᲁᛳᛵ;->ᛲᲈᲁ()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v2, v1

    .line 22
    check-cast v2, Lyyds/ᛷᛴᛶᲀ;

    .line 23
    .line 24
    iget-boolean v2, v2, Lyyds/ᛷᛴᛶᲀ;->ᛲᲈᲁ:Z

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_0
    check-cast v1, Lyyds/ᛷᛴᛶᲀ;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1}, Lyyds/ᛷᛴᛶᲀ;->ᛲᲈᲁ()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iget-object p0, p0, Landroidx/activity/ᛲᲈᲁ;->ᛲᲈᲁ:Lyyds/ᛲᛳᛵᛱ;

    .line 39
    .line 40
    invoke-virtual {p0}, Lyyds/ᛲᛳᛵᛱ;->run()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Landroidx/activity/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛱᲁᛳᛵ;

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    invoke-virtual {v2}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    :cond_0
    move v2, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v2}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lyyds/ᛷᛴᛶᲀ;

    .line 30
    .line 31
    iget-boolean v3, v3, Lyyds/ᛷᛴᛶᲀ;->ᛲᲈᲁ:Z

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    move v2, v0

    .line 36
    :goto_0
    iget-object v3, p0, Landroidx/activity/ᛲᲈᲁ;->ᛲᛴᛳᛲ:Landroid/window/OnBackInvokedDispatcher;

    .line 37
    .line 38
    iget-object v4, p0, Landroidx/activity/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Landroid/window/OnBackInvokedCallback;

    .line 39
    .line 40
    if-eqz v3, :cond_4

    .line 41
    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    sget-object v5, Lyyds/ᛵᲁᲁᛷ;->ᛲᲈᲁ:Lyyds/ᛵᲁᲁᛷ;

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    iget-boolean v6, p0, Landroidx/activity/ᛲᲈᲁ;->ᲇᲇᲇᛱ:Z

    .line 49
    .line 50
    if-nez v6, :cond_3

    .line 51
    .line 52
    invoke-virtual {v5, v3, v1, v4}, Lyyds/ᛵᲁᲁᛷ;->ᛵᛸᛸᛷ(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-boolean v0, p0, Landroidx/activity/ᛲᲈᲁ;->ᲇᲇᲇᛱ:Z

    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    if-nez v2, :cond_4

    .line 59
    .line 60
    iget-boolean v0, p0, Landroidx/activity/ᛲᲈᲁ;->ᲇᲇᲇᛱ:Z

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    invoke-virtual {v5, v3, v4}, Lyyds/ᛵᲁᲁᛷ;->ᲀᛲᛳᲀ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-boolean v1, p0, Landroidx/activity/ᛲᲈᲁ;->ᲇᲇᲇᛱ:Z

    .line 68
    .line 69
    :cond_4
    return-void
.end method
