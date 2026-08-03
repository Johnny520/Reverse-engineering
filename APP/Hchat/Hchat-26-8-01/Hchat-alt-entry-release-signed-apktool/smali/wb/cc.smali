.class public final synthetic Lwb/cc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p7, p0, Lwb/cc;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/cc;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/cc;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/cc;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/cc;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/cc;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/cc;->m:Ljava/util/List;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 19
    iput p7, p0, Lwb/cc;->g:I

    iput-object p1, p0, Lwb/cc;->m:Ljava/util/List;

    iput-object p2, p0, Lwb/cc;->h:Li0/a1;

    iput-object p3, p0, Lwb/cc;->i:Li0/a1;

    iput-object p4, p0, Lwb/cc;->j:Li0/a1;

    iput-object p5, p0, Lwb/cc;->k:Li0/a1;

    iput-object p6, p0, Lwb/cc;->l:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/cc;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    check-cast p2, Li0/h0;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    and-int/lit8 p1, p3, 0x11

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
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
    new-instance v2, Lwb/ue;

    .line 37
    .line 38
    const/4 v9, 0x0

    .line 39
    iget-object v3, p0, Lwb/cc;->h:Li0/a1;

    .line 40
    .line 41
    iget-object v4, p0, Lwb/cc;->i:Li0/a1;

    .line 42
    .line 43
    iget-object v5, p0, Lwb/cc;->j:Li0/a1;

    .line 44
    .line 45
    iget-object v6, p0, Lwb/cc;->k:Li0/a1;

    .line 46
    .line 47
    iget-object v7, p0, Lwb/cc;->l:Li0/a1;

    .line 48
    .line 49
    iget-object v8, p0, Lwb/cc;->m:Ljava/util/List;

    .line 50
    .line 51
    invoke-direct/range {v2 .. v9}, Lwb/ue;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/util/List;I)V

    .line 52
    .line 53
    .line 54
    const p1, 0x66316553

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const/16 p3, 0x30

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 69
    .line 70
    .line 71
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 72
    .line 73
    return-object p1

    .line 74
    :pswitch_0
    const/16 v0, 0x10

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    if-eq p1, v0, :cond_2

    .line 78
    .line 79
    move p1, v1

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    const/4 p1, 0x0

    .line 82
    :goto_2
    and-int/2addr p3, v1

    .line 83
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_3

    .line 88
    .line 89
    new-instance v2, Lwb/ue;

    .line 90
    .line 91
    const/4 v9, 0x1

    .line 92
    iget-object v3, p0, Lwb/cc;->m:Ljava/util/List;

    .line 93
    .line 94
    iget-object v4, p0, Lwb/cc;->h:Li0/a1;

    .line 95
    .line 96
    iget-object v5, p0, Lwb/cc;->i:Li0/a1;

    .line 97
    .line 98
    iget-object v6, p0, Lwb/cc;->j:Li0/a1;

    .line 99
    .line 100
    iget-object v7, p0, Lwb/cc;->k:Li0/a1;

    .line 101
    .line 102
    iget-object v8, p0, Lwb/cc;->l:Li0/a1;

    .line 103
    .line 104
    invoke-direct/range {v2 .. v9}, Lwb/ue;-><init>(Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 105
    .line 106
    .line 107
    const p1, -0x1ada622f

    .line 108
    .line 109
    .line 110
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const/16 p3, 0x30

    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 122
    .line 123
    .line 124
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1

    .line 127
    :pswitch_1
    const/16 v0, 0x10

    .line 128
    .line 129
    const/4 v1, 0x1

    .line 130
    if-eq p1, v0, :cond_4

    .line 131
    .line 132
    move p1, v1

    .line 133
    goto :goto_4

    .line 134
    :cond_4
    const/4 p1, 0x0

    .line 135
    :goto_4
    and-int/2addr p3, v1

    .line 136
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_5

    .line 141
    .line 142
    new-instance v2, Lwb/ue;

    .line 143
    .line 144
    const/4 v9, 0x3

    .line 145
    iget-object v3, p0, Lwb/cc;->h:Li0/a1;

    .line 146
    .line 147
    iget-object v4, p0, Lwb/cc;->i:Li0/a1;

    .line 148
    .line 149
    iget-object v5, p0, Lwb/cc;->j:Li0/a1;

    .line 150
    .line 151
    iget-object v6, p0, Lwb/cc;->k:Li0/a1;

    .line 152
    .line 153
    iget-object v7, p0, Lwb/cc;->l:Li0/a1;

    .line 154
    .line 155
    iget-object v8, p0, Lwb/cc;->m:Ljava/util/List;

    .line 156
    .line 157
    invoke-direct/range {v2 .. v9}, Lwb/ue;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/util/List;I)V

    .line 158
    .line 159
    .line 160
    const p1, -0x2ea32dab

    .line 161
    .line 162
    .line 163
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    const/16 p3, 0x30

    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 175
    .line 176
    .line 177
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 178
    .line 179
    return-object p1

    .line 180
    :pswitch_2
    const/16 v0, 0x10

    .line 181
    .line 182
    const/4 v1, 0x1

    .line 183
    if-eq p1, v0, :cond_6

    .line 184
    .line 185
    move p1, v1

    .line 186
    goto :goto_6

    .line 187
    :cond_6
    const/4 p1, 0x0

    .line 188
    :goto_6
    and-int/2addr p3, v1

    .line 189
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-eqz p1, :cond_7

    .line 194
    .line 195
    new-instance v2, Lwb/ue;

    .line 196
    .line 197
    const/4 v9, 0x2

    .line 198
    iget-object v3, p0, Lwb/cc;->m:Ljava/util/List;

    .line 199
    .line 200
    iget-object v4, p0, Lwb/cc;->h:Li0/a1;

    .line 201
    .line 202
    iget-object v5, p0, Lwb/cc;->i:Li0/a1;

    .line 203
    .line 204
    iget-object v6, p0, Lwb/cc;->j:Li0/a1;

    .line 205
    .line 206
    iget-object v7, p0, Lwb/cc;->k:Li0/a1;

    .line 207
    .line 208
    iget-object v8, p0, Lwb/cc;->l:Li0/a1;

    .line 209
    .line 210
    invoke-direct/range {v2 .. v9}, Lwb/ue;-><init>(Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 211
    .line 212
    .line 213
    const p1, -0x5c331e9

    .line 214
    .line 215
    .line 216
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    const/16 p3, 0x30

    .line 221
    .line 222
    const/4 v0, 0x0

    .line 223
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 228
    .line 229
    .line 230
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 231
    .line 232
    return-object p1

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
