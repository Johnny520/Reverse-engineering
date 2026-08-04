.class public final Lyyds/ᛳᛴᛲᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public ᛱᛳᲇ:Landroid/view/View;

.field public ᛱᲈᲁ:I

.field public ᛲᛲᲈᲈ:D

.field public ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:Lyyds/ᛱᛱᛴ;

.field public ᛳᲁᲁᲇ:F

.field public ᛶᛳᛶᛵ:Z

.field public ᛶᛷᛲᲁ:I

.field public ᛷᛲᲈᛱ:I

.field public ᛷᛵᲇᲀ:I

.field public ᛷᲈᲈᲁ:I

.field public ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

.field public ᲇᛱᛲ:F

.field public final ᲇᲇᲇᛱ:Landroid/graphics/Rect;

.field public ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛵ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᲇᲇᲇᛱ:Landroid/graphics/Rect;

    .line 10
    .line 11
    return-void
.end method

.method public static ᛲᲈᲁ(Landroid/view/View;)Z
    .locals 2

    .line 1
    instance-of v0, p0, Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lyyds/ᛵᲇᛲᛱ;

    .line 7
    .line 8
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Lyyds/ᲇᲇᛵᛲ;->ᲇᲈᛵᛷ()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public static ᛵᛸᛸᛷ(Lyyds/ᛳᲀᛵᛵ;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sub-int/2addr p0, v1

    .line 19
    int-to-float v0, v0

    .line 20
    int-to-float p0, p0

    .line 21
    invoke-virtual {p2, v0, p0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method public static ᲀᛲᛳᲀ(Landroid/view/ViewGroup;Landroid/view/MotionEvent;)Landroid/view/View;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_5

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    const/4 v4, 0x2

    .line 14
    new-array v4, v4, [I

    .line 15
    .line 16
    invoke-virtual {v3, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 17
    .line 18
    .line 19
    aget v5, v4, v1

    .line 20
    .line 21
    const/4 v6, 0x1

    .line 22
    aget v4, v4, v6

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    add-int/2addr v6, v5

    .line 29
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    add-int/2addr v7, v4

    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    int-to-float v5, v5

    .line 43
    cmpl-float v5, v8, v5

    .line 44
    .line 45
    if-ltz v5, :cond_4

    .line 46
    .line 47
    int-to-float v5, v6

    .line 48
    cmpg-float v5, v8, v5

    .line 49
    .line 50
    if-gtz v5, :cond_4

    .line 51
    .line 52
    int-to-float v4, v4

    .line 53
    cmpl-float v4, v9, v4

    .line 54
    .line 55
    if-ltz v4, :cond_4

    .line 56
    .line 57
    int-to-float v4, v7

    .line 58
    cmpg-float v4, v9, v4

    .line 59
    .line 60
    if-gtz v4, :cond_4

    .line 61
    .line 62
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 63
    .line 64
    if-eqz v4, :cond_0

    .line 65
    .line 66
    invoke-virtual {v3}, Landroid/view/View;->isScrollContainer()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_0

    .line 71
    .line 72
    invoke-static {v3}, Lyyds/ᛳᛴᛲᲀ;->ᛲᲈᲁ(Landroid/view/View;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    goto :goto_1

    .line 77
    :cond_0
    instance-of v5, v3, Lyyds/ᛵᛸᛶᲀ;

    .line 78
    .line 79
    if-nez v5, :cond_2

    .line 80
    .line 81
    instance-of v5, v3, Lyyds/ᲈᲀᛶᲇ;

    .line 82
    .line 83
    if-nez v5, :cond_2

    .line 84
    .line 85
    instance-of v5, v3, Landroid/webkit/WebView;

    .line 86
    .line 87
    if-nez v5, :cond_2

    .line 88
    .line 89
    instance-of v5, v3, Landroid/widget/ScrollView;

    .line 90
    .line 91
    if-nez v5, :cond_2

    .line 92
    .line 93
    instance-of v5, v3, Landroid/widget/ListView;

    .line 94
    .line 95
    if-nez v5, :cond_2

    .line 96
    .line 97
    instance-of v5, v3, Landroid/widget/SeekBar;

    .line 98
    .line 99
    if-nez v5, :cond_2

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    :try_start_0
    const-string v6, "androidx.viewpager2.widget.ViewPager2"

    .line 106
    .line 107
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_1

    .line 116
    .line 117
    invoke-static {v3}, Lyyds/ᛳᛴᛲᲀ;->ᛲᲈᲁ(Landroid/view/View;)Z

    .line 118
    .line 119
    .line 120
    move-result v5
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    goto :goto_1

    .line 122
    :catch_0
    :cond_1
    move v5, v1

    .line 123
    goto :goto_1

    .line 124
    :cond_2
    invoke-static {v3}, Lyyds/ᛳᛴᛲᲀ;->ᛲᲈᲁ(Landroid/view/View;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    :goto_1
    if-eqz v5, :cond_3

    .line 129
    .line 130
    return-object v3

    .line 131
    :cond_3
    if-eqz v4, :cond_4

    .line 132
    .line 133
    check-cast v3, Landroid/view/ViewGroup;

    .line 134
    .line 135
    invoke-static {v3, p1}, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ(Landroid/view/ViewGroup;Landroid/view/MotionEvent;)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0

    .line 140
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :cond_5
    const/4 p0, 0x0

    .line 145
    return-object p0
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget-object p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛵ;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_12

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v2, 0x3

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    if-eq p1, v4, :cond_1

    .line 22
    .line 23
    if-eq p1, v2, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    :try_start_0
    invoke-static {v0, p1, p2}, Lyyds/ᛳᛴᛲᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲀᛵᛵ;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    iput-object v3, p0, Lyyds/ᛳᛴᛲᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 35
    .line 36
    return p1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    iput-object v3, p0, Lyyds/ᛳᛴᛲᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 39
    .line 40
    throw p1

    .line 41
    :cond_2
    :goto_0
    iget-object p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 42
    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    invoke-static {v0, p1, p2}, Lyyds/ᛳᛴᛲᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲀᛵᛵ;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_3
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᛶᛷᛲᲁ()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᲇᲇᲇᛱ()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᛲᛴᛳᛲ()V

    .line 57
    .line 58
    .line 59
    iput-object v3, p0, Lyyds/ᛳᛴᛲᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 60
    .line 61
    invoke-static {v0, p2}, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ(Landroid/view/ViewGroup;Landroid/view/MotionEvent;)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-static {v0, p1, p2}, Lyyds/ᛳᛴᛲᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲀᛵᛵ;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    iput-object p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 74
    .line 75
    return v4

    .line 76
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_10

    .line 81
    .line 82
    if-eq p1, v4, :cond_c

    .line 83
    .line 84
    const/4 v0, 0x2

    .line 85
    if-eq p1, v0, :cond_5

    .line 86
    .line 87
    if-eq p1, v2, :cond_c

    .line 88
    .line 89
    goto/16 :goto_5

    .line 90
    .line 91
    :cond_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    iget v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᛲᛳᛶᲁ:I

    .line 96
    .line 97
    int-to-float v0, v0

    .line 98
    sub-float/2addr p1, v0

    .line 99
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛷᲈᲈᲁ:I

    .line 104
    .line 105
    int-to-float v1, v1

    .line 106
    sub-float/2addr v0, v1

    .line 107
    iget v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛳᲁᲁᲇ:F

    .line 108
    .line 109
    sub-float/2addr p1, v1

    .line 110
    iget v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᲇᛱᛲ:F

    .line 111
    .line 112
    sub-float/2addr v0, v1

    .line 113
    iget-object v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 114
    .line 115
    if-nez v1, :cond_6

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_6
    iget-object v1, v1, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 119
    .line 120
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 121
    .line 122
    and-int/lit16 v1, v1, 0x200

    .line 123
    .line 124
    if-eqz v1, :cond_7

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_7
    :goto_1
    const/4 v1, 0x0

    .line 128
    invoke-static {p1, v1}, Ljava/lang/Math;->max(FF)F

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    :goto_2
    float-to-int p1, p1

    .line 137
    float-to-int v0, v0

    .line 138
    iget-object v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 139
    .line 140
    if-nez v1, :cond_8

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_8
    iget-object v2, v1, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 144
    .line 145
    iget v3, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 146
    .line 147
    const/16 v5, 0x33

    .line 148
    .line 149
    if-ne v3, v5, :cond_9

    .line 150
    .line 151
    iget v3, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 152
    .line 153
    if-ne v3, p1, :cond_9

    .line 154
    .line 155
    iget v3, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 156
    .line 157
    if-ne v3, v0, :cond_9

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_9
    iput p1, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 161
    .line 162
    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 163
    .line 164
    iput v5, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 165
    .line 166
    invoke-virtual {v1}, Lyyds/ᛴᛸᛵᲈ;->ᛷᲈᲈᲁ()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᛲᛴᛳᛲ()V

    .line 170
    .line 171
    .line 172
    :goto_3
    iget-boolean p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛶᛳᛶᛵ:Z

    .line 173
    .line 174
    if-eqz p1, :cond_a

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_a
    iget p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛳᲁᲁᲇ:F

    .line 178
    .line 179
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    iget v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᲇᛱᛲ:F

    .line 184
    .line 185
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    invoke-virtual {p0}, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ()F

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    sub-float/2addr p1, v0

    .line 194
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    cmpl-float p1, p1, v2

    .line 199
    .line 200
    if-gez p1, :cond_b

    .line 201
    .line 202
    sub-float/2addr v1, p2

    .line 203
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    cmpl-float p1, p1, v2

    .line 208
    .line 209
    if-ltz p1, :cond_11

    .line 210
    .line 211
    :cond_b
    iput-boolean v4, p0, Lyyds/ᛳᛴᛲᲀ;->ᛶᛳᛶᛵ:Z

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_c
    iget-boolean p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛶᛳᛶᛵ:Z

    .line 215
    .line 216
    if-eqz p1, :cond_f

    .line 217
    .line 218
    iget-object p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 219
    .line 220
    if-nez p1, :cond_d

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_d
    iget-object p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛱᛴ;

    .line 224
    .line 225
    if-nez p1, :cond_e

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_e
    const-wide v2, -0x9eade68a836eL

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    iget-object p1, p1, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast p1, Lyyds/ᛱᛳᛵᛱ;

    .line 239
    .line 240
    invoke-virtual {p1}, Lyyds/ᛱᛳᛵᛱ;->ᛲᛴᛳᛲ()V

    .line 241
    .line 242
    .line 243
    iget-object p1, p1, Lyyds/ᛱᛳᛵᛱ;->ᲇᲇᲇᛱ:Landroid/widget/FrameLayout;

    .line 244
    .line 245
    const/4 p2, 0x4

    .line 246
    invoke-virtual {p1, p2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 247
    .line 248
    .line 249
    :cond_f
    :goto_4
    :try_start_1
    iget-boolean p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛶᛳᛶᛵ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 250
    .line 251
    iput-boolean v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛶᛳᛶᛵ:Z

    .line 252
    .line 253
    return p1

    .line 254
    :catchall_1
    move-exception p1

    .line 255
    iput-boolean v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛶᛳᛶᛵ:Z

    .line 256
    .line 257
    throw p1

    .line 258
    :cond_10
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    iput p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛳᲁᲁᲇ:F

    .line 263
    .line 264
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    iput p1, p0, Lyyds/ᛳᛴᛲᲀ;->ᲇᛱᛲ:F

    .line 269
    .line 270
    iput-boolean v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛶᛳᛶᛵ:Z

    .line 271
    .line 272
    :cond_11
    :goto_5
    iget-boolean p0, p0, Lyyds/ᛳᛴᛲᲀ;->ᛶᛳᛶᛵ:Z

    .line 273
    .line 274
    return p0

    .line 275
    :cond_12
    :goto_6
    return v1
.end method

.method public final ᛲᛴᛳᛲ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛵ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x2

    .line 7
    new-array v1, v1, [I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    aget v0, v1, v0

    .line 14
    .line 15
    iput v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᛷᛲᲈᛱ:I

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    aget v0, v1, v0

    .line 19
    .line 20
    iput v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᛷᛵᲇᲀ:I

    .line 21
    .line 22
    return-void
.end method

.method public final ᛶᛷᛲᲁ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, v0, Lyyds/ᛴᛸᛵᲈ;->ᛵᛸᛸᛷ:Landroid/app/Activity;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛵ;

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_2
    if-nez v1, :cond_3

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_3
    iget-object v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᲇᲇᲇᛱ:Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 29
    .line 30
    .line 31
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 34
    .line 35
    sub-int/2addr v1, v2

    .line 36
    iput v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 37
    .line 38
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 39
    .line 40
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 41
    .line 42
    sub-int/2addr v1, v3

    .line 43
    iput v1, p0, Lyyds/ᛳᛴᛲᲀ;->ᛱᲈᲁ:I

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iput v2, p0, Lyyds/ᛳᛴᛲᲀ;->ᛲᛳᛶᲁ:I

    .line 51
    .line 52
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iput v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᛷᲈᲈᲁ:I

    .line 59
    .line 60
    return-void
.end method

.method public final ᲇᲇᲇᛱ()V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, v0, Lyyds/ᛴᛸᛵᲈ;->ᲇᲈᛵᛷ:Landroid/view/WindowManager;

    .line 7
    .line 8
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    new-instance v1, Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Landroid/graphics/Point;

    .line 24
    .line 25
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 29
    .line 30
    .line 31
    iget v0, v2, Landroid/graphics/Point;->x:I

    .line 32
    .line 33
    int-to-float v0, v0

    .line 34
    iget v3, v1, Landroid/util/DisplayMetrics;->xdpi:F

    .line 35
    .line 36
    div-float/2addr v0, v3

    .line 37
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 38
    .line 39
    int-to-float v2, v2

    .line 40
    iget v1, v1, Landroid/util/DisplayMetrics;->ydpi:F

    .line 41
    .line 42
    div-float/2addr v2, v1

    .line 43
    float-to-double v0, v0

    .line 44
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 45
    .line 46
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    float-to-double v5, v2

    .line 51
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    add-double/2addr v2, v0

    .line 56
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    iput-wide v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᛲᛲᲈᲈ:D

    .line 61
    .line 62
    return-void
.end method

.method public final ᲇᲈᛵᛷ()F
    .locals 5

    .line 1
    iget-wide v0, p0, Lyyds/ᛳᛴᛲᲀ;->ᛲᛲᲈᲈ:D

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmpl-double p0, v0, v2

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-lez p0, :cond_0

    .line 9
    .line 10
    const-wide/high16 v3, 0x402e000000000000L    # 15.0

    .line 11
    .line 12
    div-double/2addr v0, v3

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    double-to-int p0, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p0, v2

    .line 20
    :goto_0
    int-to-float p0, p0

    .line 21
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v2, p0, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method
