.class public final synthetic Lm90;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;

.field public final synthetic κ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lm90;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lm90;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lm90;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lm90;->ζ:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lm90;->ι:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lm90;->κ:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p6, p0, Lm90;->ε:I

    iput-object p1, p0, Lm90;->η:Ljava/lang/Object;

    iput-object p2, p0, Lm90;->θ:Ljava/lang/Object;

    iput-object p3, p0, Lm90;->ι:Ljava/lang/Object;

    iput-object p4, p0, Lm90;->ζ:Ljava/lang/Object;

    iput-object p5, p0, Lm90;->κ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lm90;->ε:I

    .line 4
    .line 5
    const/16 v2, 0x17

    .line 6
    .line 7
    const-string v3, "\u6b63\u5728\u8fde\u63a5..."

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "comment_bg_mode"

    .line 11
    .line 12
    sget-object v6, Ls62;->α:Ls62;

    .line 13
    .line 14
    iget-object v7, v0, Lm90;->κ:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v8, v0, Lm90;->ζ:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v9, v0, Lm90;->ι:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v10, v0, Lm90;->θ:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v0, v0, Lm90;->η:Ljava/lang/Object;

    .line 23
    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    check-cast v0, Lsm1;

    .line 28
    .line 29
    check-cast v10, La80;

    .line 30
    .line 31
    check-cast v9, [Ljava/lang/String;

    .line 32
    .line 33
    check-cast v8, Landroid/widget/LinearLayout;

    .line 34
    .line 35
    check-cast v7, Landroid/widget/LinearLayout;

    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    sget-object v2, Lbv1;->α:Lbv1;

    .line 46
    .line 47
    invoke-static {v5, v1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    iput v1, v0, Lsm1;->ε:I

    .line 51
    .line 52
    aget-object v0, v9, v1

    .line 53
    .line 54
    invoke-interface {v10, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    const/16 v2, 0x8

    .line 59
    .line 60
    if-ne v1, v0, :cond_0

    .line 61
    .line 62
    move v0, v4

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v0, v2

    .line 65
    :goto_0
    invoke-virtual {v8, v0}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x2

    .line 69
    if-ne v1, v0, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move v4, v2

    .line 73
    :goto_1
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    return-object v6

    .line 77
    :pswitch_0
    check-cast v0, Landroid/app/Activity;

    .line 78
    .line 79
    move-object v14, v10

    .line 80
    check-cast v14, [Ljava/lang/String;

    .line 81
    .line 82
    move-object v12, v9

    .line 83
    check-cast v12, Lsm1;

    .line 84
    .line 85
    move-object v15, v8

    .line 86
    check-cast v15, Landroid/widget/LinearLayout;

    .line 87
    .line 88
    move-object/from16 v16, v7

    .line 89
    .line 90
    check-cast v16, Landroid/widget/LinearLayout;

    .line 91
    .line 92
    move-object/from16 v13, p1

    .line 93
    .line 94
    check-cast v13, La80;

    .line 95
    .line 96
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    sget-object v1, Lbv1;->α:Lbv1;

    .line 100
    .line 101
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {v1, v5, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 106
    .line 107
    .line 108
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    :catchall_0
    new-instance v11, Lm90;

    .line 110
    .line 111
    const/16 v17, 0x5

    .line 112
    .line 113
    invoke-direct/range {v11 .. v17}, Lm90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 114
    .line 115
    .line 116
    const-string v1, "\u9009\u62e9\u80cc\u666f\u6a21\u5f0f"

    .line 117
    .line 118
    invoke-static {v0, v1, v14, v4, v11}, Lbv1;->Ω(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILa80;)V

    .line 119
    .line 120
    .line 121
    return-object v6

    .line 122
    :pswitch_1
    check-cast v0, Landroid/app/Activity;

    .line 123
    .line 124
    move-object/from16 v18, v10

    .line 125
    .line 126
    check-cast v18, Ljava/lang/String;

    .line 127
    .line 128
    check-cast v9, Lfv;

    .line 129
    .line 130
    move-object/from16 v17, v8

    .line 131
    .line 132
    check-cast v17, Ljava/lang/String;

    .line 133
    .line 134
    move-object/from16 v23, v7

    .line 135
    .line 136
    check-cast v23, Lzx0;

    .line 137
    .line 138
    move-object/from16 v20, p1

    .line 139
    .line 140
    check-cast v20, Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    sget-object v1, Lqy0;->α:Lqy0;

    .line 146
    .line 147
    invoke-static {v0}, Lqy0;->Φ(Landroid/content/Context;)V

    .line 148
    .line 149
    .line 150
    const-string v4, "\u4e0b\u8f7d\u539f\u753b\u8d28"

    .line 151
    .line 152
    invoke-static {v0, v4, v3}, Lqy0;->б(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const-string v3, "\u5f00\u59cb\u4e0b\u8f7d\u539f\u753b\u8d28\u89c6\u9891..."

    .line 156
    .line 157
    invoke-static {v0, v3}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-object v3, v9, Lfv;->α:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v0}, Lqy0;->Φ(Landroid/content/Context;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Lqy0;->ж()I

    .line 166
    .line 167
    .line 168
    move-result v19

    .line 169
    invoke-static {v0}, Lqy0;->А(Landroid/content/Context;)Z

    .line 170
    .line 171
    .line 172
    move-result v21

    .line 173
    new-instance v15, Lvx0;

    .line 174
    .line 175
    move-object/from16 v16, v0

    .line 176
    .line 177
    move-object/from16 v22, v3

    .line 178
    .line 179
    invoke-direct/range {v15 .. v23}, Lvx0;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Lzx0;)V

    .line 180
    .line 181
    .line 182
    const-string v0, "dl-original-video"

    .line 183
    .line 184
    invoke-static {v2, v15, v0}, Lp91;->Ζ(ILp70;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-object v6

    .line 188
    :pswitch_2
    check-cast v0, Landroid/app/Activity;

    .line 189
    .line 190
    move-object/from16 v18, v10

    .line 191
    .line 192
    check-cast v18, Lfv;

    .line 193
    .line 194
    move-object/from16 v20, v9

    .line 195
    .line 196
    check-cast v20, Ljava/lang/String;

    .line 197
    .line 198
    move-object/from16 v21, v8

    .line 199
    .line 200
    check-cast v21, Lf8;

    .line 201
    .line 202
    move-object/from16 v22, v7

    .line 203
    .line 204
    check-cast v22, Ljava/lang/String;

    .line 205
    .line 206
    move-object/from16 v19, p1

    .line 207
    .line 208
    check-cast v19, Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    sget-object v1, Lqy0;->α:Lqy0;

    .line 214
    .line 215
    invoke-static {v0}, Lqy0;->Φ(Landroid/content/Context;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Lqy0;->ж()I

    .line 219
    .line 220
    .line 221
    move-result v23

    .line 222
    invoke-static {v0}, Lqy0;->А(Landroid/content/Context;)Z

    .line 223
    .line 224
    .line 225
    move-result v24

    .line 226
    const-string v1, "\u4e0b\u8f7d\u97f3\u9891"

    .line 227
    .line 228
    invoke-static {v0, v1, v3}, Lqy0;->б(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    const-string v1, "\u5f00\u59cb\u4e0b\u8f7d\u97f3\u9891..."

    .line 232
    .line 233
    invoke-static {v0, v1}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    new-instance v16, Lvx0;

    .line 237
    .line 238
    move-object/from16 v17, v0

    .line 239
    .line 240
    invoke-direct/range {v16 .. v24}, Lvx0;-><init>(Landroid/app/Activity;Lfv;Ljava/lang/String;Ljava/lang/String;Lf8;Ljava/lang/String;IZ)V

    .line 241
    .line 242
    .line 243
    move-object/from16 v0, v16

    .line 244
    .line 245
    const-string v1, "dl-audio"

    .line 246
    .line 247
    invoke-static {v2, v0, v1}, Lp91;->Ζ(ILp70;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    return-object v6

    .line 251
    :pswitch_3
    check-cast v0, Landroid/widget/LinearLayout;

    .line 252
    .line 253
    check-cast v10, Lcom/example/dyhelper/ui/GestureAreaView;

    .line 254
    .line 255
    check-cast v8, Landroid/widget/TextView;

    .line 256
    .line 257
    check-cast v9, Landroid/widget/TextView;

    .line 258
    .line 259
    move-object v11, v7

    .line 260
    check-cast v11, Landroid/widget/TextView;

    .line 261
    .line 262
    move-object/from16 v12, p1

    .line 263
    .line 264
    check-cast v12, Ljava/lang/String;

    .line 265
    .line 266
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    move-object v7, v9

    .line 270
    move-object v9, v8

    .line 271
    move-object v8, v10

    .line 272
    move-object v10, v7

    .line 273
    move-object v7, v0

    .line 274
    invoke-static/range {v7 .. v12}, Lia0;->θ(Landroid/widget/LinearLayout;Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    return-object v6

    .line 278
    :pswitch_4
    check-cast v0, Landroid/app/Activity;

    .line 279
    .line 280
    move-object v12, v10

    .line 281
    check-cast v12, Landroid/app/AlertDialog;

    .line 282
    .line 283
    move-object v14, v9

    .line 284
    check-cast v14, Landroid/widget/ProgressBar;

    .line 285
    .line 286
    move-object v15, v8

    .line 287
    check-cast v15, Landroid/widget/TextView;

    .line 288
    .line 289
    move-object/from16 v16, v7

    .line 290
    .line 291
    check-cast v16, Lxx;

    .line 292
    .line 293
    move-object/from16 v13, p1

    .line 294
    .line 295
    check-cast v13, Lr90;

    .line 296
    .line 297
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    new-instance v11, Lv8;

    .line 301
    .line 302
    const/16 v17, 0x3

    .line 303
    .line 304
    invoke-direct/range {v11 .. v17}, Lv8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v11}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 308
    .line 309
    .line 310
    return-object v6

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
