.class public final synthetic Lwb/nl;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lsh/x;

.field public final synthetic h:Lr/z;

.field public final synthetic i:I

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Z

.field public final synthetic l:Ldb/c;

.field public final synthetic m:Lfg/a;

.field public final synthetic n:Lfg/l;

.field public final synthetic o:Lfg/p;

.field public final synthetic p:Lfg/l;

.field public final synthetic q:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;ILfg/l;ZLdb/c;Lfg/a;Lfg/l;Lfg/p;Lfg/l;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/nl;->g:Lsh/x;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/nl;->h:Lr/z;

    .line 7
    .line 8
    iput p3, p0, Lwb/nl;->i:I

    .line 9
    .line 10
    iput-object p4, p0, Lwb/nl;->j:Lfg/l;

    .line 11
    .line 12
    iput-boolean p5, p0, Lwb/nl;->k:Z

    .line 13
    .line 14
    iput-object p6, p0, Lwb/nl;->l:Ldb/c;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/nl;->m:Lfg/a;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/nl;->n:Lfg/l;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/nl;->o:Lfg/p;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/nl;->p:Lfg/l;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/nl;->q:Ljava/util/ArrayList;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lp/x0;

    .line 6
    .line 7
    move-object/from16 v11, p2

    .line 8
    .line 9
    check-cast v11, Li0/h0;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v3, v2, 0x6

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v3, 0x2

    .line 35
    :goto_0
    or-int/2addr v2, v3

    .line 36
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 37
    .line 38
    const/16 v4, 0x12

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    if-eq v3, v4, :cond_2

    .line 42
    .line 43
    move v3, v5

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const/4 v3, 0x0

    .line 46
    :goto_1
    and-int/2addr v2, v5

    .line 47
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_5

    .line 52
    .line 53
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 54
    .line 55
    iget-object v3, v0, Lwb/nl;->g:Lsh/x;

    .line 56
    .line 57
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v1}, Lp/x0;->c()F

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    const/16 v4, 0x8

    .line 69
    .line 70
    int-to-float v4, v4

    .line 71
    add-float/2addr v3, v4

    .line 72
    invoke-interface {v1}, Lp/x0;->a()F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/16 v4, 0x54

    .line 77
    .line 78
    int-to-float v4, v4

    .line 79
    add-float/2addr v1, v4

    .line 80
    const/4 v4, 0x5

    .line 81
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    iget v14, v0, Lwb/nl;->i:I

    .line 86
    .line 87
    invoke-virtual {v11, v14}, Li0/h0;->d(I)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iget-object v15, v0, Lwb/nl;->j:Lfg/l;

    .line 92
    .line 93
    invoke-virtual {v11, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    or-int/2addr v1, v3

    .line 98
    iget-boolean v13, v0, Lwb/nl;->k:Z

    .line 99
    .line 100
    invoke-virtual {v11, v13}, Li0/h0;->g(Z)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    or-int/2addr v1, v3

    .line 105
    iget-object v3, v0, Lwb/nl;->l:Ldb/c;

    .line 106
    .line 107
    invoke-virtual {v11, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    or-int/2addr v1, v5

    .line 112
    iget-object v5, v0, Lwb/nl;->m:Lfg/a;

    .line 113
    .line 114
    invoke-virtual {v11, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    or-int/2addr v1, v6

    .line 119
    iget-object v6, v0, Lwb/nl;->n:Lfg/l;

    .line 120
    .line 121
    invoke-virtual {v11, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    or-int/2addr v1, v7

    .line 126
    iget-object v7, v0, Lwb/nl;->o:Lfg/p;

    .line 127
    .line 128
    invoke-virtual {v11, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    or-int/2addr v1, v8

    .line 133
    iget-object v8, v0, Lwb/nl;->p:Lfg/l;

    .line 134
    .line 135
    invoke-virtual {v11, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    or-int/2addr v1, v9

    .line 140
    iget-object v9, v0, Lwb/nl;->q:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v11, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    or-int/2addr v1, v10

    .line 147
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    if-nez v1, :cond_3

    .line 152
    .line 153
    sget-object v1, Li0/l;->a:Li0/e;

    .line 154
    .line 155
    if-ne v10, v1, :cond_4

    .line 156
    .line 157
    :cond_3
    new-instance v12, Lwb/m9;

    .line 158
    .line 159
    move-object/from16 v16, v3

    .line 160
    .line 161
    move-object/from16 v17, v5

    .line 162
    .line 163
    move-object/from16 v18, v6

    .line 164
    .line 165
    move-object/from16 v19, v7

    .line 166
    .line 167
    move-object/from16 v20, v8

    .line 168
    .line 169
    move-object/from16 v21, v9

    .line 170
    .line 171
    invoke-direct/range {v12 .. v21}, Lwb/m9;-><init>(ZILfg/l;Ldb/c;Lfg/a;Lfg/l;Lfg/p;Lfg/l;Ljava/util/ArrayList;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    move-object v10, v12

    .line 178
    :cond_4
    check-cast v10, Lfg/l;

    .line 179
    .line 180
    const/4 v12, 0x0

    .line 181
    const/16 v13, 0x1f8

    .line 182
    .line 183
    iget-object v3, v0, Lwb/nl;->h:Lr/z;

    .line 184
    .line 185
    const/4 v5, 0x0

    .line 186
    const/4 v6, 0x0

    .line 187
    const/4 v7, 0x0

    .line 188
    const/4 v8, 0x0

    .line 189
    const/4 v9, 0x0

    .line 190
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_5
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 195
    .line 196
    .line 197
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 198
    .line 199
    return-object v1
.end method
