.class public final synthetic Lyyds/ᛶᛷᛲᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛶᛷᛲᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    .line 1
    iget v0, p0, Lyyds/ᛶᛷᛲᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/16 v2, 0xc3

    .line 5
    .line 6
    const/16 v3, 0x83

    .line 7
    .line 8
    const-wide v4, -0x18d9e68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v6, 0x3

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lyyds/ᛶᲀᲈᛷ;

    .line 23
    .line 24
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lyyds/ᛷᛳᲈᛲ;

    .line 27
    .line 28
    iget-boolean v0, p1, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 29
    .line 30
    xor-int/2addr v0, v9

    .line 31
    iput-boolean v0, p1, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 32
    .line 33
    invoke-static {p0, p1}, Lyyds/ᛸᛶᲇᛴ;->ᛷᛵᲇᲀ(Lyyds/ᛷᛳᲈᛲ;Lyyds/ᛶᲀᲈᛷ;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lyyds/ᛴᛸᛵᲈ;

    .line 40
    .line 41
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lyyds/ᲁᛶᲁᲀ;

    .line 44
    .line 45
    invoke-virtual {p1}, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ()V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_1
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Landroid/content/Context;

    .line 55
    .line 56
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 59
    .line 60
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v1, Lyyds/ᲇᛳᲇ;

    .line 65
    .line 66
    invoke-direct {v1, p1, p0, v8, v7}, Lyyds/ᲇᛳᲇ;-><init>(Landroid/content/Context;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v8, v1, v6}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_2
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Lyyds/ᛷᲇᲇᛷ;

    .line 76
    .line 77
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, Lyyds/ᲈᛸᛲᲁ;

    .line 80
    .line 81
    sget-object v0, Lyyds/ᲈᲈᛲᲁ;->ᛲᲈᲁ:Ljava/util/List;

    .line 82
    .line 83
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛱᛵᛳᛳ()Ljava/util/Set;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object p1, p1, Lyyds/ᛷᲇᲇᛷ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 93
    .line 94
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    const-wide v1, -0x20d76e68a836eL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛱᛵᛳᛳ()Ljava/util/Set;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {v1}, Lyyds/ᛷᛷᛶᲇ;->ᛶᛵᛸᛲ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-nez v0, :cond_0

    .line 115
    .line 116
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :goto_0
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᲈᲁᛶᛴ:Lyyds/ᛳᲀᛲ;

    .line 127
    .line 128
    sget-object v2, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 129
    .line 130
    aget-object v2, v2, v3

    .line 131
    .line 132
    invoke-virtual {p1, v2, v1}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v0}, Lyyds/ᲈᛸᛲᲁ;->ᛵᛶᛲᲀ(Z)V

    .line 136
    .line 137
    .line 138
    const-wide p0, -0xa438e68a836eL

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_3
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p1, Ljava/util/ArrayList;

    .line 154
    .line 155
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p0, Lyyds/ᛱᛴᲈᛸ;

    .line 158
    .line 159
    sget-object v0, Lyyds/ᲈᲈᛲᲁ;->ᛲᲈᲁ:Ljava/util/List;

    .line 160
    .line 161
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 162
    .line 163
    sget-object v6, Lyyds/ᲈᲈᛲᲁ;->ᛲᲈᲁ:Ljava/util/List;

    .line 164
    .line 165
    const-wide v1, -0x20d7de68a836eL

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    new-instance v10, Lyyds/ᛳᛱᛶᛲ;

    .line 175
    .line 176
    const/16 v1, 0x1a

    .line 177
    .line 178
    invoke-direct {v10, v1}, Lyyds/ᛳᛱᛶᛲ;-><init>(I)V

    .line 179
    .line 180
    .line 181
    const/16 v11, 0x1e

    .line 182
    .line 183
    const/4 v8, 0x0

    .line 184
    const/4 v9, 0x0

    .line 185
    invoke-static/range {v6 .. v11}, Lyyds/ᛷᛷᛶᲇ;->ᲈᛷᲈᛶ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    const-wide v6, -0x18d1e68a836eL

    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛴᛱᛵᛵ:Lyyds/ᛳᲀᛲ;

    .line 201
    .line 202
    sget-object v2, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 203
    .line 204
    const/16 v6, 0x82

    .line 205
    .line 206
    aget-object v6, v2, v6

    .line 207
    .line 208
    invoke-virtual {v0, v6, v1}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 212
    .line 213
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᲈᲁᛶᛴ:Lyyds/ᛳᲀᛲ;

    .line 220
    .line 221
    aget-object v2, v2, v3

    .line 222
    .line 223
    invoke-virtual {v1, v2, v0}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 227
    .line 228
    .line 229
    invoke-static {}, Lyyds/ᲈᲈᛲᲁ;->ᛲᲈᲁ()Ljava/util/ArrayList;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Lyyds/ᛲᛵᲇᛳ;->ᲀᛲᛳᲀ()V

    .line 237
    .line 238
    .line 239
    const-wide p0, -0xcc58e68a836eL

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :pswitch_4
    iget-object v0, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Lyyds/ᛴᲁᛱᲇ;

    .line 255
    .line 256
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast p0, Lyyds/ᲁᛴᛲᛱ;

    .line 259
    .line 260
    invoke-static {}, Lyyds/ᛵᛱᲀᛱ;->ᲇᲇᲈᲀ()Lyyds/ᛵᛱᲀᛱ;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    iget v2, v0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 265
    .line 266
    invoke-virtual {v1, v2}, Lyyds/ᛵᛱᲀᛱ;->ᲈᛲᛳᛶ(I)V

    .line 267
    .line 268
    .line 269
    iget-object v2, p0, Lyyds/ᲁᛴᛲᛱ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-virtual {v1, v2}, Lyyds/ᛵᛱᲀᛱ;->ᲀᛳᛷᛷ(Ljava/util/List;)V

    .line 272
    .line 273
    .line 274
    const-wide v2, -0x6e81e68a836eL

    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    iput-object v2, v1, Lyyds/ᛴᛱᛱᛸ;->ᛱᛳᛶᛳ:Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {v1}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 286
    .line 287
    .line 288
    const-wide v2, -0x6e84e68a836eL

    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    new-instance v3, Lyyds/ᲁᛳᛸᛳ;

    .line 298
    .line 299
    invoke-direct {v3, v0, p0, v7}, Lyyds/ᲁᛳᛸᛳ;-><init>(Lyyds/ᛴᲁᛱᲇ;Lyyds/ᲁᛴᛲᛱ;I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1, v2, v3}, Lyyds/ᛵᛱᲀᛱ;->ᛵᛸᛵᛶ(Ljava/lang/String;Lyyds/ᛵᛱᛱᛴ;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-virtual {v1, p0}, Lyyds/ᛴᛱᛱᛸ;->ᛵᲈᲇᛵ(Landroid/content/Context;)V

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :pswitch_5
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast p1, Landroid/content/Context;

    .line 316
    .line 317
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast p0, Landroid/widget/EditText;

    .line 320
    .line 321
    instance-of v0, p1, Landroid/app/Activity;

    .line 322
    .line 323
    if-eqz v0, :cond_1

    .line 324
    .line 325
    check-cast p1, Landroid/app/Activity;

    .line 326
    .line 327
    goto :goto_1

    .line 328
    :cond_1
    move-object p1, v8

    .line 329
    :goto_1
    if-nez p1, :cond_2

    .line 330
    .line 331
    invoke-static {}, Lcom/ss/android/ugc/aweme/utils/ActivityStack;->getTopActivity()Landroid/app/Activity;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    :cond_2
    if-nez p1, :cond_3

    .line 336
    .line 337
    const-wide p0, -0x82f3e68a836eL

    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 347
    .line 348
    .line 349
    goto :goto_2

    .line 350
    :cond_3
    new-instance v0, Landroid/content/Intent;

    .line 351
    .line 352
    const-wide v3, -0x82fce68a836eL

    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 365
    .line 366
    .line 367
    :try_start_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 368
    .line 369
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    sput-object v1, Lyyds/ᛴᛶᲀᛲ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 373
    .line 374
    const-wide v1, -0x8325e68a836eL

    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    invoke-static {v0, p0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    const/16 v0, 0x19d0

    .line 388
    .line 389
    invoke-virtual {p1, p0, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 390
    .line 391
    .line 392
    goto :goto_2

    .line 393
    :catch_0
    move-exception v0

    .line 394
    move-object p0, v0

    .line 395
    sput-object v8, Lyyds/ᛴᛶᲀᛲ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 396
    .line 397
    const-wide v0, -0x832de68a836eL

    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    invoke-static {p1}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 407
    .line 408
    .line 409
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 410
    .line 411
    const-wide v0, -0x8336e68a836eL

    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 421
    .line 422
    .line 423
    :goto_2
    return-void

    .line 424
    :pswitch_6
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast p1, Lyyds/ᛳᛲᛸᛳ;

    .line 427
    .line 428
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast p0, Lyyds/ᛱᛷᲁᲁ;

    .line 431
    .line 432
    iget-object v1, p1, Lyyds/ᛳᛲᛸᛳ;->ᛵᛶᛲᲀ:Landroid/widget/TextView;

    .line 433
    .line 434
    iget-object v0, p1, Lyyds/ᛳᛲᛸᛳ;->ᛶᛸᲀᲁ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 435
    .line 436
    iget-object v2, v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᲈᛴᲈ:Lyyds/ᛶᲀᲈᛵ;

    .line 437
    .line 438
    if-nez v2, :cond_4

    .line 439
    .line 440
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    const-wide v0, -0x4c459e68a836eL

    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    invoke-static {p0, p1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 454
    .line 455
    .line 456
    move-result-object p0

    .line 457
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 458
    .line 459
    .line 460
    goto :goto_4

    .line 461
    :cond_4
    invoke-virtual {v0, v1}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛷᛲᲁ(Landroid/view/View;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 465
    .line 466
    .line 467
    const-wide v3, -0x4c468e68a836eL

    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 477
    .line 478
    .line 479
    :try_start_1
    iget-object v3, p0, Lyyds/ᛱᛷᲁᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 480
    .line 481
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    new-instance v4, Lyyds/ᲈᛳᲀ;

    .line 486
    .line 487
    invoke-direct {v4, v0, p1, p0}, Lyyds/ᲈᛳᲀ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;Lyyds/ᛳᛲᛸᛳ;Lyyds/ᛱᛷᲁᲁ;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v2, v3, v4}, Lyyds/ᛶᲀᲈᛵ;->ᛶᛷᛲᲁ(Ljava/util/List;Lyyds/ᲈᛳᲀ;)V

    .line 491
    .line 492
    .line 493
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 494
    .line 495
    goto :goto_3

    .line 496
    :catchall_0
    move-exception v0

    .line 497
    move-object p0, v0

    .line 498
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 499
    .line 500
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 501
    .line 502
    .line 503
    move-object p0, v0

    .line 504
    :goto_3
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 505
    .line 506
    .line 507
    move-result-object p0

    .line 508
    if-eqz p0, :cond_6

    .line 509
    .line 510
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 511
    .line 512
    .line 513
    const-wide v2, -0x4c46de68a836eL

    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 526
    .line 527
    .line 528
    move-result-object p1

    .line 529
    const-wide v0, -0x4c473e68a836eL

    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object p0

    .line 542
    if-nez p0, :cond_5

    .line 543
    .line 544
    const-wide v1, -0x4c47ce68a836eL

    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p0

    .line 553
    :cond_5
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object p0

    .line 557
    invoke-static {p1, p0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 558
    .line 559
    .line 560
    move-result-object p0

    .line 561
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 562
    .line 563
    .line 564
    :cond_6
    :goto_4
    return-void

    .line 565
    :pswitch_7
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast p1, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 568
    .line 569
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast p0, Lyyds/ᛳᛲᛸᛳ;

    .line 572
    .line 573
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 574
    .line 575
    invoke-virtual {p1, p0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛷᛲᲁ(Landroid/view/View;)V

    .line 576
    .line 577
    .line 578
    return-void

    .line 579
    :pswitch_8
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast p1, Lyyds/ᛵᲇᲀ;

    .line 582
    .line 583
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast p0, Lyyds/ᲀᛳᲈᛱ;

    .line 586
    .line 587
    iget-object p1, p1, Lyyds/ᛵᲇᲀ;->ᛶᲈᛴᲈ:Lyyds/ᛷᛴᲈᲀ;

    .line 588
    .line 589
    invoke-interface {p1, p0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    return-void

    .line 593
    :pswitch_9
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast p1, Lyyds/ᛵᛵᛵᛸ;

    .line 596
    .line 597
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast p0, Lyyds/ᛴᛳᲈᛶ;

    .line 600
    .line 601
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ()I

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-eq v0, v1, :cond_9

    .line 606
    .line 607
    iget-object p0, p0, Lyyds/ᛴᛳᲈᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 608
    .line 609
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    invoke-virtual {p0, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result p0

    .line 617
    xor-int/lit8 v1, p0, 0x1

    .line 618
    .line 619
    iget-object v2, p1, Lyyds/ᛵᛵᛵᛸ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛳᲈᛶ;

    .line 620
    .line 621
    iget-object v3, v2, Lyyds/ᛴᛳᲈᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 622
    .line 623
    if-nez p0, :cond_7

    .line 624
    .line 625
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 626
    .line 627
    .line 628
    move-result-object p0

    .line 629
    invoke-virtual {v3, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result p0

    .line 633
    goto :goto_5

    .line 634
    :cond_7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 635
    .line 636
    .line 637
    move-result-object p0

    .line 638
    invoke-virtual {v3, p0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    move-result p0

    .line 642
    :goto_5
    if-eqz p0, :cond_8

    .line 643
    .line 644
    iget-object p0, v2, Lyyds/ᛴᛳᲈᛶ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛵᛱᛱ;

    .line 645
    .line 646
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 647
    .line 648
    .line 649
    move-result v0

    .line 650
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    invoke-virtual {p0, v0}, Lyyds/ᲀᛵᛱᛱ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    :cond_8
    invoke-virtual {p1, v1}, Lyyds/ᛵᛵᛵᛸ;->ᛵᛶᛲᲀ(Z)V

    .line 658
    .line 659
    .line 660
    :cond_9
    return-void

    .line 661
    :pswitch_a
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 662
    .line 663
    check-cast p1, Landroid/content/Context;

    .line 664
    .line 665
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast p0, Lyyds/ᛷᲀᲇᲈ;

    .line 668
    .line 669
    iget-object p0, p0, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 670
    .line 671
    check-cast p0, Landroid/widget/EditText;

    .line 672
    .line 673
    const-wide v0, -0xbaefe68a836eL

    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    instance-of v0, p1, Landroid/app/Activity;

    .line 682
    .line 683
    if-eqz v0, :cond_a

    .line 684
    .line 685
    check-cast p1, Landroid/app/Activity;

    .line 686
    .line 687
    goto :goto_6

    .line 688
    :cond_a
    move-object p1, v8

    .line 689
    :goto_6
    if-nez p1, :cond_b

    .line 690
    .line 691
    invoke-static {}, Lcom/ss/android/ugc/aweme/utils/ActivityStack;->getTopActivity()Landroid/app/Activity;

    .line 692
    .line 693
    .line 694
    move-result-object p1

    .line 695
    :cond_b
    if-nez p1, :cond_c

    .line 696
    .line 697
    const-wide p0, -0xba4de68a836eL

    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object p0

    .line 706
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 707
    .line 708
    .line 709
    goto :goto_7

    .line 710
    :cond_c
    new-instance v0, Landroid/content/Intent;

    .line 711
    .line 712
    const-wide v3, -0xba56e68a836eL

    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 725
    .line 726
    .line 727
    :try_start_2
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 728
    .line 729
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    sput-object v1, Lyyds/ᲀᛴᛱᛷ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 733
    .line 734
    const-wide v1, -0xba7fe68a836eL

    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object p0

    .line 743
    invoke-static {v0, p0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 744
    .line 745
    .line 746
    move-result-object p0

    .line 747
    const/16 v0, 0x19d1

    .line 748
    .line 749
    invoke-virtual {p1, p0, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    .line 750
    .line 751
    .line 752
    goto :goto_7

    .line 753
    :catch_1
    move-exception v0

    .line 754
    move-object p0, v0

    .line 755
    sput-object v8, Lyyds/ᲀᛴᛱᛷ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 756
    .line 757
    const-wide v0, -0xba87e68a836eL

    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object p1

    .line 766
    invoke-static {p1}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 767
    .line 768
    .line 769
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 770
    .line 771
    const-wide v0, -0xba90e68a836eL

    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 781
    .line 782
    .line 783
    :goto_7
    return-void

    .line 784
    :pswitch_b
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast p1, Ljava/lang/String;

    .line 787
    .line 788
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 789
    .line 790
    check-cast p0, Lyyds/ᛷᲀᲇᲈ;

    .line 791
    .line 792
    new-array v0, v9, [C

    .line 793
    .line 794
    const/16 v1, 0x2f

    .line 795
    .line 796
    aput-char v1, v0, v7

    .line 797
    .line 798
    invoke-static {p1, v0}, Lyyds/ᛲᲇᛸᲇ;->ᛴᛸᛴᛸ(Ljava/lang/String;[C)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object p1

    .line 802
    iget-object p0, p0, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 803
    .line 804
    check-cast p0, Landroid/widget/EditText;

    .line 805
    .line 806
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 810
    .line 811
    .line 812
    move-result p1

    .line 813
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 814
    .line 815
    .line 816
    return-void

    .line 817
    :pswitch_c
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 818
    .line 819
    check-cast p1, Landroid/content/Context;

    .line 820
    .line 821
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast p0, Lyyds/ᛶᛱᲇᛶ;

    .line 824
    .line 825
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    new-instance v1, Lyyds/ᛱᲁᛴᛴ;

    .line 830
    .line 831
    const/4 v2, 0x6

    .line 832
    invoke-direct {v1, p1, p0, v8, v2}, Lyyds/ᛱᲁᛴᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 833
    .line 834
    .line 835
    invoke-static {v0, v8, v1, v6}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 836
    .line 837
    .line 838
    return-void

    .line 839
    :pswitch_d
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast p1, Landroid/widget/FrameLayout;

    .line 842
    .line 843
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast p0, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 846
    .line 847
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 848
    .line 849
    .line 850
    move-result-object p1

    .line 851
    const-wide v0, -0x3a69de68a836eL

    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    invoke-static {p1, p0}, Lyyds/ᛱᛷᲈᛲ;->ᲀᛲᛲᲇ(Landroid/content/Context;Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V

    .line 860
    .line 861
    .line 862
    return-void

    .line 863
    :pswitch_e
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 864
    .line 865
    check-cast p1, Landroid/view/View;

    .line 866
    .line 867
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast p0, Landroid/widget/TextView;

    .line 870
    .line 871
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 872
    .line 873
    .line 874
    move-result-object p1

    .line 875
    const-wide v0, -0x3dafce68a836eL

    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 884
    .line 885
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 886
    .line 887
    .line 888
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛶᛷᛶᛲ:Lyyds/ᛳᲀᛲ;

    .line 889
    .line 890
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 891
    .line 892
    const/16 v2, 0x4f

    .line 893
    .line 894
    aget-object v1, v1, v2

    .line 895
    .line 896
    invoke-virtual {v0, v1}, Lyyds/ᛳᲀᛲ;->ᛲᲈᲁ(Lyyds/ᲀᛴᛶᲇ;)Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    check-cast v0, Ljava/util/Set;

    .line 901
    .line 902
    new-instance v1, Lyyds/ᛵᛸᛵᲀ;

    .line 903
    .line 904
    invoke-direct {v1, p0, v6}, Lyyds/ᛵᛸᛵᲀ;-><init>(Landroid/widget/TextView;I)V

    .line 905
    .line 906
    .line 907
    const-wide v2, -0xb066e68a836eL

    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    const-wide v2, -0xb06ee68a836eL

    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    const-wide v2, -0xb07de68a836eL

    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    new-instance p0, Lyyds/ᛱᛷᛸᲈ;

    .line 932
    .line 933
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 934
    .line 935
    .line 936
    invoke-static {v0}, Lyyds/ᛷᛷᛶᲇ;->ᛶᛵᛸᛲ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 937
    .line 938
    .line 939
    move-result-object v2

    .line 940
    iput-object v2, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 941
    .line 942
    invoke-static {p1}, Lyyds/ᛴᛱᛱᛸ;->ᛶᲀᲈᲇ(Landroid/content/Context;)Lyyds/ᛴᛱᛱᛸ;

    .line 943
    .line 944
    .line 945
    move-result-object v2

    .line 946
    iput-boolean v7, v2, Lyyds/ᛴᛱᛱᛸ;->ᲀᛴᲁᲈ:Z

    .line 947
    .line 948
    const-wide v3, -0xb08ee68a836eL

    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v3

    .line 957
    iput-object v3, v2, Lyyds/ᛴᛱᛱᛸ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 958
    .line 959
    invoke-virtual {v2}, Lyyds/ᛴᛱᛱᛸ;->ᲁᛵᲁᲁ()V

    .line 960
    .line 961
    .line 962
    new-instance v3, Lyyds/ᛸᛶᲇᛴ;

    .line 963
    .line 964
    invoke-direct {v3, v0, p0}, Lyyds/ᛸᛶᲇᛴ;-><init>(Ljava/util/Set;Lyyds/ᛱᛷᛸᲈ;)V

    .line 965
    .line 966
    .line 967
    iput-object v3, v2, Lyyds/ᛴᛱᛱᛸ;->ᛵᲀᛵᛸ:Lyyds/ᛸᲀᛷᲀ;

    .line 968
    .line 969
    invoke-virtual {v2}, Lyyds/ᛴᛱᛱᛸ;->ᲁᛵᲁᲁ()V

    .line 970
    .line 971
    .line 972
    const-wide v3, -0xb095e68a836eL

    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    new-instance v3, Lyyds/ᛷᛶᛶᛴ;

    .line 982
    .line 983
    invoke-direct {v3, v1, v9, p0}, Lyyds/ᛷᛶᛶᛴ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 984
    .line 985
    .line 986
    invoke-virtual {v2, v0, v3}, Lyyds/ᛴᛱᛱᛸ;->ᛴᛸᛴᛸ(Ljava/lang/String;Lyyds/ᛶᛷᛳᛷ;)V

    .line 987
    .line 988
    .line 989
    const-wide v0, -0xb098e68a836eL

    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object p0

    .line 998
    invoke-virtual {v2, p0}, Lyyds/ᛴᛱᛱᛸ;->ᛳᛷᛶᛲ(Ljava/lang/CharSequence;)Lyyds/ᛴᛱᛱᛸ;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v2, p1}, Lyyds/ᛴᛱᛱᛸ;->ᛵᲈᲇᛵ(Landroid/content/Context;)V

    .line 1002
    .line 1003
    .line 1004
    return-void

    .line 1005
    :pswitch_f
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast p1, Lyyds/ᛴᛸᛵᲈ;

    .line 1008
    .line 1009
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1010
    .line 1011
    check-cast p0, Lyyds/ᛵᲇᛵᲇ;

    .line 1012
    .line 1013
    sget-object v0, Lyyds/ᛱᛲᛳᲀ;->ᛲᲈᲁ:Lyyds/ᛱᛲᛳᲀ;

    .line 1014
    .line 1015
    sput-object v8, Lyyds/ᛱᛲᛳᲀ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛷᲈᛶ;

    .line 1016
    .line 1017
    invoke-virtual {p1}, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ()V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {p0}, Lyyds/ᛵᲇᛵᲇ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    return-void

    .line 1024
    :pswitch_10
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1025
    .line 1026
    check-cast p1, Lyyds/ᛶᛱᛲᛸ;

    .line 1027
    .line 1028
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1029
    .line 1030
    check-cast p0, Lyyds/ᲀᲁᛴᲇ;

    .line 1031
    .line 1032
    iget-object p1, p1, Lyyds/ᛶᛱᛲᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᲁᲈ;

    .line 1033
    .line 1034
    invoke-virtual {p1, p0}, Lyyds/ᛷᛶᲁᲈ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    return-void

    .line 1038
    :pswitch_11
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1039
    .line 1040
    check-cast p1, Lyyds/ᛶᲈᛲᛵ;

    .line 1041
    .line 1042
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1043
    .line 1044
    check-cast p0, Lyyds/ᲁᛵᛶ;

    .line 1045
    .line 1046
    iget-object p1, p1, Lyyds/ᛶᲈᛲᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛴᲈᲀ;

    .line 1047
    .line 1048
    check-cast p1, Lyyds/ᛲᲈᛳᲈ;

    .line 1049
    .line 1050
    invoke-virtual {p1, p0}, Lyyds/ᛲᲈᛳᲈ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    return-void

    .line 1054
    :pswitch_12
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1055
    .line 1056
    check-cast p1, Landroid/widget/TextView;

    .line 1057
    .line 1058
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1059
    .line 1060
    check-cast p0, Ljava/lang/String;

    .line 1061
    .line 1062
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1063
    .line 1064
    .line 1065
    return-void

    .line 1066
    :pswitch_13
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1067
    .line 1068
    check-cast p1, Lyyds/ᛱᛸᛳᛱ;

    .line 1069
    .line 1070
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1071
    .line 1072
    check-cast p0, Landroid/app/AlertDialog;

    .line 1073
    .line 1074
    iget-object v0, p1, Lyyds/ᛱᛸᛳᛱ;->ᲈᛷᲈᛶ:Lyyds/ᲈᛴᛱᛷ;

    .line 1075
    .line 1076
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1077
    .line 1078
    .line 1079
    move-result v0

    .line 1080
    if-eqz v0, :cond_10

    .line 1081
    .line 1082
    if-ne v0, v9, :cond_f

    .line 1083
    .line 1084
    iget-object v0, p1, Lyyds/ᛱᛸᛳᛱ;->ᛱᛸᲁᲇ:Ljava/io/File;

    .line 1085
    .line 1086
    if-eqz v0, :cond_e

    .line 1087
    .line 1088
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 1089
    .line 1090
    .line 1091
    move-result v1

    .line 1092
    if-eqz v1, :cond_e

    .line 1093
    .line 1094
    iget-object v1, p1, Lyyds/ᛱᛸᛳᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᲁᛴ;

    .line 1095
    .line 1096
    if-eqz v1, :cond_d

    .line 1097
    .line 1098
    invoke-interface {v1, v0, p0}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    :cond_d
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛱ;->ᛵᛸᛸᛷ()V

    .line 1102
    .line 1103
    .line 1104
    goto :goto_8

    .line 1105
    :cond_e
    const-wide p0, -0x98a5e68a836eL

    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object p0

    .line 1114
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 1115
    .line 1116
    .line 1117
    goto :goto_8

    .line 1118
    :cond_f
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 1119
    .line 1120
    .line 1121
    goto :goto_8

    .line 1122
    :cond_10
    iget-object v0, p1, Lyyds/ᛱᛸᛳᛱ;->ᛱᛳᛶᛳ:Lyyds/ᲁᲇᲈᲁ;

    .line 1123
    .line 1124
    if-eqz v0, :cond_12

    .line 1125
    .line 1126
    iget-object v0, v0, Lyyds/ᲁᲇᲈᲁ;->ᛱᲈᲁ:Ljava/io/File;

    .line 1127
    .line 1128
    if-eqz v0, :cond_12

    .line 1129
    .line 1130
    iget-object v1, p1, Lyyds/ᛱᛸᛳᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛲᲇᲁᛴ;

    .line 1131
    .line 1132
    if-eqz v1, :cond_11

    .line 1133
    .line 1134
    invoke-interface {v1, v0, p0}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    :cond_11
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛱ;->ᛵᛸᛸᛷ()V

    .line 1138
    .line 1139
    .line 1140
    :cond_12
    :goto_8
    return-void

    .line 1141
    :pswitch_14
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1142
    .line 1143
    check-cast p1, Lyyds/ᛱᛶᛵᛲ;

    .line 1144
    .line 1145
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1146
    .line 1147
    check-cast p0, Lyyds/ᲁᲇᲈᲁ;

    .line 1148
    .line 1149
    iget-object v0, p0, Lyyds/ᲁᲇᲈᲁ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 1150
    .line 1151
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ()I

    .line 1152
    .line 1153
    .line 1154
    move-result p1

    .line 1155
    if-eq p1, v1, :cond_13

    .line 1156
    .line 1157
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1158
    .line 1159
    .line 1160
    move-result v1

    .line 1161
    if-ge p1, v1, :cond_13

    .line 1162
    .line 1163
    iget-object p0, p0, Lyyds/ᲁᲇᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛶᛲᛸ;

    .line 1164
    .line 1165
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v1

    .line 1169
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    move-result-object p1

    .line 1173
    invoke-virtual {p0, v1, p1}, Lyyds/ᛸᛶᛲᛸ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1174
    .line 1175
    .line 1176
    :cond_13
    return-void

    .line 1177
    :pswitch_15
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1178
    .line 1179
    check-cast p1, Lyyds/ᛷᲀᲇᲈ;

    .line 1180
    .line 1181
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1182
    .line 1183
    check-cast p0, Lyyds/ᛱᛷᛸᲈ;

    .line 1184
    .line 1185
    iget-object p0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 1186
    .line 1187
    if-nez p0, :cond_14

    .line 1188
    .line 1189
    const-wide v0, -0xc3ace68a836eL

    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1195
    .line 1196
    .line 1197
    goto :goto_9

    .line 1198
    :cond_14
    move-object v8, p0

    .line 1199
    check-cast v8, Lyyds/ᛲᛳᛶᲁ;

    .line 1200
    .line 1201
    :goto_9
    invoke-static {p1, v8}, Lyyds/ᲀᲀᛸᛱ;->ᛲᛲᲈᲈ(Lyyds/ᛷᲀᲇᲈ;Lyyds/ᛲᛳᛶᲁ;)V

    .line 1202
    .line 1203
    .line 1204
    const-wide p0, -0xc3b4e68a836eL

    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object p0

    .line 1213
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 1214
    .line 1215
    .line 1216
    return-void

    .line 1217
    :pswitch_16
    iget-object p1, p0, Lyyds/ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1218
    .line 1219
    check-cast p1, Lyyds/ᛲᛳᛶᲁ;

    .line 1220
    .line 1221
    iget-object p0, p0, Lyyds/ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1222
    .line 1223
    check-cast p0, Lyyds/ᛲᛴᛳᛲ;

    .line 1224
    .line 1225
    iget-object p1, p1, Lyyds/ᛲᛳᛶᲁ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛲᲀ;

    .line 1226
    .line 1227
    invoke-virtual {p1, p0}, Lyyds/ᲈᲀᛲᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1228
    .line 1229
    .line 1230
    return-void

    .line 1231
    :pswitch_data_0
    .packed-switch 0x0
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
