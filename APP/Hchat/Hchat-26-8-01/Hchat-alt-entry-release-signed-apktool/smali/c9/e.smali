.class public final Lc9/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lc9/e;

.field public static final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc9/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc9/e;->a:Lc9/e;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    const/16 v1, 0x7510

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lc9/e;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lc9/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lc9/e;->d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 29
    .line 30
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lc9/e;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 35
    .line 36
    return-void
.end method

.method public static b(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1
    const-string v0, "com.google.android.documentsui"

    .line 2
    .line 3
    const-string v1, "com.android.documentsui"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    new-instance v2, Landroid/content/Intent;

    .line 30
    .line 31
    invoke-direct {v2, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v2

    .line 52
    new-instance v3, Lsf/f;

    .line 53
    .line 54
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    move-object v2, v3

    .line 58
    :goto_0
    nop

    .line 59
    instance-of v3, v2, Lsf/f;

    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 64
    .line 65
    :cond_1
    check-cast v2, Ljava/util/Collection;

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_0

    .line 72
    .line 73
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void
.end method

.method public static c(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_2

    .line 10
    .line 11
    :try_start_0
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x4000

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    move v2, v1

    .line 22
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-gez v3, :cond_0

    .line 27
    .line 28
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 39
    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    return-object p1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    add-int/2addr v2, v3

    .line 47
    const/high16 v4, 0x800000

    .line 48
    .line 49
    if-gt v2, v4, :cond_1

    .line 50
    .line 51
    :try_start_1
    invoke-virtual {p1, v0, v1, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const-string p1, "\u804a\u5929\u5206\u7ec4\u6587\u4ef6\u4e0d\u80fd\u8d85\u8fc7 8 MB"

    .line 56
    .line 57
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    :goto_1
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    :catchall_1
    move-exception v0

    .line 65
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    const-string p0, "\u65e0\u6cd5\u8bfb\u53d6\u6240\u9009\u6587\u4ef6"

    .line 70
    .line 71
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    return-object p0
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lc9/o2;Landroid/content/Intent;Lfg/l;Lbi/c;)V
    .locals 7

    .line 1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :goto_0
    if-eqz v1, :cond_4

    .line 8
    .line 9
    const-class v2, Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_4

    .line 16
    .line 17
    sget-object v2, Lc9/e;->d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    :try_start_0
    const-string v3, "onActivityResult"

    .line 27
    .line 28
    new-instance v4, Lb9/e;

    .line 29
    .line 30
    const/4 v5, 0x4

    .line 31
    invoke-direct {v4, p0, v5}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception v3

    .line 40
    new-instance v4, Lsf/f;

    .line 41
    .line 42
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object v3, v4

    .line 46
    :goto_1
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_2
    sget-object v2, Lc9/e;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 56
    .line 57
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_2
    :try_start_1
    const-string v3, "onDestroy"

    .line 65
    .line 66
    new-instance v4, Lba/f;

    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    invoke-direct {v4, v5}, Lba/f;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    goto :goto_3

    .line 77
    :catchall_1
    move-exception v3

    .line 78
    new-instance v4, Lsf/f;

    .line 79
    .line 80
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    move-object v3, v4

    .line 84
    :goto_3
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-eqz v3, :cond_3

    .line 89
    .line 90
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_4
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    goto :goto_0

    .line 98
    :cond_4
    const/4 v1, 0x0

    .line 99
    move v2, v1

    .line 100
    :goto_5
    sget-object v3, Lc9/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 101
    .line 102
    const/16 v4, 0xf0

    .line 103
    .line 104
    if-ge v2, v4, :cond_6

    .line 105
    .line 106
    new-instance v4, Lba/c;

    .line 107
    .line 108
    const/4 v5, 0x1

    .line 109
    invoke-direct {v4, v5}, Lba/c;-><init>(I)V

    .line 110
    .line 111
    .line 112
    sget-object v5, Lc9/e;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 113
    .line 114
    invoke-virtual {v5, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->updateAndGet(Ljava/util/function/IntUnaryOperator;)I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-nez v5, :cond_5

    .line 127
    .line 128
    goto :goto_8

    .line 129
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_6
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    check-cast v2, Ljava/lang/Iterable;

    .line 140
    .line 141
    invoke-static {v2}, Ltf/m;->D1(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Ljava/lang/Integer;

    .line 146
    .line 147
    if-eqz v2, :cond_7

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    :goto_6
    move v4, v2

    .line 154
    goto :goto_7

    .line 155
    :cond_7
    const/16 v2, 0x7510

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :goto_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    check-cast v2, Lc9/d;

    .line 167
    .line 168
    if-eqz v2, :cond_8

    .line 169
    .line 170
    new-instance v5, Lc9/p2;

    .line 171
    .line 172
    const-string v6, ""

    .line 173
    .line 174
    invoke-direct {v5, v6, v1}, Lc9/p2;-><init>(Ljava/lang/String;Z)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v5}, Lc9/d;->a(Lc9/p2;)V

    .line 178
    .line 179
    .line 180
    :cond_8
    :goto_8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    new-instance v5, Lc9/d;

    .line 185
    .line 186
    new-instance v6, Ljava/lang/ref/WeakReference;

    .line 187
    .line 188
    invoke-direct {v6, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-direct {v5, v6, p2, p4}, Lc9/d;-><init>(Ljava/lang/ref/WeakReference;Lc9/o2;Lfg/l;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    :try_start_2
    invoke-virtual {p1, p3, v4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 198
    .line 199
    .line 200
    move-object p3, v0

    .line 201
    goto :goto_9

    .line 202
    :catchall_2
    move-exception p2

    .line 203
    new-instance p3, Lsf/f;

    .line 204
    .line 205
    invoke-direct {p3, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    :goto_9
    invoke-static {p3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    if-eqz p2, :cond_b

    .line 213
    .line 214
    if-eqz p5, :cond_9

    .line 215
    .line 216
    invoke-virtual {p5}, Lbi/c;->invoke()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p3

    .line 220
    check-cast p3, Landroid/content/Intent;

    .line 221
    .line 222
    goto :goto_a

    .line 223
    :cond_9
    const/4 p3, 0x0

    .line 224
    :goto_a
    const-string p5, "\u5f53\u524d\u7cfb\u7edf\u4e0d\u652f\u6301\u9009\u62e9\u6587\u4ef6"

    .line 225
    .line 226
    if-nez p3, :cond_a

    .line 227
    .line 228
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    new-instance p1, Lc9/p2;

    .line 236
    .line 237
    invoke-direct {p1, p5, v1}, Lc9/p2;-><init>(Ljava/lang/String;Z)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p4, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    const-string p3, "[Hchat:ConversationGroup] \u542f\u52a8\u7cfb\u7edf\u6587\u6863\u9009\u62e9\u5668\u5931\u8d25: "

    .line 248
    .line 249
    invoke-static {p3, p1, p2}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    goto :goto_c

    .line 253
    :cond_a
    :try_start_3
    invoke-virtual {p1, p3, v4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 254
    .line 255
    .line 256
    goto :goto_b

    .line 257
    :catchall_3
    move-exception p1

    .line 258
    new-instance v0, Lsf/f;

    .line 259
    .line 260
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    :goto_b
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    if-eqz p1, :cond_b

    .line 268
    .line 269
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    invoke-virtual {v3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    new-instance p2, Lc9/p2;

    .line 277
    .line 278
    invoke-direct {p2, p5, v1}, Lc9/p2;-><init>(Ljava/lang/String;Z)V

    .line 279
    .line 280
    .line 281
    invoke-interface {p4, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    const-string p3, "[Hchat:ConversationGroup] \u542f\u52a8\u5907\u7528\u6587\u6863\u9009\u62e9\u5668\u5931\u8d25: "

    .line 289
    .line 290
    invoke-static {p3, p2, p1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    :cond_b
    :goto_c
    return-void
.end method
