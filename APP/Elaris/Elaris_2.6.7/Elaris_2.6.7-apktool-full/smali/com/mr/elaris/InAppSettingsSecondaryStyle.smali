.class final Lcom/mr/elaris/InAppSettingsSecondaryStyle;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field static final ACCENT_STRIP_HEIGHT_DP:F = 36.0f

.field static final BUTTON_BACKGROUND:I

.field static final BUTTON_TEXT_COLOR:I

.field static final CARD_AMBIENT_SHADOW_COLOR:I

.field static final CARD_BACKGROUND:I = -0x1

.field static final CARD_CORNER_RADIUS_DP:F = 16.0f

.field static final CARD_ELEVATION_DP:F = 1.0f

.field static final CARD_GAP_DP:F = 10.0f

.field static final CARD_HORIZONTAL_PADDING_DP:F = 18.0f

.field static final CARD_SPOT_SHADOW_COLOR:I

.field static final CARD_VERTICAL_PADDING_DP:F = 6.0f

.field static final COMPACT_DESC_SIZE_SP:F = 12.0f

.field static final CONTROL_CORNER_RADIUS_DP:F = 12.0f

.field static final CONTROL_GAP_DP:F = 6.0f

.field static final CONTROL_HEIGHT_DP:F = 36.0f

.field static final CONTROL_STROKE_COLOR:I

.field static final DIVIDER_COLOR:I

.field static final INPUT_STROKE_COLOR:I

.field static final ITEM_DESC_COLOR:I

.field static final ITEM_DESC_SIZE_SP:F = 12.0f

.field static final ITEM_HEIGHT_NORMAL_DP:F = 61.0f

.field static final ITEM_HEIGHT_TWO_LINE_DP:F = 72.0f

.field static final ITEM_TITLE_COLOR:I

.field static final ITEM_TITLE_DESC_GAP_DP:F = 4.0f

.field static final ITEM_TITLE_SIZE_SP:F = 15.0f

.field static final PAGE_BACKGROUND:I

.field static final PAGE_HORIZONTAL_PADDING_DP:F = 18.0f

.field static final STATUS_BLUE_BACKGROUND:I

.field static final STATUS_GREEN_BACKGROUND:I

.field static final STATUS_GREEN_STROKE:I

.field static final STATUS_GREEN_TEXT_COLOR:I

.field static final SUBTITLE_CARD_GAP_DP:F = 15.0f

.field static final SUBTITLE_COLOR:I

.field static final SUBTITLE_SIZE_SP:F = 13.0f

.field static final SWITCH_HEIGHT_DP:F = 22.0f

.field static final SWITCH_OFF_COLOR:I

.field static final SWITCH_THUMB_COLOR:I = -0x1

.field static final SWITCH_THUMB_SIZE_DP:F = 17.0f

.field static final SWITCH_WIDTH_DP:F = 40.0f

.field static final TITLE_COLOR:I

.field static final TITLE_SIZE_SP:F = 24.0f

.field static final TITLE_SUBTITLE_GAP_DP:F = 4.0f

