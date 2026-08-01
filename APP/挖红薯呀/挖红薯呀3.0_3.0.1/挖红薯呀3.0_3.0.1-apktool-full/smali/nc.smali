.class public final Lnc;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lym;


# instance fields
.field public d:Lbc;

.field public e:Lx1;


# virtual methods
.method public final a(Lsw;)Lx1;
    .locals 3

    .line 1
    new-instance v0, Lx1;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lx1;-><init>(IZ)V

    .line 7
    .line 8
    .line 9
    iput-object p1, v0, Lx1;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, Lnc;->e:Lx1;

    .line 12
    .line 13
    return-object v0
.end method

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lnc;->d:Lbc;

    .line 2
    .line 3
    invoke-interface {p0}, Lbc;->b()Lym;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lym;->b()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final h()F
    .locals 0

    .line 1
    iget-object p0, p0, Lnc;->d:Lbc;

    .line 2
    .line 3
    invoke-interface {p0}, Lbc;->b()Lym;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lym;->h()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
