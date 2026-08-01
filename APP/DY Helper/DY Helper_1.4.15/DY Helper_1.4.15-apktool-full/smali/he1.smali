.class public abstract Lhe1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lym1;

.field public static final β:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lym1;

    .line 2
    .line 3
    const-string v1, "[0-9]+"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lhe1;->α:Lym1;

    .line 9
    .line 10
    const-string v0, "other_uid"

    .line 11
    .line 12
    const-string v1, "group_id"

    .line 13
    .line 14
    const-string v2, "conversation_short_id"

    .line 15
    .line 16
    const-string v3, "conversation_id"

    .line 17
    .line 18
    const-string v4, "to_user_id"

    .line 19
    .line 20
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lhe1;->β:Ljava/util/Set;

    .line 29
    .line 30
    return-void
.end method

.method public static α(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    new-instance v1, Leo1;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    move-object v0, v1

    .line 19
    :goto_0
    instance-of v1, v0, Leo1;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move-object p0, v0

    .line 25
    :goto_1
    check-cast p0, Ljava/lang/String;

    .line 26
    .line 27
    return-object p0
.end method

.method public static β(Ljava/util/Map;)Lee1;
    .locals 8

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lb8;

    .line 11
    .line 12
    const/4 v1, 0x5

    .line 13
    invoke-direct {v0, v1}, Lb8;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, p0, v1}, Lb8;->σ(Ljava/util/Map;I)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lee1;

    .line 21
    .line 22
    iget-object p0, v0, Lb8;->α:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v3, p0

    .line 25
    check-cast v3, Ljava/lang/Long;

    .line 26
    .line 27
    iget-object p0, v0, Lb8;->β:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v4, p0

    .line 30
    check-cast v4, Ljava/lang/String;

    .line 31
    .line 32
    iget-object p0, v0, Lb8;->γ:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v5, p0

    .line 35
    check-cast v5, Ljava/lang/Long;

    .line 36
    .line 37
    iget-object p0, v0, Lb8;->δ:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v6, p0

    .line 40
    check-cast v6, Ljava/lang/String;

    .line 41
    .line 42
    iget-object p0, v0, Lb8;->ε:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v7, p0

    .line 45
    check-cast v7, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-direct/range {v2 .. v7}, Lee1;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Set;)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_1
    :goto_0
    new-instance p0, Lee1;

    .line 52
    .line 53
    invoke-direct {p0}, Lee1;-><init>()V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method public static γ(Ljava/lang/String;Ljava/util/ArrayList;)Lde1;
    .locals 13

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Ljz;->ε:Ljz;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance p0, Lde1;

    .line 18
    .line 19
    invoke-direct {p0, v1, v1, v1, v1}, Lde1;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    const/16 v0, 0xa

    .line 24
    .line 25
    invoke-static {p0, v0}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    cmp-long v5, v5, v2

    .line 39
    .line 40
    if-lez v5, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v0, v4

    .line 44
    :goto_0
    invoke-static {p0}, Lhe1;->δ(Ljava/lang/String;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    sget-object v6, Lhe1;->α:Lym1;

    .line 49
    .line 50
    invoke-static {v6, p0}, Lym1;->α(Lym1;Ljava/lang/String;)Lcu;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    new-instance v7, Lf71;

    .line 55
    .line 56
    const/16 v8, 0x17

    .line 57
    .line 58
    invoke-direct {v7, v8}, Lf71;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v6, v7}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-static {v6}, Lus1;->Θ(Lss1;)Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v7

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    :cond_2
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-eqz v10, :cond_4

    .line 89
    .line 90
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    move-object v11, v10

    .line 95
    check-cast v11, Lfe1;

    .line 96
    .line 97
    iget-wide v11, v11, Lfe1;->α:J

    .line 98
    .line 99
    cmp-long v11, v11, v7

    .line 100
    .line 101
    if-nez v11, :cond_2

    .line 102
    .line 103
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    move-object v0, v4

    .line 108
    :cond_4
    if-nez v0, :cond_5

    .line 109
    .line 110
    move-object v0, v1

    .line 111
    :cond_5
    new-instance v7, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    :cond_6
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-eqz v9, :cond_8

    .line 125
    .line 126
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    move-object v10, v9

    .line 131
    check-cast v10, Lfe1;

    .line 132
    .line 133
    iget-object v10, v10, Lfe1;->β:Ljava/lang/String;

    .line 134
    .line 135
    if-eqz v10, :cond_7

    .line 136
    .line 137
    invoke-static {v10}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    goto :goto_3

    .line 146
    :cond_7
    move-object v10, v4

    .line 147
    :goto_3
    invoke-static {v10, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v10

    .line 151
    if-eqz v10, :cond_6

    .line 152
    .line 153
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_8
    if-eqz v5, :cond_b

    .line 158
    .line 159
    new-instance p0, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    :cond_9
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    if-eqz v9, :cond_c

    .line 173
    .line 174
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    move-object v10, v9

    .line 179
    check-cast v10, Lfe1;

    .line 180
    .line 181
    iget-object v10, v10, Lfe1;->β:Ljava/lang/String;

    .line 182
    .line 183
    if-eqz v10, :cond_a

    .line 184
    .line 185
    invoke-static {v10}, Lhe1;->δ(Ljava/lang/String;)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    goto :goto_5

    .line 190
    :cond_a
    move-object v10, v4

    .line 191
    :goto_5
    invoke-static {v10, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    if-eqz v10, :cond_9

    .line 196
    .line 197
    invoke-virtual {p0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_b
    move-object p0, v4

    .line 202
    :cond_c
    if-nez p0, :cond_d

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_d
    move-object v1, p0

    .line 206
    :goto_6
    new-instance p0, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    :cond_e
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-eqz v5, :cond_10

    .line 220
    .line 221
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    move-object v8, v5

    .line 226
    check-cast v8, Lfe1;

    .line 227
    .line 228
    iget-object v8, v8, Lfe1;->γ:Ljava/lang/Long;

    .line 229
    .line 230
    if-eqz v8, :cond_e

    .line 231
    .line 232
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 233
    .line 234
    .line 235
    move-result-wide v9

    .line 236
    cmp-long v9, v9, v2

    .line 237
    .line 238
    if-lez v9, :cond_f

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_f
    move-object v8, v4

    .line 242
    :goto_8
    if-eqz v8, :cond_e

    .line 243
    .line 244
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 245
    .line 246
    .line 247
    move-result-wide v8

    .line 248
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    const/4 v9, 0x1

    .line 257
    if-ne v8, v9, :cond_e

    .line 258
    .line 259
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_10
    new-instance p1, Lde1;

    .line 264
    .line 265
    invoke-direct {p1, v0, v7, v1, p0}, Lde1;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 266
    .line 267
    .line 268
    return-object p1
.end method

.method public static δ(Ljava/lang/String;)Ljava/util/List;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/16 v2, 0x3a

    .line 6
    .line 7
    aput-char v2, v0, v1

    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    invoke-static {p0, v0, v1, v2}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x4

    .line 19
    const/4 v2, 0x0

    .line 20
    if-ge v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    invoke-static {p0, v0}, Lxh;->Г(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v3}, Lx02;->Σ(Ljava/lang/String;)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    const-wide/16 v6, 0x0

    .line 68
    .line 69
    cmp-long v4, v4, v6

    .line 70
    .line 71
    if-lez v4, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move-object v3, v2

    .line 75
    :goto_1
    if-eqz v3, :cond_1

    .line 76
    .line 77
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-lt p0, v0, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move-object v1, v2

    .line 89
    :goto_2
    if-eqz v1, :cond_5

    .line 90
    .line 91
    invoke-static {v1}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_5
    :goto_3
    return-object v2
.end method

.method public static ε(Lee1;Ljava/util/ArrayList;)Lge1;
    .locals 12

    .line 1
    iget-object v0, p0, Lee1;->γ:Ljava/lang/Long;

    .line 2
    .line 3
    iget-object v1, p0, Lee1;->β:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lee1;->α:Ljava/lang/Long;

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v2, :cond_7

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v6

    .line 16
    cmp-long v6, v6, v3

    .line 17
    .line 18
    if-lez v6, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v5

    .line 22
    :goto_0
    if-eqz v2, :cond_7

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide v7

    .line 28
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    move-object v2, p1

    .line 43
    check-cast v2, Lfe1;

    .line 44
    .line 45
    iget-wide v2, v2, Lfe1;->α:J

    .line 46
    .line 47
    cmp-long v2, v2, v7

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    move-object v5, p1

    .line 52
    :cond_2
    check-cast v5, Lfe1;

    .line 53
    .line 54
    new-instance v6, Lge1;

    .line 55
    .line 56
    if-eqz v5, :cond_4

    .line 57
    .line 58
    iget-object p0, v5, Lfe1;->β:Ljava/lang/String;

    .line 59
    .line 60
    if-nez p0, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move-object v9, p0

    .line 64
    goto :goto_2

    .line 65
    :cond_4
    :goto_1
    move-object v9, v1

    .line 66
    :goto_2
    if-eqz v5, :cond_6

    .line 67
    .line 68
    iget-object p0, v5, Lfe1;->γ:Ljava/lang/Long;

    .line 69
    .line 70
    if-nez p0, :cond_5

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_5
    move-object v10, p0

    .line 74
    goto :goto_4

    .line 75
    :cond_6
    :goto_3
    move-object v10, v0

    .line 76
    :goto_4
    const-string v11, "conversation_short_id"

    .line 77
    .line 78
    invoke-direct/range {v6 .. v11}, Lge1;-><init>(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v6

    .line 82
    :cond_7
    if-eqz v1, :cond_b

    .line 83
    .line 84
    invoke-static {v1, p1}, Lhe1;->γ(Ljava/lang/String;Ljava/util/ArrayList;)Lde1;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v2, v1, Lde1;->β:Ljava/util/List;

    .line 89
    .line 90
    invoke-static {v2}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Lfe1;

    .line 95
    .line 96
    if-eqz v2, :cond_8

    .line 97
    .line 98
    const-string p0, "conversation_id"

    .line 99
    .line 100
    invoke-static {v2, p0}, Lhe1;->ζ(Lfe1;Ljava/lang/String;)Lge1;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :cond_8
    iget-object v2, v1, Lde1;->α:Ljava/util/List;

    .line 106
    .line 107
    invoke-static {v2}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Lfe1;

    .line 112
    .line 113
    if-eqz v2, :cond_9

    .line 114
    .line 115
    const-string p0, "conversation_id_short_id"

    .line 116
    .line 117
    invoke-static {v2, p0}, Lhe1;->ζ(Lfe1;Ljava/lang/String;)Lge1;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :cond_9
    iget-object v2, v1, Lde1;->γ:Ljava/util/List;

    .line 123
    .line 124
    invoke-static {v2}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, Lfe1;

    .line 129
    .line 130
    if-eqz v2, :cond_a

    .line 131
    .line 132
    const-string p0, "conversation_id_participants"

    .line 133
    .line 134
    invoke-static {v2, p0}, Lhe1;->ζ(Lfe1;Ljava/lang/String;)Lge1;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :cond_a
    iget-object v1, v1, Lde1;->δ:Ljava/util/List;

    .line 140
    .line 141
    invoke-static {v1}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, Lfe1;

    .line 146
    .line 147
    if-eqz v1, :cond_b

    .line 148
    .line 149
    const-string p0, "conversation_id_other_uid"

    .line 150
    .line 151
    invoke-static {v1, p0}, Lhe1;->ζ(Lfe1;Ljava/lang/String;)Lge1;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    return-object p0

    .line 156
    :cond_b
    iget-object p0, p0, Lee1;->δ:Ljava/lang/String;

    .line 157
    .line 158
    if-eqz p0, :cond_10

    .line 159
    .line 160
    new-instance v1, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    :cond_c
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_f

    .line 174
    .line 175
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    move-object v7, v6

    .line 180
    check-cast v7, Lfe1;

    .line 181
    .line 182
    iget-object v8, v7, Lfe1;->β:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v8, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-nez v8, :cond_e

    .line 189
    .line 190
    iget-wide v7, v7, Lfe1;->α:J

    .line 191
    .line 192
    const/16 v9, 0xa

    .line 193
    .line 194
    invoke-static {p0, v9}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    if-nez v9, :cond_d

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_d
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 202
    .line 203
    .line 204
    move-result-wide v9

    .line 205
    cmp-long v7, v7, v9

    .line 206
    .line 207
    if-nez v7, :cond_c

    .line 208
    .line 209
    :cond_e
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_f
    invoke-static {v1}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    check-cast p0, Lfe1;

    .line 218
    .line 219
    if-eqz p0, :cond_10

    .line 220
    .line 221
    const-string p1, "group_id"

    .line 222
    .line 223
    invoke-static {p0, p1}, Lhe1;->ζ(Lfe1;Ljava/lang/String;)Lge1;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0

    .line 228
    :cond_10
    if-eqz v0, :cond_15

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 231
    .line 232
    .line 233
    move-result-wide v1

    .line 234
    cmp-long p0, v1, v3

    .line 235
    .line 236
    if-lez p0, :cond_11

    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_11
    move-object v0, v5

    .line 240
    :goto_6
    if-eqz v0, :cond_15

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 243
    .line 244
    .line 245
    move-result-wide v0

    .line 246
    new-instance p0, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    :cond_12
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_14

    .line 260
    .line 261
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    move-object v3, v2

    .line 266
    check-cast v3, Lfe1;

    .line 267
    .line 268
    iget-object v3, v3, Lfe1;->γ:Ljava/lang/Long;

    .line 269
    .line 270
    if-nez v3, :cond_13

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_13
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 274
    .line 275
    .line 276
    move-result-wide v3

    .line 277
    cmp-long v3, v3, v0

    .line 278
    .line 279
    if-nez v3, :cond_12

    .line 280
    .line 281
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_14
    invoke-static {p0}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    check-cast p0, Lfe1;

    .line 290
    .line 291
    if-eqz p0, :cond_15

    .line 292
    .line 293
    const-string p1, "other_uid"

    .line 294
    .line 295
    invoke-static {p0, p1}, Lhe1;->ζ(Lfe1;Ljava/lang/String;)Lge1;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    return-object p0

    .line 300
    :cond_15
    return-object v5
.end method

.method public static ζ(Lfe1;Ljava/lang/String;)Lge1;
    .locals 6

    .line 1
    new-instance v0, Lge1;

    .line 2
    .line 3
    iget-wide v1, p0, Lfe1;->α:J

    .line 4
    .line 5
    iget-object v3, p0, Lfe1;->β:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, p0, Lfe1;->γ:Ljava/lang/Long;

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lge1;-><init>(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
