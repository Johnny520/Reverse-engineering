.class public final Li0/f2;
.super Lf1/n0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Lf/l0;

.field public k:Lf/l0;

.field public l:Lsg/p;

.field public final m:Lb0/d0;

.field public final n:Lq9/a;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lf1/n0;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lb0/d0;

    .line 6
    .line 7
    const/16 v1, 0x14

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Li0/f2;->m:Lb0/d0;

    .line 13
    .line 14
    new-instance v0, Lb0/t;

    .line 15
    .line 16
    const/16 v1, 0xc

    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lw0/m;->a:Lw0/l;

    .line 22
    .line 23
    invoke-static {v1}, Lw0/m;->e(Lfg/l;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object v1, Lw0/m;->c:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v1

    .line 29
    :try_start_0
    sget-object v2, Lw0/m;->h:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {v2, v0}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    sput-object v2, Lw0/m;->h:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    monitor-exit v1

    .line 38
    new-instance v1, Lq9/a;

    .line 39
    .line 40
    const/16 v2, 0xa

    .line 41
    .line 42
    invoke-direct {v1, v0, v2}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Li0/f2;->n:Lq9/a;

    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    monitor-exit v1

    .line 50
    throw v0
.end method


# virtual methods
.method public final g(Lsg/p;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Li0/f2;->i:Ljava/lang/Object;

    .line 3
    .line 4
    iput-object p1, p0, Li0/f2;->k:Lf/l0;

    .line 5
    .line 6
    return-void
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Li0/f2;->i:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v1, p0, Li0/f2;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v1, p0, Li0/f2;->k:Lf/l0;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Li0/f2;->j:Lf/l0;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, p0, Li0/f2;->j:Lf/l0;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object v1, Lf/s0;->a:Lf/l0;

    .line 23
    .line 24
    new-instance v1, Lf/l0;

    .line 25
    .line 26
    invoke-direct {v1}, Lf/l0;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Li0/f2;->j:Lf/l0;

    .line 30
    .line 31
    :cond_1
    iget-object v1, p0, Li0/f2;->j:Lf/l0;

    .line 32
    .line 33
    iget-object v2, p0, Li0/f2;->k:Lf/l0;

    .line 34
    .line 35
    iput-object v2, p0, Li0/f2;->j:Lf/l0;

    .line 36
    .line 37
    iput-object v1, p0, Li0/f2;->k:Lf/l0;
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
    throw v1
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Li0/f2;->n:Lq9/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq9/a;->e()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Li0/f2;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v0, p0, Li0/f2;->k:Lf/l0;

    .line 10
    .line 11
    iget-object v1, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iput-object v0, p0, Li0/f2;->l:Lsg/p;

    .line 15
    .line 16
    iput-object v0, p0, Li0/f2;->h:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object v0, p0, Li0/f2;->j:Lf/l0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v1

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    monitor-exit v1

    .line 24
    throw v0
.end method

.method public final n(Lsg/p;)Lfg/l;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f2;->l:Lsg/p;

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
    invoke-static {v0}, Li0/n1;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iput-object p1, p0, Li0/f2;->l:Lsg/p;

    .line 18
    .line 19
    iget-object p1, p0, Li0/f2;->m:Lb0/d0;

    .line 20
    .line 21
    return-object p1
.end method

.method public final o(Lsg/g;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Li0/f2;->l:Lsg/p;

    .line 3
    .line 4
    iput-object p1, p0, Li0/f2;->i:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p1, p0, Li0/f2;->k:Lf/l0;

    .line 7
    .line 8
    invoke-virtual {p0}, Li0/f2;->h()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
