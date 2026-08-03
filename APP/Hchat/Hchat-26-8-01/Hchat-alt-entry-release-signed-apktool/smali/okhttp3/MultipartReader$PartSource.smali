.class final Lokhttp3/MultipartReader$PartSource;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lokio/Source;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/MultipartReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "PartSource"
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/MultipartReader;

.field private final timeout:Lokio/Timeout;


# direct methods
.method public constructor <init>(Lokhttp3/MultipartReader;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lokhttp3/MultipartReader$PartSource;->this$0:Lokhttp3/MultipartReader;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lokio/Timeout;

    .line 7
    .line 8
    invoke-direct {p1}, Lokio/Timeout;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lokhttp3/MultipartReader$PartSource;->timeout:Lokio/Timeout;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/MultipartReader$PartSource;->this$0:Lokhttp3/MultipartReader;

    .line 2
    .line 3
    invoke-static {v0}, Lokhttp3/MultipartReader;->access$getCurrentPart$p(Lokhttp3/MultipartReader;)Lokhttp3/MultipartReader$PartSource;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lokhttp3/MultipartReader$PartSource;->this$0:Lokhttp3/MultipartReader;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v0, v1}, Lokhttp3/MultipartReader;->access$setCurrentPart$p(Lokhttp3/MultipartReader;Lokhttp3/MultipartReader$PartSource;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    cmp-long v6, v2, v4

    .line 13
    .line 14
    if-ltz v6, :cond_a

    .line 15
    .line 16
    iget-object v6, v1, Lokhttp3/MultipartReader$PartSource;->this$0:Lokhttp3/MultipartReader;

    .line 17
    .line 18
    invoke-static {v6}, Lokhttp3/MultipartReader;->access$getCurrentPart$p(Lokhttp3/MultipartReader;)Lokhttp3/MultipartReader$PartSource;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    invoke-static {v6, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-eqz v6, :cond_9

    .line 27
    .line 28
    iget-object v6, v1, Lokhttp3/MultipartReader$PartSource;->this$0:Lokhttp3/MultipartReader;

    .line 29
    .line 30
    invoke-static {v6}, Lokhttp3/MultipartReader;->access$getSource$p(Lokhttp3/MultipartReader;)Lokio/BufferedSource;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-interface {v6}, Lokio/Source;->timeout()Lokio/Timeout;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget-object v7, v1, Lokhttp3/MultipartReader$PartSource;->timeout:Lokio/Timeout;

    .line 39
    .line 40
    iget-object v8, v1, Lokhttp3/MultipartReader$PartSource;->this$0:Lokhttp3/MultipartReader;

    .line 41
    .line 42
    invoke-virtual {v6}, Lokio/Timeout;->timeoutNanos()J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    sget-object v11, Lokio/Timeout;->Companion:Lokio/Timeout$Companion;

    .line 47
    .line 48
    invoke-virtual {v7}, Lokio/Timeout;->timeoutNanos()J

    .line 49
    .line 50
    .line 51
    move-result-wide v12

    .line 52
    invoke-virtual {v6}, Lokio/Timeout;->timeoutNanos()J

    .line 53
    .line 54
    .line 55
    move-result-wide v14

    .line 56
    invoke-virtual {v11, v12, v13, v14, v15}, Lokio/Timeout$Companion;->minTimeout(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v11

    .line 60
    sget-object v13, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 61
    .line 62
    invoke-virtual {v6, v11, v12, v13}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6}, Lokio/Timeout;->hasDeadline()Z

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    if-eqz v11, :cond_4

    .line 70
    .line 71
    invoke-virtual {v6}, Lokio/Timeout;->deadlineNanoTime()J

    .line 72
    .line 73
    .line 74
    move-result-wide v11

    .line 75
    invoke-virtual {v7}, Lokio/Timeout;->hasDeadline()Z

    .line 76
    .line 77
    .line 78
    move-result v16

    .line 79
    if-eqz v16, :cond_0

    .line 80
    .line 81
    move-wide/from16 v16, v4

    .line 82
    .line 83
    invoke-virtual {v6}, Lokio/Timeout;->deadlineNanoTime()J

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    invoke-virtual {v7}, Lokio/Timeout;->deadlineNanoTime()J

    .line 88
    .line 89
    .line 90
    move-result-wide v14

    .line 91
    invoke-static {v4, v5, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide v4

    .line 95
    invoke-virtual {v6, v4, v5}, Lokio/Timeout;->deadlineNanoTime(J)Lokio/Timeout;

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    move-wide/from16 v16, v4

    .line 100
    .line 101
    :goto_0
    :try_start_0
    invoke-static {v8, v2, v3}, Lokhttp3/MultipartReader;->access$currentPartBytesRemaining(Lokhttp3/MultipartReader;J)J

    .line 102
    .line 103
    .line 104
    move-result-wide v2

    .line 105
    cmp-long v4, v2, v16

    .line 106
    .line 107
    if-nez v4, :cond_1

    .line 108
    .line 109
    const-wide/16 v14, -0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    invoke-static {v8}, Lokhttp3/MultipartReader;->access$getSource$p(Lokhttp3/MultipartReader;)Lokio/BufferedSource;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-interface {v4, v0, v2, v3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    :goto_1
    invoke-virtual {v6, v9, v10, v13}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7}, Lokio/Timeout;->hasDeadline()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_2

    .line 128
    .line 129
    invoke-virtual {v6, v11, v12}, Lokio/Timeout;->deadlineNanoTime(J)Lokio/Timeout;

    .line 130
    .line 131
    .line 132
    :cond_2
    return-wide v14

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    invoke-virtual {v6, v9, v10, v13}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7}, Lokio/Timeout;->hasDeadline()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_3

    .line 142
    .line 143
    invoke-virtual {v6, v11, v12}, Lokio/Timeout;->deadlineNanoTime(J)Lokio/Timeout;

    .line 144
    .line 145
    .line 146
    :cond_3
    throw v0

    .line 147
    :cond_4
    move-wide/from16 v16, v4

    .line 148
    .line 149
    invoke-virtual {v7}, Lokio/Timeout;->hasDeadline()Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_5

    .line 154
    .line 155
    invoke-virtual {v7}, Lokio/Timeout;->deadlineNanoTime()J

    .line 156
    .line 157
    .line 158
    move-result-wide v4

    .line 159
    invoke-virtual {v6, v4, v5}, Lokio/Timeout;->deadlineNanoTime(J)Lokio/Timeout;

    .line 160
    .line 161
    .line 162
    :cond_5
    :try_start_1
    invoke-static {v8, v2, v3}, Lokhttp3/MultipartReader;->access$currentPartBytesRemaining(Lokhttp3/MultipartReader;J)J

    .line 163
    .line 164
    .line 165
    move-result-wide v2

    .line 166
    cmp-long v4, v2, v16

    .line 167
    .line 168
    if-nez v4, :cond_6

    .line 169
    .line 170
    const-wide/16 v14, -0x1

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_6
    invoke-static {v8}, Lokhttp3/MultipartReader;->access$getSource$p(Lokhttp3/MultipartReader;)Lokio/BufferedSource;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-interface {v4, v0, v2, v3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 178
    .line 179
    .line 180
    move-result-wide v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 181
    :goto_2
    invoke-virtual {v6, v9, v10, v13}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v7}, Lokio/Timeout;->hasDeadline()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_7

    .line 189
    .line 190
    invoke-virtual {v6}, Lokio/Timeout;->clearDeadline()Lokio/Timeout;

    .line 191
    .line 192
    .line 193
    :cond_7
    return-wide v14

    .line 194
    :catchall_1
    move-exception v0

    .line 195
    invoke-virtual {v6, v9, v10, v13}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7}, Lokio/Timeout;->hasDeadline()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_8

    .line 203
    .line 204
    invoke-virtual {v6}, Lokio/Timeout;->clearDeadline()Lokio/Timeout;

    .line 205
    .line 206
    .line 207
    :cond_8
    throw v0

    .line 208
    :cond_9
    const-string v0, "closed"

    .line 209
    .line 210
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :goto_3
    const-wide/16 v2, 0x0

    .line 214
    .line 215
    return-wide v2

    .line 216
    :cond_a
    const-string v0, "byteCount < 0: "

    .line 217
    .line 218
    invoke-static {v2, v3, v0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_3
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/MultipartReader$PartSource;->timeout:Lokio/Timeout;

    .line 2
    .line 3
    return-object v0
.end method
