.class public final Lcf1;
.super Lk2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcf1;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lcf1;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcf1;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Lcf1;->i:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lzy1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget p0, p0, Lzy1;->i:I

    .line 14
    .line 15
    return p0

    .line 16
    :pswitch_0
    check-cast p0, Lkj1;

    .line 17
    .line 18
    iget-object p0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/util/regex/Matcher;

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

.method public b(I)Laf1;
    .locals 2

    .line 1
    iget-object p0, p0, Lcf1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkj1;

    .line 4
    .line 5
    iget-object p0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/regex/Matcher;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->start(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->end(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v0, v1}, Lci0;->X(II)Lc11;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget v1, v0, La11;->h:I

    .line 22
    .line 23
    if-ltz v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Laf1;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, p0, v0}, Laf1;-><init>(Ljava/lang/String;Lc11;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lcf1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcf1;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lzy1;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lzy1;->containsValue(Ljava/lang/Object;)Z

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
    instance-of v0, p1, Laf1;

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
    check-cast p1, Laf1;

    .line 26
    .line 27
    invoke-super {p0, p1}, Lk2;->contains(Ljava/lang/Object;)Z

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
    iget v0, p0, Lcf1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lk2;->isEmpty()Z

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
    iget v0, p0, Lcf1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Liz1;

    .line 7
    .line 8
    iget-object p0, p0, Lcf1;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lzy1;

    .line 11
    .line 12
    iget-object p0, p0, Lzy1;->h:Lh43;

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    new-array v2, v1, [Li43;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ge v3, v1, :cond_0

    .line 20
    .line 21
    new-instance v4, Lj43;

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    invoke-direct {v4, v5}, Lj43;-><init>(I)V

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
    invoke-direct {v0, p0, v2}, Laz1;-><init>(Lh43;[Li43;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    new-instance v0, Lc11;

    .line 37
    .line 38
    invoke-virtual {p0}, Lk2;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x1

    .line 43
    sub-int/2addr v1, v2

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v0, v3, v1, v2}, La11;-><init>(III)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lng;

    .line 49
    .line 50
    invoke-direct {v1, v2, v0}, Lng;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lv;

    .line 54
    .line 55
    const/16 v2, 0x10

    .line 56
    .line 57
    invoke-direct {v0, v2, p0}, Lv;-><init>(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p0, Lbj0;

    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    invoke-direct {p0, v1, v0, v2}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Lr33;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lr33;-><init>(Lbj0;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
