.class public final Ld5;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Ly60;

.field public c:Ly60;

.field public d:Ly60;

.field public e:Ly60;

.field public f:Ly60;

.field public g:Ly60;

.field public h:Ly60;

.field public final i:Ln5;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ld5;->j:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Ld5;->k:I

    .line 9
    .line 10
    iput-object p1, p0, Ld5;->a:Landroid/widget/TextView;

    .line 11
    .line 12
    new-instance v0, Ln5;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Ln5;-><init>(Landroid/widget/TextView;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ld5;->i:Ln5;

    .line 18
    .line 19
    return-void
.end method

.method public static c(Landroid/content/Context;Lu3;I)Ly60;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lu3;->a:Lw00;

    .line 3
    .line 4
    invoke-virtual {v0, p0, p2}, Lw00;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, Ly60;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, Ly60;->d:Z

    .line 18
    .line 19
    iput-object p0, p1, Ly60;->a:Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method

.method public static h(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V
    .locals 10

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-ge v0, v1, :cond_d

    .line 6
    .line 7
    if-eqz p1, :cond_d

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p1}, Lwh;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    if-lt v0, v1, :cond_1

    .line 23
    .line 24
    invoke-static {p0, p1}, Lwh;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget p2, p0, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 29
    .line 30
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 31
    .line 32
    if-le p2, v0, :cond_2

    .line 33
    .line 34
    move v1, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move v1, p2

    .line 37
    :goto_0
    if-le p2, v0, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    move p2, v0

    .line 41
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    if-ltz v1, :cond_c

    .line 48
    .line 49
    if-le p2, v0, :cond_4

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_4
    iget v4, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 54
    .line 55
    and-int/lit16 v4, v4, 0xfff

    .line 56
    .line 57
    const/16 v5, 0x81

    .line 58
    .line 59
    if-eq v4, v5, :cond_b

    .line 60
    .line 61
    const/16 v5, 0xe1

    .line 62
    .line 63
    if-eq v4, v5, :cond_b

    .line 64
    .line 65
    const/16 v5, 0x12

    .line 66
    .line 67
    if-ne v4, v5, :cond_5

    .line 68
    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :cond_5
    const/16 v3, 0x800

    .line 72
    .line 73
    if-gt v0, v3, :cond_6

    .line 74
    .line 75
    invoke-static {p0, p1, v1, p2}, Lff;->N(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_6
    sub-int v0, p2, v1

    .line 80
    .line 81
    const/16 v3, 0x400

    .line 82
    .line 83
    if-le v0, v3, :cond_7

    .line 84
    .line 85
    move v3, v2

    .line 86
    goto :goto_2

    .line 87
    :cond_7
    move v3, v0

    .line 88
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    sub-int/2addr v4, p2

    .line 93
    rsub-int v5, v3, 0x800

    .line 94
    .line 95
    const-wide v6, 0x3fe999999999999aL    # 0.8

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    int-to-double v8, v5

    .line 101
    mul-double/2addr v8, v6

    .line 102
    double-to-int v6, v8

    .line 103
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    sub-int v6, v5, v6

    .line 108
    .line 109
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    sub-int/2addr v5, v4

    .line 114
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    sub-int/2addr v1, v5

    .line 119
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-static {v6}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_8

    .line 128
    .line 129
    add-int/lit8 v1, v1, 0x1

    .line 130
    .line 131
    add-int/lit8 v5, v5, -0x1

    .line 132
    .line 133
    :cond_8
    add-int v6, p2, v4

    .line 134
    .line 135
    const/4 v7, 0x1

    .line 136
    sub-int/2addr v6, v7

    .line 137
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-eqz v6, :cond_9

    .line 146
    .line 147
    add-int/lit8 v4, v4, -0x1

    .line 148
    .line 149
    :cond_9
    add-int v6, v5, v3

    .line 150
    .line 151
    add-int v8, v6, v4

    .line 152
    .line 153
    if-eq v3, v0, :cond_a

    .line 154
    .line 155
    add-int v0, v1, v5

    .line 156
    .line 157
    invoke-interface {p1, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    add-int/2addr v4, p2

    .line 162
    invoke-interface {p1, p2, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    const/4 p2, 0x2

    .line 167
    new-array p2, p2, [Ljava/lang/CharSequence;

    .line 168
    .line 169
    aput-object v0, p2, v2

    .line 170
    .line 171
    aput-object p1, p2, v7

    .line 172
    .line 173
    invoke-static {p2}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    goto :goto_3

    .line 178
    :cond_a
    add-int/2addr v8, v1

    .line 179
    invoke-interface {p1, v1, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    :goto_3
    invoke-static {p0, p1, v5, v6}, Lff;->N(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_b
    :goto_4
    invoke-static {p0, v3, v2, v2}, Lff;->N(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_c
    :goto_5
    invoke-static {p0, v3, v2, v2}, Lff;->N(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 192
    .line 193
    .line 194
    :cond_d
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;Ly60;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ld5;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1, p2, v0}, Lu3;->e(Landroid/graphics/drawable/Drawable;Ly60;[I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Ld5;->b:Ly60;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Ld5;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ld5;->c:Ly60;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ld5;->d:Ly60;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ld5;->e:Ly60;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aget-object v4, v0, v2

    .line 26
    .line 27
    iget-object v5, p0, Ld5;->b:Ly60;

    .line 28
    .line 29
    invoke-virtual {p0, v4, v5}, Ld5;->a(Landroid/graphics/drawable/Drawable;Ly60;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aget-object v4, v0, v4

    .line 34
    .line 35
    iget-object v5, p0, Ld5;->c:Ly60;

    .line 36
    .line 37
    invoke-virtual {p0, v4, v5}, Ld5;->a(Landroid/graphics/drawable/Drawable;Ly60;)V

    .line 38
    .line 39
    .line 40
    aget-object v4, v0, v1

    .line 41
    .line 42
    iget-object v5, p0, Ld5;->d:Ly60;

    .line 43
    .line 44
    invoke-virtual {p0, v4, v5}, Ld5;->a(Landroid/graphics/drawable/Drawable;Ly60;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    aget-object v0, v0, v4

    .line 49
    .line 50
    iget-object v4, p0, Ld5;->e:Ly60;

    .line 51
    .line 52
    invoke-virtual {p0, v0, v4}, Ld5;->a(Landroid/graphics/drawable/Drawable;Ly60;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Ld5;->f:Ly60;

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Ld5;->g:Ly60;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    return-void

    .line 65
    :cond_3
    :goto_0
    invoke-static {v3}, Lz4;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    aget-object v2, v0, v2

    .line 70
    .line 71
    iget-object v3, p0, Ld5;->f:Ly60;

    .line 72
    .line 73
    invoke-virtual {p0, v2, v3}, Ld5;->a(Landroid/graphics/drawable/Drawable;Ly60;)V

    .line 74
    .line 75
    .line 76
    aget-object v0, v0, v1

    .line 77
    .line 78
    iget-object v1, p0, Ld5;->g:Ly60;

    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, Ld5;->a(Landroid/graphics/drawable/Drawable;Ly60;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final d()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ld5;->h:Ly60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Ly60;->a:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method

.method public final e()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Ld5;->h:Ly60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Ly60;->b:Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method

.method public final f(Landroid/util/AttributeSet;I)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move/from16 v6, p2

    .line 6
    .line 7
    iget-object v1, v0, Ld5;->a:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v7

    .line 13
    invoke-static {}, Lu3;->a()Lu3;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    sget-object v3, Lxy;->h:[I

    .line 18
    .line 19
    invoke-static {v7, v4, v3, v6}, Lr5;->y(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lr5;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v5, v9, Lr5;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, Landroid/content/res/TypedArray;

    .line 30
    .line 31
    invoke-static/range {v1 .. v6}, Lja0;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 32
    .line 33
    .line 34
    move-object v10, v1

    .line 35
    iget-object v1, v9, Lr5;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Landroid/content/res/TypedArray;

    .line 38
    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, -0x1

    .line 41
    invoke-virtual {v1, v11, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v13, 0x3

    .line 46
    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1, v13, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-static {v7, v8, v3}, Ld5;->c(Landroid/content/Context;Lu3;I)Ly60;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iput-object v3, v0, Ld5;->b:Ly60;

    .line 61
    .line 62
    :cond_0
    const/4 v14, 0x1

    .line 63
    invoke-virtual {v1, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v1, v14, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v7, v8, v3}, Ld5;->c(Landroid/content/Context;Lu3;I)Ly60;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iput-object v3, v0, Ld5;->c:Ly60;

    .line 78
    .line 79
    :cond_1
    const/4 v15, 0x4

    .line 80
    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    invoke-virtual {v1, v15, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-static {v7, v8, v3}, Ld5;->c(Landroid/content/Context;Lu3;I)Ly60;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    iput-object v3, v0, Ld5;->d:Ly60;

    .line 95
    .line 96
    :cond_2
    const/4 v3, 0x2

    .line 97
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_3

    .line 102
    .line 103
    invoke-virtual {v1, v3, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    invoke-static {v7, v8, v5}, Ld5;->c(Landroid/content/Context;Lu3;I)Ly60;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    iput-object v5, v0, Ld5;->e:Ly60;

    .line 112
    .line 113
    :cond_3
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 114
    .line 115
    const/4 v13, 0x5

    .line 116
    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 117
    .line 118
    .line 119
    move-result v17

    .line 120
    if-eqz v17, :cond_4

    .line 121
    .line 122
    invoke-virtual {v1, v13, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-static {v7, v8, v3}, Ld5;->c(Landroid/content/Context;Lu3;I)Ly60;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iput-object v3, v0, Ld5;->f:Ly60;

    .line 131
    .line 132
    :cond_4
    const/4 v3, 0x6

    .line 133
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 134
    .line 135
    .line 136
    move-result v18

    .line 137
    if-eqz v18, :cond_5

    .line 138
    .line 139
    invoke-virtual {v1, v3, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-static {v7, v8, v1}, Ld5;->c(Landroid/content/Context;Lu3;I)Ly60;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iput-object v1, v0, Ld5;->g:Ly60;

    .line 148
    .line 149
    :cond_5
    invoke-virtual {v9}, Lr5;->z()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v10}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    .line 157
    .line 158
    sget-object v9, Lxy;->w:[I

    .line 159
    .line 160
    const/16 v3, 0xe

    .line 161
    .line 162
    const/16 v14, 0xd

    .line 163
    .line 164
    const/16 v15, 0xf

    .line 165
    .line 166
    if-eq v2, v12, :cond_9

    .line 167
    .line 168
    new-instance v13, Lr5;

    .line 169
    .line 170
    invoke-virtual {v7, v2, v9}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-direct {v13, v7, v2}, Lr5;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 175
    .line 176
    .line 177
    if-nez v1, :cond_6

    .line 178
    .line 179
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 180
    .line 181
    .line 182
    move-result v22

    .line 183
    if-eqz v22, :cond_6

    .line 184
    .line 185
    invoke-virtual {v2, v3, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 186
    .line 187
    .line 188
    move-result v22

    .line 189
    move/from16 v23, v22

    .line 190
    .line 191
    const/16 v22, 0x1

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_6
    move/from16 v22, v11

    .line 195
    .line 196
    move/from16 v23, v22

    .line 197
    .line 198
    :goto_0
    invoke-virtual {v0, v7, v13}, Ld5;->n(Landroid/content/Context;Lr5;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 202
    .line 203
    .line 204
    move-result v24

    .line 205
    if-eqz v24, :cond_7

    .line 206
    .line 207
    invoke-virtual {v2, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v24

    .line 211
    goto :goto_1

    .line 212
    :cond_7
    const/16 v24, 0x0

    .line 213
    .line 214
    :goto_1
    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 215
    .line 216
    .line 217
    move-result v25

    .line 218
    if-eqz v25, :cond_8

    .line 219
    .line 220
    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    goto :goto_2

    .line 225
    :cond_8
    const/4 v2, 0x0

    .line 226
    :goto_2
    invoke-virtual {v13}, Lr5;->z()V

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_9
    move/from16 v22, v11

    .line 231
    .line 232
    move/from16 v23, v22

    .line 233
    .line 234
    const/4 v2, 0x0

    .line 235
    const/16 v24, 0x0

    .line 236
    .line 237
    :goto_3
    new-instance v13, Lr5;

    .line 238
    .line 239
    invoke-virtual {v7, v4, v9, v6, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    invoke-direct {v13, v7, v9}, Lr5;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 244
    .line 245
    .line 246
    if-nez v1, :cond_a

    .line 247
    .line 248
    invoke-virtual {v9, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 249
    .line 250
    .line 251
    move-result v25

    .line 252
    if-eqz v25, :cond_a

    .line 253
    .line 254
    invoke-virtual {v9, v3, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 255
    .line 256
    .line 257
    move-result v23

    .line 258
    const/16 v22, 0x1

    .line 259
    .line 260
    :cond_a
    move/from16 v3, v23

    .line 261
    .line 262
    invoke-virtual {v9, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 263
    .line 264
    .line 265
    move-result v23

    .line 266
    if-eqz v23, :cond_b

    .line 267
    .line 268
    invoke-virtual {v9, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v24

    .line 272
    :cond_b
    invoke-virtual {v9, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 273
    .line 274
    .line 275
    move-result v23

    .line 276
    if-eqz v23, :cond_c

    .line 277
    .line 278
    invoke-virtual {v9, v14}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    :cond_c
    const/16 v15, 0x1c

    .line 283
    .line 284
    if-lt v5, v15, :cond_d

    .line 285
    .line 286
    invoke-virtual {v9, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    if-eqz v5, :cond_d

    .line 291
    .line 292
    invoke-virtual {v9, v11, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    if-nez v5, :cond_d

    .line 297
    .line 298
    const/4 v5, 0x0

    .line 299
    invoke-virtual {v10, v11, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 300
    .line 301
    .line 302
    :cond_d
    invoke-virtual {v0, v7, v13}, Ld5;->n(Landroid/content/Context;Lr5;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v13}, Lr5;->z()V

    .line 306
    .line 307
    .line 308
    if-nez v1, :cond_e

    .line 309
    .line 310
    if-eqz v22, :cond_e

    .line 311
    .line 312
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 313
    .line 314
    .line 315
    :cond_e
    iget-object v1, v0, Ld5;->l:Landroid/graphics/Typeface;

    .line 316
    .line 317
    if-eqz v1, :cond_10

    .line 318
    .line 319
    iget v3, v0, Ld5;->k:I

    .line 320
    .line 321
    if-ne v3, v12, :cond_f

    .line 322
    .line 323
    iget v3, v0, Ld5;->j:I

    .line 324
    .line 325
    invoke-virtual {v10, v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 326
    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_f
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 330
    .line 331
    .line 332
    :cond_10
    :goto_4
    if-eqz v2, :cond_11

    .line 333
    .line 334
    invoke-static {v10, v2}, Lb5;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 335
    .line 336
    .line 337
    :cond_11
    if-eqz v24, :cond_12

    .line 338
    .line 339
    invoke-static/range {v24 .. v24}, La5;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-static {v10, v1}, La5;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    .line 344
    .line 345
    .line 346
    :cond_12
    iget-object v9, v0, Ld5;->i:Ln5;

    .line 347
    .line 348
    iget-object v13, v9, Ln5;->j:Landroid/content/Context;

    .line 349
    .line 350
    sget-object v3, Lxy;->i:[I

    .line 351
    .line 352
    invoke-virtual {v13, v4, v3, v6, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    iget-object v1, v9, Ln5;->i:Landroid/widget/TextView;

    .line 357
    .line 358
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    const/4 v15, 0x2

    .line 363
    invoke-static/range {v1 .. v6}, Lja0;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 364
    .line 365
    .line 366
    const/4 v1, 0x5

    .line 367
    invoke-virtual {v5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    if-eqz v2, :cond_13

    .line 372
    .line 373
    invoke-virtual {v5, v1, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    iput v1, v9, Ln5;->a:I

    .line 378
    .line 379
    :cond_13
    const/4 v1, 0x4

    .line 380
    invoke-virtual {v5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    const/high16 v6, -0x40800000    # -1.0f

    .line 385
    .line 386
    if-eqz v2, :cond_14

    .line 387
    .line 388
    invoke-virtual {v5, v1, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    goto :goto_5

    .line 393
    :cond_14
    move v1, v6

    .line 394
    :goto_5
    invoke-virtual {v5, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    if-eqz v2, :cond_15

    .line 399
    .line 400
    invoke-virtual {v5, v15, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    :goto_6
    const/4 v14, 0x1

    .line 405
    goto :goto_7

    .line 406
    :cond_15
    move v2, v6

    .line 407
    goto :goto_6

    .line 408
    :goto_7
    invoke-virtual {v5, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 409
    .line 410
    .line 411
    move-result v19

    .line 412
    if-eqz v19, :cond_16

    .line 413
    .line 414
    invoke-virtual {v5, v14, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 415
    .line 416
    .line 417
    move-result v20

    .line 418
    :goto_8
    const/4 v14, 0x3

    .line 419
    goto :goto_9

    .line 420
    :cond_16
    move/from16 v20, v6

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :goto_9
    invoke-virtual {v5, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 424
    .line 425
    .line 426
    move-result v16

    .line 427
    move/from16 p2, v6

    .line 428
    .line 429
    if-eqz v16, :cond_19

    .line 430
    .line 431
    invoke-virtual {v5, v14, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    if-lez v6, :cond_19

    .line 436
    .line 437
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 438
    .line 439
    .line 440
    move-result-object v14

    .line 441
    invoke-virtual {v14, v6}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 442
    .line 443
    .line 444
    move-result-object v6

    .line 445
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->length()I

    .line 446
    .line 447
    .line 448
    move-result v14

    .line 449
    new-array v11, v14, [I

    .line 450
    .line 451
    if-lez v14, :cond_18

    .line 452
    .line 453
    const/4 v15, 0x0

    .line 454
    :goto_a
    if-ge v15, v14, :cond_17

    .line 455
    .line 456
    invoke-virtual {v6, v15, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 457
    .line 458
    .line 459
    move-result v24

    .line 460
    aput v24, v11, v15

    .line 461
    .line 462
    add-int/lit8 v15, v15, 0x1

    .line 463
    .line 464
    goto :goto_a

    .line 465
    :cond_17
    invoke-static {v11}, Ln5;->b([I)[I

    .line 466
    .line 467
    .line 468
    move-result-object v11

    .line 469
    iput-object v11, v9, Ln5;->f:[I

    .line 470
    .line 471
    invoke-virtual {v9}, Ln5;->i()Z

    .line 472
    .line 473
    .line 474
    :cond_18
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 475
    .line 476
    .line 477
    :cond_19
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v9}, Ln5;->j()Z

    .line 481
    .line 482
    .line 483
    move-result v5

    .line 484
    const/high16 v6, 0x3f800000    # 1.0f

    .line 485
    .line 486
    if-eqz v5, :cond_1e

    .line 487
    .line 488
    iget v5, v9, Ln5;->a:I

    .line 489
    .line 490
    const/4 v14, 0x1

    .line 491
    if-ne v5, v14, :cond_1f

    .line 492
    .line 493
    iget-boolean v5, v9, Ln5;->g:Z

    .line 494
    .line 495
    if-nez v5, :cond_1d

    .line 496
    .line 497
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 498
    .line 499
    .line 500
    move-result-object v5

    .line 501
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    cmpl-float v11, v2, p2

    .line 506
    .line 507
    if-nez v11, :cond_1a

    .line 508
    .line 509
    const/high16 v2, 0x41400000    # 12.0f

    .line 510
    .line 511
    const/4 v15, 0x2

    .line 512
    invoke-static {v15, v2, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 513
    .line 514
    .line 515
    move-result v2

    .line 516
    goto :goto_b

    .line 517
    :cond_1a
    const/4 v15, 0x2

    .line 518
    :goto_b
    cmpl-float v11, v20, p2

    .line 519
    .line 520
    if-nez v11, :cond_1b

    .line 521
    .line 522
    const/high16 v11, 0x42e00000    # 112.0f

    .line 523
    .line 524
    invoke-static {v15, v11, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 525
    .line 526
    .line 527
    move-result v20

    .line 528
    :cond_1b
    move/from16 v5, v20

    .line 529
    .line 530
    cmpl-float v11, v1, p2

    .line 531
    .line 532
    if-nez v11, :cond_1c

    .line 533
    .line 534
    move v1, v6

    .line 535
    :cond_1c
    invoke-virtual {v9, v2, v5, v1}, Ln5;->k(FFF)V

    .line 536
    .line 537
    .line 538
    :cond_1d
    invoke-virtual {v9}, Ln5;->h()Z

    .line 539
    .line 540
    .line 541
    goto :goto_c

    .line 542
    :cond_1e
    const/4 v1, 0x0

    .line 543
    iput v1, v9, Ln5;->a:I

    .line 544
    .line 545
    :cond_1f
    :goto_c
    sget-boolean v1, Lcb0;->b:Z

    .line 546
    .line 547
    if-eqz v1, :cond_21

    .line 548
    .line 549
    iget v1, v9, Ln5;->a:I

    .line 550
    .line 551
    if-eqz v1, :cond_21

    .line 552
    .line 553
    iget-object v1, v9, Ln5;->f:[I

    .line 554
    .line 555
    array-length v2, v1

    .line 556
    if-lez v2, :cond_21

    .line 557
    .line 558
    invoke-static {v10}, Lb5;->a(Landroid/widget/TextView;)I

    .line 559
    .line 560
    .line 561
    move-result v2

    .line 562
    int-to-float v2, v2

    .line 563
    cmpl-float v2, v2, p2

    .line 564
    .line 565
    if-eqz v2, :cond_20

    .line 566
    .line 567
    iget v1, v9, Ln5;->d:F

    .line 568
    .line 569
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    iget v2, v9, Ln5;->e:F

    .line 574
    .line 575
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    iget v5, v9, Ln5;->c:F

    .line 580
    .line 581
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 582
    .line 583
    .line 584
    move-result v5

    .line 585
    const/4 v9, 0x0

    .line 586
    invoke-static {v10, v1, v2, v5, v9}, Lb5;->b(Landroid/widget/TextView;IIII)V

    .line 587
    .line 588
    .line 589
    goto :goto_d

    .line 590
    :cond_20
    const/4 v9, 0x0

    .line 591
    invoke-static {v10, v1, v9}, Lb5;->c(Landroid/widget/TextView;[II)V

    .line 592
    .line 593
    .line 594
    :cond_21
    :goto_d
    invoke-virtual {v7, v4, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    const/16 v2, 0x8

    .line 599
    .line 600
    invoke-virtual {v1, v2, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    if-eq v2, v12, :cond_22

    .line 605
    .line 606
    invoke-virtual {v8, v7, v2}, Lu3;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    :goto_e
    const/16 v3, 0xd

    .line 611
    .line 612
    goto :goto_f

    .line 613
    :cond_22
    const/4 v2, 0x0

    .line 614
    goto :goto_e

    .line 615
    :goto_f
    invoke-virtual {v1, v3, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    if-eq v3, v12, :cond_23

    .line 620
    .line 621
    invoke-virtual {v8, v7, v3}, Lu3;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    goto :goto_10

    .line 626
    :cond_23
    const/4 v3, 0x0

    .line 627
    :goto_10
    const/16 v4, 0x9

    .line 628
    .line 629
    invoke-virtual {v1, v4, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    if-eq v4, v12, :cond_24

    .line 634
    .line 635
    invoke-virtual {v8, v7, v4}, Lu3;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    :goto_11
    const/4 v5, 0x6

    .line 640
    goto :goto_12

    .line 641
    :cond_24
    const/4 v4, 0x0

    .line 642
    goto :goto_11

    .line 643
    :goto_12
    invoke-virtual {v1, v5, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 644
    .line 645
    .line 646
    move-result v5

    .line 647
    if-eq v5, v12, :cond_25

    .line 648
    .line 649
    invoke-virtual {v8, v7, v5}, Lu3;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 650
    .line 651
    .line 652
    move-result-object v5

    .line 653
    goto :goto_13

    .line 654
    :cond_25
    const/4 v5, 0x0

    .line 655
    :goto_13
    const/16 v9, 0xa

    .line 656
    .line 657
    invoke-virtual {v1, v9, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 658
    .line 659
    .line 660
    move-result v9

    .line 661
    if-eq v9, v12, :cond_26

    .line 662
    .line 663
    invoke-virtual {v8, v7, v9}, Lu3;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 664
    .line 665
    .line 666
    move-result-object v9

    .line 667
    goto :goto_14

    .line 668
    :cond_26
    const/4 v9, 0x0

    .line 669
    :goto_14
    const/4 v11, 0x7

    .line 670
    invoke-virtual {v1, v11, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 671
    .line 672
    .line 673
    move-result v11

    .line 674
    if-eq v11, v12, :cond_27

    .line 675
    .line 676
    invoke-virtual {v8, v7, v11}, Lu3;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 677
    .line 678
    .line 679
    move-result-object v8

    .line 680
    goto :goto_15

    .line 681
    :cond_27
    const/4 v8, 0x0

    .line 682
    :goto_15
    if-nez v9, :cond_32

    .line 683
    .line 684
    if-eqz v8, :cond_28

    .line 685
    .line 686
    goto :goto_1e

    .line 687
    :cond_28
    if-nez v2, :cond_29

    .line 688
    .line 689
    if-nez v3, :cond_29

    .line 690
    .line 691
    if-nez v4, :cond_29

    .line 692
    .line 693
    if-eqz v5, :cond_37

    .line 694
    .line 695
    :cond_29
    invoke-static {v10}, Lz4;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 696
    .line 697
    .line 698
    move-result-object v8

    .line 699
    const/16 v21, 0x0

    .line 700
    .line 701
    aget-object v9, v8, v21

    .line 702
    .line 703
    if-nez v9, :cond_2f

    .line 704
    .line 705
    const/16 v22, 0x2

    .line 706
    .line 707
    aget-object v11, v8, v22

    .line 708
    .line 709
    if-eqz v11, :cond_2a

    .line 710
    .line 711
    goto :goto_1a

    .line 712
    :cond_2a
    invoke-virtual {v10}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 713
    .line 714
    .line 715
    move-result-object v8

    .line 716
    if-eqz v2, :cond_2b

    .line 717
    .line 718
    goto :goto_16

    .line 719
    :cond_2b
    aget-object v2, v8, v21

    .line 720
    .line 721
    :goto_16
    if-eqz v3, :cond_2c

    .line 722
    .line 723
    goto :goto_17

    .line 724
    :cond_2c
    const/16 v19, 0x1

    .line 725
    .line 726
    aget-object v3, v8, v19

    .line 727
    .line 728
    :goto_17
    if-eqz v4, :cond_2d

    .line 729
    .line 730
    goto :goto_18

    .line 731
    :cond_2d
    const/16 v22, 0x2

    .line 732
    .line 733
    aget-object v4, v8, v22

    .line 734
    .line 735
    :goto_18
    if-eqz v5, :cond_2e

    .line 736
    .line 737
    goto :goto_19

    .line 738
    :cond_2e
    const/16 v16, 0x3

    .line 739
    .line 740
    aget-object v5, v8, v16

    .line 741
    .line 742
    :goto_19
    invoke-virtual {v10, v2, v3, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 743
    .line 744
    .line 745
    goto :goto_23

    .line 746
    :cond_2f
    :goto_1a
    if-eqz v3, :cond_30

    .line 747
    .line 748
    :goto_1b
    const/16 v22, 0x2

    .line 749
    .line 750
    goto :goto_1c

    .line 751
    :cond_30
    const/16 v19, 0x1

    .line 752
    .line 753
    aget-object v3, v8, v19

    .line 754
    .line 755
    goto :goto_1b

    .line 756
    :goto_1c
    aget-object v2, v8, v22

    .line 757
    .line 758
    if-eqz v5, :cond_31

    .line 759
    .line 760
    goto :goto_1d

    .line 761
    :cond_31
    const/16 v16, 0x3

    .line 762
    .line 763
    aget-object v5, v8, v16

    .line 764
    .line 765
    :goto_1d
    invoke-static {v10, v9, v3, v2, v5}, Lz4;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 766
    .line 767
    .line 768
    goto :goto_23

    .line 769
    :cond_32
    :goto_1e
    invoke-static {v10}, Lz4;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    if-eqz v9, :cond_33

    .line 774
    .line 775
    goto :goto_1f

    .line 776
    :cond_33
    const/16 v21, 0x0

    .line 777
    .line 778
    aget-object v9, v2, v21

    .line 779
    .line 780
    :goto_1f
    if-eqz v3, :cond_34

    .line 781
    .line 782
    goto :goto_20

    .line 783
    :cond_34
    const/16 v19, 0x1

    .line 784
    .line 785
    aget-object v3, v2, v19

    .line 786
    .line 787
    :goto_20
    if-eqz v8, :cond_35

    .line 788
    .line 789
    goto :goto_21

    .line 790
    :cond_35
    const/16 v22, 0x2

    .line 791
    .line 792
    aget-object v8, v2, v22

    .line 793
    .line 794
    :goto_21
    if-eqz v5, :cond_36

    .line 795
    .line 796
    goto :goto_22

    .line 797
    :cond_36
    const/16 v16, 0x3

    .line 798
    .line 799
    aget-object v5, v2, v16

    .line 800
    .line 801
    :goto_22
    invoke-static {v10, v9, v3, v8, v5}, Lz4;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 802
    .line 803
    .line 804
    :cond_37
    :goto_23
    const/16 v2, 0xb

    .line 805
    .line 806
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 807
    .line 808
    .line 809
    move-result v3

    .line 810
    if-eqz v3, :cond_39

    .line 811
    .line 812
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 813
    .line 814
    .line 815
    move-result v3

    .line 816
    if-eqz v3, :cond_38

    .line 817
    .line 818
    const/4 v9, 0x0

    .line 819
    invoke-virtual {v1, v2, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 820
    .line 821
    .line 822
    move-result v3

    .line 823
    if-eqz v3, :cond_38

    .line 824
    .line 825
    invoke-static {v7, v3}, Lip;->v(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    if-eqz v3, :cond_38

    .line 830
    .line 831
    goto :goto_24

    .line 832
    :cond_38
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 833
    .line 834
    .line 835
    move-result-object v3

    .line 836
    :goto_24
    invoke-static {v10, v3}, Ll60;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    .line 837
    .line 838
    .line 839
    :cond_39
    const/16 v2, 0xc

    .line 840
    .line 841
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 842
    .line 843
    .line 844
    move-result v3

    .line 845
    if-eqz v3, :cond_3a

    .line 846
    .line 847
    invoke-virtual {v1, v2, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 848
    .line 849
    .line 850
    move-result v2

    .line 851
    const/4 v3, 0x0

    .line 852
    invoke-static {v2, v3}, Leh;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 853
    .line 854
    .line 855
    move-result-object v2

    .line 856
    invoke-static {v10, v2}, Ll60;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    .line 857
    .line 858
    .line 859
    :cond_3a
    const/16 v2, 0xf

    .line 860
    .line 861
    invoke-virtual {v1, v2, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 862
    .line 863
    .line 864
    move-result v2

    .line 865
    const/16 v3, 0x12

    .line 866
    .line 867
    invoke-virtual {v1, v3, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 868
    .line 869
    .line 870
    move-result v3

    .line 871
    const/16 v4, 0x13

    .line 872
    .line 873
    invoke-virtual {v1, v4, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 874
    .line 875
    .line 876
    move-result v4

    .line 877
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 878
    .line 879
    .line 880
    if-eq v2, v12, :cond_3b

    .line 881
    .line 882
    invoke-static {v10, v2}, Lzt;->L(Landroid/widget/TextView;I)V

    .line 883
    .line 884
    .line 885
    :cond_3b
    if-eq v3, v12, :cond_3c

    .line 886
    .line 887
    invoke-static {v10, v3}, Lzt;->M(Landroid/widget/TextView;I)V

    .line 888
    .line 889
    .line 890
    :cond_3c
    if-eq v4, v12, :cond_3d

    .line 891
    .line 892
    invoke-static {v4}, Lzt;->e(I)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v10}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    const/4 v3, 0x0

    .line 900
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 901
    .line 902
    .line 903
    move-result v1

    .line 904
    if-eq v4, v1, :cond_3d

    .line 905
    .line 906
    sub-int/2addr v4, v1

    .line 907
    int-to-float v1, v4

    .line 908
    invoke-virtual {v10, v1, v6}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 909
    .line 910
    .line 911
    :cond_3d
    return-void
.end method

.method public final g(Landroid/content/Context;I)V
    .locals 5

    .line 1
    new-instance v0, Lr5;

    .line 2
    .line 3
    sget-object v1, Lxy;->w:[I

    .line 4
    .line 5
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v0, p1, p2}, Lr5;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xe

    .line 13
    .line 14
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Ld5;->a:Landroid/widget/TextView;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const/4 v1, -0x1

    .line 37
    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {v3, v4, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0, p1, v0}, Ld5;->n(Landroid/content/Context;Lr5;)V

    .line 48
    .line 49
    .line 50
    const/16 p1, 0xd

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    invoke-static {v3, p1}, Lb5;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {v0}, Lr5;->z()V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Ld5;->l:Landroid/graphics/Typeface;

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    iget p2, p0, Ld5;->j:I

    .line 75
    .line 76
    invoke-virtual {v3, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 77
    .line 78
    .line 79
    :cond_3
    return-void
.end method

.method public final i(IIII)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld5;->i:Ln5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Ln5;->j:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    int-to-float p1, p1

    .line 20
    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-float p2, p2

    .line 25
    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    int-to-float p3, p3

    .line 30
    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {v0, p1, p2, p3}, Ln5;->k(FFF)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ln5;->h()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Ln5;->a()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public final j([II)V
    .locals 6

    .line 1
    iget-object v0, p0, Ld5;->i:Ln5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-lez v1, :cond_3

    .line 12
    .line 13
    new-array v3, v1, [I

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v4, v0, Ln5;->j:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    :goto_0
    if-ge v2, v1, :cond_1

    .line 33
    .line 34
    aget v5, p1, v2

    .line 35
    .line 36
    int-to-float v5, v5

    .line 37
    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    aput v5, v3, v2

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    invoke-static {v3}, Ln5;->b([I)[I

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iput-object p2, v0, Ln5;->f:[I

    .line 55
    .line 56
    invoke-virtual {v0}, Ln5;->i()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, "None of the preset sizes is valid: "

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p2

    .line 87
    :cond_3
    iput-boolean v2, v0, Ln5;->g:Z

    .line 88
    .line 89
    :goto_2
    invoke-virtual {v0}, Ln5;->h()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    invoke-virtual {v0}, Ln5;->a()V

    .line 96
    .line 97
    .line 98
    :cond_4
    return-void
.end method

.method public final k(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Ld5;->i:Ln5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne p1, v1, :cond_0

    .line 13
    .line 14
    iget-object p1, v0, Ln5;->j:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/high16 v1, 0x41400000    # 12.0f

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-static {v2, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/high16 v3, 0x42e00000    # 112.0f

    .line 32
    .line 33
    invoke-static {v2, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/high16 v2, 0x3f800000    # 1.0f

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1, v2}, Ln5;->k(FFF)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ln5;->h()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Ln5;->a()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v2, "Unknown auto-size text type: "

    .line 57
    .line 58
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_1
    const/4 p1, 0x0

    .line 73
    iput p1, v0, Ln5;->a:I

    .line 74
    .line 75
    const/high16 v1, -0x40800000    # -1.0f

    .line 76
    .line 77
    iput v1, v0, Ln5;->d:F

    .line 78
    .line 79
    iput v1, v0, Ln5;->e:F

    .line 80
    .line 81
    iput v1, v0, Ln5;->c:F

    .line 82
    .line 83
    new-array v1, p1, [I

    .line 84
    .line 85
    iput-object v1, v0, Ln5;->f:[I

    .line 86
    .line 87
    iput-boolean p1, v0, Ln5;->b:Z

    .line 88
    .line 89
    :cond_2
    return-void
.end method

.method public final l(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld5;->h:Ly60;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ly60;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ld5;->h:Ly60;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ld5;->h:Ly60;

    .line 13
    .line 14
    iput-object p1, v0, Ly60;->a:Landroid/content/res/ColorStateList;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, Ly60;->d:Z

    .line 22
    .line 23
    iput-object v0, p0, Ld5;->b:Ly60;

    .line 24
    .line 25
    iput-object v0, p0, Ld5;->c:Ly60;

    .line 26
    .line 27
    iput-object v0, p0, Ld5;->d:Ly60;

    .line 28
    .line 29
    iput-object v0, p0, Ld5;->e:Ly60;

    .line 30
    .line 31
    iput-object v0, p0, Ld5;->f:Ly60;

    .line 32
    .line 33
    iput-object v0, p0, Ld5;->g:Ly60;

    .line 34
    .line 35
    return-void
.end method

.method public final m(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld5;->h:Ly60;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ly60;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ld5;->h:Ly60;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ld5;->h:Ly60;

    .line 13
    .line 14
    iput-object p1, v0, Ly60;->b:Landroid/graphics/PorterDuff$Mode;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, Ly60;->c:Z

    .line 22
    .line 23
    iput-object v0, p0, Ld5;->b:Ly60;

    .line 24
    .line 25
    iput-object v0, p0, Ld5;->c:Ly60;

    .line 26
    .line 27
    iput-object v0, p0, Ld5;->d:Ly60;

    .line 28
    .line 29
    iput-object v0, p0, Ld5;->e:Ly60;

    .line 30
    .line 31
    iput-object v0, p0, Ld5;->f:Ly60;

    .line 32
    .line 33
    iput-object v0, p0, Ld5;->g:Ly60;

    .line 34
    .line 35
    return-void
.end method

.method public final n(Landroid/content/Context;Lr5;)V
    .locals 11

    .line 1
    iget v0, p0, Ld5;->j:I

    .line 2
    .line 3
    iget-object v1, p2, Lr5;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/res/TypedArray;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Ld5;->j:I

    .line 13
    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/4 v3, -0x1

    .line 17
    const/16 v4, 0x1c

    .line 18
    .line 19
    if-lt v0, v4, :cond_0

    .line 20
    .line 21
    const/16 v5, 0xb

    .line 22
    .line 23
    invoke-virtual {v1, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iput v5, p0, Ld5;->k:I

    .line 28
    .line 29
    if-eq v5, v3, :cond_0

    .line 30
    .line 31
    iget v5, p0, Ld5;->j:I

    .line 32
    .line 33
    and-int/2addr v5, v2

    .line 34
    iput v5, p0, Ld5;->j:I

    .line 35
    .line 36
    :cond_0
    const/16 v5, 0xa

    .line 37
    .line 38
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/16 v7, 0xc

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x1

    .line 46
    if-nez v6, :cond_5

    .line 47
    .line 48
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_e

    .line 60
    .line 61
    iput-boolean v8, p0, Ld5;->m:Z

    .line 62
    .line 63
    invoke-virtual {v1, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eq p1, v9, :cond_4

    .line 68
    .line 69
    if-eq p1, v2, :cond_3

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    if-eq p1, p2, :cond_2

    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 77
    .line 78
    iput-object p1, p0, Ld5;->l:Landroid/graphics/Typeface;

    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 82
    .line 83
    iput-object p1, p0, Ld5;->l:Landroid/graphics/Typeface;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 87
    .line 88
    iput-object p1, p0, Ld5;->l:Landroid/graphics/Typeface;

    .line 89
    .line 90
    return-void

    .line 91
    :cond_5
    :goto_0
    const/4 v6, 0x0

    .line 92
    iput-object v6, p0, Ld5;->l:Landroid/graphics/Typeface;

    .line 93
    .line 94
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_6

    .line 99
    .line 100
    move v5, v7

    .line 101
    :cond_6
    iget v6, p0, Ld5;->k:I

    .line 102
    .line 103
    iget v7, p0, Ld5;->j:I

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_b

    .line 110
    .line 111
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 112
    .line 113
    iget-object v10, p0, Ld5;->a:Landroid/widget/TextView;

    .line 114
    .line 115
    invoke-direct {p1, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v10, Lx4;

    .line 119
    .line 120
    invoke-direct {v10, p0, v6, v7, p1}, Lx4;-><init>(Ld5;IILjava/lang/ref/WeakReference;)V

    .line 121
    .line 122
    .line 123
    :try_start_0
    iget p1, p0, Ld5;->j:I

    .line 124
    .line 125
    invoke-virtual {p2, v5, p1, v10}, Lr5;->o(IILx4;)Landroid/graphics/Typeface;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_9

    .line 130
    .line 131
    if-lt v0, v4, :cond_8

    .line 132
    .line 133
    iget p2, p0, Ld5;->k:I

    .line 134
    .line 135
    if-eq p2, v3, :cond_8

    .line 136
    .line 137
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget p2, p0, Ld5;->k:I

    .line 142
    .line 143
    iget v0, p0, Ld5;->j:I

    .line 144
    .line 145
    and-int/2addr v0, v2

    .line 146
    if-eqz v0, :cond_7

    .line 147
    .line 148
    move v0, v9

    .line 149
    goto :goto_1

    .line 150
    :cond_7
    move v0, v8

    .line 151
    :goto_1
    invoke-static {p1, p2, v0}, Lc5;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    iput-object p1, p0, Ld5;->l:Landroid/graphics/Typeface;

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    iput-object p1, p0, Ld5;->l:Landroid/graphics/Typeface;

    .line 159
    .line 160
    :cond_9
    :goto_2
    iget-object p1, p0, Ld5;->l:Landroid/graphics/Typeface;

    .line 161
    .line 162
    if-nez p1, :cond_a

    .line 163
    .line 164
    move p1, v9

    .line 165
    goto :goto_3

    .line 166
    :cond_a
    move p1, v8

    .line 167
    :goto_3
    iput-boolean p1, p0, Ld5;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    :catch_0
    :cond_b
    iget-object p1, p0, Ld5;->l:Landroid/graphics/Typeface;

    .line 170
    .line 171
    if-nez p1, :cond_e

    .line 172
    .line 173
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-eqz p1, :cond_e

    .line 178
    .line 179
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 180
    .line 181
    if-lt p2, v4, :cond_d

    .line 182
    .line 183
    iget p2, p0, Ld5;->k:I

    .line 184
    .line 185
    if-eq p2, v3, :cond_d

    .line 186
    .line 187
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget p2, p0, Ld5;->k:I

    .line 192
    .line 193
    iget v0, p0, Ld5;->j:I

    .line 194
    .line 195
    and-int/2addr v0, v2

    .line 196
    if-eqz v0, :cond_c

    .line 197
    .line 198
    move v8, v9

    .line 199
    :cond_c
    invoke-static {p1, p2, v8}, Lc5;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    iput-object p1, p0, Ld5;->l:Landroid/graphics/Typeface;

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_d
    iget p2, p0, Ld5;->j:I

    .line 207
    .line 208
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iput-object p1, p0, Ld5;->l:Landroid/graphics/Typeface;

    .line 213
    .line 214
    :cond_e
    :goto_4
    return-void
.end method
