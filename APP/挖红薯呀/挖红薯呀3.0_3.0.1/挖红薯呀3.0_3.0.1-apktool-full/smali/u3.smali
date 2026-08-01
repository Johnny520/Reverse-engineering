.class public final Lu3;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lw3;


# direct methods
.method public constructor <init>(Lw3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu3;->d:Lw3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lu3;->d:Lw3;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lw3;->u0:Landroid/view/MotionEvent;

    .line 7
    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    invoke-virtual {v1, p0}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x3

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    move p0, v4

    .line 20
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/16 p0, 0xa

    .line 27
    .line 28
    if-eq v2, p0, :cond_3

    .line 29
    .line 30
    if-eq v2, v4, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-eq v2, v4, :cond_3

    .line 34
    .line 35
    :goto_0
    const/4 p0, 0x7

    .line 36
    if-eq v2, p0, :cond_2

    .line 37
    .line 38
    const/16 v3, 0x9

    .line 39
    .line 40
    if-eq v2, v3, :cond_2

    .line 41
    .line 42
    const/4 p0, 0x2

    .line 43
    :cond_2
    move v2, p0

    .line 44
    iget-wide v3, v0, Lw3;->v0:J

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-virtual/range {v0 .. v5}, Lw3;->F(Landroid/view/MotionEvent;IJZ)V

    .line 48
    .line 49
    .line 50
    :cond_3
    return-void
.end method
