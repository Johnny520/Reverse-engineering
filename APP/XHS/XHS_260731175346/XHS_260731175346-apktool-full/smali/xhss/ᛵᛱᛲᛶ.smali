.class public final Lxhss/ᛵᛱᛲᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:J

.field public ᛳᲁᲇᛸ:J

.field public ᛷᛴᛷᛱ:Lxhss/ᲇᛲᛵ;

.field public ᛷᛵᛵᲈ:Landroid/os/Handler;

.field public ᛸᛲᲀᛵ:I

.field public ᛸᛴᛶᛳ:F

.field public ᛸᛷᲈᲈ:I

.field public ᲀᲇᛳᲁ:F

.field public ᲇᛴᲇᛵ:Z

.field public ᲇᛶᛴᲀ:Landroid/view/animation/Interpolator;

.field public ᲈᛳᲀ:I


# direct methods
.method public static ᛷᛵᛵᲈ(FF)Lxhss/ᛵᛱᛲᛶ;
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛵᛱᛲᛶ;

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
    iput-object v1, v0, Lxhss/ᛵᛱᛲᛶ;->ᛷᛵᛵᲈ:Landroid/os/Handler;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

    .line 19
    .line 20
    iput v1, v0, Lxhss/ᛵᛱᛲᛶ;->ᛸᛲᲀᛵ:I

    .line 21
    .line 22
    iput v1, v0, Lxhss/ᛵᛱᛲᛶ;->ᛸᛷᲈᲈ:I

    .line 23
    .line 24
    const/16 v1, 0x10

    .line 25
    .line 26
    iput v1, v0, Lxhss/ᛵᛱᛲᛶ;->ᲈᛳᲀ:I

    .line 27
    .line 28
    iput p0, v0, Lxhss/ᛵᛱᛲᛶ;->ᲀᲇᛳᲁ:F

    .line 29
    .line 30
    iput p1, v0, Lxhss/ᛵᛱᛲᛶ;->ᛸᛴᛶᛳ:F

    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

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
    iput-boolean v0, p0, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lxhss/ᛵᛱᛲᛶ;->ᛳᲁᲇᛸ:J

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Thread;

    .line 16
    .line 17
    new-instance v1, Lxhss/ᛴᲈᲀᲇ;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, v2, p0}, Lxhss/ᛴᲈᲀᲇ;-><init>(ILjava/lang/Object;)V

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
