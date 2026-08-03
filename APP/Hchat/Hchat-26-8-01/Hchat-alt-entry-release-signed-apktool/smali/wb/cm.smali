.class public final synthetic Lwb/cm;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lsh/x;

.field public final synthetic h:Lr/z;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:I

.field public final synthetic k:Lfg/a;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Landroid/content/SharedPreferences;ILfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/cm;->g:Lsh/x;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/cm;->h:Lr/z;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/cm;->i:Landroid/content/SharedPreferences;

    .line 9
    .line 10
    iput p4, p0, Lwb/cm;->j:I

    .line 11
    .line 12
    iput-object p5, p0, Lwb/cm;->k:Lfg/a;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/cm;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/cm;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/cm;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/cm;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/cm;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/cm;->q:Li0/a1;

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
    iget-object v3, v0, Lwb/cm;->g:Lsh/x;

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
    iget-object v13, v0, Lwb/cm;->i:Landroid/content/SharedPreferences;

    .line 86
    .line 87
    invoke-virtual {v11, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iget v14, v0, Lwb/cm;->j:I

    .line 92
    .line 93
    invoke-virtual {v11, v14}, Li0/h0;->d(I)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    or-int/2addr v1, v3

    .line 98
    iget-object v15, v0, Lwb/cm;->k:Lfg/a;

    .line 99
    .line 100
    invoke-virtual {v11, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    or-int/2addr v1, v3

    .line 105
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    if-nez v1, :cond_3

    .line 110
    .line 111
    sget-object v1, Li0/l;->a:Li0/e;

    .line 112
    .line 113
    if-ne v3, v1, :cond_4

    .line 114
    .line 115
    :cond_3
    new-instance v12, Lwb/n9;

    .line 116
    .line 117
    iget-object v1, v0, Lwb/cm;->l:Li0/a1;

    .line 118
    .line 119
    iget-object v3, v0, Lwb/cm;->m:Li0/a1;

    .line 120
    .line 121
    iget-object v5, v0, Lwb/cm;->n:Li0/a1;

    .line 122
    .line 123
    iget-object v6, v0, Lwb/cm;->o:Li0/a1;

    .line 124
    .line 125
    iget-object v7, v0, Lwb/cm;->p:Li0/a1;

    .line 126
    .line 127
    iget-object v8, v0, Lwb/cm;->q:Li0/a1;

    .line 128
    .line 129
    move-object/from16 v16, v1

    .line 130
    .line 131
    move-object/from16 v17, v3

    .line 132
    .line 133
    move-object/from16 v18, v5

    .line 134
    .line 135
    move-object/from16 v19, v6

    .line 136
    .line 137
    move-object/from16 v20, v7

    .line 138
    .line 139
    move-object/from16 v21, v8

    .line 140
    .line 141
    invoke-direct/range {v12 .. v21}, Lwb/n9;-><init>(Landroid/content/SharedPreferences;ILfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    move-object v3, v12

    .line 148
    :cond_4
    move-object v10, v3

    .line 149
    check-cast v10, Lfg/l;

    .line 150
    .line 151
    const/4 v12, 0x0

    .line 152
    const/16 v13, 0x1f8

    .line 153
    .line 154
    iget-object v3, v0, Lwb/cm;->h:Lr/z;

    .line 155
    .line 156
    const/4 v5, 0x0

    .line 157
    const/4 v6, 0x0

    .line 158
    const/4 v7, 0x0

    .line 159
    const/4 v8, 0x0

    .line 160
    const/4 v9, 0x0

    .line 161
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 166
    .line 167
    .line 168
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 169
    .line 170
    return-object v1
.end method
