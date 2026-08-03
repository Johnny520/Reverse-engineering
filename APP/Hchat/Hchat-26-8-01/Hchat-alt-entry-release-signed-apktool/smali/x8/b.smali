.class public final Lx8/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:I

.field public final h:Ljava/util/Set;

.field public final i:Ljava/util/Set;

.field public final j:Ljava/util/Set;

.field public final k:Ljava/util/Set;

.field public final l:I

.field public final m:I

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:I

.field public final q:J

.field public final r:Z

.field public final s:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;IILjava/lang/String;Ljava/lang/String;IJZLjava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p20 .. p20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lx8/b;->a:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p2, p0, Lx8/b;->b:Ljava/lang/String;

    .line 25
    .line 26
    iput-boolean p3, p0, Lx8/b;->c:Z

    .line 27
    .line 28
    iput-object p4, p0, Lx8/b;->d:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p5, p0, Lx8/b;->e:Ljava/lang/String;

    .line 31
    .line 32
    iput p6, p0, Lx8/b;->f:I

    .line 33
    .line 34
    iput p7, p0, Lx8/b;->g:I

    .line 35
    .line 36
    iput-object p8, p0, Lx8/b;->h:Ljava/util/Set;

    .line 37
    .line 38
    iput-object p9, p0, Lx8/b;->i:Ljava/util/Set;

    .line 39
    .line 40
    iput-object p10, p0, Lx8/b;->j:Ljava/util/Set;

    .line 41
    .line 42
    iput-object p11, p0, Lx8/b;->k:Ljava/util/Set;

    .line 43
    .line 44
    iput p12, p0, Lx8/b;->l:I

    .line 45
    .line 46
    iput p13, p0, Lx8/b;->m:I

    .line 47
    .line 48
    iput-object p14, p0, Lx8/b;->n:Ljava/lang/String;

    .line 49
    .line 50
    iput-object p15, p0, Lx8/b;->o:Ljava/lang/String;

    .line 51
    .line 52
    move/from16 p1, p16

    .line 53
    .line 54
    iput p1, p0, Lx8/b;->p:I

    .line 55
    .line 56
    move-wide/from16 p1, p17

    .line 57
    .line 58
    iput-wide p1, p0, Lx8/b;->q:J

    .line 59
    .line 60
    move/from16 p1, p19

    .line 61
    .line 62
    iput-boolean p1, p0, Lx8/b;->r:Z

    .line 63
    .line 64
    move-object/from16 p1, p20

    .line 65
    .line 66
    iput-object p1, p0, Lx8/b;->s:Ljava/util/List;

    .line 67
    .line 68
    return-void
.end method

