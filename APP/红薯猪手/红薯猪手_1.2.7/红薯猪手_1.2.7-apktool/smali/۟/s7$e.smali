.class public final L۟/s7$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/s7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final ۥ:F

.field public final ۥ۟:F

.field public final ۥ۟۟:J

.field public final ۥ۟۠:F

.field public final ۥ۟ۡ:F

.field public final synthetic ۥ۟ۢ:L۟/s7;


# direct methods
.method public constructor <init>(L۟/s7;FFFF)V
    .locals 0

    iput-object p1, p0, L۟/s7$e;->ۥ۟ۢ:L۟/s7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, L۟/s7$e;->ۥ:F

    iput p5, p0, L۟/s7$e;->ۥ۟:F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    iput-wide p4, p0, L۟/s7$e;->ۥ۟۟:J

    iput p2, p0, L۟/s7$e;->ۥ۟۠:F

    iput p3, p0, L۟/s7$e;->ۥ۟ۡ:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, L۟/s7$e;->ۥ۟۟:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    long-to-float v0, v0

    .line 9
    const/high16 v1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    mul-float/2addr v0, v1

    .line 12
    iget-object v2, p0, L۟/s7$e;->ۥ۟ۢ:L۟/s7;

    .line 13
    .line 14
    iget v2, v2, L۟/s7;->ۥ۟:I

    .line 15
    .line 16
    int-to-float v2, v2

    .line 17
    div-float/2addr v0, v2

    .line 18
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, L۟/s7$e;->ۥ۟ۢ:L۟/s7;

    .line 23
    .line 24
    iget-object v2, v2, L۟/s7;->ۥ:Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;->getInterpolation(F)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v2, p0, L۟/s7$e;->ۥ۟۠:F

    .line 31
    .line 32
    iget v3, p0, L۟/s7$e;->ۥ۟ۡ:F

    .line 33
    .line 34
    sub-float/2addr v3, v2

    .line 35
    mul-float/2addr v3, v0

    .line 36
    add-float/2addr v3, v2

    .line 37
    iget-object v2, p0, L۟/s7$e;->ۥ۟ۢ:L۟/s7;

    .line 38
    .line 39
    invoke-virtual {v2}, L۟/s7;->ۥ۟ۢ()F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    div-float/2addr v3, v2

    .line 44
    iget-object v2, p0, L۟/s7$e;->ۥ۟ۢ:L۟/s7;

    .line 45
    .line 46
    iget-object v2, v2, L۟/s7;->ۥۡ:L۟/s7$a;

    .line 47
    .line 48
    iget v4, p0, L۟/s7$e;->ۥ:F

    .line 49
    .line 50
    iget v5, p0, L۟/s7$e;->ۥ۟:F

    .line 51
    .line 52
    invoke-virtual {v2, v3, v4, v5}, L۟/s7$a;->ۥ(FFF)V

    .line 53
    .line 54
    .line 55
    cmpg-float v0, v0, v1

    .line 56
    .line 57
    if-gez v0, :cond_0

    .line 58
    .line 59
    iget-object v0, p0, L۟/s7$e;->ۥ۟ۢ:L۟/s7;

    .line 60
    .line 61
    iget-object v0, v0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void
.end method
