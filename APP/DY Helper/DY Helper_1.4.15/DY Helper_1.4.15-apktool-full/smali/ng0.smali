.class public final Lng0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Ljava/lang/String;

.field public β:Ljava/lang/String;

.field public γ:Ljava/lang/String;

.field public δ:Ljava/lang/String;

.field public ε:I

.field public final ζ:Ljava/util/ArrayList;

.field public η:Ljava/util/ArrayList;

.field public θ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lng0;->β:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lng0;->γ:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Lng0;->ε:I

    .line 12
    .line 13
    filled-new-array {v0}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lyh;->г([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lng0;->ζ:Ljava/util/ArrayList;

    .line 22
    .line 23
    return-void
.end method

.method public static δ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gt v1, v2, :cond_3

    .line 12
    .line 13
    const/16 v2, 0x26

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-static {p0, v2, v1, v3}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :cond_0
    const/16 v5, 0x3d

    .line 28
    .line 29
    invoke-static {p0, v5, v1, v3}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eq v3, v4, :cond_2

    .line 34
    .line 35
    if-le v3, v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :goto_2
    add-int/lit8 v1, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lng0;->α:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "://"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v1, "//"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v1, p0, Lng0;->β:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v2, 0x3a

    .line 31
    .line 32
    if-lez v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v1, p0, Lng0;->γ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-lez v1, :cond_3

    .line 42
    .line 43
    :goto_1
    iget-object v1, p0, Lng0;->β:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lng0;->γ:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-lez v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lng0;->γ:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_2
    const/16 v1, 0x40

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v1, p0, Lng0;->δ:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-static {v1, v2}, Lq02;->Φ(Ljava/lang/CharSequence;C)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    const/16 v1, 0x5b

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lng0;->δ:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 v1, 0x5d

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    iget-object v1, p0, Lng0;->δ:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_2
    iget v1, p0, Lng0;->ε:I

    .line 101
    .line 102
    const/4 v3, -0x1

    .line 103
    if-ne v1, v3, :cond_6

    .line 104
    .line 105
    iget-object v1, p0, Lng0;->α:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v1, :cond_a

    .line 108
    .line 109
    :cond_6
    invoke-virtual {p0}, Lng0;->β()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    iget-object v4, p0, Lng0;->α:Ljava/lang/String;

    .line 114
    .line 115
    if-eqz v4, :cond_9

    .line 116
    .line 117
    const-string v5, "http"

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    const/16 v3, 0x50

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_7
    const-string v5, "https"

    .line 129
    .line 130
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_8

    .line 135
    .line 136
    const/16 v3, 0x1bb

    .line 137
    .line 138
    :cond_8
    :goto_3
    if-eq v1, v3, :cond_a

    .line 139
    .line 140
    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    :cond_a
    iget-object v1, p0, Lng0;->ζ:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    const/4 v3, 0x0

    .line 153
    move v4, v3

    .line 154
    :goto_4
    if-ge v4, v2, :cond_b

    .line 155
    .line 156
    const/16 v5, 0x2f

    .line 157
    .line 158
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    check-cast v5, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    add-int/lit8 v4, v4, 0x1

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_b
    iget-object v1, p0, Lng0;->η:Ljava/util/ArrayList;

    .line 174
    .line 175
    if-eqz v1, :cond_10

    .line 176
    .line 177
    const/16 v1, 0x3f

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lng0;->η:Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-static {v3, v2}, Lj81;->Σ(II)Lxm0;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    const/4 v3, 0x2

    .line 196
    invoke-static {v3, v2}, Lj81;->Ξ(ILxm0;)Lvm0;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    iget v3, v2, Lvm0;->ε:I

    .line 201
    .line 202
    iget v4, v2, Lvm0;->ζ:I

    .line 203
    .line 204
    iget v2, v2, Lvm0;->η:I

    .line 205
    .line 206
    if-lez v2, :cond_c

    .line 207
    .line 208
    if-le v3, v4, :cond_d

    .line 209
    .line 210
    :cond_c
    if-gez v2, :cond_10

    .line 211
    .line 212
    if-gt v4, v3, :cond_10

    .line 213
    .line 214
    :cond_d
    :goto_5
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    check-cast v5, Ljava/lang/String;

    .line 219
    .line 220
    add-int/lit8 v6, v3, 0x1

    .line 221
    .line 222
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    check-cast v6, Ljava/lang/String;

    .line 227
    .line 228
    if-lez v3, :cond_e

    .line 229
    .line 230
    const/16 v7, 0x26

    .line 231
    .line 232
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    :cond_e
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    if-eqz v6, :cond_f

    .line 239
    .line 240
    const/16 v5, 0x3d

    .line 241
    .line 242
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    :cond_f
    if-eq v3, v4, :cond_10

    .line 249
    .line 250
    add-int/2addr v3, v2

    .line 251
    goto :goto_5

    .line 252
    :cond_10
    iget-object v1, p0, Lng0;->θ:Ljava/lang/String;

    .line 253
    .line 254
    if-eqz v1, :cond_11

    .line 255
    .line 256
    const/16 v1, 0x23

    .line 257
    .line 258
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    iget-object p0, p0, Lng0;->θ:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    :cond_11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    return-object p0
.end method

.method public final α()Log0;
    .locals 12

    .line 1
    iget-object v1, p0, Lng0;->α:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v1, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lng0;->β:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x7

    .line 9
    invoke-static {v2, v2, v3, v0}, Lbd;->Κ(IIILjava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v4, p0, Lng0;->γ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v2, v2, v3, v4}, Lbd;->Κ(IIILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    move v5, v3

    .line 20
    move-object v3, v4

    .line 21
    iget-object v4, p0, Lng0;->δ:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v4, :cond_5

    .line 24
    .line 25
    move v6, v5

    .line 26
    invoke-virtual {p0}, Lng0;->β()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    new-instance v7, Ljava/util/ArrayList;

    .line 31
    .line 32
    iget-object v8, p0, Lng0;->ζ:Ljava/util/ArrayList;

    .line 33
    .line 34
    const/16 v9, 0xa

    .line 35
    .line 36
    invoke-static {v8, v9}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-eqz v10, :cond_0

    .line 52
    .line 53
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    check-cast v10, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v2, v2, v6, v10}, Lbd;->Κ(IIILjava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    iget-object v7, p0, Lng0;->η:Ljava/util/ArrayList;

    .line 68
    .line 69
    const/4 v8, 0x0

    .line 70
    if-eqz v7, :cond_2

    .line 71
    .line 72
    new-instance v10, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-static {v7, v9}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    if-eqz v9, :cond_3

    .line 90
    .line 91
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    check-cast v9, Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v9, :cond_1

    .line 98
    .line 99
    const/4 v11, 0x3

    .line 100
    invoke-static {v2, v2, v11, v9}, Lbd;->Κ(IIILjava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    goto :goto_2

    .line 105
    :cond_1
    move-object v9, v8

    .line 106
    :goto_2
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    move-object v10, v8

    .line 111
    :cond_3
    iget-object v7, p0, Lng0;->θ:Ljava/lang/String;

    .line 112
    .line 113
    if-eqz v7, :cond_4

    .line 114
    .line 115
    invoke-static {v2, v2, v6, v7}, Lbd;->Κ(IIILjava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    :cond_4
    move-object v7, v8

    .line 120
    invoke-virtual {p0}, Lng0;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    move-object v2, v0

    .line 125
    new-instance v0, Log0;

    .line 126
    .line 127
    move-object v6, v10

    .line 128
    invoke-direct/range {v0 .. v8}, Log0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_5
    const-string p0, "host == null"

    .line 133
    .line 134
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :goto_3
    const/4 p0, 0x0

    .line 138
    return-object p0

    .line 139
    :cond_6
    const-string p0, "scheme == null"

    .line 140
    .line 141
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    goto :goto_3
.end method

.method public final β()I
    .locals 2

    .line 1
    iget v0, p0, Lng0;->ε:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object p0, p0, Lng0;->α:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v0, "http"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/16 v1, 0x50

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string v0, "https"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    const/16 v1, 0x1bb

    .line 32
    .line 33
    :cond_2
    :goto_0
    return v1
.end method

.method public final γ(Log0;Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, Lsd2;->α:[B

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-static {v4, v3, v2}, Lsd2;->η(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-static {v3, v5, v2}, Lsd2;->θ(IILjava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    sub-int v6, v5, v3

    .line 27
    .line 28
    const/16 v7, 0x30

    .line 29
    .line 30
    const/16 v8, 0x5b

    .line 31
    .line 32
    const/16 v9, 0x3a

    .line 33
    .line 34
    const/4 v10, -0x1

    .line 35
    const/4 v11, 0x2

    .line 36
    if-ge v6, v11, :cond_1

    .line 37
    .line 38
    :cond_0
    :goto_0
    move v6, v10

    .line 39
    goto :goto_3

    .line 40
    :cond_1
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    const/16 v12, 0x61

    .line 45
    .line 46
    invoke-static {v6, v12}, Lln0;->ο(II)I

    .line 47
    .line 48
    .line 49
    move-result v13

    .line 50
    const/16 v14, 0x41

    .line 51
    .line 52
    if-ltz v13, :cond_2

    .line 53
    .line 54
    const/16 v13, 0x7a

    .line 55
    .line 56
    invoke-static {v6, v13}, Lln0;->ο(II)I

    .line 57
    .line 58
    .line 59
    move-result v13

    .line 60
    if-lez v13, :cond_3

    .line 61
    .line 62
    :cond_2
    invoke-static {v6, v14}, Lln0;->ο(II)I

    .line 63
    .line 64
    .line 65
    move-result v13

    .line 66
    if-ltz v13, :cond_0

    .line 67
    .line 68
    const/16 v13, 0x5a

    .line 69
    .line 70
    invoke-static {v6, v13}, Lln0;->ο(II)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-lez v6, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    add-int/lit8 v6, v3, 0x1

    .line 78
    .line 79
    :goto_1
    if-ge v6, v5, :cond_0

    .line 80
    .line 81
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    if-gt v12, v13, :cond_4

    .line 86
    .line 87
    const/16 v15, 0x7b

    .line 88
    .line 89
    if-ge v13, v15, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    if-gt v14, v13, :cond_5

    .line 93
    .line 94
    if-ge v13, v8, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    if-gt v7, v13, :cond_6

    .line 98
    .line 99
    if-ge v13, v9, :cond_6

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    const/16 v15, 0x2b

    .line 103
    .line 104
    if-eq v13, v15, :cond_8

    .line 105
    .line 106
    const/16 v15, 0x2d

    .line 107
    .line 108
    if-eq v13, v15, :cond_8

    .line 109
    .line 110
    const/16 v15, 0x2e

    .line 111
    .line 112
    if-ne v13, v15, :cond_7

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_7
    if-ne v13, v9, :cond_0

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_8
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :goto_3
    const-string v12, "http"

    .line 122
    .line 123
    const-string v13, "https"

    .line 124
    .line 125
    const/4 v14, 0x1

    .line 126
    if-eq v6, v10, :cond_b

    .line 127
    .line 128
    const-string v15, "https:"

    .line 129
    .line 130
    invoke-static {v2, v15, v3, v14}, Lx02;->Ξ(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 131
    .line 132
    .line 133
    move-result v15

    .line 134
    if-eqz v15, :cond_9

    .line 135
    .line 136
    iput-object v13, v0, Lng0;->α:Ljava/lang/String;

    .line 137
    .line 138
    add-int/lit8 v3, v3, 0x6

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_9
    const-string v15, "http:"

    .line 142
    .line 143
    invoke-static {v2, v15, v3, v14}, Lx02;->Ξ(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    if-eqz v15, :cond_a

    .line 148
    .line 149
    iput-object v12, v0, Lng0;->α:Ljava/lang/String;

    .line 150
    .line 151
    add-int/lit8 v3, v3, 0x5

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 155
    .line 156
    invoke-virtual {v2, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    new-instance v2, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v3, "Expected URL scheme \'http\' or \'https\' but was \'"

    .line 163
    .line 164
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const/16 v1, 0x27

    .line 171
    .line 172
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v0

    .line 183
    :cond_b
    if-eqz v1, :cond_30

    .line 184
    .line 185
    iget-object v6, v1, Log0;->α:Ljava/lang/String;

    .line 186
    .line 187
    iput-object v6, v0, Lng0;->α:Ljava/lang/String;

    .line 188
    .line 189
    :goto_4
    move v6, v3

    .line 190
    move v15, v4

    .line 191
    :goto_5
    const/16 v7, 0x5c

    .line 192
    .line 193
    move/from16 v16, v14

    .line 194
    .line 195
    const/16 v14, 0x2f

    .line 196
    .line 197
    if-ge v6, v5, :cond_d

    .line 198
    .line 199
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    if-eq v8, v14, :cond_c

    .line 204
    .line 205
    if-eq v8, v7, :cond_c

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_c
    add-int/lit8 v15, v15, 0x1

    .line 209
    .line 210
    add-int/lit8 v6, v6, 0x1

    .line 211
    .line 212
    move/from16 v14, v16

    .line 213
    .line 214
    const/16 v8, 0x5b

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_d
    :goto_6
    const-string v8, " \"\'<>#"

    .line 218
    .line 219
    const-string v6, ""

    .line 220
    .line 221
    iget-object v9, v0, Lng0;->ζ:Ljava/util/ArrayList;

    .line 222
    .line 223
    const/16 v7, 0x23

    .line 224
    .line 225
    if-ge v15, v11, :cond_11

    .line 226
    .line 227
    if-eqz v1, :cond_11

    .line 228
    .line 229
    iget-object v11, v1, Log0;->α:Ljava/lang/String;

    .line 230
    .line 231
    iget-object v14, v0, Lng0;->α:Ljava/lang/String;

    .line 232
    .line 233
    invoke-static {v11, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    if-nez v11, :cond_e

    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_e
    invoke-virtual {v1}, Log0;->ε()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    iput-object v10, v0, Lng0;->β:Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual {v1}, Log0;->α()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    iput-object v10, v0, Lng0;->γ:Ljava/lang/String;

    .line 251
    .line 252
    iget-object v10, v1, Log0;->δ:Ljava/lang/String;

    .line 253
    .line 254
    iput-object v10, v0, Lng0;->δ:Ljava/lang/String;

    .line 255
    .line 256
    iget v10, v1, Log0;->ε:I

    .line 257
    .line 258
    iput v10, v0, Lng0;->ε:I

    .line 259
    .line 260
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1}, Log0;->γ()Ljava/util/ArrayList;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 268
    .line 269
    .line 270
    if-eq v3, v5, :cond_f

    .line 271
    .line 272
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    if-ne v10, v7, :cond_21

    .line 277
    .line 278
    :cond_f
    invoke-virtual {v1}, Log0;->δ()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    if-eqz v1, :cond_10

    .line 283
    .line 284
    const/16 v10, 0x53

    .line 285
    .line 286
    invoke-static {v1, v4, v4, v8, v10}, Lbd;->η(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-static {v1}, Lng0;->δ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    goto :goto_7

    .line 295
    :cond_10
    const/4 v1, 0x0

    .line 296
    :goto_7
    iput-object v1, v0, Lng0;->η:Ljava/util/ArrayList;

    .line 297
    .line 298
    goto/16 :goto_12

    .line 299
    .line 300
    :cond_11
    :goto_8
    add-int/2addr v3, v15

    .line 301
    move v1, v4

    .line 302
    move v11, v1

    .line 303
    :goto_9
    const-string v14, "@/\\?#"

    .line 304
    .line 305
    invoke-static {v3, v5, v2, v14}, Lsd2;->γ(IILjava/lang/String;Ljava/lang/String;)I

    .line 306
    .line 307
    .line 308
    move-result v14

    .line 309
    if-eq v14, v5, :cond_12

    .line 310
    .line 311
    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    .line 312
    .line 313
    .line 314
    move-result v15

    .line 315
    goto :goto_a

    .line 316
    :cond_12
    move v15, v10

    .line 317
    :goto_a
    if-eq v15, v10, :cond_17

    .line 318
    .line 319
    if-eq v15, v7, :cond_17

    .line 320
    .line 321
    const/16 v4, 0x2f

    .line 322
    .line 323
    if-eq v15, v4, :cond_17

    .line 324
    .line 325
    const/16 v4, 0x5c

    .line 326
    .line 327
    if-eq v15, v4, :cond_17

    .line 328
    .line 329
    const/16 v4, 0x3f

    .line 330
    .line 331
    if-eq v15, v4, :cond_17

    .line 332
    .line 333
    const/16 v4, 0x40

    .line 334
    .line 335
    if-eq v15, v4, :cond_13

    .line 336
    .line 337
    const/4 v4, 0x0

    .line 338
    goto :goto_9

    .line 339
    :cond_13
    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    .line 340
    .line 341
    const-string v15, "%40"

    .line 342
    .line 343
    if-nez v1, :cond_16

    .line 344
    .line 345
    const/16 v7, 0x3a

    .line 346
    .line 347
    invoke-static {v2, v7, v3, v14}, Lsd2;->δ(Ljava/lang/String;CII)I

    .line 348
    .line 349
    .line 350
    move-result v10

    .line 351
    const/16 v7, 0x70

    .line 352
    .line 353
    invoke-static {v2, v3, v10, v4, v7}, Lbd;->η(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    if-eqz v11, :cond_14

    .line 358
    .line 359
    new-instance v7, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 362
    .line 363
    .line 364
    iget-object v11, v0, Lng0;->β:Ljava/lang/String;

    .line 365
    .line 366
    invoke-static {v7, v11, v15, v3}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    :cond_14
    iput-object v3, v0, Lng0;->β:Ljava/lang/String;

    .line 371
    .line 372
    if-eq v10, v14, :cond_15

    .line 373
    .line 374
    add-int/lit8 v10, v10, 0x1

    .line 375
    .line 376
    const/16 v7, 0x70

    .line 377
    .line 378
    invoke-static {v2, v10, v14, v4, v7}, Lbd;->η(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    iput-object v1, v0, Lng0;->γ:Ljava/lang/String;

    .line 383
    .line 384
    move/from16 v1, v16

    .line 385
    .line 386
    goto :goto_b

    .line 387
    :cond_15
    const/16 v7, 0x70

    .line 388
    .line 389
    :goto_b
    move/from16 v11, v16

    .line 390
    .line 391
    goto :goto_c

    .line 392
    :cond_16
    const/16 v7, 0x70

    .line 393
    .line 394
    new-instance v10, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 397
    .line 398
    .line 399
    iget-object v7, v0, Lng0;->γ:Ljava/lang/String;

    .line 400
    .line 401
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const/16 v7, 0x70

    .line 408
    .line 409
    invoke-static {v2, v3, v14, v4, v7}, Lbd;->η(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    iput-object v3, v0, Lng0;->γ:Ljava/lang/String;

    .line 421
    .line 422
    :goto_c
    add-int/lit8 v3, v14, 0x1

    .line 423
    .line 424
    const/4 v4, 0x0

    .line 425
    const/16 v7, 0x23

    .line 426
    .line 427
    const/4 v10, -0x1

    .line 428
    goto :goto_9

    .line 429
    :cond_17
    move v1, v3

    .line 430
    :goto_d
    if-ge v1, v14, :cond_1a

    .line 431
    .line 432
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    const/16 v7, 0x3a

    .line 437
    .line 438
    if-eq v4, v7, :cond_1b

    .line 439
    .line 440
    const/16 v10, 0x5b

    .line 441
    .line 442
    if-eq v4, v10, :cond_18

    .line 443
    .line 444
    goto :goto_e

    .line 445
    :cond_18
    add-int/lit8 v1, v1, 0x1

    .line 446
    .line 447
    if-ge v1, v14, :cond_19

    .line 448
    .line 449
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    const/16 v11, 0x5d

    .line 454
    .line 455
    if-ne v4, v11, :cond_18

    .line 456
    .line 457
    :cond_19
    :goto_e
    add-int/lit8 v1, v1, 0x1

    .line 458
    .line 459
    goto :goto_d

    .line 460
    :cond_1a
    move v1, v14

    .line 461
    :cond_1b
    add-int/lit8 v4, v1, 0x1

    .line 462
    .line 463
    const/4 v7, 0x4

    .line 464
    const/16 v10, 0x22

    .line 465
    .line 466
    if-ge v4, v14, :cond_1e

    .line 467
    .line 468
    invoke-static {v3, v1, v7, v2}, Lbd;->Κ(IIILjava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v7

    .line 472
    invoke-static {v7}, Lqd2;->β(Ljava/lang/String;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v7

    .line 476
    iput-object v7, v0, Lng0;->δ:Ljava/lang/String;

    .line 477
    .line 478
    const/16 v7, 0x78

    .line 479
    .line 480
    :try_start_0
    invoke-static {v2, v4, v14, v6, v7}, Lbd;->η(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v7

    .line 484
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 485
    .line 486
    .line 487
    move-result v7
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 488
    move/from16 v11, v16

    .line 489
    .line 490
    if-gt v11, v7, :cond_1c

    .line 491
    .line 492
    const/high16 v11, 0x10000

    .line 493
    .line 494
    if-ge v7, v11, :cond_1c

    .line 495
    .line 496
    goto :goto_f

    .line 497
    :catch_0
    :cond_1c
    const/4 v7, -0x1

    .line 498
    :goto_f
    iput v7, v0, Lng0;->ε:I

    .line 499
    .line 500
    const/4 v11, -0x1

    .line 501
    if-eq v7, v11, :cond_1d

    .line 502
    .line 503
    goto :goto_11

    .line 504
    :cond_1d
    invoke-virtual {v2, v4, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    new-instance v1, Ljava/lang/StringBuilder;

    .line 509
    .line 510
    const-string v2, "Invalid URL port: \""

    .line 511
    .line 512
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    throw v1

    .line 535
    :cond_1e
    const/4 v11, -0x1

    .line 536
    invoke-static {v3, v1, v7, v2}, Lbd;->Κ(IIILjava/lang/String;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    invoke-static {v4}, Lqd2;->β(Ljava/lang/String;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    iput-object v4, v0, Lng0;->δ:Ljava/lang/String;

    .line 545
    .line 546
    iget-object v4, v0, Lng0;->α:Ljava/lang/String;

    .line 547
    .line 548
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v4, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v7

    .line 555
    if-eqz v7, :cond_1f

    .line 556
    .line 557
    const/16 v4, 0x50

    .line 558
    .line 559
    goto :goto_10

    .line 560
    :cond_1f
    invoke-virtual {v4, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    if-eqz v4, :cond_20

    .line 565
    .line 566
    const/16 v4, 0x1bb

    .line 567
    .line 568
    goto :goto_10

    .line 569
    :cond_20
    move v4, v11

    .line 570
    :goto_10
    iput v4, v0, Lng0;->ε:I

    .line 571
    .line 572
    :goto_11
    iget-object v4, v0, Lng0;->δ:Ljava/lang/String;

    .line 573
    .line 574
    if-eqz v4, :cond_2f

    .line 575
    .line 576
    move v3, v14

    .line 577
    :cond_21
    :goto_12
    const-string v1, "?#"

    .line 578
    .line 579
    invoke-static {v3, v5, v2, v1}, Lsd2;->γ(IILjava/lang/String;Ljava/lang/String;)I

    .line 580
    .line 581
    .line 582
    move-result v1

    .line 583
    if-ne v3, v1, :cond_22

    .line 584
    .line 585
    goto/16 :goto_18

    .line 586
    .line 587
    :cond_22
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 588
    .line 589
    .line 590
    move-result v4

    .line 591
    const/16 v7, 0x2f

    .line 592
    .line 593
    if-eq v4, v7, :cond_23

    .line 594
    .line 595
    const/16 v7, 0x5c

    .line 596
    .line 597
    if-eq v4, v7, :cond_23

    .line 598
    .line 599
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 600
    .line 601
    .line 602
    move-result v4

    .line 603
    const/16 v16, 0x1

    .line 604
    .line 605
    add-int/lit8 v4, v4, -0x1

    .line 606
    .line 607
    invoke-virtual {v9, v4, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    goto :goto_13

    .line 611
    :cond_23
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    add-int/lit8 v3, v3, 0x1

    .line 618
    .line 619
    :goto_13
    if-ge v3, v1, :cond_2c

    .line 620
    .line 621
    const-string v4, "/\\"

    .line 622
    .line 623
    invoke-static {v3, v1, v2, v4}, Lsd2;->γ(IILjava/lang/String;Ljava/lang/String;)I

    .line 624
    .line 625
    .line 626
    move-result v4

    .line 627
    if-ge v4, v1, :cond_24

    .line 628
    .line 629
    const/4 v11, 0x1

    .line 630
    goto :goto_14

    .line 631
    :cond_24
    const/4 v11, 0x0

    .line 632
    :goto_14
    const-string v7, " \"<>^`{}|/\\?#"

    .line 633
    .line 634
    const/16 v10, 0x70

    .line 635
    .line 636
    invoke-static {v2, v3, v4, v7, v10}, Lbd;->η(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    const-string v7, "."

    .line 641
    .line 642
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 643
    .line 644
    .line 645
    move-result v7

    .line 646
    if-nez v7, :cond_2a

    .line 647
    .line 648
    const-string v7, "%2e"

    .line 649
    .line 650
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 651
    .line 652
    .line 653
    move-result v7

    .line 654
    if-eqz v7, :cond_25

    .line 655
    .line 656
    goto/16 :goto_17

    .line 657
    .line 658
    :cond_25
    const-string v7, ".."

    .line 659
    .line 660
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v7

    .line 664
    if-nez v7, :cond_28

    .line 665
    .line 666
    const-string v7, "%2e."

    .line 667
    .line 668
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 669
    .line 670
    .line 671
    move-result v7

    .line 672
    if-nez v7, :cond_28

    .line 673
    .line 674
    const-string v7, ".%2e"

    .line 675
    .line 676
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 677
    .line 678
    .line 679
    move-result v7

    .line 680
    if-nez v7, :cond_28

    .line 681
    .line 682
    const-string v7, "%2e%2e"

    .line 683
    .line 684
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 685
    .line 686
    .line 687
    move-result v7

    .line 688
    if-eqz v7, :cond_26

    .line 689
    .line 690
    goto :goto_16

    .line 691
    :cond_26
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 692
    .line 693
    .line 694
    move-result v7

    .line 695
    const/16 v16, 0x1

    .line 696
    .line 697
    add-int/lit8 v7, v7, -0x1

    .line 698
    .line 699
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v7

    .line 703
    check-cast v7, Ljava/lang/CharSequence;

    .line 704
    .line 705
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 706
    .line 707
    .line 708
    move-result v7

    .line 709
    if-nez v7, :cond_27

    .line 710
    .line 711
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 712
    .line 713
    .line 714
    move-result v7

    .line 715
    add-int/lit8 v7, v7, -0x1

    .line 716
    .line 717
    invoke-virtual {v9, v7, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    goto :goto_15

    .line 721
    :cond_27
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    :goto_15
    if-eqz v11, :cond_2a

    .line 725
    .line 726
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    goto :goto_17

    .line 730
    :cond_28
    :goto_16
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 731
    .line 732
    .line 733
    move-result v3

    .line 734
    const/16 v16, 0x1

    .line 735
    .line 736
    add-int/lit8 v3, v3, -0x1

    .line 737
    .line 738
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    check-cast v3, Ljava/lang/String;

    .line 743
    .line 744
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    if-nez v3, :cond_29

    .line 749
    .line 750
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 751
    .line 752
    .line 753
    move-result v3

    .line 754
    if-nez v3, :cond_29

    .line 755
    .line 756
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 757
    .line 758
    .line 759
    move-result v3

    .line 760
    add-int/lit8 v3, v3, -0x1

    .line 761
    .line 762
    invoke-virtual {v9, v3, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    goto :goto_17

    .line 766
    :cond_29
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 767
    .line 768
    .line 769
    :cond_2a
    :goto_17
    if-eqz v11, :cond_2b

    .line 770
    .line 771
    add-int/lit8 v3, v4, 0x1

    .line 772
    .line 773
    goto/16 :goto_13

    .line 774
    .line 775
    :cond_2b
    move v3, v4

    .line 776
    goto/16 :goto_13

    .line 777
    .line 778
    :cond_2c
    :goto_18
    if-ge v1, v5, :cond_2d

    .line 779
    .line 780
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 781
    .line 782
    .line 783
    move-result v3

    .line 784
    const/16 v4, 0x3f

    .line 785
    .line 786
    if-ne v3, v4, :cond_2d

    .line 787
    .line 788
    const/16 v3, 0x23

    .line 789
    .line 790
    invoke-static {v2, v3, v1, v5}, Lsd2;->δ(Ljava/lang/String;CII)I

    .line 791
    .line 792
    .line 793
    move-result v4

    .line 794
    add-int/lit8 v1, v1, 0x1

    .line 795
    .line 796
    const/16 v3, 0x50

    .line 797
    .line 798
    invoke-static {v2, v1, v4, v8, v3}, Lbd;->η(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    invoke-static {v1}, Lng0;->δ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    iput-object v1, v0, Lng0;->η:Ljava/util/ArrayList;

    .line 807
    .line 808
    move v1, v4

    .line 809
    :cond_2d
    if-ge v1, v5, :cond_2e

    .line 810
    .line 811
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 812
    .line 813
    .line 814
    move-result v3

    .line 815
    const/16 v4, 0x23

    .line 816
    .line 817
    if-ne v3, v4, :cond_2e

    .line 818
    .line 819
    const/16 v16, 0x1

    .line 820
    .line 821
    add-int/lit8 v1, v1, 0x1

    .line 822
    .line 823
    const/16 v3, 0x30

    .line 824
    .line 825
    invoke-static {v2, v1, v5, v6, v3}, Lbd;->η(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    iput-object v1, v0, Lng0;->θ:Ljava/lang/String;

    .line 830
    .line 831
    :cond_2e
    return-void

    .line 832
    :cond_2f
    invoke-virtual {v2, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    new-instance v1, Ljava/lang/StringBuilder;

    .line 837
    .line 838
    const-string v2, "Invalid URL host: \""

    .line 839
    .line 840
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 854
    .line 855
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    throw v1

    .line 863
    :cond_30
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    const/4 v1, 0x6

    .line 868
    if-le v0, v1, :cond_31

    .line 869
    .line 870
    invoke-static {v2, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    const-string v1, "..."

    .line 875
    .line 876
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    goto :goto_19

    .line 881
    :cond_31
    move-object v0, v2

    .line 882
    :goto_19
    const-string v1, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    .line 883
    .line 884
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    return-void
.end method
