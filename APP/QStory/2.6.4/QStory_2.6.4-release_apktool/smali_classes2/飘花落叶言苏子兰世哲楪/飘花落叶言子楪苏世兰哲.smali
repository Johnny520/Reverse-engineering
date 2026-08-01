.class public final L飘花落叶言苏子兰世哲楪/飘花落叶言子楪苏世兰哲;
.super L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/CharSequence;ILjava/io/StringWriter;)I
    .locals 8

    .line 1
    iget p0, p0, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/16 v1, 0x5c

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-ne p0, v1, :cond_3

    .line 15
    .line 16
    add-int/lit8 p0, p2, 0x1

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ge p0, v1, :cond_3

    .line 23
    .line 24
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    const/16 v1, 0x75

    .line 29
    .line 30
    if-ne p0, v1, :cond_3

    .line 31
    .line 32
    :goto_0
    add-int p0, p2, v0

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-ge p0, v3, :cond_0

    .line 39
    .line 40
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-ne v3, v1, :cond_0

    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-ge p0, v1, :cond_1

    .line 54
    .line 55
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    const/16 v1, 0x2b

    .line 60
    .line 61
    if-ne p0, v1, :cond_1

    .line 62
    .line 63
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    :cond_1
    add-int p0, p2, v0

    .line 66
    .line 67
    add-int/lit8 v1, p0, 0x4

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-gt v1, v3, :cond_2

    .line 74
    .line 75
    invoke-interface {p1, p0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :try_start_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/16 p2, 0x10

    .line 84
    .line 85
    invoke-static {p1, p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    int-to-char p1, p1

    .line 90
    invoke-virtual {p3, p1}, Ljava/io/Writer;->write(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    add-int/lit8 v2, v0, 0x4

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catch_0
    move-exception p1

    .line 97
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 98
    .line 99
    new-instance p3, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v0, "Unable to parse unicode value: "

    .line 102
    .line 103
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-direct {p2, p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    throw p2

    .line 117
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-interface {p1, p2, p0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const-string p1, "\' due to end of CharSequence"

    .line 126
    .line 127
    const-string p2, "Less than 4 hex digits in unicode value: \'"

    .line 128
    .line 129
    invoke-static {p0, p2, p1}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    :goto_1
    return v2

    .line 133
    :pswitch_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    sub-int/2addr p0, p2

    .line 138
    const/4 v3, 0x1

    .line 139
    sub-int/2addr p0, v3

    .line 140
    new-instance v4, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-ne v5, v1, :cond_5

    .line 150
    .line 151
    if-lez p0, :cond_5

    .line 152
    .line 153
    add-int/lit8 v1, p2, 0x1

    .line 154
    .line 155
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    sget v6, Lorg/apache/commons/lang3/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:I

    .line 160
    .line 161
    const/16 v6, 0x30

    .line 162
    .line 163
    if-lt v5, v6, :cond_5

    .line 164
    .line 165
    const/16 v7, 0x37

    .line 166
    .line 167
    if-gt v5, v7, :cond_5

    .line 168
    .line 169
    add-int/lit8 v2, p2, 0x2

    .line 170
    .line 171
    add-int/lit8 p2, p2, 0x3

    .line 172
    .line 173
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    if-le p0, v3, :cond_4

    .line 181
    .line 182
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-lt v5, v6, :cond_4

    .line 187
    .line 188
    if-gt v5, v7, :cond_4

    .line 189
    .line 190
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    if-le p0, v0, :cond_4

    .line 198
    .line 199
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-lt p0, v6, :cond_4

    .line 204
    .line 205
    const/16 v0, 0x33

    .line 206
    .line 207
    if-gt p0, v0, :cond_4

    .line 208
    .line 209
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    if-lt p0, v6, :cond_4

    .line 214
    .line 215
    if-gt p0, v7, :cond_4

    .line 216
    .line 217
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    :cond_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    const/16 p1, 0x8

    .line 229
    .line 230
    invoke-static {p0, p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    invoke-virtual {p3, p0}, Ljava/io/Writer;->write(I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    add-int/lit8 v2, p0, 0x1

    .line 242
    .line 243
    :cond_5
    return v2

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
