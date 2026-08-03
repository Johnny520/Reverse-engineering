.class public final Lh/Hchat/crash/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field public static final a:Lh/Hchat/crash/g;

.field public static final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final g:Landroid/os/Handler;

.field public static volatile h:Z

.field public static volatile i:Z

.field public static volatile j:Landroid/app/Application;

.field public static volatile k:Ljava/lang/ClassLoader;

.field public static volatile l:Ljava/lang/ref/WeakReference;

.field public static volatile m:Lwb/kv;

.field public static volatile n:Ljava/lang/ref/WeakReference;

.field public static volatile o:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static p:Ljava/io/File;

.field public static q:Ljava/io/File;

.field public static r:Ljava/io/File;

.field public static s:Ljava/io/File;

.field public static t:Ljava/io/File;

.field public static u:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh/Hchat/crash/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/Hchat/crash/g;->a:Lh/Hchat/crash/g;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lh/Hchat/crash/g;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lh/Hchat/crash/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lh/Hchat/crash/g;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lh/Hchat/crash/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lh/Hchat/crash/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    new-instance v0, Landroid/os/Handler;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lh/Hchat/crash/g;->g:Landroid/os/Handler;

    .line 54
    .line 55
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lh/Hchat/crash/g;->l:Ljava/lang/ref/WeakReference;

    .line 62
    .line 63
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 64
    .line 65
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lh/Hchat/crash/g;->n:Ljava/lang/ref/WeakReference;

    .line 69
    .line 70
    const-string v0, ""

    .line 71
    .line 72
    sput-object v0, Lh/Hchat/crash/g;->u:Ljava/lang/String;

    .line 73
    .line 74
    return-void
.end method

