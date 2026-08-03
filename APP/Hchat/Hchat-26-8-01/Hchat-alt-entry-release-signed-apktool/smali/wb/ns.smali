.class public final synthetic Lwb/ns;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/j1;

.field public final synthetic i:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/j1;I)V
    .locals 0

    .line 12
    iput p3, p0, Lwb/ns;->g:I

    iput-object p1, p0, Lwb/ns;->i:Landroid/content/Context;

    iput-object p2, p0, Lwb/ns;->h:Li0/j1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li0/j1;Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/ns;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ns;->h:Li0/j1;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ns;->i:Landroid/content/Context;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/ns;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    iget-object v2, p0, Lwb/ns;->h:Li0/j1;

    .line 6
    .line 7
    iget-object v3, p0, Lwb/ns;->i:Landroid/content/Context;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    invoke-static {v0, p1}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v4, Ljava/util/HashSet;

    .line 28
    .line 29
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v5, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    move-object v7, v6

    .line 52
    check-cast v7, Lfb/a;

    .line 53
    .line 54
    iget-object v8, v7, Lfb/a;->e:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_1

    .line 61
    .line 62
    iget-object v8, v7, Lfb/a;->b:Ljava/lang/String;

    .line 63
    .line 64
    :cond_1
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_0

    .line 69
    .line 70
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    const/16 v0, 0xc

    .line 75
    .line 76
    invoke-static {v0, v5}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v4, Ljava/util/HashSet;

    .line 81
    .line 82
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_3

    .line 94
    .line 95
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    check-cast v6, Lfb/a;

    .line 100
    .line 101
    iget-object v6, v6, Lfb/a;->b:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    sget-object v5, Lfb/g1;->a:Lfb/g1;

    .line 108
    .line 109
    new-instance v5, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-eqz v6, :cond_5

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    move-object v7, v6

    .line 129
    check-cast v7, Lfb/a;

    .line 130
    .line 131
    iget-object v7, v7, Lfb/a;->b:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-nez v7, :cond_4

    .line 138
    .line 139
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    invoke-static {v3, v5}, Lfb/g1;->b(Landroid/content/Context;Ljava/util/List;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    return-object v1

    .line 150
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 153
    .line 154
    .line 155
    move-result-wide v4

    .line 156
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    check-cast p1, Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_7

    .line 171
    .line 172
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    move-object v6, v0

    .line 177
    check-cast v6, Lwb/rt;

    .line 178
    .line 179
    iget-wide v6, v6, Lwb/rt;->a:J

    .line 180
    .line 181
    cmp-long v6, v6, v4

    .line 182
    .line 183
    if-nez v6, :cond_6

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_7
    const/4 v0, 0x0

    .line 187
    :goto_3
    check-cast v0, Lwb/rt;

    .line 188
    .line 189
    if-eqz v0, :cond_8

    .line 190
    .line 191
    sget-object p1, Lfb/g1;->a:Lfb/g1;

    .line 192
    .line 193
    iget-object p1, v0, Lwb/rt;->c:Ljava/util/List;

    .line 194
    .line 195
    invoke-static {v3, p1}, Lfb/g1;->b(Landroid/content/Context;Ljava/util/List;)V

    .line 196
    .line 197
    .line 198
    :cond_8
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    check-cast p1, Ljava/util/List;

    .line 203
    .line 204
    new-instance v0, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_a

    .line 218
    .line 219
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    move-object v6, v3

    .line 224
    check-cast v6, Lwb/rt;

    .line 225
    .line 226
    iget-wide v6, v6, Lwb/rt;->a:J

    .line 227
    .line 228
    cmp-long v6, v6, v4

    .line 229
    .line 230
    if-nez v6, :cond_9

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_9
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_a
    invoke-virtual {v2, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    return-object v1

    .line 241
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Ljava/util/List;

    .line 251
    .line 252
    new-instance v4, Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    :cond_b
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-eqz v5, :cond_c

    .line 266
    .line 267
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    move-object v6, v5

    .line 272
    check-cast v6, Lfb/a;

    .line 273
    .line 274
    iget-object v6, v6, Lfb/a;->b:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v6, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    if-eqz v6, :cond_b

    .line 281
    .line 282
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_c
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    check-cast v0, Ljava/util/List;

    .line 291
    .line 292
    new-instance v5, Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    :cond_d
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-eqz v6, :cond_e

    .line 306
    .line 307
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    move-object v7, v6

    .line 312
    check-cast v7, Lfb/a;

    .line 313
    .line 314
    iget-object v7, v7, Lfb/a;->b:Ljava/lang/String;

    .line 315
    .line 316
    invoke-virtual {v7, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    if-nez v7, :cond_d

    .line 321
    .line 322
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_e
    invoke-virtual {v2, v5}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    sget-object p1, Lfb/g1;->a:Lfb/g1;

    .line 330
    .line 331
    invoke-static {v3, v4}, Lfb/g1;->b(Landroid/content/Context;Ljava/util/List;)V

    .line 332
    .line 333
    .line 334
    return-object v1

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
