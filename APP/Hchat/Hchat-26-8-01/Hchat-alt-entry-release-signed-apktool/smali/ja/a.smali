.class public final Lja/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lhb/c;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "multi_recall"

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
    const-string v0, "\u5728\u591a\u9009\u5206\u4eab\u83dc\u5355\u4e2d\u6279\u91cf\u64a4\u56de\u81ea\u5df1\u53d1\u9001\u7684\u6d88\u606f"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "multi_recall"

    .line 11
    .line 12
    const-string v3, "\u591a\u9009\u64a4\u56de"

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
    new-instance v0, Lhb/c;

    .line 5
    .line 6
    new-instance v1, Lia/t;

    .line 7
    .line 8
    const-class v2, Lja/a;

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
    const/4 v9, 0x5

    .line 16
    const/4 v2, 0x2

    .line 17
    const-string v5, "logError"

    .line 18
    .line 19
    const-string v6, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, Lhb/c;->g:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v1, v0, Lhb/c;->h:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 37
    .line 38
    const-string v1, "Hchat_multi_recall_config"

    .line 39
    .line 40
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, v0, Lhb/c;->i:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, v0, Lhb/c;->j:Ljava/lang/Object;

    .line 51
    .line 52
    iput-object v0, v3, Lja/a;->e:Lhb/c;

    .line 53
    .line 54
    new-instance p1, Li/e0;

    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    invoke-direct {p1, p0, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    const/16 v0, 0xc

    .line 61
    .line 62
    const-string v1, "multi_recall"

    .line 63
    .line 64
    const-string v2, "\u591a\u9009\u64a4\u56de"

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 68
    .line 69
    .line 70
    new-instance p1, Lke/h;

    .line 71
    .line 72
    const/16 v0, 0x14

    .line 73
    .line 74
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    const-class v0, Lf8/e;

    .line 78
    .line 79
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u591a\u9009\u64a4\u56de"

    .line 2
    .line 3
    return-object v0
.end method
