.class public final Ln/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/a;


# instance fields
.field private final a:Z

.field private b:[B

.field private c:I

.field private d:Z

.field private e:Ljava/util/ArrayList;

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x3e8

    new-array v0, v0, [B

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1}, Ln/d;-><init>([BZ)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ln/d;-><init>([BZ)V

    return-void
.end method

.method private constructor <init>([BZ)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Ln/d;->a:Z

    iput-object p1, p0, Ln/d;->b:[B

    const/4 p1, 0x0

    iput p1, p0, Ln/d;->c:I

    iput-boolean p1, p0, Ln/d;->d:Z

    const/4 p2, 0x0

    iput-object p2, p0, Ln/d;->e:Ljava/util/ArrayList;

    iput p1, p0, Ln/d;->f:I

    iput p1, p0, Ln/d;->g:I

    return-void
.end method

.method private g(I)V
    .locals 3

    iget-object v0, p0, Ln/d;->b:[B

    array-length v1, v0

    if-ge v1, p1, :cond_0

    mul-int/lit8 p1, p1, 0x2

    add-int/lit16 p1, p1, 0x3e8

    new-array p1, p1, [B

    iget v1, p0, Ln/d;->c:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p1, p0, Ln/d;->b:[B

    :cond_0
    return-void
.end method

.method private static l()V
    .locals 2

    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "attempt to write past the end"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    add-int/lit8 v0, p1, -0x1

    if-ltz p1, :cond_2

    and-int/2addr p1, v0

    if-nez p1, :cond_2

    iget p1, p0, Ln/d;->c:I

    add-int/2addr p1, v0

    not-int v0, v0

    and-int/2addr p1, v0

    iget-boolean v0, p0, Ln/d;->a:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Ln/d;->g(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln/d;->b:[B

    array-length v0, v0

    if-gt p1, v0, :cond_1

    :goto_0
    iget-object v0, p0, Ln/d;->b:[B

    iget v1, p0, Ln/d;->c:I

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Ljava/util/Arrays;->fill([BIIB)V

    iput p1, p0, Ln/d;->c:I

    return-void

    :cond_1
    invoke-static {}, Ln/d;->l()V

    const/4 p1, 0x0

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus alignment"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(ILjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Ln/d;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ln/d;->f()V

    iget-object v0, p0, Ln/d;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ln/d;->e:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln/c;

    invoke-virtual {v0}, Ln/c;->a()I

    move-result v0

    :goto_0
    iget v1, p0, Ln/d;->c:I

    if-gt v0, v1, :cond_2

    move v0, v1

    :cond_2
    iget-object v1, p0, Ln/d;->e:Ljava/util/ArrayList;

    new-instance v2, Ln/c;

    add-int/2addr p1, v0

    invoke-direct {v2, p2, v0, p1}, Ln/c;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Ln/d;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ln/d;->f()V

    iget-object v0, p0, Ln/d;->e:Ljava/util/ArrayList;

    new-instance v1, Ln/c;

    iget v2, p0, Ln/d;->c:I

    const v3, 0x7fffffff

    invoke-direct {v1, p1, v2, v3}, Ln/c;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Ln/d;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e(I)V
    .locals 3

    iget v0, p0, Ln/d;->c:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lb/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "expected cursor "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; actual value: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Ln/d;->c:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lb/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Ln/d;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Ln/d;->e:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln/c;

    iget v1, p0, Ln/d;->c:I

    invoke-virtual {v0, v1}, Ln/c;->b(I)V

    :cond_1
    return-void
.end method

.method public final h()I
    .locals 2

    iget v0, p0, Ln/d;->g:I

    mul-int/lit8 v1, v0, 0x2

    add-int/lit8 v1, v1, 0x8

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Ln/d;->f:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public final i()[B
    .locals 1

    iget-object v0, p0, Ln/d;->b:[B

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Ln/d;->c:I

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Ln/d;->d:Z

    return v0
.end method

.method public final m()[B
    .locals 4

    iget v0, p0, Ln/d;->c:I

    new-array v1, v0, [B

    iget-object v2, p0, Ln/d;->b:[B

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public final n(Ln/b;)V
    .locals 3

    invoke-virtual {p1}, Ln/b;->b()I

    move-result v0

    iget v1, p0, Ln/d;->c:I

    add-int/2addr v0, v1

    iget-boolean v2, p0, Ln/d;->a:Z

    if-eqz v2, :cond_0

    invoke-direct {p0, v0}, Ln/d;->g(I)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Ln/d;->b:[B

    array-length v2, v2

    if-gt v0, v2, :cond_1

    :goto_0
    iget-object v2, p0, Ln/d;->b:[B

    invoke-virtual {p1, v2, v1}, Ln/b;->a([BI)V

    iput v0, p0, Ln/d;->c:I

    return-void

    :cond_1
    invoke-static {}, Ln/d;->l()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final o([B)V
    .locals 6

    array-length v0, p1

    iget v1, p0, Ln/d;->c:I

    add-int v2, v1, v0

    const/4 v3, 0x0

    add-int v4, v3, v0

    or-int v5, v3, v0

    or-int/2addr v5, v2

    if-ltz v5, :cond_2

    array-length v5, p1

    if-gt v4, v5, :cond_2

    iget-boolean v4, p0, Ln/d;->a:Z

    if-eqz v4, :cond_0

    invoke-direct {p0, v2}, Ln/d;->g(I)V

    goto :goto_0

    :cond_0
    iget-object v4, p0, Ln/d;->b:[B

    array-length v4, v4

    if-gt v2, v4, :cond_1

    :goto_0
    iget-object v4, p0, Ln/d;->b:[B

    invoke-static {p1, v3, v4, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v2, p0, Ln/d;->c:I

    return-void

    :cond_1
    invoke-static {}, Ln/d;->l()V

    const/4 p1, 0x0

    throw p1

    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "bytes.length "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; 0..!"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final p(I)V
    .locals 3

    iget v0, p0, Ln/d;->c:I

    add-int/lit8 v1, v0, 0x1

    iget-boolean v2, p0, Ln/d;->a:Z

    if-eqz v2, :cond_0

    invoke-direct {p0, v1}, Ln/d;->g(I)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Ln/d;->b:[B

    array-length v2, v2

    if-gt v1, v2, :cond_1

    :goto_0
    iget-object v2, p0, Ln/d;->b:[B

    int-to-byte p1, p1

    aput-byte p1, v2, v0

    iput v1, p0, Ln/d;->c:I

    return-void

    :cond_1
    invoke-static {}, Ln/d;->l()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final q(I)V
    .locals 5

    iget v0, p0, Ln/d;->c:I

    add-int/lit8 v1, v0, 0x4

    iget-boolean v2, p0, Ln/d;->a:Z

    if-eqz v2, :cond_0

    invoke-direct {p0, v1}, Ln/d;->g(I)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Ln/d;->b:[B

    array-length v2, v2

    if-gt v1, v2, :cond_1

    :goto_0
    iget-object v2, p0, Ln/d;->b:[B

    int-to-byte v3, p1

    aput-byte v3, v2, v0

    add-int/lit8 v3, v0, 0x1

    shr-int/lit8 v4, p1, 0x8

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x2

    shr-int/lit8 v4, p1, 0x10

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v0, v0, 0x3

    shr-int/lit8 p1, p1, 0x18

    int-to-byte p1, p1

    aput-byte p1, v2, v0

    iput v1, p0, Ln/d;->c:I

    return-void

    :cond_1
    invoke-static {}, Ln/d;->l()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final r(I)V
    .locals 4

    iget v0, p0, Ln/d;->c:I

    add-int/lit8 v1, v0, 0x2

    iget-boolean v2, p0, Ln/d;->a:Z

    if-eqz v2, :cond_0

    invoke-direct {p0, v1}, Ln/d;->g(I)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Ln/d;->b:[B

    array-length v2, v2

    if-gt v1, v2, :cond_1

    :goto_0
    iget-object v2, p0, Ln/d;->b:[B

    int-to-byte v3, p1

    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    shr-int/lit8 p1, p1, 0x8

    int-to-byte p1, p1

    aput-byte p1, v2, v0

    iput v1, p0, Ln/d;->c:I

    return-void

    :cond_1
    invoke-static {}, Ln/d;->l()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final s(I)V
    .locals 7

    iget-boolean v0, p0, Ln/d;->a:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ln/d;->c:I

    add-int/lit8 v0, v0, 0x5

    invoke-direct {p0, v0}, Ln/d;->g(I)V

    :cond_0
    shr-int/lit8 v0, p1, 0x7

    const/high16 v1, -0x80000000

    and-int/2addr v1, p1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_0
    const/4 v3, 0x1

    move v4, v3

    :goto_1
    move v6, v0

    move v0, p1

    move p1, v6

    if-eqz v4, :cond_5

    if-ne p1, v1, :cond_3

    and-int/lit8 v4, p1, 0x1

    shr-int/lit8 v5, v0, 0x6

    and-int/2addr v5, v3

    if-eq v4, v5, :cond_2

    goto :goto_2

    :cond_2
    move v4, v2

    goto :goto_3

    :cond_3
    :goto_2
    move v4, v3

    :goto_3
    and-int/lit8 v0, v0, 0x7f

    if-eqz v4, :cond_4

    const/16 v5, 0x80

    goto :goto_4

    :cond_4
    move v5, v2

    :goto_4
    or-int/2addr v0, v5

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ln/d;->p(I)V

    shr-int/lit8 v0, p1, 0x7

    goto :goto_1

    :cond_5
    return-void
.end method

.method public final t(I)I
    .locals 2

    iget-boolean v0, p0, Ln/d;->a:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ln/d;->c:I

    add-int/lit8 v0, v0, 0x5

    invoke-direct {p0, v0}, Ln/d;->g(I)V

    :cond_0
    iget v0, p0, Ln/d;->c:I

    :goto_0
    ushr-int/lit8 v1, p1, 0x7

    and-int/lit8 p1, p1, 0x7f

    if-eqz v1, :cond_1

    or-int/lit16 p1, p1, 0x80

    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Ln/d;->p(I)V

    move p1, v1

    goto :goto_0

    :cond_1
    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Ln/d;->p(I)V

    iget p1, p0, Ln/d;->c:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public final u(I)V
    .locals 3

    if-ltz p1, :cond_2

    iget v0, p0, Ln/d;->c:I

    add-int/2addr v0, p1

    iget-boolean p1, p0, Ln/d;->a:Z

    if-eqz p1, :cond_0

    invoke-direct {p0, v0}, Ln/d;->g(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ln/d;->b:[B

    array-length p1, p1

    if-gt v0, p1, :cond_1

    :goto_0
    iget-object p1, p0, Ln/d;->b:[B

    iget v1, p0, Ln/d;->c:I

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Ljava/util/Arrays;->fill([BIIB)V

    iput v0, p0, Ln/d;->c:I

    return-void

    :cond_1
    invoke-static {}, Ln/d;->l()V

    const/4 p1, 0x0

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "count < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
