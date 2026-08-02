.class public Lj51;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lsh0;
.implements Lxn1;
.implements Lus1;
.implements Ly02;
.implements Lgh2;
.implements Ltf2;
.implements Lbl2;
.implements Lkh1;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lj51;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final s(Lno;[Lno;I)Ljava/lang/String;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lk42;->b:Lno;

    .line 6
    .line 7
    invoke-virtual {v0}, Lno;->a()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v4, 0x0

    .line 12
    :goto_0
    if-ge v4, v2, :cond_b

    .line 13
    .line 14
    add-int v5, v4, v2

    .line 15
    .line 16
    div-int/lit8 v5, v5, 0x2

    .line 17
    .line 18
    :goto_1
    const/16 v6, 0xa

    .line 19
    .line 20
    const/4 v7, -0x1

    .line 21
    if-le v5, v7, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, v5}, Lno;->d(I)B

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    if-eq v8, v6, :cond_0

    .line 28
    .line 29
    add-int/lit8 v5, v5, -0x1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v8, v5, 0x1

    .line 33
    .line 34
    const/4 v9, 0x1

    .line 35
    move v10, v9

    .line 36
    :goto_2
    add-int v11, v8, v10

    .line 37
    .line 38
    invoke-virtual {v0, v11}, Lno;->d(I)B

    .line 39
    .line 40
    .line 41
    move-result v12

    .line 42
    if-eq v12, v6, :cond_1

    .line 43
    .line 44
    add-int/lit8 v10, v10, 0x1

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    sub-int v6, v11, v8

    .line 48
    .line 49
    move/from16 v12, p2

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    const/4 v13, 0x0

    .line 53
    const/4 v14, 0x0

    .line 54
    :goto_3
    if-eqz v10, :cond_2

    .line 55
    .line 56
    const/16 v10, 0x2e

    .line 57
    .line 58
    const/4 v15, 0x0

    .line 59
    goto :goto_4

    .line 60
    :cond_2
    aget-object v15, v1, v12

    .line 61
    .line 62
    invoke-virtual {v15, v13}, Lno;->d(I)B

    .line 63
    .line 64
    .line 65
    move-result v15

    .line 66
    sget-object v16, Lug3;->a:[B

    .line 67
    .line 68
    and-int/lit16 v15, v15, 0xff

    .line 69
    .line 70
    move/from16 v18, v15

    .line 71
    .line 72
    move v15, v10

    .line 73
    move/from16 v10, v18

    .line 74
    .line 75
    :goto_4
    add-int v3, v8, v14

    .line 76
    .line 77
    invoke-virtual {v0, v3}, Lno;->d(I)B

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    sget-object v17, Lug3;->a:[B

    .line 82
    .line 83
    and-int/lit16 v3, v3, 0xff

    .line 84
    .line 85
    sub-int/2addr v10, v3

    .line 86
    if-nez v10, :cond_5

    .line 87
    .line 88
    add-int/lit8 v14, v14, 0x1

    .line 89
    .line 90
    add-int/lit8 v13, v13, 0x1

    .line 91
    .line 92
    if-eq v14, v6, :cond_5

    .line 93
    .line 94
    aget-object v3, v1, v12

    .line 95
    .line 96
    invoke-virtual {v3}, Lno;->a()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-ne v3, v13, :cond_4

    .line 101
    .line 102
    array-length v3, v1

    .line 103
    sub-int/2addr v3, v9

    .line 104
    if-ne v12, v3, :cond_3

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_3
    add-int/lit8 v12, v12, 0x1

    .line 108
    .line 109
    move v13, v7

    .line 110
    move v10, v9

    .line 111
    goto :goto_3

    .line 112
    :cond_4
    move v10, v15

    .line 113
    goto :goto_3

    .line 114
    :cond_5
    :goto_5
    if-gez v10, :cond_6

    .line 115
    .line 116
    :goto_6
    move v2, v5

    .line 117
    goto :goto_0

    .line 118
    :cond_6
    if-lez v10, :cond_7

    .line 119
    .line 120
    :goto_7
    add-int/lit8 v4, v11, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_7
    sub-int v3, v6, v14

    .line 124
    .line 125
    aget-object v7, v1, v12

    .line 126
    .line 127
    invoke-virtual {v7}, Lno;->a()I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    sub-int/2addr v7, v13

    .line 132
    add-int/lit8 v12, v12, 0x1

    .line 133
    .line 134
    array-length v9, v1

    .line 135
    :goto_8
    if-ge v12, v9, :cond_8

    .line 136
    .line 137
    aget-object v10, v1, v12

    .line 138
    .line 139
    invoke-virtual {v10}, Lno;->a()I

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    add-int/2addr v7, v10

    .line 144
    add-int/lit8 v12, v12, 0x1

    .line 145
    .line 146
    goto :goto_8

    .line 147
    :cond_8
    if-ge v7, v3, :cond_9

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_9
    if-le v7, v3, :cond_a

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_a
    add-int/2addr v6, v8

    .line 154
    invoke-virtual {v0, v8, v6}, Lno;->h(II)Lno;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    sget-object v1, Lwq;->a:Ljava/nio/charset/Charset;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Lno;->g(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0

    .line 165
    :cond_b
    const/4 v0, 0x0

    .line 166
    return-object v0
.end method

.method public static final t(Li51;)V
    .locals 8

    .line 1
    sget-object v0, Li62;->z:Lju2;

    .line 2
    .line 3
    :cond_0
    sget-object v0, Li62;->z:Lju2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lju2;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljz1;

    .line 10
    .line 11
    iget-object v2, v1, Ljz1;->j:Lzy1;

    .line 12
    .line 13
    invoke-virtual {v2, p0}, Lzy1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lnb1;

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    move-object v3, v1

    .line 22
    goto :goto_3

    .line 23
    :cond_1
    iget-object v4, v3, Lnb1;->a:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v3, v3, Lnb1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v5, v2, Lzy1;->h:Lh43;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move v7, v6

    .line 38
    :goto_0
    invoke-virtual {v5, v7, v6, p0}, Lh43;->v(IILjava/lang/Object;)Lh43;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-ne v5, v6, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    if-nez v6, :cond_4

    .line 46
    .line 47
    sget-object v2, Lzy1;->j:Lzy1;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    new-instance v5, Lzy1;

    .line 51
    .line 52
    iget v2, v2, Lzy1;->i:I

    .line 53
    .line 54
    add-int/lit8 v2, v2, -0x1

    .line 55
    .line 56
    invoke-direct {v5, v6, v2}, Lzy1;-><init>(Lh43;I)V

    .line 57
    .line 58
    .line 59
    move-object v2, v5

    .line 60
    :goto_1
    sget-object v5, Lgd3;->v:Lgd3;

    .line 61
    .line 62
    if-eq v4, v5, :cond_5

    .line 63
    .line 64
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    check-cast v6, Lnb1;

    .line 72
    .line 73
    new-instance v7, Lnb1;

    .line 74
    .line 75
    iget-object v6, v6, Lnb1;->a:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-direct {v7, v6, v3}, Lnb1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4, v7}, Lzy1;->c(Ljava/lang/Object;Lnb1;)Lzy1;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    :cond_5
    if-eq v3, v5, :cond_6

    .line 85
    .line 86
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    check-cast v6, Lnb1;

    .line 94
    .line 95
    new-instance v7, Lnb1;

    .line 96
    .line 97
    iget-object v6, v6, Lnb1;->b:Ljava/lang/Object;

    .line 98
    .line 99
    invoke-direct {v7, v4, v6}, Lnb1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v3, v7}, Lzy1;->c(Ljava/lang/Object;Lnb1;)Lzy1;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :cond_6
    if-eq v4, v5, :cond_7

    .line 107
    .line 108
    iget-object v6, v1, Ljz1;->h:Ljava/lang/Object;

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    move-object v6, v3

    .line 112
    :goto_2
    if-eq v3, v5, :cond_8

    .line 113
    .line 114
    iget-object v4, v1, Ljz1;->i:Ljava/lang/Object;

    .line 115
    .line 116
    :cond_8
    new-instance v3, Ljz1;

    .line 117
    .line 118
    invoke-direct {v3, v6, v4, v2}, Ljz1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lzy1;)V

    .line 119
    .line 120
    .line 121
    :goto_3
    if-eq v1, v3, :cond_9

    .line 122
    .line 123
    invoke-virtual {v0, v1, v3}, Lju2;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_0

    .line 128
    .line 129
    :cond_9
    return-void
