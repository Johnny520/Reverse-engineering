.class public LYue/ۥۣ۠ۨ۠;
.super LYue/ۥ۠ۨ۠ۥ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۨ۠ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۥۥ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۥۧ()LYue/ۥ۠ۨ۠ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۥۨ()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ۠;->ۥ۟۟ۦۦ()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final synthetic ۥ۟۟ۦۤ(LYue/ۥۣ۠ۡ۟;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    :goto_0
    invoke-static {v0, p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x3

    const-string v2, "T"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V

    instance-of v1, v0, LYue/ۥ۠ۨ۠ۥ;

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۡ()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۥ۟۟ۦۥ()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟ۦۦ()Ljava/lang/Void;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "head cannot be removed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟ۦۧ()V
    .locals 3

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    move-object v1, p0

    :goto_0
    invoke-static {v0, p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۡ()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۦۣ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V

    move-object v1, v0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥ۠()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    invoke-virtual {p0, v1, v0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۦۣ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V

    return-void
.end method
