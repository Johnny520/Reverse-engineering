.class public final Lyyds/ᛶᛲᲈᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛷᲈᛴᛷ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Lyyds/ᲈᲇᲀᛲ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛷᲈᛴᛷ;Lyyds/ᲈᲇᲀᛲ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛶᛲᲈᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛶᛲᲈᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲈᛴᛷ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛶᛲᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᲈᲇᲀᛲ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lyyds/ᛶᛲᲈᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lyyds/ᛶᛲᲈᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲈᛴᛷ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛶᛲᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᲈᲇᲀᛲ;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v3, Lyyds/ᛷᲈᛴᛷ;->ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lyyds/ᛵᲇᛲᲀ;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, v4

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Lyyds/ᛵᲇᛲᲀ;->cancel()V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {}, Lyyds/ᛷᲈᛴᛷ;->ᛲᲈᲁ()Landroid/app/Activity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v5, v3, Lyyds/ᛷᲈᛴᛷ;->ᛲᲈᲁ:Landroid/app/Application;

    .line 35
    .line 36
    invoke-static {v5}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    new-instance v0, Lyyds/ᲈᲁᛶᛸ;

    .line 43
    .line 44
    iget-object v5, v3, Lyyds/ᛷᲈᛴᛷ;->ᛲᲈᲁ:Landroid/app/Application;

    .line 45
    .line 46
    invoke-direct {v0, v5}, Lyyds/ᲈᲁᛶᛸ;-><init>(Landroid/app/Application;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    if-eqz v0, :cond_3

    .line 51
    .line 52
    new-instance v5, Lyyds/ᲈᲁᛶᛸ;

    .line 53
    .line 54
    invoke-direct {v5, v0}, Lyyds/ᲈᲁᛶᛸ;-><init>(Landroid/app/Activity;)V

    .line 55
    .line 56
    .line 57
    move-object v0, v5

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    new-instance v0, Lyyds/ᛷᛷᲀ;

    .line 60
    .line 61
    iget-object v5, v3, Lyyds/ᛷᲈᛴᛷ;->ᛲᲈᲁ:Landroid/app/Application;

    .line 62
    .line 63
    invoke-direct {v0, v5}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    :goto_1
    instance-of v5, v0, Lyyds/ᲈᲁᛶᛸ;

    .line 67
    .line 68
    if-nez v5, :cond_4

    .line 69
    .line 70
    :try_start_0
    const-string v5, "android.app.compat.CompatChanges"

    .line 71
    .line 72
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const-string v6, "isChangeEnabled"

    .line 77
    .line 78
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 89
    .line 90
    .line 91
    const-wide/32 v6, 0x8cf3b87

    .line 92
    .line 93
    .line 94
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v5, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v4
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    goto :goto_2

    .line 115
    :catch_0
    move-exception v4

    .line 116
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 117
    .line 118
    .line 119
    move v4, v2

    .line 120
    :goto_2
    if-nez v4, :cond_5

    .line 121
    .line 122
    :cond_4
    iget-object v4, p0, Lyyds/ᲈᲇᲀᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v4, Lyyds/ᛷᛶᲇᲁ;

    .line 125
    .line 126
    iget-object v5, v3, Lyyds/ᛷᲈᛴᛷ;->ᛲᲈᲁ:Landroid/app/Application;

    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance v4, Landroid/widget/TextView;

    .line 132
    .line 133
    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    const v6, 0x102000b

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v6}, Landroid/view/View;->setId(I)V

    .line 140
    .line 141
    .line 142
    const/16 v6, 0x11

    .line 143
    .line 144
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 145
    .line 146
    .line 147
    const v7, -0x11000001

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    const/4 v8, 0x2

    .line 162
    const/high16 v9, 0x41600000    # 14.0f

    .line 163
    .line 164
    invoke-static {v8, v9, v7}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    invoke-virtual {v4, v2, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    const/high16 v8, 0x41c00000    # 24.0f

    .line 180
    .line 181
    invoke-static {v1, v8, v7}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    float-to-int v7, v7

    .line 186
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    const/high16 v9, 0x41800000    # 16.0f

    .line 195
    .line 196
    invoke-static {v1, v9, v8}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    float-to-int v8, v8

    .line 201
    invoke-virtual {v4, v7, v8, v7, v8}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 202
    .line 203
    .line 204
    new-instance v7, Landroid/view/ViewGroup$LayoutParams;

    .line 205
    .line 206
    const/4 v8, -0x2

    .line 207
    invoke-direct {v7, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 211
    .line 212
    .line 213
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    .line 214
    .line 215
    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 216
    .line 217
    .line 218
    const/high16 v8, -0x4d000000

    .line 219
    .line 220
    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    const/high16 v9, 0x41200000    # 10.0f

    .line 232
    .line 233
    invoke-static {v1, v9, v8}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    const/high16 v7, 0x40400000    # 3.0f

    .line 252
    .line 253
    invoke-static {v1, v7, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    invoke-virtual {v4, v1}, Landroid/view/View;->setZ(F)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v0, v4}, Lyyds/ᛵᲇᛲᲀ;->setView(Landroid/view/View;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v0, v6, v2, v2}, Lyyds/ᛵᲇᛲᲀ;->setGravity(III)V

    .line 264
    .line 265
    .line 266
    const/4 v1, 0x0

    .line 267
    invoke-interface {v0, v1, v1}, Lyyds/ᛵᲇᛲᲀ;->setMargin(FF)V

    .line 268
    .line 269
    .line 270
    :cond_5
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 271
    .line 272
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    iput-object v1, v3, Lyyds/ᛷᲈᛴᛷ;->ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;

    .line 276
    .line 277
    iget v1, p0, Lyyds/ᲈᲇᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 278
    .line 279
    invoke-interface {v0, v1}, Lyyds/ᛵᲇᛲᲀ;->setDuration(I)V

    .line 280
    .line 281
    .line 282
    iget-object p0, p0, Lyyds/ᲈᲇᲀᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast p0, Ljava/lang/CharSequence;

    .line 285
    .line 286
    invoke-interface {v0, p0}, Lyyds/ᛵᲇᛲᲀ;->setText(Ljava/lang/CharSequence;)V

    .line 287
    .line 288
    .line 289
    invoke-interface {v0}, Lyyds/ᛵᲇᛲᲀ;->show()V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :pswitch_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 297
    .line 298
    .line 299
    move-result-wide v4

    .line 300
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-static {}, Lyyds/ᛷᲈᛴᛷ;->ᛲᲈᲁ()Landroid/app/Activity;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    if-nez v0, :cond_6

    .line 308
    .line 309
    const/16 v2, 0x12c

    .line 310
    .line 311
    :cond_6
    int-to-long v6, v2

    .line 312
    add-long/2addr v4, v6

    .line 313
    sget-object v0, Lyyds/ᛷᲈᛴᛷ;->ᲀᛲᛳᲀ:Landroid/os/Handler;

    .line 314
    .line 315
    new-instance v2, Lyyds/ᛶᛲᲈᛳ;

    .line 316
    .line 317
    invoke-direct {v2, v3, p0, v1}, Lyyds/ᛶᛲᲈᛳ;-><init>(Lyyds/ᛷᲈᛴᛷ;Lyyds/ᲈᲇᲀᛲ;I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
