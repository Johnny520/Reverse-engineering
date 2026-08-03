.class public final synthetic Lwb/gs;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Lfb/r0;


# direct methods
.method public synthetic constructor <init>(ILfb/r0;Lfg/l;Ljava/util/List;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/gs;->g:I

    .line 2
    .line 3
    iput-object p3, p0, Lwb/gs;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p4, p0, Lwb/gs;->i:Ljava/util/List;

    .line 6
    .line 7
    iput-object p2, p0, Lwb/gs;->j:Lfb/r0;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/gs;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v0, p0, Lwb/gs;->i:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lfb/r0;

    .line 38
    .line 39
    iget-object v2, v1, Lfb/r0;->a:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v3, p0, Lwb/gs;->j:Lfb/r0;

    .line 42
    .line 43
    iget-object v3, v3, Lfb/r0;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    const/16 v7, 0xf

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-static/range {v1 .. v7}, Lfb/r0;->a(Lfb/r0;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)Lfb/r0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :cond_0
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-object v0, p0, Lwb/gs;->h:Lfg/l;

    .line 66
    .line 67
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_0
    move-object v4, p1

    .line 74
    check-cast v4, Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance p1, Ljava/util/ArrayList;

    .line 80
    .line 81
    iget-object v0, p0, Lwb/gs;->i:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Lfb/r0;

    .line 105
    .line 106
    iget-object v1, v0, Lfb/r0;->a:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v2, p0, Lwb/gs;->j:Lfb/r0;

    .line 109
    .line 110
    iget-object v2, v2, Lfb/r0;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_2

    .line 117
    .line 118
    const/4 v5, 0x0

    .line 119
    const/16 v6, 0x17

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    const/4 v2, 0x0

    .line 123
    const/4 v3, 0x0

    .line 124
    invoke-static/range {v0 .. v6}, Lfb/r0;->a(Lfb/r0;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)Lfb/r0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    :cond_2
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    iget-object v0, p0, Lwb/gs;->h:Lfg/l;

    .line 133
    .line 134
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    new-instance p1, Ljava/util/ArrayList;

    .line 145
    .line 146
    iget-object v0, p0, Lwb/gs;->i:Ljava/util/List;

    .line 147
    .line 148
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_5

    .line 164
    .line 165
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Lfb/r0;

    .line 170
    .line 171
    iget-object v1, v0, Lfb/r0;->a:Ljava/lang/String;

    .line 172
    .line 173
    iget-object v2, p0, Lwb/gs;->j:Lfb/r0;

    .line 174
    .line 175
    iget-object v2, v2, Lfb/r0;->a:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_4

    .line 182
    .line 183
    const/4 v5, 0x0

    .line 184
    const/16 v6, 0x1b

    .line 185
    .line 186
    const/4 v1, 0x0

    .line 187
    const/4 v2, 0x0

    .line 188
    const/4 v4, 0x0

    .line 189
    invoke-static/range {v0 .. v6}, Lfb/r0;->a(Lfb/r0;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)Lfb/r0;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    :cond_4
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_5
    iget-object v0, p0, Lwb/gs;->h:Lfg/l;

    .line 198
    .line 199
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    goto/16 :goto_1

    .line 203
    .line 204
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    new-instance v0, Ljava/util/ArrayList;

    .line 210
    .line 211
    iget-object v1, p0, Lwb/gs;->i:Ljava/util/List;

    .line 212
    .line 213
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_7

    .line 229
    .line 230
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    move-object v3, v2

    .line 235
    check-cast v3, Lfb/r0;

    .line 236
    .line 237
    iget-object v2, v3, Lfb/r0;->a:Ljava/lang/String;

    .line 238
    .line 239
    iget-object v4, p0, Lwb/gs;->j:Lfb/r0;

    .line 240
    .line 241
    iget-object v4, v4, Lfb/r0;->a:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-eqz v2, :cond_6

    .line 248
    .line 249
    const/16 v2, 0x20

    .line 250
    .line 251
    invoke-static {v2, p1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    const/4 v8, 0x0

    .line 256
    const/16 v9, 0x1d

    .line 257
    .line 258
    const/4 v4, 0x0

    .line 259
    const/4 v6, 0x0

    .line 260
    const/4 v7, 0x0

    .line 261
    invoke-static/range {v3 .. v9}, Lfb/r0;->a(Lfb/r0;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)Lfb/r0;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    :cond_6
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_7
    iget-object p1, p0, Lwb/gs;->h:Lfg/l;

    .line 270
    .line 271
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
