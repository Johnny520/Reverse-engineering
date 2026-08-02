.class public final synthetic Lup;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 14
    iput p2, p0, Lup;->h:I

    iput-object p3, p0, Lup;->j:Ljava/lang/Object;

    iput-object p4, p0, Lup;->k:Ljava/lang/Object;

    iput p1, p0, Lup;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Luh1;II)V
    .locals 0

    .line 1
    const/4 p3, 0x6

    .line 2
    iput p3, p0, Lup;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lup;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lup;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput p4, p0, Lup;->i:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lup;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget v3, p0, Lup;->i:I

    .line 7
    .line 8
    iget-object v4, p0, Lup;->k:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Lup;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lxm0;

    .line 16
    .line 17
    check-cast v4, Lin0;

    .line 18
    .line 19
    check-cast p1, Lpx;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    or-int/lit8 p2, v3, 0x1

    .line 27
    .line 28
    invoke-static {p2}, Lpp0;->N(I)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-static {p0, v4, p1, p2}, Lfg1;->f(Lxm0;Lin0;Lpx;I)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_0
    check-cast v4, Ljava/lang/String;

    .line 37
    .line 38
    check-cast p0, Luh1;

    .line 39
    .line 40
    check-cast p1, Lpx;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v2}, Lpp0;->N(I)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    invoke-static {v4, p0, p1, p2, v3}, Lqp0;->e(Ljava/lang/String;Luh1;Lpx;II)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_1
    check-cast p0, Ljava/lang/String;

    .line 56
    .line 57
    check-cast v4, Lzt0;

    .line 58
    .line 59
    check-cast p1, Lpx;

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    or-int/lit8 p2, v3, 0x1

    .line 67
    .line 68
    invoke-static {p2}, Lpp0;->N(I)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-static {p0, v4, p1, p2}, Ls11;->h(Ljava/lang/String;Lzt0;Lpx;I)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :pswitch_2
    check-cast p0, Ljava/lang/String;

    .line 77
    .line 78
    check-cast v4, Lxm0;

    .line 79
    .line 80
    check-cast p1, Lpx;

    .line 81
    .line 82
    check-cast p2, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    or-int/lit8 p2, v3, 0x1

    .line 88
    .line 89
    invoke-static {p2}, Lpp0;->N(I)I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    invoke-static {p0, v4, p1, p2}, Lfg1;->d(Ljava/lang/String;Lxm0;Lpx;I)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :pswitch_3
    check-cast p0, [Lf42;

    .line 98
    .line 99
    check-cast v4, Lmn0;

    .line 100
    .line 101
    check-cast p1, Lpx;

    .line 102
    .line 103
    check-cast p2, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    or-int/lit8 p2, v3, 0x1

    .line 109
    .line 110
    invoke-static {p2}, Lpp0;->N(I)I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    invoke-static {p0, v4, p1, p2}, Lci0;->b([Lf42;Lmn0;Lpx;I)V

    .line 115
    .line 116
    .line 117
    return-object v1

    .line 118
    :pswitch_4
    check-cast p0, Lf42;

    .line 119
    .line 120
    check-cast v4, Lkw;

    .line 121
    .line 122
    check-cast p1, Lpx;

    .line 123
    .line 124
    check-cast p2, Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    or-int/lit8 p2, v3, 0x1

    .line 130
    .line 131
    invoke-static {p2}, Lpp0;->N(I)I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    invoke-static {p0, v4, p1, p2}, Lci0;->a(Lf42;Lkw;Lpx;I)V

    .line 136
    .line 137
    .line 138
    return-object v1

    .line 139
    :pswitch_5
    check-cast p0, Lkw;

    .line 140
    .line 141
    check-cast p1, Lpx;

    .line 142
    .line 143
    check-cast p2, Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-static {v3}, Lpp0;->N(I)I

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    or-int/2addr p2, v2

    .line 153
    invoke-virtual {p0, v4, p1, p2}, Lkw;->h(Ljava/lang/Object;Lpx;I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :pswitch_6
    check-cast p0, Luh1;

    .line 158
    .line 159
    check-cast v4, Lin0;

    .line 160
    .line 161
    check-cast p1, Lpx;

    .line 162
    .line 163
    check-cast p2, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    or-int/lit8 p2, v3, 0x1

    .line 169
    .line 170
    invoke-static {p2}, Lpp0;->N(I)I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    invoke-static {p0, v4, p1, p2}, Leu;->b(Luh1;Lin0;Lpx;I)V

    .line 175
    .line 176
    .line 177
    return-object v1

    .line 178
    nop

    .line 179
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
