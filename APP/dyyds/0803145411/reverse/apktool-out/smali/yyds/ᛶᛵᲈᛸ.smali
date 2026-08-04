.class public final Lyyds/ᛶᛵᲈᛸ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᲈᲁ:I

.field public final synthetic ᛲᛳᛶᲁ:Lyyds/ᲀᲈᛶᲈ;

.field public final synthetic ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᲈᲈᲁ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 1
    iput p4, p0, Lyyds/ᛶᛵᲈᛸ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛶᛵᲈᛸ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛶᛵᲈᛸ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lyyds/ᛶᛵᲈᛸ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lyyds/ᛶᛵᲈᛸ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v3, p0, Lyyds/ᛶᛵᲈᛸ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 7
    .line 8
    sget-object v4, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lyyds/ᛶᛵᲈᛸ;->ᛱᲈᲁ:I

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-ne v0, v5, :cond_0

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catch_0
    move-exception p0

    .line 26
    goto :goto_2

    .line 27
    :cond_0
    const-wide p0, -0x616f1e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    move-object v4, v6

    .line 40
    goto :goto_3

    .line 41
    :cond_1
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :try_start_1
    iget-object p1, v3, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lyyds/ᛲᛶᲀᛱ;

    .line 47
    .line 48
    iput v5, p0, Lyyds/ᛶᛵᲈᛸ;->ᛱᲈᲁ:I

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const-wide v7, -0x4fb79e68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object p1, p1, Lyyds/ᛲᛶᲀᛱ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 63
    .line 64
    new-instance v3, Lyyds/ᲀᲁᛳᛳ;

    .line 65
    .line 66
    const/16 v7, 0x8

    .line 67
    .line 68
    invoke-direct {v3, v0, v7, v2}, Lyyds/ᲀᲁᛳᛳ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p0, v3, v5, v1}, Lyyds/ᲀᛳᛳᛱ;->ᛱᛳᲇ(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v4, :cond_2

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_2
    :goto_1
    move-object v4, p1

    .line 79
    check-cast v4, Lyyds/ᲈᲁᲁᛲ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :goto_2
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 83
    .line 84
    const-wide v0, -0x616ece68a836eL

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :goto_3
    return-object v4

    .line 98
    :pswitch_0
    iget v0, p0, Lyyds/ᛶᛵᲈᛸ;->ᛱᲈᲁ:I

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    if-ne v0, v5, :cond_3

    .line 103
    .line 104
    :try_start_2
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_3
    const-wide p0, -0x56320e68a836eL

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    move-object v4, v6

    .line 121
    goto :goto_6

    .line 122
    :cond_4
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :try_start_3
    iget-object p1, v3, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, Lyyds/ᛲᛶᲀᛱ;

    .line 128
    .line 129
    iput v5, p0, Lyyds/ᛶᛵᲈᛸ;->ᛱᲈᲁ:I

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    const-wide v6, -0x4fbc0e68a836eL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget-object p1, p1, Lyyds/ᛲᛶᲀᛱ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 144
    .line 145
    new-instance v3, Lyyds/ᲀᲁᛳᛳ;

    .line 146
    .line 147
    const/16 v6, 0xc

    .line 148
    .line 149
    invoke-direct {v3, v0, v6, v2}, Lyyds/ᲀᲁᛳᛳ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-static {p1, p0, v3, v5, v1}, Lyyds/ᲀᛳᛳᛱ;->ᛱᛳᲇ(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-ne p1, v4, :cond_5

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_5
    :goto_4
    check-cast p1, Ljava/lang/Iterable;

    .line 160
    .line 161
    new-instance v4, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    :cond_6
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_7

    .line 175
    .line 176
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    move-object v0, p1

    .line 181
    check-cast v0, Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {v0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-nez v0, :cond_6

    .line 188
    .line 189
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 190
    .line 191
    .line 192
    goto :goto_5

    .line 193
    :catch_1
    move-exception p0

    .line 194
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 195
    .line 196
    const-wide v0, -0x56317e68a836eL

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    sget-object v4, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 209
    .line 210
    :cond_7
    :goto_6
    return-object v4

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 2

    .line 1
    iget p1, p0, Lyyds/ᛶᛵᲈᛸ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛶᛵᲈᛸ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛶᛵᲈᛸ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, Lyyds/ᛶᛵᲈᛸ;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, Lyyds/ᛶᛵᲈᛸ;-><init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lyyds/ᛶᛵᲈᛸ;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, Lyyds/ᛶᛵᲈᛸ;-><init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛶᛵᲈᛸ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 6
    .line 7
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lyyds/ᛶᛵᲈᛸ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᛶᛵᲈᛸ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᛶᛵᲈᛸ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᛶᛵᲈᛸ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lyyds/ᛶᛵᲈᛸ;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lyyds/ᛶᛵᲈᛸ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
