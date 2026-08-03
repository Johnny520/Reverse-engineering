.class public final Ldb/b;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "scheduled_task"

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
    const-string v0, "\u6309\u8ba1\u5212\u65f6\u95f4\u53d1\u9001\u804a\u5929\u6d88\u606f\u6216\u53d1\u5e03\u670b\u53cb\u5708"

    .line 7
    .line 8
    const-string v1, "enhance"

    .line 9
    .line 10
    const-string v2, "scheduled_task"

    .line 11
    .line 12
    const-string v3, "\u5b9a\u65f6\u4efb\u52a1"

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
    new-instance v0, Lcb/f;

    .line 5
    .line 6
    new-instance v1, Lab/b;

    .line 7
    .line 8
    const-class v2, Ldb/b;

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
    const/16 v9, 0x9

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
    invoke-direct {v0, p1, v1}, Lcb/f;-><init>(Lr8/g;Lab/b;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lbe/h;->a:Lcb/f;

    .line 31
    .line 32
    iget-boolean p1, v0, Lcb/f;->c:Z

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/4 p1, 0x1

    .line 38
    iput-boolean p1, v0, Lcb/f;->c:Z

    .line 39
    .line 40
    invoke-virtual {v0}, Lcb/f;->r()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u5b9a\u65f6\u4efb\u52a1"

    .line 2
    .line 3
    return-object v0
.end method
