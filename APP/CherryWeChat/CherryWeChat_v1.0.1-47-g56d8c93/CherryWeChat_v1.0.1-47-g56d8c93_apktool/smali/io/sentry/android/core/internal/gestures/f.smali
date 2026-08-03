.class public final Lio/sentry/android/core/internal/gestures/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public final b:Lio/sentry/Z;

.field public final c:Lio/sentry/android/core/SentryAndroidOptions;

.field public d:Lio/sentry/internal/gestures/b;

.field public e:Lio/sentry/i0;

.field public f:Lio/sentry/android/core/internal/gestures/d;

.field public final g:Lio/sentry/android/core/internal/gestures/e;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lio/sentry/w1;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->d:Lio/sentry/internal/gestures/b;

    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->e:Lio/sentry/i0;

    sget-object v0, Lio/sentry/android/core/internal/gestures/d;->Unknown:Lio/sentry/android/core/internal/gestures/d;

    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->f:Lio/sentry/android/core/internal/gestures/d;

    new-instance v1, Lio/sentry/android/core/internal/gestures/e;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lio/sentry/android/core/internal/gestures/e;->a:Lio/sentry/android/core/internal/gestures/d;

    const/4 v0, 0x0

    iput v0, v1, Lio/sentry/android/core/internal/gestures/e;->c:F

    iput v0, v1, Lio/sentry/android/core/internal/gestures/e;->d:F

    iput-object v1, p0, Lio/sentry/android/core/internal/gestures/f;->g:Lio/sentry/android/core/internal/gestures/e;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->a:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lio/sentry/android/core/internal/gestures/f;->b:Lio/sentry/Z;

    iput-object p3, p0, Lio/sentry/android/core/internal/gestures/f;->c:Lio/sentry/android/core/SentryAndroidOptions;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/internal/gestures/b;Lio/sentry/android/core/internal/gestures/d;Ljava/util/Map;Landroid/view/MotionEvent;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->c:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/v2;->isEnableUserInteractionBreadcrumbs()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lio/sentry/android/core/internal/gestures/c;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const-string p2, "unknown"

    goto :goto_0

    :cond_1
    const-string p2, "swipe"

    goto :goto_0

    :cond_2
    const-string p2, "scroll"

    goto :goto_0

    :cond_3
    const-string p2, "click"

    :goto_0
    new-instance v0, Lio/sentry/H;

    invoke-direct {v0}, Lio/sentry/H;-><init>()V

    const-string v1, "android:motionEvent"

    invoke-virtual {v0, v1, p4}, Lio/sentry/H;->c(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p4, p1, Lio/sentry/internal/gestures/b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p4

    const-string v1, "android:view"

    invoke-virtual {v0, v1, p4}, Lio/sentry/H;->c(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p4, p1, Lio/sentry/internal/gestures/b;->c:Ljava/lang/String;

    iget-object p1, p1, Lio/sentry/internal/gestures/b;->b:Ljava/lang/String;

    new-instance v1, Lio/sentry/f;

    invoke-direct {v1}, Lio/sentry/f;-><init>()V

    const-string v2, "user"

    iput-object v2, v1, Lio/sentry/f;->e:Ljava/lang/String;

    const-string v2, "ui."

    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, v1, Lio/sentry/f;->g:Ljava/lang/String;

    if-eqz p4, :cond_4

    const-string p2, "view.id"

    invoke-virtual {v1, p2, p4}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    if-eqz p1, :cond_5

    const-string p2, "view.class"

    invoke-virtual {v1, p2, p1}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    iget-object p3, v1, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p3, p4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_6
    sget-object p1, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    iput-object p1, v1, Lio/sentry/f;->i:Lio/sentry/a2;

    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/f;->b:Lio/sentry/Z;

    invoke-interface {p1, v1, v0}, Lio/sentry/Z;->f(Lio/sentry/f;Lio/sentry/H;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)Landroid/view/View;
    .locals 6

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, ". No breadcrumb captured."

    iget-object v4, p0, Lio/sentry/android/core/internal/gestures/f;->c:Lio/sentry/android/core/SentryAndroidOptions;

    if-nez v0, :cond_0

    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "Activity is null in "

    invoke-static {v5, p1, v3}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v4, p1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "Window is null in "

    invoke-static {v5, p1, v3}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v4, p1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_1
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "DecorView is null in "

    invoke-static {v5, p1, v3}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v4, p1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_2
    return-object v0
.end method

.method public final c(Lio/sentry/internal/gestures/b;Lio/sentry/android/core/internal/gestures/d;)V
    .locals 12

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->f:Lio/sentry/android/core/internal/gestures/d;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->d:Lio/sentry/internal/gestures/b;

    invoke-virtual {p1, v0}, Lio/sentry/internal/gestures/b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    sget-object v3, Lio/sentry/android/core/internal/gestures/d;->Click:Lio/sentry/android/core/internal/gestures/d;

    if-ne p2, v3, :cond_1

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    :goto_1
    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iget-object v3, p0, Lio/sentry/android/core/internal/gestures/f;->c:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v3}, Lio/sentry/v2;->isTracingEnabled()Z

    move-result v4

    iget-object v5, p0, Lio/sentry/android/core/internal/gestures/f;->b:Lio/sentry/Z;

    if-eqz v4, :cond_c

    invoke-virtual {v3}, Lio/sentry/v2;->isEnableUserInteractionTracing()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_6

    :cond_3
    iget-object v4, p0, Lio/sentry/android/core/internal/gestures/f;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/Activity;

    if-nez v4, :cond_4

    invoke-virtual {v3}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v0, "Activity is null, no transaction captured."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    iget-object v6, p1, Lio/sentry/internal/gestures/b;->c:Ljava/lang/String;

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    const-string v6, "UiElement.tag can\'t be null"

    invoke-static {v6, v7}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v6, v7

    :goto_3
    iget-object v8, p0, Lio/sentry/android/core/internal/gestures/f;->e:Lio/sentry/i0;

    if-eqz v8, :cond_7

    if-nez v0, :cond_6

    invoke-interface {v8}, Lio/sentry/g0;->f()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v3}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v0, "The view with id: "

    const-string v2, " already has an ongoing transaction assigned. Rescheduling finish"

    invoke-static {v0, v6, v2}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v3}, Lio/sentry/v2;->getIdleTimeout()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/f;->e:Lio/sentry/i0;

    invoke-interface {p1}, Lio/sentry/i0;->k()V

    return-void

    :cond_6
    sget-object v0, Lio/sentry/L2;->OK:Lio/sentry/L2;

    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/gestures/f;->d(Lio/sentry/L2;)V

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lio/sentry/android/core/internal/gestures/c;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v1, v1, v4

    if-eq v1, v2, :cond_a

    const/4 v4, 0x2

    if-eq v1, v4, :cond_9

    const/4 v4, 0x3

    if-eq v1, v4, :cond_8

    const-string v1, "unknown"

    goto :goto_4

    :cond_8
    const-string v1, "swipe"

    goto :goto_4

    :cond_9
    const-string v1, "scroll"

    goto :goto_4

    :cond_a
    const-string v1, "click"

    :goto_4
    const-string v4, "ui.action."

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lio/sentry/Q2;

    invoke-direct {v4}, Lio/sentry/Q2;-><init>()V

    iput-boolean v2, v4, Lio/sentry/Q2;->f:Z

    invoke-virtual {v3}, Lio/sentry/v2;->getDeadlineTimeout()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v6, v8, v10

    if-gtz v6, :cond_b

    move-object v6, v7

    goto :goto_5

    :cond_b
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_5
    iput-object v6, v4, Lio/sentry/Q2;->h:Ljava/lang/Long;

    invoke-virtual {v3}, Lio/sentry/v2;->getIdleTimeout()Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v4, Lio/sentry/Q2;->g:Ljava/lang/Long;

    iput-boolean v2, v4, LZd;->a:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "auto.ui.gesture_listener."

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p1, Lio/sentry/internal/gestures/b;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, LZd;->d:Ljava/lang/Object;

    new-instance v2, Lio/sentry/P2;

    sget-object v3, Lio/sentry/protocol/C;->COMPONENT:Lio/sentry/protocol/C;

    invoke-direct {v2, v0, v3, v1, v7}, Lio/sentry/P2;-><init>(Ljava/lang/String;Lio/sentry/protocol/C;Ljava/lang/String;Lvx;)V

    invoke-interface {v5, v2, v4}, Lio/sentry/Z;->k(Lio/sentry/P2;Lio/sentry/Q2;)Lio/sentry/i0;

    move-result-object v0

    new-instance v1, LQ9;

    const/16 v2, 0xa

    invoke-direct {v1, v2, p0, v0}, LQ9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v5, v1}, Lio/sentry/Z;->m(Lio/sentry/s1;)V

    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->e:Lio/sentry/i0;

    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/f;->d:Lio/sentry/internal/gestures/b;

    iput-object p2, p0, Lio/sentry/android/core/internal/gestures/f;->f:Lio/sentry/android/core/internal/gestures/d;

    return-void

    :cond_c
    :goto_6
    if-eqz v0, :cond_e

    invoke-virtual {v3}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoTraceIdGeneration()Z

    move-result v0

    if-eqz v0, :cond_d

    new-instance v0, Lio/sentry/android/core/T;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lio/sentry/android/core/T;-><init>(I)V

    invoke-interface {v5, v0}, Lio/sentry/Z;->m(Lio/sentry/s1;)V

    :cond_d
    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/f;->d:Lio/sentry/internal/gestures/b;

    iput-object p2, p0, Lio/sentry/android/core/internal/gestures/f;->f:Lio/sentry/android/core/internal/gestures/d;

    :cond_e
    return-void
