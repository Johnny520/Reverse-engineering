.class public abstract LYue/ۥ۠ۡۧۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n62#4:454\n62#4:455\n62#4:456\n51#5:458\n86#6:460\n86#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۡۧۧ$ۥ;,
        LYue/ۥ۠ۡۧۧ$ۥ۟;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n62#4:454\n62#4:455\n62#4:456\n51#5:458\n86#6:460\n86#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Z

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:I

.field public final ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LYue/ۥ۠ۡۧۧ;->ۥۣ۟۟۠:Z

    invoke-static {}, LYue/ۥۢۦۤ۟;->ۥ۟()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method public static final synthetic ۥ۟(LYue/ۥ۠ۡۧۧ;)Z
    .locals 0

    iget-boolean p0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z

    return p0
.end method

.method public static final synthetic ۥ۟۟(LYue/ۥ۠ۡۧۧ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۥ:I

    return p0
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥ۠ۡۧۧ;JLYue/ۥۣ۟ۢۨ;J)J
    .locals 0

    invoke-virtual/range {p0 .. p5}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۢۧ(JLYue/ۥۣ۟ۢۨ;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic ۥ۟۟۟۟(LYue/ۥ۠ۡۧۧ;I)V
    .locals 0

    iput p1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۥ:I

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۢ(LYue/ۥ۠ۡۧۧ;JLYue/ۥۣ۟ۢۨ;J)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۥۡ(JLYue/ۥۣ۟ۢۨ;J)V

    return-void
.end method

.method public static synthetic ۥ۟۟ۤۢ(LYue/ۥ۠ۡۧۧ;JILjava/lang/Object;)LYue/ۥۣۢ۟ۡ;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۧۧ;->ۥۣ۟۟ۤ(J)LYue/ۥۣۢ۟ۡ;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: sink"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟۟ۤۦ(LYue/ۥ۠ۡۧۧ;JILjava/lang/Object;)LYue/ۥۣۢ۟ۦ;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۤۥ(J)LYue/ۥۣۢ۟ۦ;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: source"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    iput-boolean v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z

    iget v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۥ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_1
    :try_start_2
    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual {p0}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۨ()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public final flush()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۠ۡۧۧ;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual {p0}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۡ()V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string v1, "closed"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "file handle is read-only"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟ۤ()LYue/ۥۣۢ۟ۡ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۤۤ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۡۧۧ;->ۥۣ۟۟ۤ(J)LYue/ۥۣۢ۟ۡ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟ۨ()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method public final ۥ۟۟۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠ۡۧۧ;->ۥۣ۟۟۠:Z

    return v0
.end method

.method public final ۥ۟۟۠ۡ(LYue/ۥۣۢ۟ۡ;)J
    .locals 4
    .param p1    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LYue/ۥۡۦ۠ۢ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥۡۦ۠ۢ;

    iget-object v0, p1, LYue/ۥۡۦ۠ۢ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    iget-object p1, p1, LYue/ۥۡۦ۠ۢ;->ۥۣ۟۟۠:LYue/ۥۣۢ۟ۡ;

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    instance-of v2, p1, LYue/ۥ۠ۡۧۧ$ۥ;

    if-eqz v2, :cond_2

    move-object v2, p1

    check-cast v2, LYue/ۥ۠ۡۧۧ$ۥ;

    invoke-virtual {v2}, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟()LYue/ۥ۠ۡۧۧ;

    move-result-object v2

    if-ne v2, p0, :cond_2

    check-cast p1, LYue/ۥ۠ۡۧۧ$ۥ;

    invoke-virtual {p1}, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {p1}, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۟()J

    move-result-wide v2

    add-long/2addr v2, v0

    return-wide v2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "sink was not created by this FileHandle"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۣۢ۟ۦ;)J
    .locals 4
    .param p1    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LYue/ۥۡۦۣ۠;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥۡۦۣ۠;

    iget-object v0, p1, LYue/ۥۡۦۣ۠;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    iget-object p1, p1, LYue/ۥۡۦۣ۠;->ۥۣ۟۟۠:LYue/ۥۣۢ۟ۦ;

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    instance-of v2, p1, LYue/ۥ۠ۡۧۧ$ۥ۟;

    if-eqz v2, :cond_2

    move-object v2, p1

    check-cast v2, LYue/ۥ۠ۡۧۧ$ۥ۟;

    invoke-virtual {v2}, LYue/ۥ۠ۡۧۧ$ۥ۟;->ۥ۟۟()LYue/ۥ۠ۡۧۧ;

    move-result-object v2

    if-ne v2, p0, :cond_2

    check-cast p1, LYue/ۥ۠ۡۧۧ$ۥ۟;

    invoke-virtual {p1}, LYue/ۥ۠ۡۧۧ$ۥ۟;->ۥ۟()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {p1}, LYue/ۥ۠ۡۧۧ$ۥ۟;->ۥ۟۟۟()J

    move-result-wide v2

    sub-long/2addr v2, v0

    return-wide v2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "source was not created by this FileHandle"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ۥ۟۟۠ۨ()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۡ()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۡ۠(J[BII)I
    .param p3    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۡۡ(J)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۡۦ()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟ۡۧ(J[BII)V
    .param p3    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final ۥ۟۟ۢ(J[BII)I
    .locals 2
    .param p3    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "array"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual/range {p0 .. p5}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۡ۠(J[BII)I

    move-result p1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final ۥ۟۟ۢۥ(JLYue/ۥۣ۟ۢۨ;J)J
    .locals 2
    .param p3    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual/range {p0 .. p5}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۢۧ(JLYue/ۥۣ۟ۢۨ;J)J

    move-result-wide p1

    return-wide p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final ۥ۟۟ۢۧ(JLYue/ۥۣ۟ۢۨ;J)J
    .locals 14

    move-object/from16 v0, p3

    move-wide/from16 v1, p4

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_3

    add-long/2addr v1, p1

    move-wide v9, p1

    :goto_0
    cmp-long v3, v9, v1

    if-gez v3, :cond_2

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۡ(I)LYue/ۥۡۧۨ;

    move-result-object v11

    iget-object v6, v11, LYue/ۥۡۧۨ;->ۥ:[B

    iget v7, v11, LYue/ۥۡۧۨ;->ۥ۟۟:I

    sub-long v3, v1, v9

    rsub-int v5, v7, 0x2000

    int-to-long v12, v5

    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v8, v3

    move-object v3, p0

    move-wide v4, v9

    invoke-virtual/range {v3 .. v8}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۡ۠(J[BII)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    iget v1, v11, LYue/ۥۡۧۨ;->ۥ۟:I

    iget v2, v11, LYue/ۥۡۧۨ;->ۥ۟۟:I

    if-ne v1, v2, :cond_0

    invoke-virtual {v11}, LYue/ۥۡۧۨ;->ۥ۟()LYue/ۥۡۧۨ;

    move-result-object v1

    iput-object v1, v0, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v11}, LYue/ۥۡۧۨۡ;->ۥ۟۟۟(LYue/ۥۡۧۨ;)V

    :cond_0
    cmp-long v0, p1, v9

    if-nez v0, :cond_2

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_1
    iget v4, v11, LYue/ۥۡۧۨ;->ۥ۟۟:I

    add-int/2addr v4, v3

    iput v4, v11, LYue/ۥۡۧۨ;->ۥ۟۟:I

    int-to-long v3, v3

    add-long/2addr v9, v3

    invoke-virtual/range {p3 .. p3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v5

    add-long/2addr v5, v3

    invoke-virtual {v0, v5, v6}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۧۥ(J)V

    goto :goto_0

    :cond_2
    sub-long/2addr v9, p1

    return-wide v9

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "byteCount < 0: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۥ۟۟ۢۨ(LYue/ۥۣۢ۟ۡ;J)V
    .locals 4
    .param p1    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LYue/ۥۡۦ۠ۢ;

    const-string v1, "closed"

    const-string v2, "sink was not created by this FileHandle"

    if-eqz v0, :cond_2

    check-cast p1, LYue/ۥۡۦ۠ۢ;

    iget-object v0, p1, LYue/ۥۡۦ۠ۢ;->ۥۣ۟۟۠:LYue/ۥۣۢ۟ۡ;

    instance-of v3, v0, LYue/ۥ۠ۡۧۧ$ۥ;

    if-eqz v3, :cond_1

    move-object v3, v0

    check-cast v3, LYue/ۥ۠ۡۧۧ$ۥ;

    invoke-virtual {v3}, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟()LYue/ۥ۠ۡۧۧ;

    move-result-object v3

    if-ne v3, p0, :cond_1

    check-cast v0, LYue/ۥ۠ۡۧۧ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p1}, LYue/ۥۡۦ۠ۢ;->ۥ۟۟۠ۢ()LYue/ۥۣۣ۟۟;

    invoke-virtual {v0, p2, p3}, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۟ۢ(J)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    instance-of v0, p1, LYue/ۥ۠ۡۧۧ$ۥ;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۡۧۧ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟()LYue/ۥ۠ۡۧۧ;

    move-result-object v0

    if-ne v0, p0, :cond_4

    check-cast p1, LYue/ۥ۠ۡۧۧ$ۥ;

    invoke-virtual {p1}, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {p1, p2, p3}, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۟ۢ(J)V

    :goto_0
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥۣ۟۟(LYue/ۥۣۢ۟ۦ;J)V
    .locals 7
    .param p1    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LYue/ۥۡۦۣ۠;

    const-string v1, "closed"

    const-string v2, "source was not created by this FileHandle"

    if-eqz v0, :cond_3

    check-cast p1, LYue/ۥۡۦۣ۠;

    iget-object v0, p1, LYue/ۥۡۦۣ۠;->ۥۣ۟۟۠:LYue/ۥۣۢ۟ۦ;

    instance-of v3, v0, LYue/ۥ۠ۡۧۧ$ۥ۟;

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, LYue/ۥ۠ۡۧۧ$ۥ۟;

    invoke-virtual {v3}, LYue/ۥ۠ۡۧۧ$ۥ۟;->ۥ۟۟()LYue/ۥ۠ۡۧۧ;

    move-result-object v3

    if-ne v3, p0, :cond_2

    check-cast v0, LYue/ۥ۠ۡۧۧ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥ۠ۡۧۧ$ۥ۟;->ۥ۟()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    iget-object v1, p1, LYue/ۥۡۦۣ۠;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v1

    invoke-virtual {v0}, LYue/ۥ۠ۡۧۧ$ۥ۟;->ۥ۟۟۟()J

    move-result-wide v3

    sub-long/2addr v3, v1

    sub-long v3, p2, v3

    const-wide/16 v5, 0x0

    cmp-long v5, v5, v3

    if-gtz v5, :cond_0

    cmp-long v1, v3, v1

    if-gez v1, :cond_0

    invoke-virtual {p1, v3, v4}, LYue/ۥۡۦۣ۠;->skip(J)V

    goto :goto_0

    :cond_0
    iget-object p1, p1, LYue/ۥۡۦۣ۠;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟۟۟()V

    invoke-virtual {v0, p2, p3}, LYue/ۥ۠ۡۧۧ$ۥ۟;->ۥ۟۟۟ۢ(J)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    instance-of v0, p1, LYue/ۥ۠ۡۧۧ$ۥ۟;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۡۧۧ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥ۠ۡۧۧ$ۥ۟;->ۥ۟۟()LYue/ۥ۠ۡۧۧ;

    move-result-object v0

    if-ne v0, p0, :cond_5

    check-cast p1, LYue/ۥ۠ۡۧۧ$ۥ۟;

    invoke-virtual {p1}, LYue/ۥ۠ۡۧۧ$ۥ۟;->ۥ۟()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {p1, p2, p3}, LYue/ۥ۠ۡۧۧ$ۥ۟;->ۥ۟۟۟ۢ(J)V

    :goto_0
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥۣ۟۟۠(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۠ۡۧۧ;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۡۡ(J)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "file handle is read-only"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥۣ۟۟ۤ(J)LYue/ۥۣۢ۟ۡ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۠ۡۧۧ;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    iget v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۥ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۥ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    new-instance v0, LYue/ۥ۠ۡۧۧ$ۥ;

    invoke-direct {v0, p0, p1, p2}, LYue/ۥ۠ۡۧۧ$ۥ;-><init>(LYue/ۥ۠ۡۧۧ;J)V

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "file handle is read-only"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟ۤۤ()J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual {p0}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۡۦ()J

    move-result-wide v0

    return-wide v0

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string v1, "closed"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public final ۥ۟۟ۤۥ(J)LYue/ۥۣۢ۟ۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    iget v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۥ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۥ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    new-instance v0, LYue/ۥ۠ۡۧۧ$ۥ۟;

    invoke-direct {v0, p0, p1, p2}, LYue/ۥ۠ۡۧۧ$ۥ۟;-><init>(LYue/ۥ۠ۡۧۧ;J)V

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final ۥ۟۟ۤۨ(JLYue/ۥۣ۟ۢۨ;J)V
    .locals 2
    .param p3    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۠ۡۧۧ;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual/range {p0 .. p5}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۥۡ(JLYue/ۥۣ۟ۢۨ;J)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "file handle is read-only"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟ۥ۟(J[BII)V
    .locals 2
    .param p3    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "array"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۠ۡۧۧ;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۦ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-boolean v1, p0, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۤ:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    invoke-virtual/range {p0 .. p5}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۡۧ(J[BII)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "file handle is read-only"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟ۥۡ(JLYue/ۥۣ۟ۢۨ;J)V
    .locals 8

    invoke-virtual {p3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    move-wide v4, p4

    invoke-static/range {v0 .. v5}, LYue/ۥ۟۟۠۟;->ۥ۟۟۟۟(JJJ)V

    add-long/2addr p4, p1

    :cond_0
    :goto_0
    cmp-long v0, p1, p4

    if-gez v0, :cond_1

    iget-object v6, p3, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v6}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    sub-long v0, p4, p1

    iget v2, v6, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget v3, v6, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v7, v0

    iget-object v3, v6, LYue/ۥۡۧۨ;->ۥ:[B

    iget v4, v6, LYue/ۥۡۧۨ;->ۥ۟:I

    move-object v0, p0

    move-wide v1, p1

    move v5, v7

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۡۧ(J[BII)V

    iget v0, v6, LYue/ۥۡۧۨ;->ۥ۟:I

    add-int/2addr v0, v7

    iput v0, v6, LYue/ۥۡۧۨ;->ۥ۟:I

    int-to-long v0, v7

    add-long/2addr p1, v0

    invoke-virtual {p3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v2

    sub-long/2addr v2, v0

    invoke-virtual {p3, v2, v3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۧۥ(J)V

    iget v0, v6, LYue/ۥۡۧۨ;->ۥ۟:I

    iget v1, v6, LYue/ۥۡۧۨ;->ۥ۟۟:I

    if-ne v0, v1, :cond_0

    invoke-virtual {v6}, LYue/ۥۡۧۨ;->ۥ۟()LYue/ۥۡۧۨ;

    move-result-object v0

    iput-object v0, p3, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v6}, LYue/ۥۡۧۨۡ;->ۥ۟۟۟(LYue/ۥۡۧۨ;)V

    goto :goto_0

    :cond_1
    return-void
.end method
