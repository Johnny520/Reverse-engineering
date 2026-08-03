.class public final Ldb/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:J

.field public final h:I

.field public final i:Ljava/util/Set;

.field public final j:I

.field public final k:I

.field public final l:Z

.field public final m:Ljava/lang/String;

.field public final n:J

.field public final o:I

.field public final p:I

.field public final q:Ljava/lang/String;

.field public final r:I

.field public final s:I

.field public final t:Ljava/util/List;

.field public final u:I

.field public final v:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p22 .. p22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p24 .. p24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ldb/c;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput p2, p0, Ldb/c;->b:I

    .line 22
    .line 23
    iput-object p3, p0, Ldb/c;->c:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p4, p0, Ldb/c;->d:Ljava/util/List;

    .line 26
    .line 27
    iput-object p5, p0, Ldb/c;->e:Ljava/util/List;

    .line 28
    .line 29
    iput-object p6, p0, Ldb/c;->f:Ljava/util/List;

    .line 30
    .line 31
    iput-wide p7, p0, Ldb/c;->g:J

    .line 32
    .line 33
    iput p9, p0, Ldb/c;->h:I

    .line 34
    .line 35
    iput-object p10, p0, Ldb/c;->i:Ljava/util/Set;

    .line 36
    .line 37
    iput p11, p0, Ldb/c;->j:I

    .line 38
    .line 39
    iput p12, p0, Ldb/c;->k:I

    .line 40
    .line 41
    iput-boolean p13, p0, Ldb/c;->l:Z

    .line 42
    .line 43
    iput-object p14, p0, Ldb/c;->m:Ljava/lang/String;

    .line 44
    .line 45
    move-wide p1, p15

    .line 46
    iput-wide p1, p0, Ldb/c;->n:J

    .line 47
    .line 48
    move/from16 p1, p17

    .line 49
    .line 50
    iput p1, p0, Ldb/c;->o:I

    .line 51
    .line 52
    move/from16 p1, p18

    .line 53
    .line 54
    iput p1, p0, Ldb/c;->p:I

    .line 55
    .line 56
    move-object/from16 p1, p19

    .line 57
    .line 58
    iput-object p1, p0, Ldb/c;->q:Ljava/lang/String;

    .line 59
    .line 60
    move/from16 p1, p20

    .line 61
    .line 62
    iput p1, p0, Ldb/c;->r:I

    .line 63
    .line 64
    move/from16 p1, p21

    .line 65
    .line 66
    iput p1, p0, Ldb/c;->s:I

    .line 67
    .line 68
    move-object/from16 p1, p22

    .line 69
    .line 70
    iput-object p1, p0, Ldb/c;->t:Ljava/util/List;

    .line 71
    .line 72
    move/from16 p1, p23

    .line 73
    .line 74
    iput p1, p0, Ldb/c;->u:I

    .line 75
    .line 76
    move-object/from16 p1, p24

    .line 77
    .line 78
    iput-object p1, p0, Ldb/c;->v:Ljava/util/List;

    .line 79
    .line 80
    return-void
.end method

