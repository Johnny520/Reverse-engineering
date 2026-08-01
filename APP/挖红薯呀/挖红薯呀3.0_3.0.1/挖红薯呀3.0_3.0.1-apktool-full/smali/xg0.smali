.class public final Lxg0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lg30;


# instance fields
.field public final a:Lf11;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lf11;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/16 v2, 0x10

    .line 8
    .line 9
    sget-object v3, Ltb;->e:Ltb;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3}, Lf11;-><init>(IILtb;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lxg0;->a:Lf11;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Lhu;
    .locals 0

    .line 1
    iget-object p0, p0, Lxg0;->a:Lf11;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Lf30;Lik;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxg0;->a:Lf11;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lf11;->f(Ljava/lang/Object;Lik;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lzk;->d:Lzk;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 13
    .line 14
    return-object p0
.end method

.method public final c(Lf30;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxg0;->a:Lf11;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lf11;->q(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
