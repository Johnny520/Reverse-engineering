.class public LYue/ۥ۟ۢۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۢۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:F

.field public ۥ۟۟۟:F

.field public ۥ۟۟۟۟:J

.field public ۥ۟۟۟۠:J

.field public ۥ۟۟۟ۡ:I

.field public ۥ۟۟۟ۢ:I

.field public ۥۣ۟۟۟:J

.field public ۥ۟۟۟ۤ:F

.field public ۥ۟۟۟ۥ:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۟:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥۣ۟۟۟:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۠:J

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۡ:I

    iput v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۢ:I

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 5

    iget-wide v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۠:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۟(J)F

    move-result v2

    invoke-virtual {p0, v2}, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۡ(F)F

    move-result v2

    iget-wide v3, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۠:J

    sub-long v3, v0, v3

    iput-wide v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۠:J

    long-to-float v0, v3

    mul-float/2addr v0, v2

    iget v1, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟:F

    mul-float/2addr v1, v0

    float-to-int v1, v1

    iput v1, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۡ:I

    iget v1, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۢ:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۡ:I

    return v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۢ:I

    return v0
.end method

.method public ۥ۟۟۟()I
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    div-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public final ۥ۟۟۟۟(J)F
    .locals 8

    iget-wide v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۟:J

    cmp-long v2, p1, v0

    const/4 v3, 0x0

    if-gez v2, :cond_0

    return v3

    :cond_0
    iget-wide v4, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥۣ۟۟۟:J

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    const/high16 v6, 0x3f800000    # 1.0f

    if-ltz v2, :cond_2

    cmp-long v2, p1, v4

    if-gez v2, :cond_1

    goto :goto_0

    :cond_1
    sub-long/2addr p1, v4

    iget v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۤ:F

    sub-float v1, v6, v0

    long-to-float p1, p1

    iget p2, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۥ:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-static {p1, v3, v6}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟۟(FFF)F

    move-result p1

    mul-float/2addr v0, p1

    add-float/2addr v1, v0

    return v1

    :cond_2
    :goto_0
    sub-long/2addr p1, v0

    long-to-float p1, p1

    iget p2, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-static {p1, v3, v6}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟۟(FFF)F

    move-result p1

    const/high16 p2, 0x3f000000    # 0.5f

    mul-float/2addr p1, p2

    return p1
.end method

.method public ۥ۟۟۟۠()I
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    div-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public final ۥ۟۟۟ۡ(F)F
    .locals 2

    const/high16 v0, -0x3f800000    # -4.0f

    mul-float/2addr v0, p1

    mul-float/2addr v0, p1

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr p1, v1

    add-float/2addr v0, p1

    return v0
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 6

    iget-wide v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥۣ۟۟۟:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥۣ۟۟۟:J

    iget v4, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۥ:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥۣ۟۟۟()V
    .locals 5

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۟:J

    sub-long v2, v0, v2

    long-to-int v2, v2

    const/4 v3, 0x0

    iget v4, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟:I

    invoke-static {v2, v3, v4}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟۠(III)I

    move-result v2

    iput v2, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۥ:I

    invoke-virtual {p0, v0, v1}, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۟(J)F

    move-result v2

    iput v2, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۤ:F

    iput-wide v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥۣ۟۟۟:J

    return-void
.end method

.method public ۥ۟۟۟ۤ(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟:I

    return-void
.end method

.method public ۥ۟۟۟ۥ(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ:I

    return-void
.end method

.method public ۥ۟۟۟ۦ(FF)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟:F

    iput p2, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟:F

    return-void
.end method

.method public ۥ۟۟۟ۧ()V
    .locals 4

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۟:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥۣ۟۟۟:J

    iput-wide v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۠:J

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۤ:F

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۡ:I

    iput v0, p0, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۢ:I

    return-void
.end method
