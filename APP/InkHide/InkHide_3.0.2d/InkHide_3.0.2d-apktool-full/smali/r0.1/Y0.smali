.class public final Lr0/Y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# static fields
.field public static final o:[Ljava/lang/String;

.field public static final p:[Ljava/lang/String;

.field public static final q:Ljava/util/Set;

.field public static final r:[Ljava/lang/String;

.field public static final s:[Ljava/lang/String;

.field public static final t:Ljava/util/Set;

.field public static final u:[Ljava/lang/String;

.field public static final v:Ljava/util/Set;

.field public static final w:[LU0/g;

.field public static final x:[LU0/g;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public final h:Ljava/util/Map;

.field public final i:Ljava/util/Map;

.field public final j:Lr0/O0;

.field public volatile k:Ljava/lang/Object;

.field public volatile l:Z

.field public volatile m:Z

.field public volatile n:LA0/W;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const-string v0, "com.tencent.mm.plugin.sns.ui.jo"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lr0/Y0;->o:[Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"

    .line 10
    .line 11
    const-string v1, "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"

    .line 12
    .line 13
    const-string v2, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"

    .line 14
    .line 15
    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, LF0/w;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    const-string v0, "login_weixin_username"

    .line 23
    .line 24
    const-string v1, "last_login_alias"

    .line 25
    .line 26
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lr0/Y0;->p:[Ljava/lang/String;

    .line 31
    .line 32
    const-string v0, "notifyItemRangeInserted"

    .line 33
    .line 34
    const-string v1, "notifyDataSetChanged"

    .line 35
    .line 36
    const-string v2, "notifyItemInserted"

    .line 37
    .line 38
    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lr0/Y0;->q:Ljava/util/Set;

    .line 47
    .line 48
    const-string v3, "userName"

    .line 49
    .line 50
    const-string v4, "username"

    .line 51
    .line 52
    const-string v1, "Username"

    .line 53
    .line 54
    const-string v2, "UserName"

    .line 55
    .line 56
    const-string v5, "field_userName"

    .line 57
    .line 58
    const-string v6, "field_username"

    .line 59
    .line 60
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, Lr0/Y0;->r:[Ljava/lang/String;

    .line 65
    .line 66
    const-string v3, "field_createTime"

    .line 67
    .line 68
    const-string v4, "field_content"

    .line 69
    .line 70
    const-string v1, "field_userName"

    .line 71
    .line 72
    const-string v2, "field_snsId"

    .line 73
    .line 74
    const-string v5, "LikeUserList"

    .line 75
    .line 76
    const-string v6, "CommentUserList"

    .line 77
    .line 78
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sput-object v0, Lr0/Y0;->s:[Ljava/lang/String;

    .line 83
    .line 84
    const-string v7, "\u8bbe\u4e3a\u79c1\u5bc6"

    .line 85
    .line 86
    const-string v8, "\u8bbe\u4e3a\u516c\u5f00"

    .line 87
    .line 88
    const-string v1, "\u8d5e"

    .line 89
    .line 90
    const-string v2, "\u8bc4\u8bba"

    .line 91
    .line 92
    const-string v3, "\u5220\u9664"

    .line 93
    .line 94
    const-string v4, "\u8be6\u60c5"

    .line 95
    .line 96
    const-string v5, "\u5168\u6587"

    .line 97
    .line 98
    const-string v6, "\u6536\u8d77"

    .line 99
    .line 100
    const-string v9, "\u53d6\u6d88"

    .line 101
    .line 102
    const-string v10, "\u786e\u5b9a"

    .line 103
    .line 104
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sput-object v0, Lr0/Y0;->t:Ljava/util/Set;

    .line 113
    .line 114
    const-string v0, "desc"

    .line 115
    .line 116
    const-string v1, "text"

    .line 117
    .line 118
    const-string v2, "content"

    .line 119
    .line 120
    const-string v3, "title"

    .line 121
    .line 122
    const-string v4, "summary"

    .line 123
    .line 124
    filled-new-array {v2, v0, v1, v3, v4}, [Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sput-object v0, Lr0/Y0;->u:[Ljava/lang/String;

    .line 129
    .line 130
    const-string v0, "\u521a\u521a"

    .line 131
    .line 132
    const-string v1, "\u4eca\u5929"

    .line 133
    .line 134
    const-string v2, "\u6628\u5929"

    .line 135
    .line 136
    const-string v3, "\u524d\u5929"

    .line 137
    .line 138
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sput-object v0, Lr0/Y0;->v:Ljava/util/Set;

    .line 147
    .line 148
    new-instance v1, LU0/g;

    .line 149
    .line 150
    const-string v0, "\\d+\\s*\u79d2\u524d"

    .line 151
    .line 152
    invoke-direct {v1, v0}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    new-instance v2, LU0/g;

    .line 156
    .line 157
    const-string v0, "\\d+\\s*\u5206\u949f\u524d"

    .line 158
    .line 159
    invoke-direct {v2, v0}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    new-instance v3, LU0/g;

    .line 163
    .line 164
    const-string v0, "\\d+\\s*\u5c0f\u65f6\u524d"

    .line 165
    .line 166
    invoke-direct {v3, v0}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    new-instance v4, LU0/g;

    .line 170
    .line 171
    const-string v0, "\\d+\\s*\u5929\u524d"

    .line 172
    .line 173
    invoke-direct {v4, v0}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    new-instance v5, LU0/g;

    .line 177
    .line 178
    const-string v0, "\\d{1,2}:\\d{2}"

    .line 179
    .line 180
    invoke-direct {v5, v0}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    new-instance v6, LU0/g;

    .line 184
    .line 185
    const-string v0, "\\d{1,2}\u6708\\d{1,2}\u65e5"

    .line 186
    .line 187
    invoke-direct {v6, v0}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v7, LU0/g;

    .line 191
    .line 192
    const-string v0, "\\d{4}\u5e74\\d{1,2}\u6708\\d{1,2}\u65e5"

    .line 193
    .line 194
    invoke-direct {v7, v0}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    new-instance v8, LU0/g;

    .line 198
    .line 199
    const-string v0, "\\d{4}-\\d{1,2}-\\d{1,2}"

    .line 200
    .line 201
    invoke-direct {v8, v0}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    filled-new-array/range {v1 .. v8}, [LU0/g;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    sput-object v0, Lr0/Y0;->w:[LU0/g;

    .line 209
    .line 210
    new-instance v0, LU0/g;

    .line 211
    .line 212
    const-string v1, "\\d+"

    .line 213
    .line 214
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    new-instance v1, LU0/g;

    .line 218
    .line 219
    const-string v2, "[0-9a-fA-F]{8,}"

    .line 220
    .line 221
    invoke-direct {v1, v2}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    new-instance v2, LU0/g;

    .line 225
    .line 226
    const-string v3, "sns:\\d+"

    .line 227
    .line 228
    invoke-direct {v2, v3}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    new-instance v3, LU0/g;

    .line 232
    .line 233
    const-string v4, "local:\\d+"

    .line 234
    .line 235
    invoke-direct {v3, v4}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    new-instance v4, LU0/g;

    .line 239
    .line 240
    const-string v5, "localStr:.+"

    .line 241
    .line 242
    invoke-direct {v4, v5}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    filled-new-array {v0, v1, v2, v3, v4}, [LU0/g;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    sput-object v0, Lr0/Y0;->x:[LU0/g;

    .line 250
    .line 251
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr0/Y0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr0/Y0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lr0/Y0;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lr0/Y0;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lr0/Y0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lr0/Y0;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lr0/Y0;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    .line 53
    new-instance v0, Ljava/util/WeakHashMap;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    new-instance v0, Ljava/util/WeakHashMap;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 67
    .line 68
    .line 69
    new-instance v0, Ljava/util/WeakHashMap;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, Lr0/Y0;->h:Ljava/util/Map;

    .line 79
    .line 80
    new-instance v0, Ljava/util/WeakHashMap;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, Lr0/Y0;->i:Ljava/util/Map;

    .line 90
    .line 91
    new-instance v0, Lr0/O0;

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    invoke-direct {v0, v1, p0}, Lr0/O0;-><init>(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, Lr0/Y0;->j:Lr0/O0;

    .line 98
    .line 99
    return-void
.end method

.method public static D(Ljava/lang/String;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_8

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x12c

    .line 16
    .line 17
    if-le v0, v1, :cond_1

    .line 18
    .line 19
    goto/16 :goto_8

    .line 20
    .line 21
    :cond_1
    sget-object v0, Lr0/Y0;->t:Ljava/util/Set;

    .line 22
    .line 23
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    goto/16 :goto_8

    .line 30
    .line 31
    :cond_2
    sget-object v0, Lr0/Y0;->x:[LU0/g;

    .line 32
    .line 33
    array-length v1, v0

    .line 34
    move v3, v2

    .line 35
    :goto_0
    if-ge v3, v1, :cond_4

    .line 36
    .line 37
    aget-object v4, v0, v3

    .line 38
    .line 39
    invoke-virtual {v4, p0}, LU0/g;->d(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    move v0, v2

    .line 51
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ge v0, v1, :cond_6

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    const/16 v3, 0x4e00

    .line 62
    .line 63
    if-gt v3, v1, :cond_5

    .line 64
    .line 65
    const v3, 0xa000

    .line 66
    .line 67
    .line 68
    if-ge v1, v3, :cond_5

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_6
    move v0, v2

    .line 75
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-ge v0, v1, :cond_8

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v1}, Ljava/lang/Character;->isLetter(C)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_7

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_8
    move v0, v2

    .line 96
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-ge v0, v1, :cond_d

    .line 101
    .line 102
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const-string v3, "\uff0c\u3002\uff01\uff1f\u3001,.!?"

    .line 107
    .line 108
    invoke-static {v3, v1}, LU0/i;->j0(Ljava/lang/String;C)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_c

    .line 113
    .line 114
    :goto_4
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    sget-object v0, Lr0/Y0;->v:Ljava/util/Set;

    .line 123
    .line 124
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    const/4 v1, 0x1

    .line 129
    if-eqz v0, :cond_9

    .line 130
    .line 131
    :goto_5
    move v2, v1

    .line 132
    goto :goto_7

    .line 133
    :cond_9
    sget-object v0, Lr0/Y0;->w:[LU0/g;

    .line 134
    .line 135
    array-length v3, v0

    .line 136
    move v4, v2

    .line 137
    :goto_6
    if-ge v4, v3, :cond_b

    .line 138
    .line 139
    aget-object v5, v0, v4

    .line 140
    .line 141
    invoke-virtual {v5, p0}, LU0/g;->d(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_a

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_b
    :goto_7
    xor-int/lit8 p0, v2, 0x1

    .line 152
    .line 153
    return p0

    .line 154
    :cond_c
    add-int/lit8 v0, v0, 0x1

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_d
    :goto_8
    return v2
.end method

.method public static E(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.tencent.mm.plugin.sns.ui.improve.component.g2"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    if-eqz p0, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    :goto_1
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public static F(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "\\s+"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "compile(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "input"

    .line 13
    .line 14
    invoke-static {p0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, " "

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "replaceAll(...)"

    .line 28
    .line 29
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const/16 v0, 0xa0

    .line 41
    .line 42
    invoke-static {v0, p0}, LU0/i;->B0(ILjava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static H(Ljava/util/LinkedHashSet;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1}, Lr0/Y0;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    move-object v2, v1

    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v2}, Lr0/Y0;->D(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    const/4 p0, 0x0

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_4

    .line 87
    .line 88
    :goto_2
    move-object p0, v0

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    move-object v1, v0

    .line 91
    check-cast v1, Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v1}, Lr0/Y0;->L(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    move-object v3, v2

    .line 102
    check-cast v3, Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v3}, Lr0/Y0;->L(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-ge v1, v3, :cond_6

    .line 109
    .line 110
    move-object v0, v2

    .line 111
    move v1, v3

    .line 112
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :goto_3
    check-cast p0, Ljava/lang/String;

    .line 120
    .line 121
    if-nez p0, :cond_7

    .line 122
    .line 123
    const-string p0, ""

    .line 124
    .line 125
    :cond_7
    return-object p0
.end method

.method public static K(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const-string v1, "UserName"

    .line 15
    .line 16
    invoke-static {p2, v1}, Lr0/Y0;->n(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    return-object p2

    .line 26
    :cond_0
    const/4 p2, 0x0

    .line 27
    sget-object v1, Lr0/Y0;->r:[Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    array-length p1, v1

    .line 38
    move v2, p2

    .line 39
    :goto_0
    if-ge v2, p1, :cond_2

    .line 40
    .line 41
    aget-object v3, v1, v2

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v4, v3}, Lr0/Y0;->n(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v3, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 54
    .line 55
    .line 56
    return-object v3

    .line 57
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    sget-object p1, Lr0/Y0;->s:[Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {p0, p1}, Lr0/Y0;->w(Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    const-string p1, "com.tencent.mm.plugin.sns."

    .line 69
    .line 70
    invoke-static {p0, p1, p2}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    :cond_3
    array-length p1, v1

    .line 77
    :goto_1
    if-ge p2, p1, :cond_5

    .line 78
    .line 79
    aget-object v2, v1, p2

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-static {v3, v2}, Lr0/Y0;->n(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 92
    .line 93
    .line 94
    return-object v2

    .line 95
    :cond_4
    add-int/lit8 p2, p2, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    const/4 p0, 0x0

    .line 99
    return-object p0
.end method

.method public static L(Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    if-ge v1, v3, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/16 v4, 0x7f

    .line 15
    .line 16
    if-le v3, v4, :cond_0

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v1, v0

    .line 24
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-ge v0, v3, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const-string v4, "\uff0c\u3002\uff01\uff1f\u3001,.!?"

    .line 35
    .line 36
    invoke-static {v4, v3}, LU0/i;->j0(Ljava/lang/String;C)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    mul-int/lit8 v2, v2, 0x2

    .line 52
    .line 53
    add-int/2addr v2, p0

    .line 54
    mul-int/lit8 v1, v1, 0x3

    .line 55
    .line 56
    add-int/2addr v1, v2

    .line 57
    return v1
.end method

.method public static N(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x2f

    .line 6
    .line 7
    const/16 v2, 0x2e

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0, v2, v1}, LU0/q;->f0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const-string p0, "V"

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const-string p0, "Z"

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_2
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    const-string p0, "B"

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_3
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    const-string p0, "C"

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_4
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    const-string p0, "S"

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_5
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    const-string p0, "I"

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_6
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    const-string p0, "J"

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_7
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_8

    .line 104
    .line 105
    const-string p0, "F"

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_8
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_9

    .line 115
    .line 116
    const-string p0, "D"

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0, v2, v1}, LU0/q;->f0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    const-string v0, "L"

    .line 128
    .line 129
    const-string v1, ";"

    .line 130
    .line 131
    invoke-static {v0, p0, v1}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0
.end method

.method public static final a(Lr0/Y0;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Class;Ljava/lang/Class;)Lr0/P0;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v7, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 7
    .line 8
    const-string v8, "args"

    .line 9
    .line 10
    invoke-static {v0, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, LF0/h;->a0([Ljava/lang/Object;)LT0/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lr0/P;

    .line 18
    .line 19
    const/16 v2, 0x17

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lr0/P;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v2, LK0/h;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, LK0/h;-><init>(LT0/h;LM0/l;)V

    .line 27
    .line 28
    .line 29
    sget-object v9, LT0/k;->c:LT0/k;

    .line 30
    .line 31
    new-instance v10, LT0/f;

    .line 32
    .line 33
    const/4 v11, 0x0

    .line 34
    invoke-direct {v10, v2, v11, v9}, LT0/f;-><init>(LT0/h;ZLM0/l;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Lr0/X0;

    .line 38
    .line 39
    const-string v4, "findActivity(Landroid/content/Context;)Landroid/app/Activity;"

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const-class v2, Lr0/Y0;

    .line 43
    .line 44
    const-string v3, "findActivity"

    .line 45
    .line 46
    move-object v1, p0

    .line 47
    invoke-direct/range {v0 .. v5}, LN0/f;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    new-instance v2, LK0/h;

    .line 51
    .line 52
    invoke-direct {v2, v10, v0}, LK0/h;-><init>(LT0/h;LM0/l;)V

    .line 53
    .line 54
    .line 55
    new-instance v0, LT0/f;

    .line 56
    .line 57
    invoke-direct {v0, v2, v11, v9}, LT0/f;-><init>(LT0/h;ZLM0/l;)V

    .line 58
    .line 59
    .line 60
    new-instance v2, LT0/e;

    .line 61
    .line 62
    invoke-direct {v2, v0}, LT0/e;-><init>(LT0/f;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, LT0/e;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v3, 0x0

    .line 70
    if-nez v0, :cond_0

    .line 71
    .line 72
    move-object v0, v3

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-virtual {v2}, LT0/e;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_0
    check-cast v0, Landroid/app/Activity;

    .line 79
    .line 80
    if-nez v0, :cond_1

    .line 81
    .line 82
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v7, v11, v0}, Lr0/Y0;->m(Ljava/lang/Object;ILjava/util/Set;)Landroid/app/Activity;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    move-object v2, v0

    .line 102
    invoke-virtual {p0, v2}, Lr0/Y0;->C(Landroid/app/Activity;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_2

    .line 107
    .line 108
    :goto_1
    return-object v3

    .line 109
    :cond_2
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    goto :goto_2

    .line 120
    :cond_3
    move-object v0, v3

    .line 121
    :goto_2
    invoke-static {v0}, Lr0/Y0;->p(Landroid/view/View;)Landroid/widget/ListView;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-eqz v0, :cond_4

    .line 126
    .line 127
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    goto :goto_3

    .line 132
    :cond_4
    move-object v4, v3

    .line 133
    :goto_3
    if-eqz v0, :cond_5

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    goto :goto_4

    .line 140
    :cond_5
    move-object v5, v3

    .line 141
    :goto_4
    new-instance v9, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v2, p2}, Lr0/Y0;->I(Landroid/app/Activity;Ljava/lang/Class;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    if-eqz v12, :cond_6

    .line 151
    .line 152
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :cond_6
    if-eqz v7, :cond_7

    .line 156
    .line 157
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    :cond_7
    iget-object v6, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 161
    .line 162
    invoke-static {v6, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    array-length v7, v6

    .line 166
    :goto_5
    if-ge v11, v7, :cond_9

    .line 167
    .line 168
    aget-object v8, v6, v11

    .line 169
    .line 170
    if-eqz v8, :cond_8

    .line 171
    .line 172
    instance-of v12, v8, Landroid/view/ContextMenu;

    .line 173
    .line 174
    if-nez v12, :cond_8

    .line 175
    .line 176
    instance-of v12, v8, Landroid/view/MenuItem;

    .line 177
    .line 178
    if-nez v12, :cond_8

    .line 179
    .line 180
    instance-of v12, v8, Landroid/view/View;

    .line 181
    .line 182
    if-nez v12, :cond_8

    .line 183
    .line 184
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    :cond_8
    add-int/lit8 v11, v11, 0x1

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_9
    if-eqz v5, :cond_b

    .line 191
    .line 192
    :try_start_0
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-interface {v5, v0}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    goto :goto_6

    .line 201
    :catchall_0
    move-exception v0

    .line 202
    new-instance v6, LE0/d;

    .line 203
    .line 204
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    move-object v0, v6

    .line 208
    :goto_6
    nop

    .line 209
    instance-of v6, v0, LE0/d;

    .line 210
    .line 211
    if-eqz v6, :cond_a

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_a
    move-object v3, v0

    .line 215
    :goto_7
    if-eqz v3, :cond_b

    .line 216
    .line 217
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    :cond_b
    move-object v1, p0

    .line 221
    move-object v6, p2

    .line 222
    move-object/from16 v7, p3

    .line 223
    .line 224
    move-object v3, v5

    .line 225
    move-object v5, v9

    .line 226
    invoke-virtual/range {v1 .. v7}, Lr0/Y0;->J(Landroid/app/Activity;Landroid/widget/ListAdapter;Landroid/view/View;Ljava/util/ArrayList;Ljava/lang/Class;Ljava/lang/Class;)Lr0/P0;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-nez v0, :cond_c

    .line 231
    .line 232
    iget-object v0, p0, Lr0/Y0;->i:Ljava/util/Map;

    .line 233
    .line 234
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, Lr0/P0;

    .line 239
    .line 240
    :cond_c
    return-object v0
.end method

.method public static final b(Lr0/Y0;Landroid/app/Activity;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Lr0/Y0;->C(Landroid/app/Activity;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v1, LD0/a;

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    move-object v2, p0

    .line 30
    move-object v3, p1

    .line 31
    move-object v4, p2

    .line 32
    move-object v5, p3

    .line 33
    invoke-direct/range {v1 .. v6}, LD0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void
.end method

.method public static d(Ljava/lang/Object;ILjava/util/LinkedHashSet;)V
    .locals 11

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_5

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x3

    .line 6
    if-gt p1, v0, :cond_b

    .line 7
    .line 8
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x14

    .line 13
    .line 14
    if-lt v0, v1, :cond_1

    .line 15
    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_1
    instance-of v0, p0, Ljava/lang/CharSequence;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lr0/Y0;->D(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_b

    .line 39
    .line 40
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v2, "java."

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-static {v0, v3, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_b

    .line 60
    .line 61
    const-string v2, "android."

    .line 62
    .line 63
    invoke-static {v0, v3, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    goto/16 :goto_5

    .line 70
    .line 71
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v2, "getDeclaredFields(...)"

    .line 80
    .line 81
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    array-length v2, v0

    .line 85
    move v4, v3

    .line 86
    :goto_0
    if-ge v4, v2, :cond_b

    .line 87
    .line 88
    aget-object v5, v0, v4

    .line 89
    .line 90
    const/4 v6, 0x1

    .line 91
    :try_start_0
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    instance-of v8, v7, Ljava/lang/CharSequence;

    .line 99
    .line 100
    if-eqz v8, :cond_8

    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    const-string v7, "getName(...)"

    .line 119
    .line 120
    invoke-static {v5, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v6}, Lr0/Y0;->D(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-nez v7, :cond_4

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_4
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 131
    .line 132
    invoke-virtual {v5, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    const-string v7, "toLowerCase(...)"

    .line 137
    .line 138
    invoke-static {v5, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    sget-object v7, Lr0/Y0;->u:[Ljava/lang/String;

    .line 142
    .line 143
    array-length v8, v7

    .line 144
    move v9, v3

    .line 145
    :goto_1
    if-ge v9, v8, :cond_6

    .line 146
    .line 147
    aget-object v10, v7, v9

    .line 148
    .line 149
    invoke-static {v5, v10, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    if-eqz v10, :cond_5

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_6
    move v5, v3

    .line 160
    :goto_2
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-ge v5, v7, :cond_9

    .line 165
    .line 166
    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    const/16 v8, 0x7f

    .line 171
    .line 172
    if-le v7, v8, :cond_7

    .line 173
    .line 174
    const-string v5, "com.tencent."

    .line 175
    .line 176
    invoke-static {v6, v3, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-nez v5, :cond_9

    .line 181
    .line 182
    :goto_3
    invoke-interface {p2, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_8
    if-eqz v7, :cond_9

    .line 190
    .line 191
    add-int/2addr v6, p1

    .line 192
    invoke-static {v7, v6, p2}, Lr0/Y0;->d(Ljava/lang/Object;ILjava/util/LinkedHashSet;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    .line 194
    .line 195
    :catchall_0
    :cond_9
    :goto_4
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-lt v5, v1, :cond_a

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_b
    :goto_5
    return-void
.end method

.method public static e(ILandroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->isLongClickable()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    instance-of v1, p1, Landroid/widget/TextView;

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    const-string v1, "VideoSightView"

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    const-string v1, "ImageView"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    :cond_0
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    const/4 v0, 0x7

    .line 58
    if-ge p0, v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/16 v1, 0x10

    .line 65
    .line 66
    if-lt v0, v1, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    check-cast p1, Landroid/view/ViewGroup;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    :goto_0
    if-ge v2, v0, :cond_3

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const-string v3, "getChildAt(...)"

    .line 82
    .line 83
    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v3, p0, 0x1

    .line 87
    .line 88
    invoke-static {v3, v1, p2}, Lr0/Y0;->e(ILandroid/view/View;Ljava/util/ArrayList;)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    :goto_1
    return-void
.end method

.method public static f(ILandroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/widget/ListView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/widget/ListView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const/16 v0, 0xc

    .line 22
    .line 23
    if-lt p0, v0, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    check-cast p1, Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    :goto_0
    if-ge v1, v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "getChildAt(...)"

    .line 40
    .line 41
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v3, p0, 0x1

    .line 45
    .line 46
    invoke-static {v3, v2, p2}, Lr0/Y0;->f(ILandroid/view/View;Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    :goto_1
    return-void
.end method

.method public static g(Landroid/view/View;Ljava/util/LinkedHashSet;)V
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v1, v2

    .line 31
    :goto_0
    const-string v3, ""

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    move-object v1, v3

    .line 36
    :cond_1
    invoke-static {v1}, Lr0/Y0;->D(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :cond_3
    if-nez v2, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    move-object v3, v2

    .line 69
    :goto_1
    invoke-static {v3}, Lr0/Y0;->D(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-interface {p1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_5
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 79
    .line 80
    if-eqz v0, :cond_7

    .line 81
    .line 82
    check-cast p0, Landroid/view/ViewGroup;

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    const/4 v1, 0x0

    .line 89
    :goto_2
    if-ge v1, v0, :cond_7

    .line 90
    .line 91
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const-string v3, "getChildAt(...)"

    .line 96
    .line 97
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v2, p1}, Lr0/Y0;->g(Landroid/view/View;Ljava/util/LinkedHashSet;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    const/16 v3, 0x14

    .line 108
    .line 109
    if-lt v2, v3, :cond_6

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_7
    :goto_3
    return-void
.end method

.method public static h(Landroid/view/View;Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    move-object p1, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {p1, v2, v1}, Lr0/Y0;->d(Ljava/lang/Object;ILjava/util/LinkedHashSet;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lr0/Y0;->H(Ljava/util/LinkedHashSet;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-static {p1}, Lr0/Y0;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    if-nez p0, :cond_2

    .line 32
    .line 33
    move-object p0, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, p1}, Lr0/Y0;->g(Landroid/view/View;Ljava/util/LinkedHashSet;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lr0/Y0;->H(Ljava/util/LinkedHashSet;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :goto_1
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    invoke-static {p0}, Lr0/Y0;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    return-object v0
.end method

.method public static j(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-string p2, "UserName"

    .line 12
    .line 13
    invoke-static {p0, p2}, Lr0/Y0;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p0, v0

    .line 31
    :goto_0
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-nez p2, :cond_2

    .line 38
    .line 39
    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static l(Landroid/content/Context;)Landroid/app/Activity;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0xc

    .line 3
    .line 4
    if-ge v0, v1, :cond_1

    .line 5
    .line 6
    instance-of v1, p0, Landroid/app/Activity;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast p0, Landroid/app/Activity;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of v1, p0, Landroid/content/ContextWrapper;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast p0, Landroid/content/ContextWrapper;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static n(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 0

    .line 1
    :goto_0
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    return-object p0

    .line 8
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static p(Landroid/view/View;)Landroid/widget/ListView;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v2, p0, v1}, Lr0/Y0;->f(ILandroid/view/View;Ljava/util/ArrayList;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object v1, v0

    .line 37
    check-cast v1, Landroid/widget/ListView;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const v3, 0xf4240

    .line 44
    .line 45
    .line 46
    mul-int/2addr v2, v3

    .line 47
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    mul-int/lit16 v4, v4, 0x3e8

    .line 52
    .line 53
    add-int/2addr v4, v2

    .line 54
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/2addr v1, v4

    .line 59
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    move-object v4, v2

    .line 64
    check-cast v4, Landroid/widget/ListView;

    .line 65
    .line 66
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    mul-int/2addr v5, v3

    .line 71
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    mul-int/lit16 v6, v6, 0x3e8

    .line 76
    .line 77
    add-int/2addr v6, v5

    .line 78
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    add-int/2addr v4, v6

    .line 83
    if-ge v1, v4, :cond_4

    .line 84
    .line 85
    move-object v0, v2

    .line 86
    move v1, v4

    .line 87
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_3

    .line 92
    .line 93
    :goto_0
    check-cast v0, Landroid/widget/ListView;

    .line 94
    .line 95
    return-object v0
.end method

.method public static r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

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
    invoke-static {v1, p1}, Lr0/Y0;->n(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    move-object p0, v0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    new-instance p1, LE0/d;

    .line 27
    .line 28
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object p0, p1

    .line 32
    :cond_1
    :goto_0
    nop

    .line 33
    instance-of p1, p0, LE0/d;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object v0, p0

    .line 39
    :goto_1
    return-object v0
.end method

.method public static t(Landroid/content/Context;)Ljava/util/LinkedHashSet;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-boolean v2, Lz0/i;->a:Z

    .line 8
    .line 9
    invoke-static {}, Lz0/g;->m()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "0"

    .line 14
    .line 15
    const-string v4, "null"

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-nez v6, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-nez v6, :cond_1

    .line 38
    .line 39
    move v6, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    move v6, v5

    .line 42
    :goto_1
    const/4 v7, 0x0

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    move-object v2, v7

    .line 47
    :goto_2
    if-eqz v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_3
    :try_start_0
    const-string v2, "com.tencent.mm_preferences"

    .line 53
    .line 54
    invoke-virtual {p0, v2, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sget-object v2, Lr0/Y0;->p:[Ljava/lang/String;

    .line 59
    .line 60
    array-length v6, v2

    .line 61
    move v8, v5

    .line 62
    :goto_3
    if-ge v8, v6, :cond_8

    .line 63
    .line 64
    aget-object v9, v2, v8

    .line 65
    .line 66
    invoke-interface {p0, v9, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    if-eqz v9, :cond_7

    .line 71
    .line 72
    invoke-static {v9}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    if-eqz v9, :cond_7

    .line 81
    .line 82
    invoke-static {v9}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_4

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_4
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-nez v10, :cond_5

    .line 94
    .line 95
    invoke-virtual {v9, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-nez v10, :cond_5

    .line 100
    .line 101
    move v10, v0

    .line 102
    goto :goto_5

    .line 103
    :cond_5
    :goto_4
    move v10, v5

    .line 104
    :goto_5
    if-eqz v10, :cond_6

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_6
    move-object v9, v7

    .line 108
    :goto_6
    if-eqz v9, :cond_7

    .line 109
    .line 110
    invoke-virtual {v1, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    :cond_7
    add-int/2addr v8, v0

    .line 114
    goto :goto_3

    .line 115
    :catchall_0
    :cond_8
    return-object v1
.end method

.method public static w(Ljava/lang/Object;[Ljava/lang/String;)Z
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    invoke-static {v4, v3}, Lr0/Y0;->n(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v1
.end method

.method public static z(Landroid/app/Activity;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "com.tencent.mm.plugin.sns.ui.SnsUserUI"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-string v1, "sns_userName"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    :goto_0
    if-nez v0, :cond_2

    .line 43
    .line 44
    const-string v0, ""

    .line 45
    .line 46
    :cond_2
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    :goto_1
    const/4 p0, 0x0

    .line 53
    return p0

    .line 54
    :cond_3
    invoke-static {p0}, Lr0/Y0;->t(Landroid/content/Context;)Ljava/util/LinkedHashSet;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
.end method


# virtual methods
.method public final A(Ljava/lang/Class;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lr0/Y0;->n:LA0/W;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LA0/W;->d:Ljava/util/List;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    sget-object v0, LF0/s;->a:LF0/s;

    .line 12
    .line 13
    :cond_1
    sget-object v1, Lr0/Y0;->o:[Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, LF0/k;->p0(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_2
    const-class v0, Landroid/widget/BaseAdapter;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v1, 0x0

    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v2, "com.tencent.mm.plugin.sns."

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v2, "getDeclaredMethods(...)"

    .line 68
    .line 69
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    array-length v3, v0

    .line 73
    move v4, v1

    .line 74
    :goto_1
    if-ge v4, v3, :cond_7

    .line 75
    .line 76
    aget-object v5, v0, v4

    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    const-string v7, "getCount"

    .line 83
    .line 84
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_6

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const-string v6, "getParameterTypes(...)"

    .line 95
    .line 96
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    array-length v5, v5

    .line 100
    if-nez v5, :cond_6

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    array-length v0, p1

    .line 110
    move v2, v1

    .line 111
    :goto_2
    if-ge v2, v0, :cond_7

    .line 112
    .line 113
    aget-object v3, p1, v2

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    const-string v5, "getView"

    .line 120
    .line 121
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_5

    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    array-length v4, v4

    .line 132
    const/4 v5, 0x3

    .line 133
    if-ne v4, v5, :cond_5

    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    aget-object v3, v3, v1

    .line 140
    .line 141
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 142
    .line 143
    invoke-static {v3, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_5

    .line 148
    .line 149
    :goto_3
    const/4 p1, 0x1

    .line 150
    return p1

    .line 151
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_7
    :goto_4
    return v1
.end method

.method public final B(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lr0/Y0;->A(Ljava/lang/Class;)Z

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
    instance-of v0, p1, Landroid/widget/BaseAdapter;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    const-string v0, "com.tencent.mm.plugin.sns."

    .line 18
    .line 19
    invoke-static {p1, v0, v1}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "getDeclaredMethods(...)"

    .line 34
    .line 35
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    array-length v0, p1

    .line 39
    move v2, v1

    .line 40
    :goto_0
    if-ge v2, v0, :cond_2

    .line 41
    .line 42
    aget-object v3, p1, v2

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-string v5, "getView"

    .line 49
    .line 50
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    array-length v4, v4

    .line 61
    const/4 v5, 0x3

    .line 62
    if-ne v4, v5, :cond_1

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    aget-object v3, v3, v1

    .line 69
    .line 70
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    invoke-static {v3, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    :goto_1
    const/4 p1, 0x1

    .line 79
    return p1

    .line 80
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    return v1
.end method

.method public final C(Landroid/app/Activity;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lr0/Y0;->u()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const-class v1, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public final G(Ljava/lang/Object;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    iput-boolean v0, p0, Lr0/Y0;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v2, "notifyDataSetChanged"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    :try_start_2
    iput-boolean v1, p0, Lr0/Y0;->l:Z

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :catchall_1
    move-exception p1

    .line 29
    iput-boolean v1, p0, Lr0/Y0;->l:Z

    .line 30
    .line 31
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    :goto_0
    new-instance v0, LE0/d;

    .line 33
    .line 34
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object p1, v0

    .line 38
    :goto_1
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    iput-boolean v1, p0, Lr0/Y0;->l:Z

    .line 45
    .line 46
    const-string v0, "hide self sns posts notifyDataSetChanged fail"

    .line 47
    .line 48
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_2
    return-void
.end method

.method public final I(Landroid/app/Activity;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto/16 :goto_6

    .line 5
    .line 6
    :cond_0
    iget-object v1, p0, Lr0/Y0;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-string v4, "getParameterTypes(...)"

    .line 17
    .line 18
    if-nez v3, :cond_6

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v5, "getMethods(...)"

    .line 29
    .line 30
    invoke-static {v3, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v5, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    array-length v6, v3

    .line 39
    const/4 v7, 0x0

    .line 40
    :goto_0
    if-ge v7, v6, :cond_3

    .line 41
    .line 42
    aget-object v8, v3, v7

    .line 43
    .line 44
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    invoke-virtual {p2, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-eqz v9, :cond_2

    .line 53
    .line 54
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-static {v9, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    array-length v9, v9

    .line 62
    if-nez v9, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    invoke-static {v9, v10}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_2

    .line 80
    .line 81
    :goto_1
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    new-instance v3, Lr0/W0;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-static {v5, v3}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_4

    .line 105
    .line 106
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    check-cast v6, Ljava/lang/reflect/Method;

    .line 111
    .line 112
    const/4 v7, 0x1

    .line 113
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-nez v1, :cond_5

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    move-object v3, v1

    .line 125
    :cond_6
    :goto_3
    check-cast v3, Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_a

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, Ljava/lang/reflect/Method;

    .line 142
    .line 143
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    array-length v3, v3

    .line 151
    if-nez v3, :cond_8

    .line 152
    .line 153
    invoke-virtual {v2, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    goto :goto_5

    .line 158
    :catchall_0
    move-exception v2

    .line 159
    goto :goto_4

    .line 160
    :cond_8
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 161
    .line 162
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v2, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    goto :goto_5

    .line 171
    :goto_4
    new-instance v3, LE0/d;

    .line 172
    .line 173
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    move-object v2, v3

    .line 177
    :goto_5
    nop

    .line 178
    instance-of v3, v2, LE0/d;

    .line 179
    .line 180
    if-eqz v3, :cond_9

    .line 181
    .line 182
    move-object v2, v0

    .line 183
    :cond_9
    if-eqz v2, :cond_7

    .line 184
    .line 185
    invoke-virtual {p2, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-eqz v3, :cond_7

    .line 190
    .line 191
    return-object v2

    .line 192
    :cond_a
    :goto_6
    return-object v0
.end method

.method public final J(Landroid/app/Activity;Landroid/widget/ListAdapter;Landroid/view/View;Ljava/util/ArrayList;Ljava/lang/Class;Ljava/lang/Class;)Lr0/P0;
    .locals 12

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    invoke-static {p1}, Lr0/Y0;->t(Landroid/content/Context;)Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v6, Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v7, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    :cond_1
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-eqz v9, :cond_2

    .line 42
    .line 43
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-static {v9}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    if-eqz v10, :cond_1

    .line 60
    .line 61
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    const/4 v7, 0x0

    .line 70
    move v8, v7

    .line 71
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-eqz v9, :cond_5

    .line 76
    .line 77
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-virtual {p0, v9, v2, v0, v1}, Lr0/Y0;->q(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    sget-object v11, Lz0/w;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 86
    .line 87
    move-object v11, v3

    .line 88
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 89
    .line 90
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-static {v9, v0, v1, v7, v3}, Lz0/w;->b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;ILjava/util/LinkedHashSet;)V

    .line 94
    .line 95
    .line 96
    if-eqz v10, :cond_4

    .line 97
    .line 98
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-nez v8, :cond_3

    .line 103
    .line 104
    new-instance v0, Lr0/P0;

    .line 105
    .line 106
    invoke-static {p3, v9}, Lr0/Y0;->h(Landroid/view/View;Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    move-object v1, p1

    .line 111
    move-object v2, p2

    .line 112
    move-object v5, p3

    .line 113
    invoke-direct/range {v0 .. v5}, Lr0/P0;-><init>(Landroid/app/Activity;Landroid/widget/ListAdapter;Ljava/util/LinkedHashSet;Ljava/lang/String;Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_3
    const/4 v8, 0x1

    .line 118
    :cond_4
    invoke-virtual {v11, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 119
    .line 120
    .line 121
    move-object v3, v11

    .line 122
    goto :goto_1

    .line 123
    :cond_5
    move-object v11, v3

    .line 124
    if-eqz v8, :cond_8

    .line 125
    .line 126
    invoke-virtual {v11}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_6

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    new-instance v0, Lr0/P0;

    .line 134
    .line 135
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_7

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_7
    move-object/from16 v1, p4

    .line 143
    .line 144
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    :goto_2
    invoke-static {p3, v4}, Lr0/Y0;->h(Landroid/view/View;Ljava/lang/Object;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    move-object v1, p1

    .line 153
    move-object v2, p2

    .line 154
    move-object v5, p3

    .line 155
    move-object v3, v11

    .line 156
    invoke-direct/range {v0 .. v5}, Lr0/P0;-><init>(Landroid/app/Activity;Landroid/widget/ListAdapter;Ljava/util/LinkedHashSet;Ljava/lang/String;Landroid/view/View;)V

    .line 157
    .line 158
    .line 159
    return-object v0

    .line 160
    :cond_8
    :goto_3
    return-object v4
.end method

.method public final M(Lr0/P0;)V
    .locals 3

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->H()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    invoke-static {}, Lz0/g;->A()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v0, p1, Lr0/P0;->a:Landroid/app/Activity;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lr0/Y0;->C(Landroid/app/Activity;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "\u9690\u85cf\u6b64\u6761\u670b\u53cb\u5708"

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p1, Lr0/P0;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    const-string v1, "\u786e\u5b9a\u9690\u85cf\u8fd9\u6761\u670b\u53cb\u5708\u5185\u5bb9\uff1f"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const-string v2, "\u786e\u5b9a\u9690\u85cf\u8fd9\u6761\u670b\u53cb\u5708\u5185\u5bb9\uff1f\n\n"

    .line 47
    .line 48
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :goto_0
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v1, Lq0/b;

    .line 57
    .line 58
    const/4 v2, 0x2

    .line 59
    invoke-direct {v1, p0, p1, v2}, Lq0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    const-string p1, "\u786e\u5b9a"

    .line 63
    .line 64
    invoke-virtual {v0, p1, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string v0, "\u53d6\u6d88"

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 76
    .line 77
    .line 78
    :cond_2
    :goto_1
    return-void
.end method

.method public final c(Ljava/lang/Class;)Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, Lr0/Y0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_3

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    move-object v2, p1

    .line 15
    :goto_0
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "getDeclaredFields(...)"

    .line 22
    .line 23
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    array-length v4, v3

    .line 27
    const/4 v5, 0x0

    .line 28
    :goto_1
    if-ge v5, v4, :cond_0

    .line 29
    .line 30
    aget-object v6, v3, v5

    .line 31
    .line 32
    const/4 v7, 0x1

    .line 33
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    add-int/lit8 v5, v5, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move-object v1, p1

    .line 55
    :cond_3
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 56
    .line 57
    return-object v1
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x1

    .line 7
    invoke-static/range {p1 .. p1}, LA0/l;->m(Landroid/content/Context;)LA0/W;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iput-object v2, v1, Lr0/Y0;->n:LA0/W;

    .line 12
    .line 13
    sget-object v2, Lz0/w;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    iget-object v2, v1, Lr0/Y0;->n:LA0/W;

    .line 16
    .line 17
    sput-object v2, Lz0/w;->g:LA0/W;

    .line 18
    .line 19
    sget-boolean v2, Lz0/i;->a:Z

    .line 20
    .line 21
    invoke-static {}, Lz0/g;->A()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const-string v3, "enabled="

    .line 26
    .line 27
    invoke-static {v3, v2}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v3, v1, Lr0/Y0;->n:LA0/W;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    iget-object v3, v3, LA0/W;->p:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v3, v6

    .line 43
    :goto_0
    const-string v4, "create="

    .line 44
    .line 45
    invoke-static {v3, v4}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-object v4, v1, Lr0/Y0;->n:LA0/W;

    .line 50
    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    iget-object v4, v4, LA0/W;->q:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v4, v6

    .line 61
    :goto_1
    const-string v5, "select="

    .line 62
    .line 63
    invoke-static {v4, v5}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const-string v5, "self sns detail hook init"

    .line 68
    .line 69
    filled-new-array {v5, v2, v3, v4}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lz0/r;->p()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const/16 v8, 0xbf4

    .line 81
    .line 82
    const/16 v3, 0xc30

    .line 83
    .line 84
    if-le v2, v3, :cond_2

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    invoke-static {}, Lz0/r;->p()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eq v2, v8, :cond_3

    .line 92
    .line 93
    const/16 v4, 0xc08

    .line 94
    .line 95
    if-eq v2, v4, :cond_3

    .line 96
    .line 97
    const/16 v4, 0xc1c

    .line 98
    .line 99
    if-eq v2, v4, :cond_3

    .line 100
    .line 101
    if-eq v2, v3, :cond_3

    .line 102
    .line 103
    iget-object v2, v1, Lr0/Y0;->n:LA0/W;

    .line 104
    .line 105
    if-nez v2, :cond_3

    .line 106
    .line 107
    goto/16 :goto_1e

    .line 108
    .line 109
    :cond_3
    :goto_2
    iget-object v2, v0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v0, v0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v2, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_4

    .line 118
    .line 119
    goto/16 :goto_1e

    .line 120
    .line 121
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 126
    .line 127
    const-string v3, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 128
    .line 129
    invoke-interface {v2, v0, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 138
    .line 139
    const-string v4, "com.tencent.mm.protocal.protobuf.TimeLineObject"

    .line 140
    .line 141
    invoke-interface {v2, v0, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 150
    .line 151
    const-string v5, "com.tencent.mm.plugin.sns.ui.SnsUserUI"

    .line 152
    .line 153
    invoke-interface {v2, v0, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const-string v9, "onDestroy"

    .line 158
    .line 159
    const-string v10, "onResume"

    .line 160
    .line 161
    if-nez v0, :cond_5

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_5
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 165
    .line 166
    const-string v5, "hide-self-sns-user-activity"

    .line 167
    .line 168
    invoke-virtual {v2, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_6

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_6
    new-array v2, v6, [Ljava/lang/Object;

    .line 176
    .line 177
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 178
    .line 179
    invoke-interface {v11, v0, v10, v2}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    if-eqz v2, :cond_7

    .line 184
    .line 185
    new-instance v11, Lr0/R0;

    .line 186
    .line 187
    invoke-direct {v11, v1, v7}, Lr0/R0;-><init>(Lr0/Y0;I)V

    .line 188
    .line 189
    .line 190
    invoke-static {v2, v11}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 191
    .line 192
    .line 193
    :cond_7
    const-string v2, "onPause"

    .line 194
    .line 195
    filled-new-array {v2, v9}, [Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-static {v2}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    :cond_8
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    if-eqz v11, :cond_9

    .line 212
    .line 213
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    check-cast v11, Ljava/lang/String;

    .line 218
    .line 219
    new-array v12, v6, [Ljava/lang/Object;

    .line 220
    .line 221
    sget-object v13, Lc0/f;->b:Ld0/b;

    .line 222
    .line 223
    invoke-interface {v13, v0, v11, v12}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 224
    .line 225
    .line 226
    move-result-object v11

    .line 227
    if-eqz v11, :cond_8

    .line 228
    .line 229
    new-instance v12, Lr0/R0;

    .line 230
    .line 231
    const/4 v13, 0x2

    .line 232
    invoke-direct {v12, v1, v13}, Lr0/R0;-><init>(Lr0/Y0;I)V

    .line 233
    .line 234
    .line 235
    invoke-static {v11, v12}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_9
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 240
    .line 241
    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    :goto_4
    iget-object v0, v1, Lr0/Y0;->n:LA0/W;

    .line 245
    .line 246
    if-eqz v0, :cond_a

    .line 247
    .line 248
    iget-object v0, v0, LA0/W;->d:Ljava/util/List;

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_a
    const/4 v0, 0x0

    .line 252
    :goto_5
    sget-object v12, LF0/s;->a:LF0/s;

    .line 253
    .line 254
    if-nez v0, :cond_b

    .line 255
    .line 256
    move-object v0, v12

    .line 257
    :cond_b
    sget-object v2, Lr0/Y0;->o:[Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {v0, v2}, LF0/k;->p0(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-eqz v2, :cond_d

    .line 280
    .line 281
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    check-cast v2, Ljava/lang/String;

    .line 286
    .line 287
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    sget-object v13, Lc0/f;->b:Ld0/b;

    .line 292
    .line 293
    invoke-interface {v13, v5, v2}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    if-nez v2, :cond_c

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_c
    invoke-virtual {v1, v2}, Lr0/Y0;->x(Ljava/lang/Class;)V

    .line 301
    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 309
    .line 310
    const-string v5, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"

    .line 311
    .line 312
    invoke-interface {v2, v0, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-result-object v13

    .line 316
    if-nez v13, :cond_e

    .line 317
    .line 318
    const-string v0, "hide self sns posts adapter class missing"

    .line 319
    .line 320
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    goto/16 :goto_15

    .line 328
    .line 329
    :cond_e
    iget-object v0, v1, Lr0/Y0;->n:LA0/W;

    .line 330
    .line 331
    if-eqz v0, :cond_f

    .line 332
    .line 333
    iget-object v0, v0, LA0/W;->a:Ljava/util/List;

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_f
    const/4 v0, 0x0

    .line 337
    :goto_7
    if-nez v0, :cond_10

    .line 338
    .line 339
    move-object v0, v12

    .line 340
    :cond_10
    const-string v2, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC"

    .line 341
    .line 342
    const-string v5, "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"

    .line 343
    .line 344
    filled-new-array {v2, v5}, [Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-static {v2}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-static {v0, v2}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    new-instance v2, Ljava/util/ArrayList;

    .line 365
    .line 366
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    :cond_11
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    if-eqz v5, :cond_12

    .line 378
    .line 379
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    check-cast v5, Ljava/lang/String;

    .line 384
    .line 385
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 386
    .line 387
    .line 388
    move-result-object v14

    .line 389
    sget-object v15, Lc0/f;->b:Ld0/b;

    .line 390
    .line 391
    invoke-interface {v15, v14, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    if-eqz v5, :cond_11

    .line 396
    .line 397
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_12
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 402
    .line 403
    .line 404
    move-result-object v14

    .line 405
    :goto_9
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    const-string v15, "getParameterTypes(...)"

    .line 410
    .line 411
    const-string v2, "-"

    .line 412
    .line 413
    if-eqz v0, :cond_1f

    .line 414
    .line 415
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    move-object/from16 v16, v0

    .line 420
    .line 421
    check-cast v16, Ljava/lang/Class;

    .line 422
    .line 423
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    const-string v5, "getDeclaredMethods(...)"

    .line 428
    .line 429
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    new-instance v11, Ljava/util/ArrayList;

    .line 433
    .line 434
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 435
    .line 436
    .line 437
    array-length v8, v0

    .line 438
    :goto_a
    if-ge v6, v8, :cond_14

    .line 439
    .line 440
    move/from16 v18, v7

    .line 441
    .line 442
    aget-object v7, v0, v6

    .line 443
    .line 444
    move-object/from16 v19, v0

    .line 445
    .line 446
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-static {v0, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    array-length v0, v0

    .line 454
    if-nez v0, :cond_13

    .line 455
    .line 456
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    const-string v1, "getReturnType(...)"

    .line 461
    .line 462
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    invoke-static {v0, v13}, Lr0/Y0;->E(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_13

    .line 470
    .line 471
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    :cond_13
    add-int/lit8 v6, v6, 0x1

    .line 475
    .line 476
    move-object/from16 v1, p0

    .line 477
    .line 478
    move/from16 v7, v18

    .line 479
    .line 480
    move-object/from16 v0, v19

    .line 481
    .line 482
    goto :goto_a

    .line 483
    :cond_14
    move/from16 v18, v7

    .line 484
    .line 485
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 486
    .line 487
    .line 488
    move-result-object v6

    .line 489
    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-eqz v0, :cond_16

    .line 494
    .line 495
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    move-object v7, v0

    .line 500
    check-cast v7, Ljava/lang/reflect/Method;

    .line 501
    .line 502
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    new-instance v8, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    const-string v11, "hide-self-sns-posts-adapter-provider-"

    .line 517
    .line 518
    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v8

    .line 534
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 535
    .line 536
    invoke-virtual {v0, v8}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    if-eqz v0, :cond_15

    .line 541
    .line 542
    move-object v11, v2

    .line 543
    move-object/from16 v19, v6

    .line 544
    .line 545
    move-object v6, v5

    .line 546
    goto :goto_c

    .line 547
    :cond_15
    move/from16 v1, v18

    .line 548
    .line 549
    invoke-virtual {v7, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 550
    .line 551
    .line 552
    new-instance v0, Lr0/U0;

    .line 553
    .line 554
    move-object v1, v5

    .line 555
    const/4 v5, 0x0

    .line 556
    move-object v11, v2

    .line 557
    move-object/from16 v19, v6

    .line 558
    .line 559
    move-object/from16 v2, p1

    .line 560
    .line 561
    move-object v6, v1

    .line 562
    move-object/from16 v1, p0

    .line 563
    .line 564
    invoke-direct/range {v0 .. v5}, Lr0/U0;-><init>(Lr0/Y0;Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;I)V

    .line 565
    .line 566
    .line 567
    invoke-static {v7, v0}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 568
    .line 569
    .line 570
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 571
    .line 572
    invoke-virtual {v0, v8}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    :goto_c
    move-object v5, v6

    .line 576
    move-object v2, v11

    .line 577
    move-object/from16 v6, v19

    .line 578
    .line 579
    const/16 v18, 0x1

    .line 580
    .line 581
    goto :goto_b

    .line 582
    :cond_16
    move-object v11, v2

    .line 583
    move-object v6, v5

    .line 584
    sget v0, Lz0/r;->e:I

    .line 585
    .line 586
    const/4 v1, -0x1

    .line 587
    if-ne v0, v1, :cond_17

    .line 588
    .line 589
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    const/4 v5, 0x0

    .line 606
    invoke-virtual {v0, v2, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 611
    .line 612
    goto :goto_d

    .line 613
    :catch_0
    move-exception v0

    .line 614
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    :goto_d
    sput v1, Lz0/r;->e:I

    .line 622
    .line 623
    :cond_17
    sget v0, Lz0/r;->e:I

    .line 624
    .line 625
    const/16 v7, 0xbf4

    .line 626
    .line 627
    if-ne v0, v7, :cond_19

    .line 628
    .line 629
    :cond_18
    move-object v2, v13

    .line 630
    goto/16 :goto_12

    .line 631
    .line 632
    :cond_19
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    new-instance v1, Ljava/util/ArrayList;

    .line 640
    .line 641
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 642
    .line 643
    .line 644
    array-length v2, v0

    .line 645
    const/4 v5, 0x0

    .line 646
    :goto_e
    if-ge v5, v2, :cond_1b

    .line 647
    .line 648
    aget-object v8, v0, v5

    .line 649
    .line 650
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    move-result-object v7

    .line 654
    array-length v7, v7

    .line 655
    move/from16 v19, v2

    .line 656
    .line 657
    const/4 v2, 0x1

    .line 658
    if-ne v7, v2, :cond_1a

    .line 659
    .line 660
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    const/16 v17, 0x0

    .line 665
    .line 666
    aget-object v2, v2, v17

    .line 667
    .line 668
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    const-string v7, "android.os.Bundle"

    .line 673
    .line 674
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    move-result v2

    .line 678
    if-eqz v2, :cond_1a

    .line 679
    .line 680
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const-string v7, "onCreate"

    .line 685
    .line 686
    invoke-static {v2, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    if-eqz v2, :cond_1a

    .line 691
    .line 692
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 693
    .line 694
    .line 695
    :cond_1a
    const/16 v18, 0x1

    .line 696
    .line 697
    add-int/lit8 v5, v5, 0x1

    .line 698
    .line 699
    move/from16 v2, v19

    .line 700
    .line 701
    const/16 v7, 0xbf4

    .line 702
    .line 703
    goto :goto_e

    .line 704
    :cond_1b
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    new-instance v2, Ljava/util/ArrayList;

    .line 712
    .line 713
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 714
    .line 715
    .line 716
    array-length v5, v0

    .line 717
    const/4 v6, 0x0

    .line 718
    :goto_f
    if-ge v6, v5, :cond_1d

    .line 719
    .line 720
    aget-object v7, v0, v6

    .line 721
    .line 722
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    move-result-object v8

    .line 726
    invoke-static {v8, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    array-length v8, v8

    .line 730
    if-nez v8, :cond_1c

    .line 731
    .line 732
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v8

    .line 736
    invoke-static {v8, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    move-result v8

    .line 740
    if-eqz v8, :cond_1c

    .line 741
    .line 742
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    :cond_1c
    const/16 v18, 0x1

    .line 746
    .line 747
    add-int/lit8 v6, v6, 0x1

    .line 748
    .line 749
    goto :goto_f

    .line 750
    :cond_1d
    invoke-static {v1, v2}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 755
    .line 756
    .line 757
    move-result-object v6

    .line 758
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    if-eqz v0, :cond_18

    .line 763
    .line 764
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    move-object v7, v0

    .line 769
    check-cast v7, Ljava/lang/reflect/Method;

    .line 770
    .line 771
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    new-instance v2, Ljava/lang/StringBuilder;

    .line 784
    .line 785
    const-string v5, "hide-self-sns-posts-lifecycle-capture-"

    .line 786
    .line 787
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 794
    .line 795
    .line 796
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v8

    .line 803
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 804
    .line 805
    invoke-virtual {v0, v8}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    if-eqz v0, :cond_1e

    .line 810
    .line 811
    move-object v2, v13

    .line 812
    goto :goto_11

    .line 813
    :cond_1e
    const/4 v1, 0x1

    .line 814
    invoke-virtual {v7, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 815
    .line 816
    .line 817
    new-instance v0, Lr0/V0;

    .line 818
    .line 819
    move-object/from16 v1, p0

    .line 820
    .line 821
    move-object v5, v4

    .line 822
    move-object v2, v13

    .line 823
    move-object v4, v3

    .line 824
    move-object/from16 v3, p1

    .line 825
    .line 826
    invoke-direct/range {v0 .. v5}, Lr0/V0;-><init>(Lr0/Y0;Ljava/lang/Class;Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 827
    .line 828
    .line 829
    move-object v3, v4

    .line 830
    move-object v4, v5

    .line 831
    invoke-static {v7, v0}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 832
    .line 833
    .line 834
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 835
    .line 836
    invoke-virtual {v0, v8}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    :goto_11
    move-object v13, v2

    .line 840
    goto :goto_10

    .line 841
    :goto_12
    move-object v13, v2

    .line 842
    const/4 v6, 0x0

    .line 843
    const/4 v7, 0x1

    .line 844
    const/16 v8, 0xbf4

    .line 845
    .line 846
    move-object/from16 v1, p0

    .line 847
    .line 848
    goto/16 :goto_9

    .line 849
    .line 850
    :cond_1f
    move-object v11, v2

    .line 851
    move-object v2, v13

    .line 852
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    const-string v1, "getMethods(...)"

    .line 857
    .line 858
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 859
    .line 860
    .line 861
    new-instance v1, Ljava/util/ArrayList;

    .line 862
    .line 863
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 864
    .line 865
    .line 866
    array-length v2, v0

    .line 867
    const/4 v5, 0x0

    .line 868
    :goto_13
    if-ge v5, v2, :cond_21

    .line 869
    .line 870
    aget-object v6, v0, v5

    .line 871
    .line 872
    sget-object v7, Lr0/Y0;->q:Ljava/util/Set;

    .line 873
    .line 874
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v8

    .line 878
    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v7

    .line 882
    if-eqz v7, :cond_20

    .line 883
    .line 884
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    :cond_20
    const/16 v18, 0x1

    .line 888
    .line 889
    add-int/lit8 v5, v5, 0x1

    .line 890
    .line 891
    goto :goto_13

    .line 892
    :cond_21
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 893
    .line 894
    .line 895
    move-result-object v6

    .line 896
    :goto_14
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 897
    .line 898
    .line 899
    move-result v0

    .line 900
    if-eqz v0, :cond_23

    .line 901
    .line 902
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    move-object v7, v0

    .line 907
    check-cast v7, Ljava/lang/reflect/Method;

    .line 908
    .line 909
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    move-result-object v2

    .line 925
    invoke-static {v2, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 926
    .line 927
    .line 928
    new-instance v5, Lr0/P;

    .line 929
    .line 930
    const/16 v8, 0x16

    .line 931
    .line 932
    invoke-direct {v5, v8}, Lr0/P;-><init>(I)V

    .line 933
    .line 934
    .line 935
    const-string v8, "#"

    .line 936
    .line 937
    const/16 v13, 0x1e

    .line 938
    .line 939
    invoke-static {v2, v8, v5, v13}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object v2

    .line 943
    new-instance v5, Ljava/lang/StringBuilder;

    .line 944
    .line 945
    const-string v8, "hide-self-sns-posts-"

    .line 946
    .line 947
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 951
    .line 952
    .line 953
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 954
    .line 955
    .line 956
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 957
    .line 958
    .line 959
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 960
    .line 961
    .line 962
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 963
    .line 964
    .line 965
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 966
    .line 967
    .line 968
    move-result-object v8

    .line 969
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 970
    .line 971
    invoke-virtual {v0, v8}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 972
    .line 973
    .line 974
    move-result v0

    .line 975
    if-eqz v0, :cond_22

    .line 976
    .line 977
    move-object/from16 v1, p0

    .line 978
    .line 979
    goto :goto_14

    .line 980
    :cond_22
    const/4 v1, 0x1

    .line 981
    invoke-virtual {v7, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 982
    .line 983
    .line 984
    new-instance v0, Lr0/U0;

    .line 985
    .line 986
    const/4 v5, 0x1

    .line 987
    move-object/from16 v1, p0

    .line 988
    .line 989
    move-object/from16 v2, p1

    .line 990
    .line 991
    invoke-direct/range {v0 .. v5}, Lr0/U0;-><init>(Lr0/Y0;Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;I)V

    .line 992
    .line 993
    .line 994
    invoke-static {v7, v0}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 995
    .line 996
    .line 997
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 998
    .line 999
    invoke-virtual {v0, v8}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1000
    .line 1001
    .line 1002
    goto :goto_14

    .line 1003
    :cond_23
    move-object/from16 v1, p0

    .line 1004
    .line 1005
    :goto_15
    invoke-virtual {v1}, Lr0/Y0;->u()Ljava/util/List;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    :cond_24
    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1014
    .line 1015
    .line 1016
    move-result v2

    .line 1017
    if-eqz v2, :cond_28

    .line 1018
    .line 1019
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    check-cast v2, Ljava/lang/String;

    .line 1024
    .line 1025
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v5

    .line 1029
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 1030
    .line 1031
    invoke-interface {v6, v5, v2}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v2

    .line 1035
    if-nez v2, :cond_25

    .line 1036
    .line 1037
    const/4 v5, 0x0

    .line 1038
    const/4 v7, 0x1

    .line 1039
    goto :goto_16

    .line 1040
    :cond_25
    const/4 v5, 0x0

    .line 1041
    new-array v6, v5, [Ljava/lang/Object;

    .line 1042
    .line 1043
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 1044
    .line 1045
    invoke-interface {v5, v2, v10, v6}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v5

    .line 1049
    if-eqz v5, :cond_26

    .line 1050
    .line 1051
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v6

    .line 1055
    const-string v7, "hide-self-sns-detail-resume-"

    .line 1056
    .line 1057
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v6

    .line 1061
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1062
    .line 1063
    invoke-virtual {v7, v6}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v6

    .line 1067
    if-eqz v6, :cond_26

    .line 1068
    .line 1069
    new-instance v6, Lr0/T0;

    .line 1070
    .line 1071
    const/4 v7, 0x0

    .line 1072
    invoke-direct {v6, v1, v3, v4, v7}, Lr0/T0;-><init>(Lr0/Y0;Ljava/lang/Class;Ljava/lang/Class;I)V

    .line 1073
    .line 1074
    .line 1075
    invoke-static {v5, v6}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1076
    .line 1077
    .line 1078
    :cond_26
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 1079
    .line 1080
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v5

    .line 1084
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 1085
    .line 1086
    const-string v7, "onWindowFocusChanged"

    .line 1087
    .line 1088
    invoke-interface {v6, v2, v7, v5}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v5

    .line 1092
    if-eqz v5, :cond_27

    .line 1093
    .line 1094
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v6

    .line 1098
    const-string v7, "hide-self-sns-detail-focus-"

    .line 1099
    .line 1100
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v6

    .line 1104
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1105
    .line 1106
    invoke-virtual {v7, v6}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1107
    .line 1108
    .line 1109
    move-result v6

    .line 1110
    if-eqz v6, :cond_27

    .line 1111
    .line 1112
    new-instance v6, Lr0/T0;

    .line 1113
    .line 1114
    const/4 v7, 0x1

    .line 1115
    invoke-direct {v6, v1, v3, v4, v7}, Lr0/T0;-><init>(Lr0/Y0;Ljava/lang/Class;Ljava/lang/Class;I)V

    .line 1116
    .line 1117
    .line 1118
    invoke-static {v5, v6}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1119
    .line 1120
    .line 1121
    :goto_17
    const/4 v5, 0x0

    .line 1122
    goto :goto_18

    .line 1123
    :cond_27
    const/4 v7, 0x1

    .line 1124
    goto :goto_17

    .line 1125
    :goto_18
    new-array v6, v5, [Ljava/lang/Object;

    .line 1126
    .line 1127
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 1128
    .line 1129
    invoke-interface {v8, v2, v9, v6}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v6

    .line 1133
    if-eqz v6, :cond_24

    .line 1134
    .line 1135
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v2

    .line 1139
    const-string v8, "hide-self-sns-detail-destroy-"

    .line 1140
    .line 1141
    invoke-virtual {v8, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v2

    .line 1145
    sget-object v8, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1146
    .line 1147
    invoke-virtual {v8, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1148
    .line 1149
    .line 1150
    move-result v2

    .line 1151
    if-eqz v2, :cond_24

    .line 1152
    .line 1153
    new-instance v2, Lr0/R0;

    .line 1154
    .line 1155
    const/4 v8, 0x3

    .line 1156
    invoke-direct {v2, v1, v8}, Lr0/R0;-><init>(Lr0/Y0;I)V

    .line 1157
    .line 1158
    .line 1159
    invoke-static {v6, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1160
    .line 1161
    .line 1162
    goto/16 :goto_16

    .line 1163
    .line 1164
    :cond_28
    iget-object v0, v1, Lr0/Y0;->n:LA0/W;

    .line 1165
    .line 1166
    if-eqz v0, :cond_29

    .line 1167
    .line 1168
    iget-object v0, v0, LA0/W;->p:Ljava/util/List;

    .line 1169
    .line 1170
    goto :goto_19

    .line 1171
    :cond_29
    const/4 v0, 0x0

    .line 1172
    :goto_19
    if-nez v0, :cond_2a

    .line 1173
    .line 1174
    move-object v0, v12

    .line 1175
    :cond_2a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1180
    .line 1181
    .line 1182
    move-result v2

    .line 1183
    if-eqz v2, :cond_2b

    .line 1184
    .line 1185
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v2

    .line 1189
    check-cast v2, LA0/X;

    .line 1190
    .line 1191
    move-object v6, v4

    .line 1192
    const/4 v4, 0x1

    .line 1193
    move-object v5, v3

    .line 1194
    move-object v3, v2

    .line 1195
    move-object/from16 v2, p1

    .line 1196
    .line 1197
    invoke-virtual/range {v1 .. v6}, Lr0/Y0;->y(Landroid/content/Context;LA0/X;ZLjava/lang/Class;Ljava/lang/Class;)V

    .line 1198
    .line 1199
    .line 1200
    move-object v3, v5

    .line 1201
    move-object v4, v6

    .line 1202
    goto :goto_1a

    .line 1203
    :cond_2b
    iget-object v0, v1, Lr0/Y0;->n:LA0/W;

    .line 1204
    .line 1205
    if-eqz v0, :cond_2c

    .line 1206
    .line 1207
    iget-object v11, v0, LA0/W;->q:Ljava/util/List;

    .line 1208
    .line 1209
    goto :goto_1b

    .line 1210
    :cond_2c
    const/4 v11, 0x0

    .line 1211
    :goto_1b
    if-nez v11, :cond_2d

    .line 1212
    .line 1213
    goto :goto_1c

    .line 1214
    :cond_2d
    move-object v12, v11

    .line 1215
    :goto_1c
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0

    .line 1219
    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1220
    .line 1221
    .line 1222
    move-result v2

    .line 1223
    if-eqz v2, :cond_2e

    .line 1224
    .line 1225
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v2

    .line 1229
    check-cast v2, LA0/X;

    .line 1230
    .line 1231
    move-object v6, v4

    .line 1232
    const/4 v4, 0x0

    .line 1233
    move-object v5, v3

    .line 1234
    move-object v3, v2

    .line 1235
    move-object/from16 v2, p1

    .line 1236
    .line 1237
    invoke-virtual/range {v1 .. v6}, Lr0/Y0;->y(Landroid/content/Context;LA0/X;ZLjava/lang/Class;Ljava/lang/Class;)V

    .line 1238
    .line 1239
    .line 1240
    move-object/from16 v1, p0

    .line 1241
    .line 1242
    move-object v3, v5

    .line 1243
    move-object v4, v6

    .line 1244
    goto :goto_1d

    .line 1245
    :cond_2e
    :goto_1e
    return-void
.end method

.method public final i(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    invoke-virtual {p3, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_b

    .line 11
    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    if-nez p3, :cond_1

    .line 14
    .line 15
    const-string p3, "com.tencent.mm.plugin.sns."

    .line 16
    .line 17
    invoke-static {p1, p3, v1}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-nez p3, :cond_1

    .line 22
    .line 23
    goto/16 :goto_b

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0, p1, p2}, Lr0/Y0;->o(Ljava/lang/Object;Ljava/util/LinkedHashSet;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    return-object p3

    .line 32
    :cond_2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    const-string v2, "getUserName"

    .line 37
    .line 38
    invoke-virtual {p3, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p3

    .line 44
    new-instance v2, LE0/d;

    .line 45
    .line 46
    invoke-direct {v2, p3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p3, v2

    .line 50
    :goto_0
    nop

    .line 51
    instance-of v2, p3, LE0/d;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    move-object p3, v0

    .line 56
    :cond_3
    check-cast p3, Ljava/lang/reflect/Method;

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    if-eqz p3, :cond_8

    .line 60
    .line 61
    :try_start_1
    invoke-virtual {p3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    instance-of v3, p3, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    check-cast p3, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :catchall_1
    move-exception p3

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    move-object p3, v0

    .line 78
    goto :goto_2

    .line 79
    :goto_1
    new-instance v3, LE0/d;

    .line 80
    .line 81
    invoke-direct {v3, p3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    move-object p3, v3

    .line 85
    :goto_2
    nop

    .line 86
    instance-of v3, p3, LE0/d;

    .line 87
    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    move-object p3, v0

    .line 91
    :cond_5
    check-cast p3, Ljava/lang/String;

    .line 92
    .line 93
    if-eqz p3, :cond_6

    .line 94
    .line 95
    invoke-static {p3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    goto :goto_3

    .line 104
    :cond_6
    move-object p3, v0

    .line 105
    :goto_3
    if-eqz p3, :cond_8

    .line 106
    .line 107
    invoke-static {p3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_7

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_8

    .line 119
    .line 120
    return-object p3

    .line 121
    :cond_8
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    if-nez p4, :cond_9

    .line 126
    .line 127
    sget-object p3, LF0/s;->a:LF0/s;

    .line 128
    .line 129
    goto :goto_8

    .line 130
    :cond_9
    iget-object v3, p0, Lr0/Y0;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 131
    .line 132
    invoke-virtual {v3, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-nez v4, :cond_e

    .line 137
    .line 138
    invoke-virtual {p3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    const-string v5, "getDeclaredMethods(...)"

    .line 143
    .line 144
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance v5, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    array-length v6, v4

    .line 153
    :goto_5
    if-ge v1, v6, :cond_b

    .line 154
    .line 155
    aget-object v7, v4, v1

    .line 156
    .line 157
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    const-string v9, "getParameterTypes(...)"

    .line 162
    .line 163
    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    array-length v8, v8

    .line 167
    if-nez v8, :cond_a

    .line 168
    .line 169
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-static {v8, p4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-eqz v8, :cond_a

    .line 178
    .line 179
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_b
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_c

    .line 194
    .line 195
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    check-cast v4, Ljava/lang/reflect/Method;

    .line 200
    .line 201
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_c
    invoke-virtual {v3, p3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p3

    .line 209
    if-nez p3, :cond_d

    .line 210
    .line 211
    move-object v4, v5

    .line 212
    goto :goto_7

    .line 213
    :cond_d
    move-object v4, p3

    .line 214
    :cond_e
    :goto_7
    move-object p3, v4

    .line 215
    check-cast p3, Ljava/util/List;

    .line 216
    .line 217
    :goto_8
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object p3

    .line 221
    :cond_f
    :goto_9
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_12

    .line 226
    .line 227
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    check-cast v1, Ljava/lang/reflect/Method;

    .line 232
    .line 233
    :try_start_2
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 240
    goto :goto_a

    .line 241
    :catchall_2
    move-exception v1

    .line 242
    new-instance v3, LE0/d;

    .line 243
    .line 244
    invoke-direct {v3, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    move-object v1, v3

    .line 248
    :goto_a
    nop

    .line 249
    instance-of v3, v1, LE0/d;

    .line 250
    .line 251
    if-eqz v3, :cond_10

    .line 252
    .line 253
    move-object v1, v0

    .line 254
    :cond_10
    if-nez v1, :cond_11

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_11
    invoke-static {v1, p2, p4}, Lr0/Y0;->j(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    if-eqz v1, :cond_f

    .line 262
    .line 263
    return-object v1

    .line 264
    :cond_12
    :goto_b
    return-object v0
.end method

.method public final k(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 7

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p2, :cond_a

    .line 5
    .line 6
    iget-object v3, p0, Lr0/Y0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    if-eq p2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-string v4, "com.tencent.mm.plugin.sns.ui.improve.component.g2"

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_a

    .line 25
    .line 26
    :cond_0
    sget-boolean v3, Lz0/i;->a:Z

    .line 27
    .line 28
    invoke-static {}, Lz0/g;->A()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    invoke-static {p1}, Lr0/Y0;->t(Landroid/content/Context;)Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const-string v3, "data"

    .line 47
    .line 48
    invoke-static {p2, v3}, Lr0/Y0;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Ljava/util/List;

    .line 53
    .line 54
    if-nez p2, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    sub-int/2addr v3, v1

    .line 62
    move v4, v2

    .line 63
    :goto_0
    if-ge v0, v3, :cond_9

    .line 64
    .line 65
    invoke-static {p2, v3}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    if-nez v5, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-virtual {p0, v5, p1, p3, p4}, Lr0/Y0;->q(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    if-nez v6, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    invoke-interface {p1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-nez v6, :cond_6

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_6
    sget-object v6, Lz0/w;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 87
    .line 88
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 89
    .line 90
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-static {v5, p3, p4, v2, v6}, Lz0/w;->b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;ILjava/util/LinkedHashSet;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-nez v5, :cond_8

    .line 101
    .line 102
    sget-boolean v5, Lz0/i;->a:Z

    .line 103
    .line 104
    invoke-static {v6}, Lz0/g;->d(Ljava/util/Collection;)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-nez v5, :cond_7

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_7
    invoke-interface {p2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    add-int/2addr v4, v1

    .line 115
    :cond_8
    :goto_1
    add-int/2addr v3, v0

    .line 116
    goto :goto_0

    .line 117
    :cond_9
    if-lez v4, :cond_a

    .line 118
    .line 119
    return v1

    .line 120
    :cond_a
    :goto_2
    return v2
.end method

.method public final m(Ljava/lang/Object;ILjava/util/Set;)Landroid/app/Activity;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_2

    .line 5
    .line 6
    :cond_0
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_1
    instance-of v1, p1, Landroid/app/Activity;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    check-cast p1, Landroid/app/Activity;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_2
    instance-of v1, p1, Landroid/view/View;

    .line 22
    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    check-cast p1, Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lr0/Y0;->l(Landroid/content/Context;)Landroid/app/Activity;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_3
    instance-of v1, p1, Landroid/content/Context;

    .line 37
    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    check-cast p1, Landroid/content/Context;

    .line 41
    .line 42
    invoke-static {p1}, Lr0/Y0;->l(Landroid/content/Context;)Landroid/app/Activity;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_4
    const/4 v1, 0x2

    .line 48
    if-ge p2, v1, :cond_9

    .line 49
    .line 50
    const-string v1, "java."

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-static {p1, v1, v2}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_9

    .line 58
    .line 59
    const-string v1, "android."

    .line 60
    .line 61
    invoke-static {p1, v1, v2}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {p0, v1}, Lr0/Y0;->c(Ljava/lang/Class;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const/16 v2, 0x20

    .line 77
    .line 78
    invoke-static {v1, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_6
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_9

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Ljava/lang/reflect/Field;

    .line 97
    .line 98
    :try_start_0
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    goto :goto_1

    .line 103
    :catchall_0
    move-exception v2

    .line 104
    new-instance v3, LE0/d;

    .line 105
    .line 106
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    move-object v2, v3

    .line 110
    :goto_1
    nop

    .line 111
    instance-of v3, v2, LE0/d;

    .line 112
    .line 113
    if-eqz v3, :cond_7

    .line 114
    .line 115
    move-object v2, v0

    .line 116
    :cond_7
    if-nez v2, :cond_8

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_8
    add-int/lit8 v3, p2, 0x1

    .line 120
    .line 121
    invoke-virtual {p0, v2, v3, p3}, Lr0/Y0;->m(Ljava/lang/Object;ILjava/util/Set;)Landroid/app/Activity;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    return-object v2

    .line 128
    :cond_9
    :goto_2
    return-object v0
.end method

.method public final o(Ljava/lang/Object;Ljava/util/LinkedHashSet;)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Lr0/Y0;->r:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    const/4 v3, 0x0

    .line 6
    if-ge v2, v1, :cond_3

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    invoke-static {p1, v4}, Lr0/Y0;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    invoke-static {v4}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :cond_0
    if-eqz v3, :cond_2

    .line 27
    .line 28
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    return-object v3

    .line 42
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, v0}, Lr0/Y0;->c(Ljava/lang/Class;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_9

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/reflect/Field;

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    instance-of v2, v1, Ljava/lang/String;

    .line 78
    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :catchall_0
    move-exception v1

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move-object v1, v3

    .line 87
    goto :goto_4

    .line 88
    :goto_3
    new-instance v2, LE0/d;

    .line 89
    .line 90
    invoke-direct {v2, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    move-object v1, v2

    .line 94
    :goto_4
    nop

    .line 95
    instance-of v2, v1, LE0/d;

    .line 96
    .line 97
    if-eqz v2, :cond_6

    .line 98
    .line 99
    move-object v1, v3

    .line 100
    :cond_6
    check-cast v1, Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v1, :cond_7

    .line 103
    .line 104
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    goto :goto_5

    .line 113
    :cond_7
    move-object v1, v3

    .line 114
    :goto_5
    if-eqz v1, :cond_4

    .line 115
    .line 116
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_8

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_8
    invoke-interface {p2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_4

    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_9
    return-object v3
.end method

.method public final q(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    invoke-static/range {p1 .. p4}, Lz0/w;->i(Ljava/lang/Object;Ljava/util/Set;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v6, v1, Lr0/Y0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lr0/Q0;

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    if-nez v0, :cond_b

    .line 32
    .line 33
    invoke-static {v2, v4, v5}, Lr0/Y0;->K(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    new-instance v8, Lr0/Q0;

    .line 40
    .line 41
    invoke-direct {v8, v7, v7, v0}, Lr0/Q0;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, Lr0/Y0;->v(Ljava/lang/Class;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    :cond_2
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v9, v0

    .line 69
    check-cast v9, Ljava/lang/reflect/Method;

    .line 70
    .line 71
    :try_start_0
    invoke-virtual {v9, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    new-instance v10, LE0/d;

    .line 78
    .line 79
    invoke-direct {v10, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    move-object v0, v10

    .line 83
    :goto_1
    nop

    .line 84
    instance-of v10, v0, LE0/d;

    .line 85
    .line 86
    if-eqz v10, :cond_3

    .line 87
    .line 88
    move-object v0, v7

    .line 89
    :cond_3
    if-nez v0, :cond_4

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_4
    invoke-static {v0, v4, v5}, Lr0/Y0;->K(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    new-instance v8, Lr0/Q0;

    .line 99
    .line 100
    invoke-direct {v8, v9, v7, v0}, Lr0/Q0;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v1, v0}, Lr0/Y0;->c(Ljava/lang/Class;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    :cond_6
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_9

    .line 121
    .line 122
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    move-object v9, v0

    .line 127
    check-cast v9, Ljava/lang/reflect/Field;

    .line 128
    .line 129
    :try_start_1
    invoke-virtual {v9, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 133
    goto :goto_3

    .line 134
    :catchall_1
    move-exception v0

    .line 135
    new-instance v10, LE0/d;

    .line 136
    .line 137
    invoke-direct {v10, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    move-object v0, v10

    .line 141
    :goto_3
    nop

    .line 142
    instance-of v10, v0, LE0/d;

    .line 143
    .line 144
    if-eqz v10, :cond_7

    .line 145
    .line 146
    move-object v0, v7

    .line 147
    :cond_7
    if-nez v0, :cond_8

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_8
    invoke-static {v0, v4, v5}, Lr0/Y0;->K(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-eqz v0, :cond_6

    .line 155
    .line 156
    new-instance v8, Lr0/Q0;

    .line 157
    .line 158
    invoke-direct {v8, v7, v9, v0}, Lr0/Q0;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_9
    move-object v8, v7

    .line 163
    :goto_4
    if-eqz v8, :cond_a

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v6, v0, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-object v0, v8

    .line 173
    goto :goto_5

    .line 174
    :cond_a
    move-object v0, v7

    .line 175
    :goto_5
    if-nez v0, :cond_b

    .line 176
    .line 177
    move-object v0, v7

    .line 178
    goto :goto_9

    .line 179
    :cond_b
    :try_start_2
    iget-object v6, v0, Lr0/Q0;->a:Ljava/lang/reflect/Method;

    .line 180
    .line 181
    if-eqz v6, :cond_c

    .line 182
    .line 183
    invoke-virtual {v6, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    goto :goto_6

    .line 188
    :cond_c
    iget-object v6, v0, Lr0/Q0;->b:Ljava/lang/reflect/Field;

    .line 189
    .line 190
    if-eqz v6, :cond_d

    .line 191
    .line 192
    invoke-virtual {v6, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    goto :goto_6

    .line 197
    :cond_d
    move-object v6, v2

    .line 198
    :goto_6
    if-nez v6, :cond_f

    .line 199
    .line 200
    :cond_e
    move-object v0, v7

    .line 201
    goto :goto_8

    .line 202
    :cond_f
    iget-object v0, v0, Lr0/Q0;->c:Ljava/lang/reflect/Field;

    .line 203
    .line 204
    invoke-virtual {v0, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    instance-of v6, v0, Ljava/lang/String;

    .line 209
    .line 210
    if-eqz v6, :cond_10

    .line 211
    .line 212
    check-cast v0, Ljava/lang/String;

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_10
    move-object v0, v7

    .line 216
    :goto_7
    if-eqz v0, :cond_e

    .line 217
    .line 218
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 226
    goto :goto_8

    .line 227
    :catchall_2
    move-exception v0

    .line 228
    new-instance v6, LE0/d;

    .line 229
    .line 230
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    move-object v0, v6

    .line 234
    :goto_8
    nop

    .line 235
    instance-of v6, v0, LE0/d;

    .line 236
    .line 237
    if-eqz v6, :cond_11

    .line 238
    .line 239
    move-object v0, v7

    .line 240
    :cond_11
    check-cast v0, Ljava/lang/String;

    .line 241
    .line 242
    :goto_9
    if-eqz v0, :cond_14

    .line 243
    .line 244
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    if-eqz v6, :cond_12

    .line 249
    .line 250
    goto :goto_a

    .line 251
    :cond_12
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_13

    .line 256
    .line 257
    move-object v7, v0

    .line 258
    :cond_13
    return-object v7

    .line 259
    :cond_14
    :goto_a
    const-string v6, "com.tencent.mm.plugin.sns."

    .line 260
    .line 261
    const/4 v8, 0x0

    .line 262
    invoke-static {v2, v6, v8}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_17

    .line 267
    .line 268
    invoke-virtual/range {p0 .. p2}, Lr0/Y0;->o(Ljava/lang/Object;Ljava/util/LinkedHashSet;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    if-eqz v0, :cond_15

    .line 273
    .line 274
    return-object v0

    .line 275
    :cond_15
    invoke-static {v2, v3, v5}, Lr0/Y0;->j(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-eqz v0, :cond_16

    .line 280
    .line 281
    return-object v0

    .line 282
    :cond_16
    invoke-virtual/range {p0 .. p4}, Lr0/Y0;->i(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    if-eqz v0, :cond_17

    .line 287
    .line 288
    return-object v0

    .line 289
    :cond_17
    iget-object v9, v1, Lr0/Y0;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 290
    .line 291
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    invoke-virtual {v9, v10}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    sget-object v11, Lr0/Y0;->s:[Ljava/lang/String;

    .line 300
    .line 301
    if-nez v0, :cond_28

    .line 302
    .line 303
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v1, v0}, Lr0/Y0;->v(Ljava/lang/Class;)Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    new-instance v12, Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object v13

    .line 320
    :goto_b
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_26

    .line 325
    .line 326
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v14

    .line 330
    move-object v0, v14

    .line 331
    check-cast v0, Ljava/lang/reflect/Method;

    .line 332
    .line 333
    :try_start_3
    invoke-virtual {v0, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 337
    goto :goto_c

    .line 338
    :catchall_3
    move-exception v0

    .line 339
    new-instance v15, LE0/d;

    .line 340
    .line 341
    invoke-direct {v15, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    move-object v0, v15

    .line 345
    :goto_c
    nop

    .line 346
    instance-of v15, v0, LE0/d;

    .line 347
    .line 348
    if-eqz v15, :cond_18

    .line 349
    .line 350
    move-object v15, v7

    .line 351
    goto :goto_d

    .line 352
    :cond_18
    move-object v15, v0

    .line 353
    :goto_d
    if-nez v15, :cond_19

    .line 354
    .line 355
    goto/16 :goto_11

    .line 356
    .line 357
    :cond_19
    if-eqz v4, :cond_1a

    .line 358
    .line 359
    invoke-virtual {v4, v15}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_1a

    .line 364
    .line 365
    goto/16 :goto_10

    .line 366
    .line 367
    :cond_1a
    if-eqz v5, :cond_1b

    .line 368
    .line 369
    invoke-virtual {v5, v15}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-eqz v0, :cond_1b

    .line 374
    .line 375
    goto :goto_10

    .line 376
    :cond_1b
    invoke-static {v15, v6, v8}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-eqz v0, :cond_1c

    .line 381
    .line 382
    goto :goto_10

    .line 383
    :cond_1c
    invoke-static {v15, v11}, Lr0/Y0;->w(Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-eqz v0, :cond_1d

    .line 388
    .line 389
    goto :goto_10

    .line 390
    :cond_1d
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v1, v0}, Lr0/Y0;->c(Ljava/lang/Class;)Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 399
    .line 400
    .line 401
    move-result v16

    .line 402
    if-eqz v16, :cond_1e

    .line 403
    .line 404
    goto :goto_11

    .line 405
    :cond_1e
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object v16

    .line 409
    :goto_e
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_24

    .line 414
    .line 415
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    check-cast v0, Ljava/lang/reflect/Field;

    .line 420
    .line 421
    :try_start_4
    invoke-virtual {v0, v15}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 425
    goto :goto_f

    .line 426
    :catchall_4
    move-exception v0

    .line 427
    new-instance v8, LE0/d;

    .line 428
    .line 429
    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 430
    .line 431
    .line 432
    move-object v0, v8

    .line 433
    :goto_f
    nop

    .line 434
    instance-of v8, v0, LE0/d;

    .line 435
    .line 436
    if-eqz v8, :cond_1f

    .line 437
    .line 438
    move-object v0, v7

    .line 439
    :cond_1f
    if-nez v0, :cond_20

    .line 440
    .line 441
    goto :goto_12

    .line 442
    :cond_20
    if-eqz v5, :cond_21

    .line 443
    .line 444
    invoke-virtual {v5, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v8

    .line 448
    if-nez v8, :cond_23

    .line 449
    .line 450
    :cond_21
    if-eqz v4, :cond_22

    .line 451
    .line 452
    invoke-virtual {v4, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v8

    .line 456
    if-nez v8, :cond_23

    .line 457
    .line 458
    :cond_22
    invoke-static {v0, v11}, Lr0/Y0;->w(Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_25

    .line 463
    .line 464
    :cond_23
    :goto_10
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    :cond_24
    :goto_11
    const/4 v8, 0x0

    .line 468
    goto/16 :goto_b

    .line 469
    .line 470
    :cond_25
    :goto_12
    const/4 v8, 0x0

    .line 471
    goto :goto_e

    .line 472
    :cond_26
    const/4 v0, 0x2

    .line 473
    invoke-static {v12, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {v9, v10, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    if-nez v8, :cond_27

    .line 482
    .line 483
    goto :goto_13

    .line 484
    :cond_27
    move-object v0, v8

    .line 485
    :cond_28
    :goto_13
    check-cast v0, Ljava/util/List;

    .line 486
    .line 487
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 488
    .line 489
    .line 490
    move-result-object v8

    .line 491
    :cond_29
    :goto_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    const/4 v9, 0x1

    .line 496
    if-eqz v0, :cond_34

    .line 497
    .line 498
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    check-cast v0, Ljava/lang/reflect/Method;

    .line 503
    .line 504
    :try_start_5
    invoke-virtual {v0, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 508
    goto :goto_15

    .line 509
    :catchall_5
    move-exception v0

    .line 510
    new-instance v10, LE0/d;

    .line 511
    .line 512
    invoke-direct {v10, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 513
    .line 514
    .line 515
    move-object v0, v10

    .line 516
    :goto_15
    nop

    .line 517
    instance-of v10, v0, LE0/d;

    .line 518
    .line 519
    if-eqz v10, :cond_2a

    .line 520
    .line 521
    move-object v10, v7

    .line 522
    goto :goto_16

    .line 523
    :cond_2a
    move-object v10, v0

    .line 524
    :goto_16
    if-nez v10, :cond_2b

    .line 525
    .line 526
    goto :goto_14

    .line 527
    :cond_2b
    invoke-static {v10, v3, v5}, Lr0/Y0;->j(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    if-eqz v0, :cond_2c

    .line 532
    .line 533
    goto :goto_19

    .line 534
    :cond_2c
    invoke-virtual {v1, v10, v3, v4, v5}, Lr0/Y0;->i(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    if-eqz v0, :cond_2d

    .line 539
    .line 540
    goto :goto_19

    .line 541
    :cond_2d
    invoke-static {v10, v11}, Lr0/Y0;->w(Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    if-eqz v0, :cond_2e

    .line 546
    .line 547
    invoke-virtual {v1, v10, v3}, Lr0/Y0;->o(Ljava/lang/Object;Ljava/util/LinkedHashSet;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    if-eqz v0, :cond_2e

    .line 552
    .line 553
    goto :goto_19

    .line 554
    :cond_2e
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {v1, v0}, Lr0/Y0;->c(Ljava/lang/Class;)Ljava/util/List;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 563
    .line 564
    .line 565
    move-result-object v12

    .line 566
    :cond_2f
    :goto_17
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    if-eqz v0, :cond_33

    .line 571
    .line 572
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    check-cast v0, Ljava/lang/reflect/Field;

    .line 577
    .line 578
    :try_start_6
    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v10}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 585
    goto :goto_18

    .line 586
    :catchall_6
    move-exception v0

    .line 587
    new-instance v13, LE0/d;

    .line 588
    .line 589
    invoke-direct {v13, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 590
    .line 591
    .line 592
    move-object v0, v13

    .line 593
    :goto_18
    nop

    .line 594
    instance-of v13, v0, LE0/d;

    .line 595
    .line 596
    if-eqz v13, :cond_30

    .line 597
    .line 598
    move-object v0, v7

    .line 599
    :cond_30
    if-nez v0, :cond_31

    .line 600
    .line 601
    goto :goto_17

    .line 602
    :cond_31
    invoke-static {v0, v3, v5}, Lr0/Y0;->j(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v13

    .line 606
    if-eqz v13, :cond_32

    .line 607
    .line 608
    move-object v0, v13

    .line 609
    goto :goto_19

    .line 610
    :cond_32
    invoke-static {v0, v11}, Lr0/Y0;->w(Ljava/lang/Object;[Ljava/lang/String;)Z

    .line 611
    .line 612
    .line 613
    move-result v13

    .line 614
    if-eqz v13, :cond_2f

    .line 615
    .line 616
    invoke-virtual {v1, v0, v3}, Lr0/Y0;->o(Ljava/lang/Object;Ljava/util/LinkedHashSet;)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    if-eqz v0, :cond_2f

    .line 621
    .line 622
    goto :goto_19

    .line 623
    :cond_33
    move-object v0, v7

    .line 624
    :goto_19
    if-eqz v0, :cond_29

    .line 625
    .line 626
    goto :goto_1a

    .line 627
    :cond_34
    move-object v0, v7

    .line 628
    :goto_1a
    if-eqz v0, :cond_35

    .line 629
    .line 630
    return-object v0

    .line 631
    :cond_35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    iget-object v8, v1, Lr0/Y0;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 636
    .line 637
    invoke-virtual {v8, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v10

    .line 641
    if-nez v10, :cond_3c

    .line 642
    .line 643
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 644
    .line 645
    .line 646
    move-result-object v10

    .line 647
    const-string v11, "getDeclaredMethods(...)"

    .line 648
    .line 649
    invoke-static {v10, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    new-instance v11, Ljava/util/ArrayList;

    .line 653
    .line 654
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 655
    .line 656
    .line 657
    array-length v12, v10

    .line 658
    const/4 v13, 0x0

    .line 659
    :goto_1b
    if-ge v13, v12, :cond_39

    .line 660
    .line 661
    aget-object v14, v10, v13

    .line 662
    .line 663
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 664
    .line 665
    .line 666
    move-result-object v15

    .line 667
    const-string v7, "getParameterTypes(...)"

    .line 668
    .line 669
    invoke-static {v15, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    array-length v7, v15

    .line 673
    if-nez v7, :cond_38

    .line 674
    .line 675
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    move-result-object v7

    .line 679
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 680
    .line 681
    .line 682
    move-result v7

    .line 683
    if-nez v7, :cond_38

    .line 684
    .line 685
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    move-result-object v7

    .line 689
    sget-object v15, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 690
    .line 691
    invoke-static {v7, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v7

    .line 695
    if-nez v7, :cond_38

    .line 696
    .line 697
    if-eqz v5, :cond_36

    .line 698
    .line 699
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    move-result-object v7

    .line 703
    invoke-static {v7, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v7

    .line 707
    if-nez v7, :cond_37

    .line 708
    .line 709
    :cond_36
    if-eqz v4, :cond_38

    .line 710
    .line 711
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    move-result-object v7

    .line 715
    invoke-static {v7, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v7

    .line 719
    if-eqz v7, :cond_38

    .line 720
    .line 721
    :cond_37
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    :cond_38
    add-int/lit8 v13, v13, 0x1

    .line 725
    .line 726
    const/4 v7, 0x0

    .line 727
    goto :goto_1b

    .line 728
    :cond_39
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 729
    .line 730
    .line 731
    move-result-object v7

    .line 732
    :goto_1c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 733
    .line 734
    .line 735
    move-result v10

    .line 736
    if-eqz v10, :cond_3a

    .line 737
    .line 738
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v10

    .line 742
    check-cast v10, Ljava/lang/reflect/Method;

    .line 743
    .line 744
    invoke-virtual {v10, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 745
    .line 746
    .line 747
    goto :goto_1c

    .line 748
    :cond_3a
    invoke-virtual {v8, v0, v11}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    if-nez v0, :cond_3b

    .line 753
    .line 754
    move-object v10, v11

    .line 755
    goto :goto_1d

    .line 756
    :cond_3b
    move-object v10, v0

    .line 757
    :cond_3c
    :goto_1d
    check-cast v10, Ljava/util/List;

    .line 758
    .line 759
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 760
    .line 761
    .line 762
    move-result-object v7

    .line 763
    :cond_3d
    :goto_1e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    if-eqz v0, :cond_42

    .line 768
    .line 769
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    check-cast v0, Ljava/lang/reflect/Method;

    .line 774
    .line 775
    :try_start_7
    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 776
    .line 777
    .line 778
    const/4 v8, 0x0

    .line 779
    invoke-virtual {v0, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 783
    move-object v8, v0

    .line 784
    goto :goto_1f

    .line 785
    :catchall_7
    move-exception v0

    .line 786
    new-instance v8, LE0/d;

    .line 787
    .line 788
    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 789
    .line 790
    .line 791
    :goto_1f
    instance-of v0, v8, LE0/d;

    .line 792
    .line 793
    if-eqz v0, :cond_3e

    .line 794
    .line 795
    const/4 v8, 0x0

    .line 796
    :cond_3e
    if-nez v8, :cond_3f

    .line 797
    .line 798
    goto :goto_1e

    .line 799
    :cond_3f
    invoke-static {v8, v3, v5}, Lr0/Y0;->j(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;)Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    if-eqz v0, :cond_40

    .line 804
    .line 805
    return-object v0

    .line 806
    :cond_40
    invoke-virtual {v1, v8, v3, v4, v5}, Lr0/Y0;->i(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    if-eqz v0, :cond_41

    .line 811
    .line 812
    return-object v0

    .line 813
    :cond_41
    invoke-virtual {v1, v8, v3}, Lr0/Y0;->o(Ljava/lang/Object;Ljava/util/LinkedHashSet;)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    if-eqz v0, :cond_3d

    .line 818
    .line 819
    return-object v0

    .line 820
    :cond_42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    invoke-virtual {v1, v0}, Lr0/Y0;->c(Ljava/lang/Class;)Ljava/util/List;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 829
    .line 830
    .line 831
    move-result-object v7

    .line 832
    :cond_43
    :goto_20
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 833
    .line 834
    .line 835
    move-result v0

    .line 836
    if-eqz v0, :cond_48

    .line 837
    .line 838
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    check-cast v0, Ljava/lang/reflect/Field;

    .line 843
    .line 844
    :try_start_8
    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 851
    move-object v8, v0

    .line 852
    goto :goto_21

    .line 853
    :catchall_8
    move-exception v0

    .line 854
    new-instance v8, LE0/d;

    .line 855
    .line 856
    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 857
    .line 858
    .line 859
    :goto_21
    instance-of v0, v8, LE0/d;

    .line 860
    .line 861
    if-eqz v0, :cond_44

    .line 862
    .line 863
    const/4 v8, 0x0

    .line 864
    :cond_44
    if-nez v8, :cond_45

    .line 865
    .line 866
    const/4 v10, 0x0

    .line 867
    goto :goto_20

    .line 868
    :cond_45
    invoke-static {v8, v3, v5}, Lr0/Y0;->j(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;)Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    if-eqz v0, :cond_46

    .line 873
    .line 874
    return-object v0

    .line 875
    :cond_46
    invoke-virtual {v1, v8, v3, v4, v5}, Lr0/Y0;->i(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    if-eqz v0, :cond_47

    .line 880
    .line 881
    return-object v0

    .line 882
    :cond_47
    const/4 v10, 0x0

    .line 883
    invoke-static {v8, v6, v10}, LL/d;->p(Ljava/lang/Object;Ljava/lang/String;Z)Z

    .line 884
    .line 885
    .line 886
    move-result v0

    .line 887
    if-eqz v0, :cond_43

    .line 888
    .line 889
    invoke-virtual {v1, v8, v3}, Lr0/Y0;->o(Ljava/lang/Object;Ljava/util/LinkedHashSet;)Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    if-eqz v0, :cond_43

    .line 894
    .line 895
    return-object v0

    .line 896
    :cond_48
    const/16 v16, 0x0

    .line 897
    .line 898
    return-object v16
.end method

.method public final s(Landroid/app/Activity;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getDeclaredMethods(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    array-length v2, v0

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v2, :cond_1

    .line 22
    .line 23
    aget-object v4, v0, v3

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const-string v6, "getParameterTypes(...)"

    .line 30
    .line 31
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    array-length v5, v5

    .line 35
    if-nez v5, :cond_0

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const-string v6, "getReturnType(...)"

    .line 42
    .line 43
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v5}, Lr0/Y0;->A(Ljava/lang/Class;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :catchall_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/4 v2, 0x1

    .line 67
    const/4 v3, 0x0

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Ljava/lang/reflect/Method;

    .line 75
    .line 76
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    return-object p1

    .line 84
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p0, v0}, Lr0/Y0;->c(Ljava/lang/Class;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Ljava/lang/reflect/Field;

    .line 107
    .line 108
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    goto :goto_1

    .line 116
    :catchall_1
    move-exception v1

    .line 117
    new-instance v4, LE0/d;

    .line 118
    .line 119
    invoke-direct {v4, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    move-object v1, v4

    .line 123
    :goto_1
    nop

    .line 124
    instance-of v4, v1, LE0/d;

    .line 125
    .line 126
    if-eqz v4, :cond_4

    .line 127
    .line 128
    move-object v1, v3

    .line 129
    :cond_4
    if-eqz v1, :cond_3

    .line 130
    .line 131
    invoke-virtual {p0, v1}, Lr0/Y0;->B(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_3

    .line 136
    .line 137
    return-object v1

    .line 138
    :cond_5
    return-object v3
.end method

.method public final u()Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/Y0;->n:LA0/W;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LA0/W;->c:Ljava/util/List;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    sget-object v0, LF0/s;->a:LF0/s;

    .line 12
    .line 13
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v3, v2

    .line 33
    check-cast v3, Ljava/lang/String;

    .line 34
    .line 35
    const-string v4, "CommentDetail"

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    invoke-static {v3, v4, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const-string v0, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"

    .line 49
    .line 50
    invoke-static {v1, v0}, LF0/k;->n0(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method

.method public final v(Ljava/lang/Class;)Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, Lr0/Y0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getDeclaredMethods(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    array-length v3, v1

    .line 24
    const/4 v4, 0x0

    .line 25
    :goto_0
    if-ge v4, v3, :cond_1

    .line 26
    .line 27
    aget-object v5, v1, v4

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const-string v7, "getParameterTypes(...)"

    .line 34
    .line 35
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    array-length v6, v6

    .line 39
    if-nez v6, :cond_0

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-nez v6, :cond_0

    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-nez v6, :cond_0

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    const-class v7, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-nez v6, :cond_0

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    const-string v7, "java.lang.Class"

    .line 84
    .line 85
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-nez v6, :cond_0

    .line 90
    .line 91
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_2

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Ljava/lang/reflect/Method;

    .line 112
    .line 113
    const/4 v4, 0x1

    .line 114
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-nez p1, :cond_3

    .line 123
    .line 124
    move-object v1, v2

    .line 125
    goto :goto_2

    .line 126
    :cond_3
    move-object v1, p1

    .line 127
    :cond_4
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 128
    .line 129
    return-object v1
.end method

.method public final x(Ljava/lang/Class;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "hide-self-sns-album-adapter-"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "getDeclaredMethods(...)"

    .line 25
    .line 26
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    array-length v2, p1

    .line 35
    const/4 v3, 0x0

    .line 36
    :goto_0
    if-ge v3, v2, :cond_2

    .line 37
    .line 38
    aget-object v4, p1, v3

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    const-string v6, "getCount"

    .line 45
    .line 46
    invoke-static {v5, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const-string v6, "getParameterTypes(...)"

    .line 57
    .line 58
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    array-length v5, v5

    .line 62
    if-nez v5, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/reflect/Method;

    .line 85
    .line 86
    const/4 v2, 0x1

    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 88
    .line 89
    .line 90
    new-instance v2, Lr0/R0;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {v2, p0, v3}, Lr0/R0;-><init>(Lr0/Y0;I)V

    .line 94
    .line 95
    .line 96
    invoke-static {v1, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    sget-object p1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final y(Landroid/content/Context;LA0/X;ZLjava/lang/Class;Ljava/lang/Class;)V
    .locals 17

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    iget-object v1, v0, LA0/X;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 10
    .line 11
    invoke-interface {v3, v2, v1}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v0, LA0/X;->a:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const-string v0, "self sns menu class missing"

    .line 20
    .line 21
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v3, "getDeclaredMethods(...)"

    .line 34
    .line 35
    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    array-length v3, v1

    .line 39
    const/4 v4, 0x0

    .line 40
    :goto_0
    iget-object v5, v0, LA0/X;->c:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v6, v0, LA0/X;->b:Ljava/lang/String;

    .line 43
    .line 44
    if-ge v4, v3, :cond_3

    .line 45
    .line 46
    aget-object v7, v1, v4

    .line 47
    .line 48
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-static {v8, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_1

    .line 57
    .line 58
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    const-string v9, "getParameterTypes(...)"

    .line 63
    .line 64
    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    new-instance v9, LC/d;

    .line 68
    .line 69
    const/4 v10, 0x5

    .line 70
    move-object/from16 v13, p0

    .line 71
    .line 72
    invoke-direct {v9, v10, v13}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const-string v10, ""

    .line 76
    .line 77
    const/16 v11, 0x18

    .line 78
    .line 79
    invoke-static {v8, v10, v9, v11}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    const-string v10, "getReturnType(...)"

    .line 88
    .line 89
    invoke-static {v9, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v9}, Lr0/Y0;->N(Ljava/lang/Class;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    new-instance v10, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-static {v8, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_2

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    move-object/from16 v13, p0

    .line 119
    .line 120
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_3
    move-object/from16 v13, p0

    .line 124
    .line 125
    const/4 v7, 0x0

    .line 126
    :goto_1
    if-nez v7, :cond_4

    .line 127
    .line 128
    const-string v0, "self sns menu method missing"

    .line 129
    .line 130
    filled-new-array {v0, v2, v6, v5}, [Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_4
    const-string v0, "select"

    .line 139
    .line 140
    const-string v1, "create"

    .line 141
    .line 142
    if-eqz p3, :cond_5

    .line 143
    .line 144
    move-object v3, v1

    .line 145
    goto :goto_2

    .line 146
    :cond_5
    move-object v3, v0

    .line 147
    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v8, "hide-self-sns-native-menu-"

    .line 150
    .line 151
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v3, "-"

    .line 158
    .line 159
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    sget-object v3, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 182
    .line 183
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-nez v2, :cond_6

    .line 188
    .line 189
    return-void

    .line 190
    :cond_6
    const/4 v2, 0x1

    .line 191
    invoke-virtual {v7, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 192
    .line 193
    .line 194
    if-eqz p3, :cond_7

    .line 195
    .line 196
    move-object v0, v1

    .line 197
    :cond_7
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    const-string v2, "self sns menu hook installed"

    .line 202
    .line 203
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    new-instance v11, Lr0/S0;

    .line 211
    .line 212
    move/from16 v12, p3

    .line 213
    .line 214
    move-object/from16 v14, p4

    .line 215
    .line 216
    move-object/from16 v15, p5

    .line 217
    .line 218
    move-object/from16 v16, v7

    .line 219
    .line 220
    invoke-direct/range {v11 .. v16}, Lr0/S0;-><init>(ZLr0/Y0;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v7, v11}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 224
    .line 225
    .line 226
    return-void
.end method
