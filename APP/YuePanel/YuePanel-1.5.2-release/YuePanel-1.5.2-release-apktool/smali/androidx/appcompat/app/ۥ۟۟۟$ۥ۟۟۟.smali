.class public Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/Object;

.field public final ۥ۟۟۠ۤ:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:Ljava/util/concurrent/Executor;

.field public ۥ۟۟۠ۦ:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/util/Queue;

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic ۥ(Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/util/Queue;

    new-instance v2, LYue/ۥ۟ۡ۠ۤ;

    invoke-direct {v2, p0, p1}, LYue/ۥ۟ۡ۠ۤ;-><init>(Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;Ljava/lang/Runnable;)V

    invoke-interface {v1, v2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Runnable;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final synthetic ۥ۟(Ljava/lang/Runnable;)V
    .locals 0

    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟()V

    throw p1
.end method

.method public ۥ۟۟()V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    iput-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/util/concurrent/Executor;

    invoke-interface {v2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
