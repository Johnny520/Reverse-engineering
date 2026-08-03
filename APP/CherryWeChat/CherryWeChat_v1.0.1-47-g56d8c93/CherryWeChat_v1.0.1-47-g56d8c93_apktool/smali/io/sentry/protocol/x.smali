.class public final Lio/sentry/protocol/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/C0;


# instance fields
.field public a:Ljava/util/List;

.field public b:Ljava/util/List;

.field public c:Ljava/util/Map;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/Integer;

.field public h:Ljava/lang/Integer;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/Boolean;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/Boolean;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:Ljava/util/concurrent/ConcurrentHashMap;

.field public u:Ljava/lang/String;

.field public v:Lio/sentry/b2;


# virtual methods
.method public final serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 3

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->h()Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "filename"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/x;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "function"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/x;->f:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, "module"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/x;->g:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    const-string v0, "lineno"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->g:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/Number;)Lio/sentry/internal/debugmeta/c;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/x;->h:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    const-string v0, "colno"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->h:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/Number;)Lio/sentry/internal/debugmeta/c;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/x;->i:Ljava/lang/String;

    if-eqz v0, :cond_5

    const-string v0, "abs_path"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/x;->j:Ljava/lang/String;

    if-eqz v0, :cond_6

    const-string v0, "context_line"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/x;->k:Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    const-string v0, "in_app"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->k:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->x(Ljava/lang/Boolean;)Lio/sentry/internal/debugmeta/c;

    :cond_7
    iget-object v0, p0, Lio/sentry/protocol/x;->l:Ljava/lang/String;

    if-eqz v0, :cond_8

    const-string v0, "package"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_8
    iget-object v0, p0, Lio/sentry/protocol/x;->m:Ljava/lang/Boolean;

    if-eqz v0, :cond_9

    const-string v0, "native"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->m:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->x(Ljava/lang/Boolean;)Lio/sentry/internal/debugmeta/c;

    :cond_9
    iget-object v0, p0, Lio/sentry/protocol/x;->n:Ljava/lang/String;

    if-eqz v0, :cond_a

    const-string v0, "platform"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_a
    iget-object v0, p0, Lio/sentry/protocol/x;->o:Ljava/lang/String;

    if-eqz v0, :cond_b

    const-string v0, "image_addr"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_b
    iget-object v0, p0, Lio/sentry/protocol/x;->p:Ljava/lang/String;

    if-eqz v0, :cond_c

    const-string v0, "symbol_addr"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->p:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_c
    iget-object v0, p0, Lio/sentry/protocol/x;->q:Ljava/lang/String;

    if-eqz v0, :cond_d

    const-string v0, "instruction_addr"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_d
    iget-object v0, p0, Lio/sentry/protocol/x;->r:Ljava/lang/String;

    if-eqz v0, :cond_e

    const-string v0, "addr_mode"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->r:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_e
    iget-object v0, p0, Lio/sentry/protocol/x;->u:Ljava/lang/String;

    if-eqz v0, :cond_f

    const-string v0, "raw_function"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->u:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_f
    iget-object v0, p0, Lio/sentry/protocol/x;->s:Ljava/lang/String;

    if-eqz v0, :cond_10

    const-string v0, "symbol"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->s:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_10
    iget-object v0, p0, Lio/sentry/protocol/x;->v:Lio/sentry/b2;

    if-eqz v0, :cond_11

    const-string v0, "lock"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->v:Lio/sentry/b2;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_11
    iget-object v0, p0, Lio/sentry/protocol/x;->a:Ljava/util/List;

    if-eqz v0, :cond_12

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    const-string v0, "pre_context"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->a:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_12
    iget-object v0, p0, Lio/sentry/protocol/x;->b:Ljava/util/List;

    if-eqz v0, :cond_13

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    const-string v0, "post_context"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->b:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_13
    iget-object v0, p0, Lio/sentry/protocol/x;->c:Ljava/util/Map;

    if-eqz v0, :cond_14

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_14

    const-string v0, "vars"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/protocol/x;->c:Ljava/util/Map;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    :cond_14
    iget-object v0, p0, Lio/sentry/protocol/x;->t:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_15

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/x;->t:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lio/sentry/d;->b(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lio/sentry/internal/debugmeta/c;Ljava/lang/String;Lio/sentry/ILogger;)V

    goto :goto_0

    :cond_15
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->k()Lio/sentry/internal/debugmeta/c;

    return-void
.end method
