.class public final Lhx0;
.super Lμ;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ε:I

.field public final ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lhx0;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lhx0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lhx0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lhx0;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lga1;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lga1;->containsValue(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    instance-of v0, p1, Lfx0;

    .line 20
    .line 21
    :goto_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    check-cast p1, Lfx0;

    .line 26
    .line 27
    invoke-super {p0, p1}, Lμ;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    :goto_1
    return p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget v0, p0, Lhx0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lμ;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 6

    .line 1
    iget v0, p0, Lhx0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lna1;

    .line 7
    .line 8
    iget-object p0, p0, Lhx0;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lga1;

    .line 11
    .line 12
    iget-object p0, p0, Lga1;->ε:Lz52;

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    new-array v2, v1, [La62;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ge v3, v1, :cond_0

    .line 20
    .line 21
    new-instance v4, Lb62;

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    invoke-direct {v4, v5}, Lb62;-><init>(I)V

    .line 25
    .line 26
    .line 27
    aput-object v4, v2, v3

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-direct {v0, p0, v2}, Lha1;-><init>(Lz52;[La62;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    invoke-static {p0}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Lf7;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {v1, v2, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lθ;

    .line 47
    .line 48
    const/16 v2, 0x19

    .line 49
    .line 50
    invoke-direct {v0, v2, p0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance p0, Lt52;

    .line 54
    .line 55
    invoke-direct {p0, v1, v0}, Lt52;-><init>(Lss1;La80;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Ls52;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Ls52;-><init>(Lt52;)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final α()I
    .locals 1

    .line 1
    iget v0, p0, Lhx0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lhx0;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lga1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget p0, p0, Lga1;->ζ:I

    .line 14
    .line 15
    return p0

    .line 16
    :pswitch_0
    iget-object p0, p0, Lhx0;->ζ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lix0;

    .line 19
    .line 20
    iget-object p0, p0, Lix0;->α:Ljava/util/regex/Matcher;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->groupCount()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/lit8 p0, p0, 0x1

    .line 27
    .line 28
    return p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public β(I)Lfx0;
    .locals 2

    .line 1
    iget-object p0, p0, Lhx0;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lix0;

    .line 4
    .line 5
    iget-object p0, p0, Lix0;->α:Ljava/util/regex/Matcher;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->start(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->end(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Lj81;->Σ(II)Lxm0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v1, v0, Lvm0;->ε:I

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Lfx0;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, p0, v0}, Lfx0;-><init>(Ljava/lang/String;Lxm0;)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method
