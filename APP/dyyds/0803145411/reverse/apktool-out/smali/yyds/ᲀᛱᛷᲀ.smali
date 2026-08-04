.class public abstract Lyyds/ᲀᛱᛷᲀ;
.super Landroid/view/View;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᛶᛳ:Landroid/os/Handler;

.field public ᛱᛳᲇ:Landroid/view/View;

.field public ᛱᲈᲁ:Landroid/graphics/Bitmap;

.field public final ᛲᛲᲈᲈ:Landroid/graphics/Rect;

.field public final ᛲᛳᛴᛸ:Landroid/os/Handler;

.field public ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

.field public ᛲᛴᛳᛲ:F

.field public final ᛲᛶᛱᲈ:Ljava/util/WeakHashMap;

.field public ᛳᛸᛴᛶ:F

.field public ᛳᲁᲁᲇ:Z

.field public ᛵᛶᛲᲀ:F

.field public final ᛵᲀᛵᛸ:Ljava/util/Set;

.field public final ᛵᲀᲈᛴ:Landroid/graphics/Path;

.field public ᛶᛳᛶᛵ:F

.field public ᛶᛷᛲᲁ:Z

.field public final ᛶᛸᲀᲁ:Landroid/graphics/RectF;

.field public ᛶᲈᛴᲈ:F

.field public final ᛷᛲᲈᛱ:Landroid/graphics/Paint;

.field public final ᛷᛵᲇᲀ:Landroid/graphics/Rect;

.field public ᛷᛶᛷᲀ:Z

.field public ᛷᛸᲇᛶ:Landroid/os/HandlerThread;

.field public ᛷᲇᛲᛱ:Z

.field public ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

.field public ᛸᛸᛷᛱ:Z

.field public ᲀᛲᛱᛱ:Z

.field public ᲀᛲᛲᲇ:F

.field public ᲀᛲᛳᲀ:I

.field public ᲀᛴᲁᲈ:Z

.field public ᲇᛱᛲ:Z

.field public final ᲇᲇᲇᛱ:Lcom/qmdeve/blurview/BlurNative;

.field public ᲇᲈᛵᛷ:F

.field public final ᲈᛷᲈᛶ:Lyyds/ᛴᲀᛷ;

