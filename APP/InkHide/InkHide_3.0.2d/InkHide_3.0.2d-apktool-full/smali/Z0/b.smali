.class public final LZ0/b;
.super LD/h;
.source "SourceFile"


# instance fields
.field public d:La1/b;

.field public e:La1/a;

.field public f:LZ0/a;

.field public g:LZ0/a;

.field public h:LW0/a;

.field public i:Ljava/util/ArrayList;


# direct methods
.method public static Y(LZ0/b;Ljava/lang/String;)V
    .locals 3

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
    const/4 v1, 0x5

    .line 9
    invoke-static {v1, v0}, LL/d;->o(ILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, LZ0/a;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, p1, v1, v2}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LZ0/b;->f:LZ0/a;

    .line 22
    .line 23
    return-void
.end method

.method public static a0(LZ0/b;I)V
    .locals 3

    .line 1
    const-string v0, "matchType"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1, v0}, LL/d;->o(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La1/a;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v2}, La1/a;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput p1, v0, La1/a;->e:I

    .line 14
    .line 15
    iput v1, v0, La1/a;->f:I

    .line 16
    .line 17
    iput-object v0, p0, LZ0/b;->e:La1/a;

    .line 18
    .line 19
    return-void
.end method

.method public static b0(LZ0/b;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "matchType"

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-static {v1, v0}, LL/d;->o(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La1/b;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, p1, v1, v2}, La1/b;-><init>(Ljava/lang/String;IZ)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LZ0/b;->d:La1/b;

    .line 14
    .line 15
    return-void
.end method

.method public static e0(LZ0/b;Ljava/util/List;)V
    .locals 5

    .line 1
    const-string v0, "matchType"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1, v0}, LL/d;->o(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-static {p1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    new-instance v3, La1/b;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v3, v2, v1, v4}, La1/b;-><init>(Ljava/lang/String;IZ)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v0}, LF0/k;->y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, LZ0/b;->i:Ljava/util/ArrayList;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final Z(LS/b;)I
    .locals 9

    .line 1
    iget-object v0, p0, LZ0/b;->d:La1/b;

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
    iget-object v2, p0, LZ0/b;->e:La1/a;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2, p1}, La1/a;->Y(LS/b;)I

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
    iget-object v3, p0, LZ0/b;->f:LZ0/a;

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v3, p1}, LZ0/a;->Z(LS/b;)I

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
    iget-object v4, p0, LZ0/b;->g:LZ0/a;

    .line 33
    .line 34
    if-eqz v4, :cond_3

    .line 35
    .line 36
    invoke-virtual {v4, p1}, LZ0/a;->Z(LS/b;)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move v4, v1

    .line 42
    :goto_3
    iget-object v5, p0, LZ0/b;->h:LW0/a;

    .line 43
    .line 44
    if-eqz v5, :cond_4

    .line 45
    .line 46
    invoke-virtual {v5, p1}, LW0/a;->Y(LS/b;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    goto :goto_4

    .line 51
    :cond_4
    move v5, v1

    .line 52
    :goto_4
    iget-object v6, p0, LZ0/b;->i:Ljava/util/ArrayList;

    .line 53
    .line 54
    if-eqz v6, :cond_6

    .line 55
    .line 56
    new-instance v7, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-static {v6}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_5

    .line 74
    .line 75
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    check-cast v8, La1/b;

    .line 80
    .line 81
    invoke-virtual {v8, p1}, La1/b;->Y(LS/b;)I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_5
    invoke-static {v7}, LF0/k;->v0(Ljava/util/ArrayList;)[I

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {p1, v6}, LS/b;->d([I)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    goto :goto_6

    .line 102
    :cond_6
    move v6, v1

    .line 103
    :goto_6
    const/16 v7, 0xe

    .line 104
    .line 105
    invoke-virtual {p1, v7}, LS/b;->j(I)V

    .line 106
    .line 107
    .line 108
    const/16 v7, 0xd

    .line 109
    .line 110
    invoke-virtual {p1, v7, v1}, LS/b;->a(II)V

    .line 111
    .line 112
    .line 113
    const/16 v7, 0xc

    .line 114
    .line 115
    invoke-virtual {p1, v7, v1}, LS/b;->a(II)V

    .line 116
    .line 117
    .line 118
    const/16 v7, 0xb

    .line 119
    .line 120
    invoke-virtual {p1, v7, v1}, LS/b;->a(II)V

    .line 121
    .line 122
    .line 123
    const/16 v7, 0xa

    .line 124
    .line 125
    invoke-virtual {p1, v7, v1}, LS/b;->a(II)V

    .line 126
    .line 127
    .line 128
    const/16 v7, 0x9

    .line 129
    .line 130
    invoke-virtual {p1, v7, v1}, LS/b;->a(II)V

    .line 131
    .line 132
    .line 133
    const/16 v7, 0x8

    .line 134
    .line 135
    invoke-virtual {p1, v7, v1}, LS/b;->a(II)V

    .line 136
    .line 137
    .line 138
    const/4 v7, 0x7

    .line 139
    invoke-virtual {p1, v7, v6}, LS/b;->a(II)V

    .line 140
    .line 141
    .line 142
    const/4 v6, 0x6

    .line 143
    invoke-virtual {p1, v6, v1}, LS/b;->a(II)V

    .line 144
    .line 145
    .line 146
    const/4 v6, 0x5

    .line 147
    invoke-virtual {p1, v6, v1}, LS/b;->a(II)V

    .line 148
    .line 149
    .line 150
    const/4 v6, 0x4

    .line 151
    invoke-virtual {p1, v6, v5}, LS/b;->a(II)V

    .line 152
    .line 153
    .line 154
    const/4 v5, 0x3

    .line 155
    invoke-virtual {p1, v5, v4}, LS/b;->a(II)V

    .line 156
    .line 157
    .line 158
    const/4 v4, 0x2

    .line 159
    invoke-virtual {p1, v4, v3}, LS/b;->a(II)V

    .line 160
    .line 161
    .line 162
    const/4 v3, 0x1

    .line 163
    invoke-virtual {p1, v3, v2}, LS/b;->a(II)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v1, v0}, LS/b;->a(II)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, LS/b;->e()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-virtual {p1, v0}, LS/b;->f(I)V

    .line 174
    .line 175
    .line 176
    return v0
.end method

.method public final varargs c0([Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v0, LW0/a;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, LW0/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, LF0/s;->a:LF0/s;

    .line 8
    .line 9
    invoke-static {v1}, LF0/k;->y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, LW0/a;->e:Ljava/util/List;

    .line 14
    .line 15
    array-length v1, p1

    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-ge v3, v1, :cond_2

    .line 19
    .line 20
    aget-object v4, p1, v3

    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    new-instance v5, LZ0/d;

    .line 25
    .line 26
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v6, LZ0/a;

    .line 30
    .line 31
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    const/4 v7, 0x5

    .line 35
    invoke-virtual {v6, v4, v7, v2}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 36
    .line 37
    .line 38
    iput-object v6, v5, LZ0/d;->d:LZ0/a;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v5, 0x0

    .line 42
    :goto_1
    iget-object v4, v0, LW0/a;->e:Ljava/util/List;

    .line 43
    .line 44
    if-nez v4, :cond_1

    .line 45
    .line 46
    new-instance v4, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    :cond_1
    iput-object v4, v0, LW0/a;->e:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    iput-object v0, p0, LZ0/b;->h:LW0/a;

    .line 60
    .line 61
    return-void
.end method

.method public final varargs d0([Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "usingStrings"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    array-length v1, p1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    array-length v1, p1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_0

    .line 16
    .line 17
    aget-object v4, p1, v3

    .line 18
    .line 19
    new-instance v5, La1/b;

    .line 20
    .line 21
    const/4 v6, 0x5

    .line 22
    invoke-direct {v5, v4, v6, v2}, La1/b;-><init>(Ljava/lang/String;IZ)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v0}, LF0/k;->y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, LZ0/b;->i:Ljava/util/ArrayList;

    .line 36
    .line 37
    return-void
.end method
