.class public final La/D1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:F

.field public c:I

.field public d:I

.field public final e:F

.field public final f:F

.field public final g:I

.field public final h:F


# direct methods
.method public constructor <init>(IFFFIFIFIF)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/D1;->a:I

    cmpg-float v0, p2, p3

    if-gez v0, :cond_0

    move p2, p3

    goto :goto_0

    :cond_0
    cmpl-float v0, p2, p4

    if-lez v0, :cond_1

    move p2, p4

    :cond_1
    :goto_0
    iput p2, p0, La/D1;->b:F

    iput p5, p0, La/D1;->c:I

    iput p6, p0, La/D1;->e:F

    iput p7, p0, La/D1;->d:I

    iput p8, p0, La/D1;->f:F

    iput p9, p0, La/D1;->g:I

    int-to-float v0, p9

    mul-float v1, p8, v0

    int-to-float p7, p7

    mul-float/2addr p6, p7

    add-float/2addr p6, v1

    int-to-float p7, p5

    mul-float v1, p2, p7

    add-float/2addr v1, p6

    sub-float p6, p10, v1

    const/4 v1, 0x0

    if-lez p5, :cond_2

    cmpl-float v2, p6, v1

    if-lez v2, :cond_2

    div-float/2addr p6, p7

    sub-float/2addr p4, p2

    invoke-static {p6, p4}, Ljava/lang/Math;->min(FF)F

    move-result p3

    add-float/2addr p3, p2

    iput p3, p0, La/D1;->b:F

    goto :goto_1

    :cond_2
    if-lez p5, :cond_3

    cmpg-float p4, p6, v1

    if-gez p4, :cond_3

    div-float/2addr p6, p7

    sub-float/2addr p3, p2

    invoke-static {p6, p3}, Ljava/lang/Math;->max(FF)F

    move-result p3

    add-float/2addr p3, p2

    iput p3, p0, La/D1;->b:F

    :cond_3
    :goto_1
    iget p2, p0, La/D1;->c:I

    if-lez p2, :cond_4

    iget p3, p0, La/D1;->b:F

    goto :goto_2

    :cond_4
    move p3, v1

    :goto_2
    iput p3, p0, La/D1;->b:F

    iget p4, p0, La/D1;->d:I

    if-lez p2, :cond_5

    move p5, p3

    goto :goto_3

    :cond_5
    move p5, v1

    :goto_3
    int-to-float p2, p2

    int-to-float p6, p4

    const/high16 p7, 0x40000000    # 2.0f

    div-float v2, p6, p7

    add-float/2addr p2, v2

    mul-float/2addr p2, p5

    sub-float/2addr p10, p2

    add-float/2addr v2, v0

    div-float/2addr p10, v2

    iput p10, p0, La/D1;->f:F

    add-float/2addr p3, p10

    div-float/2addr p3, p7

    iput p3, p0, La/D1;->e:F

    if-lez p4, :cond_7

    cmpl-float p2, p10, p8

    if-eqz p2, :cond_7

    sub-float p2, p8, p10

    mul-float/2addr p2, v0

    const p4, 0x3dcccccd    # 0.1f

    mul-float/2addr p3, p4

    mul-float/2addr p3, p6

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p4

    invoke-static {p4, p3}, Ljava/lang/Math;->min(FF)F

    move-result p3

    cmpl-float p2, p2, v1

    if-lez p2, :cond_6

    iget p2, p0, La/D1;->e:F

    iget p4, p0, La/D1;->d:I

    int-to-float p4, p4

    div-float p4, p3, p4

    sub-float/2addr p2, p4

    iput p2, p0, La/D1;->e:F

    iget p2, p0, La/D1;->f:F

    div-float/2addr p3, v0

    add-float/2addr p3, p2

    iput p3, p0, La/D1;->f:F

    goto :goto_4

    :cond_6
    iget p2, p0, La/D1;->e:F

    iget p4, p0, La/D1;->d:I

    int-to-float p4, p4

    div-float p4, p3, p4

    add-float/2addr p4, p2

    iput p4, p0, La/D1;->e:F

    iget p2, p0, La/D1;->f:F

    div-float/2addr p3, v0

    sub-float/2addr p2, p3

    iput p2, p0, La/D1;->f:F

    :cond_7
    :goto_4
    if-lez p9, :cond_8

    iget p2, p0, La/D1;->c:I

    if-lez p2, :cond_8

    iget p2, p0, La/D1;->d:I

    if-lez p2, :cond_8

    iget p2, p0, La/D1;->f:F

    iget p3, p0, La/D1;->e:F

    cmpl-float p2, p2, p3

    if-lez p2, :cond_9

    iget p2, p0, La/D1;->b:F

    cmpl-float p2, p3, p2

    if-lez p2, :cond_9

    goto :goto_5

    :cond_8
    if-lez p9, :cond_a

    iget p2, p0, La/D1;->c:I

    if-lez p2, :cond_a

    iget p2, p0, La/D1;->f:F

    iget p3, p0, La/D1;->b:F

    cmpl-float p2, p2, p3

    if-lez p2, :cond_9

    goto :goto_5

    :cond_9
    const p1, 0x7f7fffff    # Float.MAX_VALUE

    goto :goto_6

    :cond_a
    :goto_5
    iget p2, p0, La/D1;->f:F

    sub-float/2addr p8, p2

    invoke-static {p8}, Ljava/lang/Math;->abs(F)F

    move-result p2

    int-to-float p1, p1

    mul-float/2addr p1, p2

    :goto_6
    iput p1, p0, La/D1;->h:F

    return-void
