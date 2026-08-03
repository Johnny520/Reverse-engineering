.class public final LYue/ۥ۟ۨۥۧ;
.super LYue/ۥۣۣ۠ۡ;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final ۥ۟۟۠ۤ:LYue/ۥ۟ۨۥۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۥ:LYue/ۥ۟ۧۦۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LYue/ۥ۟ۨۥۧ;

    invoke-direct {v0}, LYue/ۥ۟ۨۥۧ;-><init>()V

    sput-object v0, LYue/ۥ۟ۨۥۧ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۨۥۧ;

    sget-object v0, LYue/ۥۣۢ۠ۥ;->ۥۣ۟۟۠:LYue/ۥۣۢ۠ۥ;

    const/16 v1, 0x40

    invoke-static {}, LYue/ۥۢ۠ۧ۟;->ۥ()I

    move-result v2

    invoke-static {v1, v2}, LYue/ۥۡۦ۟;->ۥ۟۟۠ۤ(II)I

    move-result v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const-string v3, "kotlinx.coroutines.io.parallelism"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LYue/ۥۢ۠ۧ۟;->ۥ۟۟۟۠(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥ۟ۧۦۨ;->limitedParallelism(I)LYue/ۥ۟ۧۦۨ;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۨۥۧ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۦۨ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۣۣ۠ۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۟ۨۥۧ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۦۨ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۟ۧۦۨ;->dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public dispatchYield(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    sget-object v0, LYue/ۥ۟ۨۥۧ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۦۨ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۟ۧۦۨ;->dispatchYield(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    invoke-virtual {p0, v0, p1}, LYue/ۥ۟ۨۥۧ;->dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public limitedParallelism(I)LYue/ۥ۟ۧۦۨ;
    .locals 1
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣۢ۠ۥ;->ۥۣ۟۟۠:LYue/ۥۣۢ۠ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۧۦۨ;->limitedParallelism(I)LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method

.method public ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    return-object p0
.end method
