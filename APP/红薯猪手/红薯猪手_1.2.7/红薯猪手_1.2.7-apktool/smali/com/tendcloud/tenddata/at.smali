.class final Lcom/tendcloud/tenddata/at;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(D)I
    .locals 2

    :try_start_0
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "######0"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static a([[D)I
    .locals 11

    const/4 v0, 0x4

    new-array v1, v0, [[D

    new-array v2, v0, [D

    const/4 v3, 0x0

    aget-object v4, p0, v3

    aget-wide v5, v4, v3

    aput-wide v5, v2, v3

    const/4 v5, 0x1

    aget-wide v6, v4, v5

    aput-wide v6, v2, v5

    const/4 v6, 0x2

    aget-wide v7, v4, v6

    aput-wide v7, v2, v6

    const/4 v7, 0x3

    aget-wide v8, v4, v7

    aput-wide v8, v2, v7

    aput-object v2, v1, v3

    new-array v2, v0, [D

    aget-object v4, p0, v5

    aget-wide v8, v4, v3

    aput-wide v8, v2, v3

    aget-wide v8, v4, v5

    aput-wide v8, v2, v5

    aget-wide v8, v4, v6

    aput-wide v8, v2, v6

    aget-wide v8, v4, v7

    aput-wide v8, v2, v7

    aput-object v2, v1, v5

    new-array v2, v0, [D

    aget-object v4, p0, v6

    aget-wide v8, v4, v3

    aput-wide v8, v2, v3

    aget-wide v8, v4, v5

    aput-wide v8, v2, v5

    aget-wide v8, v4, v6

    aput-wide v8, v2, v6

    aget-wide v8, v4, v7

    aput-wide v8, v2, v7

    aput-object v2, v1, v6

    new-array v2, v0, [D

    aget-object v4, p0, v7

    aget-wide v8, v4, v3

    aput-wide v8, v2, v3

    aget-wide v8, v4, v5

    aput-wide v8, v2, v5

    aget-wide v8, v4, v6

    aput-wide v8, v2, v6

    aget-wide v8, v4, v7

    aput-wide v8, v2, v7

    aput-object v2, v1, v7

    new-array v2, v0, [[D

    new-array v4, v0, [D

    aget-object v8, p0, v3

    aget-wide v9, v8, v3

    aput-wide v9, v4, v3

    aget-wide v9, v8, v5

    aput-wide v9, v4, v5

    aget-wide v9, v8, v6

    aput-wide v9, v4, v6

    aget-wide v9, v8, v0

    aput-wide v9, v4, v7

    aput-object v4, v2, v3

    new-array v4, v0, [D

    aget-object v8, p0, v5

    aget-wide v9, v8, v3

    aput-wide v9, v4, v3

    aget-wide v9, v8, v5

    aput-wide v9, v4, v5

    aget-wide v9, v8, v6

    aput-wide v9, v4, v6

    aget-wide v9, v8, v0

    aput-wide v9, v4, v7

    aput-object v4, v2, v5

    new-array v4, v0, [D

    aget-object v8, p0, v6

    aget-wide v9, v8, v3

    aput-wide v9, v4, v3

    aget-wide v9, v8, v5

    aput-wide v9, v4, v5

    aget-wide v9, v8, v6

    aput-wide v9, v4, v6

    aget-wide v9, v8, v0

    aput-wide v9, v4, v7

    aput-object v4, v2, v6

    new-array v4, v0, [D

    aget-object p0, p0, v7

    aget-wide v8, p0, v3

    aput-wide v8, v4, v3

    aget-wide v8, p0, v5

    aput-wide v8, v4, v5

    aget-wide v8, p0, v6

    aput-wide v8, v4, v6

    aget-wide v5, p0, v0

    aput-wide v5, v4, v7

    aput-object v4, v2, v7

    invoke-static {v1}, Lcom/tendcloud/tenddata/at;->b([[D)D

    move-result-wide v0

    const-wide/16 v4, 0x0

    cmpl-double p0, v0, v4

    if-nez p0, :cond_0

    return v3

    :cond_0
    invoke-static {v2}, Lcom/tendcloud/tenddata/at;->b([[D)D

    move-result-wide v2

    div-double/2addr v2, v0

    invoke-static {v2, v3}, Lcom/tendcloud/tenddata/at;->a(D)I

    move-result p0

    return p0
.end method

.method public static a([[I)I
    .locals 14

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    :try_start_0
    array-length v1, p0

    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    goto/16 :goto_0

    :cond_0
    new-array v1, v2, [[D

    const/4 v3, 0x5

    new-array v4, v3, [D

    aget-object v5, p0, v0

    aget v6, v5, v0

    mul-int v7, v6, v6

    mul-int/2addr v7, v6

    int-to-double v7, v7

    aput-wide v7, v4, v0

    mul-int v7, v6, v6

    int-to-double v7, v7

    const/4 v9, 0x1

    aput-wide v7, v4, v9

    int-to-double v6, v6

    const/4 v8, 0x2

    aput-wide v6, v4, v8

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    const/4 v10, 0x3

    aput-wide v6, v4, v10

    aget v5, v5, v9

    int-to-double v11, v5

    aput-wide v11, v4, v2

    aput-object v4, v1, v0

    new-array v4, v3, [D

    aget-object v5, p0, v9

    aget v11, v5, v0

    mul-int v12, v11, v11

    mul-int/2addr v12, v11

    int-to-double v12, v12

    aput-wide v12, v4, v0

    mul-int v12, v11, v11

    int-to-double v12, v12

    aput-wide v12, v4, v9

    int-to-double v11, v11

    aput-wide v11, v4, v8

    aput-wide v6, v4, v10

    aget v5, v5, v9

    int-to-double v11, v5

    aput-wide v11, v4, v2

    aput-object v4, v1, v9

    new-array v4, v3, [D

    aget-object v5, p0, v8

    aget v11, v5, v0

    mul-int v12, v11, v11

    mul-int/2addr v12, v11

    int-to-double v12, v12

    aput-wide v12, v4, v0

    mul-int v12, v11, v11

    int-to-double v12, v12

    aput-wide v12, v4, v9

    int-to-double v11, v11

    aput-wide v11, v4, v8

    aput-wide v6, v4, v10

    aget v5, v5, v9

    int-to-double v11, v5

    aput-wide v11, v4, v2

    aput-object v4, v1, v8

    new-array v3, v3, [D

    aget-object p0, p0, v10

    aget v4, p0, v0

    mul-int v5, v4, v4

    mul-int/2addr v5, v4

    int-to-double v11, v5

    aput-wide v11, v3, v0

    mul-int v5, v4, v4

    int-to-double v11, v5

    aput-wide v11, v3, v9

    int-to-double v4, v4

    aput-wide v4, v3, v8

    aput-wide v6, v3, v10

    aget p0, p0, v9

    int-to-double v4, p0

    aput-wide v4, v3, v2

    aput-object v3, v1, v10

    invoke-static {v1}, Lcom/tendcloud/tenddata/at;->a([[D)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    :cond_1
    :goto_0
    return v0
.end method

.method private static b([[D)D
    .locals 15

    const/4 v0, 0x3

    new-array v1, v0, [[D

    new-array v2, v0, [D

    const/4 v3, 0x1

    aget-object v4, p0, v3

    aget-wide v5, v4, v3

    const/4 v7, 0x0

    aput-wide v5, v2, v7

    const/4 v5, 0x2

    aget-wide v8, v4, v5

    aput-wide v8, v2, v3

    aget-wide v8, v4, v0

    aput-wide v8, v2, v5

    aput-object v2, v1, v7

    new-array v2, v0, [D

    aget-object v4, p0, v5

    aget-wide v8, v4, v3

    aput-wide v8, v2, v7

    aget-wide v8, v4, v5

    aput-wide v8, v2, v3

    aget-wide v8, v4, v0

    aput-wide v8, v2, v5

    aput-object v2, v1, v3

    new-array v2, v0, [D

    aget-object v4, p0, v0

    aget-wide v8, v4, v3

    aput-wide v8, v2, v7

    aget-wide v8, v4, v5

    aput-wide v8, v2, v3

    aget-wide v8, v4, v0

    aput-wide v8, v2, v5

    aput-object v2, v1, v5

    new-array v2, v0, [[D

    new-array v6, v0, [D

    aget-object v10, p0, v3

    aget-wide v11, v10, v7

    aput-wide v11, v6, v7

    aget-wide v11, v10, v5

    aput-wide v11, v6, v3

    aget-wide v11, v10, v0

    aput-wide v11, v6, v5

    aput-object v6, v2, v7

    new-array v6, v0, [D

    aget-object v10, p0, v5

    aget-wide v11, v10, v7

    aput-wide v11, v6, v7

    aget-wide v11, v10, v5

    aput-wide v11, v6, v3

    aget-wide v11, v10, v0

    aput-wide v11, v6, v5

    aput-object v6, v2, v3

    new-array v6, v0, [D

    aget-wide v10, v4, v7

    aput-wide v10, v6, v7

    aget-wide v10, v4, v5

    aput-wide v10, v6, v3

    aput-wide v8, v6, v5

    aput-object v6, v2, v5

    new-array v6, v0, [[D

    new-array v10, v0, [D

    aget-object v11, p0, v3

    aget-wide v12, v11, v7

    aput-wide v12, v10, v7

    aget-wide v12, v11, v3

    aput-wide v12, v10, v3

    aget-wide v12, v11, v0

    aput-wide v12, v10, v5

    aput-object v10, v6, v7

    new-array v10, v0, [D

    aget-object v11, p0, v5

    aget-wide v12, v11, v7

    aput-wide v12, v10, v7

    aget-wide v12, v11, v3

    aput-wide v12, v10, v3

    aget-wide v12, v11, v0

    aput-wide v12, v10, v5

    aput-object v10, v6, v3

    new-array v10, v0, [D

    aget-wide v11, v4, v7

    aput-wide v11, v10, v7

    aget-wide v11, v4, v3

    aput-wide v11, v10, v3

    aput-wide v8, v10, v5

    aput-object v10, v6, v5

    new-array v8, v0, [[D

    new-array v9, v0, [D

    aget-object v10, p0, v3

    aget-wide v11, v10, v7

    aput-wide v11, v9, v7

    aget-wide v11, v10, v3

    aput-wide v11, v9, v3

    aget-wide v11, v10, v5

    aput-wide v11, v9, v5

    aput-object v9, v8, v7

    new-array v9, v0, [D

    aget-object v10, p0, v5

    aget-wide v11, v10, v7

    aput-wide v11, v9, v7

    aget-wide v11, v10, v3

    aput-wide v11, v9, v3

    aget-wide v11, v10, v5

    aput-wide v11, v9, v5

    aput-object v9, v8, v3

    new-array v9, v0, [D

    aget-wide v10, v4, v7

    aput-wide v10, v9, v7

    aget-wide v10, v4, v3

    aput-wide v10, v9, v3

    aget-wide v10, v4, v5

    aput-wide v10, v9, v5

    aput-object v9, v8, v5

    const-wide/high16 v9, -0x4010000000000000L    # -1.0

    const-wide/16 v11, 0x0

    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v11

    aget-object v4, p0, v7

    aget-wide v13, v4, v7

    mul-double/2addr v11, v13

    invoke-static {v1}, Lcom/tendcloud/tenddata/at;->c([[D)D

    move-result-wide v13

    mul-double/2addr v11, v13

    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v13

    aget-object v1, p0, v7

    aget-wide v3, v1, v3

    mul-double/2addr v13, v3

    invoke-static {v2}, Lcom/tendcloud/tenddata/at;->c([[D)D

    move-result-wide v1

    mul-double/2addr v13, v1

    add-double/2addr v13, v11

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    invoke-static {v9, v10, v1, v2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    aget-object v3, p0, v7

    aget-wide v4, v3, v5

    mul-double/2addr v1, v4

    invoke-static {v6}, Lcom/tendcloud/tenddata/at;->c([[D)D

    move-result-wide v3

    mul-double/2addr v1, v3

    add-double/2addr v1, v13

    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    aget-object p0, p0, v7

    aget-wide v5, p0, v0

    mul-double/2addr v3, v5

    invoke-static {v8}, Lcom/tendcloud/tenddata/at;->c([[D)D

    move-result-wide v5

    mul-double/2addr v3, v5

    add-double/2addr v3, v1

    return-wide v3
.end method

.method private static c([[D)D
    .locals 24

    const/4 v0, 0x0

    aget-object v1, p0, v0

    aget-wide v2, v1, v0

    const/4 v4, 0x1

    aget-object v5, p0, v4

    aget-wide v6, v5, v4

    mul-double v8, v2, v6

    const/4 v10, 0x2

    aget-object v11, p0, v10

    aget-wide v12, v11, v10

    mul-double/2addr v8, v12

    aget-wide v14, v1, v4

    aget-wide v16, v5, v10

    mul-double v18, v14, v16

    aget-wide v20, v11, v0

    mul-double v18, v18, v20

    add-double v18, v18, v8

    aget-wide v8, v1, v10

    aget-wide v0, v5, v0

    mul-double v22, v8, v0

    aget-wide v4, v11, v4

    mul-double v22, v22, v4

    add-double v22, v22, v18

    neg-double v8, v8

    mul-double/2addr v8, v6

    mul-double v8, v8, v20

    add-double v8, v8, v22

    mul-double/2addr v14, v0

    mul-double/2addr v14, v12

    sub-double/2addr v8, v14

    mul-double/2addr v2, v4

    mul-double v2, v2, v16

    sub-double/2addr v8, v2

    return-wide v8
.end method