.end method

.method public static a(FFFF[IF[IF[I)La/D1;
    .locals 22

    move-object/from16 v0, p4

    move-object/from16 v1, p6

    move-object/from16 v2, p8

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v3, :cond_5

    aget v17, v2, v7

    array-length v8, v1

    move v9, v6

    :goto_1
    if-ge v9, v8, :cond_4

    aget v15, v1, v9

    array-length v10, v0

    move v11, v6

    :goto_2
    if-ge v11, v10, :cond_3

    aget v13, v0, v11

    move v12, v8

    new-instance v8, La/D1;

    move v14, v9

    move v9, v5

    move v5, v14

    move/from16 v18, p0

    move/from16 v14, p5

    move/from16 v16, p7

    move/from16 v20, v10

    move/from16 v21, v11

    move/from16 v19, v12

    move/from16 v10, p1

    move/from16 v11, p2

    move/from16 v12, p3

    invoke-direct/range {v8 .. v18}, La/D1;-><init>(IFFFIFIFIF)V

    iget v10, v8, La/D1;->h:F

    if-eqz v4, :cond_0

    iget v11, v4, La/D1;->h:F

    cmpg-float v11, v10, v11

    if-gez v11, :cond_2

    :cond_0
    const/4 v4, 0x0

    cmpl-float v4, v10, v4

    if-nez v4, :cond_1

    return-object v8

    :cond_1
    move-object v4, v8

    :cond_2
    add-int/lit8 v8, v9, 0x1

    add-int/lit8 v11, v21, 0x1

    move v9, v5

    move v5, v8

    move/from16 v8, v19

    move/from16 v10, v20

    goto :goto_2

    :cond_3
    move/from16 v19, v9

    move v9, v5

    move/from16 v5, v19

    move/from16 v19, v8

    add-int/lit8 v5, v5, 0x1

    move v8, v9

    move v9, v5

    move v5, v8

    move/from16 v8, v19

    goto :goto_1

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    return-object v4
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Arrangement [priority="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, La/D1;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", smallCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/D1;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", smallSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/D1;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mediumCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/D1;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mediumSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/D1;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", largeCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/D1;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", largeSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/D1;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", cost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/D1;->h:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
