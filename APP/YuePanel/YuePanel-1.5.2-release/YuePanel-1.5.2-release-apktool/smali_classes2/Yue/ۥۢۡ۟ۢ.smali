.class public final LYue/ۥۢۡ۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Util.kt\nokhttp3/internal/Util\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n608#2,4:315\n608#2,4:319\n615#2,4:323\n608#2,4:327\n608#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n79#1:315,4\n97#1:319,4\n108#1:323,4\n126#1:327,4\n152#1:331,4\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۡ۟ۢ$ۥ;,
        LYue/ۥۢۡ۟ۢ$ۥ۟;,
        LYue/ۥۢۡ۟ۢ$ۥ۟۟;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Util.kt\nokhttp3/internal/Util\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n608#2,4:315\n608#2,4:319\n615#2,4:323\n608#2,4:327\n608#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n79#1:315,4\n97#1:319,4\n108#1:323,4\n126#1:327,4\n152#1:331,4\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟۟ۢ:LYue/ۥۢۡ۟ۢ$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥۣ۟۟۟:LYue/ۥۢۡ۟ۢ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۤ:Ljava/util/logging/Logger;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:LYue/ۥۢۡ۟ۢ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟:I

.field public ۥ۟۟:Z

.field public ۥ۟۟۟:J

.field public final ۥ۟۟۟۟:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e1\u06df\u06e1;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟۠:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e1\u06df\u06e1;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟ۡ:Ljava/lang/Runnable;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LYue/ۥۢۡ۟ۢ$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۢۡ۟ۢ$ۥ۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ:LYue/ۥۢۡ۟ۢ$ۥ۟;

    new-instance v0, LYue/ۥۢۡ۟ۢ;

    new-instance v1, LYue/ۥۢۡ۟ۢ$ۥ۟۟;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, LYue/ۥۣۢۥ۟;->ۥۣ۟۟۟:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " TaskRunner"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, LYue/ۥۣۢۥ۟;->ۥۣ۟۟ۡ(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v2

    invoke-direct {v1, v2}, LYue/ۥۢۡ۟ۢ$ۥ۟۟;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    invoke-direct {v0, v1}, LYue/ۥۢۡ۟ۢ;-><init>(LYue/ۥۢۡ۟ۢ$ۥ;)V

    sput-object v0, LYue/ۥۢۡ۟ۢ;->ۥۣ۟۟۟:LYue/ۥۢۡ۟ۢ;

    const-class v0, LYue/ۥۢۡ۟ۢ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    const-string v1, "getLogger(TaskRunner::class.java.name)"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۤ:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۡ۟ۢ$ۥ;)V
    .locals 1
    .param p1    # LYue/ۥۢۡ۟ۢ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "backend"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۡ۟ۢ;->ۥ:LYue/ۥۢۡ۟ۢ$ۥ;

    const/16 p1, 0x2710

    iput p1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۟:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    new-instance p1, LYue/ۥۢۡ۟ۢ$ۥ۟۟۟;

    invoke-direct {p1, p0}, LYue/ۥۢۡ۟ۢ$ۥ۟۟۟;-><init>(LYue/ۥۢۡ۟ۢ;)V

    iput-object p1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۡ:Ljava/lang/Runnable;

    return-void
.end method

