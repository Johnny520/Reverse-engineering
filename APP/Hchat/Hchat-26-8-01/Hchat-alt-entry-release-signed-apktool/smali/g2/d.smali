.class public final Lg2/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:Ls/d;

.field public final c:Lm/b;

.field public d:Lg2/d;

.field public e:J

.field public f:J

.field public g:J

.field public final synthetic h:Lg2/e;


# direct methods
.method public constructor <init>(Lg2/e;ILs/d;Lm/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/d;->h:Lg2/e;

    .line 5
    .line 6
    iput p2, p0, Lg2/d;->a:I

    .line 7
    .line 8
    iput-object p3, p0, Lg2/d;->b:Ls/d;

    .line 9
    .line 10
    iput-object p4, p0, Lg2/d;->c:Lm/b;

    .line 11
    .line 12
    const-wide/high16 p1, -0x8000000000000000L

    .line 13
    .line 14
    iput-wide p1, p0, Lg2/d;->g:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(JJJJ[F)V
    .locals 14

    .line 1
    iget-object v0, p0, Lg2/d;->h:Lg2/e;

    .line 2
    .line 3
    iget-wide v10, v0, Lg2/e;->f:J

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    iget-object v13, p0, Lg2/d;->b:Ls/d;

    .line 7
    .line 8
    invoke-static {v13, v0}, Lx1/k;->t(Lx1/i;I)Lx1/i1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v13}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lx1/f0;->H()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-object v1, v1, Lx1/f0;->L:Lx1/b1;

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v2, v1, Lx1/b1;->d:Lx1/i1;

    .line 27
    .line 28
    if-eq v2, v0, :cond_1

    .line 29
    .line 30
    const/16 v2, 0x20

    .line 31
    .line 32
    shr-long v3, p1, v2

    .line 33
    .line 34
    long-to-int v3, v3

    .line 35
    int-to-float v3, v3

    .line 36
    const-wide v4, 0xffffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long v6, p1, v4

    .line 42
    .line 43
    long-to-int v6, v6

    .line 44
    int-to-float v6, v6

    .line 45
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    int-to-long v7, v3

    .line 50
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    move/from16 p3, v2

    .line 55
    .line 56
    int-to-long v2, v3

    .line 57
    shl-long v6, v7, p3

    .line 58
    .line 59
    and-long/2addr v2, v4

    .line 60
    or-long/2addr v2, v6

    .line 61
    iget-wide v6, v0, Lv1/b1;->i:J

    .line 62
    .line 63
    iget-object v1, v1, Lx1/b1;->d:Lx1/i1;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v0, v2, v3}, Lx1/i1;->W(Lv1/t;J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    invoke-static {v0, v1}, Lig/a;->W(J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v2

    .line 76
    new-instance v1, Lg2/c;

    .line 77
    .line 78
    shr-long v8, v2, p3

    .line 79
    .line 80
    long-to-int v0, v8

    .line 81
    shr-long v8, v6, p3

    .line 82
    .line 83
    long-to-int v8, v8

    .line 84
    add-int/2addr v0, v8

    .line 85
    and-long v8, v2, v4

    .line 86
    .line 87
    long-to-int v8, v8

    .line 88
    and-long/2addr v6, v4

    .line 89
    long-to-int v6, v6

    .line 90
    add-int/2addr v8, v6

    .line 91
    int-to-long v6, v0

    .line 92
    shl-long v6, v6, p3

    .line 93
    .line 94
    int-to-long v8, v8

    .line 95
    and-long/2addr v4, v8

    .line 96
    or-long/2addr v4, v6

    .line 97
    move-wide/from16 v6, p5

    .line 98
    .line 99
    move-wide/from16 v8, p7

    .line 100
    .line 101
    move-object/from16 v12, p9

    .line 102
    .line 103
    invoke-direct/range {v1 .. v13}, Lg2/c;-><init>(JJJJJ[FLs/d;)V

    .line 104
    .line 105
    .line 106
    :goto_0
    move-object v0, v1

    .line 107
    goto :goto_1

    .line 108
    :cond_1
    new-instance v1, Lg2/c;

    .line 109
    .line 110
    move-wide v2, p1

    .line 111
    move-wide/from16 v4, p3

    .line 112
    .line 113
    move-wide/from16 v6, p5

    .line 114
    .line 115
    move-wide/from16 v8, p7

    .line 116
    .line 117
    move-object/from16 v12, p9

    .line 118
    .line 119
    invoke-direct/range {v1 .. v13}, Lg2/c;-><init>(JJJJJ[FLs/d;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :goto_1
    if-nez v0, :cond_2

    .line 124
    .line 125
    return-void

    .line 126
    :cond_2
    iget-object v1, p0, Lg2/d;->c:Lm/b;

    .line 127
    .line 128
    invoke-virtual {v1, v0}, Lm/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final b()V
    .locals 9

    .line 1
    iget-object v0, p0, Lg2/d;->h:Lg2/e;

    .line 2
    .line 3
    iget-object v1, v0, Lg2/e;->a:Lf/w;

    .line 4
    .line 5
    iget v2, p0, Lg2/d;->a:I

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lf/w;->g(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Lg2/d;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {v3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-eqz v5, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lg2/d;->d:Lg2/d;

    .line 24
    .line 25
    iput-object v4, p0, Lg2/d;->d:Lg2/d;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lf/w;->d(I)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iget-object v4, v1, Lf/k;->c:[Ljava/lang/Object;

    .line 34
    .line 35
    aget-object v5, v4, v3

    .line 36
    .line 37
    iget-object v1, v1, Lf/k;->b:[I

    .line 38
    .line 39
    aput v2, v1, v3

    .line 40
    .line 41
    aput-object v0, v4, v3

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object v0, p0, Lg2/d;->b:Ls/d;

    .line 45
    .line 46
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 47
    .line 48
    invoke-static {v0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-boolean v1, v0, Lx1/f0;->m:Z

    .line 53
    .line 54
    if-eqz v1, :cond_7

    .line 55
    .line 56
    invoke-static {v0}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ly1/t;

    .line 61
    .line 62
    invoke-virtual {v1}, Ly1/t;->getRectManager()Lg2/b;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v1, v1, Lg2/b;->b:Lac/k;

    .line 67
    .line 68
    iget v0, v0, Lx1/f0;->h:I

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    invoke-virtual {v1, v0, v2}, Lac/k;->N(IZ)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    invoke-virtual {v1, v2}, Lf/w;->d(I)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    iget-object v6, v1, Lf/k;->c:[Ljava/lang/Object;

    .line 80
    .line 81
    aget-object v7, v6, v5

    .line 82
    .line 83
    iget-object v1, v1, Lf/k;->b:[I

    .line 84
    .line 85
    aput v2, v1, v5

    .line 86
    .line 87
    aput-object v3, v6, v5

    .line 88
    .line 89
    :goto_0
    iget-object v1, v3, Lg2/d;->d:Lg2/d;

    .line 90
    .line 91
    if-nez v1, :cond_8

    .line 92
    .line 93
    :goto_1
    iget-object v1, v0, Lg2/e;->b:Lg2/d;

    .line 94
    .line 95
    if-ne v1, p0, :cond_3

    .line 96
    .line 97
    iget-object v1, v1, Lg2/d;->d:Lg2/d;

    .line 98
    .line 99
    iput-object v1, v0, Lg2/e;->b:Lg2/d;

    .line 100
    .line 101
    iput-object v4, p0, Lg2/d;->d:Lg2/d;

    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    if-eqz v1, :cond_4

    .line 105
    .line 106
    iget-object v0, v1, Lg2/d;->d:Lg2/d;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v0, v4

    .line 110
    :goto_2
    move-object v8, v1

    .line 111
    move-object v1, v0

    .line 112
    move-object v0, v8

    .line 113
    if-eqz v1, :cond_7

    .line 114
    .line 115
    if-ne v1, p0, :cond_6

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    iget-object v1, v1, Lg2/d;->d:Lg2/d;

    .line 120
    .line 121
    iput-object v1, v0, Lg2/d;->d:Lg2/d;

    .line 122
    .line 123
    :cond_5
    iput-object v4, p0, Lg2/d;->d:Lg2/d;

    .line 124
    .line 125
    return-void

    .line 126
    :cond_6
    iget-object v0, v1, Lg2/d;->d:Lg2/d;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    return-void

    .line 130
    :cond_8
    if-ne v1, p0, :cond_9

    .line 131
    .line 132
    iget-object v0, p0, Lg2/d;->d:Lg2/d;

    .line 133
    .line 134
    iput-object v0, v3, Lg2/d;->d:Lg2/d;

    .line 135
    .line 136
    iput-object v4, p0, Lg2/d;->d:Lg2/d;

    .line 137
    .line 138
    return-void

    .line 139
    :cond_9
    move-object v3, v1

    .line 140
    goto :goto_0
.end method
