.class public final Lia;
.super Lx;


# static fields
.field public static final o:Landroid/graphics/Rect;

.field public static final p:Lvh;

.field public static final q:Lvh;


# instance fields
.field public final d:Landroid/graphics/Rect;

.field public final e:Landroid/graphics/Rect;

.field public final f:Landroid/graphics/Rect;

.field public final g:[I

.field public final h:Landroid/view/accessibility/AccessibilityManager;

.field public final i:Lcom/google/android/material/chip/Chip;

.field public j:Lmj;

.field public k:I

.field public l:I

.field public m:I

.field public final synthetic n:Lcom/google/android/material/chip/Chip;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    const/high16 v2, -0x80000000

    .line 7
    .line 8
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lia;->o:Landroid/graphics/Rect;

    .line 12
    .line 13
    new-instance v0, Lvh;

    .line 14
    .line 15
    const/16 v1, 0x14

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lia;->p:Lvh;

    .line 21
    .line 22
    new-instance v0, Lvh;

    .line 23
    .line 24
    const/16 v1, 0x15

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lia;->q:Lvh;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/chip/Chip;Lcom/google/android/material/chip/Chip;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lia;->n:Lcom/google/android/material/chip/Chip;

    .line 2
    .line 3
    invoke-direct {p0}, Lx;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lia;->d:Landroid/graphics/Rect;

    .line 12
    .line 13
    new-instance p1, Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lia;->e:Landroid/graphics/Rect;

    .line 19
    .line 20
    new-instance p1, Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lia;->f:Landroid/graphics/Rect;

    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    new-array p1, p1, [I

    .line 29
    .line 30
    iput-object p1, p0, Lia;->g:[I

    .line 31
    .line 32
    const/high16 p1, -0x80000000

    .line 33
    .line 34
    iput p1, p0, Lia;->k:I

    .line 35
    .line 36
    iput p1, p0, Lia;->l:I

    .line 37
    .line 38
    iput p1, p0, Lia;->m:I

    .line 39
    .line 40
    iput-object p2, p0, Lia;->i:Lcom/google/android/material/chip/Chip;

    .line 41
    .line 42
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v0, "accessibility"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    .line 53
    .line 54
    iput-object p1, p0, Lia;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    invoke-virtual {p2, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Lja0;->a:Ljava/util/WeakHashMap;

    .line 61
    .line 62
    invoke-static {p2}, Ls90;->c(Landroid/view/View;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_0

    .line 67
    .line 68
    invoke-static {p2, p1}, Ls90;->s(Landroid/view/View;I)V

    .line 69
    .line 70
    .line 71
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)Ll0;
    .locals 0

    .line 1
    iget-object p1, p0, Lia;->j:Lmj;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Lmj;

    .line 6
    .line 7
    invoke-direct {p1, p0}, Lmj;-><init>(Lia;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lia;->j:Lmj;

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lia;->j:Lmj;

    .line 13
    .line 14
    return-object p1
.end method

.method public final d(Landroid/view/View;Lj0;)V
    .locals 1

    .line 1
    iget-object p2, p2, Lj0;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    iget-object v0, p0, Lx;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lia;->n:Lcom/google/android/material/chip/Chip;

    .line 9
    .line 10
    iget-object v0, p1, Lcom/google/android/material/chip/Chip;->e:Lka;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, v0, Lka;->Q:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/google/android/material/chip/Chip;->getAccessibilityClassName()Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final j(I)Z
    .locals 3

    .line 1
    iget v0, p0, Lia;->l:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/high16 v0, -0x80000000

    .line 8
    .line 9
    iput v0, p0, Lia;->l:I

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, Lia;->n:Lcom/google/android/material/chip/Chip;

    .line 15
    .line 16
    iput-boolean v1, v2, Lcom/google/android/material/chip/Chip;->m:Z

    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/view/View;->refreshDrawableState()V

    .line 19
    .line 20
    .line 21
    :cond_1
    const/16 v1, 0x8

    .line 22
    .line 23
    invoke-virtual {p0, p1, v1}, Lia;->p(II)V

    .line 24
    .line 25
    .line 26
    return v0
.end method

.method public final k(I)Lj0;
    .locals 11

    .line 1
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lj0;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lj0;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 15
    .line 16
    .line 17
    const-string v3, "android.view.View"

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    sget-object v3, Lia;->o:Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    iget-object v4, p0, Lia;->i:Lcom/google/android/material/chip/Chip;

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    iget-object v6, v1, Lj0;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 37
    .line 38
    const-string v7, ""

    .line 39
    .line 40
    if-ne p1, v5, :cond_2

    .line 41
    .line 42
    iget-object v5, p0, Lia;->n:Lcom/google/android/material/chip/Chip;

    .line 43
    .line 44
    invoke-virtual {v5}, Lcom/google/android/material/chip/Chip;->getCloseIconContentDescription()Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    if-eqz v8, :cond_0

    .line 49
    .line 50
    invoke-virtual {v6, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    if-nez v10, :cond_1

    .line 67
    .line 68
    move-object v7, v8

    .line 69
    :cond_1
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    const v8, 0x7f100062

    .line 74
    .line 75
    .line 76
    invoke-virtual {v9, v8, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-virtual {v6, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    :goto_0
    invoke-static {v5}, Lcom/google/android/material/chip/Chip;->a(Lcom/google/android/material/chip/Chip;)Landroid/graphics/Rect;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {v6, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 92
    .line 93
    .line 94
    sget-object v7, Lh0;->e:Lh0;

    .line 95
    .line 96
    invoke-virtual {v1, v7}, Lj0;->b(Lh0;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, Landroid/view/View;->isEnabled()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    invoke-virtual {v6, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    sget-object v5, Lcom/google/android/material/chip/Chip;->w:Landroid/graphics/Rect;

    .line 111
    .line 112
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 113
    .line 114
    .line 115
    :goto_1
    invoke-virtual {v1}, Lj0;->e()Ljava/lang/CharSequence;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-nez v5, :cond_4

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    if-eqz v5, :cond_3

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    .line 129
    .line 130
    const-string v0, "Callbacks must add text or a content description in populateNodeForVirtualViewId()"

    .line 131
    .line 132
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_4
    :goto_2
    iget-object v5, p0, Lia;->e:Landroid/graphics/Rect;

    .line 137
    .line 138
    invoke-virtual {v1, v5}, Lj0;->d(Landroid/graphics/Rect;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-nez v5, :cond_11

    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getActions()I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    and-int/lit8 v6, v5, 0x40

    .line 152
    .line 153
    if-nez v6, :cond_10

    .line 154
    .line 155
    const/16 v6, 0x80

    .line 156
    .line 157
    and-int/2addr v5, v6

    .line 158
    if-nez v5, :cond_f

    .line 159
    .line 160
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    iput p1, v1, Lj0;->b:I

    .line 172
    .line 173
    invoke-virtual {v0, v4, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 174
    .line 175
    .line 176
    iget v5, p0, Lia;->k:I

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    if-ne v5, p1, :cond_5

    .line 180
    .line 181
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v6}, Lj0;->a(I)V

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_5
    invoke-virtual {v0, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 189
    .line 190
    .line 191
    const/16 v5, 0x40

    .line 192
    .line 193
    invoke-virtual {v1, v5}, Lj0;->a(I)V

    .line 194
    .line 195
    .line 196
    :goto_3
    iget v5, p0, Lia;->l:I

    .line 197
    .line 198
    if-ne v5, p1, :cond_6

    .line 199
    .line 200
    move p1, v2

    .line 201
    goto :goto_4

    .line 202
    :cond_6
    move p1, v7

    .line 203
    :goto_4
    if-eqz p1, :cond_7

    .line 204
    .line 205
    const/4 v5, 0x2

    .line 206
    invoke-virtual {v1, v5}, Lj0;->a(I)V

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-eqz v5, :cond_8

    .line 215
    .line 216
    invoke-virtual {v1, v2}, Lj0;->a(I)V

    .line 217
    .line 218
    .line 219
    :cond_8
    :goto_5
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 220
    .line 221
    .line 222
    iget-object p1, p0, Lia;->g:[I

    .line 223
    .line 224
    invoke-virtual {v4, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 225
    .line 226
    .line 227
    iget-object v5, p0, Lia;->d:Landroid/graphics/Rect;

    .line 228
    .line 229
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-eqz v3, :cond_9

    .line 237
    .line 238
    invoke-virtual {v1, v5}, Lj0;->d(Landroid/graphics/Rect;)V

    .line 239
    .line 240
    .line 241
    aget v3, p1, v7

    .line 242
    .line 243
    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    sub-int/2addr v3, v6

    .line 248
    aget v6, p1, v2

    .line 249
    .line 250
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    sub-int/2addr v6, v8

    .line 255
    invoke-virtual {v5, v3, v6}, Landroid/graphics/Rect;->offset(II)V

    .line 256
    .line 257
    .line 258
    :cond_9
    iget-object v3, p0, Lia;->f:Landroid/graphics/Rect;

    .line 259
    .line 260
    invoke-virtual {v4, v3}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    if-eqz v6, :cond_e

    .line 265
    .line 266
    aget v6, p1, v7

    .line 267
    .line 268
    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    sub-int/2addr v6, v7

    .line 273
    aget p1, p1, v2

    .line 274
    .line 275
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 276
    .line 277
    .line 278
    move-result v7

    .line 279
    sub-int/2addr p1, v7

    .line 280
    invoke-virtual {v3, v6, p1}, Landroid/graphics/Rect;->offset(II)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v5, v3}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    if-eqz p1, :cond_e

    .line 288
    .line 289
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v5}, Landroid/graphics/Rect;->isEmpty()Z

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    if-eqz p1, :cond_a

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_a
    invoke-virtual {v4}, Landroid/view/View;->getWindowVisibility()I

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    if-eqz p1, :cond_b

    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_b
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    :goto_6
    instance-of v3, p1, Landroid/view/View;

    .line 311
    .line 312
    if-eqz v3, :cond_d

    .line 313
    .line 314
    check-cast p1, Landroid/view/View;

    .line 315
    .line 316
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    const/4 v4, 0x0

    .line 321
    cmpg-float v3, v3, v4

    .line 322
    .line 323
    if-lez v3, :cond_e

    .line 324
    .line 325
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-eqz v3, :cond_c

    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    goto :goto_6

    .line 337
    :cond_d
    if-eqz p1, :cond_e

    .line 338
    .line 339
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 340
    .line 341
    .line 342
    :cond_e
    :goto_7
    return-object v1

    .line 343
    :cond_f
    new-instance p1, Ljava/lang/RuntimeException;

    .line 344
    .line 345
    const-string v0, "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    .line 346
    .line 347
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw p1

    .line 351
    :cond_10
    new-instance p1, Ljava/lang/RuntimeException;

    .line 352
    .line 353
    const-string v0, "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    .line 354
    .line 355
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw p1

    .line 359
    :cond_11
    new-instance p1, Ljava/lang/RuntimeException;

    .line 360
    .line 361
    const-string v0, "Callbacks must set parent bounds in populateNodeForVirtualViewId()"

    .line 362
    .line 363
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    throw p1
.end method

.method public final l(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/google/android/material/chip/Chip;->w:Landroid/graphics/Rect;

    .line 10
    .line 11
    iget-object v0, p0, Lia;->n:Lcom/google/android/material/chip/Chip;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/material/chip/Chip;->c()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Lcom/google/android/material/chip/Chip;->e:Lka;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-boolean v1, v1, Lka;->K:Z

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Lcom/google/android/material/chip/Chip;->h:Landroid/view/View$OnClickListener;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final m(ILandroid/graphics/Rect;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v3}, Lia;->l(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    new-instance v4, Le40;

    .line 16
    .line 17
    invoke-direct {v4}, Le40;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-ge v6, v7, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    check-cast v7, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-virtual {v0, v7}, Lia;->k(I)Lj0;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    check-cast v8, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    invoke-virtual {v4, v8, v7}, Le40;->c(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v6, v6, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget v3, v0, Lia;->l:I

    .line 58
    .line 59
    const/high16 v6, -0x80000000

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    if-ne v3, v6, :cond_1

    .line 63
    .line 64
    move-object v3, v7

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v4, v3, v7}, Le40;->b(ILjava/lang/Integer;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Lj0;

    .line 71
    .line 72
    :goto_1
    sget-object v8, Lia;->p:Lvh;

    .line 73
    .line 74
    sget-object v9, Lia;->q:Lvh;

    .line 75
    .line 76
    iget-object v10, v0, Lia;->i:Lcom/google/android/material/chip/Chip;

    .line 77
    .line 78
    const/4 v11, 0x2

    .line 79
    const/4 v13, 0x1

    .line 80
    if-eq v1, v13, :cond_15

    .line 81
    .line 82
    if-eq v1, v11, :cond_15

    .line 83
    .line 84
    const/16 v11, 0x82

    .line 85
    .line 86
    const/16 v14, 0x42

    .line 87
    .line 88
    const/16 v15, 0x21

    .line 89
    .line 90
    const/16 v7, 0x11

    .line 91
    .line 92
    if-eq v1, v7, :cond_2

    .line 93
    .line 94
    if-eq v1, v15, :cond_2

    .line 95
    .line 96
    if-eq v1, v14, :cond_2

    .line 97
    .line 98
    if-ne v1, v11, :cond_3

    .line 99
    .line 100
    :cond_2
    move/from16 v17, v13

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 104
    .line 105
    const-string v2, "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 106
    .line 107
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v1

    .line 111
    :goto_2
    new-instance v13, Landroid/graphics/Rect;

    .line 112
    .line 113
    invoke-direct {v13}, Landroid/graphics/Rect;-><init>()V

    .line 114
    .line 115
    .line 116
    iget v5, v0, Lia;->l:I

    .line 117
    .line 118
    const-string v12, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 119
    .line 120
    if-eq v5, v6, :cond_4

    .line 121
    .line 122
    invoke-virtual {v0, v5}, Lia;->n(I)Lj0;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v2, v13}, Lj0;->d(Landroid/graphics/Rect;)V

    .line 127
    .line 128
    .line 129
    :goto_3
    const/4 v10, -0x1

    .line 130
    goto :goto_4

    .line 131
    :cond_4
    if-eqz v2, :cond_5

    .line 132
    .line 133
    invoke-virtual {v13, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    invoke-virtual {v10}, Landroid/view/View;->getHeight()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eq v1, v7, :cond_9

    .line 146
    .line 147
    if-eq v1, v15, :cond_8

    .line 148
    .line 149
    if-eq v1, v14, :cond_7

    .line 150
    .line 151
    if-ne v1, v11, :cond_6

    .line 152
    .line 153
    const/4 v5, 0x0

    .line 154
    const/4 v10, -0x1

    .line 155
    invoke-virtual {v13, v5, v10, v2, v10}, Landroid/graphics/Rect;->set(IIII)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 160
    .line 161
    invoke-direct {v1, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v1

    .line 165
    :cond_7
    const/4 v2, 0x0

    .line 166
    const/4 v10, -0x1

    .line 167
    invoke-virtual {v13, v10, v2, v10, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_8
    const/4 v6, 0x0

    .line 172
    const/4 v10, -0x1

    .line 173
    invoke-virtual {v13, v6, v5, v2, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_9
    const/4 v6, 0x0

    .line 178
    const/4 v10, -0x1

    .line 179
    invoke-virtual {v13, v2, v6, v2, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 180
    .line 181
    .line 182
    :goto_4
    new-instance v2, Landroid/graphics/Rect;

    .line 183
    .line 184
    invoke-direct {v2, v13}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 185
    .line 186
    .line 187
    if-eq v1, v7, :cond_d

    .line 188
    .line 189
    if-eq v1, v15, :cond_c

    .line 190
    .line 191
    if-eq v1, v14, :cond_b

    .line 192
    .line 193
    if-ne v1, v11, :cond_a

    .line 194
    .line 195
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    add-int/lit8 v5, v5, 0x1

    .line 200
    .line 201
    neg-int v5, v5

    .line 202
    const/4 v6, 0x0

    .line 203
    invoke-virtual {v2, v6, v5}, Landroid/graphics/Rect;->offset(II)V

    .line 204
    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 208
    .line 209
    invoke-direct {v1, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v1

    .line 213
    :cond_b
    const/4 v6, 0x0

    .line 214
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    add-int/lit8 v5, v5, 0x1

    .line 219
    .line 220
    neg-int v5, v5

    .line 221
    invoke-virtual {v2, v5, v6}, Landroid/graphics/Rect;->offset(II)V

    .line 222
    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_c
    const/4 v6, 0x0

    .line 226
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    add-int/lit8 v5, v5, 0x1

    .line 231
    .line 232
    invoke-virtual {v2, v6, v5}, Landroid/graphics/Rect;->offset(II)V

    .line 233
    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_d
    const/4 v6, 0x0

    .line 237
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    add-int/lit8 v5, v5, 0x1

    .line 242
    .line 243
    invoke-virtual {v2, v5, v6}, Landroid/graphics/Rect;->offset(II)V

    .line 244
    .line 245
    .line 246
    :goto_5
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    iget v5, v4, Le40;->c:I

    .line 250
    .line 251
    new-instance v7, Landroid/graphics/Rect;

    .line 252
    .line 253
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 254
    .line 255
    .line 256
    move v9, v6

    .line 257
    const/16 v16, 0x0

    .line 258
    .line 259
    :goto_6
    if-ge v9, v5, :cond_14

    .line 260
    .line 261
    iget-object v11, v4, Le40;->b:[Ljava/lang/Object;

    .line 262
    .line 263
    aget-object v11, v11, v9

    .line 264
    .line 265
    check-cast v11, Lj0;

    .line 266
    .line 267
    if-ne v11, v3, :cond_e

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_e
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v11, v7}, Lj0;->d(Landroid/graphics/Rect;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v1, v13, v7}, Lip;->B(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    if-nez v12, :cond_f

    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_f
    invoke-static {v1, v13, v2}, Lip;->B(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    if-nez v12, :cond_10

    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_10
    invoke-static {v1, v13, v7, v2}, Lip;->j(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 291
    .line 292
    .line 293
    move-result v12

    .line 294
    if-eqz v12, :cond_11

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_11
    invoke-static {v1, v13, v2, v7}, Lip;->j(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 298
    .line 299
    .line 300
    move-result v12

    .line 301
    if-eqz v12, :cond_12

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_12
    invoke-static {v1, v13, v7}, Lip;->D(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 305
    .line 306
    .line 307
    move-result v12

    .line 308
    invoke-static {v1, v13, v7}, Lip;->E(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 309
    .line 310
    .line 311
    move-result v14

    .line 312
    mul-int/lit8 v15, v12, 0xd

    .line 313
    .line 314
    mul-int/2addr v15, v12

    .line 315
    mul-int/2addr v14, v14

    .line 316
    add-int/2addr v14, v15

    .line 317
    invoke-static {v1, v13, v2}, Lip;->D(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 318
    .line 319
    .line 320
    move-result v12

    .line 321
    invoke-static {v1, v13, v2}, Lip;->E(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 322
    .line 323
    .line 324
    move-result v15

    .line 325
    mul-int/lit8 v17, v12, 0xd

    .line 326
    .line 327
    mul-int v17, v17, v12

    .line 328
    .line 329
    mul-int/2addr v15, v15

    .line 330
    add-int v15, v15, v17

    .line 331
    .line 332
    if-ge v14, v15, :cond_13

    .line 333
    .line 334
    :goto_7
    invoke-virtual {v2, v7}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 335
    .line 336
    .line 337
    move-object/from16 v16, v11

    .line 338
    .line 339
    :cond_13
    :goto_8
    add-int/lit8 v9, v9, 0x1

    .line 340
    .line 341
    goto :goto_6

    .line 342
    :cond_14
    move v2, v10

    .line 343
    :goto_9
    move-object/from16 v1, v16

    .line 344
    .line 345
    goto/16 :goto_10

    .line 346
    .line 347
    :cond_15
    move/from16 v17, v13

    .line 348
    .line 349
    const/4 v2, -0x1

    .line 350
    const/4 v6, 0x0

    .line 351
    sget-object v5, Lja0;->a:Ljava/util/WeakHashMap;

    .line 352
    .line 353
    invoke-static {v10}, Lt90;->d(Landroid/view/View;)I

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    move/from16 v7, v17

    .line 358
    .line 359
    if-ne v5, v7, :cond_16

    .line 360
    .line 361
    const/4 v5, 0x1

    .line 362
    goto :goto_a

    .line 363
    :cond_16
    move v5, v6

    .line 364
    :goto_a
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    iget v7, v4, Le40;->c:I

    .line 368
    .line 369
    new-instance v9, Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-direct {v9, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 372
    .line 373
    .line 374
    move v10, v6

    .line 375
    :goto_b
    if-ge v10, v7, :cond_17

    .line 376
    .line 377
    iget-object v12, v4, Le40;->b:[Ljava/lang/Object;

    .line 378
    .line 379
    aget-object v12, v12, v10

    .line 380
    .line 381
    check-cast v12, Lj0;

    .line 382
    .line 383
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    add-int/lit8 v10, v10, 0x1

    .line 387
    .line 388
    goto :goto_b

    .line 389
    :cond_17
    new-instance v7, Lsk;

    .line 390
    .line 391
    invoke-direct {v7, v8, v5}, Lsk;-><init>(Lvh;Z)V

    .line 392
    .line 393
    .line 394
    invoke-static {v9, v7}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 395
    .line 396
    .line 397
    const/4 v7, 0x1

    .line 398
    if-eq v1, v7, :cond_1b

    .line 399
    .line 400
    if-ne v1, v11, :cond_1a

    .line 401
    .line 402
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-nez v3, :cond_18

    .line 407
    .line 408
    move v10, v2

    .line 409
    goto :goto_c

    .line 410
    :cond_18
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    :goto_c
    add-int/2addr v10, v7

    .line 415
    if-ge v10, v1, :cond_19

    .line 416
    .line 417
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    goto :goto_f

    .line 422
    :cond_19
    const/4 v7, 0x0

    .line 423
    goto :goto_f

    .line 424
    :cond_1a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 425
    .line 426
    const-string v2, "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."

    .line 427
    .line 428
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    throw v1

    .line 432
    :cond_1b
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    if-nez v3, :cond_1c

    .line 437
    .line 438
    :goto_d
    const/16 v17, 0x1

    .line 439
    .line 440
    goto :goto_e

    .line 441
    :cond_1c
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    goto :goto_d

    .line 446
    :goto_e
    add-int/lit8 v1, v1, -0x1

    .line 447
    .line 448
    if-ltz v1, :cond_19

    .line 449
    .line 450
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v7

    .line 454
    :goto_f
    move-object/from16 v16, v7

    .line 455
    .line 456
    check-cast v16, Lj0;

    .line 457
    .line 458
    goto :goto_9

    .line 459
    :goto_10
    if-nez v1, :cond_1d

    .line 460
    .line 461
    const/high16 v6, -0x80000000

    .line 462
    .line 463
    goto :goto_13

    .line 464
    :cond_1d
    move v5, v6

    .line 465
    :goto_11
    iget v3, v4, Le40;->c:I

    .line 466
    .line 467
    if-ge v5, v3, :cond_1f

    .line 468
    .line 469
    iget-object v3, v4, Le40;->b:[Ljava/lang/Object;

    .line 470
    .line 471
    aget-object v3, v3, v5

    .line 472
    .line 473
    if-ne v3, v1, :cond_1e

    .line 474
    .line 475
    move v12, v5

    .line 476
    goto :goto_12

    .line 477
    :cond_1e
    add-int/lit8 v5, v5, 0x1

    .line 478
    .line 479
    goto :goto_11

    .line 480
    :cond_1f
    move v12, v2

    .line 481
    :goto_12
    iget-object v1, v4, Le40;->a:[I

    .line 482
    .line 483
    aget v6, v1, v12

    .line 484
    .line 485
    :goto_13
    invoke-virtual {v0, v6}, Lia;->o(I)Z

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    return v1
.end method

.method public final n(I)Lj0;
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_3

    .line 3
    .line 4
    iget-object p1, p0, Lia;->i:Lcom/google/android/material/chip/Chip;

    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lj0;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lj0;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lja0;->a:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/google/android/material/chip/Chip;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lia;->l(Ljava/util/ArrayList;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lez v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-gtz v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    const-string v0, "Views cannot have both real and virtual children"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, 0x0

    .line 54
    :goto_1
    if-ge v3, v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget-object v5, v1, Lj0;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 67
    .line 68
    invoke-virtual {v5, p1, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    return-object v1

    .line 75
    :cond_3
    invoke-virtual {p0, p1}, Lia;->k(I)Lj0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method

.method public final o(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lia;->i:Lcom/google/android/material/chip/Chip;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v0, p0, Lia;->l:I

    .line 17
    .line 18
    if-ne v0, p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/high16 v1, -0x80000000

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lia;->j(I)Z

    .line 26
    .line 27
    .line 28
    :cond_2
    if-ne p1, v1, :cond_3

    .line 29
    .line 30
    :goto_0
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :cond_3
    iput p1, p0, Lia;->l:I

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    if-ne p1, v0, :cond_4

    .line 36
    .line 37
    iget-object v1, p0, Lia;->n:Lcom/google/android/material/chip/Chip;

    .line 38
    .line 39
    iput-boolean v0, v1, Lcom/google/android/material/chip/Chip;->m:Z

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/view/View;->refreshDrawableState()V

    .line 42
    .line 43
    .line 44
    :cond_4
    const/16 v1, 0x8

    .line 45
    .line 46
    invoke-virtual {p0, p1, v1}, Lia;->p(II)V

    .line 47
    .line 48
    .line 49
    return v0
.end method

.method public final p(II)V
    .locals 5

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lia;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lia;->i:Lcom/google/android/material/chip/Chip;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    const/4 v2, -0x1

    .line 25
    if-eq p1, v2, :cond_4

    .line 26
    .line 27
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p0, p1}, Lia;->n(I)Lj0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lj0;->e()Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object v2, v2, Lj0;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isScrollable()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isPassword()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isEnabled()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    if-eqz v3, :cond_2

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 101
    .line 102
    const-string p2, "Callbacks must add text or a content description in populateEventForVirtualViewId()"

    .line 103
    .line 104
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_3
    :goto_0
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getClassName()Ljava/lang/CharSequence;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {p2, v2}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p2, v0, p1}, Ln0;->a(Landroid/view/accessibility/AccessibilityRecord;Landroid/view/View;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_4
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {v0, p2}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 135
    .line 136
    .line 137
    :goto_1
    invoke-interface {v1, v0, p2}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 138
    .line 139
    .line 140
    :cond_5
    :goto_2
    return-void
.end method
