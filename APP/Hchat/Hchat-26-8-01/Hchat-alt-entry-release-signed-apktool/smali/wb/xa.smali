.class public final synthetic Lwb/xa;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/xa;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/xa;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/xa;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/xa;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/xa;->k:Li0/a1;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/xa;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lr/h;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v0, Lwb/p0;->b0:Ls0/d;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x3

    .line 15
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lwb/s1;

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    iget-object v4, p0, Lwb/xa;->h:Li0/a1;

    .line 22
    .line 23
    invoke-direct {v0, v4, v3}, Lwb/s1;-><init>(Li0/a1;I)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Ls0/d;

    .line 27
    .line 28
    const v5, -0x7daab9e4

    .line 29
    .line 30
    .line 31
    const/4 v6, 0x1

    .line 32
    invoke-direct {v3, v5, v0, v6}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    sget-object v0, Lwb/p0;->c0:Ls0/d;

    .line 51
    .line 52
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Lwb/p7;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    iget-object v4, p0, Lwb/xa;->i:Li0/a1;

    .line 59
    .line 60
    iget-object v5, p0, Lwb/xa;->j:Li0/a1;

    .line 61
    .line 62
    iget-object v7, p0, Lwb/xa;->k:Li0/a1;

    .line 63
    .line 64
    invoke-direct {v0, v4, v5, v7, v3}, Lwb/p7;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 65
    .line 66
    .line 67
    new-instance v3, Ls0/d;

    .line 68
    .line 69
    const v4, 0x72d42337

    .line 70
    .line 71
    .line 72
    invoke-direct {v3, v4, v0, v6}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 76
    .line 77
    .line 78
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_0
    check-cast p1, Lnb/g0;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v0, p1, Lnb/g0;->a:Ljava/util/List;

    .line 87
    .line 88
    new-instance v1, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_1

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Lnb/h0;

    .line 112
    .line 113
    new-instance v3, Lwb/dq;

    .line 114
    .line 115
    iget-object v4, v2, Lnb/h0;->b:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v2, v2, Lnb/h0;->a:Ljava/lang/String;

    .line 118
    .line 119
    invoke-direct {v3, v2, v4}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    iget-object v0, p0, Lwb/xa;->h:Li0/a1;

    .line 127
    .line 128
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p1, Lnb/g0;->b:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v1, p0, Lwb/xa;->i:Li0/a1;

    .line 134
    .line 135
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-boolean v0, p1, Lnb/g0;->d:Z

    .line 139
    .line 140
    if-eqz v0, :cond_2

    .line 141
    .line 142
    iget-object p1, p1, Lnb/g0;->c:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_3

    .line 149
    .line 150
    const-string p1, "\u5176\u5b83\u53ef\u7528\u5f15\u64ce"

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    const-string p1, ""

    .line 154
    .line 155
    :cond_3
    :goto_1
    iget-object v0, p0, Lwb/xa;->j:Li0/a1;

    .line 156
    .line 157
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 161
    .line 162
    iget-object v0, p0, Lwb/xa;->k:Li0/a1;

    .line 163
    .line 164
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 168
    .line 169
    return-object p1

    .line 170
    :pswitch_1
    check-cast p1, Lnb/g0;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v0, p1, Lnb/g0;->a:Ljava/util/List;

    .line 176
    .line 177
    new-instance v1, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_4

    .line 195
    .line 196
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Lnb/h0;

    .line 201
    .line 202
    new-instance v3, Lwb/dq;

    .line 203
    .line 204
    iget-object v4, v2, Lnb/h0;->b:Ljava/lang/String;

    .line 205
    .line 206
    iget-object v2, v2, Lnb/h0;->a:Ljava/lang/String;

    .line 207
    .line 208
    invoke-direct {v3, v2, v4}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_4
    iget-object v0, p0, Lwb/xa;->h:Li0/a1;

    .line 216
    .line 217
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    iget-object v0, p1, Lnb/g0;->b:Ljava/lang/String;

    .line 221
    .line 222
    iget-object v1, p0, Lwb/xa;->i:Li0/a1;

    .line 223
    .line 224
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    iget-boolean v0, p1, Lnb/g0;->d:Z

    .line 228
    .line 229
    if-eqz v0, :cond_5

    .line 230
    .line 231
    iget-object p1, p1, Lnb/g0;->c:Ljava/lang/String;

    .line 232
    .line 233
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_6

    .line 238
    .line 239
    const-string p1, "\u5176\u5b83\u53ef\u7528\u5f15\u64ce"

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_5
    const-string p1, ""

    .line 243
    .line 244
    :cond_6
    :goto_4
    iget-object v0, p0, Lwb/xa;->j:Li0/a1;

    .line 245
    .line 246
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 250
    .line 251
    iget-object v0, p0, Lwb/xa;->k:Li0/a1;

    .line 252
    .line 253
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
