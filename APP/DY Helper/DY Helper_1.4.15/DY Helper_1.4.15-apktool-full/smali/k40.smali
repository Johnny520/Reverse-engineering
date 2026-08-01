.class public final Lk40;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lg40;


# instance fields
.field public final synthetic ε:I

.field public final ζ:Ljava/lang/Object;

.field public final η:Ljava/lang/Object;

.field public final θ:Ly12;


# direct methods
.method public constructor <init>(Lg40;Lup;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lk40;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lk40;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p2}, Lpd2;->Ω(Lup;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, p0, Lk40;->η:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p2, Loe;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-direct {p2, p1, v0, v1}, Loe;-><init>(Ljava/lang/Object;Lop;I)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lk40;->θ:Ly12;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Lqm1;Lg40;Lgl1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk40;->ε:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk40;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lk40;->η:Ljava/lang/Object;

    iput-object p3, p0, Lk40;->θ:Ly12;

    return-void
.end method


# virtual methods
.method public final δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lk40;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk40;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lup;

    .line 9
    .line 10
    iget-object v1, p0, Lk40;->θ:Ly12;

    .line 11
    .line 12
    check-cast v1, Loe;

    .line 13
    .line 14
    iget-object p0, p0, Lk40;->η:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {v0, p1, p0, v1, p2}, Lkn0;->Φ(Lup;Ljava/lang/Object;Ljava/lang/Object;Le80;Lop;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object p1, Lcq;->ε:Lcq;

    .line 21
    .line 22
    if-ne p0, p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 26
    .line 27
    :goto_0
    return-object p0

    .line 28
    :pswitch_0
    instance-of v0, p2, Lj40;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    move-object v0, p2

    .line 33
    check-cast v0, Lj40;

    .line 34
    .line 35
    iget v1, v0, Lj40;->μ:I

    .line 36
    .line 37
    const/high16 v2, -0x80000000

    .line 38
    .line 39
    and-int v3, v1, v2

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    sub-int/2addr v1, v2

    .line 44
    iput v1, v0, Lj40;->μ:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance v0, Lj40;

    .line 48
    .line 49
    invoke-direct {v0, p0, p2}, Lj40;-><init>(Lk40;Lop;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iget-object p2, v0, Lj40;->κ:Ljava/lang/Object;

    .line 53
    .line 54
    iget v1, v0, Lj40;->μ:I

    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    const/4 v3, 0x2

    .line 58
    sget-object v4, Ls62;->α:Ls62;

    .line 59
    .line 60
    const/4 v5, 0x1

    .line 61
    sget-object v6, Lcq;->ε:Lcq;

    .line 62
    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    if-eq v1, v5, :cond_2

    .line 66
    .line 67
    if-eq v1, v3, :cond_4

    .line 68
    .line 69
    if-ne v1, v2, :cond_3

    .line 70
    .line 71
    :cond_2
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    goto :goto_4

    .line 82
    :cond_4
    iget-object p1, v0, Lj40;->ι:Ljava/lang/Object;

    .line 83
    .line 84
    iget-object p0, v0, Lj40;->θ:Lk40;

    .line 85
    .line 86
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object p2, p0, Lk40;->ζ:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p2, Lqm1;

    .line 96
    .line 97
    iget-boolean p2, p2, Lqm1;->ε:Z

    .line 98
    .line 99
    if-eqz p2, :cond_6

    .line 100
    .line 101
    iget-object p0, p0, Lk40;->η:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, Lg40;

    .line 104
    .line 105
    iput v5, v0, Lj40;->μ:I

    .line 106
    .line 107
    invoke-interface {p0, p1, v0}, Lg40;->δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-ne p0, v6, :cond_8

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    iget-object p2, p0, Lk40;->θ:Ly12;

    .line 115
    .line 116
    check-cast p2, Lgl1;

    .line 117
    .line 118
    iput-object p0, v0, Lj40;->θ:Lk40;

    .line 119
    .line 120
    iput-object p1, v0, Lj40;->ι:Ljava/lang/Object;

    .line 121
    .line 122
    iput v3, v0, Lj40;->μ:I

    .line 123
    .line 124
    invoke-virtual {p2, p1, v0}, Lgl1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    if-ne p2, v6, :cond_7

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_7
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-nez p2, :cond_8

    .line 138
    .line 139
    iget-object p2, p0, Lk40;->ζ:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast p2, Lqm1;

    .line 142
    .line 143
    iput-boolean v5, p2, Lqm1;->ε:Z

    .line 144
    .line 145
    iget-object p0, p0, Lk40;->η:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast p0, Lg40;

    .line 148
    .line 149
    const/4 p2, 0x0

    .line 150
    iput-object p2, v0, Lj40;->θ:Lk40;

    .line 151
    .line 152
    iput-object p2, v0, Lj40;->ι:Ljava/lang/Object;

    .line 153
    .line 154
    iput v2, v0, Lj40;->μ:I

    .line 155
    .line 156
    invoke-interface {p0, p1, v0}, Lg40;->δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    if-ne p0, v6, :cond_8

    .line 161
    .line 162
    :goto_3
    move-object v4, v6

    .line 163
    :cond_8
    :goto_4
    return-object v4

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
