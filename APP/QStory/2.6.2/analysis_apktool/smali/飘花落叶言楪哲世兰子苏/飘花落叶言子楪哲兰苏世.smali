.class public final L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世苏兰哲;
.implements Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏世兰;
.implements Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世苏兰哲(F)V
    .locals 6

    .line 1
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 4
    .line 5
    iget-object v1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;

    .line 6
    .line 7
    iget-object v2, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    int-to-float v2, v2

    .line 14
    add-float/2addr p1, v2

    .line 15
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-float v2, v2

    .line 22
    sub-float/2addr v2, p1

    .line 23
    const v3, 0x37a7c5ac    # 2.0E-5f

    .line 24
    .line 25
    .line 26
    mul-float/2addr v2, v3

    .line 27
    const/high16 v3, 0x3f800000    # 1.0f

    .line 28
    .line 29
    sub-float v2, v3, v2

    .line 30
    .line 31
    cmpl-float v4, v2, v3

    .line 32
    .line 33
    if-lez v4, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v3, v2

    .line 37
    :goto_0
    invoke-virtual {v1, v3}, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->setScale(F)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世哲苏楪兰()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    int-to-float v2, v2

    .line 45
    iget v3, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世兰楪哲苏:F

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    cmpl-float v5, v3, v4

    .line 49
    .line 50
    if-ltz v5, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    const/high16 v5, -0x40000000    # -2.0f

    .line 54
    .line 55
    cmpl-float v3, v3, v5

    .line 56
    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世哲苏楪兰()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    :goto_1
    int-to-float v3, v0

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iget v3, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世兰楪苏哲:F

    .line 66
    .line 67
    cmpl-float v4, v3, v4

    .line 68
    .line 69
    if-ltz v4, :cond_3

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    const/high16 v3, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v0, v3}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(F)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    goto :goto_1

    .line 79
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    int-to-float v0, v0

    .line 84
    sub-float/2addr v0, p1

    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    int-to-float p0, p0

    .line 90
    div-float/2addr v0, p0

    .line 91
    sub-float/2addr v3, v2

    .line 92
    mul-float/2addr v3, v0

    .line 93
    add-float/2addr v3, v2

    .line 94
    invoke-virtual {v1, v3}, Lcom/kongzue/dialogx/util/views/ActivityScreenShotImageView;->setRadius(F)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲兰世:Landroid/graphics/Rect;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏()V

    .line 9
    .line 10
    .line 11
    iget-boolean p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v0, 0x0

    .line 20
    cmpl-float p1, p1, v0

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 25
    .line 26
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰()F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {p1, p0}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->setY(F)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public 飘花落叶言子楪苏世兰哲()Z
    .locals 2

    .line 1
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏哲兰:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏兰世;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return v1
.end method
