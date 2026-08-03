.class public final Lio/sentry/android/core/performance/h;
.super Lio/sentry/android/core/internal/gestures/i;
.source ""


# instance fields
.field public final b:LNk;


# direct methods
.method public constructor <init>(Landroid/view/Window$Callback;LNk;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/internal/gestures/i;-><init>(Landroid/view/Window$Callback;)V

    iput-object p2, p0, Lio/sentry/android/core/performance/h;->b:LNk;

    return-void
.end method


# virtual methods
.method public final onContentChanged()V
    .locals 1

    invoke-super {p0}, Lio/sentry/android/core/internal/gestures/i;->onContentChanged()V

    iget-object v0, p0, Lio/sentry/android/core/performance/h;->b:LNk;

    invoke-virtual {v0}, LNk;->run()V

    return-void
.end method
