.class public final Lh0/d1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public A:Z

.field public final a:Lw/q1;

.field public b:Lb5/k;

.field public c:Lfg/l;

.field public d:Lw/q0;

.field public final e:Li0/j1;

.field public f:Lfg/a;

.field public g:Ly1/y0;

.field public h:Lqg/t;

.field public i:Lh0/p;

.field public j:Ln1/a;

.field public k:Ld1/v;

.field public final l:Li0/j1;

.field public final m:Li0/j1;

.field public n:J

.field public o:Li2/m0;

.field public p:J

.field public final q:Li0/j1;

.field public final r:Li0/j1;

.field public s:I

.field public t:Ln2/s;

.field public u:Lh0/q0;

.field public v:Li2/m0;

.field public final w:Li0/j1;

.field public final x:Lb/e;

.field public final y:Lh0/b1;

.field public final z:Lh0/q0;


# direct methods
.method public constructor <init>(Lw/q1;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh0/d1;->a:Lw/q1;

    .line 5
    .line 6
    sget-object p1, Lw/s;->f:Lb5/k;

    .line 7
    .line 8
    iput-object p1, p0, Lh0/d1;->b:Lb5/k;

    .line 9
    .line 10
    new-instance p1, Lr9/p;

    .line 11
    .line 12
    const/16 v0, 0x13

    .line 13
    .line 14
    invoke-direct {p1, v0}, Lr9/p;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lh0/d1;->c:Lfg/l;

    .line 18
    .line 19
    new-instance p1, Ln2/s;

    .line 20
    .line 21
    const/4 v0, 0x7

    .line 22
    const/4 v1, 0x0

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    invoke-direct {p1, v0, v1, v2, v3}, Ln2/s;-><init>(ILjava/lang/String;J)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lh0/d1;->e:Li0/j1;

    .line 33
    .line 34
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iput-object v4, p0, Lh0/d1;->l:Li0/j1;

    .line 41
    .line 42
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lh0/d1;->m:Li0/j1;

    .line 47
    .line 48
    iput-wide v2, p0, Lh0/d1;->n:J

    .line 49
    .line 50
    iput-wide v2, p0, Lh0/d1;->p:J

    .line 51
    .line 52
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lh0/d1;->q:Li0/j1;

    .line 57
    .line 58
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lh0/d1;->r:Li0/j1;

    .line 63
    .line 64
    const/4 p1, -0x1

    .line 65
    iput p1, p0, Lh0/d1;->s:I

    .line 66
    .line 67
    new-instance p1, Ln2/s;

    .line 68
    .line 69
    invoke-direct {p1, v0, v1, v2, v3}, Ln2/s;-><init>(ILjava/lang/String;J)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lh0/d1;->t:Ln2/s;

    .line 73
    .line 74
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, Lh0/d1;->w:Li0/j1;

    .line 81
    .line 82
    new-instance p1, Lb/e;

    .line 83
    .line 84
    const/4 v0, 0x3

    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-direct {p1, v0, v1}, Lb/e;-><init>(IZ)V

    .line 87
    .line 88
    .line 89
    sget-object v0, Lc0/o;->g:Lc0/o;

    .line 90
    .line 91
    iput-object v0, p1, Lb/e;->i:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object p1, p0, Lh0/d1;->x:Lb/e;

    .line 94
    .line 95
    new-instance p1, Lh0/b1;

    .line 96
    .line 97
    invoke-direct {p1, p0}, Lh0/b1;-><init>(Lh0/d1;)V

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, Lh0/d1;->y:Lh0/b1;

    .line 101
    .line 102
    new-instance p1, Lh0/q0;

    .line 103
    .line 104
    invoke-direct {p1, p0}, Lh0/q0;-><init>(Lh0/d1;)V

    .line 105
    .line 106
    .line 107
    iput-object p1, p0, Lh0/d1;->z:Lh0/q0;

    .line 108
    .line 109
    return-void
.end method

.method public static final a(Lh0/d1;)Lsf/e;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lh0/d1;->m()Li2/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lh0/d1;->v:Li2/m0;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-wide v1, v1, Li2/m0;->a:J

    .line 17
    .line 18
    iget-object v3, p0, Lh0/d1;->b:Lb5/k;

    .line 19
    .line 20
    const/16 v4, 0x20

    .line 21
    .line 22
    shr-long v4, v1, v4

    .line 23
    .line 24
    long-to-int v4, v4

    .line 25
    invoke-virtual {v3, v4}, Lb5/k;->l(I)I

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lh0/d1;->b:Lb5/k;

    .line 29
    .line 30
    const-wide v5, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v1, v5

    .line 36
    long-to-int v1, v1

    .line 37
    invoke-virtual {p0, v1}, Lb5/k;->l(I)I

    .line 38
    .line 39
    .line 40
    invoke-static {v4, v1}, Li2/e0;->b(II)J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    new-instance p0, Lsf/e;

    .line 45
    .line 46
    new-instance v3, Li2/m0;

    .line 47
    .line 48
    invoke-direct {v3, v1, v2}, Li2/m0;-><init>(J)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, v0, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public static final b(Lh0/d1;Li2/m0;)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-wide v0, p1, Li2/m0;->a:J

    .line 5
    .line 6
    iget-object v3, p0, Lh0/d1;->i:Lh0/p;

    .line 7
    .line 8
    if-nez v3, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p0}, Lh0/d1;->m()Li2/g;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    iget-object v4, v2, Li2/g;->h:Ljava/lang/String;

    .line 18
    .line 19
    if-nez v4, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v9, p0, Lh0/d1;->b:Lb5/k;

    .line 23
    .line 24
    const/16 v2, 0x20

    .line 25
    .line 26
    shr-long v5, v0, v2

    .line 27
    .line 28
    long-to-int v2, v5

    .line 29
    invoke-virtual {v9, v2}, Lb5/k;->l(I)I

    .line 30
    .line 31
    .line 32
    const-wide v5, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v0, v5

    .line 38
    long-to-int v0, v0

    .line 39
    invoke-virtual {v9, v0}, Lb5/k;->l(I)I

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v0}, Li2/e0;->b(II)J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-lez v0, :cond_3

    .line 51
    .line 52
    invoke-static {v5, v6}, Li2/m0;->c(J)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, Lh0/d1;->h:Lqg/t;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    new-instance v2, Lh0/a1;

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    move-object v8, p0

    .line 66
    move-object v7, p1

    .line 67
    invoke-direct/range {v2 .. v10}, Lh0/a1;-><init>(Lh0/p;Ljava/lang/String;JLi2/m0;Lh0/d1;Lb5/k;Lwf/c;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x3

    .line 71
    const/4 p1, 0x0

    .line 72
    invoke-static {v0, p1, v2, p0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_0
    return-void
.end method

.method public static final c(Lh0/d1;Ln2/s;JZZLg1/d;ZLn1/b;)J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v4, v0, Lh0/d1;->d:Lw/q0;

    .line 6
    .line 7
    if-eqz v4, :cond_2a

    .line 8
    .line 9
    invoke-virtual {v4}, Lw/q0;->d()Lw/m1;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    goto/16 :goto_19

    .line 16
    .line 17
    :cond_0
    iget-object v5, v0, Lh0/d1;->b:Lb5/k;

    .line 18
    .line 19
    iget-wide v6, v1, Ln2/s;->b:J

    .line 20
    .line 21
    iget-object v1, v1, Ln2/s;->a:Li2/g;

    .line 22
    .line 23
    sget v8, Li2/m0;->c:I

    .line 24
    .line 25
    const/16 v8, 0x20

    .line 26
    .line 27
    shr-long v9, v6, v8

    .line 28
    .line 29
    long-to-int v9, v9

    .line 30
    invoke-virtual {v5, v9}, Lb5/k;->l(I)I

    .line 31
    .line 32
    .line 33
    iget-object v5, v0, Lh0/d1;->b:Lb5/k;

    .line 34
    .line 35
    const-wide v10, 0xffffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long v12, v6, v10

    .line 41
    .line 42
    long-to-int v12, v12

    .line 43
    invoke-virtual {v5, v12}, Lb5/k;->l(I)I

    .line 44
    .line 45
    .line 46
    invoke-static {v9, v12}, Li2/e0;->b(II)J

    .line 47
    .line 48
    .line 49
    move-result-wide v12

    .line 50
    const/4 v5, 0x0

    .line 51
    move-wide/from16 v14, p2

    .line 52
    .line 53
    invoke-virtual {v4, v14, v15, v5}, Lw/m1;->b(JZ)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-nez p5, :cond_2

    .line 58
    .line 59
    if-eqz p4, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    shr-long v14, v12, v8

    .line 63
    .line 64
    long-to-int v14, v14

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    move v14, v9

    .line 67
    :goto_1
    if-eqz p5, :cond_3

    .line 68
    .line 69
    if-eqz p4, :cond_4

    .line 70
    .line 71
    :cond_3
    move-wide v15, v10

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move-wide v15, v10

    .line 74
    and-long v10, v12, v15

    .line 75
    .line 76
    long-to-int v10, v10

    .line 77
    goto :goto_3

    .line 78
    :goto_2
    move v10, v9

    .line 79
    :goto_3
    iget-object v11, v0, Lh0/d1;->u:Lh0/q0;

    .line 80
    .line 81
    move/from16 p1, v8

    .line 82
    .line 83
    const/4 v8, -0x1

    .line 84
    if-nez p4, :cond_6

    .line 85
    .line 86
    if-eqz v11, :cond_6

    .line 87
    .line 88
    move-wide/from16 p2, v15

    .line 89
    .line 90
    iget v15, v0, Lh0/d1;->s:I

    .line 91
    .line 92
    if-ne v15, v8, :cond_5

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    move v8, v15

    .line 96
    goto :goto_4

    .line 97
    :cond_6
    move-wide/from16 p2, v15

    .line 98
    .line 99
    :goto_4
    iget-object v4, v4, Lw/m1;->a:Li2/k0;

    .line 100
    .line 101
    new-instance v15, Lh0/q0;

    .line 102
    .line 103
    if-eqz p4, :cond_7

    .line 104
    .line 105
    move-object v13, v1

    .line 106
    move-wide/from16 v19, v6

    .line 107
    .line 108
    const/4 v5, 0x0

    .line 109
    goto :goto_5

    .line 110
    :cond_7
    new-instance v5, Lh0/v;

    .line 111
    .line 112
    move-wide/from16 v17, v12

    .line 113
    .line 114
    new-instance v12, Lh0/u;

    .line 115
    .line 116
    move-wide/from16 v19, v6

    .line 117
    .line 118
    shr-long v6, v17, p1

    .line 119
    .line 120
    long-to-int v6, v6

    .line 121
    invoke-static {v4, v6}, La7/a;->y(Li2/k0;I)Lt2/j;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    move-object v13, v1

    .line 126
    const-wide/16 v0, 0x1

    .line 127
    .line 128
    invoke-direct {v12, v7, v6, v0, v1}, Lh0/u;-><init>(Lt2/j;IJ)V

    .line 129
    .line 130
    .line 131
    new-instance v6, Lh0/u;

    .line 132
    .line 133
    and-long v0, v17, p2

    .line 134
    .line 135
    long-to-int v0, v0

    .line 136
    invoke-static {v4, v0}, La7/a;->y(Li2/k0;I)Lt2/j;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    const-wide/16 v2, 0x1

    .line 141
    .line 142
    invoke-direct {v6, v1, v0, v2, v3}, Lh0/u;-><init>(Lt2/j;IJ)V

    .line 143
    .line 144
    .line 145
    invoke-static/range {v17 .. v18}, Li2/m0;->g(J)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-direct {v5, v12, v6, v0}, Lh0/v;-><init>(Lh0/u;Lh0/u;Z)V

    .line 150
    .line 151
    .line 152
    :goto_5
    new-instance v0, Lh0/s;

    .line 153
    .line 154
    invoke-direct {v0, v14, v10, v8, v4}, Lh0/s;-><init>(IIILi2/k0;)V

    .line 155
    .line 156
    .line 157
    move/from16 v2, p5

    .line 158
    .line 159
    invoke-direct {v15, v2, v5, v0}, Lh0/q0;-><init>(ZLh0/v;Lh0/s;)V

    .line 160
    .line 161
    .line 162
    if-eqz v5, :cond_9

    .line 163
    .line 164
    if-eqz v11, :cond_9

    .line 165
    .line 166
    iget-boolean v0, v11, Lh0/q0;->b:Z

    .line 167
    .line 168
    if-ne v2, v0, :cond_9

    .line 169
    .line 170
    iget-object v0, v11, Lh0/q0;->d:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Lh0/s;

    .line 173
    .line 174
    iget v1, v0, Lh0/s;->b:I

    .line 175
    .line 176
    if-ne v14, v1, :cond_9

    .line 177
    .line 178
    iget v0, v0, Lh0/s;->c:I

    .line 179
    .line 180
    if-eq v10, v0, :cond_8

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_8
    move-wide/from16 v4, v19

    .line 184
    .line 185
    goto/16 :goto_12

    .line 186
    .line 187
    :cond_9
    :goto_6
    move-object/from16 v0, p0

    .line 188
    .line 189
    iput-object v15, v0, Lh0/d1;->u:Lh0/q0;

    .line 190
    .line 191
    iput v9, v0, Lh0/d1;->s:I

    .line 192
    .line 193
    move-object/from16 v1, p6

    .line 194
    .line 195
    iget v1, v1, Lg1/d;->g:I

    .line 196
    .line 197
    sget-object v2, Lh0/h;->g:Lh0/h;

    .line 198
    .line 199
    const/4 v3, 0x1

    .line 200
    iget-object v4, v15, Lh0/q0;->d:Ljava/lang/Object;

    .line 201
    .line 202
    packed-switch v1, :pswitch_data_0

    .line 203
    .line 204
    .line 205
    iget-object v1, v15, Lh0/q0;->c:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v1, Lh0/v;

    .line 208
    .line 209
    move-object v5, v4

    .line 210
    check-cast v5, Lh0/s;

    .line 211
    .line 212
    if-nez v1, :cond_a

    .line 213
    .line 214
    sget-object v1, Lh0/w;->c:Lh0/w;

    .line 215
    .line 216
    invoke-static {v15, v1}, Lx6/d;->i(Lh0/q0;Lh0/w;)Lh0/v;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    goto/16 :goto_11

    .line 221
    .line 222
    :cond_a
    iget-object v6, v1, Lh0/v;->b:Lh0/u;

    .line 223
    .line 224
    iget-object v7, v1, Lh0/v;->a:Lh0/u;

    .line 225
    .line 226
    iget-boolean v8, v15, Lh0/q0;->b:Z

    .line 227
    .line 228
    if-eqz v8, :cond_b

    .line 229
    .line 230
    invoke-static {v15, v5, v7}, Lx6/d;->k(Lh0/q0;Lh0/s;Lh0/u;)Lh0/u;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    move-object v8, v7

    .line 235
    move-object v7, v6

    .line 236
    move-object v6, v8

    .line 237
    move-object v8, v5

    .line 238
    goto :goto_7

    .line 239
    :cond_b
    invoke-static {v15, v5, v6}, Lx6/d;->k(Lh0/q0;Lh0/s;Lh0/u;)Lh0/u;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    move-object v8, v7

    .line 244
    move-object v7, v5

    .line 245
    :goto_7
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    if-eqz v5, :cond_c

    .line 250
    .line 251
    goto/16 :goto_11

    .line 252
    .line 253
    :cond_c
    invoke-virtual {v15}, Lh0/q0;->d()Lh0/h;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    if-eq v1, v2, :cond_e

    .line 258
    .line 259
    invoke-virtual {v15}, Lh0/q0;->d()Lh0/h;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    sget-object v2, Lh0/h;->i:Lh0/h;

    .line 264
    .line 265
    if-ne v1, v2, :cond_d

    .line 266
    .line 267
    iget v1, v8, Lh0/u;->b:I

    .line 268
    .line 269
    iget v2, v7, Lh0/u;->b:I

    .line 270
    .line 271
    if-le v1, v2, :cond_d

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_d
    const/4 v1, 0x0

    .line 275
    goto :goto_9

    .line 276
    :cond_e
    :goto_8
    move v1, v3

    .line 277
    :goto_9
    new-instance v2, Lh0/v;

    .line 278
    .line 279
    invoke-direct {v2, v8, v7, v1}, Lh0/v;-><init>(Lh0/u;Lh0/u;Z)V

    .line 280
    .line 281
    .line 282
    check-cast v4, Lh0/s;

    .line 283
    .line 284
    iget-object v1, v2, Lh0/v;->a:Lh0/u;

    .line 285
    .line 286
    iget-wide v5, v1, Lh0/u;->c:J

    .line 287
    .line 288
    iget-object v7, v2, Lh0/v;->b:Lh0/u;

    .line 289
    .line 290
    iget-wide v8, v7, Lh0/u;->c:J

    .line 291
    .line 292
    cmp-long v5, v5, v8

    .line 293
    .line 294
    if-nez v5, :cond_f

    .line 295
    .line 296
    iget v5, v1, Lh0/u;->b:I

    .line 297
    .line 298
    iget v6, v7, Lh0/u;->b:I

    .line 299
    .line 300
    if-ne v5, v6, :cond_1c

    .line 301
    .line 302
    goto :goto_c

    .line 303
    :cond_f
    iget-boolean v5, v2, Lh0/v;->c:Z

    .line 304
    .line 305
    if-eqz v5, :cond_10

    .line 306
    .line 307
    move-object v6, v1

    .line 308
    goto :goto_a

    .line 309
    :cond_10
    move-object v6, v7

    .line 310
    :goto_a
    iget v6, v6, Lh0/u;->b:I

    .line 311
    .line 312
    if-eqz v6, :cond_11

    .line 313
    .line 314
    goto/16 :goto_f

    .line 315
    .line 316
    :cond_11
    if-eqz v5, :cond_12

    .line 317
    .line 318
    move-object v5, v7

    .line 319
    goto :goto_b

    .line 320
    :cond_12
    move-object v5, v1

    .line 321
    :goto_b
    iget-object v6, v4, Lh0/s;->e:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v6, Li2/k0;

    .line 324
    .line 325
    iget-object v6, v6, Li2/k0;->a:Li2/j0;

    .line 326
    .line 327
    iget-object v6, v6, Li2/j0;->a:Li2/g;

    .line 328
    .line 329
    iget-object v6, v6, Li2/g;->h:Ljava/lang/String;

    .line 330
    .line 331
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    iget v5, v5, Lh0/u;->b:I

    .line 336
    .line 337
    if-eq v6, v5, :cond_13

    .line 338
    .line 339
    goto/16 :goto_f

    .line 340
    .line 341
    :cond_13
    :goto_c
    iget-object v5, v15, Lh0/q0;->c:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v5, Lh0/v;

    .line 344
    .line 345
    iget-object v6, v4, Lh0/s;->e:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v6, Li2/k0;

    .line 348
    .line 349
    iget-object v6, v6, Li2/k0;->a:Li2/j0;

    .line 350
    .line 351
    iget-object v6, v6, Li2/j0;->a:Li2/g;

    .line 352
    .line 353
    iget-object v6, v6, Li2/g;->h:Ljava/lang/String;

    .line 354
    .line 355
    if-eqz v5, :cond_1c

    .line 356
    .line 357
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    if-nez v6, :cond_14

    .line 362
    .line 363
    goto/16 :goto_f

    .line 364
    .line 365
    :cond_14
    iget-boolean v6, v15, Lh0/q0;->b:Z

    .line 366
    .line 367
    iget-object v8, v4, Lh0/s;->e:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v8, Li2/k0;

    .line 370
    .line 371
    iget-object v8, v8, Li2/k0;->a:Li2/j0;

    .line 372
    .line 373
    iget-object v8, v8, Li2/j0;->a:Li2/g;

    .line 374
    .line 375
    iget-object v8, v8, Li2/g;->h:Ljava/lang/String;

    .line 376
    .line 377
    iget v9, v4, Lh0/s;->b:I

    .line 378
    .line 379
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 380
    .line 381
    .line 382
    move-result v10

    .line 383
    const/4 v11, 0x2

    .line 384
    if-nez v9, :cond_16

    .line 385
    .line 386
    const/4 v12, 0x0

    .line 387
    invoke-static {v12, v8}, Lw/s;->q(ILjava/lang/String;)I

    .line 388
    .line 389
    .line 390
    move-result v5

    .line 391
    if-eqz v6, :cond_15

    .line 392
    .line 393
    invoke-static {v1, v4, v5}, Lx6/d;->o(Lh0/u;Lh0/s;I)Lh0/u;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    const/4 v14, 0x0

    .line 398
    invoke-static {v2, v1, v14, v3, v11}, Lh0/v;->a(Lh0/v;Lh0/u;Lh0/u;ZI)Lh0/v;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    goto/16 :goto_11

    .line 403
    .line 404
    :cond_15
    const/4 v14, 0x0

    .line 405
    invoke-static {v7, v4, v5}, Lx6/d;->o(Lh0/u;Lh0/s;I)Lh0/u;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-static {v2, v14, v1, v12, v3}, Lh0/v;->a(Lh0/v;Lh0/u;Lh0/u;ZI)Lh0/v;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    goto/16 :goto_11

    .line 414
    .line 415
    :cond_16
    const/4 v12, 0x0

    .line 416
    const/4 v14, 0x0

    .line 417
    if-ne v9, v10, :cond_18

    .line 418
    .line 419
    invoke-static {v10, v8}, Lw/s;->t(ILjava/lang/String;)I

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    if-eqz v6, :cond_17

    .line 424
    .line 425
    invoke-static {v1, v4, v5}, Lx6/d;->o(Lh0/u;Lh0/s;I)Lh0/u;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-static {v2, v1, v14, v12, v11}, Lh0/v;->a(Lh0/v;Lh0/u;Lh0/u;ZI)Lh0/v;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    goto :goto_11

    .line 434
    :cond_17
    invoke-static {v7, v4, v5}, Lx6/d;->o(Lh0/u;Lh0/s;I)Lh0/u;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    invoke-static {v2, v14, v1, v3, v3}, Lh0/v;->a(Lh0/v;Lh0/u;Lh0/u;ZI)Lh0/v;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    goto :goto_11

    .line 443
    :cond_18
    iget-boolean v5, v5, Lh0/v;->c:Z

    .line 444
    .line 445
    if-ne v5, v3, :cond_19

    .line 446
    .line 447
    move v12, v3

    .line 448
    goto :goto_d

    .line 449
    :cond_19
    const/4 v12, 0x0

    .line 450
    :goto_d
    xor-int v5, v6, v12

    .line 451
    .line 452
    if-eqz v5, :cond_1a

    .line 453
    .line 454
    invoke-static {v9, v8}, Lw/s;->t(ILjava/lang/String;)I

    .line 455
    .line 456
    .line 457
    move-result v5

    .line 458
    goto :goto_e

    .line 459
    :cond_1a
    invoke-static {v9, v8}, Lw/s;->q(ILjava/lang/String;)I

    .line 460
    .line 461
    .line 462
    move-result v5

    .line 463
    :goto_e
    if-eqz v6, :cond_1b

    .line 464
    .line 465
    invoke-static {v1, v4, v5}, Lx6/d;->o(Lh0/u;Lh0/s;I)Lh0/u;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    const/4 v14, 0x0

    .line 470
    invoke-static {v2, v1, v14, v12, v11}, Lh0/v;->a(Lh0/v;Lh0/u;Lh0/u;ZI)Lh0/v;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    goto :goto_11

    .line 475
    :cond_1b
    const/4 v14, 0x0

    .line 476
    invoke-static {v7, v4, v5}, Lx6/d;->o(Lh0/u;Lh0/s;I)Lh0/u;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    invoke-static {v2, v14, v1, v12, v3}, Lh0/v;->a(Lh0/v;Lh0/u;Lh0/u;ZI)Lh0/v;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    goto :goto_11

    .line 485
    :cond_1c
    :goto_f
    move-object v1, v2

    .line 486
    goto :goto_11

    .line 487
    :pswitch_0
    sget-object v1, Lh0/w;->b:Lh0/w;

    .line 488
    .line 489
    invoke-static {v15, v1}, Lx6/d;->i(Lh0/q0;Lh0/w;)Lh0/v;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    goto :goto_11

    .line 494
    :pswitch_1
    sget-object v1, Lh0/w;->c:Lh0/w;

    .line 495
    .line 496
    invoke-static {v15, v1}, Lx6/d;->i(Lh0/q0;Lh0/w;)Lh0/v;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    goto :goto_11

    .line 501
    :pswitch_2
    new-instance v1, Lh0/v;

    .line 502
    .line 503
    check-cast v4, Lh0/s;

    .line 504
    .line 505
    iget v5, v4, Lh0/s;->b:I

    .line 506
    .line 507
    invoke-virtual {v4, v5}, Lh0/s;->a(I)Lh0/u;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    iget v6, v4, Lh0/s;->c:I

    .line 512
    .line 513
    invoke-virtual {v4, v6}, Lh0/s;->a(I)Lh0/u;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    invoke-virtual {v15}, Lh0/q0;->d()Lh0/h;

    .line 518
    .line 519
    .line 520
    move-result-object v6

    .line 521
    if-ne v6, v2, :cond_1d

    .line 522
    .line 523
    move v12, v3

    .line 524
    goto :goto_10

    .line 525
    :cond_1d
    const/4 v12, 0x0

    .line 526
    :goto_10
    invoke-direct {v1, v5, v4, v12}, Lh0/v;-><init>(Lh0/u;Lh0/u;Z)V

    .line 527
    .line 528
    .line 529
    :goto_11
    iget-object v2, v0, Lh0/d1;->b:Lb5/k;

    .line 530
    .line 531
    iget-object v4, v1, Lh0/v;->a:Lh0/u;

    .line 532
    .line 533
    iget v4, v4, Lh0/u;->b:I

    .line 534
    .line 535
    invoke-virtual {v2, v4}, Lb5/k;->n(I)I

    .line 536
    .line 537
    .line 538
    iget-object v2, v0, Lh0/d1;->b:Lb5/k;

    .line 539
    .line 540
    iget-object v1, v1, Lh0/v;->b:Lh0/u;

    .line 541
    .line 542
    iget v1, v1, Lh0/u;->b:I

    .line 543
    .line 544
    invoke-virtual {v2, v1}, Lb5/k;->n(I)I

    .line 545
    .line 546
    .line 547
    invoke-static {v4, v1}, Li2/e0;->b(II)J

    .line 548
    .line 549
    .line 550
    move-result-wide v1

    .line 551
    move-wide/from16 v4, v19

    .line 552
    .line 553
    invoke-static {v1, v2, v4, v5}, Li2/m0;->b(JJ)Z

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    if-eqz v6, :cond_1e

    .line 558
    .line 559
    :goto_12
    return-wide v4

    .line 560
    :cond_1e
    invoke-static {v1, v2}, Li2/m0;->g(J)Z

    .line 561
    .line 562
    .line 563
    move-result v6

    .line 564
    invoke-static {v4, v5}, Li2/m0;->g(J)Z

    .line 565
    .line 566
    .line 567
    move-result v7

    .line 568
    if-eq v6, v7, :cond_1f

    .line 569
    .line 570
    and-long v6, v1, p2

    .line 571
    .line 572
    long-to-int v6, v6

    .line 573
    shr-long v7, v1, p1

    .line 574
    .line 575
    long-to-int v7, v7

    .line 576
    invoke-static {v6, v7}, Li2/e0;->b(II)J

    .line 577
    .line 578
    .line 579
    move-result-wide v6

    .line 580
    invoke-static {v6, v7, v4, v5}, Li2/m0;->b(JJ)Z

    .line 581
    .line 582
    .line 583
    move-result v6

    .line 584
    if-eqz v6, :cond_1f

    .line 585
    .line 586
    move v12, v3

    .line 587
    goto :goto_13

    .line 588
    :cond_1f
    const/4 v12, 0x0

    .line 589
    :goto_13
    invoke-static {v1, v2}, Li2/m0;->c(J)Z

    .line 590
    .line 591
    .line 592
    move-result v6

    .line 593
    if-eqz v6, :cond_20

    .line 594
    .line 595
    invoke-static {v4, v5}, Li2/m0;->c(J)Z

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    if-eqz v4, :cond_20

    .line 600
    .line 601
    move v4, v3

    .line 602
    goto :goto_14

    .line 603
    :cond_20
    const/4 v4, 0x0

    .line 604
    :goto_14
    if-eqz p7, :cond_21

    .line 605
    .line 606
    iget-object v5, v13, Li2/g;->h:Ljava/lang/String;

    .line 607
    .line 608
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 609
    .line 610
    .line 611
    move-result v5

    .line 612
    if-lez v5, :cond_21

    .line 613
    .line 614
    if-nez v12, :cond_21

    .line 615
    .line 616
    if-nez v4, :cond_21

    .line 617
    .line 618
    if-eqz p8, :cond_21

    .line 619
    .line 620
    iget-object v4, v0, Lh0/d1;->j:Ln1/a;

    .line 621
    .line 622
    if-eqz v4, :cond_21

    .line 623
    .line 624
    move-object/from16 v5, p8

    .line 625
    .line 626
    iget v5, v5, Ln1/b;->a:I

    .line 627
    .line 628
    check-cast v4, Ln1/c;

    .line 629
    .line 630
    invoke-virtual {v4, v5}, Ln1/c;->a(I)V

    .line 631
    .line 632
    .line 633
    :cond_21
    invoke-static {v13, v1, v2}, Lh0/d1;->e(Li2/g;J)Ln2/s;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    iget-object v5, v0, Lh0/d1;->c:Lfg/l;

    .line 638
    .line 639
    invoke-interface {v5, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    new-instance v4, Li2/m0;

    .line 643
    .line 644
    invoke-direct {v4, v1, v2}, Li2/m0;-><init>(J)V

    .line 645
    .line 646
    .line 647
    iput-object v4, v0, Lh0/d1;->v:Li2/m0;

    .line 648
    .line 649
    if-nez p7, :cond_22

    .line 650
    .line 651
    invoke-static {v1, v2}, Li2/m0;->c(J)Z

    .line 652
    .line 653
    .line 654
    move-result v4

    .line 655
    xor-int/2addr v4, v3

    .line 656
    invoke-virtual {v0, v4}, Lh0/d1;->t(Z)V

    .line 657
    .line 658
    .line 659
    :cond_22
    iget-object v4, v0, Lh0/d1;->d:Lw/q0;

    .line 660
    .line 661
    if-eqz v4, :cond_23

    .line 662
    .line 663
    iget-object v4, v4, Lw/q0;->q:Li0/j1;

    .line 664
    .line 665
    invoke-static/range {p7 .. p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 666
    .line 667
    .line 668
    move-result-object v5

    .line 669
    invoke-virtual {v4, v5}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    :cond_23
    iget-object v4, v0, Lh0/d1;->d:Lw/q0;

    .line 673
    .line 674
    if-eqz v4, :cond_25

    .line 675
    .line 676
    invoke-static {v1, v2}, Li2/m0;->c(J)Z

    .line 677
    .line 678
    .line 679
    move-result v5

    .line 680
    if-nez v5, :cond_24

    .line 681
    .line 682
    invoke-static {v0, v3}, Lfb/v0;->z(Lh0/d1;Z)Z

    .line 683
    .line 684
    .line 685
    move-result v5

    .line 686
    if-eqz v5, :cond_24

    .line 687
    .line 688
    move v12, v3

    .line 689
    goto :goto_15

    .line 690
    :cond_24
    const/4 v12, 0x0

    .line 691
    :goto_15
    iget-object v4, v4, Lw/q0;->m:Li0/j1;

    .line 692
    .line 693
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 694
    .line 695
    .line 696
    move-result-object v5

    .line 697
    invoke-virtual {v4, v5}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    :cond_25
    iget-object v4, v0, Lh0/d1;->d:Lw/q0;

    .line 701
    .line 702
    if-eqz v4, :cond_27

    .line 703
    .line 704
    invoke-static {v1, v2}, Li2/m0;->c(J)Z

    .line 705
    .line 706
    .line 707
    move-result v5

    .line 708
    const/4 v12, 0x0

    .line 709
    if-nez v5, :cond_26

    .line 710
    .line 711
    invoke-static {v0, v12}, Lfb/v0;->z(Lh0/d1;Z)Z

    .line 712
    .line 713
    .line 714
    move-result v5

    .line 715
    if-eqz v5, :cond_26

    .line 716
    .line 717
    move v5, v3

    .line 718
    goto :goto_16

    .line 719
    :cond_26
    move v5, v12

    .line 720
    :goto_16
    iget-object v4, v4, Lw/q0;->n:Li0/j1;

    .line 721
    .line 722
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 723
    .line 724
    .line 725
    move-result-object v5

    .line 726
    invoke-virtual {v4, v5}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 727
    .line 728
    .line 729
    goto :goto_17

    .line 730
    :cond_27
    const/4 v12, 0x0

    .line 731
    :goto_17
    iget-object v4, v0, Lh0/d1;->d:Lw/q0;

    .line 732
    .line 733
    if-eqz v4, :cond_29

    .line 734
    .line 735
    invoke-static {v1, v2}, Li2/m0;->c(J)Z

    .line 736
    .line 737
    .line 738
    move-result v5

    .line 739
    if-eqz v5, :cond_28

    .line 740
    .line 741
    invoke-static {v0, v3}, Lfb/v0;->z(Lh0/d1;Z)Z

    .line 742
    .line 743
    .line 744
    move-result v0

    .line 745
    if-eqz v0, :cond_28

    .line 746
    .line 747
    move v5, v3

    .line 748
    goto :goto_18

    .line 749
    :cond_28
    move v5, v12

    .line 750
    :goto_18
    iget-object v0, v4, Lw/q0;->o:Li0/j1;

    .line 751
    .line 752
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 753
    .line 754
    .line 755
    move-result-object v3

    .line 756
    invoke-virtual {v0, v3}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    :cond_29
    return-wide v1

    .line 760
    :cond_2a
    :goto_19
    sget-wide v0, Li2/m0;->b:J

    .line 761
    .line 762
    return-wide v0

    .line 763
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Li2/g;J)Ln2/s;
    .locals 2

    .line 1
    new-instance v0, Ln2/s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, Ln2/s;-><init>(Li2/g;JLi2/m0;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public final d(Z)Lqg/e1;
    .locals 3

    .line 1
    iget-object v0, p0, Lh0/d1;->h:Lqg/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v2, Lh0/x0;

    .line 7
    .line 8
    invoke-direct {v2, p0, p1, v1}, Lh0/x0;-><init>(Lh0/d1;ZLwf/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-static {v0, v1, v2, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    return-object v1
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lh0/d1;->h:Lqg/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lh0/u0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v2}, Lh0/u0;-><init>(Lh0/d1;Lwf/c;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v3, v1, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final g(Le1/b;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v0, v0, Ln2/s;->b:J

    .line 6
    .line 7
    invoke-static {v0, v1}, Li2/m0;->c(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lh0/d1;->d:Lw/q0;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lw/q0;->d()Lw/m1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v1

    .line 24
    :goto_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v2, p0, Lh0/d1;->b:Lb5/k;

    .line 29
    .line 30
    iget-wide v3, p1, Le1/b;->a:J

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    invoke-virtual {v0, v3, v4, v5}, Lw/m1;->b(JZ)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {v2, v0}, Lb5/k;->n(I)I

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-wide v2, v0, Ln2/s;->b:J

    .line 46
    .line 47
    invoke-static {v2, v3}, Li2/m0;->e(J)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    :goto_1
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v0, v0}, Li2/e0;->b(II)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    const/4 v0, 0x5

    .line 60
    invoke-static {v2, v1, v3, v4, v0}, Ln2/s;->a(Ln2/s;Li2/g;JI)Ln2/s;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lh0/d1;->c:Lfg/l;

    .line 65
    .line 66
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    iget-wide v0, v0, Ln2/s;->b:J

    .line 70
    .line 71
    new-instance v2, Li2/m0;

    .line 72
    .line 73
    invoke-direct {v2, v0, v1}, Li2/m0;-><init>(J)V

    .line 74
    .line 75
    .line 76
    iput-object v2, p0, Lh0/d1;->v:Li2/m0;

    .line 77
    .line 78
    :cond_2
    if-eqz p1, :cond_3

    .line 79
    .line 80
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object p1, p1, Ln2/s;->a:Li2/g;

    .line 85
    .line 86
    iget-object p1, p1, Li2/g;->h:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-lez p1, :cond_3

    .line 93
    .line 94
    sget-object p1, Lw/h0;->i:Lw/h0;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    sget-object p1, Lw/h0;->g:Lw/h0;

    .line 98
    .line 99
    :goto_2
    invoke-virtual {p0, p1}, Lh0/d1;->q(Lw/h0;)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    invoke-virtual {p0, p1}, Lh0/d1;->t(Z)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final h(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/d1;->d:Lw/q0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lw/q0;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lh0/d1;->k:Ld1/v;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, Ld1/v;->a(Ld1/v;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lh0/d1;->t:Ln2/s;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lh0/d1;->t(Z)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lw/h0;->h:Lw/h0;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lh0/d1;->q(Lw/h0;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final i()Le1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/d1;->r:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Le1/b;

    .line 8
    .line 9
    return-object v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/d1;->l:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/d1;->m:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final l(Z)J
    .locals 11

    .line 1
    iget-object v0, p0, Lh0/d1;->d:Lw/q0;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {v0}, Lw/q0;->d()Lw/m1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_a

    .line 10
    .line 11
    iget-object v0, v0, Lw/m1;->a:Li2/k0;

    .line 12
    .line 13
    iget-object v1, v0, Li2/k0;->b:Li2/o;

    .line 14
    .line 15
    invoke-virtual {p0}, Lh0/d1;->m()Li2/g;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_0
    iget-object v3, v0, Li2/k0;->a:Li2/j0;

    .line 24
    .line 25
    iget-object v3, v3, Li2/j0;->a:Li2/g;

    .line 26
    .line 27
    iget-object v3, v3, Li2/g;->h:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, v2, Li2/g;->h:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_1
    const-wide v2, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const/16 v4, 0x20

    .line 45
    .line 46
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    iget-wide v5, v5, Ln2/s;->b:J

    .line 53
    .line 54
    sget v7, Li2/m0;->c:I

    .line 55
    .line 56
    shr-long/2addr v5, v4

    .line 57
    :goto_0
    long-to-int v5, v5

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget-wide v5, v5, Ln2/s;->b:J

    .line 60
    .line 61
    sget v7, Li2/m0;->c:I

    .line 62
    .line 63
    and-long/2addr v5, v2

    .line 64
    goto :goto_0

    .line 65
    :goto_1
    iget-object v6, p0, Lh0/d1;->b:Lb5/k;

    .line 66
    .line 67
    invoke-virtual {v6, v5}, Lb5/k;->l(I)I

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lh0/d1;->n()Ln2/s;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    iget-wide v6, v6, Ln2/s;->b:J

    .line 75
    .line 76
    invoke-static {v6, v7}, Li2/m0;->g(J)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    iget-wide v7, v0, Li2/k0;->c:J

    .line 81
    .line 82
    invoke-virtual {v1, v5}, Li2/o;->d(I)I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    iget v10, v1, Li2/o;->f:I

    .line 87
    .line 88
    if-lt v9, v10, :cond_3

    .line 89
    .line 90
    goto/16 :goto_6

    .line 91
    .line 92
    :cond_3
    const/4 v10, 0x0

    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    if-eqz v6, :cond_5

    .line 96
    .line 97
    :cond_4
    if-nez p1, :cond_6

    .line 98
    .line 99
    if-eqz v6, :cond_6

    .line 100
    .line 101
    :cond_5
    move p1, v5

    .line 102
    goto :goto_2

    .line 103
    :cond_6
    add-int/lit8 p1, v5, -0x1

    .line 104
    .line 105
    invoke-static {p1, v10}, Ljava/lang/Math;->max(II)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    :goto_2
    invoke-virtual {v0, p1}, Li2/k0;->a(I)Lt2/j;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v0, v5}, Li2/k0;->h(I)Lt2/j;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-ne p1, v0, :cond_7

    .line 118
    .line 119
    const/4 p1, 0x1

    .line 120
    goto :goto_3

    .line 121
    :cond_7
    move p1, v10

    .line 122
    :goto_3
    invoke-virtual {v1, v5}, Li2/o;->l(I)V

    .line 123
    .line 124
    .line 125
    iget-object v0, v1, Li2/o;->a:Lbe/k;

    .line 126
    .line 127
    iget-object v0, v0, Lbe/k;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Li2/g;

    .line 130
    .line 131
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    iget-object v6, v1, Li2/o;->h:Ljava/util/ArrayList;

    .line 138
    .line 139
    if-ne v5, v0, :cond_8

    .line 140
    .line 141
    invoke-static {v6}, La/a;->b0(Ljava/util/List;)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    goto :goto_4

    .line 146
    :cond_8
    invoke-static {v5, v6}, Li2/e0;->d(ILjava/util/List;)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    :goto_4
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Li2/r;

    .line 155
    .line 156
    iget-object v6, v0, Li2/r;->a:Li2/a;

    .line 157
    .line 158
    invoke-virtual {v0, v5}, Li2/r;->d(I)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    iget-object v5, v6, Li2/a;->d:Lj2/k;

    .line 163
    .line 164
    if-eqz p1, :cond_9

    .line 165
    .line 166
    invoke-virtual {v5, v0, v10}, Lj2/k;->h(IZ)F

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    goto :goto_5

    .line 171
    :cond_9
    invoke-virtual {v5, v0, v10}, Lj2/k;->i(IZ)F

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    :goto_5
    shr-long v5, v7, v4

    .line 176
    .line 177
    long-to-int v0, v5

    .line 178
    int-to-float v0, v0

    .line 179
    const/4 v5, 0x0

    .line 180
    invoke-static {p1, v5, v0}, Lr9/e0;->q(FFF)F

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    invoke-virtual {v1, v9}, Li2/o;->b(I)F

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    and-long v6, v7, v2

    .line 189
    .line 190
    long-to-int v1, v6

    .line 191
    int-to-float v1, v1

    .line 192
    invoke-static {v0, v5, v1}, Lr9/e0;->q(FFF)F

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    int-to-long v5, p1

    .line 201
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    int-to-long v0, p1

    .line 206
    shl-long v4, v5, v4

    .line 207
    .line 208
    and-long/2addr v0, v2

    .line 209
    or-long/2addr v0, v4

    .line 210
    return-wide v0

    .line 211
    :cond_a
    :goto_6
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    return-wide v0
.end method

.method public final m()Li2/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/d1;->d:Lw/q0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lw/q0;->a:Lw/x0;

    .line 6
    .line 7
    iget-object v0, v0, Lw/x0;->a:Li2/g;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final n()Ln2/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/d1;->e:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ln2/s;

    .line 8
    .line 9
    return-object v0
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh0/d1;->x:Lb/e;

    .line 2
    .line 3
    iget-object v0, v0, Lb/e;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lc0/n;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lc0/n;->A:Lqg/e1;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, v2}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    iput-object v2, v0, Lc0/n;->A:Lqg/e1;

    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method public final p()V
    .locals 4

    .line 1
    iget-object v0, p0, Lh0/d1;->h:Lqg/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lh0/u0;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v2}, Lh0/u0;-><init>(Lh0/d1;Lwf/c;I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-static {v0, v3, v1, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final q(Lw/h0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/d1;->d:Lw/q0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lw/q0;->a()Lw/h0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v1, p1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v0, Lw/q0;->k:Li0/j1;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final r()V
    .locals 7

    .line 1
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lw0/f;->e()Lfg/l;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v2, v1

    .line 14
    :goto_0
    invoke-static {v0}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    :try_start_0
    invoke-virtual {p0}, Lh0/d1;->k()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_6

    .line 23
    .line 24
    iget-object v4, p0, Lh0/d1;->d:Lw/q0;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    iget-object v4, v4, Lw/q0;->q:Li0/j1;

    .line 29
    .line 30
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    invoke-static {v0, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lh0/d1;->x:Lb/e;

    .line 47
    .line 48
    iget-object v2, v0, Lb/e;->i:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lc0/o;

    .line 51
    .line 52
    sget-object v3, Lc0/o;->g:Lc0/o;

    .line 53
    .line 54
    if-eq v2, v3, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const-string v2, "ToolbarRequester is not initialized."

    .line 58
    .line 59
    invoke-static {v2}, Lo/b;->c(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    iget-object v0, v0, Lb/e;->h:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lc0/n;

    .line 65
    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    iget-boolean v2, v0, Ly0/n;->t:Z

    .line 69
    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    iget-object v2, v0, Lc0/n;->A:Lqg/e1;

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    invoke-virtual {v2}, Lqg/y0;->b()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-ne v2, v3, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    sget-object v2, Ld0/f;->b:Li0/u;

    .line 85
    .line 86
    invoke-static {v0, v2}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Ld0/e;

    .line 91
    .line 92
    if-nez v2, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    invoke-virtual {v0}, Ly0/n;->Y0()Lqg/t;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    new-instance v5, Lc0/m;

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    invoke-direct {v5, v0, v2, v1, v6}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v4, v1, v5, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iput-object v1, v0, Lc0/n;->A:Lqg/e1;

    .line 110
    .line 111
    :cond_5
    :goto_2
    return-void

    .line 112
    :catchall_0
    move-exception v1

    .line 113
    goto :goto_4

    .line 114
    :cond_6
    :goto_3
    invoke-static {v0, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :goto_4
    invoke-static {v0, v3, v2}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 119
    .line 120
    .line 121
    throw v1
.end method

.method public final s(Lyf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lh0/c1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lh0/c1;

    .line 7
    .line 8
    iget v1, v0, Lh0/c1;->j:I

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
    iput v1, v0, Lh0/c1;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lh0/c1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lh0/c1;-><init>(Lh0/d1;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lh0/c1;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lh0/c1;->j:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Lh0/c1;->g:Lh0/d1;

    .line 35
    .line 36
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return-object p1

    .line 47
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lh0/d1;->g:Ly1/y0;

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    iput-object p0, v0, Lh0/c1;->g:Lh0/d1;

    .line 55
    .line 56
    iput v2, v0, Lh0/c1;->j:I

    .line 57
    .line 58
    check-cast p1, Ly1/h;

    .line 59
    .line 60
    iget-object p1, p1, Ly1/h;->a:Ly1/i;

    .line 61
    .line 62
    invoke-virtual {p1}, Ly1/i;->a()Landroid/content/ClipboardManager;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/4 v0, 0x0

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    const-string v1, "text/*"

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-ne p1, v2, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move v2, v0

    .line 83
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 88
    .line 89
    if-ne p1, v0, :cond_4

    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_4
    move-object v0, p0

    .line 93
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v0, v0, Lh0/d1;->w:Li0/j1;

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 104
    .line 105
    return-object p1
.end method

.method public final t(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/d1;->d:Lw/q0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lw/q0;->l:Li0/j1;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lh0/d1;->r()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-virtual {p0}, Lh0/d1;->o()V

    .line 21
    .line 22
    .line 23
    return-void
.end method
