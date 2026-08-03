.class public final Li4/n;
.super Lz4/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    iput p2, p0, Li4/n;->h:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, p2

    .line 12
    :goto_0
    invoke-direct {p0, v0}, Lz4/j;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    new-array v0, p1, [Lw4/d;

    .line 16
    .line 17
    iput-object v0, p0, Li4/n;->j:Ljava/lang/Object;

    .line 18
    .line 19
    new-array p1, p1, [Z

    .line 20
    .line 21
    iput-object p1, p0, Li4/n;->k:Ljava/lang/Object;

    .line 22
    .line 23
    iput p2, p0, Li4/n;->i:I

    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    const/4 p2, 0x1

    .line 27
    invoke-direct {p0, p2}, Lz4/j;-><init>(Z)V

    .line 28
    .line 29
    .line 30
    new-instance p2, Lz4/g;

    .line 31
    .line 32
    invoke-direct {p2, p1}, Lz4/g;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Li4/n;->j:Ljava/lang/Object;

    .line 36
    .line 37
    new-instance p2, Lz4/g;

    .line 38
    .line 39
    add-int/lit8 v0, p1, 0x1

    .line 40
    .line 41
    invoke-direct {p2, v0}, Lz4/g;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Li4/n;->k:Ljava/lang/Object;

    .line 45
    .line 46
    iput p1, p0, Li4/n;->i:I

    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static t(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Li4/b0;

    .line 2
    .line 3
    const-string v1, "stack: "

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method


# virtual methods
.method public i()V
    .locals 2

    .line 1
    iget v0, p0, Li4/n;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lz4/j;->i()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Li4/n;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lz4/g;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-boolean v1, v0, Lz4/j;->g:Z

    .line 16
    .line 17
    iget-object v0, p0, Li4/n;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lz4/g;

    .line 20
    .line 21
    iput-boolean v1, v0, Lz4/j;->g:Z

    .line 22
    .line 23
    iput-boolean v1, p0, Lz4/j;->g:Z

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public l(Li4/b0;)V
    .locals 5

    .line 1
    iget v0, p0, Li4/n;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-gt v1, v0, :cond_2

    .line 7
    .line 8
    if-ne v1, v0, :cond_0

    .line 9
    .line 10
    const-string v2, "top0"

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    sub-int v2, v0, v1

    .line 14
    .line 15
    invoke-static {v2}, La/a;->X0(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_1
    const-string v3, "stack["

    .line 20
    .line 21
    const-string v4, "]: "

    .line 22
    .line 23
    invoke-static {v3, v2, v4}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, p0, Li4/n;->j:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, [Lw4/d;

    .line 30
    .line 31
    aget-object v3, v3, v1

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    const-string v3, "<invalid>"

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :goto_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p1, v2}, Lf4/a;->a(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    return-void
.end method

.method public m(ILw4/d;)V
    .locals 4

    .line 1
    iget-object v0, p0, Li4/n;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Lw4/d;

    .line 4
    .line 5
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-interface {p2}, Lw4/d;->g()Lw4/d;

    .line 9
    .line 10
    .line 11
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    iget v1, p0, Li4/n;->i:I

    .line 13
    .line 14
    sub-int/2addr v1, p1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    aget-object p1, v0, v1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Lw4/d;->getType()Lw4/c;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Lw4/c;->i()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-interface {p2}, Lw4/d;->getType()Lw4/c;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Lw4/c;->i()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-ne v2, v3, :cond_0

    .line 38
    .line 39
    aput-object p2, v0, v1

    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, "incompatible substitution: "

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v1, "<invalid>"

    .line 50
    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    move-object p1, v1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p1, " -> "

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    if-nez p2, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Li4/n;->t(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    throw p1

    .line 86
    :catch_0
    const-string p1, "type == null"

    .line 87
    .line 88
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public n()Li4/n;
    .locals 5

    .line 1
    new-instance v0, Li4/n;

    .line 2
    .line 3
    iget-object v1, p0, Li4/n;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [Lw4/d;

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v0, v2, v3}, Li4/n;-><init>(II)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Li4/n;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, [Lw4/d;

    .line 15
    .line 16
    array-length v3, v1

    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Li4/n;->k:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, [Z

    .line 24
    .line 25
    iget-object v2, v0, Li4/n;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, [Z

    .line 28
    .line 29
    array-length v3, v1

    .line 30
    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    iget v1, p0, Li4/n;->i:I

    .line 34
    .line 35
    iput v1, v0, Li4/n;->i:I

    .line 36
    .line 37
    return-object v0
.end method

.method public o(I)Lw4/d;
    .locals 2

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Li4/n;->i:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Li4/n;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, [Lw4/d;

    .line 10
    .line 11
    sub-int/2addr v0, p1

    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    aget-object p1, v1, v0

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    const-string p1, "underflow"

    .line 18
    .line 19
    invoke-static {p1}, Li4/n;->t(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    throw p1

    .line 24
    :cond_1
    const-string p1, "n < 0"

    .line 25
    .line 26
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    return-object p1
.end method

.method public p(I)Lw4/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4/n;->o(I)Lw4/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Lw4/d;->getType()Lw4/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public q(Lw4/d;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p1}, Lw4/d;->g()Lw4/d;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lw4/d;->getType()Lw4/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lw4/c;->i()I

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    iget v1, p0, Li4/n;->i:I

    .line 17
    .line 18
    add-int v2, v1, v0

    .line 19
    .line 20
    iget-object v3, p0, Li4/n;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, [Lw4/d;

    .line 23
    .line 24
    array-length v4, v3

    .line 25
    const/4 v5, 0x0

    .line 26
    if-gt v2, v4, :cond_1

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    if-ne v0, v2, :cond_0

    .line 30
    .line 31
    aput-object v5, v3, v1

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    iput v1, p0, Li4/n;->i:I

    .line 36
    .line 37
    :cond_0
    iget v0, p0, Li4/n;->i:I

    .line 38
    .line 39
    aput-object p1, v3, v0

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    iput v0, p0, Li4/n;->i:I

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    const-string p1, "overflow"

    .line 47
    .line 48
    invoke-static {p1}, Li4/n;->t(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v5

    .line 52
    :catch_0
    const-string p1, "type == null"

    .line 53
    .line 54
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public r()V
    .locals 7

    .line 1
    iget-object v0, p0, Li4/n;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/g;

    .line 4
    .line 5
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Li4/n;->i:I

    .line 9
    .line 10
    iget-object v2, p0, Li4/n;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lz4/g;

    .line 13
    .line 14
    iget v3, v2, Lz4/g;->i:I

    .line 15
    .line 16
    add-int/lit8 v3, v3, -0x1

    .line 17
    .line 18
    if-ne v1, v3, :cond_4

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lz4/g;->n(I)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x0

    .line 25
    move v5, v4

    .line 26
    :goto_0
    if-ge v4, v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {v2, v4}, Lz4/g;->n(I)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eq v6, v3, :cond_1

    .line 33
    .line 34
    if-eq v4, v5, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2, v5, v6}, Lz4/g;->q(II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v4}, Lz4/g;->n(I)I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    invoke-virtual {v0, v5, v6}, Lz4/g;->q(II)V

    .line 44
    .line 45
    .line 46
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 47
    .line 48
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    if-eq v5, v1, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0, v5}, Lz4/g;->r(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v5, v3}, Lz4/g;->q(II)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v0, v5, 0x1

    .line 60
    .line 61
    invoke-virtual {v2, v0}, Lz4/g;->r(I)V

    .line 62
    .line 63
    .line 64
    iput v5, p0, Li4/n;->i:I

    .line 65
    .line 66
    :cond_3
    return-void

    .line 67
    :cond_4
    const-string v0, "incomplete instance"

    .line 68
    .line 69
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public s(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lz4/j;->j()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Li4/n;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lz4/g;

    .line 9
    .line 10
    iget v1, v0, Lz4/g;->i:I

    .line 11
    .line 12
    iget v2, p0, Li4/n;->i:I

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lz4/g;->l(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p1, "non-default elements not all set"

    .line 21
    .line 22
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p1, "target < 0"

    .line 27
    .line 28
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
