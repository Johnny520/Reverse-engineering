.class public final synthetic Lgj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 0

    .line 10
    iput p2, p0, Lgj;->ε:I

    iput-object p1, p0, Lgj;->ζ:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;J)V
    .locals 0

    .line 1
    const/4 p2, 0x4

    .line 2
    iput p2, p0, Lgj;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lgj;->ζ:Landroid/view/ViewGroup;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lgj;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object p0, p0, Lgj;->ζ:Landroid/view/ViewGroup;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, Lht0;->α:Lht0;

    .line 12
    .line 13
    invoke-static {p0}, Lht0;->θ(Landroid/view/ViewGroup;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    sget-object v0, Lql;->α:Lql;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p0}, Lql;->Α(Landroid/view/ViewGroup;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    sget p0, Lcom/example/dyhelper/MainHook;->β:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    new-instance v1, Leo1;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    :goto_0
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 44
    .line 45
    :cond_1
    return-void

    .line 46
    :pswitch_1
    const v0, 0x7e0d0b03

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :try_start_1
    invoke-static {p0, v2}, Lmj;->α(Landroid/view/ViewGroup;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_1
    move-exception p0

    .line 58
    new-instance v1, Leo1;

    .line 59
    .line 60
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v1, "retry apply failed: "

    .line 76
    .line 77
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Lmj;->σ(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void

    .line 91
    :pswitch_2
    :try_start_2
    invoke-static {p0, v2}, Lmj;->α(Landroid/view/ViewGroup;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 92
    .line 93
    .line 94
    :catchall_2
    return-void

    .line 95
    :pswitch_3
    :try_start_3
    invoke-static {p0, v2}, Lmj;->α(Landroid/view/ViewGroup;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 96
    .line 97
    .line 98
    :catchall_3
    return-void

    .line 99
    :pswitch_4
    :try_start_4
    invoke-static {p0, v2}, Lmj;->α(Landroid/view/ViewGroup;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 100
    .line 101
    .line 102
    :catchall_4
    return-void

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
