.class public final Lm;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ln;


# direct methods
.method public synthetic constructor <init>(Ln;Lik;I)V
    .locals 0

    .line 1
    iput p3, p0, Lm;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lm;->i:Ln;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lm51;-><init>(ILik;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 1

    .line 1
    iget p1, p0, Lm;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Lm;->i:Ln;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lm;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, Lm;-><init>(Ln;Lik;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lm;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, Lm;-><init>(Ln;Lik;I)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lm;->h:I

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
    invoke-virtual {p0, p1, p2}, Lm;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lm;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lm;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lm;->g(Ljava/lang/Object;Lik;)Lik;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lm;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lm;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lm;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, Lm;->i:Ln;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ln;->E:Lgz;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance v0, Lhz;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lhz;-><init>(Lgz;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Ln;->t:Lxg0;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Loe0;->k0()Lyk;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v5, Le;

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    invoke-direct {v5, p1, v0, v3, v6}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v4, v3, v5, v2}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 39
    .line 40
    .line 41
    :cond_0
    iput-object v3, p0, Ln;->E:Lgz;

    .line 42
    .line 43
    :cond_1
    return-object v1

    .line 44
    :pswitch_0
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Ln;->E:Lgz;

    .line 48
    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    new-instance p1, Lgz;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Ln;->t:Lxg0;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0}, Loe0;->k0()Lyk;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    new-instance v5, Le;

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-direct {v5, v0, p1, v3, v6}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v4, v3, v5, v2}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 71
    .line 72
    .line 73
    :cond_2
    iput-object p1, p0, Ln;->E:Lgz;

    .line 74
    .line 75
    :cond_3
    return-object v1

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
