.class public final synthetic Lwb/ug;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLfg/a;Ly0/o;I)V
    .locals 0

    .line 1
    const/4 p6, 0x0

    .line 2
    iput p6, p0, Lwb/ug;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ug;->i:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ug;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p3, p0, Lwb/ug;->h:Z

    .line 12
    .line 13
    iput-object p4, p0, Lwb/ug;->j:Lfg/a;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/ug;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lwb/y2;Ljava/lang/String;Ljava/lang/String;ZLfg/a;I)V
    .locals 0

    .line 18
    const/4 p6, 0x2

    iput p6, p0, Lwb/ug;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ug;->l:Ljava/lang/Object;

    iput-object p2, p0, Lwb/ug;->i:Ljava/lang/String;

    iput-object p3, p0, Lwb/ug;->k:Ljava/lang/Object;

    iput-boolean p4, p0, Lwb/ug;->h:Z

    iput-object p5, p0, Lwb/ug;->j:Lfg/a;

    return-void
.end method

.method public synthetic constructor <init>(ZLfg/l;Ljava/lang/String;Lfg/l;Lfg/a;)V
    .locals 1

    .line 19
    const/4 v0, 0x1

    iput v0, p0, Lwb/ug;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwb/ug;->h:Z

    iput-object p2, p0, Lwb/ug;->k:Ljava/lang/Object;

    iput-object p3, p0, Lwb/ug;->i:Ljava/lang/String;

    iput-object p4, p0, Lwb/ug;->l:Ljava/lang/Object;

    iput-object p5, p0, Lwb/ug;->j:Lfg/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/ug;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/ug;->l:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lwb/y2;

    .line 12
    .line 13
    iget-object v1, v0, Lwb/ug;->k:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, Ljava/lang/String;

    .line 17
    .line 18
    move-object/from16 v7, p1

    .line 19
    .line 20
    check-cast v7, Li0/h0;

    .line 21
    .line 22
    move-object/from16 v1, p2

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/16 v1, 0x6001

    .line 30
    .line 31
    invoke-static {v1}, Li0/r;->C(I)I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    iget-object v3, v0, Lwb/ug;->i:Ljava/lang/String;

    .line 36
    .line 37
    iget-boolean v5, v0, Lwb/ug;->h:Z

    .line 38
    .line 39
    iget-object v6, v0, Lwb/ug;->j:Lfg/a;

    .line 40
    .line 41
    invoke-virtual/range {v2 .. v8}, Lwb/y2;->A(Ljava/lang/String;Ljava/lang/String;ZLfg/a;Li0/h0;I)V

    .line 42
    .line 43
    .line 44
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    return-object v1

    .line 47
    :pswitch_0
    iget-object v1, v0, Lwb/ug;->k:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v6, v1

    .line 50
    check-cast v6, Lfg/l;

    .line 51
    .line 52
    iget-object v1, v0, Lwb/ug;->l:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v11, v1

    .line 55
    check-cast v11, Lfg/l;

    .line 56
    .line 57
    move-object/from16 v7, p1

    .line 58
    .line 59
    check-cast v7, Li0/h0;

    .line 60
    .line 61
    move-object/from16 v1, p2

    .line 62
    .line 63
    check-cast v1, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    and-int/lit8 v2, v1, 0x3

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    const/4 v15, 0x1

    .line 73
    const/4 v10, 0x0

    .line 74
    if-eq v2, v3, :cond_0

    .line 75
    .line 76
    move v2, v15

    .line 77
    goto :goto_1

    .line 78
    :cond_0
    move v2, v10

    .line 79
    :goto_1
    and-int/2addr v1, v15

    .line 80
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    const/16 v8, 0x1b0

    .line 87
    .line 88
    const/16 v9, 0x8

    .line 89
    .line 90
    iget-boolean v2, v0, Lwb/ug;->h:Z

    .line 91
    .line 92
    const-string v3, "\u81ea\u52a8\u538b\u7f29\u4e0a\u4e0b\u6587"

    .line 93
    .line 94
    const-string v4, "\u8fbe\u5230\u8bbe\u5b9a\u9608\u503c\u540e\u538b\u7f29\u8f83\u65e9\u5bf9\u8bdd"

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 98
    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    if-eqz v2, :cond_1

    .line 102
    .line 103
    const v2, -0x5eeecff0

    .line 104
    .line 105
    .line 106
    invoke-virtual {v7, v2}, Li0/h0;->a0(I)V

    .line 107
    .line 108
    .line 109
    invoke-static {v1, v7, v10, v15}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 110
    .line 111
    .line 112
    const/16 v13, 0x36

    .line 113
    .line 114
    const/16 v14, 0x8

    .line 115
    .line 116
    move-object v12, v7

    .line 117
    const-string v7, "\u538b\u7f29\u9608\u503c"

    .line 118
    .line 119
    const-string v8, "Token \u4f30\u7b97\u503c\uff0c\u8303\u56f4 2000 \u5230 1000000"

    .line 120
    .line 121
    iget-object v9, v0, Lwb/ug;->i:Ljava/lang/String;

    .line 122
    .line 123
    move v2, v10

    .line 124
    const/4 v10, 0x0

    .line 125
    invoke-static/range {v7 .. v14}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 126
    .line 127
    .line 128
    move-object v7, v12

    .line 129
    invoke-virtual {v7, v2}, Li0/h0;->p(Z)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_1
    move v2, v10

    .line 134
    const v3, -0x5ee9cc1a

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7, v3}, Li0/h0;->a0(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7, v2}, Li0/h0;->p(Z)V

    .line 141
    .line 142
    .line 143
    :goto_2
    invoke-static {v1, v7, v2, v15}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 144
    .line 145
    .line 146
    iget-object v1, v0, Lwb/ug;->j:Lfg/a;

    .line 147
    .line 148
    invoke-virtual {v7, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    if-nez v2, :cond_2

    .line 157
    .line 158
    sget-object v2, Li0/l;->a:Li0/e;

    .line 159
    .line 160
    if-ne v3, v2, :cond_3

    .line 161
    .line 162
    :cond_2
    new-instance v3, Lwb/kc;

    .line 163
    .line 164
    const/16 v2, 0x1b

    .line 165
    .line 166
    invoke-direct {v3, v1, v2}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_3
    check-cast v3, Lfg/a;

    .line 173
    .line 174
    const/16 v1, 0x36

    .line 175
    .line 176
    const-string v2, "\u7acb\u5373\u538b\u7f29\u5f53\u524d\u4f1a\u8bdd"

    .line 177
    .line 178
    const-string v4, "\u4fdd\u7559\u672c\u5730\u5386\u53f2\u548c\u5f53\u524d\u4ee3\u7801\u8349\u7a3f"

    .line 179
    .line 180
    invoke-static {v2, v4, v3, v7, v1}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_4
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 185
    .line 186
    .line 187
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 188
    .line 189
    return-object v1

    .line 190
    :pswitch_1
    iget-object v1, v0, Lwb/ug;->k:Ljava/lang/Object;

    .line 191
    .line 192
    move-object v6, v1

    .line 193
    check-cast v6, Ljava/lang/String;

    .line 194
    .line 195
    iget-object v1, v0, Lwb/ug;->l:Ljava/lang/Object;

    .line 196
    .line 197
    move-object v7, v1

    .line 198
    check-cast v7, Ly0/o;

    .line 199
    .line 200
    move-object/from16 v4, p1

    .line 201
    .line 202
    check-cast v4, Li0/h0;

    .line 203
    .line 204
    move-object/from16 v1, p2

    .line 205
    .line 206
    check-cast v1, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    const/16 v1, 0xc07

    .line 212
    .line 213
    invoke-static {v1}, Li0/r;->C(I)I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    iget-object v3, v0, Lwb/ug;->j:Lfg/a;

    .line 218
    .line 219
    iget-object v5, v0, Lwb/ug;->i:Ljava/lang/String;

    .line 220
    .line 221
    iget-boolean v8, v0, Lwb/ug;->h:Z

    .line 222
    .line 223
    invoke-static/range {v2 .. v8}, Lwb/ho;->U(ILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Ly0/o;Z)V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
