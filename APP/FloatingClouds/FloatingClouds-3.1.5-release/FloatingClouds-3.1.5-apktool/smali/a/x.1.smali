.class public abstract La/x;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements La/r9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractList<",
        "TE;>;",
        "Ljava/util/List<",
        "TE;>;",
        "La/r9;"
    }
.end annotation


# virtual methods
.method public final remove(I)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, La/F1;

    iget v1, v0, La/F1;->c:I

    if-ltz p1, :cond_5

    if-ge p1, v1, :cond_5

    invoke-static {v0}, La/o3;->c0(Ljava/util/List;)I

    move-result v1

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, La/F1;->removeLast()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    invoke-virtual {v0}, La/F1;->removeFirst()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v0}, La/F1;->g()V

    iget v1, v0, La/F1;->a:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, La/F1;->f(I)I

    move-result v1

    iget-object v2, v0, La/F1;->b:[Ljava/lang/Object;

    aget-object v3, v2, v1

    iget v4, v0, La/F1;->c:I

    const/4 v5, 0x1

    shr-int/2addr v4, v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-ge p1, v4, :cond_3

    iget p1, v0, La/F1;->a:I

    if-lt v1, p1, :cond_2

    add-int/lit8 v4, p1, 0x1

    invoke-static {v2, v2, v4, p1, v1}, La/w1;->h([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_0

    :cond_2
    invoke-static {v2, v2, v5, v7, v1}, La/w1;->h([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object p1, v0, La/F1;->b:[Ljava/lang/Object;

    array-length v1, p1

    sub-int/2addr v1, v5

    aget-object v1, p1, v1

    aput-object v1, p1, v7

    iget v1, v0, La/F1;->a:I

    add-int/lit8 v2, v1, 0x1

    array-length v4, p1

    sub-int/2addr v4, v5

    invoke-static {p1, p1, v2, v1, v4}, La/w1;->h([Ljava/lang/Object;[Ljava/lang/Object;III)V

    :goto_0
    iget-object p1, v0, La/F1;->b:[Ljava/lang/Object;

    iget v1, v0, La/F1;->a:I

    aput-object v6, p1, v1

    invoke-virtual {v0, v1}, La/F1;->c(I)I

    move-result p1

    iput p1, v0, La/F1;->a:I

    goto :goto_2

    :cond_3
    iget p1, v0, La/F1;->a:I

    invoke-static {v0}, La/o3;->c0(Ljava/util/List;)I

    move-result v2

    add-int/2addr v2, p1

    invoke-virtual {v0, v2}, La/F1;->f(I)I

    move-result p1

    if-gt v1, p1, :cond_4

    iget-object v2, v0, La/F1;->b:[Ljava/lang/Object;

    add-int/lit8 v4, v1, 0x1

    add-int/lit8 v7, p1, 0x1

    invoke-static {v2, v2, v1, v4, v7}, La/w1;->h([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_1

    :cond_4
    iget-object v2, v0, La/F1;->b:[Ljava/lang/Object;

    add-int/lit8 v4, v1, 0x1

    array-length v8, v2

    invoke-static {v2, v2, v1, v4, v8}, La/w1;->h([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object v1, v0, La/F1;->b:[Ljava/lang/Object;

    array-length v2, v1

    sub-int/2addr v2, v5

    aget-object v4, v1, v7

    aput-object v4, v1, v2

    add-int/lit8 v2, p1, 0x1

    invoke-static {v1, v1, v7, v5, v2}, La/w1;->h([Ljava/lang/Object;[Ljava/lang/Object;III)V

    :goto_1
    iget-object v1, v0, La/F1;->b:[Ljava/lang/Object;

    aput-object v6, v1, p1

    :goto_2
    iget p1, v0, La/F1;->c:I

    sub-int/2addr p1, v5

    iput p1, v0, La/F1;->c:I

    return-object v3

    :cond_5
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "index: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final size()I
    .locals 1

    move-object v0, p0

    check-cast v0, La/F1;

    iget v0, v0, La/F1;->c:I

    return v0
.end method
