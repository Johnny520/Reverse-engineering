.class public final Lw0/d;
.super Lw0/f;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final e:Lfg/l;

.field public final f:Lw0/f;


# direct methods
.method public constructor <init>(JLw0/j;Lfg/l;Lw0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lw0/f;-><init>(JLw0/j;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lw0/d;->e:Lfg/l;

    .line 5
    .line 6
    iput-object p5, p0, Lw0/d;->f:Lw0/f;

    .line 7
    .line 8
    invoke-virtual {p5}, Lw0/f;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lw0/d;->f:Lw0/f;

    .line 2
    .line 3
    iget-boolean v1, p0, Lw0/f;->c:Z

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-wide v1, p0, Lw0/f;->b:J

    .line 8
    .line 9
    invoke-virtual {v0}, Lw0/f;->g()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    cmp-long v1, v1, v3

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lw0/f;->a()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Lw0/f;->l()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lw0/f;->c:Z

    .line 25
    .line 26
    sget-object v0, Lw0/m;->c:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    invoke-virtual {p0}, Lw0/f;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    monitor-exit v0

    .line 36
    throw v1

    .line 37
    :cond_1
    return-void
.end method

.method public final e()Lfg/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lw0/d;->e:Lfg/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final i()Lfg/l;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final k()V
    .locals 1

    .line 1
    invoke-static {}, Lw0/q;->l()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    throw v0
.end method

.method public final l()V
    .locals 1

    .line 1
    invoke-static {}, Lw0/q;->l()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    throw v0
.end method

.method public final m()V
    .locals 0

    .line 1
    return-void
.end method

.method public final n(Lw0/u;)V
    .locals 1

    .line 1
    sget-object p1, Lw0/m;->a:Lw0/l;

    .line 2
    .line 3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 4
    .line 5
    const-string v0, "Cannot modify a state object in a read-only snapshot"

    .line 6
    .line 7
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    throw p1
.end method

.method public final u(Lfg/l;)Lw0/f;
    .locals 6

    .line 1
    new-instance v0, Lw0/d;

    .line 2
    .line 3
    iget-wide v1, p0, Lw0/f;->b:J

    .line 4
    .line 5
    iget-object v3, p0, Lw0/f;->a:Lw0/j;

    .line 6
    .line 7
    iget-object v4, p0, Lw0/d;->e:Lfg/l;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    invoke-static {p1, v4, v5}, Lw0/m;->k(Lfg/l;Lfg/l;Z)Lfg/l;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    iget-object v5, p0, Lw0/d;->f:Lw0/f;

    .line 15
    .line 16
    invoke-direct/range {v0 .. v5}, Lw0/d;-><init>(JLw0/j;Lfg/l;Lw0/f;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
