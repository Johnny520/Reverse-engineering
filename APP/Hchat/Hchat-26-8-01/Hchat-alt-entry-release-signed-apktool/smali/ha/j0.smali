.class public final Lha/j0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final f:[Ljava/lang/String;

.field public static final g:[Ljava/lang/String;

.field public static final h:[Ljava/lang/String;

.field public static final i:[Ljava/lang/String;

.field public static final j:Ljava/util/Set;

.field public static final k:Log/k;

.field public static final l:Log/k;

.field public static final m:Log/k;

.field public static final n:Log/k;

.field public static final o:Log/k;

.field public static final p:Log/k;


# instance fields
.field public final a:Lr8/g;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Ljava/util/Set;

.field public final e:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    const-string v0, "h"

    .line 2
    .line 3
    const-string v1, "m"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lha/j0;->f:[Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "i"

    .line 12
    .line 13
    const-string v2, "n"

    .line 14
    .line 15
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lha/j0;->g:[Ljava/lang/String;

    .line 20
    .line 21
    const-string v0, "o"

    .line 22
    .line 23
    const-string v3, "p"

    .line 24
    .line 25
    const-string v4, "j"

    .line 26
    .line 27
    filled-new-array {v4, v1, v0, v2, v3}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lha/j0;->h:[Ljava/lang/String;

    .line 32
    .line 33
    const-string v0, "q"

    .line 34
    .line 35
    const-string v1, "t"

    .line 36
    .line 37
    const-string v2, "r"

    .line 38
    .line 39
    const-string v3, "u"

    .line 40
    .line 41
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lha/j0;->i:[Ljava/lang/String;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const/4 v0, 0x2

    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const/4 v0, 0x3

    .line 58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const/4 v0, 0x4

    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const/4 v0, 0x5

    .line 68
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    const/16 v0, 0x9

    .line 73
    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    const/16 v0, 0xa

    .line 79
    .line 80
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    const/16 v0, 0xc

    .line 85
    .line 86
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    const/16 v0, 0xd

    .line 91
    .line 92
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    const/16 v0, 0xe

    .line 97
    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    const/16 v0, 0xf

    .line 103
    .line 104
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    const/16 v0, 0x12

    .line 109
    .line 110
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    const/16 v0, 0x13

    .line 115
    .line 116
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    const/16 v0, 0x1a

    .line 121
    .line 122
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    const/16 v0, 0x1c

    .line 127
    .line 128
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v15

    .line 132
    const/16 v0, 0x1e

    .line 133
    .line 134
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v16

    .line 138
    const/16 v0, 0x22

    .line 139
    .line 140
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v17

    .line 144
    const/16 v0, 0x24

    .line 145
    .line 146
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v18

    .line 150
    const/16 v0, 0x29

    .line 151
    .line 152
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v19

    .line 156
    const/16 v0, 0x2a

    .line 157
    .line 158
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v20

    .line 162
    const/16 v0, 0x2f

    .line 163
    .line 164
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v21

    .line 168
    const/16 v0, 0x36

    .line 169
    .line 170
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v22

    .line 174
    filled-new-array/range {v1 .. v22}, [Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    sput-object v0, Lha/j0;->j:Ljava/util/Set;

    .line 183
    .line 184
    new-instance v0, Log/k;

    .line 185
    .line 186
    sget-object v1, Log/l;->h:Log/l;

    .line 187
    .line 188
    invoke-static {v1}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    const-string v3, "select\\s+\\*,\\s*rowid\\s+from\\s+SnsInfo"

    .line 193
    .line 194
    invoke-direct {v0, v3, v2}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 195
    .line 196
    .line 197
    sput-object v0, Lha/j0;->k:Log/k;

    .line 198
    .line 199
    new-instance v0, Log/k;

    .line 200
    .line 201
    const-string v2, "\\bWHERE\\b[\\s\\S]*?(?:SnsInfo\\.)?userName\\s*="

    .line 202
    .line 203
    invoke-static {v1}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-direct {v0, v2, v3}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 208
    .line 209
    .line 210
    sput-object v0, Lha/j0;->l:Log/k;

    .line 211
    .line 212
    new-instance v0, Log/k;

    .line 213
    .line 214
    const-string v2, "\\(\\s*(?:SnsInfo\\.)?sourceType\\s*&\\s*2\\s*!=\\s*0\\s*\\)"

    .line 215
    .line 216
    invoke-static {v1}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-direct {v0, v2, v3}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 221
    .line 222
    .line 223
    sput-object v0, Lha/j0;->m:Log/k;

    .line 224
    .line 225
    new-instance v0, Log/k;

    .line 226
    .line 227
    const-string v2, "\\(\\s*(?:SnsInfo\\.)?sourceType\\s*&\\s*128\\s*!=\\s*0\\s*\\)"

    .line 228
    .line 229
    invoke-static {v1}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-direct {v0, v2, v3}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 234
    .line 235
    .line 236
    sput-object v0, Lha/j0;->n:Log/k;

    .line 237
    .line 238
    new-instance v0, Log/k;

    .line 239
    .line 240
    const-string v2, "\\(\\s*snsId\\s*>="

    .line 241
    .line 242
    invoke-static {v1}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-direct {v0, v2, v3}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 247
    .line 248
    .line 249
    sput-object v0, Lha/j0;->o:Log/k;

    .line 250
    .line 251
    new-instance v0, Log/k;

    .line 252
    .line 253
    const-string v2, "\\(\\s*((?:SnsInfo\\.)?sourceType)\\s+in\\s*\\(([^)]*)\\)\\s*\\)"

    .line 254
    .line 255
    invoke-static {v1}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-direct {v0, v2, v1}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 260
    .line 261
    .line 262
    sput-object v0, Lha/j0;->p:Log/k;

    .line 263
    .line 264
    return-void
.end method

.method public constructor <init>(Lr8/g;)V
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
    iput-object p1, p0, Lha/j0;->a:Lr8/g;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string v0, "Hchat_sns_anti_recall_config"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lha/j0;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    const-string v0, "Hchat_sns_anti_recall_method_cache"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lha/j0;->c:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lha/j0;->d:Ljava/util/Set;

    .line 32
    .line 33
    new-instance p1, Lha/p;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-direct {p1, v0}, Lha/p;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lha/j0;->e:Ljava/lang/ThreadLocal;

    .line 44
    .line 45
    return-void
.end method

.method public static final a(Lha/j0;[Ljava/lang/Object;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    array-length p0, p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    if-lt v0, p0, :cond_1

    .line 7
    .line 8
    :goto_1
    return-void

    .line 9
    :cond_1
    aget-object v1, p1, v0

    .line 10
    .line 11
    instance-of v2, v1, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_2
    const/4 v1, 0x0

    .line 19
    :goto_2
    if-eqz v1, :cond_6

    .line 20
    .line 21
    sget-object v2, Lha/j0;->k:Log/k;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Log/k;->a(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    move-object v2, v1

    .line 30
    goto :goto_4

    .line 31
    :cond_3
    sget-object v2, Lha/j0;->l:Log/k;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Log/k;->a(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const-string v3, "(1=1)"

    .line 38
    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    new-instance v2, Lg0/o;

    .line 42
    .line 43
    const/16 v4, 0x8

    .line 44
    .line 45
    invoke-direct {v2, v4}, Lg0/o;-><init>(I)V

    .line 46
    .line 47
    .line 48
    sget-object v4, Lha/j0;->p:Log/k;

    .line 49
    .line 50
    invoke-virtual {v4, v1, v2}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v4, Lha/j0;->n:Log/k;

    .line 55
    .line 56
    invoke-virtual {v4, v2, v3}, Log/k;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v4, "1=1 or snsId"

    .line 61
    .line 62
    const/4 v5, 0x1

    .line 63
    invoke-static {v2, v4, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_5

    .line 68
    .line 69
    sget-object v4, Lha/j0;->o:Log/k;

    .line 70
    .line 71
    const-string v5, "(1=1 or snsId >="

    .line 72
    .line 73
    invoke-virtual {v4, v2, v5}, Log/k;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    move-object v2, v1

    .line 79
    :cond_5
    :goto_3
    sget-object v4, Lha/j0;->m:Log/k;

    .line 80
    .line 81
    invoke-virtual {v4, v2, v3}, Log/k;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :goto_4
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-nez v1, :cond_6

    .line 90
    .line 91
    aput-object v2, p1, v0

    .line 92
    .line 93
    return-void

    .line 94
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    goto :goto_0
.end method

.method public static final b(Lha/j0;Ljava/lang/Object;[Ljava/lang/Object;Z)V
    .locals 22

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
    const-string v4, "CommentUserList"

    .line 8
    .line 9
    iget-object v5, v1, Lha/j0;->b:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v0, "SnsInfo"

    .line 12
    .line 13
    const-string v6, ""

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    if-eqz v3, :cond_8

    .line 17
    .line 18
    array-length v9, v3

    .line 19
    if-nez v9, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    aget-object v9, v3, v8

    .line 23
    .line 24
    instance-of v10, v9, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v10, :cond_1

    .line 27
    .line 28
    check-cast v9, Ljava/lang/String;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v9, 0x0

    .line 32
    :goto_0
    if-eqz v9, :cond_2

    .line 33
    .line 34
    move-object v6, v9

    .line 35
    goto :goto_3

    .line 36
    :cond_2
    new-instance v9, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    array-length v10, v3

    .line 42
    move v11, v8

    .line 43
    :goto_1
    if-ge v11, v10, :cond_4

    .line 44
    .line 45
    aget-object v12, v3, v11

    .line 46
    .line 47
    instance-of v13, v12, Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v13, :cond_3

    .line 50
    .line 51
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    if-eqz v10, :cond_6

    .line 66
    .line 67
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    move-object v11, v10

    .line 72
    check-cast v11, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v11, v0}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v11

    .line 78
    if-eqz v11, :cond_5

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_6
    const/4 v10, 0x0

    .line 82
    :goto_2
    check-cast v10, Ljava/lang/String;

    .line 83
    .line 84
    if-nez v10, :cond_7

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_7
    move-object v6, v10

    .line 88
    :cond_8
    :goto_3
    invoke-static {v6, v0}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_9

    .line 93
    .line 94
    goto/16 :goto_25

    .line 95
    .line 96
    :cond_9
    if-nez v3, :cond_b

    .line 97
    .line 98
    :cond_a
    const/4 v9, 0x0

    .line 99
    goto :goto_6

    .line 100
    :cond_b
    array-length v0, v3

    .line 101
    move v6, v8

    .line 102
    :goto_4
    if-ge v6, v0, :cond_a

    .line 103
    .line 104
    aget-object v9, v3, v6

    .line 105
    .line 106
    instance-of v10, v9, Landroid/content/ContentValues;

    .line 107
    .line 108
    if-eqz v10, :cond_c

    .line 109
    .line 110
    check-cast v9, Landroid/content/ContentValues;

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_c
    const/4 v9, 0x0

    .line 114
    :goto_5
    if-eqz v9, :cond_d

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_d
    add-int/lit8 v6, v6, 0x1

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :goto_6
    if-eqz v9, :cond_3e

    .line 121
    .line 122
    const-string v0, "sns_comment_anti_recall_enable"

    .line 123
    .line 124
    invoke-interface {v5, v0, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    const-string v6, "rowid"

    .line 129
    .line 130
    const-string v10, "snsId"

    .line 131
    .line 132
    const-string v11, "field_snsId"

    .line 133
    .line 134
    const-string v12, "=? LIMIT 1"

    .line 135
    .line 136
    const-string v13, " LIMIT 1"

    .line 137
    .line 138
    if-eqz v0, :cond_2a

    .line 139
    .line 140
    const-string v0, "attrBuf"

    .line 141
    .line 142
    invoke-virtual {v9, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v15

    .line 146
    if-eqz v15, :cond_e

    .line 147
    .line 148
    :goto_7
    move-object v15, v0

    .line 149
    goto :goto_8

    .line 150
    :cond_e
    const-string v0, "field_attrBuf"

    .line 151
    .line 152
    invoke-virtual {v9, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result v15

    .line 156
    if-eqz v15, :cond_2a

    .line 157
    .line 158
    goto :goto_7

    .line 159
    :goto_8
    :try_start_0
    invoke-virtual {v9, v15}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    .line 160
    .line 161
    .line 162
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    goto :goto_9

    .line 164
    :catchall_0
    move-exception v0

    .line 165
    new-instance v7, Lsf/f;

    .line 166
    .line 167
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    move-object v0, v7

    .line 171
    :goto_9
    nop

    .line 172
    instance-of v7, v0, Lsf/f;

    .line 173
    .line 174
    if-eqz v7, :cond_f

    .line 175
    .line 176
    const/4 v0, 0x0

    .line 177
    :cond_f
    check-cast v0, [B

    .line 178
    .line 179
    if-eqz v0, :cond_2a

    .line 180
    .line 181
    if-eqz v2, :cond_10

    .line 182
    .line 183
    if-nez v3, :cond_11

    .line 184
    .line 185
    :cond_10
    move-object/from16 v17, v6

    .line 186
    .line 187
    goto/16 :goto_d

    .line 188
    .line 189
    :cond_11
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    invoke-static {v9, v7}, Lha/j0;->n(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Long;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    const-string v8, "SELECT field_attrBuf FROM SnsInfo WHERE "

    .line 198
    .line 199
    const-string v14, "SELECT attrBuf FROM SnsInfo WHERE "

    .line 200
    .line 201
    if-eqz v7, :cond_15

    .line 202
    .line 203
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v16

    .line 207
    move-object/from16 v17, v6

    .line 208
    .line 209
    const/4 v3, 0x0

    .line 210
    :goto_a
    const/4 v6, 0x2

    .line 211
    if-lt v3, v6, :cond_12

    .line 212
    .line 213
    goto :goto_b

    .line 214
    :cond_12
    aget-object v6, v16, v3

    .line 215
    .line 216
    move/from16 v18, v3

    .line 217
    .line 218
    invoke-static {v14, v6, v12}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 223
    .line 224
    .line 225
    move-result-wide v19

    .line 226
    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v19

    .line 230
    move-object/from16 v20, v7

    .line 231
    .line 232
    filled-new-array/range {v19 .. v19}, [Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-virtual {v1, v2, v3, v7}, Lha/j0;->s(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)[B

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    if-eqz v3, :cond_13

    .line 241
    .line 242
    goto :goto_e

    .line 243
    :cond_13
    invoke-static {v8, v6, v12}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Long;->longValue()J

    .line 248
    .line 249
    .line 250
    move-result-wide v6

    .line 251
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    filled-new-array {v6}, [Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    invoke-virtual {v1, v2, v3, v6}, Lha/j0;->s(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)[B

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    if-eqz v3, :cond_14

    .line 264
    .line 265
    goto :goto_e

    .line 266
    :cond_14
    add-int/lit8 v3, v18, 0x1

    .line 267
    .line 268
    move-object/from16 v7, v20

    .line 269
    .line 270
    goto :goto_a

    .line 271
    :cond_15
    move-object/from16 v17, v6

    .line 272
    .line 273
    :goto_b
    filled-new-array/range {v17 .. v17}, [Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-static {v9, v3}, Lha/j0;->n(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Long;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    if-eqz v3, :cond_16

    .line 282
    .line 283
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 284
    .line 285
    .line 286
    move-result-wide v6

    .line 287
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    filled-new-array {v3}, [Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    const-string v6, "SELECT attrBuf FROM SnsInfo WHERE rowid=? LIMIT 1"

    .line 296
    .line 297
    invoke-virtual {v1, v2, v6, v3}, Lha/j0;->s(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)[B

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    if-eqz v3, :cond_16

    .line 302
    .line 303
    goto :goto_e

    .line 304
    :cond_16
    invoke-static/range {p2 .. p2}, Lha/j0;->x([Ljava/lang/Object;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    if-nez v6, :cond_17

    .line 313
    .line 314
    goto :goto_c

    .line 315
    :cond_17
    const/4 v3, 0x0

    .line 316
    :goto_c
    if-eqz v3, :cond_19

    .line 317
    .line 318
    invoke-static/range {p2 .. p2}, Lha/j0;->v([Ljava/lang/Object;)[Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    invoke-static {v14, v3, v13}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    invoke-virtual {v1, v2, v7, v6}, Lha/j0;->s(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)[B

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    if-eqz v7, :cond_18

    .line 331
    .line 332
    move-object v3, v7

    .line 333
    goto :goto_e

    .line 334
    :cond_18
    invoke-static {v8, v3, v13}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v1, v2, v3, v6}, Lha/j0;->s(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)[B

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    goto :goto_e

    .line 343
    :cond_19
    :goto_d
    const/4 v3, 0x0

    .line 344
    :goto_e
    if-eqz v3, :cond_2b

    .line 345
    .line 346
    :try_start_1
    invoke-virtual {v1, v3}, Lha/j0;->r([B)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    if-eqz v3, :cond_1e

    .line 351
    .line 352
    invoke-virtual {v1, v0}, Lha/j0;->r([B)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-eqz v0, :cond_1e

    .line 357
    .line 358
    invoke-static {v3, v4}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-static {v3}, Lgg/x;->e(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v6

    .line 366
    if-eqz v6, :cond_1a

    .line 367
    .line 368
    check-cast v3, Ljava/util/List;

    .line 369
    .line 370
    goto :goto_f

    .line 371
    :cond_1a
    const/4 v3, 0x0

    .line 372
    :goto_f
    if-eqz v3, :cond_1b

    .line 373
    .line 374
    goto :goto_10

    .line 375
    :cond_1b
    new-instance v3, Ljava/util/LinkedList;

    .line 376
    .line 377
    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 378
    .line 379
    .line 380
    :goto_10
    invoke-static {v0, v4}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    invoke-static {v4}, Lgg/x;->e(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    if-eqz v6, :cond_1c

    .line 389
    .line 390
    check-cast v4, Ljava/util/List;

    .line 391
    .line 392
    goto :goto_11

    .line 393
    :cond_1c
    const/4 v4, 0x0

    .line 394
    :goto_11
    if-eqz v4, :cond_1d

    .line 395
    .line 396
    goto :goto_12

    .line 397
    :cond_1d
    new-instance v4, Ljava/util/LinkedList;

    .line 398
    .line 399
    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 400
    .line 401
    .line 402
    :goto_12
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 403
    .line 404
    .line 405
    move-result v6

    .line 406
    if-eqz v6, :cond_20

    .line 407
    .line 408
    :cond_1e
    move-object/from16 v20, v13

    .line 409
    .line 410
    :cond_1f
    :goto_13
    const/4 v0, 0x0

    .line 411
    goto/16 :goto_19

    .line 412
    .line 413
    :cond_20
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 414
    .line 415
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 416
    .line 417
    .line 418
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 419
    .line 420
    .line 421
    move-result-object v7

    .line 422
    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 423
    .line 424
    .line 425
    move-result v8

    .line 426
    if-eqz v8, :cond_21

    .line 427
    .line 428
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v8

    .line 432
    invoke-virtual {v1, v8}, Lha/j0;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v8

    .line 436
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    goto :goto_14

    .line 440
    :catchall_1
    move-exception v0

    .line 441
    move-object/from16 v20, v13

    .line 442
    .line 443
    goto/16 :goto_18

    .line 444
    .line 445
    :cond_21
    new-instance v7, Ljava/util/ArrayList;

    .line 446
    .line 447
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 448
    .line 449
    .line 450
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v8

    .line 458
    if-eqz v8, :cond_28

    .line 459
    .line 460
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    const/4 v14, 0x2

    .line 468
    invoke-static {v14, v8}, La7/a;->z(ILjava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v16

    .line 472
    if-eqz v16, :cond_24

    .line 473
    .line 474
    :cond_22
    move-object/from16 v18, v3

    .line 475
    .line 476
    move-object/from16 v19, v6

    .line 477
    .line 478
    move-object/from16 v20, v13

    .line 479
    .line 480
    :cond_23
    const/16 v16, 0x0

    .line 481
    .line 482
    goto :goto_17

    .line 483
    :cond_24
    invoke-virtual {v1, v8}, Lha/j0;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v14

    .line 487
    invoke-virtual {v6, v14}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v14

    .line 491
    if-nez v14, :cond_22

    .line 492
    .line 493
    invoke-static {v8}, Lha/j0;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v14

    .line 497
    const/16 v16, 0x1

    .line 498
    .line 499
    if-eqz v14, :cond_26

    .line 500
    .line 501
    move-object/from16 v18, v3

    .line 502
    .line 503
    invoke-static {v8, v14}, Lha/j0;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    move-object/from16 v19, v6

    .line 508
    .line 509
    invoke-virtual {v1}, Lha/j0;->d()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 513
    move-object/from16 v20, v13

    .line 514
    .line 515
    const/4 v13, 0x0

    .line 516
    :try_start_2
    invoke-static {v3, v6, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 517
    .line 518
    .line 519
    move-result v21

    .line 520
    if-eqz v21, :cond_25

    .line 521
    .line 522
    move/from16 v3, v16

    .line 523
    .line 524
    goto :goto_16

    .line 525
    :cond_25
    invoke-static {v3, v6}, Lha/j0;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    invoke-static {v8, v14, v3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    goto :goto_16

    .line 534
    :cond_26
    move-object/from16 v18, v3

    .line 535
    .line 536
    move-object/from16 v19, v6

    .line 537
    .line 538
    move-object/from16 v20, v13

    .line 539
    .line 540
    const/4 v3, 0x0

    .line 541
    :goto_16
    if-eqz v3, :cond_23

    .line 542
    .line 543
    :goto_17
    if-eqz v16, :cond_27

    .line 544
    .line 545
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    :cond_27
    move-object/from16 v3, v18

    .line 549
    .line 550
    move-object/from16 v6, v19

    .line 551
    .line 552
    move-object/from16 v13, v20

    .line 553
    .line 554
    goto :goto_15

    .line 555
    :catchall_2
    move-exception v0

    .line 556
    goto :goto_18

    .line 557
    :cond_28
    move-object/from16 v20, v13

    .line 558
    .line 559
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 560
    .line 561
    .line 562
    move-result v3

    .line 563
    if-eqz v3, :cond_29

    .line 564
    .line 565
    goto/16 :goto_13

    .line 566
    .line 567
    :cond_29
    invoke-interface {v4, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 568
    .line 569
    .line 570
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    const-string v4, "CommentCount"

    .line 575
    .line 576
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    invoke-static {v0, v4, v6}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    const-string v4, "CommentUserListCount"

    .line 584
    .line 585
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    invoke-static {v0, v4, v3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    const-string v3, "toByteArray"

    .line 593
    .line 594
    const/4 v13, 0x0

    .line 595
    new-array v4, v13, [Ljava/lang/Object;

    .line 596
    .line 597
    invoke-static {v0, v3, v4}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    instance-of v3, v0, [B

    .line 602
    .line 603
    if-eqz v3, :cond_1f

    .line 604
    .line 605
    check-cast v0, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 606
    .line 607
    goto :goto_19

    .line 608
    :goto_18
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    const-string v4, "[Hchat:SnsAntiRecall] \u5408\u5e76\u670b\u53cb\u5708\u8bc4\u8bba\u5931\u8d25: "

    .line 613
    .line 614
    invoke-static {v4, v3, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 615
    .line 616
    .line 617
    goto/16 :goto_13

    .line 618
    .line 619
    :goto_19
    if-eqz v0, :cond_2c

    .line 620
    .line 621
    invoke-virtual {v9, v15, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 622
    .line 623
    .line 624
    goto :goto_1a

    .line 625
    :cond_2a
    move-object/from16 v17, v6

    .line 626
    .line 627
    :cond_2b
    move-object/from16 v20, v13

    .line 628
    .line 629
    :cond_2c
    :goto_1a
    if-nez p3, :cond_2d

    .line 630
    .line 631
    goto/16 :goto_25

    .line 632
    .line 633
    :cond_2d
    const-string v0, "sns_anti_recall_enable"

    .line 634
    .line 635
    const/4 v13, 0x0

    .line 636
    invoke-interface {v5, v0, v13}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 637
    .line 638
    .line 639
    move-result v0

    .line 640
    if-nez v0, :cond_2e

    .line 641
    .line 642
    goto/16 :goto_25

    .line 643
    .line 644
    :cond_2e
    const-string v0, "type"

    .line 645
    .line 646
    const-string v3, "field_type"

    .line 647
    .line 648
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    invoke-static {v9, v4}, Lha/j0;->i(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 653
    .line 654
    .line 655
    move-result-object v4

    .line 656
    if-eqz v4, :cond_2f

    .line 657
    .line 658
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    goto/16 :goto_24

    .line 663
    .line 664
    :cond_2f
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    if-eqz v2, :cond_39

    .line 669
    .line 670
    if-nez p2, :cond_30

    .line 671
    .line 672
    goto/16 :goto_22

    .line 673
    .line 674
    :cond_30
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    invoke-static {v9, v3}, Lha/j0;->n(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Long;

    .line 679
    .line 680
    .line 681
    move-result-object v3

    .line 682
    const-string v4, " FROM SnsInfo WHERE "

    .line 683
    .line 684
    const-string v5, "SELECT "

    .line 685
    .line 686
    if-eqz v3, :cond_34

    .line 687
    .line 688
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v6

    .line 692
    move v7, v13

    .line 693
    :goto_1b
    const/4 v14, 0x2

    .line 694
    if-lt v7, v14, :cond_31

    .line 695
    .line 696
    goto :goto_1d

    .line 697
    :cond_31
    aget-object v8, v6, v7

    .line 698
    .line 699
    move v10, v13

    .line 700
    :goto_1c
    if-lt v10, v14, :cond_32

    .line 701
    .line 702
    add-int/lit8 v7, v7, 0x1

    .line 703
    .line 704
    goto :goto_1b

    .line 705
    :cond_32
    aget-object v11, v0, v10

    .line 706
    .line 707
    invoke-static {v5, v11, v4, v8, v12}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v11

    .line 711
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 712
    .line 713
    .line 714
    move-result-wide v14

    .line 715
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v14

    .line 719
    filled-new-array {v14}, [Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v14

    .line 723
    invoke-virtual {v1, v2, v11, v14}, Lha/j0;->t(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 724
    .line 725
    .line 726
    move-result-object v11

    .line 727
    if-eqz v11, :cond_33

    .line 728
    .line 729
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 730
    .line 731
    .line 732
    move-result v0

    .line 733
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 734
    .line 735
    .line 736
    move-result-object v7

    .line 737
    goto/16 :goto_23

    .line 738
    .line 739
    :cond_33
    add-int/lit8 v10, v10, 0x1

    .line 740
    .line 741
    const/4 v14, 0x2

    .line 742
    goto :goto_1c

    .line 743
    :cond_34
    :goto_1d
    filled-new-array/range {v17 .. v17}, [Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v3

    .line 747
    invoke-static {v9, v3}, Lha/j0;->n(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Long;

    .line 748
    .line 749
    .line 750
    move-result-object v3

    .line 751
    if-eqz v3, :cond_37

    .line 752
    .line 753
    move v6, v13

    .line 754
    :goto_1e
    const/4 v14, 0x2

    .line 755
    if-lt v6, v14, :cond_35

    .line 756
    .line 757
    goto :goto_1f

    .line 758
    :cond_35
    aget-object v7, v0, v6

    .line 759
    .line 760
    const-string v8, " FROM SnsInfo WHERE rowid=? LIMIT 1"

    .line 761
    .line 762
    invoke-static {v5, v7, v8}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v7

    .line 766
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 767
    .line 768
    .line 769
    move-result-wide v10

    .line 770
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v8

    .line 774
    filled-new-array {v8}, [Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v8

    .line 778
    invoke-virtual {v1, v2, v7, v8}, Lha/j0;->t(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 779
    .line 780
    .line 781
    move-result-object v7

    .line 782
    if-eqz v7, :cond_36

    .line 783
    .line 784
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 789
    .line 790
    .line 791
    move-result-object v7

    .line 792
    goto :goto_23

    .line 793
    :cond_36
    add-int/lit8 v6, v6, 0x1

    .line 794
    .line 795
    goto :goto_1e

    .line 796
    :cond_37
    :goto_1f
    invoke-static/range {p2 .. p2}, Lha/j0;->x([Ljava/lang/Object;)Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 801
    .line 802
    .line 803
    move-result v6

    .line 804
    if-nez v6, :cond_38

    .line 805
    .line 806
    goto :goto_20

    .line 807
    :cond_38
    const/4 v3, 0x0

    .line 808
    :goto_20
    if-eqz v3, :cond_39

    .line 809
    .line 810
    invoke-static/range {p2 .. p2}, Lha/j0;->v([Ljava/lang/Object;)[Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v6

    .line 814
    move v8, v13

    .line 815
    const/4 v14, 0x2

    .line 816
    :goto_21
    if-lt v8, v14, :cond_3a

    .line 817
    .line 818
    :cond_39
    :goto_22
    const/4 v7, 0x0

    .line 819
    goto :goto_23

    .line 820
    :cond_3a
    aget-object v7, v0, v8

    .line 821
    .line 822
    move-object/from16 v10, v20

    .line 823
    .line 824
    invoke-static {v5, v7, v4, v3, v10}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v7

    .line 828
    invoke-virtual {v1, v2, v7, v6}, Lha/j0;->t(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 829
    .line 830
    .line 831
    move-result-object v7

    .line 832
    if-eqz v7, :cond_3b

    .line 833
    .line 834
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 835
    .line 836
    .line 837
    move-result v0

    .line 838
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 839
    .line 840
    .line 841
    move-result-object v7

    .line 842
    goto :goto_23

    .line 843
    :cond_3b
    add-int/lit8 v8, v8, 0x1

    .line 844
    .line 845
    move-object/from16 v20, v10

    .line 846
    .line 847
    goto :goto_21

    .line 848
    :goto_23
    if-eqz v7, :cond_3e

    .line 849
    .line 850
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 851
    .line 852
    .line 853
    move-result v0

    .line 854
    :goto_24
    sget-object v2, Lha/j0;->j:Ljava/util/Set;

    .line 855
    .line 856
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 861
    .line 862
    .line 863
    move-result v0

    .line 864
    if-nez v0, :cond_3c

    .line 865
    .line 866
    goto :goto_25

    .line 867
    :cond_3c
    const-string v0, "sourceType"

    .line 868
    .line 869
    const-string v2, "field_sourceType"

    .line 870
    .line 871
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v3

    .line 875
    invoke-static {v9, v3}, Lha/j0;->i(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 876
    .line 877
    .line 878
    move-result-object v3

    .line 879
    if-eqz v3, :cond_3e

    .line 880
    .line 881
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 882
    .line 883
    .line 884
    move-result v3

    .line 885
    if-eqz v3, :cond_3d

    .line 886
    .line 887
    goto :goto_25

    .line 888
    :cond_3d
    invoke-virtual {v9, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v9, v2}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    const-string v0, "contentDesc"

    .line 895
    .line 896
    invoke-virtual {v1, v9, v0}, Lha/j0;->q(Landroid/content/ContentValues;Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    const-string v0, "field_contentDesc"

    .line 900
    .line 901
    invoke-virtual {v1, v9, v0}, Lha/j0;->q(Landroid/content/ContentValues;Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    const-string v0, "content"

    .line 905
    .line 906
    invoke-virtual {v1, v9, v0}, Lha/j0;->o(Landroid/content/ContentValues;Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    const-string v0, "field_content"

    .line 910
    .line 911
    invoke-virtual {v1, v9, v0}, Lha/j0;->o(Landroid/content/ContentValues;Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    :cond_3e
    :goto_25
    return-void
.end method

.method public static c(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x2

    .line 3
    if-ge v0, v1, :cond_1

    .line 4
    .line 5
    sget-object v1, Lha/j0;->f:[Ljava/lang/String;

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    invoke-static {p0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    instance-of v2, v2, Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static g(Ljava/lang/Iterable;Ljava/lang/Object;)I
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v3, v0, Ljava/lang/Number;

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Number;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v0, v2

    .line 31
    :goto_0
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v0, v1

    .line 39
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-lez v0, :cond_3

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    move v0, v1

    .line 48
    :goto_2
    if-eqz v0, :cond_4

    .line 49
    .line 50
    move-object v2, v3

    .line 51
    :cond_4
    if-eqz v2, :cond_0

    .line 52
    .line 53
    :cond_5
    if-eqz v2, :cond_6

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0

    .line 60
    :cond_6
    return v1
.end method

.method public static varargs i(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Integer;
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    const/4 v2, 0x0

    .line 4
    if-lt v1, v0, :cond_0

    .line 5
    .line 6
    return-object v2

    .line 7
    :cond_0
    aget-object v3, p1, v1

    .line 8
    .line 9
    invoke-virtual {p0, v3}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-nez v4, :cond_1

    .line 14
    .line 15
    goto :goto_4

    .line 16
    :cond_1
    :try_start_0
    invoke-virtual {p0, v3}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_1

    .line 21
    :catchall_0
    move-exception v4

    .line 22
    new-instance v5, Lsf/f;

    .line 23
    .line 24
    invoke-direct {v5, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object v4, v5

    .line 28
    :goto_1
    nop

    .line 29
    instance-of v5, v4, Lsf/f;

    .line 30
    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    move-object v4, v2

    .line 34
    :cond_2
    check-cast v4, Ljava/lang/Integer;

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_3
    :try_start_1
    invoke-virtual {p0, v3}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    goto :goto_2

    .line 52
    :catchall_1
    move-exception v3

    .line 53
    new-instance v4, Lsf/f;

    .line 54
    .line 55
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    move-object v3, v4

    .line 59
    :goto_2
    nop

    .line 60
    instance-of v4, v3, Lsf/f;

    .line 61
    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    move-object v2, v3

    .line 66
    :goto_3
    nop

    .line 67
    instance-of v3, v2, Ljava/lang/Number;

    .line 68
    .line 69
    if-eqz v3, :cond_5

    .line 70
    .line 71
    check-cast v2, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_5
    instance-of v3, v2, Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v3, :cond_6

    .line 85
    .line 86
    check-cast v2, Ljava/lang/String;

    .line 87
    .line 88
    const/16 v3, 0xa

    .line 89
    .line 90
    invoke-static {v3, v2}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    if-eqz v2, :cond_6

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :cond_6
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    goto :goto_0
.end method

.method public static k(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "rawQuery"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const-string v1, "rawQueryWithFactory"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    array-length v0, p0

    .line 31
    move v1, v2

    .line 32
    :goto_0
    if-ge v1, v0, :cond_2

    .line 33
    .line 34
    aget-object v3, p0, v1

    .line 35
    .line 36
    const-class v4, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    :goto_1
    return v2
.end method

.method public static l(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v2, "update"

    .line 20
    .line 21
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v2, "updateWithOnConflict"

    .line 32
    .line 33
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    array-length v0, p0

    .line 48
    move v2, v1

    .line 49
    :goto_0
    if-ge v2, v0, :cond_3

    .line 50
    .line 51
    aget-object v3, p0, v2

    .line 52
    .line 53
    const-class v4, Landroid/content/ContentValues;

    .line 54
    .line 55
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    :goto_1
    return v1
.end method

.method public static m(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-static {p0}, Lha/j0;->l(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v2, "insert"

    .line 26
    .line 27
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    const-string v2, "insertWithOnConflict"

    .line 34
    .line 35
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    const-string v2, "replace"

    .line 42
    .line 43
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    const-string v2, "replaceOrThrow"

    .line 50
    .line 51
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    array-length v0, p0

    .line 66
    move v2, v1

    .line 67
    :goto_0
    if-ge v2, v0, :cond_3

    .line 68
    .line 69
    aget-object v3, p0, v2

    .line 70
    .line 71
    const-class v4, Landroid/content/ContentValues;

    .line 72
    .line 73
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    :goto_1
    return v1

    .line 84
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 85
    return p0
.end method

.method public static varargs n(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Long;
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    const/4 v2, 0x0

    .line 4
    if-lt v1, v0, :cond_0

    .line 5
    .line 6
    return-object v2

    .line 7
    :cond_0
    aget-object v3, p1, v1

    .line 8
    .line 9
    invoke-virtual {p0, v3}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-nez v4, :cond_1

    .line 14
    .line 15
    goto :goto_4

    .line 16
    :cond_1
    :try_start_0
    invoke-virtual {p0, v3}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_1

    .line 21
    :catchall_0
    move-exception v4

    .line 22
    new-instance v5, Lsf/f;

    .line 23
    .line 24
    invoke-direct {v5, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object v4, v5

    .line 28
    :goto_1
    nop

    .line 29
    instance-of v5, v4, Lsf/f;

    .line 30
    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    move-object v4, v2

    .line 34
    :cond_2
    check-cast v4, Ljava/lang/Long;

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide p0

    .line 42
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_3
    :try_start_1
    invoke-virtual {p0, v3}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    goto :goto_2

    .line 52
    :catchall_1
    move-exception v3

    .line 53
    new-instance v4, Lsf/f;

    .line 54
    .line 55
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    move-object v3, v4

    .line 59
    :goto_2
    nop

    .line 60
    instance-of v4, v3, Lsf/f;

    .line 61
    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    move-object v2, v3

    .line 66
    :goto_3
    nop

    .line 67
    instance-of v3, v2, Ljava/lang/Number;

    .line 68
    .line 69
    if-eqz v3, :cond_5

    .line 70
    .line 71
    check-cast v2, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide p0

    .line 77
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_5
    instance-of v3, v2, Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v3, :cond_6

    .line 85
    .line 86
    check-cast v2, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v2}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide p0

    .line 98
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_6
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    goto :goto_0
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_1
    const-string v0, " "

    .line 17
    .line 18
    invoke-static {p1, v0, p0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static u([BI)Lha/i0;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide/16 v1, 0x0

    .line 3
    .line 4
    :goto_0
    array-length v3, p0

    .line 5
    if-ge p1, v3, :cond_1

    .line 6
    .line 7
    const/16 v3, 0x40

    .line 8
    .line 9
    if-ge v0, v3, :cond_1

    .line 10
    .line 11
    aget-byte v3, p0, p1

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    and-int/lit8 v4, v3, 0x7f

    .line 16
    .line 17
    int-to-long v4, v4

    .line 18
    shl-long/2addr v4, v0

    .line 19
    or-long/2addr v1, v4

    .line 20
    and-int/lit16 v3, v3, 0x80

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    new-instance p0, Lha/i0;

    .line 25
    .line 26
    invoke-direct {p0, v1, v2, p1}, Lha/i0;-><init>(JI)V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    add-int/lit8 v0, v0, 0x7

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static v([Ljava/lang/Object;)[Ljava/lang/String;
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    const/4 v3, 0x0

    .line 5
    if-ge v2, v0, :cond_2

    .line 6
    .line 7
    aget-object v4, p0, v2

    .line 8
    .line 9
    instance-of v5, v4, [Ljava/lang/Object;

    .line 10
    .line 11
    if-eqz v5, :cond_0

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v5}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const-class v6, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move v5, v1

    .line 32
    :goto_1
    if-eqz v5, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object v4, v3

    .line 39
    :goto_2
    instance-of p0, v4, [Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    check-cast v4, [Ljava/lang/String;

    .line 44
    .line 45
    return-object v4

    .line 46
    :cond_3
    return-object v3
.end method

.method public static w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-eqz p0, :cond_1

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    const-string p0, ""

    .line 17
    .line 18
    return-object p0
.end method

.method public static x([Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-lt v1, v0, :cond_0

    .line 5
    .line 6
    const-string p0, ""

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    aget-object v3, p0, v1

    .line 10
    .line 11
    instance-of v4, v3, Landroid/content/ContentValues;

    .line 12
    .line 13
    if-eqz v4, :cond_1

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    if-eqz v2, :cond_2

    .line 18
    .line 19
    instance-of v4, v3, Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    return-object v3

    .line 26
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0
.end method

.method public static y(Ljava/io/ByteArrayOutputStream;J)V
    .locals 4

    .line 1
    :goto_0
    const-wide/16 v0, -0x80

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    long-to-int p1, p1

    .line 11
    invoke-virtual {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-wide/16 v0, 0x7f

    .line 16
    .line 17
    and-long/2addr v0, p1

    .line 18
    const-wide/16 v2, 0x80

    .line 19
    .line 20
    or-long/2addr v0, v2

    .line 21
    long-to-int v0, v0

    .line 22
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x7

    .line 26
    ushr-long/2addr p1, v0

    .line 27
    goto :goto_0
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "sns_comment_custom_mark_enable"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lha/j0;->b:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "[\u5df2\u5220\u9664]"

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    const-string v0, "sns_comment_custom_mark_text"

    .line 15
    .line 16
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    :cond_0
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_1
    return-object v0

    .line 40
    :cond_2
    return-object v1
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-static {p1}, Lha/j0;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lgg/b;

    .line 6
    .line 7
    sget-object v2, Lha/j0;->i:[Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v1, v2}, Lgg/b;-><init>([Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    if-eqz v2, :cond_4

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    instance-of v6, v2, Ljava/lang/Number;

    .line 32
    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    check-cast v2, Ljava/lang/Number;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v2, v5

    .line 39
    :goto_0
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-wide v6, v3

    .line 47
    :goto_1
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    cmp-long v6, v6, v3

    .line 52
    .line 53
    if-lez v6, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move-object v2, v5

    .line 57
    :goto_2
    if-eqz v2, :cond_0

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move-object v2, v5

    .line 61
    :goto_3
    if-eqz v2, :cond_5

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v1

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    move-wide v1, v3

    .line 69
    :goto_4
    new-instance v6, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    const/4 v7, 0x0

    .line 75
    :goto_5
    const/4 v8, 0x5

    .line 76
    if-ge v7, v8, :cond_7

    .line 77
    .line 78
    sget-object v8, Lha/j0;->h:[Ljava/lang/String;

    .line 79
    .line 80
    aget-object v8, v8, v7

    .line 81
    .line 82
    invoke-static {v8, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-nez v9, :cond_6

    .line 87
    .line 88
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_7
    invoke-static {v6, p1}, Lha/j0;->g(Ljava/lang/Iterable;Ljava/lang/Object;)I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    new-instance v7, Lng/p;

    .line 99
    .line 100
    const/4 v8, 0x1

    .line 101
    sget-object v9, Lha/j0;->g:[Ljava/lang/String;

    .line 102
    .line 103
    invoke-direct {v7, v9, v8}, Lng/p;-><init>(Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    invoke-static {v7, p1}, Lha/j0;->g(Ljava/lang/Iterable;Ljava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    const-string v8, "d"

    .line 111
    .line 112
    invoke-static {p1, v8}, Lha/j0;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    if-eqz v0, :cond_8

    .line 117
    .line 118
    invoke-static {p1, v0}, Lha/j0;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    :cond_8
    if-nez v5, :cond_9

    .line 123
    .line 124
    const-string v5, ""

    .line 125
    .line 126
    :cond_9
    invoke-virtual {p0}, Lha/j0;->d()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {v5, p1}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {p1}, Log/m;->V0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    cmp-long v0, v1, v3

    .line 143
    .line 144
    if-lez v0, :cond_a

    .line 145
    .line 146
    const-string p1, "svr:"

    .line 147
    .line 148
    invoke-static {v1, v2, p1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    return-object p1

    .line 153
    :cond_a
    if-lez v6, :cond_b

    .line 154
    .line 155
    const-string p1, "local:"

    .line 156
    .line 157
    invoke-static {v6, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    return-object p1

    .line 162
    :cond_b
    const-string v0, "fallback:"

    .line 163
    .line 164
    const-string v1, ":"

    .line 165
    .line 166
    invoke-static {v7, v0, v8, v1, v1}, Leh/a;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    return-object p1
.end method

.method public final f()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "sns_custom_mark_enable"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lha/j0;->b:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "[\u5df2\u5220\u9664]"

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    const-string v0, "sns_custom_mark_text"

    .line 15
    .line 16
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    :cond_0
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_1
    return-object v0

    .line 40
    :cond_2
    return-object v1
.end method

.method public final h(Ljava/lang/Class;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/reflect/Method;

    .line 24
    .line 25
    invoke-static {v1}, Lha/j0;->m(Ljava/lang/reflect/Method;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    invoke-static {v1}, Lha/j0;->k(Ljava/lang/reflect/Method;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v2, p0, Lha/j0;->d:Ljava/util/Set;

    .line 39
    .line 40
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 48
    .line 49
    new-instance v3, Lc9/c2;

    .line 50
    .line 51
    const/4 v4, 0x4

    .line 52
    invoke-direct {v3, p0, v4, v1}, Lc9/c2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v1, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 56
    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    return v0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Ljava/io/Serializable;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    aput-object p2, v1, v2

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    aput-object p3, v1, v2

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "rawQuery"

    .line 15
    .line 16
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {v2, v3, v4}, Lh/Hchat/utils/KavaReflector;->findCompatibleMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v3, "rawQueryWithFactory"

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    filled-new-array {v4, p2, p3, v4}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {v2, v3, v5}, Lh/Hchat/utils/KavaReflector;->findCompatibleMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    :goto_0
    iget-object v5, p0, Lha/j0;->e:Ljava/lang/ThreadLocal;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    check-cast v6, Ljava/lang/Boolean;

    .line 51
    .line 52
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v5, v7}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-static {v7, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    filled-new-array {v4, p2, p3, v4}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-static {v2, p1, p2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    instance-of p2, p1, Landroid/database/Cursor;

    .line 76
    .line 77
    if-eqz p2, :cond_2

    .line 78
    .line 79
    move-object v4, p1

    .line 80
    check-cast v4, Landroid/database/Cursor;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    goto :goto_2

    .line 85
    :cond_1
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-static {v2, p1, p2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    instance-of p2, p1, Landroid/database/Cursor;

    .line 94
    .line 95
    if-eqz p2, :cond_2

    .line 96
    .line 97
    move-object v4, p1

    .line 98
    check-cast v4, Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    :cond_2
    :goto_1
    invoke-virtual {v5, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-object v4

    .line 104
    :goto_2
    invoke-virtual {v5, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_3
    return-object v4
.end method

.method public final o(Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 16

    .line 1
    invoke-virtual/range {p1 .. p2}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_7

    .line 8
    .line 9
    :cond_0
    :try_start_0
    invoke-virtual/range {p1 .. p2}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    new-instance v1, Lsf/f;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object v0, v1

    .line 21
    :goto_0
    nop

    .line 22
    instance-of v1, v0, Lsf/f;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    :cond_1
    check-cast v0, [B

    .line 28
    .line 29
    if-eqz v0, :cond_f

    .line 30
    .line 31
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lha/j0;->f()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 48
    .line 49
    array-length v4, v0

    .line 50
    array-length v5, v1

    .line 51
    add-int/2addr v4, v5

    .line 52
    const/16 v5, 0x8

    .line 53
    .line 54
    add-int/2addr v4, v5

    .line 55
    invoke-direct {v3, v4}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 56
    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    move v6, v4

    .line 60
    move v7, v6

    .line 61
    move v8, v7

    .line 62
    :goto_1
    array-length v9, v0

    .line 63
    const/4 v10, 0x1

    .line 64
    if-ge v6, v9, :cond_d

    .line 65
    .line 66
    invoke-static {v0, v6}, Lha/j0;->u([BI)Lha/i0;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    iget v9, v6, Lha/i0;->b:I

    .line 73
    .line 74
    iget-wide v11, v6, Lha/i0;->a:J

    .line 75
    .line 76
    const/4 v6, 0x3

    .line 77
    ushr-long v13, v11, v6

    .line 78
    .line 79
    long-to-int v6, v13

    .line 80
    const-wide/16 v13, 0x7

    .line 81
    .line 82
    and-long/2addr v13, v11

    .line 83
    long-to-int v13, v13

    .line 84
    invoke-static {v3, v11, v12}, Lha/j0;->y(Ljava/io/ByteArrayOutputStream;J)V

    .line 85
    .line 86
    .line 87
    if-eqz v13, :cond_c

    .line 88
    .line 89
    if-eq v13, v10, :cond_a

    .line 90
    .line 91
    const/4 v11, 0x2

    .line 92
    const/4 v12, 0x5

    .line 93
    if-eq v13, v11, :cond_5

    .line 94
    .line 95
    if-eq v13, v12, :cond_3

    .line 96
    .line 97
    :catchall_1
    :cond_2
    :goto_2
    const/4 v2, 0x0

    .line 98
    goto/16 :goto_6

    .line 99
    .line 100
    :cond_3
    add-int/lit8 v6, v9, 0x4

    .line 101
    .line 102
    array-length v10, v0

    .line 103
    if-le v6, v10, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    const/4 v10, 0x4

    .line 107
    invoke-virtual {v3, v0, v9, v10}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    invoke-static {v0, v9}, Lha/j0;->u([BI)Lha/i0;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    if-eqz v9, :cond_2

    .line 116
    .line 117
    iget v11, v9, Lha/i0;->b:I

    .line 118
    .line 119
    iget-wide v13, v9, Lha/i0;->a:J

    .line 120
    .line 121
    long-to-int v9, v13

    .line 122
    if-ltz v9, :cond_2

    .line 123
    .line 124
    add-int v15, v11, v9

    .line 125
    .line 126
    array-length v2, v0

    .line 127
    if-le v15, v2, :cond_6

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_6
    if-ne v6, v12, :cond_9

    .line 131
    .line 132
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v6, Ljava/lang/String;

    .line 138
    .line 139
    invoke-direct {v6, v0, v11, v9, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {p0 .. p0}, Lha/j0;->f()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-static {v6, v7}, Lha/j0;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v6, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    array-length v6, v2

    .line 158
    int-to-long v6, v6

    .line 159
    invoke-static {v3, v6, v7}, Lha/j0;->y(Ljava/io/ByteArrayOutputStream;J)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V

    .line 163
    .line 164
    .line 165
    if-nez v8, :cond_8

    .line 166
    .line 167
    array-length v6, v2

    .line 168
    if-ne v6, v9, :cond_8

    .line 169
    .line 170
    invoke-static {v0, v11, v15}, Ltf/l;->t0([BII)[B

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-static {v2, v6}, Ljava/util/Arrays;->equals([B[B)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-nez v2, :cond_7

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_7
    move v8, v4

    .line 182
    goto :goto_4

    .line 183
    :cond_8
    :goto_3
    move v8, v10

    .line 184
    :goto_4
    move v7, v10

    .line 185
    goto :goto_5

    .line 186
    :cond_9
    invoke-static {v3, v13, v14}, Lha/j0;->y(Ljava/io/ByteArrayOutputStream;J)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3, v0, v11, v9}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 190
    .line 191
    .line 192
    :goto_5
    move v6, v15

    .line 193
    goto/16 :goto_1

    .line 194
    .line 195
    :cond_a
    add-int/lit8 v2, v9, 0x8

    .line 196
    .line 197
    array-length v6, v0

    .line 198
    if-le v2, v6, :cond_b

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_b
    invoke-virtual {v3, v0, v9, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 202
    .line 203
    .line 204
    move v6, v2

    .line 205
    goto/16 :goto_1

    .line 206
    .line 207
    :cond_c
    invoke-static {v0, v9}, Lha/j0;->u([BI)Lha/i0;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    if-eqz v2, :cond_2

    .line 212
    .line 213
    iget v6, v2, Lha/i0;->b:I

    .line 214
    .line 215
    iget-wide v9, v2, Lha/i0;->a:J

    .line 216
    .line 217
    invoke-static {v3, v9, v10}, Lha/j0;->y(Ljava/io/ByteArrayOutputStream;J)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_1

    .line 221
    .line 222
    :cond_d
    if-nez v7, :cond_e

    .line 223
    .line 224
    const-wide/16 v4, 0x2a

    .line 225
    .line 226
    invoke-static {v3, v4, v5}, Lha/j0;->y(Ljava/io/ByteArrayOutputStream;J)V

    .line 227
    .line 228
    .line 229
    array-length v0, v1

    .line 230
    int-to-long v4, v0

    .line 231
    invoke-static {v3, v4, v5}, Lha/j0;->y(Ljava/io/ByteArrayOutputStream;J)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v1}, Ljava/io/OutputStream;->write([B)V

    .line 235
    .line 236
    .line 237
    move v8, v10

    .line 238
    :cond_e
    if-eqz v8, :cond_2

    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 241
    .line 242
    .line 243
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 244
    :goto_6
    if-eqz v2, :cond_f

    .line 245
    .line 246
    move-object/from16 v1, p1

    .line 247
    .line 248
    move-object/from16 v3, p2

    .line 249
    .line 250
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 251
    .line 252
    .line 253
    :cond_f
    :goto_7
    return-void
.end method

.method public final q(Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    new-instance v1, Lsf/f;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object v0, v1

    .line 20
    :goto_0
    nop

    .line 21
    instance-of v1, v0, Lsf/f;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    const-string v0, ""

    .line 31
    .line 32
    :cond_2
    invoke-virtual {p0}, Lha/j0;->f()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v0, v1}, Lha/j0;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p1, p2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    :goto_1
    return-void
.end method

.method public final r([B)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lha/j0;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    const-string v1, "com.tencent.mm.protocal.protobuf.SnsObject"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    new-array v2, v1, [Ljava/lang/Class;

    .line 15
    .line 16
    invoke-static {v0, v2}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-array v1, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "parseFrom"

    .line 35
    .line 36
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v1, v2, v3}, Lh/Hchat/utils/KavaReflector;->findCompatibleMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {v1, v0, p1}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    return-object v0

    .line 58
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 59
    return-object p1
.end method

.method public final s(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)[B
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lha/j0;->j(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 6
    if-eqz p1, :cond_7

    .line 7
    .line 8
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->getColumnCount()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/4 p3, 0x0

    .line 20
    invoke-static {p3, p2}, Lr9/e0;->r0(II)Llg/d;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    :cond_1
    move-object v1, p2

    .line 29
    check-cast v1, Llg/c;

    .line 30
    .line 31
    iget-boolean v1, v1, Llg/c;->i:Z

    .line 32
    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    move-object v1, p2

    .line 36
    check-cast v1, Llg/c;

    .line 37
    .line 38
    invoke-virtual {v1}, Llg/c;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object v2, v1

    .line 43
    check-cast v2, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 49
    :try_start_2
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnName(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v2

    .line 55
    :try_start_3
    new-instance v3, Lsf/f;

    .line 56
    .line 57
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    move-object v2, v3

    .line 61
    :goto_0
    nop

    .line 62
    instance-of v3, v2, Lsf/f;

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    move-object v2, v0

    .line 67
    :cond_2
    check-cast v2, Ljava/lang/String;

    .line 68
    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    const-string v2, ""

    .line 72
    .line 73
    :cond_3
    const-string v3, "attrBuf"

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-nez v3, :cond_5

    .line 80
    .line 81
    const-string v3, "field_attrBuf"

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    move-object v1, v0

    .line 91
    :cond_5
    :goto_1
    check-cast v1, Ljava/lang/Integer;

    .line 92
    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    :cond_6
    invoke-interface {p1, p3}, Landroid/database/Cursor;->getBlob(I)[B

    .line 100
    .line 101
    .line 102
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 103
    :goto_2
    :try_start_4
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_7
    :goto_3
    if-eqz p1, :cond_8

    .line 108
    .line 109
    :try_start_5
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 110
    .line 111
    .line 112
    :catchall_1
    :cond_8
    return-object v0

    .line 113
    :catchall_2
    move-object p1, v0

    .line 114
    :catchall_3
    if-eqz p1, :cond_9

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :catchall_4
    :cond_9
    :goto_4
    return-object v0
.end method

.method public final t(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lha/j0;->j(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    invoke-interface {p1, p2}, Landroid/database/Cursor;->isNull(I)Z

    .line 17
    .line 18
    .line 19
    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    :try_start_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    .line 24
    .line 25
    :catchall_0
    return-object v0

    .line 26
    :cond_1
    :try_start_3
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getInt(I)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 34
    :goto_0
    :try_start_4
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 39
    .line 40
    :try_start_5
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 41
    .line 42
    .line 43
    :catchall_1
    :cond_3
    return-object v0

    .line 44
    :catchall_2
    move-object p1, v0

    .line 45
    :catchall_3
    if-eqz p1, :cond_4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_4
    :cond_4
    :goto_2
    return-object v0
.end method
