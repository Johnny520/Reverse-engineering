.class public final Lip0;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lbw;
.implements Lqa0;


# instance fields
.field public τ:Lep0;


# virtual methods
.method public final Μ(Laq0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Laq0;->γ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lip0;->τ:Lep0;

    .line 5
    .line 6
    iget-object v0, v0, Lep0;->α:Lwa0;

    .line 7
    .line 8
    iget-object v1, p1, Laq0;->ε:Lfe;

    .line 9
    .line 10
    invoke-interface {v1}, Lcw;->α()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    const/16 v3, 0x20

    .line 15
    .line 16
    shr-long v4, v1, v3

    .line 17
    .line 18
    long-to-int v4, v4

    .line 19
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    float-to-int v4, v4

    .line 24
    const-wide v5, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v1, v5

    .line 30
    long-to-int v1, v1

    .line 31
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    float-to-int v1, v1

    .line 36
    int-to-long v7, v4

    .line 37
    shl-long v2, v7, v3

    .line 38
    .line 39
    int-to-long v7, v1

    .line 40
    and-long v4, v7, v5

    .line 41
    .line 42
    or-long v1, v2, v4

    .line 43
    .line 44
    invoke-static {p0}, Lh62;->ц(Lur;)Lyp0;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v3, v3, Lyp0;->Γ:Lyr;

    .line 49
    .line 50
    new-instance v4, Lzv;

    .line 51
    .line 52
    const/4 v5, 0x3

    .line 53
    invoke-direct {v4, v3, p0, p1, v5}, Lzv;-><init>(Lyr;Lq01;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0, v1, v2, v4}, Laq0;->Η(Lwa0;JLa80;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final ξ(Lq31;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lq31;->Х()Lq01;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lq01;->σ:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lip0;->τ:Lep0;

    .line 10
    .line 11
    iget-object p0, p0, Lep0;->γ:Lx91;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final ш()V
    .locals 1

    .line 1
    iget-object p0, p0, Lip0;->τ:Lep0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, Lep0;->γ:Lx91;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
