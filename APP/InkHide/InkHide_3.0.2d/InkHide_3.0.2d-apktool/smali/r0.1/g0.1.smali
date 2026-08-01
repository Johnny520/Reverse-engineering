.class public final Lr0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# instance fields
.field public final a:Ljava/util/WeakHashMap;

.field public final b:Ljava/util/Set;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/WeakHashMap;

.field public e:I

.field public f:I

.field public g:Landroid/content/Context;

.field public h:LA0/a0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr0/g0;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lr0/g0;->b:Ljava/util/Set;

    .line 21
    .line 22
    new-instance v0, Ljava/util/WeakHashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lr0/g0;->c:Ljava/util/Set;

    .line 32
    .line 33
    new-instance v0, Ljava/util/WeakHashMap;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lr0/g0;->d:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    return-void
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "getMethods(...)"

    .line 11
    .line 12
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    array-length v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    const-string v5, "getParameterTypes(...)"

    .line 19
    .line 20
    if-ge v4, v2, :cond_3

    .line 21
    .line 22
    :try_start_1
    aget-object v6, v1, v4

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    invoke-static {v7, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_2

    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    array-length v7, v7

    .line 39
    array-length v8, p2

    .line 40
    if-ne v7, v8, :cond_2

    .line 41
    .line 42
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-static {v7, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v7}, LF0/h;->d0([Ljava/lang/Object;)LR0/c;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    instance-of v8, v7, Ljava/util/Collection;

    .line 54
    .line 55
    if-eqz v8, :cond_0

    .line 56
    .line 57
    move-object v8, v7

    .line 58
    check-cast v8, Ljava/util/Collection;

    .line 59
    .line 60
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_0

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :cond_0
    invoke-virtual {v7}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    :cond_1
    :goto_1
    move-object v8, v7

    .line 75
    check-cast v8, LR0/b;

    .line 76
    .line 77
    iget-boolean v8, v8, LR0/b;->c:Z

    .line 78
    .line 79
    if-eqz v8, :cond_4

    .line 80
    .line 81
    move-object v8, v7

    .line 82
    check-cast v8, LR0/b;

    .line 83
    .line 84
    invoke-virtual {v8}, LR0/b;->a()I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    aget-object v9, p2, v8

    .line 89
    .line 90
    if-eqz v9, :cond_1

    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    aget-object v9, v9, v8

    .line 97
    .line 98
    aget-object v8, p2, v8

    .line 99
    .line 100
    invoke-static {v8}, LN0/g;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_2

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    move-object v6, v0

    .line 118
    :cond_4
    :goto_2
    if-eqz v6, :cond_5

    .line 119
    .line 120
    array-length v1, p2

    .line 121
    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v6, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-eqz v1, :cond_5

    .line 130
    .line 131
    goto/16 :goto_7

    .line 132
    .line 133
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const-string v2, "getDeclaredMethods(...)"

    .line 142
    .line 143
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    array-length v2, v1

    .line 147
    :goto_3
    if-ge v3, v2, :cond_9

    .line 148
    .line 149
    aget-object v4, v1, v3

    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-static {v6, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-eqz v6, :cond_8

    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    array-length v6, v6

    .line 166
    array-length v7, p2

    .line 167
    if-ne v6, v7, :cond_8

    .line 168
    .line 169
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-static {v6, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v6}, LF0/h;->d0([Ljava/lang/Object;)LR0/c;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    instance-of v7, v6, Ljava/util/Collection;

    .line 181
    .line 182
    if-eqz v7, :cond_6

    .line 183
    .line 184
    move-object v7, v6

    .line 185
    check-cast v7, Ljava/util/Collection;

    .line 186
    .line 187
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    if-eqz v7, :cond_6

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_6
    invoke-virtual {v6}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    :cond_7
    :goto_4
    move-object v7, v6

    .line 199
    check-cast v7, LR0/b;

    .line 200
    .line 201
    iget-boolean v7, v7, LR0/b;->c:Z

    .line 202
    .line 203
    if-eqz v7, :cond_a

    .line 204
    .line 205
    move-object v7, v6

    .line 206
    check-cast v7, LR0/b;

    .line 207
    .line 208
    invoke-virtual {v7}, LR0/b;->a()I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    aget-object v8, p2, v7

    .line 213
    .line 214
    if-eqz v8, :cond_7

    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    aget-object v8, v8, v7

    .line 221
    .line 222
    aget-object v7, p2, v7

    .line 223
    .line 224
    invoke-static {v7}, LN0/g;->b(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    if-eqz v7, :cond_8

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_9
    move-object v4, v0

    .line 242
    :cond_a
    :goto_5
    if-eqz v4, :cond_b

    .line 243
    .line 244
    const/4 p1, 0x1

    .line 245
    invoke-virtual {v4, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 246
    .line 247
    .line 248
    array-length p1, p2

    .line 249
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {v4, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 257
    goto :goto_7

    .line 258
    :cond_b
    move-object v1, v0

    .line 259
    goto :goto_7

    .line 260
    :goto_6
    new-instance v1, LE0/d;

    .line 261
    .line 262
    invoke-direct {v1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    :goto_7
    instance-of p0, v1, LE0/d;

    .line 266
    .line 267
    if-eqz p0, :cond_c

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_c
    move-object v0, v1

    .line 271
    :goto_8
    return-object v0
.end method

.method public static final b(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-nez v0, :cond_1

    .line 31
    .line 32
    const-string v0, ""

    .line 33
    .line 34
    :cond_1
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    check-cast p1, Landroid/view/ViewGroup;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v1, 0x0

    .line 54
    :goto_1
    if-ge v1, v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "getChildAt(...)"

    .line 61
    .line 62
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v2}, Lr0/g0;->b(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    return-void
.end method

.method public static d(Landroid/view/View;Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-static {p0}, Lr0/g0;->i(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    check-cast p0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v2, v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "getChildAt(...)"

    .line 31
    .line 32
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, p1}, Lr0/g0;->d(Landroid/view/View;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return v1
.end method

.method public static f(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_8

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-le p1, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    instance-of v1, p0, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    move-object p1, p0

    .line 16
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    const-string p2, "wxid_"

    .line 19
    .line 20
    invoke-static {p1, v3, p2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    const-string p2, "@chatroom"

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_2

    .line 33
    .line 34
    const-string p2, "gh_"

    .line 35
    .line 36
    invoke-static {p1, v3, p2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-nez p2, :cond_2

    .line 41
    .line 42
    const-string p2, "@openim"

    .line 43
    .line 44
    invoke-static {p1, p2, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object p0, v0

    .line 52
    :cond_2
    :goto_0
    check-cast p0, Ljava/lang/String;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_3
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const-string v4, "getDeclaredFields(...)"

    .line 71
    .line 72
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    array-length v4, v1

    .line 76
    :goto_1
    if-ge v3, v4, :cond_8

    .line 77
    .line 78
    aget-object v5, v1, v3

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    :try_start_0
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    add-int/lit8 v6, p1, 0x1

    .line 99
    .line 100
    invoke-static {v5, v6, p2}, Lr0/g0;->f(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    goto :goto_2

    .line 105
    :catchall_0
    move-exception v5

    .line 106
    new-instance v6, LE0/d;

    .line 107
    .line 108
    invoke-direct {v6, v5}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    move-object v5, v6

    .line 112
    :goto_2
    nop

    .line 113
    instance-of v6, v5, LE0/d;

    .line 114
    .line 115
    if-eqz v6, :cond_6

    .line 116
    .line 117
    move-object v5, v0

    .line 118
    :cond_6
    check-cast v5, Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v5, :cond_7

    .line 121
    .line 122
    return-object v5

    .line 123
    :cond_7
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_8
    :goto_4
    return-object v0
.end method

.method public static h(Landroid/view/View;)Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "getAdapter"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 7
    .line 8
    invoke-interface {v2, p0, v0, v1}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    new-instance v0, LE0/d;

    .line 15
    .line 16
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    nop

    .line 21
    instance-of v0, p0, LE0/d;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    :cond_0
    return-object p0
.end method

.method public static i(Landroid/view/View;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    new-instance v0, LE0/d;

    .line 21
    .line 22
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p0, v0

    .line 26
    :goto_0
    nop

    .line 27
    instance-of v0, p0, LE0/d;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object v2, p0

    .line 33
    :goto_1
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    return-object v2
.end method

.method public static l(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "androidx.recyclerview.widget.RecyclerView"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "android.support.v7.widget.RecyclerView"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, ".RecyclerView"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, ".WxRecyclerView"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_2
    const/4 p0, 0x0

    .line 64
    return p0
.end method


# virtual methods
.method public final c(Landroid/view/ViewGroup;)Z
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lr0/g0;->d:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Ljava/lang/Long;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    :goto_0
    sub-long v3, v0, v3

    .line 23
    .line 24
    const-wide/16 v5, 0x78

    .line 25
    .line 26
    cmp-long v3, v3, v5

    .line 27
    .line 28
    if-gez v3, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1
.end method

.method public final varargs e([Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lr0/g0;->e:I

    .line 2
    .line 3
    const/16 v1, 0x50

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    iput v0, p0, Lr0/g0;->e:I

    .line 11
    .line 12
    new-instance v0, Lr0/P;

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    invoke-direct {v0, v1}, Lr0/P;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x1e

    .line 19
    .line 20
    const-string v2, " | "

    .line 21
    .line 22
    invoke-static {p1, v2, v0, v1}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "MaskTagHide"

    .line 27
    .line 28
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final g(Landroid/view/View;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {v0, v2, v1}, Lr0/g0;->f(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    check-cast p1, Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :goto_0
    if-ge v2, v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v3, "getChildAt(...)"

    .line 39
    .line 40
    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lr0/g0;->g(Landroid/view/View;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 p1, 0x0

    .line 54
    return-object p1
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x3

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    :cond_0
    iput-object v2, p0, Lr0/g0;->g:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {p1}, LA0/l;->o(Landroid/content/Context;)LA0/a0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iput-object v2, p0, Lr0/g0;->h:LA0/a0;

    .line 17
    .line 18
    sget-object v2, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    new-instance v3, LA0/u;

    .line 21
    .line 22
    new-instance v6, Lr0/P;

    .line 23
    .line 24
    invoke-direct {v6, v1}, Lr0/P;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v7, LA0/h;

    .line 28
    .line 29
    const/16 v2, 0xd

    .line 30
    .line 31
    invoke-direct {v7, p1, v2}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    new-instance v8, LC/d;

    .line 35
    .line 36
    invoke-direct {v8, v0, p0}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance v9, LA0/a;

    .line 40
    .line 41
    const/16 v2, 0x10

    .line 42
    .line 43
    invoke-direct {v9, v2}, LA0/a;-><init>(I)V

    .line 44
    .line 45
    .line 46
    const-string v4, "tag-contact"

    .line 47
    .line 48
    const-string v5, "\u6807\u7b7e\u9875\u5bc6\u53cb\u9690\u85cf"

    .line 49
    .line 50
    invoke-direct/range {v3 .. v9}, LA0/u;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;LM0/l;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v3}, LA0/y;->c(Landroid/content/Context;LA0/u;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v2, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 59
    .line 60
    const-string v3, "handleHook"

    .line 61
    .line 62
    filled-new-array {v3, p1, v2}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0, p1}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 70
    .line 71
    const-string v2, "classLoader"

    .line 72
    .line 73
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 77
    .line 78
    const-string v4, "androidx.recyclerview.widget.RecyclerView"

    .line 79
    .line 80
    invoke-interface {v3, p1, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string v3, "android.support.v7.widget.RecyclerView"

    .line 85
    .line 86
    if-nez p1, :cond_1

    .line 87
    .line 88
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 89
    .line 90
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 94
    .line 95
    invoke-interface {v5, p1, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-nez p1, :cond_1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    iget-object v5, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 103
    .line 104
    invoke-static {v5, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 108
    .line 109
    const-string v7, "androidx.recyclerview.widget.RecyclerView$Adapter"

    .line 110
    .line 111
    invoke-interface {v6, v5, v7}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    if-nez v5, :cond_2

    .line 116
    .line 117
    iget-object v5, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 118
    .line 119
    invoke-static {v5, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 123
    .line 124
    const-string v7, "android.support.v7.widget.RecyclerView$Adapter"

    .line 125
    .line 126
    invoke-interface {v6, v5, v7}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    if-nez v5, :cond_2

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 138
    .line 139
    const-string v7, "setAdapter"

    .line 140
    .line 141
    invoke-interface {v6, p1, v7, v5}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-eqz p1, :cond_3

    .line 146
    .line 147
    new-instance v5, Lr0/f0;

    .line 148
    .line 149
    const/4 v6, 0x2

    .line 150
    invoke-direct {v5, p0, v6}, Lr0/f0;-><init>(Lr0/g0;I)V

    .line 151
    .line 152
    .line 153
    invoke-static {p1, v5}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 154
    .line 155
    .line 156
    :cond_3
    :goto_0
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 157
    .line 158
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 162
    .line 163
    invoke-interface {v5, p1, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    const-string v4, "dispatchDraw"

    .line 168
    .line 169
    const-class v5, Landroid/graphics/Canvas;

    .line 170
    .line 171
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 172
    .line 173
    if-nez p1, :cond_4

    .line 174
    .line 175
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 176
    .line 177
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 181
    .line 182
    invoke-interface {p2, p1, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-nez p1, :cond_4

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_4
    new-instance p2, Lr0/f0;

    .line 190
    .line 191
    invoke-direct {p2, p0, v0}, Lr0/f0;-><init>(Lr0/g0;I)V

    .line 192
    .line 193
    .line 194
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 195
    .line 196
    filled-new-array {v6, v0, v0, v0, v0}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 201
    .line 202
    const-string v3, "onLayout"

    .line 203
    .line 204
    invoke-interface {v2, p1, v3, v0}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-eqz v0, :cond_5

    .line 209
    .line 210
    invoke-static {v0, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 211
    .line 212
    .line 213
    :cond_5
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 218
    .line 219
    invoke-interface {v2, p1, v4, v0}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    if-eqz p1, :cond_6

    .line 224
    .line 225
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 226
    .line 227
    .line 228
    :cond_6
    :goto_1
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 233
    .line 234
    const-class v0, Landroid/app/Activity;

    .line 235
    .line 236
    const-string v2, "onWindowFocusChanged"

    .line 237
    .line 238
    invoke-interface {p2, v0, v2, p1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    if-eqz p1, :cond_7

    .line 243
    .line 244
    new-instance p2, Lr0/f0;

    .line 245
    .line 246
    const/4 v0, 0x0

    .line 247
    invoke-direct {p2, p0, v0}, Lr0/f0;-><init>(Lr0/g0;I)V

    .line 248
    .line 249
    .line 250
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 251
    .line 252
    .line 253
    :cond_7
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 258
    .line 259
    const-class v0, Landroid/view/ViewGroup;

    .line 260
    .line 261
    invoke-interface {p2, v0, v4, p1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    if-eqz p1, :cond_8

    .line 266
    .line 267
    new-instance p2, Lr0/f0;

    .line 268
    .line 269
    invoke-direct {p2, p0, v1}, Lr0/f0;-><init>(Lr0/g0;I)V

    .line 270
    .line 271
    .line 272
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 273
    .line 274
    .line 275
    :cond_8
    return-void
.end method

.method public final j(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/g0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    new-instance v1, Lr0/e0;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 23
    .line 24
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v3, v4

    .line 30
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    iget v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 37
    .line 38
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    :cond_1
    invoke-direct {v1, v2, v3, v4}, Lr0/e0;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_2
    const/16 v0, 0x8

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 61
    .line 62
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    return-void
.end method

.method public final k(Ljava/lang/Class;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lr0/g0;->h:LA0/a0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lr0/g0;->g:Landroid/content/Context;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, LF0/u;->a:LF0/u;

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-static {v0}, LA0/l;->o(Landroid/content/Context;)LA0/a0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_1
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, v0, LA0/a0;->b:Ljava/util/List;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-nez v0, :cond_3

    .line 23
    .line 24
    sget-object v0, LF0/s;->a:LF0/s;

    .line 25
    .line 26
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_5

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    move-object v3, v2

    .line 46
    check-cast v3, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_4

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    invoke-static {v1}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/4 v1, 0x0

    .line 71
    const/4 v2, 0x1

    .line 72
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    const-string v4, "onBindViewHolder"

    .line 75
    .line 76
    const/4 v5, 0x2

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    goto :goto_7

    .line 80
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    array-length v6, v0

    .line 88
    move v7, v1

    .line 89
    :goto_3
    if-ge v7, v6, :cond_8

    .line 90
    .line 91
    aget-object v8, v0, v7

    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-static {v9, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-eqz v9, :cond_7

    .line 102
    .line 103
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    array-length v9, v9

    .line 108
    if-lt v9, v5, :cond_7

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    aget-object v8, v8, v2

    .line 115
    .line 116
    invoke-static {v8, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-eqz v8, :cond_7

    .line 121
    .line 122
    move v6, v2

    .line 123
    goto :goto_4

    .line 124
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_8
    move v6, v1

    .line 128
    :goto_4
    array-length v7, v0

    .line 129
    move v8, v1

    .line 130
    :goto_5
    if-ge v8, v7, :cond_a

    .line 131
    .line 132
    aget-object v9, v0, v8

    .line 133
    .line 134
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    const-string v10, "getName(...)"

    .line 139
    .line 140
    invoke-static {v9, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const-string v10, "notify"

    .line 144
    .line 145
    invoke-static {v9, v1, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    if-eqz v9, :cond_9

    .line 150
    .line 151
    move v0, v2

    .line 152
    goto :goto_6

    .line 153
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_a
    move v0, v1

    .line 157
    :goto_6
    if-eqz v6, :cond_e

    .line 158
    .line 159
    if-eqz v0, :cond_e

    .line 160
    .line 161
    :goto_7
    iget-object v0, p0, Lr0/g0;->b:Ljava/util/Set;

    .line 162
    .line 163
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-nez v0, :cond_b

    .line 168
    .line 169
    goto :goto_a

    .line 170
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    const-string v6, "getMethods(...)"

    .line 175
    .line 176
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    new-instance v6, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    array-length v7, v0

    .line 185
    :goto_8
    if-ge v1, v7, :cond_d

    .line 186
    .line 187
    aget-object v8, v0, v1

    .line 188
    .line 189
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-static {v9, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-eqz v9, :cond_c

    .line 198
    .line 199
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    array-length v9, v9

    .line 204
    if-lt v9, v5, :cond_c

    .line 205
    .line 206
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    aget-object v9, v9, v2

    .line 211
    .line 212
    invoke-static {v9, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-eqz v9, :cond_c

    .line 217
    .line 218
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_d
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_e

    .line 233
    .line 234
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, Ljava/lang/reflect/Method;

    .line 239
    .line 240
    new-instance v2, Lm0/f;

    .line 241
    .line 242
    const/4 v3, 0x3

    .line 243
    invoke-direct {v2, p0, p1, v3}, Lm0/f;-><init>(Le0/a;Ljava/lang/Object;I)V

    .line 244
    .line 245
    .line 246
    invoke-static {v1, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 247
    .line 248
    .line 249
    goto :goto_9

    .line 250
    :cond_e
    :goto_a
    return-void
.end method

.method public final m(Ljava/lang/String;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lr0/g0;->h:LA0/a0;

    .line 2
    .line 3
    const-string v1, "com.tencent.mm.ui.mvvm.MvvmContactListUI"

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lr0/g0;->g:Landroid/content/Context;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-static {v0}, LA0/l;->o(Landroid/content/Context;)LA0/a0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-object v0, v0, LA0/a0;->a:Ljava/util/List;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-nez v0, :cond_3

    .line 27
    .line 28
    sget-object v0, LF0/s;->a:LF0/s;

    .line 29
    .line 30
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_5

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    move-object v4, v3

    .line 50
    check-cast v4, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_4

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    invoke-static {v1}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v2, v0}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_2
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    const/4 p1, 0x1

    .line 81
    return p1

    .line 82
    :cond_6
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    return p1
.end method

.method public final n(Landroid/view/View;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    move v2, v0

    .line 10
    :goto_0
    const/16 v3, 0xc

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-ge v2, v3, :cond_2

    .line 14
    .line 15
    instance-of v3, v1, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    move-object v4, v1

    .line 20
    check-cast v4, Landroid/app/Activity;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    instance-of v3, v1, Landroid/content/ContextWrapper;

    .line 24
    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    check-cast v1, Landroid/content/ContextWrapper;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    :goto_1
    if-eqz v4, :cond_4

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Lr0/g0;->m(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    invoke-static {v4}, Lb1/h;->F(Landroid/app/Activity;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :cond_4
    const-string v1, "k13"

    .line 59
    .line 60
    invoke-static {p1, v1}, Lr0/g0;->d(Landroid/view/View;Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_5

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_5
    const-string v1, "oom"

    .line 68
    .line 69
    invoke-static {p1, v1}, Lr0/g0;->d(Landroid/view/View;Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_6

    .line 74
    .line 75
    const-string v1, "q0d"

    .line 76
    .line 77
    invoke-static {p1, v1}, Lr0/g0;->d(Landroid/view/View;Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_6

    .line 82
    .line 83
    :goto_2
    return v0

    .line 84
    :cond_6
    const/4 p1, 0x1

    .line 85
    return p1
.end method

.method public final o(Landroid/view/View;)Z
    .locals 5

    .line 1
    invoke-static {p1}, Lr0/g0;->l(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    iget-object v0, p0, Lr0/g0;->h:LA0/a0;

    .line 9
    .line 10
    const-string v1, "mim"

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lr0/g0;->g:Landroid/content/Context;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-static {v1}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_2

    .line 23
    :cond_1
    invoke-static {v0}, LA0/l;->o(Landroid/content/Context;)LA0/a0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_2
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-object v0, v0, LA0/a0;->c:Ljava/util/List;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-nez v0, :cond_4

    .line 34
    .line 35
    sget-object v0, LF0/s;->a:LF0/s;

    .line 36
    .line 37
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_6

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v4, v3

    .line 57
    check-cast v4, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_5

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_6
    invoke-static {v1}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v2, v0}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :goto_2
    invoke-static {p1}, Lr0/g0;->i(Landroid/view/View;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v0, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_7

    .line 90
    .line 91
    :goto_3
    const/4 p1, 0x0

    .line 92
    return p1

    .line 93
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0, p1}, Lr0/g0;->n(Landroid/view/View;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    return p1
.end method

.method public final varargs p([Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lr0/g0;->f:I

    .line 2
    .line 3
    const/16 v1, 0x50

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    iput v0, p0, Lr0/g0;->f:I

    .line 11
    .line 12
    new-instance v0, Lr0/P;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {v0, v1}, Lr0/P;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x1e

    .line 19
    .line 20
    const-string v2, " | "

    .line 21
    .line 22
    invoke-static {p1, v2, v0, v1}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "MaskContactSelectProbe(tag): "

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final q(Landroid/view/View;)V
    .locals 5

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const-string v4, "getChildAt(...)"

    .line 20
    .line 21
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v3}, Lr0/g0;->q(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0, p1}, Lr0/g0;->r(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final r(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/g0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr0/e0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget v1, v0, Lr0/e0;->a:I

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v3, 0x0

    .line 25
    iget-object v4, v0, Lr0/e0;->b:Ljava/lang/Integer;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iget v5, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 34
    .line 35
    if-eq v5, v4, :cond_1

    .line 36
    .line 37
    iput v4, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 38
    .line 39
    move v3, v2

    .line 40
    :cond_1
    iget-object v0, v0, Lr0/e0;->c:Ljava/lang/Integer;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v4, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 49
    .line 50
    if-eq v4, v0, :cond_2

    .line 51
    .line 52
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move v2, v3

    .line 56
    :goto_0
    move v3, v2

    .line 57
    :cond_3
    if-eqz v3, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_1
    return-void
.end method

.method public final s(Landroid/view/View;)V
    .locals 13

    .line 1
    const/4 v1, 0x1

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {p0, v0}, Lr0/g0;->n(Landroid/view/View;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lr0/g0;->r(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string v0, "mjc"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lr0/g0;->d(Landroid/view/View;Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_34

    .line 23
    .line 24
    const-string v0, "a_4"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lr0/g0;->d(Landroid/view/View;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_34

    .line 31
    .line 32
    const-string v0, "kbq"

    .line 33
    .line 34
    invoke-static {p1, v0}, Lr0/g0;->d(Landroid/view/View;Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_34

    .line 39
    .line 40
    sget-boolean v0, Lz0/i;->a:Z

    .line 41
    .line 42
    invoke-static {}, Lz0/g;->x()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lr0/g0;->r(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    const-class v0, Lq0/h;

    .line 53
    .line 54
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lq0/h;

    .line 59
    .line 60
    invoke-virtual {v2}, Lq0/h;->c()V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lz0/g;->s()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_2

    .line 68
    .line 69
    sget-object v0, LF0/s;->a:LF0/s;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lq0/h;

    .line 77
    .line 78
    new-instance v2, Ljava/util/ArrayList;

    .line 79
    .line 80
    iget-object v0, v0, Lq0/h;->a:Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 83
    .line 84
    .line 85
    move-object v0, v2

    .line 86
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    const/4 v4, 0x0

    .line 100
    if-eqz v3, :cond_5

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Ljava/lang/String;

    .line 107
    .line 108
    if-eqz v3, :cond_4

    .line 109
    .line 110
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    :cond_4
    if-eqz v4, :cond_3

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_7

    .line 138
    .line 139
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    move-object v5, v3

    .line 144
    check-cast v5, Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-nez v6, :cond_6

    .line 151
    .line 152
    sget-boolean v6, Lz0/i;->a:Z

    .line 153
    .line 154
    invoke-static {v5}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-nez v5, :cond_6

    .line 159
    .line 160
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_7
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    sget-boolean v0, Lz0/i;->a:Z

    .line 169
    .line 170
    invoke-static {}, Lz0/g;->x()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    const-string v3, "enabled="

    .line 175
    .line 176
    invoke-static {v3, v0}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    const-string v5, "hiddenCount="

    .line 185
    .line 186
    invoke-static {v3, v5}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    const-string v5, "tag page switch"

    .line 191
    .line 192
    filled-new-array {v5, v0, v3}, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {p0, v0}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_8

    .line 204
    .line 205
    invoke-virtual {p0, p1}, Lr0/g0;->r(Landroid/view/View;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_8
    invoke-virtual {p0, p1}, Lr0/g0;->g(Landroid/view/View;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    const/4 v3, 0x0

    .line 214
    if-eqz v0, :cond_9

    .line 215
    .line 216
    goto/16 :goto_13

    .line 217
    .line 218
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    instance-of v5, v0, Landroid/view/View;

    .line 223
    .line 224
    if-eqz v5, :cond_a

    .line 225
    .line 226
    check-cast v0, Landroid/view/View;

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_a
    move-object v0, v4

    .line 230
    :goto_3
    if-eqz v0, :cond_c

    .line 231
    .line 232
    invoke-static {v0}, Lr0/g0;->l(Landroid/view/View;)Z

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-eqz v5, :cond_b

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    instance-of v5, v0, Landroid/view/View;

    .line 244
    .line 245
    if-eqz v5, :cond_a

    .line 246
    .line 247
    check-cast v0, Landroid/view/View;

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_c
    move-object v0, v4

    .line 251
    :goto_4
    if-nez v0, :cond_d

    .line 252
    .line 253
    :goto_5
    move-object v0, v4

    .line 254
    goto/16 :goto_13

    .line 255
    .line 256
    :cond_d
    const-string v5, "getChildAdapterPosition"

    .line 257
    .line 258
    const-string v6, "getChildLayoutPosition"

    .line 259
    .line 260
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    move v6, v3

    .line 265
    :goto_6
    const/4 v7, 0x2

    .line 266
    if-ge v6, v7, :cond_10

    .line 267
    .line 268
    aget-object v7, v5, v6

    .line 269
    .line 270
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    invoke-static {v0, v7, v8}, Lr0/g0;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    instance-of v8, v7, Ljava/lang/Number;

    .line 279
    .line 280
    if-eqz v8, :cond_e

    .line 281
    .line 282
    check-cast v7, Ljava/lang/Number;

    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_e
    move-object v7, v4

    .line 286
    :goto_7
    if-eqz v7, :cond_f

    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_f
    add-int/2addr v6, v1

    .line 290
    goto :goto_6

    .line 291
    :cond_10
    const-string v5, "findContainingViewHolder"

    .line 292
    .line 293
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    invoke-static {v0, v5, v6}, Lr0/g0;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    if-nez v5, :cond_12

    .line 302
    .line 303
    const-string v5, "getChildViewHolder"

    .line 304
    .line 305
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    invoke-static {v0, v5, v6}, Lr0/g0;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    if-nez v5, :cond_12

    .line 314
    .line 315
    :cond_11
    move-object v7, v4

    .line 316
    goto :goto_a

    .line 317
    :cond_12
    const-string v6, "getBindingAdapterPosition"

    .line 318
    .line 319
    const-string v7, "getAbsoluteAdapterPosition"

    .line 320
    .line 321
    const-string v8, "getAdapterPosition"

    .line 322
    .line 323
    const-string v9, "getLayoutPosition"

    .line 324
    .line 325
    filled-new-array {v6, v7, v8, v9}, [Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    move v7, v3

    .line 330
    :goto_8
    const/4 v8, 0x4

    .line 331
    if-ge v7, v8, :cond_11

    .line 332
    .line 333
    aget-object v8, v6, v7

    .line 334
    .line 335
    new-array v9, v3, [Ljava/lang/Object;

    .line 336
    .line 337
    invoke-static {v5, v8, v9}, Lr0/g0;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v8

    .line 341
    instance-of v9, v8, Ljava/lang/Number;

    .line 342
    .line 343
    if-eqz v9, :cond_13

    .line 344
    .line 345
    check-cast v8, Ljava/lang/Number;

    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_13
    move-object v8, v4

    .line 349
    :goto_9
    if-eqz v8, :cond_14

    .line 350
    .line 351
    move-object v7, v8

    .line 352
    goto :goto_a

    .line 353
    :cond_14
    add-int/2addr v7, v1

    .line 354
    goto :goto_8

    .line 355
    :goto_a
    if-nez v7, :cond_15

    .line 356
    .line 357
    goto :goto_5

    .line 358
    :cond_15
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    if-gez v5, :cond_17

    .line 363
    .line 364
    :cond_16
    :goto_b
    move-object v0, v4

    .line 365
    goto/16 :goto_12

    .line 366
    .line 367
    :cond_17
    invoke-static {v0}, Lr0/g0;->h(Landroid/view/View;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    if-nez v6, :cond_18

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_18
    const-string v0, "getItemAt"

    .line 375
    .line 376
    const-string v7, "getItemByPosition"

    .line 377
    .line 378
    const-string v8, "getItem"

    .line 379
    .line 380
    filled-new-array {v8, v0, v7}, [Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    move v8, v3

    .line 385
    :goto_c
    const/4 v0, 0x3

    .line 386
    if-ge v8, v0, :cond_1b

    .line 387
    .line 388
    aget-object v0, v7, v8

    .line 389
    .line 390
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 391
    .line 392
    .line 393
    move-result-object v9

    .line 394
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v9

    .line 398
    sget-object v10, Lc0/f;->b:Ld0/b;

    .line 399
    .line 400
    invoke-interface {v10, v6, v0, v9}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 404
    goto :goto_d

    .line 405
    :catchall_0
    move-exception v0

    .line 406
    new-instance v9, LE0/d;

    .line 407
    .line 408
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 409
    .line 410
    .line 411
    move-object v0, v9

    .line 412
    :goto_d
    nop

    .line 413
    instance-of v9, v0, LE0/d;

    .line 414
    .line 415
    if-eqz v9, :cond_19

    .line 416
    .line 417
    move-object v0, v4

    .line 418
    :cond_19
    if-eqz v0, :cond_1a

    .line 419
    .line 420
    goto/16 :goto_12

    .line 421
    .line 422
    :cond_1a
    add-int/2addr v8, v1

    .line 423
    goto :goto_c

    .line 424
    :cond_1b
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    const-string v0, "getDeclaredFields(...)"

    .line 433
    .line 434
    invoke-static {v7, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    array-length v8, v7

    .line 438
    move v9, v3

    .line 439
    :goto_e
    if-ge v9, v8, :cond_16

    .line 440
    .line 441
    aget-object v10, v7, v9

    .line 442
    .line 443
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-eqz v0, :cond_1c

    .line 452
    .line 453
    goto :goto_11

    .line 454
    :cond_1c
    :try_start_1
    invoke-virtual {v10, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v10, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    instance-of v11, v0, Ljava/util/List;

    .line 462
    .line 463
    if-eqz v11, :cond_1d

    .line 464
    .line 465
    move-object v11, v0

    .line 466
    check-cast v11, Ljava/util/List;

    .line 467
    .line 468
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 469
    .line 470
    .line 471
    move-result v11

    .line 472
    if-ge v5, v11, :cond_1d

    .line 473
    .line 474
    check-cast v0, Ljava/util/List;

    .line 475
    .line 476
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 480
    goto :goto_10

    .line 481
    :catchall_1
    move-exception v0

    .line 482
    goto :goto_f

    .line 483
    :cond_1d
    move-object v0, v4

    .line 484
    goto :goto_10

    .line 485
    :goto_f
    new-instance v11, LE0/d;

    .line 486
    .line 487
    invoke-direct {v11, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 488
    .line 489
    .line 490
    move-object v0, v11

    .line 491
    :goto_10
    nop

    .line 492
    instance-of v11, v0, LE0/d;

    .line 493
    .line 494
    if-eqz v11, :cond_1e

    .line 495
    .line 496
    move-object v0, v4

    .line 497
    :cond_1e
    if-eqz v0, :cond_1f

    .line 498
    .line 499
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v5

    .line 507
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v6

    .line 511
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    move-result-object v7

    .line 515
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v7

    .line 519
    const-string v8, "tag page adapter item"

    .line 520
    .line 521
    filled-new-array {v8, v5, v6, v7}, [Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    invoke-virtual {p0, v5}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    goto :goto_12

    .line 529
    :cond_1f
    :goto_11
    add-int/2addr v9, v1

    .line 530
    goto :goto_e

    .line 531
    :goto_12
    if-nez v0, :cond_20

    .line 532
    .line 533
    goto/16 :goto_5

    .line 534
    .line 535
    :cond_20
    new-instance v5, Ljava/util/IdentityHashMap;

    .line 536
    .line 537
    invoke-direct {v5}, Ljava/util/IdentityHashMap;-><init>()V

    .line 538
    .line 539
    .line 540
    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    invoke-static {v0, v3, v5}, Lr0/g0;->f(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    :goto_13
    new-instance v5, Ljava/util/ArrayList;

    .line 549
    .line 550
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 551
    .line 552
    .line 553
    invoke-static {v5, p1}, Lr0/g0;->b(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 554
    .line 555
    .line 556
    const-string v11, ""

    .line 557
    .line 558
    if-nez v0, :cond_21

    .line 559
    .line 560
    move-object v6, v11

    .line 561
    goto :goto_14

    .line 562
    :cond_21
    move-object v6, v0

    .line 563
    :goto_14
    const-string v7, "user="

    .line 564
    .line 565
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v12

    .line 569
    const/4 v8, 0x0

    .line 570
    const/4 v9, 0x0

    .line 571
    const-string v6, "|"

    .line 572
    .line 573
    const/4 v7, 0x0

    .line 574
    const/16 v10, 0x3e

    .line 575
    .line 576
    invoke-static/range {v5 .. v10}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    const-string v7, "texts="

    .line 581
    .line 582
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v6

    .line 586
    if-eqz v0, :cond_23

    .line 587
    .line 588
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 589
    .line 590
    .line 591
    move-result v7

    .line 592
    if-eqz v7, :cond_22

    .line 593
    .line 594
    goto :goto_15

    .line 595
    :cond_22
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v7

    .line 599
    if-eqz v7, :cond_23

    .line 600
    .line 601
    goto :goto_16

    .line 602
    :cond_23
    :goto_15
    move v1, v3

    .line 603
    :goto_16
    const-string v3, "matchedUser="

    .line 604
    .line 605
    invoke-static {v3, v1}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    const-string v3, "tag page row scan"

    .line 610
    .line 611
    filled-new-array {v3, v12, v6, v1}, [Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-virtual {p0, v1}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    const-string v1, "tag page row hide"

    .line 619
    .line 620
    if-eqz v0, :cond_25

    .line 621
    .line 622
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 623
    .line 624
    .line 625
    move-result v3

    .line 626
    if-eqz v3, :cond_24

    .line 627
    .line 628
    goto :goto_17

    .line 629
    :cond_24
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    if-eqz v3, :cond_25

    .line 634
    .line 635
    invoke-virtual {p0, p1}, Lr0/g0;->j(Landroid/view/View;)V

    .line 636
    .line 637
    .line 638
    const-string p1, "by=user"

    .line 639
    .line 640
    filled-new-array {v1, p1, v0}, [Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object p1

    .line 644
    invoke-virtual {p0, p1}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    return-void

    .line 648
    :cond_25
    :goto_17
    sget-boolean v0, Lz0/i;->a:Z

    .line 649
    .line 650
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    new-instance v3, Ljava/util/ArrayList;

    .line 655
    .line 656
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    :cond_26
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 664
    .line 665
    .line 666
    move-result v6

    .line 667
    if-eqz v6, :cond_29

    .line 668
    .line 669
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v6

    .line 673
    move-object v7, v6

    .line 674
    check-cast v7, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 675
    .line 676
    invoke-virtual {v7}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v7

    .line 680
    if-eqz v7, :cond_27

    .line 681
    .line 682
    invoke-static {v7}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 683
    .line 684
    .line 685
    move-result-object v7

    .line 686
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v7

    .line 690
    goto :goto_19

    .line 691
    :cond_27
    move-object v7, v4

    .line 692
    :goto_19
    if-nez v7, :cond_28

    .line 693
    .line 694
    move-object v7, v11

    .line 695
    :cond_28
    invoke-interface {v2, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result v7

    .line 699
    if-eqz v7, :cond_26

    .line 700
    .line 701
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    goto :goto_18

    .line 705
    :cond_29
    new-instance v0, Ljava/util/ArrayList;

    .line 706
    .line 707
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    :goto_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 715
    .line 716
    .line 717
    move-result v3

    .line 718
    if-eqz v3, :cond_2e

    .line 719
    .line 720
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    check-cast v3, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 725
    .line 726
    invoke-virtual {v3}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v6

    .line 730
    if-eqz v6, :cond_2a

    .line 731
    .line 732
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 733
    .line 734
    .line 735
    move-result-object v6

    .line 736
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v6

    .line 740
    goto :goto_1b

    .line 741
    :cond_2a
    move-object v6, v4

    .line 742
    :goto_1b
    if-nez v6, :cond_2b

    .line 743
    .line 744
    move-object v6, v11

    .line 745
    :cond_2b
    invoke-virtual {v3}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v3

    .line 749
    if-eqz v3, :cond_2c

    .line 750
    .line 751
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 752
    .line 753
    .line 754
    move-result-object v3

    .line 755
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v3

    .line 759
    goto :goto_1c

    .line 760
    :cond_2c
    move-object v3, v4

    .line 761
    :goto_1c
    if-nez v3, :cond_2d

    .line 762
    .line 763
    move-object v3, v11

    .line 764
    :cond_2d
    filled-new-array {v6, v3}, [Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    invoke-static {v3}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 769
    .line 770
    .line 771
    move-result-object v3

    .line 772
    invoke-static {v3, v0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 773
    .line 774
    .line 775
    goto :goto_1a

    .line 776
    :cond_2e
    new-instance v2, Ljava/util/ArrayList;

    .line 777
    .line 778
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    :cond_2f
    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    if-eqz v3, :cond_30

    .line 790
    .line 791
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v3

    .line 795
    move-object v6, v3

    .line 796
    check-cast v6, Ljava/lang/String;

    .line 797
    .line 798
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 799
    .line 800
    .line 801
    move-result v6

    .line 802
    if-nez v6, :cond_2f

    .line 803
    .line 804
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    goto :goto_1d

    .line 808
    :cond_30
    invoke-static {v2}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    :cond_31
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 817
    .line 818
    .line 819
    move-result v3

    .line 820
    if-eqz v3, :cond_32

    .line 821
    .line 822
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    move-object v5, v3

    .line 827
    check-cast v5, Ljava/lang/String;

    .line 828
    .line 829
    invoke-interface {v0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v5

    .line 833
    if-eqz v5, :cond_31

    .line 834
    .line 835
    move-object v4, v3

    .line 836
    :cond_32
    check-cast v4, Ljava/lang/String;

    .line 837
    .line 838
    if-eqz v4, :cond_33

    .line 839
    .line 840
    invoke-virtual {p0, p1}, Lr0/g0;->j(Landroid/view/View;)V

    .line 841
    .line 842
    .line 843
    const-string p1, "by=text"

    .line 844
    .line 845
    filled-new-array {v1, p1, v4}, [Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object p1

    .line 849
    invoke-virtual {p0, p1}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 850
    .line 851
    .line 852
    goto :goto_1e

    .line 853
    :cond_33
    invoke-virtual {p0, p1}, Lr0/g0;->r(Landroid/view/View;)V

    .line 854
    .line 855
    .line 856
    :goto_1e
    return-void

    .line 857
    :cond_34
    invoke-virtual {p0, p1}, Lr0/g0;->r(Landroid/view/View;)V

    .line 858
    .line 859
    .line 860
    return-void
.end method

.method public final t(Landroid/view/View;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_3

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lr0/g0;->o(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, ""

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {p1}, Lr0/g0;->i(Landroid/view/View;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v1, v2

    .line 29
    :goto_0
    const-string v2, "scrub target found"

    .line 30
    .line 31
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lr0/g0;->c:Ljava/util/Set;

    .line 39
    .line 40
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lr0/g0;->d:Ljava/util/WeakHashMap;

    .line 44
    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lr0/g0;->h(Landroid/view/View;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p0, v0}, Lr0/g0;->k(Ljava/lang/Class;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {p0, p1}, Lr0/g0;->u(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    invoke-static {p1}, Lr0/g0;->i(Landroid/view/View;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v2, "mim"

    .line 78
    .line 79
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_4

    .line 84
    .line 85
    invoke-static {p1}, Lr0/g0;->i(Landroid/view/View;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v2, "k12"

    .line 90
    .line 91
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {p1}, Lr0/g0;->i(Landroid/view/View;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-nez v2, :cond_5

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    move-object v1, v2

    .line 113
    :goto_1
    const-string v2, "scrub target pass"

    .line 114
    .line 115
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {p0, v0}, Lr0/g0;->e([Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_6
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 123
    .line 124
    if-eqz v0, :cond_7

    .line 125
    .line 126
    check-cast p1, Landroid/view/ViewGroup;

    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    const/4 v1, 0x0

    .line 133
    :goto_2
    if-ge v1, v0, :cond_7

    .line 134
    .line 135
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {p0, v2}, Lr0/g0;->t(Landroid/view/View;)V

    .line 140
    .line 141
    .line 142
    add-int/lit8 v1, v1, 0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_7
    :goto_3
    return-void
.end method

.method public final u(Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    check-cast p1, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "getChildAt(...)"

    .line 20
    .line 21
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lr0/g0;->s(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    :goto_1
    return-void
.end method
