.class public final Lnuke/ui/HomeActivity;
.super Lqj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lqj;->$stable:I

    .line 2
    .line 3
    sput v0, Lnuke/ui/HomeActivity;->$stable:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lqj;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final createLocalizedContext(Lc73;)Landroid/content/Context;
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lnuke/ui/HomeActivity;->languageLocale(Lc73;)Ljava/util/Locale;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Landroid/content/res/Configuration;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Landroid/os/LocaleList;

    .line 22
    .line 23
    filled-new-array {p1}, [Ljava/util/Locale;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-direct {v1, v2}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Llg3;->a(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

.method private final ensureHookersLoaded()V
    .locals 3

    .line 1
    sget-object v0, Lrg3;->i:[Lvj;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    if-nez v0, :cond_2

    .line 12
    .line 13
    sget-object v0, Lrg3;->j:[Lgw;

    .line 14
    .line 15
    array-length v0, v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    move v1, v2

    .line 19
    :cond_1
    if-nez v1, :cond_2

    .line 20
    .line 21
    return-void

    .line 22
    :cond_2
    invoke-direct {p0}, Lnuke/ui/HomeActivity;->refreshHookers()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static synthetic f(Llp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lpx;I)La83;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$17$0(Llp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lpx;I)La83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Lnuke/ui/HomeActivity;Lpx;I)La83;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lnuke/ui/HomeActivity;->onCreate$lambda$0(Lnuke/ui/HomeActivity;Lpx;I)La83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h(Lnuke/ui/HomeActivity;Lxk1;Lc73;)La83;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$17$0$0$3$0(Lnuke/ui/HomeActivity;Lxk1;Lc73;)La83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Lnuke/ui/HomeActivity;Lxk1;Z)La83;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$17$0$0$1$0(Lnuke/ui/HomeActivity;Lxk1;Z)La83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final isSystemDarkTheme()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 10
    .line 11
    and-int/lit8 p0, p0, 0x30

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static synthetic j(Lnuke/ui/HomeActivity;Lxk1;Lxk1;)La83;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$17$0$0$0$0(Lnuke/ui/HomeActivity;Lxk1;Lxk1;)La83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k(Lxk1;)La83;
    .locals 0

    .line 1
    invoke-static {p0}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$17$0$0$5$0(Lxk1;)La83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic l(Lnuke/ui/HomeActivity;Z)La83;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$16$0(Lnuke/ui/HomeActivity;Z)La83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final languageLocale(Lc73;)Ljava/util/Locale;
    .locals 0

    .line 1
    iget p0, p1, Lc73;->b:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    if-eq p0, p1, :cond_2

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    if-eq p0, p1, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    if-eq p0, p1, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    sget-object p0, Ljava/util/Locale;->TRADITIONAL_CHINESE:Ljava/util/Locale;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_2
    sget-object p0, Ljava/util/Locale;->SIMPLIFIED_CHINESE:Ljava/util/Locale;

    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic m(Lnuke/ui/HomeActivity;Lxk1;)La83;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$17$0$0$4$0(Lnuke/ui/HomeActivity;Lxk1;)La83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic n(Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lxk1;Lpx;I)La83;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$17$0$0(Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lxk1;Lpx;I)La83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic o(Llp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lpx;I)La83;
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    move-object p1, p0

    .line 3
    move p0, p4

    .line 4
    move-object p4, p3

    .line 5
    move-object p3, p2

    .line 6
    move-object p2, v0

    .line 7
    invoke-static/range {p0 .. p9}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$17(ZLlp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;Ljava/util/Map;Lxk1;Lxk1;Lpx;I)La83;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final onCreate$lambda$0(Lnuke/ui/HomeActivity;Lpx;I)La83;
    .locals 16

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    and-int/lit8 v0, p2, 0x3

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x2

    .line 8
    if-eq v0, v3, :cond_0

    .line 9
    .line 10
    move v0, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_0
    and-int/lit8 v5, p2, 0x1

    .line 14
    .line 15
    move-object/from16 v9, p1

    .line 16
    .line 17
    check-cast v9, Lgo0;

    .line 18
    .line 19
    invoke-virtual {v9, v5, v0}, Lgo0;->O(IZ)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_17

    .line 24
    .line 25
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v5, Lnx;->a:Leb;

    .line 30
    .line 31
    if-ne v0, v5, :cond_1

    .line 32
    .line 33
    invoke-direct {v4}, Lnuke/ui/HomeActivity;->readUIConfig()Lc73;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v9, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    check-cast v0, Lxk1;

    .line 45
    .line 46
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    if-ne v6, v5, :cond_2

    .line 51
    .line 52
    sget-object v6, Lpp1;->a:Lpp1;

    .line 53
    .line 54
    invoke-static {}, Lpp1;->f()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-static {v6}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v9, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    move-object v8, v6

    .line 70
    check-cast v8, Lxk1;

    .line 71
    .line 72
    new-array v6, v2, [Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    if-ne v7, v5, :cond_3

    .line 79
    .line 80
    new-instance v7, Ldy;

    .line 81
    .line 82
    const/16 v10, 0xc

    .line 83
    .line 84
    invoke-direct {v7, v10}, Ldy;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    check-cast v7, Lxm0;

    .line 91
    .line 92
    const/16 v10, 0x30

    .line 93
    .line 94
    invoke-static {v6, v7, v9, v10}, Lgf1;->M([Ljava/lang/Object;Lxm0;Lpx;I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    check-cast v6, Lxk1;

    .line 99
    .line 100
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    if-ne v7, v5, :cond_4

    .line 105
    .line 106
    sget-object v7, Lfe0;->h:Lfe0;

    .line 107
    .line 108
    invoke-static {v7}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-virtual {v9, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    check-cast v7, Lxk1;

    .line 116
    .line 117
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    if-ne v11, v5, :cond_c

    .line 122
    .line 123
    sget-object v11, Lrg3;->j:[Lgw;

    .line 124
    .line 125
    new-instance v12, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    array-length v13, v11

    .line 131
    move v14, v2

    .line 132
    :goto_1
    if-ge v14, v13, :cond_6

    .line 133
    .line 134
    aget-object v15, v11, v14

    .line 135
    .line 136
    instance-of v2, v15, Lgx2;

    .line 137
    .line 138
    if-eqz v2, :cond_5

    .line 139
    .line 140
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    :cond_5
    add-int/lit8 v14, v14, 0x1

    .line 144
    .line 145
    const/4 v2, 0x0

    .line 146
    goto :goto_1

    .line 147
    :cond_6
    sget-object v2, Lst0;->a:Ljava/util/ArrayList;

    .line 148
    .line 149
    new-instance v2, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    :cond_7
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    if-eqz v12, :cond_9

    .line 163
    .line 164
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    move-object v13, v12

    .line 169
    check-cast v13, Lvj;

    .line 170
    .line 171
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v13}, Lvj;->e()Z

    .line 175
    .line 176
    .line 177
    move-result v14

    .line 178
    if-nez v14, :cond_8

    .line 179
    .line 180
    invoke-virtual {v13}, Lvj;->f()Z

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    if-nez v13, :cond_7

    .line 185
    .line 186
    :cond_8
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_9
    const/16 v11, 0xa

    .line 191
    .line 192
    invoke-static {v2, v11}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    invoke-static {v11}, Lxe1;->U(I)I

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    const/16 v12, 0x10

    .line 201
    .line 202
    if-ge v11, v12, :cond_a

    .line 203
    .line 204
    move v11, v12

    .line 205
    :cond_a
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 206
    .line 207
    invoke-direct {v12, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    if-eqz v11, :cond_b

    .line 219
    .line 220
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    check-cast v11, Lgx2;

    .line 225
    .line 226
    invoke-virtual {v11}, Lvj;->d()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v13

    .line 230
    invoke-static {v11}, Lci0;->N(Lgx2;)Z

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    invoke-interface {v12, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_b
    invoke-virtual {v9, v12}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    move-object v11, v12

    .line 246
    :cond_c
    check-cast v11, Ljava/util/Map;

    .line 247
    .line 248
    invoke-static {v9}, Lop0;->s(Lpx;)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    invoke-static {v0}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$1(Lxk1;)Lc73;

    .line 253
    .line 254
    .line 255
    move-result-object v12

    .line 256
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    iget v12, v12, Lc73;->a:I

    .line 260
    .line 261
    if-eq v12, v1, :cond_d

    .line 262
    .line 263
    if-eq v12, v3, :cond_e

    .line 264
    .line 265
    move v1, v2

    .line 266
    goto :goto_4

    .line 267
    :cond_d
    const/4 v1, 0x0

    .line 268
    :cond_e
    :goto_4
    invoke-static {v0}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$1(Lxk1;)Lc73;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    iget-object v2, v2, Lc73;->d:Lb73;

    .line 273
    .line 274
    invoke-virtual {v9, v1}, Lgo0;->g(Z)Z

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    invoke-virtual {v9, v2}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    or-int/2addr v2, v3

    .line 283
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    if-nez v2, :cond_f

    .line 288
    .line 289
    if-ne v3, v5, :cond_10

    .line 290
    .line 291
    :cond_f
    invoke-static {v0}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$1(Lxk1;)Lc73;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    iget-object v2, v2, Lc73;->d:Lb73;

    .line 296
    .line 297
    invoke-static {v2, v1}, Lp7;->L(Lb73;Z)Llp1;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-virtual {v9, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    :cond_10
    move-object v2, v3

    .line 305
    check-cast v2, Llp1;

    .line 306
    .line 307
    invoke-static {v0}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$1(Lxk1;)Lc73;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    iget v3, v3, Lc73;->b:I

    .line 312
    .line 313
    invoke-virtual {v9, v3}, Lgo0;->d(I)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v12

    .line 321
    if-nez v3, :cond_11

    .line 322
    .line 323
    if-ne v12, v5, :cond_12

    .line 324
    .line 325
    :cond_11
    invoke-static {v0}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$1(Lxk1;)Lc73;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-direct {v4, v3}, Lnuke/ui/HomeActivity;->createLocalizedContext(Lc73;)Landroid/content/Context;

    .line 330
    .line 331
    .line 332
    move-result-object v12

    .line 333
    invoke-virtual {v9, v12}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    :cond_12
    check-cast v12, Landroid/content/Context;

    .line 337
    .line 338
    invoke-virtual {v9, v12}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v13

    .line 346
    if-nez v3, :cond_13

    .line 347
    .line 348
    if-ne v13, v5, :cond_14

    .line 349
    .line 350
    :cond_13
    new-instance v13, Landroid/content/res/Configuration;

    .line 351
    .line 352
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-direct {v13, v3}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v9, v13}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_14
    check-cast v13, Landroid/content/res/Configuration;

    .line 367
    .line 368
    invoke-virtual {v9, v4}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    invoke-virtual {v9, v1}, Lgo0;->g(Z)Z

    .line 373
    .line 374
    .line 375
    move-result v14

    .line 376
    or-int/2addr v3, v14

    .line 377
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v14

    .line 381
    if-nez v3, :cond_15

    .line 382
    .line 383
    if-ne v14, v5, :cond_16

    .line 384
    .line 385
    :cond_15
    new-instance v14, Lp00;

    .line 386
    .line 387
    invoke-direct {v14, v4, v1}, Lp00;-><init>(Lnuke/ui/HomeActivity;Z)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v9, v14}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    :cond_16
    check-cast v14, Lxm0;

    .line 394
    .line 395
    invoke-static {v14, v9}, Leu;->r(Lxm0;Lpx;)V

    .line 396
    .line 397
    .line 398
    sget-object v3, Lr7;->b:Ltu2;

    .line 399
    .line 400
    invoke-virtual {v3, v12}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    sget-object v5, Lr7;->a:Lmy;

    .line 405
    .line 406
    invoke-virtual {v5, v13}, Lmy;->a(Ljava/lang/Object;)Lf42;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    filled-new-array {v3, v5}, [Lf42;

    .line 411
    .line 412
    .line 413
    move-result-object v12

    .line 414
    move-object v3, v0

    .line 415
    new-instance v0, Lat0;

    .line 416
    .line 417
    move-object v5, v6

    .line 418
    move-object v6, v11

    .line 419
    invoke-direct/range {v0 .. v8}, Lat0;-><init>(ZLlp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;Ljava/util/Map;Lxk1;Lxk1;)V

    .line 420
    .line 421
    .line 422
    const v1, 0x5cbdecab

    .line 423
    .line 424
    .line 425
    invoke-static {v1, v0, v9}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-static {v12, v0, v9, v10}, Lci0;->b([Lf42;Lmn0;Lpx;I)V

    .line 430
    .line 431
    .line 432
    goto :goto_5

    .line 433
    :cond_17
    invoke-virtual {v9}, Lgo0;->R()V

    .line 434
    .line 435
    .line 436
    :goto_5
    sget-object v0, La83;->a:La83;

    .line 437
    .line 438
    return-object v0
.end method

.method private static final onCreate$lambda$0$1(Lxk1;)Lc73;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxk1;",
            ")",
            "Lc73;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lc73;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final onCreate$lambda$0$10(Lxk1;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxk1;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/Set;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final onCreate$lambda$0$11(Lxk1;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxk1;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final onCreate$lambda$0$16$0(Lnuke/ui/HomeActivity;Z)La83;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnuke/ui/HomeActivity;->updateSystemBarAppearance(Z)V

    .line 2
    .line 3
    .line 4
    sget-object p0, La83;->a:La83;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final onCreate$lambda$0$17(ZLlp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;Ljava/util/Map;Lxk1;Lxk1;Lpx;I)La83;
    .locals 13

    .line 1
    and-int/lit8 v0, p9, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    and-int/lit8 v1, p9, 0x1

    .line 11
    .line 12
    move-object/from16 v2, p8

    .line 13
    .line 14
    check-cast v2, Lgo0;

    .line 15
    .line 16
    invoke-virtual {v2, v1, v0}, Lgo0;->O(IZ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-wide v0, p1, Llp1;->g:J

    .line 23
    .line 24
    new-instance v3, Lju;

    .line 25
    .line 26
    invoke-direct {v3, v0, v1}, Lju;-><init>(J)V

    .line 27
    .line 28
    .line 29
    new-instance v4, Lat0;

    .line 30
    .line 31
    move v9, p0

    .line 32
    move-object v5, p1

    .line 33
    move-object v6, p2

    .line 34
    move-object/from16 v7, p3

    .line 35
    .line 36
    move-object/from16 v8, p4

    .line 37
    .line 38
    move-object/from16 v10, p5

    .line 39
    .line 40
    move-object/from16 v11, p6

    .line 41
    .line 42
    move-object/from16 v12, p7

    .line 43
    .line 44
    invoke-direct/range {v4 .. v12}, Lat0;-><init>(Llp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;)V

    .line 45
    .line 46
    .line 47
    const p1, 0x20a8a869

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v4, v2}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const/16 p2, 0xc30

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    move-object/from16 p4, p1

    .line 58
    .line 59
    move/from16 p6, p2

    .line 60
    .line 61
    move p2, v0

    .line 62
    move-object/from16 p5, v2

    .line 63
    .line 64
    move-object/from16 p3, v3

    .line 65
    .line 66
    move p1, p0

    .line 67
    invoke-static/range {p1 .. p6}, Lz13;->a(ZZLju;Lkw;Lpx;I)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move-object p0, v2

    .line 72
    invoke-virtual {p0}, Lgo0;->R()V

    .line 73
    .line 74
    .line 75
    :goto_1
    sget-object p0, La83;->a:La83;

    .line 76
    .line 77
    return-object p0
.end method

.method private static final onCreate$lambda$0$17$0(Llp1;Lxk1;Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lpx;I)La83;
    .locals 11

    .line 1
    and-int/lit8 v0, p9, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    and-int/lit8 v1, p9, 0x1

    .line 11
    .line 12
    move-object/from16 v2, p8

    .line 13
    .line 14
    check-cast v2, Lgo0;

    .line 15
    .line 16
    invoke-virtual {v2, v1, v0}, Lgo0;->O(IZ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$1(Lxk1;)Lc73;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-boolean v0, v0, Lc73;->c:Z

    .line 27
    .line 28
    new-instance v3, Lys0;

    .line 29
    .line 30
    move-object v9, p1

    .line 31
    move-object v4, p2

    .line 32
    move-object v5, p3

    .line 33
    move v6, p4

    .line 34
    move-object/from16 v7, p5

    .line 35
    .line 36
    move-object/from16 v8, p6

    .line 37
    .line 38
    move-object/from16 v10, p7

    .line 39
    .line 40
    invoke-direct/range {v3 .. v10}, Lys0;-><init>(Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lxk1;)V

    .line 41
    .line 42
    .line 43
    const p1, -0x4a3d445c

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v3, v2}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/16 p2, 0x180

    .line 51
    .line 52
    invoke-static {p0, v0, p1, v2, p2}, Lur1;->a(Llp1;ZLkw;Lpx;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {v2}, Lgo0;->R()V

    .line 57
    .line 58
    .line 59
    :goto_1
    sget-object p0, La83;->a:La83;

    .line 60
    .line 61
    return-object p0
.end method

.method private static final onCreate$lambda$0$17$0$0(Lnuke/ui/HomeActivity;Lxk1;ZLjava/util/Map;Lxk1;Lxk1;Lxk1;Lpx;I)La83;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    and-int/lit8 v4, p8, 0x3

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    if-eq v4, v5, :cond_0

    .line 15
    .line 16
    move v4, v6

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v4, v7

    .line 19
    :goto_0
    and-int/lit8 v5, p8, 0x1

    .line 20
    .line 21
    move-object/from16 v8, p7

    .line 22
    .line 23
    check-cast v8, Lgo0;

    .line 24
    .line 25
    invoke-virtual {v8, v5, v4}, Lgo0;->O(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_e

    .line 30
    .line 31
    invoke-virtual {v8, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v8, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    or-int/2addr v4, v5

    .line 40
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    sget-object v9, Lnx;->a:Leb;

    .line 45
    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    if-ne v5, v9, :cond_2

    .line 49
    .line 50
    :cond_1
    new-instance v5, Ls1;

    .line 51
    .line 52
    const/16 v4, 0xa

    .line 53
    .line 54
    invoke-direct {v5, v0, v3, v1, v4}, Ls1;-><init>(Ljava/lang/Object;Lxk1;Lxk1;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v8, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    check-cast v5, Lxm0;

    .line 61
    .line 62
    invoke-static {v7, v5, v8, v7, v6}, Lpp0;->c(ZLxm0;Lpx;II)V

    .line 63
    .line 64
    .line 65
    invoke-static/range {p5 .. p5}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$1(Lxk1;)Lc73;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    invoke-static/range {p6 .. p6}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$4(Lxk1;)Z

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    invoke-virtual {v8, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    if-nez v4, :cond_3

    .line 82
    .line 83
    if-ne v5, v9, :cond_4

    .line 84
    .line 85
    :cond_3
    new-instance v5, Lzs0;

    .line 86
    .line 87
    move-object/from16 v4, p6

    .line 88
    .line 89
    invoke-direct {v5, v0, v4, v7}, Lzs0;-><init>(Lnuke/ui/HomeActivity;Lxk1;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    move-object v13, v5

    .line 96
    check-cast v13, Lin0;

    .line 97
    .line 98
    invoke-virtual {v8, v2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-nez v4, :cond_5

    .line 107
    .line 108
    if-ne v5, v9, :cond_6

    .line 109
    .line 110
    :cond_5
    new-instance v5, Laf;

    .line 111
    .line 112
    const/4 v4, 0x7

    .line 113
    invoke-direct {v5, v4, v2, v3}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v8, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_6
    move-object v14, v5

    .line 120
    check-cast v14, Lmn0;

    .line 121
    .line 122
    invoke-virtual {v8, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    if-nez v2, :cond_7

    .line 131
    .line 132
    if-ne v3, v9, :cond_8

    .line 133
    .line 134
    :cond_7
    new-instance v3, Lzs0;

    .line 135
    .line 136
    move-object/from16 v2, p5

    .line 137
    .line 138
    invoke-direct {v3, v0, v2, v6}, Lzs0;-><init>(Lnuke/ui/HomeActivity;Lxk1;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v8, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_8
    move-object v15, v3

    .line 145
    check-cast v15, Lin0;

    .line 146
    .line 147
    const/16 v17, 0x200

    .line 148
    .line 149
    move-object/from16 v16, v8

    .line 150
    .line 151
    const/4 v8, 0x0

    .line 152
    move-object v2, v9

    .line 153
    const/4 v9, 0x0

    .line 154
    move/from16 v11, p2

    .line 155
    .line 156
    invoke-static/range {v8 .. v17}, Ltp0;->a(Ljava/util/List;Ljava/util/List;Lc73;ZZLin0;Lmn0;Lin0;Lpx;I)V

    .line 157
    .line 158
    .line 159
    move-object/from16 v3, v16

    .line 160
    .line 161
    invoke-static {v1}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$7(Lxk1;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_d

    .line 166
    .line 167
    const v4, -0x4f9b4fbc

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v4}, Lgo0;->W(I)V

    .line 171
    .line 172
    .line 173
    const v4, 0x790b010e

    .line 174
    .line 175
    .line 176
    invoke-static {v4, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    const v4, 0x790b010d

    .line 181
    .line 182
    .line 183
    invoke-static {v4, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    const v4, 0x790b010b

    .line 188
    .line 189
    .line 190
    invoke-static {v4, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    const v4, 0x790b010c

    .line 195
    .line 196
    .line 197
    invoke-static {v4, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v14

    .line 201
    invoke-virtual {v3, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    invoke-virtual {v3, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    or-int/2addr v4, v5

    .line 210
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    if-nez v4, :cond_9

    .line 215
    .line 216
    if-ne v5, v2, :cond_a

    .line 217
    .line 218
    :cond_9
    new-instance v5, Lr1;

    .line 219
    .line 220
    const/16 v4, 0x11

    .line 221
    .line 222
    invoke-direct {v5, v4, v0, v1}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_a
    move-object v8, v5

    .line 229
    check-cast v8, Lxm0;

    .line 230
    .line 231
    invoke-virtual {v3, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    if-nez v0, :cond_b

    .line 240
    .line 241
    if-ne v4, v2, :cond_c

    .line 242
    .line 243
    :cond_b
    new-instance v4, Lf0;

    .line 244
    .line 245
    const/16 v0, 0x17

    .line 246
    .line 247
    invoke-direct {v4, v1, v0}, Lf0;-><init>(Lxk1;I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v3, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_c
    move-object v12, v4

    .line 254
    check-cast v12, Lxm0;

    .line 255
    .line 256
    const/16 v17, 0x0

    .line 257
    .line 258
    const/16 v18, 0xa0

    .line 259
    .line 260
    const/4 v13, 0x0

    .line 261
    const/4 v15, 0x0

    .line 262
    move-object/from16 v16, v3

    .line 263
    .line 264
    invoke-static/range {v8 .. v18}, Lqp0;->c(Lxm0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxm0;Luh1;Ljava/lang/String;Ln80;Lpx;II)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, v7}, Lgo0;->p(Z)V

    .line 268
    .line 269
    .line 270
    goto :goto_1

    .line 271
    :cond_d
    const v0, -0x4f8e5622

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v0}, Lgo0;->W(I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v7}, Lgo0;->p(Z)V

    .line 278
    .line 279
    .line 280
    goto :goto_1

    .line 281
    :cond_e
    move-object v3, v8

    .line 282
    invoke-virtual {v3}, Lgo0;->R()V

    .line 283
    .line 284
    .line 285
    :goto_1
    sget-object v0, La83;->a:La83;

    .line 286
    .line 287
    return-object v0
.end method

.method private static final onCreate$lambda$0$17$0$0$0$0(Lnuke/ui/HomeActivity;Lxk1;Lxk1;)La83;
    .locals 0

    .line 1
    invoke-static {p1}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$10(Lxk1;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x1

    .line 16
    invoke-static {p2, p0}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$8(Lxk1;Z)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 20
    .line 21
    return-object p0
.end method

.method private static final onCreate$lambda$0$17$0$0$1$0(Lnuke/ui/HomeActivity;Lxk1;Z)La83;
    .locals 6

    .line 1
    sget-object v0, La83;->a:La83;

    .line 2
    .line 3
    sget-object v1, Lpp1;->a:Lpp1;

    .line 4
    .line 5
    invoke-static {}, Lpp1;->c()Lop1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "security_mode"

    .line 17
    .line 18
    invoke-virtual {v1, v3, v2}, Lop1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lsq1;->a:Lsq1;

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    sget-boolean v1, Lsq1;->f:Z

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v1, Lsq1;->b:Ls00;

    .line 31
    .line 32
    new-instance v2, Lh50;

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    const/16 v4, 0x8

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-direct {v2, v3, v5, v4}, Lh50;-><init>(ILt00;I)V

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x3

    .line 42
    invoke-static {v1, v5, v2, v3}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    if-eqz p2, :cond_5

    .line 46
    .line 47
    sget-object p2, Lst0;->a:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-static {p2}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    new-instance v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    move-object v3, v2

    .line 73
    check-cast v3, Lvj;

    .line 74
    .line 75
    invoke-virtual {v3}, Lvj;->b()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-nez v3, :cond_2

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lvj;

    .line 100
    .line 101
    :try_start_0
    invoke-static {v1}, Lst0;->c(Lvj;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    move-object v3, v0

    .line 105
    goto :goto_3

    .line 106
    :catchall_0
    move-exception v2

    .line 107
    new-instance v3, Lx92;

    .line 108
    .line 109
    invoke-direct {v3, v2}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :goto_3
    invoke-static {v3}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-eqz v2, :cond_4

    .line 117
    .line 118
    sget-object v3, Lpp1;->a:Lpp1;

    .line 119
    .line 120
    const-string v3, "uninstall"

    .line 121
    .line 122
    const-string v4, "Hooker uninstall failed"

    .line 123
    .line 124
    invoke-static {v1, v3, v2, v4}, Lpp1;->h(Lvj;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lvj;->d()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v1}, Lvj;->d()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v2}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    new-instance v4, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v5, "Hooker "

    .line 142
    .line 143
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v1, " uninstall failed: "

    .line 150
    .line 151
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-static {v3, v1}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    sget-object p2, Lpp1;->a:Lpp1;

    .line 166
    .line 167
    invoke-static {}, Lpp1;->f()Z

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    invoke-static {p1, p2}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$5(Lxk1;Z)V

    .line 172
    .line 173
    .line 174
    invoke-direct {p0}, Lnuke/ui/HomeActivity;->refreshHookers()V

    .line 175
    .line 176
    .line 177
    return-object v0
.end method

.method private static final onCreate$lambda$0$17$0$0$2$0(Ljava/util/Map;Lxk1;Lgx2;Z)La83;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lvj;->d()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/Boolean;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-virtual {p3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$10(Lxk1;)Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p2}, Lvj;->d()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p0, p2}, Lnp2;->a0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {p1}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$10(Lxk1;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p2}, Lvj;->d()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p0, p2}, Lnp2;->d0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_0
    invoke-static {p1, p0}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$11(Lxk1;Ljava/util/Set;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    sget-object p0, La83;->a:La83;

    .line 55
    .line 56
    return-object p0
.end method

.method private static final onCreate$lambda$0$17$0$0$3$0(Lnuke/ui/HomeActivity;Lxk1;Lc73;)La83;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$2(Lxk1;Lc73;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lnuke/ui/HomeActivity;->writeUIConfig(Lc73;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, La83;->a:La83;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final onCreate$lambda$0$17$0$0$4$0(Lnuke/ui/HomeActivity;Lxk1;)La83;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$8(Lxk1;Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 6
    .line 7
    .line 8
    sget-object p0, La83;->a:La83;

    .line 9
    .line 10
    return-object p0
.end method

.method private static final onCreate$lambda$0$17$0$0$5$0(Lxk1;)La83;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$8(Lxk1;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lfd3;->b()V

    .line 6
    .line 7
    .line 8
    sget-object p0, La83;->a:La83;

    .line 9
    .line 10
    return-object p0
.end method

.method private static final onCreate$lambda$0$2(Lxk1;Lc73;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxk1;",
            "Lc73;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final onCreate$lambda$0$4(Lxk1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxk1;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final onCreate$lambda$0$5(Lxk1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxk1;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final onCreate$lambda$0$6$0()Lxk1;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {v0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final onCreate$lambda$0$7(Lxk1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxk1;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final onCreate$lambda$0$8(Lxk1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxk1;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic p(Ljava/util/Map;Lxk1;Lgx2;Z)La83;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$17$0$0$2$0(Ljava/util/Map;Lxk1;Lgx2;Z)La83;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic q()Lxk1;
    .locals 1

    .line 1
    invoke-static {}, Lnuke/ui/HomeActivity;->onCreate$lambda$0$6$0()Lxk1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final readUIConfig()Lc73;
    .locals 3

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    sget-object v0, Lpp1;->a:Lpp1;

    .line 3
    .line 4
    invoke-static {}, Lpp1;->c()Lop1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "ui_config"

    .line 9
    .line 10
    sget-object v2, Lc73;->Companion:Lx63;

    .line 11
    .line 12
    invoke-virtual {v2}, Lx63;->serializer()Lw41;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Lse;->D(Lw41;)Lw41;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, v2, p0, v1}, Lop1;->b(Lw41;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lc73;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    new-instance v1, Lx92;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v1

    .line 34
    :goto_0
    nop

    .line 35
    instance-of v1, v0, Lx92;

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move-object p0, v0

    .line 41
    :goto_1
    check-cast p0, Lc73;

    .line 42
    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    new-instance p0, Lc73;

    .line 46
    .line 47
    invoke-direct {p0}, Lc73;-><init>()V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-object p0
.end method

.method private final refreshHookers()V
    .locals 6

    .line 1
    sget-object p0, Lpo0;->g:[Lvj;

    .line 2
    .line 3
    sget-object p0, Lpo0;->g:[Lvj;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sput-object p0, Lrg3;->i:[Lvj;

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    array-length v1, p0

    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-ge v3, v1, :cond_1

    .line 19
    .line 20
    aget-object v4, p0, v3

    .line 21
    .line 22
    instance-of v5, v4, Lgw;

    .line 23
    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    new-array p0, v2, [Lgw;

    .line 33
    .line 34
    invoke-interface {v0, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, [Lgw;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sput-object p0, Lrg3;->j:[Lgw;

    .line 44
    .line 45
    return-void
.end method

.method private final updateSystemBarAppearance(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance v1, Lhh1;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lhh1;-><init>(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v2, 0x23

    .line 21
    .line 22
    if-lt p0, v2, :cond_0

    .line 23
    .line 24
    new-instance p0, Lef3;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-direct {p0, v0, v1, v2}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/16 v2, 0x1e

    .line 32
    .line 33
    if-lt p0, v2, :cond_1

    .line 34
    .line 35
    new-instance p0, Ldf3;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {p0, v0, v1, v2}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    new-instance p0, Ldf3;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-direct {p0, v0, v1, v2}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 46
    .line 47
    .line 48
    :goto_0
    xor-int/lit8 p1, p1, 0x1

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Ldf3;->c(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ldf3;->b(Z)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method private final writeUIConfig(Lc73;)V
    .locals 2

    .line 1
    :try_start_0
    sget-object p0, Lpp1;->a:Lpp1;

    .line 2
    .line 3
    invoke-static {}, Lpp1;->c()Lop1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "ui_config"

    .line 8
    .line 9
    sget-object v1, Lc73;->Companion:Lx63;

    .line 10
    .line 11
    invoke-virtual {v1}, Lx63;->serializer()Lw41;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v1, p1, v0}, Lop1;->d(Lw41;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Lqj;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnuke/ui/HomeActivity;->ensureHookersLoaded()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lkx2;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p1, v0}, Lkx2;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Llx2;

    .line 14
    .line 15
    invoke-direct {v3, v0, v0, p1}, Llx2;-><init>(IILin0;)V

    .line 16
    .line 17
    .line 18
    sget p1, Lld0;->a:I

    .line 19
    .line 20
    sget v1, Lld0;->b:I

    .line 21
    .line 22
    new-instance v2, Lkx2;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Lkx2;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v4, Llx2;

    .line 28
    .line 29
    invoke-direct {v4, p1, v1, v2}, Llx2;-><init>(IILin0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget-object p1, Lld0;->c:Lmd0;

    .line 44
    .line 45
    if-nez p1, :cond_4

    .line 46
    .line 47
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    const/16 v1, 0x23

    .line 50
    .line 51
    if-lt p1, v1, :cond_0

    .line 52
    .line 53
    new-instance p1, Lqd0;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/16 v1, 0x1e

    .line 60
    .line 61
    if-lt p1, v1, :cond_1

    .line 62
    .line 63
    new-instance p1, Lpd0;

    .line 64
    .line 65
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const/16 v1, 0x1d

    .line 70
    .line 71
    if-lt p1, v1, :cond_2

    .line 72
    .line 73
    new-instance p1, Lod0;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    const/16 v1, 0x1c

    .line 80
    .line 81
    if-lt p1, v1, :cond_3

    .line 82
    .line 83
    new-instance p1, Lnd0;

    .line 84
    .line 85
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    new-instance p1, Lmd0;

    .line 90
    .line 91
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    :goto_0
    sput-object p1, Lld0;->c:Lmd0;

    .line 95
    .line 96
    :cond_4
    move-object v2, p1

    .line 97
    new-instance v1, Lkk;

    .line 98
    .line 99
    const/4 v7, 0x1

    .line 100
    move-object v5, p0

    .line 101
    invoke-direct/range {v1 .. v7}, Lkk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 102
    .line 103
    .line 104
    check-cast v6, Landroid/view/ViewGroup;

    .line 105
    .line 106
    :goto_1
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    const/16 p1, 0x8

    .line 111
    .line 112
    const/4 v3, 0x1

    .line 113
    if-ge v0, p0, :cond_7

    .line 114
    .line 115
    add-int/lit8 p0, v0, 0x1

    .line 116
    .line 117
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    instance-of v0, v0, Lmd0;

    .line 128
    .line 129
    if-eqz v0, :cond_5

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    move v0, p0

    .line 133
    goto :goto_1

    .line 134
    :cond_6
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 135
    .line 136
    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 137
    .line 138
    .line 139
    throw p0

    .line 140
    :cond_7
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    new-instance v0, Lkd0;

    .line 145
    .line 146
    invoke-direct {v0, v1, p0}, Lkd0;-><init>(Lkk;Landroid/content/Context;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 159
    .line 160
    .line 161
    :goto_2
    invoke-virtual {v1}, Lkk;->run()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, p0}, Lmd0;->a(Landroid/view/Window;)V

    .line 172
    .line 173
    .line 174
    new-instance p0, Ls9;

    .line 175
    .line 176
    invoke-direct {p0, p1, v5}, Ls9;-><init>(ILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    new-instance p1, Lkw;

    .line 180
    .line 181
    const v0, 0x2a40796b

    .line 182
    .line 183
    .line 184
    invoke-direct {p1, v0, v3, p0}, Lkw;-><init>(IZLun0;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v5, p1}, Lew;->a(Ldw;Lkw;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Lqj;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnuke/ui/HomeActivity;->readUIConfig()Lc73;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0}, Lnuke/ui/HomeActivity;->isSystemDarkTheme()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v0, v0, Lc73;->a:I

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    if-eq v0, v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    :goto_0
    invoke-direct {p0, v1}, Lnuke/ui/HomeActivity;->updateSystemBarAppearance(Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
