.class public abstract L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

.field public static final 飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

.field public static final 飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

.field public static final 飘花落叶言子楪世苏哲兰:Lokio/ByteString;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    sget-object v0, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"

    .line 7
    .line 8
    invoke-static {v0}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Lokio/ByteString;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Lokio/ByteString;

    .line 13
    .line 14
    const-string v9, "WINDOW_UPDATE"

    .line 15
    .line 16
    const-string v10, "CONTINUATION"

    .line 17
    .line 18
    const-string v1, "DATA"

    .line 19
    .line 20
    const-string v2, "HEADERS"

    .line 21
    .line 22
    const-string v3, "PRIORITY"

    .line 23
    .line 24
    const-string v4, "RST_STREAM"

    .line 25
    .line 26
    const-string v5, "SETTINGS"

    .line 27
    .line 28
    const-string v6, "PUSH_PROMISE"

    .line 29
    .line 30
    const-string v7, "PING"

    .line 31
    .line 32
    const-string v8, "GOAWAY"

    .line 33
    .line 34
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

    .line 39
    .line 40
    const/16 v0, 0x40

    .line 41
    .line 42
    new-array v0, v0, [Ljava/lang/String;

    .line 43
    .line 44
    sput-object v0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 45
    .line 46
    const/16 v0, 0x100

    .line 47
    .line 48
    new-array v1, v0, [Ljava/lang/String;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    move v3, v2

    .line 52
    :goto_0
    const/16 v4, 0x20

    .line 53
    .line 54
    if-ge v3, v0, :cond_0

    .line 55
    .line 56
    invoke-static {v3}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    const-string v6, "%8s"

    .line 68
    .line 69
    invoke-static {v6, v5}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    const/16 v6, 0x30

    .line 74
    .line 75
    invoke-virtual {v5, v4, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    aput-object v4, v1, v3

    .line 83
    .line 84
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    sput-object v1, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

    .line 88
    .line 89
    sget-object v0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 90
    .line 91
    const-string v1, ""

    .line 92
    .line 93
    aput-object v1, v0, v2

    .line 94
    .line 95
    const-string v1, "END_STREAM"

    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    aput-object v1, v0, v3

    .line 99
    .line 100
    filled-new-array {v3}, [I

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const-string v3, "PADDED"

    .line 105
    .line 106
    const/16 v5, 0x8

    .line 107
    .line 108
    aput-object v3, v0, v5

    .line 109
    .line 110
    aget v3, v1, v2

    .line 111
    .line 112
    or-int/lit8 v6, v3, 0x8

    .line 113
    .line 114
    new-instance v7, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    aget-object v3, v0, v3

    .line 120
    .line 121
    const-string v8, "|PADDED"

    .line 122
    .line 123
    invoke-static {v7, v3, v8}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    aput-object v3, v0, v6

    .line 128
    .line 129
    const-string v3, "END_HEADERS"

    .line 130
    .line 131
    const/4 v6, 0x4

    .line 132
    aput-object v3, v0, v6

    .line 133
    .line 134
    const-string v3, "PRIORITY"

    .line 135
    .line 136
    aput-object v3, v0, v4

    .line 137
    .line 138
    const-string v3, "END_HEADERS|PRIORITY"

    .line 139
    .line 140
    const/16 v7, 0x24

    .line 141
    .line 142
    aput-object v3, v0, v7

    .line 143
    .line 144
    filled-new-array {v6, v4, v7}, [I

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    move v3, v2

    .line 149
    :goto_1
    const/4 v4, 0x3

    .line 150
    if-ge v3, v4, :cond_1

    .line 151
    .line 152
    aget v4, v0, v3

    .line 153
    .line 154
    aget v6, v1, v2

    .line 155
    .line 156
    sget-object v7, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 157
    .line 158
    or-int v9, v6, v4

    .line 159
    .line 160
    new-instance v10, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    aget-object v11, v7, v6

    .line 166
    .line 167
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const/16 v11, 0x7c

    .line 171
    .line 172
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    aget-object v12, v7, v4

    .line 176
    .line 177
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    aput-object v10, v7, v9

    .line 185
    .line 186
    or-int/2addr v9, v5

    .line 187
    new-instance v10, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    aget-object v6, v7, v6

    .line 193
    .line 194
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    aget-object v4, v7, v4

    .line 201
    .line 202
    invoke-static {v10, v4, v8}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    aput-object v4, v7, v9

    .line 207
    .line 208
    add-int/lit8 v3, v3, 0x1

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_1
    sget-object v0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 212
    .line 213
    array-length v0, v0

    .line 214
    :goto_2
    if-ge v2, v0, :cond_3

    .line 215
    .line 216
    sget-object v1, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 217
    .line 218
    aget-object v3, v1, v2

    .line 219
    .line 220
    if-nez v3, :cond_2

    .line 221
    .line 222
    sget-object v3, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

    .line 223
    .line 224
    aget-object v3, v3, v2

    .line 225
    .line 226
    aput-object v3, v1, v2

    .line 227
    .line 228
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_3
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(ZIIJ)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const-string p0, "<<"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, ">>"

    .line 13
    .line 14
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    filled-new-array {p0, p1, p2, v0, p3}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string p1, "%s 0x%08x %5d %-13s %d"

    .line 31
    .line 32
    invoke-static {p1, p0}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(ZIIII)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p3}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    const-string p3, ""

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v1, 0x2

    .line 11
    sget-object v2, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

    .line 12
    .line 13
    if-eq p3, v1, :cond_6

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq p3, v1, :cond_6

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq p3, v1, :cond_4

    .line 20
    .line 21
    const/4 v1, 0x6

    .line 22
    if-eq p3, v1, :cond_4

    .line 23
    .line 24
    const/4 v1, 0x7

    .line 25
    if-eq p3, v1, :cond_6

    .line 26
    .line 27
    const/16 v1, 0x8

    .line 28
    .line 29
    if-eq p3, v1, :cond_6

    .line 30
    .line 31
    sget-object v1, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 32
    .line 33
    array-length v3, v1

    .line 34
    if-ge p4, v3, :cond_1

    .line 35
    .line 36
    aget-object v1, v1, p4

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    aget-object v1, v2, p4

    .line 43
    .line 44
    :goto_0
    const/4 v2, 0x5

    .line 45
    if-ne p3, v2, :cond_2

    .line 46
    .line 47
    and-int/lit8 v2, p4, 0x4

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    const-string p3, "HEADERS"

    .line 52
    .line 53
    const-string p4, "PUSH_PROMISE"

    .line 54
    .line 55
    invoke-static {v1, p3, p4}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    if-nez p3, :cond_3

    .line 61
    .line 62
    and-int/lit8 p3, p4, 0x20

    .line 63
    .line 64
    if-eqz p3, :cond_3

    .line 65
    .line 66
    const-string p3, "PRIORITY"

    .line 67
    .line 68
    const-string p4, "COMPRESSED"

    .line 69
    .line 70
    invoke-static {v1, p3, p4}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move-object p3, v1

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    const/4 p3, 0x1

    .line 78
    if-ne p4, p3, :cond_5

    .line 79
    .line 80
    const-string p3, "ACK"

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    aget-object p3, v2, p4

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_6
    aget-object p3, v2, p4

    .line 87
    .line 88
    :goto_1
    if-eqz p0, :cond_7

    .line 89
    .line 90
    const-string p0, "<<"

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_7
    const-string p0, ">>"

    .line 94
    .line 95
    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    filled-new-array {p0, p1, p2, v0, p3}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    const-string p1, "%s 0x%08x %5d %-13s %s"

    .line 108
    .line 109
    invoke-static {p1, p0}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(I)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-ge p0, v1, :cond_0

    .line 5
    .line 6
    aget-object p0, v0, p0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "0x%02x"

    .line 18
    .line 19
    invoke-static {v0, p0}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
