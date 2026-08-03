.class public final Lr4/b;
.super Lr4/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lt4/b;

.field public final l:[Lr4/a;


# direct methods
.method public constructor <init>(Lt4/b;Lr4/p;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p1, Lt4/b;->h:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const/4 v2, 0x4

    .line 8
    mul-int/2addr v1, v2

    .line 9
    add-int/2addr v1, v2

    .line 10
    invoke-direct {p0, v2, v1}, Lr4/l0;-><init>(II)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lr4/b;->k:Lt4/b;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    new-array p1, p1, [Lr4/a;

    .line 20
    .line 21
    iput-object p1, p0, Lr4/b;->l:[Lr4/a;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/4 v0, 0x0

    .line 36
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lt4/a;

    .line 47
    .line 48
    iget-object v2, p0, Lr4/b;->l:[Lr4/a;

    .line 49
    .line 50
    new-instance v3, Lr4/a;

    .line 51
    .line 52
    invoke-direct {v3, p2, v1}, Lr4/a;-><init>(Lr4/p;Lt4/a;)V

    .line 53
    .line 54
    .line 55
    aput-object v3, v2, v0

    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return-void

    .line 61
    :catch_0
    const-string p1, "list == null"

    .line 62
    .line 63
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    throw p1
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 4

    .line 1
    iget-object p1, p1, Lr4/p;->o:Lr4/k0;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/b;->l:[Lr4/a;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_0

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {p1, v3}, Lr4/k0;->l(Lr4/l0;)Lr4/l0;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Lr4/a;

    .line 16
    .line 17
    aput-object v3, v0, v2

    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->v:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Lr4/l0;)I
    .locals 1

    .line 1
    check-cast p1, Lr4/b;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/b;->k:Lt4/b;

    .line 4
    .line 5
    iget-object p1, p1, Lr4/b;->k:Lt4/b;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lt4/b;->o(Lt4/b;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/b;->k:Lt4/b;

    .line 2
    .line 3
    iget-object v0, v0, Lt4/b;->h:Ljava/util/TreeMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final j(Lr4/k0;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lr4/b;->l:[Lr4/a;

    .line 2
    .line 3
    sget-object p2, Lr4/a;->n:La9/h;

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/b;->k:Lt4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt4/b;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final m(Lr4/p;Lz4/d;)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lr4/b;->l:[Lr4/a;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x4

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lr4/l0;->g()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    const-string v5, " annotation set"

    .line 17
    .line 18
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {p2, v3, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, La/a;->Y0(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "  size: "

    .line 30
    .line 31
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {p2, v2, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p2, v1}, Lz4/d;->k(I)V

    .line 39
    .line 40
    .line 41
    move v4, v3

    .line 42
    :goto_0
    if-ge v4, v1, :cond_2

    .line 43
    .line 44
    aget-object v5, v0, v4

    .line 45
    .line 46
    invoke-virtual {v5}, Lr4/l0;->f()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    new-instance v6, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v7, "  entries["

    .line 55
    .line 56
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v7, "]: "

    .line 67
    .line 68
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-static {v5}, La/a;->Y0(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {p2, v2, v6}, Lz4/d;->b(ILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    aget-object v6, v0, v4

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object v6, v6, Lr4/a;->k:Lt4/a;

    .line 91
    .line 92
    iget v7, v6, Lt4/a;->i:I

    .line 93
    .line 94
    invoke-static {v7}, Lp/a;->c(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    const-string v8, "    visibility: "

    .line 99
    .line 100
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {p2, v3, v7}, Lz4/d;->b(ILjava/lang/String;)V

    .line 105
    .line 106
    .line 107
    new-instance v7, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v8, "    type: "

    .line 110
    .line 111
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object v8, v6, Lt4/a;->h:Lv4/d0;

    .line 115
    .line 116
    iget-object v8, v8, Lv4/d0;->g:Lw4/c;

    .line 117
    .line 118
    invoke-virtual {v8}, Lw4/c;->a()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {p2, v3, v7}, Lz4/d;->b(ILjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v6, v6, Lt4/a;->j:Ljava/util/TreeMap;

    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    if-eqz v7, :cond_1

    .line 151
    .line 152
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    check-cast v7, Lt4/d;

    .line 157
    .line 158
    iget-object v8, v7, Lt4/d;->g:Lv4/c0;

    .line 159
    .line 160
    iget-object v7, v7, Lt4/d;->h:Lv4/a;

    .line 161
    .line 162
    new-instance v9, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v10, "    "

    .line 165
    .line 166
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8}, Lv4/c0;->a()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v8, ": "

    .line 177
    .line 178
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-static {v7}, Lp4/t;->q(Lv4/a;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-virtual {p2, v3, v7}, Lz4/d;->b(ILjava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_1
    invoke-virtual {p2, v5}, Lz4/d;->k(I)V

    .line 197
    .line 198
    .line 199
    add-int/lit8 v4, v4, 0x1

    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_2
    return-void
.end method
