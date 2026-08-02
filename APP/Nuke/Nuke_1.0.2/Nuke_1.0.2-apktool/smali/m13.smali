.class public final Lm13;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lm13;


# instance fields
.field public final a:Llt2;

.field public final b:Lvw1;

.field public final c:Lw02;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lm13;

    .line 2
    .line 3
    const/4 v12, 0x0

    .line 4
    const v13, 0xffffff

    .line 5
    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-wide/16 v6, 0x0

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const-wide/16 v9, 0x0

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    invoke-direct/range {v0 .. v13}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lm13;->d:Lm13;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(JJLim0;JIJLw02;Lya1;I)V
    .locals 25

    .line 1
    move/from16 v0, p13

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-wide v1, Lju;->g:J

    .line 8
    .line 9
    move-wide v4, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-wide/from16 v4, p1

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v1, v0, 0x2

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    sget-wide v1, Lp13;->c:J

    .line 18
    .line 19
    move-wide v6, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-wide/from16 v6, p3

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v1, v0, 0x4

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move-object/from16 v8, p5

    .line 30
    .line 31
    :goto_2
    and-int/lit8 v1, v0, 0x20

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    const/4 v11, 0x0

    .line 36
    goto :goto_3

    .line 37
    :cond_3
    sget-object v1, Lmx2;->a:Lo50;

    .line 38
    .line 39
    move-object v11, v1

    .line 40
    :goto_3
    and-int/lit16 v1, v0, 0x80

    .line 41
    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    sget-wide v9, Lp13;->c:J

    .line 45
    .line 46
    move-wide v13, v9

    .line 47
    goto :goto_4

    .line 48
    :cond_4
    move-wide/from16 v13, p6

    .line 49
    .line 50
    :goto_4
    sget-wide v18, Lju;->g:J

    .line 51
    .line 52
    const v1, 0x8000

    .line 53
    .line 54
    .line 55
    and-int/2addr v1, v0

    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    goto :goto_5

    .line 60
    :cond_5
    move/from16 v1, p8

    .line 61
    .line 62
    :goto_5
    const/high16 v3, 0x20000

    .line 63
    .line 64
    and-int/2addr v3, v0

    .line 65
    if-eqz v3, :cond_6

    .line 66
    .line 67
    sget-wide v9, Lp13;->c:J

    .line 68
    .line 69
    move-wide/from16 v22, v9

    .line 70
    .line 71
    goto :goto_6

    .line 72
    :cond_6
    move-wide/from16 v22, p9

    .line 73
    .line 74
    :goto_6
    const/high16 v3, 0x80000

    .line 75
    .line 76
    and-int/2addr v3, v0

    .line 77
    if-eqz v3, :cond_7

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    goto :goto_7

    .line 81
    :cond_7
    move-object/from16 v3, p11

    .line 82
    .line 83
    :goto_7
    const/high16 v9, 0x100000

    .line 84
    .line 85
    and-int/2addr v0, v9

    .line 86
    if-eqz v0, :cond_8

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    :goto_8
    move-object v9, v3

    .line 90
    goto :goto_9

    .line 91
    :cond_8
    move-object/from16 v0, p12

    .line 92
    .line 93
    goto :goto_8

    .line 94
    :goto_9
    new-instance v3, Llt2;

    .line 95
    .line 96
    move-object v10, v9

    .line 97
    const/4 v9, 0x0

    .line 98
    move-object v12, v10

    .line 99
    const/4 v10, 0x0

    .line 100
    move-object v15, v12

    .line 101
    const/4 v12, 0x0

    .line 102
    move-object/from16 v16, v15

    .line 103
    .line 104
    const/4 v15, 0x0

    .line 105
    move-object/from16 v17, v16

    .line 106
    .line 107
    const/16 v16, 0x0

    .line 108
    .line 109
    move-object/from16 v20, v17

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    move-object/from16 v21, v20

    .line 114
    .line 115
    const/16 v20, 0x0

    .line 116
    .line 117
    move-object/from16 v24, v21

    .line 118
    .line 119
    const/16 v21, 0x0

    .line 120
    .line 121
    move-object/from16 v2, v24

    .line 122
    .line 123
    invoke-direct/range {v3 .. v21}, Llt2;-><init>(JJLim0;Lgm0;Lhm0;Lmx2;Ljava/lang/String;JLxj;Lm03;Lkc1;JLgz2;Lbq2;)V

    .line 124
    .line 125
    .line 126
    new-instance v4, Lvw1;

    .line 127
    .line 128
    if-eqz v2, :cond_9

    .line 129
    .line 130
    iget-object v5, v2, Lw02;->a:Lk02;

    .line 131
    .line 132
    goto :goto_a

    .line 133
    :cond_9
    const/4 v5, 0x0

    .line 134
    :goto_a
    const/4 v6, 0x0

    .line 135
    const/4 v7, 0x0

    .line 136
    const/4 v8, 0x0

    .line 137
    const/4 v9, 0x0

    .line 138
    const/4 v10, 0x0

    .line 139
    move-object/from16 p8, v0

    .line 140
    .line 141
    move/from16 p2, v1

    .line 142
    .line 143
    move-object/from16 p1, v4

    .line 144
    .line 145
    move-object/from16 p7, v5

    .line 146
    .line 147
    move/from16 p3, v6

    .line 148
    .line 149
    move-object/from16 p6, v7

    .line 150
    .line 151
    move/from16 p9, v8

    .line 152
    .line 153
    move/from16 p10, v9

    .line 154
    .line 155
    move-object/from16 p11, v10

    .line 156
    .line 157
    move-wide/from16 p4, v22

    .line 158
    .line 159
    invoke-direct/range {p1 .. p11}, Lvw1;-><init>(IIJLn03;Lk02;Lya1;IILd13;)V

    .line 160
    .line 161
    .line 162
    move-object/from16 v0, p0

    .line 163
    .line 164
    move-object/from16 v1, p1

    .line 165
    .line 166
    invoke-direct {v0, v3, v1, v2}, Lm13;-><init>(Llt2;Lvw1;Lw02;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public constructor <init>(Llt2;Lvw1;)V
    .locals 2

    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    iget-object v0, p2, Lvw1;->e:Lk02;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 172
    :cond_0
    new-instance v1, Lw02;

    invoke-direct {v1, v0}, Lw02;-><init>(Lk02;)V

    move-object v0, v1

    .line 173
    :goto_0
    invoke-direct {p0, p1, p2, v0}, Lm13;-><init>(Llt2;Lvw1;Lw02;)V

    return-void
.end method

.method public constructor <init>(Llt2;Lvw1;Lw02;)V
    .locals 0

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 175
    iput-object p1, p0, Lm13;->a:Llt2;

    .line 176
    iput-object p2, p0, Lm13;->b:Lvw1;

    .line 177
    iput-object p3, p0, Lm13;->c:Lw02;

    return-void
.end method

.method public static a(Lm13;JJLim0;Lmx2;JJLw02;Lya1;I)Lm13;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p13

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, Lm13;->a:Llt2;

    .line 10
    .line 11
    iget-object v2, v2, Llt2;->a:Ll03;

    .line 12
    .line 13
    invoke-interface {v2}, Ll03;->b()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-wide/from16 v2, p1

    .line 19
    .line 20
    :goto_0
    and-int/lit8 v4, v1, 0x2

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    iget-object v4, v0, Lm13;->a:Llt2;

    .line 25
    .line 26
    iget-wide v4, v4, Llt2;->b:J

    .line 27
    .line 28
    move-wide v8, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-wide/from16 v8, p3

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v4, v1, 0x4

    .line 33
    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    iget-object v4, v0, Lm13;->a:Llt2;

    .line 37
    .line 38
    iget-object v4, v4, Llt2;->c:Lim0;

    .line 39
    .line 40
    move-object v10, v4

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move-object/from16 v10, p5

    .line 43
    .line 44
    :goto_2
    iget-object v4, v0, Lm13;->a:Llt2;

    .line 45
    .line 46
    iget-object v11, v4, Llt2;->d:Lgm0;

    .line 47
    .line 48
    iget-object v12, v4, Llt2;->e:Lhm0;

    .line 49
    .line 50
    and-int/lit8 v5, v1, 0x20

    .line 51
    .line 52
    if-eqz v5, :cond_3

    .line 53
    .line 54
    iget-object v5, v4, Llt2;->f:Lmx2;

    .line 55
    .line 56
    move-object v13, v5

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    move-object/from16 v13, p6

    .line 59
    .line 60
    :goto_3
    iget-object v14, v4, Llt2;->g:Ljava/lang/String;

    .line 61
    .line 62
    and-int/lit16 v5, v1, 0x80

    .line 63
    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    iget-wide v5, v4, Llt2;->h:J

    .line 67
    .line 68
    move-wide v15, v5

    .line 69
    goto :goto_4

    .line 70
    :cond_4
    move-wide/from16 v15, p7

    .line 71
    .line 72
    :goto_4
    iget-object v5, v4, Llt2;->i:Lxj;

    .line 73
    .line 74
    iget-object v6, v4, Llt2;->j:Lm03;

    .line 75
    .line 76
    iget-object v7, v4, Llt2;->k:Lkc1;

    .line 77
    .line 78
    move-object/from16 v17, v5

    .line 79
    .line 80
    move-object/from16 v18, v6

    .line 81
    .line 82
    iget-wide v5, v4, Llt2;->l:J

    .line 83
    .line 84
    iget-object v1, v4, Llt2;->m:Lgz2;

    .line 85
    .line 86
    move-object/from16 v22, v1

    .line 87
    .line 88
    iget-object v1, v4, Llt2;->n:Lbq2;

    .line 89
    .line 90
    move-object/from16 v23, v1

    .line 91
    .line 92
    iget-object v1, v4, Llt2;->o:Lop0;

    .line 93
    .line 94
    move-object/from16 v24, v1

    .line 95
    .line 96
    iget-object v1, v0, Lm13;->b:Lvw1;

    .line 97
    .line 98
    move-wide/from16 v20, v5

    .line 99
    .line 100
    iget v5, v1, Lvw1;->a:I

    .line 101
    .line 102
    iget v6, v1, Lvw1;->b:I

    .line 103
    .line 104
    const/high16 v19, 0x20000

    .line 105
    .line 106
    and-int v19, p13, v19

    .line 107
    .line 108
    move/from16 p1, v5

    .line 109
    .line 110
    move/from16 p2, v6

    .line 111
    .line 112
    if-eqz v19, :cond_5

    .line 113
    .line 114
    iget-wide v5, v1, Lvw1;->c:J

    .line 115
    .line 116
    move-wide/from16 v25, v5

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_5
    move-wide/from16 v25, p9

    .line 120
    .line 121
    :goto_5
    iget-object v5, v1, Lvw1;->d:Ln03;

    .line 122
    .line 123
    const/high16 v6, 0x80000

    .line 124
    .line 125
    and-int v6, p13, v6

    .line 126
    .line 127
    if-eqz v6, :cond_6

    .line 128
    .line 129
    iget-object v0, v0, Lm13;->c:Lw02;

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_6
    move-object/from16 v0, p11

    .line 133
    .line 134
    :goto_6
    const/high16 v6, 0x100000

    .line 135
    .line 136
    and-int v6, p13, v6

    .line 137
    .line 138
    if-eqz v6, :cond_7

    .line 139
    .line 140
    iget-object v6, v1, Lvw1;->f:Lya1;

    .line 141
    .line 142
    move-object/from16 v27, v6

    .line 143
    .line 144
    goto :goto_7

    .line 145
    :cond_7
    move-object/from16 v27, p12

    .line 146
    .line 147
    :goto_7
    iget v6, v1, Lvw1;->g:I

    .line 148
    .line 149
    move-object/from16 p5, v5

    .line 150
    .line 151
    iget v5, v1, Lvw1;->h:I

    .line 152
    .line 153
    iget-object v1, v1, Lvw1;->i:Ld13;

    .line 154
    .line 155
    move-object/from16 p10, v1

    .line 156
    .line 157
    new-instance v1, Lm13;

    .line 158
    .line 159
    move/from16 v19, v6

    .line 160
    .line 161
    new-instance v6, Llt2;

    .line 162
    .line 163
    move/from16 p9, v5

    .line 164
    .line 165
    iget-object v5, v4, Llt2;->a:Ll03;

    .line 166
    .line 167
    move-object/from16 p0, v6

    .line 168
    .line 169
    invoke-interface {v5}, Ll03;->b()J

    .line 170
    .line 171
    .line 172
    move-result-wide v5

    .line 173
    invoke-static {v2, v3, v5, v6}, Lju;->c(JJ)Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eqz v5, :cond_8

    .line 178
    .line 179
    iget-object v2, v4, Llt2;->a:Ll03;

    .line 180
    .line 181
    :goto_8
    move-object/from16 v6, p0

    .line 182
    .line 183
    move/from16 v3, v19

    .line 184
    .line 185
    move-object/from16 v19, v7

    .line 186
    .line 187
    move-object v7, v2

    .line 188
    move/from16 v2, p2

    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_8
    const-wide/16 v4, 0x10

    .line 192
    .line 193
    cmp-long v4, v2, v4

    .line 194
    .line 195
    if-eqz v4, :cond_9

    .line 196
    .line 197
    new-instance v4, Lwu;

    .line 198
    .line 199
    invoke-direct {v4, v2, v3}, Lwu;-><init>(J)V

    .line 200
    .line 201
    .line 202
    move-object v2, v4

    .line 203
    goto :goto_8

    .line 204
    :cond_9
    sget-object v2, Lsn;->U:Lsn;

    .line 205
    .line 206
    goto :goto_8

    .line 207
    :goto_9
    invoke-direct/range {v6 .. v24}, Llt2;-><init>(Ll03;JLim0;Lgm0;Lhm0;Lmx2;Ljava/lang/String;JLxj;Lm03;Lkc1;JLgz2;Lbq2;Lop0;)V

    .line 208
    .line 209
    .line 210
    new-instance v4, Lvw1;

    .line 211
    .line 212
    if-eqz v0, :cond_a

    .line 213
    .line 214
    iget-object v5, v0, Lw02;->a:Lk02;

    .line 215
    .line 216
    :goto_a
    move/from16 p2, v2

    .line 217
    .line 218
    move/from16 p8, v3

    .line 219
    .line 220
    move-object/from16 p0, v4

    .line 221
    .line 222
    move-object/from16 p6, v5

    .line 223
    .line 224
    move-wide/from16 p3, v25

    .line 225
    .line 226
    move-object/from16 p7, v27

    .line 227
    .line 228
    goto :goto_b

    .line 229
    :cond_a
    const/4 v5, 0x0

    .line 230
    goto :goto_a

    .line 231
    :goto_b
    invoke-direct/range {p0 .. p10}, Lvw1;-><init>(IIJLn03;Lk02;Lya1;IILd13;)V

    .line 232
    .line 233
    .line 234
    move-object/from16 v2, p0

    .line 235
    .line 236
    invoke-direct {v1, v6, v2, v0}, Lm13;-><init>(Llt2;Lvw1;Lw02;)V

    .line 237
    .line 238
    .line 239
    return-object v1
.end method

.method public static d(Lm13;JJLim0;JIJI)Lm13;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p11

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    sget-wide v2, Lp13;->c:J

    .line 10
    .line 11
    move-wide v9, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-wide/from16 v9, p3

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x4

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    move-object v11, v3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object/from16 v11, p5

    .line 23
    .line 24
    :goto_1
    and-int/lit16 v2, v1, 0x80

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    sget-wide v4, Lp13;->c:J

    .line 29
    .line 30
    move-wide/from16 v16, v4

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-wide/from16 v16, p6

    .line 34
    .line 35
    :goto_2
    sget-wide v21, Lju;->g:J

    .line 36
    .line 37
    const v2, 0x8000

    .line 38
    .line 39
    .line 40
    and-int/2addr v2, v1

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    goto :goto_3

    .line 45
    :cond_3
    move/from16 v2, p8

    .line 46
    .line 47
    :goto_3
    const/high16 v4, 0x20000

    .line 48
    .line 49
    and-int/2addr v1, v4

    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    sget-wide v4, Lp13;->c:J

    .line 53
    .line 54
    move-wide/from16 v26, v4

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_4
    move-wide/from16 v26, p9

    .line 58
    .line 59
    :goto_4
    iget-object v4, v0, Lm13;->a:Llt2;

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    const/high16 v8, 0x7fc00000    # Float.NaN

    .line 63
    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v13, 0x0

    .line 66
    const/4 v14, 0x0

    .line 67
    const/4 v15, 0x0

    .line 68
    const/16 v18, 0x0

    .line 69
    .line 70
    const/16 v19, 0x0

    .line 71
    .line 72
    const/16 v20, 0x0

    .line 73
    .line 74
    const/16 v23, 0x0

    .line 75
    .line 76
    const/16 v24, 0x0

    .line 77
    .line 78
    const/16 v25, 0x0

    .line 79
    .line 80
    move-wide/from16 v5, p1

    .line 81
    .line 82
    invoke-static/range {v4 .. v25}, Lmt2;->a(Llt2;JLan;FJLim0;Lgm0;Lhm0;Lmx2;Ljava/lang/String;JLxj;Lm03;Lkc1;JLgz2;Lbq2;Lop0;)Llt2;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v4, v0, Lm13;->b:Lvw1;

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v9, 0x0

    .line 92
    const/4 v10, 0x0

    .line 93
    move/from16 p2, v2

    .line 94
    .line 95
    move-object/from16 p7, v3

    .line 96
    .line 97
    move-object/from16 p1, v4

    .line 98
    .line 99
    move/from16 p3, v5

    .line 100
    .line 101
    move-object/from16 p6, v6

    .line 102
    .line 103
    move-object/from16 p8, v7

    .line 104
    .line 105
    move/from16 p9, v8

    .line 106
    .line 107
    move/from16 p10, v9

    .line 108
    .line 109
    move-object/from16 p11, v10

    .line 110
    .line 111
    move-wide/from16 p4, v26

    .line 112
    .line 113
    invoke-static/range {p1 .. p11}, Lww1;->a(Lvw1;IIJLn03;Lk02;Lya1;IILd13;)Lvw1;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object v3, v0, Lm13;->a:Llt2;

    .line 118
    .line 119
    if-ne v3, v1, :cond_5

    .line 120
    .line 121
    iget-object v3, v0, Lm13;->b:Lvw1;

    .line 122
    .line 123
    if-ne v3, v2, :cond_5

    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_5
    new-instance v0, Lm13;

    .line 127
    .line 128
    invoke-direct {v0, v1, v2}, Lm13;-><init>(Llt2;Lvw1;)V

    .line 129
    .line 130
    .line 131
    return-object v0
.end method


# virtual methods
.method public final b()J
    .locals 2

    .line 1
    iget-object p0, p0, Lm13;->a:Llt2;

    .line 2
    .line 3
    iget-object p0, p0, Llt2;->a:Ll03;

    .line 4
    .line 5
    invoke-interface {p0}, Ll03;->b()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final c(Lm13;)Z
    .locals 2

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lm13;->b:Lvw1;

    .line 4
    .line 5
    iget-object v1, p1, Lm13;->b:Lvw1;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lm13;->a:Llt2;

    .line 14
    .line 15
    iget-object p1, p1, Lm13;->a:Llt2;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Llt2;->a(Llt2;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lm13;

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
    check-cast p1, Lm13;

    .line 12
    .line 13
    iget-object v1, p1, Lm13;->a:Llt2;

    .line 14
    .line 15
    iget-object v3, p0, Lm13;->a:Llt2;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lm13;->b:Lvw1;

    .line 25
    .line 26
    iget-object v3, p1, Lm13;->b:Lvw1;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lm13;->c:Lw02;

    .line 36
    .line 37
    iget-object p1, p1, Lm13;->c:Lw02;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lm13;->a:Llt2;

    .line 2
    .line 3
    invoke-virtual {v0}, Llt2;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lm13;->b:Lvw1;

    .line 10
    .line 11
    invoke-virtual {v1}, Lvw1;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object p0, p0, Lm13;->c:Lw02;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lw02;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    add-int/2addr v1, p0

    .line 29
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextStyle(color="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lm13;->b()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v1, v2}, Lju;->i(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ", brush="

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lm13;->a:Llt2;

    .line 25
    .line 26
    iget-object v2, v1, Llt2;->a:Ll03;

    .line 27
    .line 28
    invoke-interface {v2}, Ll03;->k()Lan;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, ", alpha="

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v2, v1, Llt2;->a:Ll03;

    .line 41
    .line 42
    invoke-interface {v2}, Ll03;->a()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v2, ", fontSize="

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-wide v2, v1, Llt2;->b:J

    .line 55
    .line 56
    invoke-static {v2, v3}, Lp13;->d(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v2, ", fontWeight="

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v2, v1, Llt2;->c:Lim0;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v2, ", fontStyle="

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v2, v1, Llt2;->d:Lgm0;

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v2, ", fontSynthesis="

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v2, v1, Llt2;->e:Lhm0;

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v2, ", fontFamily="

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v2, v1, Llt2;->f:Lmx2;

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v2, ", fontFeatureSettings="

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v2, v1, Llt2;->g:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v2, ", letterSpacing="

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-wide v2, v1, Llt2;->h:J

    .line 119
    .line 120
    invoke-static {v2, v3}, Lp13;->d(J)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v2, ", baselineShift="

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    iget-object v2, v1, Llt2;->i:Lxj;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v2, ", textGeometricTransform="

    .line 138
    .line 139
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    iget-object v2, v1, Llt2;->j:Lm03;

    .line 143
    .line 144
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v2, ", localeList="

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    iget-object v2, v1, Llt2;->k:Lkc1;

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v2, ", background="

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-wide v2, v1, Llt2;->l:J

    .line 163
    .line 164
    const-string v4, ", textDecoration="

    .line 165
    .line 166
    invoke-static {v2, v3, v0, v4}, Lhk1;->l(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget-object v2, v1, Llt2;->m:Lgz2;

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v2, ", shadow="

    .line 175
    .line 176
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    iget-object v2, v1, Llt2;->n:Lbq2;

    .line 180
    .line 181
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v2, ", drawStyle="

    .line 185
    .line 186
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget-object v1, v1, Llt2;->o:Lop0;

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v1, ", textAlign="

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Lm13;->b:Lvw1;

    .line 200
    .line 201
    iget v2, v1, Lvw1;->a:I

    .line 202
    .line 203
    invoke-static {v2}, Lky2;->a(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v2, ", textDirection="

    .line 211
    .line 212
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    iget v2, v1, Lvw1;->b:I

    .line 216
    .line 217
    invoke-static {v2}, Ljz2;->a(I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v2, ", lineHeight="

    .line 225
    .line 226
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    iget-wide v2, v1, Lvw1;->c:J

    .line 230
    .line 231
    invoke-static {v2, v3}, Lp13;->d(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string v2, ", textIndent="

    .line 239
    .line 240
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    iget-object v2, v1, Lvw1;->d:Ln03;

    .line 244
    .line 245
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v2, ", platformStyle="

    .line 249
    .line 250
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    iget-object p0, p0, Lm13;->c:Lw02;

    .line 254
    .line 255
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const-string p0, ", lineHeightStyle="

    .line 259
    .line 260
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    iget-object p0, v1, Lvw1;->f:Lya1;

    .line 264
    .line 265
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string p0, ", lineBreak="

    .line 269
    .line 270
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    iget p0, v1, Lvw1;->g:I

    .line 274
    .line 275
    invoke-static {p0}, Lta1;->a(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string p0, ", hyphens="

    .line 283
    .line 284
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    iget p0, v1, Lvw1;->h:I

    .line 288
    .line 289
    invoke-static {p0}, Lbx0;->a(I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const-string p0, ", textMotion="

    .line 297
    .line 298
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    iget-object p0, v1, Lvw1;->i:Ld13;

    .line 302
    .line 303
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const/16 p0, 0x29

    .line 307
    .line 308
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    return-object p0
.end method
