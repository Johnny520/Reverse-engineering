.class public final Lbf2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p0, p1, Lbf2;

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    const/16 p0, 0x80

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

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
    const-wide/16 v2, 0xa

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/high16 v2, 0x1000000

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lvi0;->d(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/high16 v3, 0x100000

    .line 23
    .line 24
    invoke-static {v3, v0, v1}, Lvi0;->d(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {v2, v0, v1}, Lvi0;->d(III)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/16 v2, 0x8

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Lvi0;->d(III)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const-wide/16 v2, 0x7530

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/16 v2, 0xa

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, Lvi0;->d(III)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-static {p0, v0, v1}, Lvi0;->d(III)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/high16 v2, 0x10000

    .line 55
    .line 56
    invoke-static {v2, v0, v1}, Lvi0;->d(III)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const-wide/32 v2, 0x1000000

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const-wide/32 v4, 0x4000000

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1, v4, v5}, Lhk1;->c(IIJ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const-wide/32 v2, 0x8000000

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    const-wide/32 v2, 0x10000000

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    const-wide/32 v2, 0x40000000

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-static {p0, v0, v1}, Lvi0;->d(III)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    const/16 v0, 0x100

    .line 108
    .line 109
    invoke-static {v0, p0, v1}, Lvi0;->d(III)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    const/16 v0, 0x40

    .line 114
    .line 115
    invoke-static {v0, p0, v1}, Lvi0;->d(III)I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    const/16 v0, 0x10

    .line 120
    .line 121
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    add-int/2addr v0, p0

    .line 126
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "ScriptApiLimits(maxActiveTimers=128, minIntervalMillis=10, maxEncodingInputBytes=16777216, maxRandomBytes=1048576, maxCryptoInputBytes=16777216, maxHttpConcurrency=8, httpTimeoutMillis=30000, maxHttpRedirects=10, maxHttpHeaderCount=128, maxHttpHeaderBytes=65536, maxHttpRequestBytes=16777216, maxHttpResponseBytes=16777216, maxHttpDownloadBytes=67108864, maxFileReadBytes=16777216, maxDataStorageBytes=134217728, maxCacheStorageBytes=268435456, maxExternalStorageBytes=1073741824, maxMessageSegments=128, maxHostObjectReferences=256, maxHostCallArguments=64, maxHostValueDepth=16)"

    .line 2
    .line 3
    return-object p0
.end method
