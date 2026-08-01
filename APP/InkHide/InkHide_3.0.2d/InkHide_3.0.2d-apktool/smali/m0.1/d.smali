.class public final Lm0/d;
.super LG/d;
.source "SourceFile"


# virtual methods
.method public final i(I[Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-le p1, v0, :cond_0

    .line 3
    .line 4
    invoke-static {p2}, LG/d;->a([Ljava/lang/Object;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string p2, ">>> "

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 15
    .line 16
    invoke-interface {p2, p1}, Ld0/a;->j(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
