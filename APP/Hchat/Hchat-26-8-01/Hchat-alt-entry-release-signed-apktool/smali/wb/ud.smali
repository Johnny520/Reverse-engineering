.class public final synthetic Lwb/ud;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/ud;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ud;->h:Li0/a1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lwb/ud;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 17
    .line 18
    const-string v1, "#576B95"

    .line 19
    .line 20
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_1
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 25
    .line 26
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_2
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 33
    .line 34
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_3
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 41
    .line 42
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    xor-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_4
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 63
    .line 64
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :pswitch_5
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 71
    .line 72
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_6
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 79
    .line 80
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_7
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 87
    .line 88
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :pswitch_8
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 95
    .line 96
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_9
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 103
    .line 104
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :pswitch_a
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 111
    .line 112
    invoke-static {v0}, Lwb/ho;->g2(Li0/a1;)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :pswitch_b
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 127
    .line 128
    invoke-static {v0}, Lwb/ho;->g2(Li0/a1;)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_0

    .line 142
    .line 143
    :pswitch_c
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 144
    .line 145
    const-string v1, "#FFFF0000"

    .line 146
    .line 147
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :pswitch_d
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 153
    .line 154
    const-string v1, "#00000000"

    .line 155
    .line 156
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :pswitch_e
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 162
    .line 163
    const-string v1, "#FFFF0000"

    .line 164
    .line 165
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :pswitch_f
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 171
    .line 172
    const-string v1, "#00000000"

    .line 173
    .line 174
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :pswitch_10
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 180
    .line 181
    const-string v1, ""

    .line 182
    .line 183
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :pswitch_11
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 189
    .line 190
    const-string v1, ""

    .line 191
    .line 192
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :pswitch_12
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 198
    .line 199
    const-string v1, ""

    .line 200
    .line 201
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :pswitch_13
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 207
    .line 208
    const-string v1, ""

    .line 209
    .line 210
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :pswitch_14
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 216
    .line 217
    sget-object v1, Lwb/h;->a:Lwb/h;

    .line 218
    .line 219
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :pswitch_15
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 225
    .line 226
    sget-object v1, Lwb/h;->c:Lwb/h;

    .line 227
    .line 228
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :pswitch_16
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 234
    .line 235
    invoke-static {v0}, Lwb/ho;->g2(Li0/a1;)I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    add-int/lit8 v1, v1, 0x1

    .line 240
    .line 241
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :pswitch_17
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 251
    .line 252
    invoke-static {v0}, Lwb/ho;->g2(Li0/a1;)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    add-int/lit8 v1, v1, 0x1

    .line 257
    .line 258
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :pswitch_18
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 268
    .line 269
    invoke-static {v0}, Lwb/ho;->g2(Li0/a1;)I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    add-int/lit8 v1, v1, 0x1

    .line 274
    .line 275
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :pswitch_19
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 285
    .line 286
    invoke-static {v0}, Lwb/ho;->g2(Li0/a1;)I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    add-int/lit8 v1, v1, 0x1

    .line 291
    .line 292
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_0

    .line 300
    .line 301
    :pswitch_1a
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 302
    .line 303
    invoke-static {v0}, Lwb/ho;->g2(Li0/a1;)I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    add-int/lit8 v1, v1, 0x1

    .line 308
    .line 309
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_0

    .line 317
    .line 318
    :pswitch_1b
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 319
    .line 320
    invoke-static {v0}, Lwb/ho;->g2(Li0/a1;)I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    add-int/lit8 v1, v1, 0x1

    .line 325
    .line 326
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    goto/16 :goto_0

    .line 334
    .line 335
    :pswitch_1c
    iget-object v0, p0, Lwb/ud;->h:Li0/a1;

    .line 336
    .line 337
    invoke-static {v0}, Lwb/ho;->g2(Li0/a1;)I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    add-int/lit8 v1, v1, 0x1

    .line 342
    .line 343
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    nop

    .line 353
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
