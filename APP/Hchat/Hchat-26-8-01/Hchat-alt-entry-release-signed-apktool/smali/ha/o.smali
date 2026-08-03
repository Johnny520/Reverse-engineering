.class public final Lha/o;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lha/s;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "moments_bottom_detail"

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
    const-string v0, "\u81ea\u5b9a\u4e49\u670b\u53cb\u5708\u5e95\u90e8\u65f6\u95f4\u548c\u8be6\u60c5\u683c\u5f0f"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "moments_bottom_detail"

    .line 11
    .line 12
    const-string v3, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5"

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
    new-instance v0, Lha/s;

    .line 5
    .line 6
    new-instance v1, Lab/b;

    .line 7
    .line 8
    const-class v2, Lha/o;

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
    const/16 v9, 0x13

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
    invoke-direct {v0, p1, v1}, Lha/s;-><init>(Lr8/g;Lab/b;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v3, Lha/o;->e:Lha/s;

    .line 31
    .line 32
    invoke-virtual {p0}, Lha/o;->k()V

    .line 33
    .line 34
    .line 35
    new-instance p1, Lke/h;

    .line 36
    .line 37
    const/16 v0, 0xb

    .line 38
    .line 39
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    const-class v0, Lf8/e;

    .line 43
    .line 44
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final k()V
    .locals 5

    .line 1
    sget-object v0, Lr8/e;->a:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, Lha/n;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, Lha/n;-><init>(Lha/o;I)V

    .line 7
    .line 8
    .line 9
    const/16 v1, -0xa

    .line 10
    .line 11
    const-string v2, "moments_bottom_detail:time"

    .line 12
    .line 13
    const-string v3, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5\u65f6\u95f4"

    .line 14
    .line 15
    sget-object v4, Lr8/c;->i:Lr8/c;

    .line 16
    .line 17
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->e(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lha/n;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p0, v1}, Lha/n;-><init>(Lha/o;I)V

    .line 24
    .line 25
    .line 26
    const/16 v1, 0x8

    .line 27
    .line 28
    const-string v2, "moments_bottom_detail:group"

    .line 29
    .line 30
    const-string v3, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5\u53ef\u89c1\u8303\u56f4"

    .line 31
    .line 32
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lha/n;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-direct {v0, p0, v1}, Lha/n;-><init>(Lha/o;I)V

    .line 39
    .line 40
    .line 41
    const/16 v1, -0x9

    .line 42
    .line 43
    const-string v2, "moments_bottom_detail:profile"

    .line 44
    .line 45
    const-string v3, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5\u4e2a\u4eba\u4e3b\u9875"

    .line 46
    .line 47
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->e(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5"

    .line 2
    .line 3
    return-object v0
.end method
