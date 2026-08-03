.class public final LYue/ۥۡۦۡۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۡۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public static synthetic ۥ(LYue/ۥۡۦۡۡ;)V
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥۡۦۡۡ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;ILjava/lang/Object;)Z
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, LYue/ۥۡۦۡۡ;->ۥ۟۟(Ljava/lang/Throwable;)Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۟(LYue/ۥۡۦۡۡ;)LYue/ۥۡۧۨۧ;
    .locals 1
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;)",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e7<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۦۡۡ$ۥ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۡۦۡۡ$ۥ$ۥ;-><init>(LYue/ۥۡۦۡۡ;)V

    return-object v0
.end method

.method public static synthetic ۥ۟۟۟۟()V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in favor of onReceiveCatching extension"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "onReceiveCatching"
            imports = {}
        .end subannotation
    .end annotation

    return-void
.end method

.method public static synthetic ۥ۟۟۟۠()V
    .locals 0
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۡ()V
    .locals 0
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation

    return-void
.end method

.method public static ۥ۟۟۟ۢ(LYue/ۥۡۦۡۡ;)Ljava/lang/Object;
    .locals 1
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "tryReceive().getOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;)TE;"
        }
    .end annotation

    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->ۥۣ۟۟۠()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟ۧ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LYue/ۥ۟ۤۢ۟;->ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    invoke-static {p0}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۠۟(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method public static ۥۣ۟۟۟(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "receiveCatching().getOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۣ۠ۨۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TE;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥۡۦۡۡ$ۥ$ۥ۟;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۡۦۡۡ$ۥ$ۥ۟;

    iget v1, v0, LYue/ۥۡۦۡۡ$ۥ$ۥ۟;->ۥ۟۟۠ۤ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۡۦۡۡ$ۥ$ۥ۟;->ۥ۟۟۠ۤ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۡۦۡۡ$ۥ$ۥ۟;

    invoke-direct {v0, p1}, LYue/ۥۡۦۡۡ$ۥ$ۥ۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۡۦۡۡ$ۥ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۡۦۡۡ$ۥ$ۥ۟;->ۥ۟۟۠ۤ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    check-cast p1, LYue/ۥ۟ۤۢ۟;

    invoke-virtual {p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۠()Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iput v3, v0, LYue/ۥۡۦۡۡ$ۥ$ۥ۟;->ۥ۟۟۠ۤ:I

    invoke-interface {p0, v0}, LYue/ۥۡۦۡۡ;->ۥ۟۟۠ۧ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟ۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
