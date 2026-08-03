.class public final Lha/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:Log/k;


# instance fields
.field public final a:Lr8/g;

.field public final b:Lab/b;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Landroid/content/SharedPreferences;

.field public volatile e:Z

.field public volatile f:Z

.field public volatile g:Z

.field public final h:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Log/k;

    .line 2
    .line 3
    const-string v1, "\\$\\{(?:originalText|time|type|snsId|userName)\\}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lha/s;->i:Log/k;

    .line 9
    .line 10
    return-void
.end method

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
    iput-object p1, p0, Lha/s;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lha/s;->b:Lab/b;

    .line 10
    .line 11
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string p2, "Hchat_moments_bottom_detail_config"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p0, Lha/s;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    const-string p2, "Hchat_moments_bottom_detail_method_cache"

    .line 22
    .line 23
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lha/s;->d:Landroid/content/SharedPreferences;

    .line 28
    .line 29
    new-instance p1, Lha/p;

    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-direct {p1, p2}, Lha/p;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lha/s;->h:Ljava/lang/ThreadLocal;

    .line 40
    .line 41
    return-void
.end method

.method public static final a(Lha/s;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 1
    iget-object p0, p0, Lha/s;->c:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_a

    .line 6
    .line 7
    :cond_0
    const-string v0, "field_snsId"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lha/s;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_e

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const-string v2, "field_userName"

    .line 20
    .line 21
    invoke-static {p1, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v2, 0x0

    .line 33
    :goto_0
    const-string v3, ""

    .line 34
    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    move-object v2, v3

    .line 38
    :cond_2
    const-string v4, "field_createTime"

    .line 39
    .line 40
    invoke-static {p1, v4}, Lha/s;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-wide/16 v5, 0x0

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v7

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-wide v7, v5

    .line 54
    :goto_1
    const-string v4, "field_type"

    .line 55
    .line 56
    invoke-static {p1, v4}, Lha/s;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    long-to-int p1, v9

    .line 67
    goto :goto_2

    .line 68
    :cond_4
    const/4 p1, 0x0

    .line 69
    :goto_2
    cmp-long v4, v7, v5

    .line 70
    .line 71
    if-gtz v4, :cond_5

    .line 72
    .line 73
    move-object v4, p2

    .line 74
    goto :goto_6

    .line 75
    :cond_5
    const-string v4, "moments_bottom_detail_time_format"

    .line 76
    .line 77
    const-string v5, "yyyy-MM-dd HH:mm:ss"

    .line 78
    .line 79
    invoke-interface {p0, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    if-nez v4, :cond_6

    .line 84
    .line 85
    move-object v4, v3

    .line 86
    :cond_6
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_7

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_7
    move-object v5, v4

    .line 102
    :goto_3
    :try_start_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 103
    .line 104
    sget-object v6, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 105
    .line 106
    invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v4, v5}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 114
    .line 115
    .line 116
    new-instance v5, Ljava/util/Date;

    .line 117
    .line 118
    const-wide/16 v9, 0x3e8

    .line 119
    .line 120
    mul-long/2addr v7, v9

    .line 121
    invoke-direct {v5, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    goto :goto_4

    .line 129
    :catchall_0
    move-exception v4

    .line 130
    new-instance v5, Lsf/f;

    .line 131
    .line 132
    invoke-direct {v5, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    move-object v4, v5

    .line 136
    :goto_4
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    if-nez v5, :cond_8

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_8
    move-object v4, p2

    .line 144
    :goto_5
    check-cast v4, Ljava/lang/String;

    .line 145
    .line 146
    :goto_6
    new-instance v5, Lsf/e;

    .line 147
    .line 148
    const-string v6, "${originalText}"

    .line 149
    .line 150
    invoke-direct {v5, v6, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    new-instance p2, Lsf/e;

    .line 154
    .line 155
    const-string v6, "${time}"

    .line 156
    .line 157
    invoke-direct {p2, v6, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    sget-object v4, Lha/d0;->h:La2/a;

    .line 161
    .line 162
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    const/4 v4, 0x1

    .line 166
    if-eq p1, v4, :cond_b

    .line 167
    .line 168
    const/4 v4, 0x2

    .line 169
    if-eq p1, v4, :cond_a

    .line 170
    .line 171
    const/16 v4, 0xf

    .line 172
    .line 173
    if-eq p1, v4, :cond_9

    .line 174
    .line 175
    const/16 v4, 0x36

    .line 176
    .line 177
    if-eq p1, v4, :cond_b

    .line 178
    .line 179
    sget-object p1, Lha/d0;->l:Lha/d0;

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_9
    sget-object p1, Lha/d0;->k:Lha/d0;

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_a
    sget-object p1, Lha/d0;->i:Lha/d0;

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_b
    sget-object p1, Lha/d0;->j:Lha/d0;

    .line 189
    .line 190
    :goto_7
    iget-object p1, p1, Lha/d0;->g:Ljava/lang/String;

    .line 191
    .line 192
    new-instance v4, Lsf/e;

    .line 193
    .line 194
    const-string v6, "${type}"

    .line 195
    .line 196
    invoke-direct {v4, v6, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v0, v1}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    new-instance v0, Lsf/e;

    .line 204
    .line 205
    const-string v1, "${snsId}"

    .line 206
    .line 207
    invoke-direct {v0, v1, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    new-instance p1, Lsf/e;

    .line 211
    .line 212
    const-string v1, "${userName}"

    .line 213
    .line 214
    invoke-direct {p1, v1, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    filled-new-array {v5, p2, v4, v0, p1}, [Lsf/e;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-static {p1}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    const-string p2, "moments_bottom_detail_text_format"

    .line 226
    .line 227
    const-string v0, "${originalText} | ${time}"

    .line 228
    .line 229
    invoke-interface {p0, p2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    if-nez p0, :cond_c

    .line 234
    .line 235
    goto :goto_8

    .line 236
    :cond_c
    move-object v3, p0

    .line 237
    :goto_8
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    if-eqz p2, :cond_d

    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_d
    move-object v0, p0

    .line 253
    :goto_9
    new-instance p0, Lc9/k1;

    .line 254
    .line 255
    const/16 p2, 0x8

    .line 256
    .line 257
    invoke-direct {p0, p1, p2}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 258
    .line 259
    .line 260
    sget-object p1, Lha/s;->i:Log/k;

    .line 261
    .line 262
    invoke-virtual {p1, v0, p0}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    return-object p0

    .line 267
    :cond_e
    :goto_a
    return-object p2
.end method

.method public static c(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    const-string v0, "field_snsId"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "field_userName"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const-string v0, "field_createTime"

    .line 18
    .line 19
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const-string v0, "field_type"

    .line 26
    .line 27
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public static d(Ljava/lang/reflect/Method;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    array-length v0, v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-class v1, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :cond_1
    const/4 p0, 0x0

    .line 66
    return p0
.end method

.method public static f(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    array-length p0, v0

    .line 41
    const/4 v1, 0x3

    .line 42
    if-ne p0, v1, :cond_0

    .line 43
    .line 44
    aget-object p0, v0, v2

    .line 45
    .line 46
    const-class v1, Landroid/widget/TextView;

    .line 47
    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    const/4 p0, 0x1

    .line 55
    aget-object v3, v0, p0

    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    const/4 v1, 0x2

    .line 64
    aget-object v0, v0, v1

    .line 65
    .line 66
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    return p0

    .line 75
    :cond_0
    return v2
.end method

.method public static g(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    array-length v1, v0

    .line 29
    const/4 v3, 0x1

    .line 30
    if-ne v1, v3, :cond_0

    .line 31
    .line 32
    aget-object v0, v0, v2

    .line 33
    .line 34
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_0

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_0

    .line 73
    .line 74
    return v3

    .line 75
    :cond_0
    return v2
.end method

.method public static h(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-class v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Lha/s;->c(Ljava/lang/Class;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    const/4 p0, 0x1

    .line 55
    return p0

    .line 56
    :cond_0
    const/4 p0, 0x0

    .line 57
    return p0
.end method

.method public static o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    instance-of v0, p0, Ljava/lang/Number;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    move-object p1, p0

    .line 13
    check-cast p1, Ljava/lang/Number;

    .line 14
    .line 15
    :cond_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
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
    :cond_2
    return-object p1
.end method


# virtual methods
.method public final b(Lfh/k;Lfg/l;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    iget-object v0, p0, Lha/s;->a:Lr8/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 5
    .line 6
    new-instance v3, Lch/e;

    .line 7
    .line 8
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, v3, Lch/e;->h:Lfh/k;

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    .line 38
    :try_start_1
    iget-object v4, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception v3

    .line 46
    :try_start_2
    new-instance v4, Lsf/f;

    .line 47
    .line 48
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object v3, v4

    .line 52
    :goto_1
    nop

    .line 53
    instance-of v4, v3, Lsf/f;

    .line 54
    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    move-object v3, v1

    .line 58
    :cond_1
    check-cast v3, Ljava/lang/reflect/Method;

    .line 59
    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_1
    move-exception p1

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {p2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move-object v0, v1

    .line 96
    :goto_2
    check-cast v0, Ljava/lang/reflect/Method;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :goto_3
    new-instance v0, Lsf/f;

    .line 100
    .line 101
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_5

    .line 109
    .line 110
    iget-object p2, p0, Lha/s;->b:Lab/b;

    .line 111
    .line 112
    const-string v2, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5 DexKit \u5b9a\u4f4d\u5931\u8d25"

    .line 113
    .line 114
    invoke-virtual {p2, v2, p1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    :cond_5
    instance-of p1, v0, Lsf/f;

    .line 118
    .line 119
    if-eqz p1, :cond_6

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_6
    move-object v1, v0

    .line 123
    :goto_5
    check-cast v1, Ljava/lang/reflect/Method;

    .line 124
    .line 125
    return-object v1
.end method

.method public final i()Ljava/lang/reflect/Method;
    .locals 14

    .line 1
    invoke-virtual {p0}, Lha/s;->n()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/s;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lha/s;->d:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "flutter_profile_switch"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-static {v1}, Lha/s;->d(Ljava/lang/reflect/Method;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    new-instance v1, Lfh/k;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v4, "enableFlutterSNSPage"

    .line 36
    .line 37
    const-string v5, "com.tencent.mm.plugin.sns.router.SnsRouter"

    .line 38
    .line 39
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v1, v4}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v5, Lc0/f;

    .line 47
    .line 48
    const-class v4, Lha/s;

    .line 49
    .line 50
    invoke-static {v4}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    const/4 v12, 0x0

    .line 55
    const/16 v13, 0xf

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    const-string v9, "isFlutterProfileSwitchMethod"

    .line 59
    .line 60
    const-string v10, "isFlutterProfileSwitchMethod(Ljava/lang/reflect/Method;)Z"

    .line 61
    .line 62
    const/4 v11, 0x0

    .line 63
    move-object v7, p0

    .line 64
    invoke-direct/range {v5 .. v13}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1, v5}, Lha/s;->b(Lfh/k;Lfg/l;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    invoke-static {v2, v0, v3, v1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_2
    invoke-static {v2, v0, v3}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object v1
.end method

.method public final j(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lha/s;->n()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/s;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lha/s;->d:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "group_method"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {p1, v1}, Lha/s;->e(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v4

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    new-instance v1, Lfh/k;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-virtual {v1, v5}, Lfh/k;->m0(I)V

    .line 38
    .line 39
    .line 40
    const-string v5, "getShowGroupEnable"

    .line 41
    .line 42
    filled-new-array {v5}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v1, v5}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v5, Lha/q;

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    invoke-direct {v5, p0, p1, v6}, Lha/q;-><init>(Lha/s;Ljava/lang/Class;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1, v5}, Lha/s;->b(Lfh/k;Lfg/l;)Ljava/lang/reflect/Method;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-static {v2, v0, v3, p1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_2
    invoke-static {v2, v0, v3}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lha/s;->b:Lab/b;

    .line 69
    .line 70
    const-string v1, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5\u672a\u627e\u5230\u53ef\u89c1\u8303\u56f4\u65b9\u6cd5"

    .line 71
    .line 72
    invoke-virtual {v0, v1, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    return-object p1
.end method

.method public final k()Ljava/lang/reflect/Method;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lha/s;->n()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/s;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lha/s;->d:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "profile_formatter_method"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {v1}, Lha/s;->f(Ljava/lang/reflect/Method;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v4

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    new-instance v1, Lfh/k;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v5, "cerateTimeView"

    .line 37
    .line 38
    const-string v6, "formatTimeInGrid"

    .line 39
    .line 40
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v1, v5}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v6, Lc0/f;

    .line 48
    .line 49
    const-class v5, Lha/s;

    .line 50
    .line 51
    invoke-static {v5}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    const/4 v13, 0x0

    .line 56
    const/16 v14, 0x10

    .line 57
    .line 58
    const/4 v7, 0x1

    .line 59
    const-string v10, "isProfileFormatterMethod"

    .line 60
    .line 61
    const-string v11, "isProfileFormatterMethod(Ljava/lang/reflect/Method;)Z"

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    move-object v8, p0

    .line 65
    invoke-direct/range {v6 .. v14}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1, v6}, Lha/s;->b(Lfh/k;Lfg/l;)Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-static {v2, v0, v3, v1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 75
    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_2
    invoke-static {v2, v0, v3}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v8, Lha/s;->b:Lab/b;

    .line 82
    .line 83
    const-string v2, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5\u672a\u627e\u5230\u4e2a\u4eba\u4e3b\u9875\u65f6\u95f4\u65b9\u6cd5"

    .line 84
    .line 85
    invoke-virtual {v0, v2, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    return-object v1
.end method

.method public final l(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lha/s;->n()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/s;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lha/s;->d:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "profile_item_method"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {p1, v1}, Lha/s;->g(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v4

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    new-instance v1, Lfh/k;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v5, "getItem"

    .line 37
    .line 38
    const-string v6, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter"

    .line 39
    .line 40
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v1, v5}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v5, Lha/q;

    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    invoke-direct {v5, p0, p1, v6}, Lha/q;-><init>(Lha/s;Ljava/lang/Class;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1, v5}, Lha/s;->b(Lfh/k;Lfg/l;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    invoke-static {v2, v0, v3, p1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_2
    invoke-static {v2, v0, v3}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lha/s;->b:Lab/b;

    .line 67
    .line 68
    const-string v1, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5\u672a\u627e\u5230\u4e2a\u4eba\u4e3b\u9875\u6761\u76ee\u65b9\u6cd5"

    .line 69
    .line 70
    invoke-virtual {v0, v1, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    return-object p1
.end method

.method public final m()Ljava/lang/reflect/Method;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lha/s;->n()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/s;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lha/s;->d:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "time_method"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {v1}, Lha/s;->h(Ljava/lang/reflect/Method;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v4

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    new-instance v1, Lfh/k;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v5, "java.lang.String"

    .line 37
    .line 38
    invoke-static {v1, v5}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-virtual {v1, v5}, Lfh/k;->m0(I)V

    .line 43
    .line 44
    .line 45
    const-string v5, "getTimeString"

    .line 46
    .line 47
    filled-new-array {v5}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v1, v5}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v6, Lc0/f;

    .line 55
    .line 56
    const-class v5, Lha/s;

    .line 57
    .line 58
    invoke-static {v5}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    const/4 v13, 0x0

    .line 63
    const/16 v14, 0x11

    .line 64
    .line 65
    const/4 v7, 0x1

    .line 66
    const-string v10, "isTimeMethod"

    .line 67
    .line 68
    const-string v11, "isTimeMethod(Ljava/lang/reflect/Method;)Z"

    .line 69
    .line 70
    const/4 v12, 0x0

    .line 71
    move-object v8, p0

    .line 72
    invoke-direct/range {v6 .. v14}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v1, v6}, Lha/s;->b(Lfh/k;Lfg/l;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    invoke-static {v2, v0, v3, v1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_2
    invoke-static {v2, v0, v3}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v8, Lha/s;->b:Lab/b;

    .line 89
    .line 90
    const-string v2, "\u670b\u53cb\u5708\u5e95\u90e8\u8be6\u60c5\u672a\u627e\u5230\u65f6\u95f4\u65b9\u6cd5"

    .line 91
    .line 92
    invoke-virtual {v0, v2, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    return-object v1
.end method

.method public final n()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lha/s;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Ll8/i;->h:Ljava/lang/String;

    .line 15
    .line 16
    return-object v0
.end method
