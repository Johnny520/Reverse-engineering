.class public final Lj9/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lea/c;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "fake_voice_duration"

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
    const-string v0, "\u81ea\u5b9a\u4e49\u5fae\u4fe1\u663e\u793a\u7684\u8bed\u97f3\u65f6\u957f"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "fake_voice_duration"

    .line 11
    .line 12
    const-string v3, "\u4f2a\u9020\u8bed\u97f3\u65f6\u957f"

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
    new-instance v1, Lia/t;

    .line 7
    .line 8
    const-class v2, Lj9/a;

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
    const/4 v9, 0x4

    .line 16
    const/4 v2, 0x2

    .line 17
    const-string v5, "logFeatureError"

    .line 18
    .line 19
    const-string v6, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    move-object v3, p0

    .line 23
    invoke-direct/range {v1 .. v9}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, Lea/c;-><init>(Lr8/g;Lia/t;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, v3, Lj9/a;->e:Lea/c;

    .line 30
    .line 31
    sget-object p1, Lr8/e;->a:Landroid/os/Handler;

    .line 32
    .line 33
    new-instance p1, Li/e0;

    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    invoke-direct {p1, p0, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    const/16 v0, 0x8

    .line 40
    .line 41
    const-string v1, "fake_voice_duration"

    .line 42
    .line 43
    const-string v2, "\u4f2a\u9020\u8bed\u97f3\u65f6\u957f"

    .line 44
    .line 45
    sget-object v4, Lr8/c;->i:Lr8/c;

    .line 46
    .line 47
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, Lke/h;

    .line 51
    .line 52
    const/16 v0, 0x13

    .line 53
    .line 54
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    const-class v0, Lf8/e;

    .line 58
    .line 59
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u4f2a\u9020\u8bed\u97f3\u65f6\u957f"

    .line 2
    .line 3
    return-object v0
.end method
