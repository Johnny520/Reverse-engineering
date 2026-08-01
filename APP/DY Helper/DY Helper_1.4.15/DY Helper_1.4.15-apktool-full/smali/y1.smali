.class public final Ly1;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Ly1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ly1;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ly1;->η:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ly1;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Ls62;->α:Ls62;

    .line 6
    .line 7
    iget-object v4, p0, Ly1;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Ly1;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Lde;

    .line 15
    .line 16
    check-cast p2, Lwa0;

    .line 17
    .line 18
    check-cast p0, Lq31;

    .line 19
    .line 20
    iget-object v0, p0, Lq31;->σ:Lyp0;

    .line 21
    .line 22
    invoke-virtual {v0}, Lyp0;->Θ()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    iput-object p1, p0, Lq31;->Ν:Lde;

    .line 29
    .line 30
    iput-object p2, p0, Lq31;->Μ:Lwa0;

    .line 31
    .line 32
    invoke-static {v0}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()Ly81;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object p2, Lq31;->Σ:Lio1;

    .line 41
    .line 42
    sget-object p2, La1;->π:La1;

    .line 43
    .line 44
    check-cast v4, Ln31;

    .line 45
    .line 46
    iget-object p1, p1, Ly81;->α:Lkx1;

    .line 47
    .line 48
    invoke-virtual {p1, p0, p2, v4}, Lkx1;->β(Ljava/lang/Object;La80;Lp70;)V

    .line 49
    .line 50
    .line 51
    iput-boolean v2, p0, Lq31;->Π:Z

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iput-boolean v1, p0, Lq31;->Π:Z

    .line 55
    .line 56
    :goto_0
    return-object v3

    .line 57
    :pswitch_0
    check-cast p1, Lv80;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    and-int/lit8 v0, p2, 0x3

    .line 66
    .line 67
    const/4 v5, 0x2

    .line 68
    if-eq v0, v5, :cond_1

    .line 69
    .line 70
    move v0, v1

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move v0, v2

    .line 73
    :goto_1
    and-int/2addr p2, v1

    .line 74
    invoke-virtual {p1, p2, v0}, Lv80;->Ξ(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-eqz p2, :cond_8

    .line 79
    .line 80
    check-cast p0, Ldq0;

    .line 81
    .line 82
    iget-object p0, p0, Ldq0;->ζ:Lx91;

    .line 83
    .line 84
    invoke-virtual {p0}, Lx91;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    check-cast v4, Lan;

    .line 95
    .line 96
    iget-boolean v0, p1, Lv80;->Φ:Z

    .line 97
    .line 98
    const/16 v5, 0xcf

    .line 99
    .line 100
    if-nez v0, :cond_2

    .line 101
    .line 102
    iget-object v0, p1, Lv80;->Ι:Lnw1;

    .line 103
    .line 104
    invoke-virtual {v0}, Lnw1;->η()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-ne v0, v5, :cond_2

    .line 109
    .line 110
    iget-object v0, p1, Lv80;->Ι:Lnw1;

    .line 111
    .line 112
    invoke-virtual {v0}, Lnw1;->ζ()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_2

    .line 121
    .line 122
    iget v0, p1, Lv80;->Β:I

    .line 123
    .line 124
    if-gez v0, :cond_2

    .line 125
    .line 126
    iget-object v0, p1, Lv80;->Ι:Lnw1;

    .line 127
    .line 128
    iget v0, v0, Lnw1;->η:I

    .line 129
    .line 130
    iput v0, p1, Lv80;->Β:I

    .line 131
    .line 132
    iput-boolean v1, p1, Lv80;->Α:Z

    .line 133
    .line 134
    :cond_2
    const/4 v0, 0x0

    .line 135
    invoke-virtual {p1, v5, v0, v2, p0}, Lv80;->Σ(ILi51;ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, p2}, Lv80;->ζ(Z)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-eqz p2, :cond_3

    .line 143
    .line 144
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {v4, p1, p0}, Lan;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_3
    iget p2, p1, Lv80;->μ:I

    .line 153
    .line 154
    if-nez p2, :cond_4

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_4
    const-string p2, "No nodes can be emitted before calling deactivateToEndGroup"

    .line 158
    .line 159
    invoke-static {p2}, Lsn;->α(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :goto_2
    iget-boolean p2, p1, Lv80;->Φ:Z

    .line 163
    .line 164
    if-nez p2, :cond_6

    .line 165
    .line 166
    if-nez p0, :cond_5

    .line 167
    .line 168
    invoke-virtual {p1}, Lv80;->Π()V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_5
    iget-object p0, p1, Lv80;->Ι:Lnw1;

    .line 173
    .line 174
    iget p2, p0, Lnw1;->η:I

    .line 175
    .line 176
    iget p0, p0, Lnw1;->θ:I

    .line 177
    .line 178
    iget-object v0, p1, Lv80;->Ο:Lrn;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v2}, Lrn;->δ(Z)V

    .line 184
    .line 185
    .line 186
    iget-object v0, v0, Lrn;->β:Lke;

    .line 187
    .line 188
    iget-object v0, v0, Lke;->π:Lh81;

    .line 189
    .line 190
    sget-object v1, Lo51;->γ:Lo51;

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Lh81;->Θ(Lo61;)V

    .line 193
    .line 194
    .line 195
    iget-object v0, p1, Lv80;->τ:Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-static {v0, p2, p0}, Lln0;->ε(Ljava/util/List;II)V

    .line 198
    .line 199
    .line 200
    iget-object p0, p1, Lv80;->Ι:Lnw1;

    .line 201
    .line 202
    invoke-virtual {p0}, Lnw1;->υ()V

    .line 203
    .line 204
    .line 205
    :cond_6
    :goto_3
    iget-boolean p0, p1, Lv80;->Α:Z

    .line 206
    .line 207
    if-eqz p0, :cond_7

    .line 208
    .line 209
    iget-object p0, p1, Lv80;->Ι:Lnw1;

    .line 210
    .line 211
    iget p0, p0, Lnw1;->ι:I

    .line 212
    .line 213
    iget p2, p1, Lv80;->Β:I

    .line 214
    .line 215
    if-ne p0, p2, :cond_7

    .line 216
    .line 217
    const/4 p0, -0x1

    .line 218
    iput p0, p1, Lv80;->Β:I

    .line 219
    .line 220
    iput-boolean v2, p1, Lv80;->Α:Z

    .line 221
    .line 222
    :cond_7
    invoke-virtual {p1, v2}, Lv80;->ο(Z)V

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_8
    invoke-virtual {p1}, Lv80;->Ρ()V

    .line 227
    .line 228
    .line 229
    :goto_4
    return-object v3

    .line 230
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    check-cast p2, Lbs1;

    .line 237
    .line 238
    check-cast v4, Lz1;

    .line 239
    .line 240
    check-cast p0, Lcs1;

    .line 241
    .line 242
    iget-object p0, p0, Lcs1;->β:Lo11;

    .line 243
    .line 244
    iget v0, p2, Lbs1;->ζ:I

    .line 245
    .line 246
    invoke-virtual {p0, v0}, Lo11;->β(I)Z

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    if-nez p0, :cond_9

    .line 251
    .line 252
    invoke-virtual {v4, p1, p2}, Lz1;->μ(ILbs1;)V

    .line 253
    .line 254
    .line 255
    iget-object p0, v4, Lz1;->μ:Lwc;

    .line 256
    .line 257
    invoke-interface {p0, v3}, Lqs1;->μ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    :cond_9
    return-object v3

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
