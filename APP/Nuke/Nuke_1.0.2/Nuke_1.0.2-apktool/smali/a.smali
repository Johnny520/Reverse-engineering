.class public final La;
.super Lox2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public g(I)Lc;
    .locals 3

    .line 1
    new-instance v0, Lc;

    .line 2
    .line 3
    invoke-direct {v0}, Lox2;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-virtual {p0, v1}, Lox2;->b(I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lox2;->e(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    mul-int/2addr p1, v1

    .line 18
    add-int/2addr p1, v2

    .line 19
    invoke-virtual {p0, p1}, Lox2;->a(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object p0, p0, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1, p0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public h(I)Lf;
    .locals 3

    .line 1
    new-instance v0, Lf;

    .line 2
    .line 3
    invoke-direct {v0}, Lox2;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-virtual {p0, v1}, Lox2;->b(I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lox2;->e(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    mul-int/2addr p1, v1

    .line 18
    add-int/2addr p1, v2

    .line 19
    invoke-virtual {p0, p1}, Lox2;->a(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object p0, p0, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1, p0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public i()I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lox2;->b(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lox2;->f(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public j(I)Lr;
    .locals 3

    .line 1
    new-instance v0, Lr;

    .line 2
    .line 3
    invoke-direct {v0}, Lox2;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-virtual {p0, v1}, Lox2;->b(I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lox2;->e(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    mul-int/2addr p1, v1

    .line 18
    add-int/2addr p1, v2

    .line 19
    invoke-virtual {p0, p1}, Lox2;->a(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object p0, p0, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1, p0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public k(Lox2;)Lox2;
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lox2;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v1, p0, Lox2;->a:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    iget-object p0, p0, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/2addr v1, v0

    .line 19
    invoke-virtual {p1, v1, p0}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method
