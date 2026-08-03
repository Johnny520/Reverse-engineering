.class public final Lk8/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lh/Hchat/dexkit/DexFinder;

.field public final b:Ljava/lang/ThreadLocal;

.field public volatile c:Z


# direct methods
.method public constructor <init>(Lh/Hchat/dexkit/DexFinder;Li8/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk8/e;->a:Lh/Hchat/dexkit/DexFinder;

    .line 5
    .line 6
    new-instance p1, Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lk8/e;->b:Ljava/lang/ThreadLocal;

    .line 12
    .line 13
    return-void
.end method

.method public static varargs a(Ljava/lang/Object;I[Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    array-length v2, p2

    .line 11
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, [Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p0, v0, v1, v2}, Lk8/e;->b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    array-length v0, p2

    .line 28
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    check-cast p2, [Ljava/lang/String;

    .line 33
    .line 34
    const-class v0, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-static {p0, v0, p1, p2}, Lk8/e;->b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public static varargs b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/String;)Z
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    array-length v1, p3

    .line 4
    invoke-static {v1}, Ltf/y;->a0(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p3, v0}, Ltf/l;->J0([Ljava/lang/Object;Ljava/util/LinkedHashSet;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v1, v0, v2}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v0, p0, v1}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    const/4 p0, 0x1

    .line 59
    return p0

    .line 60
    :cond_1
    const/4 p0, 0x0

    .line 61
    return p0
.end method

.method public static varargs i(Ljava/lang/Object;I[Ljava/lang/String;)V
    .locals 4

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-lt v1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    aget-object v2, p2, v1

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {v3, v2}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v2, p0, v3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    :goto_1
    return-void

    .line 29
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0
.end method

.method public static varargs j(Ljava/lang/Object;J[Ljava/lang/String;)V
    .locals 4

    .line 1
    array-length v0, p3

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-lt v1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    aget-object v2, p3, v1

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {v3, v2}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v2, p0, v3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    :goto_1
    return-void

    .line 29
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0
.end method

.method public static varargs k(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-lt v1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    aget-object v2, p2, v1

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {v3, v2}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-static {v2, p0, p1}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    :goto_1
    return-void

    .line 25
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0
.end method


# virtual methods
.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk8/e;->a:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->hasLocalMessageApi()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->localMessageCreateTimeMethod:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->resolveLocalMessageApi()V

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-virtual {p0}, Lk8/e;->g()Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-wide/16 v5, 0x3e8

    .line 10
    .line 11
    const-wide v7, 0x2540be400L

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    if-eqz p6, :cond_3

    .line 17
    .line 18
    move-object/from16 v9, p0

    .line 19
    .line 20
    iget-object v10, v9, Lk8/e;->a:Lh/Hchat/dexkit/DexFinder;

    .line 21
    .line 22
    iget-object v10, v10, Lh/Hchat/dexkit/DexFinder;->localMessageCreateTimeMethod:Ljava/lang/reflect/Method;

    .line 23
    .line 24
    if-eqz v10, :cond_2

    .line 25
    .line 26
    cmp-long v7, p4, v7

    .line 27
    .line 28
    if-lez v7, :cond_0

    .line 29
    .line 30
    div-long v5, p4, v5

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-wide/from16 v5, p4

    .line 34
    .line 35
    :goto_0
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    filled-new-array {v1, v5}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-static {v10, v6, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    instance-of v7, v5, Ljava/lang/Number;

    .line 49
    .line 50
    if-eqz v7, :cond_1

    .line 51
    .line 52
    move-object v6, v5

    .line 53
    check-cast v6, Ljava/lang/Number;

    .line 54
    .line 55
    :cond_1
    if-eqz v6, :cond_2

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    move-wide/from16 v5, p4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move-object/from16 v9, p0

    .line 66
    .line 67
    cmp-long v10, p4, v3

    .line 68
    .line 69
    if-lez v10, :cond_2

    .line 70
    .line 71
    cmp-long v7, p4, v7

    .line 72
    .line 73
    if-gez v7, :cond_2

    .line 74
    .line 75
    mul-long v5, v5, p4

    .line 76
    .line 77
    :goto_1
    const-string v7, "k1"

    .line 78
    .line 79
    const-string v8, "j1"

    .line 80
    .line 81
    const-string v10, "U0"

    .line 82
    .line 83
    filled-new-array {v10, v7, v8}, [Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    const/4 v8, 0x0

    .line 88
    invoke-static {v0, v8, v7}, Lk8/e;->a(Ljava/lang/Object;I[Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-nez v7, :cond_4

    .line 93
    .line 94
    const-string v7, "field_isSend"

    .line 95
    .line 96
    const-string v10, "isSend"

    .line 97
    .line 98
    filled-new-array {v7, v10}, [Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-static {v0, v8, v7}, Lk8/e;->i(Ljava/lang/Object;I[Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    const-string v7, "C1"

    .line 106
    .line 107
    const-string v8, "u1"

    .line 108
    .line 109
    const-string v10, "i1"

    .line 110
    .line 111
    const-string v11, "A1"

    .line 112
    .line 113
    const-string v12, "H1"

    .line 114
    .line 115
    filled-new-array {v10, v11, v12, v7, v8}, [Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    const/4 v8, 0x5

    .line 120
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    check-cast v7, [Ljava/lang/String;

    .line 125
    .line 126
    const-class v10, Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v0, v10, v1, v7}, Lk8/e;->b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-nez v7, :cond_5

    .line 133
    .line 134
    const-string v7, "field_talker"

    .line 135
    .line 136
    const-string v11, "talker"

    .line 137
    .line 138
    filled-new-array {v7, v11}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-static {v0, v1, v7}, Lk8/e;->k(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    const-string v15, "t1"

    .line 146
    .line 147
    const-string v16, "r1"

    .line 148
    .line 149
    const-string v11, "h1"

    .line 150
    .line 151
    const-string v12, "z1"

    .line 152
    .line 153
    const-string v13, "E1"

    .line 154
    .line 155
    const-string v14, "y1"

    .line 156
    .line 157
    filled-new-array/range {v11 .. v16}, [Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    const/4 v7, 0x3

    .line 162
    invoke-static {v0, v7, v1}, Lk8/e;->a(Ljava/lang/Object;I[Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-nez v1, :cond_6

    .line 167
    .line 168
    const-string v1, "field_status"

    .line 169
    .line 170
    const-string v11, "status"

    .line 171
    .line 172
    filled-new-array {v1, v11}, [Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-static {v0, v7, v1}, Lk8/e;->i(Ljava/lang/Object;I[Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_6
    const-string v1, "Y0"

    .line 180
    .line 181
    const-string v7, "c1"

    .line 182
    .line 183
    const-string v11, "J0"

    .line 184
    .line 185
    const-string v12, "d1"

    .line 186
    .line 187
    filled-new-array {v11, v1, v12, v7}, [Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    const/4 v7, 0x4

    .line 192
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    check-cast v1, [Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v0, v10, v2, v1}, Lk8/e;->b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-nez v1, :cond_7

    .line 203
    .line 204
    const-string v1, "field_content"

    .line 205
    .line 206
    const-string v7, "content"

    .line 207
    .line 208
    filled-new-array {v1, v7}, [Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-static {v0, v2, v1}, Lk8/e;->k(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    :cond_7
    const-string v1, "f1"

    .line 216
    .line 217
    const-string v2, "e1"

    .line 218
    .line 219
    const-string v7, "K0"

    .line 220
    .line 221
    const-string v10, "a1"

    .line 222
    .line 223
    filled-new-array {v7, v10, v1, v2, v12}, [Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    check-cast v10, [Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {v0, v2, v7, v10}, Lk8/e;->b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-nez v2, :cond_9

    .line 247
    .line 248
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    check-cast v1, [Ljava/lang/String;

    .line 257
    .line 258
    const-class v7, Ljava/lang/Long;

    .line 259
    .line 260
    invoke-static {v0, v7, v2, v1}, Lk8/e;->b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_8

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_8
    const-string v1, "field_createTime"

    .line 268
    .line 269
    const-string v2, "createTime"

    .line 270
    .line 271
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-static {v0, v5, v6, v1}, Lk8/e;->j(Ljava/lang/Object;J[Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    :cond_9
    :goto_2
    const-string v1, "setType"

    .line 279
    .line 280
    filled-new-array {v1}, [Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    const/16 v2, 0x2710

    .line 285
    .line 286
    invoke-static {v0, v2, v1}, Lk8/e;->a(Ljava/lang/Object;I[Ljava/lang/String;)Z

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    if-nez v1, :cond_a

    .line 291
    .line 292
    const-string v1, "field_type"

    .line 293
    .line 294
    const-string v5, "type"

    .line 295
    .line 296
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-static {v0, v2, v1}, Lk8/e;->i(Ljava/lang/Object;I[Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    :cond_a
    const-string v1, "field_msgSvrId"

    .line 304
    .line 305
    const-string v2, "msgSvrId"

    .line 306
    .line 307
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-static {v0, v3, v4, v1}, Lk8/e;->j(Ljava/lang/Object;J[Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    const-string v1, "field_imgPath"

    .line 315
    .line 316
    const-string v2, "imgPath"

    .line 317
    .line 318
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    const-string v2, ""

    .line 323
    .line 324
    invoke-static {v0, v2, v1}, Lk8/e;->k(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const-string v1, "field_reserved"

    .line 328
    .line 329
    const-string v3, "reserved"

    .line 330
    .line 331
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-static {v0, v2, v1}, Lk8/e;->k(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    const-string v1, "field_transContent"

    .line 339
    .line 340
    const-string v3, "transContent"

    .line 341
    .line 342
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-static {v0, v2, v1}, Lk8/e;->k(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    const-string v1, "field_msgSource"

    .line 350
    .line 351
    const-string v3, "msgSource"

    .line 352
    .line 353
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-static {v0, v2, v1}, Lk8/e;->k(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;JZ)J
    .locals 11

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v8, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_12

    .line 8
    .line 9
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_c

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lk8/e;->a:Lh/Hchat/dexkit/DexFinder;

    .line 18
    .line 19
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->hasLocalMessageApi()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const-string v0, "\u63d2\u5165\u7cfb\u7edf\u6d88\u606f\u5931\u8d25: \u672c\u5730\u6d88\u606fAPI\u672a\u5c31\u7eea"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lk8/e;->h(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-wide v8

    .line 31
    :cond_1
    if-nez p5, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lk8/e;->g()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    const-string v0, "\u63d2\u5165\u7cfb\u7edf\u6d88\u606f\u5931\u8d25: createTime hook \u672a\u5c31\u7eea"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lk8/e;->h(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-wide v8

    .line 45
    :cond_2
    const-string v2, ""

    .line 46
    .line 47
    if-nez p1, :cond_3

    .line 48
    .line 49
    move-object v3, v2

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    move-object v3, p1

    .line 52
    :goto_0
    if-nez p2, :cond_4

    .line 53
    .line 54
    move-object v4, v2

    .line 55
    goto :goto_1

    .line 56
    :cond_4
    move-object v4, p2

    .line 57
    :goto_1
    const/4 v10, 0x0

    .line 58
    if-eqz p5, :cond_5

    .line 59
    .line 60
    move-object v5, v10

    .line 61
    goto :goto_3

    .line 62
    :cond_5
    cmp-long v5, p3, v8

    .line 63
    .line 64
    if-lez v5, :cond_6

    .line 65
    .line 66
    const-wide v5, 0x2540be400L

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    cmp-long v5, p3, v5

    .line 72
    .line 73
    if-gez v5, :cond_6

    .line 74
    .line 75
    const-wide/16 v5, 0x3e8

    .line 76
    .line 77
    mul-long/2addr v5, p3

    .line 78
    goto :goto_2

    .line 79
    :cond_6
    move-wide v5, p3

    .line 80
    :goto_2
    :try_start_0
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    :goto_3
    invoke-virtual {p0, v0, v3, v4, v5}, Lk8/e;->f(Lh/Hchat/dexkit/DexFinder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-eqz v3, :cond_7

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    goto/16 :goto_9

    .line 95
    .line 96
    :catchall_0
    move-exception v0

    .line 97
    goto/16 :goto_a

    .line 98
    .line 99
    :cond_7
    if-nez p1, :cond_8

    .line 100
    .line 101
    move-object v3, v2

    .line 102
    goto :goto_4

    .line 103
    :cond_8
    move-object v3, p1

    .line 104
    :goto_4
    iget-object v4, v0, Lh/Hchat/dexkit/DexFinder;->localMessageCtor:Ljava/lang/reflect/Constructor;

    .line 105
    .line 106
    if-eqz v4, :cond_a

    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    array-length v5, v5

    .line 116
    if-nez v5, :cond_9

    .line 117
    .line 118
    const/4 v3, 0x0

    .line 119
    new-array v3, v3, [Ljava/lang/Object;

    .line 120
    .line 121
    invoke-static {v4, v3}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    goto :goto_5

    .line 126
    :cond_9
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-static {v4, v3}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    goto :goto_5

    .line 135
    :cond_a
    move-object v3, v10

    .line 136
    :goto_5
    if-eqz v3, :cond_f

    .line 137
    .line 138
    if-nez p1, :cond_b

    .line 139
    .line 140
    move-object v4, v2

    .line 141
    goto :goto_6

    .line 142
    :cond_b
    move-object v4, p1

    .line 143
    :goto_6
    if-nez p2, :cond_c

    .line 144
    .line 145
    move-object v1, v4

    .line 146
    move-object v4, v2

    .line 147
    move-object v2, v3

    .line 148
    move-object v3, v1

    .line 149
    :goto_7
    move-object v1, p0

    .line 150
    move-wide v5, p3

    .line 151
    move/from16 v7, p5

    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_c
    move-object v2, v3

    .line 155
    move-object v3, v4

    .line 156
    move-object v4, p2

    .line 157
    goto :goto_7

    .line 158
    :goto_8
    invoke-virtual/range {v1 .. v7}, Lk8/e;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JZ)V

    .line 159
    .line 160
    .line 161
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->localMessageInsertMethod:Ljava/lang/reflect/Method;

    .line 162
    .line 163
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-static {v0, v10, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    instance-of v2, v0, Ljava/lang/Number;

    .line 172
    .line 173
    if-eqz v2, :cond_d

    .line 174
    .line 175
    move-object v10, v0

    .line 176
    check-cast v10, Ljava/lang/Number;

    .line 177
    .line 178
    :cond_d
    if-eqz v10, :cond_e

    .line 179
    .line 180
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 181
    .line 182
    .line 183
    move-result-wide v2

    .line 184
    goto :goto_9

    .line 185
    :cond_e
    move-wide v2, v8

    .line 186
    :goto_9
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    goto :goto_b

    .line 191
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 192
    .line 193
    const-string v2, "\u6d88\u606f\u5bf9\u8c61\u521b\u5efa\u5931\u8d25"

    .line 194
    .line 195
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    :goto_a
    new-instance v2, Lsf/f;

    .line 200
    .line 201
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    move-object v0, v2

    .line 205
    :goto_b
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    if-eqz v2, :cond_10

    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    new-instance v3, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v4, "\u63d2\u5165\u7cfb\u7edf\u6d88\u606f\u5931\u8d25: "

    .line 218
    .line 219
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {p0, v2}, Lk8/e;->h(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :cond_10
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    instance-of v3, v0, Lsf/f;

    .line 237
    .line 238
    if-eqz v3, :cond_11

    .line 239
    .line 240
    move-object v0, v2

    .line 241
    :cond_11
    check-cast v0, Ljava/lang/Number;

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 244
    .line 245
    .line 246
    move-result-wide v2

    .line 247
    return-wide v2

    .line 248
    :cond_12
    :goto_c
    const-string v0, "\u63d2\u5165\u7cfb\u7edf\u6d88\u606f\u5931\u8d25: talker/content \u4e3a\u7a7a"

    .line 249
    .line 250
    invoke-virtual {p0, v0}, Lk8/e;->h(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return-wide v8
.end method

.method public final f(Lh/Hchat/dexkit/DexFinder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 10

    .line 1
    iget-object v1, p1, Lh/Hchat/dexkit/DexFinder;->localSystemMessageMethod:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz v1, :cond_19

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    if-eqz v3, :cond_14

    .line 11
    .line 12
    invoke-static {p1, v3}, Lig/a;->A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    :goto_0
    move-object v2, p1

    .line 19
    goto/16 :goto_e

    .line 20
    .line 21
    :cond_0
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->staticInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_5

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/reflect/Field;

    .line 47
    .line 48
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_4

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-static {v0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    move-object v0, v2

    .line 74
    :goto_2
    if-eqz v0, :cond_6

    .line 75
    .line 76
    :goto_3
    move-object v2, v0

    .line 77
    goto/16 :goto_e

    .line 78
    .line 79
    :cond_6
    new-instance v4, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    new-array v0, p1, [Ljava/lang/Object;

    .line 86
    .line 87
    invoke-static {v3, v0}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-eqz v0, :cond_7

    .line 92
    .line 93
    :goto_4
    goto :goto_3

    .line 94
    :cond_7
    :try_start_0
    new-array v0, p1, [Ljava/lang/Class;

    .line 95
    .line 96
    invoke-static {v3, v0}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_8

    .line 101
    .line 102
    new-array v5, p1, [Ljava/lang/Object;

    .line 103
    .line 104
    invoke-static {v0, v5}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    goto :goto_5

    .line 113
    :cond_8
    move-object v5, v2

    .line 114
    goto :goto_6

    .line 115
    :goto_5
    new-instance v5, Lsf/f;

    .line 116
    .line 117
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    :goto_6
    invoke-static {v5}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-eqz v0, :cond_9

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v6, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v7, "KavaCtor="

    .line 141
    .line 142
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v5, ":"

    .line 149
    .line 150
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    :cond_9
    const-string v0, "sun.misc.Unsafe"

    .line 164
    .line 165
    const-string v5, "jdk.internal.misc.Unsafe"

    .line 166
    .line 167
    filled-new-array {v0, v5}, [Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    :goto_7
    const/4 v0, 0x2

    .line 172
    if-lt p1, v0, :cond_a

    .line 173
    .line 174
    move-object v0, v2

    .line 175
    goto/16 :goto_d

    .line 176
    .line 177
    :cond_a
    aget-object v0, v5, p1

    .line 178
    .line 179
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-static {v0, v6}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    if-eqz v0, :cond_f

    .line 188
    .line 189
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    :cond_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    if-eqz v7, :cond_e

    .line 202
    .line 203
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    check-cast v7, Ljava/lang/reflect/Field;

    .line 208
    .line 209
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    if-eqz v8, :cond_d

    .line 214
    .line 215
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    invoke-virtual {v0, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    if-nez v8, :cond_c

    .line 224
    .line 225
    goto :goto_8

    .line 226
    :cond_c
    invoke-static {v7, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    goto :goto_9

    .line 231
    :catchall_1
    move-exception v0

    .line 232
    goto :goto_b

    .line 233
    :cond_d
    :goto_8
    move-object v7, v2

    .line 234
    :goto_9
    if-eqz v7, :cond_b

    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_e
    move-object v7, v2

    .line 238
    :goto_a
    if-eqz v7, :cond_f

    .line 239
    .line 240
    const-string v6, "allocateInstance"

    .line 241
    .line 242
    const-class v8, Ljava/lang/Class;

    .line 243
    .line 244
    filled-new-array {v8}, [Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    invoke-static {v0, v6, v8}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    invoke-static {v0, v7, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 260
    goto :goto_c

    .line 261
    :cond_f
    move-object v0, v2

    .line 262
    goto :goto_c

    .line 263
    :goto_b
    new-instance v6, Lsf/f;

    .line 264
    .line 265
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    move-object v0, v6

    .line 269
    :goto_c
    nop

    .line 270
    instance-of v6, v0, Lsf/f;

    .line 271
    .line 272
    if-eqz v6, :cond_10

    .line 273
    .line 274
    move-object v0, v2

    .line 275
    :cond_10
    if-eqz v0, :cond_13

    .line 276
    .line 277
    :goto_d
    if-nez v0, :cond_11

    .line 278
    .line 279
    const-string p1, "UnsafeAllocate=null"

    .line 280
    .line 281
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    :cond_11
    if-eqz v0, :cond_12

    .line 285
    .line 286
    goto/16 :goto_3

    .line 287
    .line 288
    :cond_12
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    const/4 v8, 0x0

    .line 293
    const/16 v9, 0x3e

    .line 294
    .line 295
    const-string v5, ";"

    .line 296
    .line 297
    const/4 v6, 0x0

    .line 298
    const/4 v7, 0x0

    .line 299
    invoke-static/range {v4 .. v9}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    new-instance v3, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    const-string v4, "\u7cfb\u7edf\u6d88\u606fAPI\u5b9e\u4f8b\u521b\u5efa\u5931\u8d25: owner="

    .line 306
    .line 307
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string p1, " service=false static=false "

    .line 314
    .line 315
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-virtual {p0, p1}, Lk8/e;->h(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    goto :goto_e

    .line 329
    :cond_13
    add-int/lit8 p1, p1, 0x1

    .line 330
    .line 331
    goto/16 :goto_7

    .line 332
    .line 333
    :cond_14
    :goto_e
    if-eqz v2, :cond_18

    .line 334
    .line 335
    iget-object p1, p0, Lk8/e;->b:Ljava/lang/ThreadLocal;

    .line 336
    .line 337
    if-eqz p4, :cond_15

    .line 338
    .line 339
    new-instance v0, Lk8/d;

    .line 340
    .line 341
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 342
    .line 343
    .line 344
    move-result-wide v3

    .line 345
    invoke-direct {v0, p2, v3, v4}, Lk8/d;-><init>(Ljava/lang/String;J)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {p1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    :cond_15
    :try_start_2
    const-string v0, ""

    .line 352
    .line 353
    filled-new-array {p2, p3, v0}, [Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p2

    .line 357
    invoke-static {v1, v2, p2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    const-wide/16 p2, 0x1

    .line 361
    .line 362
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 363
    .line 364
    .line 365
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 366
    if-eqz p4, :cond_16

    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    .line 369
    .line 370
    .line 371
    :cond_16
    return-object p2

    .line 372
    :catchall_2
    move-exception v0

    .line 373
    move-object p2, v0

    .line 374
    if-eqz p4, :cond_17

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    .line 377
    .line 378
    .line 379
    :cond_17
    throw p2

    .line 380
    :cond_18
    const-string p1, "\u7cfb\u7edf\u6d88\u606fAPI\u5b9e\u4f8b\u521b\u5efa\u5931\u8d25"

    .line 381
    .line 382
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    const/4 p1, 0x0

    .line 386
    return-object p1

    .line 387
    :cond_19
    return-object v2
.end method

.method public final g()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lk8/e;->c:Z

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
    iget-object v0, p0, Lk8/e;->a:Lh/Hchat/dexkit/DexFinder;

    .line 8
    .line 9
    iget-object v2, v0, Lh/Hchat/dexkit/DexFinder;->localMessageCreateTimeMethod:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->resolveLocalMessageApi()V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->localMessageCreateTimeMethod:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    monitor-enter p0

    .line 21
    :try_start_0
    iget-boolean v2, p0, Lk8/e;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return v1

    .line 27
    :cond_2
    :try_start_1
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 28
    .line 29
    new-instance v3, Lb9/e;

    .line 30
    .line 31
    const/16 v4, 0xf

    .line 32
    .line 33
    invoke-direct {v3, p0, v4}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v0, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 37
    .line 38
    .line 39
    iput-boolean v1, p0, Lk8/e;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    monitor-exit p0

    .line 42
    return v1

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    monitor-exit p0

    .line 45
    throw v0

    .line 46
    :cond_3
    const/4 v0, 0x0

    .line 47
    return v0
.end method

.method public final h(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[Hchat:LocalMessage] "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "[WeChatLocalMessageApi] "

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
