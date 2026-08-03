.class public final Lfb/p1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:Z

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Lfb/c1;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfb/c1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)V
    .locals 19

    .line 1
    move/from16 v0, p13

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    const-string v9, ""

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v3, v9

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object/from16 v3, p1

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v1, v0, 0x2

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    move-object v4, v9

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object/from16 v4, p2

    .line 20
    .line 21
    :goto_1
    and-int/lit8 v1, v0, 0x4

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    move-object v5, v9

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move-object/from16 v5, p3

    .line 28
    .line 29
    :goto_2
    and-int/lit8 v1, v0, 0x8

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    move-object v6, v2

    .line 35
    goto :goto_3

    .line 36
    :cond_3
    move-object/from16 v6, p4

    .line 37
    .line 38
    :goto_3
    and-int/lit8 v1, v0, 0x10

    .line 39
    .line 40
    if-eqz v1, :cond_4

    .line 41
    .line 42
    const-string v1, "assistant"

    .line 43
    .line 44
    move-object v7, v1

    .line 45
    goto :goto_4

    .line 46
    :cond_4
    move-object/from16 v7, p5

    .line 47
    .line 48
    :goto_4
    and-int/lit8 v1, v0, 0x20

    .line 49
    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    move-object v8, v9

    .line 53
    goto :goto_5

    .line 54
    :cond_5
    move-object/from16 v8, p6

    .line 55
    .line 56
    :goto_5
    and-int/lit16 v1, v0, 0x400

    .line 57
    .line 58
    if-eqz v1, :cond_6

    .line 59
    .line 60
    move-object v13, v9

    .line 61
    goto :goto_6

    .line 62
    :cond_6
    move-object/from16 v13, p7

    .line 63
    .line 64
    :goto_6
    and-int/lit16 v1, v0, 0x800

    .line 65
    .line 66
    if-eqz v1, :cond_7

    .line 67
    .line 68
    move-object v14, v2

    .line 69
    goto :goto_7

    .line 70
    :cond_7
    move-object/from16 v14, p8

    .line 71
    .line 72
    :goto_7
    and-int/lit16 v1, v0, 0x1000

    .line 73
    .line 74
    if-eqz v1, :cond_8

    .line 75
    .line 76
    move-object v15, v2

    .line 77
    goto :goto_8

    .line 78
    :cond_8
    move-object/from16 v15, p9

    .line 79
    .line 80
    :goto_8
    and-int/lit16 v1, v0, 0x2000

    .line 81
    .line 82
    if-eqz v1, :cond_9

    .line 83
    .line 84
    move-object/from16 v16, v2

    .line 85
    .line 86
    goto :goto_9

    .line 87
    :cond_9
    move-object/from16 v16, p10

    .line 88
    .line 89
    :goto_9
    and-int/lit16 v1, v0, 0x4000

    .line 90
    .line 91
    if-eqz v1, :cond_a

    .line 92
    .line 93
    move-object/from16 v17, v2

    .line 94
    .line 95
    goto :goto_a

    .line 96
    :cond_a
    move-object/from16 v17, p11

    .line 97
    .line 98
    :goto_a
    const v1, 0x8000

    .line 99
    .line 100
    .line 101
    and-int/2addr v0, v1

    .line 102
    if-eqz v0, :cond_b

    .line 103
    .line 104
    move-object/from16 v18, v2

    .line 105
    .line 106
    goto :goto_b

    .line 107
    :cond_b
    move-object/from16 v18, p12

    .line 108
    .line 109
    :goto_b
    const/4 v10, 0x0

    .line 110
    const/4 v11, 0x0

    .line 111
    move-object v12, v9

    .line 112
    move-object/from16 v2, p0

    .line 113
    .line 114
    invoke-direct/range {v2 .. v18}, Lfb/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lfb/c1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lfb/c1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 118
    invoke-static {p1, p2, p3, p5, p6}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    iput-object p1, p0, Lfb/p1;->a:Ljava/lang/String;

    .line 122
    iput-object p2, p0, Lfb/p1;->b:Ljava/lang/String;

    .line 123
    iput-object p3, p0, Lfb/p1;->c:Ljava/lang/String;

    .line 124
    iput-object p4, p0, Lfb/p1;->d:Ljava/util/List;

    .line 125
    iput-object p5, p0, Lfb/p1;->e:Ljava/lang/String;

    .line 126
    iput-object p6, p0, Lfb/p1;->f:Ljava/lang/String;

    .line 127
    iput-object p7, p0, Lfb/p1;->g:Ljava/lang/String;

    .line 128
    iput-boolean p8, p0, Lfb/p1;->h:Z

    .line 129
    iput-boolean p9, p0, Lfb/p1;->i:Z

    .line 130
    iput-object p10, p0, Lfb/p1;->j:Ljava/lang/String;

    .line 131
    iput-object p11, p0, Lfb/p1;->k:Ljava/lang/String;

    .line 132
    iput-object p12, p0, Lfb/p1;->l:Lfb/c1;

    .line 133
    iput-object p13, p0, Lfb/p1;->m:Ljava/lang/String;

    .line 134
    iput-object p14, p0, Lfb/p1;->n:Ljava/lang/String;

    .line 135
    iput-object p15, p0, Lfb/p1;->o:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 136
    iput-object p1, p0, Lfb/p1;->p:Ljava/lang/Integer;

    return-void
