.class public final Lgb;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lhb;

.field public final synthetic j:Lqj0;

.field public final synthetic k:Lm3;

.field public final synthetic l:Lp9;


# direct methods
.method public constructor <init>(Lhb;Lqj0;Lm3;Lp9;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgb;->i:Lhb;

    .line 2
    .line 3
    iput-object p2, p0, Lgb;->j:Lqj0;

    .line 4
    .line 5
    iput-object p3, p0, Lgb;->k:Lm3;

    .line 6
    .line 7
    iput-object p4, p0, Lgb;->l:Lp9;

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
    new-instance v0, Lgb;

    .line 2
    .line 3
    iget-object v3, p0, Lgb;->k:Lm3;

    .line 4
    .line 5
    iget-object v4, p0, Lgb;->l:Lp9;

    .line 6
    .line 7
    iget-object v1, p0, Lgb;->i:Lhb;

    .line 8
    .line 9
    iget-object v2, p0, Lgb;->j:Lqj0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lgb;-><init>(Lhb;Lqj0;Lm3;Lp9;Lik;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lgb;->h:Ljava/lang/Object;

    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Lgb;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lgb;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lgb;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lgb;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Lyk;

    .line 7
    .line 8
    new-instance v0, Li;

    .line 9
    .line 10
    iget-object v3, p0, Lgb;->k:Lm3;

    .line 11
    .line 12
    const/4 v5, 0x2

    .line 13
    iget-object v1, p0, Lgb;->i:Lhb;

    .line 14
    .line 15
    iget-object v2, p0, Lgb;->j:Lqj0;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct/range {v0 .. v5}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-static {p1, v4, v0, v2}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 23
    .line 24
    .line 25
    new-instance v0, Le;

    .line 26
    .line 27
    iget-object p0, p0, Lgb;->l:Lp9;

    .line 28
    .line 29
    const/4 v3, 0x2

    .line 30
    invoke-direct {v0, v1, p0, v4, v3}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v4, v0, v2}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method
