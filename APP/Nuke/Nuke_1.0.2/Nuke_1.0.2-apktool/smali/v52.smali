.class public final Lv52;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Ls52;

.field public final b:Ljava/util/ArrayList;

.field public final c:I

.field public final d:Lf90;

.field public final e:Lk82;

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Lgd3;

.field public final j:Lcq;

.field public final k:Ln4;

.field public final l:Lsn;

.field public final m:Lna0;

.field public final n:Ljavax/net/ssl/HostnameVerifier;

.field public final o:Ljava/net/Proxy;

.field public final p:Lgd3;

.field public final q:Ljava/net/ProxySelector;

.field public final r:Z

.field public final s:Ljavax/net/SocketFactory;

.field public final t:Ljavax/net/ssl/SSLSocketFactory;

.field public final u:Ljavax/net/ssl/X509TrustManager;

.field public final v:Lup0;

.field public w:I


# direct methods
.method public constructor <init>(Ls52;Ljava/util/ArrayList;ILf90;Lk82;IIILgd3;Lcq;Ln4;Lsn;Lna0;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lgd3;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lup0;)V
    .locals 0

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p19 .. p19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lv52;->a:Ls52;

    .line 3
    iput-object p2, p0, Lv52;->b:Ljava/util/ArrayList;

    .line 4
    iput p3, p0, Lv52;->c:I

    .line 5
    iput-object p4, p0, Lv52;->d:Lf90;

    .line 6
    iput-object p5, p0, Lv52;->e:Lk82;

    .line 7
    iput p6, p0, Lv52;->f:I

    .line 8
    iput p7, p0, Lv52;->g:I

    .line 9
    iput p8, p0, Lv52;->h:I

    .line 10
    iput-object p9, p0, Lv52;->i:Lgd3;

    .line 11
    iput-object p10, p0, Lv52;->j:Lcq;

    .line 12
    iput-object p11, p0, Lv52;->k:Ln4;

    .line 13
    iput-object p12, p0, Lv52;->l:Lsn;

    .line 14
    iput-object p13, p0, Lv52;->m:Lna0;

    .line 15
    iput-object p14, p0, Lv52;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 16
    iput-object p15, p0, Lv52;->o:Ljava/net/Proxy;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lv52;->p:Lgd3;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lv52;->q:Ljava/net/ProxySelector;

    move/from16 p1, p18

    .line 19
    iput-boolean p1, p0, Lv52;->r:Z

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lv52;->s:Ljavax/net/SocketFactory;

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lv52;->t:Ljavax/net/ssl/SSLSocketFactory;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lv52;->u:Ljavax/net/ssl/X509TrustManager;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lv52;->v:Lup0;

    return-void
.end method

.method public static a(Lv52;ILf90;Lk82;I)Lv52;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    and-int/lit8 v1, p4, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v1, v0, Lv52;->c:I

    .line 8
    .line 9
    move v5, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move/from16 v5, p1

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v1, p4, 0x2

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, v0, Lv52;->d:Lf90;

    .line 18
    .line 19
    move-object v6, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object/from16 v6, p2

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v1, p4, 0x4

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-object v1, v0, Lv52;->e:Lk82;

    .line 28
    .line 29
    move-object v7, v1

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move-object/from16 v7, p3

    .line 32
    .line 33
    :goto_2
    iget v8, v0, Lv52;->f:I

    .line 34
    .line 35
    iget v9, v0, Lv52;->g:I

    .line 36
    .line 37
    iget v10, v0, Lv52;->h:I

    .line 38
    .line 39
    iget-object v11, v0, Lv52;->i:Lgd3;

    .line 40
    .line 41
    iget-object v12, v0, Lv52;->j:Lcq;

    .line 42
    .line 43
    iget-object v13, v0, Lv52;->k:Ln4;

    .line 44
    .line 45
    iget-object v14, v0, Lv52;->l:Lsn;

    .line 46
    .line 47
    iget-object v15, v0, Lv52;->m:Lna0;

    .line 48
    .line 49
    iget-object v1, v0, Lv52;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 50
    .line 51
    iget-object v2, v0, Lv52;->o:Ljava/net/Proxy;

    .line 52
    .line 53
    iget-object v3, v0, Lv52;->p:Lgd3;

    .line 54
    .line 55
    iget-object v4, v0, Lv52;->q:Ljava/net/ProxySelector;

    .line 56
    .line 57
    move-object/from16 v16, v1

    .line 58
    .line 59
    iget-boolean v1, v0, Lv52;->r:Z

    .line 60
    .line 61
    move/from16 v20, v1

    .line 62
    .line 63
    iget-object v1, v0, Lv52;->s:Ljavax/net/SocketFactory;

    .line 64
    .line 65
    move-object/from16 v21, v1

    .line 66
    .line 67
    iget-object v1, v0, Lv52;->t:Ljavax/net/ssl/SSLSocketFactory;

    .line 68
    .line 69
    move-object/from16 v22, v1

    .line 70
    .line 71
    iget-object v1, v0, Lv52;->u:Ljavax/net/ssl/X509TrustManager;

    .line 72
    .line 73
    move-object/from16 v23, v1

    .line 74
    .line 75
    iget-object v1, v0, Lv52;->v:Lup0;

    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-object/from16 v17, v2

    .line 108
    .line 109
    new-instance v2, Lv52;

    .line 110
    .line 111
    move-object/from16 v18, v3

    .line 112
    .line 113
    iget-object v3, v0, Lv52;->a:Ls52;

    .line 114
    .line 115
    iget-object v0, v0, Lv52;->b:Ljava/util/ArrayList;

    .line 116
    .line 117
    move-object/from16 v24, v1

    .line 118
    .line 119
    move-object/from16 v19, v4

    .line 120
    .line 121
    move-object v4, v0

    .line 122
    invoke-direct/range {v2 .. v24}, Lv52;-><init>(Ls52;Ljava/util/ArrayList;ILf90;Lk82;IIILgd3;Lcq;Ln4;Lsn;Lna0;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lgd3;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lup0;)V

    .line 123
    .line 124
    .line 125
    return-object v2
.end method


