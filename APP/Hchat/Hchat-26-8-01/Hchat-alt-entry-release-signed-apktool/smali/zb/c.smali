.class public abstract Lzb/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Log/k;

.field public static final b:Log/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Log/k;

    .line 2
    .line 3
    const-string v1, "[0-9a-fA-F]{24,64}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lzb/c;->a:Log/k;

    .line 9
    .line 10
    new-instance v0, Log/k;

    .line 11
    .line 12
    const-string v1, "[0-9]{12,}"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lzb/c;->b:Log/k;

    .line 18
    .line 19
    return-void
.end method

.method public static a(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x41

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x5b

    .line 6
    .line 7
    if-ge p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/16 v0, 0x61

    .line 11
    .line 12
    if-gt v0, p0, :cond_1

    .line 13
    .line 14
    const/16 v0, 0x7b

    .line 15
    .line 16
    if-ge p0, v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/16 v0, 0x30

    .line 20
    .line 21
    if-gt v0, p0, :cond_2

    .line 22
    .line 23
    const/16 v0, 0x3a

    .line 24
    .line 25
    if-ge p0, v0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/16 v0, 0x5f

    .line 29
    .line 30
    if-eq p0, v0, :cond_4

    .line 31
    .line 32
    const/16 v0, 0x2d

    .line 33
    .line 34
    if-eq p0, v0, :cond_4

    .line 35
    .line 36
    const/16 v0, 0x2e

    .line 37
    .line 38
    if-ne p0, v0, :cond_3

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    const/4 p0, 0x0

    .line 42
    return p0

    .line 43
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 44
    return p0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 5

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-nez p0, :cond_1

    .line 14
    .line 15
    const-string p0, ""

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x3

    .line 22
    const/4 v2, 0x0

    .line 23
    if-gt v1, v0, :cond_f

    .line 24
    .line 25
    const/16 v1, 0x51

    .line 26
    .line 27
    if-ge v0, v1, :cond_f

    .line 28
    .line 29
    const-string v0, "@chatroom"

    .line 30
    .line 31
    invoke-static {p0, v0, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_f

    .line 36
    .line 37
    const-string v0, "@im.chatroom"

    .line 38
    .line 39
    invoke-static {p0, v0, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    goto/16 :goto_6

    .line 46
    .line 47
    :cond_2
    const/16 v0, 0x3a

    .line 48
    .line 49
    invoke-static {p0, v0}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_f

    .line 54
    .line 55
    const/16 v0, 0xa

    .line 56
    .line 57
    invoke-static {p0, v0}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_f

    .line 62
    .line 63
    const/16 v0, 0xd

    .line 64
    .line 65
    invoke-static {p0, v0}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_f

    .line 70
    .line 71
    const/16 v0, 0x20

    .line 72
    .line 73
    invoke-static {p0, v0}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    goto/16 :goto_6

    .line 80
    .line 81
    :cond_3
    const-string v0, "http://"

    .line 82
    .line 83
    invoke-static {p0, v0, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_f

    .line 88
    .line 89
    const-string v0, "https://"

    .line 90
    .line 91
    invoke-static {p0, v0, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_f

    .line 96
    .line 97
    const-string v0, "THUMBNAIL_DIRPATH://"

    .line 98
    .line 99
    invoke-static {p0, v0, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    goto/16 :goto_6

    .line 106
    .line 107
    :cond_4
    const-string v0, "@openim"

    .line 108
    .line 109
    invoke-static {p0, v0, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    const/16 v3, 0x40

    .line 114
    .line 115
    const/4 v4, 0x1

    .line 116
    if-eqz v1, :cond_6

    .line 117
    .line 118
    invoke-static {p0, v0}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-lez v0, :cond_f

    .line 127
    .line 128
    invoke-static {p0, v3}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_f

    .line 133
    .line 134
    move v0, v2

    .line 135
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-ge v0, v1, :cond_d

    .line 140
    .line 141
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-static {v1}, Lzb/c;->a(C)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-nez v1, :cond_5

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_6
    invoke-static {p0, v3}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_7

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_7
    sget-object v0, Lzb/c;->a:Log/k;

    .line 163
    .line 164
    invoke-virtual {v0, p0}, Log/k;->d(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_8

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_8
    sget-object v0, Lzb/c;->b:Log/k;

    .line 172
    .line 173
    invoke-virtual {v0, p0}, Log/k;->d(Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_9

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_9
    move v0, v2

    .line 181
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-ge v0, v1, :cond_f

    .line 186
    .line 187
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    const/16 v3, 0x41

    .line 192
    .line 193
    if-gt v3, v1, :cond_a

    .line 194
    .line 195
    const/16 v3, 0x5b

    .line 196
    .line 197
    if-ge v1, v3, :cond_a

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_a
    const/16 v3, 0x61

    .line 201
    .line 202
    if-gt v3, v1, :cond_b

    .line 203
    .line 204
    const/16 v3, 0x7b

    .line 205
    .line 206
    if-ge v1, v3, :cond_b

    .line 207
    .line 208
    :goto_3
    move v1, v4

    .line 209
    goto :goto_4

    .line 210
    :cond_b
    move v1, v2

    .line 211
    :goto_4
    if-eqz v1, :cond_e

    .line 212
    .line 213
    move v0, v2

    .line 214
    :goto_5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-ge v0, v1, :cond_d

    .line 219
    .line 220
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    invoke-static {v1}, Lzb/c;->a(C)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-nez v1, :cond_c

    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_c
    add-int/lit8 v0, v0, 0x1

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_d
    return v4

    .line 235
    :cond_e
    add-int/lit8 v0, v0, 0x1

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_f
    :goto_6
    return v2
.end method
