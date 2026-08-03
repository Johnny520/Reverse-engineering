.class public LYue/ۥۢ۠۠۠;
.super LYue/ۥۡۡۥۢ;
.source "SourceFile"


# instance fields
.field public ۥ:F

.field public ۥ۟:F

.field public ۥ۟۟:F

.field public ۥ۟۟۟:F

.field public ۥ۟۟۟۟:F

.field public ۥ۟۟۟۠:F

.field public ۥ۟۟۟ۡ:F

.field public ۥ۟۟۟ۢ:F

.field public ۥۣ۟۟۟:F

.field public ۥ۟۟۟ۤ:I

.field public ۥ۟۟۟ۥ:Ljava/lang/String;

.field public ۥ۟۟۟ۦ:Z

.field public ۥ۟۟۟ۧ:F

.field public ۥ۟۟۟ۨ:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LYue/ۥۡۡۥۢ;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۦ:Z

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥۢ۠۠۠;->ۥ۟(F)F

    move-result v0

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۨ:F

    iget-boolean p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۦ:Z

    if-eqz p1, :cond_0

    iget p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۧ:F

    sub-float/2addr p1, v0

    goto :goto_0

    :cond_0
    iget p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۧ:F

    add-float/2addr p1, v0

    :goto_0
    return p1
.end method

.method public ۥ()F
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۦ:Z

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۨ:F

    invoke-virtual {p0, v0}, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟(F)F

    move-result v0

    neg-float v0, v0

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۨ:F

    invoke-virtual {p0, v0}, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟(F)F

    move-result v0

    :goto_0
    return v0
.end method

.method public final ۥ۟(F)F
    .locals 5

    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟:F

    cmpg-float v1, p1, v0

    const/high16 v2, 0x40000000    # 2.0f

    if-gtz v1, :cond_0

    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ:F

    mul-float v3, v1, p1

    iget v4, p0, LYue/ۥۢ۠۠۠;->ۥ۟:F

    sub-float/2addr v4, v1

    mul-float/2addr v4, p1

    mul-float/2addr v4, p1

    mul-float/2addr v0, v2

    div-float/2addr v4, v0

    add-float/2addr v3, v4

    return v3

    :cond_0
    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    const/4 v3, 0x1

    if-ne v1, v3, :cond_1

    iget p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۡ:F

    return p1

    :cond_1
    sub-float/2addr p1, v0

    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟:F

    cmpg-float v3, p1, v0

    if-gez v3, :cond_2

    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۡ:F

    iget v3, p0, LYue/ۥۢ۠۠۠;->ۥ۟:F

    mul-float v4, v3, p1

    add-float/2addr v1, v4

    iget v4, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟:F

    sub-float/2addr v4, v3

    mul-float/2addr v4, p1

    mul-float/2addr v4, p1

    mul-float/2addr v0, v2

    div-float/2addr v4, v0

    add-float/2addr v1, v4

    return v1

    :cond_2
    const/4 v3, 0x2

    if-ne v1, v3, :cond_3

    iget p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۢ:F

    return p1

    :cond_3
    sub-float/2addr p1, v0

    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۠:F

    cmpg-float v1, p1, v0

    if-gez v1, :cond_4

    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۢ:F

    iget v3, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟:F

    mul-float v4, v3, p1

    add-float/2addr v1, v4

    mul-float/2addr v3, p1

    mul-float/2addr v3, p1

    mul-float/2addr v0, v2

    div-float/2addr v3, v0

    sub-float/2addr v1, v3

    return v1

    :cond_4
    iget p1, p0, LYue/ۥۢ۠۠۠;->ۥۣ۟۟۟:F

    return p1
.end method

.method public ۥ۟۟(FFFFFF)V
    .locals 6

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۧ:F

    cmpl-float v1, p1, p2

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۦ:Z

    if-eqz v1, :cond_1

    neg-float v1, p3

    sub-float v2, p1, p2

    move-object v0, p0

    move v3, p5

    move v4, p6

    move v5, p4

    invoke-virtual/range {v0 .. v5}, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۠(FFFFF)V

    goto :goto_1

    :cond_1
    sub-float v2, p2, p1

    move-object v0, p0

    move v1, p3

    move v3, p5

    move v4, p6

    move v5, p4

    invoke-virtual/range {v0 .. v5}, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۠(FFFFF)V

    :goto_1
    return-void
