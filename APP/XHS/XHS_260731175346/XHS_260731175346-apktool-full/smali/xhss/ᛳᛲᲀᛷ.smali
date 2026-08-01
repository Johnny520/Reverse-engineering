.class public final Lxhss/ᛳᛲᲀᛷ;
.super Lxhss/ᛱᛶᛶᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final ᛳᲁᲇᛸ:Z


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lxhss/ᛳᛲᲀᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lxhss/ᛳᛲᲀᛷ;->ᛳᲁᲇᛸ:Z

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lxhss/ᛳᛲᲀᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lxhss/ᛳᛲᲀᛷ;->ᛳᲁᲇᛸ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lxhss/ᛳᛲᲀᛷ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lxhss/ᛳᛲᲀᛷ;

    .line 12
    .line 13
    iget-object p1, p1, Lxhss/ᛳᛲᲀᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p0, p0, Lxhss/ᛳᛲᲀᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 16
    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    if-nez p1, :cond_4

    .line 27
    .line 28
    :cond_3
    return v0

    .line 29
    :cond_4
    :goto_0
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᛲᲀᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ()Lxhss/ᛳᛲᲀᛷ;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final ᛷᲁᲁ()Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lxhss/ᛳᛲᲀᛷ;->ᛳᲁᲇᛸ:Z
    :try_end_0
    .catch Lxhss/ᲇᛳᲇᛷ; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛳᛲᲀᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    new-instance v0, Lxhss/ᲀᛱᛸᛶ;

    .line 9
    .line 10
    const/16 v1, -0x2001

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lxhss/ᲀᛱᛸᛶ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object v2, v0, Lxhss/ᲀᛱᛸᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛱᛳ;

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    new-instance v2, Lxhss/ᛸᛱᛱᛳ;

    .line 24
    .line 25
    invoke-direct {v2, v1}, Lxhss/ᛸᛱᛱᛳ;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v2, v0, Lxhss/ᲀᛱᛸᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛱᛳ;

    .line 29
    .line 30
    :cond_1
    sget-object v0, Lxhss/ᛵᲇᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 31
    .line 32
    iget-object v0, v0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lxhss/ᛸᛵᛷᲁ;

    .line 35
    .line 36
    invoke-virtual {v2, p0, v0}, Lxhss/ᛸᛱᛱᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;Lxhss/ᛵᛳᲈᛶ;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0
    :try_end_1
    .catch Lxhss/ᲇᛳᲇᛷ; {:try_start_1 .. :try_end_1} :catch_0

    .line 40
    return-object p0

    .line 41
    :catch_0
    move-exception p0

    .line 42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method public final ᛸᛷᲈᲈ(Lxhss/ᲈᲀᲇᛵ;)Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxhss/ᛳᛲᲀᛷ;->ᛷᲁᲁ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of p1, p1, Ljava/util/List;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-class p0, Ljava/util/List;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛳᛲᲀᛷ;->ᛷᲁᲁ()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    instance-of p1, p1, Ljava/util/Map;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const-class p0, Ljava/util/Map;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {p0}, Lxhss/ᛳᛲᲀᛷ;->ᛷᲁᲁ()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of p1, p1, Ljava/lang/Number;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    const-class p0, Ljava/lang/Number;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    invoke-virtual {p0}, Lxhss/ᛳᛲᲀᛷ;->ᛷᲁᲁ()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    instance-of p1, p1, Ljava/lang/String;

    .line 39
    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    const-class p0, Ljava/lang/String;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    invoke-virtual {p0}, Lxhss/ᛳᛲᲀᛷ;->ᛷᲁᲁ()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    instance-of p0, p0, Ljava/lang/Boolean;

    .line 50
    .line 51
    if-eqz p0, :cond_4

    .line 52
    .line 53
    const-class p0, Ljava/lang/Boolean;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    const-class p0, Ljava/lang/Void;

    .line 57
    .line 58
    return-object p0
.end method

