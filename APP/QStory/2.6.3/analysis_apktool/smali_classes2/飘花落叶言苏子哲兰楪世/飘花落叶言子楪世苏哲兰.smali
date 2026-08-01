.class public final L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏哲兰;
.super L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏兰哲:I


# direct methods
.method public constructor <init>([Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    array-length v0, p1

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object p1, Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;->semiColonRequired:Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 32
    .line 33
    :goto_0
    return-void
.end method

.method public constructor <init>([L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏兰哲;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-virtual {p1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    .line 36
    check-cast p1, [L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏兰哲;

    iput-object p1, p0, L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/CharSequence;ILjava/io/StringWriter;)I
    .locals 7

    .line 1
    iget v0, p0, L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Ljava/util/EnumSet;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/16 v3, 0x26

    .line 20
    .line 21
    if-ne v2, v3, :cond_d

    .line 22
    .line 23
    add-int/lit8 v2, v0, -0x2

    .line 24
    .line 25
    if-ge p2, v2, :cond_d

    .line 26
    .line 27
    add-int/lit8 v2, p2, 0x1

    .line 28
    .line 29
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/16 v3, 0x23

    .line 34
    .line 35
    if-ne v2, v3, :cond_d

    .line 36
    .line 37
    add-int/lit8 v2, p2, 0x2

    .line 38
    .line 39
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/16 v4, 0x78

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    if-eq v3, v4, :cond_1

    .line 47
    .line 48
    const/16 v4, 0x58

    .line 49
    .line 50
    if-ne v3, v4, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move p2, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    add-int/lit8 v2, p2, 0x3

    .line 56
    .line 57
    if-ne v2, v0, :cond_2

    .line 58
    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :cond_2
    move p2, v5

    .line 62
    :goto_1
    move v3, v2

    .line 63
    :goto_2
    if-ge v3, v0, :cond_6

    .line 64
    .line 65
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    sget v6, Lorg/apache/commons/lang3/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:I

    .line 70
    .line 71
    const/16 v6, 0x30

    .line 72
    .line 73
    if-lt v4, v6, :cond_3

    .line 74
    .line 75
    const/16 v6, 0x39

    .line 76
    .line 77
    if-gt v4, v6, :cond_3

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_3
    const/16 v6, 0x61

    .line 81
    .line 82
    if-lt v4, v6, :cond_4

    .line 83
    .line 84
    const/16 v6, 0x66

    .line 85
    .line 86
    if-le v4, v6, :cond_5

    .line 87
    .line 88
    :cond_4
    const/16 v6, 0x41

    .line 89
    .line 90
    if-lt v4, v6, :cond_6

    .line 91
    .line 92
    const/16 v6, 0x46

    .line 93
    .line 94
    if-gt v4, v6, :cond_6

    .line 95
    .line 96
    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_6
    if-eq v3, v0, :cond_7

    .line 100
    .line 101
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    const/16 v4, 0x3b

    .line 106
    .line 107
    if-ne v0, v4, :cond_7

    .line 108
    .line 109
    move v0, v5

    .line 110
    goto :goto_4

    .line 111
    :cond_7
    move v0, v1

    .line 112
    :goto_4
    if-nez v0, :cond_a

    .line 113
    .line 114
    sget-object v4, Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;->semiColonRequired:Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;

    .line 115
    .line 116
    if-eqz p0, :cond_8

    .line 117
    .line 118
    invoke-virtual {p0, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_8

    .line 123
    .line 124
    goto :goto_8

    .line 125
    :cond_8
    sget-object v4, Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;->errorIfNoSemiColon:Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;

    .line 126
    .line 127
    if-eqz p0, :cond_a

    .line 128
    .line 129
    invoke-virtual {p0, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-nez p0, :cond_9

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_9
    const-string p0, "Semi-colon required at end of numeric entity"

    .line 137
    .line 138
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_a
    :goto_5
    if-eqz p2, :cond_b

    .line 143
    .line 144
    :try_start_0
    invoke-interface {p1, v2, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    const/16 p1, 0x10

    .line 153
    .line 154
    invoke-static {p0, p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    goto :goto_6

    .line 159
    :cond_b
    invoke-interface {p1, v2, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    const/16 p1, 0xa

    .line 168
    .line 169
    invoke-static {p0, p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 170
    .line 171
    .line 172
    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    :goto_6
    const p1, 0xffff

    .line 174
    .line 175
    .line 176
    if-le p0, p1, :cond_c

    .line 177
    .line 178
    invoke-static {p0}, Ljava/lang/Character;->toChars(I)[C

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    aget-char p1, p0, v1

    .line 183
    .line 184
    invoke-virtual {p3, p1}, Ljava/io/Writer;->write(I)V

    .line 185
    .line 186
    .line 187
    aget-char p0, p0, v5

    .line 188
    .line 189
    invoke-virtual {p3, p0}, Ljava/io/Writer;->write(I)V

    .line 190
    .line 191
    .line 192
    goto :goto_7

    .line 193
    :cond_c
    invoke-virtual {p3, p0}, Ljava/io/Writer;->write(I)V

    .line 194
    .line 195
    .line 196
    :goto_7
    add-int/lit8 v3, v3, 0x2

    .line 197
    .line 198
    sub-int/2addr v3, v2

    .line 199
    add-int/2addr v3, p2

    .line 200
    add-int v1, v3, v0

    .line 201
    .line 202
    :catch_0
    :cond_d
    :goto_8
    return v1

    .line 203
    :pswitch_0
    check-cast p0, [L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏兰哲;

    .line 204
    .line 205
    array-length v0, p0

    .line 206
    move v2, v1

    .line 207
    :goto_9
    if-ge v2, v0, :cond_f

    .line 208
    .line 209
    aget-object v3, p0, v2

    .line 210
    .line 211
    invoke-virtual {v3, p1, p2, p3}, L飘花落叶言苏子哲兰楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/CharSequence;ILjava/io/StringWriter;)I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_e

    .line 216
    .line 217
    move v1, v3

    .line 218
    goto :goto_a

    .line 219
    :cond_e
    add-int/lit8 v2, v2, 0x1

    .line 220
    .line 221
    goto :goto_9

    .line 222
    :cond_f
    :goto_a
    return v1

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
