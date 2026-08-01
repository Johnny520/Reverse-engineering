.class public final Lb11;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:J

.field public final β:Landroid/util/SparseLongArray;

.field public final γ:Landroid/util/SparseBooleanArray;

.field public final δ:Ljava/util/ArrayList;

.field public final ε:Lzv0;

.field public ζ:I

.field public η:I

.field public θ:Z

.field public ι:Z

.field public κ:Lo41;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseLongArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseLongArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lb11;->β:Landroid/util/SparseLongArray;

    .line 10
    .line 11
    new-instance v0, Landroid/util/SparseBooleanArray;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lb11;->γ:Landroid/util/SparseBooleanArray;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lb11;->δ:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v0, Lzv0;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, Lzv0;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lb11;->ε:Lzv0;

    .line 32
    .line 33
    const/4 v0, -0x1

    .line 34
    iput v0, p0, Lb11;->ζ:I

    .line 35
    .line 36
    iput v0, p0, Lb11;->η:I

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final α(Landroid/view/MotionEvent;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x1

    .line 6
    .line 7
    iget-object v3, p0, Lb11;->β:Landroid/util/SparseLongArray;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v4, 0x5

    .line 12
    if-eq v0, v4, :cond_1

    .line 13
    .line 14
    const/16 v4, 0x9

    .line 15
    .line 16
    if-eq v0, v4, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {v3, p1}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-gez v0, :cond_2

    .line 29
    .line 30
    iget-wide v4, p0, Lb11;->α:J

    .line 31
    .line 32
    add-long/2addr v1, v4

    .line 33
    iput-wide v1, p0, Lb11;->α:J

    .line 34
    .line 35
    invoke-virtual {v3, p1, v4, v5}, Landroid/util/SparseLongArray;->put(IJ)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {v3, v4}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-gez v5, :cond_2

    .line 52
    .line 53
    iget-wide v5, p0, Lb11;->α:J

    .line 54
    .line 55
    add-long/2addr v1, v5

    .line 56
    iput-wide v1, p0, Lb11;->α:J

    .line 57
    .line 58
    invoke-virtual {v3, v4, v5, v6}, Landroid/util/SparseLongArray;->put(IJ)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    const/4 v0, 0x3

    .line 66
    if-ne p1, v0, :cond_2

    .line 67
    .line 68
    iget-object p0, p0, Lb11;->γ:Landroid/util/SparseBooleanArray;

    .line 69
    .line 70
    const/4 p1, 0x1

    .line 71
    invoke-virtual {p0, v4, p1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 72
    .line 73
    .line 74
    :cond_2
    :goto_0
    return-void
.end method

.method public final β(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget v1, p0, Lb11;->ζ:I

    .line 19
    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    iget v1, p0, Lb11;->η:I

    .line 23
    .line 24
    if-eq p1, v1, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    return-void

    .line 28
    :cond_2
    :goto_1
    iput v0, p0, Lb11;->ζ:I

    .line 29
    .line 30
    iput p1, p0, Lb11;->η:I

    .line 31
    .line 32
    iget-object p1, p0, Lb11;->γ:Landroid/util/SparseBooleanArray;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lb11;->β:Landroid/util/SparseLongArray;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/util/SparseLongArray;->clear()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final γ(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)Ln5;
    .locals 14

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v6, 0x0

    .line 6
    iget-object v1, p0, Lb11;->γ:Landroid/util/SparseBooleanArray;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v3, 0x3

    .line 10
    if-eq v0, v3, :cond_12

    .line 11
    .line 12
    const/4 v4, 0x4

    .line 13
    if-eq v0, v4, :cond_12

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p1}, Lb11;->β(Landroid/view/MotionEvent;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p0 .. p1}, Lb11;->α(Landroid/view/MotionEvent;)V

    .line 19
    .line 20
    .line 21
    const/16 v4, 0x9

    .line 22
    .line 23
    const/4 v8, 0x1

    .line 24
    if-eq v0, v4, :cond_1

    .line 25
    .line 26
    const/4 v4, 0x7

    .line 27
    if-eq v0, v4, :cond_1

    .line 28
    .line 29
    const/16 v4, 0xa

    .line 30
    .line 31
    if-ne v0, v4, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v9, v7

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    move v9, v8

    .line 37
    :goto_1
    const/16 v4, 0x8

    .line 38
    .line 39
    if-ne v0, v4, :cond_2

    .line 40
    .line 41
    move v10, v8

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v10, v7

    .line 44
    :goto_2
    if-eqz v9, :cond_3

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-virtual {v1, v4, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 55
    .line 56
    .line 57
    :cond_3
    if-eq v0, v8, :cond_5

    .line 58
    .line 59
    const/4 v1, 0x6

    .line 60
    if-eq v0, v1, :cond_4

    .line 61
    .line 62
    const/4 v0, -0x1

    .line 63
    :goto_3
    move v11, v0

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    goto :goto_3

    .line 70
    :cond_5
    move v11, v7

    .line 71
    :goto_4
    iget-object v12, p0, Lb11;->δ:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/16 v1, 0x22

    .line 81
    .line 82
    if-nez v0, :cond_b

    .line 83
    .line 84
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 85
    .line 86
    if-lt v0, v1, :cond_7

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getClassification()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eq v0, v3, :cond_6

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getClassification()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    const/4 v4, 0x5

    .line 99
    if-ne v0, v4, :cond_7

    .line 100
    .line 101
    :cond_6
    move v0, v8

    .line 102
    goto :goto_5

    .line 103
    :cond_7
    move v0, v7

    .line 104
    :goto_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-nez v4, :cond_9

    .line 109
    .line 110
    const/16 v4, 0x2002

    .line 111
    .line 112
    invoke-virtual {p1, v4}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_8

    .line 117
    .line 118
    const v4, 0x100008

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v4}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_9

    .line 126
    .line 127
    :cond_8
    move v4, v8

    .line 128
    goto :goto_6

    .line 129
    :cond_9
    move v4, v7

    .line 130
    :goto_6
    if-nez v0, :cond_a

    .line 131
    .line 132
    if-eqz v4, :cond_b

    .line 133
    .line 134
    :cond_a
    iput-boolean v8, p0, Lb11;->θ:Z

    .line 135
    .line 136
    :cond_b
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 137
    .line 138
    if-lt v0, v1, :cond_d

    .line 139
    .line 140
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getClassification()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-ne v0, v3, :cond_d

    .line 145
    .line 146
    iput-boolean v8, p0, Lb11;->ι:Z

    .line 147
    .line 148
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_c

    .line 153
    .line 154
    invoke-virtual {p1, v7}, Landroid/view/MotionEvent;->getRawX(I)F

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    invoke-virtual {p1, v7}, Landroid/view/MotionEvent;->getRawY(I)F

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    int-to-long v3, v0

    .line 167
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    int-to-long v0, v0

    .line 172
    const/16 v5, 0x20

    .line 173
    .line 174
    shl-long/2addr v3, v5

    .line 175
    const-wide v9, 0xffffffffL

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    and-long/2addr v0, v9

    .line 181
    or-long/2addr v0, v3

    .line 182
    new-instance v3, Lo41;

    .line 183
    .line 184
    invoke-direct {v3, v0, v1}, Lo41;-><init>(J)V

    .line 185
    .line 186
    .line 187
    iput-object v3, p0, Lb11;->κ:Lo41;

    .line 188
    .line 189
    :cond_c
    iget-object v3, p0, Lb11;->κ:Lo41;

    .line 190
    .line 191
    const/4 v4, 0x0

    .line 192
    const/4 v5, 0x0

    .line 193
    move-object v0, p0

    .line 194
    move-object v2, p1

    .line 195
    move-object/from16 v1, p2

    .line 196
    .line 197
    invoke-virtual/range {v0 .. v5}, Lb11;->δ(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/MotionEvent;Lo41;IZ)Lci1;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_9

    .line 205
    :cond_d
    iput-boolean v7, p0, Lb11;->ι:Z

    .line 206
    .line 207
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    move v4, v7

    .line 212
    :goto_7
    if-ge v4, v13, :cond_10

    .line 213
    .line 214
    if-nez v9, :cond_f

    .line 215
    .line 216
    if-eq v4, v11, :cond_f

    .line 217
    .line 218
    if-eqz v10, :cond_e

    .line 219
    .line 220
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_f

    .line 225
    .line 226
    :cond_e
    move v5, v8

    .line 227
    goto :goto_8

    .line 228
    :cond_f
    move v5, v7

    .line 229
    :goto_8
    const/4 v3, 0x0

    .line 230
    move-object v0, p0

    .line 231
    move-object v2, p1

    .line 232
    move-object/from16 v1, p2

    .line 233
    .line 234
    invoke-virtual/range {v0 .. v5}, Lb11;->δ(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/MotionEvent;Lo41;IZ)Lci1;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    add-int/lit8 v4, v4, 0x1

    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_10
    :goto_9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-ne v1, v8, :cond_11

    .line 249
    .line 250
    iput-boolean v7, p0, Lb11;->θ:Z

    .line 251
    .line 252
    iput-boolean v7, p0, Lb11;->ι:Z

    .line 253
    .line 254
    iput-object v6, p0, Lb11;->κ:Lo41;

    .line 255
    .line 256
    :cond_11
    invoke-virtual/range {p0 .. p1}, Lb11;->ε(Landroid/view/MotionEvent;)V

    .line 257
    .line 258
    .line 259
    new-instance p0, Ln5;

    .line 260
    .line 261
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 262
    .line 263
    .line 264
    const/16 v0, 0x1a

    .line 265
    .line 266
    const/4 v1, 0x0

    .line 267
    invoke-direct {p0, v0, v12, p1, v1}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 268
    .line 269
    .line 270
    return-object p0

    .line 271
    :cond_12
    iget-object v2, p0, Lb11;->β:Landroid/util/SparseLongArray;

    .line 272
    .line 273
    invoke-virtual {v2}, Landroid/util/SparseLongArray;->clear()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 277
    .line 278
    .line 279
    iput-boolean v7, p0, Lb11;->θ:Z

    .line 280
    .line 281
    iput-boolean v7, p0, Lb11;->ι:Z

    .line 282
    .line 283
    iput-object v6, p0, Lb11;->κ:Lo41;

    .line 284
    .line 285
    return-object v6
.end method

.method public final δ(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/MotionEvent;Lo41;IZ)Lci1;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    invoke-virtual {v2, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v6, v0, Lb11;->β:Landroid/util/SparseLongArray;

    .line 16
    .line 17
    invoke-virtual {v6, v5}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    if-ltz v7, :cond_0

    .line 22
    .line 23
    invoke-virtual {v6, v7}, Landroid/util/SparseLongArray;->valueAt(I)J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    move-wide v12, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-wide v7, v0, Lb11;->α:J

    .line 30
    .line 31
    const-wide/16 v9, 0x1

    .line 32
    .line 33
    add-long/2addr v9, v7

    .line 34
    iput-wide v9, v0, Lb11;->α:J

    .line 35
    .line 36
    invoke-virtual {v6, v5, v7, v8}, Landroid/util/SparseLongArray;->put(IJ)V

    .line 37
    .line 38
    .line 39
    move-wide v12, v7

    .line 40
    :goto_0
    invoke-virtual {v2, v4}, Landroid/view/MotionEvent;->getPressure(I)F

    .line 41
    .line 42
    .line 43
    move-result v21

    .line 44
    invoke-virtual {v2, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {v2, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    int-to-long v7, v5

    .line 57
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    int-to-long v5, v5

    .line 62
    const/16 v9, 0x20

    .line 63
    .line 64
    shl-long/2addr v7, v9

    .line 65
    const-wide v10, 0xffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v5, v10

    .line 71
    or-long v30, v7, v5

    .line 72
    .line 73
    if-nez v4, :cond_2

    .line 74
    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    iget-wide v5, v3, Lo41;->α:J

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawX()F

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawY()F

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    int-to-long v6, v3

    .line 93
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    int-to-long v14, v3

    .line 98
    shl-long v5, v6, v9

    .line 99
    .line 100
    and-long v7, v14, v10

    .line 101
    .line 102
    or-long/2addr v5, v7

    .line 103
    :goto_1
    invoke-virtual {v1, v5, v6}, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ(J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v7

    .line 107
    :goto_2
    move-wide/from16 v16, v5

    .line 108
    .line 109
    move-wide/from16 v18, v7

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_2
    if-eqz v3, :cond_3

    .line 113
    .line 114
    iget-wide v5, v3, Lo41;->α:J

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_3
    invoke-virtual {v2, v4}, Landroid/view/MotionEvent;->getRawX(I)F

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-virtual {v2, v4}, Landroid/view/MotionEvent;->getRawY(I)F

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    int-to-long v6, v3

    .line 130
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    int-to-long v14, v3

    .line 135
    shl-long v5, v6, v9

    .line 136
    .line 137
    and-long v7, v14, v10

    .line 138
    .line 139
    or-long/2addr v5, v7

    .line 140
    :goto_3
    invoke-virtual {v1, v5, v6}, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ(J)J

    .line 141
    .line 142
    .line 143
    move-result-wide v7

    .line 144
    goto :goto_2

    .line 145
    :goto_4
    invoke-virtual {v2, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    const/4 v3, 0x0

    .line 150
    const/4 v5, 0x3

    .line 151
    if-eqz v1, :cond_4

    .line 152
    .line 153
    const/4 v6, 0x2

    .line 154
    const/4 v7, 0x1

    .line 155
    if-eq v1, v7, :cond_7

    .line 156
    .line 157
    if-eq v1, v6, :cond_6

    .line 158
    .line 159
    if-eq v1, v5, :cond_5

    .line 160
    .line 161
    const/4 v6, 0x4

    .line 162
    if-eq v1, v6, :cond_5

    .line 163
    .line 164
    :cond_4
    move/from16 v22, v3

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_5
    :goto_5
    move/from16 v22, v6

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_6
    move/from16 v22, v5

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_7
    const/16 v1, 0x2002

    .line 174
    .line 175
    invoke-virtual {v2, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-nez v1, :cond_8

    .line 180
    .line 181
    const v1, 0x100008

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_9

    .line 189
    .line 190
    :cond_8
    iget-boolean v1, v0, Lb11;->θ:Z

    .line 191
    .line 192
    if-eqz v1, :cond_5

    .line 193
    .line 194
    iget-boolean v1, v0, Lb11;->ι:Z

    .line 195
    .line 196
    if-eqz v1, :cond_9

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_9
    move/from16 v22, v7

    .line 200
    .line 201
    :goto_6
    new-instance v1, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    move v7, v3

    .line 215
    :goto_7
    const/16 v8, 0x33

    .line 216
    .line 217
    move/from16 v20, v9

    .line 218
    .line 219
    const/16 v9, 0x34

    .line 220
    .line 221
    const-wide/16 v23, 0x0

    .line 222
    .line 223
    const/high16 v25, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/16 v26, 0x0

    .line 226
    .line 227
    if-ge v7, v6, :cond_e

    .line 228
    .line 229
    invoke-virtual {v2, v4, v7}, Landroid/view/MotionEvent;->getHistoricalX(II)F

    .line 230
    .line 231
    .line 232
    move-result v27

    .line 233
    invoke-virtual {v2, v4, v7}, Landroid/view/MotionEvent;->getHistoricalY(II)F

    .line 234
    .line 235
    .line 236
    move-result v28

    .line 237
    invoke-static/range {v27 .. v27}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 238
    .line 239
    .line 240
    move-result v29

    .line 241
    const v32, 0x7fffffff

    .line 242
    .line 243
    .line 244
    move-wide/from16 v33, v10

    .line 245
    .line 246
    and-int v10, v29, v32

    .line 247
    .line 248
    const/high16 v11, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 249
    .line 250
    if-ge v10, v11, :cond_d

    .line 251
    .line 252
    invoke-static/range {v28 .. v28}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    and-int v10, v10, v32

    .line 257
    .line 258
    if-ge v10, v11, :cond_d

    .line 259
    .line 260
    invoke-static/range {v27 .. v27}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    int-to-long v10, v10

    .line 265
    invoke-static/range {v28 .. v28}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 266
    .line 267
    .line 268
    move-result v15

    .line 269
    int-to-long v14, v15

    .line 270
    shl-long v10, v10, v20

    .line 271
    .line 272
    and-long v14, v14, v33

    .line 273
    .line 274
    or-long v38, v10, v14

    .line 275
    .line 276
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getHistoricalEventTime(I)J

    .line 277
    .line 278
    .line 279
    move-result-wide v36

    .line 280
    invoke-virtual {v2, v9, v4, v7}, Landroid/view/MotionEvent;->getHistoricalAxisValue(III)F

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    cmpl-float v9, v9, v26

    .line 289
    .line 290
    if-lez v9, :cond_a

    .line 291
    .line 292
    move-object v15, v10

    .line 293
    goto :goto_8

    .line 294
    :cond_a
    const/4 v15, 0x0

    .line 295
    :goto_8
    if-eqz v15, :cond_b

    .line 296
    .line 297
    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    .line 298
    .line 299
    .line 300
    move-result v25

    .line 301
    :cond_b
    move/from16 v40, v25

    .line 302
    .line 303
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getClassification()I

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    if-ne v9, v5, :cond_c

    .line 308
    .line 309
    const/16 v9, 0x32

    .line 310
    .line 311
    invoke-virtual {v2, v9, v4, v7}, Landroid/view/MotionEvent;->getHistoricalAxisValue(III)F

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    invoke-virtual {v2, v8, v4, v7}, Landroid/view/MotionEvent;->getHistoricalAxisValue(III)F

    .line 316
    .line 317
    .line 318
    move-result v8

    .line 319
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    int-to-long v9, v9

    .line 324
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    int-to-long v14, v8

    .line 329
    shl-long v8, v9, v20

    .line 330
    .line 331
    and-long v10, v14, v33

    .line 332
    .line 333
    or-long v23, v8, v10

    .line 334
    .line 335
    :cond_c
    move-wide/from16 v41, v23

    .line 336
    .line 337
    new-instance v35, Lje0;

    .line 338
    .line 339
    move-wide/from16 v43, v38

    .line 340
    .line 341
    invoke-direct/range {v35 .. v44}, Lje0;-><init>(JJFJJ)V

    .line 342
    .line 343
    .line 344
    move-object/from16 v8, v35

    .line 345
    .line 346
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    :cond_d
    add-int/lit8 v7, v7, 0x1

    .line 350
    .line 351
    move/from16 v9, v20

    .line 352
    .line 353
    move-wide/from16 v10, v33

    .line 354
    .line 355
    goto/16 :goto_7

    .line 356
    .line 357
    :cond_e
    move-wide/from16 v33, v10

    .line 358
    .line 359
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    const/16 v7, 0x8

    .line 364
    .line 365
    if-ne v6, v7, :cond_f

    .line 366
    .line 367
    const/16 v6, 0xa

    .line 368
    .line 369
    invoke-virtual {v2, v6}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    const/16 v7, 0x9

    .line 374
    .line 375
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    neg-float v7, v7

    .line 380
    add-float v7, v7, v26

    .line 381
    .line 382
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    int-to-long v10, v6

    .line 387
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    int-to-long v6, v6

    .line 392
    shl-long v10, v10, v20

    .line 393
    .line 394
    and-long v6, v6, v33

    .line 395
    .line 396
    or-long/2addr v6, v10

    .line 397
    goto :goto_9

    .line 398
    :cond_f
    move-wide/from16 v6, v23

    .line 399
    .line 400
    :goto_9
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getClassification()I

    .line 401
    .line 402
    .line 403
    move-result v10

    .line 404
    const/4 v11, 0x5

    .line 405
    if-ne v10, v11, :cond_11

    .line 406
    .line 407
    invoke-virtual {v2, v9, v4}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 408
    .line 409
    .line 410
    move-result v9

    .line 411
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 412
    .line 413
    .line 414
    move-result-object v10

    .line 415
    cmpl-float v9, v9, v26

    .line 416
    .line 417
    if-lez v9, :cond_10

    .line 418
    .line 419
    move-object v15, v10

    .line 420
    goto :goto_a

    .line 421
    :cond_10
    const/4 v15, 0x0

    .line 422
    :goto_a
    if-eqz v15, :cond_11

    .line 423
    .line 424
    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    .line 425
    .line 426
    .line 427
    move-result v25

    .line 428
    :cond_11
    move/from16 v27, v25

    .line 429
    .line 430
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getClassification()I

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    if-ne v9, v5, :cond_12

    .line 435
    .line 436
    const/16 v9, 0x32

    .line 437
    .line 438
    invoke-virtual {v2, v9, v4}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 439
    .line 440
    .line 441
    move-result v5

    .line 442
    invoke-virtual {v2, v8, v4}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 443
    .line 444
    .line 445
    move-result v8

    .line 446
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    int-to-long v9, v5

    .line 451
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 452
    .line 453
    .line 454
    move-result v5

    .line 455
    int-to-long v14, v5

    .line 456
    shl-long v8, v9, v20

    .line 457
    .line 458
    and-long v10, v14, v33

    .line 459
    .line 460
    or-long v23, v8, v10

    .line 461
    .line 462
    :cond_12
    move-wide/from16 v28, v23

    .line 463
    .line 464
    iget-object v0, v0, Lb11;->γ:Landroid/util/SparseBooleanArray;

    .line 465
    .line 466
    invoke-virtual {v2, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    invoke-virtual {v0, v4, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 471
    .line 472
    .line 473
    move-result v23

    .line 474
    new-instance v11, Lci1;

    .line 475
    .line 476
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 477
    .line 478
    .line 479
    move-result-wide v14

    .line 480
    move/from16 v20, p5

    .line 481
    .line 482
    move-object/from16 v24, v1

    .line 483
    .line 484
    move-wide/from16 v25, v6

    .line 485
    .line 486
    invoke-direct/range {v11 .. v31}, Lci1;-><init>(JJJJZFIZLjava/util/ArrayList;JFJJ)V

    .line 487
    .line 488
    .line 489
    return-object v11
.end method

.method public final ε(Landroid/view/MotionEvent;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lb11;->γ:Landroid/util/SparseBooleanArray;

    .line 7
    .line 8
    iget-object p0, p0, Lb11;->β:Landroid/util/SparseLongArray;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v0, v3, :cond_0

    .line 12
    .line 13
    const/4 v4, 0x6

    .line 14
    if-eq v0, v4, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {v2, v0, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/util/SparseLongArray;->delete(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/util/SparseLongArray;->size()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-le v0, v4, :cond_4

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/util/SparseLongArray;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    sub-int/2addr v0, v3

    .line 52
    :goto_1
    const/4 v3, -0x1

    .line 53
    if-ge v3, v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroid/util/SparseLongArray;->keyAt(I)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    move v5, v1

    .line 64
    :goto_2
    if-ge v5, v4, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-ne v6, v3, :cond_2

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-virtual {p0, v0}, Landroid/util/SparseLongArray;->removeAt(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v3}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 80
    .line 81
    .line 82
    :goto_3
    add-int/lit8 v0, v0, -0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    return-void
.end method
