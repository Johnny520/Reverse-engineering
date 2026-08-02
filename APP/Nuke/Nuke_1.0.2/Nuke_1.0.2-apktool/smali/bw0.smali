.class public final Lbw0;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public l:Ljava/util/ArrayList;

.field public m:I

.field public synthetic n:Lr92;

.field public synthetic o:Z

.field public final synthetic p:Ljw0;

.field public final synthetic q:Ltw0;

.field public final synthetic r:Lhg2;


# direct methods
.method public constructor <init>(Ljw0;Ltw0;Lhg2;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbw0;->p:Ljw0;

    .line 2
    .line 3
    iput-object p2, p0, Lbw0;->q:Ltw0;

    .line 4
    .line 5
    iput-object p3, p0, Lbw0;->r:Lhg2;

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1, p4}, Ltw2;-><init>(ILt00;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

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
    new-instance v0, Lbw0;

    .line 12
    .line 13
    iget-object v1, p0, Lbw0;->q:Ltw0;

    .line 14
    .line 15
    iget-object v2, p0, Lbw0;->r:Lhg2;

    .line 16
    .line 17
    iget-object p0, p0, Lbw0;->p:Ljw0;

    .line 18
    .line 19
    invoke-direct {v0, p0, v1, v2, p3}, Lbw0;-><init>(Ljw0;Ltw0;Lhg2;Lt00;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, v0, Lbw0;->n:Lr92;

    .line 23
    .line 24
    iput-boolean p2, v0, Lbw0;->o:Z

    .line 25
    .line 26
    sget-object p0, La83;->a:La83;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Lbw0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget-object v8, v7, Lbw0;->n:Lr92;

    .line 4
    .line 5
    iget-boolean v9, v7, Lbw0;->o:Z

    .line 6
    .line 7
    iget v0, v7, Lbw0;->m:I

    .line 8
    .line 9
    const/4 v10, 0x0

    .line 10
    const-string v11, "status"

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v0, v7, Lbw0;->l:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    move-object v12, v0

    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v10

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v8, Lr92;->m:Ljs0;

    .line 37
    .line 38
    iget-object v2, v8, Lr92;->n:Lu92;

    .line 39
    .line 40
    iget v3, v8, Lr92;->k:I

    .line 41
    .line 42
    iget-object v4, v7, Lbw0;->p:Ljw0;

    .line 43
    .line 44
    invoke-static {v4, v0}, Ljw0;->b(Ljw0;Ljs0;)Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object v12

    .line 48
    iget-object v0, v7, Lbw0;->q:Ltw0;

    .line 49
    .line 50
    iget-boolean v5, v0, Ltw0;->i:Z

    .line 51
    .line 52
    if-eqz v5, :cond_3

    .line 53
    .line 54
    const/16 v5, 0xc8

    .line 55
    .line 56
    if-gt v5, v3, :cond_2

    .line 57
    .line 58
    const/16 v5, 0x12c

    .line 59
    .line 60
    if-ge v3, v5, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const-string v0, "The download returned HTTP status "

    .line 64
    .line 65
    const-string v1, "."

    .line 66
    .line 67
    invoke-static {v3, v0, v1}, Lhk1;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    new-instance v0, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-direct {v0, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-static {v11, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const/4 v8, 0x0

    .line 84
    const/16 v9, 0x14

    .line 85
    .line 86
    const-string v4, "HTTP_STATUS"

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    invoke-static/range {v4 .. v9}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 90
    .line 91
    .line 92
    return-object v10

    .line 93
    :cond_3
    :goto_0
    invoke-virtual {v2}, Lu92;->c()J

    .line 94
    .line 95
    .line 96
    move-result-wide v5

    .line 97
    iget-wide v13, v0, Ltw0;->f:J

    .line 98
    .line 99
    cmp-long v3, v5, v13

    .line 100
    .line 101
    if-gtz v3, :cond_5

    .line 102
    .line 103
    iget-object v3, v4, Ljw0;->b:Ldq1;

    .line 104
    .line 105
    invoke-virtual {v2}, Lu92;->b()Ljava/io/InputStream;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    move-object v5, v3

    .line 110
    iget-wide v3, v0, Ltw0;->f:J

    .line 111
    .line 112
    move-object v6, v5

    .line 113
    iget-boolean v5, v0, Ltw0;->g:Z

    .line 114
    .line 115
    iget-boolean v0, v0, Ltw0;->h:Z

    .line 116
    .line 117
    iput-object v8, v7, Lbw0;->n:Lr92;

    .line 118
    .line 119
    iput-object v12, v7, Lbw0;->l:Ljava/util/ArrayList;

    .line 120
    .line 121
    iput-boolean v9, v7, Lbw0;->o:Z

    .line 122
    .line 123
    iput v1, v7, Lbw0;->m:I

    .line 124
    .line 125
    iget-object v1, v7, Lbw0;->r:Lhg2;

    .line 126
    .line 127
    move-object/from16 v19, v6

    .line 128
    .line 129
    move v6, v0

    .line 130
    move-object/from16 v0, v19

    .line 131
    .line 132
    invoke-virtual/range {v0 .. v7}, Ldq1;->Z(Lhg2;Ljava/io/InputStream;JZZLu00;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sget-object v1, Lk20;->h:Lk20;

    .line 137
    .line 138
    if-ne v0, v1, :cond_4

    .line 139
    .line 140
    return-object v1

    .line 141
    :cond_4
    :goto_1
    check-cast v0, Lgg2;

    .line 142
    .line 143
    iget v1, v8, Lr92;->k:I

    .line 144
    .line 145
    new-instance v2, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 148
    .line 149
    .line 150
    new-instance v13, Low1;

    .line 151
    .line 152
    invoke-direct {v13, v11, v2}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, v8, Lr92;->j:Ljava/lang/String;

    .line 156
    .line 157
    new-instance v14, Low1;

    .line 158
    .line 159
    const-string v2, "statusText"

    .line 160
    .line 161
    invoke-direct {v14, v2, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iget-object v1, v8, Lr92;->h:Lk82;

    .line 165
    .line 166
    iget-object v1, v1, Lk82;->a:Lyw0;

    .line 167
    .line 168
    sget-object v2, Lmw0;->a:Ljava/util/Set;

    .line 169
    .line 170
    invoke-virtual {v1}, Lyw0;->f()Lxw0;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iput-object v10, v1, Lxw0;->h:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v1}, Lxw0;->b()Lyw0;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    iget-object v1, v1, Lyw0;->i:Ljava/lang/String;

    .line 181
    .line 182
    new-instance v15, Low1;

    .line 183
    .line 184
    const-string v2, "url"

    .line 185
    .line 186
    invoke-direct {v15, v2, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    new-instance v2, Low1;

    .line 194
    .line 195
    const-string v3, "redirected"

    .line 196
    .line 197
    invoke-direct {v2, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v12}, Lmw0;->b(Ljava/util/List;)Ljava/util/ArrayList;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    new-instance v3, Low1;

    .line 205
    .line 206
    const-string v4, "headers"

    .line 207
    .line 208
    invoke-direct {v3, v4, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Lgg2;->a()Lcom/dokar/quickjs/binding/JsObject;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    new-instance v1, Low1;

    .line 216
    .line 217
    const-string v4, "file"

    .line 218
    .line 219
    invoke-direct {v1, v4, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    move-object/from16 v18, v1

    .line 223
    .line 224
    move-object/from16 v16, v2

    .line 225
    .line 226
    move-object/from16 v17, v3

    .line 227
    .line 228
    filled-new-array/range {v13 .. v18}, [Low1;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-static {v0}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    new-instance v1, Lcom/dokar/quickjs/binding/JsObject;

    .line 237
    .line 238
    invoke-direct {v1, v0}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 239
    .line 240
    .line 241
    return-object v1

    .line 242
    :cond_5
    const/4 v6, 0x0

    .line 243
    const/16 v7, 0x1c

    .line 244
    .line 245
    const-string v2, "QUOTA_EXCEEDED"

    .line 246
    .line 247
    const-string v3, "Download exceeds the size limit."

    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    const/4 v5, 0x0

    .line 251
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 252
    .line 253
    .line 254
    return-object v10
.end method
