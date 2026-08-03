.class public LYue/ۥ۟ۤۡ۟;
.super LYue/ۥ۟۟۠ۧ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۤ۠ۨ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e0\u06e7<",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "LYue/\u06e5\u06df\u06e4\u06e0\u06e8<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,41:1\n702#2,2:42\n702#2,2:44\n702#2,2:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n21#1:42,2\n26#1:44,2\n32#1:46,2\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e4\u06e0\u06e8<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۤ۠ۨ;ZZ)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۤ۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06df\u06e4\u06e0\u06e8<",
            "TE;>;ZZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p3, p4}, LYue/ۥ۟۟۠ۧ;-><init>(LYue/ۥ۟ۧۦۥ;ZZ)V

    iput-object p2, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    return-void
.end method


# virtual methods
.method public synthetic cancel()V
    .locals 3

    new-instance v0, LYue/ۥ۠ۦ۟ۢ;

    invoke-static {p0}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۢ(LYue/ۥ۠ۦ۠۟;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0}, LYue/ۥ۠ۦ۟ۢ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LYue/ۥ۠ۦ۟ۡ;)V

    invoke-virtual {p0, v0}, LYue/ۥ۟ۤۡ۟;->ۥۣ۟۟ۨ(Ljava/lang/Throwable;)V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0}, LYue/ۥۡۦۡۡ;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()LYue/ۥ۟ۤۡۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e4\u06e1\u06e7<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object v0

    return-object v0
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in the favour of \'trySend\' method"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "trySend(element).isSuccess"
            imports = {}
        .end subannotation
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0, p1}, LYue/ۥۡۨۡ۠;->offer(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public poll()Ljava/lang/Object;
    .locals 1
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
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0}, LYue/ۥۡۦۡۡ;->poll()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ()LYue/ۥ۟ۤ۠ۨ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e4\u06e0\u06e8<",
            "TE;>;"
        }
    .end annotation

    return-object p0
.end method

.method public final synthetic ۥ۟۟(Ljava/lang/Throwable;)Z
    .locals 2
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    new-instance p1, LYue/ۥ۠ۦ۟ۢ;

    invoke-static {p0}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۢ(LYue/ۥ۠ۦ۠۟;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, LYue/ۥ۠ۦ۟ۢ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LYue/ۥ۠ۦ۟ۡ;)V

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤۡ۟;->ۥۣ۟۟ۨ(Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V
    .locals 2
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, LYue/ۥ۠ۦ۟ۢ;

    invoke-static {p0}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۢ(LYue/ۥ۠ۦ۠۟;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, LYue/ۥ۠ۦ۟ۢ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LYue/ۥ۠ۦ۟ۡ;)V

    :cond_1
    invoke-virtual {p0, p1}, LYue/ۥ۟ۤۡ۟;->ۥۣ۟۟ۨ(Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0, p1, p2}, LYue/ۥۡۨۡ۠;->ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TE;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0, p1}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۤ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟ۤ()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۦ()LYue/ۥۡۧۨۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e7<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟ۦ()LYue/ۥۡۧۨۧ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۧ()LYue/ۥۡۧۨۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e7<",
            "LYue/\u06e5\u06df\u06e4\u06e2\u06df<",
            "TE;>;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟ۧ()LYue/ۥۡۧۨۧ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠۟()LYue/ۥۡۧۨۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e7<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0}, LYue/ۥۡۦۡۡ;->ۥ۟۟۠۟()LYue/ۥۡۧۨۧ;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟۠()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0}, LYue/ۥۡۦۡۡ;->ۥۣ۟۟۠()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۤ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
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
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TE;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0, p1}, LYue/ۥۡۦۡۡ;->ۥ۟۟۠ۤ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۧ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e4\u06e2\u06df<",
            "+TE;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0, p1}, LYue/ۥۡۦۡۡ;->ۥ۟۟۠ۧ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    return-object p1
.end method

.method public ۥ۟۟ۡ۠()LYue/ۥۡۧۨۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e8<",
            "TE;",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
            "TE;>;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0}, LYue/ۥۡۨۡ۠;->ۥ۟۟ۡ۠()LYue/ۥۡۧۨۨ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0, p1}, LYue/ۥۡۨۡ۠;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟ۡۨ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0, p1}, LYue/ۥۡۨۡ۠;->ۥ۟۟ۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢ۠(LYue/ۥۣ۠ۡ۟;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0, p1}, LYue/ۥۡۨۡ۠;->ۥ۟۟ۢ۠(LYue/ۥۣ۠ۡ۟;)V

    return-void
.end method

.method public ۥ۟۟ۢۡ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0}, LYue/ۥۡۨۡ۠;->ۥ۟۟ۢۡ()Z

    move-result v0

    return v0
.end method

.method public ۥۣ۟۟ۨ(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1, v0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۠۟۠(LYue/ۥ۠ۦ۠۟;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    invoke-interface {v0, p1}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۥ(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final ۥ۟۠۠ۡ()LYue/ۥ۟ۤ۠ۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e4\u06e0\u06e8<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤ۠ۨ;

    return-object v0
.end method
