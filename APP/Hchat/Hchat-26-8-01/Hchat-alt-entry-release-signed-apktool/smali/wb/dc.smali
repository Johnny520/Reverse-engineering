.class public final synthetic Lwb/dc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lfg/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lwb/dc;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/dc;->i:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/dc;->h:Lfg/a;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lfg/a;Landroid/content/Context;I)V
    .locals 0

    .line 12
    iput p3, p0, Lwb/dc;->g:I

    iput-object p1, p0, Lwb/dc;->h:Lfg/a;

    iput-object p2, p0, Lwb/dc;->i:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/dc;->g:I

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
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq p1, v0, :cond_0

    .line 26
    .line 27
    move p1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p1, v1

    .line 30
    :goto_0
    and-int/2addr p3, v2

    .line 31
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p1, p0, Lwb/dc;->i:Landroid/content/Context;

    .line 38
    .line 39
    iget-object p3, p0, Lwb/dc;->h:Lfg/a;

    .line 40
    .line 41
    invoke-static {p1, p3, p2, v1}, Lwb/ho;->V(Landroid/content/Context;Lfg/a;Li0/h0;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 46
    .line 47
    .line 48
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_0
    const/16 v0, 0x10

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    if-eq p1, v0, :cond_2

    .line 55
    .line 56
    move p1, v1

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/4 p1, 0x0

    .line 59
    :goto_2
    and-int/2addr p3, v1

    .line 60
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    new-instance p1, Lwb/ta;

    .line 67
    .line 68
    const/4 p3, 0x2

    .line 69
    iget-object v0, p0, Lwb/dc;->h:Lfg/a;

    .line 70
    .line 71
    iget-object v2, p0, Lwb/dc;->i:Landroid/content/Context;

    .line 72
    .line 73
    invoke-direct {p1, v0, v2, p3}, Lwb/ta;-><init>(Lfg/a;Landroid/content/Context;I)V

    .line 74
    .line 75
    .line 76
    const p3, -0x3cee67f4

    .line 77
    .line 78
    .line 79
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/16 p3, 0x30

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 91
    .line 92
    .line 93
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 94
    .line 95
    return-object p1

    .line 96
    :pswitch_1
    const/16 v0, 0x10

    .line 97
    .line 98
    const/4 v1, 0x1

    .line 99
    if-eq p1, v0, :cond_4

    .line 100
    .line 101
    move p1, v1

    .line 102
    goto :goto_4

    .line 103
    :cond_4
    const/4 p1, 0x0

    .line 104
    :goto_4
    and-int/2addr p3, v1

    .line 105
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    new-instance p1, Lwb/ta;

    .line 112
    .line 113
    const/4 p3, 0x1

    .line 114
    iget-object v0, p0, Lwb/dc;->h:Lfg/a;

    .line 115
    .line 116
    iget-object v2, p0, Lwb/dc;->i:Landroid/content/Context;

    .line 117
    .line 118
    invoke-direct {p1, v0, v2, p3}, Lwb/ta;-><init>(Lfg/a;Landroid/content/Context;I)V

    .line 119
    .line 120
    .line 121
    const p3, -0x102e87aa

    .line 122
    .line 123
    .line 124
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    const/16 p3, 0x30

    .line 129
    .line 130
    const/4 v0, 0x0

    .line 131
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 132
    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 136
    .line 137
    .line 138
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 139
    .line 140
    return-object p1

    .line 141
    :pswitch_2
    const/16 v0, 0x10

    .line 142
    .line 143
    const/4 v1, 0x1

    .line 144
    if-eq p1, v0, :cond_6

    .line 145
    .line 146
    move p1, v1

    .line 147
    goto :goto_6

    .line 148
    :cond_6
    const/4 p1, 0x0

    .line 149
    :goto_6
    and-int/2addr p3, v1

    .line 150
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_7

    .line 155
    .line 156
    new-instance p1, Lwb/ta;

    .line 157
    .line 158
    const/4 p3, 0x3

    .line 159
    iget-object v0, p0, Lwb/dc;->h:Lfg/a;

    .line 160
    .line 161
    iget-object v2, p0, Lwb/dc;->i:Landroid/content/Context;

    .line 162
    .line 163
    invoke-direct {p1, v0, v2, p3}, Lwb/ta;-><init>(Lfg/a;Landroid/content/Context;I)V

    .line 164
    .line 165
    .line 166
    const p3, 0x1f77410    # 9.090001E-38f

    .line 167
    .line 168
    .line 169
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    const/16 p3, 0x30

    .line 174
    .line 175
    const/4 v0, 0x0

    .line 176
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 177
    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 181
    .line 182
    .line 183
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 184
    .line 185
    return-object p1

    .line 186
    :pswitch_3
    const/16 v0, 0x10

    .line 187
    .line 188
    const/4 v1, 0x1

    .line 189
    if-eq p1, v0, :cond_8

    .line 190
    .line 191
    move p1, v1

    .line 192
    goto :goto_8

    .line 193
    :cond_8
    const/4 p1, 0x0

    .line 194
    :goto_8
    and-int/2addr p3, v1

    .line 195
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_9

    .line 200
    .line 201
    new-instance p1, Lwb/ta;

    .line 202
    .line 203
    const/4 p3, 0x4

    .line 204
    iget-object v0, p0, Lwb/dc;->h:Lfg/a;

    .line 205
    .line 206
    iget-object v2, p0, Lwb/dc;->i:Landroid/content/Context;

    .line 207
    .line 208
    invoke-direct {p1, v0, v2, p3}, Lwb/ta;-><init>(Lfg/a;Landroid/content/Context;I)V

    .line 209
    .line 210
    .line 211
    const p3, 0x6c5bc3de

    .line 212
    .line 213
    .line 214
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    const/16 p3, 0x30

    .line 219
    .line 220
    const/4 v0, 0x0

    .line 221
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 222
    .line 223
    .line 224
    goto :goto_9

    .line 225
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 226
    .line 227
    .line 228
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 229
    .line 230
    return-object p1

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
