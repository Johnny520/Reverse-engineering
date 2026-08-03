.class public final synthetic Lwb/rb;
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

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p9, p0, Lwb/rb;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/rb;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/rb;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/rb;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/rb;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/rb;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/rb;->m:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/rb;->n:Li0/a1;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/rb;->o:Li0/a1;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/rb;->g:I

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
    new-instance v2, Lwb/zc;

    .line 37
    .line 38
    const/4 v11, 0x1

    .line 39
    iget-object v3, p0, Lwb/rb;->h:Li0/a1;

    .line 40
    .line 41
    iget-object v4, p0, Lwb/rb;->i:Li0/a1;

    .line 42
    .line 43
    iget-object v5, p0, Lwb/rb;->j:Li0/a1;

    .line 44
    .line 45
    iget-object v6, p0, Lwb/rb;->k:Li0/a1;

    .line 46
    .line 47
    iget-object v7, p0, Lwb/rb;->l:Li0/a1;

    .line 48
    .line 49
    iget-object v8, p0, Lwb/rb;->m:Li0/a1;

    .line 50
    .line 51
    iget-object v9, p0, Lwb/rb;->n:Li0/a1;

    .line 52
    .line 53
    iget-object v10, p0, Lwb/rb;->o:Li0/a1;

    .line 54
    .line 55
    invoke-direct/range {v2 .. v11}, Lwb/zc;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 56
    .line 57
    .line 58
    const p1, 0x792c7bec

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const/16 p3, 0x30

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 73
    .line 74
    .line 75
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_0
    const/16 v0, 0x10

    .line 79
    .line 80
    const/4 v1, 0x1

    .line 81
    if-eq p1, v0, :cond_2

    .line 82
    .line 83
    move p1, v1

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    const/4 p1, 0x0

    .line 86
    :goto_2
    and-int/2addr p3, v1

    .line 87
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    new-instance v2, Lwb/zc;

    .line 94
    .line 95
    const/4 v11, 0x2

    .line 96
    iget-object v3, p0, Lwb/rb;->h:Li0/a1;

    .line 97
    .line 98
    iget-object v4, p0, Lwb/rb;->i:Li0/a1;

    .line 99
    .line 100
    iget-object v5, p0, Lwb/rb;->j:Li0/a1;

    .line 101
    .line 102
    iget-object v6, p0, Lwb/rb;->k:Li0/a1;

    .line 103
    .line 104
    iget-object v7, p0, Lwb/rb;->l:Li0/a1;

    .line 105
    .line 106
    iget-object v8, p0, Lwb/rb;->m:Li0/a1;

    .line 107
    .line 108
    iget-object v9, p0, Lwb/rb;->n:Li0/a1;

    .line 109
    .line 110
    iget-object v10, p0, Lwb/rb;->o:Li0/a1;

    .line 111
    .line 112
    invoke-direct/range {v2 .. v11}, Lwb/zc;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 113
    .line 114
    .line 115
    const p1, -0x4c4c118

    .line 116
    .line 117
    .line 118
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const/16 p3, 0x30

    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 130
    .line 131
    .line 132
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 133
    .line 134
    return-object p1

    .line 135
    :pswitch_1
    const/16 v0, 0x10

    .line 136
    .line 137
    const/4 v1, 0x1

    .line 138
    if-eq p1, v0, :cond_4

    .line 139
    .line 140
    move p1, v1

    .line 141
    goto :goto_4

    .line 142
    :cond_4
    const/4 p1, 0x0

    .line 143
    :goto_4
    and-int/2addr p3, v1

    .line 144
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_5

    .line 149
    .line 150
    new-instance v2, Lwb/zc;

    .line 151
    .line 152
    const/4 v11, 0x0

    .line 153
    iget-object v3, p0, Lwb/rb;->h:Li0/a1;

    .line 154
    .line 155
    iget-object v4, p0, Lwb/rb;->i:Li0/a1;

    .line 156
    .line 157
    iget-object v5, p0, Lwb/rb;->j:Li0/a1;

    .line 158
    .line 159
    iget-object v6, p0, Lwb/rb;->k:Li0/a1;

    .line 160
    .line 161
    iget-object v7, p0, Lwb/rb;->l:Li0/a1;

    .line 162
    .line 163
    iget-object v8, p0, Lwb/rb;->m:Li0/a1;

    .line 164
    .line 165
    iget-object v9, p0, Lwb/rb;->n:Li0/a1;

    .line 166
    .line 167
    iget-object v10, p0, Lwb/rb;->o:Li0/a1;

    .line 168
    .line 169
    invoke-direct/range {v2 .. v11}, Lwb/zc;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 170
    .line 171
    .line 172
    const p1, 0x707672f6

    .line 173
    .line 174
    .line 175
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    const/16 p3, 0x30

    .line 180
    .line 181
    const/4 v0, 0x0

    .line 182
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 187
    .line 188
    .line 189
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 190
    .line 191
    return-object p1

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
