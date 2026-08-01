.class public final Lv52;
.super Ltw1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ε:Ltw1;

.field public final ζ:Z

.field public final η:Z

.field public θ:La80;

.field public final ι:J


# direct methods
.method public constructor <init>(Ltw1;La80;ZZ)V
    .locals 3

    .line 1
    sget-object v0, Lax1;->α:Leu1;

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    sget-object v2, Lyw1;->ι:Lyw1;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, v2}, Ltw1;-><init>(JLyw1;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lv52;->ε:Ltw1;

    .line 11
    .line 12
    iput-boolean p3, p0, Lv52;->ζ:Z

    .line 13
    .line 14
    iput-boolean p4, p0, Lv52;->η:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Ltw1;->ε()La80;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    :cond_0
    sget-object p1, Lax1;->κ:Lsa0;

    .line 25
    .line 26
    iget-object p1, p1, Lf21;->ε:La80;

    .line 27
    .line 28
    :cond_1
    invoke-static {p2, p1, p3}, Lax1;->λ(La80;La80;Z)La80;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lv52;->θ:La80;

    .line 33
    .line 34
    invoke-static {}, Li91;->θ()J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    iput-wide p1, p0, Lv52;->ι:J

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final γ()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ltw1;->γ:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lv52;->η:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lv52;->ε:Ltw1;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ltw1;->γ()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final δ()Lyw1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv52;->χ()Ltw1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ltw1;->δ()Lyw1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final ε()La80;
    .locals 0

    .line 1
    iget-object p0, p0, Lv52;->θ:La80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ζ()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv52;->χ()Ltw1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ltw1;->ζ()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final η()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv52;->χ()Ltw1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ltw1;->η()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final ι()La80;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final λ()V
    .locals 0

    .line 1
    invoke-static {}, Lu81;->τ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final μ()V
    .locals 0

    .line 1
    invoke-static {}, Lu81;->τ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final ν()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv52;->χ()Ltw1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ltw1;->ν()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ξ(Li02;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv52;->χ()Ltw1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ltw1;->ξ(Li02;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final φ(La80;)Ltw1;
    .locals 2

    .line 1
    iget-object v0, p0, Lv52;->θ:La80;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Lax1;->λ(La80;La80;Z)La80;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-boolean v0, p0, Lv52;->ζ:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lv52;->χ()Ltw1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Ltw1;->φ(La80;)Ltw1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0, p1, v1}, Lax1;->η(Ltw1;La80;Z)Ltw1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lv52;->χ()Ltw1;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, p1}, Ltw1;->φ(La80;)Ltw1;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final χ()Ltw1;
    .locals 0

    .line 1
    iget-object p0, p0, Lv52;->ε:Ltw1;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lax1;->κ:Lsa0;

    .line 6
    .line 7
    :cond_0
    return-object p0
.end method
