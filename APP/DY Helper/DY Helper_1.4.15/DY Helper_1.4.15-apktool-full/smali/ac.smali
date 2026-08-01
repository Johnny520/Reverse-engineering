.class final Lac;
.super Lv01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv01;"
    }
.end annotation


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p0, p1, Lac;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lac;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_2

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_2
    sget-object p0, Lx;->ι:Laa;

    .line 17
    .line 18
    invoke-virtual {p0, p0}, Laa;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_3

    .line 23
    .line 24
    return v0

    .line 25
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    const/high16 p0, -0x40800000    # -1.0f

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/16 v0, 0x1f

    .line 8
    .line 9
    mul-int/2addr p0, v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, p0, v0}, Llz1;->α(FII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/2addr v0, p0

    .line 21
    return v0
.end method

.method public final δ()Lq01;
    .locals 1

    .line 1
    new-instance p0, Lbc;

    .line 2
    .line 3
    sget-object v0, Lx;->ι:Laa;

    .line 4
    .line 5
    invoke-direct {p0}, Lq01;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lbc;->τ:Laa;

    .line 9
    .line 10
    return-object p0
.end method

.method public final ε(Lq01;)V
    .locals 0

    .line 1
    check-cast p1, Lbc;

    .line 2
    .line 3
    sget-object p0, Lx;->ι:Laa;

    .line 4
    .line 5
    iput-object p0, p1, Lbc;->τ:Laa;

    .line 6
    .line 7
    return-void
.end method
