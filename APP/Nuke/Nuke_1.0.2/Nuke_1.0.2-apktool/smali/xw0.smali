.class public final Lxw0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/util/ArrayList;

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lxw0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lxw0;->c:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Lxw0;->e:I

    .line 12
    .line 13
    filled-new-array {v0}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Leu;->R([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lxw0;->f:Ljava/util/ArrayList;

    .line 22
    .line 23
    return-void
.end method

.method public static h(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gt v1, v2, :cond_3

    .line 12
    .line 13
    const/16 v2, 0x26

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-static {p0, v2, v1, v3}, Lpv2;->p0(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :cond_0
    const/16 v5, 0x3d

    .line 28
    .line 29
    invoke-static {p0, v5, v1, v3}, Lpv2;->p0(Ljava/lang/CharSequence;CII)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eq v3, v4, :cond_2

    .line 34
    .line 35
    if-le v3, v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :goto_2
    add-int/lit8 v1, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxw0;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lxw0;->g:Ljava/util/ArrayList;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lxw0;->g:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const-string v2, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~"

    .line 22
    .line 23
    const/16 v3, 0x5b

    .line 24
    .line 25
    invoke-static {p1, v1, v1, v2, v3}, Lci0;->w(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lxw0;->g:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    invoke-static {p2, v1, v1, v2, v3}, Lci0;->w(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 p1, 0x0

    .line 45
    :goto_0
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final b()Lyw0;
    .locals 13

    .line 1
    iget-object v1, p0, Lxw0;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz v1, :cond_6

    .line 5
    .line 6
    iget-object v2, p0, Lxw0;->b:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x7

    .line 10
    invoke-static {v2, v3, v3, v4}, Lci0;->R(Ljava/lang/String;III)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v5, p0, Lxw0;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v5, v3, v3, v4}, Lci0;->R(Ljava/lang/String;III)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    move v6, v4

    .line 21
    iget-object v4, p0, Lxw0;->d:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v4, :cond_5

    .line 24
    .line 25
    move v7, v3

    .line 26
    move-object v3, v5

    .line 27
    invoke-virtual {p0}, Lxw0;->c()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    move v8, v6

    .line 32
    new-instance v6, Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v9, p0, Lxw0;->f:Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 v10, 0xa

    .line 37
    .line 38
    invoke-static {v9, v10}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v11

    .line 42
    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    if-eqz v11, :cond_0

    .line 54
    .line 55
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    check-cast v11, Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v11, v7, v7, v8}, Lci0;->R(Ljava/lang/String;III)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    iget-object v9, p0, Lxw0;->g:Ljava/util/ArrayList;

    .line 70
    .line 71
    if-eqz v9, :cond_2

    .line 72
    .line 73
    new-instance v11, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-static {v9, v10}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_3

    .line 91
    .line 92
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    check-cast v10, Ljava/lang/String;

    .line 97
    .line 98
    if-eqz v10, :cond_1

    .line 99
    .line 100
    const/4 v12, 0x3

    .line 101
    invoke-static {v10, v7, v7, v12}, Lci0;->R(Ljava/lang/String;III)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    goto :goto_2

    .line 106
    :cond_1
    move-object v10, v0

    .line 107
    :goto_2
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    move-object v11, v0

    .line 112
    :cond_3
    iget-object v9, p0, Lxw0;->h:Ljava/lang/String;

    .line 113
    .line 114
    if-eqz v9, :cond_4

    .line 115
    .line 116
    invoke-static {v9, v7, v7, v8}, Lci0;->R(Ljava/lang/String;III)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :cond_4
    move-object v8, v0

    .line 121
    invoke-virtual {p0}, Lxw0;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    new-instance v0, Lyw0;

    .line 126
    .line 127
    move-object v7, v11

    .line 128
    invoke-direct/range {v0 .. v9}, Lyw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_5
    const-string p0, "host == null"

    .line 133
    .line 134
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :cond_6
    const-string p0, "scheme == null"

    .line 139
    .line 140
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-object v0
.end method

.method public final c()I
    .locals 2

    .line 1
    iget v0, p0, Lxw0;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object p0, p0, Lxw0;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v0, "http"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/16 v1, 0x50

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string v0, "https"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    const/16 v1, 0x1bb

    .line 32
    .line 33
    :cond_2
    :goto_0
    return v1
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x7

    .line 6
    invoke-static {p1, v0, v0, v1}, Lci0;->R(Ljava/lang/String;III)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lsg3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iput-object v0, p0, Lxw0;->d:Ljava/lang/String;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "unexpected host: "

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final e(Lyw0;Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v3, Lug3;->a:[B

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-static {v2, v4, v3}, Lug3;->g(Ljava/lang/String;II)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-static {v2, v3, v5}, Lug3;->h(Ljava/lang/String;II)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    sub-int v6, v5, v3

    .line 30
    .line 31
    const/16 v7, 0x30

    .line 32
    .line 33
    const/16 v8, 0x5b

    .line 34
    .line 35
    const/16 v9, 0x3a

    .line 36
    .line 37
    const/4 v10, -0x1

    .line 38
    const/4 v11, 0x2

    .line 39
    if-ge v6, v11, :cond_1

    .line 40
    .line 41
    :cond_0
    :goto_0
    move v6, v10

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    const/16 v12, 0x61

    .line 48
    .line 49
    invoke-static {v6, v12}, Lt11;->o(II)I

    .line 50
    .line 51
    .line 52
    move-result v13

    .line 53
    const/16 v14, 0x41

    .line 54
    .line 55
    if-ltz v13, :cond_2

    .line 56
    .line 57
    const/16 v13, 0x7a

    .line 58
    .line 59
    invoke-static {v6, v13}, Lt11;->o(II)I

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    if-lez v13, :cond_3

    .line 64
    .line 65
    :cond_2
    invoke-static {v6, v14}, Lt11;->o(II)I

    .line 66
    .line 67
    .line 68
    move-result v13

    .line 69
    if-ltz v13, :cond_0

    .line 70
    .line 71
    const/16 v13, 0x5a

    .line 72
    .line 73
    invoke-static {v6, v13}, Lt11;->o(II)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-lez v6, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    add-int/lit8 v6, v3, 0x1

    .line 81
    .line 82
    :goto_1
    if-ge v6, v5, :cond_0

    .line 83
    .line 84
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    if-gt v12, v13, :cond_4

    .line 89
    .line 90
    const/16 v15, 0x7b

    .line 91
    .line 92
    if-ge v13, v15, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    if-gt v14, v13, :cond_5

    .line 96
    .line 97
    if-ge v13, v8, :cond_5

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    if-gt v7, v13, :cond_6

    .line 101
    .line 102
    if-ge v13, v9, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    const/16 v15, 0x2b

    .line 106
    .line 107
    if-eq v13, v15, :cond_8

    .line 108
    .line 109
    const/16 v15, 0x2d

    .line 110
    .line 111
    if-eq v13, v15, :cond_8

    .line 112
    .line 113
    const/16 v15, 0x2e

    .line 114
    .line 115
    if-ne v13, v15, :cond_7

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_7
    if-ne v13, v9, :cond_0

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_8
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :goto_3
    const-string v12, "http"

    .line 125
    .line 126
    const-string v13, "https"

    .line 127
    .line 128
    const/4 v14, 0x1

    .line 129
    if-eq v6, v10, :cond_b

    .line 130
    .line 131
    const-string v15, "https:"

    .line 132
    .line 133
    invoke-static {v2, v15, v3, v14}, Lwv2;->c0(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 134
    .line 135
    .line 136
    move-result v15

    .line 137
    if-eqz v15, :cond_9

    .line 138
    .line 139
    iput-object v13, v0, Lxw0;->a:Ljava/lang/String;

    .line 140
    .line 141
    add-int/lit8 v3, v3, 0x6

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_9
    const-string v15, "http:"

    .line 145
    .line 146
    invoke-static {v2, v15, v3, v14}, Lwv2;->c0(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 147
    .line 148
    .line 149
    move-result v15

    .line 150
    if-eqz v15, :cond_a

    .line 151
    .line 152
    iput-object v12, v0, Lxw0;->a:Ljava/lang/String;

    .line 153
    .line 154
    add-int/lit8 v3, v3, 0x5

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 158
    .line 159
    invoke-virtual {v2, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    new-instance v2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    const-string v3, "Expected URL scheme \'http\' or \'https\' but was \'"

    .line 166
    .line 167
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const/16 v1, 0x27

    .line 174
    .line 175
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :cond_b
    if-eqz v1, :cond_25

    .line 187
    .line 188
    iget-object v6, v1, Lyw0;->a:Ljava/lang/String;

    .line 189
    .line 190
    iput-object v6, v0, Lxw0;->a:Ljava/lang/String;

    .line 191
    .line 192
    :goto_4
    move v6, v3

    .line 193
    move v15, v4

    .line 194
    :goto_5
    const/16 v7, 0x5c

    .line 195
    .line 196
    move/from16 v16, v14

    .line 197
    .line 198
    const/16 v14, 0x2f

    .line 199
    .line 200
    if-ge v6, v5, :cond_d

    .line 201
    .line 202
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-eq v8, v14, :cond_c

    .line 207
    .line 208
    if-eq v8, v7, :cond_c

    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_c
    add-int/lit8 v15, v15, 0x1

    .line 212
    .line 213
    add-int/lit8 v6, v6, 0x1

    .line 214
    .line 215
    move/from16 v14, v16

    .line 216
    .line 217
    const/16 v8, 0x5b

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_d
    :goto_6
    const-string v8, ""

    .line 221
    .line 222
    const-string v6, " \"\'<>#"

    .line 223
    .line 224
    const/16 v9, 0x23

    .line 225
    .line 226
    if-ge v15, v11, :cond_11

    .line 227
    .line 228
    if-eqz v1, :cond_11

    .line 229
    .line 230
    iget-object v11, v1, Lyw0;->a:Ljava/lang/String;

    .line 231
    .line 232
    iget-object v7, v0, Lxw0;->a:Ljava/lang/String;

    .line 233
    .line 234
    invoke-static {v11, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    if-nez v7, :cond_e

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_e
    invoke-virtual {v1}, Lyw0;->e()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    iput-object v7, v0, Lxw0;->b:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v1}, Lyw0;->a()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    iput-object v7, v0, Lxw0;->c:Ljava/lang/String;

    .line 252
    .line 253
    iget-object v7, v1, Lyw0;->d:Ljava/lang/String;

    .line 254
    .line 255
    iput-object v7, v0, Lxw0;->d:Ljava/lang/String;

    .line 256
    .line 257
    iget v7, v1, Lyw0;->e:I

    .line 258
    .line 259
    iput v7, v0, Lxw0;->e:I

    .line 260
    .line 261
    iget-object v7, v0, Lxw0;->f:Ljava/util/ArrayList;

    .line 262
    .line 263
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1}, Lyw0;->c()Ljava/util/ArrayList;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 271
    .line 272
    .line 273
    if-eq v3, v5, :cond_f

    .line 274
    .line 275
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 276
    .line 277
    .line 278
    move-result v7

    .line 279
    if-ne v7, v9, :cond_21

    .line 280
    .line 281
    :cond_f
    invoke-virtual {v1}, Lyw0;->d()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    if-eqz v1, :cond_10

    .line 286
    .line 287
    const/16 v7, 0x53

    .line 288
    .line 289
    invoke-static {v1, v4, v4, v6, v7}, Lci0;->w(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-static {v1}, Lxw0;->h(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    goto :goto_7

    .line 298
    :cond_10
    const/4 v1, 0x0

    .line 299
    :goto_7
    iput-object v1, v0, Lxw0;->g:Ljava/util/ArrayList;

    .line 300
    .line 301
    goto/16 :goto_12

    .line 302
    .line 303
    :cond_11
    :goto_8
    add-int/2addr v3, v15

    .line 304
    move v1, v4

    .line 305
    :goto_9
    const-string v7, "@/\\?#"

    .line 306
    .line 307
    invoke-static {v2, v3, v7, v5}, Lug3;->d(Ljava/lang/String;ILjava/lang/String;I)I

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    if-eq v7, v5, :cond_12

    .line 312
    .line 313
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    goto :goto_a

    .line 318
    :cond_12
    move v11, v10

    .line 319
    :goto_a
    if-eq v11, v10, :cond_17

    .line 320
    .line 321
    if-eq v11, v9, :cond_17

    .line 322
    .line 323
    if-eq v11, v14, :cond_17

    .line 324
    .line 325
    const/16 v15, 0x5c

    .line 326
    .line 327
    if-eq v11, v15, :cond_17

    .line 328
    .line 329
    const/16 v14, 0x3f

    .line 330
    .line 331
    if-eq v11, v14, :cond_17

    .line 332
    .line 333
    const/16 v14, 0x40

    .line 334
    .line 335
    if-eq v11, v14, :cond_13

    .line 336
    .line 337
    :goto_b
    const/16 v14, 0x2f

    .line 338
    .line 339
    goto :goto_9

    .line 340
    :cond_13
    const/16 v11, 0x70

    .line 341
    .line 342
    const-string v14, " \"\':;<=>@[]^`{}|/\\?#"

    .line 343
    .line 344
    const-string v15, "%40"

    .line 345
    .line 346
    if-nez v4, :cond_16

    .line 347
    .line 348
    const/16 v9, 0x3a

    .line 349
    .line 350
    invoke-static {v2, v9, v3, v7}, Lug3;->c(Ljava/lang/String;CII)I

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    invoke-static {v2, v3, v10, v14, v11}, Lci0;->w(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    if-eqz v1, :cond_14

    .line 359
    .line 360
    new-instance v1, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 363
    .line 364
    .line 365
    iget-object v9, v0, Lxw0;->b:Ljava/lang/String;

    .line 366
    .line 367
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    :cond_14
    iput-object v3, v0, Lxw0;->b:Ljava/lang/String;

    .line 381
    .line 382
    if-eq v10, v7, :cond_15

    .line 383
    .line 384
    add-int/lit8 v10, v10, 0x1

    .line 385
    .line 386
    invoke-static {v2, v10, v7, v14, v11}, Lci0;->w(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    iput-object v1, v0, Lxw0;->c:Ljava/lang/String;

    .line 391
    .line 392
    move/from16 v4, v16

    .line 393
    .line 394
    :cond_15
    move/from16 v1, v16

    .line 395
    .line 396
    goto :goto_c

    .line 397
    :cond_16
    new-instance v9, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 400
    .line 401
    .line 402
    iget-object v10, v0, Lxw0;->c:Ljava/lang/String;

    .line 403
    .line 404
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-static {v2, v3, v7, v14, v11}, Lci0;->w(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    iput-object v3, v0, Lxw0;->c:Ljava/lang/String;

    .line 422
    .line 423
    :goto_c
    add-int/lit8 v3, v7, 0x1

    .line 424
    .line 425
    const/16 v9, 0x23

    .line 426
    .line 427
    const/4 v10, -0x1

    .line 428
    goto :goto_b

    .line 429
    :cond_17
    move v1, v3

    .line 430
    :goto_d
    if-ge v1, v7, :cond_1a

    .line 431
    .line 432
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    const/16 v9, 0x3a

    .line 437
    .line 438
    if-eq v4, v9, :cond_1b

    .line 439
    .line 440
    const/16 v10, 0x5b

    .line 441
    .line 442
    if-eq v4, v10, :cond_18

    .line 443
    .line 444
    goto :goto_e

    .line 445
    :cond_18
    add-int/lit8 v1, v1, 0x1

    .line 446
    .line 447
    if-ge v1, v7, :cond_19

    .line 448
    .line 449
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    const/16 v11, 0x5d

    .line 454
    .line 455
    if-ne v4, v11, :cond_18

    .line 456
    .line 457
    :cond_19
    :goto_e
    add-int/lit8 v1, v1, 0x1

    .line 458
    .line 459
    goto :goto_d

    .line 460
    :cond_1a
    move v1, v7

    .line 461
    :cond_1b
    add-int/lit8 v4, v1, 0x1

    .line 462
    .line 463
    const/4 v9, 0x4

    .line 464
    const/16 v10, 0x22

    .line 465
    .line 466
    if-ge v4, v7, :cond_1e

    .line 467
    .line 468
    invoke-static {v2, v3, v1, v9}, Lci0;->R(Ljava/lang/String;III)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v9

    .line 472
    invoke-static {v9}, Lsg3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v9

    .line 476
    iput-object v9, v0, Lxw0;->d:Ljava/lang/String;

    .line 477
    .line 478
    const/16 v9, 0x78

    .line 479
    .line 480
    :try_start_0
    invoke-static {v2, v4, v7, v8, v9}, Lci0;->w(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v9

    .line 484
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 485
    .line 486
    .line 487
    move-result v9
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 488
    move/from16 v11, v16

    .line 489
    .line 490
    if-gt v11, v9, :cond_1c

    .line 491
    .line 492
    const/high16 v11, 0x10000

    .line 493
    .line 494
    if-ge v9, v11, :cond_1c

    .line 495
    .line 496
    goto :goto_f

    .line 497
    :catch_0
    :cond_1c
    const/4 v9, -0x1

    .line 498
    :goto_f
    iput v9, v0, Lxw0;->e:I

    .line 499
    .line 500
    const/4 v11, -0x1

    .line 501
    if-eq v9, v11, :cond_1d

    .line 502
    .line 503
    goto :goto_11

    .line 504
    :cond_1d
    invoke-virtual {v2, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    new-instance v1, Ljava/lang/StringBuilder;

    .line 509
    .line 510
    const-string v2, "Invalid URL port: \""

    .line 511
    .line 512
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    throw v1

    .line 535
    :cond_1e
    const/4 v11, -0x1

    .line 536
    invoke-static {v2, v3, v1, v9}, Lci0;->R(Ljava/lang/String;III)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    invoke-static {v4}, Lsg3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    iput-object v4, v0, Lxw0;->d:Ljava/lang/String;

    .line 545
    .line 546
    iget-object v4, v0, Lxw0;->a:Ljava/lang/String;

    .line 547
    .line 548
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v4, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v9

    .line 555
    if-eqz v9, :cond_1f

    .line 556
    .line 557
    const/16 v4, 0x50

    .line 558
    .line 559
    goto :goto_10

    .line 560
    :cond_1f
    invoke-virtual {v4, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    if-eqz v4, :cond_20

    .line 565
    .line 566
    const/16 v4, 0x1bb

    .line 567
    .line 568
    goto :goto_10

    .line 569
    :cond_20
    move v4, v11

    .line 570
    :goto_10
    iput v4, v0, Lxw0;->e:I

    .line 571
    .line 572
    :goto_11
    iget-object v4, v0, Lxw0;->d:Ljava/lang/String;

    .line 573
    .line 574
    if-eqz v4, :cond_24

    .line 575
    .line 576
    move v3, v7

    .line 577
    :cond_21
    :goto_12
    const-string v1, "?#"

    .line 578
    .line 579
    invoke-static {v2, v3, v1, v5}, Lug3;->d(Ljava/lang/String;ILjava/lang/String;I)I

    .line 580
    .line 581
    .line 582
    move-result v1

    .line 583
    invoke-virtual {v0, v2, v3, v1}, Lxw0;->f(Ljava/lang/String;II)V

    .line 584
    .line 585
    .line 586
    if-ge v1, v5, :cond_22

    .line 587
    .line 588
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    const/16 v14, 0x3f

    .line 593
    .line 594
    if-ne v3, v14, :cond_22

    .line 595
    .line 596
    const/16 v3, 0x23

    .line 597
    .line 598
    invoke-static {v2, v3, v1, v5}, Lug3;->c(Ljava/lang/String;CII)I

    .line 599
    .line 600
    .line 601
    move-result v4

    .line 602
    add-int/lit8 v1, v1, 0x1

    .line 603
    .line 604
    const/16 v3, 0x50

    .line 605
    .line 606
    invoke-static {v2, v1, v4, v6, v3}, Lci0;->w(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    invoke-static {v1}, Lxw0;->h(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    iput-object v1, v0, Lxw0;->g:Ljava/util/ArrayList;

    .line 615
    .line 616
    move v1, v4

    .line 617
    :cond_22
    if-ge v1, v5, :cond_23

    .line 618
    .line 619
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 620
    .line 621
    .line 622
    move-result v3

    .line 623
    const/16 v4, 0x23

    .line 624
    .line 625
    if-ne v3, v4, :cond_23

    .line 626
    .line 627
    const/16 v16, 0x1

    .line 628
    .line 629
    add-int/lit8 v1, v1, 0x1

    .line 630
    .line 631
    const/16 v3, 0x30

    .line 632
    .line 633
    invoke-static {v2, v1, v5, v8, v3}, Lci0;->w(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    iput-object v1, v0, Lxw0;->h:Ljava/lang/String;

    .line 638
    .line 639
    :cond_23
    return-void

    .line 640
    :cond_24
    invoke-virtual {v2, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    new-instance v1, Ljava/lang/StringBuilder;

    .line 645
    .line 646
    const-string v2, "Invalid URL host: \""

    .line 647
    .line 648
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 662
    .line 663
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    throw v1

    .line 671
    :cond_25
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    const/4 v1, 0x6

    .line 676
    if-le v0, v1, :cond_26

    .line 677
    .line 678
    invoke-static {v2, v1}, Lpv2;->H0(Ljava/lang/String;I)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    const-string v1, "..."

    .line 683
    .line 684
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    goto :goto_13

    .line 689
    :cond_26
    move-object v0, v2

    .line 690
    :goto_13
    const-string v1, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    .line 691
    .line 692
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    return-void
.end method

.method public final f(Ljava/lang/String;II)V
    .locals 6

    .line 1
    if-ne p2, p3, :cond_0

    .line 2
    .line 3
    goto/16 :goto_5

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x2f

    .line 10
    .line 11
    const-string v2, ""

    .line 12
    .line 13
    iget-object p0, p0, Lxw0;->f:Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/16 v1, 0x5c

    .line 19
    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sub-int/2addr v0, v3

    .line 27
    invoke-virtual {p0, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 p2, p2, 0x1

    .line 38
    .line 39
    :goto_0
    if-ge p2, p3, :cond_a

    .line 40
    .line 41
    const-string v0, "/\\"

    .line 42
    .line 43
    invoke-static {p1, p2, v0, p3}, Lug3;->d(Ljava/lang/String;ILjava/lang/String;I)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-ge v0, p3, :cond_2

    .line 48
    .line 49
    move v1, v3

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const/4 v1, 0x0

    .line 52
    :goto_1
    const-string v4, " \"<>^`{}|/\\?#"

    .line 53
    .line 54
    const/16 v5, 0x70

    .line 55
    .line 56
    invoke-static {p1, p2, v0, v4, v5}, Lci0;->w(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    const-string v4, "."

    .line 61
    .line 62
    invoke-virtual {p2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_8

    .line 67
    .line 68
    const-string v4, "%2e"

    .line 69
    .line 70
    invoke-virtual {p2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_3

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_3
    const-string v4, ".."

    .line 78
    .line 79
    invoke-virtual {p2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_6

    .line 84
    .line 85
    const-string v4, "%2e."

    .line 86
    .line 87
    invoke-virtual {p2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-nez v4, :cond_6

    .line 92
    .line 93
    const-string v4, ".%2e"

    .line 94
    .line 95
    invoke-virtual {p2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-nez v4, :cond_6

    .line 100
    .line 101
    const-string v4, "%2e%2e"

    .line 102
    .line 103
    invoke-virtual {p2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_4

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    sub-int/2addr v4, v3

    .line 115
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Ljava/lang/CharSequence;

    .line 120
    .line 121
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-nez v4, :cond_5

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    sub-int/2addr v4, v3

    .line 132
    invoke-virtual {p0, v4, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :goto_2
    if-eqz v1, :cond_8

    .line 140
    .line 141
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    :goto_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    sub-int/2addr p2, v3

    .line 150
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    check-cast p2, Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    if-nez p2, :cond_7

    .line 161
    .line 162
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-nez p2, :cond_7

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    sub-int/2addr p2, v3

    .line 173
    invoke-virtual {p0, p2, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_7
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_8
    :goto_4
    if-eqz v1, :cond_9

    .line 181
    .line 182
    add-int/lit8 p2, v0, 0x1

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :cond_9
    move p2, v0

    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_a
    :goto_5
    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "http"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lxw0;->a:Ljava/lang/String;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string v0, "https"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iput-object v0, p0, Lxw0;->a:Ljava/lang/String;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const-string p0, "unexpected scheme: "

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lxw0;->a:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "://"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v1, "//"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v1, p0, Lxw0;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v2, 0x3a

    .line 31
    .line 32
    if-lez v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v1, p0, Lxw0;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-lez v1, :cond_3

    .line 42
    .line 43
    :goto_1
    iget-object v1, p0, Lxw0;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lxw0;->c:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-lez v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lxw0;->c:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_2
    const/16 v1, 0x40

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v1, p0, Lxw0;->d:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-static {v1, v2}, Lpv2;->i0(Ljava/lang/CharSequence;C)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    const/16 v1, 0x5b

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lxw0;->d:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 v1, 0x5d

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    iget-object v1, p0, Lxw0;->d:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_2
    iget v1, p0, Lxw0;->e:I

    .line 101
    .line 102
    const/4 v3, -0x1

    .line 103
    if-ne v1, v3, :cond_6

    .line 104
    .line 105
    iget-object v1, p0, Lxw0;->a:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v1, :cond_a

    .line 108
    .line 109
    :cond_6
    invoke-virtual {p0}, Lxw0;->c()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    iget-object v4, p0, Lxw0;->a:Ljava/lang/String;

    .line 114
    .line 115
    if-eqz v4, :cond_9

    .line 116
    .line 117
    const-string v5, "http"

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    const/16 v3, 0x50

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_7
    const-string v5, "https"

    .line 129
    .line 130
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_8

    .line 135
    .line 136
    const/16 v3, 0x1bb

    .line 137
    .line 138
    :cond_8
    :goto_3
    if-eq v1, v3, :cond_a

    .line 139
    .line 140
    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    :cond_a
    iget-object v1, p0, Lxw0;->f:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    const/4 v3, 0x0

    .line 153
    move v4, v3

    .line 154
    :goto_4
    if-ge v4, v2, :cond_b

    .line 155
    .line 156
    const/16 v5, 0x2f

    .line 157
    .line 158
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    check-cast v5, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    add-int/lit8 v4, v4, 0x1

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_b
    iget-object v1, p0, Lxw0;->g:Ljava/util/ArrayList;

    .line 174
    .line 175
    if-eqz v1, :cond_10

    .line 176
    .line 177
    const/16 v1, 0x3f

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lxw0;->g:Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-static {v3, v2}, Lci0;->X(II)Lc11;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    const/4 v3, 0x2

    .line 196
    invoke-static {v2, v3}, Lci0;->W(Lc11;I)La11;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    iget v3, v2, La11;->h:I

    .line 201
    .line 202
    iget v4, v2, La11;->i:I

    .line 203
    .line 204
    iget v2, v2, La11;->j:I

    .line 205
    .line 206
    if-lez v2, :cond_c

    .line 207
    .line 208
    if-le v3, v4, :cond_d

    .line 209
    .line 210
    :cond_c
    if-gez v2, :cond_10

    .line 211
    .line 212
    if-gt v4, v3, :cond_10

    .line 213
    .line 214
    :cond_d
    :goto_5
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    check-cast v5, Ljava/lang/String;

    .line 219
    .line 220
    add-int/lit8 v6, v3, 0x1

    .line 221
    .line 222
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    check-cast v6, Ljava/lang/String;

    .line 227
    .line 228
    if-lez v3, :cond_e

    .line 229
    .line 230
    const/16 v7, 0x26

    .line 231
    .line 232
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    :cond_e
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    if-eqz v6, :cond_f

    .line 239
    .line 240
    const/16 v5, 0x3d

    .line 241
    .line 242
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    :cond_f
    if-eq v3, v4, :cond_10

    .line 249
    .line 250
    add-int/2addr v3, v2

    .line 251
    goto :goto_5

    .line 252
    :cond_10
    iget-object v1, p0, Lxw0;->h:Ljava/lang/String;

    .line 253
    .line 254
    if-eqz v1, :cond_11

    .line 255
    .line 256
    const/16 v1, 0x23

    .line 257
    .line 258
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    iget-object p0, p0, Lxw0;->h:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    :cond_11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    return-object p0
.end method
