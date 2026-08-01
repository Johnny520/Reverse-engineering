.class public final synthetic Lxe0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxe0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lxe0;->ζ:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lxe0;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lxe0;->ζ:Landroid/content/Context;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lx9;->ο(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sget-wide v2, Lx9;->δ:J

    .line 16
    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long p0, v2, v4

    .line 20
    .line 21
    if-lez p0, :cond_0

    .line 22
    .line 23
    sget-wide v2, Lx9;->δ:J

    .line 24
    .line 25
    sub-long v2, v0, v2

    .line 26
    .line 27
    const-wide/32 v4, 0x1b7740

    .line 28
    .line 29
    .line 30
    cmp-long p0, v2, v4

    .line 31
    .line 32
    if-gez p0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object p0, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-virtual {p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    sput-wide v0, Lx9;->δ:J

    .line 47
    .line 48
    sget-object p0, Lx9;->ε:Landroid/content/Context;

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    sget-object v0, Lr9;->α:Landroid/os/Handler;

    .line 53
    .line 54
    invoke-static {p0}, Lr9;->α(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    new-instance p0, Ljava/lang/Thread;

    .line 58
    .line 59
    new-instance v0, Ls0;

    .line 60
    .line 61
    invoke-direct {v0, v3}, Ls0;-><init>(I)V

    .line 62
    .line 63
    .line 64
    const-string v1, "DY-Beta-Notice"

    .line 65
    .line 66
    invoke-direct {p0, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 70
    .line 71
    .line 72
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->init(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->init(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
