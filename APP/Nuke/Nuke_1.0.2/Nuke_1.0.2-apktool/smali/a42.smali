.class public final La42;
.super Liy0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final i:Ld42;

.field public final j:Lq30;

.field public k:Lf63;


# direct methods
.method public constructor <init>(Ld42;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Liy0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    iget-object v1, p1, Ld42;->j:Lwu2;

    .line 8
    .line 9
    iget-object v2, v1, Lkj0;->i:[Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, La42;->i:Ld42;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    new-instance v4, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    add-int/lit8 v5, v3, 0x1

    .line 17
    .line 18
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p1, Ld42;->i:Lo43;

    .line 22
    .line 23
    iget-object p1, p1, Lo43;->h:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/16 v6, 0x4c

    .line 31
    .line 32
    const/16 v7, 0x5b

    .line 33
    .line 34
    if-ne p1, v7, :cond_0

    .line 35
    .line 36
    move p1, v6

    .line 37
    :cond_0
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move p1, v5

    .line 41
    :goto_0
    if-ge p1, v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1, p1}, Lkj0;->e(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    check-cast v8, Lo43;

    .line 48
    .line 49
    iget-object v8, v8, Lo43;->h:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v8, v5}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-ne v8, v7, :cond_1

    .line 56
    .line 57
    move v8, v6

    .line 58
    :cond_1
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    add-int/lit8 p1, p1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    new-instance p1, Lq30;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-direct {p1, v3}, Lq30;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, La42;->j:Lq30;

    .line 74
    .line 75
    array-length p1, v2

    .line 76
    if-nez p1, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    new-instance v0, Lf63;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lf63;-><init>(Ld63;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    iput-object v0, p0, La42;->k:Lf63;

    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    const-string p0, "prototype == null"

    .line 88
    .line 89
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v0
.end method


# virtual methods
.method public final a(Lz70;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lz70;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb42;

    .line 4
    .line 5
    iget-object v1, p1, Lz70;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lb42;

    .line 8
    .line 9
    iget-object p1, p1, Lz70;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Leh1;

    .line 12
    .line 13
    iget-object v2, p0, La42;->i:Ld42;

    .line 14
    .line 15
    iget-object v2, v2, Ld42;->i:Lo43;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lb42;->q(Lo43;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, La42;->j:Lq30;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lb42;->o(Lq30;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, La42;->k:Lf63;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Leh1;->l(Lxs1;)Lxs1;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lf63;

    .line 34
    .line 35
    iput-object p1, p0, La42;->k:Lf63;

    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final b()Lg21;
    .locals 0

    .line 1
    sget-object p0, Lg21;->n:Lg21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()I
    .locals 0

    .line 1
    const/16 p0, 0xc

    .line 2
    .line 3
    return p0
.end method

.method public final d(Lz70;Lyn;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lz70;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb42;

    .line 4
    .line 5
    iget-object v1, p0, La42;->j:Lq30;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lb42;->l(Lq30;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object p1, p1, Lz70;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lb42;

    .line 14
    .line 15
    iget-object v2, p0, La42;->i:Ld42;

    .line 16
    .line 17
    iget-object v3, v2, Ld42;->i:Lo43;

    .line 18
    .line 19
    iget-object v4, v2, Ld42;->i:Lo43;

    .line 20
    .line 21
    invoke-virtual {p1, v3}, Lb42;->n(Lo43;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v3, p0, La42;->k:Lf63;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    move v3, v5

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v3}, Lxs1;->f()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    :goto_0
    invoke-virtual {p2}, Lyn;->d()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    new-instance v6, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Lo43;->b()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v7, " proto("

    .line 55
    .line 56
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v2, v2, Ld42;->j:Lwu2;

    .line 60
    .line 61
    iget-object v7, v2, Lkj0;->i:[Ljava/lang/Object;

    .line 62
    .line 63
    array-length v7, v7

    .line 64
    move v8, v5

    .line 65
    :goto_1
    if-ge v8, v7, :cond_2

    .line 66
    .line 67
    if-eqz v8, :cond_1

    .line 68
    .line 69
    const-string v9, ", "

    .line 70
    .line 71
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-virtual {v2, v8}, Lkj0;->e(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    check-cast v9, Lo43;

    .line 79
    .line 80
    invoke-virtual {v9}, Lo43;->b()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    add-int/lit8 v8, v8, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const-string v2, ")"

    .line 91
    .line 92
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Liy0;->f()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const/16 p0, 0x20

    .line 108
    .line 109
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p2, p0, v5}, Lyn;->c(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    new-instance p0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v2, "  shorty_idx:      "

    .line 129
    .line 130
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v0}, Lpp0;->K(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v2, " // "

    .line 141
    .line 142
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Lq30;->g()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    const/4 v1, 0x4

    .line 157
    invoke-virtual {p2, p0, v1}, Lyn;->c(Ljava/lang/String;I)V

    .line 158
    .line 159
    .line 160
    new-instance p0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v5, "  return_type_idx: "

    .line 163
    .line 164
    invoke-direct {p0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1}, Lpp0;->K(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Lo43;->b()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p2, p0, v1}, Lyn;->c(Ljava/lang/String;I)V

    .line 189
    .line 190
    .line 191
    invoke-static {v3}, Lpp0;->K(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    const-string v2, "  parameters_off:  "

    .line 196
    .line 197
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-virtual {p2, p0, v1}, Lyn;->c(Ljava/lang/String;I)V

    .line 202
    .line 203
    .line 204
    :cond_3
    invoke-virtual {p2, v0}, Lyn;->j(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, p1}, Lyn;->j(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, v3}, Lyn;->j(I)V

    .line 211
    .line 212
    .line 213
    return-void
.end method
