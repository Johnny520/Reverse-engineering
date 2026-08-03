.class public final Lb9/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Ljava/util/Map;

.field public final c:Landroid/content/SharedPreferences;

.field public volatile d:Z

.field public final e:Ljava/lang/Object;

.field public f:Ljava/io/Serializable;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr8/g;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lb9/f;->a:Lr8/g;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string v0, "Hchat_chat_time_style_config"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lb9/f;->c:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    const-string v1, "Hchat_chat_time_style_method_cache"

    .line 20
    .line 21
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lb9/f;->e:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lb9/f;->f:Ljava/io/Serializable;

    .line 33
    .line 34
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lb9/f;->g:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lb9/f;->h:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lb9/f;->b:Ljava/util/Map;

    .line 52
    .line 53
    new-instance p1, Lb9/b;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {p1, p0, v1}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lb9/f;->a:Lr8/g;

    .line 65
    iput-object p2, p0, Lb9/f;->e:Ljava/lang/Object;

    .line 66
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    move-result-object p2

    .line 67
    iput-object p2, p0, Lb9/f;->b:Ljava/util/Map;

    .line 68
    iget-object p1, p1, Lr8/g;->g:Lub/a;

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    iget-object p1, p1, Lub/a;->a:Landroid/content/Context;

    const-string p2, "Hchat_feature_"

    const-string v0, "real_name_tail_runtime"

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 71
    iput-object p1, p0, Lb9/f;->c:Landroid/content/SharedPreferences;

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->version()Lo8/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lo8/k;->b()Ll8/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Ll8/i;->d:Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v0, "unknown"

    .line 15
    .line 16
    :goto_0
    const-string v1, "feature_"

    .line 17
    .line 18
    const-string v2, "_beforetransfer_class"

    .line 19
    .line 20
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public static j(Ljava/lang/Object;)J
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [Ljava/lang/Class;

    .line 7
    .line 8
    const-string v3, "getCreateTime"

    .line 9
    .line 10
    invoke-static {v0, v3, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-array v2, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {v0, p0, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lb9/f;->k(Ljava/lang/Object;)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    cmp-long v0, v4, v2

    .line 33
    .line 34
    if-lez v0, :cond_0

    .line 35
    .line 36
    return-wide v4

    .line 37
    :cond_0
    const-string v0, "field_createTime"

    .line 38
    .line 39
    const-string v4, "createTime"

    .line 40
    .line 41
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    const/4 v4, 0x2

    .line 46
    if-lt v1, v4, :cond_1

    .line 47
    .line 48
    return-wide v2

    .line 49
    :cond_1
    aget-object v4, v0, v1

    .line 50
    .line 51
    invoke-static {p0, v4}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v4}, Lb9/f;->k(Ljava/lang/Object;)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    cmp-long v6, v4, v2

    .line 66
    .line 67
    if-lez v6, :cond_2

    .line 68
    .line 69
    return-wide v4

    .line 70
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    goto :goto_0
.end method

.method public static k(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static l(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_10

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    if-gt p0, v1, :cond_10

    .line 6
    .line 7
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    const-string v1, "com.tencent.mm.storage."

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v1, p1, v2}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_1
    invoke-static {p1}, Lb9/f;->j(Ljava/lang/Object;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    const-wide/16 v5, 0x0

    .line 30
    .line 31
    cmp-long v1, v3, v5

    .line 32
    .line 33
    if-lez v1, :cond_6

    .line 34
    .line 35
    const-string v1, "getMsgId"

    .line 36
    .line 37
    const-string v3, "getMsgID"

    .line 38
    .line 39
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    move v3, v2

    .line 44
    :goto_0
    const/4 v4, 0x2

    .line 45
    if-lt v3, v4, :cond_4

    .line 46
    .line 47
    const-string v1, "msgId"

    .line 48
    .line 49
    const-string v3, "msgID"

    .line 50
    .line 51
    const-string v4, "field_msgId"

    .line 52
    .line 53
    filled-new-array {v4, v1, v3}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    move v1, v2

    .line 58
    :goto_1
    const/4 v3, 0x3

    .line 59
    if-lt v1, v3, :cond_2

    .line 60
    .line 61
    move-wide v7, v5

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    aget-object v3, v4, v1

    .line 64
    .line 65
    invoke-static {p1, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v3}, Lb9/f;->k(Ljava/lang/Object;)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-eqz v3, :cond_3

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    cmp-long v3, v7, v5

    .line 80
    .line 81
    if-lez v3, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    aget-object v4, v1, v3

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    new-array v8, v2, [Ljava/lang/Class;

    .line 94
    .line 95
    invoke-static {v7, v4, v8}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    new-array v7, v2, [Ljava/lang/Object;

    .line 100
    .line 101
    invoke-static {v4, p1, v7}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static {v4}, Lb9/f;->k(Ljava/lang/Object;)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-eqz v4, :cond_5

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v7

    .line 115
    cmp-long v4, v7, v5

    .line 116
    .line 117
    if-lez v4, :cond_5

    .line 118
    .line 119
    :goto_2
    cmp-long v1, v7, v5

    .line 120
    .line 121
    if-lez v1, :cond_6

    .line 122
    .line 123
    return-object p1

    .line 124
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_6
    :goto_3
    instance-of v1, p1, [Ljava/lang/Object;

    .line 128
    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    check-cast p1, [Ljava/lang/Object;

    .line 132
    .line 133
    array-length v1, p1

    .line 134
    :goto_4
    if-ge v2, v1, :cond_10

    .line 135
    .line 136
    aget-object v3, p1, v2

    .line 137
    .line 138
    add-int/lit8 v4, p0, 0x1

    .line 139
    .line 140
    invoke-static {v4, v3, p2}, Lb9/f;->l(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    if-eqz v3, :cond_7

    .line 145
    .line 146
    return-object v3

    .line 147
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_8
    instance-of v1, p1, Ljava/util/Collection;

    .line 151
    .line 152
    if-eqz v1, :cond_a

    .line 153
    .line 154
    check-cast p1, Ljava/lang/Iterable;

    .line 155
    .line 156
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_10

    .line 165
    .line 166
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    add-int/lit8 v2, p0, 0x1

    .line 171
    .line 172
    invoke-static {v2, v1, p2}, Lb9/f;->l(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-eqz v1, :cond_9

    .line 177
    .line 178
    return-object v1

    .line 179
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    const-string v3, "java."

    .line 188
    .line 189
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-nez v3, :cond_10

    .line 194
    .line 195
    const-string v3, "android."

    .line 196
    .line 197
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-nez v1, :cond_10

    .line 202
    .line 203
    instance-of v1, p1, Landroid/view/View;

    .line 204
    .line 205
    if-eqz v1, :cond_b

    .line 206
    .line 207
    return-object v0

    .line 208
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    :goto_5
    if-eqz v1, :cond_10

    .line 213
    .line 214
    const-class v2, Ljava/lang/Object;

    .line 215
    .line 216
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-nez v2, :cond_10

    .line 221
    .line 222
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    :cond_c
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_f

    .line 235
    .line 236
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    check-cast v3, Ljava/lang/reflect/Field;

    .line 241
    .line 242
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-nez v4, :cond_c

    .line 247
    .line 248
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-nez v4, :cond_c

    .line 257
    .line 258
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    if-eqz v4, :cond_d

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_d
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    const-class v5, Ljava/lang/String;

    .line 274
    .line 275
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-nez v4, :cond_c

    .line 280
    .line 281
    const-class v4, Ljava/lang/Number;

    .line 282
    .line 283
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-eqz v4, :cond_e

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_e
    invoke-static {v3, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    if-eqz v3, :cond_c

    .line 299
    .line 300
    add-int/lit8 v4, p0, 0x1

    .line 301
    .line 302
    invoke-static {v4, v3, p2}, Lb9/f;->l(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    if-eqz v3, :cond_c

    .line 307
    .line 308
    return-object v3

    .line 309
    :cond_f
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    goto :goto_5

    .line 314
    :cond_10
    :goto_7
    return-object v0
.end method


# virtual methods
.method public a(Landroid/widget/TextView;Lb9/d;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "hidden"

    .line 2
    .line 3
    invoke-virtual {p3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 p2, 0x8

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string v0, "custom"

    .line 16
    .line 17
    invoke-virtual {p3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eqz p3, :cond_5

    .line 22
    .line 23
    iget p3, p2, Lb9/d;->c:I

    .line 24
    .line 25
    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget p3, p2, Lb9/d;->c:I

    .line 29
    .line 30
    if-nez p3, :cond_4

    .line 31
    .line 32
    iget-wide v0, p2, Lb9/d;->a:J

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    cmp-long p3, v0, v2

    .line 37
    .line 38
    if-lez p3, :cond_4

    .line 39
    .line 40
    iget-object p2, p0, Lb9/f;->c:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    const-string p3, "chat_time_format"

    .line 43
    .line 44
    const-string v2, "yyyy-MM-dd HH:mm:ss"

    .line 45
    .line 46
    invoke-interface {p2, p3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    if-nez p2, :cond_1

    .line 51
    .line 52
    const-string p2, ""

    .line 53
    .line 54
    :cond_1
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    if-eqz p3, :cond_2

    .line 59
    .line 60
    move-object p2, v2

    .line 61
    :cond_2
    :try_start_0
    new-instance p3, Ljava/text/SimpleDateFormat;

    .line 62
    .line 63
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-direct {p3, p2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 68
    .line 69
    .line 70
    new-instance p2, Ljava/util/Date;

    .line 71
    .line 72
    invoke-direct {p2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p2

    .line 81
    new-instance p3, Lsf/f;

    .line 82
    .line 83
    invoke-direct {p3, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    move-object p2, p3

    .line 87
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    if-nez p3, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    new-instance p2, Ljava/text/SimpleDateFormat;

    .line 95
    .line 96
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    invoke-direct {p2, v2, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 101
    .line 102
    .line 103
    new-instance p3, Ljava/util/Date;

    .line 104
    .line 105
    invoke-direct {p3, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, p3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    check-cast p2, Ljava/lang/String;

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    iget-object p2, p2, Lb9/d;->b:Ljava/lang/String;

    .line 119
    .line 120
    :goto_2
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_5
    iget-object p3, p2, Lb9/d;->b:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    iget p2, p2, Lb9/d;->c:I

    .line 130
    .line 131
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public c()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lb9/f;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lb9/f;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lb9/f;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/reflect/Method;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lb9/f;->i()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lb9/f;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/lang/reflect/Method;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 29
    .line 30
    new-instance v3, Lb9/e;

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    invoke-direct {v3, p0, v4}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v0, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v0, p0, Lb9/f;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, Lb9/f;->h:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/lang/reflect/Method;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 v1, 0x0

    .line 53
    :goto_0
    iput-boolean v1, p0, Lb9/f;->d:Z

    .line 54
    .line 55
    iget-boolean v0, p0, Lb9/f;->d:Z

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    new-instance v1, Lsf/f;

    .line 64
    .line 65
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    move-object v0, v1

    .line 69
    :goto_1
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    iget-object v0, p0, Lb9/f;->e:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lab/b;

    .line 79
    .line 80
    const-string v2, "\u5b9e\u540d\u67e5\u8be2\u521d\u59cb\u5316\u5931\u8d25"

    .line 81
    .line 82
    invoke-virtual {v0, v2, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 86
    .line 87
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    return v0
.end method

.method public d(Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 8

    .line 1
    iget-object v0, p0, Lb9/f;->f:Ljava/io/Serializable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/reflect/Field;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    move-object v1, p1

    .line 15
    :goto_0
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_6

    .line 17
    .line 18
    const-class v3, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_6

    .line 25
    .line 26
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    move-object v5, v4

    .line 45
    check-cast v5, Ljava/lang/reflect/Field;

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    const-string v7, "itemView"

    .line 52
    .line 53
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-nez v6, :cond_3

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const-class v6, Landroid/view/View;

    .line 64
    .line 65
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/4 v5, 0x0

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    :goto_1
    const/4 v5, 0x1

    .line 75
    :goto_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_1

    .line 84
    .line 85
    move-object v2, v4

    .line 86
    :cond_4
    check-cast v2, Ljava/lang/reflect/Field;

    .line 87
    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    return-object v2

    .line 94
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    goto :goto_0

    .line 99
    :cond_6
    return-object v2
.end method

.method public e(Ljava/lang/Object;)Landroid/view/View;
    .locals 3

    .line 1
    const-string v0, "itemView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Landroid/view/View;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Landroid/view/View;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Lb9/f;->d(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    instance-of v0, p1, Landroid/view/View;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p1, Landroid/view/View;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_2
    return-object v2
.end method

.method public f(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 9

    .line 1
    iget-object v0, p0, Lb9/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 4
    .line 5
    iget-object v1, p0, Lb9/f;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/reflect/Field;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    instance-of v0, p1, Landroid/widget/TextView;

    .line 27
    .line 28
    if-eqz v0, :cond_5

    .line 29
    .line 30
    check-cast p1, Landroid/widget/TextView;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :goto_0
    if-eqz v2, :cond_7

    .line 49
    .line 50
    const-class v4, Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_7

    .line 57
    .line 58
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    move-object v6, v5

    .line 77
    check-cast v6, Ljava/lang/reflect/Field;

    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    const-string v8, "timeTV"

    .line 84
    .line 85
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_3

    .line 90
    .line 91
    const-class v7, Landroid/widget/TextView;

    .line 92
    .line 93
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_3

    .line 102
    .line 103
    const/4 v6, 0x1

    .line 104
    goto :goto_1

    .line 105
    :cond_3
    const/4 v6, 0x0

    .line 106
    :goto_1
    if-eqz v6, :cond_2

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v5, v3

    .line 110
    :goto_2
    check-cast v5, Ljava/lang/reflect/Field;

    .line 111
    .line 112
    if-eqz v5, :cond_6

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v1, v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    invoke-static {v5, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    instance-of v0, p1, Landroid/widget/TextView;

    .line 126
    .line 127
    if-eqz v0, :cond_5

    .line 128
    .line 129
    check-cast p1, Landroid/widget/TextView;

    .line 130
    .line 131
    return-object p1

    .line 132
    :cond_5
    :goto_3
    return-object v3

    .line 133
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    goto :goto_0

    .line 138
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    return-object v3
.end method

.method public g(Ljava/lang/reflect/Method;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p1, :cond_9

    .line 17
    .line 18
    array-length p1, v0

    .line 19
    const/4 v2, 0x3

    .line 20
    if-lt p1, v2, :cond_9

    .line 21
    .line 22
    array-length p1, v0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v2, p1, :cond_9

    .line 25
    .line 26
    aget-object v3, v0, v2

    .line 27
    .line 28
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/4 v5, 0x1

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    const-class v4, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    move v3, v1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    :goto_1
    move v3, v5

    .line 49
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_8

    .line 58
    .line 59
    array-length p1, v0

    .line 60
    move v2, v1

    .line 61
    :goto_3
    if-ge v2, p1, :cond_9

    .line 62
    .line 63
    aget-object v3, v0, v2

    .line 64
    .line 65
    invoke-virtual {p0, v3}, Lb9/f;->d(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    :goto_4
    move v3, v5

    .line 72
    goto :goto_7

    .line 73
    :cond_2
    :goto_5
    if-eqz v3, :cond_6

    .line 74
    .line 75
    const-class v4, Ljava/lang/Object;

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_6

    .line 82
    .line 83
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_3

    .line 94
    .line 95
    goto :goto_6

    .line 96
    :cond_3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_5

    .line 105
    .line 106
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    check-cast v6, Ljava/lang/reflect/Field;

    .line 111
    .line 112
    const-class v7, Landroid/view/View;

    .line 113
    .line 114
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-eqz v6, :cond_4

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    :goto_6
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    goto :goto_5

    .line 130
    :cond_6
    move v3, v1

    .line 131
    :goto_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_7

    .line 140
    .line 141
    return v5

    .line 142
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_9
    return v1
.end method

.method public h()Ljava/lang/reflect/Method;
    .locals 11

    .line 1
    iget-object v0, p0, Lb9/f;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iget-object v1, p0, Lb9/f;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v2, v1, Lr8/g;->a:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v3, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v2, v2, Ll8/i;->h:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v5, 0x0

    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v2, v5

    .line 29
    :goto_0
    if-eqz v2, :cond_1

    .line 30
    .line 31
    const-string v4, "|chat_time_style_v1"

    .line 32
    .line 33
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v2, v5

    .line 39
    :goto_1
    const-string v4, ""

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    move-object v2, v4

    .line 44
    :cond_2
    const-string v6, "chat_time_bind"

    .line 45
    .line 46
    invoke-static {v0, v2, v3, v6}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    if-eqz v7, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, v7}, Lb9/f;->g(Ljava/lang/reflect/Method;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    move-object v7, v5

    .line 60
    :goto_2
    if-eqz v7, :cond_4

    .line 61
    .line 62
    return-object v7

    .line 63
    :cond_4
    :try_start_0
    iget-object v1, v1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 64
    .line 65
    new-instance v7, Lch/e;

    .line 66
    .line 67
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    new-instance v8, Lfh/k;

    .line 71
    .line 72
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v9, "MicroMsg.MvvmChattingItem"

    .line 76
    .line 77
    const-string v10, "[onBindView]"

    .line 78
    .line 79
    filled-new-array {v9, v10}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-static {v9}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-static {v8, v9}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 88
    .line 89
    .line 90
    iput-object v8, v7, Lch/e;->h:Lfh/k;

    .line 91
    .line 92
    invoke-virtual {v1, v7}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v7, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-eqz v8, :cond_7

    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    check-cast v8, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 116
    .line 117
    :try_start_1
    invoke-virtual {v8, v3}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 118
    .line 119
    .line 120
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    goto :goto_4

    .line 122
    :catchall_0
    move-exception v8

    .line 123
    :try_start_2
    new-instance v9, Lsf/f;

    .line 124
    .line 125
    invoke-direct {v9, v8}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    move-object v8, v9

    .line 129
    :goto_4
    nop

    .line 130
    instance-of v9, v8, Lsf/f;

    .line 131
    .line 132
    if-eqz v9, :cond_6

    .line 133
    .line 134
    move-object v8, v5

    .line 135
    :cond_6
    check-cast v8, Ljava/lang/reflect/Method;

    .line 136
    .line 137
    if-eqz v8, :cond_5

    .line 138
    .line 139
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :catchall_1
    move-exception v1

    .line 144
    new-instance v7, Lsf/f;

    .line 145
    .line 146
    invoke-direct {v7, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    invoke-static {v7}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-nez v1, :cond_8

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const-string v7, "[Hchat:ChatTimeStyle] \u5b9a\u4f4d\u804a\u5929\u65f6\u95f4\u7ed1\u5b9a\u65b9\u6cd5\u5f02\u5e38: "

    .line 161
    .line 162
    invoke-static {v7, v3, v1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 166
    .line 167
    :goto_5
    check-cast v7, Ljava/util/List;

    .line 168
    .line 169
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-eqz v3, :cond_a

    .line 178
    .line 179
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    move-object v7, v3

    .line 184
    check-cast v7, Ljava/lang/reflect/Method;

    .line 185
    .line 186
    invoke-virtual {p0, v7}, Lb9/f;->g(Ljava/lang/reflect/Method;)Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-eqz v7, :cond_9

    .line 191
    .line 192
    move-object v5, v3

    .line 193
    :cond_a
    check-cast v5, Ljava/lang/reflect/Method;

    .line 194
    .line 195
    if-eqz v5, :cond_b

    .line 196
    .line 197
    invoke-static {v0, v2, v6, v5}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_b
    const-string v1, "cache.key"

    .line 202
    .line 203
    :try_start_3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-nez v0, :cond_c

    .line 216
    .line 217
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 222
    .line 223
    .line 224
    :cond_c
    invoke-interface {v3, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 229
    .line 230
    .line 231
    :catchall_2
    :goto_6
    return-object v5
.end method

.method public i()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lb9/f;->f:Ljava/io/Serializable;

    .line 3
    .line 4
    iput-object v0, p0, Lb9/f;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v0, p0, Lb9/f;->h:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-static {}, Lb9/f;->b()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lb9/f;->c:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v2, v0

    .line 23
    :cond_0
    iget-object v0, p0, Lb9/f;->a:Lr8/g;

    .line 24
    .line 25
    iget-object v3, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 26
    .line 27
    iget-object v4, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 28
    .line 29
    invoke-static {v2, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Lb9/f;->m(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v2, p0, Lb9/f;->f:Ljava/io/Serializable;

    .line 39
    .line 40
    check-cast v2, Ljava/lang/Class;

    .line 41
    .line 42
    if-nez v2, :cond_4

    .line 43
    .line 44
    :try_start_0
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 45
    .line 46
    new-instance v2, Lch/c;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance v3, Lfh/a;

    .line 52
    .line 53
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v5, "/cgi-bin/mmpay-bin/beforetransfer"

    .line 57
    .line 58
    invoke-static {v5}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v3, v5}, Lfh/a;->r0(Lfh/a;Ljava/util/Collection;)V

    .line 63
    .line 64
    .line 65
    iput-object v3, v2, Lch/c;->h:Lfh/a;

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 68
    .line 69
    .line 70
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    new-instance v2, Lsf/f;

    .line 74
    .line 75
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    move-object v0, v2

    .line 79
    :goto_0
    nop

    .line 80
    instance-of v2, v0, Lsf/f;

    .line 81
    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 85
    .line 86
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Lhh/i;

    .line 103
    .line 104
    invoke-virtual {v2}, Lhh/i;->p()Llh/a;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget-object v2, v2, Llh/a;->g:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v2, v4}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {p0, v2}, Lb9/f;->m(Ljava/lang/Class;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    :cond_4
    iget-object v0, p0, Lb9/f;->f:Ljava/io/Serializable;

    .line 121
    .line 122
    check-cast v0, Ljava/lang/Class;

    .line 123
    .line 124
    if-nez v0, :cond_5

    .line 125
    .line 126
    const-string v0, "com.tencent.mm.plugin.remittance.model.i"

    .line 127
    .line 128
    invoke-static {v0, v4}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {p0, v0}, Lb9/f;->m(Ljava/lang/Class;)Z

    .line 133
    .line 134
    .line 135
    :cond_5
    iget-object v0, p0, Lb9/f;->f:Ljava/io/Serializable;

    .line 136
    .line 137
    check-cast v0, Ljava/lang/Class;

    .line 138
    .line 139
    if-eqz v0, :cond_7

    .line 140
    .line 141
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-static {}, Lb9/f;->b()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 158
    .line 159
    .line 160
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_7

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Ljava/lang/reflect/Method;

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    array-length v3, v2

    .line 185
    const/4 v4, 0x4

    .line 186
    if-lt v3, v4, :cond_6

    .line 187
    .line 188
    const/4 v3, 0x0

    .line 189
    aget-object v3, v2, v3

    .line 190
    .line 191
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 192
    .line 193
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_6

    .line 198
    .line 199
    const/4 v3, 0x1

    .line 200
    aget-object v3, v2, v3

    .line 201
    .line 202
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_6

    .line 207
    .line 208
    const/4 v3, 0x2

    .line 209
    aget-object v3, v2, v3

    .line 210
    .line 211
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_6

    .line 216
    .line 217
    const/4 v3, 0x3

    .line 218
    aget-object v2, v2, v3

    .line 219
    .line 220
    const-class v3, Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-eqz v2, :cond_6

    .line 227
    .line 228
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iput-object v0, p0, Lb9/f;->h:Ljava/lang/Object;

    .line 233
    .line 234
    :cond_7
    return-void
.end method

.method public m(Ljava/lang/Class;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    array-length v4, v3

    .line 30
    const/4 v5, 0x2

    .line 31
    if-ne v4, v5, :cond_1

    .line 32
    .line 33
    aget-object v4, v3, v0

    .line 34
    .line 35
    const-class v5, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    aget-object v3, v3, v4

    .line 45
    .line 46
    invoke-static {v3, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    iput-object p1, p0, Lb9/f;->f:Ljava/io/Serializable;

    .line 53
    .line 54
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lb9/f;->g:Ljava/lang/Object;

    .line 59
    .line 60
    return v4

    .line 61
    :cond_2
    return v0
.end method
