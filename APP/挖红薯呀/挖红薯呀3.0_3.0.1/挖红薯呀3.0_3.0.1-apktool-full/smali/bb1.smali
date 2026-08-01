.class public abstract Lbb1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public a:Lsw;


# virtual methods
.method public abstract a(Luq;)V
.end method

.method public b()Lsw;
    .locals 0

    .line 1
    iget-object p0, p0, Lbb1;->a:Lsw;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbb1;->b()Lsw;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public d(Ls2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbb1;->a:Lsw;

    .line 2
    .line 3
    return-void
.end method
