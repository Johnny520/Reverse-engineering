.class public final synthetic Lwb/v1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/s0;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lwb/s0;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/v1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/v1;->h:Lwb/s0;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/v1;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/v1;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p2, Li0/h0;

    .line 9
    .line 10
    check-cast p3, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    and-int/lit8 p1, p3, 0x11

    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    and-int/2addr p3, v1

    .line 30
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance p1, Lb0/q;

    .line 37
    .line 38
    const/16 p3, 0x1b

    .line 39
    .line 40
    iget-object v0, p0, Lwb/v1;->h:Lwb/s0;

    .line 41
    .line 42
    iget-object v2, p0, Lwb/v1;->i:Li0/a1;

    .line 43
    .line 44
    invoke-direct {p1, v0, p3, v2}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const p3, 0x4f19779e    # 2.5747533E9f

    .line 48
    .line 49
    .line 50
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const/16 p3, 0x30

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 62
    .line 63
    .line 64
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_0
    move-object v4, p2

    .line 68
    check-cast v4, Li0/h0;

    .line 69
    .line 70
    check-cast p3, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    and-int/lit8 p1, p2, 0x11

    .line 80
    .line 81
    const/16 p3, 0x10

    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    if-eq p1, p3, :cond_2

    .line 85
    .line 86
    move p1, v0

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const/4 p1, 0x0

    .line 89
    :goto_2
    and-int/2addr p2, v0

    .line 90
    invoke-virtual {v4, p2, p1}, Li0/h0;->S(IZ)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    iget-object p1, p0, Lwb/v1;->i:Li0/a1;

    .line 97
    .line 98
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, Ljava/util/Set;

    .line 103
    .line 104
    iget-object v0, p0, Lwb/v1;->h:Lwb/s0;

    .line 105
    .line 106
    iget-object p3, v0, Lwb/s0;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-virtual {v4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    invoke-virtual {v4, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    or-int/2addr p2, p3

    .line 121
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    if-nez p2, :cond_3

    .line 126
    .line 127
    sget-object p2, Li0/l;->a:Li0/e;

    .line 128
    .line 129
    if-ne p3, p2, :cond_4

    .line 130
    .line 131
    :cond_3
    new-instance p3, Lwb/x1;

    .line 132
    .line 133
    const/4 p2, 0x1

    .line 134
    invoke-direct {p3, v0, p1, p2}, Lwb/x1;-><init>(Lwb/s0;Li0/a1;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_4
    move-object v3, p3

    .line 141
    check-cast v3, Lfg/a;

    .line 142
    .line 143
    const/16 v5, 0x180

    .line 144
    .line 145
    const/4 v2, 0x1

    .line 146
    invoke-static/range {v0 .. v5}, Lwb/ho;->a0(Lwb/s0;ZZLfg/a;Li0/h0;I)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 151
    .line 152
    .line 153
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 154
    .line 155
    return-object p1

    .line 156
    :pswitch_1
    move-object v4, p2

    .line 157
    check-cast v4, Li0/h0;

    .line 158
    .line 159
    check-cast p3, Ljava/lang/Integer;

    .line 160
    .line 161
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    and-int/lit8 p1, p2, 0x11

    .line 169
    .line 170
    const/16 p3, 0x10

    .line 171
    .line 172
    const/4 v0, 0x1

    .line 173
    if-eq p1, p3, :cond_6

    .line 174
    .line 175
    move p1, v0

    .line 176
    goto :goto_4

    .line 177
    :cond_6
    const/4 p1, 0x0

    .line 178
    :goto_4
    and-int/2addr p2, v0

    .line 179
    invoke-virtual {v4, p2, p1}, Li0/h0;->S(IZ)Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    if-eqz p1, :cond_9

    .line 184
    .line 185
    iget-object p1, p0, Lwb/v1;->i:Li0/a1;

    .line 186
    .line 187
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    check-cast p2, Ljava/util/Set;

    .line 192
    .line 193
    iget-object v0, p0, Lwb/v1;->h:Lwb/s0;

    .line 194
    .line 195
    iget-object p3, v0, Lwb/s0;->a:Ljava/lang/String;

    .line 196
    .line 197
    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-virtual {v4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    invoke-virtual {v4, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result p3

    .line 209
    or-int/2addr p2, p3

    .line 210
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p3

    .line 214
    if-nez p2, :cond_7

    .line 215
    .line 216
    sget-object p2, Li0/l;->a:Li0/e;

    .line 217
    .line 218
    if-ne p3, p2, :cond_8

    .line 219
    .line 220
    :cond_7
    new-instance p3, Lwb/x1;

    .line 221
    .line 222
    const/4 p2, 0x0

    .line 223
    invoke-direct {p3, v0, p1, p2}, Lwb/x1;-><init>(Lwb/s0;Li0/a1;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    :cond_8
    move-object v3, p3

    .line 230
    check-cast v3, Lfg/a;

    .line 231
    .line 232
    const/16 v5, 0x180

    .line 233
    .line 234
    const/4 v2, 0x1

    .line 235
    invoke-static/range {v0 .. v5}, Lwb/ho;->a0(Lwb/s0;ZZLfg/a;Li0/h0;I)V

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_9
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 240
    .line 241
    .line 242
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 243
    .line 244
    return-object p1

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
