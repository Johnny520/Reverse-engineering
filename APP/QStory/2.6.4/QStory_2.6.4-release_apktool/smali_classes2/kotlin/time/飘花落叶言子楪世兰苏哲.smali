.class public final Lkotlin/time/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static 飘花落叶言子楪世苏哲兰(IJ)Lkotlin/time/Instant;
    .locals 12

    .line 1
    int-to-long v0, p0

    .line 2
    const-wide/32 v2, 0x3b9aca00

    .line 3
    .line 4
    .line 5
    div-long v4, v0, v2

    .line 6
    .line 7
    xor-long v6, v0, v2

    .line 8
    .line 9
    const-wide/16 v8, 0x0

    .line 10
    .line 11
    cmp-long p0, v6, v8

    .line 12
    .line 13
    if-gez p0, :cond_0

    .line 14
    .line 15
    mul-long v6, v4, v2

    .line 16
    .line 17
    cmp-long p0, v6, v0

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const-wide/16 v6, -0x1

    .line 22
    .line 23
    add-long/2addr v4, v6

    .line 24
    :cond_0
    add-long v6, p1, v4

    .line 25
    .line 26
    xor-long v10, p1, v6

    .line 27
    .line 28
    cmp-long p0, v10, v8

    .line 29
    .line 30
    if-gez p0, :cond_2

    .line 31
    .line 32
    xor-long/2addr v4, p1

    .line 33
    cmp-long p0, v4, v8

    .line 34
    .line 35
    if-ltz p0, :cond_2

    .line 36
    .line 37
    cmp-long p0, p1, v8

    .line 38
    .line 39
    if-lez p0, :cond_1

    .line 40
    .line 41
    sget-object p0, Lkotlin/time/Instant;->Companion:Lkotlin/time/飘花落叶言子楪世兰苏哲;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lkotlin/time/Instant;->access$getMAX$cp()Lkotlin/time/Instant;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    sget-object p0, Lkotlin/time/Instant;->Companion:Lkotlin/time/飘花落叶言子楪世兰苏哲;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lkotlin/time/Instant;->access$getMIN$cp()Lkotlin/time/Instant;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_2
    const-wide p0, -0x701cefeb9bec00L

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    cmp-long p0, v6, p0

    .line 67
    .line 68
    if-gez p0, :cond_3

    .line 69
    .line 70
    invoke-static {}, Lkotlin/time/Instant;->access$getMIN$cp()Lkotlin/time/Instant;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_3
    const-wide p0, 0x701cd2fa9578ffL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    cmp-long p0, v6, p0

    .line 81
    .line 82
    if-lez p0, :cond_4

    .line 83
    .line 84
    invoke-static {}, Lkotlin/time/Instant;->access$getMAX$cp()Lkotlin/time/Instant;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_4
    rem-long/2addr v0, v2

    .line 90
    xor-long p0, v0, v2

    .line 91
    .line 92
    neg-long v4, v0

    .line 93
    or-long/2addr v4, v0

    .line 94
    and-long/2addr p0, v4

    .line 95
    const/16 p2, 0x3f

    .line 96
    .line 97
    shr-long/2addr p0, p2

    .line 98
    and-long/2addr p0, v2

    .line 99
    add-long/2addr v0, p0

    .line 100
    long-to-int p0, v0

    .line 101
    new-instance p1, Lkotlin/time/Instant;

    .line 102
    .line 103
    invoke-direct {p1, v6, v7, p0}, Lkotlin/time/Instant;-><init>(JI)V

    .line 104
    .line 105
    .line 106
    return-object p1
.end method