.method public static a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p24

    iget-object v2, v0, Ldb/c;->a:Ljava/lang/String;

    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_0

    iget v3, v0, Ldb/c;->b:I

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_1

    iget-object v4, v0, Ldb/c;->c:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_2

    iget-object v5, v0, Ldb/c;->d:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_3

    iget-object v6, v0, Ldb/c;->e:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_4

    iget-object v7, v0, Ldb/c;->f:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_5

    iget-wide v8, v0, Ldb/c;->g:J

    goto :goto_5

    :cond_5
    move-wide/from16 v8, p6

    :goto_5
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_6

    iget v10, v0, Ldb/c;->h:I

    goto :goto_6

    :cond_6
    move/from16 v10, p8

    :goto_6
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_7

    iget-object v11, v0, Ldb/c;->i:Ljava/util/Set;

    goto :goto_7

    :cond_7
    move-object/from16 v11, p9

    :goto_7
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_8

    iget v12, v0, Ldb/c;->j:I

    goto :goto_8

    :cond_8
    move/from16 v12, p10

    :goto_8
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_9

    iget v13, v0, Ldb/c;->k:I

    goto :goto_9

    :cond_9
    move/from16 v13, p11

    :goto_9
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_a

    iget-boolean v14, v0, Ldb/c;->l:Z

    goto :goto_a

    :cond_a
    move/from16 v14, p12

    :goto_a
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_b

    iget-object v15, v0, Ldb/c;->m:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v15, p13

    :goto_b
    move-object/from16 v16, v2

    and-int/lit16 v2, v1, 0x2000

    move/from16 p1, v3

    if-eqz v2, :cond_c

    iget-wide v2, v0, Ldb/c;->n:J

    goto :goto_c

    :cond_c
    move-wide/from16 v2, p14

    :goto_c
    move-wide/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_d

    iget v2, v0, Ldb/c;->o:I

    goto :goto_d

    :cond_d
    move/from16 v2, p16

    :goto_d
    const v3, 0x8000

    and-int/2addr v3, v1

    if-eqz v3, :cond_e

    iget v3, v0, Ldb/c;->p:I

    goto :goto_e

    :cond_e
    move/from16 v3, p17

    :goto_e
    const/high16 v17, 0x10000

    and-int v17, v1, v17

    if-eqz v17, :cond_f

    iget-object v1, v0, Ldb/c;->q:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p18

    :goto_f
    const/high16 v17, 0x20000

    and-int v17, p24, v17

    move-object/from16 p4, v1

    if-eqz v17, :cond_10

    iget v1, v0, Ldb/c;->r:I

    goto :goto_10

    :cond_10
    move/from16 v1, p19

    :goto_10
    const/high16 v17, 0x40000

    and-int v17, p24, v17

    move/from16 p5, v1

    if-eqz v17, :cond_11

    iget v1, v0, Ldb/c;->s:I

    goto :goto_11

    :cond_11
    move/from16 v1, p20

    :goto_11
    const/high16 v17, 0x80000

    and-int v17, p24, v17

    move/from16 p6, v1

    if-eqz v17, :cond_12

    iget-object v1, v0, Ldb/c;->t:Ljava/util/List;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p21

    :goto_12
    const/high16 v17, 0x100000

    and-int v17, p24, v17

    move-object/from16 p7, v1

    if-eqz v17, :cond_13

    iget v1, v0, Ldb/c;->u:I

    goto :goto_13

    :cond_13
    move/from16 v1, p22

    :goto_13
    const/high16 v17, 0x200000

    and-int v17, p24, v17

    move/from16 p8, v1

    if-eqz v17, :cond_14

    iget-object v1, v0, Ldb/c;->v:Ljava/util/List;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p23

    :goto_14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ldb/c;

    move-wide/from16 p15, p2

    move-object/from16 p19, p4

    move/from16 p20, p5

    move/from16 p21, p6

    move-object/from16 p22, p7

    move/from16 p23, p8

    move-object/from16 p0, v0

    move-object/from16 p24, v1

    move/from16 p17, v2

    move/from16 p18, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-wide/from16 p7, v8

    move/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move-object/from16 p14, v15

    move/from16 p2, p1

    move-object/from16 p1, v16

    invoke-direct/range {p0 .. p24}, Ldb/c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Ldb/c;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Ldb/c;

    .line 12
    .line 13
    iget-object v0, p0, Ldb/c;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Ldb/c;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget v0, p0, Ldb/c;->b:I

    .line 26
    .line 27
    iget v1, p1, Ldb/c;->b:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, Ldb/c;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, Ldb/c;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-object v0, p0, Ldb/c;->d:Ljava/util/List;

    .line 46
    .line 47
    iget-object v1, p1, Ldb/c;->d:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget-object v0, p0, Ldb/c;->e:Ljava/util/List;

    .line 58
    .line 59
    iget-object v1, p1, Ldb/c;->e:Ljava/util/List;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_6
    iget-object v0, p0, Ldb/c;->f:Ljava/util/List;

    .line 70
    .line 71
    iget-object v1, p1, Ldb/c;->f:Ljava/util/List;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_7

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_7
    iget-wide v0, p0, Ldb/c;->g:J

    .line 82
    .line 83
    iget-wide v2, p1, Ldb/c;->g:J

    .line 84
    .line 85
    cmp-long v0, v0, v2

    .line 86
    .line 87
    if-eqz v0, :cond_8

    .line 88
    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    :cond_8
    iget v0, p0, Ldb/c;->h:I

    .line 92
    .line 93
    iget v1, p1, Ldb/c;->h:I

    .line 94
    .line 95
    if-eq v0, v1, :cond_9

    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :cond_9
    iget-object v0, p0, Ldb/c;->i:Ljava/util/Set;

    .line 100
    .line 101
    iget-object v1, p1, Ldb/c;->i:Ljava/util/Set;

    .line 102
    .line 103
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_a

    .line 108
    .line 109
    goto/16 :goto_0

    .line 110
    .line 111
    :cond_a
    iget v0, p0, Ldb/c;->j:I

    .line 112
    .line 113
    iget v1, p1, Ldb/c;->j:I

    .line 114
    .line 115
    if-eq v0, v1, :cond_b

    .line 116
    .line 117
    goto/16 :goto_0

    .line 118
    .line 119
    :cond_b
    iget v0, p0, Ldb/c;->k:I

    .line 120
    .line 121
    iget v1, p1, Ldb/c;->k:I

    .line 122
    .line 123
    if-eq v0, v1, :cond_c

    .line 124
    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :cond_c
    iget-boolean v0, p0, Ldb/c;->l:Z

    .line 128
    .line 129
    iget-boolean v1, p1, Ldb/c;->l:Z

    .line 130
    .line 131
    if-eq v0, v1, :cond_d

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_d
    iget-object v0, p0, Ldb/c;->m:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v1, p1, Ldb/c;->m:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_e

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_e
    iget-wide v0, p0, Ldb/c;->n:J

    .line 146
    .line 147
    iget-wide v2, p1, Ldb/c;->n:J

    .line 148
    .line 149
    cmp-long v0, v0, v2

    .line 150
    .line 151
    if-eqz v0, :cond_f

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_f
    iget v0, p0, Ldb/c;->o:I

    .line 155
    .line 156
    iget v1, p1, Ldb/c;->o:I

    .line 157
    .line 158
    if-eq v0, v1, :cond_10

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_10
    iget v0, p0, Ldb/c;->p:I

    .line 162
    .line 163
    iget v1, p1, Ldb/c;->p:I

    .line 164
    .line 165
    if-eq v0, v1, :cond_11

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_11
    iget-object v0, p0, Ldb/c;->q:Ljava/lang/String;

    .line 169
    .line 170
    iget-object v1, p1, Ldb/c;->q:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_12

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_12
    iget v0, p0, Ldb/c;->r:I

    .line 180
    .line 181
    iget v1, p1, Ldb/c;->r:I

    .line 182
    .line 183
    if-eq v0, v1, :cond_13

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_13
    iget v0, p0, Ldb/c;->s:I

    .line 187
    .line 188
    iget v1, p1, Ldb/c;->s:I

    .line 189
    .line 190
    if-eq v0, v1, :cond_14

    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_14
    iget-object v0, p0, Ldb/c;->t:Ljava/util/List;

    .line 194
    .line 195
    iget-object v1, p1, Ldb/c;->t:Ljava/util/List;

    .line 196
    .line 197
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_15

    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_15
    iget v0, p0, Ldb/c;->u:I

    .line 205
    .line 206
    iget v1, p1, Ldb/c;->u:I

    .line 207
    .line 208
    if-eq v0, v1, :cond_16

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_16
    iget-object v0, p0, Ldb/c;->v:Ljava/util/List;

    .line 212
    .line 213
    iget-object p1, p1, Ldb/c;->v:Ljava/util/List;

    .line 214
    .line 215
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-nez p1, :cond_17

    .line 220
    .line 221
    :goto_0
    const/4 p1, 0x0

    .line 222
    return p1

    .line 223
    :cond_17
    :goto_1
    const/4 p1, 0x1

    .line 224
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Ldb/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Ldb/c;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Ldb/c;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Ldb/c;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Ldb/c;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Ldb/c;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, Ldb/c;->g:J

    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, Ldb/c;->h:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Ldb/c;->i:Ljava/util/Set;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/2addr v2, v0

    .line 59
    mul-int/2addr v2, v1

    .line 60
    iget v0, p0, Ldb/c;->j:I

    .line 61
    .line 62
    invoke-static {v0, v2, v1}, Leh/a;->e(III)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget v2, p0, Ldb/c;->k:I

    .line 67
    .line 68
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-boolean v2, p0, Ldb/c;->l:Z

    .line 73
    .line 74
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v2, p0, Ldb/c;->m:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-wide v2, p0, Ldb/c;->n:J

    .line 85
    .line 86
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget v2, p0, Ldb/c;->o:I

    .line 91
    .line 92
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget v2, p0, Ldb/c;->p:I

    .line 97
    .line 98
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object v2, p0, Ldb/c;->q:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget v2, p0, Ldb/c;->r:I

    .line 109
    .line 110
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget v2, p0, Ldb/c;->s:I

    .line 115
    .line 116
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iget-object v2, p0, Ldb/c;->t:Ljava/util/List;

    .line 121
    .line 122
    invoke-static {v2, v0, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    iget v2, p0, Ldb/c;->u:I

    .line 127
    .line 128
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iget-object v1, p0, Ldb/c;->v:Ljava/util/List;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    add-int/2addr v1, v0

    .line 139
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", type="

    .line 2
    .line 3
    const-string v1, ", content="

    .line 4
    .line 5
    iget v2, p0, Ldb/c;->b:I

    .line 6
    .line 7
    const-string v3, "ScheduledTaskItem(id="

    .line 8
    .line 9
    iget-object v4, p0, Ldb/c;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v4, v0, v1}, Leh/a;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Ldb/c;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", contentItems="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Ldb/c;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", mediaPaths="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Ldb/c;->e:Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", targetIds="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Ldb/c;->f:Ljava/util/List;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", planTime="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-wide v1, p0, Ldb/c;->g:J

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", repeatType="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget v1, p0, Ldb/c;->h:I

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", repeatDays="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Ldb/c;->i:Ljava/util/Set;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", intervalSeconds="

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget v1, p0, Ldb/c;->j:I

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", mediaIntervalSeconds="

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget v1, p0, Ldb/c;->k:I

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, ", sendOnTimeout="

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-boolean v1, p0, Ldb/c;->l:Z

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ", status="

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Ldb/c;->m:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, ", lastExecutedTime="

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget-wide v1, p0, Ldb/c;->n:J

    .line 126
    .line 127
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v1, ", lastSuccessCount="

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget v1, p0, Ldb/c;->o:I

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, ", lastFailCount="

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget v1, p0, Ldb/c;->p:I

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v1, ", remark="

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget-object v1, p0, Ldb/c;->q:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v1, ", targetType="

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    iget v1, p0, Ldb/c;->r:I

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v1, ", momentsType="

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    iget v1, p0, Ldb/c;->s:I

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v1, ", items="

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    iget-object v1, p0, Ldb/c;->t:Ljava/util/List;

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v1, ", sendChannel="

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    iget v1, p0, Ldb/c;->u:I

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v1, ", planTimes="

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    iget-object v1, p0, Ldb/c;->v:Ljava/util/List;

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v1, ")"

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    return-object v0
.end method
