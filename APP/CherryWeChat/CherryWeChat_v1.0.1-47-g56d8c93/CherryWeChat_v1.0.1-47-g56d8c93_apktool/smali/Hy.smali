.class public final LHy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lvc;
.implements Luc;


# instance fields
.field public final a:LFc;

.field public final b:LHc;

.field public volatile c:I

.field public volatile d:Lqc;

.field public volatile e:Ljava/lang/Object;

.field public volatile f:LZr;

.field public volatile g:Lrc;


# direct methods
.method public constructor <init>(LFc;LHc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHy;->a:LFc;

    iput-object p2, p0, LHy;->b:LHc;

    return-void
.end method


# virtual methods
.method public final a(LSm;Ljava/lang/Exception;Ltc;I)V
    .locals 1

    iget-object p4, p0, LHy;->b:LHc;

    iget-object v0, p0, LHy;->f:LZr;

    iget-object v0, v0, LZr;->c:Ltc;

    invoke-interface {v0}, Ltc;->f()I

    move-result v0

    invoke-virtual {p4, p1, p2, p3, v0}, LHc;->a(LSm;Ljava/lang/Exception;Ltc;I)V

    return-void
.end method

.method public final b(LSm;Ljava/lang/Object;Ltc;ILSm;)V
    .locals 6

    iget-object v0, p0, LHy;->b:LHc;

    iget-object p4, p0, LHy;->f:LZr;

    iget-object p4, p4, LZr;->c:Ltc;

    invoke-interface {p4}, Ltc;->f()I

    move-result v4

    move-object v5, p1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, LHc;->b(LSm;Ljava/lang/Object;Ltc;ILSm;)V

    return-void
.end method

.method public final c()Z
    .locals 5

    iget-object v0, p0, LHy;->e:Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LHy;->e:Ljava/lang/Object;

    iput-object v1, p0, LHy;->e:Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0, v0}, LHy;->d(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    goto :goto_0

    :catch_0
    :cond_0
    iget-object v0, p0, LHy;->d:Lqc;

    if-eqz v0, :cond_1

    iget-object v0, p0, LHy;->d:Lqc;

    invoke-virtual {v0}, Lqc;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return v2

    :cond_1
    iput-object v1, p0, LHy;->d:Lqc;

    iput-object v1, p0, LHy;->f:LZr;

    const/4 v0, 0x0

    :cond_2
    :goto_1
    if-nez v0, :cond_4

    iget v1, p0, LHy;->c:I

    iget-object v3, p0, LHy;->a:LFc;

    invoke-virtual {v3}, LFc;->b()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_4

    iget-object v1, p0, LHy;->a:LFc;

    invoke-virtual {v1}, LFc;->b()Ljava/util/ArrayList;

    move-result-object v1

    iget v3, p0, LHy;->c:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, LHy;->c:I

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZr;

    iput-object v1, p0, LHy;->f:LZr;

    iget-object v1, p0, LHy;->f:LZr;

    if-eqz v1, :cond_2

    iget-object v1, p0, LHy;->a:LFc;

    iget-object v1, v1, LFc;->p:LVd;

    iget-object v3, p0, LHy;->f:LZr;

    iget-object v3, v3, LZr;->c:Ltc;

    invoke-interface {v3}, Ltc;->f()I

    move-result v3

    invoke-virtual {v1, v3}, LVd;->a(I)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, LHy;->a:LFc;

    iget-object v3, p0, LHy;->f:LZr;

    iget-object v3, v3, LZr;->c:Ltc;

    invoke-interface {v3}, Ltc;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, LFc;->c(Ljava/lang/Class;)LNo;

    move-result-object v1

    if-eqz v1, :cond_2

    :cond_3
    iget-object v0, p0, LHy;->f:LZr;

    iget-object v1, p0, LHy;->f:LZr;

    iget-object v1, v1, LZr;->c:Ltc;

    iget-object v3, p0, LHy;->a:LFc;

    iget-object v3, v3, LFc;->o:Lwu;

    new-instance v4, LGy;

    invoke-direct {v4, p0, v0}, LGy;-><init>(LHy;LZr;)V

    invoke-interface {v1, v3, v4}, Ltc;->d(Lwu;Lsc;)V

    move v0, v2

    goto :goto_1

    :cond_4
    return v0
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, LHy;->f:LZr;

    if-eqz v0, :cond_0

    iget-object v0, v0, LZr;->c:Ltc;

    invoke-interface {v0}, Ltc;->cancel()V

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 12

    const-string v0, "SourceGenerator"

    sget v1, Lhp;->a:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LHy;->a:LFc;

    iget-object v2, v2, LFc;->c:LRj;

    invoke-virtual {v2}, LRj;->a()LPv;

    move-result-object v2

    invoke-virtual {v2, p1}, LPv;->g(Ljava/lang/Object;)Lxc;

    move-result-object v2

    invoke-interface {v2}, Lxc;->j()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, LHy;->a:LFc;

    invoke-virtual {v4, v3}, LFc;->d(Ljava/lang/Object;)LPf;

    move-result-object v4

    new-instance v5, Lw4;

    iget-object v6, p0, LHy;->a:LFc;

    iget-object v6, v6, LFc;->i:Lvt;

    const/16 v7, 0x8

    invoke-direct {v5, v4, v3, v6, v7}, Lw4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v3, Lrc;

    iget-object v6, p0, LHy;->f:LZr;

    iget-object v6, v6, LZr;->a:LSm;

    iget-object v7, p0, LHy;->a:LFc;

    iget-object v8, v7, LFc;->n:LSm;

    invoke-direct {v3, v6, v8}, Lrc;-><init>(LSm;LSm;)V

    iget-object v6, v7, LFc;->h:LBb;

    invoke-virtual {v6}, LBb;->a()LUd;

    move-result-object v6

    invoke-interface {v6, v3, v5}, LUd;->d(LSm;Lw4;)V

    const/4 v5, 0x2

    invoke-static {v0, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v3}, Lrc;->toString()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v6, v3}, LUd;->b(LSm;)Ljava/io/File;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    iput-object v3, p0, LHy;->g:Lrc;

    new-instance p1, Lqc;

    iget-object v0, p0, LHy;->f:LZr;

    iget-object v0, v0, LZr;->a:LSm;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, LHy;->a:LFc;

    invoke-direct {p1, v0, v2, p0}, Lqc;-><init>(Ljava/util/List;LFc;Luc;)V

    iput-object p1, p0, LHy;->d:Lqc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LHy;->f:LZr;

    iget-object p1, p1, LZr;->c:Ltc;

    invoke-interface {p1}, Ltc;->c()V

    return v5

    :cond_1
    const/4 v3, 0x3

    :try_start_1
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LHy;->g:Lrc;

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :try_start_2
    iget-object v6, p0, LHy;->b:LHc;

    iget-object p1, p0, LHy;->f:LZr;

    iget-object v7, p1, LZr;->a:LSm;

    invoke-interface {v2}, Lxc;->j()Ljava/lang/Object;

    move-result-object v8

    iget-object p1, p0, LHy;->f:LZr;

    iget-object v9, p1, LZr;->c:Ltc;

    iget-object p1, p0, LHy;->f:LZr;

    iget-object p1, p1, LZr;->c:Ltc;

    invoke-interface {p1}, Ltc;->f()I

    move-result v10

    iget-object p1, p0, LHy;->f:LZr;

    iget-object v11, p1, LZr;->a:LSm;

    invoke-virtual/range {v6 .. v11}, LHc;->b(LSm;Ljava/lang/Object;Ltc;ILSm;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return v1

    :catchall_1
    move-exception v0

    move-object p1, v0

    move v1, v5

    :goto_1
    if-nez v1, :cond_3

    iget-object v0, p0, LHy;->f:LZr;

    iget-object v0, v0, LZr;->c:Ltc;

    invoke-interface {v0}, Ltc;->c()V

    :cond_3
    throw p1
.end method
