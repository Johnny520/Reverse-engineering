.class public final Lgp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lpw;
.implements LZg;


# static fields
.field public static final e:Lw4;


# instance fields
.field public final a:Lfz;

.field public b:Lpw;

.field public c:Z

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LPg;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, LPg;-><init>(I)V

    const/16 v1, 0x14

    invoke-static {v1, v0}, LQj;->I(ILYg;)Lw4;

    move-result-object v0

    sput-object v0, Lgp;->e:Lw4;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lfz;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lgp;->a:Lfz;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lgp;->a:Lfz;

    invoke-virtual {v0}, Lfz;->a()V

    iget-boolean v0, p0, Lgp;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lgp;->c:Z

    iget-boolean v0, p0, Lgp;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lgp;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already unlocked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lgp;->b:Lpw;

    invoke-interface {v0}, Lpw;->b()I

    move-result v0

    return v0
.end method

.method public final c()Lfz;
    .locals 1

    iget-object v0, p0, Lgp;->a:Lfz;

    return-object v0
.end method

.method public final d()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lgp;->b:Lpw;

    invoke-interface {v0}, Lpw;->d()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized e()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lgp;->a:Lfz;

    invoke-virtual {v0}, Lfz;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lgp;->d:Z

    iget-boolean v0, p0, Lgp;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lgp;->b:Lpw;

    invoke-interface {v0}, Lpw;->e()V

    const/4 v0, 0x0

    iput-object v0, p0, Lgp;->b:Lpw;

    sget-object v0, Lgp;->e:Lw4;

    invoke-virtual {v0, p0}, Lw4;->a(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lgp;->b:Lpw;

    invoke-interface {v0}, Lpw;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
