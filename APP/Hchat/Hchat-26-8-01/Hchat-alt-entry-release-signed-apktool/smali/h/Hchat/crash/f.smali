.class public final Lh/Hchat/crash/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final a:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method public constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/Hchat/crash/f;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lh/Hchat/crash/g;->a:Lh/Hchat/crash/g;

    .line 8
    .line 9
    sget-boolean v0, Lh/Hchat/crash/g;->i:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_0
    move-object v2, p2

    .line 17
    move v0, v1

    .line 18
    :goto_0
    const/4 v3, 0x1

    .line 19
    const/16 v4, 0x8

    .line 20
    .line 21
    if-ge v0, v4, :cond_3

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    instance-of v4, v2, Ljava/lang/OutOfMemoryError;

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    const-string v4, ""

    .line 36
    .line 37
    :cond_1
    const-string v5, "Failed to allocate"

    .line 38
    .line 39
    invoke-static {v4, v5, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    sget-object v0, Lh/Hchat/crash/g;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    .line 56
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :cond_4
    :try_start_0
    sget-object v0, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 70
    .line 71
    .line 72
    new-instance v0, Ljava/io/FileOutputStream;

    .line 73
    .line 74
    sget-object v3, Lh/Hchat/crash/g;->q:Ljava/io/File;

    .line 75
    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    invoke-direct {v0, v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 79
    .line 80
    .line 81
    :try_start_1
    new-instance v2, Ljava/io/PrintWriter;

    .line 82
    .line 83
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 84
    .line 85
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 86
    .line 87
    invoke-direct {v3, v0, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v2, v3, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    .line 92
    .line 93
    :try_start_2
    const-string v3, "Hchat \u6355\u83b7\u5230 Java \u5c42\u5f02\u5e38"

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v3

    .line 102
    invoke-static {v3, v4}, Lh/Hchat/crash/g;->f(J)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    new-instance v4, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v5, "\u65f6\u95f4: "

    .line 112
    .line 113
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    sget-object v3, Lh/Hchat/crash/g;->u:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    .line 136
    .line 137
    .line 138
    move-result-wide v4

    .line 139
    new-instance v6, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v7, "\u7ebf\u7a0b: "

    .line 145
    .line 146
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v3, " (id="

    .line 153
    .line 154
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v3, ")"

    .line 161
    .line 162
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/io/PrintWriter;->println()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/io/PrintWriter;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 179
    .line 180
    .line 181
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-virtual {v3}, Ljava/io/FileDescriptor;->sync()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 186
    .line 187
    .line 188
    :catchall_0
    :try_start_4
    invoke-virtual {v2}, Ljava/io/PrintWriter;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 189
    .line 190
    .line 191
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :catchall_1
    move-exception v2

    .line 196
    goto :goto_1

    .line 197
    :catchall_2
    move-exception v3

    .line 198
    :try_start_6
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 199
    :catchall_3
    move-exception v4

    .line 200
    :try_start_7
    invoke-static {v2, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    throw v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 204
    :goto_1
    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 205
    :catchall_4
    move-exception v3

    .line 206
    :try_start_9
    invoke-static {v0, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    throw v3

    .line 210
    :cond_5
    const-string v0, "javaPendingFile"

    .line 211
    .line 212
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v2

    .line 216
    :cond_6
    const-string v0, "crashDir"

    .line 217
    .line 218
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 222
    :catchall_5
    :goto_2
    iget-object v0, p0, Lh/Hchat/crash/f;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 223
    .line 224
    if-eqz v0, :cond_7

    .line 225
    .line 226
    if-eq v0, p0, :cond_7

    .line 227
    .line 228
    :try_start_a
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 229
    .line 230
    .line 231
    sget-object p1, Lh/Hchat/crash/g;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 232
    .line 233
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :catchall_6
    move-exception p1

    .line 238
    sget-object p2, Lh/Hchat/crash/g;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 239
    .line 240
    invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 241
    .line 242
    .line 243
    throw p1

    .line 244
    :cond_7
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    .line 249
    .line 250
    .line 251
    const/16 p1, 0xa

    .line 252
    .line 253
    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    .line 254
    .line 255
    .line 256
    const-string p1, "System.exit returned normally, while it was supposed to halt JVM."

    .line 257
    .line 258
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    return-void
.end method
