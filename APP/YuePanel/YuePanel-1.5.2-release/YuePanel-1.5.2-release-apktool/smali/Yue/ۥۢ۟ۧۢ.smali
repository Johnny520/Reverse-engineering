.class public final LYue/ۥۢ۟ۧۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۢۦۣ;


# static fields
.field public static final ۥ۟۟۟ۥ:F = 10000.0f

.field public static final ۥ۟۟۟ۦ:F = 1500.0f

.field public static final ۥ۟۟۟ۧ:F = 200.0f

.field public static final ۥ۟۟۟ۨ:F = 50.0f

.field public static final ۥ۟۟۠:F = 0.2f

.field public static final ۥ۟۟۠۟:F = 0.5f

.field public static final ۥ۟۟۠۠:F = 0.75f

.field public static final ۥ۟۟۠ۡ:F = 1.0f

.field public static final ۥ۟۟۠ۢ:D = 62.5

.field public static final ۥۣ۟۟۠:D = 1.7976931348623157E308


# instance fields
.field public ۥ:D

.field public ۥ۟:D

.field public ۥ۟۟:Z

.field public ۥ۟۟۟:D

.field public ۥ۟۟۟۟:D

.field public ۥ۟۟۟۠:D

.field public ۥ۟۟۟ۡ:D

.field public ۥ۟۟۟ۢ:D

.field public ۥۣ۟۟۟:D

.field public final ۥ۟۟۟ۤ:LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x4097700000000000L    # 1500.0

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 3
    iput-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟:D

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟:Z

    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 5
    iput-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥۣ۟۟۟:D

    .line 6
    new-instance v0, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    invoke-direct {v0}, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    return-void
.end method

.method public constructor <init>(F)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x4097700000000000L    # 1500.0

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 9
    iput-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟:D

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟:Z

    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 11
    iput-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥۣ۟۟۟:D

    .line 12
    new-instance v0, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    invoke-direct {v0}, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    float-to-double v0, p1

    .line 13
    iput-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥۣ۟۟۟:D

    return-void
.end method


# virtual methods
.method public ۥ(FF)Z
    .locals 4
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    float-to-double v0, p2

    iget-wide v2, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟۟:D

    cmpg-double p2, v0, v2

    if-gez p2, :cond_0

    invoke-virtual {p0}, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟()F

    move-result p2

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    float-to-double p1, p1

    iget-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟:D

    cmpg-double p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟(FF)F
    .locals 6
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟()F

    move-result v0

    sub-float/2addr p1, v0

    iget-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    mul-double v2, v0, v0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double/2addr v0, v4

    iget-wide v4, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟:D

    mul-double/2addr v0, v4

    neg-double v2, v2

    float-to-double v4, p1

    mul-double/2addr v2, v4

    float-to-double p1, p2

    mul-double/2addr v0, p1

    sub-double/2addr v2, v0

    double-to-float p1, v2

    return p1
.end method

.method public ۥ۟۟()F
    .locals 2

    iget-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟:D

    double-to-float v0, v0

    return v0
.end method

.method public ۥ۟۟۟()F
    .locals 2

    iget-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥۣ۟۟۟:D

    double-to-float v0, v0

    return v0
.end method

.method public ۥ۟۟۟۟()F
    .locals 2

    iget-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    mul-double/2addr v0, v0

    double-to-float v0, v0

    return v0
.end method

.method public final ۥ۟۟۟۠()V
    .locals 8

    iget-boolean v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥۣ۟۟۟:D

    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_3

    iget-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v0, v2

    if-lez v4, :cond_1

    neg-double v4, v0

    iget-wide v6, p0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    mul-double/2addr v4, v6

    mul-double/2addr v0, v0

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    mul-double/2addr v6, v0

    add-double/2addr v4, v6

    iput-wide v4, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟۠:D

    iget-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟:D

    neg-double v4, v0

    iget-wide v6, p0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    mul-double/2addr v4, v6

    mul-double/2addr v0, v0

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    mul-double/2addr v6, v0

    sub-double/2addr v4, v6

    iput-wide v4, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۡ:D

    goto :goto_0

    :cond_1
    const-wide/16 v4, 0x0

    cmpl-double v4, v0, v4

    if-ltz v4, :cond_2

    cmpg-double v4, v0, v2

    if-gez v4, :cond_2

    iget-wide v4, p0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    mul-double/2addr v0, v0

    sub-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    mul-double/2addr v4, v0

    iput-wide v4, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۢ:D

    :cond_2
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟:Z

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Error: Final position of the spring must be set before the animation starts"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۟ۡ(F)LYue/ۥۢ۟ۧۢ;
    .locals 2
    .param p1    # F
        .annotation build LYue/ۥ۠ۢۢۧ;
            from = 0.0
        .end annotation
    .end param

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    float-to-double v0, p1

    iput-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟:D

    const/4 p1, 0x0

    iput-boolean p1, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟:Z

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Damping ratio must be non-negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۢ(F)LYue/ۥۢ۟ۧۢ;
    .locals 2

    float-to-double v0, p1

    iput-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥۣ۟۟۟:D

    return-object p0
