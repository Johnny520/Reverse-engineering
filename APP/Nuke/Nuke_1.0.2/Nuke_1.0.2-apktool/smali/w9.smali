.class public final synthetic Lw9;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lon0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lw9;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lw9;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lw9;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Lw9;->i:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lkw;

    .line 9
    .line 10
    check-cast p1, Lo71;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast p3, Lpx;

    .line 18
    .line 19
    check-cast p4, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    and-int/lit8 p4, p2, 0x6

    .line 26
    .line 27
    if-nez p4, :cond_1

    .line 28
    .line 29
    move-object p4, p3

    .line 30
    check-cast p4, Lgo0;

    .line 31
    .line 32
    invoke-virtual {p4, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    const/4 p4, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p4, 0x2

    .line 41
    :goto_0
    or-int/2addr p2, p4

    .line 42
    :cond_1
    and-int/lit16 p4, p2, 0x83

    .line 43
    .line 44
    const/16 v0, 0x82

    .line 45
    .line 46
    if-eq p4, v0, :cond_2

    .line 47
    .line 48
    const/4 p4, 0x1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 p4, 0x0

    .line 51
    :goto_1
    and-int/lit8 v0, p2, 0x1

    .line 52
    .line 53
    check-cast p3, Lgo0;

    .line 54
    .line 55
    invoke-virtual {p3, v0, p4}, Lgo0;->O(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    if-eqz p4, :cond_3

    .line 60
    .line 61
    and-int/lit8 p2, p2, 0xe

    .line 62
    .line 63
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p0, p1, p3, p2}, Lkw;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-virtual {p3}, Lgo0;->R()V

    .line 72
    .line 73
    .line 74
    :goto_2
    sget-object p0, La83;->a:La83;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_0
    check-cast p0, Lx9;

    .line 78
    .line 79
    check-cast p1, Lmx2;

    .line 80
    .line 81
    check-cast p2, Lim0;

    .line 82
    .line 83
    check-cast p3, Lgm0;

    .line 84
    .line 85
    check-cast p4, Lhm0;

    .line 86
    .line 87
    iget-object v0, p0, Lx9;->e:Lxl0;

    .line 88
    .line 89
    iget p3, p3, Lgm0;->a:I

    .line 90
    .line 91
    iget p4, p4, Lhm0;->a:I

    .line 92
    .line 93
    check-cast v0, Lyl0;

    .line 94
    .line 95
    invoke-virtual {v0, p1, p2, p3, p4}, Lyl0;->b(Lmx2;Lim0;II)Lm63;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    instance-of p2, p1, Lm63;

    .line 100
    .line 101
    if-nez p2, :cond_4

    .line 102
    .line 103
    new-instance p2, Lvu2;

    .line 104
    .line 105
    iget-object p3, p0, Lx9;->j:Lvu2;

    .line 106
    .line 107
    invoke-direct {p2, p1, p3}, Lvu2;-><init>(Lm63;Lvu2;)V

    .line 108
    .line 109
    .line 110
    iput-object p2, p0, Lx9;->j:Lvu2;

    .line 111
    .line 112
    iget-object p0, p2, Lvu2;->c:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    check-cast p0, Landroid/graphics/Typeface;

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    iget-object p0, p1, Lm63;->h:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    check-cast p0, Landroid/graphics/Typeface;

    .line 126
    .line 127
    :goto_3
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
