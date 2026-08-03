.class public final Lvd/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public c:I

.field public d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lvd/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvd/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lvd/a;->b:I

    .line 11
    .line 12
    const/4 p1, -0x1

    .line 13
    iput p1, p0, Lvd/a;->c:I

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lvd/a;->d:I

    .line 17
    .line 18
    return-void
.end method

.method public static g(Lnd/b0;)Lvd/a;
    .locals 1

    .line 1
    sget-object v0, Loc/c;->b:Loc/c;

    .line 2
    .line 3
    iget-object p0, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lpc/j;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    move-object p0, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p0, p0, Lpc/j;->g:Ljava/lang/String;

    .line 17
    .line 18
    :goto_0
    if-nez p0, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    new-instance v0, Lvd/a;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lvd/a;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method


# virtual methods
.method public final a(C)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v1, Laf/g;

    .line 9
    .line 10
    invoke-virtual {p0}, Lvd/a;->f()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v4, "Consume wrong char: \'"

    .line 17
    .line 18
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, "\' != \'"

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p1, "\', sign: "

    .line 33
    .line 34
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method

.method public final b()Ljava/util/List;
    .locals 6

    .line 1
    const/16 v0, 0x3c

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lvd/a;->i(C)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lvd/a;->a(C)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const/16 v0, 0x3e

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lvd/a;->i(C)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_b

    .line 27
    .line 28
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_1
    iget v2, p0, Lvd/a;->c:I

    .line 36
    .line 37
    iput v2, p0, Lvd/a;->d:I

    .line 38
    .line 39
    :cond_2
    const/16 v0, 0x3a

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lvd/a;->i(C)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Lvd/a;->h()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_2

    .line 57
    .line 58
    iput v2, p0, Lvd/a;->c:I

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    :goto_1
    if-eqz v2, :cond_a

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lvd/a;->a(C)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lvd/a;->i(C)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 73
    .line 74
    .line 75
    :cond_4
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 76
    .line 77
    :cond_5
    invoke-virtual {p0}, Lvd/a;->e()Lqd/j;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    if-eqz v4, :cond_9

    .line 82
    .line 83
    sget-object v5, Lqd/j;->k:Lqd/e;

    .line 84
    .line 85
    invoke-virtual {v4, v5}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-nez v5, :cond_7

    .line 90
    .line 91
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_6

    .line 96
    .line 97
    new-instance v3, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    :cond_6
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    :cond_7
    invoke-virtual {p0, v0}, Lvd/a;->i(C)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_8

    .line 110
    .line 111
    invoke-virtual {p0, v0}, Lvd/a;->a(C)V

    .line 112
    .line 113
    .line 114
    :cond_8
    if-nez v4, :cond_5

    .line 115
    .line 116
    new-instance v0, Lqd/c;

    .line 117
    .line 118
    invoke-direct {v0, v2, v3}, Lqd/c;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_9
    const-string v0, "Unexpected end of signature"

    .line 126
    .line 127
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :goto_2
    const/4 v0, 0x0

    .line 131
    return-object v0

    .line 132
    :cond_a
    const-string v0, "Failed to parse generic types map"

    .line 133
    .line 134
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_b
    :goto_3
    invoke-virtual {p0, v0}, Lvd/a;->a(C)V

    .line 139
    .line 140
    .line 141
    return-object v1
.end method

.method public final c(I)Ljava/util/List;
    .locals 3

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lvd/a;->a(C)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x29

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lvd/a;->i(C)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lvd/a;->a(C)V

    .line 15
    .line 16
    .line 17
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 p1, p1, 0xa

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Lvd/a;->e()Lqd/j;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-gt v2, p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lvd/a;->i(C)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lvd/a;->a(C)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    const-string v0, "Arguments count limit reached: "

    .line 57
    .line 58
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    return-object p1

    .line 67
    :cond_3
    const-string p1, "Unexpected end of signature"

    .line 68
    .line 69
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    return-object p1
.end method

