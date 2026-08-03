.class public abstract LYue/ۥ۠ۡۡ۠;
.super LYue/ۥ۟ۧۦۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:J

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:LYue/ۥ۟ۡۨۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e1\u06e8\u06e2<",
            "LYue/\u06e5\u06e0\u06df\u06e2\u06e2<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۧۦۨ;-><init>()V

    return-void
.end method

.method public static synthetic ۥ۟۟ۧ۠(LYue/ۥ۠ۡۡ۠;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۧ۟(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: decrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟۟ۧۥ(LYue/ۥ۠ۡۡ۠;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۧۤ(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final limitedParallelism(I)LYue/ۥ۟ۧۦۨ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p1}, LYue/ۥ۠ۧ۠۠;->ۥ(I)V

    return-object p0
.end method

.method public shutdown()V
    .locals 0

    return-void
.end method

.method public final ۥ۟۟۟()Z
    .locals 4

    iget-wide v0, p0, LYue/ۥ۠ۡۡ۠;->ۥۣ۟۟۠:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟ۧ۟(Z)V
    .locals 4

    iget-wide v0, p0, LYue/ۥ۠ۡۡ۠;->ۥۣ۟۟۠:J

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۧۡ(Z)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, LYue/ۥ۠ۡۡ۠;->ۥۣ۟۟۠:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    return-void

    :cond_0
    iget-boolean p1, p0, LYue/ۥ۠ۡۡ۠;->ۥ۟۟۠ۤ:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LYue/ۥ۠ۡۡ۠;->shutdown()V

    :cond_1
    return-void
.end method

.method public final ۥ۟۟ۧۡ(Z)J
    .locals 2

    if-eqz p1, :cond_0

    const-wide v0, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1

    :goto_0
    return-wide v0
.end method

.method public final ۥ۟۟ۧۢ(LYue/ۥ۠۟ۢۢ;)V
    .locals 1
    .param p1    # LYue/ۥ۠۟ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06df\u06e2\u06e2<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۡ۠;->ۥ۟۟۠ۥ:LYue/ۥ۟ۡۨۢ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۡۨۢ;

    invoke-direct {v0}, LYue/ۥ۟ۡۨۢ;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۡۡ۠;->ۥ۟۟۠ۥ:LYue/ۥ۟ۡۨۢ;

    :cond_0
    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۨۢ;->ۥ(Ljava/lang/Object;)V

    return-void
.end method

.method public ۥۣ۟۟ۧ()J
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۡۡ۠;->ۥ۟۟۠ۥ:LYue/ۥ۟ۡۨۢ;

    const-wide v1, 0x7fffffffffffffffL

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {v0}, LYue/ۥ۟ۡۨۢ;->ۥ۟۟۟()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x0

    :goto_0
    return-wide v1
.end method

.method public final ۥ۟۟ۧۤ(Z)V
    .locals 4

    iget-wide v0, p0, LYue/ۥ۠ۡۡ۠;->ۥۣ۟۟۠:J

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۧۡ(Z)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, LYue/ۥ۠ۡۡ۠;->ۥۣ۟۟۠:J

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۠ۡۡ۠;->ۥ۟۟۠ۤ:Z

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۧۦ()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۧۨ()Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟ۧۧ()Z
    .locals 5

    iget-wide v0, p0, LYue/ۥ۠ۡۡ۠;->ۥۣ۟۟۠:J

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۧۡ(Z)J

    move-result-wide v3

    cmp-long v0, v0, v3

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public final ۥ۟۟ۧۨ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۡ۠;->ۥ۟۟۠ۥ:LYue/ۥ۟ۡۨۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡۨۢ;->ۥ۟۟۟()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۨ()J
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۨ۟()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ۥ۟۟ۨ۟()Z
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۡۡ۠;->ۥ۟۟۠ۥ:LYue/ۥ۟ۡۨۢ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LYue/ۥ۟ۡۨۢ;->ۥ۟۟۟۟()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠۟ۢۢ;

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, LYue/ۥ۠۟ۢۢ;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟ۨ۠()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
