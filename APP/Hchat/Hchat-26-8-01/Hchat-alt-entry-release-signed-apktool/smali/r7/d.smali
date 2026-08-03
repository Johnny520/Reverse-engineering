.class public final Lr7/d;
.super Lr7/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final t:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lr7/s;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput p1, p0, Lr7/d;->t:I

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Lr7/b;->M(IZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final N([B)Ljava/lang/String;
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_5

    .line 4
    :cond_0
    array-length v0, p1

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    goto :goto_5

    .line 9
    :cond_1
    :goto_0
    if-ge v1, v0, :cond_8

    .line 10
    .line 11
    aget-byte v2, p1, v1

    .line 12
    .line 13
    if-eqz v2, :cond_7

    .line 14
    .line 15
    array-length v0, p1

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    move v4, v1

    .line 19
    move v5, v4

    .line 20
    move v3, v2

    .line 21
    :goto_1
    if-ge v3, v0, :cond_5

    .line 22
    .line 23
    add-int/lit8 v6, v3, -0x1

    .line 24
    .line 25
    aget-byte v7, p1, v6

    .line 26
    .line 27
    aget-byte v8, p1, v3

    .line 28
    .line 29
    if-nez v7, :cond_3

    .line 30
    .line 31
    if-nez v8, :cond_3

    .line 32
    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    move v4, v2

    .line 36
    move v5, v3

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    if-ge v5, v6, :cond_4

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move v4, v1

    .line 42
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_5
    if-nez v4, :cond_6

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_6
    :goto_3
    move v0, v5

    .line 49
    :goto_4
    new-instance v2, Ljava/lang/String;

    .line 50
    .line 51
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 52
    .line 53
    invoke-direct {v2, p1, v1, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_8
    :goto_5
    const/4 p1, 0x0

    .line 61
    return-object p1
.end method

.method public final Q(Lq7/b;)I
    .locals 0

    .line 1
    iget p1, p0, Lr7/d;->t:I

    .line 2
    .line 3
    return p1
.end method

.method public final S(Lr7/s;)I
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
    iget-object v0, p0, Lr7/r;->m:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p1, p1, Lr7/r;->m:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, p1}, Ly7/a;->c(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final V(Ljava/lang/String;)[B
    .locals 3

    .line 1
    iget v0, p0, Lr7/d;->t:I

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-array p1, v0, [B

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-array v1, v0, [B

    .line 15
    .line 16
    array-length v2, p1

    .line 17
    if-le v2, v0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v0, v2

    .line 21
    :goto_0
    const/4 v2, 0x0

    .line 22
    invoke-static {p1, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    return-object v1
.end method

.method public final Z(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lr7/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr7/d;->S(Lr7/s;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FIXED-"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lr7/d;->t:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " {"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lr7/r;->m:Ljava/lang/String;

    .line 19
    .line 20
    const-string v2, "}"

    .line 21
    .line 22
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method
