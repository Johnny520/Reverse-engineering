.class public final Lyyds/ᛵᛶᛲᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛵᛶᛲᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛵᛶᛲᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛵᛶᛲᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛵᛶᛲᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lyyds/ᛶᛳᛶᛵ;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lyyds/ᛶᛳᛶᛵ;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Lyyds/ᛱᛷᲁᲁ;

    .line 18
    .line 19
    iget-object p0, p1, Lyyds/ᛱᛷᲁᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 20
    .line 21
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-wide v0, -0x467bbe68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    check-cast p2, Lyyds/ᛱᛷᲁᲁ;

    .line 36
    .line 37
    iget-object p2, p2, Lyyds/ᛱᛷᲁᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p2, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-wide v0, -0x467cce68a836eL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    invoke-static {p0, p1}, Lyyds/ᛳᛴᲁᲇ;->ᛵᛸᛸᛷ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    :goto_0
    return p0

    .line 56
    :pswitch_0
    check-cast p0, Lyyds/ᛶᛳᛶᛵ;

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2}, Lyyds/ᛶᛳᛶᛵ;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    check-cast p1, Lyyds/ᛷᲇᛶᛴ;

    .line 66
    .line 67
    iget p0, p1, Lyyds/ᛷᲇᛶᛴ;->ᛲᲈᲁ:I

    .line 68
    .line 69
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p2, Lyyds/ᛷᲇᛶᛴ;

    .line 74
    .line 75
    iget p1, p2, Lyyds/ᛷᲇᛶᛴ;->ᛲᲈᲁ:I

    .line 76
    .line 77
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p0, p1}, Lyyds/ᛳᛴᲁᲇ;->ᛵᛸᛸᛷ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    :goto_1
    return p0

    .line 86
    :pswitch_1
    check-cast p0, Lyyds/ᲈᛳᛱᛲ;

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {p2}, Lyyds/ᲈᛳᛱᛲ;->ᲀᛲᛲᲇ(Ljava/lang/Object;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p1}, Lyyds/ᲈᛳᛱᛲ;->ᲀᛲᛲᲇ(Ljava/lang/Object;)J

    .line 100
    .line 101
    .line 102
    move-result-wide p1

    .line 103
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p0, p1}, Lyyds/ᛳᛴᲁᲇ;->ᛵᛸᛸᛷ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    return p0

    .line 112
    :pswitch_2
    check-cast p0, Lyyds/ᛵᛶᛲᲀ;

    .line 113
    .line 114
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛶᛲᲀ;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_2

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    check-cast p2, Lyyds/ᛲᛴᛳᛲ;

    .line 122
    .line 123
    iget-boolean p0, p2, Lyyds/ᛲᛴᛳᛲ;->ᛶᛷᛲᲁ:Z

    .line 124
    .line 125
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p1, Lyyds/ᛲᛴᛳᛲ;

    .line 130
    .line 131
    iget-boolean p1, p1, Lyyds/ᛲᛴᛳᛲ;->ᛶᛷᛲᲁ:Z

    .line 132
    .line 133
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-static {p0, p1}, Lyyds/ᛳᛴᲁᲇ;->ᛵᛸᛸᛷ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    :goto_2
    return p0

    .line 142
    :pswitch_3
    check-cast p0, Lyyds/ᛶᛳᛶᛵ;

    .line 143
    .line 144
    invoke-virtual {p0, p1, p2}, Lyyds/ᛶᛳᛶᛵ;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_3

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_3
    check-cast p2, Lyyds/ᛲᛴᛳᛲ;

    .line 152
    .line 153
    iget-object p0, p2, Lyyds/ᛲᛴᛳᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲇᲈᛵᛷ;

    .line 154
    .line 155
    const/4 p2, 0x0

    .line 156
    const/4 v0, 0x1

    .line 157
    if-eqz p0, :cond_4

    .line 158
    .line 159
    move p0, v0

    .line 160
    goto :goto_3

    .line 161
    :cond_4
    move p0, p2

    .line 162
    :goto_3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    check-cast p1, Lyyds/ᛲᛴᛳᛲ;

    .line 167
    .line 168
    iget-object p1, p1, Lyyds/ᛲᛴᛳᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲇᲈᛵᛷ;

    .line 169
    .line 170
    if-eqz p1, :cond_5

    .line 171
    .line 172
    move p2, v0

    .line 173
    :cond_5
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-static {p0, p1}, Lyyds/ᛳᛴᲁᲇ;->ᛵᛸᛸᛷ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    :goto_4
    return p0

    .line 182
    :pswitch_4
    check-cast p0, Lyyds/ᛵᛶᛲᲀ;

    .line 183
    .line 184
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛶᛲᲀ;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-eqz p0, :cond_6

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_6
    check-cast p1, Lyyds/ᛲᛴᛳᛲ;

    .line 192
    .line 193
    iget-object p0, p1, Lyyds/ᛲᛴᛳᛲ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 194
    .line 195
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 196
    .line 197
    const-wide v0, -0x2c68de68a836eL

    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    const-wide v0, -0x2c692e68a836eL

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    check-cast p2, Lyyds/ᛲᛴᛳᛲ;

    .line 218
    .line 219
    iget-object p2, p2, Lyyds/ᛲᛴᛳᛲ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 220
    .line 221
    const-wide v0, -0x2c6a3e68a836eL

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    const-wide v0, -0x2c6a8e68a836eL

    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    invoke-static {p0, p1}, Lyyds/ᛳᛴᲁᲇ;->ᛵᛸᛸᛷ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 242
    .line 243
    .line 244
    move-result p0

    .line 245
    :goto_5
    return p0

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
