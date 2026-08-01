.class public final Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Landroid/view/animation/Interpolator;

.field public 飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;

.field public 飘花落叶言子楪世哲兰苏:Z

.field public 飘花落叶言子楪世哲苏兰:J

.field public 飘花落叶言子楪世苏兰哲:J

.field public 飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

.field public 飘花落叶言子楪苏世兰哲:F

.field public 飘花落叶言子楪苏世哲兰:F

.field public 飘花落叶言子楪苏兰世哲:I

.field public 飘花落叶言子楪苏哲世兰:I

.field public 飘花落叶言子楪苏哲兰世:I


# direct methods
.method public static 飘花落叶言子楪世苏哲兰(FF)Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;
    .locals 3

    .line 1
    new-instance v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

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
    iput-object v1, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 19
    .line 20
    iput v1, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:I

    .line 21
    .line 22
    iput v1, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:I

    .line 23
    .line 24
    const/16 v1, 0x10

    .line 25
    .line 26
    iput v1, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:I

    .line 27
    .line 28
    iput p0, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:F

    .line 29
    .line 30
    iput p1, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:F

    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

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
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Thread;

    .line 16
    .line 17
    new-instance v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 18
    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 28
    .line 29
    .line 30
    return-void
.end method
