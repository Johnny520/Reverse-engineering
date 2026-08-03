.class public final Lab/c;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lab/f;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "quote_delete_clear"

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
    const-string v0, "\u8f93\u5165\u6846\u4e3a\u7a7a\u65f6\u6309\u5220\u9664\u952e\u53d6\u6d88\u5f15\u7528\u6d88\u606f"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "quote_delete_clear"

    .line 11
    .line 12
    const-string v3, "\u5220\u9664\u952e\u6e05\u5f15\u7528"

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
    new-instance v0, Lab/f;

    .line 5
    .line 6
    new-instance v1, Lab/b;

    .line 7
    .line 8
    const-class v2, Lab/c;

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
    const/4 v9, 0x0

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
    invoke-direct/range {v1 .. v9}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, Lab/f;-><init>(Lr8/g;Lab/b;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, v3, Lab/c;->e:Lab/f;

    .line 30
    .line 31
    new-instance p1, Lab/a;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    const/16 v0, 0xc

    .line 38
    .line 39
    const-string v1, "quote_delete_clear"

    .line 40
    .line 41
    const-string v2, "\u5220\u9664\u952e\u6e05\u5f15\u7528"

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 45
    .line 46
    .line 47
    new-instance p1, Lke/h;

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

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
    const-string v0, "\u5220\u9664\u952e\u6e05\u5f15\u7528"

    .line 2
    .line 3
    return-object v0
.end method
