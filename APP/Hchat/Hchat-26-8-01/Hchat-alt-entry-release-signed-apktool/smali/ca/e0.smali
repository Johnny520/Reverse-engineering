.class public final Lca/e0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final q:Ljava/util/Set;

.field public static final r:Ljava/util/Set;

.field public static final s:Ljava/util/Set;


# instance fields
.field public final a:Lr8/g;

.field public final b:Lp8/o;

.field public final c:Lab/b;

.field public final d:Landroid/os/Handler;

.field public final e:Landroid/content/SharedPreferences;

.field public final f:Ljava/util/Set;

.field public final g:Ljava/util/Map;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/util/Map;

.field public volatile j:J

.field public volatile k:Ljava/lang/ref/WeakReference;

.field public volatile l:J

.field public final m:Ljava/util/concurrent/ConcurrentHashMap;

.field public final n:Ljava/util/concurrent/ExecutorService;

.field public final o:Landroidx/lifecycle/x;

.field public final p:Lb5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/16 v0, 0x2b

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    const/16 v0, 0x3e

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v9

    .line 13
    filled-new-array {v5, v9}, [Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lca/e0;->q:Ljava/util/Set;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v0, 0x3

    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    filled-new-array {v1, v2, v5, v9}, [Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lca/e0;->r:Ljava/util/Set;

    .line 42
    .line 43
    const/16 v0, 0x22

    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const/16 v0, 0x2a

    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    const/16 v0, 0x2f

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    const/16 v0, 0x30

    .line 62
    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    const/16 v0, 0x31

    .line 68
    .line 69
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    filled-new-array/range {v1 .. v9}, [Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Lca/e0;->s:Ljava/util/Set;

    .line 82
    .line 83
    return-void
.end method

.method public constructor <init>(Lr8/g;Lp8/o;Lab/b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lca/e0;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lca/e0;->b:Lp8/o;

    .line 10
    .line 11
    iput-object p3, p0, Lca/e0;->c:Lab/b;

    .line 12
    .line 13
    new-instance p2, Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lca/e0;->d:Landroid/os/Handler;

    .line 23
    .line 24
    iget-object p2, p1, Lr8/g;->a:Landroid/content/Context;

    .line 25
    .line 26
    const-string v0, "Hchat_message_forward_config"

    .line 27
    .line 28
    invoke-static {p2, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p0, Lca/e0;->e:Landroid/content/SharedPreferences;

    .line 33
    .line 34
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    iput-object p2, p0, Lca/e0;->f:Ljava/util/Set;

    .line 39
    .line 40
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, Lca/e0;->g:Ljava/util/Map;

    .line 45
    .line 46
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Lca/e0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    .line 53
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iput-object p2, p0, Lca/e0;->i:Ljava/util/Map;

    .line 58
    .line 59
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 60
    .line 61
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p2, p0, Lca/e0;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 65
    .line 66
    new-instance p2, Lc9/q;

    .line 67
    .line 68
    const/4 v0, 0x2

    .line 69
    invoke-direct {p2, v0}, Lc9/q;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {p2}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    iput-object p2, p0, Lca/e0;->n:Ljava/util/concurrent/ExecutorService;

    .line 77
    .line 78
    new-instance p2, Landroidx/lifecycle/x;

    .line 79
    .line 80
    invoke-direct {p2, p1}, Landroidx/lifecycle/x;-><init>(Lr8/g;)V

    .line 81
    .line 82
    .line 83
    iput-object p2, p0, Lca/e0;->o:Landroidx/lifecycle/x;

    .line 84
    .line 85
    new-instance p2, Lb5/c;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object p1, p2, Lb5/c;->a:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object p3, p2, Lb5/c;->b:Ljava/lang/Object;

    .line 96
    .line 97
    new-instance p1, Lab/a;

    .line 98
    .line 99
    const/16 p3, 0xa

    .line 100
    .line 101
    invoke-direct {p1, p2, p3}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 102
    .line 103
    .line 104
    sget-object p3, Lsf/d;->g:Lsf/d;

    .line 105
    .line 106
    invoke-static {p3, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p2, Lb5/c;->c:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object p2, p0, Lca/e0;->p:Lb5/c;

    .line 113
    .line 114
    return-void
.end method

.method public static a(Ljava/lang/Object;Landroid/view/View;II)Landroid/view/MenuItem;
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
    invoke-static {p3, p0}, Lca/e0;->c(ILjava/lang/Object;)Landroid/view/MenuItem;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_0
    const/4 v2, 0x2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1}, Lq8/o;->a()Landroid/app/Activity;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move-object p1, v3

    .line 36
    :goto_0
    if-eqz p1, :cond_3

    .line 37
    .line 38
    :goto_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v5, "raw"

    .line 47
    .line 48
    const-string v6, "drawable"

    .line 49
    .line 50
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    move v6, v0

    .line 55
    :goto_2
    if-lt v6, v2, :cond_4

    .line 56
    .line 57
    :cond_3
    move v7, v0

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    aget-object v7, v5, v6

    .line 60
    .line 61
    const-string v8, "icons_filled_share"

    .line 62
    .line 63
    invoke-virtual {v4, v8, v7, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_5

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :goto_3
    const-string p1, "\u8f6c\u53d1[H]"

    .line 74
    .line 75
    if-eqz v7, :cond_8

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_7

    .line 94
    .line 95
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    move-object v6, v5

    .line 100
    check-cast v6, Ljava/lang/reflect/Method;

    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const-string v9, "c"

    .line 111
    .line 112
    invoke-static {v6, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_6

    .line 117
    .line 118
    array-length v6, v8

    .line 119
    const/4 v9, 0x5

    .line 120
    if-ne v6, v9, :cond_6

    .line 121
    .line 122
    aget-object v6, v8, v0

    .line 123
    .line 124
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 125
    .line 126
    invoke-static {v6, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_6

    .line 131
    .line 132
    const/4 v6, 0x1

    .line 133
    aget-object v6, v8, v6

    .line 134
    .line 135
    invoke-static {v6, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_6

    .line 140
    .line 141
    aget-object v6, v8, v2

    .line 142
    .line 143
    invoke-static {v6, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-eqz v6, :cond_6

    .line 148
    .line 149
    const/4 v6, 0x3

    .line 150
    aget-object v6, v8, v6

    .line 151
    .line 152
    const-class v10, Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v6, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-eqz v6, :cond_6

    .line 159
    .line 160
    const/4 v6, 0x4

    .line 161
    aget-object v6, v8, v6

    .line 162
    .line 163
    invoke-static {v6, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_6

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_7
    move-object v5, v3

    .line 171
    :goto_4
    check-cast v5, Ljava/lang/reflect/Method;

    .line 172
    .line 173
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    filled-new-array {v0, v2, v1, p1, v4}, [Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v5, p0, v0}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_8

    .line 194
    .line 195
    invoke-static {p3, p0}, Lca/e0;->c(ILjava/lang/Object;)Landroid/view/MenuItem;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    return-object p0

    .line 200
    :cond_8
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    filled-new-array {v0, v2, v1, p1}, [Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    const-string v2, "add"

    .line 213
    .line 214
    invoke-static {p0, v2, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    if-eqz v0, :cond_9

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    filled-new-array {p2, v0, v1, p1}, [Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-static {p0, v2, p2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    :goto_5
    instance-of p2, v0, Landroid/view/MenuItem;

    .line 238
    .line 239
    if-eqz p2, :cond_b

    .line 240
    .line 241
    if-eqz v7, :cond_a

    .line 242
    .line 243
    :try_start_0
    move-object p0, v0

    .line 244
    check-cast p0, Landroid/view/MenuItem;

    .line 245
    .line 246
    invoke-interface {p0, v7}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 247
    .line 248
    .line 249
    :catchall_0
    :cond_a
    check-cast v0, Landroid/view/MenuItem;

    .line 250
    .line 251
    return-object v0

    .line 252
    :cond_b
    if-eqz v0, :cond_c

    .line 253
    .line 254
    invoke-static {p3, p0}, Lca/e0;->c(ILjava/lang/Object;)Landroid/view/MenuItem;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0

    .line 259
    :cond_c
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    const-string v0, "f"

    .line 268
    .line 269
    invoke-static {p0, v0, p2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    if-eqz p2, :cond_d

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_d
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-static {p0, v0, p1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    :goto_6
    instance-of p1, p2, Landroid/view/MenuItem;

    .line 289
    .line 290
    if-eqz p1, :cond_e

    .line 291
    .line 292
    move-object v3, p2

    .line 293
    check-cast v3, Landroid/view/MenuItem;

    .line 294
    .line 295
    :cond_e
    if-eqz v3, :cond_f

    .line 296
    .line 297
    return-object v3

    .line 298
    :cond_f
    invoke-static {p3, p0}, Lca/e0;->c(ILjava/lang/Object;)Landroid/view/MenuItem;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    return-object p0
.end method

.method public static b()Landroid/app/Activity;
    .locals 3

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

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
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

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
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move-object v0, v1

    .line 18
    :goto_1
    if-eqz v0, :cond_4

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    const/4 v2, 0x0

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    :goto_2
    const/4 v2, 0x1

    .line 36
    :goto_3
    if-nez v2, :cond_4

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_4
    return-object v1
.end method

.method public static c(ILjava/lang/Object;)Landroid/view/MenuItem;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "findItem"

    .line 10
    .line 11
    invoke-static {p1, v0, p0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of p1, p0, Landroid/view/MenuItem;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    check-cast p0, Landroid/view/MenuItem;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static h(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_f

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

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
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    sget-object v2, Lca/e0;->r:Ljava/util/Set;

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, 0x0

    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x1

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    move v4, v2

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move v4, v2

    .line 64
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_7

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    const/4 v6, 0x3

    .line 81
    if-ne v5, v6, :cond_5

    .line 82
    .line 83
    move v5, v3

    .line 84
    goto :goto_2

    .line 85
    :cond_5
    move v5, v2

    .line 86
    :goto_2
    if-eqz v5, :cond_4

    .line 87
    .line 88
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    if-ltz v4, :cond_6

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_6
    invoke-static {}, La/a;->P0()V

    .line 94
    .line 95
    .line 96
    throw v1

    .line 97
    :cond_7
    :goto_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_8

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_8
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    :cond_9
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_b

    .line 113
    .line 114
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    sget-object v5, Lca/e0;->q:Ljava/util/Set;

    .line 125
    .line 126
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-interface {v5, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_9

    .line 135
    .line 136
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    if-ltz v2, :cond_a

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_a
    invoke-static {}, La/a;->P0()V

    .line 142
    .line 143
    .line 144
    throw v1

    .line 145
    :cond_b
    :goto_5
    const/16 p0, 0x9

    .line 146
    .line 147
    if-le v4, p0, :cond_c

    .line 148
    .line 149
    const-string p0, "\u670b\u53cb\u5708\u6700\u591a\u9009\u62e9 9 \u5f20\u56fe\u7247"

    .line 150
    .line 151
    return-object p0

    .line 152
    :cond_c
    if-le v2, v3, :cond_d

    .line 153
    .line 154
    const-string p0, "\u670b\u53cb\u5708\u4e00\u6b21\u53ea\u80fd\u9009\u62e9\u4e00\u4e2a\u89c6\u9891"

    .line 155
    .line 156
    return-object p0

    .line 157
    :cond_d
    if-lez v4, :cond_e

    .line 158
    .line 159
    if-lez v2, :cond_e

    .line 160
    .line 161
    const-string p0, "\u56fe\u7247\u548c\u89c6\u9891\u4e0d\u80fd\u540c\u65f6\u8f6c\u53d1\u5230\u670b\u53cb\u5708"

    .line 162
    .line 163
    return-object p0

    .line 164
    :cond_e
    return-object v1

    .line 165
    :cond_f
    :goto_6
    const-string p0, "\u670b\u53cb\u5708\u4ec5\u652f\u6301\u6587\u5b57\u3001\u56fe\u7247\u548c\u89c6\u9891\u6d88\u606f"

    .line 166
    .line 167
    return-object p0
.end method

.method public static i(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "getType"

    .line 5
    .line 6
    invoke-static {p0, v1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Ljava/lang/Number;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Number;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v2

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    goto :goto_4

    .line 26
    :cond_1
    const-string v0, "field_type"

    .line 27
    .line 28
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    instance-of v1, v0, Ljava/lang/Number;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    check-cast v0, Ljava/lang/Number;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object v0, v2

    .line 40
    :goto_1
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    goto :goto_4

    .line 47
    :cond_3
    const-string v0, "type"

    .line 48
    .line 49
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    instance-of v0, p0, Ljava/lang/Number;

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    check-cast p0, Ljava/lang/Number;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    move-object p0, v2

    .line 61
    :goto_2
    if-eqz p0, :cond_5

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    goto :goto_3

    .line 72
    :cond_5
    move-object p0, v2

    .line 73
    :goto_3
    if-eqz p0, :cond_a

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    :goto_4
    if-gtz p0, :cond_6

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_6
    and-int/lit16 v0, p0, 0xff

    .line 83
    .line 84
    const v1, 0xffff

    .line 85
    .line 86
    .line 87
    and-int/2addr v1, p0

    .line 88
    ushr-int/lit8 v2, p0, 0x10

    .line 89
    .line 90
    if-nez v2, :cond_7

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_7
    const/16 v2, 0x2710

    .line 94
    .line 95
    if-eq v1, v2, :cond_8

    .line 96
    .line 97
    const/16 v2, 0x2712

    .line 98
    .line 99
    if-eq v1, v2, :cond_8

    .line 100
    .line 101
    if-eqz v0, :cond_9

    .line 102
    .line 103
    if-ne v1, v0, :cond_9

    .line 104
    .line 105
    move p0, v0

    .line 106
    goto :goto_5

    .line 107
    :cond_8
    move p0, v1

    .line 108
    :cond_9
    :goto_5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :cond_a
    return-object v2
.end method

.method public static m(Ljava/lang/Object;)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "size"

    .line 5
    .line 6
    invoke-static {p0, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    instance-of v2, v1, Ljava/lang/Number;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    check-cast v1, Ljava/lang/Number;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v1, v3

    .line 19
    :goto_0
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v0

    .line 27
    :goto_1
    move v2, v0

    .line 28
    :goto_2
    if-lt v2, v1, :cond_2

    .line 29
    .line 30
    return v0

    .line 31
    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v5, "getItem"

    .line 40
    .line 41
    invoke-static {p0, v5, v4}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    instance-of v5, v4, Landroid/view/MenuItem;

    .line 46
    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    check-cast v4, Landroid/view/MenuItem;

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    move-object v4, v3

    .line 53
    :goto_3
    if-eqz v4, :cond_4

    .line 54
    .line 55
    invoke-interface {v4}, Landroid/view/MenuItem;->getGroupId()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0

    .line 60
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_2
.end method


# virtual methods
.method public final d(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    iget-object v0, p0, Lca/e0;->f:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_1
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 33
    .line 34
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-object v2, p1

    .line 42
    :goto_0
    invoke-virtual {v1, v2, p2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 43
    .line 44
    .line 45
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p2

    .line 49
    new-instance v1, Lsf/f;

    .line 50
    .line 51
    invoke-direct {v1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object p2, v1

    .line 55
    :goto_1
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance p2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v0, "\u8f6c\u53d1\u83dc\u5355Hook\u5b89\u88c5\u5931\u8d25: "

    .line 72
    .line 73
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p2, p0, Lca/e0;->c:Lab/b;

    .line 84
    .line 85
    invoke-virtual {p2, p1, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 89
    .line 90
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    return p1

    .line 97
    :cond_4
    :goto_3
    const/4 p1, 0x0

    .line 98
    return p1
.end method

.method public final e(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Z)V
    .locals 9

    .line 1
    new-instance v7, Lca/l;

    .line 2
    .line 3
    invoke-direct {v7, p1, p0, p2}, Lca/l;-><init>(Landroid/app/Activity;Lca/e0;Lfg/l;)V

    .line 4
    .line 5
    .line 6
    sget-object p2, Lhb/m;->a:Lhb/l;

    .line 7
    .line 8
    invoke-static {p4}, Lhb/m;->a(Z)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v7, p2}, Lca/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-direct {v3, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    invoke-direct {v4, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 27
    .line 28
    .line 29
    new-instance p2, Lc9/h;

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-direct {p2, v4, v3, v0}, Lc9/h;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 33
    .line 34
    .line 35
    const-string v0, "\u6b63\u5728\u8f7d\u5165\u8054\u7cfb\u4eba..."

    .line 36
    .line 37
    invoke-static {p1, p2, p3, v0}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget-object p2, p0, Lca/e0;->n:Ljava/util/concurrent/ExecutorService;

    .line 42
    .line 43
    new-instance v0, Lc9/p;

    .line 44
    .line 45
    const/4 v8, 0x1

    .line 46
    move-object v1, p0

    .line 47
    move-object v6, p1

    .line 48
    move v2, p4

    .line 49
    invoke-direct/range {v0 .. v8}, Lc9/p;-><init>(Ljava/lang/Object;ZLjava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;Lfg/l;I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final f(JLandroid/app/Activity;Lfg/l;Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v4, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-direct {v5, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lc9/h;

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-direct {v0, v5, v4, v1}, Lc9/h;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 16
    .line 17
    .line 18
    const-string v1, "\u6b63\u5728\u8bfb\u53d6\u6536\u85cf..."

    .line 19
    .line 20
    invoke-static {p3, v0, p5, v1}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    new-instance v0, Lca/t;

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    move-wide v2, p1

    .line 28
    move-object v7, p3

    .line 29
    move-object v8, p4

    .line 30
    invoke-direct/range {v0 .. v8}, Lca/t;-><init>(Lca/e0;JLjava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;Lfg/l;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v1, Lca/e0;->n:Ljava/util/concurrent/ExecutorService;

    .line 34
    .line 35
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final g(Ljava/lang/Object;)J
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lca/e0;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/reflect/Method;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-array v4, v3, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v0, p1, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v4, v0, Ljava/lang/Number;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Number;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v0, v2

    .line 31
    :goto_0
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0

    .line 38
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_5

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    move-object v5, v4

    .line 61
    check-cast v5, Ljava/lang/reflect/Method;

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    array-length v6, v6

    .line 71
    if-nez v6, :cond_4

    .line 72
    .line 73
    const-string v6, "getMsgID"

    .line 74
    .line 75
    const-string v7, "getId"

    .line 76
    .line 77
    const-string v8, "getMsgId"

    .line 78
    .line 79
    filled-new-array {v8, v6, v7}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-static {v6}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_3

    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    const-class v6, Ljava/lang/Long;

    .line 114
    .line 115
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_4

    .line 120
    .line 121
    :cond_3
    const/4 v5, 0x1

    .line 122
    goto :goto_1

    .line 123
    :cond_4
    move v5, v3

    .line 124
    :goto_1
    if-eqz v5, :cond_2

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    move-object v4, v2

    .line 128
    :goto_2
    check-cast v4, Ljava/lang/reflect/Method;

    .line 129
    .line 130
    if-eqz v4, :cond_7

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v1, v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    new-array v0, v3, [Ljava/lang/Object;

    .line 140
    .line 141
    invoke-static {v4, p1, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    instance-of v1, v0, Ljava/lang/Number;

    .line 146
    .line 147
    if-eqz v1, :cond_6

    .line 148
    .line 149
    check-cast v0, Ljava/lang/Number;

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_6
    move-object v0, v2

    .line 153
    :goto_3
    if-eqz v0, :cond_7

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 156
    .line 157
    .line 158
    move-result-wide v0

    .line 159
    return-wide v0

    .line 160
    :cond_7
    const-string v0, "msgId"

    .line 161
    .line 162
    const-string v1, "msgID"

    .line 163
    .line 164
    const-string v4, "field_msgId"

    .line 165
    .line 166
    filled-new-array {v4, v0, v1}, [Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    :goto_4
    const/4 v1, 0x3

    .line 171
    if-lt v3, v1, :cond_8

    .line 172
    .line 173
    const-wide/16 v0, 0x0

    .line 174
    .line 175
    return-wide v0

    .line 176
    :cond_8
    aget-object v1, v0, v3

    .line 177
    .line 178
    invoke-static {p1, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    instance-of v4, v1, Ljava/lang/Number;

    .line 183
    .line 184
    if-eqz v4, :cond_9

    .line 185
    .line 186
    check-cast v1, Ljava/lang/Number;

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_9
    move-object v1, v2

    .line 190
    :goto_5
    if-eqz v1, :cond_a

    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 193
    .line 194
    .line 195
    move-result-wide v0

    .line 196
    return-wide v0

    .line 197
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 198
    .line 199
    goto :goto_4
.end method

.method public final j(Landroid/app/Activity;Ljava/util/List;)Lca/c0;
    .locals 13

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lca/c0;

    .line 10
    .line 11
    const-string p2, "\u672a\u627e\u5230\u9009\u4e2d\u7684\u6d88\u606f"

    .line 12
    .line 13
    invoke-direct {p1, v2, p2, v1}, Lca/c0;-><init>(Landroid/content/Intent;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/16 v5, 0x2712

    .line 35
    .line 36
    const/16 v6, 0x2710

    .line 37
    .line 38
    const v7, 0xffff

    .line 39
    .line 40
    .line 41
    if-eqz v4, :cond_5

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lhb/t;

    .line 48
    .line 49
    iget v4, v4, Lhb/t;->b:I

    .line 50
    .line 51
    if-gtz v4, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    and-int/lit16 v8, v4, 0xff

    .line 55
    .line 56
    and-int/2addr v7, v4

    .line 57
    ushr-int/lit8 v9, v4, 0x10

    .line 58
    .line 59
    if-nez v9, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    if-eq v7, v6, :cond_3

    .line 63
    .line 64
    if-eq v7, v5, :cond_3

    .line 65
    .line 66
    if-eqz v8, :cond_4

    .line 67
    .line 68
    if-ne v7, v8, :cond_4

    .line 69
    .line 70
    move v4, v8

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move v4, v7

    .line 73
    :cond_4
    :goto_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    invoke-static {v0}, Lca/e0;->h(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    new-instance p1, Lca/c0;

    .line 88
    .line 89
    invoke-direct {p1, v2, v0, v1}, Lca/c0;-><init>(Landroid/content/Intent;Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_6
    new-instance v0, Ldg/n;

    .line 94
    .line 95
    const/4 v3, 0x6

    .line 96
    invoke-direct {v0, p2, v3}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    new-instance v3, Lb4/b;

    .line 100
    .line 101
    const/16 v4, 0xa

    .line 102
    .line 103
    invoke-direct {v3, v4}, Lb4/b;-><init>(I)V

    .line 104
    .line 105
    .line 106
    new-instance v4, Lng/i;

    .line 107
    .line 108
    invoke-direct {v4, v0, v1, v3}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 109
    .line 110
    .line 111
    new-instance v0, Lb4/b;

    .line 112
    .line 113
    const/16 v3, 0xb

    .line 114
    .line 115
    invoke-direct {v0, v3}, Lb4/b;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-static {v4, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v3, Lb4/b;

    .line 123
    .line 124
    const/16 v4, 0xc

    .line 125
    .line 126
    invoke-direct {v3, v4}, Lb4/b;-><init>(I)V

    .line 127
    .line 128
    .line 129
    new-instance v4, Lng/i;

    .line 130
    .line 131
    invoke-direct {v4, v0, v1, v3}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 132
    .line 133
    .line 134
    const-string v0, "\n\n"

    .line 135
    .line 136
    const/16 v3, 0x3e

    .line 137
    .line 138
    invoke-static {v4, v0, v2, v3}, Lng/m;->V(Lng/j;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v3, Ldg/n;

    .line 143
    .line 144
    const/4 v4, 0x6

    .line 145
    invoke-direct {v3, p2, v4}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 146
    .line 147
    .line 148
    new-instance v4, Lb4/b;

    .line 149
    .line 150
    const/16 v8, 0xd

    .line 151
    .line 152
    invoke-direct {v4, v8}, Lb4/b;-><init>(I)V

    .line 153
    .line 154
    .line 155
    new-instance v8, Lng/i;

    .line 156
    .line 157
    invoke-direct {v8, v3, v1, v4}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 158
    .line 159
    .line 160
    new-instance v3, Lb0/d0;

    .line 161
    .line 162
    const/4 v4, 0x5

    .line 163
    invoke-direct {v3, p0, v4}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    invoke-static {v8, v3}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-static {v3}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    new-instance v4, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-static {v3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-eqz v9, :cond_7

    .line 192
    .line 193
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    check-cast v9, Lp8/d;

    .line 198
    .line 199
    iget-object v9, v9, Lp8/d;->a:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_7
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    :cond_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    if-eqz v8, :cond_d

    .line 214
    .line 215
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    move-object v9, v8

    .line 220
    check-cast v9, Lhb/t;

    .line 221
    .line 222
    iget v9, v9, Lhb/t;->b:I

    .line 223
    .line 224
    if-gtz v9, :cond_9

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_9
    and-int/lit16 v10, v9, 0xff

    .line 228
    .line 229
    and-int v11, v9, v7

    .line 230
    .line 231
    ushr-int/lit8 v12, v9, 0x10

    .line 232
    .line 233
    if-nez v12, :cond_a

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_a
    if-eq v11, v6, :cond_b

    .line 237
    .line 238
    if-eq v11, v5, :cond_b

    .line 239
    .line 240
    if-eqz v10, :cond_c

    .line 241
    .line 242
    if-ne v11, v10, :cond_c

    .line 243
    .line 244
    move v9, v10

    .line 245
    goto :goto_3

    .line 246
    :cond_b
    move v9, v11

    .line 247
    :cond_c
    :goto_3
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    sget-object v10, Lca/e0;->q:Ljava/util/Set;

    .line 252
    .line 253
    invoke-interface {v10, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    if-eqz v9, :cond_8

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_d
    move-object v8, v2

    .line 261
    :goto_4
    check-cast v8, Lhb/t;

    .line 262
    .line 263
    const-string p2, ""

    .line 264
    .line 265
    if-eqz v8, :cond_1a

    .line 266
    .line 267
    iget-object v5, v8, Lhb/t;->g:Lk8/t;

    .line 268
    .line 269
    if-eqz v5, :cond_e

    .line 270
    .line 271
    iget-object v5, v5, Lk8/t;->f:Ljava/lang/String;

    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_e
    move-object v5, v2

    .line 275
    :goto_5
    if-nez v5, :cond_f

    .line 276
    .line 277
    move-object v5, p2

    .line 278
    :cond_f
    iget-object v6, v8, Lhb/t;->e:Ljava/lang/String;

    .line 279
    .line 280
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    invoke-static {v5}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    new-instance v6, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    if-eqz v7, :cond_10

    .line 306
    .line 307
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    check-cast v7, Ljava/lang/String;

    .line 312
    .line 313
    invoke-static {v7, v6}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 314
    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_10
    new-instance v5, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    :cond_11
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v7

    .line 330
    if-eqz v7, :cond_12

    .line 331
    .line 332
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    move-object v9, v7

    .line 337
    check-cast v9, Ljava/lang/String;

    .line 338
    .line 339
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 340
    .line 341
    .line 342
    move-result v9

    .line 343
    if-nez v9, :cond_11

    .line 344
    .line 345
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    goto :goto_7

    .line 349
    :cond_12
    invoke-static {v5}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    invoke-static {v5}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v5

    .line 357
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    :cond_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 362
    .line 363
    .line 364
    move-result v7

    .line 365
    if-eqz v7, :cond_14

    .line 366
    .line 367
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    move-object v9, v7

    .line 372
    check-cast v9, Ljava/lang/String;

    .line 373
    .line 374
    invoke-static {v9}, Leh/a;->y(Ljava/lang/String;)Z

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    if-eqz v9, :cond_13

    .line 379
    .line 380
    goto :goto_8

    .line 381
    :cond_14
    move-object v7, v2

    .line 382
    :goto_8
    check-cast v7, Ljava/lang/String;

    .line 383
    .line 384
    if-eqz v7, :cond_15

    .line 385
    .line 386
    new-instance v5, Ljava/io/File;

    .line 387
    .line 388
    invoke-direct {v5, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    goto :goto_b

    .line 399
    :cond_15
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    if-eqz v6, :cond_19

    .line 404
    .line 405
    iget-object v6, v6, Lj8/p;->c:Lbb/b;

    .line 406
    .line 407
    if-eqz v6, :cond_19

    .line 408
    .line 409
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    :cond_16
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v7

    .line 417
    if-eqz v7, :cond_18

    .line 418
    .line 419
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v7

    .line 423
    check-cast v7, Ljava/lang/String;

    .line 424
    .line 425
    invoke-virtual {v6, v7}, Lbb/b;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v7

    .line 429
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 433
    .line 434
    .line 435
    move-result v9

    .line 436
    if-nez v9, :cond_17

    .line 437
    .line 438
    goto :goto_9

    .line 439
    :cond_17
    move-object v7, v2

    .line 440
    :goto_9
    if-eqz v7, :cond_16

    .line 441
    .line 442
    move-object v5, v7

    .line 443
    goto :goto_a

    .line 444
    :cond_18
    move-object v5, v2

    .line 445
    :goto_a
    if-nez v5, :cond_1b

    .line 446
    .line 447
    :cond_19
    move-object v5, p2

    .line 448
    goto :goto_b

    .line 449
    :cond_1a
    move-object v5, v2

    .line 450
    :cond_1b
    :goto_b
    if-nez v5, :cond_1c

    .line 451
    .line 452
    goto :goto_c

    .line 453
    :cond_1c
    move-object p2, v5

    .line 454
    :goto_c
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 455
    .line 456
    .line 457
    move-result v5

    .line 458
    if-eqz v5, :cond_1d

    .line 459
    .line 460
    goto :goto_d

    .line 461
    :cond_1d
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    :cond_1e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 466
    .line 467
    .line 468
    move-result v6

    .line 469
    if-eqz v6, :cond_1f

    .line 470
    .line 471
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v6

    .line 475
    check-cast v6, Ljava/lang/String;

    .line 476
    .line 477
    invoke-static {v6}, Leh/a;->y(Ljava/lang/String;)Z

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    if-nez v6, :cond_1e

    .line 482
    .line 483
    new-instance p1, Lca/c0;

    .line 484
    .line 485
    const-string p2, "\u90e8\u5206\u9009\u4e2d\u56fe\u7247\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 486
    .line 487
    invoke-direct {p1, v2, p2, v1}, Lca/c0;-><init>(Landroid/content/Intent;Ljava/lang/String;I)V

    .line 488
    .line 489
    .line 490
    return-object p1

    .line 491
    :cond_1f
    :goto_d
    const-string v5, "\u9009\u4e2d\u89c6\u9891\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 492
    .line 493
    if-eqz v8, :cond_20

    .line 494
    .line 495
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    if-eqz v6, :cond_20

    .line 500
    .line 501
    new-instance p1, Lca/c0;

    .line 502
    .line 503
    invoke-direct {p1, v2, v5, v1}, Lca/c0;-><init>(Landroid/content/Intent;Ljava/lang/String;I)V

    .line 504
    .line 505
    .line 506
    return-object p1

    .line 507
    :cond_20
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    if-nez v6, :cond_21

    .line 512
    .line 513
    invoke-static {p2}, Leh/a;->y(Ljava/lang/String;)Z

    .line 514
    .line 515
    .line 516
    move-result v6

    .line 517
    if-nez v6, :cond_21

    .line 518
    .line 519
    new-instance p1, Lca/c0;

    .line 520
    .line 521
    invoke-direct {p1, v2, v5, v1}, Lca/c0;-><init>(Landroid/content/Intent;Ljava/lang/String;I)V

    .line 522
    .line 523
    .line 524
    return-object p1

    .line 525
    :cond_21
    new-instance v5, Landroid/content/Intent;

    .line 526
    .line 527
    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 528
    .line 529
    .line 530
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    const-string v6, "com.tencent.mm.plugin.sns.ui.SnsUploadUI"

    .line 535
    .line 536
    invoke-virtual {v5, p1, v6}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 537
    .line 538
    .line 539
    move-result-object p1

    .line 540
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 544
    .line 545
    .line 546
    move-result v5

    .line 547
    const-string v6, "Ksnsupload_type"

    .line 548
    .line 549
    const-string v7, "Kdescription"

    .line 550
    .line 551
    if-nez v5, :cond_22

    .line 552
    .line 553
    const/16 v1, 0xe

    .line 554
    .line 555
    invoke-virtual {p1, v6, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 556
    .line 557
    .line 558
    const-string v1, "KSightPath"

    .line 559
    .line 560
    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 561
    .line 562
    .line 563
    const-string v1, "KSightThumbPath"

    .line 564
    .line 565
    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 566
    .line 567
    .line 568
    invoke-virtual {p1, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 569
    .line 570
    .line 571
    goto :goto_f

    .line 572
    :cond_22
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 573
    .line 574
    .line 575
    move-result p2

    .line 576
    if-nez p2, :cond_27

    .line 577
    .line 578
    invoke-virtual {p0, p1, v3}, Lca/e0;->l(Landroid/content/Intent;Ljava/util/List;)Z

    .line 579
    .line 580
    .line 581
    move-result p2

    .line 582
    if-nez p2, :cond_26

    .line 583
    .line 584
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 585
    .line 586
    .line 587
    move-result p2

    .line 588
    if-eqz p2, :cond_23

    .line 589
    .line 590
    goto :goto_e

    .line 591
    :cond_23
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 592
    .line 593
    .line 594
    move-result-object p2

    .line 595
    :cond_24
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    if-eqz v3, :cond_25

    .line 600
    .line 601
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    check-cast v3, Lp8/d;

    .line 606
    .line 607
    invoke-virtual {v3}, Lp8/d;->a()Z

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    if-eqz v3, :cond_24

    .line 612
    .line 613
    new-instance p1, Lca/c0;

    .line 614
    .line 615
    const-string p2, "\u5b9e\u51b5\u56fe\u7247\u89c6\u9891\u672a\u80fd\u4ea4\u7ed9\u5fae\u4fe1\u670b\u53cb\u5708\u7f16\u8f91\u5668"

    .line 616
    .line 617
    invoke-direct {p1, v2, p2, v1}, Lca/c0;-><init>(Landroid/content/Intent;Ljava/lang/String;I)V

    .line 618
    .line 619
    .line 620
    return-object p1

    .line 621
    :cond_25
    :goto_e
    new-instance p2, Ljava/util/ArrayList;

    .line 622
    .line 623
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 624
    .line 625
    .line 626
    invoke-static {v4, p2}, Ltf/m;->N1(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 627
    .line 628
    .line 629
    const-string v1, "sns_kemdia_path_list"

    .line 630
    .line 631
    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 632
    .line 633
    .line 634
    :cond_26
    invoke-virtual {p1, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 635
    .line 636
    .line 637
    goto :goto_f

    .line 638
    :cond_27
    const/16 p2, 0x9

    .line 639
    .line 640
    invoke-virtual {p1, v6, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 641
    .line 642
    .line 643
    invoke-virtual {p1, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 644
    .line 645
    .line 646
    :goto_f
    new-instance p2, Lca/c0;

    .line 647
    .line 648
    const/4 v0, 0x2

    .line 649
    invoke-direct {p2, p1, v2, v0}, Lca/c0;-><init>(Landroid/content/Intent;Ljava/lang/String;I)V

    .line 650
    .line 651
    .line 652
    return-object p2
.end method

.method public final k(Landroid/app/Activity;Lp8/v;Ljava/lang/String;Lfg/l;)V
    .locals 9

    .line 1
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-direct {v4, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lc9/h;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v4, v3, v1}, Lc9/h;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 16
    .line 17
    .line 18
    iget v1, p2, Lp8/v;->c:I

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    if-eq v1, v2, :cond_2

    .line 22
    .line 23
    const/16 v2, 0x36

    .line 24
    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x5

    .line 29
    if-eq v1, v2, :cond_2

    .line 30
    .line 31
    const/16 v2, 0xf

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-string v1, "\u6b63\u5728\u8bfb\u53d6\u670b\u53cb\u5708..."

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    const-string v1, "\u6b63\u5728\u51c6\u5907\u670b\u53cb\u5708\u5a92\u4f53..."

    .line 40
    .line 41
    :goto_1
    invoke-static {p1, v0, p3, v1}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    new-instance v0, Lca/j;

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    move-object v1, p0

    .line 49
    move-object v6, p1

    .line 50
    move-object v2, p2

    .line 51
    move-object v7, p4

    .line 52
    invoke-direct/range {v0 .. v8}, Lca/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, v1, Lca/e0;->n:Ljava/util/concurrent/ExecutorService;

    .line 56
    .line 57
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final l(Landroid/content/Intent;Ljava/util/List;)Z
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lca/e0;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v2, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-class v4, Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    const/4 v6, 0x0

    .line 25
    if-nez v5, :cond_d

    .line 26
    .line 27
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_0
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_d

    .line 44
    .line 45
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, Lp8/d;

    .line 50
    .line 51
    invoke-virtual {v7}, Lp8/d;->a()Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    :try_start_0
    const-string v5, "com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem"

    .line 58
    .line 59
    invoke-static {v5, v2}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    if-eqz v5, :cond_a

    .line 64
    .line 65
    const-string v7, "com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem"

    .line 66
    .line 67
    invoke-static {v7, v2}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eqz v2, :cond_a

    .line 72
    .line 73
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    filled-new-array {v7, v4, v4, v4}, [Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-static {v5, v8}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    if-eqz v5, :cond_a

    .line 87
    .line 88
    filled-new-array {v7, v4, v4, v4}, [Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-static {v2, v4}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-eqz v2, :cond_a

    .line 97
    .line 98
    new-instance v4, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    const/4 v9, 0x1

    .line 116
    if-eqz v8, :cond_8

    .line 117
    .line 118
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    check-cast v8, Lp8/d;

    .line 123
    .line 124
    invoke-virtual {v8}, Lp8/d;->a()Z

    .line 125
    .line 126
    .line 127
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    iget-object v11, v8, Lp8/d;->a:Ljava/lang/String;

    .line 129
    .line 130
    const/4 v12, 0x0

    .line 131
    const-string v13, "image/jpeg"

    .line 132
    .line 133
    if-eqz v10, :cond_6

    .line 134
    .line 135
    :try_start_1
    iget-object v10, v8, Lp8/d;->b:Ljava/lang/String;

    .line 136
    .line 137
    filled-new-array {v3, v10, v11, v13}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    invoke-static {v2, v10}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    if-eqz v10, :cond_5

    .line 146
    .line 147
    const-string v11, "videoDuration="

    .line 148
    .line 149
    iget v13, v8, Lp8/d;->c:I

    .line 150
    .line 151
    invoke-static {v10, v11, v13}, Lbe/h;->k0(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 152
    .line 153
    .line 154
    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    const-string v13, "Check failed."

    .line 156
    .line 157
    if-eqz v11, :cond_4

    .line 158
    .line 159
    :try_start_2
    const-string v11, "videoWidth="

    .line 160
    .line 161
    iget v14, v8, Lp8/d;->d:I

    .line 162
    .line 163
    invoke-static {v10, v11, v14}, Lbe/h;->k0(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 164
    .line 165
    .line 166
    const-string v11, "videoHeight="

    .line 167
    .line 168
    iget v14, v8, Lp8/d;->e:I

    .line 169
    .line 170
    invoke-static {v10, v11, v14}, Lbe/h;->k0(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 171
    .line 172
    .line 173
    const-string v11, "videoSize="

    .line 174
    .line 175
    iget-wide v14, v8, Lp8/d;->f:J

    .line 176
    .line 177
    const-wide/32 v16, 0x7fffffff

    .line 178
    .line 179
    .line 180
    cmp-long v8, v14, v16

    .line 181
    .line 182
    if-lez v8, :cond_2

    .line 183
    .line 184
    move-wide/from16 v14, v16

    .line 185
    .line 186
    :cond_2
    long-to-int v8, v14

    .line 187
    invoke-static {v10, v11, v8}, Lbe/h;->k0(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 188
    .line 189
    .line 190
    invoke-static {v10}, Lbe/h;->l0(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    const-string v8, "isParsedVideo="

    .line 194
    .line 195
    invoke-static {v10, v8, v9}, Lbe/h;->k0(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    if-eqz v8, :cond_3

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 203
    .line 204
    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw v0

    .line 208
    :catchall_0
    move-exception v0

    .line 209
    goto :goto_3

    .line 210
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 211
    .line 212
    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v0

    .line 216
    :cond_5
    move-object v10, v12

    .line 217
    goto :goto_1

    .line 218
    :cond_6
    filled-new-array {v3, v11, v11, v13}, [Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    invoke-static {v5, v8}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    :goto_1
    instance-of v8, v10, Landroid/os/Parcelable;

    .line 227
    .line 228
    if-eqz v8, :cond_7

    .line 229
    .line 230
    move-object v12, v10

    .line 231
    check-cast v12, Landroid/os/Parcelable;

    .line 232
    .line 233
    :cond_7
    if-eqz v12, :cond_a

    .line 234
    .line 235
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    goto :goto_0

    .line 239
    :cond_8
    const-string v2, "sns_kemdia_path_list"

    .line 240
    .line 241
    new-instance v3, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 248
    .line 249
    .line 250
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    if-eqz v7, :cond_9

    .line 259
    .line 260
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    check-cast v7, Lp8/d;

    .line 265
    .line 266
    iget-object v7, v7, Lp8/d;->a:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_9
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 273
    .line 274
    .line 275
    const-string v2, "KMulti_Pic_Item_List"

    .line 276
    .line 277
    invoke-virtual {v0, v2, v4}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 278
    .line 279
    .line 280
    const-string v2, "KSnsPostManu"

    .line 281
    .line 282
    invoke-virtual {v0, v2, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 283
    .line 284
    .line 285
    const-string v2, "Ksnsupload_type"

    .line 286
    .line 287
    invoke-virtual {v0, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 288
    .line 289
    .line 290
    move v6, v9

    .line 291
    :cond_a
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 292
    .line 293
    .line 294
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 295
    goto :goto_4

    .line 296
    :goto_3
    new-instance v2, Lsf/f;

    .line 297
    .line 298
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 299
    .line 300
    .line 301
    move-object v0, v2

    .line 302
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    if-eqz v2, :cond_b

    .line 307
    .line 308
    const-string v3, "\u6784\u9020\u670b\u53cb\u5708\u5b9e\u51b5\u7f16\u8f91\u9879\u5931\u8d25"

    .line 309
    .line 310
    iget-object v4, v1, Lca/e0;->c:Lab/b;

    .line 311
    .line 312
    invoke-virtual {v4, v3, v2}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    :cond_b
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 316
    .line 317
    instance-of v3, v0, Lsf/f;

    .line 318
    .line 319
    if-eqz v3, :cond_c

    .line 320
    .line 321
    move-object v0, v2

    .line 322
    :cond_c
    check-cast v0, Ljava/lang/Boolean;

    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    return v0

    .line 329
    :cond_d
    :goto_5
    return v6
.end method

.method public final n(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V
    .locals 10

    .line 1
    invoke-static {p4, p2}, La/a;->a1(ILjava/util/List;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {p3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    new-instance p3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

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
    move-object v2, v1

    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_2

    .line 67
    .line 68
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-static {p3}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-static {p3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-eqz p3, :cond_4

    .line 85
    .line 86
    const-string p2, "\u8bf7\u9009\u62e9\u8f6c\u53d1\u5bf9\u8c61"

    .line 87
    .line 88
    invoke-virtual {p0, p1, p2}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    new-instance p3, Lgg/u;

    .line 93
    .line 94
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 98
    .line 99
    const/4 v0, 0x0

    .line 100
    invoke-direct {v5, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    const-string v1, "Hchat_selected_messages_config"

    .line 107
    .line 108
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v3, "selected_messages_background_silent_send"

    .line 113
    .line 114
    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    :goto_2
    move-object v6, v0

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    new-instance v0, Lca/p;

    .line 124
    .line 125
    const/4 v1, 0x0

    .line 126
    invoke-direct {v0, v5, p3, v1}, Lca/p;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lgg/u;I)V

    .line 127
    .line 128
    .line 129
    const-string v1, "\u6b63\u5728\u53d1\u9001..."

    .line 130
    .line 131
    invoke-static {p1, v0, p5, v1}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    goto :goto_2

    .line 136
    :goto_3
    new-instance v3, Lca/q;

    .line 137
    .line 138
    const/4 v9, 0x0

    .line 139
    move-object v4, p0

    .line 140
    move-object v8, p1

    .line 141
    move-object v7, p5

    .line 142
    invoke-direct/range {v3 .. v9}, Lca/q;-><init>(Lca/e0;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Ljava/lang/String;Landroid/app/Activity;I)V

    .line 143
    .line 144
    .line 145
    move-object p1, v4

    .line 146
    move-object p5, v5

    .line 147
    const/4 v0, 0x0

    .line 148
    const/4 v4, 0x0

    .line 149
    move-object v1, p2

    .line 150
    move-object v5, v3

    .line 151
    move v3, v0

    .line 152
    move v0, p4

    .line 153
    invoke-static/range {v0 .. v5}, La/a;->G(ILjava/util/List;Ljava/util/List;IILfg/q;)Lhb/s;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    iput-object p2, p3, Lgg/u;->g:Ljava/lang/Object;

    .line 158
    .line 159
    if-nez p2, :cond_7

    .line 160
    .line 161
    const/4 p2, 0x1

    .line 162
    invoke-virtual {p5, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 163
    .line 164
    .line 165
    if-eqz v6, :cond_6

    .line 166
    .line 167
    invoke-interface {v6}, Lwb/kv;->close()V

    .line 168
    .line 169
    .line 170
    :cond_6
    const-string p2, " \u542f\u52a8\u5931\u8d25"

    .line 171
    .line 172
    invoke-virtual {v7, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-virtual {p0, v8, p2}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_7
    return-void
.end method

.method public final o(Landroid/app/Activity;Lhb/t;Ljava/util/List;ILjava/lang/String;)V
    .locals 10

    .line 1
    invoke-static {p2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "\u8bf7\u9009\u62e9\u53d1\u9001\u5185\u5bb9"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, La/a;->g:Lhb/k0;

    .line 17
    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    if-eq p4, v2, :cond_1

    .line 21
    .line 22
    move-object v0, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v3, v0, Lhb/k0;->c:Lhb/k;

    .line 25
    .line 26
    invoke-virtual {v3}, Lhb/k;->g()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    const-string v0, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u901a\u9053\u4e0d\u53ef\u7528"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object v3, v0, Lhb/k0;->c:Lhb/k;

    .line 36
    .line 37
    invoke-virtual {v3, p2}, Lhb/k;->o(Ljava/util/List;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    const/16 v9, 0x3e

    .line 49
    .line 50
    const-string v5, "\u3001"

    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    invoke-static/range {v4 .. v9}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v3, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u4e0d\u652f\u6301: "

    .line 59
    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    iget-object v0, v0, Lhb/k0;->c:Lhb/k;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {p2}, Lhb/k;->j(Ljava/util/List;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    const-string v0, "\u7fa4\u53d1\u52a9\u624b\u5c1a\u672a\u5c31\u7eea"

    .line 76
    .line 77
    :goto_0
    if-eqz v0, :cond_5

    .line 78
    .line 79
    invoke-virtual {p0, p1, v0}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-static {p3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v3, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_6
    new-instance p3, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_8

    .line 126
    .line 127
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    move-object v4, v3

    .line 132
    check-cast v4, Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-nez v4, :cond_7

    .line 139
    .line 140
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_8
    invoke-static {p3}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    invoke-static {p3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_9

    .line 157
    .line 158
    const-string p2, "\u8bf7\u9009\u62e9\u8f6c\u53d1\u5bf9\u8c61"

    .line 159
    .line 160
    invoke-virtual {p0, p1, p2}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_9
    new-instance v0, Lgg/u;

    .line 165
    .line 166
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 167
    .line 168
    .line 169
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 170
    .line 171
    const/4 v3, 0x0

    .line 172
    invoke-direct {v5, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 173
    .line 174
    .line 175
    const-string v4, "Hchat_selected_messages_config"

    .line 176
    .line 177
    invoke-static {p1, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    const-string v6, "selected_messages_background_silent_send"

    .line 182
    .line 183
    invoke-interface {v4, v6, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_a

    .line 188
    .line 189
    :goto_3
    move-object v6, v1

    .line 190
    goto :goto_4

    .line 191
    :cond_a
    new-instance v1, Lca/p;

    .line 192
    .line 193
    const/4 v3, 0x1

    .line 194
    invoke-direct {v1, v5, v0, v3}, Lca/p;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lgg/u;I)V

    .line 195
    .line 196
    .line 197
    const-string v3, "\u6b63\u5728\u53d1\u9001..."

    .line 198
    .line 199
    invoke-static {p1, v1, p5, v3}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    goto :goto_3

    .line 204
    :goto_4
    new-instance v3, Lca/q;

    .line 205
    .line 206
    const/4 v9, 0x1

    .line 207
    move-object v4, p0

    .line 208
    move-object v8, p1

    .line 209
    move-object v7, p5

    .line 210
    invoke-direct/range {v3 .. v9}, Lca/q;-><init>(Lca/e0;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Ljava/lang/String;Landroid/app/Activity;I)V

    .line 211
    .line 212
    .line 213
    invoke-static {p4, p2, p3, v3}, La/a;->H(ILjava/util/List;Ljava/util/List;Lfg/q;)Lhb/s;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    iput-object p1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 218
    .line 219
    if-nez p1, :cond_c

    .line 220
    .line 221
    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 222
    .line 223
    .line 224
    if-eqz v6, :cond_b

    .line 225
    .line 226
    invoke-interface {v6}, Lwb/kv;->close()V

    .line 227
    .line 228
    .line 229
    :cond_b
    const-string p1, " \u542f\u52a8\u5931\u8d25"

    .line 230
    .line 231
    invoke-virtual {v7, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p0, v8, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    :cond_c
    return-void
.end method

.method public final p(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 1
    new-instance v0, Lc9/u;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lc9/u;-><init>(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1, v0, v3, v5}, Lca/e0;->e(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final q(Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p2

    .line 8
    new-instance v0, Lsf/f;

    .line 9
    .line 10
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object p2, v0

    .line 14
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lca/e0;->c:Lab/b;

    .line 21
    .line 22
    const-string v1, "\u6253\u5f00\u670b\u53cb\u5708\u7f16\u8f91\u754c\u9762\u5931\u8d25"

    .line 23
    .line 24
    invoke-virtual {v0, v1, p2}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const-string p2, "\u670b\u53cb\u5708\u7f16\u8f91\u754c\u9762\u4e0d\u53ef\u7528"

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final r(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    invoke-static {}, Lca/e0;->b()Landroid/app/Activity;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    :goto_1
    new-instance v0, Lc9/t;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {v0, p1, p2, v1}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lca/e0;->d:Landroid/os/Handler;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_2
    return-void
.end method
