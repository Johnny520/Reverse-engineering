.class public final Ly1/y1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lea/c;

.field public final b:Lf/w;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lea/c;

    .line 5
    .line 6
    invoke-direct {v0}, Lea/c;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ly1/y1;->a:Lea/c;

    .line 10
    .line 11
    sget-object v0, Lf/l;->a:Lf/w;

    .line 12
    .line 13
    new-instance v0, Lf/w;

    .line 14
    .line 15
    invoke-direct {v0}, Lf/w;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ly1/y1;->b:Lf/w;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ly1/y1;->a:Lea/c;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-boolean v3, v0, Lea/c;->c:Z

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_0
    iput-boolean v2, v0, Lea/c;->c:Z

    .line 14
    .line 15
    iget-object v3, v0, Lea/c;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ll3/w;

    .line 18
    .line 19
    monitor-enter v3

    .line 20
    :try_start_0
    iget-object v4, v0, Lea/c;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_2

    .line 37
    .line 38
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    :try_start_1
    invoke-static {v5}, Lp/a;->t(Ljava/lang/AutoCloseable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception v0

    .line 51
    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    .line 52
    .line 53
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    throw v2

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    iget-object v4, v0, Lea/c;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Ljava/util/LinkedHashSet;

    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Ljava/lang/AutoCloseable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    .line 79
    if-eqz v5, :cond_3

    .line 80
    .line 81
    :try_start_3
    invoke-static {v5}, Lp/a;->t(Ljava/lang/AutoCloseable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catch_1
    move-exception v0

    .line 86
    :try_start_4
    new-instance v2, Ljava/lang/RuntimeException;

    .line 87
    .line 88
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    throw v2

    .line 92
    :cond_4
    iget-object v0, v0, Lea/c;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 97
    .line 98
    .line 99
    monitor-exit v3

    .line 100
    goto :goto_3

    .line 101
    :goto_2
    monitor-exit v3

    .line 102
    throw v0

    .line 103
    :cond_5
    :goto_3
    iget-object v0, v1, Ly1/y1;->b:Lf/w;

    .line 104
    .line 105
    iget-object v3, v0, Lf/k;->b:[I

    .line 106
    .line 107
    iget-object v4, v0, Lf/k;->c:[Ljava/lang/Object;

    .line 108
    .line 109
    iget-object v0, v0, Lf/k;->a:[J

    .line 110
    .line 111
    array-length v5, v0

    .line 112
    add-int/lit8 v5, v5, -0x2

    .line 113
    .line 114
    if-ltz v5, :cond_a

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    :goto_4
    aget-wide v8, v0, v7

    .line 118
    .line 119
    not-long v10, v8

    .line 120
    const/4 v12, 0x7

    .line 121
    shl-long/2addr v10, v12

    .line 122
    and-long/2addr v10, v8

    .line 123
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    and-long/2addr v10, v12

    .line 129
    cmp-long v10, v10, v12

    .line 130
    .line 131
    if-eqz v10, :cond_9

    .line 132
    .line 133
    sub-int v10, v7, v5

    .line 134
    .line 135
    not-int v10, v10

    .line 136
    ushr-int/lit8 v10, v10, 0x1f

    .line 137
    .line 138
    const/16 v11, 0x8

    .line 139
    .line 140
    rsub-int/lit8 v10, v10, 0x8

    .line 141
    .line 142
    const/4 v12, 0x0

    .line 143
    :goto_5
    if-ge v12, v10, :cond_8

    .line 144
    .line 145
    const-wide/16 v13, 0xff

    .line 146
    .line 147
    and-long/2addr v13, v8

    .line 148
    const-wide/16 v15, 0x80

    .line 149
    .line 150
    cmp-long v13, v13, v15

    .line 151
    .line 152
    if-gez v13, :cond_7

    .line 153
    .line 154
    shl-int/lit8 v13, v7, 0x3

    .line 155
    .line 156
    add-int/2addr v13, v12

    .line 157
    aget v14, v3, v13

    .line 158
    .line 159
    aget-object v13, v4, v13

    .line 160
    .line 161
    check-cast v13, Lf/f0;

    .line 162
    .line 163
    iget-object v14, v13, Lf/f0;->a:[Ljava/lang/Object;

    .line 164
    .line 165
    iget v13, v13, Lf/f0;->b:I

    .line 166
    .line 167
    const/4 v15, 0x0

    .line 168
    :goto_6
    if-ge v15, v13, :cond_7

    .line 169
    .line 170
    aget-object v16, v14, v15

    .line 171
    .line 172
    move/from16 v17, v11

    .line 173
    .line 174
    move-object/from16 v11, v16

    .line 175
    .line 176
    check-cast v11, Ly1/x1;

    .line 177
    .line 178
    iget-object v6, v11, Ly1/x1;->d:Li0/f;

    .line 179
    .line 180
    if-eqz v6, :cond_6

    .line 181
    .line 182
    invoke-interface {v6}, Li0/f;->cancel()V

    .line 183
    .line 184
    .line 185
    :cond_6
    const/4 v6, 0x0

    .line 186
    iput-object v6, v11, Ly1/x1;->d:Li0/f;

    .line 187
    .line 188
    iget-object v6, v11, Ly1/x1;->a:Lxe/e;

    .line 189
    .line 190
    iget-object v6, v6, Lxe/e;->b:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v6, Lt0/c;

    .line 193
    .line 194
    iput-boolean v2, v6, Lt0/c;->b:Z

    .line 195
    .line 196
    const/4 v11, 0x0

    .line 197
    iput-boolean v11, v6, Lt0/c;->a:Z

    .line 198
    .line 199
    invoke-virtual {v6}, Lt0/c;->a()V

    .line 200
    .line 201
    .line 202
    add-int/lit8 v15, v15, 0x1

    .line 203
    .line 204
    move/from16 v11, v17

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_7
    move/from16 v17, v11

    .line 208
    .line 209
    const/4 v11, 0x0

    .line 210
    shr-long v8, v8, v17

    .line 211
    .line 212
    add-int/lit8 v12, v12, 0x1

    .line 213
    .line 214
    move/from16 v11, v17

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_8
    move v6, v11

    .line 218
    const/4 v11, 0x0

    .line 219
    if-ne v10, v6, :cond_a

    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_9
    const/4 v11, 0x0

    .line 223
    :goto_7
    if-eq v7, v5, :cond_a

    .line 224
    .line 225
    add-int/lit8 v7, v7, 0x1

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_a
    return-void
.end method
