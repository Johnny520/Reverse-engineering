.class public final Lk;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public h:I

.field public final synthetic i:Lxg0;

.field public final synthetic j:Ljs0;

.field public final synthetic k:Z

.field public final synthetic l:Ln;


# direct methods
.method public constructor <init>(Lxg0;Ljs0;ZLn;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk;->i:Lxg0;

    .line 2
    .line 3
    iput-object p2, p0, Lk;->j:Ljs0;

    .line 4
    .line 5
    iput-boolean p3, p0, Lk;->k:Z

    .line 6
    .line 7
    iput-object p4, p0, Lk;->l:Ln;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lm51;-><init>(ILik;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 6

    .line 1
    new-instance v0, Lk;

    .line 2
    .line 3
    iget-boolean v3, p0, Lk;->k:Z

    .line 4
    .line 5
    iget-object v4, p0, Lk;->l:Ln;

    .line 6
    .line 7
    iget-object v1, p0, Lk;->i:Lxg0;

    .line 8
    .line 9
    iget-object v2, p0, Lk;->j:Ljs0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lk;-><init>(Lxg0;Ljs0;ZLn;Lik;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyk;

    .line 2
    .line 3
    check-cast p2, Lik;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lk;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lk;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lk;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lk;->h:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lk;->j:Ljs0;

    .line 6
    .line 7
    sget-object v4, Lzk;->d:Lzk;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-eq v0, v2, :cond_1

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-wide v5, Lre;->a:J

    .line 34
    .line 35
    iput v2, p0, Lk;->h:I

    .line 36
    .line 37
    invoke-static {v5, v6, p0}, Ls91;->u(JLjk;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v4, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    :goto_0
    iput v1, p0, Lk;->h:I

    .line 45
    .line 46
    iget-object p1, p0, Lk;->i:Lxg0;

    .line 47
    .line 48
    invoke-virtual {p1, v3, p0}, Lxg0;->b(Lf30;Lik;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v4, :cond_4

    .line 53
    .line 54
    :goto_1
    return-object v4

    .line 55
    :cond_4
    :goto_2
    iget-boolean p1, p0, Lk;->k:Z

    .line 56
    .line 57
    iget-object p0, p0, Lk;->l:Ln;

    .line 58
    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iput-object v3, p0, Ln;->H:Ljs0;

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_5
    iput-object v3, p0, Ln;->D:Ljs0;

    .line 65
    .line 66
    :goto_3
    sget-object p0, Lna1;->a:Lna1;

    .line 67
    .line 68
    return-object p0
.end method
