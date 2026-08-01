.class public final Lp31;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lik;
.implements Lal;


# instance fields
.field public final d:Lik;

.field public final e:Lpk;


# direct methods
.method public constructor <init>(Lik;Lpk;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp31;->d:Lik;

    .line 5
    .line 6
    iput-object p2, p0, Lp31;->e:Lpk;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()Lal;
    .locals 1

    .line 1
    iget-object p0, p0, Lp31;->d:Lik;

    .line 2
    .line 3
    instance-of v0, p0, Lal;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lal;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final e()Lpk;
    .locals 0

    .line 1
    iget-object p0, p0, Lp31;->e:Lpk;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lp31;->d:Lik;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lik;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
