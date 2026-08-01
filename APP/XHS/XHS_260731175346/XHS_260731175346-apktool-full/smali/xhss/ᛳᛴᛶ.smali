.class public abstract Lxhss/ᛳᛴᛶ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# direct methods
.method public static ᛵᛲᲁᛶ(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 1
    const-string v0, "|"

    .line 2
    .line 3
    invoke-static {v0}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_e

    .line 9
    .line 10
    new-instance v1, Lxhss/ᛶᲈᛱᛶ;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lxhss/ᛶᲈᛱᛶ;-><init>(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lxhss/ᛶᲈᛱᛶ;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    sget-object v1, Lxhss/ᛵᛷᛶᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛷᛶᛱ;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v1}, Lxhss/ᛶᲈᛱᛶ;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v1}, Lxhss/ᛶᲈᛱᛶ;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {v1}, Lxhss/ᛶᲈᛱᛶ;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    invoke-virtual {v1}, Lxhss/ᛶᲈᛱᛶ;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v1, v4

    .line 62
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    invoke-static {v1}, Lxhss/ᛱᲀᛷᛳ;->ᛲᛴᲇᛲ(Ljava/util/List;)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    new-instance v4, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const/4 v5, 0x0

    .line 83
    move v6, v5

    .line 84
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_d

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    add-int/lit8 v8, v6, 0x1

    .line 95
    .line 96
    if-ltz v6, :cond_c

    .line 97
    .line 98
    check-cast v7, Ljava/lang/String;

    .line 99
    .line 100
    if-eqz v6, :cond_3

    .line 101
    .line 102
    if-ne v6, v3, :cond_4

    .line 103
    .line 104
    :cond_3
    invoke-static {v7}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-eqz v6, :cond_4

    .line 109
    .line 110
    move-object v7, v2

    .line 111
    goto :goto_5

    .line 112
    :cond_4
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    move v9, v5

    .line 117
    :goto_3
    const/4 v10, -0x1

    .line 118
    if-ge v9, v6, :cond_6

    .line 119
    .line 120
    invoke-virtual {v7, v9}, Ljava/lang/String;->charAt(I)C

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    invoke-static {v11}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    if-nez v12, :cond_5

    .line 129
    .line 130
    invoke-static {v11}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    if-eqz v11, :cond_7

    .line 135
    .line 136
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_6
    move v9, v10

    .line 140
    :cond_7
    if-ne v9, v10, :cond_9

    .line 141
    .line 142
    :cond_8
    move-object v6, v2

    .line 143
    goto :goto_4

    .line 144
    :cond_9
    invoke-virtual {v7, v0, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-eqz v6, :cond_8

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    add-int/2addr v6, v9

    .line 155
    invoke-virtual {v7, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    :goto_4
    if-eqz v6, :cond_a

    .line 160
    .line 161
    move-object v7, v6

    .line 162
    :cond_a
    :goto_5
    if-eqz v7, :cond_b

    .line 163
    .line 164
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    :cond_b
    move v6, v8

    .line 168
    goto :goto_2

    .line 169
    :cond_c
    invoke-static {}, Lxhss/ᛱᲀᛷᛳ;->ᛳᛸᛵᲀ()V

    .line 170
    .line 171
    .line 172
    throw v2

    .line 173
    :cond_d
    new-instance v5, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v5, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 176
    .line 177
    .line 178
    const-string v7, ""

    .line 179
    .line 180
    const-string v9, "..."

    .line 181
    .line 182
    const-string v6, "\n"

    .line 183
    .line 184
    const/4 v10, 0x0

    .line 185
    move-object v8, v7

    .line 186
    invoke-static/range {v4 .. v10}, Lxhss/ᛷᲇᛵᛳ;->ᲁᛷᲇᲇ(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lxhss/ᛷᛴᛲᛲ;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    return-object p0

    .line 194
    :cond_e
    const-string p0, "marginPrefix must be non-blank string."

    .line 195
    .line 196
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return-object v2
.end method
