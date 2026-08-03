.class public final synthetic Lb8/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb8/c;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 1
    iget v0, p0, Lb8/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx1/f0;

    .line 7
    .line 8
    check-cast p2, Lx1/f0;

    .line 9
    .line 10
    iget-object v0, p1, Lx1/f0;->M:Lx1/j0;

    .line 11
    .line 12
    iget-object v0, v0, Lx1/j0;->p:Lx1/v0;

    .line 13
    .line 14
    iget v0, v0, Lx1/v0;->K:F

    .line 15
    .line 16
    iget-object v1, p2, Lx1/f0;->M:Lx1/j0;

    .line 17
    .line 18
    iget-object v1, v1, Lx1/j0;->p:Lx1/v0;

    .line 19
    .line 20
    iget v1, v1, Lx1/v0;->K:F

    .line 21
    .line 22
    cmpg-float v2, v0, v1

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lx1/f0;->v()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p2}, Lx1/f0;->v()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-static {p1, p2}, Lgg/l;->c(II)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    :goto_0
    return p1

    .line 44
    :pswitch_0
    check-cast p1, Lr7/s;

    .line 45
    .line 46
    check-cast p2, Lr7/s;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lr7/s;->S(Lr7/s;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    iget p1, p1, Lk7/a;->g:I

    .line 55
    .line 56
    iget p2, p2, Lk7/a;->g:I

    .line 57
    .line 58
    invoke-static {p1, p2}, Ly7/a;->e(II)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    :cond_1
    return v0

    .line 63
    :pswitch_1
    check-cast p1, Lr/q;

    .line 64
    .line 65
    check-cast p2, Lr/q;

    .line 66
    .line 67
    iget p1, p1, Lr/q;->a:I

    .line 68
    .line 69
    iget p2, p2, Lr/q;->a:I

    .line 70
    .line 71
    invoke-static {p1, p2}, Lgg/l;->c(II)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    return p1

    .line 76
    :pswitch_2
    check-cast p1, Ls/d1;

    .line 77
    .line 78
    check-cast p2, Ls/d1;

    .line 79
    .line 80
    iget p2, p2, Ls/d1;->a:I

    .line 81
    .line 82
    iget p1, p1, Ls/d1;->a:I

    .line 83
    .line 84
    invoke-static {p2, p1}, Lgg/l;->c(II)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    return p1

    .line 89
    :pswitch_3
    check-cast p1, Landroid/speech/tts/Voice;

    .line 90
    .line 91
    check-cast p2, Landroid/speech/tts/Voice;

    .line 92
    .line 93
    sget-object v0, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/speech/tts/Voice;->getLocale()Ljava/util/Locale;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const/4 v2, 0x0

    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    move-object v1, v2

    .line 111
    :goto_1
    const-string v3, ""

    .line 112
    .line 113
    if-nez v1, :cond_3

    .line 114
    .line 115
    move-object v1, v3

    .line 116
    :cond_3
    invoke-virtual {p2}, Landroid/speech/tts/Voice;->getLocale()Ljava/util/Locale;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    if-eqz v4, :cond_4

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    :cond_4
    if-nez v2, :cond_5

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    move-object v3, v2

    .line 130
    :goto_2
    invoke-interface {v0, v1, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    invoke-virtual {p1}, Landroid/speech/tts/Voice;->getName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p2}, Landroid/speech/tts/Voice;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    :goto_3
    return v1

    .line 150
    :pswitch_4
    check-cast p1, Lnb/d;

    .line 151
    .line 152
    check-cast p2, Lnb/d;

    .line 153
    .line 154
    sget-object v0, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v1, p1, Lnb/d;->b:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v2, p2, Lnb/d;->b:Ljava/lang/String;

    .line 162
    .line 163
    invoke-interface {v0, v1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_7

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_7
    iget-object p1, p1, Lnb/d;->a:Ljava/lang/String;

    .line 171
    .line 172
    iget-object p2, p2, Lnb/d;->a:Ljava/lang/String;

    .line 173
    .line 174
    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    :goto_4
    return v1

    .line 179
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 180
    .line 181
    check-cast p2, Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    return p1

    .line 188
    :pswitch_6
    check-cast p1, Lae/h;

    .line 189
    .line 190
    check-cast p2, Lae/h;

    .line 191
    .line 192
    if-ne p1, p2, :cond_8

    .line 193
    .line 194
    const/4 p1, 0x0

    .line 195
    goto :goto_5

    .line 196
    :cond_8
    iget-object p1, p1, Lae/h;->j:Lae/h;

    .line 197
    .line 198
    if-ne p1, p2, :cond_9

    .line 199
    .line 200
    const/4 p1, 0x1

    .line 201
    goto :goto_5

    .line 202
    :cond_9
    const/4 p1, -0x1

    .line 203
    :goto_5
    return p1

    .line 204
    :pswitch_7
    check-cast p1, Llg/d;

    .line 205
    .line 206
    check-cast p2, Llg/d;

    .line 207
    .line 208
    iget v0, p1, Llg/b;->h:I

    .line 209
    .line 210
    iget p1, p1, Llg/b;->g:I

    .line 211
    .line 212
    sub-int/2addr v0, p1

    .line 213
    iget p1, p2, Llg/b;->h:I

    .line 214
    .line 215
    iget p2, p2, Llg/b;->g:I

    .line 216
    .line 217
    sub-int/2addr p1, p2

    .line 218
    sub-int/2addr v0, p1

    .line 219
    return v0

    .line 220
    :pswitch_8
    check-cast p1, Li0/n0;

    .line 221
    .line 222
    check-cast p2, Li0/n0;

    .line 223
    .line 224
    iget p1, p1, Li0/n0;->b:I

    .line 225
    .line 226
    iget p2, p2, Li0/n0;->b:I

    .line 227
    .line 228
    invoke-static {p1, p2}, Lgg/l;->c(II)I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    return p1

    .line 233
    :pswitch_9
    check-cast p1, [B

    .line 234
    .line 235
    check-cast p2, [B

    .line 236
    .line 237
    array-length v0, p1

    .line 238
    array-length v1, p2

    .line 239
    if-eq v0, v1, :cond_a

    .line 240
    .line 241
    array-length p1, p1

    .line 242
    array-length p2, p2

    .line 243
    sub-int/2addr p1, p2

    .line 244
    goto :goto_7

    .line 245
    :cond_a
    const/4 v0, 0x0

    .line 246
    move v1, v0

    .line 247
    :goto_6
    array-length v2, p1

    .line 248
    if-ge v1, v2, :cond_c

    .line 249
    .line 250
    aget-byte v2, p1, v1

    .line 251
    .line 252
    aget-byte v3, p2, v1

    .line 253
    .line 254
    if-eq v2, v3, :cond_b

    .line 255
    .line 256
    sub-int p1, v2, v3

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_b
    add-int/lit8 v1, v1, 0x1

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_c
    move p1, v0

    .line 263
    :goto_7
    return p1

    .line 264
    :pswitch_a
    check-cast p1, Ljava/util/Map$Entry;

    .line 265
    .line 266
    check-cast p2, Ljava/util/Map$Entry;

    .line 267
    .line 268
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    check-cast p1, Ld6/i;

    .line 273
    .line 274
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    check-cast p2, Ld6/i;

    .line 279
    .line 280
    sget-object v0, Ld6/i;->e:Ld6/e;

    .line 281
    .line 282
    invoke-virtual {v0, p1, p2}, Ld6/e;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    return p1

    .line 287
    :pswitch_b
    check-cast p1, Lb8/d;

    .line 288
    .line 289
    check-cast p2, Lb8/d;

    .line 290
    .line 291
    iget-object p1, p1, Lb8/d;->h:Ljava/lang/String;

    .line 292
    .line 293
    iget-object p2, p2, Lb8/d;->h:Ljava/lang/String;

    .line 294
    .line 295
    invoke-static {p1, p2}, Ly7/a;->c(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    return p1

    .line 300
    nop

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
