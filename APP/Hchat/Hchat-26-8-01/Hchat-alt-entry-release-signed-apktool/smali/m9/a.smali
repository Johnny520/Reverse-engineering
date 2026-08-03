.class public final Lm9/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lm9/e;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "game_emoji_result"

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
    const-string v0, "\u56fa\u5b9a\u9ab0\u5b50\u70b9\u6570\u548c\u731c\u62f3\u7ed3\u679c\uff0c\u6216\u5728\u53d1\u9001\u65f6\u9009\u62e9"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "game_emoji_result"

    .line 11
    .line 12
    const-string v3, "\u6307\u5b9a\u9ab0\u5b50\u731c\u62f3"

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
    new-instance v0, Lm9/e;

    .line 5
    .line 6
    new-instance v1, Lia/t;

    .line 7
    .line 8
    const-class v2, Lm9/a;

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
    const/16 v9, 0xb

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const-string v5, "logRuntimeError"

    .line 19
    .line 20
    const-string v6, "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v3, p0

    .line 24
    invoke-direct/range {v1 .. v9}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p1, v1}, Lm9/e;-><init>(Lr8/g;Lia/t;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v3, Lm9/a;->e:Lm9/e;

    .line 31
    .line 32
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 33
    .line 34
    new-instance p1, Li/e0;

    .line 35
    .line 36
    const/4 v0, 0x7

    .line 37
    invoke-direct {p1, p0, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    const/16 v0, 0x8

    .line 41
    .line 42
    const-string v1, "game_emoji_result"

    .line 43
    .line 44
    const-string v2, "\u6307\u5b9a\u9ab0\u5b50\u731c\u62f3"

    .line 45
    .line 46
    sget-object v4, Lr8/c;->j:Lr8/c;

    .line 47
    .line 48
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 49
    .line 50
    .line 51
    new-instance p1, Lke/h;

    .line 52
    .line 53
    const/16 v0, 0x17

    .line 54
    .line 55
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    const-class v0, Lf8/e;

    .line 59
    .line 60
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u6307\u5b9a\u9ab0\u5b50\u731c\u62f3"

    .line 2
    .line 3
    return-object v0
.end method
