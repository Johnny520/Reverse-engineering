.class public final Lэ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/view/accessibility/AccessibilityNodeInfo;

.field public β:I

.field public γ:I


# direct methods
.method public constructor <init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lэ;->β:I

    .line 6
    .line 7
    iput v0, p0, Lэ;->γ:I

    .line 8
    .line 9
    iput-object p1, p0, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 10
    .line 11
    return-void
.end method

.method public static δ(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    sparse-switch p0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    packed-switch p0, :pswitch_data_1

    .line 14
    .line 15
    .line 16
    packed-switch p0, :pswitch_data_2

    .line 17
    .line 18
    .line 19
    const-string p0, "ACTION_UNKNOWN"

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    const-string p0, "ACTION_DRAG_CANCEL"

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_1
    const-string p0, "ACTION_DRAG_DROP"

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_2
    const-string p0, "ACTION_DRAG_START"

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_3
    const-string p0, "ACTION_IME_ENTER"

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_4
    const-string p0, "ACTION_PRESS_AND_HOLD"

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_5
    const-string p0, "ACTION_PAGE_RIGHT"

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_6
    const-string p0, "ACTION_PAGE_LEFT"

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_7
    const-string p0, "ACTION_PAGE_DOWN"

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_8
    const-string p0, "ACTION_PAGE_UP"

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_9
    const-string p0, "ACTION_HIDE_TOOLTIP"

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_a
    const-string p0, "ACTION_SHOW_TOOLTIP"

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_b
    const-string p0, "ACTION_SET_PROGRESS"

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_c
    const-string p0, "ACTION_CONTEXT_CLICK"

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_d
    const-string p0, "ACTION_SCROLL_RIGHT"

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_e
    const-string p0, "ACTION_SCROLL_DOWN"

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_f
    const-string p0, "ACTION_SCROLL_LEFT"

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_10
    const-string p0, "ACTION_SCROLL_UP"

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_11
    const-string p0, "ACTION_SCROLL_TO_POSITION"

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_12
    const-string p0, "ACTION_SHOW_ON_SCREEN"

    .line 77
    .line 78
    return-object p0

    .line 79
    :sswitch_0
    const-string p0, "ACTION_SCROLL_IN_DIRECTION"

    .line 80
    .line 81
    return-object p0

    .line 82
    :sswitch_1
    const-string p0, "ACTION_MOVE_WINDOW"

    .line 83
    .line 84
    return-object p0

    .line 85
    :sswitch_2
    const-string p0, "ACTION_SET_TEXT"

    .line 86
    .line 87
    return-object p0

    .line 88
    :sswitch_3
    const-string p0, "ACTION_COLLAPSE"

    .line 89
    .line 90
    return-object p0

    .line 91
    :sswitch_4
    const-string p0, "ACTION_EXPAND"

    .line 92
    .line 93
    return-object p0

    .line 94
    :sswitch_5
    const-string p0, "ACTION_SET_SELECTION"

    .line 95
    .line 96
    return-object p0

    .line 97
    :sswitch_6
    const-string p0, "ACTION_CUT"

    .line 98
    .line 99
    return-object p0

    .line 100
    :sswitch_7
    const-string p0, "ACTION_PASTE"

    .line 101
    .line 102
    return-object p0

    .line 103
    :sswitch_8
    const-string p0, "ACTION_COPY"

    .line 104
    .line 105
    return-object p0

    .line 106
    :sswitch_9
    const-string p0, "ACTION_SCROLL_BACKWARD"

    .line 107
    .line 108
    return-object p0

    .line 109
    :sswitch_a
    const-string p0, "ACTION_SCROLL_FORWARD"

    .line 110
    .line 111
    return-object p0

    .line 112
    :sswitch_b
    const-string p0, "ACTION_PREVIOUS_HTML_ELEMENT"

    .line 113
    .line 114
    return-object p0

    .line 115
    :sswitch_c
    const-string p0, "ACTION_NEXT_HTML_ELEMENT"

    .line 116
    .line 117
    return-object p0

    .line 118
    :sswitch_d
    const-string p0, "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY"

    .line 119
    .line 120
    return-object p0

    .line 121
    :sswitch_e
    const-string p0, "ACTION_NEXT_AT_MOVEMENT_GRANULARITY"

    .line 122
    .line 123
    return-object p0

    .line 124
    :sswitch_f
    const-string p0, "ACTION_CLEAR_ACCESSIBILITY_FOCUS"

    .line 125
    .line 126
    return-object p0

    .line 127
    :sswitch_10
    const-string p0, "ACTION_ACCESSIBILITY_FOCUS"

    .line 128
    .line 129
    return-object p0

    .line 130
    :sswitch_11
    const-string p0, "ACTION_LONG_CLICK"

    .line 131
    .line 132
    return-object p0

    .line 133
    :sswitch_12
    const-string p0, "ACTION_CLICK"

    .line 134
    .line 135
    return-object p0

    .line 136
    :sswitch_13
    const-string p0, "ACTION_CLEAR_SELECTION"

    .line 137
    .line 138
    return-object p0

    .line 139
    :sswitch_14
    const-string p0, "ACTION_SELECT"

    .line 140
    .line 141
    return-object p0

    .line 142
    :cond_0
    const-string p0, "ACTION_CLEAR_FOCUS"

    .line 143
    .line 144
    return-object p0

    .line 145
    :cond_1
    const-string p0, "ACTION_FOCUS"

    .line 146
    .line 147
    return-object p0

    .line 148
    nop

    .line 149
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_14
        0x8 -> :sswitch_13
        0x10 -> :sswitch_12
        0x20 -> :sswitch_11
        0x40 -> :sswitch_10
        0x80 -> :sswitch_f
        0x100 -> :sswitch_e
        0x200 -> :sswitch_d
        0x400 -> :sswitch_c
        0x800 -> :sswitch_b
        0x1000 -> :sswitch_a
        0x2000 -> :sswitch_9
        0x4000 -> :sswitch_8
        0x8000 -> :sswitch_7
        0x10000 -> :sswitch_6
        0x20000 -> :sswitch_5
        0x40000 -> :sswitch_4
        0x80000 -> :sswitch_3
        0x200000 -> :sswitch_2
        0x1020042 -> :sswitch_1
        0x102005e -> :sswitch_0
    .end sparse-switch

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    :pswitch_data_0
    .packed-switch 0x1020036
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    :pswitch_data_1
    .packed-switch 0x1020044
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    :pswitch_data_2
    .packed-switch 0x1020054
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    instance-of v2, p1, Lэ;

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    return v1

    .line 14
    :cond_2
    check-cast p1, Lэ;

    .line 15
    .line 16
    iget-object v2, p1, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 17
    .line 18
    iget-object v3, p0, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 19
    .line 20
    if-nez v3, :cond_3

    .line 21
    .line 22
    if-eqz v2, :cond_4

    .line 23
    .line 24
    return v1

    .line 25
    :cond_3
    invoke-virtual {v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_4

    .line 30
    .line 31
    return v1

    .line 32
    :cond_4
    iget v2, p0, Lэ;->γ:I

    .line 33
    .line 34
    iget v3, p1, Lэ;->γ:I

    .line 35
    .line 36
    if-eq v2, v3, :cond_5

    .line 37
    .line 38
    return v1

    .line 39
    :cond_5
    iget p0, p0, Lэ;->β:I

    .line 40
    .line 41
    iget p1, p1, Lэ;->β:I

    .line 42
    .line 43
    if-eq p0, p1, :cond_6

    .line 44
    .line 45
    return v1

    .line 46
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInParent(Landroid/graphics/Rect;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v4, "; boundsInParent: "

    .line 26
    .line 27
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v4, "; boundsInScreen: "

    .line 46
    .line 47
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const/16 v4, 0x22

    .line 63
    .line 64
    if-lt v3, v4, :cond_0

    .line 65
    .line 66
    invoke-static {v2, v1}, Lп;->γ(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY"

    .line 75
    .line 76
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Landroid/graphics/Rect;

    .line 81
    .line 82
    if-eqz v5, :cond_1

    .line 83
    .line 84
    iget v6, v5, Landroid/graphics/Rect;->left:I

    .line 85
    .line 86
    iget v7, v5, Landroid/graphics/Rect;->top:I

    .line 87
    .line 88
    iget v8, v5, Landroid/graphics/Rect;->right:I

    .line 89
    .line 90
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 91
    .line 92
    invoke-virtual {v1, v6, v7, v8, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 93
    .line 94
    .line 95
    :cond_1
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v6, "; boundsInWindow: "

    .line 98
    .line 99
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, "; packageName: "

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getPackageName()Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, "; className: "

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getClassName()Ljava/lang/CharSequence;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v1, "; text: "

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lэ;->ζ()Ljava/lang/CharSequence;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v1, "; error: "

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getError()Ljava/lang/CharSequence;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v1, "; maxTextLength: "

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMaxTextLength()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v1, "; stateDescription: "

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getStateDescription()Ljava/lang/CharSequence;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v1, "; contentDescription: "

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v1, "; supplementalDescription: "

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const/16 v1, 0x24

    .line 202
    .line 203
    if-lt v3, v1, :cond_2

    .line 204
    .line 205
    invoke-static {v2}, Lщ;->γ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/lang/CharSequence;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    goto :goto_1

    .line 210
    :cond_2
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"

    .line 215
    .line 216
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    :goto_1
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v5, "; tooltipText: "

    .line 224
    .line 225
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getTooltipText()Ljava/lang/CharSequence;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string v5, "; viewIdResName: "

    .line 236
    .line 237
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getViewIdResourceName()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v5, "; uniqueId: "

    .line 248
    .line 249
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const/16 v5, 0x21

    .line 253
    .line 254
    if-lt v3, v5, :cond_3

    .line 255
    .line 256
    invoke-static {v2}, Lш;->γ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    goto :goto_2

    .line 261
    :cond_3
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"

    .line 266
    .line 267
    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    :goto_2
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    const-string v6, "; checkable: "

    .line 275
    .line 276
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isCheckable()Z

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string v6, "; checked: "

    .line 287
    .line 288
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    if-lt v3, v1, :cond_4

    .line 292
    .line 293
    invoke-static {v2}, Lщ;->α(Landroid/view/accessibility/AccessibilityNodeInfo;)I

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    goto :goto_3

    .line 298
    :cond_4
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY"

    .line 303
    .line 304
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    :goto_3
    const-string v7, "PARTIAL"

    .line 313
    .line 314
    const/4 v8, 0x2

    .line 315
    const/4 v9, 0x1

    .line 316
    if-ne v6, v9, :cond_5

    .line 317
    .line 318
    const-string v6, "TRUE"

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_5
    if-ne v6, v8, :cond_6

    .line 322
    .line 323
    move-object v6, v7

    .line 324
    goto :goto_4

    .line 325
    :cond_6
    const-string v6, "FALSE"

    .line 326
    .line 327
    :goto_4
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string v6, "; fieldRequired: "

    .line 331
    .line 332
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    if-lt v3, v1, :cond_7

    .line 336
    .line 337
    invoke-static {v2}, Lщ;->δ(Landroid/view/accessibility/AccessibilityNodeInfo;)Z

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    goto :goto_5

    .line 342
    :cond_7
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"

    .line 347
    .line 348
    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    :goto_5
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    const-string v6, "; focusable: "

    .line 356
    .line 357
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    const-string v6, "; focused: "

    .line 368
    .line 369
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 373
    .line 374
    .line 375
    move-result v6

    .line 376
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    const-string v6, "; selected: "

    .line 380
    .line 381
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isSelected()Z

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    const-string v6, "; clickable: "

    .line 392
    .line 393
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    const-string v6, "; longClickable: "

    .line 404
    .line 405
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isLongClickable()Z

    .line 409
    .line 410
    .line 411
    move-result v6

    .line 412
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    const-string v6, "; contextClickable: "

    .line 416
    .line 417
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isContextClickable()Z

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    const-string v6, "; expandedState: "

    .line 428
    .line 429
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    const/4 v6, 0x0

    .line 433
    if-lt v3, v1, :cond_8

    .line 434
    .line 435
    invoke-static {v2}, Lщ;->β(Landroid/view/accessibility/AccessibilityNodeInfo;)I

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    goto :goto_6

    .line 440
    :cond_8
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY"

    .line 445
    .line 446
    invoke-virtual {v1, v10, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    :goto_6
    if-eqz v1, :cond_b

    .line 451
    .line 452
    if-eq v1, v9, :cond_a

    .line 453
    .line 454
    if-eq v1, v8, :cond_c

    .line 455
    .line 456
    const/4 v7, 0x3

    .line 457
    if-eq v1, v7, :cond_9

    .line 458
    .line 459
    const-string v7, "UNKNOWN"

    .line 460
    .line 461
    goto :goto_7

    .line 462
    :cond_9
    const-string v7, "FULL"

    .line 463
    .line 464
    goto :goto_7

    .line 465
    :cond_a
    const-string v7, "COLLAPSED"

    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_b
    const-string v7, "UNDEFINED"

    .line 469
    .line 470
    :cond_c
    :goto_7
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    const-string v1, "; enabled: "

    .line 474
    .line 475
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isEnabled()Z

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    const-string v1, "; password: "

    .line 486
    .line 487
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isPassword()Z

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    new-instance v1, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    const-string v7, "; scrollable: "

    .line 500
    .line 501
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isScrollable()Z

    .line 505
    .line 506
    .line 507
    move-result v7

    .line 508
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    const-string v1, "; containerTitle: "

    .line 519
    .line 520
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    if-lt v3, v4, :cond_d

    .line 524
    .line 525
    invoke-static {v2}, Lп;->δ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/lang/CharSequence;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    goto :goto_8

    .line 530
    :cond_d
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"

    .line 535
    .line 536
    invoke-virtual {v1, v7}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    :goto_8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    const-string v1, "; granularScrollingSupported: "

    .line 544
    .line 545
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v1, 0x4000000

    .line 549
    .line 550
    invoke-virtual {p0, v1}, Lэ;->ε(I)Z

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    const-string v1, "; importantForAccessibility: "

    .line 558
    .line 559
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isImportantForAccessibility()Z

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    const-string v1, "; visible: "

    .line 570
    .line 571
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z

    .line 575
    .line 576
    .line 577
    move-result v1

    .line 578
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    const-string v1, "; isTextSelectable: "

    .line 582
    .line 583
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    if-lt v3, v5, :cond_e

    .line 587
    .line 588
    invoke-static {v2}, Lш;->δ(Landroid/view/accessibility/AccessibilityNodeInfo;)Z

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    goto :goto_9

    .line 593
    :cond_e
    const/high16 v1, 0x800000

    .line 594
    .line 595
    invoke-virtual {p0, v1}, Lэ;->ε(I)Z

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    :goto_9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    const-string v1, "; accessibilityDataSensitive: "

    .line 603
    .line 604
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    if-lt v3, v4, :cond_f

    .line 608
    .line 609
    invoke-static {v2}, Lп;->η(Landroid/view/accessibility/AccessibilityNodeInfo;)Z

    .line 610
    .line 611
    .line 612
    move-result p0

    .line 613
    goto :goto_a

    .line 614
    :cond_f
    const/16 v1, 0x40

    .line 615
    .line 616
    invoke-virtual {p0, v1}, Lэ;->ε(I)Z

    .line 617
    .line 618
    .line 619
    move-result p0

    .line 620
    :goto_a
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    const-string p0, "; ["

    .line 624
    .line 625
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getActionList()Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object p0

    .line 632
    new-instance v1, Ljava/util/ArrayList;

    .line 633
    .line 634
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 635
    .line 636
    .line 637
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 638
    .line 639
    .line 640
    move-result v2

    .line 641
    move v3, v6

    .line 642
    :goto_b
    if-ge v3, v2, :cond_10

    .line 643
    .line 644
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v4

    .line 648
    new-instance v5, Lч;

    .line 649
    .line 650
    const/4 v7, 0x0

    .line 651
    invoke-direct {v5, v4, v6, v7, v7}, Lч;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Ljava/lang/Class;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 655
    .line 656
    .line 657
    add-int/lit8 v3, v3, 0x1

    .line 658
    .line 659
    goto :goto_b

    .line 660
    :cond_10
    :goto_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 661
    .line 662
    .line 663
    move-result p0

    .line 664
    if-ge v6, p0, :cond_13

    .line 665
    .line 666
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object p0

    .line 670
    check-cast p0, Lч;

    .line 671
    .line 672
    iget-object v2, p0, Lч;->α:Ljava/lang/Object;

    .line 673
    .line 674
    iget-object p0, p0, Lч;->α:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v2, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 677
    .line 678
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getId()I

    .line 679
    .line 680
    .line 681
    move-result v2

    .line 682
    invoke-static {v2}, Lэ;->δ(I)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    const-string v3, "ACTION_UNKNOWN"

    .line 687
    .line 688
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    move-result v3

    .line 692
    if-eqz v3, :cond_11

    .line 693
    .line 694
    move-object v3, p0

    .line 695
    check-cast v3, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 696
    .line 697
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getLabel()Ljava/lang/CharSequence;

    .line 698
    .line 699
    .line 700
    move-result-object v3

    .line 701
    if-eqz v3, :cond_11

    .line 702
    .line 703
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 704
    .line 705
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getLabel()Ljava/lang/CharSequence;

    .line 706
    .line 707
    .line 708
    move-result-object p0

    .line 709
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    :cond_11
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 717
    .line 718
    .line 719
    move-result p0

    .line 720
    sub-int/2addr p0, v9

    .line 721
    if-eq v6, p0, :cond_12

    .line 722
    .line 723
    const-string p0, ", "

    .line 724
    .line 725
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    :cond_12
    add-int/lit8 v6, v6, 0x1

    .line 729
    .line 730
    goto :goto_c

    .line 731
    :cond_13
    const-string p0, "]"

    .line 732
    .line 733
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object p0

    .line 740
    return-object p0
.end method

.method public final α(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final β(Lч;)V
    .locals 0

    .line 1
    iget-object p1, p1, Lч;->α:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 4
    .line 5
    iget-object p0, p0, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final γ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object p0, p0, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object v0
.end method

.method public final ε(I)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v1, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    and-int/2addr p0, p1

    .line 18
    if-ne p0, p1, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    return v0
.end method

.method public final ζ()Ljava/lang/CharSequence;
    .locals 11

    .line 1
    const-string v0, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lэ;->γ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lэ;->γ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lэ;->γ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v3, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Lэ;->γ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    .line 32
    .line 33
    invoke-virtual {p0, v4}, Lэ;->γ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    new-instance v5, Landroid/text/SpannableString;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const/4 v8, 0x0

    .line 52
    invoke-static {v6, v8, v7}, Landroid/text/TextUtils;->substring(Ljava/lang/CharSequence;II)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-direct {v5, v6}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-ge v8, v6, :cond_0

    .line 64
    .line 65
    new-instance v6, Lн;

    .line 66
    .line 67
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    check-cast v7, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    .line 82
    .line 83
    invoke-virtual {v9, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    invoke-direct {v6, v7, p0, v9}, Lн;-><init>(ILэ;I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    check-cast v9, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    check-cast v10, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    invoke-virtual {v5, v6, v7, v9, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 121
    .line 122
    .line 123
    add-int/lit8 v8, v8, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_0
    return-object v5

    .line 127
    :cond_1
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
.end method

.method public final η(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