.field public final ᲈᲀᛲᲀ:Ljava/util/WeakHashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛴᛳᛲ:F

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᛷᛲᲁ:Z

    .line 9
    .line 10
    new-instance v2, Landroid/graphics/Paint;

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛲᲈᛱ:Landroid/graphics/Paint;

    .line 17
    .line 18
    new-instance v2, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛵᲇᲀ:Landroid/graphics/Rect;

    .line 24
    .line 25
    new-instance v2, Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛲᲈᲈ:Landroid/graphics/Rect;

    .line 31
    .line 32
    new-instance v2, Landroid/graphics/RectF;

    .line 33
    .line 34
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᛸᲀᲁ:Landroid/graphics/RectF;

    .line 38
    .line 39
    new-instance v2, Landroid/graphics/Path;

    .line 40
    .line 41
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᲀᲈᛴ:Landroid/graphics/Path;

    .line 45
    .line 46
    new-instance v2, Ljava/util/WeakHashMap;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛶᛱᲈ:Ljava/util/WeakHashMap;

    .line 52
    .line 53
    new-instance v2, Ljava/util/WeakHashMap;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᲈᲀᛲᲀ:Ljava/util/WeakHashMap;

    .line 59
    .line 60
    new-instance v2, Ljava/util/WeakHashMap;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iput-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᲀᛵᛸ:Ljava/util/Set;

    .line 70
    .line 71
    new-instance v2, Landroid/os/Handler;

    .line 72
    .line 73
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-direct {v2, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 78
    .line 79
    .line 80
    iput-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛴᛸ:Landroid/os/Handler;

    .line 81
    .line 82
    iput-boolean v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛸᛸᛷᛱ:Z

    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    iput-boolean v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 86
    .line 87
    iput-boolean v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛴᲁᲈ:Z

    .line 88
    .line 89
    iput-boolean v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛶᛷᲀ:Z

    .line 90
    .line 91
    iput-boolean v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲇᛲᛱ:Z

    .line 92
    .line 93
    new-instance v4, Lyyds/ᛴᲀᛷ;

    .line 94
    .line 95
    move-object v5, p0

    .line 96
    check-cast v5, Lcom/qmdeve/blurview/widget/BlurView;

    .line 97
    .line 98
    invoke-direct {v4, v5}, Lyyds/ᛴᲀᛷ;-><init>(Lcom/qmdeve/blurview/widget/BlurView;)V

    .line 99
    .line 100
    .line 101
    iput-object v4, p0, Lyyds/ᲀᛱᛷᲀ;->ᲈᛷᲈᛶ:Lyyds/ᛴᲀᛷ;

    .line 102
    .line 103
    new-instance v4, Lcom/qmdeve/blurview/BlurNative;

    .line 104
    .line 105
    invoke-direct {v4}, Lcom/qmdeve/blurview/BlurNative;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object v4, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᲇᲇᛱ:Lcom/qmdeve/blurview/BlurNative;

    .line 109
    .line 110
    new-instance v4, Landroid/os/HandlerThread;

    .line 111
    .line 112
    const-string v6, "BlurViewPixelCopy"

    .line 113
    .line 114
    invoke-direct {v4, v6}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iput-object v4, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛸᲇᛶ:Landroid/os/HandlerThread;

    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 120
    .line 121
    .line 122
    new-instance v4, Landroid/os/Handler;

    .line 123
    .line 124
    iget-object v6, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛸᲇᛶ:Landroid/os/HandlerThread;

    .line 125
    .line 126
    invoke-virtual {v6}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-direct {v4, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 131
    .line 132
    .line 133
    iput-object v4, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᛶᛳ:Landroid/os/Handler;

    .line 134
    .line 135
    sget-object p0, Lyyds/ᛴᛴᛵᛲ;->ᛲᲈᲁ:[I

    .line 136
    .line 137
    invoke-virtual {p1, p2, p0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    const/high16 p2, 0x41c80000    # 25.0f

    .line 146
    .line 147
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {v1, p2, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    invoke-virtual {p0, v2, p1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    iput p1, v5, Lyyds/ᲀᛱᛷᲀ;->ᲇᲈᛵᛷ:F

    .line 160
    .line 161
    const/4 p1, 0x5

    .line 162
    const p2, -0x55000001

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    iput p1, v5, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 170
    .line 171
    const/4 p1, 0x3

    .line 172
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    iput p1, v5, Lyyds/ᲀᛱᛷᲀ;->ᛶᛳᛶᛵ:F

    .line 177
    .line 178
    const/4 p2, 0x6

    .line 179
    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    iput p1, v5, Lyyds/ᲀᛱᛷᲀ;->ᛵᛶᛲᲀ:F

    .line 184
    .line 185
    const/4 p1, 0x7

    .line 186
    iget p2, v5, Lyyds/ᲀᛱᛷᲀ;->ᛶᛳᛶᛵ:F

    .line 187
    .line 188
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    iput p1, v5, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛲᲇ:F

    .line 193
    .line 194
    iget p1, v5, Lyyds/ᲀᛱᛷᲀ;->ᛶᛳᛶᛵ:F

    .line 195
    .line 196
    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    iput p1, v5, Lyyds/ᲀᛱᛷᲀ;->ᛳᛸᛴᛶ:F

    .line 201
    .line 202
    iget p1, v5, Lyyds/ᲀᛱᛷᲀ;->ᛶᛳᛶᛵ:F

    .line 203
    .line 204
    invoke-virtual {p0, v3, p1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    iput p1, v5, Lyyds/ᲀᛱᛷᲀ;->ᛶᲈᛴᲈ:F

    .line 209
    .line 210
    const/4 p1, 0x4

    .line 211
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    iput p1, v5, Lyyds/ᲀᛱᛷᲀ;->ᛲᛴᛳᛲ:F

    .line 216
    .line 217
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 218
    .line 219
    .line 220
    return-void
.end method

.method private getActivityWindow()Landroid/view/Window;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    const/4 v1, 0x4

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    instance-of v1, p0, Landroid/app/Activity;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    instance-of v1, p0, Landroid/content/ContextWrapper;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast p0, Landroid/content/ContextWrapper;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    instance-of v0, p0, Landroid/app/Activity;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    check-cast p0, Landroid/app/Activity;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    return-object p0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᛱᛲ:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛸᛸᛷᛱ:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲀᛱᛷᲀ;->ᛲᛴᛳᛲ()Z

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛸᛸᛷᛱ:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 20
    .line 21
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    return-void
.end method

.method public getActivityDecorView()Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    const/4 v1, 0x4

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    instance-of v1, p0, Landroid/app/Activity;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    instance-of v1, p0, Landroid/content/ContextWrapper;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast p0, Landroid/content/ContextWrapper;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    instance-of v0, p0, Landroid/app/Activity;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    check-cast p0, Landroid/app/Activity;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public getBlurRounds()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᲇᲇᛱ:Lcom/qmdeve/blurview/BlurNative;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lcom/qmdeve/blurview/BlurNative;->ᲀᛲᛳᲀ:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, -0x1

    .line 9
    return p0
.end method

.method public getBlurredBitmap()Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBottomLeftCornerRadius()F
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛳᛸᛴᛶ:F

    .line 2
    .line 3
    return p0
.end method

.method public getBottomRightCornerRadius()F
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᲈᛴᲈ:F

    .line 2
    .line 3
    return p0
.end method

.method public getCornerRadius()F
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᛳᛶᛵ:F

    .line 2
    .line 3
    return p0
.end method

.method public getOverlayColor()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    return p0
.end method

.method public getTopLeftCornerRadius()F
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᛶᛲᲀ:F

    .line 2
    .line 3
    return p0
.end method

.method public getTopRightCornerRadius()F
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛲᲇ:F

    .line 2
    .line 3
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyyds/ᲀᛱᛷᲀ;->getActivityDecorView()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲈᛷᲈᛶ:Lyyds/ᛴᲀᛷ;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x1

    .line 32
    if-eq v0, v1, :cond_0

    .line 33
    .line 34
    move v0, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    :goto_0
    iput-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛳᲁᲁᲇ:Z

    .line 38
    .line 39
    iput-boolean v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛸᛸᛷᛱ:Z

    .line 40
    .line 41
    iput-boolean v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲈᛷᲈᛶ:Lyyds/ᛴᲀᛷ;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲀᛱᛷᲀ;->ᛶᛷᛲᲁ()V

    .line 18
    .line 19
    .line 20
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Lyyds/ᲀᛳᛳᛱ;->ᛲᛳᛶᲁ:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᛱᛲ:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    iget-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᲀᲈᛴ:Landroid/graphics/Path;

    .line 16
    .line 17
    iget-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᛸᲀᲁ:Landroid/graphics/RectF;

    .line 18
    .line 19
    iget-object v3, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛲᲈᲈ:Landroid/graphics/Rect;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v4, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 28
    .line 29
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iget-object v5, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛵᲇᲀ:Landroid/graphics/Rect;

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    invoke-virtual {v5, v6, v6, v0, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {v3, v6, v6, v0, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lyyds/ᲀᛱᛷᲀ;->ᲇᲈᛵᛷ()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v4, 0x0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v2}, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ(Landroid/graphics/RectF;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 70
    .line 71
    invoke-virtual {p1, v0, v5, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 79
    .line 80
    invoke-virtual {p1, v0, v5, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    :goto_0
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 84
    .line 85
    iget-object v4, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛲᲈᛱ:Landroid/graphics/Paint;

    .line 86
    .line 87
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lyyds/ᲀᛱᛷᲀ;->ᲇᲈᛵᛷ()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v2}, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ(Landroid/graphics/RectF;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_3
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public setBlurRadius(F)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᲈᛵᛷ:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᲈᛵᛷ:F

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᛷᛲᲁ:Z

    .line 16
    .line 17
    iput-boolean p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public setBlurRounds(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᲇᲇᛱ:Lcom/qmdeve/blurview/BlurNative;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/16 v1, 0xf

    .line 9
    .line 10
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, v0, Lcom/qmdeve/blurview/BlurNative;->ᲀᛲᛳᲀ:I

    .line 20
    .line 21
    iput-boolean v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᛷᛲᲁ:Z

    .line 22
    .line 23
    iput-boolean v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public setBottomLeftCornerRadius(F)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛳᛸᛴᛶ:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛳᛸᛴᛶ:F

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setBottomRightCornerRadius(F)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᲈᛴᲈ:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᲈᛴᲈ:F

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setCornerRadius(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᛳᛶᛵ:F

    .line 7
    .line 8
    cmpl-float v0, v0, p1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᛶᛲᲀ:F

    .line 13
    .line 14
    cmpl-float v0, v0, p1

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛲᲇ:F

    .line 19
    .line 20
    cmpl-float v0, v0, p1

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛳᛸᛴᛶ:F

    .line 25
    .line 26
    cmpl-float v0, v0, p1

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᲈᛴᲈ:F

    .line 31
    .line 32
    cmpl-float v0, v0, p1

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    :cond_0
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᛳᛶᛵ:F

    .line 37
    .line 38
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᛶᛲᲀ:F

    .line 39
    .line 40
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛲᲇ:F

    .line 41
    .line 42
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛳᛸᛴᛶ:F

    .line 43
    .line 44
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᲈᛴᲈ:F

    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public setDownsampleFactor(F)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛴᛳᛲ:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛴᛳᛲ:F

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᛷᛲᲁ:Z

    .line 16
    .line 17
    iput-boolean p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public setOverlayColor(I)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setTopLeftCornerRadius(F)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᛶᛲᲀ:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᛶᛲᲀ:F

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setTopRightCornerRadius(F)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛲᲇ:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛲᲇ:F

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final ᛱᲈᲁ(Landroid/graphics/RectF;)V
    .locals 13

    .line 1
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᛶᛲᲀ:F

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛲᲇ:F

    .line 4
    .line 5
    iget v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛳᛸᛴᛶ:F

    .line 6
    .line 7
    iget v3, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᲈᛴᲈ:F

    .line 8
    .line 9
    iget-object v4, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᲀᲈᛴ:Landroid/graphics/Path;

    .line 10
    .line 11
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    cmpg-float v5, v0, p0

    .line 16
    .line 17
    if-gtz v5, :cond_0

    .line 18
    .line 19
    cmpg-float v5, v1, p0

    .line 20
    .line 21
    if-gtz v5, :cond_0

    .line 22
    .line 23
    cmpg-float v5, v2, p0

    .line 24
    .line 25
    if-gtz v5, :cond_0

    .line 26
    .line 27
    cmpg-float v5, v3, p0

    .line 28
    .line 29
    if-gtz v5, :cond_0

    .line 30
    .line 31
    sget-object p0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 32
    .line 33
    invoke-virtual {v4, p1, p0}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/high16 v6, 0x40000000    # 2.0f

    .line 50
    .line 51
    div-float/2addr v5, v6

    .line 52
    invoke-static {v0, v5}, Ljava/lang/Math;->min(FF)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {p0, v0}, Ljava/lang/Math;->max(FF)F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {p0, v1}, Ljava/lang/Math;->max(FF)F

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {p0, v2}, Ljava/lang/Math;->max(FF)F

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-static {p0, v3}, Ljava/lang/Math;->max(FF)F

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    const v3, 0x3f0d6289

    .line 85
    .line 86
    .line 87
    mul-float v11, v0, v3

    .line 88
    .line 89
    mul-float v5, v1, v3

    .line 90
    .line 91
    mul-float v12, p0, v3

    .line 92
    .line 93
    mul-float/2addr v3, v2

    .line 94
    iget v6, p1, Landroid/graphics/RectF;->left:F

    .line 95
    .line 96
    add-float/2addr v6, v0

    .line 97
    iget v7, p1, Landroid/graphics/RectF;->top:F

    .line 98
    .line 99
    invoke-virtual {v4, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 100
    .line 101
    .line 102
    iget v6, p1, Landroid/graphics/RectF;->right:F

    .line 103
    .line 104
    sub-float/2addr v6, v1

    .line 105
    iget v7, p1, Landroid/graphics/RectF;->top:F

    .line 106
    .line 107
    invoke-virtual {v4, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 108
    .line 109
    .line 110
    iget v7, p1, Landroid/graphics/RectF;->right:F

    .line 111
    .line 112
    sub-float v6, v7, v1

    .line 113
    .line 114
    add-float/2addr v6, v5

    .line 115
    move v8, v5

    .line 116
    move v5, v6

    .line 117
    iget v6, p1, Landroid/graphics/RectF;->top:F

    .line 118
    .line 119
    add-float v10, v6, v1

    .line 120
    .line 121
    sub-float v8, v10, v8

    .line 122
    .line 123
    move v9, v7

    .line 124
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 125
    .line 126
    .line 127
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 128
    .line 129
    iget v5, p1, Landroid/graphics/RectF;->bottom:F

    .line 130
    .line 131
    sub-float/2addr v5, p0

    .line 132
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 133
    .line 134
    .line 135
    iget v5, p1, Landroid/graphics/RectF;->right:F

    .line 136
    .line 137
    iget v8, p1, Landroid/graphics/RectF;->bottom:F

    .line 138
    .line 139
    sub-float v1, v8, p0

    .line 140
    .line 141
    add-float v6, v1, v12

    .line 142
    .line 143
    sub-float v9, v5, p0

    .line 144
    .line 145
    add-float v7, v9, v12

    .line 146
    .line 147
    move v10, v8

    .line 148
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 149
    .line 150
    .line 151
    iget p0, p1, Landroid/graphics/RectF;->left:F

    .line 152
    .line 153
    add-float/2addr p0, v2

    .line 154
    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 155
    .line 156
    invoke-virtual {v4, p0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 157
    .line 158
    .line 159
    iget v7, p1, Landroid/graphics/RectF;->left:F

    .line 160
    .line 161
    add-float p0, v7, v2

    .line 162
    .line 163
    sub-float v5, p0, v3

    .line 164
    .line 165
    iget v6, p1, Landroid/graphics/RectF;->bottom:F

    .line 166
    .line 167
    sub-float v10, v6, v2

    .line 168
    .line 169
    add-float v8, v10, v3

    .line 170
    .line 171
    move v9, v7

    .line 172
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 173
    .line 174
    .line 175
    iget p0, p1, Landroid/graphics/RectF;->left:F

    .line 176
    .line 177
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 178
    .line 179
    add-float/2addr v1, v0

    .line 180
    invoke-virtual {v4, p0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 181
    .line 182
    .line 183
    iget v5, p1, Landroid/graphics/RectF;->left:F

    .line 184
    .line 185
    iget v8, p1, Landroid/graphics/RectF;->top:F

    .line 186
    .line 187
    add-float p0, v8, v0

    .line 188
    .line 189
    sub-float v6, p0, v11

    .line 190
    .line 191
    add-float v9, v5, v0

    .line 192
    .line 193
    sub-float v7, v9, v11

    .line 194
    .line 195
    move v10, v8

    .line 196
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public final ᛲᛴᛳᛲ()Z
    .locals 14

    .line 1
    const-string v0, "error: "

    .line 2
    .line 3
    const-string v1, "BaseBlurView"

    .line 4
    .line 5
    const-string v2, "Retry after hardware bitmap conversion failed: "

    .line 6
    .line 7
    const-string v3, "View hierarchy changed during blur operation: "

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v5, 0x0

    .line 14
    if-eqz v4, :cond_12

    .line 15
    .line 16
    iget-object v4, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 17
    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    goto/16 :goto_9

    .line 21
    .line 22
    :cond_0
    iget-object v4, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    iget v6, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᲈᛵᛷ:F

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    cmpg-float v8, v6, v7

    .line 28
    .line 29
    if-gtz v8, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lyyds/ᲀᛱᛷᲀ;->ᛶᛷᛲᲁ()V

    .line 32
    .line 33
    .line 34
    return v5

    .line 35
    :cond_1
    iget v8, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛴᛳᛲ:F

    .line 36
    .line 37
    cmpl-float v9, v8, v7

    .line 38
    .line 39
    if-lez v9, :cond_2

    .line 40
    .line 41
    move v9, v8

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const v9, 0x402147ae    # 2.52f

    .line 44
    .line 45
    .line 46
    :goto_0
    div-float/2addr v6, v9

    .line 47
    cmpg-float v7, v8, v7

    .line 48
    .line 49
    if-gtz v7, :cond_3

    .line 50
    .line 51
    const/high16 v7, 0x41c80000    # 25.0f

    .line 52
    .line 53
    cmpl-float v8, v6, v7

    .line 54
    .line 55
    if-lez v8, :cond_3

    .line 56
    .line 57
    div-float/2addr v6, v7

    .line 58
    mul-float/2addr v9, v6

    .line 59
    move v6, v7

    .line 60
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-eqz v7, :cond_12

    .line 69
    .line 70
    if-nez v8, :cond_4

    .line 71
    .line 72
    goto/16 :goto_9

    .line 73
    .line 74
    :cond_4
    int-to-float v7, v7

    .line 75
    div-float/2addr v7, v9

    .line 76
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    const/4 v10, 0x1

    .line 81
    invoke-static {v10, v7}, Ljava/lang/Math;->max(II)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    int-to-float v8, v8

    .line 86
    div-float/2addr v8, v9

    .line 87
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    invoke-static {v10, v8}, Ljava/lang/Math;->max(II)I

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    iget-boolean v9, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᛷᛲᲁ:Z

    .line 96
    .line 97
    iget-object v11, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 98
    .line 99
    if-eqz v11, :cond_5

    .line 100
    .line 101
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-ne v11, v7, :cond_5

    .line 106
    .line 107
    iget-object v11, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 108
    .line 109
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    if-eq v11, v8, :cond_8

    .line 114
    .line 115
    :cond_5
    iget-object v9, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    if-eqz v9, :cond_6

    .line 119
    .line 120
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->recycle()V

    .line 121
    .line 122
    .line 123
    iput-object v11, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 124
    .line 125
    :cond_6
    iget-object v9, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 126
    .line 127
    if-eqz v9, :cond_7

    .line 128
    .line 129
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->recycle()V

    .line 130
    .line 131
    .line 132
    iput-object v11, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 133
    .line 134
    :cond_7
    iput-object v11, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 135
    .line 136
    :try_start_0
    sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 137
    .line 138
    invoke-static {v7, v8, v9}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    iput-object v11, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 143
    .line 144
    new-instance v11, Landroid/graphics/Canvas;

    .line 145
    .line 146
    iget-object v12, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 147
    .line 148
    invoke-direct {v11, v12}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 149
    .line 150
    .line 151
    iput-object v11, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 152
    .line 153
    invoke-static {v7, v8, v9}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    iput-object v7, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 158
    .line 159
    iget-object v7, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 160
    .line 161
    invoke-static {v7}, Lyyds/ᲀᛳᛳᛱ;->ᛲᛴᛳᛲ(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    iput-object v7, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 166
    .line 167
    iget-object v7, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 168
    .line 169
    invoke-static {v7}, Lyyds/ᲀᛳᛳᛱ;->ᛲᛴᛳᛲ(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    iput-object v7, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_7

    .line 174
    .line 175
    move v9, v10

    .line 176
    :cond_8
    if-eqz v9, :cond_9

    .line 177
    .line 178
    iget-object v7, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᲇᲇᛱ:Lcom/qmdeve/blurview/BlurNative;

    .line 179
    .line 180
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    const/high16 v8, 0x42c80000    # 100.0f

    .line 184
    .line 185
    invoke-static {v8, v6}, Ljava/lang/Math;->min(FF)F

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    const/high16 v8, 0x40000000    # 2.0f

    .line 190
    .line 191
    invoke-static {v8, v6}, Ljava/lang/Math;->max(FF)F

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    iput v6, v7, Lcom/qmdeve/blurview/BlurNative;->ᛵᛸᛸᛷ:F

    .line 196
    .line 197
    iput-boolean v5, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᛷᛲᲁ:Z

    .line 198
    .line 199
    :cond_9
    iget-object v6, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 200
    .line 201
    if-eq v6, v4, :cond_a

    .line 202
    .line 203
    move v4, v10

    .line 204
    goto :goto_1

    .line 205
    :cond_a
    move v4, v5

    .line 206
    :goto_1
    iget-boolean v6, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛶᛷᲀ:Z

    .line 207
    .line 208
    if-eqz v6, :cond_c

    .line 209
    .line 210
    invoke-virtual {p0}, Lyyds/ᲀᛱᛷᲀ;->ᲇᲇᲇᛱ()V

    .line 211
    .line 212
    .line 213
    if-nez v4, :cond_b

    .line 214
    .line 215
    iget-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛳᲁᲁᲇ:Z

    .line 216
    .line 217
    if-nez v0, :cond_b

    .line 218
    .line 219
    iget-boolean p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 220
    .line 221
    if-eqz p0, :cond_12

    .line 222
    .line 223
    :cond_b
    return v10

    .line 224
    :cond_c
    const/4 v6, 0x2

    .line 225
    new-array v7, v6, [I

    .line 226
    .line 227
    new-array v6, v6, [I

    .line 228
    .line 229
    iget-object v8, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 230
    .line 231
    invoke-virtual {v8, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 235
    .line 236
    .line 237
    aget v8, v6, v5

    .line 238
    .line 239
    aget v9, v7, v5

    .line 240
    .line 241
    sub-int/2addr v8, v9

    .line 242
    aget v6, v6, v10

    .line 243
    .line 244
    aget v7, v7, v10

    .line 245
    .line 246
    sub-int/2addr v6, v7

    .line 247
    iget-object v7, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 248
    .line 249
    invoke-virtual {v7, v5}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 250
    .line 251
    .line 252
    iget-object v7, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 253
    .line 254
    invoke-virtual {v7}, Landroid/graphics/Canvas;->save()I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    iput-boolean v10, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᛱᛲ:Z

    .line 259
    .line 260
    sput-boolean v10, Lyyds/ᲀᛳᛳᛱ;->ᛲᛳᛶᲁ:Z

    .line 261
    .line 262
    :try_start_1
    iget-object v9, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 263
    .line 264
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    int-to-float v9, v9

    .line 269
    const/high16 v11, 0x3f800000    # 1.0f

    .line 270
    .line 271
    mul-float/2addr v9, v11

    .line 272
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 273
    .line 274
    .line 275
    move-result v12

    .line 276
    int-to-float v12, v12

    .line 277
    div-float/2addr v9, v12

    .line 278
    iget-object v12, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 279
    .line 280
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    .line 281
    .line 282
    .line 283
    move-result v12

    .line 284
    int-to-float v12, v12

    .line 285
    mul-float/2addr v12, v11

    .line 286
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    int-to-float v11, v11

    .line 291
    div-float/2addr v12, v11

    .line 292
    iget-object v11, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 293
    .line 294
    invoke-virtual {v11, v9, v12}, Landroid/graphics/Canvas;->scale(FF)V

    .line 295
    .line 296
    .line 297
    iget-object v11, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 298
    .line 299
    neg-int v8, v8

    .line 300
    int-to-float v8, v8

    .line 301
    neg-int v6, v6

    .line 302
    int-to-float v6, v6

    .line 303
    invoke-virtual {v11, v8, v6}, Landroid/graphics/Canvas;->translate(FF)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 304
    .line 305
    .line 306
    :try_start_2
    iget-object v11, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 307
    .line 308
    iget-object v13, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 309
    .line 310
    invoke-virtual {v11, v13}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 311
    .line 312
    .line 313
    goto/16 :goto_5

    .line 314
    .line 315
    :catchall_0
    move-exception v2

    .line 316
    goto/16 :goto_7

    .line 317
    .line 318
    :catch_0
    move-exception v2

    .line 319
    goto :goto_2

    .line 320
    :catch_1
    move-exception v3

    .line 321
    goto :goto_4

    .line 322
    :goto_2
    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 339
    .line 340
    .line 341
    iput-boolean v10, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛶᛷᲀ:Z

    .line 342
    .line 343
    invoke-virtual {p0}, Lyyds/ᲀᛱᛷᲀ;->ᲇᲇᲇᛱ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 344
    .line 345
    .line 346
    iput-boolean v5, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᛱᛲ:Z

    .line 347
    .line 348
    sput-boolean v5, Lyyds/ᲀᛳᛳᛱ;->ᛲᛳᛶᲁ:Z

    .line 349
    .line 350
    :try_start_4
    iget-object p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 351
    .line 352
    if-eqz p0, :cond_12

    .line 353
    .line 354
    if-ltz v7, :cond_12

    .line 355
    .line 356
    invoke-virtual {p0, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 357
    .line 358
    .line 359
    goto/16 :goto_9

    .line 360
    .line 361
    :catch_2
    move-exception p0

    .line 362
    new-instance v2, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 379
    .line 380
    .line 381
    goto/16 :goto_9

    .line 382
    .line 383
    :goto_4
    :try_start_5
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v11

    .line 387
    if-eqz v11, :cond_10

    .line 388
    .line 389
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v11

    .line 393
    const-string v13, "Software rendering doesn\'t support hardware bitmaps"

    .line 394
    .line 395
    invoke-virtual {v11, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 396
    .line 397
    .line 398
    move-result v11

    .line 399
    if-eqz v11, :cond_10

    .line 400
    .line 401
    const-string v3, "Hardware bitmap detected during draw, converting and retrying"

    .line 402
    .line 403
    invoke-static {v1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 404
    .line 405
    .line 406
    iget-object v3, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 407
    .line 408
    invoke-static {v3}, Lyyds/ᲀᛳᛳᛱ;->ᲇᲈᛵᛷ(Landroid/view/View;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 409
    .line 410
    .line 411
    :try_start_6
    iget-object v3, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 412
    .line 413
    invoke-virtual {v3, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 414
    .line 415
    .line 416
    iget-object v3, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 417
    .line 418
    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    .line 419
    .line 420
    .line 421
    move-result v7

    .line 422
    iget-object v3, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 423
    .line 424
    invoke-virtual {v3, v9, v12}, Landroid/graphics/Canvas;->scale(FF)V

    .line 425
    .line 426
    .line 427
    iget-object v3, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 428
    .line 429
    invoke-virtual {v3, v8, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 430
    .line 431
    .line 432
    iget-object v3, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 433
    .line 434
    iget-object v6, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 435
    .line 436
    invoke-virtual {v3, v6}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 437
    .line 438
    .line 439
    :goto_5
    :try_start_7
    iget-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 440
    .line 441
    iget-object v3, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 442
    .line 443
    invoke-virtual {p0, v2, v3}, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛳᲀ(Landroid/view/View;Landroid/graphics/Canvas;)V

    .line 444
    .line 445
    .line 446
    iget-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 447
    .line 448
    iget-object v3, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 449
    .line 450
    invoke-virtual {p0, v2, v3}, Lyyds/ᲀᛱᛷᲀ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/graphics/Canvas;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 451
    .line 452
    .line 453
    iput-boolean v5, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᛱᛲ:Z

    .line 454
    .line 455
    sput-boolean v5, Lyyds/ᲀᛳᛳᛱ;->ᛲᛳᛶᲁ:Z

    .line 456
    .line 457
    :try_start_8
    iget-object v2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 458
    .line 459
    if-eqz v2, :cond_d

    .line 460
    .line 461
    if-ltz v7, :cond_d

    .line 462
    .line 463
    invoke-virtual {v2, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    .line 464
    .line 465
    .line 466
    goto :goto_6

    .line 467
    :catch_3
    move-exception v2

    .line 468
    new-instance v3, Ljava/lang/StringBuilder;

    .line 469
    .line 470
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 485
    .line 486
    .line 487
    :cond_d
    :goto_6
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 488
    .line 489
    iget-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 490
    .line 491
    invoke-virtual {p0, v0, v1}, Lyyds/ᲀᛱᛷᲀ;->ᛲᲈᲁ(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 492
    .line 493
    .line 494
    if-nez v4, :cond_e

    .line 495
    .line 496
    iget-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛳᲁᲁᲇ:Z

    .line 497
    .line 498
    if-nez v0, :cond_e

    .line 499
    .line 500
    iget-boolean p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 501
    .line 502
    if-eqz p0, :cond_f

    .line 503
    .line 504
    :cond_e
    move v5, v10

    .line 505
    :cond_f
    return v5

    .line 506
    :catch_4
    move-exception v3

    .line 507
    :try_start_9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    const-string v2, ". Switching to PixelCopy fallback."

    .line 520
    .line 521
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 529
    .line 530
    .line 531
    iput-boolean v10, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛶᛷᲀ:Z

    .line 532
    .line 533
    invoke-virtual {p0}, Lyyds/ᲀᛱᛷᲀ;->ᲇᲇᲇᛱ()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 534
    .line 535
    .line 536
    iput-boolean v5, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᛱᛲ:Z

    .line 537
    .line 538
    sput-boolean v5, Lyyds/ᲀᛳᛳᛱ;->ᛲᛳᛶᲁ:Z

    .line 539
    .line 540
    :try_start_a
    iget-object p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 541
    .line 542
    if-eqz p0, :cond_12

    .line 543
    .line 544
    if-ltz v7, :cond_12

    .line 545
    .line 546
    invoke-virtual {p0, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    .line 547
    .line 548
    .line 549
    goto :goto_9

    .line 550
    :catch_5
    move-exception p0

    .line 551
    new-instance v2, Ljava/lang/StringBuilder;

    .line 552
    .line 553
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    goto/16 :goto_3

    .line 557
    .line 558
    :cond_10
    :try_start_b
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 559
    :goto_7
    iput-boolean v5, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᛱᛲ:Z

    .line 560
    .line 561
    sput-boolean v5, Lyyds/ᲀᛳᛳᛱ;->ᛲᛳᛶᲁ:Z

    .line 562
    .line 563
    :try_start_c
    iget-object p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 564
    .line 565
    if-eqz p0, :cond_11

    .line 566
    .line 567
    if-ltz v7, :cond_11

    .line 568
    .line 569
    invoke-virtual {p0, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    .line 570
    .line 571
    .line 572
    goto :goto_8

    .line 573
    :catch_6
    move-exception p0

    .line 574
    new-instance v3, Ljava/lang/StringBuilder;

    .line 575
    .line 576
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object p0

    .line 583
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object p0

    .line 590
    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 591
    .line 592
    .line 593
    :cond_11
    :goto_8
    throw v2

    .line 594
    :catch_7
    invoke-virtual {p0}, Lyyds/ᲀᛱᛷᲀ;->ᛶᛷᛲᲁ()V

    .line 595
    .line 596
    .line 597
    :cond_12
    :goto_9
    return v5
.end method

.method public final ᛲᲈᲁ(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᲇᲇᛱ:Lcom/qmdeve/blurview/BlurNative;

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Lyyds/ᲀᛳᛳᛱ;->ᛲᛴᛳᛲ(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0, p2}, Lcom/qmdeve/blurview/BlurNative;->ᛲᲈᲁ(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "Software rendering doesn\'t support hardware bitmaps"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    const-string v1, "BaseBlurView"

    .line 31
    .line 32
    const-string v2, "Hardware bitmap error detected, converting and retrying"

    .line 33
    .line 34
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    if-eqz p2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, Lcom/qmdeve/blurview/BlurNative;->ᛲᲈᲁ(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    const-string p0, "Failed to convert hardware bitmaps for blur processing"

    .line 57
    .line 58
    invoke-static {p0, v0}, Lyyds/ᛷᲈᲈᛶ;->ᛷᲈᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    throw v0
.end method

.method public final ᛵᛸᛸᛷ(Landroid/view/View;Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    instance-of v0, p1, Landroid/view/SurfaceView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    check-cast p1, Landroid/view/SurfaceView;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_6

    .line 13
    .line 14
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᲀᛵᛸ:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const-string v3, "BaseBlurView"

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p1, v4}, Landroid/view/SurfaceView;->setZOrderMediaOverlay(Z)V

    .line 26
    .line 27
    .line 28
    const-string v2, "Automatically configured SurfaceView with setZOrderMediaOverlay(true) for proper blur rendering"

    .line 29
    .line 30
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception v0

    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v5, "Failed to auto-configure SurfaceView: "

    .line 41
    .line 42
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛴᲁᲈ:Z

    .line 60
    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    const-string v0, "SurfaceView detected and automatically configured for blur. Note: There may be a slight lag (1-2 frames) due to asynchronous PixelCopy."

    .line 64
    .line 65
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    iput-boolean v4, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛴᲁᲈ:Z

    .line 69
    .line 70
    :cond_1
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛶᛱᲈ:Ljava/util/WeakHashMap;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Landroid/graphics/Bitmap;

    .line 77
    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_2

    .line 85
    .line 86
    const/4 v2, 0x2

    .line 87
    new-array v5, v2, [I

    .line 88
    .line 89
    iget-object v6, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 90
    .line 91
    invoke-virtual {v6, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 92
    .line 93
    .line 94
    new-array v2, v2, [I

    .line 95
    .line 96
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 97
    .line 98
    .line 99
    aget v6, v2, v1

    .line 100
    .line 101
    aget v1, v5, v1

    .line 102
    .line 103
    sub-int/2addr v6, v1

    .line 104
    aget v1, v2, v4

    .line 105
    .line 106
    aget v2, v5, v4

    .line 107
    .line 108
    sub-int/2addr v1, v2

    .line 109
    invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I

    .line 110
    .line 111
    .line 112
    int-to-float v2, v6

    .line 113
    int-to-float v1, v1

    .line 114
    invoke-virtual {p2, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 115
    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    const/4 v2, 0x0

    .line 119
    invoke-virtual {p2, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2}, Landroid/graphics/Canvas;->restore()V

    .line 123
    .line 124
    .line 125
    :cond_2
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 126
    .line 127
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲈᲀᛲᲀ:Ljava/util/WeakHashMap;

    .line 128
    .line 129
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {p2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_6

    .line 138
    .line 139
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-lez v1, :cond_6

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-lez v1, :cond_6

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-eqz v1, :cond_4

    .line 160
    .line 161
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v1}, Landroid/view/Surface;->isValid()Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_4

    .line 174
    .line 175
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 184
    .line 185
    invoke-static {v1, v2, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    :try_start_1
    iget-object p2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᛶᛳ:Landroid/os/Handler;

    .line 193
    .line 194
    if-eqz p2, :cond_3

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_3
    iget-object p2, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛴᛸ:Landroid/os/Handler;

    .line 198
    .line 199
    :goto_1
    new-instance v2, Lyyds/ᲈᲇᛷᛷ;

    .line 200
    .line 201
    invoke-direct {v2, p0, p1, v1}, Lyyds/ᲈᲇᛷᛷ;-><init>(Lyyds/ᲀᛱᛷᲀ;Landroid/view/SurfaceView;Landroid/graphics/Bitmap;)V

    .line 202
    .line 203
    .line 204
    invoke-static {p1, v1, v2, p2}, Landroid/view/PixelCopy;->request(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :catch_1
    move-exception p0

    .line 209
    new-instance p2, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    const-string v2, "PixelCopy request failed: "

    .line 212
    .line 213
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string p0, ". Make sure surfaceView.setZOrderMediaOverlay(true) is called."

    .line 224
    .line 225
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-static {v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 236
    .line 237
    invoke-virtual {v0, p1, p0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_4
    const-wide/16 p1, 0x64

    .line 245
    .line 246
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->postInvalidateDelayed(J)V

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_5
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 251
    .line 252
    if-eqz v0, :cond_6

    .line 253
    .line 254
    check-cast p1, Landroid/view/ViewGroup;

    .line 255
    .line 256
    :goto_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-ge v1, v0, :cond_6

    .line 261
    .line 262
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {p0, v0, p2}, Lyyds/ᲀᛱᛷᲀ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/graphics/Canvas;)V

    .line 267
    .line 268
    .line 269
    add-int/lit8 v1, v1, 0x1

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_6
    :goto_3
    return-void
.end method

.method public final ᛶᛷᛲᲁ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛶᲁ:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    :cond_1
    iput-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲈᲈᲁ:Landroid/graphics/Canvas;

    .line 21
    .line 22
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲇᲇᲇᛱ:Lcom/qmdeve/blurview/BlurNative;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛸᲇᛶ:Landroid/os/HandlerThread;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᛸᲇᛶ:Landroid/os/HandlerThread;

    .line 35
    .line 36
    iput-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᛶᛳ:Landroid/os/Handler;

    .line 37
    .line 38
    :cond_2
    return-void
.end method

.method public final ᲀᛲᛳᲀ(Landroid/view/View;Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    instance-of v0, p1, Landroid/view/TextureView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p1, Landroid/view/TextureView;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/TextureView;->isAvailable()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    new-array v2, v0, [I

    .line 22
    .line 23
    iget-object p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᲇ:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 26
    .line 27
    .line 28
    new-array p0, v0, [I

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 31
    .line 32
    .line 33
    aget v0, p0, v1

    .line 34
    .line 35
    aget v3, v2, v1

    .line 36
    .line 37
    sub-int/2addr v0, v3

    .line 38
    const/4 v3, 0x1

    .line 39
    aget p0, p0, v3

    .line 40
    .line 41
    aget v2, v2, v3

    .line 42
    .line 43
    sub-int/2addr p0, v2

    .line 44
    invoke-virtual {p1}, Landroid/view/TextureView;->getBitmap()Landroid/graphics/Bitmap;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v3, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 55
    .line 56
    if-ne v2, v3, :cond_0

    .line 57
    .line 58
    const-string v2, "Converting hardware bitmap to software bitmap for blur processing"

    .line 59
    .line 60
    const-string v3, "BaseBlurView"

    .line 61
    .line 62
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    :try_start_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 66
    .line 67
    invoke-virtual {p1, v2, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 68
    .line 69
    .line 70
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    goto :goto_0

    .line 72
    :catch_0
    move-exception v1

    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v4, "Failed to convert hardware bitmap: "

    .line 76
    .line 77
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    :cond_0
    :goto_0
    invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I

    .line 95
    .line 96
    .line 97
    int-to-float v0, v0

    .line 98
    int-to-float p0, p0

    .line 99
    invoke-virtual {p2, v0, p0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 100
    .line 101
    .line 102
    const/4 p0, 0x0

    .line 103
    const/4 v0, 0x0

    .line 104
    invoke-virtual {p2, p1, v0, v0, p0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Landroid/graphics/Canvas;->restore()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 115
    .line 116
    if-eqz v0, :cond_2

    .line 117
    .line 118
    check-cast p1, Landroid/view/ViewGroup;

    .line 119
    .line 120
    :goto_1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-ge v1, v0, :cond_2

    .line 125
    .line 126
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {p0, v0, p2}, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛳᲀ(Landroid/view/View;Landroid/graphics/Canvas;)V

    .line 131
    .line 132
    .line 133
    add-int/lit8 v1, v1, 0x1

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    :goto_2
    return-void
.end method

.method public final ᲇᲇᲇᛱ()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲇᛲᛱ:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-direct {p0}, Lyyds/ᲀᛱᛷᲀ;->getActivityWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/4 v1, 0x2

    .line 13
    new-array v1, v1, [I

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Landroid/graphics/Rect;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aget v4, v1, v3

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    aget v6, v1, v5

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    add-int/2addr v7, v4

    .line 31
    aget v1, v1, v5

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    add-int/2addr v8, v1

    .line 38
    invoke-direct {v2, v4, v6, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 39
    .line 40
    .line 41
    iput-boolean v5, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲇᛲᛱ:Z

    .line 42
    .line 43
    :try_start_0
    iget-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᛳᛶᛳ:Landroid/os/Handler;

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v1, p0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛳᛴᛸ:Landroid/os/Handler;

    .line 49
    .line 50
    :goto_0
    iget-object v4, p0, Lyyds/ᲀᛱᛷᲀ;->ᛱᲈᲁ:Landroid/graphics/Bitmap;

    .line 51
    .line 52
    new-instance v5, Lyyds/ᲀᛸᲁᛱ;

    .line 53
    .line 54
    invoke-direct {v5, p0}, Lyyds/ᲀᛸᲁᛱ;-><init>(Lyyds/ᲀᛱᛷᲀ;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v2, v4, v5, v1}, Landroid/view/PixelCopy;->request(Landroid/view/Window;Landroid/graphics/Rect;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catch_0
    move-exception v0

    .line 62
    iput-boolean v3, p0, Lyyds/ᲀᛱᛷᲀ;->ᛷᲇᛲᛱ:Z

    .line 63
    .line 64
    new-instance p0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v1, "PixelCopy fallback exception: "

    .line 67
    .line 68
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const-string v0, "BaseBlurView"

    .line 83
    .line 84
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    :cond_2
    :goto_1
    return-void
.end method

.method public final ᲇᲈᛵᛷ()Z
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛵᛶᛲᲀ:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpl-float v0, v0, v1

    .line 5
    .line 6
    if-gtz v0, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛲᲇ:F

    .line 9
    .line 10
    cmpl-float v0, v0, v1

    .line 11
    .line 12
    if-gtz v0, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛳᛸᛴᛶ:F

    .line 15
    .line 16
    cmpl-float v0, v0, v1

    .line 17
    .line 18
    if-gtz v0, :cond_1

    .line 19
    .line 20
    iget p0, p0, Lyyds/ᲀᛱᛷᲀ;->ᛶᲈᛴᲈ:F

    .line 21
    .line 22
    cmpl-float p0, p0, v1

    .line 23
    .line 24
    if-lez p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 30
    return p0
.end method
