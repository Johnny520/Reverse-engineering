.class public abstract L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lokio/ByteString;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪兰哲世(Lokio/ByteString;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readShort()S

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readShort()S

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const v2, 0xffff

    .line 28
    .line 29
    .line 30
    and-int v3, p1, v2

    .line 31
    .line 32
    shr-int/lit8 v3, v3, 0xf

    .line 33
    .line 34
    if-eqz v3, :cond_9

    .line 35
    .line 36
    and-int/lit8 p1, p1, 0xf

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    if-eq p1, v3, :cond_8

    .line 40
    .line 41
    const/4 v3, 0x3

    .line 42
    if-eq p1, v3, :cond_7

    .line 43
    .line 44
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readShort()S

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    and-int/2addr p0, v2

    .line 49
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readShort()S

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    and-int/2addr p1, v2

    .line 54
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readShort()S

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readShort()S

    .line 58
    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    move v4, v3

    .line 62
    :goto_0
    const-wide/16 v5, 0x1

    .line 63
    .line 64
    if-ge v4, p0, :cond_2

    .line 65
    .line 66
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readByte()B

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-gez v7, :cond_0

    .line 71
    .line 72
    invoke-virtual {v1, v5, v6}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->skip(J)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_0
    :goto_1
    if-lez v7, :cond_1

    .line 77
    .line 78
    int-to-long v5, v7

    .line 79
    invoke-virtual {v1, v5, v6}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->skip(J)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readByte()B

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    :goto_2
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readShort()S

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readShort()S

    .line 91
    .line 92
    .line 93
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    move p0, v3

    .line 97
    :goto_3
    if-ge p0, p1, :cond_6

    .line 98
    .line 99
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readByte()B

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-gez v4, :cond_3

    .line 104
    .line 105
    invoke-virtual {v1, v5, v6}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->skip(J)V

    .line 106
    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_3
    :goto_4
    if-lez v4, :cond_4

    .line 110
    .line 111
    int-to-long v7, v4

    .line 112
    invoke-virtual {v1, v7, v8}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->skip(J)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readByte()B

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    goto :goto_4

    .line 120
    :cond_4
    :goto_5
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readShort()S

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    and-int/2addr v4, v2

    .line 125
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readShort()S

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readInt()I

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->readShort()S

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    and-int/2addr v7, v2

    .line 136
    const/4 v8, 0x1

    .line 137
    if-eq v4, v8, :cond_5

    .line 138
    .line 139
    const/16 v8, 0x1c

    .line 140
    .line 141
    if-eq v4, v8, :cond_5

    .line 142
    .line 143
    int-to-long v7, v7

    .line 144
    invoke-virtual {v1, v7, v8}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->skip(J)V

    .line 145
    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_5
    new-array v4, v7, [B

    .line 149
    .line 150
    invoke-virtual {v1, v4, v3, v7}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->read([BII)I

    .line 151
    .line 152
    .line 153
    invoke-static {v4}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    :goto_6
    add-int/lit8 p0, p0, 0x1

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    return-object v0

    .line 167
    :cond_7
    new-instance p1, Ljava/net/UnknownHostException;

    .line 168
    .line 169
    const-string v0, ": NXDOMAIN"

    .line 170
    .line 171
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-direct {p1, p0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p1

    .line 179
    :cond_8
    new-instance p1, Ljava/net/UnknownHostException;

    .line 180
    .line 181
    const-string v0, ": SERVFAIL"

    .line 182
    .line 183
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-direct {p1, p0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :cond_9
    const-string p0, "not a response"

    .line 192
    .line 193
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const/4 p0, 0x0

    .line 197
    return-object p0
.end method
