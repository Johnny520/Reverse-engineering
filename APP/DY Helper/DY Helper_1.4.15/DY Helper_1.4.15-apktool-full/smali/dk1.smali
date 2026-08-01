.class public final Ldk1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ldk1;

.field public static volatile β:Z

.field public static volatile γ:Ljava/lang/ClassLoader;

.field public static final δ:Ljava/util/Set;

.field public static final ε:Ljava/util/Set;

.field public static final ζ:Ljava/lang/ThreadLocal;

.field public static η:Ljava/lang/reflect/Field;

.field public static θ:Ljava/lang/reflect/Field;

.field public static ι:Z

.field public static final κ:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldk1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldk1;->α:Ldk1;

    .line 7
    .line 8
    new-instance v0, Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sput-object v0, Ldk1;->δ:Ljava/util/Set;

    .line 21
    .line 22
    const-string v0, "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C71358804495460988BC309E79107C904005381417879B5B03919102E2F4DDA294DD2ECA50F1F6BB81A3482872"

    .line 23
    .line 24
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    filled-new-array {v0}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-static {v2}, Lex0;->Κ(I)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lg7;->л([Ljava/lang/Object;Ljava/util/LinkedHashSet;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sput-object v0, Ldk1;->ε:Ljava/util/Set;

    .line 53
    .line 54
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 57
    .line 58
    .line 59
    sput-object v0, Ldk1;->ζ:Ljava/lang/ThreadLocal;

    .line 60
    .line 61
    new-instance v0, Landroid/os/Handler;

    .line 62
    .line 63
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 68
    .line 69
    .line 70
    sput-object v0, Ldk1;->κ:Landroid/os/Handler;

    .line 71
    .line 72
    return-void
.end method

.method public static final α(Landroid/view/View;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Ldk1;->ζ:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    new-instance v1, Lhy0;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1, v0}, Lhy0;-><init>(Landroid/view/View;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Ldk1;->κ:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    invoke-static {p0, p1, v0}, Ldk1;->γ(Landroid/view/View;Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static β(Landroid/app/Activity;)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    check-cast v0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object v0, v1

    .line 22
    :goto_1
    const/4 v2, 0x0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    return v2

    .line 26
    :cond_2
    sget-object v3, Ldk1;->ε:Ljava/util/Set;

    .line 27
    .line 28
    monitor-enter v3

    .line 29
    :try_start_0
    move-object v4, v3

    .line 30
    check-cast v4, Ljava/lang/Iterable;

    .line 31
    .line 32
    invoke-static {v4}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 36
    monitor-exit v3

    .line 37
    sget-object v3, Ldk1;->γ:Ljava/lang/ClassLoader;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v6}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    filled-new-array {v3, v5, v6}, [Ljava/lang/ClassLoader;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {v3}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v3}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v3}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_5

    .line 80
    .line 81
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Ljava/lang/ClassLoader;

    .line 86
    .line 87
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    :catchall_0
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_3

    .line 96
    .line 97
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    check-cast v7, Ljava/lang/String;

    .line 102
    .line 103
    :try_start_1
    invoke-static {v5, v7}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    if-eqz v7, :cond_4

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    move-object v7, v1

    .line 111
    :goto_2
    const/4 v3, 0x4

    .line 112
    if-nez v7, :cond_6

    .line 113
    .line 114
    const-string p0, "PublishGestureLauncher"

    .line 115
    .line 116
    const-string v0, "[\u964d\u7ea7\u65b9\u6848] \u65e0\u6cd5\u89e3\u6790 PublishButton \u7c7b\uff0c\u8df3\u8fc7\u4e34\u65f6\u6784\u9020"

    .line 117
    .line 118
    invoke-static {p0, v0, v1, v3, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return v2

    .line 122
    :cond_6
    const-class v4, Landroid/view/View;

    .line 123
    .line 124
    invoke-virtual {v4, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-nez v4, :cond_7

    .line 129
    .line 130
    const-string p0, "PublishGestureLauncher"

    .line 131
    .line 132
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const-string v4, "[\u964d\u7ea7\u65b9\u6848] PublishButton \u7c7b\u4e0d\u662f View: "

    .line 137
    .line 138
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {p0, v0, v1, v3, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return v2

    .line 146
    :cond_7
    new-instance v4, Landroid/widget/FrameLayout;

    .line 147
    .line 148
    invoke-direct {v4, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 149
    .line 150
    .line 151
    const/4 v5, 0x0

    .line 152
    invoke-virtual {v4, v5}, Landroid/view/View;->setAlpha(F)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4, v2}, Landroid/view/View;->setClickable(Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 162
    .line 163
    .line 164
    :try_start_2
    sget-object v5, Ldk1;->ζ:Ljava/lang/ThreadLocal;

    .line 165
    .line 166
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {v5, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v7, p0}, Ldk1;->η(Ljava/lang/Class;Landroid/app/Activity;)Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    if-nez p0, :cond_8

    .line 176
    .line 177
    const-string p0, "PublishGestureLauncher"

    .line 178
    .line 179
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    new-instance v4, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    const-string v6, "[\u964d\u7ea7\u65b9\u6848] \u4e34\u65f6\u6784\u9020 PublishButton \u5931\u8d25: "

    .line 189
    .line 190
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {p0, v0, v1, v3, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->remove()V

    .line 204
    .line 205
    .line 206
    return v2

    .line 207
    :catchall_1
    move-exception p0

    .line 208
    goto :goto_3

    .line 209
    :cond_8
    :try_start_3
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 210
    .line 211
    const/4 v8, 0x1

    .line 212
    invoke-direct {v6, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 216
    .line 217
    .line 218
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 219
    .line 220
    invoke-direct {v6, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4, p0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->remove()V

    .line 227
    .line 228
    .line 229
    const-string v2, "PublishGestureLauncher"

    .line 230
    .line 231
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    const-string v6, "[\u964d\u7ea7\u65b9\u6848] \u5df2\u6302\u8f7d\u4e34\u65f6 PublishButton\uff0c\u7b49\u5f85\u521d\u59cb\u5316\u540e\u89e6\u53d1: "

    .line 236
    .line 237
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-static {v2, v5, v1, v3, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    new-instance v1, Ljg1;

    .line 245
    .line 246
    const/4 v2, 0x2

    .line 247
    invoke-direct {v1, p0, v0, v4, v2}, Ljg1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 248
    .line 249
    .line 250
    const-wide/16 v2, 0x50

    .line 251
    .line 252
    invoke-virtual {v4, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 253
    .line 254
    .line 255
    return v8

    .line 256
    :goto_3
    :try_start_4
    const-string v0, "PublishGestureLauncher"

    .line 257
    .line 258
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    new-instance v4, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 265
    .line 266
    .line 267
    const-string v5, "[\u964d\u7ea7\u65b9\u6848] \u6302\u8f7d\u4e34\u65f6 PublishButton \u5931\u8d25: "

    .line 268
    .line 269
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-static {v0, p0, v1, v3, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 280
    .line 281
    .line 282
    sget-object p0, Ldk1;->ζ:Ljava/lang/ThreadLocal;

    .line 283
    .line 284
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 285
    .line 286
    .line 287
    return v2

    .line 288
    :catchall_2
    move-exception p0

    .line 289
    sget-object v0, Ldk1;->ζ:Ljava/lang/ThreadLocal;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 292
    .line 293
    .line 294
    throw p0

    .line 295
    :catchall_3
    move-exception p0

    .line 296
    monitor-exit v3

    .line 297
    throw p0
.end method

.method public static γ(Landroid/view/View;Ljava/lang/String;Z)V
    .locals 10

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const-string p2, "PublishGestureLauncher"

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v2, "\u5ffd\u7565\u4e34\u65f6\u6784\u9020\u7684 PublishButton source="

    .line 16
    .line 17
    const-string v3, " class="

    .line 18
    .line 19
    invoke-static {v2, p1, v3, p0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p2, p0, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object p2, Ldk1;->ε:Ljava/util/Set;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {p2, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    sget-object p2, Ldk1;->δ:Ljava/util/Set;

    .line 41
    .line 42
    monitor-enter p2

    .line 43
    :try_start_0
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    monitor-exit p2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    const-string p2, "PublishGestureLauncher"

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-static {p0}, Ldk1;->ι(Landroid/view/View;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    const/4 v8, -0x1

    .line 81
    if-ne v7, v8, :cond_1

    .line 82
    .line 83
    const-string p0, "no_id"

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0, v7}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    :goto_0
    const-string v7, "\u7f13\u5b58\u771f\u5b9e PublishButton source="

    .line 103
    .line 104
    const-string v8, " class="

    .line 105
    .line 106
    const-string v9, " attached="

    .line 107
    .line 108
    invoke-static {v7, p1, v8, v2, v9}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v2, " shown="

    .line 113
    .line 114
    const-string v7, " clickable="

    .line 115
    .line 116
    invoke-static {p1, v3, v2, v4, v7}, Lnx;->Δ(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const-string v2, " hasListener="

    .line 120
    .line 121
    const-string v3, " id="

    .line 122
    .line 123
    invoke-static {p1, v5, v2, v6, v3}, Lnx;->Δ(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p2, p0, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_2
    return-void

    .line 137
    :catchall_1
    move-exception p0

    .line 138
    monitor-exit p2

    .line 139
    throw p0
.end method

.method public static δ()Z
    .locals 13

    .line 1
    sget-object v0, Ldk1;->δ:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    move-object v1, v0

    .line 5
    check-cast v1, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit v0

    .line 12
    const-string v0, "PublishGestureLauncher"

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const-string v3, "\u5c1d\u8bd5\u7f13\u5b58 PublishButton candidates="

    .line 19
    .line 20
    invoke-static {v3, v2}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x4

    .line 26
    invoke-static {v0, v2, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lib1;

    .line 30
    .line 31
    const/16 v2, 0x1a

    .line 32
    .line 33
    invoke-direct {v0, v2}, Lib1;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x0

    .line 45
    move v2, v1

    .line 46
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    add-int/lit8 v6, v2, 0x1

    .line 57
    .line 58
    if-ltz v2, :cond_1

    .line 59
    .line 60
    check-cast v5, Landroid/view/View;

    .line 61
    .line 62
    const-string v7, "PublishGestureLauncher"

    .line 63
    .line 64
    invoke-static {v5}, Ldk1;->ρ(Landroid/view/View;)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    invoke-static {v5}, Ldk1;->θ(Landroid/view/View;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    const-string v10, "\u5c1d\u8bd5\u89e6\u53d1\u7f13\u5b58 PublishButton index="

    .line 73
    .line 74
    const-string v11, " score="

    .line 75
    .line 76
    const-string v12, " desc="

    .line 77
    .line 78
    invoke-static {v10, v2, v11, v8, v12}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-static {v7, v8, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance v7, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v8, "cached#"

    .line 95
    .line 96
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-static {v5, v2}, Ldk1;->σ(Landroid/view/View;Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_0

    .line 111
    .line 112
    const/4 v0, 0x1

    .line 113
    return v0

    .line 114
    :cond_0
    move v2, v6

    .line 115
    goto :goto_0

    .line 116
    :cond_1
    invoke-static {}, Lyh;->х()V

    .line 117
    .line 118
    .line 119
    throw v3

    .line 120
    :cond_2
    return v1

    .line 121
    :catchall_0
    move-exception v1

    .line 122
    monitor-exit v0

    .line 123
    throw v1
.end method

.method public static ε(Landroid/app/Activity;)Z
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_1

    .line 15
    .line 16
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lsm1;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v1, p0, v0}, Ldk1;->ζ(Lsm1;Ljava/util/ArrayList;Landroid/view/View;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    iget v2, v2, Lsm1;->ε:I

    .line 34
    .line 35
    const-string v3, "\u626b\u63cf\u5f53\u524d\u9875\u9762 PublishButton candidates="

    .line 36
    .line 37
    const-string v4, " visited="

    .line 38
    .line 39
    invoke-static {p0, v2, v3, v4}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v2, "PublishGestureLauncher"

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x4

    .line 47
    invoke-static {v2, p0, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p0, Lib1;

    .line 51
    .line 52
    const/16 v5, 0x1b

    .line 53
    .line 54
    invoke-direct {p0, v5}, Lib1;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    move v1, v0

    .line 66
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    add-int/lit8 v6, v1, 0x1

    .line 77
    .line 78
    if-ltz v1, :cond_2

    .line 79
    .line 80
    check-cast v5, Landroid/view/View;

    .line 81
    .line 82
    invoke-static {v5}, Ldk1;->ρ(Landroid/view/View;)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    invoke-static {v5}, Ldk1;->θ(Landroid/view/View;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    const-string v9, " score="

    .line 91
    .line 92
    const-string v10, " desc="

    .line 93
    .line 94
    const-string v11, "\u5c1d\u8bd5\u89e6\u53d1\u5f53\u524d\u9875\u9762 PublishButton index="

    .line 95
    .line 96
    invoke-static {v11, v1, v9, v7, v10}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-static {v2, v7, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    new-instance v7, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v8, "decor-scan#"

    .line 113
    .line 114
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v5, v1}, Ldk1;->σ(Landroid/view/View;Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_1

    .line 129
    .line 130
    const/4 p0, 0x1

    .line 131
    return p0

    .line 132
    :cond_1
    move v1, v6

    .line 133
    goto :goto_0

    .line 134
    :cond_2
    invoke-static {}, Lyh;->х()V

    .line 135
    .line 136
    .line 137
    throw v3

    .line 138
    :cond_3
    :goto_1
    return v0
.end method

.method public static final ζ(Lsm1;Ljava/util/ArrayList;Landroid/view/View;I)V
    .locals 4

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    const/16 v0, 0x1c

    .line 5
    .line 6
    if-le p3, v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    iget v0, p0, Lsm1;->ε:I

    .line 10
    .line 11
    const/16 v1, 0x1770

    .line 12
    .line 13
    if-lt v0, v1, :cond_2

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    iput v0, p0, Lsm1;->ε:I

    .line 19
    .line 20
    invoke-static {p2}, Ldk1;->ν(Landroid/view/View;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_3
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    check-cast p2, Landroid/view/ViewGroup;

    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x0

    .line 40
    :goto_0
    if-ge v1, v0, :cond_4

    .line 41
    .line 42
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    add-int/lit8 v3, p3, 0x1

    .line 47
    .line 48
    invoke-static {p0, p1, v2, v3}, Ldk1;->ζ(Lsm1;Ljava/util/ArrayList;Landroid/view/View;I)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    :goto_1
    return-void
.end method

.method public static η(Ljava/lang/Class;Landroid/app/Activity;)Landroid/view/View;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v2, Lib1;

    .line 14
    .line 15
    const/16 v3, 0x1c

    .line 16
    .line 17
    invoke-direct {v2, v3}, Lib1;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v2}, Lg7;->к([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :catchall_0
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz v2, :cond_5

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    array-length v5, v4

    .line 46
    const-class v6, Landroid/content/Context;

    .line 47
    .line 48
    const/4 v7, 0x1

    .line 49
    if-ne v5, v7, :cond_1

    .line 50
    .line 51
    aget-object v5, v4, v0

    .line 52
    .line 53
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    new-array v3, v7, [Ljava/lang/Object;

    .line 60
    .line 61
    aput-object p1, v3, v0

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    array-length v5, v4

    .line 65
    const/4 v8, 0x2

    .line 66
    if-ne v5, v8, :cond_2

    .line 67
    .line 68
    aget-object v5, v4, v0

    .line 69
    .line 70
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    new-array v4, v8, [Ljava/lang/Object;

    .line 77
    .line 78
    aput-object p1, v4, v0

    .line 79
    .line 80
    aput-object v3, v4, v7

    .line 81
    .line 82
    :goto_0
    move-object v3, v4

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    array-length v5, v4

    .line 85
    const/4 v9, 0x3

    .line 86
    if-ne v5, v9, :cond_3

    .line 87
    .line 88
    aget-object v5, v4, v0

    .line 89
    .line 90
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_3

    .line 95
    .line 96
    aget-object v5, v4, v8

    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {v5}, Ldk1;->μ(Ljava/lang/Class;)Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_3

    .line 106
    .line 107
    new-array v4, v9, [Ljava/lang/Object;

    .line 108
    .line 109
    aput-object p1, v4, v0

    .line 110
    .line 111
    aput-object v3, v4, v7

    .line 112
    .line 113
    aput-object v1, v4, v8

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    array-length v5, v4

    .line 117
    const/4 v10, 0x4

    .line 118
    if-ne v5, v10, :cond_4

    .line 119
    .line 120
    aget-object v5, v4, v0

    .line 121
    .line 122
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_4

    .line 127
    .line 128
    aget-object v5, v4, v8

    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-static {v5}, Ldk1;->μ(Ljava/lang/Class;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_4

    .line 138
    .line 139
    aget-object v4, v4, v9

    .line 140
    .line 141
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-static {v4}, Ldk1;->μ(Ljava/lang/Class;)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_4

    .line 149
    .line 150
    new-array v4, v10, [Ljava/lang/Object;

    .line 151
    .line 152
    aput-object p1, v4, v0

    .line 153
    .line 154
    aput-object v3, v4, v7

    .line 155
    .line 156
    aput-object v1, v4, v8

    .line 157
    .line 158
    aput-object v1, v4, v9

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_4
    :goto_1
    if-eqz v3, :cond_0

    .line 162
    .line 163
    :try_start_0
    invoke-virtual {v2, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 164
    .line 165
    .line 166
    array-length v4, v3

    .line 167
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    instance-of v3, v2, Landroid/view/View;

    .line 176
    .line 177
    if-eqz v3, :cond_0

    .line 178
    .line 179
    check-cast v2, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    .line 181
    return-object v2

    .line 182
    :cond_5
    return-object v3
.end method

.method public static θ(Landroid/view/View;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    new-instance v2, Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 17
    .line 18
    iget v4, v2, Landroid/graphics/Rect;->top:I

    .line 19
    .line 20
    iget v5, v2, Landroid/graphics/Rect;->right:I

    .line 21
    .line 22
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 23
    .line 24
    new-instance v6, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v0, "]"

    .line 51
    .line 52
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const-string v0, "no_rect"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    const-string v0, "rect_err"

    .line 64
    .line 65
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const/4 v3, -0x1

    .line 78
    if-ne v2, v3, :cond_1

    .line 79
    .line 80
    const-string v2, "no_id"

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    move-object v2, v3

    .line 95
    goto :goto_1

    .line 96
    :catchall_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-nez v5, :cond_2

    .line 113
    .line 114
    const/4 v5, 0x1

    .line 115
    goto :goto_2

    .line 116
    :cond_2
    const/4 v5, 0x0

    .line 117
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    invoke-static {p0}, Ldk1;->ι(Landroid/view/View;)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    new-instance v7, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, "#"

    .line 134
    .line 135
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v1, " attached="

    .line 142
    .line 143
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v1, " shown="

    .line 150
    .line 151
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v1, " visible="

    .line 158
    .line 159
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v1, " clickable="

    .line 166
    .line 167
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v1, " listener="

    .line 174
    .line 175
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string p0, " rect="

    .line 182
    .line 183
    invoke-static {v7, p0, v0}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0
.end method

.method public static ι(Landroid/view/View;)Z
    .locals 3

    .line 1
    :try_start_0
    sget-boolean v0, Ldk1;->ι:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-class v0, Landroid/view/View;

    .line 7
    .line 8
    const-string v2, "mListenerInfo"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ldk1;->η:Ljava/lang/reflect/Field;

    .line 18
    .line 19
    sput-boolean v1, Ldk1;->ι:Z

    .line 20
    .line 21
    :cond_0
    sget-object v0, Ldk1;->η:Ljava/lang/reflect/Field;

    .line 22
    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    sget-object v0, Ldk1;->θ:Ljava/lang/reflect/Field;

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v2, "mOnClickListener"

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Ldk1;->θ:Ljava/lang/reflect/Field;

    .line 50
    .line 51
    :cond_2
    sget-object v0, Ldk1;->θ:Ljava/lang/reflect/Field;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const/4 p0, 0x0

    .line 61
    :goto_0
    if-eqz p0, :cond_4

    .line 62
    .line 63
    return v1

    .line 64
    :catchall_0
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method public static λ(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v0, "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C71358804495460988BC309E79107C904005381417879B5B03919102E2F4DDA294DD2ECA50F1F6BB81A3482872"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x4

    .line 14
    const-string v1, "PublishGestureLauncher"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const-string p0, "PublishButton \u7c7b\u672a\u627e\u5230\uff0c\u7b49\u5f85 View \u515c\u5e95\u6355\u83b7"

    .line 20
    .line 21
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object v3, Ldk1;->ε:Ljava/util/Set;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    sget-object v3, Lxq0;->α:Lxq0;

    .line 35
    .line 36
    new-instance v4, Lad1;

    .line 37
    .line 38
    const/16 v5, 0xc

    .line 39
    .line 40
    invoke-direct {v4, v5}, Lad1;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, p0, v4}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v3, "PublishButton \u6784\u9020\u5668 Hook \u5df2\u5b89\u88c5: "

    .line 51
    .line 52
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public static μ(Ljava/lang/Class;)Z
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public static ν(Landroid/view/View;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    const-class v1, Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C71358804495460988BC309E79107C904005381417879B5B03919102E2F4DDA294DD2ECA50F1F6BB81A3482872"

    .line 21
    .line 22
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    const-string v2, ".PublishButton"

    .line 33
    .line 34
    invoke-static {v1, v2, v0}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    const-string v2, "hometab.bottom.PublishButton"

    .line 41
    .line 42
    invoke-static {v1, v2, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 55
    return p0

    .line 56
    :cond_2
    return v0
.end method

.method public static ξ(Landroid/app/Activity;)Z
    .locals 8

    .line 1
    const-string v1, "PublishGestureLauncher"

    .line 2
    .line 3
    const-string v6, "aweme://aweme/createrecord?enter_from=dyhelper"

    .line 4
    .line 5
    const-string v7, "aweme://aweme/record?enter_from=dyhelper"

    .line 6
    .line 7
    const-string v2, "snssdk1128://aweme/createrecord?enter_from=dyhelper"

    .line 8
    .line 9
    const-string v3, "snssdk1128://aweme/record?enter_from=dyhelper"

    .line 10
    .line 11
    const-string v4, "snssdk1128://aweme/openRecord?enter_from=dyhelper"

    .line 12
    .line 13
    const-string v5, "snssdk1128://aweme/opensdk/openrecord?enter_from=dyhelper"

    .line 14
    .line 15
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v3, v0

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    const/4 v4, 0x4

    .line 41
    const/4 v5, 0x0

    .line 42
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 43
    .line 44
    const-string v6, "android.intent.action.VIEW"

    .line 45
    .line 46
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-direct {v0, v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    const/high16 v6, 0x20000000

    .line 61
    .line 62
    invoke-virtual {v0, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v6, "\u901a\u8fc7 schema \u5c1d\u8bd5\u6253\u5f00\u53d1\u5e03\u9875: "

    .line 74
    .line 75
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v1, v0, v5, v4, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x1

    .line 89
    return p0

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v6, "schema \u6253\u5f00\u5931\u8d25 schema="

    .line 96
    .line 97
    const-string v7, " err="

    .line 98
    .line 99
    invoke-static {v6, v3, v7, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v1, v0, v5, v4, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    const/4 p0, 0x0

    .line 108
    return p0
.end method

.method public static ο(Landroid/app/Activity;)Z
    .locals 19

    .line 1
    const-string v1, "PublishGestureLauncher"

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Ldk1;->γ:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    move/from16 v17, v2

    .line 19
    .line 20
    goto/16 :goto_a

    .line 21
    .line 22
    :cond_1
    move-object v3, v0

    .line 23
    const-string v0, "~79141EF2FBD496D84F82136FAD77522A06BB551B75C1AEA3D4F42A80C42F5DAB"

    .line 24
    .line 25
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v4, "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724259A29B43A5807491FC629BF3D81986847A"

    .line 30
    .line 31
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v4, "aweme://aweme/createrecord?enter_from=dyhelper"

    .line 44
    .line 45
    const-string v5, "aweme://main?tab=homepage_publish&enter_from=dyhelper"

    .line 46
    .line 47
    const-string v6, "snssdk1128://aweme/createrecord?enter_from=dyhelper"

    .line 48
    .line 49
    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-static {v4}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/lang/String;

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    :try_start_0
    invoke-static {v3, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-object v0, v6

    .line 80
    :goto_1
    if-nez v0, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    array-length v7, v0

    .line 91
    move v8, v2

    .line 92
    :goto_2
    const/4 v9, 0x1

    .line 93
    if-ge v8, v7, :cond_4

    .line 94
    .line 95
    aget-object v10, v0, v8

    .line 96
    .line 97
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    const-string v12, "buildRoute"

    .line 102
    .line 103
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    if-eqz v11, :cond_3

    .line 108
    .line 109
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    array-length v11, v11

    .line 114
    const/4 v12, 0x2

    .line 115
    if-ne v11, v12, :cond_3

    .line 116
    .line 117
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    aget-object v11, v11, v2

    .line 122
    .line 123
    const-class v12, Landroid/content/Context;

    .line 124
    .line 125
    invoke-virtual {v12, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    if-eqz v11, :cond_3

    .line 130
    .line 131
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    aget-object v11, v11, v9

    .line 136
    .line 137
    const-class v12, Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-eqz v11, :cond_3

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    move-object v10, v6

    .line 150
    :goto_3
    if-nez v10, :cond_5

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_5
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_c

    .line 162
    .line 163
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    move-object v8, v0

    .line 168
    check-cast v8, Ljava/lang/String;

    .line 169
    .line 170
    const/4 v11, 0x4

    .line 171
    move-object/from16 v12, p0

    .line 172
    .line 173
    :try_start_1
    filled-new-array {v12, v8}, [Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v10, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-nez v0, :cond_6

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    invoke-virtual {v13}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 189
    .line 190
    .line 191
    move-result-object v13

    .line 192
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    array-length v14, v13

    .line 196
    move v15, v2

    .line 197
    :goto_5
    if-ge v15, v14, :cond_8

    .line 198
    .line 199
    aget-object v16, v13, v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 200
    .line 201
    move/from16 v17, v2

    .line 202
    .line 203
    :try_start_2
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 207
    move/from16 v18, v9

    .line 208
    .line 209
    :try_start_3
    const-string v9, "open"

    .line 210
    .line 211
    invoke-static {v2, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_7

    .line 216
    .line 217
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    array-length v2, v2

    .line 225
    if-nez v2, :cond_7

    .line 226
    .line 227
    move-object/from16 v2, v16

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :catchall_1
    move-exception v0

    .line 231
    goto :goto_9

    .line 232
    :cond_7
    add-int/lit8 v15, v15, 0x1

    .line 233
    .line 234
    move/from16 v2, v17

    .line 235
    .line 236
    move/from16 v9, v18

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :catchall_2
    move-exception v0

    .line 240
    :goto_6
    move/from16 v18, v9

    .line 241
    .line 242
    goto :goto_9

    .line 243
    :catchall_3
    move-exception v0

    .line 244
    move/from16 v17, v2

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_8
    move/from16 v17, v2

    .line 248
    .line 249
    move/from16 v18, v9

    .line 250
    .line 251
    move-object v2, v6

    .line 252
    :goto_7
    if-nez v2, :cond_a

    .line 253
    .line 254
    :cond_9
    :goto_8
    move/from16 v2, v17

    .line 255
    .line 256
    move/from16 v9, v18

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_a
    invoke-virtual {v2, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 264
    .line 265
    if-eqz v2, :cond_b

    .line 266
    .line 267
    check-cast v0, Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_9

    .line 274
    .line 275
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 278
    .line 279
    .line 280
    const-string v2, "\u901a\u8fc7 SmartRouter \u5c1d\u8bd5\u6253\u5f00\u53d1\u5e03\u9875 route="

    .line 281
    .line 282
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-static {v1, v0, v6, v11, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 293
    .line 294
    .line 295
    return v18

    .line 296
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    const-string v2, "SmartRouter route \u5931\u8d25 route="

    .line 301
    .line 302
    const-string v9, " err="

    .line 303
    .line 304
    invoke-static {v2, v8, v9, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-static {v1, v0, v6, v11, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_c
    move-object/from16 v12, p0

    .line 313
    .line 314
    goto/16 :goto_0

    .line 315
    .line 316
    :goto_a
    return v17
.end method

.method public static π(Landroid/app/Activity;)Z
    .locals 5

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
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Landroid/os/Handler;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lhg1;

    .line 26
    .line 27
    const/4 v3, 0x6

    .line 28
    invoke-direct {v2, p0, v3}, Lhg1;-><init>(Landroid/app/Activity;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return v1

    .line 35
    :cond_0
    const-string v0, "\u5f00\u59cb\u6253\u5f00\u53d1\u5e03\u9875"

    .line 36
    .line 37
    const-string v2, "PublishGestureLauncher"

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x4

    .line 41
    invoke-static {v2, v0, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :try_start_0
    invoke-static {p0}, Ldk1;->ε(Landroid/app/Activity;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {}, Ldk1;->δ()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-static {p0}, Ldk1;->ο(Landroid/app/Activity;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-static {p0}, Ldk1;->ξ(Landroid/app/Activity;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-static {p0}, Ldk1;->β(Landroid/app/Activity;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_5

    .line 77
    .line 78
    :goto_0
    return v1

    .line 79
    :cond_5
    const-string p0, "\u6253\u5f00\u53d1\u5e03\u9875\u5931\u8d25\uff1a\u6240\u6709\u65b9\u6848\u5747\u65e0\u6548"

    .line 80
    .line 81
    invoke-static {v2, p0, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const-string v0, "\u6253\u5f00\u53d1\u5e03\u9875\u5f02\u5e38: "

    .line 91
    .line 92
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {v2, p0, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    const/4 p0, 0x0

    .line 100
    return p0
.end method

.method public static ρ(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C71358804495460988BC309E79107C904005381417879B5B03919102E2F4DDA294DD2ECA50F1F6BB81A3482872"

    .line 10
    .line 11
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/16 v0, 0x12c

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    add-int/lit16 v0, v0, 0x1f4

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    add-int/lit16 v0, v0, 0xfa

    .line 40
    .line 41
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x78

    .line 48
    .line 49
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x78

    .line 56
    .line 57
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-lez v1, :cond_5

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-lez v1, :cond_5

    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x50

    .line 70
    .line 71
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    add-int/lit8 v0, v0, 0x3c

    .line 78
    .line 79
    :cond_6
    invoke-static {p0}, Ldk1;->ι(Landroid/view/View;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_7

    .line 84
    .line 85
    add-int/lit16 v0, v0, 0xb4

    .line 86
    .line 87
    :cond_7
    :try_start_0
    new-instance v1, Landroid/graphics/Rect;

    .line 88
    .line 89
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_8

    .line 97
    .line 98
    add-int/lit8 v0, v0, 0x64

    .line 99
    .line 100
    iget p0, v1, Landroid/graphics/Rect;->bottom:I

    .line 101
    .line 102
    div-int/lit8 p0, p0, 0x14

    .line 103
    .line 104
    const/16 v1, 0x64

    .line 105
    .line 106
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 107
    .line 108
    .line 109
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    add-int/2addr v0, p0

    .line 111
    :catchall_0
    :cond_8
    return v0
.end method

.method public static σ(Landroid/view/View;Ljava/lang/String;)Z
    .locals 17

    .line 1
    const/4 v3, 0x0

    .line 2
    move-object/from16 v2, p0

    .line 3
    .line 4
    :goto_0
    if-eqz v2, :cond_5

    .line 5
    .line 6
    const/4 v0, 0x6

    .line 7
    if-gt v3, v0, :cond_5

    .line 8
    .line 9
    const-string v0, ",parentDepth="

    .line 10
    .line 11
    move-object/from16 v4, p1

    .line 12
    .line 13
    invoke-static {v4, v0, v3}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    const-string v6, " err="

    .line 18
    .line 19
    const-string v7, " view="

    .line 20
    .line 21
    const-string v8, "PublishGestureLauncher"

    .line 22
    .line 23
    const-string v9, "\u53d1\u5e03\u5165\u53e3\u89e6\u53d1\u6210\u529f performClick source="

    .line 24
    .line 25
    const-string v10, "performClick \u5f02\u5e38 source="

    .line 26
    .line 27
    const-string v11, "\u53d1\u5e03\u5165\u53e3\u89e6\u53d1\u6210\u529f callOnClick source="

    .line 28
    .line 29
    const-string v12, "callOnClick \u5f02\u5e38 source="

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    .line 32
    .line 33
    .line 34
    move-result v13

    .line 35
    :try_start_0
    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v14, 0x1

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v2, v14}, Landroid/view/View;->setEnabled(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto/16 :goto_7

    .line 48
    .line 49
    :cond_0
    :goto_1
    const/4 v15, 0x0

    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v2}, Landroid/view/View;->callOnClick()Z

    .line 53
    .line 54
    .line 55
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    move/from16 p0, v14

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_1
    move-exception v0

    .line 60
    move/from16 p0, v14

    .line 61
    .line 62
    :try_start_2
    invoke-static {v2}, Ldk1;->θ(Landroid/view/View;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v14

    .line 66
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const/4 v1, 0x4

    .line 95
    invoke-static {v8, v0, v15, v1, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move/from16 v0, v16

    .line 99
    .line 100
    :goto_2
    if-eqz v0, :cond_1

    .line 101
    .line 102
    invoke-static {v2}, Ldk1;->θ(Landroid/view/View;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const/4 v1, 0x4

    .line 125
    invoke-static {v8, v0, v15, v1, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    .line 127
    .line 128
    :goto_3
    invoke-virtual {v2, v13}, Landroid/view/View;->setEnabled(Z)V

    .line 129
    .line 130
    .line 131
    move/from16 v0, p0

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_1
    :try_start_3
    invoke-virtual {v2}, Landroid/view/View;->performClick()Z

    .line 135
    .line 136
    .line 137
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 138
    goto :goto_4

    .line 139
    :catchall_2
    move-exception v0

    .line 140
    :try_start_4
    invoke-static {v2}, Ldk1;->θ(Landroid/view/View;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    new-instance v11, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const/4 v1, 0x4

    .line 173
    invoke-static {v8, v0, v15, v1, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    move/from16 v0, v16

    .line 177
    .line 178
    :goto_4
    if-eqz v0, :cond_2

    .line 179
    .line 180
    invoke-static {v2}, Ldk1;->θ(Landroid/view/View;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    new-instance v1, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    const/4 v1, 0x4

    .line 203
    invoke-static {v8, v0, v15, v1, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_2
    invoke-virtual {v2, v13}, Landroid/view/View;->setEnabled(Z)V

    .line 208
    .line 209
    .line 210
    move/from16 v0, v16

    .line 211
    .line 212
    :goto_5
    if-eqz v0, :cond_3

    .line 213
    .line 214
    return p0

    .line 215
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    instance-of v1, v0, Landroid/view/View;

    .line 220
    .line 221
    if-eqz v1, :cond_4

    .line 222
    .line 223
    check-cast v0, Landroid/view/View;

    .line 224
    .line 225
    move-object v2, v0

    .line 226
    goto :goto_6

    .line 227
    :cond_4
    move-object v2, v15

    .line 228
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :goto_7
    invoke-virtual {v2, v13}, Landroid/view/View;->setEnabled(Z)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_5
    const/16 v16, 0x0

    .line 237
    .line 238
    return v16
.end method


# virtual methods
.method public final κ(Ljava/lang/ClassLoader;)V
    .locals 8

    .line 1
    const-string v0, "View.setOnClickListener \u6355\u83b7 PublishButton \u5931\u8d25: "

    .line 2
    .line 3
    const-string v1, "View.onAttachedToWindow \u6355\u83b7 PublishButton \u5931\u8d25: "

    .line 4
    .line 5
    const-string v2, "PublishButton \u6784\u9020\u5668 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-boolean v3, Ldk1;->β:Z

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    monitor-enter p0

    .line 16
    :try_start_0
    sget-boolean v3, Ldk1;->β:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :cond_1
    :try_start_1
    sput-object p1, Ldk1;->γ:Ljava/lang/ClassLoader;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    const/4 v4, 0x0

    .line 26
    :try_start_2
    invoke-static {p1}, Ldk1;->λ(Ljava/lang/ClassLoader;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    :try_start_3
    const-string v5, "PublishGestureLauncher"

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v6, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {v5, p1, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 50
    .line 51
    .line 52
    :goto_0
    :try_start_4
    sget-object p1, Lxq0;->α:Lxq0;

    .line 53
    .line 54
    const-class v2, Landroid/view/View;

    .line 55
    .line 56
    const-string v5, "onAttachedToWindow"

    .line 57
    .line 58
    new-instance v6, Lad1;

    .line 59
    .line 60
    const/16 v7, 0xe

    .line 61
    .line 62
    invoke-direct {v6, v7}, Lad1;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2, v5, v6}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    const-string p1, "PublishGestureLauncher"

    .line 69
    .line 70
    const-string v2, "View.onAttachedToWindow PublishButton \u515c\u5e95\u6355\u83b7\u5df2\u5b89\u88c5"

    .line 71
    .line 72
    invoke-static {p1, v2, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_1
    move-exception p1

    .line 77
    :try_start_5
    const-string v2, "PublishGestureLauncher"

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v5, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {v2, p1, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 96
    .line 97
    .line 98
    :goto_1
    :try_start_6
    sget-object p1, Lxq0;->α:Lxq0;

    .line 99
    .line 100
    const-class v1, Landroid/view/View;

    .line 101
    .line 102
    const-string v2, "setOnClickListener"

    .line 103
    .line 104
    new-instance v5, Lad1;

    .line 105
    .line 106
    const/16 v6, 0xd

    .line 107
    .line 108
    invoke-direct {v5, v6}, Lad1;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v1, v2, v5}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    const-string p1, "PublishGestureLauncher"

    .line 115
    .line 116
    const-string v1, "View.setOnClickListener PublishButton \u515c\u5e95\u6355\u83b7\u5df2\u5b89\u88c5"

    .line 117
    .line 118
    invoke-static {p1, v1, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :catchall_2
    move-exception p1

    .line 123
    :try_start_7
    const-string v1, "PublishGestureLauncher"

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    new-instance v2, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-static {v1, p1, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :goto_2
    const/4 p1, 0x1

    .line 145
    sput-boolean p1, Ldk1;->β:Z

    .line 146
    .line 147
    const-string p1, "PublishGestureLauncher"

    .line 148
    .line 149
    const-string v0, "PublishGestureLauncher Hook \u5df2\u5b89\u88c5"

    .line 150
    .line 151
    invoke-static {p1, v0, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 152
    .line 153
    .line 154
    monitor-exit p0

    .line 155
    return-void

    .line 156
    :catchall_3
    move-exception p1

    .line 157
    monitor-exit p0

    .line 158
    throw p1
.end method
