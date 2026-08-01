.class public final Lxhss/ᛴᛴᛲᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field public static volatile ᲇᛴᲇᛵ:Lxhss/ᛴᛴᛲᛸ;


# instance fields
.field public ᛱᛱᛲᲇ:Landroid/app/Activity;

.field public ᛳᲁᲇᛸ:J

.field public ᛷᛵᛵᲈ:Landroid/app/Activity;


# direct methods
.method public static ᛷᛵᛵᲈ()Lxhss/ᛴᛴᛲᛸ;
    .locals 2

    .line 1
    sget-object v0, Lxhss/ᛴᛴᛲᛸ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛴᛲᛸ;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lxhss/ᛴᛴᛲᛸ;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lxhss/ᛴᛴᛲᛸ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛴᛲᛸ;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lxhss/ᛴᛴᛲᛸ;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lxhss/ᛴᛴᛲᛸ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛴᛲᛸ;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    sget-object v0, Lxhss/ᛴᛴᛲᛸ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛴᛲᛸ;

    .line 27
    .line 28
    return-object v0
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛴᛴᛲᛸ;->ᛷᛵᛵᲈ:Landroid/app/Activity;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lxhss/ᛴᛴᛲᛸ;->ᛷᛵᛵᲈ:Landroid/app/Activity;

    .line 8
    .line 9
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lxhss/ᛴᛴᛲᛸ;->ᛱᛱᛲᲇ:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lxhss/ᛴᛴᛲᛸ;->ᛳᲁᲇᛸ:J

    .line 8
    .line 9
    iget-object v0, p0, Lxhss/ᛴᛴᛲᛸ;->ᛷᛵᛵᲈ:Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iput-object p1, p0, Lxhss/ᛴᛴᛲᛸ;->ᛷᛵᛵᲈ:Landroid/app/Activity;

    .line 15
    .line 16
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᛴᛴᛲᛸ;->ᛷᛵᛵᲈ:Landroid/app/Activity;

    .line 2
    .line 3
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛴᛴᛲᛸ;->ᛱᛱᛲᲇ:Landroid/app/Activity;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lxhss/ᛴᛴᛲᛸ;->ᛱᛱᛲᲇ:Landroid/app/Activity;

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    iput-wide v0, p0, Lxhss/ᛴᛴᛲᛸ;->ᛳᲁᲇᛸ:J

    .line 12
    .line 13
    return-void
.end method
