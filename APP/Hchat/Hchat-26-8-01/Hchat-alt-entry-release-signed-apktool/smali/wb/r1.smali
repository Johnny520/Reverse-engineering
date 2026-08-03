.class public final synthetic Lwb/r1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lfg/l;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/r1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/r1;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/r1;->i:Lfg/l;

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
    .locals 4

    .line 1
    iget v0, p0, Lwb/r1;->g:I

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
    new-instance p1, Lwb/z1;

    .line 37
    .line 38
    const/4 p3, 0x5

    .line 39
    const/4 v0, 0x0

    .line 40
    iget-object v2, p0, Lwb/r1;->h:Ljava/util/List;

    .line 41
    .line 42
    iget-object v3, p0, Lwb/r1;->i:Lfg/l;

    .line 43
    .line 44
    invoke-direct {p1, v2, v3, p3, v0}, Lwb/z1;-><init>(Ljava/util/List;Lfg/l;IB)V

    .line 45
    .line 46
    .line 47
    const p3, 0x2e6b041a

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
    const/16 v0, 0x10

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    if-eq p1, v0, :cond_2

    .line 71
    .line 72
    move p1, v1

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    const/4 p1, 0x0

    .line 75
    :goto_2
    and-int/2addr p3, v1

    .line 76
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    new-instance p1, Lwb/z1;

    .line 83
    .line 84
    const/4 p3, 0x2

    .line 85
    const/4 v0, 0x0

    .line 86
    iget-object v2, p0, Lwb/r1;->h:Ljava/util/List;

    .line 87
    .line 88
    iget-object v3, p0, Lwb/r1;->i:Lfg/l;

    .line 89
    .line 90
    invoke-direct {p1, v2, v3, p3, v0}, Lwb/z1;-><init>(Ljava/util/List;Lfg/l;IB)V

    .line 91
    .line 92
    .line 93
    const p3, -0xe839d3c

    .line 94
    .line 95
    .line 96
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const/16 p3, 0x30

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 108
    .line 109
    .line 110
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 111
    .line 112
    return-object p1

    .line 113
    :pswitch_1
    const/16 v0, 0x10

    .line 114
    .line 115
    const/4 v1, 0x1

    .line 116
    if-eq p1, v0, :cond_4

    .line 117
    .line 118
    move p1, v1

    .line 119
    goto :goto_4

    .line 120
    :cond_4
    const/4 p1, 0x0

    .line 121
    :goto_4
    and-int/2addr p3, v1

    .line 122
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_5

    .line 127
    .line 128
    new-instance p1, Lwb/z1;

    .line 129
    .line 130
    const/4 p3, 0x1

    .line 131
    const/4 v0, 0x0

    .line 132
    iget-object v2, p0, Lwb/r1;->h:Ljava/util/List;

    .line 133
    .line 134
    iget-object v3, p0, Lwb/r1;->i:Lfg/l;

    .line 135
    .line 136
    invoke-direct {p1, v2, v3, p3, v0}, Lwb/z1;-><init>(Ljava/util/List;Lfg/l;IB)V

    .line 137
    .line 138
    .line 139
    const p3, -0x1a9ff115    # -6.613033E22f

    .line 140
    .line 141
    .line 142
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const/16 p3, 0x30

    .line 147
    .line 148
    const/4 v0, 0x0

    .line 149
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 154
    .line 155
    .line 156
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 157
    .line 158
    return-object p1

    .line 159
    :pswitch_2
    const/16 v0, 0x10

    .line 160
    .line 161
    const/4 v1, 0x1

    .line 162
    if-eq p1, v0, :cond_6

    .line 163
    .line 164
    move p1, v1

    .line 165
    goto :goto_6

    .line 166
    :cond_6
    const/4 p1, 0x0

    .line 167
    :goto_6
    and-int/2addr p3, v1

    .line 168
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_7

    .line 173
    .line 174
    new-instance p1, Lwb/z1;

    .line 175
    .line 176
    const/4 p3, 0x0

    .line 177
    const/4 v0, 0x0

    .line 178
    iget-object v2, p0, Lwb/r1;->h:Ljava/util/List;

    .line 179
    .line 180
    iget-object v3, p0, Lwb/r1;->i:Lfg/l;

    .line 181
    .line 182
    invoke-direct {p1, v2, v3, p3, v0}, Lwb/z1;-><init>(Ljava/util/List;Lfg/l;IB)V

    .line 183
    .line 184
    .line 185
    const p3, -0x16c8d17f

    .line 186
    .line 187
    .line 188
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    const/16 p3, 0x30

    .line 193
    .line 194
    const/4 v0, 0x0

    .line 195
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 196
    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 200
    .line 201
    .line 202
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 203
    .line 204
    return-object p1

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
