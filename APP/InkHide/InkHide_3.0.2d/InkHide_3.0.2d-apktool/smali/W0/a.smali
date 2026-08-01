.class public final LW0/a;
.super LD/h;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public e:Ljava/util/List;

.field public f:LD/h;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LW0/a;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final Y(LS/b;)I
    .locals 4

    .line 1
    iget v0, p0, LW0/a;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW0/a;->e:Ljava/util/List;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, LZ0/d;

    .line 35
    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    :goto_1
    invoke-virtual {v3, p1}, LZ0/d;->Y(LS/b;)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_2

    .line 43
    :cond_0
    new-instance v3, LZ0/d;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {v2}, LF0/k;->v0(Ljava/util/ArrayList;)[I

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1, v0}, LS/b;->d([I)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    goto :goto_3

    .line 66
    :cond_2
    move v0, v1

    .line 67
    :goto_3
    iget-object v2, p0, LW0/a;->f:LD/h;

    .line 68
    .line 69
    check-cast v2, La1/a;

    .line 70
    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    invoke-virtual {v2, p1}, La1/a;->Y(LS/b;)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    goto :goto_4

    .line 78
    :cond_3
    move v2, v1

    .line 79
    :goto_4
    const/4 v3, 0x2

    .line 80
    invoke-virtual {p1, v3}, LS/b;->j(I)V

    .line 81
    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    invoke-virtual {p1, v3, v2}, LS/b;->a(II)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v1, v0}, LS/b;->a(II)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, LS/b;->e()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p1, v0}, LS/b;->f(I)V

    .line 95
    .line 96
    .line 97
    return v0

    .line 98
    :pswitch_0
    iget-object v0, p0, LW0/a;->e:Ljava/util/List;

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    new-instance v2, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_4

    .line 121
    .line 122
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p1, v3}, LS/b;->c(Ljava/lang/CharSequence;)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_4
    invoke-static {v2}, LF0/k;->v0(Ljava/util/ArrayList;)[I

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {p1, v0}, LS/b;->d([I)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    goto :goto_6

    .line 149
    :cond_5
    move v0, v1

    .line 150
    :goto_6
    iget-object v2, p0, LW0/a;->f:LD/h;

    .line 151
    .line 152
    check-cast v2, LZ0/b;

    .line 153
    .line 154
    if-eqz v2, :cond_6

    .line 155
    .line 156
    invoke-virtual {v2, p1}, LZ0/b;->Z(LS/b;)I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    goto :goto_7

    .line 161
    :cond_6
    move v2, v1

    .line 162
    :goto_7
    const/4 v3, 0x7

    .line 163
    invoke-virtual {p1, v3}, LS/b;->j(I)V

    .line 164
    .line 165
    .line 166
    const/4 v3, 0x6

    .line 167
    invoke-virtual {p1, v3, v2}, LS/b;->a(II)V

    .line 168
    .line 169
    .line 170
    const/4 v2, 0x4

    .line 171
    invoke-virtual {p1, v2, v1}, LS/b;->a(II)V

    .line 172
    .line 173
    .line 174
    const/4 v2, 0x3

    .line 175
    invoke-virtual {p1, v2, v1}, LS/b;->a(II)V

    .line 176
    .line 177
    .line 178
    const/4 v2, 0x1

    .line 179
    invoke-virtual {p1, v2, v1}, LS/b;->a(II)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v1, v0}, LS/b;->a(II)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, LS/b;->e()I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-virtual {p1, v0}, LS/b;->f(I)V

    .line 190
    .line 191
    .line 192
    return v0

    .line 193
    :pswitch_1
    iget-object v0, p0, LW0/a;->e:Ljava/util/List;

    .line 194
    .line 195
    const/4 v1, 0x0

    .line 196
    if-eqz v0, :cond_8

    .line 197
    .line 198
    new-instance v2, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_7

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    check-cast v3, Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {p1, v3}, LS/b;->c(Ljava/lang/CharSequence;)I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_7
    invoke-static {v2}, LF0/k;->v0(Ljava/util/ArrayList;)[I

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {p1, v0}, LS/b;->d([I)I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    goto :goto_9

    .line 244
    :cond_8
    move v0, v1

    .line 245
    :goto_9
    iget-object v2, p0, LW0/a;->f:LD/h;

    .line 246
    .line 247
    check-cast v2, LZ0/a;

    .line 248
    .line 249
    if-eqz v2, :cond_9

    .line 250
    .line 251
    invoke-virtual {v2, p1}, LZ0/a;->Z(LS/b;)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    goto :goto_a

    .line 256
    :cond_9
    move v2, v1

    .line 257
    :goto_a
    const/4 v3, 0x6

    .line 258
    invoke-virtual {p1, v3}, LS/b;->j(I)V

    .line 259
    .line 260
    .line 261
    const/4 v3, 0x5

    .line 262
    invoke-virtual {p1, v3, v2}, LS/b;->a(II)V

    .line 263
    .line 264
    .line 265
    const/4 v2, 0x3

    .line 266
    invoke-virtual {p1, v2, v1}, LS/b;->a(II)V

    .line 267
    .line 268
    .line 269
    const/4 v2, 0x1

    .line 270
    invoke-virtual {p1, v2, v1}, LS/b;->a(II)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v1, v0}, LS/b;->a(II)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1}, LS/b;->e()I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    invoke-virtual {p1, v0}, LS/b;->f(I)V

    .line 281
    .line 282
    .line 283
    return v0

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public varargs Z([Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "searchPackages"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, LW0/a;->e:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method