.end method

.method public static a(Lfb/p1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;I)Lfb/p1;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p8

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, Lfb/p1;->a:Ljava/lang/String;

    .line 10
    .line 11
    move-object v4, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v4, p1

    .line 14
    .line 15
    :goto_0
    iget-object v5, v0, Lfb/p1;->b:Ljava/lang/String;

    .line 16
    .line 17
    and-int/lit8 v2, v1, 0x4

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, v0, Lfb/p1;->c:Ljava/lang/String;

    .line 22
    .line 23
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object/from16 v6, p2

    .line 26
    .line 27
    :goto_1
    iget-object v7, v0, Lfb/p1;->d:Ljava/util/List;

    .line 28
    .line 29
    iget-object v8, v0, Lfb/p1;->e:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v9, v0, Lfb/p1;->f:Ljava/lang/String;

    .line 32
    .line 33
    and-int/lit8 v2, v1, 0x40

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-object v2, v0, Lfb/p1;->g:Ljava/lang/String;

    .line 38
    .line 39
    move-object v10, v2

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move-object/from16 v10, p3

    .line 42
    .line 43
    :goto_2
    and-int/lit16 v2, v1, 0x80

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    iget-boolean v2, v0, Lfb/p1;->h:Z

    .line 48
    .line 49
    move v11, v2

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move/from16 v11, p4

    .line 52
    .line 53
    :goto_3
    and-int/lit16 v2, v1, 0x100

    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    iget-boolean v2, v0, Lfb/p1;->i:Z

    .line 58
    .line 59
    move v12, v2

    .line 60
    goto :goto_4

    .line 61
    :cond_4
    move/from16 v12, p5

    .line 62
    .line 63
    :goto_4
    and-int/lit16 v2, v1, 0x200

    .line 64
    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    iget-object v2, v0, Lfb/p1;->j:Ljava/lang/String;

    .line 68
    .line 69
    move-object v13, v2

    .line 70
    goto :goto_5

    .line 71
    :cond_5
    move-object/from16 v13, p6

    .line 72
    .line 73
    :goto_5
    and-int/lit16 v1, v1, 0x400

    .line 74
    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    iget-object v1, v0, Lfb/p1;->k:Ljava/lang/String;

    .line 78
    .line 79
    move-object v14, v1

    .line 80
    goto :goto_6

    .line 81
    :cond_6
    move-object/from16 v14, p7

    .line 82
    .line 83
    :goto_6
    iget-object v15, v0, Lfb/p1;->l:Lfb/c1;

    .line 84
    .line 85
    iget-object v1, v0, Lfb/p1;->m:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v2, v0, Lfb/p1;->n:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v3, v0, Lfb/p1;->o:Ljava/lang/String;

    .line 90
    .line 91
    move-object/from16 v16, v1

    .line 92
    .line 93
    iget-object v1, v0, Lfb/p1;->p:Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-object/from16 v18, v3

    .line 123
    .line 124
    new-instance v3, Lfb/p1;

    .line 125
    .line 126
    move-object/from16 v19, v1

    .line 127
    .line 128
    move-object/from16 v17, v2

    .line 129
    .line 130
    invoke-direct/range {v3 .. v19}, Lfb/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lfb/c1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 131
    .line 132
    .line 133
    return-object v3
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lfb/p1;

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
    check-cast p1, Lfb/p1;

    .line 12
    .line 13
    iget-object v1, p0, Lfb/p1;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lfb/p1;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lfb/p1;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lfb/p1;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lfb/p1;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lfb/p1;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lfb/p1;->d:Ljava/util/List;

    .line 47
    .line 48
    iget-object v3, p1, Lfb/p1;->d:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lfb/p1;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lfb/p1;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lfb/p1;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lfb/p1;->f:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lfb/p1;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lfb/p1;->g:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-boolean v1, p0, Lfb/p1;->h:Z

    .line 91
    .line 92
    iget-boolean v3, p1, Lfb/p1;->h:Z

    .line 93
    .line 94
    if-eq v1, v3, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    iget-boolean v1, p0, Lfb/p1;->i:Z

    .line 98
    .line 99
    iget-boolean v3, p1, Lfb/p1;->i:Z

    .line 100
    .line 101
    if-eq v1, v3, :cond_a

    .line 102
    .line 103
    return v2

    .line 104
    :cond_a
    iget-object v1, p0, Lfb/p1;->j:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v3, p1, Lfb/p1;->j:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_b

    .line 113
    .line 114
    return v2

    .line 115
    :cond_b
    iget-object v1, p0, Lfb/p1;->k:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v3, p1, Lfb/p1;->k:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_c

    .line 124
    .line 125
    return v2

    .line 126
    :cond_c
    iget-object v1, p0, Lfb/p1;->l:Lfb/c1;

    .line 127
    .line 128
    iget-object v3, p1, Lfb/p1;->l:Lfb/c1;

    .line 129
    .line 130
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-nez v1, :cond_d

    .line 135
    .line 136
    return v2

    .line 137
    :cond_d
    iget-object v1, p0, Lfb/p1;->m:Ljava/lang/String;

    .line 138
    .line 139
    iget-object v3, p1, Lfb/p1;->m:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_e

    .line 146
    .line 147
    return v2

    .line 148
    :cond_e
    iget-object v1, p0, Lfb/p1;->n:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v3, p1, Lfb/p1;->n:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-nez v1, :cond_f

    .line 157
    .line 158
    return v2

    .line 159
    :cond_f
    iget-object v1, p0, Lfb/p1;->o:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v3, p1, Lfb/p1;->o:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-nez v1, :cond_10

    .line 168
    .line 169
    return v2

    .line 170
    :cond_10
    iget-object v1, p0, Lfb/p1;->p:Ljava/lang/Integer;

    .line 171
    .line 172
    iget-object p1, p1, Lfb/p1;->p:Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-nez p1, :cond_11

    .line 179
    .line 180
    return v2

    .line 181
    :cond_11
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lfb/p1;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lfb/p1;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lfb/p1;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x0

    .line 23
    iget-object v3, p0, Lfb/p1;->d:Ljava/util/List;

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    move v3, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    :goto_0
    add-int/2addr v0, v3

    .line 34
    mul-int/2addr v0, v1

    .line 35
    iget-object v3, p0, Lfb/p1;->e:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v3, p0, Lfb/p1;->f:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v3, p0, Lfb/p1;->g:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-boolean v3, p0, Lfb/p1;->h:Z

    .line 54
    .line 55
    invoke-static {v0, v1, v3}, Leh/a;->h(IIZ)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-boolean v3, p0, Lfb/p1;->i:Z

    .line 60
    .line 61
    invoke-static {v0, v1, v3}, Leh/a;->h(IIZ)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object v3, p0, Lfb/p1;->j:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v3, p0, Lfb/p1;->k:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-object v3, p0, Lfb/p1;->l:Lfb/c1;

    .line 78
    .line 79
    if-nez v3, :cond_1

    .line 80
    .line 81
    move v3, v2

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v3}, Lfb/c1;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    :goto_1
    add-int/2addr v0, v3

    .line 88
    mul-int/2addr v0, v1

    .line 89
    iget-object v3, p0, Lfb/p1;->m:Ljava/lang/String;

    .line 90
    .line 91
    if-nez v3, :cond_2

    .line 92
    .line 93
    move v3, v2

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    :goto_2
    add-int/2addr v0, v3

    .line 100
    mul-int/2addr v0, v1

    .line 101
    iget-object v3, p0, Lfb/p1;->n:Ljava/lang/String;

    .line 102
    .line 103
    if-nez v3, :cond_3

    .line 104
    .line 105
    move v3, v2

    .line 106
    goto :goto_3

    .line 107
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    :goto_3
    add-int/2addr v0, v3

    .line 112
    mul-int/2addr v0, v1

    .line 113
    iget-object v3, p0, Lfb/p1;->o:Ljava/lang/String;

    .line 114
    .line 115
    if-nez v3, :cond_4

    .line 116
    .line 117
    move v3, v2

    .line 118
    goto :goto_4

    .line 119
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    :goto_4
    add-int/2addr v0, v3

    .line 124
    mul-int/2addr v0, v1

    .line 125
    iget-object v1, p0, Lfb/p1;->p:Ljava/lang/Integer;

    .line 126
    .line 127
    if-nez v1, :cond_5

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    :goto_5
    add-int/2addr v0, v2

    .line 135
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", progress="

    .line 2
    .line 3
    const-string v1, ", reasoning="

    .line 4
    .line 5
    const-string v2, "ScriptPluginAgentStreamUpdate(reply="

    .line 6
    .line 7
    iget-object v3, p0, Lfb/p1;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lfb/p1;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lfb/p1;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", toolEvents="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lfb/p1;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", phase="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", toolEventId="

    .line 36
    .line 37
    const-string v2, ", streamId="

    .line 38
    .line 39
    iget-object v3, p0, Lfb/p1;->e:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v4, p0, Lfb/p1;->f:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lfb/p1;->g:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", replyRevision="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p0, Lfb/p1;->h:Z

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", reasoningRevision="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-boolean v1, p0, Lfb/p1;->i:Z

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", turnId="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lfb/p1;->j:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ", parentMessageId="

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lfb/p1;->k:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v1, ", resumeState="

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-object v1, p0, Lfb/p1;->l:Lfb/c1;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v1, ", checkpointNativeToolHistory="

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", checkpointProtocolTranscript="

    .line 107
    .line 108
    const-string v2, ", checkpointConversationSummary="

    .line 109
    .line 110
    iget-object v3, p0, Lfb/p1;->m:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v4, p0, Lfb/p1;->n:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, Lfb/p1;->o:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v1, ", checkpointCompactedMessageCount="

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lfb/p1;->p:Ljava/lang/Integer;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v1, ")"

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    return-object v0
.end method
