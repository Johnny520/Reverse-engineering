.class public final Lqj1;
.super Lsj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final i:Lrk1;

.field public final j:Ljava/util/ArrayList;

.field public final k:Lsk1;

.field public final l:Lrk1;

.field public final m:Lrl1;


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
    invoke-static {}, Lqp0;->o()Lrk1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lqj1;->i:Lrk1;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lqj1;->j:Ljava/util/ArrayList;

    .line 17
    .line 18
    sget-object v0, Lfd2;->a:Lsk1;

    .line 19
    .line 20
    new-instance v0, Lsk1;

    .line 21
    .line 22
    invoke-direct {v0}, Lsk1;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lqj1;->k:Lsk1;

    .line 26
    .line 27
    new-instance v0, Lrk1;

    .line 28
    .line 29
    invoke-direct {v0}, Lrk1;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lqj1;->l:Lrk1;

    .line 33
    .line 34
    new-instance v0, Ls9;

    .line 35
    .line 36
    const/16 v1, 0xd

    .line 37
    .line 38
    invoke-direct {v0, v1, p0}, Ls9;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object v1, Lds2;->a:Lml2;

    .line 42
    .line 43
    invoke-static {v1}, Lds2;->e(Lin0;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    sget-object v1, Lds2;->c:Ljava/lang/Object;

    .line 47
    .line 48
    monitor-enter v1

    .line 49
    :try_start_0
    sget-object v2, Lds2;->h:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {v2, v0}, Ldu;->y0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sput-object v2, Lds2;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    monitor-exit v1

    .line 58
    new-instance v1, Lrl1;

    .line 59
    .line 60
    invoke-direct {v1, v0}, Lrl1;-><init>(Lmn0;)V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, Lqj1;->m:Lrl1;

    .line 64
    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    monitor-exit v1

    .line 68
    throw p0
.end method


# virtual methods
.method public final c(Lho2;)V
    .locals 1

    .line 1
    new-instance v0, Loj1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Loj1;-><init>(Lho2;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lqj1;->j:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d()V
    .locals 7

    .line 1
    iget-object v0, p0, Lsj;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lqj1;->j:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    if-ge v3, v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lpj1;

    .line 18
    .line 19
    instance-of v5, v4, Lnj1;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    iget-object v5, p0, Lqj1;->i:Lrk1;

    .line 24
    .line 25
    move-object v6, v4

    .line 26
    check-cast v6, Lnj1;

    .line 27
    .line 28
    iget-object v6, v6, Lnj1;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, Lnj1;

    .line 31
    .line 32
    iget-object v4, v4, Lnj1;->b:Lho2;

    .line 33
    .line 34
    invoke-static {v5, v6, v4}, Lqp0;->k(Lrk1;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_2

    .line 40
    :cond_0
    instance-of v5, v4, Loj1;

    .line 41
    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    iget-object v5, p0, Lqj1;->i:Lrk1;

    .line 45
    .line 46
    check-cast v4, Loj1;

    .line 47
    .line 48
    iget-object v4, v4, Loj1;->a:Lho2;

    .line 49
    .line 50
    invoke-static {v5, v4}, Lqp0;->T(Lrk1;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance p0, Lpv;

    .line 57
    .line 58
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 59
    .line 60
    .line 61
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    :cond_2
    monitor-exit v0

    .line 63
    iget-object p0, p0, Lqj1;->j:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :goto_2
    monitor-exit v0

    .line 70
    throw p0
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqj1;->m:Lrl1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrl1;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqj1;->j:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqj1;->l:Lrk1;

    .line 12
    .line 13
    invoke-virtual {v0}, Lrk1;->a()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lsj;->h:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    iget-object p0, p0, Lqj1;->i:Lrk1;

    .line 20
    .line 21
    invoke-virtual {p0}, Lrk1;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    monitor-exit v0

    .line 28
    throw p0
.end method

.method public final i(Lho2;)Lin0;
    .locals 4

    .line 1
    iget-object v0, p0, Lqj1;->l:Lrk1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lin0;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    new-instance v1, Ld2;

    .line 12
    .line 13
    const/16 v2, 0x15

    .line 14
    .line 15
    invoke-direct {v1, v2, p0, p1}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lrk1;->f(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-gez p0, :cond_0

    .line 23
    .line 24
    not-int p0, p0

    .line 25
    :cond_0
    iget-object v2, v0, Lrk1;->c:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object v3, v2, p0

    .line 28
    .line 29
    iget-object v0, v0, Lrk1;->b:[Ljava/lang/Object;

    .line 30
    .line 31
    aput-object p1, v0, p0

    .line 32
    .line 33
    aput-object v1, v2, p0

    .line 34
    .line 35
    :cond_1
    return-object v1
.end method

.method public final j(Lfq;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqj1;->l:Lrk1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lrk1;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lqj1;->c(Lho2;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lqj1;->d()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
