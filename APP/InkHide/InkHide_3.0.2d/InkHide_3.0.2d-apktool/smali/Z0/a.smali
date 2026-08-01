.class public final LZ0/a;
.super LD/h;
.source "SourceFile"


# instance fields
.field public d:La1/b;

.field public e:LZ0/c;

.field public f:Ljava/util/ArrayList;


# virtual methods
.method public final Y(Ljava/lang/String;IZ)V
    .locals 1

    .line 1
    const-string v0, "className"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matchType"

    .line 7
    .line 8
    invoke-static {p2, v0}, LL/d;->o(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, La1/b;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2, p3}, La1/b;-><init>(Ljava/lang/String;IZ)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LZ0/a;->d:La1/b;

    .line 17
    .line 18
    return-void
.end method

.method public final Z(LS/b;)I
    .locals 6

    .line 1
    iget-object v0, p0, LZ0/a;->d:La1/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, p1}, La1/b;->Y(LS/b;)I

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
    iget-object v2, p0, LZ0/a;->e:LZ0/c;

    .line 13
    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    iget-object v2, v2, LZ0/c;->d:Ljava/util/List;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    new-instance v4, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {v2}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, LZ0/b;

    .line 45
    .line 46
    invoke-virtual {v5, p1}, LZ0/b;->Z(LS/b;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-static {v4}, LF0/k;->v0(Ljava/util/ArrayList;)[I

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {p1, v2}, LS/b;->d([I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move v2, v3

    .line 68
    :goto_2
    const/4 v4, 0x3

    .line 69
    invoke-virtual {p1, v4}, LS/b;->j(I)V

    .line 70
    .line 71
    .line 72
    const/4 v4, 0x2

    .line 73
    invoke-virtual {p1, v4, v3}, LS/b;->a(II)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v3, v2}, LS/b;->a(II)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, LS/b;->e()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {p1, v2}, LS/b;->f(I)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    move v2, v1

    .line 88
    :goto_3
    iget-object v3, p0, LZ0/a;->f:Ljava/util/ArrayList;

    .line 89
    .line 90
    if-eqz v3, :cond_5

    .line 91
    .line 92
    new-instance v4, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-static {v3}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_4

    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    check-cast v5, La1/b;

    .line 116
    .line 117
    invoke-virtual {v5, p1}, La1/b;->Y(LS/b;)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_4
    invoke-static {v4}, LF0/k;->v0(Ljava/util/ArrayList;)[I

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {p1, v3}, LS/b;->d([I)I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    goto :goto_5

    .line 138
    :cond_5
    move v3, v1

    .line 139
    :goto_5
    const/16 v4, 0x9

    .line 140
    .line 141
    invoke-virtual {p1, v4}, LS/b;->j(I)V

    .line 142
    .line 143
    .line 144
    const/16 v4, 0x8

    .line 145
    .line 146
    invoke-virtual {p1, v4, v3}, LS/b;->a(II)V

    .line 147
    .line 148
    .line 149
    const/4 v3, 0x7

    .line 150
    invoke-virtual {p1, v3, v2}, LS/b;->a(II)V

    .line 151
    .line 152
    .line 153
    const/4 v2, 0x6

    .line 154
    invoke-virtual {p1, v2, v1}, LS/b;->a(II)V

    .line 155
    .line 156
    .line 157
    const/4 v2, 0x5

    .line 158
    invoke-virtual {p1, v2, v1}, LS/b;->a(II)V

    .line 159
    .line 160
    .line 161
    const/4 v2, 0x4

    .line 162
    invoke-virtual {p1, v2, v1}, LS/b;->a(II)V

    .line 163
    .line 164
    .line 165
    const/4 v2, 0x3

    .line 166
    invoke-virtual {p1, v2, v1}, LS/b;->a(II)V

    .line 167
    .line 168
    .line 169
    const/4 v2, 0x2

    .line 170
    invoke-virtual {p1, v2, v1}, LS/b;->a(II)V

    .line 171
    .line 172
    .line 173
    const/4 v2, 0x1

    .line 174
    invoke-virtual {p1, v2, v0}, LS/b;->a(II)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v1, v1}, LS/b;->a(II)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, LS/b;->e()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    invoke-virtual {p1, v0}, LS/b;->f(I)V

    .line 185
    .line 186
    .line 187
    return v0
.end method

.method public final varargs a0([Ljava/lang/String;)V
    .locals 5

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
    new-instance v4, La1/b;

    .line 14
    .line 15
    invoke-direct {v4, v3}, La1/b;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v0}, LF0/k;->y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, LZ0/a;->f:Ljava/util/ArrayList;

    .line 29
    .line 30
    return-void
.end method
