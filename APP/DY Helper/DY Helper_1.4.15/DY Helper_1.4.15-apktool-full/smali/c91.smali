.class public final Lc91;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lqp0;


# instance fields
.field public τ:F

.field public υ:F

.field public φ:F

.field public χ:F

.field public ψ:Z


# virtual methods
.method public final Φ(Ldw0;Lkx0;J)Lqx0;
    .locals 9

    .line 1
    iget v0, p0, Lc91;->τ:F

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lyr;->Ξ(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lc91;->φ:F

    .line 8
    .line 9
    invoke-interface {p1, v1}, Lyr;->Ξ(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    iget v0, p0, Lc91;->υ:F

    .line 15
    .line 16
    invoke-interface {p1, v0}, Lyr;->Ξ(F)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v2, p0, Lc91;->χ:F

    .line 21
    .line 22
    invoke-interface {p1, v2}, Lyr;->Ξ(F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v2, v0

    .line 27
    neg-int v0, v1

    .line 28
    neg-int v3, v2

    .line 29
    invoke-static {p3, p4}, Lyo;->κ(J)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    add-int/2addr v4, v0

    .line 34
    const/4 v5, 0x0

    .line 35
    if-gez v4, :cond_0

    .line 36
    .line 37
    move v4, v5

    .line 38
    :cond_0
    invoke-static {p3, p4}, Lyo;->θ(J)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const v7, 0x7fffffff

    .line 43
    .line 44
    .line 45
    if-ne v6, v7, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    add-int/2addr v6, v0

    .line 49
    if-gez v6, :cond_2

    .line 50
    .line 51
    move v6, v5

    .line 52
    :cond_2
    :goto_0
    invoke-static {p3, p4}, Lyo;->ι(J)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    add-int/2addr v0, v3

    .line 57
    if-gez v0, :cond_3

    .line 58
    .line 59
    move v0, v5

    .line 60
    :cond_3
    invoke-static {p3, p4}, Lyo;->η(J)I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-ne v8, v7, :cond_5

    .line 65
    .line 66
    :cond_4
    move v5, v8

    .line 67
    goto :goto_1

    .line 68
    :cond_5
    add-int/2addr v8, v3

    .line 69
    if-gez v8, :cond_4

    .line 70
    .line 71
    :goto_1
    invoke-static {v4, v6, v0, v5}, Lzo;->α(IIII)J

    .line 72
    .line 73
    .line 74
    move-result-wide v3

    .line 75
    invoke-interface {p2, v3, v4}, Lkx0;->ζ(J)Lch1;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iget v0, p2, Lch1;->ε:I

    .line 80
    .line 81
    add-int/2addr v0, v1

    .line 82
    invoke-static {v0, p3, p4}, Lzo;->ζ(IJ)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget v1, p2, Lch1;->ζ:I

    .line 87
    .line 88
    add-int/2addr v1, v2

    .line 89
    invoke-static {v1, p3, p4}, Lzo;->ε(IJ)I

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    new-instance p4, Lwa;

    .line 94
    .line 95
    const/16 v1, 0x18

    .line 96
    .line 97
    invoke-direct {p4, p0, v1, p2}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkz;->ε:Lkz;

    .line 101
    .line 102
    invoke-interface {p1, v0, p3, p0, p4}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0
.end method
