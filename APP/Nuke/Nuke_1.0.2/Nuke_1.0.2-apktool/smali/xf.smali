.class public final Lxf;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lwf;
.implements Lyf;


# instance fields
.field public final h:F

.field public final i:Ls;

.field public final j:F


# direct methods
.method public constructor <init>(FLs;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lxf;->h:F

    .line 5
    .line 6
    iput-object p2, p0, Lxf;->i:Ls;

    .line 7
    .line 8
    iput p1, p0, Lxf;->j:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b()F
    .locals 0

    .line 1
    iget p0, p0, Lxf;->j:F

    .line 2
    .line 3
    return p0
.end method

.method public final e(Lpf1;I[ILd61;[I)V
    .locals 9

    .line 1
    array-length v0, p3

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_8

    .line 5
    .line 6
    :cond_0
    iget v0, p0, Lxf;->h:F

    .line 7
    .line 8
    invoke-interface {p1, v0}, Le70;->T(F)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    sget-object v0, Ld61;->i:Ld61;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-ne p4, v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v0, v1

    .line 20
    :goto_0
    if-eqz v0, :cond_3

    .line 21
    .line 22
    array-length v2, p3

    .line 23
    move v3, v1

    .line 24
    move v4, v3

    .line 25
    move v5, v4

    .line 26
    :goto_1
    if-ge v3, v2, :cond_2

    .line 27
    .line 28
    aget v4, p3, v3

    .line 29
    .line 30
    add-int/lit8 v6, v5, 0x1

    .line 31
    .line 32
    sub-int/2addr p2, v4

    .line 33
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    aput p2, p5, v5

    .line 38
    .line 39
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    aget p2, p5, v5

    .line 44
    .line 45
    sub-int/2addr p2, v4

    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    move v5, v6

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    add-int/2addr p2, v4

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    array-length v2, p3

    .line 53
    move v3, v1

    .line 54
    move v4, v3

    .line 55
    move v5, v4

    .line 56
    move v6, v5

    .line 57
    :goto_2
    if-ge v3, v2, :cond_4

    .line 58
    .line 59
    aget v5, p3, v3

    .line 60
    .line 61
    add-int/lit8 v7, v6, 0x1

    .line 62
    .line 63
    sub-int v8, p2, v5

    .line 64
    .line 65
    invoke-static {v4, v8}, Ljava/lang/Math;->min(II)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    aput v4, p5, v6

    .line 70
    .line 71
    sub-int v4, p2, v4

    .line 72
    .line 73
    sub-int/2addr v4, v5

    .line 74
    invoke-static {p1, v4}, Ljava/lang/Math;->min(II)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    aget v6, p5, v6

    .line 79
    .line 80
    add-int/2addr v6, v5

    .line 81
    add-int v5, v6, v4

    .line 82
    .line 83
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    move v6, v5

    .line 86
    move v5, v4

    .line 87
    move v4, v6

    .line 88
    move v6, v7

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    sub-int/2addr v4, v5

    .line 91
    sub-int/2addr p2, v4

    .line 92
    :goto_3
    if-lez p2, :cond_8

    .line 93
    .line 94
    iget-object p0, p0, Lxf;->i:Ls;

    .line 95
    .line 96
    iget p0, p0, Ls;->h:I

    .line 97
    .line 98
    const/high16 p1, -0x40800000    # -1.0f

    .line 99
    .line 100
    sget-object p3, Ld61;->h:Ld61;

    .line 101
    .line 102
    const/high16 v2, 0x40000000    # 2.0f

    .line 103
    .line 104
    const/high16 v3, 0x3f800000    # 1.0f

    .line 105
    .line 106
    packed-switch p0, :pswitch_data_0

    .line 107
    .line 108
    .line 109
    int-to-float p0, p2

    .line 110
    div-float/2addr p0, v2

    .line 111
    if-ne p4, p3, :cond_5

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_5
    move p1, v3

    .line 115
    :goto_4
    add-float/2addr v3, p1

    .line 116
    mul-float/2addr v3, p0

    .line 117
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    goto :goto_6

    .line 122
    :pswitch_0
    add-int/lit8 p0, p2, 0x0

    .line 123
    .line 124
    int-to-float p0, p0

    .line 125
    div-float/2addr p0, v2

    .line 126
    if-ne p4, p3, :cond_6

    .line 127
    .line 128
    move p1, v3

    .line 129
    goto :goto_5

    .line 130
    :cond_6
    mul-float/2addr p1, v3

    .line 131
    :goto_5
    add-float/2addr v3, p1

    .line 132
    mul-float/2addr v3, p0

    .line 133
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    :goto_6
    if-eqz v0, :cond_7

    .line 138
    .line 139
    sub-int/2addr p0, p2

    .line 140
    :cond_7
    if-eqz p0, :cond_8

    .line 141
    .line 142
    array-length p1, p5

    .line 143
    :goto_7
    if-ge v1, p1, :cond_8

    .line 144
    .line 145
    aget p2, p5, v1

    .line 146
    .line 147
    add-int/2addr p2, p0

    .line 148
    aput p2, p5, v1

    .line 149
    .line 150
    add-int/lit8 v1, v1, 0x1

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_8
    :goto_8
    return-void

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lxf;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lxf;

    .line 10
    .line 11
    iget v0, p0, Lxf;->h:F

    .line 12
    .line 13
    iget v1, p1, Lxf;->h:F

    .line 14
    .line 15
    invoke-static {v0, v1}, Lza0;->b(FF)Z

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
    iget-object p0, p0, Lxf;->i:Ls;

    .line 23
    .line 24
    iget-object p1, p1, Lxf;->i:Ls;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

.method public final f(ILpf1;[I[I)V
    .locals 6

    .line 1
    sget-object v4, Ld61;->h:Ld61;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move v2, p1

    .line 5
    move-object v1, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-virtual/range {v0 .. v5}, Lxf;->e(Lpf1;I[ILd61;[I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lxf;->h:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object p0, p0, Lxf;->i:Ls;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    add-int/2addr p0, v0

    .line 22
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Arrangement#spacedAligned("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lxf;->h:F

    .line 9
    .line 10
    invoke-static {v1}, Lza0;->c(F)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lxf;->i:Ls;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 p0, 0x29

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
