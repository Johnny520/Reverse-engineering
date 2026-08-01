.class public final L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世哲兰苏:F

.field public 飘花落叶言子楪世哲苏兰:F

.field public 飘花落叶言子楪世苏兰哲:I

.field public 飘花落叶言子楪世苏哲兰:I


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    sget-object v0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-ge v0, p2, :cond_4

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    iget v2, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 22
    .line 23
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    if-nez v1, :cond_1

    .line 31
    .line 32
    iget v2, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 33
    .line 34
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iput v1, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 39
    .line 40
    sget-object v2, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:[I

    .line 41
    .line 42
    aget v1, v2, v1

    .line 43
    .line 44
    iput v1, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v2, 0x4

    .line 48
    if-ne v1, v2, :cond_2

    .line 49
    .line 50
    iget v2, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 51
    .line 52
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iput v1, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const/4 v2, 0x3

    .line 60
    if-ne v1, v2, :cond_3

    .line 61
    .line 62
    iget v2, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 63
    .line 64
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iput v1, p0, L飘花落叶言子苏兰世楪哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 69
    .line 70
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    .line 75
    .line 76
    return-void
.end method
