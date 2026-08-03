.class public final Ltg/b0;
.super Lug/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ltg/d;
.implements Ltg/z;
.implements Ltg/n;


# static fields
.field public static final synthetic l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public k:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "_state$volatile"

    .line 4
    .line 5
    const-class v2, Ltg/b0;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ltg/b0;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltg/b0;->_state$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ltg/e;Lwf/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, Ltg/a0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Ltg/a0;

    .line 9
    .line 10
    iget v2, v1, Ltg/a0;->n:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Ltg/a0;->n:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Ltg/a0;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Ltg/a0;-><init>(Ltg/b0;Lwf/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Ltg/a0;->l:Ljava/lang/Object;

    .line 32
    .line 33
    iget v3, v1, Ltg/a0;->n:I

    .line 34
    .line 35
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x1

    .line 40
    if-eqz v3, :cond_4

    .line 41
    .line 42
    if-eq v3, v8, :cond_3

    .line 43
    .line 44
    if-eq v3, v7, :cond_2

    .line 45
    .line 46
    if-ne v3, v6, :cond_1

    .line 47
    .line 48
    iget-object v3, v1, Ltg/a0;->k:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v9, v1, Ltg/a0;->j:Lqg/r0;

    .line 51
    .line 52
    iget-object v10, v1, Ltg/a0;->i:Ltg/c0;

    .line 53
    .line 54
    iget-object v11, v1, Ltg/a0;->h:Ltg/e;

    .line 55
    .line 56
    iget-object v12, v1, Ltg/a0;->g:Ltg/b0;

    .line 57
    .line 58
    :try_start_0
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    move-object v0, v3

    .line 62
    goto :goto_2

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    goto/16 :goto_8

    .line 65
    .line 66
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    return-object v0

    .line 73
    :cond_2
    iget-object v3, v1, Ltg/a0;->k:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v9, v1, Ltg/a0;->j:Lqg/r0;

    .line 76
    .line 77
    iget-object v10, v1, Ltg/a0;->i:Ltg/c0;

    .line 78
    .line 79
    iget-object v11, v1, Ltg/a0;->h:Ltg/e;

    .line 80
    .line 81
    iget-object v12, v1, Ltg/a0;->g:Ltg/b0;

    .line 82
    .line 83
    :try_start_1
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_3
    iget-object v10, v1, Ltg/a0;->i:Ltg/c0;

    .line 88
    .line 89
    iget-object v3, v1, Ltg/a0;->h:Ltg/e;

    .line 90
    .line 91
    iget-object v12, v1, Ltg/a0;->g:Ltg/b0;

    .line 92
    .line 93
    :try_start_2
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Lug/b;->a()Lug/d;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Ltg/c0;

    .line 105
    .line 106
    move-object/from16 v3, p1

    .line 107
    .line 108
    move-object v10, v0

    .line 109
    move-object v12, v2

    .line 110
    :goto_1
    :try_start_3
    invoke-interface {v1}, Lwf/c;->getContext()Lwf/g;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sget-object v9, Lqg/q;->h:Lqg/q;

    .line 115
    .line 116
    invoke-interface {v0, v9}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lqg/r0;

    .line 121
    .line 122
    move-object v9, v0

    .line 123
    move-object v11, v3

    .line 124
    const/4 v0, 0x0

    .line 125
    :cond_5
    :goto_2
    sget-object v3, Ltg/b0;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 126
    .line 127
    invoke-virtual {v3, v12}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    if-eqz v9, :cond_7

    .line 132
    .line 133
    invoke-interface {v9}, Lqg/r0;->b()Z

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-eqz v13, :cond_6

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    invoke-interface {v9}, Lqg/r0;->h()Ljava/util/concurrent/CancellationException;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    throw v0

    .line 145
    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    .line 146
    .line 147
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    if-nez v13, :cond_b

    .line 152
    .line 153
    :cond_8
    sget-object v0, Lug/c;->b:Ll3/q;

    .line 154
    .line 155
    if-ne v3, v0, :cond_9

    .line 156
    .line 157
    const/4 v0, 0x0

    .line 158
    goto :goto_4

    .line 159
    :cond_9
    move-object v0, v3

    .line 160
    :goto_4
    iput-object v12, v1, Ltg/a0;->g:Ltg/b0;

    .line 161
    .line 162
    iput-object v11, v1, Ltg/a0;->h:Ltg/e;

    .line 163
    .line 164
    iput-object v10, v1, Ltg/a0;->i:Ltg/c0;

    .line 165
    .line 166
    iput-object v9, v1, Ltg/a0;->j:Lqg/r0;

    .line 167
    .line 168
    iput-object v3, v1, Ltg/a0;->k:Ljava/lang/Object;

    .line 169
    .line 170
    iput v7, v1, Ltg/a0;->n:I

    .line 171
    .line 172
    invoke-interface {v11, v0, v1}, Ltg/e;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-ne v0, v4, :cond_a

    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_a
    :goto_5
    move-object v0, v3

    .line 180
    :cond_b
    iget-object v3, v10, Ltg/c0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 181
    .line 182
    sget-object v13, Ltg/s;->b:Ll3/q;

    .line 183
    .line 184
    invoke-virtual {v3, v13}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    sget-object v14, Ltg/s;->c:Ll3/q;

    .line 192
    .line 193
    if-ne v3, v14, :cond_c

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_c
    iput-object v12, v1, Ltg/a0;->g:Ltg/b0;

    .line 197
    .line 198
    iput-object v11, v1, Ltg/a0;->h:Ltg/e;

    .line 199
    .line 200
    iput-object v10, v1, Ltg/a0;->i:Ltg/c0;

    .line 201
    .line 202
    iput-object v9, v1, Ltg/a0;->j:Lqg/r0;

    .line 203
    .line 204
    iput-object v0, v1, Ltg/a0;->k:Ljava/lang/Object;

    .line 205
    .line 206
    iput v6, v1, Ltg/a0;->n:I

    .line 207
    .line 208
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 209
    .line 210
    new-instance v14, Lqg/g;

    .line 211
    .line 212
    invoke-static {v1}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 213
    .line 214
    .line 215
    move-result-object v15

    .line 216
    invoke-direct {v14, v8, v15}, Lqg/g;-><init>(ILwf/c;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v14}, Lqg/g;->p()V

    .line 220
    .line 221
    .line 222
    iget-object v15, v10, Ltg/c0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 223
    .line 224
    :cond_d
    invoke-virtual {v15, v13, v14}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v16

    .line 228
    if-eqz v16, :cond_e

    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_e
    invoke-virtual {v15}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    if-eq v5, v13, :cond_d

    .line 236
    .line 237
    invoke-virtual {v14, v3}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :goto_6
    invoke-virtual {v14}, Lqg/g;->o()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 244
    if-ne v5, v4, :cond_f

    .line 245
    .line 246
    move-object v3, v5

    .line 247
    :cond_f
    if-ne v3, v4, :cond_5

    .line 248
    .line 249
    :goto_7
    return-object v4

    .line 250
    :goto_8
    invoke-virtual {v12, v10}, Lug/b;->f(Lug/d;)V

    .line 251
    .line 252
    .line 253
    throw v0
.end method

.method public final c()Lug/d;
    .locals 1

    .line 1
    new-instance v0, Ltg/c0;

    .line 2
    .line 3
    invoke-direct {v0}, Ltg/c0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d()[Lug/d;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Ltg/c0;

    .line 3
    .line 4
    return-object v0
.end method

.method public final e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lug/c;->b:Ll3/q;

    .line 4
    .line 5
    :cond_0
    const/4 p2, 0x0

    .line 6
    invoke-virtual {p0, p2, p1}, Ltg/b0;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 10
    .line 11
    return-object p1
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lug/c;->b:Ll3/q;

    .line 2
    .line 3
    sget-object v1, Ltg/b0;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v1, v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    return-object v1
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Ltg/b0;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 3
    .line 4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return v2

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    :try_start_1
    invoke-static {v1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return v1

    .line 31
    :cond_1
    :try_start_2
    invoke-virtual {v0, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget p1, p0, Ltg/b0;->k:I

    .line 35
    .line 36
    and-int/lit8 p2, p1, 0x1

    .line 37
    .line 38
    if-nez p2, :cond_b

    .line 39
    .line 40
    add-int/2addr p1, v1

    .line 41
    iput p1, p0, Ltg/b0;->k:I

    .line 42
    .line 43
    iget-object p2, p0, Lug/b;->g:[Lug/d;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    :goto_0
    check-cast p2, [Ltg/c0;

    .line 47
    .line 48
    if-eqz p2, :cond_9

    .line 49
    .line 50
    array-length v0, p2

    .line 51
    move v3, v2

    .line 52
    :goto_1
    if-ge v3, v0, :cond_9

    .line 53
    .line 54
    aget-object v4, p2, v3

    .line 55
    .line 56
    if-eqz v4, :cond_8

    .line 57
    .line 58
    iget-object v4, v4, Ltg/c0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    :goto_2
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-nez v5, :cond_2

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_2
    sget-object v6, Ltg/s;->c:Ll3/q;

    .line 68
    .line 69
    if-ne v5, v6, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    sget-object v7, Ltg/s;->b:Ll3/q;

    .line 73
    .line 74
    if-ne v5, v7, :cond_6

    .line 75
    .line 76
    :cond_4
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_5

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_5
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    if-eq v7, v5, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_7

    .line 95
    .line 96
    check-cast v5, Lqg/g;

    .line 97
    .line 98
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 99
    .line 100
    invoke-virtual {v5, v4}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_7
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-eq v6, v5, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_9
    monitor-enter p0

    .line 115
    :try_start_3
    iget p2, p0, Ltg/b0;->k:I

    .line 116
    .line 117
    if-ne p2, p1, :cond_a

    .line 118
    .line 119
    add-int/2addr p1, v1

    .line 120
    iput p1, p0, Ltg/b0;->k:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return v1

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    goto :goto_4

    .line 126
    :cond_a
    :try_start_4
    iget-object p1, p0, Lug/b;->g:[Lug/d;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 127
    .line 128
    monitor-exit p0

    .line 129
    move v8, p2

    .line 130
    move-object p2, p1

    .line 131
    move p1, v8

    .line 132
    goto :goto_0

    .line 133
    :goto_4
    monitor-exit p0

    .line 134
    throw p1

    .line 135
    :cond_b
    add-int/lit8 p1, p1, 0x2

    .line 136
    .line 137
    :try_start_5
    iput p1, p0, Ltg/b0;->k:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 138
    .line 139
    monitor-exit p0

    .line 140
    return v1

    .line 141
    :goto_5
    monitor-exit p0

    .line 142
    throw p1
.end method
