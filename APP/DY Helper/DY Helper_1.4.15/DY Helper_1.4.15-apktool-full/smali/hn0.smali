.class public final Lhn0;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:J


# virtual methods
.method public final beforeHookedMethod(Lk01;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast v0, Landroid/view/KeyEvent;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/16 v2, 0x19

    .line 26
    .line 27
    const/16 v3, 0x18

    .line 28
    .line 29
    if-eq v0, v3, :cond_1

    .line 30
    .line 31
    if-eq v0, v2, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {}, Lin0;->α()V

    .line 35
    .line 36
    .line 37
    sget-boolean v4, Lin0;->γ:Z

    .line 38
    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iget-object v4, p1, Lk01;->β:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    check-cast v4, Landroid/app/Activity;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    const-string v6, "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"

    .line 58
    .line 59
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-static {v5, v6, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    if-eq v0, v3, :cond_6

    .line 71
    .line 72
    if-eq v0, v2, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    iget-wide v2, p0, Lhn0;->α:J

    .line 80
    .line 81
    sub-long/2addr v0, v2

    .line 82
    const-wide/16 v2, 0x3e8

    .line 83
    .line 84
    cmp-long v0, v0, v2

    .line 85
    .line 86
    if-gez v0, :cond_5

    .line 87
    .line 88
    sget-object v0, Lq71;->α:Lq71;

    .line 89
    .line 90
    new-instance v0, Ln9;

    .line 91
    .line 92
    const/16 v1, 0x17

    .line 93
    .line 94
    invoke-direct {v0, v4, v1}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 98
    .line 99
    .line 100
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    const-wide/16 v0, 0x0

    .line 106
    .line 107
    iput-wide v0, p0, Lhn0;->α:J

    .line 108
    .line 109
    :cond_5
    :goto_0
    return-void

    .line 110
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    iput-wide v0, p0, Lhn0;->α:J

    .line 115
    .line 116
    return-void
.end method
