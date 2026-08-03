.class public final synthetic Lwb/qu;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lwb/lv;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Landroid/app/Activity;

.field public final synthetic m:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lwb/lv;Ljava/lang/String;Ljava/util/List;Landroid/app/Activity;Lfg/l;I)V
    .locals 0

    .line 1
    iput p7, p0, Lwb/qu;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/qu;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/qu;->i:Lwb/lv;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/qu;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/qu;->k:Ljava/util/List;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/qu;->l:Landroid/app/Activity;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/qu;->m:Lfg/l;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/qu;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v4, p1

    .line 7
    check-cast v4, Lfg/a;

    .line 8
    .line 9
    check-cast p2, Li0/h0;

    .line 10
    .line 11
    check-cast p3, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    and-int/lit8 p3, p1, 0x6

    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    invoke-virtual {p2, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    const/4 p3, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p3, 0x2

    .line 33
    :goto_0
    or-int/2addr p1, p3

    .line 34
    :cond_1
    and-int/lit8 p3, p1, 0x13

    .line 35
    .line 36
    const/16 v0, 0x12

    .line 37
    .line 38
    if-eq p3, v0, :cond_2

    .line 39
    .line 40
    const/4 p3, 0x1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const/4 p3, 0x0

    .line 43
    :goto_1
    and-int/lit8 v0, p1, 0x1

    .line 44
    .line 45
    invoke-virtual {p2, v0, p3}, Li0/h0;->S(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    if-eqz p3, :cond_3

    .line 50
    .line 51
    sget-object p3, Lwb/y2;->p:Lwb/y2;

    .line 52
    .line 53
    new-instance v1, Lwb/ou;

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    iget-object v2, p0, Lwb/qu;->j:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v3, p0, Lwb/qu;->k:Ljava/util/List;

    .line 59
    .line 60
    iget-object v5, p0, Lwb/qu;->l:Landroid/app/Activity;

    .line 61
    .line 62
    iget-object v6, p0, Lwb/qu;->m:Lfg/l;

    .line 63
    .line 64
    invoke-direct/range {v1 .. v7}, Lwb/ou;-><init>(Ljava/lang/String;Ljava/util/List;Lfg/a;Landroid/app/Activity;Lfg/l;I)V

    .line 65
    .line 66
    .line 67
    const v0, 0x86f66ed

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    shl-int/lit8 p1, p1, 0x9

    .line 75
    .line 76
    and-int/lit16 p1, p1, 0x1c00

    .line 77
    .line 78
    const v0, 0x36006

    .line 79
    .line 80
    .line 81
    or-int v7, p1, v0

    .line 82
    .line 83
    iget-object v2, p0, Lwb/qu;->h:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v3, p0, Lwb/qu;->i:Lwb/lv;

    .line 86
    .line 87
    move-object v6, p2

    .line 88
    move-object v1, p3

    .line 89
    invoke-virtual/range {v1 .. v7}, Lwb/y2;->J(Ljava/lang/String;Lwb/lv;Lfg/a;Ls0/d;Li0/h0;I)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move-object v6, p2

    .line 94
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 95
    .line 96
    .line 97
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 98
    .line 99
    return-object p1

    .line 100
    :pswitch_0
    move-object v3, p1

    .line 101
    check-cast v3, Lfg/a;

    .line 102
    .line 103
    check-cast p2, Li0/h0;

    .line 104
    .line 105
    check-cast p3, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    and-int/lit8 p3, p1, 0x6

    .line 115
    .line 116
    if-nez p3, :cond_5

    .line 117
    .line 118
    invoke-virtual {p2, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    if-eqz p3, :cond_4

    .line 123
    .line 124
    const/4 p3, 0x4

    .line 125
    goto :goto_3

    .line 126
    :cond_4
    const/4 p3, 0x2

    .line 127
    :goto_3
    or-int/2addr p1, p3

    .line 128
    :cond_5
    and-int/lit8 p3, p1, 0x13

    .line 129
    .line 130
    const/16 v0, 0x12

    .line 131
    .line 132
    if-eq p3, v0, :cond_6

    .line 133
    .line 134
    const/4 p3, 0x1

    .line 135
    goto :goto_4

    .line 136
    :cond_6
    const/4 p3, 0x0

    .line 137
    :goto_4
    and-int/lit8 v0, p1, 0x1

    .line 138
    .line 139
    invoke-virtual {p2, v0, p3}, Li0/h0;->S(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result p3

    .line 143
    if-eqz p3, :cond_7

    .line 144
    .line 145
    sget-object p3, Lwb/y2;->p:Lwb/y2;

    .line 146
    .line 147
    new-instance v0, Lwb/ou;

    .line 148
    .line 149
    const/4 v6, 0x1

    .line 150
    iget-object v1, p0, Lwb/qu;->j:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v2, p0, Lwb/qu;->k:Ljava/util/List;

    .line 153
    .line 154
    iget-object v4, p0, Lwb/qu;->l:Landroid/app/Activity;

    .line 155
    .line 156
    iget-object v5, p0, Lwb/qu;->m:Lfg/l;

    .line 157
    .line 158
    invoke-direct/range {v0 .. v6}, Lwb/ou;-><init>(Ljava/lang/String;Ljava/util/List;Lfg/a;Landroid/app/Activity;Lfg/l;I)V

    .line 159
    .line 160
    .line 161
    const v1, -0x5782bd5

    .line 162
    .line 163
    .line 164
    invoke-static {v1, v0, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    shl-int/lit8 p1, p1, 0x9

    .line 169
    .line 170
    and-int/lit16 p1, p1, 0x1c00

    .line 171
    .line 172
    const v0, 0x36006

    .line 173
    .line 174
    .line 175
    or-int v6, p1, v0

    .line 176
    .line 177
    iget-object v1, p0, Lwb/qu;->h:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v2, p0, Lwb/qu;->i:Lwb/lv;

    .line 180
    .line 181
    move-object v5, p2

    .line 182
    move-object v0, p3

    .line 183
    invoke-virtual/range {v0 .. v6}, Lwb/y2;->J(Ljava/lang/String;Lwb/lv;Lfg/a;Ls0/d;Li0/h0;I)V

    .line 184
    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_7
    move-object v5, p2

    .line 188
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 189
    .line 190
    .line 191
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 192
    .line 193
    return-object p1

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