.end method

.method public ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;F)V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ===== "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۥ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۦ:Z

    if-eqz v1, :cond_0

    const-string v1, "backwards"

    goto :goto_0

    :cond_0
    const-string v1, "forward "

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " time = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "  stages "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " dur "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " vel "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, LYue/ۥۢ۠۠۠;->ۥ:F

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, " pos "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۡ:F

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    const/4 v4, 0x1

    if-le v0, v4, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟:F

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, LYue/ۥۢ۠۠۠;->ۥ۟:F

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۢ:F

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    const/4 v5, 0x2

    if-le v0, v5, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۠:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥۣ۟۟۟:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟:F

    cmpg-float v1, p3, v0

    if-gtz v1, :cond_3

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "stage 0"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    if-ne v1, v4, :cond_4

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "end stage 0"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    sub-float/2addr p3, v0

    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟:F

    cmpg-float v2, p3, v0

    if-gez v2, :cond_5

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " stage 1"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_5
    if-ne v1, v5, :cond_6

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "end stage 1"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_6
    sub-float/2addr p3, v0

    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۠:F

    cmpg-float p3, p3, v0

    if-gez p3, :cond_7

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " stage 2"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_7
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " end stage 2"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public ۥ۟۟۟۟(F)F
    .locals 3

    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟:F

    cmpg-float v1, p1, v0

    if-gtz v1, :cond_0

    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ:F

    iget v2, p0, LYue/ۥۢ۠۠۠;->ۥ۟:F

    sub-float/2addr v2, v1

    mul-float/2addr v2, p1

    div-float/2addr v2, v0

    add-float/2addr v1, v2

    return v1

    :cond_0
    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sub-float/2addr p1, v0

    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟:F

    cmpg-float v2, p1, v0

    if-gez v2, :cond_2

    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟:F

    iget v2, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟:F

    sub-float/2addr v2, v1

    mul-float/2addr v2, p1

    div-float/2addr v2, v0

    add-float/2addr v1, v2

    return v1

    :cond_2
    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    iget p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۢ:F

    return p1

    :cond_3
    sub-float/2addr p1, v0

    iget v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۠:F

    cmpg-float v1, p1, v0

    if-gez v1, :cond_4

    iget v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟:F

    mul-float/2addr p1, v1

    div-float/2addr p1, v0

    sub-float/2addr v1, p1

    return v1

    :cond_4
    iget p1, p0, LYue/ۥۢ۠۠۠;->ۥۣ۟۟۟:F

    return p1
.end method

