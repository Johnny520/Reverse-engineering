.class public final synthetic Lwb/o1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/o1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/o1;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/o1;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/o1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 26
    .line 27
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 42
    .line 43
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_1
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 48
    .line 49
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/lang/String;

    .line 54
    .line 55
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 56
    .line 57
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_2
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 62
    .line 63
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 70
    .line 71
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :pswitch_3
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 76
    .line 77
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 84
    .line 85
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_4
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 90
    .line 91
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 106
    .line 107
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :pswitch_5
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 112
    .line 113
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 123
    .line 124
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :pswitch_6
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 129
    .line 130
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 140
    .line 141
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :pswitch_7
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 146
    .line 147
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Ljava/util/List;

    .line 152
    .line 153
    new-instance v1, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    :cond_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-eqz v2, :cond_3

    .line 167
    .line 168
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    move-object v3, v2

    .line 173
    check-cast v3, Lx8/s;

    .line 174
    .line 175
    iget v4, v3, Lx8/s;->b:I

    .line 176
    .line 177
    const/16 v5, 0xa

    .line 178
    .line 179
    if-eq v4, v5, :cond_2

    .line 180
    .line 181
    const/16 v5, 0xb

    .line 182
    .line 183
    if-eq v4, v5, :cond_2

    .line 184
    .line 185
    const/16 v5, 0xc

    .line 186
    .line 187
    if-ne v4, v5, :cond_1

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_1
    iget-object v3, v3, Lx8/s;->c:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-nez v3, :cond_0

    .line 197
    .line 198
    :cond_2
    :goto_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_3
    iget-object v0, p0, Lwb/o1;->h:Lfg/l;

    .line 203
    .line 204
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :pswitch_8
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 210
    .line 211
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, Lx8/b;

    .line 216
    .line 217
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 218
    .line 219
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :pswitch_9
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 225
    .line 226
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    check-cast v0, Lx8/b;

    .line 231
    .line 232
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 233
    .line 234
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :pswitch_a
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 240
    .line 241
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, Ljava/util/List;

    .line 246
    .line 247
    invoke-static {v0}, Lwb/ho;->X4(Ljava/util/List;)Ljava/util/ArrayList;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 252
    .line 253
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :pswitch_b
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 259
    .line 260
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    check-cast v0, Ljava/util/Set;

    .line 265
    .line 266
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 267
    .line 268
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :pswitch_c
    iget-object v0, p0, Lwb/o1;->i:Li0/a1;

    .line 274
    .line 275
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    check-cast v0, Ljava/util/Set;

    .line 280
    .line 281
    check-cast v0, Ljava/lang/Iterable;

    .line 282
    .line 283
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    iget-object v1, p0, Lwb/o1;->h:Lfg/l;

    .line 288
    .line 289
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    nop

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
