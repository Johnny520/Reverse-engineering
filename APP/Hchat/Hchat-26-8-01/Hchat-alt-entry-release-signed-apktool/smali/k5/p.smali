.class public final Lk5/p;
.super Lk5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lk5/u;


# direct methods
.method public synthetic constructor <init>(Lk5/u;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk5/p;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lk5/p;->h:Lk5/u;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(I)I
    .locals 3

    .line 1
    iget v0, p0, Lk5/p;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 7
    .line 8
    iget v1, v0, Lk5/u;->h:I

    .line 9
    .line 10
    if-ltz p1, :cond_0

    .line 11
    .line 12
    if-ge p1, v1, :cond_0

    .line 13
    .line 14
    iget v0, v0, Lk5/u;->i:I

    .line 15
    .line 16
    mul-int/lit8 p1, p1, 0xc

    .line 17
    .line 18
    :goto_0
    add-int/2addr p1, v0

    .line 19
    return p1

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v1, "Invalid proto index %d, not in [0, %d)"

    .line 35
    .line 36
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :pswitch_0
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 45
    .line 46
    iget v1, v0, Lk5/u;->l:I

    .line 47
    .line 48
    if-ltz p1, :cond_1

    .line 49
    .line 50
    if-ge p1, v1, :cond_1

    .line 51
    .line 52
    iget v0, v0, Lk5/u;->m:I

    .line 53
    .line 54
    :goto_1
    mul-int/lit8 p1, p1, 0x8

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 58
    .line 59
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v1, "Invalid method index %d, not in [0, %d)"

    .line 72
    .line 73
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :pswitch_1
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 82
    .line 83
    iget v1, v0, Lk5/u;->j:I

    .line 84
    .line 85
    if-ltz p1, :cond_2

    .line 86
    .line 87
    if-ge p1, v1, :cond_2

    .line 88
    .line 89
    iget v0, v0, Lk5/u;->k:I

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 93
    .line 94
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-string v1, "Invalid field index %d, not in [0, %d)"

    .line 107
    .line 108
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0

    .line 116
    :pswitch_2
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 117
    .line 118
    const/16 v1, 0x8

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lk5/u;->b(I)Lm5/b;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-ltz p1, :cond_3

    .line 125
    .line 126
    invoke-virtual {p0}, Lk5/p;->size()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-ge p1, v2, :cond_3

    .line 131
    .line 132
    iget-object v2, v0, Lm5/b;->a:Lk5/u;

    .line 133
    .line 134
    iget-object v2, v2, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 135
    .line 136
    iget v0, v0, Lm5/b;->b:I

    .line 137
    .line 138
    add-int/2addr v0, v1

    .line 139
    invoke-virtual {v2, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    mul-int/2addr p1, v1

    .line 144
    goto :goto_0

    .line 145
    :cond_3
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 146
    .line 147
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p0}, Lk5/p;->size()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    const-string v1, "Invalid method handle index %d, not in [0, %d)"

    .line 164
    .line 165
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v0

    .line 173
    :pswitch_3
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 174
    .line 175
    const/4 v1, 0x7

    .line 176
    invoke-virtual {v0, v1}, Lk5/u;->b(I)Lm5/b;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-ltz p1, :cond_4

    .line 181
    .line 182
    invoke-virtual {p0}, Lk5/p;->size()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-ge p1, v1, :cond_4

    .line 187
    .line 188
    iget-object v1, v0, Lm5/b;->a:Lk5/u;

    .line 189
    .line 190
    iget-object v1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 191
    .line 192
    iget v0, v0, Lm5/b;->b:I

    .line 193
    .line 194
    add-int/lit8 v0, v0, 0x8

    .line 195
    .line 196
    invoke-virtual {v1, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    mul-int/lit8 p1, p1, 0x4

    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 205
    .line 206
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p0}, Lk5/p;->size()I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    const-string v1, "Invalid callsite index %d, not in [0, %d)"

    .line 223
    .line 224
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v0

    .line 232
    :pswitch_4
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 233
    .line 234
    iget v1, v0, Lk5/u;->n:I

    .line 235
    .line 236
    if-ltz p1, :cond_5

    .line 237
    .line 238
    if-ge p1, v1, :cond_5

    .line 239
    .line 240
    iget v0, v0, Lk5/u;->o:I

    .line 241
    .line 242
    mul-int/lit8 p1, p1, 0x20

    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_5
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 247
    .line 248
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    const-string v1, "Invalid class index %d, not in [0, %d)"

    .line 261
    .line 262
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lk5/p;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ln5/d;

    .line 7
    .line 8
    iget-object v1, p0, Lk5/p;->h:Lk5/u;

    .line 9
    .line 10
    invoke-direct {v0, v1, p1}, Ln5/d;-><init>(Lk5/u;I)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Ln5/e;

    .line 15
    .line 16
    iget-object v1, p0, Lk5/p;->h:Lk5/u;

    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, Ln5/e;-><init>(Lk5/u;I)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, Ln5/b;

    .line 23
    .line 24
    iget-object v1, p0, Lk5/p;->h:Lk5/u;

    .line 25
    .line 26
    invoke-direct {v0, v1, p1}, Ln5/b;-><init>(Lk5/u;I)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_2
    new-instance v0, Ln5/c;

    .line 31
    .line 32
    iget-object v1, p0, Lk5/p;->h:Lk5/u;

    .line 33
    .line 34
    invoke-direct {v0, v1, p1}, Ln5/c;-><init>(Lk5/u;I)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_3
    new-instance v0, Ln5/a;

    .line 39
    .line 40
    iget-object v1, p0, Lk5/p;->h:Lk5/u;

    .line 41
    .line 42
    invoke-direct {v0, v1, p1}, Ln5/a;-><init>(Lk5/u;I)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_4
    new-instance v0, Lk5/o;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lk5/p;->b(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    iget-object v2, p0, Lk5/p;->h:Lk5/u;

    .line 53
    .line 54
    iget v3, v2, Lk5/u;->q:I

    .line 55
    .line 56
    if-nez v3, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object v4, v2, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 60
    .line 61
    add-int/lit8 v5, v3, 0x4

    .line 62
    .line 63
    mul-int/lit8 p1, p1, 0x4

    .line 64
    .line 65
    add-int/2addr p1, v5

    .line 66
    invoke-virtual {v4, p1}, Landroidx/lifecycle/x;->J(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_1

    .line 71
    .line 72
    :goto_0
    const/4 p1, 0x0

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    add-int/2addr p1, v3

    .line 75
    :goto_1
    invoke-direct {v0, v2, v1, p1}, Lk5/o;-><init>(Lk5/u;II)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 2

    .line 1
    iget v0, p0, Lk5/p;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 7
    .line 8
    iget v0, v0, Lk5/u;->h:I

    .line 9
    .line 10
    return v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 12
    .line 13
    iget v0, v0, Lk5/u;->l:I

    .line 14
    .line 15
    return v0

    .line 16
    :pswitch_1
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 17
    .line 18
    iget v0, v0, Lk5/u;->j:I

    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_2
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 22
    .line 23
    const/16 v1, 0x8

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lk5/u;->b(I)Lm5/b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v1, v0, Lm5/b;->a:Lk5/u;

    .line 34
    .line 35
    iget-object v1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 36
    .line 37
    iget v0, v0, Lm5/b;->b:I

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x4

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    :goto_0
    return v0

    .line 46
    :pswitch_3
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 47
    .line 48
    const/4 v1, 0x7

    .line 49
    invoke-virtual {v0, v1}, Lk5/u;->b(I)Lm5/b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    iget-object v1, v0, Lm5/b;->a:Lk5/u;

    .line 58
    .line 59
    iget-object v1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 60
    .line 61
    iget v0, v0, Lm5/b;->b:I

    .line 62
    .line 63
    add-int/lit8 v0, v0, 0x4

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    :goto_1
    return v0

    .line 70
    :pswitch_4
    iget-object v0, p0, Lk5/p;->h:Lk5/u;

    .line 71
    .line 72
    iget v0, v0, Lk5/u;->n:I

    .line 73
    .line 74
    return v0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
