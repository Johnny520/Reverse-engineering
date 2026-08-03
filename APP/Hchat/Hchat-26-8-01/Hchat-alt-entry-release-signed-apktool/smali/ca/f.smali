.class public final Lca/f;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lca/e0;

.field public f:Lca/f0;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "message_forward"

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
    const-string v0, "\u4ece\u6d88\u606f\u3001\u6536\u85cf\u548c\u670b\u53cb\u5708\u83dc\u5355\u4f7f\u7528\u8f6c\u53d1\u529f\u80fd"

    .line 7
    .line 8
    const-string v1, "enhance"

    .line 9
    .line 10
    const-string v2, "message_forward"

    .line 11
    .line 12
    const-string v3, "\u8f6c\u53d1"

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
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v9, Lp8/o;

    .line 5
    .line 6
    new-instance v0, Lab/b;

    .line 7
    .line 8
    const-class v10, Lca/f;

    .line 9
    .line 10
    invoke-static {v10}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x7

    .line 16
    const/4 v1, 0x2

    .line 17
    const-string v4, "logFeatureError"

    .line 18
    .line 19
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    move-object v2, p0

    .line 23
    invoke-direct/range {v0 .. v8}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v9, p1, v0}, Lp8/o;-><init>(Lr8/g;Lfg/p;)V

    .line 27
    .line 28
    .line 29
    new-instance v11, Lca/e0;

    .line 30
    .line 31
    new-instance v0, Lab/b;

    .line 32
    .line 33
    invoke-static {v10}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const/4 v8, 0x5

    .line 38
    const-string v4, "logFeatureError"

    .line 39
    .line 40
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 41
    .line 42
    invoke-direct/range {v0 .. v8}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v11, p1, v9, v0}, Lca/e0;-><init>(Lr8/g;Lp8/o;Lab/b;)V

    .line 46
    .line 47
    .line 48
    iput-object v11, p0, Lca/f;->e:Lca/e0;

    .line 49
    .line 50
    new-instance v11, Lca/f0;

    .line 51
    .line 52
    new-instance v12, Lb0/t;

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    invoke-direct {v12, p0, v0}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lab/b;

    .line 59
    .line 60
    invoke-static {v10}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const/4 v8, 0x6

    .line 65
    const-string v4, "logFeatureError"

    .line 66
    .line 67
    const-string v5, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 68
    .line 69
    invoke-direct/range {v0 .. v8}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v11, p1, v9, v12, v0}, Lca/f0;-><init>(Lr8/g;Lp8/o;Lb0/t;Lab/b;)V

    .line 73
    .line 74
    .line 75
    iput-object v11, p0, Lca/f;->f:Lca/f0;

    .line 76
    .line 77
    invoke-virtual {p0}, Lca/f;->k()V

    .line 78
    .line 79
    .line 80
    new-instance v0, Lke/h;

    .line 81
    .line 82
    const/4 v1, 0x5

    .line 83
    invoke-direct {v0, p0, v1}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    const-class v1, Lf8/e;

    .line 87
    .line 88
    invoke-virtual {p0, v1, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final k()V
    .locals 5

    .line 1
    new-instance v0, Lca/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lca/e;-><init>(Lca/f;I)V

    .line 5
    .line 6
    .line 7
    const/16 v1, 0xc

    .line 8
    .line 9
    const-string v2, "message_forward"

    .line 10
    .line 11
    const-string v3, "\u8f6c\u53d1"

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lca/e;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v0, p0, v2}, Lca/e;-><init>(Lca/f;I)V

    .line 21
    .line 22
    .line 23
    const-string v2, "message_forward_sns"

    .line 24
    .line 25
    const-string v3, "\u670b\u53cb\u5708\u8f6c\u53d1"

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
    const-string v0, "\u8f6c\u53d1"

    .line 2
    .line 3
    return-object v0
.end method
