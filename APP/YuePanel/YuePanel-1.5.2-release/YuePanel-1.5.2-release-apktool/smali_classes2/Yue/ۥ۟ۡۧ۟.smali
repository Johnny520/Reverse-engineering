.class public LYue/ۥ۟ۡۧ۟;
.super LYue/ۥ۟۟۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۡۧ۟$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e0\u06e4<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nArrayChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayChannel.kt\nkotlinx/coroutines/channels/ArrayChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,308:1\n1#2:309\n17#3:310\n17#3:311\n17#3:312\n17#3:313\n17#3:314\n17#3:315\n17#3:316\n17#3:317\n17#3:318\n*S KotlinDebug\n*F\n+ 1 ArrayChannel.kt\nkotlinx/coroutines/channels/ArrayChannel\n*L\n52#1:310\n53#1:311\n58#1:312\n90#1:313\n129#1:314\n181#1:315\n221#1:316\n277#1:317\n286#1:318\n*E\n"
.end annotation


# instance fields
.field private volatile synthetic size:I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:I

.field public final ۥ۟۟۠ۧ:LYue/ۥۣۣ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۨ:Ljava/util/concurrent/locks/ReentrantLock;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟ۡ:[Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟ۡ۟:I


# direct methods
.method public constructor <init>(ILYue/ۥۣۣ۟;LYue/ۥۣ۠ۡ۟;)V
    .locals 6
    .param p2    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p3}, LYue/ۥ۟۟۠ۤ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    iput p1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۦ:I

    iput-object p2, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۧ:LYue/ۥۣۣ۟;

    const/4 p2, 0x1

    if-lt p1, p2, :cond_0

    new-instance p2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p2, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/locks/ReentrantLock;

    const/16 p2, 0x8

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    new-array p1, p1, [Ljava/lang/Object;

    sget-object v1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LYue/ۥ۟ۢ۟۟;->ۥ۟۠ۢۢ([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    iput-object p1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "ArrayChannel capacity must be at least 1, but "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " was specified"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public isEmpty()Z
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, LYue/ۥ۟۟۠ۤ;->ۥ۟۟ۤ۟()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v1

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public ۥ۟۟۟ۤ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-super {p0}, LYue/ۥ۟۟۠ۤ;->ۥ۟۟۟ۤ()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v1

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public ۥ۟۟۠۠(LYue/ۥۡۨ۠ۦ;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥۡۨ۠ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-super {p0, p1}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠۠(LYue/ۥۡۨ۠ۦ;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public ۥ۟۟۠ۡ()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(buffer:capacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۦ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟ۡۦ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۥ۟۟ۡۧ()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۡۧ۟;->size:I

    iget v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۦ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۧ:LYue/ۥۣۣ۟;

    sget-object v1, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۢ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    invoke-virtual {p0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠ۥ()LYue/ۥ۟ۥ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v2

    :cond_0
    :try_start_1
    invoke-virtual {p0, v1}, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۥۡ(I)LYue/ۥۢ۠ۦۢ;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v2

    :cond_1
    if-nez v1, :cond_5

    :cond_2
    :try_start_2
    invoke-virtual {p0}, LYue/ۥ۟۟۠ۤ;->ۥ۟۟ۢۧ()LYue/ۥۡۦۡۢ;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    instance-of v3, v2, LYue/ۥ۟ۥ;

    if-eqz v3, :cond_4

    iput v1, p0, LYue/ۥ۟ۡۧ۟;->size:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_4
    :try_start_3
    invoke-static {v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-interface {v2, p1, v3}, LYue/ۥۡۦۡۢ;->ۥ۟۟۠ۤ(Ljava/lang/Object;LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)LYue/ۥۢ۠ۦۢ;

    move-result-object v3

    if-eqz v3, :cond_2

    iput v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-interface {v2, p1}, LYue/ۥۡۦۡۢ;->ۥ۟۟ۡۧ(Ljava/lang/Object;)V

    invoke-interface {v2}, LYue/ۥۡۦۡۢ;->ۥ۟۟۠ۥ()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_0
    :try_start_4
    invoke-virtual {p0, v1, p1}, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۥ۟(ILjava/lang/Object;)V

    sget-object p1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public ۥ۟۟ۢۢ(Ljava/lang/Object;LYue/ۥۡۨ;)Ljava/lang/Object;
    .locals 4
    .param p2    # LYue/ۥۡۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "LYue/\u06e5\u06e1\u06e8<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    invoke-virtual {p0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠ۥ()LYue/ۥ۟ۥ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v2

    :cond_0
    :try_start_1
    invoke-virtual {p0, v1}, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۥۡ(I)LYue/ۥۢ۠ۦۢ;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v2

    :cond_1
    if-nez v1, :cond_6

    :cond_2
    :try_start_2
    invoke-virtual {p0, p1}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠(Ljava/lang/Object;)LYue/ۥ۟۟ۢۢ$ۥ۟۟۟;

    move-result-object v2

    invoke-interface {p2, v2}, LYue/ۥۡۨ;->ۥ۟۟۟ۦ(LYue/ۥ۟ۢ۟ۥ;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_3

    iput v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    invoke-virtual {v2}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->ۥ۟۟۠()Ljava/lang/Object;

    move-result-object p2

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-static {p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    check-cast p2, LYue/ۥۡۦۡۢ;

    invoke-interface {p2, p1}, LYue/ۥۡۦۡۢ;->ۥ۟۟ۡۧ(Ljava/lang/Object;)V

    invoke-interface {p2}, LYue/ۥۡۦۡۢ;->ۥ۟۟۠ۥ()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    :try_start_3
    sget-object v2, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۟:LYue/ۥۢ۠ۦۢ;

    if-eq v3, v2, :cond_6

    sget-object v2, LYue/ۥ۟ۢ۟ۨ;->ۥ۟:Ljava/lang/Object;

    if-eq v3, v2, :cond_2

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object p1

    if-eq v3, p1, :cond_5

    instance-of p1, v3, LYue/ۥ۟ۥ;

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "performAtomicTrySelect(describeTryOffer) returned "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_0
    iput v1, p0, LYue/ۥ۟ۡۧ۟;->size:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v3

    :cond_6
    :try_start_4
    invoke-interface {p2}, LYue/ۥۡۨ;->ۥ۟۟۠ۧ()Z

    move-result p2

    if-nez p2, :cond_7

    iput v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :cond_7
    :try_start_5
    invoke-virtual {p0, v1, p1}, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۥ۟(ILjava/lang/Object;)V

    sget-object p1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public ۥۣ۟۟ۥ(LYue/ۥۡۦۡ۠;)Z
    .locals 1
    .param p1    # LYue/ۥۡۦۡ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e0<",
            "-TE;>;)Z"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-super {p0, p1}, LYue/ۥ۟۟۠ۤ;->ۥۣ۟۟ۥ(LYue/ۥۡۦۡ۠;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final ۥۣ۟۟ۨ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۥ۟۟ۤ()Z
    .locals 1

    iget v0, p0, LYue/ۥ۟ۡۧ۟;->size:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۤ۠(Z)V
    .locals 9

    iget-object v0, p0, LYue/ۥ۟۟ۢۢ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;

    iget-object v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v2, p0, LYue/ۥ۟ۡۧ۟;->size:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v3

    :goto_0
    if-ge v5, v2, :cond_1

    iget-object v6, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v7, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    aget-object v6, v6, v7

    if-eqz v0, :cond_0

    sget-object v7, LYue/ۥ۟۟۠ۥ;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    if-eq v6, v7, :cond_0

    invoke-static {v0, v6, v4}, LYue/ۥۣۡۢۥ;->ۥ۟۟(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥۣۢ۟ۨ;)LYue/ۥۣۢ۟ۨ;

    move-result-object v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_1
    iget-object v6, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v7, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    sget-object v8, LYue/ۥ۟۟۠ۥ;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    aput-object v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    array-length v6, v6

    rem-int/2addr v7, v6

    iput v7, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    iput v3, p0, LYue/ۥ۟ۡۧ۟;->size:I

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-super {p0, p1}, LYue/ۥ۟۟۠ۤ;->ۥ۟۟ۤ۠(Z)V

    if-nez v4, :cond_2

    return-void

    :cond_2
    throw v4

    :goto_2
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public ۥ۟۟ۤۤ()Ljava/lang/Object;
    .locals 9
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    if-nez v1, :cond_1

    invoke-virtual {p0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠ۥ()LYue/ۥ۟ۥ;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v1

    :cond_1
    :try_start_1
    iget-object v2, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v3, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    aget-object v4, v2, v3

    const/4 v5, 0x0

    aput-object v5, v2, v3

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, LYue/ۥ۟ۡۧ۟;->size:I

    sget-object v2, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    iget v3, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۦ:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-ne v1, v3, :cond_4

    move-object v3, v5

    :goto_1
    invoke-virtual {p0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟ۢۨ()LYue/ۥۡۨ۠ۦ;

    move-result-object v8

    if-nez v8, :cond_2

    move-object v5, v3

    goto :goto_2

    :cond_2
    invoke-static {v8}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v8, v5}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۧ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)LYue/ۥۢ۠ۦۢ;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v8}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۥ()Ljava/lang/Object;

    move-result-object v2

    move v7, v6

    move-object v5, v8

    goto :goto_2

    :cond_3
    invoke-virtual {v8}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۨ()V

    move-object v3, v8

    goto :goto_1

    :cond_4
    :goto_2
    sget-object v3, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    if-eq v2, v3, :cond_5

    instance-of v3, v2, LYue/ۥ۟ۥ;

    if-nez v3, :cond_5

    iput v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    iget-object v3, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v8, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    add-int/2addr v8, v1

    array-length v1, v3

    rem-int/2addr v8, v1

    aput-object v2, v3, v8

    :cond_5
    iget v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    add-int/2addr v1, v6

    iget-object v2, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    array-length v2, v2

    rem-int/2addr v1, v2

    iput v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    if-eqz v7, :cond_6

    invoke-static {v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v5}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۤ()V

    :cond_6
    return-object v4

    :goto_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public ۥ۟۟ۤۥ(LYue/ۥۡۨ;)Ljava/lang/Object;
    .locals 8
    .param p1    # LYue/ۥۡۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    if-nez v1, :cond_1

    invoke-virtual {p0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠ۥ()LYue/ۥ۟ۥ;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :cond_1
    :try_start_1
    iget-object v2, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v3, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    aget-object v4, v2, v3

    const/4 v5, 0x0

    aput-object v5, v2, v3

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, LYue/ۥ۟ۡۧ۟;->size:I

    sget-object v2, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    iget v3, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۦ:I

    const/4 v6, 0x1

    if-ne v1, v3, :cond_6

    :cond_2
    invoke-virtual {p0}, LYue/ۥ۟۟۠ۤ;->ۥۣۣ۟۟()LYue/ۥ۟۟۠ۤ$ۥ۟۟۟ۡ;

    move-result-object v3

    invoke-interface {p1, v3}, LYue/ۥۡۨ;->ۥ۟۟۟ۦ(LYue/ۥ۟ۢ۟ۥ;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_3

    invoke-virtual {v3}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۟;->ۥ۟۟۠()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    move-object v2, v5

    check-cast v2, LYue/ۥۡۨ۠ۦ;

    invoke-virtual {v2}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۥ()Ljava/lang/Object;

    move-result-object v2

    move v3, v6

    goto :goto_1

    :cond_3
    sget-object v3, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    if-eq v7, v3, :cond_6

    sget-object v3, LYue/ۥ۟ۢ۟ۨ;->ۥ۟:Ljava/lang/Object;

    if-eq v7, v3, :cond_2

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_4

    iput v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    iget-object p1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    aput-object v4, p1, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v7

    :cond_4
    :try_start_2
    instance-of v2, v7, LYue/ۥ۟ۥ;

    if-eqz v2, :cond_5

    move v3, v6

    move-object v2, v7

    move-object v5, v2

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "performAtomicTrySelect(describeTryOffer) returned "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const/4 v3, 0x0

    :goto_1
    sget-object v7, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    if-eq v2, v7, :cond_7

    instance-of v7, v2, LYue/ۥ۟ۥ;

    if-nez v7, :cond_7

    iput v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    iget-object p1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v7, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    add-int/2addr v7, v1

    array-length v1, p1

    rem-int/2addr v7, v1

    aput-object v2, p1, v7

    goto :goto_2

    :cond_7
    invoke-interface {p1}, LYue/ۥۡۨ;->ۥ۟۟۠ۧ()Z

    move-result p1

    if-nez p1, :cond_8

    iput v1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    iget-object p1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    aput-object v4, p1, v1

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :cond_8
    :goto_2
    :try_start_3
    iget p1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    add-int/2addr p1, v6

    iget-object v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    array-length v1, v1

    rem-int/2addr p1, v1

    iput p1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    if-eqz v3, :cond_9

    invoke-static {v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    check-cast v5, LYue/ۥۡۨ۠ۦ;

    invoke-virtual {v5}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۤ()V

    :cond_9
    return-object v4

    :goto_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final ۥ۟۟ۥ۟(ILjava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    iget v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۦ:I

    if-ge p1, v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۥ۠(I)V

    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    add-int/2addr v1, p1

    array-length p1, v0

    rem-int/2addr v1, p1

    aput-object p2, v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    array-length v2, v0

    rem-int v2, v1, v2

    const/4 v3, 0x0

    aput-object v3, v0, v2

    add-int/2addr p1, v1

    array-length v2, v0

    rem-int/2addr p1, v2

    aput-object p2, v0, p1

    add-int/lit8 v1, v1, 0x1

    array-length p1, v0

    rem-int/2addr v1, p1

    iput v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    :goto_0
    return-void
.end method

.method public final ۥ۟۟ۥ۠(I)V
    .locals 7

    iget-object v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    array-length v1, v0

    if-lt p1, v1, :cond_1

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۦ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, p1, :cond_0

    iget-object v4, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v5, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    add-int/2addr v5, v3

    array-length v6, v4

    rem-int/2addr v5, v6

    aget-object v4, v4, v5

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    sget-object v3, LYue/ۥ۟۟۠ۥ;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    invoke-static {v1, v3, p1, v0}, LYue/ۥ۟ۢ۟۟;->ۥ۟۠ۡۤ([Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iput v2, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟ۡ۟:I

    :cond_1
    return-void
.end method

.method public final ۥ۟۟ۥۡ(I)LYue/ۥۢ۠ۦۢ;
    .locals 3

    iget v0, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۦ:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge p1, v0, :cond_0

    add-int/2addr p1, v2

    iput p1, p0, LYue/ۥ۟ۡۧ۟;->size:I

    return-object v1

    :cond_0
    iget-object p1, p0, LYue/ۥ۟ۡۧ۟;->ۥ۟۟۠ۧ:LYue/ۥۣۣ۟;

    sget-object v0, LYue/ۥ۟ۡۧ۟$ۥ;->ۥ:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v2, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, LYue/ۥۣۣۡۢ;

    invoke-direct {p1}, LYue/ۥۣۣۡۢ;-><init>()V

    throw p1

    :cond_2
    sget-object v1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    goto :goto_0

    :cond_3
    sget-object v1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۟:LYue/ۥۢ۠ۦۢ;

    :goto_0
    return-object v1
.end method
