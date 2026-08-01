.class public final Lpq;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lpq;

.field public static final β:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final δ:Landroid/os/Handler;

.field public static final ε:Landroid/os/Handler;

.field public static final ζ:Ljava/lang/Object;

.field public static final η:Lnq;

.field public static final θ:Ljava/util/HashMap;

.field public static final ι:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public static final κ:Ljava/util/concurrent/CopyOnWriteArraySet;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lpq;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpq;->α:Lpq;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lpq;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 17
    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lpq;->γ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 24
    .line 25
    new-instance v0, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lpq;->δ:Landroid/os/Handler;

    .line 35
    .line 36
    new-instance v0, Landroid/os/HandlerThread;

    .line 37
    .line 38
    const-string v1, "rf2ff7ad939a6e83b"

    .line 39
    .line 40
    const/16 v2, 0xa

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 46
    .line 47
    .line 48
    new-instance v1, Landroid/os/Handler;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 55
    .line 56
    .line 57
    sput-object v1, Lpq;->ε:Landroid/os/Handler;

    .line 58
    .line 59
    new-instance v0, Ljava/lang/Object;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lpq;->ζ:Ljava/lang/Object;

    .line 65
    .line 66
    new-instance v0, Lnq;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    const/4 v2, 0x0

    .line 70
    const/16 v3, 0x20

    .line 71
    .line 72
    const/high16 v4, 0x3f400000    # 0.75f

    .line 73
    .line 74
    invoke-direct {v0, v3, v4, v1, v2}, Lnq;-><init>(IFZI)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Lpq;->η:Lnq;

    .line 78
    .line 79
    new-instance v0, Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    sput-object v0, Lpq;->θ:Ljava/util/HashMap;

    .line 85
    .line 86
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 89
    .line 90
    .line 91
    sput-object v0, Lpq;->ι:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 92
    .line 93
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 96
    .line 97
    .line 98
    sput-object v0, Lpq;->κ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 99
    .line 100
    return-void
.end method

.method public static α()Lmq;
    .locals 1

    .line 1
    sget-object v0, Lpq;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Llq;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Llq;->ε:Lmq;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public static β()Lkq;
    .locals 6

    .line 1
    sget-object v0, Lpq;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Llq;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v2, v0, Llq;->β:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v3, v0, Llq;->γ:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-nez v3, :cond_2

    .line 29
    .line 30
    :goto_0
    return-object v1

    .line 31
    :cond_2
    new-instance v4, Lkq;

    .line 32
    .line 33
    iget-object v5, v0, Llq;->δ:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    if-eqz v5, :cond_3

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Landroid/view/View;

    .line 42
    .line 43
    :cond_3
    iget-object v0, v0, Llq;->ε:Lmq;

    .line 44
    .line 45
    invoke-direct {v4, v2, v3, v1, v0}, Lkq;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;Lmq;)V

    .line 46
    .line 47
    .line 48
    return-object v4
.end method


