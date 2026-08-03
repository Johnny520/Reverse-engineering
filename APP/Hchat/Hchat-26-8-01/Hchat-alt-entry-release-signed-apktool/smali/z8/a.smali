.class public final Lz8/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lz8/d;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "call_media_limit"

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
    const-string v0, "\u901a\u8bdd\u65f6\u64ad\u653e\u8bed\u97f3\u548c\u89c6\u9891\uff0c\u5e76\u5141\u8bb8\u6253\u5f00\u62cd\u6444"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "call_media_limit"

    .line 11
    .line 12
    const-string v3, "\u79fb\u9664\u901a\u8bdd\u5a92\u4f53\u9650\u5236"

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
    new-instance v0, Lz8/d;

    .line 5
    .line 6
    new-instance v1, Ly9/b;

    .line 7
    .line 8
    const-class v2, Lz8/a;

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
    const/4 v9, 0x2

    .line 16
    const/4 v2, 0x2

    .line 17
    const-string v5, "logRuntimeError"

    .line 18
    .line 19
    const-string v6, "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    move-object v3, p0

    .line 23
    invoke-direct/range {v1 .. v9}, Ly9/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, Lz8/d;-><init>(Lr8/g;Ly9/b;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, v3, Lz8/a;->e:Lz8/d;

    .line 30
    .line 31
    new-instance p1, Lv0/a;

    .line 32
    .line 33
    const/16 v0, 0xb

    .line 34
    .line 35
    invoke-direct {p1, p0, v0}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    const/16 v0, 0xc

    .line 39
    .line 40
    const-string v1, "call_media_limit"

    .line 41
    .line 42
    const-string v2, "\u79fb\u9664\u901a\u8bdd\u5a92\u4f53\u9650\u5236"

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Lq9/a;

    .line 49
    .line 50
    const/16 v0, 0xe

    .line 51
    .line 52
    invoke-direct {p1, p0, v0}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    const-class v0, Lf8/e;

    .line 56
    .line 57
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u79fb\u9664\u901a\u8bdd\u5a92\u4f53\u9650\u5236"

    .line 2
    .line 3
    return-object v0
.end method
