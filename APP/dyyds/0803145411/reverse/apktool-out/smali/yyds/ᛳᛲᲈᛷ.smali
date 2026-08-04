.class public abstract Lyyds/ᛳᛲᲈᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᲇᲁᲀᲁ;

.field public static final ᛵᛸᛸᛷ:[Ljava/lang/String;

.field public static final ᲀᛲᛳᲀ:[Ljava/lang/String;

.field public static final ᲇᲈᛵᛷ:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lyyds/ᲇᲁᲀᲁ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const-string v2, "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lyyds/ᲇᲁᲀᲁ;-><init>([B)V

    .line 12
    .line 13
    .line 14
    iput-object v2, v0, Lyyds/ᲇᲁᲀᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 15
    .line 16
    sput-object v0, Lyyds/ᛳᛲᲈᛷ;->ᛲᲈᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 17
    .line 18
    const-string v11, "WINDOW_UPDATE"

    .line 19
    .line 20
    const-string v12, "CONTINUATION"

    .line 21
    .line 22
    const-string v3, "DATA"

    .line 23
    .line 24
    const-string v4, "HEADERS"

    .line 25
    .line 26
    const-string v5, "PRIORITY"

    .line 27
    .line 28
    const-string v6, "RST_STREAM"

    .line 29
    .line 30
    const-string v7, "SETTINGS"

    .line 31
    .line 32
    const-string v8, "PUSH_PROMISE"

    .line 33
    .line 34
    const-string v9, "PING"

    .line 35
    .line 36
    const-string v10, "GOAWAY"

    .line 37
    .line 38
    filled-new-array/range {v3 .. v12}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lyyds/ᛳᛲᲈᛷ;->ᛵᛸᛸᛷ:[Ljava/lang/String;

    .line 43
    .line 44
    const/16 v0, 0x40

    .line 45
    .line 46
    new-array v0, v0, [Ljava/lang/String;

    .line 47
    .line 48
    sput-object v0, Lyyds/ᛳᛲᲈᛷ;->ᲀᛲᛳᲀ:[Ljava/lang/String;

    .line 49
    .line 50
    const/16 v0, 0x100

    .line 51
    .line 52
    new-array v1, v0, [Ljava/lang/String;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    move v3, v2

    .line 56
    :goto_0
    const/16 v4, 0x20

    .line 57
    .line 58
    if-ge v3, v0, :cond_0

    .line 59
    .line 60
    invoke-static {v3}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    const-string v6, "%8s"

    .line 69
    .line 70
    invoke-static {v6, v5}, Lyyds/ᛴᛲᛲᲇ;->ᲇᲈᛵᛷ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    const/16 v6, 0x30

    .line 75
    .line 76
    invoke-virtual {v5, v4, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    aput-object v4, v1, v3

    .line 81
    .line 82
    add-int/lit8 v3, v3, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    sput-object v1, Lyyds/ᛳᛲᲈᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/String;

    .line 86
    .line 87
    sget-object v0, Lyyds/ᛳᛲᲈᛷ;->ᲀᛲᛳᲀ:[Ljava/lang/String;

    .line 88
    .line 89
    const-string v1, ""

    .line 90
    .line 91
    aput-object v1, v0, v2

    .line 92
    .line 93
    const-string v1, "END_STREAM"

    .line 94
    .line 95
    const/4 v3, 0x1

    .line 96
    aput-object v1, v0, v3

    .line 97
    .line 98
    filled-new-array {v3}, [I

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const-string v3, "PADDED"

    .line 103
    .line 104
    const/16 v5, 0x8

    .line 105
    .line 106
    aput-object v3, v0, v5

    .line 107
    .line 108
    aget v3, v1, v2

    .line 109
    .line 110
    or-int/lit8 v6, v3, 0x8

    .line 111
    .line 112
    new-instance v7, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    aget-object v3, v0, v3

    .line 118
    .line 119
    const-string v8, "|PADDED"

    .line 120
    .line 121
    invoke-static {v7, v3, v8}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    aput-object v3, v0, v6

    .line 126
    .line 127
    const-string v3, "END_HEADERS"

    .line 128
    .line 129
    const/4 v6, 0x4

    .line 130
    aput-object v3, v0, v6

    .line 131
    .line 132
    const-string v3, "PRIORITY"

    .line 133
    .line 134
    aput-object v3, v0, v4

    .line 135
    .line 136
    const-string v3, "END_HEADERS|PRIORITY"

    .line 137
    .line 138
    const/16 v7, 0x24

    .line 139
    .line 140
    aput-object v3, v0, v7

    .line 141
    .line 142
    filled-new-array {v6, v4, v7}, [I

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    move v3, v2

    .line 147
    :goto_1
    const/4 v4, 0x3

    .line 148
    if-ge v3, v4, :cond_1

    .line 149
    .line 150
    aget v4, v0, v3

    .line 151
    .line 152
    aget v6, v1, v2

    .line 153
    .line 154
    sget-object v7, Lyyds/ᛳᛲᲈᛷ;->ᲀᛲᛳᲀ:[Ljava/lang/String;

    .line 155
    .line 156
    or-int v9, v6, v4

    .line 157
    .line 158
    new-instance v10, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    aget-object v11, v7, v6

    .line 164
    .line 165
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const/16 v11, 0x7c

    .line 169
    .line 170
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    aget-object v12, v7, v4

    .line 174
    .line 175
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    aput-object v10, v7, v9

    .line 183
    .line 184
    or-int/2addr v9, v5

    .line 185
    new-instance v10, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    aget-object v6, v7, v6

    .line 191
    .line 192
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    aget-object v4, v7, v4

    .line 199
    .line 200
    invoke-static {v10, v4, v8}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    aput-object v4, v7, v9

    .line 205
    .line 206
    add-int/lit8 v3, v3, 0x1

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_1
    sget-object v0, Lyyds/ᛳᛲᲈᛷ;->ᲀᛲᛳᲀ:[Ljava/lang/String;

    .line 210
    .line 211
    array-length v0, v0

    .line 212
    :goto_2
    if-ge v2, v0, :cond_3

    .line 213
    .line 214
    sget-object v1, Lyyds/ᛳᛲᲈᛷ;->ᲀᛲᛳᲀ:[Ljava/lang/String;

    .line 215
    .line 216
    aget-object v3, v1, v2

    .line 217
    .line 218
    if-nez v3, :cond_2

    .line 219
    .line 220
    sget-object v3, Lyyds/ᛳᛲᲈᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/String;

    .line 221
    .line 222
    aget-object v3, v3, v2

    .line 223
    .line 224
    aput-object v3, v1, v2

    .line 225
    .line 226
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_3
    return-void
.end method

.method public static ᛲᲈᲁ(I)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛳᛲᲈᛷ;->ᛵᛸᛸᛷ:[Ljava/lang/String;

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
    invoke-static {v0, p0}, Lyyds/ᛴᛲᛲᲇ;->ᲇᲈᛵᛷ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static ᛵᛸᛸᛷ(ZIIII)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p3}, Lyyds/ᛳᛲᲈᛷ;->ᛲᲈᲁ(I)Ljava/lang/String;

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
    sget-object v2, Lyyds/ᛳᛲᲈᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/String;

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
    sget-object v1, Lyyds/ᛳᛲᲈᛷ;->ᲀᛲᛳᲀ:[Ljava/lang/String;

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
    goto :goto_0

    .line 39
    :cond_1
    aget-object v1, v2, p4

    .line 40
    .line 41
    :goto_0
    const/4 v2, 0x5

    .line 42
    if-ne p3, v2, :cond_2

    .line 43
    .line 44
    and-int/lit8 v2, p4, 0x4

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    const-string p3, "HEADERS"

    .line 49
    .line 50
    const-string p4, "PUSH_PROMISE"

    .line 51
    .line 52
    invoke-static {v1, p3, p4}, Lyyds/ᛳᲀᲈᛷ;->ᛶᛸᲀᲁ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    if-nez p3, :cond_3

    .line 58
    .line 59
    and-int/lit8 p3, p4, 0x20

    .line 60
    .line 61
    if-eqz p3, :cond_3

    .line 62
    .line 63
    const-string p3, "PRIORITY"

    .line 64
    .line 65
    const-string p4, "COMPRESSED"

    .line 66
    .line 67
    invoke-static {v1, p3, p4}, Lyyds/ᛳᲀᲈᛷ;->ᛶᛸᲀᲁ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move-object p3, v1

    .line 73
    goto :goto_1

    .line 74
    :cond_4
    const/4 p3, 0x1

    .line 75
    if-ne p4, p3, :cond_5

    .line 76
    .line 77
    const-string p3, "ACK"

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    aget-object p3, v2, p4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_6
    aget-object p3, v2, p4

    .line 84
    .line 85
    :goto_1
    if-eqz p0, :cond_7

    .line 86
    .line 87
    const-string p0, "<<"

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_7
    const-string p0, ">>"

    .line 91
    .line 92
    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    filled-new-array {p0, p1, p2, v0, p3}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    const-string p1, "%s 0x%08x %5d %-13s %s"

    .line 105
    .line 106
    invoke-static {p1, p0}, Lyyds/ᛴᛲᛲᲇ;->ᲇᲈᛵᛷ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
.end method

.method public static ᲀᛲᛳᲀ(ZIIJ)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛳᛲᲈᛷ;->ᛲᲈᲁ(I)Ljava/lang/String;

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
    invoke-static {p1, p0}, Lyyds/ᛴᛲᛲᲇ;->ᲇᲈᛵᛷ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
