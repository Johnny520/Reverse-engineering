.class public final synthetic Lwb/vr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Li0/j1;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:I

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lwb/yt;

.field public final synthetic r:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Li0/j1;Ljava/lang/String;ILandroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Lwb/yt;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/vr;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/vr;->h:Li0/j1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/vr;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput p4, p0, Lwb/vr;->j:I

    .line 11
    .line 12
    iput-object p5, p0, Lwb/vr;->k:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/vr;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/vr;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/vr;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/vr;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/vr;->p:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/vr;->q:Lwb/yt;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/vr;->r:Li0/a1;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    iget-object v2, v0, Lwb/vr;->h:Li0/j1;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lwb/vr;->g:Ljava/lang/Object;

    .line 11
    .line 12
    instance-of v2, v1, Lsf/f;

    .line 13
    .line 14
    iget v8, v0, Lwb/vr;->j:I

    .line 15
    .line 16
    iget-object v5, v0, Lwb/vr;->k:Landroid/content/Context;

    .line 17
    .line 18
    iget-object v3, v0, Lwb/vr;->o:Li0/a1;

    .line 19
    .line 20
    iget-object v4, v0, Lwb/vr;->p:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v6, v0, Lwb/vr;->q:Lwb/yt;

    .line 23
    .line 24
    iget-object v7, v0, Lwb/vr;->r:Li0/a1;

    .line 25
    .line 26
    const/4 v10, 0x1

    .line 27
    if-nez v2, :cond_6

    .line 28
    .line 29
    move-object v2, v1

    .line 30
    check-cast v2, Lsf/n;

    .line 31
    .line 32
    iget-object v2, v0, Lwb/vr;->l:Li0/a1;

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    invoke-interface {v2, v9}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, v0, Lwb/vr;->m:Li0/a1;

    .line 39
    .line 40
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    check-cast v11, Lfb/y;

    .line 45
    .line 46
    if-eqz v11, :cond_0

    .line 47
    .line 48
    iget-object v11, v11, Lfb/y;->b:Ljava/lang/String;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v11, v9

    .line 52
    :goto_0
    iget-object v12, v0, Lwb/vr;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v11, v12}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    iget-object v13, v0, Lwb/vr;->n:Li0/a1;

    .line 59
    .line 60
    if-nez v11, :cond_2

    .line 61
    .line 62
    invoke-interface {v13}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    check-cast v11, Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v11, v12}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    if-eqz v11, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/4 v11, 0x0

    .line 76
    move/from16 v26, v11

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    :goto_1
    move/from16 v26, v10

    .line 80
    .line 81
    :goto_2
    if-eqz v26, :cond_3

    .line 82
    .line 83
    invoke-interface {v2, v9}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const-string v9, ""

    .line 87
    .line 88
    invoke-interface {v13, v9}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    check-cast v9, Ljava/util/List;

    .line 96
    .line 97
    invoke-static {v8, v9}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    move-object v14, v9

    .line 102
    check-cast v14, Lfb/c;

    .line 103
    .line 104
    if-eqz v14, :cond_5

    .line 105
    .line 106
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    check-cast v9, Ljava/util/List;

    .line 111
    .line 112
    invoke-static {v9}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    iget-object v11, v14, Lfb/c;->g:Ljava/lang/String;

    .line 117
    .line 118
    const-string v13, "\u5df2\u5220\u9664\u63d2\u4ef6: "

    .line 119
    .line 120
    invoke-virtual {v13, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    invoke-static {v12}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    if-eqz v13, :cond_4

    .line 137
    .line 138
    move-object/from16 v20, v11

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_4
    move-object/from16 v20, v12

    .line 142
    .line 143
    :goto_3
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    move-object/from16 v25, v2

    .line 148
    .line 149
    check-cast v25, Lfb/y;

    .line 150
    .line 151
    const-wide/16 v28, 0x0

    .line 152
    .line 153
    const v30, 0x31fbf

    .line 154
    .line 155
    .line 156
    const/4 v15, 0x0

    .line 157
    const/16 v16, 0x0

    .line 158
    .line 159
    const/16 v17, 0x0

    .line 160
    .line 161
    const/16 v18, 0x0

    .line 162
    .line 163
    const/16 v19, 0x0

    .line 164
    .line 165
    const/16 v21, 0x0

    .line 166
    .line 167
    const/16 v22, 0x0

    .line 168
    .line 169
    const/16 v23, 0x0

    .line 170
    .line 171
    const-string v24, "complete"

    .line 172
    .line 173
    const/16 v27, 0x0

    .line 174
    .line 175
    invoke-static/range {v14 .. v30}, Lfb/c;->a(Lfb/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfb/y;ZLjava/lang/String;JI)Lfb/c;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v9, v8, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    invoke-interface {v3, v9}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :cond_5
    invoke-static {v4, v5, v6, v3, v7}, Lwb/y2;->q1(Ljava/lang/String;Landroid/content/Context;Lwb/yt;Li0/a1;Li0/a1;)V

    .line 186
    .line 187
    .line 188
    const-string v2, "\u63d2\u4ef6\u5df2\u5220\u9664"

    .line 189
    .line 190
    invoke-static {v5, v2, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 195
    .line 196
    .line 197
    :cond_6
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    if-eqz v1, :cond_9

    .line 202
    .line 203
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    if-eqz v2, :cond_7

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_7
    const-string v2, "\u672a\u77e5\u9519\u8bef"

    .line 211
    .line 212
    :goto_4
    const-string v9, "\u5220\u9664\u5931\u8d25: "

    .line 213
    .line 214
    invoke-virtual {v9, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    invoke-static/range {v3 .. v9}, Lwb/y2;->p1(Li0/a1;Ljava/lang/String;Landroid/content/Context;Lwb/yt;Li0/a1;ILjava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    if-eqz v1, :cond_8

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_8
    const-string v1, "\u5220\u9664\u63d2\u4ef6\u5931\u8d25"

    .line 229
    .line 230
    :goto_5
    invoke-static {v5, v1, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 235
    .line 236
    .line 237
    :cond_9
    return-void
.end method
