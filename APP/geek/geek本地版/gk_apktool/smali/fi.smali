.class public final synthetic Lfi;
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
    iput p4, p0, Lfi;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lfi;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lfi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lfi;->d:Ljava/lang/Object;

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
    iget v0, p0, Lfi;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfi;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lio/fastkv/TagExecutor;

    .line 9
    .line 10
    iget-object v1, p0, Lfi;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Runnable;

    .line 13
    .line 14
    iget-object v2, p0, Lfi;->d:Ljava/lang/Object;

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
    iget-object v0, p0, Lfi;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/lang/ClassLoader;

    .line 25
    .line 26
    iget-object v1, p0, Lfi;->c:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v2, p0, Lfi;->d:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v9, v2

    .line 31
    check-cast v9, Ljava/lang/String;

    .line 32
    .line 33
    sget-object v2, Lhs;->a:Lhs;

    .line 34
    .line 35
    invoke-static {v1}, Lip;->l(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const-string v2, ""

    .line 39
    .line 40
    :try_start_0
    sget-object v3, Lpb0;->z:Ljava/lang/String;

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
    goto :goto_3

    .line 59
    :cond_1
    sget-object v3, Lpb0;->B:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    if-eqz v3, :cond_8

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    if-nez v6, :cond_2

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_2
    sget-object v3, Lpb0;->C:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    sget-object v7, Lpb0;->A:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v1, v7}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    instance-of v7, v1, Ljava/lang/String;

    .line 87
    .line 88
    if-eqz v7, :cond_3

    .line 89
    .line 90
    move-object v5, v1

    .line 91
    check-cast v5, Ljava/lang/String;

    .line 92
    .line 93
    :cond_3
    if-nez v5, :cond_4

    .line 94
    .line 95
    move-object v7, v2

    .line 96
    goto :goto_1

    .line 97
    :cond_4
    move-object v7, v5

    .line 98
    :goto_1
    sget-object v1, Lhs;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 99
    .line 100
    invoke-virtual {v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Ljava/lang/String;

    .line 105
    .line 106
    if-nez v1, :cond_5

    .line 107
    .line 108
    move-object v8, v2

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    move-object v8, v1

    .line 111
    :goto_2
    sget-object v1, Lpb0;->n:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v1, v0}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    if-nez v1, :cond_6

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    move v2, v3

    .line 121
    sget-object v3, Lpb0;->X0:Ljb;

    .line 122
    .line 123
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual/range {v3 .. v9}, Ljb;->c(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, [Ljava/lang/Object;

    .line 132
    .line 133
    array-length v3, v2

    .line 134
    if-nez v3, :cond_7

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_7
    array-length v3, v2

    .line 138
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-static {v1, v2}, Lde/robv/android/xposed/XposedHelpers;->newInstance(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1}, Lip;->l(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v0, v1}, Lhs;->e(Ljava/lang/ClassLoader;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    .line 152
    :catchall_0
    :cond_8
    :goto_3
    return-void

    .line 153
    :pswitch_1
    iget-object v0, p0, Lfi;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Ll0;

    .line 156
    .line 157
    iget-object v1, p0, Lfi;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, Lip;

    .line 160
    .line 161
    iget-object v2, p0, Lfi;->d:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 164
    .line 165
    :try_start_1
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Landroid/content/Context;

    .line 168
    .line 169
    invoke-static {v0}, La80;->g(Landroid/content/Context;)Lwk;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_9

    .line 174
    .line 175
    iget-object v3, v0, Lai;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v3, Ldi;

    .line 178
    .line 179
    check-cast v3, Lvk;

    .line 180
    .line 181
    iget-object v4, v3, Lvk;->d:Ljava/lang/Object;

    .line 182
    .line 183
    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 184
    :try_start_2
    iput-object v2, v3, Lvk;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 185
    .line 186
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 187
    :try_start_3
    iget-object v0, v0, Lai;->b:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Ldi;

    .line 190
    .line 191
    new-instance v3, Lgi;

    .line 192
    .line 193
    invoke-direct {v3, v1, v2}, Lgi;-><init>(Lip;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v0, v3}, Ldi;->e(Lip;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :catchall_1
    move-exception v0

    .line 201
    goto :goto_4

    .line 202
    :catchall_2
    move-exception v0

    .line 203
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 204
    :try_start_5
    throw v0

    .line 205
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    .line 206
    .line 207
    const-string v3, "EmojiCompat font provider not available on this device."

    .line 208
    .line 209
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 213
    :goto_4
    invoke-virtual {v1, v0}, Lip;->F(Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 217
    .line 218
    .line 219
    :goto_5
    return-void

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
