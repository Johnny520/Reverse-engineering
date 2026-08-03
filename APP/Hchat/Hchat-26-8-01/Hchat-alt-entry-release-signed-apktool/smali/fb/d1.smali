.class public final Lfb/d1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:J

.field public final e:Ljava/util/List;

.field public final f:Lfb/y;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:I

.field public final l:Z

.field public final m:Z

.field public final n:J

.field public final o:Lfb/c1;

.field public final p:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Lfb/y;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 24

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x40

    .line 64
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v12, v2

    goto :goto_0

    :cond_0
    move-object/from16 v12, p9

    :goto_0
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_1

    move-object v14, v2

    goto :goto_1

    :cond_1
    move-object/from16 v14, p10

    :goto_1
    const/16 v18, 0x0

    const-wide/16 v22, 0x0

    const-string v13, ""

    const-string v15, ""

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v21, 0x0

    move-wide/from16 v19, p5

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-wide/from16 v6, p3

    move-wide/from16 v8, p5

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    invoke-direct/range {v3 .. v23}, Lfb/d1;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Lfb/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZJLfb/c1;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Lfb/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZJLfb/c1;J)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lfb/d1;->a:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p2, p0, Lfb/d1;->b:Ljava/lang/String;

    .line 28
    .line 29
    iput-wide p3, p0, Lfb/d1;->c:J

    .line 30
    .line 31
    iput-wide p5, p0, Lfb/d1;->d:J

    .line 32
    .line 33
    iput-object p7, p0, Lfb/d1;->e:Ljava/util/List;

    .line 34
    .line 35
    iput-object p8, p0, Lfb/d1;->f:Lfb/y;

    .line 36
    .line 37
    iput-object p9, p0, Lfb/d1;->g:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p10, p0, Lfb/d1;->h:Ljava/lang/String;

    .line 40
    .line 41
    iput-object p11, p0, Lfb/d1;->i:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p12, p0, Lfb/d1;->j:Ljava/lang/String;

    .line 44
    .line 45
    iput p13, p0, Lfb/d1;->k:I

    .line 46
    .line 47
    iput-boolean p14, p0, Lfb/d1;->l:Z

    .line 48
    .line 49
    iput-boolean p15, p0, Lfb/d1;->m:Z

    .line 50
    .line 51
    move-wide/from16 p1, p16

    .line 52
    .line 53
    iput-wide p1, p0, Lfb/d1;->n:J

    .line 54
    .line 55
    move-object/from16 p1, p18

    .line 56
    .line 57
    iput-object p1, p0, Lfb/d1;->o:Lfb/c1;

    .line 58
    .line 59
    move-wide/from16 p1, p19

    .line 60
    .line 61
    iput-wide p1, p0, Lfb/d1;->p:J

    .line 62
    .line 63
    return-void
.end method

