.class public final Lal;
.super Landroid/view/ViewOutlineProvider;
.source ""


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    iput p2, p0, Lal;->a:I

    iput-object p1, p0, Lal;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 12

    iget p1, p0, Lal;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lal;->b:Landroid/view/View;

    check-cast p1, Lcom/google/android/material/chip/Chip;

    iget-object p1, p1, Lcom/google/android/material/chip/Chip;->e:Lo9;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lo9;->getOutline(Landroid/graphics/Outline;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->setAlpha(F)V

    :goto_0
    return-void

    :pswitch_0
    iget-object p1, p0, Lal;->b:Landroid/view/View;

    check-cast p1, Landroidx/constraintlayout/utils/widget/ImageFilterView;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    const/4 v2, 0x0

    iget v5, p1, Landroidx/constraintlayout/utils/widget/ImageFilterView;->j:F

    const/4 v1, 0x0

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void

    :pswitch_1
    move-object v0, p2

    iget-object p1, p0, Lal;->b:Landroid/view/View;

    check-cast p1, Landroidx/constraintlayout/utils/widget/ImageFilterView;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v9

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v10

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result p2

    int-to-float p2, p2

    iget p1, p1, Landroidx/constraintlayout/utils/widget/ImageFilterView;->i:F

    mul-float/2addr p2, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float v11, p2, p1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, v0

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
