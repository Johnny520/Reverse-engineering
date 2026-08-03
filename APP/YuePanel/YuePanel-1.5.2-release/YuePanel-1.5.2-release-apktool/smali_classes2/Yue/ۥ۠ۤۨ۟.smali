.class public final LYue/ۥ۠ۤۨ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۤۨ۟$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟ۡ:LYue/ۥ۠ۤۨ۟$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟ۡ۟:Ljava/util/logging/Logger;


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Z

.field public final ۥ۟۟۠ۥ:LYue/ۥۣ۟ۢۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۦ:I

.field public ۥ۟۟۠ۧ:Z

.field public final ۥ۟۟۠ۨ:LYue/ۥ۠ۤۧ$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۠ۤۨ۟$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۤۨ۟$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟ۡ:LYue/ۥ۠ۤۨ۟$ۥ;

    const-class v0, LYue/ۥ۠ۤۧۥ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟ۡ۟:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۣ۟۟;Z)V
    .locals 7
    .param p1    # LYue/ۥۣۣ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    iput-boolean p2, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۤ:Z

    new-instance v4, LYue/ۥۣ۟ۢۨ;

    invoke-direct {v4}, LYue/ۥۣ۟ۢۨ;-><init>()V

    iput-object v4, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۢۨ;

    const/16 p1, 0x4000

    iput p1, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۦ:I

    new-instance p1, LYue/ۥ۠ۤۧ$ۥ۟;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, LYue/ۥ۠ۤۧ$ۥ۟;-><init>(IZLYue/ۥۣ۟ۢۨ;ILYue/ۥ۟ۨۥۢ;)V

    iput-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۤۧ$ۥ۟;

    return-void
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {v0}, LYue/ۥۣۢ۟ۡ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {v0}, LYue/ۥۣۣ۟۟;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ۥ۟(LYue/ۥۡۨۥۦ;)V
    .locals 2
    .param p1    # LYue/ۥۡۨۥۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "peerSettings"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_1

    iget v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۦ:I

    invoke-virtual {p1, v0}, LYue/ۥۡۨۥۦ;->ۥ۟۟۟ۡ(I)I

    move-result v0

    iput v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۦ:I

    invoke-virtual {p1}, LYue/ۥۡۨۥۦ;->ۥ۟۟۟()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۤۧ$ۥ۟;

    invoke-virtual {p1}, LYue/ۥۡۨۥۦ;->ۥ۟۟۟()I

    move-result p1

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۧ$ۥ۟;->ۥ۟۟۟۟(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v1, p1, v0}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۟ۢ(IIII)V

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {p1}, LYue/ۥۣۣ۟۟;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۥ۟۟()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۤ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget-object v0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟ۡ۟:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ">> CONNECTION "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, LYue/ۥ۠ۤۧۥ;->ۥ۟:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {v2}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟۠ۨ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠ۨ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    sget-object v1, LYue/ۥ۠ۤۧۥ;->ۥ۟:LYue/ۥۣ۟ۥۤ;

    invoke-interface {v0, v1}, LYue/ۥۣۣ۟۟;->ۥ۟۟ۦۣ(LYue/ۥۣ۟ۥۤ;)LYue/ۥۣۣ۟۟;

    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {v0}, LYue/ۥۣۣ۟۟;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ۥ۟۟۟(ZILYue/ۥۣ۟ۢۨ;I)V
    .locals 1
    .param p3    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p2, p1, p3, p4}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۟۟(IILYue/ۥۣ۟ۢۨ;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۥ۟۟۟۟(IILYue/ۥۣ۟ۢۨ;I)V
    .locals 2
    .param p3    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p4, v0, p2}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۟ۢ(IIII)V

    if-lez p4, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-static {p3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    int-to-long v0, p4

    invoke-interface {p1, p3, v0, v1}, LYue/ۥۣۢ۟ۡ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۟ۢ(IIII)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟ۡ۟:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v2, LYue/ۥ۠ۤۧۥ;->ۥ:LYue/ۥ۠ۤۧۥ;

    const/4 v3, 0x0

    move v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    invoke-virtual/range {v2 .. v7}, LYue/ۥ۠ۤۧۥ;->ۥ۟۟(ZIIII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۦ:I

    if-gt p2, v0, :cond_2

    const/high16 v0, -0x80000000

    and-int/2addr v0, p1

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-static {v0, p2}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۤۧ(LYue/ۥۣۣ۟۟;I)V

    iget-object p2, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    and-int/lit16 p3, p3, 0xff

    invoke-interface {p2, p3}, LYue/ۥۣۣ۟۟;->writeByte(I)LYue/ۥۣۣ۟۟;

    iget-object p2, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    and-int/lit16 p3, p4, 0xff

    invoke-interface {p2, p3}, LYue/ۥۣۣ۟۟;->writeByte(I)LYue/ۥۣۣ۟۟;

    iget-object p2, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    const p3, 0x7fffffff

    and-int/2addr p1, p3

    invoke-interface {p2, p1}, LYue/ۥۣۣ۟۟;->writeInt(I)LYue/ۥۣۣ۟۟;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "reserved bit set: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "FRAME_SIZE_ERROR length > "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۦ:I

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ": "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ۥ۟۟۟ۤ()LYue/ۥ۠ۤۧ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۤۧ$ۥ۟;

    return-object v0
.end method

.method public final declared-synchronized ۥ۟۟۟ۨ(ILYue/ۥ۠ۡ۠ۢ;[B)V
    .locals 3
    .param p2    # LYue/ۥ۠ۡ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "errorCode"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugData"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_3

    invoke-virtual {p2}, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟۟()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    array-length v0, p3

    add-int/lit8 v0, v0, 0x8

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1, v2}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۟ۢ(IIII)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {v0, p1}, LYue/ۥۣۣ۟۟;->writeInt(I)LYue/ۥۣۣ۟۟;

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-virtual {p2}, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟۟()I

    move-result p2

    invoke-interface {p1, p2}, LYue/ۥۣۣ۟۟;->writeInt(I)LYue/ۥۣۣ۟۟;

    array-length p1, p3

    const/4 p2, 0x1

    if-nez p1, :cond_0

    move v2, p2

    :cond_0
    xor-int/lit8 p1, v2, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {p1, p3}, LYue/ۥۣۣ۟۟;->write([B)LYue/ۥۣۣ۟۟;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {p1}, LYue/ۥۣۣ۟۟;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    const-string p1, "errorCode.httpCode == -1"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۥ۟۟۠(ZILjava/util/List;)V
    .locals 6
    .param p3    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e4\u06e2\u06e1;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "headerBlock"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_3

    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۤۧ$ۥ۟;

    invoke-virtual {v0, p3}, LYue/ۥ۠ۤۧ$ۥ۟;->ۥ۟۟۟ۡ(Ljava/util/List;)V

    iget-object p3, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    iget p3, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۦ:I

    int-to-long v2, p3

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    cmp-long p3, v0, v2

    if-nez p3, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz p1, :cond_1

    or-int/lit8 v4, v4, 0x1

    :cond_1
    long-to-int p1, v2

    const/4 v5, 0x1

    invoke-virtual {p0, p2, p1, v5, v4}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۟ۢ(IIII)V

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    iget-object v4, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۢۨ;

    invoke-interface {p1, v4, v2, v3}, LYue/ۥۣۢ۟ۡ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    if-lez p3, :cond_2

    sub-long/2addr v0, v2

    invoke-virtual {p0, p2, v0, v1}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟ۡۦ(IJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    :cond_3
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۥ۟۟۠ۡ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۦ:I

    return v0
.end method

.method public final declared-synchronized ۥ۟۟۠ۦ(ZII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/16 v1, 0x8

    const/4 v2, 0x6

    invoke-virtual {p0, v0, v1, v2, p1}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۟ۢ(IIII)V

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {p1, p2}, LYue/ۥۣۣ۟۟;->writeInt(I)LYue/ۥۣۣ۟۟;

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {p1, p3}, LYue/ۥۣۣ۟۟;->writeInt(I)LYue/ۥۣۣ۟۟;

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {p1}, LYue/ۥۣۣ۟۟;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۥ۟۟۠ۨ(IILjava/util/List;)V
    .locals 7
    .param p3    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e4\u06e2\u06e1;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "requestHeaders"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۤۧ$ۥ۟;

    invoke-virtual {v0, p3}, LYue/ۥ۠ۤۧ$ۥ۟;->ۥ۟۟۟ۡ(Ljava/util/List;)V

    iget-object p3, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    iget p3, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۦ:I

    int-to-long v2, p3

    const-wide/16 v4, 0x4

    sub-long/2addr v2, v4

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    add-int/lit8 v2, p3, 0x4

    int-to-long v3, p3

    cmp-long p3, v0, v3

    if-nez p3, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x5

    invoke-virtual {p0, p1, v2, v6, v5}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۟ۢ(IIII)V

    iget-object v2, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    const v5, 0x7fffffff

    and-int/2addr p2, v5

    invoke-interface {v2, p2}, LYue/ۥۣۣ۟۟;->writeInt(I)LYue/ۥۣۣ۟۟;

    iget-object p2, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    iget-object v2, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۢۨ;

    invoke-interface {p2, v2, v3, v4}, LYue/ۥۣۢ۟ۡ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    if-lez p3, :cond_1

    sub-long/2addr v0, v3

    invoke-virtual {p0, p1, v0, v1}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟ۡۦ(IJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۥ۟۟ۡ(ILYue/ۥ۠ۡ۠ۢ;)V
    .locals 3
    .param p2    # LYue/ۥ۠ۡ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "errorCode"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_1

    invoke-virtual {p2}, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟۟()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {p0, p1, v2, v0, v1}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۟ۢ(IIII)V

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-virtual {p2}, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟۟()I

    move-result p2

    invoke-interface {p1, p2}, LYue/ۥۣۣ۟۟;->writeInt(I)LYue/ۥۣۣ۟۟;

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {p1}, LYue/ۥۣۣ۟۟;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "Failed requirement."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۥ۟۟ۡ۠(LYue/ۥۡۨۥۦ;)V
    .locals 4
    .param p1    # LYue/ۥۡۨۥۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "settings"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_4

    invoke-virtual {p1}, LYue/ۥۡۨۥۦ;->ۥ۟۟۟ۦ()I

    move-result v0

    mul-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1, v2}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۟ۢ(IIII)V

    :goto_0
    const/16 v0, 0xa

    if-ge v2, v0, :cond_3

    invoke-virtual {p1, v2}, LYue/ۥۡۨۥۦ;->ۥۣ۟۟۟(I)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eq v2, v1, :cond_1

    const/4 v0, 0x7

    if-eq v2, v0, :cond_0

    move v0, v2

    goto :goto_1

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    const/4 v0, 0x3

    :goto_1
    iget-object v3, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {v3, v0}, LYue/ۥۣۣ۟۟;->writeShort(I)LYue/ۥۣۣ۟۟;

    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-virtual {p1, v2}, LYue/ۥۡۨۥۦ;->ۥ۟(I)I

    move-result v3

    invoke-interface {v0, v3}, LYue/ۥۣۣ۟۟;->writeInt(I)LYue/ۥۣۣ۟۟;

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {p1}, LYue/ۥۣۣ۟۟;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۥ۟۟ۡۡ(IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p2, v0

    if-gtz v0, :cond_0

    const/16 v0, 0x8

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {p0, p1, v2, v0, v1}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۟ۢ(IIII)V

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    long-to-int p2, p2

    invoke-interface {p1, p2}, LYue/ۥۣۣ۟۟;->writeInt(I)LYue/ۥۣۣ۟۟;

    iget-object p1, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {p1}, LYue/ۥۣۣ۟۟;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۥ۟۟ۡۦ(IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_1

    iget v2, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۦ:I

    int-to-long v2, v2

    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    sub-long/2addr p2, v2

    long-to-int v4, v2

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    const/16 v1, 0x9

    invoke-virtual {p0, p1, v4, v1, v0}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۟ۢ(IIII)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۟;

    iget-object v1, p0, LYue/ۥ۠ۤۨ۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۢۨ;

    invoke-interface {v0, v1, v2, v3}, LYue/ۥۣۢ۟ۡ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    goto :goto_0

    :cond_1
    return-void
.end method
