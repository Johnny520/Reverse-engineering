.class public final Llf0;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lsf0;

.field public final synthetic k:Lph0;


# direct methods
.method public synthetic constructor <init>(Lsf0;Lph0;I)V
    .locals 0

    .line 1
    iput p3, p0, Llf0;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Llf0;->j:Lsf0;

    .line 4
    .line 5
    iput-object p2, p0, Llf0;->k:Lph0;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Llf0;->i:I

    .line 2
    .line 3
    sget-object v1, Lif0;->j:Lif0;

    .line 4
    .line 5
    sget-object v2, Lif0;->i:Lif0;

    .line 6
    .line 7
    sget-object v3, Lif0;->h:Lif0;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    const/high16 v7, 0x3f800000    # 1.0f

    .line 13
    .line 14
    iget-object v8, p0, Llf0;->j:Lsf0;

    .line 15
    .line 16
    iget-object p0, p0, Llf0;->k:Lph0;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast p1, Lif0;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const v0, 0x3f75c28f    # 0.96f

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    if-eq p1, v6, :cond_2

    .line 33
    .line 34
    if-ne p1, v5, :cond_0

    .line 35
    .line 36
    iget-object p0, p0, Lph0;->a:Lz33;

    .line 37
    .line 38
    iget-object p0, p0, Lz33;->b:Lcd2;

    .line 39
    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    :goto_0
    move v7, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-static {}, Lc80;->s()V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    iget-object p0, v8, Lsf0;->a:Lz33;

    .line 49
    .line 50
    iget-object p0, p0, Lz33;->b:Lcd2;

    .line 51
    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    :goto_1
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    :goto_2
    return-object v4

    .line 60
    :pswitch_0
    check-cast p1, Lv33;

    .line 61
    .line 62
    invoke-virtual {p1, v3, v2}, Lv33;->a(Lif0;Lif0;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    iget-object p0, v8, Lsf0;->a:Lz33;

    .line 69
    .line 70
    iget-object p0, p0, Lz33;->b:Lcd2;

    .line 71
    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    iget-object p0, p0, Lcd2;->b:Lm43;

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    sget-object p0, Lnf0;->b:Lqt2;

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    invoke-virtual {p1, v2, v1}, Lv33;->a(Lif0;Lif0;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    iget-object p0, p0, Lph0;->a:Lz33;

    .line 87
    .line 88
    iget-object p0, p0, Lz33;->b:Lcd2;

    .line 89
    .line 90
    if-eqz p0, :cond_5

    .line 91
    .line 92
    iget-object p0, p0, Lcd2;->b:Lm43;

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_5
    sget-object p0, Lnf0;->b:Lqt2;

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    sget-object p0, Lnf0;->b:Lqt2;

    .line 99
    .line 100
    :goto_3
    return-object p0

    .line 101
    :pswitch_1
    check-cast p1, Lif0;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    const/4 v0, 0x0

    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    if-eq p1, v6, :cond_9

    .line 111
    .line 112
    if-ne p1, v5, :cond_7

    .line 113
    .line 114
    iget-object p0, p0, Lph0;->a:Lz33;

    .line 115
    .line 116
    iget-object p0, p0, Lz33;->a:Luh0;

    .line 117
    .line 118
    if-eqz p0, :cond_9

    .line 119
    .line 120
    :goto_4
    move v7, v0

    .line 121
    goto :goto_5

    .line 122
    :cond_7
    invoke-static {}, Lc80;->s()V

    .line 123
    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_8
    iget-object p0, v8, Lsf0;->a:Lz33;

    .line 127
    .line 128
    iget-object p0, p0, Lz33;->a:Luh0;

    .line 129
    .line 130
    if-eqz p0, :cond_9

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_9
    :goto_5
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    :goto_6
    return-object v4

    .line 138
    :pswitch_2
    check-cast p1, Lv33;

    .line 139
    .line 140
    invoke-virtual {p1, v3, v2}, Lv33;->a(Lif0;Lif0;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_b

    .line 145
    .line 146
    iget-object p0, v8, Lsf0;->a:Lz33;

    .line 147
    .line 148
    iget-object p0, p0, Lz33;->a:Luh0;

    .line 149
    .line 150
    if-eqz p0, :cond_a

    .line 151
    .line 152
    iget-object p0, p0, Luh0;->a:Lfj0;

    .line 153
    .line 154
    if-nez p0, :cond_e

    .line 155
    .line 156
    :cond_a
    sget-object p0, Lnf0;->b:Lqt2;

    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_b
    invoke-virtual {p1, v2, v1}, Lv33;->a(Lif0;Lif0;)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_d

    .line 164
    .line 165
    iget-object p0, p0, Lph0;->a:Lz33;

    .line 166
    .line 167
    iget-object p0, p0, Lz33;->a:Luh0;

    .line 168
    .line 169
    if-eqz p0, :cond_c

    .line 170
    .line 171
    iget-object p0, p0, Luh0;->a:Lfj0;

    .line 172
    .line 173
    if-nez p0, :cond_e

    .line 174
    .line 175
    :cond_c
    sget-object p0, Lnf0;->b:Lqt2;

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_d
    sget-object p0, Lnf0;->b:Lqt2;

    .line 179
    .line 180
    :cond_e
    :goto_7
    return-object p0

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
