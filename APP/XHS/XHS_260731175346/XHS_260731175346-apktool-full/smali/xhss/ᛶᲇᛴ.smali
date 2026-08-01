.class public final Lxhss/ᛶᲇᛴ;
.super Lxhss/ᛵᛷᛸᛶ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Ljava/lang/Number;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    return-void
.end method

.method public static ᲇᛶᛴᲀ(Lxhss/ᛶᲇᛴ;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Number;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    instance-of v0, p0, Ljava/math/BigInteger;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    instance-of v0, p0, Ljava/lang/Long;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    instance-of v0, p0, Ljava/lang/Integer;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    instance-of v0, p0, Ljava/lang/Short;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    instance-of p0, p0, Ljava/lang/Byte;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_5

    .line 4
    .line 5
    :cond_0
    if-eqz p1, :cond_c

    .line 6
    .line 7
    const-class v0, Lxhss/ᛶᲇᛴ;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto/16 :goto_6

    .line 16
    .line 17
    :cond_1
    check-cast p1, Lxhss/ᛶᲇᛴ;

    .line 18
    .line 19
    iget-object v0, p1, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 20
    .line 21
    invoke-static {p0}, Lxhss/ᛶᲇᛴ;->ᲇᛶᛴᲀ(Lxhss/ᛶᲇᛴ;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p0, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 26
    .line 27
    if-eqz v1, :cond_4

    .line 28
    .line 29
    invoke-static {p1}, Lxhss/ᛶᲇᛴ;->ᲇᛶᛴᲀ(Lxhss/ᛶᲇᛴ;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    instance-of v1, v2, Ljava/math/BigInteger;

    .line 36
    .line 37
    if-nez v1, :cond_3

    .line 38
    .line 39
    instance-of v0, v0, Ljava/math/BigInteger;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛷᛴᛷᛱ()Ljava/lang/Number;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    invoke-virtual {p1}, Lxhss/ᛶᲇᛴ;->ᛷᛴᛷᛱ()Ljava/lang/Number;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide p0

    .line 60
    cmp-long p0, v0, p0

    .line 61
    .line 62
    if-nez p0, :cond_c

    .line 63
    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᲇᛴᲇᛵ()Ljava/math/BigInteger;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p1}, Lxhss/ᛶᲇᛴ;->ᲇᛴᲇᛵ()Ljava/math/BigInteger;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    return p0

    .line 79
    :cond_4
    instance-of v1, v2, Ljava/lang/Number;

    .line 80
    .line 81
    if-eqz v1, :cond_b

    .line 82
    .line 83
    instance-of v1, v0, Ljava/lang/Number;

    .line 84
    .line 85
    if-eqz v1, :cond_b

    .line 86
    .line 87
    instance-of v1, v2, Ljava/math/BigDecimal;

    .line 88
    .line 89
    if-eqz v1, :cond_7

    .line 90
    .line 91
    instance-of v1, v0, Ljava/math/BigDecimal;

    .line 92
    .line 93
    if-eqz v1, :cond_7

    .line 94
    .line 95
    instance-of v1, v2, Ljava/math/BigDecimal;

    .line 96
    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    check-cast v2, Ljava/math/BigDecimal;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛳᲁᲇᛸ()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Lxhss/ᲈᲀᲀᛱ;->ᛲᛴᲇᛲ(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    :goto_1
    instance-of p0, v0, Ljava/math/BigDecimal;

    .line 111
    .line 112
    if-eqz p0, :cond_6

    .line 113
    .line 114
    check-cast v0, Ljava/math/BigDecimal;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    invoke-virtual {p1}, Lxhss/ᛶᲇᛴ;->ᛳᲁᲇᛸ()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p0}, Lxhss/ᲈᲀᲀᛱ;->ᛲᛴᲇᛲ(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :goto_2
    invoke-virtual {v2, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-nez p0, :cond_c

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_7
    instance-of v1, v2, Ljava/lang/Number;

    .line 133
    .line 134
    if-eqz v1, :cond_8

    .line 135
    .line 136
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛷᛴᛷᛱ()Ljava/lang/Number;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 141
    .line 142
    .line 143
    move-result-wide v1

    .line 144
    goto :goto_3

    .line 145
    :cond_8
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛳᲁᲇᛸ()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 150
    .line 151
    .line 152
    move-result-wide v1

    .line 153
    :goto_3
    instance-of p0, v0, Ljava/lang/Number;

    .line 154
    .line 155
    if-eqz p0, :cond_9

    .line 156
    .line 157
    invoke-virtual {p1}, Lxhss/ᛶᲇᛴ;->ᛷᛴᛷᛱ()Ljava/lang/Number;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 162
    .line 163
    .line 164
    move-result-wide p0

    .line 165
    goto :goto_4

    .line 166
    :cond_9
    invoke-virtual {p1}, Lxhss/ᛶᲇᛴ;->ᛳᲁᲇᛸ()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 171
    .line 172
    .line 173
    move-result-wide p0

    .line 174
    :goto_4
    cmpl-double v0, v1, p0

    .line 175
    .line 176
    if-eqz v0, :cond_a

    .line 177
    .line 178
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_c

    .line 183
    .line 184
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-eqz p0, :cond_c

    .line 189
    .line 190
    :cond_a
    :goto_5
    const/4 p0, 0x1

    .line 191
    return p0

    .line 192
    :cond_b
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    return p0

    .line 197
    :cond_c
    :goto_6
    const/4 p0, 0x0

    .line 198
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    invoke-static {p0}, Lxhss/ᛶᲇᛴ;->ᲇᛶᛴᲀ(Lxhss/ᛶᲇᛴ;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛷᛴᛷᛱ()Ljava/lang/Number;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    :goto_0
    ushr-long v0, v2, v1

    .line 18
    .line 19
    xor-long/2addr v0, v2

    .line 20
    long-to-int p0, v0

    .line 21
    return p0

    .line 22
    :cond_0
    iget-object v0, p0, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 23
    .line 24
    instance-of v2, v0, Ljava/lang/Number;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛷᛴᛷᛱ()Ljava/lang/Number;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
.end method

.method public final ᛱᛱᛲᲇ()J
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 2
    .line 3
    instance-of v0, v0, Ljava/lang/Number;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛷᛴᛷᛱ()Ljava/lang/Number;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛳᲁᲇᛸ()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    return-wide v0
.end method

.method public final ᛳᲁᲇᛸ()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    instance-of v1, v0, Ljava/lang/Number;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛷᛴᛷᛱ()Ljava/lang/Number;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of p0, v0, Ljava/lang/Boolean;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v2, "Unexpected value type: "

    .line 43
    .line 44
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    throw p0
.end method

.method public final ᛷᛴᛷᛱ()Ljava/lang/Number;
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Number;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lxhss/ᛴᛷᛴᲇ;

    .line 15
    .line 16
    check-cast p0, Ljava/lang/String;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lxhss/ᛴᛷᛴᲇ;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string v0, "Primitive is neither a number nor a string"

    .line 25
    .line 26
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public final ᛷᛵᛵᲈ()I
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 2
    .line 3
    instance-of v0, v0, Ljava/lang/Number;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛷᛴᛷᛱ()Ljava/lang/Number;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛳᲁᲇᛸ()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public final ᲇᛴᲇᛵ()Ljava/math/BigInteger;
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛶᲇᛴ;->ᛱᛱᛲᲇ:Ljava/io/Serializable;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/math/BigInteger;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/math/BigInteger;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-static {p0}, Lxhss/ᛶᲇᛴ;->ᲇᛶᛴᲀ(Lxhss/ᛶᲇᛴ;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛷᛴᛷᛱ()Ljava/lang/Number;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-virtual {p0}, Lxhss/ᛶᲇᛴ;->ᛳᲁᲇᛸ()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lxhss/ᲈᲀᲀᛱ;->ᛱᛱᛲᲇ(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Ljava/math/BigInteger;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method
