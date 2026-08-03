.class public final Ljf/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lac/k;

.field public final b:Lf/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Ljf/b;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lac/k;Lf/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljf/b;->a:Lac/k;

    .line 5
    .line 6
    iput-object p2, p0, Ljf/b;->b:Lf/r;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    iget-object v2, p0, Ljf/b;->a:Lac/k;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Lac/k;->B(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v2, v1}, Lac/k;->v(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    new-instance v3, Lpc/k;

    .line 34
    .line 35
    invoke-direct {v3, v1}, Lpc/k;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, Ljf/b;->b()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/16 v3, 0x14

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Lac/k;->B(I)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v2, Lac/k;->i:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    iget-object v3, p0, Ljf/b;->b:Lf/r;

    .line 59
    .line 60
    invoke-virtual {v3, v2}, Lf/r;->e(I)V

    .line 61
    .line 62
    .line 63
    iget v2, v3, Lf/r;->b:I

    .line 64
    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    iget-object v4, v3, Lf/r;->f:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, Lac/k;

    .line 73
    .line 74
    invoke-virtual {v4, v2}, Lac/k;->a(I)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v4, Lac/k;->i:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {v3, v2}, Lf/r;->d(I)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    :goto_0
    invoke-static {v1, v0, v2}, Ljf/a;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ljf/b;->a:Lac/k;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Lac/k;->B(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, v1, Lac/k;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {v1, v0}, Lac/k;->y(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const-string v0, "Unknown class type"

    .line 23
    .line 24
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    return-object v0
.end method

.method public final c(Lqc/e;Lac/k;Ljf/d;ILjava/util/Map;Z)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ljf/b;->a:Lac/k;

    .line 3
    .line 4
    if-eqz p6, :cond_1

    .line 5
    .line 6
    invoke-virtual {p2}, Lac/k;->g()Lac/k;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/16 v3, 0x1c

    .line 11
    .line 12
    invoke-virtual {v1, v3}, Lac/k;->B(I)V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Lac/k;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v2, v3}, Lac/k;->a(I)V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Ljf/b;->b:Lf/r;

    .line 32
    .line 33
    iget-object v3, v3, Lf/r;->g:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Lac/k;

    .line 36
    .line 37
    invoke-static {v2, v3}, La7/a;->H(Lac/k;Lac/k;)Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v2, v0

    .line 43
    :goto_0
    const/4 v3, 0x0

    .line 44
    move v4, v3

    .line 45
    move v5, v4

    .line 46
    :goto_1
    if-ge v4, p4, :cond_4

    .line 47
    .line 48
    invoke-static {p2}, La/a;->H0(Lac/k;)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    add-int/2addr v5, v6

    .line 53
    invoke-static {p2}, La/a;->H0(Lac/k;)I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    invoke-virtual {v1, p3, v5}, Lac/k;->j(Ljf/d;I)I

    .line 58
    .line 59
    .line 60
    iput v6, p3, Ljf/d;->e:I

    .line 61
    .line 62
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-interface {p5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Ljava/lang/Integer;

    .line 71
    .line 72
    if-eqz v6, :cond_2

    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move v6, v3

    .line 80
    :goto_2
    iput v6, p3, Ljf/d;->f:I

    .line 81
    .line 82
    if-eqz p6, :cond_3

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-ge v4, v6, :cond_3

    .line 89
    .line 90
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    check-cast v6, Lnc/a;

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    move-object v6, v0

    .line 98
    :goto_3
    iput-object v6, p3, Ljf/d;->g:Lnc/a;

    .line 99
    .line 100
    invoke-virtual {p1, p3}, Lqc/e;->accept(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    return-void
.end method

.method public final d(Lqc/e;Lac/k;Ljf/f;ILjava/util/Map;Ljava/util/Map;)V
    .locals 13

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    new-instance v1, La5/a;

    .line 4
    .line 5
    iget-object v2, p0, Ljf/b;->a:Lac/k;

    .line 6
    .line 7
    invoke-virtual {v2}, Lac/k;->g()Lac/k;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-direct {v1, v3}, La5/a;-><init>(Lac/k;)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    move/from16 v4, p4

    .line 16
    .line 17
    move v5, v3

    .line 18
    move v6, v5

    .line 19
    :goto_0
    if-ge v5, v4, :cond_3

    .line 20
    .line 21
    invoke-static {p2}, La/a;->H0(Lac/k;)I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    add-int/2addr v6, v7

    .line 26
    invoke-static {p2}, La/a;->H0(Lac/k;)I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    invoke-static {p2}, La/a;->H0(Lac/k;)I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    iget-object v9, v0, Ljf/f;->b:Ljf/h;

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    iput-object v10, v9, Ljf/h;->b:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v10, v9, Ljf/h;->c:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v10, v9, Ljf/h;->d:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v10, v9, Ljf/h;->e:Ljava/util/List;

    .line 44
    .line 45
    iget-object v11, v2, Lac/k;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v11, Lff/e;

    .line 48
    .line 49
    iget v11, v11, Lff/e;->a:I

    .line 50
    .line 51
    const v12, 0xffff

    .line 52
    .line 53
    .line 54
    and-int/2addr v11, v12

    .line 55
    shl-int/lit8 v11, v11, 0x10

    .line 56
    .line 57
    and-int/2addr v12, v6

    .line 58
    or-int/2addr v11, v12

    .line 59
    iput v11, v9, Ljf/h;->a:I

    .line 60
    .line 61
    iput v6, v9, Ljf/h;->f:I

    .line 62
    .line 63
    iput-object v2, v9, Ljf/h;->g:Lac/k;

    .line 64
    .line 65
    iput v7, v0, Ljf/f;->c:I

    .line 66
    .line 67
    if-nez v8, :cond_0

    .line 68
    .line 69
    iput-object v10, v0, Ljf/f;->f:La5/a;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    iput v6, v1, La5/a;->h:I

    .line 73
    .line 74
    iget-object v7, v1, La5/a;->i:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v7, Lac/k;

    .line 77
    .line 78
    iput v8, v7, Lac/k;->h:I

    .line 79
    .line 80
    iput-object v1, v0, Ljf/f;->f:La5/a;

    .line 81
    .line 82
    :goto_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    move-object/from16 v8, p5

    .line 87
    .line 88
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    check-cast v7, Ljava/lang/Integer;

    .line 93
    .line 94
    if-eqz v7, :cond_1

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    goto :goto_2

    .line 101
    :cond_1
    move v7, v3

    .line 102
    :goto_2
    iput v7, v0, Ljf/f;->d:I

    .line 103
    .line 104
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    move-object/from16 v9, p6

    .line 109
    .line 110
    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    check-cast v7, Ljava/lang/Integer;

    .line 115
    .line 116
    if-eqz v7, :cond_2

    .line 117
    .line 118
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    goto :goto_3

    .line 123
    :cond_2
    move v7, v3

    .line 124
    :goto_3
    iput v7, v0, Ljf/f;->e:I

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Lqc/e;->accept(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    add-int/lit8 v5, v5, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_3
    return-void
.end method

.method public final e(Lqc/e;Lqc/e;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v7, v0, Ljf/b;->b:Lf/r;

    .line 4
    .line 5
    iget-object v1, v7, Lf/r;->f:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v8, v1

    .line 8
    check-cast v8, Lac/k;

    .line 9
    .line 10
    const/16 v1, 0x18

    .line 11
    .line 12
    iget-object v2, v0, Ljf/b;->a:Lac/k;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lac/k;->B(I)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance v3, Lac/k;

    .line 29
    .line 30
    iget-object v4, v2, Lac/k;->j:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Lff/e;

    .line 33
    .line 34
    invoke-direct {v3, v4, v1}, Lac/k;-><init>(Lff/e;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, La/a;->H0(Lac/k;)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-static {v3}, La/a;->H0(Lac/k;)I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    invoke-static {v3}, La/a;->H0(Lac/k;)I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    invoke-static {v3}, La/a;->H0(Lac/k;)I

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    add-int v1, v4, v9

    .line 54
    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 58
    .line 59
    :goto_0
    move-object/from16 v5, p1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    move-object v1, v5

    .line 68
    goto :goto_0

    .line 69
    :goto_1
    iput-object v1, v5, Lqc/e;->b:Ljava/util/List;

    .line 70
    .line 71
    add-int v1, v10, v11

    .line 72
    .line 73
    if-nez v1, :cond_2

    .line 74
    .line 75
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 76
    .line 77
    :goto_2
    move-object/from16 v12, p2

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    move-object v1, v6

    .line 86
    goto :goto_2

    .line 87
    :goto_3
    iput-object v1, v12, Lqc/e;->b:Ljava/util/List;

    .line 88
    .line 89
    const/16 v1, 0x14

    .line 90
    .line 91
    invoke-virtual {v2, v1}, Lac/k;->B(I)V

    .line 92
    .line 93
    .line 94
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-virtual {v7, v1}, Lf/r;->e(I)V

    .line 103
    .line 104
    .line 105
    iget v1, v7, Lf/r;->c:I

    .line 106
    .line 107
    const/16 v14, 0x10

    .line 108
    .line 109
    if-nez v1, :cond_3

    .line 110
    .line 111
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 112
    .line 113
    :goto_4
    move-object v2, v3

    .line 114
    goto :goto_6

    .line 115
    :cond_3
    invoke-virtual {v8, v14}, Lac/k;->B(I)V

    .line 116
    .line 117
    .line 118
    iget-object v1, v8, Lac/k;->i:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 121
    .line 122
    new-instance v2, Ljava/util/HashMap;

    .line 123
    .line 124
    iget v6, v7, Lf/r;->c:I

    .line 125
    .line 126
    invoke-direct {v2, v6}, Ljava/util/HashMap;-><init>(I)V

    .line 127
    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    :goto_5
    iget v15, v7, Lf/r;->c:I

    .line 131
    .line 132
    if-ge v6, v15, :cond_4

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 135
    .line 136
    .line 137
    move-result v15

    .line 138
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 139
    .line 140
    .line 141
    move-result v16

    .line 142
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    invoke-virtual {v2, v15, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    add-int/lit8 v6, v6, 0x1

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_4
    move-object v1, v2

    .line 157
    goto :goto_4

    .line 158
    :goto_6
    new-instance v3, Ljf/d;

    .line 159
    .line 160
    invoke-direct {v3, v7}, Ljf/d;-><init>(Lf/r;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljf/b;->b()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    iput-object v6, v3, Ljf/d;->b:Ljava/lang/String;

    .line 168
    .line 169
    const/4 v6, 0x1

    .line 170
    move-object/from16 v17, v5

    .line 171
    .line 172
    move-object v5, v1

    .line 173
    move-object/from16 v1, v17

    .line 174
    .line 175
    invoke-virtual/range {v0 .. v6}, Ljf/b;->c(Lqc/e;Lac/k;Ljf/d;ILjava/util/Map;Z)V

    .line 176
    .line 177
    .line 178
    const/4 v6, 0x0

    .line 179
    move-object/from16 v0, p0

    .line 180
    .line 181
    move-object/from16 v1, p1

    .line 182
    .line 183
    move v4, v9

    .line 184
    invoke-virtual/range {v0 .. v6}, Ljf/b;->c(Lqc/e;Lac/k;Ljf/d;ILjava/util/Map;Z)V

    .line 185
    .line 186
    .line 187
    new-instance v3, Ljf/f;

    .line 188
    .line 189
    invoke-direct {v3, v7}, Ljf/f;-><init>(Lf/r;)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Ljf/h;

    .line 193
    .line 194
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 195
    .line 196
    .line 197
    iput-object v0, v3, Ljf/f;->b:Ljf/h;

    .line 198
    .line 199
    iget v0, v7, Lf/r;->d:I

    .line 200
    .line 201
    if-nez v0, :cond_5

    .line 202
    .line 203
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 204
    .line 205
    move-object v5, v0

    .line 206
    goto :goto_8

    .line 207
    :cond_5
    iget v0, v7, Lf/r;->c:I

    .line 208
    .line 209
    mul-int/lit8 v0, v0, 0x8

    .line 210
    .line 211
    add-int/2addr v0, v14

    .line 212
    invoke-virtual {v8, v0}, Lac/k;->B(I)V

    .line 213
    .line 214
    .line 215
    iget-object v0, v8, Lac/k;->i:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 218
    .line 219
    new-instance v1, Ljava/util/HashMap;

    .line 220
    .line 221
    iget v4, v7, Lf/r;->d:I

    .line 222
    .line 223
    invoke-direct {v1, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 224
    .line 225
    .line 226
    const/4 v4, 0x0

    .line 227
    :goto_7
    iget v5, v7, Lf/r;->d:I

    .line 228
    .line 229
    if-ge v4, v5, :cond_6

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    add-int/lit8 v4, v4, 0x1

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_6
    move-object v5, v1

    .line 254
    :goto_8
    iget v0, v7, Lf/r;->e:I

    .line 255
    .line 256
    if-nez v0, :cond_7

    .line 257
    .line 258
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 259
    .line 260
    move-object v6, v0

    .line 261
    move v4, v10

    .line 262
    move-object v1, v12

    .line 263
    move-object/from16 v0, p0

    .line 264
    .line 265
    goto :goto_a

    .line 266
    :cond_7
    iget v0, v7, Lf/r;->c:I

    .line 267
    .line 268
    mul-int/lit8 v0, v0, 0x8

    .line 269
    .line 270
    add-int/2addr v0, v14

    .line 271
    iget v1, v7, Lf/r;->d:I

    .line 272
    .line 273
    mul-int/lit8 v1, v1, 0x8

    .line 274
    .line 275
    add-int/2addr v1, v0

    .line 276
    invoke-virtual {v8, v1}, Lac/k;->B(I)V

    .line 277
    .line 278
    .line 279
    iget-object v0, v8, Lac/k;->i:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 282
    .line 283
    new-instance v1, Ljava/util/HashMap;

    .line 284
    .line 285
    iget v4, v7, Lf/r;->e:I

    .line 286
    .line 287
    invoke-direct {v1, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 288
    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    :goto_9
    iget v4, v7, Lf/r;->e:I

    .line 292
    .line 293
    if-ge v13, v4, :cond_8

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    invoke-virtual {v1, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    add-int/lit8 v13, v13, 0x1

    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_8
    move-object v6, v1

    .line 318
    move-object/from16 v0, p0

    .line 319
    .line 320
    move v4, v10

    .line 321
    move-object v1, v12

    .line 322
    :goto_a
    invoke-virtual/range {v0 .. v6}, Ljf/b;->d(Lqc/e;Lac/k;Ljf/f;ILjava/util/Map;Ljava/util/Map;)V

    .line 323
    .line 324
    .line 325
    move v4, v11

    .line 326
    invoke-virtual/range {v0 .. v6}, Ljf/b;->d(Lqc/e;Lac/k;Ljf/f;ILjava/util/Map;Ljava/util/Map;)V

    .line 327
    .line 328
    .line 329
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljf/b;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
