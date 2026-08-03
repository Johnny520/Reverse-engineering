.class public final Lpd/f;
.super Lud/p;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:I

.field public p:Lpd/e;


# direct methods
.method public constructor <init>(ILqd/l;)V
    .locals 2

    .line 1
    sget-object v0, Lpd/k;->D:Lpd/k;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, v0, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lpd/f;->o:I

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Lud/p;->I(Lqd/l;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 3

    .line 1
    new-instance v0, Lpd/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v1}, Lud/p;->S(I)Lqd/l;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget v2, p0, Lpd/f;->o:I

    .line 9
    .line 10
    invoke-direct {v0, v2, v1}, Lpd/f;-><init>(ILqd/l;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final Y(Lud/p;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lpd/f;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-super {p0, p1}, Lud/p;->Y(Lud/p;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Lpd/f;

    .line 17
    .line 18
    iget-object v0, p0, Lpd/f;->p:Lpd/e;

    .line 19
    .line 20
    iget-object p1, p1, Lpd/f;->p:Lpd/e;

    .line 21
    .line 22
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final i0(Lqd/j;)Ljava/util/List;
    .locals 7

    .line 1
    iget-object v0, p0, Lpd/f;->p:Lpd/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget v2, v0, Lpd/e;->p:I

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lpd/e;->o:Ljava/lang/Object;

    .line 14
    .line 15
    iget v0, v0, Lpd/e;->q:I

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eq v0, v3, :cond_3

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    if-eq v0, v3, :cond_2

    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    if-eq v0, v3, :cond_1

    .line 26
    .line 27
    const/16 v3, 0x8

    .line 28
    .line 29
    if-ne v0, v3, :cond_0

    .line 30
    .line 31
    check-cast v2, [J

    .line 32
    .line 33
    array-length v0, v2

    .line 34
    :goto_0
    if-ge v4, v0, :cond_4

    .line 35
    .line 36
    aget-wide v5, v2, v4

    .line 37
    .line 38
    invoke-static {v5, v6, p1}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v1, "Unknown type: "

    .line 61
    .line 62
    const-string v2, ", expected: "

    .line 63
    .line 64
    invoke-static {v1, v0, v2, p1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    return-object p1

    .line 73
    :cond_1
    check-cast v2, [I

    .line 74
    .line 75
    array-length v0, v2

    .line 76
    :goto_1
    if-ge v4, v0, :cond_4

    .line 77
    .line 78
    aget v3, v2, v4

    .line 79
    .line 80
    int-to-long v5, v3

    .line 81
    invoke-static {v5, v6, p1}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    check-cast v2, [S

    .line 92
    .line 93
    array-length v0, v2

    .line 94
    :goto_2
    if-ge v4, v0, :cond_4

    .line 95
    .line 96
    aget-short v3, v2, v4

    .line 97
    .line 98
    int-to-long v5, v3

    .line 99
    invoke-static {v5, v6, p1}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    check-cast v2, [B

    .line 110
    .line 111
    array-length v0, v2

    .line 112
    :goto_3
    if-ge v4, v0, :cond_4

    .line 113
    .line 114
    aget-byte v3, v2, v4

    .line 115
    .line 116
    int-to-long v5, v3

    .line 117
    invoke-static {v5, v6, p1}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    add-int/lit8 v4, v4, 0x1

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-super {p0}, Lud/p;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lpd/f;->p:Lpd/e;

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, ", data: "

    .line 12
    .line 13
    invoke-static {v0, v2, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
