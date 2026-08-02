.class public final Lcv2;
.super Lrp0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ly40;
.implements Lvx;


# instance fields
.field public final r:Lu21;

.field public final s:Lfg3;

.field public final t:Lqb2;

.field public u:I

.field public final v:Lm31;


# direct methods
.method public constructor <init>(Lu21;Lfg3;Lqb2;Lyo2;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcv2;->r:Lu21;

    .line 8
    .line 9
    iput-object p2, p0, Lcv2;->s:Lfg3;

    .line 10
    .line 11
    iput-object p3, p0, Lcv2;->t:Lqb2;

    .line 12
    .line 13
    const/4 p2, -0x1

    .line 14
    iput p2, p0, Lcv2;->u:I

    .line 15
    .line 16
    iget-object p1, p1, Lu21;->a:Lf31;

    .line 17
    .line 18
    iget-boolean p1, p1, Lf31;->c:Z

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Lm31;

    .line 25
    .line 26
    invoke-direct {p1, p4}, Lm31;-><init>(Lyo2;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iput-object p1, p0, Lcv2;->v:Lm31;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final A(Lyo2;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcv2;->t:Lqb2;

    .line 5
    .line 6
    invoke-virtual {v0}, Lqb2;->j()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v0, v0, Lqb2;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lq9;

    .line 13
    .line 14
    invoke-virtual {v0}, Lq9;->e()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, " at path "

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object p0, p0, Lcv2;->r:Lu21;

    .line 25
    .line 26
    invoke-static {p1, p0, v1, v0}, Lsp0;->D(Lyo2;Lu21;Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final B()D
    .locals 9

    .line 1
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqb2;->k()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_0
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 10
    .line 11
    .line 12
    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    const-wide v7, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmpg-double v0, v5, v7

    .line 23
    .line 24
    if-gtz v0, :cond_0

    .line 25
    .line 26
    return-wide v3

    .line 27
    :cond_0
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0, v2}, Lp7;->F(Ljava/lang/Number;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v3, 0x2

    .line 36
    invoke-static {p0, v0, v1, v3}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    throw v2

    .line 40
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v4, "Failed to parse type \'double\' for input \'"

    .line 43
    .line 44
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 v0, 0x27

    .line 51
    .line 52
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v3, 0x6

    .line 60
    invoke-static {p0, v0, v1, v3}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 61
    .line 62
    .line 63
    throw v2
.end method

.method public final a(Lyo2;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lyo2;->d()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcv2;->r:Lu21;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lsp0;->G(Lu21;Lyo2;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lcv2;->j(Lyo2;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    :cond_1
    iget-object p1, p0, Lcv2;->t:Lqb2;

    .line 26
    .line 27
    invoke-virtual {p1}, Lqb2;->s()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    .line 33
    iget-object p0, p0, Lcv2;->s:Lfg3;

    .line 34
    .line 35
    iget-char p0, p0, Lfg3;->i:C

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Lqb2;->h(C)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p1, Lqb2;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lq9;

    .line 43
    .line 44
    iget p1, p0, Lq9;->b:I

    .line 45
    .line 46
    iget-object v0, p0, Lq9;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, [I

    .line 49
    .line 50
    aget v2, v0, p1

    .line 51
    .line 52
    const/4 v3, -0x2

    .line 53
    if-ne v2, v3, :cond_2

    .line 54
    .line 55
    aput v1, v0, p1

    .line 56
    .line 57
    add-int/2addr p1, v1

    .line 58
    iput p1, p0, Lq9;->b:I

    .line 59
    .line 60
    :cond_2
    iget p1, p0, Lq9;->b:I

    .line 61
    .line 62
    if-eq p1, v1, :cond_3

    .line 63
    .line 64
    add-int/2addr p1, v1

    .line 65
    iput p1, p0, Lq9;->b:I

    .line 66
    .line 67
    :cond_3
    return-void

    .line 68
    :cond_4
    const-string p0, ""

    .line 69
    .line 70
    invoke-static {p1, p0}, Lp7;->x(Lqb2;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    throw p0
.end method

.method public final b(Lyo2;)Lvx;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcv2;->r:Lu21;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lgg3;->f(Lu21;Lyo2;)Lfg3;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, Lcv2;->t:Lqb2;

    .line 11
    .line 12
    iget-object v3, v2, Lqb2;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lq9;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget v4, v3, Lq9;->b:I

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    add-int/2addr v4, v5

    .line 23
    iput v4, v3, Lq9;->b:I

    .line 24
    .line 25
    iget-object v6, v3, Lq9;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v6, [Ljava/lang/Object;

    .line 28
    .line 29
    array-length v6, v6

    .line 30
    if-ne v4, v6, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3}, Lq9;->h()V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v3, v3, Lq9;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, [Ljava/lang/Object;

    .line 38
    .line 39
    aput-object p1, v3, v4

    .line 40
    .line 41
    iget-char v3, v1, Lfg3;->h:C

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Lqb2;->h(C)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lqb2;->p()B

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/4 v4, 0x4

    .line 51
    if-eq v3, v4, :cond_3

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eq v3, v5, :cond_2

    .line 58
    .line 59
    const/4 v4, 0x2

    .line 60
    if-eq v3, v4, :cond_2

    .line 61
    .line 62
    const/4 v4, 0x3

    .line 63
    if-eq v3, v4, :cond_2

    .line 64
    .line 65
    iget-object v3, p0, Lcv2;->s:Lfg3;

    .line 66
    .line 67
    if-ne v3, v1, :cond_1

    .line 68
    .line 69
    iget-object v3, v0, Lu21;->a:Lf31;

    .line 70
    .line 71
    iget-boolean v3, v3, Lf31;->c:Z

    .line 72
    .line 73
    if-eqz v3, :cond_1

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_1
    new-instance p0, Lcv2;

    .line 77
    .line 78
    invoke-direct {p0, v0, v1, v2, p1}, Lcv2;-><init>(Lu21;Lfg3;Lqb2;Lyo2;)V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_2
    new-instance p0, Lcv2;

    .line 83
    .line 84
    invoke-direct {p0, v0, v1, v2, p1}, Lcv2;-><init>(Lu21;Lfg3;Lqb2;Lyo2;)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_3
    const/4 p0, 0x0

    .line 89
    const/4 p1, 0x6

    .line 90
    const-string v0, "Unexpected leading comma"

    .line 91
    .line 92
    invoke-static {v2, v0, p0, p1}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 93
    .line 94
    .line 95
    const/4 p0, 0x0

    .line 96
    throw p0
.end method

.method public final c(Lw41;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    instance-of v0, p1, Le3;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lw41;->a(Ly40;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p1}, Lvi0;->t(Ljava/lang/Object;)V
    :try_end_0
    .catch Ldh1; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const-string v1, "at path"

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static {v0, v1, v2}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, " at path: "

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 55
    .line 56
    iget-object p0, p0, Lqb2;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lq9;

    .line 59
    .line 60
    invoke-virtual {p0}, Lq9;->e()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    new-instance v0, Ldh1;

    .line 72
    .line 73
    iget-object v1, p1, Ldh1;->h:Ljava/util/List;

    .line 74
    .line 75
    iget-object v2, p1, Ldh1;->i:Ljava/lang/String;

    .line 76
    .line 77
    invoke-direct {v0, p0, p1, v1, v2}, Ldh1;-><init>(Ljava/lang/String;Ldh1;Ljava/util/List;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqb2;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final f()Z
    .locals 11

    .line 1
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqb2;->r()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lqb2;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const-string v3, "EOF"

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x6

    .line 19
    const/4 v6, 0x0

    .line 20
    if-eq v0, v2, :cond_7

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/16 v7, 0x22

    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    if-ne v2, v7, :cond_0

    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    move v2, v8

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v2, v6

    .line 36
    :goto_0
    invoke-virtual {p0, v0}, Lqb2;->q(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-ge v0, v9, :cond_6

    .line 45
    .line 46
    const/4 v9, -0x1

    .line 47
    if-eq v0, v9, :cond_6

    .line 48
    .line 49
    add-int/lit8 v9, v0, 0x1

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    or-int/lit8 v0, v0, 0x20

    .line 56
    .line 57
    const/16 v10, 0x66

    .line 58
    .line 59
    if-eq v0, v10, :cond_2

    .line 60
    .line 61
    const/16 v10, 0x74

    .line 62
    .line 63
    if-ne v0, v10, :cond_1

    .line 64
    .line 65
    const-string v0, "rue"

    .line 66
    .line 67
    invoke-virtual {p0, v0, v9}, Lqb2;->d(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    move v0, v8

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, "Expected valid boolean literal prefix, but had \'"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lqb2;->k()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const/16 v1, 0x27

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {p0, v0, v6, v5}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 96
    .line 97
    .line 98
    throw v4

    .line 99
    :cond_2
    const-string v0, "alse"

    .line 100
    .line 101
    invoke-virtual {p0, v0, v9}, Lqb2;->d(Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    move v0, v6

    .line 105
    :goto_1
    if-eqz v2, :cond_5

    .line 106
    .line 107
    iget v2, p0, Lqb2;->b:I

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-eq v2, v9, :cond_4

    .line 114
    .line 115
    iget v2, p0, Lqb2;->b:I

    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-ne v1, v7, :cond_3

    .line 122
    .line 123
    iget v1, p0, Lqb2;->b:I

    .line 124
    .line 125
    add-int/2addr v1, v8

    .line 126
    iput v1, p0, Lqb2;->b:I

    .line 127
    .line 128
    return v0

    .line 129
    :cond_3
    const-string v0, "Expected closing quotation mark"

    .line 130
    .line 131
    invoke-static {p0, v0, v6, v5}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 132
    .line 133
    .line 134
    throw v4

    .line 135
    :cond_4
    invoke-static {p0, v3, v6, v5}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 136
    .line 137
    .line 138
    throw v4

    .line 139
    :cond_5
    return v0

    .line 140
    :cond_6
    invoke-static {p0, v3, v6, v5}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 141
    .line 142
    .line 143
    throw v4

    .line 144
    :cond_7
    invoke-static {p0, v3, v6, v5}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 145
    .line 146
    .line 147
    throw v4
.end method

.method public final g()Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcv2;->v:Lm31;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-boolean v1, v1, Lm31;->b:Z

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    if-nez v1, :cond_6

    .line 11
    .line 12
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 13
    .line 14
    invoke-virtual {p0}, Lqb2;->r()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0, v1}, Lqb2;->q(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, Lqb2;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    sub-int/2addr v3, v1

    .line 31
    const/4 v4, 0x1

    .line 32
    const/4 v5, 0x4

    .line 33
    if-lt v3, v5, :cond_5

    .line 34
    .line 35
    const/4 v6, -0x1

    .line 36
    if-ne v1, v6, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    move v6, v0

    .line 40
    :goto_1
    if-ge v6, v5, :cond_3

    .line 41
    .line 42
    const-string v7, "null"

    .line 43
    .line 44
    invoke-virtual {v7, v6}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    add-int v8, v1, v6

    .line 49
    .line 50
    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eq v7, v8, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    if-le v3, v5, :cond_4

    .line 61
    .line 62
    add-int/lit8 v3, v1, 0x4

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-static {v2}, Leu;->A(C)B

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    add-int/2addr v1, v5

    .line 76
    iput v1, p0, Lqb2;->b:I

    .line 77
    .line 78
    move p0, v4

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    :goto_2
    move p0, v0

    .line 81
    :goto_3
    if-nez p0, :cond_6

    .line 82
    .line 83
    return v4

    .line 84
    :cond_6
    return v0
.end method

.method public final h()C
    .locals 4

    .line 1
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqb2;->k()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Expected single char, but got \'"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v0, 0x27

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x6

    .line 40
    invoke-static {p0, v0, v3, v1}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    throw p0
.end method

.method public final j(Lyo2;)I
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcv2;->t:Lqb2;

    .line 6
    .line 7
    iget-object v3, v2, Lqb2;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lq9;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v4, v0, Lcv2;->s:Lfg3;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const-string v6, "object"

    .line 21
    .line 22
    const/4 v7, 0x6

    .line 23
    const/4 v8, 0x0

    .line 24
    const/16 v9, 0x3a

    .line 25
    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x1

    .line 28
    const/4 v12, -0x1

    .line 29
    if-eqz v5, :cond_e

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    if-eq v5, v1, :cond_4

    .line 33
    .line 34
    invoke-virtual {v2}, Lqb2;->s()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v2}, Lqb2;->c()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    iget v5, v0, Lcv2;->u:I

    .line 45
    .line 46
    if-eq v5, v12, :cond_1

    .line 47
    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-string v0, "Expected end of the array or comma"

    .line 52
    .line 53
    invoke-static {v2, v0, v10, v7}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 54
    .line 55
    .line 56
    throw v8

    .line 57
    :cond_1
    :goto_0
    add-int/lit8 v12, v5, 0x1

    .line 58
    .line 59
    iput v12, v0, Lcv2;->u:I

    .line 60
    .line 61
    goto/16 :goto_c

    .line 62
    .line 63
    :cond_2
    if-nez v1, :cond_3

    .line 64
    .line 65
    goto/16 :goto_c

    .line 66
    .line 67
    :cond_3
    const-string v0, "array"

    .line 68
    .line 69
    invoke-static {v2, v0}, Lp7;->x(Lqb2;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v8

    .line 73
    :cond_4
    iget v1, v0, Lcv2;->u:I

    .line 74
    .line 75
    rem-int/lit8 v5, v1, 0x2

    .line 76
    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    move v5, v11

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    move v5, v10

    .line 82
    :goto_1
    if-eqz v5, :cond_6

    .line 83
    .line 84
    if-eq v1, v12, :cond_7

    .line 85
    .line 86
    invoke-virtual {v2}, Lqb2;->s()Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    goto :goto_2

    .line 91
    :cond_6
    invoke-virtual {v2, v9}, Lqb2;->h(C)V

    .line 92
    .line 93
    .line 94
    :cond_7
    :goto_2
    invoke-virtual {v2}, Lqb2;->c()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_c

    .line 99
    .line 100
    if-eqz v5, :cond_b

    .line 101
    .line 102
    iget v1, v0, Lcv2;->u:I

    .line 103
    .line 104
    iget v5, v2, Lqb2;->b:I

    .line 105
    .line 106
    const/4 v6, 0x4

    .line 107
    if-ne v1, v12, :cond_9

    .line 108
    .line 109
    if-nez v10, :cond_8

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_8
    const-string v0, "Unexpected leading comma"

    .line 113
    .line 114
    invoke-static {v2, v0, v5, v6}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 115
    .line 116
    .line 117
    throw v8

    .line 118
    :cond_9
    if-eqz v10, :cond_a

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_a
    const-string v0, "Expected comma after the key-value pair"

    .line 122
    .line 123
    invoke-static {v2, v0, v5, v6}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 124
    .line 125
    .line 126
    throw v8

    .line 127
    :cond_b
    :goto_3
    iget v1, v0, Lcv2;->u:I

    .line 128
    .line 129
    add-int/lit8 v12, v1, 0x1

    .line 130
    .line 131
    iput v12, v0, Lcv2;->u:I

    .line 132
    .line 133
    goto/16 :goto_c

    .line 134
    .line 135
    :cond_c
    if-nez v10, :cond_d

    .line 136
    .line 137
    goto/16 :goto_c

    .line 138
    .line 139
    :cond_d
    invoke-static {v2, v6}, Lp7;->x(Lqb2;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v8

    .line 143
    :cond_e
    invoke-virtual {v2}, Lqb2;->s()Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    :goto_4
    invoke-virtual {v2}, Lqb2;->c()Z

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    const/16 v14, 0x40

    .line 152
    .line 153
    move-object/from16 v17, v8

    .line 154
    .line 155
    iget-object v8, v0, Lcv2;->v:Lm31;

    .line 156
    .line 157
    if-eqz v13, :cond_20

    .line 158
    .line 159
    invoke-virtual {v2}, Lqb2;->e()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-virtual {v2, v9}, Lqb2;->h(C)V

    .line 164
    .line 165
    .line 166
    iget-object v13, v0, Lcv2;->r:Lu21;

    .line 167
    .line 168
    invoke-static {v1, v13, v5}, Lsp0;->C(Lyo2;Lu21;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    const-wide/16 v18, 0x1

    .line 173
    .line 174
    const/4 v15, -0x3

    .line 175
    if-eq v9, v15, :cond_11

    .line 176
    .line 177
    if-eqz v8, :cond_f

    .line 178
    .line 179
    iget-object v0, v8, Lm31;->a:Lud0;

    .line 180
    .line 181
    if-ge v9, v14, :cond_10

    .line 182
    .line 183
    iget-wide v1, v0, Lud0;->a:J

    .line 184
    .line 185
    shl-long v5, v18, v9

    .line 186
    .line 187
    or-long/2addr v1, v5

    .line 188
    iput-wide v1, v0, Lud0;->a:J

    .line 189
    .line 190
    :cond_f
    :goto_5
    move v12, v9

    .line 191
    goto/16 :goto_c

    .line 192
    .line 193
    :cond_10
    ushr-int/lit8 v1, v9, 0x6

    .line 194
    .line 195
    sub-int/2addr v1, v11

    .line 196
    and-int/lit8 v2, v9, 0x3f

    .line 197
    .line 198
    iget-object v0, v0, Lud0;->d:Ljava/io/Serializable;

    .line 199
    .line 200
    check-cast v0, [J

    .line 201
    .line 202
    aget-wide v5, v0, v1

    .line 203
    .line 204
    shl-long v7, v18, v2

    .line 205
    .line 206
    or-long/2addr v5, v7

    .line 207
    aput-wide v5, v0, v1

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_11
    invoke-static {v13, v1}, Lsp0;->G(Lu21;Lyo2;)Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-nez v8, :cond_14

    .line 215
    .line 216
    iget v0, v3, Lq9;->b:I

    .line 217
    .line 218
    iget-object v1, v3, Lq9;->e:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, [I

    .line 221
    .line 222
    aget v4, v1, v0

    .line 223
    .line 224
    const/4 v6, -0x2

    .line 225
    if-ne v4, v6, :cond_12

    .line 226
    .line 227
    aput v12, v1, v0

    .line 228
    .line 229
    add-int/2addr v0, v12

    .line 230
    iput v0, v3, Lq9;->b:I

    .line 231
    .line 232
    :cond_12
    iget v0, v3, Lq9;->b:I

    .line 233
    .line 234
    if-eq v0, v12, :cond_13

    .line 235
    .line 236
    add-int/2addr v0, v12

    .line 237
    iput v0, v3, Lq9;->b:I

    .line 238
    .line 239
    :cond_13
    iget v0, v2, Lqb2;->b:I

    .line 240
    .line 241
    iget-object v1, v2, Lqb2;->g:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v1, Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {v1, v10, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-static {v7, v0, v5}, Lpv2;->t0(ILjava/lang/String;Ljava/lang/String;)I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    new-instance v1, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string v3, "Encountered an unknown key \'"

    .line 260
    .line 261
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const/16 v3, 0x27

    .line 268
    .line 269
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    const-string v3, "Use \'ignoreUnknownKeys = true\' in \'Json {}\' builder or \'@JsonIgnoreUnknownKeys\' annotation to ignore unknown keys."

    .line 277
    .line 278
    invoke-virtual {v2, v0, v1, v3}, Lqb2;->l(ILjava/lang/String;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v17

    .line 282
    :cond_14
    new-instance v9, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, Lqb2;->p()B

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    const/16 v13, 0x8

    .line 292
    .line 293
    if-eq v5, v13, :cond_15

    .line 294
    .line 295
    if-eq v5, v7, :cond_15

    .line 296
    .line 297
    invoke-virtual {v2}, Lqb2;->k()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    goto/16 :goto_9

    .line 301
    .line 302
    :cond_15
    :goto_6
    invoke-virtual {v2}, Lqb2;->p()B

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    if-ne v5, v11, :cond_16

    .line 307
    .line 308
    invoke-virtual {v2}, Lqb2;->e()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_16
    if-eq v5, v13, :cond_1f

    .line 313
    .line 314
    if-ne v5, v7, :cond_17

    .line 315
    .line 316
    goto :goto_7

    .line 317
    :cond_17
    const/16 v8, 0x9

    .line 318
    .line 319
    const-string v14, "List is empty."

    .line 320
    .line 321
    if-ne v5, v8, :cond_1a

    .line 322
    .line 323
    invoke-static {v9}, Ldu;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    check-cast v5, Ljava/lang/Number;

    .line 328
    .line 329
    invoke-virtual {v5}, Ljava/lang/Number;->byteValue()B

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    if-ne v5, v13, :cond_19

    .line 334
    .line 335
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    if-nez v5, :cond_18

    .line 340
    .line 341
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    sub-int/2addr v5, v11

    .line 346
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    goto :goto_8

    .line 350
    :cond_18
    invoke-static {v14}, Lum2;->i(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    return v10

    .line 354
    :cond_19
    const-string v0, "found ] instead of }"

    .line 355
    .line 356
    invoke-static {v2, v0, v10, v7}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 357
    .line 358
    .line 359
    throw v17

    .line 360
    :cond_1a
    const/4 v8, 0x7

    .line 361
    if-ne v5, v8, :cond_1d

    .line 362
    .line 363
    invoke-static {v9}, Ldu;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    check-cast v5, Ljava/lang/Number;

    .line 368
    .line 369
    invoke-virtual {v5}, Ljava/lang/Number;->byteValue()B

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-ne v5, v7, :cond_1c

    .line 374
    .line 375
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    if-nez v5, :cond_1b

    .line 380
    .line 381
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    sub-int/2addr v5, v11

    .line 386
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    goto :goto_8

    .line 390
    :cond_1b
    invoke-static {v14}, Lum2;->i(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    return v10

    .line 394
    :cond_1c
    const-string v0, "found } instead of ]"

    .line 395
    .line 396
    invoke-static {v2, v0, v10, v7}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 397
    .line 398
    .line 399
    throw v17

    .line 400
    :cond_1d
    const/16 v8, 0xa

    .line 401
    .line 402
    if-eq v5, v8, :cond_1e

    .line 403
    .line 404
    goto :goto_8

    .line 405
    :cond_1e
    const-string v0, "Unexpected end of input due to malformed JSON during ignoring unknown keys"

    .line 406
    .line 407
    invoke-static {v2, v0, v10, v7}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 408
    .line 409
    .line 410
    throw v17

    .line 411
    :cond_1f
    :goto_7
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    :goto_8
    invoke-virtual {v2}, Lqb2;->f()B

    .line 419
    .line 420
    .line 421
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-nez v5, :cond_15

    .line 426
    .line 427
    :goto_9
    invoke-virtual {v2}, Lqb2;->s()Z

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    move-object/from16 v8, v17

    .line 432
    .line 433
    const/16 v9, 0x3a

    .line 434
    .line 435
    goto/16 :goto_4

    .line 436
    .line 437
    :cond_20
    const-wide/16 v18, 0x1

    .line 438
    .line 439
    if-nez v5, :cond_27

    .line 440
    .line 441
    if-eqz v8, :cond_25

    .line 442
    .line 443
    iget-object v0, v8, Lm31;->a:Lud0;

    .line 444
    .line 445
    iget-object v1, v0, Lud0;->c:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v1, Lml0;

    .line 448
    .line 449
    iget-object v2, v0, Lud0;->b:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v2, Lyo2;

    .line 452
    .line 453
    invoke-interface {v2}, Lyo2;->d()I

    .line 454
    .line 455
    .line 456
    move-result v5

    .line 457
    :cond_21
    iget-wide v6, v0, Lud0;->a:J

    .line 458
    .line 459
    const-wide/16 v8, -0x1

    .line 460
    .line 461
    cmp-long v11, v6, v8

    .line 462
    .line 463
    if-eqz v11, :cond_22

    .line 464
    .line 465
    not-long v6, v6

    .line 466
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 467
    .line 468
    .line 469
    move-result v6

    .line 470
    iget-wide v7, v0, Lud0;->a:J

    .line 471
    .line 472
    shl-long v15, v18, v6

    .line 473
    .line 474
    or-long/2addr v7, v15

    .line 475
    iput-wide v7, v0, Lud0;->a:J

    .line 476
    .line 477
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    invoke-virtual {v1, v2, v7}, Lml0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v7

    .line 485
    check-cast v7, Ljava/lang/Boolean;

    .line 486
    .line 487
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 488
    .line 489
    .line 490
    move-result v7

    .line 491
    if-eqz v7, :cond_21

    .line 492
    .line 493
    move v12, v6

    .line 494
    goto :goto_c

    .line 495
    :cond_22
    if-le v5, v14, :cond_25

    .line 496
    .line 497
    iget-object v0, v0, Lud0;->d:Ljava/io/Serializable;

    .line 498
    .line 499
    check-cast v0, [J

    .line 500
    .line 501
    array-length v5, v0

    .line 502
    :goto_a
    if-ge v10, v5, :cond_25

    .line 503
    .line 504
    add-int/lit8 v6, v10, 0x1

    .line 505
    .line 506
    mul-int/lit8 v7, v6, 0x40

    .line 507
    .line 508
    aget-wide v13, v0, v10

    .line 509
    .line 510
    :goto_b
    cmp-long v11, v13, v8

    .line 511
    .line 512
    if-eqz v11, :cond_24

    .line 513
    .line 514
    not-long v8, v13

    .line 515
    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 516
    .line 517
    .line 518
    move-result v8

    .line 519
    shl-long v15, v18, v8

    .line 520
    .line 521
    or-long/2addr v13, v15

    .line 522
    add-int/2addr v8, v7

    .line 523
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object v9

    .line 527
    invoke-virtual {v1, v2, v9}, Lml0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v9

    .line 531
    check-cast v9, Ljava/lang/Boolean;

    .line 532
    .line 533
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 534
    .line 535
    .line 536
    move-result v9

    .line 537
    if-eqz v9, :cond_23

    .line 538
    .line 539
    aput-wide v13, v0, v10

    .line 540
    .line 541
    move v12, v8

    .line 542
    goto :goto_c

    .line 543
    :cond_23
    const-wide/16 v8, -0x1

    .line 544
    .line 545
    goto :goto_b

    .line 546
    :cond_24
    aput-wide v13, v0, v10

    .line 547
    .line 548
    move v10, v6

    .line 549
    const-wide/16 v8, -0x1

    .line 550
    .line 551
    goto :goto_a

    .line 552
    :cond_25
    :goto_c
    sget-object v0, Lfg3;->l:Lfg3;

    .line 553
    .line 554
    if-eq v4, v0, :cond_26

    .line 555
    .line 556
    iget-object v0, v3, Lq9;->e:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v0, [I

    .line 559
    .line 560
    iget v1, v3, Lq9;->b:I

    .line 561
    .line 562
    aput v12, v0, v1

    .line 563
    .line 564
    :cond_26
    return v12

    .line 565
    :cond_27
    invoke-static {v2, v6}, Lp7;->x(Lqb2;Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    throw v17
.end method

.method public final o()I
    .locals 5

    .line 1
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqb2;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-long v3, v2

    .line 9
    cmp-long v3, v0, v3

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v3, "Failed to parse int for input \'"

    .line 17
    .line 18
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v0, 0x27

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    const/4 v2, 0x6

    .line 35
    invoke-static {p0, v0, v1, v2}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    throw p0
.end method

.method public final r()B
    .locals 5

    .line 1
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqb2;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-byte v2, v2

    .line 9
    int-to-long v3, v2

    .line 10
    cmp-long v3, v0, v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "Failed to parse byte for input \'"

    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x27

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x6

    .line 36
    invoke-static {p0, v0, v1, v2}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    throw p0
.end method

.method public final r0()Lj31;
    .locals 2

    .line 1
    new-instance v0, Ldk;

    .line 2
    .line 3
    iget-object v1, p0, Lcv2;->r:Lu21;

    .line 4
    .line 5
    iget-object v1, v1, Lu21;->a:Lf31;

    .line 6
    .line 7
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 8
    .line 9
    invoke-direct {v0, v1, p0}, Ldk;-><init>(Lf31;Lqb2;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ldk;->m()Lj31;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final s(Lyo2;)Ly40;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lev2;->a(Lyo2;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Lg31;

    .line 11
    .line 12
    iget-object v0, p0, Lcv2;->t:Lqb2;

    .line 13
    .line 14
    iget-object p0, p0, Lcv2;->r:Lu21;

    .line 15
    .line 16
    invoke-direct {p1, v0, p0}, Lg31;-><init>(Lqb2;Lu21;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    return-object p0
.end method

.method public final s0()Lu21;
    .locals 0

    .line 1
    iget-object p0, p0, Lcv2;->r:Lu21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p4, p0, Lcv2;->t:Lqb2;

    .line 2
    .line 3
    iget-object p4, p4, Lqb2;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p4, Lq9;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcv2;->s:Lfg3;

    .line 14
    .line 15
    sget-object v0, Lfg3;->l:Lfg3;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    and-int/lit8 p1, p2, 0x1

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    move p1, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    const/4 p2, -0x2

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object v0, p4, Lq9;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, [I

    .line 33
    .line 34
    iget v2, p4, Lq9;->b:I

    .line 35
    .line 36
    aget v0, v0, v2

    .line 37
    .line 38
    if-ne v0, p2, :cond_1

    .line 39
    .line 40
    iget-object v0, p4, Lq9;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, [Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v3, Lsn;->L:Lsn;

    .line 45
    .line 46
    aput-object v3, v0, v2

    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0, p3}, Lcv2;->c(Lw41;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    iget-object p1, p4, Lq9;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, [I

    .line 57
    .line 58
    iget p3, p4, Lq9;->b:I

    .line 59
    .line 60
    aget p1, p1, p3

    .line 61
    .line 62
    if-eq p1, p2, :cond_2

    .line 63
    .line 64
    add-int/2addr p3, v1

    .line 65
    iput p3, p4, Lq9;->b:I

    .line 66
    .line 67
    iget-object p1, p4, Lq9;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, [Ljava/lang/Object;

    .line 70
    .line 71
    array-length p1, p1

    .line 72
    if-ne p3, p1, :cond_2

    .line 73
    .line 74
    invoke-virtual {p4}, Lq9;->h()V

    .line 75
    .line 76
    .line 77
    :cond_2
    iget-object p1, p4, Lq9;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, [Ljava/lang/Object;

    .line 80
    .line 81
    iget p3, p4, Lq9;->b:I

    .line 82
    .line 83
    iget-object v0, p4, Lq9;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lf31;

    .line 86
    .line 87
    iget-boolean v0, v0, Lf31;->h:Z

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    move-object v0, p0

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    sget-object v0, Lgd3;->z:Lgd3;

    .line 94
    .line 95
    :goto_1
    aput-object v0, p1, p3

    .line 96
    .line 97
    iget-object p1, p4, Lq9;->e:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, [I

    .line 100
    .line 101
    aput p2, p1, p3

    .line 102
    .line 103
    :cond_4
    return-object p0
.end method

.method public final v()S
    .locals 5

    .line 1
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqb2;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-short v2, v2

    .line 9
    int-to-long v3, v2

    .line 10
    cmp-long v3, v0, v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "Failed to parse short for input \'"

    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x27

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x6

    .line 36
    invoke-static {p0, v0, v1, v2}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    throw p0
.end method

.method public final w()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqb2;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final y()F
    .locals 5

    .line 1
    iget-object p0, p0, Lcv2;->t:Lqb2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqb2;->k()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_0
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 18
    .line 19
    .line 20
    cmpg-float v3, v3, v4

    .line 21
    .line 22
    if-gtz v3, :cond_0

    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0, v2}, Lp7;->F(Ljava/lang/Number;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v3, 0x2

    .line 34
    invoke-static {p0, v0, v1, v3}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    throw v2

    .line 38
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v4, "Failed to parse type \'float\' for input \'"

    .line 41
    .line 42
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 v0, 0x27

    .line 49
    .line 50
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v3, 0x6

    .line 58
    invoke-static {p0, v0, v1, v3}, Lqb2;->m(Lqb2;Ljava/lang/String;II)V

    .line 59
    .line 60
    .line 61
    throw v2
.end method
