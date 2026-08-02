.class public final synthetic Ln31;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ln31;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget p0, p0, Ln31;->h:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p0, Len1;->b:Len1;

    .line 8
    .line 9
    invoke-virtual {p0}, Lv70;->d()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    sget-object p0, Ldn1;->d:Ldn1;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object p0, Ldn1;->f:Lhx2;

    .line 20
    .line 21
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/lang/reflect/Method;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_1
    sget-object p0, Lcn1;->b:Lcn1;

    .line 33
    .line 34
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_2
    sget-object p0, Lbn1;->d:Lbn1;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object p0, Lbn1;->f:Lhx2;

    .line 45
    .line 46
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Ljava/lang/Class;

    .line 51
    .line 52
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Ln4;->v()Lsg1;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Lzf1;->b()V

    .line 61
    .line 62
    .line 63
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    iput-object v0, p0, Lsg1;->C:Ljava/lang/Class;

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, Lsg1;->l:Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {p0}, Lsg1;->c()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Lzg1;

    .line 83
    .line 84
    iget-object p0, p0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_3
    sget-object p0, Lbn1;->d:Lbn1;

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object p0, Lbn1;->f:Lhx2;

    .line 93
    .line 94
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Ljava/lang/Class;

    .line 99
    .line 100
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ln4;->r()Lhi0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Lzf1;->b()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Ljava/lang/Class;

    .line 116
    .line 117
    iput-object p0, v0, Lhi0;->g:Ljava/lang/Class;

    .line 118
    .line 119
    invoke-virtual {v0}, Lhi0;->c()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, Lpi0;

    .line 128
    .line 129
    invoke-virtual {p0}, Lpi0;->g0()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_4
    sget-object p0, Lan1;->b:Lan1;

    .line 138
    .line 139
    invoke-virtual {p0}, Lv70;->d()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :pswitch_5
    sget-object p0, Lzm1;->d:Lzm1;

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    sget-object p0, Lzm1;->f:Lhx2;

    .line 150
    .line 151
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, Ljava/lang/reflect/Method;

    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0

    .line 162
    :pswitch_6
    sget-object p0, Lym1;->b:Lym1;

    .line 163
    .line 164
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :pswitch_7
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->a()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0

    .line 174
    :pswitch_8
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->d()Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    return-object p0

    .line 183
    :pswitch_9
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->g()Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    return-object p0

    .line 192
    :pswitch_a
    invoke-static {}, Lnuke/data/cipher/NativeCrypto;->f()Z

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :pswitch_b
    sget-object p0, Laj1;->b:Laj1;

    .line 202
    .line 203
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0

    .line 208
    :pswitch_c
    sget-object p0, Lbj1;->d:Lbj1;

    .line 209
    .line 210
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    sget-object p0, Lbj1;->g:Lhx2;

    .line 214
    .line 215
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    check-cast p0, Ljava/lang/reflect/Method;

    .line 220
    .line 221
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :pswitch_d
    sget-object p0, Lwi1;->b:Lwi1;

    .line 227
    .line 228
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    return-object p0

    .line 233
    :pswitch_e
    sget-object p0, Lxi1;->d:Lxi1;

    .line 234
    .line 235
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    sget-object p0, Lxi1;->g:Lhx2;

    .line 239
    .line 240
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    check-cast p0, Ljava/lang/reflect/Method;

    .line 245
    .line 246
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    return-object p0

    .line 251
    :pswitch_f
    sget-object p0, Lpg1;->b:Lpg1;

    .line 252
    .line 253
    invoke-virtual {p0}, Lv70;->d()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    return-object p0

    .line 258
    :pswitch_10
    sget-object p0, Lli1;->a:Lli1;

    .line 259
    .line 260
    return-object p0

    .line 261
    :pswitch_11
    sget-object p0, Lff1;->a:Ltu2;

    .line 262
    .line 263
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_12
    sget-object p0, Lo90;->a:Lc60;

    .line 267
    .line 268
    sget-object p0, Lt50;->j:Lt50;

    .line 269
    .line 270
    new-instance v1, Lsb;

    .line 271
    .line 272
    const/4 v2, 0x5

    .line 273
    const/4 v3, 0x2

    .line 274
    invoke-direct {v1, v3, v0, v2}, Lsb;-><init>(ILt00;I)V

    .line 275
    .line 276
    .line 277
    sget-object v0, Lfq0;->h:Lfq0;

    .line 278
    .line 279
    invoke-static {v0, p0, v1, v3}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 280
    .line 281
    .line 282
    sget-object p0, La83;->a:La83;

    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_13
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 286
    .line 287
    const-string v0, "CompositionLocal LocalSavedStateRegistryOwner not present"

    .line 288
    .line 289
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw p0

    .line 293
    :pswitch_14
    sget-object p0, Lec1;->a:Ltu2;

    .line 294
    .line 295
    sget-object p0, Lsn;->I:Lsn;

    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_15
    sget-object p0, Ldc1;->a:Lmy;

    .line 299
    .line 300
    return-object v0

    .line 301
    :pswitch_16
    sget-object p0, Lcc1;->a:Lmy;

    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_17
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 305
    .line 306
    const-string v0, "CompositionLocal LocalLifecycleOwner not present"

    .line 307
    .line 308
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw p0

    .line 312
    :pswitch_18
    sget-object p0, Lq91;->b:Lq91;

    .line 313
    .line 314
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    return-object p0

    .line 319
    :pswitch_19
    new-instance p0, Ld91;

    .line 320
    .line 321
    const/4 v0, 0x0

    .line 322
    invoke-direct {p0, v0, v0}, Ld91;-><init>(II)V

    .line 323
    .line 324
    .line 325
    return-object p0

    .line 326
    :pswitch_1a
    sget-object p0, Lc31;->b:Lb31;

    .line 327
    .line 328
    return-object p0

    .line 329
    :pswitch_1b
    sget-object p0, Lg41;->b:Lf41;

    .line 330
    .line 331
    return-object p0

    .line 332
    :pswitch_1c
    sget-object p0, Lx31;->b:Lg32;

    .line 333
    .line 334
    return-object p0

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
