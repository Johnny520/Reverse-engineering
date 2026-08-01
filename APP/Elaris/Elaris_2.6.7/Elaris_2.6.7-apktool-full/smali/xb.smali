.class public final Lxb;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:I

.field public final c:F

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:Z

.field public final q:Ljava/lang/String;

.field public final r:Z

.field public final s:Landroid/graphics/drawable/Drawable$ConstantState;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lxb;->a:Landroid/view/View;

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    .line 17
    .line 18
    .line 19
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    goto :goto_1

    .line 21
    :catchall_1
    const/high16 v4, 0x3f800000    # 1.0f

    .line 22
    .line 23
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Landroid/view/View;->getMinimumWidth()I

    .line 24
    .line 25
    .line 26
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 27
    goto :goto_2

    .line 28
    :catchall_2
    const/4 v5, 0x0

    .line 29
    :goto_2
    :try_start_3
    invoke-virtual {v1}, Landroid/view/View;->getMinimumHeight()I

    .line 30
    .line 31
    .line 32
    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 33
    goto :goto_3

    .line 34
    :catchall_3
    const/4 v6, 0x0

    .line 35
    :goto_3
    :try_start_4
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 36
    .line 37
    .line 38
    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 39
    goto :goto_4

    .line 40
    :catchall_4
    const/4 v7, 0x0

    .line 41
    :goto_4
    :try_start_5
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 42
    .line 43
    .line 44
    move-result v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 45
    goto :goto_5

    .line 46
    :catchall_5
    const/4 v8, 0x0

    .line 47
    :goto_5
    :try_start_6
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 48
    .line 49
    .line 50
    move-result v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 51
    goto :goto_6

    .line 52
    :catchall_6
    const/4 v9, 0x0

    .line 53
    :goto_6
    :try_start_7
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 54
    .line 55
    .line 56
    move-result v10
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 57
    goto :goto_7

    .line 58
    :catchall_7
    const/4 v10, 0x0

    .line 59
    :goto_7
    const/high16 v12, -0x80000000

    .line 60
    .line 61
    :try_start_8
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    if-eqz v13, :cond_1

    .line 66
    .line 67
    iget v14, v13, Landroid/view/ViewGroup$LayoutParams;->width:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_c

    .line 68
    .line 69
    :try_start_9
    iget v12, v13, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 70
    .line 71
    instance-of v15, v13, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 72
    .line 73
    if-eqz v15, :cond_0

    .line 74
    .line 75
    check-cast v13, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 76
    .line 77
    iget v15, v13, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    .line 78
    .line 79
    :try_start_a
    iget v2, v13, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 80
    .line 81
    :try_start_b
    iget v11, v13, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 82
    .line 83
    :try_start_c
    iget v13, v13, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 84
    .line 85
    move/from16 v18, v13

    .line 86
    .line 87
    move v13, v12

    .line 88
    move v12, v14

    .line 89
    move/from16 v14, v18

    .line 90
    .line 91
    const/16 v18, 0x1

    .line 92
    .line 93
    goto :goto_b

    .line 94
    :catchall_8
    move v13, v12

    .line 95
    move v12, v14

    .line 96
    goto :goto_c

    .line 97
    :catchall_9
    move v13, v12

    .line 98
    move v12, v14

    .line 99
    :goto_8
    const/4 v11, 0x0

    .line 100
    goto :goto_c

    .line 101
    :catchall_a
    move v13, v12

    .line 102
    move v12, v14

    .line 103
    const/4 v2, 0x0

    .line 104
    goto :goto_8

    .line 105
    :catchall_b
    move v13, v12

    .line 106
    move v12, v14

    .line 107
    :goto_9
    const/4 v2, 0x0

    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v15, 0x0

    .line 110
    goto :goto_c

    .line 111
    :cond_0
    move v13, v12

    .line 112
    move v12, v14

    .line 113
    :goto_a
    const/4 v2, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    const/4 v14, 0x0

    .line 116
    const/4 v15, 0x0

    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    goto :goto_b

    .line 120
    :catchall_c
    move v13, v12

    .line 121
    goto :goto_9

    .line 122
    :cond_1
    move v13, v12

    .line 123
    goto :goto_a

    .line 124
    :goto_b
    move/from16 v19, v18

    .line 125
    .line 126
    goto :goto_d

    .line 127
    :goto_c
    const/4 v14, 0x0

    .line 128
    const/16 v19, 0x0

    .line 129
    .line 130
    :goto_d
    const/16 v18, 0x0

    .line 131
    .line 132
    move/from16 v20, v14

    .line 133
    .line 134
    :try_start_d
    instance-of v14, v1, Landroid/widget/TextView;

    .line 135
    .line 136
    if-eqz v14, :cond_2

    .line 137
    .line 138
    move-object v14, v1

    .line 139
    check-cast v14, Landroid/widget/TextView;

    .line 140
    .line 141
    invoke-virtual {v14}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    if-eqz v14, :cond_2

    .line 146
    .line 147
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    .line 148
    .line 149
    .line 150
    move-result v21

    .line 151
    if-lez v21, :cond_2

    .line 152
    .line 153
    invoke-interface {v14}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v14
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 157
    const/16 v16, 0x1

    .line 158
    .line 159
    goto :goto_e

    .line 160
    :cond_2
    move-object/from16 v14, v18

    .line 161
    .line 162
    const/16 v16, 0x0

    .line 163
    .line 164
    :goto_e
    move-object/from16 v17, v14

    .line 165
    .line 166
    goto :goto_f

    .line 167
    :catchall_d
    move-object/from16 v17, v18

    .line 168
    .line 169
    const/16 v16, 0x0

    .line 170
    .line 171
    :goto_f
    :try_start_e
    instance-of v14, v1, Landroid/widget/ImageView;

    .line 172
    .line 173
    if-eqz v14, :cond_3

    .line 174
    .line 175
    check-cast v1, Landroid/widget/ImageView;

    .line 176
    .line 177
    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    if-eqz v1, :cond_3

    .line 182
    .line 183
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 184
    .line 185
    .line 186
    move-result-object v18
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 187
    :catchall_e
    :cond_3
    move-object/from16 v1, v18

    .line 188
    .line 189
    iput v3, v0, Lxb;->b:I

    .line 190
    .line 191
    iput v4, v0, Lxb;->c:F

    .line 192
    .line 193
    iput v5, v0, Lxb;->d:I

    .line 194
    .line 195
    iput v6, v0, Lxb;->e:I

    .line 196
    .line 197
    iput v7, v0, Lxb;->f:I

    .line 198
    .line 199
    iput v8, v0, Lxb;->g:I

    .line 200
    .line 201
    iput v9, v0, Lxb;->h:I

    .line 202
    .line 203
    iput v10, v0, Lxb;->i:I

    .line 204
    .line 205
    iput v12, v0, Lxb;->j:I

    .line 206
    .line 207
    iput v13, v0, Lxb;->k:I

    .line 208
    .line 209
    iput v15, v0, Lxb;->l:I

    .line 210
    .line 211
    iput v2, v0, Lxb;->m:I

    .line 212
    .line 213
    iput v11, v0, Lxb;->n:I

    .line 214
    .line 215
    move/from16 v14, v20

    .line 216
    .line 217
    iput v14, v0, Lxb;->o:I

    .line 218
    .line 219
    move/from16 v2, v19

    .line 220
    .line 221
    iput-boolean v2, v0, Lxb;->p:Z

    .line 222
    .line 223
    move-object/from16 v14, v17

    .line 224
    .line 225
    iput-object v14, v0, Lxb;->q:Ljava/lang/String;

    .line 226
    .line 227
    move/from16 v2, v16

    .line 228
    .line 229
    iput-boolean v2, v0, Lxb;->r:Z

    .line 230
    .line 231
    iput-object v1, v0, Lxb;->s:Landroid/graphics/drawable/Drawable$ConstantState;

    .line 232
    .line 233
    return-void
.end method
