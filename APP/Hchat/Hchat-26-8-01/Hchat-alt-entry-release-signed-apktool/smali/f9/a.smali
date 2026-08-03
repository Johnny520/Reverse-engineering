.class public final Lf9/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lf9/e;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "edit_message"

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
    const-string v0, "\u957f\u6309\u6587\u5b57\u3001\u5f15\u7528\u6216\u8f6c\u8d26\u6d88\u606f\u540e\u4fee\u6539\u672c\u5730\u804a\u5929\u8bb0\u5f55"

    .line 7
    .line 8
    const-string v1, "entertainment"

    .line 9
    .line 10
    const-string v2, "edit_message"

    .line 11
    .line 12
    const-string v3, "\u4fee\u6539\u804a\u5929\u8bb0\u5f55"

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
    new-instance v0, Lf9/e;

    .line 5
    .line 6
    new-instance v1, Lab/b;

    .line 7
    .line 8
    const-class v2, Lf9/a;

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
    invoke-direct {v0, p1, v1}, Lf9/e;-><init>(Lr8/g;Lab/b;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v3, Lf9/a;->e:Lf9/e;

    .line 31
    .line 32
    new-instance p1, Lab/a;

    .line 33
    .line 34
    const/16 v0, 0x13

    .line 35
    .line 36
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    const/16 v0, 0xc

    .line 40
    .line 41
    const-string v1, "edit_message"

    .line 42
    .line 43
    const-string v2, "\u4fee\u6539\u804a\u5929\u8bb0\u5f55"

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lke/h;

    .line 50
    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    const-class v0, Lf8/e;

    .line 57
    .line 58
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u4fee\u6539\u804a\u5929\u8bb0\u5f55"

    .line 2
    .line 3
    return-object v0
.end method
