.class public final Lio/sentry/android/core/h0;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field public final a:Lio/sentry/Z;

.field public final b:Lio/sentry/android/core/SentryAndroidOptions;

.field public final c:Lio/sentry/android/core/internal/util/f;

.field public final d:[C

.field public final synthetic e:Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/Z;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 3

    iput-object p1, p0, Lio/sentry/android/core/h0;->e:Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance p1, Lio/sentry/android/core/internal/util/f;

    const-wide/32 v0, 0xea60

    const/4 v2, 0x0

    invoke-direct {p1, v2, v0, v1}, Lio/sentry/android/core/internal/util/f;-><init>(IJ)V

    iput-object p1, p0, Lio/sentry/android/core/h0;->c:Lio/sentry/android/core/internal/util/f;

    const/16 p1, 0x40

    new-array p1, p1, [C

    iput-object p1, p0, Lio/sentry/android/core/h0;->d:[C

    iput-object p2, p0, Lio/sentry/android/core/h0;->a:Lio/sentry/Z;

    iput-object p3, p0, Lio/sentry/android/core/h0;->b:Lio/sentry/android/core/SentryAndroidOptions;

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lio/sentry/android/core/h0;->b:Lio/sentry/android/core/SentryAndroidOptions;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/sentry/android/core/h0;->c:Lio/sentry/android/core/internal/util/f;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p2, v1}, Lio/sentry/android/core/M;->b(Landroid/content/Intent;Lio/sentry/v2;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Float;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    invoke-static {p2, v1}, Lio/sentry/android/core/M;->d(Landroid/content/Intent;Lio/sentry/v2;)Ljava/lang/Boolean;

    move-result-object v3

    new-instance v4, Lio/sentry/android/core/g0;

    invoke-direct {v4, v0, v3}, Lio/sentry/android/core/g0;-><init>(Ljava/lang/Integer;Ljava/lang/Boolean;)V

    iget-object v0, p0, Lio/sentry/android/core/h0;->e:Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    iget-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->l:Lio/sentry/android/core/g0;

    invoke-virtual {v4, v3}, Lio/sentry/android/core/g0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    return-void

    :cond_2
    iput-object v4, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->l:Lio/sentry/android/core/g0;

    goto :goto_2

    :cond_3
    move-object v4, v2

    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    new-instance v0, Lio/sentry/f;

    invoke-direct {v0, v5, v6}, Lio/sentry/f;-><init>(J)V

    const-string v3, "system"

    iput-object v3, v0, Lio/sentry/f;->e:Ljava/lang/String;

    const-string v3, "device.event"

    iput-object v3, v0, Lio/sentry/f;->g:Ljava/lang/String;

    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    iget-object v3, p0, Lio/sentry/android/core/h0;->d:[C

    array-length v5, v3

    add-int/lit8 v2, v2, -0x1

    :goto_3
    if-ltz v2, :cond_7

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x2e

    if-ne v6, v7, :cond_5

    new-instance v2, Ljava/lang/String;

    array-length v6, v3

    sub-int/2addr v6, v5

    invoke-direct {v2, v3, v5, v6}, Ljava/lang/String;-><init>([CII)V

    goto :goto_4

    :cond_5
    if-nez v5, :cond_6

    sget-object v2, Lio/sentry/util/j;->a:Ljava/nio/charset/Charset;

    const-string v2, "."

    invoke-virtual {p1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v2, v2, 0x1

    if-le v3, v2, :cond_7

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_6
    add-int/lit8 v5, v5, -0x1

    aput-char v6, v3, v5

    add-int/lit8 v2, v2, -0x1

    goto :goto_3

    :cond_7
    move-object v2, p1

    :goto_4
    if-eqz v2, :cond_8

    const-string v3, "action"

    invoke-virtual {v0, v3, v2}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    if-eqz v4, :cond_a

    iget-object p1, v4, Lio/sentry/android/core/g0;->a:Ljava/lang/Integer;

    if-eqz p1, :cond_9

    const-string v1, "level"

    invoke-virtual {v0, v1, p1}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_9
    iget-object p1, v4, Lio/sentry/android/core/g0;->b:Ljava/lang/Boolean;

    if-eqz p1, :cond_d

    const-string v1, "charging"

    invoke-virtual {v0, v1, p1}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableSystemEventBreadcrumbsExtras()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_d

    new-instance v3, Ljava/util/HashMap;

    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(I)V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_b
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    :try_start_0
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v6

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v7

    sget-object v8, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v9, "%s key of the %s action threw an error."

    filled-new-array {v5, p1}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v7, v8, v6, v9, v5}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    :cond_c
    const-string p1, "extras"

    invoke-virtual {v0, p1, v3}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_d
    :goto_6
    sget-object p1, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    iput-object p1, v0, Lio/sentry/f;->i:Lio/sentry/a2;

    new-instance p1, Lio/sentry/H;

    invoke-direct {p1}, Lio/sentry/H;-><init>()V

    const-string v1, "android:intent"

    invoke-virtual {p1, v1, p2}, Lio/sentry/H;->c(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p2, p0, Lio/sentry/android/core/h0;->a:Lio/sentry/Z;

    invoke-interface {p2, v0, p1}, Lio/sentry/Z;->f(Lio/sentry/f;Lio/sentry/H;)V

    return-void
.end method
