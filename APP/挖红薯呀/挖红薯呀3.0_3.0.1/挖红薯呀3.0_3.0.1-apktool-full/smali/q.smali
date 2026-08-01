.class public final Lq;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lq;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lq;->e:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lr;II)V
    .locals 0

    .line 10
    iput p3, p0, Lq;->d:I

    iput-object p1, p0, Lq;->e:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lq;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    sget-object v2, Lme0;->a:Lme0;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    sget-object v5, Lna1;->a:Lna1;

    .line 9
    .line 10
    iget-object p0, p0, Lq;->e:Ljava/lang/Object;

    .line 11
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
    check-cast p0, Lwn;

    .line 23
    .line 24
    invoke-static {v4}, Lj50;->A(I)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-virtual {p0, p1, p2}, Lwn;->b(Lji;I)V

    .line 29
    .line 30
    .line 31
    return-object v5

    .line 32
    :pswitch_0
    check-cast p1, Lpe0;

    .line 33
    .line 34
    check-cast p2, Lne0;

    .line 35
    .line 36
    check-cast p0, Lji;

    .line 37
    .line 38
    instance-of v0, p2, Lhi;

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    check-cast p2, Lhi;

    .line 43
    .line 44
    iget-object p2, p2, Lhi;->a:Lxw;

    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    invoke-static {v0, p2}, Ls91;->m(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {p2, v2, p0, v0}, Lxw;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, Lpe0;

    .line 59
    .line 60
    invoke-static {p0, p2}, Ls91;->D(Lji;Lpe0;)Lpe0;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    :cond_0
    invoke-interface {p1, p2}, Lpe0;->c(Lpe0;)Lpe0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_1
    check-cast p1, Lji;

    .line 70
    .line 71
    check-cast p2, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    check-cast p0, Lgi;

    .line 77
    .line 78
    invoke-static {v4}, Lj50;->A(I)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    invoke-virtual {p0, p1, p2}, Lgi;->b(Lji;I)V

    .line 83
    .line 84
    .line 85
    return-object v5

    .line 86
    :pswitch_2
    check-cast p1, Lji;

    .line 87
    .line 88
    check-cast p2, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    and-int/lit8 v0, p2, 0x3

    .line 95
    .line 96
    if-eq v0, v1, :cond_1

    .line 97
    .line 98
    move v0, v4

    .line 99
    goto :goto_0

    .line 100
    :cond_1
    move v0, v3

    .line 101
    :goto_0
    and-int/2addr p2, v4

    .line 102
    check-cast p1, Lpi;

    .line 103
    .line 104
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_3

    .line 109
    .line 110
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    sget-object v0, Lii;->a:Lr3;

    .line 115
    .line 116
    if-ne p2, v0, :cond_2

    .line 117
    .line 118
    sget-object p2, Lp3;->h:Lp3;

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    check-cast p2, Lsw;

    .line 124
    .line 125
    invoke-static {v2, p2}, Luz0;->a(Lpe0;Lsw;)Lpe0;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    check-cast p0, Loh0;

    .line 130
    .line 131
    invoke-interface {p0}, Lw31;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Lww;

    .line 136
    .line 137
    invoke-static {p2, p0, p1, v3}, Li4;->h(Lpe0;Lww;Lji;I)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    invoke-virtual {p1}, Lpi;->R()V

    .line 142
    .line 143
    .line 144
    :goto_1
    return-object v5

    .line 145
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    check-cast p2, Lxz0;

    .line 152
    .line 153
    check-cast p0, Lv4;

    .line 154
    .line 155
    invoke-virtual {p0, p1, p2}, Lv4;->l(ILxz0;)V

    .line 156
    .line 157
    .line 158
    return-object v5

    .line 159
    :pswitch_4
    check-cast p1, Lji;

    .line 160
    .line 161
    check-cast p2, Ljava/lang/Number;

    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    and-int/lit8 v0, p2, 0x3

    .line 168
    .line 169
    if-eq v0, v1, :cond_4

    .line 170
    .line 171
    move v0, v4

    .line 172
    goto :goto_2

    .line 173
    :cond_4
    move v0, v3

    .line 174
    :goto_2
    and-int/2addr p2, v4

    .line 175
    check-cast p1, Lpi;

    .line 176
    .line 177
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_5

    .line 182
    .line 183
    check-cast p0, Lr;

    .line 184
    .line 185
    invoke-virtual {p0, p1, v3}, Lr;->b(Lji;I)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_5
    invoke-virtual {p1}, Lpi;->R()V

    .line 190
    .line 191
    .line 192
    :goto_3
    return-object v5

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