# virtual methods
.method public final b(Lk82;)Lr92;
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, " must call proceed() exactly once"

    .line 6
    .line 7
    iget-object v3, v0, Lv52;->d:Lf90;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget v4, v0, Lv52;->c:I

    .line 13
    .line 14
    iget-object v5, v0, Lv52;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    const/4 v7, 0x0

    .line 21
    if-ge v4, v6, :cond_4c

    .line 22
    .line 23
    iget v6, v0, Lv52;->w:I

    .line 24
    .line 25
    const/4 v8, 0x1

    .line 26
    add-int/2addr v6, v8

    .line 27
    iput v6, v0, Lv52;->w:I

    .line 28
    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    iget-object v6, v3, Lf90;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v6, Lyg0;

    .line 34
    .line 35
    invoke-interface {v6}, Lyg0;->i()Lx52;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    iget-object v9, v1, Lk82;->a:Lyw0;

    .line 40
    .line 41
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v6, v6, Lx52;->i:Lq5;

    .line 48
    .line 49
    iget-object v6, v6, Lq5;->i:Lyw0;

    .line 50
    .line 51
    iget v10, v9, Lyw0;->e:I

    .line 52
    .line 53
    iget v11, v6, Lyw0;->e:I

    .line 54
    .line 55
    if-ne v10, v11, :cond_1

    .line 56
    .line 57
    iget-object v9, v9, Lyw0;->d:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v6, v6, Lyw0;->d:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v9, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    iget v6, v0, Lv52;->w:I

    .line 68
    .line 69
    if-ne v6, v8, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    sub-int/2addr v4, v8

    .line 73
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0, v2}, Lc80;->i(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-object v7

    .line 81
    :cond_1
    sub-int/2addr v4, v8

    .line 82
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, " must retain the same host and port"

    .line 87
    .line 88
    invoke-static {v0, v1}, Lc80;->i(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-object v7

    .line 92
    :cond_2
    :goto_0
    add-int/lit8 v6, v4, 0x1

    .line 93
    .line 94
    const v9, 0x1ffffa

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v6, v7, v1, v9}, Lv52;->a(Lv52;ILf90;Lk82;I)Lv52;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    move-object v4, v0

    .line 106
    check-cast v4, Lzo;

    .line 107
    .line 108
    iget v0, v4, Lzo;->a:I

    .line 109
    .line 110
    packed-switch v0, :pswitch_data_0

    .line 111
    .line 112
    .line 113
    iget-object v0, v1, Lv52;->e:Lk82;

    .line 114
    .line 115
    iget-object v11, v1, Lv52;->a:Ls52;

    .line 116
    .line 117
    sget-object v12, Lbe0;->h:Lbe0;

    .line 118
    .line 119
    move-object/from16 v24, v7

    .line 120
    .line 121
    move-object v13, v12

    .line 122
    const/16 v25, 0x0

    .line 123
    .line 124
    move-object v12, v0

    .line 125
    move v0, v8

    .line 126
    :goto_1
    iget-object v14, v11, Ls52;->r:Lf90;

    .line 127
    .line 128
    if-nez v14, :cond_f

    .line 129
    .line 130
    monitor-enter v11

    .line 131
    :try_start_0
    iget-boolean v14, v11, Ls52;->t:Z

    .line 132
    .line 133
    if-nez v14, :cond_e

    .line 134
    .line 135
    iget-boolean v14, v11, Ls52;->s:Z

    .line 136
    .line 137
    if-nez v14, :cond_d

    .line 138
    .line 139
    iget-boolean v14, v11, Ls52;->v:Z

    .line 140
    .line 141
    if-nez v14, :cond_d

    .line 142
    .line 143
    iget-boolean v14, v11, Ls52;->u:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 144
    .line 145
    if-nez v14, :cond_d

    .line 146
    .line 147
    monitor-exit v11

    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    new-instance v0, Lx52;

    .line 151
    .line 152
    iget-object v14, v11, Ls52;->h:Let1;

    .line 153
    .line 154
    iget-object v15, v14, Let1;->D:Liy2;

    .line 155
    .line 156
    iget-object v7, v1, Lv52;->k:Ln4;

    .line 157
    .line 158
    iget-object v7, v7, Ln4;->i:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v7, Lud0;

    .line 161
    .line 162
    iget v8, v1, Lv52;->g:I

    .line 163
    .line 164
    move-object/from16 v16, v15

    .line 165
    .line 166
    iget v15, v1, Lv52;->h:I

    .line 167
    .line 168
    iget v9, v1, Lv52;->f:I

    .line 169
    .line 170
    iget-boolean v10, v1, Lv52;->r:Z

    .line 171
    .line 172
    iget-boolean v14, v14, Let1;->f:Z

    .line 173
    .line 174
    move-object/from16 v17, v0

    .line 175
    .line 176
    iget-object v0, v12, Lk82;->a:Lyw0;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-object/from16 v27, v3

    .line 182
    .line 183
    iget-object v3, v0, Lyw0;->a:Ljava/lang/String;

    .line 184
    .line 185
    move-object/from16 v28, v5

    .line 186
    .line 187
    const-string v5, "https"

    .line 188
    .line 189
    invoke-static {v3, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-eqz v3, :cond_3

    .line 194
    .line 195
    iget-object v3, v1, Lv52;->t:Ljavax/net/ssl/SSLSocketFactory;

    .line 196
    .line 197
    iget-object v5, v1, Lv52;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 198
    .line 199
    move-object/from16 v18, v3

    .line 200
    .line 201
    iget-object v3, v1, Lv52;->j:Lcq;

    .line 202
    .line 203
    move-object/from16 v36, v3

    .line 204
    .line 205
    move-object/from16 v35, v5

    .line 206
    .line 207
    move-object/from16 v34, v18

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_3
    const/16 v34, 0x0

    .line 211
    .line 212
    const/16 v35, 0x0

    .line 213
    .line 214
    const/16 v36, 0x0

    .line 215
    .line 216
    :goto_2
    new-instance v29, Lq5;

    .line 217
    .line 218
    iget-object v3, v0, Lyw0;->d:Ljava/lang/String;

    .line 219
    .line 220
    iget v0, v0, Lyw0;->e:I

    .line 221
    .line 222
    iget-object v5, v1, Lv52;->m:Lna0;

    .line 223
    .line 224
    move/from16 v31, v0

    .line 225
    .line 226
    iget-object v0, v1, Lv52;->s:Ljavax/net/SocketFactory;

    .line 227
    .line 228
    move-object/from16 v33, v0

    .line 229
    .line 230
    iget-object v0, v1, Lv52;->p:Lgd3;

    .line 231
    .line 232
    move-object/from16 v37, v0

    .line 233
    .line 234
    iget-object v0, v1, Lv52;->o:Ljava/net/Proxy;

    .line 235
    .line 236
    move-object/from16 v38, v0

    .line 237
    .line 238
    iget-object v0, v1, Lv52;->a:Ls52;

    .line 239
    .line 240
    iget-object v0, v0, Ls52;->h:Let1;

    .line 241
    .line 242
    move-object/from16 v30, v3

    .line 243
    .line 244
    iget-object v3, v0, Let1;->s:Ljava/util/List;

    .line 245
    .line 246
    iget-object v0, v0, Let1;->r:Ljava/util/List;

    .line 247
    .line 248
    move-object/from16 v40, v0

    .line 249
    .line 250
    iget-object v0, v1, Lv52;->q:Ljava/net/ProxySelector;

    .line 251
    .line 252
    move-object/from16 v41, v0

    .line 253
    .line 254
    move-object/from16 v39, v3

    .line 255
    .line 256
    move-object/from16 v32, v5

    .line 257
    .line 258
    invoke-direct/range {v29 .. v41}, Lq5;-><init>(Ljava/lang/String;ILna0;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lcq;Lgd3;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 259
    .line 260
    .line 261
    iget-object v0, v11, Ls52;->h:Let1;

    .line 262
    .line 263
    iget-object v0, v0, Let1;->C:Lhh1;

    .line 264
    .line 265
    move-object/from16 v22, v11

    .line 266
    .line 267
    move-object/from16 v11, v17

    .line 268
    .line 269
    move/from16 v17, v8

    .line 270
    .line 271
    move-object/from16 v21, v0

    .line 272
    .line 273
    move/from16 v18, v10

    .line 274
    .line 275
    move-object/from16 v23, v12

    .line 276
    .line 277
    move-object v3, v13

    .line 278
    move/from16 v19, v14

    .line 279
    .line 280
    move-object/from16 v12, v16

    .line 281
    .line 282
    move-object/from16 v20, v29

    .line 283
    .line 284
    move-object v13, v7

    .line 285
    move v14, v8

    .line 286
    move/from16 v16, v9

    .line 287
    .line 288
    invoke-direct/range {v11 .. v23}, Lx52;-><init>(Liy2;Lud0;IIIIZZLq5;Lhh1;Ls52;Lk82;)V

    .line 289
    .line 290
    .line 291
    move-object/from16 v5, v22

    .line 292
    .line 293
    move-object/from16 v12, v23

    .line 294
    .line 295
    iget-object v0, v5, Ls52;->h:Let1;

    .line 296
    .line 297
    iget-boolean v7, v0, Let1;->f:Z

    .line 298
    .line 299
    if-eqz v7, :cond_4

    .line 300
    .line 301
    new-instance v7, Lyh0;

    .line 302
    .line 303
    iget-object v0, v0, Let1;->D:Liy2;

    .line 304
    .line 305
    invoke-direct {v7, v11, v0}, Lyh0;-><init>(Lx52;Liy2;)V

    .line 306
    .line 307
    .line 308
    goto :goto_3

    .line 309
    :cond_4
    new-instance v7, Lhh1;

    .line 310
    .line 311
    const/16 v0, 0xc

    .line 312
    .line 313
    invoke-direct {v7, v0, v11}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    :goto_3
    iput-object v7, v5, Ls52;->o:Lyg0;

    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_5
    move-object/from16 v27, v3

    .line 320
    .line 321
    move-object/from16 v28, v5

    .line 322
    .line 323
    move-object v5, v11

    .line 324
    move-object v3, v13

    .line 325
    :goto_4
    :try_start_1
    iget-boolean v0, v5, Ls52;->x:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 326
    .line 327
    if-nez v0, :cond_c

    .line 328
    .line 329
    :try_start_2
    invoke-virtual {v1, v12}, Lv52;->b(Lk82;)Lr92;

    .line 330
    .line 331
    .line 332
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 333
    :try_start_3
    invoke-virtual {v0}, Lr92;->b()Lp92;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iput-object v12, v0, Lp92;->a:Lk82;

    .line 338
    .line 339
    if-eqz v24, :cond_6

    .line 340
    .line 341
    invoke-static/range {v24 .. v24}, Ldf3;->f(Lr92;)Lr92;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    goto :goto_5

    .line 346
    :catchall_0
    move-exception v0

    .line 347
    const/4 v8, 0x1

    .line 348
    goto/16 :goto_8

    .line 349
    .line 350
    :cond_6
    const/4 v7, 0x0

    .line 351
    :goto_5
    iput-object v7, v0, Lp92;->k:Lr92;

    .line 352
    .line 353
    invoke-virtual {v0}, Lp92;->a()Lr92;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iget-object v7, v5, Ls52;->r:Lf90;

    .line 358
    .line 359
    invoke-static {v0, v7, v1}, Lzo;->a(Lr92;Lf90;Lv52;)Lk82;

    .line 360
    .line 361
    .line 362
    move-result-object v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 363
    if-nez v12, :cond_7

    .line 364
    .line 365
    :try_start_4
    iget-object v3, v5, Ls52;->k:Lkg0;

    .line 366
    .line 367
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 368
    .line 369
    .line 370
    const/4 v3, 0x0

    .line 371
    :goto_6
    invoke-virtual {v5, v3}, Ls52;->i(Z)V

    .line 372
    .line 373
    .line 374
    goto/16 :goto_b

    .line 375
    .line 376
    :catchall_1
    move-exception v0

    .line 377
    const/4 v8, 0x0

    .line 378
    goto/16 :goto_8

    .line 379
    .line 380
    :cond_7
    :try_start_5
    iget-object v7, v12, Lk82;->d:Lo82;

    .line 381
    .line 382
    if-eqz v7, :cond_8

    .line 383
    .line 384
    invoke-virtual {v7}, Lo82;->c()Z

    .line 385
    .line 386
    .line 387
    move-result v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 388
    if-eqz v7, :cond_8

    .line 389
    .line 390
    :try_start_6
    iget-object v3, v5, Ls52;->k:Lkg0;

    .line 391
    .line 392
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 393
    .line 394
    .line 395
    const/4 v3, 0x0

    .line 396
    goto :goto_6

    .line 397
    :cond_8
    :try_start_7
    iget-object v7, v0, Lr92;->n:Lu92;

    .line 398
    .line 399
    invoke-static {v7}, Lug3;->b(Ljava/io/Closeable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 400
    .line 401
    .line 402
    add-int/lit8 v7, v25, 0x1

    .line 403
    .line 404
    iget-object v8, v5, Ls52;->k:Lkg0;

    .line 405
    .line 406
    const/16 v9, 0x14

    .line 407
    .line 408
    if-gt v7, v9, :cond_9

    .line 409
    .line 410
    :try_start_8
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 411
    .line 412
    .line 413
    const/4 v8, 0x1

    .line 414
    invoke-virtual {v5, v8}, Ls52;->i(Z)V

    .line 415
    .line 416
    .line 417
    move-object/from16 v24, v0

    .line 418
    .line 419
    move-object v13, v3

    .line 420
    move-object v11, v5

    .line 421
    move/from16 v25, v7

    .line 422
    .line 423
    move-object/from16 v3, v27

    .line 424
    .line 425
    move-object/from16 v5, v28

    .line 426
    .line 427
    const/4 v0, 0x1

    .line 428
    const/4 v7, 0x0

    .line 429
    const/4 v8, 0x1

    .line 430
    goto/16 :goto_1

    .line 431
    .line 432
    :cond_9
    :try_start_9
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    new-instance v0, Ljava/net/ProtocolException;

    .line 436
    .line 437
    new-instance v1, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 440
    .line 441
    .line 442
    const-string v2, "Too many follow-up requests: "

    .line 443
    .line 444
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    throw v0

    .line 458
    :catch_0
    move-exception v0

    .line 459
    invoke-static {v0, v5, v1, v12}, Lzo;->b(Ljava/io/IOException;Ls52;Lv52;Lk82;)Z

    .line 460
    .line 461
    .line 462
    move-result v7

    .line 463
    iget-object v8, v5, Ls52;->k:Lkg0;

    .line 464
    .line 465
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    if-nez v7, :cond_b

    .line 469
    .line 470
    sget-object v1, Lug3;->a:[B

    .line 471
    .line 472
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    if-eqz v2, :cond_a

    .line 481
    .line 482
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    check-cast v2, Ljava/lang/Exception;

    .line 487
    .line 488
    invoke-static {v0, v2}, Lfg1;->m(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 489
    .line 490
    .line 491
    goto :goto_7

    .line 492
    :cond_a
    throw v0

    .line 493
    :cond_b
    invoke-static {v3, v0}, Ldu;->y0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 494
    .line 495
    .line 496
    move-result-object v13
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 497
    const/4 v8, 0x1

    .line 498
    invoke-virtual {v5, v8}, Ls52;->i(Z)V

    .line 499
    .line 500
    .line 501
    move-object v11, v5

    .line 502
    move-object/from16 v3, v27

    .line 503
    .line 504
    move-object/from16 v5, v28

    .line 505
    .line 506
    const/4 v0, 0x0

    .line 507
    const/4 v7, 0x0

    .line 508
    goto/16 :goto_1

    .line 509
    .line 510
    :cond_c
    :try_start_a
    new-instance v0, Ljava/io/IOException;

    .line 511
    .line 512
    const-string v1, "Canceled"

    .line 513
    .line 514
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 518
    :goto_8
    invoke-virtual {v5, v8}, Ls52;->i(Z)V

    .line 519
    .line 520
    .line 521
    throw v0

    .line 522
    :cond_d
    move-object v5, v11

    .line 523
    goto :goto_9

    .line 524
    :catchall_2
    move-exception v0

    .line 525
    move-object v5, v11

    .line 526
    goto :goto_a

    .line 527
    :goto_9
    :try_start_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 528
    .line 529
    const-string v1, "Check failed."

    .line 530
    .line 531
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    throw v0

    .line 535
    :catchall_3
    move-exception v0

    .line 536
    goto :goto_a

    .line 537
    :cond_e
    move-object v5, v11

    .line 538
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 539
    .line 540
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 541
    .line 542
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 546
    :goto_a
    monitor-exit v5

    .line 547
    throw v0

    .line 548
    :cond_f
    move-object/from16 v27, v3

    .line 549
    .line 550
    move-object/from16 v28, v5

    .line 551
    .line 552
    const-string v0, "Check failed."

    .line 553
    .line 554
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    const/4 v0, 0x0

    .line 558
    :goto_b
    move-object/from16 v16, v2

    .line 559
    .line 560
    move-object/from16 p0, v4

    .line 561
    .line 562
    goto/16 :goto_24

    .line 563
    .line 564
    :pswitch_0
    move-object/from16 v27, v3

    .line 565
    .line 566
    move-object/from16 v28, v5

    .line 567
    .line 568
    const-string v0, "networkResponse"

    .line 569
    .line 570
    const-string v3, "Content-Type"

    .line 571
    .line 572
    const-string v5, "Content-Encoding"

    .line 573
    .line 574
    const-string v7, "Content-Length"

    .line 575
    .line 576
    const-string v8, "cacheResponse"

    .line 577
    .line 578
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 579
    .line 580
    .line 581
    iget-object v9, v1, Lv52;->e:Lk82;

    .line 582
    .line 583
    new-instance v10, Lsz0;

    .line 584
    .line 585
    const/4 v11, 0x4

    .line 586
    const/4 v12, 0x0

    .line 587
    invoke-direct {v10, v11, v9, v12}, Lsz0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    iget-object v12, v9, Lk82;->f:Loo;

    .line 591
    .line 592
    if-nez v12, :cond_10

    .line 593
    .line 594
    sget v12, Loo;->n:I

    .line 595
    .line 596
    iget-object v12, v9, Lk82;->c:Ljs0;

    .line 597
    .line 598
    invoke-static {v12}, Lci0;->Q(Ljs0;)Loo;

    .line 599
    .line 600
    .line 601
    move-result-object v12

    .line 602
    iput-object v12, v9, Lk82;->f:Loo;

    .line 603
    .line 604
    :cond_10
    iget-boolean v9, v12, Loo;->j:Z

    .line 605
    .line 606
    if-eqz v9, :cond_11

    .line 607
    .line 608
    new-instance v10, Lsz0;

    .line 609
    .line 610
    const/4 v12, 0x0

    .line 611
    invoke-direct {v10, v11, v12, v12}, Lsz0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    :cond_11
    iget-object v9, v10, Lsz0;->i:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v9, Lk82;

    .line 617
    .line 618
    iget-object v10, v10, Lsz0;->j:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v10, Lr92;

    .line 621
    .line 622
    if-nez v9, :cond_12

    .line 623
    .line 624
    if-nez v10, :cond_12

    .line 625
    .line 626
    sget-object v36, Lu92;->i:Lt92;

    .line 627
    .line 628
    sget-object v46, Le33;->g:Lix2;

    .line 629
    .line 630
    new-instance v0, Ljava/util/ArrayList;

    .line 631
    .line 632
    const/16 v9, 0x14

    .line 633
    .line 634
    invoke-direct {v0, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 635
    .line 636
    .line 637
    iget-object v3, v1, Lv52;->e:Lk82;

    .line 638
    .line 639
    sget-object v31, Lc42;->k:Lc42;

    .line 640
    .line 641
    const-string v32, "Unsatisfiable Request (only-if-cached)"

    .line 642
    .line 643
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 644
    .line 645
    .line 646
    move-result-wide v43

    .line 647
    new-instance v5, Ljs0;

    .line 648
    .line 649
    const/4 v7, 0x0

    .line 650
    new-array v7, v7, [Ljava/lang/String;

    .line 651
    .line 652
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    check-cast v0, [Ljava/lang/String;

    .line 657
    .line 658
    invoke-direct {v5, v0}, Ljs0;-><init>([Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    new-instance v29, Lr92;

    .line 662
    .line 663
    const/16 v33, 0x1f8

    .line 664
    .line 665
    const/16 v34, 0x0

    .line 666
    .line 667
    const/16 v37, 0x0

    .line 668
    .line 669
    const/16 v38, 0x0

    .line 670
    .line 671
    const/16 v39, 0x0

    .line 672
    .line 673
    const/16 v40, 0x0

    .line 674
    .line 675
    const-wide/16 v41, -0x1

    .line 676
    .line 677
    const/16 v45, 0x0

    .line 678
    .line 679
    move-object/from16 v30, v3

    .line 680
    .line 681
    move-object/from16 v35, v5

    .line 682
    .line 683
    invoke-direct/range {v29 .. v46}, Lr92;-><init>(Lk82;Lc42;Ljava/lang/String;ILyr0;Ljs0;Lu92;Lys2;Lr92;Lr92;Lr92;JJLf90;Le33;)V

    .line 684
    .line 685
    .line 686
    iget-object v0, v1, Lv52;->a:Ls52;

    .line 687
    .line 688
    iget-object v0, v0, Ls52;->k:Lkg0;

    .line 689
    .line 690
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    move-object/from16 v0, v29

    .line 694
    .line 695
    goto/16 :goto_b

    .line 696
    .line 697
    :cond_12
    if-nez v9, :cond_13

    .line 698
    .line 699
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v10}, Lr92;->b()Lp92;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-static {v10}, Ldf3;->f(Lr92;)Lr92;

    .line 707
    .line 708
    .line 709
    move-result-object v3

    .line 710
    invoke-static {v8, v3}, Lp92;->b(Ljava/lang/String;Lr92;)V

    .line 711
    .line 712
    .line 713
    iput-object v3, v0, Lp92;->j:Lr92;

    .line 714
    .line 715
    invoke-virtual {v0}, Lp92;->a()Lr92;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    iget-object v3, v1, Lv52;->a:Ls52;

    .line 720
    .line 721
    iget-object v3, v3, Ls52;->k:Lkg0;

    .line 722
    .line 723
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    goto/16 :goto_b

    .line 727
    .line 728
    :cond_13
    if-eqz v10, :cond_14

    .line 729
    .line 730
    iget-object v11, v1, Lv52;->a:Ls52;

    .line 731
    .line 732
    iget-object v11, v11, Ls52;->k:Lkg0;

    .line 733
    .line 734
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    :cond_14
    invoke-virtual {v1, v9}, Lv52;->b(Lk82;)Lr92;

    .line 738
    .line 739
    .line 740
    move-result-object v9

    .line 741
    if-eqz v10, :cond_1f

    .line 742
    .line 743
    iget v11, v9, Lr92;->k:I

    .line 744
    .line 745
    const/16 v12, 0x130

    .line 746
    .line 747
    if-ne v11, v12, :cond_1e

    .line 748
    .line 749
    invoke-virtual {v10}, Lr92;->b()Lp92;

    .line 750
    .line 751
    .line 752
    move-result-object v1

    .line 753
    iget-object v2, v10, Lr92;->m:Ljs0;

    .line 754
    .line 755
    iget-object v4, v9, Lr92;->m:Ljs0;

    .line 756
    .line 757
    new-instance v6, Ljava/util/ArrayList;

    .line 758
    .line 759
    const/16 v11, 0x14

    .line 760
    .line 761
    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v2}, Ljs0;->size()I

    .line 765
    .line 766
    .line 767
    move-result v11

    .line 768
    const/4 v12, 0x0

    .line 769
    :goto_c
    if-ge v12, v11, :cond_1a

    .line 770
    .line 771
    invoke-virtual {v2, v12}, Ljs0;->b(I)Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v13

    .line 775
    invoke-virtual {v2, v12}, Ljs0;->d(I)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v14

    .line 779
    const-string v15, "Warning"

    .line 780
    .line 781
    invoke-virtual {v15, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 782
    .line 783
    .line 784
    move-result v15

    .line 785
    if-eqz v15, :cond_15

    .line 786
    .line 787
    const-string v15, "1"

    .line 788
    .line 789
    move-object/from16 v16, v2

    .line 790
    .line 791
    const/4 v2, 0x0

    .line 792
    invoke-static {v14, v15, v2}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 793
    .line 794
    .line 795
    move-result v15

    .line 796
    if-eqz v15, :cond_16

    .line 797
    .line 798
    goto :goto_e

    .line 799
    :cond_15
    move-object/from16 v16, v2

    .line 800
    .line 801
    :cond_16
    invoke-virtual {v7, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 802
    .line 803
    .line 804
    move-result v2

    .line 805
    if-nez v2, :cond_18

    .line 806
    .line 807
    invoke-virtual {v5, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 808
    .line 809
    .line 810
    move-result v2

    .line 811
    if-nez v2, :cond_18

    .line 812
    .line 813
    invoke-virtual {v3, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 814
    .line 815
    .line 816
    move-result v2

    .line 817
    if-eqz v2, :cond_17

    .line 818
    .line 819
    goto :goto_d

    .line 820
    :cond_17
    invoke-static {v13}, Lop0;->r(Ljava/lang/String;)Z

    .line 821
    .line 822
    .line 823
    move-result v2

    .line 824
    if-eqz v2, :cond_18

    .line 825
    .line 826
    invoke-virtual {v4, v13}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    if-nez v2, :cond_19

    .line 831
    .line 832
    :cond_18
    :goto_d
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    invoke-static {v14}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    :cond_19
    :goto_e
    add-int/lit8 v12, v12, 0x1

    .line 847
    .line 848
    move-object/from16 v2, v16

    .line 849
    .line 850
    goto :goto_c

    .line 851
    :cond_1a
    invoke-virtual {v4}, Ljs0;->size()I

    .line 852
    .line 853
    .line 854
    move-result v2

    .line 855
    const/4 v11, 0x0

    .line 856
    :goto_f
    if-ge v11, v2, :cond_1d

    .line 857
    .line 858
    invoke-virtual {v4, v11}, Ljs0;->b(I)Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v12

    .line 862
    invoke-virtual {v7, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 863
    .line 864
    .line 865
    move-result v13

    .line 866
    if-nez v13, :cond_1c

    .line 867
    .line 868
    invoke-virtual {v5, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 869
    .line 870
    .line 871
    move-result v13

    .line 872
    if-nez v13, :cond_1c

    .line 873
    .line 874
    invoke-virtual {v3, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 875
    .line 876
    .line 877
    move-result v13

    .line 878
    if-eqz v13, :cond_1b

    .line 879
    .line 880
    goto :goto_10

    .line 881
    :cond_1b
    invoke-static {v12}, Lop0;->r(Ljava/lang/String;)Z

    .line 882
    .line 883
    .line 884
    move-result v13

    .line 885
    if-eqz v13, :cond_1c

    .line 886
    .line 887
    invoke-virtual {v4, v11}, Ljs0;->d(I)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v13

    .line 891
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    invoke-static {v13}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 895
    .line 896
    .line 897
    move-result-object v12

    .line 898
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v12

    .line 902
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 903
    .line 904
    .line 905
    :cond_1c
    :goto_10
    add-int/lit8 v11, v11, 0x1

    .line 906
    .line 907
    goto :goto_f

    .line 908
    :cond_1d
    new-instance v2, Ljs0;

    .line 909
    .line 910
    const/4 v3, 0x0

    .line 911
    new-array v3, v3, [Ljava/lang/String;

    .line 912
    .line 913
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v3

    .line 917
    check-cast v3, [Ljava/lang/String;

    .line 918
    .line 919
    invoke-direct {v2, v3}, Ljs0;-><init>([Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v2}, Ljs0;->c()Lye0;

    .line 923
    .line 924
    .line 925
    move-result-object v2

    .line 926
    iput-object v2, v1, Lp92;->f:Lye0;

    .line 927
    .line 928
    iget-wide v2, v9, Lr92;->s:J

    .line 929
    .line 930
    iput-wide v2, v1, Lp92;->l:J

    .line 931
    .line 932
    iget-wide v2, v9, Lr92;->t:J

    .line 933
    .line 934
    iput-wide v2, v1, Lp92;->m:J

    .line 935
    .line 936
    invoke-static {v10}, Ldf3;->f(Lr92;)Lr92;

    .line 937
    .line 938
    .line 939
    move-result-object v2

    .line 940
    invoke-static {v8, v2}, Lp92;->b(Ljava/lang/String;Lr92;)V

    .line 941
    .line 942
    .line 943
    iput-object v2, v1, Lp92;->j:Lr92;

    .line 944
    .line 945
    invoke-static {v9}, Ldf3;->f(Lr92;)Lr92;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    invoke-static {v0, v2}, Lp92;->b(Ljava/lang/String;Lr92;)V

    .line 950
    .line 951
    .line 952
    iput-object v2, v1, Lp92;->i:Lr92;

    .line 953
    .line 954
    invoke-virtual {v1}, Lp92;->a()Lr92;

    .line 955
    .line 956
    .line 957
    iget-object v0, v9, Lr92;->n:Lu92;

    .line 958
    .line 959
    invoke-virtual {v0}, Lu92;->close()V

    .line 960
    .line 961
    .line 962
    const/16 v26, 0x0

    .line 963
    .line 964
    throw v26

    .line 965
    :cond_1e
    iget-object v3, v10, Lr92;->n:Lu92;

    .line 966
    .line 967
    invoke-static {v3}, Lug3;->b(Ljava/io/Closeable;)V

    .line 968
    .line 969
    .line 970
    :cond_1f
    invoke-virtual {v9}, Lr92;->b()Lp92;

    .line 971
    .line 972
    .line 973
    move-result-object v3

    .line 974
    if-eqz v10, :cond_20

    .line 975
    .line 976
    invoke-static {v10}, Ldf3;->f(Lr92;)Lr92;

    .line 977
    .line 978
    .line 979
    move-result-object v5

    .line 980
    goto :goto_11

    .line 981
    :cond_20
    const/4 v5, 0x0

    .line 982
    :goto_11
    invoke-static {v8, v5}, Lp92;->b(Ljava/lang/String;Lr92;)V

    .line 983
    .line 984
    .line 985
    iput-object v5, v3, Lp92;->j:Lr92;

    .line 986
    .line 987
    invoke-static {v9}, Ldf3;->f(Lr92;)Lr92;

    .line 988
    .line 989
    .line 990
    move-result-object v5

    .line 991
    invoke-static {v0, v5}, Lp92;->b(Ljava/lang/String;Lr92;)V

    .line 992
    .line 993
    .line 994
    iput-object v5, v3, Lp92;->i:Lr92;

    .line 995
    .line 996
    invoke-virtual {v3}, Lp92;->a()Lr92;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    goto/16 :goto_b

    .line 1001
    .line 1002
    :pswitch_1
    move-object/from16 v27, v3

    .line 1003
    .line 1004
    move-object/from16 v28, v5

    .line 1005
    .line 1006
    const-string v0, "Content-Encoding"

    .line 1007
    .line 1008
    const-string v3, "User-Agent"

    .line 1009
    .line 1010
    const-string v5, "gzip"

    .line 1011
    .line 1012
    const-string v7, "Accept-Encoding"

    .line 1013
    .line 1014
    const-string v8, "Connection"

    .line 1015
    .line 1016
    const-string v9, "Host"

    .line 1017
    .line 1018
    const-string v10, "Transfer-Encoding"

    .line 1019
    .line 1020
    const-string v11, "Content-Type"

    .line 1021
    .line 1022
    const-string v12, "Content-Length"

    .line 1023
    .line 1024
    iget-object v13, v1, Lv52;->l:Lsn;

    .line 1025
    .line 1026
    iget-object v14, v1, Lv52;->e:Lk82;

    .line 1027
    .line 1028
    invoke-virtual {v14}, Lk82;->a()Lcj;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v15

    .line 1032
    move-object/from16 v16, v2

    .line 1033
    .line 1034
    iget-object v2, v14, Lk82;->a:Lyw0;

    .line 1035
    .line 1036
    move-object/from16 p0, v4

    .line 1037
    .line 1038
    iget-object v4, v14, Lk82;->c:Ljs0;

    .line 1039
    .line 1040
    iget-object v14, v14, Lk82;->d:Lo82;

    .line 1041
    .line 1042
    move-object/from16 v17, v13

    .line 1043
    .line 1044
    move-object/from16 v18, v14

    .line 1045
    .line 1046
    const-wide/16 v19, -0x1

    .line 1047
    .line 1048
    if-eqz v18, :cond_23

    .line 1049
    .line 1050
    invoke-virtual/range {v18 .. v18}, Lo82;->b()Lvf1;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v13

    .line 1054
    if-eqz v13, :cond_21

    .line 1055
    .line 1056
    iget-object v13, v13, Lvf1;->a:Ljava/lang/String;

    .line 1057
    .line 1058
    invoke-virtual {v15, v11, v13}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    :cond_21
    invoke-virtual/range {v18 .. v18}, Lo82;->a()J

    .line 1062
    .line 1063
    .line 1064
    move-result-wide v13

    .line 1065
    cmp-long v18, v13, v19

    .line 1066
    .line 1067
    if-eqz v18, :cond_22

    .line 1068
    .line 1069
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v13

    .line 1073
    invoke-virtual {v15, v12, v13}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 1074
    .line 1075
    .line 1076
    iget-object v13, v15, Lcj;->c:Ljava/lang/Object;

    .line 1077
    .line 1078
    check-cast v13, Lye0;

    .line 1079
    .line 1080
    invoke-virtual {v13, v10}, Lye0;->n(Ljava/lang/String;)V

    .line 1081
    .line 1082
    .line 1083
    goto :goto_12

    .line 1084
    :cond_22
    const-string v13, "chunked"

    .line 1085
    .line 1086
    invoke-virtual {v15, v10, v13}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 1087
    .line 1088
    .line 1089
    iget-object v10, v15, Lcj;->c:Ljava/lang/Object;

    .line 1090
    .line 1091
    check-cast v10, Lye0;

    .line 1092
    .line 1093
    invoke-virtual {v10, v12}, Lye0;->n(Ljava/lang/String;)V

    .line 1094
    .line 1095
    .line 1096
    :cond_23
    :goto_12
    invoke-virtual {v4, v9}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v10

    .line 1100
    if-nez v10, :cond_24

    .line 1101
    .line 1102
    const/4 v10, 0x0

    .line 1103
    invoke-static {v2, v10}, Lwg3;->h(Lyw0;Z)Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v13

    .line 1107
    invoke-virtual {v15, v9, v13}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    :cond_24
    invoke-virtual {v4, v8}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v9

    .line 1114
    if-nez v9, :cond_25

    .line 1115
    .line 1116
    const-string v9, "Keep-Alive"

    .line 1117
    .line 1118
    invoke-virtual {v15, v8, v9}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    :cond_25
    invoke-virtual {v4, v7}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v8

    .line 1125
    if-nez v8, :cond_26

    .line 1126
    .line 1127
    const-string v8, "Range"

    .line 1128
    .line 1129
    invoke-virtual {v4, v8}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v8

    .line 1133
    if-nez v8, :cond_26

    .line 1134
    .line 1135
    invoke-virtual {v15, v7, v5}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 1136
    .line 1137
    .line 1138
    const/4 v10, 0x1

    .line 1139
    goto :goto_13

    .line 1140
    :cond_26
    const/4 v10, 0x0

    .line 1141
    :goto_13
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v4, v3}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v2

    .line 1151
    if-nez v2, :cond_27

    .line 1152
    .line 1153
    const-string v2, "okhttp/5.4.0"

    .line 1154
    .line 1155
    invoke-virtual {v15, v3, v2}, Lcj;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 1156
    .line 1157
    .line 1158
    :cond_27
    new-instance v2, Lk82;

    .line 1159
    .line 1160
    invoke-direct {v2, v15}, Lk82;-><init>(Lcj;)V

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v1, v2}, Lv52;->b(Lk82;)Lr92;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v3

    .line 1167
    iget-object v4, v3, Lr92;->m:Ljs0;

    .line 1168
    .line 1169
    iget-object v7, v2, Lk82;->a:Lyw0;

    .line 1170
    .line 1171
    move-object/from16 v8, v17

    .line 1172
    .line 1173
    invoke-static {v8, v7, v4}, Lsw0;->b(Lsn;Lyw0;Ljs0;)V

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v3}, Lr92;->b()Lp92;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v7

    .line 1180
    iput-object v2, v7, Lp92;->a:Lk82;

    .line 1181
    .line 1182
    if-eqz v10, :cond_2a

    .line 1183
    .line 1184
    invoke-virtual {v4, v0}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v2

    .line 1188
    if-nez v2, :cond_28

    .line 1189
    .line 1190
    const/4 v2, 0x0

    .line 1191
    :cond_28
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1192
    .line 1193
    .line 1194
    move-result v2

    .line 1195
    if-eqz v2, :cond_2a

    .line 1196
    .line 1197
    invoke-static {v3}, Lsw0;->a(Lr92;)Z

    .line 1198
    .line 1199
    .line 1200
    move-result v2

    .line 1201
    if-eqz v2, :cond_2a

    .line 1202
    .line 1203
    iget-object v2, v3, Lr92;->n:Lu92;

    .line 1204
    .line 1205
    new-instance v3, Lor0;

    .line 1206
    .line 1207
    invoke-virtual {v2}, Lu92;->g()Lon;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v2

    .line 1211
    invoke-direct {v3, v2}, Lor0;-><init>(Lon;)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v4}, Ljs0;->c()Lye0;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v2

    .line 1218
    invoke-virtual {v2, v0}, Lye0;->n(Ljava/lang/String;)V

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v2, v12}, Lye0;->n(Ljava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v2}, Lye0;->b()Ljs0;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v0

    .line 1228
    invoke-virtual {v0}, Ljs0;->c()Lye0;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v0

    .line 1232
    iput-object v0, v7, Lp92;->f:Lye0;

    .line 1233
    .line 1234
    invoke-virtual {v4, v11}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v0

    .line 1238
    if-nez v0, :cond_29

    .line 1239
    .line 1240
    const/4 v0, 0x0

    .line 1241
    :cond_29
    new-instance v2, Lw52;

    .line 1242
    .line 1243
    new-instance v4, Lo52;

    .line 1244
    .line 1245
    invoke-direct {v4, v3}, Lo52;-><init>(Lht2;)V

    .line 1246
    .line 1247
    .line 1248
    move-wide/from16 v8, v19

    .line 1249
    .line 1250
    invoke-direct {v2, v0, v8, v9, v4}, Lw52;-><init>(Ljava/lang/String;JLo52;)V

    .line 1251
    .line 1252
    .line 1253
    iput-object v2, v7, Lp92;->g:Lu92;

    .line 1254
    .line 1255
    :cond_2a
    invoke-virtual {v7}, Lp92;->a()Lr92;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v0

    .line 1259
    goto/16 :goto_24

    .line 1260
    .line 1261
    :pswitch_2
    move-object/from16 v16, v2

    .line 1262
    .line 1263
    move-object/from16 v27, v3

    .line 1264
    .line 1265
    move-object/from16 p0, v4

    .line 1266
    .line 1267
    move-object/from16 v28, v5

    .line 1268
    .line 1269
    iget-object v2, v1, Lv52;->a:Ls52;

    .line 1270
    .line 1271
    monitor-enter v2

    .line 1272
    :try_start_c
    iget-boolean v0, v2, Ls52;->w:Z

    .line 1273
    .line 1274
    if-eqz v0, :cond_2e

    .line 1275
    .line 1276
    iget-boolean v0, v2, Ls52;->t:Z

    .line 1277
    .line 1278
    if-nez v0, :cond_2d

    .line 1279
    .line 1280
    iget-boolean v0, v2, Ls52;->s:Z

    .line 1281
    .line 1282
    if-nez v0, :cond_2d

    .line 1283
    .line 1284
    iget-boolean v0, v2, Ls52;->v:Z

    .line 1285
    .line 1286
    if-nez v0, :cond_2d

    .line 1287
    .line 1288
    iget-boolean v0, v2, Ls52;->u:Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 1289
    .line 1290
    if-nez v0, :cond_2d

    .line 1291
    .line 1292
    monitor-exit v2

    .line 1293
    iget-object v0, v2, Ls52;->o:Lyg0;

    .line 1294
    .line 1295
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1296
    .line 1297
    .line 1298
    invoke-interface {v0}, Lyg0;->e()Lt52;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v3

    .line 1302
    iget-object v4, v2, Ls52;->h:Let1;

    .line 1303
    .line 1304
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1305
    .line 1306
    .line 1307
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1308
    .line 1309
    .line 1310
    iget v5, v1, Lv52;->g:I

    .line 1311
    .line 1312
    iget-object v7, v3, Lt52;->h:Lb5;

    .line 1313
    .line 1314
    iget-object v8, v3, Lt52;->i:Lqv0;

    .line 1315
    .line 1316
    if-eqz v8, :cond_2b

    .line 1317
    .line 1318
    new-instance v5, Lrv0;

    .line 1319
    .line 1320
    invoke-direct {v5, v4, v3, v1, v8}, Lrv0;-><init>(Let1;Lt52;Lv52;Lqv0;)V

    .line 1321
    .line 1322
    .line 1323
    goto :goto_14

    .line 1324
    :cond_2b
    iget-object v8, v3, Lt52;->e:Ljava/net/Socket;

    .line 1325
    .line 1326
    invoke-virtual {v8, v5}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 1327
    .line 1328
    .line 1329
    iget-object v8, v7, Lb5;->j:Ljava/lang/Object;

    .line 1330
    .line 1331
    check-cast v8, Lo52;

    .line 1332
    .line 1333
    iget-object v8, v8, Lo52;->h:Lht2;

    .line 1334
    .line 1335
    invoke-interface {v8}, Lht2;->a()Lo23;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v8

    .line 1339
    int-to-long v9, v5

    .line 1340
    invoke-virtual {v8, v9, v10}, Lo23;->g(J)Lo23;

    .line 1341
    .line 1342
    .line 1343
    iget-object v5, v7, Lb5;->k:Ljava/lang/Object;

    .line 1344
    .line 1345
    check-cast v5, Ln52;

    .line 1346
    .line 1347
    iget-object v5, v5, Ln52;->h:Lfr2;

    .line 1348
    .line 1349
    invoke-interface {v5}, Lfr2;->a()Lo23;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v5

    .line 1353
    iget v8, v1, Lv52;->h:I

    .line 1354
    .line 1355
    int-to-long v8, v8

    .line 1356
    invoke-virtual {v5, v8, v9}, Lo23;->g(J)Lo23;

    .line 1357
    .line 1358
    .line 1359
    new-instance v5, Liv0;

    .line 1360
    .line 1361
    invoke-direct {v5, v4, v3, v7}, Liv0;-><init>(Let1;Lwg0;Lb5;)V

    .line 1362
    .line 1363
    .line 1364
    :goto_14
    new-instance v3, Lf90;

    .line 1365
    .line 1366
    invoke-direct {v3, v2, v0, v5}, Lf90;-><init>(Ls52;Lyg0;Lxg0;)V

    .line 1367
    .line 1368
    .line 1369
    iput-object v3, v2, Ls52;->r:Lf90;

    .line 1370
    .line 1371
    iput-object v3, v2, Ls52;->y:Lf90;

    .line 1372
    .line 1373
    monitor-enter v2

    .line 1374
    const/4 v8, 0x1

    .line 1375
    :try_start_d
    iput-boolean v8, v2, Ls52;->s:Z

    .line 1376
    .line 1377
    iput-boolean v8, v2, Ls52;->t:Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 1378
    .line 1379
    monitor-exit v2

    .line 1380
    iget-boolean v0, v2, Ls52;->x:Z

    .line 1381
    .line 1382
    if-nez v0, :cond_2c

    .line 1383
    .line 1384
    const v0, 0x1ffffd

    .line 1385
    .line 1386
    .line 1387
    const/4 v2, 0x0

    .line 1388
    const/4 v12, 0x0

    .line 1389
    invoke-static {v1, v2, v3, v12, v0}, Lv52;->a(Lv52;ILf90;Lk82;I)Lv52;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v0

    .line 1393
    iget-object v2, v1, Lv52;->e:Lk82;

    .line 1394
    .line 1395
    invoke-virtual {v0, v2}, Lv52;->b(Lk82;)Lr92;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v0

    .line 1399
    goto/16 :goto_24

    .line 1400
    .line 1401
    :cond_2c
    const-string v0, "Canceled"

    .line 1402
    .line 1403
    invoke-static {v0}, Lc80;->v(Ljava/lang/String;)V

    .line 1404
    .line 1405
    .line 1406
    const/4 v0, 0x0

    .line 1407
    goto/16 :goto_24

    .line 1408
    .line 1409
    :catchall_4
    move-exception v0

    .line 1410
    monitor-exit v2

    .line 1411
    throw v0

    .line 1412
    :catchall_5
    move-exception v0

    .line 1413
    goto :goto_15

    .line 1414
    :cond_2d
    :try_start_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1415
    .line 1416
    const-string v1, "Check failed."

    .line 1417
    .line 1418
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1419
    .line 1420
    .line 1421
    throw v0

    .line 1422
    :cond_2e
    const-string v0, "released"

    .line 1423
    .line 1424
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1425
    .line 1426
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1427
    .line 1428
    .line 1429
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 1430
    :goto_15
    monitor-exit v2

    .line 1431
    throw v0

    .line 1432
    :pswitch_3
    move-object/from16 v16, v2

    .line 1433
    .line 1434
    move-object/from16 v27, v3

    .line 1435
    .line 1436
    move-object/from16 p0, v4

    .line 1437
    .line 1438
    move-object/from16 v28, v5

    .line 1439
    .line 1440
    const-string v2, "close"

    .line 1441
    .line 1442
    const-string v3, "upgrade"

    .line 1443
    .line 1444
    const-string v4, "Connection"

    .line 1445
    .line 1446
    iget-object v8, v1, Lv52;->d:Lf90;

    .line 1447
    .line 1448
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1449
    .line 1450
    .line 1451
    iget-object v5, v1, Lv52;->e:Lk82;

    .line 1452
    .line 1453
    iget-object v0, v5, Lk82;->d:Lo82;

    .line 1454
    .line 1455
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1456
    .line 1457
    .line 1458
    move-result-wide v14

    .line 1459
    iget-object v7, v5, Lk82;->b:Ljava/lang/String;

    .line 1460
    .line 1461
    invoke-static {v7}, Lfg1;->I(Ljava/lang/String;)Z

    .line 1462
    .line 1463
    .line 1464
    move-result v7

    .line 1465
    if-eqz v7, :cond_2f

    .line 1466
    .line 1467
    if-eqz v0, :cond_2f

    .line 1468
    .line 1469
    const/4 v7, 0x1

    .line 1470
    goto :goto_16

    .line 1471
    :cond_2f
    const/4 v7, 0x0

    .line 1472
    :goto_16
    iget-object v9, v5, Lk82;->c:Ljs0;

    .line 1473
    .line 1474
    invoke-virtual {v9, v4}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v9

    .line 1478
    invoke-virtual {v3, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1479
    .line 1480
    .line 1481
    move-result v17

    .line 1482
    :try_start_f
    iget-object v9, v8, Lf90;->b:Ljava/lang/Object;

    .line 1483
    .line 1484
    check-cast v9, Ls52;

    .line 1485
    .line 1486
    iget-object v9, v9, Ls52;->k:Lkg0;

    .line 1487
    .line 1488
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1489
    .line 1490
    .line 1491
    iget-object v9, v8, Lf90;->d:Ljava/lang/Object;

    .line 1492
    .line 1493
    check-cast v9, Lxg0;

    .line 1494
    .line 1495
    invoke-interface {v9, v5}, Lxg0;->b(Lk82;)V

    .line 1496
    .line 1497
    .line 1498
    iget-object v9, v8, Lf90;->b:Ljava/lang/Object;

    .line 1499
    .line 1500
    check-cast v9, Ls52;

    .line 1501
    .line 1502
    iget-object v9, v9, Ls52;->k:Lkg0;

    .line 1503
    .line 1504
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_6

    .line 1505
    .line 1506
    .line 1507
    if-eqz v7, :cond_33

    .line 1508
    .line 1509
    :try_start_10
    const-string v7, "100-continue"

    .line 1510
    .line 1511
    const-string v9, "Expect"

    .line 1512
    .line 1513
    iget-object v10, v5, Lk82;->c:Ljs0;

    .line 1514
    .line 1515
    invoke-virtual {v10, v9}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v9

    .line 1519
    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1520
    .line 1521
    .line 1522
    move-result v7
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_2

    .line 1523
    if-eqz v7, :cond_30

    .line 1524
    .line 1525
    :try_start_11
    iget-object v7, v8, Lf90;->d:Ljava/lang/Object;

    .line 1526
    .line 1527
    check-cast v7, Lxg0;

    .line 1528
    .line 1529
    invoke-interface {v7}, Lxg0;->e()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_3

    .line 1530
    .line 1531
    .line 1532
    const/4 v7, 0x1

    .line 1533
    :try_start_12
    invoke-virtual {v8, v7}, Lf90;->f(Z)Lp92;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v9
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_2

    .line 1537
    :try_start_13
    iget-object v7, v8, Lf90;->b:Ljava/lang/Object;

    .line 1538
    .line 1539
    check-cast v7, Ls52;

    .line 1540
    .line 1541
    iget-object v7, v7, Ls52;->k:Lkg0;

    .line 1542
    .line 1543
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_1

    .line 1544
    .line 1545
    .line 1546
    move-object/from16 v19, v9

    .line 1547
    .line 1548
    const/16 v18, 0x0

    .line 1549
    .line 1550
    goto :goto_17

    .line 1551
    :catch_1
    move-exception v0

    .line 1552
    move-object/from16 v19, v9

    .line 1553
    .line 1554
    const/16 v18, 0x1

    .line 1555
    .line 1556
    goto/16 :goto_1a

    .line 1557
    .line 1558
    :catch_2
    move-exception v0

    .line 1559
    const/16 v18, 0x1

    .line 1560
    .line 1561
    const/16 v19, 0x0

    .line 1562
    .line 1563
    goto/16 :goto_1a

    .line 1564
    .line 1565
    :catch_3
    move-exception v0

    .line 1566
    :try_start_14
    iget-object v7, v8, Lf90;->b:Ljava/lang/Object;

    .line 1567
    .line 1568
    check-cast v7, Ls52;

    .line 1569
    .line 1570
    iget-object v7, v7, Ls52;->k:Lkg0;

    .line 1571
    .line 1572
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual {v8, v0}, Lf90;->g(Ljava/io/IOException;)V

    .line 1576
    .line 1577
    .line 1578
    throw v0
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_2

    .line 1579
    :cond_30
    const/16 v18, 0x1

    .line 1580
    .line 1581
    const/16 v19, 0x0

    .line 1582
    .line 1583
    :goto_17
    if-nez v19, :cond_31

    .line 1584
    .line 1585
    :try_start_15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1586
    .line 1587
    .line 1588
    iget-object v7, v5, Lk82;->d:Lo82;

    .line 1589
    .line 1590
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1591
    .line 1592
    .line 1593
    invoke-virtual {v7}, Lo82;->a()J

    .line 1594
    .line 1595
    .line 1596
    move-result-wide v10

    .line 1597
    iget-object v7, v8, Lf90;->b:Ljava/lang/Object;

    .line 1598
    .line 1599
    check-cast v7, Ls52;

    .line 1600
    .line 1601
    iget-object v7, v7, Ls52;->k:Lkg0;

    .line 1602
    .line 1603
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1604
    .line 1605
    .line 1606
    iget-object v7, v8, Lf90;->d:Ljava/lang/Object;

    .line 1607
    .line 1608
    check-cast v7, Lxg0;

    .line 1609
    .line 1610
    invoke-interface {v7, v5, v10, v11}, Lxg0;->i(Lk82;J)Lfr2;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v9

    .line 1614
    new-instance v7, Lug0;

    .line 1615
    .line 1616
    const/4 v12, 0x0

    .line 1617
    invoke-direct/range {v7 .. v12}, Lug0;-><init>(Lf90;Lfr2;JZ)V

    .line 1618
    .line 1619
    .line 1620
    new-instance v9, Ln52;

    .line 1621
    .line 1622
    invoke-direct {v9, v7}, Ln52;-><init>(Lfr2;)V

    .line 1623
    .line 1624
    .line 1625
    invoke-virtual {v0, v9}, Lo82;->d(Lnn;)V

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v9}, Ln52;->close()V

    .line 1629
    .line 1630
    .line 1631
    goto :goto_19

    .line 1632
    :catch_4
    move-exception v0

    .line 1633
    goto :goto_1a

    .line 1634
    :cond_31
    iget-object v0, v8, Lf90;->b:Ljava/lang/Object;

    .line 1635
    .line 1636
    move-object v7, v0

    .line 1637
    check-cast v7, Ls52;

    .line 1638
    .line 1639
    const/4 v11, 0x0

    .line 1640
    const/4 v12, 0x0

    .line 1641
    const/4 v13, 0x0

    .line 1642
    const/4 v9, 0x1

    .line 1643
    const/4 v10, 0x0

    .line 1644
    invoke-virtual/range {v7 .. v13}, Ls52;->k(Lf90;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    .line 1645
    .line 1646
    .line 1647
    invoke-virtual {v8}, Lf90;->c()Lt52;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v0

    .line 1651
    iget-object v0, v0, Lt52;->i:Lqv0;

    .line 1652
    .line 1653
    if-eqz v0, :cond_32

    .line 1654
    .line 1655
    const/4 v0, 0x1

    .line 1656
    goto :goto_18

    .line 1657
    :cond_32
    const/4 v0, 0x0

    .line 1658
    :goto_18
    if-nez v0, :cond_34

    .line 1659
    .line 1660
    iget-object v0, v8, Lf90;->d:Ljava/lang/Object;

    .line 1661
    .line 1662
    check-cast v0, Lxg0;

    .line 1663
    .line 1664
    invoke-interface {v0}, Lxg0;->g()Lwg0;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v0

    .line 1668
    invoke-interface {v0}, Lwg0;->h()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_4

    .line 1669
    .line 1670
    .line 1671
    goto :goto_19

    .line 1672
    :cond_33
    :try_start_16
    iget-object v0, v8, Lf90;->b:Ljava/lang/Object;

    .line 1673
    .line 1674
    move-object v7, v0

    .line 1675
    check-cast v7, Ls52;

    .line 1676
    .line 1677
    const/4 v11, 0x0

    .line 1678
    const/4 v12, 0x0

    .line 1679
    const/4 v13, 0x0

    .line 1680
    const/4 v9, 0x1

    .line 1681
    const/4 v10, 0x0

    .line 1682
    invoke-virtual/range {v7 .. v13}, Ls52;->k(Lf90;ZZZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_2

    .line 1683
    .line 1684
    .line 1685
    const/16 v18, 0x1

    .line 1686
    .line 1687
    const/16 v19, 0x0

    .line 1688
    .line 1689
    :cond_34
    :goto_19
    :try_start_17
    iget-object v0, v8, Lf90;->d:Ljava/lang/Object;

    .line 1690
    .line 1691
    check-cast v0, Lxg0;

    .line 1692
    .line 1693
    invoke-interface {v0}, Lxg0;->c()V
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_5

    .line 1694
    .line 1695
    .line 1696
    const/4 v7, 0x0

    .line 1697
    goto :goto_1b

    .line 1698
    :catch_5
    move-exception v0

    .line 1699
    :try_start_18
    iget-object v7, v8, Lf90;->b:Ljava/lang/Object;

    .line 1700
    .line 1701
    check-cast v7, Ls52;

    .line 1702
    .line 1703
    iget-object v7, v7, Ls52;->k:Lkg0;

    .line 1704
    .line 1705
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1706
    .line 1707
    .line 1708
    invoke-virtual {v8, v0}, Lf90;->g(Ljava/io/IOException;)V

    .line 1709
    .line 1710
    .line 1711
    throw v0
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_4

    .line 1712
    :catch_6
    move-exception v0

    .line 1713
    :try_start_19
    iget-object v7, v8, Lf90;->b:Ljava/lang/Object;

    .line 1714
    .line 1715
    check-cast v7, Ls52;

    .line 1716
    .line 1717
    iget-object v7, v7, Ls52;->k:Lkg0;

    .line 1718
    .line 1719
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1720
    .line 1721
    .line 1722
    invoke-virtual {v8, v0}, Lf90;->g(Ljava/io/IOException;)V

    .line 1723
    .line 1724
    .line 1725
    throw v0
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_2

    .line 1726
    :goto_1a
    instance-of v7, v0, Lsy;

    .line 1727
    .line 1728
    if-nez v7, :cond_4b

    .line 1729
    .line 1730
    iget-boolean v7, v8, Lf90;->a:Z

    .line 1731
    .line 1732
    if-eqz v7, :cond_4a

    .line 1733
    .line 1734
    move-object v7, v0

    .line 1735
    :goto_1b
    if-nez v19, :cond_35

    .line 1736
    .line 1737
    const/4 v10, 0x0

    .line 1738
    :try_start_1a
    invoke-virtual {v8, v10}, Lf90;->f(Z)Lp92;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v19

    .line 1742
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1743
    .line 1744
    .line 1745
    if-eqz v18, :cond_35

    .line 1746
    .line 1747
    iget-object v0, v8, Lf90;->b:Ljava/lang/Object;

    .line 1748
    .line 1749
    check-cast v0, Ls52;

    .line 1750
    .line 1751
    iget-object v0, v0, Ls52;->k:Lkg0;

    .line 1752
    .line 1753
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1754
    .line 1755
    .line 1756
    move-object/from16 v0, v19

    .line 1757
    .line 1758
    const/16 v18, 0x0

    .line 1759
    .line 1760
    goto :goto_1c

    .line 1761
    :cond_35
    move-object/from16 v0, v19

    .line 1762
    .line 1763
    goto :goto_1c

    .line 1764
    :catch_7
    move-exception v0

    .line 1765
    goto/16 :goto_27

    .line 1766
    .line 1767
    :goto_1c
    iput-object v5, v0, Lp92;->a:Lk82;

    .line 1768
    .line 1769
    invoke-virtual {v8}, Lf90;->c()Lt52;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v9

    .line 1773
    iget-object v9, v9, Lt52;->f:Lyr0;

    .line 1774
    .line 1775
    iput-object v9, v0, Lp92;->e:Lyr0;

    .line 1776
    .line 1777
    iput-wide v14, v0, Lp92;->l:J

    .line 1778
    .line 1779
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1780
    .line 1781
    .line 1782
    move-result-wide v9

    .line 1783
    iput-wide v9, v0, Lp92;->m:J

    .line 1784
    .line 1785
    invoke-virtual {v0}, Lp92;->a()Lr92;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v0

    .line 1789
    iget v9, v0, Lr92;->k:I

    .line 1790
    .line 1791
    :goto_1d
    const/16 v10, 0x64

    .line 1792
    .line 1793
    if-ne v9, v10, :cond_36

    .line 1794
    .line 1795
    :goto_1e
    const/4 v10, 0x0

    .line 1796
    goto :goto_1f

    .line 1797
    :cond_36
    const/16 v10, 0x66

    .line 1798
    .line 1799
    if-gt v10, v9, :cond_38

    .line 1800
    .line 1801
    const/16 v10, 0xc8

    .line 1802
    .line 1803
    if-ge v9, v10, :cond_38

    .line 1804
    .line 1805
    goto :goto_1e

    .line 1806
    :goto_1f
    invoke-virtual {v8, v10}, Lf90;->f(Z)Lp92;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v0

    .line 1810
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1811
    .line 1812
    .line 1813
    if-eqz v18, :cond_37

    .line 1814
    .line 1815
    iget-object v9, v8, Lf90;->b:Ljava/lang/Object;

    .line 1816
    .line 1817
    check-cast v9, Ls52;

    .line 1818
    .line 1819
    iget-object v9, v9, Ls52;->k:Lkg0;

    .line 1820
    .line 1821
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1822
    .line 1823
    .line 1824
    :cond_37
    iput-object v5, v0, Lp92;->a:Lk82;

    .line 1825
    .line 1826
    invoke-virtual {v8}, Lf90;->c()Lt52;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v9

    .line 1830
    iget-object v9, v9, Lt52;->f:Lyr0;

    .line 1831
    .line 1832
    iput-object v9, v0, Lp92;->e:Lyr0;

    .line 1833
    .line 1834
    iput-wide v14, v0, Lp92;->l:J

    .line 1835
    .line 1836
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1837
    .line 1838
    .line 1839
    move-result-wide v11

    .line 1840
    iput-wide v11, v0, Lp92;->m:J

    .line 1841
    .line 1842
    invoke-virtual {v0}, Lp92;->a()Lr92;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v0

    .line 1846
    iget v9, v0, Lr92;->k:I

    .line 1847
    .line 1848
    goto :goto_1d

    .line 1849
    :cond_38
    const/4 v10, 0x0

    .line 1850
    iget-object v5, v8, Lf90;->b:Ljava/lang/Object;

    .line 1851
    .line 1852
    check-cast v5, Ls52;

    .line 1853
    .line 1854
    iget-object v5, v5, Ls52;->k:Lkg0;

    .line 1855
    .line 1856
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1857
    .line 1858
    .line 1859
    const/16 v5, 0x65

    .line 1860
    .line 1861
    if-ne v9, v5, :cond_39

    .line 1862
    .line 1863
    const/4 v5, 0x1

    .line 1864
    goto :goto_20

    .line 1865
    :cond_39
    move v5, v10

    .line 1866
    :goto_20
    if-eqz v5, :cond_3c

    .line 1867
    .line 1868
    invoke-virtual {v8}, Lf90;->c()Lt52;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v11

    .line 1872
    iget-object v11, v11, Lt52;->i:Lqv0;

    .line 1873
    .line 1874
    if-eqz v11, :cond_3a

    .line 1875
    .line 1876
    const/4 v11, 0x1

    .line 1877
    goto :goto_21

    .line 1878
    :cond_3a
    move v11, v10

    .line 1879
    :goto_21
    if-nez v11, :cond_3b

    .line 1880
    .line 1881
    goto :goto_22

    .line 1882
    :cond_3b
    new-instance v0, Ljava/net/ProtocolException;

    .line 1883
    .line 1884
    const-string v1, "Unexpected 101 code on HTTP/2 connection"

    .line 1885
    .line 1886
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 1887
    .line 1888
    .line 1889
    throw v0

    .line 1890
    :cond_3c
    :goto_22
    if-eqz v5, :cond_3e

    .line 1891
    .line 1892
    iget-object v5, v0, Lr92;->m:Ljs0;

    .line 1893
    .line 1894
    invoke-virtual {v5, v4}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v5

    .line 1898
    if-nez v5, :cond_3d

    .line 1899
    .line 1900
    const/4 v5, 0x0

    .line 1901
    :cond_3d
    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1902
    .line 1903
    .line 1904
    move-result v3

    .line 1905
    if-eqz v3, :cond_3e

    .line 1906
    .line 1907
    const/4 v10, 0x1

    .line 1908
    :cond_3e
    if-eqz v17, :cond_3f

    .line 1909
    .line 1910
    if-eqz v10, :cond_3f

    .line 1911
    .line 1912
    invoke-virtual {v0}, Lr92;->b()Lp92;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v3

    .line 1916
    new-instance v5, Lh83;

    .line 1917
    .line 1918
    iget-object v10, v0, Lr92;->n:Lu92;

    .line 1919
    .line 1920
    invoke-virtual {v10}, Lu92;->e()Lvf1;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v10

    .line 1924
    iget-object v0, v0, Lr92;->n:Lu92;

    .line 1925
    .line 1926
    invoke-virtual {v0}, Lu92;->c()J

    .line 1927
    .line 1928
    .line 1929
    move-result-wide v11

    .line 1930
    invoke-direct {v5, v10, v11, v12}, Lh83;-><init>(Lvf1;J)V

    .line 1931
    .line 1932
    .line 1933
    iput-object v5, v3, Lp92;->g:Lu92;

    .line 1934
    .line 1935
    invoke-virtual {v8}, Lf90;->h()Lsz0;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v0

    .line 1939
    iput-object v0, v3, Lp92;->h:Lys2;

    .line 1940
    .line 1941
    invoke-virtual {v3}, Lp92;->a()Lr92;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v0

    .line 1945
    goto :goto_23

    .line 1946
    :cond_3f
    invoke-virtual {v8, v0}, Lf90;->e(Lr92;)Lw52;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v3

    .line 1950
    invoke-virtual {v0}, Lr92;->b()Lp92;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v0

    .line 1954
    iput-object v3, v0, Lp92;->g:Lu92;

    .line 1955
    .line 1956
    new-instance v3, Lz8;

    .line 1957
    .line 1958
    const/16 v5, 0xa

    .line 1959
    .line 1960
    invoke-direct {v3, v5}, Lz8;-><init>(I)V

    .line 1961
    .line 1962
    .line 1963
    iput-object v3, v0, Lp92;->o:Le33;

    .line 1964
    .line 1965
    invoke-virtual {v0}, Lp92;->a()Lr92;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v0

    .line 1969
    :goto_23
    iget-object v3, v0, Lr92;->h:Lk82;

    .line 1970
    .line 1971
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1972
    .line 1973
    .line 1974
    iget-object v3, v3, Lk82;->c:Ljs0;

    .line 1975
    .line 1976
    invoke-virtual {v3, v4}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v3

    .line 1980
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1981
    .line 1982
    .line 1983
    move-result v3

    .line 1984
    if-nez v3, :cond_41

    .line 1985
    .line 1986
    iget-object v3, v0, Lr92;->m:Ljs0;

    .line 1987
    .line 1988
    invoke-virtual {v3, v4}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v3

    .line 1992
    if-nez v3, :cond_40

    .line 1993
    .line 1994
    const/4 v3, 0x0

    .line 1995
    :cond_40
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1996
    .line 1997
    .line 1998
    move-result v2

    .line 1999
    if-eqz v2, :cond_42

    .line 2000
    .line 2001
    :cond_41
    iget-object v2, v8, Lf90;->d:Ljava/lang/Object;

    .line 2002
    .line 2003
    check-cast v2, Lxg0;

    .line 2004
    .line 2005
    invoke-interface {v2}, Lxg0;->g()Lwg0;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v2

    .line 2009
    invoke-interface {v2}, Lwg0;->h()V

    .line 2010
    .line 2011
    .line 2012
    :cond_42
    const/16 v2, 0xcc

    .line 2013
    .line 2014
    if-eq v9, v2, :cond_43

    .line 2015
    .line 2016
    const/16 v2, 0xcd

    .line 2017
    .line 2018
    if-ne v9, v2, :cond_44

    .line 2019
    .line 2020
    :cond_43
    iget-object v2, v0, Lr92;->n:Lu92;

    .line 2021
    .line 2022
    invoke-virtual {v2}, Lu92;->c()J

    .line 2023
    .line 2024
    .line 2025
    move-result-wide v2
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_7

    .line 2026
    const-wide/16 v4, 0x0

    .line 2027
    .line 2028
    cmp-long v2, v2, v4

    .line 2029
    .line 2030
    if-gtz v2, :cond_48

    .line 2031
    .line 2032
    :cond_44
    :goto_24
    if-eqz v0, :cond_47

    .line 2033
    .line 2034
    if-eqz v27, :cond_46

    .line 2035
    .line 2036
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->size()I

    .line 2037
    .line 2038
    .line 2039
    move-result v2

    .line 2040
    if-ge v6, v2, :cond_46

    .line 2041
    .line 2042
    iget v1, v1, Lv52;->w:I

    .line 2043
    .line 2044
    const/4 v8, 0x1

    .line 2045
    if-ne v1, v8, :cond_45

    .line 2046
    .line 2047
    goto :goto_26

    .line 2048
    :cond_45
    move-object/from16 v2, p0

    .line 2049
    .line 2050
    move-object/from16 v1, v16

    .line 2051
    .line 2052
    invoke-static {v2, v1}, Lc80;->i(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2053
    .line 2054
    .line 2055
    :goto_25
    const/16 v26, 0x0

    .line 2056
    .line 2057
    return-object v26

    .line 2058
    :cond_46
    :goto_26
    return-object v0

    .line 2059
    :cond_47
    move-object/from16 v2, p0

    .line 2060
    .line 2061
    new-instance v0, Ljava/lang/NullPointerException;

    .line 2062
    .line 2063
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2064
    .line 2065
    const-string v3, "interceptor "

    .line 2066
    .line 2067
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2068
    .line 2069
    .line 2070
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2071
    .line 2072
    .line 2073
    const-string v2, " returned null"

    .line 2074
    .line 2075
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2076
    .line 2077
    .line 2078
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2079
    .line 2080
    .line 2081
    move-result-object v1

    .line 2082
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 2083
    .line 2084
    .line 2085
    throw v0

    .line 2086
    :cond_48
    :try_start_1b
    new-instance v1, Ljava/net/ProtocolException;

    .line 2087
    .line 2088
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2089
    .line 2090
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2091
    .line 2092
    .line 2093
    const-string v3, "HTTP "

    .line 2094
    .line 2095
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2096
    .line 2097
    .line 2098
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2099
    .line 2100
    .line 2101
    const-string v3, " had non-zero Content-Length: "

    .line 2102
    .line 2103
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2104
    .line 2105
    .line 2106
    iget-object v0, v0, Lr92;->n:Lu92;

    .line 2107
    .line 2108
    invoke-virtual {v0}, Lu92;->c()J

    .line 2109
    .line 2110
    .line 2111
    move-result-wide v3

    .line 2112
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2113
    .line 2114
    .line 2115
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v0

    .line 2119
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 2120
    .line 2121
    .line 2122
    throw v1
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_7

    .line 2123
    :goto_27
    if-eqz v7, :cond_49

    .line 2124
    .line 2125
    invoke-static {v7, v0}, Lfg1;->m(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 2126
    .line 2127
    .line 2128
    throw v7

    .line 2129
    :cond_49
    throw v0

    .line 2130
    :cond_4a
    throw v0

    .line 2131
    :cond_4b
    throw v0

    .line 2132
    :cond_4c
    const-string v0, "Check failed."

    .line 2133
    .line 2134
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 2135
    .line 2136
    .line 2137
    goto :goto_25

    .line 2138
    nop

    .line 2139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
