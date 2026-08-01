.class public final Lh7;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/ClassLoader;

.field public final synthetic b:Ly7;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Ly7;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh7;->a:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    iput-object p2, p0, Lh7;->b:Ly7;

    .line 4
    .line 5
    iput-object p3, p0, Lh7;->c:Ljava/lang/String;

    .line 6
    .line 7
    const/16 p1, 0x64

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p1, Landroid/app/Application;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/app/Application;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    iget-object v0, p0, Lh7;->a:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    iget-object v1, p0, Lh7;->b:Ly7;

    .line 14
    .line 15
    iget-object v2, p0, Lh7;->c:Ljava/lang/String;

    .line 16
    .line 17
    const-string v3, "Application.onCreate"

    .line 18
    .line 19
    invoke-static {p1, v0, v1, v2, v3}, Lcom/mr/elaris/HookEntry;->g(Landroid/app/Application;Ljava/lang/ClassLoader;Ly7;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/ClassLoader;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-boolean v1, La8;->c:Z

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto/16 :goto_5

    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, Lh7;->b:Ly7;

    .line 30
    .line 31
    iget-boolean v1, v1, Ly7;->b:Z

    .line 32
    .line 33
    if-eqz v1, :cond_9

    .line 34
    .line 35
    if-eqz p1, :cond_9

    .line 36
    .line 37
    iget-object v1, p0, Lh7;->c:Ljava/lang/String;

    .line 38
    .line 39
    sget-object v2, Ll3;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x1

    .line 43
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    move-object v2, p1

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_1
    new-instance v5, Ljava/lang/Thread;

    .line 63
    .line 64
    new-instance v6, Li3;

    .line 65
    .line 66
    invoke-direct {v6, v2, v1, v3}, Li3;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    const-string v1, "ElarisAnalytics"

    .line 70
    .line 71
    invoke-direct {v5, v6, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v4}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 75
    .line 76
    .line 77
    :try_start_0
    invoke-virtual {v5, v4}, Ljava/lang/Thread;->setPriority(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    :catchall_0
    invoke-virtual {v5}, Ljava/lang/Thread;->start()V

    .line 81
    .line 82
    .line 83
    :goto_2
    iget-object v1, p0, Lh7;->c:Ljava/lang/String;

    .line 84
    .line 85
    sget-object v2, Lt2;->a:[Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-nez v2, :cond_4

    .line 92
    .line 93
    move-object v2, p1

    .line 94
    :cond_4
    if-eqz v1, :cond_5

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-nez v5, :cond_6

    .line 101
    .line 102
    :cond_5
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :cond_6
    new-instance v5, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostVersionSummary()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v6, "@"

    .line 119
    .line 120
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    sget-object v5, Lt2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 131
    .line 132
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-virtual {v5, v1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    if-eqz v1, :cond_7

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_7
    const-string v1, "elaris_dexkit_locator"

    .line 142
    .line 143
    invoke-virtual {v2, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {v2}, Lt2;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-static {v1, v3}, Lt2;->h(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    invoke-static {v2, v1}, Lt2;->n(Landroid/content/Context;Landroid/content/SharedPreferences;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-nez v1, :cond_8

    .line 164
    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v2, "dexkit locator ready schema=7 cacheHits="

    .line 168
    .line 169
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v2, " qq="

    .line 176
    .line 177
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostVersionSummary()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    const-string v1, "dexkit locator maintenance skipped reason=verified_cache"

    .line 195
    .line 196
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_8
    new-instance v1, Lh0;

    .line 201
    .line 202
    invoke-direct {v1, v4, v2}, Lh0;-><init>(ILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    const-string v2, "Elaris-DexKitLocator"

    .line 206
    .line 207
    invoke-static {v2, v1}, Lo7;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 208
    .line 209
    .line 210
    :cond_9
    :goto_3
    iget-object p0, p0, Lh7;->b:Ly7;

    .line 211
    .line 212
    iget-boolean p0, p0, Ly7;->b:Z

    .line 213
    .line 214
    if-eqz p0, :cond_e

    .line 215
    .line 216
    if-eqz p1, :cond_a

    .line 217
    .line 218
    sput-object p1, La7;->b:Landroid/app/Application;

    .line 219
    .line 220
    :cond_a
    if-eqz v0, :cond_b

    .line 221
    .line 222
    sput-object v0, La7;->c:Ljava/lang/ClassLoader;

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_b
    sget-object p0, La7;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 226
    .line 227
    :goto_4
    if-eqz p1, :cond_c

    .line 228
    .line 229
    sput-object p1, Lcom/mr/elaris/f;->b:Landroid/app/Application;

    .line 230
    .line 231
    :cond_c
    if-eqz v0, :cond_d

    .line 232
    .line 233
    sput-object v0, Lcom/mr/elaris/f;->c:Ljava/lang/ClassLoader;

    .line 234
    .line 235
    :cond_d
    sget-object p0, Lcom/mr/elaris/f;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 236
    .line 237
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 238
    .line 239
    .line 240
    move-result-wide p0

    .line 241
    const-wide/32 v0, 0xea60

    .line 242
    .line 243
    .line 244
    add-long/2addr p0, v0

    .line 245
    sget-wide v0, Lcom/mr/elaris/f;->h:J

    .line 246
    .line 247
    cmp-long v0, p0, v0

    .line 248
    .line 249
    if-lez v0, :cond_e

    .line 250
    .line 251
    sput-wide p0, Lcom/mr/elaris/f;->h:J

    .line 252
    .line 253
    :cond_e
    :goto_5
    return-void
.end method
