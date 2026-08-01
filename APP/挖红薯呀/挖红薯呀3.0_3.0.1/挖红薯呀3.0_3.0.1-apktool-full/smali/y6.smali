.class public final synthetic Ly6;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Ly6;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Ly6;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ly6;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ly6;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Ly6;->h:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ly6;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object v2, p0, Ly6;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Ly6;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Ly6;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Ly6;->e:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, Lwt0;

    .line 17
    .line 18
    check-cast v4, Lfn;

    .line 19
    .line 20
    check-cast v3, Ljz0;

    .line 21
    .line 22
    check-cast v2, Lhg0;

    .line 23
    .line 24
    check-cast p1, Lu7;

    .line 25
    .line 26
    iget-object v0, p1, Lu7;->e:Lgp0;

    .line 27
    .line 28
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget v5, p0, Lwt0;->d:F

    .line 39
    .line 40
    sub-float/2addr v0, v5

    .line 41
    invoke-static {v0}, Lr60;->e(F)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-nez v5, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4, v3, v0}, Lfn;->c(Ljz0;F)F

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    sub-float v3, v0, v3

    .line 52
    .line 53
    invoke-static {v3}, Lr60;->e(F)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_0

    .line 58
    .line 59
    invoke-virtual {p1}, Lu7;->a()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget v3, p0, Lwt0;->d:F

    .line 64
    .line 65
    add-float/2addr v3, v0

    .line 66
    iput v3, p0, Lwt0;->d:F

    .line 67
    .line 68
    :cond_1
    iget p0, p0, Lwt0;->d:F

    .line 69
    .line 70
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v2, p0}, Lhg0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_2

    .line 85
    .line 86
    invoke-virtual {p1}, Lu7;->a()V

    .line 87
    .line 88
    .line 89
    :cond_2
    :goto_0
    return-object v1

    .line 90
    :pswitch_0
    check-cast p0, Ld80;

    .line 91
    .line 92
    check-cast v4, Ln70;

    .line 93
    .line 94
    check-cast v3, Lx41;

    .line 95
    .line 96
    check-cast v2, Lcs0;

    .line 97
    .line 98
    check-cast p1, Loo;

    .line 99
    .line 100
    new-instance p1, Ld50;

    .line 101
    .line 102
    invoke-direct {p1, v4, v3, v2}, Ld50;-><init>(Ln70;Lx41;Lcs0;)V

    .line 103
    .line 104
    .line 105
    iput-object p1, p0, Ld80;->c:Ld50;

    .line 106
    .line 107
    new-instance p1, Lk4;

    .line 108
    .line 109
    const/4 v0, 0x3

    .line 110
    invoke-direct {p1, v0, p0}, Lk4;-><init>(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-object p1

    .line 114
    :pswitch_1
    check-cast p0, Lb7;

    .line 115
    .line 116
    check-cast v4, Lw7;

    .line 117
    .line 118
    check-cast v3, Lsw;

    .line 119
    .line 120
    check-cast v2, Lvt0;

    .line 121
    .line 122
    check-cast p1, Lu7;

    .line 123
    .line 124
    iget-object v0, p0, Lb7;->c:Lw7;

    .line 125
    .line 126
    invoke-static {p1, v0}, Lz60;->Q(Lu7;Lw7;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, p1, Lu7;->e:Lgp0;

    .line 130
    .line 131
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-static {p0, v5}, Lb7;->a(Lb7;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v5, v0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_4

    .line 148
    .line 149
    iget-object v0, p0, Lb7;->c:Lw7;

    .line 150
    .line 151
    iget-object v0, v0, Lw7;->e:Lgp0;

    .line 152
    .line 153
    invoke-virtual {v0, v5}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v4, Lw7;->e:Lgp0;

    .line 157
    .line 158
    invoke-virtual {v0, v5}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    if-eqz v3, :cond_3

    .line 162
    .line 163
    invoke-interface {v3, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    :cond_3
    invoke-virtual {p1}, Lu7;->a()V

    .line 167
    .line 168
    .line 169
    const/4 p0, 0x1

    .line 170
    iput-boolean p0, v2, Lvt0;->d:Z

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    if-eqz v3, :cond_5

    .line 174
    .line 175
    invoke-interface {v3, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    :cond_5
    :goto_1
    return-object v1

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
