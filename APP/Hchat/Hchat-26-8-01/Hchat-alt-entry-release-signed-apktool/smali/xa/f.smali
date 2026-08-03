.class public final synthetic Lxa/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lxa/f;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lxa/f;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lxa/f;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lxa/f;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lxa/f;->k:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lxa/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxa/f;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lqg/t;

    .line 9
    .line 10
    iget-object v1, p0, Lxa/f;->i:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, Li/c;

    .line 14
    .line 15
    iget-object v1, p0, Lxa/f;->j:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, v1

    .line 18
    check-cast v4, Li/c;

    .line 19
    .line 20
    iget-object v1, p0, Lxa/f;->k:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v5, v1

    .line 23
    check-cast v5, Li/c;

    .line 24
    .line 25
    new-instance v2, Lw/e0;

    .line 26
    .line 27
    const/4 v7, 0x4

    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-direct/range {v2 .. v7}, Lw/e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    invoke-static {v0, v6, v2, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 34
    .line 35
    .line 36
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    iget-object v0, p0, Lxa/f;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lxa/m;

    .line 42
    .line 43
    iget-object v1, p0, Lxa/f;->j:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Landroid/app/Activity;

    .line 46
    .line 47
    iget-object v2, p0, Lxa/f;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lxa/i;

    .line 50
    .line 51
    iget-object v3, v2, Lxa/i;->a:Landroid/app/Activity;

    .line 52
    .line 53
    iget-object v4, p0, Lxa/f;->h:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const/4 v6, 0x0

    .line 60
    if-nez v5, :cond_7

    .line 61
    .line 62
    check-cast v4, Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Lxa/m;->a(Landroid/app/Activity;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_0

    .line 78
    .line 79
    goto/16 :goto_2

    .line 80
    .line 81
    :cond_0
    const-string v0, "\u6682\u65e0\u597d\u53cb\u6807\u7b7e\uff0c\u8bf7\u5148\u65b0\u5efa\u6807\u7b7e"

    .line 82
    .line 83
    invoke-static {v1, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_2

    .line 91
    .line 92
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-static {v3}, Lxa/m;->a(Landroid/app/Activity;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_2

    .line 100
    .line 101
    goto/16 :goto_2

    .line 102
    .line 103
    :cond_2
    invoke-static {v4}, La/a;->X(Ljava/util/Collection;)Llg/d;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    new-instance v5, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    :cond_3
    :goto_0
    move-object v6, v1

    .line 117
    check-cast v6, Llg/c;

    .line 118
    .line 119
    iget-boolean v7, v6, Llg/c;->i:Z

    .line 120
    .line 121
    if-eqz v7, :cond_4

    .line 122
    .line 123
    invoke-virtual {v6}, Llg/c;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    move-object v7, v6

    .line 128
    check-cast v7, Ljava/lang/Number;

    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    check-cast v7, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 139
    .line 140
    iget-object v7, v7, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 141
    .line 142
    iget-object v8, v2, Lxa/i;->b:Ljava/lang/String;

    .line 143
    .line 144
    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-eqz v7, :cond_3

    .line 149
    .line 150
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_4
    invoke-static {v5}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    new-instance v6, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_6

    .line 176
    .line 177
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    check-cast v5, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 182
    .line 183
    iget-object v8, v5, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 184
    .line 185
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    if-eqz v9, :cond_5

    .line 190
    .line 191
    iget-object v8, v5, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 192
    .line 193
    :cond_5
    iget-object v5, v5, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    const-string v9, " \u4f4d\u597d\u53cb"

    .line 200
    .line 201
    invoke-static {v5, v9}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    new-instance v9, Lsf/e;

    .line 206
    .line 207
    invoke-direct {v9, v8, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_6
    new-instance v8, Lwb/dj;

    .line 215
    .line 216
    const/16 v1, 0xc

    .line 217
    .line 218
    invoke-direct {v8, v0, v2, v4, v1}, Lwb/dj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 219
    .line 220
    .line 221
    new-instance v9, Lk/s1;

    .line 222
    .line 223
    const/4 v0, 0x7

    .line 224
    invoke-direct {v9, v0}, Lk/s1;-><init>(I)V

    .line 225
    .line 226
    .line 227
    const/16 v10, 0x100

    .line 228
    .line 229
    const-string v4, "\u8bbe\u7f6e\u597d\u53cb\u6807\u7b7e"

    .line 230
    .line 231
    const-string v5, "\u53d6\u6d88\u5168\u90e8\u52fe\u9009\u53ef\u6e05\u7a7a\u8be5\u597d\u53cb\u7684\u6807\u7b7e"

    .line 232
    .line 233
    invoke-static/range {v3 .. v10}, Lwb/y2;->Z1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;Lfg/l;Lfg/a;I)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_7
    iget-object v0, v0, Lxa/m;->b:Lia/t;

    .line 238
    .line 239
    const-string v2, "\u8f7d\u5165\u597d\u53cb\u6807\u7b7e\u5931\u8d25"

    .line 240
    .line 241
    invoke-virtual {v0, v2, v5}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    invoke-static {v1}, Lxa/m;->a(Landroid/app/Activity;)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-nez v0, :cond_8

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_8
    invoke-static {v1, v2, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 256
    .line 257
    .line 258
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
