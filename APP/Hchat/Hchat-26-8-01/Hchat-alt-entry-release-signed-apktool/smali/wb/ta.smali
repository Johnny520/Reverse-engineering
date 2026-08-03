.class public final synthetic Lwb/ta;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lfg/a;II)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/ta;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ta;->i:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ta;->h:Lfg/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lfg/a;Landroid/content/Context;I)V
    .locals 0

    .line 11
    iput p3, p0, Lwb/ta;->g:I

    iput-object p1, p0, Lwb/ta;->h:Lfg/a;

    iput-object p2, p0, Lwb/ta;->i:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/ta;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/16 p2, 0x31

    .line 14
    .line 15
    invoke-static {p2}, Li0/r;->C(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object v0, p0, Lwb/ta;->i:Landroid/content/Context;

    .line 20
    .line 21
    iget-object v1, p0, Lwb/ta;->h:Lfg/a;

    .line 22
    .line 23
    invoke-static {v0, v1, p1, p2}, Lwb/ho;->O0(Landroid/content/Context;Lfg/a;Li0/h0;I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    and-int/lit8 v0, p2, 0x3

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    const/4 v2, 0x1

    .line 37
    if-eq v0, v1, :cond_0

    .line 38
    .line 39
    move v0, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v0, 0x0

    .line 42
    :goto_1
    and-int/2addr p2, v2

    .line 43
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_3

    .line 48
    .line 49
    iget-object p2, p0, Lwb/ta;->h:Lfg/a;

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget-object v1, p0, Lwb/ta;->i:Landroid/content/Context;

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    or-int/2addr v0, v2

    .line 62
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    sget-object v0, Li0/l;->a:Li0/e;

    .line 69
    .line 70
    if-ne v2, v0, :cond_2

    .line 71
    .line 72
    :cond_1
    new-instance v2, Lwb/sg;

    .line 73
    .line 74
    const/4 v0, 0x3

    .line 75
    invoke-direct {v2, p2, v1, v0}, Lwb/sg;-><init>(Lfg/a;Landroid/content/Context;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    check-cast v2, Lfg/a;

    .line 82
    .line 83
    const/16 p2, 0x36

    .line 84
    .line 85
    const-string v0, "\u5220\u9664\u540d\u5355"

    .line 86
    .line 87
    const-string v1, "\u5220\u9664\u540e\u8be5\u540d\u5355\u4e0d\u518d\u5957\u7528\u6a21\u677f"

    .line 88
    .line 89
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 94
    .line 95
    .line 96
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 97
    .line 98
    return-object p1

    .line 99
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    and-int/lit8 v0, p2, 0x3

    .line 104
    .line 105
    const/4 v1, 0x2

    .line 106
    const/4 v2, 0x1

    .line 107
    if-eq v0, v1, :cond_4

    .line 108
    .line 109
    move v0, v2

    .line 110
    goto :goto_3

    .line 111
    :cond_4
    const/4 v0, 0x0

    .line 112
    :goto_3
    and-int/2addr p2, v2

    .line 113
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eqz p2, :cond_7

    .line 118
    .line 119
    iget-object p2, p0, Lwb/ta;->h:Lfg/a;

    .line 120
    .line 121
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    iget-object v1, p0, Lwb/ta;->i:Landroid/content/Context;

    .line 126
    .line 127
    invoke-virtual {p1, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    or-int/2addr v0, v2

    .line 132
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    if-nez v0, :cond_5

    .line 137
    .line 138
    sget-object v0, Li0/l;->a:Li0/e;

    .line 139
    .line 140
    if-ne v2, v0, :cond_6

    .line 141
    .line 142
    :cond_5
    new-instance v2, Lwb/sg;

    .line 143
    .line 144
    const/4 v0, 0x0

    .line 145
    invoke-direct {v2, p2, v1, v0}, Lwb/sg;-><init>(Lfg/a;Landroid/content/Context;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_6
    check-cast v2, Lfg/a;

    .line 152
    .line 153
    const/16 p2, 0x36

    .line 154
    .line 155
    const-string v0, "\u5220\u9664\u6a21\u677f"

    .line 156
    .line 157
    const-string v1, "\u5220\u9664\u540e\u7acb\u5373\u4ece\u6a21\u677f\u5217\u8868\u79fb\u9664"

    .line 158
    .line 159
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 160
    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_7
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 164
    .line 165
    .line 166
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 167
    .line 168
    return-object p1

    .line 169
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    and-int/lit8 v0, p2, 0x3

    .line 174
    .line 175
    const/4 v1, 0x2

    .line 176
    const/4 v2, 0x1

    .line 177
    if-eq v0, v1, :cond_8

    .line 178
    .line 179
    move v0, v2

    .line 180
    goto :goto_5

    .line 181
    :cond_8
    const/4 v0, 0x0

    .line 182
    :goto_5
    and-int/2addr p2, v2

    .line 183
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    if-eqz p2, :cond_b

    .line 188
    .line 189
    iget-object p2, p0, Lwb/ta;->h:Lfg/a;

    .line 190
    .line 191
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    iget-object v1, p0, Lwb/ta;->i:Landroid/content/Context;

    .line 196
    .line 197
    invoke-virtual {p1, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    or-int/2addr v0, v2

    .line 202
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    if-nez v0, :cond_9

    .line 207
    .line 208
    sget-object v0, Li0/l;->a:Li0/e;

    .line 209
    .line 210
    if-ne v2, v0, :cond_a

    .line 211
    .line 212
    :cond_9
    new-instance v2, Lwb/sg;

    .line 213
    .line 214
    const/4 v0, 0x1

    .line 215
    invoke-direct {v2, p2, v1, v0}, Lwb/sg;-><init>(Lfg/a;Landroid/content/Context;I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :cond_a
    check-cast v2, Lfg/a;

    .line 222
    .line 223
    const/16 p2, 0x36

    .line 224
    .line 225
    const-string v0, "\u79fb\u9664\u9002\u7528\u804a\u5929"

    .line 226
    .line 227
    const-string v1, "\u79fb\u9664\u540e\u8be5\u804a\u5929\u56de\u5230\u9ed8\u8ba4\u89c4\u5219"

    .line 228
    .line 229
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 230
    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_b
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 234
    .line 235
    .line 236
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 237
    .line 238
    return-object p1

    .line 239
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    and-int/lit8 v0, p2, 0x3

    .line 244
    .line 245
    const/4 v1, 0x2

    .line 246
    const/4 v2, 0x1

    .line 247
    if-eq v0, v1, :cond_c

    .line 248
    .line 249
    move v0, v2

    .line 250
    goto :goto_7

    .line 251
    :cond_c
    const/4 v0, 0x0

    .line 252
    :goto_7
    and-int/2addr p2, v2

    .line 253
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    if-eqz p2, :cond_f

    .line 258
    .line 259
    iget-object p2, p0, Lwb/ta;->h:Lfg/a;

    .line 260
    .line 261
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    iget-object v1, p0, Lwb/ta;->i:Landroid/content/Context;

    .line 266
    .line 267
    invoke-virtual {p1, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    or-int/2addr v0, v2

    .line 272
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    if-nez v0, :cond_d

    .line 277
    .line 278
    sget-object v0, Li0/l;->a:Li0/e;

    .line 279
    .line 280
    if-ne v2, v0, :cond_e

    .line 281
    .line 282
    :cond_d
    new-instance v2, Lwb/sg;

    .line 283
    .line 284
    const/4 v0, 0x2

    .line 285
    invoke-direct {v2, p2, v1, v0}, Lwb/sg;-><init>(Lfg/a;Landroid/content/Context;I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :cond_e
    check-cast v2, Lfg/a;

    .line 292
    .line 293
    const/16 p2, 0x36

    .line 294
    .line 295
    const-string v0, "\u5220\u9664\u6a21\u677f"

    .line 296
    .line 297
    const-string v1, "\u5220\u9664\u540e\u4f7f\u7528\u8be5\u6a21\u677f\u7684\u804a\u5929\u4f1a\u53d8\u6210\u672a\u7ed1\u5b9a\u6a21\u677f"

    .line 298
    .line 299
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 300
    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_f
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 304
    .line 305
    .line 306
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 307
    .line 308
    return-object p1

    .line 309
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    const/4 p2, 0x1

    .line 313
    invoke-static {p2}, Li0/r;->C(I)I

    .line 314
    .line 315
    .line 316
    move-result p2

    .line 317
    iget-object v0, p0, Lwb/ta;->i:Landroid/content/Context;

    .line 318
    .line 319
    iget-object v1, p0, Lwb/ta;->h:Lfg/a;

    .line 320
    .line 321
    invoke-static {v0, v1, p1, p2}, Lwb/ho;->V(Landroid/content/Context;Lfg/a;Li0/h0;I)V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_0

    .line 325
    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
