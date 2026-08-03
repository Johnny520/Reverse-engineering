.class public final Lxa/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lia/t;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Landroid/os/Handler;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final f:Ljava/util/Map;

.field public final g:Ljava/util/Map;

.field public volatile h:Lxa/i;

.field public final i:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lr8/g;Lia/t;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxa/m;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lxa/m;->b:Lia/t;

    .line 10
    .line 11
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string p2, "Hchat_quick_contact_edit_config"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lxa/m;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    new-instance p2, Landroid/os/Handler;

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lxa/m;->d:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, Lxa/m;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 37
    .line 38
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iput-object p2, p0, Lxa/m;->f:Ljava/util/Map;

    .line 43
    .line 44
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iput-object p2, p0, Lxa/m;->g:Ljava/util/Map;

    .line 49
    .line 50
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iput-object p2, p0, Lxa/m;->i:Ljava/util/Map;

    .line 55
    .line 56
    new-instance p2, Lb9/b;

    .line 57
    .line 58
    const/16 v0, 0xb

    .line 59
    .line 60
    invoke-direct {p2, p0, v0}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, p2}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public static a(Landroid/app/Activity;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static c(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 1
    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p0, Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Landroid/app/Activity;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, Landroid/content/ContextWrapper;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne v0, p0, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object p0, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_2
    :goto_1
    instance-of v0, p0, Landroid/app/Activity;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    check-cast p0, Landroid/app/Activity;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_3
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static d(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_b

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-gt p0, v1, :cond_b

    .line 6
    .line 7
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_6

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    const-string v4, "getUserName"

    .line 31
    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    new-array v2, v3, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {p1, v4, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const-string v2, "field_userName"

    .line 44
    .line 45
    invoke-static {p1, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_0
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-lez v4, :cond_2

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_2
    move-object v2, v0

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    new-array v5, v3, [Ljava/lang/Class;

    .line 81
    .line 82
    invoke-static {v2, v4, v5}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    array-length v4, v4

    .line 96
    if-nez v4, :cond_4

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    const-class v5, Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_4

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    move-object v2, v0

    .line 112
    :goto_1
    if-eqz v2, :cond_2

    .line 113
    .line 114
    new-array v4, v3, [Ljava/lang/Object;

    .line 115
    .line 116
    invoke-static {v2, p1, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    instance-of v4, v2, Ljava/lang/String;

    .line 121
    .line 122
    if-eqz v4, :cond_5

    .line 123
    .line 124
    check-cast v2, Ljava/lang/String;

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    move-object v2, v0

    .line 128
    :goto_2
    if-eqz v2, :cond_2

    .line 129
    .line 130
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    if-eqz v2, :cond_2

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-lez v4, :cond_2

    .line 145
    .line 146
    :goto_3
    if-eqz v2, :cond_6

    .line 147
    .line 148
    return-object v2

    .line 149
    :cond_6
    if-ne p0, v1, :cond_7

    .line 150
    .line 151
    goto/16 :goto_6

    .line 152
    .line 153
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    :goto_4
    if-eqz v1, :cond_b

    .line 158
    .line 159
    const-class v2, Ljava/lang/Object;

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-nez v2, :cond_b

    .line 166
    .line 167
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    :cond_8
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_a

    .line 180
    .line 181
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    check-cast v4, Ljava/lang/reflect/Field;

    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-nez v5, :cond_8

    .line 196
    .line 197
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-eqz v5, :cond_9

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_9
    invoke-static {v4, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    if-eqz v4, :cond_8

    .line 213
    .line 214
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    instance-of v6, v4, Ljava/lang/String;

    .line 223
    .line 224
    if-nez v6, :cond_8

    .line 225
    .line 226
    const-string v6, "android."

    .line 227
    .line 228
    invoke-static {v5, v6, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-nez v6, :cond_8

    .line 233
    .line 234
    const-string v6, "androidx."

    .line 235
    .line 236
    invoke-static {v5, v6, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    if-nez v6, :cond_8

    .line 241
    .line 242
    const-string v6, "java."

    .line 243
    .line 244
    invoke-static {v5, v6, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    if-nez v6, :cond_8

    .line 249
    .line 250
    const-string v6, "kotlin."

    .line 251
    .line 252
    invoke-static {v5, v6, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    if-nez v6, :cond_8

    .line 257
    .line 258
    const-string v6, "kotlinx."

    .line 259
    .line 260
    invoke-static {v5, v6, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-nez v5, :cond_8

    .line 265
    .line 266
    add-int/lit8 v5, p0, 0x1

    .line 267
    .line 268
    invoke-static {v5, v4, p2}, Lxa/m;->d(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    if-eqz v4, :cond_8

    .line 273
    .line 274
    return-object v4

    .line 275
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    goto :goto_4

    .line 280
    :cond_b
    :goto_6
    return-object v0
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_3

    .line 11
    :cond_0
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lg8/i;->H(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    move v0, v1

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v0, v2

    .line 28
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_2

    .line 33
    :goto_1
    new-instance v3, Lsf/f;

    .line 34
    .line 35
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object v0, v3

    .line 39
    :goto_2
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    instance-of v4, v0, Lsf/f;

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    move-object v0, v3

    .line 46
    :cond_2
    check-cast v0, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    :goto_3
    if-eqz v0, :cond_3

    .line 53
    .line 54
    return v1

    .line 55
    :cond_3
    const-string v0, "@openim"

    .line 56
    .line 57
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    goto :goto_7

    .line 64
    :cond_4
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->users()Lg8/k;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    iget-object v0, v0, Lg8/k;->a:Lg8/a;

    .line 71
    .line 72
    invoke-virtual {v0}, Lg8/a;->c()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_5
    const-string v0, ""

    .line 80
    .line 81
    :goto_4
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_6

    .line 86
    .line 87
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_6

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    move v0, v1

    .line 100
    goto :goto_5

    .line 101
    :cond_6
    move v0, v2

    .line 102
    :goto_5
    if-ne v0, v1, :cond_7

    .line 103
    .line 104
    move v0, v1

    .line 105
    goto :goto_6

    .line 106
    :cond_7
    move v0, v2

    .line 107
    :goto_6
    if-eqz v0, :cond_8

    .line 108
    .line 109
    :goto_7
    return v2

    .line 110
    :cond_8
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_a

    .line 115
    .line 116
    invoke-virtual {v0, p0}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-eqz p0, :cond_a

    .line 121
    .line 122
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatContact;->isGroup()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_9

    .line 127
    .line 128
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatContact;->isOfficialAccount()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-nez p0, :cond_9

    .line 133
    .line 134
    goto :goto_8

    .line 135
    :cond_9
    move v1, v2

    .line 136
    :goto_8
    move v2, v1

    .line 137
    :cond_a
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 138
    .line 139
    .line 140
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 141
    goto :goto_9

    .line 142
    :catchall_1
    move-exception p0

    .line 143
    new-instance v0, Lsf/f;

    .line 144
    .line 145
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    move-object p0, v0

    .line 149
    :goto_9
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 150
    .line 151
    instance-of v1, p0, Lsf/f;

    .line 152
    .line 153
    if-eqz v1, :cond_b

    .line 154
    .line 155
    move-object p0, v0

    .line 156
    :cond_b
    check-cast p0, Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    return p0
.end method


# virtual methods
.method public final b()Z
    .locals 3

    .line 1
    const-string v0, "quick_contact_edit_enable"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lxa/m;->c:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public final e(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    iget-object v0, p0, Lxa/m;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_1
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 33
    .line 34
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-object v2, p1

    .line 42
    :goto_0
    invoke-virtual {v1, v2, p2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 43
    .line 44
    .line 45
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p2

    .line 49
    new-instance v1, Lsf/f;

    .line 50
    .line 51
    invoke-direct {v1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object p2, v1

    .line 55
    :goto_1
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance p2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v0, "\u5b89\u88c5\u5feb\u6377\u8bbe\u7f6e Hook \u5931\u8d25: "

    .line 72
    .line 73
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p2, p0, Lxa/m;->b:Lia/t;

    .line 84
    .line 85
    invoke-virtual {p2, p1, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 89
    .line 90
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    return p1

    .line 97
    :cond_4
    :goto_3
    const/4 p1, 0x0

    .line 98
    return p1
.end method

.method public final g(Landroid/app/Activity;Ljava/lang/String;Lfg/a;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lxa/m;->a(Landroid/app/Activity;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lk/s1;

    .line 9
    .line 10
    const/4 v1, 0x7

    .line 11
    invoke-direct {v0, v1}, Lk/s1;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-string v1, "\u8bbe\u7f6e\u5907\u6ce8\u548c\u6807\u7b7e"

    .line 15
    .line 16
    invoke-static {p1, v0, v1, p2}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    new-instance p2, Ljava/lang/Thread;

    .line 21
    .line 22
    new-instance v2, Lb9/c;

    .line 23
    .line 24
    const/16 v7, 0x1b

    .line 25
    .line 26
    move-object v4, p0

    .line 27
    move-object v6, p1

    .line 28
    move-object v3, p3

    .line 29
    invoke-direct/range {v2 .. v7}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    const-string p1, "Hchat-QuickContactUpdate"

    .line 33
    .line 34
    invoke-direct {p2, v2, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final h(Landroid/view/View;)Landroid/view/View$OnLongClickListener;
    .locals 2

    .line 1
    iget-object v0, p0, Lxa/m;->i:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lxa/m;->i:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lxa/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    :try_start_1
    iget-object v0, v1, Lxa/h;->c:Landroid/view/View$OnLongClickListener;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 21
    .line 22
    .line 23
    iget-boolean v0, v1, Lxa/h;->d:Z

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->setLongClickable(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    .line 28
    :catchall_0
    iget-object p1, v1, Lxa/h;->c:Landroid/view/View$OnLongClickListener;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    return-object p1

    .line 33
    :catchall_1
    move-exception p1

    .line 34
    monitor-exit v0

    .line 35
    throw p1
.end method

.method public final i(Lxa/i;)V
    .locals 8

    .line 1
    iget-object v1, p1, Lxa/i;->a:Landroid/app/Activity;

    .line 2
    .line 3
    iget-object v2, p1, Lxa/i;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Lxa/m;->a(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eqz v3, :cond_6

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v3, v2}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    new-instance v4, Lsf/f;

    .line 26
    .line 27
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object v0, v4

    .line 31
    :goto_0
    nop

    .line 32
    instance-of v4, v0, Lsf/f;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    move-object v0, v5

    .line 38
    :cond_1
    check-cast v0, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 39
    .line 40
    if-eqz v0, :cond_6

    .line 41
    .line 42
    invoke-virtual {v3, v2}, Lg8/i;->H(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    iget-boolean v3, p1, Lxa/i;->c:Z

    .line 49
    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-static {v2}, Lxa/m;->f(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const/4 v2, 0x0

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    :goto_1
    const/4 v2, 0x1

    .line 62
    :goto_2
    if-eqz v2, :cond_4

    .line 63
    .line 64
    move-object v5, v0

    .line 65
    :cond_4
    if-eqz v5, :cond_6

    .line 66
    .line 67
    iget-object v0, v5, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    const-string v0, "\u672a\u8bbe\u7f6e"

    .line 76
    .line 77
    :cond_5
    invoke-virtual {v5}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const-string v2, "\u5f53\u524d\u5907\u6ce8\uff1a"

    .line 82
    .line 83
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    new-instance v2, Lsf/e;

    .line 88
    .line 89
    const-string v4, "\u4fee\u6539\u5907\u6ce8"

    .line 90
    .line 91
    invoke-direct {v2, v4, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Lsf/e;

    .line 95
    .line 96
    const-string v4, "\u8bbe\u7f6e\u597d\u53cb\u6807\u7b7e"

    .line 97
    .line 98
    const-string v6, "\u52fe\u9009\u3001\u53d6\u6d88\u6216\u6e05\u7a7a\u5df2\u6709\u6807\u7b7e"

    .line 99
    .line 100
    invoke-direct {v0, v4, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    new-instance v4, Lsf/e;

    .line 104
    .line 105
    const-string v6, "\u65b0\u5efa\u5e76\u6dfb\u52a0\u6807\u7b7e"

    .line 106
    .line 107
    const-string v7, "\u521b\u5efa\u5fae\u4fe1\u597d\u53cb\u6807\u7b7e\u5e76\u6dfb\u52a0\u7ed9\u8be5\u597d\u53cb"

    .line 108
    .line 109
    invoke-direct {v4, v6, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    filled-new-array {v2, v0, v4}, [Lsf/e;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    move-object v0, v5

    .line 121
    new-instance v5, Lwb/dj;

    .line 122
    .line 123
    const/16 v2, 0xb

    .line 124
    .line 125
    invoke-direct {v5, p0, p1, v0, v2}, Lwb/dj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    new-instance v6, Lk/s1;

    .line 129
    .line 130
    const/4 p1, 0x7

    .line 131
    invoke-direct {v6, p1}, Lk/s1;-><init>(I)V

    .line 132
    .line 133
    .line 134
    sget-object v7, Lwb/lv;->j:Lwb/lv;

    .line 135
    .line 136
    const-string v2, "\u8bbe\u7f6e\u5907\u6ce8\u548c\u6807\u7b7e"

    .line 137
    .line 138
    invoke-static/range {v1 .. v7}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 139
    .line 140
    .line 141
    :cond_6
    :goto_3
    return-void
.end method
