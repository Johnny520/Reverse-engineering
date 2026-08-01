.class Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q;
.implements Landroidx/activity/a;


# instance fields
.field public final a:Landroidx/lifecycle/u;

.field public final b:Landroidx/fragment/app/u;

.field public c:Landroidx/activity/h;

.field public final synthetic d:Landroidx/activity/i;


# direct methods
.method public constructor <init>(Landroidx/activity/i;Landroidx/lifecycle/u;Landroidx/fragment/app/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->d:Landroidx/activity/i;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->a:Landroidx/lifecycle/u;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->b:Landroidx/fragment/app/u;

    .line 9
    .line 10
    invoke-virtual {p2, p0}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V
    .locals 1

    .line 1
    sget-object p1, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->d:Landroidx/activity/i;

    .line 6
    .line 7
    iget-object p2, p1, Landroidx/activity/i;->b:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->b:Landroidx/fragment/app/u;

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    new-instance p2, Landroidx/activity/h;

    .line 15
    .line 16
    invoke-direct {p2, p1, v0}, Landroidx/activity/h;-><init>(Landroidx/activity/i;Landroidx/fragment/app/u;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, v0, Landroidx/fragment/app/u;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Landroidx/activity/h;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object p1, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 28
    .line 29
    if-ne p2, p1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Landroidx/activity/h;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/activity/h;->cancel()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    sget-object p1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 40
    .line 41
    if-ne p2, p1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->cancel()V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->a:Landroidx/lifecycle/u;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/u;->f(Landroidx/lifecycle/r;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->b:Landroidx/fragment/app/u;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/u;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Landroidx/activity/h;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/activity/h;->cancel()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Landroidx/activity/h;

    .line 22
    .line 23
    :cond_0
    return-void
.end method
