.class public final La7;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic h:Lb7;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb7;Ljava/lang/Object;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, La7;->h:Lb7;

    .line 2
    .line 3
    iput-object p2, p0, La7;->i:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Lm51;-><init>(ILik;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(Lik;)Lik;
    .locals 2

    .line 1
    new-instance v0, La7;

    .line 2
    .line 3
    iget-object v1, p0, La7;->h:Lb7;

    .line 4
    .line 5
    iget-object p0, p0, La7;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, La7;-><init>(Lb7;Ljava/lang/Object;Lik;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lik;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La7;->c(Lik;)Lik;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La7;

    .line 8
    .line 9
    sget-object p1, Lna1;->a:Lna1;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La7;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La7;->h:Lb7;

    .line 5
    .line 6
    invoke-static {p1}, Lb7;->b(Lb7;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La7;->i:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {p1, p0}, Lb7;->a(Lb7;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p1, Lb7;->c:Lw7;

    .line 16
    .line 17
    iget-object v0, v0, Lw7;->e:Lgp0;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p1, Lb7;->e:Lgp0;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lna1;->a:Lna1;

    .line 28
    .line 29
    return-object p0
.end method
