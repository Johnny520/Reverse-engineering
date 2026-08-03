.class public final synthetic Lio/sentry/android/core/A;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/A;->a:Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    iput-wide p2, p0, Lio/sentry/android/core/A;->b:J

    iput p4, p0, Lio/sentry/android/core/A;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/A;->a:Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    iget-object v1, v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->b:Lio/sentry/w1;

    if-eqz v1, :cond_0

    new-instance v1, Lio/sentry/f;

    iget-wide v2, p0, Lio/sentry/android/core/A;->b:J

    invoke-direct {v1, v2, v3}, Lio/sentry/f;-><init>(J)V

    const-string v2, "system"

    iput-object v2, v1, Lio/sentry/f;->e:Ljava/lang/String;

    const-string v2, "device.event"

    iput-object v2, v1, Lio/sentry/f;->g:Ljava/lang/String;

    const-string v2, "Low memory"

    iput-object v2, v1, Lio/sentry/f;->d:Ljava/lang/String;

    const-string v2, "action"

    const-string v3, "LOW_MEMORY"

    invoke-virtual {v1, v2, v3}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "level"

    iget v3, p0, Lio/sentry/android/core/A;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    iput-object v2, v1, Lio/sentry/f;->i:Lio/sentry/a2;

    iget-object v0, v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->b:Lio/sentry/w1;

    sget-object v2, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->e:Lio/sentry/H;

    invoke-virtual {v0, v1, v2}, Lio/sentry/w1;->f(Lio/sentry/f;Lio/sentry/H;)V

    :cond_0
    return-void
.end method
