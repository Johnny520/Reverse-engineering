.class public final synthetic Lhk2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lqf2;

.field public final synthetic i:Luq1;

.field public final synthetic j:Lxk1;

.field public final synthetic k:Lj20;

.field public final synthetic l:Landroid/content/Context;

.field public final synthetic m:Lxk1;

.field public final synthetic n:Lxk1;

.field public final synthetic o:Lxk1;

.field public final synthetic p:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lqf2;Luq1;Lxk1;Lj20;Landroid/content/Context;Lxk1;Lxk1;Lxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhk2;->h:Lqf2;

    .line 5
    .line 6
    iput-object p2, p0, Lhk2;->i:Luq1;

    .line 7
    .line 8
    iput-object p3, p0, Lhk2;->j:Lxk1;

    .line 9
    .line 10
    iput-object p4, p0, Lhk2;->k:Lj20;

    .line 11
    .line 12
    iput-object p5, p0, Lhk2;->l:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p6, p0, Lhk2;->m:Lxk1;

    .line 15
    .line 16
    iput-object p7, p0, Lhk2;->n:Lxk1;

    .line 17
    .line 18
    iput-object p8, p0, Lhk2;->o:Lxk1;

    .line 19
    .line 20
    iput-object p9, p0, Lhk2;->p:Lxk1;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lpx;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eq v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    :goto_0
    and-int/2addr v2, v5

    .line 25
    move-object v9, v1

    .line 26
    check-cast v9, Lgo0;

    .line 27
    .line 28
    invoke-virtual {v9, v2, v3}, Lgo0;->O(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_8

    .line 33
    .line 34
    iget-object v1, v0, Lhk2;->h:Lqf2;

    .line 35
    .line 36
    iget-object v1, v1, Lqf2;->c:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_9

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    move-object v13, v2

    .line 53
    check-cast v13, Ljava/lang/String;

    .line 54
    .line 55
    iget-object v12, v0, Lhk2;->i:Luq1;

    .line 56
    .line 57
    iget-object v2, v12, Luq1;->b:Llf2;

    .line 58
    .line 59
    iget-object v3, v12, Luq1;->c:Lrf2;

    .line 60
    .line 61
    iget-object v2, v2, Llf2;->a:Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-static {v13, v2}, Lwe1;->p0(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    move-object v15, v2

    .line 68
    check-cast v15, Lkf2;

    .line 69
    .line 70
    iget-object v2, v3, Lrf2;->b:Ld41;

    .line 71
    .line 72
    invoke-virtual {v2, v13}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    move-object v5, v2

    .line 77
    check-cast v5, Lj31;

    .line 78
    .line 79
    iget-object v2, v3, Lrf2;->c:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    const/4 v4, 0x0

    .line 90
    if-eqz v3, :cond_2

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    move-object v6, v3

    .line 97
    check-cast v6, Lgf2;

    .line 98
    .line 99
    iget-object v6, v6, Lgf2;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v6, v13}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    move-object v3, v4

    .line 109
    :goto_2
    check-cast v3, Lgf2;

    .line 110
    .line 111
    if-eqz v3, :cond_3

    .line 112
    .line 113
    iget-object v4, v3, Lgf2;->b:Ljava/lang/String;

    .line 114
    .line 115
    :cond_3
    move-object v6, v4

    .line 116
    iget-object v2, v0, Lhk2;->j:Lxk1;

    .line 117
    .line 118
    invoke-virtual {v9, v2}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    iget-object v4, v0, Lhk2;->k:Lj20;

    .line 123
    .line 124
    invoke-virtual {v9, v4}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    or-int/2addr v3, v7

    .line 129
    iget-object v7, v0, Lhk2;->l:Landroid/content/Context;

    .line 130
    .line 131
    invoke-virtual {v9, v7}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    or-int/2addr v3, v8

    .line 136
    invoke-virtual {v9, v15}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    or-int/2addr v3, v8

    .line 141
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    iget-object v10, v0, Lhk2;->n:Lxk1;

    .line 146
    .line 147
    iget-object v14, v0, Lhk2;->o:Lxk1;

    .line 148
    .line 149
    sget-object v11, Lnx;->a:Leb;

    .line 150
    .line 151
    if-nez v3, :cond_4

    .line 152
    .line 153
    if-ne v8, v11, :cond_5

    .line 154
    .line 155
    :cond_4
    move-object/from16 v20, v14

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_5
    move-object/from16 v16, v10

    .line 159
    .line 160
    move-object/from16 v20, v14

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :goto_3
    new-instance v14, Lkk2;

    .line 164
    .line 165
    iget-object v3, v0, Lhk2;->m:Lxk1;

    .line 166
    .line 167
    move-object/from16 v17, v2

    .line 168
    .line 169
    move-object/from16 v18, v3

    .line 170
    .line 171
    move-object/from16 v16, v4

    .line 172
    .line 173
    move-object/from16 v21, v7

    .line 174
    .line 175
    move-object/from16 v19, v10

    .line 176
    .line 177
    invoke-direct/range {v14 .. v21}, Lkk2;-><init>(Lkf2;Lj20;Lxk1;Lxk1;Lxk1;Lxk1;Landroid/content/Context;)V

    .line 178
    .line 179
    .line 180
    move-object/from16 v16, v19

    .line 181
    .line 182
    invoke-virtual {v9, v14}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    move-object v8, v14

    .line 186
    :goto_4
    move-object v7, v8

    .line 187
    check-cast v7, Lin0;

    .line 188
    .line 189
    invoke-virtual {v9, v15}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-virtual {v9, v12}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    or-int/2addr v2, v3

    .line 198
    invoke-virtual {v9, v13}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    or-int/2addr v2, v3

    .line 203
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    if-nez v2, :cond_6

    .line 208
    .line 209
    if-ne v3, v11, :cond_7

    .line 210
    .line 211
    :cond_6
    new-instance v10, Lmf;

    .line 212
    .line 213
    move-object v4, v15

    .line 214
    iget-object v15, v0, Lhk2;->p:Lxk1;

    .line 215
    .line 216
    move-object v11, v4

    .line 217
    move-object/from16 v14, v20

    .line 218
    .line 219
    invoke-direct/range {v10 .. v16}, Lmf;-><init>(Lkf2;Luq1;Ljava/lang/String;Lxk1;Lxk1;Lxk1;)V

    .line 220
    .line 221
    .line 222
    move-object v15, v11

    .line 223
    invoke-virtual {v9, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    move-object v3, v10

    .line 227
    :cond_7
    move-object v8, v3

    .line 228
    check-cast v8, Lxm0;

    .line 229
    .line 230
    const/4 v10, 0x0

    .line 231
    move-object v4, v15

    .line 232
    invoke-static/range {v4 .. v10}, Lrg3;->f(Lkf2;Lj31;Ljava/lang/String;Lin0;Lxm0;Lpx;I)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :cond_8
    invoke-virtual {v9}, Lgo0;->R()V

    .line 238
    .line 239
    .line 240
    :cond_9
    sget-object v0, La83;->a:La83;

    .line 241
    .line 242
    return-object v0
.end method
