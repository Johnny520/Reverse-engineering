.class public final Lr30;
.super Ljk;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public g:I

.field public final synthetic h:Lww;

.field public final synthetic i:Lik;


# direct methods
.method public constructor <init>(Lik;Lpk;Lww;Lik;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lr30;->h:Lww;

    .line 2
    .line 3
    iput-object p4, p0, Lr30;->i:Lik;

    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Ljk;-><init>(Lik;Lpk;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lr30;->g:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    iput v1, p0, Lr30;->g:I

    .line 10
    .line 11
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    const-string p0, "This coroutine had already completed"

    .line 16
    .line 17
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    :cond_1
    iput v2, p0, Lr30;->g:I

    .line 23
    .line 24
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lr30;->h:Lww;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v1, p1}, Ls91;->m(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lr30;->i:Lik;

    .line 36
    .line 37
    invoke-interface {p1, v0, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method
