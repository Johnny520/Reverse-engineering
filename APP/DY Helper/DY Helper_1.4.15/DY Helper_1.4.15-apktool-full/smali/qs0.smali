.class public final synthetic Lqs0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lps0;

.field public final synthetic η:La80;

.field public final synthetic θ:La80;


# direct methods
.method public synthetic constructor <init>(Lps0;La80;La80;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lqs0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqs0;->ζ:Lps0;

    .line 8
    .line 9
    iput-object p2, p0, Lqs0;->η:La80;

    .line 10
    .line 11
    iput-object p3, p0, Lqs0;->θ:La80;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lps0;La80;La80;II)V
    .locals 0

    .line 14
    iput p5, p0, Lqs0;->ε:I

    iput-object p1, p0, Lqs0;->ζ:Lps0;

    iput-object p2, p0, Lqs0;->η:La80;

    iput-object p3, p0, Lqs0;->θ:La80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lqs0;->ε:I

    .line 2
    .line 3
    check-cast p1, Lv80;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/16 p2, 0x9

    .line 14
    .line 15
    invoke-static {p2}, Lv81;->σ(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object v0, p0, Lqs0;->ζ:Lps0;

    .line 20
    .line 21
    iget-object v1, p0, Lqs0;->η:La80;

    .line 22
    .line 23
    iget-object p0, p0, Lqs0;->θ:La80;

    .line 24
    .line 25
    invoke-static {v0, v1, p0, p1, p2}, Lpt0;->β(Lps0;La80;La80;Lv80;I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/16 p2, 0x9

    .line 35
    .line 36
    invoke-static {p2}, Lv81;->σ(I)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    iget-object v0, p0, Lqs0;->ζ:Lps0;

    .line 41
    .line 42
    iget-object v1, p0, Lqs0;->η:La80;

    .line 43
    .line 44
    iget-object p0, p0, Lqs0;->θ:La80;

    .line 45
    .line 46
    invoke-static {v0, v1, p0, p1, p2}, Lpt0;->β(Lps0;La80;La80;Lv80;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const/16 p2, 0x9

    .line 54
    .line 55
    invoke-static {p2}, Lv81;->σ(I)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    iget-object v0, p0, Lqs0;->ζ:Lps0;

    .line 60
    .line 61
    iget-object v1, p0, Lqs0;->η:La80;

    .line 62
    .line 63
    iget-object p0, p0, Lqs0;->θ:La80;

    .line 64
    .line 65
    invoke-static {v0, v1, p0, p1, p2}, Ljx0;->β(Lps0;La80;La80;Lv80;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/16 p2, 0x9

    .line 73
    .line 74
    invoke-static {p2}, Lv81;->σ(I)I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    iget-object v0, p0, Lqs0;->ζ:Lps0;

    .line 79
    .line 80
    iget-object v1, p0, Lqs0;->η:La80;

    .line 81
    .line 82
    iget-object p0, p0, Lqs0;->θ:La80;

    .line 83
    .line 84
    invoke-static {v0, v1, p0, p1, p2}, Ljx0;->β(Lps0;La80;La80;Lv80;I)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const/16 p2, 0x9

    .line 92
    .line 93
    invoke-static {p2}, Lv81;->σ(I)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    iget-object v0, p0, Lqs0;->ζ:Lps0;

    .line 98
    .line 99
    iget-object v1, p0, Lqs0;->η:La80;

    .line 100
    .line 101
    iget-object p0, p0, Lqs0;->θ:La80;

    .line 102
    .line 103
    invoke-static {v0, v1, p0, p1, p2}, Ljx0;->γ(Lps0;La80;La80;Lv80;I)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    and-int/lit8 v0, p2, 0x3

    .line 112
    .line 113
    const/4 v1, 0x2

    .line 114
    const/4 v2, 0x1

    .line 115
    if-eq v0, v1, :cond_0

    .line 116
    .line 117
    move v0, v2

    .line 118
    goto :goto_1

    .line 119
    :cond_0
    const/4 v0, 0x0

    .line 120
    :goto_1
    and-int/2addr p2, v2

    .line 121
    invoke-virtual {p1, p2, v0}, Lv80;->Ξ(IZ)Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_1

    .line 126
    .line 127
    sget-object p2, Lxb;->τ:Lu30;

    .line 128
    .line 129
    sget-object v0, Lx;->ν:Laa;

    .line 130
    .line 131
    new-instance v1, Lxs0;

    .line 132
    .line 133
    const/4 v2, 0x0

    .line 134
    iget-object v3, p0, Lqs0;->ζ:Lps0;

    .line 135
    .line 136
    iget-object v4, p0, Lqs0;->η:La80;

    .line 137
    .line 138
    iget-object p0, p0, Lqs0;->θ:La80;

    .line 139
    .line 140
    invoke-direct {v1, v3, v4, p0, v2}, Lxs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 141
    .line 142
    .line 143
    const p0, 0x57a79233

    .line 144
    .line 145
    .line 146
    invoke-static {p0, v1, p1}, Lkn0;->Ν(ILm80;Lv80;)Lan;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    const/16 v1, 0xc36

    .line 151
    .line 152
    invoke-static {p2, v0, p0, p1, v1}, Lyh;->α(Lr01;Laa;Lan;Lv80;I)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_1
    invoke-virtual {p1}, Lv80;->Ρ()V

    .line 157
    .line 158
    .line 159
    :goto_2
    sget-object p0, Ls62;->α:Ls62;

    .line 160
    .line 161
    return-object p0

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
