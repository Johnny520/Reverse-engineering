.class public final Lpl;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Lql;


# direct methods
.method public synthetic constructor <init>(Lql;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpl;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lpl;->β:Lql;

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
    .locals 2

    .line 1
    iget v0, p0, Lpl;->α:I

    .line 2
    .line 3
    iget-object p0, p0, Lpl;->β:Lql;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :try_start_0
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 13
    .line 14
    instance-of v0, p1, Landroid/view/View;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p1, Landroid/view/View;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, v1

    .line 22
    :goto_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-static {p1}, Lql;->Ζ(Landroid/view/View;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    move-object v1, p1

    .line 37
    check-cast v1, Landroid/view/ViewGroup;

    .line 38
    .line 39
    :cond_3
    if-nez v1, :cond_4

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_4
    sget p1, Lcom/example/dyhelper/MainHook;->β:I

    .line 43
    .line 44
    invoke-static {p0, v1}, Lql;->γ(Lql;Landroid/view/ViewGroup;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 53
    .line 54
    :goto_1
    return-void

    .line 55
    :pswitch_0
    :try_start_1
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 56
    .line 57
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    move-object v1, p1

    .line 62
    check-cast v1, Landroid/view/ViewGroup;

    .line 63
    .line 64
    :cond_5
    if-nez v1, :cond_6

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lql;->Κ(Ljava/lang/Class;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0, v1}, Lql;->γ(Lql;Landroid/view/ViewGroup;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :catchall_1
    move-exception p0

    .line 79
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 83
    .line 84
    :goto_2
    return-void

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 1

    .line 1
    iget v0, p0, Lpl;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lpl;->β:Lql;

    .line 14
    .line 15
    :try_start_0
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p0, v0, p1}, Lql;->α(Lql;Ljava/lang/Object;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 28
    .line 29
    :goto_0
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