.end method

.method public final d(Lio/sentry/L2;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->e:Lio/sentry/i0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lio/sentry/g0;->o()Lio/sentry/L2;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->e:Lio/sentry/i0;

    invoke-interface {v0, p1}, Lio/sentry/g0;->n(Lio/sentry/L2;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/f;->e:Lio/sentry/i0;

    invoke-interface {p1}, Lio/sentry/g0;->r()V

    :cond_1
    :goto_0
    new-instance p1, Lrl;

    const/16 v0, 0xa

    invoke-direct {p1, v0, p0}, Lrl;-><init>(ILjava/lang/Object;)V

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->b:Lio/sentry/Z;

    invoke-interface {v0, p1}, Lio/sentry/Z;->m(Lio/sentry/s1;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/f;->e:Lio/sentry/i0;

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/f;->d:Lio/sentry/internal/gestures/b;

    if-eqz v0, :cond_2

    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/f;->d:Lio/sentry/internal/gestures/b;

    :cond_2
    sget-object p1, Lio/sentry/android/core/internal/gestures/d;->Unknown:Lio/sentry/android/core/internal/gestures/d;

    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/f;->f:Lio/sentry/android/core/internal/gestures/d;

    return-void
.end method

.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    iget-object v2, p0, Lio/sentry/android/core/internal/gestures/f;->g:Lio/sentry/android/core/internal/gestures/e;

    iput-object v1, v2, Lio/sentry/android/core/internal/gestures/e;->b:Lio/sentry/internal/gestures/b;

    sget-object v1, Lio/sentry/android/core/internal/gestures/d;->Unknown:Lio/sentry/android/core/internal/gestures/d;

    iput-object v1, v2, Lio/sentry/android/core/internal/gestures/e;->a:Lio/sentry/android/core/internal/gestures/d;

    const/4 v1, 0x0

    iput v1, v2, Lio/sentry/android/core/internal/gestures/e;->c:F

    iput v1, v2, Lio/sentry/android/core/internal/gestures/e;->d:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v2, Lio/sentry/android/core/internal/gestures/e;->c:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, v2, Lio/sentry/android/core/internal/gestures/e;->d:F

    return v0
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    iget-object p1, p0, Lio/sentry/android/core/internal/gestures/f;->g:Lio/sentry/android/core/internal/gestures/e;

    sget-object p2, Lio/sentry/android/core/internal/gestures/d;->Swipe:Lio/sentry/android/core/internal/gestures/d;

    iput-object p2, p1, Lio/sentry/android/core/internal/gestures/e;->a:Lio/sentry/android/core/internal/gestures/d;

    const/4 p1, 0x0

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 4

    const-string p2, "onScroll"

    invoke-virtual {p0, p2}, Lio/sentry/android/core/internal/gestures/f;->b(Ljava/lang/String;)Landroid/view/View;

    move-result-object p2

    const/4 p3, 0x0

    if-eqz p2, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p4, p0, Lio/sentry/android/core/internal/gestures/f;->g:Lio/sentry/android/core/internal/gestures/e;

    iget-object v0, p4, Lio/sentry/android/core/internal/gestures/e;->a:Lio/sentry/android/core/internal/gestures/d;

    sget-object v1, Lio/sentry/android/core/internal/gestures/d;->Unknown:Lio/sentry/android/core/internal/gestures/d;

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    sget-object v1, Lio/sentry/internal/gestures/a;->SCROLLABLE:Lio/sentry/internal/gestures/a;

    iget-object v2, p0, Lio/sentry/android/core/internal/gestures/f;->c:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v2, p2, v0, p1, v1}, Lio/sentry/android/core/internal/gestures/h;->a(Lio/sentry/android/core/SentryAndroidOptions;Landroid/view/View;FFLio/sentry/internal/gestures/a;)Lio/sentry/internal/gestures/b;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v0, "Unable to find scroll target. No breadcrumb captured."

    new-array v1, p3, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/android/core/internal/gestures/d;->Scroll:Lio/sentry/android/core/internal/gestures/d;

    iput-object p1, p4, Lio/sentry/android/core/internal/gestures/e;->a:Lio/sentry/android/core/internal/gestures/d;

    return p3

    :cond_1
    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Scroll target found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p1, Lio/sentry/internal/gestures/b;->c:Ljava/lang/String;

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    const-string v2, "UiElement.tag can\'t be null"

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, p3, [Ljava/lang/Object;

    invoke-interface {p2, v0, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p4, Lio/sentry/android/core/internal/gestures/e;->b:Lio/sentry/internal/gestures/b;

    sget-object p1, Lio/sentry/android/core/internal/gestures/d;->Scroll:Lio/sentry/android/core/internal/gestures/d;

    iput-object p1, p4, Lio/sentry/android/core/internal/gestures/e;->a:Lio/sentry/android/core/internal/gestures/d;

    :cond_3
    :goto_1
    return p3
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 6

    const-string v0, "onSingleTapUp"

    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/gestures/f;->b(Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    sget-object v4, Lio/sentry/internal/gestures/a;->CLICKABLE:Lio/sentry/internal/gestures/a;

    iget-object v5, p0, Lio/sentry/android/core/internal/gestures/f;->c:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v5, v0, v2, v3, v4}, Lio/sentry/android/core/internal/gestures/h;->a(Lio/sentry/android/core/SentryAndroidOptions;Landroid/view/View;FFLio/sentry/internal/gestures/a;)Lio/sentry/internal/gestures/b;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v2, "Unable to find click target. No breadcrumb captured."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    :cond_1
    sget-object v2, Lio/sentry/android/core/internal/gestures/d;->Click:Lio/sentry/android/core/internal/gestures/d;

    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-virtual {p0, v0, v2, v3, p1}, Lio/sentry/android/core/internal/gestures/f;->a(Lio/sentry/internal/gestures/b;Lio/sentry/android/core/internal/gestures/d;Ljava/util/Map;Landroid/view/MotionEvent;)V

    invoke-virtual {p0, v0, v2}, Lio/sentry/android/core/internal/gestures/f;->c(Lio/sentry/internal/gestures/b;Lio/sentry/android/core/internal/gestures/d;)V

    :cond_2
    :goto_0
    return v1
.end method
