.class public final synthetic Lnb/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lnb/w;


# direct methods
.method public synthetic constructor <init>(Lnb/w;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnb/e;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lnb/e;->h:Lnb/w;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lnb/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnb/e;->h:Lnb/w;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lnb/w;->u()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Lnb/e;->h:Lnb/w;

    .line 16
    .line 17
    iget-boolean v1, v0, Lnb/w;->r:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lnb/w;->z()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Lnb/w;->m()V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void

    .line 29
    :pswitch_1
    iget-object v0, p0, Lnb/e;->h:Lnb/w;

    .line 30
    .line 31
    invoke-virtual {v0}, Lnb/w;->y()Lnb/z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "text_speech_volume_control"

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v1, v0, Lnb/w;->o:Lnb/l;

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Lnb/w;->c()V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {v0}, Lnb/w;->o()V

    .line 52
    .line 53
    .line 54
    :goto_1
    return-void

    .line 55
    :pswitch_2
    iget-object v0, p0, Lnb/e;->h:Lnb/w;

    .line 56
    .line 57
    iget-wide v1, v0, Lnb/w;->z:J

    .line 58
    .line 59
    const-wide/16 v3, 0x1

    .line 60
    .line 61
    add-long/2addr v1, v3

    .line 62
    iput-wide v1, v0, Lnb/w;->z:J

    .line 63
    .line 64
    iget-object v1, v0, Lnb/w;->d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Lnb/w;->c:Ljava/util/ArrayDeque;

    .line 70
    .line 71
    new-instance v2, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_3

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    move-object v4, v3

    .line 91
    check-cast v4, Lnb/l;

    .line 92
    .line 93
    instance-of v4, v4, Lnb/o;

    .line 94
    .line 95
    if-nez v4, :cond_2

    .line 96
    .line 97
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    iget-object v1, v0, Lnb/w;->c:Ljava/util/ArrayDeque;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 104
    .line 105
    .line 106
    iget-object v1, v0, Lnb/w;->c:Ljava/util/ArrayDeque;

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    .line 109
    .line 110
    .line 111
    iget-object v1, v0, Lnb/w;->o:Lnb/l;

    .line 112
    .line 113
    instance-of v1, v1, Lnb/o;

    .line 114
    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    iput-object v1, v0, Lnb/w;->o:Lnb/l;

    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    iput-boolean v1, v0, Lnb/w;->r:Z

    .line 122
    .line 123
    invoke-virtual {v0}, Lnb/w;->g()V

    .line 124
    .line 125
    .line 126
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-eqz v1, :cond_4

    .line 131
    .line 132
    iget-object v1, v1, Lj8/p;->b:Lj8/y;

    .line 133
    .line 134
    if-eqz v1, :cond_4

    .line 135
    .line 136
    new-instance v2, Lj8/u;

    .line 137
    .line 138
    const/4 v3, 0x2

    .line 139
    invoke-direct {v2, v1, v3}, Lj8/u;-><init>(Lj8/y;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v2}, Lj8/y;->r(Lj8/w;)Z

    .line 143
    .line 144
    .line 145
    :cond_4
    invoke-virtual {v0}, Lnb/w;->n()V

    .line 146
    .line 147
    .line 148
    :cond_5
    return-void

    .line 149
    :pswitch_3
    iget-object v0, p0, Lnb/e;->h:Lnb/w;

    .line 150
    .line 151
    iget-wide v1, v0, Lnb/w;->z:J

    .line 152
    .line 153
    const-wide/16 v3, 0x1

    .line 154
    .line 155
    add-long/2addr v1, v3

    .line 156
    iput-wide v1, v0, Lnb/w;->z:J

    .line 157
    .line 158
    iget-object v1, v0, Lnb/w;->d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    .line 161
    .line 162
    .line 163
    const-string v1, ""

    .line 164
    .line 165
    iput-object v1, v0, Lnb/w;->p:Ljava/lang/String;

    .line 166
    .line 167
    const/4 v1, 0x0

    .line 168
    iput v1, v0, Lnb/w;->q:I

    .line 169
    .line 170
    iput-boolean v1, v0, Lnb/w;->r:Z

    .line 171
    .line 172
    iput v1, v0, Lnb/w;->t:I

    .line 173
    .line 174
    invoke-virtual {v0}, Lnb/w;->p()V

    .line 175
    .line 176
    .line 177
    const/4 v1, 0x0

    .line 178
    iput-object v1, v0, Lnb/w;->o:Lnb/l;

    .line 179
    .line 180
    iget-object v1, v0, Lnb/w;->c:Ljava/util/ArrayDeque;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 183
    .line 184
    .line 185
    :try_start_0
    iget-object v1, v0, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 186
    .line 187
    if-eqz v1, :cond_6

    .line 188
    .line 189
    invoke-virtual {v1}, Landroid/speech/tts/TextToSpeech;->stop()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    .line 191
    .line 192
    :catchall_0
    :cond_6
    invoke-virtual {v0}, Lnb/w;->g()V

    .line 193
    .line 194
    .line 195
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    if-eqz v1, :cond_7

    .line 200
    .line 201
    iget-object v1, v1, Lj8/p;->b:Lj8/y;

    .line 202
    .line 203
    if-eqz v1, :cond_7

    .line 204
    .line 205
    new-instance v2, Lj8/u;

    .line 206
    .line 207
    const/4 v3, 0x2

    .line 208
    invoke-direct {v2, v1, v3}, Lj8/u;-><init>(Lj8/y;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v2}, Lj8/y;->r(Lj8/w;)Z

    .line 212
    .line 213
    .line 214
    :cond_7
    invoke-virtual {v0}, Lnb/w;->o()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, Lnb/w;->w()V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :pswitch_4
    iget-object v0, p0, Lnb/e;->h:Lnb/w;

    .line 222
    .line 223
    invoke-virtual {v0}, Lnb/w;->j()V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :pswitch_5
    iget-object v0, p0, Lnb/e;->h:Lnb/w;

    .line 228
    .line 229
    invoke-virtual {v0}, Lnb/w;->j()V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :pswitch_6
    iget-object v0, p0, Lnb/e;->h:Lnb/w;

    .line 234
    .line 235
    invoke-virtual {v0}, Lnb/w;->j()V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :pswitch_7
    iget-object v0, p0, Lnb/e;->h:Lnb/w;

    .line 240
    .line 241
    invoke-virtual {v0}, Lnb/w;->t()V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
