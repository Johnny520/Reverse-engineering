.class public final synthetic Lhb/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lhb/r;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lhb/r;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhb/o;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lhb/o;->h:Lhb/r;

    .line 4
    .line 5
    iput-object p2, p0, Lhb/o;->i:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lhb/o;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhb/o;->h:Lhb/r;

    .line 7
    .line 8
    iget-object v1, v0, Lhb/r;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lhb/q;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v3, v1, Lhb/q;->a:Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v3, v2

    .line 19
    :goto_0
    iget-object v4, p0, Lhb/o;->i:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_8

    .line 26
    .line 27
    iget-object v3, v0, Lhb/r;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    iget-object v4, v0, Lhb/r;->i:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Lhb/o;

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    iget-object v5, v0, Lhb/r;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Landroid/os/Handler;

    .line 40
    .line 41
    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iput-object v2, v0, Lhb/r;->i:Ljava/lang/Object;

    .line 45
    .line 46
    const-string v4, ""

    .line 47
    .line 48
    iput-object v4, v0, Lhb/r;->g:Ljava/lang/Object;

    .line 49
    .line 50
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 51
    .line 52
    iput-object v4, v0, Lhb/r;->h:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    invoke-virtual {v4}, Lq8/o;->a()Landroid/app/Activity;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move-object v4, v2

    .line 66
    :goto_1
    if-eqz v4, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object v4, v2

    .line 70
    :goto_2
    if-eqz v4, :cond_6

    .line 71
    .line 72
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-eqz v5, :cond_4

    .line 77
    .line 78
    const-string v6, "hchat_selected_message_send_token"

    .line 79
    .line 80
    invoke-virtual {v5, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move-object v5, v2

    .line 86
    :goto_3
    invoke-static {v5, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_5

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    move-object v4, v2

    .line 94
    :goto_4
    if-eqz v4, :cond_6

    .line 95
    .line 96
    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    .line 97
    .line 98
    .line 99
    :cond_6
    iput-object v2, v0, Lhb/r;->f:Ljava/lang/Object;

    .line 100
    .line 101
    iget-object v2, v1, Lhb/q;->d:Lfg/q;

    .line 102
    .line 103
    if-eqz v2, :cond_7

    .line 104
    .line 105
    iget v3, v1, Lhb/q;->g:I

    .line 106
    .line 107
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iget v1, v1, Lhb/q;->h:I

    .line 112
    .line 113
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-interface {v2, v3, v1, v4}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_7
    invoke-virtual {v0}, Lhb/r;->u()V

    .line 123
    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_8
    iget-object v0, v0, Lhb/r;->e:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Ljava/util/ArrayDeque;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_a

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Lhb/q;

    .line 148
    .line 149
    iget-object v2, v1, Lhb/q;->a:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-nez v2, :cond_9

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 159
    .line 160
    .line 161
    iget-object v0, v1, Lhb/q;->d:Lfg/q;

    .line 162
    .line 163
    if-eqz v0, :cond_a

    .line 164
    .line 165
    const/4 v2, 0x0

    .line 166
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    iget-object v3, v1, Lhb/q;->b:Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    iget-object v1, v1, Lhb/q;->c:Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    mul-int/2addr v1, v3

    .line 183
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-interface {v0, v2, v1, v3}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    :cond_a
    :goto_6
    return-void

    .line 193
    :pswitch_0
    iget-object v0, p0, Lhb/o;->h:Lhb/r;

    .line 194
    .line 195
    iget-object v1, v0, Lhb/r;->g:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v1, Ljava/lang/String;

    .line 198
    .line 199
    iget-object v2, p0, Lhb/o;->i:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-nez v1, :cond_b

    .line 206
    .line 207
    goto :goto_a

    .line 208
    :cond_b
    iget-object v1, v0, Lhb/r;->c:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v1, Lab/b;

    .line 211
    .line 212
    const-string v3, "\u7fa4\u53d1\u52a9\u624b\u7b49\u5f85\u5fae\u4fe1\u91cd\u53d1\u5b8c\u6210\u8d85\u65f6"

    .line 213
    .line 214
    const/4 v4, 0x0

    .line 215
    invoke-virtual {v1, v3, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-eqz v1, :cond_c

    .line 223
    .line 224
    invoke-virtual {v1}, Lq8/o;->a()Landroid/app/Activity;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    goto :goto_7

    .line 229
    :cond_c
    move-object v1, v4

    .line 230
    :goto_7
    if-eqz v1, :cond_d

    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_d
    move-object v1, v4

    .line 234
    :goto_8
    if-eqz v1, :cond_10

    .line 235
    .line 236
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    if-eqz v3, :cond_e

    .line 241
    .line 242
    const-string v5, "hchat_selected_message_send_token"

    .line 243
    .line 244
    invoke-virtual {v3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    goto :goto_9

    .line 249
    :cond_e
    move-object v3, v4

    .line 250
    :goto_9
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_f

    .line 255
    .line 256
    move-object v4, v1

    .line 257
    :cond_f
    if-eqz v4, :cond_10

    .line 258
    .line 259
    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    .line 260
    .line 261
    .line 262
    :cond_10
    iget-object v1, v0, Lhb/r;->h:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v1, Ljava/util/List;

    .line 265
    .line 266
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    iget-object v2, v0, Lhb/r;->f:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v2, Lhb/q;

    .line 273
    .line 274
    if-eqz v2, :cond_11

    .line 275
    .line 276
    const-wide/16 v3, 0x2ee

    .line 277
    .line 278
    invoke-virtual {v0, v2, v1, v3, v4}, Lhb/r;->a(Lhb/q;IJ)V

    .line 279
    .line 280
    .line 281
    :cond_11
    :goto_a
    return-void

    .line 282
    nop

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
