.class public final Lhb/u;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lhb/i0;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "selected_messages"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lr8/g;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lha/k0;

    .line 5
    .line 6
    const-string v0, "\u4ece\u591a\u9009\u6d88\u606f\u83dc\u5355\u7fa4\u53d1\u6216\u5b9a\u65f6\u8f6c\u53d1\u804a\u5929\u8bb0\u5f55"

    .line 7
    .line 8
    const-string v1, "enhance"

    .line 9
    .line 10
    const-string v2, "selected_messages"

    .line 11
    .line 12
    const-string v3, "\u7fa4\u53d1\u52a9\u624b"

    .line 13
    .line 14
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final g(Lr8/g;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lhb/i0;

    .line 5
    .line 6
    new-instance v1, Lab/b;

    .line 7
    .line 8
    const-class v2, Lhb/u;

    .line 9
    .line 10
    invoke-static {v2}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const/4 v8, 0x0

    .line 15
    const/16 v9, 0x17

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const-string v5, "logFeatureError"

    .line 19
    .line 20
    const-string v6, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v3, p0

    .line 24
    invoke-direct/range {v1 .. v9}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p1, v1}, Lhb/i0;-><init>(Lr8/g;Lab/b;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v0, Lhb/i0;->h:Lhb/c;

    .line 31
    .line 32
    iget-object v1, v0, Lhb/i0;->g:Lhb/r;

    .line 33
    .line 34
    iget-object v2, v0, Lhb/i0;->i:Lhb/k;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v4, Lhb/k0;

    .line 46
    .line 47
    invoke-direct {v4, p1, v1, v2}, Lhb/k0;-><init>(Lhb/c;Lhb/r;Lhb/k;)V

    .line 48
    .line 49
    .line 50
    sput-object v4, La/a;->g:Lhb/k0;

    .line 51
    .line 52
    sget-object p1, Lhb/m;->a:Lhb/l;

    .line 53
    .line 54
    sget-object p1, Lhb/m;->a:Lhb/l;

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    invoke-virtual {p1}, Lhb/l;->a()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-ne p1, v1, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    sget-object p1, Lhb/m;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-virtual {p1, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    new-instance p1, Ljava/lang/Thread;

    .line 77
    .line 78
    new-instance v2, Lh/Hchat/crash/e;

    .line 79
    .line 80
    invoke-direct {v2, v1}, Lh/Hchat/crash/e;-><init>(I)V

    .line 81
    .line 82
    .line 83
    const-string v1, "Hchat-SelectedMessageContactsWarmup"

    .line 84
    .line 85
    invoke-direct {p1, v2, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 89
    .line 90
    .line 91
    :goto_0
    iput-object v0, v3, Lhb/u;->e:Lhb/i0;

    .line 92
    .line 93
    new-instance p1, Lab/a;

    .line 94
    .line 95
    const/16 v0, 0x1d

    .line 96
    .line 97
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 98
    .line 99
    .line 100
    const/16 v0, 0xc

    .line 101
    .line 102
    const-string v1, "selected_messages"

    .line 103
    .line 104
    const-string v2, "\u7fa4\u53d1\u52a9\u624b"

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 108
    .line 109
    .line 110
    new-instance p1, Lke/h;

    .line 111
    .line 112
    const/16 v0, 0xf

    .line 113
    .line 114
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 115
    .line 116
    .line 117
    const-class v0, Lf8/e;

    .line 118
    .line 119
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u7fa4\u53d1\u52a9\u624b"

    .line 2
    .line 3
    return-object v0
.end method