.method public static a(Lfb/d1;Ljava/lang/String;ZZJI)Lfb/d1;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    iget-object v2, v0, Lfb/d1;->a:Ljava/lang/String;

    .line 6
    .line 7
    and-int/lit8 v3, v1, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, Lfb/d1;->b:Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object/from16 v3, p1

    .line 15
    .line 16
    :goto_0
    iget-wide v4, v0, Lfb/d1;->c:J

    .line 17
    .line 18
    move-object v7, v2

    .line 19
    move-object v2, v3

    .line 20
    move-wide v3, v4

    .line 21
    iget-wide v5, v0, Lfb/d1;->d:J

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lfb/d1;->e:Ljava/util/List;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lfb/d1;->f:Lfb/y;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lfb/d1;->g:Ljava/lang/String;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lfb/d1;->h:Ljava/lang/String;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget-object v11, v0, Lfb/d1;->i:Ljava/lang/String;

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lfb/d1;->j:Ljava/lang/String;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    iget v13, v0, Lfb/d1;->k:I

    .line 43
    .line 44
    and-int/lit16 v15, v1, 0x800

    .line 45
    .line 46
    if-eqz v15, :cond_1

    .line 47
    .line 48
    iget-boolean v15, v0, Lfb/d1;->l:Z

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move/from16 v15, p2

    .line 52
    .line 53
    :goto_1
    move-object/from16 p1, v2

    .line 54
    .line 55
    and-int/lit16 v2, v1, 0x1000

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-boolean v2, v0, Lfb/d1;->m:Z

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move/from16 v2, p3

    .line 63
    .line 64
    :goto_2
    and-int/lit16 v1, v1, 0x2000

    .line 65
    .line 66
    move/from16 p2, v2

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    iget-wide v1, v0, Lfb/d1;->n:J

    .line 71
    .line 72
    move-wide/from16 v16, v1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    move-wide/from16 v16, p4

    .line 76
    .line 77
    :goto_3
    iget-object v1, v0, Lfb/d1;->o:Lfb/c1;

    .line 78
    .line 79
    move-object/from16 v18, v1

    .line 80
    .line 81
    iget-wide v1, v0, Lfb/d1;->p:J

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    new-instance v0, Lfb/d1;

    .line 108
    .line 109
    move-wide/from16 v19, v1

    .line 110
    .line 111
    move-object v1, v14

    .line 112
    move v14, v15

    .line 113
    move-object/from16 v2, p1

    .line 114
    .line 115
    move/from16 v15, p2

    .line 116
    .line 117
    invoke-direct/range {v0 .. v20}, Lfb/d1;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Lfb/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZJLfb/c1;J)V

    .line 118
    .line 119
    .line 120
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfb/d1;->a:Ljava/lang/String;

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
    instance-of v1, p1, Lfb/d1;

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
    check-cast p1, Lfb/d1;

    .line 12
    .line 13
    iget-object v1, p0, Lfb/d1;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lfb/d1;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lfb/d1;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lfb/d1;->b:Ljava/lang/String;

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
    iget-wide v3, p0, Lfb/d1;->c:J

    .line 36
    .line 37
    iget-wide v5, p1, Lfb/d1;->c:J

    .line 38
    .line 39
    cmp-long v1, v3, v5

    .line 40
    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-wide v3, p0, Lfb/d1;->d:J

    .line 45
    .line 46
    iget-wide v5, p1, Lfb/d1;->d:J

    .line 47
    .line 48
    cmp-long v1, v3, v5

    .line 49
    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object v1, p0, Lfb/d1;->e:Ljava/util/List;

    .line 54
    .line 55
    iget-object v3, p1, Lfb/d1;->e:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, Lfb/d1;->f:Lfb/y;

    .line 65
    .line 66
    iget-object v3, p1, Lfb/d1;->f:Lfb/y;

    .line 67
    .line 68
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-object v1, p0, Lfb/d1;->g:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v3, p1, Lfb/d1;->g:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget-object v1, p0, Lfb/d1;->h:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v3, p1, Lfb/d1;->h:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    iget-object v1, p0, Lfb/d1;->i:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v3, p1, Lfb/d1;->i:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_a

    .line 106
    .line 107
    return v2

    .line 108
    :cond_a
    iget-object v1, p0, Lfb/d1;->j:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v3, p1, Lfb/d1;->j:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_b

    .line 117
    .line 118
    return v2

    .line 119
    :cond_b
    iget v1, p0, Lfb/d1;->k:I

    .line 120
    .line 121
    iget v3, p1, Lfb/d1;->k:I

    .line 122
    .line 123
    if-eq v1, v3, :cond_c

    .line 124
    .line 125
    return v2

    .line 126
    :cond_c
    iget-boolean v1, p0, Lfb/d1;->l:Z

    .line 127
    .line 128
    iget-boolean v3, p1, Lfb/d1;->l:Z

    .line 129
    .line 130
    if-eq v1, v3, :cond_d

    .line 131
    .line 132
    return v2

    .line 133
    :cond_d
    iget-boolean v1, p0, Lfb/d1;->m:Z

    .line 134
    .line 135
    iget-boolean v3, p1, Lfb/d1;->m:Z

    .line 136
    .line 137
    if-eq v1, v3, :cond_e

    .line 138
    .line 139
    return v2

    .line 140
    :cond_e
    iget-wide v3, p0, Lfb/d1;->n:J

    .line 141
    .line 142
    iget-wide v5, p1, Lfb/d1;->n:J

    .line 143
    .line 144
    cmp-long v1, v3, v5

    .line 145
    .line 146
    if-eqz v1, :cond_f

    .line 147
    .line 148
    return v2

    .line 149
    :cond_f
    iget-object v1, p0, Lfb/d1;->o:Lfb/c1;

    .line 150
    .line 151
    iget-object v3, p1, Lfb/d1;->o:Lfb/c1;

    .line 152
    .line 153
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_10

    .line 158
    .line 159
    return v2

    .line 160
    :cond_10
    iget-wide v3, p0, Lfb/d1;->p:J

    .line 161
    .line 162
    iget-wide v5, p1, Lfb/d1;->p:J

    .line 163
    .line 164
    cmp-long p1, v3, v5

    .line 165
    .line 166
    if-eqz p1, :cond_11

    .line 167
    .line 168
    return v2

    .line 169
    :cond_11
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lfb/d1;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lfb/d1;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lfb/d1;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, Lfb/d1;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lfb/d1;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lj8/b;->e(Ljava/util/List;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v2, 0x0

    .line 35
    iget-object v3, p0, Lfb/d1;->f:Lfb/y;

    .line 36
    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    move v3, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v3}, Lfb/y;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    :goto_0
    add-int/2addr v0, v3

    .line 46
    mul-int/2addr v0, v1

    .line 47
    iget-object v3, p0, Lfb/d1;->g:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-object v3, p0, Lfb/d1;->h:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v3, p0, Lfb/d1;->i:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object v3, p0, Lfb/d1;->j:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget v3, p0, Lfb/d1;->k:I

    .line 72
    .line 73
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-boolean v3, p0, Lfb/d1;->l:Z

    .line 78
    .line 79
    invoke-static {v0, v1, v3}, Leh/a;->h(IIZ)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-boolean v3, p0, Lfb/d1;->m:Z

    .line 84
    .line 85
    invoke-static {v0, v1, v3}, Leh/a;->h(IIZ)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget-wide v3, p0, Lfb/d1;->n:J

    .line 90
    .line 91
    invoke-static {v0, v1, v3, v4}, Leh/a;->f(IIJ)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget-object v3, p0, Lfb/d1;->o:Lfb/c1;

    .line 96
    .line 97
    if-nez v3, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {v3}, Lfb/c1;->hashCode()I

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
    iget-wide v1, p0, Lfb/d1;->p:J

    .line 107
    .line 108
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    add-int/2addr v1, v0

    .line 113
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", title="

    .line 2
    .line 3
    const-string v1, ", createdAt="

    .line 4
    .line 5
    const-string v2, "ScriptPluginAgentSession(id="

    .line 6
    .line 7
    iget-object v3, p0, Lfb/d1;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lfb/d1;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lfb/d1;->c:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", updatedAt="

    .line 21
    .line 22
    const-string v2, ", messages="

    .line 23
    .line 24
    iget-wide v3, p0, Lfb/d1;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1, v3, v4, v2}, Lj8/b;->s(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lfb/d1;->e:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", draft="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lfb/d1;->f:Lfb/y;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", targetPluginId="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, ", conversationSummary="

    .line 50
    .line 51
    const-string v2, ", nativeToolHistory="

    .line 52
    .line 53
    iget-object v3, p0, Lfb/d1;->g:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v4, p0, Lfb/d1;->h:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v1, ", protocolTranscript="

    .line 61
    .line 62
    const-string v2, ", compactedMessageCount="

    .line 63
    .line 64
    iget-object v3, p0, Lfb/d1;->i:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v4, p0, Lfb/d1;->j:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget v1, p0, Lfb/d1;->k:I

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, ", pinned="

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-boolean v1, p0, Lfb/d1;->l:Z

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", locked="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-boolean v1, p0, Lfb/d1;->m:Z

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", sortOrder="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-wide v1, p0, Lfb/d1;->n:J

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", resumeState="

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lfb/d1;->o:Lfb/c1;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ", checkpointSeq="

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v1, ")"

    .line 122
    .line 123
    iget-wide v2, p0, Lfb/d1;->p:J

    .line 124
    .line 125
    invoke-static {v0, v2, v3, v1}, Leh/a;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0
.end method
