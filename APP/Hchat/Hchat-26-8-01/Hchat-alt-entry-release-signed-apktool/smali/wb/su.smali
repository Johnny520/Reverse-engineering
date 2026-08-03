.class public final synthetic Lwb/su;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/su;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/su;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/su;->h:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/su;->i:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lwb/lv;Ljava/lang/String;)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lwb/su;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/su;->h:Ljava/lang/String;

    iput-object p2, p0, Lwb/su;->j:Ljava/lang/Object;

    iput-object p3, p0, Lwb/su;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/su;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/su;->j:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v3, v0

    .line 9
    check-cast v3, Lwb/lv;

    .line 10
    .line 11
    move-object v4, p1

    .line 12
    check-cast v4, Lfg/a;

    .line 13
    .line 14
    move-object v6, p2

    .line 15
    check-cast v6, Li0/h0;

    .line 16
    .line 17
    check-cast p3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    and-int/lit8 p2, p1, 0x6

    .line 27
    .line 28
    if-nez p2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v6, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    const/4 p2, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p2, 0x2

    .line 39
    :goto_0
    or-int/2addr p1, p2

    .line 40
    :cond_1
    and-int/lit8 p2, p1, 0x13

    .line 41
    .line 42
    const/16 p3, 0x12

    .line 43
    .line 44
    if-eq p2, p3, :cond_2

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const/4 p2, 0x0

    .line 49
    :goto_1
    and-int/lit8 p3, p1, 0x1

    .line 50
    .line 51
    invoke-virtual {v6, p3, p2}, Li0/h0;->S(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_3

    .line 56
    .line 57
    sget-object v1, Lwb/y2;->p:Lwb/y2;

    .line 58
    .line 59
    new-instance p2, Lwb/rf;

    .line 60
    .line 61
    const/4 p3, 0x1

    .line 62
    iget-object v0, p0, Lwb/su;->i:Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {p2, v0, v4, p3}, Lwb/rf;-><init>(Ljava/lang/String;Lfg/a;I)V

    .line 65
    .line 66
    .line 67
    const p3, -0x5a5ea6f5

    .line 68
    .line 69
    .line 70
    invoke-static {p3, p2, v6}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    shl-int/lit8 p1, p1, 0x9

    .line 75
    .line 76
    and-int/lit16 p1, p1, 0x1c00

    .line 77
    .line 78
    const p2, 0x36006

    .line 79
    .line 80
    .line 81
    or-int v7, p1, p2

    .line 82
    .line 83
    iget-object v2, p0, Lwb/su;->h:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual/range {v1 .. v7}, Lwb/y2;->J(Ljava/lang/String;Lwb/lv;Lfg/a;Ls0/d;Li0/h0;I)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 90
    .line 91
    .line 92
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 93
    .line 94
    return-object p1

    .line 95
    :pswitch_0
    iget-object v0, p0, Lwb/su;->j:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Landroid/app/Activity;

    .line 98
    .line 99
    move-object v4, p1

    .line 100
    check-cast v4, Lfg/a;

    .line 101
    .line 102
    move-object v6, p2

    .line 103
    check-cast v6, Li0/h0;

    .line 104
    .line 105
    check-cast p3, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    and-int/lit8 p2, p1, 0x6

    .line 115
    .line 116
    if-nez p2, :cond_5

    .line 117
    .line 118
    invoke-virtual {v6, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-eqz p2, :cond_4

    .line 123
    .line 124
    const/4 p2, 0x4

    .line 125
    goto :goto_3

    .line 126
    :cond_4
    const/4 p2, 0x2

    .line 127
    :goto_3
    or-int/2addr p1, p2

    .line 128
    :cond_5
    and-int/lit8 p2, p1, 0x13

    .line 129
    .line 130
    const/16 p3, 0x12

    .line 131
    .line 132
    if-eq p2, p3, :cond_6

    .line 133
    .line 134
    const/4 p2, 0x1

    .line 135
    goto :goto_4

    .line 136
    :cond_6
    const/4 p2, 0x0

    .line 137
    :goto_4
    and-int/lit8 p3, p1, 0x1

    .line 138
    .line 139
    invoke-virtual {v6, p3, p2}, Li0/h0;->S(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-eqz p2, :cond_9

    .line 144
    .line 145
    invoke-virtual {v6, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    const-string v2, "\u68c0\u6d4b\u5230\u5fae\u4fe1\u5f02\u5e38"

    .line 150
    .line 151
    invoke-virtual {v6, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p3

    .line 155
    or-int/2addr p2, p3

    .line 156
    iget-object p3, p0, Lwb/su;->h:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v6, p3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    or-int/2addr p2, v1

    .line 163
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-nez p2, :cond_7

    .line 168
    .line 169
    sget-object p2, Li0/l;->a:Li0/e;

    .line 170
    .line 171
    if-ne v1, p2, :cond_8

    .line 172
    .line 173
    :cond_7
    new-instance v1, Lwb/xi;

    .line 174
    .line 175
    const/16 p2, 0x14

    .line 176
    .line 177
    invoke-direct {v1, v0, p2, p3}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_8
    check-cast v1, Lfg/a;

    .line 184
    .line 185
    move-object p2, v1

    .line 186
    sget-object v1, Lwb/y2;->p:Lwb/y2;

    .line 187
    .line 188
    new-instance p3, Lwb/rj;

    .line 189
    .line 190
    const/16 v0, 0x17

    .line 191
    .line 192
    iget-object v3, p0, Lwb/su;->i:Ljava/lang/String;

    .line 193
    .line 194
    invoke-direct {p3, p2, v3, v4, v0}, Lwb/rj;-><init>(Lfg/a;Ljava/lang/Object;Lfg/a;I)V

    .line 195
    .line 196
    .line 197
    const p2, -0x3b06b7af

    .line 198
    .line 199
    .line 200
    invoke-static {p2, p3, v6}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    shl-int/lit8 p1, p1, 0x9

    .line 205
    .line 206
    and-int/lit16 p1, p1, 0x1c00

    .line 207
    .line 208
    const p2, 0x36186

    .line 209
    .line 210
    .line 211
    or-int v7, p1, p2

    .line 212
    .line 213
    sget-object v3, Lwb/lv;->i:Lwb/lv;

    .line 214
    .line 215
    invoke-virtual/range {v1 .. v7}, Lwb/y2;->J(Ljava/lang/String;Lwb/lv;Lfg/a;Ls0/d;Li0/h0;I)V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_9
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 220
    .line 221
    .line 222
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 223
    .line 224
    return-object p1

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
