.class public final Lk4/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lk4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk4/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk4/d;->a:Lk4/d;

    .line 7
    .line 8
    return-void
.end method

.method public static c(Lg8/b;Lv4/e0;IZ)Li4/r;
    .locals 11

    .line 1
    iget v0, p0, Lg8/b;->c:I

    .line 2
    .line 3
    mul-int/lit8 v1, p2, 0xa

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    new-instance v0, Lz4/a;

    .line 9
    .line 10
    new-instance v1, Lz4/b;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lz4/b;-><init>(Lg8/b;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 16
    .line 17
    .line 18
    new-instance p0, Li4/r;

    .line 19
    .line 20
    invoke-direct {p0, p2}, Lz4/e;-><init>(I)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    move v3, v1

    .line 25
    :goto_0
    if-ge v3, p2, :cond_1

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    invoke-virtual {p1, v4}, Lv4/e0;->l(I)Lv4/a;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lv4/c0;

    .line 52
    .line 53
    invoke-virtual {p1, v7}, Lv4/e0;->l(I)Lv4/a;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Lv4/c0;

    .line 58
    .line 59
    if-eqz p3, :cond_0

    .line 60
    .line 61
    move-object v8, v2

    .line 62
    move-object v9, v7

    .line 63
    :goto_1
    move-object v7, v4

    .line 64
    goto :goto_2

    .line 65
    :cond_0
    move-object v9, v2

    .line 66
    move-object v8, v7

    .line 67
    goto :goto_1

    .line 68
    :goto_2
    new-instance v4, Li4/q;

    .line 69
    .line 70
    invoke-direct/range {v4 .. v10}, Li4/q;-><init>(IILv4/c0;Lv4/c0;Lv4/c0;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v3, v4}, Lz4/e;->m(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .line 75
    .line 76
    add-int/lit8 v3, v3, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catch_0
    move-exception v0

    .line 80
    move-object p0, v0

    .line 81
    const-string p1, "shouldn\'t happen"

    .line 82
    .line 83
    invoke-static {p1, p0}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    return-object p0

    .line 88
    :cond_1
    iput-boolean v1, p0, Lz4/j;->g:Z

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_2
    add-int/lit8 v1, v1, 0x2

    .line 92
    .line 93
    invoke-static {v1}, Lk4/d;->g(I)V

    .line 94
    .line 95
    .line 96
    throw v2
.end method

.method public static d(Lk4/b;II)Lh4/k;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    if-lt p2, v0, :cond_0

    .line 3
    .line 4
    new-instance v1, Lb/e;

    .line 5
    .line 6
    invoke-direct {v1, p0, p1, p2}, Lb/e;-><init>(Lk4/b;II)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lb/e;->y(I)Lt4/b;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Lh4/k;

    .line 14
    .line 15
    const-string v0, "RuntimeInvisibleAnnotations"

    .line 16
    .line 17
    invoke-direct {p1, v0, p0, p2}, Lh4/r;-><init>(Ljava/lang/String;Lt4/b;I)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-static {}, Lk4/d;->h()V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0
.end method

.method public static e(Lk4/b;II)Lh4/m;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-lt p2, v0, :cond_0

    .line 3
    .line 4
    new-instance v0, Lb/e;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1, p2}, Lb/e;-><init>(Lk4/b;II)V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    invoke-virtual {v0, p0}, Lb/e;->y(I)Lt4/b;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance p1, Lh4/m;

    .line 15
    .line 16
    const-string v0, "RuntimeVisibleAnnotations"

    .line 17
    .line 18
    invoke-direct {p1, v0, p0, p2}, Lh4/r;-><init>(Ljava/lang/String;Lt4/b;I)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-static {}, Lk4/d;->h()V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public static f(Lk4/b;II)Lh4/o;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    iget-object p2, p0, Lk4/b;->b:Lg8/b;

    .line 5
    .line 6
    invoke-virtual {p0}, Lk4/b;->d()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lk4/b;->d:Lv4/e0;

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Lg8/b;->g(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p0, p1}, Lv4/e0;->l(I)Lv4/a;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lv4/c0;

    .line 20
    .line 21
    new-instance p1, Lh4/o;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Lh4/o;-><init>(Lv4/c0;)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-static {v0}, Lk4/d;->g(I)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public static g(I)V
    .locals 2

    .line 1
    new-instance v0, Ll4/c;

    .line 2
    .line 3
    invoke-static {p0}, La/a;->Y0(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v1, "bad attribute length; expected length "

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public static h()V
    .locals 3

    .line 1
    new-instance v0, Ll4/c;

    .line 2
    .line 3
    const-string v1, "severely truncated attribute"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    throw v0
.end method


# virtual methods
.method public final a(Lk4/b;II)Lh4/s;
    .locals 11

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-ltz p2, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    if-ge p2, v0, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_0
    iget-object v0, p1, Lk4/b;->b:Lg8/b;

    .line 10
    .line 11
    invoke-virtual {p1}, Lk4/b;->d()V

    .line 12
    .line 13
    .line 14
    iget-object v2, p1, Lk4/b;->d:Lv4/e0;

    .line 15
    .line 16
    invoke-virtual {v0, p3}, Lg8/b;->g(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    add-int/lit8 v4, p3, 0x2

    .line 21
    .line 22
    invoke-virtual {v0, v4}, Lg8/b;->b(I)I

    .line 23
    .line 24
    .line 25
    move-result v10

    .line 26
    invoke-virtual {v2, v3}, Lv4/e0;->l(I)Lv4/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v2, v0

    .line 31
    check-cast v2, Lv4/c0;
    :try_end_0
    .catch Ll4/c; {:try_start_0 .. :try_end_0} :catch_1

    .line 32
    .line 33
    :try_start_1
    iget-object v8, v2, Lv4/c0;->g:Ljava/lang/String;

    .line 34
    .line 35
    add-int/lit8 v9, p3, 0x6

    .line 36
    .line 37
    move-object v5, p0

    .line 38
    move-object v6, p1

    .line 39
    move v7, p2

    .line 40
    invoke-virtual/range {v5 .. v10}, Lk4/d;->b(Lk4/b;ILjava/lang/String;II)Lh4/s;

    .line 41
    .line 42
    .line 43
    move-result-object p1
    :try_end_1
    .catch Ll4/c; {:try_start_1 .. :try_end_1} :catch_0

    .line 44
    return-object p1

    .line 45
    :catch_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    move-object v1, v2

    .line 48
    goto :goto_0

    .line 49
    :catch_1
    move-exception v0

    .line 50
    move-object p1, v0

    .line 51
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v0, "...while parsing "

    .line 54
    .line 55
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    invoke-virtual {v1}, Lv4/c0;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v1, " "

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    const-string v0, ""

    .line 72
    .line 73
    :goto_1
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, "attribute at offset "

    .line 77
    .line 78
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-static {p3}, La/a;->Y0(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p1, p2}, Lf4/a;->a(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_1
    const-string p1, "bad context"

    .line 97
    .line 98
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_2
    const/4 p1, 0x0

    .line 102
    return-object p1

    .line 103
    :cond_2
    const-string p1, "cf == null"

    .line 104
    .line 105
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2
.end method

.method public final b(Lk4/b;ILjava/lang/String;II)Lh4/s;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move/from16 v4, p5

    .line 10
    .line 11
    const-string v5, "truncated attribute"

    .line 12
    .line 13
    const-string v6, "Synthetic"

    .line 14
    .line 15
    const-string v7, "Signature"

    .line 16
    .line 17
    const-string v8, "RuntimeVisibleAnnotations"

    .line 18
    .line 19
    const-string v9, "RuntimeInvisibleAnnotations"

    .line 20
    .line 21
    const-string v10, "Deprecated"

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v13, 0x2

    .line 25
    const/4 v14, 0x0

    .line 26
    if-eqz v1, :cond_2d

    .line 27
    .line 28
    const/4 v15, 0x1

    .line 29
    if-eq v1, v15, :cond_24

    .line 30
    .line 31
    const/16 v16, 0x4

    .line 32
    .line 33
    const/4 v12, 0x3

    .line 34
    if-eq v1, v13, :cond_9

    .line 35
    .line 36
    if-eq v1, v12, :cond_1

    .line 37
    .line 38
    :cond_0
    move-object/from16 v12, p0

    .line 39
    .line 40
    goto/16 :goto_c

    .line 41
    .line 42
    :cond_1
    const-string v1, "LineNumberTable"

    .line 43
    .line 44
    if-ne v2, v1, :cond_5

    .line 45
    .line 46
    if-lt v4, v13, :cond_4

    .line 47
    .line 48
    iget-object v0, v0, Lk4/b;->b:Lg8/b;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Lg8/b;->g(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    add-int/lit8 v2, v3, 0x2

    .line 55
    .line 56
    add-int/lit8 v3, v4, -0x2

    .line 57
    .line 58
    mul-int/lit8 v4, v1, 0x4

    .line 59
    .line 60
    if-ne v3, v4, :cond_3

    .line 61
    .line 62
    new-instance v3, Li4/p;

    .line 63
    .line 64
    invoke-direct {v3, v1}, Lz4/e;-><init>(I)V

    .line 65
    .line 66
    .line 67
    move v4, v11

    .line 68
    :goto_0
    if-ge v4, v1, :cond_2

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Lg8/b;->g(I)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    add-int/lit8 v6, v2, 0x2

    .line 75
    .line 76
    invoke-virtual {v0, v6}, Lg8/b;->g(I)I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    new-instance v7, Li4/o;

    .line 81
    .line 82
    invoke-direct {v7, v5, v6}, Li4/o;-><init>(II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v4, v7}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x4

    .line 89
    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    iput-boolean v11, v3, Lz4/j;->g:Z

    .line 94
    .line 95
    new-instance v0, Lh4/i;

    .line 96
    .line 97
    invoke-direct {v0, v3}, Lh4/i;-><init>(Li4/p;)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_3
    add-int/2addr v4, v13

    .line 102
    invoke-static {v4}, Lk4/d;->g(I)V

    .line 103
    .line 104
    .line 105
    throw v14

    .line 106
    :cond_4
    invoke-static {}, Lk4/d;->h()V

    .line 107
    .line 108
    .line 109
    throw v14

    .line 110
    :cond_5
    const-string v1, "LocalVariableTable"

    .line 111
    .line 112
    if-ne v2, v1, :cond_7

    .line 113
    .line 114
    if-lt v4, v13, :cond_6

    .line 115
    .line 116
    iget-object v2, v0, Lk4/b;->b:Lg8/b;

    .line 117
    .line 118
    invoke-virtual {v2, v3}, Lg8/b;->g(I)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    add-int/lit8 v6, v3, 0x2

    .line 123
    .line 124
    add-int/2addr v3, v4

    .line 125
    invoke-virtual {v2, v6, v3}, Lg8/b;->n(II)Lg8/b;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v0}, Lk4/b;->d()V

    .line 130
    .line 131
    .line 132
    iget-object v0, v0, Lk4/b;->d:Lv4/e0;

    .line 133
    .line 134
    invoke-static {v2, v0, v5, v11}, Lk4/d;->c(Lg8/b;Lv4/e0;IZ)Li4/r;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v2, Lh4/j;

    .line 139
    .line 140
    invoke-direct {v2, v1, v0}, Lh4/j;-><init>(Ljava/lang/String;Li4/r;)V

    .line 141
    .line 142
    .line 143
    return-object v2

    .line 144
    :cond_6
    invoke-static {}, Lk4/d;->h()V

    .line 145
    .line 146
    .line 147
    throw v14

    .line 148
    :cond_7
    const-string v1, "LocalVariableTypeTable"

    .line 149
    .line 150
    if-ne v2, v1, :cond_0

    .line 151
    .line 152
    if-lt v4, v13, :cond_8

    .line 153
    .line 154
    iget-object v2, v0, Lk4/b;->b:Lg8/b;

    .line 155
    .line 156
    invoke-virtual {v2, v3}, Lg8/b;->g(I)I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    add-int/lit8 v6, v3, 0x2

    .line 161
    .line 162
    add-int/2addr v3, v4

    .line 163
    invoke-virtual {v2, v6, v3}, Lg8/b;->n(II)Lg8/b;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v0}, Lk4/b;->d()V

    .line 168
    .line 169
    .line 170
    iget-object v0, v0, Lk4/b;->d:Lv4/e0;

    .line 171
    .line 172
    invoke-static {v2, v0, v5, v15}, Lk4/d;->c(Lg8/b;Lv4/e0;IZ)Li4/r;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    new-instance v2, Lh4/j;

    .line 177
    .line 178
    invoke-direct {v2, v1, v0}, Lh4/j;-><init>(Ljava/lang/String;Li4/r;)V

    .line 179
    .line 180
    .line 181
    return-object v2

    .line 182
    :cond_8
    invoke-static {}, Lk4/d;->h()V

    .line 183
    .line 184
    .line 185
    throw v14

    .line 186
    :cond_9
    const-string v1, "AnnotationDefault"

    .line 187
    .line 188
    if-ne v2, v1, :cond_c

    .line 189
    .line 190
    if-lt v4, v13, :cond_b

    .line 191
    .line 192
    new-instance v1, Lb/e;

    .line 193
    .line 194
    invoke-direct {v1, v0, v3, v4}, Lb/e;-><init>(Lk4/b;II)V

    .line 195
    .line 196
    .line 197
    :try_start_0
    invoke-virtual {v1}, Lb/e;->B()Lv4/a;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iget-object v1, v1, Lb/e;->i:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v1, Lz4/a;

    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    .line 206
    .line 207
    .line 208
    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    if-nez v1, :cond_a

    .line 210
    .line 211
    new-instance v1, Lh4/a;

    .line 212
    .line 213
    invoke-direct {v1, v4, v0}, Lh4/a;-><init>(ILv4/a;)V

    .line 214
    .line 215
    .line 216
    return-object v1

    .line 217
    :cond_a
    :try_start_1
    new-instance v0, Ll4/c;

    .line 218
    .line 219
    const-string v1, "extra data in attribute"

    .line 220
    .line 221
    invoke-direct {v0, v1, v14}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 222
    .line 223
    .line 224
    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 225
    :catch_0
    move-exception v0

    .line 226
    const-string v1, "shouldn\'t happen"

    .line 227
    .line 228
    invoke-static {v1, v0}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    const/4 v0, 0x0

    .line 232
    return-object v0

    .line 233
    :cond_b
    invoke-static {}, Lk4/d;->h()V

    .line 234
    .line 235
    .line 236
    throw v14

    .line 237
    :cond_c
    const-string v1, "Code"

    .line 238
    .line 239
    if-ne v2, v1, :cond_14

    .line 240
    .line 241
    const/16 v1, 0xc

    .line 242
    .line 243
    if-lt v4, v1, :cond_13

    .line 244
    .line 245
    iget-object v1, v0, Lk4/b;->b:Lg8/b;

    .line 246
    .line 247
    invoke-virtual {v0}, Lk4/b;->d()V

    .line 248
    .line 249
    .line 250
    iget-object v2, v0, Lk4/b;->d:Lv4/e0;

    .line 251
    .line 252
    invoke-virtual {v1, v3}, Lg8/b;->g(I)I

    .line 253
    .line 254
    .line 255
    move-result v16

    .line 256
    add-int/lit8 v6, v3, 0x2

    .line 257
    .line 258
    invoke-virtual {v1, v6}, Lg8/b;->g(I)I

    .line 259
    .line 260
    .line 261
    move-result v17

    .line 262
    add-int/lit8 v6, v3, 0x4

    .line 263
    .line 264
    invoke-virtual {v1, v6}, Lg8/b;->b(I)I

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    add-int/lit8 v7, v3, 0x8

    .line 269
    .line 270
    add-int/lit8 v4, v4, -0x8

    .line 271
    .line 272
    add-int/lit8 v8, v6, 0x4

    .line 273
    .line 274
    if-lt v4, v8, :cond_12

    .line 275
    .line 276
    add-int v8, v7, v6

    .line 277
    .line 278
    sub-int/2addr v4, v6

    .line 279
    new-instance v6, Li4/l;

    .line 280
    .line 281
    invoke-virtual {v1, v7, v8}, Lg8/b;->n(II)Lg8/b;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    invoke-direct {v6, v7, v2}, Li4/l;-><init>(Lg8/b;Lv4/e0;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v8}, Lg8/b;->g(I)I

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    if-nez v7, :cond_d

    .line 293
    .line 294
    sget-object v9, Li4/g;->i:Li4/g;

    .line 295
    .line 296
    goto :goto_1

    .line 297
    :cond_d
    new-instance v9, Li4/g;

    .line 298
    .line 299
    invoke-direct {v9, v7}, Lz4/e;-><init>(I)V

    .line 300
    .line 301
    .line 302
    :goto_1
    add-int/2addr v8, v13

    .line 303
    add-int/lit8 v4, v4, -0x2

    .line 304
    .line 305
    mul-int/lit8 v10, v7, 0x8

    .line 306
    .line 307
    add-int/2addr v10, v13

    .line 308
    if-lt v4, v10, :cond_11

    .line 309
    .line 310
    move v5, v11

    .line 311
    :goto_2
    if-ge v5, v7, :cond_f

    .line 312
    .line 313
    invoke-virtual {v1, v8}, Lg8/b;->g(I)I

    .line 314
    .line 315
    .line 316
    move-result v10

    .line 317
    add-int/lit8 v13, v8, 0x2

    .line 318
    .line 319
    invoke-virtual {v1, v13}, Lg8/b;->g(I)I

    .line 320
    .line 321
    .line 322
    move-result v13

    .line 323
    add-int/lit8 v15, v8, 0x4

    .line 324
    .line 325
    invoke-virtual {v1, v15}, Lg8/b;->g(I)I

    .line 326
    .line 327
    .line 328
    move-result v15

    .line 329
    move-object/from16 v18, v14

    .line 330
    .line 331
    add-int/lit8 v14, v8, 0x6

    .line 332
    .line 333
    invoke-virtual {v1, v14}, Lg8/b;->g(I)I

    .line 334
    .line 335
    .line 336
    move-result v14

    .line 337
    if-nez v14, :cond_e

    .line 338
    .line 339
    move-object/from16 v14, v18

    .line 340
    .line 341
    goto :goto_3

    .line 342
    :cond_e
    invoke-virtual {v2, v14}, Lv4/e0;->l(I)Lv4/a;

    .line 343
    .line 344
    .line 345
    move-result-object v14

    .line 346
    :goto_3
    check-cast v14, Lv4/d0;

    .line 347
    .line 348
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    new-instance v12, Li4/f;

    .line 352
    .line 353
    invoke-direct {v12, v10, v13, v15, v14}, Li4/f;-><init>(IIILv4/d0;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v9, v5, v12}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    add-int/lit8 v8, v8, 0x8

    .line 360
    .line 361
    add-int/lit8 v4, v4, -0x8

    .line 362
    .line 363
    add-int/lit8 v5, v5, 0x1

    .line 364
    .line 365
    move-object/from16 v14, v18

    .line 366
    .line 367
    const/4 v12, 0x3

    .line 368
    goto :goto_2

    .line 369
    :cond_f
    move-object/from16 v18, v14

    .line 370
    .line 371
    iput-boolean v11, v9, Lz4/j;->g:Z

    .line 372
    .line 373
    new-instance v1, Lk4/a;

    .line 374
    .line 375
    const/4 v2, 0x3

    .line 376
    move-object/from16 v12, p0

    .line 377
    .line 378
    invoke-direct {v1, v0, v2, v8, v12}, Lk4/a;-><init>(Lk4/b;IILk4/d;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1}, Lk4/a;->a()V

    .line 382
    .line 383
    .line 384
    iget-object v0, v1, Lk4/a;->f:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v0, Lh4/u;

    .line 387
    .line 388
    iput-boolean v11, v0, Lz4/j;->g:Z

    .line 389
    .line 390
    invoke-virtual {v1}, Lk4/a;->a()V

    .line 391
    .line 392
    .line 393
    iget v1, v1, Lk4/a;->c:I

    .line 394
    .line 395
    sub-int/2addr v1, v8

    .line 396
    if-ne v1, v4, :cond_10

    .line 397
    .line 398
    new-instance v15, Lh4/c;

    .line 399
    .line 400
    move-object/from16 v20, v0

    .line 401
    .line 402
    move-object/from16 v18, v6

    .line 403
    .line 404
    move-object/from16 v19, v9

    .line 405
    .line 406
    invoke-direct/range {v15 .. v20}, Lh4/c;-><init>(IILi4/l;Li4/g;Lh4/u;)V

    .line 407
    .line 408
    .line 409
    return-object v15

    .line 410
    :cond_10
    sub-int/2addr v8, v3

    .line 411
    add-int/2addr v8, v1

    .line 412
    invoke-static {v8}, Lk4/d;->g(I)V

    .line 413
    .line 414
    .line 415
    throw v18

    .line 416
    :cond_11
    move-object/from16 v12, p0

    .line 417
    .line 418
    move-object/from16 v18, v14

    .line 419
    .line 420
    new-instance v0, Ll4/c;

    .line 421
    .line 422
    move-object/from16 v1, v18

    .line 423
    .line 424
    invoke-direct {v0, v5, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 425
    .line 426
    .line 427
    throw v0

    .line 428
    :cond_12
    move-object/from16 v12, p0

    .line 429
    .line 430
    move-object v1, v14

    .line 431
    new-instance v0, Ll4/c;

    .line 432
    .line 433
    invoke-direct {v0, v5, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 434
    .line 435
    .line 436
    throw v0

    .line 437
    :cond_13
    move-object/from16 v12, p0

    .line 438
    .line 439
    move-object v1, v14

    .line 440
    invoke-static {}, Lk4/d;->h()V

    .line 441
    .line 442
    .line 443
    throw v1

    .line 444
    :cond_14
    move-object/from16 v12, p0

    .line 445
    .line 446
    move-object v1, v14

    .line 447
    if-ne v2, v10, :cond_16

    .line 448
    .line 449
    if-nez v4, :cond_15

    .line 450
    .line 451
    new-instance v0, Lh4/e;

    .line 452
    .line 453
    const/4 v1, 0x0

    .line 454
    invoke-direct {v0, v10, v1}, Lh4/e;-><init>(Ljava/lang/String;I)V

    .line 455
    .line 456
    .line 457
    return-object v0

    .line 458
    :cond_15
    invoke-static {v11}, Lk4/d;->g(I)V

    .line 459
    .line 460
    .line 461
    throw v1

    .line 462
    :cond_16
    const-string v1, "Exceptions"

    .line 463
    .line 464
    if-ne v2, v1, :cond_1b

    .line 465
    .line 466
    if-lt v4, v13, :cond_1a

    .line 467
    .line 468
    iget-object v1, v0, Lk4/b;->b:Lg8/b;

    .line 469
    .line 470
    invoke-virtual {v1, v3}, Lg8/b;->g(I)I

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    add-int/lit8 v2, v3, 0x2

    .line 475
    .line 476
    add-int/lit8 v3, v4, -0x2

    .line 477
    .line 478
    mul-int/lit8 v4, v1, 0x2

    .line 479
    .line 480
    if-ne v3, v4, :cond_19

    .line 481
    .line 482
    if-nez v1, :cond_17

    .line 483
    .line 484
    sget-object v0, Lw4/b;->i:Lw4/b;

    .line 485
    .line 486
    goto :goto_4

    .line 487
    :cond_17
    iget-object v3, v0, Lk4/b;->d:Lv4/e0;

    .line 488
    .line 489
    if-eqz v3, :cond_18

    .line 490
    .line 491
    new-instance v4, Lac/k;

    .line 492
    .line 493
    iget-object v0, v0, Lk4/b;->b:Lg8/b;

    .line 494
    .line 495
    invoke-direct {v4, v0, v2, v1, v3}, Lac/k;-><init>(Lg8/b;IILv4/e0;)V

    .line 496
    .line 497
    .line 498
    move-object v0, v4

    .line 499
    :goto_4
    new-instance v1, Lh4/g;

    .line 500
    .line 501
    invoke-direct {v1, v0}, Lh4/g;-><init>(Lw4/e;)V

    .line 502
    .line 503
    .line 504
    return-object v1

    .line 505
    :cond_18
    const-string v0, "pool not yet initialized"

    .line 506
    .line 507
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    const/4 v0, 0x0

    .line 511
    return-object v0

    .line 512
    :cond_19
    add-int/2addr v4, v13

    .line 513
    invoke-static {v4}, Lk4/d;->g(I)V

    .line 514
    .line 515
    .line 516
    const/16 v18, 0x0

    .line 517
    .line 518
    throw v18

    .line 519
    :cond_1a
    const/16 v18, 0x0

    .line 520
    .line 521
    invoke-static {}, Lk4/d;->h()V

    .line 522
    .line 523
    .line 524
    throw v18

    .line 525
    :cond_1b
    if-ne v2, v9, :cond_1c

    .line 526
    .line 527
    invoke-static {v0, v3, v4}, Lk4/d;->d(Lk4/b;II)Lh4/k;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    return-object v0

    .line 532
    :cond_1c
    if-ne v2, v8, :cond_1d

    .line 533
    .line 534
    invoke-static {v0, v3, v4}, Lk4/d;->e(Lk4/b;II)Lh4/m;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    return-object v0

    .line 539
    :cond_1d
    const-string v1, "RuntimeInvisibleParameterAnnotations"

    .line 540
    .line 541
    if-ne v2, v1, :cond_1f

    .line 542
    .line 543
    if-lt v4, v13, :cond_1e

    .line 544
    .line 545
    new-instance v2, Lb/e;

    .line 546
    .line 547
    invoke-direct {v2, v0, v3, v4}, Lb/e;-><init>(Lk4/b;II)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v2, v13}, Lb/e;->A(I)Lt4/c;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    new-instance v2, Lh4/l;

    .line 555
    .line 556
    invoke-direct {v2, v1, v0, v4}, Lh4/r;-><init>(Ljava/lang/String;Lt4/c;I)V

    .line 557
    .line 558
    .line 559
    return-object v2

    .line 560
    :cond_1e
    invoke-static {}, Lk4/d;->h()V

    .line 561
    .line 562
    .line 563
    const/16 v18, 0x0

    .line 564
    .line 565
    throw v18

    .line 566
    :cond_1f
    const/16 v18, 0x0

    .line 567
    .line 568
    const-string v1, "RuntimeVisibleParameterAnnotations"

    .line 569
    .line 570
    if-ne v2, v1, :cond_21

    .line 571
    .line 572
    if-lt v4, v13, :cond_20

    .line 573
    .line 574
    new-instance v2, Lb/e;

    .line 575
    .line 576
    invoke-direct {v2, v0, v3, v4}, Lb/e;-><init>(Lk4/b;II)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v15}, Lb/e;->A(I)Lt4/c;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    new-instance v2, Lh4/n;

    .line 584
    .line 585
    invoke-direct {v2, v1, v0, v4}, Lh4/r;-><init>(Ljava/lang/String;Lt4/c;I)V

    .line 586
    .line 587
    .line 588
    return-object v2

    .line 589
    :cond_20
    invoke-static {}, Lk4/d;->h()V

    .line 590
    .line 591
    .line 592
    throw v18

    .line 593
    :cond_21
    if-ne v2, v7, :cond_22

    .line 594
    .line 595
    invoke-static {v0, v3, v4}, Lk4/d;->f(Lk4/b;II)Lh4/o;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    return-object v0

    .line 600
    :cond_22
    if-ne v2, v6, :cond_49

    .line 601
    .line 602
    if-nez v4, :cond_23

    .line 603
    .line 604
    new-instance v0, Lh4/e;

    .line 605
    .line 606
    const/4 v1, 0x1

    .line 607
    invoke-direct {v0, v6, v1}, Lh4/e;-><init>(Ljava/lang/String;I)V

    .line 608
    .line 609
    .line 610
    return-object v0

    .line 611
    :cond_23
    invoke-static {v11}, Lk4/d;->g(I)V

    .line 612
    .line 613
    .line 614
    throw v18

    .line 615
    :cond_24
    move-object/from16 v12, p0

    .line 616
    .line 617
    const-string v1, "ConstantValue"

    .line 618
    .line 619
    if-ne v2, v1, :cond_26

    .line 620
    .line 621
    if-ne v4, v13, :cond_25

    .line 622
    .line 623
    iget-object v1, v0, Lk4/b;->b:Lg8/b;

    .line 624
    .line 625
    invoke-virtual {v0}, Lk4/b;->d()V

    .line 626
    .line 627
    .line 628
    iget-object v0, v0, Lk4/b;->d:Lv4/e0;

    .line 629
    .line 630
    invoke-virtual {v1, v3}, Lg8/b;->g(I)I

    .line 631
    .line 632
    .line 633
    move-result v1

    .line 634
    invoke-virtual {v0, v1}, Lv4/e0;->l(I)Lv4/a;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    check-cast v0, Lv4/f0;

    .line 639
    .line 640
    new-instance v1, Lh4/d;

    .line 641
    .line 642
    invoke-direct {v1, v0}, Lh4/d;-><init>(Lv4/f0;)V

    .line 643
    .line 644
    .line 645
    return-object v1

    .line 646
    :cond_25
    invoke-static {v13}, Lk4/d;->g(I)V

    .line 647
    .line 648
    .line 649
    const/16 v18, 0x0

    .line 650
    .line 651
    throw v18

    .line 652
    :cond_26
    const/16 v18, 0x0

    .line 653
    .line 654
    if-ne v2, v10, :cond_28

    .line 655
    .line 656
    if-nez v4, :cond_27

    .line 657
    .line 658
    new-instance v0, Lh4/e;

    .line 659
    .line 660
    const/4 v1, 0x0

    .line 661
    invoke-direct {v0, v10, v1}, Lh4/e;-><init>(Ljava/lang/String;I)V

    .line 662
    .line 663
    .line 664
    return-object v0

    .line 665
    :cond_27
    invoke-static {v11}, Lk4/d;->g(I)V

    .line 666
    .line 667
    .line 668
    throw v18

    .line 669
    :cond_28
    if-ne v2, v9, :cond_29

    .line 670
    .line 671
    invoke-static {v0, v3, v4}, Lk4/d;->d(Lk4/b;II)Lh4/k;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    return-object v0

    .line 676
    :cond_29
    if-ne v2, v8, :cond_2a

    .line 677
    .line 678
    invoke-static {v0, v3, v4}, Lk4/d;->e(Lk4/b;II)Lh4/m;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    return-object v0

    .line 683
    :cond_2a
    if-ne v2, v7, :cond_2b

    .line 684
    .line 685
    invoke-static {v0, v3, v4}, Lk4/d;->f(Lk4/b;II)Lh4/o;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    return-object v0

    .line 690
    :cond_2b
    if-ne v2, v6, :cond_49

    .line 691
    .line 692
    if-nez v4, :cond_2c

    .line 693
    .line 694
    new-instance v0, Lh4/e;

    .line 695
    .line 696
    const/4 v1, 0x1

    .line 697
    invoke-direct {v0, v6, v1}, Lh4/e;-><init>(Ljava/lang/String;I)V

    .line 698
    .line 699
    .line 700
    return-object v0

    .line 701
    :cond_2c
    invoke-static {v11}, Lk4/d;->g(I)V

    .line 702
    .line 703
    .line 704
    const/16 v18, 0x0

    .line 705
    .line 706
    throw v18

    .line 707
    :cond_2d
    move-object/from16 v12, p0

    .line 708
    .line 709
    const/16 v16, 0x4

    .line 710
    .line 711
    const-string v1, "BootstrapMethods"

    .line 712
    .line 713
    if-ne v2, v1, :cond_36

    .line 714
    .line 715
    if-lt v4, v13, :cond_35

    .line 716
    .line 717
    iget-object v1, v0, Lk4/b;->b:Lg8/b;

    .line 718
    .line 719
    invoke-virtual {v1, v3}, Lg8/b;->g(I)I

    .line 720
    .line 721
    .line 722
    move-result v2

    .line 723
    add-int/2addr v3, v13

    .line 724
    add-int/lit8 v4, v4, -0x2

    .line 725
    .line 726
    invoke-virtual {v0}, Lk4/b;->d()V

    .line 727
    .line 728
    .line 729
    iget-object v6, v0, Lk4/b;->d:Lv4/e0;

    .line 730
    .line 731
    invoke-virtual {v0}, Lk4/b;->d()V

    .line 732
    .line 733
    .line 734
    iget-object v0, v0, Lk4/b;->f:Lv4/d0;

    .line 735
    .line 736
    new-instance v7, Li4/c;

    .line 737
    .line 738
    invoke-direct {v7, v2}, Lz4/e;-><init>(I)V

    .line 739
    .line 740
    .line 741
    move v8, v11

    .line 742
    :goto_5
    if-ge v8, v2, :cond_33

    .line 743
    .line 744
    move/from16 v9, v16

    .line 745
    .line 746
    if-lt v4, v9, :cond_32

    .line 747
    .line 748
    invoke-virtual {v1, v3}, Lg8/b;->g(I)I

    .line 749
    .line 750
    .line 751
    move-result v10

    .line 752
    add-int/lit8 v13, v3, 0x2

    .line 753
    .line 754
    invoke-virtual {v1, v13}, Lg8/b;->g(I)I

    .line 755
    .line 756
    .line 757
    move-result v13

    .line 758
    add-int/2addr v3, v9

    .line 759
    add-int/lit8 v4, v4, -0x4

    .line 760
    .line 761
    mul-int/lit8 v9, v13, 0x2

    .line 762
    .line 763
    if-lt v4, v9, :cond_31

    .line 764
    .line 765
    new-instance v9, Lh4/u;

    .line 766
    .line 767
    invoke-direct {v9, v13}, Lz4/e;-><init>(I)V

    .line 768
    .line 769
    .line 770
    move v14, v11

    .line 771
    :goto_6
    if-ge v14, v13, :cond_30

    .line 772
    .line 773
    invoke-virtual {v1, v3}, Lg8/b;->g(I)I

    .line 774
    .line 775
    .line 776
    move-result v15

    .line 777
    invoke-virtual {v6, v15}, Lv4/e0;->l(I)Lv4/a;

    .line 778
    .line 779
    .line 780
    move-result-object v15

    .line 781
    instance-of v11, v15, Lv4/c0;

    .line 782
    .line 783
    if-nez v11, :cond_2f

    .line 784
    .line 785
    instance-of v11, v15, Lv4/d0;

    .line 786
    .line 787
    if-nez v11, :cond_2f

    .line 788
    .line 789
    instance-of v11, v15, Lv4/o;

    .line 790
    .line 791
    if-nez v11, :cond_2f

    .line 792
    .line 793
    instance-of v11, v15, Lv4/v;

    .line 794
    .line 795
    if-nez v11, :cond_2f

    .line 796
    .line 797
    instance-of v11, v15, Lv4/n;

    .line 798
    .line 799
    if-nez v11, :cond_2f

    .line 800
    .line 801
    instance-of v11, v15, Lv4/k;

    .line 802
    .line 803
    if-nez v11, :cond_2f

    .line 804
    .line 805
    instance-of v11, v15, Lv4/x;

    .line 806
    .line 807
    if-nez v11, :cond_2f

    .line 808
    .line 809
    instance-of v11, v15, Lv4/a0;

    .line 810
    .line 811
    if-eqz v11, :cond_2e

    .line 812
    .line 813
    goto :goto_7

    .line 814
    :cond_2e
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    const-string v1, "bad type for bootstrap argument: "

    .line 819
    .line 820
    invoke-static {v0, v1}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 825
    .line 826
    .line 827
    const/4 v0, 0x0

    .line 828
    return-object v0

    .line 829
    :cond_2f
    :goto_7
    invoke-virtual {v9, v14, v15}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 830
    .line 831
    .line 832
    add-int/lit8 v14, v14, 0x1

    .line 833
    .line 834
    add-int/lit8 v3, v3, 0x2

    .line 835
    .line 836
    add-int/lit8 v4, v4, -0x2

    .line 837
    .line 838
    const/4 v11, 0x0

    .line 839
    goto :goto_6

    .line 840
    :cond_30
    iput-boolean v11, v9, Lz4/j;->g:Z

    .line 841
    .line 842
    invoke-virtual {v6, v10}, Lv4/e0;->l(I)Lv4/a;

    .line 843
    .line 844
    .line 845
    move-result-object v10

    .line 846
    check-cast v10, Lv4/x;

    .line 847
    .line 848
    new-instance v11, Li4/b;

    .line 849
    .line 850
    invoke-direct {v11, v0, v10, v9}, Li4/b;-><init>(Lv4/d0;Lv4/x;Lh4/u;)V

    .line 851
    .line 852
    .line 853
    invoke-virtual {v7, v8, v11}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    add-int/lit8 v8, v8, 0x1

    .line 857
    .line 858
    const/4 v11, 0x0

    .line 859
    const/16 v16, 0x4

    .line 860
    .line 861
    goto :goto_5

    .line 862
    :cond_31
    new-instance v0, Ll4/c;

    .line 863
    .line 864
    const/4 v1, 0x0

    .line 865
    invoke-direct {v0, v5, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 866
    .line 867
    .line 868
    throw v0

    .line 869
    :cond_32
    const/4 v1, 0x0

    .line 870
    new-instance v0, Ll4/c;

    .line 871
    .line 872
    invoke-direct {v0, v5, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 873
    .line 874
    .line 875
    throw v0

    .line 876
    :cond_33
    const/4 v1, 0x0

    .line 877
    iput-boolean v11, v7, Lz4/j;->g:Z

    .line 878
    .line 879
    if-nez v4, :cond_34

    .line 880
    .line 881
    new-instance v0, Lh4/b;

    .line 882
    .line 883
    invoke-direct {v0, v7}, Lh4/b;-><init>(Li4/c;)V

    .line 884
    .line 885
    .line 886
    return-object v0

    .line 887
    :cond_34
    invoke-static {v4}, Lk4/d;->g(I)V

    .line 888
    .line 889
    .line 890
    throw v1

    .line 891
    :cond_35
    const/4 v1, 0x0

    .line 892
    invoke-static {}, Lk4/d;->h()V

    .line 893
    .line 894
    .line 895
    throw v1

    .line 896
    :cond_36
    const/4 v1, 0x0

    .line 897
    if-ne v2, v10, :cond_38

    .line 898
    .line 899
    if-nez v4, :cond_37

    .line 900
    .line 901
    new-instance v0, Lh4/e;

    .line 902
    .line 903
    const/4 v1, 0x0

    .line 904
    invoke-direct {v0, v10, v1}, Lh4/e;-><init>(Ljava/lang/String;I)V

    .line 905
    .line 906
    .line 907
    return-object v0

    .line 908
    :cond_37
    const/16 v17, 0x0

    .line 909
    .line 910
    invoke-static/range {v17 .. v17}, Lk4/d;->g(I)V

    .line 911
    .line 912
    .line 913
    throw v1

    .line 914
    :cond_38
    const-string v1, "EnclosingMethod"

    .line 915
    .line 916
    if-ne v2, v1, :cond_3b

    .line 917
    .line 918
    const/4 v1, 0x4

    .line 919
    if-ne v4, v1, :cond_3a

    .line 920
    .line 921
    iget-object v1, v0, Lk4/b;->b:Lg8/b;

    .line 922
    .line 923
    invoke-virtual {v0}, Lk4/b;->d()V

    .line 924
    .line 925
    .line 926
    iget-object v0, v0, Lk4/b;->d:Lv4/e0;

    .line 927
    .line 928
    invoke-virtual {v1, v3}, Lg8/b;->g(I)I

    .line 929
    .line 930
    .line 931
    move-result v2

    .line 932
    invoke-virtual {v0, v2}, Lv4/e0;->l(I)Lv4/a;

    .line 933
    .line 934
    .line 935
    move-result-object v2

    .line 936
    check-cast v2, Lv4/d0;

    .line 937
    .line 938
    add-int/2addr v3, v13

    .line 939
    invoke-virtual {v1, v3}, Lg8/b;->g(I)I

    .line 940
    .line 941
    .line 942
    move-result v1

    .line 943
    if-nez v1, :cond_39

    .line 944
    .line 945
    const/4 v14, 0x0

    .line 946
    goto :goto_8

    .line 947
    :cond_39
    invoke-virtual {v0, v1}, Lv4/e0;->l(I)Lv4/a;

    .line 948
    .line 949
    .line 950
    move-result-object v14

    .line 951
    :goto_8
    check-cast v14, Lv4/z;

    .line 952
    .line 953
    new-instance v0, Lh4/f;

    .line 954
    .line 955
    invoke-direct {v0, v2, v14}, Lh4/f;-><init>(Lv4/d0;Lv4/z;)V

    .line 956
    .line 957
    .line 958
    return-object v0

    .line 959
    :cond_3a
    move/from16 v16, v1

    .line 960
    .line 961
    invoke-static/range {v16 .. v16}, Lk4/d;->g(I)V

    .line 962
    .line 963
    .line 964
    const/16 v18, 0x0

    .line 965
    .line 966
    throw v18

    .line 967
    :cond_3b
    const-string v1, "InnerClasses"

    .line 968
    .line 969
    if-ne v2, v1, :cond_41

    .line 970
    .line 971
    if-lt v4, v13, :cond_40

    .line 972
    .line 973
    iget-object v1, v0, Lk4/b;->b:Lg8/b;

    .line 974
    .line 975
    invoke-virtual {v0}, Lk4/b;->d()V

    .line 976
    .line 977
    .line 978
    iget-object v0, v0, Lk4/b;->d:Lv4/e0;

    .line 979
    .line 980
    invoke-virtual {v1, v3}, Lg8/b;->g(I)I

    .line 981
    .line 982
    .line 983
    move-result v2

    .line 984
    add-int/2addr v3, v13

    .line 985
    add-int/lit8 v4, v4, -0x2

    .line 986
    .line 987
    mul-int/lit8 v5, v2, 0x8

    .line 988
    .line 989
    if-ne v4, v5, :cond_3f

    .line 990
    .line 991
    new-instance v4, Lh4/u;

    .line 992
    .line 993
    invoke-direct {v4, v2}, Lz4/e;-><init>(I)V

    .line 994
    .line 995
    .line 996
    const/4 v5, 0x0

    .line 997
    :goto_9
    if-ge v5, v2, :cond_3e

    .line 998
    .line 999
    invoke-virtual {v1, v3}, Lg8/b;->g(I)I

    .line 1000
    .line 1001
    .line 1002
    move-result v6

    .line 1003
    add-int/lit8 v7, v3, 0x2

    .line 1004
    .line 1005
    invoke-virtual {v1, v7}, Lg8/b;->g(I)I

    .line 1006
    .line 1007
    .line 1008
    move-result v7

    .line 1009
    add-int/lit8 v8, v3, 0x4

    .line 1010
    .line 1011
    invoke-virtual {v1, v8}, Lg8/b;->g(I)I

    .line 1012
    .line 1013
    .line 1014
    move-result v8

    .line 1015
    add-int/lit8 v9, v3, 0x6

    .line 1016
    .line 1017
    invoke-virtual {v1, v9}, Lg8/b;->g(I)I

    .line 1018
    .line 1019
    .line 1020
    move-result v9

    .line 1021
    invoke-virtual {v0, v6}, Lv4/e0;->l(I)Lv4/a;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v6

    .line 1025
    check-cast v6, Lv4/d0;

    .line 1026
    .line 1027
    if-nez v7, :cond_3c

    .line 1028
    .line 1029
    const/4 v7, 0x0

    .line 1030
    goto :goto_a

    .line 1031
    :cond_3c
    invoke-virtual {v0, v7}, Lv4/e0;->l(I)Lv4/a;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v7

    .line 1035
    :goto_a
    check-cast v7, Lv4/d0;

    .line 1036
    .line 1037
    if-nez v8, :cond_3d

    .line 1038
    .line 1039
    const/4 v8, 0x0

    .line 1040
    goto :goto_b

    .line 1041
    :cond_3d
    invoke-virtual {v0, v8}, Lv4/e0;->l(I)Lv4/a;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v8

    .line 1045
    :goto_b
    check-cast v8, Lv4/c0;

    .line 1046
    .line 1047
    new-instance v10, Lh4/t;

    .line 1048
    .line 1049
    invoke-direct {v10, v6, v7, v8, v9}, Lh4/t;-><init>(Lv4/d0;Lv4/d0;Lv4/c0;I)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v4, v5, v10}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1053
    .line 1054
    .line 1055
    add-int/lit8 v3, v3, 0x8

    .line 1056
    .line 1057
    add-int/lit8 v5, v5, 0x1

    .line 1058
    .line 1059
    goto :goto_9

    .line 1060
    :cond_3e
    const/4 v11, 0x0

    .line 1061
    iput-boolean v11, v4, Lz4/j;->g:Z

    .line 1062
    .line 1063
    new-instance v0, Lh4/h;

    .line 1064
    .line 1065
    invoke-direct {v0, v4}, Lh4/h;-><init>(Lh4/u;)V

    .line 1066
    .line 1067
    .line 1068
    return-object v0

    .line 1069
    :cond_3f
    add-int/2addr v5, v13

    .line 1070
    invoke-static {v5}, Lk4/d;->g(I)V

    .line 1071
    .line 1072
    .line 1073
    const/16 v18, 0x0

    .line 1074
    .line 1075
    throw v18

    .line 1076
    :cond_40
    const/16 v18, 0x0

    .line 1077
    .line 1078
    invoke-static {}, Lk4/d;->h()V

    .line 1079
    .line 1080
    .line 1081
    throw v18

    .line 1082
    :cond_41
    if-ne v2, v9, :cond_42

    .line 1083
    .line 1084
    invoke-static {v0, v3, v4}, Lk4/d;->d(Lk4/b;II)Lh4/k;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0

    .line 1088
    return-object v0

    .line 1089
    :cond_42
    if-ne v2, v8, :cond_43

    .line 1090
    .line 1091
    invoke-static {v0, v3, v4}, Lk4/d;->e(Lk4/b;II)Lh4/m;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    return-object v0

    .line 1096
    :cond_43
    if-ne v2, v6, :cond_45

    .line 1097
    .line 1098
    if-nez v4, :cond_44

    .line 1099
    .line 1100
    new-instance v0, Lh4/e;

    .line 1101
    .line 1102
    const/4 v1, 0x1

    .line 1103
    invoke-direct {v0, v6, v1}, Lh4/e;-><init>(Ljava/lang/String;I)V

    .line 1104
    .line 1105
    .line 1106
    return-object v0

    .line 1107
    :cond_44
    const/16 v17, 0x0

    .line 1108
    .line 1109
    invoke-static/range {v17 .. v17}, Lk4/d;->g(I)V

    .line 1110
    .line 1111
    .line 1112
    const/16 v18, 0x0

    .line 1113
    .line 1114
    throw v18

    .line 1115
    :cond_45
    if-ne v2, v7, :cond_46

    .line 1116
    .line 1117
    invoke-static {v0, v3, v4}, Lk4/d;->f(Lk4/b;II)Lh4/o;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v0

    .line 1121
    return-object v0

    .line 1122
    :cond_46
    const-string v1, "SourceDebugExtension"

    .line 1123
    .line 1124
    if-ne v2, v1, :cond_47

    .line 1125
    .line 1126
    iget-object v0, v0, Lk4/b;->b:Lg8/b;

    .line 1127
    .line 1128
    add-int v1, v3, v4

    .line 1129
    .line 1130
    invoke-virtual {v0, v3, v1}, Lg8/b;->n(II)Lg8/b;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    new-instance v1, Lv4/c0;

    .line 1135
    .line 1136
    invoke-direct {v1, v0}, Lv4/c0;-><init>(Lg8/b;)V

    .line 1137
    .line 1138
    .line 1139
    new-instance v0, Lh4/p;

    .line 1140
    .line 1141
    invoke-direct {v0, v1}, Lh4/p;-><init>(Lv4/c0;)V

    .line 1142
    .line 1143
    .line 1144
    return-object v0

    .line 1145
    :cond_47
    const-string v1, "SourceFile"

    .line 1146
    .line 1147
    if-ne v2, v1, :cond_49

    .line 1148
    .line 1149
    if-ne v4, v13, :cond_48

    .line 1150
    .line 1151
    iget-object v1, v0, Lk4/b;->b:Lg8/b;

    .line 1152
    .line 1153
    invoke-virtual {v0}, Lk4/b;->d()V

    .line 1154
    .line 1155
    .line 1156
    iget-object v0, v0, Lk4/b;->d:Lv4/e0;

    .line 1157
    .line 1158
    invoke-virtual {v1, v3}, Lg8/b;->g(I)I

    .line 1159
    .line 1160
    .line 1161
    move-result v1

    .line 1162
    invoke-virtual {v0, v1}, Lv4/e0;->l(I)Lv4/a;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v0

    .line 1166
    check-cast v0, Lv4/c0;

    .line 1167
    .line 1168
    new-instance v1, Lh4/q;

    .line 1169
    .line 1170
    invoke-direct {v1, v0}, Lh4/q;-><init>(Lv4/c0;)V

    .line 1171
    .line 1172
    .line 1173
    return-object v1

    .line 1174
    :cond_48
    invoke-static {v13}, Lk4/d;->g(I)V

    .line 1175
    .line 1176
    .line 1177
    const/16 v18, 0x0

    .line 1178
    .line 1179
    throw v18

    .line 1180
    :cond_49
    :goto_c
    iget-object v1, v0, Lk4/b;->b:Lg8/b;

    .line 1181
    .line 1182
    invoke-virtual {v0}, Lk4/b;->d()V

    .line 1183
    .line 1184
    .line 1185
    new-instance v0, Lh4/v;

    .line 1186
    .line 1187
    invoke-direct {v0, v2, v1, v3, v4}, Lh4/v;-><init>(Ljava/lang/String;Lg8/b;II)V

    .line 1188
    .line 1189
    .line 1190
    return-object v0
.end method
