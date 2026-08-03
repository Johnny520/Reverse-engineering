.class public final Lrb/b;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lrb/c;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "zombie_check"

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
    const-string v0, "\u6279\u91cf\u6838\u9a8c\u597d\u53cb\u5173\u7cfb\u5e76\u8bb0\u5f55\u5f02\u5e38\u8054\u7cfb\u4eba"

    .line 7
    .line 8
    const-string v1, "enhance"

    .line 9
    .line 10
    const-string v2, "zombie_check"

    .line 11
    .line 12
    const-string v3, "\u50f5\u5c38\u7c89\u68c0\u6d4b"

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
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v9, Lrb/k;

    .line 5
    .line 6
    iget-object v10, p1, Lr8/g;->a:Landroid/content/Context;

    .line 7
    .line 8
    new-instance v0, Lia/t;

    .line 9
    .line 10
    const-class v11, Lrb/b;

    .line 11
    .line 12
    invoke-static {v11}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const/4 v7, 0x0

    .line 17
    const/16 v8, 0x16

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    const-string v4, "logRuntimeError"

    .line 21
    .line 22
    const-string v5, "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    move-object v2, p0

    .line 26
    invoke-direct/range {v0 .. v8}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v9, v10, v0}, Lrb/k;-><init>(Landroid/content/Context;Lia/t;)V

    .line 30
    .line 31
    .line 32
    new-instance v10, Lrb/c;

    .line 33
    .line 34
    new-instance v0, Lia/t;

    .line 35
    .line 36
    invoke-static {v11}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const/16 v8, 0x15

    .line 41
    .line 42
    const-string v4, "logRuntimeError"

    .line 43
    .line 44
    const-string v5, "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 45
    .line 46
    invoke-direct/range {v0 .. v8}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v10, p1, v9, v0}, Lrb/c;-><init>(Lr8/g;Lrb/k;Lia/t;)V

    .line 50
    .line 51
    .line 52
    iput-object v10, v9, Lrb/k;->k:Lrb/c;

    .line 53
    .line 54
    iput-object v10, p0, Lrb/b;->e:Lrb/c;

    .line 55
    .line 56
    sput-object v9, Lfb/v0;->a:Lrb/k;

    .line 57
    .line 58
    new-instance v0, Li/e0;

    .line 59
    .line 60
    const/16 v1, 0x10

    .line 61
    .line 62
    invoke-direct {v0, p0, v1}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    const/16 v1, 0xc

    .line 66
    .line 67
    const-string v3, "zombie_check"

    .line 68
    .line 69
    const-string v4, "\u50f5\u5c38\u7c89\u68c0\u6d4b"

    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    invoke-static {v1, v0, v3, v4, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Lq9/a;

    .line 76
    .line 77
    const/4 v1, 0x3

    .line 78
    invoke-direct {v0, p0, v1}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    const-class v1, Lf8/e;

    .line 82
    .line 83
    invoke-virtual {p0, v1, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u50f5\u5c38\u7c89\u68c0\u6d4b"

    .line 2
    .line 3
    return-object v0
.end method
