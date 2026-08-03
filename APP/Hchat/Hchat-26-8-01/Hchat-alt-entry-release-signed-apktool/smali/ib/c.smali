.class public final Lib/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lr8/f;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "settings"

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(Lr8/g;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La1/a;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, La1/a;-><init>(Lib/c;Lr8/g;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lr8/e;->c(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final d(Lr8/g;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lr8/g;->i:Lvb/c;

    .line 5
    .line 6
    new-instance v0, Lib/a;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, Lib/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lvb/c;->a(Lvb/a;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lib/a;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p1, v0}, Lib/a;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lvb/c;->a(Lvb/a;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Laa/g;

    .line 28
    .line 29
    const-string v0, "\u8bb0\u5f55\u5fae\u4fe1\u5f02\u5e38\u5e76\u5728\u4e0b\u6b21\u542f\u52a8\u65f6\u663e\u793a\u65e5\u5fd7"

    .line 30
    .line 31
    const-string v1, "entertainment"

    .line 32
    .line 33
    const-string v2, "crash_report"

    .line 34
    .line 35
    const-string v3, "\u6355\u83b7\u5f02\u5e38\u65e5\u5fd7"

    .line 36
    .line 37
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lvb/c;->a(Lvb/a;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u8bbe\u7f6e\u5165\u53e3"

    .line 2
    .line 3
    return-object v0
.end method
