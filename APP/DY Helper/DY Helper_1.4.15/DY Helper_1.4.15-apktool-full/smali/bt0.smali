.class public final synthetic Lbt0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lps0;

.field public final synthetic η:Landroid/view/View;

.field public final synthetic θ:Lg21;

.field public final synthetic ι:Lg21;

.field public final synthetic κ:Lg21;


# direct methods
.method public synthetic constructor <init>(Lps0;Landroid/view/View;Lg21;Lg21;Lg21;I)V
    .locals 0

    .line 1
    iput p6, p0, Lbt0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lbt0;->ζ:Lps0;

    .line 4
    .line 5
    iput-object p2, p0, Lbt0;->η:Landroid/view/View;

    .line 6
    .line 7
    iput-object p3, p0, Lbt0;->θ:Lg21;

    .line 8
    .line 9
    iput-object p4, p0, Lbt0;->ι:Lg21;

    .line 10
    .line 11
    iput-object p5, p0, Lbt0;->κ:Lg21;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lbt0;->ε:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Float;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lbt0;->θ:Lg21;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljx0;->в(F)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v0, p0, Lbt0;->ζ:Lps0;

    .line 22
    .line 23
    iget-object v0, v0, Lps0;->α:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {v0}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p1, v0}, Lj81;->ν(ILxm0;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, Lbt0;->ι:Lg21;

    .line 38
    .line 39
    invoke-interface {v1, v0}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lbt0;->κ:Lg21;

    .line 43
    .line 44
    invoke-interface {v0}, Lc02;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/lang/Integer;

    .line 49
    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eq v1, p1, :cond_1

    .line 58
    .line 59
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {v0, p1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x4

    .line 67
    iget-object p0, p0, Lbt0;->η:Landroid/view/View;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 70
    .line 71
    .line 72
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget-object v1, p0, Lbt0;->θ:Lg21;

    .line 80
    .line 81
    invoke-interface {v1, p1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Ljx0;->в(F)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    iget-object v0, p0, Lbt0;->ζ:Lps0;

    .line 89
    .line 90
    iget-object v0, v0, Lps0;->α:Ljava/util/List;

    .line 91
    .line 92
    invoke-static {v0}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {p1, v0}, Lj81;->ν(ILxm0;)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object v0, p0, Lbt0;->ι:Lg21;

    .line 105
    .line 106
    invoke-interface {v0, p1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v0}, Lc02;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Ljava/lang/Integer;

    .line 114
    .line 115
    iget-object v0, p0, Lbt0;->κ:Lg21;

    .line 116
    .line 117
    invoke-interface {v0, p1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const/4 p1, 0x0

    .line 121
    iget-object p0, p0, Lbt0;->η:Landroid/view/View;

    .line 122
    .line 123
    invoke-virtual {p0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 124
    .line 125
    .line 126
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    iget-object v1, p0, Lbt0;->θ:Lg21;

    .line 134
    .line 135
    invoke-interface {v1, p1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, Ljx0;->в(F)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    iget-object v0, p0, Lbt0;->ζ:Lps0;

    .line 143
    .line 144
    iget-object v0, v0, Lps0;->α:Ljava/util/List;

    .line 145
    .line 146
    invoke-static {v0}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {p1, v0}, Lj81;->ν(ILxm0;)I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-object v1, p0, Lbt0;->ι:Lg21;

    .line 159
    .line 160
    invoke-interface {v1, v0}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Lbt0;->κ:Lg21;

    .line 164
    .line 165
    invoke-interface {v0}, Lc02;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    check-cast v1, Ljava/lang/Integer;

    .line 170
    .line 171
    if-nez v1, :cond_2

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eq v1, p1, :cond_3

    .line 179
    .line 180
    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-interface {v0, p1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    const/4 p1, 0x4

    .line 188
    iget-object p0, p0, Lbt0;->η:Landroid/view/View;

    .line 189
    .line 190
    invoke-virtual {p0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 191
    .line 192
    .line 193
    :cond_3
    sget-object p0, Ls62;->α:Ls62;

    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    iget-object v1, p0, Lbt0;->θ:Lg21;

    .line 201
    .line 202
    invoke-interface {v1, p1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v0}, Ljx0;->в(F)I

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    iget-object v0, p0, Lbt0;->ζ:Lps0;

    .line 210
    .line 211
    iget-object v0, v0, Lps0;->α:Ljava/util/List;

    .line 212
    .line 213
    invoke-static {v0}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {p1, v0}, Lj81;->ν(ILxm0;)I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iget-object v0, p0, Lbt0;->ι:Lg21;

    .line 226
    .line 227
    invoke-interface {v0, p1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v0}, Lc02;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    check-cast p1, Ljava/lang/Integer;

    .line 235
    .line 236
    iget-object v0, p0, Lbt0;->κ:Lg21;

    .line 237
    .line 238
    invoke-interface {v0, p1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    const/4 p1, 0x0

    .line 242
    iget-object p0, p0, Lbt0;->η:Landroid/view/View;

    .line 243
    .line 244
    invoke-virtual {p0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 245
    .line 246
    .line 247
    goto :goto_1

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
