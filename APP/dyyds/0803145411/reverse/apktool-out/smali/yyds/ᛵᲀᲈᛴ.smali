.class public final synthetic Lyyds/ᛵᲀᲈᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p4, p0, Lyyds/ᛵᲀᲈᛴ;->ᲀᛲᛳᲀ:I

    iput-object p1, p0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᲁᛶᲁᲀ;Lyyds/ᛴᛱᛱᛸ;Ljava/util/LinkedHashMap;)V
    .locals 1

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    iput v0, p0, Lyyds/ᛵᲀᲈᛴ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᲈᛶᛱᛱ;Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 1

    .line 16
    const/16 v0, 0xd

    iput v0, p0, Lyyds/ᛵᲀᲈᛴ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x3

    .line 11
    const/4 v8, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lyyds/ᛷᛳᲈᛲ;

    .line 18
    .line 19
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Landroid/content/Context;

    .line 22
    .line 23
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lyyds/ᛴᛱᛱᛸ;

    .line 26
    .line 27
    iget-object v3, v1, Lyyds/ᛷᛳᲈᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Landroid/widget/EditText;

    .line 30
    .line 31
    invoke-static {v3}, Lyyds/ᛴᛷᛷᲇ;->ᛷᲈᲈᲁ(Landroid/widget/EditText;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget-object v4, v1, Lyyds/ᛷᛳᲈᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, Landroid/widget/EditText;

    .line 38
    .line 39
    invoke-static {v4}, Lyyds/ᛴᛷᛷᲇ;->ᛷᲈᲈᲁ(Landroid/widget/EditText;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object v1, v1, Lyyds/ᛷᛳᲈᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Landroid/widget/EditText;

    .line 46
    .line 47
    invoke-static {v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᲈᲈᲁ(Landroid/widget/EditText;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-nez v5, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-nez v5, :cond_2

    .line 70
    .line 71
    :goto_0
    const-wide v0, -0xadbae68a836eL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :cond_2
    sget-object v5, Lyyds/ᛳᲁᛱᲁ;->ᛲᲈᲁ:Lyyds/ᛳᲁᛱᲁ;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const-wide v5, -0x22153e68a836eL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    const-wide v5, -0x2215be68a836eL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    const-wide v5, -0x22165e68a836eL

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    const-wide v5, -0x2216ee68a836eL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    invoke-static {v2}, Lyyds/ᛳᲁᛱᲁ;->ᛵᛸᛸᛷ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const-wide v5, -0x22177e68a836eL

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-interface {v2, v5, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 140
    .line 141
    .line 142
    const-wide v5, -0x22182e68a836eL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-interface {v2, v5, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 152
    .line 153
    .line 154
    const-wide v5, -0x2218be68a836eL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-interface {v2, v5, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 164
    .line 165
    .line 166
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 167
    .line 168
    .line 169
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 170
    .line 171
    .line 172
    invoke-static {}, Lyyds/ᲀᛸ;->ᛲᲈᲁ()Lcom/tencent/mmkv/MMKV;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    const-wide v5, -0x22194e68a836eL

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-virtual {v2, v5, v3}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 186
    .line 187
    .line 188
    invoke-static {}, Lyyds/ᲀᛸ;->ᛲᲈᲁ()Lcom/tencent/mmkv/MMKV;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    const-wide v5, -0x2219fe68a836eL

    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-virtual {v2, v3, v4}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 202
    .line 203
    .line 204
    invoke-static {}, Lyyds/ᲀᛸ;->ᛲᲈᲁ()Lcom/tencent/mmkv/MMKV;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    const-wide v3, -0x221a8e68a836eL

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-virtual {v2, v3, v1}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 218
    .line 219
    .line 220
    const-wide v1, -0xadc2e68a836eL

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-static {v1}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 233
    .line 234
    .line 235
    :goto_1
    return-void

    .line 236
    :pswitch_0
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v1, Lyyds/ᛴᲁᛱᲇ;

    .line 239
    .line 240
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v2, Landroid/widget/TextView;

    .line 243
    .line 244
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Lyyds/ᛲᲀᛶᛲ;

    .line 247
    .line 248
    iget v3, v1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 249
    .line 250
    add-int/2addr v3, v5

    .line 251
    rem-int/2addr v3, v7

    .line 252
    iput v3, v1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 253
    .line 254
    if-eq v3, v5, :cond_4

    .line 255
    .line 256
    if-eq v3, v4, :cond_3

    .line 257
    .line 258
    const-wide v3, -0x37f4fe68a836eL

    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    goto :goto_2

    .line 268
    :cond_3
    const-wide v3, -0x37f4ce68a836eL

    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    goto :goto_2

    .line 278
    :cond_4
    const-wide v3, -0x37f47e68a836eL

    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    :goto_2
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Lyyds/ᛲᲀᛶᛲ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :pswitch_1
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v1, Landroid/widget/EditText;

    .line 297
    .line 298
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v2, Lyyds/ᛷᛴᲈᲀ;

    .line 301
    .line 302
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Landroid/app/Dialog;

    .line 305
    .line 306
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-nez v3, :cond_5

    .line 311
    .line 312
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    :cond_5
    invoke-interface {v2, v8}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    check-cast v1, Ljava/lang/Boolean;

    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_6

    .line 331
    .line 332
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 333
    .line 334
    .line 335
    :cond_6
    return-void

    .line 336
    :pswitch_2
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v1, Lcom/ss/ugc/aweme/ImageUrlStruct;

    .line 339
    .line 340
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 341
    .line 342
    move-object v9, v2

    .line 343
    check-cast v9, Landroid/content/Context;

    .line 344
    .line 345
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 346
    .line 347
    move-object v10, v0

    .line 348
    check-cast v10, Ljava/lang/String;

    .line 349
    .line 350
    sget-object v0, Lyyds/ᲈᛲᲀ;->ᛲᲈᲁ:Ljava/util/Map;

    .line 351
    .line 352
    iget-object v0, v1, Lcom/ss/ugc/aweme/ImageUrlStruct;->video:Lcom/ss/android/ugc/aweme/feed/model/Video;

    .line 353
    .line 354
    invoke-static {v0}, Lyyds/ᲈᛲᲀ;->ᛲᛳᛶᲁ(Lcom/ss/android/ugc/aweme/feed/model/Video;)Ljava/util/List;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    const/4 v12, 0x0

    .line 359
    if-eqz v0, :cond_8

    .line 360
    .line 361
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    if-eqz v1, :cond_7

    .line 366
    .line 367
    goto :goto_3

    .line 368
    :cond_7
    invoke-static {v0}, Lyyds/ᛷᛷᛶᲇ;->ᛸᛸᛷᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    move-object v11, v0

    .line 373
    check-cast v11, Ljava/lang/String;

    .line 374
    .line 375
    sget-object v0, Lyyds/ᛶᛵᛲᛲ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

    .line 376
    .line 377
    const-wide v0, -0x1e4cae68a836eL

    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    new-instance v8, Lyyds/ᛵᛶᲁᛲ;

    .line 390
    .line 391
    const/4 v13, 0x2

    .line 392
    invoke-direct/range {v8 .. v13}, Lyyds/ᛵᛶᲁᛲ;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 393
    .line 394
    .line 395
    invoke-static {v0, v12, v8, v7}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 396
    .line 397
    .line 398
    goto :goto_5

    .line 399
    :cond_8
    :goto_3
    sget-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 400
    .line 401
    const-wide v1, -0xbff3e68a836eL

    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    const-wide v4, -0x2a505e68a836eL

    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    const-wide v4, -0x2a50de68a836eL

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    invoke-static {v1}, Lyyds/ᛷᲀᛳᛱ;->ᛳᛷᛶᛲ(Ljava/lang/CharSequence;)Lyyds/ᛷᲀᛳᛱ;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    :try_start_0
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    new-instance v2, Lyyds/ᲇᛷᛱᲈ;

    .line 438
    .line 439
    invoke-direct {v2, v9, v10, v12, v3}, Lyyds/ᲇᛷᛱᲈ;-><init>(Landroid/content/Context;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 440
    .line 441
    .line 442
    invoke-static {v0, v12, v2, v7}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 443
    .line 444
    .line 445
    :goto_4
    invoke-virtual {v1}, Lyyds/ᛷᲀᛳᛱ;->ᛷᛴᛴᲁ()V

    .line 446
    .line 447
    .line 448
    goto :goto_5

    .line 449
    :catch_0
    move-exception v0

    .line 450
    :try_start_1
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 451
    .line 452
    const-wide v3, -0x2a513e68a836eL

    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-virtual {v2, v3, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 462
    .line 463
    .line 464
    goto :goto_4

    .line 465
    :goto_5
    return-void

    .line 466
    :catchall_0
    move-exception v0

    .line 467
    invoke-virtual {v1}, Lyyds/ᛷᲀᛳᛱ;->ᛷᛴᛴᲁ()V

    .line 468
    .line 469
    .line 470
    throw v0

    .line 471
    :pswitch_3
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v1, Ljava/lang/String;

    .line 474
    .line 475
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v2, Landroid/content/Context;

    .line 478
    .line 479
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v0, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 482
    .line 483
    if-eqz v1, :cond_a

    .line 484
    .line 485
    invoke-static {v1}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    if-eqz v1, :cond_9

    .line 490
    .line 491
    goto :goto_6

    .line 492
    :cond_9
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    new-instance v3, Lyyds/ᲇᛳᲇ;

    .line 497
    .line 498
    invoke-direct {v3, v2, v0, v8, v5}, Lyyds/ᲇᛳᲇ;-><init>(Landroid/content/Context;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 499
    .line 500
    .line 501
    invoke-static {v1, v8, v3, v7}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 502
    .line 503
    .line 504
    goto :goto_7

    .line 505
    :cond_a
    :goto_6
    const-wide v0, -0xbfebe68a836eL

    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 515
    .line 516
    .line 517
    :goto_7
    return-void

    .line 518
    :pswitch_4
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast v1, Lyyds/ᛴᲁᛱᲇ;

    .line 521
    .line 522
    iget-object v3, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v3, Lyyds/ᲈᛱᛷᛵ;

    .line 525
    .line 526
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v0, Lyyds/ᛴᲁᛱᲇ;

    .line 529
    .line 530
    sget-object v4, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 531
    .line 532
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛶᛵᛸᛳ()I

    .line 536
    .line 537
    .line 538
    move-result v4

    .line 539
    if-ne v4, v2, :cond_b

    .line 540
    .line 541
    goto :goto_8

    .line 542
    :cond_b
    move v5, v6

    .line 543
    :goto_8
    if-eqz v5, :cond_c

    .line 544
    .line 545
    sget-object v4, Lyyds/ᛷᛳᛲᛳ;->ᛷᛶᛷᲀ:Lyyds/ᛳᲀᛲ;

    .line 546
    .line 547
    sget-object v7, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 548
    .line 549
    const/16 v9, 0x1f

    .line 550
    .line 551
    aget-object v7, v7, v9

    .line 552
    .line 553
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 554
    .line 555
    .line 556
    move-result-object v9

    .line 557
    invoke-virtual {v4, v7, v9}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    iget v4, v1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 561
    .line 562
    if-ne v4, v2, :cond_c

    .line 563
    .line 564
    iput v6, v1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 565
    .line 566
    invoke-static {v3, v1}, Lyyds/ᛱᛱᛳᛶ;->ᲇᲈᛵᛷ(Lyyds/ᲈᛱᛷᛵ;Lyyds/ᛴᲁᛱᲇ;)V

    .line 567
    .line 568
    .line 569
    :cond_c
    sget-object v1, Lyyds/ᛵᛴᲇ;->ᛲᲈᲁ:Lyyds/ᛵᛴᲇ;

    .line 570
    .line 571
    sget-object v1, Lyyds/ᛵᛴᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 572
    .line 573
    monitor-enter v1

    .line 574
    :try_start_2
    sget-wide v6, Lyyds/ᛵᛴᲇ;->ᲀᛲᛳᲀ:J

    .line 575
    .line 576
    const-wide/16 v9, 0x1

    .line 577
    .line 578
    add-long/2addr v6, v9

    .line 579
    sput-wide v6, Lyyds/ᛵᛴᲇ;->ᲀᛲᛳᲀ:J

    .line 580
    .line 581
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲀᲇᛶᲈ()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    invoke-static {v2}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    const-wide v6, -0x1ff4de68a836eL

    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    invoke-static {v4}, Lyyds/ᛷᛳᛲᛳ;->ᛵᲁᛴᛴ(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    const-wide v6, -0x1ffd8e68a836eL

    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    invoke-static {v4}, Lyyds/ᛷᛳᛲᛳ;->ᛷᛴᛶᛳ(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    sput-object v8, Lyyds/ᛵᛴᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛴᛴ;

    .line 621
    .line 622
    sput-object v8, Lyyds/ᛵᛴᲇ;->ᛲᛴᛳᛲ:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 623
    .line 624
    monitor-exit v1

    .line 625
    if-nez v2, :cond_d

    .line 626
    .line 627
    invoke-static {}, Lyyds/ᛵᛴᲇ;->ᲇᲇᲇᛱ()V

    .line 628
    .line 629
    .line 630
    :cond_d
    if-nez v2, :cond_e

    .line 631
    .line 632
    const-wide v1, -0xd330e68a836eL

    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    invoke-static {v1}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 642
    .line 643
    .line 644
    goto :goto_9

    .line 645
    :cond_e
    const-wide v1, -0xd33be68a836eL

    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    invoke-static {v1}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 655
    .line 656
    .line 657
    :goto_9
    if-eqz v5, :cond_f

    .line 658
    .line 659
    invoke-static {}, Lyyds/ᛱᛶᛳᛷ;->ᛵᛲᛵᲁ()V

    .line 660
    .line 661
    .line 662
    :cond_f
    invoke-static {v3, v0}, Lyyds/ᛱᛱᛳᛶ;->ᲀᛲᛳᲀ(Lyyds/ᲈᛱᛷᛵ;Lyyds/ᛴᲁᛱᲇ;)V

    .line 663
    .line 664
    .line 665
    return-void

    .line 666
    :catchall_1
    move-exception v0

    .line 667
    monitor-exit v1

    .line 668
    throw v0

    .line 669
    :pswitch_5
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 670
    .line 671
    check-cast v1, Lyyds/ᛲᲈᛷᛳ;

    .line 672
    .line 673
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 674
    .line 675
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 676
    .line 677
    move-object v3, v0

    .line 678
    check-cast v3, Landroid/content/Context;

    .line 679
    .line 680
    sget v0, Lyyds/ᲁᛸᛵᲁ;->ᛲᲈᲁ:I

    .line 681
    .line 682
    iget-object v0, v1, Lyyds/ᛲᲈᛷᛳ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 683
    .line 684
    invoke-static {v0}, Lyyds/ᛲᲇᲁᛳ;->ᛷᛵᲇᲀ(Ljava/lang/Object;)Lyyds/ᲀᛵᲁᛴ;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-virtual {v0}, Lyyds/ᲀᛵᲁᛴ;->ᛶᲈᛴᲈ()Lyyds/ᛵᲀᲀᛶ;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    new-instance v1, Lyyds/ᛳᛱᛶᛲ;

    .line 693
    .line 694
    const/16 v5, 0x1d

    .line 695
    .line 696
    invoke-direct {v1, v5}, Lyyds/ᛳᛱᛶᛲ;-><init>(I)V

    .line 697
    .line 698
    .line 699
    iput-object v1, v0, Lyyds/ᛵᲀᲀᛶ;->ᛸᛸᛷᛱ:Lyyds/ᛳᛱᛶᛲ;

    .line 700
    .line 701
    invoke-virtual {v0}, Lyyds/ᛵᲀᲀᛶ;->ᛶᛷᛲᲁ()V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v0}, Lyyds/ᛵᲀᲀᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    invoke-static {v0}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛲᛱᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    check-cast v0, Lyyds/ᛳᛲᛶᛴ;

    .line 713
    .line 714
    if-eqz v0, :cond_10

    .line 715
    .line 716
    new-array v1, v6, [Ljava/lang/Object;

    .line 717
    .line 718
    invoke-virtual {v0, v1}, Lyyds/ᛳᛲᛶᛴ;->ᲀᛲᛱᛱ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    check-cast v0, Landroid/widget/PopupWindow;

    .line 723
    .line 724
    move-object v1, v0

    .line 725
    goto :goto_a

    .line 726
    :cond_10
    move-object v1, v8

    .line 727
    :goto_a
    invoke-static {v2}, Lyyds/ᛲᲇᲁᛳ;->ᛷᛵᲇᲀ(Ljava/lang/Object;)Lyyds/ᲀᛵᲁᛴ;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-virtual {v0}, Lyyds/ᲀᛵᲁᛴ;->ᲀᛲᛲᲇ()Lyyds/ᛴᛲᛶᛶ;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    const-wide v9, -0x37187e68a836eL

    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    iput-object v2, v0, Lyyds/ᛴᛲᛶᛶ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 745
    .line 746
    invoke-virtual {v0}, Lyyds/ᛴᛲᛶᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    invoke-static {v0}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛲᛱᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    check-cast v0, Lyyds/ᛷᛵᛶᛳ;

    .line 755
    .line 756
    if-eqz v0, :cond_11

    .line 757
    .line 758
    invoke-virtual {v0}, Lyyds/ᛷᛵᛶᛳ;->ᛱᛳᛶᛳ()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    goto :goto_b

    .line 763
    :cond_11
    move-object v0, v8

    .line 764
    :goto_b
    const-wide v9, -0x371b5e68a836eL

    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    new-array v5, v6, [Ljava/lang/Object;

    .line 774
    .line 775
    if-eqz v0, :cond_12

    .line 776
    .line 777
    :try_start_3
    invoke-static {v0}, Lyyds/ᛲᲇᲁᛳ;->ᛷᛵᲇᲀ(Ljava/lang/Object;)Lyyds/ᲀᛵᲁᛴ;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    iget-object v9, v0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v9, Lyyds/ᛴᛸᛲᛳ;

    .line 784
    .line 785
    iput v4, v9, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 786
    .line 787
    invoke-virtual {v0}, Lyyds/ᲀᛵᲁᛴ;->ᛶᲈᛴᲈ()Lyyds/ᛵᲀᲀᛶ;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-virtual {v0}, Lyyds/ᲇᛴᲇᛶ;->ᲇᲈᛵᛷ()V

    .line 792
    .line 793
    .line 794
    iput-object v2, v0, Lyyds/ᲇᛴᲇᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 795
    .line 796
    const-wide v9, -0x3193de68a836eL

    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v0}, Lyyds/ᛵᲀᲀᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-static {v0}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛲᛱᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    check-cast v0, Lyyds/ᛳᛲᛶᛴ;

    .line 813
    .line 814
    if-eqz v0, :cond_12

    .line 815
    .line 816
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v2

    .line 820
    invoke-virtual {v0, v2}, Lyyds/ᛳᛲᛶᛴ;->ᛱᛳᛶᛳ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    goto :goto_c

    .line 825
    :catch_1
    move-exception v0

    .line 826
    goto :goto_d

    .line 827
    :cond_12
    move-object v0, v8

    .line 828
    :goto_c
    instance-of v2, v0, Lcom/ss/android/ugc/aweme/emoji/model/Emoji;

    .line 829
    .line 830
    if-nez v2, :cond_13

    .line 831
    .line 832
    move-object v0, v8

    .line 833
    :cond_13
    check-cast v0, Lcom/ss/android/ugc/aweme/emoji/model/Emoji;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 834
    .line 835
    goto :goto_e

    .line 836
    :goto_d
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 837
    .line 838
    const-wide v4, -0x371c4e68a836eL

    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v4

    .line 847
    invoke-virtual {v2, v4, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 848
    .line 849
    .line 850
    move-object v0, v8

    .line 851
    :goto_e
    if-eqz v0, :cond_15

    .line 852
    .line 853
    if-eqz v1, :cond_14

    .line 854
    .line 855
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 856
    .line 857
    .line 858
    :cond_14
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 859
    .line 860
    new-instance v2, Ljava/lang/StringBuilder;

    .line 861
    .line 862
    const-wide v4, -0x371d5e68a836eL

    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v4

    .line 871
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 875
    .line 876
    .line 877
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v2

    .line 881
    invoke-virtual {v1, v2}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    new-instance v2, Lyyds/ᛷᲁᛸᛶ;

    .line 889
    .line 890
    invoke-direct {v2, v0, v3, v8}, Lyyds/ᛷᲁᛸᛶ;-><init>(Lcom/ss/android/ugc/aweme/emoji/model/Emoji;Landroid/content/Context;Lyyds/ᛲᛱᛶᛸ;)V

    .line 891
    .line 892
    .line 893
    invoke-static {v1, v8, v2, v7}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 894
    .line 895
    .line 896
    :cond_15
    return-void

    .line 897
    :pswitch_6
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v1, Lyyds/ᛱᛱᛴ;

    .line 900
    .line 901
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 902
    .line 903
    check-cast v2, Landroid/app/AlertDialog;

    .line 904
    .line 905
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, Landroid/content/Context;

    .line 908
    .line 909
    iget-object v1, v1, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 910
    .line 911
    check-cast v1, Landroid/widget/EditText;

    .line 912
    .line 913
    invoke-static {v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᲈᲈᲁ(Landroid/widget/EditText;)Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v1

    .line 917
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 918
    .line 919
    .line 920
    move-result v3

    .line 921
    if-nez v3, :cond_16

    .line 922
    .line 923
    const-wide v0, -0xc1f8e68a836eL

    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 933
    .line 934
    .line 935
    goto :goto_f

    .line 936
    :cond_16
    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    .line 937
    .line 938
    .line 939
    invoke-static {v0, v1}, Lyyds/ᛶᛶᲁᲇ;->ᛷᛵᲇᲀ(Landroid/content/Context;Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    :goto_f
    return-void

    .line 943
    :pswitch_7
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 944
    .line 945
    check-cast v1, Lyyds/ᛶᲀᲈᛷ;

    .line 946
    .line 947
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 948
    .line 949
    move-object v9, v2

    .line 950
    check-cast v9, Ljava/util/Set;

    .line 951
    .line 952
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v0, Lyyds/ᛴᛷᲈ;

    .line 955
    .line 956
    iget-object v2, v0, Lyyds/ᛴᛷᲈ;->ᛲᲈᲁ:Lyyds/ᛷᛳᲁᛶ;

    .line 957
    .line 958
    iget-boolean v1, v1, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 959
    .line 960
    if-eqz v1, :cond_17

    .line 961
    .line 962
    goto :goto_11

    .line 963
    :cond_17
    iget-object v1, v2, Lyyds/ᛷᛳᲁᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 964
    .line 965
    invoke-interface {v9, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 966
    .line 967
    .line 968
    move-result v1

    .line 969
    iget-object v2, v2, Lyyds/ᛷᛳᲁᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 970
    .line 971
    if-nez v1, :cond_18

    .line 972
    .line 973
    invoke-interface {v9, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    goto :goto_10

    .line 977
    :cond_18
    invoke-interface {v9, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 978
    .line 979
    .line 980
    :goto_10
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 981
    .line 982
    const-wide v2, -0x6d09e68a836eL

    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v10

    .line 991
    const/4 v13, 0x0

    .line 992
    const/16 v14, 0x3e

    .line 993
    .line 994
    const/4 v11, 0x0

    .line 995
    const/4 v12, 0x0

    .line 996
    invoke-static/range {v9 .. v14}, Lyyds/ᛷᛷᛶᲇ;->ᲈᛷᲈᛶ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;I)Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v2

    .line 1000
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    const-wide v3, -0x1a4ce68a836eL

    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛱᲈᛱᲇ:Lyyds/ᛳᲀᛲ;

    .line 1012
    .line 1013
    sget-object v3, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 1014
    .line 1015
    const/16 v4, 0xcf

    .line 1016
    .line 1017
    aget-object v3, v3, v4

    .line 1018
    .line 1019
    invoke-virtual {v1, v3, v2}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 1020
    .line 1021
    .line 1022
    iget-object v1, v0, Lyyds/ᛴᛷᲈ;->ᛵᛸᛸᛷ:Landroid/view/ViewGroup;

    .line 1023
    .line 1024
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v1

    .line 1028
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 1029
    .line 1030
    if-eqz v2, :cond_19

    .line 1031
    .line 1032
    move-object v8, v1

    .line 1033
    check-cast v8, Landroid/view/ViewGroup;

    .line 1034
    .line 1035
    :cond_19
    if-eqz v8, :cond_1a

    .line 1036
    .line 1037
    new-instance v1, Landroid/transition/AutoTransition;

    .line 1038
    .line 1039
    invoke-direct {v1}, Landroid/transition/AutoTransition;-><init>()V

    .line 1040
    .line 1041
    .line 1042
    const-wide/16 v2, 0xc8

    .line 1043
    .line 1044
    invoke-virtual {v1, v2, v3}, Landroid/transition/TransitionSet;->setDuration(J)Landroid/transition/TransitionSet;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    invoke-static {v8, v1}, Landroid/transition/TransitionManager;->beginDelayedTransition(Landroid/view/ViewGroup;Landroid/transition/Transition;)V

    .line 1049
    .line 1050
    .line 1051
    :cond_1a
    invoke-static {v9, v0}, Lyyds/ᛲᛷᛵᲇ;->ᛱᛳᲇ(Ljava/util/Set;Lyyds/ᛴᛷᲈ;)V

    .line 1052
    .line 1053
    .line 1054
    :goto_11
    return-void

    .line 1055
    :pswitch_8
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1056
    .line 1057
    check-cast v1, Landroid/view/View;

    .line 1058
    .line 1059
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1060
    .line 1061
    check-cast v2, Ljava/util/List;

    .line 1062
    .line 1063
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 1064
    .line 1065
    move-object v6, v0

    .line 1066
    check-cast v6, Landroid/widget/TextView;

    .line 1067
    .line 1068
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v1

    .line 1072
    sget-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 1073
    .line 1074
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1075
    .line 1076
    .line 1077
    invoke-static {v1}, Lyyds/ᲈᛷᛵᛷ;->ᲀᛲᛳᲀ(Landroid/content/Context;)Z

    .line 1078
    .line 1079
    .line 1080
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 1081
    .line 1082
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1083
    .line 1084
    .line 1085
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛶᛵᲁᲈ()F

    .line 1086
    .line 1087
    .line 1088
    move-result v7

    .line 1089
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1090
    .line 1091
    .line 1092
    move-result v0

    .line 1093
    if-eqz v0, :cond_1b

    .line 1094
    .line 1095
    goto :goto_12

    .line 1096
    :cond_1b
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    :cond_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1101
    .line 1102
    .line 1103
    move-result v3

    .line 1104
    if-eqz v3, :cond_1d

    .line 1105
    .line 1106
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v3

    .line 1110
    check-cast v3, Ljava/lang/Number;

    .line 1111
    .line 1112
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 1113
    .line 1114
    .line 1115
    move-result v3

    .line 1116
    sub-float/2addr v3, v7

    .line 1117
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 1118
    .line 1119
    .line 1120
    move-result v3

    .line 1121
    const v9, 0x38d1b717    # 1.0E-4f

    .line 1122
    .line 1123
    .line 1124
    cmpg-float v3, v3, v9

    .line 1125
    .line 1126
    if-gez v3, :cond_1c

    .line 1127
    .line 1128
    goto :goto_13

    .line 1129
    :cond_1d
    :goto_12
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v0

    .line 1133
    invoke-static {v2, v0}, Lyyds/ᛷᛷᛶᲇ;->ᛸᛴᛵᛶ(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    invoke-static {v0}, Lyyds/ᛷᛷᛶᲇ;->ᛲᲀᛲᛲ(Ljava/util/Collection;)Ljava/util/List;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v2

    .line 1141
    :goto_13
    invoke-static {v2}, Lyyds/ᲈᛸᲁᛶ;->ᛱᛳᲇ(Ljava/util/Collection;)Lyyds/ᲈᲈᲀᲈ;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v0

    .line 1145
    invoke-virtual {v0}, Lyyds/ᲇᲁᲁᲁ;->iterator()Ljava/util/Iterator;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    move-object v9, v0

    .line 1150
    check-cast v9, Lyyds/ᲀᛲᲈᛵ;

    .line 1151
    .line 1152
    iget-boolean v0, v9, Lyyds/ᲀᛲᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 1153
    .line 1154
    if-nez v0, :cond_1e

    .line 1155
    .line 1156
    goto :goto_14

    .line 1157
    :cond_1e
    invoke-virtual {v9}, Lyyds/ᲀᛲᲈᛵ;->next()Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v8

    .line 1161
    iget-boolean v0, v9, Lyyds/ᲀᛲᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 1162
    .line 1163
    if-nez v0, :cond_1f

    .line 1164
    .line 1165
    goto :goto_14

    .line 1166
    :cond_1f
    move-object v0, v8

    .line 1167
    check-cast v0, Ljava/lang/Number;

    .line 1168
    .line 1169
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1170
    .line 1171
    .line 1172
    move-result v0

    .line 1173
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    check-cast v0, Ljava/lang/Number;

    .line 1178
    .line 1179
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 1180
    .line 1181
    .line 1182
    move-result v0

    .line 1183
    sub-float/2addr v0, v7

    .line 1184
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 1185
    .line 1186
    .line 1187
    move-result v0

    .line 1188
    :cond_20
    invoke-virtual {v9}, Lyyds/ᲀᛲᲈᛵ;->next()Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v3

    .line 1192
    move-object v10, v3

    .line 1193
    check-cast v10, Ljava/lang/Number;

    .line 1194
    .line 1195
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1196
    .line 1197
    .line 1198
    move-result v10

    .line 1199
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v10

    .line 1203
    check-cast v10, Ljava/lang/Number;

    .line 1204
    .line 1205
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 1206
    .line 1207
    .line 1208
    move-result v10

    .line 1209
    sub-float/2addr v10, v7

    .line 1210
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 1211
    .line 1212
    .line 1213
    move-result v10

    .line 1214
    invoke-static {v0, v10}, Ljava/lang/Float;->compare(FF)I

    .line 1215
    .line 1216
    .line 1217
    move-result v11

    .line 1218
    if-lez v11, :cond_21

    .line 1219
    .line 1220
    move-object v8, v3

    .line 1221
    move v0, v10

    .line 1222
    :cond_21
    iget-boolean v3, v9, Lyyds/ᲀᛲᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 1223
    .line 1224
    if-nez v3, :cond_20

    .line 1225
    .line 1226
    :goto_14
    check-cast v8, Ljava/lang/Integer;

    .line 1227
    .line 1228
    if-eqz v8, :cond_22

    .line 1229
    .line 1230
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1231
    .line 1232
    .line 1233
    move-result v0

    .line 1234
    goto :goto_15

    .line 1235
    :cond_22
    move v0, v4

    .line 1236
    :goto_15
    invoke-static {v1}, Lyyds/ᛵᛱᲀᛱ;->ᛵᛲᛵᲁ(Landroid/content/Context;)Lyyds/ᛵᛱᲀᛱ;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v3

    .line 1240
    const-wide v7, -0xa572e68a836eL

    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v7

    .line 1249
    iput-object v7, v3, Lyyds/ᛴᛱᛱᛸ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 1250
    .line 1251
    invoke-virtual {v3}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1252
    .line 1253
    .line 1254
    const-wide v7, -0xa577e68a836eL

    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v7

    .line 1263
    iput-object v7, v3, Lyyds/ᛴᛱᛱᛸ;->ᛷᛸᲇᛶ:Ljava/lang/String;

    .line 1264
    .line 1265
    invoke-virtual {v3}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1266
    .line 1267
    .line 1268
    new-instance v7, Ljava/util/ArrayList;

    .line 1269
    .line 1270
    const/16 v8, 0xa

    .line 1271
    .line 1272
    invoke-static {v2, v8}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 1273
    .line 1274
    .line 1275
    move-result v8

    .line 1276
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1277
    .line 1278
    .line 1279
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v8

    .line 1283
    :goto_16
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1284
    .line 1285
    .line 1286
    move-result v9

    .line 1287
    if-eqz v9, :cond_23

    .line 1288
    .line 1289
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v9

    .line 1293
    check-cast v9, Ljava/lang/Number;

    .line 1294
    .line 1295
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 1296
    .line 1297
    .line 1298
    move-result v9

    .line 1299
    const-wide v10, -0xa588e68a836eL

    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v10

    .line 1308
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v9

    .line 1312
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v9

    .line 1316
    const-wide v11, -0xa58de68a836eL

    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    invoke-static {v9, v5, v10, v11, v12}, Lyyds/ᲀᲁᲈᲇ;->ᛲᛲᲈᲈ([Ljava/lang/Object;ILjava/lang/String;J)Ljava/lang/String;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v9

    .line 1325
    const-string v10, "x"

    .line 1326
    .line 1327
    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v9

    .line 1331
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1332
    .line 1333
    .line 1334
    goto :goto_16

    .line 1335
    :cond_23
    invoke-virtual {v3, v7}, Lyyds/ᛵᛱᲀᛱ;->ᲀᛳᛷᛷ(Ljava/util/List;)V

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v3, v0}, Lyyds/ᛵᛱᲀᛱ;->ᲈᛲᛳᛶ(I)V

    .line 1339
    .line 1340
    .line 1341
    const-wide v7, -0xa599e68a836eL

    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v0

    .line 1350
    new-instance v5, Lyyds/ᛴᲈ;

    .line 1351
    .line 1352
    invoke-direct {v5, v2, v4, v6}, Lyyds/ᛴᲈ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v3, v0, v5}, Lyyds/ᛵᛱᲀᛱ;->ᛵᛸᛵᛶ(Ljava/lang/String;Lyyds/ᛵᛱᛱᛴ;)V

    .line 1356
    .line 1357
    .line 1358
    const-wide v4, -0xa59ce68a836eL

    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v0

    .line 1367
    iput-object v0, v3, Lyyds/ᛴᛱᛱᛸ;->ᛱᛳᛶᛳ:Ljava/lang/String;

    .line 1368
    .line 1369
    invoke-virtual {v3}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v3, v1}, Lyyds/ᛴᛱᛱᛸ;->ᛵᲈᲇᛵ(Landroid/content/Context;)V

    .line 1373
    .line 1374
    .line 1375
    return-void

    .line 1376
    :pswitch_9
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1377
    .line 1378
    move-object v13, v1

    .line 1379
    check-cast v13, Landroid/content/Context;

    .line 1380
    .line 1381
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1382
    .line 1383
    move-object v11, v1

    .line 1384
    check-cast v11, Landroid/widget/TextView;

    .line 1385
    .line 1386
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 1387
    .line 1388
    move-object v14, v0

    .line 1389
    check-cast v14, Landroid/widget/FrameLayout;

    .line 1390
    .line 1391
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 1392
    .line 1393
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1394
    .line 1395
    .line 1396
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛷᲇᛲᛱ()I

    .line 1397
    .line 1398
    .line 1399
    move-result v0

    .line 1400
    if-ne v0, v3, :cond_24

    .line 1401
    .line 1402
    const/16 v0, 0x9

    .line 1403
    .line 1404
    move v10, v0

    .line 1405
    goto :goto_17

    .line 1406
    :cond_24
    move v10, v3

    .line 1407
    :goto_17
    if-ne v10, v3, :cond_25

    .line 1408
    .line 1409
    const-wide v0, -0xcdfbe68a836eL

    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    :goto_18
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    move-object v12, v0

    .line 1419
    goto :goto_19

    .line 1420
    :cond_25
    const-wide v0, -0xcdffe68a836eL

    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    goto :goto_18

    .line 1426
    :goto_19
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 1427
    .line 1428
    invoke-direct {v0, v13}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1429
    .line 1430
    .line 1431
    const-wide v1, -0xce03e68a836eL

    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v1

    .line 1440
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v0

    .line 1444
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1445
    .line 1446
    const-wide v2, -0xce0ae68a836eL

    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v2

    .line 1455
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1459
    .line 1460
    .line 1461
    const-wide v2, -0xce11e68a836eL

    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v2

    .line 1470
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1471
    .line 1472
    .line 1473
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v1

    .line 1477
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v0

    .line 1481
    const-wide v1, -0xce2ae68a836eL

    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v1

    .line 1490
    new-instance v9, Lyyds/ᛱᛶᲈᛲ;

    .line 1491
    .line 1492
    invoke-direct/range {v9 .. v14}, Lyyds/ᛱᛶᲈᛲ;-><init>(ILandroid/widget/TextView;Ljava/lang/String;Landroid/content/Context;Landroid/widget/FrameLayout;)V

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual {v0, v1, v9}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v0

    .line 1499
    const-wide v1, -0xce2de68a836eL

    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v1

    .line 1508
    invoke-virtual {v0, v1, v8}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v0

    .line 1512
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1513
    .line 1514
    .line 1515
    return-void

    .line 1516
    :pswitch_a
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1517
    .line 1518
    check-cast v1, Lyyds/ᛴᲁᛱᲇ;

    .line 1519
    .line 1520
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1521
    .line 1522
    check-cast v2, Lyyds/ᲁᛴᛲᛱ;

    .line 1523
    .line 1524
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 1525
    .line 1526
    check-cast v0, Landroid/content/Context;

    .line 1527
    .line 1528
    invoke-static {}, Lyyds/ᛵᛱᲀᛱ;->ᲇᲇᲈᲀ()Lyyds/ᛵᛱᲀᛱ;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v3

    .line 1532
    iget v4, v1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 1533
    .line 1534
    invoke-virtual {v3, v4}, Lyyds/ᛵᛱᲀᛱ;->ᲈᛲᛳᛶ(I)V

    .line 1535
    .line 1536
    .line 1537
    iget-object v4, v2, Lyyds/ᲁᛴᛲᛱ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 1538
    .line 1539
    invoke-virtual {v3, v4}, Lyyds/ᛵᛱᲀᛱ;->ᲀᛳᛷᛷ(Ljava/util/List;)V

    .line 1540
    .line 1541
    .line 1542
    const-wide v6, -0x6ea6e68a836eL

    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v4

    .line 1551
    iput-object v4, v3, Lyyds/ᛴᛱᛱᛸ;->ᛱᛳᛶᛳ:Ljava/lang/String;

    .line 1552
    .line 1553
    invoke-virtual {v3}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1554
    .line 1555
    .line 1556
    const-wide v6, -0x6ea9e68a836eL

    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v4

    .line 1565
    new-instance v6, Lyyds/ᲁᛳᛸᛳ;

    .line 1566
    .line 1567
    invoke-direct {v6, v1, v2, v5}, Lyyds/ᲁᛳᛸᛳ;-><init>(Lyyds/ᛴᲁᛱᲇ;Lyyds/ᲁᛴᛲᛱ;I)V

    .line 1568
    .line 1569
    .line 1570
    invoke-virtual {v3, v4, v6}, Lyyds/ᛵᛱᲀᛱ;->ᛵᛸᛵᛶ(Ljava/lang/String;Lyyds/ᛵᛱᛱᛴ;)V

    .line 1571
    .line 1572
    .line 1573
    invoke-virtual {v3, v0}, Lyyds/ᛴᛱᛱᛸ;->ᛵᲈᲇᛵ(Landroid/content/Context;)V

    .line 1574
    .line 1575
    .line 1576
    return-void

    .line 1577
    :pswitch_b
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1578
    .line 1579
    check-cast v1, Lyyds/ᲁᛶᲁᲀ;

    .line 1580
    .line 1581
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1582
    .line 1583
    check-cast v2, Lyyds/ᛴᛱᛱᛸ;

    .line 1584
    .line 1585
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 1586
    .line 1587
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 1588
    .line 1589
    new-instance v3, Lorg/json/JSONObject;

    .line 1590
    .line 1591
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 1592
    .line 1593
    .line 1594
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v0

    .line 1598
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v0

    .line 1602
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1603
    .line 1604
    .line 1605
    move-result v4

    .line 1606
    if-eqz v4, :cond_28

    .line 1607
    .line 1608
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v4

    .line 1612
    check-cast v4, Ljava/util/Map$Entry;

    .line 1613
    .line 1614
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v5

    .line 1618
    check-cast v5, Ljava/lang/String;

    .line 1619
    .line 1620
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v4

    .line 1624
    check-cast v4, Lyyds/ᛳᛴᛶᛱ;

    .line 1625
    .line 1626
    new-instance v6, Lorg/json/JSONObject;

    .line 1627
    .line 1628
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 1629
    .line 1630
    .line 1631
    const-wide v9, -0x64bee68a836eL

    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v7

    .line 1640
    iget-object v9, v4, Lyyds/ᛳᛴᛶᛱ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 1641
    .line 1642
    invoke-virtual {v6, v7, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1643
    .line 1644
    .line 1645
    const-wide v9, -0x64c3e68a836eL

    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v7

    .line 1654
    iget-object v4, v4, Lyyds/ᛳᛴᛶᛱ;->ᛲᲈᲁ:Landroid/widget/EditText;

    .line 1655
    .line 1656
    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v4

    .line 1660
    if-eqz v4, :cond_26

    .line 1661
    .line 1662
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v4

    .line 1666
    if-eqz v4, :cond_26

    .line 1667
    .line 1668
    invoke-static {v4}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v4

    .line 1672
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v4

    .line 1676
    goto :goto_1b

    .line 1677
    :cond_26
    move-object v4, v8

    .line 1678
    :goto_1b
    if-nez v4, :cond_27

    .line 1679
    .line 1680
    const-wide v9, -0x64c9e68a836eL

    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v4

    .line 1689
    :cond_27
    invoke-virtual {v6, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1693
    .line 1694
    .line 1695
    goto :goto_1a

    .line 1696
    :cond_28
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 1697
    .line 1698
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v3

    .line 1702
    const-wide v4, -0x64cae68a836eL

    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1708
    .line 1709
    .line 1710
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1711
    .line 1712
    .line 1713
    const-wide v4, -0x1a24e68a836eL

    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1719
    .line 1720
    .line 1721
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᲁᛱᲇᛴ:Lyyds/ᛳᲀᛲ;

    .line 1722
    .line 1723
    sget-object v4, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 1724
    .line 1725
    const/16 v5, 0xbf

    .line 1726
    .line 1727
    aget-object v4, v4, v5

    .line 1728
    .line 1729
    invoke-virtual {v0, v4, v3}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 1730
    .line 1731
    .line 1732
    const-wide v3, -0x64d8e68a836eL

    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v0

    .line 1741
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 1742
    .line 1743
    .line 1744
    if-eqz v1, :cond_29

    .line 1745
    .line 1746
    invoke-interface {v1}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 1747
    .line 1748
    .line 1749
    :cond_29
    invoke-virtual {v2}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 1750
    .line 1751
    .line 1752
    return-void

    .line 1753
    :pswitch_c
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1754
    .line 1755
    check-cast v1, [Ljava/lang/String;

    .line 1756
    .line 1757
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1758
    .line 1759
    check-cast v2, Landroid/content/Context;

    .line 1760
    .line 1761
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 1762
    .line 1763
    check-cast v0, Landroid/widget/TextView;

    .line 1764
    .line 1765
    invoke-static {}, Lyyds/ᛵᛱᲀᛱ;->ᲇᲇᲈᲀ()Lyyds/ᛵᛱᲀᛱ;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v3

    .line 1769
    invoke-virtual {v3, v1}, Lyyds/ᛵᛱᲀᛱ;->ᛴᛵᛷᛳ([Ljava/lang/String;)V

    .line 1770
    .line 1771
    .line 1772
    invoke-virtual {v3}, Lyyds/ᛵᛱᲀᛱ;->ᛱᛵᛳᛳ()V

    .line 1773
    .line 1774
    .line 1775
    sget-object v4, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 1776
    .line 1777
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1778
    .line 1779
    .line 1780
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛳᛷᛶᛲ()I

    .line 1781
    .line 1782
    .line 1783
    move-result v4

    .line 1784
    invoke-static {v4, v6, v7}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 1785
    .line 1786
    .line 1787
    move-result v4

    .line 1788
    invoke-virtual {v3, v4}, Lyyds/ᛵᛱᲀᛱ;->ᲈᛲᛳᛶ(I)V

    .line 1789
    .line 1790
    .line 1791
    const-wide v4, -0x7ef6e68a836eL

    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v4

    .line 1800
    iput-object v4, v3, Lyyds/ᛴᛱᛱᛸ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 1801
    .line 1802
    invoke-virtual {v3}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1803
    .line 1804
    .line 1805
    const-wide v4, -0x7efde68a836eL

    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v4

    .line 1814
    iput-object v4, v3, Lyyds/ᛴᛱᛱᛸ;->ᛷᛸᲇᛶ:Ljava/lang/String;

    .line 1815
    .line 1816
    invoke-virtual {v3}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1817
    .line 1818
    .line 1819
    new-instance v4, Lyyds/ᛳᛴᛶᲁ;

    .line 1820
    .line 1821
    invoke-direct {v4, v0, v7, v1}, Lyyds/ᛳᛴᛶᲁ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1822
    .line 1823
    .line 1824
    iput-object v4, v3, Lyyds/ᛵᛱᲀᛱ;->ᲇᲇᲈᲀ:Lyyds/ᛲᛸᛲᛶ;

    .line 1825
    .line 1826
    const-wide v0, -0x7f11e68a836eL

    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v0

    .line 1835
    iput-object v0, v3, Lyyds/ᛴᛱᛱᛸ;->ᛱᛳᛶᛳ:Ljava/lang/String;

    .line 1836
    .line 1837
    invoke-virtual {v3}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1838
    .line 1839
    .line 1840
    invoke-virtual {v3, v2}, Lyyds/ᛴᛱᛱᛸ;->ᛵᲈᲇᛵ(Landroid/content/Context;)V

    .line 1841
    .line 1842
    .line 1843
    return-void

    .line 1844
    :pswitch_d
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 1845
    .line 1846
    check-cast v1, [Ljava/lang/String;

    .line 1847
    .line 1848
    iget-object v3, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 1849
    .line 1850
    check-cast v3, Landroid/content/Context;

    .line 1851
    .line 1852
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 1853
    .line 1854
    check-cast v0, [Ljava/lang/String;

    .line 1855
    .line 1856
    sget-object v4, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 1857
    .line 1858
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1859
    .line 1860
    .line 1861
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲇᛶᲀᲇ()Ljava/lang/String;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v4

    .line 1865
    const-wide v9, -0x7defe68a836eL

    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v7

    .line 1874
    filled-new-array {v7}, [Ljava/lang/String;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v7

    .line 1878
    const/4 v9, 0x6

    .line 1879
    invoke-static {v4, v7, v9}, Lyyds/ᛲᲇᛸᲇ;->ᛲᲀᛲᛲ(Ljava/lang/String;[Ljava/lang/String;I)Ljava/util/List;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v4

    .line 1883
    new-instance v7, Ljava/util/ArrayList;

    .line 1884
    .line 1885
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1886
    .line 1887
    .line 1888
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v4

    .line 1892
    :cond_2a
    :goto_1c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1893
    .line 1894
    .line 1895
    move-result v9

    .line 1896
    if-eqz v9, :cond_2c

    .line 1897
    .line 1898
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v9

    .line 1902
    check-cast v9, Ljava/lang/String;

    .line 1903
    .line 1904
    invoke-static {v9, v0}, Lyyds/ᲀᲀᛷᛸ;->ᛸᛸᛷᛱ(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 1905
    .line 1906
    .line 1907
    move-result v9

    .line 1908
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v10

    .line 1912
    if-ltz v9, :cond_2b

    .line 1913
    .line 1914
    goto :goto_1d

    .line 1915
    :cond_2b
    move-object v10, v8

    .line 1916
    :goto_1d
    if-eqz v10, :cond_2a

    .line 1917
    .line 1918
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1919
    .line 1920
    .line 1921
    goto :goto_1c

    .line 1922
    :cond_2c
    invoke-static {v7}, Lyyds/ᛷᛷᛶᲇ;->ᛳᛷᛶᛲ(Ljava/util/ArrayList;)[I

    .line 1923
    .line 1924
    .line 1925
    move-result-object v4

    .line 1926
    invoke-static {}, Lyyds/ᛵᛱᲀᛱ;->ᲇᲇᲈᲀ()Lyyds/ᛵᛱᲀᛱ;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v7

    .line 1930
    invoke-virtual {v7, v1}, Lyyds/ᛵᛱᲀᛱ;->ᛴᛵᛷᛳ([Ljava/lang/String;)V

    .line 1931
    .line 1932
    .line 1933
    invoke-virtual {v7}, Lyyds/ᛵᛱᲀᛱ;->ᛵᛲᛶᲁ()V

    .line 1934
    .line 1935
    .line 1936
    const-wide v9, -0x7df1e68a836eL

    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v9

    .line 1945
    iput-object v9, v7, Lyyds/ᛴᛱᛱᛸ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 1946
    .line 1947
    invoke-virtual {v7}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1948
    .line 1949
    .line 1950
    invoke-virtual {v7, v4}, Lyyds/ᛵᛱᲀᛱ;->ᛱᛵᲈᛸ([I)V

    .line 1951
    .line 1952
    .line 1953
    iput-boolean v6, v7, Lyyds/ᛴᛱᛱᛸ;->ᲀᛴᲁᲈ:Z

    .line 1954
    .line 1955
    invoke-virtual {v7}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1956
    .line 1957
    .line 1958
    const-wide v9, -0x7df8e68a836eL

    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v4

    .line 1967
    iput-object v4, v7, Lyyds/ᛴᛱᛱᛸ;->ᛷᛸᲇᛶ:Ljava/lang/String;

    .line 1968
    .line 1969
    invoke-virtual {v7}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1970
    .line 1971
    .line 1972
    iput-boolean v5, v7, Lyyds/ᛵᛱᲀᛱ;->ᛴᛵᛷᛳ:Z

    .line 1973
    .line 1974
    iput-object v8, v7, Lyyds/ᛵᛱᲀᛱ;->ᲈᛳ:Lyyds/ᛶᛷᛲᛴ;

    .line 1975
    .line 1976
    invoke-virtual {v7}, Lyyds/ᛵᛱᲀᛱ;->ᲈᛳ()V

    .line 1977
    .line 1978
    .line 1979
    invoke-virtual {v7}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1980
    .line 1981
    .line 1982
    const-wide v4, -0x7e05e68a836eL

    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v4

    .line 1991
    iput-object v4, v7, Lyyds/ᛵᛱᲀᛱ;->ᛵᛲᛶᲁ:Ljava/lang/String;

    .line 1992
    .line 1993
    invoke-virtual {v7}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 1994
    .line 1995
    .line 1996
    const-wide v4, -0x7e0ce68a836eL

    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v4

    .line 2005
    new-instance v5, Lyyds/ᲇᛲᛷᲈ;

    .line 2006
    .line 2007
    const/4 v6, 0x7

    .line 2008
    invoke-direct {v5, v1, v6}, Lyyds/ᲇᛲᛷᲈ;-><init>([Ljava/lang/String;I)V

    .line 2009
    .line 2010
    .line 2011
    invoke-virtual {v7, v4, v5}, Lyyds/ᛵᛱᲀᛱ;->ᛶᛵᲁᲈ(Ljava/lang/String;Lyyds/ᛵᛱᛱᛴ;)V

    .line 2012
    .line 2013
    .line 2014
    const-wide v4, -0x7e0fe68a836eL

    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v1

    .line 2023
    new-instance v4, Lyyds/ᲇᛲᛷᲈ;

    .line 2024
    .line 2025
    const/16 v5, 0x8

    .line 2026
    .line 2027
    invoke-direct {v4, v0, v5}, Lyyds/ᲇᛲᛷᲈ;-><init>([Ljava/lang/String;I)V

    .line 2028
    .line 2029
    .line 2030
    invoke-virtual {v7, v1, v4}, Lyyds/ᛵᛱᲀᛱ;->ᛵᛸᛵᛶ(Ljava/lang/String;Lyyds/ᛵᛱᛱᛴ;)V

    .line 2031
    .line 2032
    .line 2033
    const-wide v0, -0x7e12e68a836eL

    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v0

    .line 2042
    new-instance v1, Lyyds/ᲁᛶᛷᛲ;

    .line 2043
    .line 2044
    invoke-direct {v1, v2}, Lyyds/ᲁᛶᛷᛲ;-><init>(I)V

    .line 2045
    .line 2046
    .line 2047
    iput-object v0, v7, Lyyds/ᛴᛱᛱᛸ;->ᛱᛳᛶᛳ:Ljava/lang/String;

    .line 2048
    .line 2049
    iput-object v1, v7, Lyyds/ᛴᛱᛱᛸ;->ᛷᛶᛷᲀ:Lyyds/ᲁᛲᲇᛴ;

    .line 2050
    .line 2051
    invoke-virtual {v7}, Lyyds/ᛵᛱᲀᛱ;->ᛷᲈᛳᛲ()V

    .line 2052
    .line 2053
    .line 2054
    invoke-virtual {v7, v3}, Lyyds/ᛴᛱᛱᛸ;->ᛵᲈᲇᛵ(Landroid/content/Context;)V

    .line 2055
    .line 2056
    .line 2057
    return-void

    .line 2058
    :pswitch_e
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2059
    .line 2060
    check-cast v1, Landroid/widget/EditText;

    .line 2061
    .line 2062
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2063
    .line 2064
    check-cast v2, Ljava/lang/String;

    .line 2065
    .line 2066
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2067
    .line 2068
    check-cast v0, Landroid/content/Context;

    .line 2069
    .line 2070
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v3

    .line 2074
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v3

    .line 2078
    invoke-virtual {v1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 2079
    .line 2080
    .line 2081
    move-result v4

    .line 2082
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 2083
    .line 2084
    .line 2085
    move-result v5

    .line 2086
    invoke-static {v4, v6, v5}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 2087
    .line 2088
    .line 2089
    move-result v4

    .line 2090
    new-instance v5, Ljava/lang/StringBuilder;

    .line 2091
    .line 2092
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2093
    .line 2094
    .line 2095
    invoke-virtual {v5, v4, v2}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 2096
    .line 2097
    .line 2098
    move-result-object v3

    .line 2099
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v3

    .line 2103
    const-wide v5, -0x663be68a836eL

    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2109
    .line 2110
    .line 2111
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2112
    .line 2113
    .line 2114
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 2115
    .line 2116
    .line 2117
    move-result v2

    .line 2118
    add-int/2addr v2, v4

    .line 2119
    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 2120
    .line 2121
    .line 2122
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 2123
    .line 2124
    .line 2125
    sget-object v1, Lyyds/ᛶᛵᛲᛲ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

    .line 2126
    .line 2127
    invoke-static {v0}, Lyyds/ᛶᛵᛲᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;)V

    .line 2128
    .line 2129
    .line 2130
    return-void

    .line 2131
    :pswitch_f
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2132
    .line 2133
    check-cast v1, Lyyds/ᲈᛶᛱᛱ;

    .line 2134
    .line 2135
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2136
    .line 2137
    check-cast v2, Landroid/app/Dialog;

    .line 2138
    .line 2139
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2140
    .line 2141
    check-cast v0, Landroid/content/Context;

    .line 2142
    .line 2143
    iget-object v3, v1, Lyyds/ᲈᛶᛱᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 2144
    .line 2145
    new-instance v4, Ljava/util/ArrayList;

    .line 2146
    .line 2147
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2148
    .line 2149
    .line 2150
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v5

    .line 2154
    :cond_2d
    :goto_1e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2155
    .line 2156
    .line 2157
    move-result v6

    .line 2158
    if-eqz v6, :cond_2e

    .line 2159
    .line 2160
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2161
    .line 2162
    .line 2163
    move-result-object v6

    .line 2164
    move-object v9, v6

    .line 2165
    check-cast v9, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 2166
    .line 2167
    iget-object v10, v1, Lyyds/ᲈᛶᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 2168
    .line 2169
    invoke-static {v9}, Lyyds/ᲈᛶᛱᛱ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v11

    .line 2173
    invoke-virtual {v10, v11}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 2174
    .line 2175
    .line 2176
    move-result v10

    .line 2177
    if-eqz v10, :cond_2d

    .line 2178
    .line 2179
    invoke-virtual {v1, v9}, Lyyds/ᲈᛶᛱᛱ;->ᛱᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z

    .line 2180
    .line 2181
    .line 2182
    move-result v9

    .line 2183
    if-eqz v9, :cond_2d

    .line 2184
    .line 2185
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2186
    .line 2187
    .line 2188
    goto :goto_1e

    .line 2189
    :cond_2e
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2190
    .line 2191
    .line 2192
    move-result v5

    .line 2193
    if-eqz v5, :cond_30

    .line 2194
    .line 2195
    new-instance v4, Ljava/util/ArrayList;

    .line 2196
    .line 2197
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2198
    .line 2199
    .line 2200
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v3

    .line 2204
    :cond_2f
    :goto_1f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2205
    .line 2206
    .line 2207
    move-result v5

    .line 2208
    if-eqz v5, :cond_30

    .line 2209
    .line 2210
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v5

    .line 2214
    move-object v6, v5

    .line 2215
    check-cast v6, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 2216
    .line 2217
    invoke-virtual {v1, v6}, Lyyds/ᲈᛶᛱᛱ;->ᛱᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z

    .line 2218
    .line 2219
    .line 2220
    move-result v6

    .line 2221
    if-eqz v6, :cond_2f

    .line 2222
    .line 2223
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2224
    .line 2225
    .line 2226
    goto :goto_1f

    .line 2227
    :cond_30
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 2228
    .line 2229
    .line 2230
    move-result v1

    .line 2231
    if-eqz v1, :cond_31

    .line 2232
    .line 2233
    const-wide v0, -0xb612e68a836eL

    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v0

    .line 2242
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 2243
    .line 2244
    .line 2245
    goto :goto_20

    .line 2246
    :cond_31
    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    .line 2247
    .line 2248
    .line 2249
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v1

    .line 2253
    new-instance v2, Lyyds/ᛶᛶᛶᛳ;

    .line 2254
    .line 2255
    invoke-direct {v2, v4, v0, v8}, Lyyds/ᛶᛶᛶᛳ;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Lyyds/ᛲᛱᛶᛸ;)V

    .line 2256
    .line 2257
    .line 2258
    invoke-static {v1, v8, v2, v7}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 2259
    .line 2260
    .line 2261
    :goto_20
    return-void

    .line 2262
    :pswitch_10
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2263
    .line 2264
    check-cast v1, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 2265
    .line 2266
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2267
    .line 2268
    check-cast v2, Lyyds/ᛳᛲᛸᛳ;

    .line 2269
    .line 2270
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2271
    .line 2272
    check-cast v0, Landroid/content/Intent;

    .line 2273
    .line 2274
    iget-object v3, v2, Lyyds/ᛳᛲᛸᛳ;->ᲀᛲᛲᲇ:Landroid/widget/TextView;

    .line 2275
    .line 2276
    sget-object v4, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 2277
    .line 2278
    invoke-virtual {v1, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛷᛲᲁ(Landroid/view/View;)V

    .line 2279
    .line 2280
    .line 2281
    :try_start_4
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2282
    .line 2283
    .line 2284
    sget-object v0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 2285
    .line 2286
    goto :goto_21

    .line 2287
    :catchall_2
    move-exception v0

    .line 2288
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 2289
    .line 2290
    invoke-direct {v1, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 2291
    .line 2292
    .line 2293
    move-object v0, v1

    .line 2294
    :goto_21
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2295
    .line 2296
    .line 2297
    move-result-object v0

    .line 2298
    if-eqz v0, :cond_32

    .line 2299
    .line 2300
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2301
    .line 2302
    .line 2303
    move-result-object v0

    .line 2304
    const-wide v1, -0x4c4b6e68a836eL

    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2310
    .line 2311
    .line 2312
    move-result-object v1

    .line 2313
    invoke-static {v0, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2314
    .line 2315
    .line 2316
    move-result-object v0

    .line 2317
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2318
    .line 2319
    .line 2320
    :cond_32
    return-void

    .line 2321
    :pswitch_11
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2322
    .line 2323
    check-cast v1, Lyyds/ᲁᲈᛸᛲ;

    .line 2324
    .line 2325
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2326
    .line 2327
    check-cast v2, Lyyds/ᛵᛱᛷᛳ;

    .line 2328
    .line 2329
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2330
    .line 2331
    check-cast v0, Landroid/widget/LinearLayout;

    .line 2332
    .line 2333
    sget-object v3, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 2334
    .line 2335
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲈᛸᛲ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2336
    .line 2337
    .line 2338
    return-void

    .line 2339
    :pswitch_12
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2340
    .line 2341
    check-cast v1, Lyyds/ᛶᲀᲈᛷ;

    .line 2342
    .line 2343
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2344
    .line 2345
    check-cast v2, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 2346
    .line 2347
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2348
    .line 2349
    check-cast v0, Landroid/app/AlertDialog;

    .line 2350
    .line 2351
    sget-object v3, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 2352
    .line 2353
    iput-boolean v5, v1, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 2354
    .line 2355
    invoke-virtual {v2, v6}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v1

    .line 2359
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2360
    .line 2361
    .line 2362
    move-result-object v1

    .line 2363
    const-wide v3, -0xf6cbe68a836eL

    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2369
    .line 2370
    .line 2371
    move-result-object v3

    .line 2372
    iget-object v2, v2, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛲᛲᲇ:Lyyds/ᛵᛱᛷᛳ;

    .line 2373
    .line 2374
    iget-object v2, v2, Lyyds/ᛵᛱᛷᛳ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 2375
    .line 2376
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2377
    .line 2378
    .line 2379
    move-result-object v1

    .line 2380
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2381
    .line 2382
    .line 2383
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 2384
    .line 2385
    .line 2386
    return-void

    .line 2387
    :pswitch_13
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2388
    .line 2389
    check-cast v1, Lyyds/ᛴᲁᛱᲇ;

    .line 2390
    .line 2391
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2392
    .line 2393
    check-cast v2, Lyyds/ᲀᲈᲇᲇ;

    .line 2394
    .line 2395
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2396
    .line 2397
    check-cast v0, Landroid/app/AlertDialog;

    .line 2398
    .line 2399
    iget v1, v1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 2400
    .line 2401
    const/4 v3, -0x1

    .line 2402
    if-eq v1, v3, :cond_33

    .line 2403
    .line 2404
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v1

    .line 2408
    invoke-virtual {v2, v1}, Lyyds/ᲀᲈᲇᲇ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2409
    .line 2410
    .line 2411
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 2412
    .line 2413
    .line 2414
    goto :goto_22

    .line 2415
    :cond_33
    const-wide v0, -0x36ea2e68a836eL

    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2421
    .line 2422
    .line 2423
    move-result-object v0

    .line 2424
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 2425
    .line 2426
    .line 2427
    :goto_22
    return-void

    .line 2428
    :pswitch_14
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2429
    .line 2430
    check-cast v1, Lyyds/ᛴᲁᛱᲇ;

    .line 2431
    .line 2432
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2433
    .line 2434
    check-cast v2, Lyyds/ᲀᲈᲇᲇ;

    .line 2435
    .line 2436
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2437
    .line 2438
    check-cast v0, Landroid/app/AlertDialog;

    .line 2439
    .line 2440
    iget v1, v1, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 2441
    .line 2442
    if-ltz v1, :cond_34

    .line 2443
    .line 2444
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2445
    .line 2446
    .line 2447
    move-result-object v1

    .line 2448
    invoke-virtual {v2, v1}, Lyyds/ᲀᲈᲇᲇ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2449
    .line 2450
    .line 2451
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 2452
    .line 2453
    .line 2454
    goto :goto_23

    .line 2455
    :cond_34
    const-wide v0, -0x36e99e68a836eL

    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v0

    .line 2464
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 2465
    .line 2466
    .line 2467
    :goto_23
    return-void

    .line 2468
    :pswitch_15
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2469
    .line 2470
    check-cast v1, Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 2471
    .line 2472
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2473
    .line 2474
    check-cast v2, Landroid/content/Context;

    .line 2475
    .line 2476
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2477
    .line 2478
    check-cast v0, Ljava/lang/String;

    .line 2479
    .line 2480
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 2481
    .line 2482
    .line 2483
    move-result-object v3

    .line 2484
    new-instance v4, Lyyds/ᛷᲁᛸᛶ;

    .line 2485
    .line 2486
    invoke-direct {v4, v1, v2, v0, v8}, Lyyds/ᛷᲁᛸᛶ;-><init>(Lcom/ss/android/ugc/aweme/comment/model/Comment;Landroid/content/Context;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;)V

    .line 2487
    .line 2488
    .line 2489
    invoke-static {v3, v8, v4, v7}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 2490
    .line 2491
    .line 2492
    return-void

    .line 2493
    :pswitch_16
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2494
    .line 2495
    move-object v9, v1

    .line 2496
    check-cast v9, Landroid/content/Context;

    .line 2497
    .line 2498
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2499
    .line 2500
    move-object v10, v1

    .line 2501
    check-cast v10, Ljava/lang/String;

    .line 2502
    .line 2503
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2504
    .line 2505
    move-object v11, v0

    .line 2506
    check-cast v11, Ljava/lang/String;

    .line 2507
    .line 2508
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v0

    .line 2512
    new-instance v8, Lyyds/ᛵᛶᲁᛲ;

    .line 2513
    .line 2514
    const/4 v13, 0x1

    .line 2515
    const/4 v12, 0x0

    .line 2516
    invoke-direct/range {v8 .. v13}, Lyyds/ᛵᛶᲁᛲ;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 2517
    .line 2518
    .line 2519
    invoke-static {v0, v12, v8, v7}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 2520
    .line 2521
    .line 2522
    return-void

    .line 2523
    :pswitch_17
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2524
    .line 2525
    check-cast v1, Lyyds/ᛴᛱᛱᛸ;

    .line 2526
    .line 2527
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2528
    .line 2529
    check-cast v2, Landroid/view/View;

    .line 2530
    .line 2531
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2532
    .line 2533
    check-cast v0, Landroid/widget/TextView;

    .line 2534
    .line 2535
    invoke-virtual {v1}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ()V

    .line 2536
    .line 2537
    .line 2538
    sget-object v1, Lyyds/ᛱᛲᛳᲀ;->ᛲᲈᲁ:Lyyds/ᛱᛲᛳᲀ;

    .line 2539
    .line 2540
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2541
    .line 2542
    .line 2543
    move-result-object v2

    .line 2544
    const-wide v3, -0x3db14e68a836eL

    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2550
    .line 2551
    .line 2552
    new-instance v3, Lyyds/ᛵᲇᛵᲇ;

    .line 2553
    .line 2554
    invoke-direct {v3, v7, v0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 2555
    .line 2556
    .line 2557
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2558
    .line 2559
    .line 2560
    const-wide v0, -0xb25de68a836eL

    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2566
    .line 2567
    .line 2568
    const-wide v0, -0xb265e68a836eL

    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2574
    .line 2575
    .line 2576
    const-wide v0, -0xb26ce68a836eL

    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2582
    .line 2583
    .line 2584
    move-result-object v0

    .line 2585
    invoke-static {v0}, Lyyds/ᛵᲇᛵᲀ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 2586
    .line 2587
    .line 2588
    move-result-object v0

    .line 2589
    const-wide v4, -0xb27ce68a836eL

    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2595
    .line 2596
    .line 2597
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2598
    .line 2599
    .line 2600
    move-result v0

    .line 2601
    if-nez v0, :cond_35

    .line 2602
    .line 2603
    goto/16 :goto_24

    .line 2604
    .line 2605
    :cond_35
    sget-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 2606
    .line 2607
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2608
    .line 2609
    .line 2610
    invoke-static {v2}, Lyyds/ᲈᛷᛵᛷ;->ᲀᛲᛳᲀ(Landroid/content/Context;)Z

    .line 2611
    .line 2612
    .line 2613
    invoke-static {v2}, Lyyds/ᛵᛶᛵᲈ;->ᛲᲈᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2614
    .line 2615
    .line 2616
    move-result-object v0

    .line 2617
    const v1, 0x660c0046

    .line 2618
    .line 2619
    .line 2620
    invoke-virtual {v0, v1, v8, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 2621
    .line 2622
    .line 2623
    move-result-object v0

    .line 2624
    const v1, 0x660900b7

    .line 2625
    .line 2626
    .line 2627
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2628
    .line 2629
    .line 2630
    move-result-object v4

    .line 2631
    move-object v7, v4

    .line 2632
    check-cast v7, Landroid/widget/TextView;

    .line 2633
    .line 2634
    if-eqz v7, :cond_36

    .line 2635
    .line 2636
    const v1, 0x660900ba

    .line 2637
    .line 2638
    .line 2639
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2640
    .line 2641
    .line 2642
    move-result-object v4

    .line 2643
    move-object v8, v4

    .line 2644
    check-cast v8, Landroid/widget/ImageView;

    .line 2645
    .line 2646
    if-eqz v8, :cond_36

    .line 2647
    .line 2648
    const v1, 0x660900bb

    .line 2649
    .line 2650
    .line 2651
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v4

    .line 2655
    move-object v9, v4

    .line 2656
    check-cast v9, Landroid/widget/TextView;

    .line 2657
    .line 2658
    if-eqz v9, :cond_36

    .line 2659
    .line 2660
    const v1, 0x660900bc

    .line 2661
    .line 2662
    .line 2663
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2664
    .line 2665
    .line 2666
    move-result-object v4

    .line 2667
    move-object v10, v4

    .line 2668
    check-cast v10, Landroid/widget/TextView;

    .line 2669
    .line 2670
    if-eqz v10, :cond_36

    .line 2671
    .line 2672
    const v1, 0x660900d1

    .line 2673
    .line 2674
    .line 2675
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2676
    .line 2677
    .line 2678
    move-result-object v4

    .line 2679
    move-object v11, v4

    .line 2680
    check-cast v11, Landroid/widget/TextView;

    .line 2681
    .line 2682
    if-eqz v11, :cond_36

    .line 2683
    .line 2684
    const v1, 0x660900d7

    .line 2685
    .line 2686
    .line 2687
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2688
    .line 2689
    .line 2690
    move-result-object v4

    .line 2691
    move-object v12, v4

    .line 2692
    check-cast v12, Landroid/widget/TextView;

    .line 2693
    .line 2694
    if-eqz v12, :cond_36

    .line 2695
    .line 2696
    const v1, 0x660900d8

    .line 2697
    .line 2698
    .line 2699
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2700
    .line 2701
    .line 2702
    move-result-object v4

    .line 2703
    move-object v13, v4

    .line 2704
    check-cast v13, Landroid/widget/TextView;

    .line 2705
    .line 2706
    if-eqz v13, :cond_36

    .line 2707
    .line 2708
    const v1, 0x660900d9

    .line 2709
    .line 2710
    .line 2711
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2712
    .line 2713
    .line 2714
    move-result-object v4

    .line 2715
    move-object v14, v4

    .line 2716
    check-cast v14, Landroid/widget/TextView;

    .line 2717
    .line 2718
    if-eqz v14, :cond_36

    .line 2719
    .line 2720
    const v1, 0x660900da

    .line 2721
    .line 2722
    .line 2723
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2724
    .line 2725
    .line 2726
    move-result-object v4

    .line 2727
    move-object v15, v4

    .line 2728
    check-cast v15, Landroid/widget/TextView;

    .line 2729
    .line 2730
    if-eqz v15, :cond_36

    .line 2731
    .line 2732
    const v1, 0x660901e9

    .line 2733
    .line 2734
    .line 2735
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2736
    .line 2737
    .line 2738
    move-result-object v4

    .line 2739
    move-object/from16 v16, v4

    .line 2740
    .line 2741
    check-cast v16, Landroid/widget/EditText;

    .line 2742
    .line 2743
    if-eqz v16, :cond_36

    .line 2744
    .line 2745
    const v1, 0x660901eb

    .line 2746
    .line 2747
    .line 2748
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2749
    .line 2750
    .line 2751
    move-result-object v4

    .line 2752
    move-object/from16 v17, v4

    .line 2753
    .line 2754
    check-cast v17, Landroid/widget/EditText;

    .line 2755
    .line 2756
    if-eqz v17, :cond_36

    .line 2757
    .line 2758
    const v1, 0x66090295

    .line 2759
    .line 2760
    .line 2761
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2762
    .line 2763
    .line 2764
    move-result-object v4

    .line 2765
    move-object/from16 v18, v4

    .line 2766
    .line 2767
    check-cast v18, Landroid/widget/ImageView;

    .line 2768
    .line 2769
    if-eqz v18, :cond_36

    .line 2770
    .line 2771
    const v1, 0x660902c3

    .line 2772
    .line 2773
    .line 2774
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2775
    .line 2776
    .line 2777
    move-result-object v4

    .line 2778
    move-object/from16 v19, v4

    .line 2779
    .line 2780
    check-cast v19, Landroid/widget/LinearLayout;

    .line 2781
    .line 2782
    if-eqz v19, :cond_36

    .line 2783
    .line 2784
    const v1, 0x660902c7

    .line 2785
    .line 2786
    .line 2787
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2788
    .line 2789
    .line 2790
    move-result-object v4

    .line 2791
    move-object/from16 v20, v4

    .line 2792
    .line 2793
    check-cast v20, Landroid/widget/LinearLayout;

    .line 2794
    .line 2795
    if-eqz v20, :cond_36

    .line 2796
    .line 2797
    const v1, 0x660903dd

    .line 2798
    .line 2799
    .line 2800
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2801
    .line 2802
    .line 2803
    move-result-object v4

    .line 2804
    move-object/from16 v21, v4

    .line 2805
    .line 2806
    check-cast v21, Landroid/widget/SeekBar;

    .line 2807
    .line 2808
    if-eqz v21, :cond_36

    .line 2809
    .line 2810
    const v1, 0x660903de

    .line 2811
    .line 2812
    .line 2813
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2814
    .line 2815
    .line 2816
    move-result-object v4

    .line 2817
    move-object/from16 v22, v4

    .line 2818
    .line 2819
    check-cast v22, Landroid/widget/SeekBar;

    .line 2820
    .line 2821
    if-eqz v22, :cond_36

    .line 2822
    .line 2823
    const v1, 0x660903df

    .line 2824
    .line 2825
    .line 2826
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2827
    .line 2828
    .line 2829
    move-result-object v4

    .line 2830
    move-object/from16 v23, v4

    .line 2831
    .line 2832
    check-cast v23, Landroid/widget/SeekBar;

    .line 2833
    .line 2834
    if-eqz v23, :cond_36

    .line 2835
    .line 2836
    const v1, 0x660903e0

    .line 2837
    .line 2838
    .line 2839
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2840
    .line 2841
    .line 2842
    move-result-object v4

    .line 2843
    move-object/from16 v24, v4

    .line 2844
    .line 2845
    check-cast v24, Landroid/widget/SeekBar;

    .line 2846
    .line 2847
    if-eqz v24, :cond_36

    .line 2848
    .line 2849
    const v1, 0x66090455    # 1.6176103E23f

    .line 2850
    .line 2851
    .line 2852
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2853
    .line 2854
    .line 2855
    move-result-object v4

    .line 2856
    move-object/from16 v25, v4

    .line 2857
    .line 2858
    check-cast v25, Landroid/widget/Switch;

    .line 2859
    .line 2860
    if-eqz v25, :cond_36

    .line 2861
    .line 2862
    const v1, 0x66090456

    .line 2863
    .line 2864
    .line 2865
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2866
    .line 2867
    .line 2868
    move-result-object v4

    .line 2869
    move-object/from16 v26, v4

    .line 2870
    .line 2871
    check-cast v26, Landroid/widget/Switch;

    .line 2872
    .line 2873
    if-eqz v26, :cond_36

    .line 2874
    .line 2875
    const v1, 0x660904bb

    .line 2876
    .line 2877
    .line 2878
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2879
    .line 2880
    .line 2881
    move-result-object v4

    .line 2882
    move-object/from16 v27, v4

    .line 2883
    .line 2884
    check-cast v27, Landroid/widget/TextView;

    .line 2885
    .line 2886
    if-eqz v27, :cond_36

    .line 2887
    .line 2888
    const v1, 0x660904bc

    .line 2889
    .line 2890
    .line 2891
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2892
    .line 2893
    .line 2894
    move-result-object v4

    .line 2895
    move-object/from16 v28, v4

    .line 2896
    .line 2897
    check-cast v28, Landroid/widget/TextView;

    .line 2898
    .line 2899
    if-eqz v28, :cond_36

    .line 2900
    .line 2901
    const v1, 0x660904bd

    .line 2902
    .line 2903
    .line 2904
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2905
    .line 2906
    .line 2907
    move-result-object v4

    .line 2908
    move-object/from16 v29, v4

    .line 2909
    .line 2910
    check-cast v29, Landroid/widget/TextView;

    .line 2911
    .line 2912
    if-eqz v29, :cond_36

    .line 2913
    .line 2914
    const v1, 0x660904c5

    .line 2915
    .line 2916
    .line 2917
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2918
    .line 2919
    .line 2920
    move-result-object v4

    .line 2921
    move-object/from16 v30, v4

    .line 2922
    .line 2923
    check-cast v30, Landroid/widget/TextView;

    .line 2924
    .line 2925
    if-eqz v30, :cond_36

    .line 2926
    .line 2927
    const v1, 0x660905a1

    .line 2928
    .line 2929
    .line 2930
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2931
    .line 2932
    .line 2933
    move-result-object v31

    .line 2934
    if-eqz v31, :cond_36

    .line 2935
    .line 2936
    const v1, 0x660905a2

    .line 2937
    .line 2938
    .line 2939
    invoke-static {v0, v1}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 2940
    .line 2941
    .line 2942
    move-result-object v32

    .line 2943
    if-eqz v32, :cond_36

    .line 2944
    .line 2945
    new-instance v5, Lyyds/ᛸᛲᲈᲀ;

    .line 2946
    .line 2947
    move-object v6, v0

    .line 2948
    check-cast v6, Landroid/widget/LinearLayout;

    .line 2949
    .line 2950
    invoke-direct/range {v5 .. v32}, Lyyds/ᛸᛲᲈᲀ;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/Switch;Landroid/widget/Switch;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;)V

    .line 2951
    .line 2952
    .line 2953
    const-wide v0, -0xb29ae68a836eL

    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2959
    .line 2960
    .line 2961
    invoke-static {}, Lcom/ss/android/ugc/aweme/utils/ActivityStack;->getTopActivity()Landroid/app/Activity;

    .line 2962
    .line 2963
    .line 2964
    move-result-object v0

    .line 2965
    new-instance v1, Lyyds/ᛴᛸᛵᲈ;

    .line 2966
    .line 2967
    invoke-direct {v1, v0}, Lyyds/ᛴᛸᛵᲈ;-><init>(Landroid/app/Activity;)V

    .line 2968
    .line 2969
    .line 2970
    const-wide v7, -0xb2a7e68a836eL

    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 2976
    .line 2977
    .line 2978
    move-result-object v0

    .line 2979
    iput-object v0, v1, Lyyds/ᛴᛸᛵᲈ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 2980
    .line 2981
    invoke-virtual {v1, v6}, Lyyds/ᛴᛸᛵᲈ;->ᲇᲈᛵᛷ(Landroid/view/ViewGroup;)V

    .line 2982
    .line 2983
    .line 2984
    new-instance v0, Lyyds/ᛳᛴᛲᲀ;

    .line 2985
    .line 2986
    invoke-direct {v0}, Lyyds/ᛳᛴᛲᲀ;-><init>()V

    .line 2987
    .line 2988
    .line 2989
    invoke-virtual {v1, v0}, Lyyds/ᛴᛸᛵᲈ;->ᛶᛷᛲᲁ(Lyyds/ᛳᛴᛲᲀ;)V

    .line 2990
    .line 2991
    .line 2992
    invoke-virtual {v1}, Lyyds/ᛴᛸᛵᲈ;->ᲇᲇᲇᛱ()V

    .line 2993
    .line 2994
    .line 2995
    invoke-virtual {v1}, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ()V

    .line 2996
    .line 2997
    .line 2998
    new-instance v0, Lyyds/ᛳᛷᲀᛴ;

    .line 2999
    .line 3000
    invoke-direct {v0, v5, v2, v3}, Lyyds/ᛳᛷᲀᛴ;-><init>(Lyyds/ᛸᛲᲈᲀ;Landroid/content/Context;Lyyds/ᛵᲇᛵᲇ;)V

    .line 3001
    .line 3002
    .line 3003
    iput-object v0, v1, Lyyds/ᛴᛸᛵᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛵᛵᛵᛲ;

    .line 3004
    .line 3005
    invoke-virtual {v1}, Lyyds/ᛴᛸᛵᲈ;->ᛲᛳᛶᲁ()V

    .line 3006
    .line 3007
    .line 3008
    goto :goto_24

    .line 3009
    :cond_36
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 3010
    .line 3011
    .line 3012
    move-result-object v0

    .line 3013
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 3014
    .line 3015
    .line 3016
    move-result-object v0

    .line 3017
    const-wide v1, -0x63128e68a836eL

    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3023
    .line 3024
    .line 3025
    move-result-object v1

    .line 3026
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 3027
    .line 3028
    .line 3029
    move-result-object v0

    .line 3030
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛱᛳᲇ(Ljava/lang/String;)V

    .line 3031
    .line 3032
    .line 3033
    :goto_24
    return-void

    .line 3034
    :pswitch_18
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 3035
    .line 3036
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 3037
    .line 3038
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 3039
    .line 3040
    check-cast v2, Lyyds/ᲈᛷᲈᛶ;

    .line 3041
    .line 3042
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 3043
    .line 3044
    check-cast v0, Landroid/app/Dialog;

    .line 3045
    .line 3046
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 3047
    .line 3048
    .line 3049
    move-result v3

    .line 3050
    if-eqz v3, :cond_37

    .line 3051
    .line 3052
    goto :goto_25

    .line 3053
    :cond_37
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 3054
    .line 3055
    .line 3056
    move-result-object v1

    .line 3057
    const-wide v3, -0x91dde68a836eL

    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3063
    .line 3064
    .line 3065
    invoke-static {v1}, Lyyds/ᛷᛷᛶᲇ;->ᛴᛸᛴᛸ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 3066
    .line 3067
    .line 3068
    move-result-object v1

    .line 3069
    invoke-virtual {v2, v1}, Lyyds/ᲈᛷᲈᛶ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3070
    .line 3071
    .line 3072
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3073
    .line 3074
    .line 3075
    :goto_25
    return-void

    .line 3076
    :pswitch_19
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 3077
    .line 3078
    check-cast v1, Landroid/app/Activity;

    .line 3079
    .line 3080
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 3081
    .line 3082
    check-cast v2, Lyyds/ᛱᛷᛸᲈ;

    .line 3083
    .line 3084
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 3085
    .line 3086
    check-cast v0, Landroid/app/AlertDialog;

    .line 3087
    .line 3088
    const-wide v3, -0xadfce68a836eL

    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3094
    .line 3095
    .line 3096
    const-wide v3, -0xadfde68a836eL

    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3102
    .line 3103
    .line 3104
    const-wide v3, -0xadfee68a836eL

    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3110
    .line 3111
    .line 3112
    const-wide v3, -0xadffe68a836eL

    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3118
    .line 3119
    .line 3120
    move-result-object v11

    .line 3121
    const-wide v3, -0xae00e68a836eL

    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3127
    .line 3128
    .line 3129
    const-wide v3, -0xbc89e68a836eL

    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3135
    .line 3136
    .line 3137
    move-result-object v8

    .line 3138
    const-wide v3, -0xae01e68a836eL

    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3144
    .line 3145
    .line 3146
    const-wide v3, -0xbc90e68a836eL

    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3152
    .line 3153
    .line 3154
    move-result-object v9

    .line 3155
    const-wide v3, -0xae03e68a836eL

    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3161
    .line 3162
    .line 3163
    const-wide v3, -0xbcb4e68a836eL

    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3169
    .line 3170
    .line 3171
    move-result-object v12

    .line 3172
    const-wide v3, -0xae1be68a836eL

    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3178
    .line 3179
    .line 3180
    const-wide v3, -0xbcb9e68a836eL

    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3186
    .line 3187
    .line 3188
    move-result-object v10

    .line 3189
    new-instance v14, Lyyds/ᲈᛵᛶᛸ;

    .line 3190
    .line 3191
    invoke-direct {v14, v1, v2, v0, v6}, Lyyds/ᲈᛵᛶᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 3192
    .line 3193
    .line 3194
    const-wide v2, -0xae0ce68a836eL

    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3200
    .line 3201
    .line 3202
    const v0, -0x1ac6cb

    .line 3203
    .line 3204
    .line 3205
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3206
    .line 3207
    .line 3208
    move-result-object v13

    .line 3209
    new-instance v0, Lyyds/ᛶᛷᛵᲀ;

    .line 3210
    .line 3211
    new-instance v7, Lyyds/ᛶᛵᲁᛴ;

    .line 3212
    .line 3213
    const/4 v15, 0x0

    .line 3214
    invoke-direct/range {v7 .. v15}, Lyyds/ᛶᛵᲁᛴ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lyyds/ᲁᛶᲁᲀ;Z)V

    .line 3215
    .line 3216
    .line 3217
    invoke-direct {v0, v1, v7}, Lyyds/ᛶᛷᛵᲀ;-><init>(Landroid/content/Context;Lyyds/ᛶᛵᲁᛴ;)V

    .line 3218
    .line 3219
    .line 3220
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 3221
    .line 3222
    .line 3223
    return-void

    .line 3224
    :pswitch_1a
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 3225
    .line 3226
    check-cast v1, Landroid/widget/EditText;

    .line 3227
    .line 3228
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 3229
    .line 3230
    check-cast v2, Lyyds/ᛱᛸᛳᛱ;

    .line 3231
    .line 3232
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 3233
    .line 3234
    check-cast v0, Landroid/app/AlertDialog;

    .line 3235
    .line 3236
    invoke-static {v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᲈᲈᲁ(Landroid/widget/EditText;)Ljava/lang/String;

    .line 3237
    .line 3238
    .line 3239
    move-result-object v1

    .line 3240
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 3241
    .line 3242
    .line 3243
    move-result v3

    .line 3244
    if-nez v3, :cond_38

    .line 3245
    .line 3246
    const-wide v0, -0x75a3e68a836eL

    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3252
    .line 3253
    .line 3254
    move-result-object v0

    .line 3255
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 3256
    .line 3257
    .line 3258
    goto :goto_26

    .line 3259
    :cond_38
    new-instance v3, Ljava/io/File;

    .line 3260
    .line 3261
    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3262
    .line 3263
    .line 3264
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 3265
    .line 3266
    .line 3267
    move-result v4

    .line 3268
    if-nez v4, :cond_39

    .line 3269
    .line 3270
    const-wide v0, -0x75ace68a836eL

    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3276
    .line 3277
    .line 3278
    move-result-object v0

    .line 3279
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 3280
    .line 3281
    .line 3282
    goto :goto_26

    .line 3283
    :cond_39
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 3284
    .line 3285
    .line 3286
    move-result v4

    .line 3287
    if-nez v4, :cond_3a

    .line 3288
    .line 3289
    const-wide v0, -0x75b2e68a836eL

    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3295
    .line 3296
    .line 3297
    move-result-object v0

    .line 3298
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 3299
    .line 3300
    .line 3301
    goto :goto_26

    .line 3302
    :cond_3a
    invoke-virtual {v3}, Ljava/io/File;->canRead()Z

    .line 3303
    .line 3304
    .line 3305
    move-result v3

    .line 3306
    if-nez v3, :cond_3b

    .line 3307
    .line 3308
    const-wide v0, -0x75b9e68a836eL

    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3314
    .line 3315
    .line 3316
    move-result-object v0

    .line 3317
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 3318
    .line 3319
    .line 3320
    goto :goto_26

    .line 3321
    :cond_3b
    sget-object v3, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 3322
    .line 3323
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3324
    .line 3325
    .line 3326
    const-wide v3, -0x1a3ce68a836eL

    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3332
    .line 3333
    .line 3334
    sget-object v3, Lyyds/ᛷᛳᛲᛳ;->ᛱᛲᛵᛴ:Lyyds/ᛳᲀᛲ;

    .line 3335
    .line 3336
    sget-object v4, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 3337
    .line 3338
    const/16 v5, 0xc9

    .line 3339
    .line 3340
    aget-object v4, v4, v5

    .line 3341
    .line 3342
    invoke-virtual {v3, v4, v1}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 3343
    .line 3344
    .line 3345
    invoke-virtual {v2, v1}, Lyyds/ᛱᛸᛳᛱ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 3346
    .line 3347
    .line 3348
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3349
    .line 3350
    .line 3351
    :goto_26
    return-void

    .line 3352
    :pswitch_1b
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 3353
    .line 3354
    check-cast v1, Landroid/content/Context;

    .line 3355
    .line 3356
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 3357
    .line 3358
    check-cast v2, Lyyds/ᛷᲀᲇᲈ;

    .line 3359
    .line 3360
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 3361
    .line 3362
    check-cast v0, Lyyds/ᛱᛷᛸᲈ;

    .line 3363
    .line 3364
    new-instance v3, Lyyds/ᛳᛸᛴᛶ;

    .line 3365
    .line 3366
    invoke-direct {v3, v2, v0, v6}, Lyyds/ᛳᛸᛴᛶ;-><init>(Lyyds/ᛷᲀᲇᲈ;Lyyds/ᛱᛷᛸᲈ;I)V

    .line 3367
    .line 3368
    .line 3369
    invoke-static {v1, v8, v3}, Lyyds/ᲀᲀᛸᛱ;->ᛳᲁᲁᲇ(Landroid/content/Context;Lyyds/ᛲᛴᛳᛲ;Lyyds/ᲁᛶᲁᲀ;)V

    .line 3370
    .line 3371
    .line 3372
    return-void

    .line 3373
    :pswitch_1c
    iget-object v1, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 3374
    .line 3375
    check-cast v1, Lyyds/ᲇᲈᛵᛷ;

    .line 3376
    .line 3377
    iget-object v2, v0, Lyyds/ᛵᲀᲈᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 3378
    .line 3379
    check-cast v2, Lyyds/ᲁᛶᲁᲀ;

    .line 3380
    .line 3381
    iget-object v0, v0, Lyyds/ᛵᲀᲈᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 3382
    .line 3383
    check-cast v0, Landroid/app/Dialog;

    .line 3384
    .line 3385
    if-eqz v1, :cond_3d

    .line 3386
    .line 3387
    iget-object v1, v1, Lyyds/ᲇᲈᛵᛷ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 3388
    .line 3389
    sget-object v3, Lyyds/ᲀᛲᛲᲇ;->ᛲᲈᲁ:Lyyds/ᲀᛲᛲᲇ;

    .line 3390
    .line 3391
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3392
    .line 3393
    .line 3394
    const-wide v3, -0x22397e68a836eL

    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3400
    .line 3401
    .line 3402
    sget-object v3, Lyyds/ᲀᛲᛲᲇ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 3403
    .line 3404
    monitor-enter v3

    .line 3405
    :try_start_5
    invoke-static {}, Lyyds/ᲀᛲᛲᲇ;->ᛵᛸᛸᛷ()Ljava/util/Map;

    .line 3406
    .line 3407
    .line 3408
    move-result-object v4

    .line 3409
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 3410
    .line 3411
    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 3412
    .line 3413
    .line 3414
    invoke-interface {v5, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3415
    .line 3416
    .line 3417
    move-result-object v1

    .line 3418
    if-eqz v1, :cond_3c

    .line 3419
    .line 3420
    invoke-static {v5}, Lyyds/ᲀᛲᛲᲇ;->ᛷᲈᲈᲁ(Ljava/util/LinkedHashMap;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 3421
    .line 3422
    .line 3423
    goto :goto_27

    .line 3424
    :catchall_3
    move-exception v0

    .line 3425
    goto :goto_28

    .line 3426
    :cond_3c
    :goto_27
    monitor-exit v3

    .line 3427
    invoke-interface {v2}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 3428
    .line 3429
    .line 3430
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3431
    .line 3432
    .line 3433
    const-wide v0, -0xc3bfe68a836eL

    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 3439
    .line 3440
    .line 3441
    move-result-object v0

    .line 3442
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 3443
    .line 3444
    .line 3445
    goto :goto_29

    .line 3446
    :goto_28
    monitor-exit v3

    .line 3447
    throw v0

    .line 3448
    :cond_3d
    :goto_29
    return-void

    .line 3449
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
