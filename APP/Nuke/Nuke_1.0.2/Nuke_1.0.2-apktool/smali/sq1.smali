.class public final Lsq1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lsq1;

.field public static final b:Ls00;

.field public static final c:Lkl1;

.field public static final d:Lju2;

.field public static final e:Lm52;

.field public static volatile f:Z

.field public static volatile g:Landroid/content/res/Resources;

.field public static h:Lb5;

.field public static i:Lwi2;

.field public static j:Lb5;

.field public static k:Lkj1;

.field public static l:Lkj1;

.field public static m:Lwj2;

.field public static n:Ldq1;

.field public static o:Ljn;

.field public static p:Lhv;

.field public static final q:Ljava/util/LinkedHashMap;

.field public static final r:Ljava/util/LinkedHashMap;

.field public static final s:Lak;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lsq1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsq1;->a:Lsq1;

    .line 7
    .line 8
    new-instance v0, Lmw2;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lm21;-><init>(Lk21;)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Lo90;->a:Lc60;

    .line 15
    .line 16
    sget-object v2, Lt50;->j:Lt50;

    .line 17
    .line 18
    invoke-static {v0, v2}, Lxe1;->f0(Ly10;La20;)La20;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lte;->e(La20;)Ls00;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lsq1;->b:Ls00;

    .line 27
    .line 28
    new-instance v0, Lkl1;

    .line 29
    .line 30
    invoke-direct {v0}, Lkl1;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lsq1;->c:Lkl1;

    .line 34
    .line 35
    new-instance v0, Ltq1;

    .line 36
    .line 37
    sget-object v2, Lbe0;->h:Lbe0;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v0, v2, v3, v1}, Ltq1;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lpp0;->f(Ljava/lang/Object;)Lju2;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lsq1;->d:Lju2;

    .line 48
    .line 49
    new-instance v2, Lm52;

    .line 50
    .line 51
    invoke-direct {v2, v0, v1}, Lm52;-><init>(Lju2;Lzt2;)V

    .line 52
    .line 53
    .line 54
    sput-object v2, Lsq1;->e:Lm52;

    .line 55
    .line 56
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lsq1;->q:Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lsq1;->r:Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    new-instance v0, Lak;

    .line 71
    .line 72
    const/high16 v1, 0x40000

    .line 73
    .line 74
    invoke-direct {v0, v1}, Lak;-><init>(I)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Lsq1;->s:Lak;

    .line 78
    .line 79
    return-void
.end method

