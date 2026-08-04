.class public final Lyyds/ᛲᛲᛶᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:F

.field public ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:Lyyds/ᲁᲁᛶᛸ;

.field public ᛲᲈᲁ:Landroid/os/Handler;

.field public ᛵᛸᛸᛷ:J

.field public ᛶᛷᛲᲁ:F

.field public ᛷᛲᲈᛱ:I

.field public ᛷᲈᲈᲁ:I

.field public ᲀᛲᛳᲀ:J

.field public ᲇᲇᲇᛱ:Landroid/view/animation/Interpolator;

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method public static ᛲᲈᲁ(FF)Lyyds/ᛲᛲᛶᛶ;
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛲᛲᛶᛶ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lyyds/ᛲᛲᛶᛶ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lyyds/ᛲᛲᛶᛶ;->ᲇᲈᛵᛷ:Z

    .line 19
    .line 20
    iput v1, v0, Lyyds/ᛲᛲᛶᛶ;->ᛲᛳᛶᲁ:I

    .line 21
    .line 22
    iput v1, v0, Lyyds/ᛲᛲᛶᛶ;->ᛷᲈᲈᲁ:I

    .line 23
    .line 24
    const/16 v1, 0x10

    .line 25
    .line 26
    iput v1, v0, Lyyds/ᛲᛲᛶᛶ;->ᛷᛲᲈᛱ:I

    .line 27
    .line 28
    iput p0, v0, Lyyds/ᛲᛲᛶᛶ;->ᛶᛷᛲᲁ:F

    .line 29
    .line 30
    iput p1, v0, Lyyds/ᛲᛲᛶᛶ;->ᛱᲈᲁ:F

    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛲᛲᛶᛶ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lyyds/ᛲᛲᛶᛶ;->ᲇᲈᛵᛷ:Z

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lyyds/ᛲᛲᛶᛶ;->ᲀᛲᛳᲀ:J

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Thread;

    .line 16
    .line 17
    new-instance v1, Lyyds/ᛴᛶᛳᛸ;

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    invoke-direct {v1, v2, p0}, Lyyds/ᛴᛶᛳᛸ;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 27
    .line 28
    .line 29
    return-void
.end method
