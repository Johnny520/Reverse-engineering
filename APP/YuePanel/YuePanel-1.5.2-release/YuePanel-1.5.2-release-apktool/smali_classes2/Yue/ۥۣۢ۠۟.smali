.class public final LYue/ۥۣۢ۠۟;
.super LYue/ۥۡۧۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e1\u06e7\u06e5<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,274:1\n1#2:275\n107#3,13:276\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n232#1:276,13\n*E\n"
.end annotation


# instance fields
.field public ۥ۟۟۠ۦ:Ljava/lang/ThreadLocal;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۤۢ;)V
    .locals 2
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)V"
        }
    .end annotation

    sget-object v0, LYue/ۥۣۢ۠ۡ;->ۥۣ۟۟۠:LYue/ۥۣۢ۠ۡ;

    invoke-interface {p1, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p1, v0}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, LYue/ۥۡۧۥ;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۤۢ;)V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, LYue/ۥۣۢ۠۟;->ۥ۟۟۠ۦ:Ljava/lang/ThreadLocal;

    invoke-interface {p2}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p2

    sget-object v0, LYue/ۥ۟ۧۤۥ;->ۥۣ۟۟۟:LYue/ۥ۟ۧۤۥ$ۥ۟;

    invoke-interface {p2, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p2

    instance-of p2, p2, LYue/ۥ۟ۧۦۨ;

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-static {p1, p2}, LYue/ۥۢۡۡۦ;->ۥ۟۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, LYue/ۥۢۡۡۦ;->ۥ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢ۠۟;->ۥۣ۟۠۠(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public ۥ۟۠۟ۧ(Ljava/lang/Object;)V
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣۢ۠۟;->ۥ۟۟۠ۦ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣۡۦ۠;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۣۡۦ۠;->ۥ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۟ۧۦۥ;

    invoke-virtual {v0}, LYue/ۥۣۡۦ۠;->ۥ۟()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, LYue/ۥۢۡۡۦ;->ۥ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V

    iget-object v0, p0, LYue/ۥۣۢ۠۟;->ۥ۟۟۠ۦ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;

    invoke-static {p1, v0}, LYue/ۥ۟ۦۣۨ;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;

    invoke-interface {v0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v2

    invoke-static {v2, v1}, LYue/ۥۢۡۡۦ;->ۥ۟۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LYue/ۥۢۡۡۦ;->ۥ:LYue/ۥۢ۠ۦۢ;

    if-eq v3, v4, :cond_1

    invoke-static {v0, v2, v3}, LYue/ۥ۟ۧۦۧ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۤۢ;LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)LYue/ۥۣۢ۠۟;

    move-result-object v1

    :cond_1
    :try_start_0
    iget-object v0, p0, LYue/ۥۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LYue/ۥۣۢ۠۟;->ۥ۟۠۠ۢ()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-static {v2, v3}, LYue/ۥۢۡۡۦ;->ۥ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LYue/ۥۣۢ۠۟;->ۥ۟۠۠ۢ()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-static {v2, v3}, LYue/ۥۢۡۡۦ;->ۥ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V

    :cond_5
    throw p1
.end method

.method public final ۥ۟۠۠ۢ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢ۠۟;->ۥ۟۟۠ۦ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, LYue/ۥۣۢ۠۟;->ۥ۟۟۠ۦ:Ljava/lang/ThreadLocal;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final ۥۣ۟۠۠(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣۢ۠۟;->ۥ۟۟۠ۦ:Ljava/lang/ThreadLocal;

    invoke-static {p1, p2}, LYue/ۥۢۢۢۡ;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۣۡۦ۠;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
