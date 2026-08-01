.class public final Lxhss/ᲇᲀᛵᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᲇᲀᛵᲀ;

.field public static final ᛳᲁᲇᛸ:Lxhss/ᲇᲀᛵᲀ;


# instance fields
.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲇᲀᛵᲀ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᲇᲀᛵᲀ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxhss/ᲇᲀᛵᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲀᛵᲀ;

    .line 8
    .line 9
    new-instance v0, Lxhss/ᲇᲀᛵᲀ;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lxhss/ᲇᲀᛵᲀ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lxhss/ᲇᲀᛵᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᲀᛵᲀ;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᲇᲀᛵᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Ljava/io/IOException;Lxhss/ᛸᲇᲇᛶ;Lxhss/ᲁᲈᲀᲈ;Lxhss/ᛴᛴᛴᛵ;)Z
    .locals 0

    .line 1
    instance-of p3, p0, Lxhss/ᲇᛷᛴᛴ;

    .line 2
    .line 3
    iget-boolean p2, p2, Lxhss/ᲁᲈᲀᲈ;->ᛸᛶᛴᲈ:Z

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    if-nez p3, :cond_1

    .line 9
    .line 10
    instance-of p2, p0, Ljava/io/FileNotFoundException;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_1
    instance-of p2, p0, Ljava/net/ProtocolException;

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_2
    instance-of p2, p0, Ljava/io/InterruptedIOException;

    .line 21
    .line 22
    if-eqz p2, :cond_3

    .line 23
    .line 24
    instance-of p0, p0, Ljava/net/SocketTimeoutException;

    .line 25
    .line 26
    if-eqz p0, :cond_7

    .line 27
    .line 28
    if-eqz p3, :cond_7

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    instance-of p2, p0, Ljavax/net/ssl/SSLHandshakeException;

    .line 32
    .line 33
    if-eqz p2, :cond_4

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    instance-of p2, p2, Ljava/security/cert/CertificateException;

    .line 40
    .line 41
    if-eqz p2, :cond_4

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_4
    instance-of p0, p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 45
    .line 46
    if-eqz p0, :cond_5

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_5
    :goto_0
    iget-object p0, p1, Lxhss/ᛸᲇᲇᛶ;->ᛴᲈᛱᛴ:Lxhss/ᲇᛸᛵᛴ;

    .line 50
    .line 51
    if-eqz p0, :cond_7

    .line 52
    .line 53
    iget-boolean p0, p0, Lxhss/ᲇᛸᛵᛴ;->ᲇᛴᲇᛵ:Z

    .line 54
    .line 55
    const/4 p2, 0x1

    .line 56
    if-ne p0, p2, :cond_7

    .line 57
    .line 58
    iget-object p0, p1, Lxhss/ᛸᲇᲇᛶ;->ᛸᛲᲀᛵ:Lxhss/ᛵᲇᛷᲀ;

    .line 59
    .line 60
    invoke-interface {p0}, Lxhss/ᛵᲇᛷᲀ;->ᛱᛱᛲᲇ()Lxhss/ᲁᛴᛶᛸ;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object p1, p1, Lxhss/ᛸᲇᲇᛶ;->ᛴᲈᛱᛴ:Lxhss/ᲇᛸᛵᛴ;

    .line 65
    .line 66
    if-eqz p1, :cond_6

    .line 67
    .line 68
    invoke-virtual {p1}, Lxhss/ᲇᛸᛵᛴ;->ᛱᛱᛲᲇ()Lxhss/ᲈᲁᛲᲇ;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_1

    .line 73
    :cond_6
    const/4 p1, 0x0

    .line 74
    :goto_1
    invoke-virtual {p0, p1}, Lxhss/ᲁᛴᛶᛸ;->ᛷᛵᛵᲈ(Lxhss/ᲈᲁᛲᲇ;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_7

    .line 79
    .line 80
    return p2

    .line 81
    :cond_7
    :goto_2
    const/4 p0, 0x0

    .line 82
    return p0
.end method

.method public static ᛳᲁᲇᛸ(Lxhss/ᲀᛶᛷᲁ;I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛶᛷᲁ;->ᲀᲇᛳᲁ:Lxhss/ᲁᛸᛱᛵ;

    .line 2
    .line 3
    const-string v0, "Retry-After"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lxhss/ᲁᛸᛱᛵ;->ᛷᛵᛵᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    :cond_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    return p1

    .line 15
    :cond_1
    const-string p1, "\\d+"

    .line 16
    .line 17
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_2
    const p0, 0x7fffffff

    .line 41
    .line 42
    .line 43
    return p0
.end method

.method public static ᛷᛵᛵᲈ(Lxhss/ᲀᛶᛷᲁ;Lxhss/ᲇᛸᛵᛴ;Lxhss/ᲁᲈᲀᲈ;)Lxhss/ᛴᛴᛴᛵ;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lxhss/ᲇᛸᛵᛴ;->ᛱᛱᛲᲇ()Lxhss/ᲈᲁᛲᲇ;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v1, v1, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    iget v2, p0, Lxhss/ᲀᛶᛷᲁ;->ᛷᛴᛷᛱ:I

    .line 13
    .line 14
    iget-object v3, p0, Lxhss/ᲀᛶᛷᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᛴᛵ;

    .line 15
    .line 16
    iget-object v3, v3, Lxhss/ᛴᛴᛴᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x1

    .line 22
    const/16 v6, 0x134

    .line 23
    .line 24
    const/16 v7, 0x133

    .line 25
    .line 26
    if-eq v2, v7, :cond_c

    .line 27
    .line 28
    if-eq v2, v6, :cond_c

    .line 29
    .line 30
    const/16 v8, 0x191

    .line 31
    .line 32
    if-eq v2, v8, :cond_b

    .line 33
    .line 34
    const/16 v8, 0x1a5

    .line 35
    .line 36
    if-eq v2, v8, :cond_9

    .line 37
    .line 38
    const/16 p1, 0x1f7

    .line 39
    .line 40
    if-eq v2, p1, :cond_7

    .line 41
    .line 42
    const/16 p1, 0x197

    .line 43
    .line 44
    if-eq v2, p1, :cond_5

    .line 45
    .line 46
    const/16 p1, 0x198

    .line 47
    .line 48
    if-eq v2, p1, :cond_1

    .line 49
    .line 50
    packed-switch v2, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    iget-boolean p2, p2, Lxhss/ᲁᲈᲀᲈ;->ᛸᛶᛴᲈ:Z

    .line 56
    .line 57
    if-nez p2, :cond_2

    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :cond_2
    iget-object p2, p0, Lxhss/ᲀᛶᛷᲁ;->ᛷᲁᲁ:Lxhss/ᲀᛶᛷᲁ;

    .line 62
    .line 63
    if-eqz p2, :cond_3

    .line 64
    .line 65
    iget p2, p2, Lxhss/ᲀᛶᛷᲁ;->ᛷᛴᛷᛱ:I

    .line 66
    .line 67
    if-ne p2, p1, :cond_3

    .line 68
    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_3
    invoke-static {p0, v4}, Lxhss/ᲇᲀᛵᲀ;->ᛳᲁᲇᛸ(Lxhss/ᲀᛶᛷᲁ;I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-lez p1, :cond_4

    .line 76
    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_4
    iget-object p0, p0, Lxhss/ᲀᛶᛷᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᛴᛵ;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_5
    iget-object p0, v1, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    sget-object p1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 89
    .line 90
    if-ne p0, p1, :cond_6

    .line 91
    .line 92
    iget-object p0, p2, Lxhss/ᲁᲈᲀᲈ;->ᛳᲈᲈᛲ:Lxhss/ᛳᛴᲀᲁ;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_6
    new-instance p0, Ljava/net/ProtocolException;

    .line 99
    .line 100
    const-string p1, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 101
    .line 102
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p0

    .line 106
    :cond_7
    iget-object p2, p0, Lxhss/ᲀᛶᛷᲁ;->ᛷᲁᲁ:Lxhss/ᲀᛶᛷᲁ;

    .line 107
    .line 108
    if-eqz p2, :cond_8

    .line 109
    .line 110
    iget p2, p2, Lxhss/ᲀᛶᛷᲁ;->ᛷᛴᛷᛱ:I

    .line 111
    .line 112
    if-ne p2, p1, :cond_8

    .line 113
    .line 114
    goto/16 :goto_3

    .line 115
    .line 116
    :cond_8
    const p1, 0x7fffffff

    .line 117
    .line 118
    .line 119
    invoke-static {p0, p1}, Lxhss/ᲇᲀᛵᲀ;->ᛳᲁᲇᛸ(Lxhss/ᲀᛶᛷᲁ;I)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-nez p1, :cond_12

    .line 124
    .line 125
    iget-object p0, p0, Lxhss/ᲀᛶᛷᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᛴᛵ;

    .line 126
    .line 127
    return-object p0

    .line 128
    :cond_9
    if-eqz p1, :cond_12

    .line 129
    .line 130
    iget-object p2, p1, Lxhss/ᲇᛸᛵᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛵᲇᛷᲀ;

    .line 131
    .line 132
    invoke-interface {p2}, Lxhss/ᛵᲇᛷᲀ;->ᛱᛱᛲᲇ()Lxhss/ᲁᛴᛶᛸ;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    iget-object p2, p2, Lxhss/ᲁᛴᛶᛸ;->ᛸᛲᲀᛵ:Lxhss/ᛵᲈᛱᛳ;

    .line 137
    .line 138
    iget-object p2, p2, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 139
    .line 140
    iget-object p2, p2, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v1, p1, Lxhss/ᲇᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛶᛷᛲ;

    .line 143
    .line 144
    invoke-interface {v1}, Lxhss/ᛷᛶᛷᛲ;->ᲇᛴᲇᛵ()Lxhss/ᲀᲀᲁᛱ;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-interface {v1}, Lxhss/ᲀᲀᲁᛱ;->ᛷᛴᛷᛱ()Lxhss/ᛱᛷᲁᛶ;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iget-object v1, v1, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 153
    .line 154
    iget-object v1, v1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 155
    .line 156
    iget-object v1, v1, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {p2, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-eqz p2, :cond_a

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_a
    invoke-virtual {p1}, Lxhss/ᲇᛸᛵᛴ;->ᛱᛱᛲᲇ()Lxhss/ᲈᲁᛲᲇ;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    monitor-enter p1

    .line 170
    :try_start_0
    iput-boolean v5, p1, Lxhss/ᲈᲁᛲᲇ;->ᲈᛳᲀ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    .line 172
    monitor-exit p1

    .line 173
    iget-object p0, p0, Lxhss/ᲀᛶᛷᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᛴᛵ;

    .line 174
    .line 175
    return-object p0

    .line 176
    :catchall_0
    move-exception p0

    .line 177
    monitor-exit p1

    .line 178
    throw p0

    .line 179
    :cond_b
    iget-object p0, p2, Lxhss/ᲁᲈᲀᲈ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛴᲀᲁ;

    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    return-object v0

    .line 185
    :cond_c
    :pswitch_0
    const-string p1, "PROPFIND"

    .line 186
    .line 187
    iget-object v1, p2, Lxhss/ᲁᲈᲀᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 188
    .line 189
    iget-object v1, v1, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 190
    .line 191
    iget-boolean v1, v1, Lxhss/ᛵᛸᛷᛲ;->ᛸᛴᛶᛳ:Z

    .line 192
    .line 193
    if-nez v1, :cond_d

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_d
    const-string v1, "Location"

    .line 197
    .line 198
    iget-object v2, p0, Lxhss/ᲀᛶᛷᲁ;->ᲀᲇᛳᲁ:Lxhss/ᲁᛸᛱᛵ;

    .line 199
    .line 200
    invoke-virtual {v2, v1}, Lxhss/ᲁᛸᛱᛵ;->ᛷᛵᛵᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-nez v1, :cond_e

    .line 205
    .line 206
    move-object v1, v0

    .line 207
    :cond_e
    iget-object v2, p0, Lxhss/ᲀᛶᛷᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᛴᛵ;

    .line 208
    .line 209
    if-nez v1, :cond_f

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_f
    iget-object v8, v2, Lxhss/ᛴᛴᛴᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v8, Lxhss/ᛷᛶᲁᛵ;

    .line 215
    .line 216
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    :try_start_1
    new-instance v9, Lxhss/ᛴᲇᛴᛱ;

    .line 220
    .line 221
    invoke-direct {v9}, Lxhss/ᛴᲇᛴᛱ;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9, v8, v1}, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ(Lxhss/ᛷᛶᲁᛵ;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :catch_0
    move-object v9, v0

    .line 229
    :goto_1
    if-eqz v9, :cond_10

    .line 230
    .line 231
    invoke-virtual {v9}, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ()Lxhss/ᛷᛶᲁᛵ;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    goto :goto_2

    .line 236
    :cond_10
    move-object v1, v0

    .line 237
    :goto_2
    if-nez v1, :cond_11

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_11
    iget-object v8, v1, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 241
    .line 242
    iget-object v9, v2, Lxhss/ᛴᛴᛴᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v9, Lxhss/ᛷᛶᲁᛵ;

    .line 245
    .line 246
    iget-object v9, v9, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 247
    .line 248
    invoke-static {v8, v9}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-nez v8, :cond_13

    .line 253
    .line 254
    iget-object p2, p2, Lxhss/ᲁᲈᲀᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 255
    .line 256
    iget-object p2, p2, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 257
    .line 258
    iget-boolean p2, p2, Lxhss/ᛵᛸᛷᛲ;->ᛸᛲᲀᛵ:Z

    .line 259
    .line 260
    if-nez p2, :cond_13

    .line 261
    .line 262
    :cond_12
    :goto_3
    return-object v0

    .line 263
    :cond_13
    invoke-virtual {v2}, Lxhss/ᛴᛴᛴᛵ;->ᛱᛱᛲᲇ()Lxhss/ᲇᛸᛶ;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    const-string v0, "GET"

    .line 268
    .line 269
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_17

    .line 274
    .line 275
    const-string v0, "HEAD"

    .line 276
    .line 277
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-nez v0, :cond_17

    .line 282
    .line 283
    iget p0, p0, Lxhss/ᲀᛶᛷᲁ;->ᛷᛴᛷᛱ:I

    .line 284
    .line 285
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-nez v0, :cond_14

    .line 290
    .line 291
    if-eq p0, v6, :cond_14

    .line 292
    .line 293
    if-ne p0, v7, :cond_15

    .line 294
    .line 295
    :cond_14
    move v4, v5

    .line 296
    :cond_15
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    if-nez p1, :cond_16

    .line 301
    .line 302
    if-eq p0, v6, :cond_16

    .line 303
    .line 304
    if-eq p0, v7, :cond_16

    .line 305
    .line 306
    const-string p0, "GET"

    .line 307
    .line 308
    invoke-virtual {p2, p0}, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_16
    invoke-virtual {p2, v3}, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    :goto_4
    if-nez v4, :cond_17

    .line 316
    .line 317
    const-string p0, "Transfer-Encoding"

    .line 318
    .line 319
    iget-object p1, p2, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast p1, Lxhss/ᛴᲈᛱᲁ;

    .line 322
    .line 323
    invoke-virtual {p1, p0}, Lxhss/ᛴᲈᛱᲁ;->ᛱᛱᛲᲇ(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    const-string p0, "Content-Length"

    .line 327
    .line 328
    iget-object p1, p2, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast p1, Lxhss/ᛴᲈᛱᲁ;

    .line 331
    .line 332
    invoke-virtual {p1, p0}, Lxhss/ᛴᲈᛱᲁ;->ᛱᛱᛲᲇ(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    const-string p0, "Content-Type"

    .line 336
    .line 337
    iget-object p1, p2, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast p1, Lxhss/ᛴᲈᛱᲁ;

    .line 340
    .line 341
    invoke-virtual {p1, p0}, Lxhss/ᛴᲈᛱᲁ;->ᛱᛱᛲᲇ(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    :cond_17
    iget-object p0, v2, Lxhss/ᛴᛴᛴᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast p0, Lxhss/ᛷᛶᲁᛵ;

    .line 347
    .line 348
    invoke-static {p0, v1}, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ(Lxhss/ᛷᛶᲁᛵ;Lxhss/ᛷᛶᲁᛵ;)Z

    .line 349
    .line 350
    .line 351
    move-result p0

    .line 352
    if-nez p0, :cond_18

    .line 353
    .line 354
    const-string p0, "Authorization"

    .line 355
    .line 356
    iget-object p1, p2, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast p1, Lxhss/ᛴᲈᛱᲁ;

    .line 359
    .line 360
    invoke-virtual {p1, p0}, Lxhss/ᛴᲈᛱᲁ;->ᛱᛱᛲᲇ(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    :cond_18
    iput-object v1, p2, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 364
    .line 365
    new-instance p0, Lxhss/ᛴᛴᛴᛵ;

    .line 366
    .line 367
    invoke-direct {p0, p2}, Lxhss/ᛴᛴᛴᛵ;-><init>(Lxhss/ᲇᛸᛶ;)V

    .line 368
    .line 369
    .line 370
    return-object p0

    .line 371
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
