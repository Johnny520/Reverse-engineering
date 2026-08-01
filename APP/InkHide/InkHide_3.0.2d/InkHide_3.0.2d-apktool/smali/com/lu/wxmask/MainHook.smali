.class public Lcom/lu/wxmask/MainHook;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/robv/android/xposed/IXposedHookLoadPackage;
.implements Lde/robv/android/xposed/IXposedHookZygoteInit;
.implements Lde/robv/android/xposed/IXposedHookInitPackageResources;


# annotations
.annotation build Lc/a;
.end annotation


# static fields
.field private static MODULE_PATH:Ljava/lang/String; = null

.field private static final TARGET_PACKAGE:Ljava/lang/String; = "com.tencent.mm"

.field public static uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final handledProcessKeys:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private hasInit:Z

.field private initUnHookList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lde/robv/android/xposed/XC_MethodHook$Unhook;",
            ">;"
        }
    .end annotation
.end field

.field private isHookEntryHandle:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-object v0, Lcom/lu/wxmask/MainHook;->MODULE_PATH:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/lu/wxmask/MainHook;->hasInit:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/lu/wxmask/MainHook;->initUnHookList:Ljava/util/List;

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/lu/wxmask/MainHook;->isHookEntryHandle:Z

    .line 15
    .line 16
    new-instance v0, Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/lu/wxmask/MainHook;->handledProcessKeys:Ljava/util/HashSet;

    .line 22
    .line 23
    return-void
.end method