.method public final ᲈᛳᲀ()Lxhss/ᛱᛶᛶᛱ;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lxhss/ᛳᛲᲀᛷ;->ᛷᲁᲁ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ljava/util/List;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lxhss/ᛲᛵᲈᲈ;->ᲇᛴᲇᛵ:Lxhss/ᲈᲀᛶ;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lxhss/ᛱᛸᛱᲁ;

    .line 13
    .line 14
    invoke-virtual {p0}, Lxhss/ᛳᛲᲀᛷ;->ᛷᲁᲁ()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/util/List;

    .line 19
    .line 20
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, v0, Lxhss/ᛱᛸᛱᲁ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_15

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v2, v0, Lxhss/ᛱᛸᛱᲁ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    sget-object v1, Lxhss/ᛲᛵᲈᲈ;->ᛷᛵᛵᲈ:Lxhss/ᲈᛷᛸᲇ;

    .line 53
    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :cond_1
    instance-of v3, v1, Lxhss/ᛱᛶᛶᛱ;

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    check-cast v1, Lxhss/ᛱᛶᛶᛱ;

    .line 61
    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :cond_2
    instance-of v3, v1, Ljava/lang/Class;

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    check-cast v1, Ljava/lang/Class;

    .line 69
    .line 70
    new-instance v3, Lxhss/ᲇᛴᲁᛷ;

    .line 71
    .line 72
    invoke-direct {v3, v1}, Lxhss/ᲇᛴᲁᛷ;-><init>(Ljava/lang/Class;)V

    .line 73
    .line 74
    .line 75
    :goto_1
    move-object v1, v3

    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :cond_3
    instance-of v3, v1, Ljava/lang/String;

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    if-nez v3, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-gtz v6, :cond_5

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    const/16 v7, 0x40

    .line 104
    .line 105
    if-eq v6, v7, :cond_6

    .line 106
    .line 107
    const/16 v7, 0x24

    .line 108
    .line 109
    if-ne v6, v7, :cond_7

    .line 110
    .line 111
    :cond_6
    :try_start_0
    new-array v6, v4, [Lxhss/ᛸᛷᲁᛵ;

    .line 112
    .line 113
    invoke-static {v5, v6}, Lxhss/ᛳᛱᛲᲀ;->ᲈᛳᲀ(Ljava/lang/String;[Lxhss/ᛸᛷᲁᛵ;)Lxhss/ᛴᲇᲀᛴ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    .line 115
    .line 116
    new-instance v3, Lxhss/ᲀᛴᲇ;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-direct {v3, v1, v4}, Lxhss/ᲀᛴᲇ;-><init>(Ljava/lang/CharSequence;Z)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :catch_0
    :cond_7
    :goto_2
    const/4 v5, 0x1

    .line 127
    if-nez v3, :cond_8

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-gt v7, v5, :cond_9

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_9
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    sub-int/2addr v8, v5

    .line 154
    invoke-virtual {v6, v8}, Ljava/lang/String;->charAt(I)C

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    const/16 v9, 0x5b

    .line 159
    .line 160
    if-ne v7, v9, :cond_a

    .line 161
    .line 162
    const/16 v9, 0x5d

    .line 163
    .line 164
    if-eq v8, v9, :cond_b

    .line 165
    .line 166
    :cond_a
    const/16 v9, 0x7b

    .line 167
    .line 168
    if-ne v7, v9, :cond_d

    .line 169
    .line 170
    const/16 v7, 0x7d

    .line 171
    .line 172
    if-ne v8, v7, :cond_d

    .line 173
    .line 174
    :cond_b
    :try_start_1
    new-instance v7, Lxhss/ᲀᛱᛸᛶ;

    .line 175
    .line 176
    const/16 v8, -0x2001

    .line 177
    .line 178
    invoke-direct {v7, v8}, Lxhss/ᲀᛱᛸᛶ;-><init>(I)V

    .line 179
    .line 180
    .line 181
    iget-object v9, v7, Lxhss/ᲀᛱᛸᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛱᛳ;

    .line 182
    .line 183
    if-nez v9, :cond_c

    .line 184
    .line 185
    new-instance v9, Lxhss/ᛸᛱᛱᛳ;

    .line 186
    .line 187
    invoke-direct {v9, v8}, Lxhss/ᛸᛱᛱᛳ;-><init>(I)V

    .line 188
    .line 189
    .line 190
    iput-object v9, v7, Lxhss/ᲀᛱᛸᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛱᛳ;

    .line 191
    .line 192
    :cond_c
    sget-object v7, Lxhss/ᛵᲇᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 193
    .line 194
    iget-object v7, v7, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v7, Lxhss/ᛸᛵᛷᲁ;

    .line 197
    .line 198
    invoke-virtual {v9, v6, v7}, Lxhss/ᛸᛱᛱᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;Lxhss/ᛵᛳᲈᛶ;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    new-instance v3, Lxhss/ᛳᛲᲀᛷ;

    .line 206
    .line 207
    invoke-direct {v3, v1}, Lxhss/ᛳᛲᲀᛷ;-><init>(Ljava/lang/CharSequence;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    .line 212
    :catch_1
    :cond_d
    :goto_3
    if-eqz v3, :cond_e

    .line 213
    .line 214
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    new-instance v3, Lxhss/ᲈᲇᛱᛶ;

    .line 219
    .line 220
    invoke-direct {v3, v1, v5}, Lxhss/ᲈᲇᛱᛶ;-><init>(Ljava/lang/CharSequence;Z)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :cond_e
    instance-of v3, v1, Ljava/lang/Character;

    .line 226
    .line 227
    if-eqz v3, :cond_f

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    new-instance v3, Lxhss/ᲈᲇᛱᛶ;

    .line 234
    .line 235
    invoke-direct {v3, v1, v4}, Lxhss/ᲈᲇᛱᛶ;-><init>(Ljava/lang/CharSequence;Z)V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_1

    .line 239
    .line 240
    :cond_f
    instance-of v3, v1, Ljava/lang/Number;

    .line 241
    .line 242
    if-eqz v3, :cond_10

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    new-instance v3, Lxhss/ᛸᛷᲈᛶ;

    .line 249
    .line 250
    invoke-direct {v3, v1}, Lxhss/ᛸᛷᲈᛶ;-><init>(Ljava/lang/CharSequence;)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_1

    .line 254
    .line 255
    :cond_10
    instance-of v3, v1, Ljava/lang/Boolean;

    .line 256
    .line 257
    if-eqz v3, :cond_12

    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-eqz v1, :cond_11

    .line 272
    .line 273
    sget-object v1, Lxhss/ᛲᛵᲈᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛳᛲᛸ;

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_11
    sget-object v1, Lxhss/ᛲᛵᲈᲈ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛳᛲᛸ;

    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_12
    instance-of v3, v1, Ljava/util/regex/Pattern;

    .line 280
    .line 281
    if-eqz v3, :cond_13

    .line 282
    .line 283
    check-cast v1, Ljava/util/regex/Pattern;

    .line 284
    .line 285
    new-instance v3, Lxhss/ᛱᲀᛴᛴ;

    .line 286
    .line 287
    invoke-direct {v3, v1}, Lxhss/ᛱᲀᛴᛴ;-><init>(Ljava/util/regex/Pattern;)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_1

    .line 291
    .line 292
    :cond_13
    instance-of v3, v1, Ljava/time/OffsetDateTime;

    .line 293
    .line 294
    if-eqz v3, :cond_14

    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    new-instance v3, Lxhss/ᛶᛳᛳᛶ;

    .line 301
    .line 302
    invoke-direct {v3, v1}, Lxhss/ᛶᛳᛳᛶ;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_1

    .line 306
    .line 307
    :goto_4
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    goto/16 :goto_0

    .line 311
    .line 312
    :cond_14
    new-instance p0, Lxhss/ᛵᛲᛲᲇ;

    .line 313
    .line 314
    const-string v0, "Could not determine value type"

    .line 315
    .line 316
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw p0

    .line 320
    :cond_15
    return-object v0
.end method
