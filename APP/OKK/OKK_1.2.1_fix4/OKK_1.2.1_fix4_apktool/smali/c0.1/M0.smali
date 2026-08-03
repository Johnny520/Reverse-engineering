.class public final Lc0/M0;
.super Landroid/text/style/ReplacementSpan;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:F

.field public final d:F


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    iput p1, p0, Lc0/M0;->a:I

    iput p2, p0, Lc0/M0;->b:I

    const/high16 p1, 0x41800000    # 16.0f

    iput p1, p0, Lc0/M0;->c:F

    const/high16 p1, 0x41200000    # 10.0f

    iput p1, p0, Lc0/M0;->d:F

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 12

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move/from16 v3, p5

    move-object/from16 v8, p9

    const-string v4, "canvas"

    invoke-static {p1, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "paint"

    invoke-static {v8, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v2, :cond_0

    return-void

    :cond_0
    move v4, p3

    move/from16 v5, p4

    invoke-virtual {v8, p2, p3, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v6

    const/4 v7, 0x2

    int-to-float v7, v7

    iget v9, v0, Lc0/M0;->d:F

    mul-float/2addr v7, v9

    add-float/2addr v7, v6

    new-instance v6, Landroid/graphics/RectF;

    move/from16 v10, p6

    int-to-float v10, v10

    add-float/2addr v7, v3

    move/from16 v11, p8

    int-to-float v11, v11

    invoke-direct {v6, v3, v10, v7, v11}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getColor()I

    move-result v10

    iget v7, v0, Lc0/M0;->a:I

    invoke-virtual {v8, v7}, Landroid/graphics/Paint;->setColor(I)V

    iget v7, v0, Lc0/M0;->c:F

    invoke-virtual {p1, v6, v7, v7, v8}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget v6, v0, Lc0/M0;->b:I

    invoke-virtual {v8, v6}, Landroid/graphics/Paint;->setColor(I)V

    add-float v6, v3, v9

    move/from16 v3, p7

    int-to-float v7, v3

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move/from16 v4, p4

    move v5, v6

    move v6, v7

    move-object/from16 v7, p9

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    const-string p5, "paint"

    invoke-static {p1, p5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result p1

    const/4 p2, 0x2

    int-to-float p2, p2

    iget p3, p0, Lc0/M0;->d:F

    mul-float/2addr p3, p2

    add-float/2addr p3, p1

    invoke-static {p3}, LA0/p;->P(F)I

    move-result p1

    return p1
.end method
