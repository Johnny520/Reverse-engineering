.class public abstract Lxhss/ᲈᲀᲀᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᛶᛲᛷᛵ;

.field public static final ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public static ᛷᛴᛷᛱ:J

.field public static final ᛷᛵᛵᲈ:Lxhss/ᛶᛲᛷᛵ;

.field public static ᛸᛴᛶᛳ:I

.field public static ᲀᲇᛳᲁ:Z

.field public static ᲇᛴᲇᛵ:J

.field public static ᲇᛶᛴᲀ:J


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛶᛲᛷᛵ;

    .line 2
    .line 3
    const-string v1, "UNDEFINED"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, Lxhss/ᛶᛲᛷᛵ;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lxhss/ᲈᲀᲀᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛲᛷᛵ;

    .line 10
    .line 11
    new-instance v0, Lxhss/ᛶᛲᛷᛵ;

    .line 12
    .line 13
    const-string v1, "REUSABLE_CLAIMED"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lxhss/ᛶᛲᛷᛵ;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lxhss/ᲈᲀᲀᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛲᛷᛵ;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lxhss/ᲈᲀᲀᛱ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x2710

    .line 6
    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/16 v2, 0x1e

    .line 14
    .line 15
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Number string too large: "

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, "..."

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public static final ᛲᛴᲀᲈ(Ljava/util/logging/Logger;Lxhss/ᛵᛳᲀᛲ;Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object p2, p2, Lxhss/ᲇᲀᲀᛷ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/16 p2, 0x20

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const-string p3, "%-22s"

    .line 23
    .line 24
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p2, ": "

    .line 32
    .line 33
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p1, p1, Lxhss/ᛵᛳᲀᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static ᛲᛴᲇᛲ(Ljava/lang/String;)Ljava/math/BigDecimal;
    .locals 5

    .line 1
    invoke-static {p0}, Lxhss/ᲈᲀᲀᛱ;->ᛱᛱᛲᲇ(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/math/BigDecimal;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/math/BigDecimal;->scale()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-long v1, v1

    .line 14
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    const-wide/16 v3, 0x2710

    .line 19
    .line 20
    cmp-long v1, v1, v3

    .line 21
    .line 22
    if-gez v1, :cond_0

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 26
    .line 27
    const-string v1, "Number has unsupported scale: "

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method public static ᛳᛶᛷᲀ()Lxhss/ᲇᛴᲇᛴ;
    .locals 8

    .line 1
    const-wide v0, -0x9e8e1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0x9ea91b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, v2

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const-string v0, "->"

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v1, v0, v3, v3, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v2, -0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v3, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v2, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    sget-object v3, Lxhss/ᛳᛵᛲᛳ;->ᛱᛳᲁᲈ:Lxhss/ᛳᛵᛲᛳ;

    .line 112
    .line 113
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᲀᲇᛳᲁ(Lxhss/ᛷᛴᛲᛲ;)Lxhss/ᛵᛲᛴᛵ;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const-wide v3, -0xe9851b858845L

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {v3, v4}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    const-wide v4, -0x40151b858845L

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    invoke-static {v4, v5}, Lxhss/ᛴᛸᛲᛳ;->ᛴᲈᛱᛴ(J)Lxhss/ᲁᛶᛷ;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    const-wide v5, -0x40231b858845L

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    const-wide v6, -0x40341b858845L

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-virtual {v4, v5}, Lxhss/ᲁᛶᛷ;->ᲁᛷᲇᲇ([Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    const-wide v5, -0x40451b858845L

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-static {v4, v5}, Lxhss/ᲁᛶᛷ;->ᛴᲀᛸᛵ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iput-object v4, v3, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_5

    .line 179
    .line 180
    new-instance v1, Lxhss/ᲈᛴᲀᛲ;

    .line 181
    .line 182
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_5
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->first()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Lxhss/ᲇᛸᛳᛸ;

    .line 191
    .line 192
    iget-object v4, v4, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v4, Lorg/luckypray/dexkit/DexKitBridge;

    .line 195
    .line 196
    iput-object v1, v3, Lxhss/ᛶᲈᛷᲁ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 197
    .line 198
    invoke-virtual {v4, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    :goto_2
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 207
    .line 208
    if-eqz v1, :cond_6

    .line 209
    .line 210
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    goto :goto_3

    .line 215
    :cond_6
    move-object v1, v2

    .line 216
    :goto_3
    const-wide/16 v3, 0x1

    .line 217
    .line 218
    if-nez v1, :cond_7

    .line 219
    .line 220
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 221
    .line 222
    add-long/2addr v5, v3

    .line 223
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 224
    .line 225
    new-instance v1, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    const-wide v3, -0x9eaa1b858845L

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    const/16 v3, 0x27

    .line 240
    .line 241
    invoke-static {v1, v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 242
    .line 243
    .line 244
    return-object v2

    .line 245
    :cond_7
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-lez v5, :cond_8

    .line 254
    .line 255
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 256
    .line 257
    add-long/2addr v5, v3

    .line 258
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 259
    .line 260
    new-instance v3, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    const-wide v4, -0x9ecd1b858845L

    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    const-wide v4, -0x9eee1b858845L

    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 284
    .line 285
    .line 286
    :cond_8
    return-object v1
.end method

.method public static final ᛳᛸᛵᲀ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)V
    .locals 10

    .line 1
    instance-of v0, p1, Lxhss/ᛸᲇᲁᛱ;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    check-cast p1, Lxhss/ᛸᲇᲁᛱ;

    .line 6
    .line 7
    iget-object v0, p1, Lxhss/ᛸᲇᲁᛱ;->ᛷᛴᛷᛱ:Lxhss/ᛲᛶᲇᲇ;

    .line 8
    .line 9
    iget-object v1, p1, Lxhss/ᛸᲇᲁᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛴᛳᛷ;

    .line 10
    .line 11
    iget-object v2, v1, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 12
    .line 13
    invoke-static {p0}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    move-object v4, p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v4, Lxhss/ᛷᲁᲇᛷ;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-direct {v4, v3, v5}, Lxhss/ᛷᲁᲇᛷ;-><init>(Ljava/lang/Throwable;Z)V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {v0, v2}, Lxhss/ᛲᛶᲇᲇ;->ᛸᛶᲈᛶ(Lxhss/ᛴᛵᛳᛵ;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v5, 0x1

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    iput-object v4, p1, Lxhss/ᛸᲇᲁᛱ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 35
    .line 36
    iput v5, p1, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 37
    .line 38
    invoke-virtual {v0, v2, p1}, Lxhss/ᛲᛶᲇᲇ;->ᛷᲁᲁ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-static {}, Lxhss/ᲀᛵᛷᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛵᛸᛲᛲ;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-wide v6, v0, Lxhss/ᛵᛸᛲᛲ;->ᛳᲁᲇᛸ:J

    .line 47
    .line 48
    const-wide v8, 0x100000000L

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    cmp-long v3, v6, v8

    .line 54
    .line 55
    if-ltz v3, :cond_3

    .line 56
    .line 57
    iput-object v4, p1, Lxhss/ᛸᲇᲁᛱ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 58
    .line 59
    iput v5, p1, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 60
    .line 61
    iget-object p0, v0, Lxhss/ᛵᛸᛲᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛸᲀᛷᛷ;

    .line 62
    .line 63
    if-nez p0, :cond_2

    .line 64
    .line 65
    new-instance p0, Lxhss/ᛸᲀᛷᛷ;

    .line 66
    .line 67
    invoke-direct {p0}, Lxhss/ᛸᲀᛷᛷ;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p0, v0, Lxhss/ᛵᛸᛲᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛸᲀᛷᛷ;

    .line 71
    .line 72
    :cond_2
    invoke-virtual {p0, p1}, Lxhss/ᛸᲀᛷᛷ;->addLast(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_3
    invoke-virtual {v0, v5}, Lxhss/ᛵᛸᛲᛲ;->ᛳᛶᛷᲀ(Z)V

    .line 77
    .line 78
    .line 79
    :try_start_0
    sget-object v3, Lxhss/ᛳᛴᲀᲁ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 80
    .line 81
    invoke-interface {v2, v3}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Lxhss/ᛸᛷᛳᲈ;

    .line 86
    .line 87
    if-eqz v3, :cond_4

    .line 88
    .line 89
    invoke-virtual {v3}, Lxhss/ᛸᛷᛳᲈ;->ᛲᛴᲇᛲ()Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-nez v4, :cond_4

    .line 94
    .line 95
    invoke-virtual {v3}, Lxhss/ᛸᛷᛳᲈ;->ᛸᛲᛷᛱ()Ljava/util/concurrent/CancellationException;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    new-instance v1, Lxhss/ᲈᛳᛱᲇ;

    .line 100
    .line 101
    invoke-direct {v1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v1}, Lxhss/ᛸᲇᲁᛱ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :catchall_0
    move-exception p0

    .line 109
    goto :goto_4

    .line 110
    :cond_4
    iget-object v3, p1, Lxhss/ᛸᲇᲁᛱ;->ᛸᛴᛶᛳ:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-static {v2, v3}, Lxhss/ᛶᲈᛴᛲ;->ᲁᛲᛴᛴ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    sget-object v4, Lxhss/ᛶᲈᛴᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;

    .line 117
    .line 118
    if-eq v3, v4, :cond_5

    .line 119
    .line 120
    invoke-static {v1, v2, v3}, Lxhss/ᛵᛶᲀᲇ;->ᲈᛳᲀ(Lxhss/ᛸᛴᛳᛷ;Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Lxhss/ᲈᲇᛵ;

    .line 121
    .line 122
    .line 123
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    goto :goto_1

    .line 125
    :cond_5
    const/4 v4, 0x0

    .line 126
    :goto_1
    :try_start_1
    invoke-virtual {v1, p0}, Lxhss/ᛷᛲᛳᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    .line 128
    .line 129
    if-eqz v4, :cond_6

    .line 130
    .line 131
    :try_start_2
    invoke-virtual {v4}, Lxhss/ᲈᲇᛵ;->ᛴᛷᛵᛴ()Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-eqz p0, :cond_7

    .line 136
    .line 137
    :cond_6
    invoke-static {v2, v3}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_7
    :goto_2
    invoke-virtual {v0}, Lxhss/ᛵᛸᛲᛲ;->ᲁᛴᲇᛲ()Z

    .line 141
    .line 142
    .line 143
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    if-nez p0, :cond_7

    .line 145
    .line 146
    :goto_3
    invoke-virtual {v0}, Lxhss/ᛵᛸᛲᛲ;->ᛳᲈᲈᛲ()V

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :catchall_1
    move-exception p0

    .line 151
    if-eqz v4, :cond_8

    .line 152
    .line 153
    :try_start_3
    invoke-virtual {v4}, Lxhss/ᲈᲇᛵ;->ᛴᛷᛵᛴ()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_9

    .line 158
    .line 159
    :cond_8
    invoke-static {v2, v3}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_9
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 163
    :goto_4
    :try_start_4
    invoke-virtual {p1, p0}, Lxhss/ᲇᛷᛲᛱ;->ᲀᲇᛳᲁ(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :goto_5
    return-void

    .line 168
    :catchall_2
    move-exception p0

    .line 169
    invoke-virtual {v0}, Lxhss/ᛵᛸᛲᛲ;->ᛳᲈᲈᛲ()V

    .line 170
    .line 171
    .line 172
    throw p0

    .line 173
    :cond_a
    invoke-interface {p1, p0}, Lxhss/ᛱᛴᛶᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public static ᛳᲁᲇᛸ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rem-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    div-int/lit8 v0, v0, 0x2

    .line 14
    .line 15
    new-array v1, v0, [B

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v0, :cond_0

    .line 19
    .line 20
    mul-int/lit8 v3, v2, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {v4}, Lxhss/ᛱᛷᛵᛷ;->ᲇᛶᛴᲀ(C)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    shl-int/lit8 v4, v4, 0x4

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-static {v3}, Lxhss/ᛱᛷᛵᛷ;->ᲇᛶᛴᲀ(C)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-int/2addr v3, v4

    .line 43
    int-to-byte v3, v3

    .line 44
    aput-byte v3, v1, v2

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Lxhss/ᛳᛶᲈᲈ;

    .line 50
    .line 51
    invoke-direct {p0, v1}, Lxhss/ᛳᛶᲈᲈ;-><init>([B)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    const-string v0, "Unexpected hex string: "

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.method public static ᛴᲈᛱᛴ()Lxhss/ᲇᛴᲇᛴ;
    .locals 10

    .line 1
    const-wide v0, -0x8a741b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0x8a831b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, v2

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const-string v0, "->"

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v1, v0, v3, v3, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v2, -0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v3, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v2, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-wide v3, -0x3d261b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v3, v4}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    const-wide v4, -0xb6801b858845L

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {v4, v5}, Lxhss/ᛴᛸᛲᛳ;->ᛴᲈᛱᛴ(J)Lxhss/ᲁᛶᛷ;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    const-wide v5, -0xb68e1b858845L

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    const-wide v6, -0xb69a1b858845L

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    const-wide v7, -0xb6aa1b858845L

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    invoke-static {v7, v8}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    const-wide v8, -0xb6b21b858845L

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    invoke-static {v8, v9}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    filled-new-array {v5, v6, v7, v8}, [Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-virtual {v4, v5}, Lxhss/ᲁᛶᛷ;->ᛱᛲᛸᲇ([Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iput-object v4, v3, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 173
    .line 174
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 183
    .line 184
    if-eqz v1, :cond_5

    .line 185
    .line 186
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    goto :goto_2

    .line 191
    :cond_5
    move-object v1, v2

    .line 192
    :goto_2
    const-wide/16 v3, 0x1

    .line 193
    .line 194
    if-nez v1, :cond_6

    .line 195
    .line 196
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 197
    .line 198
    add-long/2addr v5, v3

    .line 199
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 200
    .line 201
    new-instance v1, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    const-wide v3, -0x8a841b858845L

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const/16 v3, 0x27

    .line 216
    .line 217
    invoke-static {v1, v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 218
    .line 219
    .line 220
    return-object v2

    .line 221
    :cond_6
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-lez v5, :cond_7

    .line 230
    .line 231
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 232
    .line 233
    add-long/2addr v5, v3

    .line 234
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 235
    .line 236
    new-instance v3, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    const-wide v4, -0x8aa71b858845L

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    const-wide v4, -0x8ac81b858845L

    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 260
    .line 261
    .line 262
    :cond_7
    return-object v1
.end method

.method public static ᛶᲇᲈᛸ()Lxhss/ᲇᛴᲇᛴ;
    .locals 10

    .line 1
    const-wide v0, -0xa03c1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xa0581b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x1

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v1, v3

    .line 44
    :goto_0
    if-eqz v1, :cond_3

    .line 45
    .line 46
    const-string v0, "->"

    .line 47
    .line 48
    const/4 v3, 0x6

    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-static {v1, v0, v4, v4, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v3, -0x1

    .line 55
    if-ne v0, v3, :cond_1

    .line 56
    .line 57
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 58
    .line 59
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    add-int/2addr v0, v2

    .line 64
    const/4 v2, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v4, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v3, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v3

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-wide v4, -0x65d41b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v4, v5}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    const-wide v5, -0x74da1b858845L

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {v5, v6}, Lxhss/ᛴᛸᛲᛳ;->ᛴᲈᛱᛴ(J)Lxhss/ᲁᛶᛷ;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    const-wide v6, -0x74e81b858845L

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    const-wide v8, -0x74f21b858845L

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    invoke-static {v6, v7, v8, v9, v5}, Lxhss/ᛴᛸᛲᛳ;->ᲇᛸᛳᲁ(JJLxhss/ᲁᛶᛷ;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    invoke-static {v5, v6}, Lxhss/ᲁᛶᛷ;->ᛵᛲᲁᛶ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v2}, Lxhss/ᲁᛶᛷ;->ᛸᛴᛸᛲ(I)V

    .line 147
    .line 148
    .line 149
    const-wide v6, -0x75181b858845L

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static {v5, v2}, Lxhss/ᲁᛶᛷ;->ᛴᲀᛸᛵ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    const-wide v6, -0x751d1b858845L

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const-wide v6, -0x752e1b858845L

    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    filled-new-array {v2, v6}, [Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v5, v2}, Lxhss/ᲁᛶᛷ;->ᛱᛲᛸᲇ([Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    iput-object v5, v4, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 187
    .line 188
    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 197
    .line 198
    if-eqz v1, :cond_5

    .line 199
    .line 200
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    goto :goto_2

    .line 205
    :cond_5
    move-object v1, v3

    .line 206
    :goto_2
    const-wide/16 v4, 0x1

    .line 207
    .line 208
    if-nez v1, :cond_6

    .line 209
    .line 210
    sget-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 211
    .line 212
    add-long/2addr v1, v4

    .line 213
    sput-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 214
    .line 215
    new-instance v1, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-wide v4, -0xa0591b858845L

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const/16 v2, 0x27

    .line 230
    .line 231
    invoke-static {v1, v0, v2}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 232
    .line 233
    .line 234
    return-object v3

    .line 235
    :cond_6
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-lez v3, :cond_7

    .line 244
    .line 245
    sget-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 246
    .line 247
    add-long/2addr v6, v4

    .line 248
    sput-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 249
    .line 250
    new-instance v3, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    const-wide v4, -0xa07c1b858845L

    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    const-wide v4, -0xa09d1b858845L

    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 274
    .line 275
    .line 276
    :cond_7
    return-object v1
.end method

.method public static final ᛷᛴᛷᛱ(J)Ljava/lang/String;
    .locals 18

    .line 1
    const-wide/32 v0, -0x3b9328e0

    .line 2
    .line 3
    .line 4
    cmp-long v0, p0, v0

    .line 5
    .line 6
    const-string v1, " s "

    .line 7
    .line 8
    const-wide/32 v2, 0x3b9aca00

    .line 9
    .line 10
    .line 11
    const-wide/32 v4, 0x1dcd6500

    .line 12
    .line 13
    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    sub-long v4, p0, v4

    .line 22
    .line 23
    div-long/2addr v4, v2

    .line 24
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_0
    const-wide/32 v6, -0xf404c

    .line 37
    .line 38
    .line 39
    cmp-long v0, p0, v6

    .line 40
    .line 41
    const-string v6, " ms"

    .line 42
    .line 43
    const-wide/32 v7, 0xf4240

    .line 44
    .line 45
    .line 46
    const-wide/32 v9, 0x7a120

    .line 47
    .line 48
    .line 49
    if-gtz v0, :cond_1

    .line 50
    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    sub-long v1, p0, v9

    .line 57
    .line 58
    div-long/2addr v1, v7

    .line 59
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const-wide/16 v11, 0x0

    .line 71
    .line 72
    cmp-long v0, p0, v11

    .line 73
    .line 74
    const-string v11, " \u00b5s"

    .line 75
    .line 76
    const-wide/16 v12, 0x3e8

    .line 77
    .line 78
    const-wide/16 v14, 0x1f4

    .line 79
    .line 80
    if-gtz v0, :cond_2

    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    sub-long v1, p0, v14

    .line 88
    .line 89
    div-long/2addr v1, v12

    .line 90
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    const-wide/32 v16, 0xf404c

    .line 102
    .line 103
    .line 104
    cmp-long v0, p0, v16

    .line 105
    .line 106
    if-gez v0, :cond_3

    .line 107
    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    add-long v1, p0, v14

    .line 114
    .line 115
    div-long/2addr v1, v12

    .line 116
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    goto :goto_0

    .line 127
    :cond_3
    const-wide/32 v11, 0x3b9328e0

    .line 128
    .line 129
    .line 130
    cmp-long v0, p0, v11

    .line 131
    .line 132
    if-gez v0, :cond_4

    .line 133
    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    add-long v1, p0, v9

    .line 140
    .line 141
    div-long/2addr v1, v7

    .line 142
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    goto :goto_0

    .line 153
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    add-long v4, p0, v4

    .line 159
    .line 160
    div-long/2addr v4, v2

    .line 161
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :goto_0
    const/4 v1, 0x1

    .line 172
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    const-string v1, "%6s"

    .line 181
    .line 182
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    return-object v0
.end method

.method public static ᛷᛵᛵᲈ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-eq p0, p1, :cond_2

    .line 2
    .line 3
    sget-object v0, Lxhss/ᛶᛵᲈᲁ;->ᛷᛵᛵᲈ:Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x13

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, Lxhss/ᲁᛸᛴᲇ;->ᛷᛵᛵᲈ:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    return-void
.end method

.method public static ᛷᲁᲁ()Lxhss/ᲇᛴᲇᛴ;
    .locals 8

    .line 1
    const-wide v0, -0xb00b1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xb0361b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v1, v3

    .line 44
    :goto_0
    if-eqz v1, :cond_3

    .line 45
    .line 46
    const-string v0, "->"

    .line 47
    .line 48
    const/4 v3, 0x6

    .line 49
    invoke-static {v1, v0, v2, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, -0x1

    .line 54
    if-ne v0, v3, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v2, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v3, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v3

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-wide v4, -0xb6cc1b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v4, v5}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    const-wide v5, -0x4c161b858845L

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {v5, v6}, Lxhss/ᛴᛸᛲᛳ;->ᛴᲈᛱᛴ(J)Lxhss/ᲁᛶᛷ;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    const-wide v6, -0x4c241b858845L

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v5, v6}, Lxhss/ᲁᛶᛷ;->ᛵᛲᲁᛶ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const-wide v6, -0x4c4b1b858845L

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-static {v5, v6}, Lxhss/ᲁᛶᛷ;->ᛱᲈᛳᛴ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const-wide v6, -0x4c691b858845L

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-static {v5, v6}, Lxhss/ᲁᛶᛷ;->ᛴᲀᛸᛵ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5, v2}, Lxhss/ᲁᛶᛷ;->ᛸᛴᛸᛲ(I)V

    .line 166
    .line 167
    .line 168
    iput-object v5, v4, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 169
    .line 170
    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 179
    .line 180
    if-eqz v1, :cond_5

    .line 181
    .line 182
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    goto :goto_2

    .line 187
    :cond_5
    move-object v1, v3

    .line 188
    :goto_2
    const-wide/16 v4, 0x1

    .line 189
    .line 190
    if-nez v1, :cond_6

    .line 191
    .line 192
    sget-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 193
    .line 194
    add-long/2addr v1, v4

    .line 195
    sput-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 196
    .line 197
    new-instance v1, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    const-wide v4, -0xb0371b858845L

    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    const/16 v2, 0x27

    .line 212
    .line 213
    invoke-static {v1, v0, v2}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 214
    .line 215
    .line 216
    return-object v3

    .line 217
    :cond_6
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-lez v3, :cond_7

    .line 226
    .line 227
    sget-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 228
    .line 229
    add-long/2addr v6, v4

    .line 230
    sput-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 231
    .line 232
    new-instance v3, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    const-wide v4, -0xb05a1b858845L

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    const-wide v4, -0xb07b1b858845L

    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 256
    .line 257
    .line 258
    :cond_7
    return-object v1
.end method

.method public static ᛸᛲᛷᛱ()Lxhss/ᲇᛶᛳᛵ;
    .locals 7

    .line 1
    const-wide v0, -0xaa4a1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xaa601b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, v2

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const-string v0, "->"

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v1, v0, v3, v3, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v2, -0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v3, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v2, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛶᛳᛵ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    sget-object v3, Lxhss/ᛲᛷᛵᲁ;->ᲁᲁᛴᲁ:Lxhss/ᛲᛷᛵᲁ;

    .line 112
    .line 113
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᲀᲇᛳᲁ(Lxhss/ᛷᛴᛲᛲ;)Lxhss/ᛵᛲᛴᛵ;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Lxhss/ᲇᛸᛳᛸ;

    .line 122
    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    invoke-virtual {v1}, Lxhss/ᲇᛸᛳᛸ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛶᛳᛵ;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    goto :goto_2

    .line 130
    :cond_5
    move-object v1, v2

    .line 131
    :goto_2
    const-wide/16 v3, 0x1

    .line 132
    .line 133
    if-nez v1, :cond_6

    .line 134
    .line 135
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 136
    .line 137
    add-long/2addr v5, v3

    .line 138
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 139
    .line 140
    new-instance v1, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-wide v3, -0xaa611b858845L

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    const/16 v3, 0x27

    .line 155
    .line 156
    invoke-static {v1, v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 157
    .line 158
    .line 159
    return-object v2

    .line 160
    :cond_6
    iget-object v2, v1, Lxhss/ᲇᛶᛳᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v2}, Lxhss/ᛱᛲᲁᛸ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-lez v5, :cond_7

    .line 171
    .line 172
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 173
    .line 174
    add-long/2addr v5, v3

    .line 175
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 176
    .line 177
    new-instance v3, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    const-wide v4, -0xaa841b858845L

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const-wide v4, -0xaaa51b858845L

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 201
    .line 202
    .line 203
    :cond_7
    return-object v1
.end method

.method public static ᛸᛲᲀᛵ()Lxhss/ᲇᛴᲇᛴ;
    .locals 8

    .line 1
    const-wide v0, -0x8f6e1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0x8f7d1b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, v2

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const-string v0, "->"

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v1, v0, v3, v3, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v2, -0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v3, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v2, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-wide v3, -0x7a491b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v3, v4}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    new-instance v4, Lxhss/ᲁᛶᛷ;

    .line 121
    .line 122
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    const-wide v5, -0xbf871b858845L

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    const/16 v5, 0x8

    .line 134
    .line 135
    invoke-static {v4, v5}, Lxhss/ᲁᛶᛷ;->ᛵᛷᛲᛸ(Lxhss/ᲁᛶᛷ;I)V

    .line 136
    .line 137
    .line 138
    const-wide v5, -0xbf951b858845L

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-static {v4, v5}, Lxhss/ᲁᛶᛷ;->ᛴᲀᛸᛵ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const-wide v5, -0xbfc11b858845L

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    const-wide v6, -0xbfd91b858845L

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v4, v5}, Lxhss/ᲁᛶᛷ;->ᲁᛷᲇᲇ([Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    iput-object v4, v3, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 176
    .line 177
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 186
    .line 187
    if-eqz v1, :cond_5

    .line 188
    .line 189
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    goto :goto_2

    .line 194
    :cond_5
    move-object v1, v2

    .line 195
    :goto_2
    const-wide/16 v3, 0x1

    .line 196
    .line 197
    if-nez v1, :cond_6

    .line 198
    .line 199
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 200
    .line 201
    add-long/2addr v5, v3

    .line 202
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 203
    .line 204
    new-instance v1, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-wide v3, -0x8f7e1b858845L

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    const/16 v3, 0x27

    .line 219
    .line 220
    invoke-static {v1, v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 221
    .line 222
    .line 223
    return-object v2

    .line 224
    :cond_6
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-lez v5, :cond_7

    .line 233
    .line 234
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 235
    .line 236
    add-long/2addr v5, v3

    .line 237
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 238
    .line 239
    new-instance v3, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    const-wide v4, -0x8fa11b858845L

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    const-wide v4, -0x8fc21b858845L

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 263
    .line 264
    .line 265
    :cond_7
    return-object v1
.end method

.method public static ᛸᛴᛶᛳ()Lxhss/ᲇᛴᲇᛴ;
    .locals 8

    .line 1
    const-wide v0, -0xb07f1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xb09d1b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v1, v3

    .line 44
    :goto_0
    if-eqz v1, :cond_3

    .line 45
    .line 46
    const-string v0, "->"

    .line 47
    .line 48
    const/4 v3, 0x6

    .line 49
    invoke-static {v1, v0, v2, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, -0x1

    .line 54
    if-ne v0, v3, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v2, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v3, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v3

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    sget-object v4, Lxhss/ᛲᛱᲀᛵ;->ᲈᛲᛵᲁ:Lxhss/ᛲᛱᲀᛵ;

    .line 112
    .line 113
    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->ᲀᲇᛳᲁ(Lxhss/ᛷᛴᛲᛲ;)Lxhss/ᛵᛲᛴᛵ;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const-wide v4, -0x681e1b858845L

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {v4, v5}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    const-wide v5, -0x67121b858845L

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    invoke-static {v5, v6}, Lxhss/ᛴᛸᛲᛳ;->ᛴᲈᛱᛴ(J)Lxhss/ᲁᛶᛷ;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    const-wide v6, -0x67201b858845L

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-static {v5, v6}, Lxhss/ᲁᛶᛷ;->ᛴᲀᛸᛵ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v2}, Lxhss/ᲁᛶᛷ;->ᛸᛴᛸᛲ(I)V

    .line 148
    .line 149
    .line 150
    const-wide v6, -0x67251b858845L

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    filled-new-array {v2}, [Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v5, v2}, Lxhss/ᲁᛶᛷ;->ᛱᛲᛸᲇ([Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iput-object v5, v4, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_5

    .line 173
    .line 174
    new-instance v1, Lxhss/ᲈᛴᲀᛲ;

    .line 175
    .line 176
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_5
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->first()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Lxhss/ᲇᛸᛳᛸ;

    .line 185
    .line 186
    iget-object v2, v2, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 189
    .line 190
    iput-object v1, v4, Lxhss/ᛶᲈᛷᲁ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    :goto_2
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 201
    .line 202
    if-eqz v1, :cond_6

    .line 203
    .line 204
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    goto :goto_3

    .line 209
    :cond_6
    move-object v1, v3

    .line 210
    :goto_3
    const-wide/16 v4, 0x1

    .line 211
    .line 212
    if-nez v1, :cond_7

    .line 213
    .line 214
    sget-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 215
    .line 216
    add-long/2addr v1, v4

    .line 217
    sput-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 218
    .line 219
    new-instance v1, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    const-wide v4, -0xb09e1b858845L

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    const/16 v2, 0x27

    .line 234
    .line 235
    invoke-static {v1, v0, v2}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 236
    .line 237
    .line 238
    return-object v3

    .line 239
    :cond_7
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-lez v3, :cond_8

    .line 248
    .line 249
    sget-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 250
    .line 251
    add-long/2addr v6, v4

    .line 252
    sput-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 253
    .line 254
    new-instance v3, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    const-wide v4, -0xb0c11b858845L

    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    const-wide v4, -0xb0e21b858845L

    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 278
    .line 279
    .line 280
    :cond_8
    return-object v1
.end method

.method public static ᛸᛶᛴᲈ()Lxhss/ᲇᛴᲇᛴ;
    .locals 17

    .line 1
    const-wide v0, -0xaca71b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xacc61b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x4

    .line 33
    const-string v3, ":"

    .line 34
    .line 35
    const/4 v4, 0x6

    .line 36
    const-string v5, "->"

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x1

    .line 40
    const/4 v8, -0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    if-nez v10, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v1, v9

    .line 52
    :goto_0
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-static {v1, v5, v6, v6, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-ne v0, v8, :cond_1

    .line 59
    .line 60
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 61
    .line 62
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    add-int/2addr v0, v7

    .line 67
    invoke-static {v1, v3, v0, v6, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v8, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v9

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    const/16 v10, 0x27

    .line 110
    .line 111
    const-wide/16 v11, 0x1

    .line 112
    .line 113
    if-eqz v1, :cond_e

    .line 114
    .line 115
    const-wide v13, -0xabd51b858845L

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    const-wide v15, -0xabf71b858845L

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    invoke-static/range {v15 .. v16}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v15

    .line 137
    invoke-virtual {v14, v13, v15}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    if-eqz v14, :cond_8

    .line 142
    .line 143
    invoke-static {v14}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    if-nez v15, :cond_5

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    move-object v14, v9

    .line 151
    :goto_2
    if-eqz v14, :cond_8

    .line 152
    .line 153
    invoke-static {v14, v5, v6, v6, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-ne v4, v8, :cond_6

    .line 158
    .line 159
    new-instance v2, Lxhss/ᲇᛶᛳᛵ;

    .line 160
    .line 161
    invoke-direct {v2, v14}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_6
    add-int/2addr v4, v7

    .line 166
    invoke-static {v14, v3, v4, v6, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-ne v2, v8, :cond_7

    .line 171
    .line 172
    new-instance v2, Lxhss/ᲇᛴᲇᛴ;

    .line 173
    .line 174
    invoke-direct {v2, v14}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_7
    new-instance v2, Lxhss/ᛷᛲᛲᛲ;

    .line 179
    .line 180
    invoke-direct {v2, v14}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :goto_3
    check-cast v2, Lxhss/ᲇᛴᲇᛴ;

    .line 184
    .line 185
    goto/16 :goto_6

    .line 186
    .line 187
    :cond_8
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 188
    .line 189
    if-nez v2, :cond_9

    .line 190
    .line 191
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-nez v2, :cond_9

    .line 200
    .line 201
    :goto_4
    move-object v2, v9

    .line 202
    goto :goto_6

    .line 203
    :cond_9
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 204
    .line 205
    if-eqz v2, :cond_a

    .line 206
    .line 207
    const-wide v3, -0x4ad51b858845L

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    invoke-static {v3, v4}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    sget-object v4, Lxhss/ᛲᛷᛵᲁ;->ᲈᛲᛵᲁ:Lxhss/ᛲᛷᛵᲁ;

    .line 217
    .line 218
    invoke-virtual {v3, v4}, Lxhss/ᛶᲈᛷᲁ;->ᛵᛷᛲᛸ(Lxhss/ᛷᛴᛲᛲ;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v2}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    check-cast v2, Lxhss/ᛳᛸᛸᛵ;

    .line 230
    .line 231
    if-eqz v2, :cond_a

    .line 232
    .line 233
    invoke-virtual {v2}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    goto :goto_5

    .line 238
    :cond_a
    move-object v2, v9

    .line 239
    :goto_5
    if-nez v2, :cond_b

    .line 240
    .line 241
    sget-wide v2, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 242
    .line 243
    add-long/2addr v2, v11

    .line 244
    sput-wide v2, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 245
    .line 246
    new-instance v2, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    const-wide v3, -0xabf81b858845L

    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v2, v13, v10}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 261
    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_b
    invoke-virtual {v2}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    if-lez v4, :cond_c

    .line 273
    .line 274
    sget-wide v4, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 275
    .line 276
    add-long/2addr v4, v11

    .line 277
    sput-wide v4, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 278
    .line 279
    new-instance v4, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    const-wide v5, -0xac1b1b858845L

    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const-wide v5, -0xac3c1b858845L

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    invoke-static {v4, v13, v5, v6, v3}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-virtual {v4, v13, v3}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 303
    .line 304
    .line 305
    :cond_c
    :goto_6
    if-nez v2, :cond_d

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_d
    const-wide v3, -0x31e71b858845L

    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    invoke-static {v3, v4}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    new-instance v4, Lxhss/ᛵᛸᲈᛵ;

    .line 318
    .line 319
    invoke-direct {v4, v7, v2}, Lxhss/ᛵᛸᲈᛵ;-><init>(ILjava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3, v4}, Lxhss/ᛶᲈᛷᲁ;->ᛵᛷᛲᛸ(Lxhss/ᛷᛴᛲᛲ;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 334
    .line 335
    if-eqz v1, :cond_e

    .line 336
    .line 337
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    goto :goto_8

    .line 342
    :cond_e
    :goto_7
    move-object v1, v9

    .line 343
    :goto_8
    if-nez v1, :cond_f

    .line 344
    .line 345
    sget-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 346
    .line 347
    add-long/2addr v1, v11

    .line 348
    sput-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 349
    .line 350
    new-instance v1, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-wide v2, -0xacc71b858845L

    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-static {v1, v0, v10}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 365
    .line 366
    .line 367
    return-object v9

    .line 368
    :cond_f
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    if-lez v3, :cond_10

    .line 377
    .line 378
    sget-wide v3, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 379
    .line 380
    add-long/2addr v3, v11

    .line 381
    sput-wide v3, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 382
    .line 383
    new-instance v3, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    const-wide v4, -0xacea1b858845L

    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    const-wide v4, -0xad0b1b858845L

    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 407
    .line 408
    .line 409
    :cond_10
    return-object v1
.end method

.method public static ᛸᛶᲈᛶ()Lxhss/ᲇᛴᲇᛴ;
    .locals 11

    .line 1
    const-wide v0, -0xb2481b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xb2621b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, v2

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const-string v0, "->"

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v1, v0, v3, v3, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v2, -0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v3, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v2, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-wide v3, -0x52561b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v3, v4}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    new-instance v4, Lxhss/ᲁᛶᛷ;

    .line 121
    .line 122
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    const-wide v5, -0xd2fa1b858845L

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    const/4 v5, 0x5

    .line 134
    invoke-virtual {v4, v5}, Lxhss/ᲁᛶᛷ;->ᛸᛴᛸᛲ(I)V

    .line 135
    .line 136
    .line 137
    const-wide v5, -0xd3081b858845L

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    const-wide v6, -0xd3201b858845L

    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    const-wide v7, -0xd3341b858845L

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    invoke-static {v7, v8}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    const-wide v8, -0xd3411b858845L

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    invoke-static {v8, v9}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    const-wide v9, -0xd3521b858845L

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    invoke-static {v9, v10}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    filled-new-array {v5, v6, v7, v8, v9}, [Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {v4, v5}, Lxhss/ᲁᛶᛷ;->ᛱᛲᛸᲇ([Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    iput-object v4, v3, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 190
    .line 191
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 200
    .line 201
    if-eqz v1, :cond_5

    .line 202
    .line 203
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    goto :goto_2

    .line 208
    :cond_5
    move-object v1, v2

    .line 209
    :goto_2
    const-wide/16 v3, 0x1

    .line 210
    .line 211
    if-nez v1, :cond_6

    .line 212
    .line 213
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 214
    .line 215
    add-long/2addr v5, v3

    .line 216
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 217
    .line 218
    new-instance v1, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-wide v3, -0xb2631b858845L

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const/16 v3, 0x27

    .line 233
    .line 234
    invoke-static {v1, v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 235
    .line 236
    .line 237
    return-object v2

    .line 238
    :cond_6
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    if-lez v5, :cond_7

    .line 247
    .line 248
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 249
    .line 250
    add-long/2addr v5, v3

    .line 251
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 252
    .line 253
    new-instance v3, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    const-wide v4, -0xb2861b858845L

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    const-wide v4, -0xb2a71b858845L

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 277
    .line 278
    .line 279
    :cond_7
    return-object v1
.end method

.method public static ᛸᛷᲈᲈ()Lxhss/ᲇᛴᲇᛴ;
    .locals 7

    .line 1
    const-wide v0, -0xad0f1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xad391b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, v2

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const-string v0, "->"

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v1, v0, v3, v3, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v2, -0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v3, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v2, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-wide v3, -0x79901b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v3, v4}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    sget-object v4, Lxhss/ᛴᲈᲁᲇ;->ᛲᛴᲇᛲ:Lxhss/ᛴᲈᲁᲇ;

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Lxhss/ᛶᲈᛷᲁ;->ᛵᛷᛲᛸ(Lxhss/ᛷᛴᛲᛲ;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 134
    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    move-object v1, v2

    .line 143
    :goto_2
    const-wide/16 v3, 0x1

    .line 144
    .line 145
    if-nez v1, :cond_6

    .line 146
    .line 147
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 148
    .line 149
    add-long/2addr v5, v3

    .line 150
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 151
    .line 152
    new-instance v1, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-wide v3, -0xad3a1b858845L

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const/16 v3, 0x27

    .line 167
    .line 168
    invoke-static {v1, v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 169
    .line 170
    .line 171
    return-object v2

    .line 172
    :cond_6
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-lez v5, :cond_7

    .line 181
    .line 182
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 183
    .line 184
    add-long/2addr v5, v3

    .line 185
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 186
    .line 187
    new-instance v3, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-wide v4, -0xad5d1b858845L

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-wide v4, -0xad7e1b858845L

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 211
    .line 212
    .line 213
    :cond_7
    return-object v1
.end method

.method public static ᲀᛷᲁᲀ()Lxhss/ᲇᛴᲇᛴ;
    .locals 8

    .line 1
    const-wide v0, -0xa5eb1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xa6101b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v1, v3

    .line 44
    :goto_0
    if-eqz v1, :cond_3

    .line 45
    .line 46
    const-string v0, "->"

    .line 47
    .line 48
    const/4 v3, 0x6

    .line 49
    invoke-static {v1, v0, v2, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, -0x1

    .line 54
    if-ne v0, v3, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v2, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v3, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v3

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-wide v4, -0x3a051b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v4, v5}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    const-wide v5, -0xe3fd1b858845L

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {v5, v6}, Lxhss/ᛴᛸᛲᛳ;->ᛴᲈᛱᛴ(J)Lxhss/ᲁᛶᛷ;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    const-wide v6, -0xe40b1b858845L

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v5, v6}, Lxhss/ᲁᛶᛷ;->ᛵᛲᲁᛶ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5, v2}, Lxhss/ᲁᛶᛷ;->ᛸᛴᛸᛲ(I)V

    .line 142
    .line 143
    .line 144
    const-wide v6, -0xe45e1b858845L

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v5, v2}, Lxhss/ᲁᛶᛷ;->ᛴᲀᛸᛵ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iput-object v5, v4, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 157
    .line 158
    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 167
    .line 168
    if-eqz v1, :cond_5

    .line 169
    .line 170
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    goto :goto_2

    .line 175
    :cond_5
    move-object v1, v3

    .line 176
    :goto_2
    const-wide/16 v4, 0x1

    .line 177
    .line 178
    if-nez v1, :cond_6

    .line 179
    .line 180
    sget-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 181
    .line 182
    add-long/2addr v1, v4

    .line 183
    sput-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 184
    .line 185
    new-instance v1, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-wide v4, -0xa6111b858845L

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    const/16 v2, 0x27

    .line 200
    .line 201
    invoke-static {v1, v0, v2}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 202
    .line 203
    .line 204
    return-object v3

    .line 205
    :cond_6
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-lez v3, :cond_7

    .line 214
    .line 215
    sget-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 216
    .line 217
    add-long/2addr v6, v4

    .line 218
    sput-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 219
    .line 220
    new-instance v3, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-wide v4, -0xa6341b858845L

    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    const-wide v4, -0xa6551b858845L

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 244
    .line 245
    .line 246
    :cond_7
    return-object v1
.end method

.method public static ᲁᛲᛴᛴ()Lxhss/ᲇᛴᲇᛴ;
    .locals 7

    .line 1
    const-wide v0, -0xac401b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xac5e1b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, v2

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const-string v0, "->"

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v1, v0, v3, v3, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v2, -0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v3, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v2, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-wide v3, -0x79b01b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v3, v4}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    sget-object v4, Lxhss/ᛳᛵᛲᛳ;->ᛵᛲᲁᛶ:Lxhss/ᛳᛵᛲᛳ;

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Lxhss/ᛶᲈᛷᲁ;->ᛵᛷᛲᛸ(Lxhss/ᛷᛴᛲᛲ;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 134
    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    move-object v1, v2

    .line 143
    :goto_2
    const-wide/16 v3, 0x1

    .line 144
    .line 145
    if-nez v1, :cond_6

    .line 146
    .line 147
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 148
    .line 149
    add-long/2addr v5, v3

    .line 150
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 151
    .line 152
    new-instance v1, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-wide v3, -0xac5f1b858845L

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const/16 v3, 0x27

    .line 167
    .line 168
    invoke-static {v1, v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 169
    .line 170
    .line 171
    return-object v2

    .line 172
    :cond_6
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-lez v5, :cond_7

    .line 181
    .line 182
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 183
    .line 184
    add-long/2addr v5, v3

    .line 185
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 186
    .line 187
    new-instance v3, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-wide v4, -0xac821b858845L

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-wide v4, -0xaca31b858845L

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 211
    .line 212
    .line 213
    :cond_7
    return-object v1
.end method

.method public static ᲁᛴᛴᛸ(Ljava/lang/Object;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    sget v0, Lxhss/ᲈᲀᲀᛱ;->ᛸᛴᛶᛳ:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    sput v0, Lxhss/ᲈᲀᲀᛱ;->ᛸᛴᛶᛳ:I

    .line 9
    .line 10
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-wide v2, -0xd4f1b858845L

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget v2, Lxhss/ᲈᲀᲀᛱ;->ᛸᛴᛶᛳ:I

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-wide v2, -0xd591b858845L

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, Lxhss/ᲇᲁᛱᛸ;->ᲇᛶᛴᲀ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛲᲀᛵ(Ljava/lang/String;)Ljava/io/File;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {}, Lxhss/ᛸᛳᛶᲀ;->ᛷᛵᛵᲈ()Lxhss/ᲈᛲᛶᛴ;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1, p0}, Lxhss/ᲈᛲᛶᛴ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object v1, Lxhss/ᛶᲈᲇᲇ;->ᛷᛵᛵᲈ:Ljava/nio/charset/Charset;

    .line 64
    .line 65
    new-instance v2, Ljava/io/FileOutputStream;

    .line 66
    .line 67
    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 68
    .line 69
    .line 70
    :try_start_0
    invoke-static {v2, p0, v1}, Lxhss/ᛶᲈᛴᛲ;->ᲈᛲᛵᲁ(Ljava/io/FileOutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    :catchall_1
    move-exception v0

    .line 80
    invoke-static {v2, p0}, Lxhss/ᛶᛵᛱ;->ᛳᲁᲇᛸ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    throw v0
.end method

.method public static ᲁᛴᲇᛲ()Lxhss/ᛷᛲᛲᛲ;
    .locals 8

    .line 1
    const-wide v0, -0xa5851b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xa5a21b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v1, v3

    .line 44
    :goto_0
    if-eqz v1, :cond_3

    .line 45
    .line 46
    const-string v0, "->"

    .line 47
    .line 48
    const/4 v3, 0x6

    .line 49
    invoke-static {v1, v0, v2, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, -0x1

    .line 54
    if-ne v0, v3, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v2, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v3, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᛷᛲᛲᛲ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v3

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    sget-object v4, Lxhss/ᲀᛶᛴᛲ;->ᲀᲇᛳᲁ:Lxhss/ᲀᛶᛴᛲ;

    .line 112
    .line 113
    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->ᲀᲇᛳᲁ(Lxhss/ᛷᛴᛲᛲ;)Lxhss/ᛵᛲᛴᛵ;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Lxhss/ᲇᛸᛳᛸ;

    .line 122
    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    new-instance v4, Lxhss/ᛶᲈᛷᲁ;

    .line 126
    .line 127
    invoke-direct {v4, v2}, Lxhss/ᛶᲈᛷᲁ;-><init>(I)V

    .line 128
    .line 129
    .line 130
    const-wide v5, -0xff221b858845L

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    new-instance v2, Lxhss/ᛴᲁᛶᲁ;

    .line 139
    .line 140
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 141
    .line 142
    .line 143
    const-wide v5, -0x780b1b858845L

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    const-wide v5, -0x78191b858845L

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-static {v2, v5}, Lxhss/ᛴᲁᛶᲁ;->ᛵᛲᲁᛶ(Lxhss/ᛴᲁᛶᲁ;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iput-object v2, v4, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 164
    .line 165
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    iput-object v2, v4, Lxhss/ᛶᲈᛷᲁ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 170
    .line 171
    iget-object v1, v1, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 174
    .line 175
    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->ᛸᛲᲀᛵ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛶᲀᛱ;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Lxhss/ᲀᛷᲀᲇ;

    .line 184
    .line 185
    if-eqz v1, :cond_5

    .line 186
    .line 187
    invoke-virtual {v1}, Lxhss/ᲀᛷᲀᲇ;->ᛷᛴᛷᛱ()Lxhss/ᛷᛲᛲᛲ;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    goto :goto_2

    .line 192
    :cond_5
    move-object v1, v3

    .line 193
    :goto_2
    const-wide/16 v4, 0x1

    .line 194
    .line 195
    if-nez v1, :cond_6

    .line 196
    .line 197
    sget-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 198
    .line 199
    add-long/2addr v1, v4

    .line 200
    sput-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 201
    .line 202
    new-instance v1, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    const-wide v4, -0xa5a31b858845L

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const/16 v2, 0x27

    .line 217
    .line 218
    invoke-static {v1, v0, v2}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 219
    .line 220
    .line 221
    return-object v3

    .line 222
    :cond_6
    invoke-virtual {v1}, Lxhss/ᛷᛲᛲᛲ;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-lez v3, :cond_7

    .line 231
    .line 232
    sget-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 233
    .line 234
    add-long/2addr v6, v4

    .line 235
    sput-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 236
    .line 237
    new-instance v3, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-wide v4, -0xa5c61b858845L

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    const-wide v4, -0xa5e71b858845L

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 261
    .line 262
    .line 263
    :cond_7
    return-object v1
.end method

.method public static final ᲁᲁᛴᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lxhss/ᛷᲁᲇᛷ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lxhss/ᛷᲁᲇᛷ;

    .line 6
    .line 7
    iget-object p0, p0, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 8
    .line 9
    new-instance v0, Lxhss/ᲈᛳᛱᲇ;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    return-object p0
.end method

.method public static ᲇᛴᲇᛵ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛳᛶᲈᲈ;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛶᲈᲇᲇ;->ᛷᛵᛵᲈ:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lxhss/ᛳᛶᲈᲈ;-><init>([B)V

    .line 10
    .line 11
    .line 12
    iput-object p0, v0, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public static ᲇᛸᛳᲁ()Lxhss/ᲇᛴᲇᛴ;
    .locals 7

    .line 1
    const-wide v0, -0xb2ab1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xb2c91b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, v2

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const-string v0, "->"

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v1, v0, v3, v3, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v2, -0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v3, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v2, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-wide v3, -0x56ad1b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v3, v4}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    sget-object v4, Lxhss/ᛲᛷᛵᲁ;->ᛸᛲᛷᛱ:Lxhss/ᛲᛷᛵᲁ;

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Lxhss/ᛶᲈᛷᲁ;->ᛵᛷᛲᛸ(Lxhss/ᛷᛴᛲᛲ;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 134
    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    move-object v1, v2

    .line 143
    :goto_2
    const-wide/16 v3, 0x1

    .line 144
    .line 145
    if-nez v1, :cond_6

    .line 146
    .line 147
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 148
    .line 149
    add-long/2addr v5, v3

    .line 150
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 151
    .line 152
    new-instance v1, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-wide v3, -0xb2ca1b858845L

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const/16 v3, 0x27

    .line 167
    .line 168
    invoke-static {v1, v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 169
    .line 170
    .line 171
    return-object v2

    .line 172
    :cond_6
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-lez v5, :cond_7

    .line 181
    .line 182
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 183
    .line 184
    add-long/2addr v5, v3

    .line 185
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 186
    .line 187
    new-instance v3, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-wide v4, -0xb2ed1b858845L

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-wide v4, -0xb30e1b858845L

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 211
    .line 212
    .line 213
    :cond_7
    return-object v1
.end method

.method public static ᲈᛲᛵᲁ()Lxhss/ᲇᛴᲇᛴ;
    .locals 10

    .line 1
    const-wide v0, -0x8f131b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0x8f251b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v1, v3

    .line 44
    :goto_0
    if-eqz v1, :cond_3

    .line 45
    .line 46
    const-string v0, "->"

    .line 47
    .line 48
    const/4 v3, 0x6

    .line 49
    invoke-static {v1, v0, v2, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, -0x1

    .line 54
    if-ne v0, v3, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v2, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v3, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v3

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-wide v4, -0xd9651b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v4, v5}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    const-wide v5, -0x79f61b858845L

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {v5, v6}, Lxhss/ᛴᛸᛲᛳ;->ᛴᲈᛱᛴ(J)Lxhss/ᲁᛶᛷ;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    const-wide v6, -0x7a041b858845L

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    const-wide v7, -0x7a141b858845L

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    invoke-static {v7, v8}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    const-wide v8, -0x7a231b858845L

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    invoke-static {v8, v9}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    filled-new-array {v6, v7, v8}, [Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-virtual {v5, v6}, Lxhss/ᲁᛶᛷ;->ᛱᛲᛸᲇ([Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5, v2}, Lxhss/ᲁᛶᛷ;->ᛸᛴᛸᛲ(I)V

    .line 164
    .line 165
    .line 166
    iput-object v5, v4, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 167
    .line 168
    invoke-virtual {v1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 177
    .line 178
    if-eqz v1, :cond_5

    .line 179
    .line 180
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    goto :goto_2

    .line 185
    :cond_5
    move-object v1, v3

    .line 186
    :goto_2
    const-wide/16 v4, 0x1

    .line 187
    .line 188
    if-nez v1, :cond_6

    .line 189
    .line 190
    sget-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 191
    .line 192
    add-long/2addr v1, v4

    .line 193
    sput-wide v1, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 194
    .line 195
    new-instance v1, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-wide v4, -0x8f261b858845L

    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    const/16 v2, 0x27

    .line 210
    .line 211
    invoke-static {v1, v0, v2}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 212
    .line 213
    .line 214
    return-object v3

    .line 215
    :cond_6
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-lez v3, :cond_7

    .line 224
    .line 225
    sget-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 226
    .line 227
    add-long/2addr v6, v4

    .line 228
    sput-wide v6, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 229
    .line 230
    new-instance v3, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    const-wide v4, -0x8f491b858845L

    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    const-wide v4, -0x8f6a1b858845L

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 254
    .line 255
    .line 256
    :cond_7
    return-object v1
.end method

.method public static ᲈᛳᲀ()Lxhss/ᲇᛴᲇᛴ;
    .locals 7

    .line 1
    const-wide v0, -0xaee81b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᲁᲁ;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0xaf0c1b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-static {v1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, v2

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const-string v0, "->"

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v1, v0, v3, v3, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v2, -0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    const-string v5, ":"

    .line 66
    .line 67
    invoke-static {v1, v5, v0, v3, v4}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v2, :cond_2

    .line 72
    .line 73
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    check-cast v0, Lxhss/ᲇᛴᲇᛴ;

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_4
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᲀᲇᛳᲁ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-wide v3, -0x1fa31b858845L

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v3, v4}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    sget-object v4, Lxhss/ᛴᲈᲁᲇ;->ᲁᛴᛴᛸ:Lxhss/ᛴᲈᲁᲇ;

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Lxhss/ᛶᲈᛷᲁ;->ᛵᛷᛲᛸ(Lxhss/ᛷᛴᛲᛲ;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->ᛷᲁᲁ(Lxhss/ᛶᲈᛷᲁ;)Lxhss/ᲈᛴᲀᛲ;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Lxhss/ᛷᲁᛴ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Lxhss/ᛳᛸᛸᛵ;

    .line 134
    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    invoke-virtual {v1}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    move-object v1, v2

    .line 143
    :goto_2
    const-wide/16 v3, 0x1

    .line 144
    .line 145
    if-nez v1, :cond_6

    .line 146
    .line 147
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 148
    .line 149
    add-long/2addr v5, v3

    .line 150
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᛷᛴᛷᛱ:J

    .line 151
    .line 152
    new-instance v1, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-wide v3, -0xaf0d1b858845L

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const/16 v3, 0x27

    .line 167
    .line 168
    invoke-static {v1, v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V

    .line 169
    .line 170
    .line 171
    return-object v2

    .line 172
    :cond_6
    invoke-virtual {v1}, Lxhss/ᲇᛴᲇᛴ;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-lez v5, :cond_7

    .line 181
    .line 182
    sget-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 183
    .line 184
    add-long/2addr v5, v3

    .line 185
    sput-wide v5, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ:J

    .line 186
    .line 187
    new-instance v3, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-wide v4, -0xaf301b858845L

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-wide v4, -0xaf511b858845L

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    invoke-static {v3, v0, v4, v5, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v3, v0, v2}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 211
    .line 212
    .line 213
    :cond_7
    return-object v1
.end method


# virtual methods
.method public abstract ᛱᛳᲁᲈ(Ljava/lang/Class;)Z
.end method

.method public abstract ᛳᲈᲈᛲ(Ljava/lang/Class;)[Ljava/lang/String;
.end method

.method public abstract ᲀᲇᛳᲁ(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
.end method

.method public abstract ᲇᛶᛴᲀ(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;
.end method
