.class public final Lec;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lab3;Lr61;Lab3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lec;->i:I

    .line 3
    .line 4
    iput-object p1, p0, Lec;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lec;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lec;->k:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p4, p0, Lec;->i:I

    iput-object p1, p0, Lec;->j:Ljava/lang/Object;

    iput-object p2, p0, Lec;->k:Ljava/lang/Object;

    iput-object p3, p0, Lec;->l:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lec;->i:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, Lec;->l:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, p0, Lec;->k:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Lec;->j:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, Lpl0;

    .line 18
    .line 19
    check-cast p0, Lpl0;

    .line 20
    .line 21
    invoke-static {p1, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    check-cast v6, Lbl0;

    .line 29
    .line 30
    iget-object p0, v6, Lbl0;->c:Lpl0;

    .line 31
    .line 32
    invoke-static {p1, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    check-cast v5, Lin0;

    .line 39
    .line 40
    invoke-interface {v5, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const-string p0, "Focus search landed at the root."

    .line 56
    .line 57
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    return-object v4

    .line 61
    :pswitch_0
    check-cast p1, Lif0;

    .line 62
    .line 63
    check-cast v6, Lsf0;

    .line 64
    .line 65
    iget-object v0, v6, Lsf0;->a:Lz33;

    .line 66
    .line 67
    check-cast v5, Lph0;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    if-eq p1, v2, :cond_4

    .line 76
    .line 77
    const/4 p0, 0x2

    .line 78
    if-ne p1, p0, :cond_3

    .line 79
    .line 80
    iget-object p0, v5, Lph0;->a:Lz33;

    .line 81
    .line 82
    iget-object p0, p0, Lz33;->b:Lcd2;

    .line 83
    .line 84
    if-eqz p0, :cond_2

    .line 85
    .line 86
    iget-wide p0, p0, Lcd2;->a:J

    .line 87
    .line 88
    new-instance v4, Lm33;

    .line 89
    .line 90
    invoke-direct {v4, p0, p1}, Lm33;-><init>(J)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    iget-object p0, v0, Lz33;->b:Lcd2;

    .line 95
    .line 96
    if-eqz p0, :cond_7

    .line 97
    .line 98
    iget-wide p0, p0, Lcd2;->a:J

    .line 99
    .line 100
    new-instance v4, Lm33;

    .line 101
    .line 102
    invoke-direct {v4, p0, p1}, Lm33;-><init>(J)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    invoke-static {}, Lc80;->s()V

    .line 107
    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_4
    move-object v4, p0

    .line 111
    check-cast v4, Lm33;

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    iget-object p0, v0, Lz33;->b:Lcd2;

    .line 115
    .line 116
    if-eqz p0, :cond_6

    .line 117
    .line 118
    iget-wide p0, p0, Lcd2;->a:J

    .line 119
    .line 120
    new-instance v4, Lm33;

    .line 121
    .line 122
    invoke-direct {v4, p0, p1}, Lm33;-><init>(J)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    iget-object p0, v5, Lph0;->a:Lz33;

    .line 127
    .line 128
    iget-object p0, p0, Lz33;->b:Lcd2;

    .line 129
    .line 130
    if-eqz p0, :cond_7

    .line 131
    .line 132
    iget-wide p0, p0, Lcd2;->a:J

    .line 133
    .line 134
    new-instance v4, Lm33;

    .line 135
    .line 136
    invoke-direct {v4, p0, p1}, Lm33;-><init>(J)V

    .line 137
    .line 138
    .line 139
    :cond_7
    :goto_2
    if-eqz v4, :cond_8

    .line 140
    .line 141
    iget-wide p0, v4, Lm33;->a:J

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_8
    sget-wide p0, Lm33;->b:J

    .line 145
    .line 146
    :goto_3
    new-instance v4, Lm33;

    .line 147
    .line 148
    invoke-direct {v4, p0, p1}, Lm33;-><init>(J)V

    .line 149
    .line 150
    .line 151
    :goto_4
    return-object v4

    .line 152
    :pswitch_1
    check-cast p1, Lca2;

    .line 153
    .line 154
    check-cast v6, Lgu2;

    .line 155
    .line 156
    check-cast p0, Lgu2;

    .line 157
    .line 158
    const/high16 v0, 0x3f800000    # 1.0f

    .line 159
    .line 160
    if-eqz p0, :cond_9

    .line 161
    .line 162
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    check-cast p0, Ljava/lang/Number;

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    goto :goto_5

    .line 173
    :cond_9
    move p0, v0

    .line 174
    :goto_5
    invoke-virtual {p1, p0}, Lca2;->c(F)V

    .line 175
    .line 176
    .line 177
    if-eqz v6, :cond_a

    .line 178
    .line 179
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    check-cast p0, Ljava/lang/Number;

    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    goto :goto_6

    .line 190
    :cond_a
    move p0, v0

    .line 191
    :goto_6
    invoke-virtual {p1, p0}, Lca2;->k(F)V

    .line 192
    .line 193
    .line 194
    if-eqz v6, :cond_b

    .line 195
    .line 196
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    check-cast p0, Ljava/lang/Number;

    .line 201
    .line 202
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    :cond_b
    invoke-virtual {p1, v0}, Lca2;->l(F)V

    .line 207
    .line 208
    .line 209
    check-cast v5, Lgu2;

    .line 210
    .line 211
    if-eqz v5, :cond_c

    .line 212
    .line 213
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    check-cast p0, Lm33;

    .line 218
    .line 219
    iget-wide v2, p0, Lm33;->a:J

    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_c
    sget-wide v2, Lm33;->b:J

    .line 223
    .line 224
    :goto_7
    invoke-virtual {p1, v2, v3}, Lca2;->r(J)V

    .line 225
    .line 226
    .line 227
    return-object v1

    .line 228
    :pswitch_2
    check-cast p1, Ld43;

    .line 229
    .line 230
    move-object v0, p1

    .line 231
    check-cast v0, Lgb0;

    .line 232
    .line 233
    check-cast v6, Lgb0;

    .line 234
    .line 235
    invoke-static {v6}, Lsp0;->f0(Lt60;)Lzv1;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Lb7;

    .line 240
    .line 241
    invoke-virtual {v1}, Lb7;->getDragAndDropManager()Leb0;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    check-cast v1, Lo8;

    .line 246
    .line 247
    iget-object v1, v1, Lo8;->b:Ljg;

    .line 248
    .line 249
    invoke-virtual {v1, v0}, Ljg;->contains(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-eqz v1, :cond_d

    .line 254
    .line 255
    check-cast v5, Ln4;

    .line 256
    .line 257
    invoke-static {v5}, Lte;->I(Ln4;)J

    .line 258
    .line 259
    .line 260
    move-result-wide v1

    .line 261
    invoke-static {v0, v1, v2}, Lse;->w(Lgb0;J)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_d

    .line 266
    .line 267
    check-cast p0, Lo72;

    .line 268
    .line 269
    iput-object p1, p0, Lo72;->i:Ljava/lang/Object;

    .line 270
    .line 271
    sget-object p0, Lc43;->j:Lc43;

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_d
    sget-object p0, Lc43;->h:Lc43;

    .line 275
    .line 276
    :goto_8
    return-object p0

    .line 277
    :pswitch_3
    check-cast p1, Lnc0;

    .line 278
    .line 279
    check-cast p0, Lab3;

    .line 280
    .line 281
    check-cast v5, Lr61;

    .line 282
    .line 283
    check-cast v6, Lab3;

    .line 284
    .line 285
    invoke-interface {p1}, Lnc0;->E()Lb5;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p1}, Lb5;->q()Lqp;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {p0}, Lic;->getView()Landroid/view/View;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    const/16 v7, 0x8

    .line 302
    .line 303
    if-eq v0, v7, :cond_10

    .line 304
    .line 305
    iput-boolean v2, p0, Lic;->F:Z

    .line 306
    .line 307
    iget-object v0, v5, Lr61;->u:Lzv1;

    .line 308
    .line 309
    instance-of v2, v0, Lb7;

    .line 310
    .line 311
    if-eqz v2, :cond_e

    .line 312
    .line 313
    move-object v4, v0

    .line 314
    check-cast v4, Lb7;

    .line 315
    .line 316
    :cond_e
    if-eqz v4, :cond_f

    .line 317
    .line 318
    invoke-static {p1}, Lg6;->a(Lqp;)Landroid/graphics/Canvas;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-virtual {v4}, Lb7;->getAndroidViewsHandler$ui()Lnc;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v6, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 330
    .line 331
    .line 332
    :cond_f
    iput-boolean v3, p0, Lic;->F:Z

    .line 333
    .line 334
    :cond_10
    return-object v1

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
