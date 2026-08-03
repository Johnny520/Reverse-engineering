.class public final Lpb/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lcb/f;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "block_typing_report"

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
    const-string v0, "\u8f93\u5165\u6587\u5b57\u65f6\u4e0d\u5411\u5bf9\u65b9\u663e\u793a\u6b63\u5728\u8f93\u5165\u72b6\u6001"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "block_typing_report"

    .line 11
    .line 12
    const-string v3, "\u62e6\u622a\u6b63\u5728\u8f93\u5165\u4e0a\u62a5"

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
    new-instance v0, Lcb/f;

    .line 5
    .line 6
    new-instance v1, Lia/t;

    .line 7
    .line 8
    const-class v2, Lpb/a;

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
    const/16 v9, 0x10

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
    const/4 v2, 0x0

    .line 28
    invoke-direct {v0, p1, v1, v2}, Lcb/f;-><init>(Lr8/g;Lia/t;B)V

    .line 29
    .line 30
    .line 31
    iput-object v0, v3, Lpb/a;->e:Lcb/f;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-virtual {v0, p1}, Lcb/f;->g(Z)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/4 v0, 0x1

    .line 39
    if-ne p1, v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Li/e0;

    .line 43
    .line 44
    const/16 v0, 0xb

    .line 45
    .line 46
    invoke-direct {p1, p0, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    const/16 v0, 0xc

    .line 50
    .line 51
    const-string v1, "block_typing_report"

    .line 52
    .line 53
    const-string v2, "\u62e6\u622a\u6b63\u5728\u8f93\u5165\u4e0a\u62a5"

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    new-instance p1, Lke/h;

    .line 60
    .line 61
    const/16 v0, 0x1d

    .line 62
    .line 63
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    const-class v0, Lf8/e;

    .line 67
    .line 68
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u62e6\u622a\u6b63\u5728\u8f93\u5165\u4e0a\u62a5"

    .line 2
    .line 3
    return-object v0
.end method
