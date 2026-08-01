.class public final synthetic Lpn;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lpn;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILv80;)V
    .locals 0

    .line 1
    const/16 p1, 0x1b

    .line 2
    .line 3
    iput p1, p0, Lpn;->d:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget p0, p0, Lpn;->d:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object p0, Lna1;->a:Lna1;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p1, Luo0;

    .line 16
    .line 17
    invoke-static {p1}, Lzc0;->p(Luo0;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_1
    check-cast p1, Lbs0;

    .line 23
    .line 24
    sget-object p0, Lna1;->a:Lna1;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 28
    .line 29
    new-instance p0, Lc90;

    .line 30
    .line 31
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-direct {p0, v0, p1}, Lc90;-><init>(II)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_3
    check-cast p1, Lwq0;

    .line 57
    .line 58
    sget-object p0, Lna1;->a:Lna1;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_4
    const-string p0, "\u5fae\u4fe1\u8d5e\u8d4f\u7801"

    .line 62
    .line 63
    check-cast p1, Lf01;

    .line 64
    .line 65
    sget-object v0, Ld01;->a:[Lu40;

    .line 66
    .line 67
    sget-object v0, Lb01;->a:Le01;

    .line 68
    .line 69
    invoke-static {p0}, Lo30;->v(Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-interface {p1, v0, p0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    const/4 p0, 0x5

    .line 77
    invoke-static {p1, p0}, Ld01;->a(Lf01;I)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lna1;->a:Lna1;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 84
    .line 85
    invoke-static {p1}, Lwy;->d(Landroid/view/View;)Lna1;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :pswitch_6
    sget-object p0, Lt21;->c:Ljava/lang/Object;

    .line 91
    .line 92
    monitor-enter p0

    .line 93
    :try_start_0
    sget-object v1, Lt21;->i:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    :goto_0
    if-ge v0, v2, :cond_0

    .line 100
    .line 101
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Lsw;

    .line 106
    .line 107
    invoke-interface {v3, p1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    add-int/lit8 v0, v0, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    goto :goto_1

    .line 115
    :cond_0
    monitor-exit p0

    .line 116
    sget-object p0, Lna1;->a:Lna1;

    .line 117
    .line 118
    return-object p0

    .line 119
    :goto_1
    monitor-exit p0

    .line 120
    throw p1

    .line 121
    :pswitch_7
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 122
    .line 123
    invoke-static {p1}, Lrn;->U0(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :pswitch_8
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 129
    .line 130
    invoke-static {p1}, Lrn;->E0(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :pswitch_9
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 136
    .line 137
    invoke-static {p1}, Lrn;->S0(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_a
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 143
    .line 144
    invoke-static {p1}, Lrn;->T0(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :pswitch_b
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 150
    .line 151
    invoke-static {p1}, Lrn;->N0(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    return-object p0

    .line 156
    :pswitch_c
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 157
    .line 158
    invoke-static {p1}, Lrn;->C0(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :pswitch_d
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 164
    .line 165
    invoke-static {p1}, Lrn;->P(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0

    .line 170
    :pswitch_e
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 171
    .line 172
    invoke-static {p1}, Lrn;->r(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lna1;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
    :pswitch_f
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 178
    .line 179
    invoke-static {p1}, Lrn;->O1(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    return-object p0

    .line 184
    :pswitch_10
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 185
    .line 186
    invoke-static {p1}, Lrn;->Q0(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lna1;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0

    .line 191
    :pswitch_11
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 192
    .line 193
    invoke-static {p1}, Lrn;->s(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0

    .line 198
    :pswitch_12
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 199
    .line 200
    invoke-static {p1}, Lrn;->n0(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lna1;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    return-object p0

    .line 205
    :pswitch_13
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 206
    .line 207
    invoke-static {p1}, Lrn;->P0(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    return-object p0

    .line 212
    :pswitch_14
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 213
    .line 214
    invoke-static {p1}, Lrn;->I1(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0

    .line 219
    :pswitch_15
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 220
    .line 221
    invoke-static {p1}, Lrn;->K0(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lna1;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :pswitch_16
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 227
    .line 228
    invoke-static {p1}, Lrn;->o(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lna1;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    return-object p0

    .line 233
    :pswitch_17
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 234
    .line 235
    invoke-static {p1}, Lrn;->K1(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lna1;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    return-object p0

    .line 240
    :pswitch_18
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 241
    .line 242
    invoke-static {p1}, Lrn;->U1(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    return-object p0

    .line 247
    :pswitch_19
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 248
    .line 249
    invoke-static {p1}, Lrn;->N(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    return-object p0

    .line 254
    :pswitch_1a
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 255
    .line 256
    invoke-static {p1}, Lrn;->V1(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    return-object p0

    .line 261
    :pswitch_1b
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 262
    .line 263
    invoke-static {p1}, Lrn;->v(Lorg/luckypray/dexkit/query/FindClass;)Lna1;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0

    .line 268
    :pswitch_1c
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 269
    .line 270
    invoke-static {p1}, Lrn;->E1(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lna1;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    return-object p0

    .line 275
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