# virtual methods
.method public final γ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;)V
    .locals 18

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v3, p4

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v4, Lpq;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Llq;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v6, v0, Llq;->β:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v6, v5

    .line 29
    :goto_0
    if-ne v6, v1, :cond_2

    .line 30
    .line 31
    iget-object v6, v0, Llq;->γ:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    if-ne v6, v2, :cond_2

    .line 38
    .line 39
    if-eqz v3, :cond_9

    .line 40
    .line 41
    iget-object v0, v0, Llq;->δ:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Landroid/view/View;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object v0, v5

    .line 53
    :goto_1
    if-ne v0, v3, :cond_2

    .line 54
    .line 55
    goto/16 :goto_9

    .line 56
    .line 57
    :cond_2
    sget-object v0, Lpq;->γ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 60
    .line 61
    .line 62
    move-result-wide v11

    .line 63
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v14

    .line 67
    new-instance v6, Lmq;

    .line 68
    .line 69
    move-object/from16 v0, p0

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Lpq;->δ(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    const-wide/16 v8, 0x0

    .line 76
    .line 77
    :try_start_0
    const-string v0, "createTime"

    .line 78
    .line 79
    invoke-static {v2, v0}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    instance-of v10, v0, Ljava/lang/Number;

    .line 84
    .line 85
    if-eqz v10, :cond_3

    .line 86
    .line 87
    check-cast v0, Ljava/lang/Number;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    goto :goto_4

    .line 92
    :cond_3
    move-object v0, v5

    .line 93
    :goto_2
    if-eqz v0, :cond_4

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 96
    .line 97
    .line 98
    move-result-wide v16

    .line 99
    goto :goto_3

    .line 100
    :cond_4
    move-wide/from16 v16, v8

    .line 101
    .line 102
    :goto_3
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    goto :goto_5

    .line 107
    :goto_4
    new-instance v10, Leo1;

    .line 108
    .line 109
    invoke-direct {v10, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    move-object v0, v10

    .line 113
    :goto_5
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    instance-of v9, v0, Leo1;

    .line 118
    .line 119
    if-eqz v9, :cond_5

    .line 120
    .line 121
    move-object v0, v8

    .line 122
    :cond_5
    check-cast v0, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 125
    .line 126
    .line 127
    move-result-wide v8

    .line 128
    :try_start_1
    const-string v0, "city"

    .line 129
    .line 130
    const-string v10, "region"

    .line 131
    .line 132
    filled-new-array {v0, v10}, [Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    new-instance v10, Lef;

    .line 141
    .line 142
    const/4 v13, 0x5

    .line 143
    invoke-direct {v10, v13, v2}, Lef;-><init>(ILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v10}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :catchall_1
    move-exception v0

    .line 158
    new-instance v10, Leo1;

    .line 159
    .line 160
    invoke-direct {v10, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    move-object v0, v10

    .line 164
    :goto_6
    instance-of v10, v0, Leo1;

    .line 165
    .line 166
    if-eqz v10, :cond_6

    .line 167
    .line 168
    move-object v0, v5

    .line 169
    :cond_6
    move-object v10, v0

    .line 170
    check-cast v10, Ljava/lang/String;

    .line 171
    .line 172
    move-object/from16 v13, p1

    .line 173
    .line 174
    invoke-direct/range {v6 .. v15}, Lmq;-><init>(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;J)V

    .line 175
    .line 176
    .line 177
    new-instance v9, Ljava/lang/ref/WeakReference;

    .line 178
    .line 179
    invoke-direct {v9, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    new-instance v10, Ljava/lang/ref/WeakReference;

    .line 183
    .line 184
    invoke-direct {v10, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    if-eqz v3, :cond_7

    .line 188
    .line 189
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 190
    .line 191
    invoke-direct {v5, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_7
    move-wide v7, v11

    .line 195
    move-object v12, v6

    .line 196
    new-instance v6, Llq;

    .line 197
    .line 198
    move-object v11, v5

    .line 199
    invoke-direct/range {v6 .. v12}, Llq;-><init>(JLjava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Lmq;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    sget-object v0, Lpq;->ι:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :catchall_2
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v1, :cond_8

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    check-cast v1, La80;

    .line 222
    .line 223
    :try_start_2
    invoke-interface {v1, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_8
    sget-object v0, Lpq;->κ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    :catchall_3
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_9

    .line 238
    .line 239
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    check-cast v1, La80;

    .line 244
    .line 245
    :try_start_3
    invoke-interface {v1, v12}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 246
    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_9
    :goto_9
    return-void
.end method

.method public final δ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "aid"

    .line 2
    .line 3
    const-string v1, "awemeId"

    .line 4
    .line 5
    const-string v2, "id"

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lef;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1}, Lef;-><init>(Lpq;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    new-instance p1, Leo1;

    .line 33
    .line 34
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object p0, p1

    .line 38
    :goto_0
    instance-of p1, p0, Leo1;

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 44
    .line 45
    return-object p0
.end method