.method public final d(Z)Lqd/j;
    .locals 9

    .line 1
    iget v0, p0, Lvd/a;->c:I

    .line 2
    .line 3
    iput v0, p0, Lvd/a;->d:I

    .line 4
    .line 5
    :cond_0
    const/16 v0, 0x2e

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lvd/a;->i(C)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lvd/a;->h()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_1
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_2
    const/16 v3, 0x3c

    .line 33
    .line 34
    const/16 v4, 0x3b

    .line 35
    .line 36
    if-eq v1, v3, :cond_3

    .line 37
    .line 38
    if-ne v1, v4, :cond_0

    .line 39
    .line 40
    :cond_3
    iget-object v3, p0, Lvd/a;->a:Ljava/lang/String;

    .line 41
    .line 42
    const-string v5, ""

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, -0x1

    .line 46
    const/16 v8, 0x2f

    .line 47
    .line 48
    if-ne v1, v4, :cond_7

    .line 49
    .line 50
    if-eqz p1, :cond_6

    .line 51
    .line 52
    iget p1, p0, Lvd/a;->d:I

    .line 53
    .line 54
    if-ne p1, v7, :cond_4

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    move v6, p1

    .line 58
    :goto_0
    iget p1, p0, Lvd/a;->c:I

    .line 59
    .line 60
    if-lt v6, p1, :cond_5

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_5
    invoke-virtual {v3, v6, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    :goto_1
    invoke-virtual {v5, v8, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    goto :goto_2

    .line 72
    :cond_6
    invoke-virtual {p0}, Lvd/a;->h()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_2
    invoke-static {p1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_7
    iget v1, p0, Lvd/a;->d:I

    .line 82
    .line 83
    if-ne v1, v7, :cond_8

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_8
    move v6, v1

    .line 87
    :goto_3
    iget v1, p0, Lvd/a;->c:I

    .line 88
    .line 89
    if-lt v6, v1, :cond_9

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_9
    invoke-virtual {v3, v6, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    :goto_4
    if-nez p1, :cond_a

    .line 97
    .line 98
    const-string p1, ";"

    .line 99
    .line 100
    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    goto :goto_5

    .line 105
    :cond_a
    invoke-virtual {v5, v8, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_5
    new-instance v1, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    :cond_b
    const/16 v3, 0x2a

    .line 115
    .line 116
    invoke-virtual {p0, v3}, Lvd/a;->i(C)Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    const/4 v5, 0x1

    .line 121
    if-eqz v3, :cond_c

    .line 122
    .line 123
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 124
    .line 125
    .line 126
    sget-object v3, Lqd/j;->b:Lqd/g;

    .line 127
    .line 128
    new-instance v3, Lqd/i;

    .line 129
    .line 130
    sget-object v6, Lqd/j;->k:Lqd/e;

    .line 131
    .line 132
    const/4 v7, 0x2

    .line 133
    invoke-direct {v3, v7, v6}, Lqd/i;-><init>(ILqd/j;)V

    .line 134
    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_c
    const/16 v3, 0x2b

    .line 138
    .line 139
    invoke-virtual {p0, v3}, Lvd/a;->i(C)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_d

    .line 144
    .line 145
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lvd/a;->e()Lqd/j;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    sget-object v6, Lqd/j;->b:Lqd/g;

    .line 153
    .line 154
    new-instance v6, Lqd/i;

    .line 155
    .line 156
    invoke-direct {v6, v5, v3}, Lqd/i;-><init>(ILqd/j;)V

    .line 157
    .line 158
    .line 159
    :goto_6
    move-object v3, v6

    .line 160
    goto :goto_7

    .line 161
    :cond_d
    const/16 v3, 0x2d

    .line 162
    .line 163
    invoke-virtual {p0, v3}, Lvd/a;->i(C)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-eqz v3, :cond_e

    .line 168
    .line 169
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Lvd/a;->e()Lqd/j;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    sget-object v6, Lqd/j;->b:Lqd/g;

    .line 177
    .line 178
    new-instance v6, Lqd/i;

    .line 179
    .line 180
    const/4 v7, 0x3

    .line 181
    invoke-direct {v6, v7, v3}, Lqd/i;-><init>(ILqd/j;)V

    .line 182
    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_e
    invoke-virtual {p0}, Lvd/a;->e()Lqd/j;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    :goto_7
    if-eqz v3, :cond_f

    .line 190
    .line 191
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    :cond_f
    const/16 v6, 0x3e

    .line 195
    .line 196
    if-eqz v3, :cond_10

    .line 197
    .line 198
    invoke-virtual {p0, v6}, Lvd/a;->i(C)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_b

    .line 203
    .line 204
    :cond_10
    invoke-virtual {p0, v6}, Lvd/a;->a(C)V

    .line 205
    .line 206
    .line 207
    sget-object v3, Lqd/j;->b:Lqd/g;

    .line 208
    .line 209
    new-instance v3, Lqd/b;

    .line 210
    .line 211
    invoke-static {p1}, Lxe/s;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-direct {v3, p1, v1}, Lqd/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v0}, Lvd/a;->i(C)Z

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    if-nez p1, :cond_11

    .line 223
    .line 224
    invoke-virtual {p0, v4}, Lvd/a;->a(C)V

    .line 225
    .line 226
    .line 227
    return-object v3

    .line 228
    :cond_11
    invoke-virtual {p0, v0}, Lvd/a;->a(C)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v5}, Lvd/a;->d(Z)Lqd/j;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    if-eqz p1, :cond_14

    .line 239
    .line 240
    :goto_8
    invoke-virtual {p0, v0}, Lvd/a;->i(C)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_13

    .line 245
    .line 246
    new-instance v1, Lqd/f;

    .line 247
    .line 248
    check-cast p1, Lqd/e;

    .line 249
    .line 250
    invoke-direct {v1, v3, p1}, Lqd/f;-><init>(Lqd/e;Lqd/e;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, v0}, Lvd/a;->a(C)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0, v5}, Lvd/a;->d(Z)Lqd/j;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    if-eqz p1, :cond_12

    .line 264
    .line 265
    move-object v3, v1

    .line 266
    goto :goto_8

    .line 267
    :cond_12
    invoke-virtual {p0}, Lvd/a;->f()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    const-string v0, "Unexpected inner type found: "

    .line 272
    .line 273
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    return-object v2

    .line 281
    :cond_13
    new-instance v0, Lqd/f;

    .line 282
    .line 283
    check-cast p1, Lqd/e;

    .line 284
    .line 285
    invoke-direct {v0, v3, p1}, Lqd/f;-><init>(Lqd/e;Lqd/e;)V

    .line 286
    .line 287
    .line 288
    return-object v0

    .line 289
    :cond_14
    invoke-virtual {p0}, Lvd/a;->f()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    const-string v0, "No inner type found: "

    .line 294
    .line 295
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    return-object v2
.end method

.method public final e()Lqd/j;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    const/16 v2, 0x4c

    .line 9
    .line 10
    if-eq v0, v2, :cond_5

    .line 11
    .line 12
    const/16 v2, 0x54

    .line 13
    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    const/16 v1, 0x5b

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, Lqd/j;->y(C)Lqd/g;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_6

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_0
    invoke-virtual {p0}, Lvd/a;->e()Lqd/j;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, Lqd/j;->b:Lqd/g;

    .line 32
    .line 33
    new-instance v1, Lqd/a;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lqd/a;-><init>(Lqd/j;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_1
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 40
    .line 41
    .line 42
    iget v2, p0, Lvd/a;->c:I

    .line 43
    .line 44
    iput v2, p0, Lvd/a;->d:I

    .line 45
    .line 46
    :cond_2
    const/16 v3, 0x3b

    .line 47
    .line 48
    invoke-virtual {p0, v3}, Lvd/a;->i(C)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0}, Lvd/a;->h()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {p0}, Lvd/a;->j()C

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    iput v2, p0, Lvd/a;->c:I

    .line 66
    .line 67
    move-object v2, v1

    .line 68
    :goto_0
    if-eqz v2, :cond_6

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Lvd/a;->a(C)V

    .line 71
    .line 72
    .line 73
    const-string v0, ")"

    .line 74
    .line 75
    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_4

    .line 80
    .line 81
    sget-object v0, Lqd/j;->b:Lqd/g;

    .line 82
    .line 83
    new-instance v0, Lqd/c;

    .line 84
    .line 85
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 86
    .line 87
    invoke-direct {v0, v2, v1}, Lqd/c;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_4
    const-string v0, "Bad name for type variable: "

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_5
    const/4 v1, 0x0

    .line 102
    invoke-virtual {p0, v1}, Lvd/a;->d(Z)Lqd/j;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_6
    new-instance v1, Laf/g;

    .line 110
    .line 111
    invoke-virtual {p0}, Lvd/a;->f()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    new-instance v3, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v4, "Can\'t parse type: "

    .line 118
    .line 119
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v2, ", unexpected: "

    .line 126
    .line 127
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v1

    .line 141
    :cond_7
    return-object v1
.end method

.method public final f()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lvd/a;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lvd/a;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-lt v0, v2, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget v0, p0, Lvd/a;->c:I

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, " at position "

    .line 27
    .line 28
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, " (\'"

    .line 35
    .line 36
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, "\')"

    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lvd/a;->d:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :cond_0
    iget v1, p0, Lvd/a;->c:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    if-lt v0, v1, :cond_1

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    iget-object v2, p0, Lvd/a;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final i(C)Z
    .locals 3

    .line 1
    iget v0, p0, Lvd/a;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iget v2, p0, Lvd/a;->b:I

    .line 6
    .line 7
    if-ge v0, v2, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lvd/a;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne v0, p1, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public final j()C
    .locals 2

    .line 1
    iget v0, p0, Lvd/a;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lvd/a;->c:I

    .line 6
    .line 7
    iget v1, p0, Lvd/a;->b:I

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    iget-object v1, p0, Lvd/a;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lvd/a;->c:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    iget-object v2, p0, Lvd/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    iget v1, p0, Lvd/a;->d:I

    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p0, Lvd/a;->d:I

    .line 17
    .line 18
    iget v3, p0, Lvd/a;->c:I

    .line 19
    .line 20
    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget v3, p0, Lvd/a;->c:I

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "{"

    .line 31
    .line 32
    const-string v4, "}"

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
.end method
