.class public Lmd0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public a(Landroid/view/Window;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(Llx2;Llx2;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-static {p3, p0}, Lrd3;->a(Landroid/view/Window;Z)V

    .line 15
    .line 16
    .line 17
    if-eqz p5, :cond_0

    .line 18
    .line 19
    iget p1, p1, Llx2;->b:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget p1, p1, Llx2;->a:I

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p3, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 25
    .line 26
    .line 27
    if-eqz p6, :cond_1

    .line 28
    .line 29
    iget p1, p2, Llx2;->b:I

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget p1, p2, Llx2;->a:I

    .line 33
    .line 34
    :goto_1
    invoke-virtual {p3, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lhh1;

    .line 38
    .line 39
    invoke-direct {p1, p4}, Lhh1;-><init>(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 43
    .line 44
    const/16 p4, 0x23

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    if-lt p2, p4, :cond_2

    .line 48
    .line 49
    new-instance p0, Lef3;

    .line 50
    .line 51
    invoke-direct {p0, p3, p1, v0}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 p4, 0x1e

    .line 56
    .line 57
    if-lt p2, p4, :cond_3

    .line 58
    .line 59
    new-instance p0, Ldf3;

    .line 60
    .line 61
    invoke-direct {p0, p3, p1, v0}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    new-instance p2, Ldf3;

    .line 66
    .line 67
    invoke-direct {p2, p3, p1, p0}, Ldf3;-><init>(Landroid/view/Window;Lhh1;I)V

    .line 68
    .line 69
    .line 70
    move-object p0, p2

    .line 71
    :goto_2
    xor-int/lit8 p1, p5, 0x1

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Ldf3;->c(Z)V

    .line 74
    .line 75
    .line 76
    xor-int/lit8 p1, p6, 0x1

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ldf3;->b(Z)V

    .line 79
    .line 80
    .line 81
    return-void
.end method
