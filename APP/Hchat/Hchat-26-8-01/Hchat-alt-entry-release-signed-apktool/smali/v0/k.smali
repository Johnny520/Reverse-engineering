.class public abstract Lv0/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lp4/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Li2/y;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lr9/p;

    .line 9
    .line 10
    const/16 v2, 0xb

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lr9/p;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lp4/t;

    .line 16
    .line 17
    const/16 v3, 0xc

    .line 18
    .line 19
    invoke-direct {v2, v0, v3, v1}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lv0/k;->a:Lp4/t;

    .line 23
    .line 24
    return-void
.end method

.method public static final a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable()."

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final b(Lfg/p;Lfg/l;)Lp4/t;
    .locals 2

    .line 1
    new-instance v0, Lsh/i0;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1, p0}, Lsh/i0;-><init>(ILfg/p;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    invoke-static {p0, p1}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Lp4/t;

    .line 12
    .line 13
    const/16 v1, 0xc

    .line 14
    .line 15
    invoke-direct {p0, v0, v1, p1}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public static final c([Ljava/lang/Object;Lfg/a;Li0/h0;I)Ljava/lang/Object;
    .locals 1

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    shl-int/lit8 p3, p3, 0x6

    .line 7
    .line 8
    and-int/lit16 p3, p3, 0x1c00

    .line 9
    .line 10
    or-int/lit16 p3, p3, 0x180

    .line 11
    .line 12
    sget-object v0, Lv0/k;->a:Lp4/t;

    .line 13
    .line 14
    invoke-static {p0, v0, p1, p2, p3}, Lv0/k;->d([Ljava/lang/Object;Lv0/j;Lfg/a;Li0/h0;I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final d([Ljava/lang/Object;Lv0/j;Lfg/a;Li0/h0;I)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-wide v0, p3, Li0/h0;->T:J

    .line 2
    .line 3
    const/16 v2, 0x24

    .line 4
    .line 5
    invoke-static {v2}, La/a;->w(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1, v2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object v0, Lv0/h;->a:Li0/m2;

    .line 19
    .line 20
    invoke-virtual {p3, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v5, v0

    .line 25
    check-cast v5, Lv0/f;

    .line 26
    .line 27
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x0

    .line 32
    sget-object v2, Li0/l;->a:Li0/e;

    .line 33
    .line 34
    if-ne v0, v2, :cond_2

    .line 35
    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    invoke-interface {v5, v6}, Lv0/f;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-interface {p1, v0}, Lv0/j;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v0, v1

    .line 50
    :goto_0
    if-nez v0, :cond_1

    .line 51
    .line 52
    invoke-interface {p2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_1
    move-object v7, v0

    .line 57
    new-instance v3, Lv0/b;

    .line 58
    .line 59
    move-object v8, p0

    .line 60
    move-object v4, p1

    .line 61
    invoke-direct/range {v3 .. v8}, Lv0/b;-><init>(Lv0/j;Lv0/f;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object v0, v3

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-object v8, p0

    .line 70
    move-object v4, p1

    .line 71
    :goto_1
    check-cast v0, Lv0/b;

    .line 72
    .line 73
    iget-object p0, v0, Lv0/b;->k:[Ljava/lang/Object;

    .line 74
    .line 75
    invoke-static {v8, p0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_3

    .line 80
    .line 81
    iget-object v1, v0, Lv0/b;->j:Ljava/lang/Object;

    .line 82
    .line 83
    :cond_3
    if-nez v1, :cond_4

    .line 84
    .line 85
    invoke-interface {p2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :cond_4
    invoke-virtual {p3, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    and-int/lit8 p1, p4, 0x70

    .line 94
    .line 95
    xor-int/lit8 p1, p1, 0x30

    .line 96
    .line 97
    const/16 p2, 0x20

    .line 98
    .line 99
    if-le p1, p2, :cond_5

    .line 100
    .line 101
    invoke-virtual {p3, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_6

    .line 106
    .line 107
    :cond_5
    and-int/lit8 p1, p4, 0x30

    .line 108
    .line 109
    if-ne p1, p2, :cond_7

    .line 110
    .line 111
    :cond_6
    const/4 p1, 0x1

    .line 112
    goto :goto_2

    .line 113
    :cond_7
    const/4 p1, 0x0

    .line 114
    :goto_2
    or-int/2addr p0, p1

    .line 115
    invoke-virtual {p3, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    or-int/2addr p0, p1

    .line 120
    invoke-virtual {p3, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    or-int/2addr p0, p1

    .line 125
    invoke-virtual {p3, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    or-int/2addr p0, p1

    .line 130
    invoke-virtual {p3, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    or-int/2addr p0, p1

    .line 135
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-nez p0, :cond_9

    .line 140
    .line 141
    if-ne p1, v2, :cond_8

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_8
    move-object v8, v1

    .line 145
    goto :goto_4

    .line 146
    :cond_9
    :goto_3
    new-instance v3, Lc9/p0;

    .line 147
    .line 148
    const/4 v10, 0x2

    .line 149
    move-object v7, v6

    .line 150
    move-object v9, v8

    .line 151
    move-object v8, v1

    .line 152
    move-object v6, v5

    .line 153
    move-object v5, v4

    .line 154
    move-object v4, v0

    .line 155
    invoke-direct/range {v3 .. v10}, Lc9/p0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p3, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    move-object p1, v3

    .line 162
    :goto_4
    check-cast p1, Lfg/a;

    .line 163
    .line 164
    invoke-static {p1, p3}, Li0/r;->j(Lfg/a;Li0/h0;)V

    .line 165
    .line 166
    .line 167
    return-object v8
.end method

.method public static final e([Ljava/lang/Object;Lv0/j;Lfg/a;Li0/h0;I)Ljava/lang/Object;
    .locals 1

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    shl-int/lit8 p4, p4, 0x3

    .line 7
    .line 8
    and-int/lit16 p4, p4, 0x1c00

    .line 9
    .line 10
    const/16 v0, 0x180

    .line 11
    .line 12
    or-int/2addr p4, v0

    .line 13
    invoke-static {p0, p1, p2, p3, p4}, Lv0/k;->d([Ljava/lang/Object;Lv0/j;Lfg/a;Li0/h0;I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
