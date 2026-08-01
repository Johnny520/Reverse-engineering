.class public final synthetic Lhi;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lhi;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lhi;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lhi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lhi;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lhi;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhi;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lio/fastkv/TagExecutor;

    .line 9
    .line 10
    iget-object v1, p0, Lhi;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Runnable;

    .line 13
    .line 14
    iget-object v2, p0, Lhi;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lio/fastkv/TagExecutor;->a(Lio/fastkv/TagExecutor;Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Lhi;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/lang/ClassLoader;

    .line 25
    .line 26
    iget-object v1, p0, Lhi;->c:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v2, p0, Lhi;->d:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v9, v2

    .line 31
    check-cast v9, Ljava/lang/String;

    .line 32
    .line 33
    sget-object v2, Lls;->a:Lls;

    .line 34
    .line 35
    invoke-static {v1}, Lmp;->d(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const-string v2, ""

    .line 39
    .line 40
    :try_start_0
    sget-object v3, Lub0;->z:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    instance-of v4, v3, Ljava/lang/String;

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    move-object v4, v3

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object v4, v5

    .line 56
    :goto_0
    if-nez v4, :cond_1

    .line 57
    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_1
    sget-object v3, Lub0;->B:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_8

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    if-nez v6, :cond_2

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_2
    sget-object v3, Lub0;->C:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    sget-object v7, Lub0;->A:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v7}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    instance-of v7, v1, Ljava/lang/String;

    .line 88
    .line 89
    if-eqz v7, :cond_3

    .line 90
    .line 91
    move-object v5, v1

    .line 92
    check-cast v5, Ljava/lang/String;

    .line 93
    .line 94
    :cond_3
    if-nez v5, :cond_4

    .line 95
    .line 96
    move-object v7, v2

    .line 97
    goto :goto_1

    .line 98
    :cond_4
    move-object v7, v5

    .line 99
    :goto_1
    sget-object v1, Lls;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 100
    .line 101
    invoke-virtual {v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Ljava/lang/String;

    .line 106
    .line 107
    if-nez v1, :cond_5

    .line 108
    .line 109
    move-object v8, v2

    .line 110
    goto :goto_2

    .line 111
    :cond_5
    move-object v8, v1

    .line 112
    :goto_2
    sget-object v1, Lub0;->n:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v1, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-nez v1, :cond_6

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    move v2, v3

    .line 122
    sget-object v3, Lub0;->X0:Lrb;

    .line 123
    .line 124
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual/range {v3 .. v9}, Lrb;->c(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, [Ljava/lang/Object;

    .line 133
    .line 134
    array-length v3, v2

    .line 135
    if-nez v3, :cond_7

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    array-length v3, v2

    .line 139
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-static {v1, v2}, Lde/robv/android/xposed/XposedHelpers;->newInstance(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {v1}, Lmp;->d(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    const/4 v2, 0x1

    .line 151
    invoke-static {v0, v1, v2}, Lls;->e(Ljava/lang/ClassLoader;Ljava/lang/Object;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :catchall_0
    const-string v0, "wVtOLItFbiPoV2I3l2Y=\n"

    .line 156
    .line 157
    const-string v1, "jS4tR/IIAU0=\n"

    .line 158
    .line 159
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const-string v1, "06ke\n"

    .line 164
    .line 165
    const-string v2, "p8h5VTpLcuY=\n"

    .line 166
    .line 167
    const-string v3, "tw==\n"

    .line 168
    .line 169
    const-string v4, "0vI8ySRxU5w=\n"

    .line 170
    .line 171
    invoke-static {v1, v2, v0, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :cond_8
    :goto_3
    return-void

    .line 175
    :pswitch_1
    iget-object v0, p0, Lhi;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Ll0;

    .line 178
    .line 179
    iget-object v1, p0, Lhi;->c:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Lgf;

    .line 182
    .line 183
    iget-object v2, p0, Lhi;->d:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 186
    .line 187
    :try_start_1
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Landroid/content/Context;

    .line 190
    .line 191
    invoke-static {v0}, Lmp;->h(Landroid/content/Context;)Lyk;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-eqz v0, :cond_9

    .line 196
    .line 197
    iget-object v3, v0, Lci;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v3, Lfi;

    .line 200
    .line 201
    check-cast v3, Lxk;

    .line 202
    .line 203
    iget-object v4, v3, Lxk;->d:Ljava/lang/Object;

    .line 204
    .line 205
    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 206
    :try_start_2
    iput-object v2, v3, Lxk;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 207
    .line 208
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 209
    :try_start_3
    iget-object v0, v0, Lci;->b:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, Lfi;

    .line 212
    .line 213
    new-instance v3, Lii;

    .line 214
    .line 215
    invoke-direct {v3, v1, v2}, Lii;-><init>(Lgf;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v0, v3}, Lfi;->b(Lgf;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 219
    .line 220
    .line 221
    goto :goto_5

    .line 222
    :catchall_1
    move-exception v0

    .line 223
    goto :goto_4

    .line 224
    :catchall_2
    move-exception v0

    .line 225
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 226
    :try_start_5
    throw v0

    .line 227
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    .line 228
    .line 229
    const-string v3, "EmojiCompat font provider not available on this device."

    .line 230
    .line 231
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 235
    :goto_4
    invoke-virtual {v1, v0}, Lgf;->J(Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 239
    .line 240
    .line 241
    :goto_5
    return-void

    .line 242
    nop

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
