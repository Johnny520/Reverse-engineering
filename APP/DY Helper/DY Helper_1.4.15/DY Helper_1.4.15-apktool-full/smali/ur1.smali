.class public final Lur1;
.super Ldd;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final transient ι:[[B

.field public final transient κ:[I


# direct methods
.method public constructor <init>([[B[I)V
    .locals 1

    .line 1
    sget-object v0, Ldd;->θ:Ldd;

    .line 2
    .line 3
    iget-object v0, v0, Ldd;->ε:[B

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ldd;-><init>([B)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lur1;->ι:[[B

    .line 9
    .line 10
    iput-object p2, p0, Lur1;->κ:[I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Ldd;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Ldd;

    .line 9
    .line 10
    invoke-virtual {p1}, Ldd;->α()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lur1;->α()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lur1;->α()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0, p1, v0}, Lur1;->ζ(Ldd;I)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    :goto_0
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final hashCode()I
    .locals 9

    .line 1
    iget v0, p0, Ldd;->ζ:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    iget-object v0, p0, Lur1;->ι:[[B

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    move v4, v3

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v2, v1, :cond_2

    .line 14
    .line 15
    add-int v5, v1, v2

    .line 16
    .line 17
    iget-object v6, p0, Lur1;->κ:[I

    .line 18
    .line 19
    aget v5, v6, v5

    .line 20
    .line 21
    aget v6, v6, v2

    .line 22
    .line 23
    aget-object v7, v0, v2

    .line 24
    .line 25
    sub-int v3, v6, v3

    .line 26
    .line 27
    add-int/2addr v3, v5

    .line 28
    :goto_1
    if-ge v5, v3, :cond_1

    .line 29
    .line 30
    mul-int/lit8 v4, v4, 0x1f

    .line 31
    .line 32
    aget-byte v8, v7, v5

    .line 33
    .line 34
    add-int/2addr v4, v8

    .line 35
    add-int/lit8 v5, v5, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    move v3, v6

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iput v4, p0, Ldd;->ζ:I

    .line 43
    .line 44
    return v4
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ldd;

    .line 2
    .line 3
    invoke-virtual {p0}, Lur1;->μ()[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Ldd;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ldd;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final α()I
    .locals 1

    .line 1
    iget-object v0, p0, Lur1;->ι:[[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iget-object p0, p0, Lur1;->κ:[I

    .line 7
    .line 8
    aget p0, p0, v0

    .line 9
    .line 10
    return p0
.end method

.method public final β()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ldd;

    .line 2
    .line 3
    invoke-virtual {p0}, Lur1;->μ()[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Ldd;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ldd;->β()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final γ()[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Lur1;->μ()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final δ(I)B
    .locals 9

    .line 1
    iget-object v0, p0, Lur1;->ι:[[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    add-int/lit8 v1, v1, -0x1

    .line 5
    .line 6
    iget-object v2, p0, Lur1;->κ:[I

    .line 7
    .line 8
    aget v1, v2, v1

    .line 9
    .line 10
    int-to-long v3, v1

    .line 11
    int-to-long v5, p1

    .line 12
    const-wide/16 v7, 0x1

    .line 13
    .line 14
    invoke-static/range {v3 .. v8}, Lln0;->μ(JJJ)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p1}, Lkn0;->Ο(Lur1;I)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    add-int/lit8 v1, p0, -0x1

    .line 26
    .line 27
    aget v1, v2, v1

    .line 28
    .line 29
    :goto_0
    array-length v3, v0

    .line 30
    add-int/2addr v3, p0

    .line 31
    aget v2, v2, v3

    .line 32
    .line 33
    aget-object p0, v0, p0

    .line 34
    .line 35
    sub-int/2addr p1, v1

    .line 36
    add-int/2addr p1, v2

    .line 37
    aget-byte p0, p0, p1

    .line 38
    .line 39
    return p0
.end method

.method public final ε(I[BII)Z
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, Lur1;->α()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    sub-int/2addr v1, p4

    .line 12
    if-gt p1, v1, :cond_5

    .line 13
    .line 14
    if-ltz p3, :cond_5

    .line 15
    .line 16
    array-length v1, p2

    .line 17
    sub-int/2addr v1, p4

    .line 18
    if-le p3, v1, :cond_0

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_0
    add-int/2addr p4, p1

    .line 22
    invoke-static {p0, p1}, Lkn0;->Ο(Lur1;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    :goto_0
    if-ge p1, p4, :cond_4

    .line 27
    .line 28
    iget-object v2, p0, Lur1;->κ:[I

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    move v3, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    add-int/lit8 v3, v1, -0x1

    .line 35
    .line 36
    aget v3, v2, v3

    .line 37
    .line 38
    :goto_1
    aget v4, v2, v1

    .line 39
    .line 40
    sub-int/2addr v4, v3

    .line 41
    iget-object v5, p0, Lur1;->ι:[[B

    .line 42
    .line 43
    array-length v6, v5

    .line 44
    add-int/2addr v6, v1

    .line 45
    aget v2, v2, v6

    .line 46
    .line 47
    add-int/2addr v4, v3

    .line 48
    invoke-static {p4, v4}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    sub-int/2addr v4, p1

    .line 53
    sub-int v3, p1, v3

    .line 54
    .line 55
    add-int/2addr v3, v2

    .line 56
    aget-object v2, v5, v1

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move v5, v0

    .line 62
    :goto_2
    if-ge v5, v4, :cond_3

    .line 63
    .line 64
    add-int v6, v5, v3

    .line 65
    .line 66
    aget-byte v6, v2, v6

    .line 67
    .line 68
    add-int v7, v5, p3

    .line 69
    .line 70
    aget-byte v7, p2, v7

    .line 71
    .line 72
    if-eq v6, v7, :cond_2

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    add-int/2addr p3, v4

    .line 79
    add-int/2addr p1, v4

    .line 80
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    const/4 p0, 0x1

    .line 84
    return p0

    .line 85
    :cond_5
    :goto_3
    return v0
.end method

.method public final ζ(Ldd;I)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lur1;->α()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sub-int/2addr v0, p2

    .line 9
    const/4 v1, 0x0

    .line 10
    if-gez v0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-static {p0, v1}, Lkn0;->Ο(Lur1;I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    move v2, v1

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v2, p2, :cond_3

    .line 20
    .line 21
    iget-object v4, p0, Lur1;->κ:[I

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    move v5, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    add-int/lit8 v5, v0, -0x1

    .line 28
    .line 29
    aget v5, v4, v5

    .line 30
    .line 31
    :goto_1
    aget v6, v4, v0

    .line 32
    .line 33
    sub-int/2addr v6, v5

    .line 34
    iget-object v7, p0, Lur1;->ι:[[B

    .line 35
    .line 36
    array-length v8, v7

    .line 37
    add-int/2addr v8, v0

    .line 38
    aget v4, v4, v8

    .line 39
    .line 40
    add-int/2addr v6, v5

    .line 41
    invoke-static {p2, v6}, Ljava/lang/Math;->min(II)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    sub-int/2addr v6, v2

    .line 46
    sub-int v5, v2, v5

    .line 47
    .line 48
    add-int/2addr v5, v4

    .line 49
    aget-object v4, v7, v0

    .line 50
    .line 51
    invoke-virtual {p1, v3, v4, v5, v6}, Ldd;->ε(I[BII)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    :goto_2
    return v1

    .line 58
    :cond_2
    add-int/2addr v3, v6

    .line 59
    add-int/2addr v2, v6

    .line 60
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    const/4 p0, 0x1

    .line 64
    return p0
.end method

.method public final η(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldd;

    .line 5
    .line 6
    invoke-virtual {p0}, Lur1;->μ()[B

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-direct {v0, p0}, Ldd;-><init>([B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ldd;->η(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final θ(II)Ldd;
    .locals 10

    .line 1
    const v0, -0x499602d2

    .line 2
    .line 3
    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lur1;->α()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    :cond_0
    if-ltz p1, :cond_7

    .line 11
    .line 12
    invoke-virtual {p0}, Lur1;->α()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const-string v1, "endIndex="

    .line 17
    .line 18
    if-gt p2, v0, :cond_6

    .line 19
    .line 20
    sub-int v0, p2, p1

    .line 21
    .line 22
    if-ltz v0, :cond_5

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lur1;->α()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne p2, v1, :cond_1

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    if-ne p1, p2, :cond_2

    .line 34
    .line 35
    sget-object p0, Ldd;->θ:Ldd;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    invoke-static {p0, p1}, Lkn0;->Ο(Lur1;I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/lit8 p2, p2, -0x1

    .line 43
    .line 44
    invoke-static {p0, p2}, Lkn0;->Ο(Lur1;I)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    add-int/lit8 v2, p2, 0x1

    .line 49
    .line 50
    iget-object v3, p0, Lur1;->ι:[[B

    .line 51
    .line 52
    invoke-static {v3, v1, v2}, Lg7;->Σ([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, [[B

    .line 57
    .line 58
    array-length v4, v2

    .line 59
    mul-int/lit8 v4, v4, 0x2

    .line 60
    .line 61
    new-array v4, v4, [I

    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    iget-object p0, p0, Lur1;->κ:[I

    .line 65
    .line 66
    if-gt v1, p2, :cond_3

    .line 67
    .line 68
    move v7, v1

    .line 69
    move v6, v5

    .line 70
    :goto_0
    aget v8, p0, v7

    .line 71
    .line 72
    sub-int/2addr v8, p1

    .line 73
    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    aput v8, v4, v6

    .line 78
    .line 79
    add-int/lit8 v8, v6, 0x1

    .line 80
    .line 81
    array-length v9, v2

    .line 82
    add-int/2addr v6, v9

    .line 83
    array-length v9, v3

    .line 84
    add-int/2addr v9, v7

    .line 85
    aget v9, p0, v9

    .line 86
    .line 87
    aput v9, v4, v6

    .line 88
    .line 89
    if-eq v7, p2, :cond_3

    .line 90
    .line 91
    add-int/lit8 v7, v7, 0x1

    .line 92
    .line 93
    move v6, v8

    .line 94
    goto :goto_0

    .line 95
    :cond_3
    if-nez v1, :cond_4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    add-int/lit8 v1, v1, -0x1

    .line 99
    .line 100
    aget v5, p0, v1

    .line 101
    .line 102
    :goto_1
    array-length p0, v2

    .line 103
    aget p2, v4, p0

    .line 104
    .line 105
    sub-int/2addr p1, v5

    .line 106
    add-int/2addr p1, p2

    .line 107
    aput p1, v4, p0

    .line 108
    .line 109
    new-instance p0, Lur1;

    .line 110
    .line 111
    invoke-direct {p0, v2, v4}, Lur1;-><init>([[B[I)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_5
    const-string p0, " < beginIndex="

    .line 116
    .line 117
    invoke-static {p2, p1, v1, p0}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    return-object p0

    .line 126
    :cond_6
    const-string p1, " > length("

    .line 127
    .line 128
    invoke-static {p2, v1, p1}, La12;->ζ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p0}, Lur1;->α()I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const/16 p0, 0x29

    .line 140
    .line 141
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p1

    .line 158
    :cond_7
    const-string p0, "beginIndex="

    .line 159
    .line 160
    const-string p2, " < 0"

    .line 161
    .line 162
    invoke-static {p0, p1, p2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    const/4 p0, 0x0

    .line 170
    return-object p0
.end method

.method public final ι()Ldd;
    .locals 1

    .line 1
    new-instance v0, Ldd;

    .line 2
    .line 3
    invoke-virtual {p0}, Lur1;->μ()[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Ldd;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ldd;->ι()Ldd;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final λ(Lsc;I)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lkn0;->Ο(Lur1;I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    move v2, v0

    .line 7
    :goto_0
    if-ge v2, p2, :cond_2

    .line 8
    .line 9
    iget-object v3, p0, Lur1;->κ:[I

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    move v4, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    add-int/lit8 v4, v1, -0x1

    .line 16
    .line 17
    aget v4, v3, v4

    .line 18
    .line 19
    :goto_1
    aget v5, v3, v1

    .line 20
    .line 21
    sub-int/2addr v5, v4

    .line 22
    iget-object v6, p0, Lur1;->ι:[[B

    .line 23
    .line 24
    array-length v7, v6

    .line 25
    add-int/2addr v7, v1

    .line 26
    aget v3, v3, v7

    .line 27
    .line 28
    add-int/2addr v5, v4

    .line 29
    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    sub-int/2addr v5, v2

    .line 34
    sub-int v4, v2, v4

    .line 35
    .line 36
    add-int/2addr v4, v3

    .line 37
    aget-object v3, v6, v1

    .line 38
    .line 39
    new-instance v6, Lrr1;

    .line 40
    .line 41
    add-int v7, v4, v5

    .line 42
    .line 43
    const/4 v8, 0x1

    .line 44
    invoke-direct {v6, v3, v4, v7, v8}, Lrr1;-><init>([BIIZ)V

    .line 45
    .line 46
    .line 47
    iget-object v3, p1, Lsc;->ε:Lrr1;

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    iput-object v6, v6, Lrr1;->η:Lrr1;

    .line 52
    .line 53
    iput-object v6, v6, Lrr1;->ζ:Lrr1;

    .line 54
    .line 55
    iput-object v6, p1, Lsc;->ε:Lrr1;

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    iget-object v3, v3, Lrr1;->η:Lrr1;

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v6}, Lrr1;->β(Lrr1;)V

    .line 64
    .line 65
    .line 66
    :goto_2
    add-int/2addr v2, v5

    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-wide v0, p1, Lsc;->ζ:J

    .line 71
    .line 72
    int-to-long v2, p2

    .line 73
    add-long/2addr v0, v2

    .line 74
    iput-wide v0, p1, Lsc;->ζ:J

    .line 75
    .line 76
    return-void
.end method

.method public final μ()[B
    .locals 10

    .line 1
    invoke-virtual {p0}, Lur1;->α()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    iget-object v1, p0, Lur1;->ι:[[B

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    const/4 v3, 0x0

    .line 11
    move v4, v3

    .line 12
    move v5, v4

    .line 13
    :goto_0
    if-ge v3, v2, :cond_0

    .line 14
    .line 15
    add-int v6, v2, v3

    .line 16
    .line 17
    iget-object v7, p0, Lur1;->κ:[I

    .line 18
    .line 19
    aget v6, v7, v6

    .line 20
    .line 21
    aget v7, v7, v3

    .line 22
    .line 23
    aget-object v8, v1, v3

    .line 24
    .line 25
    sub-int v4, v7, v4

    .line 26
    .line 27
    add-int v9, v6, v4

    .line 28
    .line 29
    invoke-static {v8, v0, v5, v6, v9}, Lg7;->Μ([B[BIII)V

    .line 30
    .line 31
    .line 32
    add-int/2addr v5, v4

    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    move v4, v7

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-object v0
.end method
