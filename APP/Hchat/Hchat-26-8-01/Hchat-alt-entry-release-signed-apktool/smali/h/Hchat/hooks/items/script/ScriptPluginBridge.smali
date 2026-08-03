.class public final Lh/Hchat/hooks/items/script/ScriptPluginBridge;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I = 0x8

.field public static final Companion:Leb/q;


# instance fields
.field private final apis:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lh/Hchat/hooks/api/core/WeChatApis;",
            ">;"
        }
    .end annotation
.end field

.field private final classLoader:Ljava/lang/ClassLoader;

.field private final configLock:Ljava/lang/Object;

.field private final dexKit:Lh/Hchat/hooks/items/script/ScriptDexKitBridge;

.field private final hostContext:Landroid/content/Context;

.field private final mainHandler:Landroid/os/Handler;

.field private final pluginFloatingBars:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;",
            ">;>;"
        }
    .end annotation
.end field

.field private final pluginHooks:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lde/robv/android/xposed/XC_MethodHook$Unhook;",
            ">;>;"
        }
    .end annotation
.end field

.field private final scriptDir:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Leb/q;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->Companion:Leb/q;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/io/File;Lh/Hchat/hooks/items/script/ScriptDexKitBridge;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->hostContext:Landroid/content/Context;

    .line 14
    .line 15
    iput-object p2, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->classLoader:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    iput-object p3, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->scriptDir:Ljava/io/File;

    .line 18
    .line 19
    iput-object p4, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->dexKit:Lh/Hchat/hooks/items/script/ScriptDexKitBridge;

    .line 20
    .line 21
    const-class p1, Lh/Hchat/hooks/api/core/WeChatApis;

    .line 22
    .line 23
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->apis:Ljava/lang/Class;

    .line 24
    .line 25
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->pluginHooks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->pluginFloatingBars:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    new-instance p1, Ljava/lang/Object;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->configLock:Ljava/lang/Object;

    .line 45
    .line 46
    new-instance p1, Landroid/os/Handler;

    .line 47
    .line 48
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->mainHandler:Landroid/os/Handler;

    .line 56
    .line 57
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/io/File;Lh/Hchat/hooks/items/script/ScriptDexKitBridge;ILgg/g;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 58
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/io/File;Lh/Hchat/hooks/items/script/ScriptDexKitBridge;)V

    return-void
.end method

