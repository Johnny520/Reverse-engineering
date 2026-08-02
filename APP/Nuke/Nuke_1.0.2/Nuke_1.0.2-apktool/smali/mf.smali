.class public final synthetic Lmf;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbc2;Lwc2;Lfc2;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lmf;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lmf;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lmf;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lmf;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lmf;->i:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lmf;->m:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lmf;->n:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Lj20;Lxk1;Ljava/lang/Object;Lxk1;Lxk1;Landroid/content/Context;I)V
    .locals 0

    .line 20
    iput p7, p0, Lmf;->h:I

    iput-object p1, p0, Lmf;->i:Ljava/lang/Object;

    iput-object p2, p0, Lmf;->n:Ljava/lang/Object;

    iput-object p3, p0, Lmf;->j:Ljava/lang/Object;

    iput-object p4, p0, Lmf;->k:Ljava/lang/Object;

    iput-object p5, p0, Lmf;->l:Ljava/lang/Object;

    iput-object p6, p0, Lmf;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lb73;Ljava/lang/String;Lin0;Lc73;Lxk1;)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lmf;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf;->i:Ljava/lang/Object;

    iput-object p2, p0, Lmf;->k:Ljava/lang/Object;

    iput-object p3, p0, Lmf;->j:Ljava/lang/Object;

    iput-object p4, p0, Lmf;->l:Ljava/lang/Object;

    iput-object p5, p0, Lmf;->m:Ljava/lang/Object;

    iput-object p6, p0, Lmf;->n:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkf2;Luq1;Ljava/lang/String;Lxk1;Lxk1;Lxk1;)V
    .locals 1

    .line 21
    const/4 v0, 0x4

    iput v0, p0, Lmf;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf;->j:Ljava/lang/Object;

    iput-object p2, p0, Lmf;->k:Ljava/lang/Object;

    iput-object p3, p0, Lmf;->i:Ljava/lang/Object;

    iput-object p4, p0, Lmf;->n:Ljava/lang/Object;

    iput-object p5, p0, Lmf;->l:Ljava/lang/Object;

    iput-object p6, p0, Lmf;->m:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lmf;->h:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    sget-object v3, La83;->a:La83;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, Lmf;->m:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, Lmf;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, Lmf;->n:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v8, v0, Lmf;->i:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v9, v0, Lmf;->k:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v0, v0, Lmf;->j:Ljava/lang/Object;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    check-cast v0, Lkf2;

    .line 25
    .line 26
    check-cast v9, Luq1;

    .line 27
    .line 28
    check-cast v8, Ljava/lang/String;

    .line 29
    .line 30
    check-cast v7, Lxk1;

    .line 31
    .line 32
    check-cast v6, Lxk1;

    .line 33
    .line 34
    check-cast v5, Lxk1;

    .line 35
    .line 36
    invoke-interface {v7, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, v9, Luq1;->c:Lrf2;

    .line 40
    .line 41
    iget-object v0, v0, Lrf2;->b:Ld41;

    .line 42
    .line 43
    invoke-virtual {v0, v8}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lj31;

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    const-string v0, ""

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    instance-of v1, v0, Lz21;

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    move-object v7, v0

    .line 59
    check-cast v7, Ljava/lang/Iterable;

    .line 60
    .line 61
    new-instance v11, Lxc2;

    .line 62
    .line 63
    const/16 v0, 0x1d

    .line 64
    .line 65
    invoke-direct {v11, v0}, Lxc2;-><init>(I)V

    .line 66
    .line 67
    .line 68
    const/16 v12, 0x1e

    .line 69
    .line 70
    const-string v8, "\n"

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x0

    .line 74
    invoke-static/range {v7 .. v12}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    instance-of v1, v0, Li41;

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    check-cast v0, Li41;

    .line 84
    .line 85
    invoke-virtual {v0}, Li41;->a()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto :goto_0

    .line 90
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :goto_0
    invoke-interface {v6, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v5, v4}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-object v3

    .line 101
    :pswitch_0
    check-cast v8, Lj20;

    .line 102
    .line 103
    move-object v15, v7

    .line 104
    check-cast v15, Lxk1;

    .line 105
    .line 106
    move-object v11, v0

    .line 107
    check-cast v11, Lvy1;

    .line 108
    .line 109
    move-object v12, v9

    .line 110
    check-cast v12, Lxk1;

    .line 111
    .line 112
    move-object v13, v6

    .line 113
    check-cast v13, Lxk1;

    .line 114
    .line 115
    move-object v14, v5

    .line 116
    check-cast v14, Landroid/content/Context;

    .line 117
    .line 118
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-interface {v15, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    new-instance v10, Lvi2;

    .line 124
    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    const/16 v17, 0x2

    .line 128
    .line 129
    invoke-direct/range {v10 .. v17}, Lvi2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 130
    .line 131
    .line 132
    invoke-static {v8, v4, v10, v2}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 133
    .line 134
    .line 135
    return-object v3

    .line 136
    :pswitch_1
    check-cast v8, Lj20;

    .line 137
    .line 138
    move-object v15, v7

    .line 139
    check-cast v15, Lxk1;

    .line 140
    .line 141
    move-object v11, v0

    .line 142
    check-cast v11, Lcq1;

    .line 143
    .line 144
    move-object v12, v9

    .line 145
    check-cast v12, Lxk1;

    .line 146
    .line 147
    move-object v13, v6

    .line 148
    check-cast v13, Lxk1;

    .line 149
    .line 150
    move-object v14, v5

    .line 151
    check-cast v14, Landroid/content/Context;

    .line 152
    .line 153
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-interface {v15, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    new-instance v10, Ltc;

    .line 159
    .line 160
    const/16 v16, 0x0

    .line 161
    .line 162
    invoke-direct/range {v10 .. v16}, Ltc;-><init>(Lcq1;Lxk1;Lxk1;Landroid/content/Context;Lxk1;Lt00;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v8, v4, v10, v2}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 166
    .line 167
    .line 168
    return-object v3

    .line 169
    :pswitch_2
    check-cast v0, Lbc2;

    .line 170
    .line 171
    check-cast v9, Lwc2;

    .line 172
    .line 173
    check-cast v6, Lfc2;

    .line 174
    .line 175
    check-cast v8, Ljava/lang/String;

    .line 176
    .line 177
    check-cast v7, [Ljava/lang/Object;

    .line 178
    .line 179
    iget-object v1, v0, Lbc2;->i:Lfc2;

    .line 180
    .line 181
    const/4 v2, 0x1

    .line 182
    if-eq v1, v6, :cond_3

    .line 183
    .line 184
    iput-object v6, v0, Lbc2;->i:Lfc2;

    .line 185
    .line 186
    move v1, v2

    .line 187
    goto :goto_1

    .line 188
    :cond_3
    const/4 v1, 0x0

    .line 189
    :goto_1
    iget-object v6, v0, Lbc2;->j:Ljava/lang/String;

    .line 190
    .line 191
    invoke-static {v6, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-nez v6, :cond_4

    .line 196
    .line 197
    iput-object v8, v0, Lbc2;->j:Ljava/lang/String;

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_4
    move v2, v1

    .line 201
    :goto_2
    iput-object v9, v0, Lbc2;->h:Lwc2;

    .line 202
    .line 203
    iput-object v5, v0, Lbc2;->k:Ljava/lang/Object;

    .line 204
    .line 205
    iput-object v7, v0, Lbc2;->l:[Ljava/lang/Object;

    .line 206
    .line 207
    iget-object v1, v0, Lbc2;->m:Lec2;

    .line 208
    .line 209
    if-eqz v1, :cond_5

    .line 210
    .line 211
    if-eqz v2, :cond_5

    .line 212
    .line 213
    check-cast v1, Lb5;

    .line 214
    .line 215
    invoke-virtual {v1}, Lb5;->H()V

    .line 216
    .line 217
    .line 218
    iput-object v4, v0, Lbc2;->m:Lec2;

    .line 219
    .line 220
    invoke-virtual {v0}, Lbc2;->b()V

    .line 221
    .line 222
    .line 223
    :cond_5
    return-object v3

    .line 224
    :pswitch_3
    check-cast v8, Ljava/lang/String;

    .line 225
    .line 226
    check-cast v9, Lb73;

    .line 227
    .line 228
    check-cast v0, Ljava/lang/String;

    .line 229
    .line 230
    check-cast v6, Lin0;

    .line 231
    .line 232
    move-object v10, v5

    .line 233
    check-cast v10, Lc73;

    .line 234
    .line 235
    check-cast v7, Lxk1;

    .line 236
    .line 237
    if-eqz v8, :cond_7

    .line 238
    .line 239
    iget-object v1, v9, Lb73;->b:Ljava/util/List;

    .line 240
    .line 241
    invoke-static {v8, v0, v1}, Lp7;->S(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v8, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-nez v0, :cond_6

    .line 250
    .line 251
    move-object v4, v8

    .line 252
    :cond_6
    new-instance v14, Lb73;

    .line 253
    .line 254
    invoke-direct {v14, v4, v1}, Lb73;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 255
    .line 256
    .line 257
    const/4 v15, 0x7

    .line 258
    const/4 v11, 0x0

    .line 259
    const/4 v12, 0x0

    .line 260
    const/4 v13, 0x0

    .line 261
    invoke-static/range {v10 .. v15}, Lc73;->a(Lc73;IIZLb73;I)Lc73;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-interface {v6, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 269
    .line 270
    invoke-interface {v7, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    :cond_7
    return-object v3

    .line 274
    nop

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
