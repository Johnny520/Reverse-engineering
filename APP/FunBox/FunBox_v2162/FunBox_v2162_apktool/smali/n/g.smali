.class public final Ln/g;
.super Ln/j;
.source "SourceFile"


# static fields
.field public static final e:Ln/g;


# instance fields
.field private b:[I

.field private c:I

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln/g;-><init>(I)V

    sput-object v0, Ln/g;->e:Ln/g;

    invoke-virtual {v0}, Ln/j;->g()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ln/j;-><init>(Z)V

    :try_start_0
    new-array p1, p1, [I

    iput-object p1, p0, Ln/g;->b:[I
    :try_end_0
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    iput p1, p0, Ln/g;->c:I

    iput-boolean v0, p0, Ln/g;->d:Z

    return-void

    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "size < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ln/g;

    iget-boolean v1, p0, Ln/g;->d:Z

    iget-boolean v3, p1, Ln/g;->d:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ln/g;->c:I

    iget v3, p1, Ln/g;->c:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    move v1, v2

    :goto_0
    iget v3, p0, Ln/g;->c:I

    if-ge v1, v3, :cond_5

    iget-object v3, p0, Ln/g;->b:[I

    aget v3, v3, v1

    iget-object v4, p1, Ln/g;->b:[I

    aget v4, v4, v1

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Ln/g;->c:I

    if-ge v0, v2, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ln/g;->b:[I

    aget v2, v2, v0

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final j(I)V
    .locals 4

    invoke-virtual {p0}, Ln/j;->h()V

    iget v0, p0, Ln/g;->c:I

    iget-object v1, p0, Ln/g;->b:[I

    array-length v2, v1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_0

    mul-int/lit8 v2, v0, 0x3

    div-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, 0xa

    new-array v2, v2, [I

    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, p0, Ln/g;->b:[I

    :cond_0
    iget-object v0, p0, Ln/g;->b:[I

    iget v1, p0, Ln/g;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ln/g;->c:I

    aput p1, v0, v1

    iget-boolean v1, p0, Ln/g;->d:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    if-le v2, v1, :cond_2

    add-int/lit8 v2, v2, -0x2

    aget v0, v0, v2

    if-lt p1, v0, :cond_1

    move v3, v1

    :cond_1
    iput-boolean v3, p0, Ln/g;->d:Z

    :cond_2
    return-void
.end method

.method public final k(I)Z
    .locals 8

    iget v0, p0, Ln/g;->c:I

    iget-boolean v1, p0, Ln/g;->d:Z

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-nez v1, :cond_2

    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v5, p0, Ln/g;->b:[I

    aget v5, v5, v1

    if-ne v5, p1, :cond_0

    goto :goto_3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    neg-int v1, v0

    goto :goto_3

    :cond_2
    move v1, v0

    move v5, v3

    :goto_1
    add-int/lit8 v6, v5, 0x1

    if-le v1, v6, :cond_4

    sub-int v6, v1, v5

    shr-int/2addr v6, v4

    add-int/2addr v6, v5

    iget-object v7, p0, Ln/g;->b:[I

    aget v7, v7, v6

    if-gt p1, v7, :cond_3

    move v1, v6

    goto :goto_1

    :cond_3
    move v5, v6

    goto :goto_1

    :cond_4
    if-eq v1, v0, :cond_6

    iget-object v0, p0, Ln/g;->b:[I

    aget v0, v0, v1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    neg-int p1, v1

    goto :goto_2

    :cond_6
    neg-int p1, v0

    :goto_2
    add-int/lit8 v1, p1, -0x1

    :goto_3
    if-ltz v1, :cond_7

    move v3, v1

    :cond_7
    if-ltz v3, :cond_8

    move v2, v4

    :cond_8
    return v2
.end method

.method public final l(I)I
    .locals 1

    iget v0, p0, Ln/g;->c:I

    if-ge p1, v0, :cond_0

    :try_start_0
    iget-object v0, p0, Ln/g;->b:[I

    aget p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "n < 0"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "n >= size()"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(II)V
    .locals 1

    invoke-virtual {p0}, Ln/j;->h()V

    iget v0, p0, Ln/g;->c:I

    if-ge p1, v0, :cond_1

    :try_start_0
    iget-object v0, p0, Ln/g;->b:[I

    aput p2, v0, p1

    const/4 p2, 0x0

    iput-boolean p2, p0, Ln/g;->d:Z
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    if-ltz p1, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "n < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "n >= size()"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(I)V
    .locals 1

    if-ltz p1, :cond_1

    iget v0, p0, Ln/g;->c:I

    if-gt p1, v0, :cond_0

    invoke-virtual {p0}, Ln/j;->h()V

    iput p1, p0, Ln/g;->c:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "newSize > size"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "newSize < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Ln/g;->c:I

    return v0
.end method

.method public final p()V
    .locals 3

    invoke-virtual {p0}, Ln/j;->h()V

    iget-boolean v0, p0, Ln/g;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ln/g;->b:[I

    const/4 v1, 0x0

    iget v2, p0, Ln/g;->c:I

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->sort([III)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln/g;->d:Z

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Ln/g;->c:I

    mul-int/lit8 v1, v1, 0x5

    add-int/lit8 v1, v1, 0xa

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Ln/g;->c:I

    if-ge v1, v2, :cond_1

    if-eqz v1, :cond_0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v2, p0, Ln/g;->b:[I

    aget v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