.method public static synthetic a(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleInputDialog$lambda$0$0(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Ljava/lang/String;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final applyModuleFloatingGlassBar$lambda$1(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Landroid/view/View;Ljava/util/Map;Ljava/lang/String;)Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-direct {v0, v4}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->findActivity(Landroid/content/Context;)Landroid/app/Activity;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    :goto_0
    move-object v8, v4

    .line 20
    goto :goto_2

    .line 21
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    invoke-virtual {v4}, Lq8/o;->a()Landroid/app/Activity;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v4, 0x0

    .line 33
    :goto_1
    if-eqz v4, :cond_2b

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_2
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 37
    .line 38
    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object v6, Lwb/fr;->a:Lwb/fr;

    .line 42
    .line 43
    new-instance v14, Lab/e;

    .line 44
    .line 45
    const/4 v6, 0x5

    .line 46
    invoke-direct {v14, v4, v0, v3, v6}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_2a

    .line 62
    .line 63
    invoke-virtual {v8}, Landroid/app/Activity;->isFinishing()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-nez v6, :cond_3

    .line 68
    .line 69
    invoke-virtual {v8}, Landroid/app/Activity;->isDestroyed()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_2

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_2
    instance-of v6, v1, Landroid/view/SurfaceView;

    .line 77
    .line 78
    if-nez v6, :cond_3

    .line 79
    .line 80
    instance-of v6, v1, Landroid/view/TextureView;

    .line 81
    .line 82
    if-eqz v6, :cond_4

    .line 83
    .line 84
    :cond_3
    :goto_3
    move-object/from16 v21, v4

    .line 85
    .line 86
    goto/16 :goto_27

    .line 87
    .line 88
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-nez v6, :cond_5

    .line 93
    .line 94
    move-object/from16 v21, v4

    .line 95
    .line 96
    :goto_4
    const/4 v5, 0x0

    .line 97
    const/16 v20, 0x0

    .line 98
    .line 99
    goto/16 :goto_29

    .line 100
    .line 101
    :cond_5
    const v6, 0x1020002

    .line 102
    .line 103
    .line 104
    invoke-virtual {v8, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    move-object v15, v6

    .line 109
    check-cast v15, Landroid/view/ViewGroup;

    .line 110
    .line 111
    if-eqz v15, :cond_27

    .line 112
    .line 113
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    instance-of v7, v6, Landroid/view/ViewGroup;

    .line 118
    .line 119
    if-eqz v7, :cond_6

    .line 120
    .line 121
    check-cast v6, Landroid/view/ViewGroup;

    .line 122
    .line 123
    move-object/from16 v16, v4

    .line 124
    .line 125
    move-object v4, v6

    .line 126
    goto :goto_5

    .line 127
    :cond_6
    move-object/from16 v16, v4

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    :goto_5
    if-eqz v4, :cond_23

    .line 131
    .line 132
    if-eq v1, v15, :cond_26

    .line 133
    .line 134
    move-object v6, v1

    .line 135
    :goto_6
    if-eqz v6, :cond_26

    .line 136
    .line 137
    if-ne v6, v15, :cond_24

    .line 138
    .line 139
    invoke-virtual {v15}, Landroid/view/ViewGroup;->getChildCount()I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_7

    .line 144
    .line 145
    :goto_7
    move-object/from16 v21, v16

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    sget-object v6, Lwb/fr;->c:Ljava/util/WeakHashMap;

    .line 149
    .line 150
    monitor-enter v6

    .line 151
    :try_start_0
    invoke-virtual {v6, v15}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, Lwb/dr;

    .line 156
    .line 157
    const/4 v9, 0x1

    .line 158
    if-eqz v7, :cond_8

    .line 159
    .line 160
    iget-object v7, v7, Lwb/dr;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 161
    .line 162
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 163
    .line 164
    .line 165
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_17

    .line 166
    if-ne v7, v9, :cond_8

    .line 167
    .line 168
    monitor-exit v6

    .line 169
    goto :goto_7

    .line 170
    :cond_8
    monitor-exit v6

    .line 171
    new-instance v12, Lwb/er;

    .line 172
    .line 173
    const-string v6, "glass"

    .line 174
    .line 175
    invoke-static {v6, v2}, Lac/p;->g(Ljava/lang/String;Ljava/util/Map;)Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    const-string v7, "clearBackground"

    .line 180
    .line 181
    invoke-static {v7, v2}, Lac/p;->g(Ljava/lang/String;Ljava/util/Map;)Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    const-string v10, "horizontalMarginDp"

    .line 186
    .line 187
    invoke-static {v10, v2}, Lac/p;->r(Ljava/lang/String;Ljava/util/Map;)F

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    const/4 v11, 0x0

    .line 192
    const/high16 v13, 0x42400000    # 48.0f

    .line 193
    .line 194
    invoke-static {v10, v11, v13}, Lr9/e0;->q(FFF)F

    .line 195
    .line 196
    .line 197
    move-result v10

    .line 198
    const-string v9, "bottomMarginDp"

    .line 199
    .line 200
    invoke-static {v9, v2}, Lac/p;->r(Ljava/lang/String;Ljava/util/Map;)F

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    invoke-static {v2, v11, v13}, Lr9/e0;->q(FFF)F

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-direct {v12, v6, v7, v10, v2}, Lwb/er;-><init>(ZZFF)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-gez v2, :cond_9

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_9
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    if-eqz v6, :cond_23

    .line 223
    .line 224
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 225
    .line 226
    .line 227
    move-result-object v17

    .line 228
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    if-lez v7, :cond_a

    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_a
    const/4 v9, 0x0

    .line 240
    :goto_8
    if-eqz v9, :cond_b

    .line 241
    .line 242
    :goto_9
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    :goto_a
    move v11, v7

    .line 247
    goto :goto_d

    .line 248
    :cond_b
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    if-lez v7, :cond_c

    .line 257
    .line 258
    goto :goto_b

    .line 259
    :cond_c
    const/4 v9, 0x0

    .line 260
    :goto_b
    if-eqz v9, :cond_d

    .line 261
    .line 262
    goto :goto_9

    .line 263
    :cond_d
    iget v7, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 264
    .line 265
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    if-lez v7, :cond_e

    .line 270
    .line 271
    goto :goto_c

    .line 272
    :cond_e
    const/4 v9, 0x0

    .line 273
    :goto_c
    if-eqz v9, :cond_f

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_f
    const/16 v7, 0x38

    .line 277
    .line 278
    int-to-float v7, v7

    .line 279
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 288
    .line 289
    mul-float/2addr v7, v9

    .line 290
    float-to-int v7, v7

    .line 291
    goto :goto_a

    .line 292
    :goto_d
    new-instance v7, Landroid/view/View;

    .line 293
    .line 294
    invoke-direct {v7, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 295
    .line 296
    .line 297
    const/4 v9, 0x0

    .line 298
    invoke-virtual {v7, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    if-gez v10, :cond_10

    .line 306
    .line 307
    move v10, v9

    .line 308
    :cond_10
    invoke-virtual {v7, v10}, Landroid/view/View;->setMinimumWidth(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v7, v11}, Landroid/view/View;->setMinimumHeight(I)V

    .line 312
    .line 313
    .line 314
    const/4 v10, 0x4

    .line 315
    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    .line 316
    .line 317
    .line 318
    new-instance v18, Ljava/util/ArrayList;

    .line 319
    .line 320
    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 321
    .line 322
    .line 323
    new-instance v13, Landroid/widget/FrameLayout;

    .line 324
    .line 325
    invoke-direct {v13, v8}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v13, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v13, v9}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v13, v9}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 335
    .line 336
    .line 337
    new-instance v10, Landroid/widget/FrameLayout;

    .line 338
    .line 339
    invoke-direct {v10, v8}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v10, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v10, v9}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v10, v9}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 349
    .line 350
    .line 351
    :try_start_1
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4, v7, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v15}, Landroid/view/ViewGroup;->getChildCount()I

    .line 358
    .line 359
    .line 360
    move-result v9

    .line 361
    const/4 v5, 0x0

    .line 362
    :goto_e
    if-lt v5, v9, :cond_1a

    .line 363
    .line 364
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 369
    .line 370
    .line 371
    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_13

    .line 372
    if-eqz v9, :cond_11

    .line 373
    .line 374
    :try_start_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v9

    .line 378
    check-cast v9, Lwb/br;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 379
    .line 380
    move/from16 v19, v2

    .line 381
    .line 382
    :try_start_3
    iget-object v2, v9, Lwb/br;->a:Landroid/view/View;

    .line 383
    .line 384
    invoke-virtual {v15, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 385
    .line 386
    .line 387
    iget-object v2, v9, Lwb/br;->a:Landroid/view/View;

    .line 388
    .line 389
    iget-object v9, v9, Lwb/br;->c:Landroid/view/ViewGroup$LayoutParams;

    .line 390
    .line 391
    invoke-virtual {v13, v2, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 392
    .line 393
    .line 394
    move/from16 v2, v19

    .line 395
    .line 396
    goto :goto_f

    .line 397
    :catchall_0
    move-exception v0

    .line 398
    :goto_10
    move-object v12, v0

    .line 399
    move-object v1, v7

    .line 400
    move-object v11, v13

    .line 401
    move-object v3, v15

    .line 402
    move-object/from16 v7, v17

    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const/4 v14, 0x0

    .line 406
    :goto_11
    const/16 v20, 0x0

    .line 407
    .line 408
    :goto_12
    move-object v15, v10

    .line 409
    move-object/from16 v10, v18

    .line 410
    .line 411
    goto/16 :goto_23

    .line 412
    .line 413
    :catchall_1
    move-exception v0

    .line 414
    move/from16 v19, v2

    .line 415
    .line 416
    goto :goto_10

    .line 417
    :cond_11
    move/from16 v19, v2

    .line 418
    .line 419
    :try_start_4
    iget-boolean v2, v12, Lwb/er;->b:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_12

    .line 420
    .line 421
    if-eqz v2, :cond_12

    .line 422
    .line 423
    const/4 v2, 0x0

    .line 424
    :try_start_5
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 425
    .line 426
    .line 427
    goto :goto_13

    .line 428
    :catchall_2
    move-exception v0

    .line 429
    move-object v12, v0

    .line 430
    move-object v14, v2

    .line 431
    move-object/from16 v20, v14

    .line 432
    .line 433
    move-object v1, v7

    .line 434
    move-object v11, v13

    .line 435
    move-object v3, v15

    .line 436
    move-object/from16 v7, v17

    .line 437
    .line 438
    move-object/from16 v13, v20

    .line 439
    .line 440
    goto :goto_12

    .line 441
    :cond_12
    const/4 v2, 0x0

    .line 442
    :goto_13
    :try_start_6
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 443
    .line 444
    const/4 v9, -0x1

    .line 445
    invoke-direct {v5, v9, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v10, v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_11

    .line 449
    .line 450
    .line 451
    move-object v5, v7

    .line 452
    :try_start_7
    new-instance v7, Lc9/a1;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_10

    .line 453
    .line 454
    const/4 v2, 0x4

    .line 455
    :try_start_8
    invoke-direct {v7, v2}, Lc9/a1;-><init>(I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_f

    .line 456
    .line 457
    .line 458
    :try_start_9
    iget-object v2, v7, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 459
    .line 460
    iget-boolean v9, v7, Lc9/a1;->l:Z

    .line 461
    .line 462
    if-nez v9, :cond_13

    .line 463
    .line 464
    iget-object v9, v7, Lc9/a1;->i:Lp4/t;

    .line 465
    .line 466
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 467
    .line 468
    invoke-virtual {v9, v1}, Lp4/t;->F(Landroid/os/Bundle;)V

    .line 469
    .line 470
    .line 471
    const/4 v1, 0x1

    .line 472
    iput-boolean v1, v7, Lc9/a1;->l:Z

    .line 473
    .line 474
    goto :goto_14

    .line 475
    :cond_13
    const/4 v1, 0x1

    .line 476
    :goto_14
    sget-object v9, Landroidx/lifecycle/l;->i:Landroidx/lifecycle/l;

    .line 477
    .line 478
    const-string v1, "setCurrentState"

    .line 479
    .line 480
    invoke-virtual {v2, v1}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v9}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 484
    .line 485
    .line 486
    sget-object v1, Landroidx/lifecycle/l;->j:Landroidx/lifecycle/l;

    .line 487
    .line 488
    const-string v9, "setCurrentState"

    .line 489
    .line 490
    invoke-virtual {v2, v9}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, v1}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 494
    .line 495
    .line 496
    sget-object v1, Landroidx/lifecycle/l;->k:Landroidx/lifecycle/l;

    .line 497
    .line 498
    const-string v9, "setCurrentState"

    .line 499
    .line 500
    invoke-virtual {v2, v9}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2, v1}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_e

    .line 504
    .line 505
    .line 506
    :try_start_a
    new-instance v1, Ly1/c1;

    .line 507
    .line 508
    invoke-direct {v1, v8}, Ly1/c1;-><init>(Landroid/app/Activity;)V

    .line 509
    .line 510
    .line 511
    invoke-static {v1, v7, v7, v7, v7}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 512
    .line 513
    .line 514
    sget-object v2, Ly1/r1;->h:Ly1/r1;

    .line 515
    .line 516
    invoke-virtual {v1, v2}, Ly1/a;->setViewCompositionStrategy(Ly1/k2;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_d

    .line 517
    .line 518
    .line 519
    move-object v2, v6

    .line 520
    :try_start_b
    new-instance v6, Lc9/c0;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_c

    .line 521
    .line 522
    move-object v9, v13

    .line 523
    const/16 v13, 0x9

    .line 524
    .line 525
    move-object/from16 p2, v2

    .line 526
    .line 527
    const/4 v2, 0x1

    .line 528
    :try_start_c
    invoke-direct/range {v6 .. v13}, Lc9/c0;-><init>(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 529
    .line 530
    .line 531
    move-object v13, v7

    .line 532
    :try_start_d
    new-instance v7, Ls0/d;

    .line 533
    .line 534
    const v11, -0x4d910ce8

    .line 535
    .line 536
    .line 537
    invoke-direct {v7, v11, v6, v2}, Ls0/d;-><init>(ILsf/b;Z)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 538
    .line 539
    .line 540
    :try_start_e
    invoke-virtual {v1, v7}, Ly1/c1;->setContent(Lfg/p;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 541
    .line 542
    .line 543
    :try_start_f
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 544
    .line 545
    const/4 v6, -0x1

    .line 546
    invoke-direct {v2, v6, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v15, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v8}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 553
    .line 554
    .line 555
    move-result-object v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 556
    if-eqz v2, :cond_14

    .line 557
    .line 558
    :try_start_10
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 559
    .line 560
    .line 561
    move-result-object v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 562
    goto :goto_15

    .line 563
    :catchall_3
    move-exception v0

    .line 564
    move-object/from16 v6, p2

    .line 565
    .line 566
    move-object v12, v0

    .line 567
    move-object v14, v1

    .line 568
    move-object v1, v5

    .line 569
    move-object v11, v9

    .line 570
    move-object v3, v15

    .line 571
    move-object/from16 v7, v17

    .line 572
    .line 573
    goto/16 :goto_11

    .line 574
    .line 575
    :cond_14
    const/4 v2, 0x0

    .line 576
    :goto_15
    :try_start_11
    new-instance v6, Lgg/u;

    .line 577
    .line 578
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 579
    .line 580
    .line 581
    move-object v12, v1

    .line 582
    :try_start_12
    new-instance v1, Lwb/dr;

    .line 583
    .line 584
    new-instance v7, Lwb/zh;

    .line 585
    .line 586
    const/16 v8, 0x8

    .line 587
    .line 588
    invoke-direct {v7, v14, v15, v6, v8}, Lwb/zh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 589
    .line 590
    .line 591
    move-object v14, v2

    .line 592
    move-object v8, v5

    .line 593
    move-object v0, v6

    .line 594
    move-object v11, v10

    .line 595
    move-object v3, v15

    .line 596
    move-object/from16 v21, v16

    .line 597
    .line 598
    move/from16 v5, v19

    .line 599
    .line 600
    const/16 v20, 0x0

    .line 601
    .line 602
    move-object/from16 v2, p1

    .line 603
    .line 604
    move-object/from16 v6, p2

    .line 605
    .line 606
    move-object v15, v7

    .line 607
    move-object v10, v9

    .line 608
    move-object/from16 v7, v17

    .line 609
    .line 610
    move-object/from16 v9, v18

    .line 611
    .line 612
    :try_start_13
    invoke-direct/range {v1 .. v15}, Lwb/dr;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/ViewGroup;ILandroid/view/ViewGroup$LayoutParams;Landroid/graphics/drawable/Drawable;Landroid/view/View;Ljava/util/ArrayList;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Ly1/c1;Lc9/a1;Landroid/view/View;Lwb/zh;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 613
    .line 614
    .line 615
    move-object v2, v1

    .line 616
    move/from16 v19, v5

    .line 617
    .line 618
    move-object v1, v8

    .line 619
    move-object v15, v11

    .line 620
    move-object v11, v10

    .line 621
    move-object v10, v9

    .line 622
    :try_start_14
    iput-object v2, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 623
    .line 624
    if-eqz v14, :cond_15

    .line 625
    .line 626
    invoke-virtual {v14, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 627
    .line 628
    .line 629
    goto :goto_17

    .line 630
    :catchall_4
    move-exception v0

    .line 631
    :goto_16
    move-object v14, v12

    .line 632
    move-object v12, v0

    .line 633
    goto/16 :goto_23

    .line 634
    .line 635
    :cond_15
    :goto_17
    if-eq v4, v14, :cond_17

    .line 636
    .line 637
    iget-object v2, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 638
    .line 639
    if-eqz v2, :cond_16

    .line 640
    .line 641
    check-cast v2, Lwb/dr;

    .line 642
    .line 643
    invoke-virtual {v4, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 644
    .line 645
    .line 646
    goto :goto_18

    .line 647
    :cond_16
    const-string v0, "handle"

    .line 648
    .line 649
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    throw v20

    .line 653
    :cond_17
    :goto_18
    sget-object v2, Lwb/fr;->c:Ljava/util/WeakHashMap;

    .line 654
    .line 655
    monitor-enter v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 656
    :try_start_15
    iget-object v5, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 657
    .line 658
    if-eqz v5, :cond_19

    .line 659
    .line 660
    check-cast v5, Lwb/dr;

    .line 661
    .line 662
    invoke-virtual {v2, v3, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    .line 663
    .line 664
    .line 665
    :try_start_16
    monitor-exit v2

    .line 666
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 667
    .line 668
    if-eqz v0, :cond_18

    .line 669
    .line 670
    move-object v5, v0

    .line 671
    check-cast v5, Lwb/dr;

    .line 672
    .line 673
    goto/16 :goto_29

    .line 674
    .line 675
    :cond_18
    const-string v0, "handle"

    .line 676
    .line 677
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    throw v20
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 681
    :catchall_5
    move-exception v0

    .line 682
    goto :goto_19

    .line 683
    :cond_19
    :try_start_17
    const-string v0, "handle"

    .line 684
    .line 685
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    throw v20
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    .line 689
    :goto_19
    :try_start_18
    monitor-exit v2

    .line 690
    throw v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    .line 691
    :catchall_6
    move-exception v0

    .line 692
    move/from16 v19, v5

    .line 693
    .line 694
    move-object v1, v8

    .line 695
    move-object v15, v11

    .line 696
    move-object v11, v10

    .line 697
    move-object v10, v9

    .line 698
    goto :goto_16

    .line 699
    :catchall_7
    move-exception v0

    .line 700
    move-object/from16 v6, p2

    .line 701
    .line 702
    :goto_1a
    move-object v1, v5

    .line 703
    move-object v11, v9

    .line 704
    move-object v3, v15

    .line 705
    move-object/from16 v7, v17

    .line 706
    .line 707
    const/16 v20, 0x0

    .line 708
    .line 709
    move-object v15, v10

    .line 710
    move-object/from16 v10, v18

    .line 711
    .line 712
    goto :goto_16

    .line 713
    :catchall_8
    move-exception v0

    .line 714
    move-object/from16 v6, p2

    .line 715
    .line 716
    move-object v12, v1

    .line 717
    goto :goto_1a

    .line 718
    :catchall_9
    move-exception v0

    .line 719
    move-object/from16 v6, p2

    .line 720
    .line 721
    move-object v1, v5

    .line 722
    :goto_1b
    move-object v11, v9

    .line 723
    move-object v3, v15

    .line 724
    move-object/from16 v7, v17

    .line 725
    .line 726
    const/16 v20, 0x0

    .line 727
    .line 728
    move-object v15, v10

    .line 729
    :goto_1c
    move-object/from16 v10, v18

    .line 730
    .line 731
    move-object v12, v0

    .line 732
    move-object/from16 v14, v20

    .line 733
    .line 734
    goto/16 :goto_23

    .line 735
    .line 736
    :catchall_a
    move-exception v0

    .line 737
    move-object/from16 v6, p2

    .line 738
    .line 739
    move-object v1, v5

    .line 740
    move-object v11, v9

    .line 741
    move-object v3, v15

    .line 742
    move-object/from16 v7, v17

    .line 743
    .line 744
    const/16 v20, 0x0

    .line 745
    .line 746
    move-object v15, v10

    .line 747
    goto :goto_1c

    .line 748
    :catchall_b
    move-exception v0

    .line 749
    move-object/from16 v6, p2

    .line 750
    .line 751
    move-object v1, v5

    .line 752
    move-object v13, v7

    .line 753
    goto :goto_1b

    .line 754
    :catchall_c
    move-exception v0

    .line 755
    move-object v6, v2

    .line 756
    :goto_1d
    move-object v1, v5

    .line 757
    move-object v11, v13

    .line 758
    move-object v3, v15

    .line 759
    const/16 v20, 0x0

    .line 760
    .line 761
    move-object v13, v7

    .line 762
    move-object v15, v10

    .line 763
    move-object/from16 v7, v17

    .line 764
    .line 765
    goto :goto_1c

    .line 766
    :catchall_d
    move-exception v0

    .line 767
    goto :goto_1d

    .line 768
    :catchall_e
    move-exception v0

    .line 769
    move-object v1, v5

    .line 770
    move-object v11, v13

    .line 771
    move-object v3, v15

    .line 772
    move-object/from16 v7, v17

    .line 773
    .line 774
    const/16 v20, 0x0

    .line 775
    .line 776
    goto :goto_20

    .line 777
    :goto_1e
    move-object v12, v0

    .line 778
    move-object/from16 v13, v20

    .line 779
    .line 780
    move-object v14, v13

    .line 781
    goto/16 :goto_23

    .line 782
    .line 783
    :catchall_f
    move-exception v0

    .line 784
    move-object v1, v5

    .line 785
    :goto_1f
    move-object v11, v13

    .line 786
    move-object v3, v15

    .line 787
    move-object/from16 v7, v17

    .line 788
    .line 789
    const/16 v20, 0x0

    .line 790
    .line 791
    :goto_20
    move-object v15, v10

    .line 792
    move-object/from16 v10, v18

    .line 793
    .line 794
    goto :goto_1e

    .line 795
    :catchall_10
    move-exception v0

    .line 796
    move-object/from16 v20, v2

    .line 797
    .line 798
    move-object v1, v5

    .line 799
    :goto_21
    move-object v11, v13

    .line 800
    move-object v3, v15

    .line 801
    move-object/from16 v7, v17

    .line 802
    .line 803
    goto :goto_20

    .line 804
    :catchall_11
    move-exception v0

    .line 805
    move-object/from16 v20, v2

    .line 806
    .line 807
    move-object v1, v7

    .line 808
    goto :goto_21

    .line 809
    :catchall_12
    move-exception v0

    .line 810
    :goto_22
    move-object v1, v7

    .line 811
    goto :goto_1f

    .line 812
    :catchall_13
    move-exception v0

    .line 813
    move/from16 v19, v2

    .line 814
    .line 815
    goto :goto_22

    .line 816
    :cond_1a
    move/from16 v19, v2

    .line 817
    .line 818
    move-object v1, v7

    .line 819
    move v0, v11

    .line 820
    move-object v11, v13

    .line 821
    move-object v3, v15

    .line 822
    move-object/from16 v21, v16

    .line 823
    .line 824
    move-object/from16 v7, v17

    .line 825
    .line 826
    const/4 v13, 0x4

    .line 827
    const/16 v20, 0x0

    .line 828
    .line 829
    move-object v15, v10

    .line 830
    move-object/from16 v10, v18

    .line 831
    .line 832
    :try_start_19
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    new-instance v13, Lwb/br;

    .line 837
    .line 838
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    move/from16 v16, v0

    .line 842
    .line 843
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    invoke-direct {v13, v2, v5, v0}, Lwb/br;-><init>(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 851
    .line 852
    .line 853
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_14

    .line 854
    .line 855
    .line 856
    add-int/lit8 v5, v5, 0x1

    .line 857
    .line 858
    move-object/from16 v0, p0

    .line 859
    .line 860
    move-object/from16 v17, v7

    .line 861
    .line 862
    move-object/from16 v18, v10

    .line 863
    .line 864
    move-object v13, v11

    .line 865
    move-object v10, v15

    .line 866
    move/from16 v11, v16

    .line 867
    .line 868
    move/from16 v2, v19

    .line 869
    .line 870
    move-object/from16 v16, v21

    .line 871
    .line 872
    move-object v7, v1

    .line 873
    move-object v15, v3

    .line 874
    move-object/from16 v1, p1

    .line 875
    .line 876
    move-object/from16 v3, p3

    .line 877
    .line 878
    goto/16 :goto_e

    .line 879
    .line 880
    :catchall_14
    move-exception v0

    .line 881
    goto :goto_1e

    .line 882
    :goto_23
    if-eqz v14, :cond_1b

    .line 883
    .line 884
    :try_start_1a
    invoke-virtual {v14}, Ly1/a;->f()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_15

    .line 885
    .line 886
    .line 887
    :catchall_15
    :cond_1b
    if-eqz v14, :cond_1c

    .line 888
    .line 889
    invoke-virtual {v14}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 890
    .line 891
    .line 892
    move-result-object v5

    .line 893
    goto :goto_24

    .line 894
    :cond_1c
    move-object/from16 v5, v20

    .line 895
    .line 896
    :goto_24
    instance-of v0, v5, Landroid/view/ViewGroup;

    .line 897
    .line 898
    if-eqz v0, :cond_1d

    .line 899
    .line 900
    check-cast v5, Landroid/view/ViewGroup;

    .line 901
    .line 902
    goto :goto_25

    .line 903
    :cond_1d
    move-object/from16 v5, v20

    .line 904
    .line 905
    :goto_25
    if-eqz v5, :cond_1e

    .line 906
    .line 907
    invoke-virtual {v5, v14}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 908
    .line 909
    .line 910
    :cond_1e
    move-object v2, v3

    .line 911
    move-object v3, v4

    .line 912
    move-object v5, v6

    .line 913
    move-object v6, v7

    .line 914
    move-object v8, v10

    .line 915
    move-object v9, v11

    .line 916
    move-object v10, v15

    .line 917
    move/from16 v4, v19

    .line 918
    .line 919
    move-object v7, v1

    .line 920
    move-object/from16 v1, p1

    .line 921
    .line 922
    :try_start_1b
    invoke-static/range {v1 .. v10}, Lwb/fr;->c(Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/ViewGroup;ILandroid/view/ViewGroup$LayoutParams;Landroid/graphics/drawable/Drawable;Landroid/view/View;Ljava/util/ArrayList;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V

    .line 923
    .line 924
    .line 925
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_16

    .line 926
    .line 927
    goto :goto_26

    .line 928
    :catchall_16
    move-exception v0

    .line 929
    new-instance v1, Lsf/f;

    .line 930
    .line 931
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 932
    .line 933
    .line 934
    move-object v0, v1

    .line 935
    :goto_26
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    if-eqz v0, :cond_1f

    .line 940
    .line 941
    invoke-virtual {v12, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 942
    .line 943
    .line 944
    :cond_1f
    if-eqz v14, :cond_20

    .line 945
    .line 946
    if-eqz v13, :cond_20

    .line 947
    .line 948
    invoke-static {v14}, Lx6/d;->p(Landroid/view/View;)V

    .line 949
    .line 950
    .line 951
    :cond_20
    if-eqz v13, :cond_22

    .line 952
    .line 953
    iget-object v0, v13, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 954
    .line 955
    iget-object v1, v0, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 956
    .line 957
    sget-object v2, Landroidx/lifecycle/l;->g:Landroidx/lifecycle/l;

    .line 958
    .line 959
    if-eq v1, v2, :cond_21

    .line 960
    .line 961
    invoke-virtual {v0, v2}, Landroidx/lifecycle/s;->g(Landroidx/lifecycle/l;)V

    .line 962
    .line 963
    .line 964
    :cond_21
    iget-object v0, v13, Lc9/a1;->k:Lr3/a;

    .line 965
    .line 966
    invoke-virtual {v0}, Lr3/a;->a()V

    .line 967
    .line 968
    .line 969
    iget-object v0, v13, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 970
    .line 971
    invoke-virtual {v0}, Landroidx/lifecycle/e0;->a()V

    .line 972
    .line 973
    .line 974
    :cond_22
    throw v12

    .line 975
    :cond_23
    move-object/from16 v21, v16

    .line 976
    .line 977
    :goto_27
    const/16 v20, 0x0

    .line 978
    .line 979
    move-object/from16 v5, v20

    .line 980
    .line 981
    goto :goto_29

    .line 982
    :catchall_17
    move-exception v0

    .line 983
    monitor-exit v6

    .line 984
    throw v0

    .line 985
    :cond_24
    move-object v3, v15

    .line 986
    move-object/from16 v21, v16

    .line 987
    .line 988
    const/16 v20, 0x0

    .line 989
    .line 990
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    instance-of v1, v0, Landroid/view/View;

    .line 995
    .line 996
    if-eqz v1, :cond_25

    .line 997
    .line 998
    check-cast v0, Landroid/view/View;

    .line 999
    .line 1000
    move-object v6, v0

    .line 1001
    goto :goto_28

    .line 1002
    :cond_25
    move-object/from16 v6, v20

    .line 1003
    .line 1004
    :goto_28
    move-object/from16 v0, p0

    .line 1005
    .line 1006
    move-object/from16 v1, p1

    .line 1007
    .line 1008
    move-object v15, v3

    .line 1009
    move-object/from16 v16, v21

    .line 1010
    .line 1011
    move-object/from16 v3, p3

    .line 1012
    .line 1013
    goto/16 :goto_6

    .line 1014
    .line 1015
    :cond_26
    move-object/from16 v21, v16

    .line 1016
    .line 1017
    goto :goto_27

    .line 1018
    :cond_27
    move-object/from16 v21, v4

    .line 1019
    .line 1020
    goto :goto_27

    .line 1021
    :goto_29
    if-eqz v5, :cond_2c

    .line 1022
    .line 1023
    new-instance v0, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;

    .line 1024
    .line 1025
    new-instance v1, Laa/c;

    .line 1026
    .line 1027
    const/4 v2, 0x7

    .line 1028
    move-object/from16 v3, p0

    .line 1029
    .line 1030
    invoke-direct {v1, v3, v2, v5}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1031
    .line 1032
    .line 1033
    invoke-direct {v0, v5, v1}, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;-><init>(Lwb/p3;Lfg/a;)V

    .line 1034
    .line 1035
    .line 1036
    move-object/from16 v1, v21

    .line 1037
    .line 1038
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1039
    .line 1040
    .line 1041
    iget-object v1, v3, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->pluginFloatingBars:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1042
    .line 1043
    move-object/from16 v3, p3

    .line 1044
    .line 1045
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v2

    .line 1049
    if-nez v2, :cond_29

    .line 1050
    .line 1051
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1052
    .line 1053
    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 1054
    .line 1055
    .line 1056
    invoke-interface {v1, v3, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    if-nez v1, :cond_28

    .line 1061
    .line 1062
    goto :goto_2a

    .line 1063
    :cond_28
    move-object v2, v1

    .line 1064
    :cond_29
    :goto_2a
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1065
    .line 1066
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1067
    .line 1068
    .line 1069
    return-object v0

    .line 1070
    :cond_2a
    const/16 v20, 0x0

    .line 1071
    .line 1072
    const-string v0, "\u60ac\u6d6e\u5e95\u680f\u53ea\u80fd\u5728\u4e3b\u7ebf\u7a0b\u6302\u8f7d"

    .line 1073
    .line 1074
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1075
    .line 1076
    .line 1077
    return-object v20

    .line 1078
    :cond_2b
    const/16 v20, 0x0

    .line 1079
    .line 1080
    :cond_2c
    return-object v20
.end method

.method private static final applyModuleFloatingGlassBar$lambda$1$0(Ljava/util/concurrent/atomic/AtomicReference;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/lang/String;)Lsf/n;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;

    .line 6
    .line 7
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    iget-object v1, p1, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->pluginFloatingBars:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    iget-object p1, p1, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->pluginFloatingBars:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-virtual {p1, p2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;->markRestored$app()V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-object v0
.end method

.method private static final applyModuleFloatingGlassBar$lambda$1$1(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lwb/p3;)Lsf/n;
    .locals 2

    .line 1
    new-instance v0, Lab/a;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->callOnMainForResult(Lfg/a;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final applyModuleFloatingGlassBar$lambda$1$1$0(Lwb/p3;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    check-cast p0, Lwb/dr;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lwb/dr;->a()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v0, Lwb/fr;->b:Landroid/os/Handler;

    .line 25
    .line 26
    new-instance v1, Lwb/cr;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v1, p0, v2}, Lwb/cr;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    return-object p0
.end method

.method private final areAssignable([Ljava/lang/Class;[Ljava/lang/Object;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    array-length v1, p2

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v2

    .line 7
    :cond_0
    invoke-static {p1}, Ltf/l;->A0([Ljava/lang/Object;)Llg/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Ljava/util/Collection;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, Ljava/util/Collection;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    return v3

    .line 26
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    aget-object v4, p1, v1

    .line 47
    .line 48
    aget-object v1, p2, v1

    .line 49
    .line 50
    invoke-direct {p0, v4, v1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->isAssignable(Ljava/lang/Class;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    return v2

    .line 65
    :cond_3
    return v3
.end method

.method public static synthetic b(Landroid/app/Activity;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lfg/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showOnMain$lambda$0(Landroid/app/Activity;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lfg/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final boxType(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-class p1, Ljava/lang/Integer;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const-class p1, Ljava/lang/Long;

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    const-class p1, Ljava/lang/Boolean;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_3
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    const-class p1, Ljava/lang/Double;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_4
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    const-class p1, Ljava/lang/Float;

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_5
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    const-class p1, Ljava/lang/Short;

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_6
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_7

    .line 81
    .line 82
    const-class p1, Ljava/lang/Byte;

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_7
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_8

    .line 92
    .line 93
    const-class p1, Ljava/lang/Character;

    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_8
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_9

    .line 103
    .line 104
    const-class p1, Ljava/lang/Void;

    .line 105
    .line 106
    :cond_9
    :goto_0
    return-object p1
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleChoiceDialog$lambda$1(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final callOnMainForResult(Lfg/a;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lfg/a;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v1, "[Hchat:Script] \u6267\u884c\u6a21\u5757\u60ac\u6d6e\u5e95\u680f\u64cd\u4f5c\u5931\u8d25: "

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    :try_start_0
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    move-object p1, v0

    .line 25
    new-instance v0, Lsf/f;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object p1, v0

    .line 31
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v1, v3, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    instance-of v0, p1, Lsf/f;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v2, p1

    .line 50
    :goto_1
    return-object v2

    .line 51
    :cond_2
    new-instance v4, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-direct {v4, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance v6, Ljava/util/concurrent/atomic/AtomicReference;

    .line 58
    .line 59
    invoke-direct {v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v8, Ljava/util/concurrent/atomic/AtomicReference;

    .line 63
    .line 64
    invoke-direct {v8}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v5, Ljava/util/concurrent/CountDownLatch;

    .line 68
    .line 69
    const/4 v10, 0x1

    .line 70
    invoke-direct {v5, v10}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Lca/x;

    .line 74
    .line 75
    const/4 v9, 0x4

    .line 76
    move-object v7, p1

    .line 77
    invoke-direct/range {v3 .. v9}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->mainHandler:Landroid/os/Handler;

    .line 81
    .line 82
    invoke-virtual {p1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_3

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    :try_start_1
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 90
    .line 91
    const-wide/16 v11, 0x5

    .line 92
    .line 93
    invoke-virtual {v5, v11, v12, p1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 94
    .line 95
    .line 96
    move-result p1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 97
    move v7, v0

    .line 98
    goto :goto_2

    .line 99
    :catch_0
    move p1, v0

    .line 100
    move v7, v10

    .line 101
    :goto_2
    if-nez p1, :cond_6

    .line 102
    .line 103
    const/4 p1, 0x3

    .line 104
    invoke-virtual {v4, v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_5

    .line 109
    .line 110
    iget-object p1, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->mainHandler:Landroid/os/Handler;

    .line 111
    .line 112
    invoke-virtual {p1, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 113
    .line 114
    .line 115
    if-eqz v7, :cond_4

    .line 116
    .line 117
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 122
    .line 123
    .line 124
    const-string p1, "[Hchat:Script] \u7b49\u5f85\u6a21\u5757\u60ac\u6d6e\u5e95\u680f\u64cd\u4f5c\u88ab\u4e2d\u65ad"

    .line 125
    .line 126
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_4
    const-string p1, "[Hchat:Script] \u6267\u884c\u6a21\u5757\u60ac\u6d6e\u5e95\u680f\u64cd\u4f5c\u8d85\u65f6"

    .line 131
    .line 132
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :goto_3
    return-object v2

    .line 136
    :cond_5
    :goto_4
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    const/4 v0, 0x2

    .line 141
    if-eq p1, v0, :cond_6

    .line 142
    .line 143
    :try_start_2
    invoke-virtual {v5}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :catch_1
    move v7, v10

    .line 148
    goto :goto_4

    .line 149
    :cond_6
    if-eqz v7, :cond_7

    .line 150
    .line 151
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 156
    .line 157
    .line 158
    :cond_7
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    check-cast p1, Ljava/lang/Throwable;

    .line 163
    .line 164
    if-eqz p1, :cond_8

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v1, v0, p1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    return-object v2

    .line 174
    :cond_8
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1
.end method

.method private static final callOnMainForResult$lambda$1(Ljava/util/concurrent/atomic/AtomicInteger;IILjava/util/concurrent/CountDownLatch;Ljava/util/concurrent/atomic/AtomicReference;Lfg/a;Ljava/util/concurrent/atomic/AtomicReference;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    :try_start_0
    invoke-interface {p5}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p4, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0, p7}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    :try_start_1
    invoke-virtual {p6, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_1
    move-exception p1

    .line 31
    invoke-virtual {p0, p7}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 35
    .line 36
    .line 37
    throw p1
.end method

.method private final compatibleMethod(Ljava/lang/Object;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_5

    .line 3
    .line 4
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_3

    .line 11
    :cond_0
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->targetClass(Ljava/lang/Object;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    if-eqz p1, :cond_5

    .line 16
    .line 17
    const-class v1, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_5

    .line 24
    .line 25
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    move-object v3, v2

    .line 44
    check-cast v3, Ljava/lang/reflect/Method;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v4, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    array-length v4, v4

    .line 61
    if-ne v4, p3, :cond_2

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, v3, p4}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->areAssignable([Ljava/lang/Class;[Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const/4 v3, 0x0

    .line 79
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    move-object v2, v0

    .line 91
    :goto_2
    check-cast v2, Ljava/lang/reflect/Method;

    .line 92
    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    return-object v2

    .line 96
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_0

    .line 101
    :cond_5
    :goto_3
    return-object v0
.end method

.method private final configFile(Ljava/io/File;)Ljava/io/File;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Ljava/io/File;

    .line 4
    .line 5
    const-string v1, "config.prop"

    .line 6
    .line 7
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return-object p1
.end method

.method public static synthetic d(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/atomic/AtomicReference;Lfg/a;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 8

    .line 1
    const/4 v2, 0x1

    .line 2
    const/4 v7, 0x2

    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v3, p1

    .line 6
    move-object v4, p2

    .line 7
    move-object v5, p3

    .line 8
    move-object v6, p4

    .line 9
    invoke-static/range {v0 .. v7}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->callOnMainForResult$lambda$1(Ljava/util/concurrent/atomic/AtomicInteger;IILjava/util/concurrent/CountDownLatch;Ljava/util/concurrent/atomic/AtomicReference;Lfg/a;Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final dispatchDialogCallback(Ljava/util/function/Consumer;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/function/Consumer<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p1, p2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    new-instance p2, Lsf/f;

    .line 11
    .line 12
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    move-object p2, p1

    .line 18
    :goto_1
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, "[Hchat:Script] \u6a21\u5757\u5f39\u7a97\u56de\u8c03\u5931\u8d25: "

    .line 29
    .line 30
    invoke-static {v0, p2, p1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleMultiChoiceDialog$lambda$3(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;I)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleChoiceDialog$lambda$1$1(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;I)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final findActivity(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 1
    :goto_0
    instance-of v0, p1, Landroid/content/ContextWrapper;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p1, Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Landroid/app/Activity;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    move-object v0, p1

    .line 13
    check-cast v0, Landroid/content/ContextWrapper;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne v0, p1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object p1, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_2
    :goto_1
    instance-of v0, p1, Landroid/app/Activity;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    check-cast p1, Landroid/app/Activity;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_3
    const/4 p1, 0x0

    .line 32
    return-object p1
.end method

.method public static synthetic g()Lsf/n;
    .locals 1

    .line 1
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleDialog$lambda$0$0()Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic h()Lsf/n;
    .locals 1

    .line 1
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleConfirmDialog$lambda$0$1()Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic i(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Ljava/util/Set;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleMultiChoiceDialog$lambda$3$1(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Ljava/util/Set;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final isAssignable(Ljava/lang/Class;Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    xor-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->boxType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public static synthetic j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleConfirmDialog$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k()Lsf/n;
    .locals 1

    .line 1
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleInputDialog$lambda$0$1()Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic l(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lwb/dr;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->applyModuleFloatingGlassBar$lambda$1$1(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lwb/p3;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final loadPluginConfig(Ljava/io/File;)Ljava/util/Properties;
    .locals 10

    .line 1
    const-string v0, "[Hchat:Script] \u8bfb\u53d6\u63d2\u4ef6\u914d\u7f6e\u5931\u8d25: "

    .line 2
    .line 3
    const-string v1, "\u65e0\u6cd5\u521b\u5efa\u63d2\u4ef6\u914d\u7f6e\u9501\u76ee\u5f55: "

    .line 4
    .line 5
    const-string v2, "\u65e0\u6cd5\u521b\u5efa\u63d2\u4ef6\u914d\u7f6e\u76ee\u5f55: "

    .line 6
    .line 7
    new-instance v3, Ljava/util/Properties;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/Properties;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->configFile(Ljava/io/File;)Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    if-eqz v4, :cond_a

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    goto/16 :goto_a

    .line 25
    .line 26
    :cond_0
    iget-object v5, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->configLock:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v5

    .line 29
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    if-eqz v6, :cond_6

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-nez v7, :cond_2

    .line 40
    .line 41
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    new-instance v6, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :catchall_0
    move-exception v1

    .line 75
    goto/16 :goto_6

    .line 76
    .line 77
    :cond_2
    :goto_0
    new-instance v2, Ljava/io/File;

    .line 78
    .line 79
    iget-object v7, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->hostContext:Landroid/content/Context;

    .line 80
    .line 81
    invoke-static {v7}, Lub/b;->d(Landroid/content/Context;)Ljava/io/File;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    const-string v8, "script_plugin_locks"

    .line 86
    .line 87
    invoke-direct {v2, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-nez v7, :cond_4

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    new-instance v4, Ljava/lang/IllegalStateException;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    new-instance v6, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v4, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v4

    .line 129
    :cond_4
    :goto_1
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    new-instance v6, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v1, ".lock"

    .line 150
    .line 151
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    new-instance v6, Ljava/io/File;

    .line 159
    .line 160
    invoke-direct {v6, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 164
    .line 165
    const-string v2, "rw"

    .line 166
    .line 167
    invoke-direct {v1, v6, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    .line 169
    .line 170
    :try_start_1
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 171
    .line 172
    .line 173
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 174
    :try_start_2
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 175
    .line 176
    .line 177
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 178
    :try_start_3
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-eqz v7, :cond_5

    .line 183
    .line 184
    sget-object v7, Log/a;->a:Ljava/nio/charset/Charset;

    .line 185
    .line 186
    new-instance v8, Ljava/io/InputStreamReader;

    .line 187
    .line 188
    new-instance v9, Ljava/io/FileInputStream;

    .line 189
    .line 190
    invoke-direct {v9, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 191
    .line 192
    .line 193
    invoke-direct {v8, v9, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 194
    .line 195
    .line 196
    :try_start_4
    invoke-virtual {v3, v8}, Ljava/util/Properties;->load(Ljava/io/Reader;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 197
    .line 198
    .line 199
    :try_start_5
    invoke-virtual {v8}, Ljava/io/InputStreamReader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :catchall_1
    move-exception v4

    .line 204
    goto :goto_3

    .line 205
    :catchall_2
    move-exception v4

    .line 206
    :try_start_6
    throw v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 207
    :catchall_3
    move-exception v7

    .line 208
    :try_start_7
    invoke-static {v8, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    throw v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 212
    :cond_5
    :goto_2
    :try_start_8
    invoke-virtual {v6}, Ljava/nio/channels/FileLock;->release()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 213
    .line 214
    .line 215
    :try_start_9
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 216
    .line 217
    .line 218
    :try_start_a
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 219
    .line 220
    .line 221
    sget-object v1, Lsf/n;->a:Lsf/n;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 222
    .line 223
    goto :goto_7

    .line 224
    :catchall_4
    move-exception v2

    .line 225
    goto :goto_5

    .line 226
    :catchall_5
    move-exception v4

    .line 227
    goto :goto_4

    .line 228
    :goto_3
    :try_start_b
    invoke-virtual {v6}, Ljava/nio/channels/FileLock;->release()V

    .line 229
    .line 230
    .line 231
    throw v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 232
    :goto_4
    :try_start_c
    throw v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 233
    :catchall_6
    move-exception v6

    .line 234
    :try_start_d
    invoke-static {v2, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    throw v6
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 238
    :goto_5
    :try_start_e
    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 239
    :catchall_7
    move-exception v4

    .line 240
    :try_start_f
    invoke-static {v1, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 241
    .line 242
    .line 243
    throw v4

    .line 244
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 245
    .line 246
    const-string v2, "\u63d2\u4ef6\u914d\u7f6e\u76ee\u5f55\u4e0d\u53ef\u7528"

    .line 247
    .line 248
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 252
    :goto_6
    :try_start_10
    new-instance v2, Lsf/f;

    .line 253
    .line 254
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    move-object v1, v2

    .line 258
    :goto_7
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-eqz v1, :cond_9

    .line 263
    .line 264
    if-eqz p1, :cond_7

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    goto :goto_8

    .line 271
    :catchall_8
    move-exception p1

    .line 272
    goto :goto_9

    .line 273
    :cond_7
    const/4 p1, 0x0

    .line 274
    :goto_8
    if-nez p1, :cond_8

    .line 275
    .line 276
    const-string p1, ""

    .line 277
    .line 278
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    new-instance v4, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    const-string p1, " "

    .line 291
    .line 292
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-static {p1, v1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 303
    .line 304
    .line 305
    :cond_9
    monitor-exit v5

    .line 306
    return-object v3

    .line 307
    :goto_9
    monitor-exit v5

    .line 308
    throw p1

    .line 309
    :cond_a
    :goto_a
    return-object v3
.end method

.method public static synthetic m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleInputDialog$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic n(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Z)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleConfirmDialog$lambda$0$0(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Z)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final normalizeStringSet(Ljava/util/Set;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "*>;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ljava/util/Collection;

    .line 3
    .line 4
    if-eqz v0, :cond_7

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_4

    .line 13
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/4 v1, 0x0

    .line 42
    :goto_1
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_6

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    move-object v2, v1

    .line 68
    check-cast v2, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-lez v2, :cond_5

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    goto :goto_3

    .line 78
    :cond_5
    const/4 v2, 0x0

    .line 79
    :goto_3
    if-eqz v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-static {p1, v0}, Ltf/m;->N1(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_7
    :goto_4
    sget-object p1, Ltf/v;->g:Ltf/v;

    .line 95
    .line 96
    return-object p1
.end method

.method public static synthetic o(Lwb/p3;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->applyModuleFloatingGlassBar$lambda$1$1$0(Lwb/p3;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic p(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->unhookPlugin$lambda$0$0(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final putConfigValue(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string v0, "[Hchat:Script] \u5199\u5165\u63d2\u4ef6\u914d\u7f6e\u5931\u8d25: "

    .line 2
    .line 3
    const-string v1, "\u65e0\u6cd5\u521b\u5efa\u63d2\u4ef6\u914d\u7f6e\u9501\u76ee\u5f55: "

    .line 4
    .line 5
    const-string v2, "\u65e0\u6cd5\u521b\u5efa\u63d2\u4ef6\u914d\u7f6e\u76ee\u5f55: "

    .line 6
    .line 7
    if-eqz p2, :cond_a

    .line 8
    .line 9
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p2, v4

    .line 18
    :goto_0
    if-eqz p2, :cond_a

    .line 19
    .line 20
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->configFile(Ljava/io/File;)Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eqz v3, :cond_a

    .line 25
    .line 26
    iget-object v5, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->configLock:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v5

    .line 29
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    if-eqz v6, :cond_6

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-nez v7, :cond_2

    .line 40
    .line 41
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p2

    .line 74
    :catchall_0
    move-exception p2

    .line 75
    goto/16 :goto_7

    .line 76
    .line 77
    :cond_2
    :goto_1
    new-instance v2, Ljava/io/File;

    .line 78
    .line 79
    iget-object v7, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->hostContext:Landroid/content/Context;

    .line 80
    .line 81
    invoke-static {v7}, Lub/b;->d(Landroid/content/Context;)Ljava/io/File;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    const-string v8, "script_plugin_locks"

    .line 86
    .line 87
    invoke-direct {v2, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-nez v7, :cond_4

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_3

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    new-instance v2, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p2

    .line 129
    :cond_4
    :goto_2
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    new-instance v6, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v1, ".lock"

    .line 150
    .line 151
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    new-instance v6, Ljava/io/File;

    .line 159
    .line 160
    invoke-direct {v6, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 164
    .line 165
    const-string v2, "rw"

    .line 166
    .line 167
    invoke-direct {v1, v6, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    .line 169
    .line 170
    :try_start_1
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 171
    .line 172
    .line 173
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 174
    :try_start_2
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 175
    .line 176
    .line 177
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 178
    :try_start_3
    new-instance v7, Ljava/util/Properties;

    .line 179
    .line 180
    invoke-direct {v7}, Ljava/util/Properties;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    if-eqz v8, :cond_5

    .line 188
    .line 189
    sget-object v8, Log/a;->a:Ljava/nio/charset/Charset;

    .line 190
    .line 191
    new-instance v9, Ljava/io/InputStreamReader;

    .line 192
    .line 193
    new-instance v10, Ljava/io/FileInputStream;

    .line 194
    .line 195
    invoke-direct {v10, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 196
    .line 197
    .line 198
    invoke-direct {v9, v10, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 199
    .line 200
    .line 201
    :try_start_4
    invoke-virtual {v7, v9}, Ljava/util/Properties;->load(Ljava/io/Reader;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 202
    .line 203
    .line 204
    :try_start_5
    invoke-virtual {v9}, Ljava/io/InputStreamReader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :catchall_1
    move-exception p2

    .line 209
    goto :goto_4

    .line 210
    :catchall_2
    move-exception p2

    .line 211
    :try_start_6
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 212
    :catchall_3
    move-exception p3

    .line 213
    :try_start_7
    invoke-static {v9, p2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    throw p3

    .line 217
    :cond_5
    :goto_3
    invoke-virtual {v7, p2, p3}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    sget-object p2, Log/a;->a:Ljava/nio/charset/Charset;

    .line 221
    .line 222
    new-instance p3, Ljava/io/OutputStreamWriter;

    .line 223
    .line 224
    new-instance v8, Ljava/io/FileOutputStream;

    .line 225
    .line 226
    invoke-direct {v8, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 227
    .line 228
    .line 229
    invoke-direct {p3, v8, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 230
    .line 231
    .line 232
    :try_start_8
    const-string p2, "Hchat script plugin config"

    .line 233
    .line 234
    invoke-virtual {v7, p3, p2}, Ljava/util/Properties;->store(Ljava/io/Writer;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 235
    .line 236
    .line 237
    :try_start_9
    invoke-virtual {p3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 238
    .line 239
    .line 240
    :try_start_a
    invoke-virtual {v6}, Ljava/nio/channels/FileLock;->release()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 241
    .line 242
    .line 243
    :try_start_b
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 244
    .line 245
    .line 246
    :try_start_c
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 247
    .line 248
    .line 249
    sget-object p2, Lsf/n;->a:Lsf/n;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :catchall_4
    move-exception p2

    .line 253
    goto :goto_6

    .line 254
    :catchall_5
    move-exception p2

    .line 255
    goto :goto_5

    .line 256
    :catchall_6
    move-exception p2

    .line 257
    :try_start_d
    throw p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 258
    :catchall_7
    move-exception v3

    .line 259
    :try_start_e
    invoke-static {p3, p2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 260
    .line 261
    .line 262
    throw v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 263
    :goto_4
    :try_start_f
    invoke-virtual {v6}, Ljava/nio/channels/FileLock;->release()V

    .line 264
    .line 265
    .line 266
    throw p2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 267
    :goto_5
    :try_start_10
    throw p2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 268
    :catchall_8
    move-exception p3

    .line 269
    :try_start_11
    invoke-static {v2, p2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    throw p3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 273
    :goto_6
    :try_start_12
    throw p2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 274
    :catchall_9
    move-exception p3

    .line 275
    :try_start_13
    invoke-static {v1, p2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    throw p3

    .line 279
    :cond_6
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 280
    .line 281
    const-string p3, "\u63d2\u4ef6\u914d\u7f6e\u76ee\u5f55\u4e0d\u53ef\u7528"

    .line 282
    .line 283
    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw p2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 287
    :goto_7
    :try_start_14
    new-instance p3, Lsf/f;

    .line 288
    .line 289
    invoke-direct {p3, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 290
    .line 291
    .line 292
    move-object p2, p3

    .line 293
    :goto_8
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 294
    .line 295
    .line 296
    move-result-object p2

    .line 297
    if-eqz p2, :cond_9

    .line 298
    .line 299
    if-eqz p1, :cond_7

    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    goto :goto_9

    .line 306
    :catchall_a
    move-exception p1

    .line 307
    goto :goto_a

    .line 308
    :cond_7
    :goto_9
    if-nez v4, :cond_8

    .line 309
    .line 310
    const-string v4, ""

    .line 311
    .line 312
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    new-instance p3, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    const-string v0, " "

    .line 325
    .line 326
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    invoke-static {p1, p2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 337
    .line 338
    .line 339
    :cond_9
    monitor-exit v5

    .line 340
    return-void

    .line 341
    :goto_a
    monitor-exit v5

    .line 342
    throw p1

    .line 343
    :cond_a
    return-void
.end method

.method public static synthetic q(Ljava/util/concurrent/atomic/AtomicReference;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->applyModuleFloatingGlassBar$lambda$1$0(Ljava/util/concurrent/atomic/AtomicReference;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/lang/String;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic r(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Landroid/view/View;Ljava/util/Map;Ljava/lang/String;)Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->applyModuleFloatingGlassBar$lambda$1(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Landroid/view/View;Ljava/util/Map;Ljava/lang/String;)Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final receiverFor(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 1

    .line 15
    instance-of v0, p1, Ljava/lang/Class;

    if-nez v0, :cond_1

    invoke-static {p2}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final receiverFor(Ljava/lang/Object;Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/Class;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {p2}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p1

    .line 13
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 14
    return-object p1
.end method

.method private final rememberHook(Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook$Unhook;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    if-nez p2, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->pluginHooks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    move-object v1, p1

    .line 34
    :cond_3
    :goto_0
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 35
    .line 36
    invoke-virtual {v1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_4
    :goto_1
    return-void
.end method

.method public static synthetic s()Lsf/n;
    .locals 1

    .line 1
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleChoiceDialog$lambda$1$2()Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final showModuleChoiceDialog$lambda$1(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;
    .locals 5

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object p0, v0

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_1
    move-object v1, p3

    .line 13
    new-instance p3, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-direct {p3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    new-instance v3, Lsf/e;

    .line 39
    .line 40
    invoke-direct {v3, v2, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    new-instance p2, Leb/n;

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-direct {p2, p4, p5, v0}, Leb/n;-><init>(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;I)V

    .line 51
    .line 52
    .line 53
    new-instance p5, Lbi/c;

    .line 54
    .line 55
    const/16 p4, 0xe

    .line 56
    .line 57
    invoke-direct {p5, p4}, Lbi/c;-><init>(I)V

    .line 58
    .line 59
    .line 60
    sget-object p4, Lwb/lv;->g:Lwb/y2;

    .line 61
    .line 62
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Lwb/y2;->K1(Ljava/lang/String;)Lwb/lv;

    .line 66
    .line 67
    .line 68
    move-result-object p4

    .line 69
    move-object v4, p1

    .line 70
    move-object p1, p0

    .line 71
    move-object p0, p6

    .line 72
    move-object p6, p4

    .line 73
    move-object p4, p2

    .line 74
    move-object p2, v4

    .line 75
    invoke-static/range {p0 .. p6}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 76
    .line 77
    .line 78
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 79
    .line 80
    return-object p0
.end method

.method private static final showModuleChoiceDialog$lambda$1$1(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;I)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->dispatchDialogCallback(Ljava/util/function/Consumer;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 9
    .line 10
    return-object p0
.end method

.method private static final showModuleChoiceDialog$lambda$1$2()Lsf/n;
    .locals 1

    .line 1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final showModuleConfirmDialog$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;
    .locals 3

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object p0, v0

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_1
    move-object v0, p3

    .line 13
    new-instance p3, Leb/n;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-direct {p3, v0, p4, v1}, Leb/n;-><init>(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;I)V

    .line 17
    .line 18
    .line 19
    new-instance p4, Lbi/c;

    .line 20
    .line 21
    const/16 v0, 0x11

    .line 22
    .line 23
    invoke-direct {p4, v0}, Lbi/c;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lwb/lv;->g:Lwb/y2;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p2}, Lwb/y2;->K1(Ljava/lang/String;)Lwb/lv;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    move-object v2, p1

    .line 36
    move-object p1, p0

    .line 37
    move-object p0, p5

    .line 38
    move-object p5, p2

    .line 39
    move-object p2, v2

    .line 40
    invoke-static/range {p0 .. p5}, Lwb/y2;->S1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 41
    .line 42
    .line 43
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 44
    .line 45
    return-object p0
.end method

.method private static final showModuleConfirmDialog$lambda$0$0(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Z)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->dispatchDialogCallback(Ljava/util/function/Consumer;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 9
    .line 10
    return-object p0
.end method

.method private static final showModuleConfirmDialog$lambda$0$1()Lsf/n;
    .locals 1

    .line 1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final showModuleDialog$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)Lsf/n;
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object p0, v0

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_1
    new-instance v0, Lbi/c;

    .line 13
    .line 14
    const/16 v1, 0x10

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lbi/c;-><init>(I)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lwb/lv;->g:Lwb/y2;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {p2}, Lwb/y2;->K1(Ljava/lang/String;)Lwb/lv;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance v1, Lwb/su;

    .line 29
    .line 30
    invoke-direct {v1, p0, p2, p1}, Lwb/su;-><init>(Ljava/lang/String;Lwb/lv;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance p0, Ls0/d;

    .line 34
    .line 35
    const p1, -0x589de544

    .line 36
    .line 37
    .line 38
    const/4 p2, 0x1

    .line 39
    invoke-direct {p0, p1, v1, p2}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 40
    .line 41
    .line 42
    invoke-static {p3, v0, p0}, Lwb/y2;->P1(Landroid/app/Activity;Lfg/a;Ls0/d;)Lwb/kv;

    .line 43
    .line 44
    .line 45
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 46
    .line 47
    return-object p0
.end method

.method private static final showModuleDialog$lambda$0$0()Lsf/n;
    .locals 1

    .line 1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final showModuleInputDialog$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;
    .locals 11

    .line 1
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v2, p0

    .line 11
    :goto_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move-object v3, p1

    .line 16
    :goto_1
    if-nez p2, :cond_2

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    goto :goto_2

    .line 20
    :cond_2
    move-object v4, p2

    .line 21
    :goto_2
    if-nez p3, :cond_3

    .line 22
    .line 23
    move-object v5, v0

    .line 24
    goto :goto_3

    .line 25
    :cond_3
    move-object v5, p3

    .line 26
    :goto_3
    new-instance v8, Leb/n;

    .line 27
    .line 28
    const/4 p0, 0x3

    .line 29
    move-object/from16 p1, p5

    .line 30
    .line 31
    move-object/from16 p2, p6

    .line 32
    .line 33
    invoke-direct {v8, p1, p2, p0}, Leb/n;-><init>(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;I)V

    .line 34
    .line 35
    .line 36
    new-instance v9, Lbi/c;

    .line 37
    .line 38
    const/16 p0, 0x12

    .line 39
    .line 40
    invoke-direct {v9, p0}, Lbi/c;-><init>(I)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lwb/lv;->g:Lwb/y2;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {p4}, Lwb/y2;->K1(Ljava/lang/String;)Lwb/lv;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    const/16 v6, 0xfa0

    .line 53
    .line 54
    const/4 v7, 0x1

    .line 55
    move-object/from16 v1, p7

    .line 56
    .line 57
    invoke-static/range {v1 .. v10}, Lwb/y2;->b2(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 58
    .line 59
    .line 60
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 61
    .line 62
    return-object p0
.end method

.method private static final showModuleInputDialog$lambda$0$0(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->dispatchDialogCallback(Ljava/util/function/Consumer;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final showModuleInputDialog$lambda$0$1()Lsf/n;
    .locals 1

    .line 1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final showModuleMultiChoiceDialog$lambda$3(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Landroid/app/Activity;)Lsf/n;
    .locals 10

    .line 1
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v2, p0

    .line 11
    :goto_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move-object v3, p1

    .line 16
    :goto_1
    new-instance v4, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-direct {v4, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/String;

    .line 40
    .line 41
    new-instance p2, Lsf/e;

    .line 42
    .line 43
    invoke-direct {p2, p1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    new-instance v7, Leb/n;

    .line 51
    .line 52
    const/4 p0, 0x1

    .line 53
    move-object/from16 p1, p6

    .line 54
    .line 55
    invoke-direct {v7, p5, p1, p0}, Leb/n;-><init>(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, Lbi/c;

    .line 59
    .line 60
    const/16 p0, 0xf

    .line 61
    .line 62
    invoke-direct {v8, p0}, Lbi/c;-><init>(I)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lwb/lv;->g:Lwb/y2;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {p4}, Lwb/y2;->K1(Ljava/lang/String;)Lwb/lv;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    const/4 v6, 0x1

    .line 75
    move-object v5, p3

    .line 76
    move-object/from16 v1, p7

    .line 77
    .line 78
    invoke-static/range {v1 .. v9}, Lwb/y2;->Y1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;ZLfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 79
    .line 80
    .line 81
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 82
    .line 83
    return-object p0
.end method

.method private static final showModuleMultiChoiceDialog$lambda$3$1(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;Ljava/util/Set;)Lsf/n;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->dispatchDialogCallback(Ljava/util/function/Consumer;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final showModuleMultiChoiceDialog$lambda$3$2()Lsf/n;
    .locals 1

    .line 1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2
    .line 3
    return-object v0
.end method

.method private final showOnMain(Lfg/l;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    new-instance v1, Lac/l;

    .line 27
    .line 28
    const/16 v2, 0xc

    .line 29
    .line 30
    invoke-direct {v1, v0, p0, p1, v2}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {p1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1}, Lac/l;->run()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    const/4 p1, 0x1

    .line 55
    return p1

    .line 56
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 57
    return p1
.end method

.method private static final showOnMain$lambda$0(Landroid/app/Activity;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lfg/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :try_start_0
    invoke-interface {p2, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    new-instance p1, Lsf/f;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object p0, p1

    .line 27
    :goto_0
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string p2, "[Hchat:Script] \u663e\u793a\u6a21\u5757\u5f39\u7a97\u5931\u8d25: "

    .line 38
    .line 39
    invoke-static {p2, p1, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_1
    return-void
.end method

.method public static synthetic t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleDialog$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final targetClass(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    instance-of v0, p1, Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Class;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public static synthetic u()Lsf/n;
    .locals 1

    .line 1
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleMultiChoiceDialog$lambda$3$2()Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final unhookPlugin$lambda$0$0(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;

    .line 16
    .line 17
    invoke-virtual {v0}, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;->restore()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    return-object p0
.end method

.method private final withConfigFileLock(Ljava/io/File;Lfg/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/File;",
            "Lfg/a;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string p2, "\u65e0\u6cd5\u521b\u5efa\u63d2\u4ef6\u914d\u7f6e\u76ee\u5f55: "

    .line 25
    .line 26
    invoke-static {p1, p2}, Lg1/d;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    const/4 p1, 0x0

    .line 30
    return-object p1

    .line 31
    :cond_1
    :goto_1
    new-instance v0, Ljava/io/File;

    .line 32
    .line 33
    iget-object v1, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->hostContext:Landroid/content/Context;

    .line 34
    .line 35
    invoke-static {v1}, Lub/b;->d(Landroid/content/Context;)Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "script_plugin_locks"

    .line 40
    .line 41
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string p2, "\u65e0\u6cd5\u521b\u5efa\u63d2\u4ef6\u914d\u7f6e\u9501\u76ee\u5f55: "

    .line 62
    .line 63
    invoke-static {p1, p2}, Lg1/d;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    :goto_2
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string v1, ".lock"

    .line 80
    .line 81
    invoke-static {p1, v1}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v1, Ljava/io/File;

    .line 86
    .line 87
    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    new-instance p1, Ljava/io/RandomAccessFile;

    .line 91
    .line 92
    const-string v0, "rw"

    .line 93
    .line 94
    invoke-direct {p1, v1, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :try_start_0
    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 98
    .line 99
    .line 100
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    :try_start_1
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 102
    .line 103
    .line 104
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    :try_start_2
    invoke-interface {p2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 109
    :try_start_3
    invoke-virtual {v1}, Ljava/nio/channels/FileLock;->release()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 110
    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    :try_start_4
    invoke-static {v0, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 114
    .line 115
    .line 116
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 117
    .line 118
    .line 119
    return-object p2

    .line 120
    :catchall_0
    move-exception p2

    .line 121
    goto :goto_4

    .line 122
    :catchall_1
    move-exception p2

    .line 123
    goto :goto_3

    .line 124
    :catchall_2
    move-exception p2

    .line 125
    :try_start_5
    invoke-virtual {v1}, Ljava/nio/channels/FileLock;->release()V

    .line 126
    .line 127
    .line 128
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 129
    :goto_3
    :try_start_6
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 130
    :catchall_3
    move-exception v1

    .line 131
    :try_start_7
    invoke-static {v0, p2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 135
    :goto_4
    :try_start_8
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 136
    :catchall_4
    move-exception v0

    .line 137
    invoke-static {p1, p2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_4
    const-string p1, "\u63d2\u4ef6\u914d\u7f6e\u76ee\u5f55\u4e0d\u53ef\u7528"

    .line 142
    .line 143
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_0
.end method


# virtual methods
.method public final applyModuleFloatingGlassBar(Ljava/lang/String;Landroid/view/View;)Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;
    .locals 1

    const/4 v0, 0x0

    .line 35
    invoke-virtual {p0, p1, p2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->applyModuleFloatingGlassBar(Ljava/lang/String;Landroid/view/View;Ljava/util/Map;)Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;

    move-result-object p1

    return-object p1
.end method

.method public final applyModuleFloatingGlassBar(Ljava/lang/String;Landroid/view/View;Ljava/util/Map;)Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "**>;)",
            "Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    move-object v4, p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v4, v0

    .line 13
    :goto_0
    if-eqz v4, :cond_1

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    new-instance v2, Lc9/n0;

    .line 18
    .line 19
    const/4 v7, 0x2

    .line 20
    move-object v3, p0

    .line 21
    move-object v5, p2

    .line 22
    move-object v6, p3

    .line 23
    invoke-direct/range {v2 .. v7}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->callOnMainForResult(Lfg/a;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lh/Hchat/hooks/items/script/ScriptFloatingGlassBarHandle;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    move-object v3, p0

    .line 34
    return-object v0
.end method

.method public final createInstance(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 85
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, p1, p2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->createInstance(Ljava/lang/Object;I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final createInstance(Ljava/lang/Object;I[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->targetClass(Ljava/lang/Object;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-array p3, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    :goto_0
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v3, v2

    .line 33
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    array-length v4, v4

    .line 40
    if-ne v4, p2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v3, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->areAssignable([Ljava/lang/Class;[Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move v3, v1

    .line 58
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object v2, v0

    .line 70
    :goto_2
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 71
    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    array-length p1, p3

    .line 75
    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :cond_4
    return-object v0
.end method

.method public final file(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/File;

    .line 5
    .line 6
    iget-object v1, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->scriptDir:Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final findClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->classLoader:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-object p1
.end method

.method public final firstConstructor(Ljava/lang/Object;I)Ljava/lang/reflect/Constructor;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->targetClass(Ljava/lang/Object;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    array-length v2, v2

    .line 34
    if-ne v2, p2, :cond_1

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v2, 0x0

    .line 39
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    move-object v0, v1

    .line 50
    :cond_2
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 51
    .line 52
    :cond_3
    return-object v0
.end method

.method public final firstField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->targetClass(Ljava/lang/Object;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1, p2}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public final firstMethod(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 1

    const/4 v0, -0x1

    .line 91
    invoke-virtual {p0, p1, p2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->firstMethod(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method

.method public final firstMethod(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_6

    .line 3
    .line 4
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_3

    .line 11
    :cond_0
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->targetClass(Ljava/lang/Object;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    if-eqz p1, :cond_6

    .line 16
    .line 17
    const-class v1, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_6

    .line 24
    .line 25
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    move-object v3, v2

    .line 44
    check-cast v3, Ljava/lang/reflect/Method;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v4, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_3

    .line 55
    .line 56
    if-ltz p3, :cond_2

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    array-length v3, v3

    .line 63
    if-ne v3, p3, :cond_3

    .line 64
    .line 65
    :cond_2
    const/4 v3, 0x1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const/4 v3, 0x0

    .line 68
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move-object v2, v0

    .line 80
    :goto_2
    check-cast v2, Ljava/lang/reflect/Method;

    .line 81
    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    goto :goto_0

    .line 90
    :cond_6
    :goto_3
    return-object v0
.end method

.method public final getApis()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lh/Hchat/hooks/api/core/WeChatApis;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->apis:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBoolean(Ljava/io/File;Ljava/lang/String;Z)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getString(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 7
    .line 8
    invoke-static {p2, p1, p2}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    sparse-switch p2, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :sswitch_0
    const-string p2, "false"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :sswitch_1
    const-string p2, "true"

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :sswitch_2
    const-string p2, "yes"

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :sswitch_3
    const-string p2, "off"

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :sswitch_4
    const-string p2, "on"

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :sswitch_5
    const-string p2, "no"

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :sswitch_6
    const-string p2, "y"

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_0

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :sswitch_7
    const-string p2, "n"

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :sswitch_8
    const-string p2, "1"

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_0

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    const/4 p1, 0x1

    .line 102
    return p1

    .line 103
    :sswitch_9
    const-string p2, "0"

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_1

    .line 110
    .line 111
    :goto_0
    return p3

    .line 112
    :cond_1
    const/4 p1, 0x0

    .line 113
    return p1

    .line 114
    nop

    .line 115
    :sswitch_data_0
    .sparse-switch
        0x30 -> :sswitch_9
        0x31 -> :sswitch_8
        0x6e -> :sswitch_7
        0x79 -> :sswitch_6
        0xdc1 -> :sswitch_5
        0xddf -> :sswitch_4
        0x1ad6f -> :sswitch_3
        0x1d2e7 -> :sswitch_2
        0x36758e -> :sswitch_1
        0x5cb1923 -> :sswitch_0
    .end sparse-switch
.end method

.method public final getClassLoader()Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->classLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDexKit()Lh/Hchat/hooks/items/script/ScriptDexKitBridge;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->dexKit:Lh/Hchat/hooks/items/script/ScriptDexKitBridge;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->firstField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->receiverFor(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method

.method public final getFloat(Ljava/io/File;Ljava/lang/String;F)F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getString(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-static {p1}, Log/s;->T(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    :catch_0
    :cond_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :cond_1
    return p3
.end method

.method public final getHostContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->hostContext:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInt(Ljava/io/File;Ljava/lang/String;I)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getString(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-static {p1}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    return p3
.end method

.method public final getLong(Ljava/io/File;Ljava/lang/String;J)J
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getString(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-static {p1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    return-wide p1

    .line 17
    :cond_0
    return-wide p3
.end method

.method public final getScriptDir()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->scriptDir:Ljava/io/File;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getString(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    xor-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p2, 0x0

    .line 23
    :goto_0
    if-eqz p2, :cond_3

    .line 24
    .line 25
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->loadPluginConfig(Ljava/io/File;)Ljava/util/Properties;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, p2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    if-nez p3, :cond_2

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    return-object p3

    .line 40
    :cond_3
    if-nez p3, :cond_4

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_4
    return-object p3
.end method

.method public final getStringSet(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "*>;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getString(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-lez p2, :cond_0

    .line 13
    .line 14
    move p2, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p2, v1

    .line 17
    :goto_0
    if-eqz p2, :cond_1

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    :cond_1
    if-eqz v0, :cond_5

    .line 21
    .line 22
    new-array p1, v2, [C

    .line 23
    .line 24
    const/16 p2, 0xa

    .line 25
    .line 26
    aput-char p2, p1, v1

    .line 27
    .line 28
    const/4 p2, 0x6

    .line 29
    invoke-static {v0, p1, p2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance p2, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    if-eqz p3, :cond_4

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    move-object v0, p3

    .line 53
    check-cast v0, Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-lez v0, :cond_3

    .line 60
    .line 61
    move v0, v2

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move v0, v1

    .line 64
    :goto_2
    if-eqz v0, :cond_2

    .line 65
    .line 66
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-static {p2, p1}, Ltf/m;->N1(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 76
    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_5
    invoke-direct {p0, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->normalizeStringSet(Ljava/util/Set;)Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1
.end method

.method public final hookAfter(Ljava/lang/String;Ljava/lang/reflect/Member;Ljava/util/function/Consumer;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Member;",
            "Ljava/util/function/Consumer<",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            ">;)",
            "Lde/robv/android/xposed/XC_MethodHook$Unhook;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 8
    .line 9
    new-instance v1, Leb/r;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p3, v2}, Leb/r;-><init>(Ljava/util/function/Consumer;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p2, v1}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->rememberHook(Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    .line 20
    .line 21
    .line 22
    return-object p2
.end method

.method public final hookAfter(Ljava/lang/reflect/Member;Ljava/util/function/Consumer;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Member;",
            "Ljava/util/function/Consumer<",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            ">;)",
            "Lde/robv/android/xposed/XC_MethodHook$Unhook;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, v0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->hookAfter(Ljava/lang/String;Ljava/lang/reflect/Member;Ljava/util/function/Consumer;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p1

    return-object p1
.end method

.method public final hookBefore(Ljava/lang/String;Ljava/lang/reflect/Member;Ljava/util/function/Consumer;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Member;",
            "Ljava/util/function/Consumer<",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            ">;)",
            "Lde/robv/android/xposed/XC_MethodHook$Unhook;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 8
    .line 9
    new-instance v1, Leb/r;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, p3, v2}, Leb/r;-><init>(Ljava/util/function/Consumer;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p2, v1}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->rememberHook(Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    .line 20
    .line 21
    .line 22
    return-object p2
.end method

.method public final hookBefore(Ljava/lang/reflect/Member;Ljava/util/function/Consumer;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Member;",
            "Ljava/util/function/Consumer<",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            ">;)",
            "Lde/robv/android/xposed/XC_MethodHook$Unhook;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, v0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->hookBefore(Ljava/lang/String;Ljava/lang/reflect/Member;Ljava/util/function/Consumer;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p1

    return-object p1
.end method

.method public final hookReplace(Ljava/lang/String;Ljava/lang/reflect/Member;Ljava/util/function/Function;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Member;",
            "Ljava/util/function/Function<",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            "Ljava/lang/Object;",
            ">;)",
            "Lde/robv/android/xposed/XC_MethodHook$Unhook;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 8
    .line 9
    new-instance v1, Lb9/e;

    .line 10
    .line 11
    const/16 v2, 0x8

    .line 12
    .line 13
    invoke-direct {v1, p3, v2}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2, v1}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->rememberHook(Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    .line 21
    .line 22
    .line 23
    return-object p2
.end method

.method public final hookReplace(Ljava/lang/reflect/Member;Ljava/util/function/Function;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Member;",
            "Ljava/util/function/Function<",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            "Ljava/lang/Object;",
            ">;)",
            "Lde/robv/android/xposed/XC_MethodHook$Unhook;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, v0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->hookReplace(Ljava/lang/String;Ljava/lang/reflect/Member;Ljava/util/function/Function;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p1

    return-object p1
.end method

.method public final invokeMethod(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    .line 32
    new-array v1, v0, [Ljava/lang/Object;

    invoke-virtual {p0, p1, p2, v0, v1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeMethod(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 31
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, p1, p2, p3, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeMethod(Ljava/lang/Object;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 p4, 0x0

    .line 5
    new-array p4, p4, [Ljava/lang/Object;

    .line 6
    .line 7
    :goto_0
    invoke-direct {p0, p1, p2, p3, p4}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->compatibleMethod(Ljava/lang/Object;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->receiverFor(Ljava/lang/Object;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    array-length p3, p4

    .line 18
    invoke-static {p4, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-static {p2, p1, p3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return-object p1
.end method

.method public final invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 29
    new-array p3, p3, [Ljava/lang/Object;

    .line 30
    :goto_0
    array-length v0, p3

    invoke-virtual {p0, p1, p2, v0, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final log(Ljava/lang/Object;)V
    .locals 2

    if-eqz p1, :cond_0

    goto :goto_0

    .line 141
    :cond_0
    const-string p1, "null"

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[Hchat:Script] "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    return-void
.end method

.method public final log(Ljava/lang/String;Ljava/io/File;Ljava/lang/Object;)V
    .locals 6

    .line 1
    const-string v0, "["

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p3, "null"

    .line 13
    .line 14
    :goto_0
    const-string v1, ""

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    move-object v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v2, p1

    .line 21
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v4, "[Hchat:Script] ["

    .line 24
    .line 25
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "] "

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v3}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    if-eqz p2, :cond_4

    .line 47
    .line 48
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catchall_0
    move-exception p2

    .line 59
    goto :goto_3

    .line 60
    :cond_2
    :goto_2
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 61
    .line 62
    const-string v4, "yyyy-MM-dd HH:mm:ss.SSS"

    .line 63
    .line 64
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 65
    .line 66
    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 67
    .line 68
    .line 69
    new-instance v4, Ljava/util/Date;

    .line 70
    .line 71
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    new-instance v4, Ljava/io/File;

    .line 79
    .line 80
    const-string v5, "log.txt"

    .line 81
    .line 82
    invoke-direct {v4, p2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance p2, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string p3, "\n"

    .line 100
    .line 101
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-static {v4, p2}, Ldg/l;->Z(Ljava/io/File;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    sget-object p2, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :goto_3
    new-instance p3, Lsf/f;

    .line 115
    .line 116
    invoke-direct {p3, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    move-object p2, p3

    .line 120
    :goto_4
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    if-eqz p2, :cond_4

    .line 125
    .line 126
    if-nez p1, :cond_3

    .line 127
    .line 128
    move-object p1, v1

    .line 129
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    const-string v0, "[Hchat:Script] \u5199\u5165\u63d2\u4ef6\u65e5\u5fd7\u5931\u8d25: "

    .line 134
    .line 135
    const-string v1, " "

    .line 136
    .line 137
    invoke-static {v0, p1, v1, p3, p2}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    :cond_4
    return-void
.end method

.method public final prefs(Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->hostContext:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final putBoolean(Ljava/io/File;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->putConfigValue(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final putFloat(Ljava/io/File;Ljava/lang/String;F)V
    .locals 0

    .line 1
    invoke-static {p3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->putConfigValue(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final putInt(Ljava/io/File;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->putConfigValue(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final putLong(Ljava/io/File;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->putConfigValue(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final putString(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const-string p3, ""

    .line 4
    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->putConfigValue(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final putStringSet(Ljava/io/File;Ljava/lang/String;Ljava/util/Set;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->normalizeStringSet(Ljava/util/Set;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ljava/lang/Iterable;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/16 v5, 0x3e

    .line 10
    .line 11
    const-string v1, "\n"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->putConfigValue(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->firstField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->receiverFor(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2, p1, p3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final showModuleChoiceDialog(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/function/Consumer;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/Integer;",
            ">;)Z"
        }
    .end annotation

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    sget-object p3, Ltf/t;->g:Ltf/t;

    .line 4
    .line 5
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {p3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    :goto_1
    if-nez v0, :cond_2

    .line 37
    .line 38
    const-string v0, ""

    .line 39
    .line 40
    :cond_2
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    if-eqz p3, :cond_4

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    return p1

    .line 52
    :cond_4
    new-instance v0, Leb/p;

    .line 53
    .line 54
    move-object v5, p0

    .line 55
    move-object v1, p1

    .line 56
    move-object v2, p2

    .line 57
    move-object v4, p4

    .line 58
    move-object v6, p5

    .line 59
    invoke-direct/range {v0 .. v6}, Leb/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showOnMain(Lfg/l;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1
.end method

.method public final showModuleChoiceDialog(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/function/Consumer;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "*>;",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/Integer;",
            ">;)Z"
        }
    .end annotation

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 67
    invoke-virtual/range {v0 .. v5}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleChoiceDialog(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final showModuleConfirmDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 1
    new-instance v0, Leb/o;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v4, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-object v5, p4

    .line 9
    invoke-direct/range {v0 .. v6}, Leb/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showOnMain(Lfg/l;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public final showModuleConfirmDialog(Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, p1, p2, v0, p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleConfirmDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final showModuleDialog(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, p1, p2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final showModuleDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Leb/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1, p2, p3}, Leb/l;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showOnMain(Lfg/l;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final showModuleInputDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    new-instance v0, Leb/m;

    .line 2
    .line 3
    const/4 v8, 0x0

    .line 4
    move-object v6, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    move-object v7, p6

    .line 11
    invoke-direct/range {v0 .. v8}, Leb/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showOnMain(Lfg/l;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public final showModuleInputDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    .line 19
    invoke-virtual/range {v0 .. v6}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleInputDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final showModuleMultiChoiceDialog(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Ljava/util/function/Consumer;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "*>;",
            "Ljava/util/Set<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;>;)Z"
        }
    .end annotation

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    sget-object p3, Ltf/t;->g:Ltf/t;

    .line 4
    .line 5
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {p3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :cond_1
    if-nez v1, :cond_2

    .line 36
    .line 37
    const-string v1, ""

    .line 38
    .line 39
    :cond_2
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    const/4 v0, 0x0

    .line 48
    if-eqz p3, :cond_4

    .line 49
    .line 50
    return v0

    .line 51
    :cond_4
    if-nez p4, :cond_5

    .line 52
    .line 53
    sget-object p4, Ltf/v;->g:Ltf/v;

    .line 54
    .line 55
    :cond_5
    check-cast p4, Ljava/lang/Iterable;

    .line 56
    .line 57
    new-instance p3, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    :cond_6
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_9

    .line 71
    .line 72
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    instance-of v4, v2, Ljava/lang/Number;

    .line 77
    .line 78
    if-eqz v4, :cond_7

    .line 79
    .line 80
    check-cast v2, Ljava/lang/Number;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_7
    move-object v2, v1

    .line 84
    :goto_2
    if-eqz v2, :cond_8

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    goto :goto_3

    .line 95
    :cond_8
    move-object v2, v1

    .line 96
    :goto_3
    if-eqz v2, :cond_6

    .line 97
    .line 98
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_9
    new-instance p4, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    :cond_a
    :goto_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_c

    .line 116
    .line 117
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    move-object v2, v1

    .line 122
    check-cast v2, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-ltz v2, :cond_b

    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-ge v2, v4, :cond_b

    .line 135
    .line 136
    const/4 v2, 0x1

    .line 137
    goto :goto_5

    .line 138
    :cond_b
    move v2, v0

    .line 139
    :goto_5
    if-eqz v2, :cond_a

    .line 140
    .line 141
    invoke-virtual {p4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_c
    invoke-static {p4}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    new-instance v0, Leb/m;

    .line 150
    .line 151
    move-object v6, p0

    .line 152
    move-object v1, p1

    .line 153
    move-object v2, p2

    .line 154
    move-object v5, p5

    .line 155
    move-object v7, p6

    .line 156
    invoke-direct/range {v0 .. v7}, Leb/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;Ljava/lang/String;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/util/function/Consumer;)V

    .line 157
    .line 158
    .line 159
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showOnMain(Lfg/l;)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    return p1
.end method

.method public final showModuleMultiChoiceDialog(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/function/Consumer;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "*>;",
            "Ljava/util/Set<",
            "*>;",
            "Ljava/util/function/Consumer<",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;>;)Z"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    .line 164
    invoke-virtual/range {v0 .. v6}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->showModuleMultiChoiceDialog(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final toast(Ljava/lang/Object;)V
    .locals 4

    .line 80
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->interaction()Li8/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->n()Lq8/r;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "null"

    .line 83
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 84
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, La1/d;

    const/16 v3, 0x1b

    invoke-direct {v2, v0, v3, p1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public final toast(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p1, v0

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    const-string v0, "["

    .line 15
    .line 16
    const-string v1, "] "

    .line 17
    .line 18
    invoke-static {v0, p1, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, ""

    .line 25
    .line 26
    :cond_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->interaction()Li8/b;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->n()Lq8/r;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_4

    .line 38
    .line 39
    if-eqz p2, :cond_3

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const-string p2, "null"

    .line 49
    .line 50
    :goto_1
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    new-instance v0, Landroid/os/Handler;

    .line 61
    .line 62
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, La1/d;

    .line 70
    .line 71
    const/16 v2, 0x1b

    .line 72
    .line 73
    invoke-direct {v1, p1, v2, p2}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 77
    .line 78
    .line 79
    :cond_4
    return-void
.end method

.method public final unhook(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 22
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    :cond_0
    return-void
.end method

.method public final unhook(Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook$Unhook;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->pluginHooks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->unhook(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final unhook(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 23
    instance-of v0, p2, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    if-eqz v0, :cond_0

    check-cast p2, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->unhook(Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    return-void
.end method

.method public final unhookPlugin(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->pluginFloatingBars:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance v1, Lab/a;

    .line 21
    .line 22
    const/16 v2, 0xf

    .line 23
    .line 24
    invoke-direct {v1, v0, v2}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->callOnMainForResult(Lfg/a;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Boolean;

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->pluginHooks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/util/List;

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 44
    .line 45
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :catchall_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 60
    .line 61
    :try_start_0
    invoke-virtual {v0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    :goto_1
    return-void
.end method
