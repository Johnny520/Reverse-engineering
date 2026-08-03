.class public abstract Lg/C;
.super Lg/s;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private final a:I

.field private b:I

.field private c:Lg/E;

.field private d:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Lg/s;-><init>()V

    if-lez p1, :cond_1

    add-int/lit8 v0, p1, -0x1

    and-int/2addr v0, p1

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-lt p2, v0, :cond_0

    iput p1, p0, Lg/C;->a:I

    iput p2, p0, Lg/C;->b:I

    const/4 p1, 0x0

    iput-object p1, p0, Lg/C;->c:Lg/E;

    iput v0, p0, Lg/C;->d:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "writeSize < -1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid alignment"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final c()I
    .locals 2

    iget v0, p0, Lg/C;->b:I

    if-ltz v0, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "writeSize is unknown"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lg/C;

    if-ne p0, p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg/s;->b()Lg/t;

    move-result-object v0

    invoke-virtual {p1}, Lg/s;->b()Lg/t;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lg/C;->e(Lg/C;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final d(Lg/k;Ln/d;)V
    .locals 1

    iget v0, p0, Lg/C;->a:I

    invoke-virtual {p2, v0}, Ln/d;->a(I)V

    :try_start_0
    iget v0, p0, Lg/C;->b:I

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lg/C;->f()I

    move-result v0

    invoke-virtual {p2, v0}, Ln/d;->e(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, p1, p2}, Lg/C;->l(Lg/k;Ln/d;)V

    return-void

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "writeSize is unknown"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "...while writing "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lb/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lb/a;

    move-result-object p1

    throw p1
.end method

.method protected e(Lg/C;)I
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    check-cast p1, Lg/C;

    invoke-virtual {p0}, Lg/s;->b()Lg/t;

    move-result-object v1

    invoke-virtual {p1}, Lg/s;->b()Lg/t;

    move-result-object v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    return v3

    :cond_1
    invoke-virtual {p0, p1}, Lg/C;->e(Lg/C;)I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v3

    :goto_0
    return v0
.end method

.method public final f()I
    .locals 2

    iget v0, p0, Lg/C;->d:I

    if-ltz v0, :cond_0

    iget-object v1, p0, Lg/C;->c:Lg/E;

    invoke-virtual {v1, v0}, Lg/E;->b(I)I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "offset not yet known"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lg/C;->a:I

    return v0
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lg/C;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lg/E;I)I
    .locals 1

    if-eqz p1, :cond_2

    if-ltz p2, :cond_1

    iget-object v0, p0, Lg/C;->c:Lg/E;

    if-nez v0, :cond_0

    iget v0, p0, Lg/C;->a:I

    add-int/lit8 v0, v0, -0x1

    add-int/2addr p2, v0

    not-int v0, v0

    and-int/2addr p2, v0

    iput-object p1, p0, Lg/C;->c:Lg/E;

    iput p2, p0, Lg/C;->d:I

    invoke-virtual {p0, p1, p2}, Lg/C;->j(Lg/E;I)V

    return p2

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "already written"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "offset < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "addedTo == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected j(Lg/E;I)V
    .locals 0

    return-void
.end method

.method public final k(I)V
    .locals 1

    if-ltz p1, :cond_1

    iget v0, p0, Lg/C;->b:I

    if-gez v0, :cond_0

    iput p1, p0, Lg/C;->b:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "writeSize already set"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "writeSize < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected abstract l(Lg/k;Ln/d;)V
.end method
