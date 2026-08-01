.class final Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ε:Lm3;

.field public ζ:Lw90;

.field public η:Lx90;

.field public θ:Lpa0;

.field public final ι:Landroid/graphics/Paint;

.field public final κ:Landroid/graphics/Paint;

.field public final λ:Landroid/graphics/Paint;

.field public final μ:Landroid/graphics/Paint;

.field public final ν:Landroid/graphics/Paint;

.field public final ξ:Landroid/graphics/Paint;

.field public final ο:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lw90;Lx90;Lm3;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iput-object p4, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ε:Lm3;

    .line 14
    .line 15
    sget-object p1, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 16
    .line 17
    invoke-static {p2, p3}, Li2;->Β(Lw90;Lx90;)Lw90;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->η:Lx90;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/Paint;

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/16 p3, 0x78

    .line 32
    .line 33
    const/4 p4, 0x0

    .line 34
    invoke-static {p3, p4, p4, p4}, Landroid/graphics/Color;->argb(IIII)I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 39
    .line 40
    .line 41
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 42
    .line 43
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ι:Landroid/graphics/Paint;

    .line 47
    .line 48
    new-instance p1, Landroid/graphics/Paint;

    .line 49
    .line 50
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 51
    .line 52
    .line 53
    const/16 v0, 0xff

    .line 54
    .line 55
    const/16 v1, 0xeb

    .line 56
    .line 57
    invoke-static {v1, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 62
    .line 63
    .line 64
    const/high16 v0, 0x40000000    # 2.0f

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->κ:Landroid/graphics/Paint;

    .line 79
    .line 80
    new-instance p1, Landroid/graphics/Paint;

    .line 81
    .line 82
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 83
    .line 84
    .line 85
    const/16 v2, 0xbe

    .line 86
    .line 87
    invoke-static {v2, p4, p4, p4}, Landroid/graphics/Color;->argb(IIII)I

    .line 88
    .line 89
    .line 90
    move-result p4

    .line 91
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    .line 93
    .line 94
    const/high16 p4, 0x40a00000    # 5.0f

    .line 95
    .line 96
    invoke-virtual {p0, p4}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 97
    .line 98
    .line 99
    move-result p4

    .line 100
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->λ:Landroid/graphics/Paint;

    .line 107
    .line 108
    new-instance p1, Landroid/graphics/Paint;

    .line 109
    .line 110
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 111
    .line 112
    .line 113
    const/16 p4, 0x1c

    .line 114
    .line 115
    const/16 v0, 0x22

    .line 116
    .line 117
    invoke-static {v1, p4, p4, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 118
    .line 119
    .line 120
    move-result p4

    .line 121
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->μ:Landroid/graphics/Paint;

    .line 128
    .line 129
    new-instance p1, Landroid/graphics/Paint;

    .line 130
    .line 131
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 132
    .line 133
    .line 134
    const/4 p3, -0x1

    .line 135
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object p4

    .line 142
    invoke-virtual {p4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 143
    .line 144
    .line 145
    move-result-object p4

    .line 146
    const/4 v0, 0x2

    .line 147
    const/high16 v1, 0x41b00000    # 22.0f

    .line 148
    .line 149
    invoke-static {v0, v1, p4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 150
    .line 151
    .line 152
    move-result p4

    .line 153
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 154
    .line 155
    .line 156
    sget-object p4, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 157
    .line 158
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 159
    .line 160
    .line 161
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 162
    .line 163
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 164
    .line 165
    .line 166
    iput-object p1, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ν:Landroid/graphics/Paint;

    .line 167
    .line 168
    new-instance p1, Landroid/graphics/Paint;

    .line 169
    .line 170
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 177
    .line 178
    .line 179
    move-result-object p3

    .line 180
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 181
    .line 182
    .line 183
    move-result-object p3

    .line 184
    const/high16 v2, 0x41300000    # 11.0f

    .line 185
    .line 186
    invoke-static {v0, v2, p3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 187
    .line 188
    .line 189
    move-result p3

    .line 190
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 197
    .line 198
    .line 199
    iput-object p1, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ξ:Landroid/graphics/Paint;

    .line 200
    .line 201
    new-instance p1, Landroid/graphics/RectF;

    .line 202
    .line 203
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 204
    .line 205
    .line 206
    iput-object p1, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ο:Landroid/graphics/RectF;

    .line 207
    .line 208
    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, p2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 215
    .line 216
    .line 217
    const-string p1, "\u53ef\u62d6\u52a8\u7684\u624b\u52bf\u6709\u6548\u8fb9\u754c\u548c\u5206\u5272\u7ebf"

    .line 218
    .line 219
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-lez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-gtz v1, :cond_0

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_0
    sget-object v1, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    int-to-float v1, v1

    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    int-to-float v2, v2

    .line 35
    iget-object v3, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 36
    .line 37
    invoke-static {v1, v2, v3}, Li2;->ι(FFLw90;)Lv90;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    iget v8, v7, Lv90;->γ:F

    .line 42
    .line 43
    iget v9, v7, Lv90;->δ:F

    .line 44
    .line 45
    iget v10, v7, Lv90;->β:F

    .line 46
    .line 47
    iget v11, v7, Lv90;->α:F

    .line 48
    .line 49
    iget-object v1, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 50
    .line 51
    iget v1, v1, Lw90;->α:F

    .line 52
    .line 53
    invoke-virtual {v7}, Lv90;->β()F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    mul-float/2addr v2, v1

    .line 58
    add-float v12, v2, v11

    .line 59
    .line 60
    iget-object v1, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 61
    .line 62
    iget v1, v1, Lw90;->β:F

    .line 63
    .line 64
    invoke-virtual {v7}, Lv90;->β()F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    mul-float/2addr v2, v1

    .line 69
    add-float v13, v2, v11

    .line 70
    .line 71
    iget-object v1, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 72
    .line 73
    iget v1, v1, Lw90;->γ:F

    .line 74
    .line 75
    invoke-virtual {v7}, Lv90;->α()F

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    mul-float/2addr v2, v1

    .line 80
    add-float v14, v2, v10

    .line 81
    .line 82
    iget-object v1, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 83
    .line 84
    iget v1, v1, Lw90;->δ:F

    .line 85
    .line 86
    invoke-virtual {v7}, Lv90;->α()F

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    mul-float/2addr v2, v1

    .line 91
    add-float v15, v2, v10

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    int-to-float v4, v1

    .line 98
    iget v5, v7, Lv90;->β:F

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    const/4 v3, 0x0

    .line 102
    iget-object v6, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ι:Landroid/graphics/Paint;

    .line 103
    .line 104
    move-object/from16 v1, p1

    .line 105
    .line 106
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 107
    .line 108
    .line 109
    iget v3, v7, Lv90;->δ:F

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    int-to-float v4, v1

    .line 116
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    int-to-float v5, v1

    .line 121
    move-object/from16 v1, p1

    .line 122
    .line 123
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 124
    .line 125
    .line 126
    iget v3, v7, Lv90;->β:F

    .line 127
    .line 128
    iget v4, v7, Lv90;->α:F

    .line 129
    .line 130
    iget v5, v7, Lv90;->δ:F

    .line 131
    .line 132
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 133
    .line 134
    .line 135
    iget v2, v7, Lv90;->γ:F

    .line 136
    .line 137
    iget v3, v7, Lv90;->β:F

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    int-to-float v4, v1

    .line 144
    iget v5, v7, Lv90;->δ:F

    .line 145
    .line 146
    move-object/from16 v1, p1

    .line 147
    .line 148
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 149
    .line 150
    .line 151
    iget-object v6, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->λ:Landroid/graphics/Paint;

    .line 152
    .line 153
    move v4, v12

    .line 154
    move v5, v9

    .line 155
    move v3, v10

    .line 156
    move v2, v12

    .line 157
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 158
    .line 159
    .line 160
    move-object v9, v6

    .line 161
    iget-object v6, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->κ:Landroid/graphics/Paint;

    .line 162
    .line 163
    move v4, v2

    .line 164
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 165
    .line 166
    .line 167
    move-object v10, v6

    .line 168
    add-float v4, v3, v5

    .line 169
    .line 170
    const/high16 v12, 0x40000000    # 2.0f

    .line 171
    .line 172
    div-float/2addr v4, v12

    .line 173
    const-string v6, "\u2194"

    .line 174
    .line 175
    invoke-virtual {v0, v2, v4, v1, v6}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->β(FFLandroid/graphics/Canvas;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    move v2, v4

    .line 179
    move v4, v13

    .line 180
    move-object/from16 v17, v9

    .line 181
    .line 182
    move v9, v2

    .line 183
    move v2, v13

    .line 184
    move-object v13, v6

    .line 185
    move-object/from16 v6, v17

    .line 186
    .line 187
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 188
    .line 189
    .line 190
    move-object/from16 v16, v6

    .line 191
    .line 192
    move v4, v2

    .line 193
    move-object v6, v10

    .line 194
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v2, v9, v1, v13}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->β(FFLandroid/graphics/Canvas;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    move v5, v14

    .line 201
    move v4, v8

    .line 202
    move v2, v11

    .line 203
    move v3, v14

    .line 204
    move-object/from16 v6, v16

    .line 205
    .line 206
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 207
    .line 208
    .line 209
    move v5, v3

    .line 210
    move-object v6, v10

    .line 211
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 212
    .line 213
    .line 214
    add-float v11, v2, v4

    .line 215
    .line 216
    div-float/2addr v11, v12

    .line 217
    const-string v8, "\u2195"

    .line 218
    .line 219
    invoke-virtual {v0, v11, v3, v1, v8}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->β(FFLandroid/graphics/Canvas;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    move v5, v15

    .line 223
    move v3, v15

    .line 224
    move-object/from16 v6, v16

    .line 225
    .line 226
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 227
    .line 228
    .line 229
    move v5, v3

    .line 230
    move-object v6, v10

    .line 231
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v11, v3, v1, v8}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->β(FFLandroid/graphics/Canvas;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget v2, v7, Lv90;->α:F

    .line 238
    .line 239
    iget-object v3, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 240
    .line 241
    iget v3, v3, Lw90;->ε:F

    .line 242
    .line 243
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    invoke-virtual {v0, v4, v3}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ(IF)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    const-string v4, "\u5de6 "

    .line 252
    .line 253
    const-string v6, "dp"

    .line 254
    .line 255
    invoke-static {v4, v3, v6}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    const/4 v5, 0x1

    .line 260
    move-object v3, v7

    .line 261
    invoke-virtual/range {v0 .. v5}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ε(Landroid/graphics/Canvas;FLv90;Ljava/lang/String;Z)V

    .line 262
    .line 263
    .line 264
    iget v2, v3, Lv90;->γ:F

    .line 265
    .line 266
    iget-object v1, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 267
    .line 268
    iget v1, v1, Lw90;->ζ:F

    .line 269
    .line 270
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    invoke-virtual {v0, v4, v1}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ(IF)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    const-string v4, "\u53f3 "

    .line 279
    .line 280
    invoke-static {v4, v1, v6}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    const/4 v5, 0x0

    .line 285
    move-object/from16 v1, p1

    .line 286
    .line 287
    invoke-virtual/range {v0 .. v5}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ε(Landroid/graphics/Canvas;FLv90;Ljava/lang/String;Z)V

    .line 288
    .line 289
    .line 290
    iget v2, v3, Lv90;->β:F

    .line 291
    .line 292
    iget-object v1, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 293
    .line 294
    iget v1, v1, Lw90;->η:F

    .line 295
    .line 296
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    invoke-virtual {v0, v4, v1}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ(IF)I

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    const-string v4, "\u4e0a "

    .line 305
    .line 306
    invoke-static {v4, v1, v6}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    const/4 v5, 0x1

    .line 311
    move-object/from16 v1, p1

    .line 312
    .line 313
    invoke-virtual/range {v0 .. v5}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->γ(Landroid/graphics/Canvas;FLv90;Ljava/lang/String;Z)V

    .line 314
    .line 315
    .line 316
    iget v2, v3, Lv90;->δ:F

    .line 317
    .line 318
    iget-object v1, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 319
    .line 320
    iget v1, v1, Lw90;->θ:F

    .line 321
    .line 322
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    invoke-virtual {v0, v4, v1}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ(IF)I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    const-string v4, "\u4e0b "

    .line 331
    .line 332
    invoke-static {v4, v1, v6}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    const/4 v5, 0x0

    .line 337
    move-object/from16 v1, p1

    .line 338
    .line 339
    invoke-virtual/range {v0 .. v5}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->γ(Landroid/graphics/Canvas;FLv90;Ljava/lang/String;Z)V

    .line 340
    .line 341
    .line 342
    :cond_1
    :goto_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v1, :cond_9

    .line 14
    .line 15
    if-eq v1, v4, :cond_6

    .line 16
    .line 17
    iget-object v5, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->θ:Lpa0;

    .line 18
    .line 19
    const/4 v6, 0x2

    .line 20
    if-eq v1, v6, :cond_4

    .line 21
    .line 22
    const/4 v6, 0x3

    .line 23
    if-eq v1, v6, :cond_1

    .line 24
    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    move v1, v4

    .line 28
    goto/16 :goto_10

    .line 29
    .line 30
    :cond_0
    :goto_0
    move/from16 v16, v3

    .line 31
    .line 32
    goto/16 :goto_f

    .line 33
    .line 34
    :cond_1
    if-eqz v5, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move v4, v3

    .line 38
    :goto_1
    iput-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->θ:Lpa0;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    return v4

    .line 50
    :cond_4
    if-nez v5, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {v0, v5, v1, v2}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->θ(Lpa0;FF)V

    .line 62
    .line 63
    .line 64
    return v4

    .line 65
    :cond_6
    iget-object v1, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->θ:Lpa0;

    .line 66
    .line 67
    if-nez v1, :cond_7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-virtual {v0, v1, v5, v6}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->θ(Lpa0;FF)V

    .line 79
    .line 80
    .line 81
    iput-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->θ:Lpa0;

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-eqz v1, :cond_8

    .line 88
    .line 89
    invoke-interface {v1, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 90
    .line 91
    .line 92
    :cond_8
    invoke-super {v0}, Landroid/view/View;->performClick()Z

    .line 93
    .line 94
    .line 95
    return v4

    .line 96
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-lez v6, :cond_a

    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-gtz v6, :cond_b

    .line 115
    .line 116
    :cond_a
    move/from16 v16, v3

    .line 117
    .line 118
    goto/16 :goto_c

    .line 119
    .line 120
    :cond_b
    sget-object v6, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    int-to-float v6, v6

    .line 127
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    int-to-float v7, v7

    .line 132
    iget-object v8, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 133
    .line 134
    invoke-static {v6, v7, v8}, Li2;->ι(FFLw90;)Lv90;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    iget v7, v6, Lv90;->δ:F

    .line 139
    .line 140
    iget v8, v6, Lv90;->γ:F

    .line 141
    .line 142
    iget v9, v6, Lv90;->β:F

    .line 143
    .line 144
    iget v10, v6, Lv90;->α:F

    .line 145
    .line 146
    iget-object v11, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 147
    .line 148
    iget v11, v11, Lw90;->α:F

    .line 149
    .line 150
    invoke-virtual {v6}, Lv90;->β()F

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    mul-float/2addr v12, v11

    .line 155
    add-float/2addr v12, v10

    .line 156
    iget-object v11, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 157
    .line 158
    iget v11, v11, Lw90;->β:F

    .line 159
    .line 160
    invoke-virtual {v6}, Lv90;->β()F

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    mul-float/2addr v13, v11

    .line 165
    add-float/2addr v13, v10

    .line 166
    iget-object v11, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 167
    .line 168
    iget v11, v11, Lw90;->γ:F

    .line 169
    .line 170
    invoke-virtual {v6}, Lv90;->α()F

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    mul-float/2addr v14, v11

    .line 175
    add-float/2addr v14, v9

    .line 176
    iget-object v11, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 177
    .line 178
    iget v11, v11, Lw90;->δ:F

    .line 179
    .line 180
    invoke-virtual {v6}, Lv90;->α()F

    .line 181
    .line 182
    .line 183
    move-result v15

    .line 184
    mul-float/2addr v15, v11

    .line 185
    add-float/2addr v15, v9

    .line 186
    const/high16 v11, 0x41f00000    # 30.0f

    .line 187
    .line 188
    invoke-virtual {v0, v11}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    new-instance v2, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    move/from16 v16, v3

    .line 198
    .line 199
    const/high16 v3, 0x42400000    # 48.0f

    .line 200
    .line 201
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 202
    .line 203
    .line 204
    move-result v17

    .line 205
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    int-to-float v4, v4

    .line 210
    const/high16 v18, 0x40000000    # 2.0f

    .line 211
    .line 212
    div-float v4, v4, v18

    .line 213
    .line 214
    cmpl-float v19, v17, v4

    .line 215
    .line 216
    if-lez v19, :cond_c

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_c
    move/from16 v4, v17

    .line 220
    .line 221
    :goto_2
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    move/from16 v17, v1

    .line 226
    .line 227
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    int-to-float v1, v1

    .line 232
    div-float v1, v1, v18

    .line 233
    .line 234
    cmpl-float v18, v3, v1

    .line 235
    .line 236
    if-lez v18, :cond_d

    .line 237
    .line 238
    move v3, v1

    .line 239
    :cond_d
    invoke-virtual {v6}, Lv90;->α()F

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    const v18, 0x3f3851ec    # 0.72f

    .line 244
    .line 245
    .line 246
    mul-float v1, v1, v18

    .line 247
    .line 248
    add-float/2addr v1, v9

    .line 249
    move/from16 p1, v1

    .line 250
    .line 251
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    int-to-float v1, v1

    .line 256
    sub-float/2addr v1, v4

    .line 257
    invoke-static {v10, v4, v1}, Lj81;->λ(FFF)F

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    move/from16 v19, v1

    .line 262
    .line 263
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    int-to-float v1, v1

    .line 268
    sub-float/2addr v1, v4

    .line 269
    invoke-static {v8, v4, v1}, Lj81;->λ(FFF)F

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    invoke-virtual {v6}, Lv90;->β()F

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    mul-float v4, v4, v18

    .line 278
    .line 279
    add-float/2addr v4, v10

    .line 280
    invoke-virtual {v6}, Lv90;->β()F

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    const v18, 0x3da3d70a    # 0.08f

    .line 285
    .line 286
    .line 287
    mul-float v6, v6, v18

    .line 288
    .line 289
    add-float/2addr v6, v10

    .line 290
    move/from16 v18, v1

    .line 291
    .line 292
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    int-to-float v1, v1

    .line 297
    sub-float/2addr v1, v3

    .line 298
    invoke-static {v9, v3, v1}, Lj81;->λ(FFF)F

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    move/from16 v20, v1

    .line 303
    .line 304
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    int-to-float v1, v1

    .line 309
    sub-float/2addr v1, v3

    .line 310
    invoke-static {v7, v3, v1}, Lj81;->λ(FFF)F

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    sub-float v3, v9, v11

    .line 315
    .line 316
    add-float v21, v7, v11

    .line 317
    .line 318
    cmpg-float v21, v5, v21

    .line 319
    .line 320
    const/high16 v22, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 321
    .line 322
    if-gtz v21, :cond_12

    .line 323
    .line 324
    cmpg-float v3, v3, v5

    .line 325
    .line 326
    if-gtz v3, :cond_12

    .line 327
    .line 328
    sub-float v3, v17, v10

    .line 329
    .line 330
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    sub-float v19, v17, v19

    .line 335
    .line 336
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->abs(F)F

    .line 337
    .line 338
    .line 339
    move-result v19

    .line 340
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 341
    .line 342
    .line 343
    move-result-object v19

    .line 344
    sub-float v21, v5, p1

    .line 345
    .line 346
    invoke-static/range {v21 .. v21}, Ljava/lang/Math;->abs(F)F

    .line 347
    .line 348
    .line 349
    move-result v23

    .line 350
    cmpg-float v23, v23, v11

    .line 351
    .line 352
    if-gtz v23, :cond_e

    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_e
    const/16 v19, 0x0

    .line 356
    .line 357
    :goto_3
    if-eqz v19, :cond_f

    .line 358
    .line 359
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Float;->floatValue()F

    .line 360
    .line 361
    .line 362
    move-result v19

    .line 363
    move/from16 p1, v1

    .line 364
    .line 365
    move/from16 v1, v19

    .line 366
    .line 367
    goto :goto_4

    .line 368
    :cond_f
    move/from16 p1, v1

    .line 369
    .line 370
    move/from16 v1, v22

    .line 371
    .line 372
    :goto_4
    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    sub-float v3, v17, v8

    .line 377
    .line 378
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    sub-float v18, v17, v18

    .line 383
    .line 384
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->abs(F)F

    .line 385
    .line 386
    .line 387
    move-result v18

    .line 388
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 389
    .line 390
    .line 391
    move-result-object v18

    .line 392
    invoke-static/range {v21 .. v21}, Ljava/lang/Math;->abs(F)F

    .line 393
    .line 394
    .line 395
    move-result v19

    .line 396
    cmpg-float v19, v19, v11

    .line 397
    .line 398
    if-gtz v19, :cond_10

    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_10
    const/16 v18, 0x0

    .line 402
    .line 403
    :goto_5
    if-eqz v18, :cond_11

    .line 404
    .line 405
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Float;->floatValue()F

    .line 406
    .line 407
    .line 408
    move-result v18

    .line 409
    move/from16 v24, v18

    .line 410
    .line 411
    move/from16 v18, v1

    .line 412
    .line 413
    move/from16 v1, v24

    .line 414
    .line 415
    goto :goto_6

    .line 416
    :cond_11
    move/from16 v18, v1

    .line 417
    .line 418
    move/from16 v1, v22

    .line 419
    .line 420
    :goto_6
    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    move/from16 v18, v1

    .line 429
    .line 430
    new-instance v1, Ll91;

    .line 431
    .line 432
    move/from16 v19, v4

    .line 433
    .line 434
    sget-object v4, Lpa0;->ε:Lpa0;

    .line 435
    .line 436
    invoke-direct {v1, v4, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    new-instance v3, Ll91;

    .line 447
    .line 448
    sget-object v4, Lpa0;->ζ:Lpa0;

    .line 449
    .line 450
    invoke-direct {v3, v4, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    sub-float v1, v17, v12

    .line 457
    .line 458
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    new-instance v3, Ll91;

    .line 467
    .line 468
    sget-object v4, Lpa0;->ι:Lpa0;

    .line 469
    .line 470
    invoke-direct {v3, v4, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    sub-float v1, v17, v13

    .line 477
    .line 478
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    new-instance v3, Ll91;

    .line 487
    .line 488
    sget-object v4, Lpa0;->κ:Lpa0;

    .line 489
    .line 490
    invoke-direct {v3, v4, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    goto :goto_7

    .line 497
    :cond_12
    move/from16 p1, v1

    .line 498
    .line 499
    move/from16 v19, v4

    .line 500
    .line 501
    :goto_7
    sub-float/2addr v10, v11

    .line 502
    add-float/2addr v8, v11

    .line 503
    cmpg-float v1, v17, v8

    .line 504
    .line 505
    if-gtz v1, :cond_17

    .line 506
    .line 507
    cmpg-float v1, v10, v17

    .line 508
    .line 509
    if-gtz v1, :cond_17

    .line 510
    .line 511
    sub-float v1, v5, v9

    .line 512
    .line 513
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    sub-float v3, v5, v20

    .line 518
    .line 519
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    sub-float v4, v17, v19

    .line 528
    .line 529
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    cmpg-float v4, v4, v11

    .line 534
    .line 535
    if-gtz v4, :cond_13

    .line 536
    .line 537
    goto :goto_8

    .line 538
    :cond_13
    const/4 v3, 0x0

    .line 539
    :goto_8
    if-eqz v3, :cond_14

    .line 540
    .line 541
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    goto :goto_9

    .line 546
    :cond_14
    move/from16 v3, v22

    .line 547
    .line 548
    :goto_9
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    sub-float v3, v5, v7

    .line 553
    .line 554
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    sub-float v4, v5, p1

    .line 559
    .line 560
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    sub-float v6, v17, v6

    .line 569
    .line 570
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    cmpg-float v6, v6, v11

    .line 575
    .line 576
    if-gtz v6, :cond_15

    .line 577
    .line 578
    goto :goto_a

    .line 579
    :cond_15
    const/4 v4, 0x0

    .line 580
    :goto_a
    if-eqz v4, :cond_16

    .line 581
    .line 582
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 583
    .line 584
    .line 585
    move-result v22

    .line 586
    :cond_16
    move/from16 v4, v22

    .line 587
    .line 588
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    new-instance v4, Ll91;

    .line 597
    .line 598
    sget-object v6, Lpa0;->η:Lpa0;

    .line 599
    .line 600
    invoke-direct {v4, v6, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    new-instance v3, Ll91;

    .line 611
    .line 612
    sget-object v4, Lpa0;->θ:Lpa0;

    .line 613
    .line 614
    invoke-direct {v3, v4, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    sub-float v1, v5, v14

    .line 621
    .line 622
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 623
    .line 624
    .line 625
    move-result v1

    .line 626
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    new-instance v3, Ll91;

    .line 631
    .line 632
    sget-object v4, Lpa0;->λ:Lpa0;

    .line 633
    .line 634
    invoke-direct {v3, v4, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    sub-float/2addr v5, v15

    .line 641
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    new-instance v3, Ll91;

    .line 650
    .line 651
    sget-object v4, Lpa0;->μ:Lpa0;

    .line 652
    .line 653
    invoke-direct {v3, v4, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    :cond_17
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 664
    .line 665
    .line 666
    move-result v2

    .line 667
    if-nez v2, :cond_18

    .line 668
    .line 669
    const/4 v2, 0x0

    .line 670
    goto :goto_b

    .line 671
    :cond_18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    if-nez v3, :cond_19

    .line 680
    .line 681
    goto :goto_b

    .line 682
    :cond_19
    move-object v3, v2

    .line 683
    check-cast v3, Ll91;

    .line 684
    .line 685
    iget-object v3, v3, Ll91;->ζ:Ljava/lang/Object;

    .line 686
    .line 687
    check-cast v3, Ljava/lang/Number;

    .line 688
    .line 689
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 690
    .line 691
    .line 692
    move-result v3

    .line 693
    :cond_1a
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    move-object v5, v4

    .line 698
    check-cast v5, Ll91;

    .line 699
    .line 700
    iget-object v5, v5, Ll91;->ζ:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v5, Ljava/lang/Number;

    .line 703
    .line 704
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 705
    .line 706
    .line 707
    move-result v5

    .line 708
    invoke-static {v3, v5}, Ljava/lang/Float;->compare(FF)I

    .line 709
    .line 710
    .line 711
    move-result v6

    .line 712
    if-lez v6, :cond_1b

    .line 713
    .line 714
    move-object v2, v4

    .line 715
    move v3, v5

    .line 716
    :cond_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    if-nez v4, :cond_1a

    .line 721
    .line 722
    :goto_b
    check-cast v2, Ll91;

    .line 723
    .line 724
    if-nez v2, :cond_1c

    .line 725
    .line 726
    :goto_c
    const/4 v2, 0x0

    .line 727
    goto :goto_e

    .line 728
    :cond_1c
    iget-object v1, v2, Ll91;->ε:Ljava/lang/Object;

    .line 729
    .line 730
    move-object v3, v1

    .line 731
    check-cast v3, Lpa0;

    .line 732
    .line 733
    iget-object v2, v2, Ll91;->ζ:Ljava/lang/Object;

    .line 734
    .line 735
    check-cast v2, Ljava/lang/Number;

    .line 736
    .line 737
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 738
    .line 739
    .line 740
    move-result v2

    .line 741
    cmpg-float v2, v2, v11

    .line 742
    .line 743
    if-gtz v2, :cond_1d

    .line 744
    .line 745
    move-object v2, v1

    .line 746
    goto :goto_d

    .line 747
    :cond_1d
    const/4 v2, 0x0

    .line 748
    :goto_d
    check-cast v2, Lpa0;

    .line 749
    .line 750
    :goto_e
    iput-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->θ:Lpa0;

    .line 751
    .line 752
    if-nez v2, :cond_1e

    .line 753
    .line 754
    :goto_f
    return v16

    .line 755
    :cond_1e
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    const/4 v1, 0x1

    .line 760
    if-eqz v0, :cond_1f

    .line 761
    .line 762
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 763
    .line 764
    .line 765
    :cond_1f
    :goto_10
    return v1
.end method

.method public final performClick()Z
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0
.end method

.method public final α(F)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

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
    return p1
.end method

.method public final β(FFLandroid/graphics/Canvas;Ljava/lang/String;)V
    .locals 6

    .line 1
    const/high16 v0, 0x41c00000    # 24.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x41900000    # 18.0f

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sub-float v3, p1, v0

    .line 14
    .line 15
    sub-float v4, p2, v2

    .line 16
    .line 17
    add-float/2addr v0, p1

    .line 18
    add-float/2addr v2, p2

    .line 19
    iget-object v5, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ο:Landroid/graphics/RectF;

    .line 20
    .line 21
    invoke-virtual {v5, v3, v4, v0, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v2, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->μ:Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-virtual {p3, v5, v0, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ν:Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget v1, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 44
    .line 45
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 46
    .line 47
    add-float/2addr v1, v0

    .line 48
    const/high16 v0, 0x40000000    # 2.0f

    .line 49
    .line 50
    div-float/2addr v1, v0

    .line 51
    sub-float/2addr p2, v1

    .line 52
    invoke-virtual {p3, p4, p1, p2, p0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final γ(Landroid/graphics/Canvas;FLv90;Ljava/lang/String;Z)V
    .locals 6

    .line 1
    iget v1, p3, Lv90;->α:F

    .line 2
    .line 3
    iget v3, p3, Lv90;->γ:F

    .line 4
    .line 5
    iget-object v5, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->λ:Landroid/graphics/Paint;

    .line 6
    .line 7
    move v4, p2

    .line 8
    move-object v0, p1

    .line 9
    move v2, p2

    .line 10
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 11
    .line 12
    .line 13
    iget v1, p3, Lv90;->α:F

    .line 14
    .line 15
    iget v3, p3, Lv90;->γ:F

    .line 16
    .line 17
    iget-object v5, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->κ:Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 20
    .line 21
    .line 22
    iget v1, p3, Lv90;->α:F

    .line 23
    .line 24
    invoke-virtual {p3}, Lv90;->β()F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz p5, :cond_0

    .line 29
    .line 30
    const v3, 0x3f3851ec    # 0.72f

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const v3, 0x3da3d70a    # 0.08f

    .line 35
    .line 36
    .line 37
    :goto_0
    mul-float/2addr v2, v3

    .line 38
    add-float/2addr v2, v1

    .line 39
    const/high16 v1, 0x42400000    # 48.0f

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    int-to-float v3, v3

    .line 50
    const/high16 v4, 0x40000000    # 2.0f

    .line 51
    .line 52
    div-float/2addr v3, v4

    .line 53
    cmpl-float v4, v1, v3

    .line 54
    .line 55
    if-lez v4, :cond_1

    .line 56
    .line 57
    move v1, v3

    .line 58
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    int-to-float v3, v3

    .line 63
    sub-float/2addr v3, v1

    .line 64
    invoke-static {p2, v1, v3}, Lj81;->λ(FFF)F

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const-string v3, "\u2195"

    .line 69
    .line 70
    invoke-virtual {p0, v2, v1, p1, v3}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->β(FFLandroid/graphics/Canvas;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/high16 v3, 0x42080000    # 34.0f

    .line 74
    .line 75
    invoke-virtual {p0, v3}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz p5, :cond_2

    .line 80
    .line 81
    add-float/2addr v1, v3

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    sub-float/2addr v1, v3

    .line 84
    :goto_1
    invoke-virtual {p0, v2, v1, p1, p4}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->δ(FFLandroid/graphics/Canvas;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final δ(FFLandroid/graphics/Canvas;Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ξ:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/high16 v2, 0x40000000    # 2.0f

    .line 8
    .line 9
    div-float/2addr v1, v2

    .line 10
    const/high16 v3, 0x41000000    # 8.0f

    .line 11
    .line 12
    invoke-virtual {p0, v3}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    add-float/2addr v1, v3

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    int-to-float v3, v3

    .line 22
    div-float/2addr v3, v2

    .line 23
    cmpl-float v4, v1, v3

    .line 24
    .line 25
    if-lez v4, :cond_0

    .line 26
    .line 27
    move v1, v3

    .line 28
    :cond_0
    const/high16 v3, 0x41400000    # 12.0f

    .line 29
    .line 30
    invoke-virtual {p0, v3}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    int-to-float v4, v4

    .line 39
    div-float/2addr v4, v2

    .line 40
    cmpl-float v5, v3, v4

    .line 41
    .line 42
    if-lez v5, :cond_1

    .line 43
    .line 44
    move v3, v4

    .line 45
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    int-to-float v4, v4

    .line 50
    sub-float/2addr v4, v1

    .line 51
    invoke-static {p1, v1, v4}, Lj81;->λ(FFF)F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    int-to-float v4, v4

    .line 60
    sub-float/2addr v4, v3

    .line 61
    invoke-static {p2, v3, v4}, Lj81;->λ(FFF)F

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    sub-float v4, p1, v1

    .line 66
    .line 67
    sub-float v5, p2, v3

    .line 68
    .line 69
    add-float/2addr v1, p1

    .line 70
    add-float/2addr v3, p2

    .line 71
    iget-object v6, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ο:Landroid/graphics/RectF;

    .line 72
    .line 73
    invoke-virtual {v6, v4, v5, v1, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 74
    .line 75
    .line 76
    const/high16 v1, 0x41200000    # 10.0f

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    iget-object p0, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->μ:Landroid/graphics/Paint;

    .line 87
    .line 88
    invoke-virtual {p3, v6, v3, v1, p0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    iget v1, p0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 96
    .line 97
    iget p0, p0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 98
    .line 99
    add-float/2addr v1, p0

    .line 100
    div-float/2addr v1, v2

    .line 101
    sub-float/2addr p2, v1

    .line 102
    invoke-virtual {p3, p4, p1, p2, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final ε(Landroid/graphics/Canvas;FLv90;Ljava/lang/String;Z)V
    .locals 6

    .line 1
    iget v2, p3, Lv90;->β:F

    .line 2
    .line 3
    iget v4, p3, Lv90;->δ:F

    .line 4
    .line 5
    iget-object v5, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->λ:Landroid/graphics/Paint;

    .line 6
    .line 7
    move v3, p2

    .line 8
    move-object v0, p1

    .line 9
    move v1, p2

    .line 10
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 11
    .line 12
    .line 13
    iget v2, p3, Lv90;->β:F

    .line 14
    .line 15
    iget v4, p3, Lv90;->δ:F

    .line 16
    .line 17
    iget-object v5, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->κ:Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 20
    .line 21
    .line 22
    const/high16 v1, 0x42400000    # 48.0f

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-float v2, v2

    .line 33
    const/high16 v3, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr v2, v3

    .line 36
    cmpl-float v3, v1, v2

    .line 37
    .line 38
    if-lez v3, :cond_0

    .line 39
    .line 40
    move v1, v2

    .line 41
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    int-to-float v2, v2

    .line 46
    sub-float/2addr v2, v1

    .line 47
    invoke-static {p2, v1, v2}, Lj81;->λ(FFF)F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget v2, p3, Lv90;->β:F

    .line 52
    .line 53
    invoke-virtual {p3}, Lv90;->α()F

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    const v4, 0x3f3851ec    # 0.72f

    .line 58
    .line 59
    .line 60
    mul-float/2addr v3, v4

    .line 61
    add-float/2addr v3, v2

    .line 62
    const-string v2, "\u2194"

    .line 63
    .line 64
    invoke-virtual {p0, v1, v3, p1, v2}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->β(FFLandroid/graphics/Canvas;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/high16 v2, 0x422c0000    # 43.0f

    .line 68
    .line 69
    invoke-virtual {p0, v2}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->α(F)F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz p5, :cond_1

    .line 74
    .line 75
    add-float/2addr v1, v2

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    sub-float/2addr v1, v2

    .line 78
    :goto_0
    invoke-virtual {p0, v1, v3, p1, p4}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->δ(FFLandroid/graphics/Canvas;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final ζ(IF)I
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    mul-float/2addr p2, p1

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 12
    .line 13
    div-float/2addr p2, p0

    .line 14
    invoke-static {p2}, Ljx0;->в(F)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-gez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :cond_0
    return p0
.end method

.method public final η(Lx90;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->η:Lx90;

    .line 5
    .line 6
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 9
    .line 10
    invoke-static {v0, p1}, Li2;->Β(Lw90;Lx90;)Lw90;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 15
    .line 16
    invoke-static {p1, v0}, Lw90;->β(Lw90;Lw90;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iput-object p1, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ε:Lm3;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lm3;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final θ(Lpa0;FF)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_a

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-gtz v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    sget-object v1, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    int-to-float v2, v2

    .line 29
    iget-object v3, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 30
    .line 31
    invoke-static {v1, v2, v3}, Li2;->ι(FFLw90;)Lv90;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget v2, v1, Lv90;->α:F

    .line 36
    .line 37
    sub-float v2, p2, v2

    .line 38
    .line 39
    invoke-virtual {v1}, Lv90;->β()F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    div-float/2addr v2, v3

    .line 44
    const/4 v3, 0x0

    .line 45
    const/high16 v4, 0x3f800000    # 1.0f

    .line 46
    .line 47
    invoke-static {v2, v3, v4}, Lj81;->λ(FFF)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    iget v5, v1, Lv90;->β:F

    .line 52
    .line 53
    sub-float v5, p3, v5

    .line 54
    .line 55
    invoke-virtual {v1}, Lv90;->α()F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    div-float/2addr v5, v1

    .line 60
    invoke-static {v5, v3, v4}, Lj81;->λ(FFF)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    const v6, 0x3f59999a    # 0.85f

    .line 69
    .line 70
    .line 71
    const v7, 0x3f333333    # 0.7f

    .line 72
    .line 73
    .line 74
    const v8, 0x3ee66666    # 0.45f

    .line 75
    .line 76
    .line 77
    const v9, 0x3eb33333    # 0.35f

    .line 78
    .line 79
    .line 80
    const v10, 0x3e19999a    # 0.15f

    .line 81
    .line 82
    .line 83
    packed-switch v5, :pswitch_data_0

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lγ;->κ()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_0
    iget-object v11, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 91
    .line 92
    iget v2, v11, Lw90;->γ:F

    .line 93
    .line 94
    add-float/2addr v2, v10

    .line 95
    invoke-static {v1, v2, v6}, Lj81;->λ(FFF)F

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    const/16 v19, 0x0

    .line 100
    .line 101
    const/16 v20, 0xf7

    .line 102
    .line 103
    const/4 v12, 0x0

    .line 104
    const/4 v13, 0x0

    .line 105
    const/4 v14, 0x0

    .line 106
    const/16 v16, 0x0

    .line 107
    .line 108
    const/16 v17, 0x0

    .line 109
    .line 110
    const/16 v18, 0x0

    .line 111
    .line 112
    invoke-static/range {v11 .. v20}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    goto/16 :goto_0

    .line 117
    .line 118
    :pswitch_1
    iget-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 119
    .line 120
    iget v3, v2, Lw90;->δ:F

    .line 121
    .line 122
    sub-float/2addr v3, v10

    .line 123
    invoke-static {v1, v10, v3}, Lj81;->λ(FFF)F

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    const/4 v10, 0x0

    .line 128
    const/16 v11, 0xfb

    .line 129
    .line 130
    const/4 v3, 0x0

    .line 131
    const/4 v4, 0x0

    .line 132
    const/4 v6, 0x0

    .line 133
    const/4 v7, 0x0

    .line 134
    const/4 v8, 0x0

    .line 135
    const/4 v9, 0x0

    .line 136
    invoke-static/range {v2 .. v11}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :pswitch_2
    iget-object v1, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 143
    .line 144
    iget v3, v1, Lw90;->α:F

    .line 145
    .line 146
    add-float/2addr v3, v10

    .line 147
    invoke-static {v2, v3, v6}, Lj81;->λ(FFF)F

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    const/4 v10, 0x0

    .line 152
    const/16 v11, 0xfd

    .line 153
    .line 154
    const/4 v3, 0x0

    .line 155
    const/4 v5, 0x0

    .line 156
    const/4 v6, 0x0

    .line 157
    const/4 v7, 0x0

    .line 158
    const/4 v8, 0x0

    .line 159
    const/4 v9, 0x0

    .line 160
    move-object v2, v1

    .line 161
    invoke-static/range {v2 .. v11}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :pswitch_3
    iget-object v1, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 168
    .line 169
    iget v3, v1, Lw90;->β:F

    .line 170
    .line 171
    sub-float/2addr v3, v10

    .line 172
    invoke-static {v2, v10, v3}, Lj81;->λ(FFF)F

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    const/4 v10, 0x0

    .line 177
    const/16 v11, 0xfe

    .line 178
    .line 179
    const/4 v4, 0x0

    .line 180
    const/4 v5, 0x0

    .line 181
    const/4 v6, 0x0

    .line 182
    const/4 v7, 0x0

    .line 183
    const/4 v8, 0x0

    .line 184
    const/4 v9, 0x0

    .line 185
    move-object v2, v1

    .line 186
    invoke-static/range {v2 .. v11}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :pswitch_4
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    int-to-float v1, v1

    .line 197
    sub-float v1, v1, p3

    .line 198
    .line 199
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    int-to-float v2, v2

    .line 204
    div-float/2addr v1, v2

    .line 205
    invoke-static {v1, v3, v4}, Lj81;->λ(FFF)F

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    iget-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->η:Lx90;

    .line 210
    .line 211
    iget-boolean v2, v2, Lx90;->β:Z

    .line 212
    .line 213
    if-eqz v2, :cond_1

    .line 214
    .line 215
    invoke-static {v1, v3, v9}, Lj81;->λ(FFF)F

    .line 216
    .line 217
    .line 218
    move-result v17

    .line 219
    iget-object v10, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 220
    .line 221
    const/16 v16, 0x0

    .line 222
    .line 223
    const/16 v19, 0x3f

    .line 224
    .line 225
    const/4 v11, 0x0

    .line 226
    const/4 v12, 0x0

    .line 227
    const/4 v13, 0x0

    .line 228
    const/4 v14, 0x0

    .line 229
    const/4 v15, 0x0

    .line 230
    move/from16 v18, v17

    .line 231
    .line 232
    invoke-static/range {v10 .. v19}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :cond_1
    iget-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 239
    .line 240
    iget v2, v2, Lw90;->η:F

    .line 241
    .line 242
    sub-float/2addr v7, v2

    .line 243
    invoke-static {v8, v7}, Ljava/lang/Math;->min(FF)F

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    cmpg-float v4, v2, v3

    .line 248
    .line 249
    if-gez v4, :cond_2

    .line 250
    .line 251
    move v2, v3

    .line 252
    :cond_2
    iget-object v4, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 253
    .line 254
    invoke-static {v1, v3, v2}, Lj81;->λ(FFF)F

    .line 255
    .line 256
    .line 257
    move-result v12

    .line 258
    const/16 v13, 0x7f

    .line 259
    .line 260
    const/4 v5, 0x0

    .line 261
    const/4 v6, 0x0

    .line 262
    const/4 v7, 0x0

    .line 263
    const/4 v8, 0x0

    .line 264
    const/4 v9, 0x0

    .line 265
    const/4 v10, 0x0

    .line 266
    const/4 v11, 0x0

    .line 267
    invoke-static/range {v4 .. v13}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :pswitch_5
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    int-to-float v1, v1

    .line 278
    div-float v1, p3, v1

    .line 279
    .line 280
    invoke-static {v1, v3, v4}, Lj81;->λ(FFF)F

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    iget-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->η:Lx90;

    .line 285
    .line 286
    iget-boolean v2, v2, Lx90;->β:Z

    .line 287
    .line 288
    if-eqz v2, :cond_3

    .line 289
    .line 290
    invoke-static {v1, v3, v9}, Lj81;->λ(FFF)F

    .line 291
    .line 292
    .line 293
    move-result v17

    .line 294
    iget-object v10, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 295
    .line 296
    const/16 v16, 0x0

    .line 297
    .line 298
    const/16 v19, 0x3f

    .line 299
    .line 300
    const/4 v11, 0x0

    .line 301
    const/4 v12, 0x0

    .line 302
    const/4 v13, 0x0

    .line 303
    const/4 v14, 0x0

    .line 304
    const/4 v15, 0x0

    .line 305
    move/from16 v18, v17

    .line 306
    .line 307
    invoke-static/range {v10 .. v19}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    goto/16 :goto_0

    .line 312
    .line 313
    :cond_3
    iget-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 314
    .line 315
    iget v2, v2, Lw90;->θ:F

    .line 316
    .line 317
    sub-float/2addr v7, v2

    .line 318
    invoke-static {v8, v7}, Ljava/lang/Math;->min(FF)F

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    cmpg-float v4, v2, v3

    .line 323
    .line 324
    if-gez v4, :cond_4

    .line 325
    .line 326
    move v2, v3

    .line 327
    :cond_4
    iget-object v4, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 328
    .line 329
    invoke-static {v1, v3, v2}, Lj81;->λ(FFF)F

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    const/4 v12, 0x0

    .line 334
    const/16 v13, 0xbf

    .line 335
    .line 336
    const/4 v5, 0x0

    .line 337
    const/4 v6, 0x0

    .line 338
    const/4 v7, 0x0

    .line 339
    const/4 v8, 0x0

    .line 340
    const/4 v9, 0x0

    .line 341
    const/4 v10, 0x0

    .line 342
    invoke-static/range {v4 .. v13}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :pswitch_6
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    int-to-float v1, v1

    .line 353
    sub-float v1, v1, p2

    .line 354
    .line 355
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    int-to-float v2, v2

    .line 360
    div-float/2addr v1, v2

    .line 361
    invoke-static {v1, v3, v4}, Lj81;->λ(FFF)F

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    iget-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->η:Lx90;

    .line 366
    .line 367
    iget-boolean v2, v2, Lx90;->α:Z

    .line 368
    .line 369
    if-eqz v2, :cond_5

    .line 370
    .line 371
    invoke-static {v1, v3, v9}, Lj81;->λ(FFF)F

    .line 372
    .line 373
    .line 374
    move-result v15

    .line 375
    iget-object v10, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 376
    .line 377
    const/16 v18, 0x0

    .line 378
    .line 379
    const/16 v19, 0xcf

    .line 380
    .line 381
    const/4 v11, 0x0

    .line 382
    const/4 v12, 0x0

    .line 383
    const/4 v13, 0x0

    .line 384
    const/4 v14, 0x0

    .line 385
    const/16 v17, 0x0

    .line 386
    .line 387
    move/from16 v16, v15

    .line 388
    .line 389
    invoke-static/range {v10 .. v19}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    goto :goto_0

    .line 394
    :cond_5
    iget-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 395
    .line 396
    iget v2, v2, Lw90;->ε:F

    .line 397
    .line 398
    sub-float/2addr v7, v2

    .line 399
    invoke-static {v8, v7}, Ljava/lang/Math;->min(FF)F

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    cmpg-float v4, v2, v3

    .line 404
    .line 405
    if-gez v4, :cond_6

    .line 406
    .line 407
    move v2, v3

    .line 408
    :cond_6
    iget-object v4, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 409
    .line 410
    invoke-static {v1, v3, v2}, Lj81;->λ(FFF)F

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    const/4 v12, 0x0

    .line 415
    const/16 v13, 0xdf

    .line 416
    .line 417
    const/4 v5, 0x0

    .line 418
    const/4 v6, 0x0

    .line 419
    const/4 v7, 0x0

    .line 420
    const/4 v8, 0x0

    .line 421
    const/4 v9, 0x0

    .line 422
    const/4 v11, 0x0

    .line 423
    invoke-static/range {v4 .. v13}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    goto :goto_0

    .line 428
    :pswitch_7
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    int-to-float v1, v1

    .line 433
    div-float v1, p2, v1

    .line 434
    .line 435
    invoke-static {v1, v3, v4}, Lj81;->λ(FFF)F

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    iget-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->η:Lx90;

    .line 440
    .line 441
    iget-boolean v2, v2, Lx90;->α:Z

    .line 442
    .line 443
    if-eqz v2, :cond_7

    .line 444
    .line 445
    invoke-static {v1, v3, v9}, Lj81;->λ(FFF)F

    .line 446
    .line 447
    .line 448
    move-result v15

    .line 449
    iget-object v10, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 450
    .line 451
    const/16 v18, 0x0

    .line 452
    .line 453
    const/16 v19, 0xcf

    .line 454
    .line 455
    const/4 v11, 0x0

    .line 456
    const/4 v12, 0x0

    .line 457
    const/4 v13, 0x0

    .line 458
    const/4 v14, 0x0

    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    move/from16 v16, v15

    .line 462
    .line 463
    invoke-static/range {v10 .. v19}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    goto :goto_0

    .line 468
    :cond_7
    iget-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 469
    .line 470
    iget v2, v2, Lw90;->ζ:F

    .line 471
    .line 472
    sub-float/2addr v7, v2

    .line 473
    invoke-static {v8, v7}, Ljava/lang/Math;->min(FF)F

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    cmpg-float v4, v2, v3

    .line 478
    .line 479
    if-gez v4, :cond_8

    .line 480
    .line 481
    move v2, v3

    .line 482
    :cond_8
    iget-object v4, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 483
    .line 484
    invoke-static {v1, v3, v2}, Lj81;->λ(FFF)F

    .line 485
    .line 486
    .line 487
    move-result v9

    .line 488
    const/4 v12, 0x0

    .line 489
    const/16 v13, 0xef

    .line 490
    .line 491
    const/4 v5, 0x0

    .line 492
    const/4 v6, 0x0

    .line 493
    const/4 v7, 0x0

    .line 494
    const/4 v8, 0x0

    .line 495
    const/4 v10, 0x0

    .line 496
    const/4 v11, 0x0

    .line 497
    invoke-static/range {v4 .. v13}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    :goto_0
    invoke-static {v1}, Li2;->φ(Lw90;)Lw90;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    iget-object v2, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 506
    .line 507
    invoke-static {v1, v2}, Lw90;->β(Lw90;Lw90;)Z

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    if-eqz v2, :cond_9

    .line 512
    .line 513
    goto :goto_1

    .line 514
    :cond_9
    iput-object v1, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 515
    .line 516
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 517
    .line 518
    .line 519
    iget-object v0, v0, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ε:Lm3;

    .line 520
    .line 521
    invoke-virtual {v0, v1}, Lm3;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    :cond_a
    :goto_1
    return-void

    .line 525
    :pswitch_data_0
    .packed-switch 0x0
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
