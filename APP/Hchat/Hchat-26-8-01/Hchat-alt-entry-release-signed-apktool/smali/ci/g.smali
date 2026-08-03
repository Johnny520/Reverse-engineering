.class public final Lci/g;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:Lqg/e1;

.field public i:Ln/n;

.field public j:Z

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lm/q1;

.field public final synthetic n:J

.field public final synthetic o:Ln/k;

.field public final synthetic p:Lci/l0;


# direct methods
.method public constructor <init>(Lm/q1;JLn/k;Lci/l0;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lci/g;->m:Lm/q1;

    .line 2
    .line 3
    iput-wide p2, p0, Lci/g;->n:J

    .line 4
    .line 5
    iput-object p4, p0, Lci/g;->o:Ln/k;

    .line 6
    .line 7
    iput-object p5, p0, Lci/g;->p:Lci/l0;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Lyf/i;-><init>(ILwf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 7

    .line 1
    new-instance v0, Lci/g;

    .line 2
    .line 3
    iget-object v4, p0, Lci/g;->o:Ln/k;

    .line 4
    .line 5
    iget-object v5, p0, Lci/g;->p:Lci/l0;

    .line 6
    .line 7
    iget-object v1, p0, Lci/g;->m:Lm/q1;

    .line 8
    .line 9
    iget-wide v2, p0, Lci/g;->n:J

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Lci/g;-><init>(Lm/q1;JLn/k;Lci/l0;Lwf/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lci/g;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqg/t;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lci/g;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lci/g;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lci/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lci/g;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lqg/t;

    .line 6
    .line 7
    iget v2, v0, Lci/g;->k:I

    .line 8
    .line 9
    iget-object v4, v0, Lci/g;->p:Lci/l0;

    .line 10
    .line 11
    const/4 v10, 0x5

    .line 12
    const/4 v11, 0x4

    .line 13
    const/4 v12, 0x3

    .line 14
    const/4 v13, 0x2

    .line 15
    const/4 v14, 0x1

    .line 16
    iget-object v15, v0, Lci/g;->o:Ln/k;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 20
    .line 21
    if-eqz v2, :cond_5

    .line 22
    .line 23
    if-eq v2, v14, :cond_4

    .line 24
    .line 25
    if-eq v2, v13, :cond_3

    .line 26
    .line 27
    if-eq v2, v12, :cond_2

    .line 28
    .line 29
    if-eq v2, v11, :cond_1

    .line 30
    .line 31
    if-ne v2, v10, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    return-object v1

    .line 41
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object v2, v3

    .line 45
    goto/16 :goto_6

    .line 46
    .line 47
    :cond_2
    iget-boolean v1, v0, Lci/g;->j:Z

    .line 48
    .line 49
    iget-object v2, v0, Lci/g;->i:Ln/n;

    .line 50
    .line 51
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object v10, v5

    .line 55
    move-object v5, v2

    .line 56
    move-object v2, v3

    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_3
    iget-boolean v1, v0, Lci/g;->j:Z

    .line 60
    .line 61
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object v2, v3

    .line 65
    move-object v10, v5

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    iget-object v1, v0, Lci/g;->h:Lqg/e1;

    .line 68
    .line 69
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object v2, v3

    .line 73
    move-object v10, v5

    .line 74
    move-object/from16 v3, p1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object v2, v3

    .line 81
    new-instance v3, Lc0/i;

    .line 82
    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v9, 0x1

    .line 85
    move-object v7, v5

    .line 86
    iget-wide v5, v0, Lci/g;->n:J

    .line 87
    .line 88
    move-object/from16 v16, v7

    .line 89
    .line 90
    iget-object v7, v0, Lci/g;->o:Ln/k;

    .line 91
    .line 92
    move-object/from16 v10, v16

    .line 93
    .line 94
    invoke-direct/range {v3 .. v9}, Lc0/i;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lwf/c;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v2, v3, v12}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iput-object v2, v0, Lci/g;->l:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v1, v0, Lci/g;->h:Lqg/e1;

    .line 104
    .line 105
    iput v14, v0, Lci/g;->k:I

    .line 106
    .line 107
    iget-object v3, v0, Lci/g;->m:Lm/q1;

    .line 108
    .line 109
    invoke-interface {v3, v0}, Lm/q1;->T(Lyf/c;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    if-ne v3, v10, :cond_6

    .line 114
    .line 115
    goto/16 :goto_5

    .line 116
    .line 117
    :cond_6
    :goto_1
    check-cast v3, Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-interface {v1}, Lqg/r0;->b()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_9

    .line 128
    .line 129
    iput-object v2, v0, Lci/g;->l:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v2, v0, Lci/g;->h:Lqg/e1;

    .line 132
    .line 133
    iput-boolean v3, v0, Lci/g;->j:Z

    .line 134
    .line 135
    iput v13, v0, Lci/g;->k:I

    .line 136
    .line 137
    invoke-static {v1, v0}, Lqg/v;->d(Lqg/r0;Lyf/i;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-ne v1, v10, :cond_7

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_7
    move v1, v3

    .line 145
    :goto_2
    if-eqz v1, :cond_b

    .line 146
    .line 147
    new-instance v3, Ln/m;

    .line 148
    .line 149
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 150
    .line 151
    .line 152
    new-instance v5, Ln/n;

    .line 153
    .line 154
    invoke-direct {v5, v3}, Ln/n;-><init>(Ln/m;)V

    .line 155
    .line 156
    .line 157
    iput-object v2, v0, Lci/g;->l:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v2, v0, Lci/g;->h:Lqg/e1;

    .line 160
    .line 161
    iput-object v5, v0, Lci/g;->i:Ln/n;

    .line 162
    .line 163
    iput-boolean v1, v0, Lci/g;->j:Z

    .line 164
    .line 165
    iput v12, v0, Lci/g;->k:I

    .line 166
    .line 167
    invoke-virtual {v15, v3, v0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    if-ne v3, v10, :cond_8

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_8
    :goto_3
    iput-object v2, v0, Lci/g;->l:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v2, v0, Lci/g;->h:Lqg/e1;

    .line 177
    .line 178
    iput-object v2, v0, Lci/g;->i:Ln/n;

    .line 179
    .line 180
    iput-boolean v1, v0, Lci/g;->j:Z

    .line 181
    .line 182
    iput v11, v0, Lci/g;->k:I

    .line 183
    .line 184
    invoke-virtual {v15, v5, v0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    if-ne v1, v10, :cond_b

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_9
    iget-object v1, v4, Lci/l0;->B:Ln/m;

    .line 192
    .line 193
    if-eqz v1, :cond_b

    .line 194
    .line 195
    if-eqz v3, :cond_a

    .line 196
    .line 197
    new-instance v5, Ln/n;

    .line 198
    .line 199
    invoke-direct {v5, v1}, Ln/n;-><init>(Ln/m;)V

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_a
    new-instance v5, Ln/l;

    .line 204
    .line 205
    invoke-direct {v5, v1}, Ln/l;-><init>(Ln/m;)V

    .line 206
    .line 207
    .line 208
    :goto_4
    iput-object v2, v0, Lci/g;->l:Ljava/lang/Object;

    .line 209
    .line 210
    iput-object v2, v0, Lci/g;->h:Lqg/e1;

    .line 211
    .line 212
    iput-object v2, v0, Lci/g;->i:Ln/n;

    .line 213
    .line 214
    iput-boolean v3, v0, Lci/g;->j:Z

    .line 215
    .line 216
    const/4 v1, 0x5

    .line 217
    iput v1, v0, Lci/g;->k:I

    .line 218
    .line 219
    invoke-virtual {v15, v5, v0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-ne v1, v10, :cond_b

    .line 224
    .line 225
    :goto_5
    return-object v10

    .line 226
    :cond_b
    :goto_6
    iput-object v2, v4, Lci/l0;->B:Ln/m;

    .line 227
    .line 228
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 229
    .line 230
    return-object v1
.end method
