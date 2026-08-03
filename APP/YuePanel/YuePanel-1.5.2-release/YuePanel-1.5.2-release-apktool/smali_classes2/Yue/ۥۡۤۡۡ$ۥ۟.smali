.class public final LYue/ۥۡۤۡۡ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۦ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$source$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۤۡۡ;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$source$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۡۤۡۡ;


# direct methods
.method public constructor <init>(LYue/ۥۡۤۡۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۤۡۡ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۤۡۡ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, LYue/ۥۢۡۤۧ;

    invoke-direct {p1}, LYue/ۥۢۡۤۧ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۤۡۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    iget-object v0, p0, LYue/ۥۡۤۡۡ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۤۡۡ;

    invoke-virtual {v0}, LYue/ۥۡۤۡۡ;->ۥ۟۟۟ۤ()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۤۡۡ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۤۡۡ;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v1, v2}, LYue/ۥۡۤۡۡ;->ۥ۟۟۠۠(Z)V

    invoke-virtual {v1}, LYue/ۥۡۤۡۡ;->ۥ۟۟۟ۢ()Ljava/util/concurrent/locks/Condition;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signalAll()V

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤۡۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;

    return-object v0
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 8
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۤۡۡ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۤۡۡ;

    invoke-virtual {v0}, LYue/ۥۡۤۡۡ;->ۥ۟۟۟ۤ()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۤۡۡ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۤۡۡ;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {v1}, LYue/ۥۡۤۡۡ;->ۥ۟۟۟ۧ()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_4

    invoke-virtual {v1}, LYue/ۥۡۤۡۡ;->ۥ۟۟۟ۡ()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "canceled"

    if-nez v2, :cond_3

    :goto_0
    :try_start_1
    invoke-virtual {v1}, LYue/ۥۡۤۡۡ;->ۥ۟۟۟۠()LYue/ۥۣ۟ۢۨ;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-nez v2, :cond_2

    invoke-virtual {v1}, LYue/ۥۡۤۡۡ;->ۥ۟۟۟ۦ()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    :try_start_2
    iget-object v2, p0, LYue/ۥۡۤۡۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;

    invoke-virtual {v1}, LYue/ۥۡۤۡۡ;->ۥ۟۟۟ۢ()Ljava/util/concurrent/locks/Condition;

    move-result-object v4

    invoke-virtual {v2, v4}, LYue/ۥۢۡۤۧ;->ۥ(Ljava/util/concurrent/locks/Condition;)V

    invoke-virtual {v1}, LYue/ۥۡۤۡۡ;->ۥ۟۟۟ۡ()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, LYue/ۥۡۤۡۡ;->ۥ۟۟۟۠()LYue/ۥۣ۟ۢۨ;

    move-result-object v2

    invoke-virtual {v2, p1, p2, p3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide p1

    invoke-virtual {v1}, LYue/ۥۡۤۡۡ;->ۥ۟۟۟ۢ()Ljava/util/concurrent/locks/Condition;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-wide p1

    :cond_3
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string p1, "closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
