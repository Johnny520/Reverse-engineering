.class public final Lat;
.super Lqp0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public t:Llv2;

.field public u:Lk11;

.field public v:Lah1;

.field public w:Ljava/util/ArrayList;


# direct methods
.method public static b0(Lat;Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p2, v0

    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x5

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p2, Llv2;

    .line 10
    .line 11
    invoke-direct {p2, p1, v0}, Llv2;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lat;->t:Llv2;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final D(Lmj0;)I
    .locals 7

    .line 1
    iget-object v0, p0, Lat;->t:Llv2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Llv2;->D(Lmj0;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    iget-object v2, p0, Lat;->u:Lk11;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Lk11;->D(Lmj0;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v2, v1

    .line 22
    :goto_1
    iget-object v3, p0, Lat;->v:Lah1;

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v3, p1}, Lah1;->D(Lmj0;)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move v3, v1

    .line 32
    :goto_2
    iget-object p0, p0, Lat;->w:Ljava/util/ArrayList;

    .line 33
    .line 34
    const/16 v4, 0xa

    .line 35
    .line 36
    if-eqz p0, :cond_4

    .line 37
    .line 38
    new-instance v5, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-static {p0, v4}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_3

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    check-cast v6, Llv2;

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, p1}, Llv2;->D(Lmj0;)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-static {v5}, Ldu;->E0(Ljava/util/ArrayList;)[I

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p1, p0}, Lmj0;->f([I)I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    goto :goto_4

    .line 87
    :cond_4
    move p0, v1

    .line 88
    :goto_4
    const/16 v5, 0xc

    .line 89
    .line 90
    invoke-virtual {p1, v5}, Lmj0;->m(I)V

    .line 91
    .line 92
    .line 93
    const/16 v5, 0xb

    .line 94
    .line 95
    invoke-virtual {p1, v5, v1}, Lmj0;->c(II)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v4, v1}, Lmj0;->c(II)V

    .line 99
    .line 100
    .line 101
    const/16 v4, 0x9

    .line 102
    .line 103
    invoke-virtual {p1, v4, v1}, Lmj0;->c(II)V

    .line 104
    .line 105
    .line 106
    const/16 v4, 0x8

    .line 107
    .line 108
    invoke-virtual {p1, v4, p0}, Lmj0;->c(II)V

    .line 109
    .line 110
    .line 111
    const/4 p0, 0x7

    .line 112
    invoke-virtual {p1, p0, v3}, Lmj0;->c(II)V

    .line 113
    .line 114
    .line 115
    const/4 p0, 0x6

    .line 116
    invoke-virtual {p1, p0, v1}, Lmj0;->c(II)V

    .line 117
    .line 118
    .line 119
    const/4 p0, 0x5

    .line 120
    invoke-virtual {p1, p0, v1}, Lmj0;->c(II)V

    .line 121
    .line 122
    .line 123
    const/4 p0, 0x4

    .line 124
    invoke-virtual {p1, p0, v2}, Lmj0;->c(II)V

    .line 125
    .line 126
    .line 127
    const/4 p0, 0x3

    .line 128
    invoke-virtual {p1, p0, v1}, Lmj0;->c(II)V

    .line 129
    .line 130
    .line 131
    const/4 p0, 0x2

    .line 132
    invoke-virtual {p1, p0, v1}, Lmj0;->c(II)V

    .line 133
    .line 134
    .line 135
    const/4 p0, 0x1

    .line 136
    invoke-virtual {p1, p0, v0}, Lmj0;->c(II)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v1, v1}, Lmj0;->c(II)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Lmj0;->g()I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    invoke-virtual {p1, p0}, Lmj0;->i(I)V

    .line 147
    .line 148
    .line 149
    return p0
.end method

.method public final varargs c0([Ljava/lang/String;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    new-instance v4, Llv2;

    .line 14
    .line 15
    const/4 v5, 0x5

    .line 16
    invoke-direct {v4, v3, v5}, Llv2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lat;->w:Ljava/util/ArrayList;

    .line 31
    .line 32
    return-void
.end method

.method public final varargs d0([Ljava/lang/String;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    new-instance v4, Llv2;

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    invoke-direct {v4, v3, v5}, Llv2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lat;->w:Ljava/util/ArrayList;

    .line 31
    .line 32
    return-void
.end method
