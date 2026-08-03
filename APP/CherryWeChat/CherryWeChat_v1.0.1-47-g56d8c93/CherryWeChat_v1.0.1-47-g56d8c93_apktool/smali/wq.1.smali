.class public final Lwq;
.super Landroid/widget/ImageView;
.source ""


# instance fields
.field public a:I


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    const-wide v0, -0x1c1abfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lwq;->a:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    return-void
.end method

.method public final setMaskColor(I)V
    .locals 0

    iput p1, p0, Lwq;->a:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
