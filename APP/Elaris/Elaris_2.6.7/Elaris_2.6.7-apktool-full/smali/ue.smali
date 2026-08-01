.class public final Lue;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 1
    check-cast p1, Ln9;

    .line 2
    .line 3
    check-cast p2, Ln9;

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    const/4 v0, 0x1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ln9;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    move v1, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, p0

    .line 18
    :goto_0
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Ln9;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move v2, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v2, p0

    .line 29
    :goto_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-boolean v3, p1, Ln9;->h:Z

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    move v3, v0

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move v3, p0

    .line 38
    :goto_2
    if-eqz p2, :cond_3

    .line 39
    .line 40
    iget-boolean v4, p2, Ln9;->h:Z

    .line 41
    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    move p0, v0

    .line 45
    :cond_3
    if-eq v3, p0, :cond_4

    .line 46
    .line 47
    if-eqz v3, :cond_9

    .line 48
    .line 49
    goto :goto_5

    .line 50
    :cond_4
    if-eq v1, v2, :cond_5

    .line 51
    .line 52
    if-eqz v1, :cond_9

    .line 53
    .line 54
    goto :goto_5

    .line 55
    :cond_5
    if-nez v1, :cond_6

    .line 56
    .line 57
    if-eqz v2, :cond_a

    .line 58
    .line 59
    :cond_6
    const-wide/16 v1, 0x0

    .line 60
    .line 61
    if-nez p1, :cond_7

    .line 62
    .line 63
    move-wide v3, v1

    .line 64
    goto :goto_3

    .line 65
    :cond_7
    iget-wide v3, p1, Ln9;->g:J

    .line 66
    .line 67
    :goto_3
    if-nez p2, :cond_8

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_8
    iget-wide v1, p2, Ln9;->g:J

    .line 71
    .line 72
    :goto_4
    cmp-long p0, v3, v1

    .line 73
    .line 74
    if-eqz p0, :cond_a

    .line 75
    .line 76
    if-lez p0, :cond_9

    .line 77
    .line 78
    :goto_5
    const/4 p0, -0x1

    .line 79
    return p0

    .line 80
    :cond_9
    return v0

    .line 81
    :cond_a
    const-string p0, ""

    .line 82
    .line 83
    if-nez p1, :cond_b

    .line 84
    .line 85
    move-object p1, p0

    .line 86
    goto :goto_6

    .line 87
    :cond_b
    iget-object p1, p1, Ln9;->c:Ljava/lang/String;

    .line 88
    .line 89
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :goto_6
    if-nez p2, :cond_c

    .line 96
    .line 97
    goto :goto_7

    .line 98
    :cond_c
    iget-object p0, p2, Ln9;->c:Ljava/lang/String;

    .line 99
    .line 100
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 101
    .line 102
    invoke-virtual {p0, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :goto_7
    invoke-virtual {p1, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    return p0
.end method
