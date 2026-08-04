.class public final Lyyds/ᛶᲀᛳᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᲇ:F

.field public final ᛱᲈᲁ:I

.field public ᛲᛲᲈᲈ:I

.field public final ᛲᛳᛶᲁ:Landroid/view/View;

.field public final ᛲᛴᛳᛲ:Lyyds/ᛸᛶᲈᛳ;

.field public final ᛲᲈᲁ:I

.field public final ᛳᛸᛴᛶ:Lyyds/ᛶᛱᲁᲀ;

.field public ᛳᲁᲁᲇ:F

.field public ᛵᛶᛲᲀ:I

.field public final ᛵᛸᛸᛷ:I

.field public ᛶᛳᛶᛵ:F

.field public final ᛶᛷᛲᲁ:I

.field public final ᛶᲈᛴᲈ:Landroid/graphics/Rect;

.field public final ᛷᛲᲈᛱ:Lyyds/ᛳᛴᲈᛷ;

.field public ᛷᛵᲇᲀ:Z

.field public final ᛷᲈᲈᲁ:Landroid/view/View;

.field public ᲀᛲᛲᲇ:Z

.field public final ᲀᛲᛳᲀ:Lcom/android/app/CustomRecyclerView;

.field public ᲇᛱᛲ:F

.field public final ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:Lyyds/ᛱᛵᛱᛱ;


