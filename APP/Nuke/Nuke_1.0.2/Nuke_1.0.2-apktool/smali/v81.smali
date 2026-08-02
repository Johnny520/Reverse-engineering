.class public final Lv81;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lzj1;

.field public final b:Lt81;

.field public final c:Lc81;

.field public final d:J

.field public final synthetic e:Lc81;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Lpk;

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:J

.field public final synthetic l:Ld91;


# direct methods
.method public constructor <init>(JLt81;Lc81;IILpk;IIJLd91;)V
    .locals 0

    .line 1
    iput-object p4, p0, Lv81;->e:Lc81;

    .line 2
    .line 3
    iput p5, p0, Lv81;->f:I

    .line 4
    .line 5
    iput p6, p0, Lv81;->g:I

    .line 6
    .line 7
    iput-object p7, p0, Lv81;->h:Lpk;

    .line 8
    .line 9
    iput p8, p0, Lv81;->i:I

    .line 10
    .line 11
    iput p9, p0, Lv81;->j:I

    .line 12
    .line 13
    iput-wide p10, p0, Lv81;->k:J

    .line 14
    .line 15
    iput-object p12, p0, Lv81;->l:Ld91;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object p5, Ly01;->a:Lzj1;

    .line 21
    .line 22
    new-instance p5, Lzj1;

    .line 23
    .line 24
    invoke-direct {p5}, Lzj1;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p5, p0, Lv81;->a:Lzj1;

    .line 28
    .line 29
    iput-object p3, p0, Lv81;->b:Lt81;

    .line 30
    .line 31
    iput-object p4, p0, Lv81;->c:Lc81;

    .line 32
    .line 33
    invoke-static {p1, p2}, Lfz;->h(J)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const p2, 0x7fffffff

    .line 38
    .line 39
    .line 40
    const/4 p3, 0x5

    .line 41
    const/4 p4, 0x0

    .line 42
    invoke-static {p4, p1, p4, p2, p3}, Lgz;->b(IIIII)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    iput-wide p1, p0, Lv81;->d:J

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a(JI)Ly81;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Lv81;->b:Lt81;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lt81;->d(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v10

    .line 11
    invoke-virtual {v2, v1}, Lt81;->b(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v11

    .line 15
    iget-object v2, v0, Lv81;->a:Lzj1;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Lx01;->b(I)Ljava/lang/Object;

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
    move-wide/from16 v13, p1

    .line 27
    .line 28
    move-object v2, v3

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    iget-object v3, v0, Lv81;->c:Lc81;

    .line 31
    .line 32
    iget-object v5, v3, Lc81;->j:Lt81;

    .line 33
    .line 34
    iget-object v6, v3, Lc81;->k:Lzj1;

    .line 35
    .line 36
    invoke-virtual {v6, v1}, Lx01;->b(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, Ljava/util/List;

    .line 41
    .line 42
    if-eqz v7, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {v5, v1}, Lt81;->d(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-virtual {v5, v1}, Lt81;->b(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    iget-object v8, v3, Lc81;->h:Lz71;

    .line 54
    .line 55
    invoke-virtual {v8, v1, v7, v5}, Lz71;->a(ILjava/lang/Object;Ljava/lang/Object;)Lmn0;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    iget-object v3, v3, Lc81;->i:Liw2;

    .line 60
    .line 61
    invoke-interface {v3, v5, v7}, Liw2;->I(Lmn0;Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v6, v1, v7}, Lzj1;->h(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    new-instance v5, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    move v6, v4

    .line 78
    :goto_1
    if-ge v6, v3, :cond_2

    .line 79
    .line 80
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    check-cast v8, Lif1;

    .line 85
    .line 86
    move-wide/from16 v13, p1

    .line 87
    .line 88
    invoke-interface {v8, v13, v14}, Lif1;->e(J)Lsz1;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    add-int/lit8 v6, v6, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    move-wide/from16 v13, p1

    .line 99
    .line 100
    invoke-virtual {v2, v1, v5}, Lzj1;->h(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-object v2, v5

    .line 104
    :goto_2
    iget v3, v0, Lv81;->f:I

    .line 105
    .line 106
    add-int/lit8 v3, v3, -0x1

    .line 107
    .line 108
    if-ne v1, v3, :cond_3

    .line 109
    .line 110
    :goto_3
    move v7, v4

    .line 111
    goto :goto_4

    .line 112
    :cond_3
    iget v4, v0, Lv81;->g:I

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :goto_4
    new-instance v3, Ly81;

    .line 116
    .line 117
    iget-object v4, v0, Lv81;->e:Lc81;

    .line 118
    .line 119
    iget-object v4, v4, Lc81;->i:Liw2;

    .line 120
    .line 121
    invoke-interface {v4}, Lm11;->getLayoutDirection()Ld61;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    iget-object v5, v0, Lv81;->l:Ld91;

    .line 126
    .line 127
    iget-object v12, v5, Ld91;->n:Lx71;

    .line 128
    .line 129
    move-object v5, v3

    .line 130
    iget-object v3, v0, Lv81;->h:Lpk;

    .line 131
    .line 132
    move-object v6, v5

    .line 133
    iget v5, v0, Lv81;->i:I

    .line 134
    .line 135
    move-object v8, v6

    .line 136
    iget v6, v0, Lv81;->j:I

    .line 137
    .line 138
    iget-wide v0, v0, Lv81;->k:J

    .line 139
    .line 140
    move-wide v15, v0

    .line 141
    move-object v0, v8

    .line 142
    move-wide v8, v15

    .line 143
    move/from16 v1, p3

    .line 144
    .line 145
    invoke-direct/range {v0 .. v14}, Ly81;-><init>(ILjava/util/List;Lpk;Ld61;IIIJLjava/lang/Object;Ljava/lang/Object;Lx71;J)V

    .line 146
    .line 147
    .line 148
    return-object v0
.end method
