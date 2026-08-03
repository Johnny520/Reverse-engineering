.class public LZd;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LZd;->b:Ljava/lang/Object;

    .line 3
    sget-object v0, Lio/sentry/r1;->AUTO:Lio/sentry/r1;

    iput-object v0, p0, LZd;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, LZd;->a:Z

    .line 5
    const-string v0, "manual"

    iput-object v0, p0, LZd;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LBb;Luy;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Lvy;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lvy;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LZd;->d:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, LZd;->c:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, LZd;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbe;Lae;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZd;->d:Ljava/lang/Object;

    .line 11
    iput-object p2, p0, LZd;->b:Ljava/lang/Object;

    .line 12
    iget-boolean p2, p2, Lae;->e:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 13
    :cond_0
    iget p1, p1, Lbe;->g:I

    .line 14
    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, LZd;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LZd;->d:Ljava/lang/Object;

    check-cast v0, Lbe;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lbe;->d(Lbe;LZd;Z)V

    return-void
.end method

.method public b()Ljava/io/File;
    .locals 5

    iget-object v0, p0, LZd;->d:Ljava/lang/Object;

    check-cast v0, Lbe;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LZd;->b:Ljava/lang/Object;

    check-cast v1, Lae;

    iget-object v2, v1, Lae;->f:LZd;

    if-ne v2, p0, :cond_1

    iget-boolean v2, v1, Lae;->e:Z

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object v2, p0, LZd;->c:Ljava/lang/Object;

    check-cast v2, [Z

    const/4 v4, 0x1

    aput-boolean v4, v2, v3

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, v1, Lae;->d:[Ljava/io/File;

    aget-object v1, v1, v3

    iget-object v2, p0, LZd;->d:Ljava/lang/Object;

    check-cast v2, Lbe;

    iget-object v2, v2, Lbe;->a:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    monitor-exit v0

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
