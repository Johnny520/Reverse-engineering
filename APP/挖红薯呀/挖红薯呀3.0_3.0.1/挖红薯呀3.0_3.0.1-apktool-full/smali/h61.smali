.class public final Lh61;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Lbg;

.field public final synthetic k:Lhs0;

.field public final synthetic l:Lnr0;


# direct methods
.method public synthetic constructor <init>(Lbg;Lhs0;Lnr0;Lik;I)V
    .locals 0

    .line 1
    iput p5, p0, Lh61;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lh61;->j:Lbg;

    .line 4
    .line 5
    iput-object p2, p0, Lh61;->k:Lhs0;

    .line 6
    .line 7
    iput-object p3, p0, Lh61;->l:Lnr0;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Lm51;-><init>(ILik;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 7

    .line 1
    iget p1, p0, Lh61;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lh61;

    .line 7
    .line 8
    iget-object v3, p0, Lh61;->l:Lnr0;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, Lh61;->j:Lbg;

    .line 12
    .line 13
    iget-object v2, p0, Lh61;->k:Lhs0;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, Lh61;-><init>(Lbg;Lhs0;Lnr0;Lik;I)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p2

    .line 21
    new-instance v1, Lh61;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, Lh61;->l:Lnr0;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-object v2, p0, Lh61;->j:Lbg;

    .line 28
    .line 29
    iget-object v3, p0, Lh61;->k:Lhs0;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, Lh61;-><init>(Lbg;Lhs0;Lnr0;Lik;I)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lh61;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    check-cast p1, Lyk;

    .line 6
    .line 7
    check-cast p2, Lik;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lh61;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lh61;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lh61;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh61;->g(Ljava/lang/Object;Lik;)Lik;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lh61;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lh61;->m(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lh61;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lh61;->l:Lnr0;

    .line 4
    .line 5
    iget-object v2, p0, Lh61;->k:Lhs0;

    .line 6
    .line 7
    iget-object v3, p0, Lh61;->j:Lbg;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lzk;->d:Lzk;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    sget-object v8, Lna1;->a:Lna1;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget v0, p0, Lh61;->i:I

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-ne v0, v7, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v5}, Lxc;->o(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-wide v0, v1, Lnr0;->c:J

    .line 38
    .line 39
    iput v7, p0, Lh61;->i:I

    .line 40
    .line 41
    new-instance p1, Lbg;

    .line 42
    .line 43
    iget-object v3, v3, Lbg;->k:Ldg;

    .line 44
    .line 45
    invoke-direct {p1, v3, p0}, Lbg;-><init>(Ldg;Lik;)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p1, Lbg;->i:Lhs0;

    .line 49
    .line 50
    iput-wide v0, p1, Lbg;->j:J

    .line 51
    .line 52
    invoke-virtual {p1, v8}, Lbg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-ne p0, v6, :cond_2

    .line 57
    .line 58
    move-object v4, v6

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    :goto_0
    move-object v4, v8

    .line 61
    :goto_1
    return-object v4

    .line 62
    :pswitch_0
    iget v0, p0, Lh61;->i:I

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    if-ne v0, v7, :cond_3

    .line 67
    .line 68
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {v5}, Lxc;->o(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-wide v0, v1, Lnr0;->c:J

    .line 80
    .line 81
    iput v7, p0, Lh61;->i:I

    .line 82
    .line 83
    new-instance p1, Lbg;

    .line 84
    .line 85
    iget-object v3, v3, Lbg;->k:Ldg;

    .line 86
    .line 87
    invoke-direct {p1, v3, p0}, Lbg;-><init>(Ldg;Lik;)V

    .line 88
    .line 89
    .line 90
    iput-object v2, p1, Lbg;->i:Lhs0;

    .line 91
    .line 92
    iput-wide v0, p1, Lbg;->j:J

    .line 93
    .line 94
    invoke-virtual {p1, v8}, Lbg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    if-ne p0, v6, :cond_5

    .line 99
    .line 100
    move-object v4, v6

    .line 101
    goto :goto_3

    .line 102
    :cond_5
    :goto_2
    move-object v4, v8

    .line 103
    :goto_3
    return-object v4

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
