.class public final synthetic Lwb/k3;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILfg/l;ZLdb/c;Lfg/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/k3;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lwb/k3;->h:I

    .line 8
    .line 9
    iput-object p2, p0, Lwb/k3;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p3, p0, Lwb/k3;->i:Z

    .line 12
    .line 13
    iput-object p4, p0, Lwb/k3;->k:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/k3;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(ZILqg/t;Li0/f1;Li/c;)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lwb/k3;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwb/k3;->i:Z

    iput p2, p0, Lwb/k3;->h:I

    iput-object p3, p0, Lwb/k3;->j:Ljava/lang/Object;

    iput-object p4, p0, Lwb/k3;->k:Ljava/lang/Object;

    iput-object p5, p0, Lwb/k3;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/k3;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/k3;->j:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v3, v0

    .line 9
    check-cast v3, Lfg/l;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/k3;->k:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v5, v0

    .line 14
    check-cast v5, Ldb/c;

    .line 15
    .line 16
    iget-object v0, p0, Lwb/k3;->l:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v6, v0

    .line 19
    check-cast v6, Lfg/a;

    .line 20
    .line 21
    check-cast p1, Lr/d;

    .line 22
    .line 23
    check-cast p2, Li0/h0;

    .line 24
    .line 25
    check-cast p3, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    and-int/lit8 p1, p3, 0x11

    .line 35
    .line 36
    const/16 v0, 0x10

    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    if-eq p1, v0, :cond_0

    .line 40
    .line 41
    move p1, v7

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    :goto_0
    and-int/2addr p3, v7

    .line 45
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    new-instance v1, Lbi/j;

    .line 52
    .line 53
    iget v2, p0, Lwb/k3;->h:I

    .line 54
    .line 55
    iget-boolean v4, p0, Lwb/k3;->i:Z

    .line 56
    .line 57
    invoke-direct/range {v1 .. v6}, Lbi/j;-><init>(ILfg/l;ZLdb/c;Lfg/a;)V

    .line 58
    .line 59
    .line 60
    const p1, -0x2b1827bc

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const/16 p3, 0x30

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    invoke-static {v0, p1, p2, p3, v7}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 75
    .line 76
    .line 77
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 78
    .line 79
    return-object p1

    .line 80
    :pswitch_0
    iget-object v0, p0, Lwb/k3;->j:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lqg/t;

    .line 83
    .line 84
    iget-object v1, p0, Lwb/k3;->k:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Li0/f1;

    .line 87
    .line 88
    iget-object v2, p0, Lwb/k3;->l:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Li/c;

    .line 91
    .line 92
    check-cast p1, Lxb/i;

    .line 93
    .line 94
    check-cast p2, Lu2/l;

    .line 95
    .line 96
    check-cast p3, Le1/b;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    const/4 v3, 0x0

    .line 106
    cmpl-float p2, p2, v3

    .line 107
    .line 108
    if-lez p2, :cond_5

    .line 109
    .line 110
    invoke-virtual {p1}, Lxb/i;->b()F

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    iget-wide v4, p3, Le1/b;->a:J

    .line 115
    .line 116
    const/16 v6, 0x20

    .line 117
    .line 118
    shr-long/2addr v4, v6

    .line 119
    long-to-int v4, v4

    .line 120
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    div-float/2addr v4, v1

    .line 129
    iget-boolean v1, p0, Lwb/k3;->i:Z

    .line 130
    .line 131
    if-eqz v1, :cond_2

    .line 132
    .line 133
    const/high16 v1, 0x3f800000    # 1.0f

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_2
    const/high16 v1, -0x40800000    # -1.0f

    .line 137
    .line 138
    :goto_2
    mul-float/2addr v4, v1

    .line 139
    add-float/2addr v4, p2

    .line 140
    iget p2, p0, Lwb/k3;->h:I

    .line 141
    .line 142
    add-int/lit8 p2, p2, -0x1

    .line 143
    .line 144
    int-to-float p2, p2

    .line 145
    cmpg-float v1, v4, v3

    .line 146
    .line 147
    if-gez v1, :cond_3

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_3
    move v3, v4

    .line 151
    :goto_3
    cmpl-float v1, v3, p2

    .line 152
    .line 153
    if-lez v1, :cond_4

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_4
    move p2, v3

    .line 157
    :goto_4
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    iget-object v1, p1, Lxb/i;->b:Llg/a;

    .line 162
    .line 163
    invoke-static {p2, v1}, Lr9/e0;->t(Ljava/lang/Float;Llg/a;)Ljava/lang/Comparable;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    check-cast p2, Ljava/lang/Number;

    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    iget-object v1, p1, Lxb/i;->a:Lqg/t;

    .line 174
    .line 175
    new-instance v3, Lxb/h;

    .line 176
    .line 177
    const/4 v4, 0x0

    .line 178
    invoke-direct {v3, p1, p2, v4}, Lxb/h;-><init>(Lxb/i;FLwf/c;)V

    .line 179
    .line 180
    .line 181
    const/4 p1, 0x3

    .line 182
    invoke-static {v1, v4, v3, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 183
    .line 184
    .line 185
    new-instance p2, Lci/j;

    .line 186
    .line 187
    const/16 v1, 0x14

    .line 188
    .line 189
    invoke-direct {p2, v2, p3, v4, v1}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 190
    .line 191
    .line 192
    invoke-static {v0, v4, p2, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 193
    .line 194
    .line 195
    :cond_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 196
    .line 197
    return-object p1

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
