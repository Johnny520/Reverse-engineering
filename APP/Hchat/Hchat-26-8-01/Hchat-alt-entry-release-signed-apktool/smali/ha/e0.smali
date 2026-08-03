.class public final Lha/e0;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lea/c;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "moments_upload_tail"

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
    const-string v0, "\u7ed9\u53d1\u5e03\u7684\u670b\u53cb\u5708\u9644\u5e26 SDK ID \u548c SDK \u540d\u79f0"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "moments_upload_tail"

    .line 11
    .line 12
    const-string v3, "\u670b\u53cb\u5708\u4e0a\u4f20\u5c3e\u5df4"

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
    new-instance v0, Lea/c;

    .line 5
    .line 6
    new-instance v1, Lab/b;

    .line 7
    .line 8
    const-class v2, Lha/e0;

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
    const/16 v9, 0x16

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const-string v5, "logError"

    .line 19
    .line 20
    const-string v6, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

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
    const/4 v2, 0x0

    .line 28
    invoke-direct {v0, p1, v1, v2}, Lea/c;-><init>(Lr8/g;Lab/b;B)V

    .line 29
    .line 30
    .line 31
    iput-object v0, v3, Lha/e0;->e:Lea/c;

    .line 32
    .line 33
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 34
    .line 35
    new-instance p1, Lab/a;

    .line 36
    .line 37
    const/16 v0, 0x1b

    .line 38
    .line 39
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    const/16 v0, 0x8

    .line 43
    .line 44
    const-string v1, "moments_upload_tail"

    .line 45
    .line 46
    const-string v2, "\u670b\u53cb\u5708\u4e0a\u4f20\u5c3e\u5df4"

    .line 47
    .line 48
    sget-object v4, Lr8/c;->j:Lr8/c;

    .line 49
    .line 50
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 51
    .line 52
    .line 53
    new-instance p1, Lke/h;

    .line 54
    .line 55
    const/16 v0, 0xd

    .line 56
    .line 57
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    const-class v0, Lf8/e;

    .line 61
    .line 62
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u670b\u53cb\u5708\u4e0a\u4f20\u5c3e\u5df4"

    .line 2
    .line 3
    return-object v0
.end method
