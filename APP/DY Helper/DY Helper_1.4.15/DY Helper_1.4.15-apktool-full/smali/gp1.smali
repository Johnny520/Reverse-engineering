.class public final Lgp1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lpx0;
.implements Ldp1;


# instance fields
.field public final α:Lz9;


# direct methods
.method public constructor <init>(Lz9;)V
    .locals 1

    .line 1
    sget-object v0, Lu6;->α:Li2;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lgp1;->α:Lz9;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lgp1;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lgp1;

    .line 10
    .line 11
    sget-object v0, Lu6;->α:Li2;

    .line 12
    .line 13
    invoke-virtual {v0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-object p0, p0, Lgp1;->α:Lz9;

    .line 21
    .line 22
    iget-object p1, p1, Lgp1;->α:Lz9;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lz9;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_3

    .line 29
    .line 30
    :goto_0
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    sget-object v0, Lu6;->α:Li2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lgp1;->α:Lz9;

    .line 10
    .line 11
    iget p0, p0, Lz9;->α:F

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "RowMeasurePolicy(horizontalArrangement="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lu6;->α:Li2;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", verticalAlignment="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lgp1;->α:Lz9;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 p0, 0x29

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final α([Lch1;Lrx0;[III)Lqx0;
    .locals 1

    .line 1
    new-instance v0, Lds;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0, p5, p3}, Lds;-><init>([Lch1;Lgp1;I[I)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkz;->ε:Lkz;

    .line 7
    .line 8
    invoke-interface {p2, p4, p5, p0, v0}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final β(ILrx0;[I[I)V
    .locals 2

    .line 1
    sget-object p0, Lu6;->α:Li2;

    .line 2
    .line 3
    invoke-interface {p2}, Lrx0;->getLayoutDirection()Lnp0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p2, Lnp0;->ε:Lnp0;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-ne p0, p2, :cond_0

    .line 11
    .line 12
    invoke-static {p3, p4, v0}, Lu6;->β([I[IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    array-length p0, p3

    .line 17
    move p2, v0

    .line 18
    :goto_0
    if-ge v0, p0, :cond_1

    .line 19
    .line 20
    aget v1, p3, v0

    .line 21
    .line 22
    add-int/2addr p2, v1

    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    sub-int/2addr p1, p2

    .line 27
    array-length p0, p3

    .line 28
    add-int/lit8 p0, p0, -0x1

    .line 29
    .line 30
    :goto_1
    const/4 p2, -0x1

    .line 31
    if-ge p2, p0, :cond_2

    .line 32
    .line 33
    aget p2, p3, p0

    .line 34
    .line 35
    aput p1, p4, p0

    .line 36
    .line 37
    add-int/2addr p1, p2

    .line 38
    add-int/lit8 p0, p0, -0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    return-void
.end method

.method public final γ(IIIZ)J
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    if-nez p4, :cond_0

    .line 3
    .line 4
    invoke-static {p1, p2, p0, p3}, Lzo;->α(IIII)J

    .line 5
    .line 6
    .line 7
    move-result-wide p0

    .line 8
    return-wide p0

    .line 9
    :cond_0
    invoke-static {p1, p2, p0, p3}, Lyh;->Ζ(IIII)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    return-wide p0
.end method

.method public final δ(Lch1;)I
    .locals 0

    .line 1
    iget p0, p1, Lch1;->ζ:I

    .line 2
    .line 3
    return p0
.end method

.method public final ε(Lrx0;Ljava/util/List;J)Lqx0;
    .locals 10

    .line 1
    invoke-static {p3, p4}, Lyo;->κ(J)I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    invoke-static {p3, p4}, Lyo;->ι(J)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-static {p3, p4}, Lyo;->θ(J)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-static {p3, p4}, Lyo;->η(J)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    sget-object p3, Lu6;->α:Li2;

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    int-to-float p3, p3

    .line 21
    invoke-interface {p1, p3}, Lyr;->Ξ(F)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    new-array v8, p3, [Lch1;

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    move-object v0, p0

    .line 36
    move-object v6, p1

    .line 37
    move-object v7, p2

    .line 38
    invoke-static/range {v0 .. v9}, Lv81;->κ(Ldp1;IIIIILrx0;Ljava/util/List;[Lch1;I)Lqx0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public final ζ(Lch1;)I
    .locals 0

    .line 1
    iget p0, p1, Lch1;->ε:I

    .line 2
    .line 3
    return p0
.end method
