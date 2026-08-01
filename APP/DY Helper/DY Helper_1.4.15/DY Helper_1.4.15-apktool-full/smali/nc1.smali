.class public final synthetic Lnc1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Long;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Long;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnc1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lnc1;->ζ:Ljava/lang/Long;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lnc1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Ljb1;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lnc1;->ζ:Ljava/lang/Long;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-ltz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object p0, p1

    .line 29
    :goto_0
    iget-wide v2, v1, Ljb1;->β:J

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    const-wide v6, 0x7fffffffffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    sub-long v8, v6, v2

    .line 43
    .line 44
    cmp-long p1, v4, v8

    .line 45
    .line 46
    if-lez p1, :cond_1

    .line 47
    .line 48
    move-wide v2, v6

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    add-long/2addr v2, v4

    .line 51
    :cond_2
    :goto_1
    move-wide v3, v2

    .line 52
    iget p1, v1, Ljb1;->ζ:I

    .line 53
    .line 54
    if-nez p0, :cond_4

    .line 55
    .line 56
    const p0, 0x7fffffff

    .line 57
    .line 58
    .line 59
    if-ne p1, p0, :cond_3

    .line 60
    .line 61
    move p1, p0

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 64
    .line 65
    :cond_4
    :goto_2
    move v9, p1

    .line 66
    const/4 v10, 0x0

    .line 67
    const/16 v11, 0x5d

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    const-wide/16 v5, 0x0

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-static/range {v1 .. v11}, Ljb1;->α(Ljb1;Ljava/time/LocalDate;JJIIIII)Ljb1;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :pswitch_0
    move-object v0, p1

    .line 80
    check-cast v0, Ljb1;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object p0, p0, Lnc1;->ζ:Ljava/lang/Long;

    .line 86
    .line 87
    const/4 p1, 0x0

    .line 88
    if-eqz p0, :cond_5

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    const-wide/16 v3, 0x0

    .line 95
    .line 96
    cmp-long v1, v1, v3

    .line 97
    .line 98
    if-ltz v1, :cond_5

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    move-object p0, p1

    .line 102
    :goto_3
    iget-wide v1, v0, Ljb1;->γ:J

    .line 103
    .line 104
    if-eqz p0, :cond_7

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 107
    .line 108
    .line 109
    move-result-wide v3

    .line 110
    const-wide v5, 0x7fffffffffffffffL

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    sub-long v7, v5, v1

    .line 116
    .line 117
    cmp-long p1, v3, v7

    .line 118
    .line 119
    if-lez p1, :cond_6

    .line 120
    .line 121
    move-wide v1, v5

    .line 122
    goto :goto_4

    .line 123
    :cond_6
    add-long/2addr v1, v3

    .line 124
    :cond_7
    :goto_4
    move-wide v4, v1

    .line 125
    iget p1, v0, Ljb1;->δ:I

    .line 126
    .line 127
    const v1, 0x7fffffff

    .line 128
    .line 129
    .line 130
    if-ne p1, v1, :cond_8

    .line 131
    .line 132
    move v6, v1

    .line 133
    goto :goto_5

    .line 134
    :cond_8
    add-int/lit8 p1, p1, 0x1

    .line 135
    .line 136
    move v6, p1

    .line 137
    :goto_5
    iget p1, v0, Ljb1;->η:I

    .line 138
    .line 139
    if-nez p0, :cond_a

    .line 140
    .line 141
    if-ne p1, v1, :cond_9

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_9
    add-int/lit8 v1, p1, 0x1

    .line 145
    .line 146
    :goto_6
    move v9, v1

    .line 147
    goto :goto_7

    .line 148
    :cond_a
    move v9, p1

    .line 149
    :goto_7
    const/16 v10, 0x33

    .line 150
    .line 151
    const/4 v1, 0x0

    .line 152
    const-wide/16 v2, 0x0

    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    const/4 v8, 0x0

    .line 156
    invoke-static/range {v0 .. v10}, Ljb1;->α(Ljb1;Ljava/time/LocalDate;JJIIIII)Ljb1;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :pswitch_1
    check-cast p1, Lid1;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iget-object p1, p1, Lid1;->ε:Ljava/lang/Integer;

    .line 167
    .line 168
    if-eqz p1, :cond_d

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_c

    .line 175
    .line 176
    iget-object p0, p0, Lnc1;->ζ:Ljava/lang/Long;

    .line 177
    .line 178
    if-eqz p0, :cond_b

    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 181
    .line 182
    .line 183
    move-result-wide v0

    .line 184
    int-to-long p0, p1

    .line 185
    cmp-long p0, v0, p0

    .line 186
    .line 187
    if-ltz p0, :cond_b

    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_b
    const/4 p0, 0x0

    .line 191
    goto :goto_9

    .line 192
    :cond_c
    :goto_8
    const/4 p0, 0x1

    .line 193
    :goto_9
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    goto :goto_a

    .line 198
    :cond_d
    const-string p0, "Required value was null."

    .line 199
    .line 200
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    const/4 p0, 0x0

    .line 204
    :goto_a
    return-object p0

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
