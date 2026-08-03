.class public final Ly9/c;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Ly9/e;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "member_title"

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
    new-instance p1, Ls8/d;

    .line 5
    .line 6
    const-string v0, "\u5728\u7fa4\u804a\u6635\u79f0\u5de6\u4fa7\u663e\u793a\u7fa4\u4e3b\u3001\u7ba1\u7406\u5458\u3001\u7fa4\u5458\u6216\u81ea\u5b9a\u4e49\u5934\u8854"

    .line 7
    .line 8
    const-string v1, "entertainment"

    .line 9
    .line 10
    const-string v2, "member_title"

    .line 11
    .line 12
    const-string v3, "\u7fa4\u5458\u5934\u8854"

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
    new-instance v0, Lib/b;

    .line 5
    .line 6
    iget-object v1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v0, v1, v2}, Lib/b;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ly9/e;

    .line 13
    .line 14
    new-instance v2, Ly9/b;

    .line 15
    .line 16
    const-class v3, Ly9/c;

    .line 17
    .line 18
    invoke-static {v3}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v3, 0x2

    .line 25
    const-string v6, "logFeatureError"

    .line 26
    .line 27
    const-string v7, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    move-object v4, p0

    .line 31
    invoke-direct/range {v2 .. v10}, Ly9/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, p1, v0, v2}, Ly9/e;-><init>(Lr8/g;Lib/b;Ly9/b;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, v4, Ly9/c;->e:Ly9/e;

    .line 38
    .line 39
    new-instance p1, Lv0/a;

    .line 40
    .line 41
    const/16 v1, 0xa

    .line 42
    .line 43
    invoke-direct {p1, p0, v1}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    const/16 v1, 0xc

    .line 47
    .line 48
    const-string v2, "member_title"

    .line 49
    .line 50
    const-string v3, "\u7fa4\u5458\u5934\u8854"

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-static {v1, p1, v2, v3, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lq9/a;

    .line 57
    .line 58
    const/16 v1, 0xd

    .line 59
    .line 60
    invoke-direct {p1, p0, v1}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    const-class v1, Lf8/e;

    .line 64
    .line 65
    invoke-virtual {p0, v1, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->d()Lg8/g;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz p1, :cond_0

    .line 80
    .line 81
    new-instance v1, Ly9/a;

    .line 82
    .line 83
    invoke-direct {v1, v0, p0}, Ly9/a;-><init>(Lib/b;Ly9/c;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v1}, Lg8/g;->a(Lg8/f;)La2/a;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0, p1}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_0
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u7fa4\u5458\u5934\u8854"

    .line 2
    .line 3
    return-object v0
.end method
