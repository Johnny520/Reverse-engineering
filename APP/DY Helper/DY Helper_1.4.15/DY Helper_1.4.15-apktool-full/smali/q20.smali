.class public final Lq20;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/Set;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile γ:J

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lq20;->α:Ljava/util/Set;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lq20;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lq20;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lq20;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    return-void
.end method

.method public static final α(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const-string v0, "~791C379109EE249A17C75D97B08A46A1FBF5443CB34C0F44BBA61A1BA3C0B72730E4"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Lq20;->η(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    sget-boolean v0, Lkn0;->θ:Z

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    sget v0, Lkn0;->ι:I

    .line 19
    .line 20
    if-gtz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget v0, Lkn0;->ι:I

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    if-ge v0, v1, :cond_3

    .line 27
    .line 28
    move v0, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 31
    :cond_3
    :goto_1
    :try_start_0
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 32
    .line 33
    const-string v1, "setIntValue"

    .line 34
    .line 35
    const/16 v2, 0xb

    .line 36
    .line 37
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {p0, v1, v0}, Lqe0;->β(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    :catchall_0
    :goto_2
    return-void
.end method

.method public static final β(Lk01;Ljava/lang/ClassLoader;)Z
    .locals 4

    .line 1
    sget-boolean v0, Lkn0;->θ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget v0, Lkn0;->ι:I

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    invoke-static {p1}, Lq20;->ε(Ljava/lang/ClassLoader;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lk01;->α:Ljava/lang/reflect/Executable;

    .line 16
    .line 17
    instance-of v0, p1, Ljava/lang/reflect/Method;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    check-cast p1, Ljava/lang/reflect/Method;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    move-object p1, v1

    .line 26
    :goto_1
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_2

    .line 33
    :cond_3
    move-object p1, v1

    .line 34
    :goto_2
    invoke-static {p1}, Lq20;->ζ(Ljava/lang/Class;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Lk01;->α(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Lk01;->α:Ljava/lang/reflect/Executable;

    .line 42
    .line 43
    instance-of p1, p0, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    check-cast p0, Ljava/lang/reflect/Method;

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_4
    move-object p0, v1

    .line 51
    :goto_3
    if-eqz p0, :cond_5

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_4

    .line 64
    :cond_5
    move-object p1, v1

    .line 65
    :goto_4
    if-eqz p0, :cond_6

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_5

    .line 72
    :cond_6
    move-object v0, v1

    .line 73
    :goto_5
    const-string v2, "block_preload_method:"

    .line 74
    .line 75
    const-string v3, "#"

    .line 76
    .line 77
    invoke-static {v2, p1, v3, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-eqz p0, :cond_7

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_7

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    goto :goto_6

    .line 94
    :cond_7
    move-object v0, v1

    .line 95
    :goto_6
    if-eqz p0, :cond_8

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v2, "block preload method="

    .line 104
    .line 105
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p1, p0}, Lq20;->λ(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const/4 p0, 0x1

    .line 125
    return p0
.end method

.method public static final γ([Ljava/lang/Object;)Ljava/lang/String;
    .locals 12

    .line 1
    const/4 v1, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v1

    .line 5
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    array-length v3, p0

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    :goto_0
    if-ge v5, v3, :cond_12

    .line 14
    .line 15
    aget-object v6, p0, v5

    .line 16
    .line 17
    if-eqz v6, :cond_11

    .line 18
    .line 19
    instance-of v0, v6, Ljava/lang/String;

    .line 20
    .line 21
    const/16 v7, 0x60

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    move-object v0, v6

    .line 26
    check-cast v0, Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_11

    .line 33
    .line 34
    check-cast v6, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v6, v7}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto/16 :goto_a

    .line 44
    .line 45
    :cond_1
    instance-of v0, v6, [Ljava/lang/Object;

    .line 46
    .line 47
    if-eqz v0, :cond_6

    .line 48
    .line 49
    check-cast v6, [Ljava/lang/Object;

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    array-length v8, v6

    .line 57
    move v9, v4

    .line 58
    :goto_1
    if-ge v9, v8, :cond_3

    .line 59
    .line 60
    aget-object v10, v6, v9

    .line 61
    .line 62
    instance-of v11, v10, Ljava/lang/String;

    .line 63
    .line 64
    if-eqz v11, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    new-instance v6, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_5

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    move-object v9, v8

    .line 92
    check-cast v9, Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v9}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-nez v9, :cond_4

    .line 99
    .line 100
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    const/4 v0, 0x2

    .line 105
    invoke-static {v6, v0}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_11

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v6, v7}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-string v8, "~79C18A000CC51E6256484DBE4323D135EABA1849AB"

    .line 142
    .line 143
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    invoke-static {v0, v8, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-nez v8, :cond_7

    .line 152
    .line 153
    const-string v8, "X.C231"

    .line 154
    .line 155
    invoke-static {v0, v8, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_11

    .line 160
    .line 161
    :cond_7
    const-string v0, "getVideoId"

    .line 162
    .line 163
    const-string v8, "getVideoID"

    .line 164
    .line 165
    const-string v9, "getKey"

    .line 166
    .line 167
    filled-new-array {v9, v0, v8}, [Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    :cond_8
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_b

    .line 184
    .line 185
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, Ljava/lang/String;

    .line 190
    .line 191
    :try_start_0
    new-array v9, v4, [Ljava/lang/Object;

    .line 192
    .line 193
    invoke-static {v6, v0, v9}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    instance-of v9, v0, Ljava/lang/String;

    .line 198
    .line 199
    if-eqz v9, :cond_9

    .line 200
    .line 201
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :catchall_0
    move-exception v0

    .line 205
    goto :goto_5

    .line 206
    :cond_9
    move-object v0, v1

    .line 207
    goto :goto_6

    .line 208
    :goto_5
    new-instance v9, Leo1;

    .line 209
    .line 210
    invoke-direct {v9, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    move-object v0, v9

    .line 214
    :goto_6
    instance-of v9, v0, Leo1;

    .line 215
    .line 216
    if-eqz v9, :cond_a

    .line 217
    .line 218
    move-object v0, v1

    .line 219
    :cond_a
    check-cast v0, Ljava/lang/String;

    .line 220
    .line 221
    if-eqz v0, :cond_8

    .line 222
    .line 223
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    if-eqz v9, :cond_10

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_b
    const-string v0, "LIZ"

    .line 231
    .line 232
    const-string v8, "LIZIZ"

    .line 233
    .line 234
    const-string v9, "mKey"

    .line 235
    .line 236
    const-string v10, "mVideoId"

    .line 237
    .line 238
    const-string v11, "mVideoID"

    .line 239
    .line 240
    filled-new-array {v9, v10, v11, v0, v8}, [Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    :cond_c
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-eqz v0, :cond_f

    .line 257
    .line 258
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    check-cast v0, Ljava/lang/String;

    .line 263
    .line 264
    :try_start_1
    invoke-static {v6, v0}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    instance-of v9, v0, Ljava/lang/String;

    .line 269
    .line 270
    if-eqz v9, :cond_d

    .line 271
    .line 272
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :catchall_1
    move-exception v0

    .line 276
    goto :goto_8

    .line 277
    :cond_d
    move-object v0, v1

    .line 278
    goto :goto_9

    .line 279
    :goto_8
    new-instance v9, Leo1;

    .line 280
    .line 281
    invoke-direct {v9, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    move-object v0, v9

    .line 285
    :goto_9
    instance-of v9, v0, Leo1;

    .line 286
    .line 287
    if-eqz v9, :cond_e

    .line 288
    .line 289
    move-object v0, v1

    .line 290
    :cond_e
    check-cast v0, Ljava/lang/String;

    .line 291
    .line 292
    if-eqz v0, :cond_c

    .line 293
    .line 294
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    if-eqz v9, :cond_10

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_f
    move-object v0, v1

    .line 302
    :cond_10
    if-eqz v0, :cond_11

    .line 303
    .line 304
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    if-nez v6, :cond_11

    .line 309
    .line 310
    invoke-static {v0, v7}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    :cond_11
    :goto_a
    add-int/lit8 v5, v5, 0x1

    .line 318
    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :cond_12
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 322
    .line 323
    .line 324
    move-result p0

    .line 325
    if-eqz p0, :cond_13

    .line 326
    .line 327
    goto :goto_b

    .line 328
    :cond_13
    const/4 v7, 0x0

    .line 329
    const/16 v8, 0x3e

    .line 330
    .line 331
    const-string v3, "|"

    .line 332
    .line 333
    const/4 v4, 0x0

    .line 334
    const/4 v5, 0x0

    .line 335
    const/4 v6, 0x0

    .line 336
    invoke-static/range {v2 .. v8}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    const/16 v0, 0x100

    .line 341
    .line 342
    invoke-static {p0, v0}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    :goto_b
    return-object v1
.end method

.method public static final δ(Ljava/lang/ClassLoader;[Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_f

    .line 6
    .line 7
    :cond_0
    sget v1, Lkn0;->κ:I

    .line 8
    .line 9
    sget-object v2, Lq20;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x2

    .line 20
    const-string v5, "~79E905EDE4AF0EE2DF6A19518D472B26126585960FE2A8468D87631C161352"

    .line 21
    .line 22
    const/4 v7, 0x1

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    :goto_0
    const/4 v8, 0x0

    .line 26
    goto/16 :goto_a

    .line 27
    .line 28
    :cond_1
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    move-object/from16 v8, p0

    .line 33
    .line 34
    invoke-static {v8, v3}, Lq20;->η(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    :goto_1
    const/4 v3, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    const-string v9, "Standard"

    .line 50
    .line 51
    const-string v10, "SuperHigh"

    .line 52
    .line 53
    const-string v11, "ExtremelyHigh"

    .line 54
    .line 55
    const-string v12, "High"

    .line 56
    .line 57
    if-eqz v1, :cond_7

    .line 58
    .line 59
    if-eq v1, v7, :cond_6

    .line 60
    .line 61
    if-eq v1, v4, :cond_5

    .line 62
    .line 63
    const/4 v13, 0x3

    .line 64
    if-eq v1, v13, :cond_4

    .line 65
    .line 66
    invoke-static {v12}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const-string v13, "FourK"

    .line 72
    .line 73
    const-string v14, "Original"

    .line 74
    .line 75
    const-string v15, "EXTREMELY_HIGH"

    .line 76
    .line 77
    filled-new-array {v11, v15, v13, v14}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    invoke-static {v13}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    const-string v13, "FullHigh"

    .line 87
    .line 88
    const-string v14, "FHD"

    .line 89
    .line 90
    const-string v15, "SUPER_HIGH"

    .line 91
    .line 92
    filled-new-array {v10, v15, v13, v14}, [Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v13

    .line 96
    invoke-static {v13}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v13

    .line 100
    goto :goto_2

    .line 101
    :cond_6
    const-string v13, "HD"

    .line 102
    .line 103
    filled-new-array {v12, v13}, [Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    invoke-static {v13}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    goto :goto_2

    .line 112
    :cond_7
    const-string v13, "SD"

    .line 113
    .line 114
    const-string v14, "Lower"

    .line 115
    .line 116
    filled-new-array {v9, v13, v14}, [Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    invoke-static {v13}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    :goto_2
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v14

    .line 132
    if-eqz v14, :cond_c

    .line 133
    .line 134
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v14

    .line 138
    check-cast v14, Ljava/lang/String;

    .line 139
    .line 140
    array-length v15, v3

    .line 141
    const/4 v8, 0x0

    .line 142
    :goto_4
    if-ge v8, v15, :cond_a

    .line 143
    .line 144
    aget-object v4, v3, v8

    .line 145
    .line 146
    instance-of v6, v4, Ljava/lang/Enum;

    .line 147
    .line 148
    if-eqz v6, :cond_8

    .line 149
    .line 150
    move-object v6, v4

    .line 151
    check-cast v6, Ljava/lang/Enum;

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_8
    const/4 v6, 0x0

    .line 155
    :goto_5
    if-eqz v6, :cond_9

    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    if-eqz v6, :cond_9

    .line 162
    .line 163
    invoke-virtual {v6, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-ne v6, v7, :cond_9

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 171
    .line 172
    const/4 v4, 0x2

    .line 173
    goto :goto_4

    .line 174
    :cond_a
    const/4 v4, 0x0

    .line 175
    :goto_6
    if-eqz v4, :cond_b

    .line 176
    .line 177
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-object v3, v4

    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_b
    const/4 v4, 0x2

    .line 188
    goto :goto_3

    .line 189
    :cond_c
    filled-new-array {v9, v12, v10, v11}, [Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-static {v4}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    sub-int/2addr v6, v7

    .line 202
    const/4 v8, 0x0

    .line 203
    invoke-static {v1, v8, v6}, Lj81;->μ(III)I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    invoke-static {v6, v4}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    check-cast v4, Ljava/lang/String;

    .line 212
    .line 213
    array-length v6, v3

    .line 214
    move v9, v8

    .line 215
    :goto_7
    if-ge v9, v6, :cond_f

    .line 216
    .line 217
    aget-object v10, v3, v9

    .line 218
    .line 219
    instance-of v11, v10, Ljava/lang/Enum;

    .line 220
    .line 221
    if-eqz v11, :cond_d

    .line 222
    .line 223
    move-object v11, v10

    .line 224
    check-cast v11, Ljava/lang/Enum;

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_d
    const/4 v11, 0x0

    .line 228
    :goto_8
    if-eqz v11, :cond_e

    .line 229
    .line 230
    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v11

    .line 234
    if-eqz v11, :cond_e

    .line 235
    .line 236
    invoke-virtual {v11, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    if-ne v11, v7, :cond_e

    .line 241
    .line 242
    move-object v3, v10

    .line 243
    goto :goto_9

    .line 244
    :cond_e
    add-int/lit8 v9, v9, 0x1

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_f
    const/4 v3, 0x0

    .line 248
    :goto_9
    if-eqz v3, :cond_10

    .line 249
    .line 250
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-virtual {v2, v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    :cond_10
    :goto_a
    sget v2, Lkn0;->κ:I

    .line 258
    .line 259
    if-eqz v2, :cond_13

    .line 260
    .line 261
    if-eq v2, v7, :cond_12

    .line 262
    .line 263
    const/4 v4, 0x2

    .line 264
    if-eq v2, v4, :cond_11

    .line 265
    .line 266
    const-wide/32 v6, 0x500000

    .line 267
    .line 268
    .line 269
    goto :goto_b

    .line 270
    :cond_11
    const-wide/32 v6, 0x300000

    .line 271
    .line 272
    .line 273
    goto :goto_b

    .line 274
    :cond_12
    const-wide/32 v6, 0x180000

    .line 275
    .line 276
    .line 277
    goto :goto_b

    .line 278
    :cond_13
    const-wide/32 v6, 0x80000

    .line 279
    .line 280
    .line 281
    :goto_b
    array-length v2, v0

    .line 282
    :goto_c
    if-ge v8, v2, :cond_19

    .line 283
    .line 284
    aget-object v4, v0, v8

    .line 285
    .line 286
    if-nez v4, :cond_14

    .line 287
    .line 288
    goto :goto_e

    .line 289
    :cond_14
    if-eqz v3, :cond_15

    .line 290
    .line 291
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    if-eqz v9, :cond_15

    .line 308
    .line 309
    aput-object v3, v0, v8

    .line 310
    .line 311
    goto :goto_e

    .line 312
    :cond_15
    instance-of v9, v4, Ljava/lang/Long;

    .line 313
    .line 314
    if-eqz v9, :cond_16

    .line 315
    .line 316
    move-object v9, v4

    .line 317
    check-cast v9, Ljava/lang/Number;

    .line 318
    .line 319
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 320
    .line 321
    .line 322
    move-result-wide v9

    .line 323
    cmp-long v9, v9, v6

    .line 324
    .line 325
    if-lez v9, :cond_16

    .line 326
    .line 327
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    aput-object v4, v0, v8

    .line 332
    .line 333
    goto :goto_e

    .line 334
    :cond_16
    instance-of v9, v4, Ljava/util/List;

    .line 335
    .line 336
    if-eqz v9, :cond_17

    .line 337
    .line 338
    check-cast v4, Ljava/lang/Iterable;

    .line 339
    .line 340
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    if-eqz v9, :cond_18

    .line 349
    .line 350
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    invoke-static {v9, v3, v6, v7, v1}, Lq20;->μ(Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 355
    .line 356
    .line 357
    goto :goto_d

    .line 358
    :cond_17
    invoke-static {v4, v3, v6, v7, v1}, Lq20;->μ(Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 359
    .line 360
    .line 361
    :cond_18
    :goto_e
    add-int/lit8 v8, v8, 0x1

    .line 362
    .line 363
    goto :goto_c

    .line 364
    :cond_19
    :goto_f
    return-void
.end method

.method public static ε(Ljava/lang/ClassLoader;)V
    .locals 7

    .line 1
    const-string v0, "cancelAllPreloadTasks"

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    sget-wide v3, Lq20;->γ:J

    .line 8
    .line 9
    sub-long v3, v1, v3

    .line 10
    .line 11
    const-wide/16 v5, 0x5dc

    .line 12
    .line 13
    cmp-long v3, v3, v5

    .line 14
    .line 15
    if-gez v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sput-wide v1, Lq20;->γ:J

    .line 19
    .line 20
    const-string v1, "~791C379109EE249A17C75D97B08A46A1FBF5443CB34C0F44BBA61A1BA3C0B72730E4"

    .line 21
    .line 22
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {p0, v1}, Lq20;->η(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    :try_start_0
    new-array v2, v1, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {p0, v0, v2}, Lqe0;->β(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :catchall_0
    :try_start_1
    const-string v2, "cancelAllWaitReqs"

    .line 40
    .line 41
    new-array v1, v1, [Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {p0, v2, v1}, Lqe0;->β(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    .line 45
    .line 46
    :catchall_1
    invoke-static {v0}, Lq20;->κ(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static ζ(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_2
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    const-wide/16 v0, 0x0

    .line 39
    .line 40
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_3
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_4
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    const-wide/16 v0, 0x0

    .line 68
    .line 69
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_5
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    return-object v0
.end method

.method public static η(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance p1, Leo1;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object p0, p1

    .line 13
    :goto_0
    instance-of p1, p0, Leo1;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 19
    .line 20
    return-object p0
.end method

.method public static θ(Ljava/lang/reflect/Method;Lm01;)V
    .locals 3

    .line 1
    const-string v0, "hook "

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lq20;->α:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v2, 0x1

    .line 17
    :try_start_0
    invoke-virtual {p0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 18
    .line 19
    .line 20
    sget-object v2, Lxq0;->α:Lxq0;

    .line 21
    .line 22
    invoke-virtual {v2, p0, p1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 23
    .line 24
    .line 25
    new-instance p0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lq20;->κ(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    new-instance p1, Leo1;

    .line 45
    .line 46
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p0, p1

    .line 50
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string p1, "r74ba2c32221e54da"

    .line 61
    .line 62
    invoke-static {p1, v1, p0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_1
    return-void
.end method

.method public static ι(Ljava/lang/ClassLoader;)V
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lq20;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v6, 0x0

    .line 7
    const/4 v7, 0x1

    .line 8
    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v8, 0x3

    .line 13
    const/4 v9, 0x2

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v0, "feed_enable_preload"

    .line 17
    .line 18
    invoke-static {v0, v6}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sput-boolean v0, Lkn0;->θ:Z

    .line 23
    .line 24
    const-string v0, "feed_preload_count"

    .line 25
    .line 26
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2, v0, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move v0, v9

    .line 36
    :goto_0
    const/16 v2, 0x8

    .line 37
    .line 38
    invoke-static {v0, v6, v2}, Lj81;->μ(III)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sput v0, Lkn0;->ι:I

    .line 43
    .line 44
    const-string v0, "feed_preload_quality"

    .line 45
    .line 46
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v2, v0, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 51
    .line 52
    .line 53
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move v0, v7

    .line 56
    :goto_1
    invoke-static {v0, v6, v8}, Lj81;->μ(III)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    sput v0, Lkn0;->κ:I

    .line 61
    .line 62
    const-string v0, "feed_preload_debug_log"

    .line 63
    .line 64
    invoke-static {v0, v6}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    sput-boolean v0, Lkn0;->λ:Z

    .line 69
    .line 70
    sget-object v0, Lkn0;->μ:Ll20;

    .line 71
    .line 72
    sget-object v2, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 73
    .line 74
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    const-string v0, "Settings initialized with PrefsManager"

    .line 78
    .line 79
    invoke-static {v0}, Lq20;->κ(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_0
    sget-object v0, Lkx;->Ｈ:Lkx;

    .line 83
    .line 84
    new-instance v4, Lr20;

    .line 85
    .line 86
    const/4 v2, 0x5

    .line 87
    invoke-direct {v4, p0, v2}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 88
    .line 89
    .line 90
    new-instance v5, Lt20;

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    invoke-direct {v5, p0, v2}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 94
    .line 95
    .line 96
    const/4 v3, 0x1

    .line 97
    move-object v1, p0

    .line 98
    invoke-static/range {v0 .. v5}, Lpd2;->Ο(Lkx;Ljava/lang/ClassLoader;ZILp70;La80;)Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    new-instance v3, Lbm;

    .line 103
    .line 104
    const/4 v4, 0x7

    .line 105
    const/4 v5, 0x0

    .line 106
    invoke-direct {v3, v4, p0, v5}, Lbm;-><init>(ILjava/lang/ClassLoader;Z)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_1

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Ljava/lang/reflect/Method;

    .line 124
    .line 125
    invoke-static {v4, v3}, Lq20;->θ(Ljava/lang/reflect/Method;Lm01;)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_1
    sget-object v0, Lkx;->Ｉ:Lkx;

    .line 130
    .line 131
    new-instance v4, Lr20;

    .line 132
    .line 133
    const/4 v3, 0x4

    .line 134
    invoke-direct {v4, p0, v3}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 135
    .line 136
    .line 137
    new-instance v5, Lbb;

    .line 138
    .line 139
    const/16 v3, 0x1d

    .line 140
    .line 141
    invoke-direct {v5, p0, v3}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 142
    .line 143
    .line 144
    const/4 v3, 0x3

    .line 145
    move-object v1, p0

    .line 146
    invoke-static/range {v0 .. v5}, Lpd2;->Ο(Lkx;Ljava/lang/ClassLoader;ZILp70;La80;)Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    :cond_2
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 159
    .line 160
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 161
    .line 162
    if-eqz v3, :cond_5

    .line 163
    .line 164
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    check-cast v3, Ljava/lang/reflect/Method;

    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 179
    .line 180
    invoke-static {v5, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_3

    .line 185
    .line 186
    array-length v5, v4

    .line 187
    if-ne v5, v9, :cond_3

    .line 188
    .line 189
    aget-object v5, v4, v6

    .line 190
    .line 191
    invoke-static {v5, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_3

    .line 196
    .line 197
    aget-object v5, v4, v7

    .line 198
    .line 199
    invoke-static {v5, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-eqz v5, :cond_3

    .line 204
    .line 205
    new-instance v4, Lf10;

    .line 206
    .line 207
    const/4 v5, 0x5

    .line 208
    invoke-direct {v4, v5}, Lf10;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-static {v3, v4}, Lq20;->θ(Ljava/lang/reflect/Method;Lm01;)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_3
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    const-string v13, "android.view.View"

    .line 224
    .line 225
    invoke-virtual {v5, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-eqz v5, :cond_4

    .line 230
    .line 231
    array-length v5, v4

    .line 232
    if-ne v5, v8, :cond_4

    .line 233
    .line 234
    aget-object v5, v4, v6

    .line 235
    .line 236
    invoke-static {v5, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-eqz v5, :cond_4

    .line 241
    .line 242
    aget-object v5, v4, v7

    .line 243
    .line 244
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    const-string v11, "android.view.ViewGroup"

    .line 249
    .line 250
    invoke-virtual {v5, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-eqz v5, :cond_4

    .line 255
    .line 256
    aget-object v5, v4, v9

    .line 257
    .line 258
    invoke-static {v5, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    if-eqz v5, :cond_4

    .line 263
    .line 264
    new-instance v4, Lf10;

    .line 265
    .line 266
    const/4 v5, 0x6

    .line 267
    invoke-direct {v4, v5}, Lf10;-><init>(I)V

    .line 268
    .line 269
    .line 270
    invoke-static {v3, v4}, Lq20;->θ(Ljava/lang/reflect/Method;Lm01;)V

    .line 271
    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_4
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    invoke-static {v5, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    if-eqz v5, :cond_2

    .line 283
    .line 284
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    array-length v4, v4

    .line 288
    if-nez v4, :cond_2

    .line 289
    .line 290
    new-instance v4, Lf10;

    .line 291
    .line 292
    const/4 v5, 0x7

    .line 293
    invoke-direct {v4, v5}, Lf10;-><init>(I)V

    .line 294
    .line 295
    .line 296
    invoke-static {v3, v4}, Lq20;->θ(Ljava/lang/reflect/Method;Lm01;)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_3

    .line 300
    .line 301
    :cond_5
    sget-object v0, Lkx;->Ｊ:Lkx;

    .line 302
    .line 303
    new-instance v4, Lr20;

    .line 304
    .line 305
    const/4 v3, 0x6

    .line 306
    invoke-direct {v4, p0, v3}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 307
    .line 308
    .line 309
    new-instance v5, Lt20;

    .line 310
    .line 311
    const/4 v3, 0x1

    .line 312
    invoke-direct {v5, p0, v3}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 313
    .line 314
    .line 315
    const/16 v3, 0x8

    .line 316
    .line 317
    move-object v1, p0

    .line 318
    invoke-static/range {v0 .. v5}, Lpd2;->Ο(Lkx;Ljava/lang/ClassLoader;ZILp70;La80;)Ljava/util/ArrayList;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    if-eqz v3, :cond_b

    .line 331
    .line 332
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    check-cast v3, Ljava/lang/reflect/Method;

    .line 337
    .line 338
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    if-eqz v4, :cond_6

    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 345
    .line 346
    .line 347
    move-result v5

    .line 348
    sparse-switch v5, :sswitch_data_0

    .line 349
    .line 350
    .line 351
    goto :goto_4

    .line 352
    :sswitch_0
    const-string v5, "addPreloadMedias"

    .line 353
    .line 354
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    if-nez v4, :cond_7

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :sswitch_1
    const-string v5, "insertPreloadMedia"

    .line 362
    .line 363
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    if-nez v4, :cond_7

    .line 368
    .line 369
    goto :goto_4

    .line 370
    :cond_7
    new-instance v4, Lbm;

    .line 371
    .line 372
    const/4 v5, 0x4

    .line 373
    const/4 v8, 0x0

    .line 374
    invoke-direct {v4, v5, p0, v8}, Lbm;-><init>(ILjava/lang/ClassLoader;Z)V

    .line 375
    .line 376
    .line 377
    invoke-static {v3, v4}, Lq20;->θ(Ljava/lang/reflect/Method;Lm01;)V

    .line 378
    .line 379
    .line 380
    goto :goto_4

    .line 381
    :sswitch_2
    const-string v5, "addTask"

    .line 382
    .line 383
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v4

    .line 387
    if-nez v4, :cond_9

    .line 388
    .line 389
    goto :goto_4

    .line 390
    :sswitch_3
    const-string v5, "addPreloadModelMedia"

    .line 391
    .line 392
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    if-nez v4, :cond_9

    .line 397
    .line 398
    goto :goto_4

    .line 399
    :sswitch_4
    const-string v5, "startDataLoader"

    .line 400
    .line 401
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    if-nez v4, :cond_8

    .line 406
    .line 407
    goto :goto_4

    .line 408
    :cond_8
    new-instance v4, Lbm;

    .line 409
    .line 410
    const/4 v5, 0x5

    .line 411
    const/4 v8, 0x0

    .line 412
    invoke-direct {v4, v5, p0, v8}, Lbm;-><init>(ILjava/lang/ClassLoader;Z)V

    .line 413
    .line 414
    .line 415
    invoke-static {v3, v4}, Lq20;->θ(Ljava/lang/reflect/Method;Lm01;)V

    .line 416
    .line 417
    .line 418
    goto :goto_4

    .line 419
    :sswitch_5
    const-string v5, "addPriorityPreloadTask"

    .line 420
    .line 421
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    if-nez v4, :cond_9

    .line 426
    .line 427
    goto :goto_4

    .line 428
    :cond_9
    new-instance v4, Lbm;

    .line 429
    .line 430
    const/4 v5, 0x6

    .line 431
    const/4 v8, 0x0

    .line 432
    invoke-direct {v4, v5, p0, v8}, Lbm;-><init>(ILjava/lang/ClassLoader;Z)V

    .line 433
    .line 434
    .line 435
    invoke-static {v3, v4}, Lq20;->θ(Ljava/lang/reflect/Method;Lm01;)V

    .line 436
    .line 437
    .line 438
    goto :goto_4

    .line 439
    :sswitch_6
    const-string v5, "setIntValue"

    .line 440
    .line 441
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    if-nez v4, :cond_a

    .line 446
    .line 447
    goto :goto_4

    .line 448
    :cond_a
    new-instance v4, Lf10;

    .line 449
    .line 450
    const/16 v5, 0x9

    .line 451
    .line 452
    invoke-direct {v4, v5}, Lf10;-><init>(I)V

    .line 453
    .line 454
    .line 455
    invoke-static {v3, v4}, Lq20;->θ(Ljava/lang/reflect/Method;Lm01;)V

    .line 456
    .line 457
    .line 458
    goto/16 :goto_4

    .line 459
    .line 460
    :cond_b
    sget-object v0, Lkx;->Ｋ:Lkx;

    .line 461
    .line 462
    new-instance v4, Lr20;

    .line 463
    .line 464
    const/4 v3, 0x3

    .line 465
    invoke-direct {v4, p0, v3}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 466
    .line 467
    .line 468
    new-instance v5, Lbb;

    .line 469
    .line 470
    const/16 v3, 0x1c

    .line 471
    .line 472
    invoke-direct {v5, p0, v3}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 473
    .line 474
    .line 475
    const/4 v3, 0x6

    .line 476
    move-object v1, p0

    .line 477
    invoke-static/range {v0 .. v5}, Lpd2;->Ο(Lkx;Ljava/lang/ClassLoader;ZILp70;La80;)Ljava/util/ArrayList;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    if-eqz v3, :cond_d

    .line 490
    .line 491
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    check-cast v3, Ljava/lang/reflect/Method;

    .line 496
    .line 497
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    move-result-object v4

    .line 501
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    invoke-static {v5, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v5

    .line 509
    if-eqz v5, :cond_c

    .line 510
    .line 511
    array-length v5, v4

    .line 512
    if-ne v5, v9, :cond_c

    .line 513
    .line 514
    aget-object v5, v4, v6

    .line 515
    .line 516
    invoke-static {v5, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v5

    .line 520
    if-eqz v5, :cond_c

    .line 521
    .line 522
    aget-object v4, v4, v7

    .line 523
    .line 524
    invoke-static {v4, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    if-eqz v4, :cond_c

    .line 529
    .line 530
    new-instance v4, Lf10;

    .line 531
    .line 532
    const/16 v5, 0x8

    .line 533
    .line 534
    invoke-direct {v4, v5}, Lf10;-><init>(I)V

    .line 535
    .line 536
    .line 537
    invoke-static {v3, v4}, Lq20;->θ(Ljava/lang/reflect/Method;Lm01;)V

    .line 538
    .line 539
    .line 540
    goto :goto_5

    .line 541
    :cond_c
    new-instance v4, Lbm;

    .line 542
    .line 543
    const/4 v5, 0x3

    .line 544
    const/4 v8, 0x0

    .line 545
    invoke-direct {v4, v5, p0, v8}, Lbm;-><init>(ILjava/lang/ClassLoader;Z)V

    .line 546
    .line 547
    .line 548
    invoke-static {v3, v4}, Lq20;->θ(Ljava/lang/reflect/Method;Lm01;)V

    .line 549
    .line 550
    .line 551
    goto :goto_5

    .line 552
    :cond_d
    sget-object v0, Lkx;->Ｌ:Lkx;

    .line 553
    .line 554
    new-instance v4, Lr20;

    .line 555
    .line 556
    const/4 v3, 0x2

    .line 557
    invoke-direct {v4, p0, v3}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 558
    .line 559
    .line 560
    new-instance v5, Lbb;

    .line 561
    .line 562
    const/16 v3, 0x1b

    .line 563
    .line 564
    invoke-direct {v5, p0, v3}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 565
    .line 566
    .line 567
    const/4 v3, 0x2

    .line 568
    move-object v1, p0

    .line 569
    invoke-static/range {v0 .. v5}, Lpd2;->Ο(Lkx;Ljava/lang/ClassLoader;ZILp70;La80;)Ljava/util/ArrayList;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    if-eqz v1, :cond_e

    .line 582
    .line 583
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    check-cast v1, Ljava/lang/reflect/Method;

    .line 588
    .line 589
    new-instance v2, Lxe;

    .line 590
    .line 591
    const/4 v3, 0x5

    .line 592
    const/4 v4, 0x0

    .line 593
    invoke-direct {v2, v1, v3, v4}, Lxe;-><init>(Ljava/lang/reflect/Method;IZ)V

    .line 594
    .line 595
    .line 596
    invoke-static {v1, v2}, Lq20;->θ(Ljava/lang/reflect/Method;Lm01;)V

    .line 597
    .line 598
    .line 599
    goto :goto_6

    .line 600
    :cond_e
    const-string v0, "installed/resolved, allowDexKitScan=false"

    .line 601
    .line 602
    invoke-static {v0}, Lq20;->κ(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    return-void

    .line 606
    nop

    .line 607
    :sswitch_data_0
    .sparse-switch
        -0x6848babc -> :sswitch_6
        -0x530b7377 -> :sswitch_5
        -0x4edecda1 -> :sswitch_4
        -0x453bd97d -> :sswitch_3
        -0x4476163a -> :sswitch_2
        0x213138b4 -> :sswitch_1
        0x68f20157 -> :sswitch_0
    .end sparse-switch
.end method

.method public static κ(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lkn0;->λ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "rab6107f7528a8217"

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static λ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    sget-boolean v0, Lkn0;->λ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sget-object v2, Lq20;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v2, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Ljava/lang/Long;

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    :goto_0
    sub-long v3, v0, v3

    .line 28
    .line 29
    const-wide/16 v5, 0xbb8

    .line 30
    .line 31
    cmp-long v3, v3, v5

    .line 32
    .line 33
    if-gez v3, :cond_2

    .line 34
    .line 35
    :goto_1
    return-void

    .line 36
    :cond_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v2, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    const-string p0, "rab6107f7528a8217"

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static μ(Ljava/lang/Object;Ljava/lang/Object;JI)V
    .locals 11

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_8

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "~79C18A000CC51E6256484DBE4323D135EABA1849AB"

    .line 14
    .line 15
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    const-string v1, "X.C231"

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto/16 :goto_8

    .line 35
    .line 36
    :cond_1
    const-string v0, "="

    .line 37
    .line 38
    const-string v1, "."

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    const/4 v4, 0x0

    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    :try_start_0
    const-string v5, "mResolution"

    .line 45
    .line 46
    invoke-static {v5, p0, p1}, Lqe0;->ξ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    new-instance v6, Ljf;

    .line 55
    .line 56
    invoke-direct {v6, v5, v4, v3}, Ljf;-><init>(Ljava/lang/Class;Lop;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {v6}, Le81;->ι(Le80;)Lts1;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    :catchall_1
    :cond_2
    invoke-virtual {v5}, Lts1;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_4

    .line 68
    .line 69
    invoke-virtual {v5}, Lts1;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Ljava/lang/reflect/Field;

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-nez v7, :cond_2

    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const-string v8, "~79E905EDE4AF0EE2DF6A19518D472B26126585960FE2A8468D87631C161352"

    .line 94
    .line 95
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-nez v7, :cond_3

    .line 104
    .line 105
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_2

    .line 118
    .line 119
    :cond_3
    :try_start_1
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    new-instance v8, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    const-string v9, "set resolution "

    .line 143
    .line 144
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-static {v6}, Lq20;->κ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 167
    .line 168
    .line 169
    :cond_4
    :goto_0
    const-string p1, "setPreloadSize "

    .line 170
    .line 171
    :try_start_2
    const-string v5, "getPreloadSize"

    .line 172
    .line 173
    new-array v6, v2, [Ljava/lang/Object;

    .line 174
    .line 175
    invoke-static {p0, v5, v6}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    instance-of v6, v5, Ljava/lang/Number;

    .line 180
    .line 181
    if-eqz v6, :cond_5

    .line 182
    .line 183
    check-cast v5, Ljava/lang/Number;

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :catchall_2
    move-exception v5

    .line 187
    goto :goto_2

    .line 188
    :cond_5
    move-object v5, v4

    .line 189
    :goto_1
    if-eqz v5, :cond_6

    .line 190
    .line 191
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 192
    .line 193
    .line 194
    move-result-wide v5

    .line 195
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 196
    .line 197
    .line 198
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 199
    goto :goto_3

    .line 200
    :cond_6
    move-object v5, v4

    .line 201
    goto :goto_3

    .line 202
    :goto_2
    new-instance v6, Leo1;

    .line 203
    .line 204
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    move-object v5, v6

    .line 208
    :goto_3
    instance-of v6, v5, Leo1;

    .line 209
    .line 210
    if-eqz v6, :cond_7

    .line 211
    .line 212
    move-object v5, v4

    .line 213
    :cond_7
    check-cast v5, Ljava/lang/Long;

    .line 214
    .line 215
    if-eqz v5, :cond_8

    .line 216
    .line 217
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 218
    .line 219
    .line 220
    move-result-wide v6

    .line 221
    const-wide/16 v8, 0x0

    .line 222
    .line 223
    cmp-long v6, v6, v8

    .line 224
    .line 225
    if-lez v6, :cond_8

    .line 226
    .line 227
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 228
    .line 229
    .line 230
    move-result-wide v5

    .line 231
    cmp-long v5, v5, p2

    .line 232
    .line 233
    if-gtz v5, :cond_8

    .line 234
    .line 235
    goto/16 :goto_6

    .line 236
    .line 237
    :cond_8
    :try_start_3
    sget-object v5, Lqe0;->α:Ljava/lang/Object;

    .line 238
    .line 239
    const-string v5, "setPreloadSize"

    .line 240
    .line 241
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-static {p0, v5, v6}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    new-instance v6, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v6, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v6, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-static {p1}, Lq20;->κ(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 279
    .line 280
    .line 281
    goto/16 :goto_6

    .line 282
    .line 283
    :catchall_3
    const-string p1, "LIZJ"

    .line 284
    .line 285
    const-string v0, "LJ"

    .line 286
    .line 287
    const-string v5, "mPreloadSize"

    .line 288
    .line 289
    const-string v6, "preloadSize"

    .line 290
    .line 291
    filled-new-array {v5, v6, p1, v0}, [Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-static {p1}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    new-instance v5, Ljf;

    .line 304
    .line 305
    invoke-direct {v5, v0, v4, v3}, Ljf;-><init>(Ljava/lang/Class;Lop;I)V

    .line 306
    .line 307
    .line 308
    invoke-static {v5}, Le81;->ι(Le80;)Lts1;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    :catchall_4
    :cond_9
    :goto_4
    invoke-virtual {v0}, Lts1;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-eqz v5, :cond_c

    .line 317
    .line 318
    invoke-virtual {v0}, Lts1;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    check-cast v5, Ljava/lang/reflect/Field;

    .line 323
    .line 324
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    if-nez v6, :cond_9

    .line 333
    .line 334
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    invoke-interface {p1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v6

    .line 342
    if-eqz v6, :cond_9

    .line 343
    .line 344
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 349
    .line 350
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    if-nez v6, :cond_a

    .line 355
    .line 356
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    const-class v7, Ljava/lang/Long;

    .line 361
    .line 362
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v6

    .line 366
    if-eqz v6, :cond_9

    .line 367
    .line 368
    :cond_a
    :try_start_4
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    instance-of v7, v6, Ljava/lang/Number;

    .line 376
    .line 377
    if-eqz v7, :cond_b

    .line 378
    .line 379
    check-cast v6, Ljava/lang/Number;

    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_b
    move-object v6, v4

    .line 383
    :goto_5
    if-eqz v6, :cond_9

    .line 384
    .line 385
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 386
    .line 387
    .line 388
    move-result-wide v6

    .line 389
    cmp-long v8, v6, p2

    .line 390
    .line 391
    if-lez v8, :cond_9

    .line 392
    .line 393
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 394
    .line 395
    .line 396
    move-result-object v8

    .line 397
    invoke-virtual {v5, p0, v8}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    move-result-object v8

    .line 404
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    new-instance v9, Ljava/lang/StringBuilder;

    .line 413
    .line 414
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 415
    .line 416
    .line 417
    const-string v10, "limit preload size "

    .line 418
    .line 419
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    const-string v5, ": "

    .line 432
    .line 433
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    const-string v5, " -> "

    .line 440
    .line 441
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v9, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v5

    .line 451
    invoke-static {v5}, Lq20;->κ(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 452
    .line 453
    .line 454
    goto/16 :goto_4

    .line 455
    .line 456
    :cond_c
    :goto_6
    if-eqz p4, :cond_f

    .line 457
    .line 458
    if-eq p4, v3, :cond_e

    .line 459
    .line 460
    const/4 p1, 0x2

    .line 461
    if-eq p4, p1, :cond_d

    .line 462
    .line 463
    goto :goto_7

    .line 464
    :cond_d
    move v2, v3

    .line 465
    goto :goto_7

    .line 466
    :cond_e
    const/4 v2, 0x3

    .line 467
    goto :goto_7

    .line 468
    :cond_f
    const/4 v2, 0x5

    .line 469
    :goto_7
    :try_start_5
    sget-object p1, Lqe0;->α:Ljava/lang/Object;

    .line 470
    .line 471
    const-string p1, "setPriorityLevel"

    .line 472
    .line 473
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object p2

    .line 477
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object p2

    .line 481
    invoke-static {p0, p1, p2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 482
    .line 483
    .line 484
    :catchall_5
    :goto_8
    return-void
.end method
