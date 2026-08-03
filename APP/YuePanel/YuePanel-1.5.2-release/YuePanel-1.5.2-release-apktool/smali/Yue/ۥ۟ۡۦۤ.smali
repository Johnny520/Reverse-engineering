.class public LYue/ۥ۟ۡۦۤ;
.super LYue/ۥۢۡ۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# static fields
.field public static volatile ۥ۟۟:LYue/ۥ۟ۡۦۤ;

.field public static final ۥ۟۟۟:Ljava/util/concurrent/Executor;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:Ljava/util/concurrent/Executor;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# instance fields
.field public ۥ:LYue/ۥۢۡ۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۢۡ۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟ۡۦۢ;

    invoke-direct {v0}, LYue/ۥ۟ۡۦۢ;-><init>()V

    sput-object v0, LYue/ۥ۟ۡۦۤ;->ۥ۟۟۟:Ljava/util/concurrent/Executor;

    new-instance v0, LYue/ۥ۟ۡۦۣ;

    invoke-direct {v0}, LYue/ۥ۟ۡۦۣ;-><init>()V

    sput-object v0, LYue/ۥ۟ۡۦۤ;->ۥ۟۟۟۟:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LYue/ۥۢۡ۟;-><init>()V

    new-instance v0, LYue/ۥۣ۟ۨۧ;

    invoke-direct {v0}, LYue/ۥۣ۟ۨۧ;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۡۦۤ;->ۥ۟:LYue/ۥۢۡ۟;

    iput-object v0, p0, LYue/ۥ۟ۡۦۤ;->ۥ:LYue/ۥۢۡ۟;

    return-void
.end method

.method public static synthetic ۥ۟۟۟۟(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, LYue/ۥ۟ۡۦۤ;->ۥ۟۟۟ۤ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۠(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, LYue/ۥ۟ۡۦۤ;->ۥ۟۟۟ۥ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ۥ۟۟۟ۡ()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget-object v0, LYue/ۥ۟ۡۦۤ;->ۥ۟۟۟۟:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static ۥ۟۟۟ۢ()LYue/ۥ۟ۡۦۤ;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget-object v0, LYue/ۥ۟ۡۦۤ;->ۥ۟۟:LYue/ۥ۟ۡۦۤ;

    if-eqz v0, :cond_0

    sget-object v0, LYue/ۥ۟ۡۦۤ;->ۥ۟۟:LYue/ۥ۟ۡۦۤ;

    return-object v0

    :cond_0
    const-class v0, LYue/ۥ۟ۡۦۤ;

    monitor-enter v0

    :try_start_0
    sget-object v1, LYue/ۥ۟ۡۦۤ;->ۥ۟۟:LYue/ۥ۟ۡۦۤ;

    if-nez v1, :cond_1

    new-instance v1, LYue/ۥ۟ۡۦۤ;

    invoke-direct {v1}, LYue/ۥ۟ۡۦۤ;-><init>()V

    sput-object v1, LYue/ۥ۟ۡۦۤ;->ۥ۟۟:LYue/ۥ۟ۡۦۤ;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, LYue/ۥ۟ۡۦۤ;->ۥ۟۟:LYue/ۥ۟ۡۦۤ;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ۥۣ۟۟۟()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget-object v0, LYue/ۥ۟ۡۦۤ;->ۥ۟۟۟:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static synthetic ۥ۟۟۟ۤ(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, LYue/ۥ۟ۡۦۤ;->ۥ۟۟۟ۢ()LYue/ۥ۟ۡۦۤ;

    move-result-object v0

    invoke-virtual {v0, p0}, LYue/ۥ۟ۡۦۤ;->ۥ۟۟۟(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۥ(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, LYue/ۥ۟ۡۦۤ;->ۥ۟۟۟ۢ()LYue/ۥ۟ۡۦۤ;

    move-result-object v0

    invoke-virtual {v0, p0}, LYue/ۥ۟ۡۦۤ;->ۥ(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟ۡۦۤ;->ۥ:LYue/ۥۢۡ۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۡ۟;->ۥ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public ۥ۟۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۦۤ;->ۥ:LYue/ۥۢۡ۟;

    invoke-virtual {v0}, LYue/ۥۢۡ۟;->ۥ۟۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟ۡۦۤ;->ۥ:LYue/ۥۢۡ۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۡ۟;->ۥ۟۟۟(Ljava/lang/Runnable;)V

    return-void
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥۢۡ۟;)V
    .locals 0
    .param p1    # LYue/ۥۢۡ۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۡۦۤ;->ۥ۟:LYue/ۥۢۡ۟;

    :cond_0
    iput-object p1, p0, LYue/ۥ۟ۡۦۤ;->ۥ:LYue/ۥۢۡ۟;

    return-void
.end method
