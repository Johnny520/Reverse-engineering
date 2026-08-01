.class final Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
.super Ljava/lang/Object;

# interfaces
.implements Lmq;
.implements Lh8;


# instance fields
.field public final a:Landroidx/lifecycle/a;

.field public final b:Lsl;

.field public c:Lww;

.field public final synthetic d:Landroidx/activity/a;


# direct methods
.method public constructor <init>(Landroidx/activity/a;Landroidx/lifecycle/a;Lsl;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onBackPressedCallback"

    .line 5
    .line 6
    invoke-static {v0, p3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->d:Landroidx/activity/a;

    .line 10
    .line 11
    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->a:Landroidx/lifecycle/a;

    .line 12
    .line 13
    iput-object p3, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->b:Lsl;

    .line 14
    .line 15
    invoke-virtual {p2, p0}, Landroidx/lifecycle/a;->a(Lnq;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final b(Loq;Liq;)V
    .locals 3

    .line 1
    sget-object p1, Liq;->ON_START:Liq;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->d:Landroidx/activity/a;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string p2, "onBackPressedCallback"

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->b:Lsl;

    .line 13
    .line 14
    invoke-static {p2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p1, Landroidx/activity/a;->b:Lk6;

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Lk6;->addLast(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance p2, Lww;

    .line 23
    .line 24
    invoke-direct {p2, p1, v0}, Lww;-><init>(Landroidx/activity/a;Lsl;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, Lsl;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {v1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/activity/a;->d()V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lxw;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v1, v2, p1}, Lxw;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, v0, Lsl;->c:Lxw;

    .line 42
    .line 43
    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Lww;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    sget-object p1, Liq;->ON_STOP:Liq;

    .line 47
    .line 48
    if-ne p2, p1, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Lww;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1}, Lww;->cancel()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    sget-object p1, Liq;->ON_DESTROY:Liq;

    .line 59
    .line 60
    if-ne p2, p1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->cancel()V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->a:Landroidx/lifecycle/a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/a;->f(Lnq;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->b:Lsl;

    .line 7
    .line 8
    iget-object v0, v0, Lsl;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Lww;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lww;->cancel()V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->c:Lww;

    .line 22
    .line 23
    return-void
.end method