.method public static final synthetic ۥ()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۤ:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static final synthetic ۥ۟(LYue/ۥۢۡ۟ۢ;LYue/ۥۢ۠ۨۦ;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۥ(LYue/ۥۢ۠ۨۦ;)V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟()Ljava/util/List;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e1\u06df\u06e1;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۟:Ljava/util/List;

    iget-object v1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-static {v0, v1}, LYue/ۥ۟ۥۢ۠;->ۥ۟ۡۤۥ(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final ۥ۟۟۟(LYue/ۥۢ۠ۨۦ;J)V
    .locals 4

    sget-boolean v0, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " MUST hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, LYue/ۥۢ۠ۨۦ;->ۥ۟۟۟()LYue/ۥۢۡ۟ۡ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟()LYue/ۥۢ۠ۨۦ;

    move-result-object v1

    if-ne v1, p1, :cond_4

    invoke-virtual {v0}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۠()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۠ۢ(Z)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۠ۡ(LYue/ۥۢ۠ۨۦ;)V

    iget-object v2, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const-wide/16 v2, -0x1

    cmp-long v2, p2, v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {v0}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۤ()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0, p1, p2, p3, v3}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۠۠(LYue/ۥۢ۠ۨۦ;JZ)Z

    :cond_2
    invoke-virtual {v0}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۡ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v3

    if-eqz p1, :cond_3

    iget-object p1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟۟()LYue/ۥۢ۠ۨۦ;
    .locals 14
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    sget-boolean v0, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    return-object v1

    :cond_2
    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ:LYue/ۥۢۡ۟ۢ$ۥ;

    invoke-interface {v0}, LYue/ۥۢۡ۟ۢ$ۥ;->ۥ۟۟()J

    move-result-wide v2

    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide v4, 0x7fffffffffffffffL

    move-object v6, v1

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v7, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LYue/ۥۢۡ۟ۡ;

    invoke-virtual {v7}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۡ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LYue/ۥۢ۠ۨۦ;

    invoke-virtual {v7}, LYue/ۥۢ۠ۨۦ;->ۥ۟۟()J

    move-result-wide v10

    sub-long/2addr v10, v2

    const-wide/16 v12, 0x0

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    cmp-long v12, v10, v12

    if-lez v12, :cond_3

    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    goto :goto_1

    :cond_3
    if-eqz v6, :cond_4

    move v0, v8

    goto :goto_2

    :cond_4
    move-object v6, v7

    goto :goto_1

    :cond_5
    move v0, v9

    :goto_2
    if-eqz v6, :cond_8

    invoke-virtual {p0, v6}, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠(LYue/ۥۢ۠ۨۦ;)V

    if-nez v0, :cond_6

    iget-boolean v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟:Z

    if-nez v0, :cond_7

    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v8

    if-eqz v0, :cond_7

    :cond_6
    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ:LYue/ۥۢۡ۟ۢ$ۥ;

    iget-object v1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۡ:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, LYue/ۥۢۡ۟ۢ$ۥ;->execute(Ljava/lang/Runnable;)V

    :cond_7
    return-object v6

    :cond_8
    iget-boolean v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟:Z

    if-eqz v0, :cond_a

    iget-wide v6, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟:J

    sub-long/2addr v6, v2

    cmp-long v0, v4, v6

    if-gez v0, :cond_9

    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ:LYue/ۥۢۡ۟ۢ$ۥ;

    invoke-interface {v0, p0}, LYue/ۥۢۡ۟ۢ$ۥ;->ۥ۟(LYue/ۥۢۡ۟ۢ;)V

    :cond_9
    return-object v1

    :cond_a
    iput-boolean v8, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟:Z

    add-long/2addr v2, v4

    iput-wide v2, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟:J

    :try_start_0
    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ:LYue/ۥۢۡ۟ۢ$ۥ;

    invoke-interface {v0, p0, v4, v5}, LYue/ۥۢۡ۟ۢ$ۥ;->ۥ(LYue/ۥۢۡ۟ۢ;J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    iput-boolean v9, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟:Z

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :catch_0
    :try_start_1
    invoke-virtual {p0}, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۡ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_4
    iput-boolean v9, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟:Z

    throw v0
.end method

.method public final ۥ۟۟۟۠(LYue/ۥۢ۠ۨۦ;)V
    .locals 2

    sget-boolean v0, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    const-wide/16 v0, -0x1

    invoke-virtual {p1, v0, v1}, LYue/ۥۢ۠ۨۦ;->ۥ۟۟۟ۡ(J)V

    invoke-virtual {p1}, LYue/ۥۢ۠ۨۦ;->ۥ۟۟۟()LYue/ۥۢۡ۟ۡ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۡ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0, p1}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۠ۡ(LYue/ۥۢ۠ۨۦ;)V

    iget-object p1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۥ۟۟۟ۡ()V
    .locals 3

    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    iget-object v1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۡ۟ۡ;

    invoke-virtual {v1}, LYue/ۥۢۡ۟ۡ;->ۥ۟()Z

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ge v1, v0, :cond_2

    iget-object v2, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۡ۟ۡ;

    invoke-virtual {v2}, LYue/ۥۢۡ۟ۡ;->ۥ۟()Z

    invoke-virtual {v2}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۡ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥۢۡ۟ۢ$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ:LYue/ۥۢۡ۟ۢ$ۥ;

    return-object v0
.end method

.method public final ۥۣ۟۟۟(LYue/ۥۢۡ۟ۡ;)V
    .locals 2
    .param p1    # LYue/ۥۢۡ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "taskQueue"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟۟()LYue/ۥۢ۠ۨۦ;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۡ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-static {v0, p1}, LYue/ۥۣۢۥ۟;->ۥ۟۟(Ljava/util/List;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    iget-boolean p1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, LYue/ۥۢۡ۟ۢ;->ۥ:LYue/ۥۢۡ۟ۢ$ۥ;

    invoke-interface {p1, p0}, LYue/ۥۢۡ۟ۢ$ۥ;->ۥ۟(LYue/ۥۢۡ۟ۢ;)V

    goto :goto_2

    :cond_4
    iget-object p1, p0, LYue/ۥۢۡ۟ۢ;->ۥ:LYue/ۥۢۡ۟ۢ$ۥ;

    iget-object v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۡ:Ljava/lang/Runnable;

    invoke-interface {p1, v0}, LYue/ۥۢۡ۟ۢ$ۥ;->execute(Ljava/lang/Runnable;)V

    :goto_2
    return-void
.end method

.method public final ۥ۟۟۟ۤ()LYue/ۥۢۡ۟ۡ;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget v0, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, LYue/ۥۢۡ۟ۢ;->ۥ۟:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    new-instance v1, LYue/ۥۢۡ۟ۡ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v3, 0x51

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p0, v0}, LYue/ۥۢۡ۟ۡ;-><init>(LYue/ۥۢۡ۟ۢ;Ljava/lang/String;)V

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final ۥ۟۟۟ۥ(LYue/ۥۢ۠ۨۦ;)V
    .locals 5

    sget-boolean v0, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۢ۠ۨۦ;->ۥ۟()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, LYue/ۥۢ۠ۨۦ;->ۥ۟۟۟۠()J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0, p1, v2, v3}, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟(LYue/ۥۢ۠ۨۦ;J)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :catchall_1
    move-exception v2

    monitor-enter p0

    const-wide/16 v3, -0x1

    :try_start_2
    invoke-virtual {p0, p1, v3, v4}, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟(LYue/ۥۢ۠ۨۦ;J)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit p0

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v2

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1
.end method
