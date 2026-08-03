.class public final La1/g;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 13
    iput p2, p0, La1/g;->g:I

    iput-object p1, p0, La1/g;->h:Ljava/lang/Object;

    iput-object p3, p0, La1/g;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ly0/o;Lfg/p;I)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    .line 2
    iput p3, p0, La1/g;->g:I

    .line 3
    .line 4
    iput-object p1, p0, La1/g;->h:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La1/g;->i:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, La1/g;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 6
    .line 7
    iget-object v4, p0, La1/g;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, La1/g;->h:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Lf1/u;

    .line 15
    .line 16
    check-cast p2, Li1/b;

    .line 17
    .line 18
    check-cast v5, Lx1/i1;

    .line 19
    .line 20
    iget-object v0, v5, Lx1/i1;->u:Lx1/f0;

    .line 21
    .line 22
    invoke-virtual {v0}, Lx1/f0;->H()Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    iput-object p1, v5, Lx1/i1;->N:Lf1/u;

    .line 29
    .line 30
    iput-object p2, v5, Lx1/i1;->M:Li1/b;

    .line 31
    .line 32
    invoke-static {v0}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ly1/t;

    .line 37
    .line 38
    invoke-virtual {p1}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object p2, Lx1/i1;->T:Lf1/o0;

    .line 43
    .line 44
    sget-object p2, Lx1/d;->j:Lx1/d;

    .line 45
    .line 46
    check-cast v4, Lx1/f1;

    .line 47
    .line 48
    iget-object p1, p1, Lx1/t1;->a:Lw0/s;

    .line 49
    .line 50
    invoke-virtual {p1, v5, p2, v4}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 51
    .line 52
    .line 53
    iput-boolean v1, v5, Lx1/i1;->Q:Z

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iput-boolean v2, v5, Lx1/i1;->Q:Z

    .line 57
    .line 58
    :goto_0
    return-object v3

    .line 59
    :pswitch_0
    check-cast p1, Li0/h0;

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    check-cast v5, Ly0/o;

    .line 67
    .line 68
    check-cast v4, Lfg/p;

    .line 69
    .line 70
    invoke-static {v2}, Li0/r;->C(I)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-static {v5, v4, p1, p2}, Lv1/w;->b(Ly0/o;Lfg/p;Li0/h0;I)V

    .line 75
    .line 76
    .line 77
    return-object v3

    .line 78
    :pswitch_1
    check-cast p1, Li0/h0;

    .line 79
    .line 80
    check-cast p2, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    and-int/lit8 v0, p2, 0x3

    .line 87
    .line 88
    const/4 v6, 0x2

    .line 89
    if-eq v0, v6, :cond_1

    .line 90
    .line 91
    move v0, v2

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move v0, v1

    .line 94
    :goto_1
    and-int/2addr p2, v2

    .line 95
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_7

    .line 100
    .line 101
    check-cast v5, Lv1/b0;

    .line 102
    .line 103
    iget-object p2, v5, Lv1/b0;->g:Li0/j1;

    .line 104
    .line 105
    invoke-virtual {p2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p2, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    check-cast v4, Lfg/p;

    .line 116
    .line 117
    invoke-virtual {p1, p2}, Li0/h0;->c0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v0}, Li0/h0;->g(Z)Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eqz v0, :cond_2

    .line 125
    .line 126
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-interface {v4, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_2
    iget v0, p1, Li0/h0;->l:I

    .line 135
    .line 136
    if-nez v0, :cond_3

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_3
    const-string v0, "No nodes can be emitted before calling deactivateToEndGroup"

    .line 140
    .line 141
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :goto_2
    iget-boolean v0, p1, Li0/h0;->S:Z

    .line 145
    .line 146
    if-nez v0, :cond_5

    .line 147
    .line 148
    if-nez p2, :cond_4

    .line 149
    .line 150
    invoke-virtual {p1}, Li0/h0;->U()V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_4
    iget-object p2, p1, Li0/h0;->G:Ll0/g;

    .line 155
    .line 156
    iget v0, p2, Ll0/g;->g:I

    .line 157
    .line 158
    iget p2, p2, Ll0/g;->h:I

    .line 159
    .line 160
    iget-object v2, p1, Li0/h0;->M:Lm0/b;

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v1}, Lm0/b;->d(Z)V

    .line 166
    .line 167
    .line 168
    iget-object v2, v2, Lm0/b;->b:Lm0/a;

    .line 169
    .line 170
    iget-object v2, v2, Lm0/a;->j:Lm0/l0;

    .line 171
    .line 172
    sget-object v4, Lm0/i;->c:Lm0/i;

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Lm0/l0;->U(Lm0/j0;)V

    .line 175
    .line 176
    .line 177
    iget-object v2, p1, Li0/h0;->s:Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-static {v2, v0, p2}, Li0/r;->k(Ljava/util/List;II)V

    .line 180
    .line 181
    .line 182
    iget-object p2, p1, Li0/h0;->G:Ll0/g;

    .line 183
    .line 184
    invoke-virtual {p2}, Ll0/g;->t()V

    .line 185
    .line 186
    .line 187
    :cond_5
    :goto_3
    iget-boolean p2, p1, Li0/h0;->y:Z

    .line 188
    .line 189
    if-eqz p2, :cond_6

    .line 190
    .line 191
    iget-object p2, p1, Li0/h0;->G:Ll0/g;

    .line 192
    .line 193
    iget p2, p2, Ll0/g;->i:I

    .line 194
    .line 195
    iget v0, p1, Li0/h0;->z:I

    .line 196
    .line 197
    if-ne p2, v0, :cond_6

    .line 198
    .line 199
    const/4 p2, -0x1

    .line 200
    iput p2, p1, Li0/h0;->z:I

    .line 201
    .line 202
    iput-boolean v1, p1, Li0/h0;->y:Z

    .line 203
    .line 204
    :cond_6
    invoke-virtual {p1, v1}, Li0/h0;->p(Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_7
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 209
    .line 210
    .line 211
    :goto_4
    return-object v3

    .line 212
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    check-cast p2, Lf2/q;

    .line 219
    .line 220
    check-cast v4, La1/i;

    .line 221
    .line 222
    check-cast v5, Ly1/f2;

    .line 223
    .line 224
    iget-object v0, v5, Ly1/f2;->b:Lf/x;

    .line 225
    .line 226
    iget v1, p2, Lf2/q;->f:I

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Lf/x;->b(I)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-nez v0, :cond_8

    .line 233
    .line 234
    invoke-virtual {v4, p1, p2}, La1/i;->m(ILf2/q;)V

    .line 235
    .line 236
    .line 237
    iget-object p1, v4, La1/i;->n:Lsg/c;

    .line 238
    .line 239
    invoke-interface {p1, v3}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    :cond_8
    return-object v3

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