# direct methods
.method public constructor <init>(Lcom/android/app/CustomRecyclerView;Lyyds/ᛱᛵᛱᛱ;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lyyds/ᛸᲁᲀᲁ;Lyyds/ᛸᛶᲈᛳ;)V
    .locals 3

    .line 1
    iget-object v0, p2, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛵᲇᛲᛱ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lyyds/ᛶᛱᲁᲀ;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, p0, v2}, Lyyds/ᛶᛱᲁᲀ;-><init>(Lyyds/ᛶᲀᛳᛴ;I)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛳᛸᛴᛶ:Lyyds/ᛶᛱᲁᲀ;

    .line 15
    .line 16
    new-instance v1, Landroid/graphics/Rect;

    .line 17
    .line 18
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛶᲈᛴᲈ:Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const v2, 0x66070058

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iput v1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛲᲈᲁ:I

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iput v2, p0, Lyyds/ᛶᲀᛳᛴ;->ᛵᛸᛸᛷ:I

    .line 49
    .line 50
    iput-object p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ:Lcom/android/app/CustomRecyclerView;

    .line 51
    .line 52
    iput-object p2, p0, Lyyds/ᛶᲀᛳᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛵᛱᛱ;

    .line 53
    .line 54
    iput-object p6, p0, Lyyds/ᛶᲀᛳᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛶᲈᛳ;

    .line 55
    .line 56
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    const/4 p6, 0x0

    .line 61
    if-ltz p2, :cond_2

    .line 62
    .line 63
    iput p2, p0, Lyyds/ᛶᲀᛳᛴ;->ᲇᲇᲇᛱ:I

    .line 64
    .line 65
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-ltz p2, :cond_1

    .line 70
    .line 71
    iput p2, p0, Lyyds/ᛶᲀᛳᛴ;->ᛶᛷᛲᲁ:I

    .line 72
    .line 73
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-ltz p2, :cond_0

    .line 78
    .line 79
    iput p2, p0, Lyyds/ᛶᲀᛳᛴ;->ᛱᲈᲁ:I

    .line 80
    .line 81
    new-instance p2, Landroid/view/View;

    .line 82
    .line 83
    invoke-direct {p2, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 84
    .line 85
    .line 86
    iput-object p2, p0, Lyyds/ᛶᲀᛳᛴ;->ᛲᛳᛶᲁ:Landroid/view/View;

    .line 87
    .line 88
    invoke-virtual {p2, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 89
    .line 90
    .line 91
    new-instance p3, Landroid/view/View;

    .line 92
    .line 93
    invoke-direct {p3, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    iput-object p3, p0, Lyyds/ᛶᲀᛳᛴ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 97
    .line 98
    invoke-virtual {p3, p4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 99
    .line 100
    .line 101
    new-instance p4, Lyyds/ᛳᛴᲈᛷ;

    .line 102
    .line 103
    invoke-direct {p4, v1, p6}, Lyyds/ᛳᛴᲈᛷ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 104
    .line 105
    .line 106
    iput-object p4, p0, Lyyds/ᛶᲀᛳᛴ;->ᛷᛲᲈᛱ:Lyyds/ᛳᛴᲈᛷ;

    .line 107
    .line 108
    new-instance p6, Landroid/widget/FrameLayout$LayoutParams;

    .line 109
    .line 110
    const/4 v1, -0x2

    .line 111
    invoke-direct {p6, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p4, p6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p5, p4}, Lyyds/ᛸᲁᲀᲁ;->accept(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1, p2}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, p3}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p4}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᛴ;->ᲇᲇᲇᛱ()V

    .line 134
    .line 135
    .line 136
    const/4 p1, 0x0

    .line 137
    invoke-virtual {p4, p1}, Landroid/view/View;->setAlpha(F)V

    .line 138
    .line 139
    .line 140
    new-instance p1, Lyyds/ᛶᛱᲁᲀ;

    .line 141
    .line 142
    const/4 p2, 0x1

    .line 143
    invoke-direct {p1, p0, p2}, Lyyds/ᛶᛱᲁᲀ;-><init>(Lyyds/ᛶᲀᛳᛴ;I)V

    .line 144
    .line 145
    .line 146
    new-instance p3, Lyyds/ᛲᲁᛷᛶ;

    .line 147
    .line 148
    invoke-direct {p3, p1}, Lyyds/ᛲᲁᛷᛶ;-><init>(Lyyds/ᛶᛱᲁᲀ;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, p3}, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ(Lyyds/ᛸᛳᲀᛴ;)V

    .line 152
    .line 153
    .line 154
    new-instance p1, Lyyds/ᛶᛱᲁᲀ;

    .line 155
    .line 156
    const/4 p3, 0x2

    .line 157
    invoke-direct {p1, p0, p3}, Lyyds/ᛶᛱᲁᲀ;-><init>(Lyyds/ᛶᲀᛳᛴ;I)V

    .line 158
    .line 159
    .line 160
    new-instance p3, Lyyds/ᛲᲇᲁᲁ;

    .line 161
    .line 162
    invoke-direct {p3, p2, p1}, Lyyds/ᛲᲇᲁᲁ;-><init>(ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, p3}, Lyyds/ᛵᲇᛲᛱ;->ᛲᛳᛶᲁ(Lyyds/ᲁᲈᛳᛴ;)V

    .line 166
    .line 167
    .line 168
    new-instance p1, Lyyds/ᛸᲈᛳᛱ;

    .line 169
    .line 170
    const/4 p2, 0x3

    .line 171
    invoke-direct {p1, p2, p0}, Lyyds/ᛸᲈᛳᛱ;-><init>(ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    new-instance p0, Lyyds/ᲀᛴᲁᛶ;

    .line 175
    .line 176
    invoke-direct {p0, p1}, Lyyds/ᲀᛴᲁᛶ;-><init>(Lyyds/ᛸᲈᛳᛱ;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, v0, Lyyds/ᛵᲇᛲᛱ;->ᲀᛲᛲᲇ:Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :cond_0
    const-string p0, "thumbDrawable.getIntrinsicHeight() < 0"

    .line 186
    .line 187
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p6

    .line 191
    :cond_1
    const-string p0, "thumbDrawable.getIntrinsicWidth() < 0"

    .line 192
    .line 193
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p6

    .line 197
    :cond_2
    const-string p0, "trackDrawable.getIntrinsicWidth() < 0"

    .line 198
    .line 199
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p6
.end method


# virtual methods
.method public final ᛱᲈᲁ(Z)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛲᲇ:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛲᲇ:Z

    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ:Lcom/android/app/CustomRecyclerView;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-boolean p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛲᲇ:Z

    .line 21
    .line 22
    iget-object v2, p0, Lyyds/ᛶᲀᛳᛴ;->ᛲᛳᛶᲁ:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Landroid/view/View;->setPressed(Z)V

    .line 25
    .line 26
    .line 27
    iget-boolean p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛲᲇ:Z

    .line 28
    .line 29
    iget-object v3, p0, Lyyds/ᛶᲀᛳᛴ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 30
    .line 31
    invoke-virtual {v3, p1}, Landroid/view/View;->setPressed(Z)V

    .line 32
    .line 33
    .line 34
    iget-boolean p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛲᲇ:Z

    .line 35
    .line 36
    iget-object v4, p0, Lyyds/ᛶᲀᛳᛴ;->ᛷᛲᲈᛱ:Lyyds/ᛳᛴᲈᛷ;

    .line 37
    .line 38
    iget-object v5, p0, Lyyds/ᛶᲀᛳᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛶᲈᛳ;

    .line 39
    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    iget-object p0, p0, Lyyds/ᛶᲀᛳᛴ;->ᛳᛸᛴᛶ:Lyyds/ᛶᛱᲁᲀ;

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v2, v3}, Lyyds/ᛸᛶᲈᛳ;->ᛲᲈᲁ(Landroid/view/View;Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    iget-boolean p0, v5, Lyyds/ᛸᛶᲈᛳ;->ᲀᛲᛳᲀ:Z

    .line 51
    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iput-boolean v1, v5, Lyyds/ᛸᛶᲈᛳ;->ᲀᛲᛳᲀ:Z

    .line 56
    .line 57
    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const/high16 p1, 0x3f800000    # 1.0f

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-wide/16 v0, 0x96

    .line 68
    .line 69
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᛴ;->ᲇᲇᲇᛱ()V

    .line 78
    .line 79
    .line 80
    iget-boolean p0, v5, Lyyds/ᛸᛶᲈᛳ;->ᲀᛲᛳᲀ:Z

    .line 81
    .line 82
    if-nez p0, :cond_4

    .line 83
    .line 84
    :goto_0
    return-void

    .line 85
    :cond_4
    const/4 p0, 0x0

    .line 86
    iput-boolean p0, v5, Lyyds/ᛸᛶᲈᛳ;->ᲀᛲᛳᲀ:Z

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const/4 p1, 0x0

    .line 93
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-wide/16 v0, 0xc8

    .line 98
    .line 99
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final ᛲᛳᛶᲁ()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᛴ;->ᛵᛸᛸᛷ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v2, v1

    .line 11
    :goto_0
    iput-boolean v2, p0, Lyyds/ᛶᲀᛳᛴ;->ᛷᛵᲇᲀ:Z

    .line 12
    .line 13
    if-eqz v2, :cond_7

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᛴ;->ᛲᲈᲁ()Landroid/graphics/Rect;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ:Lcom/android/app/CustomRecyclerView;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget v4, v2, Landroid/graphics/Rect;->top:I

    .line 26
    .line 27
    sub-int/2addr v3, v4

    .line 28
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 29
    .line 30
    sub-int/2addr v3, v2

    .line 31
    iget v2, p0, Lyyds/ᛶᲀᛳᛴ;->ᛱᲈᲁ:I

    .line 32
    .line 33
    sub-int/2addr v3, v2

    .line 34
    int-to-long v2, v3

    .line 35
    iget-object v4, p0, Lyyds/ᛶᲀᛳᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛵᛱᛱ;

    .line 36
    .line 37
    iget-object v5, v4, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Lyyds/ᛵᲇᛲᛱ;

    .line 40
    .line 41
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const/4 v7, -0x1

    .line 46
    if-nez v6, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v4}, Lyyds/ᛱᛵᛱᛱ;->ᛲᛶᛱᲈ()Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    if-nez v8, :cond_2

    .line 58
    .line 59
    :goto_1
    move v6, v7

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-static {v6}, Lyyds/ᲇᲇᛵᛲ;->ᲈᛷᲈᛶ(Landroid/view/View;)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    :goto_2
    invoke-virtual {v4}, Lyyds/ᛱᛵᛱᛱ;->ᛲᛶᛱᲈ()Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    if-nez v8, :cond_3

    .line 70
    .line 71
    move v6, v7

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    instance-of v9, v8, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 74
    .line 75
    if-eqz v9, :cond_4

    .line 76
    .line 77
    check-cast v8, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 78
    .line 79
    iget v8, v8, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 80
    .line 81
    div-int/2addr v6, v8

    .line 82
    :cond_4
    :goto_3
    if-ne v6, v7, :cond_5

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_5
    invoke-virtual {v4}, Lyyds/ᛱᛵᛱᛱ;->ᲀᛲᛲᲇ()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    iget-object v4, v4, Lyyds/ᛱᛵᛱᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v4, Landroid/graphics/Rect;

    .line 92
    .line 93
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-nez v9, :cond_6

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_6
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v4, v1}, Lyyds/ᛵᲇᛲᛱ;->ᲁᛶᛴᛸ(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    iget v7, v4, Landroid/graphics/Rect;->top:I

    .line 108
    .line 109
    :goto_4
    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    mul-int/2addr v6, v8

    .line 114
    add-int/2addr v6, v1

    .line 115
    sub-int v1, v6, v7

    .line 116
    .line 117
    :goto_5
    int-to-long v4, v1

    .line 118
    mul-long/2addr v2, v4

    .line 119
    int-to-long v0, v0

    .line 120
    div-long/2addr v2, v0

    .line 121
    long-to-int v1, v2

    .line 122
    :cond_7
    iput v1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛲᛲᲈᲈ:I

    .line 123
    .line 124
    return-void
.end method

.method public final ᛲᛴᛳᛲ(Landroid/view/View;IIII)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ:Lcom/android/app/CustomRecyclerView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/2addr p2, v0

    .line 12
    add-int/2addr p3, p0

    .line 13
    add-int/2addr v0, p4

    .line 14
    add-int/2addr p0, p5

    .line 15
    invoke-virtual {p1, p2, p3, v0, p0}, Landroid/view/View;->layout(IIII)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final ᛲᲈᲁ()Landroid/graphics/Rect;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ:Lcom/android/app/CustomRecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object p0, p0, Lyyds/ᛶᲀᛳᛴ;->ᛶᲈᛴᲈ:Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-virtual {p0, v1, v2, v3, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᛶᲀᛳᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛵᛱᛱ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lyyds/ᛵᲇᛲᛱ;

    .line 6
    .line 7
    invoke-virtual {v0}, Lyyds/ᛱᛵᛱᛱ;->ᛲᛶᛱᲈ()Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    :goto_0
    move v4, v3

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {v2}, Lyyds/ᲇᲇᛵᛲ;->ᛸᛸᛷᛱ()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    instance-of v5, v2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 24
    .line 25
    if-eqz v5, :cond_2

    .line 26
    .line 27
    check-cast v2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 28
    .line 29
    add-int/lit8 v4, v4, -0x1

    .line 30
    .line 31
    iget v2, v2, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 32
    .line 33
    div-int/2addr v4, v2

    .line 34
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    :cond_2
    :goto_1
    if-nez v4, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    invoke-virtual {v0}, Lyyds/ᛱᛵᛱᛱ;->ᲀᛲᛲᲇ()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    mul-int/2addr v4, v0

    .line 51
    add-int/2addr v4, v2

    .line 52
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    add-int v3, v0, v4

    .line 57
    .line 58
    :goto_2
    iget-object p0, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ:Lcom/android/app/CustomRecyclerView;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    sub-int/2addr v3, p0

    .line 65
    return v3
.end method

.method public final ᛶᛷᛲᲁ(I)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᛴ;->ᛲᲈᲁ()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ:Lcom/android/app/CustomRecyclerView;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 12
    .line 13
    sub-int/2addr v1, v2

    .line 14
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 15
    .line 16
    sub-int/2addr v1, v0

    .line 17
    iget v0, p0, Lyyds/ᛶᲀᛳᛴ;->ᛱᲈᲁ:I

    .line 18
    .line 19
    sub-int/2addr v1, v0

    .line 20
    const/4 v0, 0x0

    .line 21
    if-gez p1, :cond_0

    .line 22
    .line 23
    move p1, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-le p1, v1, :cond_1

    .line 26
    .line 27
    move p1, v1

    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᛴ;->ᛵᛸᛸᛷ()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-long v2, v2

    .line 33
    int-to-long v4, p1

    .line 34
    mul-long/2addr v2, v4

    .line 35
    int-to-long v4, v1

    .line 36
    div-long/2addr v2, v4

    .line 37
    long-to-int p1, v2

    .line 38
    iget-object p0, p0, Lyyds/ᛶᲀᛳᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛵᛱᛱ;

    .line 39
    .line 40
    iget-object v1, p0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lyyds/ᛵᲇᛲᛱ;

    .line 43
    .line 44
    invoke-virtual {v1}, Lyyds/ᛵᲇᛲᛱ;->ᛱᛵᲈᛸ()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    sub-int/2addr p1, v2

    .line 52
    invoke-virtual {p0}, Lyyds/ᛱᛵᛱᛱ;->ᲀᛲᛲᲇ()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    div-int v3, p1, v2

    .line 57
    .line 58
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    mul-int/2addr v2, v0

    .line 63
    sub-int/2addr v2, p1

    .line 64
    invoke-virtual {p0}, Lyyds/ᛱᛵᛱᛱ;->ᛲᛶᛱᲈ()Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-nez p0, :cond_2

    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    instance-of p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    move-object p1, p0

    .line 76
    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 77
    .line 78
    iget p1, p1, Landroidx/recyclerview/widget/GridLayoutManager;->ᲀᛴᲁᲈ:I

    .line 79
    .line 80
    mul-int/2addr v0, p1

    .line 81
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    sub-int/2addr v2, p1

    .line 86
    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ᲀᛴᛸᛷ(II)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final ᲀᛲᛳᲀ(FIII)Z
    .locals 2

    .line 1
    sub-int v0, p3, p2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget p0, p0, Lyyds/ᛶᲀᛳᛴ;->ᛲᲈᲁ:I

    .line 5
    .line 6
    if-lt v0, p0, :cond_0

    .line 7
    .line 8
    int-to-float p0, p2

    .line 9
    cmpl-float p0, p1, p0

    .line 10
    .line 11
    if-ltz p0, :cond_4

    .line 12
    .line 13
    int-to-float p0, p3

    .line 14
    cmpg-float p0, p1, p0

    .line 15
    .line 16
    if-gez p0, :cond_4

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    sub-int p3, p0, v0

    .line 20
    .line 21
    div-int/lit8 p3, p3, 0x2

    .line 22
    .line 23
    sub-int/2addr p2, p3

    .line 24
    if-gez p2, :cond_1

    .line 25
    .line 26
    move p2, v1

    .line 27
    :cond_1
    add-int p3, p2, p0

    .line 28
    .line 29
    if-le p3, p4, :cond_2

    .line 30
    .line 31
    sub-int p2, p4, p0

    .line 32
    .line 33
    if-gez p2, :cond_3

    .line 34
    .line 35
    move p2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move p4, p3

    .line 38
    :cond_3
    :goto_0
    int-to-float p0, p2

    .line 39
    cmpl-float p0, p1, p0

    .line 40
    .line 41
    if-ltz p0, :cond_4

    .line 42
    .line 43
    int-to-float p0, p4

    .line 44
    cmpg-float p0, p1, p0

    .line 45
    .line 46
    if-gez p0, :cond_4

    .line 47
    .line 48
    :goto_1
    const/4 p0, 0x1

    .line 49
    return p0

    .line 50
    :cond_4
    return v1
.end method

.method public final ᲇᲇᲇᛱ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ:Lcom/android/app/CustomRecyclerView;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛳᛸᛴᛶ:Lyyds/ᛶᛱᲁᲀ;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛶᲀᛳᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛶᲈᛳ;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-wide/16 v2, 0x5dc

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Landroid/view/View;FF)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ:Lcom/android/app/CustomRecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    sub-int/2addr v3, v1

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    sub-int/2addr v4, v1

    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p0, p2, v3, v4, v1}, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ(FIII)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    sub-int/2addr p2, v2

    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    sub-int/2addr p1, v2

    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p0, p3, p2, p1, v0}, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ(FIII)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_0

    .line 50
    .line 51
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_0
    const/4 p0, 0x0

    .line 54
    return p0
.end method
