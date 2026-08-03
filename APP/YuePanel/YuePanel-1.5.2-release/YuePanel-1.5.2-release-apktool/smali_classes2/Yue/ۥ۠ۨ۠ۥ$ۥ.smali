.class public abstract LYue/ۥ۠ۨ۠ۥ$ۥ;
.super LYue/ۥ۟ۢ۟ۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,671:1\n1#2:672\n*E\n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۢ۟ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(LYue/ۥ۟ۢ۠;Ljava/lang/Object;)V
    .locals 4
    .param p1    # LYue/ۥ۟ۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟ۢ()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥۣ۟۟۟()LYue/ۥ۠ۨ۠ۥ;

    move-result-object v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟ۨ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    sget-object v3, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, v0, p1, v2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟۠(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V

    :cond_4
    return-void
.end method

.method public final ۥ۟۟(LYue/ۥ۟ۢ۠;)Ljava/lang/Object;
    .locals 5
    .param p1    # LYue/ۥ۟ۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟ۧ(LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object p1, LYue/ۥ۟ۢ۟ۨ;->ۥ۟:Ljava/lang/Object;

    return-object p1

    :cond_1
    iget-object v1, v0, LYue/ۥ۠ۨ۠ۥ;->_next:Ljava/lang/Object;

    const/4 v2, 0x0

    if-ne v1, p1, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p1}, LYue/ۥ۟ۢ۠;->ۥ۟۟۟ۢ()Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v2

    :cond_3
    instance-of v3, v1, LYue/ۥۣۣۡۡ;

    if-eqz v3, :cond_5

    check-cast v1, LYue/ۥۣۣۡۡ;

    invoke-virtual {p1, v1}, LYue/ۥۣۣۡۡ;->ۥ۟(LYue/ۥۣۣۡۡ;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object p1, LYue/ۥ۟ۢ۟ۨ;->ۥ۟:Ljava/lang/Object;

    return-object p1

    :cond_4
    invoke-virtual {v1, v0}, LYue/ۥۣۣۡۡ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    invoke-virtual {p0, v0}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟۟(LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_6

    return-object v3

    :cond_6
    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟ۦ(LYue/ۥ۠ۨ۠ۥ;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;

    move-object v4, v1

    check-cast v4, LYue/ۥ۠ۨ۠ۥ;

    invoke-direct {v3, v0, v4, p0}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;-><init>(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ$ۥ;)V

    sget-object v4, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, v0, v1, v3}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    :try_start_0
    invoke-virtual {v3, v0}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v0, LYue/ۥ۠ۨ۠ۦ;->ۥ:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v4, v0, :cond_0

    return-object v2

    :catchall_0
    move-exception p1

    sget-object v2, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, v0, v3, v1}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    throw p1
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract ۥ۟۟۟۠(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟۟ۡ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)V
    .param p1    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟۟ۢ()LYue/ۥ۠ۨ۠ۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end method

.method public abstract ۥۣ۟۟۟()LYue/ۥ۠ۨ۠ۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟ۡ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥ۠ۨ۠ۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    return-void
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥ۠ۨ۠ۥ;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥۣۣۡۡ;)LYue/ۥ۠ۨ۠ۥ;
    .locals 0
    .param p1    # LYue/ۥۣۣۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ$ۥ;->ۥ۟۟۟ۢ()LYue/ۥ۠ۨ۠ۥ;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object p1
.end method

.method public abstract ۥ۟۟۟ۨ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method
