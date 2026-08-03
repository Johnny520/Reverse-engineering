.class public final Ll9/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Ll9/d;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "remove_forward_limit"

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
    const-string v0, "\u5141\u8bb8\u5fae\u4fe1\u539f\u751f\u8f6c\u53d1\u9009\u62e9\u8d85\u8fc7 9 \u4e2a\u4f1a\u8bdd"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "remove_forward_limit"

    .line 11
    .line 12
    const-string v3, "\u79fb\u9664\u8f6c\u53d1\u9650\u5236"

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
    new-instance v1, Ll9/d;

    .line 5
    .line 6
    new-instance v2, Lia/t;

    .line 7
    .line 8
    const-class v0, Ll9/a;

    .line 9
    .line 10
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    const-string v6, "logRuntimeError"

    .line 15
    .line 16
    const-string v7, "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/16 v10, 0x9

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
    invoke-direct {v1, p1, v2}, Ll9/d;-><init>(Lr8/g;Lia/t;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v4, Ll9/a;->e:Ll9/d;

    .line 31
    .line 32
    monitor-enter v1

    .line 33
    :try_start_0
    iget-boolean p1, v1, Ll9/d;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    monitor-exit v1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ll9/d;->e()Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ll9/d;->b(Ljava/lang/reflect/Method;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    .line 48
    monitor-exit v1

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    move-object p1, v0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    monitor-exit v1

    .line 54
    :goto_0
    const-string p1, "remove_forward_limit"

    .line 55
    .line 56
    const-string v0, "\u79fb\u9664\u8f6c\u53d1\u9650\u5236"

    .line 57
    .line 58
    new-instance v1, Li/e0;

    .line 59
    .line 60
    const/4 v2, 0x6

    .line 61
    invoke-direct {v1, p0, v2}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    const/16 v2, 0xc

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-static {v2, v1, p1, v0, v3}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 72
    throw p1
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u79fb\u9664\u8f6c\u53d1\u9650\u5236"

    .line 2
    .line 3
    return-object v0
.end method
