.class final Lcom/mr/elaris/InAppSettingsVisuals;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field static final COMMON_CARD_CORNER_RADIUS_DP:F = 16.0f


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static accentOf(Ljava/lang/String;)I
    .locals 2

    .line 1
    const-string v0, "groupfile"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0x70

    .line 10
    .line 11
    const/16 v0, 0xee

    .line 12
    .line 13
    const/16 v1, 0x24

    .line 14
    .line 15
    invoke-static {v1, p0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const-string v0, "chat_message"

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/16 p0, 0xa6

    .line 29
    .line 30
    const/16 v0, 0x68

    .line 31
    .line 32
    const/16 v1, 0x14

    .line 33
    .line 34
    invoke-static {v1, p0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_1
    const-string v0, "repeater"

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    const/16 p0, 0x9e

    .line 48
    .line 49
    const/16 v0, 0xb

    .line 50
    .line 51
    const/16 v1, 0xf5

    .line 52
    .line 53
    invoke-static {v1, p0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    return p0

    .line 58
    :cond_2
    const-string v0, "picture"

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    const/16 p0, 0x96

    .line 67
    .line 68
    const/16 v0, 0xae

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-static {v1, p0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0

    .line 76
    :cond_3
    const-string v0, "cleanse"

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    const/16 p0, 0x5c

    .line 85
    .line 86
    const/16 v0, 0xe0

    .line 87
    .line 88
    const/16 v1, 0x7e

    .line 89
    .line 90
    invoke-static {v1, p0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    return p0

    .line 95
    :cond_4
    const/16 p0, 0x74

    .line 96
    .line 97
    const/16 v0, 0x8b

    .line 98
    .line 99
    const/16 v1, 0x64

    .line 100
    .line 101
    invoke-static {v1, p0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    return p0
.end method

.method public static accentStrip(Lcom/mr/elaris/InAppSettings;I)Landroid/view/View;
    .locals 2

    .line 1
    new-instance v0, Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 9
    .line 10
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 14
    .line 15
    .line 16
    const/high16 p1, 0x40800000    # 4.0f

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    int-to-float p0, p0

    .line 23
    invoke-virtual {v1, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public static applyMainCardOutlineStroke(Lcom/mr/elaris/InAppSettings;Landroid/graphics/drawable/GradientDrawable;)V
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    sget v0, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 8
    .line 9
    invoke-virtual {p1, p0, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static applyThemePalette(Lcom/mr/elaris/InAppSettings;)V
    .locals 21

    .line 1
    invoke-static/range {p0 .. p0}, Lcom/mr/elaris/InAppSettingsVisuals;->shouldUseDarkTheme(Lcom/mr/elaris/InAppSettings;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/mr/elaris/InAppSettings;->setDarkUi(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x18

    .line 15
    .line 16
    const/16 v2, 0xf7

    .line 17
    .line 18
    const/16 v3, 0x1d

    .line 19
    .line 20
    const/16 v4, 0xff

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/16 v0, 0x11

    .line 25
    .line 26
    const/16 v5, 0x15

    .line 27
    .line 28
    const/16 v6, 0x10

    .line 29
    .line 30
    invoke-static {v6, v0, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const/16 v0, 0x25

    .line 35
    .line 36
    const/16 v5, 0x1f

    .line 37
    .line 38
    invoke-static {v3, v5, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    const/16 v0, 0x27

    .line 43
    .line 44
    const/16 v3, 0x2f

    .line 45
    .line 46
    const/16 v9, 0x24

    .line 47
    .line 48
    invoke-static {v9, v0, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    const/16 v0, 0xef

    .line 53
    .line 54
    const/16 v3, 0xf2

    .line 55
    .line 56
    invoke-static {v0, v3, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    const/16 v0, 0xab

    .line 61
    .line 62
    const/16 v2, 0xb7

    .line 63
    .line 64
    const/16 v3, 0xa5

    .line 65
    .line 66
    invoke-static {v3, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    const/16 v0, 0x3a

    .line 71
    .line 72
    const/16 v2, 0x44

    .line 73
    .line 74
    const/16 v3, 0x36

    .line 75
    .line 76
    invoke-static {v3, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 77
    .line 78
    .line 79
    move-result v12

    .line 80
    const/16 v0, 0x5c

    .line 81
    .line 82
    const/16 v2, 0xa4

    .line 83
    .line 84
    invoke-static {v0, v2, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    const/16 v0, 0xcd

    .line 89
    .line 90
    const/16 v2, 0xa3

    .line 91
    .line 92
    const/16 v3, 0x30

    .line 93
    .line 94
    invoke-static {v3, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const/16 v0, 0x9d

    .line 99
    .line 100
    const/16 v2, 0xae

    .line 101
    .line 102
    const/16 v3, 0x94

    .line 103
    .line 104
    invoke-static {v3, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 105
    .line 106
    .line 107
    move-result v15

    .line 108
    const/16 v0, 0x48

    .line 109
    .line 110
    const/16 v2, 0x58

    .line 111
    .line 112
    const/16 v3, 0x4c

    .line 113
    .line 114
    invoke-static {v0, v3, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 115
    .line 116
    .line 117
    move-result v16

    .line 118
    const/16 v0, 0x51

    .line 119
    .line 120
    const/16 v2, 0x5e

    .line 121
    .line 122
    invoke-static {v3, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 123
    .line 124
    .line 125
    move-result v17

    .line 126
    const/16 v0, 0x1a

    .line 127
    .line 128
    invoke-static {v1, v0, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 129
    .line 130
    .line 131
    move-result v18

    .line 132
    const/16 v0, 0x16

    .line 133
    .line 134
    const/16 v1, 0x1b

    .line 135
    .line 136
    const/16 v2, 0x14

    .line 137
    .line 138
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 139
    .line 140
    .line 141
    move-result v19

    .line 142
    const/16 v0, 0xf

    .line 143
    .line 144
    invoke-static {v0, v6, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 145
    .line 146
    .line 147
    move-result v20

    .line 148
    invoke-static/range {v7 .. v20}, Lcom/mr/elaris/InAppSettings;->setThemePalette(IIIIIIIIIIIIII)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_0
    const/16 v0, 0xfa

    .line 153
    .line 154
    const/16 v5, 0xfb

    .line 155
    .line 156
    const/16 v6, 0xfd

    .line 157
    .line 158
    invoke-static {v0, v5, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    invoke-static {v0, v5, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    const/16 v0, 0x19

    .line 171
    .line 172
    invoke-static {v1, v0, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    const/16 v0, 0x6c

    .line 177
    .line 178
    const/16 v1, 0x74

    .line 179
    .line 180
    const/16 v3, 0x69

    .line 181
    .line 182
    invoke-static {v3, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 183
    .line 184
    .line 185
    move-result v11

    .line 186
    const/16 v0, 0xed

    .line 187
    .line 188
    const/16 v1, 0xf1

    .line 189
    .line 190
    const/16 v3, 0xeb

    .line 191
    .line 192
    invoke-static {v3, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    const/16 v0, 0x34

    .line 197
    .line 198
    const/16 v1, 0x84

    .line 199
    .line 200
    invoke-static {v0, v1, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    const/16 v0, 0xbe

    .line 205
    .line 206
    const/16 v1, 0x8f

    .line 207
    .line 208
    const/16 v3, 0x22

    .line 209
    .line 210
    invoke-static {v3, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    const/16 v0, 0x7e

    .line 215
    .line 216
    const/16 v1, 0x8c

    .line 217
    .line 218
    const/16 v3, 0x76

    .line 219
    .line 220
    invoke-static {v3, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 221
    .line 222
    .line 223
    move-result v15

    .line 224
    const/16 v0, 0xea

    .line 225
    .line 226
    const/16 v1, 0xe8

    .line 227
    .line 228
    const/16 v3, 0xee

    .line 229
    .line 230
    invoke-static {v1, v0, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 231
    .line 232
    .line 233
    move-result v16

    .line 234
    const/16 v0, 0xe4

    .line 235
    .line 236
    invoke-static {v0, v1, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 237
    .line 238
    .line 239
    move-result v17

    .line 240
    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 241
    .line 242
    .line 243
    move-result v18

    .line 244
    const/16 v0, 0xfc

    .line 245
    .line 246
    invoke-static {v0, v6, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 247
    .line 248
    .line 249
    move-result v19

    .line 250
    const/16 v1, 0xf9

    .line 251
    .line 252
    invoke-static {v2, v1, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 253
    .line 254
    .line 255
    move-result v20

    .line 256
    invoke-static/range {v7 .. v20}, Lcom/mr/elaris/InAppSettings;->setThemePalette(IIIIIIIIIIIIII)V

    .line 257
    .line 258
    .line 259
    return-void
.end method

.method public static menuSoftPanel(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    sget v0, Lcom/mr/elaris/InAppSettings;->CARD:I

    .line 2
    .line 3
    const/high16 v1, 0x41800000    # 16.0f

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Lcom/mr/elaris/InAppSettingsVisuals;->round(II)Landroid/graphics/drawable/GradientDrawable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsVisuals;->applyMainCardOutlineStroke(Lcom/mr/elaris/InAppSettings;Landroid/graphics/drawable/GradientDrawable;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static mixForSurface(Lcom/mr/elaris/InAppSettings;IF)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Lcom/mr/elaris/InAppSettingsVisuals;->mixWithSurface(IF)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p1, p2}, Lcom/mr/elaris/InAppSettingsVisuals;->mixWithWhite(IF)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static mixWithSurface(IF)I
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    sub-float/2addr v0, p1

    .line 4
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    int-to-float v1, v1

    .line 9
    mul-float/2addr v1, v0

    .line 10
    sget v2, Lcom/mr/elaris/InAppSettings;->CARD:I

    .line 11
    .line 12
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    int-to-float v2, v2

    .line 17
    mul-float/2addr v2, p1

    .line 18
    add-float/2addr v2, v1

    .line 19
    float-to-int v1, v2

    .line 20
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    int-to-float v2, v2

    .line 25
    mul-float/2addr v2, v0

    .line 26
    sget v3, Lcom/mr/elaris/InAppSettings;->CARD:I

    .line 27
    .line 28
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    int-to-float v3, v3

    .line 33
    mul-float/2addr v3, p1

    .line 34
    add-float/2addr v3, v2

    .line 35
    float-to-int v2, v3

    .line 36
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    int-to-float p0, p0

    .line 41
    mul-float/2addr p0, v0

    .line 42
    sget v0, Lcom/mr/elaris/InAppSettings;->CARD:I

    .line 43
    .line 44
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    int-to-float v0, v0

    .line 49
    mul-float/2addr v0, p1

    .line 50
    add-float/2addr v0, p0

    .line 51
    float-to-int p0, v0

    .line 52
    invoke-static {v1, v2, p0}, Landroid/graphics/Color;->rgb(III)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0
.end method

.method public static mixWithWhite(IF)I
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    sub-float/2addr v0, p1

    .line 4
    const/high16 v1, 0x437f0000    # 255.0f

    .line 5
    .line 6
    mul-float/2addr p1, v1

    .line 7
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    int-to-float v1, v1

    .line 12
    mul-float/2addr v1, v0

    .line 13
    add-float/2addr v1, p1

    .line 14
    float-to-int v1, v1

    .line 15
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    int-to-float v2, v2

    .line 20
    mul-float/2addr v2, v0

    .line 21
    add-float/2addr v2, p1

    .line 22
    float-to-int v2, v2

    .line 23
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    int-to-float p0, p0

    .line 28
    mul-float/2addr p0, v0

    .line 29
    add-float/2addr p0, p1

    .line 30
    float-to-int p0, p0

    .line 31
    invoke-static {v1, v2, p0}, Landroid/graphics/Color;->rgb(III)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public static moduleListRowBackground(Lcom/mr/elaris/InAppSettings;II)Landroid/graphics/drawable/StateListDrawable;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsVisuals;->rowCornerRadii(Lcom/mr/elaris/InAppSettings;II)[F

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const p2, 0x10100a7

    .line 11
    .line 12
    .line 13
    filled-new-array {p2}, [I

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/16 v1, 0x2f

    .line 24
    .line 25
    const/16 v2, 0x38

    .line 26
    .line 27
    const/16 v3, 0x2b

    .line 28
    .line 29
    :goto_0
    invoke-static {v3, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/16 v1, 0xf1

    .line 35
    .line 36
    const/16 v2, 0xf5

    .line 37
    .line 38
    const/16 v3, 0xef

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :goto_1
    invoke-static {v1, p1}, Lcom/mr/elaris/InAppSettingsVisuals;->roundCorners(I[F)Landroid/graphics/drawable/GradientDrawable;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, p2, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    const p2, 0x10100a1

    .line 49
    .line 50
    .line 51
    filled-new-array {p2}, [I

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_1

    .line 60
    .line 61
    const/16 p0, 0x34

    .line 62
    .line 63
    const/16 v1, 0x3e

    .line 64
    .line 65
    const/16 v2, 0x30

    .line 66
    .line 67
    :goto_2
    invoke-static {v2, p0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    goto :goto_3

    .line 72
    :cond_1
    const/16 p0, 0xf4

    .line 73
    .line 74
    const/16 v1, 0xf7

    .line 75
    .line 76
    const/16 v2, 0xf2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :goto_3
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsVisuals;->roundCorners(I[F)Landroid/graphics/drawable/GradientDrawable;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {v0, p2, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    new-array p1, p0, [I

    .line 88
    .line 89
    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    .line 90
    .line 91
    invoke-direct {p2, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 95
    .line 96
    .line 97
    return-object v0
.end method

.method public static round(II)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 11
    .line 12
    .line 13
    int-to-float p0, p1

    .line 14
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static roundCorners(I[F)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static roundWithStroke(Lcom/mr/elaris/InAppSettings;IIII)Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/mr/elaris/InAppSettingsVisuals;->round(II)Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    int-to-float p2, p4

    .line 6
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-virtual {p1, p0, p3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 11
    .line 12
    .line 13
    return-object p1
.end method

.method public static rowBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/StateListDrawable;
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x41880000    # 17.0f

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const v2, 0x10100a7

    .line 13
    .line 14
    .line 15
    filled-new-array {v2}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    const/16 v3, 0x2f

    .line 26
    .line 27
    const/16 v4, 0x38

    .line 28
    .line 29
    const/16 v5, 0x2b

    .line 30
    .line 31
    :goto_0
    invoke-static {v5, v3, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const/16 v3, 0xf1

    .line 37
    .line 38
    const/16 v4, 0xf5

    .line 39
    .line 40
    const/16 v5, 0xef

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :goto_1
    invoke-static {v3, v1}, Lcom/mr/elaris/InAppSettingsVisuals;->round(II)Landroid/graphics/drawable/GradientDrawable;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v0, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    const v2, 0x10100a1

    .line 51
    .line 52
    .line 53
    filled-new-array {v2}, [I

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    const/16 p0, 0x34

    .line 64
    .line 65
    const/16 v3, 0x3e

    .line 66
    .line 67
    const/16 v4, 0x30

    .line 68
    .line 69
    :goto_2
    invoke-static {v4, p0, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    goto :goto_3

    .line 74
    :cond_1
    const/16 p0, 0xf4

    .line 75
    .line 76
    const/16 v3, 0xf7

    .line 77
    .line 78
    const/16 v4, 0xf2

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :goto_3
    invoke-static {p0, v1}, Lcom/mr/elaris/InAppSettingsVisuals;->round(II)Landroid/graphics/drawable/GradientDrawable;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {v0, v2, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    new-array v1, p0, [I

    .line 90
    .line 91
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 92
    .line 93
    invoke-direct {v2, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method

.method private static rowCornerRadii(Lcom/mr/elaris/InAppSettings;II)[F
    .locals 9

    .line 1
    const/high16 v0, 0x41800000    # 16.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    int-to-float p0, p0

    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-gtz p1, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v0

    .line 15
    :goto_0
    sub-int/2addr p2, v1

    .line 16
    if-lt p1, p2, :cond_1

    .line 17
    .line 18
    move p1, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move p1, v0

    .line 21
    :goto_1
    const/4 p2, 0x0

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    move v3, p0

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move v3, p2

    .line 27
    :goto_2
    if-eqz v2, :cond_3

    .line 28
    .line 29
    move v4, p0

    .line 30
    goto :goto_3

    .line 31
    :cond_3
    move v4, p2

    .line 32
    :goto_3
    if-eqz v2, :cond_4

    .line 33
    .line 34
    move v5, p0

    .line 35
    goto :goto_4

    .line 36
    :cond_4
    move v5, p2

    .line 37
    :goto_4
    if-eqz v2, :cond_5

    .line 38
    .line 39
    move v2, p0

    .line 40
    goto :goto_5

    .line 41
    :cond_5
    move v2, p2

    .line 42
    :goto_5
    if-eqz p1, :cond_6

    .line 43
    .line 44
    move v6, p0

    .line 45
    goto :goto_6

    .line 46
    :cond_6
    move v6, p2

    .line 47
    :goto_6
    if-eqz p1, :cond_7

    .line 48
    .line 49
    move v7, p0

    .line 50
    goto :goto_7

    .line 51
    :cond_7
    move v7, p2

    .line 52
    :goto_7
    if-eqz p1, :cond_8

    .line 53
    .line 54
    move v8, p0

    .line 55
    goto :goto_8

    .line 56
    :cond_8
    move v8, p2

    .line 57
    :goto_8
    if-eqz p1, :cond_9

    .line 58
    .line 59
    goto :goto_9

    .line 60
    :cond_9
    move p0, p2

    .line 61
    :goto_9
    const/16 p1, 0x8

    .line 62
    .line 63
    new-array p1, p1, [F

    .line 64
    .line 65
    aput v3, p1, v0

    .line 66
    .line 67
    aput v4, p1, v1

    .line 68
    .line 69
    const/4 p2, 0x2

    .line 70
    aput v5, p1, p2

    .line 71
    .line 72
    const/4 p2, 0x3

    .line 73
    aput v2, p1, p2

    .line 74
    .line 75
    const/4 p2, 0x4

    .line 76
    aput v6, p1, p2

    .line 77
    .line 78
    const/4 p2, 0x5

    .line 79
    aput v7, p1, p2

    .line 80
    .line 81
    const/4 p2, 0x6

    .line 82
    aput v8, p1, p2

    .line 83
    .line 84
    const/4 p2, 0x7

    .line 85
    aput p0, p1, p2

    .line 86
    .line 87
    return-object p1
.end method

.method public static shouldUseDarkTheme(Lcom/mr/elaris/InAppSettings;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->themeMode()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dark"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    const-string v1, "light"

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    :try_start_0
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    and-int/lit8 p0, p0, 0x30

    .line 38
    .line 39
    const/16 v0, 0x20

    .line 40
    .line 41
    if-ne p0, v0, :cond_2

    .line 42
    .line 43
    return v2

    .line 44
    :catchall_0
    :cond_2
    return v1
.end method
