.class public final synthetic Loh;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Loh;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Loh;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    iget v0, p0, Loh;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Loh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    const v1, 0x7e110001

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    instance-of v3, v2, Lo40;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    check-cast v2, Lo40;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v2, v4

    .line 26
    :goto_0
    sget-object v3, Lo40;->o:Lsh;

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    new-instance v2, Lo40;

    .line 31
    .line 32
    invoke-direct {v2, p1, v3}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    const v1, 0x7e110002

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    instance-of v6, v5, Lo40;

    .line 46
    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    check-cast v5, Lo40;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-object v5, v4

    .line 53
    :goto_1
    sget-object v6, Lo40;->p:Lsh;

    .line 54
    .line 55
    if-nez v5, :cond_3

    .line 56
    .line 57
    new-instance v5, Lo40;

    .line 58
    .line 59
    invoke-direct {v5, p1, v6}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    if-eqz v0, :cond_5

    .line 66
    .line 67
    const v1, 0x7e110003

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    instance-of v8, v7, Lo40;

    .line 75
    .line 76
    if-eqz v8, :cond_4

    .line 77
    .line 78
    check-cast v7, Lo40;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object v7, v4

    .line 82
    :goto_2
    if-nez v7, :cond_6

    .line 83
    .line 84
    new-instance v7, Lo40;

    .line 85
    .line 86
    invoke-direct {v7, v0, v3}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    move-object v7, v4

    .line 94
    :cond_6
    :goto_3
    if-eqz v0, :cond_8

    .line 95
    .line 96
    const v1, 0x7e110004

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    instance-of v8, v3, Lo40;

    .line 104
    .line 105
    if-eqz v8, :cond_7

    .line 106
    .line 107
    move-object v4, v3

    .line 108
    check-cast v4, Lo40;

    .line 109
    .line 110
    :cond_7
    if-nez v4, :cond_8

    .line 111
    .line 112
    new-instance v3, Lo40;

    .line 113
    .line 114
    invoke-direct {v3, v0, v6}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move-object v4, v3

    .line 121
    :cond_8
    sget-object v0, Lkn;->a:Lkn;

    .line 122
    .line 123
    const-string v1, "UuAUEhieA31W6DIvG4Mof1DnHywOmBhn\n"

    .line 124
    .line 125
    const-string v3, "OYVtTXrxdwk=\n"

    .line 126
    .line 127
    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    const/4 v0, 0x1

    .line 135
    invoke-static {v1, v0}, Lkn;->a(Ljava/lang/String;Z)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_c

    .line 144
    .line 145
    if-eq v3, v0, :cond_9

    .line 146
    .line 147
    const/4 v6, 0x3

    .line 148
    if-eq v3, v6, :cond_9

    .line 149
    .line 150
    goto/16 :goto_4

    .line 151
    .line 152
    :cond_9
    if-eqz v1, :cond_a

    .line 153
    .line 154
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    if-ne p2, v0, :cond_a

    .line 159
    .line 160
    const/4 p2, 0x2

    .line 161
    invoke-static {p1, p2}, Lkn;->i(Landroid/view/View;I)V

    .line 162
    .line 163
    .line 164
    :cond_a
    const/high16 p1, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const/high16 p2, 0x43480000    # 200.0f

    .line 167
    .line 168
    const v0, 0x3ecccccd    # 0.4f

    .line 169
    .line 170
    .line 171
    invoke-static {p1, p2, v0}, Lg40;->f(FFF)Lp40;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iput-object v1, v2, Lo40;->k:Lp40;

    .line 176
    .line 177
    invoke-static {p1, p2, v0}, Lg40;->f(FFF)Lp40;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iput-object v0, v5, Lo40;->k:Lp40;

    .line 182
    .line 183
    invoke-virtual {v2}, Lo40;->h()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5}, Lo40;->h()V

    .line 187
    .line 188
    .line 189
    const/high16 v0, 0x3e800000    # 0.25f

    .line 190
    .line 191
    if-eqz v7, :cond_b

    .line 192
    .line 193
    invoke-static {p1, p2, v0}, Lg40;->f(FFF)Lp40;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iput-object v1, v7, Lo40;->k:Lp40;

    .line 198
    .line 199
    invoke-virtual {v7}, Lo40;->h()V

    .line 200
    .line 201
    .line 202
    :cond_b
    if-eqz v4, :cond_f

    .line 203
    .line 204
    invoke-static {p1, p2, v0}, Lg40;->f(FFF)Lp40;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iput-object p1, v4, Lo40;->k:Lp40;

    .line 209
    .line 210
    invoke-virtual {v4}, Lo40;->h()V

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_c
    if-eqz v1, :cond_d

    .line 215
    .line 216
    invoke-static {p1, v0}, Lkn;->i(Landroid/view/View;I)V

    .line 217
    .line 218
    .line 219
    :cond_d
    const p1, 0x3f6b851f    # 0.92f

    .line 220
    .line 221
    .line 222
    const p2, 0x44bb8000    # 1500.0f

    .line 223
    .line 224
    .line 225
    const v0, 0x3f333333    # 0.7f

    .line 226
    .line 227
    .line 228
    invoke-static {p1, p2, v0}, Lg40;->f(FFF)Lp40;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    iput-object v1, v2, Lo40;->k:Lp40;

    .line 233
    .line 234
    invoke-static {p1, p2, v0}, Lg40;->f(FFF)Lp40;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iput-object p1, v5, Lo40;->k:Lp40;

    .line 239
    .line 240
    invoke-virtual {v2}, Lo40;->h()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v5}, Lo40;->h()V

    .line 244
    .line 245
    .line 246
    const p1, 0x3f19999a    # 0.6f

    .line 247
    .line 248
    .line 249
    const v0, 0x3f59999a    # 0.85f

    .line 250
    .line 251
    .line 252
    if-eqz v7, :cond_e

    .line 253
    .line 254
    invoke-static {v0, p2, p1}, Lg40;->f(FFF)Lp40;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    iput-object v1, v7, Lo40;->k:Lp40;

    .line 259
    .line 260
    invoke-virtual {v7}, Lo40;->h()V

    .line 261
    .line 262
    .line 263
    :cond_e
    if-eqz v4, :cond_f

    .line 264
    .line 265
    invoke-static {v0, p2, p1}, Lg40;->f(FFF)Lp40;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    iput-object p1, v4, Lo40;->k:Lp40;

    .line 270
    .line 271
    invoke-virtual {v4}, Lo40;->h()V

    .line 272
    .line 273
    .line 274
    :cond_f
    :goto_4
    const/4 p1, 0x0

    .line 275
    return p1

    .line 276
    :pswitch_0
    iget-object p1, p0, Loh;->b:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p1, Lrh;

    .line 279
    .line 280
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    const/4 v0, 0x0

    .line 285
    const/4 v1, 0x1

    .line 286
    if-ne p2, v1, :cond_12

    .line 287
    .line 288
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 289
    .line 290
    .line 291
    move-result-wide v2

    .line 292
    iget-wide v4, p1, Lrh;->o:J

    .line 293
    .line 294
    sub-long/2addr v2, v4

    .line 295
    const-wide/16 v4, 0x0

    .line 296
    .line 297
    cmp-long p2, v2, v4

    .line 298
    .line 299
    if-ltz p2, :cond_10

    .line 300
    .line 301
    const-wide/16 v4, 0x12c

    .line 302
    .line 303
    cmp-long p2, v2, v4

    .line 304
    .line 305
    if-lez p2, :cond_11

    .line 306
    .line 307
    :cond_10
    iput-boolean v0, p1, Lrh;->m:Z

    .line 308
    .line 309
    :cond_11
    invoke-virtual {p1}, Lrh;->t()V

    .line 310
    .line 311
    .line 312
    iput-boolean v1, p1, Lrh;->m:Z

    .line 313
    .line 314
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 315
    .line 316
    .line 317
    move-result-wide v1

    .line 318
    iput-wide v1, p1, Lrh;->o:J

    .line 319
    .line 320
    :cond_12
    return v0

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
