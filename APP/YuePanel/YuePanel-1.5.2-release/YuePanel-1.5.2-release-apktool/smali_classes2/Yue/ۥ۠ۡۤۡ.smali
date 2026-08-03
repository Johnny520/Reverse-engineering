.class public LYue/ۥ۠ۡۤۡ;
.super LYue/ۥۣۣ۠ۡ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۥۤ۠;
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"
.end annotation


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
.method public synthetic constructor <init>(II)V
    .locals 8
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility for Ktor 1.0-beta"
    .end annotation

    .line 17
    sget-wide v3, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟۟:J

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v7}, LYue/ۥ۠ۡۤۡ;-><init>(IIJLjava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public synthetic constructor <init>(IIILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 14
    sget p1, LYue/ۥۢۡ۟ۤ;->ۥ۟۟:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 15
    sget p2, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟:I

    .line 16
    :cond_1
    invoke-direct {p0, p1, p2}, LYue/ۥ۠ۡۤۡ;-><init>(II)V

    return-void
.end method

.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0
    .param p5    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, LYue/ۥۣۣ۠ۡ;-><init>()V

    .line 4
    iput p1, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۤ:I

    .line 5
    iput p2, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۥ:I

    .line 6
    iput-wide p3, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۦ:J

    .line 7
    iput-object p5, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    .line 8
    invoke-virtual {p0}, LYue/ۥ۠ۡۤۡ;->ۥ۟۟ۧۢ()LYue/ۥۣ۟ۧۧ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    return-void
.end method

.method public synthetic constructor <init>(IIJLjava/lang/String;ILYue/ۥ۟ۨۥۢ;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    .line 1
    const-string p5, "CoroutineScheduler"

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-wide v3, p3

    .line 2
    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۡۤۡ;-><init>(IIJLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 6
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    .line 13
    sget-wide v3, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟۟:J

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۡۤۡ;-><init>(IIJLjava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 9
    sget p1, LYue/ۥۢۡ۟ۤ;->ۥ۟۟:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 10
    sget p2, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 11
    const-string p3, "DefaultDispatcher"

    .line 12
    :cond_2
    invoke-direct {p0, p1, p2, p3}, LYue/ۥ۠ۡۤۡ;-><init>(IILjava/lang/String;)V

    return-void
.end method

.method public static synthetic ۥ۟۟ۧۡ(LYue/ۥ۠ۡۤۡ;IILjava/lang/Object;)LYue/ۥ۟ۧۦۨ;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x10

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۤۡ;->ۥ۟۟ۧ۠(I)LYue/ۥ۟ۧۦۨ;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: blocking"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

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

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡ(LYue/ۥۣ۟ۧۧ;Ljava/lang/Runnable;LYue/ۥۢ۠ۨۨ;ZILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, LYue/ۥ۟ۨۥۤ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۥۤ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۡۡۡ;->dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    :goto_0
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

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LYue/ۥۣ۟ۧۧ;->ۥ۟۟ۡ(LYue/ۥۣ۟ۧۧ;Ljava/lang/Runnable;LYue/ۥۢ۠ۨۨ;ZILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, LYue/ۥ۟ۨۥۤ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۥۤ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۟ۧۦۨ;->dispatchYield(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LYue/ۥ۟ۧۦۨ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[scheduler = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    return-object v0
.end method

.method public final ۥ۟۟ۧ۠(I)LYue/ۥ۟ۧۦۨ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    if-lez p1, :cond_0

    new-instance v0, LYue/ۥ۠ۧ۠ۡ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, p1, v1, v2}, LYue/ۥ۠ۧ۠ۡ;-><init>(LYue/ۥ۠ۡۤۡ;ILjava/lang/String;I)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected positive parallelism level, but have "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟ۧۢ()LYue/ۥۣ۟ۧۧ;
    .locals 7

    new-instance v6, LYue/ۥۣ۟ۧۧ;

    iget v1, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۤ:I

    iget v2, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۥ:I

    iget-wide v3, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۦ:J

    iget-object v5, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LYue/ۥۣ۟ۧۧ;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method

.method public final ۥۣ۟۟ۧ(Ljava/lang/Runnable;LYue/ۥۢ۠ۨۨ;Z)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢ۠ۨۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۠ۨ(Ljava/lang/Runnable;LYue/ۥۢ۠ۨۨ;Z)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p3, LYue/ۥ۟ۨۥۤ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۥۤ;

    iget-object v0, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۧۧ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟ۧۧ;->ۥ۟۟۟ۢ(Ljava/lang/Runnable;LYue/ۥۢ۠ۨۨ;)LYue/ۥۢ۠ۨۧ;

    move-result-object p1

    invoke-virtual {p3, p1}, LYue/ۥ۟ۨۥۤ;->ۥ۟۟ۨۧ(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final ۥ۟۟ۧۤ(I)LYue/ۥ۟ۧۦۨ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    if-lez p1, :cond_1

    iget v0, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۤ:I

    if-gt p1, v0, :cond_0

    new-instance v0, LYue/ۥ۠ۧ۠ۡ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, LYue/ۥ۠ۧ۠ۡ;-><init>(LYue/ۥ۠ۡۤۡ;ILjava/lang/String;I)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected parallelism level lesser than core pool size ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۠ۡۤۡ;->ۥ۟۟۠ۤ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "), but have "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected positive parallelism level, but have "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
