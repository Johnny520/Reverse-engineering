.class public final synthetic Lf0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lxk1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lf0;->i:Lxk1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lf0;->h:I

    .line 2
    .line 3
    sget-object v1, Lfe0;->h:Lfe0;

    .line 4
    .line 5
    const-string v2, "Required value was null."

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    sget-object v4, La83;->a:La83;

    .line 9
    .line 10
    iget-object p0, p0, Lf0;->i:Lxk1;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    xor-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-object v4

    .line 35
    :pswitch_0
    new-instance v0, Ls81;

    .line 36
    .line 37
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lin0;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Ls81;-><init>(Lin0;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_1
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Lxm0;

    .line 52
    .line 53
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Lt81;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_2
    invoke-interface {p0, v3}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-object v4

    .line 64
    :pswitch_3
    const-string v0, ""

    .line 65
    .line 66
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object v4

    .line 70
    :pswitch_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object v4

    .line 76
    :pswitch_5
    invoke-static {p0}, Lnuke/ui/HomeActivity;->k(Lxk1;)La83;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_6
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-object v4

    .line 97
    :pswitch_8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-object v4

    .line 103
    :pswitch_9
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-object v4

    .line 109
    :pswitch_a
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-object v4

    .line 115
    :pswitch_b
    invoke-interface {p0, v3}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return-object v4

    .line 119
    :pswitch_c
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, Lc61;

    .line 124
    .line 125
    if-eqz p0, :cond_0

    .line 126
    .line 127
    move-object v3, p0

    .line 128
    goto :goto_0

    .line 129
    :cond_0
    invoke-static {v2}, Lnz0;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Ls;->b()V

    .line 133
    .line 134
    .line 135
    :goto_0
    return-object v3

    .line 136
    :pswitch_d
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-object v4

    .line 142
    :pswitch_e
    invoke-interface {p0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-object v4

    .line 146
    :pswitch_f
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    return-object v4

    .line 152
    :pswitch_10
    invoke-interface {p0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return-object v4

    .line 156
    :pswitch_11
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    return-object v4

    .line 162
    :pswitch_12
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return-object v4

    .line 168
    :pswitch_13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 169
    .line 170
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    return-object v4

    .line 174
    :pswitch_14
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object v4

    .line 180
    :pswitch_15
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 181
    .line 182
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    return-object v4

    .line 186
    :pswitch_16
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 187
    .line 188
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    return-object v4

    .line 192
    :pswitch_17
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    check-cast p0, Lc61;

    .line 197
    .line 198
    if-eqz p0, :cond_1

    .line 199
    .line 200
    move-object v3, p0

    .line 201
    goto :goto_1

    .line 202
    :cond_1
    invoke-static {v2}, Lnz0;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 203
    .line 204
    .line 205
    invoke-static {}, Ls;->b()V

    .line 206
    .line 207
    .line 208
    :goto_1
    return-object v3

    .line 209
    :pswitch_18
    invoke-interface {p0, v3}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    return-object v4

    .line 213
    :pswitch_19
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 214
    .line 215
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    return-object v4

    .line 219
    :pswitch_1a
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    return-object v4

    .line 225
    :pswitch_1b
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 226
    .line 227
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    return-object v4

    .line 231
    :pswitch_1c
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 232
    .line 233
    invoke-interface {p0, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    return-object v4

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
