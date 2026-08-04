.class public final Lyyds/ᲀᛵᛲᛲ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᲈᲁ:I

.field public final synthetic ᛲᛲᲈᲈ:Lyyds/ᛷᛴᲈᲀ;

.field public synthetic ᛲᛳᛶᲁ:Ljava/lang/Object;

.field public ᛶᛷᛲᲁ:Lyyds/ᲀᲀᛲᛷ;

.field public final synthetic ᛷᛲᲈᛱ:Z

.field public final synthetic ᛷᛵᲇᲀ:Lcom/ss/android/ugc/awemes/WardDatabase;

.field public final synthetic ᛷᲈᲈᲁ:Z


# direct methods
.method public constructor <init>(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)V
    .locals 0

    .line 1
    iput-boolean p4, p0, Lyyds/ᲀᛵᛲᛲ;->ᛷᲈᲈᲁ:Z

    .line 2
    .line 3
    iput-boolean p5, p0, Lyyds/ᲀᛵᛲᛲ;->ᛷᛲᲈᛱ:Z

    .line 4
    .line 5
    iput-object p1, p0, Lyyds/ᲀᛵᛲᛲ;->ᛷᛵᲇᲀ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛲᲈᲈ:Lyyds/ᛷᛴᲈᲀ;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p2}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lyyds/ᲀᛵᛲᛲ;->ᛱᲈᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛲᲈᲈ:Lyyds/ᛷᛴᲈᲀ;

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᲀᛵᛲᛲ;->ᛷᛵᲇᲀ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 6
    .line 7
    iget-boolean v3, p0, Lyyds/ᲀᛵᛲᛲ;->ᛷᛲᲈᛱ:Z

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    sget-object v9, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 15
    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    if-eq v0, v7, :cond_3

    .line 19
    .line 20
    if-eq v0, v6, :cond_2

    .line 21
    .line 22
    if-eq v0, v5, :cond_1

    .line 23
    .line 24
    if-ne v0, v4, :cond_0

    .line 25
    .line 26
    iget-object p0, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_7

    .line 32
    .line 33
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v8

    .line 39
    :cond_1
    iget-object v0, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lyyds/ᲈᛶᛷᲀ;

    .line 42
    .line 43
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_5

    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, Lyyds/ᲀᛵᛲᛲ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲀᛲᛷ;

    .line 49
    .line 50
    iget-object v6, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, Lyyds/ᲈᛶᛷᲀ;

    .line 53
    .line 54
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    iget-object v0, p0, Lyyds/ᲀᛵᛲᛲ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲀᛲᛷ;

    .line 59
    .line 60
    iget-object v10, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v10, Lyyds/ᲈᛶᛷᲀ;

    .line 63
    .line 64
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Lyyds/ᲈᛶᛷᲀ;

    .line 74
    .line 75
    iget-boolean v0, p0, Lyyds/ᲀᛵᛲᛲ;->ᛷᲈᲈᲁ:Z

    .line 76
    .line 77
    if-eqz v0, :cond_11

    .line 78
    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    sget-object v0, Lyyds/ᲀᲀᛲᛷ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛲᛷ;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    sget-object v0, Lyyds/ᲀᲀᛲᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲀᛲᛷ;

    .line 85
    .line 86
    :goto_0
    if-nez v3, :cond_b

    .line 87
    .line 88
    iput-object p1, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v0, p0, Lyyds/ᲀᛵᛲᛲ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲀᛲᛷ;

    .line 91
    .line 92
    iput v7, p0, Lyyds/ᲀᛵᛲᛲ;->ᛱᲈᲁ:I

    .line 93
    .line 94
    invoke-interface {p1, p0}, Lyyds/ᲈᛶᛷᲀ;->ᛲᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    if-ne v10, v9, :cond_6

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_6
    move-object v11, v10

    .line 102
    move-object v10, p1

    .line 103
    move-object p1, v11

    .line 104
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-nez p1, :cond_a

    .line 111
    .line 112
    iget-object p1, v2, Lcom/ss/android/ugc/awemes/WardDatabase;->ᲇᲇᲇᛱ:Lyyds/ᛳᛱᲀᛶ;

    .line 113
    .line 114
    if-nez p1, :cond_7

    .line 115
    .line 116
    move-object p1, v8

    .line 117
    :cond_7
    iput-object v10, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v0, p0, Lyyds/ᲀᛵᛲᛲ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲀᛲᛷ;

    .line 120
    .line 121
    iput v6, p0, Lyyds/ᲀᛵᛲᛲ;->ᛱᲈᲁ:I

    .line 122
    .line 123
    iget-object p1, p1, Lyyds/ᛳᛱᲀᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛸᛸ;

    .line 124
    .line 125
    invoke-virtual {p1, p0}, Lyyds/ᛳᲀᛸᛸ;->ᲇᲇᲇᛱ(Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v9, :cond_8

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_8
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 133
    .line 134
    :goto_2
    if-ne p1, v9, :cond_9

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_9
    move-object v6, v10

    .line 138
    :goto_3
    move-object p1, v0

    .line 139
    move-object v0, v6

    .line 140
    goto :goto_4

    .line 141
    :cond_a
    move-object p1, v0

    .line 142
    move-object v0, v10

    .line 143
    goto :goto_4

    .line 144
    :cond_b
    move-object v11, v0

    .line 145
    move-object v0, p1

    .line 146
    move-object p1, v11

    .line 147
    :goto_4
    new-instance v6, Lyyds/ᲁᛲᲇᲇ;

    .line 148
    .line 149
    invoke-direct {v6, v8, v1, v7}, Lyyds/ᲁᛲᲇᲇ;-><init>(Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;I)V

    .line 150
    .line 151
    .line 152
    iput-object v0, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v8, p0, Lyyds/ᲀᛵᛲᛲ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲀᛲᛷ;

    .line 155
    .line 156
    iput v5, p0, Lyyds/ᲀᛵᛲᛲ;->ᛱᲈᲁ:I

    .line 157
    .line 158
    invoke-interface {v0, p1, v6, p0}, Lyyds/ᲈᛶᛷᲀ;->ᲇᲈᛵᛷ(Lyyds/ᲀᲀᛲᛷ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛸᲀᛷᛱ;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    if-ne p1, v9, :cond_c

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_c
    :goto_5
    if-nez v3, :cond_10

    .line 166
    .line 167
    iput-object p1, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 168
    .line 169
    iput v4, p0, Lyyds/ᲀᛵᛲᛲ;->ᛱᲈᲁ:I

    .line 170
    .line 171
    invoke-interface {v0, p0}, Lyyds/ᲈᛶᛷᲀ;->ᛲᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    if-ne p0, v9, :cond_d

    .line 176
    .line 177
    :goto_6
    return-object v9

    .line 178
    :cond_d
    move-object v11, p1

    .line 179
    move-object p1, p0

    .line 180
    move-object p0, v11

    .line 181
    :goto_7
    check-cast p1, Ljava/lang/Boolean;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-nez p1, :cond_f

    .line 188
    .line 189
    iget-object p1, v2, Lcom/ss/android/ugc/awemes/WardDatabase;->ᲇᲇᲇᛱ:Lyyds/ᛳᛱᲀᛶ;

    .line 190
    .line 191
    if-nez p1, :cond_e

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_e
    move-object v8, p1

    .line 195
    :goto_8
    iget-object p1, v8, Lyyds/ᛳᛱᲀᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛸᛸ;

    .line 196
    .line 197
    iget-object v0, v8, Lyyds/ᛳᛱᲀᛶ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲀᛳ;

    .line 198
    .line 199
    iget-object v1, v8, Lyyds/ᛳᛱᲀᛶ;->ᛶᛷᛲᲁ:Lyyds/ᲁᲀᛳ;

    .line 200
    .line 201
    invoke-virtual {p1, v0, v1}, Lyyds/ᛳᲀᛸᛸ;->ᲀᛲᛳᲀ(Lyyds/ᲁᛶᲁᲀ;Lyyds/ᲁᛶᲁᲀ;)V

    .line 202
    .line 203
    .line 204
    :cond_f
    return-object p0

    .line 205
    :cond_10
    return-object p1

    .line 206
    :cond_11
    check-cast p1, Lyyds/ᛸᛸᲈᛳ;

    .line 207
    .line 208
    invoke-interface {p1}, Lyyds/ᛸᛸᲈᛳ;->ᛵᛸᛸᛷ()Lyyds/ᛱᛵᛷ;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-interface {v1, p0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    return-object p0
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 6

    .line 1
    new-instance v0, Lyyds/ᲀᛵᛲᛲ;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲀᛵᛲᛲ;->ᛷᛵᲇᲀ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 4
    .line 5
    iget-object v3, p0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛲᲈᲈ:Lyyds/ᛷᛴᲈᲀ;

    .line 6
    .line 7
    iget-boolean v4, p0, Lyyds/ᲀᛵᛲᛲ;->ᛷᲈᲈᲁ:Z

    .line 8
    .line 9
    iget-boolean v5, p0, Lyyds/ᲀᛵᛲᛲ;->ᛷᛲᲈᛱ:Z

    .line 10
    .line 11
    move-object v2, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lyyds/ᲀᛵᛲᛲ;-><init>(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;ZZ)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lyyds/ᲀᛵᛲᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᲈᛶᛷᲀ;

    .line 2
    .line 3
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lyyds/ᲀᛵᛲᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᲀᛵᛲᛲ;

    .line 10
    .line 11
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᲀᛵᛲᛲ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
