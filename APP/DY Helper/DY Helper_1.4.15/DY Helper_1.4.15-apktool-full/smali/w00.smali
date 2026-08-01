.class public final Lw00;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:Z

.field public final synthetic β:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Z)V
    .locals 0

    .line 1
    iput-boolean p2, p0, Lw00;->α:Z

    .line 2
    .line 3
    iput-object p1, p0, Lw00;->β:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-direct {p0}, Lm01;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 5
    .line 6
    iget-boolean v0, p0, Lw00;->α:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    :try_start_0
    sget-object v1, Lx00;->α:Lx00;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lx00;->ζ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    iget-object p0, p0, Lw00;->β:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_4

    .line 29
    .line 30
    invoke-static {p1}, Lx00;->η(Ljava/lang/Object;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget-object v2, Lpq;->α:Lpq;

    .line 35
    .line 36
    const-string v3, "feed_selected"

    .line 37
    .line 38
    invoke-virtual {v2, v3, p1, v1, p0}, Lpq;->γ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    sget-object p0, Lpq;->α:Lpq;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    :goto_0
    sget-object p0, Lpq;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Llq;

    .line 56
    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    iget-object v2, v1, Llq;->β:Ljava/lang/ref/WeakReference;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eq v2, p1, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    const/4 v2, 0x0

    .line 70
    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_5

    .line 75
    .line 76
    sget-object p0, Lpq;->κ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :catchall_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, La80;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    :try_start_1
    invoke-interface {p1, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    :goto_2
    return-void

    .line 99
    :cond_5
    :try_start_2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 103
    if-eq v2, v1, :cond_3

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :goto_3
    if-eqz v0, :cond_6

    .line 107
    .line 108
    const-string p1, "selected"

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_6
    const-string p1, "unselected"

    .line 112
    .line 113
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const-string v0, "rc7413b448c1a43a1"

    .line 118
    .line 119
    invoke-static {v0, p1, p0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method
