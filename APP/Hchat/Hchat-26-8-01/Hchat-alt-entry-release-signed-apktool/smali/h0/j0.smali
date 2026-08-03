.class public final synthetic Lh0/j0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lfg/a;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lh0/j0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lh0/j0;->i:Lfg/a;

    .line 8
    .line 9
    iput-object p2, p0, Lh0/j0;->h:Lfg/l;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lfg/l;Lfg/a;)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lh0/j0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/j0;->h:Lfg/l;

    iput-object p2, p0, Lh0/j0;->i:Lfg/a;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lh0/j0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lth/a;

    .line 7
    .line 8
    move-object v6, p2

    .line 9
    check-cast v6, Li0/h0;

    .line 10
    .line 11
    check-cast p3, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    and-int/lit8 p1, p2, 0x11

    .line 21
    .line 22
    const/16 p3, 0x10

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    if-eq p1, p3, :cond_0

    .line 26
    .line 27
    move p1, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    and-int/2addr p2, v0

    .line 31
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    iget-object p1, p0, Lh0/j0;->h:Lfg/l;

    .line 38
    .line 39
    invoke-virtual {v6, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    if-nez p2, :cond_1

    .line 48
    .line 49
    sget-object p2, Li0/l;->a:Li0/e;

    .line 50
    .line 51
    if-ne p3, p2, :cond_2

    .line 52
    .line 53
    :cond_1
    new-instance p3, Lc9/o0;

    .line 54
    .line 55
    const/4 p2, 0x2

    .line 56
    invoke-direct {p3, p1, p2}, Lc9/o0;-><init>(Lfg/l;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    move-object v1, p3

    .line 63
    check-cast v1, Lfg/a;

    .line 64
    .line 65
    const/16 v7, 0x186

    .line 66
    .line 67
    const/16 v8, 0x30

    .line 68
    .line 69
    const-string v0, "\u5fae\u4fe1\u9996\u9875"

    .line 70
    .line 71
    const-string v2, "\u8fd4\u56de"

    .line 72
    .line 73
    iget-object v3, p0, Lh0/j0;->i:Lfg/a;

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    const/4 v5, 0x0

    .line 77
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 82
    .line 83
    .line 84
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_0
    check-cast p1, Ly0/o;

    .line 88
    .line 89
    check-cast p2, Li0/h0;

    .line 90
    .line 91
    check-cast p3, Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    const p1, 0x2d4acc1b

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, p1}, Li0/h0;->a0(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    sget-object p3, Li0/l;->a:Li0/e;

    .line 107
    .line 108
    if-ne p1, p3, :cond_4

    .line 109
    .line 110
    iget-object p1, p0, Lh0/j0;->i:Lfg/a;

    .line 111
    .line 112
    invoke-static {p1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p2, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    check-cast p1, Li0/l2;

    .line 120
    .line 121
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, p3, :cond_5

    .line 126
    .line 127
    new-instance v0, Li/c;

    .line 128
    .line 129
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Le1/b;

    .line 134
    .line 135
    iget-wide v1, v1, Le1/b;->a:J

    .line 136
    .line 137
    new-instance v3, Le1/b;

    .line 138
    .line 139
    invoke-direct {v3, v1, v2}, Le1/b;-><init>(J)V

    .line 140
    .line 141
    .line 142
    sget-object v1, Lh0/m0;->b:Li/m1;

    .line 143
    .line 144
    sget-wide v4, Lh0/m0;->c:J

    .line 145
    .line 146
    new-instance v2, Le1/b;

    .line 147
    .line 148
    invoke-direct {v2, v4, v5}, Le1/b;-><init>(J)V

    .line 149
    .line 150
    .line 151
    const/16 v4, 0x8

    .line 152
    .line 153
    invoke-direct {v0, v3, v1, v2, v4}, Li/c;-><init>(Ljava/lang/Object;Li/m1;Ljava/lang/Object;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_5
    check-cast v0, Li/c;

    .line 160
    .line 161
    invoke-virtual {p2, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    if-nez v1, :cond_6

    .line 170
    .line 171
    if-ne v2, p3, :cond_7

    .line 172
    .line 173
    :cond_6
    new-instance v2, Lc0/m;

    .line 174
    .line 175
    const/4 v1, 0x0

    .line 176
    const/4 v3, 0x4

    .line 177
    invoke-direct {v2, p1, v0, v1, v3}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_7
    check-cast v2, Lfg/p;

    .line 184
    .line 185
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 186
    .line 187
    invoke-static {v2, p2, p1}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object p1, v0, Li/c;->c:Li/l;

    .line 191
    .line 192
    invoke-virtual {p2, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    if-nez v0, :cond_8

    .line 201
    .line 202
    if-ne v1, p3, :cond_9

    .line 203
    .line 204
    :cond_8
    new-instance v1, Lh0/i0;

    .line 205
    .line 206
    const/4 p3, 0x0

    .line 207
    invoke-direct {v1, p1, p3}, Lh0/i0;-><init>(Li0/l2;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :cond_9
    check-cast v1, Lfg/a;

    .line 214
    .line 215
    iget-object p1, p0, Lh0/j0;->h:Lfg/l;

    .line 216
    .line 217
    invoke-interface {p1, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    check-cast p1, Ly0/o;

    .line 222
    .line 223
    const/4 p3, 0x0

    .line 224
    invoke-virtual {p2, p3}, Li0/h0;->p(Z)V

    .line 225
    .line 226
    .line 227
    return-object p1

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
