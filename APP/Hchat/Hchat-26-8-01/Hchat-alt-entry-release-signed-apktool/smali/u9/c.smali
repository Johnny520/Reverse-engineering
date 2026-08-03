.class public final Lu9/c;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final f:Lu9/b;

.field public static final g:Ljava/util/Map;


# instance fields
.field public e:Lu9/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu9/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu9/c;->f:Lu9/b;

    .line 7
    .line 8
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lu9/c;->g:Ljava/util/Map;

    .line 13
    .line 14
    return-void
.end method

.method public static final k(Landroid/content/Context;Ljava/lang/ClassLoader;)V
    .locals 11

    .line 1
    sget-object v2, Lu9/c;->f:Lu9/b;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v9, Lu9/c;->g:Ljava/util/Map;

    .line 7
    .line 8
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    monitor-enter v9

    .line 12
    :try_start_0
    invoke-interface {v9, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lu9/h;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    new-instance v10, Lu9/h;

    .line 22
    .line 23
    new-instance v0, Lia/t;

    .line 24
    .line 25
    const-class v1, Lu9/b;

    .line 26
    .line 27
    invoke-static {v1}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v1}, Lgg/e;->a()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v4, "logFeatureError"

    .line 39
    .line 40
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    const/16 v8, 0x17

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-direct/range {v0 .. v8}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {v10, p0, p1, v1, v0}, Lu9/h;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lc9/f;Lfg/p;)V

    .line 52
    .line 53
    .line 54
    move-object p0, v9

    .line 55
    check-cast p0, Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {p0, p1, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    move-object v0, v10

    .line 61
    :goto_0
    monitor-exit v9

    .line 62
    const/4 p0, 0x0

    .line 63
    invoke-virtual {v0, p0}, Lu9/h;->f(Z)Z

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    move-object p0, v0

    .line 69
    monitor-exit v9

    .line 70
    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "hide_wechat_bottom_bar"

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
    const-string v0, "\u9690\u85cf\u5fae\u4fe1\u9996\u9875\u5e95\u90e8\u7684\u5fae\u4fe1\u3001\u901a\u8baf\u5f55\u3001\u53d1\u73b0\u548c\u6211"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "hide_wechat_bottom_bar"

    .line 11
    .line 12
    const-string v3, "\u9690\u85cf\u5fae\u4fe1\u5e95\u680f"

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
    sget-object v2, Lu9/c;->f:Lu9/b;

    .line 5
    .line 6
    iget-object v0, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    sget-object v9, Lu9/c;->g:Ljava/util/Map;

    .line 9
    .line 10
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    monitor-enter v9

    .line 14
    :try_start_0
    invoke-interface {v9, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lu9/h;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v1, Lc9/f;

    .line 23
    .line 24
    const/16 v2, 0x8

    .line 25
    .line 26
    invoke-direct {v1, p1, v2}, Lc9/f;-><init>(Lr8/g;I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, Lu9/h;->c:Lfg/a;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v10, Lu9/h;

    .line 33
    .line 34
    new-instance v0, Lia/t;

    .line 35
    .line 36
    const-class v1, Lu9/b;

    .line 37
    .line 38
    invoke-static {v1}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Lgg/e;->a()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const-string v4, "logFeatureError"

    .line 50
    .line 51
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    const/16 v8, 0x18

    .line 55
    .line 56
    const/4 v1, 0x2

    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-direct/range {v0 .. v8}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 62
    .line 63
    iget-object v2, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 64
    .line 65
    new-instance v3, Lc9/f;

    .line 66
    .line 67
    const/4 v4, 0x7

    .line 68
    invoke-direct {v3, p1, v4}, Lc9/f;-><init>(Lr8/g;I)V

    .line 69
    .line 70
    .line 71
    invoke-direct {v10, v1, v2, v3, v0}, Lu9/h;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lc9/f;Lfg/p;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    move-object v0, v10

    .line 75
    :goto_0
    monitor-exit v9

    .line 76
    iput-object v0, p0, Lu9/c;->e:Lu9/h;

    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    invoke-virtual {v0, p1}, Lu9/h;->f(Z)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    const/4 v0, 0x1

    .line 84
    if-ne p1, v0, :cond_1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    const-string p1, "hide_wechat_bottom_bar"

    .line 88
    .line 89
    const-string v0, "\u9690\u85cf\u5fae\u4fe1\u5e95\u680f"

    .line 90
    .line 91
    new-instance v1, Li/e0;

    .line 92
    .line 93
    const/16 v2, 0x1d

    .line 94
    .line 95
    invoke-direct {v1, p0, v2}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    const/16 v2, 0xc

    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    invoke-static {v2, v1, p1, v0, v3}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 102
    .line 103
    .line 104
    :goto_1
    const-class p1, Lf8/e;

    .line 105
    .line 106
    new-instance v0, Lq9/a;

    .line 107
    .line 108
    const/16 v1, 0x9

    .line 109
    .line 110
    invoke-direct {v0, p0, v1}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p1, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    move-object p1, v0

    .line 119
    monitor-exit v9

    .line 120
    throw p1
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u9690\u85cf\u5fae\u4fe1\u5e95\u680f"

    .line 2
    .line 3
    return-object v0
.end method
