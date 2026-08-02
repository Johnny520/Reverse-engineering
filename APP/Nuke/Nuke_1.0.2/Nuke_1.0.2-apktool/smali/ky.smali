.class public final Lky;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lmn0;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbg3;Llx;Lmn0;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lky;->i:I

    .line 3
    .line 4
    iput-object p1, p0, Lky;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lky;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lky;->j:Lmn0;

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lw51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lmn0;II)V
    .locals 0

    .line 14
    iput p5, p0, Lky;->i:I

    iput-object p1, p0, Lky;->k:Ljava/lang/Object;

    iput-object p2, p0, Lky;->l:Ljava/lang/Object;

    iput-object p3, p0, Lky;->j:Lmn0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lky;->i:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Lky;->j:Lmn0;

    .line 6
    .line 7
    iget-object v3, p0, Lky;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lky;->k:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lpx;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    check-cast p0, Lbg3;

    .line 24
    .line 25
    and-int/lit8 v0, p2, 0x3

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    if-eq v0, v5, :cond_0

    .line 30
    .line 31
    move v0, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v6

    .line 34
    :goto_0
    and-int/2addr p2, v4

    .line 35
    check-cast p1, Lgo0;

    .line 36
    .line 37
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_5

    .line 42
    .line 43
    iget-object p2, p0, Lbg3;->h:Lb7;

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    const/4 v7, 0x0

    .line 54
    sget-object v8, Lnx;->a:Leb;

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    if-ne v5, v8, :cond_2

    .line 59
    .line 60
    :cond_1
    new-instance v5, Lag3;

    .line 61
    .line 62
    invoke-direct {v5, p0, v7, v6}, Lag3;-><init>(Lbg3;Lt00;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    check-cast v5, Lmn0;

    .line 69
    .line 70
    invoke-static {p1, v5, p2}, Leu;->f(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    if-nez v0, :cond_3

    .line 82
    .line 83
    if-ne v5, v8, :cond_4

    .line 84
    .line 85
    :cond_3
    new-instance v5, Lag3;

    .line 86
    .line 87
    invoke-direct {v5, p0, v7, v4}, Lag3;-><init>(Lbg3;Lt00;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    check-cast v5, Lmn0;

    .line 94
    .line 95
    invoke-static {p1, v5, p2}, Leu;->f(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    check-cast v3, Llx;

    .line 99
    .line 100
    invoke-virtual {v3, p2, v2, p1, v6}, Llx;->a(Lb7;Lmn0;Lpx;I)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-virtual {p1}, Lgo0;->R()V

    .line 105
    .line 106
    .line 107
    :goto_1
    return-object v1

    .line 108
    :pswitch_0
    check-cast p1, Lpx;

    .line 109
    .line 110
    check-cast p2, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    check-cast p0, Lhw2;

    .line 116
    .line 117
    check-cast v3, Luh1;

    .line 118
    .line 119
    const/16 p2, 0x9

    .line 120
    .line 121
    invoke-static {p2}, Lpp0;->N(I)I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    invoke-static {p0, v3, v2, p1, p2}, Lrp0;->P(Lhw2;Luh1;Lmn0;Lpx;I)V

    .line 126
    .line 127
    .line 128
    return-object v1

    .line 129
    :pswitch_1
    check-cast p1, Lpx;

    .line 130
    .line 131
    check-cast p2, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 134
    .line 135
    .line 136
    check-cast p0, Lzv1;

    .line 137
    .line 138
    check-cast v3, Lz8;

    .line 139
    .line 140
    invoke-static {v4}, Lpp0;->N(I)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    invoke-static {p0, v3, v2, p1, p2}, Lly;->a(Lzv1;Lz8;Lmn0;Lpx;I)V

    .line 145
    .line 146
    .line 147
    return-object v1

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
