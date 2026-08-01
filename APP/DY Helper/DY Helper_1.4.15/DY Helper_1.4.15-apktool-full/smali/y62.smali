.class public final Ly62;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lqp0;


# instance fields
.field public τ:F

.field public υ:F


# virtual methods
.method public final Φ(Ldw0;Lkx0;J)Lqx0;
    .locals 4

    .line 1
    iget v0, p0, Ly62;->τ:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    invoke-static {p3, p4}, Lyo;->κ(J)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget v0, p0, Ly62;->τ:F

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lyr;->Ξ(F)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {p3, p4}, Lyo;->θ(J)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-gez v0, :cond_0

    .line 27
    .line 28
    move v0, v1

    .line 29
    :cond_0
    if-le v0, v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v2, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p3, p4}, Lyo;->κ(J)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    :goto_0
    invoke-static {p3, p4}, Lyo;->θ(J)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget v3, p0, Ly62;->υ:F

    .line 43
    .line 44
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_5

    .line 49
    .line 50
    invoke-static {p3, p4}, Lyo;->ι(J)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_5

    .line 55
    .line 56
    iget p0, p0, Ly62;->υ:F

    .line 57
    .line 58
    invoke-interface {p1, p0}, Lyr;->Ξ(F)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-static {p3, p4}, Lyo;->η(J)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-gez p0, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move v1, p0

    .line 70
    :goto_1
    if-le v1, v3, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move v3, v1

    .line 74
    goto :goto_2

    .line 75
    :cond_5
    invoke-static {p3, p4}, Lyo;->ι(J)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    :goto_2
    invoke-static {p3, p4}, Lyo;->η(J)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    invoke-static {v2, v0, v3, p0}, Lzo;->α(IIII)J

    .line 84
    .line 85
    .line 86
    move-result-wide p3

    .line 87
    invoke-interface {p2, p3, p4}, Lkx0;->ζ(J)Lch1;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iget p2, p0, Lch1;->ε:I

    .line 92
    .line 93
    iget p3, p0, Lch1;->ζ:I

    .line 94
    .line 95
    new-instance p4, Lv30;

    .line 96
    .line 97
    const/4 v0, 0x3

    .line 98
    invoke-direct {p4, p0, v0}, Lv30;-><init>(Lch1;I)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkz;->ε:Lkz;

    .line 102
    .line 103
    invoke-interface {p1, p2, p3, p0, p4}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method
