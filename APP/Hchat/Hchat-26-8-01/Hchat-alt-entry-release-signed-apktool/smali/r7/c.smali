.class public Lr7/c;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lr7/g;


# instance fields
.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lr7/c;->m:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lr7/b;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static N([B[B)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    array-length v0, p0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    array-length p0, p1

    .line 9
    if-nez p0, :cond_4

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_1
    array-length v0, p1

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_2
    array-length v0, p0

    .line 17
    array-length v2, p1

    .line 18
    if-eq v0, v2, :cond_3

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_3
    move v0, v1

    .line 22
    :goto_0
    array-length v2, p0

    .line 23
    if-ge v0, v2, :cond_6

    .line 24
    .line 25
    aget-byte v2, p0, v0

    .line 26
    .line 27
    aget-byte v3, p1, v0

    .line 28
    .line 29
    if-eq v2, v3, :cond_5

    .line 30
    .line 31
    :cond_4
    :goto_1
    return v1

    .line 32
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_6
    :goto_2
    const/4 p0, 0x1

    .line 36
    return p0
.end method

.method public static R([B)[B
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    new-array p0, v0, [B

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    move v1, v0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    array-length v3, p0

    .line 10
    if-ge v1, v3, :cond_2

    .line 11
    .line 12
    aget-byte v3, p0, v1

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    add-int/lit8 v2, v1, 0x1

    .line 17
    .line 18
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    new-array v1, v2, [B

    .line 22
    .line 23
    if-lez v2, :cond_3

    .line 24
    .line 25
    invoke-static {p0, v0, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    :cond_3
    return-object v1
.end method


# virtual methods
.method public O(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x4

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    if-le v1, v2, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return p1

    .line 10
    :cond_0
    aget-byte v1, v0, p1

    .line 11
    .line 12
    and-int/lit16 v1, v1, 0xff

    .line 13
    .line 14
    add-int/lit8 v2, p1, 0x1

    .line 15
    .line 16
    aget-byte v2, v0, v2

    .line 17
    .line 18
    and-int/lit16 v2, v2, 0xff

    .line 19
    .line 20
    shl-int/lit8 v2, v2, 0x8

    .line 21
    .line 22
    or-int/2addr v1, v2

    .line 23
    add-int/lit8 v2, p1, 0x2

    .line 24
    .line 25
    aget-byte v2, v0, v2

    .line 26
    .line 27
    and-int/lit16 v2, v2, 0xff

    .line 28
    .line 29
    shl-int/lit8 v2, v2, 0x10

    .line 30
    .line 31
    or-int/2addr v1, v2

    .line 32
    add-int/lit8 p1, p1, 0x3

    .line 33
    .line 34
    aget-byte p1, v0, p1

    .line 35
    .line 36
    and-int/lit16 p1, p1, 0xff

    .line 37
    .line 38
    shl-int/lit8 p1, p1, 0x18

    .line 39
    .line 40
    or-int/2addr p1, v1

    .line 41
    return p1
.end method

.method public P(B)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput-byte p1, v0, v1

    .line 5
    .line 6
    return-void
.end method

.method public Q(I)V
    .locals 1

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    :cond_0
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, p1, v0}, Lr7/b;->M(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public get()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-byte v0, v0, v1

    .line 5
    .line 6
    and-int/lit16 v0, v0, 0xff

    .line 7
    .line 8
    return v0
.end method

.method public k(I)V
    .locals 0

    .line 1
    int-to-byte p1, p1

    .line 2
    invoke-virtual {p0, p1}, Lr7/c;->P(B)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lr7/c;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr7/b;->k:[B

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v1, "size="

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lr7/b;->k:[B

    .line 24
    .line 25
    array-length v1, v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
