.class public abstract Ljk;
.super Ly9;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field private final e:Lpk;

.field private transient f:Lik;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lik;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lik;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lik;->e()Lpk;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, p1, v0}, Ljk;-><init>(Lik;Lpk;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lik;Lpk;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Ly9;-><init>(Lik;)V

    .line 14
    iput-object p2, p0, Ljk;->e:Lpk;

    return-void
.end method


# virtual methods
.method public e()Lpk;
    .locals 0

    .line 1
    iget-object p0, p0, Ljk;->e:Lpk;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public n()V
    .locals 3

    .line 1
    iget-object v0, p0, Ljk;->f:Lik;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljk;->e()Lpk;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Ln2;->w:Ln2;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Lpk;->l(Lok;)Lnk;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v1, Lrk;

    .line 21
    .line 22
    check-cast v0, Leo;

    .line 23
    .line 24
    invoke-virtual {v0}, Leo;->m()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Leo;->o()Lwc;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lwc;->p()V

    .line 34
    .line 35
    .line 36
    :cond_0
    sget-object v0, Lqg;->e:Lqg;

    .line 37
    .line 38
    iput-object v0, p0, Ljk;->f:Lik;

    .line 39
    .line 40
    return-void
.end method

.method public final o()Lik;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lik;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ljk;->f:Lik;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ljk;->e()Lpk;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ln2;->w:Ln2;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lpk;->l(Lok;)Lnk;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lrk;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v1, Leo;

    .line 20
    .line 21
    invoke-direct {v1, v0, p0}, Leo;-><init>(Lrk;Ljk;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, p0

    .line 26
    :goto_0
    iput-object v1, p0, Ljk;->f:Lik;

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_1
    return-object v0
.end method
