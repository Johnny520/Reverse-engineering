.class public final Lq71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lq71;

.field public static final β:Ljava/util/List;

.field public static γ:Lxx;

.field public static final δ:Lez0;

.field public static final ε:Lt41;

.field public static final ζ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 34

    .line 1
    new-instance v0, Lq71;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq71;->α:Lq71;

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/high16 v1, 0x40000000    # 2.0f

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/high16 v2, 0x40400000    # 3.0f

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/high16 v3, 0x40800000    # 4.0f

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/high16 v4, 0x40a00000    # 5.0f

    .line 33
    .line 34
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Float;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lq71;->β:Ljava/util/List;

    .line 47
    .line 48
    sget-object v0, Lez0;->γ:Lym1;

    .line 49
    .line 50
    const-string v0, "application/json; charset=utf-8"

    .line 51
    .line 52
    invoke-static {v0}, Lkn0;->φ(Ljava/lang/String;)Lez0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, Lq71;->δ:Lez0;

    .line 57
    .line 58
    new-instance v0, Ls41;

    .line 59
    .line 60
    invoke-direct {v0}, Ls41;-><init>()V

    .line 61
    .line 62
    .line 63
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const-wide/16 v2, 0xf

    .line 69
    .line 70
    invoke-static {v2, v3}, Lud2;->β(J)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    iput v2, v0, Ls41;->τ:I

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const-wide/16 v1, 0x2d

    .line 80
    .line 81
    invoke-static {v1, v2}, Lud2;->β(J)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    iput v1, v0, Ls41;->υ:I

    .line 86
    .line 87
    const/4 v1, 0x1

    .line 88
    iput-boolean v1, v0, Ls41;->ι:Z

    .line 89
    .line 90
    iput-boolean v1, v0, Ls41;->κ:Z

    .line 91
    .line 92
    iput-boolean v1, v0, Ls41;->ζ:Z

    .line 93
    .line 94
    new-instance v2, Lt41;

    .line 95
    .line 96
    invoke-direct {v2, v0}, Lt41;-><init>(Ls41;)V

    .line 97
    .line 98
    .line 99
    sput-object v2, Lq71;->ε:Lt41;

    .line 100
    .line 101
    const-string v0, "\u4e0b\u8f7d\u4f5c\u54c1"

    .line 102
    .line 103
    const-string v2, "\u6839\u636e\u5f53\u524d\u5a92\u4f53\u7c7b\u578b\u4fdd\u5b58\u4f5c\u54c1"

    .line 104
    .line 105
    const-string v3, "\u5185\u5bb9\u4e0e\u4e0b\u8f7d"

    .line 106
    .line 107
    const/4 v4, 0x0

    .line 108
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const-string v0, "\u5168\u5c40\u89c6\u9891\u500d\u901f"

    .line 113
    .line 114
    const-string v2, "\u8bbe\u7f6e\u540e\u7eed\u89c6\u9891\u7684\u64ad\u653e\u500d\u901f"

    .line 115
    .line 116
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    const-string v0, "\u4e0b\u8f7d\u97f3\u9891"

    .line 121
    .line 122
    const-string v2, "\u63d0\u53d6\u5f53\u524d\u4f5c\u54c1\u539f\u58f0"

    .line 123
    .line 124
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    const-string v0, "\u9009\u62e9\u4e0b\u8f7d"

    .line 129
    .line 130
    const-string v2, "\u9009\u62e9\u56fe\u7247\u3001\u89c6\u9891\u6216\u52a8\u56fe\u5185\u5bb9"

    .line 131
    .line 132
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    const-string v0, "\u4e0b\u8f7d\u539f\u753b\u8d28"

    .line 137
    .line 138
    const-string v2, "\u4f18\u5148\u89e3\u6790\u66f4\u9ad8\u753b\u8d28\u89c6\u9891"

    .line 139
    .line 140
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    const-string v0, "\u590d\u5236\u4e0b\u8f7d\u76f4\u94fe"

    .line 145
    .line 146
    const-string v2, "\u590d\u5236\u5f53\u524d\u4f5c\u54c1\u7684\u5a92\u4f53\u4e0b\u8f7d\u5730\u5740"

    .line 147
    .line 148
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    const-string v0, "\u9884\u89c8\u5e76\u4fdd\u5b58\u56fe\u7247"

    .line 153
    .line 154
    const-string v2, "\u9884\u89c8\u5f53\u524d\u56fe\u6587\u4f5c\u54c1\u56fe\u7247"

    .line 155
    .line 156
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    const-string v0, "\u6279\u91cf\u4e0b\u8f7d\u4f5c\u8005\u4e3b\u9875\u4f5c\u54c1"

    .line 161
    .line 162
    const-string v2, "\u4e0b\u8f7d\u4f5c\u8005\u4e3b\u9875\u4f5c\u54c1"

    .line 163
    .line 164
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    const-string v0, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 169
    .line 170
    const-string v2, "\u8df3\u8f6c\u6216\u8f93\u5165\u4f5c\u8005\u4e3b\u9875\u4fe1\u606f"

    .line 171
    .line 172
    const-string v3, "\u4f5c\u8005\u4e0e\u5206\u4eab"

    .line 173
    .line 174
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    const-string v0, "\u590d\u5236\u4e3b\u9875ID"

    .line 179
    .line 180
    const-string v2, "\u590d\u5236\u5f53\u524d\u4f5c\u8005 UID \u6216 SecUID"

    .line 181
    .line 182
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    const-string v0, "\u590d\u5236\u6587\u6848"

    .line 187
    .line 188
    const-string v2, "\u590d\u5236\u5f53\u524d\u4f5c\u54c1\u6587\u5b57\u63cf\u8ff0"

    .line 189
    .line 190
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    const-string v0, "\u590d\u5236\u94fe\u63a5"

    .line 195
    .line 196
    const-string v2, "\u590d\u5236\u5f53\u524d\u4f5c\u54c1\u5206\u4eab\u5730\u5740"

    .line 197
    .line 198
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 199
    .line 200
    .line 201
    move-result-object v16

    .line 202
    const-string v0, "\u4f5c\u8005\u4e3b\u9875\u4e66\u7b7e"

    .line 203
    .line 204
    const-string v2, "\u6536\u85cf\u5f53\u524d\u4f5c\u54c1\u4f5c\u8005\u4e3b\u9875"

    .line 205
    .line 206
    const-string v3, "\u6536\u85cf\u4e0e\u4e66\u7b7e"

    .line 207
    .line 208
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 209
    .line 210
    .line 211
    move-result-object v17

    .line 212
    const-string v0, "\u4f5c\u54c1\u4e66\u7b7e"

    .line 213
    .line 214
    const-string v2, "\u6536\u85cf\u5f53\u524d\u4f5c\u54c1"

    .line 215
    .line 216
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 217
    .line 218
    .line 219
    move-result-object v18

    .line 220
    const-string v0, "\u4e66\u7b7e\u7ba1\u7406"

    .line 221
    .line 222
    const-string v2, "\u7ba1\u7406\u4f5c\u54c1\u3001\u4e3b\u9875\u548c\u8bc4\u8bba\u4e66\u7b7e"

    .line 223
    .line 224
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 225
    .line 226
    .line 227
    move-result-object v19

    .line 228
    const-string v0, "\u706b\u661f\u706b\u82b1\u7ba1\u7406"

    .line 229
    .line 230
    const-string v2, "\u7ba1\u7406\u706b\u82b1\u7eed\u671f"

    .line 231
    .line 232
    const-string v3, "\u6a21\u5757\u5de5\u5177"

    .line 233
    .line 234
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 235
    .line 236
    .line 237
    move-result-object v20

    .line 238
    const-string v0, "\u8425\u5730\u7ba1\u7406"

    .line 239
    .line 240
    const-string v2, "\u7ba1\u7406\u6536\u83dc\u3001\u79cd\u5730\u548c\u6d47\u6c34"

    .line 241
    .line 242
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 243
    .line 244
    .line 245
    move-result-object v21

    .line 246
    const-string v0, "\u6295\u5582\u98df\u7269"

    .line 247
    .line 248
    const-string v2, "\u6309\u6295\u5582\u8bbe\u7f6e\u6267\u884c\u624b\u52a8\u6295\u5582"

    .line 249
    .line 250
    invoke-static {v0, v2, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 251
    .line 252
    .line 253
    move-result-object v22

    .line 254
    const-string v0, "\u9886\u53d6\u706b\u661f"

    .line 255
    .line 256
    const-string v2, "\u9886\u53d6\u5df2\u5b8c\u6210\u4efb\u52a1\u7684\u706b\u661f"

    .line 257
    .line 258
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 259
    .line 260
    .line 261
    move-result-object v23

    .line 262
    const-string v0, "\u9886\u53d6\u4eb2\u5bc6\u5ea6"

    .line 263
    .line 264
    const-string v2, "\u9886\u53d6\u53ef\u7528\u7684\u5c0f\u706b\u4eba\u7ecf\u9a8c"

    .line 265
    .line 266
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 267
    .line 268
    .line 269
    move-result-object v24

    .line 270
    const-string v0, "\u5b8c\u6210\u4e92\u53d1\u6d88\u606f\u4efb\u52a1"

    .line 271
    .line 272
    const-string v2, "\u5b8c\u6210\u5f53\u524d\u4e92\u53d1\u6d88\u606f\u4efb\u52a1"

    .line 273
    .line 274
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 275
    .line 276
    .line 277
    move-result-object v25

    .line 278
    const-string v0, "\u9ab0\u5b50\u63a7\u5236"

    .line 279
    .line 280
    const-string v2, "\u914d\u7f6e\u9ab0\u5b50\u968f\u673a\u6216\u9501\u5b9a\u70b9\u6570"

    .line 281
    .line 282
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 283
    .line 284
    .line 285
    move-result-object v26

    .line 286
    const-string v0, "\u4e34\u65f6\u663e\u793a\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 287
    .line 288
    const-string v2, "\u4e34\u65f6\u663e\u793a\u6216\u6062\u590d\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 289
    .line 290
    const-string v3, "\u6d88\u606f\u5de5\u5177"

    .line 291
    .line 292
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 293
    .line 294
    .line 295
    move-result-object v27

    .line 296
    const-string v0, "\u4e00\u952e\u5df2\u8bfb"

    .line 297
    .line 298
    const-string v2, "\u5c06\u6d88\u606f\u5217\u8868\u4f1a\u8bdd\u6807\u8bb0\u4e3a\u5df2\u8bfb"

    .line 299
    .line 300
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 301
    .line 302
    .line 303
    move-result-object v28

    .line 304
    const-string v0, "\u6279\u91cf\u5220\u9664\u4f1a\u8bdd"

    .line 305
    .line 306
    const-string v2, "\u7b5b\u9009\u5e76\u6279\u91cf\u5220\u9664\u670d\u52a1\u7aef\u5355\u804a\u4f1a\u8bdd"

    .line 307
    .line 308
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 309
    .line 310
    .line 311
    move-result-object v29

    .line 312
    const-string v0, "\u7fa4\u7ba1\u7406"

    .line 313
    .line 314
    const-string v2, "\u67e5\u770b\u5e76\u5904\u7406\u5f85\u5ba1\u6838\u5165\u7fa4\u7533\u8bf7"

    .line 315
    .line 316
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 317
    .line 318
    .line 319
    move-result-object v30

    .line 320
    const-string v0, "\u804a\u5929\u8bb0\u5f55\u5bfc\u51fa"

    .line 321
    .line 322
    const-string v2, "\u5bfc\u51fa\u5f53\u524d\u804a\u5929\u8bb0\u5f55"

    .line 323
    .line 324
    invoke-static {v0, v2, v3, v1}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 325
    .line 326
    .line 327
    move-result-object v31

    .line 328
    const-string v0, "\u83b7\u53d6\u5185\u6d4b\u7533\u8bf7\u7801"

    .line 329
    .line 330
    const-string v1, "\u751f\u6210\u5185\u6d4b\u7533\u8bf7\u7801"

    .line 331
    .line 332
    invoke-static {v0, v1, v3, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 333
    .line 334
    .line 335
    move-result-object v32

    .line 336
    const-string v0, "\u6253\u5f00 DY Helper \u8bbe\u7f6e"

    .line 337
    .line 338
    const-string v1, "\u8bbe\u7f6e"

    .line 339
    .line 340
    const-string v2, "\u6a21\u5757\u8bbe\u7f6e"

    .line 341
    .line 342
    invoke-static {v2, v0, v1, v4}, Lq71;->Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;

    .line 343
    .line 344
    .line 345
    move-result-object v33

    .line 346
    filled-new-array/range {v5 .. v33}, [Ln71;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    sput-object v0, Lq71;->ζ:Ljava/util/List;

    .line 355
    .line 356
    return-void
.end method

.method public static Α(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;I)Landroid/widget/FrameLayout;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 7
    .line 8
    invoke-direct {v1, p4, p4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-virtual {v1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 24
    .line 25
    .line 26
    int-to-float p2, p4

    .line 27
    const p4, 0x3e99999a    # 0.3f

    .line 28
    .line 29
    .line 30
    mul-float/2addr p4, p2

    .line 31
    invoke-virtual {v1, p4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    new-instance p4, Landroid/widget/ImageView;

    .line 38
    .line 39
    invoke-direct {p4, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    sget-object v1, Lx01;->α:Lx01;

    .line 43
    .line 44
    invoke-virtual {v1, p0, p1}, Lx01;->β(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p4, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p4, p0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 60
    .line 61
    .line 62
    const p0, 0x3e6147ae    # 0.22f

    .line 63
    .line 64
    .line 65
    mul-float/2addr p2, p0

    .line 66
    float-to-int p0, p2

    .line 67
    invoke-virtual {p4, p0, p0, p0, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 71
    .line 72
    invoke-virtual {p4, p0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 73
    .line 74
    .line 75
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 76
    .line 77
    const/4 p1, -0x1

    .line 78
    invoke-direct {p0, p1, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p4, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method

.method public static Β(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "http"

    .line 8
    .line 9
    if-eqz p0, :cond_2

    .line 10
    .line 11
    new-instance v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    move-object v5, v4

    .line 31
    check-cast v5, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v5, v2, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    if-eqz p1, :cond_5

    .line 64
    .line 65
    new-instance p0, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    move-object v4, v3

    .line 85
    check-cast v4, Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v4, v2, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Ljava/lang/String;

    .line 112
    .line 113
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_6

    .line 126
    .line 127
    const/4 p0, 0x0

    .line 128
    :cond_6
    return-object p0
.end method

.method public static Γ(F)F
    .locals 6

    .line 1
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 6
    .line 7
    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_4

    .line 11
    .line 12
    sget-object v0, Lq71;->β:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    :goto_0
    move-object p0, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v2, v1

    .line 39
    check-cast v2, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    sub-float/2addr v2, p0

    .line 46
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    move-object v4, v3

    .line 55
    check-cast v4, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    sub-float/2addr v4, p0

    .line 62
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-static {v2, v4}, Ljava/lang/Float;->compare(FF)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-lez v5, :cond_3

    .line 71
    .line 72
    move-object v1, v3

    .line 73
    move v2, v4

    .line 74
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :goto_1
    check-cast p0, Ljava/lang/Float;

    .line 82
    .line 83
    if-eqz p0, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    return p0

    .line 90
    :cond_4
    const/high16 p0, 0x3f800000    # 1.0f

    .line 91
    .line 92
    return p0
.end method

.method public static Δ()Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Le72;->γ:Ljava/util/ArrayList;

    .line 2
    .line 3
    sget-wide v0, Le72;->α:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    new-instance v1, Leo1;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object v0, v1

    .line 25
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const-string v2, "DYHelper"

    .line 32
    .line 33
    const-string v3, "\u64cd\u4f5c\u9762\u677f\u8bfb\u53d6\u5185\u6d4b\u7533\u8bf7 UID \u5931\u8d25"

    .line 34
    .line 35
    invoke-static {v2, v3, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    instance-of v1, v0, Leo1;

    .line 39
    .line 40
    const-string v2, ""

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    move-object v0, v2

    .line 45
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    const-string v1, "0"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    const-string v1, "null"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/4 v0, 0x0

    .line 71
    :goto_1
    if-nez v0, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-object v2, v0

    .line 75
    :goto_2
    return-object v2
.end method

.method public static Ε()Lf8;
    .locals 61

    .line 1
    sget-object v0, Lpq;->α:Lpq;

    .line 2
    .line 3
    invoke-static {}, Lpq;->β()Lkq;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lkq;->β:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v2, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    invoke-static {v1}, Lb10;->υ(Ljava/lang/Object;)Lf8;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    move-object v2, v1

    .line 21
    goto :goto_2

    .line 22
    :cond_1
    :goto_1
    sget-object v1, Lf8;->Χ:Lf8;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_2
    iget-object v1, v2, Lf8;->ζ:Lh8;

    .line 26
    .line 27
    iget-object v3, v2, Lf8;->π:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, v2, Lf8;->Ρ:Ljava/util/List;

    .line 30
    .line 31
    iget-object v5, v2, Lf8;->ι:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v14, v2, Lf8;->θ:Ljava/lang/String;

    .line 34
    .line 35
    sget-object v6, Lh8;->ι:Lh8;

    .line 36
    .line 37
    if-eq v1, v6, :cond_56

    .line 38
    .line 39
    sget-object v7, Lf31;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    check-cast v7, Lf8;

    .line 46
    .line 47
    const-string v9, ", awemeId="

    .line 48
    .line 49
    const-string v10, "OperationDialog current source="

    .line 50
    .line 51
    const-string v11, "DYHelper"

    .line 52
    .line 53
    const/4 v12, 0x0

    .line 54
    if-eqz v7, :cond_4e

    .line 55
    .line 56
    iget-object v13, v7, Lf8;->Ρ:Ljava/util/List;

    .line 57
    .line 58
    iget-object v15, v7, Lf8;->θ:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v8, v7, Lf8;->ζ:Lh8;

    .line 61
    .line 62
    if-eq v8, v6, :cond_4e

    .line 63
    .line 64
    if-eqz v14, :cond_4e

    .line 65
    .line 66
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v15

    .line 70
    if-eqz v15, :cond_4e

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    iget-object v0, v0, Lkq;->δ:Lmq;

    .line 75
    .line 76
    iget-object v0, v0, Lmq;->ε:Ljava/lang/String;

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_2
    move-object v0, v12

    .line 80
    :goto_3
    const-string v15, ", merged=network"

    .line 81
    .line 82
    invoke-static {v10, v0, v9, v14, v15}, Llz1;->ξ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const/4 v9, 0x4

    .line 87
    invoke-static {v11, v0, v12, v9, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v2, Lf8;->Ο:Ljava/util/List;

    .line 91
    .line 92
    iget-object v9, v2, Lf8;->β:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v10, v2, Lf8;->α:Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v4, :cond_4

    .line 97
    .line 98
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v15

    .line 102
    if-eqz v15, :cond_3

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_3
    move-object/from16 v49, v4

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_4
    :goto_4
    if-eqz v13, :cond_6

    .line 109
    .line 110
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_5

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    move-object/from16 v49, v13

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_6
    :goto_5
    move-object/from16 v49, v12

    .line 121
    .line 122
    :goto_6
    iget-object v4, v2, Lf8;->δ:Ljava/util/List;

    .line 123
    .line 124
    iget-object v13, v7, Lf8;->δ:Ljava/util/List;

    .line 125
    .line 126
    iget-object v15, v7, Lf8;->Ο:Ljava/util/List;

    .line 127
    .line 128
    const-string v12, "http"

    .line 129
    .line 130
    move-object/from16 v18, v0

    .line 131
    .line 132
    if-eqz v13, :cond_9

    .line 133
    .line 134
    new-instance v0, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    :goto_7
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v19

    .line 147
    if-eqz v19, :cond_8

    .line 148
    .line 149
    move-object/from16 v19, v3

    .line 150
    .line 151
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    move-object/from16 v20, v4

    .line 156
    .line 157
    move-object v4, v3

    .line 158
    check-cast v4, Ljava/lang/String;

    .line 159
    .line 160
    move-object/from16 v21, v13

    .line 161
    .line 162
    const/4 v13, 0x0

    .line 163
    invoke-static {v4, v12, v13}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_7

    .line 168
    .line 169
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    :cond_7
    move-object/from16 v3, v19

    .line 173
    .line 174
    move-object/from16 v4, v20

    .line 175
    .line 176
    move-object/from16 v13, v21

    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_8
    move-object/from16 v19, v3

    .line 180
    .line 181
    move-object/from16 v20, v4

    .line 182
    .line 183
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    goto :goto_8

    .line 192
    :cond_9
    move-object/from16 v19, v3

    .line 193
    .line 194
    move-object/from16 v20, v4

    .line 195
    .line 196
    const/4 v0, 0x0

    .line 197
    :goto_8
    sget-object v3, Ljz;->ε:Ljz;

    .line 198
    .line 199
    if-nez v0, :cond_a

    .line 200
    .line 201
    move-object v0, v3

    .line 202
    :cond_a
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-nez v4, :cond_b

    .line 207
    .line 208
    move-object/from16 v20, v3

    .line 209
    .line 210
    const/4 v4, 0x0

    .line 211
    goto :goto_b

    .line 212
    :cond_b
    if-eqz v20, :cond_e

    .line 213
    .line 214
    new-instance v0, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-interface/range {v20 .. v20}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v13

    .line 227
    if-eqz v13, :cond_d

    .line 228
    .line 229
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v13

    .line 233
    move-object/from16 v20, v3

    .line 234
    .line 235
    move-object v3, v13

    .line 236
    check-cast v3, Ljava/lang/String;

    .line 237
    .line 238
    move-object/from16 v21, v4

    .line 239
    .line 240
    const/4 v4, 0x0

    .line 241
    invoke-static {v3, v12, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-eqz v3, :cond_c

    .line 246
    .line 247
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    :cond_c
    move-object/from16 v3, v20

    .line 251
    .line 252
    move-object/from16 v4, v21

    .line 253
    .line 254
    goto :goto_9

    .line 255
    :cond_d
    move-object/from16 v20, v3

    .line 256
    .line 257
    const/4 v4, 0x0

    .line 258
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-eqz v3, :cond_f

    .line 271
    .line 272
    :goto_a
    const/4 v0, 0x0

    .line 273
    goto :goto_b

    .line 274
    :cond_e
    move-object/from16 v20, v3

    .line 275
    .line 276
    const/4 v4, 0x0

    .line 277
    goto :goto_a

    .line 278
    :cond_f
    :goto_b
    if-nez v49, :cond_10

    .line 279
    .line 280
    move-object/from16 v3, v20

    .line 281
    .line 282
    goto :goto_c

    .line 283
    :cond_10
    move-object/from16 v3, v49

    .line 284
    .line 285
    :goto_c
    new-instance v13, Luh0;

    .line 286
    .line 287
    const/16 v4, 0x16

    .line 288
    .line 289
    invoke-direct {v13, v4}, Luh0;-><init>(I)V

    .line 290
    .line 291
    .line 292
    invoke-static {v3, v13}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    new-instance v4, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    move-object/from16 v20, v0

    .line 310
    .line 311
    const/4 v0, 0x1

    .line 312
    if-eqz v13, :cond_13

    .line 313
    .line 314
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v13

    .line 318
    check-cast v13, Lg8;

    .line 319
    .line 320
    invoke-virtual {v13}, Lg8;->γ()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v13

    .line 324
    if-eqz v13, :cond_11

    .line 325
    .line 326
    invoke-static {v13, v12, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_11

    .line 331
    .line 332
    goto :goto_e

    .line 333
    :cond_11
    const/4 v13, 0x0

    .line 334
    :goto_e
    if-eqz v13, :cond_12

    .line 335
    .line 336
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    :cond_12
    move-object/from16 v0, v20

    .line 340
    .line 341
    goto :goto_d

    .line 342
    :cond_13
    invoke-static {v4}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    invoke-static {v3}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    if-nez v4, :cond_17

    .line 355
    .line 356
    invoke-static {}, Lux;->π()Z

    .line 357
    .line 358
    .line 359
    move-result v4

    .line 360
    if-eqz v4, :cond_16

    .line 361
    .line 362
    if-eqz v49, :cond_14

    .line 363
    .line 364
    invoke-interface/range {v49 .. v49}, Ljava/util/List;->size()I

    .line 365
    .line 366
    .line 367
    move-result v13

    .line 368
    goto :goto_f

    .line 369
    :cond_14
    const/4 v13, 0x0

    .line 370
    :goto_f
    if-eqz v20, :cond_15

    .line 371
    .line 372
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    .line 373
    .line 374
    .line 375
    move-result v4

    .line 376
    goto :goto_10

    .line 377
    :cond_15
    const/4 v4, 0x0

    .line 378
    :goto_10
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    const-string v0, ", pageItems="

    .line 383
    .line 384
    move-object/from16 v22, v3

    .line 385
    .line 386
    const-string v3, ", fallbackImages="

    .line 387
    .line 388
    move-object/from16 v23, v15

    .line 389
    .line 390
    const-string v15, "[downoload dev][OP-DIALOG] structured images awemeId="

    .line 391
    .line 392
    invoke-static {v13, v15, v14, v0, v3}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    const-string v3, ", selectedImages="

    .line 400
    .line 401
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-static {v11, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    const/4 v13, 0x1

    .line 415
    goto :goto_13

    .line 416
    :cond_16
    move-object/from16 v22, v3

    .line 417
    .line 418
    move-object/from16 v23, v15

    .line 419
    .line 420
    move v13, v0

    .line 421
    goto :goto_13

    .line 422
    :cond_17
    move-object/from16 v23, v15

    .line 423
    .line 424
    if-eqz v20, :cond_1b

    .line 425
    .line 426
    new-instance v0, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 429
    .line 430
    .line 431
    invoke-interface/range {v20 .. v20}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    :cond_18
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    if-eqz v4, :cond_19

    .line 440
    .line 441
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    move-object v11, v4

    .line 446
    check-cast v11, Ljava/lang/String;

    .line 447
    .line 448
    const/4 v13, 0x1

    .line 449
    invoke-static {v11, v12, v13}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 450
    .line 451
    .line 452
    move-result v11

    .line 453
    if-eqz v11, :cond_18

    .line 454
    .line 455
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    goto :goto_11

    .line 459
    :cond_19
    const/4 v13, 0x1

    .line 460
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    if-eqz v3, :cond_1a

    .line 473
    .line 474
    :goto_12
    const/16 v22, 0x0

    .line 475
    .line 476
    goto :goto_13

    .line 477
    :cond_1a
    move-object/from16 v22, v0

    .line 478
    .line 479
    goto :goto_13

    .line 480
    :cond_1b
    const/4 v13, 0x1

    .line 481
    goto :goto_12

    .line 482
    :goto_13
    new-instance v0, Lf8;

    .line 483
    .line 484
    const-string v3, "\u672a\u77e5"

    .line 485
    .line 486
    invoke-static {v10, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    if-nez v3, :cond_1c

    .line 491
    .line 492
    goto :goto_14

    .line 493
    :cond_1c
    iget-object v10, v7, Lf8;->α:Ljava/lang/String;

    .line 494
    .line 495
    :goto_14
    const-string v3, "\u65e0\u63cf\u8ff0"

    .line 496
    .line 497
    invoke-static {v9, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v3

    .line 501
    if-nez v3, :cond_1d

    .line 502
    .line 503
    goto :goto_15

    .line 504
    :cond_1d
    iget-object v9, v7, Lf8;->β:Ljava/lang/String;

    .line 505
    .line 506
    :goto_15
    iget-object v3, v2, Lf8;->γ:Ljava/util/List;

    .line 507
    .line 508
    iget-object v4, v7, Lf8;->γ:Ljava/util/List;

    .line 509
    .line 510
    invoke-static {v3, v4}, Lq71;->Β(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    iget-object v4, v2, Lf8;->ε:Ljava/lang/String;

    .line 515
    .line 516
    if-nez v4, :cond_1e

    .line 517
    .line 518
    iget-object v4, v7, Lf8;->ε:Ljava/lang/String;

    .line 519
    .line 520
    :cond_1e
    move-object v11, v4

    .line 521
    sget-object v4, Lh8;->η:Lh8;

    .line 522
    .line 523
    if-eq v1, v4, :cond_22

    .line 524
    .line 525
    invoke-virtual {v2}, Lf8;->λ()Z

    .line 526
    .line 527
    .line 528
    move-result v12

    .line 529
    if-eqz v12, :cond_1f

    .line 530
    .line 531
    goto :goto_16

    .line 532
    :cond_1f
    if-eq v8, v4, :cond_22

    .line 533
    .line 534
    invoke-virtual {v7}, Lf8;->λ()Z

    .line 535
    .line 536
    .line 537
    move-result v12

    .line 538
    if-eqz v12, :cond_20

    .line 539
    .line 540
    goto :goto_16

    .line 541
    :cond_20
    if-eq v1, v6, :cond_21

    .line 542
    .line 543
    move-object v12, v1

    .line 544
    goto :goto_17

    .line 545
    :cond_21
    move-object v12, v8

    .line 546
    goto :goto_17

    .line 547
    :cond_22
    :goto_16
    move-object v12, v4

    .line 548
    :goto_17
    iget-object v1, v2, Lf8;->η:Ljava/lang/String;

    .line 549
    .line 550
    if-nez v1, :cond_23

    .line 551
    .line 552
    iget-object v1, v7, Lf8;->η:Ljava/lang/String;

    .line 553
    .line 554
    :cond_23
    iget-object v4, v7, Lf8;->ι:Ljava/lang/String;

    .line 555
    .line 556
    filled-new-array {v5, v4}, [Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    const/4 v5, 0x0

    .line 561
    :goto_18
    const/4 v6, 0x2

    .line 562
    if-ge v5, v6, :cond_28

    .line 563
    .line 564
    aget-object v6, v4, v5

    .line 565
    .line 566
    if-eqz v6, :cond_24

    .line 567
    .line 568
    invoke-static {v6}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 569
    .line 570
    .line 571
    move-result-object v8

    .line 572
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    goto :goto_19

    .line 577
    :cond_24
    const/4 v8, 0x0

    .line 578
    :goto_19
    if-nez v8, :cond_25

    .line 579
    .line 580
    const-string v8, ""

    .line 581
    .line 582
    :cond_25
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 583
    .line 584
    .line 585
    move-result v15

    .line 586
    const/4 v13, 0x5

    .line 587
    if-lt v15, v13, :cond_27

    .line 588
    .line 589
    const/4 v13, 0x0

    .line 590
    :goto_1a
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 591
    .line 592
    .line 593
    move-result v15

    .line 594
    if-ge v13, v15, :cond_29

    .line 595
    .line 596
    invoke-virtual {v8, v13}, Ljava/lang/String;->charAt(I)C

    .line 597
    .line 598
    .line 599
    move-result v15

    .line 600
    invoke-static {v15}, Ljava/lang/Character;->isDigit(C)Z

    .line 601
    .line 602
    .line 603
    move-result v15

    .line 604
    if-nez v15, :cond_26

    .line 605
    .line 606
    goto :goto_1b

    .line 607
    :cond_26
    add-int/lit8 v13, v13, 0x1

    .line 608
    .line 609
    goto :goto_1a

    .line 610
    :cond_27
    :goto_1b
    add-int/lit8 v5, v5, 0x1

    .line 611
    .line 612
    const/4 v13, 0x1

    .line 613
    goto :goto_18

    .line 614
    :cond_28
    const/4 v6, 0x0

    .line 615
    :cond_29
    if-eqz v6, :cond_2a

    .line 616
    .line 617
    invoke-static {v6}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v4

    .line 625
    move-object v15, v4

    .line 626
    goto :goto_1c

    .line 627
    :cond_2a
    const/4 v15, 0x0

    .line 628
    :goto_1c
    iget-object v4, v2, Lf8;->κ:Ljava/lang/String;

    .line 629
    .line 630
    if-nez v4, :cond_2b

    .line 631
    .line 632
    iget-object v4, v7, Lf8;->κ:Ljava/lang/String;

    .line 633
    .line 634
    :cond_2b
    iget-object v5, v2, Lf8;->λ:Ljava/lang/String;

    .line 635
    .line 636
    if-nez v5, :cond_2c

    .line 637
    .line 638
    iget-object v5, v7, Lf8;->λ:Ljava/lang/String;

    .line 639
    .line 640
    :cond_2c
    iget v6, v2, Lf8;->μ:I

    .line 641
    .line 642
    if-lez v6, :cond_2d

    .line 643
    .line 644
    goto :goto_1d

    .line 645
    :cond_2d
    iget v6, v7, Lf8;->μ:I

    .line 646
    .line 647
    :goto_1d
    iget v8, v2, Lf8;->ν:I

    .line 648
    .line 649
    if-lez v8, :cond_2e

    .line 650
    .line 651
    goto :goto_1e

    .line 652
    :cond_2e
    iget v8, v7, Lf8;->ν:I

    .line 653
    .line 654
    :goto_1e
    iget v13, v2, Lf8;->ξ:I

    .line 655
    .line 656
    if-lez v13, :cond_2f

    .line 657
    .line 658
    :goto_1f
    move/from16 v20, v13

    .line 659
    .line 660
    goto :goto_20

    .line 661
    :cond_2f
    iget v13, v7, Lf8;->ξ:I

    .line 662
    .line 663
    goto :goto_1f

    .line 664
    :goto_20
    iget v13, v2, Lf8;->ο:I

    .line 665
    .line 666
    if-lez v13, :cond_30

    .line 667
    .line 668
    goto :goto_21

    .line 669
    :cond_30
    iget v13, v7, Lf8;->ο:I

    .line 670
    .line 671
    :goto_21
    move-object/from16 v24, v0

    .line 672
    .line 673
    if-nez v19, :cond_31

    .line 674
    .line 675
    iget-object v0, v7, Lf8;->π:Ljava/lang/String;

    .line 676
    .line 677
    move-object/from16 v19, v10

    .line 678
    .line 679
    move-object/from16 v10, v22

    .line 680
    .line 681
    move-object/from16 v22, v0

    .line 682
    .line 683
    goto :goto_22

    .line 684
    :cond_31
    move-object/from16 v59, v19

    .line 685
    .line 686
    move-object/from16 v19, v10

    .line 687
    .line 688
    move-object/from16 v10, v22

    .line 689
    .line 690
    move-object/from16 v22, v59

    .line 691
    .line 692
    :goto_22
    iget-boolean v0, v2, Lf8;->ρ:Z

    .line 693
    .line 694
    if-nez v0, :cond_33

    .line 695
    .line 696
    iget-boolean v0, v7, Lf8;->ρ:Z

    .line 697
    .line 698
    if-eqz v0, :cond_32

    .line 699
    .line 700
    goto :goto_24

    .line 701
    :cond_32
    move-object/from16 v26, v23

    .line 702
    .line 703
    const/16 v23, 0x0

    .line 704
    .line 705
    :goto_23
    move-object/from16 v25, v1

    .line 706
    .line 707
    goto :goto_25

    .line 708
    :cond_33
    :goto_24
    move-object/from16 v26, v23

    .line 709
    .line 710
    const/16 v23, 0x1

    .line 711
    .line 712
    goto :goto_23

    .line 713
    :goto_25
    iget-wide v0, v2, Lf8;->σ:J

    .line 714
    .line 715
    const-wide/16 v27, 0x0

    .line 716
    .line 717
    cmp-long v29, v0, v27

    .line 718
    .line 719
    if-lez v29, :cond_34

    .line 720
    .line 721
    :goto_26
    move-wide/from16 v29, v0

    .line 722
    .line 723
    goto :goto_27

    .line 724
    :cond_34
    iget-wide v0, v7, Lf8;->σ:J

    .line 725
    .line 726
    goto :goto_26

    .line 727
    :goto_27
    iget-object v0, v2, Lf8;->τ:Ljava/lang/String;

    .line 728
    .line 729
    if-nez v0, :cond_35

    .line 730
    .line 731
    iget-object v0, v7, Lf8;->τ:Ljava/lang/String;

    .line 732
    .line 733
    :cond_35
    iget-object v1, v2, Lf8;->υ:Ljava/lang/String;

    .line 734
    .line 735
    if-nez v1, :cond_36

    .line 736
    .line 737
    iget-object v1, v7, Lf8;->υ:Ljava/lang/String;

    .line 738
    .line 739
    :cond_36
    move-object/from16 v31, v0

    .line 740
    .line 741
    iget-object v0, v2, Lf8;->φ:Ljava/lang/String;

    .line 742
    .line 743
    if-nez v0, :cond_37

    .line 744
    .line 745
    iget-object v0, v7, Lf8;->φ:Ljava/lang/String;

    .line 746
    .line 747
    :cond_37
    move-object/from16 v32, v0

    .line 748
    .line 749
    iget-boolean v0, v2, Lf8;->χ:Z

    .line 750
    .line 751
    if-nez v0, :cond_39

    .line 752
    .line 753
    iget-boolean v0, v7, Lf8;->χ:Z

    .line 754
    .line 755
    if-eqz v0, :cond_38

    .line 756
    .line 757
    goto :goto_28

    .line 758
    :cond_38
    const/16 v16, 0x0

    .line 759
    .line 760
    goto :goto_29

    .line 761
    :cond_39
    :goto_28
    const/16 v16, 0x1

    .line 762
    .line 763
    :goto_29
    iget-object v0, v2, Lf8;->ψ:Ljava/lang/String;

    .line 764
    .line 765
    if-nez v0, :cond_3a

    .line 766
    .line 767
    iget-object v0, v7, Lf8;->ψ:Ljava/lang/String;

    .line 768
    .line 769
    :cond_3a
    move-object/from16 v21, v0

    .line 770
    .line 771
    iget-object v0, v2, Lf8;->ω:Ljava/lang/String;

    .line 772
    .line 773
    if-nez v0, :cond_3b

    .line 774
    .line 775
    iget-object v0, v7, Lf8;->ω:Ljava/lang/String;

    .line 776
    .line 777
    :cond_3b
    move-object/from16 v33, v0

    .line 778
    .line 779
    iget-object v0, v2, Lf8;->Α:Ljava/util/List;

    .line 780
    .line 781
    move-object/from16 v34, v1

    .line 782
    .line 783
    iget-object v1, v7, Lf8;->Α:Ljava/util/List;

    .line 784
    .line 785
    invoke-static {v0, v1}, Lq71;->Β(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    iget-object v1, v2, Lf8;->Β:Ljava/lang/String;

    .line 790
    .line 791
    if-nez v1, :cond_3c

    .line 792
    .line 793
    iget-object v1, v7, Lf8;->Β:Ljava/lang/String;

    .line 794
    .line 795
    :cond_3c
    move-object/from16 v35, v0

    .line 796
    .line 797
    iget-object v0, v2, Lf8;->Γ:Ljava/lang/String;

    .line 798
    .line 799
    if-nez v0, :cond_3d

    .line 800
    .line 801
    iget-object v0, v7, Lf8;->Γ:Ljava/lang/String;

    .line 802
    .line 803
    :cond_3d
    move-object/from16 v36, v0

    .line 804
    .line 805
    iget-object v0, v2, Lf8;->Δ:Ljava/lang/String;

    .line 806
    .line 807
    if-nez v0, :cond_3e

    .line 808
    .line 809
    iget-object v0, v7, Lf8;->Δ:Ljava/lang/String;

    .line 810
    .line 811
    :cond_3e
    move-object/from16 v37, v0

    .line 812
    .line 813
    iget-object v0, v2, Lf8;->Ε:Ljava/lang/String;

    .line 814
    .line 815
    if-nez v0, :cond_3f

    .line 816
    .line 817
    iget-object v0, v7, Lf8;->Ε:Ljava/lang/String;

    .line 818
    .line 819
    :cond_3f
    move-object/from16 v39, v0

    .line 820
    .line 821
    move-object/from16 v38, v1

    .line 822
    .line 823
    iget-wide v0, v2, Lf8;->Ζ:J

    .line 824
    .line 825
    cmp-long v40, v0, v27

    .line 826
    .line 827
    if-lez v40, :cond_40

    .line 828
    .line 829
    :goto_2a
    move-wide/from16 v40, v0

    .line 830
    .line 831
    goto :goto_2b

    .line 832
    :cond_40
    iget-wide v0, v7, Lf8;->Ζ:J

    .line 833
    .line 834
    goto :goto_2a

    .line 835
    :goto_2b
    iget-object v0, v2, Lf8;->Η:Ljava/util/List;

    .line 836
    .line 837
    iget-object v1, v7, Lf8;->Η:Ljava/util/List;

    .line 838
    .line 839
    invoke-static {v0, v1}, Lq71;->Β(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    iget-object v1, v2, Lf8;->Θ:Ljava/lang/Integer;

    .line 844
    .line 845
    if-nez v1, :cond_41

    .line 846
    .line 847
    iget-object v1, v7, Lf8;->Θ:Ljava/lang/Integer;

    .line 848
    .line 849
    :cond_41
    move-object/from16 v42, v0

    .line 850
    .line 851
    iget-object v0, v2, Lf8;->Ι:Ljava/lang/String;

    .line 852
    .line 853
    if-nez v0, :cond_42

    .line 854
    .line 855
    iget-object v0, v7, Lf8;->Ι:Ljava/lang/String;

    .line 856
    .line 857
    :cond_42
    move-object/from16 v43, v0

    .line 858
    .line 859
    iget-object v0, v2, Lf8;->Κ:Ljava/lang/String;

    .line 860
    .line 861
    if-nez v0, :cond_43

    .line 862
    .line 863
    iget-object v0, v7, Lf8;->Κ:Ljava/lang/String;

    .line 864
    .line 865
    :cond_43
    move-object/from16 v44, v0

    .line 866
    .line 867
    iget-object v0, v2, Lf8;->Λ:Ljava/lang/String;

    .line 868
    .line 869
    if-nez v0, :cond_44

    .line 870
    .line 871
    iget-object v0, v7, Lf8;->Λ:Ljava/lang/String;

    .line 872
    .line 873
    :cond_44
    move-object/from16 v45, v0

    .line 874
    .line 875
    iget-object v0, v2, Lf8;->Μ:Ljava/lang/String;

    .line 876
    .line 877
    if-nez v0, :cond_45

    .line 878
    .line 879
    iget-object v0, v7, Lf8;->Μ:Ljava/lang/String;

    .line 880
    .line 881
    :cond_45
    move-object/from16 v46, v0

    .line 882
    .line 883
    iget-object v0, v2, Lf8;->Ν:Ljava/util/List;

    .line 884
    .line 885
    move-object/from16 v47, v1

    .line 886
    .line 887
    iget-object v1, v7, Lf8;->Ν:Ljava/util/List;

    .line 888
    .line 889
    invoke-static {v0, v1}, Lq71;->Β(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    iget-object v1, v2, Lf8;->Ξ:Ljava/util/List;

    .line 894
    .line 895
    move-object/from16 v48, v0

    .line 896
    .line 897
    iget-object v0, v7, Lf8;->Ξ:Ljava/util/List;

    .line 898
    .line 899
    invoke-static {v1, v0}, Lq71;->Β(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    if-eqz v18, :cond_47

    .line 904
    .line 905
    invoke-interface/range {v18 .. v18}, Ljava/util/Collection;->isEmpty()Z

    .line 906
    .line 907
    .line 908
    move-result v1

    .line 909
    if-eqz v1, :cond_46

    .line 910
    .line 911
    goto :goto_2d

    .line 912
    :cond_46
    move-object/from16 v26, v31

    .line 913
    .line 914
    move-object/from16 v31, v33

    .line 915
    .line 916
    move-object/from16 v33, v38

    .line 917
    .line 918
    move-object/from16 v59, v47

    .line 919
    .line 920
    move-object/from16 v47, v18

    .line 921
    .line 922
    move-wide/from16 v17, v27

    .line 923
    .line 924
    move-object/from16 v28, v32

    .line 925
    .line 926
    move-object/from16 v32, v35

    .line 927
    .line 928
    move-object/from16 v35, v37

    .line 929
    .line 930
    :goto_2c
    move-wide/from16 v37, v40

    .line 931
    .line 932
    move-object/from16 v40, v59

    .line 933
    .line 934
    goto :goto_2f

    .line 935
    :cond_47
    :goto_2d
    if-eqz v26, :cond_49

    .line 936
    .line 937
    invoke-interface/range {v26 .. v26}, Ljava/util/Collection;->isEmpty()Z

    .line 938
    .line 939
    .line 940
    move-result v1

    .line 941
    if-eqz v1, :cond_48

    .line 942
    .line 943
    goto :goto_2e

    .line 944
    :cond_48
    move-wide/from16 v17, v27

    .line 945
    .line 946
    move-object/from16 v28, v32

    .line 947
    .line 948
    move-object/from16 v32, v35

    .line 949
    .line 950
    move-object/from16 v35, v37

    .line 951
    .line 952
    move-object/from16 v59, v47

    .line 953
    .line 954
    move-object/from16 v47, v26

    .line 955
    .line 956
    move-object/from16 v26, v31

    .line 957
    .line 958
    move-object/from16 v31, v33

    .line 959
    .line 960
    move-object/from16 v33, v38

    .line 961
    .line 962
    goto :goto_2c

    .line 963
    :cond_49
    :goto_2e
    move-wide/from16 v17, v27

    .line 964
    .line 965
    move-object/from16 v26, v31

    .line 966
    .line 967
    move-object/from16 v28, v32

    .line 968
    .line 969
    move-object/from16 v31, v33

    .line 970
    .line 971
    move-object/from16 v32, v35

    .line 972
    .line 973
    move-object/from16 v35, v37

    .line 974
    .line 975
    move-object/from16 v33, v38

    .line 976
    .line 977
    move-wide/from16 v37, v40

    .line 978
    .line 979
    move-object/from16 v40, v47

    .line 980
    .line 981
    const/16 v47, 0x0

    .line 982
    .line 983
    :goto_2f
    iget-object v1, v2, Lf8;->Π:Li8;

    .line 984
    .line 985
    if-nez v1, :cond_4a

    .line 986
    .line 987
    iget-object v1, v7, Lf8;->Π:Li8;

    .line 988
    .line 989
    :cond_4a
    move-object/from16 v27, v0

    .line 990
    .line 991
    move-object/from16 v41, v1

    .line 992
    .line 993
    iget-wide v0, v2, Lf8;->Σ:J

    .line 994
    .line 995
    cmp-long v50, v0, v17

    .line 996
    .line 997
    if-lez v50, :cond_4b

    .line 998
    .line 999
    :goto_30
    move-wide/from16 v50, v0

    .line 1000
    .line 1001
    goto :goto_31

    .line 1002
    :cond_4b
    iget-wide v0, v7, Lf8;->Σ:J

    .line 1003
    .line 1004
    goto :goto_30

    .line 1005
    :goto_31
    iget-wide v0, v2, Lf8;->Τ:J

    .line 1006
    .line 1007
    cmp-long v52, v0, v17

    .line 1008
    .line 1009
    if-lez v52, :cond_4c

    .line 1010
    .line 1011
    :goto_32
    move-wide/from16 v52, v0

    .line 1012
    .line 1013
    goto :goto_33

    .line 1014
    :cond_4c
    iget-wide v0, v7, Lf8;->Τ:J

    .line 1015
    .line 1016
    goto :goto_32

    .line 1017
    :goto_33
    iget-wide v0, v2, Lf8;->Υ:J

    .line 1018
    .line 1019
    cmp-long v2, v0, v17

    .line 1020
    .line 1021
    if-lez v2, :cond_4d

    .line 1022
    .line 1023
    :goto_34
    move-wide/from16 v54, v0

    .line 1024
    .line 1025
    goto :goto_35

    .line 1026
    :cond_4d
    iget-wide v0, v7, Lf8;->Υ:J

    .line 1027
    .line 1028
    goto :goto_34

    .line 1029
    :goto_35
    const/16 v57, 0x0

    .line 1030
    .line 1031
    const/16 v58, 0x1000

    .line 1032
    .line 1033
    const/16 v56, 0x0

    .line 1034
    .line 1035
    move-object/from16 v7, v46

    .line 1036
    .line 1037
    move-object/from16 v46, v27

    .line 1038
    .line 1039
    move-object/from16 v27, v34

    .line 1040
    .line 1041
    move-object/from16 v34, v36

    .line 1042
    .line 1043
    move-object/from16 v36, v39

    .line 1044
    .line 1045
    move-object/from16 v39, v42

    .line 1046
    .line 1047
    move-object/from16 v42, v44

    .line 1048
    .line 1049
    move-object/from16 v44, v7

    .line 1050
    .line 1051
    move-object/from16 v7, v48

    .line 1052
    .line 1053
    move-object/from16 v48, v41

    .line 1054
    .line 1055
    move-object/from16 v41, v43

    .line 1056
    .line 1057
    move-object/from16 v43, v45

    .line 1058
    .line 1059
    move-object/from16 v45, v7

    .line 1060
    .line 1061
    move-object/from16 v17, v5

    .line 1062
    .line 1063
    move/from16 v18, v6

    .line 1064
    .line 1065
    move-object/from16 v7, v19

    .line 1066
    .line 1067
    move-object/from16 v6, v24

    .line 1068
    .line 1069
    move/from16 v19, v8

    .line 1070
    .line 1071
    move-object v8, v9

    .line 1072
    move-object v9, v3

    .line 1073
    move/from16 v59, v16

    .line 1074
    .line 1075
    move-object/from16 v16, v4

    .line 1076
    .line 1077
    move-object/from16 v60, v21

    .line 1078
    .line 1079
    move/from16 v21, v13

    .line 1080
    .line 1081
    move-object/from16 v13, v25

    .line 1082
    .line 1083
    move-wide/from16 v24, v29

    .line 1084
    .line 1085
    move/from16 v29, v59

    .line 1086
    .line 1087
    move-object/from16 v30, v60

    .line 1088
    .line 1089
    invoke-direct/range {v6 .. v58}, Lf8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lh8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Li8;Ljava/util/List;JJJLjava/lang/String;II)V

    .line 1090
    .line 1091
    .line 1092
    return-object v6

    .line 1093
    :cond_4e
    move-object/from16 v19, v3

    .line 1094
    .line 1095
    if-eqz v19, :cond_4f

    .line 1096
    .line 1097
    invoke-static/range {v19 .. v19}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v3

    .line 1101
    if-eqz v3, :cond_54

    .line 1102
    .line 1103
    :cond_4f
    if-eqz v5, :cond_54

    .line 1104
    .line 1105
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v3

    .line 1109
    if-eqz v3, :cond_50

    .line 1110
    .line 1111
    goto :goto_38

    .line 1112
    :cond_50
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1113
    .line 1114
    .line 1115
    move-result v3

    .line 1116
    if-eqz v3, :cond_51

    .line 1117
    .line 1118
    const/4 v8, 0x0

    .line 1119
    goto :goto_36

    .line 1120
    :cond_51
    sget-object v3, Lf31;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1121
    .line 1122
    invoke-virtual {v3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v3

    .line 1126
    check-cast v3, Ljava/lang/String;

    .line 1127
    .line 1128
    move-object v8, v3

    .line 1129
    :goto_36
    if-eqz v8, :cond_54

    .line 1130
    .line 1131
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1132
    .line 1133
    .line 1134
    move-result v3

    .line 1135
    if-eqz v3, :cond_52

    .line 1136
    .line 1137
    goto :goto_38

    .line 1138
    :cond_52
    if-eqz v0, :cond_53

    .line 1139
    .line 1140
    iget-object v0, v0, Lkq;->δ:Lmq;

    .line 1141
    .line 1142
    iget-object v0, v0, Lmq;->ε:Ljava/lang/String;

    .line 1143
    .line 1144
    goto :goto_37

    .line 1145
    :cond_53
    const/4 v0, 0x0

    .line 1146
    :goto_37
    const-string v1, ", ipCached=true"

    .line 1147
    .line 1148
    invoke-static {v10, v0, v9, v14, v1}, Llz1;->ξ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v0

    .line 1152
    const/4 v1, 0x0

    .line 1153
    const/4 v9, 0x4

    .line 1154
    invoke-static {v11, v0, v1, v9, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1155
    .line 1156
    .line 1157
    const v15, -0x8001

    .line 1158
    .line 1159
    .line 1160
    const/16 v16, 0x1fff

    .line 1161
    .line 1162
    const/4 v3, 0x0

    .line 1163
    const/4 v4, 0x0

    .line 1164
    const/4 v5, 0x0

    .line 1165
    const/4 v6, 0x0

    .line 1166
    const/4 v7, 0x0

    .line 1167
    const/4 v9, 0x0

    .line 1168
    const/4 v10, 0x0

    .line 1169
    const/4 v11, 0x0

    .line 1170
    const/4 v12, 0x0

    .line 1171
    const/4 v13, 0x0

    .line 1172
    const/4 v14, 0x0

    .line 1173
    invoke-static/range {v2 .. v16}, Lf8;->γ(Lf8;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;II)Lf8;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    return-object v0

    .line 1178
    :cond_54
    :goto_38
    if-eqz v0, :cond_55

    .line 1179
    .line 1180
    iget-object v0, v0, Lkq;->δ:Lmq;

    .line 1181
    .line 1182
    iget-object v0, v0, Lmq;->ε:Ljava/lang/String;

    .line 1183
    .line 1184
    goto :goto_39

    .line 1185
    :cond_55
    const/4 v0, 0x0

    .line 1186
    :goto_39
    const-string v3, ", type="

    .line 1187
    .line 1188
    invoke-static {v10, v0, v9, v14, v3}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v0

    .line 1192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v0

    .line 1199
    const/4 v1, 0x0

    .line 1200
    const/4 v9, 0x4

    .line 1201
    invoke-static {v11, v0, v1, v9, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1202
    .line 1203
    .line 1204
    :cond_56
    return-object v2
.end method

.method public static Ζ(Lf8;Landroid/app/Activity;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lf8;->ψ:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lf8;->ω:Ljava/lang/String;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lsv0;

    .line 14
    .line 15
    const/16 v2, 0x1b

    .line 16
    .line 17
    invoke-direct {v1, v2}, Lsv0;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lf8;->ξ()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-ge v1, v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Lf8;->ξ()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-nez p0, :cond_1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    return-object p0

    .line 62
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    const/4 v1, 0x4

    .line 70
    const/4 v2, 0x0

    .line 71
    if-eq p0, v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    const/4 v1, 0x6

    .line 78
    if-eq p0, v1, :cond_4

    .line 79
    .line 80
    move-object p0, v2

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    sget-object p0, Lan1;->α:Lan1;

    .line 83
    .line 84
    invoke-static {v0}, Lan1;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    :goto_1
    if-eqz p0, :cond_5

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_5
    sget-object p0, Lu90;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 92
    .line 93
    invoke-static {v0}, Lu90;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Lp90;

    .line 102
    .line 103
    if-eqz v1, :cond_6

    .line 104
    .line 105
    iget-object v2, v1, Lp90;->α:Ljava/lang/String;

    .line 106
    .line 107
    :cond_6
    if-eqz v2, :cond_7

    .line 108
    .line 109
    return-object v2

    .line 110
    :cond_7
    invoke-static {p1}, Lu90;->ε(Landroid/content/Context;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_8

    .line 115
    .line 116
    invoke-static {v0}, Lu90;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_8

    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance p1, Lkt0;

    .line 134
    .line 135
    const/16 v1, 0x9

    .line 136
    .line 137
    invoke-direct {p1, v1}, Lkt0;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-static {p0, v0, p1}, Lu90;->θ(Landroid/content/Context;Ljava/lang/String;Lp70;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    :goto_2
    return-object v0
.end method

.method public static Η(Lq71;Landroid/view/View;Lp70;)V
    .locals 2

    .line 1
    new-instance p0, Ltm1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ll9;

    .line 14
    .line 15
    const/16 v1, 0xb

    .line 16
    .line 17
    invoke-direct {v0, p0, v1, p2}, Ll9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static Θ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ln71;
    .locals 10

    .line 1
    const v0, 0x7f0800a4

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const-string v2, "#00B578"

    .line 13
    .line 14
    const-string v3, "#FF8A34"

    .line 15
    .line 16
    sparse-switch v1, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :sswitch_0
    const-string v1, "\u6d88\u606f\u5de5\u5177"

    .line 22
    .line 23
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_0
    const v0, 0x7f08009f

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Ll91;

    .line 39
    .line 40
    const-string v2, "#7C5CFC"

    .line 41
    .line 42
    invoke-direct {v1, v0, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :sswitch_1
    const-string v1, "\u6a21\u5757\u5de5\u5177"

    .line 48
    .line 49
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance v1, Ll91;

    .line 57
    .line 58
    invoke-direct {v1, v0, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :sswitch_2
    const-string v1, "\u8bbe\u7f6e"

    .line 63
    .line 64
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const v0, 0x7f0800a3

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    new-instance v1, Ll91;

    .line 79
    .line 80
    invoke-direct {v1, v0, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :sswitch_3
    const-string v1, "\u6536\u85cf\u4e0e\u4e66\u7b7e"

    .line 85
    .line 86
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_3

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    const v0, 0x7f080093

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v1, Ll91;

    .line 101
    .line 102
    const-string v2, "#14B8A6"

    .line 103
    .line 104
    invoke-direct {v1, v0, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :sswitch_4
    const-string v1, "\u5185\u5bb9\u4e0e\u4e0b\u8f7d"

    .line 109
    .line 110
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    const v0, 0x7f080099

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    new-instance v1, Ll91;

    .line 124
    .line 125
    invoke-direct {v1, v0, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :sswitch_5
    const-string v1, "\u4f5c\u8005\u4e0e\u5206\u4eab"

    .line 130
    .line 131
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_5

    .line 136
    .line 137
    :cond_4
    :goto_0
    new-instance v1, Ll91;

    .line 138
    .line 139
    const-string v2, "#6B7280"

    .line 140
    .line 141
    invoke-direct {v1, v0, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    const v0, 0x7f0800a1

    .line 146
    .line 147
    .line 148
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    new-instance v1, Ll91;

    .line 153
    .line 154
    invoke-direct {v1, v0, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :goto_1
    iget-object v0, v1, Ll91;->ε:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Ljava/lang/Number;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    iget-object v0, v1, Ll91;->ζ:Ljava/lang/Object;

    .line 166
    .line 167
    move-object v8, v0

    .line 168
    check-cast v8, Ljava/lang/String;

    .line 169
    .line 170
    new-instance v2, Ln71;

    .line 171
    .line 172
    invoke-static {p0}, Lw71;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    move-object v4, p0

    .line 177
    move-object v5, p1

    .line 178
    move-object v6, p2

    .line 179
    move v9, p3

    .line 180
    invoke-direct/range {v2 .. v9}, Ln71;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V

    .line 181
    .line 182
    .line 183
    return-object v2

    .line 184
    nop

    .line 185
    :sswitch_data_0
    .sparse-switch
        -0x664db8d6 -> :sswitch_5
        -0x585d15f4 -> :sswitch_4
        -0x2fbeb593 -> :sswitch_3
        0x116b70 -> :sswitch_2
        0x3191e408 -> :sswitch_1
        0x333ff659 -> :sswitch_0
    .end sparse-switch
.end method

.method public static Ι(Landroid/app/Activity;Lnt;)V
    .locals 34

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-class v0, Landroid/widget/Button;

    .line 7
    .line 8
    const-class v1, Landroid/view/View;

    .line 9
    .line 10
    const-class v2, Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-nez v4, :cond_8

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/app/Activity;->isDestroyed()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_8

    .line 23
    .line 24
    sget-object v4, Lu90;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    const/4 v15, 0x0

    .line 27
    const/4 v6, 0x1

    .line 28
    invoke-virtual {v4, v15, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    goto/16 :goto_9

    .line 35
    .line 36
    :cond_0
    :try_start_0
    sget-object v4, Lx01;->α:Lx01;

    .line 37
    .line 38
    const-string v5, "dialog_geo_names_database"

    .line 39
    .line 40
    const v7, 0x7f0c0026

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v7, v3, v5}, Lx01;->γ(ILandroid/content/Context;Ljava/lang/String;)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "top_bar"

    .line 48
    .line 49
    const v7, 0x7f0902f1

    .line 50
    .line 51
    .line 52
    invoke-static {v4, v5, v7, v1}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const-string v7, "tv_title"

    .line 57
    .line 58
    const v8, 0x7f090376

    .line 59
    .line 60
    .line 61
    invoke-static {v4, v7, v8, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, Landroid/widget/TextView;

    .line 66
    .line 67
    const-string v8, "tv_close"

    .line 68
    .line 69
    const v9, 0x7f090323

    .line 70
    .line 71
    .line 72
    invoke-static {v4, v8, v9, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, Landroid/widget/TextView;

    .line 77
    .line 78
    const-string v9, "tv_badge"

    .line 79
    .line 80
    const v10, 0x7f09031f

    .line 81
    .line 82
    .line 83
    invoke-static {v4, v9, v10, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    move-object v12, v9

    .line 88
    check-cast v12, Landroid/widget/TextView;

    .line 89
    .line 90
    const-string v9, "geo_names_info_card"

    .line 91
    .line 92
    const v10, 0x7f09014e

    .line 93
    .line 94
    .line 95
    invoke-static {v4, v9, v10, v1}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    const-string v10, "tv_geo_names_description"

    .line 100
    .line 101
    const v11, 0x7f090339

    .line 102
    .line 103
    .line 104
    invoke-static {v4, v10, v11, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    check-cast v10, Landroid/widget/TextView;

    .line 109
    .line 110
    const-string v11, "geo_names_stats_card"

    .line 111
    .line 112
    const v13, 0x7f090150

    .line 113
    .line 114
    .line 115
    invoke-static {v4, v11, v13, v1}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const-string v11, "tv_geo_names_download_label"

    .line 120
    .line 121
    const v13, 0x7f09033a

    .line 122
    .line 123
    .line 124
    invoke-static {v4, v11, v13, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    check-cast v11, Landroid/widget/TextView;

    .line 129
    .line 130
    const-string v13, "tv_geo_names_download_size"

    .line 131
    .line 132
    const v14, 0x7f09033b

    .line 133
    .line 134
    .line 135
    invoke-static {v4, v13, v14, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    check-cast v13, Landroid/widget/TextView;

    .line 140
    .line 141
    const-string v14, "tv_geo_names_storage_label"

    .line 142
    .line 143
    const v6, 0x7f090341

    .line 144
    .line 145
    .line 146
    invoke-static {v4, v14, v6, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    check-cast v6, Landroid/widget/TextView;

    .line 151
    .line 152
    const-string v14, "tv_geo_names_storage_size"

    .line 153
    .line 154
    const v15, 0x7f090342

    .line 155
    .line 156
    .line 157
    invoke-static {v4, v14, v15, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    check-cast v14, Landroid/widget/TextView;

    .line 162
    .line 163
    const-string v15, "tv_geo_names_source_label"

    .line 164
    .line 165
    move-object/from16 v16, v12

    .line 166
    .line 167
    const v12, 0x7f09033e

    .line 168
    .line 169
    .line 170
    invoke-static {v4, v15, v12, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    check-cast v12, Landroid/widget/TextView;

    .line 175
    .line 176
    const-string v15, "geo_names_source_selector"

    .line 177
    .line 178
    move-object/from16 v17, v12

    .line 179
    .line 180
    const-class v12, Landroid/widget/LinearLayout;

    .line 181
    .line 182
    move-object/from16 v18, v14

    .line 183
    .line 184
    const v14, 0x7f09014f

    .line 185
    .line 186
    .line 187
    invoke-static {v4, v15, v14, v12}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    check-cast v12, Landroid/widget/LinearLayout;

    .line 192
    .line 193
    const-string v14, "tv_geo_names_source_value"

    .line 194
    .line 195
    const v15, 0x7f09033f

    .line 196
    .line 197
    .line 198
    invoke-static {v4, v14, v15, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 199
    .line 200
    .line 201
    move-result-object v14

    .line 202
    check-cast v14, Landroid/widget/TextView;

    .line 203
    .line 204
    const-string v15, "tv_geo_names_source_arrow"

    .line 205
    .line 206
    move-object/from16 v19, v14

    .line 207
    .line 208
    const v14, 0x7f09033d

    .line 209
    .line 210
    .line 211
    invoke-static {v4, v15, v14, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 212
    .line 213
    .line 214
    move-result-object v14

    .line 215
    check-cast v14, Landroid/widget/TextView;

    .line 216
    .line 217
    const-string v15, "progress_geo_names_download"

    .line 218
    .line 219
    move-object/from16 v20, v14

    .line 220
    .line 221
    const-class v14, Landroid/widget/ProgressBar;

    .line 222
    .line 223
    move-object/from16 v21, v12

    .line 224
    .line 225
    const v12, 0x7f09025e

    .line 226
    .line 227
    .line 228
    invoke-static {v4, v15, v12, v14}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v12

    .line 232
    check-cast v12, Landroid/widget/ProgressBar;

    .line 233
    .line 234
    const-string v14, "tv_geo_names_status"

    .line 235
    .line 236
    const v15, 0x7f090340

    .line 237
    .line 238
    .line 239
    invoke-static {v4, v14, v15, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v14

    .line 243
    check-cast v14, Landroid/widget/TextView;

    .line 244
    .line 245
    const-string v15, "tv_geo_names_footer"

    .line 246
    .line 247
    move-object/from16 v22, v14

    .line 248
    .line 249
    const v14, 0x7f09033c

    .line 250
    .line 251
    .line 252
    invoke-static {v4, v15, v14, v2}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    check-cast v2, Landroid/widget/TextView;

    .line 257
    .line 258
    const-string v14, "btn_geo_names_cancel"

    .line 259
    .line 260
    const v15, 0x7f09005e

    .line 261
    .line 262
    .line 263
    invoke-static {v4, v14, v15, v0}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 264
    .line 265
    .line 266
    move-result-object v14

    .line 267
    check-cast v14, Landroid/widget/Button;

    .line 268
    .line 269
    const-string v15, "btn_geo_names_retry"

    .line 270
    .line 271
    move-object/from16 v23, v14

    .line 272
    .line 273
    const v14, 0x7f090060

    .line 274
    .line 275
    .line 276
    invoke-static {v4, v15, v14, v0}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 277
    .line 278
    .line 279
    move-result-object v14

    .line 280
    check-cast v14, Landroid/widget/Button;

    .line 281
    .line 282
    const-string v15, "btn_geo_names_download"

    .line 283
    .line 284
    move-object/from16 v24, v14

    .line 285
    .line 286
    const v14, 0x7f09005f

    .line 287
    .line 288
    .line 289
    invoke-static {v4, v15, v14, v0}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    move-object v14, v0

    .line 294
    check-cast v14, Landroid/widget/Button;

    .line 295
    .line 296
    invoke-static {v3}, Ljx0;->Η(Landroid/content/Context;)Z

    .line 297
    .line 298
    .line 299
    move-result v15

    .line 300
    invoke-static {v3}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    move/from16 v25, v15

    .line 305
    .line 306
    iget-object v15, v0, Lxx;->λ:Ljava/lang/String;

    .line 307
    .line 308
    move-object/from16 v26, v15

    .line 309
    .line 310
    iget-object v15, v0, Lxx;->γ:Ljava/lang/String;

    .line 311
    .line 312
    move-object/from16 v27, v14

    .line 313
    .line 314
    iget-object v14, v0, Lxx;->Α:Ljava/lang/String;

    .line 315
    .line 316
    move-object/from16 v28, v2

    .line 317
    .line 318
    iget-object v2, v0, Lxx;->ι:Ljava/lang/String;

    .line 319
    .line 320
    move-object/from16 v29, v2

    .line 321
    .line 322
    iget-object v2, v0, Lxx;->χ:Ljava/lang/String;

    .line 323
    .line 324
    move-object/from16 v30, v12

    .line 325
    .line 326
    iget-object v12, v0, Lxx;->ζ:Ljava/lang/String;

    .line 327
    .line 328
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 329
    .line 330
    .line 331
    move-result v12

    .line 332
    move-object/from16 v31, v14

    .line 333
    .line 334
    iget-object v14, v0, Lxx;->η:Ljava/lang/String;

    .line 335
    .line 336
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 337
    .line 338
    .line 339
    move-result v14

    .line 340
    move-object/from16 v32, v6

    .line 341
    .line 342
    iget-object v6, v0, Lxx;->δ:Ljava/lang/String;

    .line 343
    .line 344
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 345
    .line 346
    .line 347
    move-result v6

    .line 348
    move/from16 v33, v6

    .line 349
    .line 350
    iget-object v6, v0, Lxx;->β:Ljava/lang/String;

    .line 351
    .line 352
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 353
    .line 354
    .line 355
    move-result v6

    .line 356
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 357
    .line 358
    .line 359
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 370
    .line 371
    .line 372
    const/16 v5, 0xa

    .line 373
    .line 374
    invoke-static {v5, v3, v15}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    invoke-virtual {v9, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 382
    .line 383
    .line 384
    const/16 v6, 0x8

    .line 385
    .line 386
    invoke-static {v6, v3, v2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 387
    .line 388
    .line 389
    move-result-object v9

    .line 390
    invoke-virtual {v1, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 394
    .line 395
    .line 396
    invoke-static/range {v26 .. v26}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    invoke-virtual {v13, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 401
    .line 402
    .line 403
    move-object/from16 v1, v32

    .line 404
    .line 405
    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 406
    .line 407
    .line 408
    invoke-static/range {v29 .. v29}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    move-object/from16 v9, v18

    .line 413
    .line 414
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 415
    .line 416
    .line 417
    move-object/from16 v1, v17

    .line 418
    .line 419
    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 420
    .line 421
    .line 422
    move-object/from16 v1, v31

    .line 423
    .line 424
    invoke-static {v6, v3, v1, v2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 425
    .line 426
    .line 427
    move-result-object v6

    .line 428
    move-object/from16 v10, v21

    .line 429
    .line 430
    invoke-virtual {v10, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 431
    .line 432
    .line 433
    move-object/from16 v6, v19

    .line 434
    .line 435
    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 436
    .line 437
    .line 438
    move-object/from16 v11, v20

    .line 439
    .line 440
    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 441
    .line 442
    .line 443
    invoke-static/range {v29 .. v29}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    invoke-static {v11}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 448
    .line 449
    .line 450
    move-result-object v11

    .line 451
    move-object/from16 v15, v30

    .line 452
    .line 453
    invoke-virtual {v15, v11}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 454
    .line 455
    .line 456
    invoke-static/range {v33 .. v33}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 457
    .line 458
    .line 459
    move-result-object v11

    .line 460
    invoke-virtual {v15, v11}, Landroid/widget/ProgressBar;->setProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 461
    .line 462
    .line 463
    move-object/from16 v11, v22

    .line 464
    .line 465
    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 466
    .line 467
    .line 468
    iget-object v14, v0, Lxx;->Β:Ljava/lang/String;

    .line 469
    .line 470
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 471
    .line 472
    .line 473
    move-result v14

    .line 474
    move-object/from16 v5, v28

    .line 475
    .line 476
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 477
    .line 478
    .line 479
    move-object/from16 v14, v23

    .line 480
    .line 481
    invoke-virtual {v14, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 482
    .line 483
    .line 484
    move-object/from16 v5, v24

    .line 485
    .line 486
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 487
    .line 488
    .line 489
    const-string v12, "#FFFFFF"

    .line 490
    .line 491
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 492
    .line 493
    .line 494
    move-result v12

    .line 495
    move-object/from16 v21, v10

    .line 496
    .line 497
    move-object/from16 v10, v27

    .line 498
    .line 499
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 500
    .line 501
    .line 502
    move-object/from16 v22, v11

    .line 503
    .line 504
    const/16 v12, 0xa

    .line 505
    .line 506
    invoke-static {v12, v3, v1, v2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 507
    .line 508
    .line 509
    move-result-object v11

    .line 510
    invoke-virtual {v14, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 511
    .line 512
    .line 513
    invoke-static {v12, v3, v1, v2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-virtual {v5, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 518
    .line 519
    .line 520
    move-object/from16 v2, v29

    .line 521
    .line 522
    invoke-static {v12, v3, v1, v2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-virtual {v10, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 527
    .line 528
    .line 529
    const-wide/32 v11, 0xb0d53cf

    .line 530
    .line 531
    .line 532
    invoke-static {v11, v12}, Lu90;->δ(J)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    const-string v11, " MB"

    .line 537
    .line 538
    invoke-virtual {v1, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    const-wide/32 v17, 0x21887000

    .line 543
    .line 544
    .line 545
    invoke-static/range {v17 .. v18}, Lu90;->δ(J)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v12

    .line 549
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v11

    .line 553
    invoke-static {v3}, Lu90;->ε(Landroid/content/Context;)Z

    .line 554
    .line 555
    .line 556
    move-result v12

    .line 557
    move-object/from16 v17, v1

    .line 558
    .line 559
    const-string v1, "\u56fd\u5916\u5730\u533a\u6570\u636e\u5e93"

    .line 560
    .line 561
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 562
    .line 563
    .line 564
    if-eqz v12, :cond_1

    .line 565
    .line 566
    const-string v1, "\u5df2\u4e0b\u8f7d"

    .line 567
    .line 568
    :goto_0
    move v7, v12

    .line 569
    move-object/from16 v12, v16

    .line 570
    .line 571
    goto :goto_1

    .line 572
    :catchall_0
    move-exception v0

    .line 573
    goto/16 :goto_8

    .line 574
    .line 575
    :cond_1
    const-string v1, "\u672a\u4e0b\u8f7d"

    .line 576
    .line 577
    goto :goto_0

    .line 578
    :goto_1
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 579
    .line 580
    .line 581
    const/4 v1, 0x0

    .line 582
    invoke-virtual {v12, v1}, Landroid/view/View;->setVisibility(I)V

    .line 583
    .line 584
    .line 585
    if-eqz v7, :cond_2

    .line 586
    .line 587
    iget-object v1, v0, Lxx;->κ:Ljava/lang/String;

    .line 588
    .line 589
    :goto_2
    move-object/from16 v16, v0

    .line 590
    .line 591
    goto :goto_3

    .line 592
    :cond_2
    iget-object v1, v0, Lxx;->μ:Ljava/lang/String;

    .line 593
    .line 594
    goto :goto_2

    .line 595
    :goto_3
    const/16 v0, 0x63

    .line 596
    .line 597
    invoke-static {v0, v3, v1}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-virtual {v12, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 602
    .line 603
    .line 604
    if-eqz v7, :cond_3

    .line 605
    .line 606
    goto :goto_4

    .line 607
    :cond_3
    move-object/from16 v2, v26

    .line 608
    .line 609
    :goto_4
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 614
    .line 615
    .line 616
    invoke-static/range {v17 .. v17}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 621
    .line 622
    .line 623
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 628
    .line 629
    .line 630
    const/16 v0, 0x3e8

    .line 631
    .line 632
    invoke-virtual {v15, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 633
    .line 634
    .line 635
    new-instance v2, Lum1;

    .line 636
    .line 637
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 638
    .line 639
    .line 640
    const-string v0, "geonames_database"

    .line 641
    .line 642
    const/4 v1, 0x0

    .line 643
    invoke-virtual {v3, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    const-string v1, "download_source"

    .line 648
    .line 649
    const-string v7, "github_raw"

    .line 650
    .line 651
    invoke-interface {v0, v1, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    sget-object v1, Ls90;->θ:Li2;

    .line 656
    .line 657
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    invoke-static {}, Ls90;->values()[Ls90;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    array-length v7, v1

    .line 665
    const/4 v9, 0x0

    .line 666
    :goto_5
    if-ge v9, v7, :cond_5

    .line 667
    .line 668
    aget-object v11, v1, v9

    .line 669
    .line 670
    iget-object v13, v11, Ls90;->ε:Ljava/lang/String;

    .line 671
    .line 672
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v13

    .line 676
    if-eqz v13, :cond_4

    .line 677
    .line 678
    goto :goto_6

    .line 679
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 680
    .line 681
    goto :goto_5

    .line 682
    :cond_5
    const/4 v11, 0x0

    .line 683
    :goto_6
    if-nez v11, :cond_6

    .line 684
    .line 685
    sget-object v11, Ls90;->ι:Ls90;

    .line 686
    .line 687
    :cond_6
    iput-object v11, v2, Lum1;->ε:Ljava/lang/Object;

    .line 688
    .line 689
    iget-object v0, v11, Ls90;->ζ:Ljava/lang/String;

    .line 690
    .line 691
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 692
    .line 693
    .line 694
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 695
    .line 696
    invoke-direct {v0, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 704
    .line 705
    .line 706
    move-result-object v7

    .line 707
    new-instance v1, Lum1;

    .line 708
    .line 709
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 710
    .line 711
    .line 712
    new-instance v11, Lqm1;

    .line 713
    .line 714
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 715
    .line 716
    .line 717
    new-instance v0, Lg90;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 718
    .line 719
    move-object v4, v3

    .line 720
    move-object/from16 v24, v5

    .line 721
    .line 722
    move-object v5, v6

    .line 723
    move-object v3, v2

    .line 724
    move-object/from16 v2, v21

    .line 725
    .line 726
    :try_start_1
    invoke-direct/range {v0 .. v5}, Lg90;-><init>(Lum1;Landroid/widget/LinearLayout;Lum1;Landroid/app/Activity;Landroid/widget/TextView;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 727
    .line 728
    .line 729
    move-object v6, v2

    .line 730
    move-object v9, v3

    .line 731
    :try_start_2
    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 732
    .line 733
    .line 734
    new-instance v0, Li90;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 735
    .line 736
    const/4 v5, 0x0

    .line 737
    move-object/from16 v3, p0

    .line 738
    .line 739
    move-object v2, v1

    .line 740
    move-object v4, v7

    .line 741
    move-object v1, v11

    .line 742
    :try_start_3
    invoke-direct/range {v0 .. v5}, Li90;-><init>(Lqm1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 743
    .line 744
    .line 745
    move-object v1, v2

    .line 746
    :try_start_4
    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 747
    .line 748
    .line 749
    new-instance v0, Li90;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 750
    .line 751
    const/4 v5, 0x1

    .line 752
    move-object/from16 v3, p0

    .line 753
    .line 754
    move-object v2, v1

    .line 755
    move-object v1, v11

    .line 756
    :try_start_5
    invoke-direct/range {v0 .. v5}, Li90;-><init>(Lqm1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 757
    .line 758
    .line 759
    move-object v1, v2

    .line 760
    :try_start_6
    invoke-virtual {v14, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 761
    .line 762
    .line 763
    new-instance v0, Lj90;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 764
    .line 765
    const/4 v14, 0x0

    .line 766
    move-object v2, v10

    .line 767
    move-object v10, v4

    .line 768
    move-object v4, v2

    .line 769
    move-object/from16 v13, p1

    .line 770
    .line 771
    move-object v5, v6

    .line 772
    move-object v2, v9

    .line 773
    move-object v6, v15

    .line 774
    move-object/from16 v8, v16

    .line 775
    .line 776
    move-object/from16 v7, v22

    .line 777
    .line 778
    move-object/from16 v3, v24

    .line 779
    .line 780
    const/4 v15, 0x1

    .line 781
    move-object/from16 v9, p0

    .line 782
    .line 783
    :try_start_7
    invoke-direct/range {v0 .. v14}, Lj90;-><init>(Lum1;Lum1;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/TextView;Lxx;Landroid/app/Activity;Landroid/app/AlertDialog;Lqm1;Landroid/widget/TextView;Lp70;I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 784
    .line 785
    .line 786
    :try_start_8
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 787
    .line 788
    .line 789
    new-instance v0, Lj90;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 790
    .line 791
    const/4 v14, 0x1

    .line 792
    move-object/from16 v9, p0

    .line 793
    .line 794
    move-object/from16 v13, p1

    .line 795
    .line 796
    move-object/from16 v8, v16

    .line 797
    .line 798
    :try_start_9
    invoke-direct/range {v0 .. v14}, Lj90;-><init>(Lum1;Lum1;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/TextView;Lxx;Landroid/app/Activity;Landroid/app/AlertDialog;Lqm1;Landroid/widget/TextView;Lp70;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 799
    .line 800
    .line 801
    move-object v5, v3

    .line 802
    move-object v3, v9

    .line 803
    move-object v4, v10

    .line 804
    :try_start_a
    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 805
    .line 806
    .line 807
    new-instance v0, Lk90;

    .line 808
    .line 809
    invoke-direct {v0, v11, v1, v3, v4}, Lk90;-><init>(Lqm1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v4, v0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 813
    .line 814
    .line 815
    new-instance v0, Lvg;

    .line 816
    .line 817
    invoke-direct {v0, v15, v1}, Lvg;-><init>(ILjava/lang/Object;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v4, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v4}, Landroid/app/Dialog;->show()V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    if-eqz v0, :cond_8

    .line 831
    .line 832
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 833
    .line 834
    const/4 v2, 0x0

    .line 835
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 846
    .line 847
    .line 848
    if-eqz v25, :cond_7

    .line 849
    .line 850
    const v1, 0x3ed70a3d    # 0.42f

    .line 851
    .line 852
    .line 853
    goto :goto_7

    .line 854
    :cond_7
    const/high16 v1, 0x3f000000    # 0.5f

    .line 855
    .line 856
    :goto_7
    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 857
    .line 858
    .line 859
    const/4 v1, 0x2

    .line 860
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 872
    .line 873
    int-to-float v1, v1

    .line 874
    const v2, 0x3f6b851f    # 0.92f

    .line 875
    .line 876
    .line 877
    mul-float/2addr v1, v2

    .line 878
    float-to-int v1, v1

    .line 879
    const/4 v2, -0x2

    .line 880
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 881
    .line 882
    .line 883
    return-void

    .line 884
    :catchall_1
    move-exception v0

    .line 885
    move-object v3, v9

    .line 886
    goto :goto_8

    .line 887
    :catchall_2
    move-exception v0

    .line 888
    move-object/from16 v3, p0

    .line 889
    .line 890
    goto :goto_8

    .line 891
    :catchall_3
    move-exception v0

    .line 892
    move-object v3, v4

    .line 893
    :goto_8
    sget-object v1, Lu90;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 894
    .line 895
    const/4 v2, 0x0

    .line 896
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 897
    .line 898
    .line 899
    const-string v1, "raf02e3c7781e553e"

    .line 900
    .line 901
    const-string v4, "\u56fd\u5916\u6570\u636e\u5e93\u5f39\u7a97\u52a0\u8f7d\u5931\u8d25"

    .line 902
    .line 903
    invoke-static {v1, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 904
    .line 905
    .line 906
    invoke-static {v3, v4, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 911
    .line 912
    .line 913
    :cond_8
    :goto_9
    return-void
.end method

.method public static Μ(Landroid/app/Activity;I)Landroid/view/View;
    .locals 2

    .line 1
    new-instance v0, Landroid/view/View;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    invoke-direct {p0, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static Ν(Landroid/app/Activity;Lih0;)V
    .locals 3

    .line 1
    sget-object v0, Lnh0;->α:Lnh0;

    .line 2
    .line 3
    invoke-static {}, Lnh0;->ν()Lgh0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, v0, Lgh0;->α:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object p1, v0, Lgh0;->γ:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance v0, Lp3;

    .line 23
    .line 24
    const/16 v1, 0x1d

    .line 25
    .line 26
    invoke-direct {v0, p0, v1, p1}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Lyh;->Ρ(Landroid/content/Context;)Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Lp3;->invoke()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    new-instance p1, Landroid/app/AlertDialog$Builder;

    .line 40
    .line 41
    invoke-direct {p1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    const-string v1, "\u9009\u62e9\u4fdd\u5b58\u76ee\u5f55"

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v1, "\u804a\u5929\u8bb0\u5f55\u5c06\u4fdd\u5b58\u5230\u6240\u9009\u76ee\u5f55\u4e0b\u7684\u201c\u804a\u5929\u8bb0\u5f55\u201d\u6587\u4ef6\u5939\u3002\u7cfb\u7edf\u4f1a\u4e3a\u5f53\u524d\u6296\u97f3\u7528\u6237\u7a7a\u95f4\u4fdd\u5b58\u6301\u4e45\u5199\u5165\u6388\u6743\u3002"

    .line 51
    .line 52
    invoke-virtual {p1, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v1, Lbc0;

    .line 57
    .line 58
    const/4 v2, 0x3

    .line 59
    invoke-direct {v1, p0, v2, v0}, Lbc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    const-string p0, "\u9009\u62e9\u76ee\u5f55"

    .line 63
    .line 64
    invoke-virtual {p1, p0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const-string p1, "\u53d6\u6d88"

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public static Ξ(Landroid/app/Activity;Landroid/widget/TextView;Z)V
    .locals 3

    .line 1
    const-string v0, "theme"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lq71;->γ:Lxx;

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget-object v2, v2, Lxx;->ι:Ljava/lang/String;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v1

    .line 17
    :cond_1
    if-eqz v2, :cond_4

    .line 18
    .line 19
    iget-object v2, v2, Lxx;->η:Ljava/lang/String;

    .line 20
    .line 21
    :goto_0
    invoke-static {v2, p1, v1, p2}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 22
    .line 23
    .line 24
    sget-object v2, Lq71;->γ:Lxx;

    .line 25
    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    iget-object v0, v2, Lxx;->Α:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    iget-object v1, v2, Lxx;->γ:Ljava/lang/String;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    iget-object v1, v2, Lxx;->ε:Ljava/lang/String;

    .line 36
    .line 37
    :goto_1
    const/4 v2, 0x7

    .line 38
    invoke-static {v2, p0, v0, v1}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :cond_4
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1
.end method

.method public static Ο(Landroid/content/Context;Landroid/widget/TextView;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lyh;->Ρ(Landroid/content/Context;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {p0}, Lyh;->у(Landroid/content/Context;)Liu;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Liu;->α()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Liu;->β:Ljava/lang/String;

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    const-string p0, ""

    .line 22
    .line 23
    :cond_0
    invoke-static {p0}, Lyh;->ψ(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const-string p0, "\u4f7f\u7528\u7cfb\u7edf\u9ed8\u8ba4\u76ee\u5f55"

    .line 29
    .line 30
    :goto_0
    const-string v0, "\u4fdd\u5b58\u5230\uff1a"

    .line 31
    .line 32
    const-string v1, "/\u804a\u5929\u8bb0\u5f55\n\u70b9\u51fb\u66f4\u6539\u76ee\u5f55"

    .line 33
    .line 34
    invoke-static {v0, p0, v1}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const-string p0, "\u5c1a\u672a\u9009\u62e9\u4fdd\u5b58\u76ee\u5f55\n\u70b9\u51fb\u4f7f\u7528\u7cfb\u7edf\u76ee\u5f55\u9009\u62e9\u5668\u6388\u6743"

    .line 40
    .line 41
    :goto_1
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static Π(Landroid/app/Activity;ILp3;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Lnh0;->α:Lnh0;

    .line 15
    .line 16
    invoke-static {}, Lnh0;->ν()Lgh0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-boolean v0, v0, Lgh0;->α:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p2}, Lp3;->invoke()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    if-gtz p1, :cond_2

    .line 29
    .line 30
    const-string p1, "\u76ee\u5f55\u5df2\u6388\u6743\uff0c\u8bf7\u4fdd\u6301\u804a\u5929\u9875\u6253\u5f00\u540e\u91cd\u65b0\u5bfc\u51fa"

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Lgs;

    .line 50
    .line 51
    const/4 v2, 0x4

    .line 52
    invoke-direct {v1, p1, v2, p0, p2}, Lgs;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 p0, 0x96

    .line 56
    .line 57
    invoke-virtual {v0, v1, p0, p1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_0
    return-void
.end method

.method public static Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V
    .locals 6

    .line 1
    const-string v0, "DYHelper"

    .line 2
    .line 3
    const-string v1, "OperationDialog "

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-static {}, Lq71;->Ε()Lf8;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object v4, v3, Lf8;->ζ:Lh8;

    .line 11
    .line 12
    sget-object v5, Lh8;->ι:Lh8;

    .line 13
    .line 14
    if-ne v4, v5, :cond_1

    .line 15
    .line 16
    iget-object v4, v3, Lf8;->θ:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p2

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v3, " failed: current aweme unavailable"

    .line 38
    .line 39
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const/4 v3, 0x4

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static {v0, p2, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const-string p2, "\u672a\u8bc6\u522b\u5230\u5f53\u524d\u64ad\u653e\u4f5c\u54c1\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 52
    .line 53
    invoke-static {p0, p2, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    invoke-interface {p2, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, " failed"

    .line 74
    .line 75
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v0, v1, p2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    const-string p2, " \u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 86
    .line 87
    invoke-static {v2, p0, p1, p2}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public static α(Ljava/util/LinkedHashSet;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    const-string p1, ""

    .line 16
    .line 17
    :cond_1
    const-string v0, "http"

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {p1, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_2
    return-void
.end method

.method public static final varargs β(Ljava/util/List;[Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    invoke-static {p1}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, Lj71;

    .line 26
    .line 27
    iget-object v2, v2, Lj71;->α:Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-object v0
.end method

.method public static γ(Lf8;Ljava/util/List;ZLandroid/app/Activity;)Ljava/util/ArrayList;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Lf8;->ζ:Lh8;

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v4, v0, Lf8;->θ:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v5, v0, Lf8;->δ:Ljava/util/List;

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v7, 0x0

    .line 24
    :goto_0
    iget-object v8, v0, Lf8;->Η:Ljava/util/List;

    .line 25
    .line 26
    if-eqz v8, :cond_1

    .line 27
    .line 28
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v8, 0x0

    .line 34
    :goto_1
    iget-object v9, v0, Lf8;->Ο:Ljava/util/List;

    .line 35
    .line 36
    if-eqz v9, :cond_2

    .line 37
    .line 38
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/4 v9, 0x0

    .line 44
    :goto_2
    iget-object v10, v0, Lf8;->Ν:Ljava/util/List;

    .line 45
    .line 46
    if-eqz v10, :cond_3

    .line 47
    .line 48
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    const/4 v10, 0x0

    .line 54
    :goto_3
    invoke-virtual {v0}, Lf8;->ζ()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    const/4 v12, 0x1

    .line 59
    if-eqz v11, :cond_4

    .line 60
    .line 61
    move v11, v12

    .line 62
    goto :goto_4

    .line 63
    :cond_4
    const/4 v11, 0x0

    .line 64
    :goto_4
    const-string v13, ", imageUrls="

    .line 65
    .line 66
    const-string v14, ", animatedImageUrls="

    .line 67
    .line 68
    const-string v15, " [OP-DIALOG-LIVEPHOTO] awemeId="

    .line 69
    .line 70
    invoke-static {v7, v15, v4, v13, v14}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const-string v7, ", livePhotoItems="

    .line 75
    .line 76
    const-string v13, ", livePhotoVideoCandidates="

    .line 77
    .line 78
    invoke-static {v4, v8, v7, v9, v13}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v7, ", bestLiveVideo="

    .line 85
    .line 86
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const-string v7, "DYHelper"

    .line 97
    .line 98
    const/4 v8, 0x0

    .line 99
    const/4 v9, 0x4

    .line 100
    invoke-static {v7, v4, v8, v9, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    sget-object v4, Lh8;->η:Lh8;

    .line 104
    .line 105
    if-eq v2, v4, :cond_6

    .line 106
    .line 107
    invoke-virtual {v0}, Lf8;->λ()Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_5

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_5
    const/4 v4, 0x0

    .line 115
    goto :goto_6

    .line 116
    :cond_6
    :goto_5
    move v4, v12

    .line 117
    :goto_6
    const/16 v15, 0xe

    .line 118
    .line 119
    move-object/from16 v16, v8

    .line 120
    .line 121
    const/4 v8, 0x3

    .line 122
    const-string v6, " \u00b7 \u957f\u6309\u53ef\u9009"

    .line 123
    .line 124
    sget-object v7, Lh8;->ε:Lh8;

    .line 125
    .line 126
    const-string v17, "theme"

    .line 127
    .line 128
    if-eqz v4, :cond_e

    .line 129
    .line 130
    invoke-static {v0}, Lq71;->θ(Lf8;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    new-instance v18, Lj71;

    .line 139
    .line 140
    if-lez v5, :cond_7

    .line 141
    .line 142
    const-string v5, "\u4e0b\u8f7d\u56fe\u7247\u548c\u52a8\u56fe"

    .line 143
    .line 144
    :goto_7
    move-object/from16 v19, v5

    .line 145
    .line 146
    goto :goto_8

    .line 147
    :cond_7
    const-string v5, "\u4e0b\u8f7d\u52a8\u56fe"

    .line 148
    .line 149
    goto :goto_7

    .line 150
    :goto_8
    invoke-static {v0}, Lq71;->θ(Lf8;)Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    invoke-static {v0}, Lq71;->λ(Lf8;)I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    const-string v11, " \u4e2a\u52a8\u56fe"

    .line 163
    .line 164
    const-string v13, "\u4fdd\u5b58 "

    .line 165
    .line 166
    if-lez v5, :cond_8

    .line 167
    .line 168
    if-lez v10, :cond_8

    .line 169
    .line 170
    const-string v14, " \u5f20\u56fe\u7247 + "

    .line 171
    .line 172
    invoke-static {v13, v5, v14, v10, v11}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    goto :goto_9

    .line 177
    :cond_8
    if-lez v10, :cond_9

    .line 178
    .line 179
    invoke-static {v13, v10, v11}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    goto :goto_9

    .line 184
    :cond_9
    if-lez v5, :cond_a

    .line 185
    .line 186
    const-string v11, " \u5f20\u56fe\u7247"

    .line 187
    .line 188
    invoke-static {v13, v5, v11}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    goto :goto_9

    .line 193
    :cond_a
    const-string v11, "\u5df2\u8bc6\u522b\uff0c\u672a\u627e\u5230\u65e0\u6c34\u5370\u8d44\u6e90"

    .line 194
    .line 195
    :goto_9
    add-int/2addr v5, v10

    .line 196
    if-le v5, v12, :cond_b

    .line 197
    .line 198
    invoke-virtual {v11, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v11

    .line 202
    :cond_b
    move-object/from16 v20, v11

    .line 203
    .line 204
    sget-object v5, Lq71;->γ:Lxx;

    .line 205
    .line 206
    if-eqz v5, :cond_d

    .line 207
    .line 208
    iget-object v6, v5, Lxx;->σ:Ljava/lang/String;

    .line 209
    .line 210
    if-eqz v5, :cond_c

    .line 211
    .line 212
    iget-object v5, v5, Lxx;->ρ:Ljava/lang/String;

    .line 213
    .line 214
    new-instance v10, Lja0;

    .line 215
    .line 216
    invoke-direct {v10, v1, v8}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 217
    .line 218
    .line 219
    new-instance v11, Lja0;

    .line 220
    .line 221
    invoke-direct {v11, v1, v15}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 222
    .line 223
    .line 224
    const-string v28, "\u9009\u62e9\u4e0b\u8f7d\u5185\u5bb9"

    .line 225
    .line 226
    const/16 v29, 0xc44

    .line 227
    .line 228
    const/16 v21, 0x0

    .line 229
    .line 230
    const v22, 0x7f08009d

    .line 231
    .line 232
    .line 233
    const/16 v25, 0x0

    .line 234
    .line 235
    move-object/from16 v24, v5

    .line 236
    .line 237
    move-object/from16 v23, v6

    .line 238
    .line 239
    move-object/from16 v26, v10

    .line 240
    .line 241
    move-object/from16 v27, v11

    .line 242
    .line 243
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 244
    .line 245
    .line 246
    move-object/from16 v5, v18

    .line 247
    .line 248
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto/16 :goto_a

    .line 252
    .line 253
    :cond_c
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v16

    .line 257
    :cond_d
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v16

    .line 261
    :cond_e
    if-ne v2, v7, :cond_11

    .line 262
    .line 263
    invoke-virtual {v0}, Lf8;->ν()Z

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    if-eqz v10, :cond_11

    .line 268
    .line 269
    new-instance v18, Lj71;

    .line 270
    .line 271
    sget-object v5, Lq71;->γ:Lxx;

    .line 272
    .line 273
    if-eqz v5, :cond_10

    .line 274
    .line 275
    iget-object v6, v5, Lxx;->κ:Ljava/lang/String;

    .line 276
    .line 277
    if-eqz v5, :cond_f

    .line 278
    .line 279
    iget-object v5, v5, Lxx;->ι:Ljava/lang/String;

    .line 280
    .line 281
    new-instance v10, Lja0;

    .line 282
    .line 283
    const/16 v11, 0x18

    .line 284
    .line 285
    invoke-direct {v10, v1, v11}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 286
    .line 287
    .line 288
    new-instance v11, Le71;

    .line 289
    .line 290
    invoke-direct {v11, v1, v9}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 291
    .line 292
    .line 293
    const-string v28, "\u9009\u62e9\u4e0b\u8f7d\u5185\u5bb9"

    .line 294
    .line 295
    const/16 v29, 0xc44

    .line 296
    .line 297
    const-string v19, "\u4e0b\u8f7d\u89c6\u9891"

    .line 298
    .line 299
    const-string v20, "\u4fdd\u5b58\u5230\u672c\u5730\u76f8\u518c"

    .line 300
    .line 301
    const/16 v21, 0x0

    .line 302
    .line 303
    const v22, 0x7f080099

    .line 304
    .line 305
    .line 306
    const/16 v25, 0x0

    .line 307
    .line 308
    move-object/from16 v24, v5

    .line 309
    .line 310
    move-object/from16 v23, v6

    .line 311
    .line 312
    move-object/from16 v26, v10

    .line 313
    .line 314
    move-object/from16 v27, v11

    .line 315
    .line 316
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 317
    .line 318
    .line 319
    move-object/from16 v5, v18

    .line 320
    .line 321
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    goto/16 :goto_a

    .line 325
    .line 326
    :cond_f
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw v16

    .line 330
    :cond_10
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw v16

    .line 334
    :cond_11
    sget-object v10, Lh8;->ζ:Lh8;

    .line 335
    .line 336
    const-string v11, " \u5f20"

    .line 337
    .line 338
    const-string v13, "\u5171 "

    .line 339
    .line 340
    if-ne v2, v10, :cond_15

    .line 341
    .line 342
    invoke-virtual {v0}, Lf8;->κ()Z

    .line 343
    .line 344
    .line 345
    move-result v10

    .line 346
    if-eqz v10, :cond_15

    .line 347
    .line 348
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    new-instance v18, Lj71;

    .line 356
    .line 357
    invoke-static {v13, v5, v11}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v10

    .line 361
    if-le v5, v12, :cond_12

    .line 362
    .line 363
    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v10

    .line 367
    :cond_12
    move-object/from16 v20, v10

    .line 368
    .line 369
    sget-object v5, Lq71;->γ:Lxx;

    .line 370
    .line 371
    if-eqz v5, :cond_14

    .line 372
    .line 373
    iget-object v6, v5, Lxx;->μ:Ljava/lang/String;

    .line 374
    .line 375
    if-eqz v5, :cond_13

    .line 376
    .line 377
    iget-object v5, v5, Lxx;->λ:Ljava/lang/String;

    .line 378
    .line 379
    new-instance v10, Le71;

    .line 380
    .line 381
    const/16 v11, 0xa

    .line 382
    .line 383
    invoke-direct {v10, v1, v11}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 384
    .line 385
    .line 386
    new-instance v11, Le71;

    .line 387
    .line 388
    const/16 v13, 0xb

    .line 389
    .line 390
    invoke-direct {v11, v1, v13}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 391
    .line 392
    .line 393
    const-string v28, "\u9009\u62e9\u4e0b\u8f7d\u5185\u5bb9"

    .line 394
    .line 395
    const/16 v29, 0xc44

    .line 396
    .line 397
    const-string v19, "\u4e0b\u8f7d\u56fe\u7247"

    .line 398
    .line 399
    const/16 v21, 0x0

    .line 400
    .line 401
    const v22, 0x7f08009d

    .line 402
    .line 403
    .line 404
    const/16 v25, 0x0

    .line 405
    .line 406
    move-object/from16 v24, v5

    .line 407
    .line 408
    move-object/from16 v23, v6

    .line 409
    .line 410
    move-object/from16 v26, v10

    .line 411
    .line 412
    move-object/from16 v27, v11

    .line 413
    .line 414
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 415
    .line 416
    .line 417
    move-object/from16 v5, v18

    .line 418
    .line 419
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    goto/16 :goto_a

    .line 423
    .line 424
    :cond_13
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    throw v16

    .line 428
    :cond_14
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    throw v16

    .line 432
    :cond_15
    invoke-virtual {v0}, Lf8;->ν()Z

    .line 433
    .line 434
    .line 435
    move-result v10

    .line 436
    if-eqz v10, :cond_18

    .line 437
    .line 438
    new-instance v18, Lj71;

    .line 439
    .line 440
    sget-object v5, Lq71;->γ:Lxx;

    .line 441
    .line 442
    if-eqz v5, :cond_17

    .line 443
    .line 444
    iget-object v6, v5, Lxx;->κ:Ljava/lang/String;

    .line 445
    .line 446
    if-eqz v5, :cond_16

    .line 447
    .line 448
    iget-object v5, v5, Lxx;->ι:Ljava/lang/String;

    .line 449
    .line 450
    new-instance v10, Le71;

    .line 451
    .line 452
    const/16 v11, 0xc

    .line 453
    .line 454
    invoke-direct {v10, v1, v11}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 455
    .line 456
    .line 457
    new-instance v11, Le71;

    .line 458
    .line 459
    const/16 v13, 0xd

    .line 460
    .line 461
    invoke-direct {v11, v1, v13}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 462
    .line 463
    .line 464
    const-string v28, "\u9009\u62e9\u4e0b\u8f7d\u5185\u5bb9"

    .line 465
    .line 466
    const/16 v29, 0xc44

    .line 467
    .line 468
    const-string v19, "\u4e0b\u8f7d\u89c6\u9891"

    .line 469
    .line 470
    const-string v20, "\u4fdd\u5b58\u5230\u672c\u5730\u76f8\u518c"

    .line 471
    .line 472
    const/16 v21, 0x0

    .line 473
    .line 474
    const v22, 0x7f080099

    .line 475
    .line 476
    .line 477
    const/16 v25, 0x0

    .line 478
    .line 479
    move-object/from16 v24, v5

    .line 480
    .line 481
    move-object/from16 v23, v6

    .line 482
    .line 483
    move-object/from16 v26, v10

    .line 484
    .line 485
    move-object/from16 v27, v11

    .line 486
    .line 487
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 488
    .line 489
    .line 490
    move-object/from16 v5, v18

    .line 491
    .line 492
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    goto :goto_a

    .line 496
    :cond_16
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    throw v16

    .line 500
    :cond_17
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    throw v16

    .line 504
    :cond_18
    invoke-virtual {v0}, Lf8;->κ()Z

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    if-eqz v10, :cond_1c

    .line 509
    .line 510
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 514
    .line 515
    .line 516
    move-result v5

    .line 517
    new-instance v18, Lj71;

    .line 518
    .line 519
    invoke-static {v13, v5, v11}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v10

    .line 523
    if-le v5, v12, :cond_19

    .line 524
    .line 525
    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v10

    .line 529
    :cond_19
    move-object/from16 v20, v10

    .line 530
    .line 531
    sget-object v5, Lq71;->γ:Lxx;

    .line 532
    .line 533
    if-eqz v5, :cond_1b

    .line 534
    .line 535
    invoke-virtual {v5}, Lxx;->β()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v23

    .line 539
    sget-object v5, Lq71;->γ:Lxx;

    .line 540
    .line 541
    if-eqz v5, :cond_1a

    .line 542
    .line 543
    invoke-virtual {v5}, Lxx;->α()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v24

    .line 547
    new-instance v5, Le71;

    .line 548
    .line 549
    invoke-direct {v5, v1, v15}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 550
    .line 551
    .line 552
    new-instance v6, Le71;

    .line 553
    .line 554
    const/16 v10, 0xf

    .line 555
    .line 556
    invoke-direct {v6, v1, v10}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 557
    .line 558
    .line 559
    const-string v28, "\u9009\u62e9\u4e0b\u8f7d\u5185\u5bb9"

    .line 560
    .line 561
    const/16 v29, 0xc44

    .line 562
    .line 563
    const-string v19, "\u4e0b\u8f7d\u56fe\u7247"

    .line 564
    .line 565
    const/16 v21, 0x0

    .line 566
    .line 567
    const v22, 0x7f08009d

    .line 568
    .line 569
    .line 570
    const/16 v25, 0x0

    .line 571
    .line 572
    move-object/from16 v26, v5

    .line 573
    .line 574
    move-object/from16 v27, v6

    .line 575
    .line 576
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 577
    .line 578
    .line 579
    move-object/from16 v5, v18

    .line 580
    .line 581
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    goto :goto_a

    .line 585
    :cond_1a
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    throw v16

    .line 589
    :cond_1b
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    throw v16

    .line 593
    :cond_1c
    :goto_a
    invoke-virtual {v0}, Lf8;->ν()Z

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    if-eqz v5, :cond_1f

    .line 598
    .line 599
    const-string v5, "global_video_speed"

    .line 600
    .line 601
    const/high16 v6, 0x3f800000    # 1.0f

    .line 602
    .line 603
    invoke-static {v5, v6}, Lui1;->λ(Ljava/lang/String;F)F

    .line 604
    .line 605
    .line 606
    move-result v5

    .line 607
    invoke-static {v5}, Lq71;->Γ(F)F

    .line 608
    .line 609
    .line 610
    move-result v5

    .line 611
    invoke-static {v5}, Lq71;->τ(F)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v5

    .line 615
    const-string v6, "\u5f53\u524d "

    .line 616
    .line 617
    const-string v10, " \u500d\uff0c\u540e\u7eed\u89c6\u9891\u7ee7\u7eed\u590d\u7528"

    .line 618
    .line 619
    invoke-static {v6, v5, v10}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v20

    .line 623
    sget-object v5, Lq71;->γ:Lxx;

    .line 624
    .line 625
    if-eqz v5, :cond_1e

    .line 626
    .line 627
    invoke-virtual {v5}, Lxx;->β()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v23

    .line 631
    sget-object v5, Lq71;->γ:Lxx;

    .line 632
    .line 633
    if-eqz v5, :cond_1d

    .line 634
    .line 635
    invoke-virtual {v5}, Lxx;->α()Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v24

    .line 639
    new-instance v18, Lj71;

    .line 640
    .line 641
    new-instance v5, Lja0;

    .line 642
    .line 643
    invoke-direct {v5, v1, v9}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 644
    .line 645
    .line 646
    const/16 v28, 0x0

    .line 647
    .line 648
    const/16 v29, 0xf40

    .line 649
    .line 650
    const-string v19, "\u5168\u5c40\u89c6\u9891\u500d\u901f"

    .line 651
    .line 652
    const/16 v21, 0x0

    .line 653
    .line 654
    const v22, 0x7f0800a5

    .line 655
    .line 656
    .line 657
    const/16 v25, 0x0

    .line 658
    .line 659
    const/16 v27, 0x0

    .line 660
    .line 661
    move-object/from16 v26, v5

    .line 662
    .line 663
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 664
    .line 665
    .line 666
    move-object/from16 v5, v18

    .line 667
    .line 668
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    goto :goto_b

    .line 672
    :cond_1d
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    throw v16

    .line 676
    :cond_1e
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    throw v16

    .line 680
    :cond_1f
    :goto_b
    invoke-virtual {v0}, Lf8;->ι()Z

    .line 681
    .line 682
    .line 683
    move-result v5

    .line 684
    const/4 v6, 0x5

    .line 685
    if-eqz v5, :cond_27

    .line 686
    .line 687
    new-instance v18, Lj71;

    .line 688
    .line 689
    iget-object v5, v0, Lf8;->Β:Ljava/lang/String;

    .line 690
    .line 691
    if-eqz v5, :cond_20

    .line 692
    .line 693
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 694
    .line 695
    .line 696
    move-result v9

    .line 697
    if-nez v9, :cond_20

    .line 698
    .line 699
    goto :goto_c

    .line 700
    :cond_20
    move-object/from16 v5, v16

    .line 701
    .line 702
    :goto_c
    iget-object v9, v0, Lf8;->Γ:Ljava/lang/String;

    .line 703
    .line 704
    if-eqz v9, :cond_21

    .line 705
    .line 706
    invoke-static {v9}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 707
    .line 708
    .line 709
    move-result v10

    .line 710
    if-nez v10, :cond_21

    .line 711
    .line 712
    goto :goto_d

    .line 713
    :cond_21
    move-object/from16 v9, v16

    .line 714
    .line 715
    :goto_d
    if-eqz v5, :cond_23

    .line 716
    .line 717
    if-eqz v9, :cond_23

    .line 718
    .line 719
    const-string v10, " \u00b7 "

    .line 720
    .line 721
    invoke-static {v5, v10, v9}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v5

    .line 725
    :cond_22
    :goto_e
    move-object/from16 v20, v5

    .line 726
    .line 727
    goto :goto_f

    .line 728
    :cond_23
    if-nez v5, :cond_22

    .line 729
    .line 730
    if-nez v9, :cond_24

    .line 731
    .line 732
    const-string v5, "\u63d0\u53d6\u539f\u58f0\u4fdd\u5b58\u5230\u672c\u5730"

    .line 733
    .line 734
    goto :goto_e

    .line 735
    :cond_24
    move-object/from16 v20, v9

    .line 736
    .line 737
    :goto_f
    sget-object v5, Lq71;->γ:Lxx;

    .line 738
    .line 739
    if-eqz v5, :cond_26

    .line 740
    .line 741
    iget-object v9, v5, Lxx;->π:Ljava/lang/String;

    .line 742
    .line 743
    if-eqz v5, :cond_25

    .line 744
    .line 745
    iget-object v5, v5, Lxx;->ο:Ljava/lang/String;

    .line 746
    .line 747
    new-instance v10, Lja0;

    .line 748
    .line 749
    invoke-direct {v10, v1, v6}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 750
    .line 751
    .line 752
    const/16 v28, 0x0

    .line 753
    .line 754
    const/16 v29, 0xf44

    .line 755
    .line 756
    const-string v19, "\u4e0b\u8f7d\u97f3\u9891"

    .line 757
    .line 758
    const/16 v21, 0x0

    .line 759
    .line 760
    const v22, 0x7f080091

    .line 761
    .line 762
    .line 763
    const/16 v25, 0x0

    .line 764
    .line 765
    const/16 v27, 0x0

    .line 766
    .line 767
    move-object/from16 v24, v5

    .line 768
    .line 769
    move-object/from16 v23, v9

    .line 770
    .line 771
    move-object/from16 v26, v10

    .line 772
    .line 773
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 774
    .line 775
    .line 776
    move-object/from16 v5, v18

    .line 777
    .line 778
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    goto :goto_10

    .line 782
    :cond_25
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    throw v16

    .line 786
    :cond_26
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    throw v16

    .line 790
    :cond_27
    :goto_10
    if-nez v4, :cond_29

    .line 791
    .line 792
    invoke-virtual {v0}, Lf8;->ν()Z

    .line 793
    .line 794
    .line 795
    move-result v5

    .line 796
    if-nez v5, :cond_29

    .line 797
    .line 798
    invoke-virtual {v0}, Lf8;->κ()Z

    .line 799
    .line 800
    .line 801
    move-result v5

    .line 802
    if-nez v5, :cond_29

    .line 803
    .line 804
    invoke-virtual {v0}, Lf8;->μ()Z

    .line 805
    .line 806
    .line 807
    move-result v5

    .line 808
    if-eqz v5, :cond_28

    .line 809
    .line 810
    goto :goto_11

    .line 811
    :cond_28
    const/4 v5, 0x0

    .line 812
    goto :goto_12

    .line 813
    :cond_29
    :goto_11
    move v5, v12

    .line 814
    :goto_12
    const/4 v9, 0x6

    .line 815
    if-eqz v5, :cond_2c

    .line 816
    .line 817
    new-instance v18, Lj71;

    .line 818
    .line 819
    sget-object v5, Lq71;->γ:Lxx;

    .line 820
    .line 821
    if-eqz v5, :cond_2b

    .line 822
    .line 823
    iget-object v10, v5, Lxx;->υ:Ljava/lang/String;

    .line 824
    .line 825
    if-eqz v5, :cond_2a

    .line 826
    .line 827
    iget-object v5, v5, Lxx;->τ:Ljava/lang/String;

    .line 828
    .line 829
    new-instance v11, Lja0;

    .line 830
    .line 831
    invoke-direct {v11, v1, v9}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 832
    .line 833
    .line 834
    const/16 v28, 0x0

    .line 835
    .line 836
    const/16 v29, 0xf44

    .line 837
    .line 838
    const-string v19, "\u9009\u62e9\u4e0b\u8f7d"

    .line 839
    .line 840
    const-string v20, "\u9009\u62e9\u8981\u4fdd\u5b58\u7684\u56fe\u7247 / \u89c6\u9891 / \u52a8\u56fe"

    .line 841
    .line 842
    const/16 v21, 0x0

    .line 843
    .line 844
    const v22, 0x7f0800a5

    .line 845
    .line 846
    .line 847
    const/16 v25, 0x0

    .line 848
    .line 849
    const/16 v27, 0x0

    .line 850
    .line 851
    move-object/from16 v24, v5

    .line 852
    .line 853
    move-object/from16 v23, v10

    .line 854
    .line 855
    move-object/from16 v26, v11

    .line 856
    .line 857
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 858
    .line 859
    .line 860
    move-object/from16 v5, v18

    .line 861
    .line 862
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    goto :goto_13

    .line 866
    :cond_2a
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    throw v16

    .line 870
    :cond_2b
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 871
    .line 872
    .line 873
    throw v16

    .line 874
    :cond_2c
    :goto_13
    invoke-virtual {v0}, Lf8;->ν()Z

    .line 875
    .line 876
    .line 877
    move-result v5

    .line 878
    const/4 v10, 0x7

    .line 879
    if-eqz v5, :cond_2f

    .line 880
    .line 881
    new-instance v18, Lj71;

    .line 882
    .line 883
    sget-object v5, Lq71;->γ:Lxx;

    .line 884
    .line 885
    if-eqz v5, :cond_2e

    .line 886
    .line 887
    invoke-virtual {v5}, Lxx;->ζ()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v23

    .line 891
    sget-object v5, Lq71;->γ:Lxx;

    .line 892
    .line 893
    if-eqz v5, :cond_2d

    .line 894
    .line 895
    invoke-virtual {v5}, Lxx;->ε()Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v24

    .line 899
    new-instance v5, Lja0;

    .line 900
    .line 901
    invoke-direct {v5, v1, v10}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 902
    .line 903
    .line 904
    const/16 v28, 0x0

    .line 905
    .line 906
    const/16 v29, 0xf40

    .line 907
    .line 908
    const-string v19, "\u4e0b\u8f7d\u539f\u753b\u8d28"

    .line 909
    .line 910
    const-string v20, "\u4f18\u5148\u89e3\u6790\u539f\u753b\u8d28\uff0c\u672a\u547d\u4e2d\u5219\u666e\u901a\u4e0b\u8f7d"

    .line 911
    .line 912
    const/16 v21, 0x0

    .line 913
    .line 914
    const v22, 0x7f08009c

    .line 915
    .line 916
    .line 917
    const/16 v25, 0x0

    .line 918
    .line 919
    const/16 v27, 0x0

    .line 920
    .line 921
    move-object/from16 v26, v5

    .line 922
    .line 923
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 924
    .line 925
    .line 926
    move-object/from16 v5, v18

    .line 927
    .line 928
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 929
    .line 930
    .line 931
    goto :goto_14

    .line 932
    :cond_2d
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 933
    .line 934
    .line 935
    throw v16

    .line 936
    :cond_2e
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    throw v16

    .line 940
    :cond_2f
    :goto_14
    invoke-virtual {v0}, Lf8;->ν()Z

    .line 941
    .line 942
    .line 943
    move-result v5

    .line 944
    const/16 v11, 0x8

    .line 945
    .line 946
    if-nez v5, :cond_30

    .line 947
    .line 948
    invoke-virtual {v0}, Lf8;->κ()Z

    .line 949
    .line 950
    .line 951
    move-result v5

    .line 952
    if-nez v5, :cond_30

    .line 953
    .line 954
    invoke-virtual {v0}, Lf8;->μ()Z

    .line 955
    .line 956
    .line 957
    move-result v5

    .line 958
    if-eqz v5, :cond_31

    .line 959
    .line 960
    :cond_30
    new-instance v18, Lj71;

    .line 961
    .line 962
    sget-object v5, Lq71;->γ:Lxx;

    .line 963
    .line 964
    if-eqz v5, :cond_b2

    .line 965
    .line 966
    invoke-virtual {v5}, Lxx;->β()Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v23

    .line 970
    sget-object v5, Lq71;->γ:Lxx;

    .line 971
    .line 972
    if-eqz v5, :cond_b1

    .line 973
    .line 974
    invoke-virtual {v5}, Lxx;->α()Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v24

    .line 978
    new-instance v5, Lja0;

    .line 979
    .line 980
    invoke-direct {v5, v1, v11}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 981
    .line 982
    .line 983
    const/16 v28, 0x0

    .line 984
    .line 985
    const/16 v29, 0xf40

    .line 986
    .line 987
    const-string v19, "\u590d\u5236\u4e0b\u8f7d\u76f4\u94fe"

    .line 988
    .line 989
    const-string v20, "\u590d\u5236\u5f53\u524d\u4f5c\u54c1\u7684\u5a92\u4f53\u4e0b\u8f7d\u5730\u5740"

    .line 990
    .line 991
    const/16 v21, 0x0

    .line 992
    .line 993
    const v22, 0x7f08009e

    .line 994
    .line 995
    .line 996
    const/16 v25, 0x0

    .line 997
    .line 998
    const/16 v27, 0x0

    .line 999
    .line 1000
    move-object/from16 v26, v5

    .line 1001
    .line 1002
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1003
    .line 1004
    .line 1005
    move-object/from16 v5, v18

    .line 1006
    .line 1007
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1008
    .line 1009
    .line 1010
    :cond_31
    invoke-virtual {v0}, Lf8;->κ()Z

    .line 1011
    .line 1012
    .line 1013
    move-result v5

    .line 1014
    const/16 v13, 0x9

    .line 1015
    .line 1016
    if-eqz v5, :cond_34

    .line 1017
    .line 1018
    if-eq v2, v7, :cond_34

    .line 1019
    .line 1020
    if-nez v4, :cond_34

    .line 1021
    .line 1022
    new-instance v18, Lj71;

    .line 1023
    .line 1024
    sget-object v2, Lq71;->γ:Lxx;

    .line 1025
    .line 1026
    if-eqz v2, :cond_33

    .line 1027
    .line 1028
    iget-object v4, v2, Lxx;->π:Ljava/lang/String;

    .line 1029
    .line 1030
    if-eqz v2, :cond_32

    .line 1031
    .line 1032
    iget-object v2, v2, Lxx;->ο:Ljava/lang/String;

    .line 1033
    .line 1034
    new-instance v5, Lja0;

    .line 1035
    .line 1036
    invoke-direct {v5, v1, v13}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1037
    .line 1038
    .line 1039
    const/16 v28, 0x0

    .line 1040
    .line 1041
    const/16 v29, 0xf44

    .line 1042
    .line 1043
    const-string v19, "\u9884\u89c8\u5e76\u4fdd\u5b58\u56fe\u7247"

    .line 1044
    .line 1045
    const-string v20, "\u76f4\u63a5\u8bfb\u53d6\uff0c\u65e0\u9700\u7f51\u7edc\u9274\u6743"

    .line 1046
    .line 1047
    const/16 v21, 0x0

    .line 1048
    .line 1049
    const v22, 0x7f08009d

    .line 1050
    .line 1051
    .line 1052
    const/16 v25, 0x0

    .line 1053
    .line 1054
    const/16 v27, 0x0

    .line 1055
    .line 1056
    move-object/from16 v24, v2

    .line 1057
    .line 1058
    move-object/from16 v23, v4

    .line 1059
    .line 1060
    move-object/from16 v26, v5

    .line 1061
    .line 1062
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1063
    .line 1064
    .line 1065
    move-object/from16 v2, v18

    .line 1066
    .line 1067
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1068
    .line 1069
    .line 1070
    goto :goto_15

    .line 1071
    :cond_32
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1072
    .line 1073
    .line 1074
    throw v16

    .line 1075
    :cond_33
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1076
    .line 1077
    .line 1078
    throw v16

    .line 1079
    :cond_34
    :goto_15
    new-instance v18, Lj71;

    .line 1080
    .line 1081
    sget-object v2, Lq71;->γ:Lxx;

    .line 1082
    .line 1083
    if-eqz v2, :cond_b0

    .line 1084
    .line 1085
    invoke-virtual {v2}, Lxx;->ζ()Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v23

    .line 1089
    sget-object v2, Lq71;->γ:Lxx;

    .line 1090
    .line 1091
    if-eqz v2, :cond_af

    .line 1092
    .line 1093
    invoke-virtual {v2}, Lxx;->ε()Ljava/lang/String;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v24

    .line 1097
    new-instance v2, Lja0;

    .line 1098
    .line 1099
    const/16 v4, 0xa

    .line 1100
    .line 1101
    invoke-direct {v2, v1, v4}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1102
    .line 1103
    .line 1104
    new-instance v4, Lja0;

    .line 1105
    .line 1106
    const/16 v5, 0xb

    .line 1107
    .line 1108
    invoke-direct {v4, v1, v5}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1109
    .line 1110
    .line 1111
    const-string v28, "\u590d\u5236\u5f53\u524d\u4e3b\u9875 ID"

    .line 1112
    .line 1113
    const/16 v29, 0xc44

    .line 1114
    .line 1115
    const-string v19, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 1116
    .line 1117
    const-string v20, "\u8f93\u5165 UID / SecUID \u8df3\u8f6c\u4e3b\u9875"

    .line 1118
    .line 1119
    const/16 v21, 0x0

    .line 1120
    .line 1121
    const v22, 0x7f0800a1

    .line 1122
    .line 1123
    .line 1124
    const/16 v25, 0x0

    .line 1125
    .line 1126
    move-object/from16 v26, v2

    .line 1127
    .line 1128
    move-object/from16 v27, v4

    .line 1129
    .line 1130
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1131
    .line 1132
    .line 1133
    move-object/from16 v2, v18

    .line 1134
    .line 1135
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1136
    .line 1137
    .line 1138
    new-instance v18, Lj71;

    .line 1139
    .line 1140
    sget-object v2, Lq71;->γ:Lxx;

    .line 1141
    .line 1142
    if-eqz v2, :cond_ae

    .line 1143
    .line 1144
    invoke-virtual {v2}, Lxx;->β()Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v23

    .line 1148
    sget-object v2, Lq71;->γ:Lxx;

    .line 1149
    .line 1150
    if-eqz v2, :cond_ad

    .line 1151
    .line 1152
    invoke-virtual {v2}, Lxx;->α()Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v24

    .line 1156
    new-instance v2, Lja0;

    .line 1157
    .line 1158
    const/16 v4, 0xc

    .line 1159
    .line 1160
    invoke-direct {v2, v1, v4}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1161
    .line 1162
    .line 1163
    const/16 v28, 0x0

    .line 1164
    .line 1165
    const/16 v29, 0xf40

    .line 1166
    .line 1167
    const-string v19, "\u590d\u5236\u4e3b\u9875ID"

    .line 1168
    .line 1169
    const-string v20, "\u590d\u5236\u5f53\u524d\u8bc6\u522b\u5230\u7684 UID / SecUID"

    .line 1170
    .line 1171
    const/16 v21, 0x0

    .line 1172
    .line 1173
    const v22, 0x7f080098

    .line 1174
    .line 1175
    .line 1176
    const/16 v25, 0x0

    .line 1177
    .line 1178
    const/16 v27, 0x0

    .line 1179
    .line 1180
    move-object/from16 v26, v2

    .line 1181
    .line 1182
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1183
    .line 1184
    .line 1185
    move-object/from16 v2, v18

    .line 1186
    .line 1187
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1188
    .line 1189
    .line 1190
    iget-object v2, v0, Lf8;->β:Ljava/lang/String;

    .line 1191
    .line 1192
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v2

    .line 1196
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v2

    .line 1200
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v4

    .line 1204
    if-nez v4, :cond_37

    .line 1205
    .line 1206
    const-string v4, "\u65e0\u63cf\u8ff0"

    .line 1207
    .line 1208
    invoke-static {v2, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v4

    .line 1212
    if-nez v4, :cond_37

    .line 1213
    .line 1214
    const-string v4, "\u672a\u77e5"

    .line 1215
    .line 1216
    invoke-static {v2, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v2

    .line 1220
    if-nez v2, :cond_37

    .line 1221
    .line 1222
    new-instance v18, Lj71;

    .line 1223
    .line 1224
    sget-object v2, Lq71;->γ:Lxx;

    .line 1225
    .line 1226
    if-eqz v2, :cond_36

    .line 1227
    .line 1228
    invoke-virtual {v2}, Lxx;->β()Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v23

    .line 1232
    sget-object v2, Lq71;->γ:Lxx;

    .line 1233
    .line 1234
    if-eqz v2, :cond_35

    .line 1235
    .line 1236
    invoke-virtual {v2}, Lxx;->α()Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v24

    .line 1240
    new-instance v2, Lja0;

    .line 1241
    .line 1242
    const/16 v4, 0xd

    .line 1243
    .line 1244
    invoke-direct {v2, v1, v4}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1245
    .line 1246
    .line 1247
    const/16 v28, 0x0

    .line 1248
    .line 1249
    const/16 v29, 0xf40

    .line 1250
    .line 1251
    const-string v19, "\u590d\u5236\u6587\u6848"

    .line 1252
    .line 1253
    const-string v20, "\u590d\u5236\u5f53\u524d\u4f5c\u54c1\u7684\u5b8c\u6574\u6587\u5b57\u63cf\u8ff0"

    .line 1254
    .line 1255
    const/16 v21, 0x0

    .line 1256
    .line 1257
    const v22, 0x7f080098

    .line 1258
    .line 1259
    .line 1260
    const/16 v25, 0x0

    .line 1261
    .line 1262
    const/16 v27, 0x0

    .line 1263
    .line 1264
    move-object/from16 v26, v2

    .line 1265
    .line 1266
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1267
    .line 1268
    .line 1269
    move-object/from16 v2, v18

    .line 1270
    .line 1271
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1272
    .line 1273
    .line 1274
    goto :goto_16

    .line 1275
    :cond_35
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    throw v16

    .line 1279
    :cond_36
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1280
    .line 1281
    .line 1282
    throw v16

    .line 1283
    :cond_37
    :goto_16
    if-eqz p2, :cond_3e

    .line 1284
    .line 1285
    invoke-static {}, Lx9;->ε()Z

    .line 1286
    .line 1287
    .line 1288
    move-result v2

    .line 1289
    move-object/from16 v4, p1

    .line 1290
    .line 1291
    invoke-static {v4, v2}, Lq71;->ζ(Ljava/util/List;Z)Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v20

    .line 1295
    new-instance v18, Lj71;

    .line 1296
    .line 1297
    sget-object v4, Lq71;->γ:Lxx;

    .line 1298
    .line 1299
    if-eqz v2, :cond_39

    .line 1300
    .line 1301
    if-eqz v4, :cond_38

    .line 1302
    .line 1303
    iget-object v4, v4, Lxx;->υ:Ljava/lang/String;

    .line 1304
    .line 1305
    :goto_17
    move-object/from16 v23, v4

    .line 1306
    .line 1307
    goto :goto_18

    .line 1308
    :cond_38
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1309
    .line 1310
    .line 1311
    throw v16

    .line 1312
    :cond_39
    if-eqz v4, :cond_3d

    .line 1313
    .line 1314
    invoke-virtual {v4}, Lxx;->δ()Ljava/lang/String;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v4

    .line 1318
    goto :goto_17

    .line 1319
    :goto_18
    sget-object v4, Lq71;->γ:Lxx;

    .line 1320
    .line 1321
    if-eqz v2, :cond_3b

    .line 1322
    .line 1323
    if-eqz v4, :cond_3a

    .line 1324
    .line 1325
    iget-object v4, v4, Lxx;->τ:Ljava/lang/String;

    .line 1326
    .line 1327
    :goto_19
    move-object/from16 v24, v4

    .line 1328
    .line 1329
    goto :goto_1a

    .line 1330
    :cond_3a
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1331
    .line 1332
    .line 1333
    throw v16

    .line 1334
    :cond_3b
    if-eqz v4, :cond_3c

    .line 1335
    .line 1336
    invoke-virtual {v4}, Lxx;->γ()Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v4

    .line 1340
    goto :goto_19

    .line 1341
    :goto_1a
    xor-int/lit8 v25, v2, 0x1

    .line 1342
    .line 1343
    new-instance v2, Lja0;

    .line 1344
    .line 1345
    const/16 v4, 0xf

    .line 1346
    .line 1347
    invoke-direct {v2, v1, v4}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1348
    .line 1349
    .line 1350
    new-instance v4, Lja0;

    .line 1351
    .line 1352
    const/16 v5, 0x10

    .line 1353
    .line 1354
    invoke-direct {v4, v1, v5}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1355
    .line 1356
    .line 1357
    const-string v28, "\u8c03\u8bd5\u52a0\u8f7d\u4e3b\u9875\u4f5c\u54c1"

    .line 1358
    .line 1359
    const/16 v29, 0xc04

    .line 1360
    .line 1361
    const-string v19, "\u6279\u91cf\u4e0b\u8f7d\u4f5c\u8005\u4e3b\u9875\u4f5c\u54c1"

    .line 1362
    .line 1363
    const/16 v21, 0x0

    .line 1364
    .line 1365
    const v22, 0x7f080092

    .line 1366
    .line 1367
    .line 1368
    move-object/from16 v26, v2

    .line 1369
    .line 1370
    move-object/from16 v27, v4

    .line 1371
    .line 1372
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1373
    .line 1374
    .line 1375
    move-object/from16 v2, v18

    .line 1376
    .line 1377
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1378
    .line 1379
    .line 1380
    goto :goto_1b

    .line 1381
    :cond_3c
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1382
    .line 1383
    .line 1384
    throw v16

    .line 1385
    :cond_3d
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1386
    .line 1387
    .line 1388
    throw v16

    .line 1389
    :cond_3e
    :goto_1b
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;

    .line 1390
    .line 1391
    invoke-virtual {v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;->fromAwemeInfo(Lf8;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v2

    .line 1395
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 1396
    .line 1397
    invoke-virtual {v4, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->isBookmarked(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 1398
    .line 1399
    .line 1400
    move-result v4

    .line 1401
    new-instance v18, Lj71;

    .line 1402
    .line 1403
    if-eqz v4, :cond_3f

    .line 1404
    .line 1405
    const-string v5, "\u53d6\u6d88\u4f5c\u8005\u4e3b\u9875\u4e66\u7b7e"

    .line 1406
    .line 1407
    :goto_1c
    move-object/from16 v19, v5

    .line 1408
    .line 1409
    goto :goto_1d

    .line 1410
    :cond_3f
    const-string v5, "\u4f5c\u8005\u4e3b\u9875\u4e66\u7b7e"

    .line 1411
    .line 1412
    goto :goto_1c

    .line 1413
    :goto_1d
    if-nez v2, :cond_40

    .line 1414
    .line 1415
    const-string v5, "\u5f53\u524d\u4f5c\u54c1\u4f5c\u8005\u4fe1\u606f\u4e0d\u8db3"

    .line 1416
    .line 1417
    :goto_1e
    move-object/from16 v20, v5

    .line 1418
    .line 1419
    goto :goto_1f

    .line 1420
    :cond_40
    const-string v5, "\u6536\u85cf\u5f53\u524d\u64ad\u653e\u4f5c\u54c1\u7684\u4f5c\u8005\u4e3b\u9875"

    .line 1421
    .line 1422
    goto :goto_1e

    .line 1423
    :goto_1f
    sget-object v5, Lq71;->γ:Lxx;

    .line 1424
    .line 1425
    if-eqz v4, :cond_42

    .line 1426
    .line 1427
    if-eqz v5, :cond_41

    .line 1428
    .line 1429
    invoke-virtual {v5}, Lxx;->ζ()Ljava/lang/String;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v5

    .line 1433
    :goto_20
    move-object/from16 v23, v5

    .line 1434
    .line 1435
    goto :goto_21

    .line 1436
    :cond_41
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1437
    .line 1438
    .line 1439
    throw v16

    .line 1440
    :cond_42
    if-eqz v5, :cond_ac

    .line 1441
    .line 1442
    iget-object v5, v5, Lxx;->υ:Ljava/lang/String;

    .line 1443
    .line 1444
    goto :goto_20

    .line 1445
    :goto_21
    if-eqz v4, :cond_44

    .line 1446
    .line 1447
    sget-object v4, Lq71;->γ:Lxx;

    .line 1448
    .line 1449
    if-eqz v4, :cond_43

    .line 1450
    .line 1451
    invoke-virtual {v4}, Lxx;->ε()Ljava/lang/String;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v4

    .line 1455
    :goto_22
    move-object/from16 v24, v4

    .line 1456
    .line 1457
    goto :goto_23

    .line 1458
    :cond_43
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1459
    .line 1460
    .line 1461
    throw v16

    .line 1462
    :cond_44
    sget-object v4, Lq71;->γ:Lxx;

    .line 1463
    .line 1464
    if-eqz v4, :cond_ab

    .line 1465
    .line 1466
    iget-object v4, v4, Lxx;->τ:Ljava/lang/String;

    .line 1467
    .line 1468
    goto :goto_22

    .line 1469
    :goto_23
    if-nez v2, :cond_45

    .line 1470
    .line 1471
    move/from16 v25, v12

    .line 1472
    .line 1473
    goto :goto_24

    .line 1474
    :cond_45
    const/16 v25, 0x0

    .line 1475
    .line 1476
    :goto_24
    new-instance v2, Lja0;

    .line 1477
    .line 1478
    const/16 v4, 0x11

    .line 1479
    .line 1480
    invoke-direct {v2, v1, v4}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1481
    .line 1482
    .line 1483
    new-instance v4, Lja0;

    .line 1484
    .line 1485
    const/16 v5, 0x12

    .line 1486
    .line 1487
    invoke-direct {v4, v1, v5}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1488
    .line 1489
    .line 1490
    const-string v28, "\u6253\u5f00\u4e3b\u9875\u4e66\u7b7e\u7ba1\u7406"

    .line 1491
    .line 1492
    const/16 v29, 0xc00

    .line 1493
    .line 1494
    const/16 v21, 0x0

    .line 1495
    .line 1496
    const v22, 0x7f080093

    .line 1497
    .line 1498
    .line 1499
    move-object/from16 v26, v2

    .line 1500
    .line 1501
    move-object/from16 v27, v4

    .line 1502
    .line 1503
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1504
    .line 1505
    .line 1506
    move-object/from16 v2, v18

    .line 1507
    .line 1508
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1509
    .line 1510
    .line 1511
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;

    .line 1512
    .line 1513
    invoke-virtual {v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;->fromAwemeInfo(Lf8;)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v2

    .line 1517
    if-eqz v2, :cond_46

    .line 1518
    .line 1519
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 1520
    .line 1521
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v5

    .line 1525
    invoke-virtual {v4, v5}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->isBookmarked(Ljava/lang/String;)Z

    .line 1526
    .line 1527
    .line 1528
    move-result v4

    .line 1529
    if-eqz v4, :cond_46

    .line 1530
    .line 1531
    move v4, v12

    .line 1532
    goto :goto_25

    .line 1533
    :cond_46
    const/4 v4, 0x0

    .line 1534
    :goto_25
    new-instance v18, Lj71;

    .line 1535
    .line 1536
    if-eqz v4, :cond_47

    .line 1537
    .line 1538
    const-string v5, "\u53d6\u6d88\u4f5c\u54c1\u4e66\u7b7e"

    .line 1539
    .line 1540
    :goto_26
    move-object/from16 v19, v5

    .line 1541
    .line 1542
    goto :goto_27

    .line 1543
    :cond_47
    const-string v5, "\u4f5c\u54c1\u4e66\u7b7e"

    .line 1544
    .line 1545
    goto :goto_26

    .line 1546
    :goto_27
    if-nez v2, :cond_48

    .line 1547
    .line 1548
    const-string v5, "\u5f53\u524d\u4f5c\u54c1\u4fe1\u606f\u4e0d\u8db3"

    .line 1549
    .line 1550
    :goto_28
    move-object/from16 v20, v5

    .line 1551
    .line 1552
    goto :goto_29

    .line 1553
    :cond_48
    const-string v5, "\u6536\u85cf\u6587\u5b57 / \u56fe\u6587 / \u89c6\u9891\u4f5c\u54c1\uff0c\u53ef\u5728\u7ba1\u7406\u5668\u8df3\u8f6c"

    .line 1554
    .line 1555
    goto :goto_28

    .line 1556
    :goto_29
    sget-object v5, Lq71;->γ:Lxx;

    .line 1557
    .line 1558
    if-eqz v4, :cond_4a

    .line 1559
    .line 1560
    if-eqz v5, :cond_49

    .line 1561
    .line 1562
    invoke-virtual {v5}, Lxx;->ζ()Ljava/lang/String;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v5

    .line 1566
    :goto_2a
    move-object/from16 v23, v5

    .line 1567
    .line 1568
    goto :goto_2b

    .line 1569
    :cond_49
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1570
    .line 1571
    .line 1572
    throw v16

    .line 1573
    :cond_4a
    if-eqz v5, :cond_aa

    .line 1574
    .line 1575
    iget-object v5, v5, Lxx;->υ:Ljava/lang/String;

    .line 1576
    .line 1577
    goto :goto_2a

    .line 1578
    :goto_2b
    if-eqz v4, :cond_4c

    .line 1579
    .line 1580
    sget-object v4, Lq71;->γ:Lxx;

    .line 1581
    .line 1582
    if-eqz v4, :cond_4b

    .line 1583
    .line 1584
    invoke-virtual {v4}, Lxx;->ε()Ljava/lang/String;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v4

    .line 1588
    :goto_2c
    move-object/from16 v24, v4

    .line 1589
    .line 1590
    goto :goto_2d

    .line 1591
    :cond_4b
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1592
    .line 1593
    .line 1594
    throw v16

    .line 1595
    :cond_4c
    sget-object v4, Lq71;->γ:Lxx;

    .line 1596
    .line 1597
    if-eqz v4, :cond_a9

    .line 1598
    .line 1599
    iget-object v4, v4, Lxx;->τ:Ljava/lang/String;

    .line 1600
    .line 1601
    goto :goto_2c

    .line 1602
    :goto_2d
    if-nez v2, :cond_4d

    .line 1603
    .line 1604
    move/from16 v25, v12

    .line 1605
    .line 1606
    goto :goto_2e

    .line 1607
    :cond_4d
    const/16 v25, 0x0

    .line 1608
    .line 1609
    :goto_2e
    new-instance v2, Lja0;

    .line 1610
    .line 1611
    const/16 v4, 0x13

    .line 1612
    .line 1613
    invoke-direct {v2, v1, v4}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1614
    .line 1615
    .line 1616
    new-instance v4, Lja0;

    .line 1617
    .line 1618
    const/16 v5, 0x14

    .line 1619
    .line 1620
    invoke-direct {v4, v1, v5}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1621
    .line 1622
    .line 1623
    const-string v28, "\u6253\u5f00\u4f5c\u54c1\u4e66\u7b7e\u7ba1\u7406"

    .line 1624
    .line 1625
    const/16 v29, 0xc00

    .line 1626
    .line 1627
    const/16 v21, 0x0

    .line 1628
    .line 1629
    const v22, 0x7f080093

    .line 1630
    .line 1631
    .line 1632
    move-object/from16 v26, v2

    .line 1633
    .line 1634
    move-object/from16 v27, v4

    .line 1635
    .line 1636
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1637
    .line 1638
    .line 1639
    move-object/from16 v2, v18

    .line 1640
    .line 1641
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1642
    .line 1643
    .line 1644
    new-instance v18, Lj71;

    .line 1645
    .line 1646
    sget-object v2, Lq71;->γ:Lxx;

    .line 1647
    .line 1648
    if-eqz v2, :cond_a8

    .line 1649
    .line 1650
    invoke-virtual {v2}, Lxx;->β()Ljava/lang/String;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v23

    .line 1654
    sget-object v2, Lq71;->γ:Lxx;

    .line 1655
    .line 1656
    if-eqz v2, :cond_a7

    .line 1657
    .line 1658
    invoke-virtual {v2}, Lxx;->α()Ljava/lang/String;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v24

    .line 1662
    new-instance v2, Lja0;

    .line 1663
    .line 1664
    const/16 v4, 0x15

    .line 1665
    .line 1666
    invoke-direct {v2, v1, v4}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1667
    .line 1668
    .line 1669
    const/16 v28, 0x0

    .line 1670
    .line 1671
    const/16 v29, 0xf40

    .line 1672
    .line 1673
    const-string v19, "\u4e66\u7b7e\u7ba1\u7406"

    .line 1674
    .line 1675
    const-string v20, "\u67e5\u770b\u5df2\u6536\u85cf\u7684\u4f5c\u54c1\u3001\u4e3b\u9875\u548c\u8bc4\u8bba"

    .line 1676
    .line 1677
    const/16 v21, 0x0

    .line 1678
    .line 1679
    const v22, 0x7f080094

    .line 1680
    .line 1681
    .line 1682
    const/16 v25, 0x0

    .line 1683
    .line 1684
    const/16 v27, 0x0

    .line 1685
    .line 1686
    move-object/from16 v26, v2

    .line 1687
    .line 1688
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1689
    .line 1690
    .line 1691
    move-object/from16 v2, v18

    .line 1692
    .line 1693
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1694
    .line 1695
    .line 1696
    iget-object v2, v0, Lf8;->η:Ljava/lang/String;

    .line 1697
    .line 1698
    if-nez v2, :cond_4e

    .line 1699
    .line 1700
    invoke-virtual {v0}, Lf8;->ν()Z

    .line 1701
    .line 1702
    .line 1703
    move-result v2

    .line 1704
    if-nez v2, :cond_4e

    .line 1705
    .line 1706
    invoke-virtual {v0}, Lf8;->κ()Z

    .line 1707
    .line 1708
    .line 1709
    move-result v2

    .line 1710
    if-nez v2, :cond_4e

    .line 1711
    .line 1712
    invoke-virtual {v0}, Lf8;->ι()Z

    .line 1713
    .line 1714
    .line 1715
    move-result v2

    .line 1716
    if-nez v2, :cond_4e

    .line 1717
    .line 1718
    invoke-virtual {v0}, Lf8;->μ()Z

    .line 1719
    .line 1720
    .line 1721
    move-result v0

    .line 1722
    if-eqz v0, :cond_4f

    .line 1723
    .line 1724
    :cond_4e
    new-instance v18, Lj71;

    .line 1725
    .line 1726
    sget-object v0, Lq71;->γ:Lxx;

    .line 1727
    .line 1728
    if-eqz v0, :cond_a6

    .line 1729
    .line 1730
    invoke-virtual {v0}, Lxx;->β()Ljava/lang/String;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v23

    .line 1734
    sget-object v0, Lq71;->γ:Lxx;

    .line 1735
    .line 1736
    if-eqz v0, :cond_a5

    .line 1737
    .line 1738
    invoke-virtual {v0}, Lxx;->α()Ljava/lang/String;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v24

    .line 1742
    new-instance v0, Lja0;

    .line 1743
    .line 1744
    const/16 v2, 0x16

    .line 1745
    .line 1746
    invoke-direct {v0, v1, v2}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1747
    .line 1748
    .line 1749
    const/16 v28, 0x0

    .line 1750
    .line 1751
    const/16 v29, 0xf40

    .line 1752
    .line 1753
    const-string v19, "\u590d\u5236\u94fe\u63a5"

    .line 1754
    .line 1755
    const-string v20, "\u590d\u5236\u5206\u4eab\u5730\u5740"

    .line 1756
    .line 1757
    const/16 v21, 0x0

    .line 1758
    .line 1759
    const v22, 0x7f08009e

    .line 1760
    .line 1761
    .line 1762
    const/16 v25, 0x0

    .line 1763
    .line 1764
    const/16 v27, 0x0

    .line 1765
    .line 1766
    move-object/from16 v26, v0

    .line 1767
    .line 1768
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1769
    .line 1770
    .line 1771
    move-object/from16 v0, v18

    .line 1772
    .line 1773
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1774
    .line 1775
    .line 1776
    :cond_4f
    invoke-static {}, Lx9;->θ()Z

    .line 1777
    .line 1778
    .line 1779
    move-result v0

    .line 1780
    invoke-static {}, Lux;->π()Z

    .line 1781
    .line 1782
    .line 1783
    move-result v2

    .line 1784
    new-instance v18, Lj71;

    .line 1785
    .line 1786
    const-string v4, "\u5185\u6d4b\u529f\u80fd"

    .line 1787
    .line 1788
    if-eqz v0, :cond_50

    .line 1789
    .line 1790
    const-string v5, "\u4e00\u952e\u5ef6\u957f\u6709\u6548\u671f"

    .line 1791
    .line 1792
    move-object/from16 v20, v5

    .line 1793
    .line 1794
    goto :goto_2f

    .line 1795
    :cond_50
    move-object/from16 v20, v4

    .line 1796
    .line 1797
    :goto_2f
    sget-object v5, Lq71;->γ:Lxx;

    .line 1798
    .line 1799
    if-eqz v0, :cond_52

    .line 1800
    .line 1801
    if-eqz v5, :cond_51

    .line 1802
    .line 1803
    invoke-virtual {v5}, Lxx;->ζ()Ljava/lang/String;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v5

    .line 1807
    :goto_30
    move-object/from16 v23, v5

    .line 1808
    .line 1809
    goto :goto_31

    .line 1810
    :cond_51
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1811
    .line 1812
    .line 1813
    throw v16

    .line 1814
    :cond_52
    if-eqz v5, :cond_a4

    .line 1815
    .line 1816
    invoke-virtual {v5}, Lxx;->δ()Ljava/lang/String;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v5

    .line 1820
    goto :goto_30

    .line 1821
    :goto_31
    sget-object v5, Lq71;->γ:Lxx;

    .line 1822
    .line 1823
    if-eqz v0, :cond_54

    .line 1824
    .line 1825
    if-eqz v5, :cond_53

    .line 1826
    .line 1827
    invoke-virtual {v5}, Lxx;->ε()Ljava/lang/String;

    .line 1828
    .line 1829
    .line 1830
    move-result-object v5

    .line 1831
    :goto_32
    move-object/from16 v24, v5

    .line 1832
    .line 1833
    goto :goto_33

    .line 1834
    :cond_53
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1835
    .line 1836
    .line 1837
    throw v16

    .line 1838
    :cond_54
    if-eqz v5, :cond_a3

    .line 1839
    .line 1840
    invoke-virtual {v5}, Lxx;->γ()Ljava/lang/String;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v5

    .line 1844
    goto :goto_32

    .line 1845
    :goto_33
    xor-int/lit8 v32, v0, 0x1

    .line 1846
    .line 1847
    new-instance v5, Ld71;

    .line 1848
    .line 1849
    const/4 v7, 0x0

    .line 1850
    invoke-direct {v5, v0, v1, v7}, Ld71;-><init>(ZLandroid/app/Activity;I)V

    .line 1851
    .line 1852
    .line 1853
    const/16 v28, 0x0

    .line 1854
    .line 1855
    const/16 v29, 0xf00

    .line 1856
    .line 1857
    const-string v19, "\u706b\u661f\u706b\u82b1\u7ba1\u7406"

    .line 1858
    .line 1859
    const/16 v21, 0x0

    .line 1860
    .line 1861
    const v22, 0x7f0800a4

    .line 1862
    .line 1863
    .line 1864
    const/16 v27, 0x0

    .line 1865
    .line 1866
    move-object/from16 v26, v5

    .line 1867
    .line 1868
    move/from16 v25, v32

    .line 1869
    .line 1870
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1871
    .line 1872
    .line 1873
    move-object/from16 v5, v18

    .line 1874
    .line 1875
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1876
    .line 1877
    .line 1878
    if-eqz v2, :cond_59

    .line 1879
    .line 1880
    if-eqz v0, :cond_59

    .line 1881
    .line 1882
    sget-object v5, Lq71;->γ:Lxx;

    .line 1883
    .line 1884
    if-eqz v5, :cond_58

    .line 1885
    .line 1886
    invoke-virtual {v5}, Lxx;->ζ()Ljava/lang/String;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v23

    .line 1890
    sget-object v5, Lq71;->γ:Lxx;

    .line 1891
    .line 1892
    if-eqz v5, :cond_57

    .line 1893
    .line 1894
    invoke-virtual {v5}, Lxx;->ε()Ljava/lang/String;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v24

    .line 1898
    new-instance v18, Lj71;

    .line 1899
    .line 1900
    new-instance v5, Lja0;

    .line 1901
    .line 1902
    const/16 v7, 0x17

    .line 1903
    .line 1904
    invoke-direct {v5, v1, v7}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1905
    .line 1906
    .line 1907
    const/16 v28, 0x0

    .line 1908
    .line 1909
    const/16 v29, 0x340

    .line 1910
    .line 1911
    const-string v19, "\u706b\u661f\u4efb\u52a1\u8c03\u8bd5"

    .line 1912
    .line 1913
    const-string v20, "\u5f00\u53d1\u6a21\u5f0f \u00b7 \u53ea\u8bfb\u62c9\u53d6\u4efb\u52a1"

    .line 1914
    .line 1915
    const/16 v21, 0x0

    .line 1916
    .line 1917
    const v22, 0x7f0800a4

    .line 1918
    .line 1919
    .line 1920
    const/16 v25, 0x0

    .line 1921
    .line 1922
    const/16 v27, 0x0

    .line 1923
    .line 1924
    move-object/from16 v26, v5

    .line 1925
    .line 1926
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1927
    .line 1928
    .line 1929
    move-object/from16 v5, v18

    .line 1930
    .line 1931
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1932
    .line 1933
    .line 1934
    sget-object v5, Lq71;->γ:Lxx;

    .line 1935
    .line 1936
    if-eqz v5, :cond_56

    .line 1937
    .line 1938
    invoke-virtual {v5}, Lxx;->ζ()Ljava/lang/String;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v23

    .line 1942
    sget-object v5, Lq71;->γ:Lxx;

    .line 1943
    .line 1944
    if-eqz v5, :cond_55

    .line 1945
    .line 1946
    invoke-virtual {v5}, Lxx;->ε()Ljava/lang/String;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v24

    .line 1950
    new-instance v18, Lj71;

    .line 1951
    .line 1952
    new-instance v5, Lja0;

    .line 1953
    .line 1954
    const/16 v7, 0x19

    .line 1955
    .line 1956
    invoke-direct {v5, v1, v7}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1957
    .line 1958
    .line 1959
    const/16 v28, 0x0

    .line 1960
    .line 1961
    const/16 v29, 0x340

    .line 1962
    .line 1963
    const-string v19, "\u706b\u661f\u53d1\u9001\u6d4b\u8bd5"

    .line 1964
    .line 1965
    const-string v20, "\u5f00\u53d1\u6a21\u5f0f \u00b7 \u6307\u5b9a\u4f1a\u8bdd\u548c SAF \u56fe\u7247"

    .line 1966
    .line 1967
    const/16 v21, 0x0

    .line 1968
    .line 1969
    const v22, 0x7f08009f

    .line 1970
    .line 1971
    .line 1972
    const/16 v25, 0x0

    .line 1973
    .line 1974
    const/16 v27, 0x0

    .line 1975
    .line 1976
    move-object/from16 v26, v5

    .line 1977
    .line 1978
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 1979
    .line 1980
    .line 1981
    move-object/from16 v5, v18

    .line 1982
    .line 1983
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1984
    .line 1985
    .line 1986
    goto :goto_34

    .line 1987
    :cond_55
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1988
    .line 1989
    .line 1990
    throw v16

    .line 1991
    :cond_56
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1992
    .line 1993
    .line 1994
    throw v16

    .line 1995
    :cond_57
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 1996
    .line 1997
    .line 1998
    throw v16

    .line 1999
    :cond_58
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2000
    .line 2001
    .line 2002
    throw v16

    .line 2003
    :cond_59
    :goto_34
    new-instance v25, Lj71;

    .line 2004
    .line 2005
    const-string v5, "\u5df2\u9501\u5b9a \u00b7 \u4ec5\u9650\u5185\u6d4b\u7528\u6237"

    .line 2006
    .line 2007
    if-eqz v0, :cond_5a

    .line 2008
    .line 2009
    const-string v7, "\u7ba1\u7406\u5168\u90e8\u6709\u6548\u4f1a\u8bdd\u7684\u6536\u83dc\u3001\u79cd\u5730\u4e0e\u6d47\u6c34"

    .line 2010
    .line 2011
    move-object/from16 v27, v7

    .line 2012
    .line 2013
    goto :goto_35

    .line 2014
    :cond_5a
    move-object/from16 v27, v5

    .line 2015
    .line 2016
    :goto_35
    sget-object v7, Lq71;->γ:Lxx;

    .line 2017
    .line 2018
    if-eqz v0, :cond_5c

    .line 2019
    .line 2020
    if-eqz v7, :cond_5b

    .line 2021
    .line 2022
    iget-object v7, v7, Lxx;->κ:Ljava/lang/String;

    .line 2023
    .line 2024
    :goto_36
    move-object/from16 v30, v7

    .line 2025
    .line 2026
    goto :goto_37

    .line 2027
    :cond_5b
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2028
    .line 2029
    .line 2030
    throw v16

    .line 2031
    :cond_5c
    if-eqz v7, :cond_a2

    .line 2032
    .line 2033
    invoke-virtual {v7}, Lxx;->δ()Ljava/lang/String;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v7

    .line 2037
    goto :goto_36

    .line 2038
    :goto_37
    sget-object v7, Lq71;->γ:Lxx;

    .line 2039
    .line 2040
    if-eqz v0, :cond_5e

    .line 2041
    .line 2042
    if-eqz v7, :cond_5d

    .line 2043
    .line 2044
    iget-object v7, v7, Lxx;->ι:Ljava/lang/String;

    .line 2045
    .line 2046
    :goto_38
    move-object/from16 v31, v7

    .line 2047
    .line 2048
    goto :goto_39

    .line 2049
    :cond_5d
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2050
    .line 2051
    .line 2052
    throw v16

    .line 2053
    :cond_5e
    if-eqz v7, :cond_a1

    .line 2054
    .line 2055
    iget-object v7, v7, Lxx;->θ:Ljava/lang/String;

    .line 2056
    .line 2057
    goto :goto_38

    .line 2058
    :goto_39
    new-instance v7, Lja0;

    .line 2059
    .line 2060
    const/16 v14, 0x1a

    .line 2061
    .line 2062
    invoke-direct {v7, v1, v14}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 2063
    .line 2064
    .line 2065
    const/16 v35, 0x0

    .line 2066
    .line 2067
    const/16 v36, 0xf00

    .line 2068
    .line 2069
    const-string v26, "\u8425\u5730\u7ba1\u7406"

    .line 2070
    .line 2071
    const/16 v28, 0x0

    .line 2072
    .line 2073
    const v29, 0x7f0800a4

    .line 2074
    .line 2075
    .line 2076
    const/16 v34, 0x0

    .line 2077
    .line 2078
    move-object/from16 v33, v7

    .line 2079
    .line 2080
    invoke-direct/range {v25 .. v36}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2081
    .line 2082
    .line 2083
    move-object/from16 v7, v25

    .line 2084
    .line 2085
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2086
    .line 2087
    .line 2088
    if-eqz v2, :cond_63

    .line 2089
    .line 2090
    sget-object v2, Lq71;->γ:Lxx;

    .line 2091
    .line 2092
    if-eqz v2, :cond_62

    .line 2093
    .line 2094
    invoke-virtual {v2}, Lxx;->ζ()Ljava/lang/String;

    .line 2095
    .line 2096
    .line 2097
    move-result-object v23

    .line 2098
    sget-object v2, Lq71;->γ:Lxx;

    .line 2099
    .line 2100
    if-eqz v2, :cond_61

    .line 2101
    .line 2102
    invoke-virtual {v2}, Lxx;->ε()Ljava/lang/String;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v24

    .line 2106
    new-instance v18, Lj71;

    .line 2107
    .line 2108
    new-instance v2, Lja0;

    .line 2109
    .line 2110
    const/16 v7, 0x1b

    .line 2111
    .line 2112
    invoke-direct {v2, v1, v7}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 2113
    .line 2114
    .line 2115
    const/16 v28, 0x0

    .line 2116
    .line 2117
    const/16 v29, 0x340

    .line 2118
    .line 2119
    const-string v19, "\u98df\u7269\u5217\u8868\u8c03\u8bd5"

    .line 2120
    .line 2121
    const-string v20, "\u5f00\u53d1\u6a21\u5f0f \u00b7 \u53ea\u8bfb\u83b7\u53d6\u5168\u90e8\u706b\u82b1\u4f1a\u8bdd\u98df\u7269"

    .line 2122
    .line 2123
    const/16 v21, 0x0

    .line 2124
    .line 2125
    const v22, 0x7f0800a4

    .line 2126
    .line 2127
    .line 2128
    const/16 v25, 0x0

    .line 2129
    .line 2130
    const/16 v27, 0x0

    .line 2131
    .line 2132
    move-object/from16 v26, v2

    .line 2133
    .line 2134
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2135
    .line 2136
    .line 2137
    move-object/from16 v2, v18

    .line 2138
    .line 2139
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2140
    .line 2141
    .line 2142
    sget-object v2, Lq71;->γ:Lxx;

    .line 2143
    .line 2144
    if-eqz v2, :cond_60

    .line 2145
    .line 2146
    invoke-virtual {v2}, Lxx;->ζ()Ljava/lang/String;

    .line 2147
    .line 2148
    .line 2149
    move-result-object v23

    .line 2150
    sget-object v2, Lq71;->γ:Lxx;

    .line 2151
    .line 2152
    if-eqz v2, :cond_5f

    .line 2153
    .line 2154
    invoke-virtual {v2}, Lxx;->ε()Ljava/lang/String;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v24

    .line 2158
    new-instance v18, Lj71;

    .line 2159
    .line 2160
    new-instance v2, Lja0;

    .line 2161
    .line 2162
    const/16 v7, 0x1c

    .line 2163
    .line 2164
    invoke-direct {v2, v1, v7}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 2165
    .line 2166
    .line 2167
    const/16 v28, 0x0

    .line 2168
    .line 2169
    const/16 v29, 0x340

    .line 2170
    .line 2171
    const-string v19, "\u4eb2\u5bc6\u5ea6\u8c03\u8bd5"

    .line 2172
    .line 2173
    const-string v20, "\u5f00\u53d1\u6a21\u5f0f \u00b7 \u53ea\u8bfb\u83b7\u53d6\u7b49\u7ea7\u548c\u5f85\u9886\u53d6\u8bb0\u5f55"

    .line 2174
    .line 2175
    const/16 v21, 0x0

    .line 2176
    .line 2177
    const v22, 0x7f0800a4

    .line 2178
    .line 2179
    .line 2180
    const/16 v25, 0x0

    .line 2181
    .line 2182
    const/16 v27, 0x0

    .line 2183
    .line 2184
    move-object/from16 v26, v2

    .line 2185
    .line 2186
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2187
    .line 2188
    .line 2189
    move-object/from16 v2, v18

    .line 2190
    .line 2191
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2192
    .line 2193
    .line 2194
    goto :goto_3a

    .line 2195
    :cond_5f
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2196
    .line 2197
    .line 2198
    throw v16

    .line 2199
    :cond_60
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2200
    .line 2201
    .line 2202
    throw v16

    .line 2203
    :cond_61
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2204
    .line 2205
    .line 2206
    throw v16

    .line 2207
    :cond_62
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2208
    .line 2209
    .line 2210
    throw v16

    .line 2211
    :cond_63
    :goto_3a
    new-instance v18, Lj71;

    .line 2212
    .line 2213
    sget-object v2, Lq71;->γ:Lxx;

    .line 2214
    .line 2215
    if-eqz v2, :cond_a0

    .line 2216
    .line 2217
    invoke-virtual {v2}, Lxx;->ζ()Ljava/lang/String;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v23

    .line 2221
    sget-object v2, Lq71;->γ:Lxx;

    .line 2222
    .line 2223
    if-eqz v2, :cond_9f

    .line 2224
    .line 2225
    invoke-virtual {v2}, Lxx;->ε()Ljava/lang/String;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v24

    .line 2229
    new-instance v2, Lja0;

    .line 2230
    .line 2231
    const/16 v7, 0x1d

    .line 2232
    .line 2233
    invoke-direct {v2, v1, v7}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 2234
    .line 2235
    .line 2236
    const/16 v28, 0x0

    .line 2237
    .line 2238
    const/16 v29, 0xf40

    .line 2239
    .line 2240
    const-string v19, "\u6295\u5582\u98df\u7269"

    .line 2241
    .line 2242
    const-string v20, "\u6309\u8bbe\u7f6e\u7684\u98df\u7269\u4e0e\u4ef7\u683c\u4e0a\u9650\u5b9e\u65f6\u6821\u9a8c"

    .line 2243
    .line 2244
    const/16 v21, 0x0

    .line 2245
    .line 2246
    const v22, 0x7f08009f

    .line 2247
    .line 2248
    .line 2249
    const/16 v25, 0x0

    .line 2250
    .line 2251
    const/16 v27, 0x0

    .line 2252
    .line 2253
    move-object/from16 v26, v2

    .line 2254
    .line 2255
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2256
    .line 2257
    .line 2258
    move-object/from16 v2, v18

    .line 2259
    .line 2260
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2261
    .line 2262
    .line 2263
    const/4 v2, 0x2

    .line 2264
    if-eqz v0, :cond_6a

    .line 2265
    .line 2266
    new-instance v18, Lj71;

    .line 2267
    .line 2268
    sget-object v0, Lq71;->γ:Lxx;

    .line 2269
    .line 2270
    if-eqz v0, :cond_69

    .line 2271
    .line 2272
    invoke-virtual {v0}, Lxx;->ζ()Ljava/lang/String;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v23

    .line 2276
    sget-object v0, Lq71;->γ:Lxx;

    .line 2277
    .line 2278
    if-eqz v0, :cond_68

    .line 2279
    .line 2280
    invoke-virtual {v0}, Lxx;->ε()Ljava/lang/String;

    .line 2281
    .line 2282
    .line 2283
    move-result-object v24

    .line 2284
    new-instance v0, Le71;

    .line 2285
    .line 2286
    const/4 v7, 0x0

    .line 2287
    invoke-direct {v0, v1, v7}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 2288
    .line 2289
    .line 2290
    const/16 v28, 0x0

    .line 2291
    .line 2292
    const/16 v29, 0xf40

    .line 2293
    .line 2294
    const-string v19, "\u9886\u53d6\u706b\u661f"

    .line 2295
    .line 2296
    const-string v20, "\u9886\u53d6\u6240\u6709\u5df2\u5b8c\u6210\u4e14\u5f85\u9886\u53d6\u7684\u4efb\u52a1"

    .line 2297
    .line 2298
    const/16 v21, 0x0

    .line 2299
    .line 2300
    const v22, 0x7f080099

    .line 2301
    .line 2302
    .line 2303
    const/16 v25, 0x0

    .line 2304
    .line 2305
    const/16 v27, 0x0

    .line 2306
    .line 2307
    move-object/from16 v26, v0

    .line 2308
    .line 2309
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2310
    .line 2311
    .line 2312
    move-object/from16 v0, v18

    .line 2313
    .line 2314
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2315
    .line 2316
    .line 2317
    new-instance v18, Lj71;

    .line 2318
    .line 2319
    sget-object v0, Lq71;->γ:Lxx;

    .line 2320
    .line 2321
    if-eqz v0, :cond_67

    .line 2322
    .line 2323
    invoke-virtual {v0}, Lxx;->ζ()Ljava/lang/String;

    .line 2324
    .line 2325
    .line 2326
    move-result-object v23

    .line 2327
    sget-object v0, Lq71;->γ:Lxx;

    .line 2328
    .line 2329
    if-eqz v0, :cond_66

    .line 2330
    .line 2331
    invoke-virtual {v0}, Lxx;->ε()Ljava/lang/String;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v24

    .line 2335
    new-instance v0, Le71;

    .line 2336
    .line 2337
    invoke-direct {v0, v1, v12}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 2338
    .line 2339
    .line 2340
    const/16 v28, 0x0

    .line 2341
    .line 2342
    const/16 v29, 0xf40

    .line 2343
    .line 2344
    const-string v19, "\u9886\u53d6\u4eb2\u5bc6\u5ea6"

    .line 2345
    .line 2346
    const-string v20, "\u9886\u53d6\u6240\u6709\u670d\u52a1\u7aef\u5df2\u6807\u8bb0\u53ef\u9886\u53d6\u7684\u5c0f\u706b\u4eba\u7ecf\u9a8c"

    .line 2347
    .line 2348
    const/16 v21, 0x0

    .line 2349
    .line 2350
    const v22, 0x7f080099

    .line 2351
    .line 2352
    .line 2353
    const/16 v25, 0x0

    .line 2354
    .line 2355
    const/16 v27, 0x0

    .line 2356
    .line 2357
    move-object/from16 v26, v0

    .line 2358
    .line 2359
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2360
    .line 2361
    .line 2362
    move-object/from16 v0, v18

    .line 2363
    .line 2364
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2365
    .line 2366
    .line 2367
    new-instance v18, Lj71;

    .line 2368
    .line 2369
    sget-object v0, Lq71;->γ:Lxx;

    .line 2370
    .line 2371
    if-eqz v0, :cond_65

    .line 2372
    .line 2373
    invoke-virtual {v0}, Lxx;->ζ()Ljava/lang/String;

    .line 2374
    .line 2375
    .line 2376
    move-result-object v23

    .line 2377
    sget-object v0, Lq71;->γ:Lxx;

    .line 2378
    .line 2379
    if-eqz v0, :cond_64

    .line 2380
    .line 2381
    invoke-virtual {v0}, Lxx;->ε()Ljava/lang/String;

    .line 2382
    .line 2383
    .line 2384
    move-result-object v24

    .line 2385
    new-instance v0, Le71;

    .line 2386
    .line 2387
    invoke-direct {v0, v1, v2}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 2388
    .line 2389
    .line 2390
    new-instance v7, Le71;

    .line 2391
    .line 2392
    invoke-direct {v7, v1, v8}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 2393
    .line 2394
    .line 2395
    const-string v28, "\u5b8c\u6210\u540e\u81ea\u52a8\u9886\u53d6"

    .line 2396
    .line 2397
    const/16 v29, 0xc40

    .line 2398
    .line 2399
    const-string v19, "\u5b8c\u6210\u4e92\u53d1\u6d88\u606f\u4efb\u52a1"

    .line 2400
    .line 2401
    const-string v20, "\u6309\u5b9e\u65f6\u8981\u6c42\u53d1\u9001\uff0c\u53ef\u4ece\u66f4\u591a\u83dc\u5355\u9009\u62e9\u81ea\u52a8\u9886\u53d6"

    .line 2402
    .line 2403
    const/16 v21, 0x0

    .line 2404
    .line 2405
    const v22, 0x7f08009f

    .line 2406
    .line 2407
    .line 2408
    const/16 v25, 0x0

    .line 2409
    .line 2410
    move-object/from16 v26, v0

    .line 2411
    .line 2412
    move-object/from16 v27, v7

    .line 2413
    .line 2414
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2415
    .line 2416
    .line 2417
    move-object/from16 v0, v18

    .line 2418
    .line 2419
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2420
    .line 2421
    .line 2422
    goto :goto_3b

    .line 2423
    :cond_64
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2424
    .line 2425
    .line 2426
    throw v16

    .line 2427
    :cond_65
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2428
    .line 2429
    .line 2430
    throw v16

    .line 2431
    :cond_66
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2432
    .line 2433
    .line 2434
    throw v16

    .line 2435
    :cond_67
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2436
    .line 2437
    .line 2438
    throw v16

    .line 2439
    :cond_68
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2440
    .line 2441
    .line 2442
    throw v16

    .line 2443
    :cond_69
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2444
    .line 2445
    .line 2446
    throw v16

    .line 2447
    :cond_6a
    :goto_3b
    invoke-static {}, Lx9;->ε()Z

    .line 2448
    .line 2449
    .line 2450
    move-result v0

    .line 2451
    sget-object v7, Lct;->α:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2452
    .line 2453
    sget-object v7, Lct;->α:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2454
    .line 2455
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 2456
    .line 2457
    .line 2458
    move-result v7

    .line 2459
    if-ltz v7, :cond_6b

    .line 2460
    .line 2461
    if-ge v7, v9, :cond_6b

    .line 2462
    .line 2463
    add-int/2addr v7, v12

    .line 2464
    goto :goto_3c

    .line 2465
    :cond_6b
    const/4 v7, 0x0

    .line 2466
    :goto_3c
    new-instance v18, Lj71;

    .line 2467
    .line 2468
    if-eqz v0, :cond_6d

    .line 2469
    .line 2470
    if-lez v7, :cond_6c

    .line 2471
    .line 2472
    const-string v14, "\u9501\u5b9a\uff1a"

    .line 2473
    .line 2474
    const-string v15, "\u70b9"

    .line 2475
    .line 2476
    invoke-static {v14, v7, v15}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 2477
    .line 2478
    .line 2479
    move-result-object v7

    .line 2480
    :goto_3d
    move-object/from16 v20, v7

    .line 2481
    .line 2482
    goto :goto_3e

    .line 2483
    :cond_6c
    const-string v7, "\u968f\u673a\u6a21\u5f0f"

    .line 2484
    .line 2485
    goto :goto_3d

    .line 2486
    :cond_6d
    move-object/from16 v20, v4

    .line 2487
    .line 2488
    :goto_3e
    sget-object v7, Lq71;->γ:Lxx;

    .line 2489
    .line 2490
    if-eqz v0, :cond_6f

    .line 2491
    .line 2492
    if-eqz v7, :cond_6e

    .line 2493
    .line 2494
    iget-object v7, v7, Lxx;->π:Ljava/lang/String;

    .line 2495
    .line 2496
    :goto_3f
    move-object/from16 v23, v7

    .line 2497
    .line 2498
    goto :goto_40

    .line 2499
    :cond_6e
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2500
    .line 2501
    .line 2502
    throw v16

    .line 2503
    :cond_6f
    if-eqz v7, :cond_9e

    .line 2504
    .line 2505
    invoke-virtual {v7}, Lxx;->δ()Ljava/lang/String;

    .line 2506
    .line 2507
    .line 2508
    move-result-object v7

    .line 2509
    goto :goto_3f

    .line 2510
    :goto_40
    sget-object v7, Lq71;->γ:Lxx;

    .line 2511
    .line 2512
    if-eqz v0, :cond_71

    .line 2513
    .line 2514
    if-eqz v7, :cond_70

    .line 2515
    .line 2516
    iget-object v7, v7, Lxx;->ο:Ljava/lang/String;

    .line 2517
    .line 2518
    :goto_41
    move-object/from16 v24, v7

    .line 2519
    .line 2520
    goto :goto_42

    .line 2521
    :cond_70
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2522
    .line 2523
    .line 2524
    throw v16

    .line 2525
    :cond_71
    if-eqz v7, :cond_9d

    .line 2526
    .line 2527
    invoke-virtual {v7}, Lxx;->γ()Ljava/lang/String;

    .line 2528
    .line 2529
    .line 2530
    move-result-object v7

    .line 2531
    goto :goto_41

    .line 2532
    :goto_42
    xor-int/lit8 v25, v0, 0x1

    .line 2533
    .line 2534
    new-instance v7, Ld71;

    .line 2535
    .line 2536
    invoke-direct {v7, v0, v1, v12}, Ld71;-><init>(ZLandroid/app/Activity;I)V

    .line 2537
    .line 2538
    .line 2539
    const/16 v28, 0x0

    .line 2540
    .line 2541
    const/16 v29, 0xf00

    .line 2542
    .line 2543
    const-string v19, "\u9ab0\u5b50\u63a7\u5236"

    .line 2544
    .line 2545
    const/16 v21, 0x0

    .line 2546
    .line 2547
    const v22, 0x7f0800a4

    .line 2548
    .line 2549
    .line 2550
    const/16 v27, 0x0

    .line 2551
    .line 2552
    move-object/from16 v26, v7

    .line 2553
    .line 2554
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2555
    .line 2556
    .line 2557
    move-object/from16 v0, v18

    .line 2558
    .line 2559
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2560
    .line 2561
    .line 2562
    invoke-static {}, Lx9;->β()Z

    .line 2563
    .line 2564
    .line 2565
    move-result v0

    .line 2566
    if-eqz v0, :cond_72

    .line 2567
    .line 2568
    const-string v7, "\u7b5b\u9009\u5e76\u6279\u91cf\u5220\u9664\u670d\u52a1\u7aef\u5355\u804a\u4f1a\u8bdd"

    .line 2569
    .line 2570
    move-object/from16 v20, v7

    .line 2571
    .line 2572
    goto :goto_43

    .line 2573
    :cond_72
    move-object/from16 v20, v5

    .line 2574
    .line 2575
    :goto_43
    sget-object v7, Lq71;->γ:Lxx;

    .line 2576
    .line 2577
    if-eqz v0, :cond_74

    .line 2578
    .line 2579
    if-eqz v7, :cond_73

    .line 2580
    .line 2581
    iget-object v7, v7, Lxx;->σ:Ljava/lang/String;

    .line 2582
    .line 2583
    :goto_44
    move-object/from16 v23, v7

    .line 2584
    .line 2585
    goto :goto_45

    .line 2586
    :cond_73
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2587
    .line 2588
    .line 2589
    throw v16

    .line 2590
    :cond_74
    if-eqz v7, :cond_9c

    .line 2591
    .line 2592
    invoke-virtual {v7}, Lxx;->δ()Ljava/lang/String;

    .line 2593
    .line 2594
    .line 2595
    move-result-object v7

    .line 2596
    goto :goto_44

    .line 2597
    :goto_45
    sget-object v7, Lq71;->γ:Lxx;

    .line 2598
    .line 2599
    if-eqz v0, :cond_76

    .line 2600
    .line 2601
    if-eqz v7, :cond_75

    .line 2602
    .line 2603
    iget-object v7, v7, Lxx;->ρ:Ljava/lang/String;

    .line 2604
    .line 2605
    :goto_46
    move-object/from16 v24, v7

    .line 2606
    .line 2607
    goto :goto_47

    .line 2608
    :cond_75
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2609
    .line 2610
    .line 2611
    throw v16

    .line 2612
    :cond_76
    if-eqz v7, :cond_9b

    .line 2613
    .line 2614
    invoke-virtual {v7}, Lxx;->γ()Ljava/lang/String;

    .line 2615
    .line 2616
    .line 2617
    move-result-object v7

    .line 2618
    goto :goto_46

    .line 2619
    :goto_47
    xor-int/lit8 v25, v0, 0x1

    .line 2620
    .line 2621
    new-instance v18, Lj71;

    .line 2622
    .line 2623
    new-instance v0, Le71;

    .line 2624
    .line 2625
    invoke-direct {v0, v1, v6}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 2626
    .line 2627
    .line 2628
    const/16 v28, 0x0

    .line 2629
    .line 2630
    const/16 v29, 0xb00

    .line 2631
    .line 2632
    const-string v19, "\u6279\u91cf\u5220\u9664\u4f1a\u8bdd"

    .line 2633
    .line 2634
    const/16 v21, 0x0

    .line 2635
    .line 2636
    const v22, 0x7f08008b

    .line 2637
    .line 2638
    .line 2639
    const/16 v27, 0x0

    .line 2640
    .line 2641
    move-object/from16 v26, v0

    .line 2642
    .line 2643
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2644
    .line 2645
    .line 2646
    move-object/from16 v0, v18

    .line 2647
    .line 2648
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2649
    .line 2650
    .line 2651
    invoke-static {}, Lx9;->γ()Z

    .line 2652
    .line 2653
    .line 2654
    move-result v0

    .line 2655
    if-eqz v0, :cond_77

    .line 2656
    .line 2657
    const-string v6, "\u67e5\u770b\u5e76\u901a\u8fc7\u5f85\u5ba1\u6838\u7684\u5165\u7fa4\u7533\u8bf7"

    .line 2658
    .line 2659
    move-object/from16 v20, v6

    .line 2660
    .line 2661
    goto :goto_48

    .line 2662
    :cond_77
    move-object/from16 v20, v5

    .line 2663
    .line 2664
    :goto_48
    sget-object v6, Lq71;->γ:Lxx;

    .line 2665
    .line 2666
    if-eqz v0, :cond_79

    .line 2667
    .line 2668
    if-eqz v6, :cond_78

    .line 2669
    .line 2670
    iget-object v6, v6, Lxx;->κ:Ljava/lang/String;

    .line 2671
    .line 2672
    :goto_49
    move-object/from16 v23, v6

    .line 2673
    .line 2674
    goto :goto_4a

    .line 2675
    :cond_78
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2676
    .line 2677
    .line 2678
    throw v16

    .line 2679
    :cond_79
    if-eqz v6, :cond_9a

    .line 2680
    .line 2681
    invoke-virtual {v6}, Lxx;->δ()Ljava/lang/String;

    .line 2682
    .line 2683
    .line 2684
    move-result-object v6

    .line 2685
    goto :goto_49

    .line 2686
    :goto_4a
    sget-object v6, Lq71;->γ:Lxx;

    .line 2687
    .line 2688
    if-eqz v0, :cond_7b

    .line 2689
    .line 2690
    if-eqz v6, :cond_7a

    .line 2691
    .line 2692
    iget-object v6, v6, Lxx;->ι:Ljava/lang/String;

    .line 2693
    .line 2694
    :goto_4b
    move-object/from16 v24, v6

    .line 2695
    .line 2696
    goto :goto_4c

    .line 2697
    :cond_7a
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2698
    .line 2699
    .line 2700
    throw v16

    .line 2701
    :cond_7b
    if-eqz v6, :cond_99

    .line 2702
    .line 2703
    invoke-virtual {v6}, Lxx;->γ()Ljava/lang/String;

    .line 2704
    .line 2705
    .line 2706
    move-result-object v6

    .line 2707
    goto :goto_4b

    .line 2708
    :goto_4c
    xor-int/lit8 v25, v0, 0x1

    .line 2709
    .line 2710
    new-instance v18, Lj71;

    .line 2711
    .line 2712
    new-instance v0, Le71;

    .line 2713
    .line 2714
    invoke-direct {v0, v1, v9}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 2715
    .line 2716
    .line 2717
    const/16 v28, 0x0

    .line 2718
    .line 2719
    const/16 v29, 0xb00

    .line 2720
    .line 2721
    const-string v19, "\u7fa4\u7ba1\u7406"

    .line 2722
    .line 2723
    const/16 v21, 0x0

    .line 2724
    .line 2725
    const v22, 0x7f08009f

    .line 2726
    .line 2727
    .line 2728
    const/16 v27, 0x0

    .line 2729
    .line 2730
    move-object/from16 v26, v0

    .line 2731
    .line 2732
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2733
    .line 2734
    .line 2735
    move-object/from16 v0, v18

    .line 2736
    .line 2737
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2738
    .line 2739
    .line 2740
    const-string v0, "hidden_contact_operation_toggle_enabled"

    .line 2741
    .line 2742
    const/4 v7, 0x0

    .line 2743
    invoke-static {v0, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 2744
    .line 2745
    .line 2746
    move-result v0

    .line 2747
    if-eqz v0, :cond_86

    .line 2748
    .line 2749
    sget-object v0, Lbe0;->α:Lbe0;

    .line 2750
    .line 2751
    invoke-virtual {v0}, Lbe0;->δ()V

    .line 2752
    .line 2753
    .line 2754
    invoke-static {}, Lx9;->δ()Z

    .line 2755
    .line 2756
    .line 2757
    move-result v6

    .line 2758
    invoke-virtual {v0}, Lbe0;->ζ()Z

    .line 2759
    .line 2760
    .line 2761
    move-result v7

    .line 2762
    invoke-virtual {v0}, Lbe0;->θ()Z

    .line 2763
    .line 2764
    .line 2765
    move-result v9

    .line 2766
    invoke-virtual {v0}, Lbe0;->ξ()Ljava/util/List;

    .line 2767
    .line 2768
    .line 2769
    move-result-object v0

    .line 2770
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 2771
    .line 2772
    .line 2773
    move-result v0

    .line 2774
    new-instance v18, Lj71;

    .line 2775
    .line 2776
    if-eqz v9, :cond_7c

    .line 2777
    .line 2778
    const-string v14, "\u6062\u590d\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 2779
    .line 2780
    :goto_4d
    move-object/from16 v19, v14

    .line 2781
    .line 2782
    goto :goto_4e

    .line 2783
    :cond_7c
    const-string v14, "\u4e34\u65f6\u663e\u793a\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 2784
    .line 2785
    goto :goto_4d

    .line 2786
    :goto_4e
    if-nez v6, :cond_7d

    .line 2787
    .line 2788
    :goto_4f
    move-object/from16 v20, v5

    .line 2789
    .line 2790
    goto :goto_51

    .line 2791
    :cond_7d
    if-nez v7, :cond_7e

    .line 2792
    .line 2793
    const-string v5, "\u8bf7\u5148\u5728\u8bbe\u7f6e\u4e2d\u542f\u7528\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 2794
    .line 2795
    goto :goto_4f

    .line 2796
    :cond_7e
    const-string v5, " \u4f4d\u8054\u7cfb\u4eba\uff0c\u9000\u51fa\u6296\u97f3\u540e\u81ea\u52a8\u6062\u590d\u9690\u85cf"

    .line 2797
    .line 2798
    if-eqz v9, :cond_7f

    .line 2799
    .line 2800
    const-string v7, "\u5f53\u524d\u4e34\u65f6\u663e\u793a "

    .line 2801
    .line 2802
    :goto_50
    invoke-static {v7, v0, v5}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 2803
    .line 2804
    .line 2805
    move-result-object v5

    .line 2806
    goto :goto_4f

    .line 2807
    :cond_7f
    const-string v7, "\u4e34\u65f6\u663e\u793a\u540d\u5355\u4e2d\u7684 "

    .line 2808
    .line 2809
    goto :goto_50

    .line 2810
    :goto_51
    sget-object v0, Lq71;->γ:Lxx;

    .line 2811
    .line 2812
    if-eqz v6, :cond_81

    .line 2813
    .line 2814
    if-eqz v0, :cond_80

    .line 2815
    .line 2816
    iget-object v0, v0, Lxx;->π:Ljava/lang/String;

    .line 2817
    .line 2818
    :goto_52
    move-object/from16 v23, v0

    .line 2819
    .line 2820
    goto :goto_53

    .line 2821
    :cond_80
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2822
    .line 2823
    .line 2824
    throw v16

    .line 2825
    :cond_81
    if-eqz v0, :cond_85

    .line 2826
    .line 2827
    invoke-virtual {v0}, Lxx;->δ()Ljava/lang/String;

    .line 2828
    .line 2829
    .line 2830
    move-result-object v0

    .line 2831
    goto :goto_52

    .line 2832
    :goto_53
    sget-object v0, Lq71;->γ:Lxx;

    .line 2833
    .line 2834
    if-eqz v6, :cond_83

    .line 2835
    .line 2836
    if-eqz v0, :cond_82

    .line 2837
    .line 2838
    iget-object v0, v0, Lxx;->ο:Ljava/lang/String;

    .line 2839
    .line 2840
    :goto_54
    move-object/from16 v24, v0

    .line 2841
    .line 2842
    goto :goto_55

    .line 2843
    :cond_82
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2844
    .line 2845
    .line 2846
    throw v16

    .line 2847
    :cond_83
    if-eqz v0, :cond_84

    .line 2848
    .line 2849
    invoke-virtual {v0}, Lxx;->γ()Ljava/lang/String;

    .line 2850
    .line 2851
    .line 2852
    move-result-object v0

    .line 2853
    goto :goto_54

    .line 2854
    :goto_55
    xor-int/lit8 v25, v6, 0x1

    .line 2855
    .line 2856
    new-instance v0, Le71;

    .line 2857
    .line 2858
    invoke-direct {v0, v1, v10}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 2859
    .line 2860
    .line 2861
    const/16 v28, 0x0

    .line 2862
    .line 2863
    const/16 v29, 0xf00

    .line 2864
    .line 2865
    const/16 v21, 0x1

    .line 2866
    .line 2867
    const v22, 0x7f0800a1

    .line 2868
    .line 2869
    .line 2870
    const/16 v27, 0x0

    .line 2871
    .line 2872
    move-object/from16 v26, v0

    .line 2873
    .line 2874
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2875
    .line 2876
    .line 2877
    move-object/from16 v0, v18

    .line 2878
    .line 2879
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2880
    .line 2881
    .line 2882
    goto :goto_56

    .line 2883
    :cond_84
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2884
    .line 2885
    .line 2886
    throw v16

    .line 2887
    :cond_85
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2888
    .line 2889
    .line 2890
    throw v16

    .line 2891
    :cond_86
    :goto_56
    invoke-static {}, Lx9;->ε()Z

    .line 2892
    .line 2893
    .line 2894
    move-result v0

    .line 2895
    new-instance v18, Lj71;

    .line 2896
    .line 2897
    sget-object v5, Lq71;->γ:Lxx;

    .line 2898
    .line 2899
    if-eqz v0, :cond_88

    .line 2900
    .line 2901
    if-eqz v5, :cond_87

    .line 2902
    .line 2903
    iget-object v5, v5, Lxx;->υ:Ljava/lang/String;

    .line 2904
    .line 2905
    :goto_57
    move-object/from16 v23, v5

    .line 2906
    .line 2907
    goto :goto_58

    .line 2908
    :cond_87
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2909
    .line 2910
    .line 2911
    throw v16

    .line 2912
    :cond_88
    if-eqz v5, :cond_98

    .line 2913
    .line 2914
    invoke-virtual {v5}, Lxx;->δ()Ljava/lang/String;

    .line 2915
    .line 2916
    .line 2917
    move-result-object v5

    .line 2918
    goto :goto_57

    .line 2919
    :goto_58
    sget-object v5, Lq71;->γ:Lxx;

    .line 2920
    .line 2921
    if-eqz v0, :cond_8a

    .line 2922
    .line 2923
    if-eqz v5, :cond_89

    .line 2924
    .line 2925
    iget-object v5, v5, Lxx;->τ:Ljava/lang/String;

    .line 2926
    .line 2927
    :goto_59
    move-object/from16 v24, v5

    .line 2928
    .line 2929
    goto :goto_5a

    .line 2930
    :cond_89
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2931
    .line 2932
    .line 2933
    throw v16

    .line 2934
    :cond_8a
    if-eqz v5, :cond_97

    .line 2935
    .line 2936
    invoke-virtual {v5}, Lxx;->γ()Ljava/lang/String;

    .line 2937
    .line 2938
    .line 2939
    move-result-object v5

    .line 2940
    goto :goto_59

    .line 2941
    :goto_5a
    xor-int/lit8 v25, v0, 0x1

    .line 2942
    .line 2943
    new-instance v5, Ld71;

    .line 2944
    .line 2945
    invoke-direct {v5, v0, v1, v2}, Ld71;-><init>(ZLandroid/app/Activity;I)V

    .line 2946
    .line 2947
    .line 2948
    const/16 v28, 0x0

    .line 2949
    .line 2950
    const/16 v29, 0xf00

    .line 2951
    .line 2952
    const-string v19, "\u4e00\u952e\u5df2\u8bfb"

    .line 2953
    .line 2954
    const-string v20, "\u5c06\u6d88\u606f\u5217\u8868\u6240\u6709\u4f1a\u8bdd\u6807\u8bb0\u4e3a\u5df2\u8bfb"

    .line 2955
    .line 2956
    const/16 v21, 0x1

    .line 2957
    .line 2958
    const v22, 0x7f08009f

    .line 2959
    .line 2960
    .line 2961
    const/16 v27, 0x0

    .line 2962
    .line 2963
    move-object/from16 v26, v5

    .line 2964
    .line 2965
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 2966
    .line 2967
    .line 2968
    move-object/from16 v0, v18

    .line 2969
    .line 2970
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2971
    .line 2972
    .line 2973
    invoke-static {}, Lx9;->ε()Z

    .line 2974
    .line 2975
    .line 2976
    move-result v0

    .line 2977
    new-instance v18, Lj71;

    .line 2978
    .line 2979
    if-eqz v0, :cond_8b

    .line 2980
    .line 2981
    const-string v4, "\u652f\u6301 JSON / TXT\uff0c\u53ef\u9009\u62e9\u4fdd\u5b58\u76ee\u5f55"

    .line 2982
    .line 2983
    :cond_8b
    move-object/from16 v20, v4

    .line 2984
    .line 2985
    sget-object v2, Lq71;->γ:Lxx;

    .line 2986
    .line 2987
    if-eqz v0, :cond_8d

    .line 2988
    .line 2989
    if-eqz v2, :cond_8c

    .line 2990
    .line 2991
    invoke-virtual {v2}, Lxx;->ζ()Ljava/lang/String;

    .line 2992
    .line 2993
    .line 2994
    move-result-object v2

    .line 2995
    :goto_5b
    move-object/from16 v23, v2

    .line 2996
    .line 2997
    goto :goto_5c

    .line 2998
    :cond_8c
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 2999
    .line 3000
    .line 3001
    throw v16

    .line 3002
    :cond_8d
    if-eqz v2, :cond_96

    .line 3003
    .line 3004
    invoke-virtual {v2}, Lxx;->δ()Ljava/lang/String;

    .line 3005
    .line 3006
    .line 3007
    move-result-object v2

    .line 3008
    goto :goto_5b

    .line 3009
    :goto_5c
    sget-object v2, Lq71;->γ:Lxx;

    .line 3010
    .line 3011
    if-eqz v0, :cond_8f

    .line 3012
    .line 3013
    if-eqz v2, :cond_8e

    .line 3014
    .line 3015
    invoke-virtual {v2}, Lxx;->ε()Ljava/lang/String;

    .line 3016
    .line 3017
    .line 3018
    move-result-object v2

    .line 3019
    :goto_5d
    move-object/from16 v24, v2

    .line 3020
    .line 3021
    goto :goto_5e

    .line 3022
    :cond_8e
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3023
    .line 3024
    .line 3025
    throw v16

    .line 3026
    :cond_8f
    if-eqz v2, :cond_95

    .line 3027
    .line 3028
    invoke-virtual {v2}, Lxx;->γ()Ljava/lang/String;

    .line 3029
    .line 3030
    .line 3031
    move-result-object v2

    .line 3032
    goto :goto_5d

    .line 3033
    :goto_5e
    xor-int/lit8 v25, v0, 0x1

    .line 3034
    .line 3035
    new-instance v2, Ld71;

    .line 3036
    .line 3037
    invoke-direct {v2, v0, v1, v8}, Ld71;-><init>(ZLandroid/app/Activity;I)V

    .line 3038
    .line 3039
    .line 3040
    const/16 v28, 0x0

    .line 3041
    .line 3042
    const/16 v29, 0xf00

    .line 3043
    .line 3044
    const-string v19, "\u804a\u5929\u8bb0\u5f55\u5bfc\u51fa"

    .line 3045
    .line 3046
    const/16 v21, 0x0

    .line 3047
    .line 3048
    const v22, 0x7f08009b

    .line 3049
    .line 3050
    .line 3051
    const/16 v27, 0x0

    .line 3052
    .line 3053
    move-object/from16 v26, v2

    .line 3054
    .line 3055
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 3056
    .line 3057
    .line 3058
    move-object/from16 v0, v18

    .line 3059
    .line 3060
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3061
    .line 3062
    .line 3063
    invoke-static {}, Lx9;->κ()Z

    .line 3064
    .line 3065
    .line 3066
    move-result v0

    .line 3067
    if-nez v0, :cond_92

    .line 3068
    .line 3069
    new-instance v18, Lj71;

    .line 3070
    .line 3071
    sget-object v0, Lq71;->γ:Lxx;

    .line 3072
    .line 3073
    if-eqz v0, :cond_91

    .line 3074
    .line 3075
    iget-object v0, v0, Lxx;->σ:Ljava/lang/String;

    .line 3076
    .line 3077
    sget-object v2, Lq71;->γ:Lxx;

    .line 3078
    .line 3079
    if-eqz v2, :cond_90

    .line 3080
    .line 3081
    iget-object v2, v2, Lxx;->ρ:Ljava/lang/String;

    .line 3082
    .line 3083
    new-instance v4, Le71;

    .line 3084
    .line 3085
    invoke-direct {v4, v1, v11}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 3086
    .line 3087
    .line 3088
    const/16 v28, 0x0

    .line 3089
    .line 3090
    const/16 v29, 0xf40

    .line 3091
    .line 3092
    const-string v19, "\u83b7\u53d6\u5185\u6d4b\u7533\u8bf7\u7801"

    .line 3093
    .line 3094
    const-string v20, "\u53d1\u9001\u7ed9\u5f00\u53d1\u8005\u4ee5\u89e3\u9501\u6240\u6709\u529f\u80fd"

    .line 3095
    .line 3096
    const/16 v21, 0x0

    .line 3097
    .line 3098
    const v22, 0x7f08009f

    .line 3099
    .line 3100
    .line 3101
    const/16 v25, 0x0

    .line 3102
    .line 3103
    const/16 v27, 0x0

    .line 3104
    .line 3105
    move-object/from16 v23, v0

    .line 3106
    .line 3107
    move-object/from16 v24, v2

    .line 3108
    .line 3109
    move-object/from16 v26, v4

    .line 3110
    .line 3111
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 3112
    .line 3113
    .line 3114
    move-object/from16 v0, v18

    .line 3115
    .line 3116
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3117
    .line 3118
    .line 3119
    goto :goto_5f

    .line 3120
    :cond_90
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3121
    .line 3122
    .line 3123
    throw v16

    .line 3124
    :cond_91
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3125
    .line 3126
    .line 3127
    throw v16

    .line 3128
    :cond_92
    :goto_5f
    sget-object v0, Lq71;->γ:Lxx;

    .line 3129
    .line 3130
    if-eqz v0, :cond_94

    .line 3131
    .line 3132
    iget-object v2, v0, Lxx;->κ:Ljava/lang/String;

    .line 3133
    .line 3134
    if-eqz v0, :cond_93

    .line 3135
    .line 3136
    iget-object v0, v0, Lxx;->ι:Ljava/lang/String;

    .line 3137
    .line 3138
    new-instance v18, Lj71;

    .line 3139
    .line 3140
    new-instance v4, Le71;

    .line 3141
    .line 3142
    invoke-direct {v4, v1, v13}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 3143
    .line 3144
    .line 3145
    const/16 v28, 0x0

    .line 3146
    .line 3147
    const/16 v29, 0xf40

    .line 3148
    .line 3149
    const-string v19, "\u6a21\u5757\u8bbe\u7f6e"

    .line 3150
    .line 3151
    const-string v20, "\u914d\u7f6e DY Helper \u5404\u9879\u53c2\u6570"

    .line 3152
    .line 3153
    const/16 v21, 0x1

    .line 3154
    .line 3155
    const v22, 0x7f0800a3

    .line 3156
    .line 3157
    .line 3158
    const/16 v25, 0x0

    .line 3159
    .line 3160
    const/16 v27, 0x0

    .line 3161
    .line 3162
    move-object/from16 v24, v0

    .line 3163
    .line 3164
    move-object/from16 v23, v2

    .line 3165
    .line 3166
    move-object/from16 v26, v4

    .line 3167
    .line 3168
    invoke-direct/range {v18 .. v29}, Lj71;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZLp70;Lp70;Ljava/lang/String;I)V

    .line 3169
    .line 3170
    .line 3171
    move-object/from16 v0, v18

    .line 3172
    .line 3173
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3174
    .line 3175
    .line 3176
    return-object v3

    .line 3177
    :cond_93
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3178
    .line 3179
    .line 3180
    throw v16

    .line 3181
    :cond_94
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3182
    .line 3183
    .line 3184
    throw v16

    .line 3185
    :cond_95
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3186
    .line 3187
    .line 3188
    throw v16

    .line 3189
    :cond_96
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3190
    .line 3191
    .line 3192
    throw v16

    .line 3193
    :cond_97
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3194
    .line 3195
    .line 3196
    throw v16

    .line 3197
    :cond_98
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3198
    .line 3199
    .line 3200
    throw v16

    .line 3201
    :cond_99
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3202
    .line 3203
    .line 3204
    throw v16

    .line 3205
    :cond_9a
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3206
    .line 3207
    .line 3208
    throw v16

    .line 3209
    :cond_9b
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3210
    .line 3211
    .line 3212
    throw v16

    .line 3213
    :cond_9c
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3214
    .line 3215
    .line 3216
    throw v16

    .line 3217
    :cond_9d
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3218
    .line 3219
    .line 3220
    throw v16

    .line 3221
    :cond_9e
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3222
    .line 3223
    .line 3224
    throw v16

    .line 3225
    :cond_9f
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3226
    .line 3227
    .line 3228
    throw v16

    .line 3229
    :cond_a0
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3230
    .line 3231
    .line 3232
    throw v16

    .line 3233
    :cond_a1
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3234
    .line 3235
    .line 3236
    throw v16

    .line 3237
    :cond_a2
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3238
    .line 3239
    .line 3240
    throw v16

    .line 3241
    :cond_a3
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3242
    .line 3243
    .line 3244
    throw v16

    .line 3245
    :cond_a4
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3246
    .line 3247
    .line 3248
    throw v16

    .line 3249
    :cond_a5
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3250
    .line 3251
    .line 3252
    throw v16

    .line 3253
    :cond_a6
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3254
    .line 3255
    .line 3256
    throw v16

    .line 3257
    :cond_a7
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3258
    .line 3259
    .line 3260
    throw v16

    .line 3261
    :cond_a8
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3262
    .line 3263
    .line 3264
    throw v16

    .line 3265
    :cond_a9
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3266
    .line 3267
    .line 3268
    throw v16

    .line 3269
    :cond_aa
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3270
    .line 3271
    .line 3272
    throw v16

    .line 3273
    :cond_ab
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3274
    .line 3275
    .line 3276
    throw v16

    .line 3277
    :cond_ac
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3278
    .line 3279
    .line 3280
    throw v16

    .line 3281
    :cond_ad
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3282
    .line 3283
    .line 3284
    throw v16

    .line 3285
    :cond_ae
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3286
    .line 3287
    .line 3288
    throw v16

    .line 3289
    :cond_af
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3290
    .line 3291
    .line 3292
    throw v16

    .line 3293
    :cond_b0
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3294
    .line 3295
    .line 3296
    throw v16

    .line 3297
    :cond_b1
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3298
    .line 3299
    .line 3300
    throw v16

    .line 3301
    :cond_b2
    invoke-static/range {v17 .. v17}, Lln0;->и(Ljava/lang/String;)V

    .line 3302
    .line 3303
    .line 3304
    throw v16
.end method

.method public static δ(Landroid/app/Activity;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-static {p0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lq71;->γ:Lxx;

    .line 6
    .line 7
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    move-object v1, p0

    .line 16
    :cond_0
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->init(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    move-object v1, p0

    .line 28
    :cond_1
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->init(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 32
    .line 33
    invoke-static {}, Lb10;->τ()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {}, Lq71;->Ε()Lf8;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    sget-object v2, Ld72;->α:Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    check-cast v2, Ljava/lang/Iterable;

    .line 53
    .line 54
    invoke-static {v2}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 v2, 0x0

    .line 66
    :goto_0
    if-nez v2, :cond_4

    .line 67
    .line 68
    invoke-static {p0}, Lp91;->Α(Landroid/app/Activity;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    sget-object v2, Ljz;->ε:Ljz;

    .line 74
    .line 75
    :cond_4
    :goto_1
    invoke-static {v1, v2, v0, p0}, Lq71;->γ(Lf8;Ljava/util/List;ZLandroid/app/Activity;)Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method

.method public static ζ(Ljava/util/List;Z)Ljava/lang/String;
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "  (\u5185\u6d4b)"

    .line 7
    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string p0, "\u70b9\u51fb\u4e3b\u52a8\u83b7\u53d6\u5e76\u9009\u62e9\u4e0b\u8f7d \u00b7 \u957f\u6309\u8c03\u8bd5\u6293\u53d6"

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    move v3, v2

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move v3, v2

    .line 36
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_6

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lf8;

    .line 47
    .line 48
    iget-object v5, v4, Lf8;->ζ:Lh8;

    .line 49
    .line 50
    sget-object v6, Lh8;->η:Lh8;

    .line 51
    .line 52
    if-eq v5, v6, :cond_4

    .line 53
    .line 54
    invoke-virtual {v4}, Lf8;->λ()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    if-ltz v3, :cond_5

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_5
    invoke-static {}, Lyh;->ф()V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_6
    :goto_2
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_7

    .line 74
    .line 75
    move v4, v2

    .line 76
    goto :goto_4

    .line 77
    :cond_7
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    move v4, v2

    .line 82
    :cond_8
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_a

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Lf8;

    .line 93
    .line 94
    iget-object v5, v5, Lf8;->ζ:Lh8;

    .line 95
    .line 96
    sget-object v6, Lh8;->ε:Lh8;

    .line 97
    .line 98
    if-ne v5, v6, :cond_8

    .line 99
    .line 100
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    if-ltz v4, :cond_9

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_9
    invoke-static {}, Lyh;->ф()V

    .line 106
    .line 107
    .line 108
    throw v1

    .line 109
    :cond_a
    :goto_4
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_b

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_b
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :cond_c
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_e

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Lf8;

    .line 131
    .line 132
    iget-object v5, v5, Lf8;->ζ:Lh8;

    .line 133
    .line 134
    sget-object v6, Lh8;->ζ:Lh8;

    .line 135
    .line 136
    if-ne v5, v6, :cond_c

    .line 137
    .line 138
    add-int/lit8 v2, v2, 0x1

    .line 139
    .line 140
    if-ltz v2, :cond_d

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_d
    invoke-static {}, Lyh;->ф()V

    .line 144
    .line 145
    .line 146
    throw v1

    .line 147
    :cond_e
    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    new-instance v1, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v5, "\u70b9\u51fb\u4e3b\u52a8\u83b7\u53d6\u5e76\u9009\u62e9 \u00b7 \u957f\u6309\u8c03\u8bd5 \u00b7 \u5df2\u52a0\u8f7d "

    .line 159
    .line 160
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string p0, " \u4e2a"

    .line 167
    .line 168
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string p0, " \u00b7 "

    .line 179
    .line 180
    if-lez v3, :cond_f

    .line 181
    .line 182
    new-instance v1, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v3, " \u52a8\u56fe"

    .line 191
    .line 192
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    :cond_f
    if-lez v4, :cond_10

    .line 203
    .line 204
    new-instance v1, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const-string v3, " \u89c6\u9891"

    .line 213
    .line 214
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    :cond_10
    if-lez v2, :cond_11

    .line 225
    .line 226
    new-instance v1, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string p0, " \u56fe\u6587"

    .line 235
    .line 236
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    :cond_11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    return-object p0
.end method

.method public static final η(Ljava/util/LinkedHashSet;Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v0

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const-string p1, ""

    .line 17
    .line 18
    :cond_1
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_2
    :try_start_0
    sget-object v1, Lmf;->α:Ljava/nio/charset/Charset;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {p1, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    new-instance v2, Leo1;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    move-object v1, v2

    .line 44
    :goto_1
    instance-of v2, v1, Leo1;

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    move-object p1, v1

    .line 50
    :goto_2
    const-string v1, "https?://[^\\s\uff0c,]+"

    .line 51
    .line 52
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-object v2, p1

    .line 60
    check-cast v2, Ljava/lang/CharSequence;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-static {v1, v3, v2}, Lv71;->α(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lix0;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    iget-object v1, v1, Lix0;->α:Ljava/util/regex/Matcher;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    const/4 v2, 0x4

    .line 89
    new-array v2, v2, [C

    .line 90
    .line 91
    fill-array-data v2, :array_0

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v2}, Lq02;->Д(Ljava/lang/String;[C)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    move-object v1, p1

    .line 102
    check-cast v1, Ljava/lang/String;

    .line 103
    .line 104
    :goto_3
    const-string p1, "http"

    .line 105
    .line 106
    const/4 v2, 0x1

    .line 107
    invoke-static {v1, p1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_5

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_5
    invoke-static {v1}, Lq71;->π(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    const-string v0, "https://www.douyin.com/video/"

    .line 121
    .line 122
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    goto :goto_5

    .line 127
    :cond_6
    const-string p1, "v.douyin.com"

    .line 128
    .line 129
    invoke-static {v1, p1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_7

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_7
    const-string p1, "douyin.com"

    .line 137
    .line 138
    invoke-static {v1, p1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-eqz p1, :cond_8

    .line 143
    .line 144
    :goto_4
    move-object v0, v1

    .line 145
    :cond_8
    :goto_5
    if-nez v0, :cond_9

    .line 146
    .line 147
    return-void

    .line 148
    :cond_9
    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    nop

    .line 153
    :array_0
    .array-data 2
        0x2es
        0x3002s
        0x29s
        -0xf7s
    .end array-data
.end method

.method public static θ(Lf8;)Ljava/util/List;
    .locals 11

    .line 1
    iget-object v0, p0, Lf8;->δ:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Lq71;->φ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sget-object p0, Ljz;->ε:Ljz;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lf8;->Ο:Ljava/util/List;

    .line 22
    .line 23
    if-eqz p0, :cond_6

    .line 24
    .line 25
    new-instance v2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_4

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    move-object v4, v3

    .line 45
    check-cast v4, Lqu0;

    .line 46
    .line 47
    iget-object v5, v4, Lqu0;->β:Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_3

    .line 56
    .line 57
    :cond_2
    iget-object v4, v4, Lqu0;->ε:Ljava/util/List;

    .line 58
    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_6

    .line 81
    .line 82
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Lqu0;

    .line 87
    .line 88
    iget-object v3, v2, Lqu0;->γ:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v1, v3}, Lq71;->α(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v3, v2, Lqu0;->δ:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v1, v3}, Lq71;->α(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object v2, v2, Lqu0;->ζ:Ljava/util/List;

    .line 99
    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_5

    .line 111
    .line 112
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v1, v3}, Lq71;->α(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_6
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-eqz p0, :cond_7

    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_7
    new-instance p0, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :cond_8
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_d

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    move-object v3, v2

    .line 149
    check-cast v3, Ljava/lang/String;

    .line 150
    .line 151
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    const/4 v5, 0x0

    .line 156
    if-eqz v4, :cond_9

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_c

    .line 168
    .line 169
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    check-cast v6, Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-static {v6}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-static {v7, v6}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    const/4 v9, 0x1

    .line 196
    if-eqz v8, :cond_b

    .line 197
    .line 198
    move v6, v9

    .line 199
    goto :goto_3

    .line 200
    :cond_b
    const-string v8, "#"

    .line 201
    .line 202
    invoke-static {v7, v8, v7}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    const-string v10, "?"

    .line 207
    .line 208
    invoke-static {v7, v10, v7}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    invoke-static {v6, v8, v6}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-static {v6, v10, v6}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    :goto_3
    if-eqz v6, :cond_a

    .line 225
    .line 226
    move v5, v9

    .line 227
    :cond_c
    :goto_4
    if-nez v5, :cond_8

    .line 228
    .line 229
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_d
    return-object p0
.end method

.method public static ι(Lf8;Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf8;->ι:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    const-string v2, ""

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    move-object v0, v2

    .line 21
    :cond_1
    iget-object p0, p0, Lf8;->κ:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_2
    if-nez v1, :cond_3

    .line 34
    .line 35
    move-object v1, v2

    .line 36
    :cond_3
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-nez p0, :cond_4

    .line 41
    .line 42
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_4

    .line 47
    .line 48
    const-string p0, "uid="

    .line 49
    .line 50
    const-string v2, "\nsec_uid="

    .line 51
    .line 52
    invoke-static {p0, v0, v2, v1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    goto :goto_1

    .line 57
    :cond_4
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_5

    .line 62
    .line 63
    move-object v2, v0

    .line 64
    goto :goto_1

    .line 65
    :cond_5
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_6

    .line 70
    .line 71
    move-object v2, v1

    .line 72
    :cond_6
    :goto_1
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_7

    .line 77
    .line 78
    const-string p0, "\u5f53\u524d\u672a\u8bc6\u522b\u5230\u4e3b\u9875ID"

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    invoke-static {p1, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_7
    const-string p0, "\u4e3b\u9875ID\u5df2\u590d\u5236"

    .line 90
    .line 91
    invoke-static {p1, v2, p0}, Lq71;->κ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public static κ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "clipboard"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Landroid/content/ClipboardManager;

    .line 11
    .line 12
    const-string v1, "copy"

    .line 13
    .line 14
    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-static {p0, p2, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static λ(Lf8;)I
    .locals 12

    .line 1
    iget-object v0, p0, Lf8;->Ο:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_3

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    move-object v5, v4

    .line 27
    check-cast v5, Lqu0;

    .line 28
    .line 29
    iget-object v6, v5, Lqu0;->β:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_2

    .line 38
    .line 39
    :cond_1
    iget-object v5, v5, Lqu0;->ε:Ljava/util/List;

    .line 40
    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    new-instance v0, Ljava/util/HashSet;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v4, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_c

    .line 73
    .line 74
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    move-object v6, v5

    .line 79
    check-cast v6, Lqu0;

    .line 80
    .line 81
    iget-object v7, v6, Lqu0;->β:Ljava/lang/String;

    .line 82
    .line 83
    iget v8, v6, Lqu0;->α:I

    .line 84
    .line 85
    const-string v9, "http"

    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    if-eqz v7, :cond_6

    .line 89
    .line 90
    invoke-static {v7, v9, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-eqz v11, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move-object v7, v10

    .line 98
    :goto_2
    if-nez v7, :cond_b

    .line 99
    .line 100
    :cond_6
    iget-object v6, v6, Lqu0;->ε:Ljava/util/List;

    .line 101
    .line 102
    if-eqz v6, :cond_9

    .line 103
    .line 104
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_8

    .line 113
    .line 114
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    move-object v11, v7

    .line 119
    check-cast v11, Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {v11, v9, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    if-eqz v11, :cond_7

    .line 126
    .line 127
    move-object v10, v7

    .line 128
    :cond_8
    check-cast v10, Ljava/lang/String;

    .line 129
    .line 130
    :cond_9
    if-nez v10, :cond_a

    .line 131
    .line 132
    const-string v6, "page_"

    .line 133
    .line 134
    invoke-static {v6, v8}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    goto :goto_3

    .line 139
    :cond_a
    move-object v7, v10

    .line 140
    :cond_b
    :goto_3
    new-instance v6, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v8, "|"

    .line 149
    .line 150
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    if-eqz v6, :cond_4

    .line 165
    .line 166
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_c
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    goto :goto_4

    .line 175
    :cond_d
    move v0, v1

    .line 176
    :goto_4
    if-lez v0, :cond_e

    .line 177
    .line 178
    return v0

    .line 179
    :cond_e
    iget-object v0, p0, Lf8;->Η:Ljava/util/List;

    .line 180
    .line 181
    invoke-static {v0}, Lq71;->φ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-nez v3, :cond_f

    .line 190
    .line 191
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    return p0

    .line 196
    :cond_f
    invoke-virtual {p0}, Lf8;->ζ()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-eqz v0, :cond_10

    .line 201
    .line 202
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_11

    .line 207
    .line 208
    :cond_10
    iget-object p0, p0, Lf8;->Κ:Ljava/lang/String;

    .line 209
    .line 210
    if-eqz p0, :cond_12

    .line 211
    .line 212
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    if-eqz p0, :cond_11

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_11
    return v2

    .line 220
    :cond_12
    :goto_5
    return v1
.end method

.method public static μ(Landroid/view/View;)V
    .locals 1

    .line 1
    :goto_0
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v0, v0, Landroid/app/AlertDialog;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast p0, Landroid/app/AlertDialog;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    instance-of v0, p0, Landroid/view/View;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    check-cast p0, Landroid/view/View;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return-void
.end method

.method public static ν(Lf8;Landroid/app/Activity;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    iget-object v1, v0, Lf8;->ζ:Lh8;

    .line 6
    .line 7
    sget-object v2, Lh8;->η:Lh8;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lf8;->λ()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    :cond_0
    move v1, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v0}, Lf8;->ν()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    sget-object v1, Lqy0;->α:Lqy0;

    .line 28
    .line 29
    invoke-virtual {v1, v15, v0, v3}, Lqy0;->Π(Landroid/app/Activity;Lf8;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    invoke-virtual {v0}, Lf8;->κ()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    sget-object v1, Lqy0;->α:Lqy0;

    .line 40
    .line 41
    invoke-virtual {v1, v0, v15}, Lqy0;->Β(Lf8;Landroid/app/Activity;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_3
    const-string v0, "\u672a\u627e\u5230\u53ef\u4e0b\u8f7d\u7684\u4f5c\u54c1\u8d44\u6e90"

    .line 46
    .line 47
    invoke-static {v15, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :goto_0
    invoke-static {v0}, Lq71;->θ(Lf8;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iget-object v2, v0, Lf8;->θ:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v5, v0, Lf8;->Ρ:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_4

    .line 68
    .line 69
    move-object v15, v2

    .line 70
    move-object/from16 v16, v3

    .line 71
    .line 72
    move-object/from16 v17, v5

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    if-eqz v5, :cond_7

    .line 76
    .line 77
    new-instance v6, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    :cond_5
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-eqz v8, :cond_6

    .line 91
    .line 92
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    move-object v9, v8

    .line 97
    check-cast v9, Lg8;

    .line 98
    .line 99
    iget-object v9, v9, Lg8;->ι:Li8;

    .line 100
    .line 101
    if-nez v9, :cond_5

    .line 102
    .line 103
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_6
    move-object v12, v6

    .line 108
    goto :goto_2

    .line 109
    :cond_7
    move-object v12, v3

    .line 110
    :goto_2
    const v13, 0x3fffffd3    # 1.9999946f

    .line 111
    .line 112
    .line 113
    const/16 v14, 0x1e80

    .line 114
    .line 115
    move v6, v1

    .line 116
    const/4 v1, 0x0

    .line 117
    move-object v7, v2

    .line 118
    const/4 v2, 0x0

    .line 119
    move-object v8, v3

    .line 120
    const/4 v3, 0x0

    .line 121
    move-object v9, v5

    .line 122
    const/4 v5, 0x0

    .line 123
    move v10, v6

    .line 124
    const/4 v6, 0x0

    .line 125
    move-object v11, v7

    .line 126
    const/4 v7, 0x0

    .line 127
    move-object/from16 v16, v8

    .line 128
    .line 129
    const/4 v8, 0x0

    .line 130
    move-object/from16 v17, v9

    .line 131
    .line 132
    const/4 v9, 0x0

    .line 133
    move/from16 v18, v10

    .line 134
    .line 135
    const/4 v10, 0x0

    .line 136
    move-object/from16 v19, v11

    .line 137
    .line 138
    const/4 v11, 0x0

    .line 139
    move-object/from16 v15, v19

    .line 140
    .line 141
    invoke-static/range {v0 .. v14}, Lf8;->γ(Lf8;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;II)Lf8;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    :goto_3
    if-eqz v3, :cond_8

    .line 146
    .line 147
    iget-object v0, v3, Lf8;->δ:Ljava/util/List;

    .line 148
    .line 149
    if-eqz v0, :cond_8

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    move v0, v4

    .line 156
    goto :goto_4

    .line 157
    :cond_8
    const/4 v0, 0x0

    .line 158
    :goto_4
    invoke-static/range {p0 .. p0}, Lq71;->λ(Lf8;)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    const-string v2, ", awemeId="

    .line 163
    .line 164
    const/16 v18, 0x1

    .line 165
    .line 166
    if-eqz v3, :cond_9

    .line 167
    .line 168
    if-lez v0, :cond_9

    .line 169
    .line 170
    new-instance v4, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-string v5, "DYHelper: [LIVEPHOTO-MIXED] \u4e0b\u8f7d\u9759\u6001\u56fe\u7247 count="

    .line 173
    .line 174
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-static {v4}, Lux;->ρ(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    sget-object v4, Lqy0;->α:Lqy0;

    .line 194
    .line 195
    move-object/from16 v5, p1

    .line 196
    .line 197
    invoke-virtual {v4, v3, v5}, Lqy0;->Β(Lf8;Landroid/app/Activity;)V

    .line 198
    .line 199
    .line 200
    move/from16 v4, v18

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_9
    move-object/from16 v5, p1

    .line 204
    .line 205
    const/4 v4, 0x0

    .line 206
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lf8;->μ()Z

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-nez v3, :cond_b

    .line 211
    .line 212
    if-lez v1, :cond_a

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_a
    move/from16 v20, v0

    .line 216
    .line 217
    move/from16 v21, v1

    .line 218
    .line 219
    move/from16 v18, v4

    .line 220
    .line 221
    move-object v15, v5

    .line 222
    goto/16 :goto_d

    .line 223
    .line 224
    :cond_b
    :goto_6
    new-instance v3, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    const-string v4, "DYHelper: [LIVEPHOTO-MIXED] \u4e0b\u8f7d\u52a8\u56fe count="

    .line 227
    .line 228
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-static {v2}, Lux;->ρ(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    sget-object v15, Lqy0;->α:Lqy0;

    .line 248
    .line 249
    if-lez v0, :cond_f

    .line 250
    .line 251
    if-eqz v17, :cond_e

    .line 252
    .line 253
    new-instance v3, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    :cond_c
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    if-eqz v4, :cond_d

    .line 267
    .line 268
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    move-object v6, v4

    .line 273
    check-cast v6, Lg8;

    .line 274
    .line 275
    iget-object v6, v6, Lg8;->ι:Li8;

    .line 276
    .line 277
    if-eqz v6, :cond_c

    .line 278
    .line 279
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_d
    move-object v12, v3

    .line 284
    goto :goto_8

    .line 285
    :cond_e
    move-object/from16 v12, v16

    .line 286
    .line 287
    :goto_8
    const/16 v13, -0x9

    .line 288
    .line 289
    const/16 v14, 0x1ed3

    .line 290
    .line 291
    move v2, v1

    .line 292
    const/4 v1, 0x0

    .line 293
    move v3, v2

    .line 294
    const/4 v2, 0x0

    .line 295
    move v4, v3

    .line 296
    const/4 v3, 0x0

    .line 297
    move v6, v4

    .line 298
    const/4 v4, 0x0

    .line 299
    const/4 v5, 0x0

    .line 300
    move v7, v6

    .line 301
    const/4 v6, 0x0

    .line 302
    move v8, v7

    .line 303
    const/4 v7, 0x0

    .line 304
    move v9, v8

    .line 305
    const/4 v8, 0x0

    .line 306
    move v10, v9

    .line 307
    const/4 v9, 0x0

    .line 308
    move v11, v10

    .line 309
    const/4 v10, 0x0

    .line 310
    move/from16 v16, v11

    .line 311
    .line 312
    const/4 v11, 0x0

    .line 313
    move/from16 v20, v0

    .line 314
    .line 315
    move-object/from16 v17, v15

    .line 316
    .line 317
    move/from16 v21, v16

    .line 318
    .line 319
    move-object/from16 v0, p0

    .line 320
    .line 321
    move-object/from16 v15, p1

    .line 322
    .line 323
    invoke-static/range {v0 .. v14}, Lf8;->γ(Lf8;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;II)Lf8;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    move-object v2, v0

    .line 328
    goto :goto_9

    .line 329
    :cond_f
    move/from16 v20, v0

    .line 330
    .line 331
    move/from16 v21, v1

    .line 332
    .line 333
    move-object/from16 v17, v15

    .line 334
    .line 335
    move-object v15, v5

    .line 336
    move-object/from16 v2, p0

    .line 337
    .line 338
    :goto_9
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, Lf8;->λ()Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    if-nez v0, :cond_10

    .line 346
    .line 347
    const-string v0, "\u5f53\u524d\u4f5c\u54c1\u4e0d\u662f\u52a8\u56fe / LivePhoto"

    .line 348
    .line 349
    invoke-static {v15, v0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    goto/16 :goto_d

    .line 353
    .line 354
    :cond_10
    invoke-static {v15}, Lyh;->у(Landroid/content/Context;)Liu;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    iget-object v1, v0, Liu;->β:Ljava/lang/String;

    .line 359
    .line 360
    if-eqz v1, :cond_12

    .line 361
    .line 362
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    if-eqz v1, :cond_11

    .line 367
    .line 368
    goto :goto_a

    .line 369
    :cond_11
    invoke-virtual {v0}, Liu;->α()Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-nez v0, :cond_12

    .line 374
    .line 375
    const-string v0, "DYHelper"

    .line 376
    .line 377
    const-string v1, "[DOWNLOAD-STORAGE] \u5f53\u524d\u7a7a\u95f4\u65e0\u53ef\u7528 SAF \u6388\u6743\uff0c\u6539\u7528 MediaStore"

    .line 378
    .line 379
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    :cond_12
    :goto_a
    invoke-static {v15}, Lqy0;->я(Landroid/content/Context;)Z

    .line 383
    .line 384
    .line 385
    move-result v7

    .line 386
    invoke-static {}, Lqy0;->г()Llu;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-static {v2, v0}, Lkn0;->π(Lf8;Llu;)Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    invoke-static {v2}, Lkn0;->ι(Lf8;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-static {v2}, Lqy0;->θ(Lf8;)Ljava/util/List;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-static {v2}, Lqy0;->ε(Lf8;)Ljava/util/List;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    if-eqz v7, :cond_13

    .line 407
    .line 408
    invoke-static {v2}, Lqy0;->η(Lf8;)Ljava/util/List;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    :goto_b
    move-object v8, v1

    .line 413
    goto :goto_c

    .line 414
    :cond_13
    sget-object v1, Ljz;->ε:Ljz;

    .line 415
    .line 416
    goto :goto_b

    .line 417
    :goto_c
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    if-eqz v1, :cond_15

    .line 422
    .line 423
    if-eqz v0, :cond_14

    .line 424
    .line 425
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_15

    .line 430
    .line 431
    :cond_14
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-eqz v0, :cond_15

    .line 436
    .line 437
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v0, :cond_15

    .line 442
    .line 443
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-eqz v0, :cond_15

    .line 448
    .line 449
    new-instance v0, Lzk0;

    .line 450
    .line 451
    const/4 v1, 0x3

    .line 452
    invoke-direct {v0, v15, v2, v1}, Lzk0;-><init>(Landroid/app/Activity;Lf8;I)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v15, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 456
    .line 457
    .line 458
    goto :goto_d

    .line 459
    :cond_15
    sget-object v0, Ljy0;->ι:Ljy0;

    .line 460
    .line 461
    invoke-static {v15, v2}, Lqy0;->ζ(Landroid/content/Context;Lf8;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    move-object/from16 v6, v17

    .line 466
    .line 467
    invoke-static {v6, v15, v2, v0, v1}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    iget-object v9, v1, Lfv;->β:Ljava/lang/String;

    .line 472
    .line 473
    new-instance v0, Lay0;

    .line 474
    .line 475
    move-object v6, v15

    .line 476
    invoke-direct/range {v0 .. v8}, Lay0;-><init>(Lfv;Lf8;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroid/app/Activity;ZLjava/util/List;)V

    .line 477
    .line 478
    .line 479
    const-string v1, "\u786e\u8ba4 LivePhoto \u6587\u4ef6\u540d"

    .line 480
    .line 481
    const-string v2, "\u5408\u5e76\u3001\u539f\u59cb\u8d44\u6e90\u548c\u5931\u8d25\u964d\u7ea7\u6587\u4ef6\u90fd\u4f1a\u4f7f\u7528\u6b64\u540d\u79f0\u4f5c\u4e3a\u524d\u7f00\u3002"

    .line 482
    .line 483
    invoke-static {v15, v1, v2, v9, v0}, Lqy0;->ρ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)V

    .line 484
    .line 485
    .line 486
    :goto_d
    if-nez v18, :cond_16

    .line 487
    .line 488
    const-string v0, "\u672a\u627e\u5230\u53ef\u4e0b\u8f7d\u7684\u56fe\u7247\u6216\u52a8\u56fe\u8d44\u6e90"

    .line 489
    .line 490
    const/4 v1, 0x0

    .line 491
    invoke-static {v15, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 496
    .line 497
    .line 498
    return-void

    .line 499
    :cond_16
    move/from16 v4, v20

    .line 500
    .line 501
    const/4 v1, 0x0

    .line 502
    if-lez v4, :cond_17

    .line 503
    .line 504
    move/from16 v2, v21

    .line 505
    .line 506
    if-lez v2, :cond_17

    .line 507
    .line 508
    const-string v0, " \u5f20\u56fe\u7247 + "

    .line 509
    .line 510
    const-string v3, " \u4e2a\u52a8\u56fe"

    .line 511
    .line 512
    const-string v5, "\u5df2\u5f00\u59cb\u4e0b\u8f7d "

    .line 513
    .line 514
    invoke-static {v5, v4, v0, v2, v3}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-static {v15, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 523
    .line 524
    .line 525
    :cond_17
    return-void
.end method

.method public static ξ(Landroid/app/Activity;I)I
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    float-to-int p0, p0

    .line 16
    return p0
.end method

.method public static ο(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Lxx0;

    .line 19
    .line 20
    const/4 v1, 0x6

    .line 21
    invoke-direct {v0, p0, p1, v1}, Lxx0;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_f

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_1
    sget-object v0, Lq71;->ζ:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const/4 v2, 0x0

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    move-object v3, v1

    .line 60
    check-cast v3, Ln71;

    .line 61
    .line 62
    iget-object v3, v3, Ln71;->α:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    move-object v1, v2

    .line 72
    :goto_0
    check-cast v1, Ln71;

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    if-nez v1, :cond_4

    .line 76
    .line 77
    const-string v1, "DYHelper: \u5206\u4eab\u9762\u677f\u5feb\u6377\u64cd\u4f5c\u4e0d\u5b58\u5728 id="

    .line 78
    .line 79
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Lux;->ρ(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string p1, "\u8be5\u5feb\u6377\u64cd\u4f5c\u5df2\u4e0d\u53ef\u7528"

    .line 87
    .line 88
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_4
    iget-object v1, v1, Ln71;->β:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    const-string v4, "DYHelper"

    .line 103
    .line 104
    sget-object v5, Ljz;->ε:Ljz;

    .line 105
    .line 106
    if-nez v3, :cond_8

    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_5

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_5
    :try_start_0
    invoke-static {p0}, Lq71;->δ(Landroid/app/Activity;)Ljava/util/ArrayList;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    new-instance v6, Lf7;

    .line 120
    .line 121
    const/4 v7, 0x1

    .line 122
    invoke-direct {v6, v7, v3}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object v3, Lp71;->ζ:Lp71;

    .line 126
    .line 127
    new-instance v7, Ly30;

    .line 128
    .line 129
    const/4 v8, 0x1

    .line 130
    invoke-direct {v7, v6, v8, v3}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 131
    .line 132
    .line 133
    new-instance v3, Lf71;

    .line 134
    .line 135
    const/4 v6, 0x0

    .line 136
    invoke-direct {v3, v6}, Lf71;-><init>(I)V

    .line 137
    .line 138
    .line 139
    new-instance v6, Lt52;

    .line 140
    .line 141
    invoke-direct {v6, v7, v3}, Lt52;-><init>(Lss1;La80;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v6}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    goto :goto_1

    .line 149
    :catchall_0
    move-exception v3

    .line 150
    new-instance v6, Leo1;

    .line 151
    .line 152
    invoke-direct {v6, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    move-object v3, v6

    .line 156
    :goto_1
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    if-eqz v6, :cond_6

    .line 161
    .line 162
    const-string v7, "\u6784\u5efa\u5206\u4eab\u9762\u677f\u5feb\u6377\u52a8\u4f5c\u5931\u8d25"

    .line 163
    .line 164
    invoke-static {v4, v7, v6}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    :cond_6
    instance-of v6, v3, Leo1;

    .line 168
    .line 169
    if-eqz v6, :cond_7

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_7
    move-object v5, v3

    .line 173
    :goto_2
    check-cast v5, Ljava/util/List;

    .line 174
    .line 175
    :cond_8
    :goto_3
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_a

    .line 184
    .line 185
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    move-object v6, v5

    .line 190
    check-cast v6, Lm71;

    .line 191
    .line 192
    iget-object v6, v6, Lm71;->α:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v6, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-eqz v6, :cond_9

    .line 199
    .line 200
    move-object v2, v5

    .line 201
    :cond_a
    check-cast v2, Lm71;

    .line 202
    .line 203
    if-nez v2, :cond_b

    .line 204
    .line 205
    const-string p1, "\u5f53\u524d\u9875\u9762\u6682\u4e0d\u652f\u6301"

    .line 206
    .line 207
    invoke-static {v0, p0, p1, v1}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_b
    iget-boolean v1, v2, Lm71;->η:Z

    .line 212
    .line 213
    if-nez v1, :cond_d

    .line 214
    .line 215
    iget-object p1, v2, Lm71;->θ:Ljava/lang/String;

    .line 216
    .line 217
    if-nez p1, :cond_c

    .line 218
    .line 219
    iget-object p1, v2, Lm71;->γ:Ljava/lang/String;

    .line 220
    .line 221
    :cond_c
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :cond_d
    iget-object v1, v2, Lm71;->ι:Lp70;

    .line 230
    .line 231
    :try_start_1
    invoke-interface {v1}, Lp70;->invoke()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 235
    goto :goto_4

    .line 236
    :catchall_1
    move-exception v1

    .line 237
    new-instance v2, Leo1;

    .line 238
    .line 239
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    move-object v1, v2

    .line 243
    :goto_4
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    if-eqz v1, :cond_e

    .line 248
    .line 249
    const-string v2, "\u6267\u884c\u5206\u4eab\u9762\u677f\u5feb\u6377\u64cd\u4f5c\u5931\u8d25 id="

    .line 250
    .line 251
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-static {v4, p1, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    const-string p1, "\u64cd\u4f5c\u6267\u884c\u5931\u8d25"

    .line 259
    .line 260
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 265
    .line 266
    .line 267
    :cond_e
    return-void

    .line 268
    :cond_f
    :goto_5
    const-string p0, "DYHelper: \u5206\u4eab\u9762\u677f\u5feb\u6377\u64cd\u4f5c\u5df2\u8df3\u8fc7: Activity \u5df2\u7ed3\u675f, id="

    .line 269
    .line 270
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    return-void
.end method

.method public static π(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v0

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, ""

    .line 17
    .line 18
    :cond_1
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    new-instance v1, Lym1;

    .line 26
    .line 27
    const-string v2, "/(?:video|note)/(\\d{10,})"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Lym1;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lym1;

    .line 33
    .line 34
    const-string v3, "/(?:share/video|share/note)/(\\d{10,})"

    .line 35
    .line 36
    invoke-direct {v2, v3}, Lym1;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v3, Lym1;

    .line 40
    .line 41
    const-string v4, "[?&](?:aweme_id|item_id|modal_id)=(\\d{10,})"

    .line 42
    .line 43
    invoke-direct {v3, v4}, Lym1;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    filled-new-array {v1, v2, v3}, [Lym1;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lym1;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v2, v2, Lym1;->ε:Ljava/util/regex/Pattern;

    .line 74
    .line 75
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    invoke-static {v2, v3, p0}, Lv71;->α(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lix0;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    invoke-virtual {v2}, Lix0;->α()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const/4 v3, 0x1

    .line 94
    invoke-static {v3, v2}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Ljava/lang/String;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    move-object v2, v0

    .line 102
    :goto_1
    if-eqz v2, :cond_3

    .line 103
    .line 104
    return-object v2

    .line 105
    :cond_5
    :goto_2
    return-object v0
.end method

.method public static ρ(Ljava/util/List;)Ll71;
    .locals 20

    .line 1
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_16

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    const-string v3, ""

    .line 18
    .line 19
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    :goto_0
    const/4 v2, 0x0

    .line 34
    goto/16 :goto_e

    .line 35
    .line 36
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    new-instance v5, Ll91;

    .line 45
    .line 46
    const-string v6, "url"

    .line 47
    .line 48
    invoke-direct {v5, v6, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    filled-new-array {v5}, [Ll91;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v5}, Lex0;->Ι([Ll91;)Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    new-instance v7, Ljava/util/TreeMap;

    .line 60
    .line 61
    invoke-direct {v7, v5}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-object v7, v5

    .line 72
    check-cast v7, Ljava/lang/Iterable;

    .line 73
    .line 74
    new-instance v12, Lsv0;

    .line 75
    .line 76
    const/16 v5, 0x1c

    .line 77
    .line 78
    invoke-direct {v12, v5}, Lsv0;-><init>(I)V

    .line 79
    .line 80
    .line 81
    const/16 v13, 0x1e

    .line 82
    .line 83
    const-string v8, "&"

    .line 84
    .line 85
    const/4 v9, 0x0

    .line 86
    const/4 v10, 0x0

    .line 87
    const/4 v11, 0x0

    .line 88
    invoke-static/range {v7 .. v13}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    const-string v7, "3HT8hjE79L"

    .line 93
    .line 94
    const-string v8, "zh"

    .line 95
    .line 96
    invoke-static {v8, v4, v7, v5}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    const-string v7, "SHA-256"

    .line 101
    .line 102
    invoke-static {v7}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    sget-object v9, Lmf;->α:Ljava/nio/charset/Charset;

    .line 107
    .line 108
    invoke-virtual {v5, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, v5}, Ljava/security/MessageDigest;->digest([B)[B

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v7, Lsv0;

    .line 123
    .line 124
    const/16 v10, 0x1d

    .line 125
    .line 126
    invoke-direct {v7, v10}, Lsv0;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-static {v5, v7}, Lg7;->ж([BLa80;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    sget v7, Lkn1;->δ:I

    .line 134
    .line 135
    new-instance v7, Lorg/json/JSONObject;

    .line 136
    .line 137
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7, v6, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    const/4 v10, 0x0

    .line 152
    sget-object v11, Lq71;->δ:Lez0;

    .line 153
    .line 154
    if-eqz v11, :cond_5

    .line 155
    .line 156
    sget-object v9, Lez0;->γ:Lym1;

    .line 157
    .line 158
    iget-object v9, v11, Lez0;->β:[Ljava/lang/String;

    .line 159
    .line 160
    array-length v12, v9

    .line 161
    add-int/lit8 v12, v12, -0x1

    .line 162
    .line 163
    const/4 v13, 0x2

    .line 164
    invoke-static {v10, v12, v13}, Lg81;->θ(III)I

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    if-ltz v12, :cond_3

    .line 169
    .line 170
    move v13, v10

    .line 171
    :goto_1
    aget-object v14, v9, v13

    .line 172
    .line 173
    const-string v15, "charset"

    .line 174
    .line 175
    invoke-static {v14, v15}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v14

    .line 179
    if-eqz v14, :cond_2

    .line 180
    .line 181
    add-int/lit8 v13, v13, 0x1

    .line 182
    .line 183
    aget-object v9, v9, v13

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_2
    if-eq v13, v12, :cond_3

    .line 187
    .line 188
    add-int/lit8 v13, v13, 0x2

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_3
    const/4 v9, 0x0

    .line 192
    :goto_2
    if-nez v9, :cond_4

    .line 193
    .line 194
    :catch_0
    const/4 v9, 0x0

    .line 195
    goto :goto_3

    .line 196
    :cond_4
    :try_start_0
    invoke-static {v9}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 197
    .line 198
    .line 199
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 200
    :goto_3
    if-nez v9, :cond_5

    .line 201
    .line 202
    sget-object v9, Lmf;->α:Ljava/nio/charset/Charset;

    .line 203
    .line 204
    sget-object v12, Lez0;->γ:Lym1;

    .line 205
    .line 206
    new-instance v12, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v11, "; charset=utf-8"

    .line 215
    .line 216
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v11

    .line 223
    :try_start_1
    invoke-static {v11}, Lkn0;->φ(Ljava/lang/String;)Lez0;

    .line 224
    .line 225
    .line 226
    move-result-object v11
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 227
    goto :goto_4

    .line 228
    :catch_1
    const/4 v11, 0x0

    .line 229
    :cond_5
    :goto_4
    invoke-virtual {v7, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    array-length v9, v7

    .line 237
    array-length v12, v7

    .line 238
    int-to-long v13, v12

    .line 239
    move-object v12, v3

    .line 240
    int-to-long v2, v10

    .line 241
    move-object/from16 v19, v11

    .line 242
    .line 243
    int-to-long v10, v9

    .line 244
    move-wide v15, v2

    .line 245
    move-wide/from16 v17, v10

    .line 246
    .line 247
    invoke-static/range {v13 .. v18}, Lsd2;->α(JJJ)V

    .line 248
    .line 249
    .line 250
    new-instance v2, Lkn1;

    .line 251
    .line 252
    move-object/from16 v11, v19

    .line 253
    .line 254
    invoke-direct {v2, v11, v9, v7}, Lkn1;-><init>(Lez0;I[B)V

    .line 255
    .line 256
    .line 257
    new-instance v3, Lb8;

    .line 258
    .line 259
    const/4 v7, 0x6

    .line 260
    invoke-direct {v3, v7}, Lb8;-><init>(I)V

    .line 261
    .line 262
    .line 263
    const-string v7, "https://api.seekin.ai/ikool/media/download"

    .line 264
    .line 265
    invoke-virtual {v3, v7}, Lb8;->π(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    const-string v7, "POST"

    .line 269
    .line 270
    invoke-virtual {v3, v7, v2}, Lb8;->μ(Ljava/lang/String;Lkn1;)V

    .line 271
    .line 272
    .line 273
    const-string v2, "Accept"

    .line 274
    .line 275
    const-string v7, "*/*"

    .line 276
    .line 277
    invoke-virtual {v3, v2, v7}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    const-string v2, "Content-Type"

    .line 281
    .line 282
    const-string v7, "application/json"

    .line 283
    .line 284
    invoke-virtual {v3, v2, v7}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    const-string v2, "Accept-Language"

    .line 288
    .line 289
    const-string v7, "zh-CN,zh;q=0.9"

    .line 290
    .line 291
    invoke-virtual {v3, v2, v7}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    const-string v2, "Origin"

    .line 295
    .line 296
    const-string v7, "https://www.seekin.ai"

    .line 297
    .line 298
    invoke-virtual {v3, v2, v7}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    const-string v2, "Referer"

    .line 302
    .line 303
    const-string v7, "https://www.seekin.ai/"

    .line 304
    .line 305
    invoke-virtual {v3, v2, v7}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    const-string v2, "User-Agent"

    .line 309
    .line 310
    const-string v7, "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Mobile Safari/537.36"

    .line 311
    .line 312
    invoke-virtual {v3, v2, v7}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    const-string v2, "lang"

    .line 316
    .line 317
    invoke-virtual {v3, v2, v8}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    const-string v2, "timestamp"

    .line 321
    .line 322
    invoke-virtual {v3, v2, v4}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    const-string v2, "sign"

    .line 326
    .line 327
    invoke-virtual {v3, v2, v5}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    new-instance v2, Li5;

    .line 331
    .line 332
    invoke-direct {v2, v3}, Li5;-><init>(Lb8;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    const/16 v4, 0x78

    .line 340
    .line 341
    if-gt v3, v4, :cond_6

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_6
    invoke-static {v1, v4}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    const-string v3, "..."

    .line 349
    .line 350
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    :goto_5
    const-string v3, "Seekin \u539f\u753b\u8d28\u8bf7\u6c42\u5019\u9009: "

    .line 355
    .line 356
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    const-string v3, "DYHelper"

    .line 361
    .line 362
    const/4 v4, 0x4

    .line 363
    const/4 v5, 0x0

    .line 364
    invoke-static {v3, v1, v5, v4, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    sget-object v1, Lq71;->ε:Lt41;

    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    new-instance v5, Luk1;

    .line 373
    .line 374
    invoke-direct {v5, v1, v2}, Luk1;-><init>(Lt41;Li5;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v5}, Luk1;->δ()Lzn1;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    :try_start_2
    iget-boolean v2, v1, Lzn1;->υ:Z

    .line 382
    .line 383
    if-eqz v2, :cond_15

    .line 384
    .line 385
    iget-object v2, v1, Lzn1;->λ:Lbo1;

    .line 386
    .line 387
    if-eqz v2, :cond_14

    .line 388
    .line 389
    invoke-virtual {v2}, Lbo1;->δ()[B

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    new-instance v5, Ljava/lang/String;

    .line 394
    .line 395
    sget-object v7, Lmf;->α:Ljava/nio/charset/Charset;

    .line 396
    .line 397
    invoke-direct {v5, v2, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 398
    .line 399
    .line 400
    new-instance v2, Lorg/json/JSONObject;

    .line 401
    .line 402
    invoke-direct {v2, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    const-string v5, "code"

    .line 406
    .line 407
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    const-string v7, "0000"

    .line 412
    .line 413
    invoke-static {v5, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    if-nez v5, :cond_8

    .line 418
    .line 419
    const-string v5, "msg"

    .line 420
    .line 421
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    if-eqz v5, :cond_7

    .line 430
    .line 431
    const-string v2, "unknown"

    .line 432
    .line 433
    goto :goto_6

    .line 434
    :catchall_0
    move-exception v0

    .line 435
    move-object v2, v0

    .line 436
    goto/16 :goto_f

    .line 437
    .line 438
    :cond_7
    :goto_6
    new-instance v5, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 441
    .line 442
    .line 443
    const-string v6, "Seekin \u539f\u753b\u8d28\u89e3\u6790\u4e0d\u53ef\u7528: "

    .line 444
    .line 445
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    const/4 v5, 0x0

    .line 456
    invoke-static {v3, v2, v5, v4, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 457
    .line 458
    .line 459
    invoke-virtual {v1}, Lzn1;->close()V

    .line 460
    .line 461
    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :cond_8
    :try_start_3
    const-string v3, "data"

    .line 465
    .line 466
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    if-eqz v2, :cond_13

    .line 471
    .line 472
    const-string v3, "medias"

    .line 473
    .line 474
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    if-nez v2, :cond_9

    .line 479
    .line 480
    goto/16 :goto_d

    .line 481
    .line 482
    :cond_9
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    const/4 v4, 0x0

    .line 487
    const/4 v5, 0x0

    .line 488
    const/4 v7, 0x0

    .line 489
    :goto_7
    if-ge v4, v3, :cond_12

    .line 490
    .line 491
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 492
    .line 493
    .line 494
    move-result-object v8

    .line 495
    if-nez v8, :cond_a

    .line 496
    .line 497
    goto/16 :goto_c

    .line 498
    .line 499
    :cond_a
    const-string v9, "format"

    .line 500
    .line 501
    invoke-virtual {v8, v9, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v9

    .line 505
    invoke-virtual {v8, v6, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v10

    .line 509
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-static {v10}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 513
    .line 514
    .line 515
    move-result-object v10

    .line 516
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v10

    .line 520
    if-nez v9, :cond_b

    .line 521
    .line 522
    move-object v11, v12

    .line 523
    goto :goto_8

    .line 524
    :cond_b
    move-object v11, v9

    .line 525
    :goto_8
    invoke-static {v11}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 526
    .line 527
    .line 528
    move-result-object v11

    .line 529
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v11

    .line 533
    const-string v13, "Original"

    .line 534
    .line 535
    const/4 v14, 0x1

    .line 536
    invoke-static {v11, v13, v14}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 537
    .line 538
    .line 539
    move-result v13

    .line 540
    if-eqz v13, :cond_c

    .line 541
    .line 542
    const/16 v11, 0x2710

    .line 543
    .line 544
    goto :goto_9

    .line 545
    :cond_c
    const-string v13, "8K"

    .line 546
    .line 547
    invoke-static {v11, v13, v14}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 548
    .line 549
    .line 550
    move-result v13

    .line 551
    if-eqz v13, :cond_d

    .line 552
    .line 553
    const/16 v11, 0x1f40

    .line 554
    .line 555
    goto :goto_9

    .line 556
    :cond_d
    const-string v13, "4K"

    .line 557
    .line 558
    invoke-static {v11, v13, v14}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 559
    .line 560
    .line 561
    move-result v11

    .line 562
    if-eqz v11, :cond_e

    .line 563
    .line 564
    const/16 v11, 0xfa0

    .line 565
    .line 566
    goto :goto_9

    .line 567
    :cond_e
    const/4 v11, 0x0

    .line 568
    :goto_9
    if-le v11, v7, :cond_11

    .line 569
    .line 570
    const-string v13, "http"

    .line 571
    .line 572
    invoke-static {v10, v13, v14}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 573
    .line 574
    .line 575
    move-result v13

    .line 576
    if-eqz v13, :cond_11

    .line 577
    .line 578
    invoke-static {v9}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 579
    .line 580
    .line 581
    move-result v5

    .line 582
    if-eqz v5, :cond_f

    .line 583
    .line 584
    const/4 v5, 0x0

    .line 585
    goto :goto_a

    .line 586
    :cond_f
    move-object v5, v9

    .line 587
    :goto_a
    const-string v7, "fileSize"

    .line 588
    .line 589
    invoke-virtual {v8, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 590
    .line 591
    .line 592
    move-result-wide v7

    .line 593
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 594
    .line 595
    .line 596
    move-result-object v9

    .line 597
    const-wide/16 v13, 0x0

    .line 598
    .line 599
    cmp-long v7, v7, v13

    .line 600
    .line 601
    if-lez v7, :cond_10

    .line 602
    .line 603
    goto :goto_b

    .line 604
    :cond_10
    const/4 v9, 0x0

    .line 605
    :goto_b
    new-instance v7, Ll71;

    .line 606
    .line 607
    invoke-direct {v7, v10, v5, v9}, Ll71;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 608
    .line 609
    .line 610
    move-object v5, v7

    .line 611
    move v7, v11

    .line 612
    :cond_11
    :goto_c
    add-int/lit8 v4, v4, 0x1

    .line 613
    .line 614
    goto :goto_7

    .line 615
    :cond_12
    invoke-virtual {v1}, Lzn1;->close()V

    .line 616
    .line 617
    .line 618
    move-object v2, v5

    .line 619
    goto :goto_e

    .line 620
    :cond_13
    :goto_d
    invoke-virtual {v1}, Lzn1;->close()V

    .line 621
    .line 622
    .line 623
    goto/16 :goto_0

    .line 624
    .line 625
    :goto_e
    if-eqz v2, :cond_0

    .line 626
    .line 627
    return-object v2

    .line 628
    :cond_14
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 629
    .line 630
    const-string v2, "Seekin \u54cd\u5e94\u4e3a\u7a7a"

    .line 631
    .line 632
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    throw v0

    .line 636
    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 637
    .line 638
    iget v2, v1, Lzn1;->θ:I

    .line 639
    .line 640
    new-instance v3, Ljava/lang/StringBuilder;

    .line 641
    .line 642
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 643
    .line 644
    .line 645
    const-string v4, "Seekin HTTP "

    .line 646
    .line 647
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 661
    :goto_f
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 662
    :catchall_1
    move-exception v0

    .line 663
    invoke-static {v1, v2}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 664
    .line 665
    .line 666
    throw v0

    .line 667
    :cond_16
    const/4 v5, 0x0

    .line 668
    return-object v5
.end method

.method public static σ(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/String;
    .locals 4

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 7
    .line 8
    const-string v1, "yyyy\u5e74MM\u6708"

    .line 9
    .line 10
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/util/Date;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v1, Ljava/util/Date;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_1
    const-string v0, " \u81f3 "

    .line 52
    .line 53
    invoke-static {p0, v0, p1}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_2
    :goto_0
    const-string p0, "\u5c1a\u672a\u8bc6\u522b\u5230\u6709\u6548\u6d88\u606f\u65f6\u95f4"

    .line 59
    .line 60
    return-object p0
.end method

.method public static τ(F)Ljava/lang/String;
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    rem-float v0, p0, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    cmpg-float v0, v0, v1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    float-to-int p0, p0

    .line 11
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static υ(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    const-string v0, "0"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_5

    .line 15
    .line 16
    const-string v0, "null"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    :try_start_0
    sget-object v0, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    sget-object v0, Lcom/example/dyhelper/beta/BetaNativeBridge;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const/16 v0, 0x3e8

    .line 34
    .line 35
    int-to-long v4, v0

    .line 36
    div-long/2addr v2, v4

    .line 37
    invoke-static {v2, v3, p1}, Lcom/example/dyhelper/beta/BetaNativeBridge;->ρ(JLjava/lang/String;)Lh9;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v2, Lt9;

    .line 42
    .line 43
    iget-boolean v3, v0, Lh9;->α:Z

    .line 44
    .line 45
    iget-object v4, v0, Lh9;->β:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v0, v0, Lh9;->γ:Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {v2, v4, v0, v3}, Lt9;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    new-instance v2, Leo1;

    .line 55
    .line 56
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    const-string v3, "DYHelper"

    .line 66
    .line 67
    const-string v4, "\u751f\u6210\u5185\u6d4b\u7533\u8bf7\u7801\u5931\u8d25"

    .line 68
    .line 69
    invoke-static {v3, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v3, "\u751f\u6210\u5931\u8d25: "

    .line 77
    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    check-cast v2, Lt9;

    .line 81
    .line 82
    iget-boolean v0, v2, Lt9;->α:Z

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    iget-object v0, v2, Lt9;->β:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    new-instance v0, Le9;

    .line 95
    .line 96
    const/16 v1, 0x16

    .line 97
    .line 98
    invoke-direct {v0, p0, p1, v2, v1}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    iget-object p1, v2, Lt9;->γ:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v1, p0, v3, p1}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :goto_1
    return-void

    .line 111
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-nez p1, :cond_4

    .line 116
    .line 117
    const-string p1, "\u672a\u77e5\u9519\u8bef"

    .line 118
    .line 119
    :cond_4
    invoke-static {v1, p0, v3, p1}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_5
    :goto_2
    const-string p1, "\u65e0\u6cd5\u83b7\u53d6UID\uff0c\u8bf7\u786e\u4fdd\u5df2\u767b\u5f55\u6296\u97f3\u5e76\u6253\u5f00\u8fc7\u79c1\u4fe1\u5217\u8868"

    .line 124
    .line 125
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public static φ(Ljava/lang/Iterable;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "http"

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static χ()Z
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lx9;->κ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    new-instance v1, Leo1;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v1

    .line 17
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const-string v2, "DYHelper"

    .line 24
    .line 25
    const-string v3, "\u68c0\u67e5\u5206\u4eab\u9762\u677f\u5185\u6d4b\u8d44\u683c\u5931\u8d25"

    .line 26
    .line 27
    invoke-static {v2, v3, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    instance-of v2, v0, Leo1;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    move-object v0, v1

    .line 37
    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    return v0
.end method

.method public static ψ(Landroid/app/Activity;)Landroid/widget/FrameLayout;
    .locals 6

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v2, Lq71;->γ:Lxx;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-object v2, v2, Lxx;->γ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 22
    .line 23
    .line 24
    const/16 v2, 0x12

    .line 25
    .line 26
    invoke-static {p0, v2}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    int-to-float v2, v2

    .line 31
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 38
    .line 39
    const/4 v2, -0x1

    .line 40
    const/4 v3, -0x2

    .line 41
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Landroid/widget/LinearLayout;

    .line 48
    .line 49
    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 54
    .line 55
    .line 56
    const/16 v4, 0xc

    .line 57
    .line 58
    invoke-static {p0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static {p0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-virtual {v1, v5, v4, p0, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 68
    .line 69
    .line 70
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 71
    .line 72
    invoke-direct {p0, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_0
    const-string p0, "theme"

    .line 83
    .line 84
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    throw p0
.end method

.method public static ω(ILp70;Landroid/app/Activity;)Landroid/widget/ImageView;
    .locals 6

    .line 1
    new-instance v0, Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lx01;->α:Lx01;

    .line 7
    .line 8
    const v2, 0x7f080098

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p2, v2}, Lx01;->β(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Lq71;->γ:Lxx;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const-string v3, "theme"

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object v1, v1, Lxx;->θ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x6

    .line 39
    invoke-static {p2, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {v0, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 44
    .line 45
    .line 46
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 47
    .line 48
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 49
    .line 50
    .line 51
    sget-object v5, Lq71;->γ:Lxx;

    .line 52
    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    iget-object v2, v5, Lxx;->ε:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 62
    .line 63
    .line 64
    const/16 v2, 0x8

    .line 65
    .line 66
    invoke-static {p2, v2}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    int-to-float p2, p2

    .line 71
    invoke-virtual {v4, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    const/4 p2, 0x1

    .line 78
    invoke-virtual {v0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 82
    .line 83
    .line 84
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 85
    .line 86
    invoke-direct {p2, p0, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    .line 91
    .line 92
    new-instance p0, Lb9;

    .line 93
    .line 94
    invoke-direct {p0, v1, p1}, Lb9;-><init>(ILp70;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_0
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v2

    .line 105
    :cond_1
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v2
.end method


# virtual methods
.method public final Κ(Landroid/app/Activity;)V
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, Lq71;->γ:Lxx;

    .line 8
    .line 9
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    move-object v2, v0

    .line 18
    :cond_0
    invoke-virtual {v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->init(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    move-object v2, v0

    .line 30
    :cond_1
    invoke-virtual {v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->init(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    sget-object v1, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 34
    .line 35
    invoke-static {}, Lb10;->τ()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-static {}, Lq71;->Ε()Lf8;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v3, v2, Lf8;->ζ:Lh8;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    sget-object v5, Ld72;->α:Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast v5, Ljava/lang/Iterable;

    .line 58
    .line 59
    invoke-static {v5}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-nez v6, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-object v5, v4

    .line 71
    :goto_0
    if-nez v5, :cond_4

    .line 72
    .line 73
    invoke-static {v0}, Lp91;->Α(Landroid/app/Activity;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    sget-object v5, Ljz;->ε:Ljz;

    .line 79
    .line 80
    :cond_4
    :goto_1
    invoke-static {v2, v5, v1, v0}, Lq71;->γ(Lf8;Ljava/util/List;ZLandroid/app/Activity;)Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-instance v6, Landroid/widget/LinearLayout;

    .line 85
    .line 86
    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    const/4 v7, 0x1

    .line 90
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v7}, Landroid/view/View;->setClipToOutline(Z)V

    .line 94
    .line 95
    .line 96
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 97
    .line 98
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 99
    .line 100
    .line 101
    sget-object v9, Lq71;->γ:Lxx;

    .line 102
    .line 103
    const-string v10, "theme"

    .line 104
    .line 105
    if-eqz v9, :cond_4b

    .line 106
    .line 107
    iget-object v9, v9, Lxx;->β:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 114
    .line 115
    .line 116
    const/16 v9, 0x16

    .line 117
    .line 118
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    int-to-float v9, v9

    .line 123
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 127
    .line 128
    .line 129
    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    .line 130
    .line 131
    const/4 v9, -0x1

    .line 132
    const/4 v11, -0x2

    .line 133
    invoke-direct {v8, v9, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 137
    .line 138
    .line 139
    new-instance v8, Landroid/widget/RelativeLayout;

    .line 140
    .line 141
    invoke-direct {v8, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 142
    .line 143
    .line 144
    sget-object v12, Lq71;->γ:Lxx;

    .line 145
    .line 146
    if-eqz v12, :cond_4a

    .line 147
    .line 148
    iget-object v12, v12, Lxx;->γ:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    invoke-virtual {v8, v12}, Landroid/view/View;->setBackgroundColor(I)V

    .line 155
    .line 156
    .line 157
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 158
    .line 159
    const/16 v13, 0x34

    .line 160
    .line 161
    invoke-static {v0, v13}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    invoke-direct {v12, v9, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 169
    .line 170
    .line 171
    new-instance v12, Landroid/view/View;

    .line 172
    .line 173
    invoke-direct {v12, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 174
    .line 175
    .line 176
    sget-object v13, Lq71;->γ:Lxx;

    .line 177
    .line 178
    if-eqz v13, :cond_49

    .line 179
    .line 180
    iget-object v13, v13, Lxx;->δ:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    move-result v13

    .line 186
    invoke-virtual {v12, v13}, Landroid/view/View;->setBackgroundColor(I)V

    .line 187
    .line 188
    .line 189
    new-instance v13, Landroid/widget/RelativeLayout$LayoutParams;

    .line 190
    .line 191
    invoke-static {v0, v7}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 192
    .line 193
    .line 194
    move-result v14

    .line 195
    invoke-direct {v13, v9, v14}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 196
    .line 197
    .line 198
    const/16 v14, 0xc

    .line 199
    .line 200
    invoke-virtual {v13, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 207
    .line 208
    .line 209
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    new-instance v13, Landroid/widget/TextView;

    .line 214
    .line 215
    invoke-direct {v13, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v13, v12}, Landroid/view/View;->setId(I)V

    .line 219
    .line 220
    .line 221
    const-string v12, "\u5173\u95ed"

    .line 222
    .line 223
    invoke-virtual {v13, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    .line 226
    const/high16 v12, 0x41600000    # 14.0f

    .line 227
    .line 228
    invoke-virtual {v13, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 229
    .line 230
    .line 231
    sget-object v15, Lq71;->γ:Lxx;

    .line 232
    .line 233
    if-eqz v15, :cond_48

    .line 234
    .line 235
    iget-object v15, v15, Lxx;->η:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result v15

    .line 241
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 242
    .line 243
    .line 244
    const/16 v15, 0x11

    .line 245
    .line 246
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setGravity(I)V

    .line 247
    .line 248
    .line 249
    const/16 v12, 0x10

    .line 250
    .line 251
    invoke-static {v0, v12}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 252
    .line 253
    .line 254
    move-result v14

    .line 255
    const/16 v15, 0x8

    .line 256
    .line 257
    invoke-static {v0, v15}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 258
    .line 259
    .line 260
    move-result v9

    .line 261
    invoke-static {v0, v12}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 262
    .line 263
    .line 264
    move-result v11

    .line 265
    invoke-static {v0, v15}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 266
    .line 267
    .line 268
    move-result v12

    .line 269
    invoke-virtual {v13, v14, v9, v11, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v13, v7}, Landroid/view/View;->setClickable(Z)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v13, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 276
    .line 277
    .line 278
    sget-object v9, Lq71;->γ:Lxx;

    .line 279
    .line 280
    if-eqz v9, :cond_47

    .line 281
    .line 282
    iget-object v9, v9, Lxx;->Α:Ljava/lang/String;

    .line 283
    .line 284
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 285
    .line 286
    .line 287
    move-result v9

    .line 288
    invoke-static {v9}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    const/4 v11, 0x0

    .line 293
    invoke-static {v11}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 294
    .line 295
    .line 296
    move-result-object v12

    .line 297
    new-instance v14, Landroid/graphics/drawable/RippleDrawable;

    .line 298
    .line 299
    invoke-direct {v14, v9, v12, v4}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v13, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 303
    .line 304
    .line 305
    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    .line 306
    .line 307
    const/4 v12, -0x2

    .line 308
    const/4 v14, -0x1

    .line 309
    invoke-direct {v9, v12, v14}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 310
    .line 311
    .line 312
    const/16 v12, 0x14

    .line 313
    .line 314
    invoke-virtual {v9, v12}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 315
    .line 316
    .line 317
    const/4 v14, 0x4

    .line 318
    invoke-static {v0, v14}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 319
    .line 320
    .line 321
    move-result v12

    .line 322
    invoke-virtual {v9, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v13, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 326
    .line 327
    .line 328
    new-instance v9, Lxs;

    .line 329
    .line 330
    invoke-direct {v9, v6, v7}, Lxs;-><init>(Landroid/widget/LinearLayout;I)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v13, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v8, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 337
    .line 338
    .line 339
    new-instance v9, Landroid/widget/TextView;

    .line 340
    .line 341
    invoke-direct {v9, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 342
    .line 343
    .line 344
    const-string v12, "DY Helper"

    .line 345
    .line 346
    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    .line 348
    .line 349
    const/high16 v13, 0x41800000    # 16.0f

    .line 350
    .line 351
    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 352
    .line 353
    .line 354
    sget-object v13, Lq71;->γ:Lxx;

    .line 355
    .line 356
    if-eqz v13, :cond_46

    .line 357
    .line 358
    iget-object v13, v13, Lxx;->ζ:Ljava/lang/String;

    .line 359
    .line 360
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 361
    .line 362
    .line 363
    move-result v13

    .line 364
    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v9, v4, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 368
    .line 369
    .line 370
    const/16 v13, 0x11

    .line 371
    .line 372
    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 373
    .line 374
    .line 375
    new-instance v13, Landroid/widget/RelativeLayout$LayoutParams;

    .line 376
    .line 377
    const/4 v14, -0x2

    .line 378
    const/4 v15, -0x1

    .line 379
    invoke-direct {v13, v14, v15}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 380
    .line 381
    .line 382
    const/16 v14, 0xd

    .line 383
    .line 384
    invoke-virtual {v13, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v9, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 391
    .line 392
    .line 393
    if-eqz v1, :cond_5

    .line 394
    .line 395
    const-string v9, "\u4e3b\u9875"

    .line 396
    .line 397
    goto :goto_2

    .line 398
    :cond_5
    const-string v9, "\u89c6\u9891\u6d41"

    .line 399
    .line 400
    :goto_2
    sget-object v13, Lq71;->γ:Lxx;

    .line 401
    .line 402
    if-eqz v1, :cond_7

    .line 403
    .line 404
    if-eqz v13, :cond_6

    .line 405
    .line 406
    iget-object v13, v13, Lxx;->κ:Ljava/lang/String;

    .line 407
    .line 408
    goto :goto_3

    .line 409
    :cond_6
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    throw v4

    .line 413
    :cond_7
    if-eqz v13, :cond_45

    .line 414
    .line 415
    iget-object v13, v13, Lxx;->μ:Ljava/lang/String;

    .line 416
    .line 417
    :goto_3
    if-eqz v1, :cond_9

    .line 418
    .line 419
    sget-object v1, Lq71;->γ:Lxx;

    .line 420
    .line 421
    if-eqz v1, :cond_8

    .line 422
    .line 423
    iget-object v1, v1, Lxx;->ι:Ljava/lang/String;

    .line 424
    .line 425
    goto :goto_4

    .line 426
    :cond_8
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    throw v4

    .line 430
    :cond_9
    sget-object v1, Lq71;->γ:Lxx;

    .line 431
    .line 432
    if-eqz v1, :cond_44

    .line 433
    .line 434
    iget-object v1, v1, Lxx;->λ:Ljava/lang/String;

    .line 435
    .line 436
    :goto_4
    const/high16 v14, 0x41300000    # 11.0f

    .line 437
    .line 438
    invoke-static {v0, v9, v14}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 439
    .line 440
    .line 441
    move-result-object v9

    .line 442
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v9, v4, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 450
    .line 451
    .line 452
    const/16 v1, 0x11

    .line 453
    .line 454
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 455
    .line 456
    .line 457
    const/16 v1, 0x9

    .line 458
    .line 459
    invoke-static {v0, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 460
    .line 461
    .line 462
    move-result v15

    .line 463
    const/4 v14, 0x3

    .line 464
    move-object/from16 v16, v4

    .line 465
    .line 466
    invoke-static {v0, v14}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    invoke-static {v0, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    invoke-static {v0, v14}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 475
    .line 476
    .line 477
    move-result v7

    .line 478
    invoke-virtual {v9, v15, v4, v1, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 479
    .line 480
    .line 481
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 482
    .line 483
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 484
    .line 485
    .line 486
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 487
    .line 488
    .line 489
    move-result v4

    .line 490
    invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 491
    .line 492
    .line 493
    const/16 v4, 0xa

    .line 494
    .line 495
    invoke-static {v0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 496
    .line 497
    .line 498
    move-result v7

    .line 499
    int-to-float v7, v7

    .line 500
    invoke-virtual {v1, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v9, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 504
    .line 505
    .line 506
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 507
    .line 508
    const/4 v7, -0x2

    .line 509
    invoke-direct {v1, v7, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 510
    .line 511
    .line 512
    const/16 v7, 0x15

    .line 513
    .line 514
    invoke-virtual {v1, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 515
    .line 516
    .line 517
    const/16 v7, 0xf

    .line 518
    .line 519
    invoke-virtual {v1, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 520
    .line 521
    .line 522
    const/16 v7, 0xe

    .line 523
    .line 524
    invoke-static {v0, v7}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 525
    .line 526
    .line 527
    move-result v13

    .line 528
    invoke-virtual {v1, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v9, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 538
    .line 539
    .line 540
    new-instance v1, Landroid/widget/ScrollView;

    .line 541
    .line 542
    invoke-direct {v1, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 543
    .line 544
    .line 545
    const/4 v8, 0x2

    .line 546
    invoke-virtual {v1, v8}, Landroid/view/View;->setOverScrollMode(I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1, v11}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 550
    .line 551
    .line 552
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 553
    .line 554
    const/4 v13, -0x2

    .line 555
    const/4 v15, -0x1

    .line 556
    invoke-direct {v9, v15, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 560
    .line 561
    .line 562
    const/4 v9, 0x1

    .line 563
    invoke-static {v0, v9}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 564
    .line 565
    .line 566
    move-result-object v13

    .line 567
    const/16 v9, 0xc

    .line 568
    .line 569
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 570
    .line 571
    .line 572
    move-result v15

    .line 573
    invoke-static {v0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 574
    .line 575
    .line 576
    move-result v7

    .line 577
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 578
    .line 579
    .line 580
    move-result v14

    .line 581
    const/16 v9, 0x10

    .line 582
    .line 583
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 584
    .line 585
    .line 586
    move-result v8

    .line 587
    invoke-virtual {v13, v15, v7, v14, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 588
    .line 589
    .line 590
    sget-object v7, Lh8;->ι:Lh8;

    .line 591
    .line 592
    if-eq v3, v7, :cond_2f

    .line 593
    .line 594
    const v7, 0x7f08009d

    .line 595
    .line 596
    .line 597
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 598
    .line 599
    .line 600
    move-result-object v7

    .line 601
    invoke-static {v0}, Lq71;->ψ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 602
    .line 603
    .line 604
    move-result-object v14

    .line 605
    invoke-virtual {v14, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 606
    .line 607
    .line 608
    move-result-object v15

    .line 609
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    check-cast v15, Landroid/widget/LinearLayout;

    .line 613
    .line 614
    sget-object v9, Lh8;->η:Lh8;

    .line 615
    .line 616
    if-eq v3, v9, :cond_b

    .line 617
    .line 618
    invoke-virtual {v2}, Lf8;->λ()Z

    .line 619
    .line 620
    .line 621
    move-result v9

    .line 622
    if-eqz v9, :cond_a

    .line 623
    .line 624
    goto :goto_5

    .line 625
    :cond_a
    move v9, v11

    .line 626
    goto :goto_6

    .line 627
    :cond_b
    :goto_5
    const/4 v9, 0x1

    .line 628
    :goto_6
    new-instance v8, Landroid/widget/LinearLayout;

    .line 629
    .line 630
    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v8, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 634
    .line 635
    .line 636
    const/16 v4, 0x10

    .line 637
    .line 638
    invoke-virtual {v8, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 639
    .line 640
    .line 641
    move-object/from16 v17, v5

    .line 642
    .line 643
    const/16 v4, 0xc

    .line 644
    .line 645
    invoke-static {v0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 646
    .line 647
    .line 648
    move-result v5

    .line 649
    move/from16 v18, v9

    .line 650
    .line 651
    invoke-static {v0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 652
    .line 653
    .line 654
    move-result v9

    .line 655
    invoke-virtual {v8, v11, v5, v11, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 656
    .line 657
    .line 658
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 659
    .line 660
    const/4 v5, -0x2

    .line 661
    const/4 v9, -0x1

    .line 662
    invoke-direct {v4, v9, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v8, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 666
    .line 667
    .line 668
    sget-object v4, Lh8;->θ:Lh8;

    .line 669
    .line 670
    sget-object v5, Lh8;->ζ:Lh8;

    .line 671
    .line 672
    sget-object v9, Lh8;->ε:Lh8;

    .line 673
    .line 674
    if-eqz v18, :cond_d

    .line 675
    .line 676
    new-instance v11, Ld62;

    .line 677
    .line 678
    move-object/from16 v19, v10

    .line 679
    .line 680
    sget-object v10, Lq71;->γ:Lxx;

    .line 681
    .line 682
    if-eqz v10, :cond_c

    .line 683
    .line 684
    move-object/from16 v20, v1

    .line 685
    .line 686
    iget-object v1, v10, Lxx;->σ:Ljava/lang/String;

    .line 687
    .line 688
    iget-object v10, v10, Lxx;->ρ:Ljava/lang/String;

    .line 689
    .line 690
    invoke-direct {v11, v7, v1, v10}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    goto/16 :goto_8

    .line 694
    .line 695
    :cond_c
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    throw v16

    .line 699
    :cond_d
    move-object/from16 v20, v1

    .line 700
    .line 701
    move-object/from16 v19, v10

    .line 702
    .line 703
    if-ne v3, v9, :cond_f

    .line 704
    .line 705
    new-instance v11, Ld62;

    .line 706
    .line 707
    const v1, 0x7f0800a2

    .line 708
    .line 709
    .line 710
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 711
    .line 712
    .line 713
    move-result-object v1

    .line 714
    sget-object v7, Lq71;->γ:Lxx;

    .line 715
    .line 716
    if-eqz v7, :cond_e

    .line 717
    .line 718
    iget-object v10, v7, Lxx;->κ:Ljava/lang/String;

    .line 719
    .line 720
    iget-object v7, v7, Lxx;->ι:Ljava/lang/String;

    .line 721
    .line 722
    invoke-direct {v11, v1, v10, v7}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    goto :goto_8

    .line 726
    :cond_e
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    throw v16

    .line 730
    :cond_f
    if-ne v3, v5, :cond_11

    .line 731
    .line 732
    new-instance v11, Ld62;

    .line 733
    .line 734
    sget-object v1, Lq71;->γ:Lxx;

    .line 735
    .line 736
    if-eqz v1, :cond_10

    .line 737
    .line 738
    iget-object v10, v1, Lxx;->μ:Ljava/lang/String;

    .line 739
    .line 740
    iget-object v1, v1, Lxx;->λ:Ljava/lang/String;

    .line 741
    .line 742
    invoke-direct {v11, v7, v10, v1}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    goto :goto_8

    .line 746
    :cond_10
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    throw v16

    .line 750
    :cond_11
    if-eq v3, v4, :cond_14

    .line 751
    .line 752
    invoke-virtual {v2}, Lf8;->ι()Z

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    if-eqz v1, :cond_12

    .line 757
    .line 758
    goto :goto_7

    .line 759
    :cond_12
    new-instance v11, Ld62;

    .line 760
    .line 761
    const v1, 0x7f0800a4

    .line 762
    .line 763
    .line 764
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 765
    .line 766
    .line 767
    move-result-object v1

    .line 768
    sget-object v7, Lq71;->γ:Lxx;

    .line 769
    .line 770
    if-eqz v7, :cond_13

    .line 771
    .line 772
    iget-object v10, v7, Lxx;->χ:Ljava/lang/String;

    .line 773
    .line 774
    iget-object v7, v7, Lxx;->φ:Ljava/lang/String;

    .line 775
    .line 776
    invoke-direct {v11, v1, v10, v7}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    goto :goto_8

    .line 780
    :cond_13
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    throw v16

    .line 784
    :cond_14
    :goto_7
    new-instance v11, Ld62;

    .line 785
    .line 786
    const v1, 0x7f080091

    .line 787
    .line 788
    .line 789
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    sget-object v7, Lq71;->γ:Lxx;

    .line 794
    .line 795
    if-eqz v7, :cond_2e

    .line 796
    .line 797
    iget-object v10, v7, Lxx;->π:Ljava/lang/String;

    .line 798
    .line 799
    iget-object v7, v7, Lxx;->ο:Ljava/lang/String;

    .line 800
    .line 801
    invoke-direct {v11, v1, v10, v7}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 802
    .line 803
    .line 804
    :goto_8
    iget-object v1, v11, Ld62;->ε:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast v1, Ljava/lang/Number;

    .line 807
    .line 808
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 809
    .line 810
    .line 811
    move-result v1

    .line 812
    iget-object v7, v11, Ld62;->ζ:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast v7, Ljava/lang/String;

    .line 815
    .line 816
    iget-object v10, v11, Ld62;->η:Ljava/lang/Object;

    .line 817
    .line 818
    check-cast v10, Ljava/lang/String;

    .line 819
    .line 820
    const/16 v11, 0x20

    .line 821
    .line 822
    invoke-static {v0, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 823
    .line 824
    .line 825
    move-result v11

    .line 826
    invoke-static {v0, v1, v7, v10, v11}, Lq71;->Α(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;I)Landroid/widget/FrameLayout;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 831
    .line 832
    .line 833
    new-instance v1, Landroid/widget/LinearLayout;

    .line 834
    .line 835
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 836
    .line 837
    .line 838
    const/4 v7, 0x1

    .line 839
    invoke-virtual {v1, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 840
    .line 841
    .line 842
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 843
    .line 844
    const/high16 v10, 0x3f800000    # 1.0f

    .line 845
    .line 846
    move-object/from16 v21, v12

    .line 847
    .line 848
    const/4 v11, 0x0

    .line 849
    const/4 v12, -0x2

    .line 850
    invoke-direct {v7, v11, v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 851
    .line 852
    .line 853
    const/16 v11, 0xa

    .line 854
    .line 855
    invoke-static {v0, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 856
    .line 857
    .line 858
    move-result v12

    .line 859
    invoke-virtual {v7, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v1, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 863
    .line 864
    .line 865
    new-instance v7, Landroid/widget/TextView;

    .line 866
    .line 867
    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 868
    .line 869
    .line 870
    iget-object v11, v2, Lf8;->α:Ljava/lang/String;

    .line 871
    .line 872
    new-instance v12, Ljava/lang/StringBuilder;

    .line 873
    .line 874
    const-string v10, "@"

    .line 875
    .line 876
    invoke-direct {v12, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 880
    .line 881
    .line 882
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v10

    .line 886
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 887
    .line 888
    .line 889
    const/high16 v10, 0x41600000    # 14.0f

    .line 890
    .line 891
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 892
    .line 893
    .line 894
    sget-object v10, Lq71;->γ:Lxx;

    .line 895
    .line 896
    if-eqz v10, :cond_2d

    .line 897
    .line 898
    iget-object v10, v10, Lxx;->ζ:Ljava/lang/String;

    .line 899
    .line 900
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 901
    .line 902
    .line 903
    move-result v10

    .line 904
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 905
    .line 906
    .line 907
    move-object/from16 v11, v16

    .line 908
    .line 909
    const/4 v10, 0x1

    .line 910
    invoke-virtual {v7, v11, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 914
    .line 915
    .line 916
    sget-object v10, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 917
    .line 918
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 922
    .line 923
    .line 924
    const-string v7, "\u672a\u77e5"

    .line 925
    .line 926
    if-eqz v18, :cond_15

    .line 927
    .line 928
    const-string v3, "\u52a8\u56fe / LivePhoto"

    .line 929
    .line 930
    :goto_9
    const/high16 v4, 0x41300000    # 11.0f

    .line 931
    .line 932
    goto :goto_b

    .line 933
    :cond_15
    if-ne v3, v9, :cond_16

    .line 934
    .line 935
    const-string v3, "\u89c6\u9891"

    .line 936
    .line 937
    goto :goto_9

    .line 938
    :cond_16
    if-ne v3, v5, :cond_17

    .line 939
    .line 940
    const-string v3, "\u56fe\u6587"

    .line 941
    .line 942
    goto :goto_9

    .line 943
    :cond_17
    if-eq v3, v4, :cond_19

    .line 944
    .line 945
    invoke-virtual {v2}, Lf8;->ι()Z

    .line 946
    .line 947
    .line 948
    move-result v3

    .line 949
    if-eqz v3, :cond_18

    .line 950
    .line 951
    goto :goto_a

    .line 952
    :cond_18
    move-object v3, v7

    .line 953
    goto :goto_9

    .line 954
    :cond_19
    :goto_a
    const-string v3, "\u97f3\u9891"

    .line 955
    .line 956
    goto :goto_9

    .line 957
    :goto_b
    invoke-static {v0, v3, v4}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 958
    .line 959
    .line 960
    move-result-object v3

    .line 961
    sget-object v4, Lq71;->γ:Lxx;

    .line 962
    .line 963
    if-eqz v4, :cond_2c

    .line 964
    .line 965
    iget-object v4, v4, Lxx;->θ:Ljava/lang/String;

    .line 966
    .line 967
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 968
    .line 969
    .line 970
    move-result v4

    .line 971
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 972
    .line 973
    .line 974
    const/4 v4, 0x2

    .line 975
    invoke-static {v0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 976
    .line 977
    .line 978
    move-result v5

    .line 979
    const/4 v11, 0x0

    .line 980
    invoke-virtual {v3, v11, v5, v11, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 984
    .line 985
    .line 986
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 987
    .line 988
    .line 989
    iget-boolean v1, v2, Lf8;->ρ:Z

    .line 990
    .line 991
    if-eqz v1, :cond_1c

    .line 992
    .line 993
    const-string v1, "\u76f4\u64ad\u4e2d"

    .line 994
    .line 995
    const/high16 v3, 0x41200000    # 10.0f

    .line 996
    .line 997
    invoke-static {v0, v1, v3}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    sget-object v3, Lq71;->γ:Lxx;

    .line 1002
    .line 1003
    if-eqz v3, :cond_1b

    .line 1004
    .line 1005
    iget-object v3, v3, Lxx;->ψ:Ljava/lang/String;

    .line 1006
    .line 1007
    const/4 v9, 0x1

    .line 1008
    const/4 v11, 0x0

    .line 1009
    invoke-static {v3, v1, v11, v9}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 1010
    .line 1011
    .line 1012
    const/4 v3, 0x7

    .line 1013
    invoke-static {v0, v3}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1014
    .line 1015
    .line 1016
    move-result v4

    .line 1017
    const/4 v5, 0x3

    .line 1018
    invoke-static {v0, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1019
    .line 1020
    .line 1021
    move-result v9

    .line 1022
    invoke-static {v0, v3}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1023
    .line 1024
    .line 1025
    move-result v3

    .line 1026
    invoke-static {v0, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1027
    .line 1028
    .line 1029
    move-result v11

    .line 1030
    invoke-virtual {v1, v4, v9, v3, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1031
    .line 1032
    .line 1033
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 1034
    .line 1035
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1036
    .line 1037
    .line 1038
    sget-object v4, Lq71;->γ:Lxx;

    .line 1039
    .line 1040
    if-eqz v4, :cond_1a

    .line 1041
    .line 1042
    iget-object v4, v4, Lxx;->ω:Ljava/lang/String;

    .line 1043
    .line 1044
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1045
    .line 1046
    .line 1047
    move-result v4

    .line 1048
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1049
    .line 1050
    .line 1051
    const/16 v4, 0x8

    .line 1052
    .line 1053
    invoke-static {v0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1054
    .line 1055
    .line 1056
    move-result v5

    .line 1057
    int-to-float v5, v5

    .line 1058
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1062
    .line 1063
    .line 1064
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 1065
    .line 1066
    const/4 v12, -0x2

    .line 1067
    invoke-direct {v3, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1068
    .line 1069
    .line 1070
    invoke-static {v0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1071
    .line 1072
    .line 1073
    move-result v5

    .line 1074
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1081
    .line 1082
    .line 1083
    goto :goto_c

    .line 1084
    :cond_1a
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1085
    .line 1086
    .line 1087
    const/16 v16, 0x0

    .line 1088
    .line 1089
    throw v16

    .line 1090
    :cond_1b
    const/16 v16, 0x0

    .line 1091
    .line 1092
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1093
    .line 1094
    .line 1095
    throw v16

    .line 1096
    :cond_1c
    :goto_c
    invoke-virtual {v15, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1097
    .line 1098
    .line 1099
    iget-object v1, v2, Lf8;->β:Ljava/lang/String;

    .line 1100
    .line 1101
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1102
    .line 1103
    .line 1104
    move-result v3

    .line 1105
    const/16 v4, 0x1e

    .line 1106
    .line 1107
    const/16 v5, 0x2a

    .line 1108
    .line 1109
    if-nez v3, :cond_1f

    .line 1110
    .line 1111
    const-string v3, "\u65e0\u63cf\u8ff0"

    .line 1112
    .line 1113
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1114
    .line 1115
    .line 1116
    move-result v3

    .line 1117
    if-nez v3, :cond_1f

    .line 1118
    .line 1119
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1120
    .line 1121
    .line 1122
    move-result v3

    .line 1123
    if-nez v3, :cond_1f

    .line 1124
    .line 1125
    new-instance v3, Landroid/view/View;

    .line 1126
    .line 1127
    invoke-direct {v3, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1128
    .line 1129
    .line 1130
    sget-object v7, Lq71;->γ:Lxx;

    .line 1131
    .line 1132
    if-eqz v7, :cond_1e

    .line 1133
    .line 1134
    iget-object v7, v7, Lxx;->ε:Ljava/lang/String;

    .line 1135
    .line 1136
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1137
    .line 1138
    .line 1139
    move-result v7

    .line 1140
    invoke-virtual {v3, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1141
    .line 1142
    .line 1143
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 1144
    .line 1145
    const/4 v9, 0x1

    .line 1146
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1147
    .line 1148
    .line 1149
    move-result v8

    .line 1150
    const/4 v9, -0x1

    .line 1151
    invoke-direct {v7, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1152
    .line 1153
    .line 1154
    invoke-static {v0, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1155
    .line 1156
    .line 1157
    move-result v8

    .line 1158
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v3, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v15, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1165
    .line 1166
    .line 1167
    new-instance v3, Landroid/widget/LinearLayout;

    .line 1168
    .line 1169
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1170
    .line 1171
    .line 1172
    const/4 v11, 0x0

    .line 1173
    invoke-virtual {v3, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1174
    .line 1175
    .line 1176
    const/16 v9, 0x10

    .line 1177
    .line 1178
    invoke-virtual {v3, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1179
    .line 1180
    .line 1181
    const/16 v7, 0xa

    .line 1182
    .line 1183
    invoke-static {v0, v7}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1184
    .line 1185
    .line 1186
    move-result v8

    .line 1187
    const/16 v9, 0xc

    .line 1188
    .line 1189
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1190
    .line 1191
    .line 1192
    move-result v7

    .line 1193
    invoke-virtual {v3, v11, v8, v11, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 1194
    .line 1195
    .line 1196
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 1197
    .line 1198
    const/4 v9, -0x1

    .line 1199
    const/4 v12, -0x2

    .line 1200
    invoke-direct {v7, v9, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v3, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1204
    .line 1205
    .line 1206
    new-instance v7, Landroid/widget/TextView;

    .line 1207
    .line 1208
    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1212
    .line 1213
    .line 1214
    const/high16 v8, 0x41500000    # 13.0f

    .line 1215
    .line 1216
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1217
    .line 1218
    .line 1219
    sget-object v8, Lq71;->γ:Lxx;

    .line 1220
    .line 1221
    if-eqz v8, :cond_1d

    .line 1222
    .line 1223
    iget-object v8, v8, Lxx;->η:Ljava/lang/String;

    .line 1224
    .line 1225
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1226
    .line 1227
    .line 1228
    move-result v8

    .line 1229
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1230
    .line 1231
    .line 1232
    const/4 v8, 0x3

    .line 1233
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1237
    .line 1238
    .line 1239
    invoke-static {v0, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1240
    .line 1241
    .line 1242
    move-result v9

    .line 1243
    int-to-float v8, v9

    .line 1244
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1245
    .line 1246
    invoke-virtual {v7, v8, v9}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 1247
    .line 1248
    .line 1249
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 1250
    .line 1251
    const/4 v11, 0x0

    .line 1252
    const/4 v12, -0x2

    .line 1253
    invoke-direct {v8, v11, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1254
    .line 1255
    .line 1256
    const/16 v9, 0xa

    .line 1257
    .line 1258
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1259
    .line 1260
    .line 1261
    move-result v10

    .line 1262
    invoke-virtual {v8, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1269
    .line 1270
    .line 1271
    invoke-static {v0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1272
    .line 1273
    .line 1274
    move-result v7

    .line 1275
    new-instance v8, Lx61;

    .line 1276
    .line 1277
    invoke-direct {v8, v0, v1, v11}, Lx61;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 1278
    .line 1279
    .line 1280
    invoke-static {v7, v8, v0}, Lq71;->ω(ILp70;Landroid/app/Activity;)Landroid/widget/ImageView;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v1

    .line 1284
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v15, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1288
    .line 1289
    .line 1290
    goto :goto_d

    .line 1291
    :cond_1d
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1292
    .line 1293
    .line 1294
    const/16 v16, 0x0

    .line 1295
    .line 1296
    throw v16

    .line 1297
    :cond_1e
    const/16 v16, 0x0

    .line 1298
    .line 1299
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1300
    .line 1301
    .line 1302
    throw v16

    .line 1303
    :cond_1f
    :goto_d
    invoke-virtual {v13, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1304
    .line 1305
    .line 1306
    const/16 v1, 0x8

    .line 1307
    .line 1308
    invoke-static {v0, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1309
    .line 1310
    .line 1311
    move-result v3

    .line 1312
    invoke-static {v0, v3}, Lq71;->Μ(Landroid/app/Activity;I)Landroid/view/View;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v1

    .line 1316
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1317
    .line 1318
    .line 1319
    new-instance v1, Ljava/util/ArrayList;

    .line 1320
    .line 1321
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v2}, Lf8;->θ()Ljava/lang/String;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v3

    .line 1328
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1329
    .line 1330
    .line 1331
    move-result v3

    .line 1332
    if-lez v3, :cond_21

    .line 1333
    .line 1334
    new-instance v7, Lo71;

    .line 1335
    .line 1336
    sget-object v3, Lq71;->γ:Lxx;

    .line 1337
    .line 1338
    if-eqz v3, :cond_20

    .line 1339
    .line 1340
    iget-object v9, v3, Lxx;->ξ:Ljava/lang/String;

    .line 1341
    .line 1342
    iget-object v10, v3, Lxx;->ν:Ljava/lang/String;

    .line 1343
    .line 1344
    const-string v11, "\u53d1\u5e03\u65f6\u95f4"

    .line 1345
    .line 1346
    invoke-virtual {v2}, Lf8;->θ()Ljava/lang/String;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v12

    .line 1350
    const v8, 0x7f0800a4

    .line 1351
    .line 1352
    .line 1353
    invoke-direct/range {v7 .. v12}, Lo71;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1357
    .line 1358
    .line 1359
    goto :goto_e

    .line 1360
    :cond_20
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1361
    .line 1362
    .line 1363
    const/16 v16, 0x0

    .line 1364
    .line 1365
    throw v16

    .line 1366
    :cond_21
    :goto_e
    invoke-static {v2, v0}, Lq71;->Ζ(Lf8;Landroid/app/Activity;)Ljava/lang/String;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v12

    .line 1370
    if-eqz v12, :cond_24

    .line 1371
    .line 1372
    invoke-static {v12}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1373
    .line 1374
    .line 1375
    move-result v2

    .line 1376
    if-eqz v2, :cond_22

    .line 1377
    .line 1378
    goto :goto_f

    .line 1379
    :cond_22
    new-instance v7, Lo71;

    .line 1380
    .line 1381
    sget-object v2, Lq71;->γ:Lxx;

    .line 1382
    .line 1383
    if-eqz v2, :cond_23

    .line 1384
    .line 1385
    iget-object v9, v2, Lxx;->σ:Ljava/lang/String;

    .line 1386
    .line 1387
    iget-object v10, v2, Lxx;->ρ:Ljava/lang/String;

    .line 1388
    .line 1389
    const-string v11, "\u53d1\u5e03\u5730\u5740"

    .line 1390
    .line 1391
    const v8, 0x7f08009e

    .line 1392
    .line 1393
    .line 1394
    invoke-direct/range {v7 .. v12}, Lo71;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1398
    .line 1399
    .line 1400
    goto :goto_f

    .line 1401
    :cond_23
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1402
    .line 1403
    .line 1404
    const/16 v16, 0x0

    .line 1405
    .line 1406
    throw v16

    .line 1407
    :cond_24
    :goto_f
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1408
    .line 1409
    .line 1410
    move-result v2

    .line 1411
    if-eqz v2, :cond_26

    .line 1412
    .line 1413
    const/4 v2, 0x0

    .line 1414
    :cond_25
    const/16 v16, 0x0

    .line 1415
    .line 1416
    goto/16 :goto_12

    .line 1417
    .line 1418
    :cond_26
    invoke-static {v0}, Lq71;->ψ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v2

    .line 1422
    const/4 v11, 0x0

    .line 1423
    invoke-virtual {v2, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v3

    .line 1427
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1428
    .line 1429
    .line 1430
    check-cast v3, Landroid/widget/LinearLayout;

    .line 1431
    .line 1432
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v1

    .line 1436
    const/4 v7, 0x0

    .line 1437
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1438
    .line 1439
    .line 1440
    move-result v8

    .line 1441
    if-eqz v8, :cond_25

    .line 1442
    .line 1443
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v8

    .line 1447
    add-int/lit8 v9, v7, 0x1

    .line 1448
    .line 1449
    if-ltz v7, :cond_2b

    .line 1450
    .line 1451
    check-cast v8, Lo71;

    .line 1452
    .line 1453
    if-lez v7, :cond_28

    .line 1454
    .line 1455
    new-instance v7, Landroid/view/View;

    .line 1456
    .line 1457
    invoke-direct {v7, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1458
    .line 1459
    .line 1460
    sget-object v10, Lq71;->γ:Lxx;

    .line 1461
    .line 1462
    if-eqz v10, :cond_27

    .line 1463
    .line 1464
    iget-object v10, v10, Lxx;->ε:Ljava/lang/String;

    .line 1465
    .line 1466
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1467
    .line 1468
    .line 1469
    move-result v10

    .line 1470
    invoke-virtual {v7, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1471
    .line 1472
    .line 1473
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 1474
    .line 1475
    const/4 v11, 0x1

    .line 1476
    invoke-static {v0, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1477
    .line 1478
    .line 1479
    move-result v12

    .line 1480
    const/4 v15, -0x1

    .line 1481
    invoke-direct {v10, v15, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1482
    .line 1483
    .line 1484
    invoke-static {v0, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1485
    .line 1486
    .line 1487
    move-result v11

    .line 1488
    invoke-virtual {v10, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1489
    .line 1490
    .line 1491
    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1495
    .line 1496
    .line 1497
    goto :goto_11

    .line 1498
    :cond_27
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1499
    .line 1500
    .line 1501
    const/16 v16, 0x0

    .line 1502
    .line 1503
    throw v16

    .line 1504
    :cond_28
    :goto_11
    new-instance v7, Landroid/widget/LinearLayout;

    .line 1505
    .line 1506
    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1507
    .line 1508
    .line 1509
    const/4 v11, 0x0

    .line 1510
    invoke-virtual {v7, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1511
    .line 1512
    .line 1513
    const/16 v10, 0x10

    .line 1514
    .line 1515
    invoke-virtual {v7, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1516
    .line 1517
    .line 1518
    const/16 v10, 0xb

    .line 1519
    .line 1520
    invoke-static {v0, v10}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1521
    .line 1522
    .line 1523
    move-result v12

    .line 1524
    invoke-static {v0, v10}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1525
    .line 1526
    .line 1527
    move-result v10

    .line 1528
    invoke-virtual {v7, v11, v12, v11, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 1529
    .line 1530
    .line 1531
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 1532
    .line 1533
    const/4 v12, -0x2

    .line 1534
    const/4 v15, -0x1

    .line 1535
    invoke-direct {v10, v15, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1536
    .line 1537
    .line 1538
    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1539
    .line 1540
    .line 1541
    iget v10, v8, Lo71;->α:I

    .line 1542
    .line 1543
    iget-object v11, v8, Lo71;->β:Ljava/lang/String;

    .line 1544
    .line 1545
    iget-object v12, v8, Lo71;->γ:Ljava/lang/String;

    .line 1546
    .line 1547
    invoke-static {v0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1548
    .line 1549
    .line 1550
    move-result v14

    .line 1551
    invoke-static {v0, v10, v11, v12, v14}, Lq71;->Α(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;I)Landroid/widget/FrameLayout;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v10

    .line 1555
    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1556
    .line 1557
    .line 1558
    new-instance v10, Landroid/widget/LinearLayout;

    .line 1559
    .line 1560
    invoke-direct {v10, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1561
    .line 1562
    .line 1563
    const/4 v11, 0x1

    .line 1564
    invoke-virtual {v10, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1565
    .line 1566
    .line 1567
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 1568
    .line 1569
    const/4 v12, 0x0

    .line 1570
    const/high16 v14, 0x3f800000    # 1.0f

    .line 1571
    .line 1572
    const/4 v15, -0x2

    .line 1573
    invoke-direct {v11, v12, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1574
    .line 1575
    .line 1576
    const/16 v12, 0xa

    .line 1577
    .line 1578
    invoke-static {v0, v12}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1579
    .line 1580
    .line 1581
    move-result v15

    .line 1582
    invoke-virtual {v11, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1583
    .line 1584
    .line 1585
    const/16 v12, 0x8

    .line 1586
    .line 1587
    invoke-static {v0, v12}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1588
    .line 1589
    .line 1590
    move-result v15

    .line 1591
    invoke-virtual {v11, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1592
    .line 1593
    .line 1594
    invoke-virtual {v10, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1595
    .line 1596
    .line 1597
    new-instance v11, Landroid/widget/TextView;

    .line 1598
    .line 1599
    invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1600
    .line 1601
    .line 1602
    iget-object v12, v8, Lo71;->δ:Ljava/lang/String;

    .line 1603
    .line 1604
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1605
    .line 1606
    .line 1607
    const/high16 v12, 0x41300000    # 11.0f

    .line 1608
    .line 1609
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1610
    .line 1611
    .line 1612
    sget-object v12, Lq71;->γ:Lxx;

    .line 1613
    .line 1614
    if-eqz v12, :cond_2a

    .line 1615
    .line 1616
    iget-object v12, v12, Lxx;->θ:Ljava/lang/String;

    .line 1617
    .line 1618
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1619
    .line 1620
    .line 1621
    move-result v12

    .line 1622
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1623
    .line 1624
    .line 1625
    invoke-virtual {v10, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1626
    .line 1627
    .line 1628
    new-instance v11, Landroid/widget/TextView;

    .line 1629
    .line 1630
    invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1631
    .line 1632
    .line 1633
    iget-object v12, v8, Lo71;->ε:Ljava/lang/String;

    .line 1634
    .line 1635
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1636
    .line 1637
    .line 1638
    const/high16 v12, 0x41500000    # 13.0f

    .line 1639
    .line 1640
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1641
    .line 1642
    .line 1643
    sget-object v12, Lq71;->γ:Lxx;

    .line 1644
    .line 1645
    if-eqz v12, :cond_29

    .line 1646
    .line 1647
    iget-object v12, v12, Lxx;->η:Ljava/lang/String;

    .line 1648
    .line 1649
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1650
    .line 1651
    .line 1652
    move-result v12

    .line 1653
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1654
    .line 1655
    .line 1656
    const/4 v12, 0x4

    .line 1657
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1658
    .line 1659
    .line 1660
    const/4 v15, 0x0

    .line 1661
    invoke-virtual {v11, v15}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1662
    .line 1663
    .line 1664
    const/4 v15, 0x2

    .line 1665
    invoke-static {v0, v15}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1666
    .line 1667
    .line 1668
    move-result v5

    .line 1669
    const/4 v15, 0x0

    .line 1670
    invoke-virtual {v11, v15, v5, v15, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1671
    .line 1672
    .line 1673
    invoke-virtual {v10, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1677
    .line 1678
    .line 1679
    invoke-static {v0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1680
    .line 1681
    .line 1682
    move-result v5

    .line 1683
    new-instance v10, Lz61;

    .line 1684
    .line 1685
    invoke-direct {v10, v0, v15, v8}, Lz61;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1686
    .line 1687
    .line 1688
    invoke-static {v5, v10, v0}, Lq71;->ω(ILp70;Landroid/app/Activity;)Landroid/widget/ImageView;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v5

    .line 1692
    invoke-virtual {v7, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1696
    .line 1697
    .line 1698
    move v7, v9

    .line 1699
    const/16 v5, 0x2a

    .line 1700
    .line 1701
    goto/16 :goto_10

    .line 1702
    .line 1703
    :cond_29
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1704
    .line 1705
    .line 1706
    const/16 v16, 0x0

    .line 1707
    .line 1708
    throw v16

    .line 1709
    :cond_2a
    const/16 v16, 0x0

    .line 1710
    .line 1711
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1712
    .line 1713
    .line 1714
    throw v16

    .line 1715
    :cond_2b
    const/16 v16, 0x0

    .line 1716
    .line 1717
    invoke-static {}, Lyh;->х()V

    .line 1718
    .line 1719
    .line 1720
    throw v16

    .line 1721
    :goto_12
    if-eqz v2, :cond_30

    .line 1722
    .line 1723
    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1724
    .line 1725
    .line 1726
    const/16 v1, 0x8

    .line 1727
    .line 1728
    invoke-static {v0, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1729
    .line 1730
    .line 1731
    move-result v2

    .line 1732
    invoke-static {v0, v2}, Lq71;->Μ(Landroid/app/Activity;I)Landroid/view/View;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v1

    .line 1736
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1737
    .line 1738
    .line 1739
    goto :goto_13

    .line 1740
    :cond_2c
    const/16 v16, 0x0

    .line 1741
    .line 1742
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1743
    .line 1744
    .line 1745
    throw v16

    .line 1746
    :cond_2d
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1747
    .line 1748
    .line 1749
    throw v16

    .line 1750
    :cond_2e
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1751
    .line 1752
    .line 1753
    throw v16

    .line 1754
    :cond_2f
    move-object/from16 v20, v1

    .line 1755
    .line 1756
    move-object/from16 v17, v5

    .line 1757
    .line 1758
    move-object/from16 v19, v10

    .line 1759
    .line 1760
    move-object/from16 v21, v12

    .line 1761
    .line 1762
    :cond_30
    :goto_13
    invoke-virtual/range {p0 .. p1}, Lq71;->ε(Landroid/app/Activity;)Landroid/widget/LinearLayout;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v1

    .line 1766
    if-eqz v1, :cond_31

    .line 1767
    .line 1768
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1769
    .line 1770
    const/4 v12, -0x2

    .line 1771
    const/4 v15, -0x1

    .line 1772
    invoke-direct {v2, v15, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1773
    .line 1774
    .line 1775
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1776
    .line 1777
    .line 1778
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1779
    .line 1780
    .line 1781
    const/16 v1, 0x8

    .line 1782
    .line 1783
    invoke-static {v0, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1784
    .line 1785
    .line 1786
    move-result v1

    .line 1787
    invoke-static {v0, v1}, Lq71;->Μ(Landroid/app/Activity;I)Landroid/view/View;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v1

    .line 1791
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1792
    .line 1793
    .line 1794
    :cond_31
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1795
    .line 1796
    .line 1797
    move-result v1

    .line 1798
    if-eqz v1, :cond_33

    .line 1799
    .line 1800
    invoke-static {v0}, Lq71;->ψ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v1

    .line 1804
    const/4 v11, 0x0

    .line 1805
    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v2

    .line 1809
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1810
    .line 1811
    .line 1812
    check-cast v2, Landroid/widget/LinearLayout;

    .line 1813
    .line 1814
    const/16 v3, 0x11

    .line 1815
    .line 1816
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1817
    .line 1818
    .line 1819
    new-instance v4, Landroid/widget/TextView;

    .line 1820
    .line 1821
    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1822
    .line 1823
    .line 1824
    const-string v5, "\u6682\u65e0\u53ef\u7528\u64cd\u4f5c\n\u8bf7\u6ed1\u52a8\u5230\u89c6\u9891\u6216\u56fe\u6587\u5185\u5bb9\u540e\u91cd\u8bd5"

    .line 1825
    .line 1826
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1827
    .line 1828
    .line 1829
    const/high16 v8, 0x41500000    # 13.0f

    .line 1830
    .line 1831
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1832
    .line 1833
    .line 1834
    sget-object v5, Lq71;->γ:Lxx;

    .line 1835
    .line 1836
    if-eqz v5, :cond_32

    .line 1837
    .line 1838
    iget-object v5, v5, Lxx;->θ:Ljava/lang/String;

    .line 1839
    .line 1840
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1841
    .line 1842
    .line 1843
    move-result v5

    .line 1844
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1845
    .line 1846
    .line 1847
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 1848
    .line 1849
    .line 1850
    const/16 v9, 0x10

    .line 1851
    .line 1852
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1853
    .line 1854
    .line 1855
    move-result v3

    .line 1856
    const/16 v5, 0x14

    .line 1857
    .line 1858
    invoke-static {v0, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1859
    .line 1860
    .line 1861
    move-result v7

    .line 1862
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1863
    .line 1864
    .line 1865
    move-result v8

    .line 1866
    invoke-static {v0, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1867
    .line 1868
    .line 1869
    move-result v5

    .line 1870
    invoke-virtual {v4, v3, v7, v8, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1871
    .line 1872
    .line 1873
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1874
    .line 1875
    .line 1876
    goto/16 :goto_1a

    .line 1877
    .line 1878
    :cond_32
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1879
    .line 1880
    .line 1881
    const/16 v16, 0x0

    .line 1882
    .line 1883
    throw v16

    .line 1884
    :cond_33
    invoke-static {v0}, Lq71;->ψ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v1

    .line 1888
    const/4 v11, 0x0

    .line 1889
    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1890
    .line 1891
    .line 1892
    move-result-object v2

    .line 1893
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1894
    .line 1895
    .line 1896
    check-cast v2, Landroid/widget/LinearLayout;

    .line 1897
    .line 1898
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v3

    .line 1902
    const/4 v4, 0x0

    .line 1903
    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1904
    .line 1905
    .line 1906
    move-result v5

    .line 1907
    if-eqz v5, :cond_3f

    .line 1908
    .line 1909
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v5

    .line 1913
    add-int/lit8 v7, v4, 0x1

    .line 1914
    .line 1915
    if-ltz v4, :cond_3e

    .line 1916
    .line 1917
    check-cast v5, Lj71;

    .line 1918
    .line 1919
    if-lez v4, :cond_35

    .line 1920
    .line 1921
    new-instance v4, Landroid/view/View;

    .line 1922
    .line 1923
    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1924
    .line 1925
    .line 1926
    sget-object v8, Lq71;->γ:Lxx;

    .line 1927
    .line 1928
    if-eqz v8, :cond_34

    .line 1929
    .line 1930
    iget-object v8, v8, Lxx;->ε:Ljava/lang/String;

    .line 1931
    .line 1932
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1933
    .line 1934
    .line 1935
    move-result v8

    .line 1936
    invoke-virtual {v4, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1937
    .line 1938
    .line 1939
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 1940
    .line 1941
    const/4 v9, 0x1

    .line 1942
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1943
    .line 1944
    .line 1945
    move-result v10

    .line 1946
    const/4 v15, -0x1

    .line 1947
    invoke-direct {v8, v15, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1948
    .line 1949
    .line 1950
    const/16 v9, 0x2e

    .line 1951
    .line 1952
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1953
    .line 1954
    .line 1955
    move-result v9

    .line 1956
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1957
    .line 1958
    .line 1959
    invoke-virtual {v4, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1960
    .line 1961
    .line 1962
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1963
    .line 1964
    .line 1965
    goto :goto_15

    .line 1966
    :cond_34
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 1967
    .line 1968
    .line 1969
    const/16 v16, 0x0

    .line 1970
    .line 1971
    throw v16

    .line 1972
    :cond_35
    :goto_15
    new-instance v4, Landroid/widget/LinearLayout;

    .line 1973
    .line 1974
    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1975
    .line 1976
    .line 1977
    const/4 v11, 0x0

    .line 1978
    invoke-virtual {v4, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1979
    .line 1980
    .line 1981
    const/16 v9, 0x10

    .line 1982
    .line 1983
    invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1984
    .line 1985
    .line 1986
    const/16 v8, 0xc

    .line 1987
    .line 1988
    invoke-static {v0, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1989
    .line 1990
    .line 1991
    move-result v10

    .line 1992
    invoke-static {v0, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1993
    .line 1994
    .line 1995
    move-result v12

    .line 1996
    invoke-virtual {v4, v11, v10, v11, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 1997
    .line 1998
    .line 1999
    const/4 v10, 0x1

    .line 2000
    invoke-virtual {v4, v10}, Landroid/view/View;->setClickable(Z)V

    .line 2001
    .line 2002
    .line 2003
    invoke-virtual {v4, v10}, Landroid/view/View;->setFocusable(Z)V

    .line 2004
    .line 2005
    .line 2006
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 2007
    .line 2008
    const/4 v12, -0x2

    .line 2009
    const/4 v15, -0x1

    .line 2010
    invoke-direct {v8, v15, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2011
    .line 2012
    .line 2013
    invoke-virtual {v4, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2014
    .line 2015
    .line 2016
    sget-object v8, Lq71;->γ:Lxx;

    .line 2017
    .line 2018
    if-eqz v8, :cond_3d

    .line 2019
    .line 2020
    iget-object v8, v8, Lxx;->Α:Ljava/lang/String;

    .line 2021
    .line 2022
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2023
    .line 2024
    .line 2025
    move-result v8

    .line 2026
    invoke-static {v8}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v8

    .line 2030
    invoke-static {v11}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 2031
    .line 2032
    .line 2033
    move-result-object v10

    .line 2034
    new-instance v11, Landroid/graphics/drawable/RippleDrawable;

    .line 2035
    .line 2036
    const/4 v15, 0x0

    .line 2037
    invoke-direct {v11, v8, v10, v15}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2038
    .line 2039
    .line 2040
    invoke-virtual {v4, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2041
    .line 2042
    .line 2043
    new-instance v8, Ll9;

    .line 2044
    .line 2045
    const/16 v11, 0xa

    .line 2046
    .line 2047
    invoke-direct {v8, v5, v11, v6}, Ll9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2048
    .line 2049
    .line 2050
    invoke-virtual {v4, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2051
    .line 2052
    .line 2053
    iget-object v8, v5, Lj71;->ι:Lp70;

    .line 2054
    .line 2055
    iget-object v10, v5, Lj71;->β:Ljava/lang/String;

    .line 2056
    .line 2057
    iget-boolean v11, v5, Lj71;->η:Z

    .line 2058
    .line 2059
    if-eqz v8, :cond_36

    .line 2060
    .line 2061
    new-instance v12, Lt61;

    .line 2062
    .line 2063
    const/4 v14, 0x1

    .line 2064
    invoke-direct {v12, v14, v8}, Lt61;-><init>(ILjava/lang/Object;)V

    .line 2065
    .line 2066
    .line 2067
    invoke-virtual {v4, v12}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 2068
    .line 2069
    .line 2070
    :cond_36
    iget v8, v5, Lj71;->δ:I

    .line 2071
    .line 2072
    iget-object v12, v5, Lj71;->ε:Ljava/lang/String;

    .line 2073
    .line 2074
    iget-object v14, v5, Lj71;->ζ:Ljava/lang/String;

    .line 2075
    .line 2076
    const/16 v15, 0x22

    .line 2077
    .line 2078
    invoke-static {v0, v15}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 2079
    .line 2080
    .line 2081
    move-result v15

    .line 2082
    invoke-static {v0, v8, v12, v14, v15}, Lq71;->Α(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;I)Landroid/widget/FrameLayout;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v8

    .line 2086
    invoke-virtual {v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2087
    .line 2088
    .line 2089
    new-instance v8, Landroid/widget/LinearLayout;

    .line 2090
    .line 2091
    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2092
    .line 2093
    .line 2094
    const/4 v14, 0x1

    .line 2095
    invoke-virtual {v8, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2096
    .line 2097
    .line 2098
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 2099
    .line 2100
    const/4 v14, -0x2

    .line 2101
    const/4 v15, -0x1

    .line 2102
    invoke-direct {v12, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2103
    .line 2104
    .line 2105
    const/16 v14, 0xc

    .line 2106
    .line 2107
    invoke-static {v0, v14}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 2108
    .line 2109
    .line 2110
    move-result v15

    .line 2111
    invoke-virtual {v12, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 2112
    .line 2113
    .line 2114
    invoke-virtual {v8, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2115
    .line 2116
    .line 2117
    new-instance v12, Landroid/widget/TextView;

    .line 2118
    .line 2119
    invoke-direct {v12, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2120
    .line 2121
    .line 2122
    iget-object v15, v5, Lj71;->α:Ljava/lang/String;

    .line 2123
    .line 2124
    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2125
    .line 2126
    .line 2127
    const/high16 v15, 0x41600000    # 14.0f

    .line 2128
    .line 2129
    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2130
    .line 2131
    .line 2132
    sget-object v9, Lq71;->γ:Lxx;

    .line 2133
    .line 2134
    if-eqz v11, :cond_38

    .line 2135
    .line 2136
    if-eqz v9, :cond_37

    .line 2137
    .line 2138
    iget-object v9, v9, Lxx;->θ:Ljava/lang/String;

    .line 2139
    .line 2140
    goto :goto_16

    .line 2141
    :cond_37
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2142
    .line 2143
    .line 2144
    const/16 v16, 0x0

    .line 2145
    .line 2146
    throw v16

    .line 2147
    :cond_38
    if-eqz v9, :cond_3c

    .line 2148
    .line 2149
    iget-object v9, v9, Lxx;->ζ:Ljava/lang/String;

    .line 2150
    .line 2151
    :goto_16
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2152
    .line 2153
    .line 2154
    move-result v9

    .line 2155
    invoke-virtual {v12, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2156
    .line 2157
    .line 2158
    iget-boolean v5, v5, Lj71;->γ:Z

    .line 2159
    .line 2160
    if-eqz v5, :cond_39

    .line 2161
    .line 2162
    if-nez v11, :cond_39

    .line 2163
    .line 2164
    const/4 v5, 0x1

    .line 2165
    :goto_17
    const/4 v11, 0x0

    .line 2166
    goto :goto_18

    .line 2167
    :cond_39
    const/4 v5, 0x0

    .line 2168
    goto :goto_17

    .line 2169
    :goto_18
    invoke-virtual {v12, v11, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 2170
    .line 2171
    .line 2172
    const/4 v9, 0x1

    .line 2173
    invoke-virtual {v12, v9}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 2174
    .line 2175
    .line 2176
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 2177
    .line 2178
    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 2179
    .line 2180
    .line 2181
    invoke-virtual {v8, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2182
    .line 2183
    .line 2184
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2185
    .line 2186
    .line 2187
    move-result v9

    .line 2188
    if-eqz v9, :cond_3a

    .line 2189
    .line 2190
    goto :goto_19

    .line 2191
    :cond_3a
    const/high16 v12, 0x41300000    # 11.0f

    .line 2192
    .line 2193
    invoke-static {v0, v10, v12}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v9

    .line 2197
    sget-object v10, Lq71;->γ:Lxx;

    .line 2198
    .line 2199
    if-eqz v10, :cond_3b

    .line 2200
    .line 2201
    iget-object v10, v10, Lxx;->θ:Ljava/lang/String;

    .line 2202
    .line 2203
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2204
    .line 2205
    .line 2206
    move-result v10

    .line 2207
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2208
    .line 2209
    .line 2210
    const/4 v10, 0x2

    .line 2211
    invoke-static {v0, v10}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 2212
    .line 2213
    .line 2214
    move-result v11

    .line 2215
    const/4 v12, 0x0

    .line 2216
    invoke-virtual {v9, v12, v11, v12, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 2217
    .line 2218
    .line 2219
    const/4 v10, 0x1

    .line 2220
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 2221
    .line 2222
    .line 2223
    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 2224
    .line 2225
    .line 2226
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2227
    .line 2228
    .line 2229
    :goto_19
    invoke-virtual {v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2230
    .line 2231
    .line 2232
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2233
    .line 2234
    .line 2235
    move v4, v7

    .line 2236
    goto/16 :goto_14

    .line 2237
    .line 2238
    :cond_3b
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2239
    .line 2240
    .line 2241
    const/16 v16, 0x0

    .line 2242
    .line 2243
    throw v16

    .line 2244
    :cond_3c
    const/16 v16, 0x0

    .line 2245
    .line 2246
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2247
    .line 2248
    .line 2249
    throw v16

    .line 2250
    :cond_3d
    const/16 v16, 0x0

    .line 2251
    .line 2252
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2253
    .line 2254
    .line 2255
    throw v16

    .line 2256
    :cond_3e
    const/16 v16, 0x0

    .line 2257
    .line 2258
    invoke-static {}, Lyh;->х()V

    .line 2259
    .line 2260
    .line 2261
    throw v16

    .line 2262
    :cond_3f
    :goto_1a
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2263
    .line 2264
    .line 2265
    const/16 v1, 0xe

    .line 2266
    .line 2267
    invoke-static {v0, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 2268
    .line 2269
    .line 2270
    move-result v1

    .line 2271
    invoke-static {v0, v1}, Lq71;->Μ(Landroid/app/Activity;I)Landroid/view/View;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v1

    .line 2275
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2276
    .line 2277
    .line 2278
    new-instance v1, Landroid/widget/LinearLayout;

    .line 2279
    .line 2280
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2281
    .line 2282
    .line 2283
    const/4 v9, 0x1

    .line 2284
    invoke-virtual {v1, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2285
    .line 2286
    .line 2287
    const/16 v3, 0x11

    .line 2288
    .line 2289
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 2290
    .line 2291
    .line 2292
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 2293
    .line 2294
    const/4 v12, -0x2

    .line 2295
    const/4 v15, -0x1

    .line 2296
    invoke-direct {v2, v15, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2297
    .line 2298
    .line 2299
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2300
    .line 2301
    .line 2302
    new-instance v2, Landroid/view/View;

    .line 2303
    .line 2304
    invoke-direct {v2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2305
    .line 2306
    .line 2307
    sget-object v3, Lq71;->γ:Lxx;

    .line 2308
    .line 2309
    if-eqz v3, :cond_43

    .line 2310
    .line 2311
    iget-object v3, v3, Lxx;->ε:Ljava/lang/String;

    .line 2312
    .line 2313
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2314
    .line 2315
    .line 2316
    move-result v3

    .line 2317
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2318
    .line 2319
    .line 2320
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 2321
    .line 2322
    const/16 v4, 0x28

    .line 2323
    .line 2324
    invoke-static {v0, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 2325
    .line 2326
    .line 2327
    move-result v4

    .line 2328
    const/4 v9, 0x1

    .line 2329
    invoke-static {v0, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 2330
    .line 2331
    .line 2332
    move-result v5

    .line 2333
    invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2334
    .line 2335
    .line 2336
    iput v9, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 2337
    .line 2338
    const/16 v11, 0xa

    .line 2339
    .line 2340
    invoke-static {v0, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 2341
    .line 2342
    .line 2343
    move-result v4

    .line 2344
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 2345
    .line 2346
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2347
    .line 2348
    .line 2349
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2350
    .line 2351
    .line 2352
    new-instance v2, Landroid/widget/TextView;

    .line 2353
    .line 2354
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2355
    .line 2356
    .line 2357
    const-string v3, "\u7f8e\u597d\u7684\u4e00\u5929\uff0c\u4ece\u5206\u4eab\u7cbe\u5f69\u5f00\u59cb"

    .line 2358
    .line 2359
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2360
    .line 2361
    .line 2362
    const/high16 v12, 0x41300000    # 11.0f

    .line 2363
    .line 2364
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2365
    .line 2366
    .line 2367
    sget-object v3, Lq71;->γ:Lxx;

    .line 2368
    .line 2369
    if-eqz v3, :cond_42

    .line 2370
    .line 2371
    iget-object v3, v3, Lxx;->θ:Ljava/lang/String;

    .line 2372
    .line 2373
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2374
    .line 2375
    .line 2376
    move-result v3

    .line 2377
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2378
    .line 2379
    .line 2380
    const/16 v3, 0x11

    .line 2381
    .line 2382
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 2383
    .line 2384
    .line 2385
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2386
    .line 2387
    .line 2388
    move-object/from16 v4, v21

    .line 2389
    .line 2390
    const/high16 v2, 0x41200000    # 10.0f

    .line 2391
    .line 2392
    invoke-static {v0, v4, v2}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 2393
    .line 2394
    .line 2395
    move-result-object v2

    .line 2396
    sget-object v4, Lq71;->γ:Lxx;

    .line 2397
    .line 2398
    if-eqz v4, :cond_41

    .line 2399
    .line 2400
    iget-object v4, v4, Lxx;->Β:Ljava/lang/String;

    .line 2401
    .line 2402
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2403
    .line 2404
    .line 2405
    move-result v4

    .line 2406
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2407
    .line 2408
    .line 2409
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 2410
    .line 2411
    .line 2412
    const/4 v5, 0x3

    .line 2413
    invoke-static {v0, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 2414
    .line 2415
    .line 2416
    move-result v3

    .line 2417
    const/4 v11, 0x0

    .line 2418
    invoke-virtual {v2, v11, v3, v11, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 2419
    .line 2420
    .line 2421
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2422
    .line 2423
    .line 2424
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2425
    .line 2426
    .line 2427
    move-object/from16 v1, v20

    .line 2428
    .line 2429
    invoke-virtual {v1, v13}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 2430
    .line 2431
    .line 2432
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2433
    .line 2434
    .line 2435
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 2436
    .line 2437
    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2438
    .line 2439
    .line 2440
    invoke-virtual {v1, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v1

    .line 2444
    const/4 v9, 0x1

    .line 2445
    invoke-virtual {v1, v9}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v1

    .line 2449
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v1

    .line 2453
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2454
    .line 2455
    .line 2456
    new-instance v2, Li9;

    .line 2457
    .line 2458
    const/4 v15, 0x2

    .line 2459
    invoke-direct {v2, v15, v0}, Li9;-><init>(ILjava/lang/Object;)V

    .line 2460
    .line 2461
    .line 2462
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 2463
    .line 2464
    .line 2465
    new-instance v2, Lvg;

    .line 2466
    .line 2467
    const/4 v3, 0x5

    .line 2468
    invoke-direct {v2, v3, v0}, Lvg;-><init>(ILjava/lang/Object;)V

    .line 2469
    .line 2470
    .line 2471
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 2472
    .line 2473
    .line 2474
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2475
    .line 2476
    .line 2477
    move-result-object v0

    .line 2478
    if-eqz v0, :cond_40

    .line 2479
    .line 2480
    const v2, 0x106000d

    .line 2481
    .line 2482
    .line 2483
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 2484
    .line 2485
    .line 2486
    const v2, 0x3ee66666    # 0.45f

    .line 2487
    .line 2488
    .line 2489
    invoke-virtual {v0, v2}, Landroid/view/Window;->setDimAmount(F)V

    .line 2490
    .line 2491
    .line 2492
    const/4 v15, 0x2

    .line 2493
    invoke-virtual {v0, v15}, Landroid/view/Window;->addFlags(I)V

    .line 2494
    .line 2495
    .line 2496
    :cond_40
    invoke-virtual {v6, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 2497
    .line 2498
    .line 2499
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 2500
    .line 2501
    .line 2502
    return-void

    .line 2503
    :cond_41
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2504
    .line 2505
    .line 2506
    const/16 v16, 0x0

    .line 2507
    .line 2508
    throw v16

    .line 2509
    :cond_42
    const/16 v16, 0x0

    .line 2510
    .line 2511
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2512
    .line 2513
    .line 2514
    throw v16

    .line 2515
    :cond_43
    const/16 v16, 0x0

    .line 2516
    .line 2517
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2518
    .line 2519
    .line 2520
    throw v16

    .line 2521
    :cond_44
    move-object/from16 v16, v4

    .line 2522
    .line 2523
    move-object/from16 v19, v10

    .line 2524
    .line 2525
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2526
    .line 2527
    .line 2528
    throw v16

    .line 2529
    :cond_45
    move-object/from16 v16, v4

    .line 2530
    .line 2531
    move-object/from16 v19, v10

    .line 2532
    .line 2533
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2534
    .line 2535
    .line 2536
    throw v16

    .line 2537
    :cond_46
    move-object/from16 v16, v4

    .line 2538
    .line 2539
    move-object/from16 v19, v10

    .line 2540
    .line 2541
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2542
    .line 2543
    .line 2544
    throw v16

    .line 2545
    :cond_47
    move-object/from16 v16, v4

    .line 2546
    .line 2547
    move-object/from16 v19, v10

    .line 2548
    .line 2549
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2550
    .line 2551
    .line 2552
    throw v16

    .line 2553
    :cond_48
    move-object/from16 v16, v4

    .line 2554
    .line 2555
    move-object/from16 v19, v10

    .line 2556
    .line 2557
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2558
    .line 2559
    .line 2560
    throw v16

    .line 2561
    :cond_49
    move-object/from16 v16, v4

    .line 2562
    .line 2563
    move-object/from16 v19, v10

    .line 2564
    .line 2565
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2566
    .line 2567
    .line 2568
    throw v16

    .line 2569
    :cond_4a
    move-object/from16 v16, v4

    .line 2570
    .line 2571
    move-object/from16 v19, v10

    .line 2572
    .line 2573
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2574
    .line 2575
    .line 2576
    throw v16

    .line 2577
    :cond_4b
    move-object/from16 v16, v4

    .line 2578
    .line 2579
    move-object/from16 v19, v10

    .line 2580
    .line 2581
    invoke-static/range {v19 .. v19}, Lln0;->и(Ljava/lang/String;)V

    .line 2582
    .line 2583
    .line 2584
    throw v16
.end method

.method public final Λ(Landroid/app/Activity;)V
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sput-object v2, Lq71;->γ:Lxx;

    .line 10
    .line 11
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    move-object v3, v1

    .line 20
    :cond_0
    invoke-virtual {v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->init(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    move-object v3, v1

    .line 32
    :cond_1
    invoke-virtual {v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->init(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    sget-object v2, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 36
    .line 37
    invoke-static {}, Lb10;->τ()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-static {}, Lq71;->Ε()Lf8;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v7, :cond_4

    .line 46
    .line 47
    sget-object v3, Ld72;->α:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    check-cast v3, Ljava/lang/Iterable;

    .line 57
    .line 58
    invoke-static {v3}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    const/4 v3, 0x0

    .line 70
    :goto_0
    if-nez v3, :cond_3

    .line 71
    .line 72
    invoke-static {v1}, Lp91;->Α(Landroid/app/Activity;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    :cond_3
    :goto_1
    move-object v6, v3

    .line 77
    goto :goto_2

    .line 78
    :cond_4
    sget-object v3, Ljz;->ε:Ljz;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :goto_2
    invoke-static {v2, v6, v7, v1}, Lq71;->γ(Lf8;Ljava/util/List;ZLandroid/app/Activity;)Ljava/util/ArrayList;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    sget-object v4, Lx01;->α:Lx01;

    .line 86
    .line 87
    const-string v5, "dialog_operation"

    .line 88
    .line 89
    const v8, 0x7f0c002f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v8, v1, v5}, Lx01;->γ(ILandroid/content/Context;Ljava/lang/String;)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    const-string v8, "op_root"

    .line 97
    .line 98
    const v9, 0x7f090239

    .line 99
    .line 100
    .line 101
    const-class v10, Landroid/widget/LinearLayout;

    .line 102
    .line 103
    invoke-static {v5, v8, v9, v10}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    check-cast v8, Landroid/widget/LinearLayout;

    .line 108
    .line 109
    const-string v9, "op_handle"

    .line 110
    .line 111
    const v11, 0x7f09022a

    .line 112
    .line 113
    .line 114
    const-class v12, Landroid/view/View;

    .line 115
    .line 116
    invoke-static {v5, v9, v11, v12}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    const-string v11, "op_bar"

    .line 121
    .line 122
    const v14, 0x7f090226

    .line 123
    .line 124
    .line 125
    invoke-static {v5, v11, v14, v12}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    const-string v14, "op_bar_divider"

    .line 130
    .line 131
    const v15, 0x7f090227

    .line 132
    .line 133
    .line 134
    invoke-static {v5, v14, v15, v12}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v14

    .line 138
    const-string v15, "op_iv_close"

    .line 139
    .line 140
    const v13, 0x7f09022d

    .line 141
    .line 142
    .line 143
    move-object/from16 v17, v6

    .line 144
    .line 145
    const-class v6, Landroid/widget/ImageView;

    .line 146
    .line 147
    invoke-static {v5, v15, v13, v6}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    check-cast v13, Landroid/widget/ImageView;

    .line 152
    .line 153
    const-string v15, "op_tv_title"

    .line 154
    .line 155
    move/from16 v18, v7

    .line 156
    .line 157
    const v7, 0x7f090249

    .line 158
    .line 159
    .line 160
    move-object/from16 v19, v3

    .line 161
    .line 162
    const-class v3, Landroid/widget/TextView;

    .line 163
    .line 164
    invoke-static {v5, v15, v7, v3}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    check-cast v7, Landroid/widget/TextView;

    .line 169
    .line 170
    const-string v15, "op_tv_mode"

    .line 171
    .line 172
    move-object/from16 v20, v2

    .line 173
    .line 174
    const v2, 0x7f090245

    .line 175
    .line 176
    .line 177
    invoke-static {v5, v15, v2, v3}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, Landroid/widget/TextView;

    .line 182
    .line 183
    const v15, 0x7f090240

    .line 184
    .line 185
    .line 186
    move-object/from16 v21, v4

    .line 187
    .line 188
    const-class v4, Landroid/widget/FrameLayout;

    .line 189
    .line 190
    move-object/from16 v22, v2

    .line 191
    .line 192
    const-string v2, "op_summary_host"

    .line 193
    .line 194
    invoke-static {v5, v2, v15, v4}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    check-cast v2, Landroid/widget/FrameLayout;

    .line 199
    .line 200
    const-string v4, "op_quick_title"

    .line 201
    .line 202
    const v15, 0x7f090237

    .line 203
    .line 204
    .line 205
    invoke-static {v5, v4, v15, v3}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    check-cast v4, Landroid/widget/TextView;

    .line 210
    .line 211
    const-string v15, "op_quick_actions"

    .line 212
    .line 213
    move-object/from16 v23, v4

    .line 214
    .line 215
    const v4, 0x7f090230

    .line 216
    .line 217
    .line 218
    invoke-static {v5, v15, v4, v10}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    move-object v15, v4

    .line 223
    check-cast v15, Landroid/widget/LinearLayout;

    .line 224
    .line 225
    const-string v4, "op_quick_previous"

    .line 226
    .line 227
    move-object/from16 v24, v15

    .line 228
    .line 229
    const v15, 0x7f090236

    .line 230
    .line 231
    .line 232
    invoke-static {v5, v4, v15, v6}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    move-object v15, v4

    .line 237
    check-cast v15, Landroid/widget/ImageView;

    .line 238
    .line 239
    const-string v4, "op_quick_next"

    .line 240
    .line 241
    move-object/from16 v25, v15

    .line 242
    .line 243
    const v15, 0x7f090234

    .line 244
    .line 245
    .line 246
    invoke-static {v5, v4, v15, v6}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    move-object v15, v4

    .line 251
    check-cast v15, Landroid/widget/ImageView;

    .line 252
    .line 253
    const-string v4, "op_quick_indicator"

    .line 254
    .line 255
    move-object/from16 v26, v15

    .line 256
    .line 257
    const v15, 0x7f090233

    .line 258
    .line 259
    .line 260
    invoke-static {v5, v4, v15, v3}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    move-object v15, v4

    .line 265
    check-cast v15, Landroid/widget/TextView;

    .line 266
    .line 267
    const-string v4, "op_quick_edit"

    .line 268
    .line 269
    move-object/from16 v27, v15

    .line 270
    .line 271
    const v15, 0x7f090231

    .line 272
    .line 273
    .line 274
    invoke-static {v5, v4, v15, v6}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    move-object v15, v4

    .line 279
    check-cast v15, Landroid/widget/ImageView;

    .line 280
    .line 281
    const-string v4, "op_tab_container"

    .line 282
    .line 283
    move-object/from16 v28, v15

    .line 284
    .line 285
    const v15, 0x7f090241

    .line 286
    .line 287
    .line 288
    invoke-static {v5, v4, v15, v10}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    check-cast v4, Landroid/widget/LinearLayout;

    .line 293
    .line 294
    const-string v15, "op_tab_work"

    .line 295
    .line 296
    move-object/from16 v29, v4

    .line 297
    .line 298
    const v4, 0x7f090243

    .line 299
    .line 300
    .line 301
    invoke-static {v5, v15, v4, v3}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    move-object v15, v4

    .line 306
    check-cast v15, Landroid/widget/TextView;

    .line 307
    .line 308
    const-string v4, "op_tab_tools"

    .line 309
    .line 310
    move-object/from16 v30, v15

    .line 311
    .line 312
    const v15, 0x7f090242

    .line 313
    .line 314
    .line 315
    invoke-static {v5, v4, v15, v3}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    move-object v15, v4

    .line 320
    check-cast v15, Landroid/widget/TextView;

    .line 321
    .line 322
    const v4, 0x7f09023b

    .line 323
    .line 324
    .line 325
    move-object/from16 v31, v15

    .line 326
    .line 327
    const-class v15, Landroid/widget/ScrollView;

    .line 328
    .line 329
    move-object/from16 v32, v2

    .line 330
    .line 331
    const-string v2, "op_scroll"

    .line 332
    .line 333
    invoke-static {v5, v2, v4, v15}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    move-object v15, v2

    .line 338
    check-cast v15, Landroid/widget/ScrollView;

    .line 339
    .line 340
    const-string v2, "op_content"

    .line 341
    .line 342
    const v4, 0x7f090229

    .line 343
    .line 344
    .line 345
    invoke-static {v5, v2, v4, v10}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    move-object/from16 v33, v2

    .line 350
    .line 351
    check-cast v33, Landroid/widget/LinearLayout;

    .line 352
    .line 353
    const-string v2, "op_bottom_divider"

    .line 354
    .line 355
    const v4, 0x7f090228

    .line 356
    .line 357
    .line 358
    invoke-static {v5, v2, v4, v12}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 359
    .line 360
    .line 361
    move-result-object v12

    .line 362
    const-string v2, "op_settings_row"

    .line 363
    .line 364
    const v4, 0x7f09023e

    .line 365
    .line 366
    .line 367
    invoke-static {v5, v2, v4, v10}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    move-object v10, v2

    .line 372
    check-cast v10, Landroid/widget/LinearLayout;

    .line 373
    .line 374
    const-string v2, "op_settings_icon"

    .line 375
    .line 376
    const v4, 0x7f09023d

    .line 377
    .line 378
    .line 379
    invoke-static {v5, v2, v4, v6}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    check-cast v2, Landroid/widget/ImageView;

    .line 384
    .line 385
    const-string v4, "op_settings_title"

    .line 386
    .line 387
    move-object/from16 v34, v2

    .line 388
    .line 389
    const v2, 0x7f09023f

    .line 390
    .line 391
    .line 392
    invoke-static {v5, v4, v2, v3}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    check-cast v2, Landroid/widget/TextView;

    .line 397
    .line 398
    const-string v3, "op_settings_chevron"

    .line 399
    .line 400
    const v4, 0x7f09023c

    .line 401
    .line 402
    .line 403
    invoke-static {v5, v3, v4, v6}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    check-cast v3, Landroid/widget/ImageView;

    .line 408
    .line 409
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 410
    .line 411
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 412
    .line 413
    .line 414
    sget-object v6, Lq71;->γ:Lxx;

    .line 415
    .line 416
    const-string v35, "theme"

    .line 417
    .line 418
    if-eqz v6, :cond_53

    .line 419
    .line 420
    iget-object v6, v6, Lxx;->β:Ljava/lang/String;

    .line 421
    .line 422
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 427
    .line 428
    .line 429
    const/16 v6, 0x14

    .line 430
    .line 431
    move-object/from16 v36, v2

    .line 432
    .line 433
    invoke-static {v1, v6}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    int-to-float v2, v2

    .line 438
    move/from16 v37, v2

    .line 439
    .line 440
    invoke-static {v1, v6}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    int-to-float v2, v2

    .line 445
    move/from16 v38, v2

    .line 446
    .line 447
    invoke-static {v1, v6}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    int-to-float v2, v2

    .line 452
    invoke-static {v1, v6}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    int-to-float v6, v6

    .line 457
    move-object/from16 v39, v15

    .line 458
    .line 459
    const/16 v15, 0x8

    .line 460
    .line 461
    move/from16 v40, v2

    .line 462
    .line 463
    new-array v2, v15, [F

    .line 464
    .line 465
    const/4 v15, 0x0

    .line 466
    aput v37, v2, v15

    .line 467
    .line 468
    const/4 v15, 0x1

    .line 469
    aput v38, v2, v15

    .line 470
    .line 471
    const/4 v15, 0x2

    .line 472
    aput v40, v2, v15

    .line 473
    .line 474
    const/4 v15, 0x3

    .line 475
    aput v6, v2, v15

    .line 476
    .line 477
    const/4 v6, 0x4

    .line 478
    const/4 v15, 0x0

    .line 479
    aput v15, v2, v6

    .line 480
    .line 481
    move/from16 v41, v15

    .line 482
    .line 483
    const/4 v15, 0x5

    .line 484
    aput v41, v2, v15

    .line 485
    .line 486
    const/16 v42, 0x6

    .line 487
    .line 488
    aput v41, v2, v42

    .line 489
    .line 490
    const/16 v42, 0x7

    .line 491
    .line 492
    aput v41, v2, v42

    .line 493
    .line 494
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v8, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 498
    .line 499
    .line 500
    const/4 v2, 0x1

    .line 501
    invoke-virtual {v8, v2}, Landroid/view/View;->setClipToOutline(Z)V

    .line 502
    .line 503
    .line 504
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 505
    .line 506
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 507
    .line 508
    .line 509
    sget-object v4, Lq71;->γ:Lxx;

    .line 510
    .line 511
    if-eqz v4, :cond_52

    .line 512
    .line 513
    iget-object v4, v4, Lxx;->θ:Ljava/lang/String;

    .line 514
    .line 515
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 516
    .line 517
    .line 518
    move-result v4

    .line 519
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 520
    .line 521
    .line 522
    const/4 v4, 0x2

    .line 523
    invoke-static {v1, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 524
    .line 525
    .line 526
    move-result v6

    .line 527
    int-to-float v4, v6

    .line 528
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v9, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 532
    .line 533
    .line 534
    sget-object v2, Lq71;->γ:Lxx;

    .line 535
    .line 536
    if-eqz v2, :cond_51

    .line 537
    .line 538
    iget-object v2, v2, Lxx;->β:Ljava/lang/String;

    .line 539
    .line 540
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 541
    .line 542
    .line 543
    move-result v2

    .line 544
    invoke-virtual {v11, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 545
    .line 546
    .line 547
    sget-object v2, Lq71;->γ:Lxx;

    .line 548
    .line 549
    if-eqz v2, :cond_50

    .line 550
    .line 551
    iget-object v2, v2, Lxx;->δ:Ljava/lang/String;

    .line 552
    .line 553
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    invoke-virtual {v14, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 558
    .line 559
    .line 560
    sget-object v2, Lq71;->γ:Lxx;

    .line 561
    .line 562
    if-eqz v2, :cond_4f

    .line 563
    .line 564
    iget-object v2, v2, Lxx;->δ:Ljava/lang/String;

    .line 565
    .line 566
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 567
    .line 568
    .line 569
    move-result v2

    .line 570
    invoke-virtual {v12, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 571
    .line 572
    .line 573
    const v2, 0x7f080097

    .line 574
    .line 575
    .line 576
    invoke-virtual {v13, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 577
    .line 578
    .line 579
    sget-object v2, Lq71;->γ:Lxx;

    .line 580
    .line 581
    if-eqz v2, :cond_4e

    .line 582
    .line 583
    iget-object v2, v2, Lxx;->η:Ljava/lang/String;

    .line 584
    .line 585
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    invoke-virtual {v13, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 594
    .line 595
    .line 596
    const-string v2, "\u5173\u95ed\u64cd\u4f5c\u9762\u677f"

    .line 597
    .line 598
    invoke-virtual {v13, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 599
    .line 600
    .line 601
    sget-object v2, Lq71;->γ:Lxx;

    .line 602
    .line 603
    if-eqz v2, :cond_4d

    .line 604
    .line 605
    iget-object v2, v2, Lxx;->Α:Ljava/lang/String;

    .line 606
    .line 607
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 616
    .line 617
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 618
    .line 619
    .line 620
    const/4 v6, 0x0

    .line 621
    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 622
    .line 623
    .line 624
    const/4 v6, 0x1

    .line 625
    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 626
    .line 627
    .line 628
    new-instance v9, Landroid/graphics/drawable/RippleDrawable;

    .line 629
    .line 630
    const/4 v11, 0x0

    .line 631
    invoke-direct {v9, v2, v4, v11}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v13, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 635
    .line 636
    .line 637
    new-instance v2, Lhb;

    .line 638
    .line 639
    const/16 v4, 0xf

    .line 640
    .line 641
    invoke-direct {v2, v5, v4}, Lhb;-><init>(Landroid/view/View;I)V

    .line 642
    .line 643
    .line 644
    invoke-static {v0, v13, v2}, Lq71;->Η(Lq71;Landroid/view/View;Lp70;)V

    .line 645
    .line 646
    .line 647
    sget-object v2, Lq71;->γ:Lxx;

    .line 648
    .line 649
    if-eqz v2, :cond_4c

    .line 650
    .line 651
    iget-object v2, v2, Lxx;->ζ:Ljava/lang/String;

    .line 652
    .line 653
    invoke-static {v2, v7, v11, v6}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 654
    .line 655
    .line 656
    if-eqz v18, :cond_5

    .line 657
    .line 658
    const-string v2, "\u4e3b\u9875"

    .line 659
    .line 660
    goto :goto_3

    .line 661
    :cond_5
    const-string v2, "\u89c6\u9891\u6d41"

    .line 662
    .line 663
    :goto_3
    if-eqz v18, :cond_7

    .line 664
    .line 665
    sget-object v4, Lq71;->γ:Lxx;

    .line 666
    .line 667
    if-eqz v4, :cond_6

    .line 668
    .line 669
    iget-object v4, v4, Lxx;->κ:Ljava/lang/String;

    .line 670
    .line 671
    const/16 v16, 0x0

    .line 672
    .line 673
    goto :goto_4

    .line 674
    :cond_6
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    const/16 v16, 0x0

    .line 678
    .line 679
    throw v16

    .line 680
    :cond_7
    const/16 v16, 0x0

    .line 681
    .line 682
    sget-object v4, Lq71;->γ:Lxx;

    .line 683
    .line 684
    if-eqz v4, :cond_4b

    .line 685
    .line 686
    iget-object v4, v4, Lxx;->μ:Ljava/lang/String;

    .line 687
    .line 688
    :goto_4
    sget-object v6, Lq71;->γ:Lxx;

    .line 689
    .line 690
    if-eqz v18, :cond_9

    .line 691
    .line 692
    if-eqz v6, :cond_8

    .line 693
    .line 694
    iget-object v6, v6, Lxx;->ι:Ljava/lang/String;

    .line 695
    .line 696
    :goto_5
    move-object/from16 v7, v22

    .line 697
    .line 698
    goto :goto_6

    .line 699
    :cond_8
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    throw v16

    .line 703
    :cond_9
    if-eqz v6, :cond_4a

    .line 704
    .line 705
    iget-object v6, v6, Lxx;->λ:Ljava/lang/String;

    .line 706
    .line 707
    goto :goto_5

    .line 708
    :goto_6
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 709
    .line 710
    .line 711
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 716
    .line 717
    .line 718
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 719
    .line 720
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 721
    .line 722
    .line 723
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 724
    .line 725
    .line 726
    move-result v4

    .line 727
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 728
    .line 729
    .line 730
    const/16 v4, 0xa

    .line 731
    .line 732
    invoke-static {v1, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 733
    .line 734
    .line 735
    move-result v6

    .line 736
    int-to-float v6, v6

    .line 737
    invoke-virtual {v2, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v7, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 741
    .line 742
    .line 743
    invoke-virtual/range {v32 .. v32}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 744
    .line 745
    .line 746
    move-object/from16 v2, v21

    .line 747
    .line 748
    invoke-virtual {v2, v1}, Lx01;->α(Landroid/content/Context;)Lw01;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    new-instance v6, Landroid/widget/LinearLayout;

    .line 753
    .line 754
    invoke-direct {v6, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 755
    .line 756
    .line 757
    const/4 v7, 0x0

    .line 758
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 759
    .line 760
    .line 761
    const/16 v7, 0x10

    .line 762
    .line 763
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 764
    .line 765
    .line 766
    const/16 v9, 0xc

    .line 767
    .line 768
    invoke-static {v1, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 769
    .line 770
    .line 771
    move-result v11

    .line 772
    invoke-static {v1, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 773
    .line 774
    .line 775
    move-result v13

    .line 776
    invoke-static {v1, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 777
    .line 778
    .line 779
    move-result v14

    .line 780
    invoke-static {v1, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 781
    .line 782
    .line 783
    move-result v4

    .line 784
    invoke-virtual {v6, v11, v13, v14, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 785
    .line 786
    .line 787
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 788
    .line 789
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 790
    .line 791
    .line 792
    sget-object v11, Lq71;->γ:Lxx;

    .line 793
    .line 794
    if-eqz v11, :cond_49

    .line 795
    .line 796
    iget-object v11, v11, Lxx;->γ:Ljava/lang/String;

    .line 797
    .line 798
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 799
    .line 800
    .line 801
    move-result v11

    .line 802
    invoke-virtual {v4, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 803
    .line 804
    .line 805
    const/16 v11, 0x8

    .line 806
    .line 807
    invoke-static {v1, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 808
    .line 809
    .line 810
    move-result v13

    .line 811
    int-to-float v11, v13

    .line 812
    invoke-virtual {v4, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v6, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 816
    .line 817
    .line 818
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 819
    .line 820
    const/4 v13, -0x1

    .line 821
    const/4 v11, -0x2

    .line 822
    invoke-direct {v4, v13, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v6, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 826
    .line 827
    .line 828
    new-instance v4, Landroid/widget/ImageView;

    .line 829
    .line 830
    invoke-direct {v4, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 831
    .line 832
    .line 833
    sget-object v14, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 834
    .line 835
    invoke-virtual {v4, v14}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 836
    .line 837
    .line 838
    move-object/from16 v14, v20

    .line 839
    .line 840
    iget-object v7, v14, Lf8;->ζ:Lh8;

    .line 841
    .line 842
    sget-object v13, Lh8;->η:Lh8;

    .line 843
    .line 844
    sget-object v15, Lh8;->ζ:Lh8;

    .line 845
    .line 846
    const v43, 0x7f08009d

    .line 847
    .line 848
    .line 849
    if-eq v7, v13, :cond_c

    .line 850
    .line 851
    invoke-virtual {v14}, Lf8;->λ()Z

    .line 852
    .line 853
    .line 854
    move-result v44

    .line 855
    if-eqz v44, :cond_a

    .line 856
    .line 857
    goto :goto_7

    .line 858
    :cond_a
    if-eq v7, v15, :cond_c

    .line 859
    .line 860
    invoke-virtual {v14}, Lf8;->κ()Z

    .line 861
    .line 862
    .line 863
    move-result v44

    .line 864
    if-eqz v44, :cond_b

    .line 865
    .line 866
    goto :goto_7

    .line 867
    :cond_b
    invoke-virtual {v14}, Lf8;->ι()Z

    .line 868
    .line 869
    .line 870
    move-result v43

    .line 871
    if-eqz v43, :cond_d

    .line 872
    .line 873
    invoke-virtual {v14}, Lf8;->ν()Z

    .line 874
    .line 875
    .line 876
    move-result v43

    .line 877
    if-nez v43, :cond_d

    .line 878
    .line 879
    const v43, 0x7f080091

    .line 880
    .line 881
    .line 882
    :cond_c
    :goto_7
    move/from16 v11, v43

    .line 883
    .line 884
    goto :goto_8

    .line 885
    :cond_d
    const v43, 0x7f0800a2

    .line 886
    .line 887
    .line 888
    goto :goto_7

    .line 889
    :goto_8
    invoke-virtual {v4, v11}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 890
    .line 891
    .line 892
    if-eq v7, v13, :cond_15

    .line 893
    .line 894
    invoke-virtual {v14}, Lf8;->λ()Z

    .line 895
    .line 896
    .line 897
    move-result v11

    .line 898
    if-eqz v11, :cond_e

    .line 899
    .line 900
    goto :goto_a

    .line 901
    :cond_e
    if-eq v7, v15, :cond_f

    .line 902
    .line 903
    invoke-virtual {v14}, Lf8;->κ()Z

    .line 904
    .line 905
    .line 906
    move-result v11

    .line 907
    if-eqz v11, :cond_10

    .line 908
    .line 909
    :cond_f
    const/16 v16, 0x0

    .line 910
    .line 911
    goto :goto_9

    .line 912
    :cond_10
    invoke-virtual {v14}, Lf8;->ι()Z

    .line 913
    .line 914
    .line 915
    move-result v11

    .line 916
    if-eqz v11, :cond_12

    .line 917
    .line 918
    invoke-virtual {v14}, Lf8;->ν()Z

    .line 919
    .line 920
    .line 921
    move-result v11

    .line 922
    if-nez v11, :cond_12

    .line 923
    .line 924
    sget-object v11, Lq71;->γ:Lxx;

    .line 925
    .line 926
    if-eqz v11, :cond_11

    .line 927
    .line 928
    iget-object v11, v11, Lxx;->ο:Ljava/lang/String;

    .line 929
    .line 930
    goto :goto_b

    .line 931
    :cond_11
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 932
    .line 933
    .line 934
    const/16 v16, 0x0

    .line 935
    .line 936
    throw v16

    .line 937
    :cond_12
    const/16 v16, 0x0

    .line 938
    .line 939
    sget-object v11, Lq71;->γ:Lxx;

    .line 940
    .line 941
    if-eqz v11, :cond_13

    .line 942
    .line 943
    iget-object v11, v11, Lxx;->ι:Ljava/lang/String;

    .line 944
    .line 945
    goto :goto_b

    .line 946
    :cond_13
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    throw v16

    .line 950
    :goto_9
    sget-object v11, Lq71;->γ:Lxx;

    .line 951
    .line 952
    if-eqz v11, :cond_14

    .line 953
    .line 954
    iget-object v11, v11, Lxx;->λ:Ljava/lang/String;

    .line 955
    .line 956
    goto :goto_b

    .line 957
    :cond_14
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 958
    .line 959
    .line 960
    throw v16

    .line 961
    :cond_15
    :goto_a
    sget-object v11, Lq71;->γ:Lxx;

    .line 962
    .line 963
    if-eqz v11, :cond_48

    .line 964
    .line 965
    iget-object v11, v11, Lxx;->ρ:Ljava/lang/String;

    .line 966
    .line 967
    :goto_b
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 968
    .line 969
    .line 970
    move-result v11

    .line 971
    invoke-static {v11}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 972
    .line 973
    .line 974
    move-result-object v11

    .line 975
    invoke-virtual {v4, v11}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 976
    .line 977
    .line 978
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    .line 979
    .line 980
    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 981
    .line 982
    .line 983
    if-eq v7, v13, :cond_1d

    .line 984
    .line 985
    invoke-virtual {v14}, Lf8;->λ()Z

    .line 986
    .line 987
    .line 988
    move-result v43

    .line 989
    if-eqz v43, :cond_16

    .line 990
    .line 991
    goto :goto_d

    .line 992
    :cond_16
    if-eq v7, v15, :cond_17

    .line 993
    .line 994
    invoke-virtual {v14}, Lf8;->κ()Z

    .line 995
    .line 996
    .line 997
    move-result v43

    .line 998
    if-eqz v43, :cond_18

    .line 999
    .line 1000
    :cond_17
    const/16 v16, 0x0

    .line 1001
    .line 1002
    goto :goto_c

    .line 1003
    :cond_18
    invoke-virtual {v14}, Lf8;->ι()Z

    .line 1004
    .line 1005
    .line 1006
    move-result v43

    .line 1007
    if-eqz v43, :cond_1a

    .line 1008
    .line 1009
    invoke-virtual {v14}, Lf8;->ν()Z

    .line 1010
    .line 1011
    .line 1012
    move-result v43

    .line 1013
    if-nez v43, :cond_1a

    .line 1014
    .line 1015
    sget-object v9, Lq71;->γ:Lxx;

    .line 1016
    .line 1017
    if-eqz v9, :cond_19

    .line 1018
    .line 1019
    iget-object v9, v9, Lxx;->π:Ljava/lang/String;

    .line 1020
    .line 1021
    goto :goto_e

    .line 1022
    :cond_19
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    const/16 v16, 0x0

    .line 1026
    .line 1027
    throw v16

    .line 1028
    :cond_1a
    const/16 v16, 0x0

    .line 1029
    .line 1030
    sget-object v9, Lq71;->γ:Lxx;

    .line 1031
    .line 1032
    if-eqz v9, :cond_1b

    .line 1033
    .line 1034
    iget-object v9, v9, Lxx;->κ:Ljava/lang/String;

    .line 1035
    .line 1036
    goto :goto_e

    .line 1037
    :cond_1b
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    throw v16

    .line 1041
    :goto_c
    sget-object v9, Lq71;->γ:Lxx;

    .line 1042
    .line 1043
    if-eqz v9, :cond_1c

    .line 1044
    .line 1045
    iget-object v9, v9, Lxx;->μ:Ljava/lang/String;

    .line 1046
    .line 1047
    goto :goto_e

    .line 1048
    :cond_1c
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    throw v16

    .line 1052
    :cond_1d
    :goto_d
    sget-object v9, Lq71;->γ:Lxx;

    .line 1053
    .line 1054
    if-eqz v9, :cond_47

    .line 1055
    .line 1056
    iget-object v9, v9, Lxx;->σ:Ljava/lang/String;

    .line 1057
    .line 1058
    :goto_e
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1059
    .line 1060
    .line 1061
    move-result v9

    .line 1062
    invoke-virtual {v11, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1063
    .line 1064
    .line 1065
    move-object/from16 v45, v3

    .line 1066
    .line 1067
    const/16 v9, 0x8

    .line 1068
    .line 1069
    invoke-static {v1, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1070
    .line 1071
    .line 1072
    move-result v3

    .line 1073
    int-to-float v3, v3

    .line 1074
    invoke-virtual {v11, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v4, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1078
    .line 1079
    .line 1080
    const/16 v3, 0xe

    .line 1081
    .line 1082
    invoke-static {v1, v3}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1083
    .line 1084
    .line 1085
    move-result v9

    .line 1086
    invoke-static {v1, v3}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1087
    .line 1088
    .line 1089
    move-result v11

    .line 1090
    move-object/from16 v46, v5

    .line 1091
    .line 1092
    invoke-static {v1, v3}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1093
    .line 1094
    .line 1095
    move-result v5

    .line 1096
    invoke-static {v1, v3}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1097
    .line 1098
    .line 1099
    move-result v3

    .line 1100
    invoke-virtual {v4, v9, v11, v5, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 1101
    .line 1102
    .line 1103
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 1104
    .line 1105
    const/16 v5, 0x40

    .line 1106
    .line 1107
    invoke-static {v1, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1108
    .line 1109
    .line 1110
    move-result v9

    .line 1111
    invoke-static {v1, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1112
    .line 1113
    .line 1114
    move-result v5

    .line 1115
    invoke-direct {v3, v9, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1116
    .line 1117
    .line 1118
    const/16 v5, 0xc

    .line 1119
    .line 1120
    invoke-static {v1, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1121
    .line 1122
    .line 1123
    move-result v5

    .line 1124
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1131
    .line 1132
    .line 1133
    iget-object v3, v14, Lf8;->Μ:Ljava/lang/String;

    .line 1134
    .line 1135
    iget-object v5, v14, Lf8;->Ο:Ljava/util/List;

    .line 1136
    .line 1137
    iget-object v9, v14, Lf8;->δ:Ljava/util/List;

    .line 1138
    .line 1139
    if-eqz v9, :cond_1e

    .line 1140
    .line 1141
    invoke-static {v9}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v9

    .line 1145
    check-cast v9, Ljava/lang/String;

    .line 1146
    .line 1147
    goto :goto_f

    .line 1148
    :cond_1e
    const/4 v9, 0x0

    .line 1149
    :goto_f
    iget-object v11, v14, Lf8;->Ε:Ljava/lang/String;

    .line 1150
    .line 1151
    if-eqz v5, :cond_1f

    .line 1152
    .line 1153
    invoke-static {v5}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v43

    .line 1157
    move-object/from16 v47, v5

    .line 1158
    .line 1159
    move-object/from16 v5, v43

    .line 1160
    .line 1161
    check-cast v5, Lqu0;

    .line 1162
    .line 1163
    if-eqz v5, :cond_20

    .line 1164
    .line 1165
    iget-object v5, v5, Lqu0;->δ:Ljava/lang/String;

    .line 1166
    .line 1167
    goto :goto_10

    .line 1168
    :cond_1f
    move-object/from16 v47, v5

    .line 1169
    .line 1170
    :cond_20
    const/4 v5, 0x0

    .line 1171
    :goto_10
    if-eqz v47, :cond_21

    .line 1172
    .line 1173
    invoke-static/range {v47 .. v47}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v43

    .line 1177
    move-object/from16 v47, v10

    .line 1178
    .line 1179
    move-object/from16 v10, v43

    .line 1180
    .line 1181
    check-cast v10, Lqu0;

    .line 1182
    .line 1183
    if-eqz v10, :cond_22

    .line 1184
    .line 1185
    iget-object v10, v10, Lqu0;->γ:Ljava/lang/String;

    .line 1186
    .line 1187
    goto :goto_11

    .line 1188
    :cond_21
    move-object/from16 v47, v10

    .line 1189
    .line 1190
    :cond_22
    const/4 v10, 0x0

    .line 1191
    :goto_11
    filled-new-array {v3, v9, v11, v5, v10}, [Ljava/lang/String;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v3

    .line 1195
    invoke-static {v3}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v3

    .line 1199
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v3

    .line 1203
    :cond_23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1204
    .line 1205
    .line 1206
    move-result v5

    .line 1207
    if-eqz v5, :cond_24

    .line 1208
    .line 1209
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v5

    .line 1213
    move-object v9, v5

    .line 1214
    check-cast v9, Ljava/lang/String;

    .line 1215
    .line 1216
    const-string v10, "http"

    .line 1217
    .line 1218
    const/4 v11, 0x1

    .line 1219
    invoke-static {v9, v10, v11}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1220
    .line 1221
    .line 1222
    move-result v9

    .line 1223
    if-eqz v9, :cond_23

    .line 1224
    .line 1225
    goto :goto_12

    .line 1226
    :cond_24
    const/4 v11, 0x1

    .line 1227
    const/4 v5, 0x0

    .line 1228
    :goto_12
    check-cast v5, Ljava/lang/String;

    .line 1229
    .line 1230
    if-nez v5, :cond_25

    .line 1231
    .line 1232
    goto :goto_13

    .line 1233
    :cond_25
    invoke-virtual {v4, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1234
    .line 1235
    .line 1236
    new-instance v3, Ljava/lang/Thread;

    .line 1237
    .line 1238
    new-instance v9, Lra;

    .line 1239
    .line 1240
    invoke-direct {v9, v5, v1, v4, v11}, Lra;-><init>(Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;I)V

    .line 1241
    .line 1242
    .line 1243
    invoke-direct {v3, v9}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 1247
    .line 1248
    .line 1249
    :goto_13
    new-instance v3, Landroid/widget/LinearLayout;

    .line 1250
    .line 1251
    invoke-direct {v3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1252
    .line 1253
    .line 1254
    invoke-virtual {v3, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1255
    .line 1256
    .line 1257
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 1258
    .line 1259
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1260
    .line 1261
    const/4 v5, 0x0

    .line 1262
    const/4 v10, -0x2

    .line 1263
    invoke-direct {v4, v5, v10, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1267
    .line 1268
    .line 1269
    new-instance v4, Landroid/widget/TextView;

    .line 1270
    .line 1271
    invoke-direct {v4, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1272
    .line 1273
    .line 1274
    iget-object v5, v14, Lf8;->β:Ljava/lang/String;

    .line 1275
    .line 1276
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v5

    .line 1280
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v5

    .line 1284
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v10

    .line 1288
    const-string v11, "\u672a\u77e5"

    .line 1289
    .line 1290
    if-nez v10, :cond_26

    .line 1291
    .line 1292
    const-string v10, "\u65e0\u63cf\u8ff0"

    .line 1293
    .line 1294
    invoke-virtual {v5, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1295
    .line 1296
    .line 1297
    move-result v10

    .line 1298
    if-nez v10, :cond_26

    .line 1299
    .line 1300
    invoke-virtual {v5, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1301
    .line 1302
    .line 1303
    move-result v10

    .line 1304
    if-nez v10, :cond_26

    .line 1305
    .line 1306
    goto :goto_18

    .line 1307
    :cond_26
    if-eq v7, v13, :cond_2f

    .line 1308
    .line 1309
    invoke-virtual {v14}, Lf8;->λ()Z

    .line 1310
    .line 1311
    .line 1312
    move-result v5

    .line 1313
    if-eqz v5, :cond_27

    .line 1314
    .line 1315
    goto :goto_17

    .line 1316
    :cond_27
    sget-object v5, Lh8;->ε:Lh8;

    .line 1317
    .line 1318
    if-eq v7, v5, :cond_2e

    .line 1319
    .line 1320
    invoke-virtual {v14}, Lf8;->ν()Z

    .line 1321
    .line 1322
    .line 1323
    move-result v5

    .line 1324
    if-eqz v5, :cond_28

    .line 1325
    .line 1326
    goto :goto_16

    .line 1327
    :cond_28
    if-eq v7, v15, :cond_2d

    .line 1328
    .line 1329
    invoke-virtual {v14}, Lf8;->κ()Z

    .line 1330
    .line 1331
    .line 1332
    move-result v5

    .line 1333
    if-eqz v5, :cond_29

    .line 1334
    .line 1335
    goto :goto_15

    .line 1336
    :cond_29
    invoke-virtual {v14}, Lf8;->ι()Z

    .line 1337
    .line 1338
    .line 1339
    move-result v5

    .line 1340
    if-eqz v5, :cond_2c

    .line 1341
    .line 1342
    iget-object v5, v14, Lf8;->Β:Ljava/lang/String;

    .line 1343
    .line 1344
    if-eqz v5, :cond_2b

    .line 1345
    .line 1346
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1347
    .line 1348
    .line 1349
    move-result v7

    .line 1350
    if-nez v7, :cond_2a

    .line 1351
    .line 1352
    goto :goto_14

    .line 1353
    :cond_2a
    const/4 v5, 0x0

    .line 1354
    :goto_14
    if-nez v5, :cond_30

    .line 1355
    .line 1356
    :cond_2b
    const-string v5, "\u97f3\u9891\u4f5c\u54c1"

    .line 1357
    .line 1358
    goto :goto_18

    .line 1359
    :cond_2c
    const-string v5, "\u5f53\u524d\u5185\u5bb9"

    .line 1360
    .line 1361
    goto :goto_18

    .line 1362
    :cond_2d
    :goto_15
    const-string v5, "\u56fe\u6587\u4f5c\u54c1"

    .line 1363
    .line 1364
    goto :goto_18

    .line 1365
    :cond_2e
    :goto_16
    const-string v5, "\u89c6\u9891\u4f5c\u54c1"

    .line 1366
    .line 1367
    goto :goto_18

    .line 1368
    :cond_2f
    :goto_17
    const-string v5, "LivePhoto / \u52a8\u56fe"

    .line 1369
    .line 1370
    :cond_30
    :goto_18
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1371
    .line 1372
    .line 1373
    const/high16 v5, 0x41700000    # 15.0f

    .line 1374
    .line 1375
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1376
    .line 1377
    .line 1378
    sget-object v5, Lq71;->γ:Lxx;

    .line 1379
    .line 1380
    if-eqz v5, :cond_46

    .line 1381
    .line 1382
    iget-object v5, v5, Lxx;->ζ:Ljava/lang/String;

    .line 1383
    .line 1384
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1385
    .line 1386
    .line 1387
    move-result v5

    .line 1388
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1389
    .line 1390
    .line 1391
    const/4 v5, 0x1

    .line 1392
    const/4 v7, 0x0

    .line 1393
    invoke-virtual {v4, v7, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 1394
    .line 1395
    .line 1396
    const/4 v5, 0x2

    .line 1397
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1398
    .line 1399
    .line 1400
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 1401
    .line 1402
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1406
    .line 1407
    .line 1408
    new-instance v4, Landroid/widget/TextView;

    .line 1409
    .line 1410
    invoke-direct {v4, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1411
    .line 1412
    .line 1413
    sget-object v7, Lx01;->α:Lx01;

    .line 1414
    .line 1415
    iget-object v10, v14, Lf8;->α:Ljava/lang/String;

    .line 1416
    .line 1417
    invoke-static {v10}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v10

    .line 1421
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v10

    .line 1425
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1426
    .line 1427
    .line 1428
    move-result v13

    .line 1429
    if-nez v13, :cond_31

    .line 1430
    .line 1431
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1432
    .line 1433
    .line 1434
    move-result v13

    .line 1435
    if-nez v13, :cond_31

    .line 1436
    .line 1437
    goto :goto_19

    .line 1438
    :cond_31
    const/4 v10, 0x0

    .line 1439
    :goto_19
    if-nez v10, :cond_32

    .line 1440
    .line 1441
    goto :goto_1a

    .line 1442
    :cond_32
    move-object v11, v10

    .line 1443
    :goto_1a
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v10

    .line 1447
    const v11, 0x7f0f0076

    .line 1448
    .line 1449
    .line 1450
    invoke-virtual {v7, v1, v11, v10}, Lx01;->η(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v7

    .line 1454
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1455
    .line 1456
    .line 1457
    const/high16 v7, 0x41400000    # 12.0f

    .line 1458
    .line 1459
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1460
    .line 1461
    .line 1462
    sget-object v7, Lq71;->γ:Lxx;

    .line 1463
    .line 1464
    if-eqz v7, :cond_45

    .line 1465
    .line 1466
    iget-object v7, v7, Lxx;->η:Ljava/lang/String;

    .line 1467
    .line 1468
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1469
    .line 1470
    .line 1471
    move-result v7

    .line 1472
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1473
    .line 1474
    .line 1475
    const/4 v11, 0x1

    .line 1476
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1480
    .line 1481
    .line 1482
    const/4 v5, 0x5

    .line 1483
    invoke-static {v1, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1484
    .line 1485
    .line 1486
    move-result v7

    .line 1487
    const/4 v5, 0x0

    .line 1488
    invoke-virtual {v4, v5, v7, v5, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1489
    .line 1490
    .line 1491
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1492
    .line 1493
    .line 1494
    new-instance v4, Ljava/util/ArrayList;

    .line 1495
    .line 1496
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1497
    .line 1498
    .line 1499
    invoke-virtual {v14}, Lf8;->θ()Ljava/lang/String;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v5

    .line 1503
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1504
    .line 1505
    .line 1506
    move-result v5

    .line 1507
    if-nez v5, :cond_33

    .line 1508
    .line 1509
    invoke-virtual {v14}, Lf8;->θ()Ljava/lang/String;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v5

    .line 1513
    const-string v7, "\u53d1\u5e03\u65f6\u95f4\uff1a"

    .line 1514
    .line 1515
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v5

    .line 1519
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1520
    .line 1521
    .line 1522
    :cond_33
    invoke-static {v14, v1}, Lq71;->Ζ(Lf8;Landroid/app/Activity;)Ljava/lang/String;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v5

    .line 1526
    if-eqz v5, :cond_35

    .line 1527
    .line 1528
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1529
    .line 1530
    .line 1531
    move-result v7

    .line 1532
    if-nez v7, :cond_34

    .line 1533
    .line 1534
    goto :goto_1b

    .line 1535
    :cond_34
    const/4 v5, 0x0

    .line 1536
    :goto_1b
    if-eqz v5, :cond_35

    .line 1537
    .line 1538
    const-string v7, "\u4f4d\u7f6e\uff1a"

    .line 1539
    .line 1540
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v5

    .line 1544
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1545
    .line 1546
    .line 1547
    :cond_35
    const/16 v53, 0x0

    .line 1548
    .line 1549
    const/16 v54, 0x3e

    .line 1550
    .line 1551
    const-string v49, "\n"

    .line 1552
    .line 1553
    const/16 v50, 0x0

    .line 1554
    .line 1555
    const/16 v51, 0x0

    .line 1556
    .line 1557
    const/16 v52, 0x0

    .line 1558
    .line 1559
    move-object/from16 v48, v4

    .line 1560
    .line 1561
    invoke-static/range {v48 .. v54}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v4

    .line 1565
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1566
    .line 1567
    .line 1568
    move-result v5

    .line 1569
    if-nez v5, :cond_37

    .line 1570
    .line 1571
    new-instance v5, Landroid/widget/TextView;

    .line 1572
    .line 1573
    invoke-direct {v5, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1577
    .line 1578
    .line 1579
    const/high16 v2, 0x41300000    # 11.0f

    .line 1580
    .line 1581
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1582
    .line 1583
    .line 1584
    sget-object v2, Lq71;->γ:Lxx;

    .line 1585
    .line 1586
    if-eqz v2, :cond_36

    .line 1587
    .line 1588
    iget-object v2, v2, Lxx;->θ:Ljava/lang/String;

    .line 1589
    .line 1590
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1591
    .line 1592
    .line 1593
    move-result v2

    .line 1594
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1595
    .line 1596
    .line 1597
    const/4 v2, 0x4

    .line 1598
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1599
    .line 1600
    .line 1601
    const/4 v7, 0x0

    .line 1602
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1603
    .line 1604
    .line 1605
    const/4 v2, 0x3

    .line 1606
    invoke-static {v1, v2}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1607
    .line 1608
    .line 1609
    move-result v2

    .line 1610
    const/4 v4, 0x0

    .line 1611
    invoke-virtual {v5, v4, v2, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1615
    .line 1616
    .line 1617
    goto :goto_1c

    .line 1618
    :cond_36
    const/4 v7, 0x0

    .line 1619
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 1620
    .line 1621
    .line 1622
    throw v7

    .line 1623
    :cond_37
    const/4 v7, 0x0

    .line 1624
    :goto_1c
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1625
    .line 1626
    .line 1627
    move-object/from16 v2, v32

    .line 1628
    .line 1629
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1630
    .line 1631
    .line 1632
    invoke-virtual/range {p0 .. p1}, Lq71;->ε(Landroid/app/Activity;)Landroid/widget/LinearLayout;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v3

    .line 1636
    if-nez v3, :cond_38

    .line 1637
    .line 1638
    :goto_1d
    const/4 v13, -0x1

    .line 1639
    goto :goto_1e

    .line 1640
    :cond_38
    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 1641
    .line 1642
    .line 1643
    move-result v2

    .line 1644
    if-gez v2, :cond_39

    .line 1645
    .line 1646
    const-string v2, "DYHelper"

    .line 1647
    .line 1648
    const-string v3, "\u64cd\u4f5c\u9762\u677f\u5185\u6d4b\u7533\u8bf7\u63d0\u793a\u672a\u627e\u5230\u4f5c\u54c1\u6458\u8981\u951a\u70b9\uff0c\u8df3\u8fc7\u63d2\u5165"

    .line 1649
    .line 1650
    const/4 v4, 0x4

    .line 1651
    invoke-static {v2, v3, v7, v4, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1652
    .line 1653
    .line 1654
    goto :goto_1d

    .line 1655
    :cond_39
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 1656
    .line 1657
    const/4 v10, -0x2

    .line 1658
    const/4 v13, -0x1

    .line 1659
    invoke-direct {v4, v13, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1660
    .line 1661
    .line 1662
    const/16 v5, 0x10

    .line 1663
    .line 1664
    invoke-static {v1, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1665
    .line 1666
    .line 1667
    move-result v6

    .line 1668
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1669
    .line 1670
    .line 1671
    const/16 v11, 0x8

    .line 1672
    .line 1673
    invoke-static {v1, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1674
    .line 1675
    .line 1676
    move-result v6

    .line 1677
    iput v6, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1678
    .line 1679
    invoke-static {v1, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1680
    .line 1681
    .line 1682
    move-result v5

    .line 1683
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1684
    .line 1685
    .line 1686
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1687
    .line 1688
    .line 1689
    const/16 v38, 0x1

    .line 1690
    .line 1691
    add-int/lit8 v2, v2, 0x1

    .line 1692
    .line 1693
    invoke-virtual {v8, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 1694
    .line 1695
    .line 1696
    :goto_1e
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 1697
    .line 1698
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1699
    .line 1700
    .line 1701
    sget-object v3, Lq71;->γ:Lxx;

    .line 1702
    .line 1703
    if-eqz v3, :cond_44

    .line 1704
    .line 1705
    iget-object v3, v3, Lxx;->ε:Ljava/lang/String;

    .line 1706
    .line 1707
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1708
    .line 1709
    .line 1710
    move-result v3

    .line 1711
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1712
    .line 1713
    .line 1714
    const/16 v11, 0x8

    .line 1715
    .line 1716
    invoke-static {v1, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1717
    .line 1718
    .line 1719
    move-result v3

    .line 1720
    int-to-float v3, v3

    .line 1721
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1722
    .line 1723
    .line 1724
    move-object/from16 v4, v29

    .line 1725
    .line 1726
    invoke-virtual {v4, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1727
    .line 1728
    .line 1729
    sget-object v2, Lq71;->γ:Lxx;

    .line 1730
    .line 1731
    if-eqz v2, :cond_43

    .line 1732
    .line 1733
    iget-object v2, v2, Lxx;->η:Ljava/lang/String;

    .line 1734
    .line 1735
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1736
    .line 1737
    .line 1738
    move-result v2

    .line 1739
    move-object/from16 v4, v23

    .line 1740
    .line 1741
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1742
    .line 1743
    .line 1744
    new-instance v8, Lum1;

    .line 1745
    .line 1746
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1747
    .line 1748
    .line 1749
    sget-object v2, Lk71;->ε:Lk71;

    .line 1750
    .line 1751
    iput-object v2, v8, Lum1;->ε:Ljava/lang/Object;

    .line 1752
    .line 1753
    new-instance v4, Lum1;

    .line 1754
    .line 1755
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1756
    .line 1757
    .line 1758
    move-object/from16 v2, v19

    .line 1759
    .line 1760
    iput-object v2, v4, Lum1;->ε:Ljava/lang/Object;

    .line 1761
    .line 1762
    new-instance v5, Lum1;

    .line 1763
    .line 1764
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1765
    .line 1766
    .line 1767
    new-instance v10, Lum1;

    .line 1768
    .line 1769
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 1770
    .line 1771
    .line 1772
    new-instance v1, La71;

    .line 1773
    .line 1774
    move-object/from16 v3, p1

    .line 1775
    .line 1776
    move-object/from16 v6, v17

    .line 1777
    .line 1778
    move/from16 v7, v18

    .line 1779
    .line 1780
    move-object/from16 v14, v34

    .line 1781
    .line 1782
    move-object/from16 v15, v36

    .line 1783
    .line 1784
    move-object/from16 v2, v46

    .line 1785
    .line 1786
    invoke-direct/range {v1 .. v7}, La71;-><init>(Landroid/view/View;Landroid/app/Activity;Lum1;Lum1;Ljava/util/List;Z)V

    .line 1787
    .line 1788
    .line 1789
    new-instance v2, Lb71;

    .line 1790
    .line 1791
    move-object v7, v4

    .line 1792
    move-object v13, v5

    .line 1793
    move-object v4, v8

    .line 1794
    move-object v6, v10

    .line 1795
    move-object v10, v12

    .line 1796
    move-object/from16 v3, v30

    .line 1797
    .line 1798
    move-object/from16 v5, v31

    .line 1799
    .line 1800
    move-object/from16 v8, v33

    .line 1801
    .line 1802
    move-object/from16 v11, v39

    .line 1803
    .line 1804
    move-object/from16 v9, v47

    .line 1805
    .line 1806
    move-object v12, v1

    .line 1807
    move-object v1, v2

    .line 1808
    move-object/from16 v2, p1

    .line 1809
    .line 1810
    invoke-direct/range {v1 .. v12}, Lb71;-><init>(Landroid/app/Activity;Landroid/widget/TextView;Lum1;Landroid/widget/TextView;Lum1;Lum1;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Landroid/widget/ScrollView;La71;)V

    .line 1811
    .line 1812
    .line 1813
    move-object v8, v2

    .line 1814
    move-object v2, v1

    .line 1815
    move-object v1, v8

    .line 1816
    move-object v8, v6

    .line 1817
    iput-object v2, v13, Lum1;->ε:Ljava/lang/Object;

    .line 1818
    .line 1819
    new-instance v2, Lc71;

    .line 1820
    .line 1821
    const/4 v6, 0x0

    .line 1822
    invoke-direct {v2, v4, v13, v6}, Lc71;-><init>(Lum1;Lum1;I)V

    .line 1823
    .line 1824
    .line 1825
    invoke-static {v0, v3, v2}, Lq71;->Η(Lq71;Landroid/view/View;Lp70;)V

    .line 1826
    .line 1827
    .line 1828
    new-instance v2, Lc71;

    .line 1829
    .line 1830
    const/4 v11, 0x1

    .line 1831
    invoke-direct {v2, v4, v13, v11}, Lc71;-><init>(Lum1;Lum1;I)V

    .line 1832
    .line 1833
    .line 1834
    invoke-static {v0, v5, v2}, Lq71;->Η(Lq71;Landroid/view/View;Lp70;)V

    .line 1835
    .line 1836
    .line 1837
    sget-object v0, Lq71;->γ:Lxx;

    .line 1838
    .line 1839
    if-eqz v0, :cond_42

    .line 1840
    .line 1841
    iget-object v2, v0, Lxx;->Α:Ljava/lang/String;

    .line 1842
    .line 1843
    iget-object v0, v0, Lxx;->β:Ljava/lang/String;

    .line 1844
    .line 1845
    const/16 v11, 0x8

    .line 1846
    .line 1847
    invoke-static {v11, v1, v2, v0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v0

    .line 1851
    invoke-virtual {v9, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1852
    .line 1853
    .line 1854
    const v0, 0x7f0800a3

    .line 1855
    .line 1856
    .line 1857
    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1858
    .line 1859
    .line 1860
    sget-object v0, Lq71;->γ:Lxx;

    .line 1861
    .line 1862
    if-eqz v0, :cond_41

    .line 1863
    .line 1864
    iget-object v0, v0, Lxx;->η:Ljava/lang/String;

    .line 1865
    .line 1866
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1867
    .line 1868
    .line 1869
    move-result v0

    .line 1870
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v0

    .line 1874
    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 1875
    .line 1876
    .line 1877
    sget-object v0, Lq71;->γ:Lxx;

    .line 1878
    .line 1879
    if-eqz v0, :cond_40

    .line 1880
    .line 1881
    iget-object v0, v0, Lxx;->ζ:Ljava/lang/String;

    .line 1882
    .line 1883
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1884
    .line 1885
    .line 1886
    move-result v0

    .line 1887
    invoke-virtual {v15, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1888
    .line 1889
    .line 1890
    const v0, 0x7f080096

    .line 1891
    .line 1892
    .line 1893
    move-object/from16 v3, v45

    .line 1894
    .line 1895
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1896
    .line 1897
    .line 1898
    sget-object v0, Lq71;->γ:Lxx;

    .line 1899
    .line 1900
    if-eqz v0, :cond_3f

    .line 1901
    .line 1902
    iget-object v0, v0, Lxx;->θ:Ljava/lang/String;

    .line 1903
    .line 1904
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1905
    .line 1906
    .line 1907
    move-result v0

    .line 1908
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v0

    .line 1912
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 1913
    .line 1914
    .line 1915
    new-instance v0, Ld81;

    .line 1916
    .line 1917
    sget-object v7, Lq71;->γ:Lxx;

    .line 1918
    .line 1919
    if-eqz v7, :cond_3e

    .line 1920
    .line 1921
    move-object/from16 v2, v24

    .line 1922
    .line 1923
    move-object/from16 v3, v25

    .line 1924
    .line 1925
    move-object/from16 v4, v26

    .line 1926
    .line 1927
    move-object/from16 v5, v27

    .line 1928
    .line 1929
    move-object/from16 v6, v28

    .line 1930
    .line 1931
    invoke-direct/range {v0 .. v7}, Ld81;-><init>(Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Lxx;)V

    .line 1932
    .line 1933
    .line 1934
    iput-object v0, v8, Lum1;->ε:Ljava/lang/Object;

    .line 1935
    .line 1936
    iget-object v0, v13, Lum1;->ε:Ljava/lang/Object;

    .line 1937
    .line 1938
    if-eqz v0, :cond_3d

    .line 1939
    .line 1940
    check-cast v0, La80;

    .line 1941
    .line 1942
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1943
    .line 1944
    invoke-interface {v0, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1945
    .line 1946
    .line 1947
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 1948
    .line 1949
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1950
    .line 1951
    .line 1952
    move-object/from16 v2, v46

    .line 1953
    .line 1954
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v0

    .line 1958
    const/4 v11, 0x1

    .line 1959
    invoke-virtual {v0, v11}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v0

    .line 1963
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v0

    .line 1967
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1968
    .line 1969
    .line 1970
    new-instance v3, Li9;

    .line 1971
    .line 1972
    const/4 v4, 0x2

    .line 1973
    invoke-direct {v3, v4, v1}, Li9;-><init>(ILjava/lang/Object;)V

    .line 1974
    .line 1975
    .line 1976
    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 1977
    .line 1978
    .line 1979
    new-instance v3, Lvg;

    .line 1980
    .line 1981
    const/4 v5, 0x5

    .line 1982
    invoke-direct {v3, v5, v1}, Lvg;-><init>(ILjava/lang/Object;)V

    .line 1983
    .line 1984
    .line 1985
    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1986
    .line 1987
    .line 1988
    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1989
    .line 1990
    .line 1991
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 1992
    .line 1993
    .line 1994
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v0

    .line 1998
    if-eqz v0, :cond_3c

    .line 1999
    .line 2000
    const v3, 0x106000d

    .line 2001
    .line 2002
    .line 2003
    invoke-virtual {v0, v3}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 2004
    .line 2005
    .line 2006
    const/high16 v3, 0x3f000000    # 0.5f

    .line 2007
    .line 2008
    invoke-virtual {v0, v3}, Landroid/view/Window;->setDimAmount(F)V

    .line 2009
    .line 2010
    .line 2011
    const/4 v4, 0x2

    .line 2012
    invoke-virtual {v0, v4}, Landroid/view/Window;->addFlags(I)V

    .line 2013
    .line 2014
    .line 2015
    const/16 v3, 0x51

    .line 2016
    .line 2017
    invoke-virtual {v0, v3}, Landroid/view/Window;->setGravity(I)V

    .line 2018
    .line 2019
    .line 2020
    sget-object v3, Lq71;->γ:Lxx;

    .line 2021
    .line 2022
    if-eqz v3, :cond_3b

    .line 2023
    .line 2024
    iget-object v3, v3, Lxx;->β:Ljava/lang/String;

    .line 2025
    .line 2026
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2027
    .line 2028
    .line 2029
    move-result v3

    .line 2030
    invoke-virtual {v0, v3}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 2031
    .line 2032
    .line 2033
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v3

    .line 2037
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v3

    .line 2041
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v4

    .line 2045
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v4

    .line 2049
    iget v4, v4, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 2050
    .line 2051
    const/16 v5, 0x258

    .line 2052
    .line 2053
    if-lt v4, v5, :cond_3a

    .line 2054
    .line 2055
    const/16 v4, 0x230

    .line 2056
    .line 2057
    invoke-static {v1, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 2058
    .line 2059
    .line 2060
    move-result v13

    .line 2061
    goto :goto_1f

    .line 2062
    :cond_3a
    const/4 v13, -0x1

    .line 2063
    :goto_1f
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 2064
    .line 2065
    int-to-float v3, v3

    .line 2066
    const v4, 0x3f666666    # 0.9f

    .line 2067
    .line 2068
    .line 2069
    mul-float/2addr v3, v4

    .line 2070
    float-to-int v3, v3

    .line 2071
    invoke-virtual {v0, v13, v3}, Landroid/view/Window;->setLayout(II)V

    .line 2072
    .line 2073
    .line 2074
    goto :goto_20

    .line 2075
    :cond_3b
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2076
    .line 2077
    .line 2078
    const/16 v16, 0x0

    .line 2079
    .line 2080
    throw v16

    .line 2081
    :cond_3c
    :goto_20
    const/16 v0, 0x30

    .line 2082
    .line 2083
    invoke-static {v1, v0}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 2084
    .line 2085
    .line 2086
    move-result v0

    .line 2087
    int-to-float v0, v0

    .line 2088
    invoke-virtual {v2, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 2089
    .line 2090
    .line 2091
    move/from16 v0, v41

    .line 2092
    .line 2093
    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 2094
    .line 2095
    .line 2096
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v1

    .line 2100
    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v0

    .line 2104
    const/high16 v1, 0x3f800000    # 1.0f

    .line 2105
    .line 2106
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v0

    .line 2110
    const-wide/16 v1, 0xdc

    .line 2111
    .line 2112
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v0

    .line 2116
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 2117
    .line 2118
    .line 2119
    return-void

    .line 2120
    :cond_3d
    const-string v0, "renderUi"

    .line 2121
    .line 2122
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2123
    .line 2124
    .line 2125
    const/16 v16, 0x0

    .line 2126
    .line 2127
    throw v16

    .line 2128
    :cond_3e
    const/16 v16, 0x0

    .line 2129
    .line 2130
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2131
    .line 2132
    .line 2133
    throw v16

    .line 2134
    :cond_3f
    const/16 v16, 0x0

    .line 2135
    .line 2136
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2137
    .line 2138
    .line 2139
    throw v16

    .line 2140
    :cond_40
    const/16 v16, 0x0

    .line 2141
    .line 2142
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2143
    .line 2144
    .line 2145
    throw v16

    .line 2146
    :cond_41
    const/16 v16, 0x0

    .line 2147
    .line 2148
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2149
    .line 2150
    .line 2151
    throw v16

    .line 2152
    :cond_42
    const/16 v16, 0x0

    .line 2153
    .line 2154
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2155
    .line 2156
    .line 2157
    throw v16

    .line 2158
    :cond_43
    const/16 v16, 0x0

    .line 2159
    .line 2160
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2161
    .line 2162
    .line 2163
    throw v16

    .line 2164
    :cond_44
    const/16 v16, 0x0

    .line 2165
    .line 2166
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2167
    .line 2168
    .line 2169
    throw v16

    .line 2170
    :cond_45
    const/16 v16, 0x0

    .line 2171
    .line 2172
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2173
    .line 2174
    .line 2175
    throw v16

    .line 2176
    :cond_46
    const/16 v16, 0x0

    .line 2177
    .line 2178
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2179
    .line 2180
    .line 2181
    throw v16

    .line 2182
    :cond_47
    const/16 v16, 0x0

    .line 2183
    .line 2184
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2185
    .line 2186
    .line 2187
    throw v16

    .line 2188
    :cond_48
    const/16 v16, 0x0

    .line 2189
    .line 2190
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2191
    .line 2192
    .line 2193
    throw v16

    .line 2194
    :cond_49
    const/16 v16, 0x0

    .line 2195
    .line 2196
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2197
    .line 2198
    .line 2199
    throw v16

    .line 2200
    :cond_4a
    const/16 v16, 0x0

    .line 2201
    .line 2202
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2203
    .line 2204
    .line 2205
    throw v16

    .line 2206
    :cond_4b
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2207
    .line 2208
    .line 2209
    throw v16

    .line 2210
    :cond_4c
    move-object/from16 v16, v11

    .line 2211
    .line 2212
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2213
    .line 2214
    .line 2215
    throw v16

    .line 2216
    :cond_4d
    const/16 v16, 0x0

    .line 2217
    .line 2218
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2219
    .line 2220
    .line 2221
    throw v16

    .line 2222
    :cond_4e
    const/16 v16, 0x0

    .line 2223
    .line 2224
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2225
    .line 2226
    .line 2227
    throw v16

    .line 2228
    :cond_4f
    const/16 v16, 0x0

    .line 2229
    .line 2230
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2231
    .line 2232
    .line 2233
    throw v16

    .line 2234
    :cond_50
    const/16 v16, 0x0

    .line 2235
    .line 2236
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2237
    .line 2238
    .line 2239
    throw v16

    .line 2240
    :cond_51
    const/16 v16, 0x0

    .line 2241
    .line 2242
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2243
    .line 2244
    .line 2245
    throw v16

    .line 2246
    :cond_52
    const/16 v16, 0x0

    .line 2247
    .line 2248
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2249
    .line 2250
    .line 2251
    throw v16

    .line 2252
    :cond_53
    const/16 v16, 0x0

    .line 2253
    .line 2254
    invoke-static/range {v35 .. v35}, Lln0;->и(Ljava/lang/String;)V

    .line 2255
    .line 2256
    .line 2257
    throw v16
.end method

.method public final ε(Landroid/app/Activity;)Landroid/widget/LinearLayout;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-static {}, Lui1;->Α()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v3, "DYHelper"

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    move-object v0, v2

    .line 20
    :cond_0
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    new-instance v4, Leo1;

    .line 28
    .line 29
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object v0, v4

    .line 33
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    const-string v4, "\u64cd\u4f5c\u9762\u677f\u521d\u59cb\u5316\u5185\u6d4b\u7533\u8bf7\u63d0\u793a\u504f\u597d\u5931\u8d25"

    .line 40
    .line 41
    invoke-static {v3, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-static {}, Lui1;->Α()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v4, 0x0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_2
    invoke-static {}, Lq71;->Δ()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    :try_start_1
    invoke-static {}, Lx9;->κ()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    goto :goto_1

    .line 72
    :catchall_1
    move-exception v0

    .line 73
    new-instance v6, Leo1;

    .line 74
    .line 75
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    move-object v0, v6

    .line 79
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    if-eqz v6, :cond_4

    .line 84
    .line 85
    const-string v7, "\u64cd\u4f5c\u9762\u677f\u68c0\u67e5\u5185\u6d4b\u8d44\u683c\u5931\u8d25"

    .line 86
    .line 87
    invoke-static {v3, v7, v6}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 91
    .line 92
    instance-of v6, v0, Leo1;

    .line 93
    .line 94
    if-eqz v6, :cond_5

    .line 95
    .line 96
    move-object v0, v3

    .line 97
    :cond_5
    check-cast v0, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    const-string v0, "operation_beta_apply_prompt_dismissed_at"

    .line 107
    .line 108
    const-wide/16 v6, 0x0

    .line 109
    .line 110
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-interface {v3, v0, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 118
    goto :goto_2

    .line 119
    :catchall_2
    move-wide v8, v6

    .line 120
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 121
    .line 122
    .line 123
    move-result-wide v10

    .line 124
    cmp-long v0, v8, v6

    .line 125
    .line 126
    if-lez v0, :cond_9

    .line 127
    .line 128
    cmp-long v0, v8, v10

    .line 129
    .line 130
    if-lez v0, :cond_7

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_7
    sub-long/2addr v10, v8

    .line 134
    const-wide/32 v6, 0x240c8400

    .line 135
    .line 136
    .line 137
    cmp-long v0, v10, v6

    .line 138
    .line 139
    if-ltz v0, :cond_8

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_8
    :goto_3
    return-object v4

    .line 143
    :cond_9
    :goto_4
    sget-object v0, Lx01;->α:Lx01;

    .line 144
    .line 145
    invoke-virtual {v0, v2}, Lx01;->α(Landroid/content/Context;)Lw01;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    new-instance v6, Landroid/widget/LinearLayout;

    .line 150
    .line 151
    invoke-direct {v6, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 152
    .line 153
    .line 154
    const/4 v7, 0x1

    .line 155
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 156
    .line 157
    .line 158
    const/16 v8, 0xc

    .line 159
    .line 160
    invoke-static {v2, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    invoke-static {v2, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    invoke-static {v2, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    invoke-static {v2, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    invoke-virtual {v6, v9, v10, v11, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 177
    .line 178
    .line 179
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 180
    .line 181
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 182
    .line 183
    .line 184
    sget-object v9, Lq71;->γ:Lxx;

    .line 185
    .line 186
    const-string v10, "theme"

    .line 187
    .line 188
    if-eqz v9, :cond_13

    .line 189
    .line 190
    iget-object v9, v9, Lxx;->σ:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 197
    .line 198
    .line 199
    invoke-static {v2, v7}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    sget-object v11, Lq71;->γ:Lxx;

    .line 204
    .line 205
    if-eqz v11, :cond_12

    .line 206
    .line 207
    iget-object v11, v11, Lxx;->ρ:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    invoke-virtual {v8, v9, v11}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 214
    .line 215
    .line 216
    const/16 v9, 0x8

    .line 217
    .line 218
    invoke-static {v2, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    int-to-float v11, v11

    .line 223
    invoke-virtual {v8, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 227
    .line 228
    .line 229
    new-instance v8, Landroid/widget/LinearLayout;

    .line 230
    .line 231
    invoke-direct {v8, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 232
    .line 233
    .line 234
    const/16 v11, 0x10

    .line 235
    .line 236
    invoke-virtual {v8, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 237
    .line 238
    .line 239
    const/4 v11, 0x0

    .line 240
    invoke-virtual {v8, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 241
    .line 242
    .line 243
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 244
    .line 245
    const/4 v13, -0x1

    .line 246
    const/4 v14, -0x2

    .line 247
    invoke-direct {v12, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v8, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 251
    .line 252
    .line 253
    new-instance v12, Landroid/widget/ImageView;

    .line 254
    .line 255
    invoke-direct {v12, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 256
    .line 257
    .line 258
    const v15, 0x7f08009f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v2, v15}, Lx01;->β(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 262
    .line 263
    .line 264
    move-result-object v15

    .line 265
    invoke-virtual {v12, v15}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 266
    .line 267
    .line 268
    sget-object v15, Lq71;->γ:Lxx;

    .line 269
    .line 270
    if-eqz v15, :cond_11

    .line 271
    .line 272
    iget-object v15, v15, Lxx;->ρ:Ljava/lang/String;

    .line 273
    .line 274
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    move-result v15

    .line 278
    invoke-static {v15}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 279
    .line 280
    .line 281
    move-result-object v15

    .line 282
    invoke-virtual {v12, v15}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 283
    .line 284
    .line 285
    invoke-static {v2, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 286
    .line 287
    .line 288
    move-result v15

    .line 289
    invoke-static {v2, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    invoke-static {v2, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    invoke-static {v2, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    invoke-virtual {v12, v15, v13, v4, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 302
    .line 303
    .line 304
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 305
    .line 306
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 307
    .line 308
    .line 309
    sget-object v11, Lq71;->γ:Lxx;

    .line 310
    .line 311
    if-eqz v11, :cond_10

    .line 312
    .line 313
    iget-object v11, v11, Lxx;->γ:Ljava/lang/String;

    .line 314
    .line 315
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    invoke-virtual {v4, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 320
    .line 321
    .line 322
    invoke-static {v2, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 323
    .line 324
    .line 325
    move-result v11

    .line 326
    int-to-float v11, v11

    .line 327
    invoke-virtual {v4, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 331
    .line 332
    .line 333
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 334
    .line 335
    const/16 v11, 0x24

    .line 336
    .line 337
    invoke-static {v2, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 338
    .line 339
    .line 340
    move-result v13

    .line 341
    invoke-static {v2, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 342
    .line 343
    .line 344
    move-result v15

    .line 345
    invoke-direct {v4, v13, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 346
    .line 347
    .line 348
    const/16 v13, 0xa

    .line 349
    .line 350
    invoke-static {v2, v13}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 351
    .line 352
    .line 353
    move-result v15

    .line 354
    invoke-virtual {v4, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v8, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 361
    .line 362
    .line 363
    new-instance v4, Landroid/widget/LinearLayout;

    .line 364
    .line 365
    invoke-direct {v4, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 369
    .line 370
    .line 371
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 372
    .line 373
    const/high16 v15, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    invoke-direct {v12, v13, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v4, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 380
    .line 381
    .line 382
    new-instance v12, Landroid/widget/TextView;

    .line 383
    .line 384
    invoke-direct {v12, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 385
    .line 386
    .line 387
    const-string v13, "\u7533\u8bf7\u5185\u6d4b"

    .line 388
    .line 389
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 390
    .line 391
    .line 392
    const/high16 v15, 0x41600000    # 14.0f

    .line 393
    .line 394
    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setTextSize(F)V

    .line 395
    .line 396
    .line 397
    const/4 v15, 0x0

    .line 398
    invoke-virtual {v12, v15, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 399
    .line 400
    .line 401
    sget-object v15, Lq71;->γ:Lxx;

    .line 402
    .line 403
    if-eqz v15, :cond_f

    .line 404
    .line 405
    iget-object v15, v15, Lxx;->ζ:Ljava/lang/String;

    .line 406
    .line 407
    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 408
    .line 409
    .line 410
    move-result v15

    .line 411
    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v7}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 415
    .line 416
    .line 417
    sget-object v15, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 418
    .line 419
    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v4, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 423
    .line 424
    .line 425
    new-instance v12, Landroid/widget/TextView;

    .line 426
    .line 427
    invoke-direct {v12, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 428
    .line 429
    .line 430
    const-string v14, "UID\uff1a"

    .line 431
    .line 432
    invoke-virtual {v14, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v14

    .line 436
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 437
    .line 438
    .line 439
    const/high16 v14, 0x41400000    # 12.0f

    .line 440
    .line 441
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 442
    .line 443
    .line 444
    sget-object v14, Lq71;->γ:Lxx;

    .line 445
    .line 446
    if-eqz v14, :cond_e

    .line 447
    .line 448
    iget-object v14, v14, Lxx;->η:Ljava/lang/String;

    .line 449
    .line 450
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 451
    .line 452
    .line 453
    move-result v14

    .line 454
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v7}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 458
    .line 459
    .line 460
    sget-object v14, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    .line 461
    .line 462
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 463
    .line 464
    .line 465
    const/4 v14, 0x2

    .line 466
    invoke-static {v2, v14}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 467
    .line 468
    .line 469
    move-result v11

    .line 470
    const/4 v14, 0x0

    .line 471
    invoke-virtual {v12, v14, v11, v14, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v4, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 478
    .line 479
    .line 480
    new-instance v4, Landroid/widget/ImageView;

    .line 481
    .line 482
    invoke-direct {v4, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 483
    .line 484
    .line 485
    const v11, 0x7f080097

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0, v2, v11}, Lx01;->β(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 493
    .line 494
    .line 495
    sget-object v0, Lq71;->γ:Lxx;

    .line 496
    .line 497
    if-eqz v0, :cond_d

    .line 498
    .line 499
    iget-object v0, v0, Lxx;->η:Ljava/lang/String;

    .line 500
    .line 501
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 510
    .line 511
    .line 512
    const-string v0, "\u4e03\u5929\u5185\u4e0d\u518d\u663e\u793a\u5185\u6d4b\u7533\u8bf7\u63d0\u793a"

    .line 513
    .line 514
    invoke-virtual {v4, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 515
    .line 516
    .line 517
    invoke-static {v2, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    invoke-static {v2, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 522
    .line 523
    .line 524
    move-result v11

    .line 525
    invoke-static {v2, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 526
    .line 527
    .line 528
    move-result v12

    .line 529
    invoke-static {v2, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 530
    .line 531
    .line 532
    move-result v14

    .line 533
    invoke-virtual {v4, v0, v11, v12, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 534
    .line 535
    .line 536
    sget-object v0, Lq71;->γ:Lxx;

    .line 537
    .line 538
    if-eqz v0, :cond_c

    .line 539
    .line 540
    iget-object v0, v0, Lxx;->Α:Ljava/lang/String;

    .line 541
    .line 542
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    .line 551
    .line 552
    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 553
    .line 554
    .line 555
    const/4 v14, 0x0

    .line 556
    invoke-virtual {v11, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v11, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 560
    .line 561
    .line 562
    new-instance v12, Landroid/graphics/drawable/RippleDrawable;

    .line 563
    .line 564
    const/4 v14, 0x0

    .line 565
    invoke-direct {v12, v0, v11, v14}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v4, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 569
    .line 570
    .line 571
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 572
    .line 573
    const/16 v11, 0x24

    .line 574
    .line 575
    invoke-static {v2, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 576
    .line 577
    .line 578
    move-result v12

    .line 579
    invoke-static {v2, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 580
    .line 581
    .line 582
    move-result v11

    .line 583
    invoke-direct {v0, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 584
    .line 585
    .line 586
    invoke-static {v2, v9}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 587
    .line 588
    .line 589
    move-result v11

    .line 590
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 600
    .line 601
    .line 602
    new-instance v0, Landroid/widget/TextView;

    .line 603
    .line 604
    invoke-direct {v0, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 605
    .line 606
    .line 607
    const-string v8, "\u53d1\u9001\u7533\u8bf7\u7801\u7ed9\u5f00\u53d1\u8005\uff0c\u540d\u5355\u751f\u6548\u540e\u5373\u53ef\u9a8c\u8bc1\u5185\u6d4b\u529f\u80fd\u3002"

    .line 608
    .line 609
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 610
    .line 611
    .line 612
    const/high16 v8, 0x41400000    # 12.0f

    .line 613
    .line 614
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 615
    .line 616
    .line 617
    sget-object v8, Lq71;->γ:Lxx;

    .line 618
    .line 619
    if-eqz v8, :cond_b

    .line 620
    .line 621
    iget-object v8, v8, Lxx;->η:Ljava/lang/String;

    .line 622
    .line 623
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 624
    .line 625
    .line 626
    move-result v8

    .line 627
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 628
    .line 629
    .line 630
    const/4 v8, 0x2

    .line 631
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 635
    .line 636
    .line 637
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 638
    .line 639
    const/4 v11, -0x2

    .line 640
    const/4 v12, -0x1

    .line 641
    invoke-direct {v8, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 642
    .line 643
    .line 644
    const/16 v11, 0xa

    .line 645
    .line 646
    invoke-static {v2, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 647
    .line 648
    .line 649
    move-result v12

    .line 650
    iput v12, v8, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 651
    .line 652
    invoke-virtual {v0, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 656
    .line 657
    .line 658
    new-instance v0, Landroid/widget/TextView;

    .line 659
    .line 660
    invoke-direct {v0, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 664
    .line 665
    .line 666
    const/high16 v3, 0x41500000    # 13.0f

    .line 667
    .line 668
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 669
    .line 670
    .line 671
    const/4 v14, 0x0

    .line 672
    invoke-virtual {v0, v14, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 673
    .line 674
    .line 675
    const/16 v3, 0x11

    .line 676
    .line 677
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 678
    .line 679
    .line 680
    const/4 v12, -0x1

    .line 681
    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 682
    .line 683
    .line 684
    new-instance v3, Ljava/lang/StringBuilder;

    .line 685
    .line 686
    const-string v8, "\u4f7f\u7528 UID "

    .line 687
    .line 688
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 692
    .line 693
    .line 694
    const-string v8, " \u7533\u8bf7\u5185\u6d4b"

    .line 695
    .line 696
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v3

    .line 703
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 704
    .line 705
    .line 706
    sget-object v3, Lq71;->γ:Lxx;

    .line 707
    .line 708
    if-eqz v3, :cond_a

    .line 709
    .line 710
    iget-object v8, v3, Lxx;->Α:Ljava/lang/String;

    .line 711
    .line 712
    iget-object v3, v3, Lxx;->ρ:Ljava/lang/String;

    .line 713
    .line 714
    invoke-static {v9, v2, v8, v3}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 715
    .line 716
    .line 717
    move-result-object v3

    .line 718
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 719
    .line 720
    .line 721
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 722
    .line 723
    const/16 v8, 0x28

    .line 724
    .line 725
    invoke-static {v2, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 726
    .line 727
    .line 728
    move-result v8

    .line 729
    const/4 v12, -0x1

    .line 730
    invoke-direct {v3, v12, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 731
    .line 732
    .line 733
    const/16 v11, 0xa

    .line 734
    .line 735
    invoke-static {v2, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 736
    .line 737
    .line 738
    move-result v8

    .line 739
    iput v8, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 740
    .line 741
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 745
    .line 746
    .line 747
    new-instance v3, Lx61;

    .line 748
    .line 749
    invoke-direct {v3, v2, v5, v7}, Lx61;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 750
    .line 751
    .line 752
    invoke-static {v1, v0, v3}, Lq71;->Η(Lq71;Landroid/view/View;Lp70;)V

    .line 753
    .line 754
    .line 755
    new-instance v0, Lal0;

    .line 756
    .line 757
    invoke-direct {v0, v6, v7}, Lal0;-><init>(Landroid/widget/LinearLayout;I)V

    .line 758
    .line 759
    .line 760
    invoke-static {v1, v4, v0}, Lq71;->Η(Lq71;Landroid/view/View;Lp70;)V

    .line 761
    .line 762
    .line 763
    return-object v6

    .line 764
    :cond_a
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    const/16 v16, 0x0

    .line 768
    .line 769
    throw v16

    .line 770
    :cond_b
    const/16 v16, 0x0

    .line 771
    .line 772
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    throw v16

    .line 776
    :cond_c
    const/16 v16, 0x0

    .line 777
    .line 778
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    throw v16

    .line 782
    :cond_d
    const/16 v16, 0x0

    .line 783
    .line 784
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    throw v16

    .line 788
    :cond_e
    const/16 v16, 0x0

    .line 789
    .line 790
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    throw v16

    .line 794
    :cond_f
    const/16 v16, 0x0

    .line 795
    .line 796
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    throw v16

    .line 800
    :cond_10
    const/16 v16, 0x0

    .line 801
    .line 802
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    throw v16

    .line 806
    :cond_11
    move-object/from16 v16, v4

    .line 807
    .line 808
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    throw v16

    .line 812
    :cond_12
    move-object/from16 v16, v4

    .line 813
    .line 814
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    throw v16

    .line 818
    :cond_13
    move-object/from16 v16, v4

    .line 819
    .line 820
    invoke-static {v10}, Lln0;->и(Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    throw v16
.end method
