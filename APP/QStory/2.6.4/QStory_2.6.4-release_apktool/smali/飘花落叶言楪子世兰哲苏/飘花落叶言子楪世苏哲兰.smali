.class public abstract L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v21, "right_shift_assign"

    .line 4
    .line 5
    const-string v22, "right_unsigned_shift_assign"

    .line 6
    .line 7
    const-string v1, "gt"

    .line 8
    .line 9
    const-string v2, "lt"

    .line 10
    .line 11
    const-string v3, "lteq"

    .line 12
    .line 13
    const-string v4, "gteq"

    .line 14
    .line 15
    const-string v5, "or"

    .line 16
    .line 17
    const-string v6, "and"

    .line 18
    .line 19
    const-string v7, "bitwise_and"

    .line 20
    .line 21
    const-string v8, "bitwise_or"

    .line 22
    .line 23
    const-string v9, "bitwise_xor"

    .line 24
    .line 25
    const-string v10, "mod"

    .line 26
    .line 27
    const-string v11, "pow"

    .line 28
    .line 29
    const-string v12, "left_shift"

    .line 30
    .line 31
    const-string v13, "right_shift"

    .line 32
    .line 33
    const-string v14, "right_unsigned_shift"

    .line 34
    .line 35
    const-string v15, "and_assign"

    .line 36
    .line 37
    const-string v16, "or_assign"

    .line 38
    .line 39
    const-string v17, "xor_assign"

    .line 40
    .line 41
    const-string v18, "mod_assign"

    .line 42
    .line 43
    const-string v19, "pow_assign"

    .line 44
    .line 45
    const-string v20, "left_shift_assign"

    .line 46
    .line 47
    filled-new-array/range {v1 .. v22}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 56
    .line 57
    .line 58
    sput-object v0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 59
    .line 60
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(ILjava/lang/String;)I
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lt p0, v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_9

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x5c

    .line 14
    .line 15
    const/16 v3, 0x22

    .line 16
    .line 17
    const/4 v4, -0x1

    .line 18
    if-ne v1, v3, :cond_8

    .line 19
    .line 20
    invoke-static {p0, p1}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_4

    .line 25
    .line 26
    add-int/lit8 p0, p0, 0x3

    .line 27
    .line 28
    :goto_0
    add-int/lit8 v1, p0, 0x2

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-ge v1, v2, :cond_2

    .line 35
    .line 36
    invoke-static {p0, p1}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(ILjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    move v4, p0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    add-int/lit8 p0, p0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    if-gez v4, :cond_3

    .line 48
    .line 49
    goto/16 :goto_8

    .line 50
    .line 51
    :cond_3
    add-int/lit8 v4, v4, 0x3

    .line 52
    .line 53
    return v4

    .line 54
    :cond_4
    :goto_2
    add-int/lit8 p0, p0, 0x1

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-ge p0, v1, :cond_6

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-ne v1, v2, :cond_5

    .line 67
    .line 68
    add-int/lit8 p0, p0, 0x1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    if-ne v1, v3, :cond_4

    .line 72
    .line 73
    move v4, p0

    .line 74
    :cond_6
    if-gez v4, :cond_7

    .line 75
    .line 76
    goto/16 :goto_8

    .line 77
    .line 78
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 79
    .line 80
    return v4

    .line 81
    :cond_8
    const/16 v3, 0xd

    .line 82
    .line 83
    const/16 v5, 0xa

    .line 84
    .line 85
    const/16 v6, 0x27

    .line 86
    .line 87
    if-ne v1, v6, :cond_e

    .line 88
    .line 89
    :cond_9
    :goto_3
    add-int/lit8 p0, p0, 0x1

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-ge p0, v1, :cond_c

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-ne v1, v2, :cond_a

    .line 102
    .line 103
    add-int/lit8 p0, p0, 0x1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_a
    if-ne v1, v6, :cond_b

    .line 107
    .line 108
    move v4, p0

    .line 109
    goto :goto_4

    .line 110
    :cond_b
    if-eq v1, v5, :cond_c

    .line 111
    .line 112
    if-ne v1, v3, :cond_9

    .line 113
    .line 114
    :cond_c
    :goto_4
    if-gez v4, :cond_d

    .line 115
    .line 116
    goto :goto_8

    .line 117
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    return v4

    .line 120
    :cond_e
    const/16 v2, 0x2f

    .line 121
    .line 122
    if-ne v1, v2, :cond_14

    .line 123
    .line 124
    add-int/lit8 v1, p0, 0x1

    .line 125
    .line 126
    if-ge v1, v0, :cond_14

    .line 127
    .line 128
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-ne v1, v2, :cond_10

    .line 133
    .line 134
    add-int/lit8 p0, p0, 0x2

    .line 135
    .line 136
    :goto_5
    if-ge p0, v0, :cond_f

    .line 137
    .line 138
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eq v1, v5, :cond_f

    .line 143
    .line 144
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eq v1, v3, :cond_f

    .line 149
    .line 150
    add-int/lit8 p0, p0, 0x1

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_f
    return p0

    .line 154
    :cond_10
    const/16 v3, 0x2a

    .line 155
    .line 156
    if-ne v1, v3, :cond_14

    .line 157
    .line 158
    add-int/lit8 p0, p0, 0x2

    .line 159
    .line 160
    :goto_6
    add-int/lit8 v1, p0, 0x1

    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-ge v1, v5, :cond_12

    .line 167
    .line 168
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-ne v5, v3, :cond_11

    .line 173
    .line 174
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-ne v5, v2, :cond_11

    .line 179
    .line 180
    move v4, p0

    .line 181
    goto :goto_7

    .line 182
    :cond_11
    move p0, v1

    .line 183
    goto :goto_6

    .line 184
    :cond_12
    :goto_7
    if-gez v4, :cond_13

    .line 185
    .line 186
    :goto_8
    return v0

    .line 187
    :cond_13
    add-int/lit8 v4, v4, 0x2

    .line 188
    .line 189
    return v4

    .line 190
    :cond_14
    :goto_9
    return p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(ILjava/lang/String;)Z
    .locals 3

    .line 1
    add-int/lit8 v0, p0, 0x2

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x22

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    add-int/2addr p0, v1

    .line 19
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-ne p0, v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-ne p0, v2, :cond_0

    .line 30
    .line 31
    return v1

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0
.end method
