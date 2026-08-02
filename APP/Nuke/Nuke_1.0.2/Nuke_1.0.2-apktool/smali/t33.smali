.class public final Lt33;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lgu2;


# instance fields
.field public final h:Lw33;

.field public i:Lin0;

.field public j:Lin0;

.field public final synthetic k:Lu33;


# direct methods
.method public constructor <init>(Lu33;Lw33;Lin0;Lin0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt33;->k:Lu33;

    .line 5
    .line 6
    iput-object p2, p0, Lt33;->h:Lw33;

    .line 7
    .line 8
    iput-object p3, p0, Lt33;->i:Lin0;

    .line 9
    .line 10
    iput-object p4, p0, Lt33;->j:Lin0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lv33;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lt33;->h:Lw33;

    .line 2
    .line 3
    iget-object v1, v0, Lw33;->l:Lnx1;

    .line 4
    .line 5
    iget-object v2, v0, Lw33;->i:Lnx1;

    .line 6
    .line 7
    iget-object v3, v0, Lw33;->m:Ljx1;

    .line 8
    .line 9
    iget-object v4, v0, Lw33;->o:Lnx1;

    .line 10
    .line 11
    iget-object v5, p0, Lt33;->j:Lin0;

    .line 12
    .line 13
    iget-object v6, p1, Lv33;->b:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v5, v6}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v6, p0, Lt33;->k:Lu33;

    .line 20
    .line 21
    iget-object v6, v6, Lu33;->c:Ly33;

    .line 22
    .line 23
    invoke-virtual {v6}, Ly33;->g()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lt33;->j:Lin0;

    .line 30
    .line 31
    iget-object v2, p1, Lv33;->a:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-interface {v1, v2}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object p0, p0, Lt33;->i:Lin0;

    .line 38
    .line 39
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lfj0;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v5, p0}, Lw33;->f(Ljava/lang/Object;Ljava/lang/Object;Lfj0;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    iget-object p0, p0, Lt33;->i:Lin0;

    .line 50
    .line 51
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Lfj0;

    .line 56
    .line 57
    iget-boolean p1, v0, Lw33;->n:Z

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-static {v5, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {v2}, Lnx1;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    const/high16 v6, -0x40800000    # -1.0f

    .line 78
    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    invoke-virtual {v3}, Ljx1;->g()F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    cmpg-float p1, p1, v6

    .line 86
    .line 87
    if-nez p1, :cond_2

    .line 88
    .line 89
    :goto_0
    return-void

    .line 90
    :cond_2
    invoke-virtual {v2, v5}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, v0, Lw33;->j:Lnx1;

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Ljx1;->g()F

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    const/high16 p1, -0x3fc00000    # -3.0f

    .line 103
    .line 104
    cmpg-float p0, p0, p1

    .line 105
    .line 106
    if-nez p0, :cond_3

    .line 107
    .line 108
    move-object p0, v5

    .line 109
    goto :goto_1

    .line 110
    :cond_3
    invoke-virtual {v4}, Lnx1;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    :goto_1
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    check-cast v2, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    const/4 v7, 0x1

    .line 125
    xor-int/2addr v2, v7

    .line 126
    invoke-virtual {v0, p0, v2}, Lw33;->e(Ljava/lang/Object;Z)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljx1;->g()F

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    cmpg-float p0, p0, p1

    .line 134
    .line 135
    const/4 v2, 0x0

    .line 136
    if-nez p0, :cond_4

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    move v7, v2

    .line 140
    :goto_2
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {v1, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Ljx1;->g()F

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    const/4 v1, 0x0

    .line 152
    cmpl-float p0, p0, v1

    .line 153
    .line 154
    if-ltz p0, :cond_5

    .line 155
    .line 156
    invoke-virtual {v0}, Lw33;->a()Lcy2;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p0}, Lcy2;->c()J

    .line 161
    .line 162
    .line 163
    move-result-wide p0

    .line 164
    invoke-virtual {v0}, Lw33;->a()Lcy2;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    long-to-float p0, p0

    .line 169
    invoke-virtual {v3}, Ljx1;->g()F

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    mul-float/2addr p1, p0

    .line 174
    float-to-long p0, p1

    .line 175
    invoke-virtual {v1, p0, p1}, Lcy2;->b(J)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {v4, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_5
    invoke-virtual {v3}, Ljx1;->g()F

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    cmpg-float p0, p0, p1

    .line 188
    .line 189
    if-nez p0, :cond_6

    .line 190
    .line 191
    invoke-virtual {v4, v5}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_6
    :goto_3
    iput-boolean v2, v0, Lw33;->n:Z

    .line 195
    .line 196
    invoke-virtual {v3, v6}, Ljx1;->h(F)V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt33;->k:Lu33;

    .line 2
    .line 3
    iget-object v0, v0, Lu33;->c:Ly33;

    .line 4
    .line 5
    invoke-virtual {v0}, Ly33;->f()Lv33;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lt33;->a(Lv33;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lt33;->h:Lw33;

    .line 13
    .line 14
    iget-object p0, p0, Lw33;->o:Lnx1;

    .line 15
    .line 16
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
