.class public abstract Lyyds/ᛴᛱᲁᲈ;
.super Lyyds/ᛳᛵᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# direct methods
.method public static ᛱᛳᲇ(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 1
    const-string v0, "|"

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    invoke-static {p0}, Lyyds/ᛲᲇᛸᲇ;->ᲈᛷᲈᛶ(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lyyds/ᲈᛸᲁᛶ;->ᛳᲁᲁᲇ(Ljava/util/List;)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    new-instance v4, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v5, 0x0

    .line 35
    move v6, v5

    .line 36
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_9

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    add-int/lit8 v8, v6, 0x1

    .line 47
    .line 48
    if-ltz v6, :cond_8

    .line 49
    .line 50
    check-cast v7, Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v6, :cond_0

    .line 53
    .line 54
    if-ne v6, v3, :cond_1

    .line 55
    .line 56
    :cond_0
    invoke-static {v7}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_1

    .line 61
    .line 62
    move-object v7, v2

    .line 63
    goto :goto_4

    .line 64
    :cond_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    move v9, v5

    .line 69
    :goto_1
    const/4 v10, -0x1

    .line 70
    if-ge v9, v6, :cond_3

    .line 71
    .line 72
    invoke-virtual {v7, v9}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    invoke-static {v11}, Lyyds/ᛸᛳᛷᛳ;->ᲇᛱᛲ(C)Z

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    if-nez v11, :cond_2

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    move v9, v10

    .line 87
    :goto_2
    if-ne v9, v10, :cond_5

    .line 88
    .line 89
    :cond_4
    move-object v6, v2

    .line 90
    goto :goto_3

    .line 91
    :cond_5
    invoke-virtual {v7, v0, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    add-int/2addr v6, v9

    .line 102
    invoke-virtual {v7, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    :goto_3
    if-eqz v6, :cond_6

    .line 107
    .line 108
    move-object v7, v6

    .line 109
    :cond_6
    :goto_4
    if-eqz v7, :cond_7

    .line 110
    .line 111
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    :cond_7
    move v6, v8

    .line 115
    goto :goto_0

    .line 116
    :cond_8
    invoke-static {}, Lyyds/ᲈᛸᲁᛶ;->ᲀᛲᛲᲇ()V

    .line 117
    .line 118
    .line 119
    throw v2

    .line 120
    :cond_9
    new-instance v5, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v5, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 123
    .line 124
    .line 125
    const-string v7, ""

    .line 126
    .line 127
    const-string v9, "..."

    .line 128
    .line 129
    const-string v6, "\n"

    .line 130
    .line 131
    const/4 v10, 0x0

    .line 132
    move-object v8, v7

    .line 133
    invoke-static/range {v4 .. v10}, Lyyds/ᛷᛷᛶᲇ;->ᛷᲇᛲᛱ(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lyyds/ᛷᛴᲈᲀ;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :cond_a
    const-string p0, "marginPrefix must be non-blank string."

    .line 142
    .line 143
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-object v2
.end method

.method public static ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛳᛳᲀᲀ;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1, p0}, Lyyds/ᛳᛳᲀᲀ;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Lyyds/ᛶᛳᛷ;

    .line 8
    .line 9
    const/16 v1, 0x9

    .line 10
    .line 11
    const-string v2, "    "

    .line 12
    .line 13
    invoke-direct {p0, v2, v1}, Lyyds/ᛶᛳᛷ;-><init>(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lyyds/ᛵᛶᲀᛶ;

    .line 17
    .line 18
    invoke-direct {v1, v0, p0}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 19
    .line 20
    .line 21
    const-string p0, "\n"

    .line 22
    .line 23
    invoke-static {v1, p0}, Lyyds/ᛷᛴᛳᛶ;->ᛲᛶᛱᲈ(Lyyds/ᛵᲈᛴᛷ;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
