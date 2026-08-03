.class public final Lh0/b1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lw/y0;


# instance fields
.field public a:Z

.field public b:Li2/m0;

.field public c:Lg1/d;

.field public final synthetic d:Lh0/d1;


# direct methods
.method public constructor <init>(Lh0/d1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh0/b1;->d:Lh0/d1;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lh0/b1;->a:Z

    .line 8
    .line 9
    sget-object p1, Lh0/w;->d:Lg1/d;

    .line 10
    .line 11
    iput-object p1, p0, Lh0/b1;->c:Lg1/d;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(JLg1/d;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lh0/b1;->d:Lh0/d1;

    .line 2
    .line 3
    iget-object v1, v0, Lh0/d1;->q:Li0/j1;

    .line 4
    .line 5
    invoke-virtual {v0}, Lh0/d1;->k()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_5

    .line 10
    .line 11
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lw/g0;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_0
    sget-object v2, Lw/g0;->i:Lw/g0;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, -0x1

    .line 27
    iput v1, v0, Lh0/d1;->s:I

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    iput-boolean v1, p0, Lh0/b1;->a:Z

    .line 31
    .line 32
    iput-object p3, p0, Lh0/b1;->c:Lg1/d;

    .line 33
    .line 34
    invoke-virtual {v0}, Lh0/d1;->o()V

    .line 35
    .line 36
    .line 37
    iget-object p3, v0, Lh0/d1;->d:Lw/q0;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-eqz p3, :cond_2

    .line 41
    .line 42
    invoke-virtual {p3}, Lw/q0;->d()Lw/m1;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    if-eqz p3, :cond_2

    .line 47
    .line 48
    invoke-virtual {p3, p1, p2}, Lw/m1;->c(J)Z

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-ne p3, v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, Lh0/d1;->n()Ln2/s;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    iget-object p3, p3, Ln2/s;->a:Li2/g;

    .line 59
    .line 60
    iget-object p3, p3, Li2/g;->h:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    if-nez p3, :cond_1

    .line 67
    .line 68
    goto/16 :goto_1

    .line 69
    .line 70
    :cond_1
    invoke-virtual {v0, v2}, Lh0/d1;->h(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lh0/d1;->n()Ln2/s;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    sget-wide v3, Li2/m0;->b:J

    .line 78
    .line 79
    const/4 v1, 0x5

    .line 80
    const/4 v5, 0x0

    .line 81
    invoke-static {p3, v5, v3, v4, v1}, Ln2/s;->a(Ln2/s;Li2/g;JI)Ln2/s;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-object v6, p0, Lh0/b1;->c:Lg1/d;

    .line 86
    .line 87
    new-instance v8, Ln1/b;

    .line 88
    .line 89
    invoke-direct {v8, v2}, Ln1/b;-><init>(I)V

    .line 90
    .line 91
    .line 92
    const/4 v4, 0x1

    .line 93
    const/4 v5, 0x0

    .line 94
    const/4 v7, 0x1

    .line 95
    move-wide v2, p1

    .line 96
    invoke-static/range {v0 .. v8}, Lh0/d1;->c(Lh0/d1;Ln2/s;JZZLg1/d;ZLn1/b;)J

    .line 97
    .line 98
    .line 99
    move-result-wide p1

    .line 100
    move-wide v3, v2

    .line 101
    new-instance p3, Li2/m0;

    .line 102
    .line 103
    invoke-direct {p3, p1, p2}, Li2/m0;-><init>(J)V

    .line 104
    .line 105
    .line 106
    iput-object p3, v0, Lh0/d1;->o:Li2/m0;

    .line 107
    .line 108
    new-instance p3, Li2/m0;

    .line 109
    .line 110
    invoke-direct {p3, p1, p2}, Li2/m0;-><init>(J)V

    .line 111
    .line 112
    .line 113
    iput-object p3, p0, Lh0/b1;->b:Li2/m0;

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    move-wide v3, p1

    .line 117
    iget-object p1, v0, Lh0/d1;->d:Lw/q0;

    .line 118
    .line 119
    if-eqz p1, :cond_4

    .line 120
    .line 121
    invoke-virtual {p1}, Lw/q0;->d()Lw/m1;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-eqz p1, :cond_4

    .line 126
    .line 127
    invoke-virtual {p1, v3, v4, v1}, Lw/m1;->b(JZ)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    iget-object p2, v0, Lh0/d1;->b:Lb5/k;

    .line 132
    .line 133
    invoke-virtual {p2, p1}, Lb5/k;->n(I)I

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Lh0/d1;->n()Ln2/s;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    iget-object p2, p2, Ln2/s;->a:Li2/g;

    .line 141
    .line 142
    invoke-static {p1, p1}, Li2/e0;->b(II)J

    .line 143
    .line 144
    .line 145
    move-result-wide v5

    .line 146
    invoke-static {p2, v5, v6}, Lh0/d1;->e(Li2/g;J)Ln2/s;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {v0, v2}, Lh0/d1;->h(Z)V

    .line 151
    .line 152
    .line 153
    iget-object p2, v0, Lh0/d1;->j:Ln1/a;

    .line 154
    .line 155
    if-eqz p2, :cond_3

    .line 156
    .line 157
    check-cast p2, Ln1/c;

    .line 158
    .line 159
    invoke-virtual {p2, v2}, Ln1/c;->a(I)V

    .line 160
    .line 161
    .line 162
    :cond_3
    iget-object p2, v0, Lh0/d1;->c:Lfg/l;

    .line 163
    .line 164
    invoke-interface {p2, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    iget-wide p1, p1, Ln2/s;->b:J

    .line 168
    .line 169
    new-instance p3, Li2/m0;

    .line 170
    .line 171
    invoke-direct {p3, p1, p2}, Li2/m0;-><init>(J)V

    .line 172
    .line 173
    .line 174
    iput-object p3, v0, Lh0/d1;->v:Li2/m0;

    .line 175
    .line 176
    :cond_4
    iput-boolean v2, p0, Lh0/b1;->a:Z

    .line 177
    .line 178
    :goto_0
    sget-object p1, Lw/h0;->g:Lw/h0;

    .line 179
    .line 180
    invoke-virtual {v0, p1}, Lh0/d1;->q(Lw/h0;)V

    .line 181
    .line 182
    .line 183
    iput-wide v3, v0, Lh0/d1;->n:J

    .line 184
    .line 185
    new-instance p1, Le1/b;

    .line 186
    .line 187
    invoke-direct {p1, v3, v4}, Le1/b;-><init>(J)V

    .line 188
    .line 189
    .line 190
    iget-object p2, v0, Lh0/d1;->r:Li0/j1;

    .line 191
    .line 192
    invoke-virtual {p2, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    const-wide/16 p1, 0x0

    .line 196
    .line 197
    iput-wide p1, v0, Lh0/d1;->p:J

    .line 198
    .line 199
    :cond_5
    :goto_1
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lh0/b1;->f()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lh0/b1;->d:Lh0/d1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh0/d1;->k()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_6

    .line 8
    .line 9
    invoke-virtual {v0}, Lh0/d1;->n()Ln2/s;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Ln2/s;->a:Li2/g;

    .line 14
    .line 15
    iget-object v1, v1, Li2/g;->h:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    iget-wide v1, v0, Lh0/d1;->p:J

    .line 26
    .line 27
    invoke-static {v1, v2, p1, p2}, Le1/b;->e(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    iput-wide p1, v0, Lh0/d1;->p:J

    .line 32
    .line 33
    iget-object p1, v0, Lh0/d1;->d:Lw/q0;

    .line 34
    .line 35
    const/4 p2, 0x0

    .line 36
    if-eqz p1, :cond_5

    .line 37
    .line 38
    invoke-virtual {p1}, Lw/q0;->d()Lw/m1;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_5

    .line 43
    .line 44
    iget-wide v1, v0, Lh0/d1;->n:J

    .line 45
    .line 46
    iget-wide v3, v0, Lh0/d1;->p:J

    .line 47
    .line 48
    invoke-static {v1, v2, v3, v4}, Le1/b;->e(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    new-instance v3, Le1/b;

    .line 53
    .line 54
    invoke-direct {v3, v1, v2}, Le1/b;-><init>(J)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v0, Lh0/d1;->r:Li0/j1;

    .line 58
    .line 59
    invoke-virtual {v1, v3}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v1, v0, Lh0/d1;->o:Li2/m0;

    .line 63
    .line 64
    const/16 v2, 0x9

    .line 65
    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    invoke-virtual {v0}, Lh0/d1;->i()Le1/b;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-wide v3, v1, Le1/b;->a:J

    .line 76
    .line 77
    invoke-virtual {p1, v3, v4}, Lw/m1;->c(J)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_2

    .line 82
    .line 83
    iget-object v1, v0, Lh0/d1;->b:Lb5/k;

    .line 84
    .line 85
    iget-wide v3, v0, Lh0/d1;->n:J

    .line 86
    .line 87
    const/4 v5, 0x1

    .line 88
    invoke-virtual {p1, v3, v4, v5}, Lw/m1;->b(JZ)I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-virtual {v1, v3}, Lb5/k;->n(I)I

    .line 93
    .line 94
    .line 95
    iget-object v1, v0, Lh0/d1;->b:Lb5/k;

    .line 96
    .line 97
    invoke-virtual {v0}, Lh0/d1;->i()Le1/b;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-wide v6, v4, Le1/b;->a:J

    .line 105
    .line 106
    invoke-virtual {p1, v6, v7, v5}, Lw/m1;->b(JZ)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-virtual {v1, p1}, Lb5/k;->n(I)I

    .line 111
    .line 112
    .line 113
    if-ne v3, p1, :cond_1

    .line 114
    .line 115
    sget-object p1, Lh0/w;->d:Lg1/d;

    .line 116
    .line 117
    :goto_0
    move-object v6, p1

    .line 118
    goto :goto_1

    .line 119
    :cond_1
    sget-object p1, Lh0/w;->e:Lg1/d;

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :goto_1
    invoke-virtual {v0}, Lh0/d1;->n()Ln2/s;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v0}, Lh0/d1;->i()Le1/b;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-wide v3, p1, Le1/b;->a:J

    .line 134
    .line 135
    new-instance v8, Ln1/b;

    .line 136
    .line 137
    invoke-direct {v8, v2}, Ln1/b;-><init>(I)V

    .line 138
    .line 139
    .line 140
    move-wide v2, v3

    .line 141
    const/4 v4, 0x0

    .line 142
    const/4 v5, 0x0

    .line 143
    const/4 v7, 0x1

    .line 144
    invoke-static/range {v0 .. v8}, Lh0/d1;->c(Lh0/d1;Ln2/s;JZZLg1/d;ZLn1/b;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v1

    .line 148
    goto :goto_3

    .line 149
    :cond_2
    iget-object v1, v0, Lh0/d1;->o:Li2/m0;

    .line 150
    .line 151
    if-eqz v1, :cond_3

    .line 152
    .line 153
    iget-wide v3, v1, Li2/m0;->a:J

    .line 154
    .line 155
    const/16 v1, 0x20

    .line 156
    .line 157
    shr-long/2addr v3, v1

    .line 158
    long-to-int v1, v3

    .line 159
    goto :goto_2

    .line 160
    :cond_3
    iget-wide v3, v0, Lh0/d1;->n:J

    .line 161
    .line 162
    invoke-virtual {p1, v3, v4, p2}, Lw/m1;->b(JZ)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    :goto_2
    invoke-virtual {v0}, Lh0/d1;->i()Le1/b;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    iget-wide v3, v3, Le1/b;->a:J

    .line 174
    .line 175
    invoke-virtual {p1, v3, v4, p2}, Lw/m1;->b(JZ)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    iget-object v3, v0, Lh0/d1;->o:Li2/m0;

    .line 180
    .line 181
    if-nez v3, :cond_4

    .line 182
    .line 183
    if-ne v1, p1, :cond_4

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_4
    invoke-virtual {v0}, Lh0/d1;->n()Ln2/s;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v0}, Lh0/d1;->i()Le1/b;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    iget-wide v3, p1, Le1/b;->a:J

    .line 198
    .line 199
    iget-object v6, p0, Lh0/b1;->c:Lg1/d;

    .line 200
    .line 201
    new-instance v8, Ln1/b;

    .line 202
    .line 203
    invoke-direct {v8, v2}, Ln1/b;-><init>(I)V

    .line 204
    .line 205
    .line 206
    move-wide v2, v3

    .line 207
    const/4 v4, 0x0

    .line 208
    const/4 v5, 0x0

    .line 209
    const/4 v7, 0x1

    .line 210
    invoke-static/range {v0 .. v8}, Lh0/d1;->c(Lh0/d1;Ln2/s;JZZLg1/d;ZLn1/b;)J

    .line 211
    .line 212
    .line 213
    move-result-wide v1

    .line 214
    :goto_3
    new-instance p1, Li2/m0;

    .line 215
    .line 216
    invoke-direct {p1, v1, v2}, Li2/m0;-><init>(J)V

    .line 217
    .line 218
    .line 219
    iput-object p1, p0, Lh0/b1;->b:Li2/m0;

    .line 220
    .line 221
    iget-object p1, v0, Lh0/d1;->o:Li2/m0;

    .line 222
    .line 223
    invoke-static {p1, v1, v2}, Li2/m0;->a(Ljava/lang/Object;J)Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-nez p1, :cond_5

    .line 228
    .line 229
    iput-boolean p2, p0, Lh0/b1;->a:Z

    .line 230
    .line 231
    :cond_5
    invoke-virtual {v0, p2}, Lh0/d1;->t(Z)V

    .line 232
    .line 233
    .line 234
    :cond_6
    :goto_4
    return-void
.end method

.method public final f()V
    .locals 7

    .line 1
    iget-object v0, p0, Lh0/b1;->d:Lh0/d1;

    .line 2
    .line 3
    iget-object v1, v0, Lh0/d1;->q:Li0/j1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, Lh0/d1;->r:Li0/j1;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lh0/w;->d:Lg1/d;

    .line 15
    .line 16
    iput-object v1, p0, Lh0/b1;->c:Lg1/d;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, v1}, Lh0/d1;->t(Z)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lh0/b1;->b:Li2/m0;

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    iget-wide v3, v3, Li2/m0;->a:J

    .line 27
    .line 28
    :goto_0
    invoke-static {v3, v4}, Li2/m0;->c(J)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-virtual {v0}, Lh0/d1;->n()Ln2/s;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-wide v3, v3, Ln2/s;->b:J

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    if-eqz v3, :cond_1

    .line 41
    .line 42
    sget-object v4, Lw/h0;->i:Lw/h0;

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    sget-object v4, Lw/h0;->h:Lw/h0;

    .line 46
    .line 47
    :goto_2
    invoke-virtual {v0, v4}, Lh0/d1;->q(Lw/h0;)V

    .line 48
    .line 49
    .line 50
    iget-object v4, v0, Lh0/d1;->d:Lw/q0;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    if-nez v3, :cond_2

    .line 56
    .line 57
    invoke-static {v0, v1}, Lfb/v0;->z(Lh0/d1;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_2

    .line 62
    .line 63
    move v6, v1

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    move v6, v5

    .line 66
    :goto_3
    iget-object v4, v4, Lw/q0;->m:Li0/j1;

    .line 67
    .line 68
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v4, v6}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object v4, v0, Lh0/d1;->d:Lw/q0;

    .line 76
    .line 77
    if-eqz v4, :cond_5

    .line 78
    .line 79
    if-nez v3, :cond_4

    .line 80
    .line 81
    invoke-static {v0, v5}, Lfb/v0;->z(Lh0/d1;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_4

    .line 86
    .line 87
    move v6, v1

    .line 88
    goto :goto_4

    .line 89
    :cond_4
    move v6, v5

    .line 90
    :goto_4
    iget-object v4, v4, Lw/q0;->n:Li0/j1;

    .line 91
    .line 92
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v4, v6}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_5
    iget-object v4, v0, Lh0/d1;->d:Lw/q0;

    .line 100
    .line 101
    if-eqz v4, :cond_7

    .line 102
    .line 103
    if-eqz v3, :cond_6

    .line 104
    .line 105
    invoke-static {v0, v1}, Lfb/v0;->z(Lh0/d1;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_6

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_6
    move v1, v5

    .line 113
    :goto_5
    iget-object v3, v4, Lw/q0;->o:Li0/j1;

    .line 114
    .line 115
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v3, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_7
    iget-boolean v1, p0, Lh0/b1;->a:Z

    .line 123
    .line 124
    if-eqz v1, :cond_8

    .line 125
    .line 126
    iget-object v1, v0, Lh0/d1;->o:Li2/m0;

    .line 127
    .line 128
    invoke-static {v0, v1}, Lh0/d1;->b(Lh0/d1;Li2/m0;)V

    .line 129
    .line 130
    .line 131
    :cond_8
    iput-object v2, v0, Lh0/d1;->o:Li2/m0;

    .line 132
    .line 133
    return-void
.end method

.method public final onCancel()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lh0/b1;->f()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
