.class public final La/a;
.super La/Pe;
.source "SourceFile"


# virtual methods
.method public g(I)La/c;
    .locals 3

    new-instance v0, La/c;

    invoke-direct {v0}, La/c;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, La/Pe;->e(I)I

    move-result v2

    mul-int/2addr p1, v1

    add-int/2addr p1, v2

    invoke-virtual {p0, p1}, La/Pe;->a(I)I

    move-result p1

    iget-object v1, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public h(I)La/d;
    .locals 3

    new-instance v0, La/d;

    invoke-direct {v0}, La/d;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, La/Pe;->e(I)I

    move-result v2

    mul-int/2addr p1, v1

    add-int/2addr p1, v2

    invoke-virtual {p0, p1}, La/Pe;->a(I)I

    move-result p1

    iget-object v1, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public i(I)La/o;
    .locals 3

    new-instance v0, La/o;

    invoke-direct {v0}, La/o;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, La/Pe;->e(I)I

    move-result v2

    mul-int/2addr p1, v1

    add-int/2addr p1, v2

    invoke-virtual {p0, p1}, La/Pe;->a(I)I

    move-result p1

    iget-object v1, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public j()I
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, La/Pe;->b(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, La/Pe;->f(I)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k(I)La/p;
    .locals 3

    new-instance v0, La/p;

    invoke-direct {v0}, La/p;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, La/Pe;->b(I)I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, La/Pe;->e(I)I

    move-result v2

    mul-int/2addr p1, v1

    add-int/2addr p1, v2

    invoke-virtual {p0, p1}, La/Pe;->a(I)I

    move-result p1

    iget-object v1, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    const-string v2, "bb"

    invoke-static {v1, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public l(La/Pe;)La/Pe;
    .locals 3

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, La/Pe;->b(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget v1, p0, La/Pe;->a:I

    add-int/2addr v0, v1

    iget-object v1, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p1, v2, v1}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
