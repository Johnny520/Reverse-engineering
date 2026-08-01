.class public final Ldv0;
.super Lf40;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final k:Lg40;


# direct methods
.method public constructor <init>(Lg40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhb0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldv0;->k:Lg40;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final r()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final s(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf40;->q()Lj40;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lj40;->N()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    instance-of v0, p1, Lrg;

    .line 10
    .line 11
    iget-object p0, p0, Ldv0;->k:Lg40;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Lrg;

    .line 16
    .line 17
    iget-object p1, p1, Lrg;->a:Ljava/lang/Throwable;

    .line 18
    .line 19
    invoke-static {p1}, Lw60;->p(Ljava/lang/Throwable;)Lbv0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Lwc;->i(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {p1}, Ls91;->U(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lwc;->i(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
