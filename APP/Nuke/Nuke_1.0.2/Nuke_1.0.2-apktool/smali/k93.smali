.class public final Lk93;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lna0;


# instance fields
.field public final h:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lk93;->h:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/String;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    iget-boolean p0, p0, Lk93;->h:Z

    .line 16
    .line 17
    if-nez p0, :cond_9

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_9

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/net/InetAddress;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_8

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_8

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_8

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_8

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/net/InetAddress;->isMulticastAddress()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_8

    .line 74
    .line 75
    instance-of v1, v0, Ljava/net/Inet4Address;

    .line 76
    .line 77
    const/4 v2, 0x2

    .line 78
    const/4 v3, 0x0

    .line 79
    const/4 v4, 0x1

    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    check-cast v0, Ljava/net/Inet4Address;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/net/Inet4Address;->getAddress()[B

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    aget-byte v1, v0, v3

    .line 92
    .line 93
    and-int/lit16 v1, v1, 0xff

    .line 94
    .line 95
    aget-byte v3, v0, v4

    .line 96
    .line 97
    and-int/lit16 v3, v3, 0xff

    .line 98
    .line 99
    aget-byte v0, v0, v2

    .line 100
    .line 101
    and-int/lit16 v0, v0, 0xff

    .line 102
    .line 103
    if-eqz v1, :cond_8

    .line 104
    .line 105
    const/16 v4, 0x64

    .line 106
    .line 107
    if-ne v1, v4, :cond_2

    .line 108
    .line 109
    const/16 v5, 0x40

    .line 110
    .line 111
    if-gt v5, v3, :cond_2

    .line 112
    .line 113
    const/16 v5, 0x80

    .line 114
    .line 115
    if-lt v3, v5, :cond_8

    .line 116
    .line 117
    :cond_2
    const/16 v5, 0xc0

    .line 118
    .line 119
    if-ne v1, v5, :cond_3

    .line 120
    .line 121
    if-nez v3, :cond_3

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    if-eq v0, v2, :cond_8

    .line 126
    .line 127
    :cond_3
    const/16 v2, 0xc6

    .line 128
    .line 129
    if-ne v1, v2, :cond_4

    .line 130
    .line 131
    const/16 v5, 0x12

    .line 132
    .line 133
    if-gt v5, v3, :cond_4

    .line 134
    .line 135
    const/16 v5, 0x14

    .line 136
    .line 137
    if-lt v3, v5, :cond_8

    .line 138
    .line 139
    :cond_4
    if-ne v1, v2, :cond_5

    .line 140
    .line 141
    const/16 v2, 0x33

    .line 142
    .line 143
    if-ne v3, v2, :cond_5

    .line 144
    .line 145
    if-eq v0, v4, :cond_8

    .line 146
    .line 147
    :cond_5
    const/16 v2, 0xcb

    .line 148
    .line 149
    if-ne v1, v2, :cond_6

    .line 150
    .line 151
    if-nez v3, :cond_6

    .line 152
    .line 153
    const/16 v2, 0x71

    .line 154
    .line 155
    if-eq v0, v2, :cond_8

    .line 156
    .line 157
    :cond_6
    const/16 v0, 0xe0

    .line 158
    .line 159
    if-ge v1, v0, :cond_8

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_7
    instance-of v1, v0, Ljava/net/Inet6Address;

    .line 164
    .line 165
    if-eqz v1, :cond_8

    .line 166
    .line 167
    check-cast v0, Ljava/net/Inet6Address;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/net/Inet6Address;->getAddress()[B

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    aget-byte v1, v0, v3

    .line 177
    .line 178
    and-int/lit16 v3, v1, 0xff

    .line 179
    .line 180
    aget-byte v5, v0, v4

    .line 181
    .line 182
    and-int/lit16 v5, v5, 0xff

    .line 183
    .line 184
    and-int/lit16 v1, v1, 0xfe

    .line 185
    .line 186
    const/16 v6, 0xfc

    .line 187
    .line 188
    if-eq v1, v6, :cond_8

    .line 189
    .line 190
    const/16 v1, 0x20

    .line 191
    .line 192
    if-ne v3, v1, :cond_1

    .line 193
    .line 194
    if-ne v5, v4, :cond_1

    .line 195
    .line 196
    aget-byte v1, v0, v2

    .line 197
    .line 198
    and-int/lit16 v1, v1, 0xff

    .line 199
    .line 200
    const/16 v2, 0xd

    .line 201
    .line 202
    if-ne v1, v2, :cond_1

    .line 203
    .line 204
    const/4 v1, 0x3

    .line 205
    aget-byte v0, v0, v1

    .line 206
    .line 207
    and-int/lit16 v0, v0, 0xff

    .line 208
    .line 209
    const/16 v1, 0xb8

    .line 210
    .line 211
    if-eq v0, v1, :cond_8

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_8
    new-instance p0, Lk32;

    .line 216
    .line 217
    const-string p1, "The resolved address is private or reserved."

    .line 218
    .line 219
    invoke-direct {p0, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw p0

    .line 223
    :cond_9
    return-object p1

    .line 224
    :catch_0
    move-exception p0

    .line 225
    new-instance v0, Ljava/net/UnknownHostException;

    .line 226
    .line 227
    const-string v1, "Broken system behaviour for dns lookup of "

    .line 228
    .line 229
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-direct {v0, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 237
    .line 238
    .line 239
    throw v0
.end method
