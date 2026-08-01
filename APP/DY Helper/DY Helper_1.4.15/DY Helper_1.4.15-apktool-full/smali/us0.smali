.class public final synthetic Lus0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lxt0;

.field public final synthetic η:Lp70;

.field public final synthetic θ:Lp70;


# direct methods
.method public synthetic constructor <init>(Lxt0;Lp70;Lp70;I)V
    .locals 0

    .line 1
    iput p4, p0, Lus0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lus0;->ζ:Lxt0;

    .line 4
    .line 5
    iput-object p2, p0, Lus0;->η:Lp70;

    .line 6
    .line 7
    iput-object p3, p0, Lus0;->θ:Lp70;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lus0;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const-string v2, "\u957f\u6309\u6807\u7b7e"

    .line 6
    .line 7
    const-string v3, "\u5207\u6362\u6807\u7b7e"

    .line 8
    .line 9
    const/16 v4, 0x17

    .line 10
    .line 11
    iget-object v5, p0, Lus0;->θ:Lp70;

    .line 12
    .line 13
    iget-object v6, p0, Lus0;->η:Lp70;

    .line 14
    .line 15
    iget-object p0, p0, Lus0;->ζ:Lxt0;

    .line 16
    .line 17
    const/4 v7, 0x4

    .line 18
    check-cast p1, Ljs1;

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-boolean v0, p0, Lxt0;->δ:Z

    .line 27
    .line 28
    sget-object v8, Lhs1;->α:[Lso0;

    .line 29
    .line 30
    sget-object v8, Lfs1;->Θ:Lis1;

    .line 31
    .line 32
    sget-object v9, Lhs1;->α:[Lso0;

    .line 33
    .line 34
    aget-object v4, v9, v4

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p1, v8, v0}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v7}, Lhs1;->α(Ljs1;I)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lxt0;->β:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object v3, p0

    .line 56
    :goto_0
    new-instance v0, Lpc0;

    .line 57
    .line 58
    const/4 v4, 0x3

    .line 59
    invoke-direct {v0, v4, v6}, Lpc0;-><init>(ILp70;)V

    .line 60
    .line 61
    .line 62
    sget-object v4, Lwr1;->β:Lis1;

    .line 63
    .line 64
    new-instance v6, Lм;

    .line 65
    .line 66
    invoke-direct {v6, v3, v0}, Lм;-><init>(Ljava/lang/String;Lm80;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v4, v6}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v2, p0

    .line 80
    :goto_1
    new-instance p0, Lpc0;

    .line 81
    .line 82
    invoke-direct {p0, v7, v5}, Lpc0;-><init>(ILp70;)V

    .line 83
    .line 84
    .line 85
    sget-object v0, Lwr1;->γ:Lis1;

    .line 86
    .line 87
    new-instance v3, Lм;

    .line 88
    .line 89
    invoke-direct {v3, v2, p0}, Lм;-><init>(Ljava/lang/String;Lm80;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, v0, v3}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-boolean v0, p0, Lxt0;->δ:Z

    .line 100
    .line 101
    sget-object v8, Lhs1;->α:[Lso0;

    .line 102
    .line 103
    sget-object v8, Lfs1;->Θ:Lis1;

    .line 104
    .line 105
    sget-object v9, Lhs1;->α:[Lso0;

    .line 106
    .line 107
    aget-object v4, v9, v4

    .line 108
    .line 109
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-interface {p1, v8, v0}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1, v7}, Lhs1;->α(Ljs1;I)V

    .line 117
    .line 118
    .line 119
    iget-object p0, p0, Lxt0;->β:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_2
    move-object v3, p0

    .line 129
    :goto_2
    new-instance v0, Lpc0;

    .line 130
    .line 131
    const/4 v4, 0x1

    .line 132
    invoke-direct {v0, v4, v6}, Lpc0;-><init>(ILp70;)V

    .line 133
    .line 134
    .line 135
    sget-object v4, Lwr1;->β:Lis1;

    .line 136
    .line 137
    new-instance v6, Lм;

    .line 138
    .line 139
    invoke-direct {v6, v3, v0}, Lм;-><init>(Ljava/lang/String;Lm80;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {p1, v4, v6}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_3

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_3
    move-object v2, p0

    .line 153
    :goto_3
    new-instance p0, Lpc0;

    .line 154
    .line 155
    const/4 v0, 0x2

    .line 156
    invoke-direct {p0, v0, v5}, Lpc0;-><init>(ILp70;)V

    .line 157
    .line 158
    .line 159
    sget-object v0, Lwr1;->γ:Lis1;

    .line 160
    .line 161
    new-instance v3, Lм;

    .line 162
    .line 163
    invoke-direct {v3, v2, p0}, Lм;-><init>(Ljava/lang/String;Lm80;)V

    .line 164
    .line 165
    .line 166
    invoke-interface {p1, v0, v3}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    return-object v1

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
