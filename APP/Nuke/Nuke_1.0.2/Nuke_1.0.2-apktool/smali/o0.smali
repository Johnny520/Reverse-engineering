.class public final synthetic Lo0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lkw;


# direct methods
.method public synthetic constructor <init>(Lkw;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    iput v0, p0, Lo0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lo0;->i:Lkw;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lkw;II)V
    .locals 0

    .line 10
    iput p3, p0, Lo0;->h:I

    iput-object p1, p0, Lo0;->i:Lkw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lo0;->h:I

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    sget-object v2, La83;->a:La83;

    .line 5
    .line 6
    iget-object p0, p0, Lo0;->i:Lkw;

    .line 7
    .line 8
    check-cast p1, Lpx;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lpp0;->N(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {p0, p1, p2}, Lse;->k(Lkw;Lpx;I)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    and-int/lit8 v0, p2, 0x3

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eq v0, v1, :cond_0

    .line 36
    .line 37
    move v0, v4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v0, v3

    .line 40
    :goto_0
    and-int/2addr p2, v4

    .line 41
    check-cast p1, Lgo0;

    .line 42
    .line 43
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p0, p1, p2}, Lkw;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {p1}, Lgo0;->R()V

    .line 58
    .line 59
    .line 60
    :goto_1
    return-object v2

    .line 61
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v1}, Lpp0;->N(I)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    invoke-static {p0, p1, p2}, Lop0;->b(Lkw;Lpx;I)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {v1}, Lpp0;->N(I)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    invoke-static {p0, p1, p2}, Lci0;->p(Lkw;Lpx;I)V

    .line 80
    .line 81
    .line 82
    return-object v2

    .line 83
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const/16 p2, 0x31

    .line 87
    .line 88
    invoke-static {p2}, Lpp0;->N(I)I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    invoke-static {p0, p1, p2}, Lpp0;->d(Lkw;Lpx;I)V

    .line 93
    .line 94
    .line 95
    return-object v2

    .line 96
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {v1}, Lpp0;->N(I)I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    invoke-static {p0, p1, p2}, Lt11;->h(Lkw;Lpx;I)V

    .line 104
    .line 105
    .line 106
    return-object v2

    .line 107
    :pswitch_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-static {v1}, Lpp0;->N(I)I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    invoke-static {p0, p1, p2}, Ls11;->d(Lkw;Lpx;I)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :pswitch_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Lpp0;->N(I)I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    invoke-static {p0, p1, p2}, Lse;->e(Lkw;Lpx;I)V

    .line 126
    .line 127
    .line 128
    return-object v2

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
