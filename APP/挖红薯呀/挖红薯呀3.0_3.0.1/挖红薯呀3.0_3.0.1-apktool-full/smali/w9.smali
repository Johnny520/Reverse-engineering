.class public final synthetic Lw9;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw9;->d:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget p0, p0, Lw9;->d:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    sget-object v1, Lna1;->a:Lna1;

    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 10
    .line 11
    invoke-static {p1}, Lrn;->G0(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lna1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 17
    .line 18
    invoke-static {p1}, Lrn;->J(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_1
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 24
    .line 25
    invoke-static {p1}, Lrn;->o0(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lna1;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_2
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 31
    .line 32
    invoke-static {p1}, Lrn;->Y0(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lna1;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_3
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 38
    .line 39
    invoke-static {p1}, Lrn;->Z1(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_4
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 45
    .line 46
    invoke-static {p1}, Lrn;->g1(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_5
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 52
    .line 53
    invoke-static {p1}, Lrn;->D1(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :pswitch_6
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 59
    .line 60
    invoke-static {p1}, Lrn;->J0(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_7
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 66
    .line 67
    invoke-static {p1}, Lrn;->E(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :pswitch_8
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 73
    .line 74
    invoke-static {p1}, Lrn;->X1(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :pswitch_9
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 80
    .line 81
    invoke-static {p1}, Lrn;->s1(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_a
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    .line 87
    .line 88
    invoke-static {p1}, Lrn;->V0(Lorg/luckypray/dexkit/result/ClassData;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_b
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 98
    .line 99
    invoke-static {p1}, Lrn;->l1(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :pswitch_c
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    .line 105
    .line 106
    invoke-static {p1}, Lrn;->g0(Lorg/luckypray/dexkit/result/ClassData;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :pswitch_d
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 116
    .line 117
    invoke-static {p1}, Lrn;->i1(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :pswitch_e
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 123
    .line 124
    invoke-static {p1}, Lrn;->A(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :pswitch_f
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;

    .line 130
    .line 131
    invoke-static {p1}, Lrn;->F(Lorg/luckypray/dexkit/query/matchers/AnnotationElementMatcher;)Lna1;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :pswitch_10
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 137
    .line 138
    invoke-static {p1}, Lrn;->f(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :pswitch_11
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 144
    .line 145
    invoke-static {p1}, Lrn;->i0(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lna1;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :pswitch_12
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 151
    .line 152
    invoke-static {p1}, Lrn;->j(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    return-object p0

    .line 157
    :pswitch_13
    check-cast p1, Ljava/util/List;

    .line 158
    .line 159
    new-instance p0, Lkm;

    .line 160
    .line 161
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    check-cast v0, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    const/4 v1, 0x1

    .line 175
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    check-cast v1, Ljava/lang/Float;

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    new-instance v2, Lk6;

    .line 189
    .line 190
    const/4 v3, 0x3

    .line 191
    invoke-direct {v2, v3, p1}, Lk6;-><init>(ILjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {p0, v0, v1, v2}, Lkm;-><init>(IFLhw;)V

    .line 195
    .line 196
    .line 197
    return-object p0

    .line 198
    :pswitch_14
    check-cast p1, Lnk;

    .line 199
    .line 200
    instance-of p0, p1, Lrk;

    .line 201
    .line 202
    if-eqz p0, :cond_0

    .line 203
    .line 204
    check-cast p1, Lrk;

    .line 205
    .line 206
    goto :goto_0

    .line 207
    :cond_0
    const/4 p1, 0x0

    .line 208
    :goto_0
    return-object p1

    .line 209
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {p1}, Lmg;->q(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    return-object p0

    .line 220
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {p1}, Lmg;->v(Ljava/lang/String;)Z

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0

    .line 231
    :pswitch_17
    check-cast p1, Lh91;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance p0, Ljava/lang/ClassCastException;

    .line 237
    .line 238
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 239
    .line 240
    .line 241
    throw p0

    .line 242
    :pswitch_18
    check-cast p1, Lh91;

    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    new-instance p0, Ljava/lang/ClassCastException;

    .line 248
    .line 249
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 250
    .line 251
    .line 252
    throw p0

    .line 253
    :pswitch_19
    check-cast p1, Lf01;

    .line 254
    .line 255
    invoke-static {p1, v0}, Ld01;->a(Lf01;I)V

    .line 256
    .line 257
    .line 258
    return-object v1

    .line 259
    :pswitch_1a
    check-cast p1, Lfq0;

    .line 260
    .line 261
    sget-object p0, Lr4;->b:Lg41;

    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-static {p1, p0}, Lkl;->v(Lfq0;Lat0;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    check-cast p0, Landroid/content/Context;

    .line 271
    .line 272
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    const-string p1, "android.software.leanback"

    .line 277
    .line 278
    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    if-nez p0, :cond_1

    .line 283
    .line 284
    sget-object p0, Lkb;->a:Ljb;

    .line 285
    .line 286
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    sget-object p0, Ljb;->c:Lib;

    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_1
    sget-object p0, Lmb;->b:Llb;

    .line 293
    .line 294
    :goto_1
    return-object p0

    .line 295
    :pswitch_1b
    check-cast p1, Ld60;

    .line 296
    .line 297
    invoke-virtual {p1}, Ld60;->a()V

    .line 298
    .line 299
    .line 300
    return-object v1

    .line 301
    :pswitch_1c
    check-cast p1, Lvb0;

    .line 302
    .line 303
    sget-object p0, Lpf1;->b:Lez;

    .line 304
    .line 305
    invoke-virtual {p1}, Lvb0;->a()Li50;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-interface {v0}, Li50;->G()J

    .line 310
    .line 311
    .line 312
    move-result-wide v2

    .line 313
    const/16 v0, 0x20

    .line 314
    .line 315
    shr-long/2addr v2, v0

    .line 316
    long-to-int v0, v2

    .line 317
    int-to-float v0, v0

    .line 318
    invoke-virtual {p1, p0, v0}, Lvb0;->d(Lez;F)V

    .line 319
    .line 320
    .line 321
    sget-object p0, Lpf1;->a:Lez;

    .line 322
    .line 323
    const/4 v0, 0x0

    .line 324
    invoke-virtual {p1, p0, v0}, Lvb0;->d(Lez;F)V

    .line 325
    .line 326
    .line 327
    return-object v1

    .line 328
    nop

    .line 329
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
