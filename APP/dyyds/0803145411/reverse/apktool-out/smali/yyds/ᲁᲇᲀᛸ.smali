.class public abstract Lyyds/ᲁᲇᲀᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛸᛵ;


# instance fields
.field public ᛱᛳᲇ:I

.field public ᛱᲈᲁ:I

.field public ᛲᛲᲈᲈ:Z

.field public final ᛲᛳᛴᛸ:Lyyds/ᛴᲈᛷᛷ;

.field public ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

.field public final ᛲᛶᛱᲈ:Landroid/graphics/Rect;

.field public final ᛳᛸᛴᛶ:Lyyds/ᛷᛵᛱᛵ;

.field public final ᛳᲁᲁᲇ:I

.field public ᛵᛶᛲᲀ:Landroid/widget/AdapterView$OnItemClickListener;

.field public ᛵᲀᛵᛸ:Z

.field public final ᛵᲀᲈᛴ:Landroid/os/Handler;

.field public ᛶᛳᛶᛵ:Landroid/view/View;

.field public ᛶᛷᛲᲁ:I

.field public final ᛶᛸᲀᲁ:Lyyds/ᛵᛴᛵᲈ;

.field public final ᛶᲈᛴᲈ:Lyyds/ᛲᲁᛴᛶ;

.field public ᛷᛲᲈᛱ:Z

.field public ᛷᛵᲇᲀ:Z

.field public final ᛷᲈᲈᲁ:I

.field public final ᲀᛲᛲᲇ:Lyyds/ᛵᛴᛵᲈ;

.field public final ᲀᛲᛳᲀ:Landroid/content/Context;

.field public ᲇᛱᛲ:Lyyds/ᛴᲁᛷ;

.field public final ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:Landroid/widget/ListAdapter;

