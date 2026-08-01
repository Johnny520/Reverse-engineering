.class public final Lg90;
.super Lr31;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final i:Lik;


# direct methods
.method public constructor <init>(Lpk;Lww;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Ls;-><init>(Lpk;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p0, p2}, Lrd0;->m(Lik;Lik;Lww;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lg90;->i:Lik;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final Y()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg90;->i:Lik;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Lrd0;->z(Lik;)Lik;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lna1;->a:Lna1;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lpf1;->S(Lik;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    new-instance v1, Lbv0;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lbv0;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ls;->i(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method
