.class public final synthetic LYue/ۥ۠ۢۤۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic ۥ(LYue/ۥۣ۠ۢۡ;I)LYue/ۥۣ۠ۢۡ;
    .locals 2
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.4.0, binary compatibility with earlier versions"
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟۠۠(LYue/ۥۣ۠ۢۡ;ILYue/ۥۣۣ۟;ILjava/lang/Object;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟(LYue/ۥۣ۠ۢۡ;ILYue/ۥۣۣ۟;)LYue/ۥۣ۠ۢۡ;
    .locals 7
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, -0x1

    if-gez p1, :cond_1

    const/4 v1, -0x2

    if-eq p1, v1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-ne p1, v0, :cond_3

    sget-object v1, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    if-ne p2, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    if-ne p1, v0, :cond_4

    sget-object p2, LYue/ۥۣۣ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟;

    const/4 p1, 0x0

    :cond_4
    move v3, p1

    move-object v4, p2

    instance-of p1, p0, LYue/ۥۣۣ۠ۧ;

    if-eqz p1, :cond_5

    move-object v0, p0

    check-cast v0, LYue/ۥۣۣ۠ۧ;

    const/4 p0, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move v2, v3

    move-object v3, v4

    move v4, p0

    invoke-static/range {v0 .. v5}, LYue/ۥۣۣ۠ۧ$ۥ;->ۥ(LYue/ۥۣۣ۠ۧ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;ILjava/lang/Object;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    goto :goto_2

    :cond_5
    new-instance p1, LYue/ۥ۟ۤۡۥ;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LYue/ۥ۟ۤۡۥ;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;ILYue/ۥ۟ۨۥۢ;)V

    move-object p0, p1

    :goto_2
    return-object p0
.end method

.method public static synthetic ۥ۟۟(LYue/ۥۣ۠ۢۡ;IILjava/lang/Object;)LYue/ۥۣ۠ۢۡ;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, -0x2

    :cond_0
    invoke-static {p0, p1}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟۟ۨ(LYue/ۥۣ۠ۢۡ;I)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥۣ۠ۢۡ;ILYue/ۥۣۣ۟;ILjava/lang/Object;)LYue/ۥۣ۠ۢۡ;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, -0x2

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    :cond_1
    invoke-static {p0, p1, p2}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟۠(LYue/ۥۣ۠ۢۡ;ILYue/ۥۣۣ۟;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۣ۠ۢۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥۣۣ۟ۨ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۨۤ;

    invoke-direct {v0, p0}, LYue/ۥۣ۟ۨۤ;-><init>(LYue/ۥۣ۠ۢۡ;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥ۟ۧۦۥ;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p0, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Flow context cannot contain job in it. Had "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۣ۠ۢۡ;)LYue/ۥۣ۠ۢۡ;
    .locals 3
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, -0x1

    invoke-static {p0, v2, v0, v1, v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟۠۠(LYue/ۥۣ۠ۢۡ;ILYue/ۥۣۣ۟;ILjava/lang/Object;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣ۠ۢۡ;
    .locals 8
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, LYue/ۥ۠ۢۤۡ;->ۥ۟۟۟۠(LYue/ۥ۟ۧۦۥ;)V

    sget-object v0, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, LYue/ۥۣۣ۠ۧ;

    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, LYue/ۥۣۣ۠ۧ;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, LYue/ۥۣۣ۠ۧ$ۥ;->ۥ(LYue/ۥۣۣ۠ۧ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;ILjava/lang/Object;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    goto :goto_0

    :cond_1
    new-instance v7, LYue/ۥ۟ۤۡۥ;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, LYue/ۥ۟ۤۡۥ;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;ILYue/ۥ۟ۨۥۢ;)V

    move-object p0, v7

    :goto_0
    return-object p0
.end method
