.class public final Lcom/mr/elaris/ElarisStatusActivity;
.super Landroid/app/Activity;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static final BLUE:I

.field private static final CARD:I = -0x1

.field private static final GREEN:I

.field private static final LINE:I

.field private static final ORANGE:I

.field private static final PAGE:I

.field private static final PURPLE:I

.field private static final ROSE:I

.field private static final STROKE:I

.field private static final SUB:I

.field private static final TEXT:I


# instance fields
.field private firstResume:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0xfa

    .line 2
    .line 3
    const/16 v1, 0xfc

    .line 4
    .line 5
    const/16 v2, 0xf8

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lcom/mr/elaris/ElarisStatusActivity;->PAGE:I

    .line 12
    .line 13
    const/16 v0, 0x18

    .line 14
    .line 15
    const/16 v1, 0x27

    .line 16
    .line 17
    const/16 v2, 0x11

    .line 18
    .line 19
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lcom/mr/elaris/ElarisStatusActivity;->TEXT:I

    .line 24
    .line 25
    const/16 v0, 0x72

    .line 26
    .line 27
    const/16 v1, 0x80

    .line 28
    .line 29
    const/16 v2, 0x6b

    .line 30
    .line 31
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sput v0, Lcom/mr/elaris/ElarisStatusActivity;->SUB:I

    .line 36
    .line 37
    const/16 v0, 0xec

    .line 38
    .line 39
    const/16 v1, 0xf2

    .line 40
    .line 41
    const/16 v2, 0xe8

    .line 42
    .line 43
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    sput v0, Lcom/mr/elaris/ElarisStatusActivity;->LINE:I

    .line 48
    .line 49
    const/16 v0, 0xe4

    .line 50
    .line 51
    const/16 v1, 0xee

    .line 52
    .line 53
    invoke-static {v0, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    sput v0, Lcom/mr/elaris/ElarisStatusActivity;->STROKE:I

    .line 58
    .line 59
    const/16 v0, 0xf6

    .line 60
    .line 61
    const/16 v1, 0x2f

    .line 62
    .line 63
    const/16 v2, 0x8b

    .line 64
    .line 65
    invoke-static {v1, v2, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    sput v0, Lcom/mr/elaris/ElarisStatusActivity;->BLUE:I

    .line 70
    .line 71
    const/16 v0, 0xad

    .line 72
    .line 73
    const/16 v1, 0x7b

    .line 74
    .line 75
    const/16 v3, 0x2e

    .line 76
    .line 77
    invoke-static {v3, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    sput v0, Lcom/mr/elaris/ElarisStatusActivity;->GREEN:I

    .line 82
    .line 83
    const/16 v0, 0xff

    .line 84
    .line 85
    const/16 v1, 0x22

    .line 86
    .line 87
    invoke-static {v0, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    sput v0, Lcom/mr/elaris/ElarisStatusActivity;->ORANGE:I

    .line 92
    .line 93
    const/16 v0, 0x7e

    .line 94
    .line 95
    const/16 v1, 0x5c

    .line 96
    .line 97
    const/16 v2, 0xe0

    .line 98
    .line 99
    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    sput v0, Lcom/mr/elaris/ElarisStatusActivity;->PURPLE:I

    .line 104
    .line 105
    const/16 v0, 0x4e

    .line 106
    .line 107
    const/16 v1, 0x77

    .line 108
    .line 109
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    sput v0, Lcom/mr/elaris/ElarisStatusActivity;->ROSE:I

    .line 114
    .line 115
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/mr/elaris/ElarisStatusActivity;->firstResume:Z

    .line 6
    .line 7
    return-void
.end method

.method public static bridge synthetic a(Lcom/mr/elaris/ElarisStatusActivity;)V
    .locals 1

    .line 1
    const-string v0, "https://t.me/Elaris_mod"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/mr/elaris/ElarisStatusActivity;->openExternalLink(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private addDivider(Landroid/widget/LinearLayout;)V
    .locals 9

    .line 1
    new-instance v0, Landroid/view/View;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sget v1, Lcom/mr/elaris/ElarisStatusActivity;->LINE:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 9
    .line 10
    .line 11
    const/high16 v1, 0x42040000    # 33.0f

    .line 12
    .line 13
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    const/high16 v1, 0x41900000    # 18.0f

    .line 18
    .line 19
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v3, -0x1

    .line 25
    const/4 v4, 0x1

    .line 26
    const/4 v6, 0x0

    .line 27
    move-object v2, p0

    .line 28
    invoke-direct/range {v2 .. v8}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p1, v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private addLinkRow(Landroid/widget/LinearLayout;ILjava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 9
    .line 10
    .line 11
    const/high16 v1, 0x41900000    # 18.0f

    .line 12
    .line 13
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v2, v3, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 23
    .line 24
    .line 25
    const/high16 v1, 0x42600000    # 56.0f

    .line 26
    .line 27
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lcom/mr/elaris/ElarisStatusActivity;->rowBackground()Landroid/graphics/drawable/StateListDrawable;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, Lt3;

    .line 49
    .line 50
    invoke-direct {v2, p0, v1}, Lt3;-><init>(Lcom/mr/elaris/ElarisStatusActivity;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    .line 55
    .line 56
    new-instance v2, Landroid/view/View;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    const/high16 v4, 0x40000000    # 2.0f

    .line 62
    .line 63
    invoke-direct {p0, v4}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-direct {p0, p2, v4, v3, v3}, Lcom/mr/elaris/ElarisStatusActivity;->round(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {v2, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 72
    .line 73
    .line 74
    const/high16 p2, 0x40400000    # 3.0f

    .line 75
    .line 76
    invoke-direct {p0, p2}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    const/high16 p2, 0x42000000    # 32.0f

    .line 81
    .line 82
    invoke-direct {p0, p2}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    const/high16 p2, 0x41400000    # 12.0f

    .line 87
    .line 88
    invoke-direct {p0, p2}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    move-object v4, p0

    .line 96
    invoke-direct/range {v4 .. v10}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v0, v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 101
    .line 102
    .line 103
    new-instance p0, Landroid/widget/LinearLayout;

    .line 104
    .line 105
    invoke-direct {p0, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 109
    .line 110
    .line 111
    const/16 p2, 0xf

    .line 112
    .line 113
    sget v1, Lcom/mr/elaris/ElarisStatusActivity;->TEXT:I

    .line 114
    .line 115
    invoke-direct {v4, p3, p2, v1, v3}, Lcom/mr/elaris/ElarisStatusActivity;->text(Ljava/lang/String;IIZ)Landroid/widget/TextView;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    const/16 p3, 0xc

    .line 120
    .line 121
    sget v1, Lcom/mr/elaris/ElarisStatusActivity;->SUB:I

    .line 122
    .line 123
    invoke-direct {v4, p4, p3, v1, v3}, Lcom/mr/elaris/ElarisStatusActivity;->text(Ljava/lang/String;IIZ)Landroid/widget/TextView;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    const/4 p4, 0x2

    .line 128
    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 129
    .line 130
    .line 131
    sget-object p4, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 132
    .line 133
    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    const/high16 p2, 0x40800000    # 4.0f

    .line 140
    .line 141
    invoke-direct {v4, p2}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    const/4 v9, 0x0

    .line 146
    const/4 v5, -0x1

    .line 147
    const/4 v6, -0x2

    .line 148
    invoke-direct/range {v4 .. v10}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-virtual {p0, p3, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 153
    .line 154
    .line 155
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 156
    .line 157
    const/4 p3, -0x2

    .line 158
    const/high16 p4, 0x3f800000    # 1.0f

    .line 159
    .line 160
    invoke-direct {p2, v3, p3, p4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 164
    .line 165
    .line 166
    const/16 p0, 0xa3

    .line 167
    .line 168
    const/16 p2, 0xb8

    .line 169
    .line 170
    const/16 p3, 0x94

    .line 171
    .line 172
    invoke-static {p3, p0, p2}, Landroid/graphics/Color;->rgb(III)I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    const-string p2, "\u203a"

    .line 177
    .line 178
    const/16 p3, 0x16

    .line 179
    .line 180
    invoke-direct {v4, p2, p3, p0, v3}, Lcom/mr/elaris/ElarisStatusActivity;->text(Ljava/lang/String;IIZ)Landroid/widget/TextView;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    const p2, 0x3f0ccccd    # 0.55f

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, p2}, Landroid/view/View;->setAlpha(F)V

    .line 188
    .line 189
    .line 190
    const/16 p2, 0x11

    .line 191
    .line 192
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 193
    .line 194
    .line 195
    const/high16 p2, 0x41c00000    # 24.0f

    .line 196
    .line 197
    invoke-direct {v4, p2}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    const/high16 p2, 0x42100000    # 36.0f

    .line 202
    .line 203
    invoke-direct {v4, p2}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    const/high16 p2, 0x41000000    # 8.0f

    .line 208
    .line 209
    invoke-direct {v4, p2}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    const/4 v8, 0x0

    .line 214
    invoke-direct/range {v4 .. v10}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    invoke-virtual {v0, p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 219
    .line 220
    .line 221
    const/4 v5, -0x1

    .line 222
    const/4 v6, -0x2

    .line 223
    const/4 v7, 0x0

    .line 224
    invoke-direct/range {v4 .. v10}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-virtual {p1, v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method private addStatusRow(Landroid/widget/LinearLayout;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    .line 1
    new-instance v7, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v7, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-virtual {v7, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 9
    .line 10
    .line 11
    const/high16 v1, 0x41900000    # 18.0f

    .line 12
    .line 13
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v8, 0x0

    .line 22
    invoke-virtual {v7, v2, v8, v1, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 23
    .line 24
    .line 25
    const/high16 v1, 0x42780000    # 62.0f

    .line 26
    .line 27
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v7, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 32
    .line 33
    .line 34
    new-instance v9, Landroid/view/View;

    .line 35
    .line 36
    invoke-direct {v9, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    const/high16 v1, 0x40000000    # 2.0f

    .line 40
    .line 41
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    move/from16 v2, p2

    .line 46
    .line 47
    invoke-direct {p0, v2, v1, v8, v8}, Lcom/mr/elaris/ElarisStatusActivity;->round(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v9, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 52
    .line 53
    .line 54
    const/high16 v1, 0x40400000    # 3.0f

    .line 55
    .line 56
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/high16 v2, 0x42000000    # 32.0f

    .line 61
    .line 62
    invoke-direct {p0, v2}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const/high16 v10, 0x41400000    # 12.0f

    .line 67
    .line 68
    invoke-direct {p0, v10}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v3, 0x0

    .line 74
    const/4 v4, 0x0

    .line 75
    move-object v0, p0

    .line 76
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v7, v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 81
    .line 82
    .line 83
    new-instance v9, Landroid/widget/LinearLayout;

    .line 84
    .line 85
    invoke-direct {v9, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    const/4 v1, 0x1

    .line 89
    invoke-virtual {v9, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 90
    .line 91
    .line 92
    const/16 v2, 0xf

    .line 93
    .line 94
    sget v3, Lcom/mr/elaris/ElarisStatusActivity;->TEXT:I

    .line 95
    .line 96
    move-object/from16 v4, p3

    .line 97
    .line 98
    invoke-direct {p0, v4, v2, v3, v8}, Lcom/mr/elaris/ElarisStatusActivity;->text(Ljava/lang/String;IIZ)Landroid/widget/TextView;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    sget v11, Lcom/mr/elaris/ElarisStatusActivity;->SUB:I

    .line 103
    .line 104
    const/16 v3, 0xc

    .line 105
    .line 106
    move-object/from16 v4, p4

    .line 107
    .line 108
    invoke-direct {p0, v4, v3, v11, v8}, Lcom/mr/elaris/ElarisStatusActivity;->text(Ljava/lang/String;IIZ)Landroid/widget/TextView;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 113
    .line 114
    .line 115
    sget-object v13, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 116
    .line 117
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    const/high16 v1, 0x40800000    # 4.0f

    .line 124
    .line 125
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    const/4 v5, 0x0

    .line 130
    const/4 v1, -0x1

    .line 131
    const/4 v2, -0x2

    .line 132
    const/4 v3, 0x0

    .line 133
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v9, v12, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 138
    .line 139
    .line 140
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 141
    .line 142
    const/high16 v3, 0x3f800000    # 1.0f

    .line 143
    .line 144
    invoke-direct {v1, v8, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7, v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 148
    .line 149
    .line 150
    const/16 v1, 0xd

    .line 151
    .line 152
    move-object/from16 v2, p5

    .line 153
    .line 154
    invoke-direct {p0, v2, v1, v11, v8}, Lcom/mr/elaris/ElarisStatusActivity;->text(Ljava/lang/String;IIZ)Landroid/widget/TextView;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    const/16 v1, 0x15

    .line 159
    .line 160
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 161
    .line 162
    .line 163
    const/4 v1, 0x2

    .line 164
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 168
    .line 169
    .line 170
    const/high16 v1, 0x432a0000    # 170.0f

    .line 171
    .line 172
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 177
    .line 178
    .line 179
    invoke-direct {p0, v10}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    const/4 v1, -0x2

    .line 184
    const/4 v2, -0x2

    .line 185
    const/4 v4, 0x0

    .line 186
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v7, v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 191
    .line 192
    .line 193
    const/4 v1, -0x1

    .line 194
    const/4 v3, 0x0

    .line 195
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {p1, v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method private static appendVersion(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u672a\u77e5\u6846\u67b6"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/ElarisStatusActivity;->valueOr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, " "

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_0
    return-object p0
.end method

.method private applySystemBarInsets(Landroid/widget/ScrollView;Landroid/widget/LinearLayout;III)V
    .locals 0

    .line 1
    new-instance p0, Ls3;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, p4, p5}, Ls3;-><init>(Landroid/widget/LinearLayout;III)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static bridge synthetic b(Lcom/mr/elaris/ElarisStatusActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/ElarisStatusActivity;->render()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic c(Lcom/mr/elaris/ElarisStatusActivity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/mr/elaris/ElarisStatusActivity;->setLauncherIconHidden(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private card()Landroid/widget/LinearLayout;
    .locals 5

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 11
    .line 12
    .line 13
    const/high16 v1, 0x41800000    # 16.0f

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    sget v2, Lcom/mr/elaris/ElarisStatusActivity;->STROKE:I

    .line 20
    .line 21
    const/high16 v3, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-direct {p0, v3}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, -0x1

    .line 28
    invoke-direct {p0, v4, v1, v2, v3}, Lcom/mr/elaris/ElarisStatusActivity;->round(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    invoke-virtual {v0, p0}, Landroid/view/View;->setElevation(F)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p0}, Landroid/view/View;->setTranslationZ(F)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public static bridge synthetic d(Lcom/mr/elaris/ElarisStatusActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/mr/elaris/ElarisStatusActivity;->showOverflowMenu(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private dp(F)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method private static frameworkDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/ElarisStatusActivity;->valueOr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lez v1, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p1, v0}, Lcom/mr/elaris/ElarisStatusActivity;->valueOr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string p1, "lsposed"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_8

    .line 31
    .line 32
    const-string p1, "lspd"

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p1, "lspatch"

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    const-string p0, "LSPatch"

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    const-string p1, "npatch"

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    const-string p0, "NPatch"

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    const-string p1, "nitsuya"

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    const-string p0, "Nitsuya"

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_4
    const-string p1, "fankes"

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_7

    .line 81
    .line 82
    const-string p1, "fpa"

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_5

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    const-string p1, "libxposed"

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_6

    .line 98
    .line 99
    const-string p0, "LibXposed"

    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_6
    const-string p0, "\u672a\u77e5\u6846\u67b6"

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_7
    :goto_0
    const-string p0, "Fankes"

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_8
    :goto_1
    const-string p0, "LSPosed"

    .line 109
    .line 110
    return-object p0
.end method

.method private header(Z)Landroid/view/View;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v7, Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v8, 0x0

    .line 9
    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x10

    .line 13
    .line 14
    invoke-virtual {v7, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 15
    .line 16
    .line 17
    new-instance v9, Landroid/widget/LinearLayout;

    .line 18
    .line 19
    invoke-direct {v9, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    const/4 v10, 0x1

    .line 23
    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 24
    .line 25
    .line 26
    sget v11, Lcom/mr/elaris/ElarisStatusActivity;->TEXT:I

    .line 27
    .line 28
    const-string v1, "Elaris"

    .line 29
    .line 30
    const/16 v2, 0x1b

    .line 31
    .line 32
    invoke-direct {v0, v1, v2, v11, v10}, Lcom/mr/elaris/ElarisStatusActivity;->text(Ljava/lang/String;IIZ)Landroid/widget/TextView;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    sget v12, Lcom/mr/elaris/ElarisStatusActivity;->SUB:I

    .line 37
    .line 38
    const-string v2, "\u7248\u672c 2.6.7 (1220)"

    .line 39
    .line 40
    const/16 v13, 0xc

    .line 41
    .line 42
    invoke-direct {v0, v2, v13, v12, v8}, Lcom/mr/elaris/ElarisStatusActivity;->text(Ljava/lang/String;IIZ)Landroid/widget/TextView;

    .line 43
    .line 44
    .line 45
    move-result-object v14

    .line 46
    invoke-virtual {v14, v10}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 47
    .line 48
    .line 49
    sget-object v15, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 50
    .line 51
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    const/high16 v1, 0x40400000    # 3.0f

    .line 58
    .line 59
    invoke-direct {v0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    const/4 v5, 0x0

    .line 64
    const/4 v6, 0x0

    .line 65
    const/4 v1, -0x1

    .line 66
    const/4 v2, -0x2

    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v9, v14, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 76
    .line 77
    const/high16 v3, 0x3f800000    # 1.0f

    .line 78
    .line 79
    invoke-direct {v1, v8, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7, v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 83
    .line 84
    .line 85
    if-eqz p1, :cond_0

    .line 86
    .line 87
    const-string v1, "\u5df2\u6fc0\u6d3b"

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    const-string v1, "\u672a\u68c0\u6d4b\u5230\u6846\u67b6\u6fc0\u6d3b"

    .line 91
    .line 92
    :goto_0
    if-eqz p1, :cond_1

    .line 93
    .line 94
    sget v12, Lcom/mr/elaris/ElarisStatusActivity;->GREEN:I

    .line 95
    .line 96
    :cond_1
    invoke-direct {v0, v1, v13, v12, v8}, Lcom/mr/elaris/ElarisStatusActivity;->text(Ljava/lang/String;IIZ)Landroid/widget/TextView;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    const/16 v12, 0x11

    .line 101
    .line 102
    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v9, v15}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 109
    .line 110
    .line 111
    const/high16 v1, 0x41600000    # 14.0f

    .line 112
    .line 113
    invoke-direct {v0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    invoke-direct {v0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {v9, v2, v8, v1, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 122
    .line 123
    .line 124
    if-eqz p1, :cond_2

    .line 125
    .line 126
    const/16 v1, 0xf8

    .line 127
    .line 128
    const/16 v2, 0xf0

    .line 129
    .line 130
    const/16 v3, 0xe4

    .line 131
    .line 132
    :goto_1
    invoke-static {v3, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    goto :goto_2

    .line 137
    :cond_2
    const/16 v1, 0xf3

    .line 138
    .line 139
    const/16 v2, 0xf6

    .line 140
    .line 141
    const/16 v3, 0xf1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :goto_2
    const/high16 v2, 0x41880000    # 17.0f

    .line 145
    .line 146
    invoke-direct {v0, v2}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-direct {v0, v1, v2, v8, v8}, Lcom/mr/elaris/ElarisStatusActivity;->round(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v9, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 155
    .line 156
    .line 157
    const/high16 v1, 0x42080000    # 34.0f

    .line 158
    .line 159
    invoke-direct {v0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    const/high16 v1, 0x41400000    # 12.0f

    .line 164
    .line 165
    invoke-direct {v0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    const/4 v5, 0x0

    .line 170
    const/4 v6, 0x0

    .line 171
    const/4 v1, -0x2

    .line 172
    const/4 v4, 0x0

    .line 173
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v7, v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 178
    .line 179
    .line 180
    const-string v1, "\u22ee"

    .line 181
    .line 182
    const/16 v2, 0x18

    .line 183
    .line 184
    invoke-direct {v0, v1, v2, v11, v8}, Lcom/mr/elaris/ElarisStatusActivity;->text(Ljava/lang/String;IIZ)Landroid/widget/TextView;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 189
    .line 190
    .line 191
    const-string v1, "\u66f4\u591a\u9009\u9879"

    .line 192
    .line 193
    invoke-virtual {v9, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 194
    .line 195
    .line 196
    new-instance v1, Lt3;

    .line 197
    .line 198
    invoke-direct {v1, v0, v8}, Lt3;-><init>(Lcom/mr/elaris/ElarisStatusActivity;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v9, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    .line 203
    .line 204
    const/high16 v1, 0x42300000    # 44.0f

    .line 205
    .line 206
    invoke-direct {v0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    invoke-direct {v0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    const/high16 v3, 0x40800000    # 4.0f

    .line 215
    .line 216
    invoke-direct {v0, v3}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    move/from16 v16, v2

    .line 221
    .line 222
    move v2, v1

    .line 223
    move/from16 v1, v16

    .line 224
    .line 225
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v7, v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 230
    .line 231
    .line 232
    return-object v7
.end method

.method private infoCard(ZLjava/lang/String;Ljava/lang/String;I)Landroid/view/View;
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/ElarisStatusActivity;->card()Landroid/widget/LinearLayout;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 7
    .line 8
    .line 9
    const/high16 v0, 0x40c00000    # 6.0f

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {p0, v0}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v1, v3, v2, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 21
    .line 22
    .line 23
    sget v2, Lcom/mr/elaris/ElarisStatusActivity;->PURPLE:I

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-static {p2, p3}, Lcom/mr/elaris/ElarisStatusActivity;->appendVersion(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    :goto_0
    move-object v5, p2

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const-string p2, "\u672a\u68c0\u6d4b\u5230\u6846\u67b6\u6fc0\u6d3b"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    const-string v3, "\u6fc0\u6d3b\u6846\u67b6"

    .line 37
    .line 38
    const-string v4, "\u5f53\u524d\u6846\u67b6"

    .line 39
    .line 40
    move-object v0, p0

    .line 41
    invoke-direct/range {v0 .. v5}, Lcom/mr/elaris/ElarisStatusActivity;->addStatusRow(Landroid/widget/LinearLayout;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->addDivider(Landroid/widget/LinearLayout;)V

    .line 45
    .line 46
    .line 47
    sget v2, Lcom/mr/elaris/ElarisStatusActivity;->ORANGE:I

    .line 48
    .line 49
    const-string p0, "\u672a\u8bb0\u5f55"

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    if-lez p4, :cond_1

    .line 54
    .line 55
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    move-object v5, p2

    .line 60
    goto :goto_2

    .line 61
    :cond_1
    move-object v5, p0

    .line 62
    :goto_2
    const-string v3, "\u6846\u67b6 API"

    .line 63
    .line 64
    const-string v4, "LibXposed API"

    .line 65
    .line 66
    invoke-direct/range {v0 .. v5}, Lcom/mr/elaris/ElarisStatusActivity;->addStatusRow(Landroid/widget/LinearLayout;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->addDivider(Landroid/widget/LinearLayout;)V

    .line 70
    .line 71
    .line 72
    sget v2, Lcom/mr/elaris/ElarisStatusActivity;->ROSE:I

    .line 73
    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    invoke-direct {v0}, Lcom/mr/elaris/ElarisStatusActivity;->installedQqVersion()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :cond_2
    move-object v5, p0

    .line 81
    const-string v3, "QQ \u7248\u672c"

    .line 82
    .line 83
    const-string v4, "\u76ee\u6807\u7248\u672c"

    .line 84
    .line 85
    invoke-direct/range {v0 .. v5}, Lcom/mr/elaris/ElarisStatusActivity;->addStatusRow(Landroid/widget/LinearLayout;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object v1
.end method

.method private installedQqVersion()Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "\u672a\u8bb0\u5f55"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v1, "com.tencent.mobileqq"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, ""

    .line 20
    .line 21
    invoke-static {v1, v2}, Lcom/mr/elaris/ElarisStatusActivity;->valueOr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    const-wide/16 v4, 0x0

    .line 34
    .line 35
    if-lez p0, :cond_1

    .line 36
    .line 37
    cmp-long p0, v2, v4

    .line 38
    .line 39
    if-lez p0, :cond_1

    .line 40
    .line 41
    new-instance p0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, "("

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ")"

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-lez p0, :cond_2

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_2
    cmp-long p0, v2, v4

    .line 75
    .line 76
    if-lez p0, :cond_3

    .line 77
    .line 78
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    return-object p0

    .line 83
    :catch_0
    :catchall_0
    :cond_3
    return-object v0
.end method

.method private isLauncherIconHidden()Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-direct {p0}, Lcom/mr/elaris/ElarisStatusActivity;->launcherComponent()Landroid/content/ComponentName;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v1, p0}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 11
    .line 12
    .line 13
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    const/4 v1, 0x2

    .line 15
    if-ne p0, v1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :catchall_0
    :cond_0
    return v0
.end method

.method private launcherComponent()Landroid/content/ComponentName;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/ComponentName;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v1, "com.mr.elaris.DesktopLauncherActivityV30"

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method private lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;
    .locals 0

    .line 1
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p3, p4, p5, p6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method private openExternalLink(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.VIEW"

    .line 4
    .line 5
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 10
    .line 11
    .line 12
    const/high16 v1, 0x10000000

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lxe;->e(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    const-string p1, "\u65e0\u6cd5\u6253\u5f00\u94fe\u63a5"

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private render()V
    .locals 14

    .line 1
    invoke-static {}, Lcom/mr/elaris/FrameworkActivationStatus;->isActiveForQq()Z

    .line 2
    .line 3
    .line 4
    move-result v7

    .line 5
    invoke-static {}, Lcom/mr/elaris/FrameworkActivationStatus;->frameworkName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/mr/elaris/ElarisStatusActivity;->frameworkDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v8

    .line 15
    invoke-static {}, Lcom/mr/elaris/FrameworkActivationStatus;->frameworkVersion()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v9

    .line 19
    invoke-static {}, Lcom/mr/elaris/FrameworkActivationStatus;->apiVersion()I

    .line 20
    .line 21
    .line 22
    move-result v10

    .line 23
    new-instance v1, Landroid/widget/ScrollView;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-virtual {v1, v2}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 30
    .line 31
    .line 32
    sget v3, Lcom/mr/elaris/ElarisStatusActivity;->PAGE:I

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 35
    .line 36
    .line 37
    new-instance v3, Landroid/widget/LinearLayout;

    .line 38
    .line 39
    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 43
    .line 44
    .line 45
    const/high16 v6, 0x41900000    # 18.0f

    .line 46
    .line 47
    invoke-direct {p0, v6}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/high16 v4, 0x41a00000    # 20.0f

    .line 52
    .line 53
    invoke-direct {p0, v4}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const/high16 v5, 0x41c00000    # 24.0f

    .line 58
    .line 59
    invoke-direct {p0, v5}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v3, v2, v4, v2, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 64
    .line 65
    .line 66
    new-instance v11, Landroid/widget/FrameLayout$LayoutParams;

    .line 67
    .line 68
    const/4 v12, -0x1

    .line 69
    const/4 v13, -0x2

    .line 70
    invoke-direct {v11, v12, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v3, v11}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 74
    .line 75
    .line 76
    move-object v0, v3

    .line 77
    move v3, v2

    .line 78
    move-object v2, v0

    .line 79
    move-object v0, p0

    .line 80
    invoke-direct/range {v0 .. v5}, Lcom/mr/elaris/ElarisStatusActivity;->applySystemBarInsets(Landroid/widget/ScrollView;Landroid/widget/LinearLayout;III)V

    .line 81
    .line 82
    .line 83
    move-object v11, v1

    .line 84
    move-object v12, v2

    .line 85
    invoke-direct {p0, v7}, Lcom/mr/elaris/ElarisStatusActivity;->header(Z)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v13

    .line 89
    const/4 v5, 0x0

    .line 90
    invoke-direct {p0, v6}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    const/4 v1, -0x1

    .line 95
    const/4 v2, -0x2

    .line 96
    const/4 v3, 0x0

    .line 97
    const/4 v4, 0x0

    .line 98
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v12, v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    .line 104
    .line 105
    invoke-direct {p0, v7, v8, v9, v10}, Lcom/mr/elaris/ElarisStatusActivity;->infoCard(ZLjava/lang/String;Ljava/lang/String;I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    const/high16 v1, 0x41400000    # 12.0f

    .line 110
    .line 111
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    const/4 v1, -0x1

    .line 116
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v12, v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    .line 122
    .line 123
    invoke-direct {p0}, Lcom/mr/elaris/ElarisStatusActivity;->telegramCard()Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    const/4 v6, 0x0

    .line 128
    const/4 v1, -0x1

    .line 129
    invoke-direct/range {v0 .. v6}, Lcom/mr/elaris/ElarisStatusActivity;->lp(IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v12, v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v11}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method private round(IIII)Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    .line 1
    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 7
    .line 8
    .line 9
    int-to-float p1, p2

    .line 10
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 11
    .line 12
    .line 13
    if-lez p4, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p4, p3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object p0
.end method

.method private rowBackground()Landroid/graphics/drawable/StateListDrawable;
    .locals 1

    const/high16 v0, 0x41800000    # 16.0f

    .line 66
    invoke-direct {p0, v0}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mr/elaris/ElarisStatusActivity;->rowBackground(I)Landroid/graphics/drawable/StateListDrawable;

    move-result-object p0

    return-object p0
.end method

.method private rowBackground(I)Landroid/graphics/drawable/StateListDrawable;
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const v1, 0x10100a7

    .line 7
    .line 8
    .line 9
    filled-new-array {v1}, [I

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0xf1

    .line 14
    .line 15
    const/16 v3, 0xf5

    .line 16
    .line 17
    const/16 v4, 0xef

    .line 18
    .line 19
    invoke-static {v4, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {p0, v2, p1, v3, v3}, Lcom/mr/elaris/ElarisStatusActivity;->round(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    const v1, 0x10100a1

    .line 32
    .line 33
    .line 34
    filled-new-array {v1}, [I

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/16 v2, 0xf4

    .line 39
    .line 40
    const/16 v4, 0xf7

    .line 41
    .line 42
    const/16 v5, 0xf2

    .line 43
    .line 44
    invoke-static {v5, v2, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-direct {p0, v2, p1, v3, v3}, Lcom/mr/elaris/ElarisStatusActivity;->round(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, v1, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    new-array p0, v3, [I

    .line 56
    .line 57
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    .line 58
    .line 59
    invoke-direct {p1, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p0, p1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method

.method private setLauncherIconHidden(Z)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-direct {p0}, Lcom/mr/elaris/ElarisStatusActivity;->launcherComponent()Landroid/content/ComponentName;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 v4, 0x2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v4, v3

    .line 16
    :goto_0
    invoke-virtual {v1, v2, v4, v3}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    const-string v1, "\u684c\u9762\u56fe\u6807\u5df2\u9690\u85cf"

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const-string v1, "\u684c\u9762\u56fe\u6807\u5df2\u6062\u590d"

    .line 25
    .line 26
    :goto_1
    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lcom/mr/elaris/ElarisStatusActivity;->render()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    if-eqz p1, :cond_2

    .line 38
    .line 39
    const-string p1, "\u9690\u85cf\u5931\u8d25"

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const-string p1, "\u6062\u590d\u5931\u8d25"

    .line 43
    .line 44
    :goto_2
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private showOverflowMenu(Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/ElarisStatusActivity;->isLauncherIconHidden()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Landroid/widget/PopupWindow;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v2, "\u6062\u590d\u684c\u9762\u56fe\u6807"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v2, "\u9690\u85cf\u684c\u9762\u56fe\u6807"

    .line 16
    .line 17
    :goto_0
    const/16 v3, 0xd

    .line 18
    .line 19
    sget v4, Lcom/mr/elaris/ElarisStatusActivity;->TEXT:I

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    invoke-direct {p0, v2, v3, v4, v5}, Lcom/mr/elaris/ElarisStatusActivity;->text(Ljava/lang/String;IIZ)Landroid/widget/TextView;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/16 v3, 0x11

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 33
    .line 34
    .line 35
    sget-object v4, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 36
    .line 37
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 38
    .line 39
    .line 40
    const/high16 v4, 0x41200000    # 10.0f

    .line 41
    .line 42
    invoke-direct {p0, v4}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-direct {p0, v4}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-virtual {v2, v6, v5, v4, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 51
    .line 52
    .line 53
    const/high16 v4, 0x41900000    # 18.0f

    .line 54
    .line 55
    invoke-direct {p0, v4}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    invoke-direct {p0, v6}, Lcom/mr/elaris/ElarisStatusActivity;->rowBackground(I)Landroid/graphics/drawable/StateListDrawable;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    new-instance v6, Lu3;

    .line 67
    .line 68
    invoke-direct {v6, p0, v1, v0}, Lu3;-><init>(Lcom/mr/elaris/ElarisStatusActivity;Landroid/widget/PopupWindow;Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Landroid/widget/LinearLayout;

    .line 75
    .line 76
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 80
    .line 81
    .line 82
    invoke-direct {p0, v4}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    sget v6, Lcom/mr/elaris/ElarisStatusActivity;->STROKE:I

    .line 87
    .line 88
    const/high16 v7, 0x3f800000    # 1.0f

    .line 89
    .line 90
    invoke-direct {p0, v7}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    const/4 v8, -0x1

    .line 95
    invoke-direct {p0, v8, v4, v6, v7}, Lcom/mr/elaris/ElarisStatusActivity;->round(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 100
    .line 101
    .line 102
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 103
    .line 104
    const/high16 v6, 0x42300000    # 44.0f

    .line 105
    .line 106
    invoke-direct {p0, v6}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    invoke-direct {v4, v8, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    .line 115
    .line 116
    const/high16 v2, 0x43140000    # 148.0f

    .line 117
    .line 118
    invoke-direct {p0, v2}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 126
    .line 127
    .line 128
    const/4 v0, -0x2

    .line 129
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 136
    .line 137
    .line 138
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 139
    .line 140
    invoke-direct {v0, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    const/high16 v0, 0x40a00000    # 5.0f

    .line 147
    .line 148
    invoke-direct {p0, v0}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    int-to-float v0, v0

    .line 153
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setElevation(F)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    sub-int/2addr v0, v2

    .line 161
    const/high16 v2, 0x40800000    # 4.0f

    .line 162
    .line 163
    invoke-direct {p0, v2}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    invoke-virtual {v1, p1, v0, p0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 168
    .line 169
    .line 170
    return-void
.end method

.method private telegramCard()Landroid/view/View;
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/ElarisStatusActivity;->card()Landroid/widget/LinearLayout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 7
    .line 8
    .line 9
    const/high16 v1, 0x40c00000    # 6.0f

    .line 10
    .line 11
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {p0, v1}, Lcom/mr/elaris/ElarisStatusActivity;->dp(F)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v0, v3, v2, v3, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 21
    .line 22
    .line 23
    sget v1, Lcom/mr/elaris/ElarisStatusActivity;->BLUE:I

    .line 24
    .line 25
    const-string v2, "Telegram \u9891\u9053"

    .line 26
    .line 27
    const-string v3, "\u67e5\u770b\u9891\u9053\u66f4\u65b0\u4e0e\u53cd\u9988\u5165\u53e3"

    .line 28
    .line 29
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/mr/elaris/ElarisStatusActivity;->addLinkRow(Landroid/widget/LinearLayout;ILjava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method private text(Ljava/lang/String;IIZ)Landroid/widget/TextView;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    int-to-float p0, p2

    .line 10
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 18
    .line 19
    .line 20
    if-eqz p4, :cond_0

    .line 21
    .line 22
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object v0
.end method

.method private static valueOr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    return-object p1
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/mr/elaris/FrameworkActivationStatus;->init(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lh0;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    invoke-direct {p1, v0, p0}, Lh0;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/mr/elaris/FrameworkActivationStatus;->setListener(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    sget v0, Lcom/mr/elaris/ElarisStatusActivity;->PAGE:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-direct {p0}, Lcom/mr/elaris/ElarisStatusActivity;->render()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/mr/elaris/FrameworkActivationStatus;->setListener(Ljava/lang/Runnable;)V

    .line 3
    .line 4
    .line 5
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/mr/elaris/ElarisStatusActivity;->firstResume:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/mr/elaris/ElarisStatusActivity;->firstResume:Z

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/mr/elaris/ElarisStatusActivity;->render()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
