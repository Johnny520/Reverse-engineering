.class public final Lac/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lw4/e;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(BI)V
    .locals 0

    iput p2, p0, Lac/k;->g:I

    packed-switch p2, :pswitch_data_0

    .line 257
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 258
    new-array p2, p1, [I

    iput-object p2, p0, Lac/k;->i:Ljava/lang/Object;

    .line 259
    new-array p2, p1, [I

    iput-object p2, p0, Lac/k;->j:Ljava/lang/Object;

    .line 260
    iput p1, p0, Lac/k;->h:I

    return-void

    .line 261
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 262
    new-instance p1, Lj0/b;

    const/16 p2, 0x10

    new-array p2, p2, [Ls/i;

    invoke-direct {p1, p2}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 263
    iput-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lac/k;->g:I

    .line 239
    new-array p1, p1, [B

    invoke-direct {p0, p1, v0}, Lac/k;-><init>([BI)V

    return-void
.end method

.method public synthetic constructor <init>(IC)V
    .locals 0

    .line 264
    iput p1, p0, Lac/k;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lff/e;I)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lac/k;->g:I

    .line 244
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 245
    iput-object p1, p0, Lac/k;->j:Ljava/lang/Object;

    .line 246
    iput p2, p0, Lac/k;->h:I

    .line 247
    iget-object p1, p1, Lff/e;->c:Ljava/nio/ByteBuffer;

    .line 248
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 249
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 250
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object p2

    check-cast p2, Ljava/nio/ByteBuffer;

    .line 251
    iput-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg8/b;IILv4/e0;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lac/k;->g:I

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p3, :cond_1

    mul-int/lit8 v0, p3, 0x2

    add-int/2addr v0, p2

    .line 271
    invoke-virtual {p1, p2, v0}, Lg8/b;->n(II)Lg8/b;

    move-result-object p1

    .line 272
    iput-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 273
    iput p3, p0, Lac/k;->h:I

    .line 274
    iput-object p4, p0, Lac/k;->j:Ljava/lang/Object;

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p3, :cond_0

    mul-int/lit8 v0, p2, 0x2

    .line 275
    invoke-virtual {p1, v0}, Lg8/b;->g(I)I

    move-result v0

    .line 276
    :try_start_0
    invoke-virtual {p4, v0}, Lv4/e0;->l(I)Lv4/a;

    move-result-object v0

    check-cast v0, Lv4/d0;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 277
    const-string p2, "bogus class cpi"

    invoke-static {p2, p1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1

    :cond_0
    return-void

    .line 278
    :cond_1
    const-string p1, "size < 0"

    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(Ljava/io/File;ILjava/io/File;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lac/k;->g:I

    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 280
    iput-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 281
    iput p2, p0, Lac/k;->h:I

    .line 282
    iput-object p3, p0, Lac/k;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;ILandroid/view/MotionEvent;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lac/k;->g:I

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 253
    iput-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 254
    iput p2, p0, Lac/k;->h:I

    .line 255
    iput-object p3, p0, Lac/k;->j:Ljava/lang/Object;

    .line 256
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string p1, "changes cannot be empty"

    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(Lk5/u;Lk5/z;I)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lac/k;->g:I

    .line 265
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 266
    iput-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 267
    iput-object p2, p0, Lac/k;->j:Ljava/lang/Object;

    .line 268
    iput p3, p0, Lac/k;->h:I

    return-void
.end method

.method public constructor <init>(Llg/d;Lr/h;)V
    .locals 12

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    iput v0, p0, Lac/k;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object p2, p2, Lr/h;->a:Lac/k;

    .line 9
    .line 10
    iget v0, p1, Llg/b;->g:I

    .line 11
    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "negative nearestRange.first"

    .line 16
    .line 17
    invoke-static {v1}, Lo/b;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget p1, p1, Llg/b;->h:I

    .line 21
    .line 22
    iget v1, p2, Lac/k;->h:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, -0x1

    .line 25
    .line 26
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-ge p1, v0, :cond_1

    .line 31
    .line 32
    sget-object p1, Lf/o0;->a:Lf/b0;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    new-array p2, p1, [Ljava/lang/Object;

    .line 41
    .line 42
    iput-object p2, p0, Lac/k;->j:Ljava/lang/Object;

    .line 43
    .line 44
    iput p1, p0, Lac/k;->h:I

    .line 45
    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :cond_1
    sub-int v1, p1, v0

    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    new-array v2, v1, [Ljava/lang/Object;

    .line 53
    .line 54
    iput-object v2, p0, Lac/k;->j:Ljava/lang/Object;

    .line 55
    .line 56
    iput v0, p0, Lac/k;->h:I

    .line 57
    .line 58
    new-instance v2, Lf/b0;

    .line 59
    .line 60
    invoke-direct {v2, v1}, Lf/b0;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p2, Lac/k;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lj0/b;

    .line 66
    .line 67
    const-string v3, ", size "

    .line 68
    .line 69
    const-string v4, "Index "

    .line 70
    .line 71
    if-ltz v0, :cond_2

    .line 72
    .line 73
    iget v5, p2, Lac/k;->h:I

    .line 74
    .line 75
    if-ge v0, v5, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-static {v0, v4, v3}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    iget v6, p2, Lac/k;->h:I

    .line 83
    .line 84
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-static {v5}, Lo/b;->e(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    if-ltz p1, :cond_3

    .line 95
    .line 96
    iget v5, p2, Lac/k;->h:I

    .line 97
    .line 98
    if-ge p1, v5, :cond_3

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    invoke-static {p1, v4, v3}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iget p2, p2, Lac/k;->h:I

    .line 106
    .line 107
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-static {p2}, Lo/b;->e(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :goto_2
    if-lt p1, v0, :cond_4

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v3, "toIndex ("

    .line 123
    .line 124
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v3, ") should be not smaller than fromIndex ("

    .line 131
    .line 132
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const/16 v3, 0x29

    .line 139
    .line 140
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-static {p2}, Lo/b;->a(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :goto_3
    invoke-static {v0, v1}, Ls/o;->e(ILj0/b;)I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    iget-object v3, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 155
    .line 156
    aget-object v3, v3, p2

    .line 157
    .line 158
    check-cast v3, Ls/i;

    .line 159
    .line 160
    iget v3, v3, Ls/i;->a:I

    .line 161
    .line 162
    :goto_4
    if-gt v3, p1, :cond_8

    .line 163
    .line 164
    iget-object v4, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 165
    .line 166
    aget-object v4, v4, p2

    .line 167
    .line 168
    check-cast v4, Ls/i;

    .line 169
    .line 170
    iget-object v5, v4, Ls/i;->c:Lb5/c;

    .line 171
    .line 172
    iget-object v5, v5, Lb5/c;->a:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v5, Lfg/l;

    .line 175
    .line 176
    iget v6, v4, Ls/i;->a:I

    .line 177
    .line 178
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    iget v8, v4, Ls/i;->b:I

    .line 183
    .line 184
    add-int/2addr v8, v6

    .line 185
    add-int/lit8 v8, v8, -0x1

    .line 186
    .line 187
    invoke-static {p1, v8}, Ljava/lang/Math;->min(II)I

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    if-gt v7, v8, :cond_7

    .line 192
    .line 193
    :goto_5
    if-eqz v5, :cond_5

    .line 194
    .line 195
    sub-int v9, v7, v6

    .line 196
    .line 197
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-interface {v5, v9}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    if-nez v9, :cond_6

    .line 206
    .line 207
    :cond_5
    new-instance v9, Ls/g;

    .line 208
    .line 209
    invoke-direct {v9, v7}, Ls/g;-><init>(I)V

    .line 210
    .line 211
    .line 212
    :cond_6
    invoke-virtual {v2, v7, v9}, Lf/b0;->g(ILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget-object v10, p0, Lac/k;->j:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v10, [Ljava/lang/Object;

    .line 218
    .line 219
    iget v11, p0, Lac/k;->h:I

    .line 220
    .line 221
    sub-int v11, v7, v11

    .line 222
    .line 223
    aput-object v9, v10, v11

    .line 224
    .line 225
    if-eq v7, v8, :cond_7

    .line 226
    .line 227
    add-int/lit8 v7, v7, 0x1

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_7
    iget v4, v4, Ls/i;->b:I

    .line 231
    .line 232
    add-int/2addr v3, v4

    .line 233
    add-int/lit8 p2, p2, 0x1

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_8
    iput-object v2, p0, Lac/k;->i:Ljava/lang/Object;

    .line 237
    .line 238
    :goto_6
    return-void
.end method

.method public constructor <init>(Ly1/l2;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lac/k;->g:I

    .line 269
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lac/k;->g:I

    .line 240
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 241
    iput-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 242
    iput-object p1, p0, Lac/k;->j:Ljava/lang/Object;

    .line 243
    iput p2, p0, Lac/k;->h:I

    return-void
.end method

.method public static synthetic A(Lac/k;IIIIIIZZZI)V
    .locals 12

    .line 1
    and-int/lit8 v0, p10, 0x20

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    move v7, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move/from16 v7, p6

    .line 9
    .line 10
    :goto_0
    const/4 v11, -0x1

    .line 11
    move-object v1, p0

    .line 12
    move v2, p1

    .line 13
    move v3, p2

    .line 14
    move v4, p3

    .line 15
    move/from16 v5, p4

    .line 16
    .line 17
    move/from16 v6, p5

    .line 18
    .line 19
    move/from16 v8, p7

    .line 20
    .line 21
    move/from16 v9, p8

    .line 22
    .line 23
    move/from16 v10, p9

    .line 24
    .line 25
    invoke-virtual/range {v1 .. v11}, Lac/k;->z(IIIIIIZZZI)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static f([III)I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    move v1, p1

    .line 3
    :goto_0
    sub-int v2, v1, v0

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    if-le v2, v3, :cond_1

    .line 7
    .line 8
    add-int v2, v1, v0

    .line 9
    .line 10
    div-int/lit8 v2, v2, 0x2

    .line 11
    .line 12
    aget v3, p0, v2

    .line 13
    .line 14
    if-ge v3, p2, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    if-ne v1, p1, :cond_2

    .line 21
    .line 22
    not-int p0, p1

    .line 23
    return p0

    .line 24
    :cond_2
    aget p0, p0, v1

    .line 25
    .line 26
    if-ne p0, p2, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    not-int p0, v1

    .line 30
    return p0
.end method

.method public static x(Ljava/lang/String;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

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
    if-ge v1, v0, :cond_4

    .line 8
    .line 9
    add-int/lit8 v3, v1, 0x1

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/16 v5, 0x80

    .line 16
    .line 17
    if-ge v4, v5, :cond_0

    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    :goto_1
    move v1, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 v5, 0x800

    .line 24
    .line 25
    if-ge v4, v5, :cond_1

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const v5, 0xd800

    .line 31
    .line 32
    .line 33
    if-lt v4, v5, :cond_3

    .line 34
    .line 35
    const v5, 0xdfff

    .line 36
    .line 37
    .line 38
    if-le v4, v5, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    add-int/lit8 v1, v1, 0x2

    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    return v2
.end method


# virtual methods
.method public B(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    iget v1, p0, Lac/k;->h:I

    .line 6
    .line 7
    add-int/2addr v1, p1

    .line 8
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    return-void
.end method

.method public C([B)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    if-lez v0, :cond_0

    .line 3
    .line 4
    iget-object v1, p0, Lac/k;->j:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, [B

    .line 7
    .line 8
    iget v2, p0, Lac/k;->h:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lac/k;->h:I

    .line 15
    .line 16
    add-int/2addr p1, v0

    .line 17
    iput p1, p0, Lac/k;->h:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public D(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    iget v1, p0, Lac/k;->h:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0x1

    .line 8
    .line 9
    iput v2, p0, Lac/k;->h:I

    .line 10
    .line 11
    int-to-byte v3, p1

    .line 12
    aput-byte v3, v0, v1

    .line 13
    .line 14
    add-int/lit8 v3, v1, 0x2

    .line 15
    .line 16
    iput v3, p0, Lac/k;->h:I

    .line 17
    .line 18
    shr-int/lit8 v4, p1, 0x8

    .line 19
    .line 20
    int-to-byte v4, v4

    .line 21
    aput-byte v4, v0, v2

    .line 22
    .line 23
    add-int/lit8 v2, v1, 0x3

    .line 24
    .line 25
    iput v2, p0, Lac/k;->h:I

    .line 26
    .line 27
    shr-int/lit8 v4, p1, 0x10

    .line 28
    .line 29
    int-to-byte v4, v4

    .line 30
    aput-byte v4, v0, v3

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x4

    .line 33
    .line 34
    iput v1, p0, Lac/k;->h:I

    .line 35
    .line 36
    shr-int/lit8 p1, p1, 0x18

    .line 37
    .line 38
    int-to-byte p1, p1

    .line 39
    aput-byte p1, v0, v2

    .line 40
    .line 41
    return-void
.end method

.method public E(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    int-to-byte v2, p2

    .line 8
    aput-byte v2, v0, p1

    .line 9
    .line 10
    add-int/lit8 v2, p1, 0x2

    .line 11
    .line 12
    shr-int/lit8 v3, p2, 0x8

    .line 13
    .line 14
    int-to-byte v3, v3

    .line 15
    aput-byte v3, v0, v1

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x3

    .line 18
    .line 19
    shr-int/lit8 v1, p2, 0x10

    .line 20
    .line 21
    int-to-byte v1, v1

    .line 22
    aput-byte v1, v0, v2

    .line 23
    .line 24
    shr-int/lit8 p2, p2, 0x18

    .line 25
    .line 26
    int-to-byte p2, p2

    .line 27
    aput-byte p2, v0, p1

    .line 28
    .line 29
    return-void
.end method

.method public F(IJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    long-to-int v2, p2

    .line 8
    int-to-byte v2, v2

    .line 9
    aput-byte v2, v0, p1

    .line 10
    .line 11
    add-int/lit8 v2, p1, 0x2

    .line 12
    .line 13
    const/16 v3, 0x8

    .line 14
    .line 15
    shr-long v3, p2, v3

    .line 16
    .line 17
    long-to-int v3, v3

    .line 18
    int-to-byte v3, v3

    .line 19
    aput-byte v3, v0, v1

    .line 20
    .line 21
    add-int/lit8 v1, p1, 0x3

    .line 22
    .line 23
    const/16 v3, 0x10

    .line 24
    .line 25
    shr-long v3, p2, v3

    .line 26
    .line 27
    long-to-int v3, v3

    .line 28
    int-to-byte v3, v3

    .line 29
    aput-byte v3, v0, v2

    .line 30
    .line 31
    add-int/lit8 v2, p1, 0x4

    .line 32
    .line 33
    const/16 v3, 0x18

    .line 34
    .line 35
    shr-long v3, p2, v3

    .line 36
    .line 37
    long-to-int v3, v3

    .line 38
    int-to-byte v3, v3

    .line 39
    aput-byte v3, v0, v1

    .line 40
    .line 41
    add-int/lit8 v1, p1, 0x5

    .line 42
    .line 43
    const/16 v3, 0x20

    .line 44
    .line 45
    shr-long v3, p2, v3

    .line 46
    .line 47
    long-to-int v3, v3

    .line 48
    int-to-byte v3, v3

    .line 49
    aput-byte v3, v0, v2

    .line 50
    .line 51
    add-int/lit8 v2, p1, 0x6

    .line 52
    .line 53
    const/16 v3, 0x28

    .line 54
    .line 55
    shr-long v3, p2, v3

    .line 56
    .line 57
    long-to-int v3, v3

    .line 58
    int-to-byte v3, v3

    .line 59
    aput-byte v3, v0, v1

    .line 60
    .line 61
    add-int/lit8 p1, p1, 0x7

    .line 62
    .line 63
    const/16 v1, 0x30

    .line 64
    .line 65
    shr-long v3, p2, v1

    .line 66
    .line 67
    long-to-int v1, v3

    .line 68
    int-to-byte v1, v1

    .line 69
    aput-byte v1, v0, v2

    .line 70
    .line 71
    const/16 v1, 0x38

    .line 72
    .line 73
    shr-long/2addr p2, v1

    .line 74
    long-to-int p2, p2

    .line 75
    int-to-byte p2, p2

    .line 76
    aput-byte p2, v0, p1

    .line 77
    .line 78
    return-void
.end method

.method public G(Ljava/lang/String;)V
    .locals 9

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_5

    .line 8
    .line 9
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, [B

    .line 12
    .line 13
    iget v1, p0, Lac/k;->h:I

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ge v3, v2, :cond_4

    .line 21
    .line 22
    add-int/lit8 v4, v3, 0x1

    .line 23
    .line 24
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/16 v6, 0x80

    .line 29
    .line 30
    if-ge v5, v6, :cond_0

    .line 31
    .line 32
    add-int/lit8 v3, v1, 0x1

    .line 33
    .line 34
    int-to-byte v5, v5

    .line 35
    aput-byte v5, v0, v1

    .line 36
    .line 37
    move v1, v3

    .line 38
    :goto_1
    move v3, v4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/16 v7, 0x800

    .line 41
    .line 42
    if-ge v5, v7, :cond_1

    .line 43
    .line 44
    add-int/lit8 v3, v1, 0x1

    .line 45
    .line 46
    ushr-int/lit8 v7, v5, 0x6

    .line 47
    .line 48
    or-int/lit16 v7, v7, 0xc0

    .line 49
    .line 50
    int-to-byte v7, v7

    .line 51
    aput-byte v7, v0, v1

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x2

    .line 54
    .line 55
    and-int/lit8 v5, v5, 0x3f

    .line 56
    .line 57
    or-int/2addr v5, v6

    .line 58
    int-to-byte v5, v5

    .line 59
    aput-byte v5, v0, v3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const v7, 0xd800

    .line 63
    .line 64
    .line 65
    if-lt v5, v7, :cond_3

    .line 66
    .line 67
    const v7, 0xdfff

    .line 68
    .line 69
    .line 70
    if-le v5, v7, :cond_2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    add-int/lit8 v3, v3, 0x2

    .line 74
    .line 75
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    shl-int/lit8 v5, v5, 0xa

    .line 80
    .line 81
    add-int/2addr v5, v4

    .line 82
    const v4, -0x35fdc00

    .line 83
    .line 84
    .line 85
    add-int/2addr v5, v4

    .line 86
    add-int/lit8 v4, v1, 0x1

    .line 87
    .line 88
    ushr-int/lit8 v7, v5, 0x12

    .line 89
    .line 90
    or-int/lit16 v7, v7, 0xf0

    .line 91
    .line 92
    int-to-byte v7, v7

    .line 93
    aput-byte v7, v0, v1

    .line 94
    .line 95
    add-int/lit8 v7, v1, 0x2

    .line 96
    .line 97
    ushr-int/lit8 v8, v5, 0xc

    .line 98
    .line 99
    and-int/lit8 v8, v8, 0x3f

    .line 100
    .line 101
    or-int/2addr v8, v6

    .line 102
    int-to-byte v8, v8

    .line 103
    aput-byte v8, v0, v4

    .line 104
    .line 105
    add-int/lit8 v4, v1, 0x3

    .line 106
    .line 107
    ushr-int/lit8 v8, v5, 0x6

    .line 108
    .line 109
    and-int/lit8 v8, v8, 0x3f

    .line 110
    .line 111
    or-int/2addr v8, v6

    .line 112
    int-to-byte v8, v8

    .line 113
    aput-byte v8, v0, v7

    .line 114
    .line 115
    add-int/lit8 v1, v1, 0x4

    .line 116
    .line 117
    and-int/lit8 v5, v5, 0x3f

    .line 118
    .line 119
    or-int/2addr v5, v6

    .line 120
    int-to-byte v5, v5

    .line 121
    aput-byte v5, v0, v4

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_3
    :goto_2
    add-int/lit8 v3, v1, 0x1

    .line 125
    .line 126
    ushr-int/lit8 v7, v5, 0xc

    .line 127
    .line 128
    or-int/lit16 v7, v7, 0xe0

    .line 129
    .line 130
    int-to-byte v7, v7

    .line 131
    aput-byte v7, v0, v1

    .line 132
    .line 133
    add-int/lit8 v7, v1, 0x2

    .line 134
    .line 135
    ushr-int/lit8 v8, v5, 0x6

    .line 136
    .line 137
    and-int/lit8 v8, v8, 0x3f

    .line 138
    .line 139
    or-int/2addr v8, v6

    .line 140
    int-to-byte v8, v8

    .line 141
    aput-byte v8, v0, v3

    .line 142
    .line 143
    add-int/lit8 v1, v1, 0x3

    .line 144
    .line 145
    and-int/lit8 v3, v5, 0x3f

    .line 146
    .line 147
    or-int/2addr v3, v6

    .line 148
    int-to-byte v3, v3

    .line 149
    aput-byte v3, v0, v7

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_4
    iput v1, p0, Lac/k;->h:I

    .line 153
    .line 154
    :cond_5
    return-void
.end method

.method public H()V
    .locals 1

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public I()I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, -0x1

    .line 3
    move v2, v1

    .line 4
    move v1, v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lac/k;->K()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    and-int/lit8 v4, v3, 0x7f

    .line 10
    .line 11
    mul-int/lit8 v5, v1, 0x7

    .line 12
    .line 13
    shl-int/2addr v4, v5

    .line 14
    or-int/2addr v0, v4

    .line 15
    shl-int/lit8 v2, v2, 0x7

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    const/16 v4, 0x80

    .line 20
    .line 21
    and-int/2addr v3, v4

    .line 22
    if-ne v3, v4, :cond_1

    .line 23
    .line 24
    const/4 v5, 0x5

    .line 25
    if-lt v1, v5, :cond_0

    .line 26
    .line 27
    :cond_1
    if-eq v3, v4, :cond_3

    .line 28
    .line 29
    shr-int/lit8 v1, v2, 0x1

    .line 30
    .line 31
    and-int/2addr v1, v0

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    or-int/2addr v0, v2

    .line 35
    :cond_2
    return v0

    .line 36
    :cond_3
    new-instance v0, Laf/d;

    .line 37
    .line 38
    const-string v1, "Invalid LEB128 sequence"

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0
.end method

.method public J()Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-array v1, v0, [I

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-ge v3, v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lac/k;->L()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    aput v4, v1, v3

    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    :goto_1
    if-ge v2, v0, :cond_2

    .line 35
    .line 36
    aget v4, v1, v2

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Lac/k;->y(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    return-object v3
.end method

.method public K()I
    .locals 1

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    and-int/lit16 v0, v0, 0xff

    .line 10
    .line 11
    return v0
.end method

.method public L()I
    .locals 2

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, 0xffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v1

    .line 13
    return v0
.end method

.method public M(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, p1

    .line 10
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    return-void
.end method

.method public N(IZ)V
    .locals 8

    .line 1
    const v0, 0x1ffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget-object v1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [J

    .line 8
    .line 9
    iget v2, p0, Lac/k;->h:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    array-length v4, v1

    .line 13
    add-int/lit8 v4, v4, -0x2

    .line 14
    .line 15
    if-ge v3, v4, :cond_1

    .line 16
    .line 17
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    add-int/lit8 v4, v3, 0x2

    .line 20
    .line 21
    aget-wide v5, v1, v4

    .line 22
    .line 23
    long-to-int v7, v5

    .line 24
    and-int/2addr v7, v0

    .line 25
    if-ne v7, p1, :cond_0

    .line 26
    .line 27
    const-wide v2, 0x6fffffffffffffffL    # 3.1050361846014175E231

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v2, v5

    .line 33
    int-to-long p1, p2

    .line 34
    const-wide/high16 v5, 0x1000000000000000L

    .line 35
    .line 36
    mul-long/2addr v5, p1

    .line 37
    or-long/2addr v2, v5

    .line 38
    const-wide/high16 v5, -0x8000000000000000L

    .line 39
    .line 40
    mul-long/2addr p1, v5

    .line 41
    or-long/2addr p1, v2

    .line 42
    aput-wide p1, v1, v4

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    add-int/lit8 v3, v3, 0x3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public O(IIJ)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lac/k;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [J

    .line 6
    .line 7
    iget-object v2, v0, Lac/k;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, [J

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-wide p3, v2, v3

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    :cond_0
    if-lez v3, :cond_4

    .line 16
    .line 17
    add-int/lit8 v3, v3, -0x1

    .line 18
    .line 19
    aget-wide v4, v2, v3

    .line 20
    .line 21
    long-to-int v6, v4

    .line 22
    const v7, 0x1ffffff

    .line 23
    .line 24
    .line 25
    and-int/2addr v6, v7

    .line 26
    const/16 v8, 0x19

    .line 27
    .line 28
    shr-long v9, v4, v8

    .line 29
    .line 30
    long-to-int v9, v9

    .line 31
    and-int/2addr v9, v7

    .line 32
    const/16 v10, 0x32

    .line 33
    .line 34
    shr-long/2addr v4, v10

    .line 35
    long-to-int v4, v4

    .line 36
    const/16 v5, 0x3ff

    .line 37
    .line 38
    and-int/2addr v4, v5

    .line 39
    if-ne v4, v5, :cond_1

    .line 40
    .line 41
    iget v4, v0, Lac/k;->h:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    mul-int/lit8 v4, v4, 0x3

    .line 45
    .line 46
    add-int/2addr v4, v9

    .line 47
    :goto_0
    if-ltz v9, :cond_4

    .line 48
    .line 49
    :goto_1
    array-length v11, v1

    .line 50
    add-int/lit8 v11, v11, -0x2

    .line 51
    .line 52
    if-ge v9, v11, :cond_0

    .line 53
    .line 54
    if-ge v9, v4, :cond_0

    .line 55
    .line 56
    add-int/lit8 v11, v9, 0x2

    .line 57
    .line 58
    aget-wide v12, v1, v11

    .line 59
    .line 60
    shr-long v14, v12, v8

    .line 61
    .line 62
    long-to-int v14, v14

    .line 63
    and-int/2addr v14, v7

    .line 64
    if-ne v14, v6, :cond_2

    .line 65
    .line 66
    aget-wide v14, v1, v9

    .line 67
    .line 68
    add-int/lit8 v16, v9, 0x1

    .line 69
    .line 70
    move/from16 p3, v7

    .line 71
    .line 72
    move/from16 p4, v8

    .line 73
    .line 74
    aget-wide v7, v1, v16

    .line 75
    .line 76
    const/16 v17, 0x20

    .line 77
    .line 78
    move/from16 v18, v10

    .line 79
    .line 80
    move/from16 v19, v11

    .line 81
    .line 82
    shr-long v10, v14, v17

    .line 83
    .line 84
    long-to-int v10, v10

    .line 85
    add-int v10, v10, p1

    .line 86
    .line 87
    long-to-int v11, v14

    .line 88
    add-int v11, v11, p2

    .line 89
    .line 90
    int-to-long v14, v10

    .line 91
    shl-long v14, v14, v17

    .line 92
    .line 93
    int-to-long v10, v11

    .line 94
    const-wide v20, 0xffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    and-long v10, v10, v20

    .line 100
    .line 101
    or-long/2addr v10, v14

    .line 102
    aput-wide v10, v1, v9

    .line 103
    .line 104
    shr-long v10, v7, v17

    .line 105
    .line 106
    long-to-int v10, v10

    .line 107
    add-int v10, v10, p1

    .line 108
    .line 109
    long-to-int v7, v7

    .line 110
    add-int v7, v7, p2

    .line 111
    .line 112
    int-to-long v10, v10

    .line 113
    shl-long v10, v10, v17

    .line 114
    .line 115
    int-to-long v7, v7

    .line 116
    and-long v7, v7, v20

    .line 117
    .line 118
    or-long/2addr v7, v10

    .line 119
    aput-wide v7, v1, v16

    .line 120
    .line 121
    const/16 v7, 0x3f

    .line 122
    .line 123
    shr-long v7, v12, v7

    .line 124
    .line 125
    const-wide/16 v10, 0x1

    .line 126
    .line 127
    and-long/2addr v7, v10

    .line 128
    const/16 v10, 0x3c

    .line 129
    .line 130
    shl-long/2addr v7, v10

    .line 131
    or-long/2addr v7, v12

    .line 132
    aput-wide v7, v1, v19

    .line 133
    .line 134
    shr-long v7, v12, v18

    .line 135
    .line 136
    long-to-int v7, v7

    .line 137
    and-int/2addr v7, v5

    .line 138
    if-lez v7, :cond_3

    .line 139
    .line 140
    add-int/lit8 v7, v3, 0x1

    .line 141
    .line 142
    add-int/lit8 v8, v9, 0x3

    .line 143
    .line 144
    sget-wide v10, Lg2/a;->b:J

    .line 145
    .line 146
    and-long/2addr v10, v12

    .line 147
    and-int v8, v8, p3

    .line 148
    .line 149
    int-to-long v12, v8

    .line 150
    shl-long v12, v12, p4

    .line 151
    .line 152
    or-long/2addr v10, v12

    .line 153
    aput-wide v10, v2, v3

    .line 154
    .line 155
    move v3, v7

    .line 156
    goto :goto_2

    .line 157
    :cond_2
    move/from16 p3, v7

    .line 158
    .line 159
    move/from16 p4, v8

    .line 160
    .line 161
    move/from16 v18, v10

    .line 162
    .line 163
    :cond_3
    :goto_2
    add-int/lit8 v9, v9, 0x3

    .line 164
    .line 165
    move/from16 v7, p3

    .line 166
    .line 167
    move/from16 v8, p4

    .line 168
    .line 169
    move/from16 v10, v18

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_4
    return-void
.end method

.method public P(ILfg/r;)V
    .locals 6

    .line 1
    const v0, 0x1ffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget-object v1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [J

    .line 8
    .line 9
    iget v2, p0, Lac/k;->h:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    array-length v4, v1

    .line 13
    add-int/lit8 v4, v4, -0x2

    .line 14
    .line 15
    if-ge v3, v4, :cond_1

    .line 16
    .line 17
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    add-int/lit8 v4, v3, 0x2

    .line 20
    .line 21
    aget-wide v4, v1, v4

    .line 22
    .line 23
    long-to-int v4, v4

    .line 24
    and-int/2addr v4, v0

    .line 25
    if-ne v4, p1, :cond_0

    .line 26
    .line 27
    aget-wide v4, v1, v3

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    aget-wide v0, v1, v3

    .line 32
    .line 33
    const/16 p1, 0x20

    .line 34
    .line 35
    shr-long v2, v4, p1

    .line 36
    .line 37
    long-to-int v2, v2

    .line 38
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    long-to-int v3, v4

    .line 43
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    shr-long v4, v0, p1

    .line 48
    .line 49
    long-to-int p1, v4

    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    long-to-int v0, v0

    .line 55
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {p2, v2, v3, p1, v0}, Lfg/r;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    add-int/lit8 v3, v3, 0x3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    return-void
.end method

.method public a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    return-void
.end method

.method public b(ILb5/c;)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "size should be >=0"

    .line 5
    .line 6
    invoke-static {v0}, Lo/b;->a(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance v0, Ls/i;

    .line 13
    .line 14
    iget v1, p0, Lac/k;->h:I

    .line 15
    .line 16
    invoke-direct {v0, v1, p1, p2}, Ls/i;-><init>(IILb5/c;)V

    .line 17
    .line 18
    .line 19
    iget p2, p0, Lac/k;->h:I

    .line 20
    .line 21
    add-int/2addr p2, p1

    .line 22
    iput p2, p0, Lac/k;->h:I

    .line 23
    .line 24
    iget-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lj0/b;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public c(II)V
    .locals 6

    .line 1
    iget v0, p0, Lac/k;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-object v2, p0, Lac/k;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, [I

    .line 9
    .line 10
    add-int/lit8 v3, v0, -0x1

    .line 11
    .line 12
    aget v3, v2, v3

    .line 13
    .line 14
    if-gt p1, v3, :cond_3

    .line 15
    .line 16
    invoke-static {v2, v0, p1}, Lac/k;->f([III)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-ltz v0, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lac/k;->j:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, [I

    .line 25
    .line 26
    aput p2, p1, v0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    not-int v0, v0

    .line 30
    iget v2, p0, Lac/k;->h:I

    .line 31
    .line 32
    iget-object v3, p0, Lac/k;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, [I

    .line 35
    .line 36
    array-length v4, v3

    .line 37
    if-lt v2, v4, :cond_1

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    array-length v3, v3

    .line 42
    mul-int/lit8 v3, v3, 0x2

    .line 43
    .line 44
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    new-array v3, v2, [I

    .line 49
    .line 50
    new-array v2, v2, [I

    .line 51
    .line 52
    iget-object v4, p0, Lac/k;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, [I

    .line 55
    .line 56
    array-length v5, v4

    .line 57
    invoke-static {v4, v1, v3, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    iget-object v4, p0, Lac/k;->j:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, [I

    .line 63
    .line 64
    array-length v5, v4

    .line 65
    invoke-static {v4, v1, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 66
    .line 67
    .line 68
    iput-object v3, p0, Lac/k;->i:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v2, p0, Lac/k;->j:Ljava/lang/Object;

    .line 71
    .line 72
    :cond_1
    iget v1, p0, Lac/k;->h:I

    .line 73
    .line 74
    sub-int/2addr v1, v0

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    iget-object v2, p0, Lac/k;->i:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, [I

    .line 80
    .line 81
    add-int/lit8 v3, v0, 0x1

    .line 82
    .line 83
    invoke-static {v2, v0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lac/k;->j:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, [I

    .line 89
    .line 90
    iget v2, p0, Lac/k;->h:I

    .line 91
    .line 92
    sub-int/2addr v2, v0

    .line 93
    invoke-static {v1, v0, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 94
    .line 95
    .line 96
    :cond_2
    iget-object v1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, [I

    .line 99
    .line 100
    aput p1, v1, v0

    .line 101
    .line 102
    iget-object p1, p0, Lac/k;->j:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, [I

    .line 105
    .line 106
    aput p2, p1, v0

    .line 107
    .line 108
    iget p1, p0, Lac/k;->h:I

    .line 109
    .line 110
    add-int/lit8 p1, p1, 0x1

    .line 111
    .line 112
    iput p1, p0, Lac/k;->h:I

    .line 113
    .line 114
    return-void

    .line 115
    :cond_3
    iget-object v2, p0, Lac/k;->i:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, [I

    .line 118
    .line 119
    array-length v3, v2

    .line 120
    if-lt v0, v3, :cond_4

    .line 121
    .line 122
    add-int/lit8 v3, v0, 0x1

    .line 123
    .line 124
    array-length v2, v2

    .line 125
    mul-int/lit8 v2, v2, 0x2

    .line 126
    .line 127
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    new-array v3, v2, [I

    .line 132
    .line 133
    new-array v2, v2, [I

    .line 134
    .line 135
    iget-object v4, p0, Lac/k;->i:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v4, [I

    .line 138
    .line 139
    array-length v5, v4

    .line 140
    invoke-static {v4, v1, v3, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 141
    .line 142
    .line 143
    iget-object v4, p0, Lac/k;->j:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, [I

    .line 146
    .line 147
    array-length v5, v4

    .line 148
    invoke-static {v4, v1, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 149
    .line 150
    .line 151
    iput-object v3, p0, Lac/k;->i:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v2, p0, Lac/k;->j:Ljava/lang/Object;

    .line 154
    .line 155
    :cond_4
    iget-object v1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, [I

    .line 158
    .line 159
    aput p1, v1, v0

    .line 160
    .line 161
    iget-object p1, p0, Lac/k;->j:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p1, [I

    .line 164
    .line 165
    aput p2, p1, v0

    .line 166
    .line 167
    add-int/lit8 v0, v0, 0x1

    .line 168
    .line 169
    iput v0, p0, Lac/k;->h:I

    .line 170
    .line 171
    return-void
.end method

.method public d(Lw4/c;)Lw4/e;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "unsupported"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public e()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public g()Lac/k;
    .locals 3

    .line 1
    new-instance v0, Lac/k;

    .line 2
    .line 3
    iget v1, p0, Lac/k;->h:I

    .line 4
    .line 5
    iget-object v2, p0, Lac/k;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lff/e;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lac/k;-><init>(Lff/e;I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getType(I)Lw4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg8/b;

    .line 4
    .line 5
    mul-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lg8/b;->g(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lv4/e0;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lv4/e0;->l(I)Lv4/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lv4/d0;

    .line 20
    .line 21
    iget-object p1, p1, Lv4/d0;->g:Lw4/c;

    .line 22
    .line 23
    return-object p1
.end method

.method public declared-synchronized h([BII)Ljava/lang/String;
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, [C

    .line 5
    .line 6
    const/16 v1, 0x800

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x100

    .line 11
    .line 12
    if-gt p3, v0, :cond_0

    .line 13
    .line 14
    new-array v0, v0, [C

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-array v0, v1, [C

    .line 18
    .line 19
    :goto_0
    iput-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    array-length v2, v0

    .line 23
    if-ge v2, p3, :cond_2

    .line 24
    .line 25
    new-array v0, v1, [C

    .line 26
    .line 27
    iput-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_2
    :goto_1
    add-int/2addr p3, p2

    .line 30
    const/4 v1, 0x0

    .line 31
    move v2, v1

    .line 32
    :goto_2
    if-ge p2, p3, :cond_b

    .line 33
    .line 34
    add-int/lit8 v3, p2, 0x1

    .line 35
    .line 36
    aget-byte v4, p1, p2

    .line 37
    .line 38
    if-lez v4, :cond_3

    .line 39
    .line 40
    add-int/lit8 p2, v2, 0x1

    .line 41
    .line 42
    int-to-char v4, v4

    .line 43
    aput-char v4, v0, v2

    .line 44
    .line 45
    move v2, p2

    .line 46
    move p2, v3

    .line 47
    goto :goto_2

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_3
    const/16 v5, -0x20

    .line 52
    .line 53
    const/16 v6, -0x41

    .line 54
    .line 55
    if-ge v4, v5, :cond_5

    .line 56
    .line 57
    add-int/lit8 p2, p2, 0x2

    .line 58
    .line 59
    aget-byte v3, p1, v3

    .line 60
    .line 61
    const/16 v5, -0x3e

    .line 62
    .line 63
    if-lt v4, v5, :cond_4

    .line 64
    .line 65
    if-gt v3, v6, :cond_4

    .line 66
    .line 67
    add-int/lit8 v5, v2, 0x1

    .line 68
    .line 69
    and-int/lit8 v4, v4, 0x1f

    .line 70
    .line 71
    shl-int/lit8 v4, v4, 0x6

    .line 72
    .line 73
    and-int/lit8 v3, v3, 0x3f

    .line 74
    .line 75
    or-int/2addr v3, v4

    .line 76
    int-to-char v3, v3

    .line 77
    aput-char v3, v0, v2

    .line 78
    .line 79
    :goto_3
    move v2, v5

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 82
    .line 83
    const-string p2, "Invalid String"

    .line 84
    .line 85
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_5
    const/16 v7, -0x10

    .line 90
    .line 91
    if-ge v4, v7, :cond_9

    .line 92
    .line 93
    add-int/lit8 v7, p2, 0x2

    .line 94
    .line 95
    aget-byte v3, p1, v3

    .line 96
    .line 97
    add-int/lit8 p2, p2, 0x3

    .line 98
    .line 99
    aget-byte v7, p1, v7

    .line 100
    .line 101
    const/16 v8, -0x60

    .line 102
    .line 103
    if-ne v4, v5, :cond_6

    .line 104
    .line 105
    if-lt v3, v8, :cond_8

    .line 106
    .line 107
    :cond_6
    const/16 v5, -0x13

    .line 108
    .line 109
    if-ne v4, v5, :cond_7

    .line 110
    .line 111
    if-ge v3, v8, :cond_8

    .line 112
    .line 113
    :cond_7
    if-gt v3, v6, :cond_8

    .line 114
    .line 115
    if-gt v7, v6, :cond_8

    .line 116
    .line 117
    add-int/lit8 v5, v2, 0x1

    .line 118
    .line 119
    and-int/lit8 v4, v4, 0xf

    .line 120
    .line 121
    shl-int/lit8 v4, v4, 0xc

    .line 122
    .line 123
    and-int/lit8 v3, v3, 0x3f

    .line 124
    .line 125
    shl-int/lit8 v3, v3, 0x6

    .line 126
    .line 127
    or-int/2addr v3, v4

    .line 128
    and-int/lit8 v4, v7, 0x3f

    .line 129
    .line 130
    or-int/2addr v3, v4

    .line 131
    int-to-char v3, v3

    .line 132
    aput-char v3, v0, v2

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 136
    .line 137
    const-string p2, "Invalid String"

    .line 138
    .line 139
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :cond_9
    add-int/lit8 v5, p2, 0x2

    .line 144
    .line 145
    aget-byte v3, p1, v3

    .line 146
    .line 147
    add-int/lit8 v7, p2, 0x3

    .line 148
    .line 149
    aget-byte v5, p1, v5

    .line 150
    .line 151
    add-int/lit8 p2, p2, 0x4

    .line 152
    .line 153
    aget-byte v7, p1, v7

    .line 154
    .line 155
    if-gt v3, v6, :cond_a

    .line 156
    .line 157
    shl-int/lit8 v8, v4, 0x1c

    .line 158
    .line 159
    add-int/lit8 v9, v3, 0x70

    .line 160
    .line 161
    add-int/2addr v9, v8

    .line 162
    shr-int/lit8 v8, v9, 0x1e

    .line 163
    .line 164
    if-nez v8, :cond_a

    .line 165
    .line 166
    if-gt v5, v6, :cond_a

    .line 167
    .line 168
    if-gt v7, v6, :cond_a

    .line 169
    .line 170
    and-int/lit8 v4, v4, 0x7

    .line 171
    .line 172
    shl-int/lit8 v4, v4, 0x12

    .line 173
    .line 174
    and-int/lit8 v3, v3, 0x3f

    .line 175
    .line 176
    shl-int/lit8 v3, v3, 0xc

    .line 177
    .line 178
    or-int/2addr v3, v4

    .line 179
    and-int/lit8 v4, v5, 0x3f

    .line 180
    .line 181
    shl-int/lit8 v4, v4, 0x6

    .line 182
    .line 183
    or-int/2addr v3, v4

    .line 184
    and-int/lit8 v4, v7, 0x3f

    .line 185
    .line 186
    or-int/2addr v3, v4

    .line 187
    add-int/lit8 v4, v2, 0x1

    .line 188
    .line 189
    ushr-int/lit8 v5, v3, 0xa

    .line 190
    .line 191
    const v6, 0xd7c0

    .line 192
    .line 193
    .line 194
    add-int/2addr v5, v6

    .line 195
    int-to-char v5, v5

    .line 196
    aput-char v5, v0, v2

    .line 197
    .line 198
    add-int/lit8 v2, v2, 0x2

    .line 199
    .line 200
    and-int/lit16 v3, v3, 0x3ff

    .line 201
    .line 202
    const v5, 0xdc00

    .line 203
    .line 204
    .line 205
    add-int/2addr v3, v5

    .line 206
    int-to-char v3, v3

    .line 207
    aput-char v3, v0, v4

    .line 208
    .line 209
    goto/16 :goto_2

    .line 210
    .line 211
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 212
    .line 213
    const-string p2, "Invalid String"

    .line 214
    .line 215
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw p1

    .line 219
    :cond_b
    if-gt p2, p3, :cond_c

    .line 220
    .line 221
    new-instance p1, Ljava/lang/String;

    .line 222
    .line 223
    invoke-direct {p1, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 224
    .line 225
    .line 226
    monitor-exit p0

    .line 227
    return-object p1

    .line 228
    :cond_c
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 229
    .line 230
    const-string p2, "Invalid String"

    .line 231
    .line 232
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p1

    .line 236
    :goto_4
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 237
    throw p1
.end method

.method public i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/File;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void
.end method

.method public j(Ljf/d;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lff/e;

    .line 4
    .line 5
    iget-object v0, v0, Lff/e;->d:Ljf/e;

    .line 6
    .line 7
    iget v0, v0, Ljf/e;->e:I

    .line 8
    .line 9
    mul-int/lit8 p2, p2, 0x8

    .line 10
    .line 11
    add-int/2addr p2, v0

    .line 12
    invoke-virtual {p0, p2}, Lac/k;->a(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lac/k;->L()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p0}, Lac/k;->L()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {p0, v0}, Lac/k;->y(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p1, Ljf/d;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lac/k;->v(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p1, Ljf/d;->d:Ljava/lang/String;

    .line 42
    .line 43
    return p2
.end method

.method public k(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    iget v1, p0, Lac/k;->h:I

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lac/k;->f([III)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-gez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, -0x1

    .line 14
    return p1

    .line 15
    :cond_0
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, [I

    .line 18
    .line 19
    aget p1, v0, p1

    .line 20
    .line 21
    return p1
.end method

.method public l(I)Ls/i;
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lac/k;->h:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "Index "

    .line 9
    .line 10
    const-string v1, ", size "

    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p0, Lac/k;->h:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lo/b;->e(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ls/i;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget v1, v0, Ls/i;->a:I

    .line 35
    .line 36
    iget v2, v0, Ls/i;->b:I

    .line 37
    .line 38
    add-int/2addr v2, v1

    .line 39
    if-ge p1, v2, :cond_1

    .line 40
    .line 41
    if-gt v1, p1, :cond_1

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lj0/b;

    .line 47
    .line 48
    invoke-static {p1, v0}, Ls/o;->e(ILj0/b;)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iget-object v0, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 53
    .line 54
    aget-object p1, v0, p1

    .line 55
    .line 56
    check-cast p1, Ls/i;

    .line 57
    .line 58
    iput-object p1, p0, Lac/k;->j:Ljava/lang/Object;

    .line 59
    .line 60
    return-object p1
.end method

.method public m(II)J
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-gtz p2, :cond_0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    shr-int/lit8 v2, p2, 0x3

    .line 7
    .line 8
    and-int/lit8 p2, p2, 0x7

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    move v5, p1

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v5}, Lac/k;->r(I)J

    .line 16
    .line 17
    .line 18
    move-result-wide v6

    .line 19
    xor-long/2addr v0, v6

    .line 20
    add-int/lit8 v5, v5, 0x8

    .line 21
    .line 22
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    shl-int/lit8 p2, p2, 0x3

    .line 26
    .line 27
    :goto_1
    if-ge v3, p2, :cond_2

    .line 28
    .line 29
    iget-object v2, p0, Lac/k;->j:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, [B

    .line 32
    .line 33
    add-int/lit8 v4, v5, 0x1

    .line 34
    .line 35
    aget-byte v2, v2, v5

    .line 36
    .line 37
    int-to-long v5, v2

    .line 38
    const-wide/16 v7, 0xff

    .line 39
    .line 40
    and-long/2addr v5, v7

    .line 41
    shl-long/2addr v5, v3

    .line 42
    xor-long/2addr v0, v5

    .line 43
    add-int/lit8 v3, v3, 0x8

    .line 44
    .line 45
    move v5, v4

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    and-int/lit8 p1, p1, 0x7

    .line 48
    .line 49
    shl-int/lit8 p1, p1, 0x3

    .line 50
    .line 51
    shl-long v2, v0, p1

    .line 52
    .line 53
    rsub-int/lit8 p1, p1, 0x40

    .line 54
    .line 55
    ushr-long p1, v0, p1

    .line 56
    .line 57
    or-long/2addr p1, v2

    .line 58
    return-wide p1
.end method

.method public n()Lo5/j;
    .locals 6

    .line 1
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk5/z;

    .line 4
    .line 5
    iget-object v1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lk5/u;

    .line 8
    .line 9
    iget-object v2, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 10
    .line 11
    iget v3, p0, Lac/k;->h:I

    .line 12
    .line 13
    add-int/lit8 v3, v3, 0x8

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Landroidx/lifecycle/x;->J(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, -0x1

    .line 20
    sget-object v4, Lo5/i;->g:Lo5/i;

    .line 21
    .line 22
    if-eq v2, v3, :cond_4

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v3, ": Invalid debug offset"

    .line 28
    .line 29
    if-gez v2, :cond_1

    .line 30
    .line 31
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 32
    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v4

    .line 52
    :cond_1
    iget-object v5, v1, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 53
    .line 54
    iget-object v5, v5, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, [B

    .line 57
    .line 58
    array-length v5, v5

    .line 59
    if-lt v2, v5, :cond_2

    .line 60
    .line 61
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 62
    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v4

    .line 82
    :cond_2
    if-nez v2, :cond_3

    .line 83
    .line 84
    return-object v4

    .line 85
    :cond_3
    new-instance v0, Lo5/h;

    .line 86
    .line 87
    invoke-direct {v0, v1, v2, p0}, Lo5/h;-><init>(Lk5/u;ILac/k;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_4
    :goto_0
    return-object v4
.end method

.method public o(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf/b0;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lf/b0;->d(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lf/b0;->c:[I

    .line 12
    .line 13
    aget p1, v0, p1

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, -0x1

    .line 17
    return p1
.end method

.method public p()Lk5/b0;
    .locals 3

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk5/u;

    .line 4
    .line 5
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iget v1, p0, Lac/k;->h:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0xc

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroidx/lifecycle/x;->N(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/lit8 v1, v1, 0x10

    .line 16
    .line 17
    mul-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    add-int/2addr v0, v1

    .line 20
    new-instance v2, Lk5/b0;

    .line 21
    .line 22
    invoke-direct {v2, p0, v1, v0}, Lk5/b0;-><init>(Lac/k;II)V

    .line 23
    .line 24
    .line 25
    return-object v2
.end method

.method public q()I
    .locals 5

    .line 1
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    iget v1, p0, Lac/k;->h:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0x1

    .line 8
    .line 9
    iput v2, p0, Lac/k;->h:I

    .line 10
    .line 11
    aget-byte v3, v0, v1

    .line 12
    .line 13
    and-int/lit16 v3, v3, 0xff

    .line 14
    .line 15
    add-int/lit8 v4, v1, 0x2

    .line 16
    .line 17
    iput v4, p0, Lac/k;->h:I

    .line 18
    .line 19
    aget-byte v2, v0, v2

    .line 20
    .line 21
    and-int/lit16 v2, v2, 0xff

    .line 22
    .line 23
    shl-int/lit8 v2, v2, 0x8

    .line 24
    .line 25
    or-int/2addr v2, v3

    .line 26
    add-int/lit8 v3, v1, 0x3

    .line 27
    .line 28
    iput v3, p0, Lac/k;->h:I

    .line 29
    .line 30
    aget-byte v4, v0, v4

    .line 31
    .line 32
    and-int/lit16 v4, v4, 0xff

    .line 33
    .line 34
    shl-int/lit8 v4, v4, 0x10

    .line 35
    .line 36
    or-int/2addr v2, v4

    .line 37
    add-int/lit8 v1, v1, 0x4

    .line 38
    .line 39
    iput v1, p0, Lac/k;->h:I

    .line 40
    .line 41
    aget-byte v0, v0, v3

    .line 42
    .line 43
    shl-int/lit8 v0, v0, 0x18

    .line 44
    .line 45
    or-int/2addr v0, v2

    .line 46
    return v0
.end method

.method public r(I)J
    .locals 9

    .line 1
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    aget-byte v2, v0, p1

    .line 8
    .line 9
    int-to-long v2, v2

    .line 10
    const-wide/16 v4, 0xff

    .line 11
    .line 12
    and-long/2addr v2, v4

    .line 13
    add-int/lit8 v6, p1, 0x2

    .line 14
    .line 15
    aget-byte v1, v0, v1

    .line 16
    .line 17
    int-to-long v7, v1

    .line 18
    and-long/2addr v7, v4

    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    shl-long/2addr v7, v1

    .line 22
    or-long v1, v2, v7

    .line 23
    .line 24
    add-int/lit8 v3, p1, 0x3

    .line 25
    .line 26
    aget-byte v6, v0, v6

    .line 27
    .line 28
    int-to-long v6, v6

    .line 29
    and-long/2addr v6, v4

    .line 30
    const/16 v8, 0x10

    .line 31
    .line 32
    shl-long/2addr v6, v8

    .line 33
    or-long/2addr v1, v6

    .line 34
    add-int/lit8 v6, p1, 0x4

    .line 35
    .line 36
    aget-byte v3, v0, v3

    .line 37
    .line 38
    int-to-long v7, v3

    .line 39
    and-long/2addr v7, v4

    .line 40
    const/16 v3, 0x18

    .line 41
    .line 42
    shl-long/2addr v7, v3

    .line 43
    or-long/2addr v1, v7

    .line 44
    add-int/lit8 v3, p1, 0x5

    .line 45
    .line 46
    aget-byte v6, v0, v6

    .line 47
    .line 48
    int-to-long v6, v6

    .line 49
    and-long/2addr v6, v4

    .line 50
    const/16 v8, 0x20

    .line 51
    .line 52
    shl-long/2addr v6, v8

    .line 53
    or-long/2addr v1, v6

    .line 54
    add-int/lit8 v6, p1, 0x6

    .line 55
    .line 56
    aget-byte v3, v0, v3

    .line 57
    .line 58
    int-to-long v7, v3

    .line 59
    and-long/2addr v7, v4

    .line 60
    const/16 v3, 0x28

    .line 61
    .line 62
    shl-long/2addr v7, v3

    .line 63
    or-long/2addr v1, v7

    .line 64
    add-int/lit8 p1, p1, 0x7

    .line 65
    .line 66
    aget-byte v3, v0, v6

    .line 67
    .line 68
    int-to-long v6, v3

    .line 69
    and-long v3, v6, v4

    .line 70
    .line 71
    const/16 v5, 0x30

    .line 72
    .line 73
    shl-long/2addr v3, v5

    .line 74
    or-long/2addr v1, v3

    .line 75
    aget-byte p1, v0, p1

    .line 76
    .line 77
    int-to-long v3, p1

    .line 78
    const/16 p1, 0x38

    .line 79
    .line 80
    shl-long/2addr v3, p1

    .line 81
    or-long v0, v1, v3

    .line 82
    .line 83
    return-wide v0
.end method

.method public s(I)Ljf/g;
    .locals 2

    .line 1
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lff/e;

    .line 4
    .line 5
    iget-object v0, v0, Lff/e;->d:Ljf/e;

    .line 6
    .line 7
    iget v0, v0, Ljf/e;->f:I

    .line 8
    .line 9
    mul-int/lit8 p1, p1, 0xc

    .line 10
    .line 11
    add-int/2addr p1, v0

    .line 12
    invoke-virtual {p0, p1}, Lac/k;->a(I)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x4

    .line 16
    invoke-virtual {p0, p1}, Lac/k;->M(I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    new-instance v1, Ljf/g;

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0, p1}, Lac/k;->a(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lac/k;->J()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    invoke-virtual {p0, v0}, Lac/k;->y(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {v1, p1, v0}, Ljf/g;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Lac/k;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public t()I
    .locals 2

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk5/u;

    .line 4
    .line 5
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iget v1, p0, Lac/k;->h:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->P(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lac/k;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v1, p0, Lac/k;->h:I

    .line 20
    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v3, "SectionReader{buf="

    .line 24
    .line 25
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, ", offset="

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, "}"

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public u()S
    .locals 4

    .line 1
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    iget v1, p0, Lac/k;->h:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0x1

    .line 8
    .line 9
    iput v2, p0, Lac/k;->h:I

    .line 10
    .line 11
    aget-byte v3, v0, v1

    .line 12
    .line 13
    and-int/lit16 v3, v3, 0xff

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x2

    .line 16
    .line 17
    iput v1, p0, Lac/k;->h:I

    .line 18
    .line 19
    aget-byte v0, v0, v2

    .line 20
    .line 21
    shl-int/lit8 v0, v0, 0x8

    .line 22
    .line 23
    or-int/2addr v0, v3

    .line 24
    int-to-short v0, v0

    .line 25
    return v0
.end method

.method public v(I)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return-object p1

    .line 6
    :cond_0
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lff/e;

    .line 9
    .line 10
    iget-object v0, v0, Lff/e;->d:Ljf/e;

    .line 11
    .line 12
    iget v0, v0, Ljf/e;->c:I

    .line 13
    .line 14
    mul-int/lit8 p1, p1, 0x4

    .line 15
    .line 16
    add-int/2addr p1, v0

    .line 17
    invoke-virtual {p0, p1}, Lac/k;->a(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p0, p1}, Lac/k;->a(I)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, La/a;->H0(Lac/k;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    new-array p1, p1, [C

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    move v1, v0

    .line 39
    :goto_0
    invoke-virtual {p0}, Lac/k;->K()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    and-int/lit16 v2, v2, 0xff

    .line 44
    .line 45
    int-to-char v2, v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    new-instance v2, Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {v2, p1, v0, v1}, Ljava/lang/String;-><init>([CII)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_1
    aput-char v2, p1, v1

    .line 55
    .line 56
    const/16 v3, 0x80

    .line 57
    .line 58
    if-ge v2, v3, :cond_2

    .line 59
    .line 60
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    and-int/lit16 v4, v2, 0xe0

    .line 64
    .line 65
    const/16 v5, 0xc0

    .line 66
    .line 67
    if-ne v4, v5, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Lac/k;->K()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    and-int/lit16 v5, v4, 0xc0

    .line 74
    .line 75
    if-ne v5, v3, :cond_3

    .line 76
    .line 77
    and-int/lit8 v2, v2, 0x1f

    .line 78
    .line 79
    shl-int/lit8 v2, v2, 0x6

    .line 80
    .line 81
    and-int/lit8 v3, v4, 0x3f

    .line 82
    .line 83
    or-int/2addr v2, v3

    .line 84
    int-to-char v2, v2

    .line 85
    aput-char v2, p1, v1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    new-instance p1, Laf/d;

    .line 89
    .line 90
    const-string v0, "Bad second byte"

    .line 91
    .line 92
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_4
    and-int/lit16 v4, v2, 0xf0

    .line 97
    .line 98
    const/16 v5, 0xe0

    .line 99
    .line 100
    if-ne v4, v5, :cond_6

    .line 101
    .line 102
    invoke-virtual {p0}, Lac/k;->K()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    invoke-virtual {p0}, Lac/k;->K()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    and-int/lit16 v6, v4, 0xc0

    .line 111
    .line 112
    if-ne v6, v3, :cond_5

    .line 113
    .line 114
    and-int/lit16 v6, v5, 0xc0

    .line 115
    .line 116
    if-ne v6, v3, :cond_5

    .line 117
    .line 118
    and-int/lit8 v2, v2, 0xf

    .line 119
    .line 120
    shl-int/lit8 v2, v2, 0xc

    .line 121
    .line 122
    and-int/lit8 v3, v4, 0x3f

    .line 123
    .line 124
    shl-int/lit8 v3, v3, 0x6

    .line 125
    .line 126
    or-int/2addr v2, v3

    .line 127
    and-int/lit8 v3, v5, 0x3f

    .line 128
    .line 129
    or-int/2addr v2, v3

    .line 130
    int-to-char v2, v2

    .line 131
    aput-char v2, p1, v1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_5
    new-instance p1, Laf/d;

    .line 135
    .line 136
    const-string v0, "Bad second or third byte"

    .line 137
    .line 138
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p1

    .line 142
    :cond_6
    new-instance p1, Laf/d;

    .line 143
    .line 144
    const-string v0, "Bad byte"

    .line 145
    .line 146
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1
.end method

.method public w(I)Ljava/lang/String;
    .locals 4

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    if-nez p1, :cond_1

    .line 6
    .line 7
    const-string p1, ""

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_1
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    const/16 v1, 0x800

    .line 15
    .line 16
    if-le p1, v1, :cond_2

    .line 17
    .line 18
    new-instance v1, Ljava/lang/String;

    .line 19
    .line 20
    iget v2, p0, Lac/k;->h:I

    .line 21
    .line 22
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 23
    .line 24
    invoke-direct {v1, v0, v2, p1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    iget v1, p0, Lac/k;->h:I

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1, p1}, Lac/k;->h([BII)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    iget v0, p0, Lac/k;->h:I

    .line 35
    .line 36
    add-int/2addr v0, p1

    .line 37
    iput v0, p0, Lac/k;->h:I

    .line 38
    .line 39
    return-object v1
.end method

.method public y(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return-object p1

    .line 6
    :cond_0
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lff/e;

    .line 9
    .line 10
    iget-object v0, v0, Lff/e;->d:Ljf/e;

    .line 11
    .line 12
    iget v0, v0, Ljf/e;->d:I

    .line 13
    .line 14
    mul-int/lit8 p1, p1, 0x4

    .line 15
    .line 16
    add-int/2addr p1, v0

    .line 17
    invoke-virtual {p0, p1}, Lac/k;->a(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lac/k;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p0, p1}, Lac/k;->v(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public z(IIIIIIZZZI)V
    .locals 10

    .line 1
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    iget v1, p0, Lac/k;->h:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0x3

    .line 8
    .line 9
    iput v2, p0, Lac/k;->h:I

    .line 10
    .line 11
    array-length v3, v0

    .line 12
    if-gt v3, v2, :cond_0

    .line 13
    .line 14
    mul-int/lit8 v3, v3, 0x2

    .line 15
    .line 16
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, [J

    .line 29
    .line 30
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lac/k;->j:Ljava/lang/Object;

    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lac/k;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, [J

    .line 39
    .line 40
    int-to-long v2, p2

    .line 41
    const/16 p2, 0x20

    .line 42
    .line 43
    shl-long/2addr v2, p2

    .line 44
    int-to-long v4, p3

    .line 45
    const-wide v6, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr v4, v6

    .line 51
    or-long/2addr v2, v4

    .line 52
    aput-wide v2, v0, v1

    .line 53
    .line 54
    add-int/lit8 p3, v1, 0x1

    .line 55
    .line 56
    int-to-long v2, p4

    .line 57
    shl-long/2addr v2, p2

    .line 58
    int-to-long v4, p5

    .line 59
    and-long/2addr v4, v6

    .line 60
    or-long/2addr v2, v4

    .line 61
    aput-wide v2, v0, p3

    .line 62
    .line 63
    add-int/lit8 p2, v1, 0x2

    .line 64
    .line 65
    move/from16 p3, p9

    .line 66
    .line 67
    int-to-long v2, p3

    .line 68
    const/16 p3, 0x3f

    .line 69
    .line 70
    shl-long/2addr v2, p3

    .line 71
    move/from16 p3, p8

    .line 72
    .line 73
    int-to-long v4, p3

    .line 74
    const/16 p3, 0x3e

    .line 75
    .line 76
    shl-long/2addr v4, p3

    .line 77
    or-long/2addr v2, v4

    .line 78
    move/from16 p3, p7

    .line 79
    .line 80
    int-to-long v4, p3

    .line 81
    const/16 p3, 0x3d

    .line 82
    .line 83
    shl-long/2addr v4, p3

    .line 84
    or-long/2addr v2, v4

    .line 85
    const/4 p3, 0x1

    .line 86
    int-to-long v4, p3

    .line 87
    const/16 p3, 0x3c

    .line 88
    .line 89
    shl-long/2addr v4, p3

    .line 90
    or-long/2addr v2, v4

    .line 91
    const/4 p3, 0x0

    .line 92
    const/16 v4, 0x3ff

    .line 93
    .line 94
    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    int-to-long v5, p3

    .line 99
    const/16 p3, 0x32

    .line 100
    .line 101
    shl-long/2addr v5, p3

    .line 102
    or-long/2addr v2, v5

    .line 103
    const v5, 0x1ffffff

    .line 104
    .line 105
    .line 106
    and-int v6, p6, v5

    .line 107
    .line 108
    int-to-long v7, v6

    .line 109
    const/16 v9, 0x19

    .line 110
    .line 111
    shl-long/2addr v7, v9

    .line 112
    or-long/2addr v2, v7

    .line 113
    and-int/2addr p1, v5

    .line 114
    int-to-long v7, p1

    .line 115
    or-long/2addr v2, v7

    .line 116
    aput-wide v2, v0, p2

    .line 117
    .line 118
    if-gez p6, :cond_1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    const/4 p1, -0x1

    .line 122
    move/from16 p2, p10

    .line 123
    .line 124
    if-eq p2, p1, :cond_2

    .line 125
    .line 126
    move p1, p2

    .line 127
    goto :goto_0

    .line 128
    :cond_2
    add-int/lit8 p1, v1, -0x3

    .line 129
    .line 130
    :goto_0
    if-ltz p1, :cond_4

    .line 131
    .line 132
    add-int/lit8 p2, p1, 0x2

    .line 133
    .line 134
    aget-wide v2, v0, p2

    .line 135
    .line 136
    long-to-int v7, v2

    .line 137
    and-int/2addr v7, v5

    .line 138
    if-ne v7, v6, :cond_3

    .line 139
    .line 140
    sub-int/2addr v1, p1

    .line 141
    div-int/lit8 v1, v1, 0x3

    .line 142
    .line 143
    sget-wide v5, Lg2/a;->a:J

    .line 144
    .line 145
    and-long/2addr v2, v5

    .line 146
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    int-to-long v4, p1

    .line 151
    shl-long/2addr v4, p3

    .line 152
    or-long v1, v2, v4

    .line 153
    .line 154
    aput-wide v1, v0, p2

    .line 155
    .line 156
    return-void

    .line 157
    :cond_3
    add-int/lit8 p1, p1, -0x3

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_4
    :goto_1
    return-void
.end method
