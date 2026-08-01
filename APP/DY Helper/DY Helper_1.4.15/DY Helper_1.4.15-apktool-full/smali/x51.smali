.class public final Lx51;
.super Lo61;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final δ:Lx51;

.field public static final ε:Lx51;

.field public static final ζ:Lx51;

.field public static final η:Lx51;


# instance fields
.field public final synthetic γ:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lx51;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-direct {v0, v3, v1, v2}, Lx51;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lx51;->δ:Lx51;

    .line 10
    .line 11
    new-instance v0, Lx51;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v0, v1, v1, v2}, Lx51;-><init>(III)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lx51;->ε:Lx51;

    .line 19
    .line 20
    new-instance v0, Lx51;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-direct {v0, v3, v1, v2}, Lx51;-><init>(III)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lx51;->ζ:Lx51;

    .line 28
    .line 29
    new-instance v0, Lx51;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    const/4 v2, 0x3

    .line 33
    invoke-direct {v0, v1, v1, v2}, Lx51;-><init>(III)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lx51;->η:Lx51;

    .line 37
    .line 38
    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    .line 1
    iput p3, p0, Lx51;->γ:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lo61;-><init>(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final α(Lf81;Lp6;Lrw1;Len1;Lr71;)V
    .locals 1

    .line 1
    iget p0, p0, Lx51;->γ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    invoke-virtual {p1, p0}, Lf81;->β(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p0}, Lf81;->α(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    instance-of p1, p2, La90;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    move-object p1, p2

    .line 20
    check-cast p1, La90;

    .line 21
    .line 22
    iget-object p5, p4, Len1;->ε:Lk21;

    .line 23
    .line 24
    invoke-virtual {p5, p1}, Lk21;->β(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p5, p4, Len1;->δ:Lc21;

    .line 28
    .line 29
    invoke-virtual {p5, p1}, Lc21;->α(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    iget p1, p3, Lrw1;->υ:I

    .line 33
    .line 34
    invoke-virtual {p3, p1, p0, p2}, Lrw1;->Ν(IILjava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    instance-of p1, p0, La90;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    check-cast p0, La90;

    .line 43
    .line 44
    invoke-virtual {p4, p0}, Len1;->δ(La90;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    instance-of p1, p0, Lbl1;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    check-cast p0, Lbl1;

    .line 53
    .line 54
    invoke-virtual {p0}, Lbl1;->γ()V

    .line 55
    .line 56
    .line 57
    :cond_2
    :goto_0
    return-void

    .line 58
    :pswitch_0
    const/4 p0, 0x0

    .line 59
    invoke-virtual {p1, p0}, Lf81;->β(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const/4 p5, 0x1

    .line 64
    invoke-virtual {p1, p5}, Lf81;->β(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p5

    .line 68
    check-cast p5, Lq80;

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Lf81;->α(I)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    instance-of p1, p2, La90;

    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    move-object p1, p2

    .line 79
    check-cast p1, La90;

    .line 80
    .line 81
    iget-object v0, p4, Len1;->ε:Lk21;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Lk21;->β(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p4, Len1;->δ:Lc21;

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Lc21;->α(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-virtual {p3, p5}, Lrw1;->γ(Lq80;)I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    invoke-virtual {p3, p1, p0, p2}, Lrw1;->Ν(IILjava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    instance-of p1, p0, La90;

    .line 100
    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    check-cast p0, La90;

    .line 104
    .line 105
    invoke-virtual {p4, p0}, Len1;->δ(La90;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    instance-of p1, p0, Lbl1;

    .line 110
    .line 111
    if-eqz p1, :cond_5

    .line 112
    .line 113
    check-cast p0, Lbl1;

    .line 114
    .line 115
    invoke-virtual {p0}, Lbl1;->γ()V

    .line 116
    .line 117
    .line 118
    :cond_5
    :goto_1
    return-void

    .line 119
    :pswitch_1
    const/4 p0, 0x0

    .line 120
    invoke-virtual {p1, p0}, Lf81;->β(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p4

    .line 124
    check-cast p4, Lq80;

    .line 125
    .line 126
    invoke-virtual {p1, p0}, Lf81;->α(I)I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    invoke-interface {p2}, Lp6;->μ()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3, p4}, Lrw1;->γ(Lq80;)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    invoke-virtual {p3, p1}, Lrw1;->Ζ(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-interface {p2, p0, p1}, Lp6;->α(ILjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :pswitch_2
    const/4 p0, 0x0

    .line 149
    invoke-virtual {p1, p0}, Lf81;->β(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p4

    .line 153
    check-cast p4, Lp70;

    .line 154
    .line 155
    invoke-interface {p4}, Lp70;->invoke()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p4

    .line 159
    const/4 p5, 0x1

    .line 160
    invoke-virtual {p1, p5}, Lf81;->β(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p5

    .line 164
    check-cast p5, Lq80;

    .line 165
    .line 166
    invoke-virtual {p1, p0}, Lf81;->α(I)I

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p3, p5}, Lrw1;->γ(Lq80;)I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    invoke-virtual {p3, p1, p4}, Lrw1;->Ψ(ILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {p2, p0, p4}, Lp6;->ε(ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {p2, p4}, Lp6;->γ(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public β(Lf81;)Lq80;
    .locals 1

    .line 1
    iget v0, p0, Lx51;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lo61;->β(Lf81;)Lq80;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const/4 p0, 0x0

    .line 12
    invoke-virtual {p1, p0}, Lf81;->β(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lq80;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_1
    const/4 p0, 0x1

    .line 20
    invoke-virtual {p1, p0}, Lf81;->β(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lq80;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
