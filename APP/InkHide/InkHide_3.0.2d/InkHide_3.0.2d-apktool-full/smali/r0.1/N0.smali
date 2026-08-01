.class public final Lr0/N0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Landroid/util/LruCache;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr0/N0;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Landroid/util/LruCache;

    .line 12
    .line 13
    const/16 v1, 0x10

    .line 14
    .line 15
    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lr0/N0;->b:Landroid/util/LruCache;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/reflect/Field;)Z
    .locals 6

    .line 1
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_7

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-class v4, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_d

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_d

    .line 41
    .line 42
    const-string v3, "android"

    .line 43
    .line 44
    invoke-static {v2, v1, v3}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_d

    .line 49
    .line 50
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    const-class v5, Ljava/lang/Object;

    .line 73
    .line 74
    if-ne v4, v5, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_3

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_5

    .line 101
    .line 102
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v4, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_4

    .line 113
    .line 114
    goto/16 :goto_7

    .line 115
    .line 116
    :cond_5
    :goto_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    instance-of v3, v0, Ljava/lang/CharSequence;

    .line 129
    .line 130
    if-eqz v3, :cond_6

    .line 131
    .line 132
    check-cast v0, Ljava/lang/CharSequence;

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    const-string v0, ""

    .line 136
    .line 137
    :goto_3
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_7

    .line 142
    .line 143
    goto/16 :goto_7

    .line 144
    .line 145
    :cond_7
    iget-object v3, p0, Lr0/N0;->b:Landroid/util/LruCache;

    .line 146
    .line 147
    invoke-virtual {v3, v2, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    const-class v2, Lq0/h;

    .line 151
    .line 152
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Lq0/h;

    .line 157
    .line 158
    iget-object v2, v2, Lq0/h;->a:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    const-string v3, "iterator(...)"

    .line 165
    .line 166
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :cond_8
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_d

    .line 174
    .line 175
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    check-cast v3, Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-nez v4, :cond_8

    .line 186
    .line 187
    if-eqz v3, :cond_9

    .line 188
    .line 189
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    goto :goto_5

    .line 198
    :cond_9
    const/4 v4, 0x0

    .line 199
    :goto_5
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-eqz v4, :cond_a

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_a
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-static {v0, v3, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_8

    .line 214
    .line 215
    sget-boolean v4, Lz0/i;->a:Z

    .line 216
    .line 217
    invoke-static {v3}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_b

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    iget-object v1, p0, Lr0/N0;->a:Ljava/util/HashMap;

    .line 233
    .line 234
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    check-cast v2, Ljava/util/HashSet;

    .line 239
    .line 240
    const/4 v3, 0x1

    .line 241
    if-nez v2, :cond_c

    .line 242
    .line 243
    filled-new-array {p2}, [Ljava/lang/reflect/Field;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    new-instance v4, Ljava/util/HashSet;

    .line 248
    .line 249
    invoke-static {v3}, LF0/v;->Y(I)I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 254
    .line 255
    .line 256
    invoke-static {v2, v4}, LF0/h;->i0([Ljava/lang/Object;Ljava/util/HashSet;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_c
    invoke-virtual {v2, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    :goto_6
    const-string p1, "hit wxid compareText: "

    .line 267
    .line 268
    filled-new-array {p1, v0, p2}, [Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    return v3

    .line 276
    :cond_d
    :goto_7
    return v1
.end method

.method public final b(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    sget-boolean p1, Lz0/i;->a:Z

    .line 6
    .line 7
    invoke-static {}, Lz0/g;->z()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lr0/N0;->a:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    check-cast p1, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v0, "iterator(...)"

    .line 50
    .line 51
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_6

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v1, "next(...)"

    .line 65
    .line 66
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    check-cast v0, Ljava/lang/reflect/Field;

    .line 70
    .line 71
    invoke-virtual {p0, p2, v0}, Lr0/N0;->a(Ljava/lang/Object;Ljava/lang/reflect/Field;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    const-string v0, "hide field from cache: "

    .line 94
    .line 95
    filled-new-array {v0, p1, v1, p2}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return v2

    .line 103
    :cond_3
    :goto_0
    if-eqz p1, :cond_6

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, LN0/o;->d([Ljava/lang/Object;)LF0/c;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :catch_0
    :cond_4
    invoke-virtual {v0}, LF0/c;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    invoke-virtual {v0}, LF0/c;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Ljava/lang/reflect/Field;

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 126
    .line 127
    .line 128
    :try_start_0
    invoke-virtual {p0, p2, v1}, Lr0/N0;->a(Ljava/lang/Object;Ljava/lang/reflect/Field;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_4

    .line 133
    .line 134
    const-string v3, "hide field: "

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v1, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    filled-new-array {v3, v4, v5, v1}, [Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-static {v1}, Li0/a;->a([Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    .line 158
    .line 159
    return v2

    .line 160
    :cond_5
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 164
    goto :goto_0

    .line 165
    :catch_1
    :cond_6
    :goto_1
    const/4 p1, 0x0

    .line 166
    return p1
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 6

    .line 1
    invoke-static {}, Lz0/r;->h()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/16 v0, 0xa28

    .line 6
    .line 7
    if-lt p2, v0, :cond_0

    .line 8
    .line 9
    const-string p1, "support by hook dbase api"

    .line 10
    .line 11
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/16 p2, 0x9c6

    .line 20
    .line 21
    invoke-static {p2}, Lz0/r;->r(I)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    if-nez v1, :cond_4

    .line 28
    .line 29
    const/16 v1, 0xa1d

    .line 30
    .line 31
    filled-new-array {v1}, [I

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lz0/r;->s([I)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-static {}, Lz0/r;->h()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eq v1, p2, :cond_3

    .line 47
    .line 48
    if-eq v1, v0, :cond_2

    .line 49
    .line 50
    const-string p2, "i"

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const-string p2, "g"

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const-string p2, "h"

    .line 57
    .line 58
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v0, Lr0/M0;

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    invoke-direct {v0, p0, v1}, Lr0/M0;-><init>(Lr0/N0;I)V

    .line 66
    .line 67
    .line 68
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "com.tencent.mm.plugin.fts.ui.a0"

    .line 73
    .line 74
    invoke-static {v1, p1, p2, v0}, Lc0/f;->c(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    :goto_1
    invoke-static {}, Lz0/r;->h()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    const/16 v0, 0x960

    .line 83
    .line 84
    if-gt v0, p2, :cond_5

    .line 85
    .line 86
    const/16 v1, 0x9b0

    .line 87
    .line 88
    if-gt p2, v1, :cond_5

    .line 89
    .line 90
    const/4 p2, 0x1

    .line 91
    goto :goto_2

    .line 92
    :cond_5
    const/4 p2, 0x0

    .line 93
    :goto_2
    const-string v1, "com.tencent.mm.plugin.fts.ui.y"

    .line 94
    .line 95
    if-eqz p2, :cond_6

    .line 96
    .line 97
    move-object p2, v1

    .line 98
    goto :goto_3

    .line 99
    :cond_6
    const-string p2, "com.tencent.mm.plugin.fts.ui.z"

    .line 100
    .line 101
    :goto_3
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    new-instance v4, Lr0/M0;

    .line 106
    .line 107
    const/4 v5, 0x1

    .line 108
    invoke-direct {v4, p0, v5}, Lr0/M0;-><init>(Lr0/N0;I)V

    .line 109
    .line 110
    .line 111
    filled-new-array {v2, v4}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    const-string v5, "d"

    .line 116
    .line 117
    invoke-static {p2, v3, v5, v4}, Lc0/f;->c(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lz0/r;->h()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-gt v0, p2, :cond_7

    .line 125
    .line 126
    const/16 v0, 0x989

    .line 127
    .line 128
    if-gt p2, v0, :cond_7

    .line 129
    .line 130
    const-string v1, "com.tencent.mm.plugin.fts.ui.x"

    .line 131
    .line 132
    :cond_7
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    new-instance p2, Lr0/M0;

    .line 137
    .line 138
    const/4 v0, 0x0

    .line 139
    invoke-direct {p2, p0, v0}, Lr0/M0;-><init>(Lr0/N0;I)V

    .line 140
    .line 141
    .line 142
    filled-new-array {v2, p2}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-static {v1, p1, v5, p2}, Lc0/f;->c(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method
