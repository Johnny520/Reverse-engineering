.class public final Lr/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lf/w;

.field public final b:Lr/k;

.field public final c:Ls/f0;

.field public final d:J

.field public final synthetic e:Z

.field public final synthetic f:Ls/f0;

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ly0/e;

.field public final synthetic j:Ly0/f;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:J

.field public final synthetic n:Lr/z;


# direct methods
.method public constructor <init>(JZLr/k;Ls/f0;IILy0/e;Ly0/f;IIJLr/z;)V
    .locals 0

    .line 1
    iput-boolean p3, p0, Lr/n;->e:Z

    .line 2
    .line 3
    iput-object p5, p0, Lr/n;->f:Ls/f0;

    .line 4
    .line 5
    iput p6, p0, Lr/n;->g:I

    .line 6
    .line 7
    iput p7, p0, Lr/n;->h:I

    .line 8
    .line 9
    iput-object p8, p0, Lr/n;->i:Ly0/e;

    .line 10
    .line 11
    iput-object p9, p0, Lr/n;->j:Ly0/f;

    .line 12
    .line 13
    iput p10, p0, Lr/n;->k:I

    .line 14
    .line 15
    iput p11, p0, Lr/n;->l:I

    .line 16
    .line 17
    iput-wide p12, p0, Lr/n;->m:J

    .line 18
    .line 19
    iput-object p14, p0, Lr/n;->n:Lr/z;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object p6, Lf/l;->a:Lf/w;

    .line 25
    .line 26
    new-instance p6, Lf/w;

    .line 27
    .line 28
    invoke-direct {p6}, Lf/w;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p6, p0, Lr/n;->a:Lf/w;

    .line 32
    .line 33
    iput-object p4, p0, Lr/n;->b:Lr/k;

    .line 34
    .line 35
    iput-object p5, p0, Lr/n;->c:Ls/f0;

    .line 36
    .line 37
    const p4, 0x7fffffff

    .line 38
    .line 39
    .line 40
    if-eqz p3, :cond_0

    .line 41
    .line 42
    invoke-static {p1, p2}, Lu2/a;->h(J)I

    .line 43
    .line 44
    .line 45
    move-result p5

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move p5, p4

    .line 48
    :goto_0
    if-nez p3, :cond_1

    .line 49
    .line 50
    invoke-static {p1, p2}, Lu2/a;->g(J)I

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    :cond_1
    const/4 p1, 0x5

    .line 55
    const/4 p2, 0x0

    .line 56
    invoke-static {p2, p5, p2, p4, p1}, Lu2/b;->b(IIIII)J

    .line 57
    .line 58
    .line 59
    move-result-wide p1

    .line 60
    iput-wide p1, p0, Lr/n;->d:J

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final a(IJ)Lr/q;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    iget-object v1, v0, Lr/n;->b:Lr/k;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lr/k;->d(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v13

    .line 11
    invoke-virtual {v1, v2}, Lr/k;->b(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v14

    .line 15
    iget-object v1, v0, Lr/n;->a:Lf/w;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lf/k;->b(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Ljava/util/List;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    move-wide/from16 v9, p2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    iget-object v3, v0, Lr/n;->c:Ls/f0;

    .line 30
    .line 31
    iget-object v5, v3, Ls/f0;->i:Lr/k;

    .line 32
    .line 33
    iget-object v6, v3, Ls/f0;->j:Lf/w;

    .line 34
    .line 35
    invoke-virtual {v6, v2}, Lf/k;->b(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    check-cast v7, Ljava/util/List;

    .line 40
    .line 41
    if-eqz v7, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v5, v2}, Lr/k;->d(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {v5, v2}, Lr/k;->b(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    iget-object v8, v3, Ls/f0;->g:Ls/b0;

    .line 53
    .line 54
    invoke-virtual {v8, v7, v2, v5}, Ls/b0;->a(Ljava/lang/Object;ILjava/lang/Object;)Lfg/p;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    iget-object v3, v3, Ls/f0;->h:Lv1/k1;

    .line 59
    .line 60
    invoke-interface {v3, v5, v7}, Lv1/k1;->N(Lfg/p;Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    invoke-virtual {v6, v2, v7}, Lf/w;->h(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    new-instance v5, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    .line 75
    .line 76
    move v6, v4

    .line 77
    :goto_1
    if-ge v6, v3, :cond_2

    .line 78
    .line 79
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, Lv1/m0;

    .line 84
    .line 85
    move-wide/from16 v9, p2

    .line 86
    .line 87
    invoke-interface {v8, v9, v10}, Lv1/m0;->Q(J)Lv1/b1;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    add-int/lit8 v6, v6, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    move-wide/from16 v9, p2

    .line 98
    .line 99
    invoke-virtual {v1, v2, v5}, Lf/w;->h(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object v3, v5

    .line 103
    :goto_2
    iget v1, v0, Lr/n;->g:I

    .line 104
    .line 105
    add-int/lit8 v1, v1, -0x1

    .line 106
    .line 107
    if-ne v2, v1, :cond_3

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    iget v4, v0, Lr/n;->h:I

    .line 111
    .line 112
    :goto_3
    new-instance v1, Lr/q;

    .line 113
    .line 114
    iget-object v5, v0, Lr/n;->f:Ls/f0;

    .line 115
    .line 116
    iget-object v5, v5, Ls/f0;->h:Lv1/k1;

    .line 117
    .line 118
    invoke-interface {v5}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    iget-object v5, v0, Lr/n;->n:Lr/z;

    .line 123
    .line 124
    iget-object v15, v5, Lr/z;->o:Ls/z;

    .line 125
    .line 126
    move v10, v4

    .line 127
    iget-boolean v4, v0, Lr/n;->e:Z

    .line 128
    .line 129
    iget-object v5, v0, Lr/n;->i:Ly0/e;

    .line 130
    .line 131
    iget-object v6, v0, Lr/n;->j:Ly0/f;

    .line 132
    .line 133
    iget v8, v0, Lr/n;->k:I

    .line 134
    .line 135
    iget v9, v0, Lr/n;->l:I

    .line 136
    .line 137
    iget-wide v11, v0, Lr/n;->m:J

    .line 138
    .line 139
    move-wide/from16 v16, p2

    .line 140
    .line 141
    invoke-direct/range {v1 .. v17}, Lr/q;-><init>(ILjava/util/List;ZLy0/e;Ly0/f;Lu2/m;IIIJLjava/lang/Object;Ljava/lang/Object;Ls/z;J)V

    .line 142
    .line 143
    .line 144
    return-object v1
.end method