.method public final ۥ۟۟۟۠(FFFFF)V
    .locals 8

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-nez v1, :cond_0

    const p1, 0x38d1b717    # 1.0E-4f

    :cond_0
    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ:F

    div-float v1, p1, p3

    mul-float v2, v1, p1

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    cmpg-float v4, p1, v0

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-gez v4, :cond_2

    neg-float p5, p1

    div-float/2addr p5, p3

    mul-float/2addr p5, p1

    div-float/2addr p5, v3

    sub-float p5, p2, p5

    mul-float/2addr p5, p3

    float-to-double v1, p5

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float p5, v1

    cmpg-float v1, p5, p4

    if-gez v1, :cond_1

    const-string p4, "backward accelerate, decelerate"

    iput-object p4, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۥ:Ljava/lang/String;

    iput v6, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ:F

    iput p5, p0, LYue/ۥۢ۠۠۠;->ۥ۟:F

    iput v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟:F

    sub-float p4, p5, p1

    div-float/2addr p4, p3

    iput p4, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟:F

    div-float p3, p5, p3

    iput p3, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟:F

    add-float/2addr p1, p5

    mul-float/2addr p1, p4

    div-float/2addr p1, v3

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۡ:F

    iput p2, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۢ:F

    iput p2, p0, LYue/ۥۢ۠۠۠;->ۥۣ۟۟۟:F

    return-void

    :cond_1
    const-string p5, "backward accelerate cruse decelerate"

    iput-object p5, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۥ:Ljava/lang/String;

    iput v5, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ:F

    iput p4, p0, LYue/ۥۢ۠۠۠;->ۥ۟:F

    iput p4, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟:F

    sub-float p5, p4, p1

    div-float/2addr p5, p3

    iput p5, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟:F

    div-float p3, p4, p3

    iput p3, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۠:F

    add-float/2addr p1, p4

    mul-float/2addr p1, p5

    div-float/2addr p1, v3

    mul-float/2addr p3, p4

    div-float/2addr p3, v3

    sub-float p5, p2, p1

    sub-float/2addr p5, p3

    div-float/2addr p5, p4

    iput p5, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟:F

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۡ:F

    sub-float p1, p2, p3

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۢ:F

    iput p2, p0, LYue/ۥۢ۠۠۠;->ۥۣ۟۟۟:F

    return-void

    :cond_2
    cmpl-float v4, v2, p2

    if-ltz v4, :cond_3

    const-string p3, "hard stop"

    iput-object p3, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۥ:Ljava/lang/String;

    mul-float/2addr v3, p2

    div-float/2addr v3, p1

    const/4 p3, 0x1

    iput p3, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ:F

    iput v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟:F

    iput p2, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۡ:F

    iput v3, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟:F

    return-void

    :cond_3
    sub-float v2, p2, v2

    div-float v4, v2, p1

    add-float v7, v4, v1

    cmpg-float p5, v7, p5

    if-gez p5, :cond_4

    const-string p3, "cruse decelerate"

    iput-object p3, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۥ:Ljava/lang/String;

    iput v6, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ:F

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟:F

    iput v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟:F

    iput v2, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۡ:F

    iput p2, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۢ:F

    iput v4, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟:F

    iput v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟:F

    return-void

    :cond_4
    mul-float p5, p3, p2

    mul-float v1, p1, p1

    div-float/2addr v1, v3

    add-float/2addr p5, v1

    float-to-double v1, p5

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float p5, v1

    sub-float v1, p5, p1

    div-float/2addr v1, p3

    iput v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟:F

    div-float v2, p5, p3

    iput v2, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟:F

    cmpg-float v4, p5, p4

    if-gez v4, :cond_5

    const-string p3, "accelerate decelerate"

    iput-object p3, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۥ:Ljava/lang/String;

    iput v6, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ:F

    iput p5, p0, LYue/ۥۢ۠۠۠;->ۥ۟:F

    iput v0, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟:F

    iput v1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟:F

    iput v2, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟:F

    add-float/2addr p1, p5

    mul-float/2addr p1, v1

    div-float/2addr p1, v3

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۡ:F

    iput p2, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۢ:F

    return-void

    :cond_5
    const-string p5, "accelerate cruse decelerate"

    iput-object p5, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۥ:Ljava/lang/String;

    iput v5, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۤ:I

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ:F

    iput p4, p0, LYue/ۥۢ۠۠۠;->ۥ۟:F

    iput p4, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟:F

    sub-float p5, p4, p1

    div-float/2addr p5, p3

    iput p5, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟:F

    div-float p3, p4, p3

    iput p3, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۠:F

    add-float/2addr p1, p4

    mul-float/2addr p1, p5

    div-float/2addr p1, v3

    mul-float/2addr p3, p4

    div-float/2addr p3, v3

    sub-float p5, p2, p1

    sub-float/2addr p5, p3

    div-float/2addr p5, p4

    iput p5, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟۟:F

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۡ:F

    sub-float p1, p2, p3

    iput p1, p0, LYue/ۥۢ۠۠۠;->ۥ۟۟۟ۢ:F

    iput p2, p0, LYue/ۥۢ۠۠۠;->ۥۣ۟۟۟:F

    return-void
.end method