.end method

.method public static u(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, Lc42;

    .line 25
    .line 26
    sget-object v3, Lc42;->j:Lc42;

    .line 27
    .line 28
    if-eq v2, v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 v1, 0xa

    .line 37
    .line 38
    invoke-static {v0, v1}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lc42;

    .line 60
    .line 61
    iget-object v1, v1, Lc42;->h:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    return-object p0
.end method

.method public static v(Ljava/util/List;)[B
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lfn;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lj51;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v0, v2}, Lfn;->E(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lfn;->J(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-wide v1, v0, Lfn;->i:J

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Lfn;->q(J)[B

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static w(Ljava/lang/String;Lim0;I)Landroid/graphics/Typeface;
    .locals 2

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    sget-object v0, Lim0;->j:Lim0;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    if-nez p0, :cond_2

    .line 24
    .line 25
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    invoke-static {p0, v0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_0
    iget p1, p1, Lim0;->h:I

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    if-ne p2, v1, :cond_3

    .line 36
    .line 37
    move v0, v1

    .line 38
    :cond_3
    invoke-static {p0, p1, v0}, Lp90;->d(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method


# virtual methods
.method public A(Lsz0;Ljava/util/List;Lu00;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lyh2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lyh2;

    .line 7
    .line 8
    iget v1, v0, Lyh2;->n:I

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
    iput v1, v0, Lyh2;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyh2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lyh2;-><init>(Lj51;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lyh2;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lyh2;->n:I

    .line 28
    .line 29
    sget-object v4, Lsi2;->j:Lsi2;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lyh2;->k:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v5, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object p3, Loi2;->i:Lo72;

    .line 54
    .line 55
    const-string p3, "manifest.json"

    .line 56
    .line 57
    invoke-static {p3}, Lxe1;->Y(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    new-instance p3, Loi2;

    .line 62
    .line 63
    invoke-direct {p3, v5}, Loi2;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p2, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_6

    .line 71
    .line 72
    iput-object v5, v0, Lyh2;->k:Ljava/lang/String;

    .line 73
    .line 74
    iput v2, v0, Lyh2;->n:I

    .line 75
    .line 76
    invoke-virtual {p0, p1, v5, v0}, Lj51;->B(Lsz0;Ljava/lang/String;Lu00;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    sget-object p0, Lk20;->h:Lk20;

    .line 81
    .line 82
    if-ne p3, p0, :cond_3

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/String;

    .line 86
    .line 87
    :try_start_0
    invoke-static {p3}, Lvh2;->d(Ljava/lang/String;)Lth2;

    .line 88
    .line 89
    .line 90
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    array-length p1, p1

    .line 104
    const/high16 p2, 0x200000

    .line 105
    .line 106
    if-gt p1, p2, :cond_4

    .line 107
    .line 108
    new-instance p2, Luh2;

    .line 109
    .line 110
    invoke-direct {p2, p0, p1}, Luh2;-><init>(Lth2;I)V

    .line 111
    .line 112
    .line 113
    return-object p2

    .line 114
    :cond_4
    new-instance v2, Ldg2;

    .line 115
    .line 116
    const-string p0, "Manifest size is "

    .line 117
    .line 118
    const-string p2, " bytes; maximum is 2097152."

    .line 119
    .line 120
    invoke-static {p1, p0, p2}, Lhk1;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    const/4 v7, 0x0

    .line 125
    const/16 v8, 0x10

    .line 126
    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-direct/range {v2 .. v8}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 129
    .line 130
    .line 131
    throw v2

    .line 132
    :catchall_0
    move-exception v0

    .line 133
    move-object v7, v0

    .line 134
    new-instance v2, Ldg2;

    .line 135
    .line 136
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-nez p0, :cond_5

    .line 141
    .line 142
    const-string p0, "Invalid script manifest."

    .line 143
    .line 144
    :cond_5
    move-object v6, p0

    .line 145
    const/4 v3, 0x0

    .line 146
    invoke-direct/range {v2 .. v7}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw v2

    .line 150
    :cond_6
    new-instance v2, Ldg2;

    .line 151
    .line 152
    const/4 v7, 0x0

    .line 153
    const/16 v8, 0x10

    .line 154
    .line 155
    const/4 v3, 0x0

    .line 156
    const-string v6, "Script manifest does not exist."

    .line 157
    .line 158
    invoke-direct/range {v2 .. v8}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 159
    .line 160
    .line 161
    throw v2
.end method

.method public B(Lsz0;Ljava/lang/String;Lu00;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lzh2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lzh2;

    .line 7
    .line 8
    iget v1, v0, Lzh2;->n:I

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
    iput v1, v0, Lzh2;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzh2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lzh2;-><init>(Lj51;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lzh2;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget p3, v0, Lzh2;->n:I

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz p3, :cond_3

    .line 32
    .line 33
    if-eq p3, v2, :cond_2

    .line 34
    .line 35
    if-ne p3, v1, :cond_1

    .line 36
    .line 37
    iget-object p2, v0, Lzh2;->k:Ljava/lang/String;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    move-object p0, v0

    .line 45
    move-object v5, p0

    .line 46
    move-object v3, p2

    .line 47
    goto :goto_4

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_2
    iget-object p2, v0, Lzh2;->k:Ljava/lang/String;

    .line 56
    .line 57
    :try_start_1
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lk20;->h:Lk20;

    .line 65
    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    :try_start_2
    iput-object p2, v0, Lzh2;->k:Ljava/lang/String;

    .line 69
    .line 70
    iput v2, v0, Lzh2;->n:I

    .line 71
    .line 72
    const/high16 p3, 0x200000

    .line 73
    .line 74
    invoke-virtual {p1, p2, p3, v0}, Lsz0;->K(Ljava/lang/String;ILu00;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, p0, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object p0, p1

    .line 82
    :goto_1
    check-cast p0, Ljava/lang/String;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_5
    iput-object p2, v0, Lzh2;->k:Ljava/lang/String;

    .line 86
    .line 87
    iput v1, v0, Lzh2;->n:I

    .line 88
    .line 89
    const p3, 0x7fffffff

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p2, p3, v0}, Lsz0;->K(Ljava/lang/String;ILu00;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-ne p1, p0, :cond_6

    .line 97
    .line 98
    :goto_2
    return-object p0

    .line 99
    :cond_6
    move-object p0, p1

    .line 100
    :goto_3
    check-cast p0, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    .line 102
    return-object p0

    .line 103
    :goto_4
    instance-of p0, v5, Ljava/util/concurrent/CancellationException;

    .line 104
    .line 105
    if-nez p0, :cond_8

    .line 106
    .line 107
    instance-of p0, v5, Lbh2;

    .line 108
    .line 109
    if-eqz p0, :cond_7

    .line 110
    .line 111
    new-instance v0, Ldg2;

    .line 112
    .line 113
    move-object p0, v5

    .line 114
    check-cast p0, Lbh2;

    .line 115
    .line 116
    const-string p1, "Manifest exceeds the maximum of "

    .line 117
    .line 118
    const-string p2, " bytes."

    .line 119
    .line 120
    iget p0, p0, Lbh2;->h:I

    .line 121
    .line 122
    invoke-static {p0, p1, p2}, Lhk1;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    const/4 v1, 0x0

    .line 127
    sget-object v2, Lsi2;->j:Lsi2;

    .line 128
    .line 129
    invoke-direct/range {v0 .. v5}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :cond_7
    new-instance v0, Ldg2;

    .line 134
    .line 135
    sget-object v2, Lsi2;->i:Lsi2;

    .line 136
    .line 137
    const-string v4, "Unable to read script manifest as UTF-8."

    .line 138
    .line 139
    const/4 v1, 0x0

    .line 140
    invoke-direct/range {v0 .. v5}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :cond_8
    throw v5
.end method

.method public C(Ld22;II)V
    .locals 0

    .line 1
    return-void
.end method

.method public a(Lhh2;Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Lcw0;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lj51;->h:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p0, Leh2;

    .line 8
    .line 9
    const-string p2, "Raw host object access is unavailable in the current environment."

    .line 10
    .line 11
    const/16 p3, 0x8

    .line 12
    .line 13
    const-string p4, "HOST_ACCESS_UNAVAILABLE"

    .line 14
    .line 15
    invoke-direct {p0, p3, p4, p2, p1}, Leh2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw p0

    .line 19
    :pswitch_0
    const-string p0, "INTERNAL_ERROR"

    .line 20
    .line 21
    sget-object p5, Luu0;->a:Ljava/util/Map;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p5

    .line 27
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-static {p5, p3, p4, v0}, Luu0;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/util/ArrayList;Z)Lru0;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x4

    .line 38
    :try_start_0
    iget-object p4, p3, Lru0;->a:Ljava/lang/reflect/Method;

    .line 39
    .line 40
    const/4 p5, 0x1

    .line 41
    invoke-virtual {p4, p5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 42
    .line 43
    .line 44
    iget-object p3, p3, Lru0;->b:[Ljava/lang/Object;

    .line 45
    .line 46
    array-length p5, p3

    .line 47
    invoke-static {p3, p5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-virtual {p4, p2, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    return-object p0

    .line 56
    :catch_0
    move-exception p2

    .line 57
    goto :goto_0

    .line 58
    :catch_1
    move-exception p2

    .line 59
    goto :goto_1

    .line 60
    :goto_0
    new-instance p3, Leh2;

    .line 61
    .line 62
    const-string p4, "The host method could not be invoked."

    .line 63
    .line 64
    invoke-direct {p3, p1, p0, p4, p2}, Leh2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    throw p3

    .line 68
    :goto_1
    new-instance p3, Leh2;

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    if-nez p4, :cond_0

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_0
    move-object p2, p4

    .line 78
    :goto_2
    const-string p4, "The host method threw an exception."

    .line 79
    .line 80
    invoke-direct {p3, p1, p0, p4, p2}, Leh2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    throw p3

    .line 84
    :cond_1
    new-instance p0, Leh2;

    .line 85
    .line 86
    const-string p2, "No matching method named the requested name was found."

    .line 87
    .line 88
    const/16 p3, 0xc

    .line 89
    .line 90
    const-string p4, "NOT_FOUND"

    .line 91
    .line 92
    invoke-direct {p0, p3, p4, p2, p1}, Leh2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lth1;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public c(Lim0;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0, p1, p2}, Lj51;->w(Ljava/lang/String;Lim0;I)Landroid/graphics/Typeface;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public d()I
    .locals 0

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    return p0
.end method

.method public e(Lyk2;Lxk2;Lmb;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Lzk2;

    .line 2
    .line 3
    const-string p1, "Script UI is unavailable in the current environment."

    .line 4
    .line 5
    const/16 p2, 0x8

    .line 6
    .line 7
    const-string p3, "UI_UNAVAILABLE"

    .line 8
    .line 9
    invoke-direct {p0, p2, p3, p1}, Lzk2;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw p0
.end method

.method public f(Lyk2;Lxf2;Lt00;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Lzk2;

    .line 2
    .line 3
    const-string p1, "Script UI is unavailable in the current environment."

    .line 4
    .line 5
    const/16 p2, 0x8

    .line 6
    .line 7
    const-string p3, "UI_UNAVAILABLE"

    .line 8
    .line 9
    invoke-direct {p0, p2, p3, p1}, Lzk2;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw p0
.end method

.method public g(Ljava/lang/String;Lt00;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ld41;

    .line 2
    .line 3
    sget-object p1, Lce0;->h:Lce0;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ld41;-><init>(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public h(Lso0;Lim0;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "sans-serif"

    .line 5
    .line 6
    invoke-static {p0, p2, p3}, Lj51;->w(Ljava/lang/String;Lim0;I)Landroid/graphics/Typeface;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public i(Lth1;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lsp0;->c0(Lt60;)Lr61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-static {p0, p1}, Lrp0;->N(Lr61;Z)Lqn2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lxe1;->M(Lqn2;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public j(Lhh2;Ljava/lang/Object;Ljava/lang/String;Lhw0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lj51;->h:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p0, Leh2;

    .line 8
    .line 9
    const-string p2, "Raw host object access is unavailable in the current environment."

    .line 10
    .line 11
    const/16 p3, 0x8

    .line 12
    .line 13
    const-string p4, "HOST_ACCESS_UNAVAILABLE"

    .line 14
    .line 15
    invoke-direct {p0, p3, p4, p2, p1}, Leh2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw p0

    .line 19
    :pswitch_0
    sget-object p0, Luu0;->a:Ljava/util/Map;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const/4 p4, 0x0

    .line 29
    invoke-static {p0, p3, p4}, Luu0;->b(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/reflect/Field;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    return-object p0

    .line 44
    :catch_0
    move-exception p0

    .line 45
    new-instance p1, Leh2;

    .line 46
    .line 47
    const-string p2, "The host field could not be read."

    .line 48
    .line 49
    const/4 p3, 0x4

    .line 50
    const-string p4, "INTERNAL_ERROR"

    .line 51
    .line 52
    invoke-direct {p1, p3, p4, p2, p0}, Leh2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_0
    new-instance p0, Leh2;

    .line 57
    .line 58
    const-string p2, "No readable field named the requested property was found."

    .line 59
    .line 60
    const/16 p3, 0xc

    .line 61
    .line 62
    const-string p4, "NOT_FOUND"

    .line 63
    .line 64
    invoke-direct {p0, p3, p4, p2, p1}, Leh2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public k()Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lj51;->h:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance p0, Lzb2;

    .line 7
    .line 8
    const-string v0, "SHA-256"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p0, v0}, Lzb2;-><init>(Ljava/security/MessageDigest;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :catch_0
    move-exception p0

    .line 19
    new-instance v0, Ljava/lang/RuntimeException;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :pswitch_0
    new-instance p0, Lsc1;

    .line 26
    .line 27
    invoke-direct {p0}, Lsc1;-><init>()V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public l(Lr61;JLxs0;IZ)V
    .locals 7

    .line 1
    iget-object p0, p1, Lr61;->M:Lvn1;

    .line 2
    .line 3
    iget-object p1, p0, Lvn1;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lzn1;

    .line 6
    .line 7
    sget-object p5, Lzn1;->T:Lca2;

    .line 8
    .line 9
    invoke-virtual {p1, p2, p3}, Lzn1;->P0(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    iget-object p0, p0, Lvn1;->e:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    check-cast v0, Lzn1;

    .line 17
    .line 18
    sget-object v1, Lzn1;->X:Lj51;

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    move-object v4, p4

    .line 22
    move v6, p6

    .line 23
    invoke-virtual/range {v0 .. v6}, Lzn1;->X0(Lxn1;JLxs0;IZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public m(Lyk2;Ljd2;Lt00;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Lzk2;

    .line 2
    .line 3
    const-string p1, "Script UI is unavailable in the current environment."

    .line 4
    .line 5
    const/16 p2, 0x8

    .line 6
    .line 7
    const-string p3, "UI_UNAVAILABLE"

    .line 8
    .line 9
    invoke-direct {p0, p2, p3, p1}, Lzk2;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw p0
.end method

.method public n(I)I
    .locals 0

    .line 1
    return p1
.end method

.method public o(Lxs0;Lr61;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public p(I)I
    .locals 0

    .line 1
    return p1
.end method

.method public q(Lkj1;)Ljh1;
    .locals 2

    .line 1
    new-instance p0, Lkv2;

    .line 2
    .line 3
    const-class v0, Landroid/net/Uri;

    .line 4
    .line 5
    const-class v1, Landroid/os/ParcelFileDescriptor;

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1}, Lkj1;->g(Ljava/lang/Class;Ljava/lang/Class;)Ljh1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, p1, v0}, Lkv2;-><init>(Ljh1;I)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public r(Lr61;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lr61;->w()Lln2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    const/4 v0, 0x1

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-boolean p0, p0, Lln2;->k:Z

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    move p1, v0

    .line 14
    :cond_0
    xor-int/lit8 p0, p1, 0x1

    .line 15
    .line 16
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lj51;->h:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :sswitch_0
    const-string p0, "ReusedSlotId"

    .line 12
    .line 13
    return-object p0

    .line 14
    :sswitch_1
    const-string p0, "SharingStarted.Eagerly"

    .line 15
    .line 16
    return-object p0

    .line 17
    :sswitch_2
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    invoke-static {v0}, Lxe1;->j(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-class v0, Llb3;

    .line 34
    .line 35
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lbt;->c()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "<"

    .line 44
    .line 45
    const-string v2, ">"

    .line 46
    .line 47
    const-string v3, "CreationExtras.Key@"

    .line 48
    .line 49
    invoke-static {v3, p0, v1, v0, v2}, Lvi0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :sswitch_data_0
    .sparse-switch
        0x14 -> :sswitch_2
        0x1a -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public x(Lsz0;Lu00;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lwh2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lwh2;

    .line 7
    .line 8
    iget v1, v0, Lwh2;->n:I

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
    iput v1, v0, Lwh2;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwh2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lwh2;-><init>(Lj51;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lwh2;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget p2, v0, Lwh2;->n:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    if-ne p2, v2, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Lwh2;->k:Lsz0;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p0, v0

    .line 43
    move-object v5, p0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_2
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :try_start_1
    iput-object p1, v0, Lwh2;->k:Lsz0;

    .line 55
    .line 56
    iput v2, v0, Lwh2;->n:I

    .line 57
    .line 58
    iget-object p0, p1, Lsz0;->i:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Lc20;

    .line 61
    .line 62
    new-instance p2, Lu80;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-direct {p2, p1, v1, v2}, Lu80;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0, p2, v0}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    sget-object p2, Lk20;->h:Lk20;

    .line 73
    .line 74
    if-ne p0, p2, :cond_3

    .line 75
    .line 76
    return-object p2

    .line 77
    :cond_3
    :goto_1
    :try_start_2
    check-cast p0, Ljava/lang/Iterable;

    .line 78
    .line 79
    invoke-static {p0}, Ldu;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    return-object p0

    .line 84
    :goto_2
    instance-of p0, v5, Ljava/util/concurrent/CancellationException;

    .line 85
    .line 86
    if-eqz p0, :cond_4

    .line 87
    .line 88
    throw v5

    .line 89
    :cond_4
    new-instance v0, Ldg2;

    .line 90
    .line 91
    iget-object p0, p1, Lsz0;->j:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, Ljava/io/File;

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance p1, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string p2, "Unable to discover files from "

    .line 105
    .line 106
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p0, "."

    .line 113
    .line 114
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    const/4 v6, 0x4

    .line 122
    const/4 v1, 0x0

    .line 123
    sget-object v2, Lsi2;->h:Lsi2;

    .line 124
    .line 125
    const/4 v3, 0x0

    .line 126
    invoke-direct/range {v0 .. v6}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 127
    .line 128
    .line 129
    throw v0
.end method

.method public y(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p1, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 10
    .line 11
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p2, v0, v0, p1, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public z(Lsz0;Lu00;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lxh2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lxh2;

    .line 7
    .line 8
    iget v1, v0, Lxh2;->n:I

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
    iput v1, v0, Lxh2;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxh2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lxh2;-><init>(Lj51;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lxh2;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lxh2;->n:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lk20;->h:Lk20;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_2
    iget-object p1, v0, Lxh2;->k:Lsz0;

    .line 51
    .line 52
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, Lxh2;->k:Lsz0;

    .line 60
    .line 61
    iput v4, v0, Lxh2;->n:I

    .line 62
    .line 63
    invoke-virtual {p0, p1, v0}, Lj51;->x(Lsz0;Lu00;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-ne p2, v5, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 71
    .line 72
    iput-object v2, v0, Lxh2;->k:Lsz0;

    .line 73
    .line 74
    iput v3, v0, Lxh2;->n:I

    .line 75
    .line 76
    invoke-virtual {p0, p1, p2, v0}, Lj51;->A(Lsz0;Ljava/util/List;Lu00;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    if-ne p2, v5, :cond_5

    .line 81
    .line 82
    :goto_2
    return-object v5

    .line 83
    :cond_5
    :goto_3
    check-cast p2, Luh2;

    .line 84
    .line 85
    iget-object p0, p2, Luh2;->a:Lth2;

    .line 86
    .line 87
    return-object p0
.end method
