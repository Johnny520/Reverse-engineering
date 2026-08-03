.class public final Ld9/d;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Ld9/m;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "custom_friend_avatar"

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
    new-instance p1, Laa/g;

    .line 5
    .line 6
    const-string v0, "\u4e3a\u6307\u5b9a\u597d\u53cb\u8bbe\u7f6e\u4ec5\u672c\u5730\u663e\u793a\u7684\u5934\u50cf"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "custom_friend_avatar"

    .line 11
    .line 12
    const-string v3, "\u81ea\u5b9a\u4e49\u597d\u53cb\u5934\u50cf"

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
    new-instance v0, Ld9/m;

    .line 5
    .line 6
    new-instance v1, Lab/b;

    .line 7
    .line 8
    const-class v2, Ld9/d;

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
    const/16 v9, 0x8

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
    invoke-direct {v0, p1, v1}, Ld9/m;-><init>(Lr8/g;Lab/b;)V

    .line 28
    .line 29
    .line 30
    const-class p1, Landroid/app/NotificationManager;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v1, Lb4/b;

    .line 44
    .line 45
    const/16 v2, 0x11

    .line 46
    .line 47
    invoke-direct {v1, v2}, Lb4/b;-><init>(I)V

    .line 48
    .line 49
    .line 50
    new-instance v2, Lng/i;

    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    invoke-direct {v2, p1, v4, v1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lng/h;

    .line 57
    .line 58
    invoke-direct {p1, v2}, Lng/h;-><init>(Lng/i;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-virtual {p1}, Lng/h;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    invoke-virtual {p1}, Lng/h;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ljava/lang/reflect/Method;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v2, Ld9/l;

    .line 77
    .line 78
    const/4 v4, 0x6

    .line 79
    invoke-direct {v2, v0, v4}, Ld9/l;-><init>(Ld9/m;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1, v2}, Ld9/m;->e(Ljava/lang/reflect/Executable;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    iput-object v0, v3, Ld9/d;->e:Ld9/m;

    .line 87
    .line 88
    new-instance p1, Lab/a;

    .line 89
    .line 90
    const/16 v0, 0xc

    .line 91
    .line 92
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 93
    .line 94
    .line 95
    const-string v1, "custom_friend_avatar"

    .line 96
    .line 97
    const-string v2, "\u81ea\u5b9a\u4e49\u597d\u53cb\u5934\u50cf"

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 101
    .line 102
    .line 103
    new-instance p1, Lke/h;

    .line 104
    .line 105
    const/4 v0, 0x7

    .line 106
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 107
    .line 108
    .line 109
    const-class v0, Lf8/e;

    .line 110
    .line 111
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u81ea\u5b9a\u4e49\u597d\u53cb\u5934\u50cf"

    .line 2
    .line 3
    return-object v0
.end method