.field static final TITLE_TOP_OFFSET_DP:F = 18.0f


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0xfc

    .line 2
    .line 3
    const/16 v1, 0xf8

    .line 4
    .line 5
    const/16 v2, 0xfa

    .line 6
    .line 7
    invoke-static {v1, v2, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->PAGE_BACKGROUND:I

    .line 12
    .line 13
    const/16 v0, 0x18

    .line 14
    .line 15
    const/16 v1, 0x27

    .line 16
    .line 17
    const/16 v3, 0x11

    .line 18
    .line 19
    invoke-static {v3, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->TITLE_COLOR:I

    .line 24
    .line 25
    const/16 v1, 0x72

    .line 26
    .line 27
    const/16 v3, 0x80

    .line 28
    .line 29
    const/16 v4, 0x6b

    .line 30
    .line 31
    invoke-static {v4, v1, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    sput v1, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->SUBTITLE_COLOR:I

    .line 36
    .line 37
    const/16 v3, 0x8

    .line 38
    .line 39
    const/16 v4, 0x94

    .line 40
    .line 41
    const/16 v5, 0xa3

    .line 42
    .line 43
    const/16 v6, 0xb8

    .line 44
    .line 45
    invoke-static {v3, v4, v5, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    sput v3, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->CARD_AMBIENT_SHADOW_COLOR:I

    .line 50
    .line 51
    const/4 v3, 0x6

    .line 52
    invoke-static {v3, v4, v5, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    sput v3, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->CARD_SPOT_SHADOW_COLOR:I

    .line 57
    .line 58
    sput v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->ITEM_TITLE_COLOR:I

    .line 59
    .line 60
    sput v1, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->ITEM_DESC_COLOR:I

    .line 61
    .line 62
    const/16 v0, 0xec

    .line 63
    .line 64
    const/16 v1, 0xf2

    .line 65
    .line 66
    const/16 v3, 0xe8

    .line 67
    .line 68
    invoke-static {v3, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    sput v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->DIVIDER_COLOR:I

    .line 73
    .line 74
    const/16 v0, 0xeb

    .line 75
    .line 76
    const/16 v1, 0xe5

    .line 77
    .line 78
    const/16 v3, 0xe7

    .line 79
    .line 80
    invoke-static {v1, v3, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    sput v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->SWITCH_OFF_COLOR:I

    .line 85
    .line 86
    const/16 v0, 0xd8

    .line 87
    .line 88
    const/16 v4, 0xf7

    .line 89
    .line 90
    const/16 v5, 0xc4

    .line 91
    .line 92
    invoke-static {v5, v0, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    sput v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->CONTROL_STROKE_COLOR:I

    .line 97
    .line 98
    const/16 v0, 0xe3

    .line 99
    .line 100
    const/16 v4, 0xed

    .line 101
    .line 102
    invoke-static {v0, v3, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    sput v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->INPUT_STROKE_COLOR:I

    .line 107
    .line 108
    const/16 v0, 0xf6

    .line 109
    .line 110
    const/16 v3, 0xff

    .line 111
    .line 112
    invoke-static {v0, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    sput v4, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->BUTTON_BACKGROUND:I

    .line 117
    .line 118
    const/16 v4, 0x2f

    .line 119
    .line 120
    const/16 v5, 0x7d

    .line 121
    .line 122
    invoke-static {v4, v5, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    sput v4, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->BUTTON_TEXT_COLOR:I

    .line 127
    .line 128
    invoke-static {v0, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    sput v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->STATUS_BLUE_BACKGROUND:I

    .line 133
    .line 134
    const/16 v0, 0xf9

    .line 135
    .line 136
    const/16 v2, 0xf5

    .line 137
    .line 138
    const/16 v3, 0xee

    .line 139
    .line 140
    invoke-static {v3, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    sput v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->STATUS_GREEN_BACKGROUND:I

    .line 145
    .line 146
    const/16 v0, 0xd2

    .line 147
    .line 148
    const/16 v2, 0xef

    .line 149
    .line 150
    invoke-static {v0, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    sput v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->STATUS_GREEN_STROKE:I

    .line 155
    .line 156
    const/16 v0, 0xad

    .line 157
    .line 158
    const/16 v1, 0x7b

    .line 159
    .line 160
    const/16 v2, 0x2e

    .line 161
    .line 162
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    sput v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->STATUS_GREEN_TEXT_COLOR:I

    .line 167
    .line 168
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static buttonBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget v0, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 8
    .line 9
    const v1, 0x3f666666    # 0.9f

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->BUTTON_BACKGROUND:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    sget v1, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 26
    .line 27
    const v2, 0x3f1eb852    # 0.62f

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1, v2}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    sget v1, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->CONTROL_STROKE_COLOR:I

    .line 36
    .line 37
    :goto_1
    invoke-static {p0, v0, v1}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->thinStrokeRound(Lcom/mr/elaris/InAppSettings;II)Landroid/graphics/drawable/GradientDrawable;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static cardBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->cardColor(Lcom/mr/elaris/InAppSettings;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x41800000    # 16.0f

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, Lcom/mr/elaris/InAppSettingsVisuals;->round(II)Landroid/graphics/drawable/GradientDrawable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsVisuals;->applyMainCardOutlineStroke(Lcom/mr/elaris/InAppSettings;Landroid/graphics/drawable/GradientDrawable;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static cardColor(Lcom/mr/elaris/InAppSettings;)I
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
    sget p0, Lcom/mr/elaris/InAppSettings;->CARD:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, -0x1

    .line 11
    return p0
.end method

.method public static dividerColor(Lcom/mr/elaris/InAppSettings;)I
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
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->lineColor()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    sget p0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->DIVIDER_COLOR:I

    .line 13
    .line 14
    return p0
.end method

.method public static inputBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->cardColor(Lcom/mr/elaris/InAppSettings;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget v1, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget v1, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->INPUT_STROKE_COLOR:I

    .line 15
    .line 16
    :goto_0
    invoke-static {p0, v0, v1}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->thinStrokeRound(Lcom/mr/elaris/InAppSettings;II)Landroid/graphics/drawable/GradientDrawable;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static pageBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->pageColor(Lcom/mr/elaris/InAppSettings;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsVisuals;->round(II)Landroid/graphics/drawable/GradientDrawable;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static pageColor(Lcom/mr/elaris/InAppSettings;)I
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
    sget p0, Lcom/mr/elaris/InAppSettings;->BG:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    sget p0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->PAGE_BACKGROUND:I

    .line 11
    .line 12
    return p0
.end method

.method public static statusBackground(Lcom/mr/elaris/InAppSettings;Z)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->isDarkUi()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget p1, Lcom/mr/elaris/InAppSettings;->GREEN:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget p1, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 13
    .line 14
    :goto_0
    const v0, 0x3f6147ae    # 0.88f

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v1, 0x3f23d70a    # 0.64f

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v1}, Lcom/mr/elaris/InAppSettings;->mixForSurface(IF)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    sget v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->STATUS_GREEN_BACKGROUND:I

    .line 32
    .line 33
    sget p1, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->STATUS_GREEN_STROKE:I

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    sget v0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->STATUS_BLUE_BACKGROUND:I

    .line 37
    .line 38
    sget p1, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->CONTROL_STROKE_COLOR:I

    .line 39
    .line 40
    :goto_1
    invoke-static {p0, v0, p1}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->thinStrokeRound(Lcom/mr/elaris/InAppSettings;II)Landroid/graphics/drawable/GradientDrawable;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static subtitleColor(Lcom/mr/elaris/InAppSettings;)I
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
    sget p0, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    sget p0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->SUBTITLE_COLOR:I

    .line 11
    .line 12
    return p0
.end method

.method private static thinStrokeRound(Lcom/mr/elaris/InAppSettings;II)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    const/high16 v0, 0x41400000    # 12.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {p1, p0}, Lcom/mr/elaris/InAppSettingsVisuals;->round(II)Landroid/graphics/drawable/GradientDrawable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static titleColor(Lcom/mr/elaris/InAppSettings;)I
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
    sget p0, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    sget p0, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->TITLE_COLOR:I

    .line 11
    .line 12
    return p0
.end method
