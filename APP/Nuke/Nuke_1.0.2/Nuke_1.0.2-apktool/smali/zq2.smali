.class public final Lzq2;
.super Lsj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Lsk1;

.field public l:Lsk1;

.field public m:Lho2;

.field public final n:Lxq2;

.field public final o:Lrl1;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Lsj;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lxq2;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, Lxq2;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lzq2;->n:Lxq2;

    .line 12
    .line 13
    new-instance v0, Ls9;

    .line 14
    .line 15
    const/16 v1, 0x13

    .line 16
    .line 17
    invoke-direct {v0, v1, p0}, Ls9;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lds2;->a:Lml2;

    .line 21
    .line 22
    invoke-static {v1}, Lds2;->e(Lin0;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object v1, Lds2;->c:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v1

    .line 28
    :try_start_0
    sget-object v2, Lds2;->h:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v2, v0}, Ldu;->y0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    sput-object v2, Lds2;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v1

    .line 37
    new-instance v1, Lrl1;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Lrl1;-><init>(Lmn0;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lzq2;->o:Lrl1;

    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    monitor-exit v1

    .line 47
    throw p0
.end method


# virtual methods
.method public final c(Lho2;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lzq2;->j:Ljava/lang/Object;

    .line 3
    .line 4
    iput-object p1, p0, Lzq2;->l:Lsk1;

    .line 5
    .line 6
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lsj;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lzq2;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v1, p0, Lzq2;->i:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v1, p0, Lzq2;->l:Lsk1;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lzq2;->k:Lsk1;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, p0, Lzq2;->k:Lsk1;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object v1, Lfd2;->a:Lsk1;

    .line 23
    .line 24
    new-instance v1, Lsk1;

    .line 25
    .line 26
    invoke-direct {v1}, Lsk1;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lzq2;->k:Lsk1;

    .line 30
    .line 31
    :cond_1
    iget-object v1, p0, Lzq2;->k:Lsk1;

    .line 32
    .line 33
    iget-object v2, p0, Lzq2;->l:Lsk1;

    .line 34
    .line 35
    iput-object v2, p0, Lzq2;->k:Lsk1;

    .line 36
    .line 37
    iput-object v1, p0, Lzq2;->l:Lsk1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    :goto_0
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw p0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzq2;->o:Lrl1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrl1;->a()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lzq2;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v0, p0, Lzq2;->l:Lsk1;

    .line 10
    .line 11
    iget-object v1, p0, Lsj;->h:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iput-object v0, p0, Lzq2;->m:Lho2;

    .line 15
    .line 16
    iput-object v0, p0, Lzq2;->i:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object v0, p0, Lzq2;->k:Lsk1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v1

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v1

    .line 24
    throw p0
.end method

.method public final i(Lho2;)Lin0;
    .locals 1

    .line 1
    iget-object v0, p0, Lzq2;->m:Lho2;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"

    .line 13
    .line 14
    invoke-static {v0}, Lj22;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iput-object p1, p0, Lzq2;->m:Lho2;

    .line 18
    .line 19
    iget-object p0, p0, Lzq2;->n:Lxq2;

    .line 20
    .line 21
    return-object p0
.end method

.method public final j(Lfq;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lzq2;->m:Lho2;

    .line 3
    .line 4
    iput-object p1, p0, Lzq2;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p1, p0, Lzq2;->l:Lsk1;

    .line 7
    .line 8
    invoke-virtual {p0}, Lzq2;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
