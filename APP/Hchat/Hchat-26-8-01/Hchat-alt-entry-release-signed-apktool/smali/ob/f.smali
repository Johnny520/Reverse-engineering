.class public final Lob/f;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lob/n;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "text_voice"

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
    const-string v0, "\u628a\u8f93\u5165\u6587\u5b57\u5408\u6210\u4e3a\u5fae\u4fe1\u8bed\u97f3\uff0c\u6216\u957f\u6309\u6587\u5b57\u6d88\u606f\u5728\u7ebf\u5408\u6210\u64ad\u653e"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "text_voice"

    .line 11
    .line 12
    const-string v3, "\u6587\u672c\u8f6c\u8bed\u97f3"

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
    new-instance v0, Lob/n;

    .line 5
    .line 6
    new-instance v1, Lia/t;

    .line 7
    .line 8
    const-class v2, Lob/f;

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
    const/16 v9, 0xf

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
    invoke-direct {v0, p1, v1}, Lob/n;-><init>(Lr8/g;Lia/t;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v3, Lob/f;->e:Lob/n;

    .line 31
    .line 32
    sget-object v1, Leb/m0;->a:Leb/m0;

    .line 33
    .line 34
    new-instance v1, Lob/e;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lob/e;-><init>(Lob/n;)V

    .line 37
    .line 38
    .line 39
    const-string v0, "text_voice"

    .line 40
    .line 41
    invoke-static {v0, v1}, Leb/m0;->j(Ljava/lang/String;Leb/i0;)La2/a;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p0, v1}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Lr8/e;->a:Landroid/os/Handler;

    .line 49
    .line 50
    new-instance v1, Lc9/f;

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    invoke-direct {v1, p1, v2}, Lc9/f;-><init>(Lr8/g;I)V

    .line 54
    .line 55
    .line 56
    const/16 v2, 0x8

    .line 57
    .line 58
    const-string v4, "shared:send_button"

    .line 59
    .line 60
    const-string v5, "\u804a\u5929\u53d1\u9001\u6309\u94ae"

    .line 61
    .line 62
    sget-object v6, Lr8/c;->j:Lr8/c;

    .line 63
    .line 64
    invoke-static {v2, v1, v4, v5, v6}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 65
    .line 66
    .line 67
    new-instance v1, Li/e0;

    .line 68
    .line 69
    const/16 v2, 0xa

    .line 70
    .line 71
    invoke-direct {v1, p0, v2}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    const/16 v2, 0xc

    .line 75
    .line 76
    const-string v4, "\u6587\u672c\u8f6c\u8bed\u97f3"

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-static {v2, v1, v0, v4, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Le9/a;

    .line 83
    .line 84
    const/4 v1, 0x4

    .line 85
    invoke-direct {v0, p0, v1, p1}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    const-class p1, Lf8/e;

    .line 89
    .line 90
    invoke-virtual {p0, p1, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u6587\u672c\u8f6c\u8bed\u97f3"

    .line 2
    .line 3
    return-object v0
.end method
