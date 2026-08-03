.class public final synthetic Lk/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Lf1/s;

.field public final synthetic i:J

.field public final synthetic j:F

.field public final synthetic k:F

.field public final synthetic l:J

.field public final synthetic m:J

.field public final synthetic n:Lh1/g;


# direct methods
.method public synthetic constructor <init>(ZLf1/t0;JFFJJLh1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lk/r;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lk/r;->h:Lf1/s;

    .line 7
    .line 8
    iput-wide p3, p0, Lk/r;->i:J

    .line 9
    .line 10
    iput p5, p0, Lk/r;->j:F

    .line 11
    .line 12
    iput p6, p0, Lk/r;->k:F

    .line 13
    .line 14
    iput-wide p7, p0, Lk/r;->l:J

    .line 15
    .line 16
    iput-wide p9, p0, Lk/r;->m:J

    .line 17
    .line 18
    iput-object p11, p0, Lk/r;->n:Lh1/g;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    check-cast v2, Lx1/h0;

    .line 6
    .line 7
    invoke-virtual {v2}, Lx1/h0;->e()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v2, Lx1/h0;->g:Lh1/b;

    .line 11
    .line 12
    iget-boolean v3, v1, Lk/r;->g:Z

    .line 13
    .line 14
    move v4, v3

    .line 15
    iget-object v3, v1, Lk/r;->h:Lf1/s;

    .line 16
    .line 17
    iget-wide v8, v1, Lk/r;->i:J

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    const/16 v11, 0xf6

    .line 23
    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    const-wide/16 v6, 0x0

    .line 27
    .line 28
    invoke-static/range {v2 .. v11}, Lh1/d;->D(Lx1/h0;Lf1/s;JJJLh1/c;I)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :cond_0
    const/16 v4, 0x20

    .line 34
    .line 35
    shr-long v5, v8, v4

    .line 36
    .line 37
    long-to-int v5, v5

    .line 38
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget v6, v1, Lk/r;->j:F

    .line 43
    .line 44
    cmpg-float v5, v5, v6

    .line 45
    .line 46
    if-gez v5, :cond_1

    .line 47
    .line 48
    invoke-interface {v0}, Lh1/d;->a()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    shr-long v4, v5, v4

    .line 53
    .line 54
    long-to-int v4, v4

    .line 55
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    iget v11, v1, Lk/r;->k:F

    .line 60
    .line 61
    sub-float v13, v4, v11

    .line 62
    .line 63
    invoke-interface {v0}, Lh1/d;->a()J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    const-wide v6, 0xffffffffL

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    and-long/2addr v4, v6

    .line 73
    long-to-int v4, v4

    .line 74
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    sub-float v14, v4, v11

    .line 79
    .line 80
    iget-object v4, v0, Lh1/b;->h:Lb5/c;

    .line 81
    .line 82
    invoke-virtual {v4}, Lb5/c;->v()J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    invoke-virtual {v4}, Lb5/c;->p()Lf1/u;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-interface {v0}, Lf1/u;->e()V

    .line 91
    .line 92
    .line 93
    :try_start_0
    iget-object v0, v4, Lb5/c;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Landroidx/lifecycle/x;

    .line 96
    .line 97
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lb5/c;

    .line 100
    .line 101
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    const/4 v15, 0x0

    .line 106
    move v12, v11

    .line 107
    invoke-interface/range {v10 .. v15}, Lf1/u;->l(FFFFI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 108
    .line 109
    .line 110
    const/4 v10, 0x0

    .line 111
    const/16 v11, 0xf6

    .line 112
    .line 113
    move-wide v12, v5

    .line 114
    move-object v6, v4

    .line 115
    const-wide/16 v4, 0x0

    .line 116
    .line 117
    move-object v14, v6

    .line 118
    const-wide/16 v6, 0x0

    .line 119
    .line 120
    :try_start_1
    invoke-static/range {v2 .. v11}, Lh1/d;->D(Lx1/h0;Lf1/s;JJJLh1/c;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    .line 122
    .line 123
    invoke-virtual {v14}, Lb5/c;->p()Lf1/u;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-interface {v0}, Lf1/u;->p()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v14, v12, v13}, Lb5/c;->U(J)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    goto :goto_0

    .line 136
    :catchall_1
    move-exception v0

    .line 137
    move-object v14, v4

    .line 138
    move-wide v12, v5

    .line 139
    :goto_0
    invoke-virtual {v14}, Lb5/c;->p()Lf1/u;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-interface {v2}, Lf1/u;->p()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v14, v12, v13}, Lb5/c;->U(J)V

    .line 147
    .line 148
    .line 149
    throw v0

    .line 150
    :cond_1
    invoke-static {v8, v9, v6}, Lk/n;->t(JF)J

    .line 151
    .line 152
    .line 153
    move-result-wide v8

    .line 154
    const/16 v11, 0xd0

    .line 155
    .line 156
    iget-wide v4, v1, Lk/r;->l:J

    .line 157
    .line 158
    iget-wide v6, v1, Lk/r;->m:J

    .line 159
    .line 160
    iget-object v10, v1, Lk/r;->n:Lh1/g;

    .line 161
    .line 162
    invoke-static/range {v2 .. v11}, Lh1/d;->D(Lx1/h0;Lf1/s;JJJLh1/c;I)V

    .line 163
    .line 164
    .line 165
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 166
    .line 167
    return-object v0
.end method
