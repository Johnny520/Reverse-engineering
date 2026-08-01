.class public final Lqd;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ltd;

.field public final synthetic l:Liu;


# direct methods
.method public constructor <init>(Ltd;Liu;Lik;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lqd;->h:I

    .line 15
    iput-object p1, p0, Lqd;->k:Ltd;

    iput-object p2, p0, Lqd;->l:Liu;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lm51;-><init>(ILik;)V

    return-void
.end method

.method public constructor <init>(Ltd;Liu;Ljava/lang/Object;Lik;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lqd;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lqd;->k:Ltd;

    .line 5
    .line 6
    iput-object p2, p0, Lqd;->l:Liu;

    .line 7
    .line 8
    iput-object p3, p0, Lqd;->j:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, Lm51;-><init>(ILik;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 3

    .line 1
    iget v0, p0, Lqd;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lqd;->l:Liu;

    .line 4
    .line 5
    iget-object v2, p0, Lqd;->k:Ltd;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, Lqd;

    .line 11
    .line 12
    invoke-direct {p0, v2, v1, p2}, Lqd;-><init>(Ltd;Liu;Lik;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lqd;->j:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance p1, Lqd;

    .line 19
    .line 20
    iget-object p0, p0, Lqd;->j:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-direct {p1, v2, v1, p0, p2}, Lqd;-><init>(Ltd;Liu;Ljava/lang/Object;Lik;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lqd;->h:I

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
    invoke-virtual {p0, p1, p2}, Lqd;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lqd;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lqd;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lqd;->g(Ljava/lang/Object;Lik;)Lik;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lqd;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lqd;->m(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget v0, p0, Lqd;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    sget-object v4, Lzk;->d:Lzk;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lqd;->i:I

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-ne v0, v5, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v3}, Lxc;->o(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object v1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lqd;->j:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v8, p1

    .line 35
    check-cast v8, Lyk;

    .line 36
    .line 37
    new-instance v7, Lzt0;

    .line 38
    .line 39
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v9, p0, Lqd;->k:Ltd;

    .line 43
    .line 44
    iget-object p1, v9, Lod;->g:Lhu;

    .line 45
    .line 46
    new-instance v6, Lsd;

    .line 47
    .line 48
    iget-object v10, p0, Lqd;->l:Liu;

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    invoke-direct/range {v6 .. v11}, Lsd;-><init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    iput v5, p0, Lqd;->i:I

    .line 55
    .line 56
    invoke-interface {p1, v6, p0}, Lhu;->b(Liu;Lik;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-ne p0, v4, :cond_2

    .line 61
    .line 62
    move-object v1, v4

    .line 63
    :cond_2
    :goto_0
    return-object v1

    .line 64
    :pswitch_0
    iget v0, p0, Lqd;->i:I

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    if-ne v0, v5, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-static {v3}, Lxc;->o(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    move-object v1, v2

    .line 78
    goto :goto_1

    .line 79
    :cond_4
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lqd;->k:Ltd;

    .line 83
    .line 84
    iget-object p1, p1, Ltd;->h:Lxw;

    .line 85
    .line 86
    iget-object v0, p0, Lqd;->j:Ljava/lang/Object;

    .line 87
    .line 88
    iput v5, p0, Lqd;->i:I

    .line 89
    .line 90
    iget-object v2, p0, Lqd;->l:Liu;

    .line 91
    .line 92
    invoke-interface {p1, v2, v0, p0}, Lxw;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-ne p0, v4, :cond_5

    .line 97
    .line 98
    move-object v1, v4

    .line 99
    :cond_5
    :goto_1
    return-object v1

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
