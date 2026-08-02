.class public abstract Lte;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lsz0;

.field public static b:Lca2; = null

.field public static final c:Ljava/lang/Object;

.field public static final d:[Ljava/lang/StackTraceElement;

.field public static final e:Lyi0;

.field public static final f:Lyi0;

.field public static final g:Lyi0;

.field public static final h:Luc3;

.field public static final i:F = 24.0f


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lsz0;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lsz0;-><init>(IZ)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lte;->a:Lsz0;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lte;->c:Ljava/lang/Object;

    .line 17
    .line 18
    new-array v0, v2, [Ljava/lang/StackTraceElement;

    .line 19
    .line 20
    sput-object v0, Lte;->d:[Ljava/lang/StackTraceElement;

    .line 21
    .line 22
    new-instance v0, Lyi0;

    .line 23
    .line 24
    sget-object v1, Lt80;->i:Lt80;

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lyi0;-><init>(Lt80;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lte;->e:Lyi0;

    .line 30
    .line 31
    new-instance v0, Lyi0;

    .line 32
    .line 33
    sget-object v1, Lt80;->h:Lt80;

    .line 34
    .line 35
    invoke-direct {v0, v1}, Lyi0;-><init>(Lt80;)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lte;->f:Lyi0;

    .line 39
    .line 40
    new-instance v0, Lyi0;

    .line 41
    .line 42
    sget-object v1, Lt80;->j:Lt80;

    .line 43
    .line 44
    invoke-direct {v0, v1}, Lyi0;-><init>(Lt80;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lte;->g:Lyi0;

    .line 48
    .line 49
    new-instance v0, Luc3;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lte;->h:Luc3;

    .line 55
    .line 56
    return-void
.end method

.method public static A(J)Ljava/lang/String;
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-gez v2, :cond_0

    .line 6
    .line 7
    move-wide v3, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide v3, p0

    .line 10
    :goto_0
    long-to-double v3, v3

    .line 11
    const-wide/high16 v5, 0x4130000000000000L    # 1048576.0

    .line 12
    .line 13
    cmpl-double v7, v3, v5

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    if-ltz v7, :cond_1

    .line 17
    .line 18
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 19
    .line 20
    div-double/2addr v3, v5

    .line 21
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "%.1f MB"

    .line 34
    .line 35
    invoke-static {p0, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_1
    const-wide/high16 v5, 0x4090000000000000L    # 1024.0

    .line 41
    .line 42
    cmpl-double v7, v3, v5

    .line 43
    .line 44
    if-ltz v7, :cond_2

    .line 45
    .line 46
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 47
    .line 48
    div-double/2addr v3, v5

    .line 49
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "%.1f KB"

    .line 62
    .line 63
    invoke-static {p0, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_2
    if-gez v2, :cond_3

    .line 69
    .line 70
    move-wide p0, v0

    .line 71
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p0, " B"

    .line 80
    .line 81
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public static B(Ljavax/net/ssl/SSLSession;)Lyr0;
    .locals 6

    .line 1
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const-string v2, "TLS_NULL_WITH_NULL_NULL"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_2

    .line 15
    .line 16
    const-string v2, "SSL_NULL_WITH_NULL_NULL"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    sget-object v2, Lps;->b:Lz8;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Lz8;->j(Ljava/lang/String;)Lps;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    const-string v3, "NONE"

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    sget-object v1, Ls23;->i:Lix2;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lix2;->e(Ljava/lang/String;)Ls23;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :try_start_0
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v2}, Lwg3;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v2
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_0

    .line 62
    :catch_0
    sget-object v2, Lbe0;->h:Lbe0;

    .line 63
    .line 64
    :goto_0
    new-instance v3, Lyr0;

    .line 65
    .line 66
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Lwg3;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    new-instance v4, Lta;

    .line 75
    .line 76
    const/16 v5, 0x8

    .line 77
    .line 78
    invoke-direct {v4, v5, v2}, Lta;-><init>(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v3, v1, v0, p0, v4}, Lyr0;-><init>(Ls23;Lps;Ljava/util/List;Lxm0;)V

    .line 82
    .line 83
    .line 84
    return-object v3

    .line 85
    :cond_0
    const-string p0, "tlsVersion == NONE"

    .line 86
    .line 87
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_1
    const-string p0, "tlsVersion == null"

    .line 92
    .line 93
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_2
    const-string p0, "cipherSuite == "

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_3
    const-string p0, "cipherSuite == null"

    .line 108
    .line 109
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-object v1
.end method

.method public static C(Ljava/lang/String;)Lvf1;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf1;->d:Lo72;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, p0, v1}, Lo72;->a(Ljava/lang/String;I)Lkj1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/16 v2, 0x22

    .line 12
    .line 13
    if-eqz v0, :cond_7

    .line 14
    .line 15
    invoke-virtual {v0}, Lkj1;->x()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lbf1;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-virtual {v3, v4}, Lbf1;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/lang/String;

    .line 27
    .line 28
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lkj1;->x()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Lbf1;

    .line 42
    .line 43
    const/4 v7, 0x2

    .line 44
    invoke-virtual {v6, v7}, Lbf1;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v6, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v6, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lkj1;->z()Lc11;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget v0, v0, La11;->i:I

    .line 67
    .line 68
    :goto_0
    add-int/2addr v0, v4

    .line 69
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-ge v0, v8, :cond_6

    .line 74
    .line 75
    sget-object v8, Lvf1;->e:Lo72;

    .line 76
    .line 77
    invoke-virtual {v8, p0, v0}, Lo72;->a(Ljava/lang/String;I)Lkj1;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    if-eqz v8, :cond_5

    .line 82
    .line 83
    iget-object v0, v8, Lkj1;->k:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lcf1;

    .line 86
    .line 87
    invoke-virtual {v0, v4}, Lcf1;->b(I)Laf1;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    const/4 v10, 0x0

    .line 92
    if-eqz v9, :cond_0

    .line 93
    .line 94
    iget-object v9, v9, Laf1;->a:Ljava/lang/String;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_0
    move-object v9, v10

    .line 98
    :goto_1
    if-nez v9, :cond_1

    .line 99
    .line 100
    invoke-virtual {v8}, Lkj1;->z()Lc11;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget v0, v0, La11;->i:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    invoke-virtual {v0, v7}, Lcf1;->b(I)Laf1;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    if-eqz v11, :cond_2

    .line 112
    .line 113
    iget-object v10, v11, Laf1;->a:Ljava/lang/String;

    .line 114
    .line 115
    :cond_2
    if-nez v10, :cond_3

    .line 116
    .line 117
    const/4 v10, 0x3

    .line 118
    invoke-virtual {v0, v10}, Lcf1;->b(I)Laf1;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v10, v0, Laf1;->a:Ljava/lang/String;

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    const/16 v0, 0x27

    .line 129
    .line 130
    invoke-static {v10, v0}, Lpv2;->E0(Ljava/lang/String;C)Z

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    if-eqz v11, :cond_4

    .line 135
    .line 136
    invoke-static {v10, v0}, Lpv2;->m0(Ljava/lang/String;C)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-le v0, v7, :cond_4

    .line 147
    .line 148
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    sub-int/2addr v0, v4

    .line 153
    invoke-virtual {v10, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    :cond_4
    :goto_2
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    invoke-virtual {v8}, Lkj1;->z()Lc11;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iget v0, v0, La11;->i:I

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_5
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v1, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v3, "Parameter is not formatted correctly: \""

    .line 177
    .line 178
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v0, "\" for: \""

    .line 185
    .line 186
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 200
    .line 201
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v0

    .line 209
    :cond_6
    new-instance v0, Lvf1;

    .line 210
    .line 211
    new-array v1, v1, [Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    check-cast v1, [Ljava/lang/String;

    .line 218
    .line 219
    invoke-direct {v0, p0, v3, v5, v1}, Lvf1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return-object v0

    .line 223
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 224
    .line 225
    new-instance v1, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    const-string v3, "No subtype found for: \""

    .line 228
    .line 229
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw v0
.end method

.method public static final E(Landroid/view/View;)Llx;
    .locals 2

    .line 1
    const v0, 0x7908002a

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p0, v1

    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Llx;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    return-object v1
.end method

.method public static final F(La20;)F
    .locals 1

    .line 1
    sget-object v0, Lsn;->M:Lsn;

    .line 2
    .line 3
    invoke-interface {p0, v0}, La20;->o(Lz10;)Ly10;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lfi1;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lfi1;->v()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    :goto_0
    const/4 v0, 0x0

    .line 19
    cmpl-float v0, p0, v0

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    return p0

    .line 24
    :cond_1
    const-string v0, "negative scale factor"

    .line 25
    .line 26
    invoke-static {v0}, Ll22;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return p0
.end method

.method public static G(II)I
    .locals 1

    .line 1
    const/high16 v0, 0x10000000

    .line 2
    .line 3
    if-ge p1, v0, :cond_2

    .line 4
    .line 5
    sget v0, Lbi0;->z:I

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    :goto_0
    if-ge p0, p1, :cond_1

    .line 11
    .line 12
    shl-int/lit8 p0, p0, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return p0

    .line 16
    :cond_2
    const-string p0, "data size out of limit"

    .line 17
    .line 18
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static H(Lbi0;Lwz;)Ljava/util/LinkedHashSet;
    .locals 6

    .line 1
    iget-object v0, p0, Lbi0;->b:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "FastKV"

    .line 4
    .line 5
    const-string v2, "No encoder for tag:"

    .line 6
    .line 7
    iget-object p1, p1, Lyz;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    :try_start_0
    new-instance v3, Ljava/io/File;

    .line 12
    .line 13
    new-instance v4, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v5, p0, Lbi0;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-direct {v3, v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, Lhg3;->e(Ljava/io/File;)[B

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    aget-byte v3, p1, v3

    .line 41
    .line 42
    and-int/lit16 v3, v3, 0xff

    .line 43
    .line 44
    iget-object v4, p0, Lbi0;->h:Le9;

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    invoke-virtual {v4, p1, v5, v3}, Le9;->d([BII)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-object p0, p0, Lbi0;->c:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {p0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Lov2;

    .line 58
    .line 59
    if-eqz p0, :cond_0

    .line 60
    .line 61
    add-int/2addr v3, v5

    .line 62
    array-length p0, p1

    .line 63
    sub-int/2addr p0, v3

    .line 64
    invoke-static {p1, v3, p0}, Lov2;->a([BII)Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :catch_0
    move-exception p0

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    new-instance p0, Ljava/lang/Exception;

    .line 72
    .line 73
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    new-instance p0, Ljava/lang/Exception;

    .line 85
    .line 86
    const-string p1, "Read object data failed"

    .line 87
    .line 88
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :goto_0
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 96
    .line 97
    .line 98
    :goto_1
    const/4 p0, 0x0

    .line 99
    return-object p0
.end method

.method public static final I(Ln4;)J
    .locals 6

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/DragEvent;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/DragEvent;->getX()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroid/view/DragEvent;->getY()F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-long v0, v0

    .line 18
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    int-to-long v2, p0

    .line 23
    const/16 p0, 0x20

    .line 24
    .line 25
    shl-long/2addr v0, p0

    .line 26
    const-wide v4, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v2, v4

    .line 32
    or-long/2addr v0, v2

    .line 33
    return-wide v0
.end method

.method public static final J(Ljava/lang/Object;)Llm2;
    .locals 1

    .line 1
    sget-object v0, Lxe1;->e:Lhh1;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Llm2;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "Does not contain segment"

    .line 9
    .line 10
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static K(Lbi0;Lxz;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lbi0;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, Lyz;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 9
    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lbi0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v2, p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lhg3;->e(Ljava/io/File;)[B

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    new-instance p1, Ljava/lang/String;

    .line 37
    .line 38
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 39
    .line 40
    invoke-direct {p1, p0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :catch_0
    move-exception p0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-object v1

    .line 47
    :goto_0
    const-string p1, "FastKV"

    .line 48
    .line 49
    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public static final L(Luh1;Lin0;)Luh1;
    .locals 1

    .line 1
    new-instance v0, Ldl;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ldl;-><init>(Lin0;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final M(Luh1;FFFFJLeq2;ZJJ)Luh1;
    .locals 13

    .line 1
    new-instance v0, Lqq0;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move/from16 v3, p3

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    move-wide/from16 v5, p5

    .line 10
    .line 11
    move-object/from16 v7, p7

    .line 12
    .line 13
    move/from16 v8, p8

    .line 14
    .line 15
    move-wide/from16 v9, p9

    .line 16
    .line 17
    move-wide/from16 v11, p11

    .line 18
    .line 19
    invoke-direct/range {v0 .. v12}, Lqq0;-><init>(FFFFJLeq2;ZJJ)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static N(Luh1;FFFLeq2;I)Luh1;
    .locals 16

    .line 1
    move/from16 v0, p5

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move v4, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move/from16 v4, p1

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v1, v0, 0x2

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    move v5, v2

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move/from16 v5, p2

    .line 20
    .line 21
    :goto_1
    and-int/lit8 v1, v0, 0x4

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    move v6, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move/from16 v6, p3

    .line 28
    .line 29
    :goto_2
    sget-wide v8, Lm33;->b:J

    .line 30
    .line 31
    and-int/lit16 v1, v0, 0x800

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    sget-object v1, Lsp0;->h:Liu0;

    .line 36
    .line 37
    move-object v10, v1

    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move-object/from16 v10, p4

    .line 40
    .line 41
    :goto_3
    and-int/lit16 v0, v0, 0x1000

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    :goto_4
    move v11, v0

    .line 47
    goto :goto_5

    .line 48
    :cond_4
    const/4 v0, 0x1

    .line 49
    goto :goto_4

    .line 50
    :goto_5
    sget-wide v12, Ltq0;->a:J

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    move-wide v14, v12

    .line 54
    move-object/from16 v3, p0

    .line 55
    .line 56
    invoke-static/range {v3 .. v15}, Lte;->M(Luh1;FFFFJLeq2;ZJJ)Luh1;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0
.end method

.method public static final O(Luh1;F)Luh1;
    .locals 6

    .line 1
    new-instance v0, Lkr2;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v5, 0x5

    .line 5
    const/4 v1, 0x0

    .line 6
    move v4, p1

    .line 7
    move v2, p1

    .line 8
    invoke-direct/range {v0 .. v5}, Lkr2;-><init>(FFFFI)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static P(Luh1;FFI)Luh1;
    .locals 8

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v4, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v4, p1

    .line 10
    :goto_0
    and-int/lit8 p1, p3, 0x2

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    move v6, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move v6, p2

    .line 17
    :goto_1
    new-instance v2, Lkr2;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v7, 0x5

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct/range {v2 .. v7}, Lkr2;-><init>(FFFFI)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v2}, Luh1;->c(Luh1;)Luh1;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static final Q(Lj20;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lj20;->g()La20;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lsn;->K:Lsn;

    .line 6
    .line 7
    invoke-interface {p0, v0}, La20;->o(Lz10;)Ly10;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lk21;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Lk21;->b()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static final R(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    sget-object v0, Lxe1;->e:Lhh1;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static S(Lvu0;)Z
    .locals 7

    .line 1
    :try_start_0
    invoke-static {p0}, Lpp0;->u(Lvu0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance v0, Lx92;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object p0, v0

    .line 13
    :goto_0
    invoke-static {p0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "[NukeCore]"

    .line 18
    .line 19
    sget-object v2, La83;->a:La83;

    .line 20
    .line 21
    const/4 v3, 0x6

    .line 22
    const-string v4, "NukeCore"

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    check-cast p0, Ljava/lang/String;

    .line 27
    .line 28
    :try_start_1
    sget-object v0, Lpp1;->a:Lpp1;

    .line 29
    .line 30
    invoke-static {}, Lpp1;->b()Lop1;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v5, "Dex_Cache_Sum_Sign"

    .line 35
    .line 36
    const-string v6, ""

    .line 37
    .line 38
    invoke-virtual {v0, v5}, Lop1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    move-object v6, v0

    .line 46
    goto :goto_1

    .line 47
    :catchall_1
    move-exception v0

    .line 48
    new-instance v6, Lx92;

    .line 49
    .line 50
    invoke-direct {v6, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-static {v6}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    check-cast v6, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v6, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    return p0

    .line 66
    :cond_1
    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-string v0, "Read DexCacheSumSign failed: "

    .line 71
    .line 72
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catchall_2
    move-exception v0

    .line 97
    new-instance v2, Lx92;

    .line 98
    .line 99
    invoke-direct {v2, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    :goto_2
    instance-of v0, v2, Lx92;

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    invoke-static {v3, v4, p0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_2
    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    const-string v0, "Generate DexCacheSumSign failed: "

    .line 115
    .line 116
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :catchall_3
    move-exception v0

    .line 141
    new-instance v2, Lx92;

    .line 142
    .line 143
    invoke-direct {v2, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    :goto_3
    instance-of v0, v2, Lx92;

    .line 147
    .line 148
    if-eqz v0, :cond_3

    .line 149
    .line 150
    invoke-static {v3, v4, p0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    :cond_3
    :goto_4
    const/4 p0, 0x0

    .line 154
    return p0
.end method

.method public static final T(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Lqp0;->z(Landroid/view/KeyEvent;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget p0, Lb51;->O:I

    .line 6
    .line 7
    sget-wide v2, Lb51;->h:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lb51;->a(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    sget-wide v2, Lb51;->r:J

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, Lb51;->a(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    sget-wide v2, Lb51;->E:J

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3}, Lb51;->a(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    sget-wide v2, Lb51;->q:J

    .line 32
    .line 33
    invoke-static {v0, v1, v2, v3}, Lb51;->a(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public static U(Lbi0;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "rw"

    .line 4
    .line 5
    const-string v2, "FastKV"

    .line 6
    .line 7
    new-instance v3, Ljava/io/File;

    .line 8
    .line 9
    iget-object v4, v1, Lbi0;->a:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v5, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v6, v1, Lbi0;->b:Ljava/lang/String;

    .line 17
    .line 18
    const-string v7, ".kva"

    .line 19
    .line 20
    invoke-static {v5, v6, v7}, Lhk1;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v5, Ljava/io/File;

    .line 28
    .line 29
    const-string v7, ".kvb"

    .line 30
    .line 31
    invoke-static {v6, v7}, Lhk1;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-direct {v5, v4, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :try_start_0
    invoke-static {v3}, Lhg3;->h(Ljava/io/File;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    invoke-static {v5}, Lhg3;->h(Ljava/io/File;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_0

    .line 49
    .line 50
    goto/16 :goto_2

    .line 51
    .line 52
    :cond_0
    new-instance v4, Ljava/io/RandomAccessFile;

    .line 53
    .line 54
    invoke-direct {v4, v3, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v7, Ljava/io/RandomAccessFile;

    .line 58
    .line 59
    invoke-direct {v7, v5, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->length()J

    .line 63
    .line 64
    .line 65
    move-result-wide v8

    .line 66
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->length()J

    .line 67
    .line 68
    .line 69
    move-result-wide v10

    .line 70
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, v1, Lbi0;->q:Ljava/nio/channels/FileChannel;

    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, v1, Lbi0;->r:Ljava/nio/channels/FileChannel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    :try_start_1
    iget-object v12, v1, Lbi0;->q:Ljava/nio/channels/FileChannel;

    .line 83
    .line 84
    sget-object v13, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 85
    .line 86
    const-wide/16 v18, 0x0

    .line 87
    .line 88
    cmp-long v0, v8, v18

    .line 89
    .line 90
    if-lez v0, :cond_1

    .line 91
    .line 92
    move-wide/from16 v16, v8

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    sget v4, Lbi0;->z:I

    .line 96
    .line 97
    int-to-long v14, v4

    .line 98
    move-wide/from16 v16, v14

    .line 99
    .line 100
    :goto_0
    const-wide/16 v14, 0x0

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v17}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    iput-object v4, v1, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 107
    .line 108
    sget-object v7, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 109
    .line 110
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    .line 113
    move-object v14, v13

    .line 114
    iget-object v13, v1, Lbi0;->r:Ljava/nio/channels/FileChannel;

    .line 115
    .line 116
    cmp-long v4, v10, v18

    .line 117
    .line 118
    if-lez v4, :cond_2

    .line 119
    .line 120
    move-wide/from16 v17, v10

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    sget v12, Lbi0;->z:I

    .line 124
    .line 125
    move-object v15, v13

    .line 126
    int-to-long v12, v12

    .line 127
    move-wide/from16 v17, v12

    .line 128
    .line 129
    move-object v13, v15

    .line 130
    :goto_1
    const-wide/16 v15, 0x0

    .line 131
    .line 132
    invoke-virtual/range {v13 .. v18}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    iput-object v12, v1, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 137
    .line 138
    invoke-virtual {v12, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 139
    .line 140
    .line 141
    :try_start_2
    new-instance v3, Le9;

    .line 142
    .line 143
    iget-object v5, v1, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    const/4 v7, 0x3

    .line 150
    invoke-direct {v3, v5, v7}, Le9;-><init>(II)V

    .line 151
    .line 152
    .line 153
    iput-object v3, v1, Lbi0;->h:Le9;

    .line 154
    .line 155
    if-nez v0, :cond_3

    .line 156
    .line 157
    if-nez v4, :cond_3

    .line 158
    .line 159
    const/16 v0, 0xc

    .line 160
    .line 161
    iput v0, v1, Lbi0;->d:I

    .line 162
    .line 163
    return-void

    .line 164
    :catch_0
    move-exception v0

    .line 165
    goto :goto_3

    .line 166
    :cond_3
    invoke-static {v1, v8, v9, v10, v11}, Lte;->Z(Lbi0;JJ)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :catch_1
    move-exception v0

    .line 171
    invoke-static {v2, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 172
    .line 173
    .line 174
    invoke-static {v1}, Lte;->k0(Lbi0;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v1, v3, v5}, Lte;->m0(Lbi0;Ljava/io/File;Ljava/io/File;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_4
    :goto_2
    new-instance v0, Ljava/lang/Exception;

    .line 182
    .line 183
    const-string v3, "open file failed"

    .line 184
    .line 185
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v2, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 189
    .line 190
    .line 191
    invoke-static {v1}, Lte;->k0(Lbi0;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :goto_3
    invoke-static {v2, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 196
    .line 197
    .line 198
    invoke-static {v1}, Lte;->d0(Lbi0;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v1}, Lte;->k0(Lbi0;)V

    .line 202
    .line 203
    .line 204
    return-void
.end method

.method public static V(Lbi0;)Z
    .locals 7

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lbi0;->a:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Lbi0;->b:Ljava/lang/String;

    .line 11
    .line 12
    const-string v4, ".kvc"

    .line 13
    .line 14
    invoke-static {v2, v3, v4}, Lhk1;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/io/File;

    .line 22
    .line 23
    const-string v4, ".tmp"

    .line 24
    .line 25
    invoke-static {v3, v4}, Lhk1;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-direct {v2, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    move-object v0, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v0, 0x0

    .line 49
    :goto_0
    if-eqz v0, :cond_4

    .line 50
    .line 51
    invoke-static {p0, v0}, Lte;->W(Lbi0;Ljava/io/File;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iget v0, p0, Lbi0;->v:I

    .line 58
    .line 59
    if-nez v0, :cond_5

    .line 60
    .line 61
    iget-object v0, p0, Lbi0;->h:Le9;

    .line 62
    .line 63
    invoke-static {p0, v0}, Lte;->s0(Lbi0;Le9;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v1, 0x1

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    const-string v0, "recover from c file"

    .line 71
    .line 72
    invoke-static {p0, v0}, Ls11;->M(Lbi0;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 73
    .line 74
    .line 75
    :try_start_1
    invoke-static {p0}, Lte;->v(Lbi0;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    .line 77
    .line 78
    return v1

    .line 79
    :catch_0
    move-exception p0

    .line 80
    move v4, v1

    .line 81
    goto :goto_1

    .line 82
    :catch_1
    move-exception p0

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    :try_start_2
    iput v1, p0, Lbi0;->v:I

    .line 85
    .line 86
    return v4

    .line 87
    :cond_3
    invoke-static {p0}, Lte;->d0(Lbi0;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, Lte;->v(Lbi0;)V

    .line 91
    .line 92
    .line 93
    return v4

    .line 94
    :cond_4
    iget v0, p0, Lbi0;->v:I

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    new-instance v0, Ljava/io/File;

    .line 99
    .line 100
    new-instance v2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v5, ".kva"

    .line 109
    .line 110
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v2, Ljava/io/File;

    .line 121
    .line 122
    new-instance v5, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v6, ".kvb"

    .line 131
    .line 132
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-direct {v2, v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_5

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_5

    .line 153
    .line 154
    invoke-static {p0, v0, v2}, Lte;->m0(Lbi0;Ljava/io/File;Ljava/io/File;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 155
    .line 156
    .line 157
    :cond_5
    return v4

    .line 158
    :goto_1
    const-string v0, "FastKV"

    .line 159
    .line 160
    invoke-static {v0, v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 161
    .line 162
    .line 163
    return v4
.end method

.method public static W(Lbi0;Ljava/io/File;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_4

    .line 11
    .line 12
    const-wide/32 v4, 0x10000000

    .line 13
    .line 14
    .line 15
    cmp-long v2, v0, v4

    .line 16
    .line 17
    if-ltz v2, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    long-to-int v0, v0

    .line 21
    sget v1, Lbi0;->z:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lte;->G(II)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v2, p0, Lbi0;->h:Le9;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    iget-object v4, v2, Le9;->k:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, [B

    .line 34
    .line 35
    array-length v4, v4

    .line 36
    if-ne v4, v1, :cond_1

    .line 37
    .line 38
    iput v3, v2, Le9;->i:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance v2, Le9;

    .line 42
    .line 43
    new-array v1, v1, [B

    .line 44
    .line 45
    invoke-direct {v2, v3, v1}, Le9;-><init>(I[B)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lbi0;->h:Le9;

    .line 49
    .line 50
    :goto_0
    iget-object v1, v2, Le9;->k:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, [B

    .line 53
    .line 54
    invoke-static {p1, v1, v0}, Lhg3;->i(Ljava/io/File;[BI)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Le9;->h()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-gez p1, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    const v1, -0x40000001    # -1.9999999f

    .line 65
    .line 66
    .line 67
    and-int/2addr v1, p1

    .line 68
    const/high16 v4, 0x40000000    # 2.0f

    .line 69
    .line 70
    and-int/2addr p1, v4

    .line 71
    const/4 v4, 0x1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    move p1, v4

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move p1, v3

    .line 77
    :goto_1
    iget v5, v2, Le9;->i:I

    .line 78
    .line 79
    invoke-virtual {v2, v5}, Le9;->i(I)J

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    iget v7, v2, Le9;->i:I

    .line 84
    .line 85
    add-int/lit8 v7, v7, 0x8

    .line 86
    .line 87
    iput v7, v2, Le9;->i:I

    .line 88
    .line 89
    add-int/lit8 v7, v1, 0xc

    .line 90
    .line 91
    iput v7, p0, Lbi0;->d:I

    .line 92
    .line 93
    if-ltz v1, :cond_4

    .line 94
    .line 95
    const/16 v7, 0xc

    .line 96
    .line 97
    sub-int/2addr v0, v7

    .line 98
    if-gt v1, v0, :cond_4

    .line 99
    .line 100
    invoke-virtual {v2, v7, v1}, Le9;->f(II)J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    cmp-long v0, v5, v0

    .line 105
    .line 106
    if-nez v0, :cond_4

    .line 107
    .line 108
    invoke-static {p0, p1}, Lpp0;->C(Lbi0;Z)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_4

    .line 113
    .line 114
    iput-wide v5, p0, Lbi0;->e:J

    .line 115
    .line 116
    return v4

    .line 117
    :cond_4
    :goto_2
    return v3
.end method

.method public static X(Llb2;IIIIILpf1;Ljava/util/List;[Lsz1;I)Lof1;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    move/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    move/from16 v5, p9

    .line 12
    .line 13
    int-to-long v6, v3

    .line 14
    new-array v8, v5, [I

    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x0

    .line 20
    const/4 v14, 0x0

    .line 21
    const/4 v15, 0x0

    .line 22
    const/16 v16, 0x0

    .line 23
    .line 24
    :goto_0
    if-ge v11, v5, :cond_5

    .line 25
    .line 26
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v17

    .line 30
    move-object/from16 v9, v17

    .line 31
    .line 32
    check-cast v9, Lif1;

    .line 33
    .line 34
    invoke-static {v9}, Lse;->G(Lif1;)Lmb2;

    .line 35
    .line 36
    .line 37
    move-result-object v17

    .line 38
    invoke-static/range {v17 .. v17}, Lse;->K(Lmb2;)F

    .line 39
    .line 40
    .line 41
    move-result v17

    .line 42
    cmpl-float v18, v17, v16

    .line 43
    .line 44
    if-lez v18, :cond_0

    .line 45
    .line 46
    add-float v15, v15, v17

    .line 47
    .line 48
    add-int/lit8 v12, v12, 0x1

    .line 49
    .line 50
    move-wide/from16 v18, v6

    .line 51
    .line 52
    move/from16 v20, v11

    .line 53
    .line 54
    goto :goto_5

    .line 55
    :cond_0
    sub-int v14, v1, v13

    .line 56
    .line 57
    aget-object v17, p8, v11

    .line 58
    .line 59
    move-wide/from16 v18, v6

    .line 60
    .line 61
    if-nez v17, :cond_3

    .line 62
    .line 63
    const v6, 0x7fffffff

    .line 64
    .line 65
    .line 66
    if-ne v1, v6, :cond_1

    .line 67
    .line 68
    move/from16 v20, v11

    .line 69
    .line 70
    move/from16 v21, v12

    .line 71
    .line 72
    const v6, 0x7fffffff

    .line 73
    .line 74
    .line 75
    :goto_1
    const/4 v7, 0x0

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    move/from16 v20, v11

    .line 78
    .line 79
    move/from16 v21, v12

    .line 80
    .line 81
    if-gez v14, :cond_2

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move v6, v14

    .line 86
    goto :goto_1

    .line 87
    :goto_2
    invoke-interface {v0, v7, v6, v2, v7}, Llb2;->e(IIIZ)J

    .line 88
    .line 89
    .line 90
    move-result-wide v11

    .line 91
    invoke-interface {v9, v11, v12}, Lif1;->e(J)Lsz1;

    .line 92
    .line 93
    .line 94
    move-result-object v17

    .line 95
    :goto_3
    move-object/from16 v6, v17

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_3
    move/from16 v20, v11

    .line 99
    .line 100
    move/from16 v21, v12

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :goto_4
    invoke-interface {v0, v6}, Llb2;->i(Lsz1;)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    invoke-interface {v0, v6}, Llb2;->f(Lsz1;)I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    aput v7, v8, v20

    .line 112
    .line 113
    sub-int v11, v14, v7

    .line 114
    .line 115
    if-gez v11, :cond_4

    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    :cond_4
    invoke-static {v3, v11}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    add-int/2addr v7, v14

    .line 123
    add-int/2addr v13, v7

    .line 124
    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    aput-object v6, p8, v20

    .line 129
    .line 130
    move/from16 v12, v21

    .line 131
    .line 132
    :goto_5
    add-int/lit8 v11, v20, 0x1

    .line 133
    .line 134
    move-wide/from16 v6, v18

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_5
    move-wide/from16 v18, v6

    .line 138
    .line 139
    move/from16 v21, v12

    .line 140
    .line 141
    if-nez v21, :cond_6

    .line 142
    .line 143
    sub-int/2addr v13, v14

    .line 144
    const/4 v7, 0x0

    .line 145
    goto/16 :goto_f

    .line 146
    .line 147
    :cond_6
    const v6, 0x7fffffff

    .line 148
    .line 149
    .line 150
    if-eq v1, v6, :cond_7

    .line 151
    .line 152
    move v3, v1

    .line 153
    goto :goto_6

    .line 154
    :cond_7
    move/from16 v3, p1

    .line 155
    .line 156
    :goto_6
    const/4 v6, 0x1

    .line 157
    add-int/lit8 v12, v21, -0x1

    .line 158
    .line 159
    int-to-long v11, v12

    .line 160
    mul-long v11, v11, v18

    .line 161
    .line 162
    sub-int/2addr v3, v13

    .line 163
    int-to-long v6, v3

    .line 164
    sub-long/2addr v6, v11

    .line 165
    const-wide/16 v18, 0x0

    .line 166
    .line 167
    cmp-long v3, v6, v18

    .line 168
    .line 169
    if-gez v3, :cond_8

    .line 170
    .line 171
    move-wide/from16 v6, v18

    .line 172
    .line 173
    :cond_8
    long-to-float v3, v6

    .line 174
    div-float/2addr v3, v15

    .line 175
    const/4 v9, 0x0

    .line 176
    :goto_7
    if-ge v9, v5, :cond_9

    .line 177
    .line 178
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    check-cast v14, Lif1;

    .line 183
    .line 184
    invoke-static {v14}, Lse;->G(Lif1;)Lmb2;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    invoke-static {v14}, Lse;->K(Lmb2;)F

    .line 189
    .line 190
    .line 191
    move-result v14

    .line 192
    mul-float/2addr v14, v3

    .line 193
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 194
    .line 195
    .line 196
    move-result v14

    .line 197
    int-to-long v14, v14

    .line 198
    sub-long/2addr v6, v14

    .line 199
    add-int/lit8 v9, v9, 0x1

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_9
    move v14, v10

    .line 203
    const/4 v9, 0x0

    .line 204
    const/4 v10, 0x0

    .line 205
    :goto_8
    if-ge v9, v5, :cond_f

    .line 206
    .line 207
    aget-object v15, p8, v9

    .line 208
    .line 209
    if-nez v15, :cond_e

    .line 210
    .line 211
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v15

    .line 215
    check-cast v15, Lif1;

    .line 216
    .line 217
    invoke-static {v15}, Lse;->G(Lif1;)Lmb2;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-static {v1}, Lse;->K(Lmb2;)F

    .line 222
    .line 223
    .line 224
    move-result v17

    .line 225
    cmpl-float v18, v17, v16

    .line 226
    .line 227
    if-lez v18, :cond_a

    .line 228
    .line 229
    :goto_9
    move/from16 v18, v3

    .line 230
    .line 231
    goto :goto_a

    .line 232
    :cond_a
    const-string v18, "All weights <= 0 should have placeables"

    .line 233
    .line 234
    invoke-static/range {v18 .. v18}, Liz0;->b(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    goto :goto_9

    .line 238
    :goto_a
    invoke-static {v6, v7}, Ljava/lang/Long;->signum(J)I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    move-wide/from16 v19, v6

    .line 243
    .line 244
    int-to-long v6, v3

    .line 245
    sub-long v6, v19, v6

    .line 246
    .line 247
    mul-float v17, v17, v18

    .line 248
    .line 249
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    .line 250
    .line 251
    .line 252
    move-result v17

    .line 253
    add-int v3, v17, v3

    .line 254
    .line 255
    const/4 v4, 0x0

    .line 256
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v1, :cond_b

    .line 261
    .line 262
    iget-boolean v1, v1, Lmb2;->b:Z

    .line 263
    .line 264
    goto :goto_b

    .line 265
    :cond_b
    const/4 v1, 0x1

    .line 266
    :goto_b
    if-eqz v1, :cond_c

    .line 267
    .line 268
    const v1, 0x7fffffff

    .line 269
    .line 270
    .line 271
    if-eq v3, v1, :cond_d

    .line 272
    .line 273
    move v4, v3

    .line 274
    :goto_c
    const/4 v1, 0x1

    .line 275
    goto :goto_d

    .line 276
    :cond_c
    const v1, 0x7fffffff

    .line 277
    .line 278
    .line 279
    :cond_d
    const/4 v4, 0x0

    .line 280
    goto :goto_c

    .line 281
    :goto_d
    invoke-interface {v0, v4, v3, v2, v1}, Llb2;->e(IIIZ)J

    .line 282
    .line 283
    .line 284
    move-result-wide v3

    .line 285
    invoke-interface {v15, v3, v4}, Lif1;->e(J)Lsz1;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-interface {v0, v3}, Llb2;->i(Lsz1;)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-interface {v0, v3}, Llb2;->f(Lsz1;)I

    .line 294
    .line 295
    .line 296
    move-result v15

    .line 297
    aput v4, v8, v9

    .line 298
    .line 299
    add-int/2addr v10, v4

    .line 300
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    aput-object v3, p8, v9

    .line 305
    .line 306
    move v14, v4

    .line 307
    goto :goto_e

    .line 308
    :cond_e
    move/from16 v18, v3

    .line 309
    .line 310
    move-wide/from16 v19, v6

    .line 311
    .line 312
    const/4 v1, 0x1

    .line 313
    :goto_e
    add-int/lit8 v9, v9, 0x1

    .line 314
    .line 315
    move/from16 v1, p3

    .line 316
    .line 317
    move-object/from16 v4, p7

    .line 318
    .line 319
    move/from16 v3, v18

    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_f
    int-to-long v1, v10

    .line 323
    add-long/2addr v1, v11

    .line 324
    long-to-int v7, v1

    .line 325
    sub-int v1, p3, v13

    .line 326
    .line 327
    if-gez v7, :cond_10

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    :cond_10
    if-le v7, v1, :cond_11

    .line 331
    .line 332
    move v7, v1

    .line 333
    :cond_11
    move v10, v14

    .line 334
    :goto_f
    add-int/2addr v7, v13

    .line 335
    if-gez v7, :cond_12

    .line 336
    .line 337
    const/4 v7, 0x0

    .line 338
    :cond_12
    move/from16 v1, p1

    .line 339
    .line 340
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    move/from16 v1, p2

    .line 345
    .line 346
    const/4 v7, 0x0

    .line 347
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    new-array v3, v5, [I

    .line 356
    .line 357
    move-object/from16 v2, p6

    .line 358
    .line 359
    invoke-interface {v0, v4, v2, v8, v3}, Llb2;->c(ILpf1;[I[I)V

    .line 360
    .line 361
    .line 362
    move v5, v1

    .line 363
    move-object/from16 v1, p8

    .line 364
    .line 365
    invoke-interface/range {v0 .. v5}, Llb2;->a([Lsz1;Lpf1;[III)Lof1;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    return-object v0
.end method

.method public static Y(Ll41;)Lk31;
    .locals 5

    .line 1
    const-string v0, "Failed parsing JSON source: "

    .line 2
    .line 3
    iget v1, p0, Ll41;->v:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    iput v2, p0, Ll41;->v:I

    .line 10
    .line 11
    :cond_0
    :try_start_0
    invoke-static {p0}, Lgf1;->I(Ll41;)Lk31;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    invoke-virtual {p0, v1}, Ll41;->L(I)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_1

    .line 21
    :catch_0
    move-exception v2

    .line 22
    goto :goto_0

    .line 23
    :catch_1
    move-exception v2

    .line 24
    :goto_0
    :try_start_1
    new-instance v3, Lpv;

    .line 25
    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, " to Json"

    .line 35
    .line 36
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {v3, v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :goto_1
    invoke-virtual {p0, v1}, Ll41;->L(I)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public static Z(Lbi0;JJ)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 4
    .line 5
    iget-object v2, v0, Lbi0;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const v3, -0x40000001    # -1.9999999f

    .line 12
    .line 13
    .line 14
    and-int v4, v1, v3

    .line 15
    .line 16
    const/high16 v5, 0x40000000    # 2.0f

    .line 17
    .line 18
    and-int/2addr v1, v5

    .line 19
    const/4 v6, 0x1

    .line 20
    const/4 v7, 0x0

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move v1, v6

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v7

    .line 26
    :goto_0
    iget-object v8, v0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 27
    .line 28
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->getLong()J

    .line 29
    .line 30
    .line 31
    move-result-wide v8

    .line 32
    iget-object v10, v0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 33
    .line 34
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->getInt()I

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    and-int/2addr v3, v10

    .line 39
    and-int/2addr v5, v10

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v6, v7

    .line 44
    :goto_1
    iget-object v5, v0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->getLong()J

    .line 47
    .line 48
    .line 49
    move-result-wide v10

    .line 50
    const-string v5, "FastKV"

    .line 51
    .line 52
    const/16 v14, 0xc

    .line 53
    .line 54
    if-ltz v4, :cond_6

    .line 55
    .line 56
    const-wide/16 v15, 0xc

    .line 57
    .line 58
    int-to-long v12, v4

    .line 59
    sub-long v17, p1, v15

    .line 60
    .line 61
    cmp-long v12, v12, v17

    .line 62
    .line 63
    if-gtz v12, :cond_5

    .line 64
    .line 65
    add-int/lit8 v12, v4, 0xc

    .line 66
    .line 67
    iput v12, v0, Lbi0;->d:I

    .line 68
    .line 69
    iget-object v12, v0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 70
    .line 71
    invoke-virtual {v12}, Ljava/nio/MappedByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 72
    .line 73
    .line 74
    iget-object v12, v0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 75
    .line 76
    iget-object v13, v0, Lbi0;->h:Le9;

    .line 77
    .line 78
    iget-object v13, v13, Le9;->k:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v13, [B

    .line 81
    .line 82
    move-wide/from16 v17, v15

    .line 83
    .line 84
    iget v15, v0, Lbi0;->d:I

    .line 85
    .line 86
    invoke-virtual {v12, v13, v7, v15}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    iget-object v12, v0, Lbi0;->h:Le9;

    .line 90
    .line 91
    invoke-virtual {v12, v14, v4}, Le9;->f(II)J

    .line 92
    .line 93
    .line 94
    move-result-wide v12

    .line 95
    cmp-long v4, v8, v12

    .line 96
    .line 97
    if-nez v4, :cond_7

    .line 98
    .line 99
    invoke-static {v0, v1}, Lpp0;->C(Lbi0;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_7

    .line 104
    .line 105
    iput-wide v8, v0, Lbi0;->e:J

    .line 106
    .line 107
    cmp-long v1, p1, p3

    .line 108
    .line 109
    if-nez v1, :cond_4

    .line 110
    .line 111
    iget v1, v0, Lbi0;->d:I

    .line 112
    .line 113
    new-array v1, v1, [B

    .line 114
    .line 115
    iget-object v3, v0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/nio/MappedByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 118
    .line 119
    .line 120
    iget-object v3, v0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 121
    .line 122
    iget v4, v0, Lbi0;->d:I

    .line 123
    .line 124
    invoke-virtual {v3, v1, v7, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 125
    .line 126
    .line 127
    iget-object v3, v0, Lbi0;->h:Le9;

    .line 128
    .line 129
    iget-object v3, v3, Le9;->k:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v3, [B

    .line 132
    .line 133
    :goto_2
    iget v4, v0, Lbi0;->d:I

    .line 134
    .line 135
    if-ge v7, v4, :cond_3

    .line 136
    .line 137
    aget-byte v4, v3, v7

    .line 138
    .line 139
    aget-byte v6, v1, v7

    .line 140
    .line 141
    if-eq v4, v6, :cond_2

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    return-void

    .line 148
    :cond_4
    :goto_3
    new-instance v1, Ljava/lang/Exception;

    .line 149
    .line 150
    const-string v3, "B file error"

    .line 151
    .line 152
    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v5, v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 156
    .line 157
    .line 158
    iget-object v1, v0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 159
    .line 160
    iget-object v2, v0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 161
    .line 162
    iget v3, v0, Lbi0;->d:I

    .line 163
    .line 164
    invoke-static {v0, v1, v2, v3}, Lte;->t(Lbi0;Ljava/nio/MappedByteBuffer;Ljava/nio/MappedByteBuffer;I)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_5
    move-wide/from16 v17, v15

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_6
    const-wide/16 v17, 0xc

    .line 172
    .line 173
    :cond_7
    :goto_4
    if-ltz v3, :cond_9

    .line 174
    .line 175
    int-to-long v8, v3

    .line 176
    sub-long v12, p3, v17

    .line 177
    .line 178
    cmp-long v1, v8, v12

    .line 179
    .line 180
    if-gtz v1, :cond_9

    .line 181
    .line 182
    iget-object v1, v0, Lbi0;->f:Ljava/util/HashMap;

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 185
    .line 186
    .line 187
    iput v7, v0, Lbi0;->m:I

    .line 188
    .line 189
    iget-object v1, v0, Lbi0;->n:Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 192
    .line 193
    .line 194
    add-int/lit8 v1, v3, 0xc

    .line 195
    .line 196
    iput v1, v0, Lbi0;->d:I

    .line 197
    .line 198
    iget-object v1, v0, Lbi0;->h:Le9;

    .line 199
    .line 200
    iget-object v1, v1, Le9;->k:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v1, [B

    .line 203
    .line 204
    array-length v1, v1

    .line 205
    iget-object v4, v0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 206
    .line 207
    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-eq v1, v4, :cond_8

    .line 212
    .line 213
    new-instance v1, Le9;

    .line 214
    .line 215
    iget-object v4, v0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 216
    .line 217
    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    const/4 v8, 0x3

    .line 222
    invoke-direct {v1, v4, v8}, Le9;-><init>(II)V

    .line 223
    .line 224
    .line 225
    iput-object v1, v0, Lbi0;->h:Le9;

    .line 226
    .line 227
    :cond_8
    iget-object v1, v0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/nio/MappedByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 230
    .line 231
    .line 232
    iget-object v1, v0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 233
    .line 234
    iget-object v4, v0, Lbi0;->h:Le9;

    .line 235
    .line 236
    iget-object v4, v4, Le9;->k:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v4, [B

    .line 239
    .line 240
    iget v8, v0, Lbi0;->d:I

    .line 241
    .line 242
    invoke-virtual {v1, v4, v7, v8}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 243
    .line 244
    .line 245
    iget-object v1, v0, Lbi0;->h:Le9;

    .line 246
    .line 247
    invoke-virtual {v1, v14, v3}, Le9;->f(II)J

    .line 248
    .line 249
    .line 250
    move-result-wide v3

    .line 251
    cmp-long v1, v10, v3

    .line 252
    .line 253
    if-nez v1, :cond_9

    .line 254
    .line 255
    invoke-static {v0, v6}, Lpp0;->C(Lbi0;Z)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_9

    .line 260
    .line 261
    new-instance v1, Ljava/lang/Exception;

    .line 262
    .line 263
    const-string v3, "A file error"

    .line 264
    .line 265
    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v5, v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 269
    .line 270
    .line 271
    iget-object v1, v0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 272
    .line 273
    iget-object v2, v0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 274
    .line 275
    iget v3, v0, Lbi0;->d:I

    .line 276
    .line 277
    invoke-static {v0, v1, v2, v3}, Lte;->t(Lbi0;Ljava/nio/MappedByteBuffer;Ljava/nio/MappedByteBuffer;I)V

    .line 278
    .line 279
    .line 280
    iput-wide v10, v0, Lbi0;->e:J

    .line 281
    .line 282
    return-void

    .line 283
    :cond_9
    const-string v1, "both files error"

    .line 284
    .line 285
    invoke-static {v0, v1}, Ls11;->I(Lbi0;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v0}, Lte;->q(Lbi0;)V

    .line 289
    .line 290
    .line 291
    return-void
.end method

.method public static final a(Ljava/lang/String;Luh1;Lpx;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    check-cast v6, Lgo0;

    .line 8
    .line 9
    const v3, 0x7390ec39

    .line 10
    .line 11
    .line 12
    invoke-virtual {v6, v3}, Lgo0;->X(I)Lgo0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x2

    .line 24
    :goto_0
    or-int v3, p3, v3

    .line 25
    .line 26
    and-int/lit8 v7, v3, 0x13

    .line 27
    .line 28
    const/16 v8, 0x12

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    if-eq v7, v8, :cond_1

    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v7, v9

    .line 36
    :goto_1
    and-int/lit8 v8, v3, 0x1

    .line 37
    .line 38
    invoke-virtual {v6, v8, v7}, Lgo0;->O(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_8

    .line 43
    .line 44
    sget-object v7, Lr7;->b:Ltu2;

    .line 45
    .line 46
    invoke-virtual {v6, v7}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    check-cast v7, Landroid/content/Context;

    .line 51
    .line 52
    sget-object v8, Lsn;->n:Lrk;

    .line 53
    .line 54
    invoke-static {v8, v9}, Ldm;->d(Lr5;Z)Lnf1;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    iget-wide v12, v6, Lgo0;->T:J

    .line 59
    .line 60
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    invoke-virtual {v6}, Lgo0;->l()Lyy1;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    invoke-static {v6, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 69
    .line 70
    .line 71
    move-result-object v14

    .line 72
    sget-object v15, Lhx;->c:Lgx;

    .line 73
    .line 74
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    sget-object v15, Lgx;->b:Ljy;

    .line 78
    .line 79
    invoke-virtual {v6}, Lgo0;->Z()V

    .line 80
    .line 81
    .line 82
    iget-boolean v10, v6, Lgo0;->S:Z

    .line 83
    .line 84
    if-eqz v10, :cond_2

    .line 85
    .line 86
    invoke-virtual {v6, v15}, Lgo0;->k(Lxm0;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    invoke-virtual {v6}, Lgo0;->i0()V

    .line 91
    .line 92
    .line 93
    :goto_2
    sget-object v10, Lgx;->e:Llc;

    .line 94
    .line 95
    invoke-static {v6, v10, v11}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v11, Lgx;->d:Llc;

    .line 99
    .line 100
    invoke-static {v6, v11, v13}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    sget-object v13, Lgx;->f:Llc;

    .line 108
    .line 109
    invoke-static {v6, v13, v12}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object v12, Lgx;->g:Lv6;

    .line 113
    .line 114
    invoke-static {v6, v12}, Lyf3;->b(Lpx;Lin0;)V

    .line 115
    .line 116
    .line 117
    sget-object v5, Lgx;->c:Llc;

    .line 118
    .line 119
    invoke-static {v6, v5, v14}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    const/high16 v14, 0x42bc0000    # 94.0f

    .line 123
    .line 124
    sget-object v4, Lrh1;->a:Lrh1;

    .line 125
    .line 126
    invoke-static {v4, v14}, Lte;->g0(Luh1;F)Luh1;

    .line 127
    .line 128
    .line 129
    move-result-object v14

    .line 130
    sget-object v9, Lgb2;->a:Lfb2;

    .line 131
    .line 132
    invoke-static {v14, v9}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 133
    .line 134
    .line 135
    move-result-object v14

    .line 136
    move/from16 v16, v3

    .line 137
    .line 138
    sget-object v3, Lur1;->a:Ltu2;

    .line 139
    .line 140
    invoke-virtual {v6, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v17

    .line 144
    move-object/from16 v1, v17

    .line 145
    .line 146
    check-cast v1, Llp1;

    .line 147
    .line 148
    iget-wide v1, v1, Llp1;->g:J

    .line 149
    .line 150
    const v0, 0x3e051eb8    # 0.13f

    .line 151
    .line 152
    .line 153
    invoke-static {v0, v1, v2}, Lju;->b(FJ)J

    .line 154
    .line 155
    .line 156
    move-result-wide v0

    .line 157
    sget-object v2, Lsp0;->h:Liu0;

    .line 158
    .line 159
    invoke-static {v14, v0, v1, v2}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v6, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, Llp1;

    .line 168
    .line 169
    iget-wide v1, v1, Llp1;->g:J

    .line 170
    .line 171
    const v3, 0x3e8f5c29    # 0.28f

    .line 172
    .line 173
    .line 174
    invoke-static {v3, v1, v2}, Lju;->b(FJ)J

    .line 175
    .line 176
    .line 177
    move-result-wide v1

    .line 178
    new-instance v3, Lft2;

    .line 179
    .line 180
    invoke-direct {v3, v1, v2}, Lft2;-><init>(J)V

    .line 181
    .line 182
    .line 183
    new-instance v1, Lrl;

    .line 184
    .line 185
    const/high16 v2, 0x3f800000    # 1.0f

    .line 186
    .line 187
    invoke-direct {v1, v2, v3, v9}, Lrl;-><init>(FLft2;Leq2;)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v0, v1}, Luh1;->c(Luh1;)Luh1;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const/4 v1, 0x0

    .line 195
    invoke-static {v8, v1}, Ldm;->d(Lr5;Z)Lnf1;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    move-object v1, v7

    .line 200
    iget-wide v7, v6, Lgo0;->T:J

    .line 201
    .line 202
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    invoke-virtual {v6}, Lgo0;->l()Lyy1;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-static {v6, v0}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v6}, Lgo0;->Z()V

    .line 215
    .line 216
    .line 217
    iget-boolean v8, v6, Lgo0;->S:Z

    .line 218
    .line 219
    if-eqz v8, :cond_3

    .line 220
    .line 221
    invoke-virtual {v6, v15}, Lgo0;->k(Lxm0;)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_3
    invoke-virtual {v6}, Lgo0;->i0()V

    .line 226
    .line 227
    .line 228
    :goto_3
    invoke-static {v6, v10, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v6, v11, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    invoke-static {v3, v6, v13, v6, v12}, Lvi0;->q(ILgo0;Llc;Lgo0;Lv6;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v6, v5, v0}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x42b00000    # 88.0f

    .line 241
    .line 242
    invoke-static {v4, v0}, Lte;->g0(Luh1;F)Luh1;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v0, v9}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-virtual {v6}, Lgo0;->L()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    sget-object v2, Lnx;->a:Leb;

    .line 255
    .line 256
    if-ne v0, v2, :cond_4

    .line 257
    .line 258
    new-instance v0, Lw;

    .line 259
    .line 260
    const/4 v3, 0x2

    .line 261
    invoke-direct {v0, v3}, Lw;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v6, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    :cond_4
    move-object v3, v0

    .line 268
    check-cast v3, Lin0;

    .line 269
    .line 270
    invoke-virtual {v6, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    and-int/lit8 v5, v16, 0xe

    .line 275
    .line 276
    const/4 v7, 0x4

    .line 277
    if-ne v5, v7, :cond_5

    .line 278
    .line 279
    const/4 v5, 0x1

    .line 280
    goto :goto_4

    .line 281
    :cond_5
    const/4 v5, 0x0

    .line 282
    :goto_4
    or-int/2addr v0, v5

    .line 283
    invoke-virtual {v6}, Lgo0;->L()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    if-nez v0, :cond_7

    .line 288
    .line 289
    if-ne v5, v2, :cond_6

    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_6
    const/4 v2, 0x1

    .line 293
    move-object/from16 v0, p0

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_7
    :goto_5
    new-instance v5, Lu1;

    .line 297
    .line 298
    const/4 v2, 0x1

    .line 299
    move-object/from16 v0, p0

    .line 300
    .line 301
    invoke-direct {v5, v1, v0, v2}, Lu1;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v6, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :goto_6
    check-cast v5, Lin0;

    .line 308
    .line 309
    const/4 v7, 0x6

    .line 310
    const/4 v8, 0x0

    .line 311
    invoke-static/range {v3 .. v8}, Lpp0;->b(Lin0;Luh1;Lin0;Lpx;II)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v6, v2}, Lgo0;->p(Z)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v6, v2}, Lgo0;->p(Z)V

    .line 318
    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_8
    invoke-virtual {v6}, Lgo0;->R()V

    .line 322
    .line 323
    .line 324
    :goto_7
    invoke-virtual {v6}, Lgo0;->r()Lb62;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    if-eqz v1, :cond_9

    .line 329
    .line 330
    new-instance v2, Lz1;

    .line 331
    .line 332
    move-object/from16 v3, p1

    .line 333
    .line 334
    move/from16 v4, p3

    .line 335
    .line 336
    const/4 v5, 0x0

    .line 337
    invoke-direct {v2, v0, v3, v4, v5}, Lz1;-><init>(Ljava/lang/String;Luh1;II)V

    .line 338
    .line 339
    .line 340
    iput-object v2, v1, Lb62;->d:Lmn0;

    .line 341
    .line 342
    :cond_9
    return-void
.end method

.method public static a0(Ljava/nio/channels/FileChannel;I)Ljava/nio/MappedByteBuffer;
    .locals 6

    .line 1
    :try_start_0
    sget-object v1, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    int-to-long v4, p1

    .line 6
    move-object v0, p0

    .line 7
    invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :catch_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static final b(Lin0;Lpx;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v6, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object/from16 v7, p1

    .line 9
    .line 10
    check-cast v7, Lgo0;

    .line 11
    .line 12
    const v0, -0x552c4061

    .line 13
    .line 14
    .line 15
    invoke-virtual {v7, v0}, Lgo0;->X(I)Lgo0;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v7, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x2

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v2

    .line 28
    :goto_0
    or-int/2addr v0, v6

    .line 29
    and-int/lit8 v3, v0, 0x3

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    if-eq v3, v2, :cond_1

    .line 33
    .line 34
    move v2, v4

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 v2, 0x0

    .line 37
    :goto_1
    and-int/2addr v0, v4

    .line 38
    invoke-virtual {v7, v0, v2}, Lgo0;->O(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_8

    .line 43
    .line 44
    const/high16 v0, 0x790b0000

    .line 45
    .line 46
    invoke-static {v0, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/high16 v0, 0x79030000

    .line 51
    .line 52
    invoke-static {v0, v7}, Lrg3;->O(ILpx;)[Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    const v0, 0x79030003

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v7}, Lrg3;->O(ILpx;)[Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const v4, 0x79030002

    .line 68
    .line 69
    .line 70
    invoke-static {v4, v7}, Lrg3;->O(ILpx;)[Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const v5, 0x79030001

    .line 75
    .line 76
    .line 77
    invoke-static {v5, v7}, Lrg3;->O(ILpx;)[Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v7, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    invoke-virtual {v7, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    or-int/2addr v9, v10

    .line 90
    invoke-virtual {v7, v5}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    or-int/2addr v9, v10

    .line 95
    invoke-virtual {v7}, Lgo0;->L()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    if-nez v9, :cond_2

    .line 100
    .line 101
    sget-object v9, Lnx;->a:Leb;

    .line 102
    .line 103
    if-ne v10, v9, :cond_7

    .line 104
    .line 105
    :cond_2
    new-instance v10, Ljava/util/ArrayList;

    .line 106
    .line 107
    array-length v9, v0

    .line 108
    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    array-length v9, v0

    .line 112
    const/4 v11, 0x0

    .line 113
    const/4 v12, 0x0

    .line 114
    :goto_2
    if-ge v11, v9, :cond_6

    .line 115
    .line 116
    aget-object v13, v0, v11

    .line 117
    .line 118
    add-int/lit8 v14, v12, 0x1

    .line 119
    .line 120
    new-instance v15, Lp1;

    .line 121
    .line 122
    invoke-static {v12, v5}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v16

    .line 126
    check-cast v16, Ljava/lang/String;

    .line 127
    .line 128
    const-string v17, ""

    .line 129
    .line 130
    if-nez v16, :cond_3

    .line 131
    .line 132
    move-object/from16 v8, v17

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_3
    move-object/from16 v8, v16

    .line 136
    .line 137
    :goto_3
    invoke-static {v12, v4}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    check-cast v12, Ljava/lang/String;

    .line 142
    .line 143
    if-eqz v12, :cond_4

    .line 144
    .line 145
    invoke-static {v12}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    goto :goto_4

    .line 154
    :cond_4
    const/4 v12, 0x0

    .line 155
    :goto_4
    if-nez v12, :cond_5

    .line 156
    .line 157
    move-object/from16 v12, v17

    .line 158
    .line 159
    :cond_5
    invoke-direct {v15, v13, v8, v12}, Lp1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    add-int/lit8 v11, v11, 0x1

    .line 166
    .line 167
    move v12, v14

    .line 168
    goto :goto_2

    .line 169
    :cond_6
    invoke-virtual {v7, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_7
    move-object v4, v10

    .line 173
    check-cast v4, Ljava/util/List;

    .line 174
    .line 175
    new-instance v0, Lv1;

    .line 176
    .line 177
    const/4 v5, 0x0

    .line 178
    invoke-direct/range {v0 .. v5}, Lv1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    const v2, 0x3df29e2a

    .line 182
    .line 183
    .line 184
    invoke-static {v2, v0, v7}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    const/4 v2, 0x6

    .line 189
    invoke-static {v0, v7, v2}, Lci0;->p(Lkw;Lpx;I)V

    .line 190
    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_8
    invoke-virtual {v7}, Lgo0;->R()V

    .line 194
    .line 195
    .line 196
    :goto_5
    invoke-virtual {v7}, Lgo0;->r()Lb62;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-eqz v0, :cond_9

    .line 201
    .line 202
    new-instance v2, Lw1;

    .line 203
    .line 204
    const/4 v3, 0x0

    .line 205
    invoke-direct {v2, v6, v3, v1}, Lw1;-><init>(IILin0;)V

    .line 206
    .line 207
    .line 208
    iput-object v2, v0, Lb62;->d:Lmn0;

    .line 209
    .line 210
    :cond_9
    return-void
.end method

.method public static b0(Luh1;FFFFI)Luh1;
    .locals 8

    .line 1
    and-int/lit8 v0, p5, 0x2

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v4, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v4, p2

    .line 10
    :goto_0
    and-int/lit8 p2, p5, 0x4

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    move v5, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move v5, p3

    .line 17
    :goto_1
    and-int/lit8 p2, p5, 0x8

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    move v6, v1

    .line 22
    goto :goto_2

    .line 23
    :cond_2
    move v6, p4

    .line 24
    :goto_2
    new-instance v2, Lkr2;

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    move v3, p1

    .line 28
    invoke-direct/range {v2 .. v7}, Lkr2;-><init>(FFFFZ)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v2}, Luh1;->c(Luh1;)Luh1;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static final c(Ljava/util/List;Lpx;I)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v9, p1

    .line 6
    .line 7
    check-cast v9, Lgo0;

    .line 8
    .line 9
    const v2, 0x1c5a454a

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v2}, Lgo0;->X(I)Lgo0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v9, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v3

    .line 25
    :goto_0
    or-int/2addr v2, v1

    .line 26
    and-int/lit8 v4, v2, 0x3

    .line 27
    .line 28
    const/4 v12, 0x0

    .line 29
    const/4 v13, 0x1

    .line 30
    if-eq v4, v3, :cond_1

    .line 31
    .line 32
    move v4, v13

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v4, v12

    .line 35
    :goto_1
    and-int/2addr v2, v13

    .line 36
    invoke-virtual {v9, v2, v4}, Lgo0;->O(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    const/high16 v2, 0x41800000    # 16.0f

    .line 43
    .line 44
    const/high16 v4, 0x41600000    # 14.0f

    .line 45
    .line 46
    sget-object v5, Lte;->e:Lyi0;

    .line 47
    .line 48
    invoke-static {v5, v2, v4}, Lfg1;->D(Luh1;FF)Luh1;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance v4, Lxf;

    .line 53
    .line 54
    new-instance v5, Ls;

    .line 55
    .line 56
    invoke-direct {v5, v3}, Ls;-><init>(I)V

    .line 57
    .line 58
    .line 59
    const/high16 v3, 0x41000000    # 8.0f

    .line 60
    .line 61
    invoke-direct {v4, v3, v5}, Lxf;-><init>(FLs;)V

    .line 62
    .line 63
    .line 64
    sget-object v3, Lsn;->u:Lpk;

    .line 65
    .line 66
    const/4 v5, 0x6

    .line 67
    invoke-static {v4, v3, v9, v5}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iget-wide v4, v9, Lgo0;->T:J

    .line 72
    .line 73
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-virtual {v9}, Lgo0;->l()Lyy1;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-static {v9, v2}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    sget-object v6, Lhx;->c:Lgx;

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    sget-object v6, Lgx;->b:Ljy;

    .line 91
    .line 92
    invoke-virtual {v9}, Lgo0;->Z()V

    .line 93
    .line 94
    .line 95
    iget-boolean v7, v9, Lgo0;->S:Z

    .line 96
    .line 97
    if-eqz v7, :cond_2

    .line 98
    .line 99
    invoke-virtual {v9, v6}, Lgo0;->k(Lxm0;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    invoke-virtual {v9}, Lgo0;->i0()V

    .line 104
    .line 105
    .line 106
    :goto_2
    sget-object v6, Lgx;->e:Llc;

    .line 107
    .line 108
    invoke-static {v9, v6, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v3, Lgx;->d:Llc;

    .line 112
    .line 113
    invoke-static {v9, v3, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    sget-object v4, Lgx;->f:Llc;

    .line 121
    .line 122
    invoke-static {v9, v4, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object v3, Lgx;->g:Lv6;

    .line 126
    .line 127
    invoke-static {v9, v3}, Lyf3;->b(Lpx;Lin0;)V

    .line 128
    .line 129
    .line 130
    sget-object v3, Lgx;->c:Llc;

    .line 131
    .line 132
    invoke-static {v9, v3, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    const v2, -0x581fc8f1

    .line 136
    .line 137
    .line 138
    invoke-virtual {v9, v2}, Lgo0;->W(I)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_3

    .line 150
    .line 151
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    check-cast v2, Ljava/lang/String;

    .line 156
    .line 157
    sget-object v3, Lur1;->a:Ltu2;

    .line 158
    .line 159
    invoke-virtual {v9, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Llp1;

    .line 164
    .line 165
    iget-wide v3, v3, Llp1;->f:J

    .line 166
    .line 167
    const/16 v5, 0xd

    .line 168
    .line 169
    invoke-static {v5}, Lrg3;->D(I)J

    .line 170
    .line 171
    .line 172
    move-result-wide v18

    .line 173
    const/16 v5, 0x13

    .line 174
    .line 175
    invoke-static {v5}, Lrg3;->D(I)J

    .line 176
    .line 177
    .line 178
    move-result-wide v24

    .line 179
    sget-object v20, Lim0;->j:Lim0;

    .line 180
    .line 181
    new-instance v15, Lm13;

    .line 182
    .line 183
    const/16 v27, 0x0

    .line 184
    .line 185
    const v28, 0xfdfff8

    .line 186
    .line 187
    .line 188
    const-wide/16 v21, 0x0

    .line 189
    .line 190
    const/16 v23, 0x0

    .line 191
    .line 192
    const/16 v26, 0x0

    .line 193
    .line 194
    move-wide/from16 v16, v3

    .line 195
    .line 196
    invoke-direct/range {v15 .. v28}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 197
    .line 198
    .line 199
    const/4 v10, 0x0

    .line 200
    const/16 v11, 0x3fa

    .line 201
    .line 202
    const/4 v3, 0x0

    .line 203
    const/4 v5, 0x0

    .line 204
    const/4 v6, 0x0

    .line 205
    const/4 v7, 0x0

    .line 206
    const/4 v8, 0x0

    .line 207
    move-object v4, v15

    .line 208
    invoke-static/range {v2 .. v11}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 209
    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_3
    invoke-virtual {v9, v12}, Lgo0;->p(Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v9, v13}, Lgo0;->p(Z)V

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_4
    invoke-virtual {v9}, Lgo0;->R()V

    .line 220
    .line 221
    .line 222
    :goto_4
    invoke-virtual {v9}, Lgo0;->r()Lb62;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    if-eqz v2, :cond_5

    .line 227
    .line 228
    new-instance v3, Lq1;

    .line 229
    .line 230
    const/4 v4, 0x3

    .line 231
    invoke-direct {v3, v0, v1, v4}, Lq1;-><init>(Ljava/util/List;II)V

    .line 232
    .line 233
    .line 234
    iput-object v3, v2, Lb62;->d:Lmn0;

    .line 235
    .line 236
    :cond_5
    return-void
.end method

.method public static c0(Lbi0;Ljava/nio/MappedByteBuffer;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget v1, Lbi0;->z:I

    .line 6
    .line 7
    if-eq v0, v1, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lbi0;->q:Ljava/nio/channels/FileChannel;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lbi0;->r:Ljava/nio/channels/FileChannel;

    .line 17
    .line 18
    :goto_0
    int-to-long v2, v1

    .line 19
    :try_start_0
    invoke-virtual {v0, v2, v3}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lte;->a0(Ljava/nio/channels/FileChannel;I)Ljava/nio/MappedByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    const/4 v0, 0x0

    .line 28
    :goto_1
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v1, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 31
    .line 32
    if-ne p1, v1, :cond_1

    .line 33
    .line 34
    iput-object v0, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    iput-object v0, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 38
    .line 39
    :goto_2
    move-object p1, v0

    .line 40
    goto :goto_3

    .line 41
    :cond_2
    const-string p0, "Failed to truncate and remap buffer"

    .line 42
    .line 43
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    :goto_3
    const/4 p0, 0x0

    .line 48
    invoke-virtual {p1, p0, p0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x4

    .line 52
    const-wide/16 v0, 0x0

    .line 53
    .line 54
    invoke-virtual {p1, p0, v0, v1}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static final d(Lc73;ZLin0;Lin0;Lpx;I)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v11, p1

    .line 4
    .line 5
    iget-object v0, v1, Lc73;->d:Lb73;

    .line 6
    .line 7
    iget v2, v1, Lc73;->b:I

    .line 8
    .line 9
    iget v3, v1, Lc73;->a:I

    .line 10
    .line 11
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-object/from16 v12, p4

    .line 18
    .line 19
    check-cast v12, Lgo0;

    .line 20
    .line 21
    const v4, -0x778257d4

    .line 22
    .line 23
    .line 24
    invoke-virtual {v12, v4}, Lgo0;->X(I)Lgo0;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v12, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v4, 0x2

    .line 36
    :goto_0
    or-int v4, p5, v4

    .line 37
    .line 38
    invoke-virtual {v12, v11}, Lgo0;->g(Z)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    const/16 v7, 0x10

    .line 43
    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    const/16 v5, 0x20

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v5, v7

    .line 50
    :goto_1
    or-int/2addr v4, v5

    .line 51
    move-object/from16 v5, p2

    .line 52
    .line 53
    invoke-virtual {v12, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-eqz v8, :cond_2

    .line 58
    .line 59
    const/16 v8, 0x100

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/16 v8, 0x80

    .line 63
    .line 64
    :goto_2
    or-int/2addr v4, v8

    .line 65
    move-object/from16 v8, p3

    .line 66
    .line 67
    invoke-virtual {v12, v8}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-eqz v9, :cond_3

    .line 72
    .line 73
    const/16 v9, 0x800

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    const/16 v9, 0x400

    .line 77
    .line 78
    :goto_3
    or-int v15, v4, v9

    .line 79
    .line 80
    and-int/lit16 v4, v15, 0x493

    .line 81
    .line 82
    const/16 v9, 0x492

    .line 83
    .line 84
    const/16 v16, 0x1

    .line 85
    .line 86
    if-eq v4, v9, :cond_4

    .line 87
    .line 88
    move/from16 v4, v16

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_4
    const/4 v4, 0x0

    .line 92
    :goto_4
    and-int/lit8 v9, v15, 0x1

    .line 93
    .line 94
    invoke-virtual {v12, v9, v4}, Lgo0;->O(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_31

    .line 99
    .line 100
    invoke-virtual {v12, v3}, Lgo0;->d(I)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    sget-object v13, Lpf;->m:Lyf0;

    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    sget-object v14, Lnx;->a:Leb;

    .line 113
    .line 114
    if-nez v4, :cond_5

    .line 115
    .line 116
    if-ne v9, v14, :cond_9

    .line 117
    .line 118
    :cond_5
    sget-object v4, Lpf;->j:Lz8;

    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v13}, Lw2;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-eqz v9, :cond_7

    .line 132
    .line 133
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    move-object v6, v9

    .line 138
    check-cast v6, Lpf;

    .line 139
    .line 140
    iget v6, v6, Lpf;->h:I

    .line 141
    .line 142
    if-ne v6, v3, :cond_6

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_7
    move-object/from16 v9, v21

    .line 146
    .line 147
    :goto_5
    check-cast v9, Lpf;

    .line 148
    .line 149
    if-nez v9, :cond_8

    .line 150
    .line 151
    sget-object v3, Lpf;->k:Lpf;

    .line 152
    .line 153
    move-object v9, v3

    .line 154
    :cond_8
    invoke-virtual {v12, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_9
    check-cast v9, Lpf;

    .line 158
    .line 159
    invoke-virtual {v12, v2}, Lgo0;->d(I)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    sget-object v6, Lx51;->m:Lyf0;

    .line 168
    .line 169
    if-nez v3, :cond_a

    .line 170
    .line 171
    if-ne v4, v14, :cond_e

    .line 172
    .line 173
    :cond_a
    sget-object v3, Lx51;->j:Li51;

    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v6}, Lw2;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_c

    .line 187
    .line 188
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    move-object v10, v4

    .line 193
    check-cast v10, Lx51;

    .line 194
    .line 195
    iget v10, v10, Lx51;->h:I

    .line 196
    .line 197
    if-ne v10, v2, :cond_b

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_c
    move-object/from16 v4, v21

    .line 201
    .line 202
    :goto_6
    check-cast v4, Lx51;

    .line 203
    .line 204
    if-nez v4, :cond_d

    .line 205
    .line 206
    sget-object v2, Lx51;->k:Lx51;

    .line 207
    .line 208
    move-object v4, v2

    .line 209
    :cond_d
    invoke-virtual {v12, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_e
    check-cast v4, Lx51;

    .line 213
    .line 214
    const v2, 0x5fb48acf

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v2}, Lgo0;->W(I)V

    .line 218
    .line 219
    .line 220
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 221
    .line 222
    const/16 v2, 0xa

    .line 223
    .line 224
    invoke-static {v13, v2}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    invoke-static {v3}, Lxe1;->U(I)I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-ge v3, v7, :cond_f

    .line 233
    .line 234
    move v3, v7

    .line 235
    :cond_f
    invoke-direct {v5, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 236
    .line 237
    .line 238
    new-instance v3, Lt2;

    .line 239
    .line 240
    const/4 v10, 0x0

    .line 241
    invoke-direct {v3, v10, v13}, Lt2;-><init>(ILjava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :goto_7
    invoke-virtual {v3}, Lt2;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v13

    .line 248
    if-eqz v13, :cond_10

    .line 249
    .line 250
    invoke-virtual {v3}, Lt2;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    move-object v7, v13

    .line 255
    check-cast v7, Lpf;

    .line 256
    .line 257
    iget v7, v7, Lpf;->i:I

    .line 258
    .line 259
    invoke-static {v7, v12}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    invoke-interface {v5, v13, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    const/16 v7, 0x10

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_10
    invoke-virtual {v12, v10}, Lgo0;->p(Z)V

    .line 270
    .line 271
    .line 272
    const v3, 0x5fb4998f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v3}, Lgo0;->W(I)V

    .line 276
    .line 277
    .line 278
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 279
    .line 280
    invoke-static {v6, v2}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    invoke-static {v2}, Lxe1;->U(I)I

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    const/16 v3, 0x10

    .line 289
    .line 290
    if-ge v2, v3, :cond_11

    .line 291
    .line 292
    move v2, v3

    .line 293
    :cond_11
    invoke-direct {v7, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 294
    .line 295
    .line 296
    new-instance v2, Lt2;

    .line 297
    .line 298
    invoke-direct {v2, v10, v6}, Lt2;-><init>(ILjava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :goto_8
    invoke-virtual {v2}, Lt2;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-eqz v3, :cond_12

    .line 306
    .line 307
    invoke-virtual {v2}, Lt2;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    move-object v6, v3

    .line 312
    check-cast v6, Lx51;

    .line 313
    .line 314
    iget v6, v6, Lx51;->i:I

    .line 315
    .line 316
    invoke-static {v6, v12}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    invoke-interface {v7, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_12
    invoke-virtual {v12, v10}, Lgo0;->p(Z)V

    .line 325
    .line 326
    .line 327
    and-int/lit8 v2, v15, 0x70

    .line 328
    .line 329
    const/16 v3, 0x20

    .line 330
    .line 331
    if-ne v2, v3, :cond_13

    .line 332
    .line 333
    move/from16 v2, v16

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :cond_13
    const/4 v2, 0x0

    .line 337
    :goto_9
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    if-nez v2, :cond_14

    .line 342
    .line 343
    if-ne v3, v14, :cond_16

    .line 344
    .line 345
    :cond_14
    if-eqz v11, :cond_15

    .line 346
    .line 347
    sget-wide v2, Lpo1;->a:J

    .line 348
    .line 349
    invoke-static {v2, v3}, Lp40;->q(J)Llp1;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    :goto_a
    move-object v3, v2

    .line 354
    goto :goto_b

    .line 355
    :cond_15
    sget-wide v2, Lpo1;->a:J

    .line 356
    .line 357
    invoke-static {v2, v3}, Lp40;->M(J)Llp1;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    goto :goto_a

    .line 362
    :goto_b
    invoke-virtual {v12, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :cond_16
    check-cast v3, Llp1;

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    invoke-virtual {v12, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    or-int/2addr v2, v6

    .line 376
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    if-nez v2, :cond_17

    .line 381
    .line 382
    if-ne v6, v14, :cond_18

    .line 383
    .line 384
    :cond_17
    invoke-static {v0, v3}, Lp7;->H(Lb73;Llp1;)Lb73;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    invoke-virtual {v12, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    :cond_18
    move-object v13, v6

    .line 392
    check-cast v13, Lb73;

    .line 393
    .line 394
    invoke-virtual {v12, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    if-nez v0, :cond_19

    .line 403
    .line 404
    if-ne v2, v14, :cond_1a

    .line 405
    .line 406
    :cond_19
    iget-wide v2, v3, Llp1;->g:J

    .line 407
    .line 408
    invoke-static {v2, v3}, Lp7;->O(J)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    invoke-virtual {v12, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    :cond_1a
    move-object v0, v2

    .line 416
    check-cast v0, Ljava/lang/String;

    .line 417
    .line 418
    invoke-virtual {v12, v13}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    invoke-virtual {v12, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    or-int/2addr v2, v3

    .line 427
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    if-nez v2, :cond_1b

    .line 432
    .line 433
    if-ne v3, v14, :cond_1d

    .line 434
    .line 435
    :cond_1b
    iget-object v2, v13, Lb73;->a:Ljava/lang/String;

    .line 436
    .line 437
    if-nez v2, :cond_1c

    .line 438
    .line 439
    move-object v3, v0

    .line 440
    goto :goto_c

    .line 441
    :cond_1c
    move-object v3, v2

    .line 442
    :goto_c
    invoke-virtual {v12, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    :cond_1d
    move-object v10, v3

    .line 446
    check-cast v10, Ljava/lang/String;

    .line 447
    .line 448
    invoke-virtual {v12, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    if-nez v2, :cond_1e

    .line 457
    .line 458
    if-ne v3, v14, :cond_1f

    .line 459
    .line 460
    :cond_1e
    invoke-static {v10}, Lp7;->N(Ljava/lang/String;)Lju;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    invoke-virtual {v12, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    :cond_1f
    check-cast v3, Lju;

    .line 468
    .line 469
    const/4 v2, 0x0

    .line 470
    new-array v6, v2, [Ljava/lang/Object;

    .line 471
    .line 472
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    if-ne v2, v14, :cond_20

    .line 477
    .line 478
    new-instance v2, Lc0;

    .line 479
    .line 480
    move-object/from16 v24, v0

    .line 481
    .line 482
    const/4 v0, 0x5

    .line 483
    invoke-direct {v2, v0}, Lc0;-><init>(I)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    goto :goto_d

    .line 490
    :cond_20
    move-object/from16 v24, v0

    .line 491
    .line 492
    :goto_d
    check-cast v2, Lxm0;

    .line 493
    .line 494
    const/16 v0, 0x30

    .line 495
    .line 496
    invoke-static {v6, v2, v12, v0}, Lgf1;->M([Ljava/lang/Object;Lxm0;Lpx;I)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    move-object v6, v0

    .line 501
    check-cast v6, Lxk1;

    .line 502
    .line 503
    const/4 v2, 0x0

    .line 504
    new-array v0, v2, [Ljava/lang/Object;

    .line 505
    .line 506
    invoke-virtual {v12, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v17

    .line 510
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    if-nez v17, :cond_22

    .line 515
    .line 516
    if-ne v2, v14, :cond_21

    .line 517
    .line 518
    goto :goto_e

    .line 519
    :cond_21
    const/4 v1, 0x0

    .line 520
    goto :goto_f

    .line 521
    :cond_22
    :goto_e
    new-instance v2, Lkf;

    .line 522
    .line 523
    const/4 v1, 0x0

    .line 524
    invoke-direct {v2, v10, v1}, Lkf;-><init>(Ljava/lang/String;I)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    :goto_f
    check-cast v2, Lxm0;

    .line 531
    .line 532
    invoke-static {v0, v2, v12, v1}, Lgf1;->M([Ljava/lang/Object;Lxm0;Lpx;I)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    check-cast v0, Lxk1;

    .line 537
    .line 538
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v2

    .line 542
    check-cast v2, Ljava/lang/Boolean;

    .line 543
    .line 544
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v17

    .line 551
    invoke-virtual {v12, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v18

    .line 555
    or-int v17, v17, v18

    .line 556
    .line 557
    invoke-virtual {v12, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v18

    .line 561
    or-int v17, v17, v18

    .line 562
    .line 563
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    if-nez v17, :cond_24

    .line 568
    .line 569
    if-ne v1, v14, :cond_23

    .line 570
    .line 571
    goto :goto_10

    .line 572
    :cond_23
    move-object/from16 v20, v0

    .line 573
    .line 574
    move-object/from16 v19, v6

    .line 575
    .line 576
    goto :goto_11

    .line 577
    :cond_24
    :goto_10
    new-instance v17, Lu0;

    .line 578
    .line 579
    const/16 v22, 0x1

    .line 580
    .line 581
    move-object/from16 v20, v0

    .line 582
    .line 583
    move-object/from16 v19, v6

    .line 584
    .line 585
    move-object/from16 v18, v10

    .line 586
    .line 587
    invoke-direct/range {v17 .. v22}, Lu0;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 588
    .line 589
    .line 590
    move-object/from16 v1, v17

    .line 591
    .line 592
    invoke-virtual {v12, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    :goto_11
    check-cast v1, Lmn0;

    .line 596
    .line 597
    invoke-static {v2, v10, v1, v12}, Leu;->g(Ljava/lang/Object;Ljava/lang/Object;Lmn0;Lpx;)V

    .line 598
    .line 599
    .line 600
    invoke-interface/range {v20 .. v20}, Lgu2;->getValue()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    check-cast v0, Ljava/lang/String;

    .line 605
    .line 606
    invoke-virtual {v12, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    if-nez v0, :cond_25

    .line 615
    .line 616
    if-ne v1, v14, :cond_26

    .line 617
    .line 618
    :cond_25
    invoke-interface/range {v20 .. v20}, Lgu2;->getValue()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    check-cast v0, Ljava/lang/String;

    .line 623
    .line 624
    invoke-static {v0}, Lp7;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    invoke-virtual {v12, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    :cond_26
    move-object v0, v1

    .line 632
    check-cast v0, Ljava/lang/String;

    .line 633
    .line 634
    if-eqz v0, :cond_27

    .line 635
    .line 636
    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    move-result v1

    .line 640
    if-nez v1, :cond_27

    .line 641
    .line 642
    move/from16 v17, v16

    .line 643
    .line 644
    :goto_12
    move-object v1, v0

    .line 645
    goto :goto_13

    .line 646
    :cond_27
    const/16 v17, 0x0

    .line 647
    .line 648
    goto :goto_12

    .line 649
    :goto_13
    new-instance v0, Llf;

    .line 650
    .line 651
    move-object v6, v4

    .line 652
    move-object v2, v9

    .line 653
    move/from16 v18, v15

    .line 654
    .line 655
    move-object/from16 v11, v24

    .line 656
    .line 657
    const/16 v23, 0x0

    .line 658
    .line 659
    move-object/from16 v4, p0

    .line 660
    .line 661
    move-object v15, v1

    .line 662
    move-object v9, v3

    .line 663
    move-object v1, v8

    .line 664
    move-object/from16 v8, v19

    .line 665
    .line 666
    move-object/from16 v3, p2

    .line 667
    .line 668
    invoke-direct/range {v0 .. v10}, Llf;-><init>(Lin0;Lpf;Lin0;Lc73;Ljava/util/LinkedHashMap;Lx51;Ljava/util/LinkedHashMap;Lxk1;Lju;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    move-object v1, v4

    .line 672
    move-object v6, v8

    .line 673
    const v2, 0x57246201

    .line 674
    .line 675
    .line 676
    invoke-static {v2, v0, v12}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    const/4 v2, 0x6

    .line 681
    invoke-static {v0, v12, v2}, Lci0;->p(Lkw;Lpx;I)V

    .line 682
    .line 683
    .line 684
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    check-cast v0, Ljava/lang/Boolean;

    .line 689
    .line 690
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 691
    .line 692
    .line 693
    move-result v7

    .line 694
    invoke-interface/range {v20 .. v20}, Lgu2;->getValue()Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    move-object v8, v0

    .line 699
    check-cast v8, Ljava/lang/String;

    .line 700
    .line 701
    iget-object v9, v13, Lb73;->b:Ljava/util/List;

    .line 702
    .line 703
    move-object/from16 v0, v20

    .line 704
    .line 705
    invoke-virtual {v12, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 706
    .line 707
    .line 708
    move-result v2

    .line 709
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v3

    .line 713
    if-nez v2, :cond_28

    .line 714
    .line 715
    if-ne v3, v14, :cond_29

    .line 716
    .line 717
    :cond_28
    new-instance v3, Lh0;

    .line 718
    .line 719
    const/16 v2, 0xd

    .line 720
    .line 721
    invoke-direct {v3, v0, v2}, Lh0;-><init>(Lxk1;I)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 725
    .line 726
    .line 727
    :cond_29
    move-object v10, v3

    .line 728
    check-cast v10, Lin0;

    .line 729
    .line 730
    invoke-virtual {v12, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-result v0

    .line 734
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    if-nez v0, :cond_2a

    .line 739
    .line 740
    if-ne v2, v14, :cond_2b

    .line 741
    .line 742
    :cond_2a
    new-instance v2, Lf0;

    .line 743
    .line 744
    const/16 v0, 0x9

    .line 745
    .line 746
    invoke-direct {v2, v6, v0}, Lf0;-><init>(Lxk1;I)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    :cond_2b
    move-object/from16 v19, v2

    .line 753
    .line 754
    check-cast v19, Lxm0;

    .line 755
    .line 756
    invoke-virtual {v12, v15}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 757
    .line 758
    .line 759
    move-result v0

    .line 760
    invoke-virtual {v12, v13}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    or-int/2addr v0, v2

    .line 765
    invoke-virtual {v12, v11}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v2

    .line 769
    or-int/2addr v0, v2

    .line 770
    move/from16 v2, v18

    .line 771
    .line 772
    and-int/lit16 v3, v2, 0x380

    .line 773
    .line 774
    const/16 v4, 0x100

    .line 775
    .line 776
    if-ne v3, v4, :cond_2c

    .line 777
    .line 778
    move/from16 v3, v16

    .line 779
    .line 780
    goto :goto_14

    .line 781
    :cond_2c
    move/from16 v3, v23

    .line 782
    .line 783
    :goto_14
    or-int/2addr v0, v3

    .line 784
    and-int/lit8 v2, v2, 0xe

    .line 785
    .line 786
    const/4 v3, 0x4

    .line 787
    if-eq v2, v3, :cond_2e

    .line 788
    .line 789
    invoke-virtual {v12, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    move-result v2

    .line 793
    if-eqz v2, :cond_2d

    .line 794
    .line 795
    goto :goto_15

    .line 796
    :cond_2d
    move/from16 v16, v23

    .line 797
    .line 798
    :cond_2e
    :goto_15
    or-int v0, v0, v16

    .line 799
    .line 800
    invoke-virtual {v12, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 801
    .line 802
    .line 803
    move-result v2

    .line 804
    or-int/2addr v0, v2

    .line 805
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    if-nez v0, :cond_2f

    .line 810
    .line 811
    if-ne v2, v14, :cond_30

    .line 812
    .line 813
    :cond_2f
    new-instance v0, Lmf;

    .line 814
    .line 815
    move-object/from16 v4, p2

    .line 816
    .line 817
    move-object v5, v1

    .line 818
    move-object v3, v11

    .line 819
    move-object v2, v13

    .line 820
    move-object v1, v15

    .line 821
    invoke-direct/range {v0 .. v6}, Lmf;-><init>(Ljava/lang/String;Lb73;Ljava/lang/String;Lin0;Lc73;Lxk1;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v12, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    move-object v2, v0

    .line 828
    :cond_30
    move-object/from16 v20, v2

    .line 829
    .line 830
    check-cast v20, Lxm0;

    .line 831
    .line 832
    const/16 v22, 0x0

    .line 833
    .line 834
    move-object v13, v8

    .line 835
    move-object/from16 v16, v9

    .line 836
    .line 837
    move-object/from16 v18, v10

    .line 838
    .line 839
    move-object v14, v11

    .line 840
    move-object/from16 v21, v12

    .line 841
    .line 842
    move v12, v7

    .line 843
    invoke-static/range {v12 .. v22}, Lgf1;->e(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLin0;Lxm0;Lxm0;Lpx;I)V

    .line 844
    .line 845
    .line 846
    goto :goto_16

    .line 847
    :cond_31
    move-object/from16 v21, v12

    .line 848
    .line 849
    invoke-virtual/range {v21 .. v21}, Lgo0;->R()V

    .line 850
    .line 851
    .line 852
    :goto_16
    invoke-virtual/range {v21 .. v21}, Lgo0;->r()Lb62;

    .line 853
    .line 854
    .line 855
    move-result-object v6

    .line 856
    if-eqz v6, :cond_32

    .line 857
    .line 858
    new-instance v0, Lnf;

    .line 859
    .line 860
    move-object/from16 v1, p0

    .line 861
    .line 862
    move/from16 v2, p1

    .line 863
    .line 864
    move-object/from16 v3, p2

    .line 865
    .line 866
    move-object/from16 v4, p3

    .line 867
    .line 868
    move/from16 v5, p5

    .line 869
    .line 870
    invoke-direct/range {v0 .. v5}, Lnf;-><init>(Lc73;ZLin0;Lin0;I)V

    .line 871
    .line 872
    .line 873
    iput-object v0, v6, Lb62;->d:Lmn0;

    .line 874
    .line 875
    :cond_32
    return-void
.end method

.method public static d0(Lbi0;)V
    .locals 6

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    iput v0, p0, Lbi0;->d:I

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lbi0;->e:J

    .line 8
    .line 9
    iget-object v2, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput v2, p0, Lbi0;->m:I

    .line 16
    .line 17
    iget-object v3, p0, Lbi0;->n:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lbi0;->h:Le9;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    iget-object v4, v3, Le9;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, [B

    .line 29
    .line 30
    array-length v4, v4

    .line 31
    sget v5, Lbi0;->z:I

    .line 32
    .line 33
    if-eq v4, v5, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v4, 0x4

    .line 37
    invoke-virtual {v3, v0, v1, v4}, Le9;->r(JI)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    new-instance v0, Le9;

    .line 42
    .line 43
    sget v1, Lbi0;->z:I

    .line 44
    .line 45
    const/4 v3, 0x3

    .line 46
    invoke-direct {v0, v1, v3}, Le9;-><init>(II)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lbi0;->h:Le9;

    .line 50
    .line 51
    :goto_1
    iget-object p0, p0, Lbi0;->h:Le9;

    .line 52
    .line 53
    invoke-virtual {p0, v2, v2}, Le9;->q(II)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static final e(La20;)Ls00;
    .locals 3

    .line 1
    new-instance v0, Ls00;

    .line 2
    .line 3
    sget-object v1, Lsn;->K:Lsn;

    .line 4
    .line 5
    invoke-interface {p0, v1}, La20;->o(Lz10;)Ly10;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v1, Lm21;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, v2}, Lm21;-><init>(Lk21;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v1}, La20;->k(La20;)La20;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-direct {v0, p0}, Ls00;-><init>(La20;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static e0([Lvj;Lpb1;Lvu0;)V
    .locals 13

    .line 1
    const/4 v1, 0x0

    .line 2
    new-array v0, v1, [Ljava/lang/Object;

    .line 3
    .line 4
    const v2, 0x790b01d0

    .line 5
    .line 6
    .line 7
    invoke-static {v2, v0}, Lte;->j0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v2, 0x3ca3d70a    # 0.02f

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v3, Lte;->a:Lsz0;

    .line 19
    .line 20
    invoke-virtual {v3, v0, v2}, Lsz0;->N(Ljava/lang/String;Ljava/lang/Float;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, La72;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v2, -0x1

    .line 29
    iput v2, v0, La72;->h:I

    .line 30
    .line 31
    new-instance v2, Lb72;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const-wide/16 v4, -0x1

    .line 37
    .line 38
    iput-wide v4, v2, Lb72;->h:J

    .line 39
    .line 40
    sget-object v4, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 41
    .line 42
    new-instance v4, Laf;

    .line 43
    .line 44
    const/4 v5, 0x5

    .line 45
    invoke-direct {v4, v5, v0, v2}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v2, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 49
    .line 50
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-static {v0, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_f

    .line 63
    .line 64
    sget-object v5, Lam1;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 67
    .line 68
    .line 69
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    move-object v6, v0

    .line 74
    check-cast v6, Ljava/lang/Boolean;

    .line 75
    .line 76
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {v2, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 79
    .line 80
    .line 81
    :try_start_1
    invoke-static {}, Lam1;->c()V

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v4}, Lam1;->d(ZLaf;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 85
    .line 86
    .line 87
    :try_start_2
    invoke-virtual {v2, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 91
    .line 92
    .line 93
    const v0, 0x790b01d7

    .line 94
    .line 95
    .line 96
    new-array v2, v1, [Ljava/lang/Object;

    .line 97
    .line 98
    invoke-static {v0, v2}, Lte;->j0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const v2, 0x3ea3d70a    # 0.32f

    .line 103
    .line 104
    .line 105
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v3, v0, v2}, Lsz0;->N(Ljava/lang/String;Ljava/lang/Float;)V

    .line 110
    .line 111
    .line 112
    sget-object v0, Laq1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 113
    .line 114
    sget-object v0, Lpp1;->a:Lpp1;

    .line 115
    .line 116
    invoke-static {}, Lpp1;->c()Lop1;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {}, Lpp1;->b()Lop1;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v0, v2, p0}, Laq1;->a(Lop1;Lop1;[Lvj;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p1}, Lpb1;->a()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    const v0, 0x790b01d5

    .line 144
    .line 145
    .line 146
    invoke-static {v0, p0}, Lte;->j0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    const v0, 0x3ec28f5c    # 0.38f

    .line 151
    .line 152
    .line 153
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v3, p0, v0}, Lsz0;->N(Ljava/lang/String;Ljava/lang/Float;)V

    .line 158
    .line 159
    .line 160
    const-string p0, "libdexkit.so"

    .line 161
    .line 162
    const-class v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 163
    .line 164
    const/4 v2, 0x1

    .line 165
    invoke-static {v0, p0, v2}, Lb80;->a(Ljava/lang/Class;Ljava/lang/String;Z)V

    .line 166
    .line 167
    .line 168
    sget-object p0, Lup0;->j:Ljava/lang/ClassLoader;

    .line 169
    .line 170
    const/4 v4, 0x0

    .line 171
    if-eqz p0, :cond_e

    .line 172
    .line 173
    :try_start_3
    const-string v0, "dalvik.system.BaseDexClassLoader"

    .line 174
    .line 175
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    .line 179
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_d

    .line 184
    .line 185
    new-instance v5, Lorg/luckypray/dexkit/DexKitBridge;

    .line 186
    .line 187
    invoke-direct {v5, p0}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/ClassLoader;)V

    .line 188
    .line 189
    .line 190
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 191
    .line 192
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, v1}, Lpb1;->listIterator(I)Ljava/util/ListIterator;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    :goto_0
    move-object v6, v0

    .line 200
    check-cast v6, Lvs0;

    .line 201
    .line 202
    invoke-virtual {v6}, Lvs0;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    if-eqz v7, :cond_1

    .line 207
    .line 208
    invoke-virtual {v6}, Lvs0;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    check-cast v6, Lq70;

    .line 213
    .line 214
    iget-object v6, v6, Lq70;->b:Lv70;

    .line 215
    .line 216
    iget-object v6, v6, Lv70;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {p0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    if-nez v7, :cond_0

    .line 223
    .line 224
    invoke-interface {p0, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    if-nez v8, :cond_0

    .line 229
    .line 230
    new-instance v7, La72;

    .line 231
    .line 232
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 233
    .line 234
    .line 235
    :cond_0
    check-cast v7, La72;

    .line 236
    .line 237
    iget v8, v7, La72;->h:I

    .line 238
    .line 239
    add-int/2addr v8, v2

    .line 240
    iput v8, v7, La72;->h:I

    .line 241
    .line 242
    invoke-interface {p0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    goto :goto_0

    .line 246
    :cond_1
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Ljava/lang/Iterable;

    .line 251
    .line 252
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    if-eqz v6, :cond_4

    .line 261
    .line 262
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    check-cast v6, Ljava/util/Map$Entry;

    .line 267
    .line 268
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    instance-of v7, v6, Lq41;

    .line 272
    .line 273
    if-eqz v7, :cond_3

    .line 274
    .line 275
    instance-of v7, v6, Lr41;

    .line 276
    .line 277
    if-eqz v7, :cond_2

    .line 278
    .line 279
    goto :goto_2

    .line 280
    :cond_2
    const-string p0, "kotlin.collections.MutableMap.MutableEntry"

    .line 281
    .line 282
    invoke-static {p0, v6}, Lxe1;->l0(Ljava/lang/String;Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    throw v4

    .line 286
    :cond_3
    :goto_2
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    check-cast v7, La72;

    .line 291
    .line 292
    iget v7, v7, La72;->h:I

    .line 293
    .line 294
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    invoke-interface {v6, v7}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    goto :goto_1

    .line 302
    :cond_4
    invoke-static {p0}, Lxe1;->e(Ljava/lang/Object;)Ljava/util/Map;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 307
    .line 308
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    :cond_5
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    if-eqz v6, :cond_6

    .line 324
    .line 325
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    check-cast v6, Ljava/util/Map$Entry;

    .line 330
    .line 331
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    check-cast v7, Ljava/lang/Number;

    .line 336
    .line 337
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    if-le v7, v2, :cond_5

    .line 342
    .line 343
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    invoke-virtual {v0, v7, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_6
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_c

    .line 364
    .line 365
    invoke-virtual {p1, v1}, Lpb1;->listIterator(I)Ljava/util/ListIterator;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    move v0, v1

    .line 370
    :goto_4
    move-object v6, p0

    .line 371
    check-cast v6, Lvs0;

    .line 372
    .line 373
    invoke-virtual {v6}, Lvs0;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v7

    .line 377
    if-eqz v7, :cond_a

    .line 378
    .line 379
    invoke-virtual {v6}, Lvs0;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    add-int/lit8 v7, v0, 0x1

    .line 384
    .line 385
    if-ltz v0, :cond_9

    .line 386
    .line 387
    check-cast v6, Lq70;

    .line 388
    .line 389
    int-to-float v0, v7

    .line 390
    invoke-virtual {p1}, Lpb1;->a()I

    .line 391
    .line 392
    .line 393
    move-result v8

    .line 394
    if-ge v8, v2, :cond_7

    .line 395
    .line 396
    move v8, v2

    .line 397
    :cond_7
    int-to-float v8, v8

    .line 398
    div-float/2addr v0, v8

    .line 399
    const/high16 v8, 0x3f000000    # 0.5f

    .line 400
    .line 401
    mul-float/2addr v0, v8

    .line 402
    const v8, 0x3ecccccd    # 0.4f

    .line 403
    .line 404
    .line 405
    add-float/2addr v0, v8

    .line 406
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 407
    .line 408
    .line 409
    move-result-object v8

    .line 410
    invoke-virtual {p1}, Lpb1;->a()I

    .line 411
    .line 412
    .line 413
    move-result v9

    .line 414
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    filled-new-array {v8, v9}, [Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    const v9, 0x790b01cf

    .line 423
    .line 424
    .line 425
    invoke-static {v9, v8}, Lte;->j0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v8

    .line 429
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-virtual {v3, v8, v0}, Lsz0;->N(Ljava/lang/String;Ljava/lang/Float;)V

    .line 434
    .line 435
    .line 436
    :try_start_4
    iget-object v0, v6, Lq70;->b:Lv70;

    .line 437
    .line 438
    invoke-virtual {v0, v5}, Lv70;->a(Lorg/luckypray/dexkit/DexKitBridge;)V

    .line 439
    .line 440
    .line 441
    sget-object v0, La83;->a:La83;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 442
    .line 443
    goto :goto_5

    .line 444
    :catchall_0
    move-exception v0

    .line 445
    new-instance v8, Lx92;

    .line 446
    .line 447
    invoke-direct {v8, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 448
    .line 449
    .line 450
    move-object v0, v8

    .line 451
    :goto_5
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    if-eqz v0, :cond_8

    .line 456
    .line 457
    sget-object v8, Lpp1;->a:Lpp1;

    .line 458
    .line 459
    iget-object v8, v6, Lq70;->a:Lvj;

    .line 460
    .line 461
    iget-object v9, v6, Lq70;->b:Lv70;

    .line 462
    .line 463
    iget-object v10, v9, Lv70;->a:Ljava/lang/String;

    .line 464
    .line 465
    const-string v11, " analysis failed"

    .line 466
    .line 467
    const-string v12, "Dex descriptor "

    .line 468
    .line 469
    invoke-static {v12, v10, v11}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v10

    .line 473
    const-string v11, "dex_find"

    .line 474
    .line 475
    invoke-static {v8, v11, v0, v10}, Lpp1;->h(Lvj;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    iget-object v6, v6, Lq70;->a:Lvj;

    .line 479
    .line 480
    invoke-virtual {v6}, Lvj;->d()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    iget-object v8, v9, Lv70;->a:Ljava/lang/String;

    .line 485
    .line 486
    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    new-instance v9, Ljava/lang/StringBuilder;

    .line 491
    .line 492
    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    const-string v8, " analysis failed: "

    .line 499
    .line 500
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-static {v6, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    :cond_8
    move v0, v7

    .line 514
    goto/16 :goto_4

    .line 515
    .line 516
    :cond_9
    invoke-static {}, Leu;->a0()V

    .line 517
    .line 518
    .line 519
    throw v4

    .line 520
    :cond_a
    invoke-static {p2}, Lpp0;->u(Lvu0;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    sget-object p1, Lpp1;->a:Lpp1;

    .line 525
    .line 526
    invoke-static {}, Lpp1;->b()Lop1;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    const-string p2, "Dex_Cache_Sum_Sign"

    .line 534
    .line 535
    invoke-virtual {p1, p2, p0}, Lop1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    const p0, 0x790b01d1

    .line 539
    .line 540
    .line 541
    new-array p1, v1, [Ljava/lang/Object;

    .line 542
    .line 543
    invoke-static {p0, p1}, Lte;->j0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    const/high16 p1, 0x3f800000    # 1.0f

    .line 548
    .line 549
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 550
    .line 551
    .line 552
    move-result-object p1

    .line 553
    invoke-virtual {v3, p0, p1}, Lsz0;->N(Ljava/lang/String;Ljava/lang/Float;)V

    .line 554
    .line 555
    .line 556
    const-wide/16 p0, 0x9c4

    .line 557
    .line 558
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V

    .line 559
    .line 560
    .line 561
    invoke-static {}, Lpp1;->d()Lvu0;

    .line 562
    .line 563
    .line 564
    move-result-object p0

    .line 565
    sget-object p1, Lvu0;->i:Lvu0;

    .line 566
    .line 567
    if-ne p0, p1, :cond_b

    .line 568
    .line 569
    invoke-static {}, Lfd3;->b()V

    .line 570
    .line 571
    .line 572
    goto :goto_6

    .line 573
    :cond_b
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 574
    .line 575
    .line 576
    move-result p0

    .line 577
    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    .line 578
    .line 579
    .line 580
    :goto_6
    return-void

    .line 581
    :cond_c
    move-object v0, p0

    .line 582
    check-cast v0, Ljava/lang/Iterable;

    .line 583
    .line 584
    const/4 v4, 0x0

    .line 585
    const/16 v5, 0x3f

    .line 586
    .line 587
    const/4 v1, 0x0

    .line 588
    const/4 v2, 0x0

    .line 589
    const/4 v3, 0x0

    .line 590
    invoke-static/range {v0 .. v5}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object p0

    .line 594
    const-string p1, "Duplicate Dex descriptor ids: "

    .line 595
    .line 596
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object p0

    .line 600
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    return-void

    .line 604
    :cond_d
    const-string p0, "classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)"

    .line 605
    .line 606
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    return-void

    .line 610
    :catch_0
    const-string p0, "This method requires Android runtime"

    .line 611
    .line 612
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    return-void

    .line 616
    :cond_e
    const-string p0, "hostClassLoader"

    .line 617
    .line 618
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    throw v4

    .line 622
    :catchall_1
    move-exception v0

    .line 623
    move-object p0, v0

    .line 624
    goto :goto_7

    .line 625
    :catchall_2
    move-exception v0

    .line 626
    move-object p0, v0

    .line 627
    :try_start_5
    invoke-virtual {v2, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 631
    :goto_7
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 632
    .line 633
    .line 634
    throw p0

    .line 635
    :cond_f
    const-string p0, "Native runtime preparation attempted on main thread"

    .line 636
    .line 637
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    return-void
.end method

.method public static final f(Lxm0;Ln80;Lkw;Lpx;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    move/from16 v8, p4

    .line 8
    .line 9
    move-object/from16 v9, p3

    .line 10
    .line 11
    check-cast v9, Lgo0;

    .line 12
    .line 13
    const v0, 0x3145f7ad

    .line 14
    .line 15
    .line 16
    invoke-virtual {v9, v0}, Lgo0;->X(I)Lgo0;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v0, v8, 0x6

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v9, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x2

    .line 32
    :goto_0
    or-int/2addr v0, v8

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v0, v8

    .line 35
    :goto_1
    and-int/lit8 v3, v8, 0x30

    .line 36
    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    invoke-virtual {v9, v2}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    const/16 v3, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v3, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v0, v3

    .line 51
    :cond_3
    and-int/lit16 v3, v8, 0x180

    .line 52
    .line 53
    if-nez v3, :cond_5

    .line 54
    .line 55
    invoke-virtual {v9, v7}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    const/16 v3, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v3, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v0, v3

    .line 67
    :cond_5
    move v12, v0

    .line 68
    and-int/lit16 v0, v12, 0x93

    .line 69
    .line 70
    const/16 v3, 0x92

    .line 71
    .line 72
    const/4 v13, 0x1

    .line 73
    const/4 v14, 0x0

    .line 74
    if-eq v0, v3, :cond_6

    .line 75
    .line 76
    move v0, v13

    .line 77
    goto :goto_4

    .line 78
    :cond_6
    move v0, v14

    .line 79
    :goto_4
    and-int/lit8 v3, v12, 0x1

    .line 80
    .line 81
    invoke-virtual {v9, v3, v0}, Lgo0;->O(IZ)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_10

    .line 86
    .line 87
    sget-object v0, Lr7;->f:Ltu2;

    .line 88
    .line 89
    invoke-virtual {v9, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    move-object v3, v0

    .line 94
    check-cast v3, Landroid/view/View;

    .line 95
    .line 96
    sget-object v0, Lly;->h:Ltu2;

    .line 97
    .line 98
    invoke-virtual {v9, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    move-object v5, v0

    .line 103
    check-cast v5, Le70;

    .line 104
    .line 105
    sget-object v0, Lly;->n:Ltu2;

    .line 106
    .line 107
    invoke-virtual {v9, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    move-object v4, v0

    .line 112
    check-cast v4, Ld61;

    .line 113
    .line 114
    invoke-static {v9}, Lrg3;->L(Lpx;)Leo0;

    .line 115
    .line 116
    .line 117
    move-result-object v15

    .line 118
    invoke-static {v7, v9}, Lop0;->x(Ljava/lang/Object;Lpx;)Lxk1;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-array v6, v14, [Ljava/lang/Object;

    .line 123
    .line 124
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    sget-object v10, Lnx;->a:Leb;

    .line 129
    .line 130
    if-ne v11, v10, :cond_7

    .line 131
    .line 132
    sget-object v11, Lq7;->o:Lq7;

    .line 133
    .line 134
    invoke-virtual {v9, v11}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    check-cast v11, Lxm0;

    .line 138
    .line 139
    const/16 v14, 0x30

    .line 140
    .line 141
    invoke-static {v6, v11, v9, v14}, Lgf1;->M([Ljava/lang/Object;Lxm0;Lpx;I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    check-cast v6, Ljava/util/UUID;

    .line 146
    .line 147
    iget v11, v2, Ln80;->g:I

    .line 148
    .line 149
    invoke-virtual {v9, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    invoke-virtual {v9, v5}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v16

    .line 157
    or-int v14, v14, v16

    .line 158
    .line 159
    invoke-virtual {v9, v11}, Lgo0;->d(I)Z

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    or-int/2addr v11, v14

    .line 164
    const/4 v14, 0x0

    .line 165
    invoke-virtual {v9, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    or-int/2addr v11, v14

    .line 170
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v14

    .line 174
    if-nez v11, :cond_8

    .line 175
    .line 176
    if-ne v14, v10, :cond_9

    .line 177
    .line 178
    :cond_8
    move-object v11, v0

    .line 179
    new-instance v0, Lp80;

    .line 180
    .line 181
    invoke-direct/range {v0 .. v6}, Lp80;-><init>(Lxm0;Ln80;Landroid/view/View;Ld61;Le70;Ljava/util/UUID;)V

    .line 182
    .line 183
    .line 184
    new-instance v3, Ln2;

    .line 185
    .line 186
    invoke-direct {v3, v13, v11}, Ln2;-><init>(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    new-instance v5, Lkw;

    .line 190
    .line 191
    const v6, -0x4fce98d3

    .line 192
    .line 193
    .line 194
    invoke-direct {v5, v6, v13, v3}, Lkw;-><init>(IZLun0;)V

    .line 195
    .line 196
    .line 197
    iget-object v3, v0, Lp80;->o:Lm80;

    .line 198
    .line 199
    invoke-virtual {v3, v15}, Lo2;->setParentCompositionContext(Lyx;)V

    .line 200
    .line 201
    .line 202
    iget-object v6, v3, Lm80;->r:Lnx1;

    .line 203
    .line 204
    invoke-virtual {v6, v5}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    iput-boolean v13, v3, Lm80;->v:Z

    .line 208
    .line 209
    invoke-virtual {v3}, Lo2;->e()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v9, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    move-object v14, v0

    .line 216
    :cond_9
    check-cast v14, Lp80;

    .line 217
    .line 218
    invoke-virtual {v9, v14}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    if-nez v0, :cond_b

    .line 227
    .line 228
    if-ne v3, v10, :cond_a

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_a
    const/4 v0, 0x0

    .line 232
    goto :goto_6

    .line 233
    :cond_b
    :goto_5
    new-instance v3, Lg8;

    .line 234
    .line 235
    const/4 v0, 0x0

    .line 236
    invoke-direct {v3, v14, v0}, Lg8;-><init>(Lp80;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v9, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :goto_6
    check-cast v3, Lin0;

    .line 243
    .line 244
    invoke-static {v14, v3, v9}, Leu;->c(Ljava/lang/Object;Lin0;Lpx;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v9, v14}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    and-int/lit8 v5, v12, 0xe

    .line 252
    .line 253
    const/4 v6, 0x4

    .line 254
    if-ne v5, v6, :cond_c

    .line 255
    .line 256
    move v5, v13

    .line 257
    goto :goto_7

    .line 258
    :cond_c
    move v5, v0

    .line 259
    :goto_7
    or-int/2addr v3, v5

    .line 260
    and-int/lit8 v5, v12, 0x70

    .line 261
    .line 262
    const/16 v6, 0x20

    .line 263
    .line 264
    if-ne v5, v6, :cond_d

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_d
    move v13, v0

    .line 268
    :goto_8
    or-int v0, v3, v13

    .line 269
    .line 270
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    invoke-virtual {v9, v3}, Lgo0;->d(I)Z

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    or-int/2addr v0, v3

    .line 279
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    if-nez v0, :cond_e

    .line 284
    .line 285
    if-ne v3, v10, :cond_f

    .line 286
    .line 287
    :cond_e
    new-instance v3, Lh8;

    .line 288
    .line 289
    invoke-direct {v3, v14, v1, v2, v4}, Lh8;-><init>(Lp80;Lxm0;Ln80;Ld61;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v9, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_f
    check-cast v3, Lxm0;

    .line 296
    .line 297
    invoke-static {v3, v9}, Leu;->r(Lxm0;Lpx;)V

    .line 298
    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_10
    invoke-virtual {v9}, Lgo0;->R()V

    .line 302
    .line 303
    .line 304
    :goto_9
    invoke-virtual {v9}, Lgo0;->r()Lb62;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    if-eqz v6, :cond_11

    .line 309
    .line 310
    new-instance v0, Li8;

    .line 311
    .line 312
    const/4 v5, 0x0

    .line 313
    move-object v3, v7

    .line 314
    move v4, v8

    .line 315
    invoke-direct/range {v0 .. v5}, Li8;-><init>(Lun0;Ljava/lang/Object;Lun0;II)V

    .line 316
    .line 317
    .line 318
    iput-object v0, v6, Lb62;->d:Lmn0;

    .line 319
    .line 320
    :cond_11
    return-void
.end method

.method public static f0(JI)J
    .locals 2

    .line 1
    and-int/lit8 p2, p2, 0x7

    .line 2
    .line 3
    shl-int/lit8 p2, p2, 0x3

    .line 4
    .line 5
    shl-long v0, p0, p2

    .line 6
    .line 7
    rsub-int/lit8 p2, p2, 0x40

    .line 8
    .line 9
    ushr-long/2addr p0, p2

    .line 10
    or-long/2addr p0, v0

    .line 11
    return-wide p0
.end method

.method public static final g(ZLin0;Luh1;ZLpx;I)V
    .locals 18

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object/from16 v0, p4

    .line 9
    .line 10
    check-cast v0, Lgo0;

    .line 11
    .line 12
    const v3, -0x4c52b14e

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v3}, Lgo0;->X(I)Lgo0;

    .line 16
    .line 17
    .line 18
    and-int/lit8 v3, p5, 0x6

    .line 19
    .line 20
    const/4 v4, 0x4

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lgo0;->g(Z)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    move v3, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v3, 0x2

    .line 32
    :goto_0
    or-int v3, p5, v3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move/from16 v3, p5

    .line 36
    .line 37
    :goto_1
    and-int/lit8 v5, p5, 0x30

    .line 38
    .line 39
    if-nez v5, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    const/16 v5, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v5, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v3, v5

    .line 53
    :cond_3
    or-int/lit16 v5, v3, 0x6d80

    .line 54
    .line 55
    const/high16 v7, 0x30000

    .line 56
    .line 57
    and-int v7, p5, v7

    .line 58
    .line 59
    if-nez v7, :cond_4

    .line 60
    .line 61
    const v5, 0x16d80

    .line 62
    .line 63
    .line 64
    or-int/2addr v5, v3

    .line 65
    :cond_4
    const v3, 0x12493

    .line 66
    .line 67
    .line 68
    and-int/2addr v3, v5

    .line 69
    const v7, 0x12492

    .line 70
    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    if-eq v3, v7, :cond_5

    .line 74
    .line 75
    const/4 v3, 0x1

    .line 76
    goto :goto_3

    .line 77
    :cond_5
    move v3, v9

    .line 78
    :goto_3
    and-int/lit8 v7, v5, 0x1

    .line 79
    .line 80
    invoke-virtual {v0, v7, v3}, Lgo0;->O(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_15

    .line 85
    .line 86
    invoke-virtual {v0}, Lgo0;->T()V

    .line 87
    .line 88
    .line 89
    and-int/lit8 v3, p5, 0x1

    .line 90
    .line 91
    sget-object v7, Lrh1;->a:Lrh1;

    .line 92
    .line 93
    const v10, -0x70001

    .line 94
    .line 95
    .line 96
    if-eqz v3, :cond_7

    .line 97
    .line 98
    invoke-virtual {v0}, Lgo0;->y()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    invoke-virtual {v0}, Lgo0;->R()V

    .line 106
    .line 107
    .line 108
    and-int v3, v5, v10

    .line 109
    .line 110
    move/from16 v5, p3

    .line 111
    .line 112
    move v10, v3

    .line 113
    move-object/from16 v3, p2

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_7
    :goto_4
    and-int v3, v5, v10

    .line 117
    .line 118
    move v10, v3

    .line 119
    move-object v3, v7

    .line 120
    const/4 v5, 0x1

    .line 121
    :goto_5
    invoke-virtual {v0}, Lgo0;->q()V

    .line 122
    .line 123
    .line 124
    sget-object v11, Lly;->l:Ltu2;

    .line 125
    .line 126
    invoke-virtual {v0, v11}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    check-cast v11, Lbs0;

    .line 131
    .line 132
    const v12, 0x7d949784

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v12}, Lgo0;->W(I)V

    .line 136
    .line 137
    .line 138
    sget-object v12, Lur1;->b:Lmy;

    .line 139
    .line 140
    invoke-virtual {v0, v12}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    check-cast v12, Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    invoke-virtual {v0, v9}, Lgo0;->p(Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    sget-object v14, Lnx;->a:Leb;

    .line 158
    .line 159
    if-ne v13, v14, :cond_8

    .line 160
    .line 161
    new-instance v13, Lbk1;

    .line 162
    .line 163
    invoke-direct {v13}, Lbk1;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v13}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_8
    check-cast v13, Lbk1;

    .line 170
    .line 171
    invoke-static {v13, v0}, Lrg3;->t(Lbk1;Lpx;)Lxk1;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    if-eqz v1, :cond_9

    .line 176
    .line 177
    const/high16 v6, 0x3f800000    # 1.0f

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_9
    const/16 v16, 0x0

    .line 181
    .line 182
    move/from16 v6, v16

    .line 183
    .line 184
    :goto_6
    const v9, 0x44bb8000    # 1500.0f

    .line 185
    .line 186
    .line 187
    const/high16 v8, 0x3f000000    # 0.5f

    .line 188
    .line 189
    move/from16 p3, v10

    .line 190
    .line 191
    const/4 v10, 0x0

    .line 192
    if-eqz v1, :cond_a

    .line 193
    .line 194
    invoke-static {v8, v9, v10, v4}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 195
    .line 196
    .line 197
    move-result-object v17

    .line 198
    move-object/from16 v8, v17

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_a
    const v8, 0x461c4000    # 10000.0f

    .line 202
    .line 203
    .line 204
    const/high16 v9, 0x3f800000    # 1.0f

    .line 205
    .line 206
    invoke-static {v9, v8, v10, v4}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    :goto_7
    const-string v9, "NukeCheckboxGeometryAnim"

    .line 211
    .line 212
    const/16 v4, 0xc00

    .line 213
    .line 214
    invoke-static {v6, v8, v9, v0, v4}, Luc;->b(FLfj0;Ljava/lang/String;Lpx;I)Lgu2;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-interface {v15}, Lgu2;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    check-cast v6, Ljava/lang/Boolean;

    .line 223
    .line 224
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-eqz v6, :cond_b

    .line 229
    .line 230
    if-eqz v5, :cond_b

    .line 231
    .line 232
    const v8, 0x3f666666    # 0.9f

    .line 233
    .line 234
    .line 235
    :goto_8
    const v6, 0x44bb8000    # 1500.0f

    .line 236
    .line 237
    .line 238
    :goto_9
    const/high16 v9, 0x3f000000    # 0.5f

    .line 239
    .line 240
    const/4 v15, 0x4

    .line 241
    goto :goto_a

    .line 242
    :cond_b
    if-eqz v1, :cond_c

    .line 243
    .line 244
    const v8, 0x3f851eb8    # 1.04f

    .line 245
    .line 246
    .line 247
    goto :goto_8

    .line 248
    :cond_c
    const v6, 0x44bb8000    # 1500.0f

    .line 249
    .line 250
    .line 251
    const/high16 v8, 0x3f800000    # 1.0f

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :goto_a
    invoke-static {v9, v6, v10, v15}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    const-string v9, "NukeCheckboxPressScale"

    .line 259
    .line 260
    const/16 v15, 0xc30

    .line 261
    .line 262
    invoke-static {v8, v6, v9, v0, v15}, Luc;->b(FLfj0;Ljava/lang/String;Lpx;I)Lgu2;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    if-nez v5, :cond_d

    .line 267
    .line 268
    const v8, 0x7d9527c5

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v8}, Lgo0;->W(I)V

    .line 272
    .line 273
    .line 274
    sget-object v8, Lur1;->a:Ltu2;

    .line 275
    .line 276
    invoke-virtual {v0, v8}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    check-cast v8, Llp1;

    .line 281
    .line 282
    iget-wide v8, v8, Llp1;->f:J

    .line 283
    .line 284
    const v15, 0x3d4ccccd    # 0.05f

    .line 285
    .line 286
    .line 287
    invoke-static {v15, v8, v9}, Lju;->b(FJ)J

    .line 288
    .line 289
    .line 290
    move-result-wide v8

    .line 291
    const/4 v15, 0x0

    .line 292
    invoke-virtual {v0, v15}, Lgo0;->p(Z)V

    .line 293
    .line 294
    .line 295
    goto :goto_b

    .line 296
    :cond_d
    const/4 v15, 0x0

    .line 297
    if-eqz v1, :cond_e

    .line 298
    .line 299
    const v8, 0x7d953025

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0, v8}, Lgo0;->W(I)V

    .line 303
    .line 304
    .line 305
    sget-object v8, Lur1;->a:Ltu2;

    .line 306
    .line 307
    invoke-virtual {v0, v8}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    check-cast v8, Llp1;

    .line 312
    .line 313
    iget-wide v8, v8, Llp1;->g:J

    .line 314
    .line 315
    const v10, 0x3e0f5c29    # 0.14f

    .line 316
    .line 317
    .line 318
    invoke-static {v10, v8, v9}, Lju;->b(FJ)J

    .line 319
    .line 320
    .line 321
    move-result-wide v8

    .line 322
    invoke-virtual {v0, v15}, Lgo0;->p(Z)V

    .line 323
    .line 324
    .line 325
    goto :goto_b

    .line 326
    :cond_e
    const v8, 0x7d953905

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v8}, Lgo0;->W(I)V

    .line 330
    .line 331
    .line 332
    sget-object v8, Lur1;->a:Ltu2;

    .line 333
    .line 334
    invoke-virtual {v0, v8}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    check-cast v8, Llp1;

    .line 339
    .line 340
    iget-wide v8, v8, Llp1;->f:J

    .line 341
    .line 342
    const v10, 0x3dcccccd    # 0.1f

    .line 343
    .line 344
    .line 345
    invoke-static {v10, v8, v9}, Lju;->b(FJ)J

    .line 346
    .line 347
    .line 348
    move-result-wide v8

    .line 349
    invoke-virtual {v0, v15}, Lgo0;->p(Z)V

    .line 350
    .line 351
    .line 352
    :goto_b
    const/16 v10, 0x96

    .line 353
    .line 354
    const/4 v15, 0x6

    .line 355
    move-object/from16 v17, v4

    .line 356
    .line 357
    const/4 v4, 0x0

    .line 358
    invoke-static {v10, v4, v15}, Lup0;->J(ILgd0;I)Lm43;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    const-string v10, "NukeCheckboxContainerColor"

    .line 363
    .line 364
    invoke-static {v8, v9, v4, v10, v0}, Lar2;->a(JLm43;Ljava/lang/String;Lpx;)Lgu2;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    new-instance v8, Lkr1;

    .line 369
    .line 370
    const/high16 v9, 0x40c00000    # 6.0f

    .line 371
    .line 372
    invoke-direct {v8, v9}, Lkr1;-><init>(F)V

    .line 373
    .line 374
    .line 375
    new-instance v9, Lkr1;

    .line 376
    .line 377
    const/high16 v10, 0x40400000    # 3.0f

    .line 378
    .line 379
    invoke-direct {v9, v10}, Lkr1;-><init>(F)V

    .line 380
    .line 381
    .line 382
    const/high16 v10, 0x41a00000    # 20.0f

    .line 383
    .line 384
    invoke-static {v3, v10}, Lte;->g0(Luh1;F)Luh1;

    .line 385
    .line 386
    .line 387
    move-result-object v10

    .line 388
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    check-cast v6, Ljava/lang/Number;

    .line 393
    .line 394
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 395
    .line 396
    .line 397
    move-result v6

    .line 398
    invoke-static {v10, v6}, Lpp0;->E(Luh1;F)Luh1;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    invoke-static {v6, v8}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    invoke-interface {v4}, Lgu2;->getValue()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    check-cast v4, Lju;

    .line 411
    .line 412
    move-object v8, v3

    .line 413
    iget-wide v3, v4, Lju;->a:J

    .line 414
    .line 415
    sget-object v10, Lsp0;->h:Liu0;

    .line 416
    .line 417
    invoke-static {v6, v3, v4, v10}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    invoke-virtual {v0, v12}, Lgo0;->g(Z)Z

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    invoke-virtual {v0, v11}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v6

    .line 429
    or-int/2addr v4, v6

    .line 430
    const/4 v15, 0x0

    .line 431
    invoke-virtual {v0, v15}, Lgo0;->d(I)Z

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    or-int/2addr v4, v6

    .line 436
    and-int/lit8 v6, p3, 0x70

    .line 437
    .line 438
    const/16 v10, 0x20

    .line 439
    .line 440
    if-ne v6, v10, :cond_f

    .line 441
    .line 442
    const/4 v6, 0x1

    .line 443
    goto :goto_c

    .line 444
    :cond_f
    const/4 v6, 0x0

    .line 445
    :goto_c
    or-int/2addr v4, v6

    .line 446
    and-int/lit8 v6, p3, 0xe

    .line 447
    .line 448
    const/4 v15, 0x4

    .line 449
    if-ne v6, v15, :cond_10

    .line 450
    .line 451
    const/4 v6, 0x1

    .line 452
    goto :goto_d

    .line 453
    :cond_10
    const/4 v6, 0x0

    .line 454
    :goto_d
    or-int/2addr v4, v6

    .line 455
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v6

    .line 459
    if-nez v4, :cond_11

    .line 460
    .line 461
    if-ne v6, v14, :cond_12

    .line 462
    .line 463
    :cond_11
    new-instance v6, Luo1;

    .line 464
    .line 465
    invoke-direct {v6, v12, v11, v2, v1}, Luo1;-><init>(ZLbs0;Lin0;Z)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    :cond_12
    check-cast v6, Lxm0;

    .line 472
    .line 473
    invoke-static {v3, v13, v5, v6}, Lte;->r(Luh1;Lbk1;ZLxm0;)Luh1;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    sget-object v4, Lsn;->n:Lrk;

    .line 478
    .line 479
    const/4 v15, 0x0

    .line 480
    invoke-static {v4, v15}, Ldm;->d(Lr5;Z)Lnf1;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    iget-wide v10, v0, Lgo0;->T:J

    .line 485
    .line 486
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    invoke-virtual {v0}, Lgo0;->l()Lyy1;

    .line 491
    .line 492
    .line 493
    move-result-object v10

    .line 494
    invoke-static {v0, v3}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    sget-object v11, Lhx;->c:Lgx;

    .line 499
    .line 500
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    sget-object v11, Lgx;->b:Ljy;

    .line 504
    .line 505
    invoke-virtual {v0}, Lgo0;->Z()V

    .line 506
    .line 507
    .line 508
    iget-boolean v12, v0, Lgo0;->S:Z

    .line 509
    .line 510
    if-eqz v12, :cond_13

    .line 511
    .line 512
    invoke-virtual {v0, v11}, Lgo0;->k(Lxm0;)V

    .line 513
    .line 514
    .line 515
    goto :goto_e

    .line 516
    :cond_13
    invoke-virtual {v0}, Lgo0;->i0()V

    .line 517
    .line 518
    .line 519
    :goto_e
    sget-object v11, Lgx;->e:Llc;

    .line 520
    .line 521
    invoke-static {v0, v11, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    sget-object v4, Lgx;->d:Llc;

    .line 525
    .line 526
    invoke-static {v0, v4, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    sget-object v6, Lgx;->f:Llc;

    .line 534
    .line 535
    invoke-static {v0, v6, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    sget-object v4, Lgx;->g:Lv6;

    .line 539
    .line 540
    invoke-static {v0, v4}, Lyf3;->b(Lpx;Lin0;)V

    .line 541
    .line 542
    .line 543
    sget-object v4, Lgx;->c:Llc;

    .line 544
    .line 545
    invoke-static {v0, v4, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    const/high16 v3, 0x41400000    # 12.0f

    .line 549
    .line 550
    invoke-static {v7, v3}, Lte;->g0(Luh1;F)Luh1;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    invoke-interface/range {v17 .. v17}, Lgu2;->getValue()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    check-cast v4, Ljava/lang/Number;

    .line 559
    .line 560
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    invoke-static {v3, v4}, Lpp0;->E(Luh1;F)Luh1;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    if-eqz v5, :cond_14

    .line 569
    .line 570
    const v4, -0x5e329802

    .line 571
    .line 572
    .line 573
    invoke-virtual {v0, v4}, Lgo0;->W(I)V

    .line 574
    .line 575
    .line 576
    sget-object v4, Lur1;->a:Ltu2;

    .line 577
    .line 578
    invoke-virtual {v0, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    check-cast v4, Llp1;

    .line 583
    .line 584
    iget-wide v6, v4, Llp1;->g:J

    .line 585
    .line 586
    const/4 v15, 0x0

    .line 587
    :goto_f
    invoke-virtual {v0, v15}, Lgo0;->p(Z)V

    .line 588
    .line 589
    .line 590
    goto :goto_10

    .line 591
    :cond_14
    const/4 v15, 0x0

    .line 592
    const v4, -0x5e32945b

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0, v4}, Lgo0;->W(I)V

    .line 596
    .line 597
    .line 598
    sget-object v4, Lur1;->a:Ltu2;

    .line 599
    .line 600
    invoke-virtual {v0, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v4

    .line 604
    check-cast v4, Llp1;

    .line 605
    .line 606
    iget-wide v6, v4, Llp1;->f:J

    .line 607
    .line 608
    goto :goto_f

    .line 609
    :goto_10
    invoke-static {v3, v6, v7, v9}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    invoke-static {v3, v0, v15}, Ldm;->a(Luh1;Lpx;I)V

    .line 614
    .line 615
    .line 616
    const/4 v3, 0x1

    .line 617
    invoke-virtual {v0, v3}, Lgo0;->p(Z)V

    .line 618
    .line 619
    .line 620
    move v4, v5

    .line 621
    move-object v3, v8

    .line 622
    goto :goto_11

    .line 623
    :cond_15
    invoke-virtual {v0}, Lgo0;->R()V

    .line 624
    .line 625
    .line 626
    move-object/from16 v3, p2

    .line 627
    .line 628
    move/from16 v4, p3

    .line 629
    .line 630
    :goto_11
    invoke-virtual {v0}, Lgo0;->r()Lb62;

    .line 631
    .line 632
    .line 633
    move-result-object v6

    .line 634
    if-eqz v6, :cond_16

    .line 635
    .line 636
    new-instance v0, Lvo1;

    .line 637
    .line 638
    move/from16 v5, p5

    .line 639
    .line 640
    invoke-direct/range {v0 .. v5}, Lvo1;-><init>(ZLin0;Luh1;ZI)V

    .line 641
    .line 642
    .line 643
    iput-object v0, v6, Lb62;->d:Lmn0;

    .line 644
    .line 645
    :cond_16
    return-void
.end method

.method public static final g0(Luh1;F)Luh1;
    .locals 6

    .line 1
    new-instance v0, Lkr2;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    move v2, p1

    .line 5
    move v3, p1

    .line 6
    move v4, p1

    .line 7
    move v1, p1

    .line 8
    invoke-direct/range {v0 .. v5}, Lkr2;-><init>(FFFFZ)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final h(Ljava/util/List;Lpx;I)V
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v2, Lsn;->u:Lpk;

    .line 4
    .line 5
    move-object/from16 v10, p1

    .line 6
    .line 7
    check-cast v10, Lgo0;

    .line 8
    .line 9
    const v3, -0x745b7a61

    .line 10
    .line 11
    .line 12
    invoke-virtual {v10, v3}, Lgo0;->X(I)Lgo0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v10, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v14, 0x2

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v14

    .line 25
    :goto_0
    or-int v3, p2, v3

    .line 26
    .line 27
    and-int/lit8 v4, v3, 0x3

    .line 28
    .line 29
    const/4 v15, 0x1

    .line 30
    const/4 v5, 0x0

    .line 31
    if-eq v4, v14, :cond_1

    .line 32
    .line 33
    move v4, v15

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v4, v5

    .line 36
    :goto_1
    and-int/2addr v3, v15

    .line 37
    invoke-virtual {v10, v3, v4}, Lgo0;->O(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_10

    .line 42
    .line 43
    sget-object v3, Lr7;->b:Ltu2;

    .line 44
    .line 45
    invoke-virtual {v10, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Landroid/content/Context;

    .line 50
    .line 51
    invoke-virtual {v10}, Lgo0;->L()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    sget-object v6, Lnx;->a:Leb;

    .line 56
    .line 57
    const/16 v16, 0x0

    .line 58
    .line 59
    if-ne v4, v6, :cond_2

    .line 60
    .line 61
    invoke-static/range {v16 .. v16}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v10, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    check-cast v4, Lxk1;

    .line 69
    .line 70
    sget-object v7, Ltp0;->c:Lvf;

    .line 71
    .line 72
    invoke-static {v7, v2, v10, v5}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    iget-wide v8, v10, Lgo0;->T:J

    .line 77
    .line 78
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    invoke-virtual {v10}, Lgo0;->l()Lyy1;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    sget-object v11, Lte;->e:Lyi0;

    .line 87
    .line 88
    invoke-static {v10, v11}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    sget-object v17, Lhx;->c:Lgx;

    .line 93
    .line 94
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object v13, Lgx;->b:Ljy;

    .line 98
    .line 99
    invoke-virtual {v10}, Lgo0;->Z()V

    .line 100
    .line 101
    .line 102
    iget-boolean v14, v10, Lgo0;->S:Z

    .line 103
    .line 104
    if-eqz v14, :cond_3

    .line 105
    .line 106
    invoke-virtual {v10, v13}, Lgo0;->k(Lxm0;)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    invoke-virtual {v10}, Lgo0;->i0()V

    .line 111
    .line 112
    .line 113
    :goto_2
    sget-object v13, Lgx;->e:Llc;

    .line 114
    .line 115
    invoke-static {v10, v13, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object v7, Lgx;->d:Llc;

    .line 119
    .line 120
    invoke-static {v10, v7, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    sget-object v8, Lgx;->f:Llc;

    .line 128
    .line 129
    invoke-static {v10, v8, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object v7, Lgx;->g:Lv6;

    .line 133
    .line 134
    invoke-static {v10, v7}, Lyf3;->b(Lpx;Lin0;)V

    .line 135
    .line 136
    .line 137
    sget-object v7, Lgx;->c:Llc;

    .line 138
    .line 139
    invoke-static {v10, v7, v12}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    const v7, 0x29091eb3

    .line 143
    .line 144
    .line 145
    invoke-virtual {v10, v7}, Lgo0;->W(I)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    move v14, v5

    .line 153
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    if-eqz v7, :cond_b

    .line 158
    .line 159
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    add-int/lit8 v18, v14, 0x1

    .line 164
    .line 165
    if-ltz v14, :cond_a

    .line 166
    .line 167
    check-cast v7, Lp1;

    .line 168
    .line 169
    iget-object v8, v7, Lp1;->c:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v8}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    sget-object v9, Lrh1;->a:Lrh1;

    .line 176
    .line 177
    if-eqz v8, :cond_4

    .line 178
    .line 179
    const v8, -0x2d544755

    .line 180
    .line 181
    .line 182
    invoke-virtual {v10, v8}, Lgo0;->W(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v10, v5}, Lgo0;->p(Z)V

    .line 186
    .line 187
    .line 188
    move-object v8, v9

    .line 189
    goto :goto_4

    .line 190
    :cond_4
    const v8, -0x2d537d59

    .line 191
    .line 192
    .line 193
    invoke-virtual {v10, v8}, Lgo0;->W(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v10, v7}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    invoke-virtual {v10}, Lgo0;->L()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    if-nez v8, :cond_5

    .line 205
    .line 206
    if-ne v12, v6, :cond_6

    .line 207
    .line 208
    :cond_5
    new-instance v12, Lr1;

    .line 209
    .line 210
    invoke-direct {v12, v5, v7, v4}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v10, v12}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    :cond_6
    check-cast v12, Lxm0;

    .line 217
    .line 218
    invoke-static {v9, v12}, Ltl;->O(Luh1;Lxm0;)Luh1;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    invoke-virtual {v10, v5}, Lgo0;->p(Z)V

    .line 223
    .line 224
    .line 225
    :goto_4
    invoke-interface {v11, v8}, Luh1;->c(Luh1;)Luh1;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    const/high16 v12, 0x41800000    # 16.0f

    .line 230
    .line 231
    const/high16 v15, 0x41500000    # 13.0f

    .line 232
    .line 233
    invoke-static {v8, v12, v15}, Lfg1;->D(Luh1;FF)Luh1;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    sget-object v12, Lsn;->t:Lqk;

    .line 238
    .line 239
    sget-object v15, Ltp0;->a:Luf;

    .line 240
    .line 241
    const/16 v5, 0x30

    .line 242
    .line 243
    invoke-static {v15, v12, v10, v5}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    move-object v12, v3

    .line 248
    move-object v15, v4

    .line 249
    iget-wide v3, v10, Lgo0;->T:J

    .line 250
    .line 251
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    invoke-virtual {v10}, Lgo0;->l()Lyy1;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    invoke-static {v10, v8}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    sget-object v20, Lhx;->c:Lgx;

    .line 264
    .line 265
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move/from16 v20, v3

    .line 269
    .line 270
    sget-object v3, Lgx;->b:Ljy;

    .line 271
    .line 272
    invoke-virtual {v10}, Lgo0;->Z()V

    .line 273
    .line 274
    .line 275
    move-object/from16 v21, v6

    .line 276
    .line 277
    iget-boolean v6, v10, Lgo0;->S:Z

    .line 278
    .line 279
    if-eqz v6, :cond_7

    .line 280
    .line 281
    invoke-virtual {v10, v3}, Lgo0;->k(Lxm0;)V

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_7
    invoke-virtual {v10}, Lgo0;->i0()V

    .line 286
    .line 287
    .line 288
    :goto_5
    sget-object v6, Lgx;->e:Llc;

    .line 289
    .line 290
    invoke-static {v10, v6, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    sget-object v5, Lgx;->d:Llc;

    .line 294
    .line 295
    invoke-static {v10, v5, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    move-object/from16 v20, v11

    .line 303
    .line 304
    sget-object v11, Lgx;->f:Llc;

    .line 305
    .line 306
    invoke-static {v10, v11, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    sget-object v4, Lgx;->g:Lv6;

    .line 310
    .line 311
    invoke-static {v10, v4}, Lyf3;->b(Lpx;Lin0;)V

    .line 312
    .line 313
    .line 314
    move-object/from16 v22, v12

    .line 315
    .line 316
    sget-object v12, Lgx;->c:Llc;

    .line 317
    .line 318
    invoke-static {v10, v12, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    const/4 v8, 0x0

    .line 322
    invoke-static {v7, v10, v8}, Lte;->j(Lp1;Lpx;I)V

    .line 323
    .line 324
    .line 325
    const/high16 v8, 0x41400000    # 12.0f

    .line 326
    .line 327
    invoke-static {v9, v8}, Lte;->q0(Luh1;F)Luh1;

    .line 328
    .line 329
    .line 330
    move-result-object v8

    .line 331
    invoke-static {v10, v8}, Lrp0;->O(Lpx;Luh1;)V

    .line 332
    .line 333
    .line 334
    new-instance v8, Lg71;

    .line 335
    .line 336
    const/high16 v9, 0x3f800000    # 1.0f

    .line 337
    .line 338
    move-object/from16 v23, v13

    .line 339
    .line 340
    const/4 v13, 0x1

    .line 341
    invoke-direct {v8, v9, v13}, Lg71;-><init>(FZ)V

    .line 342
    .line 343
    .line 344
    new-instance v9, Lxf;

    .line 345
    .line 346
    new-instance v13, Ls;

    .line 347
    .line 348
    move-object/from16 v24, v15

    .line 349
    .line 350
    const/4 v15, 0x2

    .line 351
    invoke-direct {v13, v15}, Ls;-><init>(I)V

    .line 352
    .line 353
    .line 354
    const/high16 v15, 0x40400000    # 3.0f

    .line 355
    .line 356
    invoke-direct {v9, v15, v13}, Lxf;-><init>(FLs;)V

    .line 357
    .line 358
    .line 359
    const/4 v13, 0x6

    .line 360
    invoke-static {v9, v2, v10, v13}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 361
    .line 362
    .line 363
    move-result-object v9

    .line 364
    move v15, v14

    .line 365
    iget-wide v13, v10, Lgo0;->T:J

    .line 366
    .line 367
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 368
    .line 369
    .line 370
    move-result v13

    .line 371
    invoke-virtual {v10}, Lgo0;->l()Lyy1;

    .line 372
    .line 373
    .line 374
    move-result-object v14

    .line 375
    invoke-static {v10, v8}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    invoke-virtual {v10}, Lgo0;->Z()V

    .line 380
    .line 381
    .line 382
    move-object/from16 v25, v2

    .line 383
    .line 384
    iget-boolean v2, v10, Lgo0;->S:Z

    .line 385
    .line 386
    if-eqz v2, :cond_8

    .line 387
    .line 388
    invoke-virtual {v10, v3}, Lgo0;->k(Lxm0;)V

    .line 389
    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_8
    invoke-virtual {v10}, Lgo0;->i0()V

    .line 393
    .line 394
    .line 395
    :goto_6
    invoke-static {v10, v6, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    invoke-static {v10, v5, v14}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    invoke-static {v13, v10, v11, v10, v4}, Lvi0;->q(ILgo0;Llc;Lgo0;Lv6;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v10, v12, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    iget-object v3, v7, Lp1;->a:Ljava/lang/String;

    .line 408
    .line 409
    sget-object v2, Lur1;->a:Ltu2;

    .line 410
    .line 411
    invoke-virtual {v10, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    check-cast v4, Llp1;

    .line 416
    .line 417
    iget-wide v4, v4, Llp1;->e:J

    .line 418
    .line 419
    const/16 v6, 0xe

    .line 420
    .line 421
    invoke-static {v6}, Lrg3;->D(I)J

    .line 422
    .line 423
    .line 424
    move-result-wide v29

    .line 425
    const/16 v6, 0x12

    .line 426
    .line 427
    invoke-static {v6}, Lrg3;->D(I)J

    .line 428
    .line 429
    .line 430
    move-result-wide v35

    .line 431
    sget-object v31, Lim0;->l:Lim0;

    .line 432
    .line 433
    new-instance v26, Lm13;

    .line 434
    .line 435
    const/16 v38, 0x0

    .line 436
    .line 437
    const v39, 0xfdfff8

    .line 438
    .line 439
    .line 440
    const-wide/16 v32, 0x0

    .line 441
    .line 442
    const/16 v34, 0x0

    .line 443
    .line 444
    const/16 v37, 0x0

    .line 445
    .line 446
    move-wide/from16 v27, v4

    .line 447
    .line 448
    invoke-direct/range {v26 .. v39}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 449
    .line 450
    .line 451
    move-object/from16 v5, v26

    .line 452
    .line 453
    const v11, 0x186000

    .line 454
    .line 455
    .line 456
    const/16 v12, 0x3aa

    .line 457
    .line 458
    const/4 v4, 0x0

    .line 459
    const/4 v6, 0x2

    .line 460
    move-object v8, v7

    .line 461
    const/4 v7, 0x0

    .line 462
    move-object v9, v8

    .line 463
    const/4 v8, 0x1

    .line 464
    move-object v13, v9

    .line 465
    const/4 v9, 0x0

    .line 466
    move/from16 v19, v15

    .line 467
    .line 468
    move-object/from16 v0, v21

    .line 469
    .line 470
    move-object/from16 v14, v24

    .line 471
    .line 472
    const/4 v1, 0x0

    .line 473
    move-object v15, v13

    .line 474
    move-object/from16 v13, v22

    .line 475
    .line 476
    invoke-static/range {v3 .. v12}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 477
    .line 478
    .line 479
    iget-object v3, v15, Lp1;->b:Ljava/lang/String;

    .line 480
    .line 481
    invoke-virtual {v10, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    check-cast v2, Llp1;

    .line 486
    .line 487
    iget-wide v4, v2, Llp1;->f:J

    .line 488
    .line 489
    const/16 v2, 0xc

    .line 490
    .line 491
    invoke-static {v2}, Lrg3;->D(I)J

    .line 492
    .line 493
    .line 494
    move-result-wide v29

    .line 495
    const/16 v2, 0x11

    .line 496
    .line 497
    invoke-static {v2}, Lrg3;->D(I)J

    .line 498
    .line 499
    .line 500
    move-result-wide v35

    .line 501
    sget-object v31, Lim0;->j:Lim0;

    .line 502
    .line 503
    new-instance v26, Lm13;

    .line 504
    .line 505
    move-wide/from16 v27, v4

    .line 506
    .line 507
    invoke-direct/range {v26 .. v39}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 508
    .line 509
    .line 510
    move-object/from16 v5, v26

    .line 511
    .line 512
    const/4 v4, 0x0

    .line 513
    const/4 v8, 0x2

    .line 514
    invoke-static/range {v3 .. v12}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 515
    .line 516
    .line 517
    const/4 v2, 0x1

    .line 518
    invoke-virtual {v10, v2}, Lgo0;->p(Z)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v10, v2}, Lgo0;->p(Z)V

    .line 522
    .line 523
    .line 524
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    sub-int/2addr v3, v2

    .line 529
    move/from16 v15, v19

    .line 530
    .line 531
    if-ge v15, v3, :cond_9

    .line 532
    .line 533
    const v2, -0x2d37cb6e

    .line 534
    .line 535
    .line 536
    invoke-virtual {v10, v2}, Lgo0;->W(I)V

    .line 537
    .line 538
    .line 539
    const/high16 v2, 0x42800000    # 64.0f

    .line 540
    .line 541
    const/4 v3, 0x6

    .line 542
    invoke-static {v2, v10, v3, v1}, Lci0;->f(FLpx;II)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v10, v1}, Lgo0;->p(Z)V

    .line 546
    .line 547
    .line 548
    goto :goto_7

    .line 549
    :cond_9
    const v2, -0x2d36d76d

    .line 550
    .line 551
    .line 552
    invoke-virtual {v10, v2}, Lgo0;->W(I)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v10, v1}, Lgo0;->p(Z)V

    .line 556
    .line 557
    .line 558
    :goto_7
    move-object v6, v0

    .line 559
    move v5, v1

    .line 560
    move-object v3, v13

    .line 561
    move-object v4, v14

    .line 562
    move/from16 v14, v18

    .line 563
    .line 564
    move-object/from16 v11, v20

    .line 565
    .line 566
    move-object/from16 v13, v23

    .line 567
    .line 568
    move-object/from16 v2, v25

    .line 569
    .line 570
    const/4 v15, 0x1

    .line 571
    move-object/from16 v0, p0

    .line 572
    .line 573
    goto/16 :goto_3

    .line 574
    .line 575
    :cond_a
    invoke-static {}, Leu;->a0()V

    .line 576
    .line 577
    .line 578
    throw v16

    .line 579
    :cond_b
    move-object v13, v3

    .line 580
    move-object v14, v4

    .line 581
    move v1, v5

    .line 582
    move-object v0, v6

    .line 583
    invoke-virtual {v10, v1}, Lgo0;->p(Z)V

    .line 584
    .line 585
    .line 586
    const/4 v2, 0x1

    .line 587
    invoke-virtual {v10, v2}, Lgo0;->p(Z)V

    .line 588
    .line 589
    .line 590
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    check-cast v2, Lrh0;

    .line 595
    .line 596
    if-nez v2, :cond_c

    .line 597
    .line 598
    const v0, 0x5ebd7359

    .line 599
    .line 600
    .line 601
    invoke-virtual {v10, v0}, Lgo0;->W(I)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v10, v1}, Lgo0;->p(Z)V

    .line 605
    .line 606
    .line 607
    goto :goto_8

    .line 608
    :cond_c
    const v3, 0x5ebd735a

    .line 609
    .line 610
    .line 611
    invoke-virtual {v10, v3}, Lgo0;->W(I)V

    .line 612
    .line 613
    .line 614
    const v3, 0x790b011e

    .line 615
    .line 616
    .line 617
    invoke-static {v3, v10}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    iget-object v3, v2, Lrh0;->a:Ljava/lang/String;

    .line 622
    .line 623
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v3

    .line 627
    const v5, 0x790b011c

    .line 628
    .line 629
    .line 630
    invoke-static {v5, v3, v10}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    const v3, 0x790b011d

    .line 635
    .line 636
    .line 637
    invoke-static {v3, v10}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v6

    .line 641
    const v3, 0x790b0111

    .line 642
    .line 643
    .line 644
    invoke-static {v3, v10}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v9

    .line 648
    invoke-virtual {v10}, Lgo0;->L()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v3

    .line 652
    if-ne v3, v0, :cond_d

    .line 653
    .line 654
    new-instance v3, Lf0;

    .line 655
    .line 656
    const/4 v7, 0x4

    .line 657
    invoke-direct {v3, v14, v7}, Lf0;-><init>(Lxk1;I)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v10, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    :cond_d
    check-cast v3, Lxm0;

    .line 664
    .line 665
    invoke-virtual {v10, v13}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v7

    .line 669
    invoke-virtual {v10, v2}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v8

    .line 673
    or-int/2addr v7, v8

    .line 674
    invoke-virtual {v10}, Lgo0;->L()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v8

    .line 678
    if-nez v7, :cond_e

    .line 679
    .line 680
    if-ne v8, v0, :cond_f

    .line 681
    .line 682
    :cond_e
    new-instance v8, Ls1;

    .line 683
    .line 684
    invoke-direct {v8, v13, v2, v14, v1}, Ls1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v10, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    :cond_f
    move-object v7, v8

    .line 691
    check-cast v7, Lxm0;

    .line 692
    .line 693
    const/4 v12, 0x6

    .line 694
    const/16 v13, 0xa0

    .line 695
    .line 696
    const/4 v8, 0x0

    .line 697
    move-object v11, v10

    .line 698
    const/4 v10, 0x0

    .line 699
    invoke-static/range {v3 .. v13}, Lqp0;->c(Lxm0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxm0;Luh1;Ljava/lang/String;Ln80;Lpx;II)V

    .line 700
    .line 701
    .line 702
    move-object v10, v11

    .line 703
    invoke-virtual {v10, v1}, Lgo0;->p(Z)V

    .line 704
    .line 705
    .line 706
    goto :goto_8

    .line 707
    :cond_10
    invoke-virtual {v10}, Lgo0;->R()V

    .line 708
    .line 709
    .line 710
    :goto_8
    invoke-virtual {v10}, Lgo0;->r()Lb62;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    if-eqz v0, :cond_11

    .line 715
    .line 716
    new-instance v1, Lq1;

    .line 717
    .line 718
    const/4 v15, 0x2

    .line 719
    move-object/from16 v2, p0

    .line 720
    .line 721
    move/from16 v3, p2

    .line 722
    .line 723
    invoke-direct {v1, v2, v3, v15}, Lq1;-><init>(Ljava/util/List;II)V

    .line 724
    .line 725
    .line 726
    iput-object v1, v0, Lb62;->d:Lmn0;

    .line 727
    .line 728
    :cond_11
    return-void
.end method

.method public static final h0(Luh1;FF)Luh1;
    .locals 6

    .line 1
    new-instance v0, Lkr2;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    move v3, p1

    .line 5
    move v4, p2

    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Lkr2;-><init>(FFFFZ)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final i(Ljava/lang/String;Lpx;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v9, p1

    .line 6
    .line 7
    check-cast v9, Lgo0;

    .line 8
    .line 9
    const v2, -0x6be8a139

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v2}, Lgo0;->X(I)Lgo0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v9, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v12, 0x2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v12

    .line 25
    :goto_0
    or-int/2addr v2, v1

    .line 26
    and-int/lit8 v3, v2, 0x3

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v13, 0x1

    .line 30
    if-eq v3, v12, :cond_1

    .line 31
    .line 32
    move v3, v13

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v3, v4

    .line 35
    :goto_1
    and-int/2addr v2, v13

    .line 36
    invoke-virtual {v9, v2, v3}, Lgo0;->O(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_5

    .line 41
    .line 42
    invoke-static {v0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, Lpv2;->n0(Ljava/lang/String;)Ljava/lang/Character;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    const/4 v2, 0x0

    .line 66
    :goto_2
    if-nez v2, :cond_3

    .line 67
    .line 68
    const-string v2, ""

    .line 69
    .line 70
    :cond_3
    sget-object v3, Lrh1;->a:Lrh1;

    .line 71
    .line 72
    const/high16 v5, 0x42100000    # 36.0f

    .line 73
    .line 74
    invoke-static {v3, v5}, Lte;->g0(Luh1;F)Luh1;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const/high16 v5, 0x41400000    # 12.0f

    .line 79
    .line 80
    invoke-static {v5}, Lgb2;->a(F)Lfb2;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {v3, v5}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    sget-object v5, Lur1;->a:Ltu2;

    .line 89
    .line 90
    invoke-virtual {v9, v5}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    check-cast v6, Llp1;

    .line 95
    .line 96
    iget-wide v6, v6, Llp1;->g:J

    .line 97
    .line 98
    const v8, 0x3e051eb8    # 0.13f

    .line 99
    .line 100
    .line 101
    invoke-static {v8, v6, v7}, Lju;->b(FJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v6

    .line 105
    sget-object v8, Lsp0;->h:Liu0;

    .line 106
    .line 107
    invoke-static {v3, v6, v7, v8}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    sget-object v6, Lsn;->n:Lrk;

    .line 112
    .line 113
    invoke-static {v6, v4}, Ldm;->d(Lr5;Z)Lnf1;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    iget-wide v6, v9, Lgo0;->T:J

    .line 118
    .line 119
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-virtual {v9}, Lgo0;->l()Lyy1;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    invoke-static {v9, v3}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    sget-object v8, Lhx;->c:Lgx;

    .line 132
    .line 133
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    sget-object v8, Lgx;->b:Ljy;

    .line 137
    .line 138
    invoke-virtual {v9}, Lgo0;->Z()V

    .line 139
    .line 140
    .line 141
    iget-boolean v10, v9, Lgo0;->S:Z

    .line 142
    .line 143
    if-eqz v10, :cond_4

    .line 144
    .line 145
    invoke-virtual {v9, v8}, Lgo0;->k(Lxm0;)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_4
    invoke-virtual {v9}, Lgo0;->i0()V

    .line 150
    .line 151
    .line 152
    :goto_3
    sget-object v8, Lgx;->e:Llc;

    .line 153
    .line 154
    invoke-static {v9, v8, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    sget-object v4, Lgx;->d:Llc;

    .line 158
    .line 159
    invoke-static {v9, v4, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    sget-object v6, Lgx;->f:Llc;

    .line 167
    .line 168
    invoke-static {v9, v6, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    sget-object v4, Lgx;->g:Lv6;

    .line 172
    .line 173
    invoke-static {v9, v4}, Lyf3;->b(Lpx;Lin0;)V

    .line 174
    .line 175
    .line 176
    sget-object v4, Lgx;->c:Llc;

    .line 177
    .line 178
    invoke-static {v9, v4, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v9, v5}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Llp1;

    .line 186
    .line 187
    iget-wide v3, v3, Llp1;->g:J

    .line 188
    .line 189
    const/16 v5, 0xf

    .line 190
    .line 191
    invoke-static {v5}, Lrg3;->D(I)J

    .line 192
    .line 193
    .line 194
    move-result-wide v17

    .line 195
    const/16 v5, 0x12

    .line 196
    .line 197
    invoke-static {v5}, Lrg3;->D(I)J

    .line 198
    .line 199
    .line 200
    move-result-wide v23

    .line 201
    sget-object v19, Lim0;->m:Lim0;

    .line 202
    .line 203
    new-instance v14, Lm13;

    .line 204
    .line 205
    const/16 v26, 0x0

    .line 206
    .line 207
    const v27, 0xfdfff8

    .line 208
    .line 209
    .line 210
    const-wide/16 v20, 0x0

    .line 211
    .line 212
    const/16 v22, 0x0

    .line 213
    .line 214
    const/16 v25, 0x0

    .line 215
    .line 216
    move-wide v15, v3

    .line 217
    invoke-direct/range {v14 .. v27}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 218
    .line 219
    .line 220
    const/4 v10, 0x0

    .line 221
    const/16 v11, 0x3fa

    .line 222
    .line 223
    const/4 v3, 0x0

    .line 224
    const/4 v5, 0x0

    .line 225
    const/4 v6, 0x0

    .line 226
    const/4 v7, 0x0

    .line 227
    const/4 v8, 0x0

    .line 228
    move-object v4, v14

    .line 229
    invoke-static/range {v2 .. v11}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v9, v13}, Lgo0;->p(Z)V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_5
    invoke-virtual {v9}, Lgo0;->R()V

    .line 237
    .line 238
    .line 239
    :goto_4
    invoke-virtual {v9}, Lgo0;->r()Lb62;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    if-eqz v2, :cond_6

    .line 244
    .line 245
    new-instance v3, Ln0;

    .line 246
    .line 247
    invoke-direct {v3, v0, v1, v12}, Ln0;-><init>(Ljava/lang/String;II)V

    .line 248
    .line 249
    .line 250
    iput-object v3, v2, Lb62;->d:Lmn0;

    .line 251
    .line 252
    :cond_6
    return-void
.end method

.method public static i0([Lvj;Lvu0;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvu0;->h:Lvu0;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const-wide/16 v0, 0x7d0

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-static {}, Leu;->E()Lpb1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    array-length v1, p0

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    const/4 v3, 0x0

    .line 20
    if-ge v2, v1, :cond_4

    .line 21
    .line 22
    aget-object v4, p0, v2

    .line 23
    .line 24
    instance-of v5, v4, Lw70;

    .line 25
    .line 26
    if-eqz v5, :cond_1

    .line 27
    .line 28
    move-object v3, v4

    .line 29
    check-cast v3, Lw70;

    .line 30
    .line 31
    :cond_1
    if-nez v3, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {v3, v5}, Lw70;->a(Ljava/util/ArrayList;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Lv70;

    .line 57
    .line 58
    new-instance v6, Lq70;

    .line 59
    .line 60
    invoke-direct {v6, v4, v5}, Lq70;-><init>(Lvj;Lv70;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v6}, Lpb1;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    invoke-static {v0}, Leu;->z(Lpb1;)Lpb1;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Lz2;->a()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    sget-object v2, Lup0;->k:Landroid/app/Activity;

    .line 79
    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    new-instance v3, Lpe;

    .line 83
    .line 84
    const/4 v4, 0x1

    .line 85
    invoke-direct {v3, v1, v4, v2}, Lpe;-><init>(IILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 89
    .line 90
    .line 91
    new-instance v1, Ljava/lang/Thread;

    .line 92
    .line 93
    new-instance v2, Llb;

    .line 94
    .line 95
    const/4 v3, 0x4

    .line 96
    invoke-direct {v2, p0, v0, p1, v3}, Llb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 100
    .line 101
    .line 102
    const-string p0, "NukeDexAnalysis"

    .line 103
    .line 104
    invoke-virtual {v1, p0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v4}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_5
    const-string p0, "hostAct"

    .line 115
    .line 116
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v3
.end method

.method public static final j(Lp1;Lpx;I)V
    .locals 11

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, Lgo0;

    .line 3
    .line 4
    const p1, 0x45d73a3d

    .line 5
    .line 6
    .line 7
    invoke-virtual {v3, p1}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v3, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, 0x2

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p1, v0

    .line 20
    :goto_0
    or-int/2addr p1, p2

    .line 21
    and-int/lit8 v1, p1, 0x3

    .line 22
    .line 23
    const/4 v6, 0x1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eq v1, v0, :cond_1

    .line 26
    .line 27
    move v0, v6

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v0, v2

    .line 30
    :goto_1
    and-int/2addr p1, v6

    .line 31
    invoke-virtual {v3, p1, v0}, Lgo0;->O(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_b

    .line 36
    .line 37
    iget-object p1, p0, Lp1;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v3, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sget-object v4, Lnx;->a:Leb;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    if-ne v1, v4, :cond_3

    .line 53
    .line 54
    :cond_2
    invoke-static {v5}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v3, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    check-cast v1, Lxk1;

    .line 62
    .line 63
    invoke-virtual {v3, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-virtual {v3, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    or-int/2addr v0, v7

    .line 72
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    if-ne v7, v4, :cond_5

    .line 79
    .line 80
    :cond_4
    new-instance v7, Lb2;

    .line 81
    .line 82
    invoke-direct {v7, p1, v1, v5}, Lb2;-><init>(Ljava/lang/String;Lxk1;Lt00;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    check-cast v7, Lmn0;

    .line 89
    .line 90
    invoke-static {v3, v7, p1}, Leu;->f(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Ljava/lang/String;

    .line 98
    .line 99
    if-nez p1, :cond_6

    .line 100
    .line 101
    const p1, 0x714c0c7f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, p1}, Lgo0;->W(I)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lp1;->a:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {p1, v3, v2}, Lte;->i(Ljava/lang/String;Lpx;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v2}, Lgo0;->p(Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Lgo0;->r()Lb62;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-eqz p1, :cond_c

    .line 120
    .line 121
    new-instance v0, Lt1;

    .line 122
    .line 123
    invoke-direct {v0, p0, p2, v2}, Lt1;-><init>(Lp1;II)V

    .line 124
    .line 125
    .line 126
    :goto_2
    iput-object v0, p1, Lb62;->d:Lmn0;

    .line 127
    .line 128
    return-void

    .line 129
    :cond_6
    const v0, 0x714d1345

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v0}, Lgo0;->W(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v2}, Lgo0;->p(Z)V

    .line 136
    .line 137
    .line 138
    sget-object v0, Lr7;->b:Ltu2;

    .line 139
    .line 140
    invoke-virtual {v3, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, Landroid/content/Context;

    .line 145
    .line 146
    const/high16 v1, 0x41400000    # 12.0f

    .line 147
    .line 148
    invoke-static {v1}, Lgb2;->a(F)Lfb2;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    sget-object v5, Lrh1;->a:Lrh1;

    .line 153
    .line 154
    const/high16 v7, 0x42100000    # 36.0f

    .line 155
    .line 156
    invoke-static {v5, v7}, Lte;->g0(Luh1;F)Luh1;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-static {v5, v1}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    sget-object v5, Lur1;->a:Ltu2;

    .line 165
    .line 166
    invoke-virtual {v3, v5}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    check-cast v5, Llp1;

    .line 171
    .line 172
    iget-wide v7, v5, Llp1;->g:J

    .line 173
    .line 174
    const v5, 0x3e051eb8    # 0.13f

    .line 175
    .line 176
    .line 177
    invoke-static {v5, v7, v8}, Lju;->b(FJ)J

    .line 178
    .line 179
    .line 180
    move-result-wide v7

    .line 181
    sget-object v5, Lsp0;->h:Liu0;

    .line 182
    .line 183
    invoke-static {v1, v7, v8, v5}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    sget-object v5, Lsn;->n:Lrk;

    .line 188
    .line 189
    invoke-static {v5, v2}, Ldm;->d(Lr5;Z)Lnf1;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    iget-wide v7, v3, Lgo0;->T:J

    .line 194
    .line 195
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    invoke-virtual {v3}, Lgo0;->l()Lyy1;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    invoke-static {v3, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    sget-object v9, Lhx;->c:Lgx;

    .line 208
    .line 209
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    sget-object v9, Lgx;->b:Ljy;

    .line 213
    .line 214
    invoke-virtual {v3}, Lgo0;->Z()V

    .line 215
    .line 216
    .line 217
    iget-boolean v10, v3, Lgo0;->S:Z

    .line 218
    .line 219
    if-eqz v10, :cond_7

    .line 220
    .line 221
    invoke-virtual {v3, v9}, Lgo0;->k(Lxm0;)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_7
    invoke-virtual {v3}, Lgo0;->i0()V

    .line 226
    .line 227
    .line 228
    :goto_3
    sget-object v9, Lgx;->e:Llc;

    .line 229
    .line 230
    invoke-static {v3, v9, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    sget-object v5, Lgx;->d:Llc;

    .line 234
    .line 235
    invoke-static {v3, v5, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    sget-object v7, Lgx;->f:Llc;

    .line 243
    .line 244
    invoke-static {v3, v7, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    sget-object v5, Lgx;->g:Lv6;

    .line 248
    .line 249
    invoke-static {v3, v5}, Lyf3;->b(Lpx;Lin0;)V

    .line 250
    .line 251
    .line 252
    sget-object v5, Lgx;->c:Llc;

    .line 253
    .line 254
    invoke-static {v3, v5, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    invoke-static {}, Lhm;->a()Luh1;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    if-ne v5, v4, :cond_8

    .line 266
    .line 267
    new-instance v5, Lw;

    .line 268
    .line 269
    invoke-direct {v5, v6}, Lw;-><init>(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v3, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_8
    check-cast v5, Lin0;

    .line 276
    .line 277
    invoke-virtual {v3, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    invoke-virtual {v3, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    or-int/2addr v7, v8

    .line 286
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    if-nez v7, :cond_9

    .line 291
    .line 292
    if-ne v8, v4, :cond_a

    .line 293
    .line 294
    :cond_9
    new-instance v8, Lu1;

    .line 295
    .line 296
    invoke-direct {v8, v0, p1, v2}, Lu1;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    :cond_a
    move-object v2, v8

    .line 303
    check-cast v2, Lin0;

    .line 304
    .line 305
    const/4 v4, 0x6

    .line 306
    move-object v0, v5

    .line 307
    const/4 v5, 0x0

    .line 308
    invoke-static/range {v0 .. v5}, Lpp0;->b(Lin0;Luh1;Lin0;Lpx;II)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3, v6}, Lgo0;->p(Z)V

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_b
    invoke-virtual {v3}, Lgo0;->R()V

    .line 316
    .line 317
    .line 318
    :goto_4
    invoke-virtual {v3}, Lgo0;->r()Lb62;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    if-eqz p1, :cond_c

    .line 323
    .line 324
    new-instance v0, Lt1;

    .line 325
    .line 326
    invoke-direct {v0, p0, p2, v6}, Lt1;-><init>(Lp1;II)V

    .line 327
    .line 328
    .line 329
    goto/16 :goto_2

    .line 330
    .line 331
    :cond_c
    return-void
.end method

.method public static varargs j0(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lup0;->k:Landroid/app/Activity;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "hostAct"

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-static {v0}, Llg3;->a(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    array-length v0, p1

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    sget-object p1, Lup0;->k:Landroid/app/Activity;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v1

    .line 30
    :cond_1
    sget-object v0, Lup0;->k:Landroid/app/Activity;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    array-length v1, p1

    .line 35
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :cond_3
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1
.end method

.method public static final k(Luh1;Lmn0;Lpx;I)V
    .locals 8

    .line 1
    check-cast p2, Lgo0;

    .line 2
    .line 3
    const v0, 0x4100086b

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p3, 0x6

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int/2addr v0, p3

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, p3

    .line 25
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 26
    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 42
    .line 43
    const/16 v2, 0x12

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    if-eq v1, v2, :cond_4

    .line 47
    .line 48
    move v1, v3

    .line 49
    goto :goto_3

    .line 50
    :cond_4
    const/4 v1, 0x0

    .line 51
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {p2, v2, v1}, Lgo0;->O(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_7

    .line 58
    .line 59
    invoke-virtual {p2}, Lgo0;->L()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sget-object v2, Lnx;->a:Leb;

    .line 64
    .line 65
    if-ne v1, v2, :cond_5

    .line 66
    .line 67
    sget-object v1, Lk8;->b:Lk8;

    .line 68
    .line 69
    invoke-virtual {p2, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    check-cast v1, Lnf1;

    .line 73
    .line 74
    shr-int/lit8 v2, v0, 0x3

    .line 75
    .line 76
    and-int/lit8 v2, v2, 0xe

    .line 77
    .line 78
    or-int/lit16 v2, v2, 0x180

    .line 79
    .line 80
    shl-int/lit8 v0, v0, 0x3

    .line 81
    .line 82
    and-int/lit8 v0, v0, 0x70

    .line 83
    .line 84
    or-int/2addr v0, v2

    .line 85
    iget-wide v4, p2, Lgo0;->T:J

    .line 86
    .line 87
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-virtual {p2}, Lgo0;->l()Lyy1;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static {p2, p0}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    sget-object v6, Lhx;->c:Lgx;

    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    sget-object v6, Lgx;->b:Ljy;

    .line 105
    .line 106
    shl-int/lit8 v0, v0, 0x6

    .line 107
    .line 108
    and-int/lit16 v0, v0, 0x380

    .line 109
    .line 110
    or-int/lit8 v0, v0, 0x6

    .line 111
    .line 112
    invoke-virtual {p2}, Lgo0;->Z()V

    .line 113
    .line 114
    .line 115
    iget-boolean v7, p2, Lgo0;->S:Z

    .line 116
    .line 117
    if-eqz v7, :cond_6

    .line 118
    .line 119
    invoke-virtual {p2, v6}, Lgo0;->k(Lxm0;)V

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_6
    invoke-virtual {p2}, Lgo0;->i0()V

    .line 124
    .line 125
    .line 126
    :goto_4
    sget-object v6, Lgx;->e:Llc;

    .line 127
    .line 128
    invoke-static {p2, v6, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-object v1, Lgx;->d:Llc;

    .line 132
    .line 133
    invoke-static {p2, v1, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    sget-object v2, Lgx;->f:Llc;

    .line 141
    .line 142
    invoke-static {p2, v2, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-object v1, Lgx;->g:Lv6;

    .line 146
    .line 147
    invoke-static {p2, v1}, Lyf3;->b(Lpx;Lin0;)V

    .line 148
    .line 149
    .line 150
    sget-object v1, Lgx;->c:Llc;

    .line 151
    .line 152
    invoke-static {p2, v1, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    shr-int/lit8 v0, v0, 0x6

    .line 156
    .line 157
    and-int/lit8 v0, v0, 0xe

    .line 158
    .line 159
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-interface {p1, p2, v0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, v3}, Lgo0;->p(Z)V

    .line 167
    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_7
    invoke-virtual {p2}, Lgo0;->R()V

    .line 171
    .line 172
    .line 173
    :goto_5
    invoke-virtual {p2}, Lgo0;->r()Lb62;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    if-eqz p2, :cond_8

    .line 178
    .line 179
    new-instance v0, Ll8;

    .line 180
    .line 181
    invoke-direct {v0, p0, p1, p3}, Ll8;-><init>(Luh1;Lmn0;I)V

    .line 182
    .line 183
    .line 184
    iput-object v0, p2, Lb62;->d:Lmn0;

    .line 185
    .line 186
    :cond_8
    return-void
.end method

.method public static k0(Lbi0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lbi0;->v:I

    .line 3
    .line 4
    iget-object v0, p0, Lbi0;->q:Ljava/nio/channels/FileChannel;

    .line 5
    .line 6
    invoke-static {v0}, Lhg3;->a(Ljava/io/Closeable;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lbi0;->r:Ljava/nio/channels/FileChannel;

    .line 10
    .line 11
    invoke-static {v0}, Lhg3;->a(Ljava/io/Closeable;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lbi0;->q:Ljava/nio/channels/FileChannel;

    .line 16
    .line 17
    iput-object v0, p0, Lbi0;->r:Ljava/nio/channels/FileChannel;

    .line 18
    .line 19
    iput-object v0, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 20
    .line 21
    iput-object v0, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 22
    .line 23
    return-void
.end method

.method public static final l(Loy2;Landroid/content/Context;ZLjava/lang/String;J)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p4 .. p5}, Lf13;->c(J)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_3

    .line 8
    .line 9
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v2, Lop0;->e:Leq1;

    .line 21
    .line 22
    move-object/from16 v4, p1

    .line 23
    .line 24
    invoke-virtual {v2, v4}, Leq1;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v3, v0, Loy2;->a:Llk1;

    .line 38
    .line 39
    iget-object v0, v0, Loy2;->a:Llk1;

    .line 40
    .line 41
    sget-object v10, Lbz2;->b:Lbz2;

    .line 42
    .line 43
    invoke-virtual {v3, v10}, Llk1;->a(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    const/4 v12, 0x0

    .line 51
    move v13, v12

    .line 52
    :goto_0
    if-ge v13, v11, :cond_2

    .line 53
    .line 54
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    move-object v5, v3

    .line 59
    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 60
    .line 61
    new-instance v14, Ll32;

    .line 62
    .line 63
    invoke-direct {v14, v13}, Ll32;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v1}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    new-instance v3, Lm32;

    .line 75
    .line 76
    move/from16 v6, p2

    .line 77
    .line 78
    move-object/from16 v7, p3

    .line 79
    .line 80
    move-wide/from16 v8, p4

    .line 81
    .line 82
    invoke-direct/range {v3 .. v9}, Lm32;-><init>(Landroid/content/Context;Landroid/content/pm/ResolveInfo;ZLjava/lang/String;J)V

    .line 83
    .line 84
    .line 85
    new-instance v4, Lxy2;

    .line 86
    .line 87
    invoke-direct {v4, v14, v15, v12, v3}, Lxy2;-><init>(Ljava/lang/Object;Ljava/lang/String;ILin0;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v4}, Llk1;->a(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v13, v13, 0x1

    .line 94
    .line 95
    move-object/from16 v4, p1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-virtual {v0, v10}, Llk1;->a(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_1
    return-void
.end method

.method public static final l0(Lyi1;)Lby0;
    .locals 10

    .line 1
    iget-object v0, p0, Lyi1;->h:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v2, p0, Lyi1;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget v1, p0, Lyi1;->a:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget v1, p0, Lyi1;->e:I

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    :cond_0
    :goto_0
    move-object v1, v3

    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_1
    invoke-static {v2}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const-string v1, "@chatroom"

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-static {v2, v1, v4}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_7

    .line 39
    .line 40
    const-string v1, ":\r\n"

    .line 41
    .line 42
    const/4 v5, 0x6

    .line 43
    invoke-static {v0, v1, v4, v4, v5}, Lpv2;->q0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-lez v1, :cond_4

    .line 48
    .line 49
    add-int/lit8 v5, v1, 0x3

    .line 50
    .line 51
    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_3

    .line 72
    .line 73
    move-object v1, v3

    .line 74
    :cond_3
    new-instance v4, Lpx1;

    .line 75
    .line 76
    invoke-direct {v4, v5, v1}, Lpx1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    const-string v1, ":\n"

    .line 81
    .line 82
    invoke-static {v0, v1, v4, v4, v5}, Lpv2;->q0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-lez v1, :cond_6

    .line 87
    .line 88
    add-int/lit8 v5, v1, 0x2

    .line 89
    .line 90
    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_5

    .line 111
    .line 112
    move-object v1, v3

    .line 113
    :cond_5
    new-instance v4, Lpx1;

    .line 114
    .line 115
    invoke-direct {v4, v5, v1}, Lpx1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    new-instance v4, Lpx1;

    .line 120
    .line 121
    invoke-direct {v4, v0, v3}, Lpx1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :goto_1
    move-object v1, v3

    .line 125
    goto :goto_2

    .line 126
    :cond_7
    new-instance v4, Lpx1;

    .line 127
    .line 128
    invoke-direct {v4, v0, v3}, Lpx1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :goto_2
    iget-object v3, v4, Lpx1;->a:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_8

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_8
    new-instance v1, Lby0;

    .line 142
    .line 143
    iget-wide v5, p0, Lyi1;->j:J

    .line 144
    .line 145
    const-wide/16 v7, 0x0

    .line 146
    .line 147
    cmp-long v9, v5, v7

    .line 148
    .line 149
    if-eqz v9, :cond_9

    .line 150
    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v7, "server:"

    .line 154
    .line 155
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    :goto_3
    move-object v5, v0

    .line 166
    goto :goto_4

    .line 167
    :cond_9
    iget-wide v5, p0, Lyi1;->f:J

    .line 168
    .line 169
    cmp-long v7, v5, v7

    .line 170
    .line 171
    if-eqz v7, :cond_a

    .line 172
    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string v7, "local:"

    .line 176
    .line 177
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    goto :goto_3

    .line 188
    :cond_a
    iget-wide v5, p0, Lyi1;->i:J

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    new-instance v7, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    const-string v8, "fallback:"

    .line 197
    .line 198
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v8, ":"

    .line 205
    .line 206
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    goto :goto_3

    .line 223
    :goto_4
    iget-wide v6, p0, Lyi1;->i:J

    .line 224
    .line 225
    iget-object v4, v4, Lpx1;->b:Ljava/lang/String;

    .line 226
    .line 227
    invoke-direct/range {v1 .. v7}, Lby0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 228
    .line 229
    .line 230
    :goto_5
    return-object v1
.end method

.method public static final m(Lid;Led;JLin0;Lt00;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    sget-object v8, Lgd3;->y:Lgd3;

    .line 6
    .line 7
    instance-of v1, v0, Lsw2;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Lsw2;

    .line 13
    .line 14
    iget v2, v1, Lsw2;->p:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v2, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v2, v4

    .line 23
    iput v2, v1, Lsw2;->p:I

    .line 24
    .line 25
    :goto_0
    move-object v9, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v1, Lsw2;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lu00;-><init>(Lt00;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v10, v9, Lu00;->i:La20;

    .line 34
    .line 35
    iget-object v0, v9, Lsw2;->o:Ljava/lang/Object;

    .line 36
    .line 37
    iget v1, v9, Lsw2;->p:I

    .line 38
    .line 39
    const/4 v11, 0x5

    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v13, 0x2

    .line 42
    const/4 v14, 0x1

    .line 43
    sget-object v15, Lk20;->h:Lk20;

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    if-eq v1, v14, :cond_1

    .line 48
    .line 49
    if-ne v1, v13, :cond_2

    .line 50
    .line 51
    :cond_1
    iget-object v1, v9, Lsw2;->n:Lo72;

    .line 52
    .line 53
    iget-object v2, v9, Lsw2;->m:Lin0;

    .line 54
    .line 55
    iget-object v3, v9, Lsw2;->l:Led;

    .line 56
    .line 57
    iget-object v4, v9, Lsw2;->k:Lid;

    .line 58
    .line 59
    :try_start_0
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    goto/16 :goto_7

    .line 63
    .line 64
    :catch_0
    move-exception v0

    .line 65
    goto/16 :goto_a

    .line 66
    .line 67
    :cond_2
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    return-object v0

    .line 74
    :cond_3
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    const-wide/16 v0, 0x0

    .line 78
    .line 79
    invoke-interface {v3, v0, v1}, Led;->b(J)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v17

    .line 83
    invoke-interface {v3, v0, v1}, Led;->f(J)Lnd;

    .line 84
    .line 85
    .line 86
    move-result-object v19

    .line 87
    new-instance v1, Lo72;

    .line 88
    .line 89
    invoke-direct {v1}, Lo72;-><init>()V

    .line 90
    .line 91
    .line 92
    const-wide/high16 v4, -0x8000000000000000L

    .line 93
    .line 94
    cmp-long v0, p2, v4

    .line 95
    .line 96
    if-nez v0, :cond_7

    .line 97
    .line 98
    :try_start_1
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {v10}, Lte;->F(La20;)F

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    new-instance v0, Lpw2;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3

    .line 106
    .line 107
    move-object/from16 v5, p0

    .line 108
    .line 109
    move-object/from16 v7, p4

    .line 110
    .line 111
    move-object/from16 v2, v17

    .line 112
    .line 113
    move-object/from16 v4, v19

    .line 114
    .line 115
    :try_start_2
    invoke-direct/range {v0 .. v7}, Lpw2;-><init>(Lo72;Ljava/lang/Object;Led;Lnd;Lid;FLin0;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    .line 116
    .line 117
    .line 118
    move-object v7, v1

    .line 119
    :try_start_3
    iput-object v5, v9, Lsw2;->k:Lid;

    .line 120
    .line 121
    iput-object v3, v9, Lsw2;->l:Led;

    .line 122
    .line 123
    move-object/from16 v6, p4

    .line 124
    .line 125
    iput-object v6, v9, Lsw2;->m:Lin0;

    .line 126
    .line 127
    iput-object v7, v9, Lsw2;->n:Lo72;

    .line 128
    .line 129
    iput v14, v9, Lsw2;->p:I

    .line 130
    .line 131
    invoke-interface {v3}, Led;->a()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    invoke-virtual {v9}, Lu00;->f()La20;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-interface {v1, v8}, La20;->o(Lz10;)Ly10;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    if-nez v1, :cond_4

    .line 146
    .line 147
    invoke-virtual {v9}, Lu00;->f()La20;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v1}, Lqp0;->A(La20;)Lxb;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1, v0, v9}, Lxb;->a(Lin0;Lt00;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    goto :goto_2

    .line 160
    :cond_4
    new-instance v0, Ljava/lang/ClassCastException;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 163
    .line 164
    .line 165
    throw v0

    .line 166
    :cond_5
    new-instance v1, Lwo0;

    .line 167
    .line 168
    invoke-direct {v1, v0, v11}, Lwo0;-><init>(Lin0;I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-static {v10}, Lqp0;->A(La20;)Lxb;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v0, v1, v9}, Lxb;->a(Lin0;Lt00;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 182
    :goto_2
    if-ne v0, v15, :cond_6

    .line 183
    .line 184
    goto/16 :goto_9

    .line 185
    .line 186
    :cond_6
    move-object v4, v5

    .line 187
    move-object v2, v6

    .line 188
    goto :goto_6

    .line 189
    :goto_3
    move-object v4, v5

    .line 190
    :goto_4
    move-object v1, v7

    .line 191
    goto/16 :goto_a

    .line 192
    .line 193
    :catch_1
    move-exception v0

    .line 194
    goto :goto_3

    .line 195
    :catch_2
    move-exception v0

    .line 196
    :goto_5
    move-object v7, v1

    .line 197
    move-object v4, v5

    .line 198
    goto/16 :goto_a

    .line 199
    .line 200
    :catch_3
    move-exception v0

    .line 201
    move-object/from16 v5, p0

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_7
    move-object/from16 v5, p0

    .line 205
    .line 206
    move-object/from16 v6, p4

    .line 207
    .line 208
    move-object v7, v1

    .line 209
    :try_start_4
    new-instance v16, Lgd;

    .line 210
    .line 211
    invoke-interface {v3}, Led;->d()Ln43;

    .line 212
    .line 213
    .line 214
    move-result-object v18

    .line 215
    invoke-interface {v3}, Led;->e()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v22

    .line 219
    new-instance v0, Lqw2;

    .line 220
    .line 221
    invoke-direct {v0, v5, v12}, Lqw2;-><init>(Lid;I)V

    .line 222
    .line 223
    .line 224
    move-wide/from16 v23, p2

    .line 225
    .line 226
    move-wide/from16 v20, p2

    .line 227
    .line 228
    move-object/from16 v25, v0

    .line 229
    .line 230
    invoke-direct/range {v16 .. v25}, Lgd;-><init>(Ljava/lang/Object;Ln43;Lnd;JLjava/lang/Object;JLxm0;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {v10}, Lte;->F(La20;)F

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    move-wide/from16 v1, p2

    .line 241
    .line 242
    move-object v4, v3

    .line 243
    move v3, v0

    .line 244
    move-object/from16 v0, v16

    .line 245
    .line 246
    invoke-static/range {v0 .. v6}, Lte;->w(Lgd;JFLed;Lid;Lin0;)V

    .line 247
    .line 248
    .line 249
    iput-object v0, v7, Lo72;->i:Ljava/lang/Object;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_5

    .line 250
    .line 251
    move-object/from16 v4, p0

    .line 252
    .line 253
    move-object/from16 v3, p1

    .line 254
    .line 255
    move-object/from16 v2, p4

    .line 256
    .line 257
    :goto_6
    move-object v1, v7

    .line 258
    :cond_8
    :goto_7
    :try_start_5
    iget-object v0, v9, Lu00;->i:La20;

    .line 259
    .line 260
    iget-object v5, v1, Lo72;->i:Ljava/lang/Object;

    .line 261
    .line 262
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    check-cast v5, Lgd;

    .line 266
    .line 267
    iget-object v5, v5, Lgd;->i:Lnx1;

    .line 268
    .line 269
    invoke-virtual {v5}, Lnx1;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    check-cast v5, Ljava/lang/Boolean;

    .line 274
    .line 275
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    if-eqz v5, :cond_b

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-static {v0}, Lte;->F(La20;)F

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    new-instance v6, Lrw2;
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0

    .line 289
    .line 290
    move-object/from16 p1, v1

    .line 291
    .line 292
    move-object/from16 p5, v2

    .line 293
    .line 294
    move-object/from16 p3, v3

    .line 295
    .line 296
    move-object/from16 p4, v4

    .line 297
    .line 298
    move/from16 p2, v5

    .line 299
    .line 300
    move-object/from16 p0, v6

    .line 301
    .line 302
    :try_start_6
    invoke-direct/range {p0 .. p5}, Lrw2;-><init>(Lo72;FLed;Lid;Lin0;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_4

    .line 303
    .line 304
    .line 305
    move-object/from16 v5, p0

    .line 306
    .line 307
    move-object/from16 v1, p1

    .line 308
    .line 309
    move-object/from16 v3, p3

    .line 310
    .line 311
    move-object/from16 v4, p4

    .line 312
    .line 313
    move-object/from16 v2, p5

    .line 314
    .line 315
    :try_start_7
    iput-object v4, v9, Lsw2;->k:Lid;

    .line 316
    .line 317
    iput-object v3, v9, Lsw2;->l:Led;

    .line 318
    .line 319
    iput-object v2, v9, Lsw2;->m:Lin0;

    .line 320
    .line 321
    iput-object v1, v9, Lsw2;->n:Lo72;

    .line 322
    .line 323
    iput v13, v9, Lsw2;->p:I

    .line 324
    .line 325
    invoke-interface {v3}, Led;->a()Z

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    if-eqz v6, :cond_a

    .line 330
    .line 331
    invoke-virtual {v9}, Lu00;->f()La20;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-interface {v0, v8}, La20;->o(Lz10;)Ly10;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-nez v0, :cond_9

    .line 340
    .line 341
    invoke-virtual {v9}, Lu00;->f()La20;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v0}, Lqp0;->A(La20;)Lxb;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-virtual {v0, v5, v9}, Lxb;->a(Lin0;Lt00;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    goto :goto_8

    .line 354
    :cond_9
    new-instance v0, Ljava/lang/ClassCastException;

    .line 355
    .line 356
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 357
    .line 358
    .line 359
    throw v0

    .line 360
    :cond_a
    new-instance v6, Lwo0;

    .line 361
    .line 362
    invoke-direct {v6, v5, v11}, Lwo0;-><init>(Lin0;I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-static {v0}, Lqp0;->A(La20;)Lxb;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {v0, v6, v9}, Lxb;->a(Lin0;Lt00;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v0
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_0

    .line 376
    :goto_8
    if-ne v0, v15, :cond_8

    .line 377
    .line 378
    :goto_9
    return-object v15

    .line 379
    :catch_4
    move-exception v0

    .line 380
    move-object/from16 v1, p1

    .line 381
    .line 382
    move-object/from16 v4, p4

    .line 383
    .line 384
    goto :goto_a

    .line 385
    :cond_b
    sget-object v0, La83;->a:La83;

    .line 386
    .line 387
    return-object v0

    .line 388
    :catch_5
    move-exception v0

    .line 389
    move-object/from16 v4, p0

    .line 390
    .line 391
    goto/16 :goto_4

    .line 392
    .line 393
    :goto_a
    iget-object v2, v1, Lo72;->i:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v2, Lgd;

    .line 396
    .line 397
    if-eqz v2, :cond_c

    .line 398
    .line 399
    iget-object v2, v2, Lgd;->i:Lnx1;

    .line 400
    .line 401
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 402
    .line 403
    invoke-virtual {v2, v3}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    :cond_c
    iget-object v1, v1, Lo72;->i:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v1, Lgd;

    .line 409
    .line 410
    if-eqz v1, :cond_d

    .line 411
    .line 412
    iget-wide v1, v1, Lgd;->g:J

    .line 413
    .line 414
    iget-wide v5, v4, Lid;->k:J

    .line 415
    .line 416
    cmp-long v1, v1, v5

    .line 417
    .line 418
    if-nez v1, :cond_d

    .line 419
    .line 420
    iput-boolean v12, v4, Lid;->m:Z

    .line 421
    .line 422
    :cond_d
    throw v0
.end method

.method public static m0(Lbi0;Ljava/io/File;Ljava/io/File;)V
    .locals 2

    .line 1
    const-string v0, "FastKV"

    .line 2
    .line 3
    iget-object v1, p0, Lbi0;->b:Ljava/lang/String;

    .line 4
    .line 5
    :try_start_0
    invoke-static {p0, p1}, Lte;->W(Lbi0;Ljava/io/File;)Z

    .line 6
    .line 7
    .line 8
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception p1

    .line 13
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p0}, Lte;->d0(Lbi0;)V

    .line 17
    .line 18
    .line 19
    :try_start_1
    invoke-static {p0, p2}, Lte;->W(Lbi0;Ljava/io/File;)Z

    .line 20
    .line 21
    .line 22
    move-result p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :catch_1
    move-exception p1

    .line 27
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {p0}, Lte;->d0(Lbi0;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static final n(Lid;Ljava/lang/Float;Lfj0;Lin0;Ltw2;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v1, p0, Lid;->i:Lnx1;

    .line 2
    .line 3
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    iget-object v4, p0, Lid;->h:Ln43;

    .line 8
    .line 9
    iget-object v7, p0, Lid;->j:Lnd;

    .line 10
    .line 11
    new-instance v1, Lcy2;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    move-object v3, p2

    .line 15
    move-object v2, v1

    .line 16
    invoke-direct/range {v2 .. v7}, Lcy2;-><init>(Lhd;Ln43;Ljava/lang/Object;Ljava/lang/Object;Lnd;)V

    .line 17
    .line 18
    .line 19
    iget-wide v2, p0, Lid;->k:J

    .line 20
    .line 21
    move-object v0, p0

    .line 22
    move-object v4, p3

    .line 23
    move-object v5, p4

    .line 24
    invoke-static/range {v0 .. v5}, Lte;->m(Lid;Led;JLin0;Lt00;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lk20;->h:Lk20;

    .line 29
    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    sget-object v0, La83;->a:La83;

    .line 34
    .line 35
    return-object v0
.end method

.method public static final n0(Lz53;Ljava/lang/Object;)Lh63;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lte;->o0(Ljava/lang/Object;)Lh63;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object p0, p0, Lz53;->b:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lh63;

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, "Cannot find the kotlin type of object "

    .line 45
    .line 46
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, " ("

    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p1, "), did you forget to add a type converter for it?"

    .line 61
    .line 62
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0

    .line 73
    :cond_1
    return-object v0
.end method

.method public static final o(Lj20;Lxh1;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Lj20;->g()La20;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lsn;->K:Lsn;

    .line 6
    .line 7
    invoke-interface {v0, v1}, La20;->o(Lz10;)Ly10;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lk21;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lk21;->c(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p1, "Scope cannot be cancelled because it does not have a job: "

    .line 20
    .line 21
    invoke-static {p1, p0}, Lc80;->u(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final o0(Ljava/lang/Object;)Lh63;
    .locals 3

    .line 1
    sget-object v0, La83;->a:La83;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-class p0, La83;

    .line 10
    .line 11
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/Byte;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    instance-of v0, p0, Ljava/lang/Short;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    instance-of v0, p0, Ljava/lang/Integer;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_3
    instance-of v0, p0, Ljava/lang/Long;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_4
    instance-of v0, p0, Ljava/lang/Float;

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_5
    instance-of v0, p0, Ljava/lang/Double;

    .line 72
    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_6
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 83
    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 87
    .line 88
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_7
    instance-of v0, p0, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v0, :cond_8

    .line 96
    .line 97
    const-class p0, Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_8
    instance-of v0, p0, [B

    .line 105
    .line 106
    if-eqz v0, :cond_9

    .line 107
    .line 108
    const-class p0, [B

    .line 109
    .line 110
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_9
    instance-of v0, p0, Lkotlin/UByteArray;

    .line 116
    .line 117
    if-eqz v0, :cond_a

    .line 118
    .line 119
    const-class p0, Lkotlin/UByteArray;

    .line 120
    .line 121
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_a
    instance-of v0, p0, [Ljava/lang/Object;

    .line 127
    .line 128
    sget-object v1, Lx41;->a:Lx41;

    .line 129
    .line 130
    if-eqz v0, :cond_b

    .line 131
    .line 132
    const-class p0, [Ljava/lang/Object;

    .line 133
    .line 134
    invoke-static {p0, v1}, Ld72;->d(Ljava/lang/Class;Lx41;)Lh63;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :cond_b
    instance-of v0, p0, Ljava/util/List;

    .line 140
    .line 141
    if-eqz v0, :cond_c

    .line 142
    .line 143
    const-class p0, Ljava/util/List;

    .line 144
    .line 145
    invoke-static {p0, v1}, Ld72;->d(Ljava/lang/Class;Lx41;)Lh63;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :cond_c
    instance-of v0, p0, Ljava/util/Set;

    .line 151
    .line 152
    if-eqz v0, :cond_d

    .line 153
    .line 154
    const-class p0, Ljava/util/Set;

    .line 155
    .line 156
    invoke-static {p0, v1}, Ld72;->d(Ljava/lang/Class;Lx41;)Lh63;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :cond_d
    instance-of v0, p0, Lcom/dokar/quickjs/binding/JsObject;

    .line 162
    .line 163
    if-eqz v0, :cond_e

    .line 164
    .line 165
    const-class p0, Lcom/dokar/quickjs/binding/JsObject;

    .line 166
    .line 167
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :cond_e
    instance-of v0, p0, Ljava/util/Map;

    .line 173
    .line 174
    if-eqz v0, :cond_f

    .line 175
    .line 176
    sget-object p0, Ld72;->a:Le72;

    .line 177
    .line 178
    const-class v0, Ljava/util/Map;

    .line 179
    .line 180
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    filled-new-array {v1, v1}, [Lx41;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    new-instance p0, Lh63;

    .line 196
    .line 197
    const/4 v2, 0x0

    .line 198
    invoke-direct {p0, v0, v1, v2}, Lh63;-><init>(Lbt;Ljava/util/List;Z)V

    .line 199
    .line 200
    .line 201
    return-object p0

    .line 202
    :cond_f
    instance-of p0, p0, Ljava/lang/Error;

    .line 203
    .line 204
    if-eqz p0, :cond_10

    .line 205
    .line 206
    const-class p0, Ljava/lang/Error;

    .line 207
    .line 208
    invoke-static {p0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    return-object p0

    .line 213
    :cond_10
    const/4 p0, 0x0

    .line 214
    return-object p0
.end method

.method public static final p(JLqv1;)V
    .locals 2

    .line 1
    sget-object v0, Lqv1;->h:Lqv1;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-ne p2, v0, :cond_1

    .line 7
    .line 8
    invoke-static {p0, p1}, Lfz;->g(J)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eq p0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    .line 16
    .line 17
    invoke-static {p0}, Lnz0;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-static {p0, p1}, Lfz;->h(J)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eq p0, v1, :cond_2

    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :cond_2
    const-string p0, "Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    .line 29
    .line 30
    invoke-static {p0}, Lnz0;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static final p0(Lgd;Lid;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lgd;->e:Lnx1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lid;->i:Lnx1;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lid;->j:Lnd;

    .line 13
    .line 14
    iget-object v1, p0, Lgd;->f:Lnd;

    .line 15
    .line 16
    invoke-virtual {v0}, Lnd;->b()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Lnd;->a(I)F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {v0, v4, v3}, Lnd;->e(FI)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-wide v0, p0, Lgd;->h:J

    .line 34
    .line 35
    iput-wide v0, p1, Lid;->l:J

    .line 36
    .line 37
    iget-wide v0, p0, Lgd;->g:J

    .line 38
    .line 39
    iput-wide v0, p1, Lid;->k:J

    .line 40
    .line 41
    iget-object p0, p0, Lgd;->i:Lnx1;

    .line 42
    .line 43
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    iput-boolean p0, p1, Lid;->m:Z

    .line 54
    .line 55
    return-void
.end method

.method public static q(Lbi0;)V
    .locals 3

    .line 1
    iget v0, p0, Lbi0;->v:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 6
    .line 7
    invoke-static {p0, v0}, Lte;->c0(Lbi0;Ljava/nio/MappedByteBuffer;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 11
    .line 12
    invoke-static {p0, v0}, Lte;->c0(Lbi0;Ljava/nio/MappedByteBuffer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    invoke-static {p0}, Lte;->k0(Lbi0;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-static {p0}, Lte;->d0(Lbi0;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Ljava/io/File;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lbi0;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lbi0;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lhg3;->b(Ljava/io/File;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static final q0(Luh1;F)Luh1;
    .locals 6

    .line 1
    new-instance v0, Lkr2;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/16 v5, 0xa

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, p1

    .line 8
    move v1, p1

    .line 9
    invoke-direct/range {v0 .. v5}, Lkr2;-><init>(FFFFI)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static r(Luh1;Lbk1;ZLxm0;)Luh1;
    .locals 6

    .line 1
    new-instance v0, Ljt;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v4, 0x0

    .line 5
    move-object v1, p1

    .line 6
    move v3, p2

    .line 7
    move-object v5, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Ljt;-><init>(Lbk1;ZZLjava/lang/String;Lxm0;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final r0(Luh1;FF)Luh1;
    .locals 6

    .line 1
    new-instance v0, Lkr2;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/16 v5, 0xa

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move v1, p1

    .line 8
    move v3, p2

    .line 9
    invoke-direct/range {v0 .. v5}, Lkr2;-><init>(FFFFI)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static s(Luh1;ZLjava/lang/String;Lxm0;)Luh1;
    .locals 6

    .line 1
    new-instance v0, Ljt;

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    move v3, p1

    .line 6
    move-object v4, p2

    .line 7
    move-object v5, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Ljt;-><init>(Lbk1;ZZLjava/lang/String;Lxm0;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static s0(Lbi0;Le9;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lbi0;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v1, Lbi0;->a:Ljava/lang/String;

    .line 8
    .line 9
    const-string v4, "rw"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    :try_start_0
    iget-object v7, v0, Le9;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v7, [B

    .line 16
    .line 17
    array-length v7, v7

    .line 18
    new-instance v8, Ljava/io/File;

    .line 19
    .line 20
    new-instance v9, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v10, ".kva"

    .line 29
    .line 30
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-direct {v8, v3, v9}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v9, Ljava/io/File;

    .line 41
    .line 42
    new-instance v10, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v11, ".kvb"

    .line 51
    .line 52
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    invoke-direct {v9, v3, v10}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v8}, Lhg3;->h(Ljava/io/File;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_0

    .line 67
    .line 68
    invoke-static {v9}, Lhg3;->h(Ljava/io/File;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    new-instance v3, Ljava/io/RandomAccessFile;

    .line 75
    .line 76
    invoke-direct {v3, v8, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 77
    .line 78
    .line 79
    int-to-long v14, v7

    .line 80
    :try_start_1
    invoke-virtual {v3, v14, v15}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    iput-object v10, v1, Lbi0;->q:Ljava/nio/channels/FileChannel;

    .line 88
    .line 89
    sget-object v11, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 90
    .line 91
    const-wide/16 v12, 0x0

    .line 92
    .line 93
    invoke-virtual/range {v10 .. v15}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    iput-object v7, v1, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 98
    .line 99
    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 100
    .line 101
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 102
    .line 103
    .line 104
    iget-object v7, v1, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 105
    .line 106
    iget-object v10, v0, Le9;->k:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v10, [B

    .line 109
    .line 110
    iget v12, v1, Lbi0;->d:I

    .line 111
    .line 112
    invoke-virtual {v7, v10, v5, v12}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 113
    .line 114
    .line 115
    new-instance v7, Ljava/io/RandomAccessFile;

    .line 116
    .line 117
    invoke-direct {v7, v9, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 118
    .line 119
    .line 120
    :try_start_2
    invoke-virtual {v7, v14, v15}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    iput-object v10, v1, Lbi0;->r:Ljava/nio/channels/FileChannel;

    .line 128
    .line 129
    const-wide/16 v12, 0x0

    .line 130
    .line 131
    invoke-virtual/range {v10 .. v15}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    iput-object v4, v1, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 136
    .line 137
    invoke-virtual {v4, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 138
    .line 139
    .line 140
    iget-object v4, v1, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 141
    .line 142
    iget-object v0, v0, Le9;->k:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, [B

    .line 145
    .line 146
    iget v8, v1, Lbi0;->d:I

    .line 147
    .line 148
    invoke-virtual {v4, v0, v5, v8}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 149
    .line 150
    .line 151
    const/4 v0, 0x1

    .line 152
    return v0

    .line 153
    :catch_0
    move-exception v0

    .line 154
    goto :goto_0

    .line 155
    :catch_1
    move-exception v0

    .line 156
    move-object v7, v6

    .line 157
    goto :goto_0

    .line 158
    :catch_2
    move-exception v0

    .line 159
    move-object v3, v6

    .line 160
    move-object v7, v3

    .line 161
    goto :goto_0

    .line 162
    :cond_0
    :try_start_3
    new-instance v0, Ljava/lang/Exception;

    .line 163
    .line 164
    const-string v3, "open file failed"

    .line 165
    .line 166
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 170
    :goto_0
    invoke-static {v3}, Lhg3;->a(Ljava/io/Closeable;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v7}, Lhg3;->a(Ljava/io/Closeable;)V

    .line 174
    .line 175
    .line 176
    iput-object v6, v1, Lbi0;->q:Ljava/nio/channels/FileChannel;

    .line 177
    .line 178
    iput-object v6, v1, Lbi0;->r:Ljava/nio/channels/FileChannel;

    .line 179
    .line 180
    iput-object v6, v1, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 181
    .line 182
    iput-object v6, v1, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 183
    .line 184
    const-string v1, "FastKV"

    .line 185
    .line 186
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 187
    .line 188
    .line 189
    return v5
.end method

.method public static t(Lbi0;Ljava/nio/MappedByteBuffer;Ljava/nio/MappedByteBuffer;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v0, v1, :cond_3

    .line 10
    .line 11
    iget-object v0, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lbi0;->r:Ljava/nio/channels/FileChannel;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lbi0;->q:Ljava/nio/channels/FileChannel;

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v0, v1}, Lte;->a0(Ljava/nio/channels/FileChannel;I)Ljava/nio/MappedByteBuffer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    new-instance p1, Ljava/lang/Exception;

    .line 31
    .line 32
    const-string p2, "map failed"

    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string p2, "FastKV"

    .line 38
    .line 39
    iget-object p3, p0, Lbi0;->b:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Lte;->k0(Lbi0;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    iget-object v1, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 49
    .line 50
    if-ne p2, v1, :cond_2

    .line 51
    .line 52
    iput-object v0, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    iput-object v0, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 56
    .line 57
    :goto_1
    move-object p2, v0

    .line 58
    :cond_3
    invoke-virtual {p1}, Ljava/nio/MappedByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/nio/MappedByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p3}, Ljava/nio/MappedByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-virtual {p1, p0}, Ljava/nio/MappedByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static t0(Lbi0;)Z
    .locals 10

    .line 1
    const-string v0, "FastKV"

    .line 2
    .line 3
    iget-object v1, p0, Lbi0;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lbi0;->a:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    new-instance v4, Ljava/io/File;

    .line 9
    .line 10
    new-instance v5, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v6, ".tmp"

    .line 19
    .line 20
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v4}, Lhg3;->h(Ljava/io/File;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_6

    .line 35
    .line 36
    new-instance v5, Ljava/io/RandomAccessFile;

    .line 37
    .line 38
    const-string v6, "rw"

    .line 39
    .line 40
    invoke-direct {v5, v4, v6}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    :try_start_1
    iget v6, p0, Lbi0;->d:I

    .line 44
    .line 45
    int-to-long v6, v6

    .line 46
    invoke-virtual {v5, v6, v7}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 47
    .line 48
    .line 49
    iget-object v6, p0, Lbi0;->h:Le9;

    .line 50
    .line 51
    iget-object v6, v6, Le9;->k:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, [B

    .line 54
    .line 55
    iget v7, p0, Lbi0;->d:I

    .line 56
    .line 57
    invoke-virtual {v5, v6, v3, v7}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v6}, Ljava/io/FileDescriptor;->sync()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    .line 67
    :try_start_2
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V

    .line 68
    .line 69
    .line 70
    new-instance v5, Ljava/io/File;

    .line 71
    .line 72
    new-instance v6, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v7, ".kvc"

    .line 81
    .line 82
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-direct {v5, v2, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    const/4 v6, 0x1

    .line 97
    if-eqz v2, :cond_0

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_1

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_2

    .line 111
    .line 112
    :cond_1
    invoke-virtual {v4, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_2

    .line 117
    .line 118
    :goto_0
    move v2, v6

    .line 119
    goto :goto_1

    .line 120
    :cond_2
    move v2, v3

    .line 121
    :goto_1
    if-eqz v2, :cond_5

    .line 122
    .line 123
    iget-object v2, p0, Lbi0;->k:Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-nez v4, :cond_4

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_3

    .line 140
    .line 141
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    check-cast v5, Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {}, Lci0;->J()Ljava/util/concurrent/Executor;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    new-instance v8, Lt7;

    .line 152
    .line 153
    const/4 v9, 0x2

    .line 154
    invoke-direct {v8, v9, p0, v5}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v7, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 162
    .line 163
    .line 164
    :cond_4
    return v6

    .line 165
    :cond_5
    new-instance p0, Ljava/lang/Exception;

    .line 166
    .line 167
    const-string v2, "rename failed"

    .line 168
    .line 169
    invoke-direct {p0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 173
    .line 174
    .line 175
    return v3

    .line 176
    :catch_0
    move-exception p0

    .line 177
    goto :goto_4

    .line 178
    :catchall_0
    move-exception p0

    .line 179
    :try_start_3
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :catchall_1
    move-exception v2

    .line 184
    :try_start_4
    invoke-virtual {p0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    :goto_3
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 188
    :cond_6
    return v3

    .line 189
    :goto_4
    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 190
    .line 191
    .line 192
    return v3
.end method

.method public static final u(Lmn0;Lt00;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lhd2;

    .line 2
    .line 3
    invoke-interface {p1}, Lt00;->f()La20;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, p1, v1}, Lhd2;-><init>(Lt00;La20;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-static {v0, p1, v0, p0}, Lze3;->b(Lhd2;ZLhd2;Lmn0;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static v(Lbi0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lbi0;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p0, p0, Lbi0;->a:Ljava/lang/String;

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v3, ".kvc"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lhg3;->b(Ljava/io/File;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Ljava/io/File;

    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v3, ".tmp"

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lhg3;->b(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    move-exception p0

    .line 57
    const-string v1, "FastKV"

    .line 58
    .line 59
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static final w(Lgd;JFLed;Lid;Lin0;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p3, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-interface {p4}, Led;->c()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-wide v0, p0, Lgd;->c:J

    .line 12
    .line 13
    sub-long v0, p1, v0

    .line 14
    .line 15
    long-to-float v0, v0

    .line 16
    div-float/2addr v0, p3

    .line 17
    float-to-long v0, v0

    .line 18
    :goto_0
    iput-wide p1, p0, Lgd;->g:J

    .line 19
    .line 20
    invoke-interface {p4, v0, v1}, Led;->b(J)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p2, p0, Lgd;->e:Lnx1;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p4, v0, v1}, Led;->f(J)Lnd;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lgd;->f:Lnd;

    .line 34
    .line 35
    invoke-interface {p4, v0, v1}, Led;->g(J)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-wide p1, p0, Lgd;->g:J

    .line 42
    .line 43
    iput-wide p1, p0, Lgd;->h:J

    .line 44
    .line 45
    iget-object p1, p0, Lgd;->i:Lnx1;

    .line 46
    .line 47
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {p0, p5}, Lte;->p0(Lgd;Lid;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p6, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static final x(Landroid/view/View;I)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const v2, 0x7fffffff

    .line 4
    .line 5
    .line 6
    move-object v3, v0

    .line 7
    :goto_0
    if-eqz p0, :cond_4

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    if-eqz v4, :cond_2

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    move-object v3, v4

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    :goto_1
    move v2, v1

    .line 27
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    invoke-static {p0}, Lpb3;->b(Landroid/view/View;)Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    instance-of v4, p0, Landroid/view/View;

    .line 34
    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    check-cast p0, Landroid/view/View;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    move-object p0, v0

    .line 41
    goto :goto_0

    .line 42
    :cond_4
    :goto_2
    return v2
.end method

.method public static final y(ILt81;Ljava/lang/Object;)I
    .locals 1

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Lt81;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Lt81;->c()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ge p0, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lt81;->d(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p1, p1, Lt81;->d:Le9;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Le9;->g(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 p2, -0x1

    .line 34
    if-eq p1, p2, :cond_2

    .line 35
    .line 36
    return p1

    .line 37
    :cond_2
    :goto_0
    return p0
.end method

.method public static final z(Landroid/view/View;)Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    const v0, 0x79080080

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0}, Lte;->x(Landroid/view/View;I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const v1, 0x79080083

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v1}, Lte;->x(Landroid/view/View;I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    move-object v2, p0

    .line 27
    move v3, v1

    .line 28
    move-object v1, v2

    .line 29
    :goto_0
    if-eqz p0, :cond_4

    .line 30
    .line 31
    if-ne v3, v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    instance-of v0, v0, Landroid/view/ViewGroup;

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_0
    invoke-static {p0}, Lte;->E(Landroid/view/View;)Llx;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    :cond_1
    return-object p0

    .line 49
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    invoke-static {p0}, Lpb3;->b(Landroid/view/View;)Landroid/view/ViewParent;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    instance-of v4, v1, Landroid/view/View;

    .line 56
    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    check-cast v1, Landroid/view/View;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    const/4 v1, 0x0

    .line 63
    :goto_1
    move-object v5, v2

    .line 64
    move-object v2, p0

    .line 65
    move-object p0, v1

    .line 66
    move-object v1, v5

    .line 67
    goto :goto_0

    .line 68
    :cond_4
    return-object v1

    .line 69
    :cond_5
    return-object p0
.end method


# virtual methods
.method public abstract D()Lo62;
.end method
