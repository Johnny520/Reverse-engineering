.class public final Lhb/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static volatile a:Lhb/l;

.field public static volatile b:Lhb/l;

.field public static final c:Ljava/util/concurrent/atomic/AtomicBoolean;


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
    sput-object v0, Lhb/m;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Z)Ljava/util/List;
    .locals 4

    .line 1
    sget-object v0, Lhb/m;->a:Lhb/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lhb/l;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_7

    .line 17
    .line 18
    iget-object p0, v0, Lhb/l;->a:Ljava/util/List;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    if-eqz v0, :cond_5

    .line 22
    .line 23
    iget-object p0, v0, Lhb/l;->a:Ljava/util/List;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    move-object v2, v1

    .line 45
    check-cast v2, Lwb/jv;

    .line 46
    .line 47
    iget-boolean v3, v2, Lwb/jv;->c:Z

    .line 48
    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    iget-boolean v2, v2, Lwb/jv;->g:Z

    .line 52
    .line 53
    if-nez v2, :cond_3

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    const/4 v2, 0x0

    .line 58
    :goto_2
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    return-object v0

    .line 65
    :cond_5
    sget-object p0, Lhb/m;->b:Lhb/l;

    .line 66
    .line 67
    if-eqz p0, :cond_7

    .line 68
    .line 69
    invoke-virtual {p0}, Lhb/l;->a()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_6
    move-object p0, v1

    .line 77
    :goto_3
    if-eqz p0, :cond_7

    .line 78
    .line 79
    iget-object p0, p0, Lhb/l;->a:Ljava/util/List;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_7
    return-object v1
.end method

