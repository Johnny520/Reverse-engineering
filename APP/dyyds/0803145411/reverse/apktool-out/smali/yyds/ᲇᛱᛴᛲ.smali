.class public final Lyyds/ᲇᛱᛴᛲ;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# instance fields
.field public ᛱᲈᲁ:I

.field public final ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:Z

.field public ᛶᛷᛲᲁ:Z

.field public ᛷᛲᲈᛱ:Landroid/graphics/Paint;

.field public ᛷᛵᲇᲀ:Landroid/graphics/Rect;

.field public ᛷᲈᲈᲁ:Z

.field public final ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

.field public ᲇᲇᲇᛱ:Z

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(Lyyds/ᲇᛸᛲᛸ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛶᛷᛲᲁ:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛲᛳᛶᲁ:I

    .line 9
    .line 10
    iput-object p1, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲇᲇᲇᛱ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᲈᲈᲁ:Z

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᲇᛱᛴᛲ;->getIntrinsicWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lyyds/ᲇᛱᛴᛲ;->getIntrinsicHeight()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᛵᲇᲀ:Landroid/graphics/Rect;

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    new-instance v3, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v3, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᛵᲇᲀ:Landroid/graphics/Rect;

    .line 32
    .line 33
    :cond_1
    const/16 v4, 0x77

    .line 34
    .line 35
    invoke-static {v4, v0, v1, v2, v3}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᲈᲈᲁ:Z

    .line 40
    .line 41
    :cond_2
    iget-object v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 42
    .line 43
    iget-object v0, v0, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 44
    .line 45
    iget-object v1, v0, Lyyds/ᲇᛴᲈᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛸᛴᛴᛲ;

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    iget-object v0, v1, Lyyds/ᛸᛴᛴᛲ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    iget-object v0, v0, Lyyds/ᲇᛴᲈᛷ;->ᛷᛵᲇᲀ:Landroid/graphics/Bitmap;

    .line 53
    .line 54
    :goto_0
    iget-object v1, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᛵᲇᲀ:Landroid/graphics/Rect;

    .line 55
    .line 56
    if-nez v1, :cond_4

    .line 57
    .line 58
    new-instance v1, Landroid/graphics/Rect;

    .line 59
    .line 60
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᛵᲇᲀ:Landroid/graphics/Rect;

    .line 64
    .line 65
    :cond_4
    iget-object v2, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᛲᲈᛱ:Landroid/graphics/Paint;

    .line 66
    .line 67
    if-nez v2, :cond_5

    .line 68
    .line 69
    new-instance v2, Landroid/graphics/Paint;

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object v2, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᛲᲈᛱ:Landroid/graphics/Paint;

    .line 76
    .line 77
    :cond_5
    const/4 p0, 0x0

    .line 78
    invoke-virtual {p1, v0, p0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIntrinsicHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 4
    .line 5
    iget p0, p0, Lyyds/ᲇᛴᲈᛷ;->ᲇᛱᛲ:I

    .line 6
    .line 7
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 4
    .line 5
    iget p0, p0, Lyyds/ᲇᛴᲈᛷ;->ᛳᲁᲁᲇ:I

    .line 6
    .line 7
    return p0
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x2

    .line 2
    return p0
.end method

.method public final isRunning()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    return p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᲈᲈᲁ:Z

    .line 6
    .line 7
    return-void
.end method

.method public final setAlpha(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᛲᲈᛱ:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᛲᲈᛱ:Landroid/graphics/Paint;

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᛲᲈᛱ:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛷᛲᲈᛱ:Landroid/graphics/Paint;

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲇᲇᲇᛱ:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    const-string v1, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View\'s visibility."

    .line 6
    .line 7
    invoke-static {v1, v0}, Lyyds/ᛲᛳᲁ;->ᛵᛸᛸᛷ(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    iput-boolean p1, p0, Lyyds/ᲇᛱᛴᛲ;->ᛶᛷᛲᲁ:Z

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲇᲈᛵᛷ:Z

    .line 16
    .line 17
    iget-object v1, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 18
    .line 19
    iget-object v1, v1, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 20
    .line 21
    iget-object v2, v1, Lyyds/ᲇᛴᲈᛷ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iput-boolean v0, v1, Lyyds/ᲇᛴᲈᛷ;->ᲇᲇᲇᛱ:Z

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛲᛴᛳᛲ:Z

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lyyds/ᲇᛱᛴᛲ;->ᛲᲈᲁ()V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0
.end method

.method public final start()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛲᛴᛳᛲ:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛱᲈᲁ:I

    .line 6
    .line 7
    iget-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛶᛷᛲᲁ:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᲇᛱᛴᛲ;->ᛲᲈᲁ()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final stop()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᛲᛴᛳᛲ:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲇᲈᛵᛷ:Z

    .line 5
    .line 6
    iget-object v1, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 7
    .line 8
    iget-object v1, v1, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 9
    .line 10
    iget-object v2, v1, Lyyds/ᲇᛴᲈᛷ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    iput-boolean v0, v1, Lyyds/ᲇᛴᲈᛷ;->ᲇᲇᲇᛱ:Z

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final ᛲᲈᲁ()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲇᲇᲇᛱ:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    const-string v2, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request."

    .line 6
    .line 7
    invoke-static {v2, v0}, Lyyds/ᛲᛳᲁ;->ᛵᛸᛸᛷ(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 11
    .line 12
    iget-object v0, v0, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 13
    .line 14
    iget-object v2, v0, Lyyds/ᲇᛴᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛶᛵᛵ;

    .line 15
    .line 16
    iget-object v2, v2, Lyyds/ᛷᛶᛵᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛱᛱᲈᲇ;

    .line 17
    .line 18
    iget v2, v2, Lyyds/ᛱᛱᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 19
    .line 20
    if-ne v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-boolean v2, p0, Lyyds/ᲇᛱᛴᛲ;->ᲇᲈᛵᛷ:Z

    .line 27
    .line 28
    if-nez v2, :cond_5

    .line 29
    .line 30
    iput-boolean v1, p0, Lyyds/ᲇᛱᛴᛲ;->ᲇᲈᛵᛷ:Z

    .line 31
    .line 32
    iget-object v2, v0, Lyyds/ᲇᛴᲈᛷ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-boolean v3, v0, Lyyds/ᲇᛴᲈᛷ;->ᛷᲈᲈᲁ:Z

    .line 35
    .line 36
    if-nez v3, :cond_4

    .line 37
    .line 38
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_3

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iget-boolean v2, v0, Lyyds/ᲇᛴᲈᛷ;->ᲇᲇᲇᛱ:Z

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iput-boolean v1, v0, Lyyds/ᲇᛴᲈᛷ;->ᲇᲇᲇᛱ:Z

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    iput-boolean v1, v0, Lyyds/ᲇᛴᲈᛷ;->ᛷᲈᲈᲁ:Z

    .line 62
    .line 63
    invoke-virtual {v0}, Lyyds/ᲇᛴᲈᛷ;->ᛲᲈᲁ()V

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    const-string p0, "Cannot subscribe twice in a row"

    .line 71
    .line 72
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4
    const-string p0, "Cannot subscribe to a cleared frame loader"

    .line 77
    .line 78
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    return-void
.end method
