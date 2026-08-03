.class public final synthetic Lwb/or;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/io/Serializable;

.field public final synthetic h:Li0/j1;

.field public final synthetic i:Lfb/y;

.field public final synthetic j:I

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Z

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Lwb/yt;

.field public final synthetic s:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Li0/j1;Lfb/y;ILandroid/content/Context;ZLi0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Lwb/yt;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/or;->g:Ljava/io/Serializable;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/or;->h:Li0/j1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/or;->i:Lfb/y;

    .line 9
    .line 10
    iput p4, p0, Lwb/or;->j:I

    .line 11
    .line 12
    iput-object p5, p0, Lwb/or;->k:Landroid/content/Context;

    .line 13
    .line 14
    iput-boolean p6, p0, Lwb/or;->l:Z

    .line 15
    .line 16
    iput-object p7, p0, Lwb/or;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/or;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/or;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/or;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/or;->q:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/or;->r:Lwb/yt;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/or;->s:Li0/a1;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v12, v0, Lwb/or;->i:Lfb/y;

    .line 4
    .line 5
    iget-object v1, v12, Lfb/y;->b:Ljava/lang/String;

    .line 6
    .line 7
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    iget-object v3, v0, Lwb/or;->h:Li0/j1;

    .line 10
    .line 11
    invoke-virtual {v3, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, Lwb/or;->g:Ljava/io/Serializable;

    .line 15
    .line 16
    instance-of v3, v2, Lsf/f;

    .line 17
    .line 18
    iget v4, v0, Lwb/or;->j:I

    .line 19
    .line 20
    iget-object v5, v0, Lwb/or;->k:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v6, v0, Lwb/or;->p:Li0/a1;

    .line 23
    .line 24
    iget-object v7, v0, Lwb/or;->q:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v8, v0, Lwb/or;->r:Lwb/yt;

    .line 27
    .line 28
    iget-object v9, v0, Lwb/or;->s:Li0/a1;

    .line 29
    .line 30
    const/4 v10, 0x1

    .line 31
    if-nez v3, :cond_4

    .line 32
    .line 33
    move-object v3, v2

    .line 34
    check-cast v3, Ljava/io/File;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    iget-object v11, v0, Lwb/or;->m:Li0/a1;

    .line 38
    .line 39
    invoke-interface {v11, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v3, v0, Lwb/or;->n:Li0/a1;

    .line 43
    .line 44
    invoke-interface {v3, v12}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v3, v0, Lwb/or;->o:Li0/a1;

    .line 48
    .line 49
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/util/List;

    .line 57
    .line 58
    invoke-static {v4, v3}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lfb/c;

    .line 63
    .line 64
    iget-boolean v11, v0, Lwb/or;->l:Z

    .line 65
    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v13

    .line 72
    check-cast v13, Ljava/util/List;

    .line 73
    .line 74
    invoke-static {v13}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    iget-object v14, v3, Lfb/c;->g:Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v11, :cond_0

    .line 81
    .line 82
    const-string v15, "\u5df2\u521b\u5efa\u63d2\u4ef6: "

    .line 83
    .line 84
    :goto_0
    invoke-static {v15, v1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_1

    .line 89
    :cond_0
    const-string v15, "\u5df2\u66f4\u65b0\u63d2\u4ef6: "

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :goto_1
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    if-eqz v15, :cond_1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_1
    move-object v14, v1

    .line 108
    :goto_2
    const-wide/16 v15, 0x0

    .line 109
    .line 110
    const v17, 0x31fbf

    .line 111
    .line 112
    .line 113
    move-object v1, v2

    .line 114
    const/4 v2, 0x0

    .line 115
    move-object/from16 v18, v1

    .line 116
    .line 117
    move-object v1, v3

    .line 118
    const/4 v3, 0x0

    .line 119
    move/from16 v19, v4

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    move-object/from16 v20, v5

    .line 123
    .line 124
    const/4 v5, 0x0

    .line 125
    move-object/from16 v21, v6

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    move-object/from16 v22, v8

    .line 129
    .line 130
    const/4 v8, 0x0

    .line 131
    move-object/from16 v23, v9

    .line 132
    .line 133
    const/4 v9, 0x0

    .line 134
    move/from16 v24, v10

    .line 135
    .line 136
    const/4 v10, 0x0

    .line 137
    move/from16 v25, v11

    .line 138
    .line 139
    const-string v11, "complete"

    .line 140
    .line 141
    move-object/from16 v26, v13

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    move-object/from16 v27, v7

    .line 145
    .line 146
    move-object v7, v14

    .line 147
    const/4 v14, 0x0

    .line 148
    move/from16 v28, v19

    .line 149
    .line 150
    move-object/from16 v29, v20

    .line 151
    .line 152
    move-object/from16 v30, v21

    .line 153
    .line 154
    move-object/from16 v32, v22

    .line 155
    .line 156
    move-object/from16 v33, v23

    .line 157
    .line 158
    move-object/from16 v0, v26

    .line 159
    .line 160
    move-object/from16 v31, v27

    .line 161
    .line 162
    invoke-static/range {v1 .. v17}, Lfb/c;->a(Lfb/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfb/y;ZLjava/lang/String;JI)Lfb/c;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    move/from16 v9, v28

    .line 167
    .line 168
    invoke-virtual {v0, v9, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-object/from16 v4, v30

    .line 172
    .line 173
    invoke-interface {v4, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    move-object/from16 v6, v29

    .line 177
    .line 178
    move-object/from16 v5, v31

    .line 179
    .line 180
    move-object/from16 v7, v32

    .line 181
    .line 182
    :goto_3
    move-object/from16 v8, v33

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_2
    move-object/from16 v18, v2

    .line 186
    .line 187
    move-object/from16 v33, v9

    .line 188
    .line 189
    move/from16 v25, v11

    .line 190
    .line 191
    move v9, v4

    .line 192
    move-object v4, v6

    .line 193
    move-object v6, v5

    .line 194
    move-object v5, v7

    .line 195
    move-object v7, v8

    .line 196
    goto :goto_3

    .line 197
    :goto_4
    invoke-static {v5, v6, v7, v4, v8}, Lwb/y2;->q1(Ljava/lang/String;Landroid/content/Context;Lwb/yt;Li0/a1;Li0/a1;)V

    .line 198
    .line 199
    .line 200
    if-eqz v25, :cond_3

    .line 201
    .line 202
    const-string v0, "\u63d2\u4ef6\u5df2\u521b\u5efa\uff0c\u5f53\u524d\u4e3a\u7981\u7528\u72b6\u6001"

    .line 203
    .line 204
    :goto_5
    const/4 v1, 0x1

    .line 205
    goto :goto_6

    .line 206
    :cond_3
    const-string v0, "\u63d2\u4ef6\u5df2\u66f4\u65b0\uff0c\u5f53\u524d\u4e3a\u7981\u7528\u72b6\u6001"

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :goto_6
    invoke-static {v6, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 214
    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_4
    move-object v1, v9

    .line 218
    move v9, v4

    .line 219
    move-object v4, v6

    .line 220
    move-object v6, v5

    .line 221
    move-object v5, v7

    .line 222
    move-object v7, v8

    .line 223
    move-object v8, v1

    .line 224
    move-object/from16 v18, v2

    .line 225
    .line 226
    move v1, v10

    .line 227
    :goto_7
    invoke-static/range {v18 .. v18}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    if-eqz v0, :cond_7

    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    if-eqz v2, :cond_5

    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_5
    const-string v2, "\u672a\u77e5\u9519\u8bef"

    .line 241
    .line 242
    :goto_8
    const-string v3, "\u5199\u5165\u5931\u8d25: "

    .line 243
    .line 244
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    invoke-static/range {v4 .. v10}, Lwb/y2;->p1(Li0/a1;Ljava/lang/String;Landroid/content/Context;Lwb/yt;Li0/a1;ILjava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-eqz v0, :cond_6

    .line 256
    .line 257
    goto :goto_9

    .line 258
    :cond_6
    const-string v0, "\u5199\u5165\u63d2\u4ef6\u5931\u8d25"

    .line 259
    .line 260
    :goto_9
    invoke-static {v6, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 265
    .line 266
    .line 267
    :cond_7
    return-void
.end method
