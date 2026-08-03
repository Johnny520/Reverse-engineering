.class public final Lxa/c;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lxa/m;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "quick_contact_edit"

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
    const-string v0, "\u957f\u6309\u79c1\u804a\u4f1a\u8bdd\u6216\u597d\u53cb\u670b\u53cb\u5708\u5934\u50cf\u5feb\u901f\u4fee\u6539\u5907\u6ce8\u548c\u6807\u7b7e"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "quick_contact_edit"

    .line 11
    .line 12
    const-string v3, "\u5feb\u6377\u8bbe\u7f6e\u5907\u6ce8\u548c\u6807\u7b7e"

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
    new-instance v1, Lxa/m;

    .line 5
    .line 6
    new-instance v2, Lia/t;

    .line 7
    .line 8
    const-class v0, Lxa/c;

    .line 9
    .line 10
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    const-string v6, "logFeatureError"

    .line 15
    .line 16
    const-string v7, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/16 v10, 0x1c

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    const/4 v8, 0x0

    .line 23
    move-object v4, p0

    .line 24
    invoke-direct/range {v2 .. v10}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, p1, v2}, Lxa/m;-><init>(Lr8/g;Lia/t;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v4, Lxa/c;->e:Lxa/m;

    .line 31
    .line 32
    monitor-enter v1

    .line 33
    :try_start_0
    const-string v0, "com.tencent.mm.plugin.sns.ui.SnsHeader"

    .line 34
    .line 35
    iget-object p1, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 36
    .line 37
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/4 v0, 0x0

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    const-string v2, "setAvatarOnClickListener"

    .line 45
    .line 46
    const-class v3, Landroid/view/View$OnClickListener;

    .line 47
    .line 48
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {p1, v2, v3}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    new-instance v2, Lxa/k;

    .line 59
    .line 60
    const/4 v3, 0x2

    .line 61
    invoke-direct {v2, v1, v3}, Lxa/k;-><init>(Lxa/m;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p1, v2}, Lxa/m;->e(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 65
    .line 66
    .line 67
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    monitor-exit v1

    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    move-object p1, v0

    .line 72
    goto :goto_2

    .line 73
    :cond_0
    monitor-exit v1

    .line 74
    :goto_0
    move p1, v0

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    monitor-exit v1

    .line 77
    goto :goto_0

    .line 78
    :goto_1
    const/4 v1, 0x1

    .line 79
    if-ne p1, v1, :cond_2

    .line 80
    .line 81
    move v0, v1

    .line 82
    :cond_2
    if-nez v0, :cond_3

    .line 83
    .line 84
    const-string p1, "\u597d\u53cb\u670b\u53cb\u5708\u5934\u50cf\u957f\u6309 Hook \u672a\u5b89\u88c5"

    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    invoke-virtual {p0, p1, v0}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {p0}, Lxa/c;->k()V

    .line 91
    .line 92
    .line 93
    const-class p1, Lf8/e;

    .line 94
    .line 95
    new-instance v0, Lq9/a;

    .line 96
    .line 97
    const/16 v1, 0xc

    .line 98
    .line 99
    invoke-direct {v0, p0, v1}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    throw p1
.end method

.method public final k()V
    .locals 5

    .line 1
    new-instance v0, Lxa/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lxa/b;-><init>(Lxa/c;I)V

    .line 5
    .line 6
    .line 7
    const/16 v1, 0xc

    .line 8
    .line 9
    const-string v2, "quick_contact_edit"

    .line 10
    .line 11
    const-string v3, "\u5feb\u6377\u8bbe\u7f6e\u5907\u6ce8\u548c\u6807\u7b7e"

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lxa/b;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v0, p0, v2}, Lxa/b;-><init>(Lxa/c;I)V

    .line 21
    .line 22
    .line 23
    const-string v2, "quick_contact_edit:sns_avatar_menu"

    .line 24
    .line 25
    const-string v3, "\u5feb\u6377\u8bbe\u7f6e\u5907\u6ce8\u548c\u6807\u7b7e\u670b\u53cb\u5708\u5934\u50cf\u83dc\u5355"

    .line 26
    .line 27
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u5feb\u6377\u8bbe\u7f6e\u5907\u6ce8\u548c\u6807\u7b7e"

    .line 2
    .line 3
    return-object v0
.end method
