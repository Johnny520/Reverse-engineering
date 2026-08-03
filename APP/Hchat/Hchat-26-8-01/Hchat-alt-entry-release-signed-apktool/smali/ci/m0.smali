.class public final Lci/m0;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public synthetic j:F

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lci/n0;FLwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lci/m0;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lci/m0;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lci/m0;->j:F

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Le2/c;Lwf/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lci/m0;->h:I

    .line 13
    iput-object p1, p0, Lci/m0;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 2

    .line 1
    iget v0, p0, Lci/m0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lci/m0;

    .line 7
    .line 8
    iget-object v1, p0, Lci/m0;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Le2/c;

    .line 11
    .line 12
    invoke-direct {v0, v1, p2}, Lci/m0;-><init>(Le2/c;Lwf/c;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, v0, Lci/m0;->j:F

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    new-instance p1, Lci/m0;

    .line 25
    .line 26
    iget-object v0, p0, Lci/m0;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lci/n0;

    .line 29
    .line 30
    iget v1, p0, Lci/m0;->j:F

    .line 31
    .line 32
    invoke-direct {p1, v0, v1, p2}, Lci/m0;-><init>(Lci/n0;FLwf/c;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lci/m0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    check-cast p2, Lwf/c;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1, p2}, Lci/m0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lci/m0;

    .line 23
    .line 24
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lci/m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :pswitch_0
    check-cast p1, Lqg/t;

    .line 32
    .line 33
    check-cast p2, Lwf/c;

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lci/m0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lci/m0;

    .line 40
    .line 41
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lci/m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lci/m0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lci/m0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Le2/c;

    .line 9
    .line 10
    iget v1, p0, Lci/m0;->i:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    const-wide v3, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, Lci/m0;->j:F

    .line 37
    .line 38
    iget-object v1, v0, Le2/c;->a:Lf2/q;

    .line 39
    .line 40
    iget-object v1, v1, Lf2/q;->d:Lf2/m;

    .line 41
    .line 42
    sget-object v5, Lf2/l;->e:Lf2/x;

    .line 43
    .line 44
    iget-object v1, v1, Lf2/m;->g:Lf/k0;

    .line 45
    .line 46
    invoke-virtual {v1, v5}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    :cond_2
    check-cast v1, Lfg/p;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    iget-object v0, v0, Le2/c;->a:Lf2/q;

    .line 58
    .line 59
    iget-object v0, v0, Lf2/q;->d:Lf2/m;

    .line 60
    .line 61
    sget-object v5, Lf2/u;->v:Lf2/x;

    .line 62
    .line 63
    invoke-virtual {v0, v5}, Lf2/m;->d(Lf2/x;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lf2/j;

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    int-to-long v5, v0

    .line 75
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    int-to-long v7, p1

    .line 80
    const/16 p1, 0x20

    .line 81
    .line 82
    shl-long/2addr v5, p1

    .line 83
    and-long/2addr v7, v3

    .line 84
    or-long/2addr v5, v7

    .line 85
    new-instance p1, Le1/b;

    .line 86
    .line 87
    invoke-direct {p1, v5, v6}, Le1/b;-><init>(J)V

    .line 88
    .line 89
    .line 90
    iput v2, p0, Lci/m0;->i:I

    .line 91
    .line 92
    invoke-interface {v1, p1, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 97
    .line 98
    if-ne p1, v0, :cond_3

    .line 99
    .line 100
    :goto_0
    move-object p1, v0

    .line 101
    goto :goto_2

    .line 102
    :cond_3
    :goto_1
    check-cast p1, Le1/b;

    .line 103
    .line 104
    iget-wide v0, p1, Le1/b;->a:J

    .line 105
    .line 106
    and-long/2addr v0, v3

    .line 107
    long-to-int p1, v0

    .line 108
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    new-instance v0, Ljava/lang/Float;

    .line 113
    .line 114
    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :goto_2
    return-object p1

    .line 119
    :cond_4
    const-string p1, "Required value was null."

    .line 120
    .line 121
    invoke-static {p1}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    throw p1

    .line 126
    :pswitch_0
    iget-object v0, p0, Lci/m0;->k:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Lci/n0;

    .line 129
    .line 130
    iget v1, p0, Lci/m0;->i:I

    .line 131
    .line 132
    const/4 v2, 0x1

    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    if-ne v1, v2, :cond_5

    .line 136
    .line 137
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 142
    .line 143
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const/4 p1, 0x0

    .line 147
    goto :goto_4

    .line 148
    :cond_6
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    move-object p1, v0

    .line 152
    iget-object v0, p1, Lci/n0;->w:Li/c;

    .line 153
    .line 154
    iget v1, p0, Lci/m0;->j:F

    .line 155
    .line 156
    move v3, v1

    .line 157
    new-instance v1, Ljava/lang/Float;

    .line 158
    .line 159
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p1, Lci/n0;->v:Li/r0;

    .line 163
    .line 164
    iput v2, p0, Lci/m0;->i:I

    .line 165
    .line 166
    const/4 v3, 0x0

    .line 167
    const/16 v5, 0xc

    .line 168
    .line 169
    move-object v4, p0

    .line 170
    move-object v2, p1

    .line 171
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 176
    .line 177
    if-ne p1, v0, :cond_7

    .line 178
    .line 179
    move-object p1, v0

    .line 180
    goto :goto_4

    .line 181
    :cond_7
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 182
    .line 183
    :goto_4
    return-object p1

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
