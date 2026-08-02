.class public final Ly60;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lrd0;


# virtual methods
.method public final a(Lsd0;)V
    .locals 2

    .line 1
    iget-object p0, p1, Lsd0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsx1;

    .line 4
    .line 5
    invoke-virtual {p0}, Lsx1;->b()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const-string v0, ""

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p1, v0, v1, p0}, Lsd0;->i(Ljava/lang/String;II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Ly60;

    .line 2
    .line 3
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const-class p0, Ly60;

    .line 2
    .line 3
    invoke-static {p0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lbt;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "DeleteAllCommand()"

    .line 2
    .line 3
    return-object p0
.end method
