.class public final Lyyds/ᛴᛸᛶᲇ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᲈᲁ:I

.field public final synthetic ᛲᛳᛶᲁ:Lyyds/ᲀᲈᛶᲈ;

.field public final synthetic ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᛲᲈᛱ:Ljava/lang/String;

.field public final synthetic ᛷᲈᲈᲁ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 1
    iput p5, p0, Lyyds/ᛴᛸᛶᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛴᛸᛶᲇ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛴᛸᛶᲇ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛴᛸᛶᲇ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lyyds/ᛴᛸᛶᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛴᛸᛶᲇ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᛴᛸᛶᲇ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᛴᛸᛶᲇ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 8
    .line 9
    sget-object v4, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lyyds/ᛴᛸᛶᲇ;->ᛱᲈᲁ:I

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    if-ne v0, v5, :cond_0

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catch_0
    move-exception p0

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    const-wide p0, -0x518bce68a836eL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    move-object v4, v7

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :try_start_1
    iget-object p1, v3, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lyyds/ᛲᛶᲀᛱ;

    .line 49
    .line 50
    iput v5, p0, Lyyds/ᛴᛸᛶᲇ;->ᛱᲈᲁ:I

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const-wide v8, -0x4f974e68a836eL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object p1, p1, Lyyds/ᛲᛶᲀᛱ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 65
    .line 66
    new-instance v3, Lyyds/ᛲᛸᛷᲀ;

    .line 67
    .line 68
    const/4 v8, 0x2

    .line 69
    invoke-direct {v3, v8, v0, v2, v1}, Lyyds/ᛲᛸᛷᲀ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1, p0, v3, v5, v6}, Lyyds/ᲀᛳᛳᛱ;->ᛱᛳᲇ(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v4, :cond_2

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_2
    :goto_1
    move-object v4, p1

    .line 80
    check-cast v4, Lyyds/ᲈᲁᲁᛲ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :goto_2
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 84
    .line 85
    const-wide v0, -0x518b7e68a836eL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :goto_3
    return-object v4

    .line 99
    :pswitch_0
    iget v0, p0, Lyyds/ᛴᛸᛶᲇ;->ᛱᲈᲁ:I

    .line 100
    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    if-ne v0, v5, :cond_3

    .line 104
    .line 105
    :try_start_2
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 106
    .line 107
    .line 108
    goto :goto_5

    .line 109
    :catch_1
    move-exception p0

    .line 110
    goto :goto_6

    .line 111
    :cond_3
    const-wide p0, -0x56696e68a836eL

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :goto_4
    move-object v4, v7

    .line 124
    goto :goto_7

    .line 125
    :cond_4
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :try_start_3
    iget-object p1, v3, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p1, Lyyds/ᛲᛶᲀᛱ;

    .line 131
    .line 132
    iput v5, p0, Lyyds/ᛴᛸᛶᲇ;->ᛱᲈᲁ:I

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    const-wide v8, -0x4e1cde68a836eL

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object p1, p1, Lyyds/ᛲᛶᲀᛱ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 147
    .line 148
    new-instance v3, Lyyds/ᛲᛸᛷᲀ;

    .line 149
    .line 150
    invoke-direct {v3, v6, v0, v2, v1}, Lyyds/ᛲᛸᛷᲀ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-static {p1, p0, v3, v5, v6}, Lyyds/ᲀᛳᛳᛱ;->ᛱᛳᲇ(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-ne p1, v4, :cond_5

    .line 158
    .line 159
    goto :goto_7

    .line 160
    :cond_5
    :goto_5
    move-object v4, p1

    .line 161
    check-cast v4, Lyyds/ᲈᲁᲁᛲ;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :goto_6
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 165
    .line 166
    const-wide v0, -0x56689e68a836eL

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :goto_7
    return-object v4

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 7

    .line 1
    iget p1, p0, Lyyds/ᛴᛸᛶᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lyyds/ᛴᛸᛶᲇ;

    .line 7
    .line 8
    iget-object v3, p0, Lyyds/ᛴᛸᛶᲇ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, Lyyds/ᛴᛸᛶᲇ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 12
    .line 13
    iget-object v2, p0, Lyyds/ᛴᛸᛶᲇ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, Lyyds/ᛴᛸᛶᲇ;-><init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p2

    .line 21
    new-instance v1, Lyyds/ᛴᛸᛶᲇ;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, Lyyds/ᛴᛸᛶᲇ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-object v2, p0, Lyyds/ᛴᛸᛶᲇ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 28
    .line 29
    iget-object v3, p0, Lyyds/ᛴᛸᛶᲇ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, Lyyds/ᛴᛸᛶᲇ;-><init>(Lyyds/ᲀᲈᛶᲈ;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛴᛸᛶᲇ;->ᛶᛷᛲᲁ:I

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
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛸᛶᲇ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᛴᛸᛶᲇ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᛴᛸᛶᲇ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛸᛶᲇ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lyyds/ᛴᛸᛶᲇ;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lyyds/ᛴᛸᛶᲇ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

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
