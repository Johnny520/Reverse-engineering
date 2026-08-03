.class public final synthetic Leb/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Leb/u;->g:I

    .line 2
    .line 3
    iput-wide p1, p0, Leb/u;->h:J

    .line 4
    .line 5
    iput-object p3, p0, Leb/u;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Leb/u;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leb/u;->i:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Ly0/o;

    .line 10
    .line 11
    check-cast p1, Li0/h0;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    and-int/lit8 v0, p2, 0x3

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    const/4 v7, 0x1

    .line 23
    const/4 v8, 0x0

    .line 24
    if-eq v0, v2, :cond_0

    .line 25
    .line 26
    move v0, v7

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v0, v8

    .line 29
    :goto_0
    and-int/2addr p2, v7

    .line 30
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    iget-wide v4, p0, Leb/u;->h:J

    .line 42
    .line 43
    cmp-long p2, v4, v2

    .line 44
    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    const p2, -0x4a262578

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v4, v5}, Lu2/h;->b(J)F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-static {v4, v5}, Lu2/h;->a(J)F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const/4 v5, 0x0

    .line 62
    const/16 v6, 0xc

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static/range {v1 .. v6}, Lp/h1;->i(Ly0/o;FFFFI)Ly0/o;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    sget-object v0, Ly0/b;->h:Ly0/g;

    .line 70
    .line 71
    invoke-static {v0, v8}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-wide v1, p1, Li0/h0;->T:J

    .line 76
    .line 77
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {p1, p2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    sget-object v3, Lx1/g;->f:Lx1/f;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    sget-object v3, Lx1/f;->b:Lx1/y;

    .line 95
    .line 96
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 97
    .line 98
    .line 99
    iget-boolean v4, p1, Li0/h0;->S:Z

    .line 100
    .line 101
    if-eqz v4, :cond_1

    .line 102
    .line 103
    invoke-virtual {p1, v3}, Li0/h0;->k(Lfg/a;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 108
    .line 109
    .line 110
    :goto_1
    sget-object v3, Lx1/f;->e:Lx1/e;

    .line 111
    .line 112
    invoke-static {v3, p1, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Lx1/f;->d:Lx1/e;

    .line 116
    .line 117
    invoke-static {v0, p1, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sget-object v1, Lx1/f;->f:Lx1/e;

    .line 125
    .line 126
    invoke-static {v1, p1, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    sget-object v0, Lx1/f;->g:Lx1/d;

    .line 130
    .line 131
    invoke-static {v0, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 132
    .line 133
    .line 134
    sget-object v0, Lx1/f;->c:Lx1/e;

    .line 135
    .line 136
    invoke-static {v0, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    const/4 p2, 0x0

    .line 140
    invoke-static {p2, p1, v8, v7}, Lw/b;->b(Ly0/o;Li0/h0;II)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v7}, Li0/h0;->p(Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v8}, Li0/h0;->p(Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_2
    const p2, -0x4a2083ba

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 154
    .line 155
    .line 156
    invoke-static {v1, p1, v8, v8}, Lw/b;->b(Ly0/o;Li0/h0;II)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v8}, Li0/h0;->p(Z)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_3
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 164
    .line 165
    .line 166
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 167
    .line 168
    return-object p1

    .line 169
    :pswitch_0
    iget-object v0, p0, Leb/u;->i:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, Lgg/q;

    .line 172
    .line 173
    check-cast p1, Ljava/lang/String;

    .line 174
    .line 175
    check-cast p2, Ljava/lang/Long;

    .line 176
    .line 177
    iget-wide v1, p0, Leb/u;->h:J

    .line 178
    .line 179
    invoke-static {v1, v2, v0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->p(JLgg/q;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    return-object p1

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
