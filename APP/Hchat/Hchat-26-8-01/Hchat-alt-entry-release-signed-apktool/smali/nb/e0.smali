.class public final synthetic Lnb/e0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic h:J

.field public final synthetic i:Lgg/t;

.field public final synthetic j:Lgg/u;

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/util/ArrayList;

.field public final synthetic p:Lgg/s;

.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:Lgg/u;

.field public final synthetic s:Lgg/u;

.field public final synthetic t:Landroid/content/Context;

.field public final synthetic u:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;JLgg/t;Lgg/u;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lgg/s;Ljava/util/List;Lgg/u;Lgg/u;Landroid/content/Context;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnb/e0;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    iput-wide p2, p0, Lnb/e0;->h:J

    .line 7
    .line 8
    iput-object p4, p0, Lnb/e0;->i:Lgg/t;

    .line 9
    .line 10
    iput-object p5, p0, Lnb/e0;->j:Lgg/u;

    .line 11
    .line 12
    iput p6, p0, Lnb/e0;->k:I

    .line 13
    .line 14
    iput-object p7, p0, Lnb/e0;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p8, p0, Lnb/e0;->m:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p9, p0, Lnb/e0;->n:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p10, p0, Lnb/e0;->o:Ljava/util/ArrayList;

    .line 21
    .line 22
    iput-object p11, p0, Lnb/e0;->p:Lgg/s;

    .line 23
    .line 24
    iput-object p12, p0, Lnb/e0;->q:Ljava/util/List;

    .line 25
    .line 26
    iput-object p13, p0, Lnb/e0;->r:Lgg/u;

    .line 27
    .line 28
    iput-object p14, p0, Lnb/e0;->s:Lgg/u;

    .line 29
    .line 30
    iput-object p15, p0, Lnb/e0;->t:Landroid/content/Context;

    .line 31
    .line 32
    move-object/from16 p1, p16

    .line 33
    .line 34
    iput-object p1, p0, Lnb/e0;->u:Lfg/l;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lnb/e0;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    iget-object v7, v1, Lnb/e0;->i:Lgg/t;

    .line 12
    .line 13
    iget-wide v3, v7, Lgg/t;->g:J

    .line 14
    .line 15
    move-object/from16 v16, v2

    .line 16
    .line 17
    move-wide v4, v3

    .line 18
    iget-wide v2, v1, Lnb/e0;->h:J

    .line 19
    .line 20
    cmp-long v0, v2, v4

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_8

    .line 25
    .line 26
    :cond_0
    iget-object v9, v1, Lnb/e0;->j:Lgg/u;

    .line 27
    .line 28
    iget-object v0, v9, Lgg/u;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Landroid/speech/tts/TextToSpeech;

    .line 31
    .line 32
    iget v4, v1, Lnb/e0;->k:I

    .line 33
    .line 34
    iget-object v12, v1, Lnb/e0;->l:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v11, v1, Lnb/e0;->m:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v14, v1, Lnb/e0;->o:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v6, v1, Lnb/e0;->p:Lgg/s;

    .line 41
    .line 42
    iget-object v15, v1, Lnb/e0;->q:Ljava/util/List;

    .line 43
    .line 44
    iget-object v8, v1, Lnb/e0;->r:Lgg/u;

    .line 45
    .line 46
    iget-object v10, v1, Lnb/e0;->s:Lgg/u;

    .line 47
    .line 48
    move v5, v4

    .line 49
    iget-object v4, v1, Lnb/e0;->t:Landroid/content/Context;

    .line 50
    .line 51
    move v13, v5

    .line 52
    iget-object v5, v1, Lnb/e0;->u:Lfg/l;

    .line 53
    .line 54
    if-nez v13, :cond_a

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    goto/16 :goto_7

    .line 59
    .line 60
    :cond_1
    const-string v13, "mCurrentEngine"

    .line 61
    .line 62
    invoke-static {v0, v13}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v13

    .line 66
    move-object/from16 v17, v0

    .line 67
    .line 68
    instance-of v0, v13, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    check-cast v13, Ljava/lang/String;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v13, 0x0

    .line 76
    :goto_0
    if-nez v13, :cond_3

    .line 77
    .line 78
    const-string v13, ""

    .line 79
    .line 80
    :cond_3
    invoke-static {v13}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_4

    .line 93
    .line 94
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_4

    .line 99
    .line 100
    invoke-virtual {v13, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_4

    .line 105
    .line 106
    const-string v0, "\u7cfb\u7edf\u56de\u9000\u5230 "

    .line 107
    .line 108
    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    invoke-static/range {v2 .. v16}, Lnb/f0;->b(JLandroid/content/Context;Lfg/l;Lgg/s;Lgg/t;Lgg/u;Lgg/u;Lgg/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_4
    :try_start_0
    invoke-static/range {v17 .. v17}, Lnb/f0;->e(Landroid/speech/tts/TextToSpeech;)Ljava/util/ArrayList;

    .line 117
    .line 118
    .line 119
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    move-wide/from16 v17, v2

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    move-wide/from16 v17, v2

    .line 125
    .line 126
    new-instance v2, Lsf/f;

    .line 127
    .line 128
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    move-object v0, v2

    .line 132
    :goto_1
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    if-nez v2, :cond_8

    .line 137
    .line 138
    move-object/from16 v20, v0

    .line 139
    .line 140
    check-cast v20, Ljava/util/List;

    .line 141
    .line 142
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    move-object v13, v12

    .line 149
    :cond_5
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    iget-object v2, v1, Lnb/e0;->n:Ljava/lang/String;

    .line 154
    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    move-object/from16 v22, v2

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_6
    move-object/from16 v22, v13

    .line 161
    .line 162
    :goto_2
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_7

    .line 167
    .line 168
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_7

    .line 173
    .line 174
    invoke-virtual {v12, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-nez v0, :cond_7

    .line 179
    .line 180
    const/4 v0, 0x1

    .line 181
    :goto_3
    move/from16 v23, v0

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_7
    const/4 v0, 0x0

    .line 185
    goto :goto_3

    .line 186
    :goto_4
    new-instance v19, Lnb/g0;

    .line 187
    .line 188
    const/16 v21, 0x0

    .line 189
    .line 190
    const/16 v24, 0x2

    .line 191
    .line 192
    invoke-direct/range {v19 .. v24}, Lnb/g0;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 193
    .line 194
    .line 195
    move-object/from16 v0, v19

    .line 196
    .line 197
    iget-wide v2, v7, Lgg/t;->g:J

    .line 198
    .line 199
    const-wide/16 v10, 0x1

    .line 200
    .line 201
    add-long/2addr v2, v10

    .line 202
    iput-wide v2, v7, Lgg/t;->g:J

    .line 203
    .line 204
    invoke-static {v8, v9}, Lnb/f0;->d(Lgg/u;Lgg/u;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v16 .. v16}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-nez v2, :cond_b

    .line 212
    .line 213
    invoke-interface {v5, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    if-eqz v0, :cond_9

    .line 222
    .line 223
    :goto_5
    move-object v13, v0

    .line 224
    move-wide/from16 v2, v17

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_9
    const-string v0, "\u8bfb\u53d6\u89d2\u8272\u5931\u8d25"

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :goto_6
    invoke-static/range {v2 .. v16}, Lnb/f0;->b(JLandroid/content/Context;Lfg/l;Lgg/s;Lgg/t;Lgg/u;Lgg/u;Lgg/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 231
    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_a
    :goto_7
    const-string v0, "\u72b6\u6001 "

    .line 235
    .line 236
    invoke-static {v13, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    invoke-static/range {v2 .. v16}, Lnb/f0;->b(JLandroid/content/Context;Lfg/l;Lgg/s;Lgg/t;Lgg/u;Lgg/u;Lgg/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 241
    .line 242
    .line 243
    :cond_b
    :goto_8
    return-void
.end method
