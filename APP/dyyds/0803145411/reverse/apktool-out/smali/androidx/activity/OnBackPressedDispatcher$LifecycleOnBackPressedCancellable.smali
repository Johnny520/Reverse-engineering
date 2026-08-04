.class final Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛸᛸᛶ;
.implements Lyyds/ᛱᛴᛷ;


# instance fields
.field public ᛲᛴᛳᛲ:Lyyds/ᲀᛷᛵᲁ;

.field public final ᲀᛲᛳᲀ:Landroidx/lifecycle/ᛲᲈᲁ;

.field public final synthetic ᲇᲇᲇᛱ:Landroidx/activity/ᛲᲈᲁ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᲈᲀᲀᛶ;


# direct methods
.method public constructor <init>(Landroidx/activity/ᛲᲈᲁ;Landroidx/lifecycle/ᛲᲈᲁ;Lyyds/ᲈᲀᲀᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᲇᲇᲇᛱ:Landroidx/activity/ᛲᲈᲁ;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᲀᛲᛳᲀ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᲇᲈᛵᛷ:Lyyds/ᲈᲀᲀᛶ;

    .line 9
    .line 10
    invoke-virtual {p2, p0}, Landroidx/lifecycle/ᛲᲈᲁ;->ᛲᲈᲁ(Lyyds/ᛳᛶᲁᛴ;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᲀᛲᛳᲀ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/ᛲᲈᲁ;->ᲇᲇᲇᛱ(Lyyds/ᛳᛶᲁᛴ;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᲇᲈᛵᛷ:Lyyds/ᲈᲀᲀᛶ;

    .line 7
    .line 8
    iget-object v0, v0, Lyyds/ᛷᛴᛶᲀ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᛲᛴᛳᛲ:Lyyds/ᲀᛷᛵᲁ;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lyyds/ᲀᛷᛵᲁ;->cancel()V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᛲᛴᛳᛲ:Lyyds/ᲀᛷᛵᲁ;

    .line 22
    .line 23
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᲁᲇᛴᲀ;Lyyds/ᛳᛷᛵᛷ;)V
    .locals 3

    .line 1
    sget-object p1, Lyyds/ᛳᛷᛵᛷ;->ON_START:Lyyds/ᛳᛷᛵᛷ;

    .line 2
    .line 3
    if-ne p2, p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᲇᲇᲇᛱ:Landroidx/activity/ᛲᲈᲁ;

    .line 6
    .line 7
    iget-object p2, p1, Landroidx/activity/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛱᲁᛳᛵ;

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᲇᲈᛵᛷ:Lyyds/ᲈᲀᲀᛶ;

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Lyyds/ᛱᲁᛳᛵ;->addLast(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance p2, Lyyds/ᲀᛷᛵᲁ;

    .line 15
    .line 16
    invoke-direct {p2, p1, v0}, Lyyds/ᲀᛷᛵᲁ;-><init>(Landroidx/activity/ᛲᲈᲁ;Lyyds/ᲈᲀᲀᛶ;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lyyds/ᛷᛴᛶᲀ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v2, 0x21

    .line 27
    .line 28
    if-lt v1, v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/activity/ᛲᲈᲁ;->ᲀᛲᛳᲀ()V

    .line 31
    .line 32
    .line 33
    iget-object p1, p1, Landroidx/activity/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛵᲀᛵ;

    .line 34
    .line 35
    iput-object p1, v0, Lyyds/ᛷᛴᛶᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛵᲀᛵ;

    .line 36
    .line 37
    :cond_0
    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᛲᛴᛳᛲ:Lyyds/ᲀᛷᛵᲁ;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    sget-object p1, Lyyds/ᛳᛷᛵᛷ;->ON_STOP:Lyyds/ᛳᛷᛵᛷ;

    .line 41
    .line 42
    if-ne p2, p1, :cond_2

    .line 43
    .line 44
    iget-object p0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᛲᛴᛳᛲ:Lyyds/ᲀᛷᛵᲁ;

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, Lyyds/ᲀᛷᛵᲁ;->cancel()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    sget-object p1, Lyyds/ᛳᛷᛵᛷ;->ON_DESTROY:Lyyds/ᛳᛷᛵᛷ;

    .line 53
    .line 54
    if-ne p2, p1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->cancel()V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method
