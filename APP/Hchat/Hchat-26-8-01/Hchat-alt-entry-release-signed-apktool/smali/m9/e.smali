.class public final Lm9/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final h:Ljava/util/List;

.field public static final i:Ljava/util/List;

.field public static final j:Ljava/util/List;

.field public static final k:Ljava/util/HashSet;

.field public static final l:Ljava/util/HashSet;


# instance fields
.field public final a:Lr8/g;

.field public final b:Lia/t;

.field public final c:Landroid/os/Handler;

.field public final d:Ljava/lang/ThreadLocal;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public f:Ljava/lang/Object;

.field public volatile g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-string v10, "field_designerID"

    .line 2
    .line 3
    const-string v11, "field_thumbUrl"

    .line 4
    .line 5
    const-string v0, "field_md5"

    .line 6
    .line 7
    const-string v1, "field_svrid"

    .line 8
    .line 9
    const-string v2, "field_catalog"

    .line 10
    .line 11
    const-string v3, "field_size"

    .line 12
    .line 13
    const-string v4, "field_name"

    .line 14
    .line 15
    const-string v5, "field_content"

    .line 16
    .line 17
    const-string v6, "field_reserved3"

    .line 18
    .line 19
    const-string v7, "field_reserved4"

    .line 20
    .line 21
    const-string v8, "field_groupId"

    .line 22
    .line 23
    const-string v9, "field_source"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lm9/e;->h:Ljava/util/List;

    .line 34
    .line 35
    new-instance v1, Lm9/b;

    .line 36
    .line 37
    const/16 v3, 0xade

    .line 38
    .line 39
    const-string v6, "jsb_j.png"

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    const-string v4, "\u526a\u5200"

    .line 43
    .line 44
    const-string v5, "514914788fc461e7205bf0b6ba496c49"

    .line 45
    .line 46
    invoke-direct/range {v1 .. v6}, Lm9/b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Lm9/b;

    .line 50
    .line 51
    const/16 v4, 0x8e6

    .line 52
    .line 53
    const-string v7, "jsb_s.png"

    .line 54
    .line 55
    const/4 v3, 0x2

    .line 56
    const-string v5, "\u77f3\u5934"

    .line 57
    .line 58
    const-string v6, "f790e342a02e0f99d34b316547f9aeab"

    .line 59
    .line 60
    invoke-direct/range {v2 .. v7}, Lm9/b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Lm9/b;

    .line 64
    .line 65
    const/16 v5, 0xe1c

    .line 66
    .line 67
    const-string v8, "jsb_b.png"

    .line 68
    .line 69
    const/4 v4, 0x3

    .line 70
    const-string v6, "\u5e03"

    .line 71
    .line 72
    const-string v7, "091577322c40c05aa3dd701da29d6423"

    .line 73
    .line 74
    invoke-direct/range {v3 .. v8}, Lm9/b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    filled-new-array {v1, v2, v3}, [Lm9/b;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lm9/e;->i:Ljava/util/List;

    .line 86
    .line 87
    new-instance v1, Lm9/b;

    .line 88
    .line 89
    const/16 v3, 0x926

    .line 90
    .line 91
    const-string v6, "dice_1.png"

    .line 92
    .line 93
    const/4 v2, 0x1

    .line 94
    const-string v4, "1 \u70b9"

    .line 95
    .line 96
    const-string v5, "da1c289d4e363f3ce1ff36538903b92f"

    .line 97
    .line 98
    invoke-direct/range {v1 .. v6}, Lm9/b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    new-instance v2, Lm9/b;

    .line 102
    .line 103
    const/16 v4, 0x8e6

    .line 104
    .line 105
    const-string v7, "dice_2.png"

    .line 106
    .line 107
    const/4 v3, 0x2

    .line 108
    const-string v5, "2 \u70b9"

    .line 109
    .line 110
    const-string v6, "9e3f303561566dc9342a3ea41e6552a6"

    .line 111
    .line 112
    invoke-direct/range {v2 .. v7}, Lm9/b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    new-instance v3, Lm9/b;

    .line 116
    .line 117
    const/16 v5, 0x964

    .line 118
    .line 119
    const-string v8, "dice_3.png"

    .line 120
    .line 121
    const/4 v4, 0x3

    .line 122
    const-string v6, "3 \u70b9"

    .line 123
    .line 124
    const-string v7, "dbcc51db2765c1d0106290bae6326fc4"

    .line 125
    .line 126
    invoke-direct/range {v3 .. v8}, Lm9/b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    new-instance v4, Lm9/b;

    .line 130
    .line 131
    const/16 v6, 0x976

    .line 132
    .line 133
    const-string v9, "dice_4.png"

    .line 134
    .line 135
    const/4 v5, 0x4

    .line 136
    const-string v7, "4 \u70b9"

    .line 137
    .line 138
    const-string v8, "9a21c57defc4974ab5b7c842e3232671"

    .line 139
    .line 140
    invoke-direct/range {v4 .. v9}, Lm9/b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    new-instance v5, Lm9/b;

    .line 144
    .line 145
    const/16 v7, 0x9ea

    .line 146
    .line 147
    const-string v10, "dice_5.png"

    .line 148
    .line 149
    const/4 v6, 0x5

    .line 150
    const-string v8, "5 \u70b9"

    .line 151
    .line 152
    const-string v9, "3a8e16d650f7e66ba5516b2780512830"

    .line 153
    .line 154
    invoke-direct/range {v5 .. v10}, Lm9/b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    new-instance v6, Lm9/b;

    .line 158
    .line 159
    const/16 v8, 0x9e8

    .line 160
    .line 161
    const-string v11, "dice_6.png"

    .line 162
    .line 163
    const/4 v7, 0x6

    .line 164
    const-string v9, "6 \u70b9"

    .line 165
    .line 166
    const-string v10, "5ba8e9694b853df10b9f2a77b312cc09"

    .line 167
    .line 168
    invoke-direct/range {v6 .. v11}, Lm9/b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    filled-new-array/range {v1 .. v6}, [Lm9/b;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    sput-object v1, Lm9/e;->j:Ljava/util/List;

    .line 180
    .line 181
    new-instance v1, Ljava/util/HashSet;

    .line 182
    .line 183
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_0

    .line 195
    .line 196
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Lm9/b;

    .line 201
    .line 202
    iget-object v2, v2, Lm9/b;->c:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_0
    sput-object v1, Lm9/e;->k:Ljava/util/HashSet;

    .line 209
    .line 210
    sget-object v0, Lm9/e;->j:Ljava/util/List;

    .line 211
    .line 212
    new-instance v1, Ljava/util/HashSet;

    .line 213
    .line 214
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_1

    .line 226
    .line 227
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    check-cast v2, Lm9/b;

    .line 232
    .line 233
    iget-object v2, v2, Lm9/b;->c:Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_1
    sput-object v1, Lm9/e;->l:Ljava/util/HashSet;

    .line 240
    .line 241
    return-void
.end method

.method public constructor <init>(Lr8/g;Lia/t;)V
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
    iput-object p1, p0, Lm9/e;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lm9/e;->b:Lia/t;

    .line 10
    .line 11
    new-instance p1, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lm9/e;->c:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance p1, Ljava/lang/ThreadLocal;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lm9/e;->d:Ljava/lang/ThreadLocal;

    .line 28
    .line 29
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lm9/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    sget-object p1, Ltf/u;->g:Ltf/u;

    .line 38
    .line 39
    iput-object p1, p0, Lm9/e;->f:Ljava/lang/Object;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm9/c;I)Z
    .locals 21

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    sget-object v4, Lm9/c;->i:Lm9/c;

    .line 11
    .line 12
    if-ne v0, v4, :cond_0

    .line 13
    .line 14
    sget-object v5, Lm9/e;->j:Ljava/util/List;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v5, Lm9/e;->i:Ljava/util/List;

    .line 18
    .line 19
    :goto_0
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v8, 0x1

    .line 29
    if-eqz v6, :cond_3

    .line 30
    .line 31
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    move-object v9, v6

    .line 36
    check-cast v9, Lm9/b;

    .line 37
    .line 38
    iget v9, v9, Lm9/b;->a:I

    .line 39
    .line 40
    if-ne v9, v1, :cond_2

    .line 41
    .line 42
    move v9, v8

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v9, v2

    .line 45
    :goto_1
    if-eqz v9, :cond_1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    move-object v6, v7

    .line 49
    :goto_2
    check-cast v6, Lm9/b;

    .line 50
    .line 51
    if-eqz v6, :cond_7

    .line 52
    .line 53
    if-ne v0, v4, :cond_4

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x3

    .line 56
    .line 57
    :cond_4
    iget-object v4, v6, Lm9/b;->c:Ljava/lang/String;

    .line 58
    .line 59
    new-instance v9, Lsf/e;

    .line 60
    .line 61
    const-string v5, "field_md5"

    .line 62
    .line 63
    invoke-direct {v9, v5, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget v4, v6, Lm9/b;->d:I

    .line 67
    .line 68
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    new-instance v10, Lsf/e;

    .line 73
    .line 74
    const-string v5, "field_size"

    .line 75
    .line 76
    invoke-direct {v10, v5, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget v0, v0, Lm9/c;->g:I

    .line 80
    .line 81
    const-string v4, "\" content=\""

    .line 82
    .line 83
    const-string v5, "\" ></gameext>"

    .line 84
    .line 85
    const-string v11, "<gameext type=\""

    .line 86
    .line 87
    invoke-static {v0, v1, v11, v4, v5}, Leh/a;->k(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v11, Lsf/e;

    .line 92
    .line 93
    const-string v1, "field_content"

    .line 94
    .line 95
    invoke-direct {v11, v1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, v6, Lm9/b;->e:Ljava/lang/String;

    .line 99
    .line 100
    new-instance v12, Lsf/e;

    .line 101
    .line 102
    const-string v1, "field_name"

    .line 103
    .line 104
    invoke-direct {v12, v1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    new-instance v13, Lsf/e;

    .line 108
    .line 109
    const-string v0, "field_svrid"

    .line 110
    .line 111
    const-string v1, ""

    .line 112
    .line 113
    invoke-direct {v13, v0, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    const/16 v0, 0x32

    .line 117
    .line 118
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v14, Lsf/e;

    .line 123
    .line 124
    const-string v1, "field_catalog"

    .line 125
    .line 126
    invoke-direct {v14, v1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    new-instance v15, Lsf/e;

    .line 130
    .line 131
    const-string v0, "field_reserved3"

    .line 132
    .line 133
    invoke-direct {v15, v0, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    new-instance v0, Lsf/e;

    .line 137
    .line 138
    const-string v1, "field_reserved4"

    .line 139
    .line 140
    invoke-direct {v0, v1, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    new-instance v1, Lsf/e;

    .line 144
    .line 145
    const-string v4, "field_groupId"

    .line 146
    .line 147
    const-string v5, "50"

    .line 148
    .line 149
    invoke-direct {v1, v4, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    new-instance v4, Lsf/e;

    .line 153
    .line 154
    const-string v5, "field_source"

    .line 155
    .line 156
    invoke-direct {v4, v5, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    new-instance v3, Lsf/e;

    .line 160
    .line 161
    const-string v5, "field_designerID"

    .line 162
    .line 163
    invoke-direct {v3, v5, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    new-instance v5, Lsf/e;

    .line 167
    .line 168
    const-string v6, "field_thumbUrl"

    .line 169
    .line 170
    invoke-direct {v5, v6, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    move-object/from16 v16, v0

    .line 174
    .line 175
    move-object/from16 v17, v1

    .line 176
    .line 177
    move-object/from16 v19, v3

    .line 178
    .line 179
    move-object/from16 v18, v4

    .line 180
    .line 181
    move-object/from16 v20, v5

    .line 182
    .line 183
    filled-new-array/range {v9 .. v20}, [Lsf/e;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-static {v0}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    :goto_3
    move v1, v8

    .line 200
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_6

    .line 205
    .line 206
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, Ljava/util/Map$Entry;

    .line 211
    .line 212
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    check-cast v4, Ljava/lang/String;

    .line 217
    .line 218
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    move-object/from16 v5, p0

    .line 223
    .line 224
    iget-object v6, v5, Lm9/e;->f:Ljava/lang/Object;

    .line 225
    .line 226
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Ljava/lang/reflect/Field;

    .line 231
    .line 232
    move-object/from16 v6, p1

    .line 233
    .line 234
    invoke-static {v4, v6, v3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_5

    .line 239
    .line 240
    if-eqz v1, :cond_5

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_5
    move v1, v2

    .line 244
    goto :goto_4

    .line 245
    :cond_6
    move-object/from16 v5, p0

    .line 246
    .line 247
    return v1

    .line 248
    :cond_7
    move-object/from16 v5, p0

    .line 249
    .line 250
    return v2
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm9/e;->f:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Ljava/lang/reflect/Field;

    .line 8
    .line 9
    invoke-static {p2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of p2, p1, Ljava/lang/String;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    if-eqz p1, :cond_1

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_1
    const-string p1, ""

    .line 25
    .line 26
    return-object p1
.end method

.method public final c(Lm9/d;Lm9/b;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lm9/d;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lm9/e;->b:Lia/t;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    iget-object v3, p1, Lm9/d;->d:Lm9/c;

    .line 15
    .line 16
    iget p2, p2, Lm9/b;->a:I

    .line 17
    .line 18
    invoke-virtual {p0, v1, v3, p2}, Lm9/e;->a(Ljava/lang/Object;Lm9/c;I)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    const-string p1, "\u5e94\u7528\u6240\u9009\u6e38\u620f\u8868\u60c5\u7ed3\u679c\u5931\u8d25"

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-virtual {v2, p1, p2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    iget-object v1, p0, Lm9/e;->d:Ljava/lang/ThreadLocal;

    .line 34
    .line 35
    invoke-virtual {v1, p2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :try_start_0
    iget-object p2, p1, Lm9/d;->a:Ljava/lang/reflect/Method;

    .line 39
    .line 40
    iget-object p1, p1, Lm9/d;->b:Ljava/lang/Object;

    .line 41
    .line 42
    array-length v3, v0

    .line 43
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {p2, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    :try_start_1
    const-string p2, "\u91cd\u65b0\u53d1\u9001\u6e38\u620f\u8868\u60c5\u5931\u8d25"

    .line 56
    .line 57
    invoke-virtual {v2, p2, p1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_1
    move-exception p1

    .line 65
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_1
    return-void
.end method

.method public final d(Ljava/lang/Class;)Ljava/util/LinkedHashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lm9/e;->h:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1, v2}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v0, "EmojiInfo \u7f3a\u5c11\u5b57\u6bb5: "

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v0, p0, Lm9/e;->b:Lia/t;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-virtual {v0, p1, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_1
    return-object v0
.end method
