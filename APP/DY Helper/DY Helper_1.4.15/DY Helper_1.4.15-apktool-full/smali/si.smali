.class public final Lsi;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lpx0;
.implements Ldp1;


# instance fields
.field public final α:Lt6;

.field public final β:Ly9;


# direct methods
.method public constructor <init>(Lt6;Ly9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsi;->α:Lt6;

    .line 5
    .line 6
    iput-object p2, p0, Lsi;->β:Ly9;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lsi;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lsi;

    .line 10
    .line 11
    iget-object v0, p0, Lsi;->α:Lt6;

    .line 12
    .line 13
    iget-object v1, p1, Lsi;->α:Lt6;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object p0, p0, Lsi;->β:Ly9;

    .line 23
    .line 24
    iget-object p1, p1, Lsi;->β:Ly9;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ly9;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lsi;->α:Lt6;

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
    iget-object p0, p0, Lsi;->β:Ly9;

    .line 10
    .line 11
    iget p0, p0, Ly9;->α:F

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
    const-string v1, "ColumnMeasurePolicy(verticalArrangement="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lsi;->α:Lt6;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", horizontalAlignment="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lsi;->β:Ly9;

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
    .locals 6

    .line 1
    new-instance v0, Lri;

    .line 2
    .line 3
    move-object v2, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v4, p2

    .line 6
    move-object v5, p3

    .line 7
    move v3, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lri;-><init>([Lch1;Lsi;ILrx0;[I)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkz;->ε:Lkz;

    .line 12
    .line 13
    invoke-interface {v4, v3, p4, p0, v0}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final β(ILrx0;[I[I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lsi;->α:Lt6;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3, p4}, Lt6;->δ(ILrx0;[I[I)V

    .line 4
    .line 5
    .line 6
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
    invoke-static {p0, p3, p1, p2}, Lzo;->α(IIII)J

    .line 5
    .line 6
    .line 7
    move-result-wide p0

    .line 8
    return-wide p0

    .line 9
    :cond_0
    invoke-static {p0, p3, p1, p2}, Lyh;->Ε(IIII)J

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
    iget p0, p1, Lch1;->ε:I

    .line 2
    .line 3
    return p0
.end method

.method public final ε(Lrx0;Ljava/util/List;J)Lqx0;
    .locals 10

    .line 1
    invoke-static {p3, p4}, Lyo;->ι(J)I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    invoke-static {p3, p4}, Lyo;->κ(J)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-static {p3, p4}, Lyo;->η(J)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-static {p3, p4}, Lyo;->θ(J)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget-object p3, p0, Lsi;->α:Lt6;

    .line 18
    .line 19
    invoke-interface {p3}, Lt6;->β()F

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    invoke-interface {p1, p3}, Lyr;->Ξ(F)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    new-array v8, p3, [Lch1;

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    move-object v0, p0

    .line 38
    move-object v6, p1

    .line 39
    move-object v7, p2

    .line 40
    invoke-static/range {v0 .. v9}, Lv81;->κ(Ldp1;IIIIILrx0;Ljava/util/List;[Lch1;I)Lqx0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public final ζ(Lch1;)I
    .locals 0

    .line 1
    iget p0, p1, Lch1;->ζ:I

    .line 2
    .line 3
    return p0
.end method
