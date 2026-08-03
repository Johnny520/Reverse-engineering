.class public final Lio/sentry/clientreport/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/C0;


# instance fields
.field public final a:Ljava/util/Date;

.field public final b:Ljava/util/ArrayList;

.field public c:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/Date;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/clientreport/b;->a:Ljava/util/Date;

    iput-object p2, p0, Lio/sentry/clientreport/b;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 3

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->h()Lio/sentry/internal/debugmeta/c;

    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/clientreport/b;->a:Ljava/util/Date;

    invoke-static {v0}, Lio/sentry/config/a;->t(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    const-string v0, "discarded_events"

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/clientreport/b;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    iget-object v0, p0, Lio/sentry/clientreport/b;->c:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/clientreport/b;->c:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lio/sentry/d;->a(Ljava/util/HashMap;Ljava/lang/String;Lio/sentry/internal/debugmeta/c;Ljava/lang/String;Lio/sentry/ILogger;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->k()Lio/sentry/internal/debugmeta/c;

    return-void
.end method
