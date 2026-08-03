.class public abstract Lk7/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:I

.field public h:Lk7/a;

.field public i:Z

.field public j:Lk7/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lk7/a;->g:I

    .line 6
    .line 7
    return-void
.end method

.method public static D([BII)V
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x4

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    add-int/lit8 v0, p1, 0x3

    .line 8
    .line 9
    ushr-int/lit8 v1, p2, 0x18

    .line 10
    .line 11
    and-int/lit16 v1, v1, 0xff

    .line 12
    .line 13
    int-to-byte v1, v1

    .line 14
    aput-byte v1, p0, v0

    .line 15
    .line 16
    add-int/lit8 v0, p1, 0x2

    .line 17
    .line 18
    ushr-int/lit8 v1, p2, 0x10

    .line 19
    .line 20
    and-int/lit16 v1, v1, 0xff

    .line 21
    .line 22
    int-to-byte v1, v1

    .line 23
    aput-byte v1, p0, v0

    .line 24
    .line 25
    add-int/lit8 v0, p1, 0x1

    .line 26
    .line 27
    ushr-int/lit8 v1, p2, 0x8

    .line 28
    .line 29
    and-int/lit16 v1, v1, 0xff

    .line 30
    .line 31
    int-to-byte v1, v1

    .line 32
    aput-byte v1, p0, v0

    .line 33
    .line 34
    and-int/lit16 p2, p2, 0xff

    .line 35
    .line 36
    int-to-byte p2, p2

    .line 37
    aput-byte p2, p0, p1

    .line 38
    .line 39
    return-void
.end method

.method public static E([BII)V
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    ushr-int/lit8 v1, p2, 0x8

    .line 4
    .line 5
    and-int/lit16 v1, v1, 0xff

    .line 6
    .line 7
    int-to-byte v1, v1

    .line 8
    aput-byte v1, p0, v0

    .line 9
    .line 10
    and-int/lit16 p2, p2, 0xff

    .line 11
    .line 12
    int-to-byte p2, p2

    .line 13
    aput-byte p2, p0, p1

    .line 14
    .line 15
    return-void
.end method

.method public static F([BIS)V
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    ushr-int/lit8 v1, p2, 0x8

    .line 4
    .line 5
    and-int/lit16 v1, v1, 0xff

    .line 6
    .line 7
    int-to-byte v1, v1

    .line 8
    aput-byte v1, p0, v0

    .line 9
    .line 10
    and-int/lit16 p2, p2, 0xff

    .line 11
    .line 12
    int-to-byte p2, p2

    .line 13
    aput-byte p2, p0, p1

    .line 14
    .line 15
    return-void
.end method

.method public static o([B[B)[B
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    array-length v2, p0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v2, v1

    .line 10
    goto :goto_1

    .line 11
    :cond_1
    :goto_0
    move v2, v0

    .line 12
    :goto_1
    if-eqz p1, :cond_3

    .line 13
    .line 14
    array-length v3, p1

    .line 15
    if-nez v3, :cond_2

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_2
    move v0, v1

    .line 19
    :cond_3
    :goto_2
    if-eqz v2, :cond_4

    .line 20
    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_4
    if-eqz v2, :cond_5

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_5
    if-eqz v0, :cond_6

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_6
    array-length v0, p0

    .line 32
    array-length v2, p1

    .line 33
    add-int/2addr v0, v2

    .line 34
    new-array v0, v0, [B

    .line 35
    .line 36
    array-length v2, p0

    .line 37
    invoke-static {p0, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    array-length p0, p1

    .line 41
    invoke-static {p1, v1, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public static q([BII)Z
    .locals 0

    .line 1
    aget-byte p0, p0, p1

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    shr-int/2addr p0, p2

    .line 6
    const/4 p1, 0x1

    .line 7
    and-int/2addr p0, p1

    .line 8
    if-ne p0, p1, :cond_0

    .line 9
    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static s([BI)I
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x4

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_0
    aget-byte v0, p0, p1

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xff

    .line 11
    .line 12
    add-int/lit8 v1, p1, 0x1

    .line 13
    .line 14
    aget-byte v1, p0, v1

    .line 15
    .line 16
    and-int/lit16 v1, v1, 0xff

    .line 17
    .line 18
    shl-int/lit8 v1, v1, 0x8

    .line 19
    .line 20
    or-int/2addr v0, v1

    .line 21
    add-int/lit8 v1, p1, 0x2

    .line 22
    .line 23
    aget-byte v1, p0, v1

    .line 24
    .line 25
    and-int/lit16 v1, v1, 0xff

    .line 26
    .line 27
    shl-int/lit8 v1, v1, 0x10

    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    add-int/lit8 p1, p1, 0x3

    .line 31
    .line 32
    aget-byte p0, p0, p1

    .line 33
    .line 34
    and-int/lit16 p0, p0, 0xff

    .line 35
    .line 36
    shl-int/lit8 p0, p0, 0x18

    .line 37
    .line 38
    or-int/2addr p0, v0

    .line 39
    return p0
.end method

.method public static t([BI)J
    .locals 5

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    if-le v0, v1, :cond_0

    .line 7
    .line 8
    return-wide v2

    .line 9
    :cond_0
    add-int/lit8 v0, p1, 0x7

    .line 10
    .line 11
    :goto_0
    if-lt v0, p1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    shl-long v1, v2, v1

    .line 16
    .line 17
    aget-byte v3, p0, v0

    .line 18
    .line 19
    and-int/lit16 v3, v3, 0xff

    .line 20
    .line 21
    int-to-long v3, v3

    .line 22
    or-long v2, v1, v3

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-wide v2
.end method

.method public static w([BI)S
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_0
    aget-byte v0, p0, p1

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xff

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    aget-byte p0, p0, p1

    .line 15
    .line 16
    and-int/lit16 p0, p0, 0xff

    .line 17
    .line 18
    shl-int/lit8 p0, p0, 0x8

    .line 19
    .line 20
    or-int/2addr p0, v0

    .line 21
    int-to-short p0, p0

    .line 22
    return p0
.end method

.method public static x([BI)I
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_0
    aget-byte v0, p0, p1

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xff

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    aget-byte p0, p0, p1

    .line 15
    .line 16
    and-int/lit16 p0, p0, 0xff

    .line 17
    .line 18
    shl-int/lit8 p0, p0, 0x8

    .line 19
    .line 20
    or-int/2addr p0, v0

    .line 21
    return p0
.end method


# virtual methods
.method public A(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public B(Lq7/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract C(Ljava/io/ByteArrayOutputStream;)I
.end method

.method public final G(Lq7/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk7/a;->B(Lq7/b;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lk7/a;->j:Lk7/a;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lq7/a;->m(Lk7/a;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final H(I)V
    .locals 2

    .line 1
    iget v0, p0, Lk7/a;->g:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lk7/a;->g:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    if-eq p1, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lk7/a;->A(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    :goto_0
    return-void
.end method

.method public I(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk7/a;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method public final J(Lk7/a;)V
    .locals 0

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iput-object p1, p0, Lk7/a;->h:Lk7/a;

    .line 5
    .line 6
    return-void
.end method

.method public final K(Ljava/io/ByteArrayOutputStream;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk7/a;->y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lk7/a;->C(Ljava/io/ByteArrayOutputStream;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public d(Ljava/lang/Class;)Lk7/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract p()I
.end method

.method public abstract r()[B
.end method

.method public final u(Ljava/lang/Class;)Lk7/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/a;->h:Lk7/a;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v1, p1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, v0, Lk7/a;->h:Lk7/a;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 p1, 0x0

    .line 16
    return-object p1
.end method

.method public final v(Ljava/lang/Class;)Lk7/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/a;->h:Lk7/a;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, v0, Lk7/a;->h:Lk7/a;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 p1, 0x0

    .line 16
    return-object p1
.end method

.method public y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk7/a;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public abstract z(Lf6/b;)V
.end method
