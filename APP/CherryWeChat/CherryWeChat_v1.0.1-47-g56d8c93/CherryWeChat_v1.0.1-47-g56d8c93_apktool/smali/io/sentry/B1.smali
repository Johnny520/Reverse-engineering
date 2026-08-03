.class public final Lio/sentry/B1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/I1;


# instance fields
.field public final a:Lio/sentry/I1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v0, Lio/sentry/util/f;->a:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lio/sentry/util/f;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Lio/sentry/X1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/sentry/X1;-><init>(I)V

    iput-object v0, p0, Lio/sentry/B1;->a:Lio/sentry/I1;

    return-void

    :cond_0
    new-instance v0, Lio/sentry/X1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/sentry/X1;-><init>(I)V

    iput-object v0, p0, Lio/sentry/B1;->a:Lio/sentry/I1;

    return-void
.end method


# virtual methods
.method public final a()Lio/sentry/H1;
    .locals 1

    iget-object v0, p0, Lio/sentry/B1;->a:Lio/sentry/I1;

    invoke-interface {v0}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object v0

    return-object v0
.end method
