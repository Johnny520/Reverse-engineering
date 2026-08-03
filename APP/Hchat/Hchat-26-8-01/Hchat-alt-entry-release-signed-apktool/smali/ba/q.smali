.class public final Lba/q;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/graphics/Bitmap;

.field public final b:Landroid/graphics/NinePatch;

.field public final c:Landroid/graphics/Paint;

.field public final d:Landroid/graphics/Rect;

.field public e:I

.field public f:Z


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lba/q;->a:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    :try_start_0
    invoke-static {p2}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Landroid/graphics/NinePatch;

    .line 16
    .line 17
    const-string v2, "HchatMessageBubble"

    .line 18
    .line 19
    invoke-direct {v1, p1, p2, v2}, Landroid/graphics/NinePatch;-><init>(Landroid/graphics/Bitmap;[BLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v0

    .line 26
    goto :goto_1

    .line 27
    :goto_0
    new-instance v1, Lsf/f;

    .line 28
    .line 29
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :goto_1
    instance-of p1, v1, Lsf/f;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    move-object v1, v0

    .line 37
    :cond_1
    check-cast v1, Landroid/graphics/NinePatch;

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-object v1, v0

    .line 41
    :goto_2
    iput-object v1, p0, Lba/q;->b:Landroid/graphics/NinePatch;

    .line 42
    .line 43
    new-instance p1, Landroid/graphics/Paint;

    .line 44
    .line 45
    const/4 p2, 0x3

    .line 46
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lba/q;->c:Landroid/graphics/Paint;

    .line 50
    .line 51
    if-eqz p3, :cond_3

    .line 52
    .line 53
    new-instance v0, Landroid/graphics/Rect;

    .line 54
    .line 55
    invoke-direct {v0, p3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iput-object v0, p0, Lba/q;->d:Landroid/graphics/Rect;

    .line 59
    .line 60
    const/16 p1, 0xff

    .line 61
    .line 62
    iput p1, p0, Lba/q;->e:I

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lba/q;->f:Z

    .line 5
    .line 6
    iget v1, p0, Lba/q;->e:I

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    int-to-float v0, v1

    .line 11
    const v1, 0x3f51eb85    # 0.82f

    .line 12
    .line 13
    .line 14
    mul-float/2addr v0, v1

    .line 15
    float-to-int v1, v0

    .line 16
    :cond_0
    iget-object v0, p0, Lba/q;->c:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lba/q;->b:Landroid/graphics/NinePatch;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, p1, v2, v0}, Landroid/graphics/NinePatch;->draw(Landroid/graphics/Canvas;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v3, p0, Lba/q;->a:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    invoke-virtual {p1, v3, v1, v2, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    .line 1
    iget v0, p0, Lba/q;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lba/q;->d:Landroid/graphics/Rect;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final isStateful()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final onStateChange([I)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    aget v3, p1, v2

    .line 10
    .line 11
    const v4, 0x10100a7

    .line 12
    .line 13
    .line 14
    if-ne v4, v3, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v2, -0x1

    .line 21
    :goto_1
    const/4 p1, 0x1

    .line 22
    if-ltz v2, :cond_2

    .line 23
    .line 24
    move v0, p1

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move v0, v1

    .line 27
    :goto_2
    iget-boolean v2, p0, Lba/q;->f:Z

    .line 28
    .line 29
    if-ne v0, v2, :cond_3

    .line 30
    .line 31
    return v1

    .line 32
    :cond_3
    iput-boolean v0, p0, Lba/q;->f:Z

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 35
    .line 36
    .line 37
    return p1
.end method

.method public final setAlpha(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0xff

    .line 3
    .line 4
    invoke-static {p1, v0, v1}, Lr9/e0;->r(III)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lba/q;->e:I

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lba/q;->c:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
