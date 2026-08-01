.class public Lcom/google/android/material/textview/MaterialTextView;
.super Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    const v0, 0x1010084

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {p1, p2, v0, v1}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const v3, 0x240405a4

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-static {v2, v3, v4}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏楪哲兰世(Landroid/content/res/Resources$Theme;IZ)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    sget-object v3, L飘花落叶言楪苏子世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲:[I

    .line 35
    .line 36
    invoke-virtual {v2, p2, v3, v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const/4 v6, 0x2

    .line 41
    filled-new-array {v4, v6}, [I

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static {p1, v5, v4}, Lcom/google/android/material/textview/MaterialTextView;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;Landroid/content/res/TypedArray;[I)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 50
    .line 51
    .line 52
    const/4 v4, -0x1

    .line 53
    if-eq p1, v4, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v2, p2, v3, v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 65
    .line 66
    .line 67
    if-eq p2, v4, :cond_1

    .line 68
    .line 69
    sget-object p1, L飘花落叶言楪苏子世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰:[I

    .line 70
    .line 71
    invoke-virtual {v2, p2, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    const/4 v0, 0x4

    .line 80
    filled-new-array {v6, v0}, [I

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {p2, p1, v0}, Lcom/google/android/material/textview/MaterialTextView;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;Landroid/content/res/TypedArray;[I)I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 89
    .line 90
    .line 91
    if-ltz p2, :cond_1

    .line 92
    .line 93
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;->setLineHeight(I)V

    .line 94
    .line 95
    .line 96
    :cond_1
    :goto_0
    return-void
.end method

.method public static varargs 飘花落叶言子楪苏世哲兰(Landroid/content/Context;Landroid/content/res/TypedArray;[I)I
    .locals 7

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v3, v0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    array-length v4, p2

    .line 6
    if-ge v2, v4, :cond_2

    .line 7
    .line 8
    if-gez v3, :cond_2

    .line 9
    .line 10
    aget v3, p2, v2

    .line 11
    .line 12
    new-instance v4, Landroid/util/TypedValue;

    .line 13
    .line 14
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-eqz v5, :cond_1

    .line 22
    .line 23
    iget v5, v4, Landroid/util/TypedValue;->type:I

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    if-eq v5, v6, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget v4, v4, Landroid/util/TypedValue;->data:I

    .line 34
    .line 35
    filled-new-array {v4}, [I

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v3, v4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 48
    .line 49
    .line 50
    move v3, v4

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    :goto_1
    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    return v3
.end method


# virtual methods
.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;->setTextAppearance(Landroid/content/Context;I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const v2, 0x240405a4

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2, v0}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏楪哲兰世(Landroid/content/res/Resources$Theme;IZ)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, L飘花落叶言楪苏子世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰:[I

    .line 23
    .line 24
    invoke-virtual {p1, p2, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const/4 v0, 0x2

    .line 33
    const/4 v1, 0x4

    .line 34
    filled-new-array {v0, v1}, [I

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p2, p1, v0}, Lcom/google/android/material/textview/MaterialTextView;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;Landroid/content/res/TypedArray;[I)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 43
    .line 44
    .line 45
    if-ltz p2, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;->setLineHeight(I)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method
