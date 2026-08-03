.class public final Lia/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lab/b;

.field public final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public volatile d:Ljava/lang/Class;

.field public volatile e:Z


# direct methods
.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lia/h;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lia/h;->b:Lab/b;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lia/h;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    return-void
.end method

.method public static a(Lia/b;)Lia/f;
    .locals 3

    .line 1
    new-instance v0, Lia/f;

    .line 2
    .line 3
    iget-object v1, p0, Lia/b;->a:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "comment:"

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const v2, 0x3fffffff    # 1.9999999f

    .line 16
    .line 17
    .line 18
    and-int/2addr v1, v2

    .line 19
    const/high16 v2, -0x80000000

    .line 20
    .line 21
    or-int/2addr v1, v2

    .line 22
    iget-object p0, p0, Lia/b;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {v0, v1, p0}, Lia/f;-><init>(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static c(Ljava/lang/Object;Ljava/util/HashSet;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p0}, La7/a;->O(Ljava/lang/Object;)Lia/v;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_2

    .line 13
    .line 14
    iget v0, p0, Lia/v;->b:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    new-instance v0, Lia/f;

    .line 21
    .line 22
    iget v1, p0, Lia/v;->c:I

    .line 23
    .line 24
    iget-object p0, p0, Lia/v;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {v0, v1, p0}, Lia/f;-><init>(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public static e(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lgg/x;->e(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lgg/x;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, p1, v0}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static h(Ljava/io/ByteArrayOutputStream;ILjava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    shl-int/lit8 p1, p1, 0x3

    .line 14
    .line 15
    or-int/lit8 p1, p1, 0x2

    .line 16
    .line 17
    int-to-long v0, p1

    .line 18
    invoke-static {p0, v0, v1}, Lia/h;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 19
    .line 20
    .line 21
    array-length p1, p2

    .line 22
    int-to-long v0, p1

    .line 23
    invoke-static {p0, v0, v1}, Lia/h;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, Ljava/io/OutputStream;->write([B)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static i(Ljava/io/ByteArrayOutputStream;J)V
    .locals 4

    .line 1
    :goto_0
    const-wide/16 v0, -0x80

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    long-to-int p1, p1

    .line 11
    invoke-virtual {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-wide/16 v0, 0x7f

    .line 16
    .line 17
    and-long/2addr v0, p1

    .line 18
    const-wide/16 v2, 0x80

    .line 19
    .line 20
    or-long/2addr v0, v2

    .line 21
    long-to-int v0, v0

    .line 22
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x7

    .line 26
    ushr-long/2addr p1, v0

    .line 27
    goto :goto_0
.end method


# virtual methods
.method public final d([BLia/c;Lia/c;ZZ)Lia/a;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move-object/from16 v2, p3

    .line 8
    .line 9
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 10
    .line 11
    iget-object v4, v0, Lia/h;->a:Lr8/g;

    .line 12
    .line 13
    iget-object v4, v4, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 14
    .line 15
    const-string v5, "com.tencent.mm.protocal.protobuf.SnsObject"

    .line 16
    .line 17
    invoke-static {v5, v4}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const/4 v9, 0x0

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    new-array v5, v9, [Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    new-array v5, v9, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const-string v6, "parseFrom"

    .line 43
    .line 44
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-static {v5, v6, v7}, Lh/Hchat/utils/KavaReflector;->findCompatibleMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-static {v5, v4, v6}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_1

    .line 63
    .line 64
    :cond_0
    const/4 v11, 0x0

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move-object v11, v4

    .line 67
    :goto_0
    if-eqz v11, :cond_2b

    .line 68
    .line 69
    const-string v4, "LikeUserList"

    .line 70
    .line 71
    invoke-static {v11, v4}, Lia/h;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    if-eqz v12, :cond_2a

    .line 76
    .line 77
    const-string v4, "CommentUserList"

    .line 78
    .line 79
    invoke-static {v11, v4}, Lia/h;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    if-eqz v13, :cond_29

    .line 84
    .line 85
    const-string v14, "LikeCount"

    .line 86
    .line 87
    invoke-static {v11, v14}, Lia/h;->b(Ljava/lang/Object;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    const-string v4, "LikeUserListCount"

    .line 92
    .line 93
    invoke-static {v11, v4}, Lia/h;->b(Ljava/lang/Object;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v16

    .line 97
    const-string v5, "CommentCount"

    .line 98
    .line 99
    invoke-static {v11, v5}, Lia/h;->b(Ljava/lang/Object;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v17

    .line 103
    const-string v6, "CommentUserListCount"

    .line 104
    .line 105
    invoke-static {v11, v6}, Lia/h;->b(Ljava/lang/Object;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v18

    .line 109
    new-instance v7, Ldg/n;

    .line 110
    .line 111
    const/4 v9, 0x6

    .line 112
    invoke-direct {v7, v12, v9}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 113
    .line 114
    .line 115
    new-instance v9, Ldg/n;

    .line 116
    .line 117
    const/16 v19, 0x0

    .line 118
    .line 119
    const/4 v10, 0x6

    .line 120
    invoke-direct {v9, v13, v10}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 121
    .line 122
    .line 123
    invoke-static {v7, v9}, Lng/m;->Y(Lng/j;Ldg/n;)Ldg/j;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    invoke-static {v7}, Lng/m;->U(Lng/j;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    if-eqz v7, :cond_2

    .line 132
    .line 133
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    goto :goto_1

    .line 138
    :cond_2
    move-object/from16 v7, v19

    .line 139
    .line 140
    :goto_1
    iget-object v9, v2, Lia/c;->a:Ljava/util/List;

    .line 141
    .line 142
    new-instance v10, Ljava/util/HashSet;

    .line 143
    .line 144
    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v20

    .line 155
    move-object/from16 v21, v5

    .line 156
    .line 157
    const-string v5, "like:"

    .line 158
    .line 159
    const v22, 0x3fffffff    # 1.9999999f

    .line 160
    .line 161
    .line 162
    const/high16 v23, -0x80000000

    .line 163
    .line 164
    if-eqz v20, :cond_3

    .line 165
    .line 166
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v20

    .line 170
    move-object/from16 v24, v3

    .line 171
    .line 172
    move-object/from16 v3, v20

    .line 173
    .line 174
    check-cast v3, Lia/d;

    .line 175
    .line 176
    move-object/from16 v20, v4

    .line 177
    .line 178
    new-instance v4, Lia/g;

    .line 179
    .line 180
    move-object/from16 v25, v6

    .line 181
    .line 182
    iget-object v6, v3, Lia/d;->a:Ljava/lang/String;

    .line 183
    .line 184
    move-object/from16 v26, v7

    .line 185
    .line 186
    new-instance v7, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    and-int v5, v5, v22

    .line 203
    .line 204
    or-int v5, v5, v23

    .line 205
    .line 206
    iget-object v3, v3, Lia/d;->a:Ljava/lang/String;

    .line 207
    .line 208
    invoke-direct {v4, v5, v3}, Lia/g;-><init>(ILjava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v10, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-object/from16 v4, v20

    .line 215
    .line 216
    move-object/from16 v5, v21

    .line 217
    .line 218
    move-object/from16 v3, v24

    .line 219
    .line 220
    move-object/from16 v6, v25

    .line 221
    .line 222
    move-object/from16 v7, v26

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_3
    move-object/from16 v24, v3

    .line 226
    .line 227
    move-object/from16 v20, v4

    .line 228
    .line 229
    move-object/from16 v25, v6

    .line 230
    .line 231
    move-object/from16 v26, v7

    .line 232
    .line 233
    iget-object v2, v2, Lia/c;->b:Ljava/util/List;

    .line 234
    .line 235
    new-instance v3, Ljava/util/HashSet;

    .line 236
    .line 237
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-eqz v4, :cond_4

    .line 249
    .line 250
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    check-cast v4, Lia/b;

    .line 255
    .line 256
    invoke-static {v4}, Lia/h;->a(Lia/b;)Lia/f;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_4
    new-instance v2, Lia/e;

    .line 265
    .line 266
    const/4 v4, 0x0

    .line 267
    invoke-direct {v2, v0, v10, v4}, Lia/e;-><init>(Lia/h;Ljava/util/HashSet;I)V

    .line 268
    .line 269
    .line 270
    new-instance v4, Lia/e;

    .line 271
    .line 272
    const/4 v6, 0x1

    .line 273
    invoke-direct {v4, v0, v3, v6}, Lia/e;-><init>(Lia/h;Ljava/util/HashSet;I)V

    .line 274
    .line 275
    .line 276
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    if-eqz v3, :cond_5

    .line 281
    .line 282
    const/4 v9, 0x0

    .line 283
    goto :goto_5

    .line 284
    :cond_5
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    const/4 v6, 0x0

    .line 289
    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    if-eqz v7, :cond_8

    .line 294
    .line 295
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    invoke-virtual {v2, v7}, Lia/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    check-cast v7, Ljava/lang/Boolean;

    .line 304
    .line 305
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    if-eqz v7, :cond_6

    .line 310
    .line 311
    add-int/lit8 v6, v6, 0x1

    .line 312
    .line 313
    if-ltz v6, :cond_7

    .line 314
    .line 315
    goto :goto_4

    .line 316
    :cond_7
    invoke-static {}, La/a;->P0()V

    .line 317
    .line 318
    .line 319
    throw v19

    .line 320
    :cond_8
    move v9, v6

    .line 321
    :goto_5
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    if-eqz v3, :cond_9

    .line 326
    .line 327
    const/4 v10, 0x0

    .line 328
    goto :goto_7

    .line 329
    :cond_9
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    const/4 v6, 0x0

    .line 334
    :cond_a
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    if-eqz v7, :cond_c

    .line 339
    .line 340
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    invoke-virtual {v4, v7}, Lia/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    check-cast v7, Ljava/lang/Boolean;

    .line 349
    .line 350
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    if-eqz v7, :cond_a

    .line 355
    .line 356
    add-int/lit8 v6, v6, 0x1

    .line 357
    .line 358
    if-ltz v6, :cond_b

    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_b
    invoke-static {}, La/a;->P0()V

    .line 362
    .line 363
    .line 364
    throw v19

    .line 365
    :cond_c
    move v10, v6

    .line 366
    :goto_7
    invoke-static {v2, v12}, Ltf/r;->i1(Lfg/l;Ljava/util/List;)Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    invoke-static {v4, v13}, Ltf/r;->i1(Lfg/l;Ljava/util/List;)Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    if-nez v3, :cond_e

    .line 375
    .line 376
    if-eqz v2, :cond_d

    .line 377
    .line 378
    goto :goto_8

    .line 379
    :cond_d
    const/4 v2, 0x0

    .line 380
    goto :goto_9

    .line 381
    :cond_e
    :goto_8
    const/4 v2, 0x1

    .line 382
    :goto_9
    new-instance v3, Ljava/util/HashSet;

    .line 383
    .line 384
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 385
    .line 386
    .line 387
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    :cond_f
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 392
    .line 393
    .line 394
    move-result v7

    .line 395
    if-eqz v7, :cond_11

    .line 396
    .line 397
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v7

    .line 401
    invoke-static {v7}, La7/a;->O(Ljava/lang/Object;)Lia/v;

    .line 402
    .line 403
    .line 404
    move-result-object v7

    .line 405
    if-eqz v7, :cond_10

    .line 406
    .line 407
    iget-object v7, v7, Lia/v;->a:Ljava/lang/String;

    .line 408
    .line 409
    goto :goto_b

    .line 410
    :cond_10
    move-object/from16 v7, v19

    .line 411
    .line 412
    :goto_b
    if-eqz v7, :cond_f

    .line 413
    .line 414
    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    goto :goto_a

    .line 418
    :cond_11
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 419
    .line 420
    .line 421
    move-result v6

    .line 422
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    if-eqz p4, :cond_14

    .line 427
    .line 428
    iget-object v4, v1, Lia/c;->a:Ljava/util/List;

    .line 429
    .line 430
    move/from16 v27, v2

    .line 431
    .line 432
    new-instance v2, Ljava/util/ArrayList;

    .line 433
    .line 434
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 435
    .line 436
    .line 437
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result v28

    .line 445
    if-eqz v28, :cond_13

    .line 446
    .line 447
    move-object/from16 p4, v4

    .line 448
    .line 449
    invoke-interface/range {p4 .. p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    move/from16 v28, v6

    .line 454
    .line 455
    move-object v6, v4

    .line 456
    check-cast v6, Lia/d;

    .line 457
    .line 458
    iget-object v6, v6, Lia/d;->a:Ljava/lang/String;

    .line 459
    .line 460
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v6

    .line 464
    if-nez v6, :cond_12

    .line 465
    .line 466
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    :cond_12
    move-object/from16 v4, p4

    .line 470
    .line 471
    move/from16 v6, v28

    .line 472
    .line 473
    goto :goto_c

    .line 474
    :cond_13
    :goto_d
    move/from16 v28, v6

    .line 475
    .line 476
    goto :goto_e

    .line 477
    :cond_14
    move/from16 v27, v2

    .line 478
    .line 479
    move-object/from16 v2, v24

    .line 480
    .line 481
    goto :goto_d

    .line 482
    :goto_e
    if-eqz p5, :cond_15

    .line 483
    .line 484
    iget-object v3, v1, Lia/c;->b:Ljava/util/List;

    .line 485
    .line 486
    move-object/from16 v24, v3

    .line 487
    .line 488
    :cond_15
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 489
    .line 490
    .line 491
    move-result v1

    .line 492
    if-eqz v1, :cond_18

    .line 493
    .line 494
    invoke-interface/range {v24 .. v24}, Ljava/util/Collection;->isEmpty()Z

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    if-nez v1, :cond_16

    .line 499
    .line 500
    goto :goto_f

    .line 501
    :cond_16
    move/from16 p3, v9

    .line 502
    .line 503
    move-object/from16 v31, v19

    .line 504
    .line 505
    move/from16 v9, v28

    .line 506
    .line 507
    const/16 v26, 0x1

    .line 508
    .line 509
    move-object/from16 v28, v21

    .line 510
    .line 511
    move/from16 v21, v15

    .line 512
    .line 513
    move-object/from16 v15, v20

    .line 514
    .line 515
    move/from16 v20, v10

    .line 516
    .line 517
    move v10, v7

    .line 518
    :cond_17
    move/from16 v2, v27

    .line 519
    .line 520
    goto/16 :goto_13

    .line 521
    .line 522
    :cond_18
    :goto_f
    if-eqz v26, :cond_19

    .line 523
    .line 524
    move-object/from16 v1, v26

    .line 525
    .line 526
    goto :goto_10

    .line 527
    :cond_19
    iget-object v1, v0, Lia/h;->d:Ljava/lang/Class;

    .line 528
    .line 529
    if-eqz v1, :cond_1a

    .line 530
    .line 531
    goto :goto_10

    .line 532
    :cond_1a
    invoke-virtual {v0}, Lia/h;->g()Z

    .line 533
    .line 534
    .line 535
    iget-object v1, v0, Lia/h;->d:Ljava/lang/Class;

    .line 536
    .line 537
    :goto_10
    if-nez v1, :cond_1c

    .line 538
    .line 539
    iget-boolean v1, v0, Lia/h;->e:Z

    .line 540
    .line 541
    if-nez v1, :cond_1b

    .line 542
    .line 543
    const/4 v3, 0x1

    .line 544
    iput-boolean v3, v0, Lia/h;->e:Z

    .line 545
    .line 546
    iget-object v1, v0, Lia/h;->b:Lab/b;

    .line 547
    .line 548
    const-string v2, "\u670b\u53cb\u5708\u4f2a\u4e92\u52a8\u8282\u70b9\u7c7b\u578b\u5c1a\u672a\u5c31\u7eea"

    .line 549
    .line 550
    move-object/from16 v4, v19

    .line 551
    .line 552
    invoke-virtual {v1, v2, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    :cond_1b
    new-instance v1, Lia/a;

    .line 556
    .line 557
    const/4 v2, 0x0

    .line 558
    invoke-direct {v1, v8, v2}, Lia/a;-><init>([BZ)V

    .line 559
    .line 560
    .line 561
    return-object v1

    .line 562
    :cond_1c
    move-object/from16 v4, v19

    .line 563
    .line 564
    const/4 v3, 0x1

    .line 565
    iput-object v1, v0, Lia/h;->d:Ljava/lang/Class;

    .line 566
    .line 567
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 568
    .line 569
    .line 570
    move-result-object v19

    .line 571
    :goto_11
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 572
    .line 573
    .line 574
    move-result v2

    .line 575
    const-wide/16 v29, 0x3e8

    .line 576
    .line 577
    if-eqz v2, :cond_1e

    .line 578
    .line 579
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    check-cast v2, Lia/d;

    .line 584
    .line 585
    iget-object v6, v2, Lia/d;->a:Ljava/lang/String;

    .line 586
    .line 587
    move/from16 v26, v3

    .line 588
    .line 589
    iget-object v3, v2, Lia/d;->b:Ljava/lang/String;

    .line 590
    .line 591
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 592
    .line 593
    .line 594
    move-result-wide v31

    .line 595
    move-object/from16 v33, v5

    .line 596
    .line 597
    div-long v4, v31, v29

    .line 598
    .line 599
    long-to-int v4, v4

    .line 600
    iget-object v2, v2, Lia/d;->a:Ljava/lang/String;

    .line 601
    .line 602
    new-instance v5, Ljava/lang/StringBuilder;

    .line 603
    .line 604
    move-object/from16 v0, v33

    .line 605
    .line 606
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    and-int v2, v2, v22

    .line 621
    .line 622
    or-int v2, v2, v23

    .line 623
    .line 624
    move v5, v7

    .line 625
    move v7, v2

    .line 626
    move-object v2, v6

    .line 627
    move v6, v4

    .line 628
    const-string v4, ""

    .line 629
    .line 630
    move/from16 v29, v5

    .line 631
    .line 632
    const/4 v5, 0x1

    .line 633
    const/16 v31, 0x0

    .line 634
    .line 635
    move/from16 p3, v9

    .line 636
    .line 637
    move/from16 v9, v28

    .line 638
    .line 639
    move-object/from16 v0, p0

    .line 640
    .line 641
    move-object/from16 v28, v21

    .line 642
    .line 643
    move/from16 v21, v15

    .line 644
    .line 645
    move-object/from16 v15, v20

    .line 646
    .line 647
    move/from16 v20, v10

    .line 648
    .line 649
    move/from16 v10, v29

    .line 650
    .line 651
    invoke-virtual/range {v0 .. v7}, Lia/h;->f(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    if-eqz v2, :cond_1d

    .line 656
    .line 657
    invoke-interface {v12, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    move/from16 v27, v26

    .line 661
    .line 662
    :cond_1d
    move-object/from16 v0, p0

    .line 663
    .line 664
    move v7, v10

    .line 665
    move/from16 v10, v20

    .line 666
    .line 667
    move/from16 v3, v26

    .line 668
    .line 669
    move-object/from16 v4, v31

    .line 670
    .line 671
    move-object/from16 v5, v33

    .line 672
    .line 673
    move-object/from16 v20, v15

    .line 674
    .line 675
    move/from16 v15, v21

    .line 676
    .line 677
    move-object/from16 v21, v28

    .line 678
    .line 679
    move/from16 v28, v9

    .line 680
    .line 681
    move/from16 v9, p3

    .line 682
    .line 683
    goto :goto_11

    .line 684
    :cond_1e
    move/from16 v26, v3

    .line 685
    .line 686
    move-object/from16 v31, v4

    .line 687
    .line 688
    move/from16 p3, v9

    .line 689
    .line 690
    move/from16 v9, v28

    .line 691
    .line 692
    move-object/from16 v28, v21

    .line 693
    .line 694
    move/from16 v21, v15

    .line 695
    .line 696
    move-object/from16 v15, v20

    .line 697
    .line 698
    move/from16 v20, v10

    .line 699
    .line 700
    move v10, v7

    .line 701
    invoke-interface/range {v24 .. v24}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 702
    .line 703
    .line 704
    move-result-object v19

    .line 705
    :cond_1f
    :goto_12
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-eqz v0, :cond_17

    .line 710
    .line 711
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    check-cast v0, Lia/b;

    .line 716
    .line 717
    iget-object v2, v0, Lia/b;->b:Ljava/lang/String;

    .line 718
    .line 719
    iget-object v3, v0, Lia/b;->c:Ljava/lang/String;

    .line 720
    .line 721
    iget-object v4, v0, Lia/b;->d:Ljava/lang/String;

    .line 722
    .line 723
    iget-wide v5, v0, Lia/b;->e:J

    .line 724
    .line 725
    div-long v32, v5, v29

    .line 726
    .line 727
    const-wide/16 v34, 0x1

    .line 728
    .line 729
    const-wide/32 v36, 0x7fffffff

    .line 730
    .line 731
    .line 732
    invoke-static/range {v32 .. v37}, Lr9/e0;->s(JJJ)J

    .line 733
    .line 734
    .line 735
    move-result-wide v5

    .line 736
    long-to-int v6, v5

    .line 737
    iget-object v0, v0, Lia/b;->a:Ljava/lang/String;

    .line 738
    .line 739
    const-string v5, "comment:"

    .line 740
    .line 741
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 746
    .line 747
    .line 748
    move-result v0

    .line 749
    and-int v0, v0, v22

    .line 750
    .line 751
    or-int v7, v0, v23

    .line 752
    .line 753
    const/4 v5, 0x2

    .line 754
    move-object/from16 v0, p0

    .line 755
    .line 756
    invoke-virtual/range {v0 .. v7}, Lia/h;->f(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    if-eqz v2, :cond_1f

    .line 761
    .line 762
    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move/from16 v27, v26

    .line 766
    .line 767
    goto :goto_12

    .line 768
    :goto_13
    if-nez v2, :cond_20

    .line 769
    .line 770
    new-instance v0, Lia/a;

    .line 771
    .line 772
    const/4 v2, 0x0

    .line 773
    invoke-direct {v0, v8, v2}, Lia/a;-><init>([BZ)V

    .line 774
    .line 775
    .line 776
    return-object v0

    .line 777
    :cond_20
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 778
    .line 779
    .line 780
    move-result v0

    .line 781
    sub-int/2addr v0, v9

    .line 782
    if-gez v0, :cond_21

    .line 783
    .line 784
    const/4 v0, 0x0

    .line 785
    :cond_21
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 786
    .line 787
    .line 788
    move-result v1

    .line 789
    sub-int/2addr v1, v10

    .line 790
    if-gez v1, :cond_22

    .line 791
    .line 792
    const/4 v1, 0x0

    .line 793
    :cond_22
    sub-int v6, v21, p3

    .line 794
    .line 795
    if-ge v6, v9, :cond_23

    .line 796
    .line 797
    move v6, v9

    .line 798
    :cond_23
    sub-int v2, v16, p3

    .line 799
    .line 800
    if-ge v2, v9, :cond_24

    .line 801
    .line 802
    move v2, v9

    .line 803
    :cond_24
    sub-int v7, v17, v20

    .line 804
    .line 805
    if-ge v7, v10, :cond_25

    .line 806
    .line 807
    move v7, v10

    .line 808
    :cond_25
    sub-int v3, v18, v20

    .line 809
    .line 810
    if-ge v3, v10, :cond_26

    .line 811
    .line 812
    goto :goto_14

    .line 813
    :cond_26
    move v10, v3

    .line 814
    :goto_14
    add-int/2addr v6, v0

    .line 815
    add-int/2addr v2, v0

    .line 816
    add-int/2addr v7, v1

    .line 817
    add-int/2addr v10, v1

    .line 818
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    invoke-static {v11, v14, v0}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-static {v11, v15, v0}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    move-object/from16 v1, v28

    .line 837
    .line 838
    invoke-static {v11, v1, v0}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 839
    .line 840
    .line 841
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    move-object/from16 v1, v25

    .line 846
    .line 847
    invoke-static {v11, v1, v0}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    const-string v0, "toByteArray"

    .line 851
    .line 852
    const/4 v2, 0x0

    .line 853
    new-array v1, v2, [Ljava/lang/Object;

    .line 854
    .line 855
    invoke-static {v11, v0, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    instance-of v1, v0, [B

    .line 860
    .line 861
    if-eqz v1, :cond_27

    .line 862
    .line 863
    move-object v10, v0

    .line 864
    check-cast v10, [B

    .line 865
    .line 866
    goto :goto_15

    .line 867
    :cond_27
    move-object/from16 v10, v31

    .line 868
    .line 869
    :goto_15
    if-eqz v10, :cond_28

    .line 870
    .line 871
    new-instance v0, Lia/a;

    .line 872
    .line 873
    invoke-static {v10, v8}, Ljava/util/Arrays;->equals([B[B)Z

    .line 874
    .line 875
    .line 876
    move-result v1

    .line 877
    xor-int/lit8 v1, v1, 0x1

    .line 878
    .line 879
    invoke-direct {v0, v10, v1}, Lia/a;-><init>([BZ)V

    .line 880
    .line 881
    .line 882
    return-object v0

    .line 883
    :cond_28
    new-instance v0, Lia/a;

    .line 884
    .line 885
    const/4 v2, 0x0

    .line 886
    invoke-direct {v0, v8, v2}, Lia/a;-><init>([BZ)V

    .line 887
    .line 888
    .line 889
    return-object v0

    .line 890
    :cond_29
    move v2, v9

    .line 891
    new-instance v0, Lia/a;

    .line 892
    .line 893
    invoke-direct {v0, v8, v2}, Lia/a;-><init>([BZ)V

    .line 894
    .line 895
    .line 896
    return-object v0

    .line 897
    :cond_2a
    move v2, v9

    .line 898
    new-instance v0, Lia/a;

    .line 899
    .line 900
    invoke-direct {v0, v8, v2}, Lia/a;-><init>([BZ)V

    .line 901
    .line 902
    .line 903
    return-object v0

    .line 904
    :cond_2b
    move v2, v9

    .line 905
    new-instance v0, Lia/a;

    .line 906
    .line 907
    invoke-direct {v0, v8, v2}, Lia/a;-><init>([BZ)V

    .line 908
    .line 909
    .line 910
    return-object v0
.end method

.method public final f(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Class;

    .line 3
    .line 4
    invoke-static {p1, v1}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    new-array v2, v0, [Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_9

    .line 16
    .line 17
    invoke-static {p3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-lez v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {p3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    goto :goto_5

    .line 38
    :cond_0
    iget-object p3, p0, Lia/h;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    invoke-virtual {p3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-nez v3, :cond_6

    .line 45
    .line 46
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-virtual {v3, p2}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception v3

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object v3, v2

    .line 60
    goto :goto_1

    .line 61
    :goto_0
    new-instance v4, Lsf/f;

    .line 62
    .line 63
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    move-object v3, v4

    .line 67
    :goto_1
    nop

    .line 68
    instance-of v4, v3, Lsf/f;

    .line 69
    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    move-object v3, v2

    .line 73
    :cond_2
    check-cast v3, Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move-object v3, v2

    .line 85
    :goto_2
    if-eqz v3, :cond_4

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    move-object v3, p2

    .line 89
    :goto_3
    invoke-virtual {p3, p2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    if-nez p3, :cond_5

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_5
    move-object v3, p3

    .line 97
    :cond_6
    :goto_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-object p3, v3

    .line 101
    check-cast p3, Ljava/lang/String;

    .line 102
    .line 103
    :goto_5
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 104
    .line 105
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 106
    .line 107
    .line 108
    const/4 v4, 0x1

    .line 109
    invoke-static {v3, v4, p2}, Lia/h;->h(Ljava/io/ByteArrayOutputStream;ILjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 p2, 0x2

    .line 113
    invoke-static {v3, p2, p3}, Lia/h;->h(Ljava/io/ByteArrayOutputStream;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const/16 p2, 0x18

    .line 117
    .line 118
    int-to-long p2, p2

    .line 119
    invoke-static {v3, p2, p3}, Lia/h;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 120
    .line 121
    .line 122
    int-to-long p2, v0

    .line 123
    invoke-static {v3, p2, p3}, Lia/h;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 124
    .line 125
    .line 126
    const/16 p2, 0x20

    .line 127
    .line 128
    int-to-long p2, p2

    .line 129
    invoke-static {v3, p2, p3}, Lia/h;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 130
    .line 131
    .line 132
    int-to-long p2, p5

    .line 133
    invoke-static {v3, p2, p3}, Lia/h;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-lez p2, :cond_7

    .line 141
    .line 142
    const/4 p2, 0x5

    .line 143
    invoke-static {v3, p2, p4}, Lia/h;->h(Ljava/io/ByteArrayOutputStream;ILjava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_7
    const/16 p2, 0x30

    .line 147
    .line 148
    int-to-long p2, p2

    .line 149
    invoke-static {v3, p2, p3}, Lia/h;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 150
    .line 151
    .line 152
    int-to-long p2, p6

    .line 153
    invoke-static {v3, p2, p3}, Lia/h;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 154
    .line 155
    .line 156
    const/16 p2, 0x38

    .line 157
    .line 158
    int-to-long p2, p2

    .line 159
    invoke-static {v3, p2, p3}, Lia/h;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 160
    .line 161
    .line 162
    int-to-long p2, p7

    .line 163
    invoke-static {v3, p2, p3}, Lia/h;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    const-string p3, "parseFrom"

    .line 174
    .line 175
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p4

    .line 179
    invoke-static {p1, p3, p4}, Lh/Hchat/utils/KavaReflector;->findCompatibleMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    if-eqz p1, :cond_9

    .line 184
    .line 185
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    invoke-static {p1, v1, p2}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-eqz p1, :cond_8

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_8
    move-object v1, v2

    .line 197
    :goto_6
    return-object v1

    .line 198
    :cond_9
    return-object v2
.end method

.method public final g()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lia/h;->d:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Lp8/d0;->h()Lp8/x;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Lp8/x;->f()Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    const-class v3, Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v2, v0

    .line 56
    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    .line 57
    .line 58
    iput-object v2, p0, Lia/h;->d:Ljava/lang/Class;

    .line 59
    .line 60
    return v1

    .line 61
    :cond_3
    const/4 v0, 0x0

    .line 62
    return v0
.end method
