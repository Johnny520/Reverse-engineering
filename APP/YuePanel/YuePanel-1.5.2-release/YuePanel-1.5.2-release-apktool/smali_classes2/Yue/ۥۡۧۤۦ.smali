.class public LYue/ۥۡۧۤۦ;
.super LYue/ۥۣۣ۠ۡ;
.source "SourceFile"


# instance fields
.field public final ۥ۟۟۠ۤ:I

.field public final ۥ۟۟۠ۥ:I

.field public final ۥ۟۟۠ۦ:J

.field public final ۥ۟۟۠ۧ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v7}, LYue/ۥۡۧۤۦ;-><init>(IIJLjava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0
    .param p5    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    .line 7
    invoke-direct {p0}, LYue/ۥۣۣ۠ۡ;-><init>()V

    .line 8
    iput p1, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۤ:I

    .line 9
    iput p2, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۥ:I

    .line 10
    iput-wide p3, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۦ:J

    .line 11
    iput-object p5, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    .line 12
    invoke-direct {p0}, LYue/ۥۡۧۤۦ;->ۥ۟۟ۧ۠()LYue/ۥۣ۟ۧۧ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    return-void
.end method

.method public synthetic constructor <init>(IIJLjava/lang/String;ILYue/ۥ۟ۨۥۢ;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 2
    sget p1, LYue/ۥۢۡ۟ۤ;->ۥ۟۟:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    .line 3
    sget p2, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟:I

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    .line 4
    sget-wide p3, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟۟:J

    :cond_2
    move-wide v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    .line 5
    const-string p5, "CoroutineScheduler"

    :cond_3
    move-object v2, p5

    move-object p2, p0

    move p3, p1

    move p4, p7

    move-wide p5, v0

    move-object p7, v2

    .line 6
    invoke-direct/range {p2 .. p7}, LYue/ۥۡۧۤۦ;-><init>(IIJLjava/lang/String;)V

    return-void
.end method

.method private final ۥ۟۟ۧ۠()LYue/ۥۣ۟ۧۧ;
    .locals 7

    new-instance v6, LYue/ۥۣ۟ۧۧ;

    iget v1, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۤ:I

    iget v2, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۥ:I

    iget-wide v3, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۦ:J

    iget-object v5, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LYue/ۥۣ۟ۧۧ;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۧۧ;->close()V

    return-void
.end method

.method public dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 6
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡ(LYue/ۥۣ۟ۧۧ;Ljava/lang/Runnable;LYue/ۥۢ۠ۨۨ;ZILjava/lang/Object;)V

    return-void
.end method

.method public dispatchYield(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 6
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡ(LYue/ۥۣ۟ۧۧ;Ljava/lang/Runnable;LYue/ۥۢ۠ۨۨ;ZILjava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    return-object v0
.end method

.method public final ۥ۟۟ۧۡ(Ljava/lang/Runnable;LYue/ۥۢ۠ۨۨ;Z)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢ۠ۨۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۠ۨ(Ljava/lang/Runnable;LYue/ۥۢ۠ۨۨ;Z)V

    return-void
.end method

.method public final ۥ۟۟ۧۢ()V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۡۧۤۦ;->ۥ۟۟ۧۤ()V

    return-void
.end method

.method public final declared-synchronized ۥۣ۟۟ۧ(J)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟ۧۧ;->ۥۣ۟۟ۤ(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۥ۟۟ۧۤ()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, LYue/ۥۣ۟ۧۧ;->ۥۣ۟۟ۤ(J)V

    invoke-direct {p0}, LYue/ۥۡۧۤۦ;->ۥ۟۟ۧ۠()LYue/ۥۣ۟ۧۧ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۧۤۦ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;
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
