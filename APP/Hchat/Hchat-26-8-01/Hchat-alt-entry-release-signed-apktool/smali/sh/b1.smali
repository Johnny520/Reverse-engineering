.class public final Lsh/b1;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Li0/l2;

.field public final synthetic j:Llg/a;

.field public final synthetic k:Z

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;


# direct methods
.method public constructor <init>(Li0/l2;Llg/a;ZLi0/a1;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsh/b1;->i:Li0/l2;

    .line 2
    .line 3
    iput-object p2, p0, Lsh/b1;->j:Llg/a;

    .line 4
    .line 5
    iput-boolean p3, p0, Lsh/b1;->k:Z

    .line 6
    .line 7
    iput-object p4, p0, Lsh/b1;->l:Li0/a1;

    .line 8
    .line 9
    iput-object p5, p0, Lsh/b1;->m:Li0/a1;

    .line 10
    .line 11
    iput-object p6, p0, Lsh/b1;->n:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0, p7}, Lyf/h;-><init>(Lwf/c;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 8

    .line 1
    new-instance v0, Lsh/b1;

    .line 2
    .line 3
    iget-object v5, p0, Lsh/b1;->m:Li0/a1;

    .line 4
    .line 5
    iget-object v6, p0, Lsh/b1;->n:Li0/a1;

    .line 6
    .line 7
    iget-object v1, p0, Lsh/b1;->i:Li0/l2;

    .line 8
    .line 9
    iget-object v2, p0, Lsh/b1;->j:Llg/a;

    .line 10
    .line 11
    iget-boolean v3, p0, Lsh/b1;->k:Z

    .line 12
    .line 13
    iget-object v4, p0, Lsh/b1;->l:Li0/a1;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lsh/b1;-><init>(Li0/l2;Llg/a;ZLi0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lsh/b1;->h:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ls1/k0;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lsh/b1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lsh/b1;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lsh/b1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 17
    .line 18
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lsh/b1;->j:Llg/a;

    .line 2
    .line 3
    iget v1, v0, Llg/a;->a:F

    .line 4
    .line 5
    iget-object v2, p0, Lsh/b1;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ls1/k0;

    .line 8
    .line 9
    iget v3, p0, Lsh/b1;->g:I

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    if-ne v3, v4, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_0
    iput-object v2, p0, Lsh/b1;->h:Ljava/lang/Object;

    .line 31
    .line 32
    iput v4, p0, Lsh/b1;->g:I

    .line 33
    .line 34
    sget-object p1, Ls1/l;->h:Ls1/l;

    .line 35
    .line 36
    invoke-virtual {v2, p1, p0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object v3, Lxf/a;->g:Lxf/a;

    .line 41
    .line 42
    if-ne p1, v3, :cond_3

    .line 43
    .line 44
    return-object v3

    .line 45
    :cond_3
    :goto_1
    check-cast p1, Ls1/k;

    .line 46
    .line 47
    iget-object v3, p1, Ls1/k;->a:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {v3}, Ltf/m;->B1(Ljava/util/List;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Ls1/t;

    .line 54
    .line 55
    iget p1, p1, Ls1/k;->f:I

    .line 56
    .line 57
    const/4 v5, 0x5

    .line 58
    iget-object v6, p0, Lsh/b1;->l:Li0/a1;

    .line 59
    .line 60
    if-ne p1, v5, :cond_4

    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_4
    const/4 v5, 0x2

    .line 65
    if-ne p1, v5, :cond_5

    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_5
    iget p1, v3, Ls1/t;->i:I

    .line 70
    .line 71
    if-ne p1, v5, :cond_9

    .line 72
    .line 73
    sget-object p1, Lsh/f1;->a:Li/r0;

    .line 74
    .line 75
    iget-object p1, p0, Lsh/b1;->m:Li0/a1;

    .line 76
    .line 77
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    int-to-float p1, p1

    .line 88
    const/high16 v5, 0x40000000    # 2.0f

    .line 89
    .line 90
    div-float/2addr p1, v5

    .line 91
    iget-object v7, p0, Lsh/b1;->n:Li0/a1;

    .line 92
    .line 93
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    int-to-float v7, v7

    .line 104
    mul-float/2addr v5, p1

    .line 105
    sub-float/2addr v7, v5

    .line 106
    const/4 v5, 0x0

    .line 107
    cmpg-float v8, v7, v5

    .line 108
    .line 109
    if-gez v8, :cond_6

    .line 110
    .line 111
    move v7, v5

    .line 112
    :cond_6
    const v5, 0x3f3851ec    # 0.72f

    .line 113
    .line 114
    .line 115
    mul-float/2addr v5, p1

    .line 116
    const/high16 v8, 0x3f000000    # 0.5f

    .line 117
    .line 118
    mul-float/2addr v8, p1

    .line 119
    add-float/2addr v8, v5

    .line 120
    iget-wide v9, v3, Ls1/t;->c:J

    .line 121
    .line 122
    iget-object v3, p0, Lsh/b1;->i:Li0/l2;

    .line 123
    .line 124
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Ljava/lang/Number;

    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    sub-float/2addr v3, v1

    .line 135
    iget v5, v0, Llg/a;->b:F

    .line 136
    .line 137
    sub-float/2addr v5, v1

    .line 138
    div-float/2addr v3, v5

    .line 139
    iget-boolean v5, p0, Lsh/b1;->k:Z

    .line 140
    .line 141
    if-eqz v5, :cond_7

    .line 142
    .line 143
    const/high16 v5, 0x3f800000    # 1.0f

    .line 144
    .line 145
    sub-float v3, v5, v3

    .line 146
    .line 147
    :cond_7
    mul-float/2addr v3, v7

    .line 148
    add-float/2addr v3, p1

    .line 149
    const/16 p1, 0x20

    .line 150
    .line 151
    shr-long/2addr v9, p1

    .line 152
    long-to-int p1, v9

    .line 153
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    sub-float/2addr p1, v3

    .line 158
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    cmpg-float p1, p1, v8

    .line 163
    .line 164
    if-gtz p1, :cond_8

    .line 165
    .line 166
    move p1, v4

    .line 167
    goto :goto_2

    .line 168
    :cond_8
    const/4 p1, 0x0

    .line 169
    :goto_2
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    check-cast v3, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eq v3, p1, :cond_2

    .line 180
    .line 181
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-interface {v6, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :cond_9
    :goto_3
    sget-object p1, Lsh/f1;->a:Li/r0;

    .line 191
    .line 192
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 193
    .line 194
    invoke-interface {v6, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_0
.end method
