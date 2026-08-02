.class public final synthetic Lfk2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lcq1;


# direct methods
.method public synthetic constructor <init>(Lcq1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfk2;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lfk2;->i:Lcq1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lfk2;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object p0, p0, Lfk2;->i:Lcq1;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Lbv;

    .line 15
    .line 16
    check-cast p2, Lpx;

    .line 17
    .line 18
    check-cast p3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 p1, p3, 0x11

    .line 28
    .line 29
    if-eq p1, v2, :cond_0

    .line 30
    .line 31
    move p1, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move p1, v3

    .line 34
    :goto_0
    and-int/2addr p3, v4

    .line 35
    check-cast p2, Lgo0;

    .line 36
    .line 37
    invoke-virtual {p2, p3, p1}, Lgo0;->O(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    iget-boolean p1, p0, Lcq1;->f:Z

    .line 44
    .line 45
    iget-object p0, p0, Lcq1;->b:Ljava/lang/String;

    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    const p1, 0x2b3c2f77

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, p1}, Lgo0;->W(I)V

    .line 53
    .line 54
    .line 55
    const p1, 0x790b0215

    .line 56
    .line 57
    .line 58
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p1, p0, p2}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p2, v3}, Lgo0;->p(Z)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    const p1, 0x2b3f1796

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, p1}, Lgo0;->W(I)V

    .line 74
    .line 75
    .line 76
    const p1, 0x790b0213

    .line 77
    .line 78
    .line 79
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p1, p0, p2}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p2, v3}, Lgo0;->p(Z)V

    .line 88
    .line 89
    .line 90
    :goto_1
    const/4 p1, 0x0

    .line 91
    const/4 p3, 0x2

    .line 92
    invoke-static {p0, p1, p2, v3, p3}, Lqp0;->e(Ljava/lang/String;Luh1;Lpx;II)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    invoke-virtual {p2}, Lgo0;->R()V

    .line 97
    .line 98
    .line 99
    :goto_2
    return-object v1

    .line 100
    :pswitch_0
    check-cast p1, Lo71;

    .line 101
    .line 102
    check-cast p2, Lpx;

    .line 103
    .line 104
    check-cast p3, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    and-int/lit8 p1, p3, 0x11

    .line 114
    .line 115
    if-eq p1, v2, :cond_3

    .line 116
    .line 117
    move v3, v4

    .line 118
    :cond_3
    and-int/lit8 p1, p3, 0x1

    .line 119
    .line 120
    move-object v7, p2

    .line 121
    check-cast v7, Lgo0;

    .line 122
    .line 123
    invoke-virtual {v7, p1, v3}, Lgo0;->O(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_4

    .line 128
    .line 129
    iget-object v5, p0, Lcq1;->b:Ljava/lang/String;

    .line 130
    .line 131
    const p0, 0x790b0209

    .line 132
    .line 133
    .line 134
    invoke-static {p0, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    const/4 v8, 0x0

    .line 139
    const/4 v9, 0x1

    .line 140
    const/4 v4, 0x0

    .line 141
    invoke-static/range {v4 .. v9}, Lci0;->g(Luh1;Ljava/lang/String;Ljava/lang/String;Lpx;II)V

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    invoke-virtual {v7}, Lgo0;->R()V

    .line 146
    .line 147
    .line 148
    :goto_3
    return-object v1

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
