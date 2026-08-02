.class public final Lzq;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final Companion:Lyq;

.field public static final o:[Lj71;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Lgr;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Ler;

.field public final h:Ljava/util/Set;

.field public final i:Lir;

.field public final j:Ljava/lang/String;

.field public final k:I

.field public final l:J

.field public final m:J

.field public final n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lyq;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzq;->Companion:Lyq;

    .line 7
    .line 8
    new-instance v0, Lc0;

    .line 9
    .line 10
    const/16 v1, 0xd

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Li91;->h:Li91;

    .line 16
    .line 17
    invoke-static {v2, v0}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v3, Lc0;

    .line 22
    .line 23
    const/16 v4, 0xe

    .line 24
    .line 25
    invoke-direct {v3, v4}, Lc0;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v5, Lc0;

    .line 33
    .line 34
    const/16 v6, 0xf

    .line 35
    .line 36
    invoke-direct {v5, v6}, Lc0;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v5}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    new-instance v6, Lc0;

    .line 44
    .line 45
    const/16 v7, 0x10

    .line 46
    .line 47
    invoke-direct {v6, v7}, Lc0;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v6}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    new-instance v7, Lc0;

    .line 55
    .line 56
    const/16 v8, 0x11

    .line 57
    .line 58
    invoke-direct {v7, v8}, Lc0;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v7}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    new-array v4, v4, [Lj71;

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    aput-object v8, v4, v7

    .line 70
    .line 71
    const/4 v7, 0x1

    .line 72
    aput-object v8, v4, v7

    .line 73
    .line 74
    const/4 v7, 0x2

    .line 75
    aput-object v8, v4, v7

    .line 76
    .line 77
    const/4 v7, 0x3

    .line 78
    aput-object v0, v4, v7

    .line 79
    .line 80
    const/4 v0, 0x4

    .line 81
    aput-object v3, v4, v0

    .line 82
    .line 83
    const/4 v0, 0x5

    .line 84
    aput-object v8, v4, v0

    .line 85
    .line 86
    const/4 v0, 0x6

    .line 87
    aput-object v5, v4, v0

    .line 88
    .line 89
    const/4 v0, 0x7

    .line 90
    aput-object v6, v4, v0

    .line 91
    .line 92
    const/16 v0, 0x8

    .line 93
    .line 94
    aput-object v2, v4, v0

    .line 95
    .line 96
    const/16 v0, 0x9

    .line 97
    .line 98
    aput-object v8, v4, v0

    .line 99
    .line 100
    const/16 v0, 0xa

    .line 101
    .line 102
    aput-object v8, v4, v0

    .line 103
    .line 104
    const/16 v0, 0xb

    .line 105
    .line 106
    aput-object v8, v4, v0

    .line 107
    .line 108
    const/16 v0, 0xc

    .line 109
    .line 110
    aput-object v8, v4, v0

    .line 111
    .line 112
    aput-object v8, v4, v1

    .line 113
    .line 114
    sput-object v4, Lzq;->o:[Lj71;

    .line 115
    .line 116
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLgr;Ljava/util/List;ZLer;Ljava/util/Set;Lir;Ljava/lang/String;IJJZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lyr;->f()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :cond_0
    iput-object p2, p0, Lzq;->a:Ljava/lang/String;

    .line 13
    .line 14
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    const-string v0, ""

    .line 17
    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    iput-object v0, p0, Lzq;->b:Ljava/lang/String;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iput-object p3, p0, Lzq;->b:Ljava/lang/String;

    .line 24
    .line 25
    :goto_0
    and-int/lit8 p2, p1, 0x4

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    if-nez p2, :cond_2

    .line 29
    .line 30
    iput-boolean p3, p0, Lzq;->c:Z

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iput-boolean p4, p0, Lzq;->c:Z

    .line 34
    .line 35
    :goto_1
    and-int/lit8 p2, p1, 0x8

    .line 36
    .line 37
    if-nez p2, :cond_3

    .line 38
    .line 39
    sget-object p2, Lgr;->i:Lgr;

    .line 40
    .line 41
    iput-object p2, p0, Lzq;->d:Lgr;

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_3
    iput-object p5, p0, Lzq;->d:Lgr;

    .line 45
    .line 46
    :goto_2
    and-int/lit8 p2, p1, 0x10

    .line 47
    .line 48
    if-nez p2, :cond_4

    .line 49
    .line 50
    sget-object p2, Lbe0;->h:Lbe0;

    .line 51
    .line 52
    iput-object p2, p0, Lzq;->e:Ljava/util/List;

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_4
    iput-object p6, p0, Lzq;->e:Ljava/util/List;

    .line 56
    .line 57
    :goto_3
    and-int/lit8 p2, p1, 0x20

    .line 58
    .line 59
    if-nez p2, :cond_5

    .line 60
    .line 61
    iput-boolean p3, p0, Lzq;->f:Z

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_5
    iput-boolean p7, p0, Lzq;->f:Z

    .line 65
    .line 66
    :goto_4
    and-int/lit8 p2, p1, 0x40

    .line 67
    .line 68
    if-nez p2, :cond_6

    .line 69
    .line 70
    sget-object p2, Ler;->i:Ler;

    .line 71
    .line 72
    iput-object p2, p0, Lzq;->g:Ler;

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_6
    iput-object p8, p0, Lzq;->g:Ler;

    .line 76
    .line 77
    :goto_5
    and-int/lit16 p2, p1, 0x80

    .line 78
    .line 79
    if-nez p2, :cond_7

    .line 80
    .line 81
    sget-object p2, Lfe0;->h:Lfe0;

    .line 82
    .line 83
    iput-object p2, p0, Lzq;->h:Ljava/util/Set;

    .line 84
    .line 85
    goto :goto_6

    .line 86
    :cond_7
    iput-object p9, p0, Lzq;->h:Ljava/util/Set;

    .line 87
    .line 88
    :goto_6
    and-int/lit16 p2, p1, 0x100

    .line 89
    .line 90
    if-nez p2, :cond_8

    .line 91
    .line 92
    sget-object p2, Lir;->i:Lir;

    .line 93
    .line 94
    iput-object p2, p0, Lzq;->i:Lir;

    .line 95
    .line 96
    goto :goto_7

    .line 97
    :cond_8
    iput-object p10, p0, Lzq;->i:Lir;

    .line 98
    .line 99
    :goto_7
    and-int/lit16 p2, p1, 0x200

    .line 100
    .line 101
    if-nez p2, :cond_9

    .line 102
    .line 103
    iput-object v0, p0, Lzq;->j:Ljava/lang/String;

    .line 104
    .line 105
    goto :goto_8

    .line 106
    :cond_9
    iput-object p11, p0, Lzq;->j:Ljava/lang/String;

    .line 107
    .line 108
    :goto_8
    and-int/lit16 p2, p1, 0x400

    .line 109
    .line 110
    if-nez p2, :cond_a

    .line 111
    .line 112
    const/16 p2, 0x3e8

    .line 113
    .line 114
    iput p2, p0, Lzq;->k:I

    .line 115
    .line 116
    goto :goto_9

    .line 117
    :cond_a
    iput p12, p0, Lzq;->k:I

    .line 118
    .line 119
    :goto_9
    and-int/lit16 p2, p1, 0x800

    .line 120
    .line 121
    const-wide/16 p4, 0x0

    .line 122
    .line 123
    if-nez p2, :cond_b

    .line 124
    .line 125
    iput-wide p4, p0, Lzq;->l:J

    .line 126
    .line 127
    goto :goto_a

    .line 128
    :cond_b
    iput-wide p13, p0, Lzq;->l:J

    .line 129
    .line 130
    :goto_a
    and-int/lit16 p2, p1, 0x1000

    .line 131
    .line 132
    if-nez p2, :cond_c

    .line 133
    .line 134
    :goto_b
    iput-wide p4, p0, Lzq;->m:J

    .line 135
    .line 136
    goto :goto_c

    .line 137
    :cond_c
    move-wide/from16 p4, p15

    .line 138
    .line 139
    goto :goto_b

    .line 140
    :goto_c
    and-int/lit16 p1, p1, 0x2000

    .line 141
    .line 142
    if-nez p1, :cond_d

    .line 143
    .line 144
    iput-boolean p3, p0, Lzq;->n:Z

    .line 145
    .line 146
    return-void

    .line 147
    :cond_d
    move/from16 p1, p17

    .line 148
    .line 149
    iput-boolean p1, p0, Lzq;->n:Z

    .line 150
    .line 151
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLgr;Ljava/util/List;ZLer;Ljava/util/Set;Lir;Ljava/lang/String;IJJZ)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p1, p0, Lzq;->a:Ljava/lang/String;

    .line 154
    iput-object p2, p0, Lzq;->b:Ljava/lang/String;

    .line 155
    iput-boolean p3, p0, Lzq;->c:Z

    .line 156
    iput-object p4, p0, Lzq;->d:Lgr;

    .line 157
    iput-object p5, p0, Lzq;->e:Ljava/util/List;

    .line 158
    iput-boolean p6, p0, Lzq;->f:Z

    .line 159
    iput-object p7, p0, Lzq;->g:Ler;

    .line 160
    iput-object p8, p0, Lzq;->h:Ljava/util/Set;

    .line 161
    iput-object p9, p0, Lzq;->i:Lir;

    .line 162
    iput-object p10, p0, Lzq;->j:Ljava/lang/String;

    .line 163
    iput p11, p0, Lzq;->k:I

    .line 164
    iput-wide p12, p0, Lzq;->l:J

    .line 165
    iput-wide p14, p0, Lzq;->m:J

    move/from16 p1, p16

    .line 166
    iput-boolean p1, p0, Lzq;->n:Z

    return-void
.end method

.method public static a(Lzq;Ljava/lang/String;ZLgr;Ljava/util/List;ZLer;Ljava/util/Set;Lir;Ljava/lang/String;IJJZI)Lzq;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p16

    .line 4
    .line 5
    iget-object v2, v0, Lzq;->a:Ljava/lang/String;

    .line 6
    .line 7
    and-int/lit8 v3, v1, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, Lzq;->b:Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object/from16 v3, p1

    .line 15
    .line 16
    :goto_0
    and-int/lit8 v4, v1, 0x8

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    iget-object v4, v0, Lzq;->d:Lgr;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v4, p3

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v5, v1, 0x10

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    iget-object v5, v0, Lzq;->e:Ljava/util/List;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object/from16 v5, p4

    .line 33
    .line 34
    :goto_2
    and-int/lit8 v6, v1, 0x20

    .line 35
    .line 36
    if-eqz v6, :cond_3

    .line 37
    .line 38
    iget-boolean v6, v0, Lzq;->f:Z

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move/from16 v6, p5

    .line 42
    .line 43
    :goto_3
    and-int/lit8 v7, v1, 0x40

    .line 44
    .line 45
    if-eqz v7, :cond_4

    .line 46
    .line 47
    iget-object v7, v0, Lzq;->g:Ler;

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_4
    move-object/from16 v7, p6

    .line 51
    .line 52
    :goto_4
    and-int/lit16 v8, v1, 0x80

    .line 53
    .line 54
    if-eqz v8, :cond_5

    .line 55
    .line 56
    iget-object v8, v0, Lzq;->h:Ljava/util/Set;

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_5
    move-object/from16 v8, p7

    .line 60
    .line 61
    :goto_5
    and-int/lit16 v9, v1, 0x100

    .line 62
    .line 63
    if-eqz v9, :cond_6

    .line 64
    .line 65
    iget-object v9, v0, Lzq;->i:Lir;

    .line 66
    .line 67
    goto :goto_6

    .line 68
    :cond_6
    move-object/from16 v9, p8

    .line 69
    .line 70
    :goto_6
    and-int/lit16 v10, v1, 0x200

    .line 71
    .line 72
    if-eqz v10, :cond_7

    .line 73
    .line 74
    iget-object v10, v0, Lzq;->j:Ljava/lang/String;

    .line 75
    .line 76
    goto :goto_7

    .line 77
    :cond_7
    move-object/from16 v10, p9

    .line 78
    .line 79
    :goto_7
    and-int/lit16 v11, v1, 0x400

    .line 80
    .line 81
    if-eqz v11, :cond_8

    .line 82
    .line 83
    iget v11, v0, Lzq;->k:I

    .line 84
    .line 85
    goto :goto_8

    .line 86
    :cond_8
    move/from16 v11, p10

    .line 87
    .line 88
    :goto_8
    and-int/lit16 v12, v1, 0x800

    .line 89
    .line 90
    if-eqz v12, :cond_9

    .line 91
    .line 92
    iget-wide v12, v0, Lzq;->l:J

    .line 93
    .line 94
    goto :goto_9

    .line 95
    :cond_9
    move-wide/from16 v12, p11

    .line 96
    .line 97
    :goto_9
    and-int/lit16 v14, v1, 0x1000

    .line 98
    .line 99
    if-eqz v14, :cond_a

    .line 100
    .line 101
    iget-wide v14, v0, Lzq;->m:J

    .line 102
    .line 103
    goto :goto_a

    .line 104
    :cond_a
    move-wide/from16 v14, p13

    .line 105
    .line 106
    :goto_a
    and-int/lit16 v1, v1, 0x2000

    .line 107
    .line 108
    if-eqz v1, :cond_b

    .line 109
    .line 110
    iget-boolean v1, v0, Lzq;->n:Z

    .line 111
    .line 112
    move/from16 v16, v1

    .line 113
    .line 114
    goto :goto_b

    .line 115
    :cond_b
    move/from16 v16, p15

    .line 116
    .line 117
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    new-instance v0, Lzq;

    .line 145
    .line 146
    move-object v1, v2

    .line 147
    move-object v2, v3

    .line 148
    move/from16 v3, p2

    .line 149
    .line 150
    invoke-direct/range {v0 .. v16}, Lzq;-><init>(Ljava/lang/String;Ljava/lang/String;ZLgr;Ljava/util/List;ZLer;Ljava/util/Set;Lir;Ljava/lang/String;IJJZ)V

    .line 151
    .line 152
    .line 153
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lzq;

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
    check-cast p1, Lzq;

    .line 12
    .line 13
    iget-object v1, p0, Lzq;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lzq;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lzq;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lzq;->b:Ljava/lang/String;

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
    iget-boolean v1, p0, Lzq;->c:Z

    .line 36
    .line 37
    iget-boolean v3, p1, Lzq;->c:Z

    .line 38
    .line 39
    if-eq v1, v3, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, Lzq;->d:Lgr;

    .line 43
    .line 44
    iget-object v3, p1, Lzq;->d:Lgr;

    .line 45
    .line 46
    if-eq v1, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-object v1, p0, Lzq;->e:Ljava/util/List;

    .line 50
    .line 51
    iget-object v3, p1, Lzq;->e:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-boolean v1, p0, Lzq;->f:Z

    .line 61
    .line 62
    iget-boolean v3, p1, Lzq;->f:Z

    .line 63
    .line 64
    if-eq v1, v3, :cond_7

    .line 65
    .line 66
    return v2

    .line 67
    :cond_7
    iget-object v1, p0, Lzq;->g:Ler;

    .line 68
    .line 69
    iget-object v3, p1, Lzq;->g:Ler;

    .line 70
    .line 71
    if-eq v1, v3, :cond_8

    .line 72
    .line 73
    return v2

    .line 74
    :cond_8
    iget-object v1, p0, Lzq;->h:Ljava/util/Set;

    .line 75
    .line 76
    iget-object v3, p1, Lzq;->h:Ljava/util/Set;

    .line 77
    .line 78
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_9

    .line 83
    .line 84
    return v2

    .line 85
    :cond_9
    iget-object v1, p0, Lzq;->i:Lir;

    .line 86
    .line 87
    iget-object v3, p1, Lzq;->i:Lir;

    .line 88
    .line 89
    if-eq v1, v3, :cond_a

    .line 90
    .line 91
    return v2

    .line 92
    :cond_a
    iget-object v1, p0, Lzq;->j:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v3, p1, Lzq;->j:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_b

    .line 101
    .line 102
    return v2

    .line 103
    :cond_b
    iget v1, p0, Lzq;->k:I

    .line 104
    .line 105
    iget v3, p1, Lzq;->k:I

    .line 106
    .line 107
    if-eq v1, v3, :cond_c

    .line 108
    .line 109
    return v2

    .line 110
    :cond_c
    iget-wide v3, p0, Lzq;->l:J

    .line 111
    .line 112
    iget-wide v5, p1, Lzq;->l:J

    .line 113
    .line 114
    cmp-long v1, v3, v5

    .line 115
    .line 116
    if-eqz v1, :cond_d

    .line 117
    .line 118
    return v2

    .line 119
    :cond_d
    iget-wide v3, p0, Lzq;->m:J

    .line 120
    .line 121
    iget-wide v5, p1, Lzq;->m:J

    .line 122
    .line 123
    cmp-long v1, v3, v5

    .line 124
    .line 125
    if-eqz v1, :cond_e

    .line 126
    .line 127
    return v2

    .line 128
    :cond_e
    iget-boolean p0, p0, Lzq;->n:Z

    .line 129
    .line 130
    iget-boolean p1, p1, Lzq;->n:Z

    .line 131
    .line 132
    if-eq p0, p1, :cond_f

    .line 133
    .line 134
    return v2

    .line 135
    :cond_f
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lzq;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lzq;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lzq;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lzq;->d:Lgr;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, Lzq;->e:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-boolean v2, p0, Lzq;->f:Z

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, Lzq;->g:Ler;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v2, v0

    .line 51
    mul-int/2addr v2, v1

    .line 52
    iget-object v0, p0, Lzq;->h:Ljava/util/Set;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v0, v2

    .line 59
    mul-int/2addr v0, v1

    .line 60
    iget-object v2, p0, Lzq;->i:Lir;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int/2addr v2, v0

    .line 67
    mul-int/2addr v2, v1

    .line 68
    iget-object v0, p0, Lzq;->j:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0, v2, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget v2, p0, Lzq;->k:I

    .line 75
    .line 76
    invoke-static {v2, v0, v1}, Lvi0;->d(III)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-wide v2, p0, Lzq;->l:J

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-wide v2, p0, Lzq;->m:J

    .line 87
    .line 88
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-boolean p0, p0, Lzq;->n:Z

    .line 93
    .line 94
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    add-int/2addr p0, v0

    .line 99
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", name="

    .line 2
    .line 3
    const-string v1, ", isEnabled="

    .line 4
    .line 5
    const-string v2, "AutoReplyTask(id="

    .line 6
    .line 7
    iget-object v3, p0, Lzq;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lzq;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v1, p0, Lzq;->c:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", matchMode="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lzq;->d:Lgr;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", keywords="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lzq;->e:Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", ignoreCase="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, Lzq;->f:Z

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", listMode="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lzq;->g:Ler;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", targetIds="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lzq;->h:Ljava/util/Set;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", replyType="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lzq;->i:Lir;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", replyContent="

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Lzq;->j:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", voiceDurationMs="

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget v1, p0, Lzq;->k:I

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, ", delayMs="

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-wide v1, p0, Lzq;->l:J

    .line 106
    .line 107
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ", cooldownMs="

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget-wide v1, p0, Lzq;->m:J

    .line 116
    .line 117
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, ", stopAfterMatch="

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget-boolean p0, p0, Lzq;->n:Z

    .line 126
    .line 127
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string p0, ")"

    .line 131
    .line 132
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0
.end method
