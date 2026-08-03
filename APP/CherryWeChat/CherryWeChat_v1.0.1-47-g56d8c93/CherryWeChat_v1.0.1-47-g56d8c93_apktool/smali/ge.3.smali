.class public abstract Lge;
.super LiA;
.source ""


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, LiA;-><init>(JZ)V

    iput p1, p0, Lge;->c:I

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    return-void
.end method

.method public abstract b()LEb;
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, LEa;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LEa;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, LEa;->a:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    return-object v1
.end method

.method public g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final h(Ljava/lang/Throwable;)V
    .locals 3

    new-instance v0, Lic;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fatal exception in coroutines machinery for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lge;->b()LEb;

    move-result-object p1

    invoke-interface {p1}, LEb;->e()Lac;

    move-result-object p1

    invoke-static {p1, v0}, LOj;->B(Lac;Ljava/lang/Throwable;)V

    return-void
.end method

.method public abstract i()Ljava/lang/Object;
.end method

.method public final run()V
    .locals 10

    :try_start_0
    invoke-virtual {p0}, Lge;->b()LEb;

    move-result-object v0

    check-cast v0, Lee;

    iget-object v1, v0, Lee;->e:LFb;

    iget-object v2, v1, LFb;->b:Lac;

    iget-object v0, v0, Lee;->g:Ljava/lang/Object;

    invoke-static {v2, v0}, LGu;->E(Lac;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v3, LGu;->j:Lv1;

    const/4 v4, 0x0

    if-eq v0, v3, :cond_0

    invoke-static {v1, v2, v0}, LDc;->w(LEb;Lac;Ljava/lang/Object;)LwC;

    move-result-object v3
    :try_end_0
    .catch Lde; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    move-object v3, v4

    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lge;->i()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p0, v5}, Lge;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-nez v6, :cond_3

    iget v7, p0, Lge;->c:I

    const/4 v8, 0x1

    if-eq v7, v8, :cond_2

    const/4 v9, 0x2

    if-ne v7, v9, :cond_1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :cond_2
    :goto_1
    if-eqz v8, :cond_3

    sget-object v4, Lgf;->f:Lgf;

    invoke-interface {v2, v4}, Lac;->m(LZb;)LYb;

    move-result-object v4

    check-cast v4, Ldm;

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_4

    :cond_3
    :goto_2
    if-eqz v4, :cond_4

    invoke-interface {v4}, Ldm;->d()Z

    move-result v7

    if-nez v7, :cond_4

    invoke-interface {v4}, Ldm;->p()Ljava/util/concurrent/CancellationException;

    move-result-object v4

    invoke-virtual {p0, v4}, Lge;->a(Ljava/util/concurrent/CancellationException;)V

    new-instance v5, LGw;

    invoke-direct {v5, v4}, LGw;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v5}, Lu5;->f(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    if-eqz v6, :cond_5

    new-instance v4, LGw;

    invoke-direct {v4, v6}, LGw;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v4}, Lu5;->f(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    invoke-virtual {p0, v5}, Lge;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Lu5;->f(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_3
    if-eqz v3, :cond_6

    :try_start_2
    invoke-virtual {v3}, LwC;->P()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_6
    invoke-static {v2, v0}, LGu;->B(Lac;Ljava/lang/Object;)V

    return-void

    :goto_4
    if-eqz v3, :cond_7

    invoke-virtual {v3}, LwC;->P()Z

    move-result v3

    if-eqz v3, :cond_8

    :cond_7
    invoke-static {v2, v0}, LGu;->B(Lac;Ljava/lang/Object;)V

    :cond_8
    throw v1
    :try_end_2
    .catch Lde; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_5
    invoke-virtual {p0, v0}, Lge;->h(Ljava/lang/Throwable;)V

    goto :goto_7

    :goto_6
    invoke-virtual {p0}, Lge;->b()LEb;

    move-result-object v1

    invoke-interface {v1}, LEb;->e()Lac;

    move-result-object v1

    iget-object v0, v0, Lde;->a:Ljava/lang/Throwable;

    invoke-static {v1, v0}, LOj;->B(Lac;Ljava/lang/Throwable;)V

    :cond_9
    :goto_7
    return-void
.end method
