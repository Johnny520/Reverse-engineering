.class public final synthetic Ln0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Ln0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Ln0;->i:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 9
    iput p3, p0, Ln0;->h:I

    iput-object p1, p0, Ln0;->i:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Ln0;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    sget-object v3, La83;->a:La83;

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object p0, p0, Ln0;->i:Ljava/lang/String;

    .line 9
    .line 10
    check-cast p1, Lpx;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v4}, Lpp0;->N(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p0, p1, p2}, Lse;->l(Ljava/lang/String;Lpx;I)V

    .line 25
    .line 26
    .line 27
    return-object v3

    .line 28
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v4}, Lpp0;->N(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-static {p0, p1, p2}, Lgf1;->g(Ljava/lang/String;Lpx;I)V

    .line 36
    .line 37
    .line 38
    return-object v3

    .line 39
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    and-int/lit8 v0, p2, 0x3

    .line 44
    .line 45
    if-eq v0, v2, :cond_0

    .line 46
    .line 47
    move v1, v4

    .line 48
    :cond_0
    and-int/2addr p2, v4

    .line 49
    move-object v9, p1

    .line 50
    check-cast v9, Lgo0;

    .line 51
    .line 52
    invoke-virtual {v9, p2, v1}, Lgo0;->O(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    invoke-static {p0}, Lp7;->N(Ljava/lang/String;)Lju;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const/16 v10, 0xc00

    .line 63
    .line 64
    const/16 v11, 0x16

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    const/high16 v7, 0x41b00000    # 22.0f

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    invoke-static/range {v4 .. v11}, Lgf1;->h(Lju;Luh1;ZFLxm0;Lpx;II)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {v9}, Lgo0;->R()V

    .line 76
    .line 77
    .line 78
    :goto_0
    return-object v3

    .line 79
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {v4}, Lpp0;->N(I)I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-static {p0, p1, p2}, Lci0;->m(Ljava/lang/String;Lpx;I)V

    .line 87
    .line 88
    .line 89
    return-object v3

    .line 90
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    and-int/lit8 v0, p2, 0x3

    .line 95
    .line 96
    if-eq v0, v2, :cond_2

    .line 97
    .line 98
    move v0, v4

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    move v0, v1

    .line 101
    :goto_1
    and-int/2addr p2, v4

    .line 102
    check-cast p1, Lgo0;

    .line 103
    .line 104
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_3

    .line 109
    .line 110
    invoke-static {p0, p1, v1}, Lci0;->m(Ljava/lang/String;Lpx;I)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-virtual {p1}, Lgo0;->R()V

    .line 115
    .line 116
    .line 117
    :goto_2
    return-object v3

    .line 118
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {v4}, Lpp0;->N(I)I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    invoke-static {p0, p1, p2}, Lyr;->a(Ljava/lang/String;Lpx;I)V

    .line 126
    .line 127
    .line 128
    return-object v3

    .line 129
    :pswitch_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {v4}, Lpp0;->N(I)I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    invoke-static {p0, p1, p2}, Lt11;->i(Ljava/lang/String;Lpx;I)V

    .line 137
    .line 138
    .line 139
    return-object v3

    .line 140
    :pswitch_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {v4}, Lpp0;->N(I)I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    invoke-static {p0, p1, p2}, Lt11;->d(Ljava/lang/String;Lpx;I)V

    .line 148
    .line 149
    .line 150
    return-object v3

    .line 151
    :pswitch_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-static {v4}, Lpp0;->N(I)I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    invoke-static {p0, p1, p2}, Ls11;->e(Ljava/lang/String;Lpx;I)V

    .line 159
    .line 160
    .line 161
    return-object v3

    .line 162
    :pswitch_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-static {v4}, Lpp0;->N(I)I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    invoke-static {p0, p1, p2}, Ls11;->c(Ljava/lang/String;Lpx;I)V

    .line 170
    .line 171
    .line 172
    return-object v3

    .line 173
    :pswitch_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-static {v4}, Lpp0;->N(I)I

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    invoke-static {p0, p1, p2}, Lrg3;->b(Ljava/lang/String;Lpx;I)V

    .line 181
    .line 182
    .line 183
    return-object v3

    .line 184
    :pswitch_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-static {v4}, Lpp0;->N(I)I

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    invoke-static {p0, p1, p2}, Lte;->i(Ljava/lang/String;Lpx;I)V

    .line 192
    .line 193
    .line 194
    return-object v3

    .line 195
    :pswitch_b
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-static {v4}, Lpp0;->N(I)I

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    invoke-static {p0, p1, p2}, Lse;->f(Ljava/lang/String;Lpx;I)V

    .line 203
    .line 204
    .line 205
    return-object v3

    .line 206
    :pswitch_c
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-static {v4}, Lpp0;->N(I)I

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    invoke-static {p0, p1, p2}, Lse;->b(Ljava/lang/String;Lpx;I)V

    .line 214
    .line 215
    .line 216
    return-object v3

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