.method public static b()Lc9/a0;
    .locals 7

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

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
    invoke-virtual {v0}, Lh8/a;->c()Ljava/util/ArrayList;

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
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 17
    .line 18
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v3, 0x0

    .line 32
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    add-int/lit8 v5, v3, 0x1

    .line 43
    .line 44
    if-ltz v3, :cond_2

    .line 45
    .line 46
    check-cast v4, Ll8/b;

    .line 47
    .line 48
    iget-object v4, v4, Ll8/b;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v6, Lsf/e;

    .line 55
    .line 56
    invoke-direct {v6, v4, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move v3, v5

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    invoke-static {}, La/a;->Q0()V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :cond_3
    invoke-static {v2}, Ltf/y;->e0(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, Lc9/z;

    .line 73
    .line 74
    const/4 v2, 0x1

    .line 75
    invoke-direct {v1, v0, v2}, Lc9/z;-><init>(Ljava/util/Map;I)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Lc9/a0;

    .line 79
    .line 80
    const/16 v2, 0x10

    .line 81
    .line 82
    invoke-direct {v0, v1, v2}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Lc9/a0;

    .line 86
    .line 87
    const/16 v2, 0x11

    .line 88
    .line 89
    invoke-direct {v1, v0, v2}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 90
    .line 91
    .line 92
    new-instance v0, Lc9/a0;

    .line 93
    .line 94
    const/16 v2, 0x12

    .line 95
    .line 96
    invoke-direct {v0, v1, v2}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method

.method public static c(Z)Ljava/util/List;
    .locals 9

    .line 1
    invoke-static {p0}, Lhb/m;->a(Z)Ljava/util/List;

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
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 9
    .line 10
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_16

    .line 15
    .line 16
    invoke-virtual {v1}, Lg8/i;->G()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    goto/16 :goto_8

    .line 23
    .line 24
    :cond_1
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-virtual {v1}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v3

    .line 35
    new-instance v4, Lsf/f;

    .line 36
    .line 37
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object v3, v4

    .line 41
    :goto_0
    nop

    .line 42
    instance-of v4, v3, Lsf/f;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    move-object v3, v0

    .line 47
    :cond_2
    check-cast v3, Ljava/lang/Iterable;

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_8

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 64
    .line 65
    iget-object v5, v4, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_4

    .line 72
    .line 73
    iget-object v5, v4, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 74
    .line 75
    :cond_4
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    iget-object v4, v4, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    :cond_6
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_3

    .line 93
    .line 94
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    check-cast v6, Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-nez v7, :cond_6

    .line 105
    .line 106
    invoke-virtual {v2, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    if-nez v7, :cond_7

    .line 111
    .line 112
    new-instance v7, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :cond_7
    check-cast v7, Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_8
    const/4 v3, 0x0

    .line 127
    if-eqz p0, :cond_c

    .line 128
    .line 129
    invoke-virtual {v1}, Lg8/i;->y()Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    new-instance v4, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    :cond_9
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_b

    .line 147
    .line 148
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 153
    .line 154
    iget-object v6, v5, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v2, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, Ljava/util/List;

    .line 161
    .line 162
    if-nez v6, :cond_a

    .line 163
    .line 164
    move-object v6, v0

    .line 165
    :cond_a
    invoke-static {v5, v3, v6, v3}, Lhb/m;->d(Lh/Hchat/hooks/api/model/WeChatContact;ZLjava/util/List;Z)Lwb/jv;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    if-eqz v5, :cond_9

    .line 170
    .line 171
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_b
    invoke-static {}, Lhb/m;->b()Lc9/a0;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v4, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    goto/16 :goto_8

    .line 184
    .line 185
    :cond_c
    new-instance v4, Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Lg8/i;->y()Ljava/util/ArrayList;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    new-instance v6, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    :cond_d
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-eqz v7, :cond_f

    .line 208
    .line 209
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    check-cast v7, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 214
    .line 215
    iget-object v8, v7, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v2, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    check-cast v8, Ljava/util/List;

    .line 222
    .line 223
    if-nez v8, :cond_e

    .line 224
    .line 225
    move-object v8, v0

    .line 226
    :cond_e
    invoke-static {v7, v3, v8, v3}, Lhb/m;->d(Lh/Hchat/hooks/api/model/WeChatContact;ZLjava/util/List;Z)Lwb/jv;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    if-eqz v7, :cond_d

    .line 231
    .line 232
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_f
    invoke-static {v4, v6}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 237
    .line 238
    .line 239
    const-string v2, "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE \'gh\\_%\' ESCAPE \'\\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)"

    .line 240
    .line 241
    const/4 v5, 0x0

    .line 242
    invoke-virtual {v1, v2, v5}, Lg8/i;->U(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    new-instance v5, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    :cond_10
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    const/4 v7, 0x1

    .line 260
    if-eqz v6, :cond_11

    .line 261
    .line 262
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    check-cast v6, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 267
    .line 268
    invoke-static {v6, v3, v0, v7}, Lhb/m;->d(Lh/Hchat/hooks/api/model/WeChatContact;ZLjava/util/List;Z)Lwb/jv;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    if-eqz v6, :cond_10

    .line 273
    .line 274
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_11
    invoke-static {v4, v5}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1}, Lg8/i;->x()Ljava/util/ArrayList;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    new-instance v2, Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    :cond_12
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    if-eqz v5, :cond_13

    .line 299
    .line 300
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    check-cast v5, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 305
    .line 306
    invoke-static {v5, v7, v0, v3}, Lhb/m;->d(Lh/Hchat/hooks/api/model/WeChatContact;ZLjava/util/List;Z)Lwb/jv;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    if-eqz v5, :cond_12

    .line 311
    .line 312
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_13
    invoke-static {v4, v2}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 317
    .line 318
    .line 319
    new-instance v0, Ljava/util/HashSet;

    .line 320
    .line 321
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 322
    .line 323
    .line 324
    new-instance v1, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    :cond_14
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-eqz v3, :cond_15

    .line 338
    .line 339
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    move-object v4, v3

    .line 344
    check-cast v4, Lwb/jv;

    .line 345
    .line 346
    iget-object v4, v4, Lwb/jv;->a:Ljava/lang/String;

    .line 347
    .line 348
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    if-eqz v4, :cond_14

    .line 353
    .line 354
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_7

    .line 358
    :cond_15
    invoke-static {}, Lhb/m;->b()Lc9/a0;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {v1, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    :cond_16
    :goto_8
    new-instance v1, Lhb/l;

    .line 367
    .line 368
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 369
    .line 370
    .line 371
    move-result-wide v2

    .line 372
    invoke-direct {v1, v0, v2, v3}, Lhb/l;-><init>(Ljava/util/List;J)V

    .line 373
    .line 374
    .line 375
    if-eqz p0, :cond_17

    .line 376
    .line 377
    sput-object v1, Lhb/m;->b:Lhb/l;

    .line 378
    .line 379
    goto :goto_a

    .line 380
    :cond_17
    sput-object v1, Lhb/m;->a:Lhb/l;

    .line 381
    .line 382
    new-instance p0, Ljava/util/ArrayList;

    .line 383
    .line 384
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 385
    .line 386
    .line 387
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    :cond_18
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    if-eqz v3, :cond_19

    .line 396
    .line 397
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    move-object v4, v3

    .line 402
    check-cast v4, Lwb/jv;

    .line 403
    .line 404
    iget-boolean v5, v4, Lwb/jv;->c:Z

    .line 405
    .line 406
    if-nez v5, :cond_18

    .line 407
    .line 408
    iget-boolean v4, v4, Lwb/jv;->g:Z

    .line 409
    .line 410
    if-nez v4, :cond_18

    .line 411
    .line 412
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_19
    iget-wide v1, v1, Lhb/l;->b:J

    .line 417
    .line 418
    new-instance v3, Lhb/l;

    .line 419
    .line 420
    invoke-direct {v3, p0, v1, v2}, Lhb/l;-><init>(Ljava/util/List;J)V

    .line 421
    .line 422
    .line 423
    sput-object v3, Lhb/m;->b:Lhb/l;

    .line 424
    .line 425
    :goto_a
    return-object v0
.end method

.method public static d(Lh/Hchat/hooks/api/model/WeChatContact;ZLjava/util/List;Z)Lwb/jv;
    .locals 10

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

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
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p0, p1}, Lr9/e0;->Z(Lh/Hchat/hooks/api/model/WeChatContact;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v5, p0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v6, p0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    iget-object p2, p0, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 33
    .line 34
    iget-object p0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 35
    .line 36
    filled-new-array {p2, v0, p0}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    new-instance p2, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move-object v1, v0

    .line 64
    check-cast v1, Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-static {p2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    new-instance v1, Lwb/jv;

    .line 85
    .line 86
    move v4, p1

    .line 87
    move v8, p3

    .line 88
    invoke-direct/range {v1 .. v9}, Lwb/jv;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;)V

    .line 89
    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 93
    return-object p0
.end method
