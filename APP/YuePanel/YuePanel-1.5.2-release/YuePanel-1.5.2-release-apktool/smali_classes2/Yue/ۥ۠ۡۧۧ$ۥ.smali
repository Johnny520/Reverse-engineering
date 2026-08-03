.class public final LYue/ۥ۠ۡۧۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۡ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡۧۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۠ۡۧۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:J

.field public ۥ۟۟۠ۥ:Z


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡۧۧ;J)V
    .locals 1
    .param p1    # LYue/ۥ۠ۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "fileHandle"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۧۧ;

    iput-wide p2, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۤ:J

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    iget-boolean v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۥ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۥ:Z

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۧۧ;

    invoke-virtual {v0}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۟ۨ()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۧۧ;

    invoke-static {v1}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟(LYue/ۥ۠ۡۧۧ;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۟۟(LYue/ۥ۠ۡۧۧ;I)V

    iget-object v1, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۧۧ;

    invoke-static {v1}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟(LYue/ۥ۠ۡۧۧ;)I

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۧۧ;

    invoke-static {v1}, LYue/ۥ۠ۡۧۧ;->ۥ۟(LYue/ۥ۠ۡۧۧ;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۧۧ;

    invoke-virtual {v0}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۠ۨ()V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public flush()V
    .locals 2

    iget-boolean v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۥ:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۧۧ;

    invoke-virtual {v0}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟ۡ()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۟:LYue/ۥۢۡۤۧ;

    return-object v0
.end method

.method public final ۥ۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۥ:Z

    return v0
.end method

.method public final ۥ۟۟()LYue/ۥ۠ۡۧۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۧۧ;

    return-object v0
.end method

.method public final ۥ۟۟۟()J
    .locals 2

    iget-wide v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۤ:J

    return-wide v0
.end method

.method public final ۥ۟۟۟۟(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۥ:Z

    return-void
.end method

.method public final ۥ۟۟۟ۢ(J)V
    .locals 0

    iput-wide p1, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۤ:J

    return-void
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V
    .locals 7
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۥ:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۧۧ;

    iget-wide v2, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۤ:J

    move-object v4, p1

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, LYue/ۥ۠ۡۧۧ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۡۧۧ;JLYue/ۥۣ۟ۢۨ;J)V

    iget-wide v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۤ:J

    add-long/2addr v0, p2

    iput-wide v0, p0, LYue/ۥ۠ۡۧۧ$ۥ;->ۥ۟۟۠ۤ:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