.method public static a(Lx8/b;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;IILjava/lang/String;Ljava/lang/String;IJZLjava/util/List;I)Lx8/b;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p20

    iget-object v2, v0, Lx8/b;->a:Ljava/lang/String;

    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_0

    iget-object v3, v0, Lx8/b;->b:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_1

    iget-boolean v4, v0, Lx8/b;->c:Z

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_2

    iget-object v5, v0, Lx8/b;->d:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_3

    iget-object v6, v0, Lx8/b;->e:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_4

    iget v7, v0, Lx8/b;->f:I

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_5

    iget v8, v0, Lx8/b;->g:I

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_6

    iget-object v9, v0, Lx8/b;->h:Ljava/util/Set;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_7

    iget-object v10, v0, Lx8/b;->i:Ljava/util/Set;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_8

    iget-object v11, v0, Lx8/b;->j:Ljava/util/Set;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_9

    iget-object v12, v0, Lx8/b;->k:Ljava/util/Set;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_a

    iget v13, v0, Lx8/b;->l:I

    goto :goto_a

    :cond_a
    move/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_b

    iget v14, v0, Lx8/b;->m:I

    goto :goto_b

    :cond_b
    move/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lx8/b;->n:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move-object/from16 v16, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lx8/b;->o:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p14

    :goto_d
    const v17, 0x8000

    and-int v17, v1, v17

    if-eqz v17, :cond_e

    iget v1, v0, Lx8/b;->p:I

    goto :goto_e

    :cond_e
    move/from16 v1, p15

    :goto_e
    const/high16 v17, 0x10000

    and-int v17, p20, v17

    move/from16 p2, v1

    move-object/from16 p1, v2

    if-eqz v17, :cond_f

    iget-wide v1, v0, Lx8/b;->q:J

    goto :goto_f

    :cond_f
    move-wide/from16 v1, p16

    :goto_f
    const/high16 v17, 0x20000

    and-int v17, p20, v17

    move-wide/from16 p3, v1

    if-eqz v17, :cond_10

    iget-boolean v1, v0, Lx8/b;->r:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p18

    :goto_10
    const/high16 v2, 0x40000

    and-int v2, p20, v2

    if-eqz v2, :cond_11

    iget-object v2, v0, Lx8/b;->s:Ljava/util/List;

    goto :goto_11

    :cond_11
    move-object/from16 v2, p19

    :goto_11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lx8/b;

    move-object/from16 p15, p1

    move/from16 p16, p2

    move-wide/from16 p17, p3

    move-object/from16 p0, v0

    move/from16 p19, v1

    move-object/from16 p20, v2

    move-object/from16 p2, v3

    move/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p1, v16

    invoke-direct/range {p0 .. p20}, Lx8/b;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;IILjava/lang/String;Ljava/lang/String;IJZLjava/util/List;)V

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
    instance-of v0, p1, Lx8/b;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lx8/b;

    .line 12
    .line 13
    iget-object v0, p0, Lx8/b;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Lx8/b;->a:Ljava/lang/String;

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
    iget-object v0, p0, Lx8/b;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, Lx8/b;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-boolean v0, p0, Lx8/b;->c:Z

    .line 38
    .line 39
    iget-boolean v1, p1, Lx8/b;->c:Z

    .line 40
    .line 41
    if-eq v0, v1, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-object v0, p0, Lx8/b;->d:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p1, Lx8/b;->d:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lx8/b;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, p1, Lx8/b;->e:Ljava/lang/String;

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
    iget v0, p0, Lx8/b;->f:I

    .line 70
    .line 71
    iget v1, p1, Lx8/b;->f:I

    .line 72
    .line 73
    if-eq v0, v1, :cond_7

    .line 74
    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :cond_7
    iget v0, p0, Lx8/b;->g:I

    .line 78
    .line 79
    iget v1, p1, Lx8/b;->g:I

    .line 80
    .line 81
    if-eq v0, v1, :cond_8

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :cond_8
    iget-object v0, p0, Lx8/b;->h:Ljava/util/Set;

    .line 86
    .line 87
    iget-object v1, p1, Lx8/b;->h:Ljava/util/Set;

    .line 88
    .line 89
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_9

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_9
    iget-object v0, p0, Lx8/b;->i:Ljava/util/Set;

    .line 98
    .line 99
    iget-object v1, p1, Lx8/b;->i:Ljava/util/Set;

    .line 100
    .line 101
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_a

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_a
    iget-object v0, p0, Lx8/b;->j:Ljava/util/Set;

    .line 109
    .line 110
    iget-object v1, p1, Lx8/b;->j:Ljava/util/Set;

    .line 111
    .line 112
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_b

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_b
    iget-object v0, p0, Lx8/b;->k:Ljava/util/Set;

    .line 120
    .line 121
    iget-object v1, p1, Lx8/b;->k:Ljava/util/Set;

    .line 122
    .line 123
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_c

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_c
    iget v0, p0, Lx8/b;->l:I

    .line 131
    .line 132
    iget v1, p1, Lx8/b;->l:I

    .line 133
    .line 134
    if-eq v0, v1, :cond_d

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_d
    iget v0, p0, Lx8/b;->m:I

    .line 138
    .line 139
    iget v1, p1, Lx8/b;->m:I

    .line 140
    .line 141
    if-eq v0, v1, :cond_e

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_e
    iget-object v0, p0, Lx8/b;->n:Ljava/lang/String;

    .line 145
    .line 146
    iget-object v1, p1, Lx8/b;->n:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_f

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_f
    iget-object v0, p0, Lx8/b;->o:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v1, p1, Lx8/b;->o:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_10

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_10
    iget v0, p0, Lx8/b;->p:I

    .line 167
    .line 168
    iget v1, p1, Lx8/b;->p:I

    .line 169
    .line 170
    if-eq v0, v1, :cond_11

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_11
    iget-wide v0, p0, Lx8/b;->q:J

    .line 174
    .line 175
    iget-wide v2, p1, Lx8/b;->q:J

    .line 176
    .line 177
    cmp-long v0, v0, v2

    .line 178
    .line 179
    if-eqz v0, :cond_12

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_12
    iget-boolean v0, p0, Lx8/b;->r:Z

    .line 183
    .line 184
    iget-boolean v1, p1, Lx8/b;->r:Z

    .line 185
    .line 186
    if-eq v0, v1, :cond_13

    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_13
    iget-object v0, p0, Lx8/b;->s:Ljava/util/List;

    .line 190
    .line 191
    iget-object p1, p1, Lx8/b;->s:Ljava/util/List;

    .line 192
    .line 193
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    if-nez p1, :cond_14

    .line 198
    .line 199
    :goto_0
    const/4 p1, 0x0

    .line 200
    return p1

    .line 201
    :cond_14
    :goto_1
    const/4 p1, 0x1

    .line 202
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lx8/b;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lx8/b;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lx8/b;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lx8/b;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lx8/b;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lx8/b;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lx8/b;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lx8/b;->h:Ljava/util/Set;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-int/2addr v2, v0

    .line 53
    mul-int/2addr v2, v1

    .line 54
    iget-object v0, p0, Lx8/b;->i:Ljava/util/Set;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/2addr v0, v2

    .line 61
    mul-int/2addr v0, v1

    .line 62
    iget-object v2, p0, Lx8/b;->j:Ljava/util/Set;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/2addr v2, v0

    .line 69
    mul-int/2addr v2, v1

    .line 70
    iget-object v0, p0, Lx8/b;->k:Ljava/util/Set;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    add-int/2addr v0, v2

    .line 77
    mul-int/2addr v0, v1

    .line 78
    iget v2, p0, Lx8/b;->l:I

    .line 79
    .line 80
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget v2, p0, Lx8/b;->m:I

    .line 85
    .line 86
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-object v2, p0, Lx8/b;->n:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-object v2, p0, Lx8/b;->o:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget v2, p0, Lx8/b;->p:I

    .line 103
    .line 104
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget-wide v2, p0, Lx8/b;->q:J

    .line 109
    .line 110
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget-boolean v2, p0, Lx8/b;->r:Z

    .line 115
    .line 116
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iget-object v1, p0, Lx8/b;->s:Ljava/util/List;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    add-int/2addr v1, v0

    .line 127
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", name="

    .line 2
    .line 3
    const-string v1, ", enabled="

    .line 4
    .line 5
    const-string v2, "AutoReplyRule(id="

    .line 6
    .line 7
    iget-object v3, p0, Lx8/b;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lx8/b;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v1, p0, Lx8/b;->c:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", keyword="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lx8/b;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", excludedKeywords="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lx8/b;->e:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", matchType="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget v1, p0, Lx8/b;->f:I

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", targetMode="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lx8/b;->g:I

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", targetIds="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lx8/b;->h:Ljava/util/Set;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", excludedIds="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lx8/b;->i:Ljava/util/Set;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", includedGroupMembers="

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Lx8/b;->j:Ljava/util/Set;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", excludedGroupMembers="

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lx8/b;->k:Ljava/util/Set;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, ", atTrigger="

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget v1, p0, Lx8/b;->l:I

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ", patTrigger="

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget v1, p0, Lx8/b;->m:I

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, ", startTime="

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, Lx8/b;->n:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v1, ", endTime="

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, Lx8/b;->o:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, ", maxReplyCount="

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget v1, p0, Lx8/b;->p:I

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v1, ", cooldownSeconds="

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget-wide v1, p0, Lx8/b;->q:J

    .line 156
    .line 157
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v1, ", replyAsQuote="

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    iget-boolean v1, p0, Lx8/b;->r:Z

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v1, ", steps="

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    iget-object v1, p0, Lx8/b;->s:Ljava/util/List;

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v1, ")"

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    return-object v0
.end method
