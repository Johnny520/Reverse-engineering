.class public final synthetic Lbr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lin0;

.field public final synthetic k:Lyk1;

.field public final synthetic l:Lin0;

.field public final synthetic m:I

.field public final synthetic n:Lxk1;


# direct methods
.method public synthetic constructor <init>(ILin0;Lin0;Lxk1;Lyk1;Ljava/lang/Object;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p7, p0, Lbr1;->h:Ljava/util/List;

    .line 5
    .line 6
    iput-object p6, p0, Lbr1;->i:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p2, p0, Lbr1;->j:Lin0;

    .line 9
    .line 10
    iput-object p5, p0, Lbr1;->k:Lyk1;

    .line 11
    .line 12
    iput-object p3, p0, Lbr1;->l:Lin0;

    .line 13
    .line 14
    iput p1, p0, Lbr1;->m:I

    .line 15
    .line 16
    iput-object p4, p0, Lbr1;->n:Lxk1;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Ldd;

    .line 2
    .line 3
    check-cast p2, Lpx;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    and-int/lit8 p1, p3, 0x11

    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-eq p1, v0, :cond_0

    .line 20
    .line 21
    move p1, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    and-int/2addr p3, v1

    .line 25
    move-object v5, p2

    .line 26
    check-cast v5, Lgo0;

    .line 27
    .line 28
    invoke-virtual {v5, p3, p1}, Lgo0;->O(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lbr1;->j:Lin0;

    .line 35
    .line 36
    invoke-virtual {v5, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    iget-object p3, p0, Lbr1;->k:Lyk1;

    .line 41
    .line 42
    invoke-virtual {v5, p3}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    or-int/2addr p2, v0

    .line 47
    invoke-virtual {v5}, Lgo0;->L()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-nez p2, :cond_1

    .line 52
    .line 53
    sget-object p2, Lnx;->a:Leb;

    .line 54
    .line 55
    if-ne v0, p2, :cond_2

    .line 56
    .line 57
    :cond_1
    new-instance v0, Ld2;

    .line 58
    .line 59
    const/16 p2, 0x17

    .line 60
    .line 61
    invoke-direct {v0, p2, p1, p3}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    move-object v2, v0

    .line 68
    check-cast v2, Lin0;

    .line 69
    .line 70
    iget-object p1, p0, Lbr1;->n:Lxk1;

    .line 71
    .line 72
    invoke-interface {p1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    iget p1, p0, Lbr1;->m:I

    .line 83
    .line 84
    shr-int/lit8 p1, p1, 0x6

    .line 85
    .line 86
    and-int/lit8 p1, p1, 0x8

    .line 87
    .line 88
    shl-int/lit8 v6, p1, 0x3

    .line 89
    .line 90
    iget-object v0, p0, Lbr1;->h:Ljava/util/List;

    .line 91
    .line 92
    iget-object v1, p0, Lbr1;->i:Ljava/lang/Object;

    .line 93
    .line 94
    iget-object v3, p0, Lbr1;->l:Lin0;

    .line 95
    .line 96
    invoke-static/range {v0 .. v6}, Leu;->j(Ljava/util/List;Ljava/lang/Object;Lin0;Lin0;ZLpx;I)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {v5}, Lgo0;->R()V

    .line 101
    .line 102
    .line 103
    :goto_1
    sget-object p0, La83;->a:La83;

    .line 104
    .line 105
    return-object p0
.end method
