.class public final Llu2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:F

.field public n:I

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Los;FLhd;Lt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Llu2;->l:I

    .line 3
    .line 4
    iput-object p1, p0, Llu2;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Llu2;->m:F

    .line 7
    .line 8
    iput-object p3, p0, Llu2;->p:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, Ltw2;-><init>(ILt00;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Ly33;Lt00;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Llu2;->l:I

    .line 15
    iput-object p1, p0, Llu2;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ltw2;-><init>(ILt00;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Llu2;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    check-cast p1, Lj20;

    .line 6
    .line 7
    check-cast p2, Lt00;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Llu2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Llu2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Llu2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Llu2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Llu2;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Llu2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 2

    .line 1
    iget v0, p0, Llu2;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Llu2;->p:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Llu2;

    .line 9
    .line 10
    check-cast v1, Ly33;

    .line 11
    .line 12
    invoke-direct {p0, v1, p1}, Llu2;-><init>(Ly33;Lt00;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Llu2;->o:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance p2, Llu2;

    .line 19
    .line 20
    iget-object v0, p0, Llu2;->o:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Los;

    .line 23
    .line 24
    iget p0, p0, Llu2;->m:F

    .line 25
    .line 26
    check-cast v1, Lhd;

    .line 27
    .line 28
    invoke-direct {p2, v0, p0, v1, p1}, Llu2;-><init>(Los;FLhd;Lt00;)V

    .line 29
    .line 30
    .line 31
    return-object p2

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Llu2;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Llu2;->p:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v5, Lk20;->h:Lk20;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget v0, p0, Llu2;->n:I

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v6, :cond_0

    .line 21
    .line 22
    iget v0, p0, Llu2;->m:F

    .line 23
    .line 24
    iget-object v3, p0, Llu2;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lj20;

    .line 27
    .line 28
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v1, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Llu2;->o:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lj20;

    .line 43
    .line 44
    invoke-interface {p1}, Lj20;->g()La20;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lte;->F(La20;)F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    move-object v3, p1

    .line 53
    :cond_2
    :goto_0
    invoke-static {v3}, Lte;->Q(Lj20;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    move-object p1, v2

    .line 60
    check-cast p1, Ly33;

    .line 61
    .line 62
    new-instance v4, Lx33;

    .line 63
    .line 64
    invoke-direct {v4, p1, v0}, Lx33;-><init>(Ly33;F)V

    .line 65
    .line 66
    .line 67
    iput-object v3, p0, Llu2;->o:Ljava/lang/Object;

    .line 68
    .line 69
    iput v0, p0, Llu2;->m:F

    .line 70
    .line 71
    iput v6, p0, Llu2;->n:I

    .line 72
    .line 73
    iget-object p1, p0, Lu00;->i:La20;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, Lqp0;->A(La20;)Lxb;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1, v4, p0}, Lxb;->a(Lin0;Lt00;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v5, :cond_2

    .line 87
    .line 88
    move-object v1, v5

    .line 89
    :cond_3
    :goto_1
    return-object v1

    .line 90
    :pswitch_0
    iget v0, p0, Llu2;->n:I

    .line 91
    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    if-ne v0, v6, :cond_4

    .line 95
    .line 96
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    invoke-static {v4}, Ls;->l(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    move-object v1, v3

    .line 104
    goto :goto_2

    .line 105
    :cond_5
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Llu2;->o:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p1, Los;

    .line 111
    .line 112
    iget-object p1, p1, Los;->c:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v7, p1

    .line 115
    check-cast v7, Lsc;

    .line 116
    .line 117
    iget p1, p0, Llu2;->m:F

    .line 118
    .line 119
    new-instance v8, Ljava/lang/Float;

    .line 120
    .line 121
    invoke-direct {v8, p1}, Ljava/lang/Float;-><init>(F)V

    .line 122
    .line 123
    .line 124
    move-object v9, v2

    .line 125
    check-cast v9, Lhd;

    .line 126
    .line 127
    iput v6, p0, Llu2;->n:I

    .line 128
    .line 129
    const/4 v10, 0x0

    .line 130
    const/16 v12, 0xc

    .line 131
    .line 132
    move-object v11, p0

    .line 133
    invoke-static/range {v7 .. v12}, Lsc;->c(Lsc;Ljava/lang/Object;Lhd;Lin0;Lu00;I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    if-ne p0, v5, :cond_6

    .line 138
    .line 139
    move-object v1, v5

    .line 140
    :cond_6
    :goto_2
    return-object v1

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
