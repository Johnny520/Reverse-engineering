.class public final Leb/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Leb/d;

.field public static volatile b:Z

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final f:Ljava/util/List;

.field public static final g:Ljava/util/List;

.field public static final h:Log/k;

.field public static final i:Log/k;

.field public static final j:Log/k;

.field public static final k:Log/k;

.field public static final l:Log/k;

.field public static final m:Log/k;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Leb/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Leb/d;->a:Leb/d;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Leb/d;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Leb/d;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Leb/d;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    const-string v6, "scan the qr code"

    .line 30
    .line 31
    const-string v7, "\u901a\u8fc7\u626b\u63cf"

    .line 32
    .line 33
    const-string v1, "\u52a0\u5165\u4e86\u7fa4\u804a"

    .line 34
    .line 35
    const-string v2, "joined the group chat"

    .line 36
    .line 37
    const-string v3, "invited"

    .line 38
    .line 39
    const-string v4, "\u9080\u8bf7"

    .line 40
    .line 41
    const-string v5, "\u4e8c\u7ef4\u7801"

    .line 42
    .line 43
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Leb/d;->f:Ljava/util/List;

    .line 52
    .line 53
    const-string v0, "\u9000\u51fa\u4e86\u7fa4\u804a"

    .line 54
    .line 55
    const-string v1, "left the group chat"

    .line 56
    .line 57
    const-string v2, "\u79fb\u51fa\u4e86\u7fa4\u804a"

    .line 58
    .line 59
    const-string v3, "removed from the group chat"

    .line 60
    .line 61
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Leb/d;->g:Ljava/util/List;

    .line 70
    .line 71
    new-instance v0, Log/k;

    .line 72
    .line 73
    const-string v1, "<link\\b[^>]*\\bname=\"([^\"]+)\"[^>]*\\busername=\"([^\"]+)\""

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-direct {v0, v1, v2}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Leb/d;->h:Log/k;

    .line 80
    .line 81
    new-instance v0, Log/k;

    .line 82
    .line 83
    const-string v1, "<link\\b[^>]*\\busername=\"([^\"]+)\"[^>]*\\bname=\"([^\"]+)\""

    .line 84
    .line 85
    invoke-direct {v0, v1, v2}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    sput-object v0, Leb/d;->i:Log/k;

    .line 89
    .line 90
    new-instance v0, Log/k;

    .line 91
    .line 92
    const-string v1, "<member\\b[^>]*\\bnickname=\"([^\"]+)\"[^>]*\\busername=\"([^\"]+)\""

    .line 93
    .line 94
    invoke-direct {v0, v1, v2}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    sput-object v0, Leb/d;->j:Log/k;

    .line 98
    .line 99
    new-instance v0, Log/k;

    .line 100
    .line 101
    const-string v1, "<member\\b[^>]*\\busername=\"([^\"]+)\"[^>]*\\bnickname=\"([^\"]+)\""

    .line 102
    .line 103
    invoke-direct {v0, v1, v2}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 104
    .line 105
    .line 106
    sput-object v0, Leb/d;->k:Log/k;

    .line 107
    .line 108
    new-instance v0, Log/k;

    .line 109
    .line 110
    const-string v1, "\\busername=\"([^\"]+)\"[^>]{0,160}?\\bname=\"([^\"]+)\""

    .line 111
    .line 112
    invoke-direct {v0, v1, v2}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 113
    .line 114
    .line 115
    sput-object v0, Leb/d;->l:Log/k;

    .line 116
    .line 117
    new-instance v0, Log/k;

    .line 118
    .line 119
    const-string v1, "\\bname=\"([^\"]+)\"[^>]{0,160}?\\busername=\"([^\"]+)\""

    .line 120
    .line 121
    invoke-direct {v0, v1, v2}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    sput-object v0, Leb/d;->m:Log/k;

    .line 125
    .line 126
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "|"

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v0

    .line 14
    :goto_0
    const-string v1, ""

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    move-object p0, v1

    .line 19
    :cond_1
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move-object p1, v0

    .line 31
    :goto_1
    if-nez p1, :cond_3

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_3
    move-object v1, p1

    .line 35
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_4

    .line 40
    .line 41
    goto :goto_4

    .line 42
    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-nez p1, :cond_5

    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_5
    sget-object p1, Leb/d;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    invoke-static {p0, v1}, Leb/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Ljava/lang/String;

    .line 60
    .line 61
    if-eqz p0, :cond_7

    .line 62
    .line 63
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_6

    .line 68
    .line 69
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_6

    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    goto :goto_3

    .line 77
    :cond_6
    const/4 p1, 0x0

    .line 78
    :goto_3
    if-eqz p1, :cond_7

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_7
    :goto_4
    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 6

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_6

    .line 8
    .line 9
    :cond_0
    sget-object v0, Leb/d;->h:Log/k;

    .line 10
    .line 11
    invoke-static {v0, p0}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lf/i0;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lf/i0;-><init>(Lng/c;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lf/i0;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v3, 0x2

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {v1}, Lf/i0;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Log/f;

    .line 33
    .line 34
    check-cast v0, Log/i;

    .line 35
    .line 36
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Log/g;

    .line 41
    .line 42
    invoke-virtual {v4, v2}, Log/g;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v2}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Log/g;

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Log/g;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-lez v3, :cond_1

    .line 89
    .line 90
    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    sget-object v0, Leb/d;->i:Log/k;

    .line 95
    .line 96
    invoke-static {v0, p0}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v1, Lf/i0;

    .line 101
    .line 102
    invoke-direct {v1, v0}, Lf/i0;-><init>(Lng/c;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lf/i0;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-virtual {v1}, Lf/i0;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Log/f;

    .line 116
    .line 117
    check-cast v0, Log/i;

    .line 118
    .line 119
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Log/g;

    .line 124
    .line 125
    invoke-virtual {v4, v2}, Log/g;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v4}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Log/g;

    .line 148
    .line 149
    invoke-virtual {v0, v3}, Log/g;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v0}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-lez v5, :cond_3

    .line 172
    .line 173
    invoke-interface {p1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_4
    sget-object v0, Leb/d;->j:Log/k;

    .line 178
    .line 179
    invoke-static {v0, p0}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    new-instance v1, Lf/i0;

    .line 184
    .line 185
    invoke-direct {v1, v0}, Lf/i0;-><init>(Lng/c;)V

    .line 186
    .line 187
    .line 188
    :cond_5
    :goto_2
    invoke-virtual {v1}, Lf/i0;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_6

    .line 193
    .line 194
    invoke-virtual {v1}, Lf/i0;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Log/f;

    .line 199
    .line 200
    check-cast v0, Log/i;

    .line 201
    .line 202
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    check-cast v4, Log/g;

    .line 207
    .line 208
    invoke-virtual {v4, v2}, Log/g;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    check-cast v4, Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v4}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    check-cast v0, Log/g;

    .line 231
    .line 232
    invoke-virtual {v0, v3}, Log/g;->get(I)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, Ljava/lang/String;

    .line 237
    .line 238
    invoke-static {v0}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-lez v5, :cond_5

    .line 255
    .line 256
    invoke-interface {p1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_6
    sget-object v0, Leb/d;->k:Log/k;

    .line 261
    .line 262
    invoke-static {v0, p0}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    new-instance v1, Lf/i0;

    .line 267
    .line 268
    invoke-direct {v1, v0}, Lf/i0;-><init>(Lng/c;)V

    .line 269
    .line 270
    .line 271
    :cond_7
    :goto_3
    invoke-virtual {v1}, Lf/i0;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_8

    .line 276
    .line 277
    invoke-virtual {v1}, Lf/i0;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    check-cast v0, Log/f;

    .line 282
    .line 283
    check-cast v0, Log/i;

    .line 284
    .line 285
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    check-cast v4, Log/g;

    .line 290
    .line 291
    invoke-virtual {v4, v2}, Log/g;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    check-cast v4, Ljava/lang/String;

    .line 296
    .line 297
    invoke-static {v4}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    check-cast v0, Log/g;

    .line 314
    .line 315
    invoke-virtual {v0, v3}, Log/g;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, Ljava/lang/String;

    .line 320
    .line 321
    invoke-static {v0}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    if-lez v5, :cond_7

    .line 338
    .line 339
    invoke-interface {p1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    goto :goto_3

    .line 343
    :cond_8
    sget-object v0, Leb/d;->l:Log/k;

    .line 344
    .line 345
    invoke-static {v0, p0}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    new-instance v1, Lf/i0;

    .line 350
    .line 351
    invoke-direct {v1, v0}, Lf/i0;-><init>(Lng/c;)V

    .line 352
    .line 353
    .line 354
    :cond_9
    :goto_4
    invoke-virtual {v1}, Lf/i0;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-eqz v0, :cond_a

    .line 359
    .line 360
    invoke-virtual {v1}, Lf/i0;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    check-cast v0, Log/f;

    .line 365
    .line 366
    check-cast v0, Log/i;

    .line 367
    .line 368
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    check-cast v4, Log/g;

    .line 373
    .line 374
    invoke-virtual {v4, v2}, Log/g;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    check-cast v4, Ljava/lang/String;

    .line 379
    .line 380
    invoke-static {v4}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    check-cast v0, Log/g;

    .line 397
    .line 398
    invoke-virtual {v0, v3}, Log/g;->get(I)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    check-cast v0, Ljava/lang/String;

    .line 403
    .line 404
    invoke-static {v0}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    if-lez v5, :cond_9

    .line 421
    .line 422
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    if-lez v5, :cond_9

    .line 427
    .line 428
    invoke-virtual {p1, v4}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    if-nez v5, :cond_9

    .line 433
    .line 434
    invoke-interface {p1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    goto :goto_4

    .line 438
    :cond_a
    sget-object v0, Leb/d;->m:Log/k;

    .line 439
    .line 440
    invoke-static {v0, p0}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    new-instance v0, Lf/i0;

    .line 445
    .line 446
    invoke-direct {v0, p0}, Lf/i0;-><init>(Lng/c;)V

    .line 447
    .line 448
    .line 449
    :cond_b
    :goto_5
    invoke-virtual {v0}, Lf/i0;->hasNext()Z

    .line 450
    .line 451
    .line 452
    move-result p0

    .line 453
    if-eqz p0, :cond_c

    .line 454
    .line 455
    invoke-virtual {v0}, Lf/i0;->next()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    check-cast p0, Log/f;

    .line 460
    .line 461
    check-cast p0, Log/i;

    .line 462
    .line 463
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    check-cast v1, Log/g;

    .line 468
    .line 469
    invoke-virtual {v1, v2}, Log/g;->get(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    check-cast v1, Ljava/lang/String;

    .line 474
    .line 475
    invoke-static {v1}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    check-cast p0, Log/g;

    .line 492
    .line 493
    invoke-virtual {p0, v3}, Log/g;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    check-cast p0, Ljava/lang/String;

    .line 498
    .line 499
    invoke-static {p0}, Leb/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object p0

    .line 511
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 512
    .line 513
    .line 514
    move-result v4

    .line 515
    if-lez v4, :cond_b

    .line 516
    .line 517
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    if-lez v4, :cond_b

    .line 522
    .line 523
    invoke-virtual {p1, p0}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v4

    .line 527
    if-nez v4, :cond_b

    .line 528
    .line 529
    invoke-interface {p1, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    goto :goto_5

    .line 533
    :cond_c
    :goto_6
    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "&lt;"

    .line 2
    .line 3
    const-string v1, "<"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "&gt;"

    .line 11
    .line 12
    const-string v1, ">"

    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "&quot;"

    .line 19
    .line 20
    const-string v1, "\""

    .line 21
    .line 22
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "&apos;"

    .line 27
    .line 28
    const-string v1, "\'"

    .line 29
    .line 30
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "&amp;"

    .line 35
    .line 36
    const-string v1, "&"

    .line 37
    .line 38
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sget-object v2, Leb/d;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/16 v4, 0x80

    .line 27
    .line 28
    if-ge v3, v4, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    new-instance v4, Lca/c;

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    invoke-direct {v4, v0, v1, v5}, Lca/c;-><init>(JI)V

    .line 39
    .line 40
    .line 41
    new-instance v5, Lbe/i;

    .line 42
    .line 43
    const/16 v6, 0x9

    .line 44
    .line 45
    invoke-direct {v5, v4, v6}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v3, v5}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 49
    .line 50
    .line 51
    :goto_0
    const-string v3, "|"

    .line 52
    .line 53
    invoke-static {p0, v3, p1, v3, p2}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Ljava/lang/Long;

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    sub-long v4, v0, v4

    .line 70
    .line 71
    const-wide/16 v6, 0x1388

    .line 72
    .line 73
    cmp-long v4, v4, v6

    .line 74
    .line 75
    if-gez v4, :cond_2

    .line 76
    .line 77
    :goto_1
    return-void

    .line 78
    :cond_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v2, v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 86
    .line 87
    invoke-virtual {v0, p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnMemberChange(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0, p1}, Leb/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, p0, p1}, Lg8/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object p0, v1

    .line 29
    :goto_0
    if-eqz p0, :cond_2

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    move-object v1, p0

    .line 51
    :cond_3
    if-eqz v1, :cond_4

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_4
    return-object p1
.end method

.method public static g()V
    .locals 6

    .line 1
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Lg8/d;->g()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 26
    .line 27
    iget-object v2, v1, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v1, v1, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {v1}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v3, Le9/h;

    .line 51
    .line 52
    const/16 v4, 0x9

    .line 53
    .line 54
    invoke-direct {v3, v4}, Le9/h;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v3}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v3, Le9/h;

    .line 62
    .line 63
    const/16 v4, 0xa

    .line 64
    .line 65
    invoke-direct {v3, v4}, Le9/h;-><init>(I)V

    .line 66
    .line 67
    .line 68
    new-instance v4, Lng/i;

    .line 69
    .line 70
    const/4 v5, 0x1

    .line 71
    invoke-direct {v4, v1, v5, v3}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 72
    .line 73
    .line 74
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 75
    .line 76
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {v4, v1}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    sget-object v3, Leb/d;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 90
    .line 91
    invoke-virtual {v3, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    invoke-static {v2, v1}, Leb/d;->h(Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    return-void
.end method

.method public static h(Ljava/lang/String;Ljava/util/LinkedHashSet;)V
    .locals 6

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lg8/i;->w(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    sget-object v0, Ltf/u;->g:Ltf/u;

    .line 17
    .line 18
    :cond_1
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_5

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move-object v3, v1

    .line 52
    :goto_2
    if-nez v3, :cond_4

    .line 53
    .line 54
    const-string v3, ""

    .line 55
    .line 56
    :cond_4
    invoke-static {p0, v2}, Leb/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    sget-object v5, Leb/d;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-lez v4, :cond_2

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_2

    .line 76
    .line 77
    invoke-static {p0, v2}, Leb/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v5, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    return-void
.end method
