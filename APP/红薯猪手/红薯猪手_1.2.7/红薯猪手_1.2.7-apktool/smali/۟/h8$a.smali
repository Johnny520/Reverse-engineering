.class public L۟/h8$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/h8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/h8;


# direct methods
.method public constructor <init>(L۟/h8;)V
    .locals 0

    iput-object p1, p0, L۟/h8$a;->ۥ:L۟/h8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Landroid/graphics/Canvas;)V
    .locals 3

    iget-object v0, p0, L۟/h8$a;->ۥ:L۟/h8;

    iget-boolean v1, v0, L۟/h8;->ۥۣ۟:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    iget v0, v0, L۟/h8;->ۥ۟ۤ:I

    goto :goto_0

    :cond_0
    iget-object v1, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    iget v0, v0, L۟/h8;->ۥ۟ۥ:I

    :goto_0
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, L۟/h8$a;->ۥ:L۟/h8;

    iget v1, v0, L۟/h8;->ۥ۟۠:F

    iget-object v0, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v1, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public ۥ۟(Landroid/graphics/Canvas;)V
    .locals 4

    iget-object v0, p0, L۟/h8$a;->ۥ:L۟/h8;

    iget-boolean v1, v0, L۟/h8;->ۥۣ۟:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    iget v0, v0, L۟/h8;->ۥ۟ۦ:I

    goto :goto_0

    :cond_0
    iget-object v1, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    iget v0, v0, L۟/h8;->ۥ۟ۧ:I

    :goto_0
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, L۟/h8$a;->ۥ:L۟/h8;

    iget-object v0, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, L۟/h8$a;->ۥ:L۟/h8;

    iget v0, v0, L۟/h8;->ۥ۟۠:F

    const/high16 v1, 0x41000000    # 8.0f

    div-float v1, v0, v1

    neg-float v1, v1

    const/high16 v2, 0x40400000    # 3.0f

    div-float/2addr v0, v2

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v0, -0x3dcc0000    # -45.0f

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->rotate(F)V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v2, p0, L۟/h8$a;->ۥ:L۟/h8;

    iget v2, v2, L۟/h8;->ۥ۟ۢ:F

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {v0, v1, v1}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v2, p0, L۟/h8$a;->ۥ:L۟/h8;

    iget v2, v2, L۟/h8;->ۥ۟ۢ:F

    neg-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, p0, L۟/h8$a;->ۥ:L۟/h8;

    iget-object v1, v1, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public ۥ۟۟(Landroid/graphics/Canvas;)V
    .locals 7

    iget-object v0, p0, L۟/h8$a;->ۥ:L۟/h8;

    iget-boolean v1, v0, L۟/h8;->ۥۣ۟:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    iget v0, v0, L۟/h8;->ۥ۟ۤ:I

    goto :goto_0

    :cond_0
    iget-object v1, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    iget v0, v0, L۟/h8;->ۥ۟ۥ:I

    :goto_0
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, L۟/h8$a;->ۥ:L۟/h8;

    iget v5, v0, L۟/h8;->ۥ۟۠:F

    neg-float v2, v5

    neg-float v3, v5

    iget-object v6, v0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    move-object v1, p1

    move v4, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method
