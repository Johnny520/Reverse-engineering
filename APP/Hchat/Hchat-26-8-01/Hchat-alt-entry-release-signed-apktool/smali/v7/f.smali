.class public final Lv7/f;
.super Lv7/i0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lk7/a;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "null"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lr7/b;->k:[B

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    array-length v3, v1

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x2

    .line 19
    if-ge v3, v5, :cond_1

    .line 20
    .line 21
    move v1, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const v3, 0xffff

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v4}, Lk7/a;->w([BI)S

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    and-int/2addr v1, v3

    .line 31
    :goto_0
    const/16 v3, 0x10

    .line 32
    .line 33
    if-eq v2, v3, :cond_2

    .line 34
    .line 35
    const-string v3, "size="

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    :cond_2
    if-eq v2, v1, :cond_3

    .line 44
    .line 45
    const-string v2, ", readSize="

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_3
    iget-object v1, p0, Lr7/b;->k:[B

    .line 54
    .line 55
    invoke-static {v1, v5, v4}, Lk7/a;->q([BII)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    const-string v1, " complex"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    :cond_4
    iget-object v1, p0, Lr7/b;->k:[B

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    invoke-static {v1, v5, v2}, Lk7/a;->q([BII)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    const-string v1, ", public"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    :cond_5
    iget-object v1, p0, Lr7/b;->k:[B

    .line 81
    .line 82
    invoke-static {v1, v5, v5}, Lk7/a;->q([BII)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_6

    .line 87
    .line 88
    const-string v1, ", weak"

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    :cond_6
    invoke-virtual {p0}, Lv7/i0;->N()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    const/4 v2, 0x0

    .line 98
    if-gez v1, :cond_7

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_7
    iget-object v3, p0, Lk7/a;->h:Lk7/a;

    .line 102
    .line 103
    :goto_1
    if-eqz v3, :cond_9

    .line 104
    .line 105
    instance-of v4, v3, Ll7/g;

    .line 106
    .line 107
    if-eqz v4, :cond_8

    .line 108
    .line 109
    check-cast v3, Ll7/g;

    .line 110
    .line 111
    invoke-interface {v3}, Ll7/g;->a()Lu7/c;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    goto :goto_2

    .line 116
    :cond_8
    iget-object v3, v3, Lk7/a;->h:Lk7/a;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_9
    move-object v3, v2

    .line 120
    :goto_2
    if-nez v3, :cond_a

    .line 121
    .line 122
    :goto_3
    move-object v1, v2

    .line 123
    goto :goto_4

    .line 124
    :cond_a
    invoke-virtual {v3, v1}, Lu7/c;->V(I)Lr7/s;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    :goto_4
    if-eqz v1, :cond_b

    .line 129
    .line 130
    iget-object v2, v1, Lr7/r;->m:Ljava/lang/String;

    .line 131
    .line 132
    :cond_b
    if-eqz v2, :cond_c

    .line 133
    .line 134
    const-string v1, ", name="

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_c
    const-string v1, ", key="

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lv7/i0;->N()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    :goto_5
    iget-object v1, p0, Lr7/b;->k:[B

    .line 156
    .line 157
    const/16 v2, 0x8

    .line 158
    .line 159
    invoke-static {v1, v2}, Lk7/a;->s([BI)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_d

    .line 164
    .line 165
    const-string v1, ", parentId="

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, Lr7/b;->k:[B

    .line 171
    .line 172
    invoke-static {v1, v2}, Lk7/a;->s([BI)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-static {v1, v2}, Ly7/a;->k(II)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    :cond_d
    const-string v1, ", count="

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    iget-object v1, p0, Lr7/b;->k:[B

    .line 189
    .line 190
    const/16 v2, 0xc

    .line 191
    .line 192
    invoke-static {v1, v2}, Lk7/a;->s([BI)I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    return-object v0
.end method
