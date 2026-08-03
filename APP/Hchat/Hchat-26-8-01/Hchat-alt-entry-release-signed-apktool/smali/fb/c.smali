.class public final Lfb/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/util/List;

.field public final k:Ljava/util/List;

.field public final l:Lfb/a1;

.field public final m:J

.field public final n:Ljava/lang/String;

.field public final o:Lfb/y;

.field public final p:Z

.field public final q:Ljava/lang/String;

.field public final r:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lfb/a1;JLjava/lang/String;Lfb/y;ZLjava/lang/String;J)V
    .locals 0

    .line 161
    invoke-static/range {p3 .. p7}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p18 .. p18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    iput-object p1, p0, Lfb/c;->a:Ljava/lang/String;

    .line 165
    iput-object p2, p0, Lfb/c;->b:Ljava/lang/String;

    .line 166
    iput-object p3, p0, Lfb/c;->c:Ljava/lang/String;

    .line 167
    iput-object p4, p0, Lfb/c;->d:Ljava/lang/String;

    .line 168
    iput-object p5, p0, Lfb/c;->e:Ljava/lang/String;

    .line 169
    iput-object p6, p0, Lfb/c;->f:Ljava/lang/String;

    .line 170
    iput-object p7, p0, Lfb/c;->g:Ljava/lang/String;

    .line 171
    iput-object p8, p0, Lfb/c;->h:Ljava/lang/String;

    .line 172
    iput-object p9, p0, Lfb/c;->i:Ljava/lang/String;

    .line 173
    iput-object p10, p0, Lfb/c;->j:Ljava/util/List;

    .line 174
    iput-object p11, p0, Lfb/c;->k:Ljava/util/List;

    .line 175
    iput-object p12, p0, Lfb/c;->l:Lfb/a1;

    .line 176
    iput-wide p13, p0, Lfb/c;->m:J

    .line 177
    iput-object p15, p0, Lfb/c;->n:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 178
    iput-object p1, p0, Lfb/c;->o:Lfb/y;

    move/from16 p1, p17

    .line 179
    iput-boolean p1, p0, Lfb/c;->p:Z

    move-object/from16 p1, p18

    .line 180
    iput-object p1, p0, Lfb/c;->q:Ljava/lang/String;

    move-wide/from16 p1, p19

    .line 181
    iput-wide p1, p0, Lfb/c;->r:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lfb/a1;JLjava/lang/String;Lfb/y;ZLjava/lang/String;JI)V
    .locals 23

    .line 1
    move/from16 v0, p19

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-object v5, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object/from16 v5, p3

    .line 21
    .line 22
    :goto_0
    and-int/lit8 v1, v0, 0x8

    .line 23
    .line 24
    const-string v10, ""

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    move-object v6, v10

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object/from16 v6, p4

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v1, v0, 0x10

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    move-object v7, v10

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move-object/from16 v7, p5

    .line 39
    .line 40
    :goto_2
    and-int/lit8 v1, v0, 0x20

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    move-object/from16 v8, p1

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    move-object/from16 v8, p6

    .line 48
    .line 49
    :goto_3
    and-int/lit8 v1, v0, 0x40

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    move-object v9, v10

    .line 54
    goto :goto_4

    .line 55
    :cond_4
    move-object/from16 v9, p7

    .line 56
    .line 57
    :goto_4
    and-int/lit16 v1, v0, 0x200

    .line 58
    .line 59
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 60
    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    move-object v12, v2

    .line 64
    goto :goto_5

    .line 65
    :cond_5
    move-object/from16 v12, p8

    .line 66
    .line 67
    :goto_5
    and-int/lit16 v1, v0, 0x400

    .line 68
    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    move-object v13, v2

    .line 72
    goto :goto_6

    .line 73
    :cond_6
    move-object/from16 v13, p9

    .line 74
    .line 75
    :goto_6
    and-int/lit16 v1, v0, 0x800

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    if-eqz v1, :cond_7

    .line 79
    .line 80
    move-object v14, v2

    .line 81
    goto :goto_7

    .line 82
    :cond_7
    move-object/from16 v14, p10

    .line 83
    .line 84
    :goto_7
    and-int/lit16 v1, v0, 0x1000

    .line 85
    .line 86
    if-eqz v1, :cond_8

    .line 87
    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    move-wide v15, v3

    .line 93
    goto :goto_8

    .line 94
    :cond_8
    move-wide/from16 v15, p11

    .line 95
    .line 96
    :goto_8
    and-int/lit16 v1, v0, 0x2000

    .line 97
    .line 98
    if-eqz v1, :cond_9

    .line 99
    .line 100
    const-string v1, "complete"

    .line 101
    .line 102
    move-object/from16 v17, v1

    .line 103
    .line 104
    goto :goto_9

    .line 105
    :cond_9
    move-object/from16 v17, p13

    .line 106
    .line 107
    :goto_9
    and-int/lit16 v1, v0, 0x4000

    .line 108
    .line 109
    if-eqz v1, :cond_a

    .line 110
    .line 111
    move-object/from16 v18, v2

    .line 112
    .line 113
    goto :goto_a

    .line 114
    :cond_a
    move-object/from16 v18, p14

    .line 115
    .line 116
    :goto_a
    const v1, 0x8000

    .line 117
    .line 118
    .line 119
    and-int/2addr v1, v0

    .line 120
    if-eqz v1, :cond_b

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    move/from16 v19, v1

    .line 124
    .line 125
    goto :goto_b

    .line 126
    :cond_b
    move/from16 v19, p15

    .line 127
    .line 128
    :goto_b
    const/high16 v1, 0x10000

    .line 129
    .line 130
    and-int/2addr v1, v0

    .line 131
    if-eqz v1, :cond_c

    .line 132
    .line 133
    move-object/from16 v20, v10

    .line 134
    .line 135
    goto :goto_c

    .line 136
    :cond_c
    move-object/from16 v20, p16

    .line 137
    .line 138
    :goto_c
    const/high16 v1, 0x20000

    .line 139
    .line 140
    and-int/2addr v0, v1

    .line 141
    if-eqz v0, :cond_d

    .line 142
    .line 143
    const-wide/16 v0, 0x0

    .line 144
    .line 145
    move-wide/from16 v21, v0

    .line 146
    .line 147
    goto :goto_d

    .line 148
    :cond_d
    move-wide/from16 v21, p17

    .line 149
    .line 150
    :goto_d
    move-object v11, v10

    .line 151
    move-object/from16 v2, p0

    .line 152
    .line 153
    move-object/from16 v3, p1

    .line 154
    .line 155
    move-object/from16 v4, p2

    .line 156
    .line 157
    invoke-direct/range {v2 .. v22}, Lfb/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lfb/a1;JLjava/lang/String;Lfb/y;ZLjava/lang/String;J)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public static a(Lfb/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfb/y;ZLjava/lang/String;JI)Lfb/c;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p16

    .line 4
    .line 5
    iget-object v2, v0, Lfb/c;->a:Ljava/lang/String;

    .line 6
    .line 7
    and-int/lit8 v3, v1, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, Lfb/c;->b:Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object/from16 v3, p1

    .line 15
    .line 16
    :goto_0
    and-int/lit8 v4, v1, 0x4

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    iget-object v4, v0, Lfb/c;->c:Ljava/lang/String;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v4, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v5, v1, 0x8

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    iget-object v5, v0, Lfb/c;->d:Ljava/lang/String;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object/from16 v5, p3

    .line 33
    .line 34
    :goto_2
    and-int/lit8 v6, v1, 0x10

    .line 35
    .line 36
    if-eqz v6, :cond_3

    .line 37
    .line 38
    iget-object v6, v0, Lfb/c;->e:Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move-object/from16 v6, p4

    .line 42
    .line 43
    :goto_3
    and-int/lit8 v7, v1, 0x20

    .line 44
    .line 45
    if-eqz v7, :cond_4

    .line 46
    .line 47
    iget-object v7, v0, Lfb/c;->f:Ljava/lang/String;

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_4
    move-object/from16 v7, p5

    .line 51
    .line 52
    :goto_4
    and-int/lit8 v8, v1, 0x40

    .line 53
    .line 54
    if-eqz v8, :cond_5

    .line 55
    .line 56
    iget-object v8, v0, Lfb/c;->g:Ljava/lang/String;

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_5
    move-object/from16 v8, p6

    .line 60
    .line 61
    :goto_5
    and-int/lit16 v9, v1, 0x80

    .line 62
    .line 63
    if-eqz v9, :cond_6

    .line 64
    .line 65
    iget-object v9, v0, Lfb/c;->h:Ljava/lang/String;

    .line 66
    .line 67
    goto :goto_6

    .line 68
    :cond_6
    move-object/from16 v9, p7

    .line 69
    .line 70
    :goto_6
    and-int/lit16 v10, v1, 0x100

    .line 71
    .line 72
    if-eqz v10, :cond_7

    .line 73
    .line 74
    iget-object v10, v0, Lfb/c;->i:Ljava/lang/String;

    .line 75
    .line 76
    goto :goto_7

    .line 77
    :cond_7
    move-object/from16 v10, p8

    .line 78
    .line 79
    :goto_7
    and-int/lit16 v11, v1, 0x200

    .line 80
    .line 81
    if-eqz v11, :cond_8

    .line 82
    .line 83
    iget-object v11, v0, Lfb/c;->j:Ljava/util/List;

    .line 84
    .line 85
    goto :goto_8

    .line 86
    :cond_8
    move-object/from16 v11, p9

    .line 87
    .line 88
    :goto_8
    iget-object v12, v0, Lfb/c;->k:Ljava/util/List;

    .line 89
    .line 90
    move-object v13, v11

    .line 91
    move-object v11, v12

    .line 92
    iget-object v12, v0, Lfb/c;->l:Lfb/a1;

    .line 93
    .line 94
    move-object v15, v13

    .line 95
    iget-wide v13, v0, Lfb/c;->m:J

    .line 96
    .line 97
    move-object/from16 v16, v2

    .line 98
    .line 99
    and-int/lit16 v2, v1, 0x2000

    .line 100
    .line 101
    if-eqz v2, :cond_9

    .line 102
    .line 103
    iget-object v2, v0, Lfb/c;->n:Ljava/lang/String;

    .line 104
    .line 105
    goto :goto_9

    .line 106
    :cond_9
    move-object/from16 v2, p10

    .line 107
    .line 108
    :goto_9
    move-object/from16 p1, v2

    .line 109
    .line 110
    and-int/lit16 v2, v1, 0x4000

    .line 111
    .line 112
    if-eqz v2, :cond_a

    .line 113
    .line 114
    iget-object v2, v0, Lfb/c;->o:Lfb/y;

    .line 115
    .line 116
    goto :goto_a

    .line 117
    :cond_a
    move-object/from16 v2, p11

    .line 118
    .line 119
    :goto_a
    const v17, 0x8000

    .line 120
    .line 121
    .line 122
    and-int v17, v1, v17

    .line 123
    .line 124
    if-eqz v17, :cond_b

    .line 125
    .line 126
    iget-boolean v1, v0, Lfb/c;->p:Z

    .line 127
    .line 128
    move/from16 v17, v1

    .line 129
    .line 130
    goto :goto_b

    .line 131
    :cond_b
    move/from16 v17, p12

    .line 132
    .line 133
    :goto_b
    const/high16 v1, 0x10000

    .line 134
    .line 135
    and-int v1, p16, v1

    .line 136
    .line 137
    if-eqz v1, :cond_c

    .line 138
    .line 139
    iget-object v1, v0, Lfb/c;->q:Ljava/lang/String;

    .line 140
    .line 141
    move-object/from16 v18, v1

    .line 142
    .line 143
    goto :goto_c

    .line 144
    :cond_c
    move-object/from16 v18, p13

    .line 145
    .line 146
    :goto_c
    const/high16 v1, 0x20000

    .line 147
    .line 148
    and-int v1, p16, v1

    .line 149
    .line 150
    move-object/from16 p2, v2

    .line 151
    .line 152
    if-eqz v1, :cond_d

    .line 153
    .line 154
    iget-wide v1, v0, Lfb/c;->r:J

    .line 155
    .line 156
    move-wide/from16 v19, v1

    .line 157
    .line 158
    goto :goto_d

    .line 159
    :cond_d
    move-wide/from16 v19, p14

    .line 160
    .line 161
    :goto_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-static {v6, v7, v8, v9, v10}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    new-instance v0, Lfb/c;

    .line 192
    .line 193
    move-object v2, v3

    .line 194
    move-object v3, v4

    .line 195
    move-object v4, v5

    .line 196
    move-object v5, v6

    .line 197
    move-object v6, v7

    .line 198
    move-object v7, v8

    .line 199
    move-object v8, v9

    .line 200
    move-object v9, v10

    .line 201
    move-object v10, v15

    .line 202
    move-object/from16 v1, v16

    .line 203
    .line 204
    move-object/from16 v15, p1

    .line 205
    .line 206
    move-object/from16 v16, p2

    .line 207
    .line 208
    invoke-direct/range {v0 .. v20}, Lfb/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lfb/a1;JLjava/lang/String;Lfb/y;ZLjava/lang/String;J)V

    .line 209
    .line 210
    .line 211
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfb/c;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfb/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfb/c;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lfb/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lfb/c;

    .line 12
    .line 13
    iget-object v1, p0, Lfb/c;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lfb/c;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lfb/c;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lfb/c;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lfb/c;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lfb/c;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lfb/c;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lfb/c;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lfb/c;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lfb/c;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lfb/c;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lfb/c;->f:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lfb/c;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lfb/c;->g:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-object v1, p0, Lfb/c;->h:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, Lfb/c;->h:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    iget-object v1, p0, Lfb/c;->i:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v3, p1, Lfb/c;->i:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_a

    .line 110
    .line 111
    return v2

    .line 112
    :cond_a
    iget-object v1, p0, Lfb/c;->j:Ljava/util/List;

    .line 113
    .line 114
    iget-object v3, p1, Lfb/c;->j:Ljava/util/List;

    .line 115
    .line 116
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_b

    .line 121
    .line 122
    return v2

    .line 123
    :cond_b
    iget-object v1, p0, Lfb/c;->k:Ljava/util/List;

    .line 124
    .line 125
    iget-object v3, p1, Lfb/c;->k:Ljava/util/List;

    .line 126
    .line 127
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_c

    .line 132
    .line 133
    return v2

    .line 134
    :cond_c
    iget-object v1, p0, Lfb/c;->l:Lfb/a1;

    .line 135
    .line 136
    iget-object v3, p1, Lfb/c;->l:Lfb/a1;

    .line 137
    .line 138
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_d

    .line 143
    .line 144
    return v2

    .line 145
    :cond_d
    iget-wide v3, p0, Lfb/c;->m:J

    .line 146
    .line 147
    iget-wide v5, p1, Lfb/c;->m:J

    .line 148
    .line 149
    cmp-long v1, v3, v5

    .line 150
    .line 151
    if-eqz v1, :cond_e

    .line 152
    .line 153
    return v2

    .line 154
    :cond_e
    iget-object v1, p0, Lfb/c;->n:Ljava/lang/String;

    .line 155
    .line 156
    iget-object v3, p1, Lfb/c;->n:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-nez v1, :cond_f

    .line 163
    .line 164
    return v2

    .line 165
    :cond_f
    iget-object v1, p0, Lfb/c;->o:Lfb/y;

    .line 166
    .line 167
    iget-object v3, p1, Lfb/c;->o:Lfb/y;

    .line 168
    .line 169
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-nez v1, :cond_10

    .line 174
    .line 175
    return v2

    .line 176
    :cond_10
    iget-boolean v1, p0, Lfb/c;->p:Z

    .line 177
    .line 178
    iget-boolean v3, p1, Lfb/c;->p:Z

    .line 179
    .line 180
    if-eq v1, v3, :cond_11

    .line 181
    .line 182
    return v2

    .line 183
    :cond_11
    iget-object v1, p0, Lfb/c;->q:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v3, p1, Lfb/c;->q:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-nez v1, :cond_12

    .line 192
    .line 193
    return v2

    .line 194
    :cond_12
    iget-wide v3, p0, Lfb/c;->r:J

    .line 195
    .line 196
    iget-wide v5, p1, Lfb/c;->r:J

    .line 197
    .line 198
    cmp-long p1, v3, v5

    .line 199
    .line 200
    if-eqz p1, :cond_13

    .line 201
    .line 202
    return v2

    .line 203
    :cond_13
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lfb/c;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lfb/c;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lfb/c;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lfb/c;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lfb/c;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lfb/c;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lfb/c;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lfb/c;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lfb/c;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, Lfb/c;->j:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, Lfb/c;->k:Ljava/util/List;

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/4 v2, 0x0

    .line 71
    iget-object v3, p0, Lfb/c;->l:Lfb/a1;

    .line 72
    .line 73
    if-nez v3, :cond_0

    .line 74
    .line 75
    move v3, v2

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {v3}, Lfb/a1;->hashCode()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    :goto_0
    add-int/2addr v0, v3

    .line 82
    mul-int/2addr v0, v1

    .line 83
    iget-wide v3, p0, Lfb/c;->m:J

    .line 84
    .line 85
    invoke-static {v0, v1, v3, v4}, Leh/a;->f(IIJ)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget-object v3, p0, Lfb/c;->n:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget-object v3, p0, Lfb/c;->o:Lfb/y;

    .line 96
    .line 97
    if-nez v3, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {v3}, Lfb/y;->hashCode()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    :goto_1
    add-int/2addr v0, v2

    .line 105
    mul-int/2addr v0, v1

    .line 106
    iget-boolean v2, p0, Lfb/c;->p:Z

    .line 107
    .line 108
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-object v2, p0, Lfb/c;->q:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget-wide v1, p0, Lfb/c;->r:J

    .line 119
    .line 120
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    add-int/2addr v1, v0

    .line 125
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", content="

    .line 2
    .line 3
    const-string v1, ", id="

    .line 4
    .line 5
    const-string v2, "ScriptPluginAgentChatMessage(role="

    .line 6
    .line 7
    iget-object v3, p0, Lfb/c;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lfb/c;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", turnId="

    .line 16
    .line 17
    const-string v2, ", parentMessageId="

    .line 18
    .line 19
    iget-object v3, p0, Lfb/c;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lfb/c;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", phase="

    .line 27
    .line 28
    const-string v2, ", progress="

    .line 29
    .line 30
    iget-object v3, p0, Lfb/c;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lfb/c;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", reasoning="

    .line 38
    .line 39
    const-string v2, ", diff="

    .line 40
    .line 41
    iget-object v3, p0, Lfb/c;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, Lfb/c;->h:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lfb/c;->i:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", toolEvents="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lfb/c;->j:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", attachments="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lfb/c;->k:Ljava/util/List;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", quotedMessage="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lfb/c;->l:Lfb/a1;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", createdAt="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-wide v1, p0, Lfb/c;->m:J

    .line 89
    .line 90
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", status="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lfb/c;->n:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", draftSnapshot="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lfb/c;->o:Lfb/y;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", clearsDraft="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-boolean v1, p0, Lfb/c;->p:Z

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ", streamId="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lfb/c;->q:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", completedAt="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v1, ")"

    .line 139
    .line 140
    iget-wide v2, p0, Lfb/c;->r:J

    .line 141
    .line 142
    invoke-static {v0, v2, v3, v1}, Leh/a;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0
.end method
