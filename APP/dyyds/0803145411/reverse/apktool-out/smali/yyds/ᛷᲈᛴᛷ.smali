.class public final Lyyds/ᛷᲈᛴᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲀᛲᛳᲀ:Landroid/os/Handler;


# instance fields
.field public ᛲᲈᲁ:Landroid/app/Application;

.field public ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lyyds/ᛷᲈᛴᛷ;->ᲀᛲᛳᲀ:Landroid/os/Handler;

    .line 11
    .line 12
    return-void
.end method

.method public static ᛲᲈᲁ()Landroid/app/Activity;
    .locals 5

    .line 1
    invoke-static {}, Lyyds/ᲈᛶᛲᛶ;->ᛲᲈᲁ()Lyyds/ᲈᛶᛲᛶ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lyyds/ᲈᛶᛲᛶ;->ᛵᛸᛸᛷ:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-static {}, Lyyds/ᲈᛶᛲᛶ;->ᛲᲈᲁ()Lyyds/ᲈᛶᛲᛶ;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, Lyyds/ᲈᛶᛲᛶ;->ᛲᲈᲁ:Landroid/app/Activity;

    .line 12
    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-eq v1, v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    invoke-static {}, Lyyds/ᲈᛶᛲᛶ;->ᛲᲈᲁ()Lyyds/ᲈᛶᛲᛶ;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-wide v1, v1, Lyyds/ᲈᛶᛲᛶ;->ᲀᛲᛳᲀ:J

    .line 40
    .line 41
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 v4, 0x24

    .line 44
    .line 45
    if-lt v3, v4, :cond_4

    .line 46
    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    sub-long/2addr v3, v1

    .line 52
    const-wide/16 v1, 0xc8

    .line 53
    .line 54
    cmp-long v1, v3, v1

    .line 55
    .line 56
    if-gez v1, :cond_4

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    return-object v0

    .line 60
    :cond_5
    :goto_0
    const/4 v0, 0x0

    .line 61
    return-object v0
.end method
