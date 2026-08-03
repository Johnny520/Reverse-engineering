.class public final LwC;
.super Lox;
.source ""


# instance fields
.field public final e:Ljava/lang/ThreadLocal;

.field private volatile threadLocalIsSet:Z


# direct methods
.method public constructor <init>(LEb;Lac;)V
    .locals 2

    sget-object v0, LxC;->a:LxC;

    invoke-interface {p2, v0}, Lac;->m(LZb;)LYb;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p2, v0}, Lac;->l(Lac;)Lac;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    invoke-direct {p0, p1, v0}, Lox;-><init>(LEb;Lac;)V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, LwC;->e:Ljava/lang/ThreadLocal;

    invoke-interface {p1}, LEb;->e()Lac;

    move-result-object p1

    sget-object v0, Lgf;->b:Lgf;

    invoke-interface {p1, v0}, Lac;->m(LZb;)LYb;

    move-result-object p1

    instance-of p1, p1, Lbc;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-static {p2, p1}, LGu;->E(Lac;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, LGu;->B(Lac;Ljava/lang/Object;)V

    invoke-virtual {p0, p2, p1}, LwC;->R(Lac;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final O()V
    .locals 0

    invoke-virtual {p0}, LwC;->Q()V

    return-void
.end method

.method public final P()Z
    .locals 3

    iget-boolean v0, p0, LwC;->threadLocalIsSet:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LwC;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, LwC;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    xor-int/2addr v0, v1

    return v0
.end method

.method public final Q()V
    .locals 2

    iget-boolean v0, p0, LwC;->threadLocalIsSet:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LwC;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEt;

    if-eqz v0, :cond_0

    iget-object v1, v0, LEt;->a:Ljava/lang/Object;

    check-cast v1, Lac;

    iget-object v0, v0, LEt;->b:Ljava/lang/Object;

    invoke-static {v1, v0}, LGu;->B(Lac;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LwC;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_1
    return-void
.end method

.method public final R(Lac;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LwC;->threadLocalIsSet:Z

    iget-object v0, p0, LwC;->e:Ljava/lang/ThreadLocal;

    new-instance v1, LEt;

    invoke-direct {v1, p1, p2}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 5

    invoke-virtual {p0}, LwC;->Q()V

    invoke-static {p1}, LQj;->C(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lox;->d:LEb;

    invoke-interface {v0}, LEb;->e()Lac;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, LGu;->E(Lac;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LGu;->j:Lv1;

    if-eq v3, v4, :cond_0

    invoke-static {v0, v1, v3}, LDc;->w(LEb;Lac;Ljava/lang/Object;)LwC;

    move-result-object v2

    :cond_0
    :try_start_0
    invoke-interface {v0, p1}, LEb;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LwC;->P()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-static {v1, v3}, LGu;->B(Lac;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LwC;->P()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {v1, v3}, LGu;->B(Lac;Ljava/lang/Object;)V

    :cond_4
    throw p1
.end method
