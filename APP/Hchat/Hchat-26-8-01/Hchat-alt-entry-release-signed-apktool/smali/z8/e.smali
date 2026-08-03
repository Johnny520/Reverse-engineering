.class public final Lz8/e;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lz8/g;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "call_ringtone_block"

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
    const-string v0, "\u5206\u522b\u5c4f\u853d\u5fae\u4fe1\u901a\u8bdd\u7684\u547c\u5165\u94c3\u58f0\u548c\u547c\u51fa\u7b49\u5f85\u94c3\u58f0"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "call_ringtone_block"

    .line 11
    .line 12
    const-string v3, "\u5c4f\u853d\u901a\u8bdd\u94c3\u58f0"

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
    new-instance v0, Lz8/g;

    .line 5
    .line 6
    new-instance v1, Ly9/b;

    .line 7
    .line 8
    const-class v2, Lz8/e;

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
    const/4 v9, 0x3

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
    invoke-direct {v0, p1, v1}, Lz8/g;-><init>(Lr8/g;Ly9/b;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, v3, Lz8/e;->e:Lz8/g;

    .line 30
    .line 31
    new-instance p1, Lv0/a;

    .line 32
    .line 33
    const/16 v0, 0xc

    .line 34
    .line 35
    invoke-direct {p1, p0, v0}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    const-string v1, "call_ringtone_block"

    .line 39
    .line 40
    const-string v2, "\u5c4f\u853d\u901a\u8bdd\u94c3\u58f0"

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Lq9/a;

    .line 47
    .line 48
    const/16 v0, 0xf

    .line 49
    .line 50
    invoke-direct {p1, p0, v0}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    const-class v0, Lf8/e;

    .line 54
    .line 55
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u5c4f\u853d\u901a\u8bdd\u94c3\u58f0"

    .line 2
    .line 3
    return-object v0
.end method
