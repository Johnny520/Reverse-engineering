.class public final Ljb/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Ljb/e;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "finder_media_download"

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Lr8/g;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-string v0, "Hchat_finder_media_download"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "enable"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
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
    const-string v0, "\u5728\u89c6\u9891\u53f7\u5206\u4eab\u83dc\u5355\u589e\u52a0\u590d\u5236\u94fe\u63a5\u548c\u4e0b\u8f7d\u5165\u53e3"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "finder_media_download"

    .line 11
    .line 12
    const-string v3, "\u89c6\u9891\u53f7\u5a92\u4f53\u4e0b\u8f7d"

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
    new-instance v0, Ljb/e;

    .line 5
    .line 6
    new-instance v1, Lia/t;

    .line 7
    .line 8
    const-class v2, Ljb/a;

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
    const/4 v9, 0x6

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
    invoke-direct {v0, p1, v1}, Ljb/e;-><init>(Lr8/g;Lia/t;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, v3, Ljb/a;->e:Ljb/e;

    .line 30
    .line 31
    new-instance p1, Li/e0;

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-direct {p1, p0, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    const/16 v0, 0xc

    .line 38
    .line 39
    const-string v1, "finder_media_download"

    .line 40
    .line 41
    const-string v2, "\u89c6\u9891\u53f7\u5a92\u4f53\u4e0b\u8f7d"

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
    const/16 v0, 0x15

    .line 50
    .line 51
    invoke-direct {p1, p0, v0}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    const-class v0, Lf8/e;

    .line 55
    .line 56
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u89c6\u9891\u53f7\u5a92\u4f53\u4e0b\u8f7d"

    .line 2
    .line 3
    return-object v0
.end method
