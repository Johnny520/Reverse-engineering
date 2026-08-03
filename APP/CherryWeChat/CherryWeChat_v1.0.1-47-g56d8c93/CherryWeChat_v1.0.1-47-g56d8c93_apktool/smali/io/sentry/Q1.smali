.class public final Lio/sentry/Q1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/C0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Lio/sentry/Z1;

.field public final f:I

.field public final g:Ljava/util/concurrent/Callable;

.field public final h:Ljava/lang/String;

.field public i:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lio/sentry/Z1;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/sentry/Q1;->e:Lio/sentry/Z1;

    .line 3
    iput-object p3, p0, Lio/sentry/Q1;->a:Ljava/lang/String;

    .line 4
    iput p2, p0, Lio/sentry/Q1;->f:I

    .line 5
    iput-object p4, p0, Lio/sentry/Q1;->c:Ljava/lang/String;

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lio/sentry/Q1;->g:Ljava/util/concurrent/Callable;

    .line 7
    iput-object p5, p0, Lio/sentry/Q1;->h:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lio/sentry/Q1;->d:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lio/sentry/Q1;->b:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Lio/sentry/Z1;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 10
    invoke-direct/range {v0 .. v7}, Lio/sentry/Q1;-><init>(Lio/sentry/Z1;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/Z1;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, "type is required"

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/Q1;->e:Lio/sentry/Z1;

    .line 13
    iput-object p3, p0, Lio/sentry/Q1;->a:Ljava/lang/String;

    const/4 p1, -0x1

    .line 14
    iput p1, p0, Lio/sentry/Q1;->f:I

    .line 15
    iput-object p4, p0, Lio/sentry/Q1;->c:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lio/sentry/Q1;->g:Ljava/util/concurrent/Callable;

    .line 17
    iput-object p5, p0, Lio/sentry/Q1;->h:Ljava/lang/String;

    .line 18
    iput-object p6, p0, Lio/sentry/Q1;->d:Ljava/lang/String;

    .line 19
    iput-object p7, p0, Lio/sentry/Q1;->b:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lio/sentry/Q1;->g:Ljava/util/concurrent/Callable;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    const/4 v0, -0x1

    return v0

    :cond_0
    iget v0, p0, Lio/sentry/Q1;->f:I

    return v0
.end method

.method public final serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 3

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->h()Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/Q1;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "content_type"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_0
    iget-object v0, p0, Lio/sentry/Q1;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "filename"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_1
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/Q1;->e:Lio/sentry/Z1;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/Q1;->h:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v1, "attachment_type"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_2
    iget-object v0, p0, Lio/sentry/Q1;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v1, "platform"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    :cond_3
    iget-object v0, p0, Lio/sentry/Q1;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    const-string v1, "item_count"

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/Number;)Lio/sentry/internal/debugmeta/c;

    :cond_4
    const-string v0, "length"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p0}, Lio/sentry/Q1;->a()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lio/sentry/internal/debugmeta/c;->v(J)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/Q1;->i:Ljava/util/HashMap;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/Q1;->i:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lio/sentry/d;->a(Ljava/util/HashMap;Ljava/lang/String;Lio/sentry/internal/debugmeta/c;Ljava/lang/String;Lio/sentry/ILogger;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->k()Lio/sentry/internal/debugmeta/c;

    return-void
.end method