.method public static final a(Lhv;Lfq;Lu00;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, Liq1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Liq1;

    .line 9
    .line 10
    iget v2, v1, Liq1;->o:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Liq1;->o:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Liq1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lu00;-><init>(Lt00;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Liq1;->n:Ljava/lang/Object;

    .line 28
    .line 29
    iget v2, v1, Liq1;->o:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    sget-object v7, Lk20;->h:Lk20;

    .line 36
    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object v2, v1, Liq1;->m:Lci2;

    .line 46
    .line 47
    iget-object v8, v1, Liq1;->l:Lin;

    .line 48
    .line 49
    iget-object v9, v1, Liq1;->k:Lhv;

    .line 50
    .line 51
    :try_start_0
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    move-object v2, v8

    .line 55
    move-object v0, v9

    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception v0

    .line 58
    move-object v14, v0

    .line 59
    move-object v0, v9

    .line 60
    move-object v9, v2

    .line 61
    move-object v2, v8

    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v6

    .line 70
    :cond_2
    iget-object v2, v1, Liq1;->m:Lci2;

    .line 71
    .line 72
    iget-object v8, v1, Liq1;->l:Lin;

    .line 73
    .line 74
    iget-object v9, v1, Liq1;->k:Lhv;

    .line 75
    .line 76
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object/from16 v16, v9

    .line 80
    .line 81
    move-object v9, v2

    .line 82
    move-object v2, v8

    .line 83
    move-object/from16 v8, v16

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    iget-object v2, v1, Liq1;->l:Lin;

    .line 87
    .line 88
    iget-object v8, v1, Liq1;->k:Lhv;

    .line 89
    .line 90
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-interface/range {p1 .. p1}, Lfq;->iterator()Lin;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    move-object v2, v0

    .line 102
    move-object/from16 v0, p0

    .line 103
    .line 104
    :goto_1
    iput-object v0, v1, Liq1;->k:Lhv;

    .line 105
    .line 106
    iput-object v2, v1, Liq1;->l:Lin;

    .line 107
    .line 108
    iput-object v6, v1, Liq1;->m:Lci2;

    .line 109
    .line 110
    iput v5, v1, Liq1;->o:I

    .line 111
    .line 112
    invoke-virtual {v2, v1}, Lin;->b(Lu00;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    if-ne v8, v7, :cond_5

    .line 117
    .line 118
    goto/16 :goto_6

    .line 119
    .line 120
    :cond_5
    move-object/from16 v16, v8

    .line 121
    .line 122
    move-object v8, v0

    .line 123
    move-object/from16 v0, v16

    .line 124
    .line 125
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_a

    .line 132
    .line 133
    invoke-virtual {v2}, Lin;->c()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Lci2;

    .line 138
    .line 139
    iput-object v8, v1, Liq1;->k:Lhv;

    .line 140
    .line 141
    iput-object v2, v1, Liq1;->l:Lin;

    .line 142
    .line 143
    iput-object v0, v1, Liq1;->m:Lci2;

    .line 144
    .line 145
    iput v4, v1, Liq1;->o:I

    .line 146
    .line 147
    invoke-virtual {v8, v1}, Lhv;->g0(Lu00;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    if-ne v9, v7, :cond_6

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_6
    move-object v9, v0

    .line 155
    :goto_3
    sget-object v0, Lpp1;->a:Lpp1;

    .line 156
    .line 157
    invoke-static {}, Lpp1;->f()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_9

    .line 162
    .line 163
    :try_start_1
    sget-object v0, Lsq1;->n:Ldq1;

    .line 164
    .line 165
    if-eqz v0, :cond_7

    .line 166
    .line 167
    iput-object v8, v1, Liq1;->k:Lhv;

    .line 168
    .line 169
    iput-object v2, v1, Liq1;->l:Lin;

    .line 170
    .line 171
    iput-object v9, v1, Liq1;->m:Lci2;

    .line 172
    .line 173
    iput v3, v1, Liq1;->o:I

    .line 174
    .line 175
    new-instance v10, Lb2;

    .line 176
    .line 177
    const/16 v11, 0xd

    .line 178
    .line 179
    invoke-direct {v10, v0, v9, v6, v11}, Lb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 180
    .line 181
    .line 182
    new-instance v0, Llw2;

    .line 183
    .line 184
    invoke-interface {v1}, Lt00;->f()La20;

    .line 185
    .line 186
    .line 187
    move-result-object v11

    .line 188
    invoke-direct {v0, v1, v11}, Lhd2;-><init>(Lt00;La20;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v0, v5, v0, v10}, Lze3;->b(Lhd2;ZLhd2;Lmn0;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-ne v0, v7, :cond_9

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :goto_4
    move-object v14, v0

    .line 199
    move-object v0, v8

    .line 200
    goto :goto_5

    .line 201
    :catch_1
    move-exception v0

    .line 202
    goto :goto_4

    .line 203
    :cond_7
    const-string v0, "messageRouter"

    .line 204
    .line 205
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v6
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 209
    :goto_5
    sget-object v10, Lsq1;->h:Lb5;

    .line 210
    .line 211
    if-eqz v10, :cond_8

    .line 212
    .line 213
    iget-object v8, v9, Lci2;->a:Ljava/lang/String;

    .line 214
    .line 215
    const-string v9, "Message dispatch failed for event "

    .line 216
    .line 217
    const-string v11, "."

    .line 218
    .line 219
    invoke-static {v9, v8, v11}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    const/4 v13, 0x0

    .line 224
    const/16 v15, 0x18

    .line 225
    .line 226
    sget-object v11, Lph2;->k:Lph2;

    .line 227
    .line 228
    invoke-static/range {v10 .. v15}, Lb5;->x(Lb5;Lph2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 229
    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_8
    const-string v0, "scriptLogger"

    .line 233
    .line 234
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v6

    .line 238
    :catch_2
    move-exception v0

    .line 239
    throw v0

    .line 240
    :cond_9
    move-object v0, v8

    .line 241
    goto/16 :goto_1

    .line 242
    .line 243
    :cond_a
    sget-object v7, La83;->a:La83;

    .line 244
    .line 245
    :goto_6
    return-object v7
.end method

.method public static b(Lth2;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    iget-object p0, p0, Lth2;->k:Lri2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lri2;->b()Lpb1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    invoke-static {p0, v1}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p0, v1}, Lpb1;->listIterator(I)Ljava/util/ListIterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    move-object v1, p0

    .line 24
    check-cast v1, Lvs0;

    .line 25
    .line 26
    invoke-virtual {v1}, Lvs0;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1}, Lvs0;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lff2;

    .line 37
    .line 38
    new-instance v2, Lgq1;

    .line 39
    .line 40
    iget-object v3, v1, Lff2;->a:Lef2;

    .line 41
    .line 42
    iget-object v4, v3, Lef2;->h:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v3}, Lsq1;->g(Lef2;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v1, v1, Lff2;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {v2, v4, v3, v1}, Lgq1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    return-object v0
.end method

.method public static f()V
    .locals 2

    .line 1
    sget-object v0, Lsq1;->p:Lhv;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v1, Lr21;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v1, v1, Lcy0;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v1, La83;->a:La83;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lr21;->T(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    const-string v0, "messageDispatchReady"

    .line 22
    .line 23
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    throw v0
.end method

.method public static g(Lef2;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_4

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq p0, v1, :cond_3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-eq p0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    if-eq p0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    if-ne p0, v1, :cond_0

    .line 19
    .line 20
    const p0, 0x790b01e8

    .line 21
    .line 22
    .line 23
    new-array v0, v0, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p0, v0}, Lsq1;->o(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    invoke-static {}, Lc80;->s()V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const p0, 0x790b01e9

    .line 36
    .line 37
    .line 38
    new-array v0, v0, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {p0, v0}, Lsq1;->o(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_2
    const p0, 0x790b01ea

    .line 46
    .line 47
    .line 48
    new-array v0, v0, [Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {p0, v0}, Lsq1;->o(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_3
    const p0, 0x790b01e7

    .line 56
    .line 57
    .line 58
    new-array v0, v0, [Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {p0, v0}, Lsq1;->o(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_4
    const p0, 0x790b01eb

    .line 66
    .line 67
    .line 68
    new-array v0, v0, [Ljava/lang/Object;

    .line 69
    .line 70
    invoke-static {p0, v0}, Lsq1;->o(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0
.end method

.method public static varargs o(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lsq1;->g:Landroid/content/res/Resources;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p0, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string p0, "NukeScriptService has not been initialized"

    .line 19
    .line 20
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lu00;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-string v0, "Script \'"

    .line 2
    .line 3
    instance-of v1, p2, Ljq1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, Ljq1;

    .line 9
    .line 10
    iget v2, v1, Ljq1;->o:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Ljq1;->o:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Ljq1;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, Ljq1;-><init>(Lsq1;Lu00;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p0, v1, Ljq1;->m:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p2, Lk20;->h:Lk20;

    .line 30
    .line 31
    iget v2, v1, Ljq1;->o:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v1, Ljq1;->l:Lil1;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :cond_2
    iget-object p1, v1, Ljq1;->l:Lil1;

    .line 58
    .line 59
    iget-object v2, v1, Ljq1;->k:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object p0, p1

    .line 65
    move-object p1, v2

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lsq1;->c:Lkl1;

    .line 71
    .line 72
    iput-object p1, v1, Ljq1;->k:Ljava/lang/String;

    .line 73
    .line 74
    iput-object p0, v1, Ljq1;->l:Lil1;

    .line 75
    .line 76
    iput v4, v1, Ljq1;->o:I

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-ne v2, p2, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    :goto_1
    :try_start_1
    sget-object v2, Lsq1;->q:Ljava/util/LinkedHashMap;

    .line 86
    .line 87
    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Lz80;

    .line 92
    .line 93
    if-eqz v2, :cond_7

    .line 94
    .line 95
    sget-object p1, Lsq1;->k:Lkj1;

    .line 96
    .line 97
    if-eqz p1, :cond_6

    .line 98
    .line 99
    iget-object v0, v2, Lz80;->b:Lth2;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v2, p1, Lkj1;->j:Ljava/lang/Object;

    .line 105
    .line 106
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    :try_start_2
    invoke-virtual {p1}, Lkj1;->D()Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    iget-object v6, v0, Lth2;->c:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v0}, Lrp0;->b0(Lth2;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {v4, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v4}, Lkj1;->F(Ljava/util/Map;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 121
    .line 122
    .line 123
    :try_start_3
    monitor-exit v2

    .line 124
    sget-object p1, Lsq1;->a:Lsq1;

    .line 125
    .line 126
    iput-object v5, v1, Ljq1;->k:Ljava/lang/String;

    .line 127
    .line 128
    iput-object p0, v1, Ljq1;->l:Lil1;

    .line 129
    .line 130
    iput v3, v1, Ljq1;->o:I

    .line 131
    .line 132
    invoke-virtual {p1, v1}, Lsq1;->i(Lu00;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 136
    if-ne p1, p2, :cond_5

    .line 137
    .line 138
    :goto_2
    return-object p2

    .line 139
    :cond_5
    move-object p1, p0

    .line 140
    :goto_3
    :try_start_4
    sget-object p0, La83;->a:La83;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 141
    .line 142
    check-cast p1, Lkl1;

    .line 143
    .line 144
    invoke-virtual {p1, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    return-object p0

    .line 148
    :catchall_1
    move-exception p1

    .line 149
    move-object v7, p1

    .line 150
    move-object p1, p0

    .line 151
    move-object p0, v7

    .line 152
    goto :goto_4

    .line 153
    :catchall_2
    move-exception p1

    .line 154
    :try_start_5
    monitor-exit v2

    .line 155
    throw p1

    .line 156
    :cond_6
    const-string p1, "permissionStore"

    .line 157
    .line 158
    invoke-static {p1}, Lt11;->S(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v5

    .line 162
    :cond_7
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 163
    .line 164
    new-instance v1, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string p1, "\' is not available."

    .line 173
    .line 174
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 185
    :goto_4
    check-cast p1, Lkl1;

    .line 186
    .line 187
    invoke-virtual {p1, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    throw p0
.end method

.method public final d(Landroid/content/Context;)V
    .locals 17

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lsq1;->g:Landroid/content/res/Resources;

    .line 9
    .line 10
    sget-boolean v0, Lsq1;->f:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_7

    .line 15
    .line 16
    :cond_0
    monitor-enter p0

    .line 17
    :try_start_0
    sget-boolean v0, Lsq1;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :cond_1
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    move-object v1, v0

    .line 33
    :goto_0
    const/4 v2, 0x0

    .line 34
    invoke-virtual {v1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    const-string v3, "nuke/scripts"

    .line 41
    .line 42
    invoke-static {v0, v3}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto/16 :goto_8

    .line 49
    .line 50
    :cond_3
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const-string v4, "nuke/scripts"

    .line 58
    .line 59
    invoke-static {v3, v4}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :goto_1
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const-string v5, "nuke/script-config"

    .line 74
    .line 75
    invoke-static {v4, v5}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const-string v6, "nuke/script-storage"

    .line 87
    .line 88
    invoke-static {v5, v6}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    const-string v6, "nuke/script-external"

    .line 95
    .line 96
    invoke-static {v0, v6}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    move-object v6, v0

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    move-object v6, v2

    .line 103
    :goto_2
    new-instance v0, Lb5;

    .line 104
    .line 105
    invoke-direct {v0, v4}, Lb5;-><init>(Ljava/io/File;)V

    .line 106
    .line 107
    .line 108
    sput-object v0, Lsq1;->j:Lb5;

    .line 109
    .line 110
    new-instance v0, Lkj1;

    .line 111
    .line 112
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    const-string v7, "nuke/script-permissions.json"

    .line 120
    .line 121
    invoke-static {v4, v7}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    const/16 v7, 0xb

    .line 126
    .line 127
    invoke-direct {v0, v4, v7}, Lkj1;-><init>(Ljava/io/File;I)V

    .line 128
    .line 129
    .line 130
    sput-object v0, Lsq1;->k:Lkj1;

    .line 131
    .line 132
    new-instance v0, Lkj1;

    .line 133
    .line 134
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    const-string v7, "nuke/script-enabled.json"

    .line 142
    .line 143
    invoke-static {v4, v7}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    const/16 v7, 0x9

    .line 148
    .line 149
    invoke-direct {v0, v4, v7}, Lkj1;-><init>(Ljava/io/File;I)V

    .line 150
    .line 151
    .line 152
    sput-object v0, Lsq1;->l:Lkj1;

    .line 153
    .line 154
    new-instance v9, Lb5;

    .line 155
    .line 156
    const/16 v0, 0xf

    .line 157
    .line 158
    invoke-direct {v9, v2, v0}, Lb5;-><init>(Ljava/time/Clock;I)V

    .line 159
    .line 160
    .line 161
    sput-object v9, Lsq1;->h:Lb5;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 162
    .line 163
    :try_start_2
    sget-object v0, Lup0;->m:Ljava/lang/String;

    .line 164
    .line 165
    if-eqz v0, :cond_5

    .line 166
    .line 167
    const-string v4, "com.tencent.mm"

    .line 168
    .line 169
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    goto :goto_4

    .line 178
    :catchall_1
    move-exception v0

    .line 179
    goto :goto_3

    .line 180
    :cond_5
    const-string v0, "hostProcess"

    .line 181
    .line 182
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 186
    :goto_3
    :try_start_3
    new-instance v4, Lx92;

    .line 187
    .line 188
    invoke-direct {v4, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    move-object v0, v4

    .line 192
    :goto_4
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 193
    .line 194
    instance-of v7, v0, Lx92;

    .line 195
    .line 196
    if-eqz v7, :cond_6

    .line 197
    .line 198
    move-object v0, v4

    .line 199
    :cond_6
    check-cast v0, Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_7

    .line 206
    .line 207
    new-instance v0, Lkj1;

    .line 208
    .line 209
    const/16 v4, 0xa

    .line 210
    .line 211
    invoke-direct {v0, v4}, Lkj1;-><init>(I)V

    .line 212
    .line 213
    .line 214
    :goto_5
    move-object v13, v0

    .line 215
    goto :goto_6

    .line 216
    :cond_7
    sget-object v0, Lgi2;->a:Li51;

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :goto_6
    invoke-virtual {v5}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v4, Liz;

    .line 224
    .line 225
    const/4 v5, 0x4

    .line 226
    invoke-direct {v4, v5, v0}, Liz;-><init>(ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    new-instance v11, Lhq1;

    .line 230
    .line 231
    invoke-direct {v11, v4, v6}, Lhq1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    new-instance v0, Lkj1;

    .line 235
    .line 236
    sget-object v12, Lsq1;->j:Lb5;

    .line 237
    .line 238
    if-eqz v12, :cond_c

    .line 239
    .line 240
    sget-object v4, Lar1;->h:Lar1;

    .line 241
    .line 242
    new-instance v10, Lhh1;

    .line 243
    .line 244
    sget-object v4, Lsq1;->k:Lkj1;

    .line 245
    .line 246
    if-eqz v4, :cond_b

    .line 247
    .line 248
    invoke-direct {v10, v4}, Lhh1;-><init>(Lkj1;)V

    .line 249
    .line 250
    .line 251
    new-instance v14, Lsz0;

    .line 252
    .line 253
    sget-object v4, Lsq1;->k:Lkj1;

    .line 254
    .line 255
    if-eqz v4, :cond_a

    .line 256
    .line 257
    invoke-direct {v14, v4}, Lsz0;-><init>(Lkj1;)V

    .line 258
    .line 259
    .line 260
    new-instance v15, Lb5;

    .line 261
    .line 262
    sget-object v4, Lsq1;->k:Lkj1;

    .line 263
    .line 264
    if-eqz v4, :cond_9

    .line 265
    .line 266
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-direct {v15, v4, v5, v1}, Lb5;-><init>(Lkj1;Ljava/lang/ClassLoader;Landroid/content/Context;)V

    .line 274
    .line 275
    .line 276
    new-instance v8, Ldf2;

    .line 277
    .line 278
    const/16 v16, 0x201

    .line 279
    .line 280
    invoke-direct/range {v8 .. v16}, Ldf2;-><init>(Lb5;Lhh1;Lhq1;Lb5;Lhi2;Lsz0;Lb5;I)V

    .line 281
    .line 282
    .line 283
    const/4 v1, 0x5

    .line 284
    invoke-direct {v0, v8, v1}, Lkj1;-><init>(Ldf2;I)V

    .line 285
    .line 286
    .line 287
    new-instance v1, Lwj2;

    .line 288
    .line 289
    invoke-direct {v1, v0, v9}, Lwj2;-><init>(Lkj1;Lb5;)V

    .line 290
    .line 291
    .line 292
    sput-object v1, Lsq1;->m:Lwj2;

    .line 293
    .line 294
    new-instance v0, Ldq1;

    .line 295
    .line 296
    const/4 v4, 0x0

    .line 297
    invoke-direct {v0, v4, v1, v9}, Ldq1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    sput-object v0, Lsq1;->n:Ldq1;

    .line 301
    .line 302
    const/16 v0, 0x200

    .line 303
    .line 304
    const/4 v1, 0x6

    .line 305
    invoke-static {v0, v1, v2}, Lfg1;->a(IILhn;)Ljn;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    sput-object v0, Lsq1;->o:Ljn;

    .line 310
    .line 311
    new-instance v0, Lhv;

    .line 312
    .line 313
    const/4 v4, 0x1

    .line 314
    invoke-direct {v0, v4}, Lr21;-><init>(Z)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v2}, Lr21;->Q(Lk21;)V

    .line 318
    .line 319
    .line 320
    sput-object v0, Lsq1;->p:Lhv;

    .line 321
    .line 322
    sget-object v0, Lsq1;->b:Ls00;

    .line 323
    .line 324
    new-instance v5, Llk0;

    .line 325
    .line 326
    const/4 v6, 0x2

    .line 327
    invoke-direct {v5, v6, v2, v4}, Llk0;-><init>(ILt00;I)V

    .line 328
    .line 329
    .line 330
    const/4 v7, 0x3

    .line 331
    invoke-static {v0, v2, v5, v7}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 332
    .line 333
    .line 334
    new-instance v5, Lwi2;

    .line 335
    .line 336
    invoke-direct {v5, v3, v2, v1}, Lwi2;-><init>(Ljava/io/File;Lc20;I)V

    .line 337
    .line 338
    .line 339
    sput-object v5, Lsq1;->i:Lwi2;

    .line 340
    .line 341
    sput-boolean v4, Lsq1;->f:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 342
    .line 343
    monitor-exit p0

    .line 344
    sget-boolean v1, Lsq1;->f:Z

    .line 345
    .line 346
    if-nez v1, :cond_8

    .line 347
    .line 348
    goto :goto_7

    .line 349
    :cond_8
    new-instance v1, Llk0;

    .line 350
    .line 351
    invoke-direct {v1, v6, v2, v6}, Llk0;-><init>(ILt00;I)V

    .line 352
    .line 353
    .line 354
    invoke-static {v0, v2, v1, v7}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 355
    .line 356
    .line 357
    :goto_7
    return-void

    .line 358
    :cond_9
    :try_start_4
    const-string v0, "permissionStore"

    .line 359
    .line 360
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw v2

    .line 364
    :cond_a
    const-string v0, "permissionStore"

    .line 365
    .line 366
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    throw v2

    .line 370
    :cond_b
    const-string v0, "permissionStore"

    .line 371
    .line 372
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    throw v2

    .line 376
    :cond_c
    const-string v0, "configStore"

    .line 377
    .line 378
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 382
    :goto_8
    monitor-exit p0

    .line 383
    throw v0
.end method

.method public final e(Ljava/lang/String;Lu00;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lkq1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkq1;

    .line 7
    .line 8
    iget v1, v0, Lkq1;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkq1;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkq1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkq1;-><init>(Lsq1;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lkq1;->n:Ljava/lang/Object;

    .line 26
    .line 27
    iget p2, v0, Lkq1;->p:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const-string v2, "Script \'"

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x1

    .line 34
    sget-object v5, Lk20;->h:Lk20;

    .line 35
    .line 36
    if-eqz p2, :cond_3

    .line 37
    .line 38
    if-eq p2, v4, :cond_2

    .line 39
    .line 40
    if-ne p2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lkq1;->m:Llf2;

    .line 43
    .line 44
    iget-object p2, v0, Lkq1;->l:Lz80;

    .line 45
    .line 46
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :cond_2
    iget-object p1, v0, Lkq1;->l:Lz80;

    .line 57
    .line 58
    iget-object p2, v0, Lkq1;->k:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v8, p2

    .line 64
    move-object p2, p1

    .line 65
    move-object p1, v8

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lsq1;->q:Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Lz80;

    .line 77
    .line 78
    if-eqz p0, :cond_8

    .line 79
    .line 80
    new-instance p2, Lsz0;

    .line 81
    .line 82
    iget-object v6, p0, Lz80;->a:Ljava/io/File;

    .line 83
    .line 84
    sget-object v7, Lo90;->a:Lc60;

    .line 85
    .line 86
    sget-object v7, Lt50;->j:Lt50;

    .line 87
    .line 88
    invoke-direct {p2, v6, v7}, Lsz0;-><init>(Ljava/io/File;Lc20;)V

    .line 89
    .line 90
    .line 91
    iget-object v6, p0, Lz80;->b:Lth2;

    .line 92
    .line 93
    iput-object p1, v0, Lkq1;->k:Ljava/lang/String;

    .line 94
    .line 95
    iput-object p0, v0, Lkq1;->l:Lz80;

    .line 96
    .line 97
    iput v4, v0, Lkq1;->p:I

    .line 98
    .line 99
    sget-object v4, Lsq1;->s:Lak;

    .line 100
    .line 101
    invoke-virtual {v4, p2, v6, v0}, Lak;->a(Lsz0;Lth2;Lu00;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    if-ne p2, v5, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    move-object v8, p2

    .line 109
    move-object p2, p0

    .line 110
    move-object p0, v8

    .line 111
    :goto_1
    check-cast p0, Llf2;

    .line 112
    .line 113
    if-eqz p0, :cond_7

    .line 114
    .line 115
    sget-object v2, Lsq1;->j:Lb5;

    .line 116
    .line 117
    if-eqz v2, :cond_6

    .line 118
    .line 119
    iput-object v1, v0, Lkq1;->k:Ljava/lang/String;

    .line 120
    .line 121
    iput-object p2, v0, Lkq1;->l:Lz80;

    .line 122
    .line 123
    iput-object p0, v0, Lkq1;->m:Llf2;

    .line 124
    .line 125
    iput v3, v0, Lkq1;->p:I

    .line 126
    .line 127
    invoke-virtual {v2, p1, v0}, Lb5;->g(Ljava/lang/String;Lt00;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-ne p1, v5, :cond_5

    .line 132
    .line 133
    :goto_2
    return-object v5

    .line 134
    :cond_5
    move-object v8, p1

    .line 135
    move-object p1, p0

    .line 136
    move-object p0, v8

    .line 137
    :goto_3
    check-cast p0, Ld41;

    .line 138
    .line 139
    new-instance v0, Luq1;

    .line 140
    .line 141
    iget-object p2, p2, Lz80;->b:Lth2;

    .line 142
    .line 143
    invoke-static {p1, p0}, Lup0;->E(Llf2;Ld41;)Lrf2;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-direct {v0, p2, p1, p0}, Luq1;-><init>(Lth2;Llf2;Lrf2;)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_6
    const-string p0, "configStore"

    .line 152
    .line 153
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v1

    .line 157
    :cond_7
    const-string p0, "\' does not define a config schema."

    .line 158
    .line 159
    invoke-static {v2, p1, p0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object v1

    .line 167
    :cond_8
    const-string p0, "\' is not available."

    .line 168
    .line 169
    invoke-static {v2, p1, p0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-object v1
.end method

.method public final h(Lu00;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Llq1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Llq1;

    .line 7
    .line 8
    iget v1, v0, Llq1;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Llq1;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Llq1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Llq1;-><init>(Lsq1;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Llq1;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget p1, v0, Llq1;->n:I

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const/4 v2, 0x1

    .line 31
    const/4 v3, 0x0

    .line 32
    sget-object v4, Lk20;->h:Lk20;

    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    if-eq p1, v2, :cond_2

    .line 37
    .line 38
    if-ne p1, v1, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Llq1;->k:Lil1;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_4

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    iget-object p1, v0, Llq1;->k:Lil1;

    .line 55
    .line 56
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lsq1;->c:Lkl1;

    .line 64
    .line 65
    iput-object p0, v0, Llq1;->k:Lil1;

    .line 66
    .line 67
    iput v2, v0, Llq1;->n:I

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v4, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-object p1, p0

    .line 77
    :goto_1
    :try_start_1
    sget-object p0, Lsq1;->a:Lsq1;

    .line 78
    .line 79
    iput-object p1, v0, Llq1;->k:Lil1;

    .line 80
    .line 81
    iput v1, v0, Llq1;->n:I

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lsq1;->i(Lu00;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v4, :cond_5

    .line 88
    .line 89
    :goto_2
    return-object v4

    .line 90
    :cond_5
    :goto_3
    sget-object p0, La83;->a:La83;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    .line 92
    check-cast p1, Lkl1;

    .line 93
    .line 94
    invoke-virtual {p1, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    :goto_4
    check-cast p1, Lkl1;

    .line 99
    .line 100
    invoke-virtual {p1, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    throw p0
.end method

.method public final i(Lu00;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lsq1;->q:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    instance-of v3, v1, Lmq1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v1

    .line 12
    check-cast v3, Lmq1;

    .line 13
    .line 14
    iget v4, v3, Lmq1;->o:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lmq1;->o:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lmq1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v1}, Lmq1;-><init>(Lsq1;Lu00;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v1, v3, Lmq1;->m:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Lmq1;->o:I

    .line 34
    .line 35
    sget-object v5, Lsq1;->r:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x2

    .line 39
    sget-object v8, Lsq1;->d:Lju2;

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x1

    .line 43
    const/4 v11, 0x0

    .line 44
    sget-object v12, Lk20;->h:Lk20;

    .line 45
    .line 46
    if-eqz v4, :cond_4

    .line 47
    .line 48
    if-eq v4, v10, :cond_3

    .line 49
    .line 50
    if-eq v4, v7, :cond_2

    .line 51
    .line 52
    if-ne v4, v6, :cond_1

    .line 53
    .line 54
    iget-object v0, v3, Lmq1;->l:Ljava/util/Set;

    .line 55
    .line 56
    check-cast v0, Ljava/util/Set;

    .line 57
    .line 58
    iget-object v2, v3, Lmq1;->k:Lxi2;

    .line 59
    .line 60
    :try_start_0
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    move-object/from16 p1, v11

    .line 64
    .line 65
    goto/16 :goto_9

    .line 66
    .line 67
    :catch_0
    move-exception v0

    .line 68
    move-object/from16 p1, v11

    .line 69
    .line 70
    goto/16 :goto_16

    .line 71
    .line 72
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object v11

    .line 78
    :cond_2
    iget-object v0, v3, Lmq1;->l:Ljava/util/Set;

    .line 79
    .line 80
    check-cast v0, Ljava/util/Set;

    .line 81
    .line 82
    iget-object v2, v3, Lmq1;->k:Lxi2;

    .line 83
    .line 84
    :try_start_1
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object/from16 p1, v11

    .line 88
    .line 89
    goto/16 :goto_7

    .line 90
    .line 91
    :cond_3
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8}, Lju2;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Ltq1;

    .line 103
    .line 104
    invoke-static {v1, v11, v10, v11, v10}, Ltq1;->a(Ltq1;Ljava/util/ArrayList;ZLjava/lang/String;I)Ltq1;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v8, v1}, Lju2;->g(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :try_start_2
    sget-object v1, Lsq1;->i:Lwi2;

    .line 112
    .line 113
    if-eqz v1, :cond_1f

    .line 114
    .line 115
    iput v10, v3, Lmq1;->o:I

    .line 116
    .line 117
    iget-object v4, v1, Lwi2;->b:Lc20;

    .line 118
    .line 119
    new-instance v13, Lvi2;

    .line 120
    .line 121
    invoke-direct {v13, v1, v11}, Lvi2;-><init>(Lwi2;Lt00;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v4, v13, v3}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    if-ne v1, v12, :cond_5

    .line 129
    .line 130
    goto/16 :goto_8

    .line 131
    .line 132
    :cond_5
    :goto_1
    check-cast v1, Lxi2;

    .line 133
    .line 134
    iget-object v4, v1, Lxi2;->a:Ljava/util/List;

    .line 135
    .line 136
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 137
    .line 138
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    if-eqz v14, :cond_7

    .line 150
    .line 151
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    move-object v15, v14

    .line 156
    check-cast v15, Lz80;

    .line 157
    .line 158
    invoke-virtual {v15}, Lz80;->a()Lth2;

    .line 159
    .line 160
    .line 161
    move-result-object v15

    .line 162
    invoke-virtual {v15}, Lth2;->c()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v15

    .line 166
    invoke-virtual {v13, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v16
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    if-nez v16, :cond_6

    .line 171
    .line 172
    move-object/from16 p1, v11

    .line 173
    .line 174
    :try_start_3
    new-instance v11, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-interface {v13, v15, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-object/from16 v16, v11

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :catch_1
    move-exception v0

    .line 186
    goto/16 :goto_16

    .line 187
    .line 188
    :cond_6
    move-object/from16 p1, v11

    .line 189
    .line 190
    :goto_3
    move-object/from16 v11, v16

    .line 191
    .line 192
    check-cast v11, Ljava/util/List;

    .line 193
    .line 194
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-object/from16 v11, p1

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_7
    move-object/from16 p1, v11

    .line 201
    .line 202
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 203
    .line 204
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v13}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    :cond_8
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v13

    .line 219
    if-eqz v13, :cond_9

    .line 220
    .line 221
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v13

    .line 225
    check-cast v13, Ljava/util/Map$Entry;

    .line 226
    .line 227
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v14

    .line 231
    check-cast v14, Ljava/util/List;

    .line 232
    .line 233
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 234
    .line 235
    .line 236
    move-result v14

    .line 237
    if-le v14, v10, :cond_8

    .line 238
    .line 239
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v14

    .line 243
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    invoke-virtual {v4, v14, v13}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_9
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 256
    .line 257
    .line 258
    iget-object v11, v1, Lxi2;->a:Ljava/util/List;

    .line 259
    .line 260
    new-instance v13, Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    :cond_a
    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v14

    .line 273
    if-eqz v14, :cond_b

    .line 274
    .line 275
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v14

    .line 279
    move-object v15, v14

    .line 280
    check-cast v15, Lz80;

    .line 281
    .line 282
    invoke-virtual {v15}, Lz80;->a()Lth2;

    .line 283
    .line 284
    .line 285
    move-result-object v15

    .line 286
    invoke-virtual {v15}, Lth2;->c()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v15

    .line 290
    invoke-interface {v4, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v15

    .line 294
    if-nez v15, :cond_a

    .line 295
    .line 296
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_b
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    :goto_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v13

    .line 308
    if-eqz v13, :cond_c

    .line 309
    .line 310
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v13

    .line 314
    check-cast v13, Lz80;

    .line 315
    .line 316
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 317
    .line 318
    .line 319
    move-result-object v14

    .line 320
    invoke-virtual {v14}, Lth2;->c()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v14

    .line 324
    invoke-interface {v2, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    goto :goto_6

    .line 328
    :cond_c
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->clear()V

    .line 329
    .line 330
    .line 331
    iput-object v1, v3, Lmq1;->k:Lxi2;

    .line 332
    .line 333
    move-object v2, v4

    .line 334
    check-cast v2, Ljava/util/Set;

    .line 335
    .line 336
    iput-object v2, v3, Lmq1;->l:Ljava/util/Set;

    .line 337
    .line 338
    iput v7, v3, Lmq1;->o:I

    .line 339
    .line 340
    invoke-virtual {v0, v3}, Lsq1;->k(Lu00;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    if-ne v0, v12, :cond_d

    .line 345
    .line 346
    goto :goto_8

    .line 347
    :cond_d
    move-object v2, v1

    .line 348
    move-object v0, v4

    .line 349
    :goto_7
    sget-object v1, Lsq1;->m:Lwj2;

    .line 350
    .line 351
    if-eqz v1, :cond_1e

    .line 352
    .line 353
    iput-object v2, v3, Lmq1;->k:Lxi2;

    .line 354
    .line 355
    move-object v4, v0

    .line 356
    check-cast v4, Ljava/util/Set;

    .line 357
    .line 358
    iput-object v4, v3, Lmq1;->l:Ljava/util/Set;

    .line 359
    .line 360
    iput v6, v3, Lmq1;->o:I

    .line 361
    .line 362
    invoke-virtual {v1, v3}, Lwj2;->k(Lu00;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    if-ne v1, v12, :cond_e

    .line 367
    .line 368
    :goto_8
    return-object v12

    .line 369
    :cond_e
    :goto_9
    check-cast v1, Lyj2;

    .line 370
    .line 371
    invoke-virtual {v1}, Lyj2;->a()Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    new-instance v3, Ljava/util/ArrayList;

    .line 376
    .line 377
    const/16 v4, 0xa

    .line 378
    .line 379
    invoke-static {v1, v4}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 384
    .line 385
    .line 386
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v7

    .line 394
    if-eqz v7, :cond_f

    .line 395
    .line 396
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    check-cast v7, Lme1;

    .line 401
    .line 402
    invoke-virtual {v7}, Lme1;->a()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v7

    .line 406
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_f
    invoke-static {v3}, Ldu;->K0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    iget-object v3, v2, Lxi2;->b:Ljava/util/List;

    .line 415
    .line 416
    iget-object v7, v2, Lxi2;->a:Ljava/util/List;

    .line 417
    .line 418
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 419
    .line 420
    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 421
    .line 422
    .line 423
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v12

    .line 431
    if-eqz v12, :cond_11

    .line 432
    .line 433
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v12

    .line 437
    move-object v13, v12

    .line 438
    check-cast v13, Lzf2;

    .line 439
    .line 440
    iget-object v13, v13, Lzf2;->a:Ljava/io/File;

    .line 441
    .line 442
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v13

    .line 446
    invoke-virtual {v11, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v14

    .line 450
    if-nez v14, :cond_10

    .line 451
    .line 452
    new-instance v14, Ljava/util/ArrayList;

    .line 453
    .line 454
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 455
    .line 456
    .line 457
    invoke-interface {v11, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    :cond_10
    check-cast v14, Ljava/util/List;

    .line 461
    .line 462
    invoke-interface {v14, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    goto :goto_b

    .line 466
    :cond_11
    new-instance v3, Ljava/util/ArrayList;

    .line 467
    .line 468
    invoke-static {v7, v4}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 469
    .line 470
    .line 471
    move-result v12

    .line 472
    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v12

    .line 479
    :goto_c
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v13

    .line 483
    if-eqz v13, :cond_17

    .line 484
    .line 485
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v13

    .line 489
    check-cast v13, Lz80;

    .line 490
    .line 491
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 492
    .line 493
    .line 494
    move-result-object v14

    .line 495
    invoke-virtual {v14}, Lth2;->c()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v16

    .line 499
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 500
    .line 501
    .line 502
    move-result-object v14

    .line 503
    invoke-virtual {v14}, Lth2;->d()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v17

    .line 507
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 508
    .line 509
    .line 510
    move-result-object v14

    .line 511
    invoke-virtual {v14}, Lth2;->f()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v18

    .line 515
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 516
    .line 517
    .line 518
    move-result-object v14

    .line 519
    invoke-virtual {v14}, Lth2;->b()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v19

    .line 523
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 524
    .line 525
    .line 526
    move-result-object v14

    .line 527
    invoke-virtual {v14}, Lth2;->a()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v14

    .line 531
    if-eqz v14, :cond_12

    .line 532
    .line 533
    move/from16 v20, v10

    .line 534
    .line 535
    goto :goto_d

    .line 536
    :cond_12
    move/from16 v20, v9

    .line 537
    .line 538
    :goto_d
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 539
    .line 540
    .line 541
    move-result-object v14

    .line 542
    invoke-virtual {v14}, Lth2;->c()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v14

    .line 546
    invoke-interface {v1, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v21

    .line 550
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 551
    .line 552
    .line 553
    move-result-object v14

    .line 554
    invoke-virtual {v14}, Lth2;->c()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v14

    .line 558
    invoke-virtual {v5, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v14

    .line 562
    move-object/from16 v23, v14

    .line 563
    .line 564
    check-cast v23, Ljava/lang/String;

    .line 565
    .line 566
    iget-object v14, v13, Lz80;->a:Ljava/io/File;

    .line 567
    .line 568
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v14

    .line 572
    invoke-virtual {v11, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v14

    .line 576
    move-object/from16 v24, v14

    .line 577
    .line 578
    check-cast v24, Ljava/util/List;

    .line 579
    .line 580
    if-eqz v24, :cond_13

    .line 581
    .line 582
    const-string v25, "\n"

    .line 583
    .line 584
    new-instance v14, Leq1;

    .line 585
    .line 586
    invoke-direct {v14, v6}, Leq1;-><init>(I)V

    .line 587
    .line 588
    .line 589
    const/16 v29, 0x1e

    .line 590
    .line 591
    const/16 v26, 0x0

    .line 592
    .line 593
    const/16 v27, 0x0

    .line 594
    .line 595
    move-object/from16 v28, v14

    .line 596
    .line 597
    invoke-static/range {v24 .. v29}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v14

    .line 601
    :goto_e
    move-object/from16 v22, v14

    .line 602
    .line 603
    goto :goto_f

    .line 604
    :cond_13
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 605
    .line 606
    .line 607
    move-result-object v14

    .line 608
    invoke-virtual {v14}, Lth2;->c()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v14

    .line 612
    invoke-interface {v0, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v14

    .line 616
    if-eqz v14, :cond_14

    .line 617
    .line 618
    new-array v14, v9, [Ljava/lang/Object;

    .line 619
    .line 620
    const v15, 0x790b01fb

    .line 621
    .line 622
    .line 623
    invoke-static {v15, v14}, Lsq1;->o(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v14

    .line 627
    goto :goto_e

    .line 628
    :cond_14
    move-object/from16 v22, p1

    .line 629
    .line 630
    :goto_f
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 631
    .line 632
    .line 633
    move-result-object v14

    .line 634
    invoke-virtual {v14}, Lth2;->e()Lri2;

    .line 635
    .line 636
    .line 637
    move-result-object v14

    .line 638
    invoke-virtual {v14}, Lri2;->c()Ljp2;

    .line 639
    .line 640
    .line 641
    move-result-object v14

    .line 642
    new-instance v15, Ljava/util/ArrayList;

    .line 643
    .line 644
    invoke-static {v14, v4}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 645
    .line 646
    .line 647
    move-result v6

    .line 648
    invoke-direct {v15, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v14}, Ljp2;->iterator()Ljava/util/Iterator;

    .line 652
    .line 653
    .line 654
    move-result-object v6

    .line 655
    :goto_10
    move-object v14, v6

    .line 656
    check-cast v14, Lne1;

    .line 657
    .line 658
    invoke-virtual {v14}, Lne1;->hasNext()Z

    .line 659
    .line 660
    .line 661
    move-result v14

    .line 662
    if-eqz v14, :cond_15

    .line 663
    .line 664
    move-object v14, v6

    .line 665
    check-cast v14, Lne1;

    .line 666
    .line 667
    invoke-virtual {v14}, Lne1;->next()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v14

    .line 671
    check-cast v14, Lef2;

    .line 672
    .line 673
    invoke-static {v14}, Lsq1;->g(Lef2;)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v14

    .line 677
    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    goto :goto_10

    .line 681
    :cond_15
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 682
    .line 683
    .line 684
    move-result-object v6

    .line 685
    invoke-static {v6}, Lsq1;->b(Lth2;)Ljava/util/ArrayList;

    .line 686
    .line 687
    .line 688
    move-result-object v25

    .line 689
    sget-object v6, Lsq1;->k:Lkj1;

    .line 690
    .line 691
    if-eqz v6, :cond_16

    .line 692
    .line 693
    invoke-virtual {v13}, Lz80;->a()Lth2;

    .line 694
    .line 695
    .line 696
    move-result-object v13

    .line 697
    invoke-virtual {v6, v13}, Lkj1;->C(Lth2;)Z

    .line 698
    .line 699
    .line 700
    move-result v26

    .line 701
    move-object/from16 v24, v15

    .line 702
    .line 703
    new-instance v15, Lcq1;

    .line 704
    .line 705
    invoke-direct/range {v15 .. v26}, Lcq1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    const/4 v6, 0x3

    .line 712
    goto/16 :goto_c

    .line 713
    .line 714
    :cond_16
    const-string v0, "permissionStore"

    .line 715
    .line 716
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    throw p1

    .line 720
    :cond_17
    iget-object v0, v2, Lxi2;->b:Ljava/util/List;

    .line 721
    .line 722
    new-instance v1, Ljava/util/ArrayList;

    .line 723
    .line 724
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 725
    .line 726
    .line 727
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 732
    .line 733
    .line 734
    move-result v2

    .line 735
    if-eqz v2, :cond_1b

    .line 736
    .line 737
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    move-object v4, v2

    .line 742
    check-cast v4, Lzf2;

    .line 743
    .line 744
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 745
    .line 746
    .line 747
    move-result v5

    .line 748
    if-eqz v5, :cond_18

    .line 749
    .line 750
    goto :goto_12

    .line 751
    :cond_18
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 752
    .line 753
    .line 754
    move-result-object v5

    .line 755
    :cond_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 756
    .line 757
    .line 758
    move-result v6

    .line 759
    if-eqz v6, :cond_1a

    .line 760
    .line 761
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v6

    .line 765
    check-cast v6, Lz80;

    .line 766
    .line 767
    iget-object v6, v6, Lz80;->a:Ljava/io/File;

    .line 768
    .line 769
    iget-object v11, v4, Lzf2;->a:Ljava/io/File;

    .line 770
    .line 771
    invoke-static {v6, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    move-result v6

    .line 775
    if-eqz v6, :cond_19

    .line 776
    .line 777
    goto :goto_11

    .line 778
    :cond_1a
    :goto_12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    goto :goto_11

    .line 782
    :cond_1b
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 783
    .line 784
    .line 785
    move-result v0

    .line 786
    if-nez v0, :cond_1c

    .line 787
    .line 788
    move-object v11, v1

    .line 789
    goto :goto_13

    .line 790
    :cond_1c
    move-object/from16 v11, p1

    .line 791
    .line 792
    :goto_13
    if-eqz v11, :cond_1d

    .line 793
    .line 794
    const-string v12, "\n"

    .line 795
    .line 796
    new-instance v15, Leq1;

    .line 797
    .line 798
    const/4 v0, 0x4

    .line 799
    invoke-direct {v15, v0}, Leq1;-><init>(I)V

    .line 800
    .line 801
    .line 802
    const/16 v16, 0x1e

    .line 803
    .line 804
    const/4 v13, 0x0

    .line 805
    const/4 v14, 0x0

    .line 806
    invoke-static/range {v11 .. v16}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    goto :goto_14

    .line 811
    :cond_1d
    move-object/from16 v0, p1

    .line 812
    .line 813
    :goto_14
    new-instance v1, Ltq1;

    .line 814
    .line 815
    invoke-direct {v1, v3, v9, v0}, Ltq1;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v8, v1}, Lju2;->g(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 819
    .line 820
    .line 821
    :goto_15
    invoke-static {}, Lsq1;->f()V

    .line 822
    .line 823
    .line 824
    goto :goto_17

    .line 825
    :cond_1e
    :try_start_4
    const-string v0, "runtimeManager"

    .line 826
    .line 827
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    throw p1

    .line 831
    :cond_1f
    move-object/from16 p1, v11

    .line 832
    .line 833
    const-string v0, "repository"

    .line 834
    .line 835
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    throw p1
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 839
    :goto_16
    :try_start_5
    invoke-virtual {v8}, Lju2;->getValue()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    check-cast v1, Ltq1;

    .line 844
    .line 845
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    if-nez v0, :cond_20

    .line 850
    .line 851
    new-array v0, v9, [Ljava/lang/Object;

    .line 852
    .line 853
    const v2, 0x790b01fa

    .line 854
    .line 855
    .line 856
    invoke-static {v2, v0}, Lsq1;->o(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    :cond_20
    move-object/from16 v2, p1

    .line 861
    .line 862
    invoke-static {v1, v2, v9, v0, v10}, Ltq1;->a(Ltq1;Ljava/util/ArrayList;ZLjava/lang/String;I)Ltq1;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    invoke-virtual {v8, v0}, Lju2;->g(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 867
    .line 868
    .line 869
    goto :goto_15

    .line 870
    :goto_17
    sget-object v0, La83;->a:La83;

    .line 871
    .line 872
    return-object v0

    .line 873
    :catch_2
    move-exception v0

    .line 874
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 875
    :catchall_0
    move-exception v0

    .line 876
    invoke-static {}, Lsq1;->f()V

    .line 877
    .line 878
    .line 879
    throw v0
.end method

.method public final j(Lu00;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    instance-of v1, v0, Lnq1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lnq1;

    .line 9
    .line 10
    iget v2, v1, Lnq1;->m:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lnq1;->m:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lnq1;

    .line 23
    .line 24
    move-object/from16 v2, p0

    .line 25
    .line 26
    invoke-direct {v1, v2, v0}, Lnq1;-><init>(Lsq1;Lu00;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v1, Lnq1;->k:Ljava/lang/Object;

    .line 30
    .line 31
    iget v2, v1, Lnq1;->m:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lsq1;->m:Lwj2;

    .line 53
    .line 54
    if-eqz v0, :cond_6

    .line 55
    .line 56
    iput v4, v1, Lnq1;->m:I

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lwj2;->k(Lu00;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v1, Lk20;->h:Lk20;

    .line 63
    .line 64
    if-ne v0, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast v0, Lyj2;

    .line 68
    .line 69
    iget-object v0, v0, Lyj2;->a:Ljava/util/List;

    .line 70
    .line 71
    new-instance v1, Ljava/util/ArrayList;

    .line 72
    .line 73
    const/16 v2, 0xa

    .line 74
    .line 75
    invoke-static {v0, v2}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_4

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Lme1;

    .line 97
    .line 98
    iget-object v4, v4, Lme1;->a:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    invoke-static {v1}, Ldu;->K0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sget-object v1, Lsq1;->d:Lju2;

    .line 109
    .line 110
    invoke-virtual {v1}, Lju2;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, Ltq1;

    .line 115
    .line 116
    invoke-virtual {v1}, Lju2;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    check-cast v5, Ltq1;

    .line 121
    .line 122
    iget-object v5, v5, Ltq1;->a:Ljava/util/List;

    .line 123
    .line 124
    new-instance v6, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-static {v5, v2}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_5

    .line 142
    .line 143
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    check-cast v5, Lcq1;

    .line 148
    .line 149
    iget-object v8, v5, Lcq1;->a:Ljava/lang/String;

    .line 150
    .line 151
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    sget-object v7, Lsq1;->r:Ljava/util/LinkedHashMap;

    .line 156
    .line 157
    invoke-virtual {v7, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    move-object v15, v7

    .line 162
    check-cast v15, Ljava/lang/String;

    .line 163
    .line 164
    iget-object v9, v5, Lcq1;->b:Ljava/lang/String;

    .line 165
    .line 166
    iget-object v10, v5, Lcq1;->c:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v11, v5, Lcq1;->d:Ljava/lang/String;

    .line 169
    .line 170
    iget-boolean v12, v5, Lcq1;->e:Z

    .line 171
    .line 172
    iget-object v14, v5, Lcq1;->g:Ljava/lang/String;

    .line 173
    .line 174
    iget-object v7, v5, Lcq1;->i:Ljava/util/List;

    .line 175
    .line 176
    iget-object v3, v5, Lcq1;->j:Ljava/util/List;

    .line 177
    .line 178
    iget-boolean v5, v5, Lcq1;->k:Z

    .line 179
    .line 180
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-object/from16 v16, v7

    .line 190
    .line 191
    new-instance v7, Lcq1;

    .line 192
    .line 193
    move-object/from16 v17, v3

    .line 194
    .line 195
    move/from16 v18, v5

    .line 196
    .line 197
    invoke-direct/range {v7 .. v18}, Lcq1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    const/4 v3, 0x0

    .line 204
    goto :goto_3

    .line 205
    :cond_5
    const/4 v0, 0x0

    .line 206
    const/4 v2, 0x6

    .line 207
    const/4 v3, 0x0

    .line 208
    invoke-static {v4, v6, v0, v3, v2}, Ltq1;->a(Ltq1;Ljava/util/ArrayList;ZLjava/lang/String;I)Ltq1;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v1, v3, v0}, Lju2;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    sget-object v0, La83;->a:La83;

    .line 216
    .line 217
    return-object v0

    .line 218
    :cond_6
    const-string v0, "runtimeManager"

    .line 219
    .line 220
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v3
.end method

.method public final k(Lu00;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p1, Loq1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Loq1;

    .line 7
    .line 8
    iget v1, v0, Loq1;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Loq1;->p:I

    .line 18
    .line 19
    :goto_0
    move-object p0, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Loq1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, Loq1;-><init>(Lsq1;Lu00;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, p0, Loq1;->n:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, Lk20;->h:Lk20;

    .line 30
    .line 31
    iget v0, p0, Loq1;->p:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    if-eq v0, v5, :cond_2

    .line 40
    .line 41
    if-ne v0, v4, :cond_1

    .line 42
    .line 43
    iget-object v5, p0, Loq1;->m:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v6, p0, Loq1;->l:Ljava/util/Iterator;

    .line 46
    .line 47
    iget-object v0, p0, Loq1;->k:Ljava/util/Set;

    .line 48
    .line 49
    move-object v7, v0

    .line 50
    check-cast v7, Ljava/util/Set;

    .line 51
    .line 52
    :try_start_0
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :catch_0
    move-exception v0

    .line 58
    move-object p1, v0

    .line 59
    move-object v9, p1

    .line 60
    move-object v8, v5

    .line 61
    move-object p1, v6

    .line 62
    move-object v0, v7

    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v2

    .line 71
    :cond_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, Lpp1;->a:Lpp1;

    .line 79
    .line 80
    invoke-static {}, Lpp1;->f()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    sget-object p0, La83;->a:La83;

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_4
    sget-object p1, Lsq1;->m:Lwj2;

    .line 90
    .line 91
    if-eqz p1, :cond_11

    .line 92
    .line 93
    iput v5, p0, Loq1;->p:I

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Lwj2;->k(Lu00;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, v1, :cond_5

    .line 100
    .line 101
    goto/16 :goto_5

    .line 102
    .line 103
    :cond_5
    :goto_2
    check-cast p1, Lyj2;

    .line 104
    .line 105
    iget-object p1, p1, Lyj2;->a:Ljava/util/List;

    .line 106
    .line 107
    new-instance v0, Ljava/util/ArrayList;

    .line 108
    .line 109
    const/16 v5, 0xa

    .line 110
    .line 111
    invoke-static {p1, v5}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_6

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    check-cast v5, Lme1;

    .line 133
    .line 134
    iget-object v5, v5, Lme1;->a:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    invoke-static {v0}, Ldu;->K0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    sget-object v0, Lsq1;->l:Lkj1;

    .line 145
    .line 146
    if-eqz v0, :cond_10

    .line 147
    .line 148
    iget-object v5, v0, Lkj1;->j:Ljava/lang/Object;

    .line 149
    .line 150
    monitor-enter v5

    .line 151
    :try_start_1
    invoke-virtual {v0}, Lkj1;->E()Ljava/util/Set;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Ljava/lang/Iterable;

    .line 156
    .line 157
    invoke-static {v0}, Ldu;->K0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 158
    .line 159
    .line 160
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    monitor-exit v5

    .line 162
    check-cast v0, Ljava/lang/Iterable;

    .line 163
    .line 164
    invoke-static {v0}, Ldu;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    move-object v7, p1

    .line 173
    move-object v6, v0

    .line 174
    :cond_7
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_f

    .line 179
    .line 180
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    move-object v5, p1

    .line 185
    check-cast v5, Ljava/lang/String;

    .line 186
    .line 187
    sget-object p1, Lsq1;->q:Ljava/util/LinkedHashMap;

    .line 188
    .line 189
    invoke-virtual {p1, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    check-cast p1, Lz80;

    .line 194
    .line 195
    if-eqz p1, :cond_d

    .line 196
    .line 197
    sget-object v0, Lsq1;->k:Lkj1;

    .line 198
    .line 199
    if-eqz v0, :cond_c

    .line 200
    .line 201
    iget-object v8, p1, Lz80;->b:Lth2;

    .line 202
    .line 203
    invoke-virtual {v0, v8}, Lkj1;->C(Lth2;)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-nez v0, :cond_8

    .line 208
    .line 209
    goto :goto_8

    .line 210
    :cond_8
    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-nez v0, :cond_7

    .line 215
    .line 216
    :try_start_2
    sget-object v0, Lsq1;->m:Lwj2;

    .line 217
    .line 218
    if-eqz v0, :cond_a

    .line 219
    .line 220
    move-object v8, v7

    .line 221
    check-cast v8, Ljava/util/Set;

    .line 222
    .line 223
    iput-object v8, p0, Loq1;->k:Ljava/util/Set;

    .line 224
    .line 225
    iput-object v6, p0, Loq1;->l:Ljava/util/Iterator;

    .line 226
    .line 227
    iput-object v5, p0, Loq1;->m:Ljava/lang/String;

    .line 228
    .line 229
    iput v4, p0, Loq1;->p:I

    .line 230
    .line 231
    invoke-virtual {v0, p1, p0}, Lwj2;->l(Lz80;Lu00;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    if-ne p1, v1, :cond_9

    .line 236
    .line 237
    :goto_5
    return-object v1

    .line 238
    :cond_9
    :goto_6
    sget-object p1, Lsq1;->r:Ljava/util/LinkedHashMap;

    .line 239
    .line 240
    invoke-virtual {p1, v5}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_a
    const-string p1, "runtimeManager"

    .line 245
    .line 246
    invoke-static {p1}, Lt11;->S(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw v2
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 250
    :goto_7
    sget-object v5, Lsq1;->r:Ljava/util/LinkedHashMap;

    .line 251
    .line 252
    const v6, 0x790b01f1

    .line 253
    .line 254
    .line 255
    new-array v7, v3, [Ljava/lang/Object;

    .line 256
    .line 257
    invoke-static {v6, v7}, Lsq1;->o(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-interface {v5, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    sget-object v5, Lsq1;->h:Lb5;

    .line 265
    .line 266
    if-eqz v5, :cond_b

    .line 267
    .line 268
    sget-object v6, Lph2;->k:Lph2;

    .line 269
    .line 270
    const-string v7, "Unable to restore enabled script "

    .line 271
    .line 272
    const-string v10, "."

    .line 273
    .line 274
    invoke-static {v7, v8, v10}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    const/16 v10, 0x10

    .line 279
    .line 280
    invoke-static/range {v5 .. v10}, Lb5;->x(Lb5;Lph2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 281
    .line 282
    .line 283
    move-object v6, p1

    .line 284
    move-object v7, v0

    .line 285
    goto :goto_4

    .line 286
    :cond_b
    const-string p0, "scriptLogger"

    .line 287
    .line 288
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw v2

    .line 292
    :catch_1
    move-exception v0

    .line 293
    move-object p0, v0

    .line 294
    throw p0

    .line 295
    :cond_c
    const-string p0, "permissionStore"

    .line 296
    .line 297
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v2

    .line 301
    :cond_d
    :goto_8
    sget-object p1, Lsq1;->l:Lkj1;

    .line 302
    .line 303
    if-eqz p1, :cond_e

    .line 304
    .line 305
    invoke-virtual {p1, v5, v3}, Lkj1;->J(Ljava/lang/String;Z)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_4

    .line 309
    .line 310
    :cond_e
    const-string p0, "enabledStore"

    .line 311
    .line 312
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw v2

    .line 316
    :cond_f
    sget-object p0, La83;->a:La83;

    .line 317
    .line 318
    return-object p0

    .line 319
    :catchall_0
    move-exception v0

    .line 320
    move-object p0, v0

    .line 321
    monitor-exit v5

    .line 322
    throw p0

    .line 323
    :cond_10
    const-string p0, "enabledStore"

    .line 324
    .line 325
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw v2

    .line 329
    :cond_11
    const-string p0, "runtimeManager"

    .line 330
    .line 331
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw v2
.end method

.method public final l(Ljava/lang/String;Lu00;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lpq1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lpq1;

    .line 7
    .line 8
    iget v1, v0, Lpq1;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpq1;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpq1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lpq1;-><init>(Lsq1;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lpq1;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p2, Lk20;->h:Lk20;

    .line 28
    .line 29
    iget v1, v0, Lpq1;->o:I

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    const/4 v3, 0x1

    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Lpq1;->l:Lil1;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_4

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_6

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v4

    .line 54
    :cond_2
    iget-object p1, v0, Lpq1;->l:Lil1;

    .line 55
    .line 56
    iget-object v1, v0, Lpq1;->k:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object p0, p1

    .line 62
    move-object p1, v1

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lsq1;->c:Lkl1;

    .line 68
    .line 69
    iput-object p1, v0, Lpq1;->k:Ljava/lang/String;

    .line 70
    .line 71
    iput-object p0, v0, Lpq1;->l:Lil1;

    .line 72
    .line 73
    iput v3, v0, Lpq1;->o:I

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-ne v1, p2, :cond_4

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    :goto_1
    :try_start_1
    sget-object v1, Lsq1;->k:Lkj1;

    .line 83
    .line 84
    if-eqz v1, :cond_7

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object v3, v1, Lkj1;->j:Ljava/lang/Object;

    .line 90
    .line 91
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 92
    :try_start_2
    invoke-virtual {v1}, Lkj1;->D()Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-interface {v5, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    invoke-virtual {v1, v5}, Lkj1;->F(Ljava/util/Map;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_1
    move-exception p1

    .line 107
    goto :goto_5

    .line 108
    :cond_5
    :goto_2
    :try_start_3
    monitor-exit v3

    .line 109
    sget-object p1, Lsq1;->a:Lsq1;

    .line 110
    .line 111
    iput-object v4, v0, Lpq1;->k:Ljava/lang/String;

    .line 112
    .line 113
    iput-object p0, v0, Lpq1;->l:Lil1;

    .line 114
    .line 115
    iput v2, v0, Lpq1;->o:I

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Lsq1;->i(Lu00;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 121
    if-ne p1, p2, :cond_6

    .line 122
    .line 123
    :goto_3
    return-object p2

    .line 124
    :cond_6
    move-object p1, p0

    .line 125
    :goto_4
    :try_start_4
    sget-object p0, La83;->a:La83;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 126
    .line 127
    check-cast p1, Lkl1;

    .line 128
    .line 129
    invoke-virtual {p1, v4}, Lkl1;->f(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-object p0

    .line 133
    :catchall_2
    move-exception p1

    .line 134
    move-object v6, p1

    .line 135
    move-object p1, p0

    .line 136
    move-object p0, v6

    .line 137
    goto :goto_6

    .line 138
    :goto_5
    :try_start_5
    monitor-exit v3

    .line 139
    throw p1

    .line 140
    :cond_7
    const-string p1, "permissionStore"

    .line 141
    .line 142
    invoke-static {p1}, Lt11;->S(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 146
    :goto_6
    check-cast p1, Lkl1;

    .line 147
    .line 148
    invoke-virtual {p1, v4}, Lkl1;->f(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    throw p0
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;Lj31;Lu00;)Ljava/lang/Object;
    .locals 9

    .line 1
    const-string v0, "Unknown script setting \'"

    .line 2
    .line 3
    instance-of v1, p4, Lqq1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p4

    .line 8
    check-cast v1, Lqq1;

    .line 9
    .line 10
    iget v2, v1, Lqq1;->s:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lqq1;->s:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lqq1;

    .line 23
    .line 24
    invoke-direct {v1, p0, p4}, Lqq1;-><init>(Lsq1;Lu00;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p0, v1, Lqq1;->q:Ljava/lang/Object;

    .line 28
    .line 29
    iget p4, v1, Lqq1;->s:I

    .line 30
    .line 31
    const-string v2, "runtimeManager"

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    sget-object v4, Lsq1;->a:Lsq1;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    sget-object v6, Lk20;->h:Lk20;

    .line 38
    .line 39
    packed-switch p4, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v5

    .line 48
    :pswitch_0
    iget-object p1, v1, Lqq1;->o:Luq1;

    .line 49
    .line 50
    iget-object p2, v1, Lqq1;->n:Lil1;

    .line 51
    .line 52
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_f

    .line 56
    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto/16 :goto_10

    .line 59
    .line 60
    :pswitch_1
    iget p1, v1, Lqq1;->p:I

    .line 61
    .line 62
    iget-object p2, v1, Lqq1;->o:Luq1;

    .line 63
    .line 64
    iget-object p3, v1, Lqq1;->n:Lil1;

    .line 65
    .line 66
    :try_start_1
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    .line 68
    .line 69
    move-object v8, p3

    .line 70
    move-object p3, p2

    .line 71
    move-object p2, v8

    .line 72
    goto/16 :goto_c

    .line 73
    .line 74
    :catchall_1
    move-exception p0

    .line 75
    move-object p2, p3

    .line 76
    goto/16 :goto_10

    .line 77
    .line 78
    :pswitch_2
    iget-object p1, v1, Lqq1;->o:Luq1;

    .line 79
    .line 80
    iget-object p2, v1, Lqq1;->n:Lil1;

    .line 81
    .line 82
    iget-object p3, v1, Lqq1;->k:Ljava/lang/String;

    .line 83
    .line 84
    :try_start_2
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    .line 86
    .line 87
    move-object v8, p2

    .line 88
    move-object p2, p1

    .line 89
    :goto_1
    move-object p1, v8

    .line 90
    goto/16 :goto_a

    .line 91
    .line 92
    :pswitch_3
    iget-object p2, v1, Lqq1;->n:Lil1;

    .line 93
    .line 94
    iget-object p1, v1, Lqq1;->k:Ljava/lang/String;

    .line 95
    .line 96
    :try_start_3
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 97
    .line 98
    .line 99
    :cond_1
    move-object p3, p1

    .line 100
    goto/16 :goto_9

    .line 101
    .line 102
    :pswitch_4
    iget-object p2, v1, Lqq1;->n:Lil1;

    .line 103
    .line 104
    iget-object p1, v1, Lqq1;->k:Ljava/lang/String;

    .line 105
    .line 106
    :try_start_4
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 107
    .line 108
    .line 109
    goto/16 :goto_8

    .line 110
    .line 111
    :pswitch_5
    iget-object p2, v1, Lqq1;->n:Lil1;

    .line 112
    .line 113
    iget-object p1, v1, Lqq1;->m:Lj31;

    .line 114
    .line 115
    iget-object p3, v1, Lqq1;->l:Ljava/lang/String;

    .line 116
    .line 117
    iget-object p4, v1, Lqq1;->k:Ljava/lang/String;

    .line 118
    .line 119
    :try_start_5
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :pswitch_6
    iget-object p1, v1, Lqq1;->n:Lil1;

    .line 124
    .line 125
    iget-object p3, v1, Lqq1;->m:Lj31;

    .line 126
    .line 127
    iget-object p2, v1, Lqq1;->l:Ljava/lang/String;

    .line 128
    .line 129
    iget-object p4, v1, Lqq1;->k:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object p0, p1

    .line 135
    move-object p1, p4

    .line 136
    goto :goto_2

    .line 137
    :pswitch_7
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iput-object p1, v1, Lqq1;->k:Ljava/lang/String;

    .line 141
    .line 142
    iput-object p2, v1, Lqq1;->l:Ljava/lang/String;

    .line 143
    .line 144
    iput-object p3, v1, Lqq1;->m:Lj31;

    .line 145
    .line 146
    sget-object p0, Lsq1;->c:Lkl1;

    .line 147
    .line 148
    iput-object p0, v1, Lqq1;->n:Lil1;

    .line 149
    .line 150
    iput v3, v1, Lqq1;->s:I

    .line 151
    .line 152
    invoke-virtual {p0, v1}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p4

    .line 156
    if-ne p4, v6, :cond_2

    .line 157
    .line 158
    goto/16 :goto_e

    .line 159
    .line 160
    :cond_2
    :goto_2
    :try_start_6
    iput-object p1, v1, Lqq1;->k:Ljava/lang/String;

    .line 161
    .line 162
    iput-object p2, v1, Lqq1;->l:Ljava/lang/String;

    .line 163
    .line 164
    iput-object p3, v1, Lqq1;->m:Lj31;

    .line 165
    .line 166
    iput-object p0, v1, Lqq1;->n:Lil1;

    .line 167
    .line 168
    const/4 p4, 0x2

    .line 169
    iput p4, v1, Lqq1;->s:I

    .line 170
    .line 171
    invoke-virtual {v4, p1, v1}, Lsq1;->e(Ljava/lang/String;Lu00;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 175
    if-ne p4, v6, :cond_3

    .line 176
    .line 177
    goto/16 :goto_e

    .line 178
    .line 179
    :cond_3
    move-object v8, p2

    .line 180
    move-object p2, p0

    .line 181
    move-object p0, p4

    .line 182
    move-object p4, p1

    .line 183
    move-object p1, p3

    .line 184
    move-object p3, v8

    .line 185
    :goto_3
    :try_start_7
    check-cast p0, Luq1;

    .line 186
    .line 187
    iget-object v7, p0, Luq1;->b:Llf2;

    .line 188
    .line 189
    iget-object v7, v7, Llf2;->a:Ljava/util/LinkedHashMap;

    .line 190
    .line 191
    invoke-virtual {v7, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    check-cast v7, Lkf2;

    .line 196
    .line 197
    if-eqz v7, :cond_13

    .line 198
    .line 199
    if-eqz p1, :cond_5

    .line 200
    .line 201
    invoke-static {v7, p1}, Lup0;->M(Lkf2;Lj31;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    if-nez v0, :cond_4

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p0

    .line 214
    :cond_5
    :goto_4
    iget-object p0, p0, Luq1;->c:Lrf2;

    .line 215
    .line 216
    iget-object p0, p0, Lrf2;->a:Ld41;

    .line 217
    .line 218
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 222
    .line 223
    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 224
    .line 225
    .line 226
    if-nez p1, :cond_6

    .line 227
    .line 228
    invoke-interface {v0, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    :goto_5
    check-cast p0, Lj31;

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_6
    invoke-interface {v0, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    goto :goto_5

    .line 240
    :goto_6
    sget-object p0, Lsq1;->j:Lb5;

    .line 241
    .line 242
    if-eqz p0, :cond_12

    .line 243
    .line 244
    new-instance p1, Ld41;

    .line 245
    .line 246
    invoke-direct {p1, v0}, Ld41;-><init>(Ljava/util/Map;)V

    .line 247
    .line 248
    .line 249
    iput-object p4, v1, Lqq1;->k:Ljava/lang/String;

    .line 250
    .line 251
    iput-object v5, v1, Lqq1;->l:Ljava/lang/String;

    .line 252
    .line 253
    iput-object v5, v1, Lqq1;->m:Lj31;

    .line 254
    .line 255
    iput-object p2, v1, Lqq1;->n:Lil1;

    .line 256
    .line 257
    const/4 p3, 0x3

    .line 258
    iput p3, v1, Lqq1;->s:I

    .line 259
    .line 260
    iget-object p3, p0, Lb5;->i:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast p3, Lc20;

    .line 263
    .line 264
    new-instance v0, Lu0;

    .line 265
    .line 266
    invoke-direct {v0, p0, p4, p1, v5}, Lu0;-><init>(Lb5;Ljava/lang/String;Ld41;Lt00;)V

    .line 267
    .line 268
    .line 269
    invoke-static {p3, v0, v1}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    if-ne p0, v6, :cond_7

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_7
    sget-object p0, La83;->a:La83;

    .line 277
    .line 278
    :goto_7
    if-ne p0, v6, :cond_8

    .line 279
    .line 280
    goto/16 :goto_e

    .line 281
    .line 282
    :cond_8
    move-object p1, p4

    .line 283
    :goto_8
    iput-object p1, v1, Lqq1;->k:Ljava/lang/String;

    .line 284
    .line 285
    iput-object v5, v1, Lqq1;->l:Ljava/lang/String;

    .line 286
    .line 287
    iput-object v5, v1, Lqq1;->m:Lj31;

    .line 288
    .line 289
    iput-object p2, v1, Lqq1;->n:Lil1;

    .line 290
    .line 291
    const/4 p0, 0x4

    .line 292
    iput p0, v1, Lqq1;->s:I

    .line 293
    .line 294
    invoke-virtual {v4, p1, v1}, Lsq1;->e(Ljava/lang/String;Lu00;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    if-ne p0, v6, :cond_1

    .line 299
    .line 300
    goto/16 :goto_e

    .line 301
    .line 302
    :goto_9
    check-cast p0, Luq1;

    .line 303
    .line 304
    sget-object p1, Lsq1;->m:Lwj2;

    .line 305
    .line 306
    if-eqz p1, :cond_11

    .line 307
    .line 308
    iput-object p3, v1, Lqq1;->k:Ljava/lang/String;

    .line 309
    .line 310
    iput-object v5, v1, Lqq1;->l:Ljava/lang/String;

    .line 311
    .line 312
    iput-object v5, v1, Lqq1;->m:Lj31;

    .line 313
    .line 314
    iput-object p2, v1, Lqq1;->n:Lil1;

    .line 315
    .line 316
    iput-object p0, v1, Lqq1;->o:Luq1;

    .line 317
    .line 318
    const/4 p4, 0x5

    .line 319
    iput p4, v1, Lqq1;->s:I

    .line 320
    .line 321
    invoke-virtual {p1, v1}, Lwj2;->k(Lu00;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 325
    if-ne p1, v6, :cond_9

    .line 326
    .line 327
    goto/16 :goto_e

    .line 328
    .line 329
    :cond_9
    move-object v8, p2

    .line 330
    move-object p2, p0

    .line 331
    move-object p0, p1

    .line 332
    goto/16 :goto_1

    .line 333
    .line 334
    :goto_a
    :try_start_8
    check-cast p0, Lyj2;

    .line 335
    .line 336
    iget-object p0, p0, Lyj2;->a:Ljava/util/List;

    .line 337
    .line 338
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 339
    .line 340
    .line 341
    move-result p4

    .line 342
    const/4 v0, 0x0

    .line 343
    if-eqz p4, :cond_b

    .line 344
    .line 345
    :cond_a
    move v3, v0

    .line 346
    goto :goto_b

    .line 347
    :cond_b
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result p4

    .line 355
    if-eqz p4, :cond_a

    .line 356
    .line 357
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object p4

    .line 361
    check-cast p4, Lme1;

    .line 362
    .line 363
    iget-object p4, p4, Lme1;->a:Ljava/lang/String;

    .line 364
    .line 365
    invoke-static {p4, p3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result p4

    .line 369
    if-eqz p4, :cond_c

    .line 370
    .line 371
    goto :goto_b

    .line 372
    :catchall_2
    move-exception p0

    .line 373
    move-object p2, p1

    .line 374
    goto/16 :goto_10

    .line 375
    .line 376
    :goto_b
    if-eqz v3, :cond_f

    .line 377
    .line 378
    iget-object p0, p2, Luq1;->c:Lrf2;

    .line 379
    .line 380
    invoke-virtual {p0}, Lrf2;->a()Z

    .line 381
    .line 382
    .line 383
    move-result p0

    .line 384
    if-eqz p0, :cond_f

    .line 385
    .line 386
    sget-object p0, Lsq1;->q:Ljava/util/LinkedHashMap;

    .line 387
    .line 388
    invoke-virtual {p0, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    check-cast p0, Lz80;

    .line 393
    .line 394
    if-eqz p0, :cond_f

    .line 395
    .line 396
    sget-object p3, Lsq1;->m:Lwj2;

    .line 397
    .line 398
    if-eqz p3, :cond_e

    .line 399
    .line 400
    iput-object v5, v1, Lqq1;->k:Ljava/lang/String;

    .line 401
    .line 402
    iput-object v5, v1, Lqq1;->l:Ljava/lang/String;

    .line 403
    .line 404
    iput-object v5, v1, Lqq1;->m:Lj31;

    .line 405
    .line 406
    iput-object p1, v1, Lqq1;->n:Lil1;

    .line 407
    .line 408
    iput-object p2, v1, Lqq1;->o:Luq1;

    .line 409
    .line 410
    iput v3, v1, Lqq1;->p:I

    .line 411
    .line 412
    const/4 p4, 0x6

    .line 413
    iput p4, v1, Lqq1;->s:I

    .line 414
    .line 415
    invoke-virtual {p3, p0, v1}, Lwj2;->g(Lz80;Lu00;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 419
    if-ne p0, v6, :cond_d

    .line 420
    .line 421
    goto :goto_e

    .line 422
    :cond_d
    move-object p3, p2

    .line 423
    move-object p2, p1

    .line 424
    move p1, v3

    .line 425
    :goto_c
    :try_start_9
    check-cast p0, Lf52;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 426
    .line 427
    move v3, p1

    .line 428
    move-object p1, p3

    .line 429
    goto :goto_d

    .line 430
    :cond_e
    :try_start_a
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    throw v5
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 434
    :cond_f
    move-object v8, p2

    .line 435
    move-object p2, p1

    .line 436
    move-object p1, v8

    .line 437
    :goto_d
    :try_start_b
    iput-object v5, v1, Lqq1;->k:Ljava/lang/String;

    .line 438
    .line 439
    iput-object v5, v1, Lqq1;->l:Ljava/lang/String;

    .line 440
    .line 441
    iput-object v5, v1, Lqq1;->m:Lj31;

    .line 442
    .line 443
    iput-object p2, v1, Lqq1;->n:Lil1;

    .line 444
    .line 445
    iput-object p1, v1, Lqq1;->o:Luq1;

    .line 446
    .line 447
    iput v3, v1, Lqq1;->p:I

    .line 448
    .line 449
    const/4 p0, 0x7

    .line 450
    iput p0, v1, Lqq1;->s:I

    .line 451
    .line 452
    invoke-virtual {v4, v1}, Lsq1;->j(Lu00;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 456
    if-ne p0, v6, :cond_10

    .line 457
    .line 458
    :goto_e
    return-object v6

    .line 459
    :cond_10
    :goto_f
    check-cast p2, Lkl1;

    .line 460
    .line 461
    invoke-virtual {p2, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    return-object p1

    .line 465
    :cond_11
    :try_start_c
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    throw v5

    .line 469
    :cond_12
    const-string p0, "configStore"

    .line 470
    .line 471
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw v5

    .line 475
    :cond_13
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 476
    .line 477
    new-instance p1, Ljava/lang/StringBuilder;

    .line 478
    .line 479
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    const-string p3, "\'."

    .line 486
    .line 487
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object p1

    .line 494
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    throw p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 498
    :catchall_3
    move-exception p1

    .line 499
    move-object p2, p0

    .line 500
    move-object p0, p1

    .line 501
    :goto_10
    check-cast p2, Lkl1;

    .line 502
    .line 503
    invoke-virtual {p2, v5}, Lkl1;->f(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    throw p0

    .line 507
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Ljava/lang/String;ZLu00;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    sget-object v1, Lsq1;->a:Lsq1;

    .line 4
    .line 5
    const-string v2, "Script \'"

    .line 6
    .line 7
    instance-of v3, v0, Lrq1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, Lrq1;

    .line 13
    .line 14
    iget v4, v3, Lrq1;->r:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lrq1;->r:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lrq1;

    .line 27
    .line 28
    move-object/from16 v4, p0

    .line 29
    .line 30
    invoke-direct {v3, v4, v0}, Lrq1;-><init>(Lsq1;Lu00;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, v3, Lrq1;->p:Ljava/lang/Object;

    .line 34
    .line 35
    iget v4, v3, Lrq1;->r:I

    .line 36
    .line 37
    sget-object v5, Lsq1;->r:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    const/4 v6, 0x5

    .line 40
    const/4 v7, 0x4

    .line 41
    const/4 v8, 0x3

    .line 42
    const/4 v9, 0x2

    .line 43
    const-string v10, "enabledStore"

    .line 44
    .line 45
    const-string v11, "runtimeManager"

    .line 46
    .line 47
    const/4 v12, 0x1

    .line 48
    const/4 v14, 0x0

    .line 49
    sget-object v15, Lk20;->h:Lk20;

    .line 50
    .line 51
    if-eqz v4, :cond_6

    .line 52
    .line 53
    if-eq v4, v12, :cond_5

    .line 54
    .line 55
    if-eq v4, v9, :cond_4

    .line 56
    .line 57
    if-eq v4, v8, :cond_3

    .line 58
    .line 59
    if-eq v4, v7, :cond_2

    .line 60
    .line 61
    if-ne v4, v6, :cond_1

    .line 62
    .line 63
    iget-object v1, v3, Lrq1;->l:Lil1;

    .line 64
    .line 65
    :try_start_0
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    goto/16 :goto_d

    .line 69
    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto/16 :goto_e

    .line 72
    .line 73
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v14

    .line 79
    :cond_2
    iget v2, v3, Lrq1;->o:I

    .line 80
    .line 81
    iget-boolean v4, v3, Lrq1;->n:Z

    .line 82
    .line 83
    iget-object v7, v3, Lrq1;->l:Lil1;

    .line 84
    .line 85
    iget-object v8, v3, Lrq1;->k:Ljava/lang/String;

    .line 86
    .line 87
    :try_start_1
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    .line 89
    .line 90
    goto/16 :goto_9

    .line 91
    .line 92
    :catchall_1
    move-exception v0

    .line 93
    move-object v1, v7

    .line 94
    goto/16 :goto_e

    .line 95
    .line 96
    :cond_3
    iget v2, v3, Lrq1;->o:I

    .line 97
    .line 98
    iget-boolean v4, v3, Lrq1;->n:Z

    .line 99
    .line 100
    iget-object v7, v3, Lrq1;->l:Lil1;

    .line 101
    .line 102
    iget-object v8, v3, Lrq1;->k:Ljava/lang/String;

    .line 103
    .line 104
    :try_start_2
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    .line 106
    .line 107
    goto/16 :goto_4

    .line 108
    .line 109
    :catch_0
    move-exception v0

    .line 110
    move-object v1, v0

    .line 111
    move-object v6, v7

    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_4
    iget-boolean v2, v3, Lrq1;->n:Z

    .line 115
    .line 116
    iget-object v4, v3, Lrq1;->m:Lz80;

    .line 117
    .line 118
    iget-object v9, v3, Lrq1;->l:Lil1;

    .line 119
    .line 120
    iget-object v6, v3, Lrq1;->k:Ljava/lang/String;

    .line 121
    .line 122
    :try_start_3
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    .line 124
    .line 125
    move-object v7, v4

    .line 126
    move v4, v2

    .line 127
    move-object v2, v6

    .line 128
    move-object v6, v9

    .line 129
    goto :goto_2

    .line 130
    :catchall_2
    move-exception v0

    .line 131
    move-object v1, v9

    .line 132
    goto/16 :goto_e

    .line 133
    .line 134
    :cond_5
    iget-boolean v4, v3, Lrq1;->n:Z

    .line 135
    .line 136
    iget-object v6, v3, Lrq1;->l:Lil1;

    .line 137
    .line 138
    iget-object v7, v3, Lrq1;->k:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    move-object v0, v7

    .line 144
    goto :goto_1

    .line 145
    :cond_6
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object/from16 v0, p1

    .line 149
    .line 150
    iput-object v0, v3, Lrq1;->k:Ljava/lang/String;

    .line 151
    .line 152
    sget-object v4, Lsq1;->c:Lkl1;

    .line 153
    .line 154
    iput-object v4, v3, Lrq1;->l:Lil1;

    .line 155
    .line 156
    move/from16 v6, p2

    .line 157
    .line 158
    iput-boolean v6, v3, Lrq1;->n:Z

    .line 159
    .line 160
    iput v12, v3, Lrq1;->r:I

    .line 161
    .line 162
    invoke-virtual {v4, v3}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    if-ne v7, v15, :cond_7

    .line 167
    .line 168
    goto/16 :goto_c

    .line 169
    .line 170
    :cond_7
    move/from16 v16, v6

    .line 171
    .line 172
    move-object v6, v4

    .line 173
    move/from16 v4, v16

    .line 174
    .line 175
    :goto_1
    :try_start_4
    sget-object v7, Lsq1;->q:Ljava/util/LinkedHashMap;

    .line 176
    .line 177
    invoke-virtual {v7, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    check-cast v7, Lz80;

    .line 182
    .line 183
    if-eqz v7, :cond_1b

    .line 184
    .line 185
    sget-object v2, Lsq1;->m:Lwj2;

    .line 186
    .line 187
    if-eqz v2, :cond_1a

    .line 188
    .line 189
    iput-object v0, v3, Lrq1;->k:Ljava/lang/String;

    .line 190
    .line 191
    iput-object v6, v3, Lrq1;->l:Lil1;

    .line 192
    .line 193
    iput-object v7, v3, Lrq1;->m:Lz80;

    .line 194
    .line 195
    iput-boolean v4, v3, Lrq1;->n:Z

    .line 196
    .line 197
    iput v9, v3, Lrq1;->r:I

    .line 198
    .line 199
    invoke-virtual {v2, v3}, Lwj2;->k(Lu00;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    if-ne v2, v15, :cond_8

    .line 204
    .line 205
    goto/16 :goto_c

    .line 206
    .line 207
    :cond_8
    move-object/from16 v16, v2

    .line 208
    .line 209
    move-object v2, v0

    .line 210
    move-object/from16 v0, v16

    .line 211
    .line 212
    :goto_2
    check-cast v0, Lyj2;

    .line 213
    .line 214
    iget-object v0, v0, Lyj2;->a:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    if-eqz v9, :cond_a

    .line 221
    .line 222
    :cond_9
    const/4 v0, 0x0

    .line 223
    goto :goto_3

    .line 224
    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    if-eqz v9, :cond_9

    .line 233
    .line 234
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    check-cast v9, Lme1;

    .line 239
    .line 240
    iget-object v9, v9, Lme1;->a:Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {v9, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    if-eqz v9, :cond_b

    .line 247
    .line 248
    move v0, v12

    .line 249
    goto :goto_3

    .line 250
    :catchall_3
    move-exception v0

    .line 251
    move-object v1, v6

    .line 252
    goto/16 :goto_e

    .line 253
    .line 254
    :goto_3
    if-eqz v4, :cond_14

    .line 255
    .line 256
    sget-object v9, Lpp1;->a:Lpp1;

    .line 257
    .line 258
    invoke-static {}, Lpp1;->f()Z

    .line 259
    .line 260
    .line 261
    move-result v9

    .line 262
    if-nez v9, :cond_13

    .line 263
    .line 264
    sget-object v9, Lsq1;->k:Lkj1;

    .line 265
    .line 266
    if-eqz v9, :cond_12

    .line 267
    .line 268
    iget-object v13, v7, Lz80;->b:Lth2;

    .line 269
    .line 270
    invoke-virtual {v9, v13}, Lkj1;->C(Lth2;)Z

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    if-eqz v9, :cond_11

    .line 275
    .line 276
    sget-object v9, Lsq1;->l:Lkj1;

    .line 277
    .line 278
    if-eqz v9, :cond_10

    .line 279
    .line 280
    invoke-virtual {v9, v2, v12}, Lkj1;->J(Ljava/lang/String;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 281
    .line 282
    .line 283
    if-nez v0, :cond_f

    .line 284
    .line 285
    :try_start_5
    sget-object v9, Lsq1;->m:Lwj2;

    .line 286
    .line 287
    if-eqz v9, :cond_d

    .line 288
    .line 289
    iput-object v2, v3, Lrq1;->k:Ljava/lang/String;

    .line 290
    .line 291
    iput-object v6, v3, Lrq1;->l:Lil1;

    .line 292
    .line 293
    iput-object v14, v3, Lrq1;->m:Lz80;

    .line 294
    .line 295
    iput-boolean v4, v3, Lrq1;->n:Z

    .line 296
    .line 297
    iput v0, v3, Lrq1;->o:I

    .line 298
    .line 299
    iput v8, v3, Lrq1;->r:I

    .line 300
    .line 301
    invoke-virtual {v9, v7, v3}, Lwj2;->l(Lz80;Lu00;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    if-ne v7, v15, :cond_c

    .line 306
    .line 307
    goto/16 :goto_c

    .line 308
    .line 309
    :cond_c
    move-object v8, v2

    .line 310
    move-object v7, v6

    .line 311
    move v2, v0

    .line 312
    :goto_4
    move v0, v2

    .line 313
    move-object v6, v7

    .line 314
    move-object v2, v8

    .line 315
    goto :goto_8

    .line 316
    :catch_1
    move-exception v0

    .line 317
    move-object v1, v0

    .line 318
    move-object v8, v2

    .line 319
    goto :goto_5

    .line 320
    :cond_d
    invoke-static {v11}, Lt11;->S(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw v14
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 324
    :goto_5
    :try_start_6
    sget-object v0, Lsq1;->l:Lkj1;

    .line 325
    .line 326
    if-eqz v0, :cond_e

    .line 327
    .line 328
    const/4 v2, 0x0

    .line 329
    invoke-virtual {v0, v8, v2}, Lkj1;->J(Ljava/lang/String;Z)V

    .line 330
    .line 331
    .line 332
    goto :goto_7

    .line 333
    :catch_2
    move-exception v0

    .line 334
    goto :goto_6

    .line 335
    :cond_e
    invoke-static {v10}, Lt11;->S(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw v14
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 339
    :goto_6
    :try_start_7
    invoke-static {v1, v0}, Lfg1;->m(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 340
    .line 341
    .line 342
    :goto_7
    throw v1

    .line 343
    :cond_f
    :goto_8
    invoke-virtual {v5, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    check-cast v2, Ljava/lang/String;

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_10
    invoke-static {v10}, Lt11;->S(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v14

    .line 354
    :cond_11
    new-instance v0, Lbq1;

    .line 355
    .line 356
    iget-object v1, v7, Lz80;->b:Lth2;

    .line 357
    .line 358
    invoke-static {v1}, Lsq1;->b(Lth2;)Ljava/util/ArrayList;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-direct {v0, v2, v1}, Lbq1;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 363
    .line 364
    .line 365
    throw v0

    .line 366
    :cond_12
    const-string v0, "permissionStore"

    .line 367
    .line 368
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v14

    .line 372
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 373
    .line 374
    const/4 v2, 0x0

    .line 375
    new-array v1, v2, [Ljava/lang/Object;

    .line 376
    .line 377
    const v2, 0x790b021a

    .line 378
    .line 379
    .line 380
    invoke-static {v2, v1}, Lsq1;->o(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    throw v0

    .line 388
    :cond_14
    sget-object v7, Lsq1;->l:Lkj1;

    .line 389
    .line 390
    if-eqz v7, :cond_19

    .line 391
    .line 392
    const/4 v8, 0x0

    .line 393
    invoke-virtual {v7, v2, v8}, Lkj1;->J(Ljava/lang/String;Z)V

    .line 394
    .line 395
    .line 396
    if-eqz v0, :cond_17

    .line 397
    .line 398
    sget-object v7, Lsq1;->m:Lwj2;

    .line 399
    .line 400
    if-eqz v7, :cond_16

    .line 401
    .line 402
    iput-object v2, v3, Lrq1;->k:Ljava/lang/String;

    .line 403
    .line 404
    iput-object v6, v3, Lrq1;->l:Lil1;

    .line 405
    .line 406
    iput-object v14, v3, Lrq1;->m:Lz80;

    .line 407
    .line 408
    iput-boolean v4, v3, Lrq1;->n:Z

    .line 409
    .line 410
    iput v0, v3, Lrq1;->o:I

    .line 411
    .line 412
    const/4 v8, 0x4

    .line 413
    iput v8, v3, Lrq1;->r:I

    .line 414
    .line 415
    sget-object v8, Lxj2;->i:Lxj2;

    .line 416
    .line 417
    invoke-virtual {v7, v2, v8, v3}, Lwj2;->n(Ljava/lang/String;Lxj2;Lu00;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    if-ne v7, v15, :cond_15

    .line 422
    .line 423
    goto :goto_c

    .line 424
    :cond_15
    move-object v8, v2

    .line 425
    move-object v7, v6

    .line 426
    move v2, v0

    .line 427
    :goto_9
    move v0, v2

    .line 428
    move-object v6, v7

    .line 429
    move-object v2, v8

    .line 430
    goto :goto_a

    .line 431
    :cond_16
    invoke-static {v11}, Lt11;->S(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    throw v14

    .line 435
    :cond_17
    :goto_a
    invoke-virtual {v5, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    check-cast v2, Ljava/lang/String;

    .line 440
    .line 441
    :goto_b
    iput-object v14, v3, Lrq1;->k:Ljava/lang/String;

    .line 442
    .line 443
    iput-object v6, v3, Lrq1;->l:Lil1;

    .line 444
    .line 445
    iput-object v14, v3, Lrq1;->m:Lz80;

    .line 446
    .line 447
    iput-boolean v4, v3, Lrq1;->n:Z

    .line 448
    .line 449
    iput v0, v3, Lrq1;->o:I

    .line 450
    .line 451
    const/4 v0, 0x5

    .line 452
    iput v0, v3, Lrq1;->r:I

    .line 453
    .line 454
    invoke-virtual {v1, v3}, Lsq1;->j(Lu00;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 458
    if-ne v0, v15, :cond_18

    .line 459
    .line 460
    :goto_c
    return-object v15

    .line 461
    :cond_18
    move-object v1, v6

    .line 462
    :goto_d
    :try_start_8
    sget-object v0, La83;->a:La83;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 463
    .line 464
    check-cast v1, Lkl1;

    .line 465
    .line 466
    invoke-virtual {v1, v14}, Lkl1;->f(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    return-object v0

    .line 470
    :cond_19
    :try_start_9
    invoke-static {v10}, Lt11;->S(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    throw v14

    .line 474
    :cond_1a
    invoke-static {v11}, Lt11;->S(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    throw v14

    .line 478
    :cond_1b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 479
    .line 480
    new-instance v3, Ljava/lang/StringBuilder;

    .line 481
    .line 482
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    const-string v0, "\' is not available."

    .line 489
    .line 490
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 501
    :goto_e
    check-cast v1, Lkl1;

    .line 502
    .line 503
    invoke-virtual {v1, v14}, Lkl1;->f(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    throw v0
.end method
