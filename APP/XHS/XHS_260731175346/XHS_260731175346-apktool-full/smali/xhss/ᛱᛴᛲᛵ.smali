.class public final Lxhss/ᛱᛴᛲᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final ᛳᲁᲇᛸ:Lxhss/ᛵᛴᲀᛸ;

.field public final synthetic ᲇᛴᲇᛵ:Lxhss/ᲀᛸᛵ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᲀᛸᛵ;Lxhss/ᛵᛴᲀᛸ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxhss/ᛱᛴᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛱᛴᛲᛵ;->ᲇᛴᲇᛵ:Lxhss/ᲀᛸᛵ;

    .line 4
    .line 5
    iput-object p2, p0, Lxhss/ᛱᛴᛲᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛵᛴᲀᛸ;

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
    iget v0, p0, Lxhss/ᛱᛴᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lxhss/ᛱᛴᛲᛵ;->ᲇᛴᲇᛵ:Lxhss/ᲀᛸᛵ;

    .line 6
    .line 7
    iget-object p0, p0, Lxhss/ᛱᛴᛲᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛵᛴᲀᛸ;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v3, Lxhss/ᲀᛸᛵ;->ᛱᛱᛲᲇ:Ljava/lang/ref/WeakReference;

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
    check-cast v0, Lxhss/ᲈᲀᛲᛸ;

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
    invoke-interface {v0}, Lxhss/ᲈᲀᛲᛸ;->cancel()V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {}, Lxhss/ᲀᛸᛵ;->ᛷᛵᛵᲈ()Landroid/app/Activity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v5, v3, Lxhss/ᲀᛸᛵ;->ᛷᛵᛵᲈ:Landroid/app/Application;

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
    new-instance v0, Lxhss/ᲈᛱᛷᛵ;

    .line 43
    .line 44
    iget-object v5, v3, Lxhss/ᲀᛸᛵ;->ᛷᛵᛵᲈ:Landroid/app/Application;

    .line 45
    .line 46
    invoke-direct {v0, v5}, Lxhss/ᲈᛱᛷᛵ;-><init>(Landroid/app/Application;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    if-eqz v0, :cond_3

    .line 51
    .line 52
    new-instance v5, Lxhss/ᲈᛱᛷᛵ;

    .line 53
    .line 54
    invoke-direct {v5, v0}, Lxhss/ᲈᛱᛷᛵ;-><init>(Landroid/app/Activity;)V

    .line 55
    .line 56
    .line 57
    move-object v0, v5

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    new-instance v0, Lxhss/ᲇᲀᲁᛳ;

    .line 60
    .line 61
    iget-object v5, v3, Lxhss/ᲀᛸᛵ;->ᛷᛵᛵᲈ:Landroid/app/Application;

    .line 62
    .line 63
    invoke-direct {v0, v5}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    :goto_1
    instance-of v5, v0, Lxhss/ᲈᛱᛷᛵ;

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
    iget-object v4, p0, Lxhss/ᛵᛴᲀᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛴᲀᲁ;

    .line 123
    .line 124
    iget-object v5, v3, Lxhss/ᲀᛸᛵ;->ᛷᛵᛵᲈ:Landroid/app/Application;

    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v4, Landroid/widget/TextView;

    .line 130
    .line 131
    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 132
    .line 133
    .line 134
    const v6, 0x102000b

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4, v6}, Landroid/view/View;->setId(I)V

    .line 138
    .line 139
    .line 140
    const/16 v6, 0x11

    .line 141
    .line 142
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 143
    .line 144
    .line 145
    const v7, -0x11000001

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    const/4 v8, 0x2

    .line 160
    const/high16 v9, 0x41600000    # 14.0f

    .line 161
    .line 162
    invoke-static {v8, v9, v7}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    invoke-virtual {v4, v2, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    const/high16 v8, 0x41c00000    # 24.0f

    .line 178
    .line 179
    invoke-static {v1, v8, v7}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    float-to-int v7, v7

    .line 184
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    const/high16 v9, 0x41800000    # 16.0f

    .line 193
    .line 194
    invoke-static {v1, v9, v8}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    float-to-int v8, v8

    .line 199
    invoke-virtual {v4, v7, v8, v7, v8}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 200
    .line 201
    .line 202
    new-instance v7, Landroid/view/ViewGroup$LayoutParams;

    .line 203
    .line 204
    const/4 v8, -0x2

    .line 205
    invoke-direct {v7, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 209
    .line 210
    .line 211
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    .line 212
    .line 213
    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 214
    .line 215
    .line 216
    const/high16 v8, -0x4d000000

    .line 217
    .line 218
    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    const/high16 v9, 0x41200000    # 10.0f

    .line 230
    .line 231
    invoke-static {v1, v9, v8}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    const/high16 v7, 0x40400000    # 3.0f

    .line 250
    .line 251
    invoke-static {v1, v7, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-virtual {v4, v1}, Landroid/view/View;->setZ(F)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v0, v4}, Lxhss/ᲈᲀᛲᛸ;->setView(Landroid/view/View;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v0, v6, v2, v2}, Lxhss/ᲈᲀᛲᛸ;->setGravity(III)V

    .line 262
    .line 263
    .line 264
    const/4 v1, 0x0

    .line 265
    invoke-interface {v0, v1, v1}, Lxhss/ᲈᲀᛲᛸ;->setMargin(FF)V

    .line 266
    .line 267
    .line 268
    :cond_5
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 269
    .line 270
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    iput-object v1, v3, Lxhss/ᲀᛸᛵ;->ᛱᛱᛲᲇ:Ljava/lang/ref/WeakReference;

    .line 274
    .line 275
    iget v1, p0, Lxhss/ᛵᛴᲀᛸ;->ᛱᛱᛲᲇ:I

    .line 276
    .line 277
    invoke-interface {v0, v1}, Lxhss/ᲈᲀᛲᛸ;->setDuration(I)V

    .line 278
    .line 279
    .line 280
    iget-object p0, p0, Lxhss/ᛵᛴᲀᛸ;->ᛷᛵᛵᲈ:Ljava/lang/CharSequence;

    .line 281
    .line 282
    invoke-interface {v0, p0}, Lxhss/ᲈᲀᛲᛸ;->setText(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v0}, Lxhss/ᲈᲀᛲᛸ;->show()V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :pswitch_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 293
    .line 294
    .line 295
    move-result-wide v4

    .line 296
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-static {}, Lxhss/ᲀᛸᛵ;->ᛷᛵᛵᲈ()Landroid/app/Activity;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    if-nez v0, :cond_6

    .line 304
    .line 305
    const/16 v2, 0x12c

    .line 306
    .line 307
    :cond_6
    int-to-long v6, v2

    .line 308
    add-long/2addr v4, v6

    .line 309
    sget-object v0, Lxhss/ᲀᛸᛵ;->ᛳᲁᲇᛸ:Landroid/os/Handler;

    .line 310
    .line 311
    new-instance v2, Lxhss/ᛱᛴᛲᛵ;

    .line 312
    .line 313
    invoke-direct {v2, v3, p0, v1}, Lxhss/ᛱᛴᛲᛵ;-><init>(Lxhss/ᲀᛸᛵ;Lxhss/ᛵᛴᲀᛸ;I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    nop

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
