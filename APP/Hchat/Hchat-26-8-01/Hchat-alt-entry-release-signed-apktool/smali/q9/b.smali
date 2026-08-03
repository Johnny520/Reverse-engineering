.class public final Lq9/b;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "group_rename_monitor"

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
    const-string v0, "\u76d1\u63a7\u7fa4\u6210\u5458\u4fee\u6539\u7fa4\u5185\u6635\u79f0\uff0c\u652f\u6301\u7cfb\u7edf\u6d88\u606f\u3001\u6587\u672c\u548c\u5361\u7247\u63d0\u9192"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "group_rename_monitor"

    .line 11
    .line 12
    const-string v3, "\u6539\u540d\u76d1\u63a7"

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
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lia/t;

    .line 5
    .line 6
    const-class v9, Lq9/b;

    .line 7
    .line 8
    invoke-static {v9}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const/4 v7, 0x0

    .line 13
    const/16 v8, 0x11

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const-string v4, "logError"

    .line 17
    .line 18
    const-string v5, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v2, p0

    .line 22
    invoke-direct/range {v0 .. v8}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 23
    .line 24
    .line 25
    sget-object v1, Lo9/c;->a:Lo9/c;

    .line 26
    .line 27
    invoke-virtual {v1, p1, v0}, Lo9/c;->b(Lr8/g;Lfg/p;)V

    .line 28
    .line 29
    .line 30
    new-instance v10, Lhb/r;

    .line 31
    .line 32
    new-instance v0, Lia/t;

    .line 33
    .line 34
    invoke-static {v9}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const/16 v8, 0x12

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    const-string v4, "logError"

    .line 42
    .line 43
    const-string v5, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 44
    .line 45
    invoke-direct/range {v0 .. v8}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v10, p1, v0}, Lhb/r;-><init>(Lr8/g;Lia/t;)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->d()Lg8/g;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomChanges()Lg8/g;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :goto_0
    if-nez v1, :cond_1

    .line 70
    .line 71
    const-string v1, "\u7fa4\u804a\u53d8\u66f4 API \u672a\u5c31\u7eea"

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-virtual {v0, v1, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    new-instance v0, Lna/f;

    .line 79
    .line 80
    const/4 v3, 0x2

    .line 81
    invoke-direct {v0, v10, v3}, Lna/f;-><init>(Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0}, Lg8/g;->a(Lg8/f;)La2/a;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p0, v0}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v10}, Lhb/r;->p()V

    .line 92
    .line 93
    .line 94
    :goto_1
    new-instance v0, Lq9/a;

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-direct {v0, v10, v1}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 98
    .line 99
    .line 100
    const-class v1, Lf8/e;

    .line 101
    .line 102
    invoke-virtual {p0, v1, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u6539\u540d\u76d1\u63a7"

    .line 2
    .line 3
    return-object v0
.end method
