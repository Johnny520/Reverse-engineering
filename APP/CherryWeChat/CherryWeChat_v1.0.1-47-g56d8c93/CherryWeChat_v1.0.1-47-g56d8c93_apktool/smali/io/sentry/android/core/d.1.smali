.class public final synthetic Lio/sentry/android/core/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/sentry/android/core/ActivityLifecycleIntegration;

.field public final synthetic c:Lio/sentry/g0;

.field public final synthetic d:Lio/sentry/g0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/g0;Lio/sentry/g0;I)V
    .locals 0

    iput p4, p0, Lio/sentry/android/core/d;->a:I

    iput-object p1, p0, Lio/sentry/android/core/d;->b:Lio/sentry/android/core/ActivityLifecycleIntegration;

    iput-object p2, p0, Lio/sentry/android/core/d;->c:Lio/sentry/g0;

    iput-object p3, p0, Lio/sentry/android/core/d;->d:Lio/sentry/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lio/sentry/android/core/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/d;->c:Lio/sentry/g0;

    iget-object v1, p0, Lio/sentry/android/core/d;->d:Lio/sentry/g0;

    iget-object v2, p0, Lio/sentry/android/core/d;->b:Lio/sentry/android/core/ActivityLifecycleIntegration;

    invoke-virtual {v2, v0, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->m(Lio/sentry/g0;Lio/sentry/g0;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/d;->c:Lio/sentry/g0;

    iget-object v1, p0, Lio/sentry/android/core/d;->d:Lio/sentry/g0;

    iget-object v2, p0, Lio/sentry/android/core/d;->b:Lio/sentry/android/core/ActivityLifecycleIntegration;

    invoke-virtual {v2, v0, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->m(Lio/sentry/g0;Lio/sentry/g0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
