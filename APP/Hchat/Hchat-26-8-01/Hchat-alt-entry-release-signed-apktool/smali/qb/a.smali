.class public final Lqb/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lqb/k;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "voice_forward"

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
    const-string v0, "\u957f\u6309\u804a\u5929\u8bed\u97f3\u6216\u6536\u85cf\u8bed\u97f3\u540e\u8f6c\u53d1\u7ed9\u597d\u53cb/\u7fa4\u804a\uff0c\u6216\u4fdd\u5b58\u5230\u672c\u5730"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "voice_forward"

    .line 11
    .line 12
    const-string v3, "\u8bed\u97f3\u8f6c\u53d1\u4fdd\u5b58"

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
    new-instance v0, Lqb/k;

    .line 5
    .line 6
    new-instance v1, Lia/t;

    .line 7
    .line 8
    const-class v2, Lqb/a;

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
    invoke-direct/range {v1 .. v9}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p1, v1}, Lqb/k;-><init>(Lr8/g;Lia/t;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v3, Lqb/a;->e:Lqb/k;

    .line 31
    .line 32
    new-instance p1, Li/e0;

    .line 33
    .line 34
    const/16 v0, 0xd

    .line 35
    .line 36
    invoke-direct {p1, p0, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    const/16 v0, 0xc

    .line 40
    .line 41
    const-string v1, "voice_forward"

    .line 42
    .line 43
    const-string v2, "\u8bed\u97f3\u8f6c\u53d1\u4fdd\u5b58"

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lq9/a;

    .line 50
    .line 51
    const/4 v0, 0x1

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
    const-string v0, "\u8bed\u97f3\u8f6c\u53d1\u4fdd\u5b58"

    .line 2
    .line 3
    return-object v0
.end method
