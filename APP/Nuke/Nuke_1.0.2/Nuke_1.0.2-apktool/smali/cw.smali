.class public abstract Lcw;
.super Landroid/app/Activity;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lia1;


# instance fields
.field private final extraDataMap:Luq2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Luq2;"
        }
    .end annotation
.end field

.field private final lifecycleRegistry:Lla1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Luq2;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Luq2;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcw;->extraDataMap:Luq2;

    .line 11
    .line 12
    new-instance v0, Lla1;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, Lla1;-><init>(Lia1;Z)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcw;->lifecycleRegistry:Lla1;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p1}, Lpp0;->p(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    .line 25
    const/16 v2, 0x1c

    .line 26
    .line 27
    if-lt v0, v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcw;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->onUserInteraction()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/16 v3, 0x8

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Landroid/view/Window;->hasFeature(I)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/4 v4, 0x0

    .line 48
    if-eqz v3, :cond_5

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    const/16 v6, 0x52

    .line 59
    .line 60
    if-ne v5, v6, :cond_5

    .line 61
    .line 62
    if-eqz v3, :cond_5

    .line 63
    .line 64
    sget-boolean v5, Lpp0;->l:Z

    .line 65
    .line 66
    if-nez v5, :cond_2

    .line 67
    .line 68
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    const-string v6, "onMenuKeyEvent"

    .line 73
    .line 74
    const-class v7, Landroid/view/KeyEvent;

    .line 75
    .line 76
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    sput-object v5, Lpp0;->m:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    :catch_0
    sput-boolean v1, Lpp0;->l:Z

    .line 87
    .line 88
    :cond_2
    sget-object v5, Lpp0;->m:Ljava/lang/reflect/Method;

    .line 89
    .line 90
    if-eqz v5, :cond_3

    .line 91
    .line 92
    :try_start_1
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v5, v3, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-nez v3, :cond_4

    .line 101
    .line 102
    :catch_1
    :cond_3
    move v3, v4

    .line 103
    goto :goto_0

    .line 104
    :cond_4
    check-cast v3, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result v3
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 110
    :goto_0
    if-eqz v3, :cond_5

    .line 111
    .line 112
    goto/16 :goto_8

    .line 113
    .line 114
    :cond_5
    invoke-virtual {v0, p1}, Landroid/view/Window;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_6

    .line 119
    .line 120
    goto/16 :goto_8

    .line 121
    .line 122
    :cond_6
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sget v3, Lwa3;->a:I

    .line 127
    .line 128
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 129
    .line 130
    const/4 v5, 0x0

    .line 131
    if-lt v3, v2, :cond_7

    .line 132
    .line 133
    goto/16 :goto_7

    .line 134
    .line 135
    :cond_7
    sget-object v2, Lva3;->d:Ljava/util/ArrayList;

    .line 136
    .line 137
    const v2, 0x7908006f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Lva3;

    .line 145
    .line 146
    if-nez v3, :cond_8

    .line 147
    .line 148
    new-instance v3, Lva3;

    .line 149
    .line 150
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-object v5, v3, Lva3;->a:Ljava/util/WeakHashMap;

    .line 154
    .line 155
    iput-object v5, v3, Lva3;->b:Landroid/util/SparseArray;

    .line 156
    .line 157
    iput-object v5, v3, Lva3;->c:Ljava/lang/ref/WeakReference;

    .line 158
    .line 159
    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-nez v2, :cond_f

    .line 167
    .line 168
    iget-object v2, v3, Lva3;->a:Ljava/util/WeakHashMap;

    .line 169
    .line 170
    if-eqz v2, :cond_9

    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/util/WeakHashMap;->clear()V

    .line 173
    .line 174
    .line 175
    :cond_9
    sget-object v2, Lva3;->d:Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-eqz v6, :cond_a

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_a
    monitor-enter v2

    .line 185
    :try_start_2
    iget-object v6, v3, Lva3;->a:Ljava/util/WeakHashMap;

    .line 186
    .line 187
    if-nez v6, :cond_b

    .line 188
    .line 189
    new-instance v6, Ljava/util/WeakHashMap;

    .line 190
    .line 191
    invoke-direct {v6}, Ljava/util/WeakHashMap;-><init>()V

    .line 192
    .line 193
    .line 194
    iput-object v6, v3, Lva3;->a:Ljava/util/WeakHashMap;

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :catchall_0
    move-exception p0

    .line 198
    goto :goto_5

    .line 199
    :cond_b
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    sub-int/2addr v6, v1

    .line 204
    :goto_2
    if-ltz v6, :cond_e

    .line 205
    .line 206
    sget-object v7, Lva3;->d:Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    check-cast v8, Ljava/lang/ref/WeakReference;

    .line 213
    .line 214
    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    check-cast v8, Landroid/view/View;

    .line 219
    .line 220
    if-nez v8, :cond_c

    .line 221
    .line 222
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_c
    iget-object v7, v3, Lva3;->a:Ljava/util/WeakHashMap;

    .line 227
    .line 228
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 229
    .line 230
    invoke-virtual {v7, v8, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    :goto_3
    instance-of v8, v7, Landroid/view/View;

    .line 238
    .line 239
    if-eqz v8, :cond_d

    .line 240
    .line 241
    iget-object v8, v3, Lva3;->a:Ljava/util/WeakHashMap;

    .line 242
    .line 243
    move-object v9, v7

    .line 244
    check-cast v9, Landroid/view/View;

    .line 245
    .line 246
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-virtual {v8, v9, v10}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    invoke-interface {v7}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    goto :goto_3

    .line 256
    :cond_d
    :goto_4
    add-int/lit8 v6, v6, -0x1

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_e
    monitor-exit v2

    .line 260
    goto :goto_6

    .line 261
    :goto_5
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 262
    throw p0

    .line 263
    :cond_f
    :goto_6
    invoke-virtual {v3, v0}, Lva3;->a(Landroid/view/View;)Landroid/view/View;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-nez v6, :cond_11

    .line 272
    .line 273
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    if-eqz v2, :cond_11

    .line 278
    .line 279
    invoke-static {v6}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    if-nez v7, :cond_11

    .line 284
    .line 285
    iget-object v7, v3, Lva3;->b:Landroid/util/SparseArray;

    .line 286
    .line 287
    if-nez v7, :cond_10

    .line 288
    .line 289
    new-instance v7, Landroid/util/SparseArray;

    .line 290
    .line 291
    invoke-direct {v7}, Landroid/util/SparseArray;-><init>()V

    .line 292
    .line 293
    .line 294
    iput-object v7, v3, Lva3;->b:Landroid/util/SparseArray;

    .line 295
    .line 296
    :cond_10
    iget-object v3, v3, Lva3;->b:Landroid/util/SparseArray;

    .line 297
    .line 298
    new-instance v7, Ljava/lang/ref/WeakReference;

    .line 299
    .line 300
    invoke-direct {v7, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v3, v6, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    :cond_11
    if-eqz v2, :cond_12

    .line 307
    .line 308
    move v4, v1

    .line 309
    :cond_12
    :goto_7
    if-eqz v4, :cond_13

    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_13
    if-eqz v0, :cond_14

    .line 313
    .line 314
    invoke-virtual {v0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    :cond_14
    invoke-virtual {p1, p0, v5, p0}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    :goto_8
    return v1
.end method

.method public dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p1}, Lpp0;->p(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public getExtraData(Ljava/lang/Class;)Lxv;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lxv;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lj70;
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcw;->extraDataMap:Luq2;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Luq2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p1, 0x0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {}, Lc80;->g()V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public getLifecycle()Lba1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcw;->lifecycleRegistry:Lla1;

    .line 2
    .line 3
    return-object p0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget p1, Lj82;->h:I

    .line 5
    .line 6
    invoke-static {p0}, Lh82;->b(Lcw;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcw;->lifecycleRegistry:Lla1;

    .line 5
    .line 6
    const-string v1, "setCurrentState"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lla1;->d(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Laa1;->j:Laa1;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lla1;->f(Laa1;)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public putExtraData(Lxv;)V
    .locals 0
    .annotation runtime Lj70;
    .end annotation

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final shouldDumpInternalState([Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 p0, 0x1

    .line 2
    const/4 v0, 0x0

    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    aget-object p1, p1, v0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sparse-switch v1, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :sswitch_0
    const-string v1, "--autofill"

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move v0, p0

    .line 29
    goto :goto_1

    .line 30
    :sswitch_1
    const-string v1, "--contentcapture"

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v1, 0x1d

    .line 42
    .line 43
    if-lt p1, v1, :cond_5

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :sswitch_2
    const-string v1, "--list-dumpables"

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :sswitch_3
    const-string v1, "--dump-dumpable"

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    .line 66
    const/16 v1, 0x21

    .line 67
    .line 68
    if-lt p1, v1, :cond_5

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :sswitch_4
    const-string v1, "--translation"

    .line 72
    .line 73
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-nez p1, :cond_4

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    const/16 v1, 0x1f

    .line 83
    .line 84
    if-lt p1, v1, :cond_5

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    :goto_1
    xor-int/2addr p0, v0

    .line 88
    return p0

    .line 89
    :sswitch_data_0
    .sparse-switch
        -0x2673d6ef -> :sswitch_4
        0x5fd0f67 -> :sswitch_3
        0x1c2b8816 -> :sswitch_2
        0x4519f64d -> :sswitch_1
        0x56b9c952 -> :sswitch_0
    .end sparse-switch
.end method

.method public superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method