.field public ᲈᲀᛲᲀ:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x2

    .line 5
    iput v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᲇᲇᲇᛱ:I

    .line 6
    .line 7
    iput v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛷᛲᲁ:I

    .line 8
    .line 9
    const/16 v0, 0x3ea

    .line 10
    .line 11
    iput v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛷᲈᲈᲁ:I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛱᛳᲇ:I

    .line 15
    .line 16
    const v1, 0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛳᲁᲁᲇ:I

    .line 20
    .line 21
    new-instance v1, Lyyds/ᛵᛴᛵᲈ;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v1, p0, v2}, Lyyds/ᛵᛴᛵᲈ;-><init>(Lyyds/ᲁᲇᲀᛸ;I)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᲀᛲᛲᲇ:Lyyds/ᛵᛴᛵᲈ;

    .line 28
    .line 29
    new-instance v1, Lyyds/ᛷᛵᛱᛵ;

    .line 30
    .line 31
    invoke-direct {v1, v2, p0}, Lyyds/ᛷᛵᛱᛵ;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛳᛸᛴᛶ:Lyyds/ᛷᛵᛱᛵ;

    .line 35
    .line 36
    new-instance v1, Lyyds/ᛲᲁᛴᛶ;

    .line 37
    .line 38
    invoke-direct {v1, p0}, Lyyds/ᛲᲁᛴᛶ;-><init>(Lyyds/ᲁᲇᲀᛸ;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᲈᛴᲈ:Lyyds/ᛲᲁᛴᛶ;

    .line 42
    .line 43
    new-instance v1, Lyyds/ᛵᛴᛵᲈ;

    .line 44
    .line 45
    invoke-direct {v1, p0, v0}, Lyyds/ᛵᛴᛵᲈ;-><init>(Lyyds/ᲁᲇᲀᛸ;I)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛸᲀᲁ:Lyyds/ᛵᛴᛵᲈ;

    .line 49
    .line 50
    new-instance v1, Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛶᛱᲈ:Landroid/graphics/Rect;

    .line 56
    .line 57
    iput-object p1, p0, Lyyds/ᲁᲇᲀᛸ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 58
    .line 59
    new-instance v1, Landroid/os/Handler;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛵᲀᲈᛴ:Landroid/os/Handler;

    .line 69
    .line 70
    sget-object v1, Lyyds/ᛷᛷᛴᛳ;->ᛳᲁᲁᲇ:[I

    .line 71
    .line 72
    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    iput v3, p0, Lyyds/ᲁᲇᲀᛸ;->ᛱᲈᲁ:I

    .line 81
    .line 82
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    iput v3, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛶᲁ:I

    .line 87
    .line 88
    if-eqz v3, :cond_0

    .line 89
    .line 90
    iput-boolean v2, p0, Lyyds/ᲁᲇᲀᛸ;->ᛷᛲᲈᛱ:Z

    .line 91
    .line 92
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lyyds/ᛴᲈᛷᛷ;

    .line 96
    .line 97
    invoke-direct {v1, p1, p2, p3, v0}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 98
    .line 99
    .line 100
    sget-object v3, Lyyds/ᛷᛷᛴᛳ;->ᲀᛲᛲᲇ:[I

    .line 101
    .line 102
    invoke-virtual {p1, p2, v3, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    const/4 p3, 0x2

    .line 107
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_1

    .line 112
    .line 113
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    invoke-virtual {v1, p3}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    .line 118
    .line 119
    .line 120
    :cond_1
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    if-eqz p3, :cond_2

    .line 125
    .line 126
    invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 127
    .line 128
    .line 129
    move-result p3

    .line 130
    if-eqz p3, :cond_2

    .line 131
    .line 132
    invoke-static {p1, p3}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    goto :goto_0

    .line 137
    :cond_2
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 145
    .line 146
    .line 147
    iput-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛴᛸ:Lyyds/ᛴᲈᛷᛷ;

    .line 148
    .line 149
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 150
    .line 151
    .line 152
    return-void
.end method


# virtual methods
.method public final dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛴᛸ:Lyyds/ᛴᲈᛷᛷ;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 11
    .line 12
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛵᲀᲈᛴ:Landroid/os/Handler;

    .line 13
    .line 14
    iget-object p0, p0, Lyyds/ᲁᲇᲀᛸ;->ᲀᛲᛲᲇ:Lyyds/ᛵᛴᛵᲈ;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final show()V
    .locals 13

    .line 1
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛴᛸ:Lyyds/ᛴᲈᛷᛷ;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛵᲀᛵᛸ:Z

    .line 12
    .line 13
    xor-int/2addr v0, v2

    .line 14
    invoke-virtual {p0, v1, v0}, Lyyds/ᲁᲇᲀᛸ;->ᛳᲁᲁᲇ(Landroid/content/Context;Z)Lyyds/ᲀᛸᛲᛸ;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 19
    .line 20
    iget-object v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᲇᲈᛵᛷ:Landroid/widget/ListAdapter;

    .line 21
    .line 22
    invoke-virtual {v0, v5}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 26
    .line 27
    iget-object v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᛵᛶᛲᲀ:Landroid/widget/AdapterView$OnItemClickListener;

    .line 28
    .line 29
    invoke-virtual {v0, v5}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 43
    .line 44
    new-instance v5, Lyyds/ᛳᛷᛲᛵ;

    .line 45
    .line 46
    invoke-direct {v5, v4, p0}, Lyyds/ᛳᛷᛲᛵ;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v5}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 53
    .line 54
    iget-object v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᲈᛴᲈ:Lyyds/ᛲᲁᛴᛶ;

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 60
    .line 61
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Landroid/view/ViewGroup;

    .line 70
    .line 71
    :goto_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛶᛱᲈ:Landroid/graphics/Rect;

    .line 76
    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 80
    .line 81
    .line 82
    iget v0, v5, Landroid/graphics/Rect;->top:I

    .line 83
    .line 84
    iget v6, v5, Landroid/graphics/Rect;->bottom:I

    .line 85
    .line 86
    add-int/2addr v6, v0

    .line 87
    iget-boolean v7, p0, Lyyds/ᲁᲇᲀᛸ;->ᛷᛲᲈᛱ:Z

    .line 88
    .line 89
    if-nez v7, :cond_2

    .line 90
    .line 91
    neg-int v0, v0

    .line 92
    iput v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛶᲁ:I

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-virtual {v5}, Landroid/graphics/Rect;->setEmpty()V

    .line 96
    .line 97
    .line 98
    move v6, v4

    .line 99
    :cond_2
    :goto_1
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/4 v7, 0x2

    .line 104
    if-ne v0, v7, :cond_3

    .line 105
    .line 106
    move v0, v2

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    move v0, v4

    .line 109
    :goto_2
    iget-object v8, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛳᛶᛵ:Landroid/view/View;

    .line 110
    .line 111
    iget v9, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛶᲁ:I

    .line 112
    .line 113
    invoke-static {v3, v8, v9, v0}, Lyyds/ᛳᛵᛵᛵ;->ᛲᲈᲁ(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget v8, p0, Lyyds/ᲁᲇᲀᛸ;->ᲇᲇᲇᛱ:I

    .line 118
    .line 119
    const/4 v9, -0x2

    .line 120
    const/4 v10, -0x1

    .line 121
    if-ne v8, v10, :cond_4

    .line 122
    .line 123
    add-int/2addr v0, v6

    .line 124
    goto :goto_5

    .line 125
    :cond_4
    iget v11, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛷᛲᲁ:I

    .line 126
    .line 127
    if-eq v11, v9, :cond_6

    .line 128
    .line 129
    const/high16 v12, 0x40000000    # 2.0f

    .line 130
    .line 131
    if-eq v11, v10, :cond_5

    .line 132
    .line 133
    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    goto :goto_3

    .line 138
    :cond_5
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 147
    .line 148
    iget v11, v5, Landroid/graphics/Rect;->left:I

    .line 149
    .line 150
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 151
    .line 152
    add-int/2addr v11, v5

    .line 153
    sub-int/2addr v1, v11

    .line 154
    invoke-static {v1, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    goto :goto_3

    .line 159
    :cond_6
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 168
    .line 169
    iget v11, v5, Landroid/graphics/Rect;->left:I

    .line 170
    .line 171
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 172
    .line 173
    add-int/2addr v11, v5

    .line 174
    sub-int/2addr v1, v11

    .line 175
    const/high16 v5, -0x80000000

    .line 176
    .line 177
    invoke-static {v1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    :goto_3
    iget-object v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 182
    .line 183
    invoke-virtual {v5, v1, v0}, Lyyds/ᲀᛸᛲᛸ;->ᛲᲈᲁ(II)I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-lez v0, :cond_7

    .line 188
    .line 189
    iget-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 190
    .line 191
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    iget-object v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 196
    .line 197
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    add-int/2addr v5, v1

    .line 202
    add-int/2addr v5, v6

    .line 203
    goto :goto_4

    .line 204
    :cond_7
    move v5, v4

    .line 205
    :goto_4
    add-int/2addr v0, v5

    .line 206
    :goto_5
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-ne v1, v7, :cond_8

    .line 211
    .line 212
    move v1, v2

    .line 213
    goto :goto_6

    .line 214
    :cond_8
    move v1, v4

    .line 215
    :goto_6
    iget v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᛷᲈᲈᲁ:I

    .line 216
    .line 217
    invoke-virtual {v3, v5}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_14

    .line 225
    .line 226
    iget-object v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛳᛶᛵ:Landroid/view/View;

    .line 227
    .line 228
    sget-object v6, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 229
    .line 230
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-nez v5, :cond_9

    .line 235
    .line 236
    goto/16 :goto_e

    .line 237
    .line 238
    :cond_9
    iget v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛷᛲᲁ:I

    .line 239
    .line 240
    if-ne v5, v10, :cond_a

    .line 241
    .line 242
    move v5, v10

    .line 243
    goto :goto_7

    .line 244
    :cond_a
    if-ne v5, v9, :cond_b

    .line 245
    .line 246
    iget-object v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛳᛶᛵ:Landroid/view/View;

    .line 247
    .line 248
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    :cond_b
    :goto_7
    if-ne v8, v10, :cond_10

    .line 253
    .line 254
    if-eqz v1, :cond_c

    .line 255
    .line 256
    move v8, v0

    .line 257
    goto :goto_8

    .line 258
    :cond_c
    move v8, v10

    .line 259
    :goto_8
    iget v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛷᛲᲁ:I

    .line 260
    .line 261
    if-eqz v1, :cond_e

    .line 262
    .line 263
    if-ne v0, v10, :cond_d

    .line 264
    .line 265
    move v0, v10

    .line 266
    goto :goto_9

    .line 267
    :cond_d
    move v0, v4

    .line 268
    :goto_9
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 272
    .line 273
    .line 274
    goto :goto_a

    .line 275
    :cond_e
    if-ne v0, v10, :cond_f

    .line 276
    .line 277
    move v4, v10

    .line 278
    :cond_f
    invoke-virtual {v3, v4}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, v10}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 282
    .line 283
    .line 284
    goto :goto_a

    .line 285
    :cond_10
    if-ne v8, v9, :cond_11

    .line 286
    .line 287
    move v8, v0

    .line 288
    :cond_11
    :goto_a
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 289
    .line 290
    .line 291
    iget-object v4, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛳᛶᛵ:Landroid/view/View;

    .line 292
    .line 293
    move v0, v5

    .line 294
    iget v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᛱᲈᲁ:I

    .line 295
    .line 296
    iget v6, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛶᲁ:I

    .line 297
    .line 298
    if-gez v0, :cond_12

    .line 299
    .line 300
    move v7, v10

    .line 301
    goto :goto_b

    .line 302
    :cond_12
    move v7, v0

    .line 303
    :goto_b
    if-gez v8, :cond_13

    .line 304
    .line 305
    move v8, v10

    .line 306
    :cond_13
    invoke-virtual/range {v3 .. v8}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_14
    iget v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛷᛲᲁ:I

    .line 311
    .line 312
    if-ne v1, v10, :cond_15

    .line 313
    .line 314
    move v1, v10

    .line 315
    goto :goto_c

    .line 316
    :cond_15
    if-ne v1, v9, :cond_16

    .line 317
    .line 318
    iget-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛳᛶᛵ:Landroid/view/View;

    .line 319
    .line 320
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    :cond_16
    :goto_c
    if-ne v8, v10, :cond_17

    .line 325
    .line 326
    move v8, v10

    .line 327
    goto :goto_d

    .line 328
    :cond_17
    if-ne v8, v9, :cond_18

    .line 329
    .line 330
    move v8, v0

    .line 331
    :cond_18
    :goto_d
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3, v8}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 335
    .line 336
    .line 337
    invoke-static {v3, v2}, Lyyds/ᛷᲇᛸᛷ;->ᛵᛸᛸᛷ(Landroid/widget/PopupWindow;Z)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 341
    .line 342
    .line 343
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛳᛸᛴᛶ:Lyyds/ᛷᛵᛱᛵ;

    .line 344
    .line 345
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 346
    .line 347
    .line 348
    iget-boolean v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛲᲈᲈ:Z

    .line 349
    .line 350
    if-eqz v0, :cond_19

    .line 351
    .line 352
    iget-boolean v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛷᛵᲇᲀ:Z

    .line 353
    .line 354
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    .line 355
    .line 356
    .line 357
    :cond_19
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᲈᲀᛲᲀ:Landroid/graphics/Rect;

    .line 358
    .line 359
    invoke-static {v3, v0}, Lyyds/ᛷᲇᛸᛷ;->ᛲᲈᲁ(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    .line 360
    .line 361
    .line 362
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛳᛶᛵ:Landroid/view/View;

    .line 363
    .line 364
    iget v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛱᲈᲁ:I

    .line 365
    .line 366
    iget v4, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛶᲁ:I

    .line 367
    .line 368
    iget v5, p0, Lyyds/ᲁᲇᲀᛸ;->ᛱᛳᲇ:I

    .line 369
    .line 370
    invoke-virtual {v3, v0, v1, v4, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 371
    .line 372
    .line 373
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 374
    .line 375
    invoke-virtual {v0, v10}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 376
    .line 377
    .line 378
    iget-boolean v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛵᲀᛵᛸ:Z

    .line 379
    .line 380
    if-eqz v0, :cond_1a

    .line 381
    .line 382
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 383
    .line 384
    invoke-virtual {v0}, Lyyds/ᲀᛸᛲᛸ;->isInTouchMode()Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-eqz v0, :cond_1b

    .line 389
    .line 390
    :cond_1a
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 391
    .line 392
    if-eqz v0, :cond_1b

    .line 393
    .line 394
    invoke-virtual {v0, v2}, Lyyds/ᲀᛸᛲᛸ;->setListSelectionHidden(Z)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 398
    .line 399
    .line 400
    :cond_1b
    iget-boolean v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛵᲀᛵᛸ:Z

    .line 401
    .line 402
    if-nez v0, :cond_1c

    .line 403
    .line 404
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛵᲀᲈᛴ:Landroid/os/Handler;

    .line 405
    .line 406
    iget-object p0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛸᲀᲁ:Lyyds/ᛵᛴᛵᲈ;

    .line 407
    .line 408
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 409
    .line 410
    .line 411
    :cond_1c
    :goto_e
    return-void
.end method

.method public ᛱᛳᲇ(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᲇᛱᛲ:Lyyds/ᛴᲁᛷ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lyyds/ᛴᲁᛷ;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, Lyyds/ᛴᲁᛷ;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᲇᛱᛲ:Lyyds/ᛴᲁᛷ;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᲇᲈᛵᛷ:Landroid/widget/ListAdapter;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    iput-object p1, p0, Lyyds/ᲁᲇᲀᛸ;->ᲇᲈᛵᛷ:Landroid/widget/ListAdapter;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᲇᛱᛲ:Lyyds/ᛴᲁᛷ;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object p1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object p0, p0, Lyyds/ᲁᲇᲀᛸ;->ᲇᲈᛵᛷ:Landroid/widget/ListAdapter;

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 37
    .line 38
    .line 39
    :cond_3
    return-void
.end method

.method public final ᛱᲈᲁ(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛷᛲᲈᛱ:Z

    .line 5
    .line 6
    return-void
.end method

.method public final ᛲᛴᛳᛲ(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛴᛸ:Lyyds/ᛴᲈᛷᛷ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛲᲈᲁ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛴᛸ:Lyyds/ᛴᲈᛷᛷ;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public ᛳᲁᲁᲇ(Landroid/content/Context;Z)Lyyds/ᲀᛸᛲᛸ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᲀᛸᛲᛸ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᲀᛸᛲᛸ;-><init>(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛱᲈᲁ:I

    .line 2
    .line 3
    return p0
.end method

.method public final ᛷᛵᲇᲀ()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛷᛲᲈᛱ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    iget p0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛶᲁ:I

    .line 8
    .line 9
    return p0
.end method

.method public final ᛷᲈᲈᲁ(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛱᲈᲁ:I

    .line 2
    .line 3
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛴᛸ:Lyyds/ᛴᲈᛷᛷ;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᲇᛱᛲ(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛴᛸ:Lyyds/ᛴᲈᛷᛷ;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛶᛱᲈ:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    iget v0, v1, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    add-int/2addr v0, p1

    .line 20
    iput v0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛷᛲᲁ:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iput p1, p0, Lyyds/ᲁᲇᲀᛸ;->ᛶᛷᛲᲁ:I

    .line 24
    .line 25
    return-void
.end method

.method public final ᲇᲇᲇᛱ()Lyyds/ᲀᛸᛲᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛸᛲᛸ;

    .line 2
    .line 3
    return-object p0
.end method
