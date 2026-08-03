.class public final synthetic Lc9/q0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lf9/e;Lf9/h;Lf9/c;Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lc9/q0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc9/q0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lc9/q0;->h:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lc9/q0;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lc9/q0;->j:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p5, p0, Lc9/q0;->g:I

    iput-object p1, p0, Lc9/q0;->i:Ljava/lang/Object;

    iput-object p2, p0, Lc9/q0;->j:Ljava/lang/Object;

    iput-object p3, p0, Lc9/q0;->h:Ljava/lang/Object;

    iput-object p4, p0, Lc9/q0;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lsf/b;Lsf/b;II)V
    .locals 0

    .line 17
    iput p6, p0, Lc9/q0;->g:I

    iput-object p1, p0, Lc9/q0;->i:Ljava/lang/Object;

    iput-object p2, p0, Lc9/q0;->j:Ljava/lang/Object;

    iput-object p3, p0, Lc9/q0;->h:Ljava/lang/Object;

    iput-object p4, p0, Lc9/q0;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly0/o;Lv/d;Lsh/f;Ls0/d;)V
    .locals 1

    .line 18
    const/4 v0, 0x3

    iput v0, p0, Lc9/q0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/q0;->i:Ljava/lang/Object;

    iput-object p2, p0, Lc9/q0;->j:Ljava/lang/Object;

    iput-object p3, p0, Lc9/q0;->k:Ljava/lang/Object;

    iput-object p4, p0, Lc9/q0;->h:Ljava/lang/Object;

    return-void
.end method

