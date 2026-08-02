.class public final synthetic Ljt0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Lmn0;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;Landroid/content/Context;Lmn0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ljt0;->h:I

    .line 5
    .line 6
    iput-object p2, p0, Ljt0;->i:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Ljt0;->j:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p4, p0, Ljt0;->k:Lmn0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lo71;

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
    const/4 v2, 0x0

    .line 20
    if-eq p1, v0, :cond_0

    .line 21
    .line 22
    move p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v2

    .line 25
    :goto_0
    and-int/2addr p3, v1

    .line 26
    check-cast p2, Lgo0;

    .line 27
    .line 28
    invoke-virtual {p2, p3, p1}, Lgo0;->O(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_4

    .line 33
    .line 34
    iget p1, p0, Ljt0;->h:I

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    const p1, -0x4beee532

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Lgo0;->W(I)V

    .line 42
    .line 43
    .line 44
    const p1, 0x790b011f

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p2, v2}, Lgo0;->p(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const p1, -0x4bed0ac0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p1}, Lgo0;->W(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, v2}, Lgo0;->p(Z)V

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    :goto_1
    iget-object p3, p0, Ljt0;->j:Landroid/content/Context;

    .line 66
    .line 67
    invoke-virtual {p2, p3}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v1, p0, Ljt0;->k:Lmn0;

    .line 72
    .line 73
    invoke-virtual {p2, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    or-int/2addr v0, v3

    .line 78
    invoke-virtual {p2}, Lgo0;->L()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    sget-object v0, Lnx;->a:Leb;

    .line 85
    .line 86
    if-ne v3, v0, :cond_3

    .line 87
    .line 88
    :cond_2
    new-instance v3, Laf;

    .line 89
    .line 90
    const/16 v0, 0x9

    .line 91
    .line 92
    invoke-direct {v3, v0, p3, v1}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    check-cast v3, Lmn0;

    .line 99
    .line 100
    iget-object p0, p0, Ljt0;->i:Ljava/util/List;

    .line 101
    .line 102
    invoke-static {p1, p0, v3, p2, v2}, Lci0;->n(Ljava/lang/String;Ljava/util/List;Lmn0;Lpx;I)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    invoke-virtual {p2}, Lgo0;->R()V

    .line 107
    .line 108
    .line 109
    :goto_2
    sget-object p0, La83;->a:La83;

    .line 110
    .line 111
    return-object p0
.end method
