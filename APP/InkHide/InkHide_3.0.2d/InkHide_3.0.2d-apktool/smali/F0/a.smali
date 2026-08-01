.class public final LF0/a;
.super LN0/h;
.source "SourceFile"

# interfaces
.implements LM0/l;
.implements LM0/a;
.implements LM0/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LF0/a;->a:I

    iput-object p2, p0, LF0/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LF0/a;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v4, p1

    .line 9
    .line 10
    check-cast v4, Ljava/lang/CharSequence;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const-string v2, "$this$$receiver"

    .line 21
    .line 22
    invoke-static {v4, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, LF0/a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v8, v2

    .line 28
    check-cast v8, Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    if-ne v2, v5, :cond_3

    .line 38
    .line 39
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    if-ne v2, v5, :cond_1

    .line 46
    .line 47
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/String;

    .line 52
    .line 53
    const/4 v5, 0x4

    .line 54
    invoke-static {v4, v2, v1, v3, v5}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-gez v1, :cond_0

    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v3, LE0/c;

    .line 67
    .line 68
    invoke-direct {v3, v1, v2}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_6

    .line 72
    .line 73
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 74
    .line 75
    const-string v2, "List has more than one element."

    .line 76
    .line 77
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :cond_2
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 82
    .line 83
    const-string v2, "List is empty."

    .line 84
    .line 85
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1

    .line 89
    :cond_3
    new-instance v2, LR0/c;

    .line 90
    .line 91
    if-gez v1, :cond_4

    .line 92
    .line 93
    move v1, v3

    .line 94
    :cond_4
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-direct {v2, v1, v3, v5}, LR0/a;-><init>(III)V

    .line 99
    .line 100
    .line 101
    instance-of v3, v4, Ljava/lang/String;

    .line 102
    .line 103
    const/4 v15, 0x0

    .line 104
    iget v2, v2, LR0/a;->b:I

    .line 105
    .line 106
    if-eqz v3, :cond_9

    .line 107
    .line 108
    if-le v1, v2, :cond_5

    .line 109
    .line 110
    goto/16 :goto_5

    .line 111
    .line 112
    :cond_5
    move v11, v1

    .line 113
    :goto_0
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_7

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    move-object v13, v3

    .line 128
    check-cast v13, Ljava/lang/String;

    .line 129
    .line 130
    move-object v14, v4

    .line 131
    check-cast v14, Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    const/4 v10, 0x0

    .line 138
    invoke-static/range {v10 .. v15}, LU0/q;->e0(IIILjava/lang/String;Ljava/lang/String;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_6

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_7
    move-object v3, v9

    .line 146
    :goto_1
    check-cast v3, Ljava/lang/String;

    .line 147
    .line 148
    if-eqz v3, :cond_8

    .line 149
    .line 150
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    new-instance v2, LE0/c;

    .line 155
    .line 156
    invoke-direct {v2, v1, v3}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    move-object v3, v2

    .line 160
    goto :goto_6

    .line 161
    :cond_8
    if-eq v11, v2, :cond_e

    .line 162
    .line 163
    add-int/lit8 v11, v11, 0x1

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_9
    if-le v1, v2, :cond_a

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_a
    move v5, v1

    .line 170
    :goto_2
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_c

    .line 179
    .line 180
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    move v3, v2

    .line 185
    move-object v2, v10

    .line 186
    check-cast v2, Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    move v7, v3

    .line 193
    const/4 v3, 0x0

    .line 194
    move v11, v7

    .line 195
    move v7, v15

    .line 196
    invoke-static/range {v2 .. v7}, LU0/i;->s0(Ljava/lang/String;ILjava/lang/CharSequence;IIZ)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_b

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_b
    move v2, v11

    .line 204
    goto :goto_3

    .line 205
    :cond_c
    move v11, v2

    .line 206
    move-object v10, v9

    .line 207
    :goto_4
    check-cast v10, Ljava/lang/String;

    .line 208
    .line 209
    if-eqz v10, :cond_d

    .line 210
    .line 211
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    new-instance v3, LE0/c;

    .line 216
    .line 217
    invoke-direct {v3, v1, v10}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_d
    if-eq v5, v11, :cond_e

    .line 222
    .line 223
    add-int/lit8 v5, v5, 0x1

    .line 224
    .line 225
    move v2, v11

    .line 226
    goto :goto_2

    .line 227
    :cond_e
    :goto_5
    move-object v3, v9

    .line 228
    :goto_6
    if-eqz v3, :cond_f

    .line 229
    .line 230
    iget-object v1, v3, LE0/c;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v1, Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    new-instance v9, LE0/c;

    .line 243
    .line 244
    iget-object v2, v3, LE0/c;->a:Ljava/lang/Object;

    .line 245
    .line 246
    invoke-direct {v9, v2, v1}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_f
    return-object v9

    .line 250
    :pswitch_0
    move-object/from16 v1, p1

    .line 251
    .line 252
    check-cast v1, Ljava/lang/CharSequence;

    .line 253
    .line 254
    move-object/from16 v2, p2

    .line 255
    .line 256
    check-cast v2, Ljava/lang/Number;

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    const-string v3, "$this$$receiver"

    .line 263
    .line 264
    invoke-static {v1, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    iget-object v3, v0, LF0/a;->b:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v3, [C

    .line 270
    .line 271
    const/4 v4, 0x0

    .line 272
    invoke-static {v1, v3, v2, v4}, LU0/i;->q0(Ljava/lang/CharSequence;[CIZ)I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-gez v1, :cond_10

    .line 277
    .line 278
    const/4 v1, 0x0

    .line 279
    goto :goto_7

    .line 280
    :cond_10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    const/4 v2, 0x1

    .line 285
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    new-instance v3, LE0/c;

    .line 290
    .line 291
    invoke-direct {v3, v1, v2}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    move-object v1, v3

    .line 295
    :goto_7
    return-object v1

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LF0/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "("

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LF0/a;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lf1/d;

    .line 16
    .line 17
    iget-object v2, v1, Lf1/d;->c:Ljava/util/ArrayList;

    .line 18
    .line 19
    sget-object v6, Lf1/c;->a:Lf1/c;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    const/16 v7, 0x1e

    .line 23
    .line 24
    const-string v3, ""

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static/range {v2 .. v7}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v2, ")"

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, v1, Lf1/d;->d:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v1}, Le1/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 53
    .line 54
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_1
    iget-object v0, p0, LF0/a;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lf1/b;

    .line 61
    .line 62
    iget-object v0, v0, Lf1/b;->c:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0}, Le1/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :pswitch_2
    new-instance v0, Lf1/d;

    .line 70
    .line 71
    iget-object v1, p0, LF0/a;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Lb1/j;

    .line 74
    .line 75
    iget-object v1, v1, Lb1/j;->c:Ljava/lang/String;

    .line 76
    .line 77
    invoke-direct {v0, v1}, Lf1/d;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_3
    new-instance v0, Lf1/b;

    .line 82
    .line 83
    iget-object v1, p0, LF0/a;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Lb1/f;

    .line 86
    .line 87
    iget-object v1, v1, Lb1/f;->c:Ljava/lang/String;

    .line 88
    .line 89
    invoke-direct {v0, v1}, Lf1/b;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_4
    new-instance v0, Lf1/a;

    .line 94
    .line 95
    iget-object v1, p0, LF0/a;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Lb1/d;

    .line 98
    .line 99
    iget-object v1, v1, Lb1/d;->c:Ljava/lang/String;

    .line 100
    .line 101
    invoke-direct {v0, v1}, Lf1/a;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_5
    iget-object v0, p0, LF0/a;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Landroidx/activity/g;

    .line 108
    .line 109
    invoke-static {v0}, Landroidx/lifecycle/G;->d(Landroidx/lifecycle/Q;)Landroidx/lifecycle/I;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0

    .line 114
    :pswitch_6
    iget-object v0, p0, LF0/a;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Ljava/lang/Throwable;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LF0/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LR0/c;

    .line 7
    .line 8
    const-string v0, "it"

    .line 9
    .line 10
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "<this>"

    .line 14
    .line 15
    iget-object v1, p0, LF0/a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget v0, p1, LR0/a;->b:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    iget p1, p1, LR0/a;->a:I

    .line 27
    .line 28
    invoke-virtual {v1, p1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :pswitch_0
    iget-object v0, p0, LF0/a;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, LF0/f;

    .line 40
    .line 41
    if-ne p1, v0, :cond_0

    .line 42
    .line 43
    const-string p1, "(this Collection)"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    return-object p1

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