.method public static synthetic a(Ljava/lang/reflect/Method;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/lu/wxmask/MainHook;->lambda$handleLoadPackage$1(Ljava/lang/reflect/Method;Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/lu/wxmask/MainHook;->lambda$handleLoadPackage$0(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bridge synthetic c(Lcom/lu/wxmask/MainHook;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lu/wxmask/MainHook;->initPlugin(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    return-void
.end method

.method private initPlugin(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, "context is null"

    .line 4
    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean v0, p0, Lcom/lu/wxmask/MainHook;->hasInit:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string v0, "start init Plugin"

    .line 19
    .line 20
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lcom/lu/wxmask/MainHook;->hasInit:Z

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    sput-object p1, Lb1/h;->i:Landroid/content/Context;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    sput-object v0, Lb1/h;->i:Landroid/content/Context;

    .line 40
    .line 41
    :goto_0
    iget-object v0, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 42
    .line 43
    const-string v1, "com.lu.wxmask272"

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-direct {p0, p1, p2}, Lcom/lu/wxmask/MainHook;->initSelfPlugins(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-direct {p0, p1, p2}, Lcom/lu/wxmask/MainHook;->initTargetPlugins(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    iget-object p1, p0, Lcom/lu/wxmask/MainHook;->initUnHookList:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_5

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 75
    .line 76
    if-eqz p2, :cond_4

    .line 77
    .line 78
    invoke-virtual {p2}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    const-string p1, "init plugin finish"

    .line 83
    .line 84
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Li0/a;->c([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method private initSelfPlugins(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/lu/wxmask/SelfHook;->getInstance()Lcom/lu/wxmask/SelfHook;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/lu/wxmask/SelfHook;->handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private initTargetPlugins(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 9

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {}, Lz0/r;->l()Lz0/a;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    iget-boolean v4, v3, Lz0/a;->d:Z

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    iget-boolean v3, v3, Lz0/a;->e:Z

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    move v3, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v2

    .line 19
    :goto_0
    if-nez v3, :cond_1

    .line 20
    .line 21
    const-string p1, "MaskWechat integrity check failed, skip all target hooks"

    .line 22
    .line 23
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lz0/r;->B(Z)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    sget-object v3, Lz0/d;->a:Lz0/c;

    .line 35
    .line 36
    invoke-static {}, Lz0/r;->l()Lz0/a;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget-boolean v5, v4, Lz0/a;->d:Z

    .line 41
    .line 42
    if-eqz v5, :cond_b

    .line 43
    .line 44
    iget-boolean v4, v4, Lz0/a;->e:Z

    .line 45
    .line 46
    if-eqz v4, :cond_b

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-static {v4, v1}, Lz0/c;->g(Ljava/lang/Throwable;Z)Lz0/b;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget-boolean v5, v4, Lz0/b;->a:Z

    .line 57
    .line 58
    if-nez v5, :cond_3

    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_3
    invoke-static {v4}, Lz0/c;->d(Lz0/b;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    new-instance v4, Lr0/n1;

    .line 69
    .line 70
    const/16 v5, 0x14

    .line 71
    .line 72
    invoke-direct {v4, v5}, Lr0/n1;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v1, v4}, Lz0/c;->h(ZLM0/l;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    :goto_1
    new-instance v4, Lr0/n1;

    .line 79
    .line 80
    const/16 v5, 0x15

    .line 81
    .line 82
    invoke-direct {v4, v5}, Lr0/n1;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v2, v4}, Lz0/c;->h(ZLM0/l;)V

    .line 86
    .line 87
    .line 88
    iget-object v3, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v4, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    const-string v4, "context"

    .line 97
    .line 98
    if-eqz v3, :cond_7

    .line 99
    .line 100
    sget-object v3, Lz0/u;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 101
    .line 102
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sget-object v3, Lz0/u;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 106
    .line 107
    invoke-virtual {v3, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-nez v3, :cond_5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    if-nez v3, :cond_6

    .line 119
    .line 120
    move-object v3, p1

    .line 121
    :cond_6
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    new-instance v6, Lz0/s;

    .line 126
    .line 127
    invoke-direct {v6, v5, v3}, Lz0/s;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;Landroid/content/Context;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v6}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 131
    .line 132
    .line 133
    const-string v3, "runtime crash diagnostics installed"

    .line 134
    .line 135
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-static {v3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :goto_2
    invoke-static {v2}, Lz0/r;->B(Z)V

    .line 143
    .line 144
    .line 145
    :cond_7
    new-instance v3, Lq0/a;

    .line 146
    .line 147
    invoke-direct {v3, v2}, Lq0/a;-><init>(I)V

    .line 148
    .line 149
    .line 150
    new-instance v5, Lq0/g;

    .line 151
    .line 152
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 153
    .line 154
    .line 155
    new-instance v6, Lq0/f;

    .line 156
    .line 157
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 158
    .line 159
    .line 160
    iput-boolean v2, v6, Lq0/f;->a:Z

    .line 161
    .line 162
    new-instance v7, Landroid/os/Handler;

    .line 163
    .line 164
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    invoke-direct {v7, v8}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 169
    .line 170
    .line 171
    new-instance v7, Lq0/h;

    .line 172
    .line 173
    invoke-direct {v7}, Lq0/h;-><init>()V

    .line 174
    .line 175
    .line 176
    new-array v8, v0, [Le0/a;

    .line 177
    .line 178
    aput-object v3, v8, v2

    .line 179
    .line 180
    aput-object v5, v8, v1

    .line 181
    .line 182
    const/4 v3, 0x2

    .line 183
    aput-object v6, v8, v3

    .line 184
    .line 185
    const/4 v3, 0x3

    .line 186
    aput-object v7, v8, v3

    .line 187
    .line 188
    invoke-static {v8, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, [Le0/a;

    .line 193
    .line 194
    const-string v3, "plugins"

    .line 195
    .line 196
    invoke-static {v0, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    array-length v3, v0

    .line 200
    :goto_3
    if-ge v2, v3, :cond_8

    .line 201
    .line 202
    aget-object v5, v0, v2

    .line 203
    .line 204
    sget-object v6, Le0/b;->a:Ljava/util/HashMap;

    .line 205
    .line 206
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-virtual {v6, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    add-int/2addr v2, v1

    .line 214
    goto :goto_3

    .line 215
    :cond_8
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    sget-object v0, Le0/b;->a:Ljava/util/HashMap;

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    const-string v1, "<get-values>(...)"

    .line 225
    .line 226
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    :cond_9
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_a

    .line 238
    .line 239
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    check-cast v1, Le0/a;

    .line 244
    .line 245
    if-eqz v1, :cond_9

    .line 246
    .line 247
    :try_start_0
    invoke-interface {v1, p1, p2}, Le0/a;->handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 248
    .line 249
    .line 250
    goto :goto_4

    .line 251
    :catch_0
    move-exception v1

    .line 252
    const-string v2, ">>>"

    .line 253
    .line 254
    const-string v3, "plugins handleHooks"

    .line 255
    .line 256
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_a
    return-void

    .line 261
    :cond_b
    :goto_5
    const-string p1, "MaskWechat service disabled, skip all target hooks"

    .line 262
    .line 263
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    new-instance p1, Lr0/n1;

    .line 271
    .line 272
    const/16 p2, 0x13

    .line 273
    .line 274
    invoke-direct {p1, p2}, Lr0/n1;-><init>(I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v1, p1}, Lz0/c;->h(ZLM0/l;)V

    .line 278
    .line 279
    .line 280
    return-void
.end method

.method private static synthetic lambda$handleLoadPackage$0(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/reflect/InvocationTargetException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/reflect/InvocationTargetException;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    const-string v0, "MaskPlugin error"

    .line 12
    .line 13
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static synthetic lambda$handleLoadPackage$1(Ljava/lang/reflect/Method;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-class p1, Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_12

    .line 12
    .line 13
    const-class p1, Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto/16 :goto_8

    .line 22
    .line 23
    :cond_0
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 v0, 0x0

    .line 30
    if-nez p1, :cond_11

    .line 31
    .line 32
    const-class p1, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    goto/16 :goto_7

    .line 41
    .line 42
    :cond_1
    sget-object p1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_10

    .line 49
    .line 50
    const-class p1, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_2
    sget-object p1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_f

    .line 67
    .line 68
    const-class p1, Ljava/lang/Double;

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    goto/16 :goto_5

    .line 77
    .line 78
    :cond_3
    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_e

    .line 85
    .line 86
    const-class p1, Ljava/lang/Float;

    .line 87
    .line 88
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_4
    sget-object p1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-nez p1, :cond_d

    .line 102
    .line 103
    const-class p1, Ljava/lang/Byte;

    .line 104
    .line 105
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    sget-object p1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 113
    .line 114
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_c

    .line 119
    .line 120
    const-class p1, Ljava/lang/Short;

    .line 121
    .line 122
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_6

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 130
    .line 131
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-nez p1, :cond_b

    .line 136
    .line 137
    const-class p1, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_7

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    sget-object p1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 147
    .line 148
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-nez p1, :cond_a

    .line 153
    .line 154
    const-class p1, Ljava/lang/Character;

    .line 155
    .line 156
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    if-eqz p1, :cond_8

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_8
    const-class p1, [B

    .line 164
    .line 165
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    if-eqz p0, :cond_9

    .line 170
    .line 171
    new-array p0, v0, [B

    .line 172
    .line 173
    return-object p0

    .line 174
    :cond_9
    const/4 p0, 0x0

    .line 175
    return-object p0

    .line 176
    :cond_a
    :goto_0
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :cond_b
    :goto_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 182
    .line 183
    return-object p0

    .line 184
    :cond_c
    :goto_2
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :cond_d
    :goto_3
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    return-object p0

    .line 194
    :cond_e
    :goto_4
    const/4 p0, 0x0

    .line 195
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    return-object p0

    .line 200
    :cond_f
    :goto_5
    const-wide/16 p0, 0x0

    .line 201
    .line 202
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0

    .line 207
    :cond_10
    :goto_6
    const-wide/16 p0, 0x0

    .line 208
    .line 209
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    return-object p0

    .line 214
    :cond_11
    :goto_7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0

    .line 219
    :cond_12
    :goto_8
    const-string p0, ""

    .line 220
    .line 221
    return-object p0
.end method


# virtual methods
.method public handleInitPackageResources(Lde/robv/android/xposed/callbacks/XC_InitPackageResources$InitPackageResourcesParam;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lde/robv/android/xposed/callbacks/XC_InitPackageResources$InitPackageResourcesParam;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "com.lu.wxmask272"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string v0, "com.tencent.mm"

    .line 13
    .line 14
    iget-object p1, p1, Lde/robv/android/xposed/callbacks/XC_InitPackageResources$InitPackageResourcesParam;->packageName:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public handleLoadPackage(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ":"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lcom/lu/wxmask/MainHook;->handledProcessKeys:Ljava/util/HashSet;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v1, p0, Lcom/lu/wxmask/MainHook;->handledProcessKeys:Ljava/util/HashSet;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    new-instance v0, Ljava/util/HashSet;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v1, "com.lu.wxmask272"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    const-string v1, "com.tencent.mm"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object v1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    :goto_0
    return-void

    .line 63
    :cond_1
    new-instance v0, Lm0/d;

    .line 64
    .line 65
    const/16 v1, 0x19

    .line 66
    .line 67
    invoke-direct {v0, v1}, LG/d;-><init>(I)V

    .line 68
    .line 69
    .line 70
    sput-object v0, Li0/a;->a:LG/d;

    .line 71
    .line 72
    const-string v0, "start main plugin for wechat"

    .line 73
    .line 74
    iget-object v1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Lc0/f;->a:LH/a;

    .line 92
    .line 93
    sget-object v1, Lc0/e;->a:Ld0/b;

    .line 94
    .line 95
    const-class v1, Lc0/e;

    .line 96
    .line 97
    monitor-enter v1

    .line 98
    :try_start_0
    sget-object v2, Lc0/e;->a:Ld0/b;

    .line 99
    .line 100
    sput-object v2, Lc0/e;->b:Ld0/b;

    .line 101
    .line 102
    sput-object v2, Lc0/f;->b:Ld0/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    monitor-exit v1

    .line 105
    new-instance v1, LA0/a;

    .line 106
    .line 107
    const/16 v2, 0x17

    .line 108
    .line 109
    invoke-direct {v1, v2}, LA0/a;-><init>(I)V

    .line 110
    .line 111
    .line 112
    iput-object v1, v0, LH/a;->b:Ljava/lang/Object;

    .line 113
    .line 114
    new-instance v1, LA0/a;

    .line 115
    .line 116
    const/16 v2, 0x18

    .line 117
    .line 118
    invoke-direct {v1, v2}, LA0/a;-><init>(I)V

    .line 119
    .line 120
    .line 121
    iput-object v1, v0, LH/a;->c:Ljava/lang/Object;

    .line 122
    .line 123
    const-class v0, Landroid/app/Application;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 130
    .line 131
    const-string v2, "onCreate"

    .line 132
    .line 133
    new-instance v3, Lm0/e;

    .line 134
    .line 135
    invoke-direct {v3, p0, p1}, Lm0/e;-><init>(Lcom/lu/wxmask/MainHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 136
    .line 137
    .line 138
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 143
    .line 144
    invoke-interface {v4, v0, v1, v2, v3}, Ld0/a;->n(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-object v1, p0, Lcom/lu/wxmask/MainHook;->initUnHookList:Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    const-class v0, Landroid/app/Instrumentation;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iget-object v1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 160
    .line 161
    const-string v2, "callApplicationOnCreate"

    .line 162
    .line 163
    const-class v3, Landroid/app/Application;

    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    new-instance v4, Lm0/f;

    .line 170
    .line 171
    invoke-direct {v4, p0, p1}, Lm0/f;-><init>(Lcom/lu/wxmask/MainHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 172
    .line 173
    .line 174
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 179
    .line 180
    invoke-interface {v3, v0, v1, v2, p1}, Ld0/a;->n(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget-object v0, p0, Lcom/lu/wxmask/MainHook;->initUnHookList:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :catchall_0
    move-exception p1

    .line 191
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    throw p1
.end method

.method public initZygote(Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;->modulePath:Ljava/lang/String;

    .line 2
    .line 3
    sput-object p1, Lcom/lu/wxmask/MainHook;->MODULE_PATH:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

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
    sget-object v0, Lz0/r;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    sput-object p1, Lz0/r;->c:Ljava/lang/String;

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    sput-object p1, Lz0/r;->d:Lz0/a;

    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method
