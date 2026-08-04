.class public final Lyyds/ᛳᛳᛴᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᲇ:Landroid/graphics/drawable/GradientDrawable;

.field public ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

.field public ᛲᛲᲈᲈ:Landroid/graphics/drawable/GradientDrawable;

.field public ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

.field public ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Lyyds/ᲈᛶᛲᲁ;

.field public ᛳᲁᲁᲇ:Landroid/graphics/drawable/GradientDrawable;

.field public ᛵᛸᛸᛷ:I

.field public ᛶᛷᛲᲁ:I

.field public ᛷᛲᲈᛱ:Landroid/content/res/ColorStateList;

.field public final ᛷᛵᲇᲀ:Landroid/graphics/Paint;

.field public ᛷᲈᲈᲁ:Landroid/content/res/ColorStateList;

.field public ᲀᛲᛳᲀ:I

.field public ᲇᛱᛲ:Z

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Lyyds/ᲈᛶᛲᲁ;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛷᛵᲇᲀ:Landroid/graphics/Paint;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Rect;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v0, Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᲇᛱᛲ:Z

    .line 24
    .line 25
    iput-object p1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᲈᲁ:Lyyds/ᲈᛶᛲᲁ;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Lyyds/ᛲᲀᛸ;
    .locals 12

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/GradientDrawable;

    .line 7
    .line 8
    iget v1, p0, Lyyds/ᛳᛳᛴᛳ;->ᲇᲇᲇᛱ:I

    .line 9
    .line 10
    int-to-float v1, v1

    .line 11
    const v2, 0x3727c5ac    # 1.0E-5f

    .line 12
    .line 13
    .line 14
    add-float/2addr v1, v2

    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/GradientDrawable;

    .line 19
    .line 20
    const/4 v1, -0x1

    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lyyds/ᛳᛳᛴᛳ;->ᛵᛸᛸᛷ()V

    .line 25
    .line 26
    .line 27
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛱᛳᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 33
    .line 34
    iget v3, p0, Lyyds/ᛳᛳᛴᛳ;->ᲇᲇᲇᛱ:I

    .line 35
    .line 36
    int-to-float v3, v3

    .line 37
    add-float/2addr v3, v2

    .line 38
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛱᛳᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛱᛳᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 48
    .line 49
    iget v4, p0, Lyyds/ᛳᛳᛴᛳ;->ᛶᛷᛲᲁ:I

    .line 50
    .line 51
    iget-object v5, p0, Lyyds/ᛳᛳᛴᛳ;->ᛷᲈᲈᲁ:Landroid/content/res/ColorStateList;

    .line 52
    .line 53
    invoke-virtual {v0, v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(ILandroid/content/res/ColorStateList;)V

    .line 54
    .line 55
    .line 56
    new-instance v7, Landroid/graphics/drawable/LayerDrawable;

    .line 57
    .line 58
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/GradientDrawable;

    .line 59
    .line 60
    iget-object v4, p0, Lyyds/ᛳᛳᛴᛳ;->ᛱᛳᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 61
    .line 62
    const/4 v5, 0x2

    .line 63
    new-array v6, v5, [Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    aput-object v0, v6, v3

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    aput-object v4, v6, v0

    .line 69
    .line 70
    invoke-direct {v7, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 71
    .line 72
    .line 73
    new-instance v6, Landroid/graphics/drawable/InsetDrawable;

    .line 74
    .line 75
    iget v8, p0, Lyyds/ᛳᛳᛴᛳ;->ᛵᛸᛸᛷ:I

    .line 76
    .line 77
    iget v9, p0, Lyyds/ᛳᛳᛴᛳ;->ᲇᲈᛵᛷ:I

    .line 78
    .line 79
    iget v10, p0, Lyyds/ᛳᛳᛴᛳ;->ᲀᛲᛳᲀ:I

    .line 80
    .line 81
    iget v11, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᛴᛳᛲ:I

    .line 82
    .line 83
    invoke-direct/range {v6 .. v11}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 87
    .line 88
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛳᲁᲁᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 92
    .line 93
    iget v4, p0, Lyyds/ᛳᛳᛴᛳ;->ᲇᲇᲇᛱ:I

    .line 94
    .line 95
    int-to-float v4, v4

    .line 96
    add-float/2addr v4, v2

    .line 97
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛳᲁᲁᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lyyds/ᛲᲀᛸ;

    .line 106
    .line 107
    iget-object v1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛷᛲᲈᛱ:Landroid/content/res/ColorStateList;

    .line 108
    .line 109
    sget-object v2, Lyyds/ᲁᲀᲈᛸ;->ᲇᲈᛵᛷ:[I

    .line 110
    .line 111
    sget-object v4, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛳᲀ:[I

    .line 112
    .line 113
    if-eqz v1, :cond_0

    .line 114
    .line 115
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    invoke-virtual {v1, v4, v7}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    goto :goto_0

    .line 124
    :cond_0
    move v4, v3

    .line 125
    :goto_0
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    mul-int/2addr v7, v5

    .line 130
    const/16 v8, 0xff

    .line 131
    .line 132
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    sget v9, Lyyds/ᲀᲈᛸᲇ;->ᛲᲈᲁ:I

    .line 137
    .line 138
    const/4 v9, 0x0

    .line 139
    const-string v10, "alpha must be between 0 and 255."

    .line 140
    .line 141
    if-ltz v7, :cond_3

    .line 142
    .line 143
    if-gt v7, v8, :cond_3

    .line 144
    .line 145
    const v11, 0xffffff

    .line 146
    .line 147
    .line 148
    and-int/2addr v4, v11

    .line 149
    shl-int/lit8 v7, v7, 0x18

    .line 150
    .line 151
    or-int/2addr v4, v7

    .line 152
    sget-object v7, Landroid/util/StateSet;->NOTHING:[I

    .line 153
    .line 154
    filled-new-array {v2, v7}, [[I

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    sget-object v7, Lyyds/ᲁᲀᲈᛸ;->ᛵᛸᛸᛷ:[I

    .line 159
    .line 160
    if-eqz v1, :cond_1

    .line 161
    .line 162
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    invoke-virtual {v1, v7, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    :cond_1
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    mul-int/2addr v1, v5

    .line 175
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-ltz v1, :cond_2

    .line 180
    .line 181
    if-gt v1, v8, :cond_2

    .line 182
    .line 183
    and-int/2addr v3, v11

    .line 184
    shl-int/lit8 v1, v1, 0x18

    .line 185
    .line 186
    or-int/2addr v1, v3

    .line 187
    filled-new-array {v4, v1}, [I

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    new-instance v3, Landroid/content/res/ColorStateList;

    .line 192
    .line 193
    invoke-direct {v3, v2, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 194
    .line 195
    .line 196
    iget-object p0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛳᲁᲁᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 197
    .line 198
    invoke-direct {v0, v3, v6, p0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 199
    .line 200
    .line 201
    return-object v0

    .line 202
    :cond_2
    invoke-static {v10}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    return-object v9

    .line 206
    :cond_3
    invoke-static {v10}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-object v9
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/GradientDrawable;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
