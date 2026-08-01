.class public final Lq9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lq9;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget p0, p0, Lq9;->α:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget p0, p0, Lq9;->α:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p0, Lu72;->ι:Landroid/app/Activity;

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    sget-object p0, Lu72;->α:Ljava/util/List;

    .line 15
    .line 16
    sput-object v0, Lu72;->ι:Landroid/app/Activity;

    .line 17
    .line 18
    :cond_0
    :pswitch_0
    return-void

    .line 19
    :pswitch_1
    sget-object p0, Lr9;->ζ:Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Landroid/app/Activity;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p0, v0

    .line 31
    :goto_0
    if-ne p0, p1, :cond_2

    .line 32
    .line 33
    sget-object p0, Lr9;->α:Landroid/os/Handler;

    .line 34
    .line 35
    sput-object v0, Lr9;->ζ:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    :cond_2
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget p0, p0, Lq9;->α:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p0, Lu72;->ι:Landroid/app/Activity;

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    sget-object p0, Lu72;->α:Ljava/util/List;

    .line 15
    .line 16
    sput-object v0, Lu72;->ι:Landroid/app/Activity;

    .line 17
    .line 18
    :cond_0
    :pswitch_0
    return-void

    .line 19
    :pswitch_1
    sget-object p0, Lr9;->ζ:Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Landroid/app/Activity;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p0, v0

    .line 31
    :goto_0
    if-ne p0, p1, :cond_2

    .line 32
    .line 33
    sget-object p0, Lr9;->α:Landroid/os/Handler;

    .line 34
    .line 35
    sput-object v0, Lr9;->ζ:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    :cond_2
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 5

    .line 1
    iget p0, p0, Lq9;->α:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object p0, Lu72;->α:Ljava/util/List;

    .line 10
    .line 11
    sput-object p1, Lu72;->ι:Landroid/app/Activity;

    .line 12
    .line 13
    invoke-static {p1}, Lu72;->η(Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    sget-object p0, Lcom/example/dyhelper/beta/BlacklistVerifier;->α:Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 18
    .line 19
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sput-object p0, Lcom/example/dyhelper/beta/BlacklistVerifier;->λ:Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    sget-object p0, Lcom/example/dyhelper/beta/BlacklistVerifier;->α:Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->ζ()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    sget-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->κ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    const-string v0, "\u672a\u77e5"

    .line 43
    .line 44
    :cond_0
    invoke-virtual {p0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->δ()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    const-string v1, "\u8fdd\u89c4\u4f7f\u7528"

    .line 55
    .line 56
    :cond_1
    sget-object v2, Lda;->β:Landroid/os/Handler;

    .line 57
    .line 58
    new-instance v3, Le9;

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    invoke-direct {v3, p1, v0, v1, v4}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    const-string p1, "activity-resumed"

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/beta/BlacklistVerifier;->α(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    new-instance p0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string p1, "blacklist enforced on activity resume uid="

    .line 75
    .line 76
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p1, " reason="

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const/4 p1, 0x4

    .line 95
    const-string v0, "rc2b948eb05c3593c"

    .line 96
    .line 97
    const/4 v1, 0x0

    .line 98
    invoke-static {v0, p0, v1, p1, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void

    .line 102
    :pswitch_1
    sget-object p0, Lr9;->α:Landroid/os/Handler;

    .line 103
    .line 104
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 105
    .line 106
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sput-object p0, Lr9;->ζ:Ljava/lang/ref/WeakReference;

    .line 110
    .line 111
    sget-object p0, Lr9;->α:Landroid/os/Handler;

    .line 112
    .line 113
    invoke-static {p1}, Lr9;->ε(Landroid/app/Activity;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget p0, p0, Lq9;->α:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget p0, p0, Lq9;->α:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget p0, p0, Lq9;->α:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method
