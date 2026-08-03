.class public abstract Lr7/s;
.super Lr7/r;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final r:Ljava/nio/charset/CharsetDecoder;

.field public static final s:Ln7/e;


# instance fields
.field public o:Z

.field public p:Ljava/lang/Object;

.field public q:Lr7/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lr7/s;->r:Ljava/nio/charset/CharsetDecoder;

    .line 8
    .line 9
    sget-object v0, Ln7/e;->a:Ln7/e;

    .line 10
    .line 11
    sput-object v0, Lr7/s;->s:Ln7/e;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lr7/b;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lr7/r;->m:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p1, p0, Lr7/s;->o:Z

    .line 10
    .line 11
    return-void
.end method

.method public static O([B[B[B)[B
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    array-length v1, p0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    array-length v2, p1

    .line 8
    add-int/2addr v1, v2

    .line 9
    array-length v2, p2

    .line 10
    add-int/2addr v1, v2

    .line 11
    new-array v1, v1, [B

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    array-length v2, p0

    .line 16
    invoke-static {p0, v0, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v2, v0

    .line 21
    :goto_1
    array-length p0, p1

    .line 22
    invoke-static {p1, v0, v1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    array-length p0, p1

    .line 26
    add-int/2addr v2, p0

    .line 27
    array-length p0, p2

    .line 28
    invoke-static {p2, v0, v1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    return-object v1
.end method

.method public static T([B)[I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    aget-byte v0, p0, v0

    .line 3
    .line 4
    and-int/lit16 v0, v0, 0xff

    .line 5
    .line 6
    shl-int/lit8 v0, v0, 0x8

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget-byte v1, p0, v1

    .line 10
    .line 11
    and-int/lit16 v1, v1, 0xff

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    const v1, 0x8000

    .line 15
    .line 16
    .line 17
    and-int/2addr v1, v0

    .line 18
    const/4 v2, 0x2

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    aget-byte v1, p0, v1

    .line 23
    .line 24
    and-int/lit16 v1, v1, 0xff

    .line 25
    .line 26
    shl-int/lit8 v1, v1, 0x8

    .line 27
    .line 28
    aget-byte p0, p0, v2

    .line 29
    .line 30
    and-int/lit16 p0, p0, 0xff

    .line 31
    .line 32
    and-int/lit16 v0, v0, 0x7fff

    .line 33
    .line 34
    shl-int/lit8 v0, v0, 0x10

    .line 35
    .line 36
    add-int/2addr v1, p0

    .line 37
    add-int/2addr v1, v0

    .line 38
    const/4 p0, 0x4

    .line 39
    mul-int/2addr v1, v2

    .line 40
    filled-new-array {p0, v1}, [I

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_0
    mul-int/2addr v0, v2

    .line 46
    filled-new-array {v2, v0}, [I

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public static U([B)[I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-byte v0, p0, v0

    .line 3
    .line 4
    and-int/lit16 v0, v0, 0x80

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v0, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    :goto_0
    aget-byte v2, p0, v0

    .line 13
    .line 14
    add-int/lit8 v3, v0, 0x1

    .line 15
    .line 16
    and-int/lit16 v4, v2, 0x80

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    aget-byte p0, p0, v3

    .line 21
    .line 22
    and-int/lit16 p0, p0, 0xff

    .line 23
    .line 24
    and-int/lit8 v2, v2, 0x7f

    .line 25
    .line 26
    shl-int/lit8 v2, v2, 0x8

    .line 27
    .line 28
    add-int/2addr v2, p0

    .line 29
    add-int/lit8 v3, v0, 0x2

    .line 30
    .line 31
    :cond_1
    filled-new-array {v3, v2}, [I

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method


# virtual methods
.method public final A(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr7/s;->p:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lz7/h;->g:Lz7/h;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-class v2, Ly7/b;

    .line 13
    .line 14
    if-ne v1, v2, :cond_1

    .line 15
    .line 16
    check-cast v0, Ly7/b;

    .line 17
    .line 18
    invoke-virtual {v0}, Lz7/c;->b()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {v0}, Lz7/q;->a(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lr7/m;

    .line 38
    .line 39
    invoke-interface {v1, p1}, Lr7/g;->k(I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
.end method

.method public final B(Lq7/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lr7/s;->Q(Lq7/b;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p0, v0, v1}, Lr7/b;->M(IZ)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lr7/b;->k:[B

    .line 18
    .line 19
    array-length v1, v0

    .line 20
    invoke-virtual {p1, v0, v1}, Lq7/b;->e([BI)I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lr7/r;->L()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public N([B)Ljava/lang/String;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lr7/s;->o:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_4

    .line 6
    :cond_0
    array-length v1, p1

    .line 7
    const/4 v2, 0x2

    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    goto :goto_4

    .line 11
    :cond_1
    :goto_0
    if-ge v2, v1, :cond_6

    .line 12
    .line 13
    aget-byte v3, p1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_5

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-static {p1}, Lr7/s;->U([B)[I

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    invoke-static {p1}, Lr7/s;->T([B)[I

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_1
    if-eqz v0, :cond_3

    .line 29
    .line 30
    sget-object v2, Lr7/r;->n:Ljava/nio/charset/CharsetDecoder;

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_3
    sget-object v2, Lr7/s;->r:Ljava/nio/charset/CharsetDecoder;

    .line 34
    .line 35
    :goto_2
    const/4 v3, 0x1

    .line 36
    const/4 v4, 0x0

    .line 37
    :try_start_0
    aget v5, v1, v4

    .line 38
    .line 39
    aget v6, v1, v3

    .line 40
    .line 41
    invoke-static {p1, v5, v6}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v2, v5}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    return-object p1

    .line 54
    :catch_0
    if-eqz v0, :cond_4

    .line 55
    .line 56
    aget v0, v1, v4

    .line 57
    .line 58
    aget v1, v1, v3

    .line 59
    .line 60
    :try_start_1
    invoke-static {p1, v0, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    sget-object v3, Lr7/s;->s:Ln7/e;

    .line 65
    .line 66
    invoke-virtual {v3, v2}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1
    :try_end_1
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    goto :goto_3

    .line 75
    :catch_1
    new-instance v2, Ljava/lang/String;

    .line 76
    .line 77
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 78
    .line 79
    invoke-direct {v2, p1, v0, v1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 80
    .line 81
    .line 82
    move-object p1, v2

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    new-instance v0, Ljava/lang/String;

    .line 85
    .line 86
    aget v2, v1, v4

    .line 87
    .line 88
    aget v1, v1, v3

    .line 89
    .line 90
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 91
    .line 92
    invoke-direct {v0, p1, v2, v1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 93
    .line 94
    .line 95
    move-object p1, v0

    .line 96
    :goto_3
    return-object p1

    .line 97
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_6
    :goto_4
    if-eqz p1, :cond_8

    .line 101
    .line 102
    array-length p1, p1

    .line 103
    if-nez p1, :cond_7

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_7
    const-string p1, ""

    .line 107
    .line 108
    return-object p1

    .line 109
    :cond_8
    :goto_5
    const/4 p1, 0x0

    .line 110
    return-object p1
.end method

.method public final P(Lr7/m;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lr7/s;->p:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ly7/a;->a(Ljava/lang/Object;Lr7/m;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lr7/s;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lk7/a;->g:I

    .line 12
    .line 13
    invoke-interface {p1}, Lr7/g;->get()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eq v1, v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lr7/g;->k(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public Q(Lq7/b;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :cond_0
    new-array v0, v1, [B

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Lq7/b;->e([BI)I

    .line 16
    .line 17
    .line 18
    const/4 v1, -0x4

    .line 19
    invoke-virtual {p1, v1}, Lq7/b;->c(I)V

    .line 20
    .line 21
    .line 22
    iget-boolean p1, p0, Lr7/s;->o:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Lr7/s;->U([B)[I

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {v0}, Lr7/s;->T([B)[I

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    iget-boolean v0, p0, Lr7/s;->o:Z

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    move v0, v1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const/4 v0, 0x2

    .line 43
    :goto_1
    const/4 v2, 0x0

    .line 44
    aget v2, p1, v2

    .line 45
    .line 46
    aget p1, p1, v1

    .line 47
    .line 48
    add-int/2addr v2, p1

    .line 49
    add-int/2addr v2, v0

    .line 50
    return v2
.end method

.method public R(Lr7/s;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lr7/s;->q:Lr7/u;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lr7/u;->m:Lo7/b;

    .line 8
    .line 9
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v2

    .line 20
    :goto_0
    iget-object v3, p1, Lr7/s;->q:Lr7/u;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    iget-object v3, v3, Lr7/u;->m:Lo7/b;

    .line 25
    .line 26
    iget-object v3, v3, Lo7/b;->k:Lz7/c;

    .line 27
    .line 28
    invoke-virtual {v3}, Lz7/c;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v1, v2

    .line 36
    :goto_1
    invoke-static {v0, v1}, Ly7/a;->d(ZZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    mul-int/lit8 v0, v0, -0x1

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    return v0

    .line 45
    :cond_2
    iget-object v0, p0, Lr7/r;->m:Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, p1, Lr7/r;->m:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0, p1}, Ly7/a;->c(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1
.end method

.method public S(Lr7/s;)I
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-ne p1, p0, :cond_1

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_1
    invoke-virtual {p0, p1}, Lr7/s;->R(Lr7/s;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    return v0

    .line 16
    :cond_2
    invoke-virtual {p1}, Lr7/s;->X()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0}, Lr7/s;->X()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {p1, v0}, Ly7/a;->b(II)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
.end method

.method public V(Ljava/lang/String;)[B
    .locals 9

    .line 1
    iget-boolean v0, p0, Lr7/s;->o:Z

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    new-array v0, v3, [B

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    array-length v6, v0

    .line 21
    const v7, 0xff80

    .line 22
    .line 23
    .line 24
    and-int/2addr v7, v6

    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    new-array v2, v2, [B

    .line 28
    .line 29
    and-int/lit16 v7, v6, 0xff

    .line 30
    .line 31
    sub-int/2addr v6, v7

    .line 32
    shr-int/lit8 v6, v6, 0x8

    .line 33
    .line 34
    int-to-byte v7, v7

    .line 35
    aput-byte v7, v2, v1

    .line 36
    .line 37
    or-int/lit16 v1, v6, 0x80

    .line 38
    .line 39
    int-to-byte v1, v1

    .line 40
    aput-byte v1, v2, v3

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    and-int/lit16 v1, p1, 0xff

    .line 47
    .line 48
    sub-int/2addr p1, v1

    .line 49
    shr-int/lit8 p1, p1, 0x8

    .line 50
    .line 51
    int-to-byte v1, v1

    .line 52
    aput-byte v1, v2, v5

    .line 53
    .line 54
    or-int/lit16 p1, p1, 0x80

    .line 55
    .line 56
    int-to-byte p1, p1

    .line 57
    aput-byte p1, v2, v4

    .line 58
    .line 59
    move-object v1, v2

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    new-instance v1, Lr7/a;

    .line 62
    .line 63
    int-to-short v2, v6

    .line 64
    invoke-direct {v1, v2}, Lr7/a;-><init>(S)V

    .line 65
    .line 66
    .line 67
    iget-object v1, v1, Lr7/b;->k:[B

    .line 68
    .line 69
    aget-byte v2, v1, v4

    .line 70
    .line 71
    aput-byte v2, v1, v5

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    int-to-byte p1, p1

    .line 78
    aput-byte p1, v1, v4

    .line 79
    .line 80
    :goto_0
    move-object p1, v0

    .line 81
    move-object v0, v1

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    new-array p1, v4, [B

    .line 84
    .line 85
    :goto_1
    new-array v1, v5, [B

    .line 86
    .line 87
    invoke-static {v0, p1, v1}, Lr7/s;->O([B[B[B)[B

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :cond_2
    if-nez p1, :cond_3

    .line 93
    .line 94
    const/4 p1, 0x0

    .line 95
    return-object p1

    .line 96
    :cond_3
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    array-length v0, p1

    .line 103
    div-int/2addr v0, v3

    .line 104
    and-int/lit16 v6, v0, -0x8000

    .line 105
    .line 106
    if-eqz v6, :cond_4

    .line 107
    .line 108
    new-array v2, v2, [B

    .line 109
    .line 110
    and-int/lit16 v6, v0, 0xff

    .line 111
    .line 112
    sub-int/2addr v0, v6

    .line 113
    const v7, 0xff00

    .line 114
    .line 115
    .line 116
    and-int v8, v0, v7

    .line 117
    .line 118
    sub-int/2addr v0, v8

    .line 119
    shr-int/lit8 v8, v8, 0x8

    .line 120
    .line 121
    int-to-byte v8, v8

    .line 122
    aput-byte v8, v2, v1

    .line 123
    .line 124
    int-to-byte v1, v6

    .line 125
    aput-byte v1, v2, v3

    .line 126
    .line 127
    and-int/lit16 v1, v0, 0xff

    .line 128
    .line 129
    and-int/2addr v0, v7

    .line 130
    shr-int/lit8 v0, v0, 0x8

    .line 131
    .line 132
    or-int/lit16 v0, v0, 0x80

    .line 133
    .line 134
    int-to-byte v0, v0

    .line 135
    aput-byte v0, v2, v5

    .line 136
    .line 137
    int-to-byte v0, v1

    .line 138
    aput-byte v0, v2, v4

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    new-instance v1, Lr7/a;

    .line 142
    .line 143
    int-to-short v0, v0

    .line 144
    invoke-direct {v1, v0}, Lr7/a;-><init>(S)V

    .line 145
    .line 146
    .line 147
    iget-object v2, v1, Lr7/b;->k:[B

    .line 148
    .line 149
    :goto_2
    new-array v0, v3, [B

    .line 150
    .line 151
    invoke-static {v2, p1, v0}, Lr7/s;->O([B[B[B)[B

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    return-object p1
.end method

.method public W()V
    .locals 1

    .line 1
    const-class v0, Lu7/c;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lu7/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lu7/c;->U()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public X()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/s;->p:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Ly7/a;->j(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final Y()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lr7/r;->m:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v1, p0, Lr7/s;->q:Lr7/u;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v0, v2}, Lr7/u;->Q(Ljava/lang/String;Z)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public Z(Ljava/lang/String;)V
    .locals 6

    .line 1
    const-class v0, Ls7/g;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ls7/g;

    .line 8
    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    const-class v1, Lu7/c;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lu7/c;

    .line 18
    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    iput v2, v0, Ls7/g;->p:I

    .line 23
    .line 24
    iget-boolean v2, v1, Lu7/c;->s:Z

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    iget-object v1, v1, Lu7/c;->r:Lf1/h;

    .line 29
    .line 30
    invoke-virtual {p0}, Lr7/s;->Y()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v3, v1, Lf1/h;->i:Ljava/lang/Object;

    .line 35
    .line 36
    monitor-enter v3

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    :try_start_0
    monitor-exit v3

    .line 42
    goto :goto_2

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    iget-object v4, v1, Lf1/h;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Ljava/util/HashMap;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    iget v4, v1, Lf1/h;->h:I

    .line 52
    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    new-instance v4, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v5, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {v5, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 64
    .line 65
    .line 66
    move-object v4, v5

    .line 67
    :goto_0
    iput-object v4, v1, Lf1/h;->j:Ljava/lang/Object;

    .line 68
    .line 69
    :cond_2
    invoke-interface {v4, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-interface {v4, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v1, p1, v5}, Lf1/h;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v1, p1, p0}, Lf1/h;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-interface {v4, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    monitor-exit v3

    .line 89
    goto :goto_2

    .line 90
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    throw p1

    .line 92
    :cond_3
    :goto_2
    const/4 p1, 0x1

    .line 93
    iput-boolean p1, v0, Ls7/g;->q:Z

    .line 94
    .line 95
    :cond_4
    return-void
.end method

.method public final a0(Lr7/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/s;->p:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ly7/a;->i(Ljava/lang/Object;Lr7/m;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lr7/s;->p:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lr7/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr7/s;->S(Lr7/s;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lr7/s;->Y()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lk7/a;->g:I

    .line 13
    .line 14
    const-string v2, ": NULL"

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lj8/b;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    const-class v1, Lu7/c;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lu7/c;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-boolean v1, v1, Lu7/c;->s:Z

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    iget v2, p0, Lk7/a;->g:I

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, ": USED BY="

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lr7/s;->X()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v2, "{"

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v2, "}"

    .line 63
    .line 64
    invoke-static {v1, v0, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    iget v2, p0, Lk7/a;->g:I

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v2, ":"

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0
.end method
