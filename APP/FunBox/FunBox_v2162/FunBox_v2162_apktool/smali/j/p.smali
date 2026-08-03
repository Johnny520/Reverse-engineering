.class public final Lj/p;
.super Ln/j;
.source "SourceFile"


# instance fields
.field private final b:[Lj/m;

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj/p;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    invoke-direct {p0, v1}, Ln/j;-><init>(Z)V

    new-array p1, p1, [Lj/m;

    iput-object p1, p0, Lj/p;->b:[Lj/m;

    iput v0, p0, Lj/p;->c:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lj/p;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lj/p;

    iget-object v0, p1, Lj/p;->b:[Lj/m;

    iget-object v2, p0, Lj/p;->b:[Lj/m;

    array-length v3, v2

    array-length v4, v0

    if-ne v3, v4, :cond_6

    invoke-virtual {p0}, Lj/p;->p()I

    move-result v4

    invoke-virtual {p1}, Lj/p;->p()I

    move-result p1

    if-eq v4, p1, :cond_1

    goto :goto_3

    :cond_1
    move p1, v1

    :goto_0
    if-ge p1, v3, :cond_5

    aget-object v4, v2, p1

    aget-object v5, v0, p1

    if-ne v4, v5, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v4, :cond_4

    invoke-virtual {v4, v5}, Lj/m;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    return v1

    :cond_5
    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_3
    return v1
.end method

.method public final hashCode()I
    .locals 6

    iget-object v0, p0, Lj/p;->b:[Lj/m;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    if-nez v5, :cond_0

    move v5, v2

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Lj/m;->hashCode()I

    move-result v5

    :goto_1
    mul-int/lit8 v4, v4, 0x1f

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v4
.end method

.method public final j(Lj/m;)Lj/m;
    .locals 5

    iget-object v0, p0, Lj/p;->b:[Lj/m;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v3}, Lj/m;->n(Lj/m;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final k(I)Lj/m;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lj/p;->b:[Lj/m;

    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus reg"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final l()I
    .locals 1

    iget-object v0, p0, Lj/p;->b:[Lj/m;

    array-length v0, v0

    return v0
.end method

.method public final m(Lj/m;)V
    .locals 6

    iget-object v0, p0, Lj/p;->b:[Lj/m;

    invoke-virtual {p0}, Ln/j;->h()V

    if-eqz p1, :cond_2

    const/4 v1, -0x1

    iput v1, p0, Lj/p;->c:I

    :try_start_0
    invoke-virtual {p1}, Lj/m;->i()I

    move-result v1

    aput-object p1, v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-lez v1, :cond_0

    add-int/lit8 v4, v1, -0x1

    aget-object v5, v0, v4

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lj/m;->g()I

    move-result v5

    if-ne v5, v3, :cond_0

    aput-object v2, v0, v4

    :cond_0
    invoke-virtual {p1}, Lj/m;->g()I

    move-result p1

    if-ne p1, v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    aput-object v2, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "spec.getReg() out of range"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "spec == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Lj/p;)V
    .locals 3

    iget-object v0, p1, Lj/p;->b:[Lj/m;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p1, v1}, Lj/p;->k(I)Lj/m;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lj/p;->m(Lj/m;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final o(Lj/m;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lj/p;->b:[Lj/m;

    invoke-virtual {p1}, Lj/m;->i()I

    move-result p1

    const/4 v1, 0x0

    aput-object v1, v0, p1

    const/4 p1, -0x1

    iput p1, p0, Lj/p;->c:I
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus reg"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final p()I
    .locals 5

    iget v0, p0, Lj/p;->c:I

    if-gez v0, :cond_2

    iget-object v0, p0, Lj/p;->b:[Lj/m;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iput v2, p0, Lj/p;->c:I

    move v0, v2

    :cond_2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lj/p;->b:[Lj/m;

    array-length v1, v0

    new-instance v2, Ljava/lang/StringBuilder;

    mul-int/lit8 v3, v1, 0x19

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v3, 0x7b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v5, v0, v3

    if-eqz v5, :cond_1

    if-eqz v4, :cond_0

    const-string v6, ", "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const/4 v4, 0x1

    :goto_1
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
