.class public final Lka/b;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "qq_music_order"

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
    const-string v0, "\u641c\u7d22 QQ \u97f3\u4e50\u5e76\u53d1\u9001\u97f3\u4e50\u5361\u7247\u6216\u6b4c\u66f2\u8bed\u97f3\uff0c\u53ef\u540c\u65f6\u53d1\u9001"

    .line 7
    .line 8
    const-string v1, "entertainment"

    .line 9
    .line 10
    const-string v2, "qq_music_order"

    .line 11
    .line 12
    const-string v3, "QQ\u70b9\u6b4c"

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
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lr8/e;->a:Landroid/os/Handler;

    .line 5
    .line 6
    new-instance v0, Lc9/f;

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    invoke-direct {v0, p1, v1}, Lc9/f;-><init>(Lr8/g;I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    const-string v2, "shared:send_button"

    .line 15
    .line 16
    const-string v3, "\u804a\u5929\u53d1\u9001\u6309\u94ae"

    .line 17
    .line 18
    sget-object v4, Lr8/c;->j:Lr8/c;

    .line 19
    .line 20
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Leb/s;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, p0, p1, v1}, Leb/s;-><init>(Lr8/a;Lr8/g;I)V

    .line 27
    .line 28
    .line 29
    const-class v2, Lf8/e;

    .line 30
    .line 31
    invoke-virtual {p0, v2, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Lka/f;

    .line 35
    .line 36
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 37
    .line 38
    new-instance v3, Lia/t;

    .line 39
    .line 40
    const-class v0, Lka/b;

    .line 41
    .line 42
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    const/4 v10, 0x0

    .line 47
    const/16 v11, 0x8

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    const-string v7, "logError"

    .line 51
    .line 52
    const-string v8, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    move-object v5, p0

    .line 56
    invoke-direct/range {v3 .. v11}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v2, p1, v3}, Lka/f;-><init>(Landroid/content/Context;Lia/t;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->k()Lk8/i;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_1

    .line 74
    .line 75
    :try_start_0
    invoke-virtual {p1}, Lk8/i;->a()V

    .line 76
    .line 77
    .line 78
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    new-instance v3, Lsf/f;

    .line 83
    .line 84
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    move-object v0, v3

    .line 88
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_0

    .line 93
    .line 94
    iget-object v3, v2, Lka/f;->a:Lia/t;

    .line 95
    .line 96
    const-string v4, "QQ\u70b9\u6b4c\u6570\u636e\u5e93\u76d1\u542c\u5b89\u88c5\u5931\u8d25"

    .line 97
    .line 98
    invoke-virtual {v3, v4, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    :cond_0
    new-instance v0, Lk8/m;

    .line 102
    .line 103
    invoke-direct {v0, v2, v1}, Lk8/m;-><init>(Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lk8/i;->e(Lk8/h;)La2/a;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0, p1}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    sget-object p1, Leb/m0;->a:Leb/m0;

    .line 114
    .line 115
    new-instance p1, Lka/e;

    .line 116
    .line 117
    invoke-direct {p1, v2}, Lka/e;-><init>(Lka/f;)V

    .line 118
    .line 119
    .line 120
    const-string v0, "qq_music_order"

    .line 121
    .line 122
    invoke-static {v0, p1}, Leb/m0;->j(Ljava/lang/String;Leb/i0;)La2/a;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p0, p1}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "QQ\u70b9\u6b4c"

    .line 2
    .line 3
    return-object v0
.end method
