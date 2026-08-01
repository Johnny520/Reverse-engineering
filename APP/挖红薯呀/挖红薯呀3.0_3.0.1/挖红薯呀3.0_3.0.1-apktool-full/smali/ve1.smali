.class public final Lve1;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lwe1;

.field public final synthetic f:Lww;


# direct methods
.method public synthetic constructor <init>(Lwe1;Lww;I)V
    .locals 0

    .line 1
    iput p3, p0, Lve1;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lve1;->e:Lwe1;

    .line 4
    .line 5
    iput-object p2, p0, Lve1;->f:Lww;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lve1;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object v2, p0, Lve1;->f:Lww;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    iget-object p0, p0, Lve1;->e:Lwe1;

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lji;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    and-int/lit8 v0, p2, 0x3

    .line 24
    .line 25
    if-eq v0, v3, :cond_0

    .line 26
    .line 27
    move v0, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v5

    .line 30
    :goto_0
    and-int/2addr p2, v4

    .line 31
    check-cast p1, Lpi;

    .line 32
    .line 33
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_d

    .line 38
    .line 39
    iget-object p2, p0, Lwe1;->d:Lw3;

    .line 40
    .line 41
    const v0, 0x7f060041

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    instance-of v6, v3, Ljava/util/Set;

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    instance-of v6, v3, Lp40;

    .line 54
    .line 55
    if-eqz v6, :cond_1

    .line 56
    .line 57
    instance-of v6, v3, Lt40;

    .line 58
    .line 59
    if-eqz v6, :cond_2

    .line 60
    .line 61
    :cond_1
    check-cast v3, Ljava/util/Set;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move-object v3, v7

    .line 65
    :goto_1
    if-nez v3, :cond_7

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    instance-of v6, v3, Landroid/view/View;

    .line 72
    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    check-cast v3, Landroid/view/View;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    move-object v3, v7

    .line 79
    :goto_2
    if-eqz v3, :cond_4

    .line 80
    .line 81
    invoke-virtual {v3, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move-object v0, v7

    .line 87
    :goto_3
    instance-of v3, v0, Ljava/util/Set;

    .line 88
    .line 89
    if-eqz v3, :cond_6

    .line 90
    .line 91
    instance-of v3, v0, Lp40;

    .line 92
    .line 93
    if-eqz v3, :cond_5

    .line 94
    .line 95
    instance-of v3, v0, Lt40;

    .line 96
    .line 97
    if-eqz v3, :cond_6

    .line 98
    .line 99
    :cond_5
    move-object v3, v0

    .line 100
    check-cast v3, Ljava/util/Set;

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_6
    move-object v3, v7

    .line 104
    :cond_7
    :goto_4
    if-eqz v3, :cond_8

    .line 105
    .line 106
    invoke-virtual {p1}, Lpi;->w()Lui;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    iput-boolean v4, p1, Lpi;->q:Z

    .line 114
    .line 115
    iput-boolean v4, p1, Lpi;->C:Z

    .line 116
    .line 117
    iget-object v0, p1, Lpi;->c:Lw11;

    .line 118
    .line 119
    invoke-virtual {v0}, Lw11;->b()V

    .line 120
    .line 121
    .line 122
    iget-object v0, p1, Lpi;->H:Lw11;

    .line 123
    .line 124
    invoke-virtual {v0}, Lw11;->b()V

    .line 125
    .line 126
    .line 127
    iget-object v0, p1, Lpi;->I:Lz11;

    .line 128
    .line 129
    iget-object v6, v0, Lz11;->a:Lw11;

    .line 130
    .line 131
    iget-object v8, v6, Lw11;->m:Ljava/util/HashMap;

    .line 132
    .line 133
    iput-object v8, v0, Lz11;->e:Ljava/util/HashMap;

    .line 134
    .line 135
    iget-object v6, v6, Lw11;->n:Lug0;

    .line 136
    .line 137
    iput-object v6, v0, Lz11;->f:Lug0;

    .line 138
    .line 139
    :cond_8
    invoke-virtual {p1, p0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    sget-object v8, Lii;->a:Lr3;

    .line 148
    .line 149
    if-nez v0, :cond_9

    .line 150
    .line 151
    if-ne v6, v8, :cond_a

    .line 152
    .line 153
    :cond_9
    new-instance v6, Lue1;

    .line 154
    .line 155
    invoke-direct {v6, p0, v7, v5}, Lue1;-><init>(Lwe1;Lik;I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v6}, Lpi;->g0(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_a
    check-cast v6, Lww;

    .line 162
    .line 163
    invoke-static {p1, v6, p2}, Ls91;->d(Lji;Lww;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, p0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    if-nez v0, :cond_b

    .line 175
    .line 176
    if-ne v6, v8, :cond_c

    .line 177
    .line 178
    :cond_b
    new-instance v6, Lue1;

    .line 179
    .line 180
    invoke-direct {v6, p0, v7, v4}, Lue1;-><init>(Lwe1;Lik;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v6}, Lpi;->g0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_c
    check-cast v6, Lww;

    .line 187
    .line 188
    invoke-static {p1, v6, p2}, Ls91;->d(Lji;Lww;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    sget-object p2, Lr20;->a:Lg41;

    .line 192
    .line 193
    invoke-virtual {p2, v3}, Lg41;->a(Ljava/lang/Object;)Lct0;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    new-instance v0, Lve1;

    .line 198
    .line 199
    invoke-direct {v0, p0, v2, v5}, Lve1;-><init>(Lwe1;Lww;I)V

    .line 200
    .line 201
    .line 202
    const p0, -0x10b420f1

    .line 203
    .line 204
    .line 205
    invoke-static {p0, v0, p1}, Lkl;->w(ILex;Lji;)Lmh;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    const/16 v0, 0x38

    .line 210
    .line 211
    invoke-static {p2, p0, p1, v0}, Li4;->b(Lct0;Lww;Lji;I)V

    .line 212
    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_d
    invoke-virtual {p1}, Lpi;->R()V

    .line 216
    .line 217
    .line 218
    :goto_5
    return-object v1

    .line 219
    :pswitch_0
    check-cast p1, Lji;

    .line 220
    .line 221
    check-cast p2, Ljava/lang/Number;

    .line 222
    .line 223
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result p2

    .line 227
    and-int/lit8 v0, p2, 0x3

    .line 228
    .line 229
    if-eq v0, v3, :cond_e

    .line 230
    .line 231
    move v0, v4

    .line 232
    goto :goto_6

    .line 233
    :cond_e
    move v0, v5

    .line 234
    :goto_6
    and-int/2addr p2, v4

    .line 235
    check-cast p1, Lpi;

    .line 236
    .line 237
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 238
    .line 239
    .line 240
    move-result p2

    .line 241
    if-eqz p2, :cond_f

    .line 242
    .line 243
    iget-object p0, p0, Lwe1;->d:Lw3;

    .line 244
    .line 245
    invoke-static {p0, v2, p1, v5}, Lr4;->a(Lw3;Lww;Lji;I)V

    .line 246
    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_f
    invoke-virtual {p1}, Lpi;->R()V

    .line 250
    .line 251
    .line 252
    :goto_7
    return-object v1

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
