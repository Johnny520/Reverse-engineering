.class public final synthetic Lwb/pk;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILi0/a1;Li0/a1;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/pk;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Lwb/pk;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/pk;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/pk;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/pk;->h:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, Lwb/pk;->i:Li0/a1;

    .line 15
    .line 16
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, Lwb/pk;->h:Li0/a1;

    .line 27
    .line 28
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    xor-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lwb/pk;->i:Li0/a1;

    .line 57
    .line 58
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_1
    const-string v0, ""

    .line 63
    .line 64
    iget-object v1, p0, Lwb/pk;->h:Li0/a1;

    .line 65
    .line 66
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const-string v0, "create"

    .line 70
    .line 71
    iget-object v1, p0, Lwb/pk;->i:Li0/a1;

    .line 72
    .line 73
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_2
    new-instance v0, Lwb/gu;

    .line 78
    .line 79
    new-instance v1, Lwb/v0;

    .line 80
    .line 81
    iget-object v2, p0, Lwb/pk;->h:Li0/a1;

    .line 82
    .line 83
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ljava/util/Set;

    .line 88
    .line 89
    move-object v3, v2

    .line 90
    check-cast v3, Ljava/lang/Iterable;

    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    const/16 v8, 0x3e

    .line 94
    .line 95
    const-string v4, "|"

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    const/4 v6, 0x0

    .line 99
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    new-instance v6, Lw0/l;

    .line 104
    .line 105
    const/16 v2, 0xa

    .line 106
    .line 107
    invoke-direct {v6, v2}, Lw0/l;-><init>(I)V

    .line 108
    .line 109
    .line 110
    const/4 v7, 0x1

    .line 111
    const/16 v8, 0xc0

    .line 112
    .line 113
    const-string v2, "\u8bbe\u7f6e\u5141\u8bb8\u540d\u5355"

    .line 114
    .line 115
    sget-object v3, Lwb/u0;->i:Lwb/u0;

    .line 116
    .line 117
    const/4 v4, 0x1

    .line 118
    invoke-direct/range {v1 .. v8}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 119
    .line 120
    .line 121
    invoke-direct {v0, v1}, Lwb/gu;-><init>(Lwb/v0;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lwb/pk;->i:Li0/a1;

    .line 125
    .line 126
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :pswitch_3
    const/4 v0, 0x0

    .line 131
    iget-object v1, p0, Lwb/pk;->h:Li0/a1;

    .line 132
    .line 133
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    const-string v0, "rules"

    .line 137
    .line 138
    iget-object v1, p0, Lwb/pk;->i:Li0/a1;

    .line 139
    .line 140
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :pswitch_4
    const-string v0, "${sendText}"

    .line 145
    .line 146
    iget-object v1, p0, Lwb/pk;->h:Li0/a1;

    .line 147
    .line 148
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    const-string v0, "HH:mm:ss"

    .line 152
    .line 153
    iget-object v1, p0, Lwb/pk;->i:Li0/a1;

    .line 154
    .line 155
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :pswitch_5
    new-instance v0, Lwb/eq;

    .line 161
    .line 162
    new-instance v1, Lwb/v0;

    .line 163
    .line 164
    iget-object v2, p0, Lwb/pk;->h:Li0/a1;

    .line 165
    .line 166
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, Ljava/util/Set;

    .line 171
    .line 172
    move-object v3, v2

    .line 173
    check-cast v3, Ljava/lang/Iterable;

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    const/16 v8, 0x3e

    .line 177
    .line 178
    const-string v4, "|"

    .line 179
    .line 180
    const/4 v5, 0x0

    .line 181
    const/4 v6, 0x0

    .line 182
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    new-instance v6, Lw0/l;

    .line 187
    .line 188
    const/16 v2, 0xd

    .line 189
    .line 190
    invoke-direct {v6, v2}, Lw0/l;-><init>(I)V

    .line 191
    .line 192
    .line 193
    const/4 v7, 0x1

    .line 194
    const/16 v8, 0xc0

    .line 195
    .line 196
    const-string v2, "\u5141\u8bb8\u4ed6\u4eba\u70b9\u6b4c\u7684\u804a\u5929"

    .line 197
    .line 198
    sget-object v3, Lwb/u0;->i:Lwb/u0;

    .line 199
    .line 200
    const/4 v4, 0x1

    .line 201
    invoke-direct/range {v1 .. v8}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 202
    .line 203
    .line 204
    invoke-direct {v0, v1}, Lwb/eq;-><init>(Lwb/v0;)V

    .line 205
    .line 206
    .line 207
    iget-object v1, p0, Lwb/pk;->i:Li0/a1;

    .line 208
    .line 209
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :pswitch_6
    const/4 v0, 0x0

    .line 215
    iget-object v1, p0, Lwb/pk;->h:Li0/a1;

    .line 216
    .line 217
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    sget-object v0, Lwb/g;->i:Lwb/g;

    .line 221
    .line 222
    iget-object v1, p0, Lwb/pk;->i:Li0/a1;

    .line 223
    .line 224
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :pswitch_7
    new-instance v0, Lwb/tv;

    .line 230
    .line 231
    new-instance v1, Lwb/v0;

    .line 232
    .line 233
    iget-object v2, p0, Lwb/pk;->h:Li0/a1;

    .line 234
    .line 235
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    check-cast v2, Ljava/util/Set;

    .line 240
    .line 241
    move-object v3, v2

    .line 242
    check-cast v3, Ljava/lang/Iterable;

    .line 243
    .line 244
    const/4 v7, 0x0

    .line 245
    const/16 v8, 0x3e

    .line 246
    .line 247
    const-string v4, "|"

    .line 248
    .line 249
    const/4 v5, 0x0

    .line 250
    const/4 v6, 0x0

    .line 251
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    new-instance v6, Lwb/jk;

    .line 256
    .line 257
    const/16 v2, 0xc

    .line 258
    .line 259
    invoke-direct {v6, v2}, Lwb/jk;-><init>(I)V

    .line 260
    .line 261
    .line 262
    const/4 v7, 0x1

    .line 263
    const/16 v8, 0xc0

    .line 264
    .line 265
    const-string v2, "\u9009\u62e9\u6392\u9664\u597d\u53cb"

    .line 266
    .line 267
    sget-object v3, Lwb/u0;->g:Lwb/u0;

    .line 268
    .line 269
    const/4 v4, 0x1

    .line 270
    invoke-direct/range {v1 .. v8}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 271
    .line 272
    .line 273
    sget-object v2, Lwb/wv;->h:Lwb/wv;

    .line 274
    .line 275
    invoke-direct {v0, v2, v1}, Lwb/tv;-><init>(Lwb/wv;Lwb/v0;)V

    .line 276
    .line 277
    .line 278
    iget-object v1, p0, Lwb/pk;->i:Li0/a1;

    .line 279
    .line 280
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :pswitch_8
    new-instance v0, Lwb/tv;

    .line 286
    .line 287
    new-instance v1, Lwb/v0;

    .line 288
    .line 289
    iget-object v2, p0, Lwb/pk;->h:Li0/a1;

    .line 290
    .line 291
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    check-cast v2, Ljava/util/Set;

    .line 296
    .line 297
    move-object v3, v2

    .line 298
    check-cast v3, Ljava/lang/Iterable;

    .line 299
    .line 300
    const/4 v7, 0x0

    .line 301
    const/16 v8, 0x3e

    .line 302
    .line 303
    const-string v4, "|"

    .line 304
    .line 305
    const/4 v5, 0x0

    .line 306
    const/4 v6, 0x0

    .line 307
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    new-instance v6, Lwb/jk;

    .line 312
    .line 313
    const/16 v2, 0x8

    .line 314
    .line 315
    invoke-direct {v6, v2}, Lwb/jk;-><init>(I)V

    .line 316
    .line 317
    .line 318
    const/4 v7, 0x1

    .line 319
    const/16 v8, 0xc0

    .line 320
    .line 321
    const-string v2, "\u9009\u62e9\u68c0\u6d4b\u597d\u53cb"

    .line 322
    .line 323
    sget-object v3, Lwb/u0;->g:Lwb/u0;

    .line 324
    .line 325
    const/4 v4, 0x1

    .line 326
    invoke-direct/range {v1 .. v8}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 327
    .line 328
    .line 329
    sget-object v2, Lwb/wv;->g:Lwb/wv;

    .line 330
    .line 331
    invoke-direct {v0, v2, v1}, Lwb/tv;-><init>(Lwb/wv;Lwb/v0;)V

    .line 332
    .line 333
    .line 334
    iget-object v1, p0, Lwb/pk;->i:Li0/a1;

    .line 335
    .line 336
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_0

    .line 340
    .line 341
    :pswitch_data_0
    .packed-switch 0x0
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
