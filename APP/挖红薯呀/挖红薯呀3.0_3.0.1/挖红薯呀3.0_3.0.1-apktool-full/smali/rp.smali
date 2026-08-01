.class public final Lrp;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lrp;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lrp;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lrp;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lrp;->g:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lrp;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lrp;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lrp;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lrp;->e:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ldv;

    .line 13
    .line 14
    check-cast p0, Ldv;

    .line 15
    .line 16
    invoke-static {p1, p0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    check-cast v2, Lzu;

    .line 25
    .line 26
    iget-object p0, v2, Lzu;->c:Ldv;

    .line 27
    .line 28
    invoke-static {p1, p0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    check-cast v1, Lsw;

    .line 35
    .line 36
    invoke-interface {v1, p1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "Focus search landed at the root."

    .line 52
    .line 53
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    :goto_1
    return-object p0

    .line 58
    :pswitch_0
    check-cast p1, Lgv0;

    .line 59
    .line 60
    check-cast v2, Lw31;

    .line 61
    .line 62
    check-cast p0, Lw31;

    .line 63
    .line 64
    const/high16 v0, 0x3f800000    # 1.0f

    .line 65
    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    invoke-interface {p0}, Lw31;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move p0, v0

    .line 80
    :goto_2
    invoke-virtual {p1, p0}, Lgv0;->d(F)V

    .line 81
    .line 82
    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    invoke-interface {v2}, Lw31;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Ljava/lang/Number;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    goto :goto_3

    .line 96
    :cond_3
    move p0, v0

    .line 97
    :goto_3
    invoke-virtual {p1, p0}, Lgv0;->e(F)V

    .line 98
    .line 99
    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    invoke-interface {v2}, Lw31;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    :cond_4
    invoke-virtual {p1, v0}, Lgv0;->f(F)V

    .line 113
    .line 114
    .line 115
    check-cast v1, Lw31;

    .line 116
    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    invoke-interface {v1}, Lw31;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, Lt81;

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    const-wide/16 v0, 0x0

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_5
    sget-wide v0, Lt81;->a:J

    .line 132
    .line 133
    :goto_4
    invoke-virtual {p1, v0, v1}, Lgv0;->i(J)V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lna1;->a:Lna1;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_1
    check-cast p1, Lh91;

    .line 140
    .line 141
    move-object v0, p1

    .line 142
    check-cast v0, Lsp;

    .line 143
    .line 144
    check-cast v2, Lsp;

    .line 145
    .line 146
    invoke-static {v2}, Lpf1;->R(Lrm;)Ldn0;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Lw3;

    .line 151
    .line 152
    invoke-virtual {v2}, Lw3;->getDragAndDropManager()Lqp;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Lf5;

    .line 157
    .line 158
    iget-object v2, v2, Lf5;->b:Le9;

    .line 159
    .line 160
    invoke-virtual {v2, v0}, Le9;->contains(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_6

    .line 165
    .line 166
    check-cast v1, Lx1;

    .line 167
    .line 168
    invoke-static {v1}, Lpf1;->B(Lx1;)J

    .line 169
    .line 170
    .line 171
    move-result-wide v1

    .line 172
    invoke-static {v0, v1, v2}, Ls91;->h(Lsp;J)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_6

    .line 177
    .line 178
    check-cast p0, Lzt0;

    .line 179
    .line 180
    iput-object p1, p0, Lzt0;->d:Ljava/lang/Object;

    .line 181
    .line 182
    sget-object p0, Lg91;->f:Lg91;

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_6
    sget-object p0, Lg91;->d:Lg91;

    .line 186
    .line 187
    :goto_5
    return-object p0

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