.method public static a(Landroid/app/Application;)Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v1, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    new-instance v1, Lsf/f;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    move-object p0, v1

    .line 22
    :goto_0
    nop

    .line 23
    instance-of v1, p0, Lsf/f;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    move-object p0, v2

    .line 29
    :cond_0
    check-cast p0, Landroid/content/pm/PackageInfo;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v1, v2

    .line 37
    :goto_1
    const-string v3, ""

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    move-object v1, v3

    .line 42
    :cond_2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 43
    .line 44
    const-wide/16 v5, 0x0

    .line 45
    .line 46
    const/16 v7, 0x1c

    .line 47
    .line 48
    if-lt v4, v7, :cond_3

    .line 49
    .line 50
    if-eqz p0, :cond_4

    .line 51
    .line 52
    invoke-static {p0}, Lb0/b0;->b(Landroid/content/pm/PackageInfo;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v5

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    if-eqz p0, :cond_4

    .line 58
    .line 59
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 60
    .line 61
    int-to-long v5, p0

    .line 62
    :cond_4
    :goto_2
    if-lt v4, v7, :cond_5

    .line 63
    .line 64
    invoke-static {}, Lb0/b0;->q()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    goto :goto_5

    .line 69
    :cond_5
    :try_start_1
    new-instance p0, Ljava/io/File;

    .line 70
    .line 71
    const-string v4, "/proc/self/cmdline"

    .line 72
    .line 73
    invoke-direct {p0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object v4, Log/a;->a:Ljava/nio/charset/Charset;

    .line 77
    .line 78
    invoke-static {p0, v4}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0, v0}, Log/m;->M0(Ljava/lang/String;C)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 86
    goto :goto_3

    .line 87
    :catchall_1
    move-exception p0

    .line 88
    new-instance v0, Lsf/f;

    .line 89
    .line 90
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    move-object p0, v0

    .line 94
    :goto_3
    nop

    .line 95
    instance-of v0, p0, Lsf/f;

    .line 96
    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_6
    move-object v3, p0

    .line 101
    :goto_4
    move-object p0, v3

    .line 102
    check-cast p0, Ljava/lang/String;

    .line 103
    .line 104
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v3, "\u6a21\u5757\u7248\u672c: 5.5.6 (490)\n"

    .line 107
    .line 108
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const-string v3, "\u5fae\u4fe1\u7248\u672c: "

    .line 112
    .line 113
    const-string v4, " ("

    .line 114
    .line 115
    invoke-static {v3, v1, v4, v5, v6}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const-string v3, ")"

    .line 120
    .line 121
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const/16 v1, 0xa

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    invoke-static {}, Landroid/os/Process;->is64Bit()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_7

    .line 145
    .line 146
    const-string v5, "64"

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_7
    const-string v5, "32"

    .line 150
    .line 151
    :goto_6
    const-string v6, " (pid="

    .line 152
    .line 153
    const-string v7, ", "

    .line 154
    .line 155
    const-string v8, "\u8fdb\u7a0b: "

    .line 156
    .line 157
    invoke-static {v4, v8, p0, v6, v7}, Leh/a;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v4, " \u4f4d)"

    .line 165
    .line 166
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    sget-object p0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 180
    .line 181
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 182
    .line 183
    new-instance v5, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v6, "\u7cfb\u7edf: Android "

    .line 186
    .line 187
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string p0, " (SDK "

    .line 194
    .line 195
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    sget-object p0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 215
    .line 216
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 217
    .line 218
    new-instance v4, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-string v5, "\u8bbe\u5907: "

    .line 221
    .line 222
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string p0, " "

    .line 229
    .line 230
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    sget-object p0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 247
    .line 248
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    const/16 v3, 0x3f

    .line 252
    .line 253
    invoke-static {p0, v2, v3}, Ltf/l;->F0([Ljava/lang/Object;Lfg/l;I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    const-string v2, "ABI: "

    .line 258
    .line 259
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    sget-object p0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 270
    .line 271
    new-instance v2, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    const-string v3, "\u7cfb\u7edf\u6307\u7eb9: "

    .line 274
    .line 275
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    return-object p0
.end method

.method public static b(Landroid/app/Application;)V
    .locals 34

    .line 1
    sget-boolean v0, Lh/Hchat/crash/g;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_23

    .line 6
    .line 7
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 8
    .line 9
    sget-object v0, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 10
    .line 11
    const-string v2, "crashDir"

    .line 12
    .line 13
    if-eqz v0, :cond_3b

    .line 14
    .line 15
    const-string v4, "previous_launch"

    .line 16
    .line 17
    invoke-direct {v1, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Ljava/io/File;

    .line 21
    .line 22
    sget-object v0, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 23
    .line 24
    if-eqz v0, :cond_3a

    .line 25
    .line 26
    const-string v5, "last_native_exit"

    .line 27
    .line 28
    invoke-direct {v4, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v5, Ljava/io/File;

    .line 32
    .line 33
    sget-object v0, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 34
    .line 35
    if-eqz v0, :cond_39

    .line 36
    .line 37
    const-string v2, "last_anr_exit"

    .line 38
    .line 39
    invoke-direct {v5, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Lh/Hchat/crash/g;->i(Ljava/io/File;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v8

    .line 46
    invoke-static {v4}, Lh/Hchat/crash/g;->i(Ljava/io/File;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v10

    .line 50
    invoke-static {v5}, Lh/Hchat/crash/g;->i(Ljava/io/File;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v15

    .line 54
    sget-object v0, Lh/Hchat/crash/g;->r:Ljava/io/File;

    .line 55
    .line 56
    const-string v2, "nativePendingFile"

    .line 57
    .line 58
    if-eqz v0, :cond_38

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    const-wide/16 v17, 0x0

    .line 65
    .line 66
    const/4 v7, 0x1

    .line 67
    if-eqz v6, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 70
    .line 71
    .line 72
    move-result-wide v13

    .line 73
    cmp-long v6, v13, v17

    .line 74
    .line 75
    if-lez v6, :cond_1

    .line 76
    .line 77
    move v6, v7

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    const/4 v6, 0x0

    .line 80
    :goto_0
    if-eqz v6, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    const/4 v0, 0x0

    .line 84
    :goto_1
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 87
    .line 88
    .line 89
    move-result-wide v13

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    move-wide/from16 v13, v17

    .line 92
    .line 93
    :goto_2
    new-instance v6, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    sget-object v0, Lh/Hchat/crash/g;->s:Ljava/io/File;

    .line 99
    .line 100
    const-string v19, "pendingReportFile"

    .line 101
    .line 102
    if-eqz v0, :cond_37

    .line 103
    .line 104
    invoke-static {v0}, Lh/Hchat/crash/g;->j(Ljava/io/File;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const/16 v20, 0x0

    .line 109
    .line 110
    const-string v3, "Failed to allocate"

    .line 111
    .line 112
    const-string v12, "OutOfMemoryError"

    .line 113
    .line 114
    if-eqz v0, :cond_7

    .line 115
    .line 116
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v22

    .line 120
    if-nez v22, :cond_5

    .line 121
    .line 122
    invoke-static {v0, v12, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v22

    .line 126
    if-eqz v22, :cond_4

    .line 127
    .line 128
    invoke-static {v0, v3, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v22

    .line 132
    if-eqz v22, :cond_4

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    move/from16 v22, v7

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_5
    :goto_3
    const/16 v22, 0x0

    .line 139
    .line 140
    :goto_4
    if-eqz v22, :cond_6

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_6
    move-object/from16 v0, v20

    .line 144
    .line 145
    :goto_5
    if-eqz v0, :cond_7

    .line 146
    .line 147
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    :cond_7
    sget-object v0, Lh/Hchat/crash/g;->q:Ljava/io/File;

    .line 151
    .line 152
    const-string v22, "javaPendingFile"

    .line 153
    .line 154
    if-eqz v0, :cond_36

    .line 155
    .line 156
    invoke-static {v0}, Lh/Hchat/crash/g;->j(Ljava/io/File;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_b

    .line 161
    .line 162
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result v23

    .line 166
    if-nez v23, :cond_9

    .line 167
    .line 168
    invoke-static {v0, v12, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    if-eqz v12, :cond_8

    .line 173
    .line 174
    invoke-static {v0, v3, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_8

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_8
    move v3, v7

    .line 182
    goto :goto_7

    .line 183
    :cond_9
    :goto_6
    const/4 v3, 0x0

    .line 184
    :goto_7
    if-eqz v3, :cond_a

    .line 185
    .line 186
    goto :goto_8

    .line 187
    :cond_a
    move-object/from16 v0, v20

    .line 188
    .line 189
    :goto_8
    if-eqz v0, :cond_b

    .line 190
    .line 191
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    :cond_b
    sget-object v0, Lh/Hchat/crash/g;->r:Ljava/io/File;

    .line 195
    .line 196
    if-eqz v0, :cond_35

    .line 197
    .line 198
    invoke-static {v0}, Lh/Hchat/crash/g;->j(Ljava/io/File;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    if-eqz v3, :cond_e

    .line 203
    .line 204
    new-instance v0, Log/d;

    .line 205
    .line 206
    invoke-direct {v0, v3}, Log/d;-><init>(Ljava/lang/CharSequence;)V

    .line 207
    .line 208
    .line 209
    :goto_9
    invoke-virtual {v0}, Log/d;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    if-eqz v12, :cond_d

    .line 214
    .line 215
    invoke-virtual {v0}, Log/d;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    move-object v7, v12

    .line 220
    check-cast v7, Ljava/lang/String;

    .line 221
    .line 222
    move-object/from16 v24, v0

    .line 223
    .line 224
    const-string v0, "pid="

    .line 225
    .line 226
    move-object/from16 v25, v2

    .line 227
    .line 228
    const/4 v2, 0x0

    .line 229
    invoke-static {v7, v0, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_c

    .line 234
    .line 235
    goto :goto_a

    .line 236
    :cond_c
    move-object/from16 v0, v24

    .line 237
    .line 238
    move-object/from16 v2, v25

    .line 239
    .line 240
    const/4 v7, 0x1

    .line 241
    goto :goto_9

    .line 242
    :cond_d
    move-object/from16 v25, v2

    .line 243
    .line 244
    move-object/from16 v12, v20

    .line 245
    .line 246
    :goto_a
    check-cast v12, Ljava/lang/String;

    .line 247
    .line 248
    if-eqz v12, :cond_f

    .line 249
    .line 250
    const/16 v0, 0x3d

    .line 251
    .line 252
    invoke-static {v12, v0, v12}, Log/m;->J0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    goto :goto_b

    .line 265
    :cond_e
    move-object/from16 v25, v2

    .line 266
    .line 267
    :cond_f
    move-object/from16 v0, v20

    .line 268
    .line 269
    :goto_b
    if-nez v0, :cond_10

    .line 270
    .line 271
    const-string v0, ""

    .line 272
    .line 273
    :cond_10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-nez v2, :cond_11

    .line 278
    .line 279
    move-wide/from16 v23, v8

    .line 280
    .line 281
    const/4 v0, 0x0

    .line 282
    const/16 v21, 0x0

    .line 283
    .line 284
    goto :goto_12

    .line 285
    :cond_11
    :try_start_0
    const-string v2, "0x"

    .line 286
    .line 287
    const/4 v7, 0x1

    .line 288
    invoke-static {v0, v2, v7}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_12

    .line 293
    .line 294
    const/4 v2, 0x2

    .line 295
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    const/16 v2, 0x10

    .line 300
    .line 301
    invoke-static {v2}, La/a;->w(I)V

    .line 302
    .line 303
    .line 304
    invoke-static {v0, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 305
    .line 306
    .line 307
    move-result-wide v23

    .line 308
    goto :goto_c

    .line 309
    :catchall_0
    move-exception v0

    .line 310
    move-wide/from16 v23, v8

    .line 311
    .line 312
    goto :goto_10

    .line 313
    :cond_12
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 314
    .line 315
    .line 316
    move-result-wide v23

    .line 317
    :goto_c
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 318
    .line 319
    .line 320
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 321
    const-wide/16 v26, 0x1

    .line 322
    .line 323
    cmp-long v2, v26, v23

    .line 324
    .line 325
    if-gtz v2, :cond_13

    .line 326
    .line 327
    const-wide/32 v26, 0x7fffffff

    .line 328
    .line 329
    .line 330
    cmp-long v2, v23, v26

    .line 331
    .line 332
    if-gtz v2, :cond_13

    .line 333
    .line 334
    goto :goto_d

    .line 335
    :cond_13
    move-object/from16 v0, v20

    .line 336
    .line 337
    :goto_d
    if-eqz v0, :cond_14

    .line 338
    .line 339
    move-wide/from16 v23, v8

    .line 340
    .line 341
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 342
    .line 343
    .line 344
    move-result-wide v7

    .line 345
    long-to-int v0, v7

    .line 346
    goto :goto_e

    .line 347
    :catchall_1
    move-exception v0

    .line 348
    goto :goto_10

    .line 349
    :cond_14
    move-wide/from16 v23, v8

    .line 350
    .line 351
    const/4 v0, 0x0

    .line 352
    :goto_e
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 353
    .line 354
    .line 355
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 356
    :goto_f
    const/16 v21, 0x0

    .line 357
    .line 358
    goto :goto_11

    .line 359
    :goto_10
    new-instance v7, Lsf/f;

    .line 360
    .line 361
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 362
    .line 363
    .line 364
    move-object v0, v7

    .line 365
    goto :goto_f

    .line 366
    :goto_11
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object v7

    .line 370
    instance-of v8, v0, Lsf/f;

    .line 371
    .line 372
    if-eqz v8, :cond_15

    .line 373
    .line 374
    move-object v0, v7

    .line 375
    :cond_15
    check-cast v0, Ljava/lang/Number;

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    :goto_12
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 382
    .line 383
    const/16 v8, 0x1e

    .line 384
    .line 385
    if-ge v7, v8, :cond_16

    .line 386
    .line 387
    move-wide/from16 v32, v23

    .line 388
    .line 389
    move-object/from16 v24, v3

    .line 390
    .line 391
    move v3, v8

    .line 392
    move-wide/from16 v8, v32

    .line 393
    .line 394
    move-object v2, v6

    .line 395
    move-wide v12, v13

    .line 396
    move-object/from16 v14, v20

    .line 397
    .line 398
    goto :goto_15

    .line 399
    :cond_16
    move-object v7, v6

    .line 400
    :try_start_2
    sget-object v6, Lh/Hchat/crash/CrashExitInfoApi30;->INSTANCE:Lh/Hchat/crash/CrashExitInfoApi30;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 401
    .line 402
    move-wide/from16 v32, v23

    .line 403
    .line 404
    move-object/from16 v24, v3

    .line 405
    .line 406
    move v3, v8

    .line 407
    move-wide/from16 v8, v32

    .line 408
    .line 409
    move-object v2, v7

    .line 410
    move-wide v12, v13

    .line 411
    move-object/from16 v7, p0

    .line 412
    .line 413
    move v14, v0

    .line 414
    :try_start_3
    invoke-virtual/range {v6 .. v14}, Lh/Hchat/crash/CrashExitInfoApi30;->findNativeExit(Landroid/app/Application;JJJI)Lh/Hchat/crash/h;

    .line 415
    .line 416
    .line 417
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 418
    goto :goto_14

    .line 419
    :catchall_2
    move-exception v0

    .line 420
    goto :goto_13

    .line 421
    :catchall_3
    move-exception v0

    .line 422
    move-wide/from16 v32, v23

    .line 423
    .line 424
    move-object/from16 v24, v3

    .line 425
    .line 426
    move v3, v8

    .line 427
    move-wide/from16 v8, v32

    .line 428
    .line 429
    move-object v2, v7

    .line 430
    move-wide v12, v13

    .line 431
    :goto_13
    new-instance v6, Lsf/f;

    .line 432
    .line 433
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 434
    .line 435
    .line 436
    move-object v0, v6

    .line 437
    :goto_14
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    if-eqz v6, :cond_17

    .line 442
    .line 443
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    const-string v10, "[Hchat:Crash] \u8bfb\u53d6\u7cfb\u7edf Native \u9000\u51fa\u8bb0\u5f55\u5931\u8d25: "

    .line 448
    .line 449
    invoke-static {v10, v7, v6}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 450
    .line 451
    .line 452
    :cond_17
    instance-of v6, v0, Lsf/f;

    .line 453
    .line 454
    if-eqz v6, :cond_18

    .line 455
    .line 456
    move-object/from16 v0, v20

    .line 457
    .line 458
    :cond_18
    check-cast v0, Lh/Hchat/crash/h;

    .line 459
    .line 460
    move-object v14, v0

    .line 461
    :goto_15
    const-string v6, "\u65f6\u95f4: "

    .line 462
    .line 463
    const/16 v7, 0xa

    .line 464
    .line 465
    if-eqz v24, :cond_19

    .line 466
    .line 467
    invoke-static/range {v24 .. v24}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    if-eqz v0, :cond_1a

    .line 472
    .line 473
    :cond_19
    if-eqz v14, :cond_24

    .line 474
    .line 475
    :cond_1a
    if-eqz v14, :cond_1d

    .line 476
    .line 477
    iget-wide v10, v14, Lh/Hchat/crash/h;->a:J

    .line 478
    .line 479
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    cmp-long v10, v10, v17

    .line 484
    .line 485
    if-lez v10, :cond_1b

    .line 486
    .line 487
    const/4 v10, 0x1

    .line 488
    goto :goto_16

    .line 489
    :cond_1b
    move/from16 v10, v21

    .line 490
    .line 491
    :goto_16
    if-eqz v10, :cond_1c

    .line 492
    .line 493
    goto :goto_17

    .line 494
    :cond_1c
    move-object/from16 v0, v20

    .line 495
    .line 496
    :goto_17
    if-eqz v0, :cond_1d

    .line 497
    .line 498
    :goto_18
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 499
    .line 500
    .line 501
    move-result-wide v10

    .line 502
    goto :goto_1b

    .line 503
    :cond_1d
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    cmp-long v10, v12, v17

    .line 508
    .line 509
    if-lez v10, :cond_1e

    .line 510
    .line 511
    const/16 v23, 0x1

    .line 512
    .line 513
    goto :goto_19

    .line 514
    :cond_1e
    move/from16 v23, v21

    .line 515
    .line 516
    :goto_19
    if-eqz v23, :cond_1f

    .line 517
    .line 518
    goto :goto_1a

    .line 519
    :cond_1f
    move-object/from16 v0, v20

    .line 520
    .line 521
    :goto_1a
    if-eqz v0, :cond_20

    .line 522
    .line 523
    goto :goto_18

    .line 524
    :cond_20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 525
    .line 526
    .line 527
    move-result-wide v10

    .line 528
    :goto_1b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 529
    .line 530
    const-string v12, "Hchat \u6355\u83b7\u5230 Native \u5c42\u5f02\u5e38\n"

    .line 531
    .line 532
    invoke-direct {v0, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    invoke-static {v10, v11}, Lh/Hchat/crash/g;->f(J)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v10

    .line 539
    invoke-virtual {v6, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v10

    .line 543
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    sget-object v10, Lh/Hchat/crash/g;->u:Ljava/lang/String;

    .line 550
    .line 551
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    if-eqz v24, :cond_22

    .line 555
    .line 556
    invoke-static/range {v24 .. v24}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 557
    .line 558
    .line 559
    move-result v10

    .line 560
    if-eqz v10, :cond_21

    .line 561
    .line 562
    goto :goto_1c

    .line 563
    :cond_21
    const-string v10, "\n--- Native \u4fe1\u53f7\u8bb0\u5f55 ---\n"

    .line 564
    .line 565
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-static/range {v24 .. v24}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 569
    .line 570
    .line 571
    move-result-object v10

    .line 572
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v10

    .line 576
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    :cond_22
    :goto_1c
    if-eqz v14, :cond_23

    .line 583
    .line 584
    const-string v10, "\n--- Android \u9000\u51fa\u8bb0\u5f55 ---\n"

    .line 585
    .line 586
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    iget-object v10, v14, Lh/Hchat/crash/h;->b:Ljava/lang/String;

    .line 590
    .line 591
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    :cond_23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-static {v0}, Log/m;->T0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    :cond_24
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 610
    .line 611
    if-ge v0, v3, :cond_25

    .line 612
    .line 613
    move-object v3, v6

    .line 614
    move v12, v7

    .line 615
    move-object/from16 v0, v20

    .line 616
    .line 617
    goto :goto_1f

    .line 618
    :cond_25
    move-object v3, v6

    .line 619
    :try_start_4
    sget-object v6, Lh/Hchat/crash/CrashExitInfoApi30;->INSTANCE:Lh/Hchat/crash/CrashExitInfoApi30;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 620
    .line 621
    move v12, v7

    .line 622
    move-wide v10, v15

    .line 623
    move-object/from16 v7, p0

    .line 624
    .line 625
    :try_start_5
    invoke-virtual/range {v6 .. v11}, Lh/Hchat/crash/CrashExitInfoApi30;->findAnrExit(Landroid/app/Application;JJ)Lh/Hchat/crash/h;

    .line 626
    .line 627
    .line 628
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 629
    goto :goto_1e

    .line 630
    :catchall_4
    move-exception v0

    .line 631
    goto :goto_1d

    .line 632
    :catchall_5
    move-exception v0

    .line 633
    move v12, v7

    .line 634
    :goto_1d
    new-instance v6, Lsf/f;

    .line 635
    .line 636
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 637
    .line 638
    .line 639
    move-object v0, v6

    .line 640
    :goto_1e
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 641
    .line 642
    .line 643
    move-result-object v6

    .line 644
    if-eqz v6, :cond_26

    .line 645
    .line 646
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v7

    .line 650
    const-string v8, "[Hchat:Crash] \u8bfb\u53d6\u7cfb\u7edf ANR \u9000\u51fa\u8bb0\u5f55\u5931\u8d25: "

    .line 651
    .line 652
    invoke-static {v8, v7, v6}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 653
    .line 654
    .line 655
    :cond_26
    instance-of v6, v0, Lsf/f;

    .line 656
    .line 657
    if-eqz v6, :cond_27

    .line 658
    .line 659
    move-object/from16 v0, v20

    .line 660
    .line 661
    :cond_27
    check-cast v0, Lh/Hchat/crash/h;

    .line 662
    .line 663
    :goto_1f
    if-eqz v0, :cond_28

    .line 664
    .line 665
    new-instance v6, Ljava/lang/StringBuilder;

    .line 666
    .line 667
    const-string v7, "Hchat \u6355\u83b7\u5230 ANR \u5f02\u5e38\n"

    .line 668
    .line 669
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    iget-wide v7, v0, Lh/Hchat/crash/h;->a:J

    .line 673
    .line 674
    invoke-static {v7, v8}, Lh/Hchat/crash/g;->f(J)Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v7

    .line 678
    invoke-virtual {v3, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v3

    .line 682
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    sget-object v3, Lh/Hchat/crash/g;->u:Ljava/lang/String;

    .line 689
    .line 690
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 691
    .line 692
    .line 693
    const-string v3, "\n--- Android ANR \u9000\u51fa\u8bb0\u5f55 ---\n"

    .line 694
    .line 695
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 696
    .line 697
    .line 698
    iget-object v3, v0, Lh/Hchat/crash/h;->b:Ljava/lang/String;

    .line 699
    .line 700
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    invoke-static {v3}, Log/m;->T0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 708
    .line 709
    .line 710
    move-result-object v3

    .line 711
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v3

    .line 715
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    :cond_28
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 719
    .line 720
    .line 721
    move-result v3

    .line 722
    if-nez v3, :cond_2f

    .line 723
    .line 724
    sget-object v3, Lh/Hchat/crash/g;->s:Ljava/io/File;

    .line 725
    .line 726
    if-eqz v3, :cond_2e

    .line 727
    .line 728
    new-instance v6, Ljava/util/ArrayList;

    .line 729
    .line 730
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 731
    .line 732
    .line 733
    new-instance v7, Log/g;

    .line 734
    .line 735
    invoke-direct {v7, v2}, Log/g;-><init>(Ljava/util/List;)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v7}, Log/g;->iterator()Ljava/util/Iterator;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    move/from16 v12, v21

    .line 743
    .line 744
    :cond_29
    :goto_20
    move-object v7, v2

    .line 745
    check-cast v7, Ltf/z;

    .line 746
    .line 747
    iget-object v8, v7, Ltf/z;->h:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v8, Ljava/util/ListIterator;

    .line 750
    .line 751
    invoke-interface {v8}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 752
    .line 753
    .line 754
    move-result v8

    .line 755
    if-eqz v8, :cond_2d

    .line 756
    .line 757
    iget-object v7, v7, Ltf/z;->h:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v7, Ljava/util/ListIterator;

    .line 760
    .line 761
    invoke-interface {v7}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v7

    .line 765
    check-cast v7, Ljava/lang/String;

    .line 766
    .line 767
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 768
    .line 769
    .line 770
    move-result-object v7

    .line 771
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v7

    .line 775
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 776
    .line 777
    .line 778
    move-result v8

    .line 779
    if-nez v8, :cond_2a

    .line 780
    .line 781
    goto :goto_20

    .line 782
    :cond_2a
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 783
    .line 784
    .line 785
    move-result v8

    .line 786
    if-eqz v8, :cond_2b

    .line 787
    .line 788
    move/from16 v8, v21

    .line 789
    .line 790
    goto :goto_21

    .line 791
    :cond_2b
    const/16 v8, 0x22

    .line 792
    .line 793
    :goto_21
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 794
    .line 795
    .line 796
    move-result v9

    .line 797
    add-int/2addr v9, v12

    .line 798
    add-int/2addr v9, v8

    .line 799
    const/high16 v10, 0x100000

    .line 800
    .line 801
    if-gt v9, v10, :cond_2c

    .line 802
    .line 803
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 807
    .line 808
    .line 809
    move-result v7

    .line 810
    add-int/2addr v7, v8

    .line 811
    add-int/2addr v7, v12

    .line 812
    move v12, v7

    .line 813
    goto :goto_20

    .line 814
    :cond_2c
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 815
    .line 816
    .line 817
    move-result v8

    .line 818
    if-eqz v8, :cond_29

    .line 819
    .line 820
    const v2, 0xfffea

    .line 821
    .line 822
    .line 823
    invoke-static {v2, v7}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    const-string v7, "\n\n[\u5f02\u5e38\u65e5\u5fd7\u8d85\u8fc7\u4fdd\u5b58\u4e0a\u9650\uff0c\u540e\u7eed\u5185\u5bb9\u5df2\u622a\u65ad]"

    .line 828
    .line 829
    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    :cond_2d
    new-instance v2, Ltf/a0;

    .line 837
    .line 838
    invoke-direct {v2, v6}, Ltf/a0;-><init>(Ljava/util/ArrayList;)V

    .line 839
    .line 840
    .line 841
    const/16 v30, 0x0

    .line 842
    .line 843
    const/16 v31, 0x3e

    .line 844
    .line 845
    const-string v27, "\n\n==============================\n\n"

    .line 846
    .line 847
    const/16 v28, 0x0

    .line 848
    .line 849
    const/16 v29, 0x0

    .line 850
    .line 851
    move-object/from16 v26, v2

    .line 852
    .line 853
    invoke-static/range {v26 .. v31}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    invoke-static {v3, v2}, Lh/Hchat/crash/g;->l(Ljava/io/File;Ljava/lang/String;)Z

    .line 858
    .line 859
    .line 860
    move-result v2

    .line 861
    if-eqz v2, :cond_32

    .line 862
    .line 863
    goto :goto_22

    .line 864
    :cond_2e
    invoke-static/range {v19 .. v19}, Lgg/l;->g(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    throw v20

    .line 868
    :cond_2f
    :goto_22
    if-eqz v14, :cond_30

    .line 869
    .line 870
    iget-wide v2, v14, Lh/Hchat/crash/h;->a:J

    .line 871
    .line 872
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    invoke-static {v4, v2}, Lh/Hchat/crash/g;->l(Ljava/io/File;Ljava/lang/String;)Z

    .line 877
    .line 878
    .line 879
    :cond_30
    if-eqz v0, :cond_31

    .line 880
    .line 881
    iget-wide v2, v0, Lh/Hchat/crash/h;->a:J

    .line 882
    .line 883
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    invoke-static {v5, v0}, Lh/Hchat/crash/g;->l(Ljava/io/File;Ljava/lang/String;)Z

    .line 888
    .line 889
    .line 890
    :cond_31
    sget-object v0, Lh/Hchat/crash/g;->q:Ljava/io/File;

    .line 891
    .line 892
    if-eqz v0, :cond_34

    .line 893
    .line 894
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 895
    .line 896
    .line 897
    sget-object v0, Lh/Hchat/crash/g;->r:Ljava/io/File;

    .line 898
    .line 899
    if-eqz v0, :cond_33

    .line 900
    .line 901
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 902
    .line 903
    .line 904
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 905
    .line 906
    .line 907
    move-result-wide v2

    .line 908
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    invoke-static {v1, v0}, Lh/Hchat/crash/g;->l(Ljava/io/File;Ljava/lang/String;)Z

    .line 913
    .line 914
    .line 915
    :cond_32
    :goto_23
    return-void

    .line 916
    :cond_33
    invoke-static/range {v25 .. v25}, Lgg/l;->g(Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    throw v20

    .line 920
    :cond_34
    invoke-static/range {v22 .. v22}, Lgg/l;->g(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    throw v20

    .line 924
    :cond_35
    move-object/from16 v25, v2

    .line 925
    .line 926
    invoke-static/range {v25 .. v25}, Lgg/l;->g(Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    throw v20

    .line 930
    :cond_36
    invoke-static/range {v22 .. v22}, Lgg/l;->g(Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    throw v20

    .line 934
    :cond_37
    const/16 v20, 0x0

    .line 935
    .line 936
    invoke-static/range {v19 .. v19}, Lgg/l;->g(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    throw v20

    .line 940
    :cond_38
    move-object/from16 v25, v2

    .line 941
    .line 942
    const/16 v20, 0x0

    .line 943
    .line 944
    invoke-static/range {v25 .. v25}, Lgg/l;->g(Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    throw v20

    .line 948
    :cond_39
    const/16 v20, 0x0

    .line 949
    .line 950
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    throw v20

    .line 954
    :cond_3a
    const/16 v20, 0x0

    .line 955
    .line 956
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    throw v20

    .line 960
    :cond_3b
    const/16 v20, 0x0

    .line 961
    .line 962
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    throw v20
.end method

.method public static c()V
    .locals 9

    .line 1
    sget-object v0, Lh/Hchat/crash/g;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    sget-object v0, Lh/Hchat/crash/g;->m:Lwb/kv;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Lwb/kv;->close()V

    .line 14
    .line 15
    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    sput-object v0, Lh/Hchat/crash/g;->m:Lwb/kv;

    .line 18
    .line 19
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lh/Hchat/crash/g;->n:Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    sput-object v0, Lh/Hchat/crash/g;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    sget-object v2, Lh/Hchat/crash/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 31
    .line 32
    .line 33
    sget-object v2, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 34
    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    sget-object v2, Lh/Hchat/crash/g;->q:Ljava/io/File;

    .line 39
    .line 40
    if-eqz v2, :cond_9

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 43
    .line 44
    .line 45
    sget-object v2, Lh/Hchat/crash/g;->r:Ljava/io/File;

    .line 46
    .line 47
    if-eqz v2, :cond_8

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 50
    .line 51
    .line 52
    sget-object v2, Lh/Hchat/crash/g;->s:Ljava/io/File;

    .line 53
    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 57
    .line 58
    .line 59
    sget-object v2, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 60
    .line 61
    const-string v3, "crashDir"

    .line 62
    .line 63
    if-eqz v2, :cond_6

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    array-length v4, v2

    .line 72
    move v5, v1

    .line 73
    :goto_0
    if-ge v5, v4, :cond_4

    .line 74
    .line 75
    aget-object v6, v2, v5

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    const-string v8, ".tmp-"

    .line 85
    .line 86
    invoke-static {v7, v8, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_3

    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 93
    .line 94
    .line 95
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    new-instance v1, Ljava/io/File;

    .line 99
    .line 100
    sget-object v2, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 101
    .line 102
    if-eqz v2, :cond_5

    .line 103
    .line 104
    const-string v0, "previous_launch"

    .line 105
    .line 106
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide v2

    .line 113
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v1, v0}, Lh/Hchat/crash/g;->l(Ljava/io/File;Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_5
    invoke-static {v3}, Lgg/l;->g(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v0

    .line 125
    :cond_6
    invoke-static {v3}, Lgg/l;->g(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :cond_7
    const-string v1, "pendingReportFile"

    .line 130
    .line 131
    invoke-static {v1}, Lgg/l;->g(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v0

    .line 135
    :cond_8
    const-string v1, "nativePendingFile"

    .line 136
    .line 137
    invoke-static {v1}, Lgg/l;->g(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_9
    const-string v1, "javaPendingFile"

    .line 142
    .line 143
    invoke-static {v1}, Lgg/l;->g(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0
.end method

.method public static d()V
    .locals 2

    .line 1
    sget-boolean v0, Lh/Hchat/crash/g;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-object v0, Lh/Hchat/crash/g;->q:Ljava/io/File;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v1, v0, Lh/Hchat/crash/f;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v1, Lh/Hchat/crash/f;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lh/Hchat/crash/f;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    :goto_0
    return-void
.end method

.method public static e()V
    .locals 4

    .line 1
    sget-boolean v0, Lh/Hchat/crash/g;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    sget-boolean v0, Lh/Hchat/crash/g;->h:Z

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    sget-object v0, Lh/Hchat/crash/g;->r:Ljava/io/File;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lh/Hchat/crash/NativeCrashBridge;->install(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    new-instance v1, Lsf/f;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v1

    .line 34
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    instance-of v2, v0, Lsf/f;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-object v1, v0

    .line 42
    :goto_1
    check-cast v1, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v2, 0x0

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    sget-object v0, Lh/Hchat/crash/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    sget-object v1, Lh/Hchat/crash/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "[Hchat:Crash] Native \u6355\u83b7\u5668\u5b89\u88c5\u5931\u8d25: "

    .line 77
    .line 78
    invoke-static {v2, v1, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    const-string v0, "[Hchat:Crash] Native \u6355\u83b7\u5668\u672a\u80fd\u63a5\u7ba1\u5168\u90e8\u5d29\u6e83\u4fe1\u53f7"

    .line 83
    .line 84
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    :goto_2
    return-void
.end method

.method public static f(J)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd HH:mm:ss.SSS"

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/Date;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public static final g(Landroid/app/Application;Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    sget-object v0, Lh/Hchat/crash/g;->a:Lh/Hchat/crash/g;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sput-object p0, Lh/Hchat/crash/g;->j:Landroid/app/Application;

    .line 7
    .line 8
    sput-object p1, Lh/Hchat/crash/g;->k:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    invoke-static {p0}, Lh/Hchat/crash/g;->h(Landroid/app/Application;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lh/Hchat/crash/g;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    sget-boolean v1, Lh/Hchat/crash/g;->i:Z

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-static {}, Lh/Hchat/crash/g;->c()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    sget-object v1, Lh/Hchat/crash/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-static {}, Lh/Hchat/crash/g;->d()V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lh/Hchat/crash/g;->e()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    :try_start_0
    invoke-static {p0}, Lh/Hchat/crash/g;->b(Landroid/app/Application;)V

    .line 48
    .line 49
    .line 50
    const-string v1, "libhchat_crash.so"

    .line 51
    .line 52
    const-string v4, "hchat_crash"

    .line 53
    .line 54
    invoke-static {p0, p1, v1, v4, v3}, Lsb/a;->d(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    sput-boolean p1, Lh/Hchat/crash/g;->h:Z

    .line 59
    .line 60
    invoke-static {}, Lh/Hchat/crash/g;->e()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lh/Hchat/crash/g;->g:Landroid/os/Handler;

    .line 67
    .line 68
    new-instance p1, Lh/Hchat/crash/e;

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-direct {p1, v0}, Lh/Hchat/crash/e;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    new-instance p1, Lsf/f;

    .line 85
    .line 86
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    move-object p0, p1

    .line 90
    :goto_0
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    sget-object p1, Lh/Hchat/crash/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 97
    .line 98
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v0, "[Hchat:Crash] \u521d\u59cb\u5316\u5931\u8d25: "

    .line 106
    .line 107
    invoke-static {v0, p1, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    :goto_1
    return-void
.end method

.method public static final h(Landroid/app/Application;)V
    .locals 6

    .line 1
    sput-object p0, Lh/Hchat/crash/g;->j:Landroid/app/Application;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :try_start_0
    const-string v1, "Hchat_crash_report_config"

    .line 5
    .line 6
    invoke-static {p0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "crash_report_enable"

    .line 11
    .line 12
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    new-instance v2, Lsf/f;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object v1, v2

    .line 28
    :goto_0
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, "[Hchat:Crash] \u8bfb\u53d6\u5f02\u5e38\u6355\u83b7\u8bbe\u7f6e\u5931\u8d25: "

    .line 39
    .line 40
    invoke-static {v4, v3, v2}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 44
    .line 45
    instance-of v3, v1, Lsf/f;

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    move-object v1, v2

    .line 50
    :cond_1
    check-cast v1, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    sput-boolean v1, Lh/Hchat/crash/g;->i:Z

    .line 57
    .line 58
    sget-object v1, Lh/Hchat/crash/g;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    sget-boolean p0, Lh/Hchat/crash/g;->i:Z

    .line 68
    .line 69
    if-eqz p0, :cond_8

    .line 70
    .line 71
    invoke-static {}, Lh/Hchat/crash/g;->d()V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_2
    :try_start_1
    new-instance v1, Ljava/io/File;

    .line 77
    .line 78
    invoke-static {p0}, Lub/b;->d(Landroid/content/Context;)Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const-string v3, "crash"

    .line 83
    .line 84
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 88
    .line 89
    .line 90
    sput-object v1, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 91
    .line 92
    new-instance v1, Ljava/io/File;

    .line 93
    .line 94
    sget-object v2, Lh/Hchat/crash/g;->p:Ljava/io/File;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    .line 96
    const/4 v3, 0x0

    .line 97
    const-string v4, "crashDir"

    .line 98
    .line 99
    if-eqz v2, :cond_7

    .line 100
    .line 101
    :try_start_2
    const-string v5, "pending_java.log"

    .line 102
    .line 103
    invoke-direct {v1, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    sput-object v1, Lh/Hchat/crash/g;->q:Ljava/io/File;

    .line 107
    .line 108
    new-instance v1, Ljava/io/File;

    .line 109
    .line 110
    sget-object v2, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 111
    .line 112
    if-eqz v2, :cond_6

    .line 113
    .line 114
    const-string v5, "pending_native.log"

    .line 115
    .line 116
    invoke-direct {v1, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    sput-object v1, Lh/Hchat/crash/g;->r:Ljava/io/File;

    .line 120
    .line 121
    new-instance v1, Ljava/io/File;

    .line 122
    .line 123
    sget-object v2, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 124
    .line 125
    if-eqz v2, :cond_5

    .line 126
    .line 127
    const-string v5, "pending_report.log"

    .line 128
    .line 129
    invoke-direct {v1, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    sput-object v1, Lh/Hchat/crash/g;->s:Ljava/io/File;

    .line 133
    .line 134
    new-instance v1, Ljava/io/File;

    .line 135
    .line 136
    sget-object v2, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 137
    .line 138
    if-eqz v2, :cond_4

    .line 139
    .line 140
    const-string v3, "last_crash.log"

    .line 141
    .line 142
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    sput-object v1, Lh/Hchat/crash/g;->t:Ljava/io/File;

    .line 146
    .line 147
    invoke-static {p0}, Lh/Hchat/crash/g;->a(Landroid/app/Application;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    sput-object p0, Lh/Hchat/crash/g;->u:Ljava/lang/String;

    .line 152
    .line 153
    sget-boolean p0, Lh/Hchat/crash/g;->i:Z

    .line 154
    .line 155
    if-eqz p0, :cond_3

    .line 156
    .line 157
    invoke-static {}, Lh/Hchat/crash/g;->d()V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :catchall_1
    move-exception p0

    .line 162
    goto :goto_2

    .line 163
    :cond_3
    :goto_1
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_4
    invoke-static {v4}, Lgg/l;->g(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v3

    .line 170
    :cond_5
    invoke-static {v4}, Lgg/l;->g(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v3

    .line 174
    :cond_6
    invoke-static {v4}, Lgg/l;->g(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v3

    .line 178
    :cond_7
    invoke-static {v4}, Lgg/l;->g(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 182
    :goto_2
    new-instance v1, Lsf/f;

    .line 183
    .line 184
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    move-object p0, v1

    .line 188
    :goto_3
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    if-eqz p0, :cond_8

    .line 193
    .line 194
    sget-object v1, Lh/Hchat/crash/g;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 195
    .line 196
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    const-string v1, "[Hchat:Crash] Java \u6355\u83b7\u5668\u521d\u59cb\u5316\u5931\u8d25: "

    .line 204
    .line 205
    invoke-static {v1, v0, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    :cond_8
    :goto_4
    return-void
.end method

.method public static i(Ljava/io/File;)J
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-static {p0, v0}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    new-instance v0, Lsf/f;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object p0, v0

    .line 31
    :goto_0
    const-wide/16 v0, 0x0

    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    instance-of v1, p0, Lsf/f;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    move-object p0, v0

    .line 42
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    return-wide v0
.end method

.method public static j(Ljava/io/File;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    .line 14
    :try_start_1
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x2000

    .line 20
    .line 21
    new-array v3, v2, [B

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    move v5, v4

    .line 25
    :goto_0
    const/high16 v6, 0x100000

    .line 26
    .line 27
    if-ge v5, v6, :cond_2

    .line 28
    .line 29
    sub-int/2addr v6, v5

    .line 30
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {v0, v3, v4, v6}, Ljava/io/FileInputStream;->read([BII)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-gtz v6, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p0, v3, v4, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 42
    .line 43
    .line 44
    add-int/2addr v5, v6

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-direct {v3, p0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    .line 65
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    .line 67
    .line 68
    goto :goto_4

    .line 69
    :catchall_1
    move-exception p0

    .line 70
    goto :goto_3

    .line 71
    :goto_2
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 72
    :catchall_2
    move-exception v2

    .line 73
    :try_start_4
    invoke-static {v0, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 77
    :goto_3
    new-instance v3, Lsf/f;

    .line 78
    .line 79
    invoke-direct {v3, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_4
    instance-of p0, v3, Lsf/f;

    .line 83
    .line 84
    if-eqz p0, :cond_3

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_3
    move-object v1, v3

    .line 88
    :goto_5
    check-cast v1, Ljava/lang/String;

    .line 89
    .line 90
    return-object v1
.end method

.method public static k(Landroid/app/Activity;)V
    .locals 4

    .line 1
    sget-boolean v0, Lh/Hchat/crash/g;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lh/Hchat/crash/g;->s:Ljava/io/File;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    sget-object v0, Lh/Hchat/crash/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    sget-object v0, Lh/Hchat/crash/g;->g:Landroid/os/Handler;

    .line 29
    .line 30
    new-instance v1, Lh/Hchat/crash/d;

    .line 31
    .line 32
    invoke-direct {v1, p0}, Lh/Hchat/crash/d;-><init>(Landroid/app/Activity;)V

    .line 33
    .line 34
    .line 35
    const-wide/16 v2, 0x2bc

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 38
    .line 39
    .line 40
    :cond_3
    :goto_0
    return-void
.end method

.method public static l(Ljava/io/File;Ljava/lang/String;)Z
    .locals 7

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    new-instance v6, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, ".tmp-"

    .line 32
    .line 33
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, "-"

    .line 40
    .line 41
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    goto :goto_3

    .line 66
    :cond_0
    :goto_0
    new-instance v1, Ljava/io/FileOutputStream;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-direct {v1, v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    :try_start_1
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 73
    .line 74
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 75
    .line 76
    invoke-direct {v3, v1, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    :try_start_2
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->flush()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 90
    .line 91
    .line 92
    :try_start_3
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 93
    .line 94
    .line 95
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 96
    .line 97
    .line 98
    const/4 p1, 0x1

    .line 99
    :try_start_5
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    const/4 v4, 0x2

    .line 108
    new-array v4, v4, [Ljava/nio/file/CopyOption;

    .line 109
    .line 110
    sget-object v5, Ljava/nio/file/StandardCopyOption;->ATOMIC_MOVE:Ljava/nio/file/StandardCopyOption;

    .line 111
    .line 112
    aput-object v5, v4, v2

    .line 113
    .line 114
    sget-object v5, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 115
    .line 116
    aput-object v5, v4, p1

    .line 117
    .line 118
    invoke-static {v1, v3, v4}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_5
    .catch Ljava/nio/file/AtomicMoveNotSupportedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catch_0
    :try_start_6
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    new-array p1, p1, [Ljava/nio/file/CopyOption;

    .line 131
    .line 132
    sget-object v4, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 133
    .line 134
    aput-object v4, p1, v2

    .line 135
    .line 136
    invoke-static {v1, v3, p1}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    .line 137
    .line 138
    .line 139
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :catchall_1
    move-exception p1

    .line 143
    goto :goto_2

    .line 144
    :catchall_2
    move-exception p1

    .line 145
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 146
    :catchall_3
    move-exception v2

    .line 147
    :try_start_8
    invoke-static {v3, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 151
    :goto_2
    :try_start_9
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 152
    :catchall_4
    move-exception v2

    .line 153
    :try_start_a
    invoke-static {v1, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 157
    :goto_3
    new-instance v1, Lsf/f;

    .line 158
    .line 159
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    move-object p1, v1

    .line 163
    :goto_4
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-eqz v1, :cond_1

    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const-string v3, "[Hchat:Crash] \u5199\u5165\u5d29\u6e83\u8bb0\u5f55\u5931\u8d25: "

    .line 178
    .line 179
    const-string v4, " "

    .line 180
    .line 181
    invoke-static {v3, p0, v4, v2, v1}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 185
    .line 186
    instance-of v1, p1, Lsf/f;

    .line 187
    .line 188
    if-eqz v1, :cond_2

    .line 189
    .line 190
    move-object p1, p0

    .line 191
    :cond_2
    check-cast p1, Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-nez p0, :cond_3

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 200
    .line 201
    .line 202
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    return p0
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lh/Hchat/crash/g;->n:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne v0, p1, :cond_1

    .line 11
    .line 12
    sget-object p1, Lh/Hchat/crash/g;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object p1, Lh/Hchat/crash/g;->m:Lwb/kv;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Lwb/kv;->close()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lh/Hchat/crash/g;->l:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne v0, p1, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lh/Hchat/crash/g;->l:Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    :cond_0
    sget-object v0, Lh/Hchat/crash/g;->n:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-ne v0, p1, :cond_2

    .line 27
    .line 28
    sget-object p1, Lh/Hchat/crash/g;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 34
    .line 35
    .line 36
    :cond_1
    sget-object p1, Lh/Hchat/crash/g;->m:Lwb/kv;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, Lwb/kv;->close()V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lh/Hchat/crash/g;->l:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    sget-boolean v0, Lh/Hchat/crash/g;->i:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-static {}, Lh/Hchat/crash/g;->d()V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lh/Hchat/crash/g;->e()V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lh/Hchat/crash/g;->k(Landroid/app/Activity;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
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
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method
