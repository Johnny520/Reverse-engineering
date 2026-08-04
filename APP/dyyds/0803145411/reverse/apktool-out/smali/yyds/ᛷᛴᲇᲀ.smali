.class public final Lyyds/ᛷᛴᲇᲀ;
.super Lyyds/ᲈᛸᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Ljava/lang/Object;

.field public final ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyyds/ᛷᛱᲀᲀ;Ljava/lang/Class;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lyyds/ᛷᛴᲇᲀ;->ᛲᲈᲁ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛷᛴᲇᲀ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lyyds/ᛷᛴᲇᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᲈᛸᛷ;Ljava/lang/Object;I)V
    .locals 0

    .line 12
    iput p3, p0, Lyyds/ᛷᛴᲇᲀ;->ᛲᲈᲁ:I

    iput-object p1, p0, Lyyds/ᛷᛴᲇᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛷᛴᲇᲀ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᛷᛴᲇᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lyyds/ᛷᛴᲇᲀ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛷᛴᲇᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Ljava/lang/Class;

    .line 12
    .line 13
    check-cast v2, Lyyds/ᛷᛱᲀᲀ;

    .line 14
    .line 15
    iget-object v0, v2, Lyyds/ᛷᛱᲀᲀ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛸᛷ;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lyyds/ᲈᛸᛷ;->ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v1, Lyyds/ᛷᛷᲀᲈ;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-virtual {p1, v2}, Lyyds/ᲀᛲᛴᲇ;->ᛳᛸᛴᛶ(Z)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v3, "Expected a "

    .line 52
    .line 53
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p0, " but was "

    .line 60
    .line 61
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p0, "; at path "

    .line 68
    .line 69
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_1
    :goto_0
    return-object v0

    .line 84
    :pswitch_0
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᲇᲇᲇᛱ()V

    .line 85
    .line 86
    .line 87
    move-object v0, v1

    .line 88
    :goto_1
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛲᛲ()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    const/4 v4, 0x4

    .line 93
    const-string v5, "dateTime"

    .line 94
    .line 95
    const-string v6, "offset"

    .line 96
    .line 97
    if-eq v3, v4, :cond_4

    .line 98
    .line 99
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛱᛸᲁᲇ()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_3

    .line 108
    .line 109
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_2

    .line 114
    .line 115
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛵᲈᲇᛵ()V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    move-object v1, p0

    .line 120
    check-cast v1, Lyyds/ᛳᲇᛸᛴ;

    .line 121
    .line 122
    invoke-virtual {v1, p1}, Lyyds/ᛳᲇᛸᛴ;->ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/time/LocalDateTime;

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    move-object v0, v2

    .line 130
    check-cast v0, Lyyds/ᲈᛸᛷ;

    .line 131
    .line 132
    invoke-virtual {v0, p1}, Lyyds/ᲈᛸᛷ;->ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Ljava/time/ZoneOffset;

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᲇᛱᛲ()V

    .line 140
    .line 141
    .line 142
    invoke-static {v1, v5, p1}, Lyyds/ᛸᛶᛲ;->ᛵᛸᛸᛷ(Ljava/io/Serializable;Ljava/lang/String;Lyyds/ᲀᛲᛴᲇ;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v0, v6, p1}, Lyyds/ᛸᛶᛲ;->ᛵᛸᛸᛷ(Ljava/io/Serializable;Ljava/lang/String;Lyyds/ᲀᛲᛴᲇ;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v1, v0}, Ljava/time/OffsetDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneOffset;)Ljava/time/OffsetDateTime;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :pswitch_1
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛲᛲ()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    const/16 v3, 0x9

    .line 158
    .line 159
    if-ne v0, v3, :cond_5

    .line 160
    .line 161
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᲁᛶᛴᛸ()V

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_5
    check-cast v2, Lyyds/ᲀᛸᛵᲁ;

    .line 166
    .line 167
    invoke-interface {v2}, Lyyds/ᲀᛸᛵᲁ;->ᛵᛸᛸᛷ()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    move-object v1, v0

    .line 172
    check-cast v1, Ljava/util/Collection;

    .line 173
    .line 174
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲈᲁ()V

    .line 175
    .line 176
    .line 177
    :goto_2
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛵᲀᲈᛴ()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_6

    .line 182
    .line 183
    move-object v0, p0

    .line 184
    check-cast v0, Lyyds/ᛷᲀᛶ;

    .line 185
    .line 186
    iget-object v0, v0, Lyyds/ᛷᲀᛶ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛸᛷ;

    .line 187
    .line 188
    invoke-virtual {v0, p1}, Lyyds/ᲈᛸᛷ;->ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_6
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛳᲁᲁᲇ()V

    .line 197
    .line 198
    .line 199
    :goto_3
    return-object v1

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛷᛴᲇᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛷᛴᲇᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛷᛴᲇᲀ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lyyds/ᛷᛱᲀᲀ;

    .line 11
    .line 12
    iget-object p0, p0, Lyyds/ᛷᛱᲀᲀ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛸᛷ;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Lyyds/ᲈᛸᛷ;->ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p2, Ljava/time/OffsetDateTime;

    .line 19
    .line 20
    invoke-virtual {p1}, Lyyds/ᛶᲀᛳᲁ;->ᛶᛷᛲᲁ()V

    .line 21
    .line 22
    .line 23
    const-string v0, "dateTime"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lyyds/ᛶᲀᛳᲁ;->ᛵᛶᛲᲀ(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    check-cast v1, Lyyds/ᛳᲇᛸᛴ;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v1, p1, v0}, Lyyds/ᛳᲇᛸᛴ;->ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "offset"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lyyds/ᛶᲀᛳᲁ;->ᛵᛶᛲᲀ(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    check-cast p0, Lyyds/ᲈᛸᛷ;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p0, p1, p2}, Lyyds/ᲈᛸᛷ;->ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lyyds/ᛶᲀᛳᲁ;->ᲇᛱᛲ()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_1
    check-cast p2, Ljava/util/Collection;

    .line 56
    .line 57
    if-nez p2, :cond_0

    .line 58
    .line 59
    invoke-virtual {p1}, Lyyds/ᛶᲀᛳᲁ;->ᛵᲀᲈᛴ()Lyyds/ᛶᲀᛳᲁ;

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    invoke-virtual {p1}, Lyyds/ᛶᲀᛳᲁ;->ᲇᲇᲇᛱ()V

    .line 64
    .line 65
    .line 66
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_1

    .line 75
    .line 76
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    move-object v0, v1

    .line 81
    check-cast v0, Lyyds/ᛷᲀᛶ;

    .line 82
    .line 83
    invoke-virtual {v0, p1, p2}, Lyyds/ᛷᲀᛶ;->ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {p1}, Lyyds/ᛶᲀᛳᲁ;->ᛳᲁᲁᲇ()V

    .line 88
    .line 89
    .line 90
    :goto_1
    return-void

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
