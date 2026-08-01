.class public abstract Ls3;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lpz1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v2, v2, v0, v1}, Lbd;->г(FFLjava/lang/Float;I)Lpz1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Ls3;->α:Lpz1;

    .line 9
    .line 10
    sget v0, Lga2;->α:I

    .line 11
    .line 12
    const/high16 v0, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final α(FLpz1;Ljava/lang/String;Lv80;)Lc02;
    .locals 10

    .line 1
    sget-object v0, Ls3;->α:Lpz1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_2

    .line 5
    .line 6
    const p1, 0x4431d23f

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, p1}, Lv80;->Φ(I)V

    .line 10
    .line 11
    .line 12
    const p1, 0x3c23d70a    # 0.01f

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3, p1}, Lv80;->γ(F)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p3}, Lv80;->Λ()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lqn;->α:Li2;

    .line 26
    .line 27
    if-ne v2, v0, :cond_1

    .line 28
    .line 29
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 v0, 0x0

    .line 34
    const/4 v2, 0x3

    .line 35
    invoke-static {v0, v0, p1, v2}, Lbd;->г(FFLjava/lang/Float;I)Lpz1;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p3, v2}, Lv80;->е(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    move-object p1, v2

    .line 43
    check-cast p1, Lpz1;

    .line 44
    .line 45
    invoke-virtual {p3, v1}, Lv80;->ο(Z)V

    .line 46
    .line 47
    .line 48
    :goto_0
    move-object v4, p1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const v0, 0x44337fa5

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, v0}, Lv80;->Φ(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, v1}, Lv80;->ο(Z)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :goto_1
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    sget-object v3, Ls1;->μ:Lg62;

    .line 65
    .line 66
    const/16 v8, 0x6000

    .line 67
    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v5, 0x0

    .line 70
    move-object v6, p2

    .line 71
    move-object v7, p3

    .line 72
    invoke-static/range {v2 .. v9}, Ls3;->β(Ljava/lang/Object;Lg62;Lw3;Ljava/lang/Float;Ljava/lang/String;Lv80;II)Lc02;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

.method public static final β(Ljava/lang/Object;Lg62;Lw3;Ljava/lang/Float;Ljava/lang/String;Lv80;II)Lc02;
    .locals 7

    .line 1
    and-int/lit8 p4, p7, 0x8

    .line 2
    .line 3
    const/4 p6, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p3, p6

    .line 7
    :cond_0
    invoke-virtual {p5}, Lv80;->Λ()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    sget-object p7, Lqn;->α:Li2;

    .line 12
    .line 13
    if-ne p4, p7, :cond_1

    .line 14
    .line 15
    invoke-static {p6}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    invoke-virtual {p5, p4}, Lv80;->е(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    check-cast p4, Lg21;

    .line 23
    .line 24
    invoke-virtual {p5}, Lv80;->Λ()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-ne v0, p7, :cond_2

    .line 29
    .line 30
    new-instance v0, Lo3;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1, p3}, Lo3;-><init>(Ljava/lang/Object;Lg62;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p5, v0}, Lv80;->е(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    move-object v3, v0

    .line 39
    check-cast v3, Lo3;

    .line 40
    .line 41
    invoke-static {p6, p5}, Lj81;->Κ(Ljava/lang/Object;Lv80;)Lg21;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    if-eqz p3, :cond_3

    .line 46
    .line 47
    instance-of p1, p2, Lpz1;

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    move-object p1, p2

    .line 52
    check-cast p1, Lpz1;

    .line 53
    .line 54
    iget-object v0, p1, Lpz1;->γ:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {v0, p3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    iget p2, p1, Lpz1;->α:F

    .line 63
    .line 64
    iget p1, p1, Lpz1;->β:F

    .line 65
    .line 66
    new-instance v0, Lpz1;

    .line 67
    .line 68
    invoke-direct {v0, p2, p1, p3}, Lpz1;-><init>(FFLjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object p2, v0

    .line 72
    :cond_3
    invoke-static {p2, p5}, Lj81;->Κ(Ljava/lang/Object;Lv80;)Lg21;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {p5}, Lv80;->Λ()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, p7, :cond_4

    .line 81
    .line 82
    const/4 p1, -0x1

    .line 83
    const/4 p2, 0x6

    .line 84
    invoke-static {p1, p6, p2}, Lln0;->β(ILuc;I)Lwc;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p5, p1}, Lv80;->е(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    move-object v2, p1

    .line 92
    check-cast v2, Lme;

    .line 93
    .line 94
    invoke-virtual {p5, v2}, Lv80;->η(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-virtual {p5, p0}, Lv80;->η(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    or-int/2addr p1, p2

    .line 103
    invoke-virtual {p5}, Lv80;->Λ()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    if-nez p1, :cond_5

    .line 108
    .line 109
    if-ne p2, p7, :cond_6

    .line 110
    .line 111
    :cond_5
    new-instance p2, Lp3;

    .line 112
    .line 113
    const/4 p1, 0x0

    .line 114
    invoke-direct {p2, v2, p1, p0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p5, p2}, Lv80;->е(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    check-cast p2, Lp70;

    .line 121
    .line 122
    iget-object p0, p5, Lv80;->Ο:Lrn;

    .line 123
    .line 124
    iget-object p0, p0, Lrn;->β:Lke;

    .line 125
    .line 126
    iget-object p0, p0, Lke;->π:Lh81;

    .line 127
    .line 128
    sget-object p1, Lg61;->γ:Lg61;

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Lh81;->Θ(Lo61;)V

    .line 131
    .line 132
    .line 133
    const/4 p1, 0x0

    .line 134
    invoke-static {p0, p1, p2}, Lg81;->τ(Lh81;ILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p5, v2}, Lv80;->η(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    invoke-virtual {p5, v3}, Lv80;->η(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    or-int/2addr p0, p1

    .line 146
    invoke-virtual {p5, v4}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    or-int/2addr p0, p1

    .line 151
    invoke-virtual {p5, v5}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    or-int/2addr p0, p1

    .line 156
    invoke-virtual {p5}, Lv80;->Λ()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-nez p0, :cond_7

    .line 161
    .line 162
    if-ne p1, p7, :cond_8

    .line 163
    .line 164
    :cond_7
    new-instance v1, Lr3;

    .line 165
    .line 166
    const/4 v6, 0x0

    .line 167
    invoke-direct/range {v1 .. v6}, Lr3;-><init>(Lme;Lo3;Lg21;Lg21;Lop;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p5, v1}, Lv80;->е(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    move-object p1, v1

    .line 174
    :cond_8
    check-cast p1, Le80;

    .line 175
    .line 176
    invoke-static {p1, p5, v2}, Lxb;->η(Le80;Lv80;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-interface {p4}, Lc02;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    check-cast p0, Lc02;

    .line 184
    .line 185
    if-nez p0, :cond_9

    .line 186
    .line 187
    iget-object p0, v3, Lo3;->γ:Lx3;

    .line 188
    .line 189
    :cond_9
    return-object p0
.end method
