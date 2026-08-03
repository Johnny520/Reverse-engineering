.class public final LYue/ۥ۟ۡۦۨ;
.super LYue/ۥ۟۟ۢۢ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۢۡ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۡۦۨ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e2\u06e2<",
        "TE;>;",
        "LYue/\u06e5\u06df\u06e3\u06e2\u06e1<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nArrayBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayBroadcastChannel.kt\nkotlinx/coroutines/channels/ArrayBroadcastChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,385:1\n1#2:386\n17#3:387\n17#3:388\n17#3:389\n*S KotlinDebug\n*F\n+ 1 ArrayBroadcastChannel.kt\nkotlinx/coroutines/channels/ArrayBroadcastChannel\n*L\n100#1:387\n117#1:388\n152#1:389\n*E\n"
.end annotation


# instance fields
.field private volatile synthetic _head:J
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic _size:I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private volatile synthetic _tail:J
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:I

.field public final ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۨ:[Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟ۡ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e1\u06e6\u06e8$\u06e5<",
            "TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYue/ۥ۟۟ۢۢ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    iput p1, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۦ:I

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۨ:[Ljava/lang/Object;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LYue/ۥ۟ۡۦۨ;->_head:J

    iput-wide v0, p0, LYue/ۥ۟ۡۦۨ;->_tail:J

    const/4 p1, 0x0

    iput p1, p0, LYue/ۥ۟ۡۦۨ;->_size:I

    invoke-static {}, LYue/ۥ۟ۦۥۦ;->ۥ۟۟۟()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۡ:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ArrayBroadcastChannel capacity must be at least 1, but "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " was specified"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic ۥۣ۟۟(LYue/ۥ۟ۡۦۨ;J)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۡۦۨ;->ۥۣۣ۟۟(J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥۣ۟۟۟(LYue/ۥ۟ۡۦۨ;)J
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۨ()J

    move-result-wide v0

    return-wide v0
.end method

.method private final ۥۣ۟۟ۦ()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۡۦۨ;->_size:I

    return v0
.end method

.method public static synthetic ۥۣ۟۟ۧ()V
    .locals 0

    return-void
.end method

.method public static synthetic ۥ۟۟ۤۢ(LYue/ۥ۟ۡۦۨ;LYue/ۥ۟ۡۦۨ$ۥ;LYue/ۥ۟ۡۦۨ$ۥ;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤۡ(LYue/ۥ۟ۡۦۨ$ۥ;LYue/ۥ۟ۡۦۨ$ۥ;)V

    return-void
.end method


# virtual methods
.method public synthetic ۥ۟۟(Ljava/lang/Throwable;)Z
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟۠(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟۠(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public ۥ۟۟۠ۡ()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(buffer:capacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۨ:[Ljava/lang/Object;

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۦ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-super {p0, p1}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۡ()V

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟ۡۥ()LYue/ۥۡۦۡۡ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۡۦۨ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۦۨ$ۥ;-><init>(LYue/ۥ۟ۡۦۨ;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤۢ(LYue/ۥ۟ۡۦۨ;LYue/ۥ۟ۡۦۨ$ۥ;LYue/ۥ۟ۡۦۨ$ۥ;ILjava/lang/Object;)V

    return-object v0
.end method

.method public ۥ۟۟ۡۦ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۡۧ()Z
    .locals 2

    invoke-direct {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۦ()I

    move-result v0

    iget v1, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۦ:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۢ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠ۥ()LYue/ۥ۟ۥ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v1

    :cond_0
    :try_start_1
    invoke-direct {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۦ()I

    move-result v1

    iget v2, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۦ:I

    if-lt v1, v2, :cond_1

    sget-object p1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۟:LYue/ۥۢ۠ۦۢ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_2
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۨ()J

    move-result-wide v2

    iget-object v4, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۨ:[Ljava/lang/Object;

    iget v5, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۦ:I

    int-to-long v5, v5

    rem-long v5, v2, v5

    long-to-int v5, v5

    aput-object p1, v4, v5

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤ۟(I)V

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    invoke-virtual {p0, v2, v3}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤ۠(J)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۡ()V

    sget-object p1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    return-object p1

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public ۥ۟۟ۢۢ(Ljava/lang/Object;LYue/ۥۡۨ;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۠ۥ()LYue/ۥ۟ۥ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v1

    :cond_0
    :try_start_1
    invoke-direct {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۦ()I

    move-result v1

    iget v2, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۦ:I

    if-lt v1, v2, :cond_1

    sget-object p1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۟:LYue/ۥۢ۠ۦۢ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_2
    invoke-interface {p2}, LYue/ۥۡۨ;->ۥ۟۟۠ۧ()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :cond_2
    :try_start_3
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۨ()J

    move-result-wide v2

    iget-object p2, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۨ:[Ljava/lang/Object;

    iget v4, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۦ:I

    int-to-long v4, v4

    rem-long v4, v2, v4

    long-to-int v4, v4

    aput-object p1, p2, v4

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤ۟(I)V

    const-wide/16 p1, 0x1

    add-long/2addr v2, p1

    invoke-virtual {p0, v2, v3}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤ۠(J)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۡ()V

    sget-object p1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    return-object p1

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final ۥۣ۟۟۠(Ljava/lang/Throwable;)Z
    .locals 3

    invoke-virtual {p0, p1}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    move-result v0

    iget-object v1, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۡ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۟ۡۦۨ$ۥ;

    invoke-virtual {v2, p1}, LYue/ۥ۟۟۠ۤ;->ۥۣ۟۟ۢ(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final ۥۣ۟۟ۡ()V
    .locals 4

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۡ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    move v2, v1

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۟ۡۦۨ$ۥ;

    invoke-virtual {v2}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥ۟()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v2, v3

    goto :goto_1

    :cond_1
    if-nez v1, :cond_2

    if-nez v2, :cond_3

    :cond_2
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p0, v1, v1, v0, v1}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤۢ(LYue/ۥ۟ۡۦۨ;LYue/ۥ۟ۡۦۨ$ۥ;LYue/ۥ۟ۡۦۨ$ۥ;ILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public final ۥۣ۟۟ۢ()J
    .locals 5

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۡ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide v1, 0x7fffffffffffffffL

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۟ۡۦۨ$ۥ;

    invoke-virtual {v3}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥ۠()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LYue/ۥۡۦ۟;->ۥ۟۟ۡۡ(JJ)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public final ۥۣۣ۟۟(J)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TE;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۨ:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۦ:I

    int-to-long v1, v1

    rem-long/2addr p1, v1

    long-to-int p1, p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۥۣ۟۟ۤ()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۦ:I

    return v0
.end method

.method public final ۥۣ۟۟ۥ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥ۟ۡۦۨ;->_head:J

    return-wide v0
.end method

.method public final ۥۣ۟۟ۨ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥ۟ۡۦۨ;->_tail:J

    return-wide v0
.end method

.method public final ۥ۟۟ۤ(J)V
    .locals 0

    iput-wide p1, p0, LYue/ۥ۟ۡۦۨ;->_head:J

    return-void
.end method

.method public final ۥ۟۟ۤ۟(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۡۦۨ;->_size:I

    return-void
.end method

.method public final ۥ۟۟ۤ۠(J)V
    .locals 0

    iput-wide p1, p0, LYue/ۥ۟ۡۦۨ;->_tail:J

    return-void
.end method

.method public final ۥ۟۟ۤۡ(LYue/ۥ۟ۡۦۨ$ۥ;LYue/ۥ۟ۡۦۨ$ۥ;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e1\u06e6\u06e8$\u06e5<",
            "TE;>;",
            "LYue/\u06e5\u06df\u06e1\u06e6\u06e8$\u06e5<",
            "TE;>;)V"
        }
    .end annotation

    :goto_0
    iget-object v0, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۨ()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥۣ(J)V

    iget-object v1, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۡ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    iget-object v2, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۡ:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    if-eqz p2, :cond_1

    :try_start_1
    iget-object p1, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۡ:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۥ()J

    move-result-wide v1

    invoke-virtual {p2}, LYue/ۥ۟ۡۦۨ$ۥ;->ۥ۟۟ۥ۠()J

    move-result-wide p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p1, v1, p1

    if-eqz p1, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_1
    :try_start_2
    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۢ()J

    move-result-wide p1

    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۨ()J

    move-result-wide v1

    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۥ()J

    move-result-wide v3

    invoke-static {p1, p2, v1, v2}, LYue/ۥۡۦ۟;->ۥ۟۟ۡۡ(JJ)J

    move-result-wide p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    cmp-long v5, p1, v3

    if-gtz v5, :cond_2

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_2
    :try_start_3
    invoke-direct {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۦ()I

    move-result v5

    :goto_1
    cmp-long v6, v3, p1

    if-gez v6, :cond_7

    iget-object v6, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۨ:[Ljava/lang/Object;

    iget v7, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۦ:I

    int-to-long v8, v7

    rem-long v8, v3, v8

    long-to-int v8, v8

    const/4 v9, 0x0

    aput-object v9, v6, v8

    if-lt v5, v7, :cond_3

    const/4 v6, 0x1

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    :goto_2
    const-wide/16 v7, 0x1

    add-long/2addr v3, v7

    invoke-virtual {p0, v3, v4}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤ(J)V

    add-int/lit8 v10, v5, -0x1

    invoke-virtual {p0, v10}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤ۟(I)V

    if-eqz v6, :cond_6

    :cond_4
    invoke-virtual {p0}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟ۢۨ()LYue/ۥۡۨ۠ۦ;

    move-result-object v6

    if-nez v6, :cond_5

    goto :goto_3

    :cond_5
    instance-of v11, v6, LYue/ۥ۟ۥ;

    if-nez v11, :cond_6

    invoke-static {v6}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v6, v9}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۧ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)LYue/ۥۢ۠ۦۢ;

    move-result-object v11

    if-eqz v11, :cond_4

    iget-object p1, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۨ:[Ljava/lang/Object;

    iget p2, p0, LYue/ۥ۟ۡۦۨ;->ۥ۟۟۠ۦ:I

    int-to-long v3, p2

    rem-long v3, v1, v3

    long-to-int p2, v3

    invoke-virtual {v6}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۥ()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, p1, p2

    invoke-virtual {p0, v5}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤ۟(I)V

    add-long/2addr v1, v7

    invoke-virtual {p0, v1, v2}, LYue/ۥ۟ۡۦۨ;->ۥ۟۟ۤ۠(J)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual {v6}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۤ()V

    invoke-virtual {p0}, LYue/ۥ۟ۡۦۨ;->ۥۣ۟۟ۡ()V

    move-object p1, v9

    move-object p2, p1

    goto/16 :goto_0

    :cond_6
    :goto_3
    move v5, v10

    goto :goto_1

    :cond_7
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_4
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