.method private final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lc9/q0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, v0, Lc9/q0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lwb/i5;

    .line 10
    .line 11
    iget-object v3, v0, Lc9/q0;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Li0/a1;

    .line 14
    .line 15
    iget-object v4, v0, Lc9/q0;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Li0/a1;

    .line 18
    .line 19
    move-object/from16 v10, p1

    .line 20
    .line 21
    check-cast v10, Li0/h0;

    .line 22
    .line 23
    move-object/from16 v5, p2

    .line 24
    .line 25
    check-cast v5, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    and-int/lit8 v6, v5, 0x3

    .line 32
    .line 33
    const/4 v7, 0x2

    .line 34
    const/4 v13, 0x0

    .line 35
    const/4 v14, 0x1

    .line 36
    if-eq v6, v7, :cond_0

    .line 37
    .line 38
    move v6, v14

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v6, v13

    .line 41
    :goto_0
    and-int/2addr v5, v14

    .line 42
    invoke-virtual {v10, v5, v6}, Li0/h0;->S(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_6

    .line 47
    .line 48
    iget-object v2, v2, Lwb/i5;->b:Laa/a;

    .line 49
    .line 50
    invoke-static {v2}, Lwb/ho;->l6(Laa/a;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    sget-object v15, Li0/l;->a:Li0/e;

    .line 59
    .line 60
    if-ne v5, v15, :cond_1

    .line 61
    .line 62
    new-instance v5, Lk/s1;

    .line 63
    .line 64
    const/16 v6, 0x19

    .line 65
    .line 66
    invoke-direct {v5, v6}, Lk/s1;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v10, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    check-cast v5, Lfg/a;

    .line 73
    .line 74
    const/16 v6, 0x180

    .line 75
    .line 76
    invoke-static {v1, v2, v5, v10, v6}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 77
    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    invoke-static {v1, v10, v13, v14}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    invoke-virtual {v10, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    if-nez v2, :cond_2

    .line 102
    .line 103
    if-ne v6, v15, :cond_3

    .line 104
    .line 105
    :cond_2
    new-instance v6, Lwb/oh;

    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    invoke-direct {v6, v3, v2}, Lwb/oh;-><init>(Li0/a1;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v10, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_3
    move-object v9, v6

    .line 115
    check-cast v9, Lfg/l;

    .line 116
    .line 117
    const/16 v11, 0x1b0

    .line 118
    .line 119
    const/16 v12, 0x8

    .line 120
    .line 121
    const-string v6, "\u542f\u7528\u540d\u5355"

    .line 122
    .line 123
    const-string v7, "\u5173\u95ed\u540e\u8be5\u540d\u5355\u4e0d\u53c2\u4e0e\u5c4f\u853d\u6d88\u606f\u5339\u914d"

    .line 124
    .line 125
    const/4 v8, 0x0

    .line 126
    invoke-static/range {v5 .. v12}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v10, v13, v14}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Ljava/lang/String;

    .line 137
    .line 138
    const-string v2, "exclude"

    .line 139
    .line 140
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    invoke-virtual {v10, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    if-nez v1, :cond_4

    .line 153
    .line 154
    if-ne v2, v15, :cond_5

    .line 155
    .line 156
    :cond_4
    new-instance v2, Lwb/oh;

    .line 157
    .line 158
    const/4 v1, 0x1

    .line 159
    invoke-direct {v2, v4, v1}, Lwb/oh;-><init>(Li0/a1;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v10, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_5
    move-object v9, v2

    .line 166
    check-cast v9, Lfg/l;

    .line 167
    .line 168
    const/16 v11, 0x1b0

    .line 169
    .line 170
    const/16 v12, 0x8

    .line 171
    .line 172
    const-string v6, "\u6392\u9664\u540d\u5355"

    .line 173
    .line 174
    const-string v7, "\u5f00\u542f\u540e\u547d\u4e2d\u8be5\u540d\u5355\u65f6\u8df3\u8fc7\u5c4f\u853d\uff1b\u5173\u95ed\u65f6\u6309\u4e0b\u65b9\u6a21\u677f\u5c4f\u853d"

    .line 175
    .line 176
    const/4 v8, 0x0

    .line 177
    invoke-static/range {v5 .. v12}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_6
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 182
    .line 183
    .line 184
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 185
    .line 186
    return-object v1
.end method

.method private final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lc9/q0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lx8/b;

    .line 6
    .line 7
    iget-object v2, v0, Lc9/q0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lfg/l;

    .line 10
    .line 11
    iget-object v3, v0, Lc9/q0;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lfg/l;

    .line 14
    .line 15
    iget-object v4, v0, Lc9/q0;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Lfg/l;

    .line 18
    .line 19
    move-object/from16 v11, p1

    .line 20
    .line 21
    check-cast v11, Li0/h0;

    .line 22
    .line 23
    move-object/from16 v5, p2

    .line 24
    .line 25
    check-cast v5, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    and-int/lit8 v6, v5, 0x3

    .line 32
    .line 33
    const/4 v7, 0x2

    .line 34
    const/4 v13, 0x0

    .line 35
    const/4 v14, 0x1

    .line 36
    if-eq v6, v7, :cond_0

    .line 37
    .line 38
    move v6, v14

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v6, v13

    .line 41
    :goto_0
    and-int/2addr v5, v14

    .line 42
    invoke-virtual {v11, v5, v6}, Li0/h0;->S(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_18

    .line 47
    .line 48
    iget v5, v1, Lx8/b;->g:I

    .line 49
    .line 50
    iget-object v15, v1, Lx8/b;->i:Ljava/util/Set;

    .line 51
    .line 52
    iget-object v6, v1, Lx8/b;->h:Ljava/util/Set;

    .line 53
    .line 54
    invoke-static {v5}, Lwb/ho;->T4(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-static {}, Lwb/ho;->U4()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    iget v8, v1, Lx8/b;->g:I

    .line 63
    .line 64
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    invoke-virtual {v11, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    or-int/2addr v9, v10

    .line 73
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    sget-object v12, Li0/l;->a:Li0/e;

    .line 78
    .line 79
    if-nez v9, :cond_1

    .line 80
    .line 81
    if-ne v10, v12, :cond_2

    .line 82
    .line 83
    :cond_1
    new-instance v10, Lwb/mj;

    .line 84
    .line 85
    const/4 v9, 0x5

    .line 86
    invoke-direct {v10, v9, v2, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    move-object v9, v10

    .line 93
    check-cast v9, Lfg/l;

    .line 94
    .line 95
    const/4 v10, 0x0

    .line 96
    move-object/from16 v16, v12

    .line 97
    .line 98
    const/4 v12, 0x6

    .line 99
    move-object/from16 v17, v6

    .line 100
    .line 101
    move-object v6, v5

    .line 102
    const-string v5, "\u751f\u6548\u8303\u56f4"

    .line 103
    .line 104
    move-object/from16 v18, v16

    .line 105
    .line 106
    invoke-static/range {v5 .. v12}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 107
    .line 108
    .line 109
    iget v5, v1, Lx8/b;->g:I

    .line 110
    .line 111
    const/4 v6, 0x6

    .line 112
    const/4 v7, 0x0

    .line 113
    const/4 v8, 0x3

    .line 114
    if-ne v5, v8, :cond_d

    .line 115
    .line 116
    const v5, 0xadd2d43

    .line 117
    .line 118
    .line 119
    invoke-virtual {v11, v5}, Li0/h0;->a0(I)V

    .line 120
    .line 121
    .line 122
    invoke-static {v7, v11, v13, v14}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 123
    .line 124
    .line 125
    move-object/from16 v5, v17

    .line 126
    .line 127
    check-cast v5, Ljava/lang/Iterable;

    .line 128
    .line 129
    new-instance v8, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    :cond_3
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    if-eqz v10, :cond_4

    .line 143
    .line 144
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    move-object v12, v10

    .line 149
    check-cast v12, Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {v12}, Lwb/ho;->Z5(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    if-nez v12, :cond_3

    .line 156
    .line 157
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    invoke-static {v8}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-static {v8}, Lwb/ho;->O4(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    invoke-virtual {v11, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    invoke-virtual {v11, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    or-int/2addr v9, v10

    .line 178
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    or-int/2addr v9, v10

    .line 183
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    if-nez v9, :cond_5

    .line 188
    .line 189
    move-object/from16 v9, v18

    .line 190
    .line 191
    if-ne v10, v9, :cond_6

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_5
    move-object/from16 v9, v18

    .line 195
    .line 196
    :goto_2
    new-instance v10, Lwb/nj;

    .line 197
    .line 198
    const/4 v12, 0x0

    .line 199
    invoke-direct {v10, v3, v1, v2, v12}, Lwb/nj;-><init>(Lfg/l;Lx8/b;Lfg/l;I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v11, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_6
    check-cast v10, Lfg/a;

    .line 206
    .line 207
    const-string v12, "\u9009\u62e9\u6307\u5b9a\u597d\u53cb"

    .line 208
    .line 209
    invoke-static {v12, v8, v10, v11, v6}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 210
    .line 211
    .line 212
    invoke-static {v7, v11, v13, v14}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 213
    .line 214
    .line 215
    new-instance v8, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    :cond_7
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    if-eqz v10, :cond_8

    .line 229
    .line 230
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    move-object v12, v10

    .line 235
    check-cast v12, Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v12}, Lwb/ho;->Z5(Ljava/lang/String;)Z

    .line 238
    .line 239
    .line 240
    move-result v12

    .line 241
    if-eqz v12, :cond_7

    .line 242
    .line 243
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_8
    invoke-static {v8}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-static {v5}, Lwb/ho;->O4(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    invoke-virtual {v11, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    invoke-virtual {v11, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    or-int/2addr v8, v10

    .line 264
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    or-int/2addr v8, v10

    .line 269
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    if-nez v8, :cond_9

    .line 274
    .line 275
    if-ne v10, v9, :cond_a

    .line 276
    .line 277
    :cond_9
    new-instance v10, Lwb/nj;

    .line 278
    .line 279
    const/4 v8, 0x1

    .line 280
    invoke-direct {v10, v3, v1, v2, v8}, Lwb/nj;-><init>(Lfg/l;Lx8/b;Lfg/l;I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v11, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_a
    check-cast v10, Lfg/a;

    .line 287
    .line 288
    const-string v3, "\u9009\u62e9\u6307\u5b9a\u7fa4\u804a"

    .line 289
    .line 290
    invoke-static {v3, v5, v10, v11, v6}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 291
    .line 292
    .line 293
    invoke-static {v7, v11, v13, v14}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 294
    .line 295
    .line 296
    iget-object v3, v1, Lx8/b;->j:Ljava/util/Set;

    .line 297
    .line 298
    check-cast v3, Ljava/lang/Iterable;

    .line 299
    .line 300
    invoke-static {v3}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-static {v3}, Lwb/ho;->O4(Ljava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-virtual {v11, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    invoke-virtual {v11, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    or-int/2addr v5, v7

    .line 317
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v7

    .line 321
    or-int/2addr v5, v7

    .line 322
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    if-nez v5, :cond_b

    .line 327
    .line 328
    if-ne v7, v9, :cond_c

    .line 329
    .line 330
    :cond_b
    new-instance v7, Lwb/nj;

    .line 331
    .line 332
    const/4 v5, 0x2

    .line 333
    invoke-direct {v7, v4, v1, v2, v5}, Lwb/nj;-><init>(Lfg/l;Lx8/b;Lfg/l;I)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v11, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    :cond_c
    check-cast v7, Lfg/a;

    .line 340
    .line 341
    const-string v1, "\u9009\u62e9\u6307\u5b9a\u7fa4\u6210\u5458"

    .line 342
    .line 343
    invoke-static {v1, v3, v7, v11, v6}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v11, v13}, Li0/h0;->p(Z)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_6

    .line 350
    .line 351
    :cond_d
    move-object/from16 v9, v18

    .line 352
    .line 353
    const v5, 0xafce933

    .line 354
    .line 355
    .line 356
    invoke-virtual {v11, v5}, Li0/h0;->a0(I)V

    .line 357
    .line 358
    .line 359
    invoke-static {v7, v11, v13, v14}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 360
    .line 361
    .line 362
    check-cast v15, Ljava/lang/Iterable;

    .line 363
    .line 364
    new-instance v5, Ljava/util/ArrayList;

    .line 365
    .line 366
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    :cond_e
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v10

    .line 377
    if-eqz v10, :cond_f

    .line 378
    .line 379
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    move-object v12, v10

    .line 384
    check-cast v12, Ljava/lang/String;

    .line 385
    .line 386
    invoke-static {v12}, Lwb/ho;->Z5(Ljava/lang/String;)Z

    .line 387
    .line 388
    .line 389
    move-result v12

    .line 390
    if-nez v12, :cond_e

    .line 391
    .line 392
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    goto :goto_4

    .line 396
    :cond_f
    invoke-static {v5}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    invoke-static {v5}, Lwb/ho;->O4(Ljava/lang/String;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    invoke-virtual {v11, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v8

    .line 408
    invoke-virtual {v11, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v10

    .line 412
    or-int/2addr v8, v10

    .line 413
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v10

    .line 417
    or-int/2addr v8, v10

    .line 418
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v10

    .line 422
    if-nez v8, :cond_10

    .line 423
    .line 424
    if-ne v10, v9, :cond_11

    .line 425
    .line 426
    :cond_10
    new-instance v10, Lwb/nj;

    .line 427
    .line 428
    const/4 v8, 0x3

    .line 429
    invoke-direct {v10, v3, v1, v2, v8}, Lwb/nj;-><init>(Lfg/l;Lx8/b;Lfg/l;I)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v11, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    :cond_11
    check-cast v10, Lfg/a;

    .line 436
    .line 437
    const-string v8, "\u9009\u62e9\u6392\u9664\u597d\u53cb"

    .line 438
    .line 439
    invoke-static {v8, v5, v10, v11, v6}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 440
    .line 441
    .line 442
    invoke-static {v7, v11, v13, v14}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 443
    .line 444
    .line 445
    new-instance v5, Ljava/util/ArrayList;

    .line 446
    .line 447
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 448
    .line 449
    .line 450
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v8

    .line 454
    :cond_12
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v10

    .line 458
    if-eqz v10, :cond_13

    .line 459
    .line 460
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v10

    .line 464
    move-object v12, v10

    .line 465
    check-cast v12, Ljava/lang/String;

    .line 466
    .line 467
    invoke-static {v12}, Lwb/ho;->Z5(Ljava/lang/String;)Z

    .line 468
    .line 469
    .line 470
    move-result v12

    .line 471
    if-eqz v12, :cond_12

    .line 472
    .line 473
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    goto :goto_5

    .line 477
    :cond_13
    invoke-static {v5}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v5

    .line 481
    invoke-static {v5}, Lwb/ho;->O4(Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v5

    .line 485
    invoke-virtual {v11, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v8

    .line 489
    invoke-virtual {v11, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v10

    .line 493
    or-int/2addr v8, v10

    .line 494
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v10

    .line 498
    or-int/2addr v8, v10

    .line 499
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v10

    .line 503
    if-nez v8, :cond_14

    .line 504
    .line 505
    if-ne v10, v9, :cond_15

    .line 506
    .line 507
    :cond_14
    new-instance v10, Lwb/nj;

    .line 508
    .line 509
    const/4 v8, 0x4

    .line 510
    invoke-direct {v10, v3, v1, v2, v8}, Lwb/nj;-><init>(Lfg/l;Lx8/b;Lfg/l;I)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v11, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    :cond_15
    check-cast v10, Lfg/a;

    .line 517
    .line 518
    const-string v3, "\u9009\u62e9\u6392\u9664\u7fa4\u804a"

    .line 519
    .line 520
    invoke-static {v3, v5, v10, v11, v6}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 521
    .line 522
    .line 523
    invoke-static {v7, v11, v13, v14}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 524
    .line 525
    .line 526
    iget-object v3, v1, Lx8/b;->k:Ljava/util/Set;

    .line 527
    .line 528
    check-cast v3, Ljava/lang/Iterable;

    .line 529
    .line 530
    invoke-static {v3}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    invoke-static {v3}, Lwb/ho;->O4(Ljava/lang/String;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    invoke-virtual {v11, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    invoke-virtual {v11, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v7

    .line 546
    or-int/2addr v5, v7

    .line 547
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v7

    .line 551
    or-int/2addr v5, v7

    .line 552
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v7

    .line 556
    if-nez v5, :cond_16

    .line 557
    .line 558
    if-ne v7, v9, :cond_17

    .line 559
    .line 560
    :cond_16
    new-instance v7, Lwb/nj;

    .line 561
    .line 562
    const/4 v5, 0x5

    .line 563
    invoke-direct {v7, v4, v1, v2, v5}, Lwb/nj;-><init>(Lfg/l;Lx8/b;Lfg/l;I)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v11, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    :cond_17
    check-cast v7, Lfg/a;

    .line 570
    .line 571
    const-string v1, "\u9009\u62e9\u6392\u9664\u7fa4\u6210\u5458"

    .line 572
    .line 573
    invoke-static {v1, v3, v7, v11, v6}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v11, v13}, Li0/h0;->p(Z)V

    .line 577
    .line 578
    .line 579
    goto :goto_6

    .line 580
    :cond_18
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 581
    .line 582
    .line 583
    :goto_6
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 584
    .line 585
    return-object v1
.end method

.method private final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lc9/q0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfg/p;

    .line 4
    .line 5
    iget-object v1, p0, Lc9/q0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iget-object v2, p0, Lc9/q0;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Li0/a1;

    .line 12
    .line 13
    iget-object v3, p0, Lc9/q0;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Li0/a1;

    .line 16
    .line 17
    check-cast p1, Lvb/a;

    .line 18
    .line 19
    check-cast p2, Lwb/c3;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2, v3}, Lwb/ho;->H3(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object p1
.end method

.method private final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc9/q0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Ljava/lang/String;

    .line 5
    .line 6
    iget-object v0, p0, Lc9/q0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lc9/q0;->h:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lfg/a;

    .line 15
    .line 16
    iget-object v0, p0, Lc9/q0;->k:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Lfg/p;

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    check-cast v5, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/16 p1, 0x181

    .line 30
    .line 31
    invoke-static {p1}, Li0/r;->C(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-static/range {v1 .. v6}, Lwb/ho;->t0(Ljava/lang/String;Ljava/lang/String;Lfg/a;Lfg/p;Li0/h0;I)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    return-object p1
.end method

.method private final i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc9/q0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v5, v0

    .line 4
    check-cast v5, Ljava/lang/String;

    .line 5
    .line 6
    iget-object v0, p0, Lc9/q0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v6, v0

    .line 9
    check-cast v6, Ljava/util/List;

    .line 10
    .line 11
    iget-object v0, p0, Lc9/q0;->h:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Lfg/a;

    .line 15
    .line 16
    iget-object v0, p0, Lc9/q0;->k:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Lfg/l;

    .line 20
    .line 21
    move-object v4, p1

    .line 22
    check-cast v4, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/16 p1, 0x181

    .line 30
    .line 31
    invoke-static {p1}, Li0/r;->C(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static/range {v1 .. v6}, Lwb/ho;->G(ILfg/a;Lfg/l;Li0/h0;Ljava/lang/String;Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    return-object p1
.end method

.method private final j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc9/q0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lx9/f;

    .line 5
    .line 6
    iget-object v0, p0, Lc9/q0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Lfg/a;

    .line 10
    .line 11
    iget-object v0, p0, Lc9/q0;->h:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lfg/l;

    .line 15
    .line 16
    iget-object v0, p0, Lc9/q0;->k:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Lfg/a;

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    check-cast v5, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/16 p1, 0x31

    .line 30
    .line 31
    invoke-static {p1}, Li0/r;->C(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-static/range {v1 .. v6}, Lwb/ho;->F1(Lx9/f;Lfg/a;Lfg/l;Lfg/a;Li0/h0;I)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    return-object p1
.end method

.method private final k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lc9/q0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwb/d4;

    .line 4
    .line 5
    iget-object v1, p0, Lc9/q0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Li0/a1;

    .line 8
    .line 9
    iget-object v2, p0, Lc9/q0;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Li0/a1;

    .line 12
    .line 13
    iget-object v3, p0, Lc9/q0;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Li0/a1;

    .line 16
    .line 17
    check-cast p1, Ljava/util/List;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Throwable;

    .line 20
    .line 21
    sget-object v4, Lwb/ho;->a:Log/k;

    .line 22
    .line 23
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-interface {v1, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p1, "\u8bfb\u53d6\u7fa4\u804a\u5931\u8d25"

    .line 38
    .line 39
    :goto_0
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    iget-object p2, v0, Lwb/d4;->d:Ljava/util/Set;

    .line 44
    .line 45
    if-eqz p2, :cond_4

    .line 46
    .line 47
    check-cast p2, Ljava/util/Set;

    .line 48
    .line 49
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v2, v1

    .line 69
    check-cast v2, Lwb/s0;

    .line 70
    .line 71
    iget-object v2, v2, Lwb/s0;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    move-object p1, v0

    .line 84
    :cond_4
    invoke-interface {v3, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 88
    .line 89
    return-object p1
.end method

.method private final l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lc9/q0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v5, v1

    .line 6
    check-cast v5, Li0/a1;

    .line 7
    .line 8
    iget-object v1, v0, Lc9/q0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, Lfg/l;

    .line 12
    .line 13
    iget-object v1, v0, Lc9/q0;->h:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, Lfg/l;

    .line 17
    .line 18
    iget-object v1, v0, Lc9/q0;->k:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v6, v1

    .line 21
    check-cast v6, Li0/a1;

    .line 22
    .line 23
    move-object/from16 v12, p1

    .line 24
    .line 25
    check-cast v12, Li0/h0;

    .line 26
    .line 27
    move-object/from16 v1, p2

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    and-int/lit8 v2, v1, 0x3

    .line 36
    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v15, 0x1

    .line 40
    if-eq v2, v7, :cond_0

    .line 41
    .line 42
    move v2, v15

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v2, v8

    .line 45
    :goto_0
    and-int/2addr v1, v15

    .line 46
    invoke-virtual {v12, v1, v2}, Li0/h0;->S(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_a

    .line 51
    .line 52
    sget-object v1, Lp/j;->c:Lp/e;

    .line 53
    .line 54
    sget-object v2, Ly0/b;->s:Ly0/e;

    .line 55
    .line 56
    invoke-static {v1, v2, v12, v8}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-wide v7, v12, Li0/h0;->T:J

    .line 61
    .line 62
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v12}, Li0/h0;->l()Ls0/h;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    sget-object v8, Ly0/l;->a:Ly0/l;

    .line 71
    .line 72
    invoke-static {v12, v8}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    sget-object v10, Lx1/g;->f:Lx1/f;

    .line 77
    .line 78
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v10, Lx1/f;->b:Lx1/y;

    .line 82
    .line 83
    invoke-virtual {v12}, Li0/h0;->d0()V

    .line 84
    .line 85
    .line 86
    iget-boolean v11, v12, Li0/h0;->S:Z

    .line 87
    .line 88
    if-eqz v11, :cond_1

    .line 89
    .line 90
    invoke-virtual {v12, v10}, Li0/h0;->k(Lfg/a;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-virtual {v12}, Li0/h0;->n0()V

    .line 95
    .line 96
    .line 97
    :goto_1
    sget-object v11, Lx1/f;->e:Lx1/e;

    .line 98
    .line 99
    invoke-static {v11, v12, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 103
    .line 104
    invoke-static {v1, v12, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    sget-object v7, Lx1/f;->f:Lx1/e;

    .line 112
    .line 113
    invoke-static {v7, v12, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    sget-object v2, Lx1/f;->g:Lx1/d;

    .line 117
    .line 118
    invoke-static {v2, v12}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 119
    .line 120
    .line 121
    sget-object v13, Lx1/f;->c:Lx1/e;

    .line 122
    .line 123
    invoke-static {v13, v12, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    check-cast v9, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v12, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v15

    .line 140
    move-object/from16 p2, v10

    .line 141
    .line 142
    sget-object v10, Li0/l;->a:Li0/e;

    .line 143
    .line 144
    if-nez v14, :cond_2

    .line 145
    .line 146
    if-ne v15, v10, :cond_3

    .line 147
    .line 148
    :cond_2
    new-instance v15, Lwb/lp;

    .line 149
    .line 150
    const/16 v14, 0x11

    .line 151
    .line 152
    invoke-direct {v15, v5, v14}, Lwb/lp;-><init>(Li0/a1;I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_3
    check-cast v15, Lfg/l;

    .line 159
    .line 160
    move-object v14, v13

    .line 161
    const/16 v13, 0x36

    .line 162
    .line 163
    move-object/from16 v16, v14

    .line 164
    .line 165
    const/16 v14, 0x8

    .line 166
    .line 167
    move-object/from16 v17, v7

    .line 168
    .line 169
    const-string v7, "\u914d\u7f6e\u540d\u79f0"

    .line 170
    .line 171
    move-object/from16 v18, v8

    .line 172
    .line 173
    const-string v8, "\u7528\u4e8e\u533a\u5206\u4e0d\u540c\u670d\u52a1\u548c\u6a21\u578b"

    .line 174
    .line 175
    move-object/from16 v19, v10

    .line 176
    .line 177
    const/4 v10, 0x0

    .line 178
    move-object/from16 v20, v3

    .line 179
    .line 180
    move-object/from16 v21, v5

    .line 181
    .line 182
    move-object/from16 v22, v6

    .line 183
    .line 184
    move-object v0, v11

    .line 185
    move-object v11, v15

    .line 186
    move-object/from16 v3, v16

    .line 187
    .line 188
    move-object/from16 v6, v18

    .line 189
    .line 190
    move-object/from16 v5, v19

    .line 191
    .line 192
    move-object/from16 v15, p2

    .line 193
    .line 194
    move-object/from16 v19, v4

    .line 195
    .line 196
    move-object/from16 v4, v17

    .line 197
    .line 198
    invoke-static/range {v7 .. v14}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 199
    .line 200
    .line 201
    const/high16 v7, 0x3f800000    # 1.0f

    .line 202
    .line 203
    invoke-static {v6, v7}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 204
    .line 205
    .line 206
    move-result-object v23

    .line 207
    const/16 v6, 0x8

    .line 208
    .line 209
    int-to-float v6, v6

    .line 210
    const/16 v27, 0x0

    .line 211
    .line 212
    const/16 v28, 0xd

    .line 213
    .line 214
    const/16 v24, 0x0

    .line 215
    .line 216
    const/16 v26, 0x0

    .line 217
    .line 218
    move/from16 v25, v6

    .line 219
    .line 220
    invoke-static/range {v23 .. v28}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    const/16 v8, 0xa

    .line 225
    .line 226
    int-to-float v8, v8

    .line 227
    invoke-static {v8}, Lp/j;->g(F)Lp/h;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    sget-object v9, Ly0/b;->p:Ly0/f;

    .line 232
    .line 233
    const/4 v10, 0x6

    .line 234
    invoke-static {v8, v9, v12, v10}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    iget-wide v9, v12, Li0/h0;->T:J

    .line 239
    .line 240
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    invoke-virtual {v12}, Li0/h0;->l()Ls0/h;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    invoke-static {v12, v6}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    invoke-virtual {v12}, Li0/h0;->d0()V

    .line 253
    .line 254
    .line 255
    iget-boolean v11, v12, Li0/h0;->S:Z

    .line 256
    .line 257
    if-eqz v11, :cond_4

    .line 258
    .line 259
    invoke-virtual {v12, v15}, Li0/h0;->k(Lfg/a;)V

    .line 260
    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_4
    invoke-virtual {v12}, Li0/h0;->n0()V

    .line 264
    .line 265
    .line 266
    :goto_2
    invoke-static {v0, v12, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-static {v1, v12, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v9, v12, v4, v12, v2}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v3, v12, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    if-ne v0, v5, :cond_5

    .line 283
    .line 284
    new-instance v0, Lwb/jp;

    .line 285
    .line 286
    const/16 v1, 0x1c

    .line 287
    .line 288
    move-object/from16 v6, v22

    .line 289
    .line 290
    invoke-direct {v0, v6, v1}, Lwb/jp;-><init>(Li0/a1;I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_5
    move-object/from16 v6, v22

    .line 298
    .line 299
    :goto_3
    move-object v8, v0

    .line 300
    check-cast v8, Lfg/a;

    .line 301
    .line 302
    float-to-double v0, v7

    .line 303
    const-wide/16 v22, 0x0

    .line 304
    .line 305
    cmpl-double v0, v0, v22

    .line 306
    .line 307
    const-string v1, "invalid weight; must be greater than zero"

    .line 308
    .line 309
    if-lez v0, :cond_6

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_6
    invoke-static {v1}, Lq/a;->a(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    :goto_4
    new-instance v9, Lp/q0;

    .line 316
    .line 317
    const/4 v0, 0x1

    .line 318
    invoke-direct {v9, v7, v0}, Lp/q0;-><init>(FZ)V

    .line 319
    .line 320
    .line 321
    invoke-static {v12}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 322
    .line 323
    .line 324
    move-result-object v14

    .line 325
    const/16 v17, 0x36

    .line 326
    .line 327
    const/16 v18, 0x778

    .line 328
    .line 329
    move v2, v7

    .line 330
    const-string v7, "\u53d6\u6d88"

    .line 331
    .line 332
    const/4 v10, 0x0

    .line 333
    const/4 v11, 0x0

    .line 334
    move-object/from16 v16, v12

    .line 335
    .line 336
    const/4 v12, 0x0

    .line 337
    const/4 v13, 0x0

    .line 338
    const/4 v15, 0x0

    .line 339
    move/from16 v29, v2

    .line 340
    .line 341
    move v2, v0

    .line 342
    move/from16 v0, v29

    .line 343
    .line 344
    invoke-static/range {v7 .. v18}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 345
    .line 346
    .line 347
    move-object/from16 v12, v16

    .line 348
    .line 349
    move-object/from16 v3, v21

    .line 350
    .line 351
    invoke-virtual {v12, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    move-object/from16 v7, v20

    .line 356
    .line 357
    invoke-virtual {v12, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v8

    .line 361
    or-int/2addr v4, v8

    .line 362
    move-object/from16 v8, v19

    .line 363
    .line 364
    invoke-virtual {v12, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v9

    .line 368
    or-int/2addr v4, v9

    .line 369
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v9

    .line 373
    if-nez v4, :cond_7

    .line 374
    .line 375
    if-ne v9, v5, :cond_8

    .line 376
    .line 377
    :cond_7
    move v4, v2

    .line 378
    goto :goto_5

    .line 379
    :cond_8
    move v8, v2

    .line 380
    goto :goto_6

    .line 381
    :goto_5
    new-instance v2, Lc9/n0;

    .line 382
    .line 383
    move-object/from16 v20, v7

    .line 384
    .line 385
    const/16 v7, 0x1a

    .line 386
    .line 387
    move-object v5, v8

    .line 388
    move v8, v4

    .line 389
    move-object v4, v5

    .line 390
    move-object v5, v3

    .line 391
    move-object/from16 v3, v20

    .line 392
    .line 393
    invoke-direct/range {v2 .. v7}, Lc9/n0;-><init>(Lfg/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    move-object v9, v2

    .line 400
    :goto_6
    check-cast v9, Lfg/a;

    .line 401
    .line 402
    float-to-double v2, v0

    .line 403
    cmpl-double v2, v2, v22

    .line 404
    .line 405
    if-lez v2, :cond_9

    .line 406
    .line 407
    :goto_7
    move-object v1, v9

    .line 408
    goto :goto_8

    .line 409
    :cond_9
    invoke-static {v1}, Lq/a;->a(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    goto :goto_7

    .line 413
    :goto_8
    new-instance v9, Lp/q0;

    .line 414
    .line 415
    invoke-direct {v9, v0, v8}, Lp/q0;-><init>(FZ)V

    .line 416
    .line 417
    .line 418
    invoke-static {v12}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 419
    .line 420
    .line 421
    move-result-object v14

    .line 422
    const/16 v17, 0x6

    .line 423
    .line 424
    const/16 v18, 0x778

    .line 425
    .line 426
    const-string v7, "\u786e\u8ba4"

    .line 427
    .line 428
    const/4 v10, 0x0

    .line 429
    const/4 v11, 0x0

    .line 430
    move-object/from16 v16, v12

    .line 431
    .line 432
    const/4 v12, 0x0

    .line 433
    const/4 v13, 0x0

    .line 434
    const/4 v15, 0x0

    .line 435
    move v0, v8

    .line 436
    move-object v8, v1

    .line 437
    invoke-static/range {v7 .. v18}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 438
    .line 439
    .line 440
    move-object/from16 v12, v16

    .line 441
    .line 442
    invoke-virtual {v12, v0}, Li0/h0;->p(Z)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0}, Li0/h0;->p(Z)V

    .line 446
    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_a
    invoke-virtual {v12}, Li0/h0;->V()V

    .line 450
    .line 451
    .line 452
    :goto_9
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 453
    .line 454
    return-object v0
.end method

.method private final m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lc9/q0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v5, v1

    .line 6
    check-cast v5, Li0/a1;

    .line 7
    .line 8
    iget-object v1, v0, Lc9/q0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, Lfg/p;

    .line 12
    .line 13
    iget-object v1, v0, Lc9/q0;->h:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, Lfb/d1;

    .line 17
    .line 18
    iget-object v1, v0, Lc9/q0;->k:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v6, v1

    .line 21
    check-cast v6, Li0/a1;

    .line 22
    .line 23
    move-object/from16 v12, p1

    .line 24
    .line 25
    check-cast v12, Li0/h0;

    .line 26
    .line 27
    move-object/from16 v1, p2

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    and-int/lit8 v2, v1, 0x3

    .line 36
    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v15, 0x1

    .line 40
    if-eq v2, v7, :cond_0

    .line 41
    .line 42
    move v2, v15

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v2, v8

    .line 45
    :goto_0
    and-int/2addr v1, v15

    .line 46
    invoke-virtual {v12, v1, v2}, Li0/h0;->S(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_9

    .line 51
    .line 52
    sget-object v1, Lp/j;->c:Lp/e;

    .line 53
    .line 54
    sget-object v2, Ly0/b;->s:Ly0/e;

    .line 55
    .line 56
    invoke-static {v1, v2, v12, v8}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-wide v7, v12, Li0/h0;->T:J

    .line 61
    .line 62
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v12}, Li0/h0;->l()Ls0/h;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    sget-object v8, Ly0/l;->a:Ly0/l;

    .line 71
    .line 72
    invoke-static {v12, v8}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    sget-object v10, Lx1/g;->f:Lx1/f;

    .line 77
    .line 78
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v10, Lx1/f;->b:Lx1/y;

    .line 82
    .line 83
    invoke-virtual {v12}, Li0/h0;->d0()V

    .line 84
    .line 85
    .line 86
    iget-boolean v11, v12, Li0/h0;->S:Z

    .line 87
    .line 88
    if-eqz v11, :cond_1

    .line 89
    .line 90
    invoke-virtual {v12, v10}, Li0/h0;->k(Lfg/a;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-virtual {v12}, Li0/h0;->n0()V

    .line 95
    .line 96
    .line 97
    :goto_1
    sget-object v11, Lx1/f;->e:Lx1/e;

    .line 98
    .line 99
    invoke-static {v11, v12, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 103
    .line 104
    invoke-static {v1, v12, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    sget-object v7, Lx1/f;->f:Lx1/e;

    .line 112
    .line 113
    invoke-static {v7, v12, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    sget-object v2, Lx1/f;->g:Lx1/d;

    .line 117
    .line 118
    invoke-static {v2, v12}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 119
    .line 120
    .line 121
    sget-object v13, Lx1/f;->c:Lx1/e;

    .line 122
    .line 123
    invoke-static {v13, v12, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    check-cast v9, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v14

    .line 136
    sget-object v15, Li0/l;->a:Li0/e;

    .line 137
    .line 138
    if-ne v14, v15, :cond_2

    .line 139
    .line 140
    new-instance v14, Lwb/lp;

    .line 141
    .line 142
    const/4 v0, 0x2

    .line 143
    invoke-direct {v14, v5, v0}, Lwb/lp;-><init>(Li0/a1;I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_2
    check-cast v14, Lfg/l;

    .line 150
    .line 151
    move-object v0, v13

    .line 152
    const/16 v13, 0x6036

    .line 153
    .line 154
    move-object/from16 v16, v11

    .line 155
    .line 156
    move-object v11, v14

    .line 157
    const/16 v14, 0x8

    .line 158
    .line 159
    move-object/from16 v17, v7

    .line 160
    .line 161
    const-string v7, "\u5bf9\u8bdd\u6807\u9898"

    .line 162
    .line 163
    move-object/from16 v18, v8

    .line 164
    .line 165
    const-string v8, "\u6700\u591a 32 \u4e2a\u5b57\u7b26"

    .line 166
    .line 167
    move-object/from16 v19, v10

    .line 168
    .line 169
    const/4 v10, 0x0

    .line 170
    move-object/from16 v21, v3

    .line 171
    .line 172
    move-object/from16 v20, v4

    .line 173
    .line 174
    move-object/from16 v22, v6

    .line 175
    .line 176
    move-object/from16 v4, v17

    .line 177
    .line 178
    move-object/from16 v6, v18

    .line 179
    .line 180
    move-object v3, v0

    .line 181
    move-object/from16 v0, v19

    .line 182
    .line 183
    move-object/from16 v19, v5

    .line 184
    .line 185
    move-object/from16 v5, v16

    .line 186
    .line 187
    invoke-static/range {v7 .. v14}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 188
    .line 189
    .line 190
    const/high16 v7, 0x3f800000    # 1.0f

    .line 191
    .line 192
    invoke-static {v6, v7}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 193
    .line 194
    .line 195
    move-result-object v23

    .line 196
    const/16 v6, 0x8

    .line 197
    .line 198
    int-to-float v6, v6

    .line 199
    const/16 v27, 0x0

    .line 200
    .line 201
    const/16 v28, 0xd

    .line 202
    .line 203
    const/16 v24, 0x0

    .line 204
    .line 205
    const/16 v26, 0x0

    .line 206
    .line 207
    move/from16 v25, v6

    .line 208
    .line 209
    invoke-static/range {v23 .. v28}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    const/16 v8, 0xa

    .line 214
    .line 215
    int-to-float v8, v8

    .line 216
    invoke-static {v8}, Lp/j;->g(F)Lp/h;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    sget-object v9, Ly0/b;->p:Ly0/f;

    .line 221
    .line 222
    const/4 v10, 0x6

    .line 223
    invoke-static {v8, v9, v12, v10}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    iget-wide v9, v12, Li0/h0;->T:J

    .line 228
    .line 229
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 230
    .line 231
    .line 232
    move-result v9

    .line 233
    invoke-virtual {v12}, Li0/h0;->l()Ls0/h;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    invoke-static {v12, v6}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-virtual {v12}, Li0/h0;->d0()V

    .line 242
    .line 243
    .line 244
    iget-boolean v11, v12, Li0/h0;->S:Z

    .line 245
    .line 246
    if-eqz v11, :cond_3

    .line 247
    .line 248
    invoke-virtual {v12, v0}, Li0/h0;->k(Lfg/a;)V

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_3
    invoke-virtual {v12}, Li0/h0;->n0()V

    .line 253
    .line 254
    .line 255
    :goto_2
    invoke-static {v5, v12, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v1, v12, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-static {v9, v12, v4, v12, v2}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v3, v12, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    if-ne v0, v15, :cond_4

    .line 272
    .line 273
    new-instance v0, Lwb/jp;

    .line 274
    .line 275
    const/4 v1, 0x5

    .line 276
    move-object/from16 v6, v22

    .line 277
    .line 278
    invoke-direct {v0, v6, v1}, Lwb/jp;-><init>(Li0/a1;I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_4
    move-object/from16 v6, v22

    .line 286
    .line 287
    :goto_3
    move-object v8, v0

    .line 288
    check-cast v8, Lfg/a;

    .line 289
    .line 290
    float-to-double v0, v7

    .line 291
    const-wide/16 v22, 0x0

    .line 292
    .line 293
    cmpl-double v0, v0, v22

    .line 294
    .line 295
    const-string v1, "invalid weight; must be greater than zero"

    .line 296
    .line 297
    if-lez v0, :cond_5

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_5
    invoke-static {v1}, Lq/a;->a(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    :goto_4
    new-instance v9, Lp/q0;

    .line 304
    .line 305
    const/4 v0, 0x1

    .line 306
    invoke-direct {v9, v7, v0}, Lp/q0;-><init>(FZ)V

    .line 307
    .line 308
    .line 309
    invoke-static {v12}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 310
    .line 311
    .line 312
    move-result-object v14

    .line 313
    const/16 v17, 0x36

    .line 314
    .line 315
    const/16 v18, 0x778

    .line 316
    .line 317
    move v2, v7

    .line 318
    const-string v7, "\u53d6\u6d88"

    .line 319
    .line 320
    const/4 v10, 0x0

    .line 321
    const/4 v11, 0x0

    .line 322
    move-object/from16 v16, v12

    .line 323
    .line 324
    const/4 v12, 0x0

    .line 325
    const/4 v13, 0x0

    .line 326
    move-object v3, v15

    .line 327
    const/4 v15, 0x0

    .line 328
    move/from16 v29, v2

    .line 329
    .line 330
    move v2, v0

    .line 331
    move/from16 v0, v29

    .line 332
    .line 333
    invoke-static/range {v7 .. v18}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 334
    .line 335
    .line 336
    move-object/from16 v12, v16

    .line 337
    .line 338
    move-object/from16 v4, v21

    .line 339
    .line 340
    invoke-virtual {v12, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    move-object/from16 v7, v20

    .line 345
    .line 346
    invoke-virtual {v12, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v8

    .line 350
    or-int/2addr v5, v8

    .line 351
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v8

    .line 355
    if-nez v5, :cond_6

    .line 356
    .line 357
    if-ne v8, v3, :cond_7

    .line 358
    .line 359
    :cond_6
    move v3, v2

    .line 360
    goto :goto_5

    .line 361
    :cond_7
    move-object/from16 v29, v8

    .line 362
    .line 363
    move v8, v2

    .line 364
    move-object/from16 v2, v29

    .line 365
    .line 366
    goto :goto_6

    .line 367
    :goto_5
    new-instance v2, Lc9/n0;

    .line 368
    .line 369
    move-object/from16 v20, v7

    .line 370
    .line 371
    const/16 v7, 0x17

    .line 372
    .line 373
    move v8, v3

    .line 374
    move-object v3, v4

    .line 375
    move-object/from16 v5, v19

    .line 376
    .line 377
    move-object/from16 v4, v20

    .line 378
    .line 379
    invoke-direct/range {v2 .. v7}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    :goto_6
    check-cast v2, Lfg/a;

    .line 386
    .line 387
    float-to-double v3, v0

    .line 388
    cmpl-double v3, v3, v22

    .line 389
    .line 390
    if-lez v3, :cond_8

    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_8
    invoke-static {v1}, Lq/a;->a(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    :goto_7
    new-instance v9, Lp/q0;

    .line 397
    .line 398
    invoke-direct {v9, v0, v8}, Lp/q0;-><init>(FZ)V

    .line 399
    .line 400
    .line 401
    invoke-static {v12}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 402
    .line 403
    .line 404
    move-result-object v14

    .line 405
    const/16 v17, 0x6

    .line 406
    .line 407
    const/16 v18, 0x778

    .line 408
    .line 409
    const-string v7, "\u4fdd\u5b58"

    .line 410
    .line 411
    const/4 v10, 0x0

    .line 412
    const/4 v11, 0x0

    .line 413
    move-object/from16 v16, v12

    .line 414
    .line 415
    const/4 v12, 0x0

    .line 416
    const/4 v13, 0x0

    .line 417
    const/4 v15, 0x0

    .line 418
    move v0, v8

    .line 419
    move-object v8, v2

    .line 420
    invoke-static/range {v7 .. v18}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 421
    .line 422
    .line 423
    move-object/from16 v12, v16

    .line 424
    .line 425
    invoke-virtual {v12, v0}, Li0/h0;->p(Z)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v0}, Li0/h0;->p(Z)V

    .line 429
    .line 430
    .line 431
    goto :goto_8

    .line 432
    :cond_9
    invoke-virtual {v12}, Li0/h0;->V()V

    .line 433
    .line 434
    .line 435
    :goto_8
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 436
    .line 437
    return-object v0
.end method

.method private final n(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc9/q0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lwb/y2;

    .line 5
    .line 6
    iget-object v0, p0, Lc9/q0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Lfb/q1;

    .line 10
    .line 11
    iget-object v0, p0, Lc9/q0;->h:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lfg/l;

    .line 15
    .line 16
    iget-object v0, p0, Lc9/q0;->k:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Lfg/a;

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    check-cast v5, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/16 p1, 0xc01

    .line 30
    .line 31
    invoke-static {p1}, Li0/r;->C(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual/range {v1 .. v6}, Lwb/y2;->o0(Lfb/q1;Lfg/l;Lfg/a;Li0/h0;I)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    return-object p1
.end method

.method private final o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc9/q0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lwb/y2;

    .line 5
    .line 6
    iget-object v0, p0, Lc9/q0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Landroid/content/Context;

    .line 10
    .line 11
    iget-object v0, p0, Lc9/q0;->h:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lwb/k6;

    .line 15
    .line 16
    iget-object v0, p0, Lc9/q0;->k:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Lia/n;

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    check-cast v5, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/16 p1, 0xc01

    .line 30
    .line 31
    invoke-static {p1}, Li0/r;->C(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual/range {v1 .. v6}, Lwb/y2;->u0(Landroid/content/Context;Lwb/k6;Lia/n;Li0/h0;I)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    return-object p1
.end method

.method private final p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lc9/q0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu2/c;

    .line 4
    .line 5
    iget-object v1, p0, Lc9/q0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Li0/a1;

    .line 8
    .line 9
    iget-object v2, p0, Lc9/q0;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Li0/a1;

    .line 12
    .line 13
    iget-object v3, p0, Lc9/q0;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Li0/a1;

    .line 16
    .line 17
    check-cast p1, Ls1/t;

    .line 18
    .line 19
    check-cast p2, Le1/b;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ls1/t;->a()V

    .line 25
    .line 26
    .line 27
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget-wide v4, p2, Le1/b;->a:J

    .line 38
    .line 39
    const-wide v6, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v4, v6

    .line 45
    long-to-int p2, v4

    .line 46
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    add-float/2addr p2, p1

    .line 51
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    const/4 v2, 0x0

    .line 73
    cmpl-float p1, p1, v2

    .line 74
    .line 75
    if-lez p1, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    const/4 p2, 0x0

    .line 79
    :goto_0
    if-eqz p2, :cond_1

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    const/16 p1, 0x38

    .line 87
    .line 88
    int-to-float p1, p1

    .line 89
    invoke-interface {v0, p1}, Lu2/c;->x0(F)F

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    :goto_1
    const/4 p2, 0x6

    .line 94
    int-to-float p2, p2

    .line 95
    invoke-interface {v0, p2}, Lu2/c;->x0(F)F

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    add-float/2addr p2, p1

    .line 100
    :goto_2
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Ljava/lang/Number;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    neg-float v0, p2

    .line 111
    const/high16 v2, 0x3f000000    # 0.5f

    .line 112
    .line 113
    mul-float v4, v0, v2

    .line 114
    .line 115
    cmpg-float p1, p1, v4

    .line 116
    .line 117
    const v4, 0x3ee66666    # 0.45f

    .line 118
    .line 119
    .line 120
    if-gtz p1, :cond_3

    .line 121
    .line 122
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Lfg/l;

    .line 127
    .line 128
    const/4 v5, -0x1

    .line 129
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-interface {p1, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_2

    .line 144
    .line 145
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, Ljava/lang/Number;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    add-float/2addr p1, p2

    .line 156
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_2
    mul-float/2addr v0, v4

    .line 165
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_3
    :goto_3
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    check-cast p1, Ljava/lang/Number;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    mul-float v0, p2, v2

    .line 183
    .line 184
    cmpl-float p1, p1, v0

    .line 185
    .line 186
    if-ltz p1, :cond_5

    .line 187
    .line 188
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Lfg/l;

    .line 193
    .line 194
    const/4 v0, 0x1

    .line 195
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    check-cast p1, Ljava/lang/Boolean;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_4

    .line 210
    .line 211
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    check-cast p1, Ljava/lang/Number;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    sub-float/2addr p1, p2

    .line 222
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_4
    mul-float/2addr p2, v4

    .line 231
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 239
    .line 240
    return-object p1
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lc9/q0;->g:I

    .line 4
    .line 5
    sget-object v6, Ly0/l;->a:Ly0/l;

    .line 6
    .line 7
    const-string v7, "\u5df2\u9009\u62e9 "

    .line 8
    .line 9
    const/16 v10, 0x30

    .line 10
    .line 11
    const/4 v12, 0x6

    .line 12
    sget-object v13, Li0/l;->a:Li0/e;

    .line 13
    .line 14
    sget-object v14, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    const/4 v15, 0x0

    .line 17
    const/16 v16, 0x181

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    const/16 v17, 0x0

    .line 21
    .line 22
    iget-object v9, v0, Lc9/q0;->k:Ljava/lang/Object;

    .line 23
    .line 24
    const/16 v18, 0xd

    .line 25
    .line 26
    iget-object v8, v0, Lc9/q0;->h:Ljava/lang/Object;

    .line 27
    .line 28
    const/16 v19, 0xe

    .line 29
    .line 30
    iget-object v5, v0, Lc9/q0;->j:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v3, v0, Lc9/q0;->i:Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    packed-switch v1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    check-cast v3, Lc9/a1;

    .line 39
    .line 40
    check-cast v5, Landroid/app/Activity;

    .line 41
    .line 42
    check-cast v8, Ls0/d;

    .line 43
    .line 44
    check-cast v9, Lwb/n7;

    .line 45
    .line 46
    move-object/from16 v1, p1

    .line 47
    .line 48
    check-cast v1, Li0/h0;

    .line 49
    .line 50
    move-object/from16 v6, p2

    .line 51
    .line 52
    check-cast v6, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    and-int/lit8 v7, v6, 0x3

    .line 59
    .line 60
    if-eq v7, v2, :cond_0

    .line 61
    .line 62
    move v15, v4

    .line 63
    :cond_0
    and-int/lit8 v2, v6, 0x1

    .line 64
    .line 65
    invoke-virtual {v1, v2, v15}, Li0/h0;->S(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    sget-object v2, Ls3/b;->a:Li0/u;

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    new-instance v3, Lwb/rj;

    .line 78
    .line 79
    const/16 v4, 0x16

    .line 80
    .line 81
    invoke-direct {v3, v5, v8, v9, v4}, Lwb/rj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    const v4, -0x4300795e

    .line 85
    .line 86
    .line 87
    invoke-static {v4, v3, v1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {v2, v3, v1, v10}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 96
    .line 97
    .line 98
    :goto_0
    return-object v14

    .line 99
    :pswitch_0
    invoke-direct/range {p0 .. p2}, Lc9/q0;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    return-object v1

    .line 104
    :pswitch_1
    invoke-direct/range {p0 .. p2}, Lc9/q0;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    return-object v1

    .line 109
    :pswitch_2
    invoke-direct/range {p0 .. p2}, Lc9/q0;->n(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    return-object v1

    .line 114
    :pswitch_3
    invoke-direct/range {p0 .. p2}, Lc9/q0;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    return-object v1

    .line 119
    :pswitch_4
    invoke-direct/range {p0 .. p2}, Lc9/q0;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    return-object v1

    .line 124
    :pswitch_5
    invoke-direct/range {p0 .. p2}, Lc9/q0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    return-object v1

    .line 129
    :pswitch_6
    invoke-direct/range {p0 .. p2}, Lc9/q0;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    return-object v1

    .line 134
    :pswitch_7
    invoke-direct/range {p0 .. p2}, Lc9/q0;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    return-object v1

    .line 139
    :pswitch_8
    invoke-direct/range {p0 .. p2}, Lc9/q0;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    return-object v1

    .line 144
    :pswitch_9
    invoke-direct/range {p0 .. p2}, Lc9/q0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    return-object v1

    .line 149
    :pswitch_a
    invoke-direct/range {p0 .. p2}, Lc9/q0;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    return-object v1

    .line 154
    :pswitch_b
    check-cast v3, Lx8/u;

    .line 155
    .line 156
    check-cast v5, Landroid/content/Context;

    .line 157
    .line 158
    check-cast v8, Li0/a1;

    .line 159
    .line 160
    check-cast v9, Li0/a1;

    .line 161
    .line 162
    move-object/from16 v1, p1

    .line 163
    .line 164
    check-cast v1, Li0/h0;

    .line 165
    .line 166
    move-object/from16 v6, p2

    .line 167
    .line 168
    check-cast v6, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    and-int/lit8 v7, v6, 0x3

    .line 175
    .line 176
    if-eq v7, v2, :cond_2

    .line 177
    .line 178
    move v7, v4

    .line 179
    goto :goto_1

    .line 180
    :cond_2
    move v7, v15

    .line 181
    :goto_1
    and-int/2addr v4, v6

    .line 182
    invoke-virtual {v1, v4, v7}, Li0/h0;->S(IZ)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_8

    .line 187
    .line 188
    iget-object v4, v3, Lx8/u;->a:Ljava/lang/String;

    .line 189
    .line 190
    new-instance v6, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    iget-object v7, v3, Lx8/u;->e:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    if-eqz v10, :cond_3

    .line 202
    .line 203
    const-string v7, "\u672a\u8bbe\u7f6e\u6a21\u578b"

    .line 204
    .line 205
    :cond_3
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    check-cast v7, Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v4, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-eqz v7, :cond_4

    .line 219
    .line 220
    const-string v7, " \u00b7 \u5f53\u524d"

    .line 221
    .line 222
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    :cond_4
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    check-cast v7, Ljava/lang/String;

    .line 230
    .line 231
    invoke-static {v4, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    if-eqz v7, :cond_5

    .line 236
    .line 237
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    check-cast v7, Ljava/lang/String;

    .line 242
    .line 243
    invoke-static {v4, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    if-nez v7, :cond_5

    .line 248
    .line 249
    const-string v7, " \u00b7 \u5df2\u9009\u62e9"

    .line 250
    .line 251
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    :cond_5
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    invoke-virtual {v1, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    or-int/2addr v7, v8

    .line 267
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    if-nez v7, :cond_6

    .line 272
    .line 273
    if-ne v8, v13, :cond_7

    .line 274
    .line 275
    :cond_6
    new-instance v8, Lwb/zh;

    .line 276
    .line 277
    invoke-direct {v8, v3, v5, v9, v2}, Lwb/zh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_7
    check-cast v8, Lfg/a;

    .line 284
    .line 285
    invoke-static {v4, v6, v8, v1, v15}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 286
    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_8
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 290
    .line 291
    .line 292
    :goto_2
    return-object v14

    .line 293
    :pswitch_c
    invoke-direct/range {p0 .. p2}, Lc9/q0;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    return-object v1

    .line 298
    :pswitch_d
    check-cast v3, Lv8/a;

    .line 299
    .line 300
    check-cast v5, Lfg/p;

    .line 301
    .line 302
    check-cast v8, Landroid/content/Context;

    .line 303
    .line 304
    check-cast v9, Lfg/l;

    .line 305
    .line 306
    move-object/from16 v1, p1

    .line 307
    .line 308
    check-cast v1, Li0/h0;

    .line 309
    .line 310
    move-object/from16 v6, p2

    .line 311
    .line 312
    check-cast v6, Ljava/lang/Integer;

    .line 313
    .line 314
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    and-int/lit8 v10, v6, 0x3

    .line 319
    .line 320
    if-eq v10, v2, :cond_9

    .line 321
    .line 322
    move v2, v4

    .line 323
    goto :goto_3

    .line 324
    :cond_9
    move v2, v15

    .line 325
    :goto_3
    and-int/2addr v6, v4

    .line 326
    invoke-virtual {v1, v6, v2}, Li0/h0;->S(IZ)Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_13

    .line 331
    .line 332
    iget-object v2, v3, Lv8/a;->e:Ljava/util/Set;

    .line 333
    .line 334
    iget-object v6, v3, Lv8/a;->f:Ljava/util/Set;

    .line 335
    .line 336
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    const-string v4, " \u4e2a\u4f1a\u8bdd"

    .line 341
    .line 342
    const-string v16, "\u672a\u9009\u62e9"

    .line 343
    .line 344
    if-eqz v10, :cond_a

    .line 345
    .line 346
    move-object/from16 v2, v16

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_a
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    invoke-static {v2, v7, v4}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    :goto_4
    invoke-virtual {v1, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v10

    .line 361
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v17

    .line 365
    or-int v10, v10, v17

    .line 366
    .line 367
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v11

    .line 371
    if-nez v10, :cond_b

    .line 372
    .line 373
    if-ne v11, v13, :cond_c

    .line 374
    .line 375
    :cond_b
    new-instance v11, Lwb/ki;

    .line 376
    .line 377
    invoke-direct {v11, v5, v3, v15}, Lwb/ki;-><init>(Lfg/p;Lv8/a;I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_c
    check-cast v11, Lfg/a;

    .line 384
    .line 385
    const-string v10, "\u76d1\u542c\u4f1a\u8bdd"

    .line 386
    .line 387
    invoke-static {v10, v2, v11, v1, v12}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 388
    .line 389
    .line 390
    const/4 v2, 0x0

    .line 391
    const/4 v10, 0x1

    .line 392
    invoke-static {v2, v1, v15, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 393
    .line 394
    .line 395
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    if-eqz v2, :cond_d

    .line 400
    .line 401
    const-string v2, "\u4e0d\u9650\u7fa4\u6210\u5458"

    .line 402
    .line 403
    goto :goto_5

    .line 404
    :cond_d
    invoke-interface {v6}, Ljava/util/Set;->size()I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    const-string v6, " \u4e2a\u7fa4\u6210\u5458"

    .line 409
    .line 410
    invoke-static {v2, v7, v6}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    :goto_5
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v6

    .line 418
    invoke-virtual {v1, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v10

    .line 422
    or-int/2addr v6, v10

    .line 423
    invoke-virtual {v1, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v10

    .line 427
    or-int/2addr v6, v10

    .line 428
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v10

    .line 432
    if-nez v6, :cond_f

    .line 433
    .line 434
    if-ne v10, v13, :cond_e

    .line 435
    .line 436
    goto :goto_6

    .line 437
    :cond_e
    const/4 v6, 0x1

    .line 438
    goto :goto_7

    .line 439
    :cond_f
    :goto_6
    new-instance v10, Lwb/zh;

    .line 440
    .line 441
    const/4 v6, 0x1

    .line 442
    invoke-direct {v10, v3, v8, v9, v6}, Lwb/zh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v1, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    :goto_7
    check-cast v10, Lfg/a;

    .line 449
    .line 450
    const-string v8, "\u7fa4\u6210\u5458\u8303\u56f4"

    .line 451
    .line 452
    invoke-static {v8, v2, v10, v1, v12}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 453
    .line 454
    .line 455
    const/4 v2, 0x0

    .line 456
    invoke-static {v2, v1, v15, v6}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 457
    .line 458
    .line 459
    iget-object v2, v3, Lv8/a;->g:Ljava/util/Set;

    .line 460
    .line 461
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 462
    .line 463
    .line 464
    move-result v6

    .line 465
    if-eqz v6, :cond_10

    .line 466
    .line 467
    :goto_8
    move-object/from16 v2, v16

    .line 468
    .line 469
    goto :goto_9

    .line 470
    :cond_10
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    invoke-static {v2, v7, v4}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v16

    .line 478
    goto :goto_8

    .line 479
    :goto_9
    invoke-virtual {v1, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v4

    .line 483
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v6

    .line 487
    or-int/2addr v4, v6

    .line 488
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v6

    .line 492
    if-nez v4, :cond_11

    .line 493
    .line 494
    if-ne v6, v13, :cond_12

    .line 495
    .line 496
    :cond_11
    new-instance v6, Lwb/ki;

    .line 497
    .line 498
    const/4 v10, 0x1

    .line 499
    invoke-direct {v6, v5, v3, v10}, Lwb/ki;-><init>(Lfg/p;Lv8/a;I)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v1, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    :cond_12
    check-cast v6, Lfg/a;

    .line 506
    .line 507
    const-string v3, "\u8f6c\u53d1\u4f1a\u8bdd"

    .line 508
    .line 509
    invoke-static {v3, v2, v6, v1, v12}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 510
    .line 511
    .line 512
    goto :goto_a

    .line 513
    :cond_13
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 514
    .line 515
    .line 516
    :goto_a
    return-object v14

    .line 517
    :pswitch_e
    check-cast v3, Li0/a1;

    .line 518
    .line 519
    check-cast v5, Ljava/util/Set;

    .line 520
    .line 521
    check-cast v8, Lfg/l;

    .line 522
    .line 523
    check-cast v9, Ln9/a;

    .line 524
    .line 525
    move-object/from16 v1, p1

    .line 526
    .line 527
    check-cast v1, Li0/h0;

    .line 528
    .line 529
    move-object/from16 v4, p2

    .line 530
    .line 531
    check-cast v4, Ljava/lang/Integer;

    .line 532
    .line 533
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 534
    .line 535
    .line 536
    move-result v4

    .line 537
    and-int/lit8 v6, v4, 0x3

    .line 538
    .line 539
    if-eq v6, v2, :cond_14

    .line 540
    .line 541
    const/4 v6, 0x1

    .line 542
    :goto_b
    const/16 v22, 0x1

    .line 543
    .line 544
    goto :goto_c

    .line 545
    :cond_14
    move v6, v15

    .line 546
    goto :goto_b

    .line 547
    :goto_c
    and-int/lit8 v4, v4, 0x1

    .line 548
    .line 549
    invoke-virtual {v1, v4, v6}, Li0/h0;->S(IZ)Z

    .line 550
    .line 551
    .line 552
    move-result v4

    .line 553
    if-eqz v4, :cond_1a

    .line 554
    .line 555
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    move-object/from16 v26, v4

    .line 560
    .line 561
    check-cast v26, Ljava/lang/String;

    .line 562
    .line 563
    invoke-virtual {v1, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v4

    .line 567
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v6

    .line 571
    if-nez v4, :cond_15

    .line 572
    .line 573
    if-ne v6, v13, :cond_16

    .line 574
    .line 575
    :cond_15
    new-instance v6, Lwb/ih;

    .line 576
    .line 577
    invoke-direct {v6, v3, v2}, Lwb/ih;-><init>(Li0/a1;I)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v1, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    :cond_16
    move-object/from16 v28, v6

    .line 584
    .line 585
    check-cast v28, Lfg/l;

    .line 586
    .line 587
    const/16 v30, 0x36

    .line 588
    .line 589
    const/16 v31, 0x8

    .line 590
    .line 591
    const-string v24, "\u6807\u7b7e\u540d\u79f0"

    .line 592
    .line 593
    const-string v25, "\u7528\u4e8e\u4efb\u52a1\u548c\u540d\u5355\u9009\u62e9\u5668"

    .line 594
    .line 595
    const/16 v27, 0x0

    .line 596
    .line 597
    move-object/from16 v29, v1

    .line 598
    .line 599
    invoke-static/range {v24 .. v31}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 600
    .line 601
    .line 602
    const/4 v2, 0x0

    .line 603
    const/4 v10, 0x1

    .line 604
    invoke-static {v2, v1, v15, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 605
    .line 606
    .line 607
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    if-eqz v2, :cond_17

    .line 612
    .line 613
    const-string v2, "\u672a\u9009\u62e9\u7fa4\u804a"

    .line 614
    .line 615
    goto :goto_d

    .line 616
    :cond_17
    invoke-interface {v5}, Ljava/util/Set;->size()I

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    const-string v3, " \u4e2a\u7fa4\u804a"

    .line 621
    .line 622
    invoke-static {v2, v7, v3}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    :goto_d
    invoke-virtual {v1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    invoke-virtual {v1, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    move-result v4

    .line 634
    or-int/2addr v3, v4

    .line 635
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    if-nez v3, :cond_18

    .line 640
    .line 641
    if-ne v4, v13, :cond_19

    .line 642
    .line 643
    :cond_18
    new-instance v4, Lwb/jh;

    .line 644
    .line 645
    invoke-direct {v4, v8, v9, v15}, Lwb/jh;-><init>(Lfg/l;Ln9/a;I)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v1, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    :cond_19
    check-cast v4, Lfg/a;

    .line 652
    .line 653
    const-string v3, "\u6807\u7b7e\u7fa4\u804a"

    .line 654
    .line 655
    invoke-static {v3, v2, v4, v1, v12}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 656
    .line 657
    .line 658
    goto :goto_e

    .line 659
    :cond_1a
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 660
    .line 661
    .line 662
    :goto_e
    return-object v14

    .line 663
    :pswitch_f
    check-cast v3, Ljava/util/ArrayList;

    .line 664
    .line 665
    check-cast v5, Landroid/content/Context;

    .line 666
    .line 667
    move-object/from16 v28, v8

    .line 668
    .line 669
    check-cast v28, Li0/a1;

    .line 670
    .line 671
    move-object/from16 v27, v9

    .line 672
    .line 673
    check-cast v27, Li0/a1;

    .line 674
    .line 675
    move-object/from16 v1, p1

    .line 676
    .line 677
    check-cast v1, Li0/h0;

    .line 678
    .line 679
    move-object/from16 v4, p2

    .line 680
    .line 681
    check-cast v4, Ljava/lang/Integer;

    .line 682
    .line 683
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 684
    .line 685
    .line 686
    move-result v4

    .line 687
    and-int/lit8 v6, v4, 0x3

    .line 688
    .line 689
    if-eq v6, v2, :cond_1b

    .line 690
    .line 691
    const/4 v2, 0x1

    .line 692
    :goto_f
    const/16 v22, 0x1

    .line 693
    .line 694
    goto :goto_10

    .line 695
    :cond_1b
    move v2, v15

    .line 696
    goto :goto_f

    .line 697
    :goto_10
    and-int/lit8 v4, v4, 0x1

    .line 698
    .line 699
    invoke-virtual {v1, v4, v2}, Li0/h0;->S(IZ)Z

    .line 700
    .line 701
    .line 702
    move-result v2

    .line 703
    if-eqz v2, :cond_20

    .line 704
    .line 705
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    move v4, v15

    .line 710
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 711
    .line 712
    .line 713
    move-result v6

    .line 714
    if-eqz v6, :cond_21

    .line 715
    .line 716
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v6

    .line 720
    add-int/lit8 v7, v4, 0x1

    .line 721
    .line 722
    if-ltz v4, :cond_1f

    .line 723
    .line 724
    check-cast v6, Lwb/s0;

    .line 725
    .line 726
    invoke-interface/range {v28 .. v28}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v8

    .line 730
    check-cast v8, Ljava/lang/Number;

    .line 731
    .line 732
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 733
    .line 734
    .line 735
    move-result v8

    .line 736
    invoke-virtual {v1, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    move-result v9

    .line 740
    invoke-virtual {v1, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    move-result v10

    .line 744
    or-int/2addr v9, v10

    .line 745
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v10

    .line 749
    if-nez v9, :cond_1d

    .line 750
    .line 751
    if-ne v10, v13, :cond_1c

    .line 752
    .line 753
    goto :goto_12

    .line 754
    :cond_1c
    move-object/from16 v24, v5

    .line 755
    .line 756
    move-object/from16 v25, v6

    .line 757
    .line 758
    move-object/from16 v9, v27

    .line 759
    .line 760
    move-object/from16 v5, v28

    .line 761
    .line 762
    goto :goto_13

    .line 763
    :cond_1d
    :goto_12
    new-instance v24, Lc9/n0;

    .line 764
    .line 765
    const/16 v29, 0xd

    .line 766
    .line 767
    move-object/from16 v26, v5

    .line 768
    .line 769
    move-object/from16 v25, v6

    .line 770
    .line 771
    invoke-direct/range {v24 .. v29}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 772
    .line 773
    .line 774
    move-object/from16 v10, v24

    .line 775
    .line 776
    move-object/from16 v24, v26

    .line 777
    .line 778
    move-object/from16 v9, v27

    .line 779
    .line 780
    move-object/from16 v5, v28

    .line 781
    .line 782
    invoke-virtual {v1, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    :goto_13
    move-object/from16 v27, v10

    .line 786
    .line 787
    check-cast v27, Lfg/a;

    .line 788
    .line 789
    const/16 v29, 0x0

    .line 790
    .line 791
    move-object/from16 v28, v1

    .line 792
    .line 793
    move/from16 v26, v8

    .line 794
    .line 795
    invoke-static/range {v24 .. v29}, Lwb/ho;->h0(Landroid/content/Context;Lwb/s0;ILfg/a;Li0/h0;I)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 799
    .line 800
    .line 801
    move-result v6

    .line 802
    const/4 v10, 0x1

    .line 803
    sub-int/2addr v6, v10

    .line 804
    if-eq v4, v6, :cond_1e

    .line 805
    .line 806
    const v4, -0x1c55c08

    .line 807
    .line 808
    .line 809
    invoke-virtual {v1, v4}, Li0/h0;->a0(I)V

    .line 810
    .line 811
    .line 812
    const/4 v4, 0x0

    .line 813
    invoke-static {v4, v1, v15, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 814
    .line 815
    .line 816
    :goto_14
    invoke-virtual {v1, v15}, Li0/h0;->p(Z)V

    .line 817
    .line 818
    .line 819
    goto :goto_15

    .line 820
    :cond_1e
    const v4, -0x36e5f068    # -631033.5f

    .line 821
    .line 822
    .line 823
    invoke-virtual {v1, v4}, Li0/h0;->a0(I)V

    .line 824
    .line 825
    .line 826
    goto :goto_14

    .line 827
    :goto_15
    move-object/from16 v28, v5

    .line 828
    .line 829
    move v4, v7

    .line 830
    move-object/from16 v27, v9

    .line 831
    .line 832
    move-object/from16 v5, v24

    .line 833
    .line 834
    goto :goto_11

    .line 835
    :cond_1f
    invoke-static {}, La/a;->Q0()V

    .line 836
    .line 837
    .line 838
    throw v17

    .line 839
    :cond_20
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 840
    .line 841
    .line 842
    :cond_21
    return-object v14

    .line 843
    :pswitch_10
    check-cast v3, Lvb/a;

    .line 844
    .line 845
    check-cast v5, Li0/a1;

    .line 846
    .line 847
    check-cast v8, Landroid/content/SharedPreferences;

    .line 848
    .line 849
    check-cast v9, Ljava/lang/String;

    .line 850
    .line 851
    move-object/from16 v1, p1

    .line 852
    .line 853
    check-cast v1, Li0/h0;

    .line 854
    .line 855
    move-object/from16 v4, p2

    .line 856
    .line 857
    check-cast v4, Ljava/lang/Integer;

    .line 858
    .line 859
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 860
    .line 861
    .line 862
    move-result v4

    .line 863
    and-int/lit8 v6, v4, 0x3

    .line 864
    .line 865
    if-eq v6, v2, :cond_22

    .line 866
    .line 867
    const/4 v15, 0x1

    .line 868
    :cond_22
    const/16 v22, 0x1

    .line 869
    .line 870
    and-int/lit8 v2, v4, 0x1

    .line 871
    .line 872
    invoke-virtual {v1, v2, v15}, Li0/h0;->S(IZ)Z

    .line 873
    .line 874
    .line 875
    move-result v2

    .line 876
    if-eqz v2, :cond_25

    .line 877
    .line 878
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    check-cast v2, Ljava/lang/Boolean;

    .line 883
    .line 884
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 885
    .line 886
    .line 887
    move-result v23

    .line 888
    invoke-interface {v3}, Lvb/a;->b()Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v24

    .line 892
    invoke-interface {v3}, Lvb/a;->d()Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v25

    .line 896
    invoke-virtual {v1, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    move-result v2

    .line 900
    invoke-virtual {v1, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v3

    .line 904
    or-int/2addr v2, v3

    .line 905
    invoke-virtual {v1, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    move-result v3

    .line 909
    or-int/2addr v2, v3

    .line 910
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v3

    .line 914
    if-nez v2, :cond_23

    .line 915
    .line 916
    if-ne v3, v13, :cond_24

    .line 917
    .line 918
    :cond_23
    new-instance v3, Lwb/vb;

    .line 919
    .line 920
    const/4 v2, 0x5

    .line 921
    invoke-direct {v3, v8, v9, v5, v2}, Lwb/vb;-><init>(Landroid/content/SharedPreferences;Ljava/lang/String;Li0/a1;I)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v1, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 925
    .line 926
    .line 927
    :cond_24
    move-object/from16 v27, v3

    .line 928
    .line 929
    check-cast v27, Lfg/l;

    .line 930
    .line 931
    const/16 v29, 0x0

    .line 932
    .line 933
    const/16 v30, 0x8

    .line 934
    .line 935
    const/16 v26, 0x0

    .line 936
    .line 937
    move-object/from16 v28, v1

    .line 938
    .line 939
    invoke-static/range {v23 .. v30}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 940
    .line 941
    .line 942
    goto :goto_16

    .line 943
    :cond_25
    move-object/from16 v28, v1

    .line 944
    .line 945
    invoke-virtual/range {v28 .. v28}, Li0/h0;->V()V

    .line 946
    .line 947
    .line 948
    :goto_16
    return-object v14

    .line 949
    :pswitch_11
    check-cast v3, Ljava/lang/String;

    .line 950
    .line 951
    check-cast v5, Ljava/util/ArrayList;

    .line 952
    .line 953
    move-object/from16 v24, v8

    .line 954
    .line 955
    check-cast v24, Lfg/a;

    .line 956
    .line 957
    check-cast v9, Lfg/a;

    .line 958
    .line 959
    move-object/from16 v1, p1

    .line 960
    .line 961
    check-cast v1, Li0/h0;

    .line 962
    .line 963
    move-object/from16 v4, p2

    .line 964
    .line 965
    check-cast v4, Ljava/lang/Integer;

    .line 966
    .line 967
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 968
    .line 969
    .line 970
    move-result v4

    .line 971
    and-int/lit8 v7, v4, 0x3

    .line 972
    .line 973
    if-eq v7, v2, :cond_26

    .line 974
    .line 975
    const/4 v2, 0x1

    .line 976
    :goto_17
    const/16 v22, 0x1

    .line 977
    .line 978
    goto :goto_18

    .line 979
    :cond_26
    move v2, v15

    .line 980
    goto :goto_17

    .line 981
    :goto_18
    and-int/lit8 v4, v4, 0x1

    .line 982
    .line 983
    invoke-virtual {v1, v4, v2}, Li0/h0;->S(IZ)Z

    .line 984
    .line 985
    .line 986
    move-result v2

    .line 987
    if-eqz v2, :cond_2f

    .line 988
    .line 989
    sget-object v2, Lp/j;->c:Lp/e;

    .line 990
    .line 991
    sget-object v4, Ly0/b;->s:Ly0/e;

    .line 992
    .line 993
    invoke-static {v2, v4, v1, v15}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 994
    .line 995
    .line 996
    move-result-object v2

    .line 997
    iget-wide v7, v1, Li0/h0;->T:J

    .line 998
    .line 999
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 1000
    .line 1001
    .line 1002
    move-result v4

    .line 1003
    invoke-virtual {v1}, Li0/h0;->l()Ls0/h;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v7

    .line 1007
    invoke-static {v1, v6}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v8

    .line 1011
    sget-object v10, Lx1/g;->f:Lx1/f;

    .line 1012
    .line 1013
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    sget-object v10, Lx1/f;->b:Lx1/y;

    .line 1017
    .line 1018
    invoke-virtual {v1}, Li0/h0;->d0()V

    .line 1019
    .line 1020
    .line 1021
    iget-boolean v11, v1, Li0/h0;->S:Z

    .line 1022
    .line 1023
    if-eqz v11, :cond_27

    .line 1024
    .line 1025
    invoke-virtual {v1, v10}, Li0/h0;->k(Lfg/a;)V

    .line 1026
    .line 1027
    .line 1028
    goto :goto_19

    .line 1029
    :cond_27
    invoke-virtual {v1}, Li0/h0;->n0()V

    .line 1030
    .line 1031
    .line 1032
    :goto_19
    sget-object v10, Lx1/f;->e:Lx1/e;

    .line 1033
    .line 1034
    invoke-static {v10, v1, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1035
    .line 1036
    .line 1037
    sget-object v2, Lx1/f;->d:Lx1/e;

    .line 1038
    .line 1039
    invoke-static {v2, v1, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v2

    .line 1046
    sget-object v4, Lx1/f;->f:Lx1/e;

    .line 1047
    .line 1048
    invoke-static {v4, v1, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1049
    .line 1050
    .line 1051
    sget-object v2, Lx1/f;->g:Lx1/d;

    .line 1052
    .line 1053
    invoke-static {v2, v1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 1054
    .line 1055
    .line 1056
    sget-object v2, Lx1/f;->c:Lx1/e;

    .line 1057
    .line 1058
    invoke-static {v2, v1, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1059
    .line 1060
    .line 1061
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1062
    .line 1063
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1067
    .line 1068
    .line 1069
    new-instance v3, Ljava/util/ArrayList;

    .line 1070
    .line 1071
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v4

    .line 1078
    :cond_28
    :goto_1a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v7

    .line 1082
    if-eqz v7, :cond_29

    .line 1083
    .line 1084
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v7

    .line 1088
    move-object v8, v7

    .line 1089
    check-cast v8, Ljava/lang/String;

    .line 1090
    .line 1091
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v8

    .line 1095
    if-nez v8, :cond_28

    .line 1096
    .line 1097
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1098
    .line 1099
    .line 1100
    goto :goto_1a

    .line 1101
    :cond_29
    invoke-static {v12, v3}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v25

    .line 1105
    const/16 v29, 0x0

    .line 1106
    .line 1107
    const/16 v30, 0x3e

    .line 1108
    .line 1109
    const-string v26, "\u3001"

    .line 1110
    .line 1111
    const/16 v27, 0x0

    .line 1112
    .line 1113
    const/16 v28, 0x0

    .line 1114
    .line 1115
    invoke-static/range {v25 .. v30}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v3

    .line 1119
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1120
    .line 1121
    .line 1122
    move-result v4

    .line 1123
    if-nez v4, :cond_2a

    .line 1124
    .line 1125
    const-string v4, "\n\n"

    .line 1126
    .line 1127
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1131
    .line 1132
    .line 1133
    :cond_2a
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1134
    .line 1135
    .line 1136
    move-result v3

    .line 1137
    if-le v3, v12, :cond_2b

    .line 1138
    .line 1139
    const-string v3, " \u7b49"

    .line 1140
    .line 1141
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1142
    .line 1143
    .line 1144
    :cond_2b
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v25

    .line 1148
    sget-object v2, Lbi/d;->a:Li0/m2;

    .line 1149
    .line 1150
    invoke-virtual {v1, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v2

    .line 1154
    check-cast v2, Lbi/b;

    .line 1155
    .line 1156
    invoke-virtual {v2}, Lbi/b;->g()J

    .line 1157
    .line 1158
    .line 1159
    move-result-wide v27

    .line 1160
    invoke-static/range {v19 .. v19}, Lx6/d;->D(I)J

    .line 1161
    .line 1162
    .line 1163
    move-result-wide v29

    .line 1164
    const/16 v46, 0x0

    .line 1165
    .line 1166
    const v47, 0x3ffea

    .line 1167
    .line 1168
    .line 1169
    const/16 v26, 0x0

    .line 1170
    .line 1171
    const/16 v31, 0x0

    .line 1172
    .line 1173
    const/16 v32, 0x0

    .line 1174
    .line 1175
    const-wide/16 v33, 0x0

    .line 1176
    .line 1177
    const/16 v35, 0x0

    .line 1178
    .line 1179
    const-wide/16 v36, 0x0

    .line 1180
    .line 1181
    const/16 v38, 0x0

    .line 1182
    .line 1183
    const/16 v39, 0x0

    .line 1184
    .line 1185
    const/16 v40, 0x0

    .line 1186
    .line 1187
    const/16 v41, 0x0

    .line 1188
    .line 1189
    const/16 v42, 0x0

    .line 1190
    .line 1191
    const/16 v43, 0x0

    .line 1192
    .line 1193
    const/16 v45, 0x6000

    .line 1194
    .line 1195
    move-object/from16 v44, v1

    .line 1196
    .line 1197
    invoke-static/range {v25 .. v47}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1198
    .line 1199
    .line 1200
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1201
    .line 1202
    invoke-static {v6, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v15

    .line 1206
    const/16 v3, 0xc

    .line 1207
    .line 1208
    int-to-float v3, v3

    .line 1209
    const/16 v19, 0x0

    .line 1210
    .line 1211
    const/16 v20, 0xd

    .line 1212
    .line 1213
    const/16 v16, 0x0

    .line 1214
    .line 1215
    const/16 v18, 0x0

    .line 1216
    .line 1217
    move/from16 v17, v3

    .line 1218
    .line 1219
    invoke-static/range {v15 .. v20}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v3

    .line 1223
    const/16 v4, 0xa

    .line 1224
    .line 1225
    int-to-float v4, v4

    .line 1226
    invoke-static {v4}, Lp/j;->g(F)Lp/h;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v4

    .line 1230
    sget-object v5, Ly0/b;->p:Ly0/f;

    .line 1231
    .line 1232
    invoke-static {v4, v5, v1, v12}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v4

    .line 1236
    iget-wide v5, v1, Li0/h0;->T:J

    .line 1237
    .line 1238
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 1239
    .line 1240
    .line 1241
    move-result v5

    .line 1242
    invoke-virtual {v1}, Li0/h0;->l()Ls0/h;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v6

    .line 1246
    invoke-static {v1, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v3

    .line 1250
    sget-object v7, Lx1/g;->f:Lx1/f;

    .line 1251
    .line 1252
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1253
    .line 1254
    .line 1255
    sget-object v7, Lx1/f;->b:Lx1/y;

    .line 1256
    .line 1257
    invoke-virtual {v1}, Li0/h0;->d0()V

    .line 1258
    .line 1259
    .line 1260
    iget-boolean v8, v1, Li0/h0;->S:Z

    .line 1261
    .line 1262
    if-eqz v8, :cond_2c

    .line 1263
    .line 1264
    invoke-virtual {v1, v7}, Li0/h0;->k(Lfg/a;)V

    .line 1265
    .line 1266
    .line 1267
    goto :goto_1b

    .line 1268
    :cond_2c
    invoke-virtual {v1}, Li0/h0;->n0()V

    .line 1269
    .line 1270
    .line 1271
    :goto_1b
    sget-object v7, Lx1/f;->e:Lx1/e;

    .line 1272
    .line 1273
    invoke-static {v7, v1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1274
    .line 1275
    .line 1276
    sget-object v4, Lx1/f;->d:Lx1/e;

    .line 1277
    .line 1278
    invoke-static {v4, v1, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1279
    .line 1280
    .line 1281
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v4

    .line 1285
    sget-object v5, Lx1/f;->f:Lx1/e;

    .line 1286
    .line 1287
    invoke-static {v5, v1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1288
    .line 1289
    .line 1290
    sget-object v4, Lx1/f;->g:Lx1/d;

    .line 1291
    .line 1292
    invoke-static {v4, v1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 1293
    .line 1294
    .line 1295
    sget-object v4, Lx1/f;->c:Lx1/e;

    .line 1296
    .line 1297
    invoke-static {v4, v1, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1298
    .line 1299
    .line 1300
    float-to-double v3, v2

    .line 1301
    const-wide/16 v5, 0x0

    .line 1302
    .line 1303
    cmpl-double v3, v3, v5

    .line 1304
    .line 1305
    const-string v4, "invalid weight; must be greater than zero"

    .line 1306
    .line 1307
    if-lez v3, :cond_2d

    .line 1308
    .line 1309
    goto :goto_1c

    .line 1310
    :cond_2d
    invoke-static {v4}, Lq/a;->a(Ljava/lang/String;)V

    .line 1311
    .line 1312
    .line 1313
    :goto_1c
    new-instance v3, Lp/q0;

    .line 1314
    .line 1315
    const/4 v10, 0x1

    .line 1316
    invoke-direct {v3, v2, v10}, Lp/q0;-><init>(FZ)V

    .line 1317
    .line 1318
    .line 1319
    invoke-static {v1}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v30

    .line 1323
    const/16 v33, 0x6

    .line 1324
    .line 1325
    const/16 v34, 0x778

    .line 1326
    .line 1327
    const-string v23, "\u53d6\u6d88"

    .line 1328
    .line 1329
    const/16 v26, 0x0

    .line 1330
    .line 1331
    const/16 v27, 0x0

    .line 1332
    .line 1333
    const/16 v28, 0x0

    .line 1334
    .line 1335
    const/16 v29, 0x0

    .line 1336
    .line 1337
    const/16 v31, 0x0

    .line 1338
    .line 1339
    move-object/from16 v32, v1

    .line 1340
    .line 1341
    move-object/from16 v25, v3

    .line 1342
    .line 1343
    invoke-static/range {v23 .. v34}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 1344
    .line 1345
    .line 1346
    float-to-double v7, v2

    .line 1347
    cmpl-double v1, v7, v5

    .line 1348
    .line 1349
    if-lez v1, :cond_2e

    .line 1350
    .line 1351
    goto :goto_1d

    .line 1352
    :cond_2e
    invoke-static {v4}, Lq/a;->a(Ljava/lang/String;)V

    .line 1353
    .line 1354
    .line 1355
    :goto_1d
    new-instance v1, Lp/q0;

    .line 1356
    .line 1357
    const/4 v10, 0x1

    .line 1358
    invoke-direct {v1, v2, v10}, Lp/q0;-><init>(FZ)V

    .line 1359
    .line 1360
    .line 1361
    move-object/from16 v34, v32

    .line 1362
    .line 1363
    invoke-static/range {v34 .. v34}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v32

    .line 1367
    const/16 v35, 0x6

    .line 1368
    .line 1369
    const/16 v36, 0x778

    .line 1370
    .line 1371
    const-string v25, "\u786e\u8ba4\u5220\u9664"

    .line 1372
    .line 1373
    const/16 v28, 0x0

    .line 1374
    .line 1375
    const/16 v29, 0x0

    .line 1376
    .line 1377
    const/16 v30, 0x0

    .line 1378
    .line 1379
    const/16 v31, 0x0

    .line 1380
    .line 1381
    const/16 v33, 0x0

    .line 1382
    .line 1383
    move-object/from16 v27, v1

    .line 1384
    .line 1385
    move-object/from16 v26, v9

    .line 1386
    .line 1387
    invoke-static/range {v25 .. v36}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 1388
    .line 1389
    .line 1390
    move-object/from16 v1, v34

    .line 1391
    .line 1392
    invoke-virtual {v1, v10}, Li0/h0;->p(Z)V

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v1, v10}, Li0/h0;->p(Z)V

    .line 1396
    .line 1397
    .line 1398
    goto :goto_1e

    .line 1399
    :cond_2f
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 1400
    .line 1401
    .line 1402
    :goto_1e
    return-object v14

    .line 1403
    :pswitch_12
    check-cast v3, Ljava/util/List;

    .line 1404
    .line 1405
    check-cast v5, Landroid/content/Context;

    .line 1406
    .line 1407
    check-cast v8, Lfg/l;

    .line 1408
    .line 1409
    check-cast v9, Li0/a1;

    .line 1410
    .line 1411
    move-object/from16 v1, p1

    .line 1412
    .line 1413
    check-cast v1, Li0/h0;

    .line 1414
    .line 1415
    move-object/from16 v4, p2

    .line 1416
    .line 1417
    check-cast v4, Ljava/lang/Integer;

    .line 1418
    .line 1419
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1420
    .line 1421
    .line 1422
    move-result v4

    .line 1423
    and-int/lit8 v7, v4, 0x3

    .line 1424
    .line 1425
    if-eq v7, v2, :cond_30

    .line 1426
    .line 1427
    const/4 v2, 0x1

    .line 1428
    :goto_1f
    const/16 v22, 0x1

    .line 1429
    .line 1430
    goto :goto_20

    .line 1431
    :cond_30
    move v2, v15

    .line 1432
    goto :goto_1f

    .line 1433
    :goto_20
    and-int/lit8 v4, v4, 0x1

    .line 1434
    .line 1435
    invoke-virtual {v1, v4, v2}, Li0/h0;->S(IZ)Z

    .line 1436
    .line 1437
    .line 1438
    move-result v2

    .line 1439
    if-eqz v2, :cond_40

    .line 1440
    .line 1441
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1442
    .line 1443
    .line 1444
    move-result v2

    .line 1445
    if-eqz v2, :cond_31

    .line 1446
    .line 1447
    const v2, -0x22fb9caa

    .line 1448
    .line 1449
    .line 1450
    invoke-virtual {v1, v2}, Li0/h0;->a0(I)V

    .line 1451
    .line 1452
    .line 1453
    sget-object v2, Lbi/d;->a:Li0/m2;

    .line 1454
    .line 1455
    invoke-virtual {v1, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v2

    .line 1459
    check-cast v2, Lbi/b;

    .line 1460
    .line 1461
    invoke-virtual {v2}, Lbi/b;->h()J

    .line 1462
    .line 1463
    .line 1464
    move-result-wide v26

    .line 1465
    invoke-static/range {v18 .. v18}, Lx6/d;->D(I)J

    .line 1466
    .line 1467
    .line 1468
    move-result-wide v28

    .line 1469
    const/16 v2, 0x10

    .line 1470
    .line 1471
    int-to-float v2, v2

    .line 1472
    move/from16 v3, v19

    .line 1473
    .line 1474
    int-to-float v3, v3

    .line 1475
    invoke-static {v6, v2, v3}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v25

    .line 1479
    const/16 v45, 0x0

    .line 1480
    .line 1481
    const v46, 0x3ffe8

    .line 1482
    .line 1483
    .line 1484
    const-string v24, "\u6682\u65e0\u63d2\u4ef6"

    .line 1485
    .line 1486
    const/16 v30, 0x0

    .line 1487
    .line 1488
    const/16 v31, 0x0

    .line 1489
    .line 1490
    const-wide/16 v32, 0x0

    .line 1491
    .line 1492
    const/16 v34, 0x0

    .line 1493
    .line 1494
    const-wide/16 v35, 0x0

    .line 1495
    .line 1496
    const/16 v37, 0x0

    .line 1497
    .line 1498
    const/16 v38, 0x0

    .line 1499
    .line 1500
    const/16 v39, 0x0

    .line 1501
    .line 1502
    const/16 v40, 0x0

    .line 1503
    .line 1504
    const/16 v41, 0x0

    .line 1505
    .line 1506
    const/16 v42, 0x0

    .line 1507
    .line 1508
    const/16 v44, 0x6036

    .line 1509
    .line 1510
    move-object/from16 v43, v1

    .line 1511
    .line 1512
    invoke-static/range {v24 .. v46}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v1, v15}, Li0/h0;->p(Z)V

    .line 1516
    .line 1517
    .line 1518
    goto/16 :goto_27

    .line 1519
    .line 1520
    :cond_31
    const v2, -0x22f632a0

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v1, v2}, Li0/h0;->a0(I)V

    .line 1524
    .line 1525
    .line 1526
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v2

    .line 1530
    move v4, v15

    .line 1531
    :goto_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1532
    .line 1533
    .line 1534
    move-result v6

    .line 1535
    if-eqz v6, :cond_3f

    .line 1536
    .line 1537
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v6

    .line 1541
    add-int/lit8 v7, v4, 0x1

    .line 1542
    .line 1543
    if-ltz v4, :cond_3e

    .line 1544
    .line 1545
    check-cast v6, Leb/c0;

    .line 1546
    .line 1547
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v10

    .line 1551
    check-cast v10, Ljava/util/Map;

    .line 1552
    .line 1553
    iget-object v11, v6, Leb/c0;->a:Ljava/lang/String;

    .line 1554
    .line 1555
    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v10

    .line 1559
    check-cast v10, Ljava/lang/Boolean;

    .line 1560
    .line 1561
    if-eqz v10, :cond_32

    .line 1562
    .line 1563
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1564
    .line 1565
    .line 1566
    move-result v10

    .line 1567
    :goto_22
    move/from16 v24, v10

    .line 1568
    .line 1569
    goto :goto_23

    .line 1570
    :cond_32
    sget-object v10, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 1571
    .line 1572
    iget-object v11, v6, Leb/c0;->a:Ljava/lang/String;

    .line 1573
    .line 1574
    invoke-virtual {v10, v5, v11}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isPluginEnabled(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1575
    .line 1576
    .line 1577
    move-result v10

    .line 1578
    goto :goto_22

    .line 1579
    :goto_23
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1580
    .line 1581
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1582
    .line 1583
    .line 1584
    iget-object v11, v6, Leb/c0;->c:Ljava/io/File;

    .line 1585
    .line 1586
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v11

    .line 1590
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1591
    .line 1592
    .line 1593
    const-string v11, "\n\u4f5c\u8005: "

    .line 1594
    .line 1595
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1596
    .line 1597
    .line 1598
    iget-object v11, v6, Leb/c0;->e:Ljava/lang/String;

    .line 1599
    .line 1600
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1601
    .line 1602
    .line 1603
    move-result v12

    .line 1604
    const-string v16, "\u672a\u77e5"

    .line 1605
    .line 1606
    if-eqz v12, :cond_33

    .line 1607
    .line 1608
    move-object/from16 v11, v16

    .line 1609
    .line 1610
    :cond_33
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1611
    .line 1612
    .line 1613
    const-string v11, " | \u66f4\u65b0\u4e8e: "

    .line 1614
    .line 1615
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1616
    .line 1617
    .line 1618
    iget-object v11, v6, Leb/c0;->g:Ljava/lang/String;

    .line 1619
    .line 1620
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1621
    .line 1622
    .line 1623
    move-result v12

    .line 1624
    if-eqz v12, :cond_34

    .line 1625
    .line 1626
    move-object/from16 v11, v16

    .line 1627
    .line 1628
    :cond_34
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1629
    .line 1630
    .line 1631
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v26

    .line 1635
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1636
    .line 1637
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1638
    .line 1639
    .line 1640
    iget-object v11, v6, Leb/c0;->h:Ljava/lang/String;

    .line 1641
    .line 1642
    if-eqz v11, :cond_35

    .line 1643
    .line 1644
    goto :goto_24

    .line 1645
    :cond_35
    move-object/from16 v11, v16

    .line 1646
    .line 1647
    :goto_24
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1648
    .line 1649
    .line 1650
    const-string v11, "("

    .line 1651
    .line 1652
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1653
    .line 1654
    .line 1655
    iget-object v11, v6, Leb/c0;->f:Ljava/lang/String;

    .line 1656
    .line 1657
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1658
    .line 1659
    .line 1660
    move-result v12

    .line 1661
    if-eqz v12, :cond_36

    .line 1662
    .line 1663
    move-object/from16 v11, v16

    .line 1664
    .line 1665
    :cond_36
    const-string v12, ")"

    .line 1666
    .line 1667
    invoke-static {v10, v11, v12}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v25

    .line 1671
    sget-object v10, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 1672
    .line 1673
    invoke-virtual {v10, v6}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->canOpenSettings(Leb/c0;)Z

    .line 1674
    .line 1675
    .line 1676
    move-result v27

    .line 1677
    invoke-virtual {v1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1678
    .line 1679
    .line 1680
    move-result v10

    .line 1681
    invoke-virtual {v1, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1682
    .line 1683
    .line 1684
    move-result v11

    .line 1685
    or-int/2addr v10, v11

    .line 1686
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v11

    .line 1690
    if-nez v10, :cond_37

    .line 1691
    .line 1692
    if-ne v11, v13, :cond_38

    .line 1693
    .line 1694
    :cond_37
    new-instance v11, Lwb/q9;

    .line 1695
    .line 1696
    const/4 v10, 0x1

    .line 1697
    invoke-direct {v11, v8, v6, v10}, Lwb/q9;-><init>(Lfg/l;Leb/c0;I)V

    .line 1698
    .line 1699
    .line 1700
    invoke-virtual {v1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1701
    .line 1702
    .line 1703
    :cond_38
    move-object/from16 v28, v11

    .line 1704
    .line 1705
    check-cast v28, Lfg/a;

    .line 1706
    .line 1707
    invoke-virtual {v1, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1708
    .line 1709
    .line 1710
    move-result v10

    .line 1711
    invoke-virtual {v1, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1712
    .line 1713
    .line 1714
    move-result v11

    .line 1715
    or-int/2addr v10, v11

    .line 1716
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v11

    .line 1720
    if-nez v10, :cond_39

    .line 1721
    .line 1722
    if-ne v11, v13, :cond_3a

    .line 1723
    .line 1724
    :cond_39
    new-instance v11, Lsh/v1;

    .line 1725
    .line 1726
    move/from16 v10, v18

    .line 1727
    .line 1728
    invoke-direct {v11, v6, v10, v5}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1729
    .line 1730
    .line 1731
    invoke-virtual {v1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1732
    .line 1733
    .line 1734
    :cond_3a
    move-object/from16 v29, v11

    .line 1735
    .line 1736
    check-cast v29, Lfg/a;

    .line 1737
    .line 1738
    invoke-virtual {v1, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1739
    .line 1740
    .line 1741
    move-result v10

    .line 1742
    invoke-virtual {v1, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1743
    .line 1744
    .line 1745
    move-result v11

    .line 1746
    or-int/2addr v10, v11

    .line 1747
    invoke-virtual {v1, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1748
    .line 1749
    .line 1750
    move-result v11

    .line 1751
    or-int/2addr v10, v11

    .line 1752
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v11

    .line 1756
    if-nez v10, :cond_3b

    .line 1757
    .line 1758
    if-ne v11, v13, :cond_3c

    .line 1759
    .line 1760
    :cond_3b
    new-instance v11, Lb0/s;

    .line 1761
    .line 1762
    const/16 v10, 0x1d

    .line 1763
    .line 1764
    invoke-direct {v11, v10, v5, v6, v9}, Lb0/s;-><init>(ILandroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1765
    .line 1766
    .line 1767
    invoke-virtual {v1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1768
    .line 1769
    .line 1770
    :cond_3c
    move-object/from16 v30, v11

    .line 1771
    .line 1772
    check-cast v30, Lfg/l;

    .line 1773
    .line 1774
    const/16 v32, 0x0

    .line 1775
    .line 1776
    move-object/from16 v31, v1

    .line 1777
    .line 1778
    invoke-static/range {v24 .. v32}, Lwb/ho;->s3(ZLjava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 1779
    .line 1780
    .line 1781
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1782
    .line 1783
    .line 1784
    move-result v6

    .line 1785
    const/4 v10, 0x1

    .line 1786
    sub-int/2addr v6, v10

    .line 1787
    if-eq v4, v6, :cond_3d

    .line 1788
    .line 1789
    const v4, -0xccb496b

    .line 1790
    .line 1791
    .line 1792
    invoke-virtual {v1, v4}, Li0/h0;->a0(I)V

    .line 1793
    .line 1794
    .line 1795
    const/4 v4, 0x0

    .line 1796
    invoke-static {v4, v1, v15, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1797
    .line 1798
    .line 1799
    :goto_25
    invoke-virtual {v1, v15}, Li0/h0;->p(Z)V

    .line 1800
    .line 1801
    .line 1802
    goto :goto_26

    .line 1803
    :cond_3d
    const/4 v4, 0x0

    .line 1804
    const v6, 0x7362509b

    .line 1805
    .line 1806
    .line 1807
    invoke-virtual {v1, v6}, Li0/h0;->a0(I)V

    .line 1808
    .line 1809
    .line 1810
    goto :goto_25

    .line 1811
    :goto_26
    move v4, v7

    .line 1812
    const/16 v18, 0xd

    .line 1813
    .line 1814
    goto/16 :goto_21

    .line 1815
    .line 1816
    :cond_3e
    invoke-static {}, La/a;->Q0()V

    .line 1817
    .line 1818
    .line 1819
    throw v17

    .line 1820
    :cond_3f
    invoke-virtual {v1, v15}, Li0/h0;->p(Z)V

    .line 1821
    .line 1822
    .line 1823
    goto :goto_27

    .line 1824
    :cond_40
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 1825
    .line 1826
    .line 1827
    :goto_27
    return-object v14

    .line 1828
    :pswitch_13
    check-cast v3, Landroid/content/Context;

    .line 1829
    .line 1830
    check-cast v5, Li0/a1;

    .line 1831
    .line 1832
    check-cast v8, Li0/a1;

    .line 1833
    .line 1834
    check-cast v9, Li0/a1;

    .line 1835
    .line 1836
    move-object/from16 v1, p1

    .line 1837
    .line 1838
    check-cast v1, Li0/h0;

    .line 1839
    .line 1840
    move-object/from16 v4, p2

    .line 1841
    .line 1842
    check-cast v4, Ljava/lang/Integer;

    .line 1843
    .line 1844
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1845
    .line 1846
    .line 1847
    move-result v4

    .line 1848
    and-int/lit8 v6, v4, 0x3

    .line 1849
    .line 1850
    if-eq v6, v2, :cond_41

    .line 1851
    .line 1852
    const/4 v15, 0x1

    .line 1853
    :cond_41
    const/16 v22, 0x1

    .line 1854
    .line 1855
    and-int/lit8 v2, v4, 0x1

    .line 1856
    .line 1857
    invoke-virtual {v1, v2, v15}, Li0/h0;->S(IZ)Z

    .line 1858
    .line 1859
    .line 1860
    move-result v2

    .line 1861
    if-eqz v2, :cond_45

    .line 1862
    .line 1863
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v2

    .line 1867
    check-cast v2, Ljava/lang/Boolean;

    .line 1868
    .line 1869
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1870
    .line 1871
    .line 1872
    move-result v2

    .line 1873
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v4

    .line 1877
    if-ne v4, v13, :cond_42

    .line 1878
    .line 1879
    new-instance v4, Lwb/l9;

    .line 1880
    .line 1881
    const/16 v10, 0xd

    .line 1882
    .line 1883
    invoke-direct {v4, v8, v10}, Lwb/l9;-><init>(Li0/a1;I)V

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual {v1, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1887
    .line 1888
    .line 1889
    :cond_42
    check-cast v4, Lfg/a;

    .line 1890
    .line 1891
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1892
    .line 1893
    .line 1894
    move-result v6

    .line 1895
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v7

    .line 1899
    if-nez v6, :cond_43

    .line 1900
    .line 1901
    if-ne v7, v13, :cond_44

    .line 1902
    .line 1903
    :cond_43
    new-instance v7, Lwb/oc;

    .line 1904
    .line 1905
    invoke-direct {v7, v5, v3, v9}, Lwb/oc;-><init>(Li0/a1;Landroid/content/Context;Li0/a1;)V

    .line 1906
    .line 1907
    .line 1908
    invoke-virtual {v1, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1909
    .line 1910
    .line 1911
    :cond_44
    check-cast v7, Lfg/l;

    .line 1912
    .line 1913
    const/16 v3, 0xdb0

    .line 1914
    .line 1915
    invoke-static {v2, v4, v7, v1, v3}, Lwb/ho;->D2(ZLfg/a;Lfg/l;Li0/h0;I)V

    .line 1916
    .line 1917
    .line 1918
    goto :goto_28

    .line 1919
    :cond_45
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 1920
    .line 1921
    .line 1922
    :goto_28
    return-object v14

    .line 1923
    :pswitch_14
    check-cast v3, Landroid/content/SharedPreferences;

    .line 1924
    .line 1925
    move-object/from16 v16, v5

    .line 1926
    .line 1927
    check-cast v16, Ljava/lang/String;

    .line 1928
    .line 1929
    check-cast v8, Lvb/a;

    .line 1930
    .line 1931
    move-object/from16 v18, v9

    .line 1932
    .line 1933
    check-cast v18, Ljava/lang/String;

    .line 1934
    .line 1935
    move-object/from16 v1, p1

    .line 1936
    .line 1937
    check-cast v1, Li0/h0;

    .line 1938
    .line 1939
    move-object/from16 v4, p2

    .line 1940
    .line 1941
    check-cast v4, Ljava/lang/Integer;

    .line 1942
    .line 1943
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1944
    .line 1945
    .line 1946
    move-result v4

    .line 1947
    and-int/lit8 v5, v4, 0x3

    .line 1948
    .line 1949
    if-eq v5, v2, :cond_46

    .line 1950
    .line 1951
    const/4 v15, 0x1

    .line 1952
    :cond_46
    const/16 v22, 0x1

    .line 1953
    .line 1954
    and-int/lit8 v2, v4, 0x1

    .line 1955
    .line 1956
    invoke-virtual {v1, v2, v15}, Li0/h0;->S(IZ)Z

    .line 1957
    .line 1958
    .line 1959
    move-result v2

    .line 1960
    if-eqz v2, :cond_47

    .line 1961
    .line 1962
    invoke-interface {v8}, Lvb/a;->b()Ljava/lang/String;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v17

    .line 1966
    const/16 v21, 0x0

    .line 1967
    .line 1968
    const/16 v19, 0x0

    .line 1969
    .line 1970
    move-object/from16 v20, v1

    .line 1971
    .line 1972
    move-object v15, v3

    .line 1973
    invoke-static/range {v15 .. v21}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1974
    .line 1975
    .line 1976
    goto :goto_29

    .line 1977
    :cond_47
    move-object/from16 v20, v1

    .line 1978
    .line 1979
    invoke-virtual/range {v20 .. v20}, Li0/h0;->V()V

    .line 1980
    .line 1981
    .line 1982
    :goto_29
    return-object v14

    .line 1983
    :pswitch_15
    move-object v1, v3

    .line 1984
    check-cast v1, Landroid/content/Context;

    .line 1985
    .line 1986
    move-object v2, v5

    .line 1987
    check-cast v2, Lwb/n5;

    .line 1988
    .line 1989
    move-object v3, v8

    .line 1990
    check-cast v3, Lfg/a;

    .line 1991
    .line 1992
    move-object v4, v9

    .line 1993
    check-cast v4, Lfg/l;

    .line 1994
    .line 1995
    move-object/from16 v5, p1

    .line 1996
    .line 1997
    check-cast v5, Li0/h0;

    .line 1998
    .line 1999
    move-object/from16 v6, p2

    .line 2000
    .line 2001
    check-cast v6, Ljava/lang/Integer;

    .line 2002
    .line 2003
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2004
    .line 2005
    .line 2006
    invoke-static/range {v16 .. v16}, Li0/r;->C(I)I

    .line 2007
    .line 2008
    .line 2009
    move-result v6

    .line 2010
    invoke-static/range {v1 .. v6}, Lwb/ho;->V1(Landroid/content/Context;Lwb/n5;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 2011
    .line 2012
    .line 2013
    return-object v14

    .line 2014
    :pswitch_16
    move-object v7, v3

    .line 2015
    check-cast v7, Ljava/util/List;

    .line 2016
    .line 2017
    check-cast v5, Ljava/util/List;

    .line 2018
    .line 2019
    check-cast v8, Lfg/a;

    .line 2020
    .line 2021
    move-object v10, v9

    .line 2022
    check-cast v10, Lfg/l;

    .line 2023
    .line 2024
    move-object/from16 v11, p1

    .line 2025
    .line 2026
    check-cast v11, Li0/h0;

    .line 2027
    .line 2028
    move-object/from16 v1, p2

    .line 2029
    .line 2030
    check-cast v1, Ljava/lang/Integer;

    .line 2031
    .line 2032
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2033
    .line 2034
    .line 2035
    invoke-static/range {v16 .. v16}, Li0/r;->C(I)I

    .line 2036
    .line 2037
    .line 2038
    move-result v12

    .line 2039
    move-object v9, v8

    .line 2040
    move-object v8, v5

    .line 2041
    invoke-static/range {v7 .. v12}, Lwb/ho;->Y3(Ljava/util/List;Ljava/util/List;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 2042
    .line 2043
    .line 2044
    return-object v14

    .line 2045
    :pswitch_17
    move-object/from16 v16, v3

    .line 2046
    .line 2047
    check-cast v16, Lf9/h;

    .line 2048
    .line 2049
    check-cast v5, Lc9/q0;

    .line 2050
    .line 2051
    check-cast v8, Lfg/a;

    .line 2052
    .line 2053
    check-cast v9, Lc9/n0;

    .line 2054
    .line 2055
    move-object/from16 v1, p1

    .line 2056
    .line 2057
    check-cast v1, Li0/h0;

    .line 2058
    .line 2059
    move-object/from16 v3, p2

    .line 2060
    .line 2061
    check-cast v3, Ljava/lang/Integer;

    .line 2062
    .line 2063
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2064
    .line 2065
    .line 2066
    move-result v3

    .line 2067
    and-int/lit8 v4, v3, 0x3

    .line 2068
    .line 2069
    if-eq v4, v2, :cond_48

    .line 2070
    .line 2071
    const/4 v15, 0x1

    .line 2072
    :cond_48
    const/16 v22, 0x1

    .line 2073
    .line 2074
    and-int/lit8 v2, v3, 0x1

    .line 2075
    .line 2076
    invoke-virtual {v1, v2, v15}, Li0/h0;->S(IZ)Z

    .line 2077
    .line 2078
    .line 2079
    move-result v2

    .line 2080
    if-eqz v2, :cond_4d

    .line 2081
    .line 2082
    sget-object v15, Lwb/y2;->h:Lwb/y2;

    .line 2083
    .line 2084
    invoke-virtual {v1, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 2085
    .line 2086
    .line 2087
    move-result v2

    .line 2088
    invoke-virtual {v1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 2089
    .line 2090
    .line 2091
    move-result v3

    .line 2092
    or-int/2addr v2, v3

    .line 2093
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v3

    .line 2097
    if-nez v2, :cond_49

    .line 2098
    .line 2099
    if-ne v3, v13, :cond_4a

    .line 2100
    .line 2101
    :cond_49
    new-instance v3, Lb0/q;

    .line 2102
    .line 2103
    const/16 v2, 0x10

    .line 2104
    .line 2105
    invoke-direct {v3, v5, v2, v8}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2106
    .line 2107
    .line 2108
    invoke-virtual {v1, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2109
    .line 2110
    .line 2111
    :cond_4a
    move-object/from16 v17, v3

    .line 2112
    .line 2113
    check-cast v17, Lfg/p;

    .line 2114
    .line 2115
    invoke-virtual {v1, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 2116
    .line 2117
    .line 2118
    move-result v2

    .line 2119
    invoke-virtual {v1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 2120
    .line 2121
    .line 2122
    move-result v3

    .line 2123
    or-int/2addr v2, v3

    .line 2124
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v3

    .line 2128
    if-nez v2, :cond_4b

    .line 2129
    .line 2130
    if-ne v3, v13, :cond_4c

    .line 2131
    .line 2132
    :cond_4b
    new-instance v3, Lsh/v1;

    .line 2133
    .line 2134
    invoke-direct {v3, v9, v12, v8}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2135
    .line 2136
    .line 2137
    invoke-virtual {v1, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2138
    .line 2139
    .line 2140
    :cond_4c
    move-object/from16 v18, v3

    .line 2141
    .line 2142
    check-cast v18, Lfg/a;

    .line 2143
    .line 2144
    const/16 v21, 0x6000

    .line 2145
    .line 2146
    move-object/from16 v20, v1

    .line 2147
    .line 2148
    move-object/from16 v19, v8

    .line 2149
    .line 2150
    invoke-virtual/range {v15 .. v21}, Lwb/y2;->q(Lf9/h;Lfg/p;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 2151
    .line 2152
    .line 2153
    goto :goto_2a

    .line 2154
    :cond_4d
    move-object/from16 v20, v1

    .line 2155
    .line 2156
    invoke-virtual/range {v20 .. v20}, Li0/h0;->V()V

    .line 2157
    .line 2158
    .line 2159
    :goto_2a
    return-object v14

    .line 2160
    :pswitch_18
    check-cast v3, Lc9/a1;

    .line 2161
    .line 2162
    move-object/from16 v18, v5

    .line 2163
    .line 2164
    check-cast v18, Landroid/app/Activity;

    .line 2165
    .line 2166
    move-object/from16 v19, v8

    .line 2167
    .line 2168
    check-cast v19, Ls0/d;

    .line 2169
    .line 2170
    move-object/from16 v20, v9

    .line 2171
    .line 2172
    check-cast v20, Lc9/r0;

    .line 2173
    .line 2174
    move-object/from16 v1, p1

    .line 2175
    .line 2176
    check-cast v1, Li0/h0;

    .line 2177
    .line 2178
    move-object/from16 v4, p2

    .line 2179
    .line 2180
    check-cast v4, Ljava/lang/Integer;

    .line 2181
    .line 2182
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2183
    .line 2184
    .line 2185
    move-result v4

    .line 2186
    and-int/lit8 v5, v4, 0x3

    .line 2187
    .line 2188
    if-eq v5, v2, :cond_4e

    .line 2189
    .line 2190
    const/4 v15, 0x1

    .line 2191
    :cond_4e
    const/16 v22, 0x1

    .line 2192
    .line 2193
    and-int/lit8 v2, v4, 0x1

    .line 2194
    .line 2195
    invoke-virtual {v1, v2, v15}, Li0/h0;->S(IZ)Z

    .line 2196
    .line 2197
    .line 2198
    move-result v2

    .line 2199
    if-eqz v2, :cond_4f

    .line 2200
    .line 2201
    sget-object v2, Ls3/b;->a:Li0/u;

    .line 2202
    .line 2203
    invoke-virtual {v2, v3}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v2

    .line 2207
    new-instance v16, Lb0/k;

    .line 2208
    .line 2209
    const/16 v17, 0x8

    .line 2210
    .line 2211
    const/16 v21, 0x0

    .line 2212
    .line 2213
    invoke-direct/range {v16 .. v21}, Lb0/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 2214
    .line 2215
    .line 2216
    move-object/from16 v3, v16

    .line 2217
    .line 2218
    const v4, -0x6abd74b8

    .line 2219
    .line 2220
    .line 2221
    invoke-static {v4, v3, v1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v3

    .line 2225
    invoke-static {v2, v3, v1, v10}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 2226
    .line 2227
    .line 2228
    goto :goto_2b

    .line 2229
    :cond_4f
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 2230
    .line 2231
    .line 2232
    :goto_2b
    return-object v14

    .line 2233
    :pswitch_19
    check-cast v3, Ly0/o;

    .line 2234
    .line 2235
    check-cast v5, Lv/d;

    .line 2236
    .line 2237
    check-cast v9, Lsh/f;

    .line 2238
    .line 2239
    check-cast v8, Ls0/d;

    .line 2240
    .line 2241
    move-object/from16 v1, p1

    .line 2242
    .line 2243
    check-cast v1, Li0/h0;

    .line 2244
    .line 2245
    move-object/from16 v4, p2

    .line 2246
    .line 2247
    check-cast v4, Ljava/lang/Integer;

    .line 2248
    .line 2249
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2250
    .line 2251
    .line 2252
    move-result v4

    .line 2253
    and-int/lit8 v6, v4, 0x3

    .line 2254
    .line 2255
    if-eq v6, v2, :cond_50

    .line 2256
    .line 2257
    const/4 v6, 0x1

    .line 2258
    :goto_2c
    const/16 v22, 0x1

    .line 2259
    .line 2260
    goto :goto_2d

    .line 2261
    :cond_50
    move v6, v15

    .line 2262
    goto :goto_2c

    .line 2263
    :goto_2d
    and-int/lit8 v4, v4, 0x1

    .line 2264
    .line 2265
    invoke-virtual {v1, v4, v6}, Li0/h0;->S(IZ)Z

    .line 2266
    .line 2267
    .line 2268
    move-result v4

    .line 2269
    if-eqz v4, :cond_53

    .line 2270
    .line 2271
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v4

    .line 2275
    if-ne v4, v13, :cond_51

    .line 2276
    .line 2277
    new-instance v4, Lr9/p;

    .line 2278
    .line 2279
    invoke-direct {v4, v2}, Lr9/p;-><init>(I)V

    .line 2280
    .line 2281
    .line 2282
    invoke-virtual {v1, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2283
    .line 2284
    .line 2285
    :cond_51
    check-cast v4, Lfg/l;

    .line 2286
    .line 2287
    sget-object v2, Lf2/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2288
    .line 2289
    new-instance v2, Lf2/b;

    .line 2290
    .line 2291
    invoke-direct {v2, v15, v4}, Lf2/b;-><init>(ZLfg/l;)V

    .line 2292
    .line 2293
    .line 2294
    invoke-interface {v3, v2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 2295
    .line 2296
    .line 2297
    move-result-object v2

    .line 2298
    invoke-static {v2, v5}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v2

    .line 2302
    iget-wide v3, v9, Lsh/f;->a:J

    .line 2303
    .line 2304
    sget-object v5, Lf1/c0;->b:Lf1/m0;

    .line 2305
    .line 2306
    invoke-static {v2, v3, v4, v5}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v2

    .line 2310
    sget-object v3, Ly0/b;->g:Ly0/g;

    .line 2311
    .line 2312
    const/4 v10, 0x1

    .line 2313
    invoke-static {v3, v10}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 2314
    .line 2315
    .line 2316
    move-result-object v3

    .line 2317
    iget-wide v4, v1, Li0/h0;->T:J

    .line 2318
    .line 2319
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 2320
    .line 2321
    .line 2322
    move-result v4

    .line 2323
    invoke-virtual {v1}, Li0/h0;->l()Ls0/h;

    .line 2324
    .line 2325
    .line 2326
    move-result-object v5

    .line 2327
    invoke-static {v1, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 2328
    .line 2329
    .line 2330
    move-result-object v2

    .line 2331
    sget-object v6, Lx1/g;->f:Lx1/f;

    .line 2332
    .line 2333
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2334
    .line 2335
    .line 2336
    sget-object v6, Lx1/f;->b:Lx1/y;

    .line 2337
    .line 2338
    invoke-virtual {v1}, Li0/h0;->d0()V

    .line 2339
    .line 2340
    .line 2341
    iget-boolean v7, v1, Li0/h0;->S:Z

    .line 2342
    .line 2343
    if-eqz v7, :cond_52

    .line 2344
    .line 2345
    invoke-virtual {v1, v6}, Li0/h0;->k(Lfg/a;)V

    .line 2346
    .line 2347
    .line 2348
    goto :goto_2e

    .line 2349
    :cond_52
    invoke-virtual {v1}, Li0/h0;->n0()V

    .line 2350
    .line 2351
    .line 2352
    :goto_2e
    sget-object v6, Lx1/f;->e:Lx1/e;

    .line 2353
    .line 2354
    invoke-static {v6, v1, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 2355
    .line 2356
    .line 2357
    sget-object v3, Lx1/f;->d:Lx1/e;

    .line 2358
    .line 2359
    invoke-static {v3, v1, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 2360
    .line 2361
    .line 2362
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2363
    .line 2364
    .line 2365
    move-result-object v3

    .line 2366
    sget-object v4, Lx1/f;->f:Lx1/e;

    .line 2367
    .line 2368
    invoke-static {v1, v3, v4}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 2369
    .line 2370
    .line 2371
    sget-object v3, Lx1/f;->g:Lx1/d;

    .line 2372
    .line 2373
    invoke-static {v3, v1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 2374
    .line 2375
    .line 2376
    sget-object v3, Lx1/f;->c:Lx1/e;

    .line 2377
    .line 2378
    invoke-static {v3, v1, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 2379
    .line 2380
    .line 2381
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2382
    .line 2383
    .line 2384
    move-result-object v2

    .line 2385
    invoke-virtual {v8, v1, v2}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2386
    .line 2387
    .line 2388
    const/4 v10, 0x1

    .line 2389
    invoke-virtual {v1, v10}, Li0/h0;->p(Z)V

    .line 2390
    .line 2391
    .line 2392
    goto :goto_2f

    .line 2393
    :cond_53
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 2394
    .line 2395
    .line 2396
    :goto_2f
    return-object v14

    .line 2397
    :pswitch_1a
    check-cast v3, Lf9/e;

    .line 2398
    .line 2399
    check-cast v8, Lf9/h;

    .line 2400
    .line 2401
    check-cast v9, Lf9/c;

    .line 2402
    .line 2403
    check-cast v5, Landroid/app/Activity;

    .line 2404
    .line 2405
    move-object/from16 v1, p1

    .line 2406
    .line 2407
    check-cast v1, Ljava/lang/String;

    .line 2408
    .line 2409
    move-object/from16 v2, p2

    .line 2410
    .line 2411
    check-cast v2, Ljava/lang/String;

    .line 2412
    .line 2413
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2414
    .line 2415
    .line 2416
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2417
    .line 2418
    .line 2419
    iget-object v3, v3, Lf9/e;->a:Lr8/g;

    .line 2420
    .line 2421
    iget-object v3, v3, Lr8/g;->a:Landroid/content/Context;

    .line 2422
    .line 2423
    iget-wide v6, v8, Lf9/h;->a:J

    .line 2424
    .line 2425
    iget-object v4, v9, Lf9/c;->b:Ljava/lang/Object;

    .line 2426
    .line 2427
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 2428
    .line 2429
    .line 2430
    move-result-object v8

    .line 2431
    if-eqz v8, :cond_6c

    .line 2432
    .line 2433
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->m()Lk8/s;

    .line 2434
    .line 2435
    .line 2436
    move-result-object v8

    .line 2437
    if-eqz v8, :cond_6c

    .line 2438
    .line 2439
    invoke-virtual {v8, v6, v7}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2440
    .line 2441
    .line 2442
    move-result-object v6

    .line 2443
    if-eqz v6, :cond_6c

    .line 2444
    .line 2445
    invoke-static {v6}, Lbe/h;->C(Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 2446
    .line 2447
    .line 2448
    move-result v7

    .line 2449
    if-nez v7, :cond_54

    .line 2450
    .line 2451
    new-instance v1, Lf9/g;

    .line 2452
    .line 2453
    invoke-direct {v1}, Lf9/g;-><init>()V

    .line 2454
    .line 2455
    .line 2456
    move-object/from16 v19, v5

    .line 2457
    .line 2458
    goto/16 :goto_3a

    .line 2459
    .line 2460
    :cond_54
    iget-object v9, v6, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 2461
    .line 2462
    const-string v7, "Hchat_edit_message_backup"

    .line 2463
    .line 2464
    invoke-static {v3, v7}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 2465
    .line 2466
    .line 2467
    move-result-object v8

    .line 2468
    iget-wide v10, v6, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 2469
    .line 2470
    invoke-static {v10, v11}, Lbe/h;->l(J)Ljava/lang/String;

    .line 2471
    .line 2472
    .line 2473
    move-result-object v10

    .line 2474
    invoke-interface {v8, v10}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 2475
    .line 2476
    .line 2477
    move-result v11

    .line 2478
    if-nez v11, :cond_55

    .line 2479
    .line 2480
    invoke-interface {v8}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2481
    .line 2482
    .line 2483
    move-result-object v8

    .line 2484
    iget-object v11, v6, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 2485
    .line 2486
    invoke-interface {v8, v10, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2487
    .line 2488
    .line 2489
    move-result-object v8

    .line 2490
    invoke-interface {v8}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2491
    .line 2492
    .line 2493
    :cond_55
    invoke-virtual {v6}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 2494
    .line 2495
    .line 2496
    move-result v8

    .line 2497
    const-string v10, "title"

    .line 2498
    .line 2499
    if-eqz v8, :cond_61

    .line 2500
    .line 2501
    invoke-virtual {v6}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2502
    .line 2503
    .line 2504
    move-result-object v8

    .line 2505
    invoke-static {v1}, Lbe/h;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 2506
    .line 2507
    .line 2508
    move-result-object v1

    .line 2509
    if-eqz v1, :cond_5f

    .line 2510
    .line 2511
    invoke-static {v1}, Lbe/h;->i(Ljava/lang/String;)Ljava/lang/Long;

    .line 2512
    .line 2513
    .line 2514
    move-result-object v11

    .line 2515
    if-eqz v11, :cond_5f

    .line 2516
    .line 2517
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 2518
    .line 2519
    .line 2520
    move-result-wide v11

    .line 2521
    const-string v13, "\uffe5"

    .line 2522
    .line 2523
    invoke-virtual {v13, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2524
    .line 2525
    .line 2526
    move-result-object v1

    .line 2527
    const-string v14, "feederval"

    .line 2528
    .line 2529
    const-string v15, "fee"

    .line 2530
    .line 2531
    const-string v0, "total_fee"

    .line 2532
    .line 2533
    filled-new-array {v0, v14, v15}, [Ljava/lang/String;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v0

    .line 2537
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 2538
    .line 2539
    .line 2540
    move-result-object v0

    .line 2541
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2542
    .line 2543
    .line 2544
    move-result-object v0

    .line 2545
    move-object v15, v8

    .line 2546
    const/4 v14, 0x0

    .line 2547
    :goto_30
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2548
    .line 2549
    .line 2550
    move-result v18

    .line 2551
    if-eqz v18, :cond_57

    .line 2552
    .line 2553
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2554
    .line 2555
    .line 2556
    move-result-object v18

    .line 2557
    move-object/from16 p1, v0

    .line 2558
    .line 2559
    move-object/from16 v0, v18

    .line 2560
    .line 2561
    check-cast v0, Ljava/lang/String;

    .line 2562
    .line 2563
    move-object/from16 p2, v8

    .line 2564
    .line 2565
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2566
    .line 2567
    .line 2568
    move-result-object v8

    .line 2569
    invoke-static {v15, v0, v8}, Lbe/h;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2570
    .line 2571
    .line 2572
    move-result-object v0

    .line 2573
    invoke-static {v0, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2574
    .line 2575
    .line 2576
    move-result v8

    .line 2577
    if-nez v8, :cond_56

    .line 2578
    .line 2579
    move-object v15, v0

    .line 2580
    const/4 v14, 0x1

    .line 2581
    :cond_56
    move-object/from16 v0, p1

    .line 2582
    .line 2583
    move-object/from16 v8, p2

    .line 2584
    .line 2585
    goto :goto_30

    .line 2586
    :cond_57
    move-object/from16 p2, v8

    .line 2587
    .line 2588
    const-string v0, "feedesc"

    .line 2589
    .line 2590
    invoke-static {v15, v0, v1}, Lbe/h;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2591
    .line 2592
    .line 2593
    move-result-object v0

    .line 2594
    invoke-static {v0, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2595
    .line 2596
    .line 2597
    move-result v8

    .line 2598
    if-nez v8, :cond_58

    .line 2599
    .line 2600
    move-object v15, v0

    .line 2601
    const/4 v14, 0x1

    .line 2602
    :cond_58
    const-string v0, "payerdes"

    .line 2603
    .line 2604
    const-string v8, "receiverdes"

    .line 2605
    .line 2606
    const-string v11, "desc"

    .line 2607
    .line 2608
    filled-new-array {v10, v11, v0, v8}, [Ljava/lang/String;

    .line 2609
    .line 2610
    .line 2611
    move-result-object v0

    .line 2612
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 2613
    .line 2614
    .line 2615
    move-result-object v0

    .line 2616
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2617
    .line 2618
    .line 2619
    move-result-object v0

    .line 2620
    :goto_31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2621
    .line 2622
    .line 2623
    move-result v8

    .line 2624
    if-eqz v8, :cond_5d

    .line 2625
    .line 2626
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2627
    .line 2628
    .line 2629
    move-result-object v8

    .line 2630
    check-cast v8, Ljava/lang/String;

    .line 2631
    .line 2632
    invoke-static {v15, v8}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2633
    .line 2634
    .line 2635
    move-result-object v11

    .line 2636
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2637
    .line 2638
    .line 2639
    move-result v12

    .line 2640
    if-nez v12, :cond_5b

    .line 2641
    .line 2642
    invoke-static {v11}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2643
    .line 2644
    .line 2645
    move-result-object v12

    .line 2646
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2647
    .line 2648
    .line 2649
    move-result-object v12

    .line 2650
    move-object/from16 p1, v0

    .line 2651
    .line 2652
    const-string v0, ","

    .line 2653
    .line 2654
    move/from16 v18, v14

    .line 2655
    .line 2656
    const-string v14, ""

    .line 2657
    .line 2658
    move-object/from16 v19, v5

    .line 2659
    .line 2660
    const/4 v5, 0x0

    .line 2661
    invoke-static {v12, v0, v14, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 2662
    .line 2663
    .line 2664
    move-result-object v0

    .line 2665
    invoke-static {v11, v13, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2666
    .line 2667
    .line 2668
    move-result v12

    .line 2669
    if-nez v12, :cond_59

    .line 2670
    .line 2671
    const-string v12, "\u00a5"

    .line 2672
    .line 2673
    invoke-static {v11, v12, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2674
    .line 2675
    .line 2676
    move-result v12

    .line 2677
    if-nez v12, :cond_59

    .line 2678
    .line 2679
    const-string v12, "\u5143"

    .line 2680
    .line 2681
    invoke-static {v11, v12, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2682
    .line 2683
    .line 2684
    move-result v11

    .line 2685
    if-nez v11, :cond_59

    .line 2686
    .line 2687
    const-string v5, "[0-9]+(?:\\.[0-9]{1,2})?"

    .line 2688
    .line 2689
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 2690
    .line 2691
    .line 2692
    move-result-object v5

    .line 2693
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2694
    .line 2695
    .line 2696
    invoke-virtual {v5, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2697
    .line 2698
    .line 2699
    move-result-object v0

    .line 2700
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 2701
    .line 2702
    .line 2703
    move-result v0

    .line 2704
    if-eqz v0, :cond_5c

    .line 2705
    .line 2706
    :cond_59
    invoke-static {v15, v8, v1}, Lbe/h;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2707
    .line 2708
    .line 2709
    move-result-object v0

    .line 2710
    invoke-static {v0, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2711
    .line 2712
    .line 2713
    move-result v5

    .line 2714
    if-nez v5, :cond_5a

    .line 2715
    .line 2716
    move-object v15, v0

    .line 2717
    const/4 v14, 0x1

    .line 2718
    goto :goto_32

    .line 2719
    :cond_5a
    move/from16 v14, v18

    .line 2720
    .line 2721
    :goto_32
    move-object/from16 v0, p1

    .line 2722
    .line 2723
    :goto_33
    move-object/from16 v5, v19

    .line 2724
    .line 2725
    goto :goto_31

    .line 2726
    :cond_5b
    move-object/from16 p1, v0

    .line 2727
    .line 2728
    move-object/from16 v19, v5

    .line 2729
    .line 2730
    move/from16 v18, v14

    .line 2731
    .line 2732
    :cond_5c
    move-object/from16 v0, p1

    .line 2733
    .line 2734
    move/from16 v14, v18

    .line 2735
    .line 2736
    goto :goto_33

    .line 2737
    :cond_5d
    move-object/from16 v19, v5

    .line 2738
    .line 2739
    move/from16 v18, v14

    .line 2740
    .line 2741
    if-eqz v18, :cond_5e

    .line 2742
    .line 2743
    move-object v1, v15

    .line 2744
    goto :goto_34

    .line 2745
    :cond_5e
    move-object/from16 v1, p2

    .line 2746
    .line 2747
    goto :goto_34

    .line 2748
    :cond_5f
    move-object/from16 v19, v5

    .line 2749
    .line 2750
    move-object/from16 v1, v17

    .line 2751
    .line 2752
    :goto_34
    if-eqz v1, :cond_60

    .line 2753
    .line 2754
    goto :goto_35

    .line 2755
    :cond_60
    new-instance v1, Lf9/g;

    .line 2756
    .line 2757
    invoke-direct {v1}, Lf9/g;-><init>()V

    .line 2758
    .line 2759
    .line 2760
    goto/16 :goto_3a

    .line 2761
    .line 2762
    :cond_61
    move-object/from16 v19, v5

    .line 2763
    .line 2764
    invoke-virtual {v6}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 2765
    .line 2766
    .line 2767
    move-result v0

    .line 2768
    if-eqz v0, :cond_62

    .line 2769
    .line 2770
    invoke-virtual {v6}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2771
    .line 2772
    .line 2773
    move-result-object v0

    .line 2774
    invoke-static {v0, v1, v2}, Lbe/h;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2775
    .line 2776
    .line 2777
    move-result-object v1

    .line 2778
    :cond_62
    :goto_35
    invoke-static {v6, v1}, Lbe/h;->j0(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 2779
    .line 2780
    .line 2781
    move-result-object v0

    .line 2782
    invoke-static {v6, v0, v4}, Lbe/h;->f0(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;Ljava/lang/Object;)Lf9/f;

    .line 2783
    .line 2784
    .line 2785
    move-result-object v1

    .line 2786
    iget-boolean v4, v1, Lf9/f;->a:Z

    .line 2787
    .line 2788
    if-eqz v4, :cond_69

    .line 2789
    .line 2790
    invoke-virtual {v6}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 2791
    .line 2792
    .line 2793
    move-result v5

    .line 2794
    if-eqz v5, :cond_69

    .line 2795
    .line 2796
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2797
    .line 2798
    .line 2799
    move-result v5

    .line 2800
    if-nez v5, :cond_69

    .line 2801
    .line 2802
    invoke-virtual {v6}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2803
    .line 2804
    .line 2805
    move-result-object v5

    .line 2806
    invoke-static {v5}, Lbe/h;->o0(Ljava/lang/String;)Ljava/lang/String;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v8

    .line 2810
    const-string v11, "svrid"

    .line 2811
    .line 2812
    invoke-static {v8, v11}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2813
    .line 2814
    .line 2815
    move-result-object v8

    .line 2816
    invoke-static {v5, v11}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2817
    .line 2818
    .line 2819
    move-result-object v5

    .line 2820
    filled-new-array {v8, v5}, [Ljava/lang/String;

    .line 2821
    .line 2822
    .line 2823
    move-result-object v5

    .line 2824
    invoke-static {v5}, Lbe/h;->x([Ljava/lang/String;)Ljava/lang/String;

    .line 2825
    .line 2826
    .line 2827
    move-result-object v5

    .line 2828
    invoke-static {v5}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 2829
    .line 2830
    .line 2831
    move-result-object v5

    .line 2832
    const-wide/16 v11, 0x0

    .line 2833
    .line 2834
    if-eqz v5, :cond_63

    .line 2835
    .line 2836
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 2837
    .line 2838
    .line 2839
    move-result-wide v13

    .line 2840
    goto :goto_36

    .line 2841
    :cond_63
    move-wide v13, v11

    .line 2842
    :goto_36
    cmp-long v5, v13, v11

    .line 2843
    .line 2844
    if-gtz v5, :cond_64

    .line 2845
    .line 2846
    goto :goto_38

    .line 2847
    :cond_64
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 2848
    .line 2849
    .line 2850
    move-result-object v5

    .line 2851
    if-eqz v5, :cond_69

    .line 2852
    .line 2853
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->m()Lk8/s;

    .line 2854
    .line 2855
    .line 2856
    move-result-object v5

    .line 2857
    if-eqz v5, :cond_69

    .line 2858
    .line 2859
    iget-object v8, v6, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 2860
    .line 2861
    invoke-virtual {v5, v13, v14, v8}, Lk8/s;->e(JLjava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2862
    .line 2863
    .line 2864
    move-result-object v8

    .line 2865
    if-eqz v8, :cond_65

    .line 2866
    .line 2867
    goto :goto_37

    .line 2868
    :cond_65
    invoke-virtual {v5, v13, v14}, Lk8/s;->d(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2869
    .line 2870
    .line 2871
    move-result-object v8

    .line 2872
    if-eqz v8, :cond_69

    .line 2873
    .line 2874
    :goto_37
    invoke-static {v8}, Lbe/h;->C(Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 2875
    .line 2876
    .line 2877
    move-result v5

    .line 2878
    if-nez v5, :cond_66

    .line 2879
    .line 2880
    goto :goto_38

    .line 2881
    :cond_66
    invoke-static {v3, v7}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 2882
    .line 2883
    .line 2884
    move-result-object v3

    .line 2885
    iget-wide v11, v8, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 2886
    .line 2887
    invoke-static {v11, v12}, Lbe/h;->l(J)Ljava/lang/String;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v5

    .line 2891
    invoke-interface {v3, v5}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 2892
    .line 2893
    .line 2894
    move-result v7

    .line 2895
    if-nez v7, :cond_67

    .line 2896
    .line 2897
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2898
    .line 2899
    .line 2900
    move-result-object v3

    .line 2901
    iget-object v7, v8, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 2902
    .line 2903
    invoke-interface {v3, v5, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2904
    .line 2905
    .line 2906
    move-result-object v3

    .line 2907
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2908
    .line 2909
    .line 2910
    :cond_67
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 2911
    .line 2912
    .line 2913
    move-result v3

    .line 2914
    if-eqz v3, :cond_68

    .line 2915
    .line 2916
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2917
    .line 2918
    .line 2919
    move-result-object v3

    .line 2920
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2921
    .line 2922
    .line 2923
    move-result-object v5

    .line 2924
    invoke-static {v5, v10}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2925
    .line 2926
    .line 2927
    move-result-object v5

    .line 2928
    invoke-static {v3, v5, v2}, Lbe/h;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2929
    .line 2930
    .line 2931
    move-result-object v2

    .line 2932
    :cond_68
    invoke-static {v8, v2}, Lbe/h;->j0(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 2933
    .line 2934
    .line 2935
    move-result-object v2

    .line 2936
    move-object/from16 v3, v17

    .line 2937
    .line 2938
    invoke-static {v8, v2, v3}, Lbe/h;->f0(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;Ljava/lang/Object;)Lf9/f;

    .line 2939
    .line 2940
    .line 2941
    :cond_69
    :goto_38
    if-eqz v4, :cond_6a

    .line 2942
    .line 2943
    invoke-static {v6, v0}, Lbe/h;->a0(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)V

    .line 2944
    .line 2945
    .line 2946
    :cond_6a
    new-instance v2, Lf9/g;

    .line 2947
    .line 2948
    iget-boolean v13, v1, Lf9/f;->a:Z

    .line 2949
    .line 2950
    if-eqz v13, :cond_6b

    .line 2951
    .line 2952
    iget-boolean v1, v1, Lf9/f;->b:Z

    .line 2953
    .line 2954
    if-nez v1, :cond_6b

    .line 2955
    .line 2956
    const/4 v14, 0x1

    .line 2957
    goto :goto_39

    .line 2958
    :cond_6b
    const/4 v14, 0x0

    .line 2959
    :goto_39
    iget-wide v7, v6, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 2960
    .line 2961
    invoke-virtual {v6}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 2962
    .line 2963
    .line 2964
    move-result v15

    .line 2965
    invoke-static {v6, v9}, Lbe/h;->s(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 2966
    .line 2967
    .line 2968
    move-result-object v11

    .line 2969
    invoke-static {v6, v0}, Lbe/h;->s(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 2970
    .line 2971
    .line 2972
    move-result-object v12

    .line 2973
    move-object v10, v0

    .line 2974
    move-object v6, v2

    .line 2975
    invoke-direct/range {v6 .. v15}, Lf9/g;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 2976
    .line 2977
    .line 2978
    move-object v1, v6

    .line 2979
    goto :goto_3a

    .line 2980
    :cond_6c
    move-object/from16 v19, v5

    .line 2981
    .line 2982
    new-instance v1, Lf9/g;

    .line 2983
    .line 2984
    invoke-direct {v1}, Lf9/g;-><init>()V

    .line 2985
    .line 2986
    .line 2987
    :goto_3a
    iget-boolean v0, v1, Lf9/g;->a:Z

    .line 2988
    .line 2989
    if-nez v0, :cond_6d

    .line 2990
    .line 2991
    const-string v1, "\u4fee\u6539\u5931\u8d25"

    .line 2992
    .line 2993
    :goto_3b
    move-object/from16 v5, v19

    .line 2994
    .line 2995
    goto :goto_3c

    .line 2996
    :cond_6d
    iget-boolean v1, v1, Lf9/g;->b:Z

    .line 2997
    .line 2998
    if-eqz v1, :cond_6e

    .line 2999
    .line 3000
    const-string v1, "\u5df2\u4fee\u6539\uff0c\u9000\u51fa\u91cd\u8fdb\u804a\u5929\u540e\u751f\u6548"

    .line 3001
    .line 3002
    goto :goto_3b

    .line 3003
    :cond_6e
    const-string v1, "\u5df2\u4fee\u6539"

    .line 3004
    .line 3005
    goto :goto_3b

    .line 3006
    :goto_3c
    invoke-static {v5, v1}, Lf9/e;->d(Landroid/app/Activity;Ljava/lang/String;)V

    .line 3007
    .line 3008
    .line 3009
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 3010
    .line 3011
    .line 3012
    move-result-object v0

    .line 3013
    return-object v0

    .line 3014
    :pswitch_1b
    check-cast v3, Ly0/o;

    .line 3015
    .line 3016
    check-cast v5, Li0/a1;

    .line 3017
    .line 3018
    check-cast v8, Ls0/d;

    .line 3019
    .line 3020
    check-cast v9, Ld0/c;

    .line 3021
    .line 3022
    move-object/from16 v0, p1

    .line 3023
    .line 3024
    check-cast v0, Li0/h0;

    .line 3025
    .line 3026
    move-object/from16 v1, p2

    .line 3027
    .line 3028
    check-cast v1, Ljava/lang/Integer;

    .line 3029
    .line 3030
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 3031
    .line 3032
    .line 3033
    move-result v1

    .line 3034
    and-int/lit8 v4, v1, 0x3

    .line 3035
    .line 3036
    if-eq v4, v2, :cond_6f

    .line 3037
    .line 3038
    const/4 v2, 0x1

    .line 3039
    :goto_3d
    const/16 v22, 0x1

    .line 3040
    .line 3041
    goto :goto_3e

    .line 3042
    :cond_6f
    const/4 v2, 0x0

    .line 3043
    goto :goto_3d

    .line 3044
    :goto_3e
    and-int/lit8 v1, v1, 0x1

    .line 3045
    .line 3046
    invoke-virtual {v0, v1, v2}, Li0/h0;->S(IZ)Z

    .line 3047
    .line 3048
    .line 3049
    move-result v1

    .line 3050
    if-eqz v1, :cond_73

    .line 3051
    .line 3052
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 3053
    .line 3054
    .line 3055
    move-result-object v1

    .line 3056
    if-ne v1, v13, :cond_70

    .line 3057
    .line 3058
    new-instance v1, Lb0/l;

    .line 3059
    .line 3060
    const/4 v2, 0x7

    .line 3061
    invoke-direct {v1, v5, v2}, Lb0/l;-><init>(Li0/a1;I)V

    .line 3062
    .line 3063
    .line 3064
    invoke-virtual {v0, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 3065
    .line 3066
    .line 3067
    :cond_70
    check-cast v1, Lfg/l;

    .line 3068
    .line 3069
    invoke-static {v3, v1}, Lv1/w;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 3070
    .line 3071
    .line 3072
    move-result-object v1

    .line 3073
    sget-object v2, Ly0/b;->g:Ly0/g;

    .line 3074
    .line 3075
    const/4 v10, 0x1

    .line 3076
    invoke-static {v2, v10}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 3077
    .line 3078
    .line 3079
    move-result-object v2

    .line 3080
    iget-wide v3, v0, Li0/h0;->T:J

    .line 3081
    .line 3082
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 3083
    .line 3084
    .line 3085
    move-result v3

    .line 3086
    invoke-virtual {v0}, Li0/h0;->l()Ls0/h;

    .line 3087
    .line 3088
    .line 3089
    move-result-object v4

    .line 3090
    invoke-static {v0, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 3091
    .line 3092
    .line 3093
    move-result-object v1

    .line 3094
    sget-object v6, Lx1/g;->f:Lx1/f;

    .line 3095
    .line 3096
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3097
    .line 3098
    .line 3099
    sget-object v6, Lx1/f;->b:Lx1/y;

    .line 3100
    .line 3101
    invoke-virtual {v0}, Li0/h0;->d0()V

    .line 3102
    .line 3103
    .line 3104
    iget-boolean v7, v0, Li0/h0;->S:Z

    .line 3105
    .line 3106
    if-eqz v7, :cond_71

    .line 3107
    .line 3108
    invoke-virtual {v0, v6}, Li0/h0;->k(Lfg/a;)V

    .line 3109
    .line 3110
    .line 3111
    goto :goto_3f

    .line 3112
    :cond_71
    invoke-virtual {v0}, Li0/h0;->n0()V

    .line 3113
    .line 3114
    .line 3115
    :goto_3f
    sget-object v6, Lx1/f;->e:Lx1/e;

    .line 3116
    .line 3117
    invoke-static {v6, v0, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 3118
    .line 3119
    .line 3120
    sget-object v2, Lx1/f;->d:Lx1/e;

    .line 3121
    .line 3122
    invoke-static {v2, v0, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 3123
    .line 3124
    .line 3125
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3126
    .line 3127
    .line 3128
    move-result-object v2

    .line 3129
    sget-object v3, Lx1/f;->f:Lx1/e;

    .line 3130
    .line 3131
    invoke-static {v3, v0, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 3132
    .line 3133
    .line 3134
    sget-object v2, Lx1/f;->g:Lx1/d;

    .line 3135
    .line 3136
    invoke-static {v2, v0}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 3137
    .line 3138
    .line 3139
    sget-object v2, Lx1/f;->c:Lx1/e;

    .line 3140
    .line 3141
    invoke-static {v2, v0, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 3142
    .line 3143
    .line 3144
    const/16 v16, 0x0

    .line 3145
    .line 3146
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3147
    .line 3148
    .line 3149
    move-result-object v1

    .line 3150
    invoke-virtual {v8, v0, v1}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3151
    .line 3152
    .line 3153
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 3154
    .line 3155
    .line 3156
    move-result-object v1

    .line 3157
    if-ne v1, v13, :cond_72

    .line 3158
    .line 3159
    new-instance v1, Lb0/j;

    .line 3160
    .line 3161
    const/16 v4, 0xa

    .line 3162
    .line 3163
    invoke-direct {v1, v5, v4}, Lb0/j;-><init>(Li0/a1;I)V

    .line 3164
    .line 3165
    .line 3166
    invoke-virtual {v0, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 3167
    .line 3168
    .line 3169
    :cond_72
    check-cast v1, Lfg/a;

    .line 3170
    .line 3171
    invoke-virtual {v9, v1, v0, v12}, Ld0/c;->b(Lfg/a;Li0/h0;I)V

    .line 3172
    .line 3173
    .line 3174
    const/4 v10, 0x1

    .line 3175
    invoke-virtual {v0, v10}, Li0/h0;->p(Z)V

    .line 3176
    .line 3177
    .line 3178
    goto :goto_40

    .line 3179
    :cond_73
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 3180
    .line 3181
    .line 3182
    :goto_40
    return-object v14

    .line 3183
    :pswitch_1c
    move/from16 v16, v15

    .line 3184
    .line 3185
    check-cast v3, Lc9/a1;

    .line 3186
    .line 3187
    move-object/from16 v25, v5

    .line 3188
    .line 3189
    check-cast v25, Landroid/app/Activity;

    .line 3190
    .line 3191
    move-object/from16 v26, v8

    .line 3192
    .line 3193
    check-cast v26, Ls0/d;

    .line 3194
    .line 3195
    move-object/from16 v27, v9

    .line 3196
    .line 3197
    check-cast v27, Lc9/p0;

    .line 3198
    .line 3199
    move-object/from16 v0, p1

    .line 3200
    .line 3201
    check-cast v0, Li0/h0;

    .line 3202
    .line 3203
    move-object/from16 v1, p2

    .line 3204
    .line 3205
    check-cast v1, Ljava/lang/Integer;

    .line 3206
    .line 3207
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 3208
    .line 3209
    .line 3210
    move-result v1

    .line 3211
    and-int/lit8 v4, v1, 0x3

    .line 3212
    .line 3213
    if-eq v4, v2, :cond_74

    .line 3214
    .line 3215
    const/4 v15, 0x1

    .line 3216
    :goto_41
    const/16 v22, 0x1

    .line 3217
    .line 3218
    goto :goto_42

    .line 3219
    :cond_74
    move/from16 v15, v16

    .line 3220
    .line 3221
    goto :goto_41

    .line 3222
    :goto_42
    and-int/lit8 v1, v1, 0x1

    .line 3223
    .line 3224
    invoke-virtual {v0, v1, v15}, Li0/h0;->S(IZ)Z

    .line 3225
    .line 3226
    .line 3227
    move-result v1

    .line 3228
    if-eqz v1, :cond_75

    .line 3229
    .line 3230
    sget-object v1, Ls3/b;->a:Li0/u;

    .line 3231
    .line 3232
    invoke-virtual {v1, v3}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 3233
    .line 3234
    .line 3235
    move-result-object v1

    .line 3236
    new-instance v23, Lb0/k;

    .line 3237
    .line 3238
    const/16 v24, 0x1

    .line 3239
    .line 3240
    const/16 v28, 0x0

    .line 3241
    .line 3242
    invoke-direct/range {v23 .. v28}, Lb0/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 3243
    .line 3244
    .line 3245
    move-object/from16 v2, v23

    .line 3246
    .line 3247
    const v3, -0xc150b3a

    .line 3248
    .line 3249
    .line 3250
    invoke-static {v3, v2, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 3251
    .line 3252
    .line 3253
    move-result-object v2

    .line 3254
    invoke-static {v1, v2, v0, v10}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 3255
    .line 3256
    .line 3257
    goto :goto_43

    .line 3258
    :cond_75
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 3259
    .line 3260
    .line 3261
    :goto_43
    return-object v14

    .line 3262
    nop

    .line 3263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
