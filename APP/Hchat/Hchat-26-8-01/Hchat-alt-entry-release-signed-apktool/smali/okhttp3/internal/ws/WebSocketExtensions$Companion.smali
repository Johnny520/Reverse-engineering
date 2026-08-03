.class public final Lokhttp3/internal/ws/WebSocketExtensions$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/ws/WebSocketExtensions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lgg/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/internal/ws/WebSocketExtensions$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final parse(Lokhttp3/Headers;)Lokhttp3/internal/ws/WebSocketExtensions;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lokhttp3/Headers;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x0

    .line 17
    :goto_0
    if-ge v4, v1, :cond_14

    .line 18
    .line 19
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const-string v12, "Sec-WebSocket-Extensions"

    .line 24
    .line 25
    invoke-static {v5, v12}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-nez v5, :cond_0

    .line 30
    .line 31
    goto/16 :goto_8

    .line 32
    .line 33
    :cond_0
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v12

    .line 37
    const/4 v14, 0x0

    .line 38
    :goto_1
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-ge v14, v5, :cond_13

    .line 43
    .line 44
    const/16 v16, 0x4

    .line 45
    .line 46
    const/16 v17, 0x0

    .line 47
    .line 48
    const/16 v13, 0x2c

    .line 49
    .line 50
    const/4 v15, 0x0

    .line 51
    invoke-static/range {v12 .. v17}, Lokhttp3/internal/Util;->delimiterOffset$default(Ljava/lang/String;CIIILjava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const/16 v13, 0x3b

    .line 56
    .line 57
    invoke-static {v12, v13, v14, v5}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 58
    .line 59
    .line 60
    move-result v15

    .line 61
    invoke-static {v12, v14, v15}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v14

    .line 65
    const/4 v2, 0x1

    .line 66
    add-int/2addr v15, v2

    .line 67
    const-string v3, "permessage-deflate"

    .line 68
    .line 69
    invoke-static {v14, v3}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_12

    .line 74
    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    move v11, v2

    .line 78
    :cond_1
    move v14, v15

    .line 79
    :goto_2
    if-ge v14, v5, :cond_11

    .line 80
    .line 81
    invoke-static {v12, v13, v14, v5}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    const/16 v6, 0x3d

    .line 86
    .line 87
    invoke-static {v12, v6, v14, v3}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    invoke-static {v12, v14, v6}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v14

    .line 95
    if-ge v6, v3, :cond_2

    .line 96
    .line 97
    add-int/lit8 v6, v6, 0x1

    .line 98
    .line 99
    invoke-static {v12, v6, v3}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v15

    .line 110
    const/4 v13, 0x2

    .line 111
    if-lt v15, v13, :cond_3

    .line 112
    .line 113
    const-string v13, "\""

    .line 114
    .line 115
    invoke-static {v6, v13}, Log/m;->H0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v15

    .line 119
    if-eqz v15, :cond_3

    .line 120
    .line 121
    invoke-static {v6, v13}, Log/m;->m0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    if-eqz v13, :cond_3

    .line 126
    .line 127
    invoke-static {v2, v2, v6}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    goto :goto_3

    .line 132
    :cond_2
    const/4 v6, 0x0

    .line 133
    :cond_3
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 134
    .line 135
    const-string v13, "client_max_window_bits"

    .line 136
    .line 137
    invoke-static {v14, v13}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    const/16 v15, 0xa

    .line 142
    .line 143
    if-eqz v13, :cond_8

    .line 144
    .line 145
    if-eqz v7, :cond_4

    .line 146
    .line 147
    move v11, v2

    .line 148
    :cond_4
    if-eqz v6, :cond_5

    .line 149
    .line 150
    invoke-static {v15, v6}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    move-object v7, v6

    .line 155
    goto :goto_4

    .line 156
    :cond_5
    const/4 v7, 0x0

    .line 157
    :goto_4
    if-nez v7, :cond_7

    .line 158
    .line 159
    :cond_6
    :goto_5
    move v11, v2

    .line 160
    :cond_7
    :goto_6
    move v14, v3

    .line 161
    const/16 v13, 0x3b

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_8
    const-string v13, "client_no_context_takeover"

    .line 165
    .line 166
    invoke-static {v14, v13}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    if-eqz v13, :cond_b

    .line 171
    .line 172
    if-eqz v8, :cond_9

    .line 173
    .line 174
    move v11, v2

    .line 175
    :cond_9
    if-eqz v6, :cond_a

    .line 176
    .line 177
    move v11, v2

    .line 178
    :cond_a
    move v8, v2

    .line 179
    goto :goto_6

    .line 180
    :cond_b
    const-string v13, "server_max_window_bits"

    .line 181
    .line 182
    invoke-static {v14, v13}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v13

    .line 186
    if-eqz v13, :cond_e

    .line 187
    .line 188
    if-eqz v9, :cond_c

    .line 189
    .line 190
    move v11, v2

    .line 191
    :cond_c
    if-eqz v6, :cond_d

    .line 192
    .line 193
    invoke-static {v15, v6}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    move-object v9, v6

    .line 198
    goto :goto_7

    .line 199
    :cond_d
    const/4 v9, 0x0

    .line 200
    :goto_7
    if-nez v9, :cond_7

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_e
    const-string v13, "server_no_context_takeover"

    .line 204
    .line 205
    invoke-static {v14, v13}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    if-eqz v13, :cond_6

    .line 210
    .line 211
    if-eqz v10, :cond_f

    .line 212
    .line 213
    move v11, v2

    .line 214
    :cond_f
    if-eqz v6, :cond_10

    .line 215
    .line 216
    move v11, v2

    .line 217
    :cond_10
    move v10, v2

    .line 218
    goto :goto_6

    .line 219
    :cond_11
    move v6, v2

    .line 220
    goto/16 :goto_1

    .line 221
    .line 222
    :cond_12
    move v11, v2

    .line 223
    move v14, v15

    .line 224
    goto/16 :goto_1

    .line 225
    .line 226
    :cond_13
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :cond_14
    new-instance v5, Lokhttp3/internal/ws/WebSocketExtensions;

    .line 231
    .line 232
    invoke-direct/range {v5 .. v11}, Lokhttp3/internal/ws/WebSocketExtensions;-><init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V

    .line 233
    .line 234
    .line 235
    return-object v5
.end method