.end method

.method public ۥۣ۟۟۟(F)LYue/ۥۢ۟ۧۢ;
    .locals 2
    .param p1    # F
        .annotation build LYue/ۥ۠ۢۢۧ;
            from = 0.0
            fromInclusive = false
        .end annotation
    .end param

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-lez v0, :cond_0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    const/4 p1, 0x0

    iput-boolean p1, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟:Z

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Spring stiffness constant must be positive."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۤ(D)V
    .locals 2

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟:D

    const-wide v0, 0x404f400000000000L    # 62.5

    mul-double/2addr p1, v0

    iput-wide p1, p0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟۟:D

    return-void
.end method

.method public ۥ۟۟۟ۥ(DDJ)LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;
    .locals 16

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟۠()V

    move-wide/from16 v1, p5

    long-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    iget-wide v3, v0, LYue/ۥۢ۟ۧۢ;->ۥۣ۟۟۟:D

    sub-double v3, p1, v3

    iget-wide v5, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟:D

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    cmpl-double v9, v5, v7

    const-wide v10, 0x4005bf0a8b145769L    # Math.E

    if-lez v9, :cond_0

    iget-wide v5, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۡ:D

    mul-double v7, v5, v3

    sub-double v7, v7, p3

    iget-wide v12, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟۠:D

    sub-double v14, v5, v12

    div-double/2addr v7, v14

    sub-double v7, v3, v7

    mul-double/2addr v3, v5

    sub-double v3, v3, p3

    sub-double v12, v5, v12

    div-double/2addr v3, v12

    mul-double/2addr v5, v1

    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    mul-double/2addr v5, v7

    iget-wide v12, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟۠:D

    mul-double/2addr v12, v1

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v12

    mul-double/2addr v12, v3

    add-double/2addr v5, v12

    iget-wide v12, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۡ:D

    mul-double/2addr v7, v12

    mul-double/2addr v12, v1

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v12

    mul-double/2addr v7, v12

    iget-wide v12, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟۠:D

    mul-double/2addr v3, v12

    mul-double/2addr v12, v1

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    mul-double/2addr v3, v1

    add-double/2addr v7, v3

    goto/16 :goto_0

    :cond_0
    cmpl-double v9, v5, v7

    if-nez v9, :cond_1

    iget-wide v5, v0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    mul-double v7, v5, v3

    add-double v7, p3, v7

    mul-double v12, v7, v1

    add-double/2addr v3, v12

    neg-double v5, v5

    mul-double/2addr v5, v1

    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    mul-double/2addr v5, v3

    iget-wide v12, v0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    neg-double v12, v12

    mul-double/2addr v12, v1

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v12

    mul-double/2addr v3, v12

    iget-wide v12, v0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    neg-double v14, v12

    mul-double/2addr v3, v14

    neg-double v12, v12

    mul-double/2addr v12, v1

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    mul-double/2addr v7, v1

    add-double/2addr v7, v3

    goto :goto_0

    :cond_1
    iget-wide v12, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۢ:D

    div-double/2addr v7, v12

    iget-wide v12, v0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    mul-double v14, v5, v12

    mul-double/2addr v14, v3

    add-double v14, v14, p3

    mul-double/2addr v7, v14

    neg-double v5, v5

    mul-double/2addr v5, v12

    mul-double/2addr v5, v1

    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    iget-wide v12, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۢ:D

    mul-double/2addr v12, v1

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    mul-double/2addr v12, v3

    iget-wide v14, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۢ:D

    mul-double/2addr v14, v1

    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    mul-double/2addr v14, v7

    add-double/2addr v12, v14

    mul-double/2addr v5, v12

    iget-wide v12, v0, LYue/ۥۢ۟ۧۢ;->ۥ:D

    neg-double v14, v12

    mul-double/2addr v14, v5

    iget-wide v10, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟:D

    mul-double/2addr v14, v10

    neg-double v9, v10

    mul-double/2addr v9, v12

    mul-double/2addr v9, v1

    const-wide v11, 0x4005bf0a8b145769L    # Math.E

    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9

    iget-wide v11, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۢ:D

    move-wide/from16 p1, v5

    neg-double v5, v11

    mul-double/2addr v5, v3

    mul-double/2addr v11, v1

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    mul-double/2addr v5, v3

    iget-wide v3, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۢ:D

    mul-double/2addr v7, v3

    mul-double/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    mul-double/2addr v7, v1

    add-double/2addr v5, v7

    mul-double/2addr v9, v5

    add-double v7, v14, v9

    move-wide/from16 v5, p1

    :goto_0
    iget-object v1, v0, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    iget-wide v2, v0, LYue/ۥۢ۟ۧۢ;->ۥۣ۟۟۟:D

    add-double/2addr v5, v2

    double-to-float v2, v5

    iput v2, v1, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;->ۥ:F

    double-to-float v2, v7

    iput v2, v1, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;->ۥ۟:F

    return-object v1
.end method
