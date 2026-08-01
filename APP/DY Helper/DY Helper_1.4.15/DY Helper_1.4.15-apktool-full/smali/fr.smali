.class public final Lfr;
.super Lxl1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:Ljava/util/ArrayList;

.field public ζ:Ljava/util/ArrayList;

.field public η:Ljava/util/ArrayList;

.field public θ:Ljava/util/ArrayList;

.field public ι:Ljava/util/ArrayList;

.field public κ:Ljava/util/ArrayList;

.field public λ:Ljava/util/ArrayList;

.field public μ:Ljava/util/ArrayList;

.field public ν:Ljava/util/ArrayList;

.field public ξ:Ljava/util/ArrayList;

.field public ο:Ljava/util/ArrayList;


# direct methods
.method public static γ(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {v0, p0}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    throw p0
.end method


# virtual methods
.method public final α()V
    .locals 8

    .line 1
    iget-object v0, p0, Lfr;->λ:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lfr;->ι:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, p0, Lfr;->κ:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v3, p0, Lfr;->θ:Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v4, p0, Lfr;->ζ:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v5, p0, Lfr;->ε:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v6, p0, Lfr;->η:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    add-int/lit8 v7, v7, -0x1

    .line 20
    .line 21
    if-gez v7, :cond_d

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    add-int/lit8 v6, v6, -0x1

    .line 28
    .line 29
    :goto_0
    if-ltz v6, :cond_2

    .line 30
    .line 31
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    if-nez v7, :cond_1

    .line 36
    .line 37
    iget-object v7, p0, Lxl1;->α:Lrk0;

    .line 38
    .line 39
    if-nez v7, :cond_0

    .line 40
    .line 41
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    add-int/lit8 v6, v6, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    throw p0

    .line 49
    :cond_1
    invoke-static {}, Lγ;->β()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    add-int/lit8 v5, v5, -0x1

    .line 58
    .line 59
    if-gez v5, :cond_c

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    add-int/lit8 v4, v4, -0x1

    .line 66
    .line 67
    if-gez v4, :cond_b

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lfr;->β()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_3

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    add-int/lit8 v3, v3, -0x1

    .line 84
    .line 85
    :goto_1
    if-ltz v3, :cond_5

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    add-int/lit8 v5, v5, -0x1

    .line 98
    .line 99
    if-gez v5, :cond_4

    .line 100
    .line 101
    add-int/lit8 v3, v3, -0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    invoke-static {v5, v4}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    throw p0

    .line 109
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    add-int/lit8 v2, v2, -0x1

    .line 114
    .line 115
    :goto_2
    if-ltz v2, :cond_7

    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    check-cast v3, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    add-int/lit8 v4, v4, -0x1

    .line 128
    .line 129
    if-gez v4, :cond_6

    .line 130
    .line 131
    add-int/lit8 v2, v2, -0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    invoke-static {v4, v3}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    throw p0

    .line 139
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    add-int/lit8 v1, v1, -0x1

    .line 144
    .line 145
    :goto_3
    if-ltz v1, :cond_9

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    add-int/lit8 v3, v3, -0x1

    .line 158
    .line 159
    if-gez v3, :cond_8

    .line 160
    .line 161
    add-int/lit8 v1, v1, -0x1

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_8
    invoke-static {v3, v2}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    throw p0

    .line 169
    :cond_9
    iget-object v0, p0, Lfr;->ξ:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-static {v0}, Lfr;->γ(Ljava/util/ArrayList;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lfr;->ν:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-static {v0}, Lfr;->γ(Ljava/util/ArrayList;)V

    .line 177
    .line 178
    .line 179
    iget-object v0, p0, Lfr;->μ:Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-static {v0}, Lfr;->γ(Ljava/util/ArrayList;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Lfr;->ο:Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-static {v0}, Lfr;->γ(Ljava/util/ArrayList;)V

    .line 187
    .line 188
    .line 189
    iget-object p0, p0, Lxl1;->β:Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-gtz v0, :cond_a

    .line 196
    .line 197
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_a
    const/4 v0, 0x0

    .line 202
    invoke-static {v0, p0}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    throw p0

    .line 207
    :cond_b
    invoke-static {v4, v3}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    throw p0

    .line 212
    :cond_c
    invoke-static {v5, v4}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    throw p0

    .line 217
    :cond_d
    invoke-static {v7, v6}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    throw p0
.end method

.method public final β()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lfr;->ζ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lfr;->θ:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lfr;->η:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lfr;->ε:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lfr;->ν:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, Lfr;->ξ:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-object v0, p0, Lfr;->μ:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, Lfr;->ο:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    iget-object v0, p0, Lfr;->κ:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    iget-object v0, p0, Lfr;->ι:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    iget-object p0, p0, Lfr;->λ:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-nez p0, :cond_0

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    const/4 p0, 0x0

    .line 91
    return p0

    .line 92
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 93
    return p0
.end method
