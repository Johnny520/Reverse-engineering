.class public final Ln2;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ln2;->i:I

    .line 2
    .line 3
    iput-object p2, p0, Ln2;->j:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lo2;II)V
    .locals 0

    .line 10
    iput p3, p0, Ln2;->i:I

    iput-object p1, p0, Ln2;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ln2;->i:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    sget-object v2, Lrh1;->a:Lrh1;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    sget-object v4, La83;->a:La83;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object p0, p0, Ln2;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lpx;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    check-cast p0, Ld22;

    .line 23
    .line 24
    invoke-static {v5}, Lpp0;->N(I)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-virtual {p0, p2, p1}, Ld22;->a(ILpx;)V

    .line 29
    .line 30
    .line 31
    return-object v4

    .line 32
    :pswitch_0
    check-cast p1, Lpx;

    .line 33
    .line 34
    check-cast p2, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    check-cast p0, Lm80;

    .line 40
    .line 41
    invoke-static {v5}, Lpp0;->N(I)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-virtual {p0, p2, p1}, Lm80;->a(ILpx;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :pswitch_1
    check-cast p1, Luh1;

    .line 50
    .line 51
    check-cast p2, Lsh1;

    .line 52
    .line 53
    check-cast p0, Lpx;

    .line 54
    .line 55
    instance-of v0, p2, Lmx;

    .line 56
    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    check-cast p2, Lmx;

    .line 60
    .line 61
    iget-object p2, p2, Lmx;->a:Lnn0;

    .line 62
    .line 63
    const/4 v0, 0x3

    .line 64
    invoke-static {v0, p2}, Lxe1;->f(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {p2, v2, p0, v0}, Lnn0;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p2, Luh1;

    .line 76
    .line 77
    invoke-static {p0, p2}, Ltl;->L(Lpx;Luh1;)Luh1;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    :cond_0
    invoke-interface {p1, p2}, Luh1;->c(Luh1;)Luh1;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_2
    check-cast p1, Lpx;

    .line 87
    .line 88
    check-cast p2, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 91
    .line 92
    .line 93
    check-cast p0, Lix;

    .line 94
    .line 95
    invoke-static {v5}, Lpp0;->N(I)I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    invoke-virtual {p0, p2, p1}, Lix;->a(ILpx;)V

    .line 100
    .line 101
    .line 102
    return-object v4

    .line 103
    :pswitch_3
    check-cast p1, Lpx;

    .line 104
    .line 105
    check-cast p2, Ljava/lang/Number;

    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    and-int/lit8 v0, p2, 0x3

    .line 112
    .line 113
    if-eq v0, v1, :cond_1

    .line 114
    .line 115
    move v0, v5

    .line 116
    goto :goto_0

    .line 117
    :cond_1
    move v0, v3

    .line 118
    :goto_0
    and-int/2addr p2, v5

    .line 119
    check-cast p1, Lgo0;

    .line 120
    .line 121
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_3

    .line 126
    .line 127
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    sget-object v0, Lnx;->a:Leb;

    .line 132
    .line 133
    if-ne p2, v0, :cond_2

    .line 134
    .line 135
    sget-object p2, Lv6;->n:Lv6;

    .line 136
    .line 137
    invoke-virtual {p1, p2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_2
    check-cast p2, Lin0;

    .line 141
    .line 142
    invoke-static {v2, v3, p2}, Lnn2;->a(Luh1;ZLin0;)Luh1;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    check-cast p0, Lxk1;

    .line 147
    .line 148
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, Lmn0;

    .line 153
    .line 154
    invoke-static {p2, p0, p1, v3}, Lte;->k(Luh1;Lmn0;Lpx;I)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_3
    invoke-virtual {p1}, Lgo0;->R()V

    .line 159
    .line 160
    .line 161
    :goto_1
    return-object v4

    .line 162
    :pswitch_4
    check-cast p1, Lpx;

    .line 163
    .line 164
    check-cast p2, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    and-int/lit8 v0, p2, 0x3

    .line 171
    .line 172
    if-eq v0, v1, :cond_4

    .line 173
    .line 174
    move v0, v5

    .line 175
    goto :goto_2

    .line 176
    :cond_4
    move v0, v3

    .line 177
    :goto_2
    and-int/2addr p2, v5

    .line 178
    check-cast p1, Lgo0;

    .line 179
    .line 180
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-eqz p2, :cond_5

    .line 185
    .line 186
    check-cast p0, Lo2;

    .line 187
    .line 188
    invoke-virtual {p0, v3, p1}, Lo2;->a(ILpx;)V

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_5
    invoke-virtual {p1}, Lgo0;->R()V

    .line 193
    .line 194
    .line 195
    :goto_3
    return-object v4

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
