.class public final Lgw0;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public synthetic l:Lr92;

.field public synthetic m:Z

.field public final synthetic n:Ljw0;

.field public final synthetic o:Ltw0;


# direct methods
.method public constructor <init>(Ljw0;Ltw0;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgw0;->n:Ljw0;

    .line 2
    .line 3
    iput-object p2, p0, Lgw0;->o:Ltw0;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lr92;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Lt00;

    .line 10
    .line 11
    new-instance v0, Lgw0;

    .line 12
    .line 13
    iget-object v1, p0, Lgw0;->n:Ljw0;

    .line 14
    .line 15
    iget-object p0, p0, Lgw0;->o:Ltw0;

    .line 16
    .line 17
    invoke-direct {v0, v1, p0, p3}, Lgw0;-><init>(Ljw0;Ltw0;Lt00;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, Lgw0;->l:Lr92;

    .line 21
    .line 22
    iput-boolean p2, v0, Lgw0;->m:Z

    .line 23
    .line 24
    sget-object p0, La83;->a:La83;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lgw0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lgw0;->l:Lr92;

    .line 4
    .line 5
    iget-boolean v2, v0, Lgw0;->m:Z

    .line 6
    .line 7
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v3, v0, Lgw0;->o:Ltw0;

    .line 11
    .line 12
    iget-wide v3, v3, Ltw0;->f:J

    .line 13
    .line 14
    iget-object v0, v0, Lgw0;->n:Ljw0;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v5, v1, Lr92;->n:Lu92;

    .line 20
    .line 21
    invoke-virtual {v5}, Lu92;->c()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    cmp-long v5, v5, v3

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    if-gtz v5, :cond_4

    .line 29
    .line 30
    iget-object v5, v1, Lr92;->n:Lu92;

    .line 31
    .line 32
    invoke-virtual {v5}, Lu92;->b()Ljava/io/InputStream;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    :try_start_0
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    .line 37
    .line 38
    const-wide/16 v8, 0x2000

    .line 39
    .line 40
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v8

    .line 44
    long-to-int v8, v8

    .line 45
    invoke-direct {v7, v8}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const/16 v8, 0x2000

    .line 49
    .line 50
    new-array v8, v8, [B

    .line 51
    .line 52
    const-wide/16 v9, 0x0

    .line 53
    .line 54
    :goto_0
    invoke-virtual {v5, v8}, Ljava/io/InputStream;->read([B)I

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    const/4 v12, 0x0

    .line 59
    if-gez v11, :cond_1

    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    invoke-interface {v5}, Ljava/io/Closeable;->close()V

    .line 69
    .line 70
    .line 71
    iget v4, v1, Lr92;->k:I

    .line 72
    .line 73
    iget-object v5, v1, Lr92;->j:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v7, v1, Lr92;->h:Lk82;

    .line 76
    .line 77
    iget-object v7, v7, Lk82;->a:Lyw0;

    .line 78
    .line 79
    sget-object v8, Lmw0;->a:Ljava/util/Set;

    .line 80
    .line 81
    invoke-virtual {v7}, Lyw0;->f()Lxw0;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    iput-object v6, v7, Lxw0;->h:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v7}, Lxw0;->b()Lyw0;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    iget-object v6, v6, Lyw0;->i:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v1, v1, Lr92;->m:Ljs0;

    .line 94
    .line 95
    invoke-static {v0, v1}, Ljw0;->b(Ljw0;Ljs0;)Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v13, Low1;

    .line 107
    .line 108
    const-string v7, "status"

    .line 109
    .line 110
    invoke-direct {v13, v7, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    new-instance v14, Low1;

    .line 114
    .line 115
    const-string v1, "statusText"

    .line 116
    .line 117
    invoke-direct {v14, v1, v5}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const/16 v1, 0xc8

    .line 121
    .line 122
    if-gt v1, v4, :cond_0

    .line 123
    .line 124
    const/16 v1, 0x12c

    .line 125
    .line 126
    if-ge v4, v1, :cond_0

    .line 127
    .line 128
    const/4 v12, 0x1

    .line 129
    :cond_0
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    new-instance v15, Low1;

    .line 134
    .line 135
    const-string v4, "ok"

    .line 136
    .line 137
    invoke-direct {v15, v4, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    new-instance v1, Low1;

    .line 141
    .line 142
    const-string v4, "url"

    .line 143
    .line 144
    invoke-direct {v1, v4, v6}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    new-instance v4, Low1;

    .line 152
    .line 153
    const-string v5, "redirected"

    .line 154
    .line 155
    invoke-direct {v4, v5, v2}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v0}, Lmw0;->b(Ljava/util/List;)Ljava/util/ArrayList;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    new-instance v2, Low1;

    .line 163
    .line 164
    const-string v5, "headers"

    .line 165
    .line 166
    invoke-direct {v2, v5, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    array-length v0, v3

    .line 170
    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v3, Lkotlin/UByteArray;

    .line 175
    .line 176
    invoke-direct {v3, v0}, Lkotlin/UByteArray;-><init>([B)V

    .line 177
    .line 178
    .line 179
    new-instance v0, Low1;

    .line 180
    .line 181
    const-string v5, "body"

    .line 182
    .line 183
    invoke-direct {v0, v5, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object/from16 v19, v0

    .line 187
    .line 188
    move-object/from16 v16, v1

    .line 189
    .line 190
    move-object/from16 v18, v2

    .line 191
    .line 192
    move-object/from16 v17, v4

    .line 193
    .line 194
    filled-new-array/range {v13 .. v19}, [Low1;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v0}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    new-instance v1, Lcom/dokar/quickjs/binding/JsObject;

    .line 203
    .line 204
    invoke-direct {v1, v0}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    :catchall_0
    move-exception v0

    .line 209
    move-object v1, v0

    .line 210
    goto :goto_1

    .line 211
    :cond_1
    if-nez v11, :cond_2

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_2
    int-to-long v13, v11

    .line 216
    :try_start_1
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->addExact(JJ)J

    .line 217
    .line 218
    .line 219
    move-result-wide v9

    .line 220
    cmp-long v13, v9, v3

    .line 221
    .line 222
    if-gtz v13, :cond_3

    .line 223
    .line 224
    invoke-virtual {v7, v8, v12, v11}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_3
    new-instance v6, Lsd2;

    .line 230
    .line 231
    const-string v7, "QUOTA_EXCEEDED"

    .line 232
    .line 233
    const-string v8, "HTTP response exceeds the size limit."

    .line 234
    .line 235
    const/4 v11, 0x0

    .line 236
    const/16 v12, 0x1c

    .line 237
    .line 238
    const/4 v9, 0x0

    .line 239
    const/4 v10, 0x0

    .line 240
    invoke-direct/range {v6 .. v12}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 241
    .line 242
    .line 243
    throw v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 244
    :goto_1
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 245
    :catchall_1
    move-exception v0

    .line 246
    invoke-static {v5, v1}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    throw v0

    .line 250
    :cond_4
    const/4 v11, 0x0

    .line 251
    const/16 v12, 0x1c

    .line 252
    .line 253
    const-string v7, "QUOTA_EXCEEDED"

    .line 254
    .line 255
    const-string v8, "HTTP response exceeds the size limit."

    .line 256
    .line 257
    const/4 v9, 0x0

    .line 258
    const/4 v10, 0x0

    .line 259
    invoke-static/range {v7 .. v12}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 260
    .line 261
    .line 262
    return-object v6
.end method
