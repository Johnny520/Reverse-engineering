.class public abstract La/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements La/q9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;",
        "La/q9;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/io/File;


# virtual methods
.method public final a()Z
    .locals 5

    const/4 v0, 0x3

    iput v0, p0, La/v;->a:I

    move-object v0, p0

    check-cast v0, La/v6$b;

    :goto_0
    iget-object v1, v0, La/v6$b;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/v6$c;

    if-nez v2, :cond_0

    const/4 v1, 0x0

    goto :goto_2

    :cond_0
    invoke-virtual {v2}, La/v6$c;->a()Ljava/io/File;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v2, v2, La/v6$c;->a:Ljava/io/File;

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v2

    iget-object v4, v0, La/v6$b;->d:La/v6;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v4, 0x7fffffff

    if-lt v2, v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v3}, La/v6$b;->b(Ljava/io/File;)La/v6$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    :goto_1
    move-object v1, v3

    :goto_2
    const/4 v2, 0x1

    if-eqz v1, :cond_4

    iput-object v1, v0, La/v;->b:Ljava/io/File;

    iput v2, v0, La/v;->a:I

    goto :goto_3

    :cond_4
    const/4 v1, 0x2

    iput v1, v0, La/v;->a:I

    :goto_3
    iget v0, p0, La/v;->a:I

    if-ne v0, v2, :cond_5

    return v2

    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, La/v;->a:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "hasNext called when the iterator is in the FAILED state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v1

    :cond_2
    invoke-virtual {p0}, La/v;->a()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget v0, p0, La/v;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iput v2, p0, La/v;->a:I

    iget-object v0, p0, La/v;->b:Ljava/io/File;

    return-object v0

    :cond_0
    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, La/v;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iput v2, p0, La/v;->a:I

    iget-object v0, p0, La/v;->b:Ljava/io/File;

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
