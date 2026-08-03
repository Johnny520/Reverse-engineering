.class public Lcom/tendcloud/tenddata/bd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/tendcloud/tenddata/bd;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/bd;->a()Lcom/tendcloud/tenddata/bd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/z;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/bd;
    .locals 2

    sget-object v0, Lcom/tendcloud/tenddata/bd;->a:Lcom/tendcloud/tenddata/bd;

    if-nez v0, :cond_1

    const-class v0, Lcom/tendcloud/tenddata/bd;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/bd;->a:Lcom/tendcloud/tenddata/bd;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tendcloud/tenddata/bd;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/bd;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/bd;->a:Lcom/tendcloud/tenddata/bd;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/tendcloud/tenddata/bd;->a:Lcom/tendcloud/tenddata/bd;

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 2

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/w;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/tendcloud/tenddata/bd$1;

    invoke-direct {v1, p0}, Lcom/tendcloud/tenddata/bd$1;-><init>(Lcom/tendcloud/tenddata/bd;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public final onTDEBEventCommonEnvironment(Lcom/tendcloud/tenddata/bt;)V
    .locals 1

    :try_start_0
    iget p1, p1, Lcom/tendcloud/tenddata/bt;->a:I

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/bd;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
